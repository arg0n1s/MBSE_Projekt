package Models;

import java.io.File;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;

import DotGraph.GraphViz;


public class CorrelationModel extends Model {
	
	private File protocol;
	private ImplementationModel implModel;
	private RequirementsModel reqModel;
	private ImplementationModel implModelMapped;
	private RequirementsModel reqModelMapped;
	// inter model edges, first value is requirements vertex, second value is implementation index
	private List<int[]> interEdges;
	// edges mapping out a path
	private List<int[]> pathEdges;
	// key is index in correlation model, value is index in input model
	private HashMap<Integer, Integer> deviceMapping;
	private HashMap<Integer, Integer> agentMapping;

	public CorrelationModel(File correlation, File protocol, Model implModel, Model reqModel, Model implModelMapped, Model reqModelMapped) throws Exception {
		super(correlation);
		this.protocol = protocol;
		this.reqModel = (RequirementsModel)reqModel;
		this.implModel = (ImplementationModel)implModel;
		this.implModelMapped = (ImplementationModel)implModelMapped;
		this.reqModelMapped = (RequirementsModel)reqModelMapped;
		findMapping();
		parseModel();
		buildDotGraph();
		
	}
	
	private void findMapping(){
		deviceMapping = new HashMap<Integer, Integer>();
		agentMapping = new HashMap<Integer, Integer>();
		for(Integer iMM : implModelMapped.getVertices().keySet()){
			for(Integer iM : implModel.getVertices().keySet()){
				if(implModelMapped.getVertices().get(iMM).equals(implModel.getVertices().get(iM))){
					deviceMapping.put(iMM, iM);
				}
			}
		}
		for(Integer iMM : reqModelMapped.getVertices().keySet()){
			for(Integer iM : reqModel.getVertices().keySet()){
				if(reqModelMapped.getVertices().get(iMM).equals(reqModel.getVertices().get(iM))){
					agentMapping.put(iMM, iM);
				}
			}
		}
		
	}

