package org.xtext.example.mydsl.ide.contentassist.antlr.internal;

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.DFA;
import org.xtext.example.mydsl.services.MyDslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalMyDslParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_D", "RULE_INT", "RULE_ID", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'.'", "','", "'+'", "'dodawaj'", "'odejmuj'", "'- '", "'pierwsze'", "'ostatnie'", "'*'", "'/'", "'najwyzsze'", "'najnizsze'", "'wiecej niz'", "'mniej niz'", "'Sumuj'", "'\\n'", "';'", "'Sukcesy'", "':'", "'razy'", "'('", "')'", "'wybuchowe'", "'oznacz'", "'odrzuc'", "'przerzuc'", "'sukces'", "'-'"
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

    	public void setGrammarAccess(MyDslGrammarAccess grammarAccess) {
    		this.grammarAccess = grammarAccess;
    	}

    	@Override
    	protected Grammar getGrammar() {
    		return grammarAccess.getGrammar();
    	}

    	@Override
    	protected String getValueForTokenName(String tokenName) {
    		return tokenName;
    	}



    // $ANTLR start "entryRuleLanguage"
    // InternalMyDsl.g:53:1: entryRuleLanguage : ruleLanguage EOF ;
    public final void entryRuleLanguage() throws RecognitionException {
        try {
            // InternalMyDsl.g:54:1: ( ruleLanguage EOF )
            // InternalMyDsl.g:55:1: ruleLanguage EOF
            {
             before(grammarAccess.getLanguageRule()); 
            pushFollow(FOLLOW_1);
            ruleLanguage();

            state._fsp--;

             after(grammarAccess.getLanguageRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleLanguage"


    // $ANTLR start "ruleLanguage"
    // InternalMyDsl.g:62:1: ruleLanguage : ( ( rule__Language__StatementAssignment ) ) ;
    public final void ruleLanguage() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:66:2: ( ( ( rule__Language__StatementAssignment ) ) )
            // InternalMyDsl.g:67:2: ( ( rule__Language__StatementAssignment ) )
            {
            // InternalMyDsl.g:67:2: ( ( rule__Language__StatementAssignment ) )
            // InternalMyDsl.g:68:3: ( rule__Language__StatementAssignment )
            {
             before(grammarAccess.getLanguageAccess().getStatementAssignment()); 
            // InternalMyDsl.g:69:3: ( rule__Language__StatementAssignment )
            // InternalMyDsl.g:69:4: rule__Language__StatementAssignment
            {
            pushFollow(FOLLOW_2);
            rule__Language__StatementAssignment();

            state._fsp--;


            }

             after(grammarAccess.getLanguageAccess().getStatementAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleLanguage"


    // $ANTLR start "entryRuleStat"
    // InternalMyDsl.g:78:1: entryRuleStat : ruleStat EOF ;
    public final void entryRuleStat() throws RecognitionException {
        try {
            // InternalMyDsl.g:79:1: ( ruleStat EOF )
            // InternalMyDsl.g:80:1: ruleStat EOF
            {
             before(grammarAccess.getStatRule()); 
            pushFollow(FOLLOW_1);
            ruleStat();

            state._fsp--;

             after(grammarAccess.getStatRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleStat"


    // $ANTLR start "ruleStat"
    // InternalMyDsl.g:87:1: ruleStat : ( ( rule__Stat__Alternatives ) ) ;
    public final void ruleStat() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:91:2: ( ( ( rule__Stat__Alternatives ) ) )
            // InternalMyDsl.g:92:2: ( ( rule__Stat__Alternatives ) )
            {
            // InternalMyDsl.g:92:2: ( ( rule__Stat__Alternatives ) )
            // InternalMyDsl.g:93:3: ( rule__Stat__Alternatives )
            {
             before(grammarAccess.getStatAccess().getAlternatives()); 
            // InternalMyDsl.g:94:3: ( rule__Stat__Alternatives )
            // InternalMyDsl.g:94:4: rule__Stat__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Stat__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getStatAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleStat"


    // $ANTLR start "entryRuleSumuj"
    // InternalMyDsl.g:103:1: entryRuleSumuj : ruleSumuj EOF ;
    public final void entryRuleSumuj() throws RecognitionException {
        try {
            // InternalMyDsl.g:104:1: ( ruleSumuj EOF )
            // InternalMyDsl.g:105:1: ruleSumuj EOF
            {
             before(grammarAccess.getSumujRule()); 
            pushFollow(FOLLOW_1);
            ruleSumuj();

            state._fsp--;

             after(grammarAccess.getSumujRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleSumuj"


    // $ANTLR start "ruleSumuj"
    // InternalMyDsl.g:112:1: ruleSumuj : ( ( rule__Sumuj__Group__0 ) ) ;
    public final void ruleSumuj() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:116:2: ( ( ( rule__Sumuj__Group__0 ) ) )
            // InternalMyDsl.g:117:2: ( ( rule__Sumuj__Group__0 ) )
            {
            // InternalMyDsl.g:117:2: ( ( rule__Sumuj__Group__0 ) )
            // InternalMyDsl.g:118:3: ( rule__Sumuj__Group__0 )
            {
             before(grammarAccess.getSumujAccess().getGroup()); 
            // InternalMyDsl.g:119:3: ( rule__Sumuj__Group__0 )
            // InternalMyDsl.g:119:4: rule__Sumuj__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Sumuj__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSumujAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSumuj"


    // $ANTLR start "entryRuleSukcesy"
    // InternalMyDsl.g:128:1: entryRuleSukcesy : ruleSukcesy EOF ;
    public final void entryRuleSukcesy() throws RecognitionException {
        try {
            // InternalMyDsl.g:129:1: ( ruleSukcesy EOF )
            // InternalMyDsl.g:130:1: ruleSukcesy EOF
            {
             before(grammarAccess.getSukcesyRule()); 
            pushFollow(FOLLOW_1);
            ruleSukcesy();

            state._fsp--;

             after(grammarAccess.getSukcesyRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleSukcesy"


    // $ANTLR start "ruleSukcesy"
    // InternalMyDsl.g:137:1: ruleSukcesy : ( ( rule__Sukcesy__Group__0 ) ) ;
    public final void ruleSukcesy() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:141:2: ( ( ( rule__Sukcesy__Group__0 ) ) )
            // InternalMyDsl.g:142:2: ( ( rule__Sukcesy__Group__0 ) )
            {
            // InternalMyDsl.g:142:2: ( ( rule__Sukcesy__Group__0 ) )
            // InternalMyDsl.g:143:3: ( rule__Sukcesy__Group__0 )
            {
             before(grammarAccess.getSukcesyAccess().getGroup()); 
            // InternalMyDsl.g:144:3: ( rule__Sukcesy__Group__0 )
            // InternalMyDsl.g:144:4: rule__Sukcesy__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Sukcesy__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSukcesyAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSukcesy"


    // $ANTLR start "entryRuleDiceExprSum"
    // InternalMyDsl.g:153:1: entryRuleDiceExprSum : ruleDiceExprSum EOF ;
    public final void entryRuleDiceExprSum() throws RecognitionException {
        try {
            // InternalMyDsl.g:154:1: ( ruleDiceExprSum EOF )
            // InternalMyDsl.g:155:1: ruleDiceExprSum EOF
            {
             before(grammarAccess.getDiceExprSumRule()); 
            pushFollow(FOLLOW_1);
            ruleDiceExprSum();

            state._fsp--;

             after(grammarAccess.getDiceExprSumRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleDiceExprSum"


    // $ANTLR start "ruleDiceExprSum"
    // InternalMyDsl.g:162:1: ruleDiceExprSum : ( ( rule__DiceExprSum__Group__0 ) ) ;
    public final void ruleDiceExprSum() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:166:2: ( ( ( rule__DiceExprSum__Group__0 ) ) )
            // InternalMyDsl.g:167:2: ( ( rule__DiceExprSum__Group__0 ) )
            {
            // InternalMyDsl.g:167:2: ( ( rule__DiceExprSum__Group__0 ) )
            // InternalMyDsl.g:168:3: ( rule__DiceExprSum__Group__0 )
            {
             before(grammarAccess.getDiceExprSumAccess().getGroup()); 
            // InternalMyDsl.g:169:3: ( rule__DiceExprSum__Group__0 )
            // InternalMyDsl.g:169:4: rule__DiceExprSum__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__DiceExprSum__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getDiceExprSumAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleDiceExprSum"


    // $ANTLR start "entryRuleDiceExprSuk"
    // InternalMyDsl.g:178:1: entryRuleDiceExprSuk : ruleDiceExprSuk EOF ;
    public final void entryRuleDiceExprSuk() throws RecognitionException {
        try {
            // InternalMyDsl.g:179:1: ( ruleDiceExprSuk EOF )
            // InternalMyDsl.g:180:1: ruleDiceExprSuk EOF
            {
             before(grammarAccess.getDiceExprSukRule()); 
            pushFollow(FOLLOW_1);
            ruleDiceExprSuk();

            state._fsp--;

             after(grammarAccess.getDiceExprSukRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleDiceExprSuk"


    // $ANTLR start "ruleDiceExprSuk"
    // InternalMyDsl.g:187:1: ruleDiceExprSuk : ( ( rule__DiceExprSuk__Group__0 ) ) ;
    public final void ruleDiceExprSuk() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:191:2: ( ( ( rule__DiceExprSuk__Group__0 ) ) )
            // InternalMyDsl.g:192:2: ( ( rule__DiceExprSuk__Group__0 ) )
            {
            // InternalMyDsl.g:192:2: ( ( rule__DiceExprSuk__Group__0 ) )
            // InternalMyDsl.g:193:3: ( rule__DiceExprSuk__Group__0 )
            {
             before(grammarAccess.getDiceExprSukAccess().getGroup()); 
            // InternalMyDsl.g:194:3: ( rule__DiceExprSuk__Group__0 )
            // InternalMyDsl.g:194:4: rule__DiceExprSuk__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__DiceExprSuk__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getDiceExprSukAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleDiceExprSuk"


    // $ANTLR start "entryRuleMulExpr"
    // InternalMyDsl.g:203:1: entryRuleMulExpr : ruleMulExpr EOF ;
    public final void entryRuleMulExpr() throws RecognitionException {
        try {
            // InternalMyDsl.g:204:1: ( ruleMulExpr EOF )
            // InternalMyDsl.g:205:1: ruleMulExpr EOF
            {
             before(grammarAccess.getMulExprRule()); 
            pushFollow(FOLLOW_1);
            ruleMulExpr();

            state._fsp--;

             after(grammarAccess.getMulExprRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleMulExpr"


    // $ANTLR start "ruleMulExpr"
    // InternalMyDsl.g:212:1: ruleMulExpr : ( ( rule__MulExpr__Alternatives ) ) ;
    public final void ruleMulExpr() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:216:2: ( ( ( rule__MulExpr__Alternatives ) ) )
            // InternalMyDsl.g:217:2: ( ( rule__MulExpr__Alternatives ) )
            {
            // InternalMyDsl.g:217:2: ( ( rule__MulExpr__Alternatives ) )
            // InternalMyDsl.g:218:3: ( rule__MulExpr__Alternatives )
            {
             before(grammarAccess.getMulExprAccess().getAlternatives()); 
            // InternalMyDsl.g:219:3: ( rule__MulExpr__Alternatives )
            // InternalMyDsl.g:219:4: rule__MulExpr__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__MulExpr__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getMulExprAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleMulExpr"


    // $ANTLR start "entryRuleForm"
    // InternalMyDsl.g:228:1: entryRuleForm : ruleForm EOF ;
    public final void entryRuleForm() throws RecognitionException {
        try {
            // InternalMyDsl.g:229:1: ( ruleForm EOF )
            // InternalMyDsl.g:230:1: ruleForm EOF
            {
             before(grammarAccess.getFormRule()); 
            pushFollow(FOLLOW_1);
            ruleForm();

            state._fsp--;

             after(grammarAccess.getFormRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleForm"


    // $ANTLR start "ruleForm"
    // InternalMyDsl.g:237:1: ruleForm : ( ( rule__Form__Group__0 ) ) ;
    public final void ruleForm() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:241:2: ( ( ( rule__Form__Group__0 ) ) )
            // InternalMyDsl.g:242:2: ( ( rule__Form__Group__0 ) )
            {
            // InternalMyDsl.g:242:2: ( ( rule__Form__Group__0 ) )
            // InternalMyDsl.g:243:3: ( rule__Form__Group__0 )
            {
             before(grammarAccess.getFormAccess().getGroup()); 
            // InternalMyDsl.g:244:3: ( rule__Form__Group__0 )
            // InternalMyDsl.g:244:4: rule__Form__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Form__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getFormAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleForm"


    // $ANTLR start "entryRuleSingleDice"
    // InternalMyDsl.g:253:1: entryRuleSingleDice : ruleSingleDice EOF ;
    public final void entryRuleSingleDice() throws RecognitionException {
        try {
            // InternalMyDsl.g:254:1: ( ruleSingleDice EOF )
            // InternalMyDsl.g:255:1: ruleSingleDice EOF
            {
             before(grammarAccess.getSingleDiceRule()); 
            pushFollow(FOLLOW_1);
            ruleSingleDice();

            state._fsp--;

             after(grammarAccess.getSingleDiceRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleSingleDice"


    // $ANTLR start "ruleSingleDice"
    // InternalMyDsl.g:262:1: ruleSingleDice : ( ( rule__SingleDice__Group__0 ) ) ;
    public final void ruleSingleDice() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:266:2: ( ( ( rule__SingleDice__Group__0 ) ) )
            // InternalMyDsl.g:267:2: ( ( rule__SingleDice__Group__0 ) )
            {
            // InternalMyDsl.g:267:2: ( ( rule__SingleDice__Group__0 ) )
            // InternalMyDsl.g:268:3: ( rule__SingleDice__Group__0 )
            {
             before(grammarAccess.getSingleDiceAccess().getGroup()); 
            // InternalMyDsl.g:269:3: ( rule__SingleDice__Group__0 )
            // InternalMyDsl.g:269:4: rule__SingleDice__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__SingleDice__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSingleDiceAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSingleDice"


    // $ANTLR start "entryRuleMultiDice"
    // InternalMyDsl.g:278:1: entryRuleMultiDice : ruleMultiDice EOF ;
    public final void entryRuleMultiDice() throws RecognitionException {
        try {
            // InternalMyDsl.g:279:1: ( ruleMultiDice EOF )
            // InternalMyDsl.g:280:1: ruleMultiDice EOF
            {
             before(grammarAccess.getMultiDiceRule()); 
            pushFollow(FOLLOW_1);
            ruleMultiDice();

            state._fsp--;

             after(grammarAccess.getMultiDiceRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleMultiDice"


    // $ANTLR start "ruleMultiDice"
    // InternalMyDsl.g:287:1: ruleMultiDice : ( ( rule__MultiDice__Group__0 ) ) ;
    public final void ruleMultiDice() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:291:2: ( ( ( rule__MultiDice__Group__0 ) ) )
            // InternalMyDsl.g:292:2: ( ( rule__MultiDice__Group__0 ) )
            {
            // InternalMyDsl.g:292:2: ( ( rule__MultiDice__Group__0 ) )
            // InternalMyDsl.g:293:3: ( rule__MultiDice__Group__0 )
            {
             before(grammarAccess.getMultiDiceAccess().getGroup()); 
            // InternalMyDsl.g:294:3: ( rule__MultiDice__Group__0 )
            // InternalMyDsl.g:294:4: rule__MultiDice__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__MultiDice__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getMultiDiceAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleMultiDice"


    // $ANTLR start "entryRuleDice"
    // InternalMyDsl.g:303:1: entryRuleDice : ruleDice EOF ;
    public final void entryRuleDice() throws RecognitionException {
        try {
            // InternalMyDsl.g:304:1: ( ruleDice EOF )
            // InternalMyDsl.g:305:1: ruleDice EOF
            {
             before(grammarAccess.getDiceRule()); 
            pushFollow(FOLLOW_1);
            ruleDice();

            state._fsp--;

             after(grammarAccess.getDiceRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleDice"


    // $ANTLR start "ruleDice"
    // InternalMyDsl.g:312:1: ruleDice : ( ( rule__Dice__Alternatives ) ) ;
    public final void ruleDice() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:316:2: ( ( ( rule__Dice__Alternatives ) ) )
            // InternalMyDsl.g:317:2: ( ( rule__Dice__Alternatives ) )
            {
            // InternalMyDsl.g:317:2: ( ( rule__Dice__Alternatives ) )
            // InternalMyDsl.g:318:3: ( rule__Dice__Alternatives )
            {
             before(grammarAccess.getDiceAccess().getAlternatives()); 
            // InternalMyDsl.g:319:3: ( rule__Dice__Alternatives )
            // InternalMyDsl.g:319:4: rule__Dice__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Dice__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getDiceAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleDice"


    // $ANTLR start "entryRuleRuleSum"
    // InternalMyDsl.g:328:1: entryRuleRuleSum : ruleRuleSum EOF ;
    public final void entryRuleRuleSum() throws RecognitionException {
        try {
            // InternalMyDsl.g:329:1: ( ruleRuleSum EOF )
            // InternalMyDsl.g:330:1: ruleRuleSum EOF
            {
             before(grammarAccess.getRuleSumRule()); 
            pushFollow(FOLLOW_1);
            ruleRuleSum();

            state._fsp--;

             after(grammarAccess.getRuleSumRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleRuleSum"


    // $ANTLR start "ruleRuleSum"
    // InternalMyDsl.g:337:1: ruleRuleSum : ( ( rule__RuleSum__Alternatives ) ) ;
    public final void ruleRuleSum() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:341:2: ( ( ( rule__RuleSum__Alternatives ) ) )
            // InternalMyDsl.g:342:2: ( ( rule__RuleSum__Alternatives ) )
            {
            // InternalMyDsl.g:342:2: ( ( rule__RuleSum__Alternatives ) )
            // InternalMyDsl.g:343:3: ( rule__RuleSum__Alternatives )
            {
             before(grammarAccess.getRuleSumAccess().getAlternatives()); 
            // InternalMyDsl.g:344:3: ( rule__RuleSum__Alternatives )
            // InternalMyDsl.g:344:4: rule__RuleSum__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__RuleSum__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getRuleSumAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleRuleSum"


    // $ANTLR start "entryRuleExplosionRule"
    // InternalMyDsl.g:353:1: entryRuleExplosionRule : ruleExplosionRule EOF ;
    public final void entryRuleExplosionRule() throws RecognitionException {
        try {
            // InternalMyDsl.g:354:1: ( ruleExplosionRule EOF )
            // InternalMyDsl.g:355:1: ruleExplosionRule EOF
            {
             before(grammarAccess.getExplosionRuleRule()); 
            pushFollow(FOLLOW_1);
            ruleExplosionRule();

            state._fsp--;

             after(grammarAccess.getExplosionRuleRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleExplosionRule"


    // $ANTLR start "ruleExplosionRule"
    // InternalMyDsl.g:362:1: ruleExplosionRule : ( ( rule__ExplosionRule__Group__0 ) ) ;
    public final void ruleExplosionRule() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:366:2: ( ( ( rule__ExplosionRule__Group__0 ) ) )
            // InternalMyDsl.g:367:2: ( ( rule__ExplosionRule__Group__0 ) )
            {
            // InternalMyDsl.g:367:2: ( ( rule__ExplosionRule__Group__0 ) )
            // InternalMyDsl.g:368:3: ( rule__ExplosionRule__Group__0 )
            {
             before(grammarAccess.getExplosionRuleAccess().getGroup()); 
            // InternalMyDsl.g:369:3: ( rule__ExplosionRule__Group__0 )
            // InternalMyDsl.g:369:4: rule__ExplosionRule__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ExplosionRule__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getExplosionRuleAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleExplosionRule"


    // $ANTLR start "entryRuleDiceMarkSum"
    // InternalMyDsl.g:378:1: entryRuleDiceMarkSum : ruleDiceMarkSum EOF ;
    public final void entryRuleDiceMarkSum() throws RecognitionException {
        try {
            // InternalMyDsl.g:379:1: ( ruleDiceMarkSum EOF )
            // InternalMyDsl.g:380:1: ruleDiceMarkSum EOF
            {
             before(grammarAccess.getDiceMarkSumRule()); 
            pushFollow(FOLLOW_1);
            ruleDiceMarkSum();

            state._fsp--;

             after(grammarAccess.getDiceMarkSumRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleDiceMarkSum"


    // $ANTLR start "ruleDiceMarkSum"
    // InternalMyDsl.g:387:1: ruleDiceMarkSum : ( ( rule__DiceMarkSum__Group__0 ) ) ;
    public final void ruleDiceMarkSum() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:391:2: ( ( ( rule__DiceMarkSum__Group__0 ) ) )
            // InternalMyDsl.g:392:2: ( ( rule__DiceMarkSum__Group__0 ) )
            {
            // InternalMyDsl.g:392:2: ( ( rule__DiceMarkSum__Group__0 ) )
            // InternalMyDsl.g:393:3: ( rule__DiceMarkSum__Group__0 )
            {
             before(grammarAccess.getDiceMarkSumAccess().getGroup()); 
            // InternalMyDsl.g:394:3: ( rule__DiceMarkSum__Group__0 )
            // InternalMyDsl.g:394:4: rule__DiceMarkSum__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__DiceMarkSum__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getDiceMarkSumAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleDiceMarkSum"


    // $ANTLR start "entryRuleDiceDiscSum"
    // InternalMyDsl.g:403:1: entryRuleDiceDiscSum : ruleDiceDiscSum EOF ;
    public final void entryRuleDiceDiscSum() throws RecognitionException {
        try {
            // InternalMyDsl.g:404:1: ( ruleDiceDiscSum EOF )
            // InternalMyDsl.g:405:1: ruleDiceDiscSum EOF
            {
             before(grammarAccess.getDiceDiscSumRule()); 
            pushFollow(FOLLOW_1);
            ruleDiceDiscSum();

            state._fsp--;

             after(grammarAccess.getDiceDiscSumRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleDiceDiscSum"


    // $ANTLR start "ruleDiceDiscSum"
    // InternalMyDsl.g:412:1: ruleDiceDiscSum : ( ( rule__DiceDiscSum__Group__0 ) ) ;
    public final void ruleDiceDiscSum() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:416:2: ( ( ( rule__DiceDiscSum__Group__0 ) ) )
            // InternalMyDsl.g:417:2: ( ( rule__DiceDiscSum__Group__0 ) )
            {
            // InternalMyDsl.g:417:2: ( ( rule__DiceDiscSum__Group__0 ) )
            // InternalMyDsl.g:418:3: ( rule__DiceDiscSum__Group__0 )
            {
             before(grammarAccess.getDiceDiscSumAccess().getGroup()); 
            // InternalMyDsl.g:419:3: ( rule__DiceDiscSum__Group__0 )
            // InternalMyDsl.g:419:4: rule__DiceDiscSum__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__DiceDiscSum__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getDiceDiscSumAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleDiceDiscSum"


    // $ANTLR start "entryRuleDiceRerollSum"
    // InternalMyDsl.g:428:1: entryRuleDiceRerollSum : ruleDiceRerollSum EOF ;
    public final void entryRuleDiceRerollSum() throws RecognitionException {
        try {
            // InternalMyDsl.g:429:1: ( ruleDiceRerollSum EOF )
            // InternalMyDsl.g:430:1: ruleDiceRerollSum EOF
            {
             before(grammarAccess.getDiceRerollSumRule()); 
            pushFollow(FOLLOW_1);
            ruleDiceRerollSum();

            state._fsp--;

             after(grammarAccess.getDiceRerollSumRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleDiceRerollSum"


    // $ANTLR start "ruleDiceRerollSum"
    // InternalMyDsl.g:437:1: ruleDiceRerollSum : ( ( rule__DiceRerollSum__Group__0 ) ) ;
    public final void ruleDiceRerollSum() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:441:2: ( ( ( rule__DiceRerollSum__Group__0 ) ) )
            // InternalMyDsl.g:442:2: ( ( rule__DiceRerollSum__Group__0 ) )
            {
            // InternalMyDsl.g:442:2: ( ( rule__DiceRerollSum__Group__0 ) )
            // InternalMyDsl.g:443:3: ( rule__DiceRerollSum__Group__0 )
            {
             before(grammarAccess.getDiceRerollSumAccess().getGroup()); 
            // InternalMyDsl.g:444:3: ( rule__DiceRerollSum__Group__0 )
            // InternalMyDsl.g:444:4: rule__DiceRerollSum__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__DiceRerollSum__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getDiceRerollSumAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleDiceRerollSum"


    // $ANTLR start "entryRuleRuleSuk"
    // InternalMyDsl.g:453:1: entryRuleRuleSuk : ruleRuleSuk EOF ;
    public final void entryRuleRuleSuk() throws RecognitionException {
        try {
            // InternalMyDsl.g:454:1: ( ruleRuleSuk EOF )
            // InternalMyDsl.g:455:1: ruleRuleSuk EOF
            {
             before(grammarAccess.getRuleSukRule()); 
            pushFollow(FOLLOW_1);
            ruleRuleSuk();

            state._fsp--;

             after(grammarAccess.getRuleSukRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleRuleSuk"


    // $ANTLR start "ruleRuleSuk"
    // InternalMyDsl.g:462:1: ruleRuleSuk : ( ( rule__RuleSuk__Alternatives ) ) ;
    public final void ruleRuleSuk() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:466:2: ( ( ( rule__RuleSuk__Alternatives ) ) )
            // InternalMyDsl.g:467:2: ( ( rule__RuleSuk__Alternatives ) )
            {
            // InternalMyDsl.g:467:2: ( ( rule__RuleSuk__Alternatives ) )
            // InternalMyDsl.g:468:3: ( rule__RuleSuk__Alternatives )
            {
             before(grammarAccess.getRuleSukAccess().getAlternatives()); 
            // InternalMyDsl.g:469:3: ( rule__RuleSuk__Alternatives )
            // InternalMyDsl.g:469:4: rule__RuleSuk__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__RuleSuk__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getRuleSukAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleRuleSuk"


    // $ANTLR start "entryRuleSuccessThreshold"
    // InternalMyDsl.g:478:1: entryRuleSuccessThreshold : ruleSuccessThreshold EOF ;
    public final void entryRuleSuccessThreshold() throws RecognitionException {
        try {
            // InternalMyDsl.g:479:1: ( ruleSuccessThreshold EOF )
            // InternalMyDsl.g:480:1: ruleSuccessThreshold EOF
            {
             before(grammarAccess.getSuccessThresholdRule()); 
            pushFollow(FOLLOW_1);
            ruleSuccessThreshold();

            state._fsp--;

             after(grammarAccess.getSuccessThresholdRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleSuccessThreshold"


    // $ANTLR start "ruleSuccessThreshold"
    // InternalMyDsl.g:487:1: ruleSuccessThreshold : ( ( rule__SuccessThreshold__Group__0 ) ) ;
    public final void ruleSuccessThreshold() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:491:2: ( ( ( rule__SuccessThreshold__Group__0 ) ) )
            // InternalMyDsl.g:492:2: ( ( rule__SuccessThreshold__Group__0 ) )
            {
            // InternalMyDsl.g:492:2: ( ( rule__SuccessThreshold__Group__0 ) )
            // InternalMyDsl.g:493:3: ( rule__SuccessThreshold__Group__0 )
            {
             before(grammarAccess.getSuccessThresholdAccess().getGroup()); 
            // InternalMyDsl.g:494:3: ( rule__SuccessThreshold__Group__0 )
            // InternalMyDsl.g:494:4: rule__SuccessThreshold__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__SuccessThreshold__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSuccessThresholdAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSuccessThreshold"


    // $ANTLR start "entryRuleSuccessMultiplier"
    // InternalMyDsl.g:503:1: entryRuleSuccessMultiplier : ruleSuccessMultiplier EOF ;
    public final void entryRuleSuccessMultiplier() throws RecognitionException {
        try {
            // InternalMyDsl.g:504:1: ( ruleSuccessMultiplier EOF )
            // InternalMyDsl.g:505:1: ruleSuccessMultiplier EOF
            {
             before(grammarAccess.getSuccessMultiplierRule()); 
            pushFollow(FOLLOW_1);
            ruleSuccessMultiplier();

            state._fsp--;

             after(grammarAccess.getSuccessMultiplierRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleSuccessMultiplier"


    // $ANTLR start "ruleSuccessMultiplier"
    // InternalMyDsl.g:512:1: ruleSuccessMultiplier : ( ( rule__SuccessMultiplier__Group__0 ) ) ;
    public final void ruleSuccessMultiplier() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:516:2: ( ( ( rule__SuccessMultiplier__Group__0 ) ) )
            // InternalMyDsl.g:517:2: ( ( rule__SuccessMultiplier__Group__0 ) )
            {
            // InternalMyDsl.g:517:2: ( ( rule__SuccessMultiplier__Group__0 ) )
            // InternalMyDsl.g:518:3: ( rule__SuccessMultiplier__Group__0 )
            {
             before(grammarAccess.getSuccessMultiplierAccess().getGroup()); 
            // InternalMyDsl.g:519:3: ( rule__SuccessMultiplier__Group__0 )
            // InternalMyDsl.g:519:4: rule__SuccessMultiplier__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__SuccessMultiplier__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSuccessMultiplierAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSuccessMultiplier"


    // $ANTLR start "entryRuleSuccessBasic"
    // InternalMyDsl.g:528:1: entryRuleSuccessBasic : ruleSuccessBasic EOF ;
    public final void entryRuleSuccessBasic() throws RecognitionException {
        try {
            // InternalMyDsl.g:529:1: ( ruleSuccessBasic EOF )
            // InternalMyDsl.g:530:1: ruleSuccessBasic EOF
            {
             before(grammarAccess.getSuccessBasicRule()); 
            pushFollow(FOLLOW_1);
            ruleSuccessBasic();

            state._fsp--;

             after(grammarAccess.getSuccessBasicRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleSuccessBasic"


    // $ANTLR start "ruleSuccessBasic"
    // InternalMyDsl.g:537:1: ruleSuccessBasic : ( ( rule__SuccessBasic__NumAssignment ) ) ;
    public final void ruleSuccessBasic() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:541:2: ( ( ( rule__SuccessBasic__NumAssignment ) ) )
            // InternalMyDsl.g:542:2: ( ( rule__SuccessBasic__NumAssignment ) )
            {
            // InternalMyDsl.g:542:2: ( ( rule__SuccessBasic__NumAssignment ) )
            // InternalMyDsl.g:543:3: ( rule__SuccessBasic__NumAssignment )
            {
             before(grammarAccess.getSuccessBasicAccess().getNumAssignment()); 
            // InternalMyDsl.g:544:3: ( rule__SuccessBasic__NumAssignment )
            // InternalMyDsl.g:544:4: rule__SuccessBasic__NumAssignment
            {
            pushFollow(FOLLOW_2);
            rule__SuccessBasic__NumAssignment();

            state._fsp--;


            }

             after(grammarAccess.getSuccessBasicAccess().getNumAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSuccessBasic"


    // $ANTLR start "entryRuleDiceMarkSuk"
    // InternalMyDsl.g:553:1: entryRuleDiceMarkSuk : ruleDiceMarkSuk EOF ;
    public final void entryRuleDiceMarkSuk() throws RecognitionException {
        try {
            // InternalMyDsl.g:554:1: ( ruleDiceMarkSuk EOF )
            // InternalMyDsl.g:555:1: ruleDiceMarkSuk EOF
            {
             before(grammarAccess.getDiceMarkSukRule()); 
            pushFollow(FOLLOW_1);
            ruleDiceMarkSuk();

            state._fsp--;

             after(grammarAccess.getDiceMarkSukRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleDiceMarkSuk"


    // $ANTLR start "ruleDiceMarkSuk"
    // InternalMyDsl.g:562:1: ruleDiceMarkSuk : ( ( rule__DiceMarkSuk__Group__0 ) ) ;
    public final void ruleDiceMarkSuk() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:566:2: ( ( ( rule__DiceMarkSuk__Group__0 ) ) )
            // InternalMyDsl.g:567:2: ( ( rule__DiceMarkSuk__Group__0 ) )
            {
            // InternalMyDsl.g:567:2: ( ( rule__DiceMarkSuk__Group__0 ) )
            // InternalMyDsl.g:568:3: ( rule__DiceMarkSuk__Group__0 )
            {
             before(grammarAccess.getDiceMarkSukAccess().getGroup()); 
            // InternalMyDsl.g:569:3: ( rule__DiceMarkSuk__Group__0 )
            // InternalMyDsl.g:569:4: rule__DiceMarkSuk__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__DiceMarkSuk__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getDiceMarkSukAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleDiceMarkSuk"


    // $ANTLR start "entryRuleDiceDiscSuk"
    // InternalMyDsl.g:578:1: entryRuleDiceDiscSuk : ruleDiceDiscSuk EOF ;
    public final void entryRuleDiceDiscSuk() throws RecognitionException {
        try {
            // InternalMyDsl.g:579:1: ( ruleDiceDiscSuk EOF )
            // InternalMyDsl.g:580:1: ruleDiceDiscSuk EOF
            {
             before(grammarAccess.getDiceDiscSukRule()); 
            pushFollow(FOLLOW_1);
            ruleDiceDiscSuk();

            state._fsp--;

             after(grammarAccess.getDiceDiscSukRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleDiceDiscSuk"


    // $ANTLR start "ruleDiceDiscSuk"
    // InternalMyDsl.g:587:1: ruleDiceDiscSuk : ( ( rule__DiceDiscSuk__Group__0 ) ) ;
    public final void ruleDiceDiscSuk() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:591:2: ( ( ( rule__DiceDiscSuk__Group__0 ) ) )
            // InternalMyDsl.g:592:2: ( ( rule__DiceDiscSuk__Group__0 ) )
            {
            // InternalMyDsl.g:592:2: ( ( rule__DiceDiscSuk__Group__0 ) )
            // InternalMyDsl.g:593:3: ( rule__DiceDiscSuk__Group__0 )
            {
             before(grammarAccess.getDiceDiscSukAccess().getGroup()); 
            // InternalMyDsl.g:594:3: ( rule__DiceDiscSuk__Group__0 )
            // InternalMyDsl.g:594:4: rule__DiceDiscSuk__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__DiceDiscSuk__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getDiceDiscSukAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleDiceDiscSuk"


    // $ANTLR start "entryRuleDiceRerollSuk"
    // InternalMyDsl.g:603:1: entryRuleDiceRerollSuk : ruleDiceRerollSuk EOF ;
    public final void entryRuleDiceRerollSuk() throws RecognitionException {
        try {
            // InternalMyDsl.g:604:1: ( ruleDiceRerollSuk EOF )
            // InternalMyDsl.g:605:1: ruleDiceRerollSuk EOF
            {
             before(grammarAccess.getDiceRerollSukRule()); 
            pushFollow(FOLLOW_1);
            ruleDiceRerollSuk();

            state._fsp--;

             after(grammarAccess.getDiceRerollSukRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleDiceRerollSuk"


    // $ANTLR start "ruleDiceRerollSuk"
    // InternalMyDsl.g:612:1: ruleDiceRerollSuk : ( ( rule__DiceRerollSuk__Group__0 ) ) ;
    public final void ruleDiceRerollSuk() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:616:2: ( ( ( rule__DiceRerollSuk__Group__0 ) ) )
            // InternalMyDsl.g:617:2: ( ( rule__DiceRerollSuk__Group__0 ) )
            {
            // InternalMyDsl.g:617:2: ( ( rule__DiceRerollSuk__Group__0 ) )
            // InternalMyDsl.g:618:3: ( rule__DiceRerollSuk__Group__0 )
            {
             before(grammarAccess.getDiceRerollSukAccess().getGroup()); 
            // InternalMyDsl.g:619:3: ( rule__DiceRerollSuk__Group__0 )
            // InternalMyDsl.g:619:4: rule__DiceRerollSuk__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__DiceRerollSuk__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getDiceRerollSukAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleDiceRerollSuk"


    // $ANTLR start "entryRuleMark"
    // InternalMyDsl.g:628:1: entryRuleMark : ruleMark EOF ;
    public final void entryRuleMark() throws RecognitionException {
        try {
            // InternalMyDsl.g:629:1: ( ruleMark EOF )
            // InternalMyDsl.g:630:1: ruleMark EOF
            {
             before(grammarAccess.getMarkRule()); 
            pushFollow(FOLLOW_1);
            ruleMark();

            state._fsp--;

             after(grammarAccess.getMarkRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleMark"


    // $ANTLR start "ruleMark"
    // InternalMyDsl.g:637:1: ruleMark : ( ( rule__Mark__Alternatives ) ) ;
    public final void ruleMark() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:641:2: ( ( ( rule__Mark__Alternatives ) ) )
            // InternalMyDsl.g:642:2: ( ( rule__Mark__Alternatives ) )
            {
            // InternalMyDsl.g:642:2: ( ( rule__Mark__Alternatives ) )
            // InternalMyDsl.g:643:3: ( rule__Mark__Alternatives )
            {
             before(grammarAccess.getMarkAccess().getAlternatives()); 
            // InternalMyDsl.g:644:3: ( rule__Mark__Alternatives )
            // InternalMyDsl.g:644:4: rule__Mark__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Mark__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getMarkAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleMark"


    // $ANTLR start "entryRuleMarkThreshold"
    // InternalMyDsl.g:653:1: entryRuleMarkThreshold : ruleMarkThreshold EOF ;
    public final void entryRuleMarkThreshold() throws RecognitionException {
        try {
            // InternalMyDsl.g:654:1: ( ruleMarkThreshold EOF )
            // InternalMyDsl.g:655:1: ruleMarkThreshold EOF
            {
             before(grammarAccess.getMarkThresholdRule()); 
            pushFollow(FOLLOW_1);
            ruleMarkThreshold();

            state._fsp--;

             after(grammarAccess.getMarkThresholdRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleMarkThreshold"


    // $ANTLR start "ruleMarkThreshold"
    // InternalMyDsl.g:662:1: ruleMarkThreshold : ( ( rule__MarkThreshold__Group__0 ) ) ;
    public final void ruleMarkThreshold() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:666:2: ( ( ( rule__MarkThreshold__Group__0 ) ) )
            // InternalMyDsl.g:667:2: ( ( rule__MarkThreshold__Group__0 ) )
            {
            // InternalMyDsl.g:667:2: ( ( rule__MarkThreshold__Group__0 ) )
            // InternalMyDsl.g:668:3: ( rule__MarkThreshold__Group__0 )
            {
             before(grammarAccess.getMarkThresholdAccess().getGroup()); 
            // InternalMyDsl.g:669:3: ( rule__MarkThreshold__Group__0 )
            // InternalMyDsl.g:669:4: rule__MarkThreshold__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__MarkThreshold__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getMarkThresholdAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleMarkThreshold"


    // $ANTLR start "entryRuleMarkHighest"
    // InternalMyDsl.g:678:1: entryRuleMarkHighest : ruleMarkHighest EOF ;
    public final void entryRuleMarkHighest() throws RecognitionException {
        try {
            // InternalMyDsl.g:679:1: ( ruleMarkHighest EOF )
            // InternalMyDsl.g:680:1: ruleMarkHighest EOF
            {
             before(grammarAccess.getMarkHighestRule()); 
            pushFollow(FOLLOW_1);
            ruleMarkHighest();

            state._fsp--;

             after(grammarAccess.getMarkHighestRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleMarkHighest"


    // $ANTLR start "ruleMarkHighest"
    // InternalMyDsl.g:687:1: ruleMarkHighest : ( ( rule__MarkHighest__HightlowAssignment ) ) ;
    public final void ruleMarkHighest() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:691:2: ( ( ( rule__MarkHighest__HightlowAssignment ) ) )
            // InternalMyDsl.g:692:2: ( ( rule__MarkHighest__HightlowAssignment ) )
            {
            // InternalMyDsl.g:692:2: ( ( rule__MarkHighest__HightlowAssignment ) )
            // InternalMyDsl.g:693:3: ( rule__MarkHighest__HightlowAssignment )
            {
             before(grammarAccess.getMarkHighestAccess().getHightlowAssignment()); 
            // InternalMyDsl.g:694:3: ( rule__MarkHighest__HightlowAssignment )
            // InternalMyDsl.g:694:4: rule__MarkHighest__HightlowAssignment
            {
            pushFollow(FOLLOW_2);
            rule__MarkHighest__HightlowAssignment();

            state._fsp--;


            }

             after(grammarAccess.getMarkHighestAccess().getHightlowAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleMarkHighest"


    // $ANTLR start "entryRuleMarkPosition"
    // InternalMyDsl.g:703:1: entryRuleMarkPosition : ruleMarkPosition EOF ;
    public final void entryRuleMarkPosition() throws RecognitionException {
        try {
            // InternalMyDsl.g:704:1: ( ruleMarkPosition EOF )
            // InternalMyDsl.g:705:1: ruleMarkPosition EOF
            {
             before(grammarAccess.getMarkPositionRule()); 
            pushFollow(FOLLOW_1);
            ruleMarkPosition();

            state._fsp--;

             after(grammarAccess.getMarkPositionRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleMarkPosition"


    // $ANTLR start "ruleMarkPosition"
    // InternalMyDsl.g:712:1: ruleMarkPosition : ( ( rule__MarkPosition__Group__0 ) ) ;
    public final void ruleMarkPosition() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:716:2: ( ( ( rule__MarkPosition__Group__0 ) ) )
            // InternalMyDsl.g:717:2: ( ( rule__MarkPosition__Group__0 ) )
            {
            // InternalMyDsl.g:717:2: ( ( rule__MarkPosition__Group__0 ) )
            // InternalMyDsl.g:718:3: ( rule__MarkPosition__Group__0 )
            {
             before(grammarAccess.getMarkPositionAccess().getGroup()); 
            // InternalMyDsl.g:719:3: ( rule__MarkPosition__Group__0 )
            // InternalMyDsl.g:719:4: rule__MarkPosition__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__MarkPosition__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getMarkPositionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleMarkPosition"


    // $ANTLR start "entryRuleMarkValue"
    // InternalMyDsl.g:728:1: entryRuleMarkValue : ruleMarkValue EOF ;
    public final void entryRuleMarkValue() throws RecognitionException {
        try {
            // InternalMyDsl.g:729:1: ( ruleMarkValue EOF )
            // InternalMyDsl.g:730:1: ruleMarkValue EOF
            {
             before(grammarAccess.getMarkValueRule()); 
            pushFollow(FOLLOW_1);
            ruleMarkValue();

            state._fsp--;

             after(grammarAccess.getMarkValueRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleMarkValue"


    // $ANTLR start "ruleMarkValue"
    // InternalMyDsl.g:737:1: ruleMarkValue : ( ( rule__MarkValue__NumAssignment ) ) ;
    public final void ruleMarkValue() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:741:2: ( ( ( rule__MarkValue__NumAssignment ) ) )
            // InternalMyDsl.g:742:2: ( ( rule__MarkValue__NumAssignment ) )
            {
            // InternalMyDsl.g:742:2: ( ( rule__MarkValue__NumAssignment ) )
            // InternalMyDsl.g:743:3: ( rule__MarkValue__NumAssignment )
            {
             before(grammarAccess.getMarkValueAccess().getNumAssignment()); 
            // InternalMyDsl.g:744:3: ( rule__MarkValue__NumAssignment )
            // InternalMyDsl.g:744:4: rule__MarkValue__NumAssignment
            {
            pushFollow(FOLLOW_2);
            rule__MarkValue__NumAssignment();

            state._fsp--;


            }

             after(grammarAccess.getMarkValueAccess().getNumAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleMarkValue"


    // $ANTLR start "entryRuleDiscard"
    // InternalMyDsl.g:753:1: entryRuleDiscard : ruleDiscard EOF ;
    public final void entryRuleDiscard() throws RecognitionException {
        try {
            // InternalMyDsl.g:754:1: ( ruleDiscard EOF )
            // InternalMyDsl.g:755:1: ruleDiscard EOF
            {
             before(grammarAccess.getDiscardRule()); 
            pushFollow(FOLLOW_1);
            ruleDiscard();

            state._fsp--;

             after(grammarAccess.getDiscardRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleDiscard"


    // $ANTLR start "ruleDiscard"
    // InternalMyDsl.g:762:1: ruleDiscard : ( ( rule__Discard__Alternatives ) ) ;
    public final void ruleDiscard() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:766:2: ( ( ( rule__Discard__Alternatives ) ) )
            // InternalMyDsl.g:767:2: ( ( rule__Discard__Alternatives ) )
            {
            // InternalMyDsl.g:767:2: ( ( rule__Discard__Alternatives ) )
            // InternalMyDsl.g:768:3: ( rule__Discard__Alternatives )
            {
             before(grammarAccess.getDiscardAccess().getAlternatives()); 
            // InternalMyDsl.g:769:3: ( rule__Discard__Alternatives )
            // InternalMyDsl.g:769:4: rule__Discard__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Discard__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getDiscardAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleDiscard"


    // $ANTLR start "entryRuleDiscardThreshold"
    // InternalMyDsl.g:778:1: entryRuleDiscardThreshold : ruleDiscardThreshold EOF ;
    public final void entryRuleDiscardThreshold() throws RecognitionException {
        try {
            // InternalMyDsl.g:779:1: ( ruleDiscardThreshold EOF )
            // InternalMyDsl.g:780:1: ruleDiscardThreshold EOF
            {
             before(grammarAccess.getDiscardThresholdRule()); 
            pushFollow(FOLLOW_1);
            ruleDiscardThreshold();

            state._fsp--;

             after(grammarAccess.getDiscardThresholdRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleDiscardThreshold"


    // $ANTLR start "ruleDiscardThreshold"
    // InternalMyDsl.g:787:1: ruleDiscardThreshold : ( ( rule__DiscardThreshold__Group__0 ) ) ;
    public final void ruleDiscardThreshold() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:791:2: ( ( ( rule__DiscardThreshold__Group__0 ) ) )
            // InternalMyDsl.g:792:2: ( ( rule__DiscardThreshold__Group__0 ) )
            {
            // InternalMyDsl.g:792:2: ( ( rule__DiscardThreshold__Group__0 ) )
            // InternalMyDsl.g:793:3: ( rule__DiscardThreshold__Group__0 )
            {
             before(grammarAccess.getDiscardThresholdAccess().getGroup()); 
            // InternalMyDsl.g:794:3: ( rule__DiscardThreshold__Group__0 )
            // InternalMyDsl.g:794:4: rule__DiscardThreshold__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__DiscardThreshold__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getDiscardThresholdAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleDiscardThreshold"


    // $ANTLR start "entryRuleDiscardHighest"
    // InternalMyDsl.g:803:1: entryRuleDiscardHighest : ruleDiscardHighest EOF ;
    public final void entryRuleDiscardHighest() throws RecognitionException {
        try {
            // InternalMyDsl.g:804:1: ( ruleDiscardHighest EOF )
            // InternalMyDsl.g:805:1: ruleDiscardHighest EOF
            {
             before(grammarAccess.getDiscardHighestRule()); 
            pushFollow(FOLLOW_1);
            ruleDiscardHighest();

            state._fsp--;

             after(grammarAccess.getDiscardHighestRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleDiscardHighest"


    // $ANTLR start "ruleDiscardHighest"
    // InternalMyDsl.g:812:1: ruleDiscardHighest : ( ( rule__DiscardHighest__HightlowAssignment ) ) ;
    public final void ruleDiscardHighest() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:816:2: ( ( ( rule__DiscardHighest__HightlowAssignment ) ) )
            // InternalMyDsl.g:817:2: ( ( rule__DiscardHighest__HightlowAssignment ) )
            {
            // InternalMyDsl.g:817:2: ( ( rule__DiscardHighest__HightlowAssignment ) )
            // InternalMyDsl.g:818:3: ( rule__DiscardHighest__HightlowAssignment )
            {
             before(grammarAccess.getDiscardHighestAccess().getHightlowAssignment()); 
            // InternalMyDsl.g:819:3: ( rule__DiscardHighest__HightlowAssignment )
            // InternalMyDsl.g:819:4: rule__DiscardHighest__HightlowAssignment
            {
            pushFollow(FOLLOW_2);
            rule__DiscardHighest__HightlowAssignment();

            state._fsp--;


            }

             after(grammarAccess.getDiscardHighestAccess().getHightlowAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleDiscardHighest"


    // $ANTLR start "entryRuleDiscardPosition"
    // InternalMyDsl.g:828:1: entryRuleDiscardPosition : ruleDiscardPosition EOF ;
    public final void entryRuleDiscardPosition() throws RecognitionException {
        try {
            // InternalMyDsl.g:829:1: ( ruleDiscardPosition EOF )
            // InternalMyDsl.g:830:1: ruleDiscardPosition EOF
            {
             before(grammarAccess.getDiscardPositionRule()); 
            pushFollow(FOLLOW_1);
            ruleDiscardPosition();

            state._fsp--;

             after(grammarAccess.getDiscardPositionRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleDiscardPosition"


    // $ANTLR start "ruleDiscardPosition"
    // InternalMyDsl.g:837:1: ruleDiscardPosition : ( ( rule__DiscardPosition__Group__0 ) ) ;
    public final void ruleDiscardPosition() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:841:2: ( ( ( rule__DiscardPosition__Group__0 ) ) )
            // InternalMyDsl.g:842:2: ( ( rule__DiscardPosition__Group__0 ) )
            {
            // InternalMyDsl.g:842:2: ( ( rule__DiscardPosition__Group__0 ) )
            // InternalMyDsl.g:843:3: ( rule__DiscardPosition__Group__0 )
            {
             before(grammarAccess.getDiscardPositionAccess().getGroup()); 
            // InternalMyDsl.g:844:3: ( rule__DiscardPosition__Group__0 )
            // InternalMyDsl.g:844:4: rule__DiscardPosition__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__DiscardPosition__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getDiscardPositionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleDiscardPosition"


    // $ANTLR start "entryRuleDiscardValue"
    // InternalMyDsl.g:853:1: entryRuleDiscardValue : ruleDiscardValue EOF ;
    public final void entryRuleDiscardValue() throws RecognitionException {
        try {
            // InternalMyDsl.g:854:1: ( ruleDiscardValue EOF )
            // InternalMyDsl.g:855:1: ruleDiscardValue EOF
            {
             before(grammarAccess.getDiscardValueRule()); 
            pushFollow(FOLLOW_1);
            ruleDiscardValue();

            state._fsp--;

             after(grammarAccess.getDiscardValueRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleDiscardValue"


    // $ANTLR start "ruleDiscardValue"
    // InternalMyDsl.g:862:1: ruleDiscardValue : ( ( rule__DiscardValue__NumAssignment ) ) ;
    public final void ruleDiscardValue() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:866:2: ( ( ( rule__DiscardValue__NumAssignment ) ) )
            // InternalMyDsl.g:867:2: ( ( rule__DiscardValue__NumAssignment ) )
            {
            // InternalMyDsl.g:867:2: ( ( rule__DiscardValue__NumAssignment ) )
            // InternalMyDsl.g:868:3: ( rule__DiscardValue__NumAssignment )
            {
             before(grammarAccess.getDiscardValueAccess().getNumAssignment()); 
            // InternalMyDsl.g:869:3: ( rule__DiscardValue__NumAssignment )
            // InternalMyDsl.g:869:4: rule__DiscardValue__NumAssignment
            {
            pushFollow(FOLLOW_2);
            rule__DiscardValue__NumAssignment();

            state._fsp--;


            }

             after(grammarAccess.getDiscardValueAccess().getNumAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleDiscardValue"


    // $ANTLR start "entryRuleReroll"
    // InternalMyDsl.g:878:1: entryRuleReroll : ruleReroll EOF ;
    public final void entryRuleReroll() throws RecognitionException {
        try {
            // InternalMyDsl.g:879:1: ( ruleReroll EOF )
            // InternalMyDsl.g:880:1: ruleReroll EOF
            {
             before(grammarAccess.getRerollRule()); 
            pushFollow(FOLLOW_1);
            ruleReroll();

            state._fsp--;

             after(grammarAccess.getRerollRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleReroll"


    // $ANTLR start "ruleReroll"
    // InternalMyDsl.g:887:1: ruleReroll : ( ( rule__Reroll__Alternatives ) ) ;
    public final void ruleReroll() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:891:2: ( ( ( rule__Reroll__Alternatives ) ) )
            // InternalMyDsl.g:892:2: ( ( rule__Reroll__Alternatives ) )
            {
            // InternalMyDsl.g:892:2: ( ( rule__Reroll__Alternatives ) )
            // InternalMyDsl.g:893:3: ( rule__Reroll__Alternatives )
            {
             before(grammarAccess.getRerollAccess().getAlternatives()); 
            // InternalMyDsl.g:894:3: ( rule__Reroll__Alternatives )
            // InternalMyDsl.g:894:4: rule__Reroll__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Reroll__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getRerollAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleReroll"


    // $ANTLR start "entryRuleRerollThreshold"
    // InternalMyDsl.g:903:1: entryRuleRerollThreshold : ruleRerollThreshold EOF ;
    public final void entryRuleRerollThreshold() throws RecognitionException {
        try {
            // InternalMyDsl.g:904:1: ( ruleRerollThreshold EOF )
            // InternalMyDsl.g:905:1: ruleRerollThreshold EOF
            {
             before(grammarAccess.getRerollThresholdRule()); 
            pushFollow(FOLLOW_1);
            ruleRerollThreshold();

            state._fsp--;

             after(grammarAccess.getRerollThresholdRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleRerollThreshold"


    // $ANTLR start "ruleRerollThreshold"
    // InternalMyDsl.g:912:1: ruleRerollThreshold : ( ( rule__RerollThreshold__Group__0 ) ) ;
    public final void ruleRerollThreshold() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:916:2: ( ( ( rule__RerollThreshold__Group__0 ) ) )
            // InternalMyDsl.g:917:2: ( ( rule__RerollThreshold__Group__0 ) )
            {
            // InternalMyDsl.g:917:2: ( ( rule__RerollThreshold__Group__0 ) )
            // InternalMyDsl.g:918:3: ( rule__RerollThreshold__Group__0 )
            {
             before(grammarAccess.getRerollThresholdAccess().getGroup()); 
            // InternalMyDsl.g:919:3: ( rule__RerollThreshold__Group__0 )
            // InternalMyDsl.g:919:4: rule__RerollThreshold__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__RerollThreshold__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getRerollThresholdAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleRerollThreshold"


    // $ANTLR start "entryRuleRerollHighest"
    // InternalMyDsl.g:928:1: entryRuleRerollHighest : ruleRerollHighest EOF ;
    public final void entryRuleRerollHighest() throws RecognitionException {
        try {
            // InternalMyDsl.g:929:1: ( ruleRerollHighest EOF )
            // InternalMyDsl.g:930:1: ruleRerollHighest EOF
            {
             before(grammarAccess.getRerollHighestRule()); 
            pushFollow(FOLLOW_1);
            ruleRerollHighest();

            state._fsp--;

             after(grammarAccess.getRerollHighestRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleRerollHighest"


    // $ANTLR start "ruleRerollHighest"
    // InternalMyDsl.g:937:1: ruleRerollHighest : ( ( rule__RerollHighest__HightlowAssignment ) ) ;
    public final void ruleRerollHighest() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:941:2: ( ( ( rule__RerollHighest__HightlowAssignment ) ) )
            // InternalMyDsl.g:942:2: ( ( rule__RerollHighest__HightlowAssignment ) )
            {
            // InternalMyDsl.g:942:2: ( ( rule__RerollHighest__HightlowAssignment ) )
            // InternalMyDsl.g:943:3: ( rule__RerollHighest__HightlowAssignment )
            {
             before(grammarAccess.getRerollHighestAccess().getHightlowAssignment()); 
            // InternalMyDsl.g:944:3: ( rule__RerollHighest__HightlowAssignment )
            // InternalMyDsl.g:944:4: rule__RerollHighest__HightlowAssignment
            {
            pushFollow(FOLLOW_2);
            rule__RerollHighest__HightlowAssignment();

            state._fsp--;


            }

             after(grammarAccess.getRerollHighestAccess().getHightlowAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleRerollHighest"


    // $ANTLR start "entryRuleRerollPosition"
    // InternalMyDsl.g:953:1: entryRuleRerollPosition : ruleRerollPosition EOF ;
    public final void entryRuleRerollPosition() throws RecognitionException {
        try {
            // InternalMyDsl.g:954:1: ( ruleRerollPosition EOF )
            // InternalMyDsl.g:955:1: ruleRerollPosition EOF
            {
             before(grammarAccess.getRerollPositionRule()); 
            pushFollow(FOLLOW_1);
            ruleRerollPosition();

            state._fsp--;

             after(grammarAccess.getRerollPositionRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleRerollPosition"


    // $ANTLR start "ruleRerollPosition"
    // InternalMyDsl.g:962:1: ruleRerollPosition : ( ( rule__RerollPosition__Group__0 ) ) ;
    public final void ruleRerollPosition() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:966:2: ( ( ( rule__RerollPosition__Group__0 ) ) )
            // InternalMyDsl.g:967:2: ( ( rule__RerollPosition__Group__0 ) )
            {
            // InternalMyDsl.g:967:2: ( ( rule__RerollPosition__Group__0 ) )
            // InternalMyDsl.g:968:3: ( rule__RerollPosition__Group__0 )
            {
             before(grammarAccess.getRerollPositionAccess().getGroup()); 
            // InternalMyDsl.g:969:3: ( rule__RerollPosition__Group__0 )
            // InternalMyDsl.g:969:4: rule__RerollPosition__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__RerollPosition__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getRerollPositionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleRerollPosition"


    // $ANTLR start "entryRuleRerollValue"
    // InternalMyDsl.g:978:1: entryRuleRerollValue : ruleRerollValue EOF ;
    public final void entryRuleRerollValue() throws RecognitionException {
        try {
            // InternalMyDsl.g:979:1: ( ruleRerollValue EOF )
            // InternalMyDsl.g:980:1: ruleRerollValue EOF
            {
             before(grammarAccess.getRerollValueRule()); 
            pushFollow(FOLLOW_1);
            ruleRerollValue();

            state._fsp--;

             after(grammarAccess.getRerollValueRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleRerollValue"


    // $ANTLR start "ruleRerollValue"
    // InternalMyDsl.g:987:1: ruleRerollValue : ( ( rule__RerollValue__NumAssignment ) ) ;
    public final void ruleRerollValue() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:991:2: ( ( ( rule__RerollValue__NumAssignment ) ) )
            // InternalMyDsl.g:992:2: ( ( rule__RerollValue__NumAssignment ) )
            {
            // InternalMyDsl.g:992:2: ( ( rule__RerollValue__NumAssignment ) )
            // InternalMyDsl.g:993:3: ( rule__RerollValue__NumAssignment )
            {
             before(grammarAccess.getRerollValueAccess().getNumAssignment()); 
            // InternalMyDsl.g:994:3: ( rule__RerollValue__NumAssignment )
            // InternalMyDsl.g:994:4: rule__RerollValue__NumAssignment
            {
            pushFollow(FOLLOW_2);
            rule__RerollValue__NumAssignment();

            state._fsp--;


            }

             after(grammarAccess.getRerollValueAccess().getNumAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleRerollValue"


    // $ANTLR start "entryRuleNum"
    // InternalMyDsl.g:1003:1: entryRuleNum : ruleNum EOF ;
    public final void entryRuleNum() throws RecognitionException {
        try {
            // InternalMyDsl.g:1004:1: ( ruleNum EOF )
            // InternalMyDsl.g:1005:1: ruleNum EOF
            {
             before(grammarAccess.getNumRule()); 
            pushFollow(FOLLOW_1);
            ruleNum();

            state._fsp--;

             after(grammarAccess.getNumRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleNum"


    // $ANTLR start "ruleNum"
    // InternalMyDsl.g:1012:1: ruleNum : ( ( rule__Num__ValueAssignment ) ) ;
    public final void ruleNum() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1016:2: ( ( ( rule__Num__ValueAssignment ) ) )
            // InternalMyDsl.g:1017:2: ( ( rule__Num__ValueAssignment ) )
            {
            // InternalMyDsl.g:1017:2: ( ( rule__Num__ValueAssignment ) )
            // InternalMyDsl.g:1018:3: ( rule__Num__ValueAssignment )
            {
             before(grammarAccess.getNumAccess().getValueAssignment()); 
            // InternalMyDsl.g:1019:3: ( rule__Num__ValueAssignment )
            // InternalMyDsl.g:1019:4: rule__Num__ValueAssignment
            {
            pushFollow(FOLLOW_2);
            rule__Num__ValueAssignment();

            state._fsp--;


            }

             after(grammarAccess.getNumAccess().getValueAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleNum"


    // $ANTLR start "entryRuleEInt"
    // InternalMyDsl.g:1028:1: entryRuleEInt : ruleEInt EOF ;
    public final void entryRuleEInt() throws RecognitionException {
        try {
            // InternalMyDsl.g:1029:1: ( ruleEInt EOF )
            // InternalMyDsl.g:1030:1: ruleEInt EOF
            {
             before(grammarAccess.getEIntRule()); 
            pushFollow(FOLLOW_1);
            ruleEInt();

            state._fsp--;

             after(grammarAccess.getEIntRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleEInt"


    // $ANTLR start "ruleEInt"
    // InternalMyDsl.g:1037:1: ruleEInt : ( ( rule__EInt__Group__0 ) ) ;
    public final void ruleEInt() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1041:2: ( ( ( rule__EInt__Group__0 ) ) )
            // InternalMyDsl.g:1042:2: ( ( rule__EInt__Group__0 ) )
            {
            // InternalMyDsl.g:1042:2: ( ( rule__EInt__Group__0 ) )
            // InternalMyDsl.g:1043:3: ( rule__EInt__Group__0 )
            {
             before(grammarAccess.getEIntAccess().getGroup()); 
            // InternalMyDsl.g:1044:3: ( rule__EInt__Group__0 )
            // InternalMyDsl.g:1044:4: rule__EInt__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__EInt__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getEIntAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEInt"


    // $ANTLR start "ruleSign"
    // InternalMyDsl.g:1053:1: ruleSign : ( ( rule__Sign__Alternatives ) ) ;
    public final void ruleSign() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1057:1: ( ( ( rule__Sign__Alternatives ) ) )
            // InternalMyDsl.g:1058:2: ( ( rule__Sign__Alternatives ) )
            {
            // InternalMyDsl.g:1058:2: ( ( rule__Sign__Alternatives ) )
            // InternalMyDsl.g:1059:3: ( rule__Sign__Alternatives )
            {
             before(grammarAccess.getSignAccess().getAlternatives()); 
            // InternalMyDsl.g:1060:3: ( rule__Sign__Alternatives )
            // InternalMyDsl.g:1060:4: rule__Sign__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Sign__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getSignAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSign"


    // $ANTLR start "ruleFirstLast"
    // InternalMyDsl.g:1069:1: ruleFirstLast : ( ( rule__FirstLast__Alternatives ) ) ;
    public final void ruleFirstLast() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1073:1: ( ( ( rule__FirstLast__Alternatives ) ) )
            // InternalMyDsl.g:1074:2: ( ( rule__FirstLast__Alternatives ) )
            {
            // InternalMyDsl.g:1074:2: ( ( rule__FirstLast__Alternatives ) )
            // InternalMyDsl.g:1075:3: ( rule__FirstLast__Alternatives )
            {
             before(grammarAccess.getFirstLastAccess().getAlternatives()); 
            // InternalMyDsl.g:1076:3: ( rule__FirstLast__Alternatives )
            // InternalMyDsl.g:1076:4: rule__FirstLast__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__FirstLast__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getFirstLastAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleFirstLast"


    // $ANTLR start "ruleOperator"
    // InternalMyDsl.g:1085:1: ruleOperator : ( ( rule__Operator__Alternatives ) ) ;
    public final void ruleOperator() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1089:1: ( ( ( rule__Operator__Alternatives ) ) )
            // InternalMyDsl.g:1090:2: ( ( rule__Operator__Alternatives ) )
            {
            // InternalMyDsl.g:1090:2: ( ( rule__Operator__Alternatives ) )
            // InternalMyDsl.g:1091:3: ( rule__Operator__Alternatives )
            {
             before(grammarAccess.getOperatorAccess().getAlternatives()); 
            // InternalMyDsl.g:1092:3: ( rule__Operator__Alternatives )
            // InternalMyDsl.g:1092:4: rule__Operator__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Operator__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getOperatorAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleOperator"


    // $ANTLR start "ruleHighLow"
    // InternalMyDsl.g:1101:1: ruleHighLow : ( ( rule__HighLow__Alternatives ) ) ;
    public final void ruleHighLow() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1105:1: ( ( ( rule__HighLow__Alternatives ) ) )
            // InternalMyDsl.g:1106:2: ( ( rule__HighLow__Alternatives ) )
            {
            // InternalMyDsl.g:1106:2: ( ( rule__HighLow__Alternatives ) )
            // InternalMyDsl.g:1107:3: ( rule__HighLow__Alternatives )
            {
             before(grammarAccess.getHighLowAccess().getAlternatives()); 
            // InternalMyDsl.g:1108:3: ( rule__HighLow__Alternatives )
            // InternalMyDsl.g:1108:4: rule__HighLow__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__HighLow__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getHighLowAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleHighLow"


    // $ANTLR start "rule__Stat__Alternatives"
    // InternalMyDsl.g:1116:1: rule__Stat__Alternatives : ( ( ruleSumuj ) | ( ruleSukcesy ) );
    public final void rule__Stat__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1120:1: ( ( ruleSumuj ) | ( ruleSukcesy ) )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==26) ) {
                alt1=1;
            }
            else if ( (LA1_0==29) ) {
                alt1=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // InternalMyDsl.g:1121:2: ( ruleSumuj )
                    {
                    // InternalMyDsl.g:1121:2: ( ruleSumuj )
                    // InternalMyDsl.g:1122:3: ruleSumuj
                    {
                     before(grammarAccess.getStatAccess().getSumujParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleSumuj();

                    state._fsp--;

                     after(grammarAccess.getStatAccess().getSumujParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:1127:2: ( ruleSukcesy )
                    {
                    // InternalMyDsl.g:1127:2: ( ruleSukcesy )
                    // InternalMyDsl.g:1128:3: ruleSukcesy
                    {
                     before(grammarAccess.getStatAccess().getSukcesyParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleSukcesy();

                    state._fsp--;

                     after(grammarAccess.getStatAccess().getSukcesyParserRuleCall_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Stat__Alternatives"


    // $ANTLR start "rule__Sumuj__Alternatives_5"
    // InternalMyDsl.g:1137:1: rule__Sumuj__Alternatives_5 : ( ( '.' ) | ( ',' ) );
    public final void rule__Sumuj__Alternatives_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1141:1: ( ( '.' ) | ( ',' ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==12) ) {
                alt2=1;
            }
            else if ( (LA2_0==13) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // InternalMyDsl.g:1142:2: ( '.' )
                    {
                    // InternalMyDsl.g:1142:2: ( '.' )
                    // InternalMyDsl.g:1143:3: '.'
                    {
                     before(grammarAccess.getSumujAccess().getFullStopKeyword_5_0()); 
                    match(input,12,FOLLOW_2); 
                     after(grammarAccess.getSumujAccess().getFullStopKeyword_5_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:1148:2: ( ',' )
                    {
                    // InternalMyDsl.g:1148:2: ( ',' )
                    // InternalMyDsl.g:1149:3: ','
                    {
                     before(grammarAccess.getSumujAccess().getCommaKeyword_5_1()); 
                    match(input,13,FOLLOW_2); 
                     after(grammarAccess.getSumujAccess().getCommaKeyword_5_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sumuj__Alternatives_5"


    // $ANTLR start "rule__Sukcesy__Alternatives_5"
    // InternalMyDsl.g:1158:1: rule__Sukcesy__Alternatives_5 : ( ( '.' ) | ( ',' ) );
    public final void rule__Sukcesy__Alternatives_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1162:1: ( ( '.' ) | ( ',' ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==12) ) {
                alt3=1;
            }
            else if ( (LA3_0==13) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalMyDsl.g:1163:2: ( '.' )
                    {
                    // InternalMyDsl.g:1163:2: ( '.' )
                    // InternalMyDsl.g:1164:3: '.'
                    {
                     before(grammarAccess.getSukcesyAccess().getFullStopKeyword_5_0()); 
                    match(input,12,FOLLOW_2); 
                     after(grammarAccess.getSukcesyAccess().getFullStopKeyword_5_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:1169:2: ( ',' )
                    {
                    // InternalMyDsl.g:1169:2: ( ',' )
                    // InternalMyDsl.g:1170:3: ','
                    {
                     before(grammarAccess.getSukcesyAccess().getCommaKeyword_5_1()); 
                    match(input,13,FOLLOW_2); 
                     after(grammarAccess.getSukcesyAccess().getCommaKeyword_5_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sukcesy__Alternatives_5"


    // $ANTLR start "rule__MulExpr__Alternatives"
    // InternalMyDsl.g:1179:1: rule__MulExpr__Alternatives : ( ( ( rule__MulExpr__Group_0__0 ) ) | ( ( rule__MulExpr__Group_1__0 ) ) );
    public final void rule__MulExpr__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1183:1: ( ( ( rule__MulExpr__Group_0__0 ) ) | ( ( rule__MulExpr__Group_1__0 ) ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( ((LA4_0>=RULE_D && LA4_0<=RULE_INT)||LA4_0==39) ) {
                alt4=1;
            }
            else if ( (LA4_0==32) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // InternalMyDsl.g:1184:2: ( ( rule__MulExpr__Group_0__0 ) )
                    {
                    // InternalMyDsl.g:1184:2: ( ( rule__MulExpr__Group_0__0 ) )
                    // InternalMyDsl.g:1185:3: ( rule__MulExpr__Group_0__0 )
                    {
                     before(grammarAccess.getMulExprAccess().getGroup_0()); 
                    // InternalMyDsl.g:1186:3: ( rule__MulExpr__Group_0__0 )
                    // InternalMyDsl.g:1186:4: rule__MulExpr__Group_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__MulExpr__Group_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getMulExprAccess().getGroup_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:1190:2: ( ( rule__MulExpr__Group_1__0 ) )
                    {
                    // InternalMyDsl.g:1190:2: ( ( rule__MulExpr__Group_1__0 ) )
                    // InternalMyDsl.g:1191:3: ( rule__MulExpr__Group_1__0 )
                    {
                     before(grammarAccess.getMulExprAccess().getGroup_1()); 
                    // InternalMyDsl.g:1192:3: ( rule__MulExpr__Group_1__0 )
                    // InternalMyDsl.g:1192:4: rule__MulExpr__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__MulExpr__Group_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getMulExprAccess().getGroup_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MulExpr__Alternatives"


    // $ANTLR start "rule__Dice__Alternatives"
    // InternalMyDsl.g:1200:1: rule__Dice__Alternatives : ( ( ruleSingleDice ) | ( ruleMultiDice ) );
    public final void rule__Dice__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1204:1: ( ( ruleSingleDice ) | ( ruleMultiDice ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==RULE_D) ) {
                alt5=1;
            }
            else if ( (LA5_0==RULE_INT||LA5_0==39) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // InternalMyDsl.g:1205:2: ( ruleSingleDice )
                    {
                    // InternalMyDsl.g:1205:2: ( ruleSingleDice )
                    // InternalMyDsl.g:1206:3: ruleSingleDice
                    {
                     before(grammarAccess.getDiceAccess().getSingleDiceParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleSingleDice();

                    state._fsp--;

                     after(grammarAccess.getDiceAccess().getSingleDiceParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:1211:2: ( ruleMultiDice )
                    {
                    // InternalMyDsl.g:1211:2: ( ruleMultiDice )
                    // InternalMyDsl.g:1212:3: ruleMultiDice
                    {
                     before(grammarAccess.getDiceAccess().getMultiDiceParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleMultiDice();

                    state._fsp--;

                     after(grammarAccess.getDiceAccess().getMultiDiceParserRuleCall_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Dice__Alternatives"


    // $ANTLR start "rule__RuleSum__Alternatives"
    // InternalMyDsl.g:1221:1: rule__RuleSum__Alternatives : ( ( ruleExplosionRule ) | ( ruleDiceMarkSum ) | ( ruleDiceDiscSum ) | ( ruleDiceRerollSum ) );
    public final void rule__RuleSum__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1225:1: ( ( ruleExplosionRule ) | ( ruleDiceMarkSum ) | ( ruleDiceDiscSum ) | ( ruleDiceRerollSum ) )
            int alt6=4;
            switch ( input.LA(1) ) {
            case 14:
            case 15:
            case 16:
            case 17:
                {
                alt6=1;
                }
                break;
            case 35:
                {
                alt6=2;
                }
                break;
            case 36:
                {
                alt6=3;
                }
                break;
            case 37:
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
                    // InternalMyDsl.g:1226:2: ( ruleExplosionRule )
                    {
                    // InternalMyDsl.g:1226:2: ( ruleExplosionRule )
                    // InternalMyDsl.g:1227:3: ruleExplosionRule
                    {
                     before(grammarAccess.getRuleSumAccess().getExplosionRuleParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleExplosionRule();

                    state._fsp--;

                     after(grammarAccess.getRuleSumAccess().getExplosionRuleParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:1232:2: ( ruleDiceMarkSum )
                    {
                    // InternalMyDsl.g:1232:2: ( ruleDiceMarkSum )
                    // InternalMyDsl.g:1233:3: ruleDiceMarkSum
                    {
                     before(grammarAccess.getRuleSumAccess().getDiceMarkSumParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleDiceMarkSum();

                    state._fsp--;

                     after(grammarAccess.getRuleSumAccess().getDiceMarkSumParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:1238:2: ( ruleDiceDiscSum )
                    {
                    // InternalMyDsl.g:1238:2: ( ruleDiceDiscSum )
                    // InternalMyDsl.g:1239:3: ruleDiceDiscSum
                    {
                     before(grammarAccess.getRuleSumAccess().getDiceDiscSumParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    ruleDiceDiscSum();

                    state._fsp--;

                     after(grammarAccess.getRuleSumAccess().getDiceDiscSumParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalMyDsl.g:1244:2: ( ruleDiceRerollSum )
                    {
                    // InternalMyDsl.g:1244:2: ( ruleDiceRerollSum )
                    // InternalMyDsl.g:1245:3: ruleDiceRerollSum
                    {
                     before(grammarAccess.getRuleSumAccess().getDiceRerollSumParserRuleCall_3()); 
                    pushFollow(FOLLOW_2);
                    ruleDiceRerollSum();

                    state._fsp--;

                     after(grammarAccess.getRuleSumAccess().getDiceRerollSumParserRuleCall_3()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RuleSum__Alternatives"


    // $ANTLR start "rule__RuleSuk__Alternatives"
    // InternalMyDsl.g:1254:1: rule__RuleSuk__Alternatives : ( ( ( rule__RuleSuk__Group_0__0 ) ) | ( ruleDiceMarkSuk ) | ( ruleDiceDiscSuk ) | ( ruleDiceRerollSuk ) );
    public final void rule__RuleSuk__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1258:1: ( ( ( rule__RuleSuk__Group_0__0 ) ) | ( ruleDiceMarkSuk ) | ( ruleDiceDiscSuk ) | ( ruleDiceRerollSuk ) )
            int alt7=4;
            switch ( input.LA(1) ) {
            case 38:
                {
                alt7=1;
                }
                break;
            case 35:
                {
                alt7=2;
                }
                break;
            case 36:
                {
                alt7=3;
                }
                break;
            case 37:
                {
                alt7=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }

            switch (alt7) {
                case 1 :
                    // InternalMyDsl.g:1259:2: ( ( rule__RuleSuk__Group_0__0 ) )
                    {
                    // InternalMyDsl.g:1259:2: ( ( rule__RuleSuk__Group_0__0 ) )
                    // InternalMyDsl.g:1260:3: ( rule__RuleSuk__Group_0__0 )
                    {
                     before(grammarAccess.getRuleSukAccess().getGroup_0()); 
                    // InternalMyDsl.g:1261:3: ( rule__RuleSuk__Group_0__0 )
                    // InternalMyDsl.g:1261:4: rule__RuleSuk__Group_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__RuleSuk__Group_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getRuleSukAccess().getGroup_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:1265:2: ( ruleDiceMarkSuk )
                    {
                    // InternalMyDsl.g:1265:2: ( ruleDiceMarkSuk )
                    // InternalMyDsl.g:1266:3: ruleDiceMarkSuk
                    {
                     before(grammarAccess.getRuleSukAccess().getDiceMarkSukParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleDiceMarkSuk();

                    state._fsp--;

                     after(grammarAccess.getRuleSukAccess().getDiceMarkSukParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:1271:2: ( ruleDiceDiscSuk )
                    {
                    // InternalMyDsl.g:1271:2: ( ruleDiceDiscSuk )
                    // InternalMyDsl.g:1272:3: ruleDiceDiscSuk
                    {
                     before(grammarAccess.getRuleSukAccess().getDiceDiscSukParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    ruleDiceDiscSuk();

                    state._fsp--;

                     after(grammarAccess.getRuleSukAccess().getDiceDiscSukParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalMyDsl.g:1277:2: ( ruleDiceRerollSuk )
                    {
                    // InternalMyDsl.g:1277:2: ( ruleDiceRerollSuk )
                    // InternalMyDsl.g:1278:3: ruleDiceRerollSuk
                    {
                     before(grammarAccess.getRuleSukAccess().getDiceRerollSukParserRuleCall_3()); 
                    pushFollow(FOLLOW_2);
                    ruleDiceRerollSuk();

                    state._fsp--;

                     after(grammarAccess.getRuleSukAccess().getDiceRerollSukParserRuleCall_3()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RuleSuk__Alternatives"


    // $ANTLR start "rule__RuleSuk__Alternatives_0_1"
    // InternalMyDsl.g:1287:1: rule__RuleSuk__Alternatives_0_1 : ( ( ruleSuccessThreshold ) | ( ruleSuccessMultiplier ) | ( ruleSuccessBasic ) );
    public final void rule__RuleSuk__Alternatives_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1291:1: ( ( ruleSuccessThreshold ) | ( ruleSuccessMultiplier ) | ( ruleSuccessBasic ) )
            int alt8=3;
            switch ( input.LA(1) ) {
            case 22:
            case 23:
            case 24:
            case 25:
                {
                alt8=1;
                }
                break;
            case 39:
                {
                int LA8_2 = input.LA(2);

                if ( (LA8_2==RULE_INT) ) {
                    int LA8_3 = input.LA(3);

                    if ( (LA8_3==31) ) {
                        alt8=2;
                    }
                    else if ( (LA8_3==EOF||(LA8_3>=12 && LA8_3<=13)||(LA8_3>=27 && LA8_3<=28)) ) {
                        alt8=3;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 8, 3, input);

                        throw nvae;
                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 8, 2, input);

                    throw nvae;
                }
                }
                break;
            case RULE_INT:
                {
                int LA8_3 = input.LA(2);

                if ( (LA8_3==31) ) {
                    alt8=2;
                }
                else if ( (LA8_3==EOF||(LA8_3>=12 && LA8_3<=13)||(LA8_3>=27 && LA8_3<=28)) ) {
                    alt8=3;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 8, 3, input);

                    throw nvae;
                }
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }

            switch (alt8) {
                case 1 :
                    // InternalMyDsl.g:1292:2: ( ruleSuccessThreshold )
                    {
                    // InternalMyDsl.g:1292:2: ( ruleSuccessThreshold )
                    // InternalMyDsl.g:1293:3: ruleSuccessThreshold
                    {
                     before(grammarAccess.getRuleSukAccess().getSuccessThresholdParserRuleCall_0_1_0()); 
                    pushFollow(FOLLOW_2);
                    ruleSuccessThreshold();

                    state._fsp--;

                     after(grammarAccess.getRuleSukAccess().getSuccessThresholdParserRuleCall_0_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:1298:2: ( ruleSuccessMultiplier )
                    {
                    // InternalMyDsl.g:1298:2: ( ruleSuccessMultiplier )
                    // InternalMyDsl.g:1299:3: ruleSuccessMultiplier
                    {
                     before(grammarAccess.getRuleSukAccess().getSuccessMultiplierParserRuleCall_0_1_1()); 
                    pushFollow(FOLLOW_2);
                    ruleSuccessMultiplier();

                    state._fsp--;

                     after(grammarAccess.getRuleSukAccess().getSuccessMultiplierParserRuleCall_0_1_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:1304:2: ( ruleSuccessBasic )
                    {
                    // InternalMyDsl.g:1304:2: ( ruleSuccessBasic )
                    // InternalMyDsl.g:1305:3: ruleSuccessBasic
                    {
                     before(grammarAccess.getRuleSukAccess().getSuccessBasicParserRuleCall_0_1_2()); 
                    pushFollow(FOLLOW_2);
                    ruleSuccessBasic();

                    state._fsp--;

                     after(grammarAccess.getRuleSukAccess().getSuccessBasicParserRuleCall_0_1_2()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RuleSuk__Alternatives_0_1"


    // $ANTLR start "rule__Mark__Alternatives"
    // InternalMyDsl.g:1314:1: rule__Mark__Alternatives : ( ( ruleMarkThreshold ) | ( ruleMarkHighest ) | ( ruleMarkPosition ) | ( ruleMarkValue ) );
    public final void rule__Mark__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1318:1: ( ( ruleMarkThreshold ) | ( ruleMarkHighest ) | ( ruleMarkPosition ) | ( ruleMarkValue ) )
            int alt9=4;
            alt9 = dfa9.predict(input);
            switch (alt9) {
                case 1 :
                    // InternalMyDsl.g:1319:2: ( ruleMarkThreshold )
                    {
                    // InternalMyDsl.g:1319:2: ( ruleMarkThreshold )
                    // InternalMyDsl.g:1320:3: ruleMarkThreshold
                    {
                     before(grammarAccess.getMarkAccess().getMarkThresholdParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleMarkThreshold();

                    state._fsp--;

                     after(grammarAccess.getMarkAccess().getMarkThresholdParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:1325:2: ( ruleMarkHighest )
                    {
                    // InternalMyDsl.g:1325:2: ( ruleMarkHighest )
                    // InternalMyDsl.g:1326:3: ruleMarkHighest
                    {
                     before(grammarAccess.getMarkAccess().getMarkHighestParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleMarkHighest();

                    state._fsp--;

                     after(grammarAccess.getMarkAccess().getMarkHighestParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:1331:2: ( ruleMarkPosition )
                    {
                    // InternalMyDsl.g:1331:2: ( ruleMarkPosition )
                    // InternalMyDsl.g:1332:3: ruleMarkPosition
                    {
                     before(grammarAccess.getMarkAccess().getMarkPositionParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    ruleMarkPosition();

                    state._fsp--;

                     after(grammarAccess.getMarkAccess().getMarkPositionParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalMyDsl.g:1337:2: ( ruleMarkValue )
                    {
                    // InternalMyDsl.g:1337:2: ( ruleMarkValue )
                    // InternalMyDsl.g:1338:3: ruleMarkValue
                    {
                     before(grammarAccess.getMarkAccess().getMarkValueParserRuleCall_3()); 
                    pushFollow(FOLLOW_2);
                    ruleMarkValue();

                    state._fsp--;

                     after(grammarAccess.getMarkAccess().getMarkValueParserRuleCall_3()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mark__Alternatives"


    // $ANTLR start "rule__Discard__Alternatives"
    // InternalMyDsl.g:1347:1: rule__Discard__Alternatives : ( ( ruleDiscardThreshold ) | ( ruleDiscardHighest ) | ( ruleDiscardPosition ) | ( ruleDiscardValue ) );
    public final void rule__Discard__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1351:1: ( ( ruleDiscardThreshold ) | ( ruleDiscardHighest ) | ( ruleDiscardPosition ) | ( ruleDiscardValue ) )
            int alt10=4;
            alt10 = dfa10.predict(input);
            switch (alt10) {
                case 1 :
                    // InternalMyDsl.g:1352:2: ( ruleDiscardThreshold )
                    {
                    // InternalMyDsl.g:1352:2: ( ruleDiscardThreshold )
                    // InternalMyDsl.g:1353:3: ruleDiscardThreshold
                    {
                     before(grammarAccess.getDiscardAccess().getDiscardThresholdParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleDiscardThreshold();

                    state._fsp--;

                     after(grammarAccess.getDiscardAccess().getDiscardThresholdParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:1358:2: ( ruleDiscardHighest )
                    {
                    // InternalMyDsl.g:1358:2: ( ruleDiscardHighest )
                    // InternalMyDsl.g:1359:3: ruleDiscardHighest
                    {
                     before(grammarAccess.getDiscardAccess().getDiscardHighestParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleDiscardHighest();

                    state._fsp--;

                     after(grammarAccess.getDiscardAccess().getDiscardHighestParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:1364:2: ( ruleDiscardPosition )
                    {
                    // InternalMyDsl.g:1364:2: ( ruleDiscardPosition )
                    // InternalMyDsl.g:1365:3: ruleDiscardPosition
                    {
                     before(grammarAccess.getDiscardAccess().getDiscardPositionParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    ruleDiscardPosition();

                    state._fsp--;

                     after(grammarAccess.getDiscardAccess().getDiscardPositionParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalMyDsl.g:1370:2: ( ruleDiscardValue )
                    {
                    // InternalMyDsl.g:1370:2: ( ruleDiscardValue )
                    // InternalMyDsl.g:1371:3: ruleDiscardValue
                    {
                     before(grammarAccess.getDiscardAccess().getDiscardValueParserRuleCall_3()); 
                    pushFollow(FOLLOW_2);
                    ruleDiscardValue();

                    state._fsp--;

                     after(grammarAccess.getDiscardAccess().getDiscardValueParserRuleCall_3()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Discard__Alternatives"


    // $ANTLR start "rule__Reroll__Alternatives"
    // InternalMyDsl.g:1380:1: rule__Reroll__Alternatives : ( ( ruleRerollThreshold ) | ( ruleRerollHighest ) | ( ruleRerollPosition ) | ( ruleRerollValue ) );
    public final void rule__Reroll__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1384:1: ( ( ruleRerollThreshold ) | ( ruleRerollHighest ) | ( ruleRerollPosition ) | ( ruleRerollValue ) )
            int alt11=4;
            alt11 = dfa11.predict(input);
            switch (alt11) {
                case 1 :
                    // InternalMyDsl.g:1385:2: ( ruleRerollThreshold )
                    {
                    // InternalMyDsl.g:1385:2: ( ruleRerollThreshold )
                    // InternalMyDsl.g:1386:3: ruleRerollThreshold
                    {
                     before(grammarAccess.getRerollAccess().getRerollThresholdParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleRerollThreshold();

                    state._fsp--;

                     after(grammarAccess.getRerollAccess().getRerollThresholdParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:1391:2: ( ruleRerollHighest )
                    {
                    // InternalMyDsl.g:1391:2: ( ruleRerollHighest )
                    // InternalMyDsl.g:1392:3: ruleRerollHighest
                    {
                     before(grammarAccess.getRerollAccess().getRerollHighestParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleRerollHighest();

                    state._fsp--;

                     after(grammarAccess.getRerollAccess().getRerollHighestParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:1397:2: ( ruleRerollPosition )
                    {
                    // InternalMyDsl.g:1397:2: ( ruleRerollPosition )
                    // InternalMyDsl.g:1398:3: ruleRerollPosition
                    {
                     before(grammarAccess.getRerollAccess().getRerollPositionParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    ruleRerollPosition();

                    state._fsp--;

                     after(grammarAccess.getRerollAccess().getRerollPositionParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalMyDsl.g:1403:2: ( ruleRerollValue )
                    {
                    // InternalMyDsl.g:1403:2: ( ruleRerollValue )
                    // InternalMyDsl.g:1404:3: ruleRerollValue
                    {
                     before(grammarAccess.getRerollAccess().getRerollValueParserRuleCall_3()); 
                    pushFollow(FOLLOW_2);
                    ruleRerollValue();

                    state._fsp--;

                     after(grammarAccess.getRerollAccess().getRerollValueParserRuleCall_3()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Reroll__Alternatives"


    // $ANTLR start "rule__Sign__Alternatives"
    // InternalMyDsl.g:1413:1: rule__Sign__Alternatives : ( ( ( '+' ) ) | ( ( 'dodawaj' ) ) | ( ( 'odejmuj' ) ) | ( ( '- ' ) ) );
    public final void rule__Sign__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1417:1: ( ( ( '+' ) ) | ( ( 'dodawaj' ) ) | ( ( 'odejmuj' ) ) | ( ( '- ' ) ) )
            int alt12=4;
            switch ( input.LA(1) ) {
            case 14:
                {
                alt12=1;
                }
                break;
            case 15:
                {
                alt12=2;
                }
                break;
            case 16:
                {
                alt12=3;
                }
                break;
            case 17:
                {
                alt12=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }

            switch (alt12) {
                case 1 :
                    // InternalMyDsl.g:1418:2: ( ( '+' ) )
                    {
                    // InternalMyDsl.g:1418:2: ( ( '+' ) )
                    // InternalMyDsl.g:1419:3: ( '+' )
                    {
                     before(grammarAccess.getSignAccess().getADDEnumLiteralDeclaration_0()); 
                    // InternalMyDsl.g:1420:3: ( '+' )
                    // InternalMyDsl.g:1420:4: '+'
                    {
                    match(input,14,FOLLOW_2); 

                    }

                     after(grammarAccess.getSignAccess().getADDEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:1424:2: ( ( 'dodawaj' ) )
                    {
                    // InternalMyDsl.g:1424:2: ( ( 'dodawaj' ) )
                    // InternalMyDsl.g:1425:3: ( 'dodawaj' )
                    {
                     before(grammarAccess.getSignAccess().getADDEnumLiteralDeclaration_1()); 
                    // InternalMyDsl.g:1426:3: ( 'dodawaj' )
                    // InternalMyDsl.g:1426:4: 'dodawaj'
                    {
                    match(input,15,FOLLOW_2); 

                    }

                     after(grammarAccess.getSignAccess().getADDEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:1430:2: ( ( 'odejmuj' ) )
                    {
                    // InternalMyDsl.g:1430:2: ( ( 'odejmuj' ) )
                    // InternalMyDsl.g:1431:3: ( 'odejmuj' )
                    {
                     before(grammarAccess.getSignAccess().getSUBEnumLiteralDeclaration_2()); 
                    // InternalMyDsl.g:1432:3: ( 'odejmuj' )
                    // InternalMyDsl.g:1432:4: 'odejmuj'
                    {
                    match(input,16,FOLLOW_2); 

                    }

                     after(grammarAccess.getSignAccess().getSUBEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalMyDsl.g:1436:2: ( ( '- ' ) )
                    {
                    // InternalMyDsl.g:1436:2: ( ( '- ' ) )
                    // InternalMyDsl.g:1437:3: ( '- ' )
                    {
                     before(grammarAccess.getSignAccess().getSUBEnumLiteralDeclaration_3()); 
                    // InternalMyDsl.g:1438:3: ( '- ' )
                    // InternalMyDsl.g:1438:4: '- '
                    {
                    match(input,17,FOLLOW_2); 

                    }

                     after(grammarAccess.getSignAccess().getSUBEnumLiteralDeclaration_3()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sign__Alternatives"


    // $ANTLR start "rule__FirstLast__Alternatives"
    // InternalMyDsl.g:1446:1: rule__FirstLast__Alternatives : ( ( ( 'pierwsze' ) ) | ( ( 'ostatnie' ) ) );
    public final void rule__FirstLast__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1450:1: ( ( ( 'pierwsze' ) ) | ( ( 'ostatnie' ) ) )
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==18) ) {
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
                    // InternalMyDsl.g:1451:2: ( ( 'pierwsze' ) )
                    {
                    // InternalMyDsl.g:1451:2: ( ( 'pierwsze' ) )
                    // InternalMyDsl.g:1452:3: ( 'pierwsze' )
                    {
                     before(grammarAccess.getFirstLastAccess().getFIRSTEnumLiteralDeclaration_0()); 
                    // InternalMyDsl.g:1453:3: ( 'pierwsze' )
                    // InternalMyDsl.g:1453:4: 'pierwsze'
                    {
                    match(input,18,FOLLOW_2); 

                    }

                     after(grammarAccess.getFirstLastAccess().getFIRSTEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:1457:2: ( ( 'ostatnie' ) )
                    {
                    // InternalMyDsl.g:1457:2: ( ( 'ostatnie' ) )
                    // InternalMyDsl.g:1458:3: ( 'ostatnie' )
                    {
                     before(grammarAccess.getFirstLastAccess().getLASTEnumLiteralDeclaration_1()); 
                    // InternalMyDsl.g:1459:3: ( 'ostatnie' )
                    // InternalMyDsl.g:1459:4: 'ostatnie'
                    {
                    match(input,19,FOLLOW_2); 

                    }

                     after(grammarAccess.getFirstLastAccess().getLASTEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FirstLast__Alternatives"


    // $ANTLR start "rule__Operator__Alternatives"
    // InternalMyDsl.g:1467:1: rule__Operator__Alternatives : ( ( ( '+' ) ) | ( ( '- ' ) ) | ( ( '*' ) ) | ( ( '/' ) ) );
    public final void rule__Operator__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1471:1: ( ( ( '+' ) ) | ( ( '- ' ) ) | ( ( '*' ) ) | ( ( '/' ) ) )
            int alt14=4;
            switch ( input.LA(1) ) {
            case 14:
                {
                alt14=1;
                }
                break;
            case 17:
                {
                alt14=2;
                }
                break;
            case 20:
                {
                alt14=3;
                }
                break;
            case 21:
                {
                alt14=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;
            }

            switch (alt14) {
                case 1 :
                    // InternalMyDsl.g:1472:2: ( ( '+' ) )
                    {
                    // InternalMyDsl.g:1472:2: ( ( '+' ) )
                    // InternalMyDsl.g:1473:3: ( '+' )
                    {
                     before(grammarAccess.getOperatorAccess().getADDEnumLiteralDeclaration_0()); 
                    // InternalMyDsl.g:1474:3: ( '+' )
                    // InternalMyDsl.g:1474:4: '+'
                    {
                    match(input,14,FOLLOW_2); 

                    }

                     after(grammarAccess.getOperatorAccess().getADDEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:1478:2: ( ( '- ' ) )
                    {
                    // InternalMyDsl.g:1478:2: ( ( '- ' ) )
                    // InternalMyDsl.g:1479:3: ( '- ' )
                    {
                     before(grammarAccess.getOperatorAccess().getSUBEnumLiteralDeclaration_1()); 
                    // InternalMyDsl.g:1480:3: ( '- ' )
                    // InternalMyDsl.g:1480:4: '- '
                    {
                    match(input,17,FOLLOW_2); 

                    }

                     after(grammarAccess.getOperatorAccess().getSUBEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:1484:2: ( ( '*' ) )
                    {
                    // InternalMyDsl.g:1484:2: ( ( '*' ) )
                    // InternalMyDsl.g:1485:3: ( '*' )
                    {
                     before(grammarAccess.getOperatorAccess().getMULEnumLiteralDeclaration_2()); 
                    // InternalMyDsl.g:1486:3: ( '*' )
                    // InternalMyDsl.g:1486:4: '*'
                    {
                    match(input,20,FOLLOW_2); 

                    }

                     after(grammarAccess.getOperatorAccess().getMULEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalMyDsl.g:1490:2: ( ( '/' ) )
                    {
                    // InternalMyDsl.g:1490:2: ( ( '/' ) )
                    // InternalMyDsl.g:1491:3: ( '/' )
                    {
                     before(grammarAccess.getOperatorAccess().getDIVEnumLiteralDeclaration_3()); 
                    // InternalMyDsl.g:1492:3: ( '/' )
                    // InternalMyDsl.g:1492:4: '/'
                    {
                    match(input,21,FOLLOW_2); 

                    }

                     after(grammarAccess.getOperatorAccess().getDIVEnumLiteralDeclaration_3()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Operator__Alternatives"


    // $ANTLR start "rule__HighLow__Alternatives"
    // InternalMyDsl.g:1500:1: rule__HighLow__Alternatives : ( ( ( 'najwyzsze' ) ) | ( ( 'najnizsze' ) ) | ( ( 'wiecej niz' ) ) | ( ( 'mniej niz' ) ) );
    public final void rule__HighLow__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1504:1: ( ( ( 'najwyzsze' ) ) | ( ( 'najnizsze' ) ) | ( ( 'wiecej niz' ) ) | ( ( 'mniej niz' ) ) )
            int alt15=4;
            switch ( input.LA(1) ) {
            case 22:
                {
                alt15=1;
                }
                break;
            case 23:
                {
                alt15=2;
                }
                break;
            case 24:
                {
                alt15=3;
                }
                break;
            case 25:
                {
                alt15=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                throw nvae;
            }

            switch (alt15) {
                case 1 :
                    // InternalMyDsl.g:1505:2: ( ( 'najwyzsze' ) )
                    {
                    // InternalMyDsl.g:1505:2: ( ( 'najwyzsze' ) )
                    // InternalMyDsl.g:1506:3: ( 'najwyzsze' )
                    {
                     before(grammarAccess.getHighLowAccess().getHIGHEnumLiteralDeclaration_0()); 
                    // InternalMyDsl.g:1507:3: ( 'najwyzsze' )
                    // InternalMyDsl.g:1507:4: 'najwyzsze'
                    {
                    match(input,22,FOLLOW_2); 

                    }

                     after(grammarAccess.getHighLowAccess().getHIGHEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:1511:2: ( ( 'najnizsze' ) )
                    {
                    // InternalMyDsl.g:1511:2: ( ( 'najnizsze' ) )
                    // InternalMyDsl.g:1512:3: ( 'najnizsze' )
                    {
                     before(grammarAccess.getHighLowAccess().getLOWEnumLiteralDeclaration_1()); 
                    // InternalMyDsl.g:1513:3: ( 'najnizsze' )
                    // InternalMyDsl.g:1513:4: 'najnizsze'
                    {
                    match(input,23,FOLLOW_2); 

                    }

                     after(grammarAccess.getHighLowAccess().getLOWEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:1517:2: ( ( 'wiecej niz' ) )
                    {
                    // InternalMyDsl.g:1517:2: ( ( 'wiecej niz' ) )
                    // InternalMyDsl.g:1518:3: ( 'wiecej niz' )
                    {
                     before(grammarAccess.getHighLowAccess().getHIGHEnumLiteralDeclaration_2()); 
                    // InternalMyDsl.g:1519:3: ( 'wiecej niz' )
                    // InternalMyDsl.g:1519:4: 'wiecej niz'
                    {
                    match(input,24,FOLLOW_2); 

                    }

                     after(grammarAccess.getHighLowAccess().getHIGHEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalMyDsl.g:1523:2: ( ( 'mniej niz' ) )
                    {
                    // InternalMyDsl.g:1523:2: ( ( 'mniej niz' ) )
                    // InternalMyDsl.g:1524:3: ( 'mniej niz' )
                    {
                     before(grammarAccess.getHighLowAccess().getLOWEnumLiteralDeclaration_3()); 
                    // InternalMyDsl.g:1525:3: ( 'mniej niz' )
                    // InternalMyDsl.g:1525:4: 'mniej niz'
                    {
                    match(input,25,FOLLOW_2); 

                    }

                     after(grammarAccess.getHighLowAccess().getLOWEnumLiteralDeclaration_3()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__HighLow__Alternatives"


    // $ANTLR start "rule__Sumuj__Group__0"
    // InternalMyDsl.g:1533:1: rule__Sumuj__Group__0 : rule__Sumuj__Group__0__Impl rule__Sumuj__Group__1 ;
    public final void rule__Sumuj__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1537:1: ( rule__Sumuj__Group__0__Impl rule__Sumuj__Group__1 )
            // InternalMyDsl.g:1538:2: rule__Sumuj__Group__0__Impl rule__Sumuj__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__Sumuj__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Sumuj__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sumuj__Group__0"


    // $ANTLR start "rule__Sumuj__Group__0__Impl"
    // InternalMyDsl.g:1545:1: rule__Sumuj__Group__0__Impl : ( 'Sumuj' ) ;
    public final void rule__Sumuj__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1549:1: ( ( 'Sumuj' ) )
            // InternalMyDsl.g:1550:1: ( 'Sumuj' )
            {
            // InternalMyDsl.g:1550:1: ( 'Sumuj' )
            // InternalMyDsl.g:1551:2: 'Sumuj'
            {
             before(grammarAccess.getSumujAccess().getSumujKeyword_0()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getSumujAccess().getSumujKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sumuj__Group__0__Impl"


    // $ANTLR start "rule__Sumuj__Group__1"
    // InternalMyDsl.g:1560:1: rule__Sumuj__Group__1 : rule__Sumuj__Group__1__Impl rule__Sumuj__Group__2 ;
    public final void rule__Sumuj__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1564:1: ( rule__Sumuj__Group__1__Impl rule__Sumuj__Group__2 )
            // InternalMyDsl.g:1565:2: rule__Sumuj__Group__1__Impl rule__Sumuj__Group__2
            {
            pushFollow(FOLLOW_3);
            rule__Sumuj__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Sumuj__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sumuj__Group__1"


    // $ANTLR start "rule__Sumuj__Group__1__Impl"
    // InternalMyDsl.g:1572:1: rule__Sumuj__Group__1__Impl : ( ( '\\n' )? ) ;
    public final void rule__Sumuj__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1576:1: ( ( ( '\\n' )? ) )
            // InternalMyDsl.g:1577:1: ( ( '\\n' )? )
            {
            // InternalMyDsl.g:1577:1: ( ( '\\n' )? )
            // InternalMyDsl.g:1578:2: ( '\\n' )?
            {
             before(grammarAccess.getSumujAccess().getLineFeedKeyword_1()); 
            // InternalMyDsl.g:1579:2: ( '\\n' )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==27) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalMyDsl.g:1579:3: '\\n'
                    {
                    match(input,27,FOLLOW_2); 

                    }
                    break;

            }

             after(grammarAccess.getSumujAccess().getLineFeedKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sumuj__Group__1__Impl"


    // $ANTLR start "rule__Sumuj__Group__2"
    // InternalMyDsl.g:1587:1: rule__Sumuj__Group__2 : rule__Sumuj__Group__2__Impl rule__Sumuj__Group__3 ;
    public final void rule__Sumuj__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1591:1: ( rule__Sumuj__Group__2__Impl rule__Sumuj__Group__3 )
            // InternalMyDsl.g:1592:2: rule__Sumuj__Group__2__Impl rule__Sumuj__Group__3
            {
            pushFollow(FOLLOW_4);
            rule__Sumuj__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Sumuj__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sumuj__Group__2"


    // $ANTLR start "rule__Sumuj__Group__2__Impl"
    // InternalMyDsl.g:1599:1: rule__Sumuj__Group__2__Impl : ( ( rule__Sumuj__DiceexprsumAssignment_2 ) ) ;
    public final void rule__Sumuj__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1603:1: ( ( ( rule__Sumuj__DiceexprsumAssignment_2 ) ) )
            // InternalMyDsl.g:1604:1: ( ( rule__Sumuj__DiceexprsumAssignment_2 ) )
            {
            // InternalMyDsl.g:1604:1: ( ( rule__Sumuj__DiceexprsumAssignment_2 ) )
            // InternalMyDsl.g:1605:2: ( rule__Sumuj__DiceexprsumAssignment_2 )
            {
             before(grammarAccess.getSumujAccess().getDiceexprsumAssignment_2()); 
            // InternalMyDsl.g:1606:2: ( rule__Sumuj__DiceexprsumAssignment_2 )
            // InternalMyDsl.g:1606:3: rule__Sumuj__DiceexprsumAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Sumuj__DiceexprsumAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getSumujAccess().getDiceexprsumAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sumuj__Group__2__Impl"


    // $ANTLR start "rule__Sumuj__Group__3"
    // InternalMyDsl.g:1614:1: rule__Sumuj__Group__3 : rule__Sumuj__Group__3__Impl rule__Sumuj__Group__4 ;
    public final void rule__Sumuj__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1618:1: ( rule__Sumuj__Group__3__Impl rule__Sumuj__Group__4 )
            // InternalMyDsl.g:1619:2: rule__Sumuj__Group__3__Impl rule__Sumuj__Group__4
            {
            pushFollow(FOLLOW_4);
            rule__Sumuj__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Sumuj__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sumuj__Group__3"


    // $ANTLR start "rule__Sumuj__Group__3__Impl"
    // InternalMyDsl.g:1626:1: rule__Sumuj__Group__3__Impl : ( ( rule__Sumuj__Group_3__0 )* ) ;
    public final void rule__Sumuj__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1630:1: ( ( ( rule__Sumuj__Group_3__0 )* ) )
            // InternalMyDsl.g:1631:1: ( ( rule__Sumuj__Group_3__0 )* )
            {
            // InternalMyDsl.g:1631:1: ( ( rule__Sumuj__Group_3__0 )* )
            // InternalMyDsl.g:1632:2: ( rule__Sumuj__Group_3__0 )*
            {
             before(grammarAccess.getSumujAccess().getGroup_3()); 
            // InternalMyDsl.g:1633:2: ( rule__Sumuj__Group_3__0 )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==28) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // InternalMyDsl.g:1633:3: rule__Sumuj__Group_3__0
            	    {
            	    pushFollow(FOLLOW_5);
            	    rule__Sumuj__Group_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop17;
                }
            } while (true);

             after(grammarAccess.getSumujAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sumuj__Group__3__Impl"


    // $ANTLR start "rule__Sumuj__Group__4"
    // InternalMyDsl.g:1641:1: rule__Sumuj__Group__4 : rule__Sumuj__Group__4__Impl rule__Sumuj__Group__5 ;
    public final void rule__Sumuj__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1645:1: ( rule__Sumuj__Group__4__Impl rule__Sumuj__Group__5 )
            // InternalMyDsl.g:1646:2: rule__Sumuj__Group__4__Impl rule__Sumuj__Group__5
            {
            pushFollow(FOLLOW_4);
            rule__Sumuj__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Sumuj__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sumuj__Group__4"


    // $ANTLR start "rule__Sumuj__Group__4__Impl"
    // InternalMyDsl.g:1653:1: rule__Sumuj__Group__4__Impl : ( ( '\\n' )? ) ;
    public final void rule__Sumuj__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1657:1: ( ( ( '\\n' )? ) )
            // InternalMyDsl.g:1658:1: ( ( '\\n' )? )
            {
            // InternalMyDsl.g:1658:1: ( ( '\\n' )? )
            // InternalMyDsl.g:1659:2: ( '\\n' )?
            {
             before(grammarAccess.getSumujAccess().getLineFeedKeyword_4()); 
            // InternalMyDsl.g:1660:2: ( '\\n' )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==27) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // InternalMyDsl.g:1660:3: '\\n'
                    {
                    match(input,27,FOLLOW_2); 

                    }
                    break;

            }

             after(grammarAccess.getSumujAccess().getLineFeedKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sumuj__Group__4__Impl"


    // $ANTLR start "rule__Sumuj__Group__5"
    // InternalMyDsl.g:1668:1: rule__Sumuj__Group__5 : rule__Sumuj__Group__5__Impl ;
    public final void rule__Sumuj__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1672:1: ( rule__Sumuj__Group__5__Impl )
            // InternalMyDsl.g:1673:2: rule__Sumuj__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Sumuj__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sumuj__Group__5"


    // $ANTLR start "rule__Sumuj__Group__5__Impl"
    // InternalMyDsl.g:1679:1: rule__Sumuj__Group__5__Impl : ( ( rule__Sumuj__Alternatives_5 )? ) ;
    public final void rule__Sumuj__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1683:1: ( ( ( rule__Sumuj__Alternatives_5 )? ) )
            // InternalMyDsl.g:1684:1: ( ( rule__Sumuj__Alternatives_5 )? )
            {
            // InternalMyDsl.g:1684:1: ( ( rule__Sumuj__Alternatives_5 )? )
            // InternalMyDsl.g:1685:2: ( rule__Sumuj__Alternatives_5 )?
            {
             before(grammarAccess.getSumujAccess().getAlternatives_5()); 
            // InternalMyDsl.g:1686:2: ( rule__Sumuj__Alternatives_5 )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( ((LA19_0>=12 && LA19_0<=13)) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // InternalMyDsl.g:1686:3: rule__Sumuj__Alternatives_5
                    {
                    pushFollow(FOLLOW_2);
                    rule__Sumuj__Alternatives_5();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getSumujAccess().getAlternatives_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sumuj__Group__5__Impl"


    // $ANTLR start "rule__Sumuj__Group_3__0"
    // InternalMyDsl.g:1695:1: rule__Sumuj__Group_3__0 : rule__Sumuj__Group_3__0__Impl rule__Sumuj__Group_3__1 ;
    public final void rule__Sumuj__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1699:1: ( rule__Sumuj__Group_3__0__Impl rule__Sumuj__Group_3__1 )
            // InternalMyDsl.g:1700:2: rule__Sumuj__Group_3__0__Impl rule__Sumuj__Group_3__1
            {
            pushFollow(FOLLOW_3);
            rule__Sumuj__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Sumuj__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sumuj__Group_3__0"


    // $ANTLR start "rule__Sumuj__Group_3__0__Impl"
    // InternalMyDsl.g:1707:1: rule__Sumuj__Group_3__0__Impl : ( ';' ) ;
    public final void rule__Sumuj__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1711:1: ( ( ';' ) )
            // InternalMyDsl.g:1712:1: ( ';' )
            {
            // InternalMyDsl.g:1712:1: ( ';' )
            // InternalMyDsl.g:1713:2: ';'
            {
             before(grammarAccess.getSumujAccess().getSemicolonKeyword_3_0()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getSumujAccess().getSemicolonKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sumuj__Group_3__0__Impl"


    // $ANTLR start "rule__Sumuj__Group_3__1"
    // InternalMyDsl.g:1722:1: rule__Sumuj__Group_3__1 : rule__Sumuj__Group_3__1__Impl ;
    public final void rule__Sumuj__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1726:1: ( rule__Sumuj__Group_3__1__Impl )
            // InternalMyDsl.g:1727:2: rule__Sumuj__Group_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Sumuj__Group_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sumuj__Group_3__1"


    // $ANTLR start "rule__Sumuj__Group_3__1__Impl"
    // InternalMyDsl.g:1733:1: rule__Sumuj__Group_3__1__Impl : ( ( rule__Sumuj__DiceexprsumAssignment_3_1 ) ) ;
    public final void rule__Sumuj__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1737:1: ( ( ( rule__Sumuj__DiceexprsumAssignment_3_1 ) ) )
            // InternalMyDsl.g:1738:1: ( ( rule__Sumuj__DiceexprsumAssignment_3_1 ) )
            {
            // InternalMyDsl.g:1738:1: ( ( rule__Sumuj__DiceexprsumAssignment_3_1 ) )
            // InternalMyDsl.g:1739:2: ( rule__Sumuj__DiceexprsumAssignment_3_1 )
            {
             before(grammarAccess.getSumujAccess().getDiceexprsumAssignment_3_1()); 
            // InternalMyDsl.g:1740:2: ( rule__Sumuj__DiceexprsumAssignment_3_1 )
            // InternalMyDsl.g:1740:3: rule__Sumuj__DiceexprsumAssignment_3_1
            {
            pushFollow(FOLLOW_2);
            rule__Sumuj__DiceexprsumAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getSumujAccess().getDiceexprsumAssignment_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sumuj__Group_3__1__Impl"


    // $ANTLR start "rule__Sukcesy__Group__0"
    // InternalMyDsl.g:1749:1: rule__Sukcesy__Group__0 : rule__Sukcesy__Group__0__Impl rule__Sukcesy__Group__1 ;
    public final void rule__Sukcesy__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1753:1: ( rule__Sukcesy__Group__0__Impl rule__Sukcesy__Group__1 )
            // InternalMyDsl.g:1754:2: rule__Sukcesy__Group__0__Impl rule__Sukcesy__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__Sukcesy__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Sukcesy__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sukcesy__Group__0"


    // $ANTLR start "rule__Sukcesy__Group__0__Impl"
    // InternalMyDsl.g:1761:1: rule__Sukcesy__Group__0__Impl : ( 'Sukcesy' ) ;
    public final void rule__Sukcesy__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1765:1: ( ( 'Sukcesy' ) )
            // InternalMyDsl.g:1766:1: ( 'Sukcesy' )
            {
            // InternalMyDsl.g:1766:1: ( 'Sukcesy' )
            // InternalMyDsl.g:1767:2: 'Sukcesy'
            {
             before(grammarAccess.getSukcesyAccess().getSukcesyKeyword_0()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getSukcesyAccess().getSukcesyKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sukcesy__Group__0__Impl"


    // $ANTLR start "rule__Sukcesy__Group__1"
    // InternalMyDsl.g:1776:1: rule__Sukcesy__Group__1 : rule__Sukcesy__Group__1__Impl rule__Sukcesy__Group__2 ;
    public final void rule__Sukcesy__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1780:1: ( rule__Sukcesy__Group__1__Impl rule__Sukcesy__Group__2 )
            // InternalMyDsl.g:1781:2: rule__Sukcesy__Group__1__Impl rule__Sukcesy__Group__2
            {
            pushFollow(FOLLOW_3);
            rule__Sukcesy__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Sukcesy__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sukcesy__Group__1"


    // $ANTLR start "rule__Sukcesy__Group__1__Impl"
    // InternalMyDsl.g:1788:1: rule__Sukcesy__Group__1__Impl : ( ( '\\n' )? ) ;
    public final void rule__Sukcesy__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1792:1: ( ( ( '\\n' )? ) )
            // InternalMyDsl.g:1793:1: ( ( '\\n' )? )
            {
            // InternalMyDsl.g:1793:1: ( ( '\\n' )? )
            // InternalMyDsl.g:1794:2: ( '\\n' )?
            {
             before(grammarAccess.getSukcesyAccess().getLineFeedKeyword_1()); 
            // InternalMyDsl.g:1795:2: ( '\\n' )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==27) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // InternalMyDsl.g:1795:3: '\\n'
                    {
                    match(input,27,FOLLOW_2); 

                    }
                    break;

            }

             after(grammarAccess.getSukcesyAccess().getLineFeedKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sukcesy__Group__1__Impl"


    // $ANTLR start "rule__Sukcesy__Group__2"
    // InternalMyDsl.g:1803:1: rule__Sukcesy__Group__2 : rule__Sukcesy__Group__2__Impl rule__Sukcesy__Group__3 ;
    public final void rule__Sukcesy__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1807:1: ( rule__Sukcesy__Group__2__Impl rule__Sukcesy__Group__3 )
            // InternalMyDsl.g:1808:2: rule__Sukcesy__Group__2__Impl rule__Sukcesy__Group__3
            {
            pushFollow(FOLLOW_4);
            rule__Sukcesy__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Sukcesy__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sukcesy__Group__2"


    // $ANTLR start "rule__Sukcesy__Group__2__Impl"
    // InternalMyDsl.g:1815:1: rule__Sukcesy__Group__2__Impl : ( ( rule__Sukcesy__DiceexprsukAssignment_2 ) ) ;
    public final void rule__Sukcesy__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1819:1: ( ( ( rule__Sukcesy__DiceexprsukAssignment_2 ) ) )
            // InternalMyDsl.g:1820:1: ( ( rule__Sukcesy__DiceexprsukAssignment_2 ) )
            {
            // InternalMyDsl.g:1820:1: ( ( rule__Sukcesy__DiceexprsukAssignment_2 ) )
            // InternalMyDsl.g:1821:2: ( rule__Sukcesy__DiceexprsukAssignment_2 )
            {
             before(grammarAccess.getSukcesyAccess().getDiceexprsukAssignment_2()); 
            // InternalMyDsl.g:1822:2: ( rule__Sukcesy__DiceexprsukAssignment_2 )
            // InternalMyDsl.g:1822:3: rule__Sukcesy__DiceexprsukAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Sukcesy__DiceexprsukAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getSukcesyAccess().getDiceexprsukAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sukcesy__Group__2__Impl"


    // $ANTLR start "rule__Sukcesy__Group__3"
    // InternalMyDsl.g:1830:1: rule__Sukcesy__Group__3 : rule__Sukcesy__Group__3__Impl rule__Sukcesy__Group__4 ;
    public final void rule__Sukcesy__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1834:1: ( rule__Sukcesy__Group__3__Impl rule__Sukcesy__Group__4 )
            // InternalMyDsl.g:1835:2: rule__Sukcesy__Group__3__Impl rule__Sukcesy__Group__4
            {
            pushFollow(FOLLOW_4);
            rule__Sukcesy__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Sukcesy__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sukcesy__Group__3"


    // $ANTLR start "rule__Sukcesy__Group__3__Impl"
    // InternalMyDsl.g:1842:1: rule__Sukcesy__Group__3__Impl : ( ( rule__Sukcesy__Group_3__0 )* ) ;
    public final void rule__Sukcesy__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1846:1: ( ( ( rule__Sukcesy__Group_3__0 )* ) )
            // InternalMyDsl.g:1847:1: ( ( rule__Sukcesy__Group_3__0 )* )
            {
            // InternalMyDsl.g:1847:1: ( ( rule__Sukcesy__Group_3__0 )* )
            // InternalMyDsl.g:1848:2: ( rule__Sukcesy__Group_3__0 )*
            {
             before(grammarAccess.getSukcesyAccess().getGroup_3()); 
            // InternalMyDsl.g:1849:2: ( rule__Sukcesy__Group_3__0 )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==28) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // InternalMyDsl.g:1849:3: rule__Sukcesy__Group_3__0
            	    {
            	    pushFollow(FOLLOW_5);
            	    rule__Sukcesy__Group_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop21;
                }
            } while (true);

             after(grammarAccess.getSukcesyAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sukcesy__Group__3__Impl"


    // $ANTLR start "rule__Sukcesy__Group__4"
    // InternalMyDsl.g:1857:1: rule__Sukcesy__Group__4 : rule__Sukcesy__Group__4__Impl rule__Sukcesy__Group__5 ;
    public final void rule__Sukcesy__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1861:1: ( rule__Sukcesy__Group__4__Impl rule__Sukcesy__Group__5 )
            // InternalMyDsl.g:1862:2: rule__Sukcesy__Group__4__Impl rule__Sukcesy__Group__5
            {
            pushFollow(FOLLOW_4);
            rule__Sukcesy__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Sukcesy__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sukcesy__Group__4"


    // $ANTLR start "rule__Sukcesy__Group__4__Impl"
    // InternalMyDsl.g:1869:1: rule__Sukcesy__Group__4__Impl : ( ( '\\n' )? ) ;
    public final void rule__Sukcesy__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1873:1: ( ( ( '\\n' )? ) )
            // InternalMyDsl.g:1874:1: ( ( '\\n' )? )
            {
            // InternalMyDsl.g:1874:1: ( ( '\\n' )? )
            // InternalMyDsl.g:1875:2: ( '\\n' )?
            {
             before(grammarAccess.getSukcesyAccess().getLineFeedKeyword_4()); 
            // InternalMyDsl.g:1876:2: ( '\\n' )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==27) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // InternalMyDsl.g:1876:3: '\\n'
                    {
                    match(input,27,FOLLOW_2); 

                    }
                    break;

            }

             after(grammarAccess.getSukcesyAccess().getLineFeedKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sukcesy__Group__4__Impl"


    // $ANTLR start "rule__Sukcesy__Group__5"
    // InternalMyDsl.g:1884:1: rule__Sukcesy__Group__5 : rule__Sukcesy__Group__5__Impl ;
    public final void rule__Sukcesy__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1888:1: ( rule__Sukcesy__Group__5__Impl )
            // InternalMyDsl.g:1889:2: rule__Sukcesy__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Sukcesy__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sukcesy__Group__5"


    // $ANTLR start "rule__Sukcesy__Group__5__Impl"
    // InternalMyDsl.g:1895:1: rule__Sukcesy__Group__5__Impl : ( ( rule__Sukcesy__Alternatives_5 )? ) ;
    public final void rule__Sukcesy__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1899:1: ( ( ( rule__Sukcesy__Alternatives_5 )? ) )
            // InternalMyDsl.g:1900:1: ( ( rule__Sukcesy__Alternatives_5 )? )
            {
            // InternalMyDsl.g:1900:1: ( ( rule__Sukcesy__Alternatives_5 )? )
            // InternalMyDsl.g:1901:2: ( rule__Sukcesy__Alternatives_5 )?
            {
             before(grammarAccess.getSukcesyAccess().getAlternatives_5()); 
            // InternalMyDsl.g:1902:2: ( rule__Sukcesy__Alternatives_5 )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( ((LA23_0>=12 && LA23_0<=13)) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // InternalMyDsl.g:1902:3: rule__Sukcesy__Alternatives_5
                    {
                    pushFollow(FOLLOW_2);
                    rule__Sukcesy__Alternatives_5();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getSukcesyAccess().getAlternatives_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sukcesy__Group__5__Impl"


    // $ANTLR start "rule__Sukcesy__Group_3__0"
    // InternalMyDsl.g:1911:1: rule__Sukcesy__Group_3__0 : rule__Sukcesy__Group_3__0__Impl rule__Sukcesy__Group_3__1 ;
    public final void rule__Sukcesy__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1915:1: ( rule__Sukcesy__Group_3__0__Impl rule__Sukcesy__Group_3__1 )
            // InternalMyDsl.g:1916:2: rule__Sukcesy__Group_3__0__Impl rule__Sukcesy__Group_3__1
            {
            pushFollow(FOLLOW_3);
            rule__Sukcesy__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Sukcesy__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sukcesy__Group_3__0"


    // $ANTLR start "rule__Sukcesy__Group_3__0__Impl"
    // InternalMyDsl.g:1923:1: rule__Sukcesy__Group_3__0__Impl : ( ';' ) ;
    public final void rule__Sukcesy__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1927:1: ( ( ';' ) )
            // InternalMyDsl.g:1928:1: ( ';' )
            {
            // InternalMyDsl.g:1928:1: ( ';' )
            // InternalMyDsl.g:1929:2: ';'
            {
             before(grammarAccess.getSukcesyAccess().getSemicolonKeyword_3_0()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getSukcesyAccess().getSemicolonKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sukcesy__Group_3__0__Impl"


    // $ANTLR start "rule__Sukcesy__Group_3__1"
    // InternalMyDsl.g:1938:1: rule__Sukcesy__Group_3__1 : rule__Sukcesy__Group_3__1__Impl ;
    public final void rule__Sukcesy__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1942:1: ( rule__Sukcesy__Group_3__1__Impl )
            // InternalMyDsl.g:1943:2: rule__Sukcesy__Group_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Sukcesy__Group_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sukcesy__Group_3__1"


    // $ANTLR start "rule__Sukcesy__Group_3__1__Impl"
    // InternalMyDsl.g:1949:1: rule__Sukcesy__Group_3__1__Impl : ( ( rule__Sukcesy__DiceexprsukAssignment_3_1 ) ) ;
    public final void rule__Sukcesy__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1953:1: ( ( ( rule__Sukcesy__DiceexprsukAssignment_3_1 ) ) )
            // InternalMyDsl.g:1954:1: ( ( rule__Sukcesy__DiceexprsukAssignment_3_1 ) )
            {
            // InternalMyDsl.g:1954:1: ( ( rule__Sukcesy__DiceexprsukAssignment_3_1 ) )
            // InternalMyDsl.g:1955:2: ( rule__Sukcesy__DiceexprsukAssignment_3_1 )
            {
             before(grammarAccess.getSukcesyAccess().getDiceexprsukAssignment_3_1()); 
            // InternalMyDsl.g:1956:2: ( rule__Sukcesy__DiceexprsukAssignment_3_1 )
            // InternalMyDsl.g:1956:3: rule__Sukcesy__DiceexprsukAssignment_3_1
            {
            pushFollow(FOLLOW_2);
            rule__Sukcesy__DiceexprsukAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getSukcesyAccess().getDiceexprsukAssignment_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sukcesy__Group_3__1__Impl"


    // $ANTLR start "rule__DiceExprSum__Group__0"
    // InternalMyDsl.g:1965:1: rule__DiceExprSum__Group__0 : rule__DiceExprSum__Group__0__Impl rule__DiceExprSum__Group__1 ;
    public final void rule__DiceExprSum__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1969:1: ( rule__DiceExprSum__Group__0__Impl rule__DiceExprSum__Group__1 )
            // InternalMyDsl.g:1970:2: rule__DiceExprSum__Group__0__Impl rule__DiceExprSum__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__DiceExprSum__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DiceExprSum__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DiceExprSum__Group__0"


    // $ANTLR start "rule__DiceExprSum__Group__0__Impl"
    // InternalMyDsl.g:1977:1: rule__DiceExprSum__Group__0__Impl : ( ( rule__DiceExprSum__SignAssignment_0 )? ) ;
    public final void rule__DiceExprSum__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1981:1: ( ( ( rule__DiceExprSum__SignAssignment_0 )? ) )
            // InternalMyDsl.g:1982:1: ( ( rule__DiceExprSum__SignAssignment_0 )? )
            {
            // InternalMyDsl.g:1982:1: ( ( rule__DiceExprSum__SignAssignment_0 )? )
            // InternalMyDsl.g:1983:2: ( rule__DiceExprSum__SignAssignment_0 )?
            {
             before(grammarAccess.getDiceExprSumAccess().getSignAssignment_0()); 
            // InternalMyDsl.g:1984:2: ( rule__DiceExprSum__SignAssignment_0 )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( ((LA24_0>=14 && LA24_0<=17)) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // InternalMyDsl.g:1984:3: rule__DiceExprSum__SignAssignment_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__DiceExprSum__SignAssignment_0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getDiceExprSumAccess().getSignAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DiceExprSum__Group__0__Impl"


    // $ANTLR start "rule__DiceExprSum__Group__1"
    // InternalMyDsl.g:1992:1: rule__DiceExprSum__Group__1 : rule__DiceExprSum__Group__1__Impl rule__DiceExprSum__Group__2 ;
    public final void rule__DiceExprSum__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1996:1: ( rule__DiceExprSum__Group__1__Impl rule__DiceExprSum__Group__2 )
            // InternalMyDsl.g:1997:2: rule__DiceExprSum__Group__1__Impl rule__DiceExprSum__Group__2
            {
            pushFollow(FOLLOW_6);
            rule__DiceExprSum__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DiceExprSum__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DiceExprSum__Group__1"


    // $ANTLR start "rule__DiceExprSum__Group__1__Impl"
    // InternalMyDsl.g:2004:1: rule__DiceExprSum__Group__1__Impl : ( ( rule__DiceExprSum__MulexprAssignment_1 ) ) ;
    public final void rule__DiceExprSum__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2008:1: ( ( ( rule__DiceExprSum__MulexprAssignment_1 ) ) )
            // InternalMyDsl.g:2009:1: ( ( rule__DiceExprSum__MulexprAssignment_1 ) )
            {
            // InternalMyDsl.g:2009:1: ( ( rule__DiceExprSum__MulexprAssignment_1 ) )
            // InternalMyDsl.g:2010:2: ( rule__DiceExprSum__MulexprAssignment_1 )
            {
             before(grammarAccess.getDiceExprSumAccess().getMulexprAssignment_1()); 
            // InternalMyDsl.g:2011:2: ( rule__DiceExprSum__MulexprAssignment_1 )
            // InternalMyDsl.g:2011:3: rule__DiceExprSum__MulexprAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__DiceExprSum__MulexprAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getDiceExprSumAccess().getMulexprAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DiceExprSum__Group__1__Impl"


    // $ANTLR start "rule__DiceExprSum__Group__2"
    // InternalMyDsl.g:2019:1: rule__DiceExprSum__Group__2 : rule__DiceExprSum__Group__2__Impl ;
    public final void rule__DiceExprSum__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2023:1: ( rule__DiceExprSum__Group__2__Impl )
            // InternalMyDsl.g:2024:2: rule__DiceExprSum__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__DiceExprSum__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DiceExprSum__Group__2"


    // $ANTLR start "rule__DiceExprSum__Group__2__Impl"
    // InternalMyDsl.g:2030:1: rule__DiceExprSum__Group__2__Impl : ( ( rule__DiceExprSum__Group_2__0 )? ) ;
    public final void rule__DiceExprSum__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2034:1: ( ( ( rule__DiceExprSum__Group_2__0 )? ) )
            // InternalMyDsl.g:2035:1: ( ( rule__DiceExprSum__Group_2__0 )? )
            {
            // InternalMyDsl.g:2035:1: ( ( rule__DiceExprSum__Group_2__0 )? )
            // InternalMyDsl.g:2036:2: ( rule__DiceExprSum__Group_2__0 )?
            {
             before(grammarAccess.getDiceExprSumAccess().getGroup_2()); 
            // InternalMyDsl.g:2037:2: ( rule__DiceExprSum__Group_2__0 )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==30) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // InternalMyDsl.g:2037:3: rule__DiceExprSum__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__DiceExprSum__Group_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getDiceExprSumAccess().getGroup_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DiceExprSum__Group__2__Impl"


    // $ANTLR start "rule__DiceExprSum__Group_2__0"
    // InternalMyDsl.g:2046:1: rule__DiceExprSum__Group_2__0 : rule__DiceExprSum__Group_2__0__Impl rule__DiceExprSum__Group_2__1 ;
    public final void rule__DiceExprSum__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2050:1: ( rule__DiceExprSum__Group_2__0__Impl rule__DiceExprSum__Group_2__1 )
            // InternalMyDsl.g:2051:2: rule__DiceExprSum__Group_2__0__Impl rule__DiceExprSum__Group_2__1
            {
            pushFollow(FOLLOW_7);
            rule__DiceExprSum__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DiceExprSum__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DiceExprSum__Group_2__0"


    // $ANTLR start "rule__DiceExprSum__Group_2__0__Impl"
    // InternalMyDsl.g:2058:1: rule__DiceExprSum__Group_2__0__Impl : ( ':' ) ;
    public final void rule__DiceExprSum__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2062:1: ( ( ':' ) )
            // InternalMyDsl.g:2063:1: ( ':' )
            {
            // InternalMyDsl.g:2063:1: ( ':' )
            // InternalMyDsl.g:2064:2: ':'
            {
             before(grammarAccess.getDiceExprSumAccess().getColonKeyword_2_0()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getDiceExprSumAccess().getColonKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DiceExprSum__Group_2__0__Impl"


    // $ANTLR start "rule__DiceExprSum__Group_2__1"
    // InternalMyDsl.g:2073:1: rule__DiceExprSum__Group_2__1 : rule__DiceExprSum__Group_2__1__Impl rule__DiceExprSum__Group_2__2 ;
    public final void rule__DiceExprSum__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2077:1: ( rule__DiceExprSum__Group_2__1__Impl rule__DiceExprSum__Group_2__2 )
            // InternalMyDsl.g:2078:2: rule__DiceExprSum__Group_2__1__Impl rule__DiceExprSum__Group_2__2
            {
            pushFollow(FOLLOW_8);
            rule__DiceExprSum__Group_2__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DiceExprSum__Group_2__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DiceExprSum__Group_2__1"


    // $ANTLR start "rule__DiceExprSum__Group_2__1__Impl"
    // InternalMyDsl.g:2085:1: rule__DiceExprSum__Group_2__1__Impl : ( ( rule__DiceExprSum__SumruleAssignment_2_1 ) ) ;
    public final void rule__DiceExprSum__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2089:1: ( ( ( rule__DiceExprSum__SumruleAssignment_2_1 ) ) )
            // InternalMyDsl.g:2090:1: ( ( rule__DiceExprSum__SumruleAssignment_2_1 ) )
            {
            // InternalMyDsl.g:2090:1: ( ( rule__DiceExprSum__SumruleAssignment_2_1 ) )
            // InternalMyDsl.g:2091:2: ( rule__DiceExprSum__SumruleAssignment_2_1 )
            {
             before(grammarAccess.getDiceExprSumAccess().getSumruleAssignment_2_1()); 
            // InternalMyDsl.g:2092:2: ( rule__DiceExprSum__SumruleAssignment_2_1 )
            // InternalMyDsl.g:2092:3: rule__DiceExprSum__SumruleAssignment_2_1
            {
            pushFollow(FOLLOW_2);
            rule__DiceExprSum__SumruleAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getDiceExprSumAccess().getSumruleAssignment_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DiceExprSum__Group_2__1__Impl"


    // $ANTLR start "rule__DiceExprSum__Group_2__2"
    // InternalMyDsl.g:2100:1: rule__DiceExprSum__Group_2__2 : rule__DiceExprSum__Group_2__2__Impl ;
    public final void rule__DiceExprSum__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2104:1: ( rule__DiceExprSum__Group_2__2__Impl )
            // InternalMyDsl.g:2105:2: rule__DiceExprSum__Group_2__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__DiceExprSum__Group_2__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DiceExprSum__Group_2__2"


    // $ANTLR start "rule__DiceExprSum__Group_2__2__Impl"
    // InternalMyDsl.g:2111:1: rule__DiceExprSum__Group_2__2__Impl : ( ( rule__DiceExprSum__Group_2_2__0 )* ) ;
    public final void rule__DiceExprSum__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2115:1: ( ( ( rule__DiceExprSum__Group_2_2__0 )* ) )
            // InternalMyDsl.g:2116:1: ( ( rule__DiceExprSum__Group_2_2__0 )* )
            {
            // InternalMyDsl.g:2116:1: ( ( rule__DiceExprSum__Group_2_2__0 )* )
            // InternalMyDsl.g:2117:2: ( rule__DiceExprSum__Group_2_2__0 )*
            {
             before(grammarAccess.getDiceExprSumAccess().getGroup_2_2()); 
            // InternalMyDsl.g:2118:2: ( rule__DiceExprSum__Group_2_2__0 )*
            loop26:
            do {
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( (LA26_0==13) ) {
                    int LA26_2 = input.LA(2);

                    if ( ((LA26_2>=14 && LA26_2<=17)||(LA26_2>=35 && LA26_2<=37)) ) {
                        alt26=1;
                    }


                }


                switch (alt26) {
            	case 1 :
            	    // InternalMyDsl.g:2118:3: rule__DiceExprSum__Group_2_2__0
            	    {
            	    pushFollow(FOLLOW_9);
            	    rule__DiceExprSum__Group_2_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop26;
                }
            } while (true);

             after(grammarAccess.getDiceExprSumAccess().getGroup_2_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DiceExprSum__Group_2__2__Impl"


    // $ANTLR start "rule__DiceExprSum__Group_2_2__0"
    // InternalMyDsl.g:2127:1: rule__DiceExprSum__Group_2_2__0 : rule__DiceExprSum__Group_2_2__0__Impl rule__DiceExprSum__Group_2_2__1 ;
    public final void rule__DiceExprSum__Group_2_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2131:1: ( rule__DiceExprSum__Group_2_2__0__Impl rule__DiceExprSum__Group_2_2__1 )
            // InternalMyDsl.g:2132:2: rule__DiceExprSum__Group_2_2__0__Impl rule__DiceExprSum__Group_2_2__1
            {
            pushFollow(FOLLOW_7);
            rule__DiceExprSum__Group_2_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DiceExprSum__Group_2_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DiceExprSum__Group_2_2__0"


    // $ANTLR start "rule__DiceExprSum__Group_2_2__0__Impl"
    // InternalMyDsl.g:2139:1: rule__DiceExprSum__Group_2_2__0__Impl : ( ',' ) ;
    public final void rule__DiceExprSum__Group_2_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2143:1: ( ( ',' ) )
            // InternalMyDsl.g:2144:1: ( ',' )
            {
            // InternalMyDsl.g:2144:1: ( ',' )
            // InternalMyDsl.g:2145:2: ','
            {
             before(grammarAccess.getDiceExprSumAccess().getCommaKeyword_2_2_0()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getDiceExprSumAccess().getCommaKeyword_2_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DiceExprSum__Group_2_2__0__Impl"


    // $ANTLR start "rule__DiceExprSum__Group_2_2__1"
    // InternalMyDsl.g:2154:1: rule__DiceExprSum__Group_2_2__1 : rule__DiceExprSum__Group_2_2__1__Impl ;
    public final void rule__DiceExprSum__Group_2_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2158:1: ( rule__DiceExprSum__Group_2_2__1__Impl )
            // InternalMyDsl.g:2159:2: rule__DiceExprSum__Group_2_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__DiceExprSum__Group_2_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DiceExprSum__Group_2_2__1"


    // $ANTLR start "rule__DiceExprSum__Group_2_2__1__Impl"
    // InternalMyDsl.g:2165:1: rule__DiceExprSum__Group_2_2__1__Impl : ( ( rule__DiceExprSum__SumruleAssignment_2_2_1 ) ) ;
    public final void rule__DiceExprSum__Group_2_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2169:1: ( ( ( rule__DiceExprSum__SumruleAssignment_2_2_1 ) ) )
            // InternalMyDsl.g:2170:1: ( ( rule__DiceExprSum__SumruleAssignment_2_2_1 ) )
            {
            // InternalMyDsl.g:2170:1: ( ( rule__DiceExprSum__SumruleAssignment_2_2_1 ) )
            // InternalMyDsl.g:2171:2: ( rule__DiceExprSum__SumruleAssignment_2_2_1 )
            {
             before(grammarAccess.getDiceExprSumAccess().getSumruleAssignment_2_2_1()); 
            // InternalMyDsl.g:2172:2: ( rule__DiceExprSum__SumruleAssignment_2_2_1 )
            // InternalMyDsl.g:2172:3: rule__DiceExprSum__SumruleAssignment_2_2_1
            {
            pushFollow(FOLLOW_2);
            rule__DiceExprSum__SumruleAssignment_2_2_1();

            state._fsp--;


            }

             after(grammarAccess.getDiceExprSumAccess().getSumruleAssignment_2_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DiceExprSum__Group_2_2__1__Impl"


    // $ANTLR start "rule__DiceExprSuk__Group__0"
    // InternalMyDsl.g:2181:1: rule__DiceExprSuk__Group__0 : rule__DiceExprSuk__Group__0__Impl rule__DiceExprSuk__Group__1 ;
    public final void rule__DiceExprSuk__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2185:1: ( rule__DiceExprSuk__Group__0__Impl rule__DiceExprSuk__Group__1 )
            // InternalMyDsl.g:2186:2: rule__DiceExprSuk__Group__0__Impl rule__DiceExprSuk__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__DiceExprSuk__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DiceExprSuk__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DiceExprSuk__Group__0"


    // $ANTLR start "rule__DiceExprSuk__Group__0__Impl"
    // InternalMyDsl.g:2193:1: rule__DiceExprSuk__Group__0__Impl : ( ( rule__DiceExprSuk__SignAssignment_0 )? ) ;
    public final void rule__DiceExprSuk__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2197:1: ( ( ( rule__DiceExprSuk__SignAssignment_0 )? ) )
            // InternalMyDsl.g:2198:1: ( ( rule__DiceExprSuk__SignAssignment_0 )? )
            {
            // InternalMyDsl.g:2198:1: ( ( rule__DiceExprSuk__SignAssignment_0 )? )
            // InternalMyDsl.g:2199:2: ( rule__DiceExprSuk__SignAssignment_0 )?
            {
             before(grammarAccess.getDiceExprSukAccess().getSignAssignment_0()); 
            // InternalMyDsl.g:2200:2: ( rule__DiceExprSuk__SignAssignment_0 )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( ((LA27_0>=14 && LA27_0<=17)) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // InternalMyDsl.g:2200:3: rule__DiceExprSuk__SignAssignment_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__DiceExprSuk__SignAssignment_0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getDiceExprSukAccess().getSignAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DiceExprSuk__Group__0__Impl"


    // $ANTLR start "rule__DiceExprSuk__Group__1"
    // InternalMyDsl.g:2208:1: rule__DiceExprSuk__Group__1 : rule__DiceExprSuk__Group__1__Impl rule__DiceExprSuk__Group__2 ;
    public final void rule__DiceExprSuk__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2212:1: ( rule__DiceExprSuk__Group__1__Impl rule__DiceExprSuk__Group__2 )
            // InternalMyDsl.g:2213:2: rule__DiceExprSuk__Group__1__Impl rule__DiceExprSuk__Group__2
            {
            pushFollow(FOLLOW_6);
            rule__DiceExprSuk__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DiceExprSuk__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DiceExprSuk__Group__1"


    // $ANTLR start "rule__DiceExprSuk__Group__1__Impl"
    // InternalMyDsl.g:2220:1: rule__DiceExprSuk__Group__1__Impl : ( ( rule__DiceExprSuk__MulexprAssignment_1 ) ) ;
    public final void rule__DiceExprSuk__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2224:1: ( ( ( rule__DiceExprSuk__MulexprAssignment_1 ) ) )
            // InternalMyDsl.g:2225:1: ( ( rule__DiceExprSuk__MulexprAssignment_1 ) )
            {
            // InternalMyDsl.g:2225:1: ( ( rule__DiceExprSuk__MulexprAssignment_1 ) )
            // InternalMyDsl.g:2226:2: ( rule__DiceExprSuk__MulexprAssignment_1 )
            {
             before(grammarAccess.getDiceExprSukAccess().getMulexprAssignment_1()); 
            // InternalMyDsl.g:2227:2: ( rule__DiceExprSuk__MulexprAssignment_1 )
            // InternalMyDsl.g:2227:3: rule__DiceExprSuk__MulexprAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__DiceExprSuk__MulexprAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getDiceExprSukAccess().getMulexprAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DiceExprSuk__Group__1__Impl"


    // $ANTLR start "rule__DiceExprSuk__Group__2"
    // InternalMyDsl.g:2235:1: rule__DiceExprSuk__Group__2 : rule__DiceExprSuk__Group__2__Impl ;
    public final void rule__DiceExprSuk__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2239:1: ( rule__DiceExprSuk__Group__2__Impl )
            // InternalMyDsl.g:2240:2: rule__DiceExprSuk__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__DiceExprSuk__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DiceExprSuk__Group__2"


    // $ANTLR start "rule__DiceExprSuk__Group__2__Impl"
    // InternalMyDsl.g:2246:1: rule__DiceExprSuk__Group__2__Impl : ( ( rule__DiceExprSuk__Group_2__0 )? ) ;
    public final void rule__DiceExprSuk__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2250:1: ( ( ( rule__DiceExprSuk__Group_2__0 )? ) )
            // InternalMyDsl.g:2251:1: ( ( rule__DiceExprSuk__Group_2__0 )? )
            {
            // InternalMyDsl.g:2251:1: ( ( rule__DiceExprSuk__Group_2__0 )? )
            // InternalMyDsl.g:2252:2: ( rule__DiceExprSuk__Group_2__0 )?
            {
             before(grammarAccess.getDiceExprSukAccess().getGroup_2()); 
            // InternalMyDsl.g:2253:2: ( rule__DiceExprSuk__Group_2__0 )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==30) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // InternalMyDsl.g:2253:3: rule__DiceExprSuk__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__DiceExprSuk__Group_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getDiceExprSukAccess().getGroup_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DiceExprSuk__Group__2__Impl"


    // $ANTLR start "rule__DiceExprSuk__Group_2__0"
    // InternalMyDsl.g:2262:1: rule__DiceExprSuk__Group_2__0 : rule__DiceExprSuk__Group_2__0__Impl rule__DiceExprSuk__Group_2__1 ;
    public final void rule__DiceExprSuk__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2266:1: ( rule__DiceExprSuk__Group_2__0__Impl rule__DiceExprSuk__Group_2__1 )
            // InternalMyDsl.g:2267:2: rule__DiceExprSuk__Group_2__0__Impl rule__DiceExprSuk__Group_2__1
            {
            pushFollow(FOLLOW_10);
            rule__DiceExprSuk__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DiceExprSuk__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DiceExprSuk__Group_2__0"


    // $ANTLR start "rule__DiceExprSuk__Group_2__0__Impl"
    // InternalMyDsl.g:2274:1: rule__DiceExprSuk__Group_2__0__Impl : ( ':' ) ;
    public final void rule__DiceExprSuk__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2278:1: ( ( ':' ) )
            // InternalMyDsl.g:2279:1: ( ':' )
            {
            // InternalMyDsl.g:2279:1: ( ':' )
            // InternalMyDsl.g:2280:2: ':'
            {
             before(grammarAccess.getDiceExprSukAccess().getColonKeyword_2_0()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getDiceExprSukAccess().getColonKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DiceExprSuk__Group_2__0__Impl"


    // $ANTLR start "rule__DiceExprSuk__Group_2__1"
    // InternalMyDsl.g:2289:1: rule__DiceExprSuk__Group_2__1 : rule__DiceExprSuk__Group_2__1__Impl rule__DiceExprSuk__Group_2__2 ;
    public final void rule__DiceExprSuk__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2293:1: ( rule__DiceExprSuk__Group_2__1__Impl rule__DiceExprSuk__Group_2__2 )
            // InternalMyDsl.g:2294:2: rule__DiceExprSuk__Group_2__1__Impl rule__DiceExprSuk__Group_2__2
            {
            pushFollow(FOLLOW_8);
            rule__DiceExprSuk__Group_2__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DiceExprSuk__Group_2__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DiceExprSuk__Group_2__1"


    // $ANTLR start "rule__DiceExprSuk__Group_2__1__Impl"
    // InternalMyDsl.g:2301:1: rule__DiceExprSuk__Group_2__1__Impl : ( ( rule__DiceExprSuk__SuccessruleAssignment_2_1 ) ) ;
    public final void rule__DiceExprSuk__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2305:1: ( ( ( rule__DiceExprSuk__SuccessruleAssignment_2_1 ) ) )
            // InternalMyDsl.g:2306:1: ( ( rule__DiceExprSuk__SuccessruleAssignment_2_1 ) )
            {
            // InternalMyDsl.g:2306:1: ( ( rule__DiceExprSuk__SuccessruleAssignment_2_1 ) )
            // InternalMyDsl.g:2307:2: ( rule__DiceExprSuk__SuccessruleAssignment_2_1 )
            {
             before(grammarAccess.getDiceExprSukAccess().getSuccessruleAssignment_2_1()); 
            // InternalMyDsl.g:2308:2: ( rule__DiceExprSuk__SuccessruleAssignment_2_1 )
            // InternalMyDsl.g:2308:3: rule__DiceExprSuk__SuccessruleAssignment_2_1
            {
            pushFollow(FOLLOW_2);
            rule__DiceExprSuk__SuccessruleAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getDiceExprSukAccess().getSuccessruleAssignment_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DiceExprSuk__Group_2__1__Impl"


    // $ANTLR start "rule__DiceExprSuk__Group_2__2"
    // InternalMyDsl.g:2316:1: rule__DiceExprSuk__Group_2__2 : rule__DiceExprSuk__Group_2__2__Impl ;
    public final void rule__DiceExprSuk__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2320:1: ( rule__DiceExprSuk__Group_2__2__Impl )
            // InternalMyDsl.g:2321:2: rule__DiceExprSuk__Group_2__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__DiceExprSuk__Group_2__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DiceExprSuk__Group_2__2"


    // $ANTLR start "rule__DiceExprSuk__Group_2__2__Impl"
    // InternalMyDsl.g:2327:1: rule__DiceExprSuk__Group_2__2__Impl : ( ( rule__DiceExprSuk__Group_2_2__0 )* ) ;
    public final void rule__DiceExprSuk__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2331:1: ( ( ( rule__DiceExprSuk__Group_2_2__0 )* ) )
            // InternalMyDsl.g:2332:1: ( ( rule__DiceExprSuk__Group_2_2__0 )* )
            {
            // InternalMyDsl.g:2332:1: ( ( rule__DiceExprSuk__Group_2_2__0 )* )
            // InternalMyDsl.g:2333:2: ( rule__DiceExprSuk__Group_2_2__0 )*
            {
             before(grammarAccess.getDiceExprSukAccess().getGroup_2_2()); 
            // InternalMyDsl.g:2334:2: ( rule__DiceExprSuk__Group_2_2__0 )*
            loop29:
            do {
                int alt29=2;
                int LA29_0 = input.LA(1);

                if ( (LA29_0==13) ) {
                    int LA29_2 = input.LA(2);

                    if ( ((LA29_2>=35 && LA29_2<=38)) ) {
                        alt29=1;
                    }


                }


                switch (alt29) {
            	case 1 :
            	    // InternalMyDsl.g:2334:3: rule__DiceExprSuk__Group_2_2__0
            	    {
            	    pushFollow(FOLLOW_9);
            	    rule__DiceExprSuk__Group_2_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop29;
                }
            } while (true);

             after(grammarAccess.getDiceExprSukAccess().getGroup_2_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DiceExprSuk__Group_2__2__Impl"


    // $ANTLR start "rule__DiceExprSuk__Group_2_2__0"
    // InternalMyDsl.g:2343:1: rule__DiceExprSuk__Group_2_2__0 : rule__DiceExprSuk__Group_2_2__0__Impl rule__DiceExprSuk__Group_2_2__1 ;
    public final void rule__DiceExprSuk__Group_2_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2347:1: ( rule__DiceExprSuk__Group_2_2__0__Impl rule__DiceExprSuk__Group_2_2__1 )
            // InternalMyDsl.g:2348:2: rule__DiceExprSuk__Group_2_2__0__Impl rule__DiceExprSuk__Group_2_2__1
            {
            pushFollow(FOLLOW_10);
            rule__DiceExprSuk__Group_2_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DiceExprSuk__Group_2_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DiceExprSuk__Group_2_2__0"


    // $ANTLR start "rule__DiceExprSuk__Group_2_2__0__Impl"
    // InternalMyDsl.g:2355:1: rule__DiceExprSuk__Group_2_2__0__Impl : ( ',' ) ;
    public final void rule__DiceExprSuk__Group_2_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2359:1: ( ( ',' ) )
            // InternalMyDsl.g:2360:1: ( ',' )
            {
            // InternalMyDsl.g:2360:1: ( ',' )
            // InternalMyDsl.g:2361:2: ','
            {
             before(grammarAccess.getDiceExprSukAccess().getCommaKeyword_2_2_0()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getDiceExprSukAccess().getCommaKeyword_2_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DiceExprSuk__Group_2_2__0__Impl"


    // $ANTLR start "rule__DiceExprSuk__Group_2_2__1"
    // InternalMyDsl.g:2370:1: rule__DiceExprSuk__Group_2_2__1 : rule__DiceExprSuk__Group_2_2__1__Impl ;
    public final void rule__DiceExprSuk__Group_2_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2374:1: ( rule__DiceExprSuk__Group_2_2__1__Impl )
            // InternalMyDsl.g:2375:2: rule__DiceExprSuk__Group_2_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__DiceExprSuk__Group_2_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DiceExprSuk__Group_2_2__1"


    // $ANTLR start "rule__DiceExprSuk__Group_2_2__1__Impl"
    // InternalMyDsl.g:2381:1: rule__DiceExprSuk__Group_2_2__1__Impl : ( ( rule__DiceExprSuk__SuccessruleAssignment_2_2_1 ) ) ;
    public final void rule__DiceExprSuk__Group_2_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2385:1: ( ( ( rule__DiceExprSuk__SuccessruleAssignment_2_2_1 ) ) )
            // InternalMyDsl.g:2386:1: ( ( rule__DiceExprSuk__SuccessruleAssignment_2_2_1 ) )
            {
            // InternalMyDsl.g:2386:1: ( ( rule__DiceExprSuk__SuccessruleAssignment_2_2_1 ) )
            // InternalMyDsl.g:2387:2: ( rule__DiceExprSuk__SuccessruleAssignment_2_2_1 )
            {
             before(grammarAccess.getDiceExprSukAccess().getSuccessruleAssignment_2_2_1()); 
            // InternalMyDsl.g:2388:2: ( rule__DiceExprSuk__SuccessruleAssignment_2_2_1 )
            // InternalMyDsl.g:2388:3: rule__DiceExprSuk__SuccessruleAssignment_2_2_1
            {
            pushFollow(FOLLOW_2);
            rule__DiceExprSuk__SuccessruleAssignment_2_2_1();

            state._fsp--;


            }

             after(grammarAccess.getDiceExprSukAccess().getSuccessruleAssignment_2_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DiceExprSuk__Group_2_2__1__Impl"


    // $ANTLR start "rule__MulExpr__Group_0__0"
    // InternalMyDsl.g:2397:1: rule__MulExpr__Group_0__0 : rule__MulExpr__Group_0__0__Impl rule__MulExpr__Group_0__1 ;
    public final void rule__MulExpr__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2401:1: ( rule__MulExpr__Group_0__0__Impl rule__MulExpr__Group_0__1 )
            // InternalMyDsl.g:2402:2: rule__MulExpr__Group_0__0__Impl rule__MulExpr__Group_0__1
            {
            pushFollow(FOLLOW_11);
            rule__MulExpr__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MulExpr__Group_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MulExpr__Group_0__0"


    // $ANTLR start "rule__MulExpr__Group_0__0__Impl"
    // InternalMyDsl.g:2409:1: rule__MulExpr__Group_0__0__Impl : ( ( rule__MulExpr__FormexprAssignment_0_0 ) ) ;
    public final void rule__MulExpr__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2413:1: ( ( ( rule__MulExpr__FormexprAssignment_0_0 ) ) )
            // InternalMyDsl.g:2414:1: ( ( rule__MulExpr__FormexprAssignment_0_0 ) )
            {
            // InternalMyDsl.g:2414:1: ( ( rule__MulExpr__FormexprAssignment_0_0 ) )
            // InternalMyDsl.g:2415:2: ( rule__MulExpr__FormexprAssignment_0_0 )
            {
             before(grammarAccess.getMulExprAccess().getFormexprAssignment_0_0()); 
            // InternalMyDsl.g:2416:2: ( rule__MulExpr__FormexprAssignment_0_0 )
            // InternalMyDsl.g:2416:3: rule__MulExpr__FormexprAssignment_0_0
            {
            pushFollow(FOLLOW_2);
            rule__MulExpr__FormexprAssignment_0_0();

            state._fsp--;


            }

             after(grammarAccess.getMulExprAccess().getFormexprAssignment_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MulExpr__Group_0__0__Impl"


    // $ANTLR start "rule__MulExpr__Group_0__1"
    // InternalMyDsl.g:2424:1: rule__MulExpr__Group_0__1 : rule__MulExpr__Group_0__1__Impl ;
    public final void rule__MulExpr__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2428:1: ( rule__MulExpr__Group_0__1__Impl )
            // InternalMyDsl.g:2429:2: rule__MulExpr__Group_0__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__MulExpr__Group_0__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MulExpr__Group_0__1"


    // $ANTLR start "rule__MulExpr__Group_0__1__Impl"
    // InternalMyDsl.g:2435:1: rule__MulExpr__Group_0__1__Impl : ( ( rule__MulExpr__Group_0_1__0 )? ) ;
    public final void rule__MulExpr__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2439:1: ( ( ( rule__MulExpr__Group_0_1__0 )? ) )
            // InternalMyDsl.g:2440:1: ( ( rule__MulExpr__Group_0_1__0 )? )
            {
            // InternalMyDsl.g:2440:1: ( ( rule__MulExpr__Group_0_1__0 )? )
            // InternalMyDsl.g:2441:2: ( rule__MulExpr__Group_0_1__0 )?
            {
             before(grammarAccess.getMulExprAccess().getGroup_0_1()); 
            // InternalMyDsl.g:2442:2: ( rule__MulExpr__Group_0_1__0 )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==31) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // InternalMyDsl.g:2442:3: rule__MulExpr__Group_0_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__MulExpr__Group_0_1__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getMulExprAccess().getGroup_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MulExpr__Group_0__1__Impl"


    // $ANTLR start "rule__MulExpr__Group_0_1__0"
    // InternalMyDsl.g:2451:1: rule__MulExpr__Group_0_1__0 : rule__MulExpr__Group_0_1__0__Impl rule__MulExpr__Group_0_1__1 ;
    public final void rule__MulExpr__Group_0_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2455:1: ( rule__MulExpr__Group_0_1__0__Impl rule__MulExpr__Group_0_1__1 )
            // InternalMyDsl.g:2456:2: rule__MulExpr__Group_0_1__0__Impl rule__MulExpr__Group_0_1__1
            {
            pushFollow(FOLLOW_12);
            rule__MulExpr__Group_0_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MulExpr__Group_0_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MulExpr__Group_0_1__0"


    // $ANTLR start "rule__MulExpr__Group_0_1__0__Impl"
    // InternalMyDsl.g:2463:1: rule__MulExpr__Group_0_1__0__Impl : ( 'razy' ) ;
    public final void rule__MulExpr__Group_0_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2467:1: ( ( 'razy' ) )
            // InternalMyDsl.g:2468:1: ( 'razy' )
            {
            // InternalMyDsl.g:2468:1: ( 'razy' )
            // InternalMyDsl.g:2469:2: 'razy'
            {
             before(grammarAccess.getMulExprAccess().getRazyKeyword_0_1_0()); 
            match(input,31,FOLLOW_2); 
             after(grammarAccess.getMulExprAccess().getRazyKeyword_0_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MulExpr__Group_0_1__0__Impl"


    // $ANTLR start "rule__MulExpr__Group_0_1__1"
    // InternalMyDsl.g:2478:1: rule__MulExpr__Group_0_1__1 : rule__MulExpr__Group_0_1__1__Impl ;
    public final void rule__MulExpr__Group_0_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2482:1: ( rule__MulExpr__Group_0_1__1__Impl )
            // InternalMyDsl.g:2483:2: rule__MulExpr__Group_0_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__MulExpr__Group_0_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MulExpr__Group_0_1__1"


    // $ANTLR start "rule__MulExpr__Group_0_1__1__Impl"
    // InternalMyDsl.g:2489:1: rule__MulExpr__Group_0_1__1__Impl : ( ( rule__MulExpr__NumAssignment_0_1_1 ) ) ;
    public final void rule__MulExpr__Group_0_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2493:1: ( ( ( rule__MulExpr__NumAssignment_0_1_1 ) ) )
            // InternalMyDsl.g:2494:1: ( ( rule__MulExpr__NumAssignment_0_1_1 ) )
            {
            // InternalMyDsl.g:2494:1: ( ( rule__MulExpr__NumAssignment_0_1_1 ) )
            // InternalMyDsl.g:2495:2: ( rule__MulExpr__NumAssignment_0_1_1 )
            {
             before(grammarAccess.getMulExprAccess().getNumAssignment_0_1_1()); 
            // InternalMyDsl.g:2496:2: ( rule__MulExpr__NumAssignment_0_1_1 )
            // InternalMyDsl.g:2496:3: rule__MulExpr__NumAssignment_0_1_1
            {
            pushFollow(FOLLOW_2);
            rule__MulExpr__NumAssignment_0_1_1();

            state._fsp--;


            }

             after(grammarAccess.getMulExprAccess().getNumAssignment_0_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MulExpr__Group_0_1__1__Impl"


    // $ANTLR start "rule__MulExpr__Group_1__0"
    // InternalMyDsl.g:2505:1: rule__MulExpr__Group_1__0 : rule__MulExpr__Group_1__0__Impl rule__MulExpr__Group_1__1 ;
    public final void rule__MulExpr__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2509:1: ( rule__MulExpr__Group_1__0__Impl rule__MulExpr__Group_1__1 )
            // InternalMyDsl.g:2510:2: rule__MulExpr__Group_1__0__Impl rule__MulExpr__Group_1__1
            {
            pushFollow(FOLLOW_12);
            rule__MulExpr__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MulExpr__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MulExpr__Group_1__0"


    // $ANTLR start "rule__MulExpr__Group_1__0__Impl"
    // InternalMyDsl.g:2517:1: rule__MulExpr__Group_1__0__Impl : ( '(' ) ;
    public final void rule__MulExpr__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2521:1: ( ( '(' ) )
            // InternalMyDsl.g:2522:1: ( '(' )
            {
            // InternalMyDsl.g:2522:1: ( '(' )
            // InternalMyDsl.g:2523:2: '('
            {
             before(grammarAccess.getMulExprAccess().getLeftParenthesisKeyword_1_0()); 
            match(input,32,FOLLOW_2); 
             after(grammarAccess.getMulExprAccess().getLeftParenthesisKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MulExpr__Group_1__0__Impl"


    // $ANTLR start "rule__MulExpr__Group_1__1"
    // InternalMyDsl.g:2532:1: rule__MulExpr__Group_1__1 : rule__MulExpr__Group_1__1__Impl rule__MulExpr__Group_1__2 ;
    public final void rule__MulExpr__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2536:1: ( rule__MulExpr__Group_1__1__Impl rule__MulExpr__Group_1__2 )
            // InternalMyDsl.g:2537:2: rule__MulExpr__Group_1__1__Impl rule__MulExpr__Group_1__2
            {
            pushFollow(FOLLOW_13);
            rule__MulExpr__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MulExpr__Group_1__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MulExpr__Group_1__1"


    // $ANTLR start "rule__MulExpr__Group_1__1__Impl"
    // InternalMyDsl.g:2544:1: rule__MulExpr__Group_1__1__Impl : ( ( rule__MulExpr__FormexprAssignment_1_1 ) ) ;
    public final void rule__MulExpr__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2548:1: ( ( ( rule__MulExpr__FormexprAssignment_1_1 ) ) )
            // InternalMyDsl.g:2549:1: ( ( rule__MulExpr__FormexprAssignment_1_1 ) )
            {
            // InternalMyDsl.g:2549:1: ( ( rule__MulExpr__FormexprAssignment_1_1 ) )
            // InternalMyDsl.g:2550:2: ( rule__MulExpr__FormexprAssignment_1_1 )
            {
             before(grammarAccess.getMulExprAccess().getFormexprAssignment_1_1()); 
            // InternalMyDsl.g:2551:2: ( rule__MulExpr__FormexprAssignment_1_1 )
            // InternalMyDsl.g:2551:3: rule__MulExpr__FormexprAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__MulExpr__FormexprAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getMulExprAccess().getFormexprAssignment_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MulExpr__Group_1__1__Impl"


    // $ANTLR start "rule__MulExpr__Group_1__2"
    // InternalMyDsl.g:2559:1: rule__MulExpr__Group_1__2 : rule__MulExpr__Group_1__2__Impl rule__MulExpr__Group_1__3 ;
    public final void rule__MulExpr__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2563:1: ( rule__MulExpr__Group_1__2__Impl rule__MulExpr__Group_1__3 )
            // InternalMyDsl.g:2564:2: rule__MulExpr__Group_1__2__Impl rule__MulExpr__Group_1__3
            {
            pushFollow(FOLLOW_11);
            rule__MulExpr__Group_1__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MulExpr__Group_1__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MulExpr__Group_1__2"


    // $ANTLR start "rule__MulExpr__Group_1__2__Impl"
    // InternalMyDsl.g:2571:1: rule__MulExpr__Group_1__2__Impl : ( ')' ) ;
    public final void rule__MulExpr__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2575:1: ( ( ')' ) )
            // InternalMyDsl.g:2576:1: ( ')' )
            {
            // InternalMyDsl.g:2576:1: ( ')' )
            // InternalMyDsl.g:2577:2: ')'
            {
             before(grammarAccess.getMulExprAccess().getRightParenthesisKeyword_1_2()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getMulExprAccess().getRightParenthesisKeyword_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MulExpr__Group_1__2__Impl"


    // $ANTLR start "rule__MulExpr__Group_1__3"
    // InternalMyDsl.g:2586:1: rule__MulExpr__Group_1__3 : rule__MulExpr__Group_1__3__Impl ;
    public final void rule__MulExpr__Group_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2590:1: ( rule__MulExpr__Group_1__3__Impl )
            // InternalMyDsl.g:2591:2: rule__MulExpr__Group_1__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__MulExpr__Group_1__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MulExpr__Group_1__3"


    // $ANTLR start "rule__MulExpr__Group_1__3__Impl"
    // InternalMyDsl.g:2597:1: rule__MulExpr__Group_1__3__Impl : ( ( rule__MulExpr__Group_1_3__0 )? ) ;
    public final void rule__MulExpr__Group_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2601:1: ( ( ( rule__MulExpr__Group_1_3__0 )? ) )
            // InternalMyDsl.g:2602:1: ( ( rule__MulExpr__Group_1_3__0 )? )
            {
            // InternalMyDsl.g:2602:1: ( ( rule__MulExpr__Group_1_3__0 )? )
            // InternalMyDsl.g:2603:2: ( rule__MulExpr__Group_1_3__0 )?
            {
             before(grammarAccess.getMulExprAccess().getGroup_1_3()); 
            // InternalMyDsl.g:2604:2: ( rule__MulExpr__Group_1_3__0 )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==31) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // InternalMyDsl.g:2604:3: rule__MulExpr__Group_1_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__MulExpr__Group_1_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getMulExprAccess().getGroup_1_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MulExpr__Group_1__3__Impl"


    // $ANTLR start "rule__MulExpr__Group_1_3__0"
    // InternalMyDsl.g:2613:1: rule__MulExpr__Group_1_3__0 : rule__MulExpr__Group_1_3__0__Impl rule__MulExpr__Group_1_3__1 ;
    public final void rule__MulExpr__Group_1_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2617:1: ( rule__MulExpr__Group_1_3__0__Impl rule__MulExpr__Group_1_3__1 )
            // InternalMyDsl.g:2618:2: rule__MulExpr__Group_1_3__0__Impl rule__MulExpr__Group_1_3__1
            {
            pushFollow(FOLLOW_12);
            rule__MulExpr__Group_1_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MulExpr__Group_1_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MulExpr__Group_1_3__0"


    // $ANTLR start "rule__MulExpr__Group_1_3__0__Impl"
    // InternalMyDsl.g:2625:1: rule__MulExpr__Group_1_3__0__Impl : ( 'razy' ) ;
    public final void rule__MulExpr__Group_1_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2629:1: ( ( 'razy' ) )
            // InternalMyDsl.g:2630:1: ( 'razy' )
            {
            // InternalMyDsl.g:2630:1: ( 'razy' )
            // InternalMyDsl.g:2631:2: 'razy'
            {
             before(grammarAccess.getMulExprAccess().getRazyKeyword_1_3_0()); 
            match(input,31,FOLLOW_2); 
             after(grammarAccess.getMulExprAccess().getRazyKeyword_1_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MulExpr__Group_1_3__0__Impl"


    // $ANTLR start "rule__MulExpr__Group_1_3__1"
    // InternalMyDsl.g:2640:1: rule__MulExpr__Group_1_3__1 : rule__MulExpr__Group_1_3__1__Impl ;
    public final void rule__MulExpr__Group_1_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2644:1: ( rule__MulExpr__Group_1_3__1__Impl )
            // InternalMyDsl.g:2645:2: rule__MulExpr__Group_1_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__MulExpr__Group_1_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MulExpr__Group_1_3__1"


    // $ANTLR start "rule__MulExpr__Group_1_3__1__Impl"
    // InternalMyDsl.g:2651:1: rule__MulExpr__Group_1_3__1__Impl : ( ( rule__MulExpr__NumAssignment_1_3_1 ) ) ;
    public final void rule__MulExpr__Group_1_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2655:1: ( ( ( rule__MulExpr__NumAssignment_1_3_1 ) ) )
            // InternalMyDsl.g:2656:1: ( ( rule__MulExpr__NumAssignment_1_3_1 ) )
            {
            // InternalMyDsl.g:2656:1: ( ( rule__MulExpr__NumAssignment_1_3_1 ) )
            // InternalMyDsl.g:2657:2: ( rule__MulExpr__NumAssignment_1_3_1 )
            {
             before(grammarAccess.getMulExprAccess().getNumAssignment_1_3_1()); 
            // InternalMyDsl.g:2658:2: ( rule__MulExpr__NumAssignment_1_3_1 )
            // InternalMyDsl.g:2658:3: rule__MulExpr__NumAssignment_1_3_1
            {
            pushFollow(FOLLOW_2);
            rule__MulExpr__NumAssignment_1_3_1();

            state._fsp--;


            }

             after(grammarAccess.getMulExprAccess().getNumAssignment_1_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MulExpr__Group_1_3__1__Impl"


    // $ANTLR start "rule__Form__Group__0"
    // InternalMyDsl.g:2667:1: rule__Form__Group__0 : rule__Form__Group__0__Impl rule__Form__Group__1 ;
    public final void rule__Form__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2671:1: ( rule__Form__Group__0__Impl rule__Form__Group__1 )
            // InternalMyDsl.g:2672:2: rule__Form__Group__0__Impl rule__Form__Group__1
            {
            pushFollow(FOLLOW_14);
            rule__Form__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Form__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Form__Group__0"


    // $ANTLR start "rule__Form__Group__0__Impl"
    // InternalMyDsl.g:2679:1: rule__Form__Group__0__Impl : ( ( rule__Form__LeftAssignment_0 ) ) ;
    public final void rule__Form__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2683:1: ( ( ( rule__Form__LeftAssignment_0 ) ) )
            // InternalMyDsl.g:2684:1: ( ( rule__Form__LeftAssignment_0 ) )
            {
            // InternalMyDsl.g:2684:1: ( ( rule__Form__LeftAssignment_0 ) )
            // InternalMyDsl.g:2685:2: ( rule__Form__LeftAssignment_0 )
            {
             before(grammarAccess.getFormAccess().getLeftAssignment_0()); 
            // InternalMyDsl.g:2686:2: ( rule__Form__LeftAssignment_0 )
            // InternalMyDsl.g:2686:3: rule__Form__LeftAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Form__LeftAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getFormAccess().getLeftAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Form__Group__0__Impl"


    // $ANTLR start "rule__Form__Group__1"
    // InternalMyDsl.g:2694:1: rule__Form__Group__1 : rule__Form__Group__1__Impl ;
    public final void rule__Form__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2698:1: ( rule__Form__Group__1__Impl )
            // InternalMyDsl.g:2699:2: rule__Form__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Form__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Form__Group__1"


    // $ANTLR start "rule__Form__Group__1__Impl"
    // InternalMyDsl.g:2705:1: rule__Form__Group__1__Impl : ( ( rule__Form__Group_1__0 )? ) ;
    public final void rule__Form__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2709:1: ( ( ( rule__Form__Group_1__0 )? ) )
            // InternalMyDsl.g:2710:1: ( ( rule__Form__Group_1__0 )? )
            {
            // InternalMyDsl.g:2710:1: ( ( rule__Form__Group_1__0 )? )
            // InternalMyDsl.g:2711:2: ( rule__Form__Group_1__0 )?
            {
             before(grammarAccess.getFormAccess().getGroup_1()); 
            // InternalMyDsl.g:2712:2: ( rule__Form__Group_1__0 )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==14||LA32_0==17||(LA32_0>=20 && LA32_0<=21)) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // InternalMyDsl.g:2712:3: rule__Form__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Form__Group_1__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getFormAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Form__Group__1__Impl"


    // $ANTLR start "rule__Form__Group_1__0"
    // InternalMyDsl.g:2721:1: rule__Form__Group_1__0 : rule__Form__Group_1__0__Impl rule__Form__Group_1__1 ;
    public final void rule__Form__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2725:1: ( rule__Form__Group_1__0__Impl rule__Form__Group_1__1 )
            // InternalMyDsl.g:2726:2: rule__Form__Group_1__0__Impl rule__Form__Group_1__1
            {
            pushFollow(FOLLOW_12);
            rule__Form__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Form__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Form__Group_1__0"


    // $ANTLR start "rule__Form__Group_1__0__Impl"
    // InternalMyDsl.g:2733:1: rule__Form__Group_1__0__Impl : ( ( rule__Form__OperatorAssignment_1_0 ) ) ;
    public final void rule__Form__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2737:1: ( ( ( rule__Form__OperatorAssignment_1_0 ) ) )
            // InternalMyDsl.g:2738:1: ( ( rule__Form__OperatorAssignment_1_0 ) )
            {
            // InternalMyDsl.g:2738:1: ( ( rule__Form__OperatorAssignment_1_0 ) )
            // InternalMyDsl.g:2739:2: ( rule__Form__OperatorAssignment_1_0 )
            {
             before(grammarAccess.getFormAccess().getOperatorAssignment_1_0()); 
            // InternalMyDsl.g:2740:2: ( rule__Form__OperatorAssignment_1_0 )
            // InternalMyDsl.g:2740:3: rule__Form__OperatorAssignment_1_0
            {
            pushFollow(FOLLOW_2);
            rule__Form__OperatorAssignment_1_0();

            state._fsp--;


            }

             after(grammarAccess.getFormAccess().getOperatorAssignment_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Form__Group_1__0__Impl"


    // $ANTLR start "rule__Form__Group_1__1"
    // InternalMyDsl.g:2748:1: rule__Form__Group_1__1 : rule__Form__Group_1__1__Impl ;
    public final void rule__Form__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2752:1: ( rule__Form__Group_1__1__Impl )
            // InternalMyDsl.g:2753:2: rule__Form__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Form__Group_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Form__Group_1__1"


    // $ANTLR start "rule__Form__Group_1__1__Impl"
    // InternalMyDsl.g:2759:1: rule__Form__Group_1__1__Impl : ( ( rule__Form__RightAssignment_1_1 ) ) ;
    public final void rule__Form__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2763:1: ( ( ( rule__Form__RightAssignment_1_1 ) ) )
            // InternalMyDsl.g:2764:1: ( ( rule__Form__RightAssignment_1_1 ) )
            {
            // InternalMyDsl.g:2764:1: ( ( rule__Form__RightAssignment_1_1 ) )
            // InternalMyDsl.g:2765:2: ( rule__Form__RightAssignment_1_1 )
            {
             before(grammarAccess.getFormAccess().getRightAssignment_1_1()); 
            // InternalMyDsl.g:2766:2: ( rule__Form__RightAssignment_1_1 )
            // InternalMyDsl.g:2766:3: rule__Form__RightAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__Form__RightAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getFormAccess().getRightAssignment_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Form__Group_1__1__Impl"


    // $ANTLR start "rule__SingleDice__Group__0"
    // InternalMyDsl.g:2775:1: rule__SingleDice__Group__0 : rule__SingleDice__Group__0__Impl rule__SingleDice__Group__1 ;
    public final void rule__SingleDice__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2779:1: ( rule__SingleDice__Group__0__Impl rule__SingleDice__Group__1 )
            // InternalMyDsl.g:2780:2: rule__SingleDice__Group__0__Impl rule__SingleDice__Group__1
            {
            pushFollow(FOLLOW_12);
            rule__SingleDice__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SingleDice__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SingleDice__Group__0"


    // $ANTLR start "rule__SingleDice__Group__0__Impl"
    // InternalMyDsl.g:2787:1: rule__SingleDice__Group__0__Impl : ( RULE_D ) ;
    public final void rule__SingleDice__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2791:1: ( ( RULE_D ) )
            // InternalMyDsl.g:2792:1: ( RULE_D )
            {
            // InternalMyDsl.g:2792:1: ( RULE_D )
            // InternalMyDsl.g:2793:2: RULE_D
            {
             before(grammarAccess.getSingleDiceAccess().getDTerminalRuleCall_0()); 
            match(input,RULE_D,FOLLOW_2); 
             after(grammarAccess.getSingleDiceAccess().getDTerminalRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SingleDice__Group__0__Impl"


    // $ANTLR start "rule__SingleDice__Group__1"
    // InternalMyDsl.g:2802:1: rule__SingleDice__Group__1 : rule__SingleDice__Group__1__Impl ;
    public final void rule__SingleDice__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2806:1: ( rule__SingleDice__Group__1__Impl )
            // InternalMyDsl.g:2807:2: rule__SingleDice__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SingleDice__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SingleDice__Group__1"


    // $ANTLR start "rule__SingleDice__Group__1__Impl"
    // InternalMyDsl.g:2813:1: rule__SingleDice__Group__1__Impl : ( ( rule__SingleDice__SidesAssignment_1 ) ) ;
    public final void rule__SingleDice__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2817:1: ( ( ( rule__SingleDice__SidesAssignment_1 ) ) )
            // InternalMyDsl.g:2818:1: ( ( rule__SingleDice__SidesAssignment_1 ) )
            {
            // InternalMyDsl.g:2818:1: ( ( rule__SingleDice__SidesAssignment_1 ) )
            // InternalMyDsl.g:2819:2: ( rule__SingleDice__SidesAssignment_1 )
            {
             before(grammarAccess.getSingleDiceAccess().getSidesAssignment_1()); 
            // InternalMyDsl.g:2820:2: ( rule__SingleDice__SidesAssignment_1 )
            // InternalMyDsl.g:2820:3: rule__SingleDice__SidesAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__SingleDice__SidesAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getSingleDiceAccess().getSidesAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SingleDice__Group__1__Impl"


    // $ANTLR start "rule__MultiDice__Group__0"
    // InternalMyDsl.g:2829:1: rule__MultiDice__Group__0 : rule__MultiDice__Group__0__Impl rule__MultiDice__Group__1 ;
    public final void rule__MultiDice__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2833:1: ( rule__MultiDice__Group__0__Impl rule__MultiDice__Group__1 )
            // InternalMyDsl.g:2834:2: rule__MultiDice__Group__0__Impl rule__MultiDice__Group__1
            {
            pushFollow(FOLLOW_15);
            rule__MultiDice__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MultiDice__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultiDice__Group__0"


    // $ANTLR start "rule__MultiDice__Group__0__Impl"
    // InternalMyDsl.g:2841:1: rule__MultiDice__Group__0__Impl : ( ( rule__MultiDice__CountAssignment_0 ) ) ;
    public final void rule__MultiDice__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2845:1: ( ( ( rule__MultiDice__CountAssignment_0 ) ) )
            // InternalMyDsl.g:2846:1: ( ( rule__MultiDice__CountAssignment_0 ) )
            {
            // InternalMyDsl.g:2846:1: ( ( rule__MultiDice__CountAssignment_0 ) )
            // InternalMyDsl.g:2847:2: ( rule__MultiDice__CountAssignment_0 )
            {
             before(grammarAccess.getMultiDiceAccess().getCountAssignment_0()); 
            // InternalMyDsl.g:2848:2: ( rule__MultiDice__CountAssignment_0 )
            // InternalMyDsl.g:2848:3: rule__MultiDice__CountAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__MultiDice__CountAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getMultiDiceAccess().getCountAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultiDice__Group__0__Impl"


    // $ANTLR start "rule__MultiDice__Group__1"
    // InternalMyDsl.g:2856:1: rule__MultiDice__Group__1 : rule__MultiDice__Group__1__Impl rule__MultiDice__Group__2 ;
    public final void rule__MultiDice__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2860:1: ( rule__MultiDice__Group__1__Impl rule__MultiDice__Group__2 )
            // InternalMyDsl.g:2861:2: rule__MultiDice__Group__1__Impl rule__MultiDice__Group__2
            {
            pushFollow(FOLLOW_12);
            rule__MultiDice__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MultiDice__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultiDice__Group__1"


    // $ANTLR start "rule__MultiDice__Group__1__Impl"
    // InternalMyDsl.g:2868:1: rule__MultiDice__Group__1__Impl : ( RULE_D ) ;
    public final void rule__MultiDice__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2872:1: ( ( RULE_D ) )
            // InternalMyDsl.g:2873:1: ( RULE_D )
            {
            // InternalMyDsl.g:2873:1: ( RULE_D )
            // InternalMyDsl.g:2874:2: RULE_D
            {
             before(grammarAccess.getMultiDiceAccess().getDTerminalRuleCall_1()); 
            match(input,RULE_D,FOLLOW_2); 
             after(grammarAccess.getMultiDiceAccess().getDTerminalRuleCall_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultiDice__Group__1__Impl"


    // $ANTLR start "rule__MultiDice__Group__2"
    // InternalMyDsl.g:2883:1: rule__MultiDice__Group__2 : rule__MultiDice__Group__2__Impl ;
    public final void rule__MultiDice__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2887:1: ( rule__MultiDice__Group__2__Impl )
            // InternalMyDsl.g:2888:2: rule__MultiDice__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__MultiDice__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultiDice__Group__2"


    // $ANTLR start "rule__MultiDice__Group__2__Impl"
    // InternalMyDsl.g:2894:1: rule__MultiDice__Group__2__Impl : ( ( rule__MultiDice__SidesAssignment_2 ) ) ;
    public final void rule__MultiDice__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2898:1: ( ( ( rule__MultiDice__SidesAssignment_2 ) ) )
            // InternalMyDsl.g:2899:1: ( ( rule__MultiDice__SidesAssignment_2 ) )
            {
            // InternalMyDsl.g:2899:1: ( ( rule__MultiDice__SidesAssignment_2 ) )
            // InternalMyDsl.g:2900:2: ( rule__MultiDice__SidesAssignment_2 )
            {
             before(grammarAccess.getMultiDiceAccess().getSidesAssignment_2()); 
            // InternalMyDsl.g:2901:2: ( rule__MultiDice__SidesAssignment_2 )
            // InternalMyDsl.g:2901:3: rule__MultiDice__SidesAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__MultiDice__SidesAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getMultiDiceAccess().getSidesAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultiDice__Group__2__Impl"


    // $ANTLR start "rule__ExplosionRule__Group__0"
    // InternalMyDsl.g:2910:1: rule__ExplosionRule__Group__0 : rule__ExplosionRule__Group__0__Impl rule__ExplosionRule__Group__1 ;
    public final void rule__ExplosionRule__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2914:1: ( rule__ExplosionRule__Group__0__Impl rule__ExplosionRule__Group__1 )
            // InternalMyDsl.g:2915:2: rule__ExplosionRule__Group__0__Impl rule__ExplosionRule__Group__1
            {
            pushFollow(FOLLOW_16);
            rule__ExplosionRule__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ExplosionRule__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExplosionRule__Group__0"


    // $ANTLR start "rule__ExplosionRule__Group__0__Impl"
    // InternalMyDsl.g:2922:1: rule__ExplosionRule__Group__0__Impl : ( ( rule__ExplosionRule__SignAssignment_0 ) ) ;
    public final void rule__ExplosionRule__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2926:1: ( ( ( rule__ExplosionRule__SignAssignment_0 ) ) )
            // InternalMyDsl.g:2927:1: ( ( rule__ExplosionRule__SignAssignment_0 ) )
            {
            // InternalMyDsl.g:2927:1: ( ( rule__ExplosionRule__SignAssignment_0 ) )
            // InternalMyDsl.g:2928:2: ( rule__ExplosionRule__SignAssignment_0 )
            {
             before(grammarAccess.getExplosionRuleAccess().getSignAssignment_0()); 
            // InternalMyDsl.g:2929:2: ( rule__ExplosionRule__SignAssignment_0 )
            // InternalMyDsl.g:2929:3: rule__ExplosionRule__SignAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__ExplosionRule__SignAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getExplosionRuleAccess().getSignAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExplosionRule__Group__0__Impl"


    // $ANTLR start "rule__ExplosionRule__Group__1"
    // InternalMyDsl.g:2937:1: rule__ExplosionRule__Group__1 : rule__ExplosionRule__Group__1__Impl rule__ExplosionRule__Group__2 ;
    public final void rule__ExplosionRule__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2941:1: ( rule__ExplosionRule__Group__1__Impl rule__ExplosionRule__Group__2 )
            // InternalMyDsl.g:2942:2: rule__ExplosionRule__Group__1__Impl rule__ExplosionRule__Group__2
            {
            pushFollow(FOLLOW_12);
            rule__ExplosionRule__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ExplosionRule__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExplosionRule__Group__1"


    // $ANTLR start "rule__ExplosionRule__Group__1__Impl"
    // InternalMyDsl.g:2949:1: rule__ExplosionRule__Group__1__Impl : ( 'wybuchowe' ) ;
    public final void rule__ExplosionRule__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2953:1: ( ( 'wybuchowe' ) )
            // InternalMyDsl.g:2954:1: ( 'wybuchowe' )
            {
            // InternalMyDsl.g:2954:1: ( 'wybuchowe' )
            // InternalMyDsl.g:2955:2: 'wybuchowe'
            {
             before(grammarAccess.getExplosionRuleAccess().getWybuchoweKeyword_1()); 
            match(input,34,FOLLOW_2); 
             after(grammarAccess.getExplosionRuleAccess().getWybuchoweKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExplosionRule__Group__1__Impl"


    // $ANTLR start "rule__ExplosionRule__Group__2"
    // InternalMyDsl.g:2964:1: rule__ExplosionRule__Group__2 : rule__ExplosionRule__Group__2__Impl ;
    public final void rule__ExplosionRule__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2968:1: ( rule__ExplosionRule__Group__2__Impl )
            // InternalMyDsl.g:2969:2: rule__ExplosionRule__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ExplosionRule__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExplosionRule__Group__2"


    // $ANTLR start "rule__ExplosionRule__Group__2__Impl"
    // InternalMyDsl.g:2975:1: rule__ExplosionRule__Group__2__Impl : ( ( rule__ExplosionRule__NumAssignment_2 ) ) ;
    public final void rule__ExplosionRule__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2979:1: ( ( ( rule__ExplosionRule__NumAssignment_2 ) ) )
            // InternalMyDsl.g:2980:1: ( ( rule__ExplosionRule__NumAssignment_2 ) )
            {
            // InternalMyDsl.g:2980:1: ( ( rule__ExplosionRule__NumAssignment_2 ) )
            // InternalMyDsl.g:2981:2: ( rule__ExplosionRule__NumAssignment_2 )
            {
             before(grammarAccess.getExplosionRuleAccess().getNumAssignment_2()); 
            // InternalMyDsl.g:2982:2: ( rule__ExplosionRule__NumAssignment_2 )
            // InternalMyDsl.g:2982:3: rule__ExplosionRule__NumAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__ExplosionRule__NumAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getExplosionRuleAccess().getNumAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExplosionRule__Group__2__Impl"


    // $ANTLR start "rule__DiceMarkSum__Group__0"
    // InternalMyDsl.g:2991:1: rule__DiceMarkSum__Group__0 : rule__DiceMarkSum__Group__0__Impl rule__DiceMarkSum__Group__1 ;
    public final void rule__DiceMarkSum__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2995:1: ( rule__DiceMarkSum__Group__0__Impl rule__DiceMarkSum__Group__1 )
            // InternalMyDsl.g:2996:2: rule__DiceMarkSum__Group__0__Impl rule__DiceMarkSum__Group__1
            {
            pushFollow(FOLLOW_17);
            rule__DiceMarkSum__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DiceMarkSum__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DiceMarkSum__Group__0"


    // $ANTLR start "rule__DiceMarkSum__Group__0__Impl"
    // InternalMyDsl.g:3003:1: rule__DiceMarkSum__Group__0__Impl : ( 'oznacz' ) ;
    public final void rule__DiceMarkSum__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3007:1: ( ( 'oznacz' ) )
            // InternalMyDsl.g:3008:1: ( 'oznacz' )
            {
            // InternalMyDsl.g:3008:1: ( 'oznacz' )
            // InternalMyDsl.g:3009:2: 'oznacz'
            {
             before(grammarAccess.getDiceMarkSumAccess().getOznaczKeyword_0()); 
            match(input,35,FOLLOW_2); 
             after(grammarAccess.getDiceMarkSumAccess().getOznaczKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DiceMarkSum__Group__0__Impl"


    // $ANTLR start "rule__DiceMarkSum__Group__1"
    // InternalMyDsl.g:3018:1: rule__DiceMarkSum__Group__1 : rule__DiceMarkSum__Group__1__Impl ;
    public final void rule__DiceMarkSum__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3022:1: ( rule__DiceMarkSum__Group__1__Impl )
            // InternalMyDsl.g:3023:2: rule__DiceMarkSum__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__DiceMarkSum__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DiceMarkSum__Group__1"


    // $ANTLR start "rule__DiceMarkSum__Group__1__Impl"
    // InternalMyDsl.g:3029:1: rule__DiceMarkSum__Group__1__Impl : ( ( rule__DiceMarkSum__MarkAssignment_1 ) ) ;
    public final void rule__DiceMarkSum__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3033:1: ( ( ( rule__DiceMarkSum__MarkAssignment_1 ) ) )
            // InternalMyDsl.g:3034:1: ( ( rule__DiceMarkSum__MarkAssignment_1 ) )
            {
            // InternalMyDsl.g:3034:1: ( ( rule__DiceMarkSum__MarkAssignment_1 ) )
            // InternalMyDsl.g:3035:2: ( rule__DiceMarkSum__MarkAssignment_1 )
            {
             before(grammarAccess.getDiceMarkSumAccess().getMarkAssignment_1()); 
            // InternalMyDsl.g:3036:2: ( rule__DiceMarkSum__MarkAssignment_1 )
            // InternalMyDsl.g:3036:3: rule__DiceMarkSum__MarkAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__DiceMarkSum__MarkAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getDiceMarkSumAccess().getMarkAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DiceMarkSum__Group__1__Impl"


    // $ANTLR start "rule__DiceDiscSum__Group__0"
    // InternalMyDsl.g:3045:1: rule__DiceDiscSum__Group__0 : rule__DiceDiscSum__Group__0__Impl rule__DiceDiscSum__Group__1 ;
    public final void rule__DiceDiscSum__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3049:1: ( rule__DiceDiscSum__Group__0__Impl rule__DiceDiscSum__Group__1 )
            // InternalMyDsl.g:3050:2: rule__DiceDiscSum__Group__0__Impl rule__DiceDiscSum__Group__1
            {
            pushFollow(FOLLOW_17);
            rule__DiceDiscSum__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DiceDiscSum__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DiceDiscSum__Group__0"


    // $ANTLR start "rule__DiceDiscSum__Group__0__Impl"
    // InternalMyDsl.g:3057:1: rule__DiceDiscSum__Group__0__Impl : ( 'odrzuc' ) ;
    public final void rule__DiceDiscSum__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3061:1: ( ( 'odrzuc' ) )
            // InternalMyDsl.g:3062:1: ( 'odrzuc' )
            {
            // InternalMyDsl.g:3062:1: ( 'odrzuc' )
            // InternalMyDsl.g:3063:2: 'odrzuc'
            {
             before(grammarAccess.getDiceDiscSumAccess().getOdrzucKeyword_0()); 
            match(input,36,FOLLOW_2); 
             after(grammarAccess.getDiceDiscSumAccess().getOdrzucKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DiceDiscSum__Group__0__Impl"


    // $ANTLR start "rule__DiceDiscSum__Group__1"
    // InternalMyDsl.g:3072:1: rule__DiceDiscSum__Group__1 : rule__DiceDiscSum__Group__1__Impl ;
    public final void rule__DiceDiscSum__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3076:1: ( rule__DiceDiscSum__Group__1__Impl )
            // InternalMyDsl.g:3077:2: rule__DiceDiscSum__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__DiceDiscSum__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DiceDiscSum__Group__1"


    // $ANTLR start "rule__DiceDiscSum__Group__1__Impl"
    // InternalMyDsl.g:3083:1: rule__DiceDiscSum__Group__1__Impl : ( ( rule__DiceDiscSum__DiscardAssignment_1 ) ) ;
    public final void rule__DiceDiscSum__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3087:1: ( ( ( rule__DiceDiscSum__DiscardAssignment_1 ) ) )
            // InternalMyDsl.g:3088:1: ( ( rule__DiceDiscSum__DiscardAssignment_1 ) )
            {
            // InternalMyDsl.g:3088:1: ( ( rule__DiceDiscSum__DiscardAssignment_1 ) )
            // InternalMyDsl.g:3089:2: ( rule__DiceDiscSum__DiscardAssignment_1 )
            {
             before(grammarAccess.getDiceDiscSumAccess().getDiscardAssignment_1()); 
            // InternalMyDsl.g:3090:2: ( rule__DiceDiscSum__DiscardAssignment_1 )
            // InternalMyDsl.g:3090:3: rule__DiceDiscSum__DiscardAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__DiceDiscSum__DiscardAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getDiceDiscSumAccess().getDiscardAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DiceDiscSum__Group__1__Impl"


    // $ANTLR start "rule__DiceRerollSum__Group__0"
    // InternalMyDsl.g:3099:1: rule__DiceRerollSum__Group__0 : rule__DiceRerollSum__Group__0__Impl rule__DiceRerollSum__Group__1 ;
    public final void rule__DiceRerollSum__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3103:1: ( rule__DiceRerollSum__Group__0__Impl rule__DiceRerollSum__Group__1 )
            // InternalMyDsl.g:3104:2: rule__DiceRerollSum__Group__0__Impl rule__DiceRerollSum__Group__1
            {
            pushFollow(FOLLOW_17);
            rule__DiceRerollSum__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DiceRerollSum__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DiceRerollSum__Group__0"


    // $ANTLR start "rule__DiceRerollSum__Group__0__Impl"
    // InternalMyDsl.g:3111:1: rule__DiceRerollSum__Group__0__Impl : ( 'przerzuc' ) ;
    public final void rule__DiceRerollSum__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3115:1: ( ( 'przerzuc' ) )
            // InternalMyDsl.g:3116:1: ( 'przerzuc' )
            {
            // InternalMyDsl.g:3116:1: ( 'przerzuc' )
            // InternalMyDsl.g:3117:2: 'przerzuc'
            {
             before(grammarAccess.getDiceRerollSumAccess().getPrzerzucKeyword_0()); 
            match(input,37,FOLLOW_2); 
             after(grammarAccess.getDiceRerollSumAccess().getPrzerzucKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DiceRerollSum__Group__0__Impl"


    // $ANTLR start "rule__DiceRerollSum__Group__1"
    // InternalMyDsl.g:3126:1: rule__DiceRerollSum__Group__1 : rule__DiceRerollSum__Group__1__Impl ;
    public final void rule__DiceRerollSum__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3130:1: ( rule__DiceRerollSum__Group__1__Impl )
            // InternalMyDsl.g:3131:2: rule__DiceRerollSum__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__DiceRerollSum__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DiceRerollSum__Group__1"


    // $ANTLR start "rule__DiceRerollSum__Group__1__Impl"
    // InternalMyDsl.g:3137:1: rule__DiceRerollSum__Group__1__Impl : ( ( rule__DiceRerollSum__RerollAssignment_1 ) ) ;
    public final void rule__DiceRerollSum__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3141:1: ( ( ( rule__DiceRerollSum__RerollAssignment_1 ) ) )
            // InternalMyDsl.g:3142:1: ( ( rule__DiceRerollSum__RerollAssignment_1 ) )
            {
            // InternalMyDsl.g:3142:1: ( ( rule__DiceRerollSum__RerollAssignment_1 ) )
            // InternalMyDsl.g:3143:2: ( rule__DiceRerollSum__RerollAssignment_1 )
            {
             before(grammarAccess.getDiceRerollSumAccess().getRerollAssignment_1()); 
            // InternalMyDsl.g:3144:2: ( rule__DiceRerollSum__RerollAssignment_1 )
            // InternalMyDsl.g:3144:3: rule__DiceRerollSum__RerollAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__DiceRerollSum__RerollAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getDiceRerollSumAccess().getRerollAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DiceRerollSum__Group__1__Impl"


    // $ANTLR start "rule__RuleSuk__Group_0__0"
    // InternalMyDsl.g:3153:1: rule__RuleSuk__Group_0__0 : rule__RuleSuk__Group_0__0__Impl rule__RuleSuk__Group_0__1 ;
    public final void rule__RuleSuk__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3157:1: ( rule__RuleSuk__Group_0__0__Impl rule__RuleSuk__Group_0__1 )
            // InternalMyDsl.g:3158:2: rule__RuleSuk__Group_0__0__Impl rule__RuleSuk__Group_0__1
            {
            pushFollow(FOLLOW_17);
            rule__RuleSuk__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RuleSuk__Group_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RuleSuk__Group_0__0"


    // $ANTLR start "rule__RuleSuk__Group_0__0__Impl"
    // InternalMyDsl.g:3165:1: rule__RuleSuk__Group_0__0__Impl : ( 'sukces' ) ;
    public final void rule__RuleSuk__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3169:1: ( ( 'sukces' ) )
            // InternalMyDsl.g:3170:1: ( 'sukces' )
            {
            // InternalMyDsl.g:3170:1: ( 'sukces' )
            // InternalMyDsl.g:3171:2: 'sukces'
            {
             before(grammarAccess.getRuleSukAccess().getSukcesKeyword_0_0()); 
            match(input,38,FOLLOW_2); 
             after(grammarAccess.getRuleSukAccess().getSukcesKeyword_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RuleSuk__Group_0__0__Impl"


    // $ANTLR start "rule__RuleSuk__Group_0__1"
    // InternalMyDsl.g:3180:1: rule__RuleSuk__Group_0__1 : rule__RuleSuk__Group_0__1__Impl ;
    public final void rule__RuleSuk__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3184:1: ( rule__RuleSuk__Group_0__1__Impl )
            // InternalMyDsl.g:3185:2: rule__RuleSuk__Group_0__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__RuleSuk__Group_0__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RuleSuk__Group_0__1"


    // $ANTLR start "rule__RuleSuk__Group_0__1__Impl"
    // InternalMyDsl.g:3191:1: rule__RuleSuk__Group_0__1__Impl : ( ( rule__RuleSuk__Alternatives_0_1 ) ) ;
    public final void rule__RuleSuk__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3195:1: ( ( ( rule__RuleSuk__Alternatives_0_1 ) ) )
            // InternalMyDsl.g:3196:1: ( ( rule__RuleSuk__Alternatives_0_1 ) )
            {
            // InternalMyDsl.g:3196:1: ( ( rule__RuleSuk__Alternatives_0_1 ) )
            // InternalMyDsl.g:3197:2: ( rule__RuleSuk__Alternatives_0_1 )
            {
             before(grammarAccess.getRuleSukAccess().getAlternatives_0_1()); 
            // InternalMyDsl.g:3198:2: ( rule__RuleSuk__Alternatives_0_1 )
            // InternalMyDsl.g:3198:3: rule__RuleSuk__Alternatives_0_1
            {
            pushFollow(FOLLOW_2);
            rule__RuleSuk__Alternatives_0_1();

            state._fsp--;


            }

             after(grammarAccess.getRuleSukAccess().getAlternatives_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RuleSuk__Group_0__1__Impl"


    // $ANTLR start "rule__SuccessThreshold__Group__0"
    // InternalMyDsl.g:3207:1: rule__SuccessThreshold__Group__0 : rule__SuccessThreshold__Group__0__Impl rule__SuccessThreshold__Group__1 ;
    public final void rule__SuccessThreshold__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3211:1: ( rule__SuccessThreshold__Group__0__Impl rule__SuccessThreshold__Group__1 )
            // InternalMyDsl.g:3212:2: rule__SuccessThreshold__Group__0__Impl rule__SuccessThreshold__Group__1
            {
            pushFollow(FOLLOW_12);
            rule__SuccessThreshold__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SuccessThreshold__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SuccessThreshold__Group__0"


    // $ANTLR start "rule__SuccessThreshold__Group__0__Impl"
    // InternalMyDsl.g:3219:1: rule__SuccessThreshold__Group__0__Impl : ( ( rule__SuccessThreshold__HightlowAssignment_0 ) ) ;
    public final void rule__SuccessThreshold__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3223:1: ( ( ( rule__SuccessThreshold__HightlowAssignment_0 ) ) )
            // InternalMyDsl.g:3224:1: ( ( rule__SuccessThreshold__HightlowAssignment_0 ) )
            {
            // InternalMyDsl.g:3224:1: ( ( rule__SuccessThreshold__HightlowAssignment_0 ) )
            // InternalMyDsl.g:3225:2: ( rule__SuccessThreshold__HightlowAssignment_0 )
            {
             before(grammarAccess.getSuccessThresholdAccess().getHightlowAssignment_0()); 
            // InternalMyDsl.g:3226:2: ( rule__SuccessThreshold__HightlowAssignment_0 )
            // InternalMyDsl.g:3226:3: rule__SuccessThreshold__HightlowAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__SuccessThreshold__HightlowAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getSuccessThresholdAccess().getHightlowAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SuccessThreshold__Group__0__Impl"


    // $ANTLR start "rule__SuccessThreshold__Group__1"
    // InternalMyDsl.g:3234:1: rule__SuccessThreshold__Group__1 : rule__SuccessThreshold__Group__1__Impl ;
    public final void rule__SuccessThreshold__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3238:1: ( rule__SuccessThreshold__Group__1__Impl )
            // InternalMyDsl.g:3239:2: rule__SuccessThreshold__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SuccessThreshold__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SuccessThreshold__Group__1"


    // $ANTLR start "rule__SuccessThreshold__Group__1__Impl"
    // InternalMyDsl.g:3245:1: rule__SuccessThreshold__Group__1__Impl : ( ( rule__SuccessThreshold__NumAssignment_1 ) ) ;
    public final void rule__SuccessThreshold__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3249:1: ( ( ( rule__SuccessThreshold__NumAssignment_1 ) ) )
            // InternalMyDsl.g:3250:1: ( ( rule__SuccessThreshold__NumAssignment_1 ) )
            {
            // InternalMyDsl.g:3250:1: ( ( rule__SuccessThreshold__NumAssignment_1 ) )
            // InternalMyDsl.g:3251:2: ( rule__SuccessThreshold__NumAssignment_1 )
            {
             before(grammarAccess.getSuccessThresholdAccess().getNumAssignment_1()); 
            // InternalMyDsl.g:3252:2: ( rule__SuccessThreshold__NumAssignment_1 )
            // InternalMyDsl.g:3252:3: rule__SuccessThreshold__NumAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__SuccessThreshold__NumAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getSuccessThresholdAccess().getNumAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SuccessThreshold__Group__1__Impl"


    // $ANTLR start "rule__SuccessMultiplier__Group__0"
    // InternalMyDsl.g:3261:1: rule__SuccessMultiplier__Group__0 : rule__SuccessMultiplier__Group__0__Impl rule__SuccessMultiplier__Group__1 ;
    public final void rule__SuccessMultiplier__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3265:1: ( rule__SuccessMultiplier__Group__0__Impl rule__SuccessMultiplier__Group__1 )
            // InternalMyDsl.g:3266:2: rule__SuccessMultiplier__Group__0__Impl rule__SuccessMultiplier__Group__1
            {
            pushFollow(FOLLOW_11);
            rule__SuccessMultiplier__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SuccessMultiplier__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SuccessMultiplier__Group__0"


    // $ANTLR start "rule__SuccessMultiplier__Group__0__Impl"
    // InternalMyDsl.g:3273:1: rule__SuccessMultiplier__Group__0__Impl : ( ( rule__SuccessMultiplier__NumAssignment_0 ) ) ;
    public final void rule__SuccessMultiplier__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3277:1: ( ( ( rule__SuccessMultiplier__NumAssignment_0 ) ) )
            // InternalMyDsl.g:3278:1: ( ( rule__SuccessMultiplier__NumAssignment_0 ) )
            {
            // InternalMyDsl.g:3278:1: ( ( rule__SuccessMultiplier__NumAssignment_0 ) )
            // InternalMyDsl.g:3279:2: ( rule__SuccessMultiplier__NumAssignment_0 )
            {
             before(grammarAccess.getSuccessMultiplierAccess().getNumAssignment_0()); 
            // InternalMyDsl.g:3280:2: ( rule__SuccessMultiplier__NumAssignment_0 )
            // InternalMyDsl.g:3280:3: rule__SuccessMultiplier__NumAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__SuccessMultiplier__NumAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getSuccessMultiplierAccess().getNumAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SuccessMultiplier__Group__0__Impl"


    // $ANTLR start "rule__SuccessMultiplier__Group__1"
    // InternalMyDsl.g:3288:1: rule__SuccessMultiplier__Group__1 : rule__SuccessMultiplier__Group__1__Impl rule__SuccessMultiplier__Group__2 ;
    public final void rule__SuccessMultiplier__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3292:1: ( rule__SuccessMultiplier__Group__1__Impl rule__SuccessMultiplier__Group__2 )
            // InternalMyDsl.g:3293:2: rule__SuccessMultiplier__Group__1__Impl rule__SuccessMultiplier__Group__2
            {
            pushFollow(FOLLOW_18);
            rule__SuccessMultiplier__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SuccessMultiplier__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SuccessMultiplier__Group__1"


    // $ANTLR start "rule__SuccessMultiplier__Group__1__Impl"
    // InternalMyDsl.g:3300:1: rule__SuccessMultiplier__Group__1__Impl : ( 'razy' ) ;
    public final void rule__SuccessMultiplier__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3304:1: ( ( 'razy' ) )
            // InternalMyDsl.g:3305:1: ( 'razy' )
            {
            // InternalMyDsl.g:3305:1: ( 'razy' )
            // InternalMyDsl.g:3306:2: 'razy'
            {
             before(grammarAccess.getSuccessMultiplierAccess().getRazyKeyword_1()); 
            match(input,31,FOLLOW_2); 
             after(grammarAccess.getSuccessMultiplierAccess().getRazyKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SuccessMultiplier__Group__1__Impl"


    // $ANTLR start "rule__SuccessMultiplier__Group__2"
    // InternalMyDsl.g:3315:1: rule__SuccessMultiplier__Group__2 : rule__SuccessMultiplier__Group__2__Impl rule__SuccessMultiplier__Group__3 ;
    public final void rule__SuccessMultiplier__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3319:1: ( rule__SuccessMultiplier__Group__2__Impl rule__SuccessMultiplier__Group__3 )
            // InternalMyDsl.g:3320:2: rule__SuccessMultiplier__Group__2__Impl rule__SuccessMultiplier__Group__3
            {
            pushFollow(FOLLOW_18);
            rule__SuccessMultiplier__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SuccessMultiplier__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SuccessMultiplier__Group__2"


    // $ANTLR start "rule__SuccessMultiplier__Group__2__Impl"
    // InternalMyDsl.g:3327:1: rule__SuccessMultiplier__Group__2__Impl : ( ( rule__SuccessMultiplier__SignAssignment_2 )? ) ;
    public final void rule__SuccessMultiplier__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3331:1: ( ( ( rule__SuccessMultiplier__SignAssignment_2 )? ) )
            // InternalMyDsl.g:3332:1: ( ( rule__SuccessMultiplier__SignAssignment_2 )? )
            {
            // InternalMyDsl.g:3332:1: ( ( rule__SuccessMultiplier__SignAssignment_2 )? )
            // InternalMyDsl.g:3333:2: ( rule__SuccessMultiplier__SignAssignment_2 )?
            {
             before(grammarAccess.getSuccessMultiplierAccess().getSignAssignment_2()); 
            // InternalMyDsl.g:3334:2: ( rule__SuccessMultiplier__SignAssignment_2 )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( ((LA33_0>=14 && LA33_0<=17)) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // InternalMyDsl.g:3334:3: rule__SuccessMultiplier__SignAssignment_2
                    {
                    pushFollow(FOLLOW_2);
                    rule__SuccessMultiplier__SignAssignment_2();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getSuccessMultiplierAccess().getSignAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SuccessMultiplier__Group__2__Impl"


    // $ANTLR start "rule__SuccessMultiplier__Group__3"
    // InternalMyDsl.g:3342:1: rule__SuccessMultiplier__Group__3 : rule__SuccessMultiplier__Group__3__Impl ;
    public final void rule__SuccessMultiplier__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3346:1: ( rule__SuccessMultiplier__Group__3__Impl )
            // InternalMyDsl.g:3347:2: rule__SuccessMultiplier__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SuccessMultiplier__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SuccessMultiplier__Group__3"


    // $ANTLR start "rule__SuccessMultiplier__Group__3__Impl"
    // InternalMyDsl.g:3353:1: rule__SuccessMultiplier__Group__3__Impl : ( ( rule__SuccessMultiplier__MultAssignment_3 ) ) ;
    public final void rule__SuccessMultiplier__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3357:1: ( ( ( rule__SuccessMultiplier__MultAssignment_3 ) ) )
            // InternalMyDsl.g:3358:1: ( ( rule__SuccessMultiplier__MultAssignment_3 ) )
            {
            // InternalMyDsl.g:3358:1: ( ( rule__SuccessMultiplier__MultAssignment_3 ) )
            // InternalMyDsl.g:3359:2: ( rule__SuccessMultiplier__MultAssignment_3 )
            {
             before(grammarAccess.getSuccessMultiplierAccess().getMultAssignment_3()); 
            // InternalMyDsl.g:3360:2: ( rule__SuccessMultiplier__MultAssignment_3 )
            // InternalMyDsl.g:3360:3: rule__SuccessMultiplier__MultAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__SuccessMultiplier__MultAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getSuccessMultiplierAccess().getMultAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SuccessMultiplier__Group__3__Impl"


    // $ANTLR start "rule__DiceMarkSuk__Group__0"
    // InternalMyDsl.g:3369:1: rule__DiceMarkSuk__Group__0 : rule__DiceMarkSuk__Group__0__Impl rule__DiceMarkSuk__Group__1 ;
    public final void rule__DiceMarkSuk__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3373:1: ( rule__DiceMarkSuk__Group__0__Impl rule__DiceMarkSuk__Group__1 )
            // InternalMyDsl.g:3374:2: rule__DiceMarkSuk__Group__0__Impl rule__DiceMarkSuk__Group__1
            {
            pushFollow(FOLLOW_17);
            rule__DiceMarkSuk__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DiceMarkSuk__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DiceMarkSuk__Group__0"


    // $ANTLR start "rule__DiceMarkSuk__Group__0__Impl"
    // InternalMyDsl.g:3381:1: rule__DiceMarkSuk__Group__0__Impl : ( 'oznacz' ) ;
    public final void rule__DiceMarkSuk__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3385:1: ( ( 'oznacz' ) )
            // InternalMyDsl.g:3386:1: ( 'oznacz' )
            {
            // InternalMyDsl.g:3386:1: ( 'oznacz' )
            // InternalMyDsl.g:3387:2: 'oznacz'
            {
             before(grammarAccess.getDiceMarkSukAccess().getOznaczKeyword_0()); 
            match(input,35,FOLLOW_2); 
             after(grammarAccess.getDiceMarkSukAccess().getOznaczKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DiceMarkSuk__Group__0__Impl"


    // $ANTLR start "rule__DiceMarkSuk__Group__1"
    // InternalMyDsl.g:3396:1: rule__DiceMarkSuk__Group__1 : rule__DiceMarkSuk__Group__1__Impl ;
    public final void rule__DiceMarkSuk__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3400:1: ( rule__DiceMarkSuk__Group__1__Impl )
            // InternalMyDsl.g:3401:2: rule__DiceMarkSuk__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__DiceMarkSuk__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DiceMarkSuk__Group__1"


    // $ANTLR start "rule__DiceMarkSuk__Group__1__Impl"
    // InternalMyDsl.g:3407:1: rule__DiceMarkSuk__Group__1__Impl : ( ( rule__DiceMarkSuk__MarkAssignment_1 ) ) ;
    public final void rule__DiceMarkSuk__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3411:1: ( ( ( rule__DiceMarkSuk__MarkAssignment_1 ) ) )
            // InternalMyDsl.g:3412:1: ( ( rule__DiceMarkSuk__MarkAssignment_1 ) )
            {
            // InternalMyDsl.g:3412:1: ( ( rule__DiceMarkSuk__MarkAssignment_1 ) )
            // InternalMyDsl.g:3413:2: ( rule__DiceMarkSuk__MarkAssignment_1 )
            {
             before(grammarAccess.getDiceMarkSukAccess().getMarkAssignment_1()); 
            // InternalMyDsl.g:3414:2: ( rule__DiceMarkSuk__MarkAssignment_1 )
            // InternalMyDsl.g:3414:3: rule__DiceMarkSuk__MarkAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__DiceMarkSuk__MarkAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getDiceMarkSukAccess().getMarkAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DiceMarkSuk__Group__1__Impl"


    // $ANTLR start "rule__DiceDiscSuk__Group__0"
    // InternalMyDsl.g:3423:1: rule__DiceDiscSuk__Group__0 : rule__DiceDiscSuk__Group__0__Impl rule__DiceDiscSuk__Group__1 ;
    public final void rule__DiceDiscSuk__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3427:1: ( rule__DiceDiscSuk__Group__0__Impl rule__DiceDiscSuk__Group__1 )
            // InternalMyDsl.g:3428:2: rule__DiceDiscSuk__Group__0__Impl rule__DiceDiscSuk__Group__1
            {
            pushFollow(FOLLOW_17);
            rule__DiceDiscSuk__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DiceDiscSuk__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DiceDiscSuk__Group__0"


    // $ANTLR start "rule__DiceDiscSuk__Group__0__Impl"
    // InternalMyDsl.g:3435:1: rule__DiceDiscSuk__Group__0__Impl : ( 'odrzuc' ) ;
    public final void rule__DiceDiscSuk__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3439:1: ( ( 'odrzuc' ) )
            // InternalMyDsl.g:3440:1: ( 'odrzuc' )
            {
            // InternalMyDsl.g:3440:1: ( 'odrzuc' )
            // InternalMyDsl.g:3441:2: 'odrzuc'
            {
             before(grammarAccess.getDiceDiscSukAccess().getOdrzucKeyword_0()); 
            match(input,36,FOLLOW_2); 
             after(grammarAccess.getDiceDiscSukAccess().getOdrzucKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DiceDiscSuk__Group__0__Impl"


    // $ANTLR start "rule__DiceDiscSuk__Group__1"
    // InternalMyDsl.g:3450:1: rule__DiceDiscSuk__Group__1 : rule__DiceDiscSuk__Group__1__Impl ;
    public final void rule__DiceDiscSuk__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3454:1: ( rule__DiceDiscSuk__Group__1__Impl )
            // InternalMyDsl.g:3455:2: rule__DiceDiscSuk__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__DiceDiscSuk__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DiceDiscSuk__Group__1"


    // $ANTLR start "rule__DiceDiscSuk__Group__1__Impl"
    // InternalMyDsl.g:3461:1: rule__DiceDiscSuk__Group__1__Impl : ( ( rule__DiceDiscSuk__DiscardAssignment_1 ) ) ;
    public final void rule__DiceDiscSuk__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3465:1: ( ( ( rule__DiceDiscSuk__DiscardAssignment_1 ) ) )
            // InternalMyDsl.g:3466:1: ( ( rule__DiceDiscSuk__DiscardAssignment_1 ) )
            {
            // InternalMyDsl.g:3466:1: ( ( rule__DiceDiscSuk__DiscardAssignment_1 ) )
            // InternalMyDsl.g:3467:2: ( rule__DiceDiscSuk__DiscardAssignment_1 )
            {
             before(grammarAccess.getDiceDiscSukAccess().getDiscardAssignment_1()); 
            // InternalMyDsl.g:3468:2: ( rule__DiceDiscSuk__DiscardAssignment_1 )
            // InternalMyDsl.g:3468:3: rule__DiceDiscSuk__DiscardAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__DiceDiscSuk__DiscardAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getDiceDiscSukAccess().getDiscardAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DiceDiscSuk__Group__1__Impl"


    // $ANTLR start "rule__DiceRerollSuk__Group__0"
    // InternalMyDsl.g:3477:1: rule__DiceRerollSuk__Group__0 : rule__DiceRerollSuk__Group__0__Impl rule__DiceRerollSuk__Group__1 ;
    public final void rule__DiceRerollSuk__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3481:1: ( rule__DiceRerollSuk__Group__0__Impl rule__DiceRerollSuk__Group__1 )
            // InternalMyDsl.g:3482:2: rule__DiceRerollSuk__Group__0__Impl rule__DiceRerollSuk__Group__1
            {
            pushFollow(FOLLOW_17);
            rule__DiceRerollSuk__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DiceRerollSuk__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DiceRerollSuk__Group__0"


    // $ANTLR start "rule__DiceRerollSuk__Group__0__Impl"
    // InternalMyDsl.g:3489:1: rule__DiceRerollSuk__Group__0__Impl : ( 'przerzuc' ) ;
    public final void rule__DiceRerollSuk__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3493:1: ( ( 'przerzuc' ) )
            // InternalMyDsl.g:3494:1: ( 'przerzuc' )
            {
            // InternalMyDsl.g:3494:1: ( 'przerzuc' )
            // InternalMyDsl.g:3495:2: 'przerzuc'
            {
             before(grammarAccess.getDiceRerollSukAccess().getPrzerzucKeyword_0()); 
            match(input,37,FOLLOW_2); 
             after(grammarAccess.getDiceRerollSukAccess().getPrzerzucKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DiceRerollSuk__Group__0__Impl"


    // $ANTLR start "rule__DiceRerollSuk__Group__1"
    // InternalMyDsl.g:3504:1: rule__DiceRerollSuk__Group__1 : rule__DiceRerollSuk__Group__1__Impl ;
    public final void rule__DiceRerollSuk__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3508:1: ( rule__DiceRerollSuk__Group__1__Impl )
            // InternalMyDsl.g:3509:2: rule__DiceRerollSuk__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__DiceRerollSuk__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DiceRerollSuk__Group__1"


    // $ANTLR start "rule__DiceRerollSuk__Group__1__Impl"
    // InternalMyDsl.g:3515:1: rule__DiceRerollSuk__Group__1__Impl : ( ( rule__DiceRerollSuk__RerollAssignment_1 ) ) ;
    public final void rule__DiceRerollSuk__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3519:1: ( ( ( rule__DiceRerollSuk__RerollAssignment_1 ) ) )
            // InternalMyDsl.g:3520:1: ( ( rule__DiceRerollSuk__RerollAssignment_1 ) )
            {
            // InternalMyDsl.g:3520:1: ( ( rule__DiceRerollSuk__RerollAssignment_1 ) )
            // InternalMyDsl.g:3521:2: ( rule__DiceRerollSuk__RerollAssignment_1 )
            {
             before(grammarAccess.getDiceRerollSukAccess().getRerollAssignment_1()); 
            // InternalMyDsl.g:3522:2: ( rule__DiceRerollSuk__RerollAssignment_1 )
            // InternalMyDsl.g:3522:3: rule__DiceRerollSuk__RerollAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__DiceRerollSuk__RerollAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getDiceRerollSukAccess().getRerollAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DiceRerollSuk__Group__1__Impl"


    // $ANTLR start "rule__MarkThreshold__Group__0"
    // InternalMyDsl.g:3531:1: rule__MarkThreshold__Group__0 : rule__MarkThreshold__Group__0__Impl rule__MarkThreshold__Group__1 ;
    public final void rule__MarkThreshold__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3535:1: ( rule__MarkThreshold__Group__0__Impl rule__MarkThreshold__Group__1 )
            // InternalMyDsl.g:3536:2: rule__MarkThreshold__Group__0__Impl rule__MarkThreshold__Group__1
            {
            pushFollow(FOLLOW_12);
            rule__MarkThreshold__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MarkThreshold__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MarkThreshold__Group__0"


    // $ANTLR start "rule__MarkThreshold__Group__0__Impl"
    // InternalMyDsl.g:3543:1: rule__MarkThreshold__Group__0__Impl : ( ( rule__MarkThreshold__HightlowAssignment_0 ) ) ;
    public final void rule__MarkThreshold__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3547:1: ( ( ( rule__MarkThreshold__HightlowAssignment_0 ) ) )
            // InternalMyDsl.g:3548:1: ( ( rule__MarkThreshold__HightlowAssignment_0 ) )
            {
            // InternalMyDsl.g:3548:1: ( ( rule__MarkThreshold__HightlowAssignment_0 ) )
            // InternalMyDsl.g:3549:2: ( rule__MarkThreshold__HightlowAssignment_0 )
            {
             before(grammarAccess.getMarkThresholdAccess().getHightlowAssignment_0()); 
            // InternalMyDsl.g:3550:2: ( rule__MarkThreshold__HightlowAssignment_0 )
            // InternalMyDsl.g:3550:3: rule__MarkThreshold__HightlowAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__MarkThreshold__HightlowAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getMarkThresholdAccess().getHightlowAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MarkThreshold__Group__0__Impl"


    // $ANTLR start "rule__MarkThreshold__Group__1"
    // InternalMyDsl.g:3558:1: rule__MarkThreshold__Group__1 : rule__MarkThreshold__Group__1__Impl ;
    public final void rule__MarkThreshold__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3562:1: ( rule__MarkThreshold__Group__1__Impl )
            // InternalMyDsl.g:3563:2: rule__MarkThreshold__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__MarkThreshold__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MarkThreshold__Group__1"


    // $ANTLR start "rule__MarkThreshold__Group__1__Impl"
    // InternalMyDsl.g:3569:1: rule__MarkThreshold__Group__1__Impl : ( ( rule__MarkThreshold__NumAssignment_1 ) ) ;
    public final void rule__MarkThreshold__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3573:1: ( ( ( rule__MarkThreshold__NumAssignment_1 ) ) )
            // InternalMyDsl.g:3574:1: ( ( rule__MarkThreshold__NumAssignment_1 ) )
            {
            // InternalMyDsl.g:3574:1: ( ( rule__MarkThreshold__NumAssignment_1 ) )
            // InternalMyDsl.g:3575:2: ( rule__MarkThreshold__NumAssignment_1 )
            {
             before(grammarAccess.getMarkThresholdAccess().getNumAssignment_1()); 
            // InternalMyDsl.g:3576:2: ( rule__MarkThreshold__NumAssignment_1 )
            // InternalMyDsl.g:3576:3: rule__MarkThreshold__NumAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__MarkThreshold__NumAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getMarkThresholdAccess().getNumAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MarkThreshold__Group__1__Impl"


    // $ANTLR start "rule__MarkPosition__Group__0"
    // InternalMyDsl.g:3585:1: rule__MarkPosition__Group__0 : rule__MarkPosition__Group__0__Impl rule__MarkPosition__Group__1 ;
    public final void rule__MarkPosition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3589:1: ( rule__MarkPosition__Group__0__Impl rule__MarkPosition__Group__1 )
            // InternalMyDsl.g:3590:2: rule__MarkPosition__Group__0__Impl rule__MarkPosition__Group__1
            {
            pushFollow(FOLLOW_19);
            rule__MarkPosition__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MarkPosition__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MarkPosition__Group__0"


    // $ANTLR start "rule__MarkPosition__Group__0__Impl"
    // InternalMyDsl.g:3597:1: rule__MarkPosition__Group__0__Impl : ( ( rule__MarkPosition__NumAssignment_0 ) ) ;
    public final void rule__MarkPosition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3601:1: ( ( ( rule__MarkPosition__NumAssignment_0 ) ) )
            // InternalMyDsl.g:3602:1: ( ( rule__MarkPosition__NumAssignment_0 ) )
            {
            // InternalMyDsl.g:3602:1: ( ( rule__MarkPosition__NumAssignment_0 ) )
            // InternalMyDsl.g:3603:2: ( rule__MarkPosition__NumAssignment_0 )
            {
             before(grammarAccess.getMarkPositionAccess().getNumAssignment_0()); 
            // InternalMyDsl.g:3604:2: ( rule__MarkPosition__NumAssignment_0 )
            // InternalMyDsl.g:3604:3: rule__MarkPosition__NumAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__MarkPosition__NumAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getMarkPositionAccess().getNumAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MarkPosition__Group__0__Impl"


    // $ANTLR start "rule__MarkPosition__Group__1"
    // InternalMyDsl.g:3612:1: rule__MarkPosition__Group__1 : rule__MarkPosition__Group__1__Impl ;
    public final void rule__MarkPosition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3616:1: ( rule__MarkPosition__Group__1__Impl )
            // InternalMyDsl.g:3617:2: rule__MarkPosition__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__MarkPosition__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MarkPosition__Group__1"


    // $ANTLR start "rule__MarkPosition__Group__1__Impl"
    // InternalMyDsl.g:3623:1: rule__MarkPosition__Group__1__Impl : ( ( rule__MarkPosition__FirstlastAssignment_1 ) ) ;
    public final void rule__MarkPosition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3627:1: ( ( ( rule__MarkPosition__FirstlastAssignment_1 ) ) )
            // InternalMyDsl.g:3628:1: ( ( rule__MarkPosition__FirstlastAssignment_1 ) )
            {
            // InternalMyDsl.g:3628:1: ( ( rule__MarkPosition__FirstlastAssignment_1 ) )
            // InternalMyDsl.g:3629:2: ( rule__MarkPosition__FirstlastAssignment_1 )
            {
             before(grammarAccess.getMarkPositionAccess().getFirstlastAssignment_1()); 
            // InternalMyDsl.g:3630:2: ( rule__MarkPosition__FirstlastAssignment_1 )
            // InternalMyDsl.g:3630:3: rule__MarkPosition__FirstlastAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__MarkPosition__FirstlastAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getMarkPositionAccess().getFirstlastAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MarkPosition__Group__1__Impl"


    // $ANTLR start "rule__DiscardThreshold__Group__0"
    // InternalMyDsl.g:3639:1: rule__DiscardThreshold__Group__0 : rule__DiscardThreshold__Group__0__Impl rule__DiscardThreshold__Group__1 ;
    public final void rule__DiscardThreshold__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3643:1: ( rule__DiscardThreshold__Group__0__Impl rule__DiscardThreshold__Group__1 )
            // InternalMyDsl.g:3644:2: rule__DiscardThreshold__Group__0__Impl rule__DiscardThreshold__Group__1
            {
            pushFollow(FOLLOW_12);
            rule__DiscardThreshold__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DiscardThreshold__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DiscardThreshold__Group__0"


    // $ANTLR start "rule__DiscardThreshold__Group__0__Impl"
    // InternalMyDsl.g:3651:1: rule__DiscardThreshold__Group__0__Impl : ( ( rule__DiscardThreshold__HightlowAssignment_0 ) ) ;
    public final void rule__DiscardThreshold__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3655:1: ( ( ( rule__DiscardThreshold__HightlowAssignment_0 ) ) )
            // InternalMyDsl.g:3656:1: ( ( rule__DiscardThreshold__HightlowAssignment_0 ) )
            {
            // InternalMyDsl.g:3656:1: ( ( rule__DiscardThreshold__HightlowAssignment_0 ) )
            // InternalMyDsl.g:3657:2: ( rule__DiscardThreshold__HightlowAssignment_0 )
            {
             before(grammarAccess.getDiscardThresholdAccess().getHightlowAssignment_0()); 
            // InternalMyDsl.g:3658:2: ( rule__DiscardThreshold__HightlowAssignment_0 )
            // InternalMyDsl.g:3658:3: rule__DiscardThreshold__HightlowAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__DiscardThreshold__HightlowAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getDiscardThresholdAccess().getHightlowAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DiscardThreshold__Group__0__Impl"


    // $ANTLR start "rule__DiscardThreshold__Group__1"
    // InternalMyDsl.g:3666:1: rule__DiscardThreshold__Group__1 : rule__DiscardThreshold__Group__1__Impl ;
    public final void rule__DiscardThreshold__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3670:1: ( rule__DiscardThreshold__Group__1__Impl )
            // InternalMyDsl.g:3671:2: rule__DiscardThreshold__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__DiscardThreshold__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DiscardThreshold__Group__1"


    // $ANTLR start "rule__DiscardThreshold__Group__1__Impl"
    // InternalMyDsl.g:3677:1: rule__DiscardThreshold__Group__1__Impl : ( ( rule__DiscardThreshold__NumAssignment_1 ) ) ;
    public final void rule__DiscardThreshold__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3681:1: ( ( ( rule__DiscardThreshold__NumAssignment_1 ) ) )
            // InternalMyDsl.g:3682:1: ( ( rule__DiscardThreshold__NumAssignment_1 ) )
            {
            // InternalMyDsl.g:3682:1: ( ( rule__DiscardThreshold__NumAssignment_1 ) )
            // InternalMyDsl.g:3683:2: ( rule__DiscardThreshold__NumAssignment_1 )
            {
             before(grammarAccess.getDiscardThresholdAccess().getNumAssignment_1()); 
            // InternalMyDsl.g:3684:2: ( rule__DiscardThreshold__NumAssignment_1 )
            // InternalMyDsl.g:3684:3: rule__DiscardThreshold__NumAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__DiscardThreshold__NumAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getDiscardThresholdAccess().getNumAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DiscardThreshold__Group__1__Impl"


    // $ANTLR start "rule__DiscardPosition__Group__0"
    // InternalMyDsl.g:3693:1: rule__DiscardPosition__Group__0 : rule__DiscardPosition__Group__0__Impl rule__DiscardPosition__Group__1 ;
    public final void rule__DiscardPosition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3697:1: ( rule__DiscardPosition__Group__0__Impl rule__DiscardPosition__Group__1 )
            // InternalMyDsl.g:3698:2: rule__DiscardPosition__Group__0__Impl rule__DiscardPosition__Group__1
            {
            pushFollow(FOLLOW_19);
            rule__DiscardPosition__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DiscardPosition__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DiscardPosition__Group__0"


    // $ANTLR start "rule__DiscardPosition__Group__0__Impl"
    // InternalMyDsl.g:3705:1: rule__DiscardPosition__Group__0__Impl : ( ( rule__DiscardPosition__NumAssignment_0 ) ) ;
    public final void rule__DiscardPosition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3709:1: ( ( ( rule__DiscardPosition__NumAssignment_0 ) ) )
            // InternalMyDsl.g:3710:1: ( ( rule__DiscardPosition__NumAssignment_0 ) )
            {
            // InternalMyDsl.g:3710:1: ( ( rule__DiscardPosition__NumAssignment_0 ) )
            // InternalMyDsl.g:3711:2: ( rule__DiscardPosition__NumAssignment_0 )
            {
             before(grammarAccess.getDiscardPositionAccess().getNumAssignment_0()); 
            // InternalMyDsl.g:3712:2: ( rule__DiscardPosition__NumAssignment_0 )
            // InternalMyDsl.g:3712:3: rule__DiscardPosition__NumAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__DiscardPosition__NumAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getDiscardPositionAccess().getNumAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DiscardPosition__Group__0__Impl"


    // $ANTLR start "rule__DiscardPosition__Group__1"
    // InternalMyDsl.g:3720:1: rule__DiscardPosition__Group__1 : rule__DiscardPosition__Group__1__Impl ;
    public final void rule__DiscardPosition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3724:1: ( rule__DiscardPosition__Group__1__Impl )
            // InternalMyDsl.g:3725:2: rule__DiscardPosition__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__DiscardPosition__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DiscardPosition__Group__1"


    // $ANTLR start "rule__DiscardPosition__Group__1__Impl"
    // InternalMyDsl.g:3731:1: rule__DiscardPosition__Group__1__Impl : ( ( rule__DiscardPosition__FirstlastAssignment_1 ) ) ;
    public final void rule__DiscardPosition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3735:1: ( ( ( rule__DiscardPosition__FirstlastAssignment_1 ) ) )
            // InternalMyDsl.g:3736:1: ( ( rule__DiscardPosition__FirstlastAssignment_1 ) )
            {
            // InternalMyDsl.g:3736:1: ( ( rule__DiscardPosition__FirstlastAssignment_1 ) )
            // InternalMyDsl.g:3737:2: ( rule__DiscardPosition__FirstlastAssignment_1 )
            {
             before(grammarAccess.getDiscardPositionAccess().getFirstlastAssignment_1()); 
            // InternalMyDsl.g:3738:2: ( rule__DiscardPosition__FirstlastAssignment_1 )
            // InternalMyDsl.g:3738:3: rule__DiscardPosition__FirstlastAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__DiscardPosition__FirstlastAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getDiscardPositionAccess().getFirstlastAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DiscardPosition__Group__1__Impl"


    // $ANTLR start "rule__RerollThreshold__Group__0"
    // InternalMyDsl.g:3747:1: rule__RerollThreshold__Group__0 : rule__RerollThreshold__Group__0__Impl rule__RerollThreshold__Group__1 ;
    public final void rule__RerollThreshold__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3751:1: ( rule__RerollThreshold__Group__0__Impl rule__RerollThreshold__Group__1 )
            // InternalMyDsl.g:3752:2: rule__RerollThreshold__Group__0__Impl rule__RerollThreshold__Group__1
            {
            pushFollow(FOLLOW_12);
            rule__RerollThreshold__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RerollThreshold__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RerollThreshold__Group__0"


    // $ANTLR start "rule__RerollThreshold__Group__0__Impl"
    // InternalMyDsl.g:3759:1: rule__RerollThreshold__Group__0__Impl : ( ( rule__RerollThreshold__HightlowAssignment_0 ) ) ;
    public final void rule__RerollThreshold__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3763:1: ( ( ( rule__RerollThreshold__HightlowAssignment_0 ) ) )
            // InternalMyDsl.g:3764:1: ( ( rule__RerollThreshold__HightlowAssignment_0 ) )
            {
            // InternalMyDsl.g:3764:1: ( ( rule__RerollThreshold__HightlowAssignment_0 ) )
            // InternalMyDsl.g:3765:2: ( rule__RerollThreshold__HightlowAssignment_0 )
            {
             before(grammarAccess.getRerollThresholdAccess().getHightlowAssignment_0()); 
            // InternalMyDsl.g:3766:2: ( rule__RerollThreshold__HightlowAssignment_0 )
            // InternalMyDsl.g:3766:3: rule__RerollThreshold__HightlowAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__RerollThreshold__HightlowAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getRerollThresholdAccess().getHightlowAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RerollThreshold__Group__0__Impl"


    // $ANTLR start "rule__RerollThreshold__Group__1"
    // InternalMyDsl.g:3774:1: rule__RerollThreshold__Group__1 : rule__RerollThreshold__Group__1__Impl ;
    public final void rule__RerollThreshold__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3778:1: ( rule__RerollThreshold__Group__1__Impl )
            // InternalMyDsl.g:3779:2: rule__RerollThreshold__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__RerollThreshold__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RerollThreshold__Group__1"


    // $ANTLR start "rule__RerollThreshold__Group__1__Impl"
    // InternalMyDsl.g:3785:1: rule__RerollThreshold__Group__1__Impl : ( ( rule__RerollThreshold__NumAssignment_1 ) ) ;
    public final void rule__RerollThreshold__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3789:1: ( ( ( rule__RerollThreshold__NumAssignment_1 ) ) )
            // InternalMyDsl.g:3790:1: ( ( rule__RerollThreshold__NumAssignment_1 ) )
            {
            // InternalMyDsl.g:3790:1: ( ( rule__RerollThreshold__NumAssignment_1 ) )
            // InternalMyDsl.g:3791:2: ( rule__RerollThreshold__NumAssignment_1 )
            {
             before(grammarAccess.getRerollThresholdAccess().getNumAssignment_1()); 
            // InternalMyDsl.g:3792:2: ( rule__RerollThreshold__NumAssignment_1 )
            // InternalMyDsl.g:3792:3: rule__RerollThreshold__NumAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__RerollThreshold__NumAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getRerollThresholdAccess().getNumAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RerollThreshold__Group__1__Impl"


    // $ANTLR start "rule__RerollPosition__Group__0"
    // InternalMyDsl.g:3801:1: rule__RerollPosition__Group__0 : rule__RerollPosition__Group__0__Impl rule__RerollPosition__Group__1 ;
    public final void rule__RerollPosition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3805:1: ( rule__RerollPosition__Group__0__Impl rule__RerollPosition__Group__1 )
            // InternalMyDsl.g:3806:2: rule__RerollPosition__Group__0__Impl rule__RerollPosition__Group__1
            {
            pushFollow(FOLLOW_19);
            rule__RerollPosition__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RerollPosition__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RerollPosition__Group__0"


    // $ANTLR start "rule__RerollPosition__Group__0__Impl"
    // InternalMyDsl.g:3813:1: rule__RerollPosition__Group__0__Impl : ( ( rule__RerollPosition__NumAssignment_0 ) ) ;
    public final void rule__RerollPosition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3817:1: ( ( ( rule__RerollPosition__NumAssignment_0 ) ) )
            // InternalMyDsl.g:3818:1: ( ( rule__RerollPosition__NumAssignment_0 ) )
            {
            // InternalMyDsl.g:3818:1: ( ( rule__RerollPosition__NumAssignment_0 ) )
            // InternalMyDsl.g:3819:2: ( rule__RerollPosition__NumAssignment_0 )
            {
             before(grammarAccess.getRerollPositionAccess().getNumAssignment_0()); 
            // InternalMyDsl.g:3820:2: ( rule__RerollPosition__NumAssignment_0 )
            // InternalMyDsl.g:3820:3: rule__RerollPosition__NumAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__RerollPosition__NumAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getRerollPositionAccess().getNumAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RerollPosition__Group__0__Impl"


    // $ANTLR start "rule__RerollPosition__Group__1"
    // InternalMyDsl.g:3828:1: rule__RerollPosition__Group__1 : rule__RerollPosition__Group__1__Impl ;
    public final void rule__RerollPosition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3832:1: ( rule__RerollPosition__Group__1__Impl )
            // InternalMyDsl.g:3833:2: rule__RerollPosition__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__RerollPosition__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RerollPosition__Group__1"


    // $ANTLR start "rule__RerollPosition__Group__1__Impl"
    // InternalMyDsl.g:3839:1: rule__RerollPosition__Group__1__Impl : ( ( rule__RerollPosition__FirstlastAssignment_1 ) ) ;
    public final void rule__RerollPosition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3843:1: ( ( ( rule__RerollPosition__FirstlastAssignment_1 ) ) )
            // InternalMyDsl.g:3844:1: ( ( rule__RerollPosition__FirstlastAssignment_1 ) )
            {
            // InternalMyDsl.g:3844:1: ( ( rule__RerollPosition__FirstlastAssignment_1 ) )
            // InternalMyDsl.g:3845:2: ( rule__RerollPosition__FirstlastAssignment_1 )
            {
             before(grammarAccess.getRerollPositionAccess().getFirstlastAssignment_1()); 
            // InternalMyDsl.g:3846:2: ( rule__RerollPosition__FirstlastAssignment_1 )
            // InternalMyDsl.g:3846:3: rule__RerollPosition__FirstlastAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__RerollPosition__FirstlastAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getRerollPositionAccess().getFirstlastAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RerollPosition__Group__1__Impl"


    // $ANTLR start "rule__EInt__Group__0"
    // InternalMyDsl.g:3855:1: rule__EInt__Group__0 : rule__EInt__Group__0__Impl rule__EInt__Group__1 ;
    public final void rule__EInt__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3859:1: ( rule__EInt__Group__0__Impl rule__EInt__Group__1 )
            // InternalMyDsl.g:3860:2: rule__EInt__Group__0__Impl rule__EInt__Group__1
            {
            pushFollow(FOLLOW_12);
            rule__EInt__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EInt__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EInt__Group__0"


    // $ANTLR start "rule__EInt__Group__0__Impl"
    // InternalMyDsl.g:3867:1: rule__EInt__Group__0__Impl : ( ( '-' )? ) ;
    public final void rule__EInt__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3871:1: ( ( ( '-' )? ) )
            // InternalMyDsl.g:3872:1: ( ( '-' )? )
            {
            // InternalMyDsl.g:3872:1: ( ( '-' )? )
            // InternalMyDsl.g:3873:2: ( '-' )?
            {
             before(grammarAccess.getEIntAccess().getHyphenMinusKeyword_0()); 
            // InternalMyDsl.g:3874:2: ( '-' )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==39) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // InternalMyDsl.g:3874:3: '-'
                    {
                    match(input,39,FOLLOW_2); 

                    }
                    break;

            }

             after(grammarAccess.getEIntAccess().getHyphenMinusKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EInt__Group__0__Impl"


    // $ANTLR start "rule__EInt__Group__1"
    // InternalMyDsl.g:3882:1: rule__EInt__Group__1 : rule__EInt__Group__1__Impl ;
    public final void rule__EInt__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3886:1: ( rule__EInt__Group__1__Impl )
            // InternalMyDsl.g:3887:2: rule__EInt__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__EInt__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EInt__Group__1"


    // $ANTLR start "rule__EInt__Group__1__Impl"
    // InternalMyDsl.g:3893:1: rule__EInt__Group__1__Impl : ( RULE_INT ) ;
    public final void rule__EInt__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3897:1: ( ( RULE_INT ) )
            // InternalMyDsl.g:3898:1: ( RULE_INT )
            {
            // InternalMyDsl.g:3898:1: ( RULE_INT )
            // InternalMyDsl.g:3899:2: RULE_INT
            {
             before(grammarAccess.getEIntAccess().getINTTerminalRuleCall_1()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getEIntAccess().getINTTerminalRuleCall_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EInt__Group__1__Impl"


    // $ANTLR start "rule__Language__StatementAssignment"
    // InternalMyDsl.g:3909:1: rule__Language__StatementAssignment : ( ruleStat ) ;
    public final void rule__Language__StatementAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3913:1: ( ( ruleStat ) )
            // InternalMyDsl.g:3914:2: ( ruleStat )
            {
            // InternalMyDsl.g:3914:2: ( ruleStat )
            // InternalMyDsl.g:3915:3: ruleStat
            {
             before(grammarAccess.getLanguageAccess().getStatementStatParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleStat();

            state._fsp--;

             after(grammarAccess.getLanguageAccess().getStatementStatParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Language__StatementAssignment"


    // $ANTLR start "rule__Sumuj__DiceexprsumAssignment_2"
    // InternalMyDsl.g:3924:1: rule__Sumuj__DiceexprsumAssignment_2 : ( ruleDiceExprSum ) ;
    public final void rule__Sumuj__DiceexprsumAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3928:1: ( ( ruleDiceExprSum ) )
            // InternalMyDsl.g:3929:2: ( ruleDiceExprSum )
            {
            // InternalMyDsl.g:3929:2: ( ruleDiceExprSum )
            // InternalMyDsl.g:3930:3: ruleDiceExprSum
            {
             before(grammarAccess.getSumujAccess().getDiceexprsumDiceExprSumParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleDiceExprSum();

            state._fsp--;

             after(grammarAccess.getSumujAccess().getDiceexprsumDiceExprSumParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sumuj__DiceexprsumAssignment_2"


    // $ANTLR start "rule__Sumuj__DiceexprsumAssignment_3_1"
    // InternalMyDsl.g:3939:1: rule__Sumuj__DiceexprsumAssignment_3_1 : ( ruleDiceExprSum ) ;
    public final void rule__Sumuj__DiceexprsumAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3943:1: ( ( ruleDiceExprSum ) )
            // InternalMyDsl.g:3944:2: ( ruleDiceExprSum )
            {
            // InternalMyDsl.g:3944:2: ( ruleDiceExprSum )
            // InternalMyDsl.g:3945:3: ruleDiceExprSum
            {
             before(grammarAccess.getSumujAccess().getDiceexprsumDiceExprSumParserRuleCall_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleDiceExprSum();

            state._fsp--;

             after(grammarAccess.getSumujAccess().getDiceexprsumDiceExprSumParserRuleCall_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sumuj__DiceexprsumAssignment_3_1"


    // $ANTLR start "rule__Sukcesy__DiceexprsukAssignment_2"
    // InternalMyDsl.g:3954:1: rule__Sukcesy__DiceexprsukAssignment_2 : ( ruleDiceExprSuk ) ;
    public final void rule__Sukcesy__DiceexprsukAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3958:1: ( ( ruleDiceExprSuk ) )
            // InternalMyDsl.g:3959:2: ( ruleDiceExprSuk )
            {
            // InternalMyDsl.g:3959:2: ( ruleDiceExprSuk )
            // InternalMyDsl.g:3960:3: ruleDiceExprSuk
            {
             before(grammarAccess.getSukcesyAccess().getDiceexprsukDiceExprSukParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleDiceExprSuk();

            state._fsp--;

             after(grammarAccess.getSukcesyAccess().getDiceexprsukDiceExprSukParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sukcesy__DiceexprsukAssignment_2"


    // $ANTLR start "rule__Sukcesy__DiceexprsukAssignment_3_1"
    // InternalMyDsl.g:3969:1: rule__Sukcesy__DiceexprsukAssignment_3_1 : ( ruleDiceExprSuk ) ;
    public final void rule__Sukcesy__DiceexprsukAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3973:1: ( ( ruleDiceExprSuk ) )
            // InternalMyDsl.g:3974:2: ( ruleDiceExprSuk )
            {
            // InternalMyDsl.g:3974:2: ( ruleDiceExprSuk )
            // InternalMyDsl.g:3975:3: ruleDiceExprSuk
            {
             before(grammarAccess.getSukcesyAccess().getDiceexprsukDiceExprSukParserRuleCall_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleDiceExprSuk();

            state._fsp--;

             after(grammarAccess.getSukcesyAccess().getDiceexprsukDiceExprSukParserRuleCall_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sukcesy__DiceexprsukAssignment_3_1"


    // $ANTLR start "rule__DiceExprSum__SignAssignment_0"
    // InternalMyDsl.g:3984:1: rule__DiceExprSum__SignAssignment_0 : ( ruleSign ) ;
    public final void rule__DiceExprSum__SignAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3988:1: ( ( ruleSign ) )
            // InternalMyDsl.g:3989:2: ( ruleSign )
            {
            // InternalMyDsl.g:3989:2: ( ruleSign )
            // InternalMyDsl.g:3990:3: ruleSign
            {
             before(grammarAccess.getDiceExprSumAccess().getSignSignEnumRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleSign();

            state._fsp--;

             after(grammarAccess.getDiceExprSumAccess().getSignSignEnumRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DiceExprSum__SignAssignment_0"


    // $ANTLR start "rule__DiceExprSum__MulexprAssignment_1"
    // InternalMyDsl.g:3999:1: rule__DiceExprSum__MulexprAssignment_1 : ( ruleMulExpr ) ;
    public final void rule__DiceExprSum__MulexprAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4003:1: ( ( ruleMulExpr ) )
            // InternalMyDsl.g:4004:2: ( ruleMulExpr )
            {
            // InternalMyDsl.g:4004:2: ( ruleMulExpr )
            // InternalMyDsl.g:4005:3: ruleMulExpr
            {
             before(grammarAccess.getDiceExprSumAccess().getMulexprMulExprParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleMulExpr();

            state._fsp--;

             after(grammarAccess.getDiceExprSumAccess().getMulexprMulExprParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DiceExprSum__MulexprAssignment_1"


    // $ANTLR start "rule__DiceExprSum__SumruleAssignment_2_1"
    // InternalMyDsl.g:4014:1: rule__DiceExprSum__SumruleAssignment_2_1 : ( ruleRuleSum ) ;
    public final void rule__DiceExprSum__SumruleAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4018:1: ( ( ruleRuleSum ) )
            // InternalMyDsl.g:4019:2: ( ruleRuleSum )
            {
            // InternalMyDsl.g:4019:2: ( ruleRuleSum )
            // InternalMyDsl.g:4020:3: ruleRuleSum
            {
             before(grammarAccess.getDiceExprSumAccess().getSumruleRuleSumParserRuleCall_2_1_0()); 
            pushFollow(FOLLOW_2);
            ruleRuleSum();

            state._fsp--;

             after(grammarAccess.getDiceExprSumAccess().getSumruleRuleSumParserRuleCall_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DiceExprSum__SumruleAssignment_2_1"


    // $ANTLR start "rule__DiceExprSum__SumruleAssignment_2_2_1"
    // InternalMyDsl.g:4029:1: rule__DiceExprSum__SumruleAssignment_2_2_1 : ( ruleRuleSum ) ;
    public final void rule__DiceExprSum__SumruleAssignment_2_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4033:1: ( ( ruleRuleSum ) )
            // InternalMyDsl.g:4034:2: ( ruleRuleSum )
            {
            // InternalMyDsl.g:4034:2: ( ruleRuleSum )
            // InternalMyDsl.g:4035:3: ruleRuleSum
            {
             before(grammarAccess.getDiceExprSumAccess().getSumruleRuleSumParserRuleCall_2_2_1_0()); 
            pushFollow(FOLLOW_2);
            ruleRuleSum();

            state._fsp--;

             after(grammarAccess.getDiceExprSumAccess().getSumruleRuleSumParserRuleCall_2_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DiceExprSum__SumruleAssignment_2_2_1"


    // $ANTLR start "rule__DiceExprSuk__SignAssignment_0"
    // InternalMyDsl.g:4044:1: rule__DiceExprSuk__SignAssignment_0 : ( ruleSign ) ;
    public final void rule__DiceExprSuk__SignAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4048:1: ( ( ruleSign ) )
            // InternalMyDsl.g:4049:2: ( ruleSign )
            {
            // InternalMyDsl.g:4049:2: ( ruleSign )
            // InternalMyDsl.g:4050:3: ruleSign
            {
             before(grammarAccess.getDiceExprSukAccess().getSignSignEnumRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleSign();

            state._fsp--;

             after(grammarAccess.getDiceExprSukAccess().getSignSignEnumRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DiceExprSuk__SignAssignment_0"


    // $ANTLR start "rule__DiceExprSuk__MulexprAssignment_1"
    // InternalMyDsl.g:4059:1: rule__DiceExprSuk__MulexprAssignment_1 : ( ruleMulExpr ) ;
    public final void rule__DiceExprSuk__MulexprAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4063:1: ( ( ruleMulExpr ) )
            // InternalMyDsl.g:4064:2: ( ruleMulExpr )
            {
            // InternalMyDsl.g:4064:2: ( ruleMulExpr )
            // InternalMyDsl.g:4065:3: ruleMulExpr
            {
             before(grammarAccess.getDiceExprSukAccess().getMulexprMulExprParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleMulExpr();

            state._fsp--;

             after(grammarAccess.getDiceExprSukAccess().getMulexprMulExprParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DiceExprSuk__MulexprAssignment_1"


    // $ANTLR start "rule__DiceExprSuk__SuccessruleAssignment_2_1"
    // InternalMyDsl.g:4074:1: rule__DiceExprSuk__SuccessruleAssignment_2_1 : ( ruleRuleSuk ) ;
    public final void rule__DiceExprSuk__SuccessruleAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4078:1: ( ( ruleRuleSuk ) )
            // InternalMyDsl.g:4079:2: ( ruleRuleSuk )
            {
            // InternalMyDsl.g:4079:2: ( ruleRuleSuk )
            // InternalMyDsl.g:4080:3: ruleRuleSuk
            {
             before(grammarAccess.getDiceExprSukAccess().getSuccessruleRuleSukParserRuleCall_2_1_0()); 
            pushFollow(FOLLOW_2);
            ruleRuleSuk();

            state._fsp--;

             after(grammarAccess.getDiceExprSukAccess().getSuccessruleRuleSukParserRuleCall_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DiceExprSuk__SuccessruleAssignment_2_1"


    // $ANTLR start "rule__DiceExprSuk__SuccessruleAssignment_2_2_1"
    // InternalMyDsl.g:4089:1: rule__DiceExprSuk__SuccessruleAssignment_2_2_1 : ( ruleRuleSuk ) ;
    public final void rule__DiceExprSuk__SuccessruleAssignment_2_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4093:1: ( ( ruleRuleSuk ) )
            // InternalMyDsl.g:4094:2: ( ruleRuleSuk )
            {
            // InternalMyDsl.g:4094:2: ( ruleRuleSuk )
            // InternalMyDsl.g:4095:3: ruleRuleSuk
            {
             before(grammarAccess.getDiceExprSukAccess().getSuccessruleRuleSukParserRuleCall_2_2_1_0()); 
            pushFollow(FOLLOW_2);
            ruleRuleSuk();

            state._fsp--;

             after(grammarAccess.getDiceExprSukAccess().getSuccessruleRuleSukParserRuleCall_2_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DiceExprSuk__SuccessruleAssignment_2_2_1"


    // $ANTLR start "rule__MulExpr__FormexprAssignment_0_0"
    // InternalMyDsl.g:4104:1: rule__MulExpr__FormexprAssignment_0_0 : ( ruleForm ) ;
    public final void rule__MulExpr__FormexprAssignment_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4108:1: ( ( ruleForm ) )
            // InternalMyDsl.g:4109:2: ( ruleForm )
            {
            // InternalMyDsl.g:4109:2: ( ruleForm )
            // InternalMyDsl.g:4110:3: ruleForm
            {
             before(grammarAccess.getMulExprAccess().getFormexprFormParserRuleCall_0_0_0()); 
            pushFollow(FOLLOW_2);
            ruleForm();

            state._fsp--;

             after(grammarAccess.getMulExprAccess().getFormexprFormParserRuleCall_0_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MulExpr__FormexprAssignment_0_0"


    // $ANTLR start "rule__MulExpr__NumAssignment_0_1_1"
    // InternalMyDsl.g:4119:1: rule__MulExpr__NumAssignment_0_1_1 : ( ruleNum ) ;
    public final void rule__MulExpr__NumAssignment_0_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4123:1: ( ( ruleNum ) )
            // InternalMyDsl.g:4124:2: ( ruleNum )
            {
            // InternalMyDsl.g:4124:2: ( ruleNum )
            // InternalMyDsl.g:4125:3: ruleNum
            {
             before(grammarAccess.getMulExprAccess().getNumNumParserRuleCall_0_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleNum();

            state._fsp--;

             after(grammarAccess.getMulExprAccess().getNumNumParserRuleCall_0_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MulExpr__NumAssignment_0_1_1"


    // $ANTLR start "rule__MulExpr__FormexprAssignment_1_1"
    // InternalMyDsl.g:4134:1: rule__MulExpr__FormexprAssignment_1_1 : ( ruleForm ) ;
    public final void rule__MulExpr__FormexprAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4138:1: ( ( ruleForm ) )
            // InternalMyDsl.g:4139:2: ( ruleForm )
            {
            // InternalMyDsl.g:4139:2: ( ruleForm )
            // InternalMyDsl.g:4140:3: ruleForm
            {
             before(grammarAccess.getMulExprAccess().getFormexprFormParserRuleCall_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleForm();

            state._fsp--;

             after(grammarAccess.getMulExprAccess().getFormexprFormParserRuleCall_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MulExpr__FormexprAssignment_1_1"


    // $ANTLR start "rule__MulExpr__NumAssignment_1_3_1"
    // InternalMyDsl.g:4149:1: rule__MulExpr__NumAssignment_1_3_1 : ( ruleNum ) ;
    public final void rule__MulExpr__NumAssignment_1_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4153:1: ( ( ruleNum ) )
            // InternalMyDsl.g:4154:2: ( ruleNum )
            {
            // InternalMyDsl.g:4154:2: ( ruleNum )
            // InternalMyDsl.g:4155:3: ruleNum
            {
             before(grammarAccess.getMulExprAccess().getNumNumParserRuleCall_1_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleNum();

            state._fsp--;

             after(grammarAccess.getMulExprAccess().getNumNumParserRuleCall_1_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MulExpr__NumAssignment_1_3_1"


    // $ANTLR start "rule__Form__LeftAssignment_0"
    // InternalMyDsl.g:4164:1: rule__Form__LeftAssignment_0 : ( ruleDice ) ;
    public final void rule__Form__LeftAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4168:1: ( ( ruleDice ) )
            // InternalMyDsl.g:4169:2: ( ruleDice )
            {
            // InternalMyDsl.g:4169:2: ( ruleDice )
            // InternalMyDsl.g:4170:3: ruleDice
            {
             before(grammarAccess.getFormAccess().getLeftDiceParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleDice();

            state._fsp--;

             after(grammarAccess.getFormAccess().getLeftDiceParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Form__LeftAssignment_0"


    // $ANTLR start "rule__Form__OperatorAssignment_1_0"
    // InternalMyDsl.g:4179:1: rule__Form__OperatorAssignment_1_0 : ( ruleOperator ) ;
    public final void rule__Form__OperatorAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4183:1: ( ( ruleOperator ) )
            // InternalMyDsl.g:4184:2: ( ruleOperator )
            {
            // InternalMyDsl.g:4184:2: ( ruleOperator )
            // InternalMyDsl.g:4185:3: ruleOperator
            {
             before(grammarAccess.getFormAccess().getOperatorOperatorEnumRuleCall_1_0_0()); 
            pushFollow(FOLLOW_2);
            ruleOperator();

            state._fsp--;

             after(grammarAccess.getFormAccess().getOperatorOperatorEnumRuleCall_1_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Form__OperatorAssignment_1_0"


    // $ANTLR start "rule__Form__RightAssignment_1_1"
    // InternalMyDsl.g:4194:1: rule__Form__RightAssignment_1_1 : ( ruleNum ) ;
    public final void rule__Form__RightAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4198:1: ( ( ruleNum ) )
            // InternalMyDsl.g:4199:2: ( ruleNum )
            {
            // InternalMyDsl.g:4199:2: ( ruleNum )
            // InternalMyDsl.g:4200:3: ruleNum
            {
             before(grammarAccess.getFormAccess().getRightNumParserRuleCall_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleNum();

            state._fsp--;

             after(grammarAccess.getFormAccess().getRightNumParserRuleCall_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Form__RightAssignment_1_1"


    // $ANTLR start "rule__SingleDice__SidesAssignment_1"
    // InternalMyDsl.g:4209:1: rule__SingleDice__SidesAssignment_1 : ( ruleNum ) ;
    public final void rule__SingleDice__SidesAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4213:1: ( ( ruleNum ) )
            // InternalMyDsl.g:4214:2: ( ruleNum )
            {
            // InternalMyDsl.g:4214:2: ( ruleNum )
            // InternalMyDsl.g:4215:3: ruleNum
            {
             before(grammarAccess.getSingleDiceAccess().getSidesNumParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleNum();

            state._fsp--;

             after(grammarAccess.getSingleDiceAccess().getSidesNumParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SingleDice__SidesAssignment_1"


    // $ANTLR start "rule__MultiDice__CountAssignment_0"
    // InternalMyDsl.g:4224:1: rule__MultiDice__CountAssignment_0 : ( ruleNum ) ;
    public final void rule__MultiDice__CountAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4228:1: ( ( ruleNum ) )
            // InternalMyDsl.g:4229:2: ( ruleNum )
            {
            // InternalMyDsl.g:4229:2: ( ruleNum )
            // InternalMyDsl.g:4230:3: ruleNum
            {
             before(grammarAccess.getMultiDiceAccess().getCountNumParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleNum();

            state._fsp--;

             after(grammarAccess.getMultiDiceAccess().getCountNumParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultiDice__CountAssignment_0"


    // $ANTLR start "rule__MultiDice__SidesAssignment_2"
    // InternalMyDsl.g:4239:1: rule__MultiDice__SidesAssignment_2 : ( ruleNum ) ;
    public final void rule__MultiDice__SidesAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4243:1: ( ( ruleNum ) )
            // InternalMyDsl.g:4244:2: ( ruleNum )
            {
            // InternalMyDsl.g:4244:2: ( ruleNum )
            // InternalMyDsl.g:4245:3: ruleNum
            {
             before(grammarAccess.getMultiDiceAccess().getSidesNumParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleNum();

            state._fsp--;

             after(grammarAccess.getMultiDiceAccess().getSidesNumParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultiDice__SidesAssignment_2"


    // $ANTLR start "rule__ExplosionRule__SignAssignment_0"
    // InternalMyDsl.g:4254:1: rule__ExplosionRule__SignAssignment_0 : ( ruleSign ) ;
    public final void rule__ExplosionRule__SignAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4258:1: ( ( ruleSign ) )
            // InternalMyDsl.g:4259:2: ( ruleSign )
            {
            // InternalMyDsl.g:4259:2: ( ruleSign )
            // InternalMyDsl.g:4260:3: ruleSign
            {
             before(grammarAccess.getExplosionRuleAccess().getSignSignEnumRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleSign();

            state._fsp--;

             after(grammarAccess.getExplosionRuleAccess().getSignSignEnumRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExplosionRule__SignAssignment_0"


    // $ANTLR start "rule__ExplosionRule__NumAssignment_2"
    // InternalMyDsl.g:4269:1: rule__ExplosionRule__NumAssignment_2 : ( ruleNum ) ;
    public final void rule__ExplosionRule__NumAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4273:1: ( ( ruleNum ) )
            // InternalMyDsl.g:4274:2: ( ruleNum )
            {
            // InternalMyDsl.g:4274:2: ( ruleNum )
            // InternalMyDsl.g:4275:3: ruleNum
            {
             before(grammarAccess.getExplosionRuleAccess().getNumNumParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleNum();

            state._fsp--;

             after(grammarAccess.getExplosionRuleAccess().getNumNumParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExplosionRule__NumAssignment_2"


    // $ANTLR start "rule__DiceMarkSum__MarkAssignment_1"
    // InternalMyDsl.g:4284:1: rule__DiceMarkSum__MarkAssignment_1 : ( ruleMark ) ;
    public final void rule__DiceMarkSum__MarkAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4288:1: ( ( ruleMark ) )
            // InternalMyDsl.g:4289:2: ( ruleMark )
            {
            // InternalMyDsl.g:4289:2: ( ruleMark )
            // InternalMyDsl.g:4290:3: ruleMark
            {
             before(grammarAccess.getDiceMarkSumAccess().getMarkMarkParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleMark();

            state._fsp--;

             after(grammarAccess.getDiceMarkSumAccess().getMarkMarkParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DiceMarkSum__MarkAssignment_1"


    // $ANTLR start "rule__DiceDiscSum__DiscardAssignment_1"
    // InternalMyDsl.g:4299:1: rule__DiceDiscSum__DiscardAssignment_1 : ( ruleDiscard ) ;
    public final void rule__DiceDiscSum__DiscardAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4303:1: ( ( ruleDiscard ) )
            // InternalMyDsl.g:4304:2: ( ruleDiscard )
            {
            // InternalMyDsl.g:4304:2: ( ruleDiscard )
            // InternalMyDsl.g:4305:3: ruleDiscard
            {
             before(grammarAccess.getDiceDiscSumAccess().getDiscardDiscardParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleDiscard();

            state._fsp--;

             after(grammarAccess.getDiceDiscSumAccess().getDiscardDiscardParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DiceDiscSum__DiscardAssignment_1"


    // $ANTLR start "rule__DiceRerollSum__RerollAssignment_1"
    // InternalMyDsl.g:4314:1: rule__DiceRerollSum__RerollAssignment_1 : ( ruleReroll ) ;
    public final void rule__DiceRerollSum__RerollAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4318:1: ( ( ruleReroll ) )
            // InternalMyDsl.g:4319:2: ( ruleReroll )
            {
            // InternalMyDsl.g:4319:2: ( ruleReroll )
            // InternalMyDsl.g:4320:3: ruleReroll
            {
             before(grammarAccess.getDiceRerollSumAccess().getRerollRerollParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleReroll();

            state._fsp--;

             after(grammarAccess.getDiceRerollSumAccess().getRerollRerollParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DiceRerollSum__RerollAssignment_1"


    // $ANTLR start "rule__SuccessThreshold__HightlowAssignment_0"
    // InternalMyDsl.g:4329:1: rule__SuccessThreshold__HightlowAssignment_0 : ( ruleHighLow ) ;
    public final void rule__SuccessThreshold__HightlowAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4333:1: ( ( ruleHighLow ) )
            // InternalMyDsl.g:4334:2: ( ruleHighLow )
            {
            // InternalMyDsl.g:4334:2: ( ruleHighLow )
            // InternalMyDsl.g:4335:3: ruleHighLow
            {
             before(grammarAccess.getSuccessThresholdAccess().getHightlowHighLowEnumRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleHighLow();

            state._fsp--;

             after(grammarAccess.getSuccessThresholdAccess().getHightlowHighLowEnumRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SuccessThreshold__HightlowAssignment_0"


    // $ANTLR start "rule__SuccessThreshold__NumAssignment_1"
    // InternalMyDsl.g:4344:1: rule__SuccessThreshold__NumAssignment_1 : ( ruleNum ) ;
    public final void rule__SuccessThreshold__NumAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4348:1: ( ( ruleNum ) )
            // InternalMyDsl.g:4349:2: ( ruleNum )
            {
            // InternalMyDsl.g:4349:2: ( ruleNum )
            // InternalMyDsl.g:4350:3: ruleNum
            {
             before(grammarAccess.getSuccessThresholdAccess().getNumNumParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleNum();

            state._fsp--;

             after(grammarAccess.getSuccessThresholdAccess().getNumNumParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SuccessThreshold__NumAssignment_1"


    // $ANTLR start "rule__SuccessMultiplier__NumAssignment_0"
    // InternalMyDsl.g:4359:1: rule__SuccessMultiplier__NumAssignment_0 : ( ruleNum ) ;
    public final void rule__SuccessMultiplier__NumAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4363:1: ( ( ruleNum ) )
            // InternalMyDsl.g:4364:2: ( ruleNum )
            {
            // InternalMyDsl.g:4364:2: ( ruleNum )
            // InternalMyDsl.g:4365:3: ruleNum
            {
             before(grammarAccess.getSuccessMultiplierAccess().getNumNumParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleNum();

            state._fsp--;

             after(grammarAccess.getSuccessMultiplierAccess().getNumNumParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SuccessMultiplier__NumAssignment_0"


    // $ANTLR start "rule__SuccessMultiplier__SignAssignment_2"
    // InternalMyDsl.g:4374:1: rule__SuccessMultiplier__SignAssignment_2 : ( ruleSign ) ;
    public final void rule__SuccessMultiplier__SignAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4378:1: ( ( ruleSign ) )
            // InternalMyDsl.g:4379:2: ( ruleSign )
            {
            // InternalMyDsl.g:4379:2: ( ruleSign )
            // InternalMyDsl.g:4380:3: ruleSign
            {
             before(grammarAccess.getSuccessMultiplierAccess().getSignSignEnumRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleSign();

            state._fsp--;

             after(grammarAccess.getSuccessMultiplierAccess().getSignSignEnumRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SuccessMultiplier__SignAssignment_2"


    // $ANTLR start "rule__SuccessMultiplier__MultAssignment_3"
    // InternalMyDsl.g:4389:1: rule__SuccessMultiplier__MultAssignment_3 : ( ruleNum ) ;
    public final void rule__SuccessMultiplier__MultAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4393:1: ( ( ruleNum ) )
            // InternalMyDsl.g:4394:2: ( ruleNum )
            {
            // InternalMyDsl.g:4394:2: ( ruleNum )
            // InternalMyDsl.g:4395:3: ruleNum
            {
             before(grammarAccess.getSuccessMultiplierAccess().getMultNumParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleNum();

            state._fsp--;

             after(grammarAccess.getSuccessMultiplierAccess().getMultNumParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SuccessMultiplier__MultAssignment_3"


    // $ANTLR start "rule__SuccessBasic__NumAssignment"
    // InternalMyDsl.g:4404:1: rule__SuccessBasic__NumAssignment : ( ruleNum ) ;
    public final void rule__SuccessBasic__NumAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4408:1: ( ( ruleNum ) )
            // InternalMyDsl.g:4409:2: ( ruleNum )
            {
            // InternalMyDsl.g:4409:2: ( ruleNum )
            // InternalMyDsl.g:4410:3: ruleNum
            {
             before(grammarAccess.getSuccessBasicAccess().getNumNumParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleNum();

            state._fsp--;

             after(grammarAccess.getSuccessBasicAccess().getNumNumParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SuccessBasic__NumAssignment"


    // $ANTLR start "rule__DiceMarkSuk__MarkAssignment_1"
    // InternalMyDsl.g:4419:1: rule__DiceMarkSuk__MarkAssignment_1 : ( ruleMark ) ;
    public final void rule__DiceMarkSuk__MarkAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4423:1: ( ( ruleMark ) )
            // InternalMyDsl.g:4424:2: ( ruleMark )
            {
            // InternalMyDsl.g:4424:2: ( ruleMark )
            // InternalMyDsl.g:4425:3: ruleMark
            {
             before(grammarAccess.getDiceMarkSukAccess().getMarkMarkParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleMark();

            state._fsp--;

             after(grammarAccess.getDiceMarkSukAccess().getMarkMarkParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DiceMarkSuk__MarkAssignment_1"


    // $ANTLR start "rule__DiceDiscSuk__DiscardAssignment_1"
    // InternalMyDsl.g:4434:1: rule__DiceDiscSuk__DiscardAssignment_1 : ( ruleDiscard ) ;
    public final void rule__DiceDiscSuk__DiscardAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4438:1: ( ( ruleDiscard ) )
            // InternalMyDsl.g:4439:2: ( ruleDiscard )
            {
            // InternalMyDsl.g:4439:2: ( ruleDiscard )
            // InternalMyDsl.g:4440:3: ruleDiscard
            {
             before(grammarAccess.getDiceDiscSukAccess().getDiscardDiscardParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleDiscard();

            state._fsp--;

             after(grammarAccess.getDiceDiscSukAccess().getDiscardDiscardParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DiceDiscSuk__DiscardAssignment_1"


    // $ANTLR start "rule__DiceRerollSuk__RerollAssignment_1"
    // InternalMyDsl.g:4449:1: rule__DiceRerollSuk__RerollAssignment_1 : ( ruleReroll ) ;
    public final void rule__DiceRerollSuk__RerollAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4453:1: ( ( ruleReroll ) )
            // InternalMyDsl.g:4454:2: ( ruleReroll )
            {
            // InternalMyDsl.g:4454:2: ( ruleReroll )
            // InternalMyDsl.g:4455:3: ruleReroll
            {
             before(grammarAccess.getDiceRerollSukAccess().getRerollRerollParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleReroll();

            state._fsp--;

             after(grammarAccess.getDiceRerollSukAccess().getRerollRerollParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DiceRerollSuk__RerollAssignment_1"


    // $ANTLR start "rule__MarkThreshold__HightlowAssignment_0"
    // InternalMyDsl.g:4464:1: rule__MarkThreshold__HightlowAssignment_0 : ( ruleHighLow ) ;
    public final void rule__MarkThreshold__HightlowAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4468:1: ( ( ruleHighLow ) )
            // InternalMyDsl.g:4469:2: ( ruleHighLow )
            {
            // InternalMyDsl.g:4469:2: ( ruleHighLow )
            // InternalMyDsl.g:4470:3: ruleHighLow
            {
             before(grammarAccess.getMarkThresholdAccess().getHightlowHighLowEnumRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleHighLow();

            state._fsp--;

             after(grammarAccess.getMarkThresholdAccess().getHightlowHighLowEnumRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MarkThreshold__HightlowAssignment_0"


    // $ANTLR start "rule__MarkThreshold__NumAssignment_1"
    // InternalMyDsl.g:4479:1: rule__MarkThreshold__NumAssignment_1 : ( ruleNum ) ;
    public final void rule__MarkThreshold__NumAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4483:1: ( ( ruleNum ) )
            // InternalMyDsl.g:4484:2: ( ruleNum )
            {
            // InternalMyDsl.g:4484:2: ( ruleNum )
            // InternalMyDsl.g:4485:3: ruleNum
            {
             before(grammarAccess.getMarkThresholdAccess().getNumNumParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleNum();

            state._fsp--;

             after(grammarAccess.getMarkThresholdAccess().getNumNumParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MarkThreshold__NumAssignment_1"


    // $ANTLR start "rule__MarkHighest__HightlowAssignment"
    // InternalMyDsl.g:4494:1: rule__MarkHighest__HightlowAssignment : ( ruleHighLow ) ;
    public final void rule__MarkHighest__HightlowAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4498:1: ( ( ruleHighLow ) )
            // InternalMyDsl.g:4499:2: ( ruleHighLow )
            {
            // InternalMyDsl.g:4499:2: ( ruleHighLow )
            // InternalMyDsl.g:4500:3: ruleHighLow
            {
             before(grammarAccess.getMarkHighestAccess().getHightlowHighLowEnumRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleHighLow();

            state._fsp--;

             after(grammarAccess.getMarkHighestAccess().getHightlowHighLowEnumRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MarkHighest__HightlowAssignment"


    // $ANTLR start "rule__MarkPosition__NumAssignment_0"
    // InternalMyDsl.g:4509:1: rule__MarkPosition__NumAssignment_0 : ( ruleNum ) ;
    public final void rule__MarkPosition__NumAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4513:1: ( ( ruleNum ) )
            // InternalMyDsl.g:4514:2: ( ruleNum )
            {
            // InternalMyDsl.g:4514:2: ( ruleNum )
            // InternalMyDsl.g:4515:3: ruleNum
            {
             before(grammarAccess.getMarkPositionAccess().getNumNumParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleNum();

            state._fsp--;

             after(grammarAccess.getMarkPositionAccess().getNumNumParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MarkPosition__NumAssignment_0"


    // $ANTLR start "rule__MarkPosition__FirstlastAssignment_1"
    // InternalMyDsl.g:4524:1: rule__MarkPosition__FirstlastAssignment_1 : ( ruleFirstLast ) ;
    public final void rule__MarkPosition__FirstlastAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4528:1: ( ( ruleFirstLast ) )
            // InternalMyDsl.g:4529:2: ( ruleFirstLast )
            {
            // InternalMyDsl.g:4529:2: ( ruleFirstLast )
            // InternalMyDsl.g:4530:3: ruleFirstLast
            {
             before(grammarAccess.getMarkPositionAccess().getFirstlastFirstLastEnumRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleFirstLast();

            state._fsp--;

             after(grammarAccess.getMarkPositionAccess().getFirstlastFirstLastEnumRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MarkPosition__FirstlastAssignment_1"


    // $ANTLR start "rule__MarkValue__NumAssignment"
    // InternalMyDsl.g:4539:1: rule__MarkValue__NumAssignment : ( ruleNum ) ;
    public final void rule__MarkValue__NumAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4543:1: ( ( ruleNum ) )
            // InternalMyDsl.g:4544:2: ( ruleNum )
            {
            // InternalMyDsl.g:4544:2: ( ruleNum )
            // InternalMyDsl.g:4545:3: ruleNum
            {
             before(grammarAccess.getMarkValueAccess().getNumNumParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleNum();

            state._fsp--;

             after(grammarAccess.getMarkValueAccess().getNumNumParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MarkValue__NumAssignment"


    // $ANTLR start "rule__DiscardThreshold__HightlowAssignment_0"
    // InternalMyDsl.g:4554:1: rule__DiscardThreshold__HightlowAssignment_0 : ( ruleHighLow ) ;
    public final void rule__DiscardThreshold__HightlowAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4558:1: ( ( ruleHighLow ) )
            // InternalMyDsl.g:4559:2: ( ruleHighLow )
            {
            // InternalMyDsl.g:4559:2: ( ruleHighLow )
            // InternalMyDsl.g:4560:3: ruleHighLow
            {
             before(grammarAccess.getDiscardThresholdAccess().getHightlowHighLowEnumRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleHighLow();

            state._fsp--;

             after(grammarAccess.getDiscardThresholdAccess().getHightlowHighLowEnumRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DiscardThreshold__HightlowAssignment_0"


    // $ANTLR start "rule__DiscardThreshold__NumAssignment_1"
    // InternalMyDsl.g:4569:1: rule__DiscardThreshold__NumAssignment_1 : ( ruleNum ) ;
    public final void rule__DiscardThreshold__NumAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4573:1: ( ( ruleNum ) )
            // InternalMyDsl.g:4574:2: ( ruleNum )
            {
            // InternalMyDsl.g:4574:2: ( ruleNum )
            // InternalMyDsl.g:4575:3: ruleNum
            {
             before(grammarAccess.getDiscardThresholdAccess().getNumNumParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleNum();

            state._fsp--;

             after(grammarAccess.getDiscardThresholdAccess().getNumNumParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DiscardThreshold__NumAssignment_1"


    // $ANTLR start "rule__DiscardHighest__HightlowAssignment"
    // InternalMyDsl.g:4584:1: rule__DiscardHighest__HightlowAssignment : ( ruleHighLow ) ;
    public final void rule__DiscardHighest__HightlowAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4588:1: ( ( ruleHighLow ) )
            // InternalMyDsl.g:4589:2: ( ruleHighLow )
            {
            // InternalMyDsl.g:4589:2: ( ruleHighLow )
            // InternalMyDsl.g:4590:3: ruleHighLow
            {
             before(grammarAccess.getDiscardHighestAccess().getHightlowHighLowEnumRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleHighLow();

            state._fsp--;

             after(grammarAccess.getDiscardHighestAccess().getHightlowHighLowEnumRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DiscardHighest__HightlowAssignment"


    // $ANTLR start "rule__DiscardPosition__NumAssignment_0"
    // InternalMyDsl.g:4599:1: rule__DiscardPosition__NumAssignment_0 : ( ruleNum ) ;
    public final void rule__DiscardPosition__NumAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4603:1: ( ( ruleNum ) )
            // InternalMyDsl.g:4604:2: ( ruleNum )
            {
            // InternalMyDsl.g:4604:2: ( ruleNum )
            // InternalMyDsl.g:4605:3: ruleNum
            {
             before(grammarAccess.getDiscardPositionAccess().getNumNumParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleNum();

            state._fsp--;

             after(grammarAccess.getDiscardPositionAccess().getNumNumParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DiscardPosition__NumAssignment_0"


    // $ANTLR start "rule__DiscardPosition__FirstlastAssignment_1"
    // InternalMyDsl.g:4614:1: rule__DiscardPosition__FirstlastAssignment_1 : ( ruleFirstLast ) ;
    public final void rule__DiscardPosition__FirstlastAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4618:1: ( ( ruleFirstLast ) )
            // InternalMyDsl.g:4619:2: ( ruleFirstLast )
            {
            // InternalMyDsl.g:4619:2: ( ruleFirstLast )
            // InternalMyDsl.g:4620:3: ruleFirstLast
            {
             before(grammarAccess.getDiscardPositionAccess().getFirstlastFirstLastEnumRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleFirstLast();

            state._fsp--;

             after(grammarAccess.getDiscardPositionAccess().getFirstlastFirstLastEnumRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DiscardPosition__FirstlastAssignment_1"


    // $ANTLR start "rule__DiscardValue__NumAssignment"
    // InternalMyDsl.g:4629:1: rule__DiscardValue__NumAssignment : ( ruleNum ) ;
    public final void rule__DiscardValue__NumAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4633:1: ( ( ruleNum ) )
            // InternalMyDsl.g:4634:2: ( ruleNum )
            {
            // InternalMyDsl.g:4634:2: ( ruleNum )
            // InternalMyDsl.g:4635:3: ruleNum
            {
             before(grammarAccess.getDiscardValueAccess().getNumNumParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleNum();

            state._fsp--;

             after(grammarAccess.getDiscardValueAccess().getNumNumParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DiscardValue__NumAssignment"


    // $ANTLR start "rule__RerollThreshold__HightlowAssignment_0"
    // InternalMyDsl.g:4644:1: rule__RerollThreshold__HightlowAssignment_0 : ( ruleHighLow ) ;
    public final void rule__RerollThreshold__HightlowAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4648:1: ( ( ruleHighLow ) )
            // InternalMyDsl.g:4649:2: ( ruleHighLow )
            {
            // InternalMyDsl.g:4649:2: ( ruleHighLow )
            // InternalMyDsl.g:4650:3: ruleHighLow
            {
             before(grammarAccess.getRerollThresholdAccess().getHightlowHighLowEnumRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleHighLow();

            state._fsp--;

             after(grammarAccess.getRerollThresholdAccess().getHightlowHighLowEnumRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RerollThreshold__HightlowAssignment_0"


    // $ANTLR start "rule__RerollThreshold__NumAssignment_1"
    // InternalMyDsl.g:4659:1: rule__RerollThreshold__NumAssignment_1 : ( ruleNum ) ;
    public final void rule__RerollThreshold__NumAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4663:1: ( ( ruleNum ) )
            // InternalMyDsl.g:4664:2: ( ruleNum )
            {
            // InternalMyDsl.g:4664:2: ( ruleNum )
            // InternalMyDsl.g:4665:3: ruleNum
            {
             before(grammarAccess.getRerollThresholdAccess().getNumNumParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleNum();

            state._fsp--;

             after(grammarAccess.getRerollThresholdAccess().getNumNumParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RerollThreshold__NumAssignment_1"


    // $ANTLR start "rule__RerollHighest__HightlowAssignment"
    // InternalMyDsl.g:4674:1: rule__RerollHighest__HightlowAssignment : ( ruleHighLow ) ;
    public final void rule__RerollHighest__HightlowAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4678:1: ( ( ruleHighLow ) )
            // InternalMyDsl.g:4679:2: ( ruleHighLow )
            {
            // InternalMyDsl.g:4679:2: ( ruleHighLow )
            // InternalMyDsl.g:4680:3: ruleHighLow
            {
             before(grammarAccess.getRerollHighestAccess().getHightlowHighLowEnumRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleHighLow();

            state._fsp--;

             after(grammarAccess.getRerollHighestAccess().getHightlowHighLowEnumRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RerollHighest__HightlowAssignment"


    // $ANTLR start "rule__RerollPosition__NumAssignment_0"
    // InternalMyDsl.g:4689:1: rule__RerollPosition__NumAssignment_0 : ( ruleNum ) ;
    public final void rule__RerollPosition__NumAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4693:1: ( ( ruleNum ) )
            // InternalMyDsl.g:4694:2: ( ruleNum )
            {
            // InternalMyDsl.g:4694:2: ( ruleNum )
            // InternalMyDsl.g:4695:3: ruleNum
            {
             before(grammarAccess.getRerollPositionAccess().getNumNumParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleNum();

            state._fsp--;

             after(grammarAccess.getRerollPositionAccess().getNumNumParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RerollPosition__NumAssignment_0"


    // $ANTLR start "rule__RerollPosition__FirstlastAssignment_1"
    // InternalMyDsl.g:4704:1: rule__RerollPosition__FirstlastAssignment_1 : ( ruleFirstLast ) ;
    public final void rule__RerollPosition__FirstlastAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4708:1: ( ( ruleFirstLast ) )
            // InternalMyDsl.g:4709:2: ( ruleFirstLast )
            {
            // InternalMyDsl.g:4709:2: ( ruleFirstLast )
            // InternalMyDsl.g:4710:3: ruleFirstLast
            {
             before(grammarAccess.getRerollPositionAccess().getFirstlastFirstLastEnumRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleFirstLast();

            state._fsp--;

             after(grammarAccess.getRerollPositionAccess().getFirstlastFirstLastEnumRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RerollPosition__FirstlastAssignment_1"


    // $ANTLR start "rule__RerollValue__NumAssignment"
    // InternalMyDsl.g:4719:1: rule__RerollValue__NumAssignment : ( ruleNum ) ;
    public final void rule__RerollValue__NumAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4723:1: ( ( ruleNum ) )
            // InternalMyDsl.g:4724:2: ( ruleNum )
            {
            // InternalMyDsl.g:4724:2: ( ruleNum )
            // InternalMyDsl.g:4725:3: ruleNum
            {
             before(grammarAccess.getRerollValueAccess().getNumNumParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleNum();

            state._fsp--;

             after(grammarAccess.getRerollValueAccess().getNumNumParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RerollValue__NumAssignment"


    // $ANTLR start "rule__Num__ValueAssignment"
    // InternalMyDsl.g:4734:1: rule__Num__ValueAssignment : ( ruleEInt ) ;
    public final void rule__Num__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4738:1: ( ( ruleEInt ) )
            // InternalMyDsl.g:4739:2: ( ruleEInt )
            {
            // InternalMyDsl.g:4739:2: ( ruleEInt )
            // InternalMyDsl.g:4740:3: ruleEInt
            {
             before(grammarAccess.getNumAccess().getValueEIntParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleEInt();

            state._fsp--;

             after(grammarAccess.getNumAccess().getValueEIntParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Num__ValueAssignment"

    // Delegated rules


    protected DFA9 dfa9 = new DFA9(this);
    protected DFA10 dfa10 = new DFA10(this);
    protected DFA11 dfa11 = new DFA11(this);
    static final String dfa_1s = "\13\uffff";
    static final String dfa_2s = "\1\uffff\4\10\1\uffff\1\12\4\uffff";
    static final String dfa_3s = "\6\5\1\14\4\uffff";
    static final String dfa_4s = "\5\47\1\5\1\34\4\uffff";
    static final String dfa_5s = "\7\uffff\1\1\1\2\1\3\1\4";
    static final String dfa_6s = "\13\uffff}>";
    static final String[] dfa_7s = {
            "\1\6\20\uffff\1\1\1\2\1\3\1\4\15\uffff\1\5",
            "\1\7\6\uffff\2\10\15\uffff\2\10\12\uffff\1\7",
            "\1\7\6\uffff\2\10\15\uffff\2\10\12\uffff\1\7",
            "\1\7\6\uffff\2\10\15\uffff\2\10\12\uffff\1\7",
            "\1\7\6\uffff\2\10\15\uffff\2\10\12\uffff\1\7",
            "\1\6",
            "\2\12\4\uffff\2\11\7\uffff\2\12",
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

    class DFA9 extends DFA {

        public DFA9(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 9;
            this.eot = dfa_1;
            this.eof = dfa_2;
            this.min = dfa_3;
            this.max = dfa_4;
            this.accept = dfa_5;
            this.special = dfa_6;
            this.transition = dfa_7;
        }
        public String getDescription() {
            return "1314:1: rule__Mark__Alternatives : ( ( ruleMarkThreshold ) | ( ruleMarkHighest ) | ( ruleMarkPosition ) | ( ruleMarkValue ) );";
        }
    }

    class DFA10 extends DFA {

        public DFA10(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 10;
            this.eot = dfa_1;
            this.eof = dfa_2;
            this.min = dfa_3;
            this.max = dfa_4;
            this.accept = dfa_5;
            this.special = dfa_6;
            this.transition = dfa_7;
        }
        public String getDescription() {
            return "1347:1: rule__Discard__Alternatives : ( ( ruleDiscardThreshold ) | ( ruleDiscardHighest ) | ( ruleDiscardPosition ) | ( ruleDiscardValue ) );";
        }
    }
    static final String dfa_8s = "\1\uffff\4\7\1\uffff\1\12\4\uffff";
    static final String dfa_9s = "\7\uffff\1\2\1\1\1\3\1\4";
    static final String[] dfa_10s = {
            "\1\6\20\uffff\1\1\1\2\1\3\1\4\15\uffff\1\5",
            "\1\10\6\uffff\2\7\15\uffff\2\7\12\uffff\1\10",
            "\1\10\6\uffff\2\7\15\uffff\2\7\12\uffff\1\10",
            "\1\10\6\uffff\2\7\15\uffff\2\7\12\uffff\1\10",
            "\1\10\6\uffff\2\7\15\uffff\2\7\12\uffff\1\10",
            "\1\6",
            "\2\12\4\uffff\2\11\7\uffff\2\12",
            "",
            "",
            "",
            ""
    };
    static final short[] dfa_8 = DFA.unpackEncodedString(dfa_8s);
    static final short[] dfa_9 = DFA.unpackEncodedString(dfa_9s);
    static final short[][] dfa_10 = unpackEncodedStringArray(dfa_10s);

    class DFA11 extends DFA {

        public DFA11(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 11;
            this.eot = dfa_1;
            this.eof = dfa_8;
            this.min = dfa_3;
            this.max = dfa_4;
            this.accept = dfa_9;
            this.special = dfa_6;
            this.transition = dfa_10;
        }
        public String getDescription() {
            return "1380:1: rule__Reroll__Alternatives : ( ( ruleRerollThreshold ) | ( ruleRerollHighest ) | ( ruleRerollPosition ) | ( ruleRerollValue ) );";
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x000000810803C030L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000018003000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000010000002L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x000000380003C000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000002002L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000007800000000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000008000000030L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000324000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000008003C00030L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x000000800003C030L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x00000000000C0000L});

}