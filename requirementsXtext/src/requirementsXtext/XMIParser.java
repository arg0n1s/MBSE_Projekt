package requirementsXtext;

import java.io.IOException;
import java.net.URL;

import org.eclipse.core.runtime.FileLocator;
import org.eclipse.core.runtime.Path;
import org.eclipse.core.runtime.Platform;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.resource.XtextResourceSet;
import org.osgi.framework.Bundle;

import com.google.inject.Injector;


public final class XMIParser {

	public static void makeXMI(Resource xtextResource, String xTextprojectPath) {
		Injector injector =  new ReqXtextStandaloneSetup().createInjectorAndDoEMFRegistration();
		XtextResourceSet resourceSet = injector.getInstance(XtextResourceSet.class);
		resourceSet.addLoadOption(XtextResource.OPTION_RESOLVE_ALL, Boolean.TRUE);
		EcoreUtil.resolveAll(xtextResource);
		URI uri = xtextResource.getURI().trimFileExtension();
		uri = uri.appendFileExtension("xmi");
		Resource xmiResource = resourceSet.createResource(uri);
		xmiResource.getContents().add(xtextResource.getContents().get(0));
		try {
			xmiResource.save(null);
		} catch (IOException e) {
			e.printStackTrace();
		}
		Bundle bundle = Platform.getBundle("RequirementsTransformator");
		URL trafoProjectURL = FileLocator.find(bundle, new Path(""), null);
		
		Bundle MappingBundle = Platform.getBundle("MBSE_NetworkMapping");
		URL mappingProjectURL = FileLocator.find(MappingBundle, new Path(""), null);
		
		try {
			
			String trafoProjectPath = FileLocator.resolve(trafoProjectURL).getPath();
			String mappingProjectPath = FileLocator.resolve(mappingProjectURL).getPath();
			
			TGGTranslation trafo = new TGGTranslation(trafoProjectPath);
			
			trafo.performForward(uri, mappingProjectPath, uri.trimFileExtension().lastSegment());
			
		} catch (IOException e) {
			System.out.println("Plug-In RequirementsTransformator or MBSE_NetworkMapping not found!");
			e.printStackTrace();
		}
		
		/*try {
			MainWindow window = new MainWindow();
			window.open();
		} catch (Exception e) {
			e.printStackTrace();
		}*/
		
	}
}
