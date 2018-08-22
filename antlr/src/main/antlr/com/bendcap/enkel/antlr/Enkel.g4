//header
grammar Enkel;

@header {
package com.bendcap.enkel.antlr;
}

//RULES
compilationUnit : classDeclaration EOF ; //root rule - our code consist consist only of variables and prints (see definition below)
classDeclaration : className superClassName* '{' classBody '}' ;
className : ID ;
superClassName : ':' ID ;
classBody :  function* ;
function : functionDeclaration '{' (blockStatement)* '}' ;
functionDeclaration : (type)? functionName '('  (functionArgument)* (',' functionArgument)* ')' ;
functionName : ID ;
functionArgument : type ID functionParamdefaultValue? ;
functionParamdefaultValue : '=' expression ;
type : primitiveType
     | classType ;

primitiveType :     'boolean' ('[' ']')*
                |   'string' ('[' ']')*
                |   'char' ('[' ']')*
                |   'byte' ('[' ']')*
                |   'short' ('[' ']')*
                |   'int' ('[' ']')*
                |   'long' ('[' ']')*
                |   'float' ('[' ']')*
                |   'double' ('[' ']')*
                |   'void' ('[' ']')* ;
classType : QUALIFIED_NAME ('[' ']')* ;

blockStatement : variableDeclaration
               | printStatement
               | functionCall ;
variableDeclaration : VARIABLE name EQUALS expression;
printStatement : PRINT expression ;
functionCall : functionName '('expressionList ')';
name : ID ;
expressionList : (expression)* (',' expression)* ;
expression : varReference
           | value
           | functionCall ;
varReference : ID ;
value : NUMBER
      | STRING ;

//TOKENS
VARIABLE : 'var' ;
PRINT : 'print' ;
EQUALS : '=' ;
NUMBER : [0-9]+ ;
STRING : '"'.*'"' ;
ID : [a-zA-Z0-9]+ ;
QUALIFIED_NAME : ID ('.' ID)+;
WS: [ \t\n\r]+ -> skip ;