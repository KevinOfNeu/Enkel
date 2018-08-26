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
function : functionDeclaration block;
functionDeclaration : (type)? functionName '(' (functionParameter (',' functionParameter)*)?')' ;
functionName : ID ;
functionParameter : type ID functionParamdefaultValue? ;
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

block : '{' statement* '}' ;

statement :     block
               | variableDeclaration
               | printStatement
               | functionCall
               | returnStatement
               | ifStatement ;

variableDeclaration : VARIABLE name EQUALS expression ;
printStatement : PRINT expression ;
returnStatement : 'return' #RETURNVOID
                | ('return')? expression #RETURNWITHVALUE ;
functionCall : functionName '('argument? (',' argument)* ')';

ifStatement: 'if'  ('(')? expression (')')? trueStatement=statement ('else' falseStatement=statement)?;

name : ID ;
argument : expression
         | expression '->' name ;

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
           | expression cmp='>' expression #conditionalExpression
           | expression cmp='<' expression #conditionalExpression
           | expression cmp='==' expression #conditionalExpression
           | expression cmp='!=' expression #conditionalExpression
           | expression cmp='>=' expression #conditionalExpression
           | expression cmp='<=' expression #conditionalExpression
           ;

variableReference : ID ;
value : NUMBER
      | STRING ;
//TOKENS
VARIABLE : 'var' ;
PRINT : 'print' ;
EQUALS : '=' ;
NUMBER : [0-9]+ ;
STRING : '"'~('\r' | '\n' | '"')*'"' ;
ID : [a-zA-Z0-9]+ ;
QUALIFIED_NAME : ID ('.' ID)+;
WS: [ \t\n\r]+ -> skip ;