package Models;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.util.List;
import java.util.Map;
import DotGraph.GraphViz;

public abstract class Model {
	protected File file;
	protected Map<Integer,String> vertices;
	protected List<int[]> edges;
	protected GraphViz dotGraph;
	
	public Model(File file) throws Exception{
		this.file = file;
	}
	
	abstract protected void parseModel() throws Exception;
	
	protected String fileToText(File file){
		FileInputStream fis;
		BufferedReader reader;
		String text = "";
		try {
			fis = new FileInputStream(file);
			reader = new BufferedReader(new InputStreamReader(fis, "UTF-8"));
			StringBuilder sb = new StringBuilder();
			String line;
			while((line = reader.readLine()) != null){
				sb.append(line);
			};
			text = sb.toString();
			reader.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return text;
	}
	
	abstract protected void buildDotGraph();
	
	abstract public boolean isInstanceOf(String instance);
	
	public byte[] getDotGraph(){
		return dotGraph.getGraph(dotGraph.getDotSource(), "png", "dot");
	}
	public byte[] getDotGraphSVG(){
		return dotGraph.getGraph(dotGraph.getDotSource(), "svg", "dot");
	}
	
	public void writeGraphToFile(String path) throws Exception{
		dotGraph.writeGraphToFile(getDotGraph(), path);
	}
	
	public void writeGraphToSVG(String path) throws Exception{
		dotGraph.writeGraphToFile(getDotGraphSVG(), path);
	}
	
	public File getFile(){
		return file;
	}
	public Map<Integer, String> getVertices(){
		return vertices;
	}
	public List<int[]> getEdges(){
		return edges;
	}
}
