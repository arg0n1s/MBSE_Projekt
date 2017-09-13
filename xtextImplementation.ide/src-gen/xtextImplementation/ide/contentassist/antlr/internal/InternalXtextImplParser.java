package xtextImplementation.ide.contentassist.antlr.internal;

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
import xtextImplementation.services.XtextImplGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalXtextImplParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_INT", "RULE_ID", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'true'", "'false'", "'incoming'", "'('", "')'", "','", "'outgoing'", "'speed'", "'endPoint1'", "'endPoint2'", "'isDuplex'", "'Server'", "'{'", "'maxSlots'", "'MTBF'", "'}'", "'Computer'", "'Router'", "'maxSpeed'", "'CopperCable'", "'GlassFiberCable'"
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
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int RULE_ID=5;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=4;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;

    // delegates
    // delegators


        public InternalXtextImplParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalXtextImplParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalXtextImplParser.tokenNames; }
    public String getGrammarFileName() { return "InternalXtextImpl.g"; }


    	private XtextImplGrammarAccess grammarAccess;

    	public void setGrammarAccess(XtextImplGrammarAccess grammarAccess) {
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
    // InternalXtextImpl.g:53:1: entryRuleXContainer : ruleXContainer EOF ;
    public final void entryRuleXContainer() throws RecognitionException {
        try {
            // InternalXtextImpl.g:54:1: ( ruleXContainer EOF )
            // InternalXtextImpl.g:55:1: ruleXContainer EOF
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
        }
        return ;
    }
    // $ANTLR end "entryRuleXContainer"


    // $ANTLR start "ruleXContainer"
    // InternalXtextImpl.g:62:1: ruleXContainer : ( ( rule__XContainer__ElementsAssignment )* ) ;
    public final void ruleXContainer() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXtextImpl.g:66:2: ( ( ( rule__XContainer__ElementsAssignment )* ) )
            // InternalXtextImpl.g:67:2: ( ( rule__XContainer__ElementsAssignment )* )
            {
            // InternalXtextImpl.g:67:2: ( ( rule__XContainer__ElementsAssignment )* )
            // InternalXtextImpl.g:68:3: ( rule__XContainer__ElementsAssignment )*
            {
             before(grammarAccess.getXContainerAccess().getElementsAssignment()); 
            // InternalXtextImpl.g:69:3: ( rule__XContainer__ElementsAssignment )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==22||(LA1_0>=27 && LA1_0<=28)||(LA1_0>=30 && LA1_0<=31)) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalXtextImpl.g:69:4: rule__XContainer__ElementsAssignment
            	    {
            	    pushFollow(FOLLOW_3);
            	    rule__XContainer__ElementsAssignment();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

             after(grammarAccess.getXContainerAccess().getElementsAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleXContainer"


    // $ANTLR start "entryRuleNetworkElement"
    // InternalXtextImpl.g:78:1: entryRuleNetworkElement : ruleNetworkElement EOF ;
    public final void entryRuleNetworkElement() throws RecognitionException {
        try {
            // InternalXtextImpl.g:79:1: ( ruleNetworkElement EOF )
            // InternalXtextImpl.g:80:1: ruleNetworkElement EOF
            {
             before(grammarAccess.getNetworkElementRule()); 
            pushFollow(FOLLOW_1);
            ruleNetworkElement();

            state._fsp--;

             after(grammarAccess.getNetworkElementRule()); 
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
    // $ANTLR end "entryRuleNetworkElement"


    // $ANTLR start "ruleNetworkElement"
    // InternalXtextImpl.g:87:1: ruleNetworkElement : ( ( rule__NetworkElement__Alternatives ) ) ;
    public final void ruleNetworkElement() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXtextImpl.g:91:2: ( ( ( rule__NetworkElement__Alternatives ) ) )
            // InternalXtextImpl.g:92:2: ( ( rule__NetworkElement__Alternatives ) )
            {
            // InternalXtextImpl.g:92:2: ( ( rule__NetworkElement__Alternatives ) )
            // InternalXtextImpl.g:93:3: ( rule__NetworkElement__Alternatives )
            {
             before(grammarAccess.getNetworkElementAccess().getAlternatives()); 
            // InternalXtextImpl.g:94:3: ( rule__NetworkElement__Alternatives )
            // InternalXtextImpl.g:94:4: rule__NetworkElement__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__NetworkElement__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getNetworkElementAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleNetworkElement"


    // $ANTLR start "entryRuleXDevice"
    // InternalXtextImpl.g:103:1: entryRuleXDevice : ruleXDevice EOF ;
    public final void entryRuleXDevice() throws RecognitionException {
        try {
            // InternalXtextImpl.g:104:1: ( ruleXDevice EOF )
            // InternalXtextImpl.g:105:1: ruleXDevice EOF
            {
             before(grammarAccess.getXDeviceRule()); 
            pushFollow(FOLLOW_1);
            ruleXDevice();

            state._fsp--;

             after(grammarAccess.getXDeviceRule()); 
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
    // $ANTLR end "entryRuleXDevice"


    // $ANTLR start "ruleXDevice"
    // InternalXtextImpl.g:112:1: ruleXDevice : ( ( rule__XDevice__Alternatives ) ) ;
    public final void ruleXDevice() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXtextImpl.g:116:2: ( ( ( rule__XDevice__Alternatives ) ) )
            // InternalXtextImpl.g:117:2: ( ( rule__XDevice__Alternatives ) )
            {
            // InternalXtextImpl.g:117:2: ( ( rule__XDevice__Alternatives ) )
            // InternalXtextImpl.g:118:3: ( rule__XDevice__Alternatives )
            {
             before(grammarAccess.getXDeviceAccess().getAlternatives()); 
            // InternalXtextImpl.g:119:3: ( rule__XDevice__Alternatives )
            // InternalXtextImpl.g:119:4: rule__XDevice__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__XDevice__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getXDeviceAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleXDevice"


    // $ANTLR start "entryRuleXCable"
    // InternalXtextImpl.g:128:1: entryRuleXCable : ruleXCable EOF ;
    public final void entryRuleXCable() throws RecognitionException {
        try {
            // InternalXtextImpl.g:129:1: ( ruleXCable EOF )
            // InternalXtextImpl.g:130:1: ruleXCable EOF
            {
             before(grammarAccess.getXCableRule()); 
            pushFollow(FOLLOW_1);
            ruleXCable();

            state._fsp--;

             after(grammarAccess.getXCableRule()); 
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
    // $ANTLR end "entryRuleXCable"


    // $ANTLR start "ruleXCable"
    // InternalXtextImpl.g:137:1: ruleXCable : ( ( rule__XCable__Alternatives ) ) ;
    public final void ruleXCable() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXtextImpl.g:141:2: ( ( ( rule__XCable__Alternatives ) ) )
            // InternalXtextImpl.g:142:2: ( ( rule__XCable__Alternatives ) )
            {
            // InternalXtextImpl.g:142:2: ( ( rule__XCable__Alternatives ) )
            // InternalXtextImpl.g:143:3: ( rule__XCable__Alternatives )
            {
             before(grammarAccess.getXCableAccess().getAlternatives()); 
            // InternalXtextImpl.g:144:3: ( rule__XCable__Alternatives )
            // InternalXtextImpl.g:144:4: rule__XCable__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__XCable__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getXCableAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleXCable"


    // $ANTLR start "entryRuleConnections"
    // InternalXtextImpl.g:153:1: entryRuleConnections : ruleConnections EOF ;
    public final void entryRuleConnections() throws RecognitionException {
        try {
            // InternalXtextImpl.g:154:1: ( ruleConnections EOF )
            // InternalXtextImpl.g:155:1: ruleConnections EOF
            {
             before(grammarAccess.getConnectionsRule()); 
            pushFollow(FOLLOW_1);
            ruleConnections();

            state._fsp--;

             after(grammarAccess.getConnectionsRule()); 
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
    // $ANTLR end "entryRuleConnections"


    // $ANTLR start "ruleConnections"
    // InternalXtextImpl.g:162:1: ruleConnections : ( ( rule__Connections__Group__0 ) ) ;
    public final void ruleConnections() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXtextImpl.g:166:2: ( ( ( rule__Connections__Group__0 ) ) )
            // InternalXtextImpl.g:167:2: ( ( rule__Connections__Group__0 ) )
            {
            // InternalXtextImpl.g:167:2: ( ( rule__Connections__Group__0 ) )
            // InternalXtextImpl.g:168:3: ( rule__Connections__Group__0 )
            {
             before(grammarAccess.getConnectionsAccess().getGroup()); 
            // InternalXtextImpl.g:169:3: ( rule__Connections__Group__0 )
            // InternalXtextImpl.g:169:4: rule__Connections__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Connections__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getConnectionsAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleConnections"


    // $ANTLR start "entryRuleEBigInteger"
    // InternalXtextImpl.g:178:1: entryRuleEBigInteger : ruleEBigInteger EOF ;
    public final void entryRuleEBigInteger() throws RecognitionException {
        try {
            // InternalXtextImpl.g:179:1: ( ruleEBigInteger EOF )
            // InternalXtextImpl.g:180:1: ruleEBigInteger EOF
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
        }
        return ;
    }
    // $ANTLR end "entryRuleEBigInteger"


    // $ANTLR start "ruleEBigInteger"
    // InternalXtextImpl.g:187:1: ruleEBigInteger : ( RULE_INT ) ;
    public final void ruleEBigInteger() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXtextImpl.g:191:2: ( ( RULE_INT ) )
            // InternalXtextImpl.g:192:2: ( RULE_INT )
            {
            // InternalXtextImpl.g:192:2: ( RULE_INT )
            // InternalXtextImpl.g:193:3: RULE_INT
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

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEBigInteger"


    // $ANTLR start "entryRulebool"
    // InternalXtextImpl.g:203:1: entryRulebool : rulebool EOF ;
    public final void entryRulebool() throws RecognitionException {
        try {
            // InternalXtextImpl.g:204:1: ( rulebool EOF )
            // InternalXtextImpl.g:205:1: rulebool EOF
            {
             before(grammarAccess.getBoolRule()); 
            pushFollow(FOLLOW_1);
            rulebool();

            state._fsp--;

             after(grammarAccess.getBoolRule()); 
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
    // $ANTLR end "entryRulebool"


    // $ANTLR start "rulebool"
    // InternalXtextImpl.g:212:1: rulebool : ( ( rule__Bool__Alternatives ) ) ;
    public final void rulebool() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXtextImpl.g:216:2: ( ( ( rule__Bool__Alternatives ) ) )
            // InternalXtextImpl.g:217:2: ( ( rule__Bool__Alternatives ) )
            {
            // InternalXtextImpl.g:217:2: ( ( rule__Bool__Alternatives ) )
            // InternalXtextImpl.g:218:3: ( rule__Bool__Alternatives )
            {
             before(grammarAccess.getBoolAccess().getAlternatives()); 
            // InternalXtextImpl.g:219:3: ( rule__Bool__Alternatives )
            // InternalXtextImpl.g:219:4: rule__Bool__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Bool__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getBoolAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulebool"


    // $ANTLR start "entryRuleCableAttributes"
    // InternalXtextImpl.g:228:1: entryRuleCableAttributes : ruleCableAttributes EOF ;
    public final void entryRuleCableAttributes() throws RecognitionException {
        try {
            // InternalXtextImpl.g:229:1: ( ruleCableAttributes EOF )
            // InternalXtextImpl.g:230:1: ruleCableAttributes EOF
            {
             before(grammarAccess.getCableAttributesRule()); 
            pushFollow(FOLLOW_1);
            ruleCableAttributes();

            state._fsp--;

             after(grammarAccess.getCableAttributesRule()); 
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
    // $ANTLR end "entryRuleCableAttributes"


    // $ANTLR start "ruleCableAttributes"
    // InternalXtextImpl.g:237:1: ruleCableAttributes : ( ( rule__CableAttributes__Group__0 ) ) ;
    public final void ruleCableAttributes() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXtextImpl.g:241:2: ( ( ( rule__CableAttributes__Group__0 ) ) )
            // InternalXtextImpl.g:242:2: ( ( rule__CableAttributes__Group__0 ) )
            {
            // InternalXtextImpl.g:242:2: ( ( rule__CableAttributes__Group__0 ) )
            // InternalXtextImpl.g:243:3: ( rule__CableAttributes__Group__0 )
            {
             before(grammarAccess.getCableAttributesAccess().getGroup()); 
            // InternalXtextImpl.g:244:3: ( rule__CableAttributes__Group__0 )
            // InternalXtextImpl.g:244:4: rule__CableAttributes__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__CableAttributes__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getCableAttributesAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleCableAttributes"


    // $ANTLR start "entryRuleXServer"
    // InternalXtextImpl.g:253:1: entryRuleXServer : ruleXServer EOF ;
    public final void entryRuleXServer() throws RecognitionException {
        try {
            // InternalXtextImpl.g:254:1: ( ruleXServer EOF )
            // InternalXtextImpl.g:255:1: ruleXServer EOF
            {
             before(grammarAccess.getXServerRule()); 
            pushFollow(FOLLOW_1);
            ruleXServer();

            state._fsp--;

             after(grammarAccess.getXServerRule()); 
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
    // $ANTLR end "entryRuleXServer"


    // $ANTLR start "ruleXServer"
    // InternalXtextImpl.g:262:1: ruleXServer : ( ( rule__XServer__Group__0 ) ) ;
    public final void ruleXServer() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXtextImpl.g:266:2: ( ( ( rule__XServer__Group__0 ) ) )
            // InternalXtextImpl.g:267:2: ( ( rule__XServer__Group__0 ) )
            {
            // InternalXtextImpl.g:267:2: ( ( rule__XServer__Group__0 ) )
            // InternalXtextImpl.g:268:3: ( rule__XServer__Group__0 )
            {
             before(grammarAccess.getXServerAccess().getGroup()); 
            // InternalXtextImpl.g:269:3: ( rule__XServer__Group__0 )
            // InternalXtextImpl.g:269:4: rule__XServer__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__XServer__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getXServerAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleXServer"


    // $ANTLR start "entryRuleXComputer"
    // InternalXtextImpl.g:278:1: entryRuleXComputer : ruleXComputer EOF ;
    public final void entryRuleXComputer() throws RecognitionException {
        try {
            // InternalXtextImpl.g:279:1: ( ruleXComputer EOF )
            // InternalXtextImpl.g:280:1: ruleXComputer EOF
            {
             before(grammarAccess.getXComputerRule()); 
            pushFollow(FOLLOW_1);
            ruleXComputer();

            state._fsp--;

             after(grammarAccess.getXComputerRule()); 
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
    // $ANTLR end "entryRuleXComputer"


    // $ANTLR start "ruleXComputer"
    // InternalXtextImpl.g:287:1: ruleXComputer : ( ( rule__XComputer__Group__0 ) ) ;
    public final void ruleXComputer() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXtextImpl.g:291:2: ( ( ( rule__XComputer__Group__0 ) ) )
            // InternalXtextImpl.g:292:2: ( ( rule__XComputer__Group__0 ) )
            {
            // InternalXtextImpl.g:292:2: ( ( rule__XComputer__Group__0 ) )
            // InternalXtextImpl.g:293:3: ( rule__XComputer__Group__0 )
            {
             before(grammarAccess.getXComputerAccess().getGroup()); 
            // InternalXtextImpl.g:294:3: ( rule__XComputer__Group__0 )
            // InternalXtextImpl.g:294:4: rule__XComputer__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__XComputer__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getXComputerAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleXComputer"


    // $ANTLR start "entryRuleXRouter"
    // InternalXtextImpl.g:303:1: entryRuleXRouter : ruleXRouter EOF ;
    public final void entryRuleXRouter() throws RecognitionException {
        try {
            // InternalXtextImpl.g:304:1: ( ruleXRouter EOF )
            // InternalXtextImpl.g:305:1: ruleXRouter EOF
            {
             before(grammarAccess.getXRouterRule()); 
            pushFollow(FOLLOW_1);
            ruleXRouter();

            state._fsp--;

             after(grammarAccess.getXRouterRule()); 
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
    // $ANTLR end "entryRuleXRouter"


    // $ANTLR start "ruleXRouter"
    // InternalXtextImpl.g:312:1: ruleXRouter : ( ( rule__XRouter__Group__0 ) ) ;
    public final void ruleXRouter() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXtextImpl.g:316:2: ( ( ( rule__XRouter__Group__0 ) ) )
            // InternalXtextImpl.g:317:2: ( ( rule__XRouter__Group__0 ) )
            {
            // InternalXtextImpl.g:317:2: ( ( rule__XRouter__Group__0 ) )
            // InternalXtextImpl.g:318:3: ( rule__XRouter__Group__0 )
            {
             before(grammarAccess.getXRouterAccess().getGroup()); 
            // InternalXtextImpl.g:319:3: ( rule__XRouter__Group__0 )
            // InternalXtextImpl.g:319:4: rule__XRouter__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__XRouter__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getXRouterAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleXRouter"


    // $ANTLR start "entryRuleXCopperCable"
    // InternalXtextImpl.g:328:1: entryRuleXCopperCable : ruleXCopperCable EOF ;
    public final void entryRuleXCopperCable() throws RecognitionException {
        try {
            // InternalXtextImpl.g:329:1: ( ruleXCopperCable EOF )
            // InternalXtextImpl.g:330:1: ruleXCopperCable EOF
            {
             before(grammarAccess.getXCopperCableRule()); 
            pushFollow(FOLLOW_1);
            ruleXCopperCable();

            state._fsp--;

             after(grammarAccess.getXCopperCableRule()); 
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
    // $ANTLR end "entryRuleXCopperCable"


    // $ANTLR start "ruleXCopperCable"
    // InternalXtextImpl.g:337:1: ruleXCopperCable : ( ( rule__XCopperCable__Group__0 ) ) ;
    public final void ruleXCopperCable() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXtextImpl.g:341:2: ( ( ( rule__XCopperCable__Group__0 ) ) )
            // InternalXtextImpl.g:342:2: ( ( rule__XCopperCable__Group__0 ) )
            {
            // InternalXtextImpl.g:342:2: ( ( rule__XCopperCable__Group__0 ) )
            // InternalXtextImpl.g:343:3: ( rule__XCopperCable__Group__0 )
            {
             before(grammarAccess.getXCopperCableAccess().getGroup()); 
            // InternalXtextImpl.g:344:3: ( rule__XCopperCable__Group__0 )
            // InternalXtextImpl.g:344:4: rule__XCopperCable__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__XCopperCable__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getXCopperCableAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleXCopperCable"


    // $ANTLR start "entryRuleXGlassFiberCable"
    // InternalXtextImpl.g:353:1: entryRuleXGlassFiberCable : ruleXGlassFiberCable EOF ;
    public final void entryRuleXGlassFiberCable() throws RecognitionException {
        try {
            // InternalXtextImpl.g:354:1: ( ruleXGlassFiberCable EOF )
            // InternalXtextImpl.g:355:1: ruleXGlassFiberCable EOF
            {
             before(grammarAccess.getXGlassFiberCableRule()); 
            pushFollow(FOLLOW_1);
            ruleXGlassFiberCable();

            state._fsp--;

             after(grammarAccess.getXGlassFiberCableRule()); 
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
    // $ANTLR end "entryRuleXGlassFiberCable"


    // $ANTLR start "ruleXGlassFiberCable"
    // InternalXtextImpl.g:362:1: ruleXGlassFiberCable : ( ( rule__XGlassFiberCable__Group__0 ) ) ;
    public final void ruleXGlassFiberCable() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXtextImpl.g:366:2: ( ( ( rule__XGlassFiberCable__Group__0 ) ) )
            // InternalXtextImpl.g:367:2: ( ( rule__XGlassFiberCable__Group__0 ) )
            {
            // InternalXtextImpl.g:367:2: ( ( rule__XGlassFiberCable__Group__0 ) )
            // InternalXtextImpl.g:368:3: ( rule__XGlassFiberCable__Group__0 )
            {
             before(grammarAccess.getXGlassFiberCableAccess().getGroup()); 
            // InternalXtextImpl.g:369:3: ( rule__XGlassFiberCable__Group__0 )
            // InternalXtextImpl.g:369:4: rule__XGlassFiberCable__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__XGlassFiberCable__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getXGlassFiberCableAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleXGlassFiberCable"


    // $ANTLR start "rule__NetworkElement__Alternatives"
    // InternalXtextImpl.g:377:1: rule__NetworkElement__Alternatives : ( ( ruleXDevice ) | ( ruleXCable ) );
    public final void rule__NetworkElement__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXtextImpl.g:381:1: ( ( ruleXDevice ) | ( ruleXCable ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==22||(LA2_0>=27 && LA2_0<=28)) ) {
                alt2=1;
            }
            else if ( ((LA2_0>=30 && LA2_0<=31)) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // InternalXtextImpl.g:382:2: ( ruleXDevice )
                    {
                    // InternalXtextImpl.g:382:2: ( ruleXDevice )
                    // InternalXtextImpl.g:383:3: ruleXDevice
                    {
                     before(grammarAccess.getNetworkElementAccess().getXDeviceParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleXDevice();

                    state._fsp--;

                     after(grammarAccess.getNetworkElementAccess().getXDeviceParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalXtextImpl.g:388:2: ( ruleXCable )
                    {
                    // InternalXtextImpl.g:388:2: ( ruleXCable )
                    // InternalXtextImpl.g:389:3: ruleXCable
                    {
                     before(grammarAccess.getNetworkElementAccess().getXCableParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleXCable();

                    state._fsp--;

                     after(grammarAccess.getNetworkElementAccess().getXCableParserRuleCall_1()); 

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
    // $ANTLR end "rule__NetworkElement__Alternatives"


    // $ANTLR start "rule__XDevice__Alternatives"
    // InternalXtextImpl.g:398:1: rule__XDevice__Alternatives : ( ( ruleXServer ) | ( ruleXComputer ) | ( ruleXRouter ) );
    public final void rule__XDevice__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXtextImpl.g:402:1: ( ( ruleXServer ) | ( ruleXComputer ) | ( ruleXRouter ) )
            int alt3=3;
            switch ( input.LA(1) ) {
            case 22:
                {
                alt3=1;
                }
                break;
            case 27:
                {
                alt3=2;
                }
                break;
            case 28:
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
                    // InternalXtextImpl.g:403:2: ( ruleXServer )
                    {
                    // InternalXtextImpl.g:403:2: ( ruleXServer )
                    // InternalXtextImpl.g:404:3: ruleXServer
                    {
                     before(grammarAccess.getXDeviceAccess().getXServerParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleXServer();

                    state._fsp--;

                     after(grammarAccess.getXDeviceAccess().getXServerParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalXtextImpl.g:409:2: ( ruleXComputer )
                    {
                    // InternalXtextImpl.g:409:2: ( ruleXComputer )
                    // InternalXtextImpl.g:410:3: ruleXComputer
                    {
                     before(grammarAccess.getXDeviceAccess().getXComputerParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleXComputer();

                    state._fsp--;

                     after(grammarAccess.getXDeviceAccess().getXComputerParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalXtextImpl.g:415:2: ( ruleXRouter )
                    {
                    // InternalXtextImpl.g:415:2: ( ruleXRouter )
                    // InternalXtextImpl.g:416:3: ruleXRouter
                    {
                     before(grammarAccess.getXDeviceAccess().getXRouterParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    ruleXRouter();

                    state._fsp--;

                     after(grammarAccess.getXDeviceAccess().getXRouterParserRuleCall_2()); 

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
    // $ANTLR end "rule__XDevice__Alternatives"


    // $ANTLR start "rule__XCable__Alternatives"
    // InternalXtextImpl.g:425:1: rule__XCable__Alternatives : ( ( ruleXCopperCable ) | ( ruleXGlassFiberCable ) );
    public final void rule__XCable__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXtextImpl.g:429:1: ( ( ruleXCopperCable ) | ( ruleXGlassFiberCable ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==30) ) {
                alt4=1;
            }
            else if ( (LA4_0==31) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // InternalXtextImpl.g:430:2: ( ruleXCopperCable )
                    {
                    // InternalXtextImpl.g:430:2: ( ruleXCopperCable )
                    // InternalXtextImpl.g:431:3: ruleXCopperCable
                    {
                     before(grammarAccess.getXCableAccess().getXCopperCableParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleXCopperCable();

                    state._fsp--;

                     after(grammarAccess.getXCableAccess().getXCopperCableParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalXtextImpl.g:436:2: ( ruleXGlassFiberCable )
                    {
                    // InternalXtextImpl.g:436:2: ( ruleXGlassFiberCable )
                    // InternalXtextImpl.g:437:3: ruleXGlassFiberCable
                    {
                     before(grammarAccess.getXCableAccess().getXGlassFiberCableParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleXGlassFiberCable();

                    state._fsp--;

                     after(grammarAccess.getXCableAccess().getXGlassFiberCableParserRuleCall_1()); 

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
    // $ANTLR end "rule__XCable__Alternatives"


    // $ANTLR start "rule__Bool__Alternatives"
    // InternalXtextImpl.g:446:1: rule__Bool__Alternatives : ( ( 'true' ) | ( 'false' ) );
    public final void rule__Bool__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXtextImpl.g:450:1: ( ( 'true' ) | ( 'false' ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==11) ) {
                alt5=1;
            }
            else if ( (LA5_0==12) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // InternalXtextImpl.g:451:2: ( 'true' )
                    {
                    // InternalXtextImpl.g:451:2: ( 'true' )
                    // InternalXtextImpl.g:452:3: 'true'
                    {
                     before(grammarAccess.getBoolAccess().getTrueKeyword_0()); 
                    match(input,11,FOLLOW_2); 
                     after(grammarAccess.getBoolAccess().getTrueKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalXtextImpl.g:457:2: ( 'false' )
                    {
                    // InternalXtextImpl.g:457:2: ( 'false' )
                    // InternalXtextImpl.g:458:3: 'false'
                    {
                     before(grammarAccess.getBoolAccess().getFalseKeyword_1()); 
                    match(input,12,FOLLOW_2); 
                     after(grammarAccess.getBoolAccess().getFalseKeyword_1()); 

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
    // $ANTLR end "rule__Bool__Alternatives"


    // $ANTLR start "rule__Connections__Group__0"
    // InternalXtextImpl.g:467:1: rule__Connections__Group__0 : rule__Connections__Group__0__Impl rule__Connections__Group__1 ;
    public final void rule__Connections__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXtextImpl.g:471:1: ( rule__Connections__Group__0__Impl rule__Connections__Group__1 )
            // InternalXtextImpl.g:472:2: rule__Connections__Group__0__Impl rule__Connections__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__Connections__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Connections__Group__1();

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
    // $ANTLR end "rule__Connections__Group__0"


    // $ANTLR start "rule__Connections__Group__0__Impl"
    // InternalXtextImpl.g:479:1: rule__Connections__Group__0__Impl : ( () ) ;
    public final void rule__Connections__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXtextImpl.g:483:1: ( ( () ) )
            // InternalXtextImpl.g:484:1: ( () )
            {
            // InternalXtextImpl.g:484:1: ( () )
            // InternalXtextImpl.g:485:2: ()
            {
             before(grammarAccess.getConnectionsAccess().getConnectionsAction_0()); 
            // InternalXtextImpl.g:486:2: ()
            // InternalXtextImpl.g:486:3: 
            {
            }

             after(grammarAccess.getConnectionsAccess().getConnectionsAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Connections__Group__0__Impl"


    // $ANTLR start "rule__Connections__Group__1"
    // InternalXtextImpl.g:494:1: rule__Connections__Group__1 : rule__Connections__Group__1__Impl rule__Connections__Group__2 ;
    public final void rule__Connections__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXtextImpl.g:498:1: ( rule__Connections__Group__1__Impl rule__Connections__Group__2 )
            // InternalXtextImpl.g:499:2: rule__Connections__Group__1__Impl rule__Connections__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__Connections__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Connections__Group__2();

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
    // $ANTLR end "rule__Connections__Group__1"


    // $ANTLR start "rule__Connections__Group__1__Impl"
    // InternalXtextImpl.g:506:1: rule__Connections__Group__1__Impl : ( ( rule__Connections__Group_1__0 )? ) ;
    public final void rule__Connections__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXtextImpl.g:510:1: ( ( ( rule__Connections__Group_1__0 )? ) )
            // InternalXtextImpl.g:511:1: ( ( rule__Connections__Group_1__0 )? )
            {
            // InternalXtextImpl.g:511:1: ( ( rule__Connections__Group_1__0 )? )
            // InternalXtextImpl.g:512:2: ( rule__Connections__Group_1__0 )?
            {
             before(grammarAccess.getConnectionsAccess().getGroup_1()); 
            // InternalXtextImpl.g:513:2: ( rule__Connections__Group_1__0 )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==13) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalXtextImpl.g:513:3: rule__Connections__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Connections__Group_1__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getConnectionsAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Connections__Group__1__Impl"


    // $ANTLR start "rule__Connections__Group__2"
    // InternalXtextImpl.g:521:1: rule__Connections__Group__2 : rule__Connections__Group__2__Impl ;
    public final void rule__Connections__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXtextImpl.g:525:1: ( rule__Connections__Group__2__Impl )
            // InternalXtextImpl.g:526:2: rule__Connections__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Connections__Group__2__Impl();

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
    // $ANTLR end "rule__Connections__Group__2"


    // $ANTLR start "rule__Connections__Group__2__Impl"
    // InternalXtextImpl.g:532:1: rule__Connections__Group__2__Impl : ( ( rule__Connections__Group_2__0 )? ) ;
    public final void rule__Connections__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXtextImpl.g:536:1: ( ( ( rule__Connections__Group_2__0 )? ) )
            // InternalXtextImpl.g:537:1: ( ( rule__Connections__Group_2__0 )? )
            {
            // InternalXtextImpl.g:537:1: ( ( rule__Connections__Group_2__0 )? )
            // InternalXtextImpl.g:538:2: ( rule__Connections__Group_2__0 )?
            {
             before(grammarAccess.getConnectionsAccess().getGroup_2()); 
            // InternalXtextImpl.g:539:2: ( rule__Connections__Group_2__0 )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==17) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalXtextImpl.g:539:3: rule__Connections__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Connections__Group_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getConnectionsAccess().getGroup_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Connections__Group__2__Impl"


    // $ANTLR start "rule__Connections__Group_1__0"
    // InternalXtextImpl.g:548:1: rule__Connections__Group_1__0 : rule__Connections__Group_1__0__Impl rule__Connections__Group_1__1 ;
    public final void rule__Connections__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXtextImpl.g:552:1: ( rule__Connections__Group_1__0__Impl rule__Connections__Group_1__1 )
            // InternalXtextImpl.g:553:2: rule__Connections__Group_1__0__Impl rule__Connections__Group_1__1
            {
            pushFollow(FOLLOW_5);
            rule__Connections__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Connections__Group_1__1();

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
    // $ANTLR end "rule__Connections__Group_1__0"


    // $ANTLR start "rule__Connections__Group_1__0__Impl"
    // InternalXtextImpl.g:560:1: rule__Connections__Group_1__0__Impl : ( 'incoming' ) ;
    public final void rule__Connections__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXtextImpl.g:564:1: ( ( 'incoming' ) )
            // InternalXtextImpl.g:565:1: ( 'incoming' )
            {
            // InternalXtextImpl.g:565:1: ( 'incoming' )
            // InternalXtextImpl.g:566:2: 'incoming'
            {
             before(grammarAccess.getConnectionsAccess().getIncomingKeyword_1_0()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getConnectionsAccess().getIncomingKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Connections__Group_1__0__Impl"


    // $ANTLR start "rule__Connections__Group_1__1"
    // InternalXtextImpl.g:575:1: rule__Connections__Group_1__1 : rule__Connections__Group_1__1__Impl rule__Connections__Group_1__2 ;
    public final void rule__Connections__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXtextImpl.g:579:1: ( rule__Connections__Group_1__1__Impl rule__Connections__Group_1__2 )
            // InternalXtextImpl.g:580:2: rule__Connections__Group_1__1__Impl rule__Connections__Group_1__2
            {
            pushFollow(FOLLOW_6);
            rule__Connections__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Connections__Group_1__2();

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
    // $ANTLR end "rule__Connections__Group_1__1"


    // $ANTLR start "rule__Connections__Group_1__1__Impl"
    // InternalXtextImpl.g:587:1: rule__Connections__Group_1__1__Impl : ( '(' ) ;
    public final void rule__Connections__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXtextImpl.g:591:1: ( ( '(' ) )
            // InternalXtextImpl.g:592:1: ( '(' )
            {
            // InternalXtextImpl.g:592:1: ( '(' )
            // InternalXtextImpl.g:593:2: '('
            {
             before(grammarAccess.getConnectionsAccess().getLeftParenthesisKeyword_1_1()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getConnectionsAccess().getLeftParenthesisKeyword_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Connections__Group_1__1__Impl"


    // $ANTLR start "rule__Connections__Group_1__2"
    // InternalXtextImpl.g:602:1: rule__Connections__Group_1__2 : rule__Connections__Group_1__2__Impl rule__Connections__Group_1__3 ;
    public final void rule__Connections__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXtextImpl.g:606:1: ( rule__Connections__Group_1__2__Impl rule__Connections__Group_1__3 )
            // InternalXtextImpl.g:607:2: rule__Connections__Group_1__2__Impl rule__Connections__Group_1__3
            {
            pushFollow(FOLLOW_7);
            rule__Connections__Group_1__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Connections__Group_1__3();

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
    // $ANTLR end "rule__Connections__Group_1__2"


    // $ANTLR start "rule__Connections__Group_1__2__Impl"
    // InternalXtextImpl.g:614:1: rule__Connections__Group_1__2__Impl : ( ( rule__Connections__IncomingAssignment_1_2 ) ) ;
    public final void rule__Connections__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXtextImpl.g:618:1: ( ( ( rule__Connections__IncomingAssignment_1_2 ) ) )
            // InternalXtextImpl.g:619:1: ( ( rule__Connections__IncomingAssignment_1_2 ) )
            {
            // InternalXtextImpl.g:619:1: ( ( rule__Connections__IncomingAssignment_1_2 ) )
            // InternalXtextImpl.g:620:2: ( rule__Connections__IncomingAssignment_1_2 )
            {
             before(grammarAccess.getConnectionsAccess().getIncomingAssignment_1_2()); 
            // InternalXtextImpl.g:621:2: ( rule__Connections__IncomingAssignment_1_2 )
            // InternalXtextImpl.g:621:3: rule__Connections__IncomingAssignment_1_2
            {
            pushFollow(FOLLOW_2);
            rule__Connections__IncomingAssignment_1_2();

            state._fsp--;


            }

             after(grammarAccess.getConnectionsAccess().getIncomingAssignment_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Connections__Group_1__2__Impl"


    // $ANTLR start "rule__Connections__Group_1__3"
    // InternalXtextImpl.g:629:1: rule__Connections__Group_1__3 : rule__Connections__Group_1__3__Impl rule__Connections__Group_1__4 ;
    public final void rule__Connections__Group_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXtextImpl.g:633:1: ( rule__Connections__Group_1__3__Impl rule__Connections__Group_1__4 )
            // InternalXtextImpl.g:634:2: rule__Connections__Group_1__3__Impl rule__Connections__Group_1__4
            {
            pushFollow(FOLLOW_7);
            rule__Connections__Group_1__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Connections__Group_1__4();

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
    // $ANTLR end "rule__Connections__Group_1__3"


    // $ANTLR start "rule__Connections__Group_1__3__Impl"
    // InternalXtextImpl.g:641:1: rule__Connections__Group_1__3__Impl : ( ( rule__Connections__Group_1_3__0 )* ) ;
    public final void rule__Connections__Group_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXtextImpl.g:645:1: ( ( ( rule__Connections__Group_1_3__0 )* ) )
            // InternalXtextImpl.g:646:1: ( ( rule__Connections__Group_1_3__0 )* )
            {
            // InternalXtextImpl.g:646:1: ( ( rule__Connections__Group_1_3__0 )* )
            // InternalXtextImpl.g:647:2: ( rule__Connections__Group_1_3__0 )*
            {
             before(grammarAccess.getConnectionsAccess().getGroup_1_3()); 
            // InternalXtextImpl.g:648:2: ( rule__Connections__Group_1_3__0 )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==16) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalXtextImpl.g:648:3: rule__Connections__Group_1_3__0
            	    {
            	    pushFollow(FOLLOW_8);
            	    rule__Connections__Group_1_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

             after(grammarAccess.getConnectionsAccess().getGroup_1_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Connections__Group_1__3__Impl"


    // $ANTLR start "rule__Connections__Group_1__4"
    // InternalXtextImpl.g:656:1: rule__Connections__Group_1__4 : rule__Connections__Group_1__4__Impl ;
    public final void rule__Connections__Group_1__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXtextImpl.g:660:1: ( rule__Connections__Group_1__4__Impl )
            // InternalXtextImpl.g:661:2: rule__Connections__Group_1__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Connections__Group_1__4__Impl();

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
    // $ANTLR end "rule__Connections__Group_1__4"


    // $ANTLR start "rule__Connections__Group_1__4__Impl"
    // InternalXtextImpl.g:667:1: rule__Connections__Group_1__4__Impl : ( ')' ) ;
    public final void rule__Connections__Group_1__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXtextImpl.g:671:1: ( ( ')' ) )
            // InternalXtextImpl.g:672:1: ( ')' )
            {
            // InternalXtextImpl.g:672:1: ( ')' )
            // InternalXtextImpl.g:673:2: ')'
            {
             before(grammarAccess.getConnectionsAccess().getRightParenthesisKeyword_1_4()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getConnectionsAccess().getRightParenthesisKeyword_1_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Connections__Group_1__4__Impl"


    // $ANTLR start "rule__Connections__Group_1_3__0"
    // InternalXtextImpl.g:683:1: rule__Connections__Group_1_3__0 : rule__Connections__Group_1_3__0__Impl rule__Connections__Group_1_3__1 ;
    public final void rule__Connections__Group_1_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXtextImpl.g:687:1: ( rule__Connections__Group_1_3__0__Impl rule__Connections__Group_1_3__1 )
            // InternalXtextImpl.g:688:2: rule__Connections__Group_1_3__0__Impl rule__Connections__Group_1_3__1
            {
            pushFollow(FOLLOW_6);
            rule__Connections__Group_1_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Connections__Group_1_3__1();

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
    // $ANTLR end "rule__Connections__Group_1_3__0"


    // $ANTLR start "rule__Connections__Group_1_3__0__Impl"
    // InternalXtextImpl.g:695:1: rule__Connections__Group_1_3__0__Impl : ( ',' ) ;
    public final void rule__Connections__Group_1_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXtextImpl.g:699:1: ( ( ',' ) )
            // InternalXtextImpl.g:700:1: ( ',' )
            {
            // InternalXtextImpl.g:700:1: ( ',' )
            // InternalXtextImpl.g:701:2: ','
            {
             before(grammarAccess.getConnectionsAccess().getCommaKeyword_1_3_0()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getConnectionsAccess().getCommaKeyword_1_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Connections__Group_1_3__0__Impl"


    // $ANTLR start "rule__Connections__Group_1_3__1"
    // InternalXtextImpl.g:710:1: rule__Connections__Group_1_3__1 : rule__Connections__Group_1_3__1__Impl ;
    public final void rule__Connections__Group_1_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXtextImpl.g:714:1: ( rule__Connections__Group_1_3__1__Impl )
            // InternalXtextImpl.g:715:2: rule__Connections__Group_1_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Connections__Group_1_3__1__Impl();

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
    // $ANTLR end "rule__Connections__Group_1_3__1"


    // $ANTLR start "rule__Connections__Group_1_3__1__Impl"
    // InternalXtextImpl.g:721:1: rule__Connections__Group_1_3__1__Impl : ( ( rule__Connections__IncomingAssignment_1_3_1 ) ) ;
    public final void rule__Connections__Group_1_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXtextImpl.g:725:1: ( ( ( rule__Connections__IncomingAssignment_1_3_1 ) ) )
            // InternalXtextImpl.g:726:1: ( ( rule__Connections__IncomingAssignment_1_3_1 ) )
            {
            // InternalXtextImpl.g:726:1: ( ( rule__Connections__IncomingAssignment_1_3_1 ) )
            // InternalXtextImpl.g:727:2: ( rule__Connections__IncomingAssignment_1_3_1 )
            {
             before(grammarAccess.getConnectionsAccess().getIncomingAssignment_1_3_1()); 
            // InternalXtextImpl.g:728:2: ( rule__Connections__IncomingAssignment_1_3_1 )
            // InternalXtextImpl.g:728:3: rule__Connections__IncomingAssignment_1_3_1
            {
            pushFollow(FOLLOW_2);
            rule__Connections__IncomingAssignment_1_3_1();

            state._fsp--;


            }

             after(grammarAccess.getConnectionsAccess().getIncomingAssignment_1_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Connections__Group_1_3__1__Impl"


    // $ANTLR start "rule__Connections__Group_2__0"
    // InternalXtextImpl.g:737:1: rule__Connections__Group_2__0 : rule__Connections__Group_2__0__Impl rule__Connections__Group_2__1 ;
    public final void rule__Connections__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXtextImpl.g:741:1: ( rule__Connections__Group_2__0__Impl rule__Connections__Group_2__1 )
            // InternalXtextImpl.g:742:2: rule__Connections__Group_2__0__Impl rule__Connections__Group_2__1
            {
            pushFollow(FOLLOW_5);
            rule__Connections__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Connections__Group_2__1();

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
    // $ANTLR end "rule__Connections__Group_2__0"


    // $ANTLR start "rule__Connections__Group_2__0__Impl"
    // InternalXtextImpl.g:749:1: rule__Connections__Group_2__0__Impl : ( 'outgoing' ) ;
    public final void rule__Connections__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXtextImpl.g:753:1: ( ( 'outgoing' ) )
            // InternalXtextImpl.g:754:1: ( 'outgoing' )
            {
            // InternalXtextImpl.g:754:1: ( 'outgoing' )
            // InternalXtextImpl.g:755:2: 'outgoing'
            {
             before(grammarAccess.getConnectionsAccess().getOutgoingKeyword_2_0()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getConnectionsAccess().getOutgoingKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Connections__Group_2__0__Impl"


    // $ANTLR start "rule__Connections__Group_2__1"
    // InternalXtextImpl.g:764:1: rule__Connections__Group_2__1 : rule__Connections__Group_2__1__Impl rule__Connections__Group_2__2 ;
    public final void rule__Connections__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXtextImpl.g:768:1: ( rule__Connections__Group_2__1__Impl rule__Connections__Group_2__2 )
            // InternalXtextImpl.g:769:2: rule__Connections__Group_2__1__Impl rule__Connections__Group_2__2
            {
            pushFollow(FOLLOW_6);
            rule__Connections__Group_2__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Connections__Group_2__2();

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
    // $ANTLR end "rule__Connections__Group_2__1"


    // $ANTLR start "rule__Connections__Group_2__1__Impl"
    // InternalXtextImpl.g:776:1: rule__Connections__Group_2__1__Impl : ( '(' ) ;
    public final void rule__Connections__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXtextImpl.g:780:1: ( ( '(' ) )
            // InternalXtextImpl.g:781:1: ( '(' )
            {
            // InternalXtextImpl.g:781:1: ( '(' )
            // InternalXtextImpl.g:782:2: '('
            {
             before(grammarAccess.getConnectionsAccess().getLeftParenthesisKeyword_2_1()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getConnectionsAccess().getLeftParenthesisKeyword_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Connections__Group_2__1__Impl"


    // $ANTLR start "rule__Connections__Group_2__2"
    // InternalXtextImpl.g:791:1: rule__Connections__Group_2__2 : rule__Connections__Group_2__2__Impl rule__Connections__Group_2__3 ;
    public final void rule__Connections__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXtextImpl.g:795:1: ( rule__Connections__Group_2__2__Impl rule__Connections__Group_2__3 )
            // InternalXtextImpl.g:796:2: rule__Connections__Group_2__2__Impl rule__Connections__Group_2__3
            {
            pushFollow(FOLLOW_7);
            rule__Connections__Group_2__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Connections__Group_2__3();

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
    // $ANTLR end "rule__Connections__Group_2__2"


    // $ANTLR start "rule__Connections__Group_2__2__Impl"
    // InternalXtextImpl.g:803:1: rule__Connections__Group_2__2__Impl : ( ( rule__Connections__OutgoingAssignment_2_2 ) ) ;
    public final void rule__Connections__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXtextImpl.g:807:1: ( ( ( rule__Connections__OutgoingAssignment_2_2 ) ) )
            // InternalXtextImpl.g:808:1: ( ( rule__Connections__OutgoingAssignment_2_2 ) )
            {
            // InternalXtextImpl.g:808:1: ( ( rule__Connections__OutgoingAssignment_2_2 ) )
            // InternalXtextImpl.g:809:2: ( rule__Connections__OutgoingAssignment_2_2 )
            {
             before(grammarAccess.getConnectionsAccess().getOutgoingAssignment_2_2()); 
            // InternalXtextImpl.g:810:2: ( rule__Connections__OutgoingAssignment_2_2 )
            // InternalXtextImpl.g:810:3: rule__Connections__OutgoingAssignment_2_2
            {
            pushFollow(FOLLOW_2);
            rule__Connections__OutgoingAssignment_2_2();

            state._fsp--;


            }

             after(grammarAccess.getConnectionsAccess().getOutgoingAssignment_2_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Connections__Group_2__2__Impl"


    // $ANTLR start "rule__Connections__Group_2__3"
    // InternalXtextImpl.g:818:1: rule__Connections__Group_2__3 : rule__Connections__Group_2__3__Impl rule__Connections__Group_2__4 ;
    public final void rule__Connections__Group_2__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXtextImpl.g:822:1: ( rule__Connections__Group_2__3__Impl rule__Connections__Group_2__4 )
            // InternalXtextImpl.g:823:2: rule__Connections__Group_2__3__Impl rule__Connections__Group_2__4
            {
            pushFollow(FOLLOW_7);
            rule__Connections__Group_2__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Connections__Group_2__4();

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
    // $ANTLR end "rule__Connections__Group_2__3"


    // $ANTLR start "rule__Connections__Group_2__3__Impl"
    // InternalXtextImpl.g:830:1: rule__Connections__Group_2__3__Impl : ( ( rule__Connections__Group_2_3__0 )* ) ;
    public final void rule__Connections__Group_2__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXtextImpl.g:834:1: ( ( ( rule__Connections__Group_2_3__0 )* ) )
            // InternalXtextImpl.g:835:1: ( ( rule__Connections__Group_2_3__0 )* )
            {
            // InternalXtextImpl.g:835:1: ( ( rule__Connections__Group_2_3__0 )* )
            // InternalXtextImpl.g:836:2: ( rule__Connections__Group_2_3__0 )*
            {
             before(grammarAccess.getConnectionsAccess().getGroup_2_3()); 
            // InternalXtextImpl.g:837:2: ( rule__Connections__Group_2_3__0 )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==16) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalXtextImpl.g:837:3: rule__Connections__Group_2_3__0
            	    {
            	    pushFollow(FOLLOW_8);
            	    rule__Connections__Group_2_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

             after(grammarAccess.getConnectionsAccess().getGroup_2_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Connections__Group_2__3__Impl"


    // $ANTLR start "rule__Connections__Group_2__4"
    // InternalXtextImpl.g:845:1: rule__Connections__Group_2__4 : rule__Connections__Group_2__4__Impl ;
    public final void rule__Connections__Group_2__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXtextImpl.g:849:1: ( rule__Connections__Group_2__4__Impl )
            // InternalXtextImpl.g:850:2: rule__Connections__Group_2__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Connections__Group_2__4__Impl();

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
    // $ANTLR end "rule__Connections__Group_2__4"


    // $ANTLR start "rule__Connections__Group_2__4__Impl"
    // InternalXtextImpl.g:856:1: rule__Connections__Group_2__4__Impl : ( ')' ) ;
    public final void rule__Connections__Group_2__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXtextImpl.g:860:1: ( ( ')' ) )
            // InternalXtextImpl.g:861:1: ( ')' )
            {
            // InternalXtextImpl.g:861:1: ( ')' )
            // InternalXtextImpl.g:862:2: ')'
            {
             before(grammarAccess.getConnectionsAccess().getRightParenthesisKeyword_2_4()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getConnectionsAccess().getRightParenthesisKeyword_2_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Connections__Group_2__4__Impl"


    // $ANTLR start "rule__Connections__Group_2_3__0"
    // InternalXtextImpl.g:872:1: rule__Connections__Group_2_3__0 : rule__Connections__Group_2_3__0__Impl rule__Connections__Group_2_3__1 ;
    public final void rule__Connections__Group_2_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXtextImpl.g:876:1: ( rule__Connections__Group_2_3__0__Impl rule__Connections__Group_2_3__1 )
            // InternalXtextImpl.g:877:2: rule__Connections__Group_2_3__0__Impl rule__Connections__Group_2_3__1
            {
            pushFollow(FOLLOW_6);
            rule__Connections__Group_2_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Connections__Group_2_3__1();

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
    // $ANTLR end "rule__Connections__Group_2_3__0"


    // $ANTLR start "rule__Connections__Group_2_3__0__Impl"
    // InternalXtextImpl.g:884:1: rule__Connections__Group_2_3__0__Impl : ( ',' ) ;
    public final void rule__Connections__Group_2_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXtextImpl.g:888:1: ( ( ',' ) )
            // InternalXtextImpl.g:889:1: ( ',' )
            {
            // InternalXtextImpl.g:889:1: ( ',' )
            // InternalXtextImpl.g:890:2: ','
            {
             before(grammarAccess.getConnectionsAccess().getCommaKeyword_2_3_0()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getConnectionsAccess().getCommaKeyword_2_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Connections__Group_2_3__0__Impl"


    // $ANTLR start "rule__Connections__Group_2_3__1"
    // InternalXtextImpl.g:899:1: rule__Connections__Group_2_3__1 : rule__Connections__Group_2_3__1__Impl ;
    public final void rule__Connections__Group_2_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXtextImpl.g:903:1: ( rule__Connections__Group_2_3__1__Impl )
            // InternalXtextImpl.g:904:2: rule__Connections__Group_2_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Connections__Group_2_3__1__Impl();

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
    // $ANTLR end "rule__Connections__Group_2_3__1"


    // $ANTLR start "rule__Connections__Group_2_3__1__Impl"
    // InternalXtextImpl.g:910:1: rule__Connections__Group_2_3__1__Impl : ( ( rule__Connections__OutgoingAssignment_2_3_1 ) ) ;
    public final void rule__Connections__Group_2_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXtextImpl.g:914:1: ( ( ( rule__Connections__OutgoingAssignment_2_3_1 ) ) )
            // InternalXtextImpl.g:915:1: ( ( rule__Connections__OutgoingAssignment_2_3_1 ) )
            {
            // InternalXtextImpl.g:915:1: ( ( rule__Connections__OutgoingAssignment_2_3_1 ) )
            // InternalXtextImpl.g:916:2: ( rule__Connections__OutgoingAssignment_2_3_1 )
            {
             before(grammarAccess.getConnectionsAccess().getOutgoingAssignment_2_3_1()); 
            // InternalXtextImpl.g:917:2: ( rule__Connections__OutgoingAssignment_2_3_1 )
            // InternalXtextImpl.g:917:3: rule__Connections__OutgoingAssignment_2_3_1
            {
            pushFollow(FOLLOW_2);
            rule__Connections__OutgoingAssignment_2_3_1();

            state._fsp--;


            }

             after(grammarAccess.getConnectionsAccess().getOutgoingAssignment_2_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Connections__Group_2_3__1__Impl"


    // $ANTLR start "rule__CableAttributes__Group__0"
    // InternalXtextImpl.g:926:1: rule__CableAttributes__Group__0 : rule__CableAttributes__Group__0__Impl rule__CableAttributes__Group__1 ;
    public final void rule__CableAttributes__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXtextImpl.g:930:1: ( rule__CableAttributes__Group__0__Impl rule__CableAttributes__Group__1 )
            // InternalXtextImpl.g:931:2: rule__CableAttributes__Group__0__Impl rule__CableAttributes__Group__1
            {
            pushFollow(FOLLOW_9);
            rule__CableAttributes__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CableAttributes__Group__1();

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
    // $ANTLR end "rule__CableAttributes__Group__0"


    // $ANTLR start "rule__CableAttributes__Group__0__Impl"
    // InternalXtextImpl.g:938:1: rule__CableAttributes__Group__0__Impl : ( () ) ;
    public final void rule__CableAttributes__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXtextImpl.g:942:1: ( ( () ) )
            // InternalXtextImpl.g:943:1: ( () )
            {
            // InternalXtextImpl.g:943:1: ( () )
            // InternalXtextImpl.g:944:2: ()
            {
             before(grammarAccess.getCableAttributesAccess().getCableAttributesAction_0()); 
            // InternalXtextImpl.g:945:2: ()
            // InternalXtextImpl.g:945:3: 
            {
            }

             after(grammarAccess.getCableAttributesAccess().getCableAttributesAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CableAttributes__Group__0__Impl"


    // $ANTLR start "rule__CableAttributes__Group__1"
    // InternalXtextImpl.g:953:1: rule__CableAttributes__Group__1 : rule__CableAttributes__Group__1__Impl rule__CableAttributes__Group__2 ;
    public final void rule__CableAttributes__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXtextImpl.g:957:1: ( rule__CableAttributes__Group__1__Impl rule__CableAttributes__Group__2 )
            // InternalXtextImpl.g:958:2: rule__CableAttributes__Group__1__Impl rule__CableAttributes__Group__2
            {
            pushFollow(FOLLOW_10);
            rule__CableAttributes__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CableAttributes__Group__2();

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
    // $ANTLR end "rule__CableAttributes__Group__1"


    // $ANTLR start "rule__CableAttributes__Group__1__Impl"
    // InternalXtextImpl.g:965:1: rule__CableAttributes__Group__1__Impl : ( 'speed' ) ;
    public final void rule__CableAttributes__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXtextImpl.g:969:1: ( ( 'speed' ) )
            // InternalXtextImpl.g:970:1: ( 'speed' )
            {
            // InternalXtextImpl.g:970:1: ( 'speed' )
            // InternalXtextImpl.g:971:2: 'speed'
            {
             before(grammarAccess.getCableAttributesAccess().getSpeedKeyword_1()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getCableAttributesAccess().getSpeedKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CableAttributes__Group__1__Impl"


    // $ANTLR start "rule__CableAttributes__Group__2"
    // InternalXtextImpl.g:980:1: rule__CableAttributes__Group__2 : rule__CableAttributes__Group__2__Impl rule__CableAttributes__Group__3 ;
    public final void rule__CableAttributes__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXtextImpl.g:984:1: ( rule__CableAttributes__Group__2__Impl rule__CableAttributes__Group__3 )
            // InternalXtextImpl.g:985:2: rule__CableAttributes__Group__2__Impl rule__CableAttributes__Group__3
            {
            pushFollow(FOLLOW_11);
            rule__CableAttributes__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CableAttributes__Group__3();

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
    // $ANTLR end "rule__CableAttributes__Group__2"


    // $ANTLR start "rule__CableAttributes__Group__2__Impl"
    // InternalXtextImpl.g:992:1: rule__CableAttributes__Group__2__Impl : ( ( rule__CableAttributes__SpeedAssignment_2 ) ) ;
    public final void rule__CableAttributes__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXtextImpl.g:996:1: ( ( ( rule__CableAttributes__SpeedAssignment_2 ) ) )
            // InternalXtextImpl.g:997:1: ( ( rule__CableAttributes__SpeedAssignment_2 ) )
            {
            // InternalXtextImpl.g:997:1: ( ( rule__CableAttributes__SpeedAssignment_2 ) )
            // InternalXtextImpl.g:998:2: ( rule__CableAttributes__SpeedAssignment_2 )
            {
             before(grammarAccess.getCableAttributesAccess().getSpeedAssignment_2()); 
            // InternalXtextImpl.g:999:2: ( rule__CableAttributes__SpeedAssignment_2 )
            // InternalXtextImpl.g:999:3: rule__CableAttributes__SpeedAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__CableAttributes__SpeedAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getCableAttributesAccess().getSpeedAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CableAttributes__Group__2__Impl"


    // $ANTLR start "rule__CableAttributes__Group__3"
    // InternalXtextImpl.g:1007:1: rule__CableAttributes__Group__3 : rule__CableAttributes__Group__3__Impl rule__CableAttributes__Group__4 ;
    public final void rule__CableAttributes__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXtextImpl.g:1011:1: ( rule__CableAttributes__Group__3__Impl rule__CableAttributes__Group__4 )
            // InternalXtextImpl.g:1012:2: rule__CableAttributes__Group__3__Impl rule__CableAttributes__Group__4
            {
            pushFollow(FOLLOW_6);
            rule__CableAttributes__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CableAttributes__Group__4();

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
    // $ANTLR end "rule__CableAttributes__Group__3"


    // $ANTLR start "rule__CableAttributes__Group__3__Impl"
    // InternalXtextImpl.g:1019:1: rule__CableAttributes__Group__3__Impl : ( 'endPoint1' ) ;
    public final void rule__CableAttributes__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXtextImpl.g:1023:1: ( ( 'endPoint1' ) )
            // InternalXtextImpl.g:1024:1: ( 'endPoint1' )
            {
            // InternalXtextImpl.g:1024:1: ( 'endPoint1' )
            // InternalXtextImpl.g:1025:2: 'endPoint1'
            {
             before(grammarAccess.getCableAttributesAccess().getEndPoint1Keyword_3()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getCableAttributesAccess().getEndPoint1Keyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CableAttributes__Group__3__Impl"


    // $ANTLR start "rule__CableAttributes__Group__4"
    // InternalXtextImpl.g:1034:1: rule__CableAttributes__Group__4 : rule__CableAttributes__Group__4__Impl rule__CableAttributes__Group__5 ;
    public final void rule__CableAttributes__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXtextImpl.g:1038:1: ( rule__CableAttributes__Group__4__Impl rule__CableAttributes__Group__5 )
            // InternalXtextImpl.g:1039:2: rule__CableAttributes__Group__4__Impl rule__CableAttributes__Group__5
            {
            pushFollow(FOLLOW_12);
            rule__CableAttributes__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CableAttributes__Group__5();

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
    // $ANTLR end "rule__CableAttributes__Group__4"


    // $ANTLR start "rule__CableAttributes__Group__4__Impl"
    // InternalXtextImpl.g:1046:1: rule__CableAttributes__Group__4__Impl : ( ( rule__CableAttributes__EndPoint1Assignment_4 ) ) ;
    public final void rule__CableAttributes__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXtextImpl.g:1050:1: ( ( ( rule__CableAttributes__EndPoint1Assignment_4 ) ) )
            // InternalXtextImpl.g:1051:1: ( ( rule__CableAttributes__EndPoint1Assignment_4 ) )
            {
            // InternalXtextImpl.g:1051:1: ( ( rule__CableAttributes__EndPoint1Assignment_4 ) )
            // InternalXtextImpl.g:1052:2: ( rule__CableAttributes__EndPoint1Assignment_4 )
            {
             before(grammarAccess.getCableAttributesAccess().getEndPoint1Assignment_4()); 
            // InternalXtextImpl.g:1053:2: ( rule__CableAttributes__EndPoint1Assignment_4 )
            // InternalXtextImpl.g:1053:3: rule__CableAttributes__EndPoint1Assignment_4
            {
            pushFollow(FOLLOW_2);
            rule__CableAttributes__EndPoint1Assignment_4();

            state._fsp--;


            }

             after(grammarAccess.getCableAttributesAccess().getEndPoint1Assignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CableAttributes__Group__4__Impl"


    // $ANTLR start "rule__CableAttributes__Group__5"
    // InternalXtextImpl.g:1061:1: rule__CableAttributes__Group__5 : rule__CableAttributes__Group__5__Impl rule__CableAttributes__Group__6 ;
    public final void rule__CableAttributes__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXtextImpl.g:1065:1: ( rule__CableAttributes__Group__5__Impl rule__CableAttributes__Group__6 )
            // InternalXtextImpl.g:1066:2: rule__CableAttributes__Group__5__Impl rule__CableAttributes__Group__6
            {
            pushFollow(FOLLOW_6);
            rule__CableAttributes__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CableAttributes__Group__6();

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
    // $ANTLR end "rule__CableAttributes__Group__5"


    // $ANTLR start "rule__CableAttributes__Group__5__Impl"
    // InternalXtextImpl.g:1073:1: rule__CableAttributes__Group__5__Impl : ( 'endPoint2' ) ;
    public final void rule__CableAttributes__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXtextImpl.g:1077:1: ( ( 'endPoint2' ) )
            // InternalXtextImpl.g:1078:1: ( 'endPoint2' )
            {
            // InternalXtextImpl.g:1078:1: ( 'endPoint2' )
            // InternalXtextImpl.g:1079:2: 'endPoint2'
            {
             before(grammarAccess.getCableAttributesAccess().getEndPoint2Keyword_5()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getCableAttributesAccess().getEndPoint2Keyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CableAttributes__Group__5__Impl"


    // $ANTLR start "rule__CableAttributes__Group__6"
    // InternalXtextImpl.g:1088:1: rule__CableAttributes__Group__6 : rule__CableAttributes__Group__6__Impl rule__CableAttributes__Group__7 ;
    public final void rule__CableAttributes__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXtextImpl.g:1092:1: ( rule__CableAttributes__Group__6__Impl rule__CableAttributes__Group__7 )
            // InternalXtextImpl.g:1093:2: rule__CableAttributes__Group__6__Impl rule__CableAttributes__Group__7
            {
            pushFollow(FOLLOW_13);
            rule__CableAttributes__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CableAttributes__Group__7();

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
    // $ANTLR end "rule__CableAttributes__Group__6"


    // $ANTLR start "rule__CableAttributes__Group__6__Impl"
    // InternalXtextImpl.g:1100:1: rule__CableAttributes__Group__6__Impl : ( ( rule__CableAttributes__EndPoint2Assignment_6 ) ) ;
    public final void rule__CableAttributes__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXtextImpl.g:1104:1: ( ( ( rule__CableAttributes__EndPoint2Assignment_6 ) ) )
            // InternalXtextImpl.g:1105:1: ( ( rule__CableAttributes__EndPoint2Assignment_6 ) )
            {
            // InternalXtextImpl.g:1105:1: ( ( rule__CableAttributes__EndPoint2Assignment_6 ) )
            // InternalXtextImpl.g:1106:2: ( rule__CableAttributes__EndPoint2Assignment_6 )
            {
             before(grammarAccess.getCableAttributesAccess().getEndPoint2Assignment_6()); 
            // InternalXtextImpl.g:1107:2: ( rule__CableAttributes__EndPoint2Assignment_6 )
            // InternalXtextImpl.g:1107:3: rule__CableAttributes__EndPoint2Assignment_6
            {
            pushFollow(FOLLOW_2);
            rule__CableAttributes__EndPoint2Assignment_6();

            state._fsp--;


            }

             after(grammarAccess.getCableAttributesAccess().getEndPoint2Assignment_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CableAttributes__Group__6__Impl"


    // $ANTLR start "rule__CableAttributes__Group__7"
    // InternalXtextImpl.g:1115:1: rule__CableAttributes__Group__7 : rule__CableAttributes__Group__7__Impl ;
    public final void rule__CableAttributes__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXtextImpl.g:1119:1: ( rule__CableAttributes__Group__7__Impl )
            // InternalXtextImpl.g:1120:2: rule__CableAttributes__Group__7__Impl
            {
            pushFollow(FOLLOW_2);
            rule__CableAttributes__Group__7__Impl();

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
    // $ANTLR end "rule__CableAttributes__Group__7"


    // $ANTLR start "rule__CableAttributes__Group__7__Impl"
    // InternalXtextImpl.g:1126:1: rule__CableAttributes__Group__7__Impl : ( ( rule__CableAttributes__Group_7__0 )? ) ;
    public final void rule__CableAttributes__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXtextImpl.g:1130:1: ( ( ( rule__CableAttributes__Group_7__0 )? ) )
            // InternalXtextImpl.g:1131:1: ( ( rule__CableAttributes__Group_7__0 )? )
            {
            // InternalXtextImpl.g:1131:1: ( ( rule__CableAttributes__Group_7__0 )? )
            // InternalXtextImpl.g:1132:2: ( rule__CableAttributes__Group_7__0 )?
            {
             before(grammarAccess.getCableAttributesAccess().getGroup_7()); 
            // InternalXtextImpl.g:1133:2: ( rule__CableAttributes__Group_7__0 )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==21) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalXtextImpl.g:1133:3: rule__CableAttributes__Group_7__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__CableAttributes__Group_7__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getCableAttributesAccess().getGroup_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CableAttributes__Group__7__Impl"


    // $ANTLR start "rule__CableAttributes__Group_7__0"
    // InternalXtextImpl.g:1142:1: rule__CableAttributes__Group_7__0 : rule__CableAttributes__Group_7__0__Impl rule__CableAttributes__Group_7__1 ;
    public final void rule__CableAttributes__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXtextImpl.g:1146:1: ( rule__CableAttributes__Group_7__0__Impl rule__CableAttributes__Group_7__1 )
            // InternalXtextImpl.g:1147:2: rule__CableAttributes__Group_7__0__Impl rule__CableAttributes__Group_7__1
            {
            pushFollow(FOLLOW_14);
            rule__CableAttributes__Group_7__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CableAttributes__Group_7__1();

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
    // $ANTLR end "rule__CableAttributes__Group_7__0"


    // $ANTLR start "rule__CableAttributes__Group_7__0__Impl"
    // InternalXtextImpl.g:1154:1: rule__CableAttributes__Group_7__0__Impl : ( 'isDuplex' ) ;
    public final void rule__CableAttributes__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXtextImpl.g:1158:1: ( ( 'isDuplex' ) )
            // InternalXtextImpl.g:1159:1: ( 'isDuplex' )
            {
            // InternalXtextImpl.g:1159:1: ( 'isDuplex' )
            // InternalXtextImpl.g:1160:2: 'isDuplex'
            {
             before(grammarAccess.getCableAttributesAccess().getIsDuplexKeyword_7_0()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getCableAttributesAccess().getIsDuplexKeyword_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CableAttributes__Group_7__0__Impl"


    // $ANTLR start "rule__CableAttributes__Group_7__1"
    // InternalXtextImpl.g:1169:1: rule__CableAttributes__Group_7__1 : rule__CableAttributes__Group_7__1__Impl ;
    public final void rule__CableAttributes__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXtextImpl.g:1173:1: ( rule__CableAttributes__Group_7__1__Impl )
            // InternalXtextImpl.g:1174:2: rule__CableAttributes__Group_7__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__CableAttributes__Group_7__1__Impl();

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
    // $ANTLR end "rule__CableAttributes__Group_7__1"


    // $ANTLR start "rule__CableAttributes__Group_7__1__Impl"
    // InternalXtextImpl.g:1180:1: rule__CableAttributes__Group_7__1__Impl : ( ( rule__CableAttributes__IsDuplexAssignment_7_1 ) ) ;
    public final void rule__CableAttributes__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXtextImpl.g:1184:1: ( ( ( rule__CableAttributes__IsDuplexAssignment_7_1 ) ) )
            // InternalXtextImpl.g:1185:1: ( ( rule__CableAttributes__IsDuplexAssignment_7_1 ) )
            {
            // InternalXtextImpl.g:1185:1: ( ( rule__CableAttributes__IsDuplexAssignment_7_1 ) )
            // InternalXtextImpl.g:1186:2: ( rule__CableAttributes__IsDuplexAssignment_7_1 )
            {
             before(grammarAccess.getCableAttributesAccess().getIsDuplexAssignment_7_1()); 
            // InternalXtextImpl.g:1187:2: ( rule__CableAttributes__IsDuplexAssignment_7_1 )
            // InternalXtextImpl.g:1187:3: rule__CableAttributes__IsDuplexAssignment_7_1
            {
            pushFollow(FOLLOW_2);
            rule__CableAttributes__IsDuplexAssignment_7_1();

            state._fsp--;


            }

             after(grammarAccess.getCableAttributesAccess().getIsDuplexAssignment_7_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CableAttributes__Group_7__1__Impl"


    // $ANTLR start "rule__XServer__Group__0"
    // InternalXtextImpl.g:1196:1: rule__XServer__Group__0 : rule__XServer__Group__0__Impl rule__XServer__Group__1 ;
    public final void rule__XServer__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXtextImpl.g:1200:1: ( rule__XServer__Group__0__Impl rule__XServer__Group__1 )
            // InternalXtextImpl.g:1201:2: rule__XServer__Group__0__Impl rule__XServer__Group__1
            {
            pushFollow(FOLLOW_6);
            rule__XServer__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__XServer__Group__1();

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
    // $ANTLR end "rule__XServer__Group__0"


    // $ANTLR start "rule__XServer__Group__0__Impl"
    // InternalXtextImpl.g:1208:1: rule__XServer__Group__0__Impl : ( 'Server' ) ;
    public final void rule__XServer__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXtextImpl.g:1212:1: ( ( 'Server' ) )
            // InternalXtextImpl.g:1213:1: ( 'Server' )
            {
            // InternalXtextImpl.g:1213:1: ( 'Server' )
            // InternalXtextImpl.g:1214:2: 'Server'
            {
             before(grammarAccess.getXServerAccess().getServerKeyword_0()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getXServerAccess().getServerKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XServer__Group__0__Impl"


    // $ANTLR start "rule__XServer__Group__1"
    // InternalXtextImpl.g:1223:1: rule__XServer__Group__1 : rule__XServer__Group__1__Impl rule__XServer__Group__2 ;
    public final void rule__XServer__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXtextImpl.g:1227:1: ( rule__XServer__Group__1__Impl rule__XServer__Group__2 )
            // InternalXtextImpl.g:1228:2: rule__XServer__Group__1__Impl rule__XServer__Group__2
            {
            pushFollow(FOLLOW_15);
            rule__XServer__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__XServer__Group__2();

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
    // $ANTLR end "rule__XServer__Group__1"


    // $ANTLR start "rule__XServer__Group__1__Impl"
    // InternalXtextImpl.g:1235:1: rule__XServer__Group__1__Impl : ( ( rule__XServer__NameAssignment_1 ) ) ;
    public final void rule__XServer__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXtextImpl.g:1239:1: ( ( ( rule__XServer__NameAssignment_1 ) ) )
            // InternalXtextImpl.g:1240:1: ( ( rule__XServer__NameAssignment_1 ) )
            {
            // InternalXtextImpl.g:1240:1: ( ( rule__XServer__NameAssignment_1 ) )
            // InternalXtextImpl.g:1241:2: ( rule__XServer__NameAssignment_1 )
            {
             before(grammarAccess.getXServerAccess().getNameAssignment_1()); 
            // InternalXtextImpl.g:1242:2: ( rule__XServer__NameAssignment_1 )
            // InternalXtextImpl.g:1242:3: rule__XServer__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__XServer__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getXServerAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XServer__Group__1__Impl"


    // $ANTLR start "rule__XServer__Group__2"
    // InternalXtextImpl.g:1250:1: rule__XServer__Group__2 : rule__XServer__Group__2__Impl rule__XServer__Group__3 ;
    public final void rule__XServer__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXtextImpl.g:1254:1: ( rule__XServer__Group__2__Impl rule__XServer__Group__3 )
            // InternalXtextImpl.g:1255:2: rule__XServer__Group__2__Impl rule__XServer__Group__3
            {
            pushFollow(FOLLOW_16);
            rule__XServer__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__XServer__Group__3();

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
    // $ANTLR end "rule__XServer__Group__2"


    // $ANTLR start "rule__XServer__Group__2__Impl"
    // InternalXtextImpl.g:1262:1: rule__XServer__Group__2__Impl : ( '{' ) ;
    public final void rule__XServer__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXtextImpl.g:1266:1: ( ( '{' ) )
            // InternalXtextImpl.g:1267:1: ( '{' )
            {
            // InternalXtextImpl.g:1267:1: ( '{' )
            // InternalXtextImpl.g:1268:2: '{'
            {
             before(grammarAccess.getXServerAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getXServerAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XServer__Group__2__Impl"


    // $ANTLR start "rule__XServer__Group__3"
    // InternalXtextImpl.g:1277:1: rule__XServer__Group__3 : rule__XServer__Group__3__Impl rule__XServer__Group__4 ;
    public final void rule__XServer__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXtextImpl.g:1281:1: ( rule__XServer__Group__3__Impl rule__XServer__Group__4 )
            // InternalXtextImpl.g:1282:2: rule__XServer__Group__3__Impl rule__XServer__Group__4
            {
            pushFollow(FOLLOW_10);
            rule__XServer__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__XServer__Group__4();

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
    // $ANTLR end "rule__XServer__Group__3"


    // $ANTLR start "rule__XServer__Group__3__Impl"
    // InternalXtextImpl.g:1289:1: rule__XServer__Group__3__Impl : ( 'maxSlots' ) ;
    public final void rule__XServer__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXtextImpl.g:1293:1: ( ( 'maxSlots' ) )
            // InternalXtextImpl.g:1294:1: ( 'maxSlots' )
            {
            // InternalXtextImpl.g:1294:1: ( 'maxSlots' )
            // InternalXtextImpl.g:1295:2: 'maxSlots'
            {
             before(grammarAccess.getXServerAccess().getMaxSlotsKeyword_3()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getXServerAccess().getMaxSlotsKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XServer__Group__3__Impl"


    // $ANTLR start "rule__XServer__Group__4"
    // InternalXtextImpl.g:1304:1: rule__XServer__Group__4 : rule__XServer__Group__4__Impl rule__XServer__Group__5 ;
    public final void rule__XServer__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXtextImpl.g:1308:1: ( rule__XServer__Group__4__Impl rule__XServer__Group__5 )
            // InternalXtextImpl.g:1309:2: rule__XServer__Group__4__Impl rule__XServer__Group__5
            {
            pushFollow(FOLLOW_17);
            rule__XServer__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__XServer__Group__5();

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
    // $ANTLR end "rule__XServer__Group__4"


    // $ANTLR start "rule__XServer__Group__4__Impl"
    // InternalXtextImpl.g:1316:1: rule__XServer__Group__4__Impl : ( ( rule__XServer__MaxSlotsAssignment_4 ) ) ;
    public final void rule__XServer__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXtextImpl.g:1320:1: ( ( ( rule__XServer__MaxSlotsAssignment_4 ) ) )
            // InternalXtextImpl.g:1321:1: ( ( rule__XServer__MaxSlotsAssignment_4 ) )
            {
            // InternalXtextImpl.g:1321:1: ( ( rule__XServer__MaxSlotsAssignment_4 ) )
            // InternalXtextImpl.g:1322:2: ( rule__XServer__MaxSlotsAssignment_4 )
            {
             before(grammarAccess.getXServerAccess().getMaxSlotsAssignment_4()); 
            // InternalXtextImpl.g:1323:2: ( rule__XServer__MaxSlotsAssignment_4 )
            // InternalXtextImpl.g:1323:3: rule__XServer__MaxSlotsAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__XServer__MaxSlotsAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getXServerAccess().getMaxSlotsAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XServer__Group__4__Impl"


    // $ANTLR start "rule__XServer__Group__5"
    // InternalXtextImpl.g:1331:1: rule__XServer__Group__5 : rule__XServer__Group__5__Impl rule__XServer__Group__6 ;
    public final void rule__XServer__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXtextImpl.g:1335:1: ( rule__XServer__Group__5__Impl rule__XServer__Group__6 )
            // InternalXtextImpl.g:1336:2: rule__XServer__Group__5__Impl rule__XServer__Group__6
            {
            pushFollow(FOLLOW_10);
            rule__XServer__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__XServer__Group__6();

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
    // $ANTLR end "rule__XServer__Group__5"


    // $ANTLR start "rule__XServer__Group__5__Impl"
    // InternalXtextImpl.g:1343:1: rule__XServer__Group__5__Impl : ( 'MTBF' ) ;
    public final void rule__XServer__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXtextImpl.g:1347:1: ( ( 'MTBF' ) )
            // InternalXtextImpl.g:1348:1: ( 'MTBF' )
            {
            // InternalXtextImpl.g:1348:1: ( 'MTBF' )
            // InternalXtextImpl.g:1349:2: 'MTBF'
            {
             before(grammarAccess.getXServerAccess().getMTBFKeyword_5()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getXServerAccess().getMTBFKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XServer__Group__5__Impl"


    // $ANTLR start "rule__XServer__Group__6"
    // InternalXtextImpl.g:1358:1: rule__XServer__Group__6 : rule__XServer__Group__6__Impl rule__XServer__Group__7 ;
    public final void rule__XServer__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXtextImpl.g:1362:1: ( rule__XServer__Group__6__Impl rule__XServer__Group__7 )
            // InternalXtextImpl.g:1363:2: rule__XServer__Group__6__Impl rule__XServer__Group__7
            {
            pushFollow(FOLLOW_4);
            rule__XServer__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__XServer__Group__7();

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
    // $ANTLR end "rule__XServer__Group__6"


    // $ANTLR start "rule__XServer__Group__6__Impl"
    // InternalXtextImpl.g:1370:1: rule__XServer__Group__6__Impl : ( ( rule__XServer__MTBFAssignment_6 ) ) ;
    public final void rule__XServer__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXtextImpl.g:1374:1: ( ( ( rule__XServer__MTBFAssignment_6 ) ) )
            // InternalXtextImpl.g:1375:1: ( ( rule__XServer__MTBFAssignment_6 ) )
            {
            // InternalXtextImpl.g:1375:1: ( ( rule__XServer__MTBFAssignment_6 ) )
            // InternalXtextImpl.g:1376:2: ( rule__XServer__MTBFAssignment_6 )
            {
             before(grammarAccess.getXServerAccess().getMTBFAssignment_6()); 
            // InternalXtextImpl.g:1377:2: ( rule__XServer__MTBFAssignment_6 )
            // InternalXtextImpl.g:1377:3: rule__XServer__MTBFAssignment_6
            {
            pushFollow(FOLLOW_2);
            rule__XServer__MTBFAssignment_6();

            state._fsp--;


            }

             after(grammarAccess.getXServerAccess().getMTBFAssignment_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XServer__Group__6__Impl"


    // $ANTLR start "rule__XServer__Group__7"
    // InternalXtextImpl.g:1385:1: rule__XServer__Group__7 : rule__XServer__Group__7__Impl rule__XServer__Group__8 ;
    public final void rule__XServer__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXtextImpl.g:1389:1: ( rule__XServer__Group__7__Impl rule__XServer__Group__8 )
            // InternalXtextImpl.g:1390:2: rule__XServer__Group__7__Impl rule__XServer__Group__8
            {
            pushFollow(FOLLOW_18);
            rule__XServer__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__XServer__Group__8();

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
    // $ANTLR end "rule__XServer__Group__7"


    // $ANTLR start "rule__XServer__Group__7__Impl"
    // InternalXtextImpl.g:1397:1: rule__XServer__Group__7__Impl : ( ( rule__XServer__ConnectionsAssignment_7 ) ) ;
    public final void rule__XServer__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXtextImpl.g:1401:1: ( ( ( rule__XServer__ConnectionsAssignment_7 ) ) )
            // InternalXtextImpl.g:1402:1: ( ( rule__XServer__ConnectionsAssignment_7 ) )
            {
            // InternalXtextImpl.g:1402:1: ( ( rule__XServer__ConnectionsAssignment_7 ) )
            // InternalXtextImpl.g:1403:2: ( rule__XServer__ConnectionsAssignment_7 )
            {
             before(grammarAccess.getXServerAccess().getConnectionsAssignment_7()); 
            // InternalXtextImpl.g:1404:2: ( rule__XServer__ConnectionsAssignment_7 )
            // InternalXtextImpl.g:1404:3: rule__XServer__ConnectionsAssignment_7
            {
            pushFollow(FOLLOW_2);
            rule__XServer__ConnectionsAssignment_7();

            state._fsp--;


            }

             after(grammarAccess.getXServerAccess().getConnectionsAssignment_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XServer__Group__7__Impl"


    // $ANTLR start "rule__XServer__Group__8"
    // InternalXtextImpl.g:1412:1: rule__XServer__Group__8 : rule__XServer__Group__8__Impl ;
    public final void rule__XServer__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXtextImpl.g:1416:1: ( rule__XServer__Group__8__Impl )
            // InternalXtextImpl.g:1417:2: rule__XServer__Group__8__Impl
            {
            pushFollow(FOLLOW_2);
            rule__XServer__Group__8__Impl();

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
    // $ANTLR end "rule__XServer__Group__8"


    // $ANTLR start "rule__XServer__Group__8__Impl"
    // InternalXtextImpl.g:1423:1: rule__XServer__Group__8__Impl : ( '}' ) ;
    public final void rule__XServer__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXtextImpl.g:1427:1: ( ( '}' ) )
            // InternalXtextImpl.g:1428:1: ( '}' )
            {
            // InternalXtextImpl.g:1428:1: ( '}' )
            // InternalXtextImpl.g:1429:2: '}'
            {
             before(grammarAccess.getXServerAccess().getRightCurlyBracketKeyword_8()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getXServerAccess().getRightCurlyBracketKeyword_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XServer__Group__8__Impl"


    // $ANTLR start "rule__XComputer__Group__0"
    // InternalXtextImpl.g:1439:1: rule__XComputer__Group__0 : rule__XComputer__Group__0__Impl rule__XComputer__Group__1 ;
    public final void rule__XComputer__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXtextImpl.g:1443:1: ( rule__XComputer__Group__0__Impl rule__XComputer__Group__1 )
            // InternalXtextImpl.g:1444:2: rule__XComputer__Group__0__Impl rule__XComputer__Group__1
            {
            pushFollow(FOLLOW_6);
            rule__XComputer__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__XComputer__Group__1();

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
    // $ANTLR end "rule__XComputer__Group__0"


    // $ANTLR start "rule__XComputer__Group__0__Impl"
    // InternalXtextImpl.g:1451:1: rule__XComputer__Group__0__Impl : ( 'Computer' ) ;
    public final void rule__XComputer__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXtextImpl.g:1455:1: ( ( 'Computer' ) )
            // InternalXtextImpl.g:1456:1: ( 'Computer' )
            {
            // InternalXtextImpl.g:1456:1: ( 'Computer' )
            // InternalXtextImpl.g:1457:2: 'Computer'
            {
             before(grammarAccess.getXComputerAccess().getComputerKeyword_0()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getXComputerAccess().getComputerKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XComputer__Group__0__Impl"


    // $ANTLR start "rule__XComputer__Group__1"
    // InternalXtextImpl.g:1466:1: rule__XComputer__Group__1 : rule__XComputer__Group__1__Impl rule__XComputer__Group__2 ;
    public final void rule__XComputer__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXtextImpl.g:1470:1: ( rule__XComputer__Group__1__Impl rule__XComputer__Group__2 )
            // InternalXtextImpl.g:1471:2: rule__XComputer__Group__1__Impl rule__XComputer__Group__2
            {
            pushFollow(FOLLOW_15);
            rule__XComputer__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__XComputer__Group__2();

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
    // $ANTLR end "rule__XComputer__Group__1"


    // $ANTLR start "rule__XComputer__Group__1__Impl"
    // InternalXtextImpl.g:1478:1: rule__XComputer__Group__1__Impl : ( ( rule__XComputer__NameAssignment_1 ) ) ;
    public final void rule__XComputer__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXtextImpl.g:1482:1: ( ( ( rule__XComputer__NameAssignment_1 ) ) )
            // InternalXtextImpl.g:1483:1: ( ( rule__XComputer__NameAssignment_1 ) )
            {
            // InternalXtextImpl.g:1483:1: ( ( rule__XComputer__NameAssignment_1 ) )
            // InternalXtextImpl.g:1484:2: ( rule__XComputer__NameAssignment_1 )
            {
             before(grammarAccess.getXComputerAccess().getNameAssignment_1()); 
            // InternalXtextImpl.g:1485:2: ( rule__XComputer__NameAssignment_1 )
            // InternalXtextImpl.g:1485:3: rule__XComputer__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__XComputer__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getXComputerAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XComputer__Group__1__Impl"


    // $ANTLR start "rule__XComputer__Group__2"
    // InternalXtextImpl.g:1493:1: rule__XComputer__Group__2 : rule__XComputer__Group__2__Impl rule__XComputer__Group__3 ;
    public final void rule__XComputer__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXtextImpl.g:1497:1: ( rule__XComputer__Group__2__Impl rule__XComputer__Group__3 )
            // InternalXtextImpl.g:1498:2: rule__XComputer__Group__2__Impl rule__XComputer__Group__3
            {
            pushFollow(FOLLOW_4);
            rule__XComputer__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__XComputer__Group__3();

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
    // $ANTLR end "rule__XComputer__Group__2"


    // $ANTLR start "rule__XComputer__Group__2__Impl"
    // InternalXtextImpl.g:1505:1: rule__XComputer__Group__2__Impl : ( '{' ) ;
    public final void rule__XComputer__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXtextImpl.g:1509:1: ( ( '{' ) )
            // InternalXtextImpl.g:1510:1: ( '{' )
            {
            // InternalXtextImpl.g:1510:1: ( '{' )
            // InternalXtextImpl.g:1511:2: '{'
            {
             before(grammarAccess.getXComputerAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getXComputerAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XComputer__Group__2__Impl"


    // $ANTLR start "rule__XComputer__Group__3"
    // InternalXtextImpl.g:1520:1: rule__XComputer__Group__3 : rule__XComputer__Group__3__Impl rule__XComputer__Group__4 ;
    public final void rule__XComputer__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXtextImpl.g:1524:1: ( rule__XComputer__Group__3__Impl rule__XComputer__Group__4 )
            // InternalXtextImpl.g:1525:2: rule__XComputer__Group__3__Impl rule__XComputer__Group__4
            {
            pushFollow(FOLLOW_18);
            rule__XComputer__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__XComputer__Group__4();

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
    // $ANTLR end "rule__XComputer__Group__3"


    // $ANTLR start "rule__XComputer__Group__3__Impl"
    // InternalXtextImpl.g:1532:1: rule__XComputer__Group__3__Impl : ( ( rule__XComputer__ConnectionsAssignment_3 ) ) ;
    public final void rule__XComputer__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXtextImpl.g:1536:1: ( ( ( rule__XComputer__ConnectionsAssignment_3 ) ) )
            // InternalXtextImpl.g:1537:1: ( ( rule__XComputer__ConnectionsAssignment_3 ) )
            {
            // InternalXtextImpl.g:1537:1: ( ( rule__XComputer__ConnectionsAssignment_3 ) )
            // InternalXtextImpl.g:1538:2: ( rule__XComputer__ConnectionsAssignment_3 )
            {
             before(grammarAccess.getXComputerAccess().getConnectionsAssignment_3()); 
            // InternalXtextImpl.g:1539:2: ( rule__XComputer__ConnectionsAssignment_3 )
            // InternalXtextImpl.g:1539:3: rule__XComputer__ConnectionsAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__XComputer__ConnectionsAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getXComputerAccess().getConnectionsAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XComputer__Group__3__Impl"


    // $ANTLR start "rule__XComputer__Group__4"
    // InternalXtextImpl.g:1547:1: rule__XComputer__Group__4 : rule__XComputer__Group__4__Impl ;
    public final void rule__XComputer__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXtextImpl.g:1551:1: ( rule__XComputer__Group__4__Impl )
            // InternalXtextImpl.g:1552:2: rule__XComputer__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__XComputer__Group__4__Impl();

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
    // $ANTLR end "rule__XComputer__Group__4"


    // $ANTLR start "rule__XComputer__Group__4__Impl"
    // InternalXtextImpl.g:1558:1: rule__XComputer__Group__4__Impl : ( '}' ) ;
    public final void rule__XComputer__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXtextImpl.g:1562:1: ( ( '}' ) )
            // InternalXtextImpl.g:1563:1: ( '}' )
            {
            // InternalXtextImpl.g:1563:1: ( '}' )
            // InternalXtextImpl.g:1564:2: '}'
            {
             before(grammarAccess.getXComputerAccess().getRightCurlyBracketKeyword_4()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getXComputerAccess().getRightCurlyBracketKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XComputer__Group__4__Impl"


    // $ANTLR start "rule__XRouter__Group__0"
    // InternalXtextImpl.g:1574:1: rule__XRouter__Group__0 : rule__XRouter__Group__0__Impl rule__XRouter__Group__1 ;
    public final void rule__XRouter__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXtextImpl.g:1578:1: ( rule__XRouter__Group__0__Impl rule__XRouter__Group__1 )
            // InternalXtextImpl.g:1579:2: rule__XRouter__Group__0__Impl rule__XRouter__Group__1
            {
            pushFollow(FOLLOW_6);
            rule__XRouter__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__XRouter__Group__1();

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
    // $ANTLR end "rule__XRouter__Group__0"


    // $ANTLR start "rule__XRouter__Group__0__Impl"
    // InternalXtextImpl.g:1586:1: rule__XRouter__Group__0__Impl : ( 'Router' ) ;
    public final void rule__XRouter__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXtextImpl.g:1590:1: ( ( 'Router' ) )
            // InternalXtextImpl.g:1591:1: ( 'Router' )
            {
            // InternalXtextImpl.g:1591:1: ( 'Router' )
            // InternalXtextImpl.g:1592:2: 'Router'
            {
             before(grammarAccess.getXRouterAccess().getRouterKeyword_0()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getXRouterAccess().getRouterKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XRouter__Group__0__Impl"


    // $ANTLR start "rule__XRouter__Group__1"
    // InternalXtextImpl.g:1601:1: rule__XRouter__Group__1 : rule__XRouter__Group__1__Impl rule__XRouter__Group__2 ;
    public final void rule__XRouter__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXtextImpl.g:1605:1: ( rule__XRouter__Group__1__Impl rule__XRouter__Group__2 )
            // InternalXtextImpl.g:1606:2: rule__XRouter__Group__1__Impl rule__XRouter__Group__2
            {
            pushFollow(FOLLOW_15);
            rule__XRouter__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__XRouter__Group__2();

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
    // $ANTLR end "rule__XRouter__Group__1"


    // $ANTLR start "rule__XRouter__Group__1__Impl"
    // InternalXtextImpl.g:1613:1: rule__XRouter__Group__1__Impl : ( ( rule__XRouter__NameAssignment_1 ) ) ;
    public final void rule__XRouter__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXtextImpl.g:1617:1: ( ( ( rule__XRouter__NameAssignment_1 ) ) )
            // InternalXtextImpl.g:1618:1: ( ( rule__XRouter__NameAssignment_1 ) )
            {
            // InternalXtextImpl.g:1618:1: ( ( rule__XRouter__NameAssignment_1 ) )
            // InternalXtextImpl.g:1619:2: ( rule__XRouter__NameAssignment_1 )
            {
             before(grammarAccess.getXRouterAccess().getNameAssignment_1()); 
            // InternalXtextImpl.g:1620:2: ( rule__XRouter__NameAssignment_1 )
            // InternalXtextImpl.g:1620:3: rule__XRouter__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__XRouter__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getXRouterAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XRouter__Group__1__Impl"


    // $ANTLR start "rule__XRouter__Group__2"
    // InternalXtextImpl.g:1628:1: rule__XRouter__Group__2 : rule__XRouter__Group__2__Impl rule__XRouter__Group__3 ;
    public final void rule__XRouter__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXtextImpl.g:1632:1: ( rule__XRouter__Group__2__Impl rule__XRouter__Group__3 )
            // InternalXtextImpl.g:1633:2: rule__XRouter__Group__2__Impl rule__XRouter__Group__3
            {
            pushFollow(FOLLOW_19);
            rule__XRouter__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__XRouter__Group__3();

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
    // $ANTLR end "rule__XRouter__Group__2"


    // $ANTLR start "rule__XRouter__Group__2__Impl"
    // InternalXtextImpl.g:1640:1: rule__XRouter__Group__2__Impl : ( '{' ) ;
    public final void rule__XRouter__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXtextImpl.g:1644:1: ( ( '{' ) )
            // InternalXtextImpl.g:1645:1: ( '{' )
            {
            // InternalXtextImpl.g:1645:1: ( '{' )
            // InternalXtextImpl.g:1646:2: '{'
            {
             before(grammarAccess.getXRouterAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getXRouterAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XRouter__Group__2__Impl"


    // $ANTLR start "rule__XRouter__Group__3"
    // InternalXtextImpl.g:1655:1: rule__XRouter__Group__3 : rule__XRouter__Group__3__Impl rule__XRouter__Group__4 ;
    public final void rule__XRouter__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXtextImpl.g:1659:1: ( rule__XRouter__Group__3__Impl rule__XRouter__Group__4 )
            // InternalXtextImpl.g:1660:2: rule__XRouter__Group__3__Impl rule__XRouter__Group__4
            {
            pushFollow(FOLLOW_10);
            rule__XRouter__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__XRouter__Group__4();

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
    // $ANTLR end "rule__XRouter__Group__3"


    // $ANTLR start "rule__XRouter__Group__3__Impl"
    // InternalXtextImpl.g:1667:1: rule__XRouter__Group__3__Impl : ( 'maxSpeed' ) ;
    public final void rule__XRouter__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXtextImpl.g:1671:1: ( ( 'maxSpeed' ) )
            // InternalXtextImpl.g:1672:1: ( 'maxSpeed' )
            {
            // InternalXtextImpl.g:1672:1: ( 'maxSpeed' )
            // InternalXtextImpl.g:1673:2: 'maxSpeed'
            {
             before(grammarAccess.getXRouterAccess().getMaxSpeedKeyword_3()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getXRouterAccess().getMaxSpeedKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XRouter__Group__3__Impl"


    // $ANTLR start "rule__XRouter__Group__4"
    // InternalXtextImpl.g:1682:1: rule__XRouter__Group__4 : rule__XRouter__Group__4__Impl rule__XRouter__Group__5 ;
    public final void rule__XRouter__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXtextImpl.g:1686:1: ( rule__XRouter__Group__4__Impl rule__XRouter__Group__5 )
            // InternalXtextImpl.g:1687:2: rule__XRouter__Group__4__Impl rule__XRouter__Group__5
            {
            pushFollow(FOLLOW_4);
            rule__XRouter__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__XRouter__Group__5();

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
    // $ANTLR end "rule__XRouter__Group__4"


    // $ANTLR start "rule__XRouter__Group__4__Impl"
    // InternalXtextImpl.g:1694:1: rule__XRouter__Group__4__Impl : ( ( rule__XRouter__MaxSpeedAssignment_4 ) ) ;
    public final void rule__XRouter__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXtextImpl.g:1698:1: ( ( ( rule__XRouter__MaxSpeedAssignment_4 ) ) )
            // InternalXtextImpl.g:1699:1: ( ( rule__XRouter__MaxSpeedAssignment_4 ) )
            {
            // InternalXtextImpl.g:1699:1: ( ( rule__XRouter__MaxSpeedAssignment_4 ) )
            // InternalXtextImpl.g:1700:2: ( rule__XRouter__MaxSpeedAssignment_4 )
            {
             before(grammarAccess.getXRouterAccess().getMaxSpeedAssignment_4()); 
            // InternalXtextImpl.g:1701:2: ( rule__XRouter__MaxSpeedAssignment_4 )
            // InternalXtextImpl.g:1701:3: rule__XRouter__MaxSpeedAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__XRouter__MaxSpeedAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getXRouterAccess().getMaxSpeedAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XRouter__Group__4__Impl"


    // $ANTLR start "rule__XRouter__Group__5"
    // InternalXtextImpl.g:1709:1: rule__XRouter__Group__5 : rule__XRouter__Group__5__Impl rule__XRouter__Group__6 ;
    public final void rule__XRouter__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXtextImpl.g:1713:1: ( rule__XRouter__Group__5__Impl rule__XRouter__Group__6 )
            // InternalXtextImpl.g:1714:2: rule__XRouter__Group__5__Impl rule__XRouter__Group__6
            {
            pushFollow(FOLLOW_18);
            rule__XRouter__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__XRouter__Group__6();

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
    // $ANTLR end "rule__XRouter__Group__5"


    // $ANTLR start "rule__XRouter__Group__5__Impl"
    // InternalXtextImpl.g:1721:1: rule__XRouter__Group__5__Impl : ( ( rule__XRouter__ConnectionsAssignment_5 ) ) ;
    public final void rule__XRouter__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXtextImpl.g:1725:1: ( ( ( rule__XRouter__ConnectionsAssignment_5 ) ) )
            // InternalXtextImpl.g:1726:1: ( ( rule__XRouter__ConnectionsAssignment_5 ) )
            {
            // InternalXtextImpl.g:1726:1: ( ( rule__XRouter__ConnectionsAssignment_5 ) )
            // InternalXtextImpl.g:1727:2: ( rule__XRouter__ConnectionsAssignment_5 )
            {
             before(grammarAccess.getXRouterAccess().getConnectionsAssignment_5()); 
            // InternalXtextImpl.g:1728:2: ( rule__XRouter__ConnectionsAssignment_5 )
            // InternalXtextImpl.g:1728:3: rule__XRouter__ConnectionsAssignment_5
            {
            pushFollow(FOLLOW_2);
            rule__XRouter__ConnectionsAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getXRouterAccess().getConnectionsAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XRouter__Group__5__Impl"


    // $ANTLR start "rule__XRouter__Group__6"
    // InternalXtextImpl.g:1736:1: rule__XRouter__Group__6 : rule__XRouter__Group__6__Impl ;
    public final void rule__XRouter__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXtextImpl.g:1740:1: ( rule__XRouter__Group__6__Impl )
            // InternalXtextImpl.g:1741:2: rule__XRouter__Group__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__XRouter__Group__6__Impl();

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
    // $ANTLR end "rule__XRouter__Group__6"


    // $ANTLR start "rule__XRouter__Group__6__Impl"
    // InternalXtextImpl.g:1747:1: rule__XRouter__Group__6__Impl : ( '}' ) ;
    public final void rule__XRouter__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXtextImpl.g:1751:1: ( ( '}' ) )
            // InternalXtextImpl.g:1752:1: ( '}' )
            {
            // InternalXtextImpl.g:1752:1: ( '}' )
            // InternalXtextImpl.g:1753:2: '}'
            {
             before(grammarAccess.getXRouterAccess().getRightCurlyBracketKeyword_6()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getXRouterAccess().getRightCurlyBracketKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XRouter__Group__6__Impl"


    // $ANTLR start "rule__XCopperCable__Group__0"
    // InternalXtextImpl.g:1763:1: rule__XCopperCable__Group__0 : rule__XCopperCable__Group__0__Impl rule__XCopperCable__Group__1 ;
    public final void rule__XCopperCable__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXtextImpl.g:1767:1: ( rule__XCopperCable__Group__0__Impl rule__XCopperCable__Group__1 )
            // InternalXtextImpl.g:1768:2: rule__XCopperCable__Group__0__Impl rule__XCopperCable__Group__1
            {
            pushFollow(FOLLOW_6);
            rule__XCopperCable__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__XCopperCable__Group__1();

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
    // $ANTLR end "rule__XCopperCable__Group__0"


    // $ANTLR start "rule__XCopperCable__Group__0__Impl"
    // InternalXtextImpl.g:1775:1: rule__XCopperCable__Group__0__Impl : ( 'CopperCable' ) ;
    public final void rule__XCopperCable__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXtextImpl.g:1779:1: ( ( 'CopperCable' ) )
            // InternalXtextImpl.g:1780:1: ( 'CopperCable' )
            {
            // InternalXtextImpl.g:1780:1: ( 'CopperCable' )
            // InternalXtextImpl.g:1781:2: 'CopperCable'
            {
             before(grammarAccess.getXCopperCableAccess().getCopperCableKeyword_0()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getXCopperCableAccess().getCopperCableKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XCopperCable__Group__0__Impl"


    // $ANTLR start "rule__XCopperCable__Group__1"
    // InternalXtextImpl.g:1790:1: rule__XCopperCable__Group__1 : rule__XCopperCable__Group__1__Impl rule__XCopperCable__Group__2 ;
    public final void rule__XCopperCable__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXtextImpl.g:1794:1: ( rule__XCopperCable__Group__1__Impl rule__XCopperCable__Group__2 )
            // InternalXtextImpl.g:1795:2: rule__XCopperCable__Group__1__Impl rule__XCopperCable__Group__2
            {
            pushFollow(FOLLOW_15);
            rule__XCopperCable__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__XCopperCable__Group__2();

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
    // $ANTLR end "rule__XCopperCable__Group__1"


    // $ANTLR start "rule__XCopperCable__Group__1__Impl"
    // InternalXtextImpl.g:1802:1: rule__XCopperCable__Group__1__Impl : ( ( rule__XCopperCable__NameAssignment_1 ) ) ;
    public final void rule__XCopperCable__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXtextImpl.g:1806:1: ( ( ( rule__XCopperCable__NameAssignment_1 ) ) )
            // InternalXtextImpl.g:1807:1: ( ( rule__XCopperCable__NameAssignment_1 ) )
            {
            // InternalXtextImpl.g:1807:1: ( ( rule__XCopperCable__NameAssignment_1 ) )
            // InternalXtextImpl.g:1808:2: ( rule__XCopperCable__NameAssignment_1 )
            {
             before(grammarAccess.getXCopperCableAccess().getNameAssignment_1()); 
            // InternalXtextImpl.g:1809:2: ( rule__XCopperCable__NameAssignment_1 )
            // InternalXtextImpl.g:1809:3: rule__XCopperCable__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__XCopperCable__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getXCopperCableAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XCopperCable__Group__1__Impl"


    // $ANTLR start "rule__XCopperCable__Group__2"
    // InternalXtextImpl.g:1817:1: rule__XCopperCable__Group__2 : rule__XCopperCable__Group__2__Impl rule__XCopperCable__Group__3 ;
    public final void rule__XCopperCable__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXtextImpl.g:1821:1: ( rule__XCopperCable__Group__2__Impl rule__XCopperCable__Group__3 )
            // InternalXtextImpl.g:1822:2: rule__XCopperCable__Group__2__Impl rule__XCopperCable__Group__3
            {
            pushFollow(FOLLOW_9);
            rule__XCopperCable__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__XCopperCable__Group__3();

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
    // $ANTLR end "rule__XCopperCable__Group__2"


    // $ANTLR start "rule__XCopperCable__Group__2__Impl"
    // InternalXtextImpl.g:1829:1: rule__XCopperCable__Group__2__Impl : ( '{' ) ;
    public final void rule__XCopperCable__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXtextImpl.g:1833:1: ( ( '{' ) )
            // InternalXtextImpl.g:1834:1: ( '{' )
            {
            // InternalXtextImpl.g:1834:1: ( '{' )
            // InternalXtextImpl.g:1835:2: '{'
            {
             before(grammarAccess.getXCopperCableAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getXCopperCableAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XCopperCable__Group__2__Impl"


    // $ANTLR start "rule__XCopperCable__Group__3"
    // InternalXtextImpl.g:1844:1: rule__XCopperCable__Group__3 : rule__XCopperCable__Group__3__Impl rule__XCopperCable__Group__4 ;
    public final void rule__XCopperCable__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXtextImpl.g:1848:1: ( rule__XCopperCable__Group__3__Impl rule__XCopperCable__Group__4 )
            // InternalXtextImpl.g:1849:2: rule__XCopperCable__Group__3__Impl rule__XCopperCable__Group__4
            {
            pushFollow(FOLLOW_18);
            rule__XCopperCable__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__XCopperCable__Group__4();

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
    // $ANTLR end "rule__XCopperCable__Group__3"


    // $ANTLR start "rule__XCopperCable__Group__3__Impl"
    // InternalXtextImpl.g:1856:1: rule__XCopperCable__Group__3__Impl : ( ( rule__XCopperCable__CableAttributesAssignment_3 ) ) ;
    public final void rule__XCopperCable__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXtextImpl.g:1860:1: ( ( ( rule__XCopperCable__CableAttributesAssignment_3 ) ) )
            // InternalXtextImpl.g:1861:1: ( ( rule__XCopperCable__CableAttributesAssignment_3 ) )
            {
            // InternalXtextImpl.g:1861:1: ( ( rule__XCopperCable__CableAttributesAssignment_3 ) )
            // InternalXtextImpl.g:1862:2: ( rule__XCopperCable__CableAttributesAssignment_3 )
            {
             before(grammarAccess.getXCopperCableAccess().getCableAttributesAssignment_3()); 
            // InternalXtextImpl.g:1863:2: ( rule__XCopperCable__CableAttributesAssignment_3 )
            // InternalXtextImpl.g:1863:3: rule__XCopperCable__CableAttributesAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__XCopperCable__CableAttributesAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getXCopperCableAccess().getCableAttributesAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XCopperCable__Group__3__Impl"


    // $ANTLR start "rule__XCopperCable__Group__4"
    // InternalXtextImpl.g:1871:1: rule__XCopperCable__Group__4 : rule__XCopperCable__Group__4__Impl ;
    public final void rule__XCopperCable__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXtextImpl.g:1875:1: ( rule__XCopperCable__Group__4__Impl )
            // InternalXtextImpl.g:1876:2: rule__XCopperCable__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__XCopperCable__Group__4__Impl();

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
    // $ANTLR end "rule__XCopperCable__Group__4"


    // $ANTLR start "rule__XCopperCable__Group__4__Impl"
    // InternalXtextImpl.g:1882:1: rule__XCopperCable__Group__4__Impl : ( '}' ) ;
    public final void rule__XCopperCable__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXtextImpl.g:1886:1: ( ( '}' ) )
            // InternalXtextImpl.g:1887:1: ( '}' )
            {
            // InternalXtextImpl.g:1887:1: ( '}' )
            // InternalXtextImpl.g:1888:2: '}'
            {
             before(grammarAccess.getXCopperCableAccess().getRightCurlyBracketKeyword_4()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getXCopperCableAccess().getRightCurlyBracketKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XCopperCable__Group__4__Impl"


    // $ANTLR start "rule__XGlassFiberCable__Group__0"
    // InternalXtextImpl.g:1898:1: rule__XGlassFiberCable__Group__0 : rule__XGlassFiberCable__Group__0__Impl rule__XGlassFiberCable__Group__1 ;
    public final void rule__XGlassFiberCable__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXtextImpl.g:1902:1: ( rule__XGlassFiberCable__Group__0__Impl rule__XGlassFiberCable__Group__1 )
            // InternalXtextImpl.g:1903:2: rule__XGlassFiberCable__Group__0__Impl rule__XGlassFiberCable__Group__1
            {
            pushFollow(FOLLOW_6);
            rule__XGlassFiberCable__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__XGlassFiberCable__Group__1();

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
    // $ANTLR end "rule__XGlassFiberCable__Group__0"


    // $ANTLR start "rule__XGlassFiberCable__Group__0__Impl"
    // InternalXtextImpl.g:1910:1: rule__XGlassFiberCable__Group__0__Impl : ( 'GlassFiberCable' ) ;
    public final void rule__XGlassFiberCable__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXtextImpl.g:1914:1: ( ( 'GlassFiberCable' ) )
            // InternalXtextImpl.g:1915:1: ( 'GlassFiberCable' )
            {
            // InternalXtextImpl.g:1915:1: ( 'GlassFiberCable' )
            // InternalXtextImpl.g:1916:2: 'GlassFiberCable'
            {
             before(grammarAccess.getXGlassFiberCableAccess().getGlassFiberCableKeyword_0()); 
            match(input,31,FOLLOW_2); 
             after(grammarAccess.getXGlassFiberCableAccess().getGlassFiberCableKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XGlassFiberCable__Group__0__Impl"


    // $ANTLR start "rule__XGlassFiberCable__Group__1"
    // InternalXtextImpl.g:1925:1: rule__XGlassFiberCable__Group__1 : rule__XGlassFiberCable__Group__1__Impl rule__XGlassFiberCable__Group__2 ;
    public final void rule__XGlassFiberCable__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXtextImpl.g:1929:1: ( rule__XGlassFiberCable__Group__1__Impl rule__XGlassFiberCable__Group__2 )
            // InternalXtextImpl.g:1930:2: rule__XGlassFiberCable__Group__1__Impl rule__XGlassFiberCable__Group__2
            {
            pushFollow(FOLLOW_15);
            rule__XGlassFiberCable__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__XGlassFiberCable__Group__2();

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
    // $ANTLR end "rule__XGlassFiberCable__Group__1"


    // $ANTLR start "rule__XGlassFiberCable__Group__1__Impl"
    // InternalXtextImpl.g:1937:1: rule__XGlassFiberCable__Group__1__Impl : ( ( rule__XGlassFiberCable__NameAssignment_1 ) ) ;
    public final void rule__XGlassFiberCable__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXtextImpl.g:1941:1: ( ( ( rule__XGlassFiberCable__NameAssignment_1 ) ) )
            // InternalXtextImpl.g:1942:1: ( ( rule__XGlassFiberCable__NameAssignment_1 ) )
            {
            // InternalXtextImpl.g:1942:1: ( ( rule__XGlassFiberCable__NameAssignment_1 ) )
            // InternalXtextImpl.g:1943:2: ( rule__XGlassFiberCable__NameAssignment_1 )
            {
             before(grammarAccess.getXGlassFiberCableAccess().getNameAssignment_1()); 
            // InternalXtextImpl.g:1944:2: ( rule__XGlassFiberCable__NameAssignment_1 )
            // InternalXtextImpl.g:1944:3: rule__XGlassFiberCable__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__XGlassFiberCable__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getXGlassFiberCableAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XGlassFiberCable__Group__1__Impl"


    // $ANTLR start "rule__XGlassFiberCable__Group__2"
    // InternalXtextImpl.g:1952:1: rule__XGlassFiberCable__Group__2 : rule__XGlassFiberCable__Group__2__Impl rule__XGlassFiberCable__Group__3 ;
    public final void rule__XGlassFiberCable__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXtextImpl.g:1956:1: ( rule__XGlassFiberCable__Group__2__Impl rule__XGlassFiberCable__Group__3 )
            // InternalXtextImpl.g:1957:2: rule__XGlassFiberCable__Group__2__Impl rule__XGlassFiberCable__Group__3
            {
            pushFollow(FOLLOW_9);
            rule__XGlassFiberCable__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__XGlassFiberCable__Group__3();

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
    // $ANTLR end "rule__XGlassFiberCable__Group__2"


    // $ANTLR start "rule__XGlassFiberCable__Group__2__Impl"
    // InternalXtextImpl.g:1964:1: rule__XGlassFiberCable__Group__2__Impl : ( '{' ) ;
    public final void rule__XGlassFiberCable__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXtextImpl.g:1968:1: ( ( '{' ) )
            // InternalXtextImpl.g:1969:1: ( '{' )
            {
            // InternalXtextImpl.g:1969:1: ( '{' )
            // InternalXtextImpl.g:1970:2: '{'
            {
             before(grammarAccess.getXGlassFiberCableAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getXGlassFiberCableAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XGlassFiberCable__Group__2__Impl"


    // $ANTLR start "rule__XGlassFiberCable__Group__3"
    // InternalXtextImpl.g:1979:1: rule__XGlassFiberCable__Group__3 : rule__XGlassFiberCable__Group__3__Impl rule__XGlassFiberCable__Group__4 ;
    public final void rule__XGlassFiberCable__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXtextImpl.g:1983:1: ( rule__XGlassFiberCable__Group__3__Impl rule__XGlassFiberCable__Group__4 )
            // InternalXtextImpl.g:1984:2: rule__XGlassFiberCable__Group__3__Impl rule__XGlassFiberCable__Group__4
            {
            pushFollow(FOLLOW_18);
            rule__XGlassFiberCable__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__XGlassFiberCable__Group__4();

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
    // $ANTLR end "rule__XGlassFiberCable__Group__3"


    // $ANTLR start "rule__XGlassFiberCable__Group__3__Impl"
    // InternalXtextImpl.g:1991:1: rule__XGlassFiberCable__Group__3__Impl : ( ( rule__XGlassFiberCable__CableAttributesAssignment_3 ) ) ;
    public final void rule__XGlassFiberCable__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXtextImpl.g:1995:1: ( ( ( rule__XGlassFiberCable__CableAttributesAssignment_3 ) ) )
            // InternalXtextImpl.g:1996:1: ( ( rule__XGlassFiberCable__CableAttributesAssignment_3 ) )
            {
            // InternalXtextImpl.g:1996:1: ( ( rule__XGlassFiberCable__CableAttributesAssignment_3 ) )
            // InternalXtextImpl.g:1997:2: ( rule__XGlassFiberCable__CableAttributesAssignment_3 )
            {
             before(grammarAccess.getXGlassFiberCableAccess().getCableAttributesAssignment_3()); 
            // InternalXtextImpl.g:1998:2: ( rule__XGlassFiberCable__CableAttributesAssignment_3 )
            // InternalXtextImpl.g:1998:3: rule__XGlassFiberCable__CableAttributesAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__XGlassFiberCable__CableAttributesAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getXGlassFiberCableAccess().getCableAttributesAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XGlassFiberCable__Group__3__Impl"


    // $ANTLR start "rule__XGlassFiberCable__Group__4"
    // InternalXtextImpl.g:2006:1: rule__XGlassFiberCable__Group__4 : rule__XGlassFiberCable__Group__4__Impl ;
    public final void rule__XGlassFiberCable__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXtextImpl.g:2010:1: ( rule__XGlassFiberCable__Group__4__Impl )
            // InternalXtextImpl.g:2011:2: rule__XGlassFiberCable__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__XGlassFiberCable__Group__4__Impl();

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
    // $ANTLR end "rule__XGlassFiberCable__Group__4"


    // $ANTLR start "rule__XGlassFiberCable__Group__4__Impl"
    // InternalXtextImpl.g:2017:1: rule__XGlassFiberCable__Group__4__Impl : ( '}' ) ;
    public final void rule__XGlassFiberCable__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXtextImpl.g:2021:1: ( ( '}' ) )
            // InternalXtextImpl.g:2022:1: ( '}' )
            {
            // InternalXtextImpl.g:2022:1: ( '}' )
            // InternalXtextImpl.g:2023:2: '}'
            {
             before(grammarAccess.getXGlassFiberCableAccess().getRightCurlyBracketKeyword_4()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getXGlassFiberCableAccess().getRightCurlyBracketKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XGlassFiberCable__Group__4__Impl"


    // $ANTLR start "rule__XContainer__ElementsAssignment"
    // InternalXtextImpl.g:2033:1: rule__XContainer__ElementsAssignment : ( ruleNetworkElement ) ;
    public final void rule__XContainer__ElementsAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXtextImpl.g:2037:1: ( ( ruleNetworkElement ) )
            // InternalXtextImpl.g:2038:2: ( ruleNetworkElement )
            {
            // InternalXtextImpl.g:2038:2: ( ruleNetworkElement )
            // InternalXtextImpl.g:2039:3: ruleNetworkElement
            {
             before(grammarAccess.getXContainerAccess().getElementsNetworkElementParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleNetworkElement();

            state._fsp--;

             after(grammarAccess.getXContainerAccess().getElementsNetworkElementParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XContainer__ElementsAssignment"


    // $ANTLR start "rule__Connections__IncomingAssignment_1_2"
    // InternalXtextImpl.g:2048:1: rule__Connections__IncomingAssignment_1_2 : ( ( RULE_ID ) ) ;
    public final void rule__Connections__IncomingAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXtextImpl.g:2052:1: ( ( ( RULE_ID ) ) )
            // InternalXtextImpl.g:2053:2: ( ( RULE_ID ) )
            {
            // InternalXtextImpl.g:2053:2: ( ( RULE_ID ) )
            // InternalXtextImpl.g:2054:3: ( RULE_ID )
            {
             before(grammarAccess.getConnectionsAccess().getIncomingXCableCrossReference_1_2_0()); 
            // InternalXtextImpl.g:2055:3: ( RULE_ID )
            // InternalXtextImpl.g:2056:4: RULE_ID
            {
             before(grammarAccess.getConnectionsAccess().getIncomingXCableIDTerminalRuleCall_1_2_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getConnectionsAccess().getIncomingXCableIDTerminalRuleCall_1_2_0_1()); 

            }

             after(grammarAccess.getConnectionsAccess().getIncomingXCableCrossReference_1_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Connections__IncomingAssignment_1_2"


    // $ANTLR start "rule__Connections__IncomingAssignment_1_3_1"
    // InternalXtextImpl.g:2067:1: rule__Connections__IncomingAssignment_1_3_1 : ( ( RULE_ID ) ) ;
    public final void rule__Connections__IncomingAssignment_1_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXtextImpl.g:2071:1: ( ( ( RULE_ID ) ) )
            // InternalXtextImpl.g:2072:2: ( ( RULE_ID ) )
            {
            // InternalXtextImpl.g:2072:2: ( ( RULE_ID ) )
            // InternalXtextImpl.g:2073:3: ( RULE_ID )
            {
             before(grammarAccess.getConnectionsAccess().getIncomingXCableCrossReference_1_3_1_0()); 
            // InternalXtextImpl.g:2074:3: ( RULE_ID )
            // InternalXtextImpl.g:2075:4: RULE_ID
            {
             before(grammarAccess.getConnectionsAccess().getIncomingXCableIDTerminalRuleCall_1_3_1_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getConnectionsAccess().getIncomingXCableIDTerminalRuleCall_1_3_1_0_1()); 

            }

             after(grammarAccess.getConnectionsAccess().getIncomingXCableCrossReference_1_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Connections__IncomingAssignment_1_3_1"


    // $ANTLR start "rule__Connections__OutgoingAssignment_2_2"
    // InternalXtextImpl.g:2086:1: rule__Connections__OutgoingAssignment_2_2 : ( ( RULE_ID ) ) ;
    public final void rule__Connections__OutgoingAssignment_2_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXtextImpl.g:2090:1: ( ( ( RULE_ID ) ) )
            // InternalXtextImpl.g:2091:2: ( ( RULE_ID ) )
            {
            // InternalXtextImpl.g:2091:2: ( ( RULE_ID ) )
            // InternalXtextImpl.g:2092:3: ( RULE_ID )
            {
             before(grammarAccess.getConnectionsAccess().getOutgoingXCableCrossReference_2_2_0()); 
            // InternalXtextImpl.g:2093:3: ( RULE_ID )
            // InternalXtextImpl.g:2094:4: RULE_ID
            {
             before(grammarAccess.getConnectionsAccess().getOutgoingXCableIDTerminalRuleCall_2_2_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getConnectionsAccess().getOutgoingXCableIDTerminalRuleCall_2_2_0_1()); 

            }

             after(grammarAccess.getConnectionsAccess().getOutgoingXCableCrossReference_2_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Connections__OutgoingAssignment_2_2"


    // $ANTLR start "rule__Connections__OutgoingAssignment_2_3_1"
    // InternalXtextImpl.g:2105:1: rule__Connections__OutgoingAssignment_2_3_1 : ( ( RULE_ID ) ) ;
    public final void rule__Connections__OutgoingAssignment_2_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXtextImpl.g:2109:1: ( ( ( RULE_ID ) ) )
            // InternalXtextImpl.g:2110:2: ( ( RULE_ID ) )
            {
            // InternalXtextImpl.g:2110:2: ( ( RULE_ID ) )
            // InternalXtextImpl.g:2111:3: ( RULE_ID )
            {
             before(grammarAccess.getConnectionsAccess().getOutgoingXCableCrossReference_2_3_1_0()); 
            // InternalXtextImpl.g:2112:3: ( RULE_ID )
            // InternalXtextImpl.g:2113:4: RULE_ID
            {
             before(grammarAccess.getConnectionsAccess().getOutgoingXCableIDTerminalRuleCall_2_3_1_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getConnectionsAccess().getOutgoingXCableIDTerminalRuleCall_2_3_1_0_1()); 

            }

             after(grammarAccess.getConnectionsAccess().getOutgoingXCableCrossReference_2_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Connections__OutgoingAssignment_2_3_1"


    // $ANTLR start "rule__CableAttributes__SpeedAssignment_2"
    // InternalXtextImpl.g:2124:1: rule__CableAttributes__SpeedAssignment_2 : ( ruleEBigInteger ) ;
    public final void rule__CableAttributes__SpeedAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXtextImpl.g:2128:1: ( ( ruleEBigInteger ) )
            // InternalXtextImpl.g:2129:2: ( ruleEBigInteger )
            {
            // InternalXtextImpl.g:2129:2: ( ruleEBigInteger )
            // InternalXtextImpl.g:2130:3: ruleEBigInteger
            {
             before(grammarAccess.getCableAttributesAccess().getSpeedEBigIntegerParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleEBigInteger();

            state._fsp--;

             after(grammarAccess.getCableAttributesAccess().getSpeedEBigIntegerParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CableAttributes__SpeedAssignment_2"


    // $ANTLR start "rule__CableAttributes__EndPoint1Assignment_4"
    // InternalXtextImpl.g:2139:1: rule__CableAttributes__EndPoint1Assignment_4 : ( ( RULE_ID ) ) ;
    public final void rule__CableAttributes__EndPoint1Assignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXtextImpl.g:2143:1: ( ( ( RULE_ID ) ) )
            // InternalXtextImpl.g:2144:2: ( ( RULE_ID ) )
            {
            // InternalXtextImpl.g:2144:2: ( ( RULE_ID ) )
            // InternalXtextImpl.g:2145:3: ( RULE_ID )
            {
             before(grammarAccess.getCableAttributesAccess().getEndPoint1XDeviceCrossReference_4_0()); 
            // InternalXtextImpl.g:2146:3: ( RULE_ID )
            // InternalXtextImpl.g:2147:4: RULE_ID
            {
             before(grammarAccess.getCableAttributesAccess().getEndPoint1XDeviceIDTerminalRuleCall_4_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getCableAttributesAccess().getEndPoint1XDeviceIDTerminalRuleCall_4_0_1()); 

            }

             after(grammarAccess.getCableAttributesAccess().getEndPoint1XDeviceCrossReference_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CableAttributes__EndPoint1Assignment_4"


    // $ANTLR start "rule__CableAttributes__EndPoint2Assignment_6"
    // InternalXtextImpl.g:2158:1: rule__CableAttributes__EndPoint2Assignment_6 : ( ( RULE_ID ) ) ;
    public final void rule__CableAttributes__EndPoint2Assignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXtextImpl.g:2162:1: ( ( ( RULE_ID ) ) )
            // InternalXtextImpl.g:2163:2: ( ( RULE_ID ) )
            {
            // InternalXtextImpl.g:2163:2: ( ( RULE_ID ) )
            // InternalXtextImpl.g:2164:3: ( RULE_ID )
            {
             before(grammarAccess.getCableAttributesAccess().getEndPoint2XDeviceCrossReference_6_0()); 
            // InternalXtextImpl.g:2165:3: ( RULE_ID )
            // InternalXtextImpl.g:2166:4: RULE_ID
            {
             before(grammarAccess.getCableAttributesAccess().getEndPoint2XDeviceIDTerminalRuleCall_6_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getCableAttributesAccess().getEndPoint2XDeviceIDTerminalRuleCall_6_0_1()); 

            }

             after(grammarAccess.getCableAttributesAccess().getEndPoint2XDeviceCrossReference_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CableAttributes__EndPoint2Assignment_6"


    // $ANTLR start "rule__CableAttributes__IsDuplexAssignment_7_1"
    // InternalXtextImpl.g:2177:1: rule__CableAttributes__IsDuplexAssignment_7_1 : ( rulebool ) ;
    public final void rule__CableAttributes__IsDuplexAssignment_7_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXtextImpl.g:2181:1: ( ( rulebool ) )
            // InternalXtextImpl.g:2182:2: ( rulebool )
            {
            // InternalXtextImpl.g:2182:2: ( rulebool )
            // InternalXtextImpl.g:2183:3: rulebool
            {
             before(grammarAccess.getCableAttributesAccess().getIsDuplexBoolParserRuleCall_7_1_0()); 
            pushFollow(FOLLOW_2);
            rulebool();

            state._fsp--;

             after(grammarAccess.getCableAttributesAccess().getIsDuplexBoolParserRuleCall_7_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CableAttributes__IsDuplexAssignment_7_1"


    // $ANTLR start "rule__XServer__NameAssignment_1"
    // InternalXtextImpl.g:2192:1: rule__XServer__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__XServer__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXtextImpl.g:2196:1: ( ( RULE_ID ) )
            // InternalXtextImpl.g:2197:2: ( RULE_ID )
            {
            // InternalXtextImpl.g:2197:2: ( RULE_ID )
            // InternalXtextImpl.g:2198:3: RULE_ID
            {
             before(grammarAccess.getXServerAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getXServerAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XServer__NameAssignment_1"


    // $ANTLR start "rule__XServer__MaxSlotsAssignment_4"
    // InternalXtextImpl.g:2207:1: rule__XServer__MaxSlotsAssignment_4 : ( ruleEBigInteger ) ;
    public final void rule__XServer__MaxSlotsAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXtextImpl.g:2211:1: ( ( ruleEBigInteger ) )
            // InternalXtextImpl.g:2212:2: ( ruleEBigInteger )
            {
            // InternalXtextImpl.g:2212:2: ( ruleEBigInteger )
            // InternalXtextImpl.g:2213:3: ruleEBigInteger
            {
             before(grammarAccess.getXServerAccess().getMaxSlotsEBigIntegerParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleEBigInteger();

            state._fsp--;

             after(grammarAccess.getXServerAccess().getMaxSlotsEBigIntegerParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XServer__MaxSlotsAssignment_4"


    // $ANTLR start "rule__XServer__MTBFAssignment_6"
    // InternalXtextImpl.g:2222:1: rule__XServer__MTBFAssignment_6 : ( ruleEBigInteger ) ;
    public final void rule__XServer__MTBFAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXtextImpl.g:2226:1: ( ( ruleEBigInteger ) )
            // InternalXtextImpl.g:2227:2: ( ruleEBigInteger )
            {
            // InternalXtextImpl.g:2227:2: ( ruleEBigInteger )
            // InternalXtextImpl.g:2228:3: ruleEBigInteger
            {
             before(grammarAccess.getXServerAccess().getMTBFEBigIntegerParserRuleCall_6_0()); 
            pushFollow(FOLLOW_2);
            ruleEBigInteger();

            state._fsp--;

             after(grammarAccess.getXServerAccess().getMTBFEBigIntegerParserRuleCall_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XServer__MTBFAssignment_6"


    // $ANTLR start "rule__XServer__ConnectionsAssignment_7"
    // InternalXtextImpl.g:2237:1: rule__XServer__ConnectionsAssignment_7 : ( ruleConnections ) ;
    public final void rule__XServer__ConnectionsAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXtextImpl.g:2241:1: ( ( ruleConnections ) )
            // InternalXtextImpl.g:2242:2: ( ruleConnections )
            {
            // InternalXtextImpl.g:2242:2: ( ruleConnections )
            // InternalXtextImpl.g:2243:3: ruleConnections
            {
             before(grammarAccess.getXServerAccess().getConnectionsConnectionsParserRuleCall_7_0()); 
            pushFollow(FOLLOW_2);
            ruleConnections();

            state._fsp--;

             after(grammarAccess.getXServerAccess().getConnectionsConnectionsParserRuleCall_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XServer__ConnectionsAssignment_7"


    // $ANTLR start "rule__XComputer__NameAssignment_1"
    // InternalXtextImpl.g:2252:1: rule__XComputer__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__XComputer__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXtextImpl.g:2256:1: ( ( RULE_ID ) )
            // InternalXtextImpl.g:2257:2: ( RULE_ID )
            {
            // InternalXtextImpl.g:2257:2: ( RULE_ID )
            // InternalXtextImpl.g:2258:3: RULE_ID
            {
             before(grammarAccess.getXComputerAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getXComputerAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XComputer__NameAssignment_1"


    // $ANTLR start "rule__XComputer__ConnectionsAssignment_3"
    // InternalXtextImpl.g:2267:1: rule__XComputer__ConnectionsAssignment_3 : ( ruleConnections ) ;
    public final void rule__XComputer__ConnectionsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXtextImpl.g:2271:1: ( ( ruleConnections ) )
            // InternalXtextImpl.g:2272:2: ( ruleConnections )
            {
            // InternalXtextImpl.g:2272:2: ( ruleConnections )
            // InternalXtextImpl.g:2273:3: ruleConnections
            {
             before(grammarAccess.getXComputerAccess().getConnectionsConnectionsParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleConnections();

            state._fsp--;

             after(grammarAccess.getXComputerAccess().getConnectionsConnectionsParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XComputer__ConnectionsAssignment_3"


    // $ANTLR start "rule__XRouter__NameAssignment_1"
    // InternalXtextImpl.g:2282:1: rule__XRouter__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__XRouter__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXtextImpl.g:2286:1: ( ( RULE_ID ) )
            // InternalXtextImpl.g:2287:2: ( RULE_ID )
            {
            // InternalXtextImpl.g:2287:2: ( RULE_ID )
            // InternalXtextImpl.g:2288:3: RULE_ID
            {
             before(grammarAccess.getXRouterAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getXRouterAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XRouter__NameAssignment_1"


    // $ANTLR start "rule__XRouter__MaxSpeedAssignment_4"
    // InternalXtextImpl.g:2297:1: rule__XRouter__MaxSpeedAssignment_4 : ( ruleEBigInteger ) ;
    public final void rule__XRouter__MaxSpeedAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXtextImpl.g:2301:1: ( ( ruleEBigInteger ) )
            // InternalXtextImpl.g:2302:2: ( ruleEBigInteger )
            {
            // InternalXtextImpl.g:2302:2: ( ruleEBigInteger )
            // InternalXtextImpl.g:2303:3: ruleEBigInteger
            {
             before(grammarAccess.getXRouterAccess().getMaxSpeedEBigIntegerParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleEBigInteger();

            state._fsp--;

             after(grammarAccess.getXRouterAccess().getMaxSpeedEBigIntegerParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XRouter__MaxSpeedAssignment_4"


    // $ANTLR start "rule__XRouter__ConnectionsAssignment_5"
    // InternalXtextImpl.g:2312:1: rule__XRouter__ConnectionsAssignment_5 : ( ruleConnections ) ;
    public final void rule__XRouter__ConnectionsAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXtextImpl.g:2316:1: ( ( ruleConnections ) )
            // InternalXtextImpl.g:2317:2: ( ruleConnections )
            {
            // InternalXtextImpl.g:2317:2: ( ruleConnections )
            // InternalXtextImpl.g:2318:3: ruleConnections
            {
             before(grammarAccess.getXRouterAccess().getConnectionsConnectionsParserRuleCall_5_0()); 
            pushFollow(FOLLOW_2);
            ruleConnections();

            state._fsp--;

             after(grammarAccess.getXRouterAccess().getConnectionsConnectionsParserRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XRouter__ConnectionsAssignment_5"


    // $ANTLR start "rule__XCopperCable__NameAssignment_1"
    // InternalXtextImpl.g:2327:1: rule__XCopperCable__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__XCopperCable__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXtextImpl.g:2331:1: ( ( RULE_ID ) )
            // InternalXtextImpl.g:2332:2: ( RULE_ID )
            {
            // InternalXtextImpl.g:2332:2: ( RULE_ID )
            // InternalXtextImpl.g:2333:3: RULE_ID
            {
             before(grammarAccess.getXCopperCableAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getXCopperCableAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XCopperCable__NameAssignment_1"


    // $ANTLR start "rule__XCopperCable__CableAttributesAssignment_3"
    // InternalXtextImpl.g:2342:1: rule__XCopperCable__CableAttributesAssignment_3 : ( ruleCableAttributes ) ;
    public final void rule__XCopperCable__CableAttributesAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXtextImpl.g:2346:1: ( ( ruleCableAttributes ) )
            // InternalXtextImpl.g:2347:2: ( ruleCableAttributes )
            {
            // InternalXtextImpl.g:2347:2: ( ruleCableAttributes )
            // InternalXtextImpl.g:2348:3: ruleCableAttributes
            {
             before(grammarAccess.getXCopperCableAccess().getCableAttributesCableAttributesParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleCableAttributes();

            state._fsp--;

             after(grammarAccess.getXCopperCableAccess().getCableAttributesCableAttributesParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XCopperCable__CableAttributesAssignment_3"


    // $ANTLR start "rule__XGlassFiberCable__NameAssignment_1"
    // InternalXtextImpl.g:2357:1: rule__XGlassFiberCable__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__XGlassFiberCable__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXtextImpl.g:2361:1: ( ( RULE_ID ) )
            // InternalXtextImpl.g:2362:2: ( RULE_ID )
            {
            // InternalXtextImpl.g:2362:2: ( RULE_ID )
            // InternalXtextImpl.g:2363:3: RULE_ID
            {
             before(grammarAccess.getXGlassFiberCableAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getXGlassFiberCableAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XGlassFiberCable__NameAssignment_1"


    // $ANTLR start "rule__XGlassFiberCable__CableAttributesAssignment_3"
    // InternalXtextImpl.g:2372:1: rule__XGlassFiberCable__CableAttributesAssignment_3 : ( ruleCableAttributes ) ;
    public final void rule__XGlassFiberCable__CableAttributesAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXtextImpl.g:2376:1: ( ( ruleCableAttributes ) )
            // InternalXtextImpl.g:2377:2: ( ruleCableAttributes )
            {
            // InternalXtextImpl.g:2377:2: ( ruleCableAttributes )
            // InternalXtextImpl.g:2378:3: ruleCableAttributes
            {
             before(grammarAccess.getXGlassFiberCableAccess().getCableAttributesCableAttributesParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleCableAttributes();

            state._fsp--;

             after(grammarAccess.getXGlassFiberCableAccess().getCableAttributesCableAttributesParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XGlassFiberCable__CableAttributesAssignment_3"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x00000000D8400002L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000022000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000018000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000010002L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000001800L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000020000000L});

}