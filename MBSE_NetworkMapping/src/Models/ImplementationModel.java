package Models;

import java.io.File;
import java.util.HashMap;
import java.util.LinkedList;

import DotGraph.GraphViz;

public class ImplementationModel extends Model {

	public ImplementationModel(File file) throws Exception{
		super(file);
		parseModel();
		buildDotGraph();
	}

	@Override
	protected void parseModel() {
		vertices = new HashMap<Integer,String>();
		edges = new LinkedList<int[]>();
		String text = fileToText(file);
		String[] splits = text.split("<");
		int deviceCounter = 0;
		for(String s : splits){
			if(s.contains("devices xsi:type")){
				String name = "";
				String[] devSplits = s.split(" ");
				for(String s1 : devSplits){
					if(s1.length()>0){
						if(s1.contains("xsi:type=\"impl:Router\"")){
							name+="Router_";
						}else if(s1.contains("xsi:type=\"impl:Server\"")){
							name+="Server_";
						}else if(s1.contains("xsi:type=\"impl:Computer\"")){
							name+="Computer_";
						}else if(s1.contains("name=\"")){
							String[] nameSplit = s1.split("\"");
							for(String s2 : nameSplit){
								if(!s2.contains("name=")){
									if(s2.contains("/>")){
										name+=s2.substring(0,s2.length()-2);
									}else{
										name+=s2;
									}
								}
							}
						}
					}
					
				}
				vertices.put(deviceCounter, name);
				deviceCounter++;
				
			}
			else if(s.contains("cables xsi:type")){
				if(!s.contains("source=")){
					continue;
				}
				String[] sourceSplit = s.split("source=");
				String sp = sourceSplit[1];
					String[] targetSplit = sp.split("target=");
					String src = targetSplit[0];
					String trg = targetSplit[1];
					String[] remPrefix = src.split("@devices.");
					String[] remPostfix = remPrefix[1].split("\"");
					int srcID = Integer.parseInt(remPostfix[0]);
					remPrefix = trg.split("@devices.");
					remPostfix = remPrefix[1].split("\"");
					int trgID = Integer.parseInt(remPostfix[0]);
					int[] edge = {srcID, trgID};
					edges.add(edge);
			}
		}

	}
	
	protected void buildDotGraph(){
		dotGraph = new GraphViz();
		dotGraph.addln(dotGraph.start_graph());
		for(int[] edge : edges){
			dotGraph.addln(vertices.get(edge[0])+" -> "+vertices.get(edge[1])+";");
		}
		dotGraph.addln(dotGraph.end_graph());
		
	}

	@Override
	public boolean isInstanceOf(String instance) {
		return instance.equals("ImplementationModel");
	}

}
