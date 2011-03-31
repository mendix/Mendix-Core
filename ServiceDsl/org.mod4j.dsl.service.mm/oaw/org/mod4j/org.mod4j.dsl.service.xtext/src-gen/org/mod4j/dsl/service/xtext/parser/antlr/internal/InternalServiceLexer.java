package org.mendix.dsl.service.xtext.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

public class InternalServiceLexer extends Lexer {
    public static final int RULE_ID=5;
    public static final int RULE_ANY_OTHER=10;
    public static final int T29=29;
    public static final int T28=28;
    public static final int T27=27;
    public static final int T26=26;
    public static final int T25=25;
    public static final int Tokens=34;
    public static final int T24=24;
    public static final int EOF=-1;
    public static final int RULE_SL_COMMENT=8;
    public static final int T23=23;
    public static final int T22=22;
    public static final int T21=21;
    public static final int T20=20;
    public static final int RULE_ML_COMMENT=7;
    public static final int RULE_STRING=4;
    public static final int RULE_INT=6;
    public static final int T11=11;
    public static final int T12=12;
    public static final int T13=13;
    public static final int T14=14;
    public static final int RULE_WS=9;
    public static final int T15=15;
    public static final int T33=33;
    public static final int T16=16;
    public static final int T17=17;
    public static final int T18=18;
    public static final int T30=30;
    public static final int T19=19;
    public static final int T32=32;
    public static final int T31=31;
    public InternalServiceLexer() {;} 
    public InternalServiceLexer(CharStream input) {
        super(input);
    }
    public String getGrammarFileName() { return "../org.mendix.dsl.service.xtext/src-gen/org/mendix/dsl/service/xtext/parser/antlr/internal/InternalService.g"; }

    // $ANTLR start T11
    public final void mT11() throws RecognitionException {
        try {
            int _type = T11;
            // ../org.mendix.dsl.service.xtext/src-gen/org/mendix/dsl/service/xtext/parser/antlr/internal/InternalService.g:10:5: ( 'service' )
            // ../org.mendix.dsl.service.xtext/src-gen/org/mendix/dsl/service/xtext/parser/antlr/internal/InternalService.g:10:7: 'service'
            {
            match("service"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T11

    // $ANTLR start T12
    public final void mT12() throws RecognitionException {
        try {
            int _type = T12;
            // ../org.mendix.dsl.service.xtext/src-gen/org/mendix/dsl/service/xtext/parser/antlr/internal/InternalService.g:11:5: ( ';' )
            // ../org.mendix.dsl.service.xtext/src-gen/org/mendix/dsl/service/xtext/parser/antlr/internal/InternalService.g:11:7: ';'
            {
            match(';'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T12

    // $ANTLR start T13
    public final void mT13() throws RecognitionException {
        try {
            int _type = T13;
            // ../org.mendix.dsl.service.xtext/src-gen/org/mendix/dsl/service/xtext/parser/antlr/internal/InternalService.g:12:5: ( 'for' )
            // ../org.mendix.dsl.service.xtext/src-gen/org/mendix/dsl/service/xtext/parser/antlr/internal/InternalService.g:12:7: 'for'
            {
            match("for"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T13

    // $ANTLR start T14
    public final void mT14() throws RecognitionException {
        try {
            int _type = T14;
            // ../org.mendix.dsl.service.xtext/src-gen/org/mendix/dsl/service/xtext/parser/antlr/internal/InternalService.g:13:5: ( 'reference' )
            // ../org.mendix.dsl.service.xtext/src-gen/org/mendix/dsl/service/xtext/parser/antlr/internal/InternalService.g:13:7: 'reference'
            {
            match("reference"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T14

    // $ANTLR start T15
    public final void mT15() throws RecognitionException {
        try {
            int _type = T15;
            // ../org.mendix.dsl.service.xtext/src-gen/org/mendix/dsl/service/xtext/parser/antlr/internal/InternalService.g:14:5: ( 'from' )
            // ../org.mendix.dsl.service.xtext/src-gen/org/mendix/dsl/service/xtext/parser/antlr/internal/InternalService.g:14:7: 'from'
            {
            match("from"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T15

    // $ANTLR start T16
    public final void mT16() throws RecognitionException {
        try {
            int _type = T16;
            // ../org.mendix.dsl.service.xtext/src-gen/org/mendix/dsl/service/xtext/parser/antlr/internal/InternalService.g:15:5: ( 'import' )
            // ../org.mendix.dsl.service.xtext/src-gen/org/mendix/dsl/service/xtext/parser/antlr/internal/InternalService.g:15:7: 'import'
            {
            match("import"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T16

    // $ANTLR start T17
    public final void mT17() throws RecognitionException {
        try {
            int _type = T17;
            // ../org.mendix.dsl.service.xtext/src-gen/org/mendix/dsl/service/xtext/parser/antlr/internal/InternalService.g:16:5: ( 'method' )
            // ../org.mendix.dsl.service.xtext/src-gen/org/mendix/dsl/service/xtext/parser/antlr/internal/InternalService.g:16:7: 'method'
            {
            match("method"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T17

    // $ANTLR start T18
    public final void mT18() throws RecognitionException {
        try {
            int _type = T18;
            // ../org.mendix.dsl.service.xtext/src-gen/org/mendix/dsl/service/xtext/parser/antlr/internal/InternalService.g:17:5: ( 'in' )
            // ../org.mendix.dsl.service.xtext/src-gen/org/mendix/dsl/service/xtext/parser/antlr/internal/InternalService.g:17:7: 'in'
            {
            match("in"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T18

    // $ANTLR start T19
    public final void mT19() throws RecognitionException {
        try {
            int _type = T19;
            // ../org.mendix.dsl.service.xtext/src-gen/org/mendix/dsl/service/xtext/parser/antlr/internal/InternalService.g:18:5: ( '(' )
            // ../org.mendix.dsl.service.xtext/src-gen/org/mendix/dsl/service/xtext/parser/antlr/internal/InternalService.g:18:7: '('
            {
            match('('); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T19

    // $ANTLR start T20
    public final void mT20() throws RecognitionException {
        try {
            int _type = T20;
            // ../org.mendix.dsl.service.xtext/src-gen/org/mendix/dsl/service/xtext/parser/antlr/internal/InternalService.g:19:5: ( ',' )
            // ../org.mendix.dsl.service.xtext/src-gen/org/mendix/dsl/service/xtext/parser/antlr/internal/InternalService.g:19:7: ','
            {
            match(','); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T20

    // $ANTLR start T21
    public final void mT21() throws RecognitionException {
        try {
            int _type = T21;
            // ../org.mendix.dsl.service.xtext/src-gen/org/mendix/dsl/service/xtext/parser/antlr/internal/InternalService.g:20:5: ( ')' )
            // ../org.mendix.dsl.service.xtext/src-gen/org/mendix/dsl/service/xtext/parser/antlr/internal/InternalService.g:20:7: ')'
            {
            match(')'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T21

    // $ANTLR start T22
    public final void mT22() throws RecognitionException {
        try {
            int _type = T22;
            // ../org.mendix.dsl.service.xtext/src-gen/org/mendix/dsl/service/xtext/parser/antlr/internal/InternalService.g:21:5: ( 'out' )
            // ../org.mendix.dsl.service.xtext/src-gen/org/mendix/dsl/service/xtext/parser/antlr/internal/InternalService.g:21:7: 'out'
            {
            match("out"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T22

    // $ANTLR start T23
    public final void mT23() throws RecognitionException {
        try {
            int _type = T23;
            // ../org.mendix.dsl.service.xtext/src-gen/org/mendix/dsl/service/xtext/parser/antlr/internal/InternalService.g:22:5: ( 'crud' )
            // ../org.mendix.dsl.service.xtext/src-gen/org/mendix/dsl/service/xtext/parser/antlr/internal/InternalService.g:22:7: 'crud'
            {
            match("crud"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T23

    // $ANTLR start T24
    public final void mT24() throws RecognitionException {
        try {
            int _type = T24;
            // ../org.mendix.dsl.service.xtext/src-gen/org/mendix/dsl/service/xtext/parser/antlr/internal/InternalService.g:23:5: ( 'create' )
            // ../org.mendix.dsl.service.xtext/src-gen/org/mendix/dsl/service/xtext/parser/antlr/internal/InternalService.g:23:7: 'create'
            {
            match("create"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T24

    // $ANTLR start T25
    public final void mT25() throws RecognitionException {
        try {
            int _type = T25;
            // ../org.mendix.dsl.service.xtext/src-gen/org/mendix/dsl/service/xtext/parser/antlr/internal/InternalService.g:24:5: ( 'read' )
            // ../org.mendix.dsl.service.xtext/src-gen/org/mendix/dsl/service/xtext/parser/antlr/internal/InternalService.g:24:7: 'read'
            {
            match("read"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T25

    // $ANTLR start T26
    public final void mT26() throws RecognitionException {
        try {
            int _type = T26;
            // ../org.mendix.dsl.service.xtext/src-gen/org/mendix/dsl/service/xtext/parser/antlr/internal/InternalService.g:25:5: ( 'update' )
            // ../org.mendix.dsl.service.xtext/src-gen/org/mendix/dsl/service/xtext/parser/antlr/internal/InternalService.g:25:7: 'update'
            {
            match("update"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T26

    // $ANTLR start T27
    public final void mT27() throws RecognitionException {
        try {
            int _type = T27;
            // ../org.mendix.dsl.service.xtext/src-gen/org/mendix/dsl/service/xtext/parser/antlr/internal/InternalService.g:26:5: ( 'delete' )
            // ../org.mendix.dsl.service.xtext/src-gen/org/mendix/dsl/service/xtext/parser/antlr/internal/InternalService.g:26:7: 'delete'
            {
            match("delete"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T27

    // $ANTLR start T28
    public final void mT28() throws RecognitionException {
        try {
            int _type = T28;
            // ../org.mendix.dsl.service.xtext/src-gen/org/mendix/dsl/service/xtext/parser/antlr/internal/InternalService.g:27:5: ( 'listall' )
            // ../org.mendix.dsl.service.xtext/src-gen/org/mendix/dsl/service/xtext/parser/antlr/internal/InternalService.g:27:7: 'listall'
            {
            match("listall"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T28

    // $ANTLR start T29
    public final void mT29() throws RecognitionException {
        try {
            int _type = T29;
            // ../org.mendix.dsl.service.xtext/src-gen/org/mendix/dsl/service/xtext/parser/antlr/internal/InternalService.g:28:5: ( 'find' )
            // ../org.mendix.dsl.service.xtext/src-gen/org/mendix/dsl/service/xtext/parser/antlr/internal/InternalService.g:28:7: 'find'
            {
            match("find"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T29

    // $ANTLR start T30
    public final void mT30() throws RecognitionException {
        try {
            int _type = T30;
            // ../org.mendix.dsl.service.xtext/src-gen/org/mendix/dsl/service/xtext/parser/antlr/internal/InternalService.g:29:5: ( 'add' )
            // ../org.mendix.dsl.service.xtext/src-gen/org/mendix/dsl/service/xtext/parser/antlr/internal/InternalService.g:29:7: 'add'
            {
            match("add"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T30

    // $ANTLR start T31
    public final void mT31() throws RecognitionException {
        try {
            int _type = T31;
            // ../org.mendix.dsl.service.xtext/src-gen/org/mendix/dsl/service/xtext/parser/antlr/internal/InternalService.g:30:5: ( 'remove' )
            // ../org.mendix.dsl.service.xtext/src-gen/org/mendix/dsl/service/xtext/parser/antlr/internal/InternalService.g:30:7: 'remove'
            {
            match("remove"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T31

    // $ANTLR start T32
    public final void mT32() throws RecognitionException {
        try {
            int _type = T32;
            // ../org.mendix.dsl.service.xtext/src-gen/org/mendix/dsl/service/xtext/parser/antlr/internal/InternalService.g:31:5: ( 'get' )
            // ../org.mendix.dsl.service.xtext/src-gen/org/mendix/dsl/service/xtext/parser/antlr/internal/InternalService.g:31:7: 'get'
            {
            match("get"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T32

    // $ANTLR start T33
    public final void mT33() throws RecognitionException {
        try {
            int _type = T33;
            // ../org.mendix.dsl.service.xtext/src-gen/org/mendix/dsl/service/xtext/parser/antlr/internal/InternalService.g:32:5: ( 'list' )
            // ../org.mendix.dsl.service.xtext/src-gen/org/mendix/dsl/service/xtext/parser/antlr/internal/InternalService.g:32:7: 'list'
            {
            match("list"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T33

    // $ANTLR start RULE_ID
    public final void mRULE_ID() throws RecognitionException {
        try {
            int _type = RULE_ID;
            // ../org.mendix.dsl.service.xtext/src-gen/org/mendix/dsl/service/xtext/parser/antlr/internal/InternalService.g:1057:9: ( ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
            // ../org.mendix.dsl.service.xtext/src-gen/org/mendix/dsl/service/xtext/parser/antlr/internal/InternalService.g:1057:11: ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            {
            // ../org.mendix.dsl.service.xtext/src-gen/org/mendix/dsl/service/xtext/parser/antlr/internal/InternalService.g:1057:11: ( '^' )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0=='^') ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // ../org.mendix.dsl.service.xtext/src-gen/org/mendix/dsl/service/xtext/parser/antlr/internal/InternalService.g:1057:11: '^'
                    {
                    match('^'); 

                    }
                    break;

            }

            if ( (input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recover(mse);    throw mse;
            }

            // ../org.mendix.dsl.service.xtext/src-gen/org/mendix/dsl/service/xtext/parser/antlr/internal/InternalService.g:1057:40: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( ((LA2_0>='0' && LA2_0<='9')||(LA2_0>='A' && LA2_0<='Z')||LA2_0=='_'||(LA2_0>='a' && LA2_0<='z')) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // ../org.mendix.dsl.service.xtext/src-gen/org/mendix/dsl/service/xtext/parser/antlr/internal/InternalService.g:
            	    {
            	    if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse =
            	            new MismatchedSetException(null,input);
            	        recover(mse);    throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end RULE_ID

    // $ANTLR start RULE_INT
    public final void mRULE_INT() throws RecognitionException {
        try {
            int _type = RULE_INT;
            // ../org.mendix.dsl.service.xtext/src-gen/org/mendix/dsl/service/xtext/parser/antlr/internal/InternalService.g:1059:10: ( ( '0' .. '9' )+ )
            // ../org.mendix.dsl.service.xtext/src-gen/org/mendix/dsl/service/xtext/parser/antlr/internal/InternalService.g:1059:12: ( '0' .. '9' )+
            {
            // ../org.mendix.dsl.service.xtext/src-gen/org/mendix/dsl/service/xtext/parser/antlr/internal/InternalService.g:1059:12: ( '0' .. '9' )+
            int cnt3=0;
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( ((LA3_0>='0' && LA3_0<='9')) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // ../org.mendix.dsl.service.xtext/src-gen/org/mendix/dsl/service/xtext/parser/antlr/internal/InternalService.g:1059:13: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

            	    }
            	    break;

            	default :
            	    if ( cnt3 >= 1 ) break loop3;
                        EarlyExitException eee =
                            new EarlyExitException(3, input);
                        throw eee;
                }
                cnt3++;
            } while (true);


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end RULE_INT

    // $ANTLR start RULE_STRING
    public final void mRULE_STRING() throws RecognitionException {
        try {
            int _type = RULE_STRING;
            // ../org.mendix.dsl.service.xtext/src-gen/org/mendix/dsl/service/xtext/parser/antlr/internal/InternalService.g:1061:13: ( ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' ) )
            // ../org.mendix.dsl.service.xtext/src-gen/org/mendix/dsl/service/xtext/parser/antlr/internal/InternalService.g:1061:15: ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            {
            // ../org.mendix.dsl.service.xtext/src-gen/org/mendix/dsl/service/xtext/parser/antlr/internal/InternalService.g:1061:15: ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0=='\"') ) {
                alt6=1;
            }
            else if ( (LA6_0=='\'') ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("1061:15: ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // ../org.mendix.dsl.service.xtext/src-gen/org/mendix/dsl/service/xtext/parser/antlr/internal/InternalService.g:1061:16: '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
                    {
                    match('\"'); 
                    // ../org.mendix.dsl.service.xtext/src-gen/org/mendix/dsl/service/xtext/parser/antlr/internal/InternalService.g:1061:20: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )*
                    loop4:
                    do {
                        int alt4=3;
                        int LA4_0 = input.LA(1);

                        if ( (LA4_0=='\\') ) {
                            alt4=1;
                        }
                        else if ( ((LA4_0>='\u0000' && LA4_0<='!')||(LA4_0>='#' && LA4_0<='[')||(LA4_0>=']' && LA4_0<='\uFFFE')) ) {
                            alt4=2;
                        }


                        switch (alt4) {
                    	case 1 :
                    	    // ../org.mendix.dsl.service.xtext/src-gen/org/mendix/dsl/service/xtext/parser/antlr/internal/InternalService.g:1061:21: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' )
                    	    {
                    	    match('\\'); 
                    	    if ( input.LA(1)=='\"'||input.LA(1)=='\''||input.LA(1)=='\\'||input.LA(1)=='b'||input.LA(1)=='f'||input.LA(1)=='n'||input.LA(1)=='r'||input.LA(1)=='t' ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse =
                    	            new MismatchedSetException(null,input);
                    	        recover(mse);    throw mse;
                    	    }


                    	    }
                    	    break;
                    	case 2 :
                    	    // ../org.mendix.dsl.service.xtext/src-gen/org/mendix/dsl/service/xtext/parser/antlr/internal/InternalService.g:1061:62: ~ ( ( '\\\\' | '\"' ) )
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='!')||(input.LA(1)>='#' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFE') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse =
                    	            new MismatchedSetException(null,input);
                    	        recover(mse);    throw mse;
                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop4;
                        }
                    } while (true);

                    match('\"'); 

                    }
                    break;
                case 2 :
                    // ../org.mendix.dsl.service.xtext/src-gen/org/mendix/dsl/service/xtext/parser/antlr/internal/InternalService.g:1061:82: '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\''
                    {
                    match('\''); 
                    // ../org.mendix.dsl.service.xtext/src-gen/org/mendix/dsl/service/xtext/parser/antlr/internal/InternalService.g:1061:87: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )*
                    loop5:
                    do {
                        int alt5=3;
                        int LA5_0 = input.LA(1);

                        if ( (LA5_0=='\\') ) {
                            alt5=1;
                        }
                        else if ( ((LA5_0>='\u0000' && LA5_0<='&')||(LA5_0>='(' && LA5_0<='[')||(LA5_0>=']' && LA5_0<='\uFFFE')) ) {
                            alt5=2;
                        }


                        switch (alt5) {
                    	case 1 :
                    	    // ../org.mendix.dsl.service.xtext/src-gen/org/mendix/dsl/service/xtext/parser/antlr/internal/InternalService.g:1061:88: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' )
                    	    {
                    	    match('\\'); 
                    	    if ( input.LA(1)=='\"'||input.LA(1)=='\''||input.LA(1)=='\\'||input.LA(1)=='b'||input.LA(1)=='f'||input.LA(1)=='n'||input.LA(1)=='r'||input.LA(1)=='t' ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse =
                    	            new MismatchedSetException(null,input);
                    	        recover(mse);    throw mse;
                    	    }


                    	    }
                    	    break;
                    	case 2 :
                    	    // ../org.mendix.dsl.service.xtext/src-gen/org/mendix/dsl/service/xtext/parser/antlr/internal/InternalService.g:1061:129: ~ ( ( '\\\\' | '\\'' ) )
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='&')||(input.LA(1)>='(' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFE') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse =
                    	            new MismatchedSetException(null,input);
                    	        recover(mse);    throw mse;
                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop5;
                        }
                    } while (true);

                    match('\''); 

                    }
                    break;

            }


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end RULE_STRING

    // $ANTLR start RULE_ML_COMMENT
    public final void mRULE_ML_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_ML_COMMENT;
            // ../org.mendix.dsl.service.xtext/src-gen/org/mendix/dsl/service/xtext/parser/antlr/internal/InternalService.g:1063:17: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // ../org.mendix.dsl.service.xtext/src-gen/org/mendix/dsl/service/xtext/parser/antlr/internal/InternalService.g:1063:19: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // ../org.mendix.dsl.service.xtext/src-gen/org/mendix/dsl/service/xtext/parser/antlr/internal/InternalService.g:1063:24: ( options {greedy=false; } : . )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0=='*') ) {
                    int LA7_1 = input.LA(2);

                    if ( (LA7_1=='/') ) {
                        alt7=2;
                    }
                    else if ( ((LA7_1>='\u0000' && LA7_1<='.')||(LA7_1>='0' && LA7_1<='\uFFFE')) ) {
                        alt7=1;
                    }


                }
                else if ( ((LA7_0>='\u0000' && LA7_0<=')')||(LA7_0>='+' && LA7_0<='\uFFFE')) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // ../org.mendix.dsl.service.xtext/src-gen/org/mendix/dsl/service/xtext/parser/antlr/internal/InternalService.g:1063:52: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

            match("*/"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end RULE_ML_COMMENT

    // $ANTLR start RULE_SL_COMMENT
    public final void mRULE_SL_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_SL_COMMENT;
            // ../org.mendix.dsl.service.xtext/src-gen/org/mendix/dsl/service/xtext/parser/antlr/internal/InternalService.g:1065:17: ( '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // ../org.mendix.dsl.service.xtext/src-gen/org/mendix/dsl/service/xtext/parser/antlr/internal/InternalService.g:1065:19: '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match("//"); 

            // ../org.mendix.dsl.service.xtext/src-gen/org/mendix/dsl/service/xtext/parser/antlr/internal/InternalService.g:1065:24: (~ ( ( '\\n' | '\\r' ) ) )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( ((LA8_0>='\u0000' && LA8_0<='\t')||(LA8_0>='\u000B' && LA8_0<='\f')||(LA8_0>='\u000E' && LA8_0<='\uFFFE')) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // ../org.mendix.dsl.service.xtext/src-gen/org/mendix/dsl/service/xtext/parser/antlr/internal/InternalService.g:1065:24: ~ ( ( '\\n' | '\\r' ) )
            	    {
            	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='\t')||(input.LA(1)>='\u000B' && input.LA(1)<='\f')||(input.LA(1)>='\u000E' && input.LA(1)<='\uFFFE') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse =
            	            new MismatchedSetException(null,input);
            	        recover(mse);    throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

            // ../org.mendix.dsl.service.xtext/src-gen/org/mendix/dsl/service/xtext/parser/antlr/internal/InternalService.g:1065:40: ( ( '\\r' )? '\\n' )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0=='\n'||LA10_0=='\r') ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // ../org.mendix.dsl.service.xtext/src-gen/org/mendix/dsl/service/xtext/parser/antlr/internal/InternalService.g:1065:41: ( '\\r' )? '\\n'
                    {
                    // ../org.mendix.dsl.service.xtext/src-gen/org/mendix/dsl/service/xtext/parser/antlr/internal/InternalService.g:1065:41: ( '\\r' )?
                    int alt9=2;
                    int LA9_0 = input.LA(1);

                    if ( (LA9_0=='\r') ) {
                        alt9=1;
                    }
                    switch (alt9) {
                        case 1 :
                            // ../org.mendix.dsl.service.xtext/src-gen/org/mendix/dsl/service/xtext/parser/antlr/internal/InternalService.g:1065:41: '\\r'
                            {
                            match('\r'); 

                            }
                            break;

                    }

                    match('\n'); 

                    }
                    break;

            }


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end RULE_SL_COMMENT

    // $ANTLR start RULE_WS
    public final void mRULE_WS() throws RecognitionException {
        try {
            int _type = RULE_WS;
            // ../org.mendix.dsl.service.xtext/src-gen/org/mendix/dsl/service/xtext/parser/antlr/internal/InternalService.g:1067:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // ../org.mendix.dsl.service.xtext/src-gen/org/mendix/dsl/service/xtext/parser/antlr/internal/InternalService.g:1067:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // ../org.mendix.dsl.service.xtext/src-gen/org/mendix/dsl/service/xtext/parser/antlr/internal/InternalService.g:1067:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            int cnt11=0;
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( ((LA11_0>='\t' && LA11_0<='\n')||LA11_0=='\r'||LA11_0==' ') ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // ../org.mendix.dsl.service.xtext/src-gen/org/mendix/dsl/service/xtext/parser/antlr/internal/InternalService.g:
            	    {
            	    if ( (input.LA(1)>='\t' && input.LA(1)<='\n')||input.LA(1)=='\r'||input.LA(1)==' ' ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse =
            	            new MismatchedSetException(null,input);
            	        recover(mse);    throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt11 >= 1 ) break loop11;
                        EarlyExitException eee =
                            new EarlyExitException(11, input);
                        throw eee;
                }
                cnt11++;
            } while (true);


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end RULE_WS

    // $ANTLR start RULE_ANY_OTHER
    public final void mRULE_ANY_OTHER() throws RecognitionException {
        try {
            int _type = RULE_ANY_OTHER;
            // ../org.mendix.dsl.service.xtext/src-gen/org/mendix/dsl/service/xtext/parser/antlr/internal/InternalService.g:1069:16: ( . )
            // ../org.mendix.dsl.service.xtext/src-gen/org/mendix/dsl/service/xtext/parser/antlr/internal/InternalService.g:1069:18: .
            {
            matchAny(); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end RULE_ANY_OTHER

    public void mTokens() throws RecognitionException {
        // ../org.mendix.dsl.service.xtext/src-gen/org/mendix/dsl/service/xtext/parser/antlr/internal/InternalService.g:1:8: ( T11 | T12 | T13 | T14 | T15 | T16 | T17 | T18 | T19 | T20 | T21 | T22 | T23 | T24 | T25 | T26 | T27 | T28 | T29 | T30 | T31 | T32 | T33 | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER )
        int alt12=30;
        int LA12_0 = input.LA(1);

        if ( (LA12_0=='s') ) {
            int LA12_1 = input.LA(2);

            if ( (LA12_1=='e') ) {
                int LA12_25 = input.LA(3);

                if ( (LA12_25=='r') ) {
                    int LA12_50 = input.LA(4);

                    if ( (LA12_50=='v') ) {
                        int LA12_68 = input.LA(5);

                        if ( (LA12_68=='i') ) {
                            int LA12_85 = input.LA(6);

                            if ( (LA12_85=='c') ) {
                                int LA12_99 = input.LA(7);

                                if ( (LA12_99=='e') ) {
                                    int LA12_108 = input.LA(8);

                                    if ( ((LA12_108>='0' && LA12_108<='9')||(LA12_108>='A' && LA12_108<='Z')||LA12_108=='_'||(LA12_108>='a' && LA12_108<='z')) ) {
                                        alt12=24;
                                    }
                                    else {
                                        alt12=1;}
                                }
                                else {
                                    alt12=24;}
                            }
                            else {
                                alt12=24;}
                        }
                        else {
                            alt12=24;}
                    }
                    else {
                        alt12=24;}
                }
                else {
                    alt12=24;}
            }
            else {
                alt12=24;}
        }
        else if ( (LA12_0==';') ) {
            alt12=2;
        }
        else if ( (LA12_0=='f') ) {
            switch ( input.LA(2) ) {
            case 'i':
                {
                int LA12_28 = input.LA(3);

                if ( (LA12_28=='n') ) {
                    int LA12_51 = input.LA(4);

                    if ( (LA12_51=='d') ) {
                        int LA12_69 = input.LA(5);

                        if ( ((LA12_69>='0' && LA12_69<='9')||(LA12_69>='A' && LA12_69<='Z')||LA12_69=='_'||(LA12_69>='a' && LA12_69<='z')) ) {
                            alt12=24;
                        }
                        else {
                            alt12=19;}
                    }
                    else {
                        alt12=24;}
                }
                else {
                    alt12=24;}
                }
                break;
            case 'o':
                {
                int LA12_29 = input.LA(3);

                if ( (LA12_29=='r') ) {
                    int LA12_52 = input.LA(4);

                    if ( ((LA12_52>='0' && LA12_52<='9')||(LA12_52>='A' && LA12_52<='Z')||LA12_52=='_'||(LA12_52>='a' && LA12_52<='z')) ) {
                        alt12=24;
                    }
                    else {
                        alt12=3;}
                }
                else {
                    alt12=24;}
                }
                break;
            case 'r':
                {
                int LA12_30 = input.LA(3);

                if ( (LA12_30=='o') ) {
                    int LA12_53 = input.LA(4);

                    if ( (LA12_53=='m') ) {
                        int LA12_71 = input.LA(5);

                        if ( ((LA12_71>='0' && LA12_71<='9')||(LA12_71>='A' && LA12_71<='Z')||LA12_71=='_'||(LA12_71>='a' && LA12_71<='z')) ) {
                            alt12=24;
                        }
                        else {
                            alt12=5;}
                    }
                    else {
                        alt12=24;}
                }
                else {
                    alt12=24;}
                }
                break;
            default:
                alt12=24;}

        }
        else if ( (LA12_0=='r') ) {
            int LA12_4 = input.LA(2);

            if ( (LA12_4=='e') ) {
                switch ( input.LA(3) ) {
                case 'a':
                    {
                    int LA12_54 = input.LA(4);

                    if ( (LA12_54=='d') ) {
                        int LA12_72 = input.LA(5);

                        if ( ((LA12_72>='0' && LA12_72<='9')||(LA12_72>='A' && LA12_72<='Z')||LA12_72=='_'||(LA12_72>='a' && LA12_72<='z')) ) {
                            alt12=24;
                        }
                        else {
                            alt12=15;}
                    }
                    else {
                        alt12=24;}
                    }
                    break;
                case 'f':
                    {
                    int LA12_55 = input.LA(4);

                    if ( (LA12_55=='e') ) {
                        int LA12_73 = input.LA(5);

                        if ( (LA12_73=='r') ) {
                            int LA12_89 = input.LA(6);

                            if ( (LA12_89=='e') ) {
                                int LA12_100 = input.LA(7);

                                if ( (LA12_100=='n') ) {
                                    int LA12_109 = input.LA(8);

                                    if ( (LA12_109=='c') ) {
                                        int LA12_118 = input.LA(9);

                                        if ( (LA12_118=='e') ) {
                                            int LA12_120 = input.LA(10);

                                            if ( ((LA12_120>='0' && LA12_120<='9')||(LA12_120>='A' && LA12_120<='Z')||LA12_120=='_'||(LA12_120>='a' && LA12_120<='z')) ) {
                                                alt12=24;
                                            }
                                            else {
                                                alt12=4;}
                                        }
                                        else {
                                            alt12=24;}
                                    }
                                    else {
                                        alt12=24;}
                                }
                                else {
                                    alt12=24;}
                            }
                            else {
                                alt12=24;}
                        }
                        else {
                            alt12=24;}
                    }
                    else {
                        alt12=24;}
                    }
                    break;
                case 'm':
                    {
                    int LA12_56 = input.LA(4);

                    if ( (LA12_56=='o') ) {
                        int LA12_74 = input.LA(5);

                        if ( (LA12_74=='v') ) {
                            int LA12_90 = input.LA(6);

                            if ( (LA12_90=='e') ) {
                                int LA12_101 = input.LA(7);

                                if ( ((LA12_101>='0' && LA12_101<='9')||(LA12_101>='A' && LA12_101<='Z')||LA12_101=='_'||(LA12_101>='a' && LA12_101<='z')) ) {
                                    alt12=24;
                                }
                                else {
                                    alt12=21;}
                            }
                            else {
                                alt12=24;}
                        }
                        else {
                            alt12=24;}
                    }
                    else {
                        alt12=24;}
                    }
                    break;
                default:
                    alt12=24;}

            }
            else {
                alt12=24;}
        }
        else if ( (LA12_0=='i') ) {
            switch ( input.LA(2) ) {
            case 'm':
                {
                int LA12_32 = input.LA(3);

                if ( (LA12_32=='p') ) {
                    int LA12_57 = input.LA(4);

                    if ( (LA12_57=='o') ) {
                        int LA12_75 = input.LA(5);

                        if ( (LA12_75=='r') ) {
                            int LA12_91 = input.LA(6);

                            if ( (LA12_91=='t') ) {
                                int LA12_102 = input.LA(7);

                                if ( ((LA12_102>='0' && LA12_102<='9')||(LA12_102>='A' && LA12_102<='Z')||LA12_102=='_'||(LA12_102>='a' && LA12_102<='z')) ) {
                                    alt12=24;
                                }
                                else {
                                    alt12=6;}
                            }
                            else {
                                alt12=24;}
                        }
                        else {
                            alt12=24;}
                    }
                    else {
                        alt12=24;}
                }
                else {
                    alt12=24;}
                }
                break;
            case 'n':
                {
                int LA12_33 = input.LA(3);

                if ( ((LA12_33>='0' && LA12_33<='9')||(LA12_33>='A' && LA12_33<='Z')||LA12_33=='_'||(LA12_33>='a' && LA12_33<='z')) ) {
                    alt12=24;
                }
                else {
                    alt12=8;}
                }
                break;
            default:
                alt12=24;}

        }
        else if ( (LA12_0=='m') ) {
            int LA12_6 = input.LA(2);

            if ( (LA12_6=='e') ) {
                int LA12_34 = input.LA(3);

                if ( (LA12_34=='t') ) {
                    int LA12_59 = input.LA(4);

                    if ( (LA12_59=='h') ) {
                        int LA12_76 = input.LA(5);

                        if ( (LA12_76=='o') ) {
                            int LA12_92 = input.LA(6);

                            if ( (LA12_92=='d') ) {
                                int LA12_103 = input.LA(7);

                                if ( ((LA12_103>='0' && LA12_103<='9')||(LA12_103>='A' && LA12_103<='Z')||LA12_103=='_'||(LA12_103>='a' && LA12_103<='z')) ) {
                                    alt12=24;
                                }
                                else {
                                    alt12=7;}
                            }
                            else {
                                alt12=24;}
                        }
                        else {
                            alt12=24;}
                    }
                    else {
                        alt12=24;}
                }
                else {
                    alt12=24;}
            }
            else {
                alt12=24;}
        }
        else if ( (LA12_0=='(') ) {
            alt12=9;
        }
        else if ( (LA12_0==',') ) {
            alt12=10;
        }
        else if ( (LA12_0==')') ) {
            alt12=11;
        }
        else if ( (LA12_0=='o') ) {
            int LA12_10 = input.LA(2);

            if ( (LA12_10=='u') ) {
                int LA12_38 = input.LA(3);

                if ( (LA12_38=='t') ) {
                    int LA12_60 = input.LA(4);

                    if ( ((LA12_60>='0' && LA12_60<='9')||(LA12_60>='A' && LA12_60<='Z')||LA12_60=='_'||(LA12_60>='a' && LA12_60<='z')) ) {
                        alt12=24;
                    }
                    else {
                        alt12=12;}
                }
                else {
                    alt12=24;}
            }
            else {
                alt12=24;}
        }
        else if ( (LA12_0=='c') ) {
            int LA12_11 = input.LA(2);

            if ( (LA12_11=='r') ) {
                switch ( input.LA(3) ) {
                case 'e':
                    {
                    int LA12_61 = input.LA(4);

                    if ( (LA12_61=='a') ) {
                        int LA12_78 = input.LA(5);

                        if ( (LA12_78=='t') ) {
                            int LA12_93 = input.LA(6);

                            if ( (LA12_93=='e') ) {
                                int LA12_104 = input.LA(7);

                                if ( ((LA12_104>='0' && LA12_104<='9')||(LA12_104>='A' && LA12_104<='Z')||LA12_104=='_'||(LA12_104>='a' && LA12_104<='z')) ) {
                                    alt12=24;
                                }
                                else {
                                    alt12=14;}
                            }
                            else {
                                alt12=24;}
                        }
                        else {
                            alt12=24;}
                    }
                    else {
                        alt12=24;}
                    }
                    break;
                case 'u':
                    {
                    int LA12_62 = input.LA(4);

                    if ( (LA12_62=='d') ) {
                        int LA12_79 = input.LA(5);

                        if ( ((LA12_79>='0' && LA12_79<='9')||(LA12_79>='A' && LA12_79<='Z')||LA12_79=='_'||(LA12_79>='a' && LA12_79<='z')) ) {
                            alt12=24;
                        }
                        else {
                            alt12=13;}
                    }
                    else {
                        alt12=24;}
                    }
                    break;
                default:
                    alt12=24;}

            }
            else {
                alt12=24;}
        }
        else if ( (LA12_0=='u') ) {
            int LA12_12 = input.LA(2);

            if ( (LA12_12=='p') ) {
                int LA12_40 = input.LA(3);

                if ( (LA12_40=='d') ) {
                    int LA12_63 = input.LA(4);

                    if ( (LA12_63=='a') ) {
                        int LA12_80 = input.LA(5);

                        if ( (LA12_80=='t') ) {
                            int LA12_95 = input.LA(6);

                            if ( (LA12_95=='e') ) {
                                int LA12_105 = input.LA(7);

                                if ( ((LA12_105>='0' && LA12_105<='9')||(LA12_105>='A' && LA12_105<='Z')||LA12_105=='_'||(LA12_105>='a' && LA12_105<='z')) ) {
                                    alt12=24;
                                }
                                else {
                                    alt12=16;}
                            }
                            else {
                                alt12=24;}
                        }
                        else {
                            alt12=24;}
                    }
                    else {
                        alt12=24;}
                }
                else {
                    alt12=24;}
            }
            else {
                alt12=24;}
        }
        else if ( (LA12_0=='d') ) {
            int LA12_13 = input.LA(2);

            if ( (LA12_13=='e') ) {
                int LA12_41 = input.LA(3);

                if ( (LA12_41=='l') ) {
                    int LA12_64 = input.LA(4);

                    if ( (LA12_64=='e') ) {
                        int LA12_81 = input.LA(5);

                        if ( (LA12_81=='t') ) {
                            int LA12_96 = input.LA(6);

                            if ( (LA12_96=='e') ) {
                                int LA12_106 = input.LA(7);

                                if ( ((LA12_106>='0' && LA12_106<='9')||(LA12_106>='A' && LA12_106<='Z')||LA12_106=='_'||(LA12_106>='a' && LA12_106<='z')) ) {
                                    alt12=24;
                                }
                                else {
                                    alt12=17;}
                            }
                            else {
                                alt12=24;}
                        }
                        else {
                            alt12=24;}
                    }
                    else {
                        alt12=24;}
                }
                else {
                    alt12=24;}
            }
            else {
                alt12=24;}
        }
        else if ( (LA12_0=='l') ) {
            int LA12_14 = input.LA(2);

            if ( (LA12_14=='i') ) {
                int LA12_42 = input.LA(3);

                if ( (LA12_42=='s') ) {
                    int LA12_65 = input.LA(4);

                    if ( (LA12_65=='t') ) {
                        switch ( input.LA(5) ) {
                        case 'a':
                            {
                            int LA12_97 = input.LA(6);

                            if ( (LA12_97=='l') ) {
                                int LA12_107 = input.LA(7);

                                if ( (LA12_107=='l') ) {
                                    int LA12_116 = input.LA(8);

                                    if ( ((LA12_116>='0' && LA12_116<='9')||(LA12_116>='A' && LA12_116<='Z')||LA12_116=='_'||(LA12_116>='a' && LA12_116<='z')) ) {
                                        alt12=24;
                                    }
                                    else {
                                        alt12=18;}
                                }
                                else {
                                    alt12=24;}
                            }
                            else {
                                alt12=24;}
                            }
                            break;
                        case '0':
                        case '1':
                        case '2':
                        case '3':
                        case '4':
                        case '5':
                        case '6':
                        case '7':
                        case '8':
                        case '9':
                        case 'A':
                        case 'B':
                        case 'C':
                        case 'D':
                        case 'E':
                        case 'F':
                        case 'G':
                        case 'H':
                        case 'I':
                        case 'J':
                        case 'K':
                        case 'L':
                        case 'M':
                        case 'N':
                        case 'O':
                        case 'P':
                        case 'Q':
                        case 'R':
                        case 'S':
                        case 'T':
                        case 'U':
                        case 'V':
                        case 'W':
                        case 'X':
                        case 'Y':
                        case 'Z':
                        case '_':
                        case 'b':
                        case 'c':
                        case 'd':
                        case 'e':
                        case 'f':
                        case 'g':
                        case 'h':
                        case 'i':
                        case 'j':
                        case 'k':
                        case 'l':
                        case 'm':
                        case 'n':
                        case 'o':
                        case 'p':
                        case 'q':
                        case 'r':
                        case 's':
                        case 't':
                        case 'u':
                        case 'v':
                        case 'w':
                        case 'x':
                        case 'y':
                        case 'z':
                            {
                            alt12=24;
                            }
                            break;
                        default:
                            alt12=23;}

                    }
                    else {
                        alt12=24;}
                }
                else {
                    alt12=24;}
            }
            else {
                alt12=24;}
        }
        else if ( (LA12_0=='a') ) {
            int LA12_15 = input.LA(2);

            if ( (LA12_15=='d') ) {
                int LA12_43 = input.LA(3);

                if ( (LA12_43=='d') ) {
                    int LA12_66 = input.LA(4);

                    if ( ((LA12_66>='0' && LA12_66<='9')||(LA12_66>='A' && LA12_66<='Z')||LA12_66=='_'||(LA12_66>='a' && LA12_66<='z')) ) {
                        alt12=24;
                    }
                    else {
                        alt12=20;}
                }
                else {
                    alt12=24;}
            }
            else {
                alt12=24;}
        }
        else if ( (LA12_0=='g') ) {
            int LA12_16 = input.LA(2);

            if ( (LA12_16=='e') ) {
                int LA12_44 = input.LA(3);

                if ( (LA12_44=='t') ) {
                    int LA12_67 = input.LA(4);

                    if ( ((LA12_67>='0' && LA12_67<='9')||(LA12_67>='A' && LA12_67<='Z')||LA12_67=='_'||(LA12_67>='a' && LA12_67<='z')) ) {
                        alt12=24;
                    }
                    else {
                        alt12=22;}
                }
                else {
                    alt12=24;}
            }
            else {
                alt12=24;}
        }
        else if ( (LA12_0=='^') ) {
            int LA12_17 = input.LA(2);

            if ( ((LA12_17>='A' && LA12_17<='Z')||LA12_17=='_'||(LA12_17>='a' && LA12_17<='z')) ) {
                alt12=24;
            }
            else {
                alt12=30;}
        }
        else if ( ((LA12_0>='A' && LA12_0<='Z')||LA12_0=='_'||LA12_0=='b'||LA12_0=='e'||LA12_0=='h'||(LA12_0>='j' && LA12_0<='k')||LA12_0=='n'||(LA12_0>='p' && LA12_0<='q')||LA12_0=='t'||(LA12_0>='v' && LA12_0<='z')) ) {
            alt12=24;
        }
        else if ( ((LA12_0>='0' && LA12_0<='9')) ) {
            alt12=25;
        }
        else if ( (LA12_0=='\"') ) {
            int LA12_20 = input.LA(2);

            if ( ((LA12_20>='\u0000' && LA12_20<='\uFFFE')) ) {
                alt12=26;
            }
            else {
                alt12=30;}
        }
        else if ( (LA12_0=='\'') ) {
            int LA12_21 = input.LA(2);

            if ( ((LA12_21>='\u0000' && LA12_21<='\uFFFE')) ) {
                alt12=26;
            }
            else {
                alt12=30;}
        }
        else if ( (LA12_0=='/') ) {
            switch ( input.LA(2) ) {
            case '/':
                {
                alt12=28;
                }
                break;
            case '*':
                {
                alt12=27;
                }
                break;
            default:
                alt12=30;}

        }
        else if ( ((LA12_0>='\t' && LA12_0<='\n')||LA12_0=='\r'||LA12_0==' ') ) {
            alt12=29;
        }
        else if ( ((LA12_0>='\u0000' && LA12_0<='\b')||(LA12_0>='\u000B' && LA12_0<='\f')||(LA12_0>='\u000E' && LA12_0<='\u001F')||LA12_0=='!'||(LA12_0>='#' && LA12_0<='&')||(LA12_0>='*' && LA12_0<='+')||(LA12_0>='-' && LA12_0<='.')||LA12_0==':'||(LA12_0>='<' && LA12_0<='@')||(LA12_0>='[' && LA12_0<=']')||LA12_0=='`'||(LA12_0>='{' && LA12_0<='\uFFFE')) ) {
            alt12=30;
        }
        else {
            NoViableAltException nvae =
                new NoViableAltException("1:1: Tokens : ( T11 | T12 | T13 | T14 | T15 | T16 | T17 | T18 | T19 | T20 | T21 | T22 | T23 | T24 | T25 | T26 | T27 | T28 | T29 | T30 | T31 | T32 | T33 | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER );", 12, 0, input);

            throw nvae;
        }
        switch (alt12) {
            case 1 :
                // ../org.mendix.dsl.service.xtext/src-gen/org/mendix/dsl/service/xtext/parser/antlr/internal/InternalService.g:1:10: T11
                {
                mT11(); 

                }
                break;
            case 2 :
                // ../org.mendix.dsl.service.xtext/src-gen/org/mendix/dsl/service/xtext/parser/antlr/internal/InternalService.g:1:14: T12
                {
                mT12(); 

                }
                break;
            case 3 :
                // ../org.mendix.dsl.service.xtext/src-gen/org/mendix/dsl/service/xtext/parser/antlr/internal/InternalService.g:1:18: T13
                {
                mT13(); 

                }
                break;
            case 4 :
                // ../org.mendix.dsl.service.xtext/src-gen/org/mendix/dsl/service/xtext/parser/antlr/internal/InternalService.g:1:22: T14
                {
                mT14(); 

                }
                break;
            case 5 :
                // ../org.mendix.dsl.service.xtext/src-gen/org/mendix/dsl/service/xtext/parser/antlr/internal/InternalService.g:1:26: T15
                {
                mT15(); 

                }
                break;
            case 6 :
                // ../org.mendix.dsl.service.xtext/src-gen/org/mendix/dsl/service/xtext/parser/antlr/internal/InternalService.g:1:30: T16
                {
                mT16(); 

                }
                break;
            case 7 :
                // ../org.mendix.dsl.service.xtext/src-gen/org/mendix/dsl/service/xtext/parser/antlr/internal/InternalService.g:1:34: T17
                {
                mT17(); 

                }
                break;
            case 8 :
                // ../org.mendix.dsl.service.xtext/src-gen/org/mendix/dsl/service/xtext/parser/antlr/internal/InternalService.g:1:38: T18
                {
                mT18(); 

                }
                break;
            case 9 :
                // ../org.mendix.dsl.service.xtext/src-gen/org/mendix/dsl/service/xtext/parser/antlr/internal/InternalService.g:1:42: T19
                {
                mT19(); 

                }
                break;
            case 10 :
                // ../org.mendix.dsl.service.xtext/src-gen/org/mendix/dsl/service/xtext/parser/antlr/internal/InternalService.g:1:46: T20
                {
                mT20(); 

                }
                break;
            case 11 :
                // ../org.mendix.dsl.service.xtext/src-gen/org/mendix/dsl/service/xtext/parser/antlr/internal/InternalService.g:1:50: T21
                {
                mT21(); 

                }
                break;
            case 12 :
                // ../org.mendix.dsl.service.xtext/src-gen/org/mendix/dsl/service/xtext/parser/antlr/internal/InternalService.g:1:54: T22
                {
                mT22(); 

                }
                break;
            case 13 :
                // ../org.mendix.dsl.service.xtext/src-gen/org/mendix/dsl/service/xtext/parser/antlr/internal/InternalService.g:1:58: T23
                {
                mT23(); 

                }
                break;
            case 14 :
                // ../org.mendix.dsl.service.xtext/src-gen/org/mendix/dsl/service/xtext/parser/antlr/internal/InternalService.g:1:62: T24
                {
                mT24(); 

                }
                break;
            case 15 :
                // ../org.mendix.dsl.service.xtext/src-gen/org/mendix/dsl/service/xtext/parser/antlr/internal/InternalService.g:1:66: T25
                {
                mT25(); 

                }
                break;
            case 16 :
                // ../org.mendix.dsl.service.xtext/src-gen/org/mendix/dsl/service/xtext/parser/antlr/internal/InternalService.g:1:70: T26
                {
                mT26(); 

                }
                break;
            case 17 :
                // ../org.mendix.dsl.service.xtext/src-gen/org/mendix/dsl/service/xtext/parser/antlr/internal/InternalService.g:1:74: T27
                {
                mT27(); 

                }
                break;
            case 18 :
                // ../org.mendix.dsl.service.xtext/src-gen/org/mendix/dsl/service/xtext/parser/antlr/internal/InternalService.g:1:78: T28
                {
                mT28(); 

                }
                break;
            case 19 :
                // ../org.mendix.dsl.service.xtext/src-gen/org/mendix/dsl/service/xtext/parser/antlr/internal/InternalService.g:1:82: T29
                {
                mT29(); 

                }
                break;
            case 20 :
                // ../org.mendix.dsl.service.xtext/src-gen/org/mendix/dsl/service/xtext/parser/antlr/internal/InternalService.g:1:86: T30
                {
                mT30(); 

                }
                break;
            case 21 :
                // ../org.mendix.dsl.service.xtext/src-gen/org/mendix/dsl/service/xtext/parser/antlr/internal/InternalService.g:1:90: T31
                {
                mT31(); 

                }
                break;
            case 22 :
                // ../org.mendix.dsl.service.xtext/src-gen/org/mendix/dsl/service/xtext/parser/antlr/internal/InternalService.g:1:94: T32
                {
                mT32(); 

                }
                break;
            case 23 :
                // ../org.mendix.dsl.service.xtext/src-gen/org/mendix/dsl/service/xtext/parser/antlr/internal/InternalService.g:1:98: T33
                {
                mT33(); 

                }
                break;
            case 24 :
                // ../org.mendix.dsl.service.xtext/src-gen/org/mendix/dsl/service/xtext/parser/antlr/internal/InternalService.g:1:102: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 25 :
                // ../org.mendix.dsl.service.xtext/src-gen/org/mendix/dsl/service/xtext/parser/antlr/internal/InternalService.g:1:110: RULE_INT
                {
                mRULE_INT(); 

                }
                break;
            case 26 :
                // ../org.mendix.dsl.service.xtext/src-gen/org/mendix/dsl/service/xtext/parser/antlr/internal/InternalService.g:1:119: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;
            case 27 :
                // ../org.mendix.dsl.service.xtext/src-gen/org/mendix/dsl/service/xtext/parser/antlr/internal/InternalService.g:1:131: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;
            case 28 :
                // ../org.mendix.dsl.service.xtext/src-gen/org/mendix/dsl/service/xtext/parser/antlr/internal/InternalService.g:1:147: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 29 :
                // ../org.mendix.dsl.service.xtext/src-gen/org/mendix/dsl/service/xtext/parser/antlr/internal/InternalService.g:1:163: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 30 :
                // ../org.mendix.dsl.service.xtext/src-gen/org/mendix/dsl/service/xtext/parser/antlr/internal/InternalService.g:1:171: RULE_ANY_OTHER
                {
                mRULE_ANY_OTHER(); 

                }
                break;

        }

    }


 

}