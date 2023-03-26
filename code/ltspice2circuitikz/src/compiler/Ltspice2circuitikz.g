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
		componentRule* {System.out.println("Ho riconosciuto component rule");}; //se metto tipo un WIRE.... poi una lettera a caso riconosce solo il primo wire e poi termina (correttamente)
prologueRule
	:	versionRule //CONTROLLARE CHE SIA 4
		sheetRule
	;
versionRule
	:	VERSION INTEGER
	;
sheetRule
	:	SHEET INTEGER INTEGER INTEGER
	;
componentRule
	:	wireRule {System.out.println("sto riconoscendo wirerule");}
		| symbolRule {System.out.println("sto riconoscendo symbol");}
		| symattrRule{System.out.println("sto riconoscendo symattr");}
	;
wireRule:
		WIRE INTEGER INTEGER INTEGER INTEGER
	;
symbolRule
	:
		SYMBOL SYMBOLTYPE INTEGER INTEGER (ROTTYPE | MIRRORTYPE)
	;
symattrRule
	:
		SYMATTR INSTNAME ID	
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
		| 'cap'
		| 'ind' 
		| 'ind2' //inductor with phase dot symbol
		| 'diode'	
		| 'schottky'
		| 'zener'
		| 'varactor'
		| 'LED'
		| 'TVSdiode'
		| 'pnp'
		| 'npn'
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
DIODEUPPER:	'Diode'; //TODO: quando si inserisce un tipo di diodo vengono inserite: SYMATTR Description Diode/	SYMATTR Type diode //da controllare semanticamente? che sia diode
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
ID	:	(LETTER | DIGIT | '-')(LETTER | DIGIT | '-')*;		//come gestire caratteri speciali (_ va una sottolineatura sopra)/attenzione che un label può contenere anche solo numeri (per la semantica) //attenzione che un id può essere anche un numero



