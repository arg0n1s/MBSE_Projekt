/*
 * generated by Xtext 2.11.0
 */
package requirementsXtext.ui;

import com.google.inject.Injector;
import org.eclipse.xtext.ui.guice.AbstractGuiceAwareExecutableExtensionFactory;
import org.osgi.framework.Bundle;
import requirementsXtext.ui.internal.RequirementsXtextActivator;

/**
 * This class was generated. Customizations should only happen in a newly
 * introduced subclass. 
 */
public class ReqXtextExecutableExtensionFactory extends AbstractGuiceAwareExecutableExtensionFactory {

	@Override
	protected Bundle getBundle() {
		return RequirementsXtextActivator.getInstance().getBundle();
	}
	
	@Override
	protected Injector getInjector() {
		return RequirementsXtextActivator.getInstance().getInjector(RequirementsXtextActivator.REQUIREMENTSXTEXT_REQXTEXT);
	}
	
}
