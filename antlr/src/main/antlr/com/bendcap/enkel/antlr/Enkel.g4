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
classType : qualifiedName ('[' ']')* ;

block : '{' statement* '}' ;

statement :     block
               | variableDeclaration
               | printStatement
               | forStatement
               | returnStatement
               | ifStatement
               | expression ;

variableDeclaration : VARIABLE name EQUALS expression ;
printStatement : PRINT expression ;
returnStatement : 'return' expression #RETURNWITHVALUE
                | 'return' #RETURNVOID ;

ifStatement: 'if'  ('(')? expression (')')? trueStatement=statement ('else' falseStatement=statement)?;

forStatement : 'for' ('(')? forConditions (')')? statement ;
forConditions : iterator=variableReference  'from' startExpr=expression range='to' endExpr=expression ;

name : ID ;
argument : expression
         | name '->' expression ;

expression : variableReference #VarReference
           | owner=expression '.' functionName '('argument? (',' argument)* ')' #functionCall
           | functionName '('argument? (',' argument)* ')' #functionCall
           | superCall='super' '('argument? (',' argument)* ')' #supercall
           | newCall='new' className '('argument? (',' argument)* ')' #constructorCall
           | value        #ValueExpr
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
      | BOOL
      | STRING ;
qualifiedName : ID ('.' ID)+;

//TOKENS
VARIABLE : 'var' ;
PRINT : 'print' ;
EQUALS : '=' ;
NUMBER : '-'?[0-9.]+ ;
BOOL : 'true' | 'false' ;
STRING : '"'~('\r' | '\n' | '"')*'"' ;
ID : [a-zA-Z0-9]+ ;
WS: [ \t\n\r]+ -> skip ;