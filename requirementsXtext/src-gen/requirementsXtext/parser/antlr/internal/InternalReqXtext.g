/*
 * generated by Xtext 2.11.0
 */
grammar InternalReqXtext;

options {
	superClass=AbstractInternalAntlrParser;
}

@lexer::header {
package requirementsXtext.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;
}

@parser::header {
package requirementsXtext.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import requirementsXtext.services.ReqXtextGrammarAccess;

}

@parser::members {

 	private ReqXtextGrammarAccess grammarAccess;

    public InternalReqXtextParser(TokenStream input, ReqXtextGrammarAccess grammarAccess) {
        this(input);
        this.grammarAccess = grammarAccess;
        registerRules(grammarAccess.getGrammar());
    }

    @Override
    protected String getFirstRuleName() {
    	return "XContainer";
   	}

   	@Override
   	protected ReqXtextGrammarAccess getGrammarAccess() {
   		return grammarAccess;
   	}

}

@rulecatch {
    catch (RecognitionException re) {
        recover(input,re);
        appendSkippedTokens();
    }
}

// Entry rule entryRuleXContainer
entryRuleXContainer returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getXContainerRule()); }
	iv_ruleXContainer=ruleXContainer
	{ $current=$iv_ruleXContainer.current; }
	EOF;

// Rule XContainer
ruleXContainer returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			{
				newCompositeNode(grammarAccess.getXContainerAccess().getAgentsXAgentParserRuleCall_0());
			}
			lv_agents_0_0=ruleXAgent
			{
				if ($current==null) {
					$current = createModelElementForParent(grammarAccess.getXContainerRule());
				}
				add(
					$current,
					"agents",
					lv_agents_0_0,
					"requirementsXtext.ReqXtext.XAgent");
				afterParserOrEnumRuleCall();
			}
		)
	)*
;

// Entry rule entryRuleXAgent
entryRuleXAgent returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getXAgentRule()); }
	iv_ruleXAgent=ruleXAgent
	{ $current=$iv_ruleXAgent.current; }
	EOF;

// Rule XAgent
ruleXAgent returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		{
			newCompositeNode(grammarAccess.getXAgentAccess().getXProviderParserRuleCall_0());
		}
		this_XProvider_0=ruleXProvider
		{
			$current = $this_XProvider_0.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getXAgentAccess().getXConsumerParserRuleCall_1());
		}
		this_XConsumer_1=ruleXConsumer
		{
			$current = $this_XConsumer_1.current;
			afterParserOrEnumRuleCall();
		}
	)
;

// Entry rule entryRuleEBigInteger
entryRuleEBigInteger returns [String current=null]:
	{ newCompositeNode(grammarAccess.getEBigIntegerRule()); }
	iv_ruleEBigInteger=ruleEBigInteger
	{ $current=$iv_ruleEBigInteger.current.getText(); }
	EOF;

// Rule EBigInteger
ruleEBigInteger returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	this_INT_0=RULE_INT
	{
		$current.merge(this_INT_0);
	}
	{
		newLeafNode(this_INT_0, grammarAccess.getEBigIntegerAccess().getINTTerminalRuleCall());
	}
;

// Entry rule entryRuleXProvider
entryRuleXProvider returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getXProviderRule()); }
	iv_ruleXProvider=ruleXProvider
	{ $current=$iv_ruleXProvider.current; }
	EOF;

// Rule XProvider
ruleXProvider returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='Provider'
		{
			newLeafNode(otherlv_0, grammarAccess.getXProviderAccess().getProviderKeyword_0());
		}
		(
			(
				lv_name_1_0=RULE_ID
				{
					newLeafNode(lv_name_1_0, grammarAccess.getXProviderAccess().getNameIDTerminalRuleCall_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getXProviderRule());
					}
					setWithLastConsumed(
						$current,
						"name",
						lv_name_1_0,
						"org.eclipse.xtext.common.Terminals.ID");
				}
			)
		)
		otherlv_2='{'
		{
			newLeafNode(otherlv_2, grammarAccess.getXProviderAccess().getLeftCurlyBracketKeyword_2());
		}
		otherlv_3='speed'
		{
			newLeafNode(otherlv_3, grammarAccess.getXProviderAccess().getSpeedKeyword_3());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getXProviderAccess().getSpeedEBigIntegerParserRuleCall_4_0());
				}
				lv_speed_4_0=ruleEBigInteger
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getXProviderRule());
					}
					set(
						$current,
						"speed",
						lv_speed_4_0,
						"requirementsXtext.ReqXtext.EBigInteger");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_5='}'
		{
			newLeafNode(otherlv_5, grammarAccess.getXProviderAccess().getRightCurlyBracketKeyword_5());
		}
	)
;

// Entry rule entryRuleXConsumer
entryRuleXConsumer returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getXConsumerRule()); }
	iv_ruleXConsumer=ruleXConsumer
	{ $current=$iv_ruleXConsumer.current; }
	EOF;

// Rule XConsumer
ruleXConsumer returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='Consumer'
		{
			newLeafNode(otherlv_0, grammarAccess.getXConsumerAccess().getConsumerKeyword_0());
		}
		(
			(
				lv_name_1_0=RULE_ID
				{
					newLeafNode(lv_name_1_0, grammarAccess.getXConsumerAccess().getNameIDTerminalRuleCall_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getXConsumerRule());
					}
					setWithLastConsumed(
						$current,
						"name",
						lv_name_1_0,
						"org.eclipse.xtext.common.Terminals.ID");
				}
			)
		)
		otherlv_2='{'
		{
			newLeafNode(otherlv_2, grammarAccess.getXConsumerAccess().getLeftCurlyBracketKeyword_2());
		}
		otherlv_3='speed'
		{
			newLeafNode(otherlv_3, grammarAccess.getXConsumerAccess().getSpeedKeyword_3());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getXConsumerAccess().getSpeedEBigIntegerParserRuleCall_4_0());
				}
				lv_speed_4_0=ruleEBigInteger
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getXConsumerRule());
					}
					set(
						$current,
						"speed",
						lv_speed_4_0,
						"requirementsXtext.ReqXtext.EBigInteger");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_5='}'
		{
			newLeafNode(otherlv_5, grammarAccess.getXConsumerAccess().getRightCurlyBracketKeyword_5());
		}
	)
;

RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

RULE_INT : ('0'..'9')+;

RULE_STRING : ('"' ('\\' .|~(('\\'|'"')))* '"'|'\'' ('\\' .|~(('\\'|'\'')))* '\'');

RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

RULE_WS : (' '|'\t'|'\r'|'\n')+;

RULE_ANY_OTHER : .;
