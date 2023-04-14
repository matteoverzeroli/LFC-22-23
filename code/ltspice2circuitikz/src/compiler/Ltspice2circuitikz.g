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
		componentRule* {System.out.println("Ho riconosciuto component rule");}
		EOF
	;
prologueRule
	:	versionRule
		sheetRule
	;
versionRule
	:	
		VERSION 
		ver = INTEGER{h.checkVersion($ver);}
	;
	
sheetRule
	:	
		SHEET INTEGER INTEGER INTEGER
	;
	
componentRule
	:	wireRule {System.out.println("sto riconoscendo wirerule");}
		| symbolRule {System.out.println("sto riconoscendo symbol");}
		| symattrRule{System.out.println("sto riconoscendo symattr");}
		| flagRule{System.out.println("sto riconoscendo flag");}
		| windowRule{System.out.println("sto riconoscendo window");}
		| iopinRule{System.out.println("sto riconoscendo iopin");}
	;
wireRule
	:
		WIRE INTEGER INTEGER INTEGER INTEGER
	;
	
flagRule
	:	
		FLAG INTEGER INTEGER (INTEGER | ID | reservedWordRule) //ID non può contenere spazio in questo caso
	;
	
windowRule
	:	
		WINDOW 
		INTEGER 
		INTEGER 
		INTEGER 
		id = ID {h.checkWindowsOptions($id);}
		INTEGER
	;
iopinRule
	:
		IOPIN
		INTEGER
		INTEGER
		id = ID {h.checkIOPinAttr($id);}
	;
symbolRule
	:
		SYMBOL 
		symbolType = ID {h.checkSymbolType($symbolType);}
		INTEGER 
		INTEGER 
		rotType = ID {h.checkRotType($rotType);}
	;
symattrRule
	:	
		SYMATTR id1 = ID {h.checkSymMattrAttr($id1);} 
			(id2  = ID {h.checkSymMattrAttrValue($id1, $id2);} (attrRuleNoId attrRule*)?
			| INTEGER {h.checkSymMattrAttrValue($id1, "int");}
			| FLOAT {h.checkSymMattrAttrValue($id1, "float");}
			| reservedWordRule {h.checkSymMattrAttrValue($id1, "reserved");})
	
		/*SYMATTR ( INSTNAME ID
			| DESCRIPTION ID //description attribute
			| TYPE ID //sybol type
			| VALUE (INTEGER | FLOAT | ID | reservedWordRule)
			| SPICELINE attrRule+)*/
	;
attrRuleNoId
	:
		ASSIGN
		(INTEGER | FLOAT | STRING | ID | reservedWordRule)
	;
attrRule
	: 	ID	 //TODO:ancora da controllore quali attributi sono consentiti ATTENZIONE (CAPATTRIBUTE | PARATTRIBUTE | RATTRIBUTE | INDATTRIBUTE)
		ASSIGN
		(INTEGER | FLOAT | STRING | ID | reservedWordRule)
		
;

reservedWordRule
	:	
		VERSION | SHEET | WIRE | FLAG | WINDOW | SYMBOL | SYMATTR | ASSIGN | IOPIN
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


