/*
 * generated by Xtext 2.21.0
 */
package org.xtext.htwg.services;

import com.google.inject.Inject;
import com.google.inject.Singleton;
import java.util.List;
import org.eclipse.xtext.Alternatives;
import org.eclipse.xtext.Assignment;
import org.eclipse.xtext.Grammar;
import org.eclipse.xtext.GrammarUtil;
import org.eclipse.xtext.Group;
import org.eclipse.xtext.Keyword;
import org.eclipse.xtext.ParserRule;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.TerminalRule;
import org.eclipse.xtext.common.services.TerminalsGrammarAccess;
import org.eclipse.xtext.service.AbstractElementFinder.AbstractGrammarElementFinder;
import org.eclipse.xtext.service.GrammarProvider;

@Singleton
public class LitManGrammarAccess extends AbstractGrammarElementFinder {
	
	public class LitManElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.htwg.LitMan.LitMan");
		private final Assignment cLiteraturAssignment = (Assignment)rule.eContents().get(1);
		private final RuleCall cLiteraturLitTypesParserRuleCall_0 = (RuleCall)cLiteraturAssignment.eContents().get(0);
		
		//LitMan:
		//	literatur+=LitTypes*;
		@Override public ParserRule getRule() { return rule; }
		
		//literatur+=LitTypes*
		public Assignment getLiteraturAssignment() { return cLiteraturAssignment; }
		
