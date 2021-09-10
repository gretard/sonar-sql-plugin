grammar CommentsGrammar;

root  : 
		statement+
	 EOF?;

statement	:  (comment | non_comment )  ;
comment: multiline_comment | line_comment;
multiline_comment:  COMMENT;
line_comment: LINE_COMMENT;
non_comment: (ID | DOUBLE_QUOTE_ID | SQUARE_BRACKET_ID | LOCAL_ID
|DECIMAL
|STRING
|BINARY
|FLOAT
|REAL
|EQUAL
|GREATER
|LESS
|EXCLAMATION
|PLUS_ASSIGN
|MINUS_ASSIGN
|MULT_ASSIGN
|DIV_ASSIGN
|MOD_ASSIGN
|AND_ASSIGN
|XOR_ASSIGN
|OR_ASSIGN
|DOUBLE_BAR
|DOT
|UNDERLINE
|AT
|SHARP
|DOLLAR
|LR_BRACKET
|RR_BRACKET
|COMMA
|SEMI
|COLON
|DOUBLE_COLON
|STAR
|DIVIDE
|MODULE
|PLUS
|MINUS
|BIT_NOT
|BIT_OR
|BIT_AND
|BIT_XOR) ;





WS:              [ \t\r\n]+    -> skip;
COMMENT:            '/*' (COMMENT | .)*? '*/' ;
LINE_COMMENT:       ('--' | '//' ) ~[\r\n]*;

// TODO: ID can be not only Latin.
DOUBLE_QUOTE_ID:    '"' ~'"'+ '"';
SINGLE_QUOTE:       '\'';
SQUARE_BRACKET_ID:  '[' (~']' | ']' ']')* ']';
LOCAL_ID:           '@' ([A-Z_$@#0-9] | FullWidthLetter)*;
DECIMAL:             DEC_DIGIT+;
ID:                  ( [A-Z_#] | FullWidthLetter) ( [A-Z_#$@0-9] | FullWidthLetter )*;
STRING:              'N'? '\'' (~'\'' | '\'\'')* '\'';
BINARY:              '0' 'X' HEX_DIGIT*;
FLOAT:               DEC_DOT_DEC;
REAL:                (DECIMAL | DEC_DOT_DEC) ('E' [+-]? DEC_DIGIT+);

EQUAL:               '=';

GREATER:             '>';
LESS:                '<';
EXCLAMATION:         '!';

PLUS_ASSIGN:         '+=';
MINUS_ASSIGN:        '-=';
MULT_ASSIGN:         '*=';
DIV_ASSIGN:          '/=';
MOD_ASSIGN:          '%=';
AND_ASSIGN:          '&=';
XOR_ASSIGN:          '^=';
OR_ASSIGN:           '|=';

DOUBLE_BAR:          '||';
DOT:                 '.';
UNDERLINE:           '_';
AT:                  '@';
SHARP:               '#';
DOLLAR:              '$';
LR_BRACKET:          '(';
RR_BRACKET:          ')';
COMMA:               ',';
SEMI:                ';';
COLON:               ':';
DOUBLE_COLON:        '::';
STAR:                '*';
DIVIDE:              '/';
MODULE:              '%';
PLUS:                '+';
MINUS:               '-';
BIT_NOT:             '~';
BIT_OR:              '|';
BIT_AND:             '&';
BIT_XOR:             '^';

fragment LETTER:       [A-Z_];
fragment DEC_DOT_DEC:  (DEC_DIGIT+ '.' DEC_DIGIT+ |  DEC_DIGIT+ '.' | '.' DEC_DIGIT+);
fragment HEX_DIGIT:    [0-9A-F];
fragment DEC_DIGIT:    [0-9];


fragment FullWidthLetter
    : '\u00c0'..'\u00d6'
    | '\u00d8'..'\u00f6'
    | '\u00f8'..'\u00ff'
    | '\u0100'..'\u1fff'
    | '\u2c00'..'\u2fff'
    | '\u3040'..'\u318f'
    | '\u3300'..'\u337f'
    | '\u3400'..'\u3fff'
    | '\u4e00'..'\u9fff'
    | '\ua000'..'\ud7ff'
    | '\uf900'..'\ufaff'
    | '\uff00'..'\ufff0'
    // | '\u10000'..'\u1F9FF'  //not support four bytes chars
    // | '\u20000'..'\u2FA1F'
    ;