// $ANTLR 3.4 ExprInterp.g 2016-02-24 17:43:40

import java.util.HashMap;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked"})
public class ExprInterpParser extends Parser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "ID", "INT", "LEFTP", "MAXI", "NEWLINE", "REL", "RIGHTP", "WS", "'*'", "'+'", "','", "'-'", "'='"
    };

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
    public Parser[] getDelegates() {
        return new Parser[] {};
    }

    // delegators


    public ExprInterpParser(TokenStream input) {
        this(input, new RecognizerSharedState());
    }
    public ExprInterpParser(TokenStream input, RecognizerSharedState state) {
        super(input, state);
    }

    public String[] getTokenNames() { return ExprInterpParser.tokenNames; }
    public String getGrammarFileName() { return "ExprInterp.g"; }


    /** Map variable name to Integer object holding value */
    HashMap memory = new HashMap();



    // $ANTLR start "prog"
    // ExprInterp.g:12:1: prog : ( stat )+ ;
    public final void prog() throws RecognitionException {
        try {
            // ExprInterp.g:12:5: ( ( stat )+ )
            // ExprInterp.g:12:9: ( stat )+
            {
            // ExprInterp.g:12:9: ( stat )+
            int cnt1=0;
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0 >= ID && LA1_0 <= REL)) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ExprInterp.g:12:9: stat
            	    {
            	    pushFollow(FOLLOW_stat_in_prog23);
            	    stat();

            	    state._fsp--;


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

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "prog"



    // $ANTLR start "stat"
    // ExprInterp.g:14:1: stat : ( expr NEWLINE | ID '=' expr NEWLINE | NEWLINE );
    public final void stat() throws RecognitionException {
        Token ID2=null;
        double expr1 =0.0;

        double expr3 =0.0;


        try {
            // ExprInterp.g:14:5: ( expr NEWLINE | ID '=' expr NEWLINE | NEWLINE )
            int alt2=3;
            switch ( input.LA(1) ) {
            case INT:
            case LEFTP:
            case MAXI:
            case REL:
                {
                alt2=1;
                }
                break;
            case ID:
                {
                int LA2_2 = input.LA(2);

                if ( (LA2_2==16) ) {
                    alt2=2;
                }
                else if ( (LA2_2==NEWLINE||(LA2_2 >= 12 && LA2_2 <= 13)||LA2_2==15) ) {
                    alt2=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 2, 2, input);

                    throw nvae;

                }
                }
                break;
            case NEWLINE:
                {
                alt2=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;

            }

            switch (alt2) {
                case 1 :
                    // ExprInterp.g:14:9: expr NEWLINE
                    {
                    pushFollow(FOLLOW_expr_in_stat50);
                    expr1=expr();

                    state._fsp--;


                    match(input,NEWLINE,FOLLOW_NEWLINE_in_stat52); 

                    System.out.println(expr1);

                    }
                    break;
                case 2 :
                    // ExprInterp.g:15:9: ID '=' expr NEWLINE
                    {
                    ID2=(Token)match(input,ID,FOLLOW_ID_in_stat64); 

                    match(input,16,FOLLOW_16_in_stat66); 

                    pushFollow(FOLLOW_expr_in_stat68);
                    expr3=expr();

                    state._fsp--;


                    match(input,NEWLINE,FOLLOW_NEWLINE_in_stat70); 

                    memory.put((ID2!=null?ID2.getText():null), new Double(expr3));

                    }
                    break;
                case 3 :
                    // ExprInterp.g:17:9: NEWLINE
                    {
                    match(input,NEWLINE,FOLLOW_NEWLINE_in_stat90); 

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "stat"



    // $ANTLR start "maxF"
    // ExprInterp.g:19:1: maxF returns [double value] : MAXI LEFTP e= expr ',' p= expr RIGHTP ;
    public final double maxF() throws RecognitionException {
        double value = 0.0;


        double e =0.0;

        double p =0.0;


        try {
            // ExprInterp.g:20:5: ( MAXI LEFTP e= expr ',' p= expr RIGHTP )
            // ExprInterp.g:20:7: MAXI LEFTP e= expr ',' p= expr RIGHTP
            {
            match(input,MAXI,FOLLOW_MAXI_in_maxF110); 

            match(input,LEFTP,FOLLOW_LEFTP_in_maxF112); 

            pushFollow(FOLLOW_expr_in_maxF116);
            e=expr();

            state._fsp--;


            match(input,14,FOLLOW_14_in_maxF118); 

            pushFollow(FOLLOW_expr_in_maxF122);
            p=expr();

            state._fsp--;


            match(input,RIGHTP,FOLLOW_RIGHTP_in_maxF124); 

            value = Math.max(e,p);

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return value;
    }
    // $ANTLR end "maxF"



    // $ANTLR start "expr"
    // ExprInterp.g:23:1: expr returns [double value] : (e= multExpr ( '+' e= multExpr | '-' e= multExpr )* |e= maxF );
    public final double expr() throws RecognitionException {
        double value = 0.0;


        double e =0.0;


        try {
            // ExprInterp.g:24:5: (e= multExpr ( '+' e= multExpr | '-' e= multExpr )* |e= maxF )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( ((LA4_0 >= ID && LA4_0 <= LEFTP)||LA4_0==REL) ) {
                alt4=1;
            }
            else if ( (LA4_0==MAXI) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;

            }
            switch (alt4) {
                case 1 :
                    // ExprInterp.g:24:9: e= multExpr ( '+' e= multExpr | '-' e= multExpr )*
                    {
                    pushFollow(FOLLOW_multExpr_in_expr155);
                    e=multExpr();

                    state._fsp--;


                    value = e;

                    // ExprInterp.g:25:9: ( '+' e= multExpr | '-' e= multExpr )*
                    loop3:
                    do {
                        int alt3=3;
                        int LA3_0 = input.LA(1);

                        if ( (LA3_0==13) ) {
                            alt3=1;
                        }
                        else if ( (LA3_0==15) ) {
                            alt3=2;
                        }


                        switch (alt3) {
                    	case 1 :
                    	    // ExprInterp.g:25:13: '+' e= multExpr
                    	    {
                    	    match(input,13,FOLLOW_13_in_expr171); 

                    	    pushFollow(FOLLOW_multExpr_in_expr175);
                    	    e=multExpr();

                    	    state._fsp--;


                    	    value += e;

                    	    }
                    	    break;
                    	case 2 :
                    	    // ExprInterp.g:26:13: '-' e= multExpr
                    	    {
                    	    match(input,15,FOLLOW_15_in_expr191); 

                    	    pushFollow(FOLLOW_multExpr_in_expr195);
                    	    e=multExpr();

                    	    state._fsp--;


                    	    value -= e;

                    	    }
                    	    break;

                    	default :
                    	    break loop3;
                        }
                    } while (true);


                    }
                    break;
                case 2 :
                    // ExprInterp.g:28:8: e= maxF
                    {
                    pushFollow(FOLLOW_maxF_in_expr221);
                    e=maxF();

                    state._fsp--;


                    value = e;

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return value;
    }
    // $ANTLR end "expr"



    // $ANTLR start "multExpr"
    // ExprInterp.g:31:1: multExpr returns [double value] : e= atom ( '*' e= atom )* ;
    public final double multExpr() throws RecognitionException {
        double value = 0.0;


        double e =0.0;


        try {
            // ExprInterp.g:32:5: (e= atom ( '*' e= atom )* )
            // ExprInterp.g:32:9: e= atom ( '*' e= atom )*
            {
            pushFollow(FOLLOW_atom_in_multExpr248);
            e=atom();

            state._fsp--;


            value = e;

            // ExprInterp.g:32:37: ( '*' e= atom )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==12) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // ExprInterp.g:32:38: '*' e= atom
            	    {
            	    match(input,12,FOLLOW_12_in_multExpr253); 

            	    pushFollow(FOLLOW_atom_in_multExpr257);
            	    e=atom();

            	    state._fsp--;


            	    value *= e;

            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return value;
    }
    // $ANTLR end "multExpr"



    // $ANTLR start "atom"
    // ExprInterp.g:35:1: atom returns [double value] : ( REL | INT | ID | LEFTP expr RIGHTP );
    public final double atom() throws RecognitionException {
        double value = 0.0;


        Token REL4=null;
        Token INT5=null;
        Token ID6=null;

        try {
            // ExprInterp.g:36:5: ( REL | INT | ID | LEFTP expr RIGHTP )
            int alt6=4;
            switch ( input.LA(1) ) {
            case REL:
                {
                alt6=1;
                }
                break;
            case INT:
                {
                alt6=2;
                }
                break;
            case ID:
                {
                alt6=3;
                }
                break;
            case LEFTP:
                {
                alt6=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;

            }

            switch (alt6) {
                case 1 :
                    // ExprInterp.g:36:9: REL
                    {
                    REL4=(Token)match(input,REL,FOLLOW_REL_in_atom285); 

                    value = Double.parseDouble((REL4!=null?REL4.getText():null));

                    }
                    break;
                case 2 :
                    // ExprInterp.g:37:7: INT
                    {
                    INT5=(Token)match(input,INT,FOLLOW_INT_in_atom295); 

                    value = Double.parseDouble((INT5!=null?INT5.getText():null));

                    }
                    break;
                case 3 :
                    // ExprInterp.g:38:9: ID
                    {
                    ID6=(Token)match(input,ID,FOLLOW_ID_in_atom307); 


                            Double v = (Double)memory.get((ID6!=null?ID6.getText():null));
                            if ( v!=null ) value = v.intValue();
                            else System.err.println("undefined variable "+(ID6!=null?ID6.getText():null));
                            

                    }
                    break;
                case 4 :
                    // ExprInterp.g:44:7: LEFTP expr RIGHTP
                    {
                    match(input,LEFTP,FOLLOW_LEFTP_in_atom325); 

                    pushFollow(FOLLOW_expr_in_atom327);
                    expr();

                    state._fsp--;


                    match(input,RIGHTP,FOLLOW_RIGHTP_in_atom329); 

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return value;
    }
    // $ANTLR end "atom"

    // Delegated rules


 

    public static final BitSet FOLLOW_stat_in_prog23 = new BitSet(new long[]{0x00000000000003F2L});
    public static final BitSet FOLLOW_expr_in_stat50 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_NEWLINE_in_stat52 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_stat64 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_stat66 = new BitSet(new long[]{0x00000000000002F0L});
    public static final BitSet FOLLOW_expr_in_stat68 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_NEWLINE_in_stat70 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NEWLINE_in_stat90 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_MAXI_in_maxF110 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_LEFTP_in_maxF112 = new BitSet(new long[]{0x00000000000002F0L});
    public static final BitSet FOLLOW_expr_in_maxF116 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_maxF118 = new BitSet(new long[]{0x00000000000002F0L});
    public static final BitSet FOLLOW_expr_in_maxF122 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_RIGHTP_in_maxF124 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_multExpr_in_expr155 = new BitSet(new long[]{0x000000000000A002L});
    public static final BitSet FOLLOW_13_in_expr171 = new BitSet(new long[]{0x0000000000000270L});
    public static final BitSet FOLLOW_multExpr_in_expr175 = new BitSet(new long[]{0x000000000000A002L});
    public static final BitSet FOLLOW_15_in_expr191 = new BitSet(new long[]{0x0000000000000270L});
    public static final BitSet FOLLOW_multExpr_in_expr195 = new BitSet(new long[]{0x000000000000A002L});
    public static final BitSet FOLLOW_maxF_in_expr221 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_atom_in_multExpr248 = new BitSet(new long[]{0x0000000000001002L});
    public static final BitSet FOLLOW_12_in_multExpr253 = new BitSet(new long[]{0x0000000000000270L});
    public static final BitSet FOLLOW_atom_in_multExpr257 = new BitSet(new long[]{0x0000000000001002L});
    public static final BitSet FOLLOW_REL_in_atom285 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INT_in_atom295 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_atom307 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LEFTP_in_atom325 = new BitSet(new long[]{0x00000000000002F0L});
    public static final BitSet FOLLOW_expr_in_atom327 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_RIGHTP_in_atom329 = new BitSet(new long[]{0x0000000000000002L});

}