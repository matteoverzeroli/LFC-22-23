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
	:	versionRule //Controllo semantico che sia 4
		sheetRule
	;
versionRule
	:	
		VERSION INTEGER
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
		WINDOW INTEGER INTEGER INTEGER ID INTEGER //id=windowsoption
	;
iopinRule
	:
		IOPIN INTEGER INTEGER ID //iopinattribute	
	;
symbolRule
	:
		SYMBOL ID INTEGER INTEGER ID //id1 = symboltype id2=rot|mirror type
	;
symattrRule
	:
		SYMATTR ( INSTNAME ID
			| DESCRIPTION ID //description attribute
			| TYPE ID //sybol type
			| VALUE (INTEGER | FLOAT | ID | reservedWordRule)
			| SPICELINE attrRule+)
	;
	
attrRule
	: 	attr = ID {h.checkAttribute($attr); } //(CAPATTRIBUTE | PARATTRIBUTE | RATTRIBUTE | INDATTRIBUTE)
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
    
    
//KEYWORD
VERSION:		'Version';
SHEET:		'SHEET';
WIRE:		'WIRE';
SYMBOL	:	'SYMBOL';
SYMATTR	:	'SYMATTR';
ASSIGN	:	'=';
WINDOW 	:	'WINDOW';
FLAG 	:	'FLAG';
IOPIN	:	'IOPIN';


//da riportare come id
DESCRIPTION:	'Description';
TYPE	:	'Type';
VALUE	:	'Value';
INSTNAME:	'InstName';
SPICELINE :	'SpiceLine';
	
WS  :   ( ' '
        | '\t'
        | '\r'
        | '\n'
        )+ {$channel=HIDDEN;}
    ;
    
STRING	:	'"' ~('"')* '"';

ID	:	(LETTER | DIGIT | SPECIALCHAR)(LETTER | DIGIT | SPECIALCHAR)*;

ERROR_TK		: . ; 


