/*
 * generated by Xtext 2.11.0
 */
package requirementsXtext.parser.antlr;

import com.google.inject.Inject;
import org.eclipse.xtext.parser.antlr.AbstractAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import requirementsXtext.parser.antlr.internal.InternalReqXtextParser;
import requirementsXtext.services.ReqXtextGrammarAccess;

public class ReqXtextParser extends AbstractAntlrParser {

	@Inject
	private ReqXtextGrammarAccess grammarAccess;

	@Override
	protected void setInitialHiddenTokens(XtextTokenStream tokenStream) {
		tokenStream.setInitialHiddenTokens("RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT");
	}
	

	@Override
	protected InternalReqXtextParser createParser(XtextTokenStream stream) {
		return new InternalReqXtextParser(stream, getGrammarAccess());
	}

	@Override 
	protected String getDefaultRuleName() {
		return "XContainer";
	}

	public ReqXtextGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(ReqXtextGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}
