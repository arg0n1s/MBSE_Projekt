package ReqToImpTransformator.org.moflon.tie;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.moflon.tgg.algorithm.ccutils.UserDefinedILPConstraint;
import org.moflon.tgg.algorithm.ccutils.UserDefinedILPConstraintProvider;
import org.moflon.tgg.algorithm.datastructures.ConsistencyCheckPrecedenceGraph;
import org.moflon.tgg.runtime.CCMatch;

import implementation.Cable;
import implementation.Computer;
import implementation.Router;
import implementation.Server;
import requirements.Consumer;
import requirements.Provider;

public class CustomILPConstraintProvider implements UserDefinedILPConstraintProvider {

	@Override
	public Collection<UserDefinedILPConstraint> getUserDefinedConstraints(ConsistencyCheckPrecedenceGraph protocol) {
		Map<CCMatch, Integer> serverMatchesMap = new HashMap<>();
		Map<CCMatch, Integer> computerMatchesMap = new HashMap<>();
		Map<CCMatch, Integer> initRouterMatchesMap = new HashMap<>();
		for (CCMatch m : protocol.getMatches()) {

			if (m.getRuleName().equals("ReqProviderToServerRule")) {
				serverMatchesMap.put(m, protocol.matchToInt(m));
			} 
			
			else if (m.getRuleName().equals("ReqConsumerToComputerRule")) {
				computerMatchesMap.put(m, protocol.matchToInt(m));
			}
			
			else if (m.getRuleName().equals("VirtualNodeToRouterRule1")) {
				initRouterMatchesMap.put(m, protocol.matchToInt(m));
			}
		}

		Collection<UserDefinedILPConstraint> results = new ArrayList<>();

		results = maxSlotsConstraint(serverMatchesMap, results);
		results = serverSpeedConstraint(serverMatchesMap, results);
		//results = computerSpeedConstraint(computerMatchesMap, results);
		results = initRouterConstraint(initRouterMatchesMap, results);

		return results;
	}

	private Collection<UserDefinedILPConstraint> maxSlotsConstraint(Map<CCMatch, Integer> matchesMap,
			Collection<UserDefinedILPConstraint> results) {

		Map<Server, HashMap<Integer, Double>> idToCoefficientMap = new HashMap<>();

		for (CCMatch m : matchesMap.keySet()) {
			Server s = (Server) m.getTargetMatch().getNodeMappings().get("implDevice");

			HashMap<Integer, Double> coefficients = idToCoefficientMap.getOrDefault(s, new HashMap<>());
			coefficients.put(matchesMap.get(m), 1.0);

			idToCoefficientMap.put(s, coefficients);
		}

		for (Server s : idToCoefficientMap.keySet()) {
			results.add(new UserDefinedILPConstraint(idToCoefficientMap.get(s), "<=", s.getMaxSlots().doubleValue()));
		}

		return results;
	}

	private Collection<UserDefinedILPConstraint> serverSpeedConstraint(Map<CCMatch, Integer> matchesMap,
			Collection<UserDefinedILPConstraint> results) {
		Map<String, HashMap<Integer, Double>> idToCoefficientMap = new HashMap<>();
		Map<String, Double> serverSpeedMap = new HashMap<>();

		for (CCMatch m : matchesMap.keySet()) {
			Server s = (Server) m.getTargetMatch().getNodeMappings().get("implDevice");
			Provider p = (Provider) m.getSourceMatch().getNodeMappings().get("reqAgent");
			if (!serverSpeedMap.containsKey(s.getName())) {
				double serverSpeed = 0.0;
				for (Cable c : s.getOutgoing()) {
					serverSpeed += c.getSpeed().doubleValue();
				}
				// In order to simplify things, we assume that the maximum
				// server speed (actually we are talking about throughput)
				// is equals to the sum over the speed of its outgoing cables.
				serverSpeedMap.put(s.getName(), serverSpeed);
			}

			HashMap<Integer, Double> coefficients = idToCoefficientMap.getOrDefault(s.getName(), new HashMap<>());
			coefficients.put(matchesMap.get(m), p.getSpeed().doubleValue());

			idToCoefficientMap.put(s.getName(), coefficients);
		}
		for (String serverName : idToCoefficientMap.keySet()) {
			results.add(new UserDefinedILPConstraint(idToCoefficientMap.get(serverName), "<=",
					serverSpeedMap.get(serverName)));
		}

		return results;
	}

	private Collection<UserDefinedILPConstraint> computerSpeedConstraint(Map<CCMatch, Integer> matchesMap,
			Collection<UserDefinedILPConstraint> results) {

		Map<String, HashMap<Integer, Double>> idToCoefficientMap = new HashMap<>();
		Map<String, Double> computerSpeedMap = new HashMap<>();

		for (CCMatch m : matchesMap.keySet()) {
			Computer computer = (Computer) m.getTargetMatch().getNodeMappings().get("implDevice");
			Consumer consumer = (Consumer) m.getSourceMatch().getNodeMappings().get("reqAgent");

			if (!computerSpeedMap.containsKey(computer.getName())) {
				double computerSpeed = 0.0;
				for (Cable c : computer.getIncoming()) {
					computerSpeed += c.getSpeed().doubleValue();
				}
				// System.out.println(computerSpeed);
				// In order to simplify things, we assume that the maximum
				// computer speed (actually we are talking about throughput)
				// is equals to the sum over the speed of its Incoming cables.
				computerSpeedMap.put(computer.getName(), computerSpeed);
			}

			HashMap<Integer, Double> coefficients = idToCoefficientMap.getOrDefault(computer.getName(),
					new HashMap<>());
			coefficients.put(matchesMap.get(m), consumer.getSpeed().doubleValue());

			idToCoefficientMap.put(computer.getName(), coefficients);
		}

		for (String computerName : idToCoefficientMap.keySet()) {
			results.add(new UserDefinedILPConstraint(idToCoefficientMap.get(computerName), "<=",
					computerSpeedMap.get(computerName)));
		}

		return results;
	}

	private Collection<UserDefinedILPConstraint> initRouterConstraint(Map<CCMatch, Integer> matchesMap,
			Collection<UserDefinedILPConstraint> results) {

		Map<Router, HashMap<Integer, Double>> idToCoefficientMap = new HashMap<>();

		for (CCMatch m : matchesMap.keySet()) {
			Router r = (Router) m.getTargetMatch().getNodeMappings().get("router");
			HashMap<Integer, Double> coefficients = idToCoefficientMap.getOrDefault(r, new HashMap<>());
			
			for (CCMatch m2 : matchesMap.keySet()) {
				coefficients.put(matchesMap.get(m2), 1.0);
			}
			
			idToCoefficientMap.put(r, coefficients);
		}

		for (Router r : idToCoefficientMap.keySet()) {
			results.add(new UserDefinedILPConstraint(idToCoefficientMap.get(r), "<=", 1));
		}

		return results;
	}

}