		//LitTypes
		public RuleCall getLiteraturLitTypesParserRuleCall_0() { return cLiteraturLitTypesParserRuleCall_0; }
	}
	public class LitTypesElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.htwg.LitMan.LitTypes");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final RuleCall cBookParserRuleCall_0 = (RuleCall)cAlternatives.eContents().get(0);
		private final RuleCall cJournalArticleParserRuleCall_1 = (RuleCall)cAlternatives.eContents().get(1);
		
		//LitTypes:
		//	Book | JournalArticle;
		@Override public ParserRule getRule() { return rule; }
		
		//Book | JournalArticle
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//Book
		public RuleCall getBookParserRuleCall_0() { return cBookParserRuleCall_0; }
		
		//JournalArticle
		public RuleCall getJournalArticleParserRuleCall_1() { return cJournalArticleParserRuleCall_1; }
	}
	public class BookElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.htwg.LitMan.Book");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cBookKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Keyword cLeftCurlyBracketKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Keyword cTitleKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Keyword cEqualsSignGreaterThanSignKeyword_3 = (Keyword)cGroup.eContents().get(3);
		private final Assignment cTitleAssignment_4 = (Assignment)cGroup.eContents().get(4);
		private final RuleCall cTitleSTRINGTerminalRuleCall_4_0 = (RuleCall)cTitleAssignment_4.eContents().get(0);
		private final Keyword cAuthorsKeyword_5 = (Keyword)cGroup.eContents().get(5);
		private final Keyword cEqualsSignGreaterThanSignKeyword_6 = (Keyword)cGroup.eContents().get(6);
		private final Keyword cLeftSquareBracketKeyword_7 = (Keyword)cGroup.eContents().get(7);
		private final Assignment cAuthorsAssignment_8 = (Assignment)cGroup.eContents().get(8);
		private final RuleCall cAuthorsListAuthorsParserRuleCall_8_0 = (RuleCall)cAuthorsAssignment_8.eContents().get(0);
		private final Keyword cRightSquareBracketKeyword_9 = (Keyword)cGroup.eContents().get(9);
		private final Keyword cPagesKeyword_10 = (Keyword)cGroup.eContents().get(10);
		private final Keyword cEqualsSignGreaterThanSignKeyword_11 = (Keyword)cGroup.eContents().get(11);
		private final Assignment cPagesAssignment_12 = (Assignment)cGroup.eContents().get(12);
		private final Alternatives cPagesAlternatives_12_0 = (Alternatives)cPagesAssignment_12.eContents().get(0);
		private final RuleCall cPagesPageSingleParserRuleCall_12_0_0 = (RuleCall)cPagesAlternatives_12_0.eContents().get(0);
		private final RuleCall cPagesPageRangeParserRuleCall_12_0_1 = (RuleCall)cPagesAlternatives_12_0.eContents().get(1);
		private final Keyword cDateKeyword_13 = (Keyword)cGroup.eContents().get(13);
		private final Keyword cEqualsSignGreaterThanSignKeyword_14 = (Keyword)cGroup.eContents().get(14);
		private final Assignment cDateAssignment_15 = (Assignment)cGroup.eContents().get(15);
		private final Alternatives cDateAlternatives_15_0 = (Alternatives)cDateAssignment_15.eContents().get(0);
		private final RuleCall cDateYearParserRuleCall_15_0_0 = (RuleCall)cDateAlternatives_15_0.eContents().get(0);
		private final RuleCall cDateDateParserRuleCall_15_0_1 = (RuleCall)cDateAlternatives_15_0.eContents().get(1);
		private final Keyword cRightCurlyBracketKeyword_16 = (Keyword)cGroup.eContents().get(16);
		
		//Book:
		//	'Book' '{'
		//	'Title' '=>' title=STRING
		//	'Authors' '=>' '[' authors=ListAuthors ']'
		//	'Pages' '=>' pages=(PageSingle | PageRange)
		//	'Date' '=>' date=(Year | Date)
		//	'}';
		@Override public ParserRule getRule() { return rule; }
		
		//'Book' '{' 'Title' '=>' title=STRING 'Authors' '=>' '[' authors=ListAuthors ']' 'Pages' '=>' pages=(PageSingle |
		//PageRange) 'Date' '=>' date=(Year | Date) '}'
		public Group getGroup() { return cGroup; }
		
		//'Book'
		public Keyword getBookKeyword_0() { return cBookKeyword_0; }
		
		//'{'
		public Keyword getLeftCurlyBracketKeyword_1() { return cLeftCurlyBracketKeyword_1; }
		
		//'Title'
		public Keyword getTitleKeyword_2() { return cTitleKeyword_2; }
		
		//'=>'
		public Keyword getEqualsSignGreaterThanSignKeyword_3() { return cEqualsSignGreaterThanSignKeyword_3; }
		
		//title=STRING
		public Assignment getTitleAssignment_4() { return cTitleAssignment_4; }
		
		//STRING
		public RuleCall getTitleSTRINGTerminalRuleCall_4_0() { return cTitleSTRINGTerminalRuleCall_4_0; }
		
		//'Authors'
		public Keyword getAuthorsKeyword_5() { return cAuthorsKeyword_5; }
		
		//'=>'
		public Keyword getEqualsSignGreaterThanSignKeyword_6() { return cEqualsSignGreaterThanSignKeyword_6; }
		
		//'['
		public Keyword getLeftSquareBracketKeyword_7() { return cLeftSquareBracketKeyword_7; }
		
		//authors=ListAuthors
		public Assignment getAuthorsAssignment_8() { return cAuthorsAssignment_8; }
		
		//ListAuthors
		public RuleCall getAuthorsListAuthorsParserRuleCall_8_0() { return cAuthorsListAuthorsParserRuleCall_8_0; }
		
		//']'
		public Keyword getRightSquareBracketKeyword_9() { return cRightSquareBracketKeyword_9; }
		
		//'Pages'
		public Keyword getPagesKeyword_10() { return cPagesKeyword_10; }
		
		//'=>'
		public Keyword getEqualsSignGreaterThanSignKeyword_11() { return cEqualsSignGreaterThanSignKeyword_11; }
		
		//pages=(PageSingle | PageRange)
		public Assignment getPagesAssignment_12() { return cPagesAssignment_12; }
		
		//(PageSingle | PageRange)
		public Alternatives getPagesAlternatives_12_0() { return cPagesAlternatives_12_0; }
		
		//PageSingle
		public RuleCall getPagesPageSingleParserRuleCall_12_0_0() { return cPagesPageSingleParserRuleCall_12_0_0; }
		
		//PageRange
		public RuleCall getPagesPageRangeParserRuleCall_12_0_1() { return cPagesPageRangeParserRuleCall_12_0_1; }
		
		//'Date'
		public Keyword getDateKeyword_13() { return cDateKeyword_13; }
		
		//'=>'
		public Keyword getEqualsSignGreaterThanSignKeyword_14() { return cEqualsSignGreaterThanSignKeyword_14; }
		
		//date=(Year | Date)
		public Assignment getDateAssignment_15() { return cDateAssignment_15; }
		
		//(Year | Date)
		public Alternatives getDateAlternatives_15_0() { return cDateAlternatives_15_0; }
		
		//Year
		public RuleCall getDateYearParserRuleCall_15_0_0() { return cDateYearParserRuleCall_15_0_0; }
		
		//Date
		public RuleCall getDateDateParserRuleCall_15_0_1() { return cDateDateParserRuleCall_15_0_1; }
		
		//'}'
		public Keyword getRightCurlyBracketKeyword_16() { return cRightCurlyBracketKeyword_16; }
	}
	public class JournalArticleElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.htwg.LitMan.JournalArticle");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cArticleKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Keyword cLeftCurlyBracketKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Keyword cTitleKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Keyword cEqualsSignGreaterThanSignKeyword_3 = (Keyword)cGroup.eContents().get(3);
		private final Assignment cTitleAssignment_4 = (Assignment)cGroup.eContents().get(4);
		private final RuleCall cTitleSTRINGTerminalRuleCall_4_0 = (RuleCall)cTitleAssignment_4.eContents().get(0);
		private final Keyword cAuthorsKeyword_5 = (Keyword)cGroup.eContents().get(5);
		private final Keyword cEqualsSignGreaterThanSignKeyword_6 = (Keyword)cGroup.eContents().get(6);
		private final Keyword cLeftSquareBracketKeyword_7 = (Keyword)cGroup.eContents().get(7);
		private final Assignment cAuthorsAssignment_8 = (Assignment)cGroup.eContents().get(8);
		private final RuleCall cAuthorsListAuthorsParserRuleCall_8_0 = (RuleCall)cAuthorsAssignment_8.eContents().get(0);
		private final Keyword cRightSquareBracketKeyword_9 = (Keyword)cGroup.eContents().get(9);
		private final Keyword cVolumeKeyword_10 = (Keyword)cGroup.eContents().get(10);
		private final Keyword cEqualsSignGreaterThanSignKeyword_11 = (Keyword)cGroup.eContents().get(11);
		private final Assignment cVolumeAssignment_12 = (Assignment)cGroup.eContents().get(12);
		private final RuleCall cVolumeINTTerminalRuleCall_12_0 = (RuleCall)cVolumeAssignment_12.eContents().get(0);
		private final Keyword cIssueKeyword_13 = (Keyword)cGroup.eContents().get(13);
		private final Keyword cEqualsSignGreaterThanSignKeyword_14 = (Keyword)cGroup.eContents().get(14);
		private final Assignment cIssueAssignment_15 = (Assignment)cGroup.eContents().get(15);
		private final RuleCall cIssueINTTerminalRuleCall_15_0 = (RuleCall)cIssueAssignment_15.eContents().get(0);
		private final Keyword cPagesKeyword_16 = (Keyword)cGroup.eContents().get(16);
		private final Keyword cEqualsSignGreaterThanSignKeyword_17 = (Keyword)cGroup.eContents().get(17);
		private final Assignment cPagesAssignment_18 = (Assignment)cGroup.eContents().get(18);
		private final Alternatives cPagesAlternatives_18_0 = (Alternatives)cPagesAssignment_18.eContents().get(0);
		private final RuleCall cPagesPageSingleParserRuleCall_18_0_0 = (RuleCall)cPagesAlternatives_18_0.eContents().get(0);
		private final RuleCall cPagesPageRangeParserRuleCall_18_0_1 = (RuleCall)cPagesAlternatives_18_0.eContents().get(1);
		private final Keyword cDateKeyword_19 = (Keyword)cGroup.eContents().get(19);
		private final Keyword cEqualsSignGreaterThanSignKeyword_20 = (Keyword)cGroup.eContents().get(20);
		private final Assignment cDateAssignment_21 = (Assignment)cGroup.eContents().get(21);
		private final Alternatives cDateAlternatives_21_0 = (Alternatives)cDateAssignment_21.eContents().get(0);
		private final RuleCall cDateYearParserRuleCall_21_0_0 = (RuleCall)cDateAlternatives_21_0.eContents().get(0);
		private final RuleCall cDateDateParserRuleCall_21_0_1 = (RuleCall)cDateAlternatives_21_0.eContents().get(1);
		private final Keyword cRightCurlyBracketKeyword_22 = (Keyword)cGroup.eContents().get(22);
		
		//JournalArticle:
		//	'Article' '{'
		//	'Title' '=>' title=STRING
		//	'Authors' '=>' '[' authors=ListAuthors ']'
		//	'Volume' '=>' volume=INT
		//	'Issue' '=>' issue=INT
		//	'Pages' '=>' pages=(PageSingle | PageRange)
		//	'Date' '=>' date=(Year | Date)
		//	'}';
		@Override public ParserRule getRule() { return rule; }
		
		//'Article' '{' 'Title' '=>' title=STRING 'Authors' '=>' '[' authors=ListAuthors ']' 'Volume' '=>' volume=INT 'Issue' '=>'
		//issue=INT 'Pages' '=>' pages=(PageSingle | PageRange) 'Date' '=>' date=(Year | Date) '}'
		public Group getGroup() { return cGroup; }
		
		//'Article'
		public Keyword getArticleKeyword_0() { return cArticleKeyword_0; }
		
		//'{'
		public Keyword getLeftCurlyBracketKeyword_1() { return cLeftCurlyBracketKeyword_1; }
		
		//'Title'
		public Keyword getTitleKeyword_2() { return cTitleKeyword_2; }
		
		//'=>'
		public Keyword getEqualsSignGreaterThanSignKeyword_3() { return cEqualsSignGreaterThanSignKeyword_3; }
		
		//title=STRING
		public Assignment getTitleAssignment_4() { return cTitleAssignment_4; }
		
		//STRING
		public RuleCall getTitleSTRINGTerminalRuleCall_4_0() { return cTitleSTRINGTerminalRuleCall_4_0; }
		
		//'Authors'
		public Keyword getAuthorsKeyword_5() { return cAuthorsKeyword_5; }
		
		//'=>'
		public Keyword getEqualsSignGreaterThanSignKeyword_6() { return cEqualsSignGreaterThanSignKeyword_6; }
		
		//'['
		public Keyword getLeftSquareBracketKeyword_7() { return cLeftSquareBracketKeyword_7; }
		
		//authors=ListAuthors
		public Assignment getAuthorsAssignment_8() { return cAuthorsAssignment_8; }
		
		//ListAuthors
		public RuleCall getAuthorsListAuthorsParserRuleCall_8_0() { return cAuthorsListAuthorsParserRuleCall_8_0; }
		
		//']'
		public Keyword getRightSquareBracketKeyword_9() { return cRightSquareBracketKeyword_9; }
		
		//'Volume'
		public Keyword getVolumeKeyword_10() { return cVolumeKeyword_10; }
		
		//'=>'
		public Keyword getEqualsSignGreaterThanSignKeyword_11() { return cEqualsSignGreaterThanSignKeyword_11; }
		
		//volume=INT
		public Assignment getVolumeAssignment_12() { return cVolumeAssignment_12; }
		
		//INT
		public RuleCall getVolumeINTTerminalRuleCall_12_0() { return cVolumeINTTerminalRuleCall_12_0; }
		
		//'Issue'
		public Keyword getIssueKeyword_13() { return cIssueKeyword_13; }
		
		//'=>'
		public Keyword getEqualsSignGreaterThanSignKeyword_14() { return cEqualsSignGreaterThanSignKeyword_14; }
		
		//issue=INT
		public Assignment getIssueAssignment_15() { return cIssueAssignment_15; }
		
		//INT
		public RuleCall getIssueINTTerminalRuleCall_15_0() { return cIssueINTTerminalRuleCall_15_0; }
		
		//'Pages'
		public Keyword getPagesKeyword_16() { return cPagesKeyword_16; }
		
		//'=>'
		public Keyword getEqualsSignGreaterThanSignKeyword_17() { return cEqualsSignGreaterThanSignKeyword_17; }
		
		//pages=(PageSingle | PageRange)
		public Assignment getPagesAssignment_18() { return cPagesAssignment_18; }
		
		//(PageSingle | PageRange)
		public Alternatives getPagesAlternatives_18_0() { return cPagesAlternatives_18_0; }
		
		//PageSingle
		public RuleCall getPagesPageSingleParserRuleCall_18_0_0() { return cPagesPageSingleParserRuleCall_18_0_0; }
		
		//PageRange
		public RuleCall getPagesPageRangeParserRuleCall_18_0_1() { return cPagesPageRangeParserRuleCall_18_0_1; }
		
		//'Date'
		public Keyword getDateKeyword_19() { return cDateKeyword_19; }
		
		//'=>'
		public Keyword getEqualsSignGreaterThanSignKeyword_20() { return cEqualsSignGreaterThanSignKeyword_20; }
		
		//date=(Year | Date)
		public Assignment getDateAssignment_21() { return cDateAssignment_21; }
		
		//(Year | Date)
		public Alternatives getDateAlternatives_21_0() { return cDateAlternatives_21_0; }
		
		//Year
		public RuleCall getDateYearParserRuleCall_21_0_0() { return cDateYearParserRuleCall_21_0_0; }
		
		//Date
		public RuleCall getDateDateParserRuleCall_21_0_1() { return cDateDateParserRuleCall_21_0_1; }
		
		//'}'
		public Keyword getRightCurlyBracketKeyword_22() { return cRightCurlyBracketKeyword_22; }
	}
	public class AuthorElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.htwg.LitMan.Author");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cFKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cFirstnameAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cFirstnameSTRINGTerminalRuleCall_1_0 = (RuleCall)cFirstnameAssignment_1.eContents().get(0);
		private final Keyword cLKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Assignment cLastnameAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final RuleCall cLastnameSTRINGTerminalRuleCall_3_0 = (RuleCall)cLastnameAssignment_3.eContents().get(0);
		
		//// Common rules
		//Author:
		//	'f' firstname=STRING
		//	'l' lastname=STRING;
		@Override public ParserRule getRule() { return rule; }
		
		//'f' firstname=STRING 'l' lastname=STRING
		public Group getGroup() { return cGroup; }
		
		//'f'
		public Keyword getFKeyword_0() { return cFKeyword_0; }
		
		//firstname=STRING
		public Assignment getFirstnameAssignment_1() { return cFirstnameAssignment_1; }
		
		//STRING
		public RuleCall getFirstnameSTRINGTerminalRuleCall_1_0() { return cFirstnameSTRINGTerminalRuleCall_1_0; }
		
		//'l'
		public Keyword getLKeyword_2() { return cLKeyword_2; }
		
		//lastname=STRING
		public Assignment getLastnameAssignment_3() { return cLastnameAssignment_3; }
		
		//STRING
		public RuleCall getLastnameSTRINGTerminalRuleCall_3_0() { return cLastnameSTRINGTerminalRuleCall_3_0; }
	}
	public class ListAuthorsElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.htwg.LitMan.ListAuthors");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Assignment cAuthorsAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final RuleCall cAuthorsAuthorParserRuleCall_0_0 = (RuleCall)cAuthorsAssignment_0.eContents().get(0);
		private final Keyword cCommaKeyword_1 = (Keyword)cGroup.eContents().get(1);
		
		//ListAuthors:
		//	(authors+=Author ','?)*;
		@Override public ParserRule getRule() { return rule; }
		
		//(authors+=Author ','?)*
		public Group getGroup() { return cGroup; }
		
		//authors+=Author
		public Assignment getAuthorsAssignment_0() { return cAuthorsAssignment_0; }
		
		//Author
		public RuleCall getAuthorsAuthorParserRuleCall_0_0() { return cAuthorsAuthorParserRuleCall_0_0; }
		
		//','?
		public Keyword getCommaKeyword_1() { return cCommaKeyword_1; }
	}
	public class PageSingleElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.htwg.LitMan.PageSingle");
		private final RuleCall cINTTerminalRuleCall = (RuleCall)rule.eContents().get(1);
		
		//PageSingle:
		//	INT;
		@Override public ParserRule getRule() { return rule; }
		
		//INT
		public RuleCall getINTTerminalRuleCall() { return cINTTerminalRuleCall; }
	}
	public class PageRangeElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.htwg.LitMan.PageRange");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final RuleCall cINTTerminalRuleCall_0 = (RuleCall)cGroup.eContents().get(0);
		private final Keyword cHyphenMinusKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final RuleCall cINTTerminalRuleCall_2 = (RuleCall)cGroup.eContents().get(2);
		
		//PageRange:
		//	INT '-' INT;
		@Override public ParserRule getRule() { return rule; }
		
		//INT '-' INT
		public Group getGroup() { return cGroup; }
		
		//INT
		public RuleCall getINTTerminalRuleCall_0() { return cINTTerminalRuleCall_0; }
		
		//'-'
		public Keyword getHyphenMinusKeyword_1() { return cHyphenMinusKeyword_1; }
		
		//INT
		public RuleCall getINTTerminalRuleCall_2() { return cINTTerminalRuleCall_2; }
	}
	public class YearElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.htwg.LitMan.Year");
		private final RuleCall cINTTerminalRuleCall = (RuleCall)rule.eContents().get(1);
		
		//// terminal definitions
		//Year:
		//	INT;
		@Override public ParserRule getRule() { return rule; }
		
		//INT
		public RuleCall getINTTerminalRuleCall() { return cINTTerminalRuleCall; }
	}
	public class DateElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.htwg.LitMan.Date");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final RuleCall cINTTerminalRuleCall_0 = (RuleCall)cGroup.eContents().get(0);
		private final Keyword cFullStopKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final RuleCall cINTTerminalRuleCall_2 = (RuleCall)cGroup.eContents().get(2);
		private final Keyword cFullStopKeyword_3 = (Keyword)cGroup.eContents().get(3);
		private final RuleCall cINTTerminalRuleCall_4 = (RuleCall)cGroup.eContents().get(4);
		
		//Date:
		//	INT '.' INT '.' INT;
		@Override public ParserRule getRule() { return rule; }
		
		//INT '.' INT '.' INT
		public Group getGroup() { return cGroup; }
		
		//INT
		public RuleCall getINTTerminalRuleCall_0() { return cINTTerminalRuleCall_0; }
		
		//'.'
		public Keyword getFullStopKeyword_1() { return cFullStopKeyword_1; }
		
		//INT
		public RuleCall getINTTerminalRuleCall_2() { return cINTTerminalRuleCall_2; }
		
		//'.'
		public Keyword getFullStopKeyword_3() { return cFullStopKeyword_3; }
		
		//INT
		public RuleCall getINTTerminalRuleCall_4() { return cINTTerminalRuleCall_4; }
	}
	
	
	private final LitManElements pLitMan;
	private final LitTypesElements pLitTypes;
	private final BookElements pBook;
	private final JournalArticleElements pJournalArticle;
	private final AuthorElements pAuthor;
	private final ListAuthorsElements pListAuthors;
	private final PageSingleElements pPageSingle;
	private final PageRangeElements pPageRange;
	private final YearElements pYear;
	private final DateElements pDate;
	
	private final Grammar grammar;
	
	private final TerminalsGrammarAccess gaTerminals;

	@Inject
	public LitManGrammarAccess(GrammarProvider grammarProvider,
			TerminalsGrammarAccess gaTerminals) {
		this.grammar = internalFindGrammar(grammarProvider);
		this.gaTerminals = gaTerminals;
		this.pLitMan = new LitManElements();
		this.pLitTypes = new LitTypesElements();
		this.pBook = new BookElements();
		this.pJournalArticle = new JournalArticleElements();
		this.pAuthor = new AuthorElements();
		this.pListAuthors = new ListAuthorsElements();
		this.pPageSingle = new PageSingleElements();
		this.pPageRange = new PageRangeElements();
		this.pYear = new YearElements();
		this.pDate = new DateElements();
	}
	
	protected Grammar internalFindGrammar(GrammarProvider grammarProvider) {
		Grammar grammar = grammarProvider.getGrammar(this);
		while (grammar != null) {
			if ("org.xtext.htwg.LitMan".equals(grammar.getName())) {
				return grammar;
			}
			List<Grammar> grammars = grammar.getUsedGrammars();
			if (!grammars.isEmpty()) {
				grammar = grammars.iterator().next();
			} else {
				return null;
			}
		}
		return grammar;
	}
	
	@Override
	public Grammar getGrammar() {
		return grammar;
	}
	
	
	public TerminalsGrammarAccess getTerminalsGrammarAccess() {
		return gaTerminals;
	}

	
	//LitMan:
	//	literatur+=LitTypes*;
	public LitManElements getLitManAccess() {
		return pLitMan;
	}
	
	public ParserRule getLitManRule() {
		return getLitManAccess().getRule();
	}
	
	//LitTypes:
	//	Book | JournalArticle;
	public LitTypesElements getLitTypesAccess() {
		return pLitTypes;
	}
	
	public ParserRule getLitTypesRule() {
		return getLitTypesAccess().getRule();
	}
	
	//Book:
	//	'Book' '{'
	//	'Title' '=>' title=STRING
	//	'Authors' '=>' '[' authors=ListAuthors ']'
	//	'Pages' '=>' pages=(PageSingle | PageRange)
	//	'Date' '=>' date=(Year | Date)
	//	'}';
	public BookElements getBookAccess() {
		return pBook;
	}
	
	public ParserRule getBookRule() {
		return getBookAccess().getRule();
	}
	
	//JournalArticle:
	//	'Article' '{'
	//	'Title' '=>' title=STRING
	//	'Authors' '=>' '[' authors=ListAuthors ']'
	//	'Volume' '=>' volume=INT
	//	'Issue' '=>' issue=INT
	//	'Pages' '=>' pages=(PageSingle | PageRange)
	//	'Date' '=>' date=(Year | Date)
	//	'}';
	public JournalArticleElements getJournalArticleAccess() {
		return pJournalArticle;
	}
	
	public ParserRule getJournalArticleRule() {
		return getJournalArticleAccess().getRule();
	}
	
	//// Common rules
	//Author:
	//	'f' firstname=STRING
	//	'l' lastname=STRING;
	public AuthorElements getAuthorAccess() {
		return pAuthor;
	}
	
	public ParserRule getAuthorRule() {
		return getAuthorAccess().getRule();
	}
	
	//ListAuthors:
	//	(authors+=Author ','?)*;
	public ListAuthorsElements getListAuthorsAccess() {
		return pListAuthors;
	}
	
	public ParserRule getListAuthorsRule() {
		return getListAuthorsAccess().getRule();
	}
	
	//PageSingle:
	//	INT;
	public PageSingleElements getPageSingleAccess() {
		return pPageSingle;
	}
	
	public ParserRule getPageSingleRule() {
		return getPageSingleAccess().getRule();
	}
	
	//PageRange:
	//	INT '-' INT;
	public PageRangeElements getPageRangeAccess() {
		return pPageRange;
	}
	
	public ParserRule getPageRangeRule() {
		return getPageRangeAccess().getRule();
	}
	
	//// terminal definitions
	//Year:
	//	INT;
	public YearElements getYearAccess() {
		return pYear;
	}
	
	public ParserRule getYearRule() {
		return getYearAccess().getRule();
	}
	
	//Date:
	//	INT '.' INT '.' INT;
	public DateElements getDateAccess() {
		return pDate;
	}
	
	public ParserRule getDateRule() {
		return getDateAccess().getRule();
	}
	
	//terminal ID:
	//	'^'? ('a'..'z' | 'A'..'Z' | '_') ('a'..'z' | 'A'..'Z' | '_' | '0'..'9')*;
	public TerminalRule getIDRule() {
		return gaTerminals.getIDRule();
	}
	
	//terminal INT returns ecore::EInt:
	//	'0'..'9'+;
	public TerminalRule getINTRule() {
		return gaTerminals.getINTRule();
	}
	
	//terminal STRING:
	//	'"' ('\\' . | !('\\' | '"'))* '"' | "'" ('\\' . | !('\\' | "'"))* "'";
	public TerminalRule getSTRINGRule() {
		return gaTerminals.getSTRINGRule();
	}
	
	//terminal ML_COMMENT:
	//	'/*'->'*/';
	public TerminalRule getML_COMMENTRule() {
		return gaTerminals.getML_COMMENTRule();
	}
	
	//terminal SL_COMMENT:
	//	'//' !('\n' | '\r')* ('\r'? '\n')?;
	public TerminalRule getSL_COMMENTRule() {
		return gaTerminals.getSL_COMMENTRule();
	}
	
	//terminal WS:
	//	' ' | '\t' | '\r' | '\n'+;
	public TerminalRule getWSRule() {
		return gaTerminals.getWSRule();
	}
	
	//terminal ANY_OTHER:
	//	.;
	public TerminalRule getANY_OTHERRule() {
		return gaTerminals.getANY_OTHERRule();
	}
}
