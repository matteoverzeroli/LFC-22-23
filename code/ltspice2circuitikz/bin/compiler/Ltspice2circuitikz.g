lexer grammar Ltspice2circuitikz;

options {
	language = Java;
}

@lexer::header {
	package compiler;
}

@members {
}

	
/* ****************************
**	 Analizzatore sintattico 
**	 aka Lexer, aka Scanner
***************************** */

fragment
EXPONENT : ('e'|'E') ('+'|'-')? ('0'..'9')+ ;

fragment
HEX_DIGIT : ('0'..'9'|'a'..'f'|'A'..'F') ;

fragment
ESC_SEQ
    :   '\\' ('b'|'t'|'n'|'f'|'r'|'\"'|'\''|'\\')
    |   UNICODE_ESC
    |   OCTAL_ESC
    ;

fragment
OCTAL_ESC
    :   '\\' ('0'..'3') ('0'..'7') ('0'..'7')
    |   '\\' ('0'..'7') ('0'..'7')
    |   '\\' ('0'..'7')
    ;

fragment
UNICODE_ESC
    :   '\\' 'u' HEX_DIGIT HEX_DIGIT HEX_DIGIT HEX_DIGIT
    ;

fragment 
LETTER : 'a'..'z'|'A'..'Z';
fragment 
DIGIT : '0'..'9';

ASSIGN	: '=';
// comparatori
EQ 			: '==';
NEQ 		: '!=';
GT 			: '>';
GE			: '>=';
LT 			: '<';
LE 			: '<=';

// punteggiatura
AT	: '@';
CL 	:	':';
CM 	:	',';
DOT : '.';
SC 	: ';';

// parentesi
LP 	: '(';		// Parenthesis
RP 	: ')';
LB	:	'[';		// Brackets
RB	:	']';
LBR	:	'{';		// BRaces
RBR	:	'}';

// operatori
ADD		: '+';
SUB		: '-';
STAR	: '*';
DIV		: '/';
MOD		:	'%';

// operatori logici
NOT			:	'!';
AND			: '&&';
OR			: '||';
XOR			: '^';
AND_BIT :	'&';
OR_BIT 	:	'|';

// basic types
VOID 				:	'void';
// attenzione... vedere sotto 
BASIC_TYPE 	: 'int' 	| 'long'		| 'short' 	| 
							'float' |	'double'	| 'boolean' | 
							'char'	|	'String';
/* attenzione
//VOID 			:	'void';
BOOLEAN		:	'boolean';
CHAR_K		:	'char';
DOUBLE		:	'double';
FLOAT_K		:	'float';
INT				:	'int';
LONG			:	'long';
SHORT			:	'short';
STRING_K	:	'String'; // attenzione
*/							
							
// keywords
ABSTRACT			:	'abstract';
ASSERT				:	'assert';
BREAK					:	'break';
BYTE					:	'byte';
CASE					:	'case';
CATCH					:	'catch';
CLASS					:	'class';
CONTINUE			:	'continue';
DEFAULT				:	'default';
DO						:	'do';
ELSE					:	'else';
ENUM					:	'enum';
EXTENDS				:	'extends';
FINAL					:	'final';
FINALLY				:	'finally';
FOR						:	'for';
IF						:	'if';
IMPLEMENTS		:	'implements';
IMPORT				:	'import';
INSTANCEOF		:	'instanceof';
INTERFACE			:	'interface';
NATIVE				:	'native';
NEW						:	'new';
PACKAGE				:	'package';
PRIVATE				:	'private';
PROTECTED			:	'protected';
PUBLIC				:	'public';
RETURN				:	'return';
STATIC				:	'static';
SUPER					:	'super';
SWITCH				:	'switch';
SYNCHRONIZED	:	'synchronized';
THIS					:	'this';
THROW					:	'throw';
THROWS				:	'throws';
TRANSIENT			:	'transient';
TRY						:	'try';
VOLATILE			:	'volatile';
WHILE					:	'while';

		
ID  :	( LETTER |'_') 
			( LETTER |DIGIT |'_')*
    ;


INTEGER :	DIGIT+
    ;

FLOAT
    :   DIGIT+ '.' DIGIT* EXPONENT?
    |   '.' DIGIT+ EXPONENT?
    |   DIGIT+ EXPONENT
    ;

COMMENT
    :   ('//' ~('\n'|'\r')* '\r'? '\n' 							{$channel=HIDDEN;}
    |   '/*' ( options {greedy=false;} : . )* '*/') {$channel=HIDDEN;}
    ;

WS  :   ( ' '
        | '\t'
        | '\r'
        | '\n'
        )+ {$channel=HIDDEN;}
    ;

STRING
    :  '"' ( ESC_SEQ | ~('\\'|'"') )* '"'
    ;

CHAR:  '\'' ( ESC_SEQ | ~('\''|'\\') ) '\''
    ;
