/**
 * generated by Xtext 2.12.0
 */
package xtextImplementation;

import xtextImplementation.XtextImplStandaloneSetupGenerated;

/**
 * Initialization support for running Xtext languages without Equinox extension registry.
 */
@SuppressWarnings("all")
public class XtextImplStandaloneSetup extends XtextImplStandaloneSetupGenerated {
  public static void doSetup() {
    new XtextImplStandaloneSetup().createInjectorAndDoEMFRegistration();
  }
}
