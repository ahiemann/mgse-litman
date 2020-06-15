package org.xtext.htwg.ide.contentassist.antlr.internal;

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
import org.xtext.htwg.services.LitManGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalLitManParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_INT", "RULE_STRING", "RULE_ID", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Book'", "'{'", "'Title'", "'=>'", "'Authors'", "'['", "']'", "'Pages'", "'Date'", "'}'", "'Article'", "'Volume'", "'Issue'", "'f'", "'l'", "','", "'-'", "'.'"
    };
    public static final int RULE_STRING=5;
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
    public static final int RULE_INT=4;
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

    	public void setGrammarAccess(LitManGrammarAccess grammarAccess) {
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



    // $ANTLR start "entryRuleLitMan"
    // InternalLitMan.g:53:1: entryRuleLitMan : ruleLitMan EOF ;
    public final void entryRuleLitMan() throws RecognitionException {
        try {
            // InternalLitMan.g:54:1: ( ruleLitMan EOF )
            // InternalLitMan.g:55:1: ruleLitMan EOF
            {
             before(grammarAccess.getLitManRule()); 
            pushFollow(FOLLOW_1);
            ruleLitMan();

            state._fsp--;

             after(grammarAccess.getLitManRule()); 
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
    // $ANTLR end "entryRuleLitMan"


    // $ANTLR start "ruleLitMan"
    // InternalLitMan.g:62:1: ruleLitMan : ( ( rule__LitMan__LiteraturAssignment )* ) ;
    public final void ruleLitMan() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLitMan.g:66:2: ( ( ( rule__LitMan__LiteraturAssignment )* ) )
            // InternalLitMan.g:67:2: ( ( rule__LitMan__LiteraturAssignment )* )
            {
            // InternalLitMan.g:67:2: ( ( rule__LitMan__LiteraturAssignment )* )
            // InternalLitMan.g:68:3: ( rule__LitMan__LiteraturAssignment )*
            {
             before(grammarAccess.getLitManAccess().getLiteraturAssignment()); 
            // InternalLitMan.g:69:3: ( rule__LitMan__LiteraturAssignment )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==11||LA1_0==21) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalLitMan.g:69:4: rule__LitMan__LiteraturAssignment
            	    {
            	    pushFollow(FOLLOW_3);
            	    rule__LitMan__LiteraturAssignment();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

             after(grammarAccess.getLitManAccess().getLiteraturAssignment()); 

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
    // $ANTLR end "ruleLitMan"


    // $ANTLR start "entryRuleLitTypes"
    // InternalLitMan.g:78:1: entryRuleLitTypes : ruleLitTypes EOF ;
    public final void entryRuleLitTypes() throws RecognitionException {
        try {
            // InternalLitMan.g:79:1: ( ruleLitTypes EOF )
            // InternalLitMan.g:80:1: ruleLitTypes EOF
            {
             before(grammarAccess.getLitTypesRule()); 
            pushFollow(FOLLOW_1);
            ruleLitTypes();

            state._fsp--;

             after(grammarAccess.getLitTypesRule()); 
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
    // $ANTLR end "entryRuleLitTypes"


    // $ANTLR start "ruleLitTypes"
    // InternalLitMan.g:87:1: ruleLitTypes : ( ( rule__LitTypes__Alternatives ) ) ;
    public final void ruleLitTypes() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLitMan.g:91:2: ( ( ( rule__LitTypes__Alternatives ) ) )
            // InternalLitMan.g:92:2: ( ( rule__LitTypes__Alternatives ) )
            {
            // InternalLitMan.g:92:2: ( ( rule__LitTypes__Alternatives ) )
            // InternalLitMan.g:93:3: ( rule__LitTypes__Alternatives )
            {
             before(grammarAccess.getLitTypesAccess().getAlternatives()); 
            // InternalLitMan.g:94:3: ( rule__LitTypes__Alternatives )
            // InternalLitMan.g:94:4: rule__LitTypes__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__LitTypes__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getLitTypesAccess().getAlternatives()); 

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
    // $ANTLR end "ruleLitTypes"


    // $ANTLR start "entryRuleBook"
    // InternalLitMan.g:103:1: entryRuleBook : ruleBook EOF ;
    public final void entryRuleBook() throws RecognitionException {
        try {
            // InternalLitMan.g:104:1: ( ruleBook EOF )
            // InternalLitMan.g:105:1: ruleBook EOF
            {
             before(grammarAccess.getBookRule()); 
            pushFollow(FOLLOW_1);
            ruleBook();

            state._fsp--;

             after(grammarAccess.getBookRule()); 
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
    // $ANTLR end "entryRuleBook"


    // $ANTLR start "ruleBook"
    // InternalLitMan.g:112:1: ruleBook : ( ( rule__Book__Group__0 ) ) ;
    public final void ruleBook() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLitMan.g:116:2: ( ( ( rule__Book__Group__0 ) ) )
            // InternalLitMan.g:117:2: ( ( rule__Book__Group__0 ) )
            {
            // InternalLitMan.g:117:2: ( ( rule__Book__Group__0 ) )
            // InternalLitMan.g:118:3: ( rule__Book__Group__0 )
            {
             before(grammarAccess.getBookAccess().getGroup()); 
            // InternalLitMan.g:119:3: ( rule__Book__Group__0 )
            // InternalLitMan.g:119:4: rule__Book__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Book__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getBookAccess().getGroup()); 

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
    // $ANTLR end "ruleBook"


    // $ANTLR start "entryRuleJournalArticle"
    // InternalLitMan.g:128:1: entryRuleJournalArticle : ruleJournalArticle EOF ;
    public final void entryRuleJournalArticle() throws RecognitionException {
        try {
            // InternalLitMan.g:129:1: ( ruleJournalArticle EOF )
            // InternalLitMan.g:130:1: ruleJournalArticle EOF
            {
             before(grammarAccess.getJournalArticleRule()); 
            pushFollow(FOLLOW_1);
            ruleJournalArticle();

            state._fsp--;

             after(grammarAccess.getJournalArticleRule()); 
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
    // $ANTLR end "entryRuleJournalArticle"


    // $ANTLR start "ruleJournalArticle"
    // InternalLitMan.g:137:1: ruleJournalArticle : ( ( rule__JournalArticle__Group__0 ) ) ;
    public final void ruleJournalArticle() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLitMan.g:141:2: ( ( ( rule__JournalArticle__Group__0 ) ) )
            // InternalLitMan.g:142:2: ( ( rule__JournalArticle__Group__0 ) )
            {
            // InternalLitMan.g:142:2: ( ( rule__JournalArticle__Group__0 ) )
            // InternalLitMan.g:143:3: ( rule__JournalArticle__Group__0 )
            {
             before(grammarAccess.getJournalArticleAccess().getGroup()); 
            // InternalLitMan.g:144:3: ( rule__JournalArticle__Group__0 )
            // InternalLitMan.g:144:4: rule__JournalArticle__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__JournalArticle__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getJournalArticleAccess().getGroup()); 

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
    // $ANTLR end "ruleJournalArticle"


    // $ANTLR start "entryRuleAuthor"
    // InternalLitMan.g:153:1: entryRuleAuthor : ruleAuthor EOF ;
    public final void entryRuleAuthor() throws RecognitionException {
        try {
            // InternalLitMan.g:154:1: ( ruleAuthor EOF )
            // InternalLitMan.g:155:1: ruleAuthor EOF
            {
             before(grammarAccess.getAuthorRule()); 
            pushFollow(FOLLOW_1);
            ruleAuthor();

            state._fsp--;

             after(grammarAccess.getAuthorRule()); 
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
    // $ANTLR end "entryRuleAuthor"


    // $ANTLR start "ruleAuthor"
    // InternalLitMan.g:162:1: ruleAuthor : ( ( rule__Author__Group__0 ) ) ;
    public final void ruleAuthor() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLitMan.g:166:2: ( ( ( rule__Author__Group__0 ) ) )
            // InternalLitMan.g:167:2: ( ( rule__Author__Group__0 ) )
            {
            // InternalLitMan.g:167:2: ( ( rule__Author__Group__0 ) )
            // InternalLitMan.g:168:3: ( rule__Author__Group__0 )
            {
             before(grammarAccess.getAuthorAccess().getGroup()); 
            // InternalLitMan.g:169:3: ( rule__Author__Group__0 )
            // InternalLitMan.g:169:4: rule__Author__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Author__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getAuthorAccess().getGroup()); 

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
    // $ANTLR end "ruleAuthor"


    // $ANTLR start "entryRuleListAuthors"
    // InternalLitMan.g:178:1: entryRuleListAuthors : ruleListAuthors EOF ;
    public final void entryRuleListAuthors() throws RecognitionException {
        try {
            // InternalLitMan.g:179:1: ( ruleListAuthors EOF )
            // InternalLitMan.g:180:1: ruleListAuthors EOF
            {
             before(grammarAccess.getListAuthorsRule()); 
            pushFollow(FOLLOW_1);
            ruleListAuthors();

            state._fsp--;

             after(grammarAccess.getListAuthorsRule()); 
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
    // $ANTLR end "entryRuleListAuthors"


    // $ANTLR start "ruleListAuthors"
    // InternalLitMan.g:187:1: ruleListAuthors : ( ( rule__ListAuthors__Group__0 )* ) ;
    public final void ruleListAuthors() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLitMan.g:191:2: ( ( ( rule__ListAuthors__Group__0 )* ) )
            // InternalLitMan.g:192:2: ( ( rule__ListAuthors__Group__0 )* )
            {
            // InternalLitMan.g:192:2: ( ( rule__ListAuthors__Group__0 )* )
            // InternalLitMan.g:193:3: ( rule__ListAuthors__Group__0 )*
            {
             before(grammarAccess.getListAuthorsAccess().getGroup()); 
            // InternalLitMan.g:194:3: ( rule__ListAuthors__Group__0 )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==24) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalLitMan.g:194:4: rule__ListAuthors__Group__0
            	    {
            	    pushFollow(FOLLOW_4);
            	    rule__ListAuthors__Group__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

             after(grammarAccess.getListAuthorsAccess().getGroup()); 

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
    // $ANTLR end "ruleListAuthors"


    // $ANTLR start "entryRulePageSingle"
    // InternalLitMan.g:203:1: entryRulePageSingle : rulePageSingle EOF ;
    public final void entryRulePageSingle() throws RecognitionException {
        try {
            // InternalLitMan.g:204:1: ( rulePageSingle EOF )
            // InternalLitMan.g:205:1: rulePageSingle EOF
            {
             before(grammarAccess.getPageSingleRule()); 
            pushFollow(FOLLOW_1);
            rulePageSingle();

            state._fsp--;

             after(grammarAccess.getPageSingleRule()); 
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
    // $ANTLR end "entryRulePageSingle"


    // $ANTLR start "rulePageSingle"
    // InternalLitMan.g:212:1: rulePageSingle : ( RULE_INT ) ;
    public final void rulePageSingle() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLitMan.g:216:2: ( ( RULE_INT ) )
            // InternalLitMan.g:217:2: ( RULE_INT )
            {
            // InternalLitMan.g:217:2: ( RULE_INT )
            // InternalLitMan.g:218:3: RULE_INT
            {
             before(grammarAccess.getPageSingleAccess().getINTTerminalRuleCall()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getPageSingleAccess().getINTTerminalRuleCall()); 

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
    // $ANTLR end "rulePageSingle"


    // $ANTLR start "entryRulePageRange"
    // InternalLitMan.g:228:1: entryRulePageRange : rulePageRange EOF ;
    public final void entryRulePageRange() throws RecognitionException {
        try {
            // InternalLitMan.g:229:1: ( rulePageRange EOF )
            // InternalLitMan.g:230:1: rulePageRange EOF
            {
             before(grammarAccess.getPageRangeRule()); 
            pushFollow(FOLLOW_1);
            rulePageRange();

            state._fsp--;

             after(grammarAccess.getPageRangeRule()); 
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
    // $ANTLR end "entryRulePageRange"


    // $ANTLR start "rulePageRange"
    // InternalLitMan.g:237:1: rulePageRange : ( ( rule__PageRange__Group__0 ) ) ;
    public final void rulePageRange() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLitMan.g:241:2: ( ( ( rule__PageRange__Group__0 ) ) )
            // InternalLitMan.g:242:2: ( ( rule__PageRange__Group__0 ) )
            {
            // InternalLitMan.g:242:2: ( ( rule__PageRange__Group__0 ) )
            // InternalLitMan.g:243:3: ( rule__PageRange__Group__0 )
            {
             before(grammarAccess.getPageRangeAccess().getGroup()); 
            // InternalLitMan.g:244:3: ( rule__PageRange__Group__0 )
            // InternalLitMan.g:244:4: rule__PageRange__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__PageRange__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getPageRangeAccess().getGroup()); 

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
    // $ANTLR end "rulePageRange"


    // $ANTLR start "entryRuleYear"
    // InternalLitMan.g:253:1: entryRuleYear : ruleYear EOF ;
    public final void entryRuleYear() throws RecognitionException {
        try {
            // InternalLitMan.g:254:1: ( ruleYear EOF )
            // InternalLitMan.g:255:1: ruleYear EOF
            {
             before(grammarAccess.getYearRule()); 
            pushFollow(FOLLOW_1);
            ruleYear();

            state._fsp--;

             after(grammarAccess.getYearRule()); 
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
    // $ANTLR end "entryRuleYear"


    // $ANTLR start "ruleYear"
    // InternalLitMan.g:262:1: ruleYear : ( RULE_INT ) ;
    public final void ruleYear() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLitMan.g:266:2: ( ( RULE_INT ) )
            // InternalLitMan.g:267:2: ( RULE_INT )
            {
            // InternalLitMan.g:267:2: ( RULE_INT )
            // InternalLitMan.g:268:3: RULE_INT
            {
             before(grammarAccess.getYearAccess().getINTTerminalRuleCall()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getYearAccess().getINTTerminalRuleCall()); 

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
    // $ANTLR end "ruleYear"


    // $ANTLR start "entryRuleDate"
    // InternalLitMan.g:278:1: entryRuleDate : ruleDate EOF ;
    public final void entryRuleDate() throws RecognitionException {
        try {
            // InternalLitMan.g:279:1: ( ruleDate EOF )
            // InternalLitMan.g:280:1: ruleDate EOF
            {
             before(grammarAccess.getDateRule()); 
            pushFollow(FOLLOW_1);
            ruleDate();

            state._fsp--;

             after(grammarAccess.getDateRule()); 
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
    // $ANTLR end "entryRuleDate"


    // $ANTLR start "ruleDate"
    // InternalLitMan.g:287:1: ruleDate : ( ( rule__Date__Group__0 ) ) ;
    public final void ruleDate() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLitMan.g:291:2: ( ( ( rule__Date__Group__0 ) ) )
            // InternalLitMan.g:292:2: ( ( rule__Date__Group__0 ) )
            {
            // InternalLitMan.g:292:2: ( ( rule__Date__Group__0 ) )
            // InternalLitMan.g:293:3: ( rule__Date__Group__0 )
            {
             before(grammarAccess.getDateAccess().getGroup()); 
            // InternalLitMan.g:294:3: ( rule__Date__Group__0 )
            // InternalLitMan.g:294:4: rule__Date__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Date__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getDateAccess().getGroup()); 

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
    // $ANTLR end "ruleDate"


    // $ANTLR start "rule__LitTypes__Alternatives"
    // InternalLitMan.g:302:1: rule__LitTypes__Alternatives : ( ( ruleBook ) | ( ruleJournalArticle ) );
    public final void rule__LitTypes__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLitMan.g:306:1: ( ( ruleBook ) | ( ruleJournalArticle ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==11) ) {
                alt3=1;
            }
            else if ( (LA3_0==21) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalLitMan.g:307:2: ( ruleBook )
                    {
                    // InternalLitMan.g:307:2: ( ruleBook )
                    // InternalLitMan.g:308:3: ruleBook
                    {
                     before(grammarAccess.getLitTypesAccess().getBookParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleBook();

                    state._fsp--;

                     after(grammarAccess.getLitTypesAccess().getBookParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalLitMan.g:313:2: ( ruleJournalArticle )
                    {
                    // InternalLitMan.g:313:2: ( ruleJournalArticle )
                    // InternalLitMan.g:314:3: ruleJournalArticle
                    {
                     before(grammarAccess.getLitTypesAccess().getJournalArticleParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleJournalArticle();

                    state._fsp--;

                     after(grammarAccess.getLitTypesAccess().getJournalArticleParserRuleCall_1()); 

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
    // $ANTLR end "rule__LitTypes__Alternatives"


    // $ANTLR start "rule__Book__PagesAlternatives_12_0"
    // InternalLitMan.g:323:1: rule__Book__PagesAlternatives_12_0 : ( ( rulePageSingle ) | ( rulePageRange ) );
    public final void rule__Book__PagesAlternatives_12_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLitMan.g:327:1: ( ( rulePageSingle ) | ( rulePageRange ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==RULE_INT) ) {
                int LA4_1 = input.LA(2);

                if ( (LA4_1==19) ) {
                    alt4=1;
                }
                else if ( (LA4_1==27) ) {
                    alt4=2;
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
                    // InternalLitMan.g:328:2: ( rulePageSingle )
                    {
                    // InternalLitMan.g:328:2: ( rulePageSingle )
                    // InternalLitMan.g:329:3: rulePageSingle
                    {
                     before(grammarAccess.getBookAccess().getPagesPageSingleParserRuleCall_12_0_0()); 
                    pushFollow(FOLLOW_2);
                    rulePageSingle();

                    state._fsp--;

                     after(grammarAccess.getBookAccess().getPagesPageSingleParserRuleCall_12_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalLitMan.g:334:2: ( rulePageRange )
                    {
                    // InternalLitMan.g:334:2: ( rulePageRange )
                    // InternalLitMan.g:335:3: rulePageRange
                    {
                     before(grammarAccess.getBookAccess().getPagesPageRangeParserRuleCall_12_0_1()); 
                    pushFollow(FOLLOW_2);
                    rulePageRange();

                    state._fsp--;

                     after(grammarAccess.getBookAccess().getPagesPageRangeParserRuleCall_12_0_1()); 

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
    // $ANTLR end "rule__Book__PagesAlternatives_12_0"


    // $ANTLR start "rule__Book__DateAlternatives_15_0"
    // InternalLitMan.g:344:1: rule__Book__DateAlternatives_15_0 : ( ( ruleYear ) | ( ruleDate ) );
    public final void rule__Book__DateAlternatives_15_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLitMan.g:348:1: ( ( ruleYear ) | ( ruleDate ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==RULE_INT) ) {
                int LA5_1 = input.LA(2);

                if ( (LA5_1==20) ) {
                    alt5=1;
                }
                else if ( (LA5_1==28) ) {
                    alt5=2;
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
                    // InternalLitMan.g:349:2: ( ruleYear )
                    {
                    // InternalLitMan.g:349:2: ( ruleYear )
                    // InternalLitMan.g:350:3: ruleYear
                    {
                     before(grammarAccess.getBookAccess().getDateYearParserRuleCall_15_0_0()); 
                    pushFollow(FOLLOW_2);
                    ruleYear();

                    state._fsp--;

                     after(grammarAccess.getBookAccess().getDateYearParserRuleCall_15_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalLitMan.g:355:2: ( ruleDate )
                    {
                    // InternalLitMan.g:355:2: ( ruleDate )
                    // InternalLitMan.g:356:3: ruleDate
                    {
                     before(grammarAccess.getBookAccess().getDateDateParserRuleCall_15_0_1()); 
                    pushFollow(FOLLOW_2);
                    ruleDate();

                    state._fsp--;

                     after(grammarAccess.getBookAccess().getDateDateParserRuleCall_15_0_1()); 

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
    // $ANTLR end "rule__Book__DateAlternatives_15_0"


    // $ANTLR start "rule__JournalArticle__PagesAlternatives_18_0"
    // InternalLitMan.g:365:1: rule__JournalArticle__PagesAlternatives_18_0 : ( ( rulePageSingle ) | ( rulePageRange ) );
    public final void rule__JournalArticle__PagesAlternatives_18_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLitMan.g:369:1: ( ( rulePageSingle ) | ( rulePageRange ) )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==RULE_INT) ) {
                int LA6_1 = input.LA(2);

                if ( (LA6_1==27) ) {
                    alt6=2;
                }
                else if ( (LA6_1==19) ) {
                    alt6=1;
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
                    // InternalLitMan.g:370:2: ( rulePageSingle )
                    {
                    // InternalLitMan.g:370:2: ( rulePageSingle )
                    // InternalLitMan.g:371:3: rulePageSingle
                    {
                     before(grammarAccess.getJournalArticleAccess().getPagesPageSingleParserRuleCall_18_0_0()); 
                    pushFollow(FOLLOW_2);
                    rulePageSingle();

                    state._fsp--;

                     after(grammarAccess.getJournalArticleAccess().getPagesPageSingleParserRuleCall_18_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalLitMan.g:376:2: ( rulePageRange )
                    {
                    // InternalLitMan.g:376:2: ( rulePageRange )
                    // InternalLitMan.g:377:3: rulePageRange
                    {
                     before(grammarAccess.getJournalArticleAccess().getPagesPageRangeParserRuleCall_18_0_1()); 
                    pushFollow(FOLLOW_2);
                    rulePageRange();

                    state._fsp--;

                     after(grammarAccess.getJournalArticleAccess().getPagesPageRangeParserRuleCall_18_0_1()); 

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
    // $ANTLR end "rule__JournalArticle__PagesAlternatives_18_0"


    // $ANTLR start "rule__JournalArticle__DateAlternatives_21_0"
    // InternalLitMan.g:386:1: rule__JournalArticle__DateAlternatives_21_0 : ( ( ruleYear ) | ( ruleDate ) );
    public final void rule__JournalArticle__DateAlternatives_21_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLitMan.g:390:1: ( ( ruleYear ) | ( ruleDate ) )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==RULE_INT) ) {
                int LA7_1 = input.LA(2);

                if ( (LA7_1==20) ) {
                    alt7=1;
                }
                else if ( (LA7_1==28) ) {
                    alt7=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 7, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // InternalLitMan.g:391:2: ( ruleYear )
                    {
                    // InternalLitMan.g:391:2: ( ruleYear )
                    // InternalLitMan.g:392:3: ruleYear
                    {
                     before(grammarAccess.getJournalArticleAccess().getDateYearParserRuleCall_21_0_0()); 
                    pushFollow(FOLLOW_2);
                    ruleYear();

                    state._fsp--;

                     after(grammarAccess.getJournalArticleAccess().getDateYearParserRuleCall_21_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalLitMan.g:397:2: ( ruleDate )
                    {
                    // InternalLitMan.g:397:2: ( ruleDate )
                    // InternalLitMan.g:398:3: ruleDate
                    {
                     before(grammarAccess.getJournalArticleAccess().getDateDateParserRuleCall_21_0_1()); 
                    pushFollow(FOLLOW_2);
                    ruleDate();

                    state._fsp--;

                     after(grammarAccess.getJournalArticleAccess().getDateDateParserRuleCall_21_0_1()); 

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
    // $ANTLR end "rule__JournalArticle__DateAlternatives_21_0"


    // $ANTLR start "rule__Book__Group__0"
    // InternalLitMan.g:407:1: rule__Book__Group__0 : rule__Book__Group__0__Impl rule__Book__Group__1 ;
    public final void rule__Book__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLitMan.g:411:1: ( rule__Book__Group__0__Impl rule__Book__Group__1 )
            // InternalLitMan.g:412:2: rule__Book__Group__0__Impl rule__Book__Group__1
            {
            pushFollow(FOLLOW_5);
            rule__Book__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Book__Group__1();

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
    // $ANTLR end "rule__Book__Group__0"


    // $ANTLR start "rule__Book__Group__0__Impl"
    // InternalLitMan.g:419:1: rule__Book__Group__0__Impl : ( 'Book' ) ;
    public final void rule__Book__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLitMan.g:423:1: ( ( 'Book' ) )
            // InternalLitMan.g:424:1: ( 'Book' )
            {
            // InternalLitMan.g:424:1: ( 'Book' )
            // InternalLitMan.g:425:2: 'Book'
            {
             before(grammarAccess.getBookAccess().getBookKeyword_0()); 
            match(input,11,FOLLOW_2); 
             after(grammarAccess.getBookAccess().getBookKeyword_0()); 

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
    // $ANTLR end "rule__Book__Group__0__Impl"


    // $ANTLR start "rule__Book__Group__1"
    // InternalLitMan.g:434:1: rule__Book__Group__1 : rule__Book__Group__1__Impl rule__Book__Group__2 ;
    public final void rule__Book__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLitMan.g:438:1: ( rule__Book__Group__1__Impl rule__Book__Group__2 )
            // InternalLitMan.g:439:2: rule__Book__Group__1__Impl rule__Book__Group__2
            {
            pushFollow(FOLLOW_6);
            rule__Book__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Book__Group__2();

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
    // $ANTLR end "rule__Book__Group__1"


    // $ANTLR start "rule__Book__Group__1__Impl"
    // InternalLitMan.g:446:1: rule__Book__Group__1__Impl : ( '{' ) ;
    public final void rule__Book__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLitMan.g:450:1: ( ( '{' ) )
            // InternalLitMan.g:451:1: ( '{' )
            {
            // InternalLitMan.g:451:1: ( '{' )
            // InternalLitMan.g:452:2: '{'
            {
             before(grammarAccess.getBookAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getBookAccess().getLeftCurlyBracketKeyword_1()); 

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
    // $ANTLR end "rule__Book__Group__1__Impl"


    // $ANTLR start "rule__Book__Group__2"
    // InternalLitMan.g:461:1: rule__Book__Group__2 : rule__Book__Group__2__Impl rule__Book__Group__3 ;
    public final void rule__Book__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLitMan.g:465:1: ( rule__Book__Group__2__Impl rule__Book__Group__3 )
            // InternalLitMan.g:466:2: rule__Book__Group__2__Impl rule__Book__Group__3
            {
            pushFollow(FOLLOW_7);
            rule__Book__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Book__Group__3();

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
    // $ANTLR end "rule__Book__Group__2"


    // $ANTLR start "rule__Book__Group__2__Impl"
    // InternalLitMan.g:473:1: rule__Book__Group__2__Impl : ( 'Title' ) ;
    public final void rule__Book__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLitMan.g:477:1: ( ( 'Title' ) )
            // InternalLitMan.g:478:1: ( 'Title' )
            {
            // InternalLitMan.g:478:1: ( 'Title' )
            // InternalLitMan.g:479:2: 'Title'
            {
             before(grammarAccess.getBookAccess().getTitleKeyword_2()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getBookAccess().getTitleKeyword_2()); 

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
    // $ANTLR end "rule__Book__Group__2__Impl"


    // $ANTLR start "rule__Book__Group__3"
    // InternalLitMan.g:488:1: rule__Book__Group__3 : rule__Book__Group__3__Impl rule__Book__Group__4 ;
    public final void rule__Book__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLitMan.g:492:1: ( rule__Book__Group__3__Impl rule__Book__Group__4 )
            // InternalLitMan.g:493:2: rule__Book__Group__3__Impl rule__Book__Group__4
            {
            pushFollow(FOLLOW_8);
            rule__Book__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Book__Group__4();

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
    // $ANTLR end "rule__Book__Group__3"


    // $ANTLR start "rule__Book__Group__3__Impl"
    // InternalLitMan.g:500:1: rule__Book__Group__3__Impl : ( '=>' ) ;
    public final void rule__Book__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLitMan.g:504:1: ( ( '=>' ) )
            // InternalLitMan.g:505:1: ( '=>' )
            {
            // InternalLitMan.g:505:1: ( '=>' )
            // InternalLitMan.g:506:2: '=>'
            {
             before(grammarAccess.getBookAccess().getEqualsSignGreaterThanSignKeyword_3()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getBookAccess().getEqualsSignGreaterThanSignKeyword_3()); 

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
    // $ANTLR end "rule__Book__Group__3__Impl"


    // $ANTLR start "rule__Book__Group__4"
    // InternalLitMan.g:515:1: rule__Book__Group__4 : rule__Book__Group__4__Impl rule__Book__Group__5 ;
    public final void rule__Book__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLitMan.g:519:1: ( rule__Book__Group__4__Impl rule__Book__Group__5 )
            // InternalLitMan.g:520:2: rule__Book__Group__4__Impl rule__Book__Group__5
            {
            pushFollow(FOLLOW_9);
            rule__Book__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Book__Group__5();

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
    // $ANTLR end "rule__Book__Group__4"


    // $ANTLR start "rule__Book__Group__4__Impl"
    // InternalLitMan.g:527:1: rule__Book__Group__4__Impl : ( ( rule__Book__TitleAssignment_4 ) ) ;
    public final void rule__Book__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLitMan.g:531:1: ( ( ( rule__Book__TitleAssignment_4 ) ) )
            // InternalLitMan.g:532:1: ( ( rule__Book__TitleAssignment_4 ) )
            {
            // InternalLitMan.g:532:1: ( ( rule__Book__TitleAssignment_4 ) )
            // InternalLitMan.g:533:2: ( rule__Book__TitleAssignment_4 )
            {
             before(grammarAccess.getBookAccess().getTitleAssignment_4()); 
            // InternalLitMan.g:534:2: ( rule__Book__TitleAssignment_4 )
            // InternalLitMan.g:534:3: rule__Book__TitleAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__Book__TitleAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getBookAccess().getTitleAssignment_4()); 

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
    // $ANTLR end "rule__Book__Group__4__Impl"


    // $ANTLR start "rule__Book__Group__5"
    // InternalLitMan.g:542:1: rule__Book__Group__5 : rule__Book__Group__5__Impl rule__Book__Group__6 ;
    public final void rule__Book__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLitMan.g:546:1: ( rule__Book__Group__5__Impl rule__Book__Group__6 )
            // InternalLitMan.g:547:2: rule__Book__Group__5__Impl rule__Book__Group__6
            {
            pushFollow(FOLLOW_7);
            rule__Book__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Book__Group__6();

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
    // $ANTLR end "rule__Book__Group__5"


    // $ANTLR start "rule__Book__Group__5__Impl"
    // InternalLitMan.g:554:1: rule__Book__Group__5__Impl : ( 'Authors' ) ;
    public final void rule__Book__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLitMan.g:558:1: ( ( 'Authors' ) )
            // InternalLitMan.g:559:1: ( 'Authors' )
            {
            // InternalLitMan.g:559:1: ( 'Authors' )
            // InternalLitMan.g:560:2: 'Authors'
            {
             before(grammarAccess.getBookAccess().getAuthorsKeyword_5()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getBookAccess().getAuthorsKeyword_5()); 

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
    // $ANTLR end "rule__Book__Group__5__Impl"


    // $ANTLR start "rule__Book__Group__6"
    // InternalLitMan.g:569:1: rule__Book__Group__6 : rule__Book__Group__6__Impl rule__Book__Group__7 ;
    public final void rule__Book__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLitMan.g:573:1: ( rule__Book__Group__6__Impl rule__Book__Group__7 )
            // InternalLitMan.g:574:2: rule__Book__Group__6__Impl rule__Book__Group__7
            {
            pushFollow(FOLLOW_10);
            rule__Book__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Book__Group__7();

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
    // $ANTLR end "rule__Book__Group__6"


    // $ANTLR start "rule__Book__Group__6__Impl"
    // InternalLitMan.g:581:1: rule__Book__Group__6__Impl : ( '=>' ) ;
    public final void rule__Book__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLitMan.g:585:1: ( ( '=>' ) )
            // InternalLitMan.g:586:1: ( '=>' )
            {
            // InternalLitMan.g:586:1: ( '=>' )
            // InternalLitMan.g:587:2: '=>'
            {
             before(grammarAccess.getBookAccess().getEqualsSignGreaterThanSignKeyword_6()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getBookAccess().getEqualsSignGreaterThanSignKeyword_6()); 

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
    // $ANTLR end "rule__Book__Group__6__Impl"


    // $ANTLR start "rule__Book__Group__7"
    // InternalLitMan.g:596:1: rule__Book__Group__7 : rule__Book__Group__7__Impl rule__Book__Group__8 ;
    public final void rule__Book__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLitMan.g:600:1: ( rule__Book__Group__7__Impl rule__Book__Group__8 )
            // InternalLitMan.g:601:2: rule__Book__Group__7__Impl rule__Book__Group__8
            {
            pushFollow(FOLLOW_11);
            rule__Book__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Book__Group__8();

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
    // $ANTLR end "rule__Book__Group__7"


    // $ANTLR start "rule__Book__Group__7__Impl"
    // InternalLitMan.g:608:1: rule__Book__Group__7__Impl : ( '[' ) ;
    public final void rule__Book__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLitMan.g:612:1: ( ( '[' ) )
            // InternalLitMan.g:613:1: ( '[' )
            {
            // InternalLitMan.g:613:1: ( '[' )
            // InternalLitMan.g:614:2: '['
            {
             before(grammarAccess.getBookAccess().getLeftSquareBracketKeyword_7()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getBookAccess().getLeftSquareBracketKeyword_7()); 

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
    // $ANTLR end "rule__Book__Group__7__Impl"


    // $ANTLR start "rule__Book__Group__8"
    // InternalLitMan.g:623:1: rule__Book__Group__8 : rule__Book__Group__8__Impl rule__Book__Group__9 ;
    public final void rule__Book__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLitMan.g:627:1: ( rule__Book__Group__8__Impl rule__Book__Group__9 )
            // InternalLitMan.g:628:2: rule__Book__Group__8__Impl rule__Book__Group__9
            {
            pushFollow(FOLLOW_12);
            rule__Book__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Book__Group__9();

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
    // $ANTLR end "rule__Book__Group__8"


    // $ANTLR start "rule__Book__Group__8__Impl"
    // InternalLitMan.g:635:1: rule__Book__Group__8__Impl : ( ( rule__Book__AuthorsAssignment_8 ) ) ;
    public final void rule__Book__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLitMan.g:639:1: ( ( ( rule__Book__AuthorsAssignment_8 ) ) )
            // InternalLitMan.g:640:1: ( ( rule__Book__AuthorsAssignment_8 ) )
            {
            // InternalLitMan.g:640:1: ( ( rule__Book__AuthorsAssignment_8 ) )
            // InternalLitMan.g:641:2: ( rule__Book__AuthorsAssignment_8 )
            {
             before(grammarAccess.getBookAccess().getAuthorsAssignment_8()); 
            // InternalLitMan.g:642:2: ( rule__Book__AuthorsAssignment_8 )
            // InternalLitMan.g:642:3: rule__Book__AuthorsAssignment_8
            {
            pushFollow(FOLLOW_2);
            rule__Book__AuthorsAssignment_8();

            state._fsp--;


            }

             after(grammarAccess.getBookAccess().getAuthorsAssignment_8()); 

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
    // $ANTLR end "rule__Book__Group__8__Impl"


    // $ANTLR start "rule__Book__Group__9"
    // InternalLitMan.g:650:1: rule__Book__Group__9 : rule__Book__Group__9__Impl rule__Book__Group__10 ;
    public final void rule__Book__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLitMan.g:654:1: ( rule__Book__Group__9__Impl rule__Book__Group__10 )
            // InternalLitMan.g:655:2: rule__Book__Group__9__Impl rule__Book__Group__10
            {
            pushFollow(FOLLOW_13);
            rule__Book__Group__9__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Book__Group__10();

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
    // $ANTLR end "rule__Book__Group__9"


    // $ANTLR start "rule__Book__Group__9__Impl"
    // InternalLitMan.g:662:1: rule__Book__Group__9__Impl : ( ']' ) ;
    public final void rule__Book__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLitMan.g:666:1: ( ( ']' ) )
            // InternalLitMan.g:667:1: ( ']' )
            {
            // InternalLitMan.g:667:1: ( ']' )
            // InternalLitMan.g:668:2: ']'
            {
             before(grammarAccess.getBookAccess().getRightSquareBracketKeyword_9()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getBookAccess().getRightSquareBracketKeyword_9()); 

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
    // $ANTLR end "rule__Book__Group__9__Impl"


    // $ANTLR start "rule__Book__Group__10"
    // InternalLitMan.g:677:1: rule__Book__Group__10 : rule__Book__Group__10__Impl rule__Book__Group__11 ;
    public final void rule__Book__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLitMan.g:681:1: ( rule__Book__Group__10__Impl rule__Book__Group__11 )
            // InternalLitMan.g:682:2: rule__Book__Group__10__Impl rule__Book__Group__11
            {
            pushFollow(FOLLOW_7);
            rule__Book__Group__10__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Book__Group__11();

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
    // $ANTLR end "rule__Book__Group__10"


    // $ANTLR start "rule__Book__Group__10__Impl"
    // InternalLitMan.g:689:1: rule__Book__Group__10__Impl : ( 'Pages' ) ;
    public final void rule__Book__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLitMan.g:693:1: ( ( 'Pages' ) )
            // InternalLitMan.g:694:1: ( 'Pages' )
            {
            // InternalLitMan.g:694:1: ( 'Pages' )
            // InternalLitMan.g:695:2: 'Pages'
            {
             before(grammarAccess.getBookAccess().getPagesKeyword_10()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getBookAccess().getPagesKeyword_10()); 

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
    // $ANTLR end "rule__Book__Group__10__Impl"


    // $ANTLR start "rule__Book__Group__11"
    // InternalLitMan.g:704:1: rule__Book__Group__11 : rule__Book__Group__11__Impl rule__Book__Group__12 ;
    public final void rule__Book__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLitMan.g:708:1: ( rule__Book__Group__11__Impl rule__Book__Group__12 )
            // InternalLitMan.g:709:2: rule__Book__Group__11__Impl rule__Book__Group__12
            {
            pushFollow(FOLLOW_14);
            rule__Book__Group__11__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Book__Group__12();

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
    // $ANTLR end "rule__Book__Group__11"


    // $ANTLR start "rule__Book__Group__11__Impl"
    // InternalLitMan.g:716:1: rule__Book__Group__11__Impl : ( '=>' ) ;
    public final void rule__Book__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLitMan.g:720:1: ( ( '=>' ) )
            // InternalLitMan.g:721:1: ( '=>' )
            {
            // InternalLitMan.g:721:1: ( '=>' )
            // InternalLitMan.g:722:2: '=>'
            {
             before(grammarAccess.getBookAccess().getEqualsSignGreaterThanSignKeyword_11()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getBookAccess().getEqualsSignGreaterThanSignKeyword_11()); 

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
    // $ANTLR end "rule__Book__Group__11__Impl"


    // $ANTLR start "rule__Book__Group__12"
    // InternalLitMan.g:731:1: rule__Book__Group__12 : rule__Book__Group__12__Impl rule__Book__Group__13 ;
    public final void rule__Book__Group__12() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLitMan.g:735:1: ( rule__Book__Group__12__Impl rule__Book__Group__13 )
            // InternalLitMan.g:736:2: rule__Book__Group__12__Impl rule__Book__Group__13
            {
            pushFollow(FOLLOW_15);
            rule__Book__Group__12__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Book__Group__13();

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
    // $ANTLR end "rule__Book__Group__12"


    // $ANTLR start "rule__Book__Group__12__Impl"
    // InternalLitMan.g:743:1: rule__Book__Group__12__Impl : ( ( rule__Book__PagesAssignment_12 ) ) ;
    public final void rule__Book__Group__12__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLitMan.g:747:1: ( ( ( rule__Book__PagesAssignment_12 ) ) )
            // InternalLitMan.g:748:1: ( ( rule__Book__PagesAssignment_12 ) )
            {
            // InternalLitMan.g:748:1: ( ( rule__Book__PagesAssignment_12 ) )
            // InternalLitMan.g:749:2: ( rule__Book__PagesAssignment_12 )
            {
             before(grammarAccess.getBookAccess().getPagesAssignment_12()); 
            // InternalLitMan.g:750:2: ( rule__Book__PagesAssignment_12 )
            // InternalLitMan.g:750:3: rule__Book__PagesAssignment_12
            {
            pushFollow(FOLLOW_2);
            rule__Book__PagesAssignment_12();

            state._fsp--;


            }

             after(grammarAccess.getBookAccess().getPagesAssignment_12()); 

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
    // $ANTLR end "rule__Book__Group__12__Impl"


    // $ANTLR start "rule__Book__Group__13"
    // InternalLitMan.g:758:1: rule__Book__Group__13 : rule__Book__Group__13__Impl rule__Book__Group__14 ;
    public final void rule__Book__Group__13() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLitMan.g:762:1: ( rule__Book__Group__13__Impl rule__Book__Group__14 )
            // InternalLitMan.g:763:2: rule__Book__Group__13__Impl rule__Book__Group__14
            {
            pushFollow(FOLLOW_7);
            rule__Book__Group__13__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Book__Group__14();

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
    // $ANTLR end "rule__Book__Group__13"


    // $ANTLR start "rule__Book__Group__13__Impl"
    // InternalLitMan.g:770:1: rule__Book__Group__13__Impl : ( 'Date' ) ;
    public final void rule__Book__Group__13__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLitMan.g:774:1: ( ( 'Date' ) )
            // InternalLitMan.g:775:1: ( 'Date' )
            {
            // InternalLitMan.g:775:1: ( 'Date' )
            // InternalLitMan.g:776:2: 'Date'
            {
             before(grammarAccess.getBookAccess().getDateKeyword_13()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getBookAccess().getDateKeyword_13()); 

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
    // $ANTLR end "rule__Book__Group__13__Impl"


    // $ANTLR start "rule__Book__Group__14"
    // InternalLitMan.g:785:1: rule__Book__Group__14 : rule__Book__Group__14__Impl rule__Book__Group__15 ;
    public final void rule__Book__Group__14() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLitMan.g:789:1: ( rule__Book__Group__14__Impl rule__Book__Group__15 )
            // InternalLitMan.g:790:2: rule__Book__Group__14__Impl rule__Book__Group__15
            {
            pushFollow(FOLLOW_14);
            rule__Book__Group__14__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Book__Group__15();

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
    // $ANTLR end "rule__Book__Group__14"


    // $ANTLR start "rule__Book__Group__14__Impl"
    // InternalLitMan.g:797:1: rule__Book__Group__14__Impl : ( '=>' ) ;
    public final void rule__Book__Group__14__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLitMan.g:801:1: ( ( '=>' ) )
            // InternalLitMan.g:802:1: ( '=>' )
            {
            // InternalLitMan.g:802:1: ( '=>' )
            // InternalLitMan.g:803:2: '=>'
            {
             before(grammarAccess.getBookAccess().getEqualsSignGreaterThanSignKeyword_14()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getBookAccess().getEqualsSignGreaterThanSignKeyword_14()); 

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
    // $ANTLR end "rule__Book__Group__14__Impl"


    // $ANTLR start "rule__Book__Group__15"
    // InternalLitMan.g:812:1: rule__Book__Group__15 : rule__Book__Group__15__Impl rule__Book__Group__16 ;
    public final void rule__Book__Group__15() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLitMan.g:816:1: ( rule__Book__Group__15__Impl rule__Book__Group__16 )
            // InternalLitMan.g:817:2: rule__Book__Group__15__Impl rule__Book__Group__16
            {
            pushFollow(FOLLOW_16);
            rule__Book__Group__15__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Book__Group__16();

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
    // $ANTLR end "rule__Book__Group__15"


    // $ANTLR start "rule__Book__Group__15__Impl"
    // InternalLitMan.g:824:1: rule__Book__Group__15__Impl : ( ( rule__Book__DateAssignment_15 ) ) ;
    public final void rule__Book__Group__15__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLitMan.g:828:1: ( ( ( rule__Book__DateAssignment_15 ) ) )
            // InternalLitMan.g:829:1: ( ( rule__Book__DateAssignment_15 ) )
            {
            // InternalLitMan.g:829:1: ( ( rule__Book__DateAssignment_15 ) )
            // InternalLitMan.g:830:2: ( rule__Book__DateAssignment_15 )
            {
             before(grammarAccess.getBookAccess().getDateAssignment_15()); 
            // InternalLitMan.g:831:2: ( rule__Book__DateAssignment_15 )
            // InternalLitMan.g:831:3: rule__Book__DateAssignment_15
            {
            pushFollow(FOLLOW_2);
            rule__Book__DateAssignment_15();

            state._fsp--;


            }

             after(grammarAccess.getBookAccess().getDateAssignment_15()); 

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
    // $ANTLR end "rule__Book__Group__15__Impl"


    // $ANTLR start "rule__Book__Group__16"
    // InternalLitMan.g:839:1: rule__Book__Group__16 : rule__Book__Group__16__Impl ;
    public final void rule__Book__Group__16() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLitMan.g:843:1: ( rule__Book__Group__16__Impl )
            // InternalLitMan.g:844:2: rule__Book__Group__16__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Book__Group__16__Impl();

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
    // $ANTLR end "rule__Book__Group__16"


    // $ANTLR start "rule__Book__Group__16__Impl"
    // InternalLitMan.g:850:1: rule__Book__Group__16__Impl : ( '}' ) ;
    public final void rule__Book__Group__16__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLitMan.g:854:1: ( ( '}' ) )
            // InternalLitMan.g:855:1: ( '}' )
            {
            // InternalLitMan.g:855:1: ( '}' )
            // InternalLitMan.g:856:2: '}'
            {
             before(grammarAccess.getBookAccess().getRightCurlyBracketKeyword_16()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getBookAccess().getRightCurlyBracketKeyword_16()); 

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
    // $ANTLR end "rule__Book__Group__16__Impl"


    // $ANTLR start "rule__JournalArticle__Group__0"
    // InternalLitMan.g:866:1: rule__JournalArticle__Group__0 : rule__JournalArticle__Group__0__Impl rule__JournalArticle__Group__1 ;
    public final void rule__JournalArticle__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLitMan.g:870:1: ( rule__JournalArticle__Group__0__Impl rule__JournalArticle__Group__1 )
            // InternalLitMan.g:871:2: rule__JournalArticle__Group__0__Impl rule__JournalArticle__Group__1
            {
            pushFollow(FOLLOW_5);
            rule__JournalArticle__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__JournalArticle__Group__1();

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
    // $ANTLR end "rule__JournalArticle__Group__0"


    // $ANTLR start "rule__JournalArticle__Group__0__Impl"
    // InternalLitMan.g:878:1: rule__JournalArticle__Group__0__Impl : ( 'Article' ) ;
    public final void rule__JournalArticle__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLitMan.g:882:1: ( ( 'Article' ) )
            // InternalLitMan.g:883:1: ( 'Article' )
            {
            // InternalLitMan.g:883:1: ( 'Article' )
            // InternalLitMan.g:884:2: 'Article'
            {
             before(grammarAccess.getJournalArticleAccess().getArticleKeyword_0()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getJournalArticleAccess().getArticleKeyword_0()); 

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
    // $ANTLR end "rule__JournalArticle__Group__0__Impl"


    // $ANTLR start "rule__JournalArticle__Group__1"
    // InternalLitMan.g:893:1: rule__JournalArticle__Group__1 : rule__JournalArticle__Group__1__Impl rule__JournalArticle__Group__2 ;
    public final void rule__JournalArticle__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLitMan.g:897:1: ( rule__JournalArticle__Group__1__Impl rule__JournalArticle__Group__2 )
            // InternalLitMan.g:898:2: rule__JournalArticle__Group__1__Impl rule__JournalArticle__Group__2
            {
            pushFollow(FOLLOW_6);
            rule__JournalArticle__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__JournalArticle__Group__2();

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
    // $ANTLR end "rule__JournalArticle__Group__1"


    // $ANTLR start "rule__JournalArticle__Group__1__Impl"
    // InternalLitMan.g:905:1: rule__JournalArticle__Group__1__Impl : ( '{' ) ;
    public final void rule__JournalArticle__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLitMan.g:909:1: ( ( '{' ) )
            // InternalLitMan.g:910:1: ( '{' )
            {
            // InternalLitMan.g:910:1: ( '{' )
            // InternalLitMan.g:911:2: '{'
            {
             before(grammarAccess.getJournalArticleAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getJournalArticleAccess().getLeftCurlyBracketKeyword_1()); 

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
    // $ANTLR end "rule__JournalArticle__Group__1__Impl"


    // $ANTLR start "rule__JournalArticle__Group__2"
    // InternalLitMan.g:920:1: rule__JournalArticle__Group__2 : rule__JournalArticle__Group__2__Impl rule__JournalArticle__Group__3 ;
    public final void rule__JournalArticle__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLitMan.g:924:1: ( rule__JournalArticle__Group__2__Impl rule__JournalArticle__Group__3 )
            // InternalLitMan.g:925:2: rule__JournalArticle__Group__2__Impl rule__JournalArticle__Group__3
            {
            pushFollow(FOLLOW_7);
            rule__JournalArticle__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__JournalArticle__Group__3();

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
    // $ANTLR end "rule__JournalArticle__Group__2"


    // $ANTLR start "rule__JournalArticle__Group__2__Impl"
    // InternalLitMan.g:932:1: rule__JournalArticle__Group__2__Impl : ( 'Title' ) ;
    public final void rule__JournalArticle__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLitMan.g:936:1: ( ( 'Title' ) )
            // InternalLitMan.g:937:1: ( 'Title' )
            {
            // InternalLitMan.g:937:1: ( 'Title' )
            // InternalLitMan.g:938:2: 'Title'
            {
             before(grammarAccess.getJournalArticleAccess().getTitleKeyword_2()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getJournalArticleAccess().getTitleKeyword_2()); 

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
    // $ANTLR end "rule__JournalArticle__Group__2__Impl"


    // $ANTLR start "rule__JournalArticle__Group__3"
    // InternalLitMan.g:947:1: rule__JournalArticle__Group__3 : rule__JournalArticle__Group__3__Impl rule__JournalArticle__Group__4 ;
    public final void rule__JournalArticle__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLitMan.g:951:1: ( rule__JournalArticle__Group__3__Impl rule__JournalArticle__Group__4 )
            // InternalLitMan.g:952:2: rule__JournalArticle__Group__3__Impl rule__JournalArticle__Group__4
            {
            pushFollow(FOLLOW_8);
            rule__JournalArticle__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__JournalArticle__Group__4();

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
    // $ANTLR end "rule__JournalArticle__Group__3"


    // $ANTLR start "rule__JournalArticle__Group__3__Impl"
    // InternalLitMan.g:959:1: rule__JournalArticle__Group__3__Impl : ( '=>' ) ;
    public final void rule__JournalArticle__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLitMan.g:963:1: ( ( '=>' ) )
            // InternalLitMan.g:964:1: ( '=>' )
            {
            // InternalLitMan.g:964:1: ( '=>' )
            // InternalLitMan.g:965:2: '=>'
            {
             before(grammarAccess.getJournalArticleAccess().getEqualsSignGreaterThanSignKeyword_3()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getJournalArticleAccess().getEqualsSignGreaterThanSignKeyword_3()); 

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
    // $ANTLR end "rule__JournalArticle__Group__3__Impl"


    // $ANTLR start "rule__JournalArticle__Group__4"
    // InternalLitMan.g:974:1: rule__JournalArticle__Group__4 : rule__JournalArticle__Group__4__Impl rule__JournalArticle__Group__5 ;
    public final void rule__JournalArticle__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLitMan.g:978:1: ( rule__JournalArticle__Group__4__Impl rule__JournalArticle__Group__5 )
            // InternalLitMan.g:979:2: rule__JournalArticle__Group__4__Impl rule__JournalArticle__Group__5
            {
            pushFollow(FOLLOW_9);
            rule__JournalArticle__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__JournalArticle__Group__5();

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
    // $ANTLR end "rule__JournalArticle__Group__4"


    // $ANTLR start "rule__JournalArticle__Group__4__Impl"
    // InternalLitMan.g:986:1: rule__JournalArticle__Group__4__Impl : ( ( rule__JournalArticle__TitleAssignment_4 ) ) ;
    public final void rule__JournalArticle__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLitMan.g:990:1: ( ( ( rule__JournalArticle__TitleAssignment_4 ) ) )
            // InternalLitMan.g:991:1: ( ( rule__JournalArticle__TitleAssignment_4 ) )
            {
            // InternalLitMan.g:991:1: ( ( rule__JournalArticle__TitleAssignment_4 ) )
            // InternalLitMan.g:992:2: ( rule__JournalArticle__TitleAssignment_4 )
            {
             before(grammarAccess.getJournalArticleAccess().getTitleAssignment_4()); 
            // InternalLitMan.g:993:2: ( rule__JournalArticle__TitleAssignment_4 )
            // InternalLitMan.g:993:3: rule__JournalArticle__TitleAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__JournalArticle__TitleAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getJournalArticleAccess().getTitleAssignment_4()); 

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
    // $ANTLR end "rule__JournalArticle__Group__4__Impl"


    // $ANTLR start "rule__JournalArticle__Group__5"
    // InternalLitMan.g:1001:1: rule__JournalArticle__Group__5 : rule__JournalArticle__Group__5__Impl rule__JournalArticle__Group__6 ;
    public final void rule__JournalArticle__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLitMan.g:1005:1: ( rule__JournalArticle__Group__5__Impl rule__JournalArticle__Group__6 )
            // InternalLitMan.g:1006:2: rule__JournalArticle__Group__5__Impl rule__JournalArticle__Group__6
            {
            pushFollow(FOLLOW_7);
            rule__JournalArticle__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__JournalArticle__Group__6();

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
    // $ANTLR end "rule__JournalArticle__Group__5"


    // $ANTLR start "rule__JournalArticle__Group__5__Impl"
    // InternalLitMan.g:1013:1: rule__JournalArticle__Group__5__Impl : ( 'Authors' ) ;
    public final void rule__JournalArticle__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLitMan.g:1017:1: ( ( 'Authors' ) )
            // InternalLitMan.g:1018:1: ( 'Authors' )
            {
            // InternalLitMan.g:1018:1: ( 'Authors' )
            // InternalLitMan.g:1019:2: 'Authors'
            {
             before(grammarAccess.getJournalArticleAccess().getAuthorsKeyword_5()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getJournalArticleAccess().getAuthorsKeyword_5()); 

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
    // $ANTLR end "rule__JournalArticle__Group__5__Impl"


    // $ANTLR start "rule__JournalArticle__Group__6"
    // InternalLitMan.g:1028:1: rule__JournalArticle__Group__6 : rule__JournalArticle__Group__6__Impl rule__JournalArticle__Group__7 ;
    public final void rule__JournalArticle__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLitMan.g:1032:1: ( rule__JournalArticle__Group__6__Impl rule__JournalArticle__Group__7 )
            // InternalLitMan.g:1033:2: rule__JournalArticle__Group__6__Impl rule__JournalArticle__Group__7
            {
            pushFollow(FOLLOW_10);
            rule__JournalArticle__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__JournalArticle__Group__7();

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
    // $ANTLR end "rule__JournalArticle__Group__6"


    // $ANTLR start "rule__JournalArticle__Group__6__Impl"
    // InternalLitMan.g:1040:1: rule__JournalArticle__Group__6__Impl : ( '=>' ) ;
    public final void rule__JournalArticle__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLitMan.g:1044:1: ( ( '=>' ) )
            // InternalLitMan.g:1045:1: ( '=>' )
            {
            // InternalLitMan.g:1045:1: ( '=>' )
            // InternalLitMan.g:1046:2: '=>'
            {
             before(grammarAccess.getJournalArticleAccess().getEqualsSignGreaterThanSignKeyword_6()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getJournalArticleAccess().getEqualsSignGreaterThanSignKeyword_6()); 

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
    // $ANTLR end "rule__JournalArticle__Group__6__Impl"


    // $ANTLR start "rule__JournalArticle__Group__7"
    // InternalLitMan.g:1055:1: rule__JournalArticle__Group__7 : rule__JournalArticle__Group__7__Impl rule__JournalArticle__Group__8 ;
    public final void rule__JournalArticle__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLitMan.g:1059:1: ( rule__JournalArticle__Group__7__Impl rule__JournalArticle__Group__8 )
            // InternalLitMan.g:1060:2: rule__JournalArticle__Group__7__Impl rule__JournalArticle__Group__8
            {
            pushFollow(FOLLOW_11);
            rule__JournalArticle__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__JournalArticle__Group__8();

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
    // $ANTLR end "rule__JournalArticle__Group__7"


    // $ANTLR start "rule__JournalArticle__Group__7__Impl"
    // InternalLitMan.g:1067:1: rule__JournalArticle__Group__7__Impl : ( '[' ) ;
    public final void rule__JournalArticle__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLitMan.g:1071:1: ( ( '[' ) )
            // InternalLitMan.g:1072:1: ( '[' )
            {
            // InternalLitMan.g:1072:1: ( '[' )
            // InternalLitMan.g:1073:2: '['
            {
             before(grammarAccess.getJournalArticleAccess().getLeftSquareBracketKeyword_7()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getJournalArticleAccess().getLeftSquareBracketKeyword_7()); 

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
    // $ANTLR end "rule__JournalArticle__Group__7__Impl"


    // $ANTLR start "rule__JournalArticle__Group__8"
    // InternalLitMan.g:1082:1: rule__JournalArticle__Group__8 : rule__JournalArticle__Group__8__Impl rule__JournalArticle__Group__9 ;
    public final void rule__JournalArticle__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLitMan.g:1086:1: ( rule__JournalArticle__Group__8__Impl rule__JournalArticle__Group__9 )
            // InternalLitMan.g:1087:2: rule__JournalArticle__Group__8__Impl rule__JournalArticle__Group__9
            {
            pushFollow(FOLLOW_12);
            rule__JournalArticle__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__JournalArticle__Group__9();

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
    // $ANTLR end "rule__JournalArticle__Group__8"


    // $ANTLR start "rule__JournalArticle__Group__8__Impl"
    // InternalLitMan.g:1094:1: rule__JournalArticle__Group__8__Impl : ( ( rule__JournalArticle__AuthorsAssignment_8 ) ) ;
    public final void rule__JournalArticle__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLitMan.g:1098:1: ( ( ( rule__JournalArticle__AuthorsAssignment_8 ) ) )
            // InternalLitMan.g:1099:1: ( ( rule__JournalArticle__AuthorsAssignment_8 ) )
            {
            // InternalLitMan.g:1099:1: ( ( rule__JournalArticle__AuthorsAssignment_8 ) )
            // InternalLitMan.g:1100:2: ( rule__JournalArticle__AuthorsAssignment_8 )
            {
             before(grammarAccess.getJournalArticleAccess().getAuthorsAssignment_8()); 
            // InternalLitMan.g:1101:2: ( rule__JournalArticle__AuthorsAssignment_8 )
            // InternalLitMan.g:1101:3: rule__JournalArticle__AuthorsAssignment_8
            {
            pushFollow(FOLLOW_2);
            rule__JournalArticle__AuthorsAssignment_8();

            state._fsp--;


            }

             after(grammarAccess.getJournalArticleAccess().getAuthorsAssignment_8()); 

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
    // $ANTLR end "rule__JournalArticle__Group__8__Impl"


    // $ANTLR start "rule__JournalArticle__Group__9"
    // InternalLitMan.g:1109:1: rule__JournalArticle__Group__9 : rule__JournalArticle__Group__9__Impl rule__JournalArticle__Group__10 ;
    public final void rule__JournalArticle__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLitMan.g:1113:1: ( rule__JournalArticle__Group__9__Impl rule__JournalArticle__Group__10 )
            // InternalLitMan.g:1114:2: rule__JournalArticle__Group__9__Impl rule__JournalArticle__Group__10
            {
            pushFollow(FOLLOW_17);
            rule__JournalArticle__Group__9__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__JournalArticle__Group__10();

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
    // $ANTLR end "rule__JournalArticle__Group__9"


    // $ANTLR start "rule__JournalArticle__Group__9__Impl"
    // InternalLitMan.g:1121:1: rule__JournalArticle__Group__9__Impl : ( ']' ) ;
    public final void rule__JournalArticle__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLitMan.g:1125:1: ( ( ']' ) )
            // InternalLitMan.g:1126:1: ( ']' )
            {
            // InternalLitMan.g:1126:1: ( ']' )
            // InternalLitMan.g:1127:2: ']'
            {
             before(grammarAccess.getJournalArticleAccess().getRightSquareBracketKeyword_9()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getJournalArticleAccess().getRightSquareBracketKeyword_9()); 

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
    // $ANTLR end "rule__JournalArticle__Group__9__Impl"


    // $ANTLR start "rule__JournalArticle__Group__10"
    // InternalLitMan.g:1136:1: rule__JournalArticle__Group__10 : rule__JournalArticle__Group__10__Impl rule__JournalArticle__Group__11 ;
    public final void rule__JournalArticle__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLitMan.g:1140:1: ( rule__JournalArticle__Group__10__Impl rule__JournalArticle__Group__11 )
            // InternalLitMan.g:1141:2: rule__JournalArticle__Group__10__Impl rule__JournalArticle__Group__11
            {
            pushFollow(FOLLOW_7);
            rule__JournalArticle__Group__10__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__JournalArticle__Group__11();

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
    // $ANTLR end "rule__JournalArticle__Group__10"


    // $ANTLR start "rule__JournalArticle__Group__10__Impl"
    // InternalLitMan.g:1148:1: rule__JournalArticle__Group__10__Impl : ( 'Volume' ) ;
    public final void rule__JournalArticle__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLitMan.g:1152:1: ( ( 'Volume' ) )
            // InternalLitMan.g:1153:1: ( 'Volume' )
            {
            // InternalLitMan.g:1153:1: ( 'Volume' )
            // InternalLitMan.g:1154:2: 'Volume'
            {
             before(grammarAccess.getJournalArticleAccess().getVolumeKeyword_10()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getJournalArticleAccess().getVolumeKeyword_10()); 

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
    // $ANTLR end "rule__JournalArticle__Group__10__Impl"


    // $ANTLR start "rule__JournalArticle__Group__11"
    // InternalLitMan.g:1163:1: rule__JournalArticle__Group__11 : rule__JournalArticle__Group__11__Impl rule__JournalArticle__Group__12 ;
    public final void rule__JournalArticle__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLitMan.g:1167:1: ( rule__JournalArticle__Group__11__Impl rule__JournalArticle__Group__12 )
            // InternalLitMan.g:1168:2: rule__JournalArticle__Group__11__Impl rule__JournalArticle__Group__12
            {
            pushFollow(FOLLOW_14);
            rule__JournalArticle__Group__11__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__JournalArticle__Group__12();

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
    // $ANTLR end "rule__JournalArticle__Group__11"


    // $ANTLR start "rule__JournalArticle__Group__11__Impl"
    // InternalLitMan.g:1175:1: rule__JournalArticle__Group__11__Impl : ( '=>' ) ;
    public final void rule__JournalArticle__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLitMan.g:1179:1: ( ( '=>' ) )
            // InternalLitMan.g:1180:1: ( '=>' )
            {
            // InternalLitMan.g:1180:1: ( '=>' )
            // InternalLitMan.g:1181:2: '=>'
            {
             before(grammarAccess.getJournalArticleAccess().getEqualsSignGreaterThanSignKeyword_11()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getJournalArticleAccess().getEqualsSignGreaterThanSignKeyword_11()); 

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
    // $ANTLR end "rule__JournalArticle__Group__11__Impl"


    // $ANTLR start "rule__JournalArticle__Group__12"
    // InternalLitMan.g:1190:1: rule__JournalArticle__Group__12 : rule__JournalArticle__Group__12__Impl rule__JournalArticle__Group__13 ;
    public final void rule__JournalArticle__Group__12() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLitMan.g:1194:1: ( rule__JournalArticle__Group__12__Impl rule__JournalArticle__Group__13 )
            // InternalLitMan.g:1195:2: rule__JournalArticle__Group__12__Impl rule__JournalArticle__Group__13
            {
            pushFollow(FOLLOW_18);
            rule__JournalArticle__Group__12__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__JournalArticle__Group__13();

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
    // $ANTLR end "rule__JournalArticle__Group__12"


    // $ANTLR start "rule__JournalArticle__Group__12__Impl"
    // InternalLitMan.g:1202:1: rule__JournalArticle__Group__12__Impl : ( ( rule__JournalArticle__VolumeAssignment_12 ) ) ;
    public final void rule__JournalArticle__Group__12__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLitMan.g:1206:1: ( ( ( rule__JournalArticle__VolumeAssignment_12 ) ) )
            // InternalLitMan.g:1207:1: ( ( rule__JournalArticle__VolumeAssignment_12 ) )
            {
            // InternalLitMan.g:1207:1: ( ( rule__JournalArticle__VolumeAssignment_12 ) )
            // InternalLitMan.g:1208:2: ( rule__JournalArticle__VolumeAssignment_12 )
            {
             before(grammarAccess.getJournalArticleAccess().getVolumeAssignment_12()); 
            // InternalLitMan.g:1209:2: ( rule__JournalArticle__VolumeAssignment_12 )
            // InternalLitMan.g:1209:3: rule__JournalArticle__VolumeAssignment_12
            {
            pushFollow(FOLLOW_2);
            rule__JournalArticle__VolumeAssignment_12();

            state._fsp--;


            }

             after(grammarAccess.getJournalArticleAccess().getVolumeAssignment_12()); 

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
    // $ANTLR end "rule__JournalArticle__Group__12__Impl"


    // $ANTLR start "rule__JournalArticle__Group__13"
    // InternalLitMan.g:1217:1: rule__JournalArticle__Group__13 : rule__JournalArticle__Group__13__Impl rule__JournalArticle__Group__14 ;
    public final void rule__JournalArticle__Group__13() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLitMan.g:1221:1: ( rule__JournalArticle__Group__13__Impl rule__JournalArticle__Group__14 )
            // InternalLitMan.g:1222:2: rule__JournalArticle__Group__13__Impl rule__JournalArticle__Group__14
            {
            pushFollow(FOLLOW_7);
            rule__JournalArticle__Group__13__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__JournalArticle__Group__14();

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
    // $ANTLR end "rule__JournalArticle__Group__13"


    // $ANTLR start "rule__JournalArticle__Group__13__Impl"
    // InternalLitMan.g:1229:1: rule__JournalArticle__Group__13__Impl : ( 'Issue' ) ;
    public final void rule__JournalArticle__Group__13__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLitMan.g:1233:1: ( ( 'Issue' ) )
            // InternalLitMan.g:1234:1: ( 'Issue' )
            {
            // InternalLitMan.g:1234:1: ( 'Issue' )
            // InternalLitMan.g:1235:2: 'Issue'
            {
             before(grammarAccess.getJournalArticleAccess().getIssueKeyword_13()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getJournalArticleAccess().getIssueKeyword_13()); 

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
    // $ANTLR end "rule__JournalArticle__Group__13__Impl"


    // $ANTLR start "rule__JournalArticle__Group__14"
    // InternalLitMan.g:1244:1: rule__JournalArticle__Group__14 : rule__JournalArticle__Group__14__Impl rule__JournalArticle__Group__15 ;
    public final void rule__JournalArticle__Group__14() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLitMan.g:1248:1: ( rule__JournalArticle__Group__14__Impl rule__JournalArticle__Group__15 )
            // InternalLitMan.g:1249:2: rule__JournalArticle__Group__14__Impl rule__JournalArticle__Group__15
            {
            pushFollow(FOLLOW_14);
            rule__JournalArticle__Group__14__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__JournalArticle__Group__15();

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
    // $ANTLR end "rule__JournalArticle__Group__14"


    // $ANTLR start "rule__JournalArticle__Group__14__Impl"
    // InternalLitMan.g:1256:1: rule__JournalArticle__Group__14__Impl : ( '=>' ) ;
    public final void rule__JournalArticle__Group__14__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLitMan.g:1260:1: ( ( '=>' ) )
            // InternalLitMan.g:1261:1: ( '=>' )
            {
            // InternalLitMan.g:1261:1: ( '=>' )
            // InternalLitMan.g:1262:2: '=>'
            {
             before(grammarAccess.getJournalArticleAccess().getEqualsSignGreaterThanSignKeyword_14()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getJournalArticleAccess().getEqualsSignGreaterThanSignKeyword_14()); 

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
    // $ANTLR end "rule__JournalArticle__Group__14__Impl"


    // $ANTLR start "rule__JournalArticle__Group__15"
    // InternalLitMan.g:1271:1: rule__JournalArticle__Group__15 : rule__JournalArticle__Group__15__Impl rule__JournalArticle__Group__16 ;
    public final void rule__JournalArticle__Group__15() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLitMan.g:1275:1: ( rule__JournalArticle__Group__15__Impl rule__JournalArticle__Group__16 )
            // InternalLitMan.g:1276:2: rule__JournalArticle__Group__15__Impl rule__JournalArticle__Group__16
            {
            pushFollow(FOLLOW_13);
            rule__JournalArticle__Group__15__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__JournalArticle__Group__16();

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
    // $ANTLR end "rule__JournalArticle__Group__15"


    // $ANTLR start "rule__JournalArticle__Group__15__Impl"
    // InternalLitMan.g:1283:1: rule__JournalArticle__Group__15__Impl : ( ( rule__JournalArticle__IssueAssignment_15 ) ) ;
    public final void rule__JournalArticle__Group__15__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLitMan.g:1287:1: ( ( ( rule__JournalArticle__IssueAssignment_15 ) ) )
            // InternalLitMan.g:1288:1: ( ( rule__JournalArticle__IssueAssignment_15 ) )
            {
            // InternalLitMan.g:1288:1: ( ( rule__JournalArticle__IssueAssignment_15 ) )
            // InternalLitMan.g:1289:2: ( rule__JournalArticle__IssueAssignment_15 )
            {
             before(grammarAccess.getJournalArticleAccess().getIssueAssignment_15()); 
            // InternalLitMan.g:1290:2: ( rule__JournalArticle__IssueAssignment_15 )
            // InternalLitMan.g:1290:3: rule__JournalArticle__IssueAssignment_15
            {
            pushFollow(FOLLOW_2);
            rule__JournalArticle__IssueAssignment_15();

            state._fsp--;


            }

             after(grammarAccess.getJournalArticleAccess().getIssueAssignment_15()); 

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
    // $ANTLR end "rule__JournalArticle__Group__15__Impl"


    // $ANTLR start "rule__JournalArticle__Group__16"
    // InternalLitMan.g:1298:1: rule__JournalArticle__Group__16 : rule__JournalArticle__Group__16__Impl rule__JournalArticle__Group__17 ;
    public final void rule__JournalArticle__Group__16() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLitMan.g:1302:1: ( rule__JournalArticle__Group__16__Impl rule__JournalArticle__Group__17 )
            // InternalLitMan.g:1303:2: rule__JournalArticle__Group__16__Impl rule__JournalArticle__Group__17
            {
            pushFollow(FOLLOW_7);
            rule__JournalArticle__Group__16__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__JournalArticle__Group__17();

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
    // $ANTLR end "rule__JournalArticle__Group__16"


    // $ANTLR start "rule__JournalArticle__Group__16__Impl"
    // InternalLitMan.g:1310:1: rule__JournalArticle__Group__16__Impl : ( 'Pages' ) ;
    public final void rule__JournalArticle__Group__16__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLitMan.g:1314:1: ( ( 'Pages' ) )
            // InternalLitMan.g:1315:1: ( 'Pages' )
            {
            // InternalLitMan.g:1315:1: ( 'Pages' )
            // InternalLitMan.g:1316:2: 'Pages'
            {
             before(grammarAccess.getJournalArticleAccess().getPagesKeyword_16()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getJournalArticleAccess().getPagesKeyword_16()); 

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
    // $ANTLR end "rule__JournalArticle__Group__16__Impl"


    // $ANTLR start "rule__JournalArticle__Group__17"
    // InternalLitMan.g:1325:1: rule__JournalArticle__Group__17 : rule__JournalArticle__Group__17__Impl rule__JournalArticle__Group__18 ;
    public final void rule__JournalArticle__Group__17() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLitMan.g:1329:1: ( rule__JournalArticle__Group__17__Impl rule__JournalArticle__Group__18 )
            // InternalLitMan.g:1330:2: rule__JournalArticle__Group__17__Impl rule__JournalArticle__Group__18
            {
            pushFollow(FOLLOW_14);
            rule__JournalArticle__Group__17__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__JournalArticle__Group__18();

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
    // $ANTLR end "rule__JournalArticle__Group__17"


    // $ANTLR start "rule__JournalArticle__Group__17__Impl"
    // InternalLitMan.g:1337:1: rule__JournalArticle__Group__17__Impl : ( '=>' ) ;
    public final void rule__JournalArticle__Group__17__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLitMan.g:1341:1: ( ( '=>' ) )
            // InternalLitMan.g:1342:1: ( '=>' )
            {
            // InternalLitMan.g:1342:1: ( '=>' )
            // InternalLitMan.g:1343:2: '=>'
            {
             before(grammarAccess.getJournalArticleAccess().getEqualsSignGreaterThanSignKeyword_17()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getJournalArticleAccess().getEqualsSignGreaterThanSignKeyword_17()); 

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
    // $ANTLR end "rule__JournalArticle__Group__17__Impl"


    // $ANTLR start "rule__JournalArticle__Group__18"
    // InternalLitMan.g:1352:1: rule__JournalArticle__Group__18 : rule__JournalArticle__Group__18__Impl rule__JournalArticle__Group__19 ;
    public final void rule__JournalArticle__Group__18() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLitMan.g:1356:1: ( rule__JournalArticle__Group__18__Impl rule__JournalArticle__Group__19 )
            // InternalLitMan.g:1357:2: rule__JournalArticle__Group__18__Impl rule__JournalArticle__Group__19
            {
            pushFollow(FOLLOW_15);
            rule__JournalArticle__Group__18__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__JournalArticle__Group__19();

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
    // $ANTLR end "rule__JournalArticle__Group__18"


    // $ANTLR start "rule__JournalArticle__Group__18__Impl"
    // InternalLitMan.g:1364:1: rule__JournalArticle__Group__18__Impl : ( ( rule__JournalArticle__PagesAssignment_18 ) ) ;
    public final void rule__JournalArticle__Group__18__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLitMan.g:1368:1: ( ( ( rule__JournalArticle__PagesAssignment_18 ) ) )
            // InternalLitMan.g:1369:1: ( ( rule__JournalArticle__PagesAssignment_18 ) )
            {
            // InternalLitMan.g:1369:1: ( ( rule__JournalArticle__PagesAssignment_18 ) )
            // InternalLitMan.g:1370:2: ( rule__JournalArticle__PagesAssignment_18 )
            {
             before(grammarAccess.getJournalArticleAccess().getPagesAssignment_18()); 
            // InternalLitMan.g:1371:2: ( rule__JournalArticle__PagesAssignment_18 )
            // InternalLitMan.g:1371:3: rule__JournalArticle__PagesAssignment_18
            {
            pushFollow(FOLLOW_2);
            rule__JournalArticle__PagesAssignment_18();

            state._fsp--;


            }

             after(grammarAccess.getJournalArticleAccess().getPagesAssignment_18()); 

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
    // $ANTLR end "rule__JournalArticle__Group__18__Impl"


    // $ANTLR start "rule__JournalArticle__Group__19"
    // InternalLitMan.g:1379:1: rule__JournalArticle__Group__19 : rule__JournalArticle__Group__19__Impl rule__JournalArticle__Group__20 ;
    public final void rule__JournalArticle__Group__19() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLitMan.g:1383:1: ( rule__JournalArticle__Group__19__Impl rule__JournalArticle__Group__20 )
            // InternalLitMan.g:1384:2: rule__JournalArticle__Group__19__Impl rule__JournalArticle__Group__20
            {
            pushFollow(FOLLOW_7);
            rule__JournalArticle__Group__19__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__JournalArticle__Group__20();

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
    // $ANTLR end "rule__JournalArticle__Group__19"


    // $ANTLR start "rule__JournalArticle__Group__19__Impl"
    // InternalLitMan.g:1391:1: rule__JournalArticle__Group__19__Impl : ( 'Date' ) ;
    public final void rule__JournalArticle__Group__19__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLitMan.g:1395:1: ( ( 'Date' ) )
            // InternalLitMan.g:1396:1: ( 'Date' )
            {
            // InternalLitMan.g:1396:1: ( 'Date' )
            // InternalLitMan.g:1397:2: 'Date'
            {
             before(grammarAccess.getJournalArticleAccess().getDateKeyword_19()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getJournalArticleAccess().getDateKeyword_19()); 

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
    // $ANTLR end "rule__JournalArticle__Group__19__Impl"


    // $ANTLR start "rule__JournalArticle__Group__20"
    // InternalLitMan.g:1406:1: rule__JournalArticle__Group__20 : rule__JournalArticle__Group__20__Impl rule__JournalArticle__Group__21 ;
    public final void rule__JournalArticle__Group__20() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLitMan.g:1410:1: ( rule__JournalArticle__Group__20__Impl rule__JournalArticle__Group__21 )
            // InternalLitMan.g:1411:2: rule__JournalArticle__Group__20__Impl rule__JournalArticle__Group__21
            {
            pushFollow(FOLLOW_14);
            rule__JournalArticle__Group__20__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__JournalArticle__Group__21();

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
    // $ANTLR end "rule__JournalArticle__Group__20"


    // $ANTLR start "rule__JournalArticle__Group__20__Impl"
    // InternalLitMan.g:1418:1: rule__JournalArticle__Group__20__Impl : ( '=>' ) ;
    public final void rule__JournalArticle__Group__20__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLitMan.g:1422:1: ( ( '=>' ) )
            // InternalLitMan.g:1423:1: ( '=>' )
            {
            // InternalLitMan.g:1423:1: ( '=>' )
            // InternalLitMan.g:1424:2: '=>'
            {
             before(grammarAccess.getJournalArticleAccess().getEqualsSignGreaterThanSignKeyword_20()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getJournalArticleAccess().getEqualsSignGreaterThanSignKeyword_20()); 

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
    // $ANTLR end "rule__JournalArticle__Group__20__Impl"


    // $ANTLR start "rule__JournalArticle__Group__21"
    // InternalLitMan.g:1433:1: rule__JournalArticle__Group__21 : rule__JournalArticle__Group__21__Impl rule__JournalArticle__Group__22 ;
    public final void rule__JournalArticle__Group__21() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLitMan.g:1437:1: ( rule__JournalArticle__Group__21__Impl rule__JournalArticle__Group__22 )
            // InternalLitMan.g:1438:2: rule__JournalArticle__Group__21__Impl rule__JournalArticle__Group__22
            {
            pushFollow(FOLLOW_16);
            rule__JournalArticle__Group__21__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__JournalArticle__Group__22();

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
    // $ANTLR end "rule__JournalArticle__Group__21"


    // $ANTLR start "rule__JournalArticle__Group__21__Impl"
    // InternalLitMan.g:1445:1: rule__JournalArticle__Group__21__Impl : ( ( rule__JournalArticle__DateAssignment_21 ) ) ;
    public final void rule__JournalArticle__Group__21__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLitMan.g:1449:1: ( ( ( rule__JournalArticle__DateAssignment_21 ) ) )
            // InternalLitMan.g:1450:1: ( ( rule__JournalArticle__DateAssignment_21 ) )
            {
            // InternalLitMan.g:1450:1: ( ( rule__JournalArticle__DateAssignment_21 ) )
            // InternalLitMan.g:1451:2: ( rule__JournalArticle__DateAssignment_21 )
            {
             before(grammarAccess.getJournalArticleAccess().getDateAssignment_21()); 
            // InternalLitMan.g:1452:2: ( rule__JournalArticle__DateAssignment_21 )
            // InternalLitMan.g:1452:3: rule__JournalArticle__DateAssignment_21
            {
            pushFollow(FOLLOW_2);
            rule__JournalArticle__DateAssignment_21();

            state._fsp--;


            }

             after(grammarAccess.getJournalArticleAccess().getDateAssignment_21()); 

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
    // $ANTLR end "rule__JournalArticle__Group__21__Impl"


    // $ANTLR start "rule__JournalArticle__Group__22"
    // InternalLitMan.g:1460:1: rule__JournalArticle__Group__22 : rule__JournalArticle__Group__22__Impl ;
    public final void rule__JournalArticle__Group__22() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLitMan.g:1464:1: ( rule__JournalArticle__Group__22__Impl )
            // InternalLitMan.g:1465:2: rule__JournalArticle__Group__22__Impl
            {
            pushFollow(FOLLOW_2);
            rule__JournalArticle__Group__22__Impl();

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
    // $ANTLR end "rule__JournalArticle__Group__22"


    // $ANTLR start "rule__JournalArticle__Group__22__Impl"
    // InternalLitMan.g:1471:1: rule__JournalArticle__Group__22__Impl : ( '}' ) ;
    public final void rule__JournalArticle__Group__22__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLitMan.g:1475:1: ( ( '}' ) )
            // InternalLitMan.g:1476:1: ( '}' )
            {
            // InternalLitMan.g:1476:1: ( '}' )
            // InternalLitMan.g:1477:2: '}'
            {
             before(grammarAccess.getJournalArticleAccess().getRightCurlyBracketKeyword_22()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getJournalArticleAccess().getRightCurlyBracketKeyword_22()); 

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
    // $ANTLR end "rule__JournalArticle__Group__22__Impl"


    // $ANTLR start "rule__Author__Group__0"
    // InternalLitMan.g:1487:1: rule__Author__Group__0 : rule__Author__Group__0__Impl rule__Author__Group__1 ;
    public final void rule__Author__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLitMan.g:1491:1: ( rule__Author__Group__0__Impl rule__Author__Group__1 )
            // InternalLitMan.g:1492:2: rule__Author__Group__0__Impl rule__Author__Group__1
            {
            pushFollow(FOLLOW_8);
            rule__Author__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Author__Group__1();

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
    // $ANTLR end "rule__Author__Group__0"


    // $ANTLR start "rule__Author__Group__0__Impl"
    // InternalLitMan.g:1499:1: rule__Author__Group__0__Impl : ( 'f' ) ;
    public final void rule__Author__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLitMan.g:1503:1: ( ( 'f' ) )
            // InternalLitMan.g:1504:1: ( 'f' )
            {
            // InternalLitMan.g:1504:1: ( 'f' )
            // InternalLitMan.g:1505:2: 'f'
            {
             before(grammarAccess.getAuthorAccess().getFKeyword_0()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getAuthorAccess().getFKeyword_0()); 

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
    // $ANTLR end "rule__Author__Group__0__Impl"


    // $ANTLR start "rule__Author__Group__1"
    // InternalLitMan.g:1514:1: rule__Author__Group__1 : rule__Author__Group__1__Impl rule__Author__Group__2 ;
    public final void rule__Author__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLitMan.g:1518:1: ( rule__Author__Group__1__Impl rule__Author__Group__2 )
            // InternalLitMan.g:1519:2: rule__Author__Group__1__Impl rule__Author__Group__2
            {
            pushFollow(FOLLOW_19);
            rule__Author__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Author__Group__2();

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
    // $ANTLR end "rule__Author__Group__1"


    // $ANTLR start "rule__Author__Group__1__Impl"
    // InternalLitMan.g:1526:1: rule__Author__Group__1__Impl : ( ( rule__Author__FirstnameAssignment_1 ) ) ;
    public final void rule__Author__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLitMan.g:1530:1: ( ( ( rule__Author__FirstnameAssignment_1 ) ) )
            // InternalLitMan.g:1531:1: ( ( rule__Author__FirstnameAssignment_1 ) )
            {
            // InternalLitMan.g:1531:1: ( ( rule__Author__FirstnameAssignment_1 ) )
            // InternalLitMan.g:1532:2: ( rule__Author__FirstnameAssignment_1 )
            {
             before(grammarAccess.getAuthorAccess().getFirstnameAssignment_1()); 
            // InternalLitMan.g:1533:2: ( rule__Author__FirstnameAssignment_1 )
            // InternalLitMan.g:1533:3: rule__Author__FirstnameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Author__FirstnameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getAuthorAccess().getFirstnameAssignment_1()); 

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
    // $ANTLR end "rule__Author__Group__1__Impl"


    // $ANTLR start "rule__Author__Group__2"
    // InternalLitMan.g:1541:1: rule__Author__Group__2 : rule__Author__Group__2__Impl rule__Author__Group__3 ;
    public final void rule__Author__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLitMan.g:1545:1: ( rule__Author__Group__2__Impl rule__Author__Group__3 )
            // InternalLitMan.g:1546:2: rule__Author__Group__2__Impl rule__Author__Group__3
            {
            pushFollow(FOLLOW_8);
            rule__Author__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Author__Group__3();

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
    // $ANTLR end "rule__Author__Group__2"


    // $ANTLR start "rule__Author__Group__2__Impl"
    // InternalLitMan.g:1553:1: rule__Author__Group__2__Impl : ( 'l' ) ;
    public final void rule__Author__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLitMan.g:1557:1: ( ( 'l' ) )
            // InternalLitMan.g:1558:1: ( 'l' )
            {
            // InternalLitMan.g:1558:1: ( 'l' )
            // InternalLitMan.g:1559:2: 'l'
            {
             before(grammarAccess.getAuthorAccess().getLKeyword_2()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getAuthorAccess().getLKeyword_2()); 

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
    // $ANTLR end "rule__Author__Group__2__Impl"


    // $ANTLR start "rule__Author__Group__3"
    // InternalLitMan.g:1568:1: rule__Author__Group__3 : rule__Author__Group__3__Impl ;
    public final void rule__Author__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLitMan.g:1572:1: ( rule__Author__Group__3__Impl )
            // InternalLitMan.g:1573:2: rule__Author__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Author__Group__3__Impl();

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
    // $ANTLR end "rule__Author__Group__3"


    // $ANTLR start "rule__Author__Group__3__Impl"
    // InternalLitMan.g:1579:1: rule__Author__Group__3__Impl : ( ( rule__Author__LastnameAssignment_3 ) ) ;
    public final void rule__Author__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLitMan.g:1583:1: ( ( ( rule__Author__LastnameAssignment_3 ) ) )
            // InternalLitMan.g:1584:1: ( ( rule__Author__LastnameAssignment_3 ) )
            {
            // InternalLitMan.g:1584:1: ( ( rule__Author__LastnameAssignment_3 ) )
            // InternalLitMan.g:1585:2: ( rule__Author__LastnameAssignment_3 )
            {
             before(grammarAccess.getAuthorAccess().getLastnameAssignment_3()); 
            // InternalLitMan.g:1586:2: ( rule__Author__LastnameAssignment_3 )
            // InternalLitMan.g:1586:3: rule__Author__LastnameAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Author__LastnameAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getAuthorAccess().getLastnameAssignment_3()); 

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
    // $ANTLR end "rule__Author__Group__3__Impl"


    // $ANTLR start "rule__ListAuthors__Group__0"
    // InternalLitMan.g:1595:1: rule__ListAuthors__Group__0 : rule__ListAuthors__Group__0__Impl rule__ListAuthors__Group__1 ;
    public final void rule__ListAuthors__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLitMan.g:1599:1: ( rule__ListAuthors__Group__0__Impl rule__ListAuthors__Group__1 )
            // InternalLitMan.g:1600:2: rule__ListAuthors__Group__0__Impl rule__ListAuthors__Group__1
            {
            pushFollow(FOLLOW_20);
            rule__ListAuthors__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ListAuthors__Group__1();

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
    // $ANTLR end "rule__ListAuthors__Group__0"


    // $ANTLR start "rule__ListAuthors__Group__0__Impl"
    // InternalLitMan.g:1607:1: rule__ListAuthors__Group__0__Impl : ( ( rule__ListAuthors__AuthorsAssignment_0 ) ) ;
    public final void rule__ListAuthors__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLitMan.g:1611:1: ( ( ( rule__ListAuthors__AuthorsAssignment_0 ) ) )
            // InternalLitMan.g:1612:1: ( ( rule__ListAuthors__AuthorsAssignment_0 ) )
            {
            // InternalLitMan.g:1612:1: ( ( rule__ListAuthors__AuthorsAssignment_0 ) )
            // InternalLitMan.g:1613:2: ( rule__ListAuthors__AuthorsAssignment_0 )
            {
             before(grammarAccess.getListAuthorsAccess().getAuthorsAssignment_0()); 
            // InternalLitMan.g:1614:2: ( rule__ListAuthors__AuthorsAssignment_0 )
            // InternalLitMan.g:1614:3: rule__ListAuthors__AuthorsAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__ListAuthors__AuthorsAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getListAuthorsAccess().getAuthorsAssignment_0()); 

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
    // $ANTLR end "rule__ListAuthors__Group__0__Impl"


    // $ANTLR start "rule__ListAuthors__Group__1"
    // InternalLitMan.g:1622:1: rule__ListAuthors__Group__1 : rule__ListAuthors__Group__1__Impl ;
    public final void rule__ListAuthors__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLitMan.g:1626:1: ( rule__ListAuthors__Group__1__Impl )
            // InternalLitMan.g:1627:2: rule__ListAuthors__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ListAuthors__Group__1__Impl();

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
    // $ANTLR end "rule__ListAuthors__Group__1"


    // $ANTLR start "rule__ListAuthors__Group__1__Impl"
    // InternalLitMan.g:1633:1: rule__ListAuthors__Group__1__Impl : ( ( ',' )? ) ;
    public final void rule__ListAuthors__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLitMan.g:1637:1: ( ( ( ',' )? ) )
            // InternalLitMan.g:1638:1: ( ( ',' )? )
            {
            // InternalLitMan.g:1638:1: ( ( ',' )? )
            // InternalLitMan.g:1639:2: ( ',' )?
            {
             before(grammarAccess.getListAuthorsAccess().getCommaKeyword_1()); 
            // InternalLitMan.g:1640:2: ( ',' )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==26) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalLitMan.g:1640:3: ','
                    {
                    match(input,26,FOLLOW_2); 

                    }
                    break;

            }

             after(grammarAccess.getListAuthorsAccess().getCommaKeyword_1()); 

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
    // $ANTLR end "rule__ListAuthors__Group__1__Impl"


    // $ANTLR start "rule__PageRange__Group__0"
    // InternalLitMan.g:1649:1: rule__PageRange__Group__0 : rule__PageRange__Group__0__Impl rule__PageRange__Group__1 ;
    public final void rule__PageRange__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLitMan.g:1653:1: ( rule__PageRange__Group__0__Impl rule__PageRange__Group__1 )
            // InternalLitMan.g:1654:2: rule__PageRange__Group__0__Impl rule__PageRange__Group__1
            {
            pushFollow(FOLLOW_21);
            rule__PageRange__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PageRange__Group__1();

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
    // $ANTLR end "rule__PageRange__Group__0"


    // $ANTLR start "rule__PageRange__Group__0__Impl"
    // InternalLitMan.g:1661:1: rule__PageRange__Group__0__Impl : ( RULE_INT ) ;
    public final void rule__PageRange__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLitMan.g:1665:1: ( ( RULE_INT ) )
            // InternalLitMan.g:1666:1: ( RULE_INT )
            {
            // InternalLitMan.g:1666:1: ( RULE_INT )
            // InternalLitMan.g:1667:2: RULE_INT
            {
             before(grammarAccess.getPageRangeAccess().getINTTerminalRuleCall_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getPageRangeAccess().getINTTerminalRuleCall_0()); 

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
    // $ANTLR end "rule__PageRange__Group__0__Impl"


    // $ANTLR start "rule__PageRange__Group__1"
    // InternalLitMan.g:1676:1: rule__PageRange__Group__1 : rule__PageRange__Group__1__Impl rule__PageRange__Group__2 ;
    public final void rule__PageRange__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLitMan.g:1680:1: ( rule__PageRange__Group__1__Impl rule__PageRange__Group__2 )
            // InternalLitMan.g:1681:2: rule__PageRange__Group__1__Impl rule__PageRange__Group__2
            {
            pushFollow(FOLLOW_14);
            rule__PageRange__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PageRange__Group__2();

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
    // $ANTLR end "rule__PageRange__Group__1"


    // $ANTLR start "rule__PageRange__Group__1__Impl"
    // InternalLitMan.g:1688:1: rule__PageRange__Group__1__Impl : ( '-' ) ;
    public final void rule__PageRange__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLitMan.g:1692:1: ( ( '-' ) )
            // InternalLitMan.g:1693:1: ( '-' )
            {
            // InternalLitMan.g:1693:1: ( '-' )
            // InternalLitMan.g:1694:2: '-'
            {
             before(grammarAccess.getPageRangeAccess().getHyphenMinusKeyword_1()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getPageRangeAccess().getHyphenMinusKeyword_1()); 

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
    // $ANTLR end "rule__PageRange__Group__1__Impl"


    // $ANTLR start "rule__PageRange__Group__2"
    // InternalLitMan.g:1703:1: rule__PageRange__Group__2 : rule__PageRange__Group__2__Impl ;
    public final void rule__PageRange__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLitMan.g:1707:1: ( rule__PageRange__Group__2__Impl )
            // InternalLitMan.g:1708:2: rule__PageRange__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__PageRange__Group__2__Impl();

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
    // $ANTLR end "rule__PageRange__Group__2"


    // $ANTLR start "rule__PageRange__Group__2__Impl"
    // InternalLitMan.g:1714:1: rule__PageRange__Group__2__Impl : ( RULE_INT ) ;
    public final void rule__PageRange__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLitMan.g:1718:1: ( ( RULE_INT ) )
            // InternalLitMan.g:1719:1: ( RULE_INT )
            {
            // InternalLitMan.g:1719:1: ( RULE_INT )
            // InternalLitMan.g:1720:2: RULE_INT
            {
             before(grammarAccess.getPageRangeAccess().getINTTerminalRuleCall_2()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getPageRangeAccess().getINTTerminalRuleCall_2()); 

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
    // $ANTLR end "rule__PageRange__Group__2__Impl"


    // $ANTLR start "rule__Date__Group__0"
    // InternalLitMan.g:1730:1: rule__Date__Group__0 : rule__Date__Group__0__Impl rule__Date__Group__1 ;
    public final void rule__Date__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLitMan.g:1734:1: ( rule__Date__Group__0__Impl rule__Date__Group__1 )
            // InternalLitMan.g:1735:2: rule__Date__Group__0__Impl rule__Date__Group__1
            {
            pushFollow(FOLLOW_22);
            rule__Date__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Date__Group__1();

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
    // $ANTLR end "rule__Date__Group__0"


    // $ANTLR start "rule__Date__Group__0__Impl"
    // InternalLitMan.g:1742:1: rule__Date__Group__0__Impl : ( RULE_INT ) ;
    public final void rule__Date__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLitMan.g:1746:1: ( ( RULE_INT ) )
            // InternalLitMan.g:1747:1: ( RULE_INT )
            {
            // InternalLitMan.g:1747:1: ( RULE_INT )
            // InternalLitMan.g:1748:2: RULE_INT
            {
             before(grammarAccess.getDateAccess().getINTTerminalRuleCall_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getDateAccess().getINTTerminalRuleCall_0()); 

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
    // $ANTLR end "rule__Date__Group__0__Impl"


    // $ANTLR start "rule__Date__Group__1"
    // InternalLitMan.g:1757:1: rule__Date__Group__1 : rule__Date__Group__1__Impl rule__Date__Group__2 ;
    public final void rule__Date__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLitMan.g:1761:1: ( rule__Date__Group__1__Impl rule__Date__Group__2 )
            // InternalLitMan.g:1762:2: rule__Date__Group__1__Impl rule__Date__Group__2
            {
            pushFollow(FOLLOW_14);
            rule__Date__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Date__Group__2();

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
    // $ANTLR end "rule__Date__Group__1"


    // $ANTLR start "rule__Date__Group__1__Impl"
    // InternalLitMan.g:1769:1: rule__Date__Group__1__Impl : ( '.' ) ;
    public final void rule__Date__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLitMan.g:1773:1: ( ( '.' ) )
            // InternalLitMan.g:1774:1: ( '.' )
            {
            // InternalLitMan.g:1774:1: ( '.' )
            // InternalLitMan.g:1775:2: '.'
            {
             before(grammarAccess.getDateAccess().getFullStopKeyword_1()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getDateAccess().getFullStopKeyword_1()); 

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
    // $ANTLR end "rule__Date__Group__1__Impl"


    // $ANTLR start "rule__Date__Group__2"
    // InternalLitMan.g:1784:1: rule__Date__Group__2 : rule__Date__Group__2__Impl rule__Date__Group__3 ;
    public final void rule__Date__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLitMan.g:1788:1: ( rule__Date__Group__2__Impl rule__Date__Group__3 )
            // InternalLitMan.g:1789:2: rule__Date__Group__2__Impl rule__Date__Group__3
            {
            pushFollow(FOLLOW_22);
            rule__Date__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Date__Group__3();

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
    // $ANTLR end "rule__Date__Group__2"


    // $ANTLR start "rule__Date__Group__2__Impl"
    // InternalLitMan.g:1796:1: rule__Date__Group__2__Impl : ( RULE_INT ) ;
    public final void rule__Date__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLitMan.g:1800:1: ( ( RULE_INT ) )
            // InternalLitMan.g:1801:1: ( RULE_INT )
            {
            // InternalLitMan.g:1801:1: ( RULE_INT )
            // InternalLitMan.g:1802:2: RULE_INT
            {
             before(grammarAccess.getDateAccess().getINTTerminalRuleCall_2()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getDateAccess().getINTTerminalRuleCall_2()); 

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
    // $ANTLR end "rule__Date__Group__2__Impl"


    // $ANTLR start "rule__Date__Group__3"
    // InternalLitMan.g:1811:1: rule__Date__Group__3 : rule__Date__Group__3__Impl rule__Date__Group__4 ;
    public final void rule__Date__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLitMan.g:1815:1: ( rule__Date__Group__3__Impl rule__Date__Group__4 )
            // InternalLitMan.g:1816:2: rule__Date__Group__3__Impl rule__Date__Group__4
            {
            pushFollow(FOLLOW_14);
            rule__Date__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Date__Group__4();

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
    // $ANTLR end "rule__Date__Group__3"


    // $ANTLR start "rule__Date__Group__3__Impl"
    // InternalLitMan.g:1823:1: rule__Date__Group__3__Impl : ( '.' ) ;
    public final void rule__Date__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLitMan.g:1827:1: ( ( '.' ) )
            // InternalLitMan.g:1828:1: ( '.' )
            {
            // InternalLitMan.g:1828:1: ( '.' )
            // InternalLitMan.g:1829:2: '.'
            {
             before(grammarAccess.getDateAccess().getFullStopKeyword_3()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getDateAccess().getFullStopKeyword_3()); 

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
    // $ANTLR end "rule__Date__Group__3__Impl"


    // $ANTLR start "rule__Date__Group__4"
    // InternalLitMan.g:1838:1: rule__Date__Group__4 : rule__Date__Group__4__Impl ;
    public final void rule__Date__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLitMan.g:1842:1: ( rule__Date__Group__4__Impl )
            // InternalLitMan.g:1843:2: rule__Date__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Date__Group__4__Impl();

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
    // $ANTLR end "rule__Date__Group__4"


    // $ANTLR start "rule__Date__Group__4__Impl"
    // InternalLitMan.g:1849:1: rule__Date__Group__4__Impl : ( RULE_INT ) ;
    public final void rule__Date__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLitMan.g:1853:1: ( ( RULE_INT ) )
            // InternalLitMan.g:1854:1: ( RULE_INT )
            {
            // InternalLitMan.g:1854:1: ( RULE_INT )
            // InternalLitMan.g:1855:2: RULE_INT
            {
             before(grammarAccess.getDateAccess().getINTTerminalRuleCall_4()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getDateAccess().getINTTerminalRuleCall_4()); 

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
    // $ANTLR end "rule__Date__Group__4__Impl"


    // $ANTLR start "rule__LitMan__LiteraturAssignment"
    // InternalLitMan.g:1865:1: rule__LitMan__LiteraturAssignment : ( ruleLitTypes ) ;
    public final void rule__LitMan__LiteraturAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLitMan.g:1869:1: ( ( ruleLitTypes ) )
            // InternalLitMan.g:1870:2: ( ruleLitTypes )
            {
            // InternalLitMan.g:1870:2: ( ruleLitTypes )
            // InternalLitMan.g:1871:3: ruleLitTypes
            {
             before(grammarAccess.getLitManAccess().getLiteraturLitTypesParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleLitTypes();

            state._fsp--;

             after(grammarAccess.getLitManAccess().getLiteraturLitTypesParserRuleCall_0()); 

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
    // $ANTLR end "rule__LitMan__LiteraturAssignment"


    // $ANTLR start "rule__Book__TitleAssignment_4"
    // InternalLitMan.g:1880:1: rule__Book__TitleAssignment_4 : ( RULE_STRING ) ;
    public final void rule__Book__TitleAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLitMan.g:1884:1: ( ( RULE_STRING ) )
            // InternalLitMan.g:1885:2: ( RULE_STRING )
            {
            // InternalLitMan.g:1885:2: ( RULE_STRING )
            // InternalLitMan.g:1886:3: RULE_STRING
            {
             before(grammarAccess.getBookAccess().getTitleSTRINGTerminalRuleCall_4_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getBookAccess().getTitleSTRINGTerminalRuleCall_4_0()); 

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
    // $ANTLR end "rule__Book__TitleAssignment_4"


    // $ANTLR start "rule__Book__AuthorsAssignment_8"
    // InternalLitMan.g:1895:1: rule__Book__AuthorsAssignment_8 : ( ruleListAuthors ) ;
    public final void rule__Book__AuthorsAssignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLitMan.g:1899:1: ( ( ruleListAuthors ) )
            // InternalLitMan.g:1900:2: ( ruleListAuthors )
            {
            // InternalLitMan.g:1900:2: ( ruleListAuthors )
            // InternalLitMan.g:1901:3: ruleListAuthors
            {
             before(grammarAccess.getBookAccess().getAuthorsListAuthorsParserRuleCall_8_0()); 
            pushFollow(FOLLOW_2);
            ruleListAuthors();

            state._fsp--;

             after(grammarAccess.getBookAccess().getAuthorsListAuthorsParserRuleCall_8_0()); 

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
    // $ANTLR end "rule__Book__AuthorsAssignment_8"


    // $ANTLR start "rule__Book__PagesAssignment_12"
    // InternalLitMan.g:1910:1: rule__Book__PagesAssignment_12 : ( ( rule__Book__PagesAlternatives_12_0 ) ) ;
    public final void rule__Book__PagesAssignment_12() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLitMan.g:1914:1: ( ( ( rule__Book__PagesAlternatives_12_0 ) ) )
            // InternalLitMan.g:1915:2: ( ( rule__Book__PagesAlternatives_12_0 ) )
            {
            // InternalLitMan.g:1915:2: ( ( rule__Book__PagesAlternatives_12_0 ) )
            // InternalLitMan.g:1916:3: ( rule__Book__PagesAlternatives_12_0 )
            {
             before(grammarAccess.getBookAccess().getPagesAlternatives_12_0()); 
            // InternalLitMan.g:1917:3: ( rule__Book__PagesAlternatives_12_0 )
            // InternalLitMan.g:1917:4: rule__Book__PagesAlternatives_12_0
            {
            pushFollow(FOLLOW_2);
            rule__Book__PagesAlternatives_12_0();

            state._fsp--;


            }

             after(grammarAccess.getBookAccess().getPagesAlternatives_12_0()); 

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
    // $ANTLR end "rule__Book__PagesAssignment_12"


    // $ANTLR start "rule__Book__DateAssignment_15"
    // InternalLitMan.g:1925:1: rule__Book__DateAssignment_15 : ( ( rule__Book__DateAlternatives_15_0 ) ) ;
    public final void rule__Book__DateAssignment_15() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLitMan.g:1929:1: ( ( ( rule__Book__DateAlternatives_15_0 ) ) )
            // InternalLitMan.g:1930:2: ( ( rule__Book__DateAlternatives_15_0 ) )
            {
            // InternalLitMan.g:1930:2: ( ( rule__Book__DateAlternatives_15_0 ) )
            // InternalLitMan.g:1931:3: ( rule__Book__DateAlternatives_15_0 )
            {
             before(grammarAccess.getBookAccess().getDateAlternatives_15_0()); 
            // InternalLitMan.g:1932:3: ( rule__Book__DateAlternatives_15_0 )
            // InternalLitMan.g:1932:4: rule__Book__DateAlternatives_15_0
            {
            pushFollow(FOLLOW_2);
            rule__Book__DateAlternatives_15_0();

            state._fsp--;


            }

             after(grammarAccess.getBookAccess().getDateAlternatives_15_0()); 

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
    // $ANTLR end "rule__Book__DateAssignment_15"


    // $ANTLR start "rule__JournalArticle__TitleAssignment_4"
    // InternalLitMan.g:1940:1: rule__JournalArticle__TitleAssignment_4 : ( RULE_STRING ) ;
    public final void rule__JournalArticle__TitleAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLitMan.g:1944:1: ( ( RULE_STRING ) )
            // InternalLitMan.g:1945:2: ( RULE_STRING )
            {
            // InternalLitMan.g:1945:2: ( RULE_STRING )
            // InternalLitMan.g:1946:3: RULE_STRING
            {
             before(grammarAccess.getJournalArticleAccess().getTitleSTRINGTerminalRuleCall_4_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getJournalArticleAccess().getTitleSTRINGTerminalRuleCall_4_0()); 

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
    // $ANTLR end "rule__JournalArticle__TitleAssignment_4"


    // $ANTLR start "rule__JournalArticle__AuthorsAssignment_8"
    // InternalLitMan.g:1955:1: rule__JournalArticle__AuthorsAssignment_8 : ( ruleListAuthors ) ;
    public final void rule__JournalArticle__AuthorsAssignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLitMan.g:1959:1: ( ( ruleListAuthors ) )
            // InternalLitMan.g:1960:2: ( ruleListAuthors )
            {
            // InternalLitMan.g:1960:2: ( ruleListAuthors )
            // InternalLitMan.g:1961:3: ruleListAuthors
            {
             before(grammarAccess.getJournalArticleAccess().getAuthorsListAuthorsParserRuleCall_8_0()); 
            pushFollow(FOLLOW_2);
            ruleListAuthors();

            state._fsp--;

             after(grammarAccess.getJournalArticleAccess().getAuthorsListAuthorsParserRuleCall_8_0()); 

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
    // $ANTLR end "rule__JournalArticle__AuthorsAssignment_8"


    // $ANTLR start "rule__JournalArticle__VolumeAssignment_12"
    // InternalLitMan.g:1970:1: rule__JournalArticle__VolumeAssignment_12 : ( RULE_INT ) ;
    public final void rule__JournalArticle__VolumeAssignment_12() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLitMan.g:1974:1: ( ( RULE_INT ) )
            // InternalLitMan.g:1975:2: ( RULE_INT )
            {
            // InternalLitMan.g:1975:2: ( RULE_INT )
            // InternalLitMan.g:1976:3: RULE_INT
            {
             before(grammarAccess.getJournalArticleAccess().getVolumeINTTerminalRuleCall_12_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getJournalArticleAccess().getVolumeINTTerminalRuleCall_12_0()); 

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
    // $ANTLR end "rule__JournalArticle__VolumeAssignment_12"


    // $ANTLR start "rule__JournalArticle__IssueAssignment_15"
    // InternalLitMan.g:1985:1: rule__JournalArticle__IssueAssignment_15 : ( RULE_INT ) ;
    public final void rule__JournalArticle__IssueAssignment_15() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLitMan.g:1989:1: ( ( RULE_INT ) )
            // InternalLitMan.g:1990:2: ( RULE_INT )
            {
            // InternalLitMan.g:1990:2: ( RULE_INT )
            // InternalLitMan.g:1991:3: RULE_INT
            {
             before(grammarAccess.getJournalArticleAccess().getIssueINTTerminalRuleCall_15_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getJournalArticleAccess().getIssueINTTerminalRuleCall_15_0()); 

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
    // $ANTLR end "rule__JournalArticle__IssueAssignment_15"


    // $ANTLR start "rule__JournalArticle__PagesAssignment_18"
    // InternalLitMan.g:2000:1: rule__JournalArticle__PagesAssignment_18 : ( ( rule__JournalArticle__PagesAlternatives_18_0 ) ) ;
    public final void rule__JournalArticle__PagesAssignment_18() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLitMan.g:2004:1: ( ( ( rule__JournalArticle__PagesAlternatives_18_0 ) ) )
            // InternalLitMan.g:2005:2: ( ( rule__JournalArticle__PagesAlternatives_18_0 ) )
            {
            // InternalLitMan.g:2005:2: ( ( rule__JournalArticle__PagesAlternatives_18_0 ) )
            // InternalLitMan.g:2006:3: ( rule__JournalArticle__PagesAlternatives_18_0 )
            {
             before(grammarAccess.getJournalArticleAccess().getPagesAlternatives_18_0()); 
            // InternalLitMan.g:2007:3: ( rule__JournalArticle__PagesAlternatives_18_0 )
            // InternalLitMan.g:2007:4: rule__JournalArticle__PagesAlternatives_18_0
            {
            pushFollow(FOLLOW_2);
            rule__JournalArticle__PagesAlternatives_18_0();

            state._fsp--;


            }

             after(grammarAccess.getJournalArticleAccess().getPagesAlternatives_18_0()); 

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
    // $ANTLR end "rule__JournalArticle__PagesAssignment_18"


    // $ANTLR start "rule__JournalArticle__DateAssignment_21"
    // InternalLitMan.g:2015:1: rule__JournalArticle__DateAssignment_21 : ( ( rule__JournalArticle__DateAlternatives_21_0 ) ) ;
    public final void rule__JournalArticle__DateAssignment_21() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLitMan.g:2019:1: ( ( ( rule__JournalArticle__DateAlternatives_21_0 ) ) )
            // InternalLitMan.g:2020:2: ( ( rule__JournalArticle__DateAlternatives_21_0 ) )
            {
            // InternalLitMan.g:2020:2: ( ( rule__JournalArticle__DateAlternatives_21_0 ) )
            // InternalLitMan.g:2021:3: ( rule__JournalArticle__DateAlternatives_21_0 )
            {
             before(grammarAccess.getJournalArticleAccess().getDateAlternatives_21_0()); 
            // InternalLitMan.g:2022:3: ( rule__JournalArticle__DateAlternatives_21_0 )
            // InternalLitMan.g:2022:4: rule__JournalArticle__DateAlternatives_21_0
            {
            pushFollow(FOLLOW_2);
            rule__JournalArticle__DateAlternatives_21_0();

            state._fsp--;


            }

             after(grammarAccess.getJournalArticleAccess().getDateAlternatives_21_0()); 

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
    // $ANTLR end "rule__JournalArticle__DateAssignment_21"


    // $ANTLR start "rule__Author__FirstnameAssignment_1"
    // InternalLitMan.g:2030:1: rule__Author__FirstnameAssignment_1 : ( RULE_STRING ) ;
    public final void rule__Author__FirstnameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLitMan.g:2034:1: ( ( RULE_STRING ) )
            // InternalLitMan.g:2035:2: ( RULE_STRING )
            {
            // InternalLitMan.g:2035:2: ( RULE_STRING )
            // InternalLitMan.g:2036:3: RULE_STRING
            {
             before(grammarAccess.getAuthorAccess().getFirstnameSTRINGTerminalRuleCall_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getAuthorAccess().getFirstnameSTRINGTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__Author__FirstnameAssignment_1"


    // $ANTLR start "rule__Author__LastnameAssignment_3"
    // InternalLitMan.g:2045:1: rule__Author__LastnameAssignment_3 : ( RULE_STRING ) ;
    public final void rule__Author__LastnameAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLitMan.g:2049:1: ( ( RULE_STRING ) )
            // InternalLitMan.g:2050:2: ( RULE_STRING )
            {
            // InternalLitMan.g:2050:2: ( RULE_STRING )
            // InternalLitMan.g:2051:3: RULE_STRING
            {
             before(grammarAccess.getAuthorAccess().getLastnameSTRINGTerminalRuleCall_3_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getAuthorAccess().getLastnameSTRINGTerminalRuleCall_3_0()); 

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
    // $ANTLR end "rule__Author__LastnameAssignment_3"


    // $ANTLR start "rule__ListAuthors__AuthorsAssignment_0"
    // InternalLitMan.g:2060:1: rule__ListAuthors__AuthorsAssignment_0 : ( ruleAuthor ) ;
    public final void rule__ListAuthors__AuthorsAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLitMan.g:2064:1: ( ( ruleAuthor ) )
            // InternalLitMan.g:2065:2: ( ruleAuthor )
            {
            // InternalLitMan.g:2065:2: ( ruleAuthor )
            // InternalLitMan.g:2066:3: ruleAuthor
            {
             before(grammarAccess.getListAuthorsAccess().getAuthorsAuthorParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleAuthor();

            state._fsp--;

             after(grammarAccess.getListAuthorsAccess().getAuthorsAuthorParserRuleCall_0_0()); 

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
    // $ANTLR end "rule__ListAuthors__AuthorsAssignment_0"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000200802L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000001000002L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000010000000L});

}