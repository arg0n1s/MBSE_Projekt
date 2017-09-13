package Models;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FilenameFilter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.util.AbstractMap;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;


public class ModelLoader {
	
	public static final String TYPE_IMPL = "implementation";
	public static final String TYPE_REQ = "requirements";
	public static final String TYPE_CORR = "correlation";
	public static final String TYPE_PROT = "protocol";
	
	private HashMap<String, AbstractMap.SimpleEntry<String, File>> modelFiles;
	private HashMap<String, Model> models;
	
	public ModelLoader(){
		modelFiles = new HashMap<String, AbstractMap.SimpleEntry<String, File>>();
		models = new HashMap<String, Model>();
	}
	
	public void loadModelFilesDefaultPath(){
		modelFiles = new HashMap<String, AbstractMap.SimpleEntry<String, File>>();
		// load basic models
        File dirToOpen = null;
        try {
        	dirToOpen = new File("Models");
        } catch (IllegalArgumentException iae) {
            System.out.println("File Not Found");
        }
        File[] l = dirToOpen.listFiles(new FilenameFilter() {
			
			@Override
			public boolean accept(File dir, String name) {
				return name.contains(".xmi");
			}
		});
        for(File c : l){
        	modelFiles.put(c.getName(), new AbstractMap.SimpleEntry<String, File>(getFileType(c),c));
        }
        // load correlation + models
        try {
        	dirToOpen = new File("Correlations");
        } catch (IllegalArgumentException iae) {
            System.out.println("File Not Found");
        }
        File[] l2 = dirToOpen.listFiles(new FilenameFilter() {
			
			@Override
			public boolean accept(File dir, String name) {
				return name.contains(".xmi");
			}
		});
        for(File c : l2){
        	modelFiles.put(c.getName(), new AbstractMap.SimpleEntry<String, File>(getFileType(c),c));
        }
	}
	
	private String getFileType(File file){
		String type = "";
		FileInputStream fis;
		try {
			fis = new FileInputStream(file);
			BufferedReader reader = new BufferedReader(new InputStreamReader(fis, "UTF-8"));
			String line = null;
			while((line = reader.readLine()) != null){
				if(line.contains("xmlns:impl=\"platform:/plugin/mbse_metamodels/model/implementation.ecore\"")){
					type = TYPE_IMPL;
					break;
				}else if(line.contains("xmlns:req=\"platform:/plugin/mbse_metamodels/model/requirements.ecore\"")){
					type = TYPE_REQ;
					break;
				}else if(line.contains("org.moflon.tgg.runtime:CorrespondenceModel xmi:version=\"2.0\"")){
					type = TYPE_CORR;
					break;
				}else if(line.contains("org.moflon.tgg.runtime:PrecedenceStructure xmi:version=\"2.0\"")){
					type = TYPE_PROT;
					break;
				}
			}
			reader.close();
		} catch (FileNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return type;
	}
	
	public Model getModel(String filename) throws Exception{
		if(!modelFiles.containsKey(filename)){
			loadModelFilesDefaultPath();
		}
		if(!modelFiles.containsKey(filename)){
			throw new FileNotFoundException("File for "+filename+"-Model could not be found!");
		}
		if(models.containsKey(filename)){
			return models.get(filename);
		}else{
			loadModel(filename);
			return models.get(filename);
		}
	}
	
	public void loadModel(String filename) throws Exception{
		String type = modelFiles.get(filename).getKey();
		File file = modelFiles.get(filename).getValue();
		
		if(type.equals(TYPE_IMPL)){
				models.put(file.getName(), new ImplementationModel(file));
		}else if(type.equals(TYPE_REQ)){
				models.put(file.getName(), new RequirementsModel(file));
		}else if(type.equals(TYPE_CORR)){
			String corrName = file.getName();
			corrName = corrName.substring(0, corrName.length()-9);
			String protocolFileName = corrName+"-protocol.xmi";
			File protocol = null;
			if(modelFiles.containsKey(protocolFileName)){
				protocol = modelFiles.get(protocolFileName).getValue();
			}else{
				throw new FileNotFoundException("Protocol for "+corrName+"-Model could not be found!");
			}
        	String[] reqImplNames = corrName.split("-");
        	String req = reqImplNames[0]+".xmi";
        	String impl = reqImplNames[1]+".xmi";
        	String reqMapped = corrName+"-req.xmi";
        	String implMapped = corrName+"-impl.xmi";
        	Model reqModel = getModel(req);
        	Model implModel = getModel(impl);
        	Model reqMappedModel = getModel(reqMapped);
        	Model implMappedModel = getModel(implMapped);
        	models.put(file.getName(), new CorrelationModel(file, protocol, implModel, reqModel, implMappedModel, reqMappedModel));
		}
	}
	
	public File getModelPNGFile(String model) throws Exception{
		File file = File.createTempFile("MBSE_NetworkMapping_modelPNG", ".temp", null);
		Model current = getModel(model);
		current.dotGraph.writeGraphToFile(current.getDotGraph(), file);
		return file;
	}
	
	public FileInputStream getModelPNGFileInputStream(String model) throws Exception{
			File file = getModelPNGFile(model);
			FileInputStream fis = new FileInputStream(file);
			return fis;
	}
	
	public Set<String> getModelNames(){
		Set<String> filteredNames = new HashSet<String>();
		for(String model : modelFiles.keySet()){
			String type = modelFiles.get(model).getKey();
			if(!type.equals(TYPE_PROT) && !model.contains("-req") && !model.contains("-impl")){
				filteredNames.add(model);
			}
		}
		return filteredNames;
	}
	
	public File getModelFile(String filename){
		return modelFiles.get(filename).getValue();
	}
	
	public void saveModelToPNG(String model) throws Exception{
		String filename = model;
		filename = filename.substring(0, filename.length()-4)+".png";
		if(modelFiles.get(model).getKey().equals(TYPE_CORR)){
			filename = "Correlations Images/"+filename;
		}else{
			filename = "Models Images/"+filename;
		}
		models.get(model).writeGraphToFile(filename);
	}
	
	public void saveModelToSVG(String model) throws Exception{
		String filename = model;
		filename = filename.substring(0, filename.length()-4)+".svg";
		if(modelFiles.get(model).getKey().equals(TYPE_CORR)){
			filename = "Correlations Images/"+filename;
		}else{
			filename = "Models Images/"+filename;
		}
		models.get(model).writeGraphToSVG(filename);
	}
	
}
