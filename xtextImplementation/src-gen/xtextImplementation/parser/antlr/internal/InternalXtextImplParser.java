package xtextImplementation.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import xtextImplementation.services.XtextImplGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalXtextImplParser extends AbstractInternalAntlrParser {
	public static final String[] tokenNames = new String[] {
		"<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ANY_OTHER", "RULE_ID", "RULE_INT", 
		"RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_STRING", "RULE_WS", "'('", 
		"')'", "','", "'Computer'", "'CopperCable'", "'GlassFiberCable'", "'MTBF'", 
		"'Router'", "'Server'", "'endPoint1'", "'endPoint2'", "'false'", "'incoming'", 
		"'isDuplex'", "'maxSlots'", "'maxSpeed'", "'outgoing'", "'speed'", "'true'", 
		"'{'", "'}'"
	};
	public static final int EOF=-1;
	public static final int T__11=11;
	public static final int T__12=12;
	public static final int T__13=13;
	public static final int T__14=14;
	public static final int T__15=15;
	public static final int T__16=16;
	public static final int T__17=17;
	public static final int T__18=18;
	public static final int T__19=19;
	public static final int T__20=20;
	public static final int T__21=21;
	public static final int T__22=22;
	public static final int T__23=23;
	public static final int T__24=24;
	public static final int T__25=25;
	public static final int T__26=26;
	public static final int T__27=27;
	public static final int T__28=28;
	public static final int T__29=29;
	public static final int T__30=30;
	public static final int T__31=31;
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


	public InternalXtextImplParser(TokenStream input) {
		this(input, new RecognizerSharedState());
	}
	public InternalXtextImplParser(TokenStream input, RecognizerSharedState state) {
		super(input, state);
	}

	@Override public String[] getTokenNames() { return InternalXtextImplParser.tokenNames; }
	@Override public String getGrammarFileName() { return "InternalXtextImpl.g"; }



	 	private XtextImplGrammarAccess grammarAccess;

	    public InternalXtextImplParser(TokenStream input, XtextImplGrammarAccess grammarAccess) {
	        this(input);
	        this.grammarAccess = grammarAccess;
	        registerRules(grammarAccess.getGrammar());
	    }

	    @Override
	    protected String getFirstRuleName() {
	    	return "XContainer";
	   	}

	   	@Override
	   	protected XtextImplGrammarAccess getGrammarAccess() {
	   		return grammarAccess;
	   	}




	// $ANTLR start "entryRuleXContainer"
	// InternalXtextImpl.g:64:1: entryRuleXContainer returns [EObject current=null] :iv_ruleXContainer= ruleXContainer EOF ;
	public final EObject entryRuleXContainer() throws RecognitionException {
		EObject current = null;


		EObject iv_ruleXContainer =null;

		try {
			// InternalXtextImpl.g:64:51: (iv_ruleXContainer= ruleXContainer EOF )
			// InternalXtextImpl.g:65:2: iv_ruleXContainer= ruleXContainer EOF
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
	// InternalXtextImpl.g:71:1: ruleXContainer returns [EObject current=null] : ( (lv_elements_0_0= ruleNetworkElement ) )* ;
	public final EObject ruleXContainer() throws RecognitionException {
		EObject current = null;


		EObject lv_elements_0_0 =null;


			enterRule();

		try {
			// InternalXtextImpl.g:77:2: ( ( (lv_elements_0_0= ruleNetworkElement ) )* )
			// InternalXtextImpl.g:78:2: ( (lv_elements_0_0= ruleNetworkElement ) )*
			{
			// InternalXtextImpl.g:78:2: ( (lv_elements_0_0= ruleNetworkElement ) )*
			loop1:
			while (true) {
				int alt1=2;
				int LA1_0 = input.LA(1);
				if ( ((LA1_0 >= 14 && LA1_0 <= 16)||(LA1_0 >= 18 && LA1_0 <= 19)) ) {
					alt1=1;
				}

				switch (alt1) {
				case 1 :
					// InternalXtextImpl.g:79:3: (lv_elements_0_0= ruleNetworkElement )
					{
					// InternalXtextImpl.g:79:3: (lv_elements_0_0= ruleNetworkElement )
					// InternalXtextImpl.g:80:4: lv_elements_0_0= ruleNetworkElement
					{

									newCompositeNode(grammarAccess.getXContainerAccess().getElementsNetworkElementParserRuleCall_0());
								
					pushFollow(FOLLOW_3);
					lv_elements_0_0=ruleNetworkElement();
					state._fsp--;


									if (current==null) {
										current = createModelElementForParent(grammarAccess.getXContainerRule());
									}
									add(
										current,
										"elements",
										lv_elements_0_0,
										"xtextImplementation.XtextImpl.NetworkElement");
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



	// $ANTLR start "entryRuleNetworkElement"
	// InternalXtextImpl.g:100:1: entryRuleNetworkElement returns [EObject current=null] :iv_ruleNetworkElement= ruleNetworkElement EOF ;
	public final EObject entryRuleNetworkElement() throws RecognitionException {
		EObject current = null;


		EObject iv_ruleNetworkElement =null;

		try {
			// InternalXtextImpl.g:100:55: (iv_ruleNetworkElement= ruleNetworkElement EOF )
			// InternalXtextImpl.g:101:2: iv_ruleNetworkElement= ruleNetworkElement EOF
			{
			 newCompositeNode(grammarAccess.getNetworkElementRule()); 
			pushFollow(FOLLOW_1);
			iv_ruleNetworkElement=ruleNetworkElement();
			state._fsp--;

			 current =iv_ruleNetworkElement; 
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
	// $ANTLR end "entryRuleNetworkElement"



	// $ANTLR start "ruleNetworkElement"
	// InternalXtextImpl.g:107:1: ruleNetworkElement returns [EObject current=null] : (this_XDevice_0= ruleXDevice |this_XCable_1= ruleXCable ) ;
	public final EObject ruleNetworkElement() throws RecognitionException {
		EObject current = null;


		EObject this_XDevice_0 =null;
		EObject this_XCable_1 =null;


			enterRule();

		try {
			// InternalXtextImpl.g:113:2: ( (this_XDevice_0= ruleXDevice |this_XCable_1= ruleXCable ) )
			// InternalXtextImpl.g:114:2: (this_XDevice_0= ruleXDevice |this_XCable_1= ruleXCable )
			{
			// InternalXtextImpl.g:114:2: (this_XDevice_0= ruleXDevice |this_XCable_1= ruleXCable )
			int alt2=2;
			int LA2_0 = input.LA(1);
			if ( (LA2_0==14||(LA2_0 >= 18 && LA2_0 <= 19)) ) {
				alt2=1;
			}
			else if ( ((LA2_0 >= 15 && LA2_0 <= 16)) ) {
				alt2=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 2, 0, input);
				throw nvae;
			}

			switch (alt2) {
				case 1 :
					// InternalXtextImpl.g:115:3: this_XDevice_0= ruleXDevice
					{

								newCompositeNode(grammarAccess.getNetworkElementAccess().getXDeviceParserRuleCall_0());
							
					pushFollow(FOLLOW_2);
					this_XDevice_0=ruleXDevice();
					state._fsp--;


								current = this_XDevice_0;
								afterParserOrEnumRuleCall();
							
					}
					break;
				case 2 :
					// InternalXtextImpl.g:124:3: this_XCable_1= ruleXCable
					{

								newCompositeNode(grammarAccess.getNetworkElementAccess().getXCableParserRuleCall_1());
							
					pushFollow(FOLLOW_2);
					this_XCable_1=ruleXCable();
					state._fsp--;


								current = this_XCable_1;
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
	// $ANTLR end "ruleNetworkElement"



	// $ANTLR start "entryRuleXDevice"
	// InternalXtextImpl.g:136:1: entryRuleXDevice returns [EObject current=null] :iv_ruleXDevice= ruleXDevice EOF ;
	public final EObject entryRuleXDevice() throws RecognitionException {
		EObject current = null;


		EObject iv_ruleXDevice =null;

		try {
			// InternalXtextImpl.g:136:48: (iv_ruleXDevice= ruleXDevice EOF )
			// InternalXtextImpl.g:137:2: iv_ruleXDevice= ruleXDevice EOF
			{
			 newCompositeNode(grammarAccess.getXDeviceRule()); 
			pushFollow(FOLLOW_1);
			iv_ruleXDevice=ruleXDevice();
			state._fsp--;

			 current =iv_ruleXDevice; 
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
	// $ANTLR end "entryRuleXDevice"



	// $ANTLR start "ruleXDevice"
	// InternalXtextImpl.g:143:1: ruleXDevice returns [EObject current=null] : (this_XServer_0= ruleXServer |this_XComputer_1= ruleXComputer |this_XRouter_2= ruleXRouter ) ;
	public final EObject ruleXDevice() throws RecognitionException {
		EObject current = null;


		EObject this_XServer_0 =null;
		EObject this_XComputer_1 =null;
		EObject this_XRouter_2 =null;


			enterRule();

		try {
			// InternalXtextImpl.g:149:2: ( (this_XServer_0= ruleXServer |this_XComputer_1= ruleXComputer |this_XRouter_2= ruleXRouter ) )
			// InternalXtextImpl.g:150:2: (this_XServer_0= ruleXServer |this_XComputer_1= ruleXComputer |this_XRouter_2= ruleXRouter )
			{
			// InternalXtextImpl.g:150:2: (this_XServer_0= ruleXServer |this_XComputer_1= ruleXComputer |this_XRouter_2= ruleXRouter )
			int alt3=3;
			switch ( input.LA(1) ) {
			case 19:
				{
				alt3=1;
				}
				break;
			case 14:
				{
				alt3=2;
				}
				break;
			case 18:
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
					// InternalXtextImpl.g:151:3: this_XServer_0= ruleXServer
					{

								newCompositeNode(grammarAccess.getXDeviceAccess().getXServerParserRuleCall_0());
							
					pushFollow(FOLLOW_2);
					this_XServer_0=ruleXServer();
					state._fsp--;


								current = this_XServer_0;
								afterParserOrEnumRuleCall();
							
					}
					break;
				case 2 :
					// InternalXtextImpl.g:160:3: this_XComputer_1= ruleXComputer
					{

								newCompositeNode(grammarAccess.getXDeviceAccess().getXComputerParserRuleCall_1());
							
					pushFollow(FOLLOW_2);
					this_XComputer_1=ruleXComputer();
					state._fsp--;


								current = this_XComputer_1;
								afterParserOrEnumRuleCall();
							
					}
					break;
				case 3 :
					// InternalXtextImpl.g:169:3: this_XRouter_2= ruleXRouter
					{

								newCompositeNode(grammarAccess.getXDeviceAccess().getXRouterParserRuleCall_2());
							
					pushFollow(FOLLOW_2);
					this_XRouter_2=ruleXRouter();
					state._fsp--;


								current = this_XRouter_2;
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
	// $ANTLR end "ruleXDevice"



	// $ANTLR start "entryRuleXCable"
	// InternalXtextImpl.g:181:1: entryRuleXCable returns [EObject current=null] :iv_ruleXCable= ruleXCable EOF ;
	public final EObject entryRuleXCable() throws RecognitionException {
		EObject current = null;


		EObject iv_ruleXCable =null;

		try {
			// InternalXtextImpl.g:181:47: (iv_ruleXCable= ruleXCable EOF )
			// InternalXtextImpl.g:182:2: iv_ruleXCable= ruleXCable EOF
			{
			 newCompositeNode(grammarAccess.getXCableRule()); 
			pushFollow(FOLLOW_1);
			iv_ruleXCable=ruleXCable();
			state._fsp--;

			 current =iv_ruleXCable; 
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
	// $ANTLR end "entryRuleXCable"



	// $ANTLR start "ruleXCable"
	// InternalXtextImpl.g:188:1: ruleXCable returns [EObject current=null] : (this_XCopperCable_0= ruleXCopperCable |this_XGlassFiberCable_1= ruleXGlassFiberCable ) ;
	public final EObject ruleXCable() throws RecognitionException {
		EObject current = null;


		EObject this_XCopperCable_0 =null;
		EObject this_XGlassFiberCable_1 =null;


			enterRule();

		try {
			// InternalXtextImpl.g:194:2: ( (this_XCopperCable_0= ruleXCopperCable |this_XGlassFiberCable_1= ruleXGlassFiberCable ) )
			// InternalXtextImpl.g:195:2: (this_XCopperCable_0= ruleXCopperCable |this_XGlassFiberCable_1= ruleXGlassFiberCable )
			{
			// InternalXtextImpl.g:195:2: (this_XCopperCable_0= ruleXCopperCable |this_XGlassFiberCable_1= ruleXGlassFiberCable )
			int alt4=2;
			int LA4_0 = input.LA(1);
			if ( (LA4_0==15) ) {
				alt4=1;
			}
			else if ( (LA4_0==16) ) {
				alt4=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 4, 0, input);
				throw nvae;
			}

			switch (alt4) {
				case 1 :
					// InternalXtextImpl.g:196:3: this_XCopperCable_0= ruleXCopperCable
					{

								newCompositeNode(grammarAccess.getXCableAccess().getXCopperCableParserRuleCall_0());
							
					pushFollow(FOLLOW_2);
					this_XCopperCable_0=ruleXCopperCable();
					state._fsp--;


								current = this_XCopperCable_0;
								afterParserOrEnumRuleCall();
							
					}
					break;
				case 2 :
					// InternalXtextImpl.g:205:3: this_XGlassFiberCable_1= ruleXGlassFiberCable
					{

								newCompositeNode(grammarAccess.getXCableAccess().getXGlassFiberCableParserRuleCall_1());
							
					pushFollow(FOLLOW_2);
					this_XGlassFiberCable_1=ruleXGlassFiberCable();
					state._fsp--;


								current = this_XGlassFiberCable_1;
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
	// $ANTLR end "ruleXCable"



	// $ANTLR start "entryRuleConnections"
	// InternalXtextImpl.g:217:1: entryRuleConnections returns [EObject current=null] :iv_ruleConnections= ruleConnections EOF ;
	public final EObject entryRuleConnections() throws RecognitionException {
		EObject current = null;


		EObject iv_ruleConnections =null;

		try {
			// InternalXtextImpl.g:217:52: (iv_ruleConnections= ruleConnections EOF )
			// InternalXtextImpl.g:218:2: iv_ruleConnections= ruleConnections EOF
			{
			 newCompositeNode(grammarAccess.getConnectionsRule()); 
			pushFollow(FOLLOW_1);
			iv_ruleConnections=ruleConnections();
			state._fsp--;

			 current =iv_ruleConnections; 
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
	// $ANTLR end "entryRuleConnections"



	// $ANTLR start "ruleConnections"
	// InternalXtextImpl.g:224:1: ruleConnections returns [EObject current=null] : ( () (otherlv_1= 'incoming' otherlv_2= '(' ( (otherlv_3= RULE_ID ) ) (otherlv_4= ',' ( (otherlv_5= RULE_ID ) ) )* otherlv_6= ')' )? (otherlv_7= 'outgoing' otherlv_8= '(' ( (otherlv_9= RULE_ID ) ) (otherlv_10= ',' ( (otherlv_11= RULE_ID ) ) )* otherlv_12= ')' )? ) ;
	public final EObject ruleConnections() throws RecognitionException {
		EObject current = null;


		Token otherlv_1=null;
		Token otherlv_2=null;
		Token otherlv_3=null;
		Token otherlv_4=null;
		Token otherlv_5=null;
		Token otherlv_6=null;
		Token otherlv_7=null;
		Token otherlv_8=null;
		Token otherlv_9=null;
		Token otherlv_10=null;
		Token otherlv_11=null;
		Token otherlv_12=null;


			enterRule();

		try {
			// InternalXtextImpl.g:230:2: ( ( () (otherlv_1= 'incoming' otherlv_2= '(' ( (otherlv_3= RULE_ID ) ) (otherlv_4= ',' ( (otherlv_5= RULE_ID ) ) )* otherlv_6= ')' )? (otherlv_7= 'outgoing' otherlv_8= '(' ( (otherlv_9= RULE_ID ) ) (otherlv_10= ',' ( (otherlv_11= RULE_ID ) ) )* otherlv_12= ')' )? ) )
			// InternalXtextImpl.g:231:2: ( () (otherlv_1= 'incoming' otherlv_2= '(' ( (otherlv_3= RULE_ID ) ) (otherlv_4= ',' ( (otherlv_5= RULE_ID ) ) )* otherlv_6= ')' )? (otherlv_7= 'outgoing' otherlv_8= '(' ( (otherlv_9= RULE_ID ) ) (otherlv_10= ',' ( (otherlv_11= RULE_ID ) ) )* otherlv_12= ')' )? )
			{
			// InternalXtextImpl.g:231:2: ( () (otherlv_1= 'incoming' otherlv_2= '(' ( (otherlv_3= RULE_ID ) ) (otherlv_4= ',' ( (otherlv_5= RULE_ID ) ) )* otherlv_6= ')' )? (otherlv_7= 'outgoing' otherlv_8= '(' ( (otherlv_9= RULE_ID ) ) (otherlv_10= ',' ( (otherlv_11= RULE_ID ) ) )* otherlv_12= ')' )? )
			// InternalXtextImpl.g:232:3: () (otherlv_1= 'incoming' otherlv_2= '(' ( (otherlv_3= RULE_ID ) ) (otherlv_4= ',' ( (otherlv_5= RULE_ID ) ) )* otherlv_6= ')' )? (otherlv_7= 'outgoing' otherlv_8= '(' ( (otherlv_9= RULE_ID ) ) (otherlv_10= ',' ( (otherlv_11= RULE_ID ) ) )* otherlv_12= ')' )?
			{
			// InternalXtextImpl.g:232:3: ()
			// InternalXtextImpl.g:233:4: 
			{

							current = forceCreateModelElement(
								grammarAccess.getConnectionsAccess().getConnectionsAction_0(),
								current);
						
			}

			// InternalXtextImpl.g:239:3: (otherlv_1= 'incoming' otherlv_2= '(' ( (otherlv_3= RULE_ID ) ) (otherlv_4= ',' ( (otherlv_5= RULE_ID ) ) )* otherlv_6= ')' )?
			int alt6=2;
			int LA6_0 = input.LA(1);
			if ( (LA6_0==23) ) {
				alt6=1;
			}
			switch (alt6) {
				case 1 :
					// InternalXtextImpl.g:240:4: otherlv_1= 'incoming' otherlv_2= '(' ( (otherlv_3= RULE_ID ) ) (otherlv_4= ',' ( (otherlv_5= RULE_ID ) ) )* otherlv_6= ')'
					{
					otherlv_1=(Token)match(input,23,FOLLOW_4); 

									newLeafNode(otherlv_1, grammarAccess.getConnectionsAccess().getIncomingKeyword_1_0());
								
					otherlv_2=(Token)match(input,11,FOLLOW_5); 

									newLeafNode(otherlv_2, grammarAccess.getConnectionsAccess().getLeftParenthesisKeyword_1_1());
								
					// InternalXtextImpl.g:248:4: ( (otherlv_3= RULE_ID ) )
					// InternalXtextImpl.g:249:5: (otherlv_3= RULE_ID )
					{
					// InternalXtextImpl.g:249:5: (otherlv_3= RULE_ID )
					// InternalXtextImpl.g:250:6: otherlv_3= RULE_ID
					{

											if (current==null) {
												current = createModelElement(grammarAccess.getConnectionsRule());
											}
										
					otherlv_3=(Token)match(input,RULE_ID,FOLLOW_6); 

											newLeafNode(otherlv_3, grammarAccess.getConnectionsAccess().getIncomingXCableCrossReference_1_2_0());
										
					}

					}

					// InternalXtextImpl.g:261:4: (otherlv_4= ',' ( (otherlv_5= RULE_ID ) ) )*
					loop5:
					while (true) {
						int alt5=2;
						int LA5_0 = input.LA(1);
						if ( (LA5_0==13) ) {
							alt5=1;
						}

						switch (alt5) {
						case 1 :
							// InternalXtextImpl.g:262:5: otherlv_4= ',' ( (otherlv_5= RULE_ID ) )
							{
							otherlv_4=(Token)match(input,13,FOLLOW_5); 

												newLeafNode(otherlv_4, grammarAccess.getConnectionsAccess().getCommaKeyword_1_3_0());
											
							// InternalXtextImpl.g:266:5: ( (otherlv_5= RULE_ID ) )
							// InternalXtextImpl.g:267:6: (otherlv_5= RULE_ID )
							{
							// InternalXtextImpl.g:267:6: (otherlv_5= RULE_ID )
							// InternalXtextImpl.g:268:7: otherlv_5= RULE_ID
							{

														if (current==null) {
															current = createModelElement(grammarAccess.getConnectionsRule());
														}
													
							otherlv_5=(Token)match(input,RULE_ID,FOLLOW_6); 

														newLeafNode(otherlv_5, grammarAccess.getConnectionsAccess().getIncomingXCableCrossReference_1_3_1_0());
													
							}

							}

							}
							break;

						default :
							break loop5;
						}
					}

					otherlv_6=(Token)match(input,12,FOLLOW_7); 

									newLeafNode(otherlv_6, grammarAccess.getConnectionsAccess().getRightParenthesisKeyword_1_4());
								
					}
					break;

			}

			// InternalXtextImpl.g:285:3: (otherlv_7= 'outgoing' otherlv_8= '(' ( (otherlv_9= RULE_ID ) ) (otherlv_10= ',' ( (otherlv_11= RULE_ID ) ) )* otherlv_12= ')' )?
			int alt8=2;
			int LA8_0 = input.LA(1);
			if ( (LA8_0==27) ) {
				alt8=1;
			}
			switch (alt8) {
				case 1 :
					// InternalXtextImpl.g:286:4: otherlv_7= 'outgoing' otherlv_8= '(' ( (otherlv_9= RULE_ID ) ) (otherlv_10= ',' ( (otherlv_11= RULE_ID ) ) )* otherlv_12= ')'
					{
					otherlv_7=(Token)match(input,27,FOLLOW_4); 

									newLeafNode(otherlv_7, grammarAccess.getConnectionsAccess().getOutgoingKeyword_2_0());
								
					otherlv_8=(Token)match(input,11,FOLLOW_5); 

									newLeafNode(otherlv_8, grammarAccess.getConnectionsAccess().getLeftParenthesisKeyword_2_1());
								
					// InternalXtextImpl.g:294:4: ( (otherlv_9= RULE_ID ) )
					// InternalXtextImpl.g:295:5: (otherlv_9= RULE_ID )
					{
					// InternalXtextImpl.g:295:5: (otherlv_9= RULE_ID )
					// InternalXtextImpl.g:296:6: otherlv_9= RULE_ID
					{

											if (current==null) {
												current = createModelElement(grammarAccess.getConnectionsRule());
											}
										
					otherlv_9=(Token)match(input,RULE_ID,FOLLOW_6); 

											newLeafNode(otherlv_9, grammarAccess.getConnectionsAccess().getOutgoingXCableCrossReference_2_2_0());
										
					}

					}

					// InternalXtextImpl.g:307:4: (otherlv_10= ',' ( (otherlv_11= RULE_ID ) ) )*
					loop7:
					while (true) {
						int alt7=2;
						int LA7_0 = input.LA(1);
						if ( (LA7_0==13) ) {
							alt7=1;
						}

						switch (alt7) {
						case 1 :
							// InternalXtextImpl.g:308:5: otherlv_10= ',' ( (otherlv_11= RULE_ID ) )
							{
							otherlv_10=(Token)match(input,13,FOLLOW_5); 

												newLeafNode(otherlv_10, grammarAccess.getConnectionsAccess().getCommaKeyword_2_3_0());
											
							// InternalXtextImpl.g:312:5: ( (otherlv_11= RULE_ID ) )
							// InternalXtextImpl.g:313:6: (otherlv_11= RULE_ID )
							{
							// InternalXtextImpl.g:313:6: (otherlv_11= RULE_ID )
							// InternalXtextImpl.g:314:7: otherlv_11= RULE_ID
							{

														if (current==null) {
															current = createModelElement(grammarAccess.getConnectionsRule());
														}
													
							otherlv_11=(Token)match(input,RULE_ID,FOLLOW_6); 

														newLeafNode(otherlv_11, grammarAccess.getConnectionsAccess().getOutgoingXCableCrossReference_2_3_1_0());
													
							}

							}

							}
							break;

						default :
							break loop7;
						}
					}

					otherlv_12=(Token)match(input,12,FOLLOW_2); 

									newLeafNode(otherlv_12, grammarAccess.getConnectionsAccess().getRightParenthesisKeyword_2_4());
								
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
			// do for sure before leaving
		}
		return current;
	}
	// $ANTLR end "ruleConnections"



	// $ANTLR start "entryRuleEBigInteger"
	// InternalXtextImpl.g:335:1: entryRuleEBigInteger returns [String current=null] :iv_ruleEBigInteger= ruleEBigInteger EOF ;
	public final String entryRuleEBigInteger() throws RecognitionException {
		String current = null;


		AntlrDatatypeRuleToken iv_ruleEBigInteger =null;

		try {
			// InternalXtextImpl.g:335:51: (iv_ruleEBigInteger= ruleEBigInteger EOF )
			// InternalXtextImpl.g:336:2: iv_ruleEBigInteger= ruleEBigInteger EOF
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
	// InternalXtextImpl.g:342:1: ruleEBigInteger returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_INT_0= RULE_INT ;
	public final AntlrDatatypeRuleToken ruleEBigInteger() throws RecognitionException {
		AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();


		Token this_INT_0=null;


			enterRule();

		try {
			// InternalXtextImpl.g:348:2: (this_INT_0= RULE_INT )
			// InternalXtextImpl.g:349:2: this_INT_0= RULE_INT
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



	// $ANTLR start "entryRulebool"
	// InternalXtextImpl.g:359:1: entryRulebool returns [String current=null] :iv_rulebool= rulebool EOF ;
	public final String entryRulebool() throws RecognitionException {
		String current = null;


		AntlrDatatypeRuleToken iv_rulebool =null;

		try {
			// InternalXtextImpl.g:359:44: (iv_rulebool= rulebool EOF )
			// InternalXtextImpl.g:360:2: iv_rulebool= rulebool EOF
			{
			 newCompositeNode(grammarAccess.getBoolRule()); 
			pushFollow(FOLLOW_1);
			iv_rulebool=rulebool();
			state._fsp--;

			 current =iv_rulebool.getText(); 
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
	// $ANTLR end "entryRulebool"



	// $ANTLR start "rulebool"
	// InternalXtextImpl.g:366:1: rulebool returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'true' |kw= 'false' ) ;
	public final AntlrDatatypeRuleToken rulebool() throws RecognitionException {
		AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();


		Token kw=null;


			enterRule();

		try {
			// InternalXtextImpl.g:372:2: ( (kw= 'true' |kw= 'false' ) )
			// InternalXtextImpl.g:373:2: (kw= 'true' |kw= 'false' )
			{
			// InternalXtextImpl.g:373:2: (kw= 'true' |kw= 'false' )
			int alt9=2;
			int LA9_0 = input.LA(1);
			if ( (LA9_0==29) ) {
				alt9=1;
			}
			else if ( (LA9_0==22) ) {
				alt9=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 9, 0, input);
				throw nvae;
			}

			switch (alt9) {
				case 1 :
					// InternalXtextImpl.g:374:3: kw= 'true'
					{
					kw=(Token)match(input,29,FOLLOW_2); 

								current.merge(kw);
								newLeafNode(kw, grammarAccess.getBoolAccess().getTrueKeyword_0());
							
					}
					break;
				case 2 :
					// InternalXtextImpl.g:380:3: kw= 'false'
					{
					kw=(Token)match(input,22,FOLLOW_2); 

								current.merge(kw);
								newLeafNode(kw, grammarAccess.getBoolAccess().getFalseKeyword_1());
							
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
	// $ANTLR end "rulebool"



	// $ANTLR start "entryRuleCableAttributes"
	// InternalXtextImpl.g:389:1: entryRuleCableAttributes returns [EObject current=null] :iv_ruleCableAttributes= ruleCableAttributes EOF ;
	public final EObject entryRuleCableAttributes() throws RecognitionException {
		EObject current = null;


		EObject iv_ruleCableAttributes =null;

		try {
			// InternalXtextImpl.g:389:56: (iv_ruleCableAttributes= ruleCableAttributes EOF )
			// InternalXtextImpl.g:390:2: iv_ruleCableAttributes= ruleCableAttributes EOF
			{
			 newCompositeNode(grammarAccess.getCableAttributesRule()); 
			pushFollow(FOLLOW_1);
			iv_ruleCableAttributes=ruleCableAttributes();
			state._fsp--;

			 current =iv_ruleCableAttributes; 
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
	// $ANTLR end "entryRuleCableAttributes"



	// $ANTLR start "ruleCableAttributes"
	// InternalXtextImpl.g:396:1: ruleCableAttributes returns [EObject current=null] : ( () otherlv_1= 'speed' ( (lv_speed_2_0= ruleEBigInteger ) ) otherlv_3= 'endPoint1' ( (otherlv_4= RULE_ID ) ) otherlv_5= 'endPoint2' ( (otherlv_6= RULE_ID ) ) (otherlv_7= 'isDuplex' ( (lv_isDuplex_8_0= rulebool ) ) )? ) ;
	public final EObject ruleCableAttributes() throws RecognitionException {
		EObject current = null;


		Token otherlv_1=null;
		Token otherlv_3=null;
		Token otherlv_4=null;
		Token otherlv_5=null;
		Token otherlv_6=null;
		Token otherlv_7=null;
		AntlrDatatypeRuleToken lv_speed_2_0 =null;
		AntlrDatatypeRuleToken lv_isDuplex_8_0 =null;


			enterRule();

		try {
			// InternalXtextImpl.g:402:2: ( ( () otherlv_1= 'speed' ( (lv_speed_2_0= ruleEBigInteger ) ) otherlv_3= 'endPoint1' ( (otherlv_4= RULE_ID ) ) otherlv_5= 'endPoint2' ( (otherlv_6= RULE_ID ) ) (otherlv_7= 'isDuplex' ( (lv_isDuplex_8_0= rulebool ) ) )? ) )
			// InternalXtextImpl.g:403:2: ( () otherlv_1= 'speed' ( (lv_speed_2_0= ruleEBigInteger ) ) otherlv_3= 'endPoint1' ( (otherlv_4= RULE_ID ) ) otherlv_5= 'endPoint2' ( (otherlv_6= RULE_ID ) ) (otherlv_7= 'isDuplex' ( (lv_isDuplex_8_0= rulebool ) ) )? )
			{
			// InternalXtextImpl.g:403:2: ( () otherlv_1= 'speed' ( (lv_speed_2_0= ruleEBigInteger ) ) otherlv_3= 'endPoint1' ( (otherlv_4= RULE_ID ) ) otherlv_5= 'endPoint2' ( (otherlv_6= RULE_ID ) ) (otherlv_7= 'isDuplex' ( (lv_isDuplex_8_0= rulebool ) ) )? )
			// InternalXtextImpl.g:404:3: () otherlv_1= 'speed' ( (lv_speed_2_0= ruleEBigInteger ) ) otherlv_3= 'endPoint1' ( (otherlv_4= RULE_ID ) ) otherlv_5= 'endPoint2' ( (otherlv_6= RULE_ID ) ) (otherlv_7= 'isDuplex' ( (lv_isDuplex_8_0= rulebool ) ) )?
			{
			// InternalXtextImpl.g:404:3: ()
			// InternalXtextImpl.g:405:4: 
			{

							current = forceCreateModelElement(
								grammarAccess.getCableAttributesAccess().getCableAttributesAction_0(),
								current);
						
			}

			otherlv_1=(Token)match(input,28,FOLLOW_8); 

						newLeafNode(otherlv_1, grammarAccess.getCableAttributesAccess().getSpeedKeyword_1());
					
			// InternalXtextImpl.g:415:3: ( (lv_speed_2_0= ruleEBigInteger ) )
			// InternalXtextImpl.g:416:4: (lv_speed_2_0= ruleEBigInteger )
			{
			// InternalXtextImpl.g:416:4: (lv_speed_2_0= ruleEBigInteger )
			// InternalXtextImpl.g:417:5: lv_speed_2_0= ruleEBigInteger
			{

								newCompositeNode(grammarAccess.getCableAttributesAccess().getSpeedEBigIntegerParserRuleCall_2_0());
							
			pushFollow(FOLLOW_9);
			lv_speed_2_0=ruleEBigInteger();
			state._fsp--;


								if (current==null) {
									current = createModelElementForParent(grammarAccess.getCableAttributesRule());
								}
								set(
									current,
									"speed",
									lv_speed_2_0,
									"xtextImplementation.XtextImpl.EBigInteger");
								afterParserOrEnumRuleCall();
							
			}

			}

			otherlv_3=(Token)match(input,20,FOLLOW_5); 

						newLeafNode(otherlv_3, grammarAccess.getCableAttributesAccess().getEndPoint1Keyword_3());
					
			// InternalXtextImpl.g:438:3: ( (otherlv_4= RULE_ID ) )
			// InternalXtextImpl.g:439:4: (otherlv_4= RULE_ID )
			{
			// InternalXtextImpl.g:439:4: (otherlv_4= RULE_ID )
			// InternalXtextImpl.g:440:5: otherlv_4= RULE_ID
			{

								if (current==null) {
									current = createModelElement(grammarAccess.getCableAttributesRule());
								}
							
			otherlv_4=(Token)match(input,RULE_ID,FOLLOW_10); 

								newLeafNode(otherlv_4, grammarAccess.getCableAttributesAccess().getEndPoint1XDeviceCrossReference_4_0());
							
			}

			}

			otherlv_5=(Token)match(input,21,FOLLOW_5); 

						newLeafNode(otherlv_5, grammarAccess.getCableAttributesAccess().getEndPoint2Keyword_5());
					
			// InternalXtextImpl.g:455:3: ( (otherlv_6= RULE_ID ) )
			// InternalXtextImpl.g:456:4: (otherlv_6= RULE_ID )
			{
			// InternalXtextImpl.g:456:4: (otherlv_6= RULE_ID )
			// InternalXtextImpl.g:457:5: otherlv_6= RULE_ID
			{

								if (current==null) {
									current = createModelElement(grammarAccess.getCableAttributesRule());
								}
							
			otherlv_6=(Token)match(input,RULE_ID,FOLLOW_11); 

								newLeafNode(otherlv_6, grammarAccess.getCableAttributesAccess().getEndPoint2XDeviceCrossReference_6_0());
							
			}

			}

			// InternalXtextImpl.g:468:3: (otherlv_7= 'isDuplex' ( (lv_isDuplex_8_0= rulebool ) ) )?
			int alt10=2;
			int LA10_0 = input.LA(1);
			if ( (LA10_0==24) ) {
				alt10=1;
			}
			switch (alt10) {
				case 1 :
					// InternalXtextImpl.g:469:4: otherlv_7= 'isDuplex' ( (lv_isDuplex_8_0= rulebool ) )
					{
					otherlv_7=(Token)match(input,24,FOLLOW_12); 

									newLeafNode(otherlv_7, grammarAccess.getCableAttributesAccess().getIsDuplexKeyword_7_0());
								
					// InternalXtextImpl.g:473:4: ( (lv_isDuplex_8_0= rulebool ) )
					// InternalXtextImpl.g:474:5: (lv_isDuplex_8_0= rulebool )
					{
					// InternalXtextImpl.g:474:5: (lv_isDuplex_8_0= rulebool )
					// InternalXtextImpl.g:475:6: lv_isDuplex_8_0= rulebool
					{

											newCompositeNode(grammarAccess.getCableAttributesAccess().getIsDuplexBoolParserRuleCall_7_1_0());
										
					pushFollow(FOLLOW_2);
					lv_isDuplex_8_0=rulebool();
					state._fsp--;


											if (current==null) {
												current = createModelElementForParent(grammarAccess.getCableAttributesRule());
											}
											set(
												current,
												"isDuplex",
												lv_isDuplex_8_0,
												"xtextImplementation.XtextImpl.bool");
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
			// do for sure before leaving
		}
		return current;
	}
	// $ANTLR end "ruleCableAttributes"



	// $ANTLR start "entryRuleXServer"
	// InternalXtextImpl.g:497:1: entryRuleXServer returns [EObject current=null] :iv_ruleXServer= ruleXServer EOF ;
	public final EObject entryRuleXServer() throws RecognitionException {
		EObject current = null;


		EObject iv_ruleXServer =null;

		try {
			// InternalXtextImpl.g:497:48: (iv_ruleXServer= ruleXServer EOF )
			// InternalXtextImpl.g:498:2: iv_ruleXServer= ruleXServer EOF
			{
			 newCompositeNode(grammarAccess.getXServerRule()); 
			pushFollow(FOLLOW_1);
			iv_ruleXServer=ruleXServer();
			state._fsp--;

			 current =iv_ruleXServer; 
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
	// $ANTLR end "entryRuleXServer"



	// $ANTLR start "ruleXServer"
	// InternalXtextImpl.g:504:1: ruleXServer returns [EObject current=null] : (otherlv_0= 'Server' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'maxSlots' ( (lv_maxSlots_4_0= ruleEBigInteger ) ) otherlv_5= 'MTBF' ( (lv_MTBF_6_0= ruleEBigInteger ) ) ( (lv_connections_7_0= ruleConnections ) ) otherlv_8= '}' ) ;
	public final EObject ruleXServer() throws RecognitionException {
		EObject current = null;


		Token otherlv_0=null;
		Token lv_name_1_0=null;
		Token otherlv_2=null;
		Token otherlv_3=null;
		Token otherlv_5=null;
		Token otherlv_8=null;
		AntlrDatatypeRuleToken lv_maxSlots_4_0 =null;
		AntlrDatatypeRuleToken lv_MTBF_6_0 =null;
		EObject lv_connections_7_0 =null;


			enterRule();

		try {
			// InternalXtextImpl.g:510:2: ( (otherlv_0= 'Server' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'maxSlots' ( (lv_maxSlots_4_0= ruleEBigInteger ) ) otherlv_5= 'MTBF' ( (lv_MTBF_6_0= ruleEBigInteger ) ) ( (lv_connections_7_0= ruleConnections ) ) otherlv_8= '}' ) )
			// InternalXtextImpl.g:511:2: (otherlv_0= 'Server' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'maxSlots' ( (lv_maxSlots_4_0= ruleEBigInteger ) ) otherlv_5= 'MTBF' ( (lv_MTBF_6_0= ruleEBigInteger ) ) ( (lv_connections_7_0= ruleConnections ) ) otherlv_8= '}' )
			{
			// InternalXtextImpl.g:511:2: (otherlv_0= 'Server' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'maxSlots' ( (lv_maxSlots_4_0= ruleEBigInteger ) ) otherlv_5= 'MTBF' ( (lv_MTBF_6_0= ruleEBigInteger ) ) ( (lv_connections_7_0= ruleConnections ) ) otherlv_8= '}' )
			// InternalXtextImpl.g:512:3: otherlv_0= 'Server' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'maxSlots' ( (lv_maxSlots_4_0= ruleEBigInteger ) ) otherlv_5= 'MTBF' ( (lv_MTBF_6_0= ruleEBigInteger ) ) ( (lv_connections_7_0= ruleConnections ) ) otherlv_8= '}'
			{
			otherlv_0=(Token)match(input,19,FOLLOW_5); 

						newLeafNode(otherlv_0, grammarAccess.getXServerAccess().getServerKeyword_0());
					
			// InternalXtextImpl.g:516:3: ( (lv_name_1_0= RULE_ID ) )
			// InternalXtextImpl.g:517:4: (lv_name_1_0= RULE_ID )
			{
			// InternalXtextImpl.g:517:4: (lv_name_1_0= RULE_ID )
			// InternalXtextImpl.g:518:5: lv_name_1_0= RULE_ID
			{
			lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_13); 

								newLeafNode(lv_name_1_0, grammarAccess.getXServerAccess().getNameIDTerminalRuleCall_1_0());
							

								if (current==null) {
									current = createModelElement(grammarAccess.getXServerRule());
								}
								setWithLastConsumed(
									current,
									"name",
									lv_name_1_0,
									"org.eclipse.xtext.common.Terminals.ID");
							
			}

			}

			otherlv_2=(Token)match(input,30,FOLLOW_14); 

						newLeafNode(otherlv_2, grammarAccess.getXServerAccess().getLeftCurlyBracketKeyword_2());
					
			otherlv_3=(Token)match(input,25,FOLLOW_8); 

						newLeafNode(otherlv_3, grammarAccess.getXServerAccess().getMaxSlotsKeyword_3());
					
			// InternalXtextImpl.g:542:3: ( (lv_maxSlots_4_0= ruleEBigInteger ) )
			// InternalXtextImpl.g:543:4: (lv_maxSlots_4_0= ruleEBigInteger )
			{
			// InternalXtextImpl.g:543:4: (lv_maxSlots_4_0= ruleEBigInteger )
			// InternalXtextImpl.g:544:5: lv_maxSlots_4_0= ruleEBigInteger
			{

								newCompositeNode(grammarAccess.getXServerAccess().getMaxSlotsEBigIntegerParserRuleCall_4_0());
							
			pushFollow(FOLLOW_15);
			lv_maxSlots_4_0=ruleEBigInteger();
			state._fsp--;


								if (current==null) {
									current = createModelElementForParent(grammarAccess.getXServerRule());
								}
								set(
									current,
									"maxSlots",
									lv_maxSlots_4_0,
									"xtextImplementation.XtextImpl.EBigInteger");
								afterParserOrEnumRuleCall();
							
			}

			}

			otherlv_5=(Token)match(input,17,FOLLOW_8); 

						newLeafNode(otherlv_5, grammarAccess.getXServerAccess().getMTBFKeyword_5());
					
			// InternalXtextImpl.g:565:3: ( (lv_MTBF_6_0= ruleEBigInteger ) )
			// InternalXtextImpl.g:566:4: (lv_MTBF_6_0= ruleEBigInteger )
			{
			// InternalXtextImpl.g:566:4: (lv_MTBF_6_0= ruleEBigInteger )
			// InternalXtextImpl.g:567:5: lv_MTBF_6_0= ruleEBigInteger
			{

								newCompositeNode(grammarAccess.getXServerAccess().getMTBFEBigIntegerParserRuleCall_6_0());
							
			pushFollow(FOLLOW_16);
			lv_MTBF_6_0=ruleEBigInteger();
			state._fsp--;


								if (current==null) {
									current = createModelElementForParent(grammarAccess.getXServerRule());
								}
								set(
									current,
									"MTBF",
									lv_MTBF_6_0,
									"xtextImplementation.XtextImpl.EBigInteger");
								afterParserOrEnumRuleCall();
							
			}

			}

			// InternalXtextImpl.g:584:3: ( (lv_connections_7_0= ruleConnections ) )
			// InternalXtextImpl.g:585:4: (lv_connections_7_0= ruleConnections )
			{
			// InternalXtextImpl.g:585:4: (lv_connections_7_0= ruleConnections )
			// InternalXtextImpl.g:586:5: lv_connections_7_0= ruleConnections
			{

								newCompositeNode(grammarAccess.getXServerAccess().getConnectionsConnectionsParserRuleCall_7_0());
							
			pushFollow(FOLLOW_17);
			lv_connections_7_0=ruleConnections();
			state._fsp--;


								if (current==null) {
									current = createModelElementForParent(grammarAccess.getXServerRule());
								}
								set(
									current,
									"connections",
									lv_connections_7_0,
									"xtextImplementation.XtextImpl.Connections");
								afterParserOrEnumRuleCall();
							
			}

			}

			otherlv_8=(Token)match(input,31,FOLLOW_2); 

						newLeafNode(otherlv_8, grammarAccess.getXServerAccess().getRightCurlyBracketKeyword_8());
					
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
	// $ANTLR end "ruleXServer"



	// $ANTLR start "entryRuleXComputer"
	// InternalXtextImpl.g:611:1: entryRuleXComputer returns [EObject current=null] :iv_ruleXComputer= ruleXComputer EOF ;
	public final EObject entryRuleXComputer() throws RecognitionException {
		EObject current = null;


		EObject iv_ruleXComputer =null;

		try {
			// InternalXtextImpl.g:611:50: (iv_ruleXComputer= ruleXComputer EOF )
			// InternalXtextImpl.g:612:2: iv_ruleXComputer= ruleXComputer EOF
			{
			 newCompositeNode(grammarAccess.getXComputerRule()); 
			pushFollow(FOLLOW_1);
			iv_ruleXComputer=ruleXComputer();
			state._fsp--;

			 current =iv_ruleXComputer; 
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
	// $ANTLR end "entryRuleXComputer"



	// $ANTLR start "ruleXComputer"
	// InternalXtextImpl.g:618:1: ruleXComputer returns [EObject current=null] : (otherlv_0= 'Computer' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_connections_3_0= ruleConnections ) ) otherlv_4= '}' ) ;
	public final EObject ruleXComputer() throws RecognitionException {
		EObject current = null;


		Token otherlv_0=null;
		Token lv_name_1_0=null;
		Token otherlv_2=null;
		Token otherlv_4=null;
		EObject lv_connections_3_0 =null;


			enterRule();

		try {
			// InternalXtextImpl.g:624:2: ( (otherlv_0= 'Computer' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_connections_3_0= ruleConnections ) ) otherlv_4= '}' ) )
			// InternalXtextImpl.g:625:2: (otherlv_0= 'Computer' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_connections_3_0= ruleConnections ) ) otherlv_4= '}' )
			{
			// InternalXtextImpl.g:625:2: (otherlv_0= 'Computer' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_connections_3_0= ruleConnections ) ) otherlv_4= '}' )
			// InternalXtextImpl.g:626:3: otherlv_0= 'Computer' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_connections_3_0= ruleConnections ) ) otherlv_4= '}'
			{
			otherlv_0=(Token)match(input,14,FOLLOW_5); 

						newLeafNode(otherlv_0, grammarAccess.getXComputerAccess().getComputerKeyword_0());
					
			// InternalXtextImpl.g:630:3: ( (lv_name_1_0= RULE_ID ) )
			// InternalXtextImpl.g:631:4: (lv_name_1_0= RULE_ID )
			{
			// InternalXtextImpl.g:631:4: (lv_name_1_0= RULE_ID )
			// InternalXtextImpl.g:632:5: lv_name_1_0= RULE_ID
			{
			lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_13); 

								newLeafNode(lv_name_1_0, grammarAccess.getXComputerAccess().getNameIDTerminalRuleCall_1_0());
							

								if (current==null) {
									current = createModelElement(grammarAccess.getXComputerRule());
								}
								setWithLastConsumed(
									current,
									"name",
									lv_name_1_0,
									"org.eclipse.xtext.common.Terminals.ID");
							
			}

			}

			otherlv_2=(Token)match(input,30,FOLLOW_16); 

						newLeafNode(otherlv_2, grammarAccess.getXComputerAccess().getLeftCurlyBracketKeyword_2());
					
			// InternalXtextImpl.g:652:3: ( (lv_connections_3_0= ruleConnections ) )
			// InternalXtextImpl.g:653:4: (lv_connections_3_0= ruleConnections )
			{
			// InternalXtextImpl.g:653:4: (lv_connections_3_0= ruleConnections )
			// InternalXtextImpl.g:654:5: lv_connections_3_0= ruleConnections
			{

								newCompositeNode(grammarAccess.getXComputerAccess().getConnectionsConnectionsParserRuleCall_3_0());
							
			pushFollow(FOLLOW_17);
			lv_connections_3_0=ruleConnections();
			state._fsp--;


								if (current==null) {
									current = createModelElementForParent(grammarAccess.getXComputerRule());
								}
								set(
									current,
									"connections",
									lv_connections_3_0,
									"xtextImplementation.XtextImpl.Connections");
								afterParserOrEnumRuleCall();
							
			}

			}

			otherlv_4=(Token)match(input,31,FOLLOW_2); 

						newLeafNode(otherlv_4, grammarAccess.getXComputerAccess().getRightCurlyBracketKeyword_4());
					
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
	// $ANTLR end "ruleXComputer"



	// $ANTLR start "entryRuleXRouter"
	// InternalXtextImpl.g:679:1: entryRuleXRouter returns [EObject current=null] :iv_ruleXRouter= ruleXRouter EOF ;
	public final EObject entryRuleXRouter() throws RecognitionException {
		EObject current = null;


		EObject iv_ruleXRouter =null;

		try {
			// InternalXtextImpl.g:679:48: (iv_ruleXRouter= ruleXRouter EOF )
			// InternalXtextImpl.g:680:2: iv_ruleXRouter= ruleXRouter EOF
			{
			 newCompositeNode(grammarAccess.getXRouterRule()); 
			pushFollow(FOLLOW_1);
			iv_ruleXRouter=ruleXRouter();
			state._fsp--;

			 current =iv_ruleXRouter; 
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
	// $ANTLR end "entryRuleXRouter"



	// $ANTLR start "ruleXRouter"
	// InternalXtextImpl.g:686:1: ruleXRouter returns [EObject current=null] : (otherlv_0= 'Router' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'maxSpeed' ( (lv_maxSpeed_4_0= ruleEBigInteger ) ) ( (lv_connections_5_0= ruleConnections ) ) otherlv_6= '}' ) ;
	public final EObject ruleXRouter() throws RecognitionException {
		EObject current = null;


		Token otherlv_0=null;
		Token lv_name_1_0=null;
		Token otherlv_2=null;
		Token otherlv_3=null;
		Token otherlv_6=null;
		AntlrDatatypeRuleToken lv_maxSpeed_4_0 =null;
		EObject lv_connections_5_0 =null;


			enterRule();

		try {
			// InternalXtextImpl.g:692:2: ( (otherlv_0= 'Router' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'maxSpeed' ( (lv_maxSpeed_4_0= ruleEBigInteger ) ) ( (lv_connections_5_0= ruleConnections ) ) otherlv_6= '}' ) )
			// InternalXtextImpl.g:693:2: (otherlv_0= 'Router' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'maxSpeed' ( (lv_maxSpeed_4_0= ruleEBigInteger ) ) ( (lv_connections_5_0= ruleConnections ) ) otherlv_6= '}' )
			{
			// InternalXtextImpl.g:693:2: (otherlv_0= 'Router' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'maxSpeed' ( (lv_maxSpeed_4_0= ruleEBigInteger ) ) ( (lv_connections_5_0= ruleConnections ) ) otherlv_6= '}' )
			// InternalXtextImpl.g:694:3: otherlv_0= 'Router' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'maxSpeed' ( (lv_maxSpeed_4_0= ruleEBigInteger ) ) ( (lv_connections_5_0= ruleConnections ) ) otherlv_6= '}'
			{
			otherlv_0=(Token)match(input,18,FOLLOW_5); 

						newLeafNode(otherlv_0, grammarAccess.getXRouterAccess().getRouterKeyword_0());
					
			// InternalXtextImpl.g:698:3: ( (lv_name_1_0= RULE_ID ) )
			// InternalXtextImpl.g:699:4: (lv_name_1_0= RULE_ID )
			{
			// InternalXtextImpl.g:699:4: (lv_name_1_0= RULE_ID )
			// InternalXtextImpl.g:700:5: lv_name_1_0= RULE_ID
			{
			lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_13); 

								newLeafNode(lv_name_1_0, grammarAccess.getXRouterAccess().getNameIDTerminalRuleCall_1_0());
							

								if (current==null) {
									current = createModelElement(grammarAccess.getXRouterRule());
								}
								setWithLastConsumed(
									current,
									"name",
									lv_name_1_0,
									"org.eclipse.xtext.common.Terminals.ID");
							
			}

			}

			otherlv_2=(Token)match(input,30,FOLLOW_18); 

						newLeafNode(otherlv_2, grammarAccess.getXRouterAccess().getLeftCurlyBracketKeyword_2());
					
			otherlv_3=(Token)match(input,26,FOLLOW_8); 

						newLeafNode(otherlv_3, grammarAccess.getXRouterAccess().getMaxSpeedKeyword_3());
					
			// InternalXtextImpl.g:724:3: ( (lv_maxSpeed_4_0= ruleEBigInteger ) )
			// InternalXtextImpl.g:725:4: (lv_maxSpeed_4_0= ruleEBigInteger )
			{
			// InternalXtextImpl.g:725:4: (lv_maxSpeed_4_0= ruleEBigInteger )
			// InternalXtextImpl.g:726:5: lv_maxSpeed_4_0= ruleEBigInteger
			{

								newCompositeNode(grammarAccess.getXRouterAccess().getMaxSpeedEBigIntegerParserRuleCall_4_0());
							
			pushFollow(FOLLOW_16);
			lv_maxSpeed_4_0=ruleEBigInteger();
			state._fsp--;


								if (current==null) {
									current = createModelElementForParent(grammarAccess.getXRouterRule());
								}
								set(
									current,
									"maxSpeed",
									lv_maxSpeed_4_0,
									"xtextImplementation.XtextImpl.EBigInteger");
								afterParserOrEnumRuleCall();
							
			}

			}

			// InternalXtextImpl.g:743:3: ( (lv_connections_5_0= ruleConnections ) )
			// InternalXtextImpl.g:744:4: (lv_connections_5_0= ruleConnections )
			{
			// InternalXtextImpl.g:744:4: (lv_connections_5_0= ruleConnections )
			// InternalXtextImpl.g:745:5: lv_connections_5_0= ruleConnections
			{

								newCompositeNode(grammarAccess.getXRouterAccess().getConnectionsConnectionsParserRuleCall_5_0());
							
			pushFollow(FOLLOW_17);
			lv_connections_5_0=ruleConnections();
			state._fsp--;


								if (current==null) {
									current = createModelElementForParent(grammarAccess.getXRouterRule());
								}
								set(
									current,
									"connections",
									lv_connections_5_0,
									"xtextImplementation.XtextImpl.Connections");
								afterParserOrEnumRuleCall();
							
			}

			}

			otherlv_6=(Token)match(input,31,FOLLOW_2); 

						newLeafNode(otherlv_6, grammarAccess.getXRouterAccess().getRightCurlyBracketKeyword_6());
					
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
	// $ANTLR end "ruleXRouter"



	// $ANTLR start "entryRuleXCopperCable"
	// InternalXtextImpl.g:770:1: entryRuleXCopperCable returns [EObject current=null] :iv_ruleXCopperCable= ruleXCopperCable EOF ;
	public final EObject entryRuleXCopperCable() throws RecognitionException {
		EObject current = null;


		EObject iv_ruleXCopperCable =null;

		try {
			// InternalXtextImpl.g:770:53: (iv_ruleXCopperCable= ruleXCopperCable EOF )
			// InternalXtextImpl.g:771:2: iv_ruleXCopperCable= ruleXCopperCable EOF
			{
			 newCompositeNode(grammarAccess.getXCopperCableRule()); 
			pushFollow(FOLLOW_1);
			iv_ruleXCopperCable=ruleXCopperCable();
			state._fsp--;

			 current =iv_ruleXCopperCable; 
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
	// $ANTLR end "entryRuleXCopperCable"



	// $ANTLR start "ruleXCopperCable"
	// InternalXtextImpl.g:777:1: ruleXCopperCable returns [EObject current=null] : (otherlv_0= 'CopperCable' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_cableAttributes_3_0= ruleCableAttributes ) ) otherlv_4= '}' ) ;
	public final EObject ruleXCopperCable() throws RecognitionException {
		EObject current = null;


		Token otherlv_0=null;
		Token lv_name_1_0=null;
		Token otherlv_2=null;
		Token otherlv_4=null;
		EObject lv_cableAttributes_3_0 =null;


			enterRule();

		try {
			// InternalXtextImpl.g:783:2: ( (otherlv_0= 'CopperCable' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_cableAttributes_3_0= ruleCableAttributes ) ) otherlv_4= '}' ) )
			// InternalXtextImpl.g:784:2: (otherlv_0= 'CopperCable' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_cableAttributes_3_0= ruleCableAttributes ) ) otherlv_4= '}' )
			{
			// InternalXtextImpl.g:784:2: (otherlv_0= 'CopperCable' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_cableAttributes_3_0= ruleCableAttributes ) ) otherlv_4= '}' )
			// InternalXtextImpl.g:785:3: otherlv_0= 'CopperCable' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_cableAttributes_3_0= ruleCableAttributes ) ) otherlv_4= '}'
			{
			otherlv_0=(Token)match(input,15,FOLLOW_5); 

						newLeafNode(otherlv_0, grammarAccess.getXCopperCableAccess().getCopperCableKeyword_0());
					
			// InternalXtextImpl.g:789:3: ( (lv_name_1_0= RULE_ID ) )
			// InternalXtextImpl.g:790:4: (lv_name_1_0= RULE_ID )
			{
			// InternalXtextImpl.g:790:4: (lv_name_1_0= RULE_ID )
			// InternalXtextImpl.g:791:5: lv_name_1_0= RULE_ID
			{
			lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_13); 

								newLeafNode(lv_name_1_0, grammarAccess.getXCopperCableAccess().getNameIDTerminalRuleCall_1_0());
							

								if (current==null) {
									current = createModelElement(grammarAccess.getXCopperCableRule());
								}
								setWithLastConsumed(
									current,
									"name",
									lv_name_1_0,
									"org.eclipse.xtext.common.Terminals.ID");
							
			}

			}

			otherlv_2=(Token)match(input,30,FOLLOW_19); 

						newLeafNode(otherlv_2, grammarAccess.getXCopperCableAccess().getLeftCurlyBracketKeyword_2());
					
			// InternalXtextImpl.g:811:3: ( (lv_cableAttributes_3_0= ruleCableAttributes ) )
			// InternalXtextImpl.g:812:4: (lv_cableAttributes_3_0= ruleCableAttributes )
			{
			// InternalXtextImpl.g:812:4: (lv_cableAttributes_3_0= ruleCableAttributes )
			// InternalXtextImpl.g:813:5: lv_cableAttributes_3_0= ruleCableAttributes
			{

								newCompositeNode(grammarAccess.getXCopperCableAccess().getCableAttributesCableAttributesParserRuleCall_3_0());
							
			pushFollow(FOLLOW_17);
			lv_cableAttributes_3_0=ruleCableAttributes();
			state._fsp--;


								if (current==null) {
									current = createModelElementForParent(grammarAccess.getXCopperCableRule());
								}
								set(
									current,
									"cableAttributes",
									lv_cableAttributes_3_0,
									"xtextImplementation.XtextImpl.CableAttributes");
								afterParserOrEnumRuleCall();
							
			}

			}

			otherlv_4=(Token)match(input,31,FOLLOW_2); 

						newLeafNode(otherlv_4, grammarAccess.getXCopperCableAccess().getRightCurlyBracketKeyword_4());
					
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
	// $ANTLR end "ruleXCopperCable"



	// $ANTLR start "entryRuleXGlassFiberCable"
	// InternalXtextImpl.g:838:1: entryRuleXGlassFiberCable returns [EObject current=null] :iv_ruleXGlassFiberCable= ruleXGlassFiberCable EOF ;
	public final EObject entryRuleXGlassFiberCable() throws RecognitionException {
		EObject current = null;


		EObject iv_ruleXGlassFiberCable =null;

		try {
			// InternalXtextImpl.g:838:57: (iv_ruleXGlassFiberCable= ruleXGlassFiberCable EOF )
			// InternalXtextImpl.g:839:2: iv_ruleXGlassFiberCable= ruleXGlassFiberCable EOF
			{
			 newCompositeNode(grammarAccess.getXGlassFiberCableRule()); 
			pushFollow(FOLLOW_1);
			iv_ruleXGlassFiberCable=ruleXGlassFiberCable();
			state._fsp--;

			 current =iv_ruleXGlassFiberCable; 
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
	// $ANTLR end "entryRuleXGlassFiberCable"



	// $ANTLR start "ruleXGlassFiberCable"
	// InternalXtextImpl.g:845:1: ruleXGlassFiberCable returns [EObject current=null] : (otherlv_0= 'GlassFiberCable' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_cableAttributes_3_0= ruleCableAttributes ) ) otherlv_4= '}' ) ;
	public final EObject ruleXGlassFiberCable() throws RecognitionException {
		EObject current = null;


		Token otherlv_0=null;
		Token lv_name_1_0=null;
		Token otherlv_2=null;
		Token otherlv_4=null;
		EObject lv_cableAttributes_3_0 =null;


			enterRule();

		try {
			// InternalXtextImpl.g:851:2: ( (otherlv_0= 'GlassFiberCable' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_cableAttributes_3_0= ruleCableAttributes ) ) otherlv_4= '}' ) )
			// InternalXtextImpl.g:852:2: (otherlv_0= 'GlassFiberCable' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_cableAttributes_3_0= ruleCableAttributes ) ) otherlv_4= '}' )
			{
			// InternalXtextImpl.g:852:2: (otherlv_0= 'GlassFiberCable' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_cableAttributes_3_0= ruleCableAttributes ) ) otherlv_4= '}' )
			// InternalXtextImpl.g:853:3: otherlv_0= 'GlassFiberCable' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_cableAttributes_3_0= ruleCableAttributes ) ) otherlv_4= '}'
			{
			otherlv_0=(Token)match(input,16,FOLLOW_5); 

						newLeafNode(otherlv_0, grammarAccess.getXGlassFiberCableAccess().getGlassFiberCableKeyword_0());
					
			// InternalXtextImpl.g:857:3: ( (lv_name_1_0= RULE_ID ) )
			// InternalXtextImpl.g:858:4: (lv_name_1_0= RULE_ID )
			{
			// InternalXtextImpl.g:858:4: (lv_name_1_0= RULE_ID )
			// InternalXtextImpl.g:859:5: lv_name_1_0= RULE_ID
			{
			lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_13); 

								newLeafNode(lv_name_1_0, grammarAccess.getXGlassFiberCableAccess().getNameIDTerminalRuleCall_1_0());
							

								if (current==null) {
									current = createModelElement(grammarAccess.getXGlassFiberCableRule());
								}
								setWithLastConsumed(
									current,
									"name",
									lv_name_1_0,
									"org.eclipse.xtext.common.Terminals.ID");
							
			}

			}

			otherlv_2=(Token)match(input,30,FOLLOW_19); 

						newLeafNode(otherlv_2, grammarAccess.getXGlassFiberCableAccess().getLeftCurlyBracketKeyword_2());
					
			// InternalXtextImpl.g:879:3: ( (lv_cableAttributes_3_0= ruleCableAttributes ) )
			// InternalXtextImpl.g:880:4: (lv_cableAttributes_3_0= ruleCableAttributes )
			{
			// InternalXtextImpl.g:880:4: (lv_cableAttributes_3_0= ruleCableAttributes )
			// InternalXtextImpl.g:881:5: lv_cableAttributes_3_0= ruleCableAttributes
			{

								newCompositeNode(grammarAccess.getXGlassFiberCableAccess().getCableAttributesCableAttributesParserRuleCall_3_0());
							
			pushFollow(FOLLOW_17);
			lv_cableAttributes_3_0=ruleCableAttributes();
			state._fsp--;


								if (current==null) {
									current = createModelElementForParent(grammarAccess.getXGlassFiberCableRule());
								}
								set(
									current,
									"cableAttributes",
									lv_cableAttributes_3_0,
									"xtextImplementation.XtextImpl.CableAttributes");
								afterParserOrEnumRuleCall();
							
			}

			}

			otherlv_4=(Token)match(input,31,FOLLOW_2); 

						newLeafNode(otherlv_4, grammarAccess.getXGlassFiberCableAccess().getRightCurlyBracketKeyword_4());
					
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
	// $ANTLR end "ruleXGlassFiberCable"

	// Delegated rules



	public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
	public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x00000000000DC002L});
	public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000800L});
	public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000003000L});
	public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000008000002L});
	public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000000040L});
	public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000100000L});
	public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000200000L});
	public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000001000002L});
	public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000020400000L});
	public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000040000000L});
	public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000002000000L});
	public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000020000L});
	public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000088800000L});
	public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000080000000L});
	public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000004000000L});
	public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000010000000L});
}
