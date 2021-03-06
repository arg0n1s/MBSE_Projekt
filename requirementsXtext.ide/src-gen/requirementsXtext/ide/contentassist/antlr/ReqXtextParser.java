/*
 * generated by Xtext 2.11.0
 */
package requirementsXtext.ide.contentassist.antlr;

import com.google.inject.Inject;
import java.util.HashMap;
import java.util.Map;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.ide.editor.contentassist.antlr.AbstractContentAssistParser;
import requirementsXtext.ide.contentassist.antlr.internal.InternalReqXtextParser;
import requirementsXtext.services.ReqXtextGrammarAccess;

public class ReqXtextParser extends AbstractContentAssistParser {

	@Inject
	private ReqXtextGrammarAccess grammarAccess;

	private Map<AbstractElement, String> nameMappings;

	@Override
	protected InternalReqXtextParser createParser() {
		InternalReqXtextParser result = new InternalReqXtextParser(null);
		result.setGrammarAccess(grammarAccess);
		return result;
	}

	@Override
	protected String getRuleName(AbstractElement element) {
		if (nameMappings == null) {
			nameMappings = new HashMap<AbstractElement, String>() {
				private static final long serialVersionUID = 1L;
				{
					put(grammarAccess.getXAgentAccess().getAlternatives(), "rule__XAgent__Alternatives");
					put(grammarAccess.getXProviderAccess().getGroup(), "rule__XProvider__Group__0");
					put(grammarAccess.getXConsumerAccess().getGroup(), "rule__XConsumer__Group__0");
					put(grammarAccess.getXContainerAccess().getAgentsAssignment(), "rule__XContainer__AgentsAssignment");
					put(grammarAccess.getXProviderAccess().getNameAssignment_1(), "rule__XProvider__NameAssignment_1");
					put(grammarAccess.getXProviderAccess().getSpeedAssignment_4(), "rule__XProvider__SpeedAssignment_4");
					put(grammarAccess.getXConsumerAccess().getNameAssignment_1(), "rule__XConsumer__NameAssignment_1");
					put(grammarAccess.getXConsumerAccess().getSpeedAssignment_4(), "rule__XConsumer__SpeedAssignment_4");
				}
			};
		}
		return nameMappings.get(element);
	}
			
	@Override
	protected String[] getInitialHiddenTokens() {
		return new String[] { "RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT" };
	}

	public ReqXtextGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(ReqXtextGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}
