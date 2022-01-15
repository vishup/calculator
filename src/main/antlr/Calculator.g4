grammar Calculator;

expression
    :   INTEGER #Integer
    |   left=expression (MUL) right=expression #Multiply
    |   left=expression (DIV) right=expression #Divide
    |   left=expression (ADD) right=expression #Add
    |   left=expression (SUB) right=expression #Subtract
    |   LPAREN expression RPAREN #Parenthesis;


MUL : '*' ;
DIV : '/' ;
ADD : '+' ;
SUB : '-' ;
LPAREN: '(';
RPAREN: ')';
INTEGER :  [0-9]+;
WS : [ \t\r\n\f]+ -> skip;