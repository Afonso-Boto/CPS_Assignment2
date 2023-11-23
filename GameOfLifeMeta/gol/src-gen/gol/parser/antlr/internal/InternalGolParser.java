package gol.parser.antlr.internal;

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
import gol.services.GolGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalGolParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_INT", "RULE_ID", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Configuration'", "'{'", "'InitialGrid'", "'EvaluationRules'", "'}'", "'Survive'", "'Reborn'", "'Alive:'", "'('", "','", "')'", "'<'", "'=='", "'>'"
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

        public InternalGolParser(TokenStream input, GolGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "GameOfLife";
       	}

       	@Override
       	protected GolGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleGameOfLife"
    // InternalGol.g:65:1: entryRuleGameOfLife returns [EObject current=null] : iv_ruleGameOfLife= ruleGameOfLife EOF ;
    public final EObject entryRuleGameOfLife() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGameOfLife = null;


        try {
            // InternalGol.g:65:51: (iv_ruleGameOfLife= ruleGameOfLife EOF )
            // InternalGol.g:66:2: iv_ruleGameOfLife= ruleGameOfLife EOF
            {
             newCompositeNode(grammarAccess.getGameOfLifeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleGameOfLife=ruleGameOfLife();

            state._fsp--;

             current =iv_ruleGameOfLife; 
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
    // $ANTLR end "entryRuleGameOfLife"


    // $ANTLR start "ruleGameOfLife"
    // InternalGol.g:72:1: ruleGameOfLife returns [EObject current=null] : (otherlv_0= 'Configuration' otherlv_1= '{' otherlv_2= 'InitialGrid' ( (lv_initialGrid_3_0= ruleGrid ) ) otherlv_4= 'EvaluationRules' ( (lv_rules_5_0= ruleRules ) ) otherlv_6= '}' ) ;
    public final EObject ruleGameOfLife() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_initialGrid_3_0 = null;

        EObject lv_rules_5_0 = null;



        	enterRule();

        try {
            // InternalGol.g:78:2: ( (otherlv_0= 'Configuration' otherlv_1= '{' otherlv_2= 'InitialGrid' ( (lv_initialGrid_3_0= ruleGrid ) ) otherlv_4= 'EvaluationRules' ( (lv_rules_5_0= ruleRules ) ) otherlv_6= '}' ) )
            // InternalGol.g:79:2: (otherlv_0= 'Configuration' otherlv_1= '{' otherlv_2= 'InitialGrid' ( (lv_initialGrid_3_0= ruleGrid ) ) otherlv_4= 'EvaluationRules' ( (lv_rules_5_0= ruleRules ) ) otherlv_6= '}' )
            {
            // InternalGol.g:79:2: (otherlv_0= 'Configuration' otherlv_1= '{' otherlv_2= 'InitialGrid' ( (lv_initialGrid_3_0= ruleGrid ) ) otherlv_4= 'EvaluationRules' ( (lv_rules_5_0= ruleRules ) ) otherlv_6= '}' )
            // InternalGol.g:80:3: otherlv_0= 'Configuration' otherlv_1= '{' otherlv_2= 'InitialGrid' ( (lv_initialGrid_3_0= ruleGrid ) ) otherlv_4= 'EvaluationRules' ( (lv_rules_5_0= ruleRules ) ) otherlv_6= '}'
            {
            otherlv_0=(Token)match(input,11,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getGameOfLifeAccess().getConfigurationKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getGameOfLifeAccess().getLeftCurlyBracketKeyword_1());
            		
            otherlv_2=(Token)match(input,13,FOLLOW_5); 

            			newLeafNode(otherlv_2, grammarAccess.getGameOfLifeAccess().getInitialGridKeyword_2());
            		
            // InternalGol.g:92:3: ( (lv_initialGrid_3_0= ruleGrid ) )
            // InternalGol.g:93:4: (lv_initialGrid_3_0= ruleGrid )
            {
            // InternalGol.g:93:4: (lv_initialGrid_3_0= ruleGrid )
            // InternalGol.g:94:5: lv_initialGrid_3_0= ruleGrid
            {

            					newCompositeNode(grammarAccess.getGameOfLifeAccess().getInitialGridGridParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_6);
            lv_initialGrid_3_0=ruleGrid();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getGameOfLifeRule());
            					}
            					set(
            						current,
            						"initialGrid",
            						lv_initialGrid_3_0,
            						"gol.Gol.Grid");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,14,FOLLOW_7); 

            			newLeafNode(otherlv_4, grammarAccess.getGameOfLifeAccess().getEvaluationRulesKeyword_4());
            		
            // InternalGol.g:115:3: ( (lv_rules_5_0= ruleRules ) )
            // InternalGol.g:116:4: (lv_rules_5_0= ruleRules )
            {
            // InternalGol.g:116:4: (lv_rules_5_0= ruleRules )
            // InternalGol.g:117:5: lv_rules_5_0= ruleRules
            {

            					newCompositeNode(grammarAccess.getGameOfLifeAccess().getRulesRulesParserRuleCall_5_0());
            				
            pushFollow(FOLLOW_8);
            lv_rules_5_0=ruleRules();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getGameOfLifeRule());
            					}
            					set(
            						current,
            						"rules",
            						lv_rules_5_0,
            						"gol.Gol.Rules");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_6=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_6, grammarAccess.getGameOfLifeAccess().getRightCurlyBracketKeyword_6());
            		

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
    // $ANTLR end "ruleGameOfLife"


    // $ANTLR start "entryRuleRules"
    // InternalGol.g:142:1: entryRuleRules returns [EObject current=null] : iv_ruleRules= ruleRules EOF ;
    public final EObject entryRuleRules() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRules = null;


        try {
            // InternalGol.g:142:46: (iv_ruleRules= ruleRules EOF )
            // InternalGol.g:143:2: iv_ruleRules= ruleRules EOF
            {
             newCompositeNode(grammarAccess.getRulesRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRules=ruleRules();

            state._fsp--;

             current =iv_ruleRules; 
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
    // $ANTLR end "entryRuleRules"


    // $ANTLR start "ruleRules"
    // InternalGol.g:149:1: ruleRules returns [EObject current=null] : ( (lv_rule_0_0= ruleRule ) )+ ;
    public final EObject ruleRules() throws RecognitionException {
        EObject current = null;

        EObject lv_rule_0_0 = null;



        	enterRule();

        try {
            // InternalGol.g:155:2: ( ( (lv_rule_0_0= ruleRule ) )+ )
            // InternalGol.g:156:2: ( (lv_rule_0_0= ruleRule ) )+
            {
            // InternalGol.g:156:2: ( (lv_rule_0_0= ruleRule ) )+
            int cnt1=0;
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0>=16 && LA1_0<=17)) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalGol.g:157:3: (lv_rule_0_0= ruleRule )
            	    {
            	    // InternalGol.g:157:3: (lv_rule_0_0= ruleRule )
            	    // InternalGol.g:158:4: lv_rule_0_0= ruleRule
            	    {

            	    				newCompositeNode(grammarAccess.getRulesAccess().getRuleRuleParserRuleCall_0());
            	    			
            	    pushFollow(FOLLOW_9);
            	    lv_rule_0_0=ruleRule();

            	    state._fsp--;


            	    				if (current==null) {
            	    					current = createModelElementForParent(grammarAccess.getRulesRule());
            	    				}
            	    				add(
            	    					current,
            	    					"rule",
            	    					lv_rule_0_0,
            	    					"gol.Gol.Rule");
            	    				afterParserOrEnumRuleCall();
            	    			

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
    // $ANTLR end "ruleRules"


    // $ANTLR start "entryRuleRule"
    // InternalGol.g:178:1: entryRuleRule returns [EObject current=null] : iv_ruleRule= ruleRule EOF ;
    public final EObject entryRuleRule() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRule = null;


        try {
            // InternalGol.g:178:45: (iv_ruleRule= ruleRule EOF )
            // InternalGol.g:179:2: iv_ruleRule= ruleRule EOF
            {
             newCompositeNode(grammarAccess.getRuleRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRule=ruleRule();

            state._fsp--;

             current =iv_ruleRule; 
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
    // $ANTLR end "entryRuleRule"


    // $ANTLR start "ruleRule"
    // InternalGol.g:185:1: ruleRule returns [EObject current=null] : ( (otherlv_0= 'Survive' ( (lv_survive_1_0= ruleCondition ) )+ ) | (otherlv_2= 'Reborn' ( (lv_reborn_3_0= ruleCondition ) )+ ) ) ;
    public final EObject ruleRule() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_survive_1_0 = null;

        EObject lv_reborn_3_0 = null;



        	enterRule();

        try {
            // InternalGol.g:191:2: ( ( (otherlv_0= 'Survive' ( (lv_survive_1_0= ruleCondition ) )+ ) | (otherlv_2= 'Reborn' ( (lv_reborn_3_0= ruleCondition ) )+ ) ) )
            // InternalGol.g:192:2: ( (otherlv_0= 'Survive' ( (lv_survive_1_0= ruleCondition ) )+ ) | (otherlv_2= 'Reborn' ( (lv_reborn_3_0= ruleCondition ) )+ ) )
            {
            // InternalGol.g:192:2: ( (otherlv_0= 'Survive' ( (lv_survive_1_0= ruleCondition ) )+ ) | (otherlv_2= 'Reborn' ( (lv_reborn_3_0= ruleCondition ) )+ ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==16) ) {
                alt4=1;
            }
            else if ( (LA4_0==17) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // InternalGol.g:193:3: (otherlv_0= 'Survive' ( (lv_survive_1_0= ruleCondition ) )+ )
                    {
                    // InternalGol.g:193:3: (otherlv_0= 'Survive' ( (lv_survive_1_0= ruleCondition ) )+ )
                    // InternalGol.g:194:4: otherlv_0= 'Survive' ( (lv_survive_1_0= ruleCondition ) )+
                    {
                    otherlv_0=(Token)match(input,16,FOLLOW_10); 

                    				newLeafNode(otherlv_0, grammarAccess.getRuleAccess().getSurviveKeyword_0_0());
                    			
                    // InternalGol.g:198:4: ( (lv_survive_1_0= ruleCondition ) )+
                    int cnt2=0;
                    loop2:
                    do {
                        int alt2=2;
                        int LA2_0 = input.LA(1);

                        if ( ((LA2_0>=22 && LA2_0<=24)) ) {
                            alt2=1;
                        }


                        switch (alt2) {
                    	case 1 :
                    	    // InternalGol.g:199:5: (lv_survive_1_0= ruleCondition )
                    	    {
                    	    // InternalGol.g:199:5: (lv_survive_1_0= ruleCondition )
                    	    // InternalGol.g:200:6: lv_survive_1_0= ruleCondition
                    	    {

                    	    						newCompositeNode(grammarAccess.getRuleAccess().getSurviveConditionParserRuleCall_0_1_0());
                    	    					
                    	    pushFollow(FOLLOW_11);
                    	    lv_survive_1_0=ruleCondition();

                    	    state._fsp--;


                    	    						if (current==null) {
                    	    							current = createModelElementForParent(grammarAccess.getRuleRule());
                    	    						}
                    	    						add(
                    	    							current,
                    	    							"survive",
                    	    							lv_survive_1_0,
                    	    							"gol.Gol.Condition");
                    	    						afterParserOrEnumRuleCall();
                    	    					

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


                    }
                    break;
                case 2 :
                    // InternalGol.g:219:3: (otherlv_2= 'Reborn' ( (lv_reborn_3_0= ruleCondition ) )+ )
                    {
                    // InternalGol.g:219:3: (otherlv_2= 'Reborn' ( (lv_reborn_3_0= ruleCondition ) )+ )
                    // InternalGol.g:220:4: otherlv_2= 'Reborn' ( (lv_reborn_3_0= ruleCondition ) )+
                    {
                    otherlv_2=(Token)match(input,17,FOLLOW_10); 

                    				newLeafNode(otherlv_2, grammarAccess.getRuleAccess().getRebornKeyword_1_0());
                    			
                    // InternalGol.g:224:4: ( (lv_reborn_3_0= ruleCondition ) )+
                    int cnt3=0;
                    loop3:
                    do {
                        int alt3=2;
                        int LA3_0 = input.LA(1);

                        if ( ((LA3_0>=22 && LA3_0<=24)) ) {
                            alt3=1;
                        }


                        switch (alt3) {
                    	case 1 :
                    	    // InternalGol.g:225:5: (lv_reborn_3_0= ruleCondition )
                    	    {
                    	    // InternalGol.g:225:5: (lv_reborn_3_0= ruleCondition )
                    	    // InternalGol.g:226:6: lv_reborn_3_0= ruleCondition
                    	    {

                    	    						newCompositeNode(grammarAccess.getRuleAccess().getRebornConditionParserRuleCall_1_1_0());
                    	    					
                    	    pushFollow(FOLLOW_11);
                    	    lv_reborn_3_0=ruleCondition();

                    	    state._fsp--;


                    	    						if (current==null) {
                    	    							current = createModelElementForParent(grammarAccess.getRuleRule());
                    	    						}
                    	    						add(
                    	    							current,
                    	    							"reborn",
                    	    							lv_reborn_3_0,
                    	    							"gol.Gol.Condition");
                    	    						afterParserOrEnumRuleCall();
                    	    					

                    	    }


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
    // $ANTLR end "ruleRule"


    // $ANTLR start "entryRuleGrid"
    // InternalGol.g:248:1: entryRuleGrid returns [EObject current=null] : iv_ruleGrid= ruleGrid EOF ;
    public final EObject entryRuleGrid() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGrid = null;


        try {
            // InternalGol.g:248:45: (iv_ruleGrid= ruleGrid EOF )
            // InternalGol.g:249:2: iv_ruleGrid= ruleGrid EOF
            {
             newCompositeNode(grammarAccess.getGridRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleGrid=ruleGrid();

            state._fsp--;

             current =iv_ruleGrid; 
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
    // $ANTLR end "entryRuleGrid"


    // $ANTLR start "ruleGrid"
    // InternalGol.g:255:1: ruleGrid returns [EObject current=null] : (otherlv_0= 'Alive:' otherlv_1= '{' ( (lv_alive_2_0= ruleCoordinate ) )+ otherlv_3= '}' ) ;
    public final EObject ruleGrid() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_alive_2_0 = null;



        	enterRule();

        try {
            // InternalGol.g:261:2: ( (otherlv_0= 'Alive:' otherlv_1= '{' ( (lv_alive_2_0= ruleCoordinate ) )+ otherlv_3= '}' ) )
            // InternalGol.g:262:2: (otherlv_0= 'Alive:' otherlv_1= '{' ( (lv_alive_2_0= ruleCoordinate ) )+ otherlv_3= '}' )
            {
            // InternalGol.g:262:2: (otherlv_0= 'Alive:' otherlv_1= '{' ( (lv_alive_2_0= ruleCoordinate ) )+ otherlv_3= '}' )
            // InternalGol.g:263:3: otherlv_0= 'Alive:' otherlv_1= '{' ( (lv_alive_2_0= ruleCoordinate ) )+ otherlv_3= '}'
            {
            otherlv_0=(Token)match(input,18,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getGridAccess().getAliveKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_12); 

            			newLeafNode(otherlv_1, grammarAccess.getGridAccess().getLeftCurlyBracketKeyword_1());
            		
            // InternalGol.g:271:3: ( (lv_alive_2_0= ruleCoordinate ) )+
            int cnt5=0;
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==19) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalGol.g:272:4: (lv_alive_2_0= ruleCoordinate )
            	    {
            	    // InternalGol.g:272:4: (lv_alive_2_0= ruleCoordinate )
            	    // InternalGol.g:273:5: lv_alive_2_0= ruleCoordinate
            	    {

            	    					newCompositeNode(grammarAccess.getGridAccess().getAliveCoordinateParserRuleCall_2_0());
            	    				
            	    pushFollow(FOLLOW_13);
            	    lv_alive_2_0=ruleCoordinate();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getGridRule());
            	    					}
            	    					add(
            	    						current,
            	    						"alive",
            	    						lv_alive_2_0,
            	    						"gol.Gol.Coordinate");
            	    					afterParserOrEnumRuleCall();
            	    				

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

            otherlv_3=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_3, grammarAccess.getGridAccess().getRightCurlyBracketKeyword_3());
            		

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
    // $ANTLR end "ruleGrid"


    // $ANTLR start "entryRuleCoordinate"
    // InternalGol.g:298:1: entryRuleCoordinate returns [EObject current=null] : iv_ruleCoordinate= ruleCoordinate EOF ;
    public final EObject entryRuleCoordinate() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCoordinate = null;


        try {
            // InternalGol.g:298:51: (iv_ruleCoordinate= ruleCoordinate EOF )
            // InternalGol.g:299:2: iv_ruleCoordinate= ruleCoordinate EOF
            {
             newCompositeNode(grammarAccess.getCoordinateRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCoordinate=ruleCoordinate();

            state._fsp--;

             current =iv_ruleCoordinate; 
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
    // $ANTLR end "entryRuleCoordinate"


    // $ANTLR start "ruleCoordinate"
    // InternalGol.g:305:1: ruleCoordinate returns [EObject current=null] : (otherlv_0= '(' ( (lv_x_1_0= RULE_INT ) ) otherlv_2= ',' ( (lv_y_3_0= RULE_INT ) ) otherlv_4= ')' ) ;
    public final EObject ruleCoordinate() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_x_1_0=null;
        Token otherlv_2=null;
        Token lv_y_3_0=null;
        Token otherlv_4=null;


        	enterRule();

        try {
            // InternalGol.g:311:2: ( (otherlv_0= '(' ( (lv_x_1_0= RULE_INT ) ) otherlv_2= ',' ( (lv_y_3_0= RULE_INT ) ) otherlv_4= ')' ) )
            // InternalGol.g:312:2: (otherlv_0= '(' ( (lv_x_1_0= RULE_INT ) ) otherlv_2= ',' ( (lv_y_3_0= RULE_INT ) ) otherlv_4= ')' )
            {
            // InternalGol.g:312:2: (otherlv_0= '(' ( (lv_x_1_0= RULE_INT ) ) otherlv_2= ',' ( (lv_y_3_0= RULE_INT ) ) otherlv_4= ')' )
            // InternalGol.g:313:3: otherlv_0= '(' ( (lv_x_1_0= RULE_INT ) ) otherlv_2= ',' ( (lv_y_3_0= RULE_INT ) ) otherlv_4= ')'
            {
            otherlv_0=(Token)match(input,19,FOLLOW_14); 

            			newLeafNode(otherlv_0, grammarAccess.getCoordinateAccess().getLeftParenthesisKeyword_0());
            		
            // InternalGol.g:317:3: ( (lv_x_1_0= RULE_INT ) )
            // InternalGol.g:318:4: (lv_x_1_0= RULE_INT )
            {
            // InternalGol.g:318:4: (lv_x_1_0= RULE_INT )
            // InternalGol.g:319:5: lv_x_1_0= RULE_INT
            {
            lv_x_1_0=(Token)match(input,RULE_INT,FOLLOW_15); 

            					newLeafNode(lv_x_1_0, grammarAccess.getCoordinateAccess().getXINTTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getCoordinateRule());
            					}
            					setWithLastConsumed(
            						current,
            						"x",
            						lv_x_1_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            otherlv_2=(Token)match(input,20,FOLLOW_14); 

            			newLeafNode(otherlv_2, grammarAccess.getCoordinateAccess().getCommaKeyword_2());
            		
            // InternalGol.g:339:3: ( (lv_y_3_0= RULE_INT ) )
            // InternalGol.g:340:4: (lv_y_3_0= RULE_INT )
            {
            // InternalGol.g:340:4: (lv_y_3_0= RULE_INT )
            // InternalGol.g:341:5: lv_y_3_0= RULE_INT
            {
            lv_y_3_0=(Token)match(input,RULE_INT,FOLLOW_16); 

            					newLeafNode(lv_y_3_0, grammarAccess.getCoordinateAccess().getYINTTerminalRuleCall_3_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getCoordinateRule());
            					}
            					setWithLastConsumed(
            						current,
            						"y",
            						lv_y_3_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            otherlv_4=(Token)match(input,21,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getCoordinateAccess().getRightParenthesisKeyword_4());
            		

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
    // $ANTLR end "ruleCoordinate"


    // $ANTLR start "entryRuleCondition"
    // InternalGol.g:365:1: entryRuleCondition returns [EObject current=null] : iv_ruleCondition= ruleCondition EOF ;
    public final EObject entryRuleCondition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCondition = null;


        try {
            // InternalGol.g:365:50: (iv_ruleCondition= ruleCondition EOF )
            // InternalGol.g:366:2: iv_ruleCondition= ruleCondition EOF
            {
             newCompositeNode(grammarAccess.getConditionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCondition=ruleCondition();

            state._fsp--;

             current =iv_ruleCondition; 
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
    // $ANTLR end "entryRuleCondition"


    // $ANTLR start "ruleCondition"
    // InternalGol.g:372:1: ruleCondition returns [EObject current=null] : ( ( (lv_sign_0_0= ruleConditionSign ) ) ( (lv_value_1_0= RULE_INT ) ) ) ;
    public final EObject ruleCondition() throws RecognitionException {
        EObject current = null;

        Token lv_value_1_0=null;
        Enumerator lv_sign_0_0 = null;



        	enterRule();

        try {
            // InternalGol.g:378:2: ( ( ( (lv_sign_0_0= ruleConditionSign ) ) ( (lv_value_1_0= RULE_INT ) ) ) )
            // InternalGol.g:379:2: ( ( (lv_sign_0_0= ruleConditionSign ) ) ( (lv_value_1_0= RULE_INT ) ) )
            {
            // InternalGol.g:379:2: ( ( (lv_sign_0_0= ruleConditionSign ) ) ( (lv_value_1_0= RULE_INT ) ) )
            // InternalGol.g:380:3: ( (lv_sign_0_0= ruleConditionSign ) ) ( (lv_value_1_0= RULE_INT ) )
            {
            // InternalGol.g:380:3: ( (lv_sign_0_0= ruleConditionSign ) )
            // InternalGol.g:381:4: (lv_sign_0_0= ruleConditionSign )
            {
            // InternalGol.g:381:4: (lv_sign_0_0= ruleConditionSign )
            // InternalGol.g:382:5: lv_sign_0_0= ruleConditionSign
            {

            					newCompositeNode(grammarAccess.getConditionAccess().getSignConditionSignEnumRuleCall_0_0());
            				
            pushFollow(FOLLOW_14);
            lv_sign_0_0=ruleConditionSign();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getConditionRule());
            					}
            					set(
            						current,
            						"sign",
            						lv_sign_0_0,
            						"gol.Gol.ConditionSign");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalGol.g:399:3: ( (lv_value_1_0= RULE_INT ) )
            // InternalGol.g:400:4: (lv_value_1_0= RULE_INT )
            {
            // InternalGol.g:400:4: (lv_value_1_0= RULE_INT )
            // InternalGol.g:401:5: lv_value_1_0= RULE_INT
            {
            lv_value_1_0=(Token)match(input,RULE_INT,FOLLOW_2); 

            					newLeafNode(lv_value_1_0, grammarAccess.getConditionAccess().getValueINTTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getConditionRule());
            					}
            					setWithLastConsumed(
            						current,
            						"value",
            						lv_value_1_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

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
    // $ANTLR end "ruleCondition"


    // $ANTLR start "ruleConditionSign"
    // InternalGol.g:421:1: ruleConditionSign returns [Enumerator current=null] : ( (enumLiteral_0= '<' ) | (enumLiteral_1= '==' ) | (enumLiteral_2= '>' ) ) ;
    public final Enumerator ruleConditionSign() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;


        	enterRule();

        try {
            // InternalGol.g:427:2: ( ( (enumLiteral_0= '<' ) | (enumLiteral_1= '==' ) | (enumLiteral_2= '>' ) ) )
            // InternalGol.g:428:2: ( (enumLiteral_0= '<' ) | (enumLiteral_1= '==' ) | (enumLiteral_2= '>' ) )
            {
            // InternalGol.g:428:2: ( (enumLiteral_0= '<' ) | (enumLiteral_1= '==' ) | (enumLiteral_2= '>' ) )
            int alt6=3;
            switch ( input.LA(1) ) {
            case 22:
                {
                alt6=1;
                }
                break;
            case 23:
                {
                alt6=2;
                }
                break;
            case 24:
                {
                alt6=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }

            switch (alt6) {
                case 1 :
                    // InternalGol.g:429:3: (enumLiteral_0= '<' )
                    {
                    // InternalGol.g:429:3: (enumLiteral_0= '<' )
                    // InternalGol.g:430:4: enumLiteral_0= '<'
                    {
                    enumLiteral_0=(Token)match(input,22,FOLLOW_2); 

                    				current = grammarAccess.getConditionSignAccess().getLESS_THANEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getConditionSignAccess().getLESS_THANEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalGol.g:437:3: (enumLiteral_1= '==' )
                    {
                    // InternalGol.g:437:3: (enumLiteral_1= '==' )
                    // InternalGol.g:438:4: enumLiteral_1= '=='
                    {
                    enumLiteral_1=(Token)match(input,23,FOLLOW_2); 

                    				current = grammarAccess.getConditionSignAccess().getEQUALS_TOEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getConditionSignAccess().getEQUALS_TOEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalGol.g:445:3: (enumLiteral_2= '>' )
                    {
                    // InternalGol.g:445:3: (enumLiteral_2= '>' )
                    // InternalGol.g:446:4: enumLiteral_2= '>'
                    {
                    enumLiteral_2=(Token)match(input,24,FOLLOW_2); 

                    				current = grammarAccess.getConditionSignAccess().getGREATER_THANEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getConditionSignAccess().getGREATER_THANEnumLiteralDeclaration_2());
                    			

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
    // $ANTLR end "ruleConditionSign"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000030000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000030002L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000001C00000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000001C00002L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000088000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000200000L});

}