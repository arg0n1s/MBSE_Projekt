/*
 * generated by Xtext 2.10.0
 */
package requirementsXtext


/**
 * Initialization support for running Xtext languages without Equinox extension registry.
 */
class ReqXtextStandaloneSetup extends ReqXtextStandaloneSetupGenerated {

	def static void doSetup() {
		new ReqXtextStandaloneSetup().createInjectorAndDoEMFRegistration()
	}
}
