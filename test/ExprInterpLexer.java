// $ANTLR 3.4 ExprInterp.g 2016-02-15 09:58:40

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked"})
public class ExprInterpLexer extends Lexer {
    public static final int EOF=-1;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int ID=4;
    public static final int INT=5;
    public static final int LEFTP=6;
    public static final int MAXI=7;
    public static final int NEWLINE=8;
    public static final int REL=9;
    public static final int RIGHTP=10;
    public static final int WS=11;

    // delegates
    // delegators
    public Lexer[] getDelegates() {
        return new Lexer[] {};
    }

    public ExprInterpLexer() {} 
    public ExprInterpLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public ExprInterpLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);
    }
    public String getGrammarFileName() { return "ExprInterp.g"; }

    // $ANTLR start "T__12"
    public final void mT__12() throws RecognitionException {
        try {
            int _type = T__12;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ExprInterp.g:2:7: ( '*' )
            // ExprInterp.g:2:9: '*'
            {
            match('*'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__12"

    // $ANTLR start "T__13"
    public final void mT__13() throws RecognitionException {
        try {
            int _type = T__13;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ExprInterp.g:3:7: ( '+' )
            // ExprInterp.g:3:9: '+'
            {
            match('+'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__13"

    // $ANTLR start "T__14"
    public final void mT__14() throws RecognitionException {
        try {
            int _type = T__14;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ExprInterp.g:4:7: ( ',' )
            // ExprInterp.g:4:9: ','
            {
            match(','); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__14"

    // $ANTLR start "T__15"
    public final void mT__15() throws RecognitionException {
        try {
            int _type = T__15;
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
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__15"

    // $ANTLR start "T__16"
    public final void mT__16() throws RecognitionException {
        try {
            int _type = T__16;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ExprInterp.g:6:7: ( '=' )
            // ExprInterp.g:6:9: '='
            {
            match('='); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__16"

    // $ANTLR start "MAXI"
    public final void mMAXI() throws RecognitionException {
        try {
            int _type = MAXI;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ExprInterp.g:47:5: ( 'max' )
            // ExprInterp.g:47:7: 'max'
            {
            match("max"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "MAXI"

    // $ANTLR start "LEFTP"
    public final void mLEFTP() throws RecognitionException {
        try {
            int _type = LEFTP;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ExprInterp.g:48:6: ( '(' )
            // ExprInterp.g:48:8: '('
            {
            match('('); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "LEFTP"

    // $ANTLR start "RIGHTP"
    public final void mRIGHTP() throws RecognitionException {
        try {
            int _type = RIGHTP;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ExprInterp.g:49:7: ( ')' )
            // ExprInterp.g:49:9: ')'
            {
            match(')'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "RIGHTP"

    // $ANTLR start "ID"
    public final void mID() throws RecognitionException {
        try {
            int _type = ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ExprInterp.g:50:5: ( ( 'a' .. 'z' | 'A' .. 'Z' )+ )
            // ExprInterp.g:50:9: ( 'a' .. 'z' | 'A' .. 'Z' )+
            {
            // ExprInterp.g:50:9: ( 'a' .. 'z' | 'A' .. 'Z' )+
            int cnt1=0;
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0 >= 'A' && LA1_0 <= 'Z')||(LA1_0 >= 'a' && LA1_0 <= 'z')) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ExprInterp.g:
            	    {
            	    if ( (input.LA(1) >= 'A' && input.LA(1) <= 'Z')||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
            	        input.consume();
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;
            	    }


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
        	// do for sure before leaving
        }
    }
    // $ANTLR end "ID"

    // $ANTLR start "INT"
    public final void mINT() throws RecognitionException {
        try {
            int _type = INT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ExprInterp.g:51:5: ( ( '0' .. '9' )+ )
            // ExprInterp.g:51:9: ( '0' .. '9' )+
            {
            // ExprInterp.g:51:9: ( '0' .. '9' )+
            int cnt2=0;
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( ((LA2_0 >= '0' && LA2_0 <= '9')) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // ExprInterp.g:
            	    {
            	    if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
            	        input.consume();
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;
            	    }


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
        	// do for sure before leaving
        }
    }
    // $ANTLR end "INT"

    // $ANTLR start "REL"
    public final void mREL() throws RecognitionException {
        try {
            int _type = REL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ExprInterp.g:52:5: ( ( INT '.' INT | INT ) )
            // ExprInterp.g:52:7: ( INT '.' INT | INT )
            {
            // ExprInterp.g:52:7: ( INT '.' INT | INT )
            int alt3=2;
            alt3 = dfa3.predict(input);
            switch (alt3) {
                case 1 :
                    // ExprInterp.g:52:8: INT '.' INT
                    {
                    mINT(); 


                    match('.'); 

                    mINT(); 


                    }
                    break;
                case 2 :
                    // ExprInterp.g:52:21: INT
                    {
                    mINT(); 


                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "REL"

    // $ANTLR start "NEWLINE"
    public final void mNEWLINE() throws RecognitionException {
        try {
            int _type = NEWLINE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ExprInterp.g:53:8: ( ( '\\r' )? '\\n' )
            // ExprInterp.g:53:9: ( '\\r' )? '\\n'
            {
            // ExprInterp.g:53:9: ( '\\r' )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0=='\r') ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // ExprInterp.g:53:9: '\\r'
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
        	// do for sure before leaving
        }
    }
    // $ANTLR end "NEWLINE"

    // $ANTLR start "WS"
    public final void mWS() throws RecognitionException {
        try {
            int _type = WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ExprInterp.g:54:5: ( ( ' ' | '\\t' )+ )
            // ExprInterp.g:54:9: ( ' ' | '\\t' )+
            {
            // ExprInterp.g:54:9: ( ' ' | '\\t' )+
            int cnt5=0;
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0=='\t'||LA5_0==' ') ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // ExprInterp.g:
            	    {
            	    if ( input.LA(1)=='\t'||input.LA(1)==' ' ) {
            	        input.consume();
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt5 >= 1 ) break loop5;
                        EarlyExitException eee =
                            new EarlyExitException(5, input);
                        throw eee;
                }
                cnt5++;
            } while (true);


            skip();

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "WS"

    public void mTokens() throws RecognitionException {
        // ExprInterp.g:1:8: ( T__12 | T__13 | T__14 | T__15 | T__16 | MAXI | LEFTP | RIGHTP | ID | INT | REL | NEWLINE | WS )
        int alt6=13;
        alt6 = dfa6.predict(input);
        switch (alt6) {
            case 1 :
                // ExprInterp.g:1:10: T__12
                {
                mT__12(); 


                }
                break;
            case 2 :
                // ExprInterp.g:1:16: T__13
                {
                mT__13(); 


                }
                break;
            case 3 :
                // ExprInterp.g:1:22: T__14
                {
                mT__14(); 


                }
                break;
            case 4 :
                // ExprInterp.g:1:28: T__15
                {
                mT__15(); 


                }
                break;
            case 5 :
                // ExprInterp.g:1:34: T__16
                {
                mT__16(); 


                }
                break;
            case 6 :
                // ExprInterp.g:1:40: MAXI
                {
                mMAXI(); 


                }
                break;
            case 7 :
                // ExprInterp.g:1:45: LEFTP
                {
                mLEFTP(); 


                }
                break;
            case 8 :
                // ExprInterp.g:1:51: RIGHTP
                {
                mRIGHTP(); 


                }
                break;
            case 9 :
                // ExprInterp.g:1:58: ID
                {
                mID(); 


                }
                break;
            case 10 :
                // ExprInterp.g:1:61: INT
                {
                mINT(); 


                }
                break;
            case 11 :
                // ExprInterp.g:1:65: REL
                {
                mREL(); 


                }
                break;
            case 12 :
                // ExprInterp.g:1:69: NEWLINE
                {
                mNEWLINE(); 


                }
                break;
            case 13 :
                // ExprInterp.g:1:77: WS
                {
                mWS(); 


                }
                break;

        }

    }


    protected DFA3 dfa3 = new DFA3(this);
    protected DFA6 dfa6 = new DFA6(this);
    static final String DFA3_eotS =
        "\1\uffff\1\2\2\uffff";
    static final String DFA3_eofS =
        "\4\uffff";
    static final String DFA3_minS =
        "\1\60\1\56\2\uffff";
    static final String DFA3_maxS =
        "\2\71\2\uffff";
    static final String DFA3_acceptS =
        "\2\uffff\1\2\1\1";
    static final String DFA3_specialS =
        "\4\uffff}>";
    static final String[] DFA3_transitionS = {
            "\12\1",
            "\1\3\1\uffff\12\1",
            "",
            ""
    };

    static final short[] DFA3_eot = DFA.unpackEncodedString(DFA3_eotS);
    static final short[] DFA3_eof = DFA.unpackEncodedString(DFA3_eofS);
    static final char[] DFA3_min = DFA.unpackEncodedStringToUnsignedChars(DFA3_minS);
    static final char[] DFA3_max = DFA.unpackEncodedStringToUnsignedChars(DFA3_maxS);
    static final short[] DFA3_accept = DFA.unpackEncodedString(DFA3_acceptS);
    static final short[] DFA3_special = DFA.unpackEncodedString(DFA3_specialS);
    static final short[][] DFA3_transition;

    static {
        int numStates = DFA3_transitionS.length;
        DFA3_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA3_transition[i] = DFA.unpackEncodedString(DFA3_transitionS[i]);
        }
    }

    class DFA3 extends DFA {

        public DFA3(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 3;
            this.eot = DFA3_eot;
            this.eof = DFA3_eof;
            this.min = DFA3_min;
            this.max = DFA3_max;
            this.accept = DFA3_accept;
            this.special = DFA3_special;
            this.transition = DFA3_transition;
        }
        public String getDescription() {
            return "52:7: ( INT '.' INT | INT )";
        }
    }
    static final String DFA6_eotS =
        "\6\uffff\1\11\3\uffff\1\16\2\uffff\1\11\2\uffff\1\21\1\uffff";
    static final String DFA6_eofS =
        "\22\uffff";
    static final String DFA6_minS =
        "\1\11\5\uffff\1\141\3\uffff\1\56\2\uffff\1\170\2\uffff\1\101\1\uffff";
    static final String DFA6_maxS =
        "\1\172\5\uffff\1\141\3\uffff\1\71\2\uffff\1\170\2\uffff\1\172\1"+
        "\uffff";
    static final String DFA6_acceptS =
        "\1\uffff\1\1\1\2\1\3\1\4\1\5\1\uffff\1\7\1\10\1\11\1\uffff\1\14"+
        "\1\15\1\uffff\1\12\1\13\1\uffff\1\6";
    static final String DFA6_specialS =
        "\22\uffff}>";
    static final String[] DFA6_transitionS = {
            "\1\14\1\13\2\uffff\1\13\22\uffff\1\14\7\uffff\1\7\1\10\1\1\1"+
            "\2\1\3\1\4\2\uffff\12\12\3\uffff\1\5\3\uffff\32\11\6\uffff\14"+
            "\11\1\6\15\11",
            "",
            "",
            "",
            "",
            "",
            "\1\15",
            "",
            "",
            "",
            "\1\17\1\uffff\12\12",
            "",
            "",
            "\1\20",
            "",
            "",
            "\32\11\6\uffff\32\11",
            ""
    };

    static final short[] DFA6_eot = DFA.unpackEncodedString(DFA6_eotS);
    static final short[] DFA6_eof = DFA.unpackEncodedString(DFA6_eofS);
    static final char[] DFA6_min = DFA.unpackEncodedStringToUnsignedChars(DFA6_minS);
    static final char[] DFA6_max = DFA.unpackEncodedStringToUnsignedChars(DFA6_maxS);
    static final short[] DFA6_accept = DFA.unpackEncodedString(DFA6_acceptS);
    static final short[] DFA6_special = DFA.unpackEncodedString(DFA6_specialS);
    static final short[][] DFA6_transition;

    static {
        int numStates = DFA6_transitionS.length;
        DFA6_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA6_transition[i] = DFA.unpackEncodedString(DFA6_transitionS[i]);
        }
    }

    class DFA6 extends DFA {

        public DFA6(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 6;
            this.eot = DFA6_eot;
            this.eof = DFA6_eof;
            this.min = DFA6_min;
            this.max = DFA6_max;
            this.accept = DFA6_accept;
            this.special = DFA6_special;
            this.transition = DFA6_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T__12 | T__13 | T__14 | T__15 | T__16 | MAXI | LEFTP | RIGHTP | ID | INT | REL | NEWLINE | WS );";
        }
    }
 

}