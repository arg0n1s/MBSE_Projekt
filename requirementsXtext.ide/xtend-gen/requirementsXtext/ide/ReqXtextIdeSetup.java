/**
 * generated by Xtext 2.11.0
 */
package requirementsXtext.ide;

import com.google.inject.Guice;
import com.google.inject.Injector;
import org.eclipse.xtext.util.Modules2;
import requirementsXtext.ReqXtextRuntimeModule;
import requirementsXtext.ReqXtextStandaloneSetup;
import requirementsXtext.ide.ReqXtextIdeModule;

/**
 * Initialization support for running Xtext languages as language servers.
 */
@SuppressWarnings("all")
public class ReqXtextIdeSetup extends ReqXtextStandaloneSetup {
  @Override
  public Injector createInjector() {
    ReqXtextRuntimeModule _reqXtextRuntimeModule = new ReqXtextRuntimeModule();
    ReqXtextIdeModule _reqXtextIdeModule = new ReqXtextIdeModule();
    return Guice.createInjector(Modules2.mixin(_reqXtextRuntimeModule, _reqXtextIdeModule));
  }
}