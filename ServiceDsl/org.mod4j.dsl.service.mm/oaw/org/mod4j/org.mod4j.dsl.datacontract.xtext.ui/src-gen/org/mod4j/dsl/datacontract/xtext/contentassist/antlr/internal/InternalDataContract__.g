lexer grammar InternalDataContract;
@header {
package org.mod4j.dsl.datacontract.xtext.contentassist.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ui.common.editor.contentassist.antlr.internal.Lexer;
}

T11 : 'import' ;
T12 : 'businessclass' ;
T13 : 'enumeration' ;
T14 : ';' ;
T15 : 'datacontract' ;
T16 : 'from' ;
T17 : 'class' ;
T18 : 'represents' ;
T19 : '[' ;
T20 : ']' ;
T21 : 'references' ;
T22 : 'as' ;
T23 : 'custom' ;
T24 : 'boolean' ;
T25 : 'string' ;
T26 : 'datetime' ;
T27 : 'integer' ;
T28 : 'decimal' ;

// $ANTLR src "../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g" 2615
RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

// $ANTLR src "../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g" 2617
RULE_INT : ('0'..'9')+;

// $ANTLR src "../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g" 2619
RULE_STRING : ('"' ('\\' ('b'|'t'|'n'|'f'|'r'|'"'|'\''|'\\')|~(('\\'|'"')))* '"'|'\'' ('\\' ('b'|'t'|'n'|'f'|'r'|'"'|'\''|'\\')|~(('\\'|'\'')))* '\'');

// $ANTLR src "../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g" 2621
RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

// $ANTLR src "../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g" 2623
RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

// $ANTLR src "../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g" 2625
RULE_WS : (' '|'\t'|'\r'|'\n')+;

// $ANTLR src "../org.mod4j.dsl.datacontract.xtext.ui/src-gen/org/mod4j/dsl/datacontract/xtext/contentassist/antlr/internal/InternalDataContract.g" 2627
RULE_ANY_OTHER : .;


