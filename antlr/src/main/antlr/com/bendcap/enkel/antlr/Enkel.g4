//header
grammar Enkel;

@header {
package com.bendcap.enkel.antlr;
}

//RULES
compilationUnit : ( variable | print )* EOF; //root rule - our code consist consist only of variables and prints (see definition below)
variable : VARIABLE ID EQUALS value; //requires VAR token followed by ID token followed by EQUALS TOKEN ...
print : PRINT ID ; //print statement must consist of 'print' keyword and ID
value : op=NUMBER
      | op=STRING ; //must be NUMBER or STRING value (defined below)

//TOKENS
VARIABLE : 'var' ; //VARIABLE TOKEN must match exactly 'var'
PRINT : 'print' ;
EQUALS : '=' ; //must be '='
NUMBER : [0-9]+ ; //must consist only of digits
STRING : '"'.*'"' ; //must be anything in qutoes
ID : [a-zA-Z0-9]+ ; //must be any alphanumeric value
WS: [ \t\n\r]+ -> skip ; //special TOKEN for skipping whitespaces