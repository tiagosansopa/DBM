//Pablo Barreno
//Santiago Solorzano
//Diego Sosa

grammar DBMS;

//LEXER

LPAREN
    :   '('
    ;

RPAREN
    :   ')'
    ;

LBRACKET
    :   '['
    ;

RBRACKET
    :   ']'
    ;

EQ
    :   '='
    ;

KL  
    :   '*'
    ;

INT 
    :   'int' 
    ;

FLOATS
    :   'float'
    ;

DATES
    :   'date'
    ;
CHAR    
    :   'char'
    ;

and
    :   'and'
    |   'AND'
    |   'And'
    ;

or
   :    'or'
   |    'OR'
   |    'Or'
   ;

not
   :    'not'
   |    'NOT'
   |    'Not'
   ;

BOOLEAN 
    :   'boolean'
    ;

DATETIME
    :   'datetime'
    ;

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

create
    :   'CREATE'
    |   'Create'
    |   'create'
    ;

database
    :   'DATABASE'
    |   'Database'
    |   'database'
    ;

databases
    :   'DATABASES'
    |   'Databases'
    |   'databases'
    ;

table
    :   'TABLE'
    |   'Table'
    |   'table'
    ;

tables
    :   'TABLES'
    |   'Tables'
    |   'tables'
    ;

column
    :   'COLUMN'
    |   'Column'
    |   'column'
    ;

columns
    :   'COLUMNS'
    |   'Columns'
    |   'column'
    ;

show    
    :   'SHOW'
    |   'Show'
    |   'show'
    ;

drop
    :   'DROP'
    |   'Drop'
    |   'drop'
    ;

alter
    :   'ALTER'
    |   'Alter'
    |   'alter'
    ;

use
    :   'USE'
    |   'Use'
    |   'use'
    ;

rename
    :   'RENAME'
    |   'Rename'
    |   'rename'
    ;

END_SQL
    :   ';'
    ;

COMMA
    :   ','
    ;

constraint
    :   'CONSTRAINT'
    |   'Constraint'
    |   'constraint'
    ;

key
    :   'KEY'
    |   'Key'
    |   'key'
    ;

primary
    :   'PRIMARY'
    |   'Primary'
    |   'primary'
    ;

foreign
    :   'FOREIGN'
    |   'Foreign'
    |   'foreign'
    ;

check
    :   'CHECK'
    |   'Check'
    |   'check'
    ;

select
    :   'SELECT'
    |   'Select'
    |   'select'
    ;

from
    :   'FROM'
    |   'From'
    |   'from'
    ;

where
    :   'WHERE'
    |   'Where'
    |   'where'
    ;

asc
    :   'ASC'
    |   'Asc'
    |   'asc'
    ;

desc
    :   'DESC'
    |   'Desc'
    |   'desc'
    ;

to
    :   'TO'
    |   'To'
    |   'to'
    ;

references
    :   'REFERENCES'
    |   'References'
    |   'references'
    ;

add
    :   'ADD'
    |   'Add'
    |   'add'
    ;

insert
    :   'INSERT'
    |   'Insert'
    |   'insert'
    ;

into
    :   'INTO'
    |   'Into'
    |   'into'
    ;

values
    :   'VALUES'
    |   'Values'
    |   'values'
    ;

update
    :   'UPDATE'
    |   'Update'
    |   'update'
    ;

set
    :   'SET'
    |   'Set'
    |   'set'
    ;

delete
    :   'DELETE'
    |   'Delete'
    |   'delete'
    ;

order
    :   'ORDER'
    |   'Order'
    |   'order'
    ;

by
    :   'BY'
    |   'By'
    |   'by'
    ;

//PARSER

sql 
    :   (sql_executable)+
    ;

sql_executable
    :   sql_ddl
    |   sql_dml
    ;

sql_ddl
    :   database_statement
    |   table_statement
    ;

database_statement
    :   create_database
    |   alter_database
    |   drop_database
    |   show_database
    |   use_database
    ;

table_statement
    :   create_table
    |   alter_table
    |   drop_table
    |   show_tables
    |   show_columns
    ;
    
comma_id_k
    :   (COMMA ID)*
    ;

comma_literal_k
    :   (COMMA literal)*
    ;

comma_id_eq_literal_k
    :   (COMMA ID EQ literal)*
    ;
    
comma_action_k
	:	(COMMA action)*
	;

create_database
    :   create database ID END_SQL
    ;

alter_database
    :   alter database ID rename to ID END_SQL
    ;

drop_database
    :   drop database ID END_SQL
    ;

show_database
    :   show databases ID END_SQL
    |   show databases END_SQL
    ;

use_database
    :   use database ID END_SQL
    ;

create_table
    :   create table ID LPAREN ID type ( COMMA ID type )* ( COMMA )?( constraint constraintAt ( COMMA constraint constraintAt )* )?  RPAREN END_SQL
    ;

constraintAt
    :   primaryKey 
    |   foreignKey ( foreignKey )*
    |   checks ( checks )*
    ;   

primaryKey: ID primary key LPAREN ID comma_id_k RPAREN ;

foreignKey: ID foreign key LPAREN ID comma_id_k RPAREN references ID LPAREN ID comma_id_k RPAREN ;

checks: ID check LPAREN exp RPAREN ;

type
    :   INT
    |   FLOATS
    |   DATES
    |   CHAR LPAREN NUM RPAREN
    ;

alter_table
    :   alter table ID rename to ID END_SQL
    |   alter table ID action comma_action_k END_SQL
    ;

drop_table
    :   drop database ID END_SQL
    ;

show_tables
    :   show tables END_SQL
    ;

show_columns
    :   show columns from ID END_SQL
    ;

action
    :   add column ID type (constraint constraintAt ( COMMA constraint constraintAt )* )?                
    |   add constraint constraintAt
    |   drop column ID
    |   drop constraint ID
    ;

       
sql_dml
    :   insert_value
    |   update_value
    |   delete_value
    |   select_value
    ;

insert_value
    :   insert into ID ( LPAREN ID comma_id_k  RPAREN )? values LPAREN literal comma_literal_k RPAREN END_SQL
    ;

update_value
    :   update ID set ID EQ literal comma_id_eq_literal_k  (where exp)? END_SQL 
    ;

delete_value
    :   delete from ID (where exp)? END_SQL
    ;

select_value
    :   select (KL | ID comma_id_k ) from ID (where exp)?  (order by exp (asc | desc)( COMMA exp ( asc | desc ) )*)? END_SQL
    ;

literal
    :   NUM
    |   FLOAT
    |   DATE
    |   CHARX // Por el momento esta resuelto, pero no tiene el char de comilla
    ;

rel_op
    :   '<'                                 
    |   '>'
    |   '<='
    |   '>='                                    
    |   '='                                 
    |   '<>'    
    ;


cond_op
    :   and
    |   or
    ;

eq_op : '==' | '!=' ;

add_op: '+'| '-';

mult_op: '*' | '/' | '%' ;


exp
    :   expression 
    |   //epsilon 
    ;


expression 
    :   andExpr
    |   expression or andExpr  
    ;

andExpr
    : eqExpr 
    | andExpr and eqExpr 
    ;

eqExpr
    :   relationExpr 
    |   eqExpr eq_op relationExpr 
    ; 

relationExpr
    : unaryExpr 
    | relationExpr rel_op unaryExpr 
    ;

unaryExpr
    :   '(' (not)? ID  ')' 
    | (not)? ID 
    | literal
    ; // verificar

unifactor
    :   not factor
    |   factor
    ;
    
factor      
    :   LPAREN expression RPAREN
    |   ID
    |   ID.ID
    ;
    
