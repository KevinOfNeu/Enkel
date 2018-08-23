//header
grammar Enkel;

@header {
package com.bendcap.enkel.antlr;
}

//RULES
compilationUnit : classDeclaration EOF ;
classDeclaration : className '{' classBody '}' ;
className : ID ;
classBody :  function* ;
function : functionDeclaration '{' (blockStatement)* '}' ;
functionDeclaration : (type)? functionName '('(functionArgument)*')' ;
functionName : ID ;
functionArgument : type ID functionParamdefaultValue? ;
functionParamdefaultValue : '=' expression ;
type : primitiveType
     | classType ;

primitiveType :  'boolean' ('[' ']')*
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
expressionList : expression (',' expression)* ;

expression : variableReference #VarReference
           | value        #ValueExpr
           | functionCall #FUNCALL
           |  '('expression '*' expression')' #MULTIPLY
           | expression '*' expression  #MULTIPLY
           | '(' expression '/' expression ')' #DIVIDE
           | expression '/' expression #DIVIDE
           | '(' expression '+' expression ')' #ADD
           | expression '+' expression #ADD
           | '(' expression '-' expression ')' #SUBSTRACT
           | expression '-' expression #SUBSTRACT
           ;
variableReference : ID ;
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