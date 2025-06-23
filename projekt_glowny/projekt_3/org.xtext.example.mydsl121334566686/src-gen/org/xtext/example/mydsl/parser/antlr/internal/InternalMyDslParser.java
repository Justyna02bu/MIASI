package org.xtext.example.mydsl.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.common.util.Enumerator;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.xtext.example.mydsl.services.MyDslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalMyDslParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_D", "RULE_INT", "RULE_ID", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Sumuj'", "'\\n'", "';'", "'.'", "','", "'Sukcesy'", "':'", "'razy'", "'('", "')'", "'wybuchowe'", "'oznacz'", "'odrzuc'", "'przerzuc'", "'sukces'", "'-'", "'+'", "'dodawaj'", "'odejmuj'", "'- '", "'pierwsze'", "'ostatnie'", "'*'", "'/'", "'najwyzsze'", "'najnizsze'", "'wiecej niz'", "'mniej niz'"
    };
    public static final int RULE_STRING=7;
    public static final int RULE_SL_COMMENT=9;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__37=37;
    public static final int T__16=16;
    public static final int T__38=38;
    public static final int T__17=17;
    public static final int T__39=39;
    public static final int T__18=18;
    public static final int T__33=33;
    public static final int T__12=12;
    public static final int T__34=34;
    public static final int T__13=13;
    public static final int T__35=35;
    public static final int T__14=14;
    public static final int T__36=36;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_ID=6;
    public static final int RULE_WS=10;
    public static final int RULE_ANY_OTHER=11;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=5;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=8;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;
    public static final int RULE_D=4;

    // delegates
    // delegators


        public InternalMyDslParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalMyDslParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalMyDslParser.tokenNames; }
    public String getGrammarFileName() { return "InternalMyDsl.g"; }



     	private MyDslGrammarAccess grammarAccess;

        public InternalMyDslParser(TokenStream input, MyDslGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "Language";
       	}

       	@Override
       	protected MyDslGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleLanguage"
    // InternalMyDsl.g:65:1: entryRuleLanguage returns [EObject current=null] : iv_ruleLanguage= ruleLanguage EOF ;
    public final EObject entryRuleLanguage() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLanguage = null;


        try {
            // InternalMyDsl.g:65:49: (iv_ruleLanguage= ruleLanguage EOF )
            // InternalMyDsl.g:66:2: iv_ruleLanguage= ruleLanguage EOF
            {
             newCompositeNode(grammarAccess.getLanguageRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleLanguage=ruleLanguage();

            state._fsp--;

             current =iv_ruleLanguage; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleLanguage"


    // $ANTLR start "ruleLanguage"
    // InternalMyDsl.g:72:1: ruleLanguage returns [EObject current=null] : ( (lv_statement_0_0= ruleStat ) ) ;
    public final EObject ruleLanguage() throws RecognitionException {
        EObject current = null;

        EObject lv_statement_0_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:78:2: ( ( (lv_statement_0_0= ruleStat ) ) )
            // InternalMyDsl.g:79:2: ( (lv_statement_0_0= ruleStat ) )
            {
            // InternalMyDsl.g:79:2: ( (lv_statement_0_0= ruleStat ) )
            // InternalMyDsl.g:80:3: (lv_statement_0_0= ruleStat )
            {
            // InternalMyDsl.g:80:3: (lv_statement_0_0= ruleStat )
            // InternalMyDsl.g:81:4: lv_statement_0_0= ruleStat
            {

            				newCompositeNode(grammarAccess.getLanguageAccess().getStatementStatParserRuleCall_0());
            			
            pushFollow(FOLLOW_2);
            lv_statement_0_0=ruleStat();

            state._fsp--;


            				if (current==null) {
            					current = createModelElementForParent(grammarAccess.getLanguageRule());
            				}
            				set(
            					current,
            					"statement",
            					lv_statement_0_0,
            					"org.xtext.example.mydsl.MyDsl.Stat");
            				afterParserOrEnumRuleCall();
            			

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleLanguage"


    // $ANTLR start "entryRuleStat"
    // InternalMyDsl.g:101:1: entryRuleStat returns [EObject current=null] : iv_ruleStat= ruleStat EOF ;
    public final EObject entryRuleStat() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStat = null;


        try {
            // InternalMyDsl.g:101:45: (iv_ruleStat= ruleStat EOF )
            // InternalMyDsl.g:102:2: iv_ruleStat= ruleStat EOF
            {
             newCompositeNode(grammarAccess.getStatRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleStat=ruleStat();

            state._fsp--;

             current =iv_ruleStat; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleStat"


    // $ANTLR start "ruleStat"
    // InternalMyDsl.g:108:1: ruleStat returns [EObject current=null] : (this_Sumuj_0= ruleSumuj | this_Sukcesy_1= ruleSukcesy ) ;
    public final EObject ruleStat() throws RecognitionException {
        EObject current = null;

        EObject this_Sumuj_0 = null;

        EObject this_Sukcesy_1 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:114:2: ( (this_Sumuj_0= ruleSumuj | this_Sukcesy_1= ruleSukcesy ) )
            // InternalMyDsl.g:115:2: (this_Sumuj_0= ruleSumuj | this_Sukcesy_1= ruleSukcesy )
            {
            // InternalMyDsl.g:115:2: (this_Sumuj_0= ruleSumuj | this_Sukcesy_1= ruleSukcesy )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==12) ) {
                alt1=1;
            }
            else if ( (LA1_0==17) ) {
                alt1=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // InternalMyDsl.g:116:3: this_Sumuj_0= ruleSumuj
                    {

                    			newCompositeNode(grammarAccess.getStatAccess().getSumujParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_Sumuj_0=ruleSumuj();

                    state._fsp--;


                    			current = this_Sumuj_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:125:3: this_Sukcesy_1= ruleSukcesy
                    {

                    			newCompositeNode(grammarAccess.getStatAccess().getSukcesyParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_Sukcesy_1=ruleSukcesy();

                    state._fsp--;


                    			current = this_Sukcesy_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleStat"


    // $ANTLR start "entryRuleSumuj"
    // InternalMyDsl.g:137:1: entryRuleSumuj returns [EObject current=null] : iv_ruleSumuj= ruleSumuj EOF ;
    public final EObject entryRuleSumuj() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSumuj = null;


        try {
            // InternalMyDsl.g:137:46: (iv_ruleSumuj= ruleSumuj EOF )
            // InternalMyDsl.g:138:2: iv_ruleSumuj= ruleSumuj EOF
            {
             newCompositeNode(grammarAccess.getSumujRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSumuj=ruleSumuj();

            state._fsp--;

             current =iv_ruleSumuj; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSumuj"


    // $ANTLR start "ruleSumuj"
    // InternalMyDsl.g:144:1: ruleSumuj returns [EObject current=null] : (otherlv_0= 'Sumuj' (otherlv_1= '\\n' )? ( (lv_diceexprsum_2_0= ruleDiceExprSum ) ) (otherlv_3= ';' ( (lv_diceexprsum_4_0= ruleDiceExprSum ) ) )* (otherlv_5= '\\n' )? (otherlv_6= '.' | otherlv_7= ',' )? ) ;
    public final EObject ruleSumuj() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        EObject lv_diceexprsum_2_0 = null;

        EObject lv_diceexprsum_4_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:150:2: ( (otherlv_0= 'Sumuj' (otherlv_1= '\\n' )? ( (lv_diceexprsum_2_0= ruleDiceExprSum ) ) (otherlv_3= ';' ( (lv_diceexprsum_4_0= ruleDiceExprSum ) ) )* (otherlv_5= '\\n' )? (otherlv_6= '.' | otherlv_7= ',' )? ) )
            // InternalMyDsl.g:151:2: (otherlv_0= 'Sumuj' (otherlv_1= '\\n' )? ( (lv_diceexprsum_2_0= ruleDiceExprSum ) ) (otherlv_3= ';' ( (lv_diceexprsum_4_0= ruleDiceExprSum ) ) )* (otherlv_5= '\\n' )? (otherlv_6= '.' | otherlv_7= ',' )? )
            {
            // InternalMyDsl.g:151:2: (otherlv_0= 'Sumuj' (otherlv_1= '\\n' )? ( (lv_diceexprsum_2_0= ruleDiceExprSum ) ) (otherlv_3= ';' ( (lv_diceexprsum_4_0= ruleDiceExprSum ) ) )* (otherlv_5= '\\n' )? (otherlv_6= '.' | otherlv_7= ',' )? )
            // InternalMyDsl.g:152:3: otherlv_0= 'Sumuj' (otherlv_1= '\\n' )? ( (lv_diceexprsum_2_0= ruleDiceExprSum ) ) (otherlv_3= ';' ( (lv_diceexprsum_4_0= ruleDiceExprSum ) ) )* (otherlv_5= '\\n' )? (otherlv_6= '.' | otherlv_7= ',' )?
            {
            otherlv_0=(Token)match(input,12,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getSumujAccess().getSumujKeyword_0());
            		
            // InternalMyDsl.g:156:3: (otherlv_1= '\\n' )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==13) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // InternalMyDsl.g:157:4: otherlv_1= '\\n'
                    {
                    otherlv_1=(Token)match(input,13,FOLLOW_3); 

                    				newLeafNode(otherlv_1, grammarAccess.getSumujAccess().getLineFeedKeyword_1());
                    			

                    }
                    break;

            }

            // InternalMyDsl.g:162:3: ( (lv_diceexprsum_2_0= ruleDiceExprSum ) )
            // InternalMyDsl.g:163:4: (lv_diceexprsum_2_0= ruleDiceExprSum )
            {
            // InternalMyDsl.g:163:4: (lv_diceexprsum_2_0= ruleDiceExprSum )
            // InternalMyDsl.g:164:5: lv_diceexprsum_2_0= ruleDiceExprSum
            {

            					newCompositeNode(grammarAccess.getSumujAccess().getDiceexprsumDiceExprSumParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_4);
            lv_diceexprsum_2_0=ruleDiceExprSum();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getSumujRule());
            					}
            					add(
            						current,
            						"diceexprsum",
            						lv_diceexprsum_2_0,
            						"org.xtext.example.mydsl.MyDsl.DiceExprSum");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalMyDsl.g:181:3: (otherlv_3= ';' ( (lv_diceexprsum_4_0= ruleDiceExprSum ) ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==14) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalMyDsl.g:182:4: otherlv_3= ';' ( (lv_diceexprsum_4_0= ruleDiceExprSum ) )
            	    {
            	    otherlv_3=(Token)match(input,14,FOLLOW_3); 

            	    				newLeafNode(otherlv_3, grammarAccess.getSumujAccess().getSemicolonKeyword_3_0());
            	    			
            	    // InternalMyDsl.g:186:4: ( (lv_diceexprsum_4_0= ruleDiceExprSum ) )
            	    // InternalMyDsl.g:187:5: (lv_diceexprsum_4_0= ruleDiceExprSum )
            	    {
            	    // InternalMyDsl.g:187:5: (lv_diceexprsum_4_0= ruleDiceExprSum )
            	    // InternalMyDsl.g:188:6: lv_diceexprsum_4_0= ruleDiceExprSum
            	    {

            	    						newCompositeNode(grammarAccess.getSumujAccess().getDiceexprsumDiceExprSumParserRuleCall_3_1_0());
            	    					
            	    pushFollow(FOLLOW_4);
            	    lv_diceexprsum_4_0=ruleDiceExprSum();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getSumujRule());
            	    						}
            	    						add(
            	    							current,
            	    							"diceexprsum",
            	    							lv_diceexprsum_4_0,
            	    							"org.xtext.example.mydsl.MyDsl.DiceExprSum");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

            // InternalMyDsl.g:206:3: (otherlv_5= '\\n' )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==13) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalMyDsl.g:207:4: otherlv_5= '\\n'
                    {
                    otherlv_5=(Token)match(input,13,FOLLOW_5); 

                    				newLeafNode(otherlv_5, grammarAccess.getSumujAccess().getLineFeedKeyword_4());
                    			

                    }
                    break;

            }

            // InternalMyDsl.g:212:3: (otherlv_6= '.' | otherlv_7= ',' )?
            int alt5=3;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==15) ) {
                alt5=1;
            }
            else if ( (LA5_0==16) ) {
                alt5=2;
            }
            switch (alt5) {
                case 1 :
                    // InternalMyDsl.g:213:4: otherlv_6= '.'
                    {
                    otherlv_6=(Token)match(input,15,FOLLOW_2); 

                    				newLeafNode(otherlv_6, grammarAccess.getSumujAccess().getFullStopKeyword_5_0());
                    			

                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:218:4: otherlv_7= ','
                    {
                    otherlv_7=(Token)match(input,16,FOLLOW_2); 

                    				newLeafNode(otherlv_7, grammarAccess.getSumujAccess().getCommaKeyword_5_1());
                    			

                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSumuj"


    // $ANTLR start "entryRuleSukcesy"
    // InternalMyDsl.g:227:1: entryRuleSukcesy returns [EObject current=null] : iv_ruleSukcesy= ruleSukcesy EOF ;
    public final EObject entryRuleSukcesy() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSukcesy = null;


        try {
            // InternalMyDsl.g:227:48: (iv_ruleSukcesy= ruleSukcesy EOF )
            // InternalMyDsl.g:228:2: iv_ruleSukcesy= ruleSukcesy EOF
            {
             newCompositeNode(grammarAccess.getSukcesyRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSukcesy=ruleSukcesy();

            state._fsp--;

             current =iv_ruleSukcesy; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSukcesy"


    // $ANTLR start "ruleSukcesy"
    // InternalMyDsl.g:234:1: ruleSukcesy returns [EObject current=null] : (otherlv_0= 'Sukcesy' (otherlv_1= '\\n' )? ( (lv_diceexprsuk_2_0= ruleDiceExprSuk ) ) (otherlv_3= ';' ( (lv_diceexprsuk_4_0= ruleDiceExprSuk ) ) )* (otherlv_5= '\\n' )? (otherlv_6= '.' | otherlv_7= ',' )? ) ;
    public final EObject ruleSukcesy() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        EObject lv_diceexprsuk_2_0 = null;

        EObject lv_diceexprsuk_4_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:240:2: ( (otherlv_0= 'Sukcesy' (otherlv_1= '\\n' )? ( (lv_diceexprsuk_2_0= ruleDiceExprSuk ) ) (otherlv_3= ';' ( (lv_diceexprsuk_4_0= ruleDiceExprSuk ) ) )* (otherlv_5= '\\n' )? (otherlv_6= '.' | otherlv_7= ',' )? ) )
            // InternalMyDsl.g:241:2: (otherlv_0= 'Sukcesy' (otherlv_1= '\\n' )? ( (lv_diceexprsuk_2_0= ruleDiceExprSuk ) ) (otherlv_3= ';' ( (lv_diceexprsuk_4_0= ruleDiceExprSuk ) ) )* (otherlv_5= '\\n' )? (otherlv_6= '.' | otherlv_7= ',' )? )
            {
            // InternalMyDsl.g:241:2: (otherlv_0= 'Sukcesy' (otherlv_1= '\\n' )? ( (lv_diceexprsuk_2_0= ruleDiceExprSuk ) ) (otherlv_3= ';' ( (lv_diceexprsuk_4_0= ruleDiceExprSuk ) ) )* (otherlv_5= '\\n' )? (otherlv_6= '.' | otherlv_7= ',' )? )
            // InternalMyDsl.g:242:3: otherlv_0= 'Sukcesy' (otherlv_1= '\\n' )? ( (lv_diceexprsuk_2_0= ruleDiceExprSuk ) ) (otherlv_3= ';' ( (lv_diceexprsuk_4_0= ruleDiceExprSuk ) ) )* (otherlv_5= '\\n' )? (otherlv_6= '.' | otherlv_7= ',' )?
            {
            otherlv_0=(Token)match(input,17,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getSukcesyAccess().getSukcesyKeyword_0());
            		
            // InternalMyDsl.g:246:3: (otherlv_1= '\\n' )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==13) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalMyDsl.g:247:4: otherlv_1= '\\n'
                    {
                    otherlv_1=(Token)match(input,13,FOLLOW_3); 

                    				newLeafNode(otherlv_1, grammarAccess.getSukcesyAccess().getLineFeedKeyword_1());
                    			

                    }
                    break;

            }

            // InternalMyDsl.g:252:3: ( (lv_diceexprsuk_2_0= ruleDiceExprSuk ) )
            // InternalMyDsl.g:253:4: (lv_diceexprsuk_2_0= ruleDiceExprSuk )
            {
            // InternalMyDsl.g:253:4: (lv_diceexprsuk_2_0= ruleDiceExprSuk )
            // InternalMyDsl.g:254:5: lv_diceexprsuk_2_0= ruleDiceExprSuk
            {

            					newCompositeNode(grammarAccess.getSukcesyAccess().getDiceexprsukDiceExprSukParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_4);
            lv_diceexprsuk_2_0=ruleDiceExprSuk();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getSukcesyRule());
            					}
            					add(
            						current,
            						"diceexprsuk",
            						lv_diceexprsuk_2_0,
            						"org.xtext.example.mydsl.MyDsl.DiceExprSuk");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalMyDsl.g:271:3: (otherlv_3= ';' ( (lv_diceexprsuk_4_0= ruleDiceExprSuk ) ) )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==14) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalMyDsl.g:272:4: otherlv_3= ';' ( (lv_diceexprsuk_4_0= ruleDiceExprSuk ) )
            	    {
            	    otherlv_3=(Token)match(input,14,FOLLOW_3); 

            	    				newLeafNode(otherlv_3, grammarAccess.getSukcesyAccess().getSemicolonKeyword_3_0());
            	    			
            	    // InternalMyDsl.g:276:4: ( (lv_diceexprsuk_4_0= ruleDiceExprSuk ) )
            	    // InternalMyDsl.g:277:5: (lv_diceexprsuk_4_0= ruleDiceExprSuk )
            	    {
            	    // InternalMyDsl.g:277:5: (lv_diceexprsuk_4_0= ruleDiceExprSuk )
            	    // InternalMyDsl.g:278:6: lv_diceexprsuk_4_0= ruleDiceExprSuk
            	    {

            	    						newCompositeNode(grammarAccess.getSukcesyAccess().getDiceexprsukDiceExprSukParserRuleCall_3_1_0());
            	    					
            	    pushFollow(FOLLOW_4);
            	    lv_diceexprsuk_4_0=ruleDiceExprSuk();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getSukcesyRule());
            	    						}
            	    						add(
            	    							current,
            	    							"diceexprsuk",
            	    							lv_diceexprsuk_4_0,
            	    							"org.xtext.example.mydsl.MyDsl.DiceExprSuk");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

            // InternalMyDsl.g:296:3: (otherlv_5= '\\n' )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==13) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalMyDsl.g:297:4: otherlv_5= '\\n'
                    {
                    otherlv_5=(Token)match(input,13,FOLLOW_5); 

                    				newLeafNode(otherlv_5, grammarAccess.getSukcesyAccess().getLineFeedKeyword_4());
                    			

                    }
                    break;

            }

            // InternalMyDsl.g:302:3: (otherlv_6= '.' | otherlv_7= ',' )?
            int alt9=3;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==15) ) {
                alt9=1;
            }
            else if ( (LA9_0==16) ) {
                alt9=2;
            }
            switch (alt9) {
                case 1 :
                    // InternalMyDsl.g:303:4: otherlv_6= '.'
                    {
                    otherlv_6=(Token)match(input,15,FOLLOW_2); 

                    				newLeafNode(otherlv_6, grammarAccess.getSukcesyAccess().getFullStopKeyword_5_0());
                    			

                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:308:4: otherlv_7= ','
                    {
                    otherlv_7=(Token)match(input,16,FOLLOW_2); 

                    				newLeafNode(otherlv_7, grammarAccess.getSukcesyAccess().getCommaKeyword_5_1());
                    			

                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSukcesy"


    // $ANTLR start "entryRuleDiceExprSum"
    // InternalMyDsl.g:317:1: entryRuleDiceExprSum returns [EObject current=null] : iv_ruleDiceExprSum= ruleDiceExprSum EOF ;
    public final EObject entryRuleDiceExprSum() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDiceExprSum = null;


        try {
            // InternalMyDsl.g:317:52: (iv_ruleDiceExprSum= ruleDiceExprSum EOF )
            // InternalMyDsl.g:318:2: iv_ruleDiceExprSum= ruleDiceExprSum EOF
            {
             newCompositeNode(grammarAccess.getDiceExprSumRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDiceExprSum=ruleDiceExprSum();

            state._fsp--;

             current =iv_ruleDiceExprSum; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDiceExprSum"


    // $ANTLR start "ruleDiceExprSum"
    // InternalMyDsl.g:324:1: ruleDiceExprSum returns [EObject current=null] : ( ( (lv_sign_0_0= ruleSign ) )? ( (lv_mulexpr_1_0= ruleMulExpr ) ) (otherlv_2= ':' ( (lv_sumrule_3_0= ruleRuleSum ) ) (otherlv_4= ',' ( (lv_sumrule_5_0= ruleRuleSum ) ) )* )? ) ;
    public final EObject ruleDiceExprSum() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_4=null;
        Enumerator lv_sign_0_0 = null;

        EObject lv_mulexpr_1_0 = null;

        EObject lv_sumrule_3_0 = null;

        EObject lv_sumrule_5_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:330:2: ( ( ( (lv_sign_0_0= ruleSign ) )? ( (lv_mulexpr_1_0= ruleMulExpr ) ) (otherlv_2= ':' ( (lv_sumrule_3_0= ruleRuleSum ) ) (otherlv_4= ',' ( (lv_sumrule_5_0= ruleRuleSum ) ) )* )? ) )
            // InternalMyDsl.g:331:2: ( ( (lv_sign_0_0= ruleSign ) )? ( (lv_mulexpr_1_0= ruleMulExpr ) ) (otherlv_2= ':' ( (lv_sumrule_3_0= ruleRuleSum ) ) (otherlv_4= ',' ( (lv_sumrule_5_0= ruleRuleSum ) ) )* )? )
            {
            // InternalMyDsl.g:331:2: ( ( (lv_sign_0_0= ruleSign ) )? ( (lv_mulexpr_1_0= ruleMulExpr ) ) (otherlv_2= ':' ( (lv_sumrule_3_0= ruleRuleSum ) ) (otherlv_4= ',' ( (lv_sumrule_5_0= ruleRuleSum ) ) )* )? )
            // InternalMyDsl.g:332:3: ( (lv_sign_0_0= ruleSign ) )? ( (lv_mulexpr_1_0= ruleMulExpr ) ) (otherlv_2= ':' ( (lv_sumrule_3_0= ruleRuleSum ) ) (otherlv_4= ',' ( (lv_sumrule_5_0= ruleRuleSum ) ) )* )?
            {
            // InternalMyDsl.g:332:3: ( (lv_sign_0_0= ruleSign ) )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( ((LA10_0>=28 && LA10_0<=31)) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalMyDsl.g:333:4: (lv_sign_0_0= ruleSign )
                    {
                    // InternalMyDsl.g:333:4: (lv_sign_0_0= ruleSign )
                    // InternalMyDsl.g:334:5: lv_sign_0_0= ruleSign
                    {

                    					newCompositeNode(grammarAccess.getDiceExprSumAccess().getSignSignEnumRuleCall_0_0());
                    				
                    pushFollow(FOLLOW_3);
                    lv_sign_0_0=ruleSign();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getDiceExprSumRule());
                    					}
                    					set(
                    						current,
                    						"sign",
                    						lv_sign_0_0,
                    						"org.xtext.example.mydsl.MyDsl.Sign");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            // InternalMyDsl.g:351:3: ( (lv_mulexpr_1_0= ruleMulExpr ) )
            // InternalMyDsl.g:352:4: (lv_mulexpr_1_0= ruleMulExpr )
            {
            // InternalMyDsl.g:352:4: (lv_mulexpr_1_0= ruleMulExpr )
            // InternalMyDsl.g:353:5: lv_mulexpr_1_0= ruleMulExpr
            {

            					newCompositeNode(grammarAccess.getDiceExprSumAccess().getMulexprMulExprParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_6);
            lv_mulexpr_1_0=ruleMulExpr();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getDiceExprSumRule());
            					}
            					set(
            						current,
            						"mulexpr",
            						lv_mulexpr_1_0,
            						"org.xtext.example.mydsl.MyDsl.MulExpr");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalMyDsl.g:370:3: (otherlv_2= ':' ( (lv_sumrule_3_0= ruleRuleSum ) ) (otherlv_4= ',' ( (lv_sumrule_5_0= ruleRuleSum ) ) )* )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==18) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalMyDsl.g:371:4: otherlv_2= ':' ( (lv_sumrule_3_0= ruleRuleSum ) ) (otherlv_4= ',' ( (lv_sumrule_5_0= ruleRuleSum ) ) )*
                    {
                    otherlv_2=(Token)match(input,18,FOLLOW_7); 

                    				newLeafNode(otherlv_2, grammarAccess.getDiceExprSumAccess().getColonKeyword_2_0());
                    			
                    // InternalMyDsl.g:375:4: ( (lv_sumrule_3_0= ruleRuleSum ) )
                    // InternalMyDsl.g:376:5: (lv_sumrule_3_0= ruleRuleSum )
                    {
                    // InternalMyDsl.g:376:5: (lv_sumrule_3_0= ruleRuleSum )
                    // InternalMyDsl.g:377:6: lv_sumrule_3_0= ruleRuleSum
                    {

                    						newCompositeNode(grammarAccess.getDiceExprSumAccess().getSumruleRuleSumParserRuleCall_2_1_0());
                    					
                    pushFollow(FOLLOW_8);
                    lv_sumrule_3_0=ruleRuleSum();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getDiceExprSumRule());
                    						}
                    						add(
                    							current,
                    							"sumrule",
                    							lv_sumrule_3_0,
                    							"org.xtext.example.mydsl.MyDsl.RuleSum");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalMyDsl.g:394:4: (otherlv_4= ',' ( (lv_sumrule_5_0= ruleRuleSum ) ) )*
                    loop11:
                    do {
                        int alt11=2;
                        int LA11_0 = input.LA(1);

                        if ( (LA11_0==16) ) {
                            int LA11_2 = input.LA(2);

                            if ( ((LA11_2>=23 && LA11_2<=25)||(LA11_2>=28 && LA11_2<=31)) ) {
                                alt11=1;
                            }


                        }


                        switch (alt11) {
                    	case 1 :
                    	    // InternalMyDsl.g:395:5: otherlv_4= ',' ( (lv_sumrule_5_0= ruleRuleSum ) )
                    	    {
                    	    otherlv_4=(Token)match(input,16,FOLLOW_7); 

                    	    					newLeafNode(otherlv_4, grammarAccess.getDiceExprSumAccess().getCommaKeyword_2_2_0());
                    	    				
                    	    // InternalMyDsl.g:399:5: ( (lv_sumrule_5_0= ruleRuleSum ) )
                    	    // InternalMyDsl.g:400:6: (lv_sumrule_5_0= ruleRuleSum )
                    	    {
                    	    // InternalMyDsl.g:400:6: (lv_sumrule_5_0= ruleRuleSum )
                    	    // InternalMyDsl.g:401:7: lv_sumrule_5_0= ruleRuleSum
                    	    {

                    	    							newCompositeNode(grammarAccess.getDiceExprSumAccess().getSumruleRuleSumParserRuleCall_2_2_1_0());
                    	    						
                    	    pushFollow(FOLLOW_8);
                    	    lv_sumrule_5_0=ruleRuleSum();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getDiceExprSumRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"sumrule",
                    	    								lv_sumrule_5_0,
                    	    								"org.xtext.example.mydsl.MyDsl.RuleSum");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop11;
                        }
                    } while (true);


                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDiceExprSum"


    // $ANTLR start "entryRuleDiceExprSuk"
    // InternalMyDsl.g:424:1: entryRuleDiceExprSuk returns [EObject current=null] : iv_ruleDiceExprSuk= ruleDiceExprSuk EOF ;
    public final EObject entryRuleDiceExprSuk() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDiceExprSuk = null;


        try {
            // InternalMyDsl.g:424:52: (iv_ruleDiceExprSuk= ruleDiceExprSuk EOF )
            // InternalMyDsl.g:425:2: iv_ruleDiceExprSuk= ruleDiceExprSuk EOF
            {
             newCompositeNode(grammarAccess.getDiceExprSukRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDiceExprSuk=ruleDiceExprSuk();

            state._fsp--;

             current =iv_ruleDiceExprSuk; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDiceExprSuk"


    // $ANTLR start "ruleDiceExprSuk"
    // InternalMyDsl.g:431:1: ruleDiceExprSuk returns [EObject current=null] : ( ( (lv_sign_0_0= ruleSign ) )? ( (lv_mulexpr_1_0= ruleMulExpr ) ) (otherlv_2= ':' ( (lv_successrule_3_0= ruleRuleSuk ) ) (otherlv_4= ',' ( (lv_successrule_5_0= ruleRuleSuk ) ) )* )? ) ;
    public final EObject ruleDiceExprSuk() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_4=null;
        Enumerator lv_sign_0_0 = null;

        EObject lv_mulexpr_1_0 = null;

        EObject lv_successrule_3_0 = null;

        EObject lv_successrule_5_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:437:2: ( ( ( (lv_sign_0_0= ruleSign ) )? ( (lv_mulexpr_1_0= ruleMulExpr ) ) (otherlv_2= ':' ( (lv_successrule_3_0= ruleRuleSuk ) ) (otherlv_4= ',' ( (lv_successrule_5_0= ruleRuleSuk ) ) )* )? ) )
            // InternalMyDsl.g:438:2: ( ( (lv_sign_0_0= ruleSign ) )? ( (lv_mulexpr_1_0= ruleMulExpr ) ) (otherlv_2= ':' ( (lv_successrule_3_0= ruleRuleSuk ) ) (otherlv_4= ',' ( (lv_successrule_5_0= ruleRuleSuk ) ) )* )? )
            {
            // InternalMyDsl.g:438:2: ( ( (lv_sign_0_0= ruleSign ) )? ( (lv_mulexpr_1_0= ruleMulExpr ) ) (otherlv_2= ':' ( (lv_successrule_3_0= ruleRuleSuk ) ) (otherlv_4= ',' ( (lv_successrule_5_0= ruleRuleSuk ) ) )* )? )
            // InternalMyDsl.g:439:3: ( (lv_sign_0_0= ruleSign ) )? ( (lv_mulexpr_1_0= ruleMulExpr ) ) (otherlv_2= ':' ( (lv_successrule_3_0= ruleRuleSuk ) ) (otherlv_4= ',' ( (lv_successrule_5_0= ruleRuleSuk ) ) )* )?
            {
            // InternalMyDsl.g:439:3: ( (lv_sign_0_0= ruleSign ) )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( ((LA13_0>=28 && LA13_0<=31)) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalMyDsl.g:440:4: (lv_sign_0_0= ruleSign )
                    {
                    // InternalMyDsl.g:440:4: (lv_sign_0_0= ruleSign )
                    // InternalMyDsl.g:441:5: lv_sign_0_0= ruleSign
                    {

                    					newCompositeNode(grammarAccess.getDiceExprSukAccess().getSignSignEnumRuleCall_0_0());
                    				
                    pushFollow(FOLLOW_3);
                    lv_sign_0_0=ruleSign();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getDiceExprSukRule());
                    					}
                    					set(
                    						current,
                    						"sign",
                    						lv_sign_0_0,
                    						"org.xtext.example.mydsl.MyDsl.Sign");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            // InternalMyDsl.g:458:3: ( (lv_mulexpr_1_0= ruleMulExpr ) )
            // InternalMyDsl.g:459:4: (lv_mulexpr_1_0= ruleMulExpr )
            {
            // InternalMyDsl.g:459:4: (lv_mulexpr_1_0= ruleMulExpr )
            // InternalMyDsl.g:460:5: lv_mulexpr_1_0= ruleMulExpr
            {

            					newCompositeNode(grammarAccess.getDiceExprSukAccess().getMulexprMulExprParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_6);
            lv_mulexpr_1_0=ruleMulExpr();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getDiceExprSukRule());
            					}
            					set(
            						current,
            						"mulexpr",
            						lv_mulexpr_1_0,
            						"org.xtext.example.mydsl.MyDsl.MulExpr");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalMyDsl.g:477:3: (otherlv_2= ':' ( (lv_successrule_3_0= ruleRuleSuk ) ) (otherlv_4= ',' ( (lv_successrule_5_0= ruleRuleSuk ) ) )* )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==18) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalMyDsl.g:478:4: otherlv_2= ':' ( (lv_successrule_3_0= ruleRuleSuk ) ) (otherlv_4= ',' ( (lv_successrule_5_0= ruleRuleSuk ) ) )*
                    {
                    otherlv_2=(Token)match(input,18,FOLLOW_9); 

                    				newLeafNode(otherlv_2, grammarAccess.getDiceExprSukAccess().getColonKeyword_2_0());
                    			
                    // InternalMyDsl.g:482:4: ( (lv_successrule_3_0= ruleRuleSuk ) )
                    // InternalMyDsl.g:483:5: (lv_successrule_3_0= ruleRuleSuk )
                    {
                    // InternalMyDsl.g:483:5: (lv_successrule_3_0= ruleRuleSuk )
                    // InternalMyDsl.g:484:6: lv_successrule_3_0= ruleRuleSuk
                    {

                    						newCompositeNode(grammarAccess.getDiceExprSukAccess().getSuccessruleRuleSukParserRuleCall_2_1_0());
                    					
                    pushFollow(FOLLOW_8);
                    lv_successrule_3_0=ruleRuleSuk();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getDiceExprSukRule());
                    						}
                    						add(
                    							current,
                    							"successrule",
                    							lv_successrule_3_0,
                    							"org.xtext.example.mydsl.MyDsl.RuleSuk");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalMyDsl.g:501:4: (otherlv_4= ',' ( (lv_successrule_5_0= ruleRuleSuk ) ) )*
                    loop14:
                    do {
                        int alt14=2;
                        int LA14_0 = input.LA(1);

                        if ( (LA14_0==16) ) {
                            int LA14_2 = input.LA(2);

                            if ( ((LA14_2>=23 && LA14_2<=26)) ) {
                                alt14=1;
                            }


                        }


                        switch (alt14) {
                    	case 1 :
                    	    // InternalMyDsl.g:502:5: otherlv_4= ',' ( (lv_successrule_5_0= ruleRuleSuk ) )
                    	    {
                    	    otherlv_4=(Token)match(input,16,FOLLOW_9); 

                    	    					newLeafNode(otherlv_4, grammarAccess.getDiceExprSukAccess().getCommaKeyword_2_2_0());
                    	    				
                    	    // InternalMyDsl.g:506:5: ( (lv_successrule_5_0= ruleRuleSuk ) )
                    	    // InternalMyDsl.g:507:6: (lv_successrule_5_0= ruleRuleSuk )
                    	    {
                    	    // InternalMyDsl.g:507:6: (lv_successrule_5_0= ruleRuleSuk )
                    	    // InternalMyDsl.g:508:7: lv_successrule_5_0= ruleRuleSuk
                    	    {

                    	    							newCompositeNode(grammarAccess.getDiceExprSukAccess().getSuccessruleRuleSukParserRuleCall_2_2_1_0());
                    	    						
                    	    pushFollow(FOLLOW_8);
                    	    lv_successrule_5_0=ruleRuleSuk();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getDiceExprSukRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"successrule",
                    	    								lv_successrule_5_0,
                    	    								"org.xtext.example.mydsl.MyDsl.RuleSuk");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop14;
                        }
                    } while (true);


                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDiceExprSuk"


    // $ANTLR start "entryRuleMulExpr"
    // InternalMyDsl.g:531:1: entryRuleMulExpr returns [EObject current=null] : iv_ruleMulExpr= ruleMulExpr EOF ;
    public final EObject entryRuleMulExpr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMulExpr = null;


        try {
            // InternalMyDsl.g:531:48: (iv_ruleMulExpr= ruleMulExpr EOF )
            // InternalMyDsl.g:532:2: iv_ruleMulExpr= ruleMulExpr EOF
            {
             newCompositeNode(grammarAccess.getMulExprRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMulExpr=ruleMulExpr();

            state._fsp--;

             current =iv_ruleMulExpr; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleMulExpr"


    // $ANTLR start "ruleMulExpr"
    // InternalMyDsl.g:538:1: ruleMulExpr returns [EObject current=null] : ( ( ( (lv_formexpr_0_0= ruleForm ) ) (otherlv_1= 'razy' ( (lv_num_2_0= ruleNum ) ) )? ) | (otherlv_3= '(' ( (lv_formexpr_4_0= ruleForm ) ) otherlv_5= ')' (otherlv_6= 'razy' ( (lv_num_7_0= ruleNum ) ) )? ) ) ;
    public final EObject ruleMulExpr() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        EObject lv_formexpr_0_0 = null;

        EObject lv_num_2_0 = null;

        EObject lv_formexpr_4_0 = null;

        EObject lv_num_7_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:544:2: ( ( ( ( (lv_formexpr_0_0= ruleForm ) ) (otherlv_1= 'razy' ( (lv_num_2_0= ruleNum ) ) )? ) | (otherlv_3= '(' ( (lv_formexpr_4_0= ruleForm ) ) otherlv_5= ')' (otherlv_6= 'razy' ( (lv_num_7_0= ruleNum ) ) )? ) ) )
            // InternalMyDsl.g:545:2: ( ( ( (lv_formexpr_0_0= ruleForm ) ) (otherlv_1= 'razy' ( (lv_num_2_0= ruleNum ) ) )? ) | (otherlv_3= '(' ( (lv_formexpr_4_0= ruleForm ) ) otherlv_5= ')' (otherlv_6= 'razy' ( (lv_num_7_0= ruleNum ) ) )? ) )
            {
            // InternalMyDsl.g:545:2: ( ( ( (lv_formexpr_0_0= ruleForm ) ) (otherlv_1= 'razy' ( (lv_num_2_0= ruleNum ) ) )? ) | (otherlv_3= '(' ( (lv_formexpr_4_0= ruleForm ) ) otherlv_5= ')' (otherlv_6= 'razy' ( (lv_num_7_0= ruleNum ) ) )? ) )
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( ((LA18_0>=RULE_D && LA18_0<=RULE_INT)||LA18_0==27) ) {
                alt18=1;
            }
            else if ( (LA18_0==20) ) {
                alt18=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 18, 0, input);

                throw nvae;
            }
            switch (alt18) {
                case 1 :
                    // InternalMyDsl.g:546:3: ( ( (lv_formexpr_0_0= ruleForm ) ) (otherlv_1= 'razy' ( (lv_num_2_0= ruleNum ) ) )? )
                    {
                    // InternalMyDsl.g:546:3: ( ( (lv_formexpr_0_0= ruleForm ) ) (otherlv_1= 'razy' ( (lv_num_2_0= ruleNum ) ) )? )
                    // InternalMyDsl.g:547:4: ( (lv_formexpr_0_0= ruleForm ) ) (otherlv_1= 'razy' ( (lv_num_2_0= ruleNum ) ) )?
                    {
                    // InternalMyDsl.g:547:4: ( (lv_formexpr_0_0= ruleForm ) )
                    // InternalMyDsl.g:548:5: (lv_formexpr_0_0= ruleForm )
                    {
                    // InternalMyDsl.g:548:5: (lv_formexpr_0_0= ruleForm )
                    // InternalMyDsl.g:549:6: lv_formexpr_0_0= ruleForm
                    {

                    						newCompositeNode(grammarAccess.getMulExprAccess().getFormexprFormParserRuleCall_0_0_0());
                    					
                    pushFollow(FOLLOW_10);
                    lv_formexpr_0_0=ruleForm();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getMulExprRule());
                    						}
                    						set(
                    							current,
                    							"formexpr",
                    							lv_formexpr_0_0,
                    							"org.xtext.example.mydsl.MyDsl.Form");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalMyDsl.g:566:4: (otherlv_1= 'razy' ( (lv_num_2_0= ruleNum ) ) )?
                    int alt16=2;
                    int LA16_0 = input.LA(1);

                    if ( (LA16_0==19) ) {
                        alt16=1;
                    }
                    switch (alt16) {
                        case 1 :
                            // InternalMyDsl.g:567:5: otherlv_1= 'razy' ( (lv_num_2_0= ruleNum ) )
                            {
                            otherlv_1=(Token)match(input,19,FOLLOW_11); 

                            					newLeafNode(otherlv_1, grammarAccess.getMulExprAccess().getRazyKeyword_0_1_0());
                            				
                            // InternalMyDsl.g:571:5: ( (lv_num_2_0= ruleNum ) )
                            // InternalMyDsl.g:572:6: (lv_num_2_0= ruleNum )
                            {
                            // InternalMyDsl.g:572:6: (lv_num_2_0= ruleNum )
                            // InternalMyDsl.g:573:7: lv_num_2_0= ruleNum
                            {

                            							newCompositeNode(grammarAccess.getMulExprAccess().getNumNumParserRuleCall_0_1_1_0());
                            						
                            pushFollow(FOLLOW_2);
                            lv_num_2_0=ruleNum();

                            state._fsp--;


                            							if (current==null) {
                            								current = createModelElementForParent(grammarAccess.getMulExprRule());
                            							}
                            							set(
                            								current,
                            								"num",
                            								lv_num_2_0,
                            								"org.xtext.example.mydsl.MyDsl.Num");
                            							afterParserOrEnumRuleCall();
                            						

                            }


                            }


                            }
                            break;

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:593:3: (otherlv_3= '(' ( (lv_formexpr_4_0= ruleForm ) ) otherlv_5= ')' (otherlv_6= 'razy' ( (lv_num_7_0= ruleNum ) ) )? )
                    {
                    // InternalMyDsl.g:593:3: (otherlv_3= '(' ( (lv_formexpr_4_0= ruleForm ) ) otherlv_5= ')' (otherlv_6= 'razy' ( (lv_num_7_0= ruleNum ) ) )? )
                    // InternalMyDsl.g:594:4: otherlv_3= '(' ( (lv_formexpr_4_0= ruleForm ) ) otherlv_5= ')' (otherlv_6= 'razy' ( (lv_num_7_0= ruleNum ) ) )?
                    {
                    otherlv_3=(Token)match(input,20,FOLLOW_11); 

                    				newLeafNode(otherlv_3, grammarAccess.getMulExprAccess().getLeftParenthesisKeyword_1_0());
                    			
                    // InternalMyDsl.g:598:4: ( (lv_formexpr_4_0= ruleForm ) )
                    // InternalMyDsl.g:599:5: (lv_formexpr_4_0= ruleForm )
                    {
                    // InternalMyDsl.g:599:5: (lv_formexpr_4_0= ruleForm )
                    // InternalMyDsl.g:600:6: lv_formexpr_4_0= ruleForm
                    {

                    						newCompositeNode(grammarAccess.getMulExprAccess().getFormexprFormParserRuleCall_1_1_0());
                    					
                    pushFollow(FOLLOW_12);
                    lv_formexpr_4_0=ruleForm();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getMulExprRule());
                    						}
                    						set(
                    							current,
                    							"formexpr",
                    							lv_formexpr_4_0,
                    							"org.xtext.example.mydsl.MyDsl.Form");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_5=(Token)match(input,21,FOLLOW_10); 

                    				newLeafNode(otherlv_5, grammarAccess.getMulExprAccess().getRightParenthesisKeyword_1_2());
                    			
                    // InternalMyDsl.g:621:4: (otherlv_6= 'razy' ( (lv_num_7_0= ruleNum ) ) )?
                    int alt17=2;
                    int LA17_0 = input.LA(1);

                    if ( (LA17_0==19) ) {
                        alt17=1;
                    }
                    switch (alt17) {
                        case 1 :
                            // InternalMyDsl.g:622:5: otherlv_6= 'razy' ( (lv_num_7_0= ruleNum ) )
                            {
                            otherlv_6=(Token)match(input,19,FOLLOW_11); 

                            					newLeafNode(otherlv_6, grammarAccess.getMulExprAccess().getRazyKeyword_1_3_0());
                            				
                            // InternalMyDsl.g:626:5: ( (lv_num_7_0= ruleNum ) )
                            // InternalMyDsl.g:627:6: (lv_num_7_0= ruleNum )
                            {
                            // InternalMyDsl.g:627:6: (lv_num_7_0= ruleNum )
                            // InternalMyDsl.g:628:7: lv_num_7_0= ruleNum
                            {

                            							newCompositeNode(grammarAccess.getMulExprAccess().getNumNumParserRuleCall_1_3_1_0());
                            						
                            pushFollow(FOLLOW_2);
                            lv_num_7_0=ruleNum();

                            state._fsp--;


                            							if (current==null) {
                            								current = createModelElementForParent(grammarAccess.getMulExprRule());
                            							}
                            							set(
                            								current,
                            								"num",
                            								lv_num_7_0,
                            								"org.xtext.example.mydsl.MyDsl.Num");
                            							afterParserOrEnumRuleCall();
                            						

                            }


                            }


                            }
                            break;

                    }


                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMulExpr"


    // $ANTLR start "entryRuleForm"
    // InternalMyDsl.g:651:1: entryRuleForm returns [EObject current=null] : iv_ruleForm= ruleForm EOF ;
    public final EObject entryRuleForm() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleForm = null;


        try {
            // InternalMyDsl.g:651:45: (iv_ruleForm= ruleForm EOF )
            // InternalMyDsl.g:652:2: iv_ruleForm= ruleForm EOF
            {
             newCompositeNode(grammarAccess.getFormRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleForm=ruleForm();

            state._fsp--;

             current =iv_ruleForm; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleForm"


    // $ANTLR start "ruleForm"
    // InternalMyDsl.g:658:1: ruleForm returns [EObject current=null] : ( ( (lv_left_0_0= ruleDice ) ) ( ( (lv_operator_1_0= ruleOperator ) ) ( (lv_right_2_0= ruleNum ) ) )? ) ;
    public final EObject ruleForm() throws RecognitionException {
        EObject current = null;

        EObject lv_left_0_0 = null;

        Enumerator lv_operator_1_0 = null;

        EObject lv_right_2_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:664:2: ( ( ( (lv_left_0_0= ruleDice ) ) ( ( (lv_operator_1_0= ruleOperator ) ) ( (lv_right_2_0= ruleNum ) ) )? ) )
            // InternalMyDsl.g:665:2: ( ( (lv_left_0_0= ruleDice ) ) ( ( (lv_operator_1_0= ruleOperator ) ) ( (lv_right_2_0= ruleNum ) ) )? )
            {
            // InternalMyDsl.g:665:2: ( ( (lv_left_0_0= ruleDice ) ) ( ( (lv_operator_1_0= ruleOperator ) ) ( (lv_right_2_0= ruleNum ) ) )? )
            // InternalMyDsl.g:666:3: ( (lv_left_0_0= ruleDice ) ) ( ( (lv_operator_1_0= ruleOperator ) ) ( (lv_right_2_0= ruleNum ) ) )?
            {
            // InternalMyDsl.g:666:3: ( (lv_left_0_0= ruleDice ) )
            // InternalMyDsl.g:667:4: (lv_left_0_0= ruleDice )
            {
            // InternalMyDsl.g:667:4: (lv_left_0_0= ruleDice )
            // InternalMyDsl.g:668:5: lv_left_0_0= ruleDice
            {

            					newCompositeNode(grammarAccess.getFormAccess().getLeftDiceParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_13);
            lv_left_0_0=ruleDice();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getFormRule());
            					}
            					set(
            						current,
            						"left",
            						lv_left_0_0,
            						"org.xtext.example.mydsl.MyDsl.Dice");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalMyDsl.g:685:3: ( ( (lv_operator_1_0= ruleOperator ) ) ( (lv_right_2_0= ruleNum ) ) )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==28||LA19_0==31||(LA19_0>=34 && LA19_0<=35)) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // InternalMyDsl.g:686:4: ( (lv_operator_1_0= ruleOperator ) ) ( (lv_right_2_0= ruleNum ) )
                    {
                    // InternalMyDsl.g:686:4: ( (lv_operator_1_0= ruleOperator ) )
                    // InternalMyDsl.g:687:5: (lv_operator_1_0= ruleOperator )
                    {
                    // InternalMyDsl.g:687:5: (lv_operator_1_0= ruleOperator )
                    // InternalMyDsl.g:688:6: lv_operator_1_0= ruleOperator
                    {

                    						newCompositeNode(grammarAccess.getFormAccess().getOperatorOperatorEnumRuleCall_1_0_0());
                    					
                    pushFollow(FOLLOW_11);
                    lv_operator_1_0=ruleOperator();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getFormRule());
                    						}
                    						set(
                    							current,
                    							"operator",
                    							lv_operator_1_0,
                    							"org.xtext.example.mydsl.MyDsl.Operator");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalMyDsl.g:705:4: ( (lv_right_2_0= ruleNum ) )
                    // InternalMyDsl.g:706:5: (lv_right_2_0= ruleNum )
                    {
                    // InternalMyDsl.g:706:5: (lv_right_2_0= ruleNum )
                    // InternalMyDsl.g:707:6: lv_right_2_0= ruleNum
                    {

                    						newCompositeNode(grammarAccess.getFormAccess().getRightNumParserRuleCall_1_1_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_right_2_0=ruleNum();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getFormRule());
                    						}
                    						set(
                    							current,
                    							"right",
                    							lv_right_2_0,
                    							"org.xtext.example.mydsl.MyDsl.Num");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleForm"


    // $ANTLR start "entryRuleSingleDice"
    // InternalMyDsl.g:729:1: entryRuleSingleDice returns [EObject current=null] : iv_ruleSingleDice= ruleSingleDice EOF ;
    public final EObject entryRuleSingleDice() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSingleDice = null;


        try {
            // InternalMyDsl.g:729:51: (iv_ruleSingleDice= ruleSingleDice EOF )
            // InternalMyDsl.g:730:2: iv_ruleSingleDice= ruleSingleDice EOF
            {
             newCompositeNode(grammarAccess.getSingleDiceRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSingleDice=ruleSingleDice();

            state._fsp--;

             current =iv_ruleSingleDice; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSingleDice"


    // $ANTLR start "ruleSingleDice"
    // InternalMyDsl.g:736:1: ruleSingleDice returns [EObject current=null] : (this_D_0= RULE_D ( (lv_sides_1_0= ruleNum ) ) ) ;
    public final EObject ruleSingleDice() throws RecognitionException {
        EObject current = null;

        Token this_D_0=null;
        EObject lv_sides_1_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:742:2: ( (this_D_0= RULE_D ( (lv_sides_1_0= ruleNum ) ) ) )
            // InternalMyDsl.g:743:2: (this_D_0= RULE_D ( (lv_sides_1_0= ruleNum ) ) )
            {
            // InternalMyDsl.g:743:2: (this_D_0= RULE_D ( (lv_sides_1_0= ruleNum ) ) )
            // InternalMyDsl.g:744:3: this_D_0= RULE_D ( (lv_sides_1_0= ruleNum ) )
            {
            this_D_0=(Token)match(input,RULE_D,FOLLOW_11); 

            			newLeafNode(this_D_0, grammarAccess.getSingleDiceAccess().getDTerminalRuleCall_0());
            		
            // InternalMyDsl.g:748:3: ( (lv_sides_1_0= ruleNum ) )
            // InternalMyDsl.g:749:4: (lv_sides_1_0= ruleNum )
            {
            // InternalMyDsl.g:749:4: (lv_sides_1_0= ruleNum )
            // InternalMyDsl.g:750:5: lv_sides_1_0= ruleNum
            {

            					newCompositeNode(grammarAccess.getSingleDiceAccess().getSidesNumParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_2);
            lv_sides_1_0=ruleNum();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getSingleDiceRule());
            					}
            					set(
            						current,
            						"sides",
            						lv_sides_1_0,
            						"org.xtext.example.mydsl.MyDsl.Num");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSingleDice"


    // $ANTLR start "entryRuleMultiDice"
    // InternalMyDsl.g:771:1: entryRuleMultiDice returns [EObject current=null] : iv_ruleMultiDice= ruleMultiDice EOF ;
    public final EObject entryRuleMultiDice() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMultiDice = null;


        try {
            // InternalMyDsl.g:771:50: (iv_ruleMultiDice= ruleMultiDice EOF )
            // InternalMyDsl.g:772:2: iv_ruleMultiDice= ruleMultiDice EOF
            {
             newCompositeNode(grammarAccess.getMultiDiceRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMultiDice=ruleMultiDice();

            state._fsp--;

             current =iv_ruleMultiDice; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleMultiDice"


    // $ANTLR start "ruleMultiDice"
    // InternalMyDsl.g:778:1: ruleMultiDice returns [EObject current=null] : ( ( (lv_count_0_0= ruleNum ) ) this_D_1= RULE_D ( (lv_sides_2_0= ruleNum ) ) ) ;
    public final EObject ruleMultiDice() throws RecognitionException {
        EObject current = null;

        Token this_D_1=null;
        EObject lv_count_0_0 = null;

        EObject lv_sides_2_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:784:2: ( ( ( (lv_count_0_0= ruleNum ) ) this_D_1= RULE_D ( (lv_sides_2_0= ruleNum ) ) ) )
            // InternalMyDsl.g:785:2: ( ( (lv_count_0_0= ruleNum ) ) this_D_1= RULE_D ( (lv_sides_2_0= ruleNum ) ) )
            {
            // InternalMyDsl.g:785:2: ( ( (lv_count_0_0= ruleNum ) ) this_D_1= RULE_D ( (lv_sides_2_0= ruleNum ) ) )
            // InternalMyDsl.g:786:3: ( (lv_count_0_0= ruleNum ) ) this_D_1= RULE_D ( (lv_sides_2_0= ruleNum ) )
            {
            // InternalMyDsl.g:786:3: ( (lv_count_0_0= ruleNum ) )
            // InternalMyDsl.g:787:4: (lv_count_0_0= ruleNum )
            {
            // InternalMyDsl.g:787:4: (lv_count_0_0= ruleNum )
            // InternalMyDsl.g:788:5: lv_count_0_0= ruleNum
            {

            					newCompositeNode(grammarAccess.getMultiDiceAccess().getCountNumParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_14);
            lv_count_0_0=ruleNum();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getMultiDiceRule());
            					}
            					set(
            						current,
            						"count",
            						lv_count_0_0,
            						"org.xtext.example.mydsl.MyDsl.Num");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            this_D_1=(Token)match(input,RULE_D,FOLLOW_11); 

            			newLeafNode(this_D_1, grammarAccess.getMultiDiceAccess().getDTerminalRuleCall_1());
            		
            // InternalMyDsl.g:809:3: ( (lv_sides_2_0= ruleNum ) )
            // InternalMyDsl.g:810:4: (lv_sides_2_0= ruleNum )
            {
            // InternalMyDsl.g:810:4: (lv_sides_2_0= ruleNum )
            // InternalMyDsl.g:811:5: lv_sides_2_0= ruleNum
            {

            					newCompositeNode(grammarAccess.getMultiDiceAccess().getSidesNumParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_sides_2_0=ruleNum();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getMultiDiceRule());
            					}
            					set(
            						current,
            						"sides",
            						lv_sides_2_0,
            						"org.xtext.example.mydsl.MyDsl.Num");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMultiDice"


    // $ANTLR start "entryRuleDice"
    // InternalMyDsl.g:832:1: entryRuleDice returns [EObject current=null] : iv_ruleDice= ruleDice EOF ;
    public final EObject entryRuleDice() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDice = null;


        try {
            // InternalMyDsl.g:832:45: (iv_ruleDice= ruleDice EOF )
            // InternalMyDsl.g:833:2: iv_ruleDice= ruleDice EOF
            {
             newCompositeNode(grammarAccess.getDiceRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDice=ruleDice();

            state._fsp--;

             current =iv_ruleDice; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDice"


    // $ANTLR start "ruleDice"
    // InternalMyDsl.g:839:1: ruleDice returns [EObject current=null] : (this_SingleDice_0= ruleSingleDice | this_MultiDice_1= ruleMultiDice ) ;
    public final EObject ruleDice() throws RecognitionException {
        EObject current = null;

        EObject this_SingleDice_0 = null;

        EObject this_MultiDice_1 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:845:2: ( (this_SingleDice_0= ruleSingleDice | this_MultiDice_1= ruleMultiDice ) )
            // InternalMyDsl.g:846:2: (this_SingleDice_0= ruleSingleDice | this_MultiDice_1= ruleMultiDice )
            {
            // InternalMyDsl.g:846:2: (this_SingleDice_0= ruleSingleDice | this_MultiDice_1= ruleMultiDice )
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==RULE_D) ) {
                alt20=1;
            }
            else if ( (LA20_0==RULE_INT||LA20_0==27) ) {
                alt20=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 20, 0, input);

                throw nvae;
            }
            switch (alt20) {
                case 1 :
                    // InternalMyDsl.g:847:3: this_SingleDice_0= ruleSingleDice
                    {

                    			newCompositeNode(grammarAccess.getDiceAccess().getSingleDiceParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_SingleDice_0=ruleSingleDice();

                    state._fsp--;


                    			current = this_SingleDice_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:856:3: this_MultiDice_1= ruleMultiDice
                    {

                    			newCompositeNode(grammarAccess.getDiceAccess().getMultiDiceParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_MultiDice_1=ruleMultiDice();

                    state._fsp--;


                    			current = this_MultiDice_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDice"


    // $ANTLR start "entryRuleRuleSum"
    // InternalMyDsl.g:868:1: entryRuleRuleSum returns [EObject current=null] : iv_ruleRuleSum= ruleRuleSum EOF ;
    public final EObject entryRuleRuleSum() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRuleSum = null;


        try {
            // InternalMyDsl.g:868:48: (iv_ruleRuleSum= ruleRuleSum EOF )
            // InternalMyDsl.g:869:2: iv_ruleRuleSum= ruleRuleSum EOF
            {
             newCompositeNode(grammarAccess.getRuleSumRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRuleSum=ruleRuleSum();

            state._fsp--;

             current =iv_ruleRuleSum; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleRuleSum"


    // $ANTLR start "ruleRuleSum"
    // InternalMyDsl.g:875:1: ruleRuleSum returns [EObject current=null] : (this_ExplosionRule_0= ruleExplosionRule | this_DiceMarkSum_1= ruleDiceMarkSum | this_DiceDiscSum_2= ruleDiceDiscSum | this_DiceRerollSum_3= ruleDiceRerollSum ) ;
    public final EObject ruleRuleSum() throws RecognitionException {
        EObject current = null;

        EObject this_ExplosionRule_0 = null;

        EObject this_DiceMarkSum_1 = null;

        EObject this_DiceDiscSum_2 = null;

        EObject this_DiceRerollSum_3 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:881:2: ( (this_ExplosionRule_0= ruleExplosionRule | this_DiceMarkSum_1= ruleDiceMarkSum | this_DiceDiscSum_2= ruleDiceDiscSum | this_DiceRerollSum_3= ruleDiceRerollSum ) )
            // InternalMyDsl.g:882:2: (this_ExplosionRule_0= ruleExplosionRule | this_DiceMarkSum_1= ruleDiceMarkSum | this_DiceDiscSum_2= ruleDiceDiscSum | this_DiceRerollSum_3= ruleDiceRerollSum )
            {
            // InternalMyDsl.g:882:2: (this_ExplosionRule_0= ruleExplosionRule | this_DiceMarkSum_1= ruleDiceMarkSum | this_DiceDiscSum_2= ruleDiceDiscSum | this_DiceRerollSum_3= ruleDiceRerollSum )
            int alt21=4;
            switch ( input.LA(1) ) {
            case 28:
            case 29:
            case 30:
            case 31:
                {
                alt21=1;
                }
                break;
            case 23:
                {
                alt21=2;
                }
                break;
            case 24:
                {
                alt21=3;
                }
                break;
            case 25:
                {
                alt21=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 21, 0, input);

                throw nvae;
            }

            switch (alt21) {
                case 1 :
                    // InternalMyDsl.g:883:3: this_ExplosionRule_0= ruleExplosionRule
                    {

                    			newCompositeNode(grammarAccess.getRuleSumAccess().getExplosionRuleParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_ExplosionRule_0=ruleExplosionRule();

                    state._fsp--;


                    			current = this_ExplosionRule_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:892:3: this_DiceMarkSum_1= ruleDiceMarkSum
                    {

                    			newCompositeNode(grammarAccess.getRuleSumAccess().getDiceMarkSumParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_DiceMarkSum_1=ruleDiceMarkSum();

                    state._fsp--;


                    			current = this_DiceMarkSum_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:901:3: this_DiceDiscSum_2= ruleDiceDiscSum
                    {

                    			newCompositeNode(grammarAccess.getRuleSumAccess().getDiceDiscSumParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_DiceDiscSum_2=ruleDiceDiscSum();

                    state._fsp--;


                    			current = this_DiceDiscSum_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalMyDsl.g:910:3: this_DiceRerollSum_3= ruleDiceRerollSum
                    {

                    			newCompositeNode(grammarAccess.getRuleSumAccess().getDiceRerollSumParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_DiceRerollSum_3=ruleDiceRerollSum();

                    state._fsp--;


                    			current = this_DiceRerollSum_3;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleRuleSum"


    // $ANTLR start "entryRuleExplosionRule"
    // InternalMyDsl.g:922:1: entryRuleExplosionRule returns [EObject current=null] : iv_ruleExplosionRule= ruleExplosionRule EOF ;
    public final EObject entryRuleExplosionRule() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExplosionRule = null;


        try {
            // InternalMyDsl.g:922:54: (iv_ruleExplosionRule= ruleExplosionRule EOF )
            // InternalMyDsl.g:923:2: iv_ruleExplosionRule= ruleExplosionRule EOF
            {
             newCompositeNode(grammarAccess.getExplosionRuleRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleExplosionRule=ruleExplosionRule();

            state._fsp--;

             current =iv_ruleExplosionRule; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleExplosionRule"


    // $ANTLR start "ruleExplosionRule"
    // InternalMyDsl.g:929:1: ruleExplosionRule returns [EObject current=null] : ( ( (lv_sign_0_0= ruleSign ) ) otherlv_1= 'wybuchowe' ( (lv_num_2_0= ruleNum ) ) ) ;
    public final EObject ruleExplosionRule() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Enumerator lv_sign_0_0 = null;

        EObject lv_num_2_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:935:2: ( ( ( (lv_sign_0_0= ruleSign ) ) otherlv_1= 'wybuchowe' ( (lv_num_2_0= ruleNum ) ) ) )
            // InternalMyDsl.g:936:2: ( ( (lv_sign_0_0= ruleSign ) ) otherlv_1= 'wybuchowe' ( (lv_num_2_0= ruleNum ) ) )
            {
            // InternalMyDsl.g:936:2: ( ( (lv_sign_0_0= ruleSign ) ) otherlv_1= 'wybuchowe' ( (lv_num_2_0= ruleNum ) ) )
            // InternalMyDsl.g:937:3: ( (lv_sign_0_0= ruleSign ) ) otherlv_1= 'wybuchowe' ( (lv_num_2_0= ruleNum ) )
            {
            // InternalMyDsl.g:937:3: ( (lv_sign_0_0= ruleSign ) )
            // InternalMyDsl.g:938:4: (lv_sign_0_0= ruleSign )
            {
            // InternalMyDsl.g:938:4: (lv_sign_0_0= ruleSign )
            // InternalMyDsl.g:939:5: lv_sign_0_0= ruleSign
            {

            					newCompositeNode(grammarAccess.getExplosionRuleAccess().getSignSignEnumRuleCall_0_0());
            				
            pushFollow(FOLLOW_15);
            lv_sign_0_0=ruleSign();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getExplosionRuleRule());
            					}
            					set(
            						current,
            						"sign",
            						lv_sign_0_0,
            						"org.xtext.example.mydsl.MyDsl.Sign");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_1=(Token)match(input,22,FOLLOW_11); 

            			newLeafNode(otherlv_1, grammarAccess.getExplosionRuleAccess().getWybuchoweKeyword_1());
            		
            // InternalMyDsl.g:960:3: ( (lv_num_2_0= ruleNum ) )
            // InternalMyDsl.g:961:4: (lv_num_2_0= ruleNum )
            {
            // InternalMyDsl.g:961:4: (lv_num_2_0= ruleNum )
            // InternalMyDsl.g:962:5: lv_num_2_0= ruleNum
            {

            					newCompositeNode(grammarAccess.getExplosionRuleAccess().getNumNumParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_num_2_0=ruleNum();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getExplosionRuleRule());
            					}
            					set(
            						current,
            						"num",
            						lv_num_2_0,
            						"org.xtext.example.mydsl.MyDsl.Num");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleExplosionRule"


    // $ANTLR start "entryRuleDiceMarkSum"
    // InternalMyDsl.g:983:1: entryRuleDiceMarkSum returns [EObject current=null] : iv_ruleDiceMarkSum= ruleDiceMarkSum EOF ;
    public final EObject entryRuleDiceMarkSum() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDiceMarkSum = null;


        try {
            // InternalMyDsl.g:983:52: (iv_ruleDiceMarkSum= ruleDiceMarkSum EOF )
            // InternalMyDsl.g:984:2: iv_ruleDiceMarkSum= ruleDiceMarkSum EOF
            {
             newCompositeNode(grammarAccess.getDiceMarkSumRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDiceMarkSum=ruleDiceMarkSum();

            state._fsp--;

             current =iv_ruleDiceMarkSum; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDiceMarkSum"


    // $ANTLR start "ruleDiceMarkSum"
    // InternalMyDsl.g:990:1: ruleDiceMarkSum returns [EObject current=null] : (otherlv_0= 'oznacz' ( (lv_mark_1_0= ruleMark ) ) ) ;
    public final EObject ruleDiceMarkSum() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_mark_1_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:996:2: ( (otherlv_0= 'oznacz' ( (lv_mark_1_0= ruleMark ) ) ) )
            // InternalMyDsl.g:997:2: (otherlv_0= 'oznacz' ( (lv_mark_1_0= ruleMark ) ) )
            {
            // InternalMyDsl.g:997:2: (otherlv_0= 'oznacz' ( (lv_mark_1_0= ruleMark ) ) )
            // InternalMyDsl.g:998:3: otherlv_0= 'oznacz' ( (lv_mark_1_0= ruleMark ) )
            {
            otherlv_0=(Token)match(input,23,FOLLOW_16); 

            			newLeafNode(otherlv_0, grammarAccess.getDiceMarkSumAccess().getOznaczKeyword_0());
            		
            // InternalMyDsl.g:1002:3: ( (lv_mark_1_0= ruleMark ) )
            // InternalMyDsl.g:1003:4: (lv_mark_1_0= ruleMark )
            {
            // InternalMyDsl.g:1003:4: (lv_mark_1_0= ruleMark )
            // InternalMyDsl.g:1004:5: lv_mark_1_0= ruleMark
            {

            					newCompositeNode(grammarAccess.getDiceMarkSumAccess().getMarkMarkParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_2);
            lv_mark_1_0=ruleMark();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getDiceMarkSumRule());
            					}
            					set(
            						current,
            						"mark",
            						lv_mark_1_0,
            						"org.xtext.example.mydsl.MyDsl.Mark");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDiceMarkSum"


    // $ANTLR start "entryRuleDiceDiscSum"
    // InternalMyDsl.g:1025:1: entryRuleDiceDiscSum returns [EObject current=null] : iv_ruleDiceDiscSum= ruleDiceDiscSum EOF ;
    public final EObject entryRuleDiceDiscSum() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDiceDiscSum = null;


        try {
            // InternalMyDsl.g:1025:52: (iv_ruleDiceDiscSum= ruleDiceDiscSum EOF )
            // InternalMyDsl.g:1026:2: iv_ruleDiceDiscSum= ruleDiceDiscSum EOF
            {
             newCompositeNode(grammarAccess.getDiceDiscSumRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDiceDiscSum=ruleDiceDiscSum();

            state._fsp--;

             current =iv_ruleDiceDiscSum; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDiceDiscSum"


    // $ANTLR start "ruleDiceDiscSum"
    // InternalMyDsl.g:1032:1: ruleDiceDiscSum returns [EObject current=null] : (otherlv_0= 'odrzuc' ( (lv_discard_1_0= ruleDiscard ) ) ) ;
    public final EObject ruleDiceDiscSum() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_discard_1_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:1038:2: ( (otherlv_0= 'odrzuc' ( (lv_discard_1_0= ruleDiscard ) ) ) )
            // InternalMyDsl.g:1039:2: (otherlv_0= 'odrzuc' ( (lv_discard_1_0= ruleDiscard ) ) )
            {
            // InternalMyDsl.g:1039:2: (otherlv_0= 'odrzuc' ( (lv_discard_1_0= ruleDiscard ) ) )
            // InternalMyDsl.g:1040:3: otherlv_0= 'odrzuc' ( (lv_discard_1_0= ruleDiscard ) )
            {
            otherlv_0=(Token)match(input,24,FOLLOW_16); 

            			newLeafNode(otherlv_0, grammarAccess.getDiceDiscSumAccess().getOdrzucKeyword_0());
            		
            // InternalMyDsl.g:1044:3: ( (lv_discard_1_0= ruleDiscard ) )
            // InternalMyDsl.g:1045:4: (lv_discard_1_0= ruleDiscard )
            {
            // InternalMyDsl.g:1045:4: (lv_discard_1_0= ruleDiscard )
            // InternalMyDsl.g:1046:5: lv_discard_1_0= ruleDiscard
            {

            					newCompositeNode(grammarAccess.getDiceDiscSumAccess().getDiscardDiscardParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_2);
            lv_discard_1_0=ruleDiscard();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getDiceDiscSumRule());
            					}
            					set(
            						current,
            						"discard",
            						lv_discard_1_0,
            						"org.xtext.example.mydsl.MyDsl.Discard");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDiceDiscSum"


    // $ANTLR start "entryRuleDiceRerollSum"
    // InternalMyDsl.g:1067:1: entryRuleDiceRerollSum returns [EObject current=null] : iv_ruleDiceRerollSum= ruleDiceRerollSum EOF ;
    public final EObject entryRuleDiceRerollSum() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDiceRerollSum = null;


        try {
            // InternalMyDsl.g:1067:54: (iv_ruleDiceRerollSum= ruleDiceRerollSum EOF )
            // InternalMyDsl.g:1068:2: iv_ruleDiceRerollSum= ruleDiceRerollSum EOF
            {
             newCompositeNode(grammarAccess.getDiceRerollSumRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDiceRerollSum=ruleDiceRerollSum();

            state._fsp--;

             current =iv_ruleDiceRerollSum; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDiceRerollSum"


    // $ANTLR start "ruleDiceRerollSum"
    // InternalMyDsl.g:1074:1: ruleDiceRerollSum returns [EObject current=null] : (otherlv_0= 'przerzuc' ( (lv_reroll_1_0= ruleReroll ) ) ) ;
    public final EObject ruleDiceRerollSum() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_reroll_1_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:1080:2: ( (otherlv_0= 'przerzuc' ( (lv_reroll_1_0= ruleReroll ) ) ) )
            // InternalMyDsl.g:1081:2: (otherlv_0= 'przerzuc' ( (lv_reroll_1_0= ruleReroll ) ) )
            {
            // InternalMyDsl.g:1081:2: (otherlv_0= 'przerzuc' ( (lv_reroll_1_0= ruleReroll ) ) )
            // InternalMyDsl.g:1082:3: otherlv_0= 'przerzuc' ( (lv_reroll_1_0= ruleReroll ) )
            {
            otherlv_0=(Token)match(input,25,FOLLOW_16); 

            			newLeafNode(otherlv_0, grammarAccess.getDiceRerollSumAccess().getPrzerzucKeyword_0());
            		
            // InternalMyDsl.g:1086:3: ( (lv_reroll_1_0= ruleReroll ) )
            // InternalMyDsl.g:1087:4: (lv_reroll_1_0= ruleReroll )
            {
            // InternalMyDsl.g:1087:4: (lv_reroll_1_0= ruleReroll )
            // InternalMyDsl.g:1088:5: lv_reroll_1_0= ruleReroll
            {

            					newCompositeNode(grammarAccess.getDiceRerollSumAccess().getRerollRerollParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_2);
            lv_reroll_1_0=ruleReroll();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getDiceRerollSumRule());
            					}
            					set(
            						current,
            						"reroll",
            						lv_reroll_1_0,
            						"org.xtext.example.mydsl.MyDsl.Reroll");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDiceRerollSum"


    // $ANTLR start "entryRuleRuleSuk"
    // InternalMyDsl.g:1109:1: entryRuleRuleSuk returns [EObject current=null] : iv_ruleRuleSuk= ruleRuleSuk EOF ;
    public final EObject entryRuleRuleSuk() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRuleSuk = null;


        try {
            // InternalMyDsl.g:1109:48: (iv_ruleRuleSuk= ruleRuleSuk EOF )
            // InternalMyDsl.g:1110:2: iv_ruleRuleSuk= ruleRuleSuk EOF
            {
             newCompositeNode(grammarAccess.getRuleSukRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRuleSuk=ruleRuleSuk();

            state._fsp--;

             current =iv_ruleRuleSuk; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleRuleSuk"


    // $ANTLR start "ruleRuleSuk"
    // InternalMyDsl.g:1116:1: ruleRuleSuk returns [EObject current=null] : ( (otherlv_0= 'sukces' (this_SuccessThreshold_1= ruleSuccessThreshold | this_SuccessMultiplier_2= ruleSuccessMultiplier | this_SuccessBasic_3= ruleSuccessBasic ) ) | this_DiceMarkSuk_4= ruleDiceMarkSuk | this_DiceDiscSuk_5= ruleDiceDiscSuk | this_DiceRerollSuk_6= ruleDiceRerollSuk ) ;
    public final EObject ruleRuleSuk() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject this_SuccessThreshold_1 = null;

        EObject this_SuccessMultiplier_2 = null;

        EObject this_SuccessBasic_3 = null;

        EObject this_DiceMarkSuk_4 = null;

        EObject this_DiceDiscSuk_5 = null;

        EObject this_DiceRerollSuk_6 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:1122:2: ( ( (otherlv_0= 'sukces' (this_SuccessThreshold_1= ruleSuccessThreshold | this_SuccessMultiplier_2= ruleSuccessMultiplier | this_SuccessBasic_3= ruleSuccessBasic ) ) | this_DiceMarkSuk_4= ruleDiceMarkSuk | this_DiceDiscSuk_5= ruleDiceDiscSuk | this_DiceRerollSuk_6= ruleDiceRerollSuk ) )
            // InternalMyDsl.g:1123:2: ( (otherlv_0= 'sukces' (this_SuccessThreshold_1= ruleSuccessThreshold | this_SuccessMultiplier_2= ruleSuccessMultiplier | this_SuccessBasic_3= ruleSuccessBasic ) ) | this_DiceMarkSuk_4= ruleDiceMarkSuk | this_DiceDiscSuk_5= ruleDiceDiscSuk | this_DiceRerollSuk_6= ruleDiceRerollSuk )
            {
            // InternalMyDsl.g:1123:2: ( (otherlv_0= 'sukces' (this_SuccessThreshold_1= ruleSuccessThreshold | this_SuccessMultiplier_2= ruleSuccessMultiplier | this_SuccessBasic_3= ruleSuccessBasic ) ) | this_DiceMarkSuk_4= ruleDiceMarkSuk | this_DiceDiscSuk_5= ruleDiceDiscSuk | this_DiceRerollSuk_6= ruleDiceRerollSuk )
            int alt23=4;
            switch ( input.LA(1) ) {
            case 26:
                {
                alt23=1;
                }
                break;
            case 23:
                {
                alt23=2;
                }
                break;
            case 24:
                {
                alt23=3;
                }
                break;
            case 25:
                {
                alt23=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 23, 0, input);

                throw nvae;
            }

            switch (alt23) {
                case 1 :
                    // InternalMyDsl.g:1124:3: (otherlv_0= 'sukces' (this_SuccessThreshold_1= ruleSuccessThreshold | this_SuccessMultiplier_2= ruleSuccessMultiplier | this_SuccessBasic_3= ruleSuccessBasic ) )
                    {
                    // InternalMyDsl.g:1124:3: (otherlv_0= 'sukces' (this_SuccessThreshold_1= ruleSuccessThreshold | this_SuccessMultiplier_2= ruleSuccessMultiplier | this_SuccessBasic_3= ruleSuccessBasic ) )
                    // InternalMyDsl.g:1125:4: otherlv_0= 'sukces' (this_SuccessThreshold_1= ruleSuccessThreshold | this_SuccessMultiplier_2= ruleSuccessMultiplier | this_SuccessBasic_3= ruleSuccessBasic )
                    {
                    otherlv_0=(Token)match(input,26,FOLLOW_16); 

                    				newLeafNode(otherlv_0, grammarAccess.getRuleSukAccess().getSukcesKeyword_0_0());
                    			
                    // InternalMyDsl.g:1129:4: (this_SuccessThreshold_1= ruleSuccessThreshold | this_SuccessMultiplier_2= ruleSuccessMultiplier | this_SuccessBasic_3= ruleSuccessBasic )
                    int alt22=3;
                    switch ( input.LA(1) ) {
                    case 36:
                    case 37:
                    case 38:
                    case 39:
                        {
                        alt22=1;
                        }
                        break;
                    case 27:
                        {
                        int LA22_2 = input.LA(2);

                        if ( (LA22_2==RULE_INT) ) {
                            int LA22_3 = input.LA(3);

                            if ( (LA22_3==19) ) {
                                alt22=2;
                            }
                            else if ( (LA22_3==EOF||(LA22_3>=13 && LA22_3<=16)) ) {
                                alt22=3;
                            }
                            else {
                                NoViableAltException nvae =
                                    new NoViableAltException("", 22, 3, input);

                                throw nvae;
                            }
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 22, 2, input);

                            throw nvae;
                        }
                        }
                        break;
                    case RULE_INT:
                        {
                        int LA22_3 = input.LA(2);

                        if ( (LA22_3==19) ) {
                            alt22=2;
                        }
                        else if ( (LA22_3==EOF||(LA22_3>=13 && LA22_3<=16)) ) {
                            alt22=3;
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 22, 3, input);

                            throw nvae;
                        }
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 22, 0, input);

                        throw nvae;
                    }

                    switch (alt22) {
                        case 1 :
                            // InternalMyDsl.g:1130:5: this_SuccessThreshold_1= ruleSuccessThreshold
                            {

                            					newCompositeNode(grammarAccess.getRuleSukAccess().getSuccessThresholdParserRuleCall_0_1_0());
                            				
                            pushFollow(FOLLOW_2);
                            this_SuccessThreshold_1=ruleSuccessThreshold();

                            state._fsp--;


                            					current = this_SuccessThreshold_1;
                            					afterParserOrEnumRuleCall();
                            				

                            }
                            break;
                        case 2 :
                            // InternalMyDsl.g:1139:5: this_SuccessMultiplier_2= ruleSuccessMultiplier
                            {

                            					newCompositeNode(grammarAccess.getRuleSukAccess().getSuccessMultiplierParserRuleCall_0_1_1());
                            				
                            pushFollow(FOLLOW_2);
                            this_SuccessMultiplier_2=ruleSuccessMultiplier();

                            state._fsp--;


                            					current = this_SuccessMultiplier_2;
                            					afterParserOrEnumRuleCall();
                            				

                            }
                            break;
                        case 3 :
                            // InternalMyDsl.g:1148:5: this_SuccessBasic_3= ruleSuccessBasic
                            {

                            					newCompositeNode(grammarAccess.getRuleSukAccess().getSuccessBasicParserRuleCall_0_1_2());
                            				
                            pushFollow(FOLLOW_2);
                            this_SuccessBasic_3=ruleSuccessBasic();

                            state._fsp--;


                            					current = this_SuccessBasic_3;
                            					afterParserOrEnumRuleCall();
                            				

                            }
                            break;

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:1159:3: this_DiceMarkSuk_4= ruleDiceMarkSuk
                    {

                    			newCompositeNode(grammarAccess.getRuleSukAccess().getDiceMarkSukParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_DiceMarkSuk_4=ruleDiceMarkSuk();

                    state._fsp--;


                    			current = this_DiceMarkSuk_4;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:1168:3: this_DiceDiscSuk_5= ruleDiceDiscSuk
                    {

                    			newCompositeNode(grammarAccess.getRuleSukAccess().getDiceDiscSukParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_DiceDiscSuk_5=ruleDiceDiscSuk();

                    state._fsp--;


                    			current = this_DiceDiscSuk_5;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalMyDsl.g:1177:3: this_DiceRerollSuk_6= ruleDiceRerollSuk
                    {

                    			newCompositeNode(grammarAccess.getRuleSukAccess().getDiceRerollSukParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_DiceRerollSuk_6=ruleDiceRerollSuk();

                    state._fsp--;


                    			current = this_DiceRerollSuk_6;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleRuleSuk"


    // $ANTLR start "entryRuleSuccessThreshold"
    // InternalMyDsl.g:1189:1: entryRuleSuccessThreshold returns [EObject current=null] : iv_ruleSuccessThreshold= ruleSuccessThreshold EOF ;
    public final EObject entryRuleSuccessThreshold() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSuccessThreshold = null;


        try {
            // InternalMyDsl.g:1189:57: (iv_ruleSuccessThreshold= ruleSuccessThreshold EOF )
            // InternalMyDsl.g:1190:2: iv_ruleSuccessThreshold= ruleSuccessThreshold EOF
            {
             newCompositeNode(grammarAccess.getSuccessThresholdRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSuccessThreshold=ruleSuccessThreshold();

            state._fsp--;

             current =iv_ruleSuccessThreshold; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSuccessThreshold"


    // $ANTLR start "ruleSuccessThreshold"
    // InternalMyDsl.g:1196:1: ruleSuccessThreshold returns [EObject current=null] : ( ( (lv_hightlow_0_0= ruleHighLow ) ) ( (lv_num_1_0= ruleNum ) ) ) ;
    public final EObject ruleSuccessThreshold() throws RecognitionException {
        EObject current = null;

        Enumerator lv_hightlow_0_0 = null;

        EObject lv_num_1_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:1202:2: ( ( ( (lv_hightlow_0_0= ruleHighLow ) ) ( (lv_num_1_0= ruleNum ) ) ) )
            // InternalMyDsl.g:1203:2: ( ( (lv_hightlow_0_0= ruleHighLow ) ) ( (lv_num_1_0= ruleNum ) ) )
            {
            // InternalMyDsl.g:1203:2: ( ( (lv_hightlow_0_0= ruleHighLow ) ) ( (lv_num_1_0= ruleNum ) ) )
            // InternalMyDsl.g:1204:3: ( (lv_hightlow_0_0= ruleHighLow ) ) ( (lv_num_1_0= ruleNum ) )
            {
            // InternalMyDsl.g:1204:3: ( (lv_hightlow_0_0= ruleHighLow ) )
            // InternalMyDsl.g:1205:4: (lv_hightlow_0_0= ruleHighLow )
            {
            // InternalMyDsl.g:1205:4: (lv_hightlow_0_0= ruleHighLow )
            // InternalMyDsl.g:1206:5: lv_hightlow_0_0= ruleHighLow
            {

            					newCompositeNode(grammarAccess.getSuccessThresholdAccess().getHightlowHighLowEnumRuleCall_0_0());
            				
            pushFollow(FOLLOW_11);
            lv_hightlow_0_0=ruleHighLow();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getSuccessThresholdRule());
            					}
            					set(
            						current,
            						"hightlow",
            						lv_hightlow_0_0,
            						"org.xtext.example.mydsl.MyDsl.HighLow");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalMyDsl.g:1223:3: ( (lv_num_1_0= ruleNum ) )
            // InternalMyDsl.g:1224:4: (lv_num_1_0= ruleNum )
            {
            // InternalMyDsl.g:1224:4: (lv_num_1_0= ruleNum )
            // InternalMyDsl.g:1225:5: lv_num_1_0= ruleNum
            {

            					newCompositeNode(grammarAccess.getSuccessThresholdAccess().getNumNumParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_2);
            lv_num_1_0=ruleNum();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getSuccessThresholdRule());
            					}
            					set(
            						current,
            						"num",
            						lv_num_1_0,
            						"org.xtext.example.mydsl.MyDsl.Num");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSuccessThreshold"


    // $ANTLR start "entryRuleSuccessMultiplier"
    // InternalMyDsl.g:1246:1: entryRuleSuccessMultiplier returns [EObject current=null] : iv_ruleSuccessMultiplier= ruleSuccessMultiplier EOF ;
    public final EObject entryRuleSuccessMultiplier() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSuccessMultiplier = null;


        try {
            // InternalMyDsl.g:1246:58: (iv_ruleSuccessMultiplier= ruleSuccessMultiplier EOF )
            // InternalMyDsl.g:1247:2: iv_ruleSuccessMultiplier= ruleSuccessMultiplier EOF
            {
             newCompositeNode(grammarAccess.getSuccessMultiplierRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSuccessMultiplier=ruleSuccessMultiplier();

            state._fsp--;

             current =iv_ruleSuccessMultiplier; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSuccessMultiplier"


    // $ANTLR start "ruleSuccessMultiplier"
    // InternalMyDsl.g:1253:1: ruleSuccessMultiplier returns [EObject current=null] : ( ( (lv_num_0_0= ruleNum ) ) otherlv_1= 'razy' ( (lv_sign_2_0= ruleSign ) )? ( (lv_mult_3_0= ruleNum ) ) ) ;
    public final EObject ruleSuccessMultiplier() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_num_0_0 = null;

        Enumerator lv_sign_2_0 = null;

        EObject lv_mult_3_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:1259:2: ( ( ( (lv_num_0_0= ruleNum ) ) otherlv_1= 'razy' ( (lv_sign_2_0= ruleSign ) )? ( (lv_mult_3_0= ruleNum ) ) ) )
            // InternalMyDsl.g:1260:2: ( ( (lv_num_0_0= ruleNum ) ) otherlv_1= 'razy' ( (lv_sign_2_0= ruleSign ) )? ( (lv_mult_3_0= ruleNum ) ) )
            {
            // InternalMyDsl.g:1260:2: ( ( (lv_num_0_0= ruleNum ) ) otherlv_1= 'razy' ( (lv_sign_2_0= ruleSign ) )? ( (lv_mult_3_0= ruleNum ) ) )
            // InternalMyDsl.g:1261:3: ( (lv_num_0_0= ruleNum ) ) otherlv_1= 'razy' ( (lv_sign_2_0= ruleSign ) )? ( (lv_mult_3_0= ruleNum ) )
            {
            // InternalMyDsl.g:1261:3: ( (lv_num_0_0= ruleNum ) )
            // InternalMyDsl.g:1262:4: (lv_num_0_0= ruleNum )
            {
            // InternalMyDsl.g:1262:4: (lv_num_0_0= ruleNum )
            // InternalMyDsl.g:1263:5: lv_num_0_0= ruleNum
            {

            					newCompositeNode(grammarAccess.getSuccessMultiplierAccess().getNumNumParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_17);
            lv_num_0_0=ruleNum();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getSuccessMultiplierRule());
            					}
            					set(
            						current,
            						"num",
            						lv_num_0_0,
            						"org.xtext.example.mydsl.MyDsl.Num");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_1=(Token)match(input,19,FOLLOW_18); 

            			newLeafNode(otherlv_1, grammarAccess.getSuccessMultiplierAccess().getRazyKeyword_1());
            		
            // InternalMyDsl.g:1284:3: ( (lv_sign_2_0= ruleSign ) )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( ((LA24_0>=28 && LA24_0<=31)) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // InternalMyDsl.g:1285:4: (lv_sign_2_0= ruleSign )
                    {
                    // InternalMyDsl.g:1285:4: (lv_sign_2_0= ruleSign )
                    // InternalMyDsl.g:1286:5: lv_sign_2_0= ruleSign
                    {

                    					newCompositeNode(grammarAccess.getSuccessMultiplierAccess().getSignSignEnumRuleCall_2_0());
                    				
                    pushFollow(FOLLOW_11);
                    lv_sign_2_0=ruleSign();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getSuccessMultiplierRule());
                    					}
                    					set(
                    						current,
                    						"sign",
                    						lv_sign_2_0,
                    						"org.xtext.example.mydsl.MyDsl.Sign");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            // InternalMyDsl.g:1303:3: ( (lv_mult_3_0= ruleNum ) )
            // InternalMyDsl.g:1304:4: (lv_mult_3_0= ruleNum )
            {
            // InternalMyDsl.g:1304:4: (lv_mult_3_0= ruleNum )
            // InternalMyDsl.g:1305:5: lv_mult_3_0= ruleNum
            {

            					newCompositeNode(grammarAccess.getSuccessMultiplierAccess().getMultNumParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_2);
            lv_mult_3_0=ruleNum();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getSuccessMultiplierRule());
            					}
            					set(
            						current,
            						"mult",
            						lv_mult_3_0,
            						"org.xtext.example.mydsl.MyDsl.Num");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSuccessMultiplier"


    // $ANTLR start "entryRuleSuccessBasic"
    // InternalMyDsl.g:1326:1: entryRuleSuccessBasic returns [EObject current=null] : iv_ruleSuccessBasic= ruleSuccessBasic EOF ;
    public final EObject entryRuleSuccessBasic() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSuccessBasic = null;


        try {
            // InternalMyDsl.g:1326:53: (iv_ruleSuccessBasic= ruleSuccessBasic EOF )
            // InternalMyDsl.g:1327:2: iv_ruleSuccessBasic= ruleSuccessBasic EOF
            {
             newCompositeNode(grammarAccess.getSuccessBasicRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSuccessBasic=ruleSuccessBasic();

            state._fsp--;

             current =iv_ruleSuccessBasic; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSuccessBasic"


    // $ANTLR start "ruleSuccessBasic"
    // InternalMyDsl.g:1333:1: ruleSuccessBasic returns [EObject current=null] : ( (lv_num_0_0= ruleNum ) ) ;
    public final EObject ruleSuccessBasic() throws RecognitionException {
        EObject current = null;

        EObject lv_num_0_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:1339:2: ( ( (lv_num_0_0= ruleNum ) ) )
            // InternalMyDsl.g:1340:2: ( (lv_num_0_0= ruleNum ) )
            {
            // InternalMyDsl.g:1340:2: ( (lv_num_0_0= ruleNum ) )
            // InternalMyDsl.g:1341:3: (lv_num_0_0= ruleNum )
            {
            // InternalMyDsl.g:1341:3: (lv_num_0_0= ruleNum )
            // InternalMyDsl.g:1342:4: lv_num_0_0= ruleNum
            {

            				newCompositeNode(grammarAccess.getSuccessBasicAccess().getNumNumParserRuleCall_0());
            			
            pushFollow(FOLLOW_2);
            lv_num_0_0=ruleNum();

            state._fsp--;


            				if (current==null) {
            					current = createModelElementForParent(grammarAccess.getSuccessBasicRule());
            				}
            				set(
            					current,
            					"num",
            					lv_num_0_0,
            					"org.xtext.example.mydsl.MyDsl.Num");
            				afterParserOrEnumRuleCall();
            			

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSuccessBasic"


    // $ANTLR start "entryRuleDiceMarkSuk"
    // InternalMyDsl.g:1362:1: entryRuleDiceMarkSuk returns [EObject current=null] : iv_ruleDiceMarkSuk= ruleDiceMarkSuk EOF ;
    public final EObject entryRuleDiceMarkSuk() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDiceMarkSuk = null;


        try {
            // InternalMyDsl.g:1362:52: (iv_ruleDiceMarkSuk= ruleDiceMarkSuk EOF )
            // InternalMyDsl.g:1363:2: iv_ruleDiceMarkSuk= ruleDiceMarkSuk EOF
            {
             newCompositeNode(grammarAccess.getDiceMarkSukRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDiceMarkSuk=ruleDiceMarkSuk();

            state._fsp--;

             current =iv_ruleDiceMarkSuk; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDiceMarkSuk"


    // $ANTLR start "ruleDiceMarkSuk"
    // InternalMyDsl.g:1369:1: ruleDiceMarkSuk returns [EObject current=null] : (otherlv_0= 'oznacz' ( (lv_mark_1_0= ruleMark ) ) ) ;
    public final EObject ruleDiceMarkSuk() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_mark_1_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:1375:2: ( (otherlv_0= 'oznacz' ( (lv_mark_1_0= ruleMark ) ) ) )
            // InternalMyDsl.g:1376:2: (otherlv_0= 'oznacz' ( (lv_mark_1_0= ruleMark ) ) )
            {
            // InternalMyDsl.g:1376:2: (otherlv_0= 'oznacz' ( (lv_mark_1_0= ruleMark ) ) )
            // InternalMyDsl.g:1377:3: otherlv_0= 'oznacz' ( (lv_mark_1_0= ruleMark ) )
            {
            otherlv_0=(Token)match(input,23,FOLLOW_16); 

            			newLeafNode(otherlv_0, grammarAccess.getDiceMarkSukAccess().getOznaczKeyword_0());
            		
            // InternalMyDsl.g:1381:3: ( (lv_mark_1_0= ruleMark ) )
            // InternalMyDsl.g:1382:4: (lv_mark_1_0= ruleMark )
            {
            // InternalMyDsl.g:1382:4: (lv_mark_1_0= ruleMark )
            // InternalMyDsl.g:1383:5: lv_mark_1_0= ruleMark
            {

            					newCompositeNode(grammarAccess.getDiceMarkSukAccess().getMarkMarkParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_2);
            lv_mark_1_0=ruleMark();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getDiceMarkSukRule());
            					}
            					set(
            						current,
            						"mark",
            						lv_mark_1_0,
            						"org.xtext.example.mydsl.MyDsl.Mark");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDiceMarkSuk"


    // $ANTLR start "entryRuleDiceDiscSuk"
    // InternalMyDsl.g:1404:1: entryRuleDiceDiscSuk returns [EObject current=null] : iv_ruleDiceDiscSuk= ruleDiceDiscSuk EOF ;
    public final EObject entryRuleDiceDiscSuk() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDiceDiscSuk = null;


        try {
            // InternalMyDsl.g:1404:52: (iv_ruleDiceDiscSuk= ruleDiceDiscSuk EOF )
            // InternalMyDsl.g:1405:2: iv_ruleDiceDiscSuk= ruleDiceDiscSuk EOF
            {
             newCompositeNode(grammarAccess.getDiceDiscSukRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDiceDiscSuk=ruleDiceDiscSuk();

            state._fsp--;

             current =iv_ruleDiceDiscSuk; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDiceDiscSuk"


    // $ANTLR start "ruleDiceDiscSuk"
    // InternalMyDsl.g:1411:1: ruleDiceDiscSuk returns [EObject current=null] : (otherlv_0= 'odrzuc' ( (lv_discard_1_0= ruleDiscard ) ) ) ;
    public final EObject ruleDiceDiscSuk() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_discard_1_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:1417:2: ( (otherlv_0= 'odrzuc' ( (lv_discard_1_0= ruleDiscard ) ) ) )
            // InternalMyDsl.g:1418:2: (otherlv_0= 'odrzuc' ( (lv_discard_1_0= ruleDiscard ) ) )
            {
            // InternalMyDsl.g:1418:2: (otherlv_0= 'odrzuc' ( (lv_discard_1_0= ruleDiscard ) ) )
            // InternalMyDsl.g:1419:3: otherlv_0= 'odrzuc' ( (lv_discard_1_0= ruleDiscard ) )
            {
            otherlv_0=(Token)match(input,24,FOLLOW_16); 

            			newLeafNode(otherlv_0, grammarAccess.getDiceDiscSukAccess().getOdrzucKeyword_0());
            		
            // InternalMyDsl.g:1423:3: ( (lv_discard_1_0= ruleDiscard ) )
            // InternalMyDsl.g:1424:4: (lv_discard_1_0= ruleDiscard )
            {
            // InternalMyDsl.g:1424:4: (lv_discard_1_0= ruleDiscard )
            // InternalMyDsl.g:1425:5: lv_discard_1_0= ruleDiscard
            {

            					newCompositeNode(grammarAccess.getDiceDiscSukAccess().getDiscardDiscardParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_2);
            lv_discard_1_0=ruleDiscard();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getDiceDiscSukRule());
            					}
            					set(
            						current,
            						"discard",
            						lv_discard_1_0,
            						"org.xtext.example.mydsl.MyDsl.Discard");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDiceDiscSuk"


    // $ANTLR start "entryRuleDiceRerollSuk"
    // InternalMyDsl.g:1446:1: entryRuleDiceRerollSuk returns [EObject current=null] : iv_ruleDiceRerollSuk= ruleDiceRerollSuk EOF ;
    public final EObject entryRuleDiceRerollSuk() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDiceRerollSuk = null;


        try {
            // InternalMyDsl.g:1446:54: (iv_ruleDiceRerollSuk= ruleDiceRerollSuk EOF )
            // InternalMyDsl.g:1447:2: iv_ruleDiceRerollSuk= ruleDiceRerollSuk EOF
            {
             newCompositeNode(grammarAccess.getDiceRerollSukRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDiceRerollSuk=ruleDiceRerollSuk();

            state._fsp--;

             current =iv_ruleDiceRerollSuk; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDiceRerollSuk"


    // $ANTLR start "ruleDiceRerollSuk"
    // InternalMyDsl.g:1453:1: ruleDiceRerollSuk returns [EObject current=null] : (otherlv_0= 'przerzuc' ( (lv_reroll_1_0= ruleReroll ) ) ) ;
    public final EObject ruleDiceRerollSuk() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_reroll_1_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:1459:2: ( (otherlv_0= 'przerzuc' ( (lv_reroll_1_0= ruleReroll ) ) ) )
            // InternalMyDsl.g:1460:2: (otherlv_0= 'przerzuc' ( (lv_reroll_1_0= ruleReroll ) ) )
            {
            // InternalMyDsl.g:1460:2: (otherlv_0= 'przerzuc' ( (lv_reroll_1_0= ruleReroll ) ) )
            // InternalMyDsl.g:1461:3: otherlv_0= 'przerzuc' ( (lv_reroll_1_0= ruleReroll ) )
            {
            otherlv_0=(Token)match(input,25,FOLLOW_16); 

            			newLeafNode(otherlv_0, grammarAccess.getDiceRerollSukAccess().getPrzerzucKeyword_0());
            		
            // InternalMyDsl.g:1465:3: ( (lv_reroll_1_0= ruleReroll ) )
            // InternalMyDsl.g:1466:4: (lv_reroll_1_0= ruleReroll )
            {
            // InternalMyDsl.g:1466:4: (lv_reroll_1_0= ruleReroll )
            // InternalMyDsl.g:1467:5: lv_reroll_1_0= ruleReroll
            {

            					newCompositeNode(grammarAccess.getDiceRerollSukAccess().getRerollRerollParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_2);
            lv_reroll_1_0=ruleReroll();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getDiceRerollSukRule());
            					}
            					set(
            						current,
            						"reroll",
            						lv_reroll_1_0,
            						"org.xtext.example.mydsl.MyDsl.Reroll");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDiceRerollSuk"


    // $ANTLR start "entryRuleMark"
    // InternalMyDsl.g:1488:1: entryRuleMark returns [EObject current=null] : iv_ruleMark= ruleMark EOF ;
    public final EObject entryRuleMark() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMark = null;


        try {
            // InternalMyDsl.g:1488:45: (iv_ruleMark= ruleMark EOF )
            // InternalMyDsl.g:1489:2: iv_ruleMark= ruleMark EOF
            {
             newCompositeNode(grammarAccess.getMarkRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMark=ruleMark();

            state._fsp--;

             current =iv_ruleMark; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleMark"


    // $ANTLR start "ruleMark"
    // InternalMyDsl.g:1495:1: ruleMark returns [EObject current=null] : (this_MarkThreshold_0= ruleMarkThreshold | this_MarkHighest_1= ruleMarkHighest | this_MarkPosition_2= ruleMarkPosition | this_MarkValue_3= ruleMarkValue ) ;
    public final EObject ruleMark() throws RecognitionException {
        EObject current = null;

        EObject this_MarkThreshold_0 = null;

        EObject this_MarkHighest_1 = null;

        EObject this_MarkPosition_2 = null;

        EObject this_MarkValue_3 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:1501:2: ( (this_MarkThreshold_0= ruleMarkThreshold | this_MarkHighest_1= ruleMarkHighest | this_MarkPosition_2= ruleMarkPosition | this_MarkValue_3= ruleMarkValue ) )
            // InternalMyDsl.g:1502:2: (this_MarkThreshold_0= ruleMarkThreshold | this_MarkHighest_1= ruleMarkHighest | this_MarkPosition_2= ruleMarkPosition | this_MarkValue_3= ruleMarkValue )
            {
            // InternalMyDsl.g:1502:2: (this_MarkThreshold_0= ruleMarkThreshold | this_MarkHighest_1= ruleMarkHighest | this_MarkPosition_2= ruleMarkPosition | this_MarkValue_3= ruleMarkValue )
            int alt25=4;
            alt25 = dfa25.predict(input);
            switch (alt25) {
                case 1 :
                    // InternalMyDsl.g:1503:3: this_MarkThreshold_0= ruleMarkThreshold
                    {

                    			newCompositeNode(grammarAccess.getMarkAccess().getMarkThresholdParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_MarkThreshold_0=ruleMarkThreshold();

                    state._fsp--;


                    			current = this_MarkThreshold_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:1512:3: this_MarkHighest_1= ruleMarkHighest
                    {

                    			newCompositeNode(grammarAccess.getMarkAccess().getMarkHighestParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_MarkHighest_1=ruleMarkHighest();

                    state._fsp--;


                    			current = this_MarkHighest_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:1521:3: this_MarkPosition_2= ruleMarkPosition
                    {

                    			newCompositeNode(grammarAccess.getMarkAccess().getMarkPositionParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_MarkPosition_2=ruleMarkPosition();

                    state._fsp--;


                    			current = this_MarkPosition_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalMyDsl.g:1530:3: this_MarkValue_3= ruleMarkValue
                    {

                    			newCompositeNode(grammarAccess.getMarkAccess().getMarkValueParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_MarkValue_3=ruleMarkValue();

                    state._fsp--;


                    			current = this_MarkValue_3;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMark"


    // $ANTLR start "entryRuleMarkThreshold"
    // InternalMyDsl.g:1542:1: entryRuleMarkThreshold returns [EObject current=null] : iv_ruleMarkThreshold= ruleMarkThreshold EOF ;
    public final EObject entryRuleMarkThreshold() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMarkThreshold = null;


        try {
            // InternalMyDsl.g:1542:54: (iv_ruleMarkThreshold= ruleMarkThreshold EOF )
            // InternalMyDsl.g:1543:2: iv_ruleMarkThreshold= ruleMarkThreshold EOF
            {
             newCompositeNode(grammarAccess.getMarkThresholdRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMarkThreshold=ruleMarkThreshold();

            state._fsp--;

             current =iv_ruleMarkThreshold; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleMarkThreshold"


    // $ANTLR start "ruleMarkThreshold"
    // InternalMyDsl.g:1549:1: ruleMarkThreshold returns [EObject current=null] : ( ( (lv_hightlow_0_0= ruleHighLow ) ) ( (lv_num_1_0= ruleNum ) ) ) ;
    public final EObject ruleMarkThreshold() throws RecognitionException {
        EObject current = null;

        Enumerator lv_hightlow_0_0 = null;

        EObject lv_num_1_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:1555:2: ( ( ( (lv_hightlow_0_0= ruleHighLow ) ) ( (lv_num_1_0= ruleNum ) ) ) )
            // InternalMyDsl.g:1556:2: ( ( (lv_hightlow_0_0= ruleHighLow ) ) ( (lv_num_1_0= ruleNum ) ) )
            {
            // InternalMyDsl.g:1556:2: ( ( (lv_hightlow_0_0= ruleHighLow ) ) ( (lv_num_1_0= ruleNum ) ) )
            // InternalMyDsl.g:1557:3: ( (lv_hightlow_0_0= ruleHighLow ) ) ( (lv_num_1_0= ruleNum ) )
            {
            // InternalMyDsl.g:1557:3: ( (lv_hightlow_0_0= ruleHighLow ) )
            // InternalMyDsl.g:1558:4: (lv_hightlow_0_0= ruleHighLow )
            {
            // InternalMyDsl.g:1558:4: (lv_hightlow_0_0= ruleHighLow )
            // InternalMyDsl.g:1559:5: lv_hightlow_0_0= ruleHighLow
            {

            					newCompositeNode(grammarAccess.getMarkThresholdAccess().getHightlowHighLowEnumRuleCall_0_0());
            				
            pushFollow(FOLLOW_11);
            lv_hightlow_0_0=ruleHighLow();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getMarkThresholdRule());
            					}
            					set(
            						current,
            						"hightlow",
            						lv_hightlow_0_0,
            						"org.xtext.example.mydsl.MyDsl.HighLow");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalMyDsl.g:1576:3: ( (lv_num_1_0= ruleNum ) )
            // InternalMyDsl.g:1577:4: (lv_num_1_0= ruleNum )
            {
            // InternalMyDsl.g:1577:4: (lv_num_1_0= ruleNum )
            // InternalMyDsl.g:1578:5: lv_num_1_0= ruleNum
            {

            					newCompositeNode(grammarAccess.getMarkThresholdAccess().getNumNumParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_2);
            lv_num_1_0=ruleNum();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getMarkThresholdRule());
            					}
            					set(
            						current,
            						"num",
            						lv_num_1_0,
            						"org.xtext.example.mydsl.MyDsl.Num");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMarkThreshold"


    // $ANTLR start "entryRuleMarkHighest"
    // InternalMyDsl.g:1599:1: entryRuleMarkHighest returns [EObject current=null] : iv_ruleMarkHighest= ruleMarkHighest EOF ;
    public final EObject entryRuleMarkHighest() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMarkHighest = null;


        try {
            // InternalMyDsl.g:1599:52: (iv_ruleMarkHighest= ruleMarkHighest EOF )
            // InternalMyDsl.g:1600:2: iv_ruleMarkHighest= ruleMarkHighest EOF
            {
             newCompositeNode(grammarAccess.getMarkHighestRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMarkHighest=ruleMarkHighest();

            state._fsp--;

             current =iv_ruleMarkHighest; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleMarkHighest"


    // $ANTLR start "ruleMarkHighest"
    // InternalMyDsl.g:1606:1: ruleMarkHighest returns [EObject current=null] : ( (lv_hightlow_0_0= ruleHighLow ) ) ;
    public final EObject ruleMarkHighest() throws RecognitionException {
        EObject current = null;

        Enumerator lv_hightlow_0_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:1612:2: ( ( (lv_hightlow_0_0= ruleHighLow ) ) )
            // InternalMyDsl.g:1613:2: ( (lv_hightlow_0_0= ruleHighLow ) )
            {
            // InternalMyDsl.g:1613:2: ( (lv_hightlow_0_0= ruleHighLow ) )
            // InternalMyDsl.g:1614:3: (lv_hightlow_0_0= ruleHighLow )
            {
            // InternalMyDsl.g:1614:3: (lv_hightlow_0_0= ruleHighLow )
            // InternalMyDsl.g:1615:4: lv_hightlow_0_0= ruleHighLow
            {

            				newCompositeNode(grammarAccess.getMarkHighestAccess().getHightlowHighLowEnumRuleCall_0());
            			
            pushFollow(FOLLOW_2);
            lv_hightlow_0_0=ruleHighLow();

            state._fsp--;


            				if (current==null) {
            					current = createModelElementForParent(grammarAccess.getMarkHighestRule());
            				}
            				set(
            					current,
            					"hightlow",
            					lv_hightlow_0_0,
            					"org.xtext.example.mydsl.MyDsl.HighLow");
            				afterParserOrEnumRuleCall();
            			

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMarkHighest"


    // $ANTLR start "entryRuleMarkPosition"
    // InternalMyDsl.g:1635:1: entryRuleMarkPosition returns [EObject current=null] : iv_ruleMarkPosition= ruleMarkPosition EOF ;
    public final EObject entryRuleMarkPosition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMarkPosition = null;


        try {
            // InternalMyDsl.g:1635:53: (iv_ruleMarkPosition= ruleMarkPosition EOF )
            // InternalMyDsl.g:1636:2: iv_ruleMarkPosition= ruleMarkPosition EOF
            {
             newCompositeNode(grammarAccess.getMarkPositionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMarkPosition=ruleMarkPosition();

            state._fsp--;

             current =iv_ruleMarkPosition; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleMarkPosition"


    // $ANTLR start "ruleMarkPosition"
    // InternalMyDsl.g:1642:1: ruleMarkPosition returns [EObject current=null] : ( ( (lv_num_0_0= ruleNum ) ) ( (lv_firstlast_1_0= ruleFirstLast ) ) ) ;
    public final EObject ruleMarkPosition() throws RecognitionException {
        EObject current = null;

        EObject lv_num_0_0 = null;

        Enumerator lv_firstlast_1_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:1648:2: ( ( ( (lv_num_0_0= ruleNum ) ) ( (lv_firstlast_1_0= ruleFirstLast ) ) ) )
            // InternalMyDsl.g:1649:2: ( ( (lv_num_0_0= ruleNum ) ) ( (lv_firstlast_1_0= ruleFirstLast ) ) )
            {
            // InternalMyDsl.g:1649:2: ( ( (lv_num_0_0= ruleNum ) ) ( (lv_firstlast_1_0= ruleFirstLast ) ) )
            // InternalMyDsl.g:1650:3: ( (lv_num_0_0= ruleNum ) ) ( (lv_firstlast_1_0= ruleFirstLast ) )
            {
            // InternalMyDsl.g:1650:3: ( (lv_num_0_0= ruleNum ) )
            // InternalMyDsl.g:1651:4: (lv_num_0_0= ruleNum )
            {
            // InternalMyDsl.g:1651:4: (lv_num_0_0= ruleNum )
            // InternalMyDsl.g:1652:5: lv_num_0_0= ruleNum
            {

            					newCompositeNode(grammarAccess.getMarkPositionAccess().getNumNumParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_19);
            lv_num_0_0=ruleNum();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getMarkPositionRule());
            					}
            					set(
            						current,
            						"num",
            						lv_num_0_0,
            						"org.xtext.example.mydsl.MyDsl.Num");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalMyDsl.g:1669:3: ( (lv_firstlast_1_0= ruleFirstLast ) )
            // InternalMyDsl.g:1670:4: (lv_firstlast_1_0= ruleFirstLast )
            {
            // InternalMyDsl.g:1670:4: (lv_firstlast_1_0= ruleFirstLast )
            // InternalMyDsl.g:1671:5: lv_firstlast_1_0= ruleFirstLast
            {

            					newCompositeNode(grammarAccess.getMarkPositionAccess().getFirstlastFirstLastEnumRuleCall_1_0());
            				
            pushFollow(FOLLOW_2);
            lv_firstlast_1_0=ruleFirstLast();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getMarkPositionRule());
            					}
            					set(
            						current,
            						"firstlast",
            						lv_firstlast_1_0,
            						"org.xtext.example.mydsl.MyDsl.FirstLast");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMarkPosition"


    // $ANTLR start "entryRuleMarkValue"
    // InternalMyDsl.g:1692:1: entryRuleMarkValue returns [EObject current=null] : iv_ruleMarkValue= ruleMarkValue EOF ;
    public final EObject entryRuleMarkValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMarkValue = null;


        try {
            // InternalMyDsl.g:1692:50: (iv_ruleMarkValue= ruleMarkValue EOF )
            // InternalMyDsl.g:1693:2: iv_ruleMarkValue= ruleMarkValue EOF
            {
             newCompositeNode(grammarAccess.getMarkValueRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMarkValue=ruleMarkValue();

            state._fsp--;

             current =iv_ruleMarkValue; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleMarkValue"


    // $ANTLR start "ruleMarkValue"
    // InternalMyDsl.g:1699:1: ruleMarkValue returns [EObject current=null] : ( (lv_num_0_0= ruleNum ) ) ;
    public final EObject ruleMarkValue() throws RecognitionException {
        EObject current = null;

        EObject lv_num_0_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:1705:2: ( ( (lv_num_0_0= ruleNum ) ) )
            // InternalMyDsl.g:1706:2: ( (lv_num_0_0= ruleNum ) )
            {
            // InternalMyDsl.g:1706:2: ( (lv_num_0_0= ruleNum ) )
            // InternalMyDsl.g:1707:3: (lv_num_0_0= ruleNum )
            {
            // InternalMyDsl.g:1707:3: (lv_num_0_0= ruleNum )
            // InternalMyDsl.g:1708:4: lv_num_0_0= ruleNum
            {

            				newCompositeNode(grammarAccess.getMarkValueAccess().getNumNumParserRuleCall_0());
            			
            pushFollow(FOLLOW_2);
            lv_num_0_0=ruleNum();

            state._fsp--;


            				if (current==null) {
            					current = createModelElementForParent(grammarAccess.getMarkValueRule());
            				}
            				set(
            					current,
            					"num",
            					lv_num_0_0,
            					"org.xtext.example.mydsl.MyDsl.Num");
            				afterParserOrEnumRuleCall();
            			

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMarkValue"


    // $ANTLR start "entryRuleDiscard"
    // InternalMyDsl.g:1728:1: entryRuleDiscard returns [EObject current=null] : iv_ruleDiscard= ruleDiscard EOF ;
    public final EObject entryRuleDiscard() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDiscard = null;


        try {
            // InternalMyDsl.g:1728:48: (iv_ruleDiscard= ruleDiscard EOF )
            // InternalMyDsl.g:1729:2: iv_ruleDiscard= ruleDiscard EOF
            {
             newCompositeNode(grammarAccess.getDiscardRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDiscard=ruleDiscard();

            state._fsp--;

             current =iv_ruleDiscard; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDiscard"


    // $ANTLR start "ruleDiscard"
    // InternalMyDsl.g:1735:1: ruleDiscard returns [EObject current=null] : (this_DiscardThreshold_0= ruleDiscardThreshold | this_DiscardHighest_1= ruleDiscardHighest | this_DiscardPosition_2= ruleDiscardPosition | this_DiscardValue_3= ruleDiscardValue ) ;
    public final EObject ruleDiscard() throws RecognitionException {
        EObject current = null;

        EObject this_DiscardThreshold_0 = null;

        EObject this_DiscardHighest_1 = null;

        EObject this_DiscardPosition_2 = null;

        EObject this_DiscardValue_3 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:1741:2: ( (this_DiscardThreshold_0= ruleDiscardThreshold | this_DiscardHighest_1= ruleDiscardHighest | this_DiscardPosition_2= ruleDiscardPosition | this_DiscardValue_3= ruleDiscardValue ) )
            // InternalMyDsl.g:1742:2: (this_DiscardThreshold_0= ruleDiscardThreshold | this_DiscardHighest_1= ruleDiscardHighest | this_DiscardPosition_2= ruleDiscardPosition | this_DiscardValue_3= ruleDiscardValue )
            {
            // InternalMyDsl.g:1742:2: (this_DiscardThreshold_0= ruleDiscardThreshold | this_DiscardHighest_1= ruleDiscardHighest | this_DiscardPosition_2= ruleDiscardPosition | this_DiscardValue_3= ruleDiscardValue )
            int alt26=4;
            alt26 = dfa26.predict(input);
            switch (alt26) {
                case 1 :
                    // InternalMyDsl.g:1743:3: this_DiscardThreshold_0= ruleDiscardThreshold
                    {

                    			newCompositeNode(grammarAccess.getDiscardAccess().getDiscardThresholdParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_DiscardThreshold_0=ruleDiscardThreshold();

                    state._fsp--;


                    			current = this_DiscardThreshold_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:1752:3: this_DiscardHighest_1= ruleDiscardHighest
                    {

                    			newCompositeNode(grammarAccess.getDiscardAccess().getDiscardHighestParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_DiscardHighest_1=ruleDiscardHighest();

                    state._fsp--;


                    			current = this_DiscardHighest_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:1761:3: this_DiscardPosition_2= ruleDiscardPosition
                    {

                    			newCompositeNode(grammarAccess.getDiscardAccess().getDiscardPositionParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_DiscardPosition_2=ruleDiscardPosition();

                    state._fsp--;


                    			current = this_DiscardPosition_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalMyDsl.g:1770:3: this_DiscardValue_3= ruleDiscardValue
                    {

                    			newCompositeNode(grammarAccess.getDiscardAccess().getDiscardValueParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_DiscardValue_3=ruleDiscardValue();

                    state._fsp--;


                    			current = this_DiscardValue_3;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDiscard"


    // $ANTLR start "entryRuleDiscardThreshold"
    // InternalMyDsl.g:1782:1: entryRuleDiscardThreshold returns [EObject current=null] : iv_ruleDiscardThreshold= ruleDiscardThreshold EOF ;
    public final EObject entryRuleDiscardThreshold() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDiscardThreshold = null;


        try {
            // InternalMyDsl.g:1782:57: (iv_ruleDiscardThreshold= ruleDiscardThreshold EOF )
            // InternalMyDsl.g:1783:2: iv_ruleDiscardThreshold= ruleDiscardThreshold EOF
            {
             newCompositeNode(grammarAccess.getDiscardThresholdRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDiscardThreshold=ruleDiscardThreshold();

            state._fsp--;

             current =iv_ruleDiscardThreshold; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDiscardThreshold"


    // $ANTLR start "ruleDiscardThreshold"
    // InternalMyDsl.g:1789:1: ruleDiscardThreshold returns [EObject current=null] : ( ( (lv_hightlow_0_0= ruleHighLow ) ) ( (lv_num_1_0= ruleNum ) ) ) ;
    public final EObject ruleDiscardThreshold() throws RecognitionException {
        EObject current = null;

        Enumerator lv_hightlow_0_0 = null;

        EObject lv_num_1_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:1795:2: ( ( ( (lv_hightlow_0_0= ruleHighLow ) ) ( (lv_num_1_0= ruleNum ) ) ) )
            // InternalMyDsl.g:1796:2: ( ( (lv_hightlow_0_0= ruleHighLow ) ) ( (lv_num_1_0= ruleNum ) ) )
            {
            // InternalMyDsl.g:1796:2: ( ( (lv_hightlow_0_0= ruleHighLow ) ) ( (lv_num_1_0= ruleNum ) ) )
            // InternalMyDsl.g:1797:3: ( (lv_hightlow_0_0= ruleHighLow ) ) ( (lv_num_1_0= ruleNum ) )
            {
            // InternalMyDsl.g:1797:3: ( (lv_hightlow_0_0= ruleHighLow ) )
            // InternalMyDsl.g:1798:4: (lv_hightlow_0_0= ruleHighLow )
            {
            // InternalMyDsl.g:1798:4: (lv_hightlow_0_0= ruleHighLow )
            // InternalMyDsl.g:1799:5: lv_hightlow_0_0= ruleHighLow
            {

            					newCompositeNode(grammarAccess.getDiscardThresholdAccess().getHightlowHighLowEnumRuleCall_0_0());
            				
            pushFollow(FOLLOW_11);
            lv_hightlow_0_0=ruleHighLow();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getDiscardThresholdRule());
            					}
            					set(
            						current,
            						"hightlow",
            						lv_hightlow_0_0,
            						"org.xtext.example.mydsl.MyDsl.HighLow");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalMyDsl.g:1816:3: ( (lv_num_1_0= ruleNum ) )
            // InternalMyDsl.g:1817:4: (lv_num_1_0= ruleNum )
            {
            // InternalMyDsl.g:1817:4: (lv_num_1_0= ruleNum )
            // InternalMyDsl.g:1818:5: lv_num_1_0= ruleNum
            {

            					newCompositeNode(grammarAccess.getDiscardThresholdAccess().getNumNumParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_2);
            lv_num_1_0=ruleNum();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getDiscardThresholdRule());
            					}
            					set(
            						current,
            						"num",
            						lv_num_1_0,
            						"org.xtext.example.mydsl.MyDsl.Num");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDiscardThreshold"


    // $ANTLR start "entryRuleDiscardHighest"
    // InternalMyDsl.g:1839:1: entryRuleDiscardHighest returns [EObject current=null] : iv_ruleDiscardHighest= ruleDiscardHighest EOF ;
    public final EObject entryRuleDiscardHighest() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDiscardHighest = null;


        try {
            // InternalMyDsl.g:1839:55: (iv_ruleDiscardHighest= ruleDiscardHighest EOF )
            // InternalMyDsl.g:1840:2: iv_ruleDiscardHighest= ruleDiscardHighest EOF
            {
             newCompositeNode(grammarAccess.getDiscardHighestRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDiscardHighest=ruleDiscardHighest();

            state._fsp--;

             current =iv_ruleDiscardHighest; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDiscardHighest"


    // $ANTLR start "ruleDiscardHighest"
    // InternalMyDsl.g:1846:1: ruleDiscardHighest returns [EObject current=null] : ( (lv_hightlow_0_0= ruleHighLow ) ) ;
    public final EObject ruleDiscardHighest() throws RecognitionException {
        EObject current = null;

        Enumerator lv_hightlow_0_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:1852:2: ( ( (lv_hightlow_0_0= ruleHighLow ) ) )
            // InternalMyDsl.g:1853:2: ( (lv_hightlow_0_0= ruleHighLow ) )
            {
            // InternalMyDsl.g:1853:2: ( (lv_hightlow_0_0= ruleHighLow ) )
            // InternalMyDsl.g:1854:3: (lv_hightlow_0_0= ruleHighLow )
            {
            // InternalMyDsl.g:1854:3: (lv_hightlow_0_0= ruleHighLow )
            // InternalMyDsl.g:1855:4: lv_hightlow_0_0= ruleHighLow
            {

            				newCompositeNode(grammarAccess.getDiscardHighestAccess().getHightlowHighLowEnumRuleCall_0());
            			
            pushFollow(FOLLOW_2);
            lv_hightlow_0_0=ruleHighLow();

            state._fsp--;


            				if (current==null) {
            					current = createModelElementForParent(grammarAccess.getDiscardHighestRule());
            				}
            				set(
            					current,
            					"hightlow",
            					lv_hightlow_0_0,
            					"org.xtext.example.mydsl.MyDsl.HighLow");
            				afterParserOrEnumRuleCall();
            			

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDiscardHighest"


    // $ANTLR start "entryRuleDiscardPosition"
    // InternalMyDsl.g:1875:1: entryRuleDiscardPosition returns [EObject current=null] : iv_ruleDiscardPosition= ruleDiscardPosition EOF ;
    public final EObject entryRuleDiscardPosition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDiscardPosition = null;


        try {
            // InternalMyDsl.g:1875:56: (iv_ruleDiscardPosition= ruleDiscardPosition EOF )
            // InternalMyDsl.g:1876:2: iv_ruleDiscardPosition= ruleDiscardPosition EOF
            {
             newCompositeNode(grammarAccess.getDiscardPositionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDiscardPosition=ruleDiscardPosition();

            state._fsp--;

             current =iv_ruleDiscardPosition; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDiscardPosition"


    // $ANTLR start "ruleDiscardPosition"
    // InternalMyDsl.g:1882:1: ruleDiscardPosition returns [EObject current=null] : ( ( (lv_num_0_0= ruleNum ) ) ( (lv_firstlast_1_0= ruleFirstLast ) ) ) ;
    public final EObject ruleDiscardPosition() throws RecognitionException {
        EObject current = null;

        EObject lv_num_0_0 = null;

        Enumerator lv_firstlast_1_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:1888:2: ( ( ( (lv_num_0_0= ruleNum ) ) ( (lv_firstlast_1_0= ruleFirstLast ) ) ) )
            // InternalMyDsl.g:1889:2: ( ( (lv_num_0_0= ruleNum ) ) ( (lv_firstlast_1_0= ruleFirstLast ) ) )
            {
            // InternalMyDsl.g:1889:2: ( ( (lv_num_0_0= ruleNum ) ) ( (lv_firstlast_1_0= ruleFirstLast ) ) )
            // InternalMyDsl.g:1890:3: ( (lv_num_0_0= ruleNum ) ) ( (lv_firstlast_1_0= ruleFirstLast ) )
            {
            // InternalMyDsl.g:1890:3: ( (lv_num_0_0= ruleNum ) )
            // InternalMyDsl.g:1891:4: (lv_num_0_0= ruleNum )
            {
            // InternalMyDsl.g:1891:4: (lv_num_0_0= ruleNum )
            // InternalMyDsl.g:1892:5: lv_num_0_0= ruleNum
            {

            					newCompositeNode(grammarAccess.getDiscardPositionAccess().getNumNumParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_19);
            lv_num_0_0=ruleNum();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getDiscardPositionRule());
            					}
            					set(
            						current,
            						"num",
            						lv_num_0_0,
            						"org.xtext.example.mydsl.MyDsl.Num");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalMyDsl.g:1909:3: ( (lv_firstlast_1_0= ruleFirstLast ) )
            // InternalMyDsl.g:1910:4: (lv_firstlast_1_0= ruleFirstLast )
            {
            // InternalMyDsl.g:1910:4: (lv_firstlast_1_0= ruleFirstLast )
            // InternalMyDsl.g:1911:5: lv_firstlast_1_0= ruleFirstLast
            {

            					newCompositeNode(grammarAccess.getDiscardPositionAccess().getFirstlastFirstLastEnumRuleCall_1_0());
            				
            pushFollow(FOLLOW_2);
            lv_firstlast_1_0=ruleFirstLast();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getDiscardPositionRule());
            					}
            					set(
            						current,
            						"firstlast",
            						lv_firstlast_1_0,
            						"org.xtext.example.mydsl.MyDsl.FirstLast");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDiscardPosition"


    // $ANTLR start "entryRuleDiscardValue"
    // InternalMyDsl.g:1932:1: entryRuleDiscardValue returns [EObject current=null] : iv_ruleDiscardValue= ruleDiscardValue EOF ;
    public final EObject entryRuleDiscardValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDiscardValue = null;


        try {
            // InternalMyDsl.g:1932:53: (iv_ruleDiscardValue= ruleDiscardValue EOF )
            // InternalMyDsl.g:1933:2: iv_ruleDiscardValue= ruleDiscardValue EOF
            {
             newCompositeNode(grammarAccess.getDiscardValueRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDiscardValue=ruleDiscardValue();

            state._fsp--;

             current =iv_ruleDiscardValue; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDiscardValue"


    // $ANTLR start "ruleDiscardValue"
    // InternalMyDsl.g:1939:1: ruleDiscardValue returns [EObject current=null] : ( (lv_num_0_0= ruleNum ) ) ;
    public final EObject ruleDiscardValue() throws RecognitionException {
        EObject current = null;

        EObject lv_num_0_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:1945:2: ( ( (lv_num_0_0= ruleNum ) ) )
            // InternalMyDsl.g:1946:2: ( (lv_num_0_0= ruleNum ) )
            {
            // InternalMyDsl.g:1946:2: ( (lv_num_0_0= ruleNum ) )
            // InternalMyDsl.g:1947:3: (lv_num_0_0= ruleNum )
            {
            // InternalMyDsl.g:1947:3: (lv_num_0_0= ruleNum )
            // InternalMyDsl.g:1948:4: lv_num_0_0= ruleNum
            {

            				newCompositeNode(grammarAccess.getDiscardValueAccess().getNumNumParserRuleCall_0());
            			
            pushFollow(FOLLOW_2);
            lv_num_0_0=ruleNum();

            state._fsp--;


            				if (current==null) {
            					current = createModelElementForParent(grammarAccess.getDiscardValueRule());
            				}
            				set(
            					current,
            					"num",
            					lv_num_0_0,
            					"org.xtext.example.mydsl.MyDsl.Num");
            				afterParserOrEnumRuleCall();
            			

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDiscardValue"


    // $ANTLR start "entryRuleReroll"
    // InternalMyDsl.g:1968:1: entryRuleReroll returns [EObject current=null] : iv_ruleReroll= ruleReroll EOF ;
    public final EObject entryRuleReroll() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleReroll = null;


        try {
            // InternalMyDsl.g:1968:47: (iv_ruleReroll= ruleReroll EOF )
            // InternalMyDsl.g:1969:2: iv_ruleReroll= ruleReroll EOF
            {
             newCompositeNode(grammarAccess.getRerollRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleReroll=ruleReroll();

            state._fsp--;

             current =iv_ruleReroll; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleReroll"


    // $ANTLR start "ruleReroll"
    // InternalMyDsl.g:1975:1: ruleReroll returns [EObject current=null] : (this_RerollThreshold_0= ruleRerollThreshold | this_RerollHighest_1= ruleRerollHighest | this_RerollPosition_2= ruleRerollPosition | this_RerollValue_3= ruleRerollValue ) ;
    public final EObject ruleReroll() throws RecognitionException {
        EObject current = null;

        EObject this_RerollThreshold_0 = null;

        EObject this_RerollHighest_1 = null;

        EObject this_RerollPosition_2 = null;

        EObject this_RerollValue_3 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:1981:2: ( (this_RerollThreshold_0= ruleRerollThreshold | this_RerollHighest_1= ruleRerollHighest | this_RerollPosition_2= ruleRerollPosition | this_RerollValue_3= ruleRerollValue ) )
            // InternalMyDsl.g:1982:2: (this_RerollThreshold_0= ruleRerollThreshold | this_RerollHighest_1= ruleRerollHighest | this_RerollPosition_2= ruleRerollPosition | this_RerollValue_3= ruleRerollValue )
            {
            // InternalMyDsl.g:1982:2: (this_RerollThreshold_0= ruleRerollThreshold | this_RerollHighest_1= ruleRerollHighest | this_RerollPosition_2= ruleRerollPosition | this_RerollValue_3= ruleRerollValue )
            int alt27=4;
            alt27 = dfa27.predict(input);
            switch (alt27) {
                case 1 :
                    // InternalMyDsl.g:1983:3: this_RerollThreshold_0= ruleRerollThreshold
                    {

                    			newCompositeNode(grammarAccess.getRerollAccess().getRerollThresholdParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_RerollThreshold_0=ruleRerollThreshold();

                    state._fsp--;


                    			current = this_RerollThreshold_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:1992:3: this_RerollHighest_1= ruleRerollHighest
                    {

                    			newCompositeNode(grammarAccess.getRerollAccess().getRerollHighestParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_RerollHighest_1=ruleRerollHighest();

                    state._fsp--;


                    			current = this_RerollHighest_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:2001:3: this_RerollPosition_2= ruleRerollPosition
                    {

                    			newCompositeNode(grammarAccess.getRerollAccess().getRerollPositionParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_RerollPosition_2=ruleRerollPosition();

                    state._fsp--;


                    			current = this_RerollPosition_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalMyDsl.g:2010:3: this_RerollValue_3= ruleRerollValue
                    {

                    			newCompositeNode(grammarAccess.getRerollAccess().getRerollValueParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_RerollValue_3=ruleRerollValue();

                    state._fsp--;


                    			current = this_RerollValue_3;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleReroll"


    // $ANTLR start "entryRuleRerollThreshold"
    // InternalMyDsl.g:2022:1: entryRuleRerollThreshold returns [EObject current=null] : iv_ruleRerollThreshold= ruleRerollThreshold EOF ;
    public final EObject entryRuleRerollThreshold() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRerollThreshold = null;


        try {
            // InternalMyDsl.g:2022:56: (iv_ruleRerollThreshold= ruleRerollThreshold EOF )
            // InternalMyDsl.g:2023:2: iv_ruleRerollThreshold= ruleRerollThreshold EOF
            {
             newCompositeNode(grammarAccess.getRerollThresholdRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRerollThreshold=ruleRerollThreshold();

            state._fsp--;

             current =iv_ruleRerollThreshold; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleRerollThreshold"


    // $ANTLR start "ruleRerollThreshold"
    // InternalMyDsl.g:2029:1: ruleRerollThreshold returns [EObject current=null] : ( ( (lv_hightlow_0_0= ruleHighLow ) ) ( (lv_num_1_0= ruleNum ) ) ) ;
    public final EObject ruleRerollThreshold() throws RecognitionException {
        EObject current = null;

        Enumerator lv_hightlow_0_0 = null;

        EObject lv_num_1_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:2035:2: ( ( ( (lv_hightlow_0_0= ruleHighLow ) ) ( (lv_num_1_0= ruleNum ) ) ) )
            // InternalMyDsl.g:2036:2: ( ( (lv_hightlow_0_0= ruleHighLow ) ) ( (lv_num_1_0= ruleNum ) ) )
            {
            // InternalMyDsl.g:2036:2: ( ( (lv_hightlow_0_0= ruleHighLow ) ) ( (lv_num_1_0= ruleNum ) ) )
            // InternalMyDsl.g:2037:3: ( (lv_hightlow_0_0= ruleHighLow ) ) ( (lv_num_1_0= ruleNum ) )
            {
            // InternalMyDsl.g:2037:3: ( (lv_hightlow_0_0= ruleHighLow ) )
            // InternalMyDsl.g:2038:4: (lv_hightlow_0_0= ruleHighLow )
            {
            // InternalMyDsl.g:2038:4: (lv_hightlow_0_0= ruleHighLow )
            // InternalMyDsl.g:2039:5: lv_hightlow_0_0= ruleHighLow
            {

            					newCompositeNode(grammarAccess.getRerollThresholdAccess().getHightlowHighLowEnumRuleCall_0_0());
            				
            pushFollow(FOLLOW_11);
            lv_hightlow_0_0=ruleHighLow();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getRerollThresholdRule());
            					}
            					set(
            						current,
            						"hightlow",
            						lv_hightlow_0_0,
            						"org.xtext.example.mydsl.MyDsl.HighLow");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalMyDsl.g:2056:3: ( (lv_num_1_0= ruleNum ) )
            // InternalMyDsl.g:2057:4: (lv_num_1_0= ruleNum )
            {
            // InternalMyDsl.g:2057:4: (lv_num_1_0= ruleNum )
            // InternalMyDsl.g:2058:5: lv_num_1_0= ruleNum
            {

            					newCompositeNode(grammarAccess.getRerollThresholdAccess().getNumNumParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_2);
            lv_num_1_0=ruleNum();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getRerollThresholdRule());
            					}
            					set(
            						current,
            						"num",
            						lv_num_1_0,
            						"org.xtext.example.mydsl.MyDsl.Num");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleRerollThreshold"


    // $ANTLR start "entryRuleRerollHighest"
    // InternalMyDsl.g:2079:1: entryRuleRerollHighest returns [EObject current=null] : iv_ruleRerollHighest= ruleRerollHighest EOF ;
    public final EObject entryRuleRerollHighest() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRerollHighest = null;


        try {
            // InternalMyDsl.g:2079:54: (iv_ruleRerollHighest= ruleRerollHighest EOF )
            // InternalMyDsl.g:2080:2: iv_ruleRerollHighest= ruleRerollHighest EOF
            {
             newCompositeNode(grammarAccess.getRerollHighestRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRerollHighest=ruleRerollHighest();

            state._fsp--;

             current =iv_ruleRerollHighest; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleRerollHighest"


    // $ANTLR start "ruleRerollHighest"
    // InternalMyDsl.g:2086:1: ruleRerollHighest returns [EObject current=null] : ( (lv_hightlow_0_0= ruleHighLow ) ) ;
    public final EObject ruleRerollHighest() throws RecognitionException {
        EObject current = null;

        Enumerator lv_hightlow_0_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:2092:2: ( ( (lv_hightlow_0_0= ruleHighLow ) ) )
            // InternalMyDsl.g:2093:2: ( (lv_hightlow_0_0= ruleHighLow ) )
            {
            // InternalMyDsl.g:2093:2: ( (lv_hightlow_0_0= ruleHighLow ) )
            // InternalMyDsl.g:2094:3: (lv_hightlow_0_0= ruleHighLow )
            {
            // InternalMyDsl.g:2094:3: (lv_hightlow_0_0= ruleHighLow )
            // InternalMyDsl.g:2095:4: lv_hightlow_0_0= ruleHighLow
            {

            				newCompositeNode(grammarAccess.getRerollHighestAccess().getHightlowHighLowEnumRuleCall_0());
            			
            pushFollow(FOLLOW_2);
            lv_hightlow_0_0=ruleHighLow();

            state._fsp--;


            				if (current==null) {
            					current = createModelElementForParent(grammarAccess.getRerollHighestRule());
            				}
            				set(
            					current,
            					"hightlow",
            					lv_hightlow_0_0,
            					"org.xtext.example.mydsl.MyDsl.HighLow");
            				afterParserOrEnumRuleCall();
            			

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleRerollHighest"


    // $ANTLR start "entryRuleRerollPosition"
    // InternalMyDsl.g:2115:1: entryRuleRerollPosition returns [EObject current=null] : iv_ruleRerollPosition= ruleRerollPosition EOF ;
    public final EObject entryRuleRerollPosition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRerollPosition = null;


        try {
            // InternalMyDsl.g:2115:55: (iv_ruleRerollPosition= ruleRerollPosition EOF )
            // InternalMyDsl.g:2116:2: iv_ruleRerollPosition= ruleRerollPosition EOF
            {
             newCompositeNode(grammarAccess.getRerollPositionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRerollPosition=ruleRerollPosition();

            state._fsp--;

             current =iv_ruleRerollPosition; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleRerollPosition"


    // $ANTLR start "ruleRerollPosition"
    // InternalMyDsl.g:2122:1: ruleRerollPosition returns [EObject current=null] : ( ( (lv_num_0_0= ruleNum ) ) ( (lv_firstlast_1_0= ruleFirstLast ) ) ) ;
    public final EObject ruleRerollPosition() throws RecognitionException {
        EObject current = null;

        EObject lv_num_0_0 = null;

        Enumerator lv_firstlast_1_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:2128:2: ( ( ( (lv_num_0_0= ruleNum ) ) ( (lv_firstlast_1_0= ruleFirstLast ) ) ) )
            // InternalMyDsl.g:2129:2: ( ( (lv_num_0_0= ruleNum ) ) ( (lv_firstlast_1_0= ruleFirstLast ) ) )
            {
            // InternalMyDsl.g:2129:2: ( ( (lv_num_0_0= ruleNum ) ) ( (lv_firstlast_1_0= ruleFirstLast ) ) )
            // InternalMyDsl.g:2130:3: ( (lv_num_0_0= ruleNum ) ) ( (lv_firstlast_1_0= ruleFirstLast ) )
            {
            // InternalMyDsl.g:2130:3: ( (lv_num_0_0= ruleNum ) )
            // InternalMyDsl.g:2131:4: (lv_num_0_0= ruleNum )
            {
            // InternalMyDsl.g:2131:4: (lv_num_0_0= ruleNum )
            // InternalMyDsl.g:2132:5: lv_num_0_0= ruleNum
            {

            					newCompositeNode(grammarAccess.getRerollPositionAccess().getNumNumParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_19);
            lv_num_0_0=ruleNum();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getRerollPositionRule());
            					}
            					set(
            						current,
            						"num",
            						lv_num_0_0,
            						"org.xtext.example.mydsl.MyDsl.Num");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalMyDsl.g:2149:3: ( (lv_firstlast_1_0= ruleFirstLast ) )
            // InternalMyDsl.g:2150:4: (lv_firstlast_1_0= ruleFirstLast )
            {
            // InternalMyDsl.g:2150:4: (lv_firstlast_1_0= ruleFirstLast )
            // InternalMyDsl.g:2151:5: lv_firstlast_1_0= ruleFirstLast
            {

            					newCompositeNode(grammarAccess.getRerollPositionAccess().getFirstlastFirstLastEnumRuleCall_1_0());
            				
            pushFollow(FOLLOW_2);
            lv_firstlast_1_0=ruleFirstLast();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getRerollPositionRule());
            					}
            					set(
            						current,
            						"firstlast",
            						lv_firstlast_1_0,
            						"org.xtext.example.mydsl.MyDsl.FirstLast");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleRerollPosition"


    // $ANTLR start "entryRuleRerollValue"
    // InternalMyDsl.g:2172:1: entryRuleRerollValue returns [EObject current=null] : iv_ruleRerollValue= ruleRerollValue EOF ;
    public final EObject entryRuleRerollValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRerollValue = null;


        try {
            // InternalMyDsl.g:2172:52: (iv_ruleRerollValue= ruleRerollValue EOF )
            // InternalMyDsl.g:2173:2: iv_ruleRerollValue= ruleRerollValue EOF
            {
             newCompositeNode(grammarAccess.getRerollValueRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRerollValue=ruleRerollValue();

            state._fsp--;

             current =iv_ruleRerollValue; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleRerollValue"


    // $ANTLR start "ruleRerollValue"
    // InternalMyDsl.g:2179:1: ruleRerollValue returns [EObject current=null] : ( (lv_num_0_0= ruleNum ) ) ;
    public final EObject ruleRerollValue() throws RecognitionException {
        EObject current = null;

        EObject lv_num_0_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:2185:2: ( ( (lv_num_0_0= ruleNum ) ) )
            // InternalMyDsl.g:2186:2: ( (lv_num_0_0= ruleNum ) )
            {
            // InternalMyDsl.g:2186:2: ( (lv_num_0_0= ruleNum ) )
            // InternalMyDsl.g:2187:3: (lv_num_0_0= ruleNum )
            {
            // InternalMyDsl.g:2187:3: (lv_num_0_0= ruleNum )
            // InternalMyDsl.g:2188:4: lv_num_0_0= ruleNum
            {

            				newCompositeNode(grammarAccess.getRerollValueAccess().getNumNumParserRuleCall_0());
            			
            pushFollow(FOLLOW_2);
            lv_num_0_0=ruleNum();

            state._fsp--;


            				if (current==null) {
            					current = createModelElementForParent(grammarAccess.getRerollValueRule());
            				}
            				set(
            					current,
            					"num",
            					lv_num_0_0,
            					"org.xtext.example.mydsl.MyDsl.Num");
            				afterParserOrEnumRuleCall();
            			

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleRerollValue"


    // $ANTLR start "entryRuleNum"
    // InternalMyDsl.g:2208:1: entryRuleNum returns [EObject current=null] : iv_ruleNum= ruleNum EOF ;
    public final EObject entryRuleNum() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNum = null;


        try {
            // InternalMyDsl.g:2208:44: (iv_ruleNum= ruleNum EOF )
            // InternalMyDsl.g:2209:2: iv_ruleNum= ruleNum EOF
            {
             newCompositeNode(grammarAccess.getNumRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleNum=ruleNum();

            state._fsp--;

             current =iv_ruleNum; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleNum"


    // $ANTLR start "ruleNum"
    // InternalMyDsl.g:2215:1: ruleNum returns [EObject current=null] : ( (lv_value_0_0= ruleEInt ) ) ;
    public final EObject ruleNum() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_value_0_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:2221:2: ( ( (lv_value_0_0= ruleEInt ) ) )
            // InternalMyDsl.g:2222:2: ( (lv_value_0_0= ruleEInt ) )
            {
            // InternalMyDsl.g:2222:2: ( (lv_value_0_0= ruleEInt ) )
            // InternalMyDsl.g:2223:3: (lv_value_0_0= ruleEInt )
            {
            // InternalMyDsl.g:2223:3: (lv_value_0_0= ruleEInt )
            // InternalMyDsl.g:2224:4: lv_value_0_0= ruleEInt
            {

            				newCompositeNode(grammarAccess.getNumAccess().getValueEIntParserRuleCall_0());
            			
            pushFollow(FOLLOW_2);
            lv_value_0_0=ruleEInt();

            state._fsp--;


            				if (current==null) {
            					current = createModelElementForParent(grammarAccess.getNumRule());
            				}
            				set(
            					current,
            					"value",
            					lv_value_0_0,
            					"org.xtext.example.mydsl.MyDsl.EInt");
            				afterParserOrEnumRuleCall();
            			

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleNum"


    // $ANTLR start "entryRuleEInt"
    // InternalMyDsl.g:2244:1: entryRuleEInt returns [String current=null] : iv_ruleEInt= ruleEInt EOF ;
    public final String entryRuleEInt() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEInt = null;


        try {
            // InternalMyDsl.g:2244:44: (iv_ruleEInt= ruleEInt EOF )
            // InternalMyDsl.g:2245:2: iv_ruleEInt= ruleEInt EOF
            {
             newCompositeNode(grammarAccess.getEIntRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEInt=ruleEInt();

            state._fsp--;

             current =iv_ruleEInt.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEInt"


    // $ANTLR start "ruleEInt"
    // InternalMyDsl.g:2251:1: ruleEInt returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '-' )? this_INT_1= RULE_INT ) ;
    public final AntlrDatatypeRuleToken ruleEInt() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_INT_1=null;


        	enterRule();

        try {
            // InternalMyDsl.g:2257:2: ( ( (kw= '-' )? this_INT_1= RULE_INT ) )
            // InternalMyDsl.g:2258:2: ( (kw= '-' )? this_INT_1= RULE_INT )
            {
            // InternalMyDsl.g:2258:2: ( (kw= '-' )? this_INT_1= RULE_INT )
            // InternalMyDsl.g:2259:3: (kw= '-' )? this_INT_1= RULE_INT
            {
            // InternalMyDsl.g:2259:3: (kw= '-' )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==27) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // InternalMyDsl.g:2260:4: kw= '-'
                    {
                    kw=(Token)match(input,27,FOLLOW_20); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getEIntAccess().getHyphenMinusKeyword_0());
                    			

                    }
                    break;

            }

            this_INT_1=(Token)match(input,RULE_INT,FOLLOW_2); 

            			current.merge(this_INT_1);
            		

            			newLeafNode(this_INT_1, grammarAccess.getEIntAccess().getINTTerminalRuleCall_1());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEInt"


    // $ANTLR start "ruleSign"
    // InternalMyDsl.g:2277:1: ruleSign returns [Enumerator current=null] : ( (enumLiteral_0= '+' ) | (enumLiteral_1= 'dodawaj' ) | (enumLiteral_2= 'odejmuj' ) | (enumLiteral_3= '- ' ) ) ;
    public final Enumerator ruleSign() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;


        	enterRule();

        try {
            // InternalMyDsl.g:2283:2: ( ( (enumLiteral_0= '+' ) | (enumLiteral_1= 'dodawaj' ) | (enumLiteral_2= 'odejmuj' ) | (enumLiteral_3= '- ' ) ) )
            // InternalMyDsl.g:2284:2: ( (enumLiteral_0= '+' ) | (enumLiteral_1= 'dodawaj' ) | (enumLiteral_2= 'odejmuj' ) | (enumLiteral_3= '- ' ) )
            {
            // InternalMyDsl.g:2284:2: ( (enumLiteral_0= '+' ) | (enumLiteral_1= 'dodawaj' ) | (enumLiteral_2= 'odejmuj' ) | (enumLiteral_3= '- ' ) )
            int alt29=4;
            switch ( input.LA(1) ) {
            case 28:
                {
                alt29=1;
                }
                break;
            case 29:
                {
                alt29=2;
                }
                break;
            case 30:
                {
                alt29=3;
                }
                break;
            case 31:
                {
                alt29=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 29, 0, input);

                throw nvae;
            }

            switch (alt29) {
                case 1 :
                    // InternalMyDsl.g:2285:3: (enumLiteral_0= '+' )
                    {
                    // InternalMyDsl.g:2285:3: (enumLiteral_0= '+' )
                    // InternalMyDsl.g:2286:4: enumLiteral_0= '+'
                    {
                    enumLiteral_0=(Token)match(input,28,FOLLOW_2); 

                    				current = grammarAccess.getSignAccess().getADDEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getSignAccess().getADDEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:2293:3: (enumLiteral_1= 'dodawaj' )
                    {
                    // InternalMyDsl.g:2293:3: (enumLiteral_1= 'dodawaj' )
                    // InternalMyDsl.g:2294:4: enumLiteral_1= 'dodawaj'
                    {
                    enumLiteral_1=(Token)match(input,29,FOLLOW_2); 

                    				current = grammarAccess.getSignAccess().getADDEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getSignAccess().getADDEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:2301:3: (enumLiteral_2= 'odejmuj' )
                    {
                    // InternalMyDsl.g:2301:3: (enumLiteral_2= 'odejmuj' )
                    // InternalMyDsl.g:2302:4: enumLiteral_2= 'odejmuj'
                    {
                    enumLiteral_2=(Token)match(input,30,FOLLOW_2); 

                    				current = grammarAccess.getSignAccess().getSUBEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getSignAccess().getSUBEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalMyDsl.g:2309:3: (enumLiteral_3= '- ' )
                    {
                    // InternalMyDsl.g:2309:3: (enumLiteral_3= '- ' )
                    // InternalMyDsl.g:2310:4: enumLiteral_3= '- '
                    {
                    enumLiteral_3=(Token)match(input,31,FOLLOW_2); 

                    				current = grammarAccess.getSignAccess().getSUBEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getSignAccess().getSUBEnumLiteralDeclaration_3());
                    			

                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSign"


    // $ANTLR start "ruleFirstLast"
    // InternalMyDsl.g:2320:1: ruleFirstLast returns [Enumerator current=null] : ( (enumLiteral_0= 'pierwsze' ) | (enumLiteral_1= 'ostatnie' ) ) ;
    public final Enumerator ruleFirstLast() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;


        	enterRule();

        try {
            // InternalMyDsl.g:2326:2: ( ( (enumLiteral_0= 'pierwsze' ) | (enumLiteral_1= 'ostatnie' ) ) )
            // InternalMyDsl.g:2327:2: ( (enumLiteral_0= 'pierwsze' ) | (enumLiteral_1= 'ostatnie' ) )
            {
            // InternalMyDsl.g:2327:2: ( (enumLiteral_0= 'pierwsze' ) | (enumLiteral_1= 'ostatnie' ) )
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==32) ) {
                alt30=1;
            }
            else if ( (LA30_0==33) ) {
                alt30=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 30, 0, input);

                throw nvae;
            }
            switch (alt30) {
                case 1 :
                    // InternalMyDsl.g:2328:3: (enumLiteral_0= 'pierwsze' )
                    {
                    // InternalMyDsl.g:2328:3: (enumLiteral_0= 'pierwsze' )
                    // InternalMyDsl.g:2329:4: enumLiteral_0= 'pierwsze'
                    {
                    enumLiteral_0=(Token)match(input,32,FOLLOW_2); 

                    				current = grammarAccess.getFirstLastAccess().getFIRSTEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getFirstLastAccess().getFIRSTEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:2336:3: (enumLiteral_1= 'ostatnie' )
                    {
                    // InternalMyDsl.g:2336:3: (enumLiteral_1= 'ostatnie' )
                    // InternalMyDsl.g:2337:4: enumLiteral_1= 'ostatnie'
                    {
                    enumLiteral_1=(Token)match(input,33,FOLLOW_2); 

                    				current = grammarAccess.getFirstLastAccess().getLASTEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getFirstLastAccess().getLASTEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleFirstLast"


    // $ANTLR start "ruleOperator"
    // InternalMyDsl.g:2347:1: ruleOperator returns [Enumerator current=null] : ( (enumLiteral_0= '+' ) | (enumLiteral_1= '- ' ) | (enumLiteral_2= '*' ) | (enumLiteral_3= '/' ) ) ;
    public final Enumerator ruleOperator() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;


        	enterRule();

        try {
            // InternalMyDsl.g:2353:2: ( ( (enumLiteral_0= '+' ) | (enumLiteral_1= '- ' ) | (enumLiteral_2= '*' ) | (enumLiteral_3= '/' ) ) )
            // InternalMyDsl.g:2354:2: ( (enumLiteral_0= '+' ) | (enumLiteral_1= '- ' ) | (enumLiteral_2= '*' ) | (enumLiteral_3= '/' ) )
            {
            // InternalMyDsl.g:2354:2: ( (enumLiteral_0= '+' ) | (enumLiteral_1= '- ' ) | (enumLiteral_2= '*' ) | (enumLiteral_3= '/' ) )
            int alt31=4;
            switch ( input.LA(1) ) {
            case 28:
                {
                alt31=1;
                }
                break;
            case 31:
                {
                alt31=2;
                }
                break;
            case 34:
                {
                alt31=3;
                }
                break;
            case 35:
                {
                alt31=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 31, 0, input);

                throw nvae;
            }

            switch (alt31) {
                case 1 :
                    // InternalMyDsl.g:2355:3: (enumLiteral_0= '+' )
                    {
                    // InternalMyDsl.g:2355:3: (enumLiteral_0= '+' )
                    // InternalMyDsl.g:2356:4: enumLiteral_0= '+'
                    {
                    enumLiteral_0=(Token)match(input,28,FOLLOW_2); 

                    				current = grammarAccess.getOperatorAccess().getADDEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getOperatorAccess().getADDEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:2363:3: (enumLiteral_1= '- ' )
                    {
                    // InternalMyDsl.g:2363:3: (enumLiteral_1= '- ' )
                    // InternalMyDsl.g:2364:4: enumLiteral_1= '- '
                    {
                    enumLiteral_1=(Token)match(input,31,FOLLOW_2); 

                    				current = grammarAccess.getOperatorAccess().getSUBEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getOperatorAccess().getSUBEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:2371:3: (enumLiteral_2= '*' )
                    {
                    // InternalMyDsl.g:2371:3: (enumLiteral_2= '*' )
                    // InternalMyDsl.g:2372:4: enumLiteral_2= '*'
                    {
                    enumLiteral_2=(Token)match(input,34,FOLLOW_2); 

                    				current = grammarAccess.getOperatorAccess().getMULEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getOperatorAccess().getMULEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalMyDsl.g:2379:3: (enumLiteral_3= '/' )
                    {
                    // InternalMyDsl.g:2379:3: (enumLiteral_3= '/' )
                    // InternalMyDsl.g:2380:4: enumLiteral_3= '/'
                    {
                    enumLiteral_3=(Token)match(input,35,FOLLOW_2); 

                    				current = grammarAccess.getOperatorAccess().getDIVEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getOperatorAccess().getDIVEnumLiteralDeclaration_3());
                    			

                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleOperator"


    // $ANTLR start "ruleHighLow"
    // InternalMyDsl.g:2390:1: ruleHighLow returns [Enumerator current=null] : ( (enumLiteral_0= 'najwyzsze' ) | (enumLiteral_1= 'najnizsze' ) | (enumLiteral_2= 'wiecej niz' ) | (enumLiteral_3= 'mniej niz' ) ) ;
    public final Enumerator ruleHighLow() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;


        	enterRule();

        try {
            // InternalMyDsl.g:2396:2: ( ( (enumLiteral_0= 'najwyzsze' ) | (enumLiteral_1= 'najnizsze' ) | (enumLiteral_2= 'wiecej niz' ) | (enumLiteral_3= 'mniej niz' ) ) )
            // InternalMyDsl.g:2397:2: ( (enumLiteral_0= 'najwyzsze' ) | (enumLiteral_1= 'najnizsze' ) | (enumLiteral_2= 'wiecej niz' ) | (enumLiteral_3= 'mniej niz' ) )
            {
            // InternalMyDsl.g:2397:2: ( (enumLiteral_0= 'najwyzsze' ) | (enumLiteral_1= 'najnizsze' ) | (enumLiteral_2= 'wiecej niz' ) | (enumLiteral_3= 'mniej niz' ) )
            int alt32=4;
            switch ( input.LA(1) ) {
            case 36:
                {
                alt32=1;
                }
                break;
            case 37:
                {
                alt32=2;
                }
                break;
            case 38:
                {
                alt32=3;
                }
                break;
            case 39:
                {
                alt32=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 32, 0, input);

                throw nvae;
            }

            switch (alt32) {
                case 1 :
                    // InternalMyDsl.g:2398:3: (enumLiteral_0= 'najwyzsze' )
                    {
                    // InternalMyDsl.g:2398:3: (enumLiteral_0= 'najwyzsze' )
                    // InternalMyDsl.g:2399:4: enumLiteral_0= 'najwyzsze'
                    {
                    enumLiteral_0=(Token)match(input,36,FOLLOW_2); 

                    				current = grammarAccess.getHighLowAccess().getHIGHEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getHighLowAccess().getHIGHEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:2406:3: (enumLiteral_1= 'najnizsze' )
                    {
                    // InternalMyDsl.g:2406:3: (enumLiteral_1= 'najnizsze' )
                    // InternalMyDsl.g:2407:4: enumLiteral_1= 'najnizsze'
                    {
                    enumLiteral_1=(Token)match(input,37,FOLLOW_2); 

                    				current = grammarAccess.getHighLowAccess().getLOWEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getHighLowAccess().getLOWEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:2414:3: (enumLiteral_2= 'wiecej niz' )
                    {
                    // InternalMyDsl.g:2414:3: (enumLiteral_2= 'wiecej niz' )
                    // InternalMyDsl.g:2415:4: enumLiteral_2= 'wiecej niz'
                    {
                    enumLiteral_2=(Token)match(input,38,FOLLOW_2); 

                    				current = grammarAccess.getHighLowAccess().getHIGHEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getHighLowAccess().getHIGHEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalMyDsl.g:2422:3: (enumLiteral_3= 'mniej niz' )
                    {
                    // InternalMyDsl.g:2422:3: (enumLiteral_3= 'mniej niz' )
                    // InternalMyDsl.g:2423:4: enumLiteral_3= 'mniej niz'
                    {
                    enumLiteral_3=(Token)match(input,39,FOLLOW_2); 

                    				current = grammarAccess.getHighLowAccess().getLOWEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getHighLowAccess().getLOWEnumLiteralDeclaration_3());
                    			

                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleHighLow"

    // Delegated rules


    protected DFA25 dfa25 = new DFA25(this);
    protected DFA26 dfa26 = new DFA26(this);
    protected DFA27 dfa27 = new DFA27(this);
    static final String dfa_1s = "\13\uffff";
    static final String dfa_2s = "\1\uffff\4\10\1\uffff\1\12\4\uffff";
    static final String dfa_3s = "\6\5\1\15\4\uffff";
    static final String dfa_4s = "\1\47\4\33\1\5\1\41\4\uffff";
    static final String dfa_5s = "\7\uffff\1\1\1\2\1\3\1\4";
    static final String dfa_6s = "\13\uffff}>";
    static final String[] dfa_7s = {
            "\1\6\25\uffff\1\5\10\uffff\1\1\1\2\1\3\1\4",
            "\1\7\7\uffff\4\10\12\uffff\1\7",
            "\1\7\7\uffff\4\10\12\uffff\1\7",
            "\1\7\7\uffff\4\10\12\uffff\1\7",
            "\1\7\7\uffff\4\10\12\uffff\1\7",
            "\1\6",
            "\4\12\17\uffff\2\11",
            "",
            "",
            "",
            ""
    };

    static final short[] dfa_1 = DFA.unpackEncodedString(dfa_1s);
    static final short[] dfa_2 = DFA.unpackEncodedString(dfa_2s);
    static final char[] dfa_3 = DFA.unpackEncodedStringToUnsignedChars(dfa_3s);
    static final char[] dfa_4 = DFA.unpackEncodedStringToUnsignedChars(dfa_4s);
    static final short[] dfa_5 = DFA.unpackEncodedString(dfa_5s);
    static final short[] dfa_6 = DFA.unpackEncodedString(dfa_6s);
    static final short[][] dfa_7 = unpackEncodedStringArray(dfa_7s);

    class DFA25 extends DFA {

        public DFA25(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 25;
            this.eot = dfa_1;
            this.eof = dfa_2;
            this.min = dfa_3;
            this.max = dfa_4;
            this.accept = dfa_5;
            this.special = dfa_6;
            this.transition = dfa_7;
        }
        public String getDescription() {
            return "1502:2: (this_MarkThreshold_0= ruleMarkThreshold | this_MarkHighest_1= ruleMarkHighest | this_MarkPosition_2= ruleMarkPosition | this_MarkValue_3= ruleMarkValue )";
        }
    }
    static final String dfa_8s = "\1\uffff\4\10\1\uffff\1\11\4\uffff";
    static final String dfa_9s = "\7\uffff\1\1\1\2\1\4\1\3";
    static final String[] dfa_10s = {
            "\1\6\25\uffff\1\5\10\uffff\1\1\1\2\1\3\1\4",
            "\1\7\7\uffff\4\10\12\uffff\1\7",
            "\1\7\7\uffff\4\10\12\uffff\1\7",
            "\1\7\7\uffff\4\10\12\uffff\1\7",
            "\1\7\7\uffff\4\10\12\uffff\1\7",
            "\1\6",
            "\4\11\17\uffff\2\12",
            "",
            "",
            "",
            ""
    };
    static final short[] dfa_8 = DFA.unpackEncodedString(dfa_8s);
    static final short[] dfa_9 = DFA.unpackEncodedString(dfa_9s);
    static final short[][] dfa_10 = unpackEncodedStringArray(dfa_10s);

    class DFA26 extends DFA {

        public DFA26(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 26;
            this.eot = dfa_1;
            this.eof = dfa_8;
            this.min = dfa_3;
            this.max = dfa_4;
            this.accept = dfa_9;
            this.special = dfa_6;
            this.transition = dfa_10;
        }
        public String getDescription() {
            return "1742:2: (this_DiscardThreshold_0= ruleDiscardThreshold | this_DiscardHighest_1= ruleDiscardHighest | this_DiscardPosition_2= ruleDiscardPosition | this_DiscardValue_3= ruleDiscardValue )";
        }
    }
    static final String dfa_11s = "\1\uffff\4\7\1\uffff\1\12\4\uffff";
    static final String dfa_12s = "\7\uffff\1\2\1\1\1\3\1\4";
    static final String[] dfa_13s = {
            "\1\6\25\uffff\1\5\10\uffff\1\1\1\2\1\3\1\4",
            "\1\10\7\uffff\4\7\12\uffff\1\10",
            "\1\10\7\uffff\4\7\12\uffff\1\10",
            "\1\10\7\uffff\4\7\12\uffff\1\10",
            "\1\10\7\uffff\4\7\12\uffff\1\10",
            "\1\6",
            "\4\12\17\uffff\2\11",
            "",
            "",
            "",
            ""
    };
    static final short[] dfa_11 = DFA.unpackEncodedString(dfa_11s);
    static final short[] dfa_12 = DFA.unpackEncodedString(dfa_12s);
    static final short[][] dfa_13 = unpackEncodedStringArray(dfa_13s);

    class DFA27 extends DFA {

        public DFA27(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 27;
            this.eot = dfa_1;
            this.eof = dfa_11;
            this.min = dfa_3;
            this.max = dfa_4;
            this.accept = dfa_12;
            this.special = dfa_6;
            this.transition = dfa_13;
        }
        public String getDescription() {
            return "1982:2: (this_RerollThreshold_0= ruleRerollThreshold | this_RerollHighest_1= ruleRerollHighest | this_RerollPosition_2= ruleRerollPosition | this_RerollValue_3= ruleRerollValue )";
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x00000000F8102030L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x000000000001E002L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000018002L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000040002L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x00000000F3800000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000010002L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000007800000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000008000030L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000C90000002L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x000000F008000030L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x00000000F8000030L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000300000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000000000020L});

}