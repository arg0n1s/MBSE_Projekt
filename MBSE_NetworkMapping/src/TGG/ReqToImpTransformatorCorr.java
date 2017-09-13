package TGG;

import java.io.File;

import org.apache.log4j.BasicConfigurator;
import org.moflon.tgg.algorithm.synchronization.SynchronizationHelper;

import ReqToImpTransformator.ReqToImpTransformatorPackage;
import ReqToImpTransformator.org.moflon.tie.CustomILPObjectiveProvider;

public class ReqToImpTransformatorCorr extends SynchronizationHelper {
	private final static String osName = System.getProperty("os.name").replaceAll("\\s","");

	public ReqToImpTransformatorCorr() {
		super(ReqToImpTransformatorPackage.eINSTANCE, getPackagePath());
	}
	
	public static String getPackagePath(){
		String[] prop = System.getProperty("java.class.path").split(":");
        String path = "";
        for(String s : prop){
        	if(s.contains("ReqToImpTransformator")){
        		path = s;
        		break;
        	}
        	
        }
        if(ReqToImpTransformatorCorr.osName.contains("Windows")){
        	String[] pathSplit = path.split("\\");
        	StringBuilder sb = new StringBuilder();
        	for(String ps : pathSplit){
        		if(ps.contains("ReqToImpTransformator")){
        			sb.append(ps);
        			break;
        		}else{
        			sb.append(ps+"\\");
        		}
        	}
        	path = sb.toString();
        }else{
        	String[] pathSplit = path.split("/");
        	StringBuilder sb = new StringBuilder();
        	for(String ps : pathSplit){
        		if(ps.contains("ReqToImpTransformator")){
        			sb.append(ps);
        			break;
        		}else{
        			sb.append(ps+"/");
        		}
        	}
        	path = sb.toString();
        }
        return path;
	}
	
	public static void runCorrelation(File srcPath, File trgPath) throws Exception{
		// Set up logging
        BasicConfigurator.configure();
        ReqToImpTransformatorCorr helper = new ReqToImpTransformatorCorr();
        
        helper.loadSrc("Models/"+srcPath.getName());
		helper.loadTrg("Models/"+trgPath.getName());

		helper.setUserDefiendILPConstraintProvider(new CorrILPConstraintProvider());
		helper.setUserDefiendILPObjectiveProvider(new CustomILPObjectiveProvider());
		helper.createCorrespondences(true);
		
		//src and trg models are modified when preparing deltas.
		//save all files in a separate location
		String srcName = srcPath.getName().substring(0, srcPath.getName().length()-4);
		String trgName = trgPath.getName().substring(0, trgPath.getName().length()-4);
		helper.saveSrc("Correlations/"+srcName+"-"+trgName+"-req.xmi");
		helper.saveTrg("Correlations/"+srcName+"-"+trgName+"-impl.xmi");
		helper.saveCorr("Correlations/"+srcName+"-"+trgName+"-corr.xmi");
		helper.saveConsistencyCheckProtocol("Correlations/"+srcName+"-"+trgName+"-protocol.xmi");
	}

}
