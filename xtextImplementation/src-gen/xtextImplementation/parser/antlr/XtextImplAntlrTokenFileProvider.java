/*
 * generated by Xtext 2.11.0
 */
package xtextImplementation.parser.antlr;

import java.io.InputStream;
import org.eclipse.xtext.parser.antlr.IAntlrTokenFileProvider;

public class XtextImplAntlrTokenFileProvider implements IAntlrTokenFileProvider {

	@Override
	public InputStream getAntlrTokenFile() {
		ClassLoader classLoader = getClass().getClassLoader();
		return classLoader.getResourceAsStream("xtextImplementation/parser/antlr/internal/InternalXtextImpl.tokens");
	}
}