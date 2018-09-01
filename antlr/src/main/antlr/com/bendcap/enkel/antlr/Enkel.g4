//header
grammar Enkel;

@header {
package com.bendcap.enkel.antlr;
}

//RULES
compilationUnit : classDeclaration EOF ;
classDeclaration : className '{' classBody '}' ;
className : qualifiedName ;
classBody :  field* function* ;
field : type name;
function : functionDeclaration block;
functionDeclaration : (type)? functionName '('? parametersList? ')'? ;
parametersList:  parameter (',' parameter)*
          |  parameter (',' parameterWithDefaultValue)*
          |  parameterWithDefaultValue (',' parameterWithDefaultValue)* ;
functionName : ID ;
parameter : type ID ;
parameterWithDefaultValue : type ID '=' defaultValue=expression ;
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
               | assignment
               | printStatement
               | forStatement
               | returnStatement
               | ifStatement
               | expression ;

variableDeclaration : VARIABLE name EQUALS expression ;
assignment : name EQUALS expression;
printStatement : PRINT expression ;
returnStatement : 'return' expression #ReturnWithValue
                | 'return' #ReturnVoid ;

ifStatement: 'if'  ('(')? expression (')')? trueStatement=statement ('else' falseStatement=statement)?;

forStatement : 'for' ('(')? forConditions (')')? statement ;
forConditions : iterator=variableReference  'from' startExpr=expression range='to' endExpr=expression ;

name : ID ;
argumentList : argument? (',' a=argument)* #UnnamedArgumentsList
             | namedArgument? (',' namedArgument)* #NamedArgumentsList ;
argument : expression ;
namedArgument : name '->' expression ;

expression : variableReference #VarReference
           | owner=expression '.' functionName '(' argumentList ')' #FunctionCall
           | functionName '(' argumentList ')' #FunctionCall
           | superCall='super' '('argumentList ')' #Supercall
           | newCall='new' className '('argumentList ')' #ConstructorCall
           | value        #ValueExpr
           |  '('expression '*' expression')' #Multiply
           | expression '*' expression  #Multiply
           | '(' expression '/' expression ')' #Divide
           | expression '/' expression #Divide
           | '(' expression '+' expression ')' #Add
           | expression '+' expression #Add
           | '(' expression '-' expression ')' #Substract
           | expression '-' expression #Substract
           | expression cmp='>' expression #ConditionalExpression
           | expression cmp='<' expression #ConditionalExpression
           | expression cmp='==' expression #ConditionalExpression
           | expression cmp='!=' expression #ConditionalExpression
           | expression cmp='>=' expression #ConditionalExpression
           | expression cmp='<=' expression #ConditionalExpression
           ;

variableReference : ID ;
value : NUMBER
      | BOOL
      | STRING ;
qualifiedName : ID ('.' ID)*;

//TOKENS
VARIABLE : 'var' ;
PRINT : 'print' ;
EQUALS : '=' ;
NUMBER : '-'?[0-9.]+ ;
BOOL : 'true' | 'false' ;
STRING : '"'~('\r' | '\n' | '"')*'"' ;
ID : [a-zA-Z0-9]+ ;
WS: [ \t\n\r]+ -> skip ;