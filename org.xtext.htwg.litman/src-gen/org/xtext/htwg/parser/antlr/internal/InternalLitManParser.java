package org.xtext.htwg.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.xtext.htwg.services.LitManGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalLitManParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_INT", "RULE_ID", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Book'", "'{'", "'Title'", "'=>'", "'Authors'", "'['", "']'", "'Pages'", "'Date'", "'}'", "'Article'", "'Volume'", "'Issue'", "'f'", "'l'", "','", "'-'", "'.'"
    };
    public static final int RULE_STRING=4;
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
    public static final int RULE_ID=6;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=5;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;

    // delegates
    // delegators


        public InternalLitManParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalLitManParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalLitManParser.tokenNames; }
    public String getGrammarFileName() { return "InternalLitMan.g"; }



     	private LitManGrammarAccess grammarAccess;

        public InternalLitManParser(TokenStream input, LitManGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "LitMan";
       	}

       	@Override
       	protected LitManGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleLitMan"
    // InternalLitMan.g:64:1: entryRuleLitMan returns [EObject current=null] : iv_ruleLitMan= ruleLitMan EOF ;
    public final EObject entryRuleLitMan() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLitMan = null;


        try {
            // InternalLitMan.g:64:47: (iv_ruleLitMan= ruleLitMan EOF )
            // InternalLitMan.g:65:2: iv_ruleLitMan= ruleLitMan EOF
            {
             newCompositeNode(grammarAccess.getLitManRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleLitMan=ruleLitMan();

            state._fsp--;

             current =iv_ruleLitMan; 
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
    // $ANTLR end "entryRuleLitMan"


    // $ANTLR start "ruleLitMan"
    // InternalLitMan.g:71:1: ruleLitMan returns [EObject current=null] : ( (lv_literatur_0_0= ruleLitTypes ) )* ;
    public final EObject ruleLitMan() throws RecognitionException {
        EObject current = null;

        EObject lv_literatur_0_0 = null;



        	enterRule();

        try {
            // InternalLitMan.g:77:2: ( ( (lv_literatur_0_0= ruleLitTypes ) )* )
            // InternalLitMan.g:78:2: ( (lv_literatur_0_0= ruleLitTypes ) )*
            {
            // InternalLitMan.g:78:2: ( (lv_literatur_0_0= ruleLitTypes ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==11||LA1_0==21) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalLitMan.g:79:3: (lv_literatur_0_0= ruleLitTypes )
            	    {
            	    // InternalLitMan.g:79:3: (lv_literatur_0_0= ruleLitTypes )
            	    // InternalLitMan.g:80:4: lv_literatur_0_0= ruleLitTypes
            	    {

            	    				newCompositeNode(grammarAccess.getLitManAccess().getLiteraturLitTypesParserRuleCall_0());
            	    			
            	    pushFollow(FOLLOW_3);
            	    lv_literatur_0_0=ruleLitTypes();

            	    state._fsp--;


            	    				if (current==null) {
            	    					current = createModelElementForParent(grammarAccess.getLitManRule());
            	    				}
            	    				add(
            	    					current,
            	    					"literatur",
            	    					lv_literatur_0_0,
            	    					"org.xtext.htwg.LitMan.LitTypes");
            	    				afterParserOrEnumRuleCall();
            	    			

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
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
    // $ANTLR end "ruleLitMan"


    // $ANTLR start "entryRuleLitTypes"
    // InternalLitMan.g:100:1: entryRuleLitTypes returns [EObject current=null] : iv_ruleLitTypes= ruleLitTypes EOF ;
    public final EObject entryRuleLitTypes() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLitTypes = null;


        try {
            // InternalLitMan.g:100:49: (iv_ruleLitTypes= ruleLitTypes EOF )
            // InternalLitMan.g:101:2: iv_ruleLitTypes= ruleLitTypes EOF
            {
             newCompositeNode(grammarAccess.getLitTypesRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleLitTypes=ruleLitTypes();

            state._fsp--;

             current =iv_ruleLitTypes; 
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
    // $ANTLR end "entryRuleLitTypes"


    // $ANTLR start "ruleLitTypes"
    // InternalLitMan.g:107:1: ruleLitTypes returns [EObject current=null] : (this_Book_0= ruleBook | this_JournalArticle_1= ruleJournalArticle ) ;
    public final EObject ruleLitTypes() throws RecognitionException {
        EObject current = null;

        EObject this_Book_0 = null;

        EObject this_JournalArticle_1 = null;



        	enterRule();

        try {
            // InternalLitMan.g:113:2: ( (this_Book_0= ruleBook | this_JournalArticle_1= ruleJournalArticle ) )
            // InternalLitMan.g:114:2: (this_Book_0= ruleBook | this_JournalArticle_1= ruleJournalArticle )
            {
            // InternalLitMan.g:114:2: (this_Book_0= ruleBook | this_JournalArticle_1= ruleJournalArticle )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==11) ) {
                alt2=1;
            }
            else if ( (LA2_0==21) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // InternalLitMan.g:115:3: this_Book_0= ruleBook
                    {

                    			newCompositeNode(grammarAccess.getLitTypesAccess().getBookParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_Book_0=ruleBook();

                    state._fsp--;


                    			current = this_Book_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalLitMan.g:124:3: this_JournalArticle_1= ruleJournalArticle
                    {

                    			newCompositeNode(grammarAccess.getLitTypesAccess().getJournalArticleParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_JournalArticle_1=ruleJournalArticle();

                    state._fsp--;


                    			current = this_JournalArticle_1;
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
    // $ANTLR end "ruleLitTypes"


    // $ANTLR start "entryRuleBook"
    // InternalLitMan.g:136:1: entryRuleBook returns [EObject current=null] : iv_ruleBook= ruleBook EOF ;
    public final EObject entryRuleBook() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBook = null;


        try {
            // InternalLitMan.g:136:45: (iv_ruleBook= ruleBook EOF )
            // InternalLitMan.g:137:2: iv_ruleBook= ruleBook EOF
            {
             newCompositeNode(grammarAccess.getBookRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleBook=ruleBook();

            state._fsp--;

             current =iv_ruleBook; 
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
    // $ANTLR end "entryRuleBook"


    // $ANTLR start "ruleBook"
    // InternalLitMan.g:143:1: ruleBook returns [EObject current=null] : (otherlv_0= 'Book' otherlv_1= '{' otherlv_2= 'Title' otherlv_3= '=>' ( (lv_title_4_0= RULE_STRING ) ) otherlv_5= 'Authors' otherlv_6= '=>' otherlv_7= '[' ( (lv_authors_8_0= ruleListAuthors ) ) otherlv_9= ']' otherlv_10= 'Pages' otherlv_11= '=>' ( ( (lv_pages_12_1= rulePageSingle | lv_pages_12_2= rulePageRange ) ) ) otherlv_13= 'Date' otherlv_14= '=>' ( ( (lv_date_15_1= ruleYear | lv_date_15_2= ruleDate ) ) ) otherlv_16= '}' ) ;
    public final EObject ruleBook() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token lv_title_4_0=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        Token otherlv_14=null;
        Token otherlv_16=null;
        EObject lv_authors_8_0 = null;

        AntlrDatatypeRuleToken lv_pages_12_1 = null;

        AntlrDatatypeRuleToken lv_pages_12_2 = null;

        AntlrDatatypeRuleToken lv_date_15_1 = null;

        AntlrDatatypeRuleToken lv_date_15_2 = null;



        	enterRule();

        try {
            // InternalLitMan.g:149:2: ( (otherlv_0= 'Book' otherlv_1= '{' otherlv_2= 'Title' otherlv_3= '=>' ( (lv_title_4_0= RULE_STRING ) ) otherlv_5= 'Authors' otherlv_6= '=>' otherlv_7= '[' ( (lv_authors_8_0= ruleListAuthors ) ) otherlv_9= ']' otherlv_10= 'Pages' otherlv_11= '=>' ( ( (lv_pages_12_1= rulePageSingle | lv_pages_12_2= rulePageRange ) ) ) otherlv_13= 'Date' otherlv_14= '=>' ( ( (lv_date_15_1= ruleYear | lv_date_15_2= ruleDate ) ) ) otherlv_16= '}' ) )
            // InternalLitMan.g:150:2: (otherlv_0= 'Book' otherlv_1= '{' otherlv_2= 'Title' otherlv_3= '=>' ( (lv_title_4_0= RULE_STRING ) ) otherlv_5= 'Authors' otherlv_6= '=>' otherlv_7= '[' ( (lv_authors_8_0= ruleListAuthors ) ) otherlv_9= ']' otherlv_10= 'Pages' otherlv_11= '=>' ( ( (lv_pages_12_1= rulePageSingle | lv_pages_12_2= rulePageRange ) ) ) otherlv_13= 'Date' otherlv_14= '=>' ( ( (lv_date_15_1= ruleYear | lv_date_15_2= ruleDate ) ) ) otherlv_16= '}' )
            {
            // InternalLitMan.g:150:2: (otherlv_0= 'Book' otherlv_1= '{' otherlv_2= 'Title' otherlv_3= '=>' ( (lv_title_4_0= RULE_STRING ) ) otherlv_5= 'Authors' otherlv_6= '=>' otherlv_7= '[' ( (lv_authors_8_0= ruleListAuthors ) ) otherlv_9= ']' otherlv_10= 'Pages' otherlv_11= '=>' ( ( (lv_pages_12_1= rulePageSingle | lv_pages_12_2= rulePageRange ) ) ) otherlv_13= 'Date' otherlv_14= '=>' ( ( (lv_date_15_1= ruleYear | lv_date_15_2= ruleDate ) ) ) otherlv_16= '}' )
            // InternalLitMan.g:151:3: otherlv_0= 'Book' otherlv_1= '{' otherlv_2= 'Title' otherlv_3= '=>' ( (lv_title_4_0= RULE_STRING ) ) otherlv_5= 'Authors' otherlv_6= '=>' otherlv_7= '[' ( (lv_authors_8_0= ruleListAuthors ) ) otherlv_9= ']' otherlv_10= 'Pages' otherlv_11= '=>' ( ( (lv_pages_12_1= rulePageSingle | lv_pages_12_2= rulePageRange ) ) ) otherlv_13= 'Date' otherlv_14= '=>' ( ( (lv_date_15_1= ruleYear | lv_date_15_2= ruleDate ) ) ) otherlv_16= '}'
            {
            otherlv_0=(Token)match(input,11,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getBookAccess().getBookKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_5); 

            			newLeafNode(otherlv_1, grammarAccess.getBookAccess().getLeftCurlyBracketKeyword_1());
            		
            otherlv_2=(Token)match(input,13,FOLLOW_6); 

            			newLeafNode(otherlv_2, grammarAccess.getBookAccess().getTitleKeyword_2());
            		
            otherlv_3=(Token)match(input,14,FOLLOW_7); 

            			newLeafNode(otherlv_3, grammarAccess.getBookAccess().getEqualsSignGreaterThanSignKeyword_3());
            		
            // InternalLitMan.g:167:3: ( (lv_title_4_0= RULE_STRING ) )
            // InternalLitMan.g:168:4: (lv_title_4_0= RULE_STRING )
            {
            // InternalLitMan.g:168:4: (lv_title_4_0= RULE_STRING )
            // InternalLitMan.g:169:5: lv_title_4_0= RULE_STRING
            {
            lv_title_4_0=(Token)match(input,RULE_STRING,FOLLOW_8); 

            					newLeafNode(lv_title_4_0, grammarAccess.getBookAccess().getTitleSTRINGTerminalRuleCall_4_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getBookRule());
            					}
            					setWithLastConsumed(
            						current,
            						"title",
            						lv_title_4_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_5=(Token)match(input,15,FOLLOW_6); 

            			newLeafNode(otherlv_5, grammarAccess.getBookAccess().getAuthorsKeyword_5());
            		
            otherlv_6=(Token)match(input,14,FOLLOW_9); 

            			newLeafNode(otherlv_6, grammarAccess.getBookAccess().getEqualsSignGreaterThanSignKeyword_6());
            		
            otherlv_7=(Token)match(input,16,FOLLOW_10); 

            			newLeafNode(otherlv_7, grammarAccess.getBookAccess().getLeftSquareBracketKeyword_7());
            		
            // InternalLitMan.g:197:3: ( (lv_authors_8_0= ruleListAuthors ) )
            // InternalLitMan.g:198:4: (lv_authors_8_0= ruleListAuthors )
            {
            // InternalLitMan.g:198:4: (lv_authors_8_0= ruleListAuthors )
            // InternalLitMan.g:199:5: lv_authors_8_0= ruleListAuthors
            {

            					newCompositeNode(grammarAccess.getBookAccess().getAuthorsListAuthorsParserRuleCall_8_0());
            				
            pushFollow(FOLLOW_11);
            lv_authors_8_0=ruleListAuthors();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getBookRule());
            					}
            					set(
            						current,
            						"authors",
            						lv_authors_8_0,
            						"org.xtext.htwg.LitMan.ListAuthors");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_9=(Token)match(input,17,FOLLOW_12); 

            			newLeafNode(otherlv_9, grammarAccess.getBookAccess().getRightSquareBracketKeyword_9());
            		
            otherlv_10=(Token)match(input,18,FOLLOW_6); 

            			newLeafNode(otherlv_10, grammarAccess.getBookAccess().getPagesKeyword_10());
            		
            otherlv_11=(Token)match(input,14,FOLLOW_13); 

            			newLeafNode(otherlv_11, grammarAccess.getBookAccess().getEqualsSignGreaterThanSignKeyword_11());
            		
            // InternalLitMan.g:228:3: ( ( (lv_pages_12_1= rulePageSingle | lv_pages_12_2= rulePageRange ) ) )
            // InternalLitMan.g:229:4: ( (lv_pages_12_1= rulePageSingle | lv_pages_12_2= rulePageRange ) )
            {
            // InternalLitMan.g:229:4: ( (lv_pages_12_1= rulePageSingle | lv_pages_12_2= rulePageRange ) )
            // InternalLitMan.g:230:5: (lv_pages_12_1= rulePageSingle | lv_pages_12_2= rulePageRange )
            {
            // InternalLitMan.g:230:5: (lv_pages_12_1= rulePageSingle | lv_pages_12_2= rulePageRange )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==RULE_INT) ) {
                int LA3_1 = input.LA(2);

                if ( (LA3_1==27) ) {
                    alt3=2;
                }
                else if ( (LA3_1==19) ) {
                    alt3=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 3, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalLitMan.g:231:6: lv_pages_12_1= rulePageSingle
                    {

                    						newCompositeNode(grammarAccess.getBookAccess().getPagesPageSingleParserRuleCall_12_0_0());
                    					
                    pushFollow(FOLLOW_14);
                    lv_pages_12_1=rulePageSingle();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getBookRule());
                    						}
                    						set(
                    							current,
                    							"pages",
                    							lv_pages_12_1,
                    							"org.xtext.htwg.LitMan.PageSingle");
                    						afterParserOrEnumRuleCall();
                    					

                    }
                    break;
                case 2 :
                    // InternalLitMan.g:247:6: lv_pages_12_2= rulePageRange
                    {

                    						newCompositeNode(grammarAccess.getBookAccess().getPagesPageRangeParserRuleCall_12_0_1());
                    					
                    pushFollow(FOLLOW_14);
                    lv_pages_12_2=rulePageRange();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getBookRule());
                    						}
                    						set(
                    							current,
                    							"pages",
                    							lv_pages_12_2,
                    							"org.xtext.htwg.LitMan.PageRange");
                    						afterParserOrEnumRuleCall();
                    					

                    }
                    break;

            }


            }


            }

            otherlv_13=(Token)match(input,19,FOLLOW_6); 

            			newLeafNode(otherlv_13, grammarAccess.getBookAccess().getDateKeyword_13());
            		
            otherlv_14=(Token)match(input,14,FOLLOW_13); 

            			newLeafNode(otherlv_14, grammarAccess.getBookAccess().getEqualsSignGreaterThanSignKeyword_14());
            		
            // InternalLitMan.g:273:3: ( ( (lv_date_15_1= ruleYear | lv_date_15_2= ruleDate ) ) )
            // InternalLitMan.g:274:4: ( (lv_date_15_1= ruleYear | lv_date_15_2= ruleDate ) )
            {
            // InternalLitMan.g:274:4: ( (lv_date_15_1= ruleYear | lv_date_15_2= ruleDate ) )
            // InternalLitMan.g:275:5: (lv_date_15_1= ruleYear | lv_date_15_2= ruleDate )
            {
            // InternalLitMan.g:275:5: (lv_date_15_1= ruleYear | lv_date_15_2= ruleDate )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==RULE_INT) ) {
                int LA4_1 = input.LA(2);

                if ( (LA4_1==28) ) {
                    alt4=2;
                }
                else if ( (LA4_1==20) ) {
                    alt4=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 4, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // InternalLitMan.g:276:6: lv_date_15_1= ruleYear
                    {

                    						newCompositeNode(grammarAccess.getBookAccess().getDateYearParserRuleCall_15_0_0());
                    					
                    pushFollow(FOLLOW_15);
                    lv_date_15_1=ruleYear();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getBookRule());
                    						}
                    						set(
                    							current,
                    							"date",
                    							lv_date_15_1,
                    							"org.xtext.htwg.LitMan.Year");
                    						afterParserOrEnumRuleCall();
                    					

                    }
                    break;
                case 2 :
                    // InternalLitMan.g:292:6: lv_date_15_2= ruleDate
                    {

                    						newCompositeNode(grammarAccess.getBookAccess().getDateDateParserRuleCall_15_0_1());
                    					
                    pushFollow(FOLLOW_15);
                    lv_date_15_2=ruleDate();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getBookRule());
                    						}
                    						set(
                    							current,
                    							"date",
                    							lv_date_15_2,
                    							"org.xtext.htwg.LitMan.Date");
                    						afterParserOrEnumRuleCall();
                    					

                    }
                    break;

            }


            }


            }

            otherlv_16=(Token)match(input,20,FOLLOW_2); 

            			newLeafNode(otherlv_16, grammarAccess.getBookAccess().getRightCurlyBracketKeyword_16());
            		

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
    // $ANTLR end "ruleBook"


    // $ANTLR start "entryRuleJournalArticle"
    // InternalLitMan.g:318:1: entryRuleJournalArticle returns [EObject current=null] : iv_ruleJournalArticle= ruleJournalArticle EOF ;
    public final EObject entryRuleJournalArticle() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJournalArticle = null;


        try {
            // InternalLitMan.g:318:55: (iv_ruleJournalArticle= ruleJournalArticle EOF )
            // InternalLitMan.g:319:2: iv_ruleJournalArticle= ruleJournalArticle EOF
            {
             newCompositeNode(grammarAccess.getJournalArticleRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleJournalArticle=ruleJournalArticle();

            state._fsp--;

             current =iv_ruleJournalArticle; 
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
    // $ANTLR end "entryRuleJournalArticle"


    // $ANTLR start "ruleJournalArticle"
    // InternalLitMan.g:325:1: ruleJournalArticle returns [EObject current=null] : (otherlv_0= 'Article' otherlv_1= '{' otherlv_2= 'Title' otherlv_3= '=>' ( (lv_title_4_0= RULE_STRING ) ) otherlv_5= 'Authors' otherlv_6= '=>' otherlv_7= '[' ( (lv_authors_8_0= ruleListAuthors ) ) otherlv_9= ']' otherlv_10= 'Volume' otherlv_11= '=>' ( (lv_volume_12_0= RULE_INT ) ) otherlv_13= 'Issue' otherlv_14= '=>' ( (lv_issue_15_0= RULE_INT ) ) otherlv_16= 'Pages' otherlv_17= '=>' ( ( (lv_pages_18_1= rulePageSingle | lv_pages_18_2= rulePageRange ) ) ) otherlv_19= 'Date' otherlv_20= '=>' ( ( (lv_date_21_1= ruleYear | lv_date_21_2= ruleDate ) ) ) otherlv_22= '}' ) ;
    public final EObject ruleJournalArticle() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token lv_title_4_0=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token lv_volume_12_0=null;
        Token otherlv_13=null;
        Token otherlv_14=null;
        Token lv_issue_15_0=null;
        Token otherlv_16=null;
        Token otherlv_17=null;
        Token otherlv_19=null;
        Token otherlv_20=null;
        Token otherlv_22=null;
        EObject lv_authors_8_0 = null;

        AntlrDatatypeRuleToken lv_pages_18_1 = null;

        AntlrDatatypeRuleToken lv_pages_18_2 = null;

        AntlrDatatypeRuleToken lv_date_21_1 = null;

        AntlrDatatypeRuleToken lv_date_21_2 = null;



        	enterRule();

        try {
            // InternalLitMan.g:331:2: ( (otherlv_0= 'Article' otherlv_1= '{' otherlv_2= 'Title' otherlv_3= '=>' ( (lv_title_4_0= RULE_STRING ) ) otherlv_5= 'Authors' otherlv_6= '=>' otherlv_7= '[' ( (lv_authors_8_0= ruleListAuthors ) ) otherlv_9= ']' otherlv_10= 'Volume' otherlv_11= '=>' ( (lv_volume_12_0= RULE_INT ) ) otherlv_13= 'Issue' otherlv_14= '=>' ( (lv_issue_15_0= RULE_INT ) ) otherlv_16= 'Pages' otherlv_17= '=>' ( ( (lv_pages_18_1= rulePageSingle | lv_pages_18_2= rulePageRange ) ) ) otherlv_19= 'Date' otherlv_20= '=>' ( ( (lv_date_21_1= ruleYear | lv_date_21_2= ruleDate ) ) ) otherlv_22= '}' ) )
            // InternalLitMan.g:332:2: (otherlv_0= 'Article' otherlv_1= '{' otherlv_2= 'Title' otherlv_3= '=>' ( (lv_title_4_0= RULE_STRING ) ) otherlv_5= 'Authors' otherlv_6= '=>' otherlv_7= '[' ( (lv_authors_8_0= ruleListAuthors ) ) otherlv_9= ']' otherlv_10= 'Volume' otherlv_11= '=>' ( (lv_volume_12_0= RULE_INT ) ) otherlv_13= 'Issue' otherlv_14= '=>' ( (lv_issue_15_0= RULE_INT ) ) otherlv_16= 'Pages' otherlv_17= '=>' ( ( (lv_pages_18_1= rulePageSingle | lv_pages_18_2= rulePageRange ) ) ) otherlv_19= 'Date' otherlv_20= '=>' ( ( (lv_date_21_1= ruleYear | lv_date_21_2= ruleDate ) ) ) otherlv_22= '}' )
            {
            // InternalLitMan.g:332:2: (otherlv_0= 'Article' otherlv_1= '{' otherlv_2= 'Title' otherlv_3= '=>' ( (lv_title_4_0= RULE_STRING ) ) otherlv_5= 'Authors' otherlv_6= '=>' otherlv_7= '[' ( (lv_authors_8_0= ruleListAuthors ) ) otherlv_9= ']' otherlv_10= 'Volume' otherlv_11= '=>' ( (lv_volume_12_0= RULE_INT ) ) otherlv_13= 'Issue' otherlv_14= '=>' ( (lv_issue_15_0= RULE_INT ) ) otherlv_16= 'Pages' otherlv_17= '=>' ( ( (lv_pages_18_1= rulePageSingle | lv_pages_18_2= rulePageRange ) ) ) otherlv_19= 'Date' otherlv_20= '=>' ( ( (lv_date_21_1= ruleYear | lv_date_21_2= ruleDate ) ) ) otherlv_22= '}' )
            // InternalLitMan.g:333:3: otherlv_0= 'Article' otherlv_1= '{' otherlv_2= 'Title' otherlv_3= '=>' ( (lv_title_4_0= RULE_STRING ) ) otherlv_5= 'Authors' otherlv_6= '=>' otherlv_7= '[' ( (lv_authors_8_0= ruleListAuthors ) ) otherlv_9= ']' otherlv_10= 'Volume' otherlv_11= '=>' ( (lv_volume_12_0= RULE_INT ) ) otherlv_13= 'Issue' otherlv_14= '=>' ( (lv_issue_15_0= RULE_INT ) ) otherlv_16= 'Pages' otherlv_17= '=>' ( ( (lv_pages_18_1= rulePageSingle | lv_pages_18_2= rulePageRange ) ) ) otherlv_19= 'Date' otherlv_20= '=>' ( ( (lv_date_21_1= ruleYear | lv_date_21_2= ruleDate ) ) ) otherlv_22= '}'
            {
            otherlv_0=(Token)match(input,21,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getJournalArticleAccess().getArticleKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_5); 

            			newLeafNode(otherlv_1, grammarAccess.getJournalArticleAccess().getLeftCurlyBracketKeyword_1());
            		
            otherlv_2=(Token)match(input,13,FOLLOW_6); 

            			newLeafNode(otherlv_2, grammarAccess.getJournalArticleAccess().getTitleKeyword_2());
            		
            otherlv_3=(Token)match(input,14,FOLLOW_7); 

            			newLeafNode(otherlv_3, grammarAccess.getJournalArticleAccess().getEqualsSignGreaterThanSignKeyword_3());
            		
            // InternalLitMan.g:349:3: ( (lv_title_4_0= RULE_STRING ) )
            // InternalLitMan.g:350:4: (lv_title_4_0= RULE_STRING )
            {
            // InternalLitMan.g:350:4: (lv_title_4_0= RULE_STRING )
            // InternalLitMan.g:351:5: lv_title_4_0= RULE_STRING
            {
            lv_title_4_0=(Token)match(input,RULE_STRING,FOLLOW_8); 

            					newLeafNode(lv_title_4_0, grammarAccess.getJournalArticleAccess().getTitleSTRINGTerminalRuleCall_4_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getJournalArticleRule());
            					}
            					setWithLastConsumed(
            						current,
            						"title",
            						lv_title_4_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_5=(Token)match(input,15,FOLLOW_6); 

            			newLeafNode(otherlv_5, grammarAccess.getJournalArticleAccess().getAuthorsKeyword_5());
            		
            otherlv_6=(Token)match(input,14,FOLLOW_9); 

            			newLeafNode(otherlv_6, grammarAccess.getJournalArticleAccess().getEqualsSignGreaterThanSignKeyword_6());
            		
            otherlv_7=(Token)match(input,16,FOLLOW_10); 

            			newLeafNode(otherlv_7, grammarAccess.getJournalArticleAccess().getLeftSquareBracketKeyword_7());
            		
            // InternalLitMan.g:379:3: ( (lv_authors_8_0= ruleListAuthors ) )
            // InternalLitMan.g:380:4: (lv_authors_8_0= ruleListAuthors )
            {
            // InternalLitMan.g:380:4: (lv_authors_8_0= ruleListAuthors )
            // InternalLitMan.g:381:5: lv_authors_8_0= ruleListAuthors
            {

            					newCompositeNode(grammarAccess.getJournalArticleAccess().getAuthorsListAuthorsParserRuleCall_8_0());
            				
            pushFollow(FOLLOW_11);
            lv_authors_8_0=ruleListAuthors();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getJournalArticleRule());
            					}
            					set(
            						current,
            						"authors",
            						lv_authors_8_0,
            						"org.xtext.htwg.LitMan.ListAuthors");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_9=(Token)match(input,17,FOLLOW_16); 

            			newLeafNode(otherlv_9, grammarAccess.getJournalArticleAccess().getRightSquareBracketKeyword_9());
            		
            otherlv_10=(Token)match(input,22,FOLLOW_6); 

            			newLeafNode(otherlv_10, grammarAccess.getJournalArticleAccess().getVolumeKeyword_10());
            		
            otherlv_11=(Token)match(input,14,FOLLOW_13); 

            			newLeafNode(otherlv_11, grammarAccess.getJournalArticleAccess().getEqualsSignGreaterThanSignKeyword_11());
            		
            // InternalLitMan.g:410:3: ( (lv_volume_12_0= RULE_INT ) )
            // InternalLitMan.g:411:4: (lv_volume_12_0= RULE_INT )
            {
            // InternalLitMan.g:411:4: (lv_volume_12_0= RULE_INT )
            // InternalLitMan.g:412:5: lv_volume_12_0= RULE_INT
            {
            lv_volume_12_0=(Token)match(input,RULE_INT,FOLLOW_17); 

            					newLeafNode(lv_volume_12_0, grammarAccess.getJournalArticleAccess().getVolumeINTTerminalRuleCall_12_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getJournalArticleRule());
            					}
            					setWithLastConsumed(
            						current,
            						"volume",
            						lv_volume_12_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            otherlv_13=(Token)match(input,23,FOLLOW_6); 

            			newLeafNode(otherlv_13, grammarAccess.getJournalArticleAccess().getIssueKeyword_13());
            		
            otherlv_14=(Token)match(input,14,FOLLOW_13); 

            			newLeafNode(otherlv_14, grammarAccess.getJournalArticleAccess().getEqualsSignGreaterThanSignKeyword_14());
            		
            // InternalLitMan.g:436:3: ( (lv_issue_15_0= RULE_INT ) )
            // InternalLitMan.g:437:4: (lv_issue_15_0= RULE_INT )
            {
            // InternalLitMan.g:437:4: (lv_issue_15_0= RULE_INT )
            // InternalLitMan.g:438:5: lv_issue_15_0= RULE_INT
            {
            lv_issue_15_0=(Token)match(input,RULE_INT,FOLLOW_12); 

            					newLeafNode(lv_issue_15_0, grammarAccess.getJournalArticleAccess().getIssueINTTerminalRuleCall_15_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getJournalArticleRule());
            					}
            					setWithLastConsumed(
            						current,
            						"issue",
            						lv_issue_15_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            otherlv_16=(Token)match(input,18,FOLLOW_6); 

            			newLeafNode(otherlv_16, grammarAccess.getJournalArticleAccess().getPagesKeyword_16());
            		
            otherlv_17=(Token)match(input,14,FOLLOW_13); 

            			newLeafNode(otherlv_17, grammarAccess.getJournalArticleAccess().getEqualsSignGreaterThanSignKeyword_17());
            		
            // InternalLitMan.g:462:3: ( ( (lv_pages_18_1= rulePageSingle | lv_pages_18_2= rulePageRange ) ) )
            // InternalLitMan.g:463:4: ( (lv_pages_18_1= rulePageSingle | lv_pages_18_2= rulePageRange ) )
            {
            // InternalLitMan.g:463:4: ( (lv_pages_18_1= rulePageSingle | lv_pages_18_2= rulePageRange ) )
            // InternalLitMan.g:464:5: (lv_pages_18_1= rulePageSingle | lv_pages_18_2= rulePageRange )
            {
            // InternalLitMan.g:464:5: (lv_pages_18_1= rulePageSingle | lv_pages_18_2= rulePageRange )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==RULE_INT) ) {
                int LA5_1 = input.LA(2);

                if ( (LA5_1==27) ) {
                    alt5=2;
                }
                else if ( (LA5_1==19) ) {
                    alt5=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 5, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // InternalLitMan.g:465:6: lv_pages_18_1= rulePageSingle
                    {

                    						newCompositeNode(grammarAccess.getJournalArticleAccess().getPagesPageSingleParserRuleCall_18_0_0());
                    					
                    pushFollow(FOLLOW_14);
                    lv_pages_18_1=rulePageSingle();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getJournalArticleRule());
                    						}
                    						set(
                    							current,
                    							"pages",
                    							lv_pages_18_1,
                    							"org.xtext.htwg.LitMan.PageSingle");
                    						afterParserOrEnumRuleCall();
                    					

                    }
                    break;
                case 2 :
                    // InternalLitMan.g:481:6: lv_pages_18_2= rulePageRange
                    {

                    						newCompositeNode(grammarAccess.getJournalArticleAccess().getPagesPageRangeParserRuleCall_18_0_1());
                    					
                    pushFollow(FOLLOW_14);
                    lv_pages_18_2=rulePageRange();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getJournalArticleRule());
                    						}
                    						set(
                    							current,
                    							"pages",
                    							lv_pages_18_2,
                    							"org.xtext.htwg.LitMan.PageRange");
                    						afterParserOrEnumRuleCall();
                    					

                    }
                    break;

            }


            }


            }

            otherlv_19=(Token)match(input,19,FOLLOW_6); 

            			newLeafNode(otherlv_19, grammarAccess.getJournalArticleAccess().getDateKeyword_19());
            		
            otherlv_20=(Token)match(input,14,FOLLOW_13); 

            			newLeafNode(otherlv_20, grammarAccess.getJournalArticleAccess().getEqualsSignGreaterThanSignKeyword_20());
            		
            // InternalLitMan.g:507:3: ( ( (lv_date_21_1= ruleYear | lv_date_21_2= ruleDate ) ) )
            // InternalLitMan.g:508:4: ( (lv_date_21_1= ruleYear | lv_date_21_2= ruleDate ) )
            {
            // InternalLitMan.g:508:4: ( (lv_date_21_1= ruleYear | lv_date_21_2= ruleDate ) )
            // InternalLitMan.g:509:5: (lv_date_21_1= ruleYear | lv_date_21_2= ruleDate )
            {
            // InternalLitMan.g:509:5: (lv_date_21_1= ruleYear | lv_date_21_2= ruleDate )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==RULE_INT) ) {
                int LA6_1 = input.LA(2);

                if ( (LA6_1==20) ) {
                    alt6=1;
                }
                else if ( (LA6_1==28) ) {
                    alt6=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 6, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // InternalLitMan.g:510:6: lv_date_21_1= ruleYear
                    {

                    						newCompositeNode(grammarAccess.getJournalArticleAccess().getDateYearParserRuleCall_21_0_0());
                    					
                    pushFollow(FOLLOW_15);
                    lv_date_21_1=ruleYear();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getJournalArticleRule());
                    						}
                    						set(
                    							current,
                    							"date",
                    							lv_date_21_1,
                    							"org.xtext.htwg.LitMan.Year");
                    						afterParserOrEnumRuleCall();
                    					

                    }
                    break;
                case 2 :
                    // InternalLitMan.g:526:6: lv_date_21_2= ruleDate
                    {

                    						newCompositeNode(grammarAccess.getJournalArticleAccess().getDateDateParserRuleCall_21_0_1());
                    					
                    pushFollow(FOLLOW_15);
                    lv_date_21_2=ruleDate();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getJournalArticleRule());
                    						}
                    						set(
                    							current,
                    							"date",
                    							lv_date_21_2,
                    							"org.xtext.htwg.LitMan.Date");
                    						afterParserOrEnumRuleCall();
                    					

                    }
                    break;

            }


            }


            }

            otherlv_22=(Token)match(input,20,FOLLOW_2); 

            			newLeafNode(otherlv_22, grammarAccess.getJournalArticleAccess().getRightCurlyBracketKeyword_22());
            		

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
    // $ANTLR end "ruleJournalArticle"


    // $ANTLR start "entryRuleAuthor"
    // InternalLitMan.g:552:1: entryRuleAuthor returns [EObject current=null] : iv_ruleAuthor= ruleAuthor EOF ;
    public final EObject entryRuleAuthor() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAuthor = null;


        try {
            // InternalLitMan.g:552:47: (iv_ruleAuthor= ruleAuthor EOF )
            // InternalLitMan.g:553:2: iv_ruleAuthor= ruleAuthor EOF
            {
             newCompositeNode(grammarAccess.getAuthorRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAuthor=ruleAuthor();

            state._fsp--;

             current =iv_ruleAuthor; 
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
    // $ANTLR end "entryRuleAuthor"


    // $ANTLR start "ruleAuthor"
    // InternalLitMan.g:559:1: ruleAuthor returns [EObject current=null] : (otherlv_0= 'f' ( (lv_firstname_1_0= RULE_STRING ) ) otherlv_2= 'l' ( (lv_lastname_3_0= RULE_STRING ) ) ) ;
    public final EObject ruleAuthor() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_firstname_1_0=null;
        Token otherlv_2=null;
        Token lv_lastname_3_0=null;


        	enterRule();

        try {
            // InternalLitMan.g:565:2: ( (otherlv_0= 'f' ( (lv_firstname_1_0= RULE_STRING ) ) otherlv_2= 'l' ( (lv_lastname_3_0= RULE_STRING ) ) ) )
            // InternalLitMan.g:566:2: (otherlv_0= 'f' ( (lv_firstname_1_0= RULE_STRING ) ) otherlv_2= 'l' ( (lv_lastname_3_0= RULE_STRING ) ) )
            {
            // InternalLitMan.g:566:2: (otherlv_0= 'f' ( (lv_firstname_1_0= RULE_STRING ) ) otherlv_2= 'l' ( (lv_lastname_3_0= RULE_STRING ) ) )
            // InternalLitMan.g:567:3: otherlv_0= 'f' ( (lv_firstname_1_0= RULE_STRING ) ) otherlv_2= 'l' ( (lv_lastname_3_0= RULE_STRING ) )
            {
            otherlv_0=(Token)match(input,24,FOLLOW_7); 

            			newLeafNode(otherlv_0, grammarAccess.getAuthorAccess().getFKeyword_0());
            		
            // InternalLitMan.g:571:3: ( (lv_firstname_1_0= RULE_STRING ) )
            // InternalLitMan.g:572:4: (lv_firstname_1_0= RULE_STRING )
            {
            // InternalLitMan.g:572:4: (lv_firstname_1_0= RULE_STRING )
            // InternalLitMan.g:573:5: lv_firstname_1_0= RULE_STRING
            {
            lv_firstname_1_0=(Token)match(input,RULE_STRING,FOLLOW_18); 

            					newLeafNode(lv_firstname_1_0, grammarAccess.getAuthorAccess().getFirstnameSTRINGTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getAuthorRule());
            					}
            					setWithLastConsumed(
            						current,
            						"firstname",
            						lv_firstname_1_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_2=(Token)match(input,25,FOLLOW_7); 

            			newLeafNode(otherlv_2, grammarAccess.getAuthorAccess().getLKeyword_2());
            		
            // InternalLitMan.g:593:3: ( (lv_lastname_3_0= RULE_STRING ) )
            // InternalLitMan.g:594:4: (lv_lastname_3_0= RULE_STRING )
            {
            // InternalLitMan.g:594:4: (lv_lastname_3_0= RULE_STRING )
            // InternalLitMan.g:595:5: lv_lastname_3_0= RULE_STRING
            {
            lv_lastname_3_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

            					newLeafNode(lv_lastname_3_0, grammarAccess.getAuthorAccess().getLastnameSTRINGTerminalRuleCall_3_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getAuthorRule());
            					}
            					setWithLastConsumed(
            						current,
            						"lastname",
            						lv_lastname_3_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

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
    // $ANTLR end "ruleAuthor"


    // $ANTLR start "entryRuleListAuthors"
    // InternalLitMan.g:615:1: entryRuleListAuthors returns [EObject current=null] : iv_ruleListAuthors= ruleListAuthors EOF ;
    public final EObject entryRuleListAuthors() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleListAuthors = null;


        try {
            // InternalLitMan.g:615:52: (iv_ruleListAuthors= ruleListAuthors EOF )
            // InternalLitMan.g:616:2: iv_ruleListAuthors= ruleListAuthors EOF
            {
             newCompositeNode(grammarAccess.getListAuthorsRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleListAuthors=ruleListAuthors();

            state._fsp--;

             current =iv_ruleListAuthors; 
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
    // $ANTLR end "entryRuleListAuthors"


    // $ANTLR start "ruleListAuthors"
    // InternalLitMan.g:622:1: ruleListAuthors returns [EObject current=null] : ( ( (lv_authors_0_0= ruleAuthor ) ) (otherlv_1= ',' )? )* ;
    public final EObject ruleListAuthors() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_authors_0_0 = null;



        	enterRule();

        try {
            // InternalLitMan.g:628:2: ( ( ( (lv_authors_0_0= ruleAuthor ) ) (otherlv_1= ',' )? )* )
            // InternalLitMan.g:629:2: ( ( (lv_authors_0_0= ruleAuthor ) ) (otherlv_1= ',' )? )*
            {
            // InternalLitMan.g:629:2: ( ( (lv_authors_0_0= ruleAuthor ) ) (otherlv_1= ',' )? )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==24) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalLitMan.g:630:3: ( (lv_authors_0_0= ruleAuthor ) ) (otherlv_1= ',' )?
            	    {
            	    // InternalLitMan.g:630:3: ( (lv_authors_0_0= ruleAuthor ) )
            	    // InternalLitMan.g:631:4: (lv_authors_0_0= ruleAuthor )
            	    {
            	    // InternalLitMan.g:631:4: (lv_authors_0_0= ruleAuthor )
            	    // InternalLitMan.g:632:5: lv_authors_0_0= ruleAuthor
            	    {

            	    					newCompositeNode(grammarAccess.getListAuthorsAccess().getAuthorsAuthorParserRuleCall_0_0());
            	    				
            	    pushFollow(FOLLOW_19);
            	    lv_authors_0_0=ruleAuthor();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getListAuthorsRule());
            	    					}
            	    					add(
            	    						current,
            	    						"authors",
            	    						lv_authors_0_0,
            	    						"org.xtext.htwg.LitMan.Author");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }

            	    // InternalLitMan.g:649:3: (otherlv_1= ',' )?
            	    int alt7=2;
            	    int LA7_0 = input.LA(1);

            	    if ( (LA7_0==26) ) {
            	        alt7=1;
            	    }
            	    switch (alt7) {
            	        case 1 :
            	            // InternalLitMan.g:650:4: otherlv_1= ','
            	            {
            	            otherlv_1=(Token)match(input,26,FOLLOW_20); 

            	            				newLeafNode(otherlv_1, grammarAccess.getListAuthorsAccess().getCommaKeyword_1());
            	            			

            	            }
            	            break;

            	    }


            	    }
            	    break;

            	default :
            	    break loop8;
                }
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
    // $ANTLR end "ruleListAuthors"


    // $ANTLR start "entryRulePageSingle"
    // InternalLitMan.g:659:1: entryRulePageSingle returns [String current=null] : iv_rulePageSingle= rulePageSingle EOF ;
    public final String entryRulePageSingle() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulePageSingle = null;


        try {
            // InternalLitMan.g:659:50: (iv_rulePageSingle= rulePageSingle EOF )
            // InternalLitMan.g:660:2: iv_rulePageSingle= rulePageSingle EOF
            {
             newCompositeNode(grammarAccess.getPageSingleRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePageSingle=rulePageSingle();

            state._fsp--;

             current =iv_rulePageSingle.getText(); 
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
    // $ANTLR end "entryRulePageSingle"


    // $ANTLR start "rulePageSingle"
    // InternalLitMan.g:666:1: rulePageSingle returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_INT_0= RULE_INT ;
    public final AntlrDatatypeRuleToken rulePageSingle() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_INT_0=null;


        	enterRule();

        try {
            // InternalLitMan.g:672:2: (this_INT_0= RULE_INT )
            // InternalLitMan.g:673:2: this_INT_0= RULE_INT
            {
            this_INT_0=(Token)match(input,RULE_INT,FOLLOW_2); 

            		current.merge(this_INT_0);
            	

            		newLeafNode(this_INT_0, grammarAccess.getPageSingleAccess().getINTTerminalRuleCall());
            	

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
    // $ANTLR end "rulePageSingle"


    // $ANTLR start "entryRulePageRange"
    // InternalLitMan.g:683:1: entryRulePageRange returns [String current=null] : iv_rulePageRange= rulePageRange EOF ;
    public final String entryRulePageRange() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulePageRange = null;


        try {
            // InternalLitMan.g:683:49: (iv_rulePageRange= rulePageRange EOF )
            // InternalLitMan.g:684:2: iv_rulePageRange= rulePageRange EOF
            {
             newCompositeNode(grammarAccess.getPageRangeRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePageRange=rulePageRange();

            state._fsp--;

             current =iv_rulePageRange.getText(); 
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
    // $ANTLR end "entryRulePageRange"


    // $ANTLR start "rulePageRange"
    // InternalLitMan.g:690:1: rulePageRange returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_INT_0= RULE_INT kw= '-' this_INT_2= RULE_INT ) ;
    public final AntlrDatatypeRuleToken rulePageRange() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_INT_0=null;
        Token kw=null;
        Token this_INT_2=null;


        	enterRule();

        try {
            // InternalLitMan.g:696:2: ( (this_INT_0= RULE_INT kw= '-' this_INT_2= RULE_INT ) )
            // InternalLitMan.g:697:2: (this_INT_0= RULE_INT kw= '-' this_INT_2= RULE_INT )
            {
            // InternalLitMan.g:697:2: (this_INT_0= RULE_INT kw= '-' this_INT_2= RULE_INT )
            // InternalLitMan.g:698:3: this_INT_0= RULE_INT kw= '-' this_INT_2= RULE_INT
            {
            this_INT_0=(Token)match(input,RULE_INT,FOLLOW_21); 

            			current.merge(this_INT_0);
            		

            			newLeafNode(this_INT_0, grammarAccess.getPageRangeAccess().getINTTerminalRuleCall_0());
            		
            kw=(Token)match(input,27,FOLLOW_13); 

            			current.merge(kw);
            			newLeafNode(kw, grammarAccess.getPageRangeAccess().getHyphenMinusKeyword_1());
            		
            this_INT_2=(Token)match(input,RULE_INT,FOLLOW_2); 

            			current.merge(this_INT_2);
            		

            			newLeafNode(this_INT_2, grammarAccess.getPageRangeAccess().getINTTerminalRuleCall_2());
            		

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
    // $ANTLR end "rulePageRange"


    // $ANTLR start "entryRuleYear"
    // InternalLitMan.g:721:1: entryRuleYear returns [String current=null] : iv_ruleYear= ruleYear EOF ;
    public final String entryRuleYear() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleYear = null;


        try {
            // InternalLitMan.g:721:44: (iv_ruleYear= ruleYear EOF )
            // InternalLitMan.g:722:2: iv_ruleYear= ruleYear EOF
            {
             newCompositeNode(grammarAccess.getYearRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleYear=ruleYear();

            state._fsp--;

             current =iv_ruleYear.getText(); 
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
    // $ANTLR end "entryRuleYear"


    // $ANTLR start "ruleYear"
    // InternalLitMan.g:728:1: ruleYear returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_INT_0= RULE_INT ;
    public final AntlrDatatypeRuleToken ruleYear() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_INT_0=null;


        	enterRule();

        try {
            // InternalLitMan.g:734:2: (this_INT_0= RULE_INT )
            // InternalLitMan.g:735:2: this_INT_0= RULE_INT
            {
            this_INT_0=(Token)match(input,RULE_INT,FOLLOW_2); 

            		current.merge(this_INT_0);
            	

            		newLeafNode(this_INT_0, grammarAccess.getYearAccess().getINTTerminalRuleCall());
            	

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
    // $ANTLR end "ruleYear"


    // $ANTLR start "entryRuleDate"
    // InternalLitMan.g:745:1: entryRuleDate returns [String current=null] : iv_ruleDate= ruleDate EOF ;
    public final String entryRuleDate() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleDate = null;


        try {
            // InternalLitMan.g:745:44: (iv_ruleDate= ruleDate EOF )
            // InternalLitMan.g:746:2: iv_ruleDate= ruleDate EOF
            {
             newCompositeNode(grammarAccess.getDateRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDate=ruleDate();

            state._fsp--;

             current =iv_ruleDate.getText(); 
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
    // $ANTLR end "entryRuleDate"


    // $ANTLR start "ruleDate"
    // InternalLitMan.g:752:1: ruleDate returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_INT_0= RULE_INT kw= '.' this_INT_2= RULE_INT kw= '.' this_INT_4= RULE_INT ) ;
    public final AntlrDatatypeRuleToken ruleDate() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_INT_0=null;
        Token kw=null;
        Token this_INT_2=null;
        Token this_INT_4=null;


        	enterRule();

        try {
            // InternalLitMan.g:758:2: ( (this_INT_0= RULE_INT kw= '.' this_INT_2= RULE_INT kw= '.' this_INT_4= RULE_INT ) )
            // InternalLitMan.g:759:2: (this_INT_0= RULE_INT kw= '.' this_INT_2= RULE_INT kw= '.' this_INT_4= RULE_INT )
            {
            // InternalLitMan.g:759:2: (this_INT_0= RULE_INT kw= '.' this_INT_2= RULE_INT kw= '.' this_INT_4= RULE_INT )
            // InternalLitMan.g:760:3: this_INT_0= RULE_INT kw= '.' this_INT_2= RULE_INT kw= '.' this_INT_4= RULE_INT
            {
            this_INT_0=(Token)match(input,RULE_INT,FOLLOW_22); 

            			current.merge(this_INT_0);
            		

            			newLeafNode(this_INT_0, grammarAccess.getDateAccess().getINTTerminalRuleCall_0());
            		
            kw=(Token)match(input,28,FOLLOW_13); 

            			current.merge(kw);
            			newLeafNode(kw, grammarAccess.getDateAccess().getFullStopKeyword_1());
            		
            this_INT_2=(Token)match(input,RULE_INT,FOLLOW_22); 

            			current.merge(this_INT_2);
            		

            			newLeafNode(this_INT_2, grammarAccess.getDateAccess().getINTTerminalRuleCall_2());
            		
            kw=(Token)match(input,28,FOLLOW_13); 

            			current.merge(kw);
            			newLeafNode(kw, grammarAccess.getDateAccess().getFullStopKeyword_3());
            		
            this_INT_4=(Token)match(input,RULE_INT,FOLLOW_2); 

            			current.merge(this_INT_4);
            		

            			newLeafNode(this_INT_4, grammarAccess.getDateAccess().getINTTerminalRuleCall_4());
            		

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
    // $ANTLR end "ruleDate"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000200802L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000001020000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000005000002L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000001000002L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000010000000L});

}