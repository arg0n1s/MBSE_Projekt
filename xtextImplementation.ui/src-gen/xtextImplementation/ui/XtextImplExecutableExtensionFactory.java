/*
 * generated by Xtext 2.11.0
 */
package xtextImplementation.ui;

import com.google.inject.Injector;
import org.eclipse.xtext.ui.guice.AbstractGuiceAwareExecutableExtensionFactory;
import org.osgi.framework.Bundle;
import xtextImplementation.ui.internal.XtextImplementationActivator;

/**
 * This class was generated. Customizations should only happen in a newly
 * introduced subclass. 
 */
public class XtextImplExecutableExtensionFactory extends AbstractGuiceAwareExecutableExtensionFactory {

	@Override
	protected Bundle getBundle() {
		return XtextImplementationActivator.getInstance().getBundle();
	}
	
	@Override
	protected Injector getInjector() {
		return XtextImplementationActivator.getInstance().getInjector(XtextImplementationActivator.XTEXTIMPLEMENTATION_XTEXTIMPL);
	}
	
}
