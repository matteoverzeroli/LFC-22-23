grammar Ltspice2circuitikz;

options {
	language = Java;
	k=1;
}

@lexer::header {
package compiler;
}
@header{
package compiler;
}

@members {
	Handler h;
	
	
	public Handler getHandler () {
		return h;
	}
	
	// Override e delega nella gestione degli errori sintattici
	public void displayRecognitionError(String[] tokenNames,
	                                     RecognitionException e) {
	  	// recupero alcune meta informazioni relative all'errore
		String hdr = " * " + getErrorHeader(e);
		String msg = " - " + getErrorMessage(e, tokenNames);
		
		// recuperoil token corrente  
		Token tk = input.LT(1);
		
		// lascio gestire il messaggio all'handler
		h.handleError(tk, hdr, msg);
	}
	
	void initParser () {
		h = new Handler(input);
	}	
}
parseCircuit
@init {initParser();}
	:	
		prologueRule	{System.out.println("Ho riconosciuto prolog rule");}
		componentRule* {h.checkMandatoryAttribute(); System.out.println("Ho riconosciuto component rule"); }
		EOF
	;
prologueRule 
	:	versionRule
		sheetRule
	;
versionRule 
	:	
		v=VERSION 
		ver = INTEGER
		{ 
			h.checkVersion($ver); 
			h.appendRuleToStream(true, v, ver);
		}
	;
	
sheetRule
	:	
		s=SHEET i1=INTEGER i2=INTEGER i3=INTEGER
		{h.appendRuleToStream(true, s, i1, i2, i3);}
	;
	
componentRule
	:	wireRule {System.out.println("sto riconoscendo wirerule");}
		| symbol = symbolRule {System.out.println("sto riconoscendo symbol"); h.checkMandatoryAttribute(); h.setLastSymbol(symbol);}
		| symattrRule {System.out.println("sto riconoscendo symattr");}
		| flagRule{System.out.println("sto riconoscendo flag");}
		| windowRule{System.out.println("sto riconoscendo window");}
		| iopinRule{System.out.println("sto riconoscendo iopin");}
	;
wireRule
	:
		w=WIRE i1=INTEGER i2=INTEGER i3=INTEGER i4=INTEGER
		{h.appendRuleToStream(true,w, i1, i2, i3, i4);}
	;
	
flagRule
	:	
		f=FLAG i1=INTEGER i2=INTEGER v=(INTEGER | ID | reservedWordRule) //ID non può contenere spazio in questo caso
		{h.appendRuleToStream(true, f, i1, i2, v);}
	;
	
windowRule
	:	
		w=WINDOW 
		i1=INTEGER 
		i2=INTEGER 
		i3=INTEGER 
		id = ID {h.checkWindowsOptions($id);}
		i4=INTEGER
		{h.appendRuleToStream(true, w, i1, i2, i3, id, i4);}
	;
iopinRule
	:
		i=IOPIN
		i1=INTEGER
		i2=INTEGER
		id = ID 
		{
			h.checkIOPinAttr($id);
			h.appendRuleToStream(true,i, i1, i2, id);
		}
		
	;
symbolRule returns[Token symbol]
	:
		s=SYMBOL 
		symbolType = ID {h.checkSymbolType($symbolType); symbol = $symbolType;}
		i1=INTEGER 
		i2=INTEGER 
		rotType = ID 
		{
			h.checkRotType($rotType);
			h.appendRuleToStream(true, s, symbolType, i1, i2, rotType);
		}
	;
symattrRule//TODO da controllare
	:	
		s=SYMATTR id1=ID {h.checkSymMattrAttr($id1);h.appendRuleToStream(false, s, id1);} 
			(id2=ID {h.checkSymMattrAttrValue($id1, $id2);h.appendRuleToStream(false, id2);} (attrRuleNoId attrRule[$id1]*)?
			| i=INTEGER {h.checkSymMattrAttrValue($id1, "int");h.appendRuleToStream(false, i);} //non ci va lo spazio
			| f=FLOAT {h.checkSymMattrAttrValue($id1, "float");h.appendRuleToStream(false, f);} //non ci va lo spazio
			| r=reservedWordRule {h.checkSymMattrAttrValue($id1, "reserved");})
		{h.appendRuleToStream(true);}
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
		{h.appendRuleToStream(false, a, v);}
	;
attrRule [Token id1]
	: 	
		id2 = ID {h.checkSymMattrAttrValue(id1, $id2);} 
		a=ASSIGN
		v=(INTEGER | FLOAT | STRING | ID | reservedWordRule)
		{h.appendRuleToStream(false, id2, a, v);}
		
;

reservedWordRule 
	:	
		v=(VERSION | SHEET | WIRE | FLAG | WINDOW | SYMBOL | SYMATTR | ASSIGN | IOPIN)
		{h.appendRuleToStream(false, v);}
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

INTEGER:		('-')?DIGIT+;
FLOAT
    :   DIGIT+ '.' DIGIT* EXPONENT?
    |   '.' DIGIT+ EXPONENT?
    |   DIGIT+ EXPONENT
    ;
    
    
//KEYWORD //todo:funziona anche con altre combinazioni maiuscole minuscole 
VERSION:		'Version' | 'version';
SHEET:		'SHEET' | 'sheet';
WIRE:		'WIRE' | 'wire';
SYMBOL	:	'SYMBOL' | 'symbol';
SYMATTR	:	'SYMATTR' | 'symattr';
ASSIGN	:	'=';
WINDOW 	:	'WINDOW' | 'windows';
FLAG 	:	'FLAG' | 'flag';
IOPIN	:	'IOPIN' | 'iopin';
	
WS  :   ( ' '
        | '\t'
        | '\r'
        | '\n'
        )+ {$channel=HIDDEN;}
    ;
    
STRING	:	'"' ~('"')* '"';

ID	:	(LETTER | DIGIT | SPECIALCHAR)(LETTER | DIGIT | SPECIALCHAR)*;

ERROR_TK		: . ; 


