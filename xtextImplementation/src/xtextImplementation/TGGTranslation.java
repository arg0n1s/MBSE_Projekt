package xtextImplementation;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.moflon.tgg.algorithm.synchronization.SynchronizationHelper;

import ImplementationTransformator.ImplementationTransformatorPackage;

public class TGGTranslation extends SynchronizationHelper {
	public TGGTranslation(String projectPath)
	   {
	      super(ImplementationTransformatorPackage.eINSTANCE, projectPath);
	   }
	
	public void performForward(URI xmiSrcURI, String dstPath, String resultName) {
		Resource r = this.getResourceSet().getResource(xmiSrcURI, true);
		setSrc(r.getContents().get(0));
		performForward(dstPath, resultName);
	}
	
	public void performForward(String dstPath, String resultName) {
		integrateForward();
		saveTrg(dstPath + "Models/"+resultName+".xmi");
		//saveCorr(dstPath + "Logs/"+resultName+".corr.xmi");
		//saveSynchronizationProtocol(dstPath + "Logs/"+resultName+".protocol.xmi");

		System.out.println("Completed forward transformation!");
	}
}
