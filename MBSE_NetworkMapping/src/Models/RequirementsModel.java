package Models;

import java.io.File;
import java.util.HashMap;
import java.util.LinkedList;

import DotGraph.GraphViz;

public class RequirementsModel extends Model {

	public RequirementsModel(File file) throws Exception {
		super(file);
		parseModel();
		buildDotGraph();
	}

	@Override
	protected void parseModel() throws Exception {
		vertices = new HashMap<Integer,String>();
		edges = new LinkedList<int[]>();
		String text = fileToText(file);
		String[] splits = text.split("<");
		int agentsCounter = 0;
		
		for(String s : splits){
			if(s.contains("agents xsi:type")){
				String name = "";
				String[] devSplits = s.split(" ");
				for(String s1 : devSplits){
					if(s1.length()>0){
						if(s1.contains("xsi:type=\"req:Provider\"")){
							name+="Provider_";
						}else if(s1.contains("xsi:type=\"req:Consumer\"")){
							name+="Consumer_";
						}else if(s1.contains("name=\"")){
							String[] nameSplits = s1.split("\"");
							name+=nameSplits[1];
						}
					}
					
				}
				vertices.put(agentsCounter, name);
				agentsCounter++;
				
			}
		}
			

	}

	@Override
	protected void buildDotGraph() {
		dotGraph = new GraphViz();
		dotGraph.addln(dotGraph.start_graph());
		for(String s : vertices.values()){
			dotGraph.addln(s+";");
		}
		dotGraph.addln(dotGraph.end_graph());
		
	}

	@Override
	public boolean isInstanceOf(String instance) {
		return instance.equals("RequirementsModel");
	}

}
