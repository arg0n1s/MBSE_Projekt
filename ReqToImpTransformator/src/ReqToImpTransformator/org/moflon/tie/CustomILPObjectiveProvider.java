package ReqToImpTransformator.org.moflon.tie;

import java.util.HashMap;
import java.util.Map;

import org.moflon.tgg.algorithm.ccutils.UserDefinedILPObjective;
import org.moflon.tgg.algorithm.ccutils.UserDefinedILPObjectiveProvider;
import org.moflon.tgg.algorithm.datastructures.ConsistencyCheckPrecedenceGraph;
import org.moflon.tgg.runtime.CCMatch;

import implementation.Router;
import implementation.Server;

public class CustomILPObjectiveProvider implements UserDefinedILPObjectiveProvider {
	@Override
	public UserDefinedILPObjective getUserDefinedObjective(ConsistencyCheckPrecedenceGraph protocol) {
		Map<Integer, Double> idsToCoefficients = new HashMap<>();
		
		HashMap<String, Integer> routers = new HashMap<String, Integer>();
		
		for (int matchId : protocol.getMatchIDs().toArray()) {
			CCMatch match = protocol.intToMatch(matchId);
			if(match.getRuleName().equals("VirtualNodeToRouterRule2")){
				Router r = (Router)match.getTargetMatch().getNodeMappings().get("router2");
				if(routers.containsKey(r.getName())){
					int count = routers.get(r.getName()) + 1;
					routers.replace(r.getName(), count);
				}else{
					routers.put(r.getName(), 1);
				}
			}
		}
		
		for (int matchId : protocol.getMatchIDs().toArray()) {
			CCMatch match = protocol.intToMatch(matchId);
			Double weight = 0.0;
			if(match.getRuleName().equals("VirtualNodeToRouterRule2")){
				Router r = (Router)match.getTargetMatch().getNodeMappings().get("router2");
				weight = (double)routers.get(r.getName());
				weight *= -0.0001;
				
			}else if(match.getRuleName().equals("VirtualNodeToComputerRule")|| 
					match.getRuleName().equals("VirtualNodeToServerRule")){
				weight = 0.0;
			}else if(match.getRuleName().equals("ReqProviderToServerRule")){
				Server s = (Server)match.getTargetMatch().getNodeMappings().get("implDevice");
				weight = s.getMTBF().doubleValue();
				weight += match.getTargetMatch().getCreatedHashSet().size();
				weight += match.getSourceMatch().getCreatedHashSet().size();
			}
			else{
				weight = (double) match.getSourceMatch().getCreatedHashSet().size();
				weight += match.getTargetMatch().getCreatedHashSet().size();
			}
			idsToCoefficients.put(matchId, weight);
			
		}
		return new UserDefinedILPObjective(idsToCoefficients, UserDefinedILPObjective.OptGoal.MAX);
	}
}