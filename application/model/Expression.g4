//Pablo Barreno
//Santiago Solorzano
//Diego Sosa

grammar Expression;

//LEXER

fragment LETTER 
    :   ('a'..'z'|'A'..'Z')
    ;

fragment DIGIT
    :   '0'..'9'
    ;

fragment ASCII
    :   (' ' ..'&')
    |   ('(' .. '~')
    |   '\\' 
    |   '\"' 
    |   '\t' 
    |   '\n'
    ;

fragment TWO_DIGITS   
    :   DIGIT DIGIT
    ;

fragment THREE_DIGITS
    :   DIGIT TWO_DIGITS 
    ;

fragment FOUR_DIGITS
    :   DIGIT THREE_DIGITS 
    ;

fragment YEAR
    :   FOUR_DIGITS 
    ;

fragment MONTH
    :   DIGIT
    |   TWO_DIGITS
    ;

fragment DAY
    :   DIGIT 
    |   TWO_DIGITS 
    ; 


or
    : 'OR'
    | 'Or'
    | 'or'
    ;

and
    : 'AND'
    | 'And'
    | 'and'
    ;

not
    : 'NOT'
    | 'Not'
    | 'not'
    ;

LPAREN
    : '('
    ;

RPAREN
    : ')'
    ;

ID 
    :   LETTER ( LETTER | DIGIT | '_' )* 
    ;

NUM 
    :   DIGIT ( DIGIT )* 
    ;

FLOAT
    :   DIGIT ( DIGIT )* ('.' (DIGIT)* )? 
    ;


CHARX   
    :   '\'' ASCII* '\''
    ;

DATE
    :   YEAR '-' MONTH '-' DAY 
    ;

WS 
    :   [\t\r\n\f ]+ -> skip
    ;

COMMENT
    :   ( '//' ~[\r\n]* '\r'? '\n' | '/*' .*? '*/') -> skip
    ;


// PARSER
exp
    :   expression 
    |   //epsilon 
    ;


expression 
    :   andExpr
    |   expression or andExpr  
    ;

andExpr
    : factor 
    | andExpr and factor 
    ;

factor
    : primaryExpr 
    | not primaryExpr 
    ;

primaryExpr
    : compareExpr
    | LPAREN expression RPAREN
    ;
    
compareExpr
    :   term rel_op term
    ;

term
    :   ID
    |   literal
    ;

rel_op
    : '<'
    | '>'
    | '<='
    | '>='
    | '=='
    | '<>'
    ;

literal
    :   NUM
    |   FLOAT
    |   DATE
    |   CHARX // Por el momento esta resuelto, pero no tiene el char de comilla
    ;