// $ANTLR 3.2 debian-7ubuntu3 ExprInterp.g 2016-02-23 14:11:46

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

public class ExprInterpLexer extends Lexer {
    public static final int WS=7;
    public static final int NEWLINE=4;
    public static final int T__11=11;
    public static final int T__10=10;
    public static final int INT=6;
    public static final int ID=5;
    public static final int EOF=-1;
    public static final int T__9=9;
    public static final int T__8=8;

    // delegates
    // delegators

    public ExprInterpLexer() {;} 
    public ExprInterpLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public ExprInterpLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "ExprInterp.g"; }

    // $ANTLR start "T__8"
    public final void mT__8() throws RecognitionException {
        try {
            int _type = T__8;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ExprInterp.g:3:6: ( '=' )
            // ExprInterp.g:3:8: '='
            {
            match('='); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__8"

    // $ANTLR start "T__9"
    public final void mT__9() throws RecognitionException {
        try {
            int _type = T__9;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ExprInterp.g:4:6: ( '+' )
            // ExprInterp.g:4:8: '+'
            {
            match('+'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__9"

    // $ANTLR start "T__10"
    public final void mT__10() throws RecognitionException {
        try {
            int _type = T__10;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ExprInterp.g:5:7: ( '-' )
            // ExprInterp.g:5:9: '-'
            {
            match('-'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__10"

    // $ANTLR start "T__11"
    public final void mT__11() throws RecognitionException {
        try {
            int _type = T__11;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ExprInterp.g:6:7: ( '*' )
            // ExprInterp.g:6:9: '*'
            {
            match('*'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__11"

    // $ANTLR start "ID"
    public final void mID() throws RecognitionException {
        try {
            int _type = ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ExprInterp.g:41:5: ( ( 'a' .. 'z' | 'A' .. 'Z' )+ )
            // ExprInterp.g:41:9: ( 'a' .. 'z' | 'A' .. 'Z' )+
            {
            // ExprInterp.g:41:9: ( 'a' .. 'z' | 'A' .. 'Z' )+
            int cnt1=0;
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0>='A' && LA1_0<='Z')||(LA1_0>='a' && LA1_0<='z')) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ExprInterp.g:
            	    {
            	    if ( (input.LA(1)>='A' && input.LA(1)<='Z')||(input.LA(1)>='a' && input.LA(1)<='z') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    if ( cnt1 >= 1 ) break loop1;
                        EarlyExitException eee =
                            new EarlyExitException(1, input);
                        throw eee;
                }
                cnt1++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "ID"

    // $ANTLR start "INT"
    public final void mINT() throws RecognitionException {
        try {
            int _type = INT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ExprInterp.g:42:5: ( ( '0' .. '9' )+ )
            // ExprInterp.g:42:9: ( '0' .. '9' )+
            {
            // ExprInterp.g:42:9: ( '0' .. '9' )+
            int cnt2=0;
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( ((LA2_0>='0' && LA2_0<='9')) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // ExprInterp.g:42:9: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

            	    }
            	    break;

            	default :
            	    if ( cnt2 >= 1 ) break loop2;
                        EarlyExitException eee =
                            new EarlyExitException(2, input);
                        throw eee;
                }
                cnt2++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "INT"

    // $ANTLR start "NEWLINE"
    public final void mNEWLINE() throws RecognitionException {
        try {
            int _type = NEWLINE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ExprInterp.g:43:8: ( ( '\\r' )? '\\n' )
            // ExprInterp.g:43:9: ( '\\r' )? '\\n'
            {
            // ExprInterp.g:43:9: ( '\\r' )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0=='\r') ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // ExprInterp.g:43:9: '\\r'
                    {
                    match('\r'); 

                    }
                    break;

            }

            match('\n'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "NEWLINE"

    // $ANTLR start "WS"
    public final void mWS() throws RecognitionException {
        try {
            int _type = WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ExprInterp.g:44:5: ( ( ' ' | '\\t' )+ )
            // ExprInterp.g:44:9: ( ' ' | '\\t' )+
            {
            // ExprInterp.g:44:9: ( ' ' | '\\t' )+
            int cnt4=0;
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0=='\t'||LA4_0==' ') ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // ExprInterp.g:
            	    {
            	    if ( input.LA(1)=='\t'||input.LA(1)==' ' ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    if ( cnt4 >= 1 ) break loop4;
                        EarlyExitException eee =
                            new EarlyExitException(4, input);
                        throw eee;
                }
                cnt4++;
            } while (true);

            skip();

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "WS"

    public void mTokens() throws RecognitionException {
        // ExprInterp.g:1:8: ( T__8 | T__9 | T__10 | T__11 | ID | INT | NEWLINE | WS )
        int alt5=8;
        switch ( input.LA(1) ) {
        case '=':
            {
            alt5=1;
            }
            break;
        case '+':
            {
            alt5=2;
            }
            break;
        case '-':
            {
            alt5=3;
            }
            break;
        case '*':
            {
            alt5=4;
            }
            break;
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
        case 'a':
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
            alt5=5;
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
            {
            alt5=6;
            }
            break;
        case '\n':
        case '\r':
            {
            alt5=7;
            }
            break;
        case '\t':
        case ' ':
            {
            alt5=8;
            }
            break;
        default:
            NoViableAltException nvae =
                new NoViableAltException("", 5, 0, input);

            throw nvae;
        }

        switch (alt5) {
            case 1 :
                // ExprInterp.g:1:10: T__8
                {
                mT__8(); 

                }
                break;
            case 2 :
                // ExprInterp.g:1:15: T__9
                {
                mT__9(); 

                }
                break;
            case 3 :
                // ExprInterp.g:1:20: T__10
                {
                mT__10(); 

                }
                break;
            case 4 :
                // ExprInterp.g:1:26: T__11
                {
                mT__11(); 

                }
                break;
            case 5 :
                // ExprInterp.g:1:32: ID
                {
                mID(); 

                }
                break;
            case 6 :
                // ExprInterp.g:1:35: INT
                {
                mINT(); 

                }
                break;
            case 7 :
                // ExprInterp.g:1:39: NEWLINE
                {
                mNEWLINE(); 

                }
                break;
            case 8 :
                // ExprInterp.g:1:47: WS
                {
                mWS(); 

                }
                break;

        }

    }


 

}