package requirementsXtext.ide.contentassist.antlr.internal;

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
import requirementsXtext.services.ReqXtextGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalReqXtextParser extends AbstractInternalContentAssistParser {
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
	public AbstractInternalContentAssistParser[] getDelegates() {
		return new AbstractInternalContentAssistParser[] {};
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

		public void setGrammarAccess(ReqXtextGrammarAccess grammarAccess) {
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



	// $ANTLR start "entryRuleXContainer"
	// InternalReqXtext.g:53:1: entryRuleXContainer : ruleXContainer EOF ;
	public final void entryRuleXContainer() throws RecognitionException {
		try {
			// InternalReqXtext.g:54:1: ( ruleXContainer EOF )
			// InternalReqXtext.g:55:1: ruleXContainer EOF
			{
			 before(grammarAccess.getXContainerRule()); 
			pushFollow(FOLLOW_1);
			ruleXContainer();
			state._fsp--;

			 after(grammarAccess.getXContainerRule()); 
			match(input,EOF,FOLLOW_2); 
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "entryRuleXContainer"



	// $ANTLR start "ruleXContainer"
	// InternalReqXtext.g:62:1: ruleXContainer : ( ( rule__XContainer__AgentsAssignment )* ) ;
	public final void ruleXContainer() throws RecognitionException {

				int stackSize = keepStackSize();
			
		try {
			// InternalReqXtext.g:66:2: ( ( ( rule__XContainer__AgentsAssignment )* ) )
			// InternalReqXtext.g:67:2: ( ( rule__XContainer__AgentsAssignment )* )
			{
			// InternalReqXtext.g:67:2: ( ( rule__XContainer__AgentsAssignment )* )
			// InternalReqXtext.g:68:3: ( rule__XContainer__AgentsAssignment )*
			{
			 before(grammarAccess.getXContainerAccess().getAgentsAssignment()); 
			// InternalReqXtext.g:69:3: ( rule__XContainer__AgentsAssignment )*
			loop1:
			while (true) {
				int alt1=2;
				int LA1_0 = input.LA(1);
				if ( ((LA1_0 >= 11 && LA1_0 <= 12)) ) {
					alt1=1;
				}

				switch (alt1) {
				case 1 :
					// InternalReqXtext.g:69:4: rule__XContainer__AgentsAssignment
					{
					pushFollow(FOLLOW_3);
					rule__XContainer__AgentsAssignment();
					state._fsp--;

					}
					break;

				default :
					break loop1;
				}
			}

			 after(grammarAccess.getXContainerAccess().getAgentsAssignment()); 
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "ruleXContainer"



	// $ANTLR start "entryRuleXAgent"
	// InternalReqXtext.g:78:1: entryRuleXAgent : ruleXAgent EOF ;
	public final void entryRuleXAgent() throws RecognitionException {
		try {
			// InternalReqXtext.g:79:1: ( ruleXAgent EOF )
			// InternalReqXtext.g:80:1: ruleXAgent EOF
			{
			 before(grammarAccess.getXAgentRule()); 
			pushFollow(FOLLOW_1);
			ruleXAgent();
			state._fsp--;

			 after(grammarAccess.getXAgentRule()); 
			match(input,EOF,FOLLOW_2); 
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "entryRuleXAgent"



	// $ANTLR start "ruleXAgent"
	// InternalReqXtext.g:87:1: ruleXAgent : ( ( rule__XAgent__Alternatives ) ) ;
	public final void ruleXAgent() throws RecognitionException {

				int stackSize = keepStackSize();
			
		try {
			// InternalReqXtext.g:91:2: ( ( ( rule__XAgent__Alternatives ) ) )
			// InternalReqXtext.g:92:2: ( ( rule__XAgent__Alternatives ) )
			{
			// InternalReqXtext.g:92:2: ( ( rule__XAgent__Alternatives ) )
			// InternalReqXtext.g:93:3: ( rule__XAgent__Alternatives )
			{
			 before(grammarAccess.getXAgentAccess().getAlternatives()); 
			// InternalReqXtext.g:94:3: ( rule__XAgent__Alternatives )
			// InternalReqXtext.g:94:4: rule__XAgent__Alternatives
			{
			pushFollow(FOLLOW_2);
			rule__XAgent__Alternatives();
			state._fsp--;

			}

			 after(grammarAccess.getXAgentAccess().getAlternatives()); 
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "ruleXAgent"



	// $ANTLR start "entryRuleEBigInteger"
	// InternalReqXtext.g:103:1: entryRuleEBigInteger : ruleEBigInteger EOF ;
	public final void entryRuleEBigInteger() throws RecognitionException {
		try {
			// InternalReqXtext.g:104:1: ( ruleEBigInteger EOF )
			// InternalReqXtext.g:105:1: ruleEBigInteger EOF
			{
			 before(grammarAccess.getEBigIntegerRule()); 
			pushFollow(FOLLOW_1);
			ruleEBigInteger();
			state._fsp--;

			 after(grammarAccess.getEBigIntegerRule()); 
			match(input,EOF,FOLLOW_2); 
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "entryRuleEBigInteger"



	// $ANTLR start "ruleEBigInteger"
	// InternalReqXtext.g:112:1: ruleEBigInteger : ( RULE_INT ) ;
	public final void ruleEBigInteger() throws RecognitionException {

				int stackSize = keepStackSize();
			
		try {
			// InternalReqXtext.g:116:2: ( ( RULE_INT ) )
			// InternalReqXtext.g:117:2: ( RULE_INT )
			{
			// InternalReqXtext.g:117:2: ( RULE_INT )
			// InternalReqXtext.g:118:3: RULE_INT
			{
			 before(grammarAccess.getEBigIntegerAccess().getINTTerminalRuleCall()); 
			match(input,RULE_INT,FOLLOW_2); 
			 after(grammarAccess.getEBigIntegerAccess().getINTTerminalRuleCall()); 
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "ruleEBigInteger"



	// $ANTLR start "entryRuleXProvider"
	// InternalReqXtext.g:128:1: entryRuleXProvider : ruleXProvider EOF ;
	public final void entryRuleXProvider() throws RecognitionException {
		try {
			// InternalReqXtext.g:129:1: ( ruleXProvider EOF )
			// InternalReqXtext.g:130:1: ruleXProvider EOF
			{
			 before(grammarAccess.getXProviderRule()); 
			pushFollow(FOLLOW_1);
			ruleXProvider();
			state._fsp--;

			 after(grammarAccess.getXProviderRule()); 
			match(input,EOF,FOLLOW_2); 
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "entryRuleXProvider"



	// $ANTLR start "ruleXProvider"
	// InternalReqXtext.g:137:1: ruleXProvider : ( ( rule__XProvider__Group__0 ) ) ;
	public final void ruleXProvider() throws RecognitionException {

				int stackSize = keepStackSize();
			
		try {
			// InternalReqXtext.g:141:2: ( ( ( rule__XProvider__Group__0 ) ) )
			// InternalReqXtext.g:142:2: ( ( rule__XProvider__Group__0 ) )
			{
			// InternalReqXtext.g:142:2: ( ( rule__XProvider__Group__0 ) )
			// InternalReqXtext.g:143:3: ( rule__XProvider__Group__0 )
			{
			 before(grammarAccess.getXProviderAccess().getGroup()); 
			// InternalReqXtext.g:144:3: ( rule__XProvider__Group__0 )
			// InternalReqXtext.g:144:4: rule__XProvider__Group__0
			{
			pushFollow(FOLLOW_2);
			rule__XProvider__Group__0();
			state._fsp--;

			}

			 after(grammarAccess.getXProviderAccess().getGroup()); 
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "ruleXProvider"



	// $ANTLR start "entryRuleXConsumer"
	// InternalReqXtext.g:153:1: entryRuleXConsumer : ruleXConsumer EOF ;
	public final void entryRuleXConsumer() throws RecognitionException {
		try {
			// InternalReqXtext.g:154:1: ( ruleXConsumer EOF )
			// InternalReqXtext.g:155:1: ruleXConsumer EOF
			{
			 before(grammarAccess.getXConsumerRule()); 
			pushFollow(FOLLOW_1);
			ruleXConsumer();
			state._fsp--;

			 after(grammarAccess.getXConsumerRule()); 
			match(input,EOF,FOLLOW_2); 
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "entryRuleXConsumer"



	// $ANTLR start "ruleXConsumer"
	// InternalReqXtext.g:162:1: ruleXConsumer : ( ( rule__XConsumer__Group__0 ) ) ;
	public final void ruleXConsumer() throws RecognitionException {

				int stackSize = keepStackSize();
			
		try {
			// InternalReqXtext.g:166:2: ( ( ( rule__XConsumer__Group__0 ) ) )
			// InternalReqXtext.g:167:2: ( ( rule__XConsumer__Group__0 ) )
			{
			// InternalReqXtext.g:167:2: ( ( rule__XConsumer__Group__0 ) )
			// InternalReqXtext.g:168:3: ( rule__XConsumer__Group__0 )
			{
			 before(grammarAccess.getXConsumerAccess().getGroup()); 
			// InternalReqXtext.g:169:3: ( rule__XConsumer__Group__0 )
			// InternalReqXtext.g:169:4: rule__XConsumer__Group__0
			{
			pushFollow(FOLLOW_2);
			rule__XConsumer__Group__0();
			state._fsp--;

			}

			 after(grammarAccess.getXConsumerAccess().getGroup()); 
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "ruleXConsumer"



	// $ANTLR start "rule__XAgent__Alternatives"
	// InternalReqXtext.g:177:1: rule__XAgent__Alternatives : ( ( ruleXProvider ) | ( ruleXConsumer ) );
	public final void rule__XAgent__Alternatives() throws RecognitionException {

				int stackSize = keepStackSize();
			
		try {
			// InternalReqXtext.g:181:2: ( ( ruleXProvider ) | ( ruleXConsumer ) )
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
					// InternalReqXtext.g:182:2: ( ruleXProvider )
					{
					// InternalReqXtext.g:182:2: ( ruleXProvider )
					// InternalReqXtext.g:183:3: ruleXProvider
					{
					 before(grammarAccess.getXAgentAccess().getXProviderParserRuleCall_0()); 
					pushFollow(FOLLOW_2);
					ruleXProvider();
					state._fsp--;

					 after(grammarAccess.getXAgentAccess().getXProviderParserRuleCall_0()); 
					}

					}
					break;
				case 2 :
					// InternalReqXtext.g:188:2: ( ruleXConsumer )
					{
					// InternalReqXtext.g:188:2: ( ruleXConsumer )
					// InternalReqXtext.g:189:3: ruleXConsumer
					{
					 before(grammarAccess.getXAgentAccess().getXConsumerParserRuleCall_1()); 
					pushFollow(FOLLOW_2);
					ruleXConsumer();
					state._fsp--;

					 after(grammarAccess.getXAgentAccess().getXConsumerParserRuleCall_1()); 
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
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__XAgent__Alternatives"



	// $ANTLR start "rule__XProvider__Group__0"
	// InternalReqXtext.g:198:1: rule__XProvider__Group__0 : rule__XProvider__Group__0__Impl rule__XProvider__Group__1 ;
	public final void rule__XProvider__Group__0() throws RecognitionException {

				int stackSize = keepStackSize();
			
		try {
			// InternalReqXtext.g:202:2: ( rule__XProvider__Group__0__Impl rule__XProvider__Group__1 )
			// InternalReqXtext.g:203:2: rule__XProvider__Group__0__Impl rule__XProvider__Group__1
			{
			pushFollow(FOLLOW_4);
			rule__XProvider__Group__0__Impl();
			state._fsp--;

			pushFollow(FOLLOW_2);
			rule__XProvider__Group__1();
			state._fsp--;

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__XProvider__Group__0"



	// $ANTLR start "rule__XProvider__Group__0__Impl"
	// InternalReqXtext.g:210:1: rule__XProvider__Group__0__Impl : ( 'Provider' ) ;
	public final void rule__XProvider__Group__0__Impl() throws RecognitionException {

				int stackSize = keepStackSize();
			
		try {
			// InternalReqXtext.g:214:2: ( ( 'Provider' ) )
			// InternalReqXtext.g:215:2: ( 'Provider' )
			{
			// InternalReqXtext.g:215:2: ( 'Provider' )
			// InternalReqXtext.g:216:2: 'Provider'
			{
			 before(grammarAccess.getXProviderAccess().getProviderKeyword_0()); 
			match(input,12,FOLLOW_2); 
			 after(grammarAccess.getXProviderAccess().getProviderKeyword_0()); 
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__XProvider__Group__0__Impl"



	// $ANTLR start "rule__XProvider__Group__1"
	// InternalReqXtext.g:225:1: rule__XProvider__Group__1 : rule__XProvider__Group__1__Impl rule__XProvider__Group__2 ;
	public final void rule__XProvider__Group__1() throws RecognitionException {

				int stackSize = keepStackSize();
			
		try {
			// InternalReqXtext.g:229:2: ( rule__XProvider__Group__1__Impl rule__XProvider__Group__2 )
			// InternalReqXtext.g:230:2: rule__XProvider__Group__1__Impl rule__XProvider__Group__2
			{
			pushFollow(FOLLOW_5);
			rule__XProvider__Group__1__Impl();
			state._fsp--;

			pushFollow(FOLLOW_2);
			rule__XProvider__Group__2();
			state._fsp--;

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__XProvider__Group__1"



	// $ANTLR start "rule__XProvider__Group__1__Impl"
	// InternalReqXtext.g:237:1: rule__XProvider__Group__1__Impl : ( ( rule__XProvider__NameAssignment_1 ) ) ;
	public final void rule__XProvider__Group__1__Impl() throws RecognitionException {

				int stackSize = keepStackSize();
			
		try {
			// InternalReqXtext.g:241:2: ( ( ( rule__XProvider__NameAssignment_1 ) ) )
			// InternalReqXtext.g:242:2: ( ( rule__XProvider__NameAssignment_1 ) )
			{
			// InternalReqXtext.g:242:2: ( ( rule__XProvider__NameAssignment_1 ) )
			// InternalReqXtext.g:243:2: ( rule__XProvider__NameAssignment_1 )
			{
			 before(grammarAccess.getXProviderAccess().getNameAssignment_1()); 
			// InternalReqXtext.g:244:2: ( rule__XProvider__NameAssignment_1 )
			// InternalReqXtext.g:244:3: rule__XProvider__NameAssignment_1
			{
			pushFollow(FOLLOW_2);
			rule__XProvider__NameAssignment_1();
			state._fsp--;

			}

			 after(grammarAccess.getXProviderAccess().getNameAssignment_1()); 
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__XProvider__Group__1__Impl"



	// $ANTLR start "rule__XProvider__Group__2"
	// InternalReqXtext.g:252:1: rule__XProvider__Group__2 : rule__XProvider__Group__2__Impl rule__XProvider__Group__3 ;
	public final void rule__XProvider__Group__2() throws RecognitionException {

				int stackSize = keepStackSize();
			
		try {
			// InternalReqXtext.g:256:2: ( rule__XProvider__Group__2__Impl rule__XProvider__Group__3 )
			// InternalReqXtext.g:257:2: rule__XProvider__Group__2__Impl rule__XProvider__Group__3
			{
			pushFollow(FOLLOW_6);
			rule__XProvider__Group__2__Impl();
			state._fsp--;

			pushFollow(FOLLOW_2);
			rule__XProvider__Group__3();
			state._fsp--;

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__XProvider__Group__2"



	// $ANTLR start "rule__XProvider__Group__2__Impl"
	// InternalReqXtext.g:264:1: rule__XProvider__Group__2__Impl : ( '{' ) ;
	public final void rule__XProvider__Group__2__Impl() throws RecognitionException {

				int stackSize = keepStackSize();
			
		try {
			// InternalReqXtext.g:268:2: ( ( '{' ) )
			// InternalReqXtext.g:269:2: ( '{' )
			{
			// InternalReqXtext.g:269:2: ( '{' )
			// InternalReqXtext.g:270:2: '{'
			{
			 before(grammarAccess.getXProviderAccess().getLeftCurlyBracketKeyword_2()); 
			match(input,14,FOLLOW_2); 
			 after(grammarAccess.getXProviderAccess().getLeftCurlyBracketKeyword_2()); 
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__XProvider__Group__2__Impl"



	// $ANTLR start "rule__XProvider__Group__3"
	// InternalReqXtext.g:279:1: rule__XProvider__Group__3 : rule__XProvider__Group__3__Impl rule__XProvider__Group__4 ;
	public final void rule__XProvider__Group__3() throws RecognitionException {

				int stackSize = keepStackSize();
			
		try {
			// InternalReqXtext.g:283:2: ( rule__XProvider__Group__3__Impl rule__XProvider__Group__4 )
			// InternalReqXtext.g:284:2: rule__XProvider__Group__3__Impl rule__XProvider__Group__4
			{
			pushFollow(FOLLOW_7);
			rule__XProvider__Group__3__Impl();
			state._fsp--;

			pushFollow(FOLLOW_2);
			rule__XProvider__Group__4();
			state._fsp--;

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__XProvider__Group__3"



	// $ANTLR start "rule__XProvider__Group__3__Impl"
	// InternalReqXtext.g:291:1: rule__XProvider__Group__3__Impl : ( 'speed' ) ;
	public final void rule__XProvider__Group__3__Impl() throws RecognitionException {

				int stackSize = keepStackSize();
			
		try {
			// InternalReqXtext.g:295:2: ( ( 'speed' ) )
			// InternalReqXtext.g:296:2: ( 'speed' )
			{
			// InternalReqXtext.g:296:2: ( 'speed' )
			// InternalReqXtext.g:297:2: 'speed'
			{
			 before(grammarAccess.getXProviderAccess().getSpeedKeyword_3()); 
			match(input,13,FOLLOW_2); 
			 after(grammarAccess.getXProviderAccess().getSpeedKeyword_3()); 
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__XProvider__Group__3__Impl"



	// $ANTLR start "rule__XProvider__Group__4"
	// InternalReqXtext.g:306:1: rule__XProvider__Group__4 : rule__XProvider__Group__4__Impl rule__XProvider__Group__5 ;
	public final void rule__XProvider__Group__4() throws RecognitionException {

				int stackSize = keepStackSize();
			
		try {
			// InternalReqXtext.g:310:2: ( rule__XProvider__Group__4__Impl rule__XProvider__Group__5 )
			// InternalReqXtext.g:311:2: rule__XProvider__Group__4__Impl rule__XProvider__Group__5
			{
			pushFollow(FOLLOW_8);
			rule__XProvider__Group__4__Impl();
			state._fsp--;

			pushFollow(FOLLOW_2);
			rule__XProvider__Group__5();
			state._fsp--;

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__XProvider__Group__4"



	// $ANTLR start "rule__XProvider__Group__4__Impl"
	// InternalReqXtext.g:318:1: rule__XProvider__Group__4__Impl : ( ( rule__XProvider__SpeedAssignment_4 ) ) ;
	public final void rule__XProvider__Group__4__Impl() throws RecognitionException {

				int stackSize = keepStackSize();
			
		try {
			// InternalReqXtext.g:322:2: ( ( ( rule__XProvider__SpeedAssignment_4 ) ) )
			// InternalReqXtext.g:323:2: ( ( rule__XProvider__SpeedAssignment_4 ) )
			{
			// InternalReqXtext.g:323:2: ( ( rule__XProvider__SpeedAssignment_4 ) )
			// InternalReqXtext.g:324:2: ( rule__XProvider__SpeedAssignment_4 )
			{
			 before(grammarAccess.getXProviderAccess().getSpeedAssignment_4()); 
			// InternalReqXtext.g:325:2: ( rule__XProvider__SpeedAssignment_4 )
			// InternalReqXtext.g:325:3: rule__XProvider__SpeedAssignment_4
			{
			pushFollow(FOLLOW_2);
			rule__XProvider__SpeedAssignment_4();
			state._fsp--;

			}

			 after(grammarAccess.getXProviderAccess().getSpeedAssignment_4()); 
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__XProvider__Group__4__Impl"



	// $ANTLR start "rule__XProvider__Group__5"
	// InternalReqXtext.g:333:1: rule__XProvider__Group__5 : rule__XProvider__Group__5__Impl ;
	public final void rule__XProvider__Group__5() throws RecognitionException {

				int stackSize = keepStackSize();
			
		try {
			// InternalReqXtext.g:337:2: ( rule__XProvider__Group__5__Impl )
			// InternalReqXtext.g:338:2: rule__XProvider__Group__5__Impl
			{
			pushFollow(FOLLOW_2);
			rule__XProvider__Group__5__Impl();
			state._fsp--;

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__XProvider__Group__5"



	// $ANTLR start "rule__XProvider__Group__5__Impl"
	// InternalReqXtext.g:344:1: rule__XProvider__Group__5__Impl : ( '}' ) ;
	public final void rule__XProvider__Group__5__Impl() throws RecognitionException {

				int stackSize = keepStackSize();
			
		try {
			// InternalReqXtext.g:348:2: ( ( '}' ) )
			// InternalReqXtext.g:349:2: ( '}' )
			{
			// InternalReqXtext.g:349:2: ( '}' )
			// InternalReqXtext.g:350:2: '}'
			{
			 before(grammarAccess.getXProviderAccess().getRightCurlyBracketKeyword_5()); 
			match(input,15,FOLLOW_2); 
			 after(grammarAccess.getXProviderAccess().getRightCurlyBracketKeyword_5()); 
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__XProvider__Group__5__Impl"



	// $ANTLR start "rule__XConsumer__Group__0"
	// InternalReqXtext.g:360:1: rule__XConsumer__Group__0 : rule__XConsumer__Group__0__Impl rule__XConsumer__Group__1 ;
	public final void rule__XConsumer__Group__0() throws RecognitionException {

				int stackSize = keepStackSize();
			
		try {
			// InternalReqXtext.g:364:2: ( rule__XConsumer__Group__0__Impl rule__XConsumer__Group__1 )
			// InternalReqXtext.g:365:2: rule__XConsumer__Group__0__Impl rule__XConsumer__Group__1
			{
			pushFollow(FOLLOW_4);
			rule__XConsumer__Group__0__Impl();
			state._fsp--;

			pushFollow(FOLLOW_2);
			rule__XConsumer__Group__1();
			state._fsp--;

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__XConsumer__Group__0"



	// $ANTLR start "rule__XConsumer__Group__0__Impl"
	// InternalReqXtext.g:372:1: rule__XConsumer__Group__0__Impl : ( 'Consumer' ) ;
	public final void rule__XConsumer__Group__0__Impl() throws RecognitionException {

				int stackSize = keepStackSize();
			
		try {
			// InternalReqXtext.g:376:2: ( ( 'Consumer' ) )
			// InternalReqXtext.g:377:2: ( 'Consumer' )
			{
			// InternalReqXtext.g:377:2: ( 'Consumer' )
			// InternalReqXtext.g:378:2: 'Consumer'
			{
			 before(grammarAccess.getXConsumerAccess().getConsumerKeyword_0()); 
			match(input,11,FOLLOW_2); 
			 after(grammarAccess.getXConsumerAccess().getConsumerKeyword_0()); 
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__XConsumer__Group__0__Impl"



	// $ANTLR start "rule__XConsumer__Group__1"
	// InternalReqXtext.g:387:1: rule__XConsumer__Group__1 : rule__XConsumer__Group__1__Impl rule__XConsumer__Group__2 ;
	public final void rule__XConsumer__Group__1() throws RecognitionException {

				int stackSize = keepStackSize();
			
		try {
			// InternalReqXtext.g:391:2: ( rule__XConsumer__Group__1__Impl rule__XConsumer__Group__2 )
			// InternalReqXtext.g:392:2: rule__XConsumer__Group__1__Impl rule__XConsumer__Group__2
			{
			pushFollow(FOLLOW_5);
			rule__XConsumer__Group__1__Impl();
			state._fsp--;

			pushFollow(FOLLOW_2);
			rule__XConsumer__Group__2();
			state._fsp--;

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__XConsumer__Group__1"



	// $ANTLR start "rule__XConsumer__Group__1__Impl"
	// InternalReqXtext.g:399:1: rule__XConsumer__Group__1__Impl : ( ( rule__XConsumer__NameAssignment_1 ) ) ;
	public final void rule__XConsumer__Group__1__Impl() throws RecognitionException {

				int stackSize = keepStackSize();
			
		try {
			// InternalReqXtext.g:403:2: ( ( ( rule__XConsumer__NameAssignment_1 ) ) )
			// InternalReqXtext.g:404:2: ( ( rule__XConsumer__NameAssignment_1 ) )
			{
			// InternalReqXtext.g:404:2: ( ( rule__XConsumer__NameAssignment_1 ) )
			// InternalReqXtext.g:405:2: ( rule__XConsumer__NameAssignment_1 )
			{
			 before(grammarAccess.getXConsumerAccess().getNameAssignment_1()); 
			// InternalReqXtext.g:406:2: ( rule__XConsumer__NameAssignment_1 )
			// InternalReqXtext.g:406:3: rule__XConsumer__NameAssignment_1
			{
			pushFollow(FOLLOW_2);
			rule__XConsumer__NameAssignment_1();
			state._fsp--;

			}

			 after(grammarAccess.getXConsumerAccess().getNameAssignment_1()); 
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__XConsumer__Group__1__Impl"



	// $ANTLR start "rule__XConsumer__Group__2"
	// InternalReqXtext.g:414:1: rule__XConsumer__Group__2 : rule__XConsumer__Group__2__Impl rule__XConsumer__Group__3 ;
	public final void rule__XConsumer__Group__2() throws RecognitionException {

				int stackSize = keepStackSize();
			
		try {
			// InternalReqXtext.g:418:2: ( rule__XConsumer__Group__2__Impl rule__XConsumer__Group__3 )
			// InternalReqXtext.g:419:2: rule__XConsumer__Group__2__Impl rule__XConsumer__Group__3
			{
			pushFollow(FOLLOW_6);
			rule__XConsumer__Group__2__Impl();
			state._fsp--;

			pushFollow(FOLLOW_2);
			rule__XConsumer__Group__3();
			state._fsp--;

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__XConsumer__Group__2"



	// $ANTLR start "rule__XConsumer__Group__2__Impl"
	// InternalReqXtext.g:426:1: rule__XConsumer__Group__2__Impl : ( '{' ) ;
	public final void rule__XConsumer__Group__2__Impl() throws RecognitionException {

				int stackSize = keepStackSize();
			
		try {
			// InternalReqXtext.g:430:2: ( ( '{' ) )
			// InternalReqXtext.g:431:2: ( '{' )
			{
			// InternalReqXtext.g:431:2: ( '{' )
			// InternalReqXtext.g:432:2: '{'
			{
			 before(grammarAccess.getXConsumerAccess().getLeftCurlyBracketKeyword_2()); 
			match(input,14,FOLLOW_2); 
			 after(grammarAccess.getXConsumerAccess().getLeftCurlyBracketKeyword_2()); 
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__XConsumer__Group__2__Impl"



	// $ANTLR start "rule__XConsumer__Group__3"
	// InternalReqXtext.g:441:1: rule__XConsumer__Group__3 : rule__XConsumer__Group__3__Impl rule__XConsumer__Group__4 ;
	public final void rule__XConsumer__Group__3() throws RecognitionException {

				int stackSize = keepStackSize();
			
		try {
			// InternalReqXtext.g:445:2: ( rule__XConsumer__Group__3__Impl rule__XConsumer__Group__4 )
			// InternalReqXtext.g:446:2: rule__XConsumer__Group__3__Impl rule__XConsumer__Group__4
			{
			pushFollow(FOLLOW_7);
			rule__XConsumer__Group__3__Impl();
			state._fsp--;

			pushFollow(FOLLOW_2);
			rule__XConsumer__Group__4();
			state._fsp--;

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__XConsumer__Group__3"



	// $ANTLR start "rule__XConsumer__Group__3__Impl"
	// InternalReqXtext.g:453:1: rule__XConsumer__Group__3__Impl : ( 'speed' ) ;
	public final void rule__XConsumer__Group__3__Impl() throws RecognitionException {

				int stackSize = keepStackSize();
			
		try {
			// InternalReqXtext.g:457:2: ( ( 'speed' ) )
			// InternalReqXtext.g:458:2: ( 'speed' )
			{
			// InternalReqXtext.g:458:2: ( 'speed' )
			// InternalReqXtext.g:459:2: 'speed'
			{
			 before(grammarAccess.getXConsumerAccess().getSpeedKeyword_3()); 
			match(input,13,FOLLOW_2); 
			 after(grammarAccess.getXConsumerAccess().getSpeedKeyword_3()); 
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__XConsumer__Group__3__Impl"



	// $ANTLR start "rule__XConsumer__Group__4"
	// InternalReqXtext.g:468:1: rule__XConsumer__Group__4 : rule__XConsumer__Group__4__Impl rule__XConsumer__Group__5 ;
	public final void rule__XConsumer__Group__4() throws RecognitionException {

				int stackSize = keepStackSize();
			
		try {
			// InternalReqXtext.g:472:2: ( rule__XConsumer__Group__4__Impl rule__XConsumer__Group__5 )
			// InternalReqXtext.g:473:2: rule__XConsumer__Group__4__Impl rule__XConsumer__Group__5
			{
			pushFollow(FOLLOW_8);
			rule__XConsumer__Group__4__Impl();
			state._fsp--;

			pushFollow(FOLLOW_2);
			rule__XConsumer__Group__5();
			state._fsp--;

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__XConsumer__Group__4"



	// $ANTLR start "rule__XConsumer__Group__4__Impl"
	// InternalReqXtext.g:480:1: rule__XConsumer__Group__4__Impl : ( ( rule__XConsumer__SpeedAssignment_4 ) ) ;
	public final void rule__XConsumer__Group__4__Impl() throws RecognitionException {

				int stackSize = keepStackSize();
			
		try {
			// InternalReqXtext.g:484:2: ( ( ( rule__XConsumer__SpeedAssignment_4 ) ) )
			// InternalReqXtext.g:485:2: ( ( rule__XConsumer__SpeedAssignment_4 ) )
			{
			// InternalReqXtext.g:485:2: ( ( rule__XConsumer__SpeedAssignment_4 ) )
			// InternalReqXtext.g:486:2: ( rule__XConsumer__SpeedAssignment_4 )
			{
			 before(grammarAccess.getXConsumerAccess().getSpeedAssignment_4()); 
			// InternalReqXtext.g:487:2: ( rule__XConsumer__SpeedAssignment_4 )
			// InternalReqXtext.g:487:3: rule__XConsumer__SpeedAssignment_4
			{
			pushFollow(FOLLOW_2);
			rule__XConsumer__SpeedAssignment_4();
			state._fsp--;

			}

			 after(grammarAccess.getXConsumerAccess().getSpeedAssignment_4()); 
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__XConsumer__Group__4__Impl"



	// $ANTLR start "rule__XConsumer__Group__5"
	// InternalReqXtext.g:495:1: rule__XConsumer__Group__5 : rule__XConsumer__Group__5__Impl ;
	public final void rule__XConsumer__Group__5() throws RecognitionException {

				int stackSize = keepStackSize();
			
		try {
			// InternalReqXtext.g:499:2: ( rule__XConsumer__Group__5__Impl )
			// InternalReqXtext.g:500:2: rule__XConsumer__Group__5__Impl
			{
			pushFollow(FOLLOW_2);
			rule__XConsumer__Group__5__Impl();
			state._fsp--;

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__XConsumer__Group__5"



	// $ANTLR start "rule__XConsumer__Group__5__Impl"
	// InternalReqXtext.g:506:1: rule__XConsumer__Group__5__Impl : ( '}' ) ;
	public final void rule__XConsumer__Group__5__Impl() throws RecognitionException {

				int stackSize = keepStackSize();
			
		try {
			// InternalReqXtext.g:510:2: ( ( '}' ) )
			// InternalReqXtext.g:511:2: ( '}' )
			{
			// InternalReqXtext.g:511:2: ( '}' )
			// InternalReqXtext.g:512:2: '}'
			{
			 before(grammarAccess.getXConsumerAccess().getRightCurlyBracketKeyword_5()); 
			match(input,15,FOLLOW_2); 
			 after(grammarAccess.getXConsumerAccess().getRightCurlyBracketKeyword_5()); 
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__XConsumer__Group__5__Impl"



	// $ANTLR start "rule__XContainer__AgentsAssignment"
	// InternalReqXtext.g:522:1: rule__XContainer__AgentsAssignment : ( ruleXAgent ) ;
	public final void rule__XContainer__AgentsAssignment() throws RecognitionException {

				int stackSize = keepStackSize();
			
		try {
			// InternalReqXtext.g:526:2: ( ( ruleXAgent ) )
			// InternalReqXtext.g:527:2: ( ruleXAgent )
			{
			// InternalReqXtext.g:527:2: ( ruleXAgent )
			// InternalReqXtext.g:528:3: ruleXAgent
			{
			 before(grammarAccess.getXContainerAccess().getAgentsXAgentParserRuleCall_0()); 
			pushFollow(FOLLOW_2);
			ruleXAgent();
			state._fsp--;

			 after(grammarAccess.getXContainerAccess().getAgentsXAgentParserRuleCall_0()); 
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__XContainer__AgentsAssignment"



	// $ANTLR start "rule__XProvider__NameAssignment_1"
	// InternalReqXtext.g:537:1: rule__XProvider__NameAssignment_1 : ( RULE_ID ) ;
	public final void rule__XProvider__NameAssignment_1() throws RecognitionException {

				int stackSize = keepStackSize();
			
		try {
			// InternalReqXtext.g:541:2: ( ( RULE_ID ) )
			// InternalReqXtext.g:542:2: ( RULE_ID )
			{
			// InternalReqXtext.g:542:2: ( RULE_ID )
			// InternalReqXtext.g:543:3: RULE_ID
			{
			 before(grammarAccess.getXProviderAccess().getNameIDTerminalRuleCall_1_0()); 
			match(input,RULE_ID,FOLLOW_2); 
			 after(grammarAccess.getXProviderAccess().getNameIDTerminalRuleCall_1_0()); 
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__XProvider__NameAssignment_1"



	// $ANTLR start "rule__XProvider__SpeedAssignment_4"
	// InternalReqXtext.g:552:1: rule__XProvider__SpeedAssignment_4 : ( ruleEBigInteger ) ;
	public final void rule__XProvider__SpeedAssignment_4() throws RecognitionException {

				int stackSize = keepStackSize();
			
		try {
			// InternalReqXtext.g:556:2: ( ( ruleEBigInteger ) )
			// InternalReqXtext.g:557:2: ( ruleEBigInteger )
			{
			// InternalReqXtext.g:557:2: ( ruleEBigInteger )
			// InternalReqXtext.g:558:3: ruleEBigInteger
			{
			 before(grammarAccess.getXProviderAccess().getSpeedEBigIntegerParserRuleCall_4_0()); 
			pushFollow(FOLLOW_2);
			ruleEBigInteger();
			state._fsp--;

			 after(grammarAccess.getXProviderAccess().getSpeedEBigIntegerParserRuleCall_4_0()); 
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__XProvider__SpeedAssignment_4"



	// $ANTLR start "rule__XConsumer__NameAssignment_1"
	// InternalReqXtext.g:567:1: rule__XConsumer__NameAssignment_1 : ( RULE_ID ) ;
	public final void rule__XConsumer__NameAssignment_1() throws RecognitionException {

				int stackSize = keepStackSize();
			
		try {
			// InternalReqXtext.g:571:2: ( ( RULE_ID ) )
			// InternalReqXtext.g:572:2: ( RULE_ID )
			{
			// InternalReqXtext.g:572:2: ( RULE_ID )
			// InternalReqXtext.g:573:3: RULE_ID
			{
			 before(grammarAccess.getXConsumerAccess().getNameIDTerminalRuleCall_1_0()); 
			match(input,RULE_ID,FOLLOW_2); 
			 after(grammarAccess.getXConsumerAccess().getNameIDTerminalRuleCall_1_0()); 
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__XConsumer__NameAssignment_1"



	// $ANTLR start "rule__XConsumer__SpeedAssignment_4"
	// InternalReqXtext.g:582:1: rule__XConsumer__SpeedAssignment_4 : ( ruleEBigInteger ) ;
	public final void rule__XConsumer__SpeedAssignment_4() throws RecognitionException {

				int stackSize = keepStackSize();
			
		try {
			// InternalReqXtext.g:586:2: ( ( ruleEBigInteger ) )
			// InternalReqXtext.g:587:2: ( ruleEBigInteger )
			{
			// InternalReqXtext.g:587:2: ( ruleEBigInteger )
			// InternalReqXtext.g:588:3: ruleEBigInteger
			{
			 before(grammarAccess.getXConsumerAccess().getSpeedEBigIntegerParserRuleCall_4_0()); 
			pushFollow(FOLLOW_2);
			ruleEBigInteger();
			state._fsp--;

			 after(grammarAccess.getXConsumerAccess().getSpeedEBigIntegerParserRuleCall_4_0()); 
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__XConsumer__SpeedAssignment_4"

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
