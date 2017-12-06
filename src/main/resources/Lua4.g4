grammar Lua4;

//---------------------------------------------------------
// 扩展函数

@lexer::members {
@Override
 public void recover(RecognitionException e) {
       System.out.println("Debug Exit");
       throw new RuntimeException(e);
       }

 	@Override
 	public void recover(LexerNoViableAltException e) {
 		System.out.println("Debug Exit");
       throw new RuntimeException(e);
    }
}

//---------------------------------------------------------
// grammar rule
// https://www.lua.org/manual/4.0/manual.html#grammar
chunk
//    : (t=.{ System.out.println($t.text); })* EOF
    : block EOF
    ;

block
    : statement* returnStat?
    ;

statement
    : ';'
    | assignStat
    | funcStat
    | funcCall
    | Break
    | forStat
    | Do block End
    | whileStat
    | repeatStat
    | ifStat
    ;

returnStat
    : Return exprList? ';'?
    ;

assignStat
    : varList '=' exprList            #setValStat // 修改变量，或者设置全局变量
    | Local nameList ('=' exprList)?  #initLocalValStat
    ;

forStat
    : For Name '=' expression ',' expression (',' expression)? Do block End
    | For Name ',' Name In expression Do block End
    ;

whileStat
    : While expression Do block End
    ;

repeatStat
    : Repeat block Until expression
    ;

ifStat
    : If expression Then block (Elif expression Then block)* (Else block)? End
    ;

// expression
expression
    : Number            #ignoreExp
    | Nil               #ignoreExp
    | String            #stringExp
    | Args              #argsExp
    | tableConstructor  #tableCreateExp
//    | upvalue           #upvalueExp
    | Func funcBody     #unnamedFuncDeclare
    | prefixExp         #valOrFuncCallExp
    | expression binOp expression #binOpExp // 普通二元运算符
    | <assoc=right> expression rightOp expression #rightOpExp     // 右结合二元运算符
    | unaryOp expression    #unaryOpExp     // 一元运算符
    ;

exprList
     : expression (',' expression)*
     ;

binOp
    : '<' | '>' | '<=' | '>=' | '~=' | '=='| '+' | '-' | '*' | '/' | And | Or
    ;

rightOp
    : '^' | '..'
    ;

unaryOp
    : '-' | Not
    ;

// val or func()
prefixExp
    : varOrExp funcCallArg*
    ;

// 命名函数
funcStat
    : Func Name funcBody                            #namedFuncDeclare
    | Func ((Name '.' Name) | (Name ':' Name)) funcBody    #classFuncDeclare
    ;

funcBody
    : '(' paramList? ')' block End
    ;

funcArgs
    : '(' exprList? ')' | tableConstructor | String
    ;

funcCall
    : varOrExp funcCallArg+
    ;
//
// var 消除左递归文法
// t.name[x].name[t]:func(xxx).ttt.x()[t]
// 和5.2区别 4.0 (t).x报错。在lua 5.2中这么写是合法的：c = {t=1} (c).t = 3
var
    : Modulus? Name varSuffix*
    ;

varOrExp
    : var | '(' expression ')'
    ;

// var中, :func不能作为结尾，但是.func可以作为结尾
funcCallArg
    : (':' Name)? funcArgs
    ;

// var: varSuffix
varSuffix
    : funcCallArg* ('[' expression ']' | '.' Name)
    ;

varList
    : var ( ',' var)*
    ;

// 只读
/*
  %Table.func()
  %Table.name
  %a
  %prefixExp
*/
upvalue
    : '%' var
    ;

paramList
    : nameList (',' Args)? | Args
    ;

nameList
    : Name (',' Name)*
    ;


tableConstructor
    : '{' fieldList? '}'
    ;
// field

fieldList
    : field (fieldsep field)* fieldsep?
    ;

field
    : '[' expression ']' '=' expression | Name '=' expression | expression
    ;

fieldsep
    : ',' | ';'
    ;

//---------------------------------------------------------
// lexer rule

// tokens
If      : 'if';
Else    : 'else';
Elif    : 'elseif';
Do      : 'do';
End     : 'end';
Break   : 'break';
For     : 'for';
In      : 'in';
Local   : 'local';
Nil     : 'nil';
Not     : 'not';
Repeat  : 'repeat';
Return  : 'return';
Then    : 'then';
Until   : 'until';
While   : 'while';
Func    : 'function';

And     : 'and';
Or      : 'or';
Equals   : '==';
NEquals  : '~=';
GTEquals : '>=';
LTEquals : '<=';
GT       : '>';
LT       : '<';
Add      : '+';
Subtract : '-';
Multiply : '*';
Divide   : '/';
Modulus  : '%';
Pow      : '^';
OBrace   : '{';
CBrace   : '}';
OBracket : '[';
CBracket : ']';
OParen   : '(';
CParen   : ')';
SColon   : ';';
Assign   : '=';
Comma    : ',';
Colon    : ':';
DOT      : '.';
Conact   : '..';
Args     : '...';

// ------------------------------------------------------------------
// string

String
    : ["] ( EscapeChar | ~('\\' | '"') )* ["]
    | ['] ( EscapeChar | ~('\\' | '\'') )* [']
    | '[[' .*? ']]'
    ;
// 转义字符串
// '\\' [abfnrtvz"'\\]
fragment EscapeChar
    : SlashChar
    | UnicodeChar
    | DigitChar
    | HexChar
//    | '\\' ~[abfnrtvz"'\\] // 无法转义的非法的普通的斜杠
    ;

// 转义字符
fragment SlashChar
//    : '\\' [abfnrtvz"'\\]
    : '\\' .
    ;

fragment UnicodeChar
    : '\\' 'u{' HexDigit+ '}'
    ;

fragment DigitChar
    : '\\' Digit
    | '\\' Digit Digit
    | '\\' [0-2] Digit Digit
    ;

// \x
fragment HexChar
    : '\\' 'x' HexDigit HexDigit
    ;

// -----------------------------------------------------------------
// 变量名称
Name
 : [a-zA-Z_] [a-zA-Z_0-9]*
 ;

// -----------------------------------------------------------------
// 空白
WS
    : [ \t\u000C\r\n]+ -> skip
    ;

// -----------------------------------------------------------------
// number
Number
    : Int | Hex | Double | HexDouble
    ;

fragment Hex
    : '0' [xX] HexDigit+
    ;

// 00000001 合法
fragment Int
    : Digit+
    ;

fragment Double
    : Digit+ '.' Digit* ExpPart?
    | '.' Digit+ ExpPart?
    | Digit+ ExpPart
    ;

fragment HexDouble
    : '0' [xX] HexDigit+ '.' HexDigit* HexExpPart?
    | '0' [xX] '.' HexDigit+ HexExpPart?
    | '0' [xX] HexDigit+ HexExpPart
    ;

fragment ExpPart
    : [eE][+-]? Digit+
    ;

fragment HexExpPart
    : [pP][+-]? Digit+
    ;

fragment Digit
    : [0-9]
    ;

fragment HexDigit
    : [0-9a-fA-F]
    ;

// ---------------------------------------------------------------------
// comments

Comment
    : ('--' ~[\r\n]* | '/*' .*? '*/') -> channel(HIDDEN)
    ;
