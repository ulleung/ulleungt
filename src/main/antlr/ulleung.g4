grammar ulleung;
/*
골격
*/

program: define_package define_import* define_class*;

define_package: package_name PACKAGE_STATE;

define_import: package_name PACKAGE_IMPORT;

define_class: (type_name EXTEND)? public_type? CLASS IDENTIFIER COLON (define_global_var | define_function)* SEMICOLON;

define_global_var: public_type? STATIC? type_name_array IDENTIFIER (EQUALS new_object)?;

define_function: public_type? STATIC? type_name_array? FUNCTION IDENTIFIER COLON (args REQUIRE)? statement* (COLON (VAR_VALUE | IDENTIFIER) RETURN)? SEMICOLON;

/*
렉서, 파서
*/

// 퍼블릭여부

PUBLIC: '들춰진';
PROTECTED: '감춰진';
PRIVATE: '숨겨진';

public_type: PUBLIC | PROTECTED | PRIVATE;

// 정적여부

STATIC: '정적';

// 클래스

CLASS: '객체';

// 함수 선언
type_name: ('('package_name'.)')? IDENTIFIER;
type_name_array: ('('package_name'.)')? IDENTIFIER ARRAY?;

FUNCTION: '함수';

args: type_name_array IDENTIFIER (', 'type_name_array IDENTIFIER)*;
REQUIRE: '요구';

RETURN: '돌려주기';

// 기초 코드

passed_arg: method | VAR_VALUE | IDENTIFIER | calculation;
passed_args: passed_arg (', ' passed_arg)*;

new_object: type_name '('passed_args?')' CREATE;
CREATE: '생성';

ADD: '+';
SUBTRACT: '-';
MULTIPLY: '*';
DIVIDE: '/';
MODULAR: '%';

calculation: (IDENTIFIER | VAR_VALUE | method) (ADD | SUBTRACT | MULTIPLY | DIVIDE | MODULAR) (IDENTIFIER | VAR_VALUE | method) ((ADD | SUBTRACT | MULTIPLY | DIVIDE | MODULAR) (IDENTIFIER | VAR_VALUE | method))*;

equality: IDENTIFIER EQUALS (calculation | VAR_VALUE | IDENTIFIER | method);
define_var: type_name_array IDENTIFIER (EQUALS (new_object | calculation | VAR_VALUE | IDENTIFIER | method))?;
method: (type_name '.')? IDENTIFIER (first_passed_args)? ('.'IDENTIFIER('('passed_args?')')?)*;

first_passed_args: '('passed_args?')';

statement: define_var | equality | method | define_for | define_if;

// 조건문

IF: '만약';

TRUE: '참';
FALSE: '거짓';

BIGGER: '>';
NOT_BIGGER: '<=';
SMALLER: '<';
NOT_SMALLER: '>=';
EQUAL: '==';

compare: (calculation | VAR_VALUE | IDENTIFIER | method) (BIGGER | NOT_BIGGER | SMALLER | NOT_SMALLER | EQUAL) (calculation | VAR_VALUE | IDENTIFIER | method);

single_boolean: TRUE | FALSE | compare | method;

AND: '이고';
OR: '이거나';

booleans: single_boolean ((AND | OR) single_boolean)*;

define_if: IF COLON booleans statement* SEMICOLON;

//반복문

FOR: '반복';

FORCONNECTOR1: '으로';
FORCONNECTOR2: '동안';

for_start: IDENTIFIER | define_var;
for_statement: equality | method;

define_for: FOR COLON for_start FORCONNECTOR1 booleans FORCONNECTOR2 for_statement statement* SEMICOLON;

// 패키지

PACKAGE_STATE: '제작';
PACKAGE_IMPORT: '도입';

package_name: IDENTIFIER ('.' IDENTIFIER)*;

// 기본 선언

WHITESPACE: (' ' | '\t' | NEWLINE) -> channel(HIDDEN);

fragment NEWLINE: '\r' | '\n' | '\r\n';

fragment DIGIT: [0-9];

fragment ALPHABET_LOWERCASE: [a-z];
fragment ALPHABET_UPPERCASE: [A-Z];

fragment ALPHABET: (ALPHABET_LOWERCASE | ALPHABET_UPPERCASE);

fragment SPECIAL_CHAR1: [\u0020-\u002F];
fragment SPECIAL_CHAR2: [\u003A-\u0040];
fragment SPECIAL_CHAR3: [\u005B-\u0060];
fragment SPECIAL_CHAR4: [\u007B-\u007E];

fragment SPECIAL_CHAR: (SPECIAL_CHAR1 | SPECIAL_CHAR2 | SPECIAL_CHAR3 | SPECIAL_CHAR4);

fragment HANGEUL_FULL: [\uAC00-\uD7AF];
fragment HANGEUL_ALPAHBET: [\u3131-\u319E];

fragment HANGEUL: (HANGEUL_FULL | HANGEUL_ALPAHBET);

fragment ID_SOURCES: (HANGEUL | ALPHABET | DIGIT | '_');

IDENTIFIER: (ID_SOURCES)+;

fragment VALUE_CHAR: (HANGEUL | ALPHABET | DIGIT | SPECIAL_CHAR)?;
fragment VALUE_STRING: (HANGEUL | ALPHABET | DIGIT | SPECIAL_CHAR)*;
fragment VALUE_INT: DIGIT;
fragment VALUE_FLOAT: DIGIT('.'DIGIT)?;

VAR_VALUE: (SINGLEQOUTE VALUE_CHAR SINGLEQOUTE) | (DOUBLEQOUTE VALUE_STRING DOUBLEQOUTE) | VALUE_INT | VALUE_FLOAT;

COLON: ':';
SEMICOLON: ';';

SINGLEQOUTE: '\'';
DOUBLEQOUTE: '"';

EQUALS: '=';

ARRAY: '의 배열';
EXTEND: '를 상속하는' | '을 상속하는';