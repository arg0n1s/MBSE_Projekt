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



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalReqXtextParser extends AbstractInternalAntlrParser {
	public static final String[] tokenNames = new String[] {
		"<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ANY_OTHER", "RULE_ID", "RULE_INT", 
		"RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_STRING", "RULE_WS", "'Consumer'", 
		"'Provider'", "'speed'", "'{'", "'}'"
	};
	public static final int EOF=-1;
	public static final int T__11=11;
	public static final int T__12=12;
	public static final int T__13=13;
	public static final int T__14=14;
	public static final int T__15=15;
	public static final int RULE_ANY_OTHER=4;
	public static final int RULE_ID=5;
	public static final int RULE_INT=6;
	public static final int RULE_ML_COMMENT=7;
	public static final int RULE_SL_COMMENT=8;
	public static final int RULE_STRING=9;
	public static final int RULE_WS=10;

	// delegates
	public AbstractInternalAntlrParser[] getDelegates() {
		return new AbstractInternalAntlrParser[] {};
	}

	// delegators


	public InternalReqXtextParser(TokenStream input) {
		this(input, new RecognizerSharedState());
	}
	public InternalReqXtextParser(TokenStream input, RecognizerSharedState state) {
		super(input, state);
	}

	@Override public String[] getTokenNames() { return InternalReqXtextParser.tokenNames; }
	@Override public String getGrammarFileName() { return "InternalReqXtext.g"; }



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




	// $ANTLR start "entryRuleXContainer"
	// InternalReqXtext.g:64:1: entryRuleXContainer returns [EObject current=null] :iv_ruleXContainer= ruleXContainer EOF ;
	public final EObject entryRuleXContainer() throws RecognitionException {
		EObject current = null;


		EObject iv_ruleXContainer =null;

		try {
			// InternalReqXtext.g:64:51: (iv_ruleXContainer= ruleXContainer EOF )
			// InternalReqXtext.g:65:2: iv_ruleXContainer= ruleXContainer EOF
			{
			 newCompositeNode(grammarAccess.getXContainerRule()); 
			pushFollow(FOLLOW_1);
			iv_ruleXContainer=ruleXContainer();
			state._fsp--;

			 current =iv_ruleXContainer; 
			match(input,EOF,FOLLOW_2); 
			}

		}

		    catch (RecognitionException re) {
		        recover(input,re);
		        appendSkippedTokens();
		    }

		finally {
			// do for sure before leaving
		}
		return current;
	}
	// $ANTLR end "entryRuleXContainer"



	// $ANTLR start "ruleXContainer"
	// InternalReqXtext.g:71:1: ruleXContainer returns [EObject current=null] : ( (lv_agents_0_0= ruleXAgent ) )* ;
	public final EObject ruleXContainer() throws RecognitionException {
		EObject current = null;


		EObject lv_agents_0_0 =null;


			enterRule();

		try {
			// InternalReqXtext.g:77:2: ( ( (lv_agents_0_0= ruleXAgent ) )* )
			// InternalReqXtext.g:78:2: ( (lv_agents_0_0= ruleXAgent ) )*
			{
			// InternalReqXtext.g:78:2: ( (lv_agents_0_0= ruleXAgent ) )*
			loop1:
			while (true) {
				int alt1=2;
				int LA1_0 = input.LA(1);
				if ( ((LA1_0 >= 11 && LA1_0 <= 12)) ) {
					alt1=1;
				}

				switch (alt1) {
				case 1 :
					// InternalReqXtext.g:79:3: (lv_agents_0_0= ruleXAgent )
					{
					// InternalReqXtext.g:79:3: (lv_agents_0_0= ruleXAgent )
					// InternalReqXtext.g:80:4: lv_agents_0_0= ruleXAgent
					{

									newCompositeNode(grammarAccess.getXContainerAccess().getAgentsXAgentParserRuleCall_0());
								
					pushFollow(FOLLOW_3);
					lv_agents_0_0=ruleXAgent();
					state._fsp--;


									if (current==null) {
										current = createModelElementForParent(grammarAccess.getXContainerRule());
									}
									add(
										current,
										"agents",
										lv_agents_0_0,
										"requirementsXtext.ReqXtext.XAgent");
									afterParserOrEnumRuleCall();
								
					}

					}
					break;

				default :
					break loop1;
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
			// do for sure before leaving
		}
		return current;
	}
	// $ANTLR end "ruleXContainer"



	// $ANTLR start "entryRuleXAgent"
	// InternalReqXtext.g:100:1: entryRuleXAgent returns [EObject current=null] :iv_ruleXAgent= ruleXAgent EOF ;
	public final EObject entryRuleXAgent() throws RecognitionException {
		EObject current = null;


		EObject iv_ruleXAgent =null;

		try {
			// InternalReqXtext.g:100:47: (iv_ruleXAgent= ruleXAgent EOF )
			// InternalReqXtext.g:101:2: iv_ruleXAgent= ruleXAgent EOF
			{
			 newCompositeNode(grammarAccess.getXAgentRule()); 
			pushFollow(FOLLOW_1);
			iv_ruleXAgent=ruleXAgent();
			state._fsp--;

			 current =iv_ruleXAgent; 
			match(input,EOF,FOLLOW_2); 
			}

		}

		    catch (RecognitionException re) {
		        recover(input,re);
		        appendSkippedTokens();
		    }

		finally {
			// do for sure before leaving
		}
		return current;
	}
	// $ANTLR end "entryRuleXAgent"



	// $ANTLR start "ruleXAgent"
	// InternalReqXtext.g:107:1: ruleXAgent returns [EObject current=null] : (this_XProvider_0= ruleXProvider |this_XConsumer_1= ruleXConsumer ) ;
	public final EObject ruleXAgent() throws RecognitionException {
		EObject current = null;


		EObject this_XProvider_0 =null;
		EObject this_XConsumer_1 =null;


			enterRule();

		try {
			// InternalReqXtext.g:113:2: ( (this_XProvider_0= ruleXProvider |this_XConsumer_1= ruleXConsumer ) )
			// InternalReqXtext.g:114:2: (this_XProvider_0= ruleXProvider |this_XConsumer_1= ruleXConsumer )
			{
			// InternalReqXtext.g:114:2: (this_XProvider_0= ruleXProvider |this_XConsumer_1= ruleXConsumer )
			int alt2=2;
			int LA2_0 = input.LA(1);
			if ( (LA2_0==12) ) {
				alt2=1;
			}
			else if ( (LA2_0==11) ) {
				alt2=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 2, 0, input);
				throw nvae;
			}

			switch (alt2) {
				case 1 :
					// InternalReqXtext.g:115:3: this_XProvider_0= ruleXProvider
					{

								newCompositeNode(grammarAccess.getXAgentAccess().getXProviderParserRuleCall_0());
							
					pushFollow(FOLLOW_2);
					this_XProvider_0=ruleXProvider();
					state._fsp--;


								current = this_XProvider_0;
								afterParserOrEnumRuleCall();
							
					}
					break;
				case 2 :
					// InternalReqXtext.g:124:3: this_XConsumer_1= ruleXConsumer
					{

								newCompositeNode(grammarAccess.getXAgentAccess().getXConsumerParserRuleCall_1());
							
					pushFollow(FOLLOW_2);
					this_XConsumer_1=ruleXConsumer();
					state._fsp--;


								current = this_XConsumer_1;
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
			// do for sure before leaving
		}
		return current;
	}
	// $ANTLR end "ruleXAgent"



	// $ANTLR start "entryRuleEBigInteger"
	// InternalReqXtext.g:136:1: entryRuleEBigInteger returns [String current=null] :iv_ruleEBigInteger= ruleEBigInteger EOF ;
	public final String entryRuleEBigInteger() throws RecognitionException {
		String current = null;


		AntlrDatatypeRuleToken iv_ruleEBigInteger =null;

		try {
			// InternalReqXtext.g:136:51: (iv_ruleEBigInteger= ruleEBigInteger EOF )
			// InternalReqXtext.g:137:2: iv_ruleEBigInteger= ruleEBigInteger EOF
			{
			 newCompositeNode(grammarAccess.getEBigIntegerRule()); 
			pushFollow(FOLLOW_1);
			iv_ruleEBigInteger=ruleEBigInteger();
			state._fsp--;

			 current =iv_ruleEBigInteger.getText(); 
			match(input,EOF,FOLLOW_2); 
			}

		}

		    catch (RecognitionException re) {
		        recover(input,re);
		        appendSkippedTokens();
		    }

		finally {
			// do for sure before leaving
		}
		return current;
	}
	// $ANTLR end "entryRuleEBigInteger"



	// $ANTLR start "ruleEBigInteger"
	// InternalReqXtext.g:143:1: ruleEBigInteger returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_INT_0= RULE_INT ;
	public final AntlrDatatypeRuleToken ruleEBigInteger() throws RecognitionException {
		AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();


		Token this_INT_0=null;


			enterRule();

		try {
			// InternalReqXtext.g:149:2: (this_INT_0= RULE_INT )
			// InternalReqXtext.g:150:2: this_INT_0= RULE_INT
			{
			this_INT_0=(Token)match(input,RULE_INT,FOLLOW_2); 

					current.merge(this_INT_0);
				

					newLeafNode(this_INT_0, grammarAccess.getEBigIntegerAccess().getINTTerminalRuleCall());
				
			}


				leaveRule();

		}

		    catch (RecognitionException re) {
		        recover(input,re);
		        appendSkippedTokens();
		    }

		finally {
			// do for sure before leaving
		}
		return current;
	}
	// $ANTLR end "ruleEBigInteger"



	// $ANTLR start "entryRuleXProvider"
	// InternalReqXtext.g:160:1: entryRuleXProvider returns [EObject current=null] :iv_ruleXProvider= ruleXProvider EOF ;
	public final EObject entryRuleXProvider() throws RecognitionException {
		EObject current = null;


		EObject iv_ruleXProvider =null;

		try {
			// InternalReqXtext.g:160:50: (iv_ruleXProvider= ruleXProvider EOF )
			// InternalReqXtext.g:161:2: iv_ruleXProvider= ruleXProvider EOF
			{
			 newCompositeNode(grammarAccess.getXProviderRule()); 
			pushFollow(FOLLOW_1);
			iv_ruleXProvider=ruleXProvider();
			state._fsp--;

			 current =iv_ruleXProvider; 
			match(input,EOF,FOLLOW_2); 
			}

		}

		    catch (RecognitionException re) {
		        recover(input,re);
		        appendSkippedTokens();
		    }

		finally {
			// do for sure before leaving
		}
		return current;
	}
	// $ANTLR end "entryRuleXProvider"



	// $ANTLR start "ruleXProvider"
	// InternalReqXtext.g:167:1: ruleXProvider returns [EObject current=null] : (otherlv_0= 'Provider' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'speed' ( (lv_speed_4_0= ruleEBigInteger ) ) otherlv_5= '}' ) ;
	public final EObject ruleXProvider() throws RecognitionException {
		EObject current = null;


		Token otherlv_0=null;
		Token lv_name_1_0=null;
		Token otherlv_2=null;
		Token otherlv_3=null;
		Token otherlv_5=null;
		AntlrDatatypeRuleToken lv_speed_4_0 =null;


			enterRule();

		try {
			// InternalReqXtext.g:173:2: ( (otherlv_0= 'Provider' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'speed' ( (lv_speed_4_0= ruleEBigInteger ) ) otherlv_5= '}' ) )
			// InternalReqXtext.g:174:2: (otherlv_0= 'Provider' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'speed' ( (lv_speed_4_0= ruleEBigInteger ) ) otherlv_5= '}' )
			{
			// InternalReqXtext.g:174:2: (otherlv_0= 'Provider' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'speed' ( (lv_speed_4_0= ruleEBigInteger ) ) otherlv_5= '}' )
			// InternalReqXtext.g:175:3: otherlv_0= 'Provider' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'speed' ( (lv_speed_4_0= ruleEBigInteger ) ) otherlv_5= '}'
			{
			otherlv_0=(Token)match(input,12,FOLLOW_4); 

						newLeafNode(otherlv_0, grammarAccess.getXProviderAccess().getProviderKeyword_0());
					
			// InternalReqXtext.g:179:3: ( (lv_name_1_0= RULE_ID ) )
			// InternalReqXtext.g:180:4: (lv_name_1_0= RULE_ID )
			{
			// InternalReqXtext.g:180:4: (lv_name_1_0= RULE_ID )
			// InternalReqXtext.g:181:5: lv_name_1_0= RULE_ID
			{
			lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_5); 

								newLeafNode(lv_name_1_0, grammarAccess.getXProviderAccess().getNameIDTerminalRuleCall_1_0());
							

								if (current==null) {
									current = createModelElement(grammarAccess.getXProviderRule());
								}
								setWithLastConsumed(
									current,
									"name",
									lv_name_1_0,
									"org.eclipse.xtext.common.Terminals.ID");
							
			}

			}

			otherlv_2=(Token)match(input,14,FOLLOW_6); 

						newLeafNode(otherlv_2, grammarAccess.getXProviderAccess().getLeftCurlyBracketKeyword_2());
					
			otherlv_3=(Token)match(input,13,FOLLOW_7); 

						newLeafNode(otherlv_3, grammarAccess.getXProviderAccess().getSpeedKeyword_3());
					
			// InternalReqXtext.g:205:3: ( (lv_speed_4_0= ruleEBigInteger ) )
			// InternalReqXtext.g:206:4: (lv_speed_4_0= ruleEBigInteger )
			{
			// InternalReqXtext.g:206:4: (lv_speed_4_0= ruleEBigInteger )
			// InternalReqXtext.g:207:5: lv_speed_4_0= ruleEBigInteger
			{

								newCompositeNode(grammarAccess.getXProviderAccess().getSpeedEBigIntegerParserRuleCall_4_0());
							
			pushFollow(FOLLOW_8);
			lv_speed_4_0=ruleEBigInteger();
			state._fsp--;


								if (current==null) {
									current = createModelElementForParent(grammarAccess.getXProviderRule());
								}
								set(
									current,
									"speed",
									lv_speed_4_0,
									"requirementsXtext.ReqXtext.EBigInteger");
								afterParserOrEnumRuleCall();
							
			}

			}

			otherlv_5=(Token)match(input,15,FOLLOW_2); 

						newLeafNode(otherlv_5, grammarAccess.getXProviderAccess().getRightCurlyBracketKeyword_5());
					
			}

			}


				leaveRule();

		}

		    catch (RecognitionException re) {
		        recover(input,re);
		        appendSkippedTokens();
		    }

		finally {
			// do for sure before leaving
		}
		return current;
	}
	// $ANTLR end "ruleXProvider"



	// $ANTLR start "entryRuleXConsumer"
	// InternalReqXtext.g:232:1: entryRuleXConsumer returns [EObject current=null] :iv_ruleXConsumer= ruleXConsumer EOF ;
	public final EObject entryRuleXConsumer() throws RecognitionException {
		EObject current = null;


		EObject iv_ruleXConsumer =null;

		try {
			// InternalReqXtext.g:232:50: (iv_ruleXConsumer= ruleXConsumer EOF )
			// InternalReqXtext.g:233:2: iv_ruleXConsumer= ruleXConsumer EOF
			{
			 newCompositeNode(grammarAccess.getXConsumerRule()); 
			pushFollow(FOLLOW_1);
			iv_ruleXConsumer=ruleXConsumer();
			state._fsp--;

			 current =iv_ruleXConsumer; 
			match(input,EOF,FOLLOW_2); 
			}

		}

		    catch (RecognitionException re) {
		        recover(input,re);
		        appendSkippedTokens();
		    }

		finally {
			// do for sure before leaving
		}
		return current;
	}
	// $ANTLR end "entryRuleXConsumer"



	// $ANTLR start "ruleXConsumer"
	// InternalReqXtext.g:239:1: ruleXConsumer returns [EObject current=null] : (otherlv_0= 'Consumer' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'speed' ( (lv_speed_4_0= ruleEBigInteger ) ) otherlv_5= '}' ) ;
	public final EObject ruleXConsumer() throws RecognitionException {
		EObject current = null;


		Token otherlv_0=null;
		Token lv_name_1_0=null;
		Token otherlv_2=null;
		Token otherlv_3=null;
		Token otherlv_5=null;
		AntlrDatatypeRuleToken lv_speed_4_0 =null;


			enterRule();

		try {
			// InternalReqXtext.g:245:2: ( (otherlv_0= 'Consumer' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'speed' ( (lv_speed_4_0= ruleEBigInteger ) ) otherlv_5= '}' ) )
			// InternalReqXtext.g:246:2: (otherlv_0= 'Consumer' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'speed' ( (lv_speed_4_0= ruleEBigInteger ) ) otherlv_5= '}' )
			{
			// InternalReqXtext.g:246:2: (otherlv_0= 'Consumer' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'speed' ( (lv_speed_4_0= ruleEBigInteger ) ) otherlv_5= '}' )
			// InternalReqXtext.g:247:3: otherlv_0= 'Consumer' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'speed' ( (lv_speed_4_0= ruleEBigInteger ) ) otherlv_5= '}'
			{
			otherlv_0=(Token)match(input,11,FOLLOW_4); 

						newLeafNode(otherlv_0, grammarAccess.getXConsumerAccess().getConsumerKeyword_0());
					
			// InternalReqXtext.g:251:3: ( (lv_name_1_0= RULE_ID ) )
			// InternalReqXtext.g:252:4: (lv_name_1_0= RULE_ID )
			{
			// InternalReqXtext.g:252:4: (lv_name_1_0= RULE_ID )
			// InternalReqXtext.g:253:5: lv_name_1_0= RULE_ID
			{
			lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_5); 

								newLeafNode(lv_name_1_0, grammarAccess.getXConsumerAccess().getNameIDTerminalRuleCall_1_0());
							

								if (current==null) {
									current = createModelElement(grammarAccess.getXConsumerRule());
								}
								setWithLastConsumed(
									current,
									"name",
									lv_name_1_0,
									"org.eclipse.xtext.common.Terminals.ID");
							
			}

			}

			otherlv_2=(Token)match(input,14,FOLLOW_6); 

						newLeafNode(otherlv_2, grammarAccess.getXConsumerAccess().getLeftCurlyBracketKeyword_2());
					
			otherlv_3=(Token)match(input,13,FOLLOW_7); 

						newLeafNode(otherlv_3, grammarAccess.getXConsumerAccess().getSpeedKeyword_3());
					
			// InternalReqXtext.g:277:3: ( (lv_speed_4_0= ruleEBigInteger ) )
			// InternalReqXtext.g:278:4: (lv_speed_4_0= ruleEBigInteger )
			{
			// InternalReqXtext.g:278:4: (lv_speed_4_0= ruleEBigInteger )
			// InternalReqXtext.g:279:5: lv_speed_4_0= ruleEBigInteger
			{

								newCompositeNode(grammarAccess.getXConsumerAccess().getSpeedEBigIntegerParserRuleCall_4_0());
							
			pushFollow(FOLLOW_8);
			lv_speed_4_0=ruleEBigInteger();
			state._fsp--;


								if (current==null) {
									current = createModelElementForParent(grammarAccess.getXConsumerRule());
								}
								set(
									current,
									"speed",
									lv_speed_4_0,
									"requirementsXtext.ReqXtext.EBigInteger");
								afterParserOrEnumRuleCall();
							
			}

			}

			otherlv_5=(Token)match(input,15,FOLLOW_2); 

						newLeafNode(otherlv_5, grammarAccess.getXConsumerAccess().getRightCurlyBracketKeyword_5());
					
			}

			}


				leaveRule();

		}

		    catch (RecognitionException re) {
		        recover(input,re);
		        appendSkippedTokens();
		    }

		finally {
			// do for sure before leaving
		}
		return current;
	}
	// $ANTLR end "ruleXConsumer"

	// Delegated rules



	public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
	public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000001802L});
	public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000004000L});
	public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000002000L});
	public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000000040L});
	public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000008000L});
}
