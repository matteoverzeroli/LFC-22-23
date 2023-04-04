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
}
parseCircuit:	prologueRule	{System.out.println("Ho riconosciuto prolog rule");}
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
		WINDOW INTEGER INTEGER INTEGER ID INTEGER
	;

symbolRule
	:
		SYMBOL SYMBOLTYPE INTEGER INTEGER ID
	;
symattrRule
	:
		SYMATTR ( INSTNAME ID
			| DESCRIPTION DESCRIPTIONATTR
			| TYPE SYMBOLTYPE
			| VALUE (INTEGER | FLOAT | ID | reservedWordRule)
			| SPICELINE attrRule+)
	;
	
attrRule
	:
		(CAPATTRIBUTE | PARATTRIBUTE | RATTRIBUTE | INDATTRIBUTE)
		 ASSIGN
		(INTEGER | FLOAT | STRING | ID | reservedWordRule)
;

reservedWordRule
	:	
		VERSION | SHEET | WIRE | FLAG | WINDOW | SYMBOL | SYMATTR | ASSIGN
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

VERSION:		'Version';
SHEET:		'SHEET';
INTEGER:		('-')?DIGIT+;
FLOAT
    :   DIGIT+ '.' DIGIT* EXPONENT?
    |   '.' DIGIT+ EXPONENT?
    |   DIGIT+ EXPONENT
    ;
WIRE:		'WIRE';
SYMBOL	:	'SYMBOL';
SYMBOLTYPE:	'res' 
		| 'res2'
		| 'cap'
		| 'ind' 
		| 'ind2'
		| 'diode'	
		| 'schottky'
		| 'zener'
		| 'varactor'
		| 'LED'
		| 'TVSdiode'
		| 'pnp'
		| 'pnp2'
		| 'pnp4'
		| 'npn'
		| 'npn2'
		| 'npn3'
		| 'npn4'
		| 'voltage'
		| 'current'
		| 'nmos'
		| 'pmos'
		| 'polcap';
SYMATTR	:	'SYMATTR';
INSTNAME:	'InstName';
VALUE	:	'Value';
SPICELINE :	'SpiceLine';
ASSIGN	:	'=';

WINDOW 	:	'WINDOW';

RATTRIBUTE:	'tol'
		|'pwr';
PARATTRIBUTE:	'Rser' //un voltage può avere un Rser
		| 'Rpar'
		| 'Cpar';
CAPATTRIBUTE:	'V' // + PARATTRIBUTE
		| 'Irms'
		| 'Lser'
		| 'mfg'
		| 'pn'
		| 'type';
INDATTRIBUTE:	'Ipk'; //+ PARATTRIBUTE

DESCRIPTION:	'Description';
TYPE	:	'Type';
DESCRIPTIONATTR:	'Diode'
		| 'Capacitor'; // TODO: N.B. controlli semantici da vedere
		
FLAG 	:	'FLAG';
IOPIN	:	'IOPIN';
IOPINATT:	'In'
		| 'Out'
		| 'BiDir';
	
WS  :   ( ' '
        | '\t'
        | '\r'
        | '\n'
        )+ {$channel=HIDDEN;}
    ;
    
STRING	:	'"' ~('"')* '"';
ID	:	(LETTER | DIGIT | SPECIALCHAR)(LETTER | DIGIT | SPECIALCHAR)*;