	@Override
	protected void parseModel() throws Exception {
		String corrText = fileToText(file);
		String protText = fileToText(protocol);
		vertices = new HashMap<Integer,String>();
		edges = new LinkedList<int[]>();
		interEdges = new LinkedList<int[]>();
		pathEdges = new LinkedList<int[]>();
		
		String[] splits = corrText.split("<correspondences");
		int virtualNodeCounter = 0;
		for(String s : splits){
			if(s.contains("xsi:type=\"ReqToImpTransformator:VirtualNodeTo")){
				String[] virtSplits = s.split("@devices.");
				String[] deviceSplits = virtSplits[1].split("\"");
				vertices.put(virtualNodeCounter, "VirtualNode");
				int[] edge = {virtualNodeCounter, deviceMapping.get(Integer.parseInt(deviceSplits[0]))};
				edges.add(edge);
				virtualNodeCounter++;
			}else if(s.contains("xsi:type=\"ReqToImpTransformator:ReqAgentToImplDevice\"")){
				String[] sourceSplit = s.split("source href=");
				String sp = sourceSplit[1];
					String[] targetSplit = sp.split("target href=");
					String src = targetSplit[0];
					String trg = targetSplit[1];
					String[] remPrefix = src.split("@agents.");
					String[] remPostfix = remPrefix[1].split("\"");
					int srcID = Integer.parseInt(remPostfix[0]);
					remPrefix = trg.split("@devices.");
					remPostfix = remPrefix[1].split("\"");
					int trgID = Integer.parseInt(remPostfix[0]);
					int[] edge = {agentMapping.get(srcID), deviceMapping.get(trgID)};
					interEdges.add(edge);
			}
		}
		splits = protText.split("<tripleMatches");
		for(String s : splits){
			if(s.contains("ruleName=\"VirtualNodeToRouterRule1\"")){
			}else if(s.contains("ruleName=\"VirtualNodeToRouterRule2\"")){
				String[] VNtS = s.split(" ");
				String rout1 = "";
				String rout2 = "";
				int routID1 = -1;
				int routID2 = -1;
				for(String s1 : VNtS){
					if(s1.contains("href=\""+implModelMapped.getFile().getName()+"#//@devices")){
						String[] preSplit = s1.split("xmi#//@devices.");
						String[] postSplit = preSplit[1].split("\"");
						int mappedIndex = deviceMapping.get(Integer.parseInt(postSplit[0]));
						String deviceName = implModel.getVertices().get(mappedIndex);
						if(rout1.length()<1 && deviceName.contains("Router")){
							if(!deviceName.equals(rout2) && mappedIndex >=routID1){
								rout1 = deviceName;
								routID1 = mappedIndex;
							}
						}
						if(rout2.length()<1 && deviceName.contains("Router")){
							if(!deviceName.equals(rout1) && mappedIndex >=routID2){
								rout2 = deviceName;
								routID2 = mappedIndex;
							}
						}
					}
				}
				int[] edge = {routID1, routID2};
				pathEdges.add(edge);
			}else if(s.contains("ruleName=\"VirtualNodeToServerRule\"")){
				String[] VNtS = s.split(" ");
				String serv = "";
				String rout = "";
				int servID = -1;
				int routID = -1;
				for(String s1 : VNtS){
					if(s1.contains("href=\""+implModelMapped.getFile().getName()+"#//@devices")){
						String[] preSplit = s1.split("xmi#//@devices.");
						String[] postSplit = preSplit[1].split("\"");
						int mappedIndex = deviceMapping.get(Integer.parseInt(postSplit[0]));
						String deviceName = implModel.getVertices().get(mappedIndex);
						if(serv.length()<1 && deviceName.contains("Server")){
							serv = deviceName;
							servID = mappedIndex;
						}
						if(rout.length()<1 && deviceName.contains("Router")){
							rout = deviceName;
							routID = mappedIndex;
						}
					}
				}
				int[] edge = {servID, routID};
				pathEdges.add(edge);
			}else if(s.contains("ruleName=\"VirtualNodeToComputerRule\"")){
				String[] VNtS = s.split(" ");
				String comp = "";
				String rout = "";
				int compID = -1;
				int routID = -1;
				for(String s1 : VNtS){
					if(s1.contains("href=\""+implModelMapped.getFile().getName()+"#//@devices")){
						String[] preSplit = s1.split("xmi#//@devices.");
						String[] postSplit = preSplit[1].split("\"");
						int mappedIndex = deviceMapping.get(Integer.parseInt(postSplit[0]));
						String deviceName = implModel.getVertices().get(mappedIndex);
						if(comp.length()<1 && deviceName.contains("Computer")){
							comp= deviceName;
							compID = mappedIndex;
						}
						if(rout.length()<1 && deviceName.contains("Router")){
							rout = deviceName;
							routID = mappedIndex;
						}
					}
				}
				int[] edge = {routID, compID};
				pathEdges.add(edge);
			}
			
		}
			
	}
	

	@Override
	protected void buildDotGraph() {
		dotGraph = new GraphViz();
		dotGraph.addln(dotGraph.start_graph());
		for(String s : reqModel.getVertices().values()){
			dotGraph.addln(s+"[color = \"red\"];");
		}
		for(String s : implModel.getVertices().values()){
			dotGraph.addln(s+"[color = \"blue\"];");
		}
		for(String s : vertices.values()){
			dotGraph.addln(s+"[color = \"gray\"];");
		}
		for(int[] edge : implModel.getEdges()){
			dotGraph.addln(implModel.getVertices().get(edge[0])+" -> "+implModel.getVertices().get(edge[1])+";");
		}
		for(int[] edge : edges){
			dotGraph.addln(vertices.get(edge[0])+" -> "+implModel.getVertices().get(edge[1])+"[color = \"gray\"];");
		}
		for(int[] edge : interEdges){
			dotGraph.addln(reqModel.getVertices().get(edge[0])+" -> "+implModel.getVertices().get(edge[1])+"[color = \"purple\"];");
		}
		for(int[] edge : pathEdges){
			dotGraph.addln(implModel.getVertices().get(edge[0])+" -> "+implModel.getVertices().get(edge[1])+"[color = \"green\"];");
		}
		dotGraph.addln(dotGraph.end_graph());

	}

	@Override
	public boolean isInstanceOf(String instance) {
		return instance.equals("CorrelationModel");
	}

}
