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
parseCircuit:	prologueRule
		componentRule* {System.out.println("Ho riconosciuto component rule");};
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
		FLAG INTEGER INTEGER (INTEGER | ID) 
	;
	
windowRule
	:	
		WINDOW INTEGER INTEGER INTEGER WINDOWOPTION INTEGER
	;

symbolRule
	:
		SYMBOL SYMBOLTYPE INTEGER INTEGER (ROTTYPE | MIRRORTYPE)
	;
symattrRule
	:
		SYMATTR ( INSTNAME ID
			| DESCRIPTION DESCRIPTIONATTR
			| TYPE SYMBOLTYPE
			| VALUE (  INTEGER 
				 | FLOAT 
				 | ID)
			| SPICELINE attrRule+)
	;
	
attrRule
	:
		(CAPATTRIBUTE | PARATTRIBUTE | RATTRIBUTE | INDATTRIBUTE)
		 ASSIGN
		(INTEGER | FLOAT | STRING | ID)
;


fragment 
LETTER : 'a'..'z'|'A'..'Z';
fragment 
DIGIT : '0'..'9';
fragment
EXPONENT : ('e'|'E') ('+'|'-')? ('0'..'9')+ ;

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
ROTTYPE	:	'R0' 
		| 'R90' 
		| 'R180' 
		| 'R270';
MIRRORTYPE	: 'M0' 
		| 'M90' 
		| 'M180' 
		| 'M270';
SYMATTR	:	'SYMATTR';
INSTNAME:	'InstName';
VALUE	:	'Value';
SPICELINE :	'SpiceLine';
ASSIGN	:	'=';

WINDOW 	:	'WINDOW';
WINDOWOPTION:	'Invisibile' //label invisible
		| 'Center' //label justification
		| 'Left'
		| 'Right'
		| 'Top'
		| 'Bottom'
		| 'VCenter' //vertical label justification
		| 'VLeft'
		| 'VRight'
		| 'VTop'
		| 'VBottom';

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
	
//TODO: unità di misura tipo mu come le gestiamo?
WS  :   ( ' '
        | '\t'
        | '\r'
        | '\n'
        )+ {$channel=HIDDEN;}
    ;
    
STRING	:	'"' ~('"')* '"'; //TODO 
ID	:	(LETTER | DIGIT | '-')(LETTER | DIGIT | '-')*;		//_ va una sottolineatura sopra


