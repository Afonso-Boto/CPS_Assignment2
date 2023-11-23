package gol.ide.contentassist.antlr.internal;

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
import gol.services.GolGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalGolParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_INT", "RULE_ID", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'<'", "'=='", "'>'", "'Configuration'", "'{'", "'InitialGrid'", "'EvaluationRules'", "'}'", "'Survive'", "'Reborn'", "'Alive:'", "'('", "','", "')'"
    };
    public static final int RULE_STRING=6;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int EOF=-1;
    public static final int RULE_ID=5;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int RULE_INT=4;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__20=20;
    public static final int T__21=21;

    // delegates
    // delegators


        public InternalGolParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalGolParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalGolParser.tokenNames; }
    public String getGrammarFileName() { return "InternalGol.g"; }


    	private GolGrammarAccess grammarAccess;

    	public void setGrammarAccess(GolGrammarAccess grammarAccess) {
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



    // $ANTLR start "entryRuleGameOfLife"
    // InternalGol.g:53:1: entryRuleGameOfLife : ruleGameOfLife EOF ;
    public final void entryRuleGameOfLife() throws RecognitionException {
        try {
            // InternalGol.g:54:1: ( ruleGameOfLife EOF )
            // InternalGol.g:55:1: ruleGameOfLife EOF
            {
             before(grammarAccess.getGameOfLifeRule()); 
            pushFollow(FOLLOW_1);
            ruleGameOfLife();

            state._fsp--;

             after(grammarAccess.getGameOfLifeRule()); 
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
    // $ANTLR end "entryRuleGameOfLife"


    // $ANTLR start "ruleGameOfLife"
    // InternalGol.g:62:1: ruleGameOfLife : ( ( rule__GameOfLife__Group__0 ) ) ;
    public final void ruleGameOfLife() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGol.g:66:2: ( ( ( rule__GameOfLife__Group__0 ) ) )
            // InternalGol.g:67:2: ( ( rule__GameOfLife__Group__0 ) )
            {
            // InternalGol.g:67:2: ( ( rule__GameOfLife__Group__0 ) )
            // InternalGol.g:68:3: ( rule__GameOfLife__Group__0 )
            {
             before(grammarAccess.getGameOfLifeAccess().getGroup()); 
            // InternalGol.g:69:3: ( rule__GameOfLife__Group__0 )
            // InternalGol.g:69:4: rule__GameOfLife__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__GameOfLife__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getGameOfLifeAccess().getGroup()); 

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
    // $ANTLR end "ruleGameOfLife"


    // $ANTLR start "entryRuleRules"
    // InternalGol.g:78:1: entryRuleRules : ruleRules EOF ;
    public final void entryRuleRules() throws RecognitionException {
        try {
            // InternalGol.g:79:1: ( ruleRules EOF )
            // InternalGol.g:80:1: ruleRules EOF
            {
             before(grammarAccess.getRulesRule()); 
            pushFollow(FOLLOW_1);
            ruleRules();

            state._fsp--;

             after(grammarAccess.getRulesRule()); 
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
    // $ANTLR end "entryRuleRules"


    // $ANTLR start "ruleRules"
    // InternalGol.g:87:1: ruleRules : ( ( ( rule__Rules__RuleAssignment ) ) ( ( rule__Rules__RuleAssignment )* ) ) ;
    public final void ruleRules() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGol.g:91:2: ( ( ( ( rule__Rules__RuleAssignment ) ) ( ( rule__Rules__RuleAssignment )* ) ) )
            // InternalGol.g:92:2: ( ( ( rule__Rules__RuleAssignment ) ) ( ( rule__Rules__RuleAssignment )* ) )
            {
            // InternalGol.g:92:2: ( ( ( rule__Rules__RuleAssignment ) ) ( ( rule__Rules__RuleAssignment )* ) )
            // InternalGol.g:93:3: ( ( rule__Rules__RuleAssignment ) ) ( ( rule__Rules__RuleAssignment )* )
            {
            // InternalGol.g:93:3: ( ( rule__Rules__RuleAssignment ) )
            // InternalGol.g:94:4: ( rule__Rules__RuleAssignment )
            {
             before(grammarAccess.getRulesAccess().getRuleAssignment()); 
            // InternalGol.g:95:4: ( rule__Rules__RuleAssignment )
            // InternalGol.g:95:5: rule__Rules__RuleAssignment
            {
            pushFollow(FOLLOW_3);
            rule__Rules__RuleAssignment();

            state._fsp--;


            }

             after(grammarAccess.getRulesAccess().getRuleAssignment()); 

            }

            // InternalGol.g:98:3: ( ( rule__Rules__RuleAssignment )* )
            // InternalGol.g:99:4: ( rule__Rules__RuleAssignment )*
            {
             before(grammarAccess.getRulesAccess().getRuleAssignment()); 
            // InternalGol.g:100:4: ( rule__Rules__RuleAssignment )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0>=19 && LA1_0<=20)) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalGol.g:100:5: rule__Rules__RuleAssignment
            	    {
            	    pushFollow(FOLLOW_3);
            	    rule__Rules__RuleAssignment();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

             after(grammarAccess.getRulesAccess().getRuleAssignment()); 

            }


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
    // $ANTLR end "ruleRules"


    // $ANTLR start "entryRuleRule"
    // InternalGol.g:110:1: entryRuleRule : ruleRule EOF ;
    public final void entryRuleRule() throws RecognitionException {
        try {
            // InternalGol.g:111:1: ( ruleRule EOF )
            // InternalGol.g:112:1: ruleRule EOF
            {
             before(grammarAccess.getRuleRule()); 
            pushFollow(FOLLOW_1);
            ruleRule();

            state._fsp--;

             after(grammarAccess.getRuleRule()); 
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
    // $ANTLR end "entryRuleRule"


    // $ANTLR start "ruleRule"
    // InternalGol.g:119:1: ruleRule : ( ( rule__Rule__Alternatives ) ) ;
    public final void ruleRule() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGol.g:123:2: ( ( ( rule__Rule__Alternatives ) ) )
            // InternalGol.g:124:2: ( ( rule__Rule__Alternatives ) )
            {
            // InternalGol.g:124:2: ( ( rule__Rule__Alternatives ) )
            // InternalGol.g:125:3: ( rule__Rule__Alternatives )
            {
             before(grammarAccess.getRuleAccess().getAlternatives()); 
            // InternalGol.g:126:3: ( rule__Rule__Alternatives )
            // InternalGol.g:126:4: rule__Rule__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Rule__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getRuleAccess().getAlternatives()); 

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
    // $ANTLR end "ruleRule"


    // $ANTLR start "entryRuleGrid"
    // InternalGol.g:135:1: entryRuleGrid : ruleGrid EOF ;
    public final void entryRuleGrid() throws RecognitionException {
        try {
            // InternalGol.g:136:1: ( ruleGrid EOF )
            // InternalGol.g:137:1: ruleGrid EOF
            {
             before(grammarAccess.getGridRule()); 
            pushFollow(FOLLOW_1);
            ruleGrid();

            state._fsp--;

             after(grammarAccess.getGridRule()); 
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
    // $ANTLR end "entryRuleGrid"


    // $ANTLR start "ruleGrid"
    // InternalGol.g:144:1: ruleGrid : ( ( rule__Grid__Group__0 ) ) ;
    public final void ruleGrid() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGol.g:148:2: ( ( ( rule__Grid__Group__0 ) ) )
            // InternalGol.g:149:2: ( ( rule__Grid__Group__0 ) )
            {
            // InternalGol.g:149:2: ( ( rule__Grid__Group__0 ) )
            // InternalGol.g:150:3: ( rule__Grid__Group__0 )
            {
             before(grammarAccess.getGridAccess().getGroup()); 
            // InternalGol.g:151:3: ( rule__Grid__Group__0 )
            // InternalGol.g:151:4: rule__Grid__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Grid__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getGridAccess().getGroup()); 

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
    // $ANTLR end "ruleGrid"


    // $ANTLR start "entryRuleCoordinate"
    // InternalGol.g:160:1: entryRuleCoordinate : ruleCoordinate EOF ;
    public final void entryRuleCoordinate() throws RecognitionException {
        try {
            // InternalGol.g:161:1: ( ruleCoordinate EOF )
            // InternalGol.g:162:1: ruleCoordinate EOF
            {
             before(grammarAccess.getCoordinateRule()); 
            pushFollow(FOLLOW_1);
            ruleCoordinate();

            state._fsp--;

             after(grammarAccess.getCoordinateRule()); 
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
    // $ANTLR end "entryRuleCoordinate"


    // $ANTLR start "ruleCoordinate"
    // InternalGol.g:169:1: ruleCoordinate : ( ( rule__Coordinate__Group__0 ) ) ;
    public final void ruleCoordinate() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGol.g:173:2: ( ( ( rule__Coordinate__Group__0 ) ) )
            // InternalGol.g:174:2: ( ( rule__Coordinate__Group__0 ) )
            {
            // InternalGol.g:174:2: ( ( rule__Coordinate__Group__0 ) )
            // InternalGol.g:175:3: ( rule__Coordinate__Group__0 )
            {
             before(grammarAccess.getCoordinateAccess().getGroup()); 
            // InternalGol.g:176:3: ( rule__Coordinate__Group__0 )
            // InternalGol.g:176:4: rule__Coordinate__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Coordinate__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getCoordinateAccess().getGroup()); 

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
    // $ANTLR end "ruleCoordinate"


    // $ANTLR start "entryRuleCondition"
    // InternalGol.g:185:1: entryRuleCondition : ruleCondition EOF ;
    public final void entryRuleCondition() throws RecognitionException {
        try {
            // InternalGol.g:186:1: ( ruleCondition EOF )
            // InternalGol.g:187:1: ruleCondition EOF
            {
             before(grammarAccess.getConditionRule()); 
            pushFollow(FOLLOW_1);
            ruleCondition();

            state._fsp--;

             after(grammarAccess.getConditionRule()); 
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
    // $ANTLR end "entryRuleCondition"


    // $ANTLR start "ruleCondition"
    // InternalGol.g:194:1: ruleCondition : ( ( rule__Condition__Group__0 ) ) ;
    public final void ruleCondition() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGol.g:198:2: ( ( ( rule__Condition__Group__0 ) ) )
            // InternalGol.g:199:2: ( ( rule__Condition__Group__0 ) )
            {
            // InternalGol.g:199:2: ( ( rule__Condition__Group__0 ) )
            // InternalGol.g:200:3: ( rule__Condition__Group__0 )
            {
             before(grammarAccess.getConditionAccess().getGroup()); 
            // InternalGol.g:201:3: ( rule__Condition__Group__0 )
            // InternalGol.g:201:4: rule__Condition__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Condition__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getConditionAccess().getGroup()); 

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
    // $ANTLR end "ruleCondition"


    // $ANTLR start "ruleConditionSign"
    // InternalGol.g:210:1: ruleConditionSign : ( ( rule__ConditionSign__Alternatives ) ) ;
    public final void ruleConditionSign() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGol.g:214:1: ( ( ( rule__ConditionSign__Alternatives ) ) )
            // InternalGol.g:215:2: ( ( rule__ConditionSign__Alternatives ) )
            {
            // InternalGol.g:215:2: ( ( rule__ConditionSign__Alternatives ) )
            // InternalGol.g:216:3: ( rule__ConditionSign__Alternatives )
            {
             before(grammarAccess.getConditionSignAccess().getAlternatives()); 
            // InternalGol.g:217:3: ( rule__ConditionSign__Alternatives )
            // InternalGol.g:217:4: rule__ConditionSign__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__ConditionSign__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getConditionSignAccess().getAlternatives()); 

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
    // $ANTLR end "ruleConditionSign"


    // $ANTLR start "rule__Rule__Alternatives"
    // InternalGol.g:225:1: rule__Rule__Alternatives : ( ( ( rule__Rule__Group_0__0 ) ) | ( ( rule__Rule__Group_1__0 ) ) );
    public final void rule__Rule__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGol.g:229:1: ( ( ( rule__Rule__Group_0__0 ) ) | ( ( rule__Rule__Group_1__0 ) ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==19) ) {
                alt2=1;
            }
            else if ( (LA2_0==20) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // InternalGol.g:230:2: ( ( rule__Rule__Group_0__0 ) )
                    {
                    // InternalGol.g:230:2: ( ( rule__Rule__Group_0__0 ) )
                    // InternalGol.g:231:3: ( rule__Rule__Group_0__0 )
                    {
                     before(grammarAccess.getRuleAccess().getGroup_0()); 
                    // InternalGol.g:232:3: ( rule__Rule__Group_0__0 )
                    // InternalGol.g:232:4: rule__Rule__Group_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Rule__Group_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getRuleAccess().getGroup_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalGol.g:236:2: ( ( rule__Rule__Group_1__0 ) )
                    {
                    // InternalGol.g:236:2: ( ( rule__Rule__Group_1__0 ) )
                    // InternalGol.g:237:3: ( rule__Rule__Group_1__0 )
                    {
                     before(grammarAccess.getRuleAccess().getGroup_1()); 
                    // InternalGol.g:238:3: ( rule__Rule__Group_1__0 )
                    // InternalGol.g:238:4: rule__Rule__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Rule__Group_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getRuleAccess().getGroup_1()); 

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
    // $ANTLR end "rule__Rule__Alternatives"


    // $ANTLR start "rule__ConditionSign__Alternatives"
    // InternalGol.g:246:1: rule__ConditionSign__Alternatives : ( ( ( '<' ) ) | ( ( '==' ) ) | ( ( '>' ) ) );
    public final void rule__ConditionSign__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGol.g:250:1: ( ( ( '<' ) ) | ( ( '==' ) ) | ( ( '>' ) ) )
            int alt3=3;
            switch ( input.LA(1) ) {
            case 11:
                {
                alt3=1;
                }
                break;
            case 12:
                {
                alt3=2;
                }
                break;
            case 13:
                {
                alt3=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // InternalGol.g:251:2: ( ( '<' ) )
                    {
                    // InternalGol.g:251:2: ( ( '<' ) )
                    // InternalGol.g:252:3: ( '<' )
                    {
                     before(grammarAccess.getConditionSignAccess().getLESS_THANEnumLiteralDeclaration_0()); 
                    // InternalGol.g:253:3: ( '<' )
                    // InternalGol.g:253:4: '<'
                    {
                    match(input,11,FOLLOW_2); 

                    }

                     after(grammarAccess.getConditionSignAccess().getLESS_THANEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalGol.g:257:2: ( ( '==' ) )
                    {
                    // InternalGol.g:257:2: ( ( '==' ) )
                    // InternalGol.g:258:3: ( '==' )
                    {
                     before(grammarAccess.getConditionSignAccess().getEQUALS_TOEnumLiteralDeclaration_1()); 
                    // InternalGol.g:259:3: ( '==' )
                    // InternalGol.g:259:4: '=='
                    {
                    match(input,12,FOLLOW_2); 

                    }

                     after(grammarAccess.getConditionSignAccess().getEQUALS_TOEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalGol.g:263:2: ( ( '>' ) )
                    {
                    // InternalGol.g:263:2: ( ( '>' ) )
                    // InternalGol.g:264:3: ( '>' )
                    {
                     before(grammarAccess.getConditionSignAccess().getGREATER_THANEnumLiteralDeclaration_2()); 
                    // InternalGol.g:265:3: ( '>' )
                    // InternalGol.g:265:4: '>'
                    {
                    match(input,13,FOLLOW_2); 

                    }

                     after(grammarAccess.getConditionSignAccess().getGREATER_THANEnumLiteralDeclaration_2()); 

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
    // $ANTLR end "rule__ConditionSign__Alternatives"


    // $ANTLR start "rule__GameOfLife__Group__0"
    // InternalGol.g:273:1: rule__GameOfLife__Group__0 : rule__GameOfLife__Group__0__Impl rule__GameOfLife__Group__1 ;
    public final void rule__GameOfLife__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGol.g:277:1: ( rule__GameOfLife__Group__0__Impl rule__GameOfLife__Group__1 )
            // InternalGol.g:278:2: rule__GameOfLife__Group__0__Impl rule__GameOfLife__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__GameOfLife__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__GameOfLife__Group__1();

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
    // $ANTLR end "rule__GameOfLife__Group__0"


    // $ANTLR start "rule__GameOfLife__Group__0__Impl"
    // InternalGol.g:285:1: rule__GameOfLife__Group__0__Impl : ( 'Configuration' ) ;
    public final void rule__GameOfLife__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGol.g:289:1: ( ( 'Configuration' ) )
            // InternalGol.g:290:1: ( 'Configuration' )
            {
            // InternalGol.g:290:1: ( 'Configuration' )
            // InternalGol.g:291:2: 'Configuration'
            {
             before(grammarAccess.getGameOfLifeAccess().getConfigurationKeyword_0()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getGameOfLifeAccess().getConfigurationKeyword_0()); 

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
    // $ANTLR end "rule__GameOfLife__Group__0__Impl"


    // $ANTLR start "rule__GameOfLife__Group__1"
    // InternalGol.g:300:1: rule__GameOfLife__Group__1 : rule__GameOfLife__Group__1__Impl rule__GameOfLife__Group__2 ;
    public final void rule__GameOfLife__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGol.g:304:1: ( rule__GameOfLife__Group__1__Impl rule__GameOfLife__Group__2 )
            // InternalGol.g:305:2: rule__GameOfLife__Group__1__Impl rule__GameOfLife__Group__2
            {
            pushFollow(FOLLOW_5);
            rule__GameOfLife__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__GameOfLife__Group__2();

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
    // $ANTLR end "rule__GameOfLife__Group__1"


    // $ANTLR start "rule__GameOfLife__Group__1__Impl"
    // InternalGol.g:312:1: rule__GameOfLife__Group__1__Impl : ( '{' ) ;
    public final void rule__GameOfLife__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGol.g:316:1: ( ( '{' ) )
            // InternalGol.g:317:1: ( '{' )
            {
            // InternalGol.g:317:1: ( '{' )
            // InternalGol.g:318:2: '{'
            {
             before(grammarAccess.getGameOfLifeAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getGameOfLifeAccess().getLeftCurlyBracketKeyword_1()); 

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
    // $ANTLR end "rule__GameOfLife__Group__1__Impl"


    // $ANTLR start "rule__GameOfLife__Group__2"
    // InternalGol.g:327:1: rule__GameOfLife__Group__2 : rule__GameOfLife__Group__2__Impl rule__GameOfLife__Group__3 ;
    public final void rule__GameOfLife__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGol.g:331:1: ( rule__GameOfLife__Group__2__Impl rule__GameOfLife__Group__3 )
            // InternalGol.g:332:2: rule__GameOfLife__Group__2__Impl rule__GameOfLife__Group__3
            {
            pushFollow(FOLLOW_6);
            rule__GameOfLife__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__GameOfLife__Group__3();

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
    // $ANTLR end "rule__GameOfLife__Group__2"


    // $ANTLR start "rule__GameOfLife__Group__2__Impl"
    // InternalGol.g:339:1: rule__GameOfLife__Group__2__Impl : ( 'InitialGrid' ) ;
    public final void rule__GameOfLife__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGol.g:343:1: ( ( 'InitialGrid' ) )
            // InternalGol.g:344:1: ( 'InitialGrid' )
            {
            // InternalGol.g:344:1: ( 'InitialGrid' )
            // InternalGol.g:345:2: 'InitialGrid'
            {
             before(grammarAccess.getGameOfLifeAccess().getInitialGridKeyword_2()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getGameOfLifeAccess().getInitialGridKeyword_2()); 

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
    // $ANTLR end "rule__GameOfLife__Group__2__Impl"


    // $ANTLR start "rule__GameOfLife__Group__3"
    // InternalGol.g:354:1: rule__GameOfLife__Group__3 : rule__GameOfLife__Group__3__Impl rule__GameOfLife__Group__4 ;
    public final void rule__GameOfLife__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGol.g:358:1: ( rule__GameOfLife__Group__3__Impl rule__GameOfLife__Group__4 )
            // InternalGol.g:359:2: rule__GameOfLife__Group__3__Impl rule__GameOfLife__Group__4
            {
            pushFollow(FOLLOW_7);
            rule__GameOfLife__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__GameOfLife__Group__4();

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
    // $ANTLR end "rule__GameOfLife__Group__3"


    // $ANTLR start "rule__GameOfLife__Group__3__Impl"
    // InternalGol.g:366:1: rule__GameOfLife__Group__3__Impl : ( ( rule__GameOfLife__InitialGridAssignment_3 ) ) ;
    public final void rule__GameOfLife__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGol.g:370:1: ( ( ( rule__GameOfLife__InitialGridAssignment_3 ) ) )
            // InternalGol.g:371:1: ( ( rule__GameOfLife__InitialGridAssignment_3 ) )
            {
            // InternalGol.g:371:1: ( ( rule__GameOfLife__InitialGridAssignment_3 ) )
            // InternalGol.g:372:2: ( rule__GameOfLife__InitialGridAssignment_3 )
            {
             before(grammarAccess.getGameOfLifeAccess().getInitialGridAssignment_3()); 
            // InternalGol.g:373:2: ( rule__GameOfLife__InitialGridAssignment_3 )
            // InternalGol.g:373:3: rule__GameOfLife__InitialGridAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__GameOfLife__InitialGridAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getGameOfLifeAccess().getInitialGridAssignment_3()); 

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
    // $ANTLR end "rule__GameOfLife__Group__3__Impl"


    // $ANTLR start "rule__GameOfLife__Group__4"
    // InternalGol.g:381:1: rule__GameOfLife__Group__4 : rule__GameOfLife__Group__4__Impl rule__GameOfLife__Group__5 ;
    public final void rule__GameOfLife__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGol.g:385:1: ( rule__GameOfLife__Group__4__Impl rule__GameOfLife__Group__5 )
            // InternalGol.g:386:2: rule__GameOfLife__Group__4__Impl rule__GameOfLife__Group__5
            {
            pushFollow(FOLLOW_8);
            rule__GameOfLife__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__GameOfLife__Group__5();

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
    // $ANTLR end "rule__GameOfLife__Group__4"


    // $ANTLR start "rule__GameOfLife__Group__4__Impl"
    // InternalGol.g:393:1: rule__GameOfLife__Group__4__Impl : ( 'EvaluationRules' ) ;
    public final void rule__GameOfLife__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGol.g:397:1: ( ( 'EvaluationRules' ) )
            // InternalGol.g:398:1: ( 'EvaluationRules' )
            {
            // InternalGol.g:398:1: ( 'EvaluationRules' )
            // InternalGol.g:399:2: 'EvaluationRules'
            {
             before(grammarAccess.getGameOfLifeAccess().getEvaluationRulesKeyword_4()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getGameOfLifeAccess().getEvaluationRulesKeyword_4()); 

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
    // $ANTLR end "rule__GameOfLife__Group__4__Impl"


    // $ANTLR start "rule__GameOfLife__Group__5"
    // InternalGol.g:408:1: rule__GameOfLife__Group__5 : rule__GameOfLife__Group__5__Impl rule__GameOfLife__Group__6 ;
    public final void rule__GameOfLife__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGol.g:412:1: ( rule__GameOfLife__Group__5__Impl rule__GameOfLife__Group__6 )
            // InternalGol.g:413:2: rule__GameOfLife__Group__5__Impl rule__GameOfLife__Group__6
            {
            pushFollow(FOLLOW_9);
            rule__GameOfLife__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__GameOfLife__Group__6();

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
    // $ANTLR end "rule__GameOfLife__Group__5"


    // $ANTLR start "rule__GameOfLife__Group__5__Impl"
    // InternalGol.g:420:1: rule__GameOfLife__Group__5__Impl : ( ( rule__GameOfLife__RulesAssignment_5 ) ) ;
    public final void rule__GameOfLife__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGol.g:424:1: ( ( ( rule__GameOfLife__RulesAssignment_5 ) ) )
            // InternalGol.g:425:1: ( ( rule__GameOfLife__RulesAssignment_5 ) )
            {
            // InternalGol.g:425:1: ( ( rule__GameOfLife__RulesAssignment_5 ) )
            // InternalGol.g:426:2: ( rule__GameOfLife__RulesAssignment_5 )
            {
             before(grammarAccess.getGameOfLifeAccess().getRulesAssignment_5()); 
            // InternalGol.g:427:2: ( rule__GameOfLife__RulesAssignment_5 )
            // InternalGol.g:427:3: rule__GameOfLife__RulesAssignment_5
            {
            pushFollow(FOLLOW_2);
            rule__GameOfLife__RulesAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getGameOfLifeAccess().getRulesAssignment_5()); 

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
    // $ANTLR end "rule__GameOfLife__Group__5__Impl"


    // $ANTLR start "rule__GameOfLife__Group__6"
    // InternalGol.g:435:1: rule__GameOfLife__Group__6 : rule__GameOfLife__Group__6__Impl ;
    public final void rule__GameOfLife__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGol.g:439:1: ( rule__GameOfLife__Group__6__Impl )
            // InternalGol.g:440:2: rule__GameOfLife__Group__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__GameOfLife__Group__6__Impl();

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
    // $ANTLR end "rule__GameOfLife__Group__6"


    // $ANTLR start "rule__GameOfLife__Group__6__Impl"
    // InternalGol.g:446:1: rule__GameOfLife__Group__6__Impl : ( '}' ) ;
    public final void rule__GameOfLife__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGol.g:450:1: ( ( '}' ) )
            // InternalGol.g:451:1: ( '}' )
            {
            // InternalGol.g:451:1: ( '}' )
            // InternalGol.g:452:2: '}'
            {
             before(grammarAccess.getGameOfLifeAccess().getRightCurlyBracketKeyword_6()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getGameOfLifeAccess().getRightCurlyBracketKeyword_6()); 

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
    // $ANTLR end "rule__GameOfLife__Group__6__Impl"


    // $ANTLR start "rule__Rule__Group_0__0"
    // InternalGol.g:462:1: rule__Rule__Group_0__0 : rule__Rule__Group_0__0__Impl rule__Rule__Group_0__1 ;
    public final void rule__Rule__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGol.g:466:1: ( rule__Rule__Group_0__0__Impl rule__Rule__Group_0__1 )
            // InternalGol.g:467:2: rule__Rule__Group_0__0__Impl rule__Rule__Group_0__1
            {
            pushFollow(FOLLOW_10);
            rule__Rule__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Rule__Group_0__1();

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
    // $ANTLR end "rule__Rule__Group_0__0"


    // $ANTLR start "rule__Rule__Group_0__0__Impl"
    // InternalGol.g:474:1: rule__Rule__Group_0__0__Impl : ( 'Survive' ) ;
    public final void rule__Rule__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGol.g:478:1: ( ( 'Survive' ) )
            // InternalGol.g:479:1: ( 'Survive' )
            {
            // InternalGol.g:479:1: ( 'Survive' )
            // InternalGol.g:480:2: 'Survive'
            {
             before(grammarAccess.getRuleAccess().getSurviveKeyword_0_0()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getRuleAccess().getSurviveKeyword_0_0()); 

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
    // $ANTLR end "rule__Rule__Group_0__0__Impl"


    // $ANTLR start "rule__Rule__Group_0__1"
    // InternalGol.g:489:1: rule__Rule__Group_0__1 : rule__Rule__Group_0__1__Impl ;
    public final void rule__Rule__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGol.g:493:1: ( rule__Rule__Group_0__1__Impl )
            // InternalGol.g:494:2: rule__Rule__Group_0__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Rule__Group_0__1__Impl();

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
    // $ANTLR end "rule__Rule__Group_0__1"


    // $ANTLR start "rule__Rule__Group_0__1__Impl"
    // InternalGol.g:500:1: rule__Rule__Group_0__1__Impl : ( ( ( rule__Rule__SurviveAssignment_0_1 ) ) ( ( rule__Rule__SurviveAssignment_0_1 )* ) ) ;
    public final void rule__Rule__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGol.g:504:1: ( ( ( ( rule__Rule__SurviveAssignment_0_1 ) ) ( ( rule__Rule__SurviveAssignment_0_1 )* ) ) )
            // InternalGol.g:505:1: ( ( ( rule__Rule__SurviveAssignment_0_1 ) ) ( ( rule__Rule__SurviveAssignment_0_1 )* ) )
            {
            // InternalGol.g:505:1: ( ( ( rule__Rule__SurviveAssignment_0_1 ) ) ( ( rule__Rule__SurviveAssignment_0_1 )* ) )
            // InternalGol.g:506:2: ( ( rule__Rule__SurviveAssignment_0_1 ) ) ( ( rule__Rule__SurviveAssignment_0_1 )* )
            {
            // InternalGol.g:506:2: ( ( rule__Rule__SurviveAssignment_0_1 ) )
            // InternalGol.g:507:3: ( rule__Rule__SurviveAssignment_0_1 )
            {
             before(grammarAccess.getRuleAccess().getSurviveAssignment_0_1()); 
            // InternalGol.g:508:3: ( rule__Rule__SurviveAssignment_0_1 )
            // InternalGol.g:508:4: rule__Rule__SurviveAssignment_0_1
            {
            pushFollow(FOLLOW_11);
            rule__Rule__SurviveAssignment_0_1();

            state._fsp--;


            }

             after(grammarAccess.getRuleAccess().getSurviveAssignment_0_1()); 

            }

            // InternalGol.g:511:2: ( ( rule__Rule__SurviveAssignment_0_1 )* )
            // InternalGol.g:512:3: ( rule__Rule__SurviveAssignment_0_1 )*
            {
             before(grammarAccess.getRuleAccess().getSurviveAssignment_0_1()); 
            // InternalGol.g:513:3: ( rule__Rule__SurviveAssignment_0_1 )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( ((LA4_0>=11 && LA4_0<=13)) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalGol.g:513:4: rule__Rule__SurviveAssignment_0_1
            	    {
            	    pushFollow(FOLLOW_11);
            	    rule__Rule__SurviveAssignment_0_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

             after(grammarAccess.getRuleAccess().getSurviveAssignment_0_1()); 

            }


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
    // $ANTLR end "rule__Rule__Group_0__1__Impl"


    // $ANTLR start "rule__Rule__Group_1__0"
    // InternalGol.g:523:1: rule__Rule__Group_1__0 : rule__Rule__Group_1__0__Impl rule__Rule__Group_1__1 ;
    public final void rule__Rule__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGol.g:527:1: ( rule__Rule__Group_1__0__Impl rule__Rule__Group_1__1 )
            // InternalGol.g:528:2: rule__Rule__Group_1__0__Impl rule__Rule__Group_1__1
            {
            pushFollow(FOLLOW_10);
            rule__Rule__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Rule__Group_1__1();

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
    // $ANTLR end "rule__Rule__Group_1__0"


    // $ANTLR start "rule__Rule__Group_1__0__Impl"
    // InternalGol.g:535:1: rule__Rule__Group_1__0__Impl : ( 'Reborn' ) ;
    public final void rule__Rule__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGol.g:539:1: ( ( 'Reborn' ) )
            // InternalGol.g:540:1: ( 'Reborn' )
            {
            // InternalGol.g:540:1: ( 'Reborn' )
            // InternalGol.g:541:2: 'Reborn'
            {
             before(grammarAccess.getRuleAccess().getRebornKeyword_1_0()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getRuleAccess().getRebornKeyword_1_0()); 

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
    // $ANTLR end "rule__Rule__Group_1__0__Impl"


    // $ANTLR start "rule__Rule__Group_1__1"
    // InternalGol.g:550:1: rule__Rule__Group_1__1 : rule__Rule__Group_1__1__Impl ;
    public final void rule__Rule__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGol.g:554:1: ( rule__Rule__Group_1__1__Impl )
            // InternalGol.g:555:2: rule__Rule__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Rule__Group_1__1__Impl();

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
    // $ANTLR end "rule__Rule__Group_1__1"


    // $ANTLR start "rule__Rule__Group_1__1__Impl"
    // InternalGol.g:561:1: rule__Rule__Group_1__1__Impl : ( ( ( rule__Rule__RebornAssignment_1_1 ) ) ( ( rule__Rule__RebornAssignment_1_1 )* ) ) ;
    public final void rule__Rule__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGol.g:565:1: ( ( ( ( rule__Rule__RebornAssignment_1_1 ) ) ( ( rule__Rule__RebornAssignment_1_1 )* ) ) )
            // InternalGol.g:566:1: ( ( ( rule__Rule__RebornAssignment_1_1 ) ) ( ( rule__Rule__RebornAssignment_1_1 )* ) )
            {
            // InternalGol.g:566:1: ( ( ( rule__Rule__RebornAssignment_1_1 ) ) ( ( rule__Rule__RebornAssignment_1_1 )* ) )
            // InternalGol.g:567:2: ( ( rule__Rule__RebornAssignment_1_1 ) ) ( ( rule__Rule__RebornAssignment_1_1 )* )
            {
            // InternalGol.g:567:2: ( ( rule__Rule__RebornAssignment_1_1 ) )
            // InternalGol.g:568:3: ( rule__Rule__RebornAssignment_1_1 )
            {
             before(grammarAccess.getRuleAccess().getRebornAssignment_1_1()); 
            // InternalGol.g:569:3: ( rule__Rule__RebornAssignment_1_1 )
            // InternalGol.g:569:4: rule__Rule__RebornAssignment_1_1
            {
            pushFollow(FOLLOW_11);
            rule__Rule__RebornAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getRuleAccess().getRebornAssignment_1_1()); 

            }

            // InternalGol.g:572:2: ( ( rule__Rule__RebornAssignment_1_1 )* )
            // InternalGol.g:573:3: ( rule__Rule__RebornAssignment_1_1 )*
            {
             before(grammarAccess.getRuleAccess().getRebornAssignment_1_1()); 
            // InternalGol.g:574:3: ( rule__Rule__RebornAssignment_1_1 )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( ((LA5_0>=11 && LA5_0<=13)) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalGol.g:574:4: rule__Rule__RebornAssignment_1_1
            	    {
            	    pushFollow(FOLLOW_11);
            	    rule__Rule__RebornAssignment_1_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

             after(grammarAccess.getRuleAccess().getRebornAssignment_1_1()); 

            }


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
    // $ANTLR end "rule__Rule__Group_1__1__Impl"


    // $ANTLR start "rule__Grid__Group__0"
    // InternalGol.g:584:1: rule__Grid__Group__0 : rule__Grid__Group__0__Impl rule__Grid__Group__1 ;
    public final void rule__Grid__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGol.g:588:1: ( rule__Grid__Group__0__Impl rule__Grid__Group__1 )
            // InternalGol.g:589:2: rule__Grid__Group__0__Impl rule__Grid__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__Grid__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Grid__Group__1();

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
    // $ANTLR end "rule__Grid__Group__0"


    // $ANTLR start "rule__Grid__Group__0__Impl"
    // InternalGol.g:596:1: rule__Grid__Group__0__Impl : ( 'Alive:' ) ;
    public final void rule__Grid__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGol.g:600:1: ( ( 'Alive:' ) )
            // InternalGol.g:601:1: ( 'Alive:' )
            {
            // InternalGol.g:601:1: ( 'Alive:' )
            // InternalGol.g:602:2: 'Alive:'
            {
             before(grammarAccess.getGridAccess().getAliveKeyword_0()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getGridAccess().getAliveKeyword_0()); 

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
    // $ANTLR end "rule__Grid__Group__0__Impl"


    // $ANTLR start "rule__Grid__Group__1"
    // InternalGol.g:611:1: rule__Grid__Group__1 : rule__Grid__Group__1__Impl rule__Grid__Group__2 ;
    public final void rule__Grid__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGol.g:615:1: ( rule__Grid__Group__1__Impl rule__Grid__Group__2 )
            // InternalGol.g:616:2: rule__Grid__Group__1__Impl rule__Grid__Group__2
            {
            pushFollow(FOLLOW_12);
            rule__Grid__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Grid__Group__2();

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
    // $ANTLR end "rule__Grid__Group__1"


    // $ANTLR start "rule__Grid__Group__1__Impl"
    // InternalGol.g:623:1: rule__Grid__Group__1__Impl : ( '{' ) ;
    public final void rule__Grid__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGol.g:627:1: ( ( '{' ) )
            // InternalGol.g:628:1: ( '{' )
            {
            // InternalGol.g:628:1: ( '{' )
            // InternalGol.g:629:2: '{'
            {
             before(grammarAccess.getGridAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getGridAccess().getLeftCurlyBracketKeyword_1()); 

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
    // $ANTLR end "rule__Grid__Group__1__Impl"


    // $ANTLR start "rule__Grid__Group__2"
    // InternalGol.g:638:1: rule__Grid__Group__2 : rule__Grid__Group__2__Impl rule__Grid__Group__3 ;
    public final void rule__Grid__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGol.g:642:1: ( rule__Grid__Group__2__Impl rule__Grid__Group__3 )
            // InternalGol.g:643:2: rule__Grid__Group__2__Impl rule__Grid__Group__3
            {
            pushFollow(FOLLOW_9);
            rule__Grid__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Grid__Group__3();

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
    // $ANTLR end "rule__Grid__Group__2"


    // $ANTLR start "rule__Grid__Group__2__Impl"
    // InternalGol.g:650:1: rule__Grid__Group__2__Impl : ( ( ( rule__Grid__AliveAssignment_2 ) ) ( ( rule__Grid__AliveAssignment_2 )* ) ) ;
    public final void rule__Grid__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGol.g:654:1: ( ( ( ( rule__Grid__AliveAssignment_2 ) ) ( ( rule__Grid__AliveAssignment_2 )* ) ) )
            // InternalGol.g:655:1: ( ( ( rule__Grid__AliveAssignment_2 ) ) ( ( rule__Grid__AliveAssignment_2 )* ) )
            {
            // InternalGol.g:655:1: ( ( ( rule__Grid__AliveAssignment_2 ) ) ( ( rule__Grid__AliveAssignment_2 )* ) )
            // InternalGol.g:656:2: ( ( rule__Grid__AliveAssignment_2 ) ) ( ( rule__Grid__AliveAssignment_2 )* )
            {
            // InternalGol.g:656:2: ( ( rule__Grid__AliveAssignment_2 ) )
            // InternalGol.g:657:3: ( rule__Grid__AliveAssignment_2 )
            {
             before(grammarAccess.getGridAccess().getAliveAssignment_2()); 
            // InternalGol.g:658:3: ( rule__Grid__AliveAssignment_2 )
            // InternalGol.g:658:4: rule__Grid__AliveAssignment_2
            {
            pushFollow(FOLLOW_13);
            rule__Grid__AliveAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getGridAccess().getAliveAssignment_2()); 

            }

            // InternalGol.g:661:2: ( ( rule__Grid__AliveAssignment_2 )* )
            // InternalGol.g:662:3: ( rule__Grid__AliveAssignment_2 )*
            {
             before(grammarAccess.getGridAccess().getAliveAssignment_2()); 
            // InternalGol.g:663:3: ( rule__Grid__AliveAssignment_2 )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==22) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalGol.g:663:4: rule__Grid__AliveAssignment_2
            	    {
            	    pushFollow(FOLLOW_13);
            	    rule__Grid__AliveAssignment_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

             after(grammarAccess.getGridAccess().getAliveAssignment_2()); 

            }


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
    // $ANTLR end "rule__Grid__Group__2__Impl"


    // $ANTLR start "rule__Grid__Group__3"
    // InternalGol.g:672:1: rule__Grid__Group__3 : rule__Grid__Group__3__Impl ;
    public final void rule__Grid__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGol.g:676:1: ( rule__Grid__Group__3__Impl )
            // InternalGol.g:677:2: rule__Grid__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Grid__Group__3__Impl();

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
    // $ANTLR end "rule__Grid__Group__3"


    // $ANTLR start "rule__Grid__Group__3__Impl"
    // InternalGol.g:683:1: rule__Grid__Group__3__Impl : ( '}' ) ;
    public final void rule__Grid__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGol.g:687:1: ( ( '}' ) )
            // InternalGol.g:688:1: ( '}' )
            {
            // InternalGol.g:688:1: ( '}' )
            // InternalGol.g:689:2: '}'
            {
             before(grammarAccess.getGridAccess().getRightCurlyBracketKeyword_3()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getGridAccess().getRightCurlyBracketKeyword_3()); 

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
    // $ANTLR end "rule__Grid__Group__3__Impl"


    // $ANTLR start "rule__Coordinate__Group__0"
    // InternalGol.g:699:1: rule__Coordinate__Group__0 : rule__Coordinate__Group__0__Impl rule__Coordinate__Group__1 ;
    public final void rule__Coordinate__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGol.g:703:1: ( rule__Coordinate__Group__0__Impl rule__Coordinate__Group__1 )
            // InternalGol.g:704:2: rule__Coordinate__Group__0__Impl rule__Coordinate__Group__1
            {
            pushFollow(FOLLOW_14);
            rule__Coordinate__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Coordinate__Group__1();

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
    // $ANTLR end "rule__Coordinate__Group__0"


    // $ANTLR start "rule__Coordinate__Group__0__Impl"
    // InternalGol.g:711:1: rule__Coordinate__Group__0__Impl : ( '(' ) ;
    public final void rule__Coordinate__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGol.g:715:1: ( ( '(' ) )
            // InternalGol.g:716:1: ( '(' )
            {
            // InternalGol.g:716:1: ( '(' )
            // InternalGol.g:717:2: '('
            {
             before(grammarAccess.getCoordinateAccess().getLeftParenthesisKeyword_0()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getCoordinateAccess().getLeftParenthesisKeyword_0()); 

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
    // $ANTLR end "rule__Coordinate__Group__0__Impl"


    // $ANTLR start "rule__Coordinate__Group__1"
    // InternalGol.g:726:1: rule__Coordinate__Group__1 : rule__Coordinate__Group__1__Impl rule__Coordinate__Group__2 ;
    public final void rule__Coordinate__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGol.g:730:1: ( rule__Coordinate__Group__1__Impl rule__Coordinate__Group__2 )
            // InternalGol.g:731:2: rule__Coordinate__Group__1__Impl rule__Coordinate__Group__2
            {
            pushFollow(FOLLOW_15);
            rule__Coordinate__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Coordinate__Group__2();

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
    // $ANTLR end "rule__Coordinate__Group__1"


    // $ANTLR start "rule__Coordinate__Group__1__Impl"
    // InternalGol.g:738:1: rule__Coordinate__Group__1__Impl : ( ( rule__Coordinate__XAssignment_1 ) ) ;
    public final void rule__Coordinate__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGol.g:742:1: ( ( ( rule__Coordinate__XAssignment_1 ) ) )
            // InternalGol.g:743:1: ( ( rule__Coordinate__XAssignment_1 ) )
            {
            // InternalGol.g:743:1: ( ( rule__Coordinate__XAssignment_1 ) )
            // InternalGol.g:744:2: ( rule__Coordinate__XAssignment_1 )
            {
             before(grammarAccess.getCoordinateAccess().getXAssignment_1()); 
            // InternalGol.g:745:2: ( rule__Coordinate__XAssignment_1 )
            // InternalGol.g:745:3: rule__Coordinate__XAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Coordinate__XAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getCoordinateAccess().getXAssignment_1()); 

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
    // $ANTLR end "rule__Coordinate__Group__1__Impl"


    // $ANTLR start "rule__Coordinate__Group__2"
    // InternalGol.g:753:1: rule__Coordinate__Group__2 : rule__Coordinate__Group__2__Impl rule__Coordinate__Group__3 ;
    public final void rule__Coordinate__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGol.g:757:1: ( rule__Coordinate__Group__2__Impl rule__Coordinate__Group__3 )
            // InternalGol.g:758:2: rule__Coordinate__Group__2__Impl rule__Coordinate__Group__3
            {
            pushFollow(FOLLOW_14);
            rule__Coordinate__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Coordinate__Group__3();

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
    // $ANTLR end "rule__Coordinate__Group__2"


    // $ANTLR start "rule__Coordinate__Group__2__Impl"
    // InternalGol.g:765:1: rule__Coordinate__Group__2__Impl : ( ',' ) ;
    public final void rule__Coordinate__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGol.g:769:1: ( ( ',' ) )
            // InternalGol.g:770:1: ( ',' )
            {
            // InternalGol.g:770:1: ( ',' )
            // InternalGol.g:771:2: ','
            {
             before(grammarAccess.getCoordinateAccess().getCommaKeyword_2()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getCoordinateAccess().getCommaKeyword_2()); 

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
    // $ANTLR end "rule__Coordinate__Group__2__Impl"


    // $ANTLR start "rule__Coordinate__Group__3"
    // InternalGol.g:780:1: rule__Coordinate__Group__3 : rule__Coordinate__Group__3__Impl rule__Coordinate__Group__4 ;
    public final void rule__Coordinate__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGol.g:784:1: ( rule__Coordinate__Group__3__Impl rule__Coordinate__Group__4 )
            // InternalGol.g:785:2: rule__Coordinate__Group__3__Impl rule__Coordinate__Group__4
            {
            pushFollow(FOLLOW_16);
            rule__Coordinate__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Coordinate__Group__4();

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
    // $ANTLR end "rule__Coordinate__Group__3"


    // $ANTLR start "rule__Coordinate__Group__3__Impl"
    // InternalGol.g:792:1: rule__Coordinate__Group__3__Impl : ( ( rule__Coordinate__YAssignment_3 ) ) ;
    public final void rule__Coordinate__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGol.g:796:1: ( ( ( rule__Coordinate__YAssignment_3 ) ) )
            // InternalGol.g:797:1: ( ( rule__Coordinate__YAssignment_3 ) )
            {
            // InternalGol.g:797:1: ( ( rule__Coordinate__YAssignment_3 ) )
            // InternalGol.g:798:2: ( rule__Coordinate__YAssignment_3 )
            {
             before(grammarAccess.getCoordinateAccess().getYAssignment_3()); 
            // InternalGol.g:799:2: ( rule__Coordinate__YAssignment_3 )
            // InternalGol.g:799:3: rule__Coordinate__YAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Coordinate__YAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getCoordinateAccess().getYAssignment_3()); 

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
    // $ANTLR end "rule__Coordinate__Group__3__Impl"


    // $ANTLR start "rule__Coordinate__Group__4"
    // InternalGol.g:807:1: rule__Coordinate__Group__4 : rule__Coordinate__Group__4__Impl ;
    public final void rule__Coordinate__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGol.g:811:1: ( rule__Coordinate__Group__4__Impl )
            // InternalGol.g:812:2: rule__Coordinate__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Coordinate__Group__4__Impl();

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
    // $ANTLR end "rule__Coordinate__Group__4"


    // $ANTLR start "rule__Coordinate__Group__4__Impl"
    // InternalGol.g:818:1: rule__Coordinate__Group__4__Impl : ( ')' ) ;
    public final void rule__Coordinate__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGol.g:822:1: ( ( ')' ) )
            // InternalGol.g:823:1: ( ')' )
            {
            // InternalGol.g:823:1: ( ')' )
            // InternalGol.g:824:2: ')'
            {
             before(grammarAccess.getCoordinateAccess().getRightParenthesisKeyword_4()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getCoordinateAccess().getRightParenthesisKeyword_4()); 

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
    // $ANTLR end "rule__Coordinate__Group__4__Impl"


    // $ANTLR start "rule__Condition__Group__0"
    // InternalGol.g:834:1: rule__Condition__Group__0 : rule__Condition__Group__0__Impl rule__Condition__Group__1 ;
    public final void rule__Condition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGol.g:838:1: ( rule__Condition__Group__0__Impl rule__Condition__Group__1 )
            // InternalGol.g:839:2: rule__Condition__Group__0__Impl rule__Condition__Group__1
            {
            pushFollow(FOLLOW_14);
            rule__Condition__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Condition__Group__1();

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
    // $ANTLR end "rule__Condition__Group__0"


    // $ANTLR start "rule__Condition__Group__0__Impl"
    // InternalGol.g:846:1: rule__Condition__Group__0__Impl : ( ( rule__Condition__SignAssignment_0 ) ) ;
    public final void rule__Condition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGol.g:850:1: ( ( ( rule__Condition__SignAssignment_0 ) ) )
            // InternalGol.g:851:1: ( ( rule__Condition__SignAssignment_0 ) )
            {
            // InternalGol.g:851:1: ( ( rule__Condition__SignAssignment_0 ) )
            // InternalGol.g:852:2: ( rule__Condition__SignAssignment_0 )
            {
             before(grammarAccess.getConditionAccess().getSignAssignment_0()); 
            // InternalGol.g:853:2: ( rule__Condition__SignAssignment_0 )
            // InternalGol.g:853:3: rule__Condition__SignAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Condition__SignAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getConditionAccess().getSignAssignment_0()); 

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
    // $ANTLR end "rule__Condition__Group__0__Impl"


    // $ANTLR start "rule__Condition__Group__1"
    // InternalGol.g:861:1: rule__Condition__Group__1 : rule__Condition__Group__1__Impl ;
    public final void rule__Condition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGol.g:865:1: ( rule__Condition__Group__1__Impl )
            // InternalGol.g:866:2: rule__Condition__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Condition__Group__1__Impl();

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
    // $ANTLR end "rule__Condition__Group__1"


    // $ANTLR start "rule__Condition__Group__1__Impl"
    // InternalGol.g:872:1: rule__Condition__Group__1__Impl : ( ( rule__Condition__ValueAssignment_1 ) ) ;
    public final void rule__Condition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGol.g:876:1: ( ( ( rule__Condition__ValueAssignment_1 ) ) )
            // InternalGol.g:877:1: ( ( rule__Condition__ValueAssignment_1 ) )
            {
            // InternalGol.g:877:1: ( ( rule__Condition__ValueAssignment_1 ) )
            // InternalGol.g:878:2: ( rule__Condition__ValueAssignment_1 )
            {
             before(grammarAccess.getConditionAccess().getValueAssignment_1()); 
            // InternalGol.g:879:2: ( rule__Condition__ValueAssignment_1 )
            // InternalGol.g:879:3: rule__Condition__ValueAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Condition__ValueAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getConditionAccess().getValueAssignment_1()); 

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
    // $ANTLR end "rule__Condition__Group__1__Impl"


    // $ANTLR start "rule__GameOfLife__InitialGridAssignment_3"
    // InternalGol.g:888:1: rule__GameOfLife__InitialGridAssignment_3 : ( ruleGrid ) ;
    public final void rule__GameOfLife__InitialGridAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGol.g:892:1: ( ( ruleGrid ) )
            // InternalGol.g:893:2: ( ruleGrid )
            {
            // InternalGol.g:893:2: ( ruleGrid )
            // InternalGol.g:894:3: ruleGrid
            {
             before(grammarAccess.getGameOfLifeAccess().getInitialGridGridParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleGrid();

            state._fsp--;

             after(grammarAccess.getGameOfLifeAccess().getInitialGridGridParserRuleCall_3_0()); 

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
    // $ANTLR end "rule__GameOfLife__InitialGridAssignment_3"


    // $ANTLR start "rule__GameOfLife__RulesAssignment_5"
    // InternalGol.g:903:1: rule__GameOfLife__RulesAssignment_5 : ( ruleRules ) ;
    public final void rule__GameOfLife__RulesAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGol.g:907:1: ( ( ruleRules ) )
            // InternalGol.g:908:2: ( ruleRules )
            {
            // InternalGol.g:908:2: ( ruleRules )
            // InternalGol.g:909:3: ruleRules
            {
             before(grammarAccess.getGameOfLifeAccess().getRulesRulesParserRuleCall_5_0()); 
            pushFollow(FOLLOW_2);
            ruleRules();

            state._fsp--;

             after(grammarAccess.getGameOfLifeAccess().getRulesRulesParserRuleCall_5_0()); 

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
    // $ANTLR end "rule__GameOfLife__RulesAssignment_5"


    // $ANTLR start "rule__Rules__RuleAssignment"
    // InternalGol.g:918:1: rule__Rules__RuleAssignment : ( ruleRule ) ;
    public final void rule__Rules__RuleAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGol.g:922:1: ( ( ruleRule ) )
            // InternalGol.g:923:2: ( ruleRule )
            {
            // InternalGol.g:923:2: ( ruleRule )
            // InternalGol.g:924:3: ruleRule
            {
             before(grammarAccess.getRulesAccess().getRuleRuleParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleRule();

            state._fsp--;

             after(grammarAccess.getRulesAccess().getRuleRuleParserRuleCall_0()); 

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
    // $ANTLR end "rule__Rules__RuleAssignment"


    // $ANTLR start "rule__Rule__SurviveAssignment_0_1"
    // InternalGol.g:933:1: rule__Rule__SurviveAssignment_0_1 : ( ruleCondition ) ;
    public final void rule__Rule__SurviveAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGol.g:937:1: ( ( ruleCondition ) )
            // InternalGol.g:938:2: ( ruleCondition )
            {
            // InternalGol.g:938:2: ( ruleCondition )
            // InternalGol.g:939:3: ruleCondition
            {
             before(grammarAccess.getRuleAccess().getSurviveConditionParserRuleCall_0_1_0()); 
            pushFollow(FOLLOW_2);
            ruleCondition();

            state._fsp--;

             after(grammarAccess.getRuleAccess().getSurviveConditionParserRuleCall_0_1_0()); 

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
    // $ANTLR end "rule__Rule__SurviveAssignment_0_1"


    // $ANTLR start "rule__Rule__RebornAssignment_1_1"
    // InternalGol.g:948:1: rule__Rule__RebornAssignment_1_1 : ( ruleCondition ) ;
    public final void rule__Rule__RebornAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGol.g:952:1: ( ( ruleCondition ) )
            // InternalGol.g:953:2: ( ruleCondition )
            {
            // InternalGol.g:953:2: ( ruleCondition )
            // InternalGol.g:954:3: ruleCondition
            {
             before(grammarAccess.getRuleAccess().getRebornConditionParserRuleCall_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleCondition();

            state._fsp--;

             after(grammarAccess.getRuleAccess().getRebornConditionParserRuleCall_1_1_0()); 

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
    // $ANTLR end "rule__Rule__RebornAssignment_1_1"


    // $ANTLR start "rule__Grid__AliveAssignment_2"
    // InternalGol.g:963:1: rule__Grid__AliveAssignment_2 : ( ruleCoordinate ) ;
    public final void rule__Grid__AliveAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGol.g:967:1: ( ( ruleCoordinate ) )
            // InternalGol.g:968:2: ( ruleCoordinate )
            {
            // InternalGol.g:968:2: ( ruleCoordinate )
            // InternalGol.g:969:3: ruleCoordinate
            {
             before(grammarAccess.getGridAccess().getAliveCoordinateParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleCoordinate();

            state._fsp--;

             after(grammarAccess.getGridAccess().getAliveCoordinateParserRuleCall_2_0()); 

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
    // $ANTLR end "rule__Grid__AliveAssignment_2"


    // $ANTLR start "rule__Coordinate__XAssignment_1"
    // InternalGol.g:978:1: rule__Coordinate__XAssignment_1 : ( RULE_INT ) ;
    public final void rule__Coordinate__XAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGol.g:982:1: ( ( RULE_INT ) )
            // InternalGol.g:983:2: ( RULE_INT )
            {
            // InternalGol.g:983:2: ( RULE_INT )
            // InternalGol.g:984:3: RULE_INT
            {
             before(grammarAccess.getCoordinateAccess().getXINTTerminalRuleCall_1_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getCoordinateAccess().getXINTTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__Coordinate__XAssignment_1"


    // $ANTLR start "rule__Coordinate__YAssignment_3"
    // InternalGol.g:993:1: rule__Coordinate__YAssignment_3 : ( RULE_INT ) ;
    public final void rule__Coordinate__YAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGol.g:997:1: ( ( RULE_INT ) )
            // InternalGol.g:998:2: ( RULE_INT )
            {
            // InternalGol.g:998:2: ( RULE_INT )
            // InternalGol.g:999:3: RULE_INT
            {
             before(grammarAccess.getCoordinateAccess().getYINTTerminalRuleCall_3_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getCoordinateAccess().getYINTTerminalRuleCall_3_0()); 

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
    // $ANTLR end "rule__Coordinate__YAssignment_3"


    // $ANTLR start "rule__Condition__SignAssignment_0"
    // InternalGol.g:1008:1: rule__Condition__SignAssignment_0 : ( ruleConditionSign ) ;
    public final void rule__Condition__SignAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGol.g:1012:1: ( ( ruleConditionSign ) )
            // InternalGol.g:1013:2: ( ruleConditionSign )
            {
            // InternalGol.g:1013:2: ( ruleConditionSign )
            // InternalGol.g:1014:3: ruleConditionSign
            {
             before(grammarAccess.getConditionAccess().getSignConditionSignEnumRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleConditionSign();

            state._fsp--;

             after(grammarAccess.getConditionAccess().getSignConditionSignEnumRuleCall_0_0()); 

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
    // $ANTLR end "rule__Condition__SignAssignment_0"


    // $ANTLR start "rule__Condition__ValueAssignment_1"
    // InternalGol.g:1023:1: rule__Condition__ValueAssignment_1 : ( RULE_INT ) ;
    public final void rule__Condition__ValueAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGol.g:1027:1: ( ( RULE_INT ) )
            // InternalGol.g:1028:2: ( RULE_INT )
            {
            // InternalGol.g:1028:2: ( RULE_INT )
            // InternalGol.g:1029:3: RULE_INT
            {
             before(grammarAccess.getConditionAccess().getValueINTTerminalRuleCall_1_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getConditionAccess().getValueINTTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__Condition__ValueAssignment_1"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000180002L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000180000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000003800L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000003802L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000400002L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000001000000L});

}