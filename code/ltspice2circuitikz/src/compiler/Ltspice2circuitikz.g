lexer grammar Ltspice2circuitikz;

options {
	language = Java;
}

@lexer::header {
	package compiler;
}

@members {
}

fragment 
LETTER : 'a'..'z'|'A'..'Z';
fragment 
DIGIT : '0'..'9';
fragment
EXPONENT : ('e'|'E') ('+'|'-')? ('0'..'9')+ ;

VERSION:		'Version';
VERSIONNUM:	'4';
SHEET:		'SHEET';
POSINTEGER:	DIGIT+;
NEGINTEGER:	'-'DIGIT+;
FLOAT
    :   DIGIT+ '.' DIGIT* EXPONENT?
    |   '.' DIGIT+ EXPONENT?
    |   DIGIT+ EXPONENT
    ;
WIRE:		'WIRE';
SYMBOL	:	'SYMBOL';
SYMBOLTYPE:	'res' 
		| 'cap'
		| 'ind' 
		| 'nmos'
		| 'pmos';	
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
TOL	:	'tol';
PWR	:	'pwr';
ASSIGN	:	'=';

WINDOW 	:	'WINDOW';
WINDOWOPITON:	'Invisibile' //label invisible
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
CAPATTRIBUTE:	'V'
		| 'Irms'
		| 'Rser'
		| 'Lser'
		| 'Rpar'
		| 'Cpar'
		| 'mfg'
		| 'pn'
		| 'type';
		
//TODO: unità di misura tipo mu come le gestiamo?
WS  :   ( ' '
        | '\t'
        | '\r'
        | '\n'
        )+ {$channel=HIDDEN;}
    ;
    
//TODO: STRING
ID	:	(LETTER | DIGIT)(LETTER | DIGIT)*;		//come gestire caratteri speciali (_ va una sottolineatura sopra)/attenzione che un label può contenere anche solo numeri (per la semantica)


