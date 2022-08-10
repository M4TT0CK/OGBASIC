
grammar DartmouthBASIC;

program
    : line* EOF
    ;

line
    : number statement? EOL
    ;

statement
    : assignmentStatement
    | functionStatement
    | printStatement
    | gotoStatement
    | gosubStatement
    | returnStatement
    | dimStatement
    | remStatement
    | readStatement
    | dataStatement
    | conditionalStatement
    | forStatement
    | inputStatement
    | expressionStatement
    | endStatement
    ;

expressionStatement
    : expression
    ;

inputStatement
    : INPUT expression
    ;

forStatement
    : FOR varName '=' expression TO expression (STEP expression)? EOL loopBody
    ;

loopBody
    : line* loopTerminator
    ;

loopTerminator
    : number NEXT idList
    ;

conditionalStatement
    : IF expression THEN statement
    ;

dataStatement
    : DATA constantList
    ;

constantList
    : constant (',' constant)*
    ;

readStatement
    : READ idList
    ;

idList
    : varName (',' varName)*
    ;

assignmentStatement
    : LET? varName '=' expression
    ;

functionStatement
    : DEF FUNCTION_NAME '(' varName ')' '=' expression
    ;

printStatement
    : PRINT printList
    ;

printList
    : expression delimiter printList
    | expression delimiter?
    ;

gotoStatement
    : GOTO expression
    ;

gosubStatement
    : GOSUB expression
    ;

returnStatement
    : RETURN
    ;

dimStatement
    : DIM varName '=' '(' number* ')'
    ;

remStatement
    : REM_TEXT
    ;

endStatement
    : END
    | STOP
    ;

delimiter
    : ';'
    | ','
    ;

expression
   : varName                                #ReferenceExpression
   | (STRING | number)                      #LiteralExpression
   | expression '^' expression              #ExponentionalExpression
   | expression ('+' | '-') expression      #AdditiveExpression
   | expression ('*' | '/') expression      #MultiplicativeExpression
   | '-' expression                         #UnaryExpression
   | FUNCTION_NAME '(' expression ')'       #ArgumentExpression
   | '(' expression ')'                     #ParenthesizedExpression
   | expression comparator expression       #EqualityExpression
   ;

comparator
   : ('<' ('>' | '=' )?)
   | ('>' ('<' | '=' )?)
   | '='
   ;

number
   : varName
   | real
   | integer
   ;

varName
    : VAR DIGIT?
    ;

integer
    : DIGITS
    ;

real
    : integer '.' integer
    | '.' integer
    ;

constant
    : integer
    | STRING
    | real
    ;

fragment TEXT
    : ~ ["\r\n]*
    ;
fragment REM
    : 'REM'
    ;

STRING
    : '"' TEXT '"'
    ;

REM_TEXT
    : REM TEXT
    ;

COMMA
    : ','
    ;

SEMI_COLON
    : ';'
    ;

PRINT
    : 'PRINT'
    ;

L_PAREN
    : '('
    ;

R_PAREN
    : ')'
    ;

EQUALS
    : '='
    ;

DEF
    : 'DEF'
    ;

LET
    : 'LET'
    ;

FOR
    : 'FOR'
    ;

VAR
    : [A-Z]
    ;

DIGITS
    : [0-9]+
    ;

DIGIT
    : [0-9]
    ;

END
    : 'END'
    ;

STOP
    : 'STOP'
    ;

GOTO
    : 'GOTO'
    ;

GOSUB
    : 'GOSUB'
    ;

RETURN
    : 'RETURN'
    ;

EOL
   : [\r\n]+
   ;

DIM
    : 'DIM'
    ;

READ
    : 'READ'
    ;

DATA
    : 'DATA'
    ;
IF
    : 'IF'
    ;

THEN
    : 'THEN'
    ;

TO
    : 'TO'
    ;

STEP
    : 'STEP'
    ;

NEXT
    : 'NEXT'
    ;

INPUT
    : 'INPUT'
    ;

FUNCTION_NAME
    : 'FN' [A-Z]
    | [A-Z][A-Z][A-Z]
    ;

WS
   : [ \t] -> skip
   ;