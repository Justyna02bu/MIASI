package org.xtext.example.mydsl.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_INT", "RULE_ID", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'SUMUJ'", "';'", "'.'", "','", "'SUKCESY'", "'+'", "'-'", "':'", "'('", "')'", "'razy'", "'d'", "'dodawaj'", "'odejmuj'", "'wybuchowe'", "'oznacz'", "'odrzuc'", "'przerzuc'", "'sukces'", "'wiecej niz'", "'mniej niz'", "'najwyzsze'", "'najnizsze'", "'Num'", "'{'", "'value'", "'}'", "'FIRST'", "'LAST'", "'*'", "'/'"
    };
    public static final int RULE_STRING=6;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__37=37;
    public static final int T__16=16;
    public static final int T__38=38;
    public static final int T__17=17;
    public static final int T__39=39;
    public static final int T__18=18;
    public static final int T__11=11;
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
    public static final int RULE_ID=5;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=4;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__20=20;
    public static final int T__21=21;

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
        	return "Statement";
       	}

       	@Override
       	protected MyDslGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleStatement"
    // InternalMyDsl.g:64:1: entryRuleStatement returns [EObject current=null] : iv_ruleStatement= ruleStatement EOF ;
    public final EObject entryRuleStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStatement = null;


        try {
            // InternalMyDsl.g:64:50: (iv_ruleStatement= ruleStatement EOF )
            // InternalMyDsl.g:65:2: iv_ruleStatement= ruleStatement EOF
            {
             newCompositeNode(grammarAccess.getStatementRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleStatement=ruleStatement();

            state._fsp--;

             current =iv_ruleStatement; 
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
    // $ANTLR end "entryRuleStatement"


    // $ANTLR start "ruleStatement"
    // InternalMyDsl.g:71:1: ruleStatement returns [EObject current=null] : (this_Sumuj_0= ruleSumuj | this_Sukcesy_1= ruleSukcesy ) ;
    public final EObject ruleStatement() throws RecognitionException {
        EObject current = null;

        EObject this_Sumuj_0 = null;

        EObject this_Sukcesy_1 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:77:2: ( (this_Sumuj_0= ruleSumuj | this_Sukcesy_1= ruleSukcesy ) )
            // InternalMyDsl.g:78:2: (this_Sumuj_0= ruleSumuj | this_Sukcesy_1= ruleSukcesy )
            {
            // InternalMyDsl.g:78:2: (this_Sumuj_0= ruleSumuj | this_Sukcesy_1= ruleSukcesy )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==11) ) {
                alt1=1;
            }
            else if ( (LA1_0==15) ) {
                alt1=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // InternalMyDsl.g:79:3: this_Sumuj_0= ruleSumuj
                    {

                    			newCompositeNode(grammarAccess.getStatementAccess().getSumujParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_Sumuj_0=ruleSumuj();

                    state._fsp--;


                    			current = this_Sumuj_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:88:3: this_Sukcesy_1= ruleSukcesy
                    {

                    			newCompositeNode(grammarAccess.getStatementAccess().getSukcesyParserRuleCall_1());
                    		
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
    // $ANTLR end "ruleStatement"


    // $ANTLR start "entryRuleSumuj"
    // InternalMyDsl.g:100:1: entryRuleSumuj returns [EObject current=null] : iv_ruleSumuj= ruleSumuj EOF ;
    public final EObject entryRuleSumuj() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSumuj = null;


        try {
            // InternalMyDsl.g:100:46: (iv_ruleSumuj= ruleSumuj EOF )
            // InternalMyDsl.g:101:2: iv_ruleSumuj= ruleSumuj EOF
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
    // InternalMyDsl.g:107:1: ruleSumuj returns [EObject current=null] : (otherlv_0= 'SUMUJ' ( (lv_diceexprsum_1_0= ruleDiceExprSum ) ) (otherlv_2= ';' ( (lv_diceexprsum_3_0= ruleDiceExprSum ) ) )* (otherlv_4= '.' | otherlv_5= ',' )? ) ;
    public final EObject ruleSumuj() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        EObject lv_diceexprsum_1_0 = null;

        EObject lv_diceexprsum_3_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:113:2: ( (otherlv_0= 'SUMUJ' ( (lv_diceexprsum_1_0= ruleDiceExprSum ) ) (otherlv_2= ';' ( (lv_diceexprsum_3_0= ruleDiceExprSum ) ) )* (otherlv_4= '.' | otherlv_5= ',' )? ) )
            // InternalMyDsl.g:114:2: (otherlv_0= 'SUMUJ' ( (lv_diceexprsum_1_0= ruleDiceExprSum ) ) (otherlv_2= ';' ( (lv_diceexprsum_3_0= ruleDiceExprSum ) ) )* (otherlv_4= '.' | otherlv_5= ',' )? )
            {
            // InternalMyDsl.g:114:2: (otherlv_0= 'SUMUJ' ( (lv_diceexprsum_1_0= ruleDiceExprSum ) ) (otherlv_2= ';' ( (lv_diceexprsum_3_0= ruleDiceExprSum ) ) )* (otherlv_4= '.' | otherlv_5= ',' )? )
            // InternalMyDsl.g:115:3: otherlv_0= 'SUMUJ' ( (lv_diceexprsum_1_0= ruleDiceExprSum ) ) (otherlv_2= ';' ( (lv_diceexprsum_3_0= ruleDiceExprSum ) ) )* (otherlv_4= '.' | otherlv_5= ',' )?
            {
            otherlv_0=(Token)match(input,11,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getSumujAccess().getSUMUJKeyword_0());
            		
            // InternalMyDsl.g:119:3: ( (lv_diceexprsum_1_0= ruleDiceExprSum ) )
            // InternalMyDsl.g:120:4: (lv_diceexprsum_1_0= ruleDiceExprSum )
            {
            // InternalMyDsl.g:120:4: (lv_diceexprsum_1_0= ruleDiceExprSum )
            // InternalMyDsl.g:121:5: lv_diceexprsum_1_0= ruleDiceExprSum
            {

            					newCompositeNode(grammarAccess.getSumujAccess().getDiceexprsumDiceExprSumParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_4);
            lv_diceexprsum_1_0=ruleDiceExprSum();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getSumujRule());
            					}
            					add(
            						current,
            						"diceexprsum",
            						lv_diceexprsum_1_0,
            						"org.xtext.example.mydsl.MyDsl.DiceExprSum");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalMyDsl.g:138:3: (otherlv_2= ';' ( (lv_diceexprsum_3_0= ruleDiceExprSum ) ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==12) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalMyDsl.g:139:4: otherlv_2= ';' ( (lv_diceexprsum_3_0= ruleDiceExprSum ) )
            	    {
            	    otherlv_2=(Token)match(input,12,FOLLOW_3); 

            	    				newLeafNode(otherlv_2, grammarAccess.getSumujAccess().getSemicolonKeyword_2_0());
            	    			
            	    // InternalMyDsl.g:143:4: ( (lv_diceexprsum_3_0= ruleDiceExprSum ) )
            	    // InternalMyDsl.g:144:5: (lv_diceexprsum_3_0= ruleDiceExprSum )
            	    {
            	    // InternalMyDsl.g:144:5: (lv_diceexprsum_3_0= ruleDiceExprSum )
            	    // InternalMyDsl.g:145:6: lv_diceexprsum_3_0= ruleDiceExprSum
            	    {

            	    						newCompositeNode(grammarAccess.getSumujAccess().getDiceexprsumDiceExprSumParserRuleCall_2_1_0());
            	    					
            	    pushFollow(FOLLOW_4);
            	    lv_diceexprsum_3_0=ruleDiceExprSum();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getSumujRule());
            	    						}
            	    						add(
            	    							current,
            	    							"diceexprsum",
            	    							lv_diceexprsum_3_0,
            	    							"org.xtext.example.mydsl.MyDsl.DiceExprSum");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

            // InternalMyDsl.g:163:3: (otherlv_4= '.' | otherlv_5= ',' )?
            int alt3=3;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==13) ) {
                alt3=1;
            }
            else if ( (LA3_0==14) ) {
                alt3=2;
            }
            switch (alt3) {
                case 1 :
                    // InternalMyDsl.g:164:4: otherlv_4= '.'
                    {
                    otherlv_4=(Token)match(input,13,FOLLOW_2); 

                    				newLeafNode(otherlv_4, grammarAccess.getSumujAccess().getFullStopKeyword_3_0());
                    			

                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:169:4: otherlv_5= ','
                    {
                    otherlv_5=(Token)match(input,14,FOLLOW_2); 

                    				newLeafNode(otherlv_5, grammarAccess.getSumujAccess().getCommaKeyword_3_1());
                    			

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
    // InternalMyDsl.g:178:1: entryRuleSukcesy returns [EObject current=null] : iv_ruleSukcesy= ruleSukcesy EOF ;
    public final EObject entryRuleSukcesy() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSukcesy = null;


        try {
            // InternalMyDsl.g:178:48: (iv_ruleSukcesy= ruleSukcesy EOF )
            // InternalMyDsl.g:179:2: iv_ruleSukcesy= ruleSukcesy EOF
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
    // InternalMyDsl.g:185:1: ruleSukcesy returns [EObject current=null] : (otherlv_0= 'SUKCESY' ( (lv_diceexprsuk_1_0= ruleDiceExprSuk ) ) (otherlv_2= ';' ( (lv_diceexprsuk_3_0= ruleDiceExprSuk ) ) )* (otherlv_4= '.' | otherlv_5= ',' )? ) ;
    public final EObject ruleSukcesy() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        EObject lv_diceexprsuk_1_0 = null;

        EObject lv_diceexprsuk_3_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:191:2: ( (otherlv_0= 'SUKCESY' ( (lv_diceexprsuk_1_0= ruleDiceExprSuk ) ) (otherlv_2= ';' ( (lv_diceexprsuk_3_0= ruleDiceExprSuk ) ) )* (otherlv_4= '.' | otherlv_5= ',' )? ) )
            // InternalMyDsl.g:192:2: (otherlv_0= 'SUKCESY' ( (lv_diceexprsuk_1_0= ruleDiceExprSuk ) ) (otherlv_2= ';' ( (lv_diceexprsuk_3_0= ruleDiceExprSuk ) ) )* (otherlv_4= '.' | otherlv_5= ',' )? )
            {
            // InternalMyDsl.g:192:2: (otherlv_0= 'SUKCESY' ( (lv_diceexprsuk_1_0= ruleDiceExprSuk ) ) (otherlv_2= ';' ( (lv_diceexprsuk_3_0= ruleDiceExprSuk ) ) )* (otherlv_4= '.' | otherlv_5= ',' )? )
            // InternalMyDsl.g:193:3: otherlv_0= 'SUKCESY' ( (lv_diceexprsuk_1_0= ruleDiceExprSuk ) ) (otherlv_2= ';' ( (lv_diceexprsuk_3_0= ruleDiceExprSuk ) ) )* (otherlv_4= '.' | otherlv_5= ',' )?
            {
            otherlv_0=(Token)match(input,15,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getSukcesyAccess().getSUKCESYKeyword_0());
            		
            // InternalMyDsl.g:197:3: ( (lv_diceexprsuk_1_0= ruleDiceExprSuk ) )
            // InternalMyDsl.g:198:4: (lv_diceexprsuk_1_0= ruleDiceExprSuk )
            {
            // InternalMyDsl.g:198:4: (lv_diceexprsuk_1_0= ruleDiceExprSuk )
            // InternalMyDsl.g:199:5: lv_diceexprsuk_1_0= ruleDiceExprSuk
            {

            					newCompositeNode(grammarAccess.getSukcesyAccess().getDiceexprsukDiceExprSukParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_4);
            lv_diceexprsuk_1_0=ruleDiceExprSuk();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getSukcesyRule());
            					}
            					add(
            						current,
            						"diceexprsuk",
            						lv_diceexprsuk_1_0,
            						"org.xtext.example.mydsl.MyDsl.DiceExprSuk");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalMyDsl.g:216:3: (otherlv_2= ';' ( (lv_diceexprsuk_3_0= ruleDiceExprSuk ) ) )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==12) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalMyDsl.g:217:4: otherlv_2= ';' ( (lv_diceexprsuk_3_0= ruleDiceExprSuk ) )
            	    {
            	    otherlv_2=(Token)match(input,12,FOLLOW_3); 

            	    				newLeafNode(otherlv_2, grammarAccess.getSukcesyAccess().getSemicolonKeyword_2_0());
            	    			
            	    // InternalMyDsl.g:221:4: ( (lv_diceexprsuk_3_0= ruleDiceExprSuk ) )
            	    // InternalMyDsl.g:222:5: (lv_diceexprsuk_3_0= ruleDiceExprSuk )
            	    {
            	    // InternalMyDsl.g:222:5: (lv_diceexprsuk_3_0= ruleDiceExprSuk )
            	    // InternalMyDsl.g:223:6: lv_diceexprsuk_3_0= ruleDiceExprSuk
            	    {

            	    						newCompositeNode(grammarAccess.getSukcesyAccess().getDiceexprsukDiceExprSukParserRuleCall_2_1_0());
            	    					
            	    pushFollow(FOLLOW_4);
            	    lv_diceexprsuk_3_0=ruleDiceExprSuk();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getSukcesyRule());
            	    						}
            	    						add(
            	    							current,
            	    							"diceexprsuk",
            	    							lv_diceexprsuk_3_0,
            	    							"org.xtext.example.mydsl.MyDsl.DiceExprSuk");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

            // InternalMyDsl.g:241:3: (otherlv_4= '.' | otherlv_5= ',' )?
            int alt5=3;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==13) ) {
                alt5=1;
            }
            else if ( (LA5_0==14) ) {
                alt5=2;
            }
            switch (alt5) {
                case 1 :
                    // InternalMyDsl.g:242:4: otherlv_4= '.'
                    {
                    otherlv_4=(Token)match(input,13,FOLLOW_2); 

                    				newLeafNode(otherlv_4, grammarAccess.getSukcesyAccess().getFullStopKeyword_3_0());
                    			

                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:247:4: otherlv_5= ','
                    {
                    otherlv_5=(Token)match(input,14,FOLLOW_2); 

                    				newLeafNode(otherlv_5, grammarAccess.getSukcesyAccess().getCommaKeyword_3_1());
                    			

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
    // InternalMyDsl.g:256:1: entryRuleDiceExprSum returns [EObject current=null] : iv_ruleDiceExprSum= ruleDiceExprSum EOF ;
    public final EObject entryRuleDiceExprSum() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDiceExprSum = null;


        try {
            // InternalMyDsl.g:256:52: (iv_ruleDiceExprSum= ruleDiceExprSum EOF )
            // InternalMyDsl.g:257:2: iv_ruleDiceExprSum= ruleDiceExprSum EOF
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
    // InternalMyDsl.g:263:1: ruleDiceExprSum returns [EObject current=null] : ( (otherlv_0= '+' | otherlv_1= '-' )? ( (lv_mulexpr_2_0= ruleMulExpr ) ) (otherlv_3= ':' ( (lv_sumrule_4_0= ruleRuleSum ) ) (otherlv_5= ',' ( (lv_sumrule_6_0= ruleRuleSum ) ) )* )? ) ;
    public final EObject ruleDiceExprSum() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_mulexpr_2_0 = null;

        EObject lv_sumrule_4_0 = null;

        EObject lv_sumrule_6_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:269:2: ( ( (otherlv_0= '+' | otherlv_1= '-' )? ( (lv_mulexpr_2_0= ruleMulExpr ) ) (otherlv_3= ':' ( (lv_sumrule_4_0= ruleRuleSum ) ) (otherlv_5= ',' ( (lv_sumrule_6_0= ruleRuleSum ) ) )* )? ) )
            // InternalMyDsl.g:270:2: ( (otherlv_0= '+' | otherlv_1= '-' )? ( (lv_mulexpr_2_0= ruleMulExpr ) ) (otherlv_3= ':' ( (lv_sumrule_4_0= ruleRuleSum ) ) (otherlv_5= ',' ( (lv_sumrule_6_0= ruleRuleSum ) ) )* )? )
            {
            // InternalMyDsl.g:270:2: ( (otherlv_0= '+' | otherlv_1= '-' )? ( (lv_mulexpr_2_0= ruleMulExpr ) ) (otherlv_3= ':' ( (lv_sumrule_4_0= ruleRuleSum ) ) (otherlv_5= ',' ( (lv_sumrule_6_0= ruleRuleSum ) ) )* )? )
            // InternalMyDsl.g:271:3: (otherlv_0= '+' | otherlv_1= '-' )? ( (lv_mulexpr_2_0= ruleMulExpr ) ) (otherlv_3= ':' ( (lv_sumrule_4_0= ruleRuleSum ) ) (otherlv_5= ',' ( (lv_sumrule_6_0= ruleRuleSum ) ) )* )?
            {
            // InternalMyDsl.g:271:3: (otherlv_0= '+' | otherlv_1= '-' )?
            int alt6=3;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==16) ) {
                alt6=1;
            }
            else if ( (LA6_0==17) ) {
                alt6=2;
            }
            switch (alt6) {
                case 1 :
                    // InternalMyDsl.g:272:4: otherlv_0= '+'
                    {
                    otherlv_0=(Token)match(input,16,FOLLOW_3); 

                    				newLeafNode(otherlv_0, grammarAccess.getDiceExprSumAccess().getPlusSignKeyword_0_0());
                    			

                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:277:4: otherlv_1= '-'
                    {
                    otherlv_1=(Token)match(input,17,FOLLOW_3); 

                    				newLeafNode(otherlv_1, grammarAccess.getDiceExprSumAccess().getHyphenMinusKeyword_0_1());
                    			

                    }
                    break;

            }

            // InternalMyDsl.g:282:3: ( (lv_mulexpr_2_0= ruleMulExpr ) )
            // InternalMyDsl.g:283:4: (lv_mulexpr_2_0= ruleMulExpr )
            {
            // InternalMyDsl.g:283:4: (lv_mulexpr_2_0= ruleMulExpr )
            // InternalMyDsl.g:284:5: lv_mulexpr_2_0= ruleMulExpr
            {

            					newCompositeNode(grammarAccess.getDiceExprSumAccess().getMulexprMulExprParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_5);
            lv_mulexpr_2_0=ruleMulExpr();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getDiceExprSumRule());
            					}
            					set(
            						current,
            						"mulexpr",
            						lv_mulexpr_2_0,
            						"org.xtext.example.mydsl.MyDsl.MulExpr");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalMyDsl.g:301:3: (otherlv_3= ':' ( (lv_sumrule_4_0= ruleRuleSum ) ) (otherlv_5= ',' ( (lv_sumrule_6_0= ruleRuleSum ) ) )* )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==18) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalMyDsl.g:302:4: otherlv_3= ':' ( (lv_sumrule_4_0= ruleRuleSum ) ) (otherlv_5= ',' ( (lv_sumrule_6_0= ruleRuleSum ) ) )*
                    {
                    otherlv_3=(Token)match(input,18,FOLLOW_6); 

                    				newLeafNode(otherlv_3, grammarAccess.getDiceExprSumAccess().getColonKeyword_2_0());
                    			
                    // InternalMyDsl.g:306:4: ( (lv_sumrule_4_0= ruleRuleSum ) )
                    // InternalMyDsl.g:307:5: (lv_sumrule_4_0= ruleRuleSum )
                    {
                    // InternalMyDsl.g:307:5: (lv_sumrule_4_0= ruleRuleSum )
                    // InternalMyDsl.g:308:6: lv_sumrule_4_0= ruleRuleSum
                    {

                    						newCompositeNode(grammarAccess.getDiceExprSumAccess().getSumruleRuleSumParserRuleCall_2_1_0());
                    					
                    pushFollow(FOLLOW_7);
                    lv_sumrule_4_0=ruleRuleSum();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getDiceExprSumRule());
                    						}
                    						add(
                    							current,
                    							"sumrule",
                    							lv_sumrule_4_0,
                    							"org.xtext.example.mydsl.MyDsl.RuleSum");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalMyDsl.g:325:4: (otherlv_5= ',' ( (lv_sumrule_6_0= ruleRuleSum ) ) )*
                    loop7:
                    do {
                        int alt7=2;
                        int LA7_0 = input.LA(1);

                        if ( (LA7_0==14) ) {
                            int LA7_2 = input.LA(2);

                            if ( ((LA7_2>=23 && LA7_2<=24)||(LA7_2>=26 && LA7_2<=28)) ) {
                                alt7=1;
                            }


                        }


                        switch (alt7) {
                    	case 1 :
                    	    // InternalMyDsl.g:326:5: otherlv_5= ',' ( (lv_sumrule_6_0= ruleRuleSum ) )
                    	    {
                    	    otherlv_5=(Token)match(input,14,FOLLOW_6); 

                    	    					newLeafNode(otherlv_5, grammarAccess.getDiceExprSumAccess().getCommaKeyword_2_2_0());
                    	    				
                    	    // InternalMyDsl.g:330:5: ( (lv_sumrule_6_0= ruleRuleSum ) )
                    	    // InternalMyDsl.g:331:6: (lv_sumrule_6_0= ruleRuleSum )
                    	    {
                    	    // InternalMyDsl.g:331:6: (lv_sumrule_6_0= ruleRuleSum )
                    	    // InternalMyDsl.g:332:7: lv_sumrule_6_0= ruleRuleSum
                    	    {

                    	    							newCompositeNode(grammarAccess.getDiceExprSumAccess().getSumruleRuleSumParserRuleCall_2_2_1_0());
                    	    						
                    	    pushFollow(FOLLOW_7);
                    	    lv_sumrule_6_0=ruleRuleSum();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getDiceExprSumRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"sumrule",
                    	    								lv_sumrule_6_0,
                    	    								"org.xtext.example.mydsl.MyDsl.RuleSum");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop7;
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
    // InternalMyDsl.g:355:1: entryRuleDiceExprSuk returns [EObject current=null] : iv_ruleDiceExprSuk= ruleDiceExprSuk EOF ;
    public final EObject entryRuleDiceExprSuk() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDiceExprSuk = null;


        try {
            // InternalMyDsl.g:355:52: (iv_ruleDiceExprSuk= ruleDiceExprSuk EOF )
            // InternalMyDsl.g:356:2: iv_ruleDiceExprSuk= ruleDiceExprSuk EOF
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
    // InternalMyDsl.g:362:1: ruleDiceExprSuk returns [EObject current=null] : ( (otherlv_0= '+' | otherlv_1= '-' )? ( (lv_mulexpr_2_0= ruleMulExpr ) ) (otherlv_3= ':' ( (lv_successrule_4_0= ruleRuleSuk ) ) (otherlv_5= ',' ( (lv_successrule_6_0= ruleRuleSuk ) ) )* )? ) ;
    public final EObject ruleDiceExprSuk() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_mulexpr_2_0 = null;

        EObject lv_successrule_4_0 = null;

        EObject lv_successrule_6_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:368:2: ( ( (otherlv_0= '+' | otherlv_1= '-' )? ( (lv_mulexpr_2_0= ruleMulExpr ) ) (otherlv_3= ':' ( (lv_successrule_4_0= ruleRuleSuk ) ) (otherlv_5= ',' ( (lv_successrule_6_0= ruleRuleSuk ) ) )* )? ) )
            // InternalMyDsl.g:369:2: ( (otherlv_0= '+' | otherlv_1= '-' )? ( (lv_mulexpr_2_0= ruleMulExpr ) ) (otherlv_3= ':' ( (lv_successrule_4_0= ruleRuleSuk ) ) (otherlv_5= ',' ( (lv_successrule_6_0= ruleRuleSuk ) ) )* )? )
            {
            // InternalMyDsl.g:369:2: ( (otherlv_0= '+' | otherlv_1= '-' )? ( (lv_mulexpr_2_0= ruleMulExpr ) ) (otherlv_3= ':' ( (lv_successrule_4_0= ruleRuleSuk ) ) (otherlv_5= ',' ( (lv_successrule_6_0= ruleRuleSuk ) ) )* )? )
            // InternalMyDsl.g:370:3: (otherlv_0= '+' | otherlv_1= '-' )? ( (lv_mulexpr_2_0= ruleMulExpr ) ) (otherlv_3= ':' ( (lv_successrule_4_0= ruleRuleSuk ) ) (otherlv_5= ',' ( (lv_successrule_6_0= ruleRuleSuk ) ) )* )?
            {
            // InternalMyDsl.g:370:3: (otherlv_0= '+' | otherlv_1= '-' )?
            int alt9=3;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==16) ) {
                alt9=1;
            }
            else if ( (LA9_0==17) ) {
                alt9=2;
            }
            switch (alt9) {
                case 1 :
                    // InternalMyDsl.g:371:4: otherlv_0= '+'
                    {
                    otherlv_0=(Token)match(input,16,FOLLOW_3); 

                    				newLeafNode(otherlv_0, grammarAccess.getDiceExprSukAccess().getPlusSignKeyword_0_0());
                    			

                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:376:4: otherlv_1= '-'
                    {
                    otherlv_1=(Token)match(input,17,FOLLOW_3); 

                    				newLeafNode(otherlv_1, grammarAccess.getDiceExprSukAccess().getHyphenMinusKeyword_0_1());
                    			

                    }
                    break;

            }

            // InternalMyDsl.g:381:3: ( (lv_mulexpr_2_0= ruleMulExpr ) )
            // InternalMyDsl.g:382:4: (lv_mulexpr_2_0= ruleMulExpr )
            {
            // InternalMyDsl.g:382:4: (lv_mulexpr_2_0= ruleMulExpr )
            // InternalMyDsl.g:383:5: lv_mulexpr_2_0= ruleMulExpr
            {

            					newCompositeNode(grammarAccess.getDiceExprSukAccess().getMulexprMulExprParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_5);
            lv_mulexpr_2_0=ruleMulExpr();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getDiceExprSukRule());
            					}
            					set(
            						current,
            						"mulexpr",
            						lv_mulexpr_2_0,
            						"org.xtext.example.mydsl.MyDsl.MulExpr");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalMyDsl.g:400:3: (otherlv_3= ':' ( (lv_successrule_4_0= ruleRuleSuk ) ) (otherlv_5= ',' ( (lv_successrule_6_0= ruleRuleSuk ) ) )* )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==18) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalMyDsl.g:401:4: otherlv_3= ':' ( (lv_successrule_4_0= ruleRuleSuk ) ) (otherlv_5= ',' ( (lv_successrule_6_0= ruleRuleSuk ) ) )*
                    {
                    otherlv_3=(Token)match(input,18,FOLLOW_8); 

                    				newLeafNode(otherlv_3, grammarAccess.getDiceExprSukAccess().getColonKeyword_2_0());
                    			
                    // InternalMyDsl.g:405:4: ( (lv_successrule_4_0= ruleRuleSuk ) )
                    // InternalMyDsl.g:406:5: (lv_successrule_4_0= ruleRuleSuk )
                    {
                    // InternalMyDsl.g:406:5: (lv_successrule_4_0= ruleRuleSuk )
                    // InternalMyDsl.g:407:6: lv_successrule_4_0= ruleRuleSuk
                    {

                    						newCompositeNode(grammarAccess.getDiceExprSukAccess().getSuccessruleRuleSukParserRuleCall_2_1_0());
                    					
                    pushFollow(FOLLOW_7);
                    lv_successrule_4_0=ruleRuleSuk();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getDiceExprSukRule());
                    						}
                    						add(
                    							current,
                    							"successrule",
                    							lv_successrule_4_0,
                    							"org.xtext.example.mydsl.MyDsl.RuleSuk");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalMyDsl.g:424:4: (otherlv_5= ',' ( (lv_successrule_6_0= ruleRuleSuk ) ) )*
                    loop10:
                    do {
                        int alt10=2;
                        int LA10_0 = input.LA(1);

                        if ( (LA10_0==14) ) {
                            int LA10_2 = input.LA(2);

                            if ( ((LA10_2>=26 && LA10_2<=29)) ) {
                                alt10=1;
                            }


                        }


                        switch (alt10) {
                    	case 1 :
                    	    // InternalMyDsl.g:425:5: otherlv_5= ',' ( (lv_successrule_6_0= ruleRuleSuk ) )
                    	    {
                    	    otherlv_5=(Token)match(input,14,FOLLOW_8); 

                    	    					newLeafNode(otherlv_5, grammarAccess.getDiceExprSukAccess().getCommaKeyword_2_2_0());
                    	    				
                    	    // InternalMyDsl.g:429:5: ( (lv_successrule_6_0= ruleRuleSuk ) )
                    	    // InternalMyDsl.g:430:6: (lv_successrule_6_0= ruleRuleSuk )
                    	    {
                    	    // InternalMyDsl.g:430:6: (lv_successrule_6_0= ruleRuleSuk )
                    	    // InternalMyDsl.g:431:7: lv_successrule_6_0= ruleRuleSuk
                    	    {

                    	    							newCompositeNode(grammarAccess.getDiceExprSukAccess().getSuccessruleRuleSukParserRuleCall_2_2_1_0());
                    	    						
                    	    pushFollow(FOLLOW_7);
                    	    lv_successrule_6_0=ruleRuleSuk();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getDiceExprSukRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"successrule",
                    	    								lv_successrule_6_0,
                    	    								"org.xtext.example.mydsl.MyDsl.RuleSuk");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop10;
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
    // InternalMyDsl.g:454:1: entryRuleMulExpr returns [EObject current=null] : iv_ruleMulExpr= ruleMulExpr EOF ;
    public final EObject entryRuleMulExpr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMulExpr = null;


        try {
            // InternalMyDsl.g:454:48: (iv_ruleMulExpr= ruleMulExpr EOF )
            // InternalMyDsl.g:455:2: iv_ruleMulExpr= ruleMulExpr EOF
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
    // InternalMyDsl.g:461:1: ruleMulExpr returns [EObject current=null] : ( ( (lv_formexpr_0_0= ruleForm ) ) | (otherlv_1= '(' ( (lv_formexpr_2_0= ruleForm ) ) otherlv_3= ')' (otherlv_4= 'razy' ( (lv_num_5_0= ruleNum ) ) )? ) ) ;
    public final EObject ruleMulExpr() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        EObject lv_formexpr_0_0 = null;

        EObject lv_formexpr_2_0 = null;

        EObject lv_num_5_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:467:2: ( ( ( (lv_formexpr_0_0= ruleForm ) ) | (otherlv_1= '(' ( (lv_formexpr_2_0= ruleForm ) ) otherlv_3= ')' (otherlv_4= 'razy' ( (lv_num_5_0= ruleNum ) ) )? ) ) )
            // InternalMyDsl.g:468:2: ( ( (lv_formexpr_0_0= ruleForm ) ) | (otherlv_1= '(' ( (lv_formexpr_2_0= ruleForm ) ) otherlv_3= ')' (otherlv_4= 'razy' ( (lv_num_5_0= ruleNum ) ) )? ) )
            {
            // InternalMyDsl.g:468:2: ( ( (lv_formexpr_0_0= ruleForm ) ) | (otherlv_1= '(' ( (lv_formexpr_2_0= ruleForm ) ) otherlv_3= ')' (otherlv_4= 'razy' ( (lv_num_5_0= ruleNum ) ) )? ) )
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==22||LA13_0==34) ) {
                alt13=1;
            }
            else if ( (LA13_0==19) ) {
                alt13=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }
            switch (alt13) {
                case 1 :
                    // InternalMyDsl.g:469:3: ( (lv_formexpr_0_0= ruleForm ) )
                    {
                    // InternalMyDsl.g:469:3: ( (lv_formexpr_0_0= ruleForm ) )
                    // InternalMyDsl.g:470:4: (lv_formexpr_0_0= ruleForm )
                    {
                    // InternalMyDsl.g:470:4: (lv_formexpr_0_0= ruleForm )
                    // InternalMyDsl.g:471:5: lv_formexpr_0_0= ruleForm
                    {

                    					newCompositeNode(grammarAccess.getMulExprAccess().getFormexprFormParserRuleCall_0_0());
                    				
                    pushFollow(FOLLOW_2);
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


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:489:3: (otherlv_1= '(' ( (lv_formexpr_2_0= ruleForm ) ) otherlv_3= ')' (otherlv_4= 'razy' ( (lv_num_5_0= ruleNum ) ) )? )
                    {
                    // InternalMyDsl.g:489:3: (otherlv_1= '(' ( (lv_formexpr_2_0= ruleForm ) ) otherlv_3= ')' (otherlv_4= 'razy' ( (lv_num_5_0= ruleNum ) ) )? )
                    // InternalMyDsl.g:490:4: otherlv_1= '(' ( (lv_formexpr_2_0= ruleForm ) ) otherlv_3= ')' (otherlv_4= 'razy' ( (lv_num_5_0= ruleNum ) ) )?
                    {
                    otherlv_1=(Token)match(input,19,FOLLOW_9); 

                    				newLeafNode(otherlv_1, grammarAccess.getMulExprAccess().getLeftParenthesisKeyword_1_0());
                    			
                    // InternalMyDsl.g:494:4: ( (lv_formexpr_2_0= ruleForm ) )
                    // InternalMyDsl.g:495:5: (lv_formexpr_2_0= ruleForm )
                    {
                    // InternalMyDsl.g:495:5: (lv_formexpr_2_0= ruleForm )
                    // InternalMyDsl.g:496:6: lv_formexpr_2_0= ruleForm
                    {

                    						newCompositeNode(grammarAccess.getMulExprAccess().getFormexprFormParserRuleCall_1_1_0());
                    					
                    pushFollow(FOLLOW_10);
                    lv_formexpr_2_0=ruleForm();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getMulExprRule());
                    						}
                    						set(
                    							current,
                    							"formexpr",
                    							lv_formexpr_2_0,
                    							"org.xtext.example.mydsl.MyDsl.Form");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_3=(Token)match(input,20,FOLLOW_11); 

                    				newLeafNode(otherlv_3, grammarAccess.getMulExprAccess().getRightParenthesisKeyword_1_2());
                    			
                    // InternalMyDsl.g:517:4: (otherlv_4= 'razy' ( (lv_num_5_0= ruleNum ) ) )?
                    int alt12=2;
                    int LA12_0 = input.LA(1);

                    if ( (LA12_0==21) ) {
                        alt12=1;
                    }
                    switch (alt12) {
                        case 1 :
                            // InternalMyDsl.g:518:5: otherlv_4= 'razy' ( (lv_num_5_0= ruleNum ) )
                            {
                            otherlv_4=(Token)match(input,21,FOLLOW_9); 

                            					newLeafNode(otherlv_4, grammarAccess.getMulExprAccess().getRazyKeyword_1_3_0());
                            				
                            // InternalMyDsl.g:522:5: ( (lv_num_5_0= ruleNum ) )
                            // InternalMyDsl.g:523:6: (lv_num_5_0= ruleNum )
                            {
                            // InternalMyDsl.g:523:6: (lv_num_5_0= ruleNum )
                            // InternalMyDsl.g:524:7: lv_num_5_0= ruleNum
                            {

                            							newCompositeNode(grammarAccess.getMulExprAccess().getNumNumParserRuleCall_1_3_1_0());
                            						
                            pushFollow(FOLLOW_2);
                            lv_num_5_0=ruleNum();

                            state._fsp--;


                            							if (current==null) {
                            								current = createModelElementForParent(grammarAccess.getMulExprRule());
                            							}
                            							set(
                            								current,
                            								"num",
                            								lv_num_5_0,
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
    // InternalMyDsl.g:547:1: entryRuleForm returns [EObject current=null] : iv_ruleForm= ruleForm EOF ;
    public final EObject entryRuleForm() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleForm = null;


        try {
            // InternalMyDsl.g:547:45: (iv_ruleForm= ruleForm EOF )
            // InternalMyDsl.g:548:2: iv_ruleForm= ruleForm EOF
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
    // InternalMyDsl.g:554:1: ruleForm returns [EObject current=null] : ( ( (lv_left_0_0= ruleDice ) ) ( ( (lv_operator_1_0= ruleOperator ) ) ( (lv_right_2_0= ruleNum ) ) )? ) ;
    public final EObject ruleForm() throws RecognitionException {
        EObject current = null;

        EObject lv_left_0_0 = null;

        AntlrDatatypeRuleToken lv_operator_1_0 = null;

        EObject lv_right_2_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:560:2: ( ( ( (lv_left_0_0= ruleDice ) ) ( ( (lv_operator_1_0= ruleOperator ) ) ( (lv_right_2_0= ruleNum ) ) )? ) )
            // InternalMyDsl.g:561:2: ( ( (lv_left_0_0= ruleDice ) ) ( ( (lv_operator_1_0= ruleOperator ) ) ( (lv_right_2_0= ruleNum ) ) )? )
            {
            // InternalMyDsl.g:561:2: ( ( (lv_left_0_0= ruleDice ) ) ( ( (lv_operator_1_0= ruleOperator ) ) ( (lv_right_2_0= ruleNum ) ) )? )
            // InternalMyDsl.g:562:3: ( (lv_left_0_0= ruleDice ) ) ( ( (lv_operator_1_0= ruleOperator ) ) ( (lv_right_2_0= ruleNum ) ) )?
            {
            // InternalMyDsl.g:562:3: ( (lv_left_0_0= ruleDice ) )
            // InternalMyDsl.g:563:4: (lv_left_0_0= ruleDice )
            {
            // InternalMyDsl.g:563:4: (lv_left_0_0= ruleDice )
            // InternalMyDsl.g:564:5: lv_left_0_0= ruleDice
            {

            					newCompositeNode(grammarAccess.getFormAccess().getLeftDiceParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_12);
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

            // InternalMyDsl.g:581:3: ( ( (lv_operator_1_0= ruleOperator ) ) ( (lv_right_2_0= ruleNum ) ) )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( ((LA14_0>=16 && LA14_0<=17)||LA14_0==21||(LA14_0>=40 && LA14_0<=41)) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalMyDsl.g:582:4: ( (lv_operator_1_0= ruleOperator ) ) ( (lv_right_2_0= ruleNum ) )
                    {
                    // InternalMyDsl.g:582:4: ( (lv_operator_1_0= ruleOperator ) )
                    // InternalMyDsl.g:583:5: (lv_operator_1_0= ruleOperator )
                    {
                    // InternalMyDsl.g:583:5: (lv_operator_1_0= ruleOperator )
                    // InternalMyDsl.g:584:6: lv_operator_1_0= ruleOperator
                    {

                    						newCompositeNode(grammarAccess.getFormAccess().getOperatorOperatorParserRuleCall_1_0_0());
                    					
                    pushFollow(FOLLOW_9);
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

                    // InternalMyDsl.g:601:4: ( (lv_right_2_0= ruleNum ) )
                    // InternalMyDsl.g:602:5: (lv_right_2_0= ruleNum )
                    {
                    // InternalMyDsl.g:602:5: (lv_right_2_0= ruleNum )
                    // InternalMyDsl.g:603:6: lv_right_2_0= ruleNum
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
    // InternalMyDsl.g:625:1: entryRuleSingleDice returns [EObject current=null] : iv_ruleSingleDice= ruleSingleDice EOF ;
    public final EObject entryRuleSingleDice() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSingleDice = null;


        try {
            // InternalMyDsl.g:625:51: (iv_ruleSingleDice= ruleSingleDice EOF )
            // InternalMyDsl.g:626:2: iv_ruleSingleDice= ruleSingleDice EOF
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
    // InternalMyDsl.g:632:1: ruleSingleDice returns [EObject current=null] : (otherlv_0= 'd' ( (lv_sides_1_0= ruleNum ) ) ) ;
    public final EObject ruleSingleDice() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_sides_1_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:638:2: ( (otherlv_0= 'd' ( (lv_sides_1_0= ruleNum ) ) ) )
            // InternalMyDsl.g:639:2: (otherlv_0= 'd' ( (lv_sides_1_0= ruleNum ) ) )
            {
            // InternalMyDsl.g:639:2: (otherlv_0= 'd' ( (lv_sides_1_0= ruleNum ) ) )
            // InternalMyDsl.g:640:3: otherlv_0= 'd' ( (lv_sides_1_0= ruleNum ) )
            {
            otherlv_0=(Token)match(input,22,FOLLOW_9); 

            			newLeafNode(otherlv_0, grammarAccess.getSingleDiceAccess().getDKeyword_0());
            		
            // InternalMyDsl.g:644:3: ( (lv_sides_1_0= ruleNum ) )
            // InternalMyDsl.g:645:4: (lv_sides_1_0= ruleNum )
            {
            // InternalMyDsl.g:645:4: (lv_sides_1_0= ruleNum )
            // InternalMyDsl.g:646:5: lv_sides_1_0= ruleNum
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
    // InternalMyDsl.g:667:1: entryRuleMultiDice returns [EObject current=null] : iv_ruleMultiDice= ruleMultiDice EOF ;
    public final EObject entryRuleMultiDice() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMultiDice = null;


        try {
            // InternalMyDsl.g:667:50: (iv_ruleMultiDice= ruleMultiDice EOF )
            // InternalMyDsl.g:668:2: iv_ruleMultiDice= ruleMultiDice EOF
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
    // InternalMyDsl.g:674:1: ruleMultiDice returns [EObject current=null] : ( ( (lv_count_0_0= ruleNum ) ) otherlv_1= 'd' ( (lv_sides_2_0= ruleNum ) ) ) ;
    public final EObject ruleMultiDice() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_count_0_0 = null;

        EObject lv_sides_2_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:680:2: ( ( ( (lv_count_0_0= ruleNum ) ) otherlv_1= 'd' ( (lv_sides_2_0= ruleNum ) ) ) )
            // InternalMyDsl.g:681:2: ( ( (lv_count_0_0= ruleNum ) ) otherlv_1= 'd' ( (lv_sides_2_0= ruleNum ) ) )
            {
            // InternalMyDsl.g:681:2: ( ( (lv_count_0_0= ruleNum ) ) otherlv_1= 'd' ( (lv_sides_2_0= ruleNum ) ) )
            // InternalMyDsl.g:682:3: ( (lv_count_0_0= ruleNum ) ) otherlv_1= 'd' ( (lv_sides_2_0= ruleNum ) )
            {
            // InternalMyDsl.g:682:3: ( (lv_count_0_0= ruleNum ) )
            // InternalMyDsl.g:683:4: (lv_count_0_0= ruleNum )
            {
            // InternalMyDsl.g:683:4: (lv_count_0_0= ruleNum )
            // InternalMyDsl.g:684:5: lv_count_0_0= ruleNum
            {

            					newCompositeNode(grammarAccess.getMultiDiceAccess().getCountNumParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_13);
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

            otherlv_1=(Token)match(input,22,FOLLOW_9); 

            			newLeafNode(otherlv_1, grammarAccess.getMultiDiceAccess().getDKeyword_1());
            		
            // InternalMyDsl.g:705:3: ( (lv_sides_2_0= ruleNum ) )
            // InternalMyDsl.g:706:4: (lv_sides_2_0= ruleNum )
            {
            // InternalMyDsl.g:706:4: (lv_sides_2_0= ruleNum )
            // InternalMyDsl.g:707:5: lv_sides_2_0= ruleNum
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
    // InternalMyDsl.g:728:1: entryRuleDice returns [EObject current=null] : iv_ruleDice= ruleDice EOF ;
    public final EObject entryRuleDice() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDice = null;


        try {
            // InternalMyDsl.g:728:45: (iv_ruleDice= ruleDice EOF )
            // InternalMyDsl.g:729:2: iv_ruleDice= ruleDice EOF
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
    // InternalMyDsl.g:735:1: ruleDice returns [EObject current=null] : (this_SingleDice_0= ruleSingleDice | this_MultiDice_1= ruleMultiDice ) ;
    public final EObject ruleDice() throws RecognitionException {
        EObject current = null;

        EObject this_SingleDice_0 = null;

        EObject this_MultiDice_1 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:741:2: ( (this_SingleDice_0= ruleSingleDice | this_MultiDice_1= ruleMultiDice ) )
            // InternalMyDsl.g:742:2: (this_SingleDice_0= ruleSingleDice | this_MultiDice_1= ruleMultiDice )
            {
            // InternalMyDsl.g:742:2: (this_SingleDice_0= ruleSingleDice | this_MultiDice_1= ruleMultiDice )
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==22) ) {
                alt15=1;
            }
            else if ( (LA15_0==34) ) {
                alt15=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                throw nvae;
            }
            switch (alt15) {
                case 1 :
                    // InternalMyDsl.g:743:3: this_SingleDice_0= ruleSingleDice
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
                    // InternalMyDsl.g:752:3: this_MultiDice_1= ruleMultiDice
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


    // $ANTLR start "entryRuleExplosionRule"
    // InternalMyDsl.g:764:1: entryRuleExplosionRule returns [EObject current=null] : iv_ruleExplosionRule= ruleExplosionRule EOF ;
    public final EObject entryRuleExplosionRule() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExplosionRule = null;


        try {
            // InternalMyDsl.g:764:54: (iv_ruleExplosionRule= ruleExplosionRule EOF )
            // InternalMyDsl.g:765:2: iv_ruleExplosionRule= ruleExplosionRule EOF
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
    // InternalMyDsl.g:771:1: ruleExplosionRule returns [EObject current=null] : ( (otherlv_0= 'dodawaj' | otherlv_1= 'odejmuj' ) otherlv_2= 'wybuchowe' ( (lv_num_3_0= ruleNum ) ) ) ;
    public final EObject ruleExplosionRule() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        EObject lv_num_3_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:777:2: ( ( (otherlv_0= 'dodawaj' | otherlv_1= 'odejmuj' ) otherlv_2= 'wybuchowe' ( (lv_num_3_0= ruleNum ) ) ) )
            // InternalMyDsl.g:778:2: ( (otherlv_0= 'dodawaj' | otherlv_1= 'odejmuj' ) otherlv_2= 'wybuchowe' ( (lv_num_3_0= ruleNum ) ) )
            {
            // InternalMyDsl.g:778:2: ( (otherlv_0= 'dodawaj' | otherlv_1= 'odejmuj' ) otherlv_2= 'wybuchowe' ( (lv_num_3_0= ruleNum ) ) )
            // InternalMyDsl.g:779:3: (otherlv_0= 'dodawaj' | otherlv_1= 'odejmuj' ) otherlv_2= 'wybuchowe' ( (lv_num_3_0= ruleNum ) )
            {
            // InternalMyDsl.g:779:3: (otherlv_0= 'dodawaj' | otherlv_1= 'odejmuj' )
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==23) ) {
                alt16=1;
            }
            else if ( (LA16_0==24) ) {
                alt16=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 16, 0, input);

                throw nvae;
            }
            switch (alt16) {
                case 1 :
                    // InternalMyDsl.g:780:4: otherlv_0= 'dodawaj'
                    {
                    otherlv_0=(Token)match(input,23,FOLLOW_14); 

                    				newLeafNode(otherlv_0, grammarAccess.getExplosionRuleAccess().getDodawajKeyword_0_0());
                    			

                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:785:4: otherlv_1= 'odejmuj'
                    {
                    otherlv_1=(Token)match(input,24,FOLLOW_14); 

                    				newLeafNode(otherlv_1, grammarAccess.getExplosionRuleAccess().getOdejmujKeyword_0_1());
                    			

                    }
                    break;

            }

            otherlv_2=(Token)match(input,25,FOLLOW_9); 

            			newLeafNode(otherlv_2, grammarAccess.getExplosionRuleAccess().getWybuchoweKeyword_1());
            		
            // InternalMyDsl.g:794:3: ( (lv_num_3_0= ruleNum ) )
            // InternalMyDsl.g:795:4: (lv_num_3_0= ruleNum )
            {
            // InternalMyDsl.g:795:4: (lv_num_3_0= ruleNum )
            // InternalMyDsl.g:796:5: lv_num_3_0= ruleNum
            {

            					newCompositeNode(grammarAccess.getExplosionRuleAccess().getNumNumParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_num_3_0=ruleNum();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getExplosionRuleRule());
            					}
            					set(
            						current,
            						"num",
            						lv_num_3_0,
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
    // InternalMyDsl.g:817:1: entryRuleDiceMarkSum returns [EObject current=null] : iv_ruleDiceMarkSum= ruleDiceMarkSum EOF ;
    public final EObject entryRuleDiceMarkSum() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDiceMarkSum = null;


        try {
            // InternalMyDsl.g:817:52: (iv_ruleDiceMarkSum= ruleDiceMarkSum EOF )
            // InternalMyDsl.g:818:2: iv_ruleDiceMarkSum= ruleDiceMarkSum EOF
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
    // InternalMyDsl.g:824:1: ruleDiceMarkSum returns [EObject current=null] : (otherlv_0= 'oznacz' ( (lv_mark_1_0= ruleMark ) ) ) ;
    public final EObject ruleDiceMarkSum() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_mark_1_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:830:2: ( (otherlv_0= 'oznacz' ( (lv_mark_1_0= ruleMark ) ) ) )
            // InternalMyDsl.g:831:2: (otherlv_0= 'oznacz' ( (lv_mark_1_0= ruleMark ) ) )
            {
            // InternalMyDsl.g:831:2: (otherlv_0= 'oznacz' ( (lv_mark_1_0= ruleMark ) ) )
            // InternalMyDsl.g:832:3: otherlv_0= 'oznacz' ( (lv_mark_1_0= ruleMark ) )
            {
            otherlv_0=(Token)match(input,26,FOLLOW_15); 

            			newLeafNode(otherlv_0, grammarAccess.getDiceMarkSumAccess().getOznaczKeyword_0());
            		
            // InternalMyDsl.g:836:3: ( (lv_mark_1_0= ruleMark ) )
            // InternalMyDsl.g:837:4: (lv_mark_1_0= ruleMark )
            {
            // InternalMyDsl.g:837:4: (lv_mark_1_0= ruleMark )
            // InternalMyDsl.g:838:5: lv_mark_1_0= ruleMark
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
    // InternalMyDsl.g:859:1: entryRuleDiceDiscSum returns [EObject current=null] : iv_ruleDiceDiscSum= ruleDiceDiscSum EOF ;
    public final EObject entryRuleDiceDiscSum() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDiceDiscSum = null;


        try {
            // InternalMyDsl.g:859:52: (iv_ruleDiceDiscSum= ruleDiceDiscSum EOF )
            // InternalMyDsl.g:860:2: iv_ruleDiceDiscSum= ruleDiceDiscSum EOF
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
    // InternalMyDsl.g:866:1: ruleDiceDiscSum returns [EObject current=null] : (otherlv_0= 'odrzuc' ( (lv_discard_1_0= ruleDiscard ) ) ) ;
    public final EObject ruleDiceDiscSum() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_discard_1_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:872:2: ( (otherlv_0= 'odrzuc' ( (lv_discard_1_0= ruleDiscard ) ) ) )
            // InternalMyDsl.g:873:2: (otherlv_0= 'odrzuc' ( (lv_discard_1_0= ruleDiscard ) ) )
            {
            // InternalMyDsl.g:873:2: (otherlv_0= 'odrzuc' ( (lv_discard_1_0= ruleDiscard ) ) )
            // InternalMyDsl.g:874:3: otherlv_0= 'odrzuc' ( (lv_discard_1_0= ruleDiscard ) )
            {
            otherlv_0=(Token)match(input,27,FOLLOW_15); 

            			newLeafNode(otherlv_0, grammarAccess.getDiceDiscSumAccess().getOdrzucKeyword_0());
            		
            // InternalMyDsl.g:878:3: ( (lv_discard_1_0= ruleDiscard ) )
            // InternalMyDsl.g:879:4: (lv_discard_1_0= ruleDiscard )
            {
            // InternalMyDsl.g:879:4: (lv_discard_1_0= ruleDiscard )
            // InternalMyDsl.g:880:5: lv_discard_1_0= ruleDiscard
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
    // InternalMyDsl.g:901:1: entryRuleDiceRerollSum returns [EObject current=null] : iv_ruleDiceRerollSum= ruleDiceRerollSum EOF ;
    public final EObject entryRuleDiceRerollSum() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDiceRerollSum = null;


        try {
            // InternalMyDsl.g:901:54: (iv_ruleDiceRerollSum= ruleDiceRerollSum EOF )
            // InternalMyDsl.g:902:2: iv_ruleDiceRerollSum= ruleDiceRerollSum EOF
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
    // InternalMyDsl.g:908:1: ruleDiceRerollSum returns [EObject current=null] : (otherlv_0= 'przerzuc' ( (lv_reroll_1_0= ruleReroll ) ) ) ;
    public final EObject ruleDiceRerollSum() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_reroll_1_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:914:2: ( (otherlv_0= 'przerzuc' ( (lv_reroll_1_0= ruleReroll ) ) ) )
            // InternalMyDsl.g:915:2: (otherlv_0= 'przerzuc' ( (lv_reroll_1_0= ruleReroll ) ) )
            {
            // InternalMyDsl.g:915:2: (otherlv_0= 'przerzuc' ( (lv_reroll_1_0= ruleReroll ) ) )
            // InternalMyDsl.g:916:3: otherlv_0= 'przerzuc' ( (lv_reroll_1_0= ruleReroll ) )
            {
            otherlv_0=(Token)match(input,28,FOLLOW_15); 

            			newLeafNode(otherlv_0, grammarAccess.getDiceRerollSumAccess().getPrzerzucKeyword_0());
            		
            // InternalMyDsl.g:920:3: ( (lv_reroll_1_0= ruleReroll ) )
            // InternalMyDsl.g:921:4: (lv_reroll_1_0= ruleReroll )
            {
            // InternalMyDsl.g:921:4: (lv_reroll_1_0= ruleReroll )
            // InternalMyDsl.g:922:5: lv_reroll_1_0= ruleReroll
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


    // $ANTLR start "entryRuleRuleSum"
    // InternalMyDsl.g:943:1: entryRuleRuleSum returns [EObject current=null] : iv_ruleRuleSum= ruleRuleSum EOF ;
    public final EObject entryRuleRuleSum() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRuleSum = null;


        try {
            // InternalMyDsl.g:943:48: (iv_ruleRuleSum= ruleRuleSum EOF )
            // InternalMyDsl.g:944:2: iv_ruleRuleSum= ruleRuleSum EOF
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
    // InternalMyDsl.g:950:1: ruleRuleSum returns [EObject current=null] : (this_ExplosionRule_0= ruleExplosionRule | this_DiceMarkSum_1= ruleDiceMarkSum | this_DiceDiscSum_2= ruleDiceDiscSum | this_DiceRerollSum_3= ruleDiceRerollSum ) ;
    public final EObject ruleRuleSum() throws RecognitionException {
        EObject current = null;

        EObject this_ExplosionRule_0 = null;

        EObject this_DiceMarkSum_1 = null;

        EObject this_DiceDiscSum_2 = null;

        EObject this_DiceRerollSum_3 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:956:2: ( (this_ExplosionRule_0= ruleExplosionRule | this_DiceMarkSum_1= ruleDiceMarkSum | this_DiceDiscSum_2= ruleDiceDiscSum | this_DiceRerollSum_3= ruleDiceRerollSum ) )
            // InternalMyDsl.g:957:2: (this_ExplosionRule_0= ruleExplosionRule | this_DiceMarkSum_1= ruleDiceMarkSum | this_DiceDiscSum_2= ruleDiceDiscSum | this_DiceRerollSum_3= ruleDiceRerollSum )
            {
            // InternalMyDsl.g:957:2: (this_ExplosionRule_0= ruleExplosionRule | this_DiceMarkSum_1= ruleDiceMarkSum | this_DiceDiscSum_2= ruleDiceDiscSum | this_DiceRerollSum_3= ruleDiceRerollSum )
            int alt17=4;
            switch ( input.LA(1) ) {
            case 23:
            case 24:
                {
                alt17=1;
                }
                break;
            case 26:
                {
                alt17=2;
                }
                break;
            case 27:
                {
                alt17=3;
                }
                break;
            case 28:
                {
                alt17=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 17, 0, input);

                throw nvae;
            }

            switch (alt17) {
                case 1 :
                    // InternalMyDsl.g:958:3: this_ExplosionRule_0= ruleExplosionRule
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
                    // InternalMyDsl.g:967:3: this_DiceMarkSum_1= ruleDiceMarkSum
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
                    // InternalMyDsl.g:976:3: this_DiceDiscSum_2= ruleDiceDiscSum
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
                    // InternalMyDsl.g:985:3: this_DiceRerollSum_3= ruleDiceRerollSum
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


    // $ANTLR start "entryRuleSuccessThreshold"
    // InternalMyDsl.g:997:1: entryRuleSuccessThreshold returns [EObject current=null] : iv_ruleSuccessThreshold= ruleSuccessThreshold EOF ;
    public final EObject entryRuleSuccessThreshold() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSuccessThreshold = null;


        try {
            // InternalMyDsl.g:997:57: (iv_ruleSuccessThreshold= ruleSuccessThreshold EOF )
            // InternalMyDsl.g:998:2: iv_ruleSuccessThreshold= ruleSuccessThreshold EOF
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
    // InternalMyDsl.g:1004:1: ruleSuccessThreshold returns [EObject current=null] : (otherlv_0= 'sukces' (otherlv_1= 'wiecej niz' | otherlv_2= 'mniej niz' ) ( (lv_num_3_0= ruleNum ) ) ) ;
    public final EObject ruleSuccessThreshold() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        EObject lv_num_3_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:1010:2: ( (otherlv_0= 'sukces' (otherlv_1= 'wiecej niz' | otherlv_2= 'mniej niz' ) ( (lv_num_3_0= ruleNum ) ) ) )
            // InternalMyDsl.g:1011:2: (otherlv_0= 'sukces' (otherlv_1= 'wiecej niz' | otherlv_2= 'mniej niz' ) ( (lv_num_3_0= ruleNum ) ) )
            {
            // InternalMyDsl.g:1011:2: (otherlv_0= 'sukces' (otherlv_1= 'wiecej niz' | otherlv_2= 'mniej niz' ) ( (lv_num_3_0= ruleNum ) ) )
            // InternalMyDsl.g:1012:3: otherlv_0= 'sukces' (otherlv_1= 'wiecej niz' | otherlv_2= 'mniej niz' ) ( (lv_num_3_0= ruleNum ) )
            {
            otherlv_0=(Token)match(input,29,FOLLOW_16); 

            			newLeafNode(otherlv_0, grammarAccess.getSuccessThresholdAccess().getSukcesKeyword_0());
            		
            // InternalMyDsl.g:1016:3: (otherlv_1= 'wiecej niz' | otherlv_2= 'mniej niz' )
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==30) ) {
                alt18=1;
            }
            else if ( (LA18_0==31) ) {
                alt18=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 18, 0, input);

                throw nvae;
            }
            switch (alt18) {
                case 1 :
                    // InternalMyDsl.g:1017:4: otherlv_1= 'wiecej niz'
                    {
                    otherlv_1=(Token)match(input,30,FOLLOW_9); 

                    				newLeafNode(otherlv_1, grammarAccess.getSuccessThresholdAccess().getWiecejNizKeyword_1_0());
                    			

                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:1022:4: otherlv_2= 'mniej niz'
                    {
                    otherlv_2=(Token)match(input,31,FOLLOW_9); 

                    				newLeafNode(otherlv_2, grammarAccess.getSuccessThresholdAccess().getMniejNizKeyword_1_1());
                    			

                    }
                    break;

            }

            // InternalMyDsl.g:1027:3: ( (lv_num_3_0= ruleNum ) )
            // InternalMyDsl.g:1028:4: (lv_num_3_0= ruleNum )
            {
            // InternalMyDsl.g:1028:4: (lv_num_3_0= ruleNum )
            // InternalMyDsl.g:1029:5: lv_num_3_0= ruleNum
            {

            					newCompositeNode(grammarAccess.getSuccessThresholdAccess().getNumNumParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_num_3_0=ruleNum();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getSuccessThresholdRule());
            					}
            					set(
            						current,
            						"num",
            						lv_num_3_0,
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
    // InternalMyDsl.g:1050:1: entryRuleSuccessMultiplier returns [EObject current=null] : iv_ruleSuccessMultiplier= ruleSuccessMultiplier EOF ;
    public final EObject entryRuleSuccessMultiplier() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSuccessMultiplier = null;


        try {
            // InternalMyDsl.g:1050:58: (iv_ruleSuccessMultiplier= ruleSuccessMultiplier EOF )
            // InternalMyDsl.g:1051:2: iv_ruleSuccessMultiplier= ruleSuccessMultiplier EOF
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
    // InternalMyDsl.g:1057:1: ruleSuccessMultiplier returns [EObject current=null] : (otherlv_0= 'sukces' ( (lv_num_1_0= ruleNum ) ) otherlv_2= 'razy' ( (lv_mult_3_0= ruleNum ) ) ) ;
    public final EObject ruleSuccessMultiplier() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_num_1_0 = null;

        EObject lv_mult_3_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:1063:2: ( (otherlv_0= 'sukces' ( (lv_num_1_0= ruleNum ) ) otherlv_2= 'razy' ( (lv_mult_3_0= ruleNum ) ) ) )
            // InternalMyDsl.g:1064:2: (otherlv_0= 'sukces' ( (lv_num_1_0= ruleNum ) ) otherlv_2= 'razy' ( (lv_mult_3_0= ruleNum ) ) )
            {
            // InternalMyDsl.g:1064:2: (otherlv_0= 'sukces' ( (lv_num_1_0= ruleNum ) ) otherlv_2= 'razy' ( (lv_mult_3_0= ruleNum ) ) )
            // InternalMyDsl.g:1065:3: otherlv_0= 'sukces' ( (lv_num_1_0= ruleNum ) ) otherlv_2= 'razy' ( (lv_mult_3_0= ruleNum ) )
            {
            otherlv_0=(Token)match(input,29,FOLLOW_9); 

            			newLeafNode(otherlv_0, grammarAccess.getSuccessMultiplierAccess().getSukcesKeyword_0());
            		
            // InternalMyDsl.g:1069:3: ( (lv_num_1_0= ruleNum ) )
            // InternalMyDsl.g:1070:4: (lv_num_1_0= ruleNum )
            {
            // InternalMyDsl.g:1070:4: (lv_num_1_0= ruleNum )
            // InternalMyDsl.g:1071:5: lv_num_1_0= ruleNum
            {

            					newCompositeNode(grammarAccess.getSuccessMultiplierAccess().getNumNumParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_17);
            lv_num_1_0=ruleNum();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getSuccessMultiplierRule());
            					}
            					set(
            						current,
            						"num",
            						lv_num_1_0,
            						"org.xtext.example.mydsl.MyDsl.Num");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,21,FOLLOW_9); 

            			newLeafNode(otherlv_2, grammarAccess.getSuccessMultiplierAccess().getRazyKeyword_2());
            		
            // InternalMyDsl.g:1092:3: ( (lv_mult_3_0= ruleNum ) )
            // InternalMyDsl.g:1093:4: (lv_mult_3_0= ruleNum )
            {
            // InternalMyDsl.g:1093:4: (lv_mult_3_0= ruleNum )
            // InternalMyDsl.g:1094:5: lv_mult_3_0= ruleNum
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
    // InternalMyDsl.g:1115:1: entryRuleSuccessBasic returns [EObject current=null] : iv_ruleSuccessBasic= ruleSuccessBasic EOF ;
    public final EObject entryRuleSuccessBasic() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSuccessBasic = null;


        try {
            // InternalMyDsl.g:1115:53: (iv_ruleSuccessBasic= ruleSuccessBasic EOF )
            // InternalMyDsl.g:1116:2: iv_ruleSuccessBasic= ruleSuccessBasic EOF
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
    // InternalMyDsl.g:1122:1: ruleSuccessBasic returns [EObject current=null] : (otherlv_0= 'sukces' (otherlv_1= 'sukces' | ( (lv_num_2_0= ruleNum ) ) ) ) ;
    public final EObject ruleSuccessBasic() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        EObject lv_num_2_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:1128:2: ( (otherlv_0= 'sukces' (otherlv_1= 'sukces' | ( (lv_num_2_0= ruleNum ) ) ) ) )
            // InternalMyDsl.g:1129:2: (otherlv_0= 'sukces' (otherlv_1= 'sukces' | ( (lv_num_2_0= ruleNum ) ) ) )
            {
            // InternalMyDsl.g:1129:2: (otherlv_0= 'sukces' (otherlv_1= 'sukces' | ( (lv_num_2_0= ruleNum ) ) ) )
            // InternalMyDsl.g:1130:3: otherlv_0= 'sukces' (otherlv_1= 'sukces' | ( (lv_num_2_0= ruleNum ) ) )
            {
            otherlv_0=(Token)match(input,29,FOLLOW_18); 

            			newLeafNode(otherlv_0, grammarAccess.getSuccessBasicAccess().getSukcesKeyword_0());
            		
            // InternalMyDsl.g:1134:3: (otherlv_1= 'sukces' | ( (lv_num_2_0= ruleNum ) ) )
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==29) ) {
                alt19=1;
            }
            else if ( (LA19_0==34) ) {
                alt19=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 19, 0, input);

                throw nvae;
            }
            switch (alt19) {
                case 1 :
                    // InternalMyDsl.g:1135:4: otherlv_1= 'sukces'
                    {
                    otherlv_1=(Token)match(input,29,FOLLOW_2); 

                    				newLeafNode(otherlv_1, grammarAccess.getSuccessBasicAccess().getSukcesKeyword_1_0());
                    			

                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:1140:4: ( (lv_num_2_0= ruleNum ) )
                    {
                    // InternalMyDsl.g:1140:4: ( (lv_num_2_0= ruleNum ) )
                    // InternalMyDsl.g:1141:5: (lv_num_2_0= ruleNum )
                    {
                    // InternalMyDsl.g:1141:5: (lv_num_2_0= ruleNum )
                    // InternalMyDsl.g:1142:6: lv_num_2_0= ruleNum
                    {

                    						newCompositeNode(grammarAccess.getSuccessBasicAccess().getNumNumParserRuleCall_1_1_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_num_2_0=ruleNum();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getSuccessBasicRule());
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
    // InternalMyDsl.g:1164:1: entryRuleDiceMarkSuk returns [EObject current=null] : iv_ruleDiceMarkSuk= ruleDiceMarkSuk EOF ;
    public final EObject entryRuleDiceMarkSuk() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDiceMarkSuk = null;


        try {
            // InternalMyDsl.g:1164:52: (iv_ruleDiceMarkSuk= ruleDiceMarkSuk EOF )
            // InternalMyDsl.g:1165:2: iv_ruleDiceMarkSuk= ruleDiceMarkSuk EOF
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
    // InternalMyDsl.g:1171:1: ruleDiceMarkSuk returns [EObject current=null] : (otherlv_0= 'oznacz' ( (lv_mark_1_0= ruleMark ) ) ) ;
    public final EObject ruleDiceMarkSuk() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_mark_1_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:1177:2: ( (otherlv_0= 'oznacz' ( (lv_mark_1_0= ruleMark ) ) ) )
            // InternalMyDsl.g:1178:2: (otherlv_0= 'oznacz' ( (lv_mark_1_0= ruleMark ) ) )
            {
            // InternalMyDsl.g:1178:2: (otherlv_0= 'oznacz' ( (lv_mark_1_0= ruleMark ) ) )
            // InternalMyDsl.g:1179:3: otherlv_0= 'oznacz' ( (lv_mark_1_0= ruleMark ) )
            {
            otherlv_0=(Token)match(input,26,FOLLOW_15); 

            			newLeafNode(otherlv_0, grammarAccess.getDiceMarkSukAccess().getOznaczKeyword_0());
            		
            // InternalMyDsl.g:1183:3: ( (lv_mark_1_0= ruleMark ) )
            // InternalMyDsl.g:1184:4: (lv_mark_1_0= ruleMark )
            {
            // InternalMyDsl.g:1184:4: (lv_mark_1_0= ruleMark )
            // InternalMyDsl.g:1185:5: lv_mark_1_0= ruleMark
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
    // InternalMyDsl.g:1206:1: entryRuleDiceDiscSuk returns [EObject current=null] : iv_ruleDiceDiscSuk= ruleDiceDiscSuk EOF ;
    public final EObject entryRuleDiceDiscSuk() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDiceDiscSuk = null;


        try {
            // InternalMyDsl.g:1206:52: (iv_ruleDiceDiscSuk= ruleDiceDiscSuk EOF )
            // InternalMyDsl.g:1207:2: iv_ruleDiceDiscSuk= ruleDiceDiscSuk EOF
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
    // InternalMyDsl.g:1213:1: ruleDiceDiscSuk returns [EObject current=null] : (otherlv_0= 'odrzuc' ( (lv_discard_1_0= ruleDiscard ) ) ) ;
    public final EObject ruleDiceDiscSuk() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_discard_1_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:1219:2: ( (otherlv_0= 'odrzuc' ( (lv_discard_1_0= ruleDiscard ) ) ) )
            // InternalMyDsl.g:1220:2: (otherlv_0= 'odrzuc' ( (lv_discard_1_0= ruleDiscard ) ) )
            {
            // InternalMyDsl.g:1220:2: (otherlv_0= 'odrzuc' ( (lv_discard_1_0= ruleDiscard ) ) )
            // InternalMyDsl.g:1221:3: otherlv_0= 'odrzuc' ( (lv_discard_1_0= ruleDiscard ) )
            {
            otherlv_0=(Token)match(input,27,FOLLOW_15); 

            			newLeafNode(otherlv_0, grammarAccess.getDiceDiscSukAccess().getOdrzucKeyword_0());
            		
            // InternalMyDsl.g:1225:3: ( (lv_discard_1_0= ruleDiscard ) )
            // InternalMyDsl.g:1226:4: (lv_discard_1_0= ruleDiscard )
            {
            // InternalMyDsl.g:1226:4: (lv_discard_1_0= ruleDiscard )
            // InternalMyDsl.g:1227:5: lv_discard_1_0= ruleDiscard
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
    // InternalMyDsl.g:1248:1: entryRuleDiceRerollSuk returns [EObject current=null] : iv_ruleDiceRerollSuk= ruleDiceRerollSuk EOF ;
    public final EObject entryRuleDiceRerollSuk() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDiceRerollSuk = null;


        try {
            // InternalMyDsl.g:1248:54: (iv_ruleDiceRerollSuk= ruleDiceRerollSuk EOF )
            // InternalMyDsl.g:1249:2: iv_ruleDiceRerollSuk= ruleDiceRerollSuk EOF
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
    // InternalMyDsl.g:1255:1: ruleDiceRerollSuk returns [EObject current=null] : (otherlv_0= 'przerzuc' ( (lv_reroll_1_0= ruleReroll ) ) ) ;
    public final EObject ruleDiceRerollSuk() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_reroll_1_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:1261:2: ( (otherlv_0= 'przerzuc' ( (lv_reroll_1_0= ruleReroll ) ) ) )
            // InternalMyDsl.g:1262:2: (otherlv_0= 'przerzuc' ( (lv_reroll_1_0= ruleReroll ) ) )
            {
            // InternalMyDsl.g:1262:2: (otherlv_0= 'przerzuc' ( (lv_reroll_1_0= ruleReroll ) ) )
            // InternalMyDsl.g:1263:3: otherlv_0= 'przerzuc' ( (lv_reroll_1_0= ruleReroll ) )
            {
            otherlv_0=(Token)match(input,28,FOLLOW_15); 

            			newLeafNode(otherlv_0, grammarAccess.getDiceRerollSukAccess().getPrzerzucKeyword_0());
            		
            // InternalMyDsl.g:1267:3: ( (lv_reroll_1_0= ruleReroll ) )
            // InternalMyDsl.g:1268:4: (lv_reroll_1_0= ruleReroll )
            {
            // InternalMyDsl.g:1268:4: (lv_reroll_1_0= ruleReroll )
            // InternalMyDsl.g:1269:5: lv_reroll_1_0= ruleReroll
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


    // $ANTLR start "entryRuleRuleSuk"
    // InternalMyDsl.g:1290:1: entryRuleRuleSuk returns [EObject current=null] : iv_ruleRuleSuk= ruleRuleSuk EOF ;
    public final EObject entryRuleRuleSuk() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRuleSuk = null;


        try {
            // InternalMyDsl.g:1290:48: (iv_ruleRuleSuk= ruleRuleSuk EOF )
            // InternalMyDsl.g:1291:2: iv_ruleRuleSuk= ruleRuleSuk EOF
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
    // InternalMyDsl.g:1297:1: ruleRuleSuk returns [EObject current=null] : (this_SuccessThreshold_0= ruleSuccessThreshold | this_SuccessMultiplier_1= ruleSuccessMultiplier | this_SuccessBasic_2= ruleSuccessBasic | this_DiceMarkSuk_3= ruleDiceMarkSuk | this_DiceDiscSuk_4= ruleDiceDiscSuk | this_DiceRerollSuk_5= ruleDiceRerollSuk ) ;
    public final EObject ruleRuleSuk() throws RecognitionException {
        EObject current = null;

        EObject this_SuccessThreshold_0 = null;

        EObject this_SuccessMultiplier_1 = null;

        EObject this_SuccessBasic_2 = null;

        EObject this_DiceMarkSuk_3 = null;

        EObject this_DiceDiscSuk_4 = null;

        EObject this_DiceRerollSuk_5 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:1303:2: ( (this_SuccessThreshold_0= ruleSuccessThreshold | this_SuccessMultiplier_1= ruleSuccessMultiplier | this_SuccessBasic_2= ruleSuccessBasic | this_DiceMarkSuk_3= ruleDiceMarkSuk | this_DiceDiscSuk_4= ruleDiceDiscSuk | this_DiceRerollSuk_5= ruleDiceRerollSuk ) )
            // InternalMyDsl.g:1304:2: (this_SuccessThreshold_0= ruleSuccessThreshold | this_SuccessMultiplier_1= ruleSuccessMultiplier | this_SuccessBasic_2= ruleSuccessBasic | this_DiceMarkSuk_3= ruleDiceMarkSuk | this_DiceDiscSuk_4= ruleDiceDiscSuk | this_DiceRerollSuk_5= ruleDiceRerollSuk )
            {
            // InternalMyDsl.g:1304:2: (this_SuccessThreshold_0= ruleSuccessThreshold | this_SuccessMultiplier_1= ruleSuccessMultiplier | this_SuccessBasic_2= ruleSuccessBasic | this_DiceMarkSuk_3= ruleDiceMarkSuk | this_DiceDiscSuk_4= ruleDiceDiscSuk | this_DiceRerollSuk_5= ruleDiceRerollSuk )
            int alt20=6;
            alt20 = dfa20.predict(input);
            switch (alt20) {
                case 1 :
                    // InternalMyDsl.g:1305:3: this_SuccessThreshold_0= ruleSuccessThreshold
                    {

                    			newCompositeNode(grammarAccess.getRuleSukAccess().getSuccessThresholdParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_SuccessThreshold_0=ruleSuccessThreshold();

                    state._fsp--;


                    			current = this_SuccessThreshold_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:1314:3: this_SuccessMultiplier_1= ruleSuccessMultiplier
                    {

                    			newCompositeNode(grammarAccess.getRuleSukAccess().getSuccessMultiplierParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_SuccessMultiplier_1=ruleSuccessMultiplier();

                    state._fsp--;


                    			current = this_SuccessMultiplier_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:1323:3: this_SuccessBasic_2= ruleSuccessBasic
                    {

                    			newCompositeNode(grammarAccess.getRuleSukAccess().getSuccessBasicParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_SuccessBasic_2=ruleSuccessBasic();

                    state._fsp--;


                    			current = this_SuccessBasic_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalMyDsl.g:1332:3: this_DiceMarkSuk_3= ruleDiceMarkSuk
                    {

                    			newCompositeNode(grammarAccess.getRuleSukAccess().getDiceMarkSukParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_DiceMarkSuk_3=ruleDiceMarkSuk();

                    state._fsp--;


                    			current = this_DiceMarkSuk_3;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 5 :
                    // InternalMyDsl.g:1341:3: this_DiceDiscSuk_4= ruleDiceDiscSuk
                    {

                    			newCompositeNode(grammarAccess.getRuleSukAccess().getDiceDiscSukParserRuleCall_4());
                    		
                    pushFollow(FOLLOW_2);
                    this_DiceDiscSuk_4=ruleDiceDiscSuk();

                    state._fsp--;


                    			current = this_DiceDiscSuk_4;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 6 :
                    // InternalMyDsl.g:1350:3: this_DiceRerollSuk_5= ruleDiceRerollSuk
                    {

                    			newCompositeNode(grammarAccess.getRuleSukAccess().getDiceRerollSukParserRuleCall_5());
                    		
                    pushFollow(FOLLOW_2);
                    this_DiceRerollSuk_5=ruleDiceRerollSuk();

                    state._fsp--;


                    			current = this_DiceRerollSuk_5;
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


    // $ANTLR start "entryRuleMarkThreshold"
    // InternalMyDsl.g:1362:1: entryRuleMarkThreshold returns [EObject current=null] : iv_ruleMarkThreshold= ruleMarkThreshold EOF ;
    public final EObject entryRuleMarkThreshold() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMarkThreshold = null;


        try {
            // InternalMyDsl.g:1362:54: (iv_ruleMarkThreshold= ruleMarkThreshold EOF )
            // InternalMyDsl.g:1363:2: iv_ruleMarkThreshold= ruleMarkThreshold EOF
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
    // InternalMyDsl.g:1369:1: ruleMarkThreshold returns [EObject current=null] : ( (otherlv_0= 'wiecej niz' | otherlv_1= 'mniej niz' ) ( (lv_num_2_0= ruleNum ) ) ) ;
    public final EObject ruleMarkThreshold() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        EObject lv_num_2_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:1375:2: ( ( (otherlv_0= 'wiecej niz' | otherlv_1= 'mniej niz' ) ( (lv_num_2_0= ruleNum ) ) ) )
            // InternalMyDsl.g:1376:2: ( (otherlv_0= 'wiecej niz' | otherlv_1= 'mniej niz' ) ( (lv_num_2_0= ruleNum ) ) )
            {
            // InternalMyDsl.g:1376:2: ( (otherlv_0= 'wiecej niz' | otherlv_1= 'mniej niz' ) ( (lv_num_2_0= ruleNum ) ) )
            // InternalMyDsl.g:1377:3: (otherlv_0= 'wiecej niz' | otherlv_1= 'mniej niz' ) ( (lv_num_2_0= ruleNum ) )
            {
            // InternalMyDsl.g:1377:3: (otherlv_0= 'wiecej niz' | otherlv_1= 'mniej niz' )
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==30) ) {
                alt21=1;
            }
            else if ( (LA21_0==31) ) {
                alt21=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 21, 0, input);

                throw nvae;
            }
            switch (alt21) {
                case 1 :
                    // InternalMyDsl.g:1378:4: otherlv_0= 'wiecej niz'
                    {
                    otherlv_0=(Token)match(input,30,FOLLOW_9); 

                    				newLeafNode(otherlv_0, grammarAccess.getMarkThresholdAccess().getWiecejNizKeyword_0_0());
                    			

                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:1383:4: otherlv_1= 'mniej niz'
                    {
                    otherlv_1=(Token)match(input,31,FOLLOW_9); 

                    				newLeafNode(otherlv_1, grammarAccess.getMarkThresholdAccess().getMniejNizKeyword_0_1());
                    			

                    }
                    break;

            }

            // InternalMyDsl.g:1388:3: ( (lv_num_2_0= ruleNum ) )
            // InternalMyDsl.g:1389:4: (lv_num_2_0= ruleNum )
            {
            // InternalMyDsl.g:1389:4: (lv_num_2_0= ruleNum )
            // InternalMyDsl.g:1390:5: lv_num_2_0= ruleNum
            {

            					newCompositeNode(grammarAccess.getMarkThresholdAccess().getNumNumParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_2);
            lv_num_2_0=ruleNum();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getMarkThresholdRule());
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
    // $ANTLR end "ruleMarkThreshold"


    // $ANTLR start "entryRuleMarkHighest"
    // InternalMyDsl.g:1411:1: entryRuleMarkHighest returns [EObject current=null] : iv_ruleMarkHighest= ruleMarkHighest EOF ;
    public final EObject entryRuleMarkHighest() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMarkHighest = null;


        try {
            // InternalMyDsl.g:1411:52: (iv_ruleMarkHighest= ruleMarkHighest EOF )
            // InternalMyDsl.g:1412:2: iv_ruleMarkHighest= ruleMarkHighest EOF
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
    // InternalMyDsl.g:1418:1: ruleMarkHighest returns [EObject current=null] : (otherlv_0= 'najwyzsze' | otherlv_1= 'najnizsze' ) ;
    public final EObject ruleMarkHighest() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalMyDsl.g:1424:2: ( (otherlv_0= 'najwyzsze' | otherlv_1= 'najnizsze' ) )
            // InternalMyDsl.g:1425:2: (otherlv_0= 'najwyzsze' | otherlv_1= 'najnizsze' )
            {
            // InternalMyDsl.g:1425:2: (otherlv_0= 'najwyzsze' | otherlv_1= 'najnizsze' )
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==32) ) {
                alt22=1;
            }
            else if ( (LA22_0==33) ) {
                alt22=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 22, 0, input);

                throw nvae;
            }
            switch (alt22) {
                case 1 :
                    // InternalMyDsl.g:1426:3: otherlv_0= 'najwyzsze'
                    {
                    otherlv_0=(Token)match(input,32,FOLLOW_2); 

                    			newLeafNode(otherlv_0, grammarAccess.getMarkHighestAccess().getNajwyzszeKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:1431:3: otherlv_1= 'najnizsze'
                    {
                    otherlv_1=(Token)match(input,33,FOLLOW_2); 

                    			newLeafNode(otherlv_1, grammarAccess.getMarkHighestAccess().getNajnizszeKeyword_1());
                    		

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
    // $ANTLR end "ruleMarkHighest"


    // $ANTLR start "entryRuleMarkPosition"
    // InternalMyDsl.g:1439:1: entryRuleMarkPosition returns [EObject current=null] : iv_ruleMarkPosition= ruleMarkPosition EOF ;
    public final EObject entryRuleMarkPosition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMarkPosition = null;


        try {
            // InternalMyDsl.g:1439:53: (iv_ruleMarkPosition= ruleMarkPosition EOF )
            // InternalMyDsl.g:1440:2: iv_ruleMarkPosition= ruleMarkPosition EOF
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
    // InternalMyDsl.g:1446:1: ruleMarkPosition returns [EObject current=null] : ( ( (lv_firstlast_0_0= ruleFirstLast ) ) ( (lv_num_1_0= ruleNum ) ) ) ;
    public final EObject ruleMarkPosition() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_firstlast_0_0 = null;

        EObject lv_num_1_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:1452:2: ( ( ( (lv_firstlast_0_0= ruleFirstLast ) ) ( (lv_num_1_0= ruleNum ) ) ) )
            // InternalMyDsl.g:1453:2: ( ( (lv_firstlast_0_0= ruleFirstLast ) ) ( (lv_num_1_0= ruleNum ) ) )
            {
            // InternalMyDsl.g:1453:2: ( ( (lv_firstlast_0_0= ruleFirstLast ) ) ( (lv_num_1_0= ruleNum ) ) )
            // InternalMyDsl.g:1454:3: ( (lv_firstlast_0_0= ruleFirstLast ) ) ( (lv_num_1_0= ruleNum ) )
            {
            // InternalMyDsl.g:1454:3: ( (lv_firstlast_0_0= ruleFirstLast ) )
            // InternalMyDsl.g:1455:4: (lv_firstlast_0_0= ruleFirstLast )
            {
            // InternalMyDsl.g:1455:4: (lv_firstlast_0_0= ruleFirstLast )
            // InternalMyDsl.g:1456:5: lv_firstlast_0_0= ruleFirstLast
            {

            					newCompositeNode(grammarAccess.getMarkPositionAccess().getFirstlastFirstLastParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_9);
            lv_firstlast_0_0=ruleFirstLast();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getMarkPositionRule());
            					}
            					set(
            						current,
            						"firstlast",
            						lv_firstlast_0_0,
            						"org.xtext.example.mydsl.MyDsl.FirstLast");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalMyDsl.g:1473:3: ( (lv_num_1_0= ruleNum ) )
            // InternalMyDsl.g:1474:4: (lv_num_1_0= ruleNum )
            {
            // InternalMyDsl.g:1474:4: (lv_num_1_0= ruleNum )
            // InternalMyDsl.g:1475:5: lv_num_1_0= ruleNum
            {

            					newCompositeNode(grammarAccess.getMarkPositionAccess().getNumNumParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_2);
            lv_num_1_0=ruleNum();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getMarkPositionRule());
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
    // $ANTLR end "ruleMarkPosition"


    // $ANTLR start "entryRuleMarkValue"
    // InternalMyDsl.g:1496:1: entryRuleMarkValue returns [EObject current=null] : iv_ruleMarkValue= ruleMarkValue EOF ;
    public final EObject entryRuleMarkValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMarkValue = null;


        try {
            // InternalMyDsl.g:1496:50: (iv_ruleMarkValue= ruleMarkValue EOF )
            // InternalMyDsl.g:1497:2: iv_ruleMarkValue= ruleMarkValue EOF
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
    // InternalMyDsl.g:1503:1: ruleMarkValue returns [EObject current=null] : ( (lv_num_0_0= ruleNum ) ) ;
    public final EObject ruleMarkValue() throws RecognitionException {
        EObject current = null;

        EObject lv_num_0_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:1509:2: ( ( (lv_num_0_0= ruleNum ) ) )
            // InternalMyDsl.g:1510:2: ( (lv_num_0_0= ruleNum ) )
            {
            // InternalMyDsl.g:1510:2: ( (lv_num_0_0= ruleNum ) )
            // InternalMyDsl.g:1511:3: (lv_num_0_0= ruleNum )
            {
            // InternalMyDsl.g:1511:3: (lv_num_0_0= ruleNum )
            // InternalMyDsl.g:1512:4: lv_num_0_0= ruleNum
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


    // $ANTLR start "entryRuleMark"
    // InternalMyDsl.g:1532:1: entryRuleMark returns [EObject current=null] : iv_ruleMark= ruleMark EOF ;
    public final EObject entryRuleMark() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMark = null;


        try {
            // InternalMyDsl.g:1532:45: (iv_ruleMark= ruleMark EOF )
            // InternalMyDsl.g:1533:2: iv_ruleMark= ruleMark EOF
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
    // InternalMyDsl.g:1539:1: ruleMark returns [EObject current=null] : (this_MarkThreshold_0= ruleMarkThreshold | this_MarkHighest_1= ruleMarkHighest | this_MarkPosition_2= ruleMarkPosition | this_MarkValue_3= ruleMarkValue ) ;
    public final EObject ruleMark() throws RecognitionException {
        EObject current = null;

        EObject this_MarkThreshold_0 = null;

        EObject this_MarkHighest_1 = null;

        EObject this_MarkPosition_2 = null;

        EObject this_MarkValue_3 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:1545:2: ( (this_MarkThreshold_0= ruleMarkThreshold | this_MarkHighest_1= ruleMarkHighest | this_MarkPosition_2= ruleMarkPosition | this_MarkValue_3= ruleMarkValue ) )
            // InternalMyDsl.g:1546:2: (this_MarkThreshold_0= ruleMarkThreshold | this_MarkHighest_1= ruleMarkHighest | this_MarkPosition_2= ruleMarkPosition | this_MarkValue_3= ruleMarkValue )
            {
            // InternalMyDsl.g:1546:2: (this_MarkThreshold_0= ruleMarkThreshold | this_MarkHighest_1= ruleMarkHighest | this_MarkPosition_2= ruleMarkPosition | this_MarkValue_3= ruleMarkValue )
            int alt23=4;
            switch ( input.LA(1) ) {
            case 30:
            case 31:
                {
                alt23=1;
                }
                break;
            case 32:
            case 33:
                {
                alt23=2;
                }
                break;
            case 38:
            case 39:
                {
                alt23=3;
                }
                break;
            case 34:
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
                    // InternalMyDsl.g:1547:3: this_MarkThreshold_0= ruleMarkThreshold
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
                    // InternalMyDsl.g:1556:3: this_MarkHighest_1= ruleMarkHighest
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
                    // InternalMyDsl.g:1565:3: this_MarkPosition_2= ruleMarkPosition
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
                    // InternalMyDsl.g:1574:3: this_MarkValue_3= ruleMarkValue
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


    // $ANTLR start "entryRuleDiscardThreshold"
    // InternalMyDsl.g:1586:1: entryRuleDiscardThreshold returns [EObject current=null] : iv_ruleDiscardThreshold= ruleDiscardThreshold EOF ;
    public final EObject entryRuleDiscardThreshold() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDiscardThreshold = null;


        try {
            // InternalMyDsl.g:1586:57: (iv_ruleDiscardThreshold= ruleDiscardThreshold EOF )
            // InternalMyDsl.g:1587:2: iv_ruleDiscardThreshold= ruleDiscardThreshold EOF
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
    // InternalMyDsl.g:1593:1: ruleDiscardThreshold returns [EObject current=null] : ( (otherlv_0= 'wiecej niz' | otherlv_1= 'mniej niz' ) ( (lv_num_2_0= ruleNum ) ) ) ;
    public final EObject ruleDiscardThreshold() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        EObject lv_num_2_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:1599:2: ( ( (otherlv_0= 'wiecej niz' | otherlv_1= 'mniej niz' ) ( (lv_num_2_0= ruleNum ) ) ) )
            // InternalMyDsl.g:1600:2: ( (otherlv_0= 'wiecej niz' | otherlv_1= 'mniej niz' ) ( (lv_num_2_0= ruleNum ) ) )
            {
            // InternalMyDsl.g:1600:2: ( (otherlv_0= 'wiecej niz' | otherlv_1= 'mniej niz' ) ( (lv_num_2_0= ruleNum ) ) )
            // InternalMyDsl.g:1601:3: (otherlv_0= 'wiecej niz' | otherlv_1= 'mniej niz' ) ( (lv_num_2_0= ruleNum ) )
            {
            // InternalMyDsl.g:1601:3: (otherlv_0= 'wiecej niz' | otherlv_1= 'mniej niz' )
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==30) ) {
                alt24=1;
            }
            else if ( (LA24_0==31) ) {
                alt24=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 24, 0, input);

                throw nvae;
            }
            switch (alt24) {
                case 1 :
                    // InternalMyDsl.g:1602:4: otherlv_0= 'wiecej niz'
                    {
                    otherlv_0=(Token)match(input,30,FOLLOW_9); 

                    				newLeafNode(otherlv_0, grammarAccess.getDiscardThresholdAccess().getWiecejNizKeyword_0_0());
                    			

                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:1607:4: otherlv_1= 'mniej niz'
                    {
                    otherlv_1=(Token)match(input,31,FOLLOW_9); 

                    				newLeafNode(otherlv_1, grammarAccess.getDiscardThresholdAccess().getMniejNizKeyword_0_1());
                    			

                    }
                    break;

            }

            // InternalMyDsl.g:1612:3: ( (lv_num_2_0= ruleNum ) )
            // InternalMyDsl.g:1613:4: (lv_num_2_0= ruleNum )
            {
            // InternalMyDsl.g:1613:4: (lv_num_2_0= ruleNum )
            // InternalMyDsl.g:1614:5: lv_num_2_0= ruleNum
            {

            					newCompositeNode(grammarAccess.getDiscardThresholdAccess().getNumNumParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_2);
            lv_num_2_0=ruleNum();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getDiscardThresholdRule());
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
    // $ANTLR end "ruleDiscardThreshold"


    // $ANTLR start "entryRuleDiscardHighest"
    // InternalMyDsl.g:1635:1: entryRuleDiscardHighest returns [EObject current=null] : iv_ruleDiscardHighest= ruleDiscardHighest EOF ;
    public final EObject entryRuleDiscardHighest() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDiscardHighest = null;


        try {
            // InternalMyDsl.g:1635:55: (iv_ruleDiscardHighest= ruleDiscardHighest EOF )
            // InternalMyDsl.g:1636:2: iv_ruleDiscardHighest= ruleDiscardHighest EOF
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
    // InternalMyDsl.g:1642:1: ruleDiscardHighest returns [EObject current=null] : (otherlv_0= 'najwyzsze' | otherlv_1= 'najnizsze' ) ;
    public final EObject ruleDiscardHighest() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalMyDsl.g:1648:2: ( (otherlv_0= 'najwyzsze' | otherlv_1= 'najnizsze' ) )
            // InternalMyDsl.g:1649:2: (otherlv_0= 'najwyzsze' | otherlv_1= 'najnizsze' )
            {
            // InternalMyDsl.g:1649:2: (otherlv_0= 'najwyzsze' | otherlv_1= 'najnizsze' )
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==32) ) {
                alt25=1;
            }
            else if ( (LA25_0==33) ) {
                alt25=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 25, 0, input);

                throw nvae;
            }
            switch (alt25) {
                case 1 :
                    // InternalMyDsl.g:1650:3: otherlv_0= 'najwyzsze'
                    {
                    otherlv_0=(Token)match(input,32,FOLLOW_2); 

                    			newLeafNode(otherlv_0, grammarAccess.getDiscardHighestAccess().getNajwyzszeKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:1655:3: otherlv_1= 'najnizsze'
                    {
                    otherlv_1=(Token)match(input,33,FOLLOW_2); 

                    			newLeafNode(otherlv_1, grammarAccess.getDiscardHighestAccess().getNajnizszeKeyword_1());
                    		

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
    // $ANTLR end "ruleDiscardHighest"


    // $ANTLR start "entryRuleDiscardPosition"
    // InternalMyDsl.g:1663:1: entryRuleDiscardPosition returns [EObject current=null] : iv_ruleDiscardPosition= ruleDiscardPosition EOF ;
    public final EObject entryRuleDiscardPosition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDiscardPosition = null;


        try {
            // InternalMyDsl.g:1663:56: (iv_ruleDiscardPosition= ruleDiscardPosition EOF )
            // InternalMyDsl.g:1664:2: iv_ruleDiscardPosition= ruleDiscardPosition EOF
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
    // InternalMyDsl.g:1670:1: ruleDiscardPosition returns [EObject current=null] : ( ( (lv_firstlast_0_0= ruleFirstLast ) ) ( (lv_num_1_0= ruleNum ) ) ) ;
    public final EObject ruleDiscardPosition() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_firstlast_0_0 = null;

        EObject lv_num_1_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:1676:2: ( ( ( (lv_firstlast_0_0= ruleFirstLast ) ) ( (lv_num_1_0= ruleNum ) ) ) )
            // InternalMyDsl.g:1677:2: ( ( (lv_firstlast_0_0= ruleFirstLast ) ) ( (lv_num_1_0= ruleNum ) ) )
            {
            // InternalMyDsl.g:1677:2: ( ( (lv_firstlast_0_0= ruleFirstLast ) ) ( (lv_num_1_0= ruleNum ) ) )
            // InternalMyDsl.g:1678:3: ( (lv_firstlast_0_0= ruleFirstLast ) ) ( (lv_num_1_0= ruleNum ) )
            {
            // InternalMyDsl.g:1678:3: ( (lv_firstlast_0_0= ruleFirstLast ) )
            // InternalMyDsl.g:1679:4: (lv_firstlast_0_0= ruleFirstLast )
            {
            // InternalMyDsl.g:1679:4: (lv_firstlast_0_0= ruleFirstLast )
            // InternalMyDsl.g:1680:5: lv_firstlast_0_0= ruleFirstLast
            {

            					newCompositeNode(grammarAccess.getDiscardPositionAccess().getFirstlastFirstLastParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_9);
            lv_firstlast_0_0=ruleFirstLast();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getDiscardPositionRule());
            					}
            					set(
            						current,
            						"firstlast",
            						lv_firstlast_0_0,
            						"org.xtext.example.mydsl.MyDsl.FirstLast");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalMyDsl.g:1697:3: ( (lv_num_1_0= ruleNum ) )
            // InternalMyDsl.g:1698:4: (lv_num_1_0= ruleNum )
            {
            // InternalMyDsl.g:1698:4: (lv_num_1_0= ruleNum )
            // InternalMyDsl.g:1699:5: lv_num_1_0= ruleNum
            {

            					newCompositeNode(grammarAccess.getDiscardPositionAccess().getNumNumParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_2);
            lv_num_1_0=ruleNum();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getDiscardPositionRule());
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
    // $ANTLR end "ruleDiscardPosition"


    // $ANTLR start "entryRuleDiscardValue"
    // InternalMyDsl.g:1720:1: entryRuleDiscardValue returns [EObject current=null] : iv_ruleDiscardValue= ruleDiscardValue EOF ;
    public final EObject entryRuleDiscardValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDiscardValue = null;


        try {
            // InternalMyDsl.g:1720:53: (iv_ruleDiscardValue= ruleDiscardValue EOF )
            // InternalMyDsl.g:1721:2: iv_ruleDiscardValue= ruleDiscardValue EOF
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
    // InternalMyDsl.g:1727:1: ruleDiscardValue returns [EObject current=null] : ( (lv_num_0_0= ruleNum ) ) ;
    public final EObject ruleDiscardValue() throws RecognitionException {
        EObject current = null;

        EObject lv_num_0_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:1733:2: ( ( (lv_num_0_0= ruleNum ) ) )
            // InternalMyDsl.g:1734:2: ( (lv_num_0_0= ruleNum ) )
            {
            // InternalMyDsl.g:1734:2: ( (lv_num_0_0= ruleNum ) )
            // InternalMyDsl.g:1735:3: (lv_num_0_0= ruleNum )
            {
            // InternalMyDsl.g:1735:3: (lv_num_0_0= ruleNum )
            // InternalMyDsl.g:1736:4: lv_num_0_0= ruleNum
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


    // $ANTLR start "entryRuleDiscard"
    // InternalMyDsl.g:1756:1: entryRuleDiscard returns [EObject current=null] : iv_ruleDiscard= ruleDiscard EOF ;
    public final EObject entryRuleDiscard() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDiscard = null;


        try {
            // InternalMyDsl.g:1756:48: (iv_ruleDiscard= ruleDiscard EOF )
            // InternalMyDsl.g:1757:2: iv_ruleDiscard= ruleDiscard EOF
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
    // InternalMyDsl.g:1763:1: ruleDiscard returns [EObject current=null] : (this_DiscardThreshold_0= ruleDiscardThreshold | this_DiscardHighest_1= ruleDiscardHighest | this_DiscardPosition_2= ruleDiscardPosition | this_DiscardValue_3= ruleDiscardValue ) ;
    public final EObject ruleDiscard() throws RecognitionException {
        EObject current = null;

        EObject this_DiscardThreshold_0 = null;

        EObject this_DiscardHighest_1 = null;

        EObject this_DiscardPosition_2 = null;

        EObject this_DiscardValue_3 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:1769:2: ( (this_DiscardThreshold_0= ruleDiscardThreshold | this_DiscardHighest_1= ruleDiscardHighest | this_DiscardPosition_2= ruleDiscardPosition | this_DiscardValue_3= ruleDiscardValue ) )
            // InternalMyDsl.g:1770:2: (this_DiscardThreshold_0= ruleDiscardThreshold | this_DiscardHighest_1= ruleDiscardHighest | this_DiscardPosition_2= ruleDiscardPosition | this_DiscardValue_3= ruleDiscardValue )
            {
            // InternalMyDsl.g:1770:2: (this_DiscardThreshold_0= ruleDiscardThreshold | this_DiscardHighest_1= ruleDiscardHighest | this_DiscardPosition_2= ruleDiscardPosition | this_DiscardValue_3= ruleDiscardValue )
            int alt26=4;
            switch ( input.LA(1) ) {
            case 30:
            case 31:
                {
                alt26=1;
                }
                break;
            case 32:
            case 33:
                {
                alt26=2;
                }
                break;
            case 38:
            case 39:
                {
                alt26=3;
                }
                break;
            case 34:
                {
                alt26=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 26, 0, input);

                throw nvae;
            }

            switch (alt26) {
                case 1 :
                    // InternalMyDsl.g:1771:3: this_DiscardThreshold_0= ruleDiscardThreshold
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
                    // InternalMyDsl.g:1780:3: this_DiscardHighest_1= ruleDiscardHighest
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
                    // InternalMyDsl.g:1789:3: this_DiscardPosition_2= ruleDiscardPosition
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
                    // InternalMyDsl.g:1798:3: this_DiscardValue_3= ruleDiscardValue
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


    // $ANTLR start "entryRuleRerollThreshold"
    // InternalMyDsl.g:1810:1: entryRuleRerollThreshold returns [EObject current=null] : iv_ruleRerollThreshold= ruleRerollThreshold EOF ;
    public final EObject entryRuleRerollThreshold() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRerollThreshold = null;


        try {
            // InternalMyDsl.g:1810:56: (iv_ruleRerollThreshold= ruleRerollThreshold EOF )
            // InternalMyDsl.g:1811:2: iv_ruleRerollThreshold= ruleRerollThreshold EOF
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
    // InternalMyDsl.g:1817:1: ruleRerollThreshold returns [EObject current=null] : ( (otherlv_0= 'wiecej niz' | otherlv_1= 'mniej niz' ) ( (lv_num_2_0= ruleNum ) ) ) ;
    public final EObject ruleRerollThreshold() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        EObject lv_num_2_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:1823:2: ( ( (otherlv_0= 'wiecej niz' | otherlv_1= 'mniej niz' ) ( (lv_num_2_0= ruleNum ) ) ) )
            // InternalMyDsl.g:1824:2: ( (otherlv_0= 'wiecej niz' | otherlv_1= 'mniej niz' ) ( (lv_num_2_0= ruleNum ) ) )
            {
            // InternalMyDsl.g:1824:2: ( (otherlv_0= 'wiecej niz' | otherlv_1= 'mniej niz' ) ( (lv_num_2_0= ruleNum ) ) )
            // InternalMyDsl.g:1825:3: (otherlv_0= 'wiecej niz' | otherlv_1= 'mniej niz' ) ( (lv_num_2_0= ruleNum ) )
            {
            // InternalMyDsl.g:1825:3: (otherlv_0= 'wiecej niz' | otherlv_1= 'mniej niz' )
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==30) ) {
                alt27=1;
            }
            else if ( (LA27_0==31) ) {
                alt27=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 27, 0, input);

                throw nvae;
            }
            switch (alt27) {
                case 1 :
                    // InternalMyDsl.g:1826:4: otherlv_0= 'wiecej niz'
                    {
                    otherlv_0=(Token)match(input,30,FOLLOW_9); 

                    				newLeafNode(otherlv_0, grammarAccess.getRerollThresholdAccess().getWiecejNizKeyword_0_0());
                    			

                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:1831:4: otherlv_1= 'mniej niz'
                    {
                    otherlv_1=(Token)match(input,31,FOLLOW_9); 

                    				newLeafNode(otherlv_1, grammarAccess.getRerollThresholdAccess().getMniejNizKeyword_0_1());
                    			

                    }
                    break;

            }

            // InternalMyDsl.g:1836:3: ( (lv_num_2_0= ruleNum ) )
            // InternalMyDsl.g:1837:4: (lv_num_2_0= ruleNum )
            {
            // InternalMyDsl.g:1837:4: (lv_num_2_0= ruleNum )
            // InternalMyDsl.g:1838:5: lv_num_2_0= ruleNum
            {

            					newCompositeNode(grammarAccess.getRerollThresholdAccess().getNumNumParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_2);
            lv_num_2_0=ruleNum();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getRerollThresholdRule());
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
    // $ANTLR end "ruleRerollThreshold"


    // $ANTLR start "entryRuleRerollHighest"
    // InternalMyDsl.g:1859:1: entryRuleRerollHighest returns [EObject current=null] : iv_ruleRerollHighest= ruleRerollHighest EOF ;
    public final EObject entryRuleRerollHighest() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRerollHighest = null;


        try {
            // InternalMyDsl.g:1859:54: (iv_ruleRerollHighest= ruleRerollHighest EOF )
            // InternalMyDsl.g:1860:2: iv_ruleRerollHighest= ruleRerollHighest EOF
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
    // InternalMyDsl.g:1866:1: ruleRerollHighest returns [EObject current=null] : (otherlv_0= 'najwyzsze' | otherlv_1= 'najnizsze' ) ;
    public final EObject ruleRerollHighest() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalMyDsl.g:1872:2: ( (otherlv_0= 'najwyzsze' | otherlv_1= 'najnizsze' ) )
            // InternalMyDsl.g:1873:2: (otherlv_0= 'najwyzsze' | otherlv_1= 'najnizsze' )
            {
            // InternalMyDsl.g:1873:2: (otherlv_0= 'najwyzsze' | otherlv_1= 'najnizsze' )
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==32) ) {
                alt28=1;
            }
            else if ( (LA28_0==33) ) {
                alt28=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 28, 0, input);

                throw nvae;
            }
            switch (alt28) {
                case 1 :
                    // InternalMyDsl.g:1874:3: otherlv_0= 'najwyzsze'
                    {
                    otherlv_0=(Token)match(input,32,FOLLOW_2); 

                    			newLeafNode(otherlv_0, grammarAccess.getRerollHighestAccess().getNajwyzszeKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:1879:3: otherlv_1= 'najnizsze'
                    {
                    otherlv_1=(Token)match(input,33,FOLLOW_2); 

                    			newLeafNode(otherlv_1, grammarAccess.getRerollHighestAccess().getNajnizszeKeyword_1());
                    		

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
    // $ANTLR end "ruleRerollHighest"


    // $ANTLR start "entryRuleRerollPosition"
    // InternalMyDsl.g:1887:1: entryRuleRerollPosition returns [EObject current=null] : iv_ruleRerollPosition= ruleRerollPosition EOF ;
    public final EObject entryRuleRerollPosition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRerollPosition = null;


        try {
            // InternalMyDsl.g:1887:55: (iv_ruleRerollPosition= ruleRerollPosition EOF )
            // InternalMyDsl.g:1888:2: iv_ruleRerollPosition= ruleRerollPosition EOF
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
    // InternalMyDsl.g:1894:1: ruleRerollPosition returns [EObject current=null] : ( ( (lv_firstlast_0_0= ruleFirstLast ) ) ( (lv_num_1_0= ruleNum ) ) ) ;
    public final EObject ruleRerollPosition() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_firstlast_0_0 = null;

        EObject lv_num_1_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:1900:2: ( ( ( (lv_firstlast_0_0= ruleFirstLast ) ) ( (lv_num_1_0= ruleNum ) ) ) )
            // InternalMyDsl.g:1901:2: ( ( (lv_firstlast_0_0= ruleFirstLast ) ) ( (lv_num_1_0= ruleNum ) ) )
            {
            // InternalMyDsl.g:1901:2: ( ( (lv_firstlast_0_0= ruleFirstLast ) ) ( (lv_num_1_0= ruleNum ) ) )
            // InternalMyDsl.g:1902:3: ( (lv_firstlast_0_0= ruleFirstLast ) ) ( (lv_num_1_0= ruleNum ) )
            {
            // InternalMyDsl.g:1902:3: ( (lv_firstlast_0_0= ruleFirstLast ) )
            // InternalMyDsl.g:1903:4: (lv_firstlast_0_0= ruleFirstLast )
            {
            // InternalMyDsl.g:1903:4: (lv_firstlast_0_0= ruleFirstLast )
            // InternalMyDsl.g:1904:5: lv_firstlast_0_0= ruleFirstLast
            {

            					newCompositeNode(grammarAccess.getRerollPositionAccess().getFirstlastFirstLastParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_9);
            lv_firstlast_0_0=ruleFirstLast();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getRerollPositionRule());
            					}
            					set(
            						current,
            						"firstlast",
            						lv_firstlast_0_0,
            						"org.xtext.example.mydsl.MyDsl.FirstLast");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalMyDsl.g:1921:3: ( (lv_num_1_0= ruleNum ) )
            // InternalMyDsl.g:1922:4: (lv_num_1_0= ruleNum )
            {
            // InternalMyDsl.g:1922:4: (lv_num_1_0= ruleNum )
            // InternalMyDsl.g:1923:5: lv_num_1_0= ruleNum
            {

            					newCompositeNode(grammarAccess.getRerollPositionAccess().getNumNumParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_2);
            lv_num_1_0=ruleNum();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getRerollPositionRule());
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
    // $ANTLR end "ruleRerollPosition"


    // $ANTLR start "entryRuleRerollValue"
    // InternalMyDsl.g:1944:1: entryRuleRerollValue returns [EObject current=null] : iv_ruleRerollValue= ruleRerollValue EOF ;
    public final EObject entryRuleRerollValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRerollValue = null;


        try {
            // InternalMyDsl.g:1944:52: (iv_ruleRerollValue= ruleRerollValue EOF )
            // InternalMyDsl.g:1945:2: iv_ruleRerollValue= ruleRerollValue EOF
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
    // InternalMyDsl.g:1951:1: ruleRerollValue returns [EObject current=null] : ( (lv_num_0_0= ruleNum ) ) ;
    public final EObject ruleRerollValue() throws RecognitionException {
        EObject current = null;

        EObject lv_num_0_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:1957:2: ( ( (lv_num_0_0= ruleNum ) ) )
            // InternalMyDsl.g:1958:2: ( (lv_num_0_0= ruleNum ) )
            {
            // InternalMyDsl.g:1958:2: ( (lv_num_0_0= ruleNum ) )
            // InternalMyDsl.g:1959:3: (lv_num_0_0= ruleNum )
            {
            // InternalMyDsl.g:1959:3: (lv_num_0_0= ruleNum )
            // InternalMyDsl.g:1960:4: lv_num_0_0= ruleNum
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


    // $ANTLR start "entryRuleReroll"
    // InternalMyDsl.g:1980:1: entryRuleReroll returns [EObject current=null] : iv_ruleReroll= ruleReroll EOF ;
    public final EObject entryRuleReroll() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleReroll = null;


        try {
            // InternalMyDsl.g:1980:47: (iv_ruleReroll= ruleReroll EOF )
            // InternalMyDsl.g:1981:2: iv_ruleReroll= ruleReroll EOF
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
    // InternalMyDsl.g:1987:1: ruleReroll returns [EObject current=null] : (this_RerollThreshold_0= ruleRerollThreshold | this_RerollHighest_1= ruleRerollHighest | this_RerollPosition_2= ruleRerollPosition | this_RerollValue_3= ruleRerollValue ) ;
    public final EObject ruleReroll() throws RecognitionException {
        EObject current = null;

        EObject this_RerollThreshold_0 = null;

        EObject this_RerollHighest_1 = null;

        EObject this_RerollPosition_2 = null;

        EObject this_RerollValue_3 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:1993:2: ( (this_RerollThreshold_0= ruleRerollThreshold | this_RerollHighest_1= ruleRerollHighest | this_RerollPosition_2= ruleRerollPosition | this_RerollValue_3= ruleRerollValue ) )
            // InternalMyDsl.g:1994:2: (this_RerollThreshold_0= ruleRerollThreshold | this_RerollHighest_1= ruleRerollHighest | this_RerollPosition_2= ruleRerollPosition | this_RerollValue_3= ruleRerollValue )
            {
            // InternalMyDsl.g:1994:2: (this_RerollThreshold_0= ruleRerollThreshold | this_RerollHighest_1= ruleRerollHighest | this_RerollPosition_2= ruleRerollPosition | this_RerollValue_3= ruleRerollValue )
            int alt29=4;
            switch ( input.LA(1) ) {
            case 30:
            case 31:
                {
                alt29=1;
                }
                break;
            case 32:
            case 33:
                {
                alt29=2;
                }
                break;
            case 38:
            case 39:
                {
                alt29=3;
                }
                break;
            case 34:
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
                    // InternalMyDsl.g:1995:3: this_RerollThreshold_0= ruleRerollThreshold
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
                    // InternalMyDsl.g:2004:3: this_RerollHighest_1= ruleRerollHighest
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
                    // InternalMyDsl.g:2013:3: this_RerollPosition_2= ruleRerollPosition
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
                    // InternalMyDsl.g:2022:3: this_RerollValue_3= ruleRerollValue
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


    // $ANTLR start "entryRuleNum"
    // InternalMyDsl.g:2034:1: entryRuleNum returns [EObject current=null] : iv_ruleNum= ruleNum EOF ;
    public final EObject entryRuleNum() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNum = null;


        try {
            // InternalMyDsl.g:2034:44: (iv_ruleNum= ruleNum EOF )
            // InternalMyDsl.g:2035:2: iv_ruleNum= ruleNum EOF
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
    // InternalMyDsl.g:2041:1: ruleNum returns [EObject current=null] : (otherlv_0= 'Num' otherlv_1= '{' otherlv_2= 'value' ( (lv_value_3_0= ruleEInt ) ) otherlv_4= '}' ) ;
    public final EObject ruleNum() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        AntlrDatatypeRuleToken lv_value_3_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:2047:2: ( (otherlv_0= 'Num' otherlv_1= '{' otherlv_2= 'value' ( (lv_value_3_0= ruleEInt ) ) otherlv_4= '}' ) )
            // InternalMyDsl.g:2048:2: (otherlv_0= 'Num' otherlv_1= '{' otherlv_2= 'value' ( (lv_value_3_0= ruleEInt ) ) otherlv_4= '}' )
            {
            // InternalMyDsl.g:2048:2: (otherlv_0= 'Num' otherlv_1= '{' otherlv_2= 'value' ( (lv_value_3_0= ruleEInt ) ) otherlv_4= '}' )
            // InternalMyDsl.g:2049:3: otherlv_0= 'Num' otherlv_1= '{' otherlv_2= 'value' ( (lv_value_3_0= ruleEInt ) ) otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,34,FOLLOW_19); 

            			newLeafNode(otherlv_0, grammarAccess.getNumAccess().getNumKeyword_0());
            		
            otherlv_1=(Token)match(input,35,FOLLOW_20); 

            			newLeafNode(otherlv_1, grammarAccess.getNumAccess().getLeftCurlyBracketKeyword_1());
            		
            otherlv_2=(Token)match(input,36,FOLLOW_21); 

            			newLeafNode(otherlv_2, grammarAccess.getNumAccess().getValueKeyword_2());
            		
            // InternalMyDsl.g:2061:3: ( (lv_value_3_0= ruleEInt ) )
            // InternalMyDsl.g:2062:4: (lv_value_3_0= ruleEInt )
            {
            // InternalMyDsl.g:2062:4: (lv_value_3_0= ruleEInt )
            // InternalMyDsl.g:2063:5: lv_value_3_0= ruleEInt
            {

            					newCompositeNode(grammarAccess.getNumAccess().getValueEIntParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_22);
            lv_value_3_0=ruleEInt();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getNumRule());
            					}
            					set(
            						current,
            						"value",
            						lv_value_3_0,
            						"org.xtext.example.mydsl.MyDsl.EInt");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,37,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getNumAccess().getRightCurlyBracketKeyword_4());
            		

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


    // $ANTLR start "entryRuleFirstLast"
    // InternalMyDsl.g:2088:1: entryRuleFirstLast returns [String current=null] : iv_ruleFirstLast= ruleFirstLast EOF ;
    public final String entryRuleFirstLast() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleFirstLast = null;


        try {
            // InternalMyDsl.g:2088:49: (iv_ruleFirstLast= ruleFirstLast EOF )
            // InternalMyDsl.g:2089:2: iv_ruleFirstLast= ruleFirstLast EOF
            {
             newCompositeNode(grammarAccess.getFirstLastRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFirstLast=ruleFirstLast();

            state._fsp--;

             current =iv_ruleFirstLast.getText(); 
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
    // $ANTLR end "entryRuleFirstLast"


    // $ANTLR start "ruleFirstLast"
    // InternalMyDsl.g:2095:1: ruleFirstLast returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'FIRST' | kw= 'LAST' ) ;
    public final AntlrDatatypeRuleToken ruleFirstLast() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalMyDsl.g:2101:2: ( (kw= 'FIRST' | kw= 'LAST' ) )
            // InternalMyDsl.g:2102:2: (kw= 'FIRST' | kw= 'LAST' )
            {
            // InternalMyDsl.g:2102:2: (kw= 'FIRST' | kw= 'LAST' )
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==38) ) {
                alt30=1;
            }
            else if ( (LA30_0==39) ) {
                alt30=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 30, 0, input);

                throw nvae;
            }
            switch (alt30) {
                case 1 :
                    // InternalMyDsl.g:2103:3: kw= 'FIRST'
                    {
                    kw=(Token)match(input,38,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getFirstLastAccess().getFIRSTKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:2109:3: kw= 'LAST'
                    {
                    kw=(Token)match(input,39,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getFirstLastAccess().getLASTKeyword_1());
                    		

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


    // $ANTLR start "entryRuleOperator"
    // InternalMyDsl.g:2118:1: entryRuleOperator returns [String current=null] : iv_ruleOperator= ruleOperator EOF ;
    public final String entryRuleOperator() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleOperator = null;


        try {
            // InternalMyDsl.g:2118:48: (iv_ruleOperator= ruleOperator EOF )
            // InternalMyDsl.g:2119:2: iv_ruleOperator= ruleOperator EOF
            {
             newCompositeNode(grammarAccess.getOperatorRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleOperator=ruleOperator();

            state._fsp--;

             current =iv_ruleOperator.getText(); 
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
    // $ANTLR end "entryRuleOperator"


    // $ANTLR start "ruleOperator"
    // InternalMyDsl.g:2125:1: ruleOperator returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '+' | kw= '-' | kw= '*' | kw= '/' | kw= 'razy' ) ;
    public final AntlrDatatypeRuleToken ruleOperator() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalMyDsl.g:2131:2: ( (kw= '+' | kw= '-' | kw= '*' | kw= '/' | kw= 'razy' ) )
            // InternalMyDsl.g:2132:2: (kw= '+' | kw= '-' | kw= '*' | kw= '/' | kw= 'razy' )
            {
            // InternalMyDsl.g:2132:2: (kw= '+' | kw= '-' | kw= '*' | kw= '/' | kw= 'razy' )
            int alt31=5;
            switch ( input.LA(1) ) {
            case 16:
                {
                alt31=1;
                }
                break;
            case 17:
                {
                alt31=2;
                }
                break;
            case 40:
                {
                alt31=3;
                }
                break;
            case 41:
                {
                alt31=4;
                }
                break;
            case 21:
                {
                alt31=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 31, 0, input);

                throw nvae;
            }

            switch (alt31) {
                case 1 :
                    // InternalMyDsl.g:2133:3: kw= '+'
                    {
                    kw=(Token)match(input,16,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getOperatorAccess().getPlusSignKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:2139:3: kw= '-'
                    {
                    kw=(Token)match(input,17,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getOperatorAccess().getHyphenMinusKeyword_1());
                    		

                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:2145:3: kw= '*'
                    {
                    kw=(Token)match(input,40,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getOperatorAccess().getAsteriskKeyword_2());
                    		

                    }
                    break;
                case 4 :
                    // InternalMyDsl.g:2151:3: kw= '/'
                    {
                    kw=(Token)match(input,41,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getOperatorAccess().getSolidusKeyword_3());
                    		

                    }
                    break;
                case 5 :
                    // InternalMyDsl.g:2157:3: kw= 'razy'
                    {
                    kw=(Token)match(input,21,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getOperatorAccess().getRazyKeyword_4());
                    		

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


    // $ANTLR start "entryRuleEInt"
    // InternalMyDsl.g:2166:1: entryRuleEInt returns [String current=null] : iv_ruleEInt= ruleEInt EOF ;
    public final String entryRuleEInt() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEInt = null;


        try {
            // InternalMyDsl.g:2166:44: (iv_ruleEInt= ruleEInt EOF )
            // InternalMyDsl.g:2167:2: iv_ruleEInt= ruleEInt EOF
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
    // InternalMyDsl.g:2173:1: ruleEInt returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '-' )? this_INT_1= RULE_INT ) ;
    public final AntlrDatatypeRuleToken ruleEInt() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_INT_1=null;


        	enterRule();

        try {
            // InternalMyDsl.g:2179:2: ( ( (kw= '-' )? this_INT_1= RULE_INT ) )
            // InternalMyDsl.g:2180:2: ( (kw= '-' )? this_INT_1= RULE_INT )
            {
            // InternalMyDsl.g:2180:2: ( (kw= '-' )? this_INT_1= RULE_INT )
            // InternalMyDsl.g:2181:3: (kw= '-' )? this_INT_1= RULE_INT
            {
            // InternalMyDsl.g:2181:3: (kw= '-' )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==17) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // InternalMyDsl.g:2182:4: kw= '-'
                    {
                    kw=(Token)match(input,17,FOLLOW_23); 

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

    // Delegated rules


    protected DFA20 dfa20 = new DFA20(this);
    static final String dfa_1s = "\16\uffff";
    static final String dfa_2s = "\14\uffff\1\7\1\uffff";
    static final String dfa_3s = "\1\32\1\35\3\uffff\1\43\2\uffff\1\44\2\4\1\45\1\14\1\uffff";
    static final String dfa_4s = "\1\35\1\42\3\uffff\1\43\2\uffff\1\44\1\21\1\4\1\45\1\25\1\uffff";
    static final String dfa_5s = "\2\uffff\1\4\1\5\1\6\1\uffff\1\1\1\3\5\uffff\1\2";
    static final String dfa_6s = "\16\uffff}>";
    static final String[] dfa_7s = {
            "\1\2\1\3\1\4\1\1",
            "\1\7\2\6\2\uffff\1\5",
            "",
            "",
            "",
            "\1\10",
            "",
            "",
            "\1\11",
            "\1\13\14\uffff\1\12",
            "\1\13",
            "\1\14",
            "\3\7\6\uffff\1\15",
            ""
    };

    static final short[] dfa_1 = DFA.unpackEncodedString(dfa_1s);
    static final short[] dfa_2 = DFA.unpackEncodedString(dfa_2s);
    static final char[] dfa_3 = DFA.unpackEncodedStringToUnsignedChars(dfa_3s);
    static final char[] dfa_4 = DFA.unpackEncodedStringToUnsignedChars(dfa_4s);
    static final short[] dfa_5 = DFA.unpackEncodedString(dfa_5s);
    static final short[] dfa_6 = DFA.unpackEncodedString(dfa_6s);
    static final short[][] dfa_7 = unpackEncodedStringArray(dfa_7s);

    class DFA20 extends DFA {

        public DFA20(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 20;
            this.eot = dfa_1;
            this.eof = dfa_2;
            this.min = dfa_3;
            this.max = dfa_4;
            this.accept = dfa_5;
            this.special = dfa_6;
            this.transition = dfa_7;
        }
        public String getDescription() {
            return "1304:2: (this_SuccessThreshold_0= ruleSuccessThreshold | this_SuccessMultiplier_1= ruleSuccessMultiplier | this_SuccessBasic_2= ruleSuccessBasic | this_DiceMarkSuk_3= ruleDiceMarkSuk | this_DiceDiscSuk_4= ruleDiceDiscSuk | this_DiceRerollSuk_5= ruleDiceRerollSuk )";
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x00000004004B0000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000007002L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000040002L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x000000001D800000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000004002L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x000000003C000000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000400400000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000200002L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000030000230002L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x000000C7C0400000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x00000000C0000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000420400000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000000020010L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000000000010L});

}