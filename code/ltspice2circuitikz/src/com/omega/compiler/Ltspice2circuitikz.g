grammar Ltspice2circuitikz;

options {
	language = Java;
	k=1;
}

@lexer::header {
package com.omega.compiler;
}
@header{
package com.omega.compiler;
}

@members {
	Handler h;
	
	
	public Handler getHandler () {
		return h;
	}
	
	// Override of syntax error handler
	public void displayRecognitionError(String[] tokenNames,
	                                     RecognitionException e) {

		String hdr = " * " + getErrorHeader(e);
		String msg = " - " + getErrorMessage(e, tokenNames);
		
		// takes the token which throw exception
		Token tk = e.token;
		
		h.handleError(tk, hdr, msg);
	}
	
	void initParser () {
		h = new Handler(input);
	}
}
parseCircuit
@init {initParser();}
	:	
		prologueRule
		componentRule*
		EOF {h.endOfFileChecks();}  
	;
prologueRule 
	:	versionRule
		sheetRule
	;
versionRule 
	:	
		v=VERSION 
		ver = INTEGER {h.checkVersion(v, ver);}
	;
	
sheetRule
	:	
		s=SHEET i1=INTEGER i2=INTEGER i3=INTEGER {h.appendRuleToStream(false, true, true, s, i1, i2, i3);}
	;
	
componentRule
	:	wireRule
		| symbol = symbolRule
		| symattrRule
		| flagRule
		| windowRule
		| iopinRule
	;
wireRule
	:
		w=WIRE i1=INTEGER i2=INTEGER i3=INTEGER i4=INTEGER {h.handleWire(w, i1, i2, i3, i4);}
	;
	
flagRule
	:	
		f=FLAG i1=INTEGER i2=INTEGER v=(INTEGER | ID | reservedWordRule) {h.handleFlag(f, i1, i2, v);}
	;
	
windowRule
	:	
		w=WINDOW 
		i1=INTEGER 
		i2=INTEGER 
		i3=INTEGER 
		id = ID
		i4=INTEGER
		{h.checkWindowsOptions(id, w, i1, i2, i3, i4);}
	;
iopinRule
	:
		i=IOPIN
		i1=INTEGER
		i2=INTEGER
		id = ID 
		{h.checkIOPinAttr(id, i, i1, i2);}
		
	;
symbolRule returns[Token symbol]
	:
		s=SYMBOL 
		symbolType = ID {h.checkSymbolType(symbolType); symbol = symbolType;}
		i1=INTEGER 
		i2=INTEGER 
		rotType = ID  {h.checkRotType(rotType, s, symbolType, i1, i2);}
	;
symattrRule
	:	
	    	s=SYMATTR id1=ID {h.checkSymMattrAttr(id1, s);} 
			( id2=ID {h.checkSymMattrAttrValue(id1, id2, null);} 
				( id3=ID {h.checkPolarizedCapacitor(id1, id2, id3);}
				| (attrRuleNoId attrRule[id1]*)?)
			| i=INTEGER {h.checkSymMattrAttrValue(id1, "int", i);}
			| f=FLOAT {h.checkSymMattrAttrValue(id1, "float", f);}
			| r = reservedWordRule {h.checkSymMattrAttrValue(id1, "reserved", r);})
		{h.appendRuleToStream(false, false, true);}
	
		/*SYMATTR ( INSTNAME ID
			| DESCRIPTION ID //description attribute
			| TYPE ID //sybol type
			| VALUE (INTEGER | FLOAT | ID | reservedWordRule)
			| SPICELINE attrRule+)*/
	;
attrRuleNoId
	:
		a=ASSIGN
		v=(INTEGER | FLOAT | STRING | ID | reservedWordRule)
		{h.appendRuleToStream(false, false, false, a, v);}
	;
attrRule [Token id1]
	: 	
		id2 = ID {h.checkSymMattrAttrValue(id1, id2, null);}
		a=ASSIGN
		v=(INTEGER | FLOAT | STRING | ID | reservedWordRule)
		{h.appendRuleToStream(false, false, false, a, v);}
		
	;

reservedWordRule returns [Token word]
	:	
		v=(VERSION | SHEET | WIRE | FLAG | WINDOW | SYMBOL | SYMATTR | ASSIGN | IOPIN)
		{word = v; h.appendRuleToStream(true, false, false, v);}
	;

fragment 
LETTER : 'a'..'z'|'A'..'Z';
fragment 
DIGIT : '0'..'9';
fragment
EXPONENT : ('e'|'E') ('+'|'-')? ('0'..'9')+ ;
fragment
SPECIALCHAR: '\u0021'..'\u002F' |'\u003A'..'\u003C'|'\u003E'..'\u0040'|'\u005B'..'\u0060' //punctuation and symbols. '=' removed for STRING TOKEN
	     |'\u007B'..'\u007E'|'\u00A1'..'\u017F' //latin punctuation and symbols
	     |'\u0370'..'\u03FF' //greek alphabet
	     |'\u0400'..'\u04FF' //cirillico   
	     ;
	     
/* case insensitive lexer matching */
fragment A:('a'|'A');
fragment B:('b'|'B');
fragment C:('c'|'C');
fragment D:('d'|'D');
fragment E:('e'|'E');
fragment F:('f'|'F');
fragment G:('g'|'G');
fragment H:('h'|'H');
fragment I:('i'|'I');
fragment J:('j'|'J');
fragment K:('k'|'K');
fragment L:('l'|'L');
fragment M:('m'|'M');
fragment N:('n'|'N');
fragment O:('o'|'O');
fragment P:('p'|'P');
fragment Q:('q'|'Q');
fragment R:('r'|'R');
fragment S:('s'|'S');
fragment T:('t'|'T');
fragment U:('u'|'U');
fragment V:('v'|'V');
fragment W:('w'|'W');
fragment X:('x'|'X');
fragment Y:('y'|'Y');
fragment Z:('z'|'Z');

INTEGER:		('-')?DIGIT+;
FLOAT
    :   DIGIT+ '.' DIGIT* EXPONENT?
    |   '.' DIGIT+ EXPONENT?
    |   DIGIT+ EXPONENT
    ;
    
    
//KEYWORD 
VERSION	:	V E R S I O N ;//'Version' | 'version';
SHEET	:	S H E E T;
WIRE	:	W I R E;
SYMBOL	:	S Y M B O L;
SYMATTR	:	S Y M A T T R;
ASSIGN	:	'=';
WINDOW 	:	W I N D O W;
FLAG 	:	F L A G;
IOPIN	:	I O P I N;
	
WS  :   ( ' '
        | '\t'
        | '\r'
        | '\n'
        )+ {$channel=HIDDEN;}
    ;
    
STRING	:	'"' ~('"')* '"';

ID	:	(LETTER | DIGIT | SPECIALCHAR)(LETTER | DIGIT | SPECIALCHAR)*;

ERROR_TK		: . ; 

