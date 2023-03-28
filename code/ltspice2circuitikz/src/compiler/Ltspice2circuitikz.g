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
		FLAG INTEGER INTEGER INTEGER
	;
	
windowRule
	:	
		WINDOW INTEGER INTEGER INTEGER WINDOWOPTION INTEGER // forse l'ultimo INTEGER è opzionale, verificare
	;

symbolRule
	:
		SYMBOL SYMBOLTYPE INTEGER INTEGER (ROTTYPE | MIRRORTYPE)
	;
symattrRule
	:
		SYMATTR ( INSTNAME ID
			| DESCRIPTION ID
			| TYPE SYMBOLTYPE
			| VALUE (  INTEGER 
				 | FLOAT 
				 | ID) // questo è problematico perchè accetta tutto p.e. Ciao come stai? lo accetta... 
				       //potrebbe essere un caso limite che decidiamo di non affrontare.. creiamo una regola a aparte?
			| SPICELINE attrRule+)
	;
	
attrRule
	:
		(CAPATTRIBUTE | PARATTRIBUTE | RATTRIBUTE | INDATTRIBUTE)
		 ASSIGN
		(INTEGER | FLOAT | STRING) // esempio: Cpar=1, pwr=2.5, Rser=1, può essere stringa?
;
// questi non mi piacciono. Forse ha più senso dividerli invece che per cap attribute, par attribute etc etc.
// per il tipo di oggetto che si aspettano dopo. Altrimenti qua ognuno si può aspettare di tutto e poi dovremmo controllare nell'handler. 
/*
però in realtà per noi la maggior parte di questi attributi sono inutili. Teniamolo in considerazione. 
Ciò significa che possiamo anche leggerli che son sbagliati, non ce ne frega, l'importante è che sono corrette
le informazioni che dobbiamo inserire nel disegno. 

valutiamo bene cosa è meglio fare. 

Da LTSpice lascia mettere tutto negli attributi...
- gli lasciamo mettere tutto e lasciamo questa regola. 
- lo gestiamo noi dicendo che non puoi mettere una stringa ad una tensione ma deve aspettarsi unn intero. 
(e le unità di misura? Vanno bene? In teoria son già definite nel sistema)

*/

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



