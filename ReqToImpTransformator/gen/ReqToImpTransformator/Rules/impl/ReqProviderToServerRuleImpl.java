/**
 */
package ReqToImpTransformator.Rules.impl;

import ReqToImpTransformator.ReqAgentToImplDevice;
import ReqToImpTransformator.ReqContainerToImplContainer;
import ReqToImpTransformator.ReqToImpTransformatorFactory;

import ReqToImpTransformator.Rules.ReqProviderToServerRule;
import ReqToImpTransformator.Rules.RulesPackage;

import ReqToImpTransformator.VirtualNodeToServer;

import implementation.Cable;
import implementation.Server;

import java.lang.Iterable;

import java.lang.reflect.InvocationTargetException;

import java.util.LinkedList;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EOperation;

import org.moflon.tgg.language.csp.CSP;

import org.moflon.tgg.language.modelgenerator.RuleEntryContainer;
import org.moflon.tgg.language.modelgenerator.RuleEntryList;

import org.moflon.tgg.runtime.AttributeConstraintsRuleResult;
import org.moflon.tgg.runtime.CCMatch;
import org.moflon.tgg.runtime.EMoflonEdge;
import org.moflon.tgg.runtime.EObjectContainer;
import org.moflon.tgg.runtime.IsApplicableMatch;
import org.moflon.tgg.runtime.IsApplicableRuleResult;
import org.moflon.tgg.runtime.Match;
import org.moflon.tgg.runtime.ModelgeneratorRuleResult;
import org.moflon.tgg.runtime.PerformRuleResult;
import org.moflon.tgg.runtime.RuntimeFactory;
import org.moflon.tgg.runtime.TripleMatch;

import org.moflon.tgg.runtime.impl.AbstractRuleImpl;

import requirements.Container;
import requirements.NetworkSpan;
import requirements.Provider;
import requirements.RequirementsFactory;
// <-- [user defined imports]
import org.moflon.tgg.csp.*;
import ReqToImpTransformator.csp.constraints.*;
import org.moflon.tgg.csp.constraints.*;
import org.moflon.tgg.language.csp.*;
import org.moflon.tgg.runtime.TripleMatchNodeMapping;
import java.util.Optional;
import org.moflon.tgg.algorithm.delta.attribute.CheckAttributeHelper;
import SDMLanguage.expressions.ComparingOperator;
import org.moflon.tgg.runtime.TripleMatchNodeMapping;
import java.util.Optional;
import org.moflon.tgg.algorithm.delta.attribute.CheckAttributeHelper;
import SDMLanguage.expressions.ComparingOperator;
// [user defined imports] -->

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Req Provider To Server Rule</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class ReqProviderToServerRuleImpl extends AbstractRuleImpl implements ReqProviderToServerRule {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ReqProviderToServerRuleImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RulesPackage.eINSTANCE.getReqProviderToServerRule();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAppropriate_FWD(Match match, Provider reqAgent, Container reqContainer, NetworkSpan virtualNode) {

		Object[] result1_black = ReqProviderToServerRuleImpl
				.pattern_ReqProviderToServerRule_0_1_initialbindings_blackBBBBB(this, match, reqAgent, reqContainer,
						virtualNode);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[match] = " + match + ", " + "[reqAgent] = " + reqAgent + ", " + "[reqContainer] = "
					+ reqContainer + ", " + "[virtualNode] = " + virtualNode + ".");
		}

		Object[] result2_bindingAndBlack = ReqProviderToServerRuleImpl
				.pattern_ReqProviderToServerRule_0_2_SolveCSP_bindingAndBlackFBBBBB(this, match, reqAgent, reqContainer,
						virtualNode);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[match] = " + match + ", " + "[reqAgent] = " + reqAgent + ", " + "[reqContainer] = "
					+ reqContainer + ", " + "[virtualNode] = " + virtualNode + ".");
		}
		CSP csp = (CSP) result2_bindingAndBlack[0];
		// 
		if (ReqProviderToServerRuleImpl.pattern_ReqProviderToServerRule_0_3_CheckCSP_expressionFBB(this, csp)) {

			Object[] result4_black = ReqProviderToServerRuleImpl
					.pattern_ReqProviderToServerRule_0_4_collectelementstobetranslated_blackBBBB(match, reqAgent,
							reqContainer, virtualNode);
			if (result4_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match + ", "
						+ "[reqAgent] = " + reqAgent + ", " + "[reqContainer] = " + reqContainer + ", "
						+ "[virtualNode] = " + virtualNode + ".");
			}
			ReqProviderToServerRuleImpl.pattern_ReqProviderToServerRule_0_4_collectelementstobetranslated_greenBBBF(
					match, reqAgent, reqContainer);
			//nothing EMoflonEdge reqContainer__reqAgent____agents = (EMoflonEdge) result4_green[3];

			Object[] result5_black = ReqProviderToServerRuleImpl
					.pattern_ReqProviderToServerRule_0_5_collectcontextelements_blackBBBB(match, reqAgent, reqContainer,
							virtualNode);
			if (result5_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match + ", "
						+ "[reqAgent] = " + reqAgent + ", " + "[reqContainer] = " + reqContainer + ", "
						+ "[virtualNode] = " + virtualNode + ".");
			}
			ReqProviderToServerRuleImpl.pattern_ReqProviderToServerRule_0_5_collectcontextelements_greenBBBF(match,
					reqContainer, virtualNode);
			//nothing EMoflonEdge reqContainer__virtualNode____networkSpan = (EMoflonEdge) result5_green[3];

			// 
			ReqProviderToServerRuleImpl.pattern_ReqProviderToServerRule_0_6_registerobjectstomatch_expressionBBBBB(this,
					match, reqAgent, reqContainer, virtualNode);
			return ReqProviderToServerRuleImpl.pattern_ReqProviderToServerRule_0_7_expressionF();
		} else {
			return ReqProviderToServerRuleImpl.pattern_ReqProviderToServerRule_0_8_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PerformRuleResult perform_FWD(IsApplicableMatch isApplicableMatch) {

		Object[] result1_bindingAndBlack = ReqProviderToServerRuleImpl
				.pattern_ReqProviderToServerRule_1_1_performtransformation_bindingAndBlackFFFFFFFFFBB(this,
						isApplicableMatch);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[isApplicableMatch] = " + isApplicableMatch + ".");
		}
		VirtualNodeToServer virtualNodeToServer = (VirtualNodeToServer) result1_bindingAndBlack[0];
		Server implDevice = (Server) result1_bindingAndBlack[1];
		Provider reqAgent = (Provider) result1_bindingAndBlack[2];
		Container reqContainer = (Container) result1_bindingAndBlack[3];
		NetworkSpan virtualNode = (NetworkSpan) result1_bindingAndBlack[4];
		Cable cable = (Cable) result1_bindingAndBlack[5];
		implementation.Container implContainer = (implementation.Container) result1_bindingAndBlack[6];
		ReqContainerToImplContainer reqContainerToImplContainer = (ReqContainerToImplContainer) result1_bindingAndBlack[7];
		//nothing CSP csp = (CSP) result1_bindingAndBlack[8];
		Object[] result1_green = ReqProviderToServerRuleImpl
				.pattern_ReqProviderToServerRule_1_1_performtransformation_greenBFB(implDevice, reqAgent);
		ReqAgentToImplDevice reqAgentToImplDevice = (ReqAgentToImplDevice) result1_green[1];

		Object[] result2_black = ReqProviderToServerRuleImpl
				.pattern_ReqProviderToServerRule_1_2_collecttranslatedelements_blackBB(reqAgentToImplDevice, reqAgent);
		if (result2_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[reqAgentToImplDevice] = "
					+ reqAgentToImplDevice + ", " + "[reqAgent] = " + reqAgent + ".");
		}
		Object[] result2_green = ReqProviderToServerRuleImpl
				.pattern_ReqProviderToServerRule_1_2_collecttranslatedelements_greenFBB(reqAgentToImplDevice, reqAgent);
		PerformRuleResult ruleresult = (PerformRuleResult) result2_green[0];

		Object[] result3_black = ReqProviderToServerRuleImpl
				.pattern_ReqProviderToServerRule_1_3_bookkeepingforedges_blackBBBBBBBBBB(ruleresult,
						virtualNodeToServer, implDevice, reqAgentToImplDevice, reqAgent, reqContainer, virtualNode,
						cable, implContainer, reqContainerToImplContainer);
		if (result3_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[ruleresult] = " + ruleresult
					+ ", " + "[virtualNodeToServer] = " + virtualNodeToServer + ", " + "[implDevice] = " + implDevice
					+ ", " + "[reqAgentToImplDevice] = " + reqAgentToImplDevice + ", " + "[reqAgent] = " + reqAgent
					+ ", " + "[reqContainer] = " + reqContainer + ", " + "[virtualNode] = " + virtualNode + ", "
					+ "[cable] = " + cable + ", " + "[implContainer] = " + implContainer + ", "
					+ "[reqContainerToImplContainer] = " + reqContainerToImplContainer + ".");
		}
		ReqProviderToServerRuleImpl.pattern_ReqProviderToServerRule_1_3_bookkeepingforedges_greenBBBBBFFF(ruleresult,
				implDevice, reqAgentToImplDevice, reqAgent, reqContainer);
		//nothing EMoflonEdge reqAgentToImplDevice__reqAgent____source = (EMoflonEdge) result3_green[5];
		//nothing EMoflonEdge reqAgentToImplDevice__implDevice____target = (EMoflonEdge) result3_green[6];
		//nothing EMoflonEdge reqContainer__reqAgent____agents = (EMoflonEdge) result3_green[7];

		// 
		// 
		ReqProviderToServerRuleImpl.pattern_ReqProviderToServerRule_1_5_registerobjects_expressionBBBBBBBBBBB(this,
				ruleresult, virtualNodeToServer, implDevice, reqAgentToImplDevice, reqAgent, reqContainer, virtualNode,
				cable, implContainer, reqContainerToImplContainer);
		return ReqProviderToServerRuleImpl.pattern_ReqProviderToServerRule_1_6_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IsApplicableRuleResult isApplicable_FWD(Match match) {

		Object[] result1_bindingAndBlack = ReqProviderToServerRuleImpl
				.pattern_ReqProviderToServerRule_2_1_preparereturnvalue_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		EOperation performOperation = (EOperation) result1_bindingAndBlack[0];
		//nothing EClass eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = ReqProviderToServerRuleImpl
				.pattern_ReqProviderToServerRule_2_1_preparereturnvalue_greenBF(performOperation);
		IsApplicableRuleResult ruleresult = (IsApplicableRuleResult) result1_green[1];

		// ForEach 
		Object[] result2_binding = ReqProviderToServerRuleImpl
				.pattern_ReqProviderToServerRule_2_2_corematch_bindingFFFB(match);
		if (result2_binding == null) {
			throw new RuntimeException(
					"Binding in node core match failed." + " Variables: " + "[match] = " + match + ".");
		}
		Provider reqAgent = (Provider) result2_binding[0];
		Container reqContainer = (Container) result2_binding[1];
		NetworkSpan virtualNode = (NetworkSpan) result2_binding[2];
		for (Object[] result2_black : ReqProviderToServerRuleImpl
				.pattern_ReqProviderToServerRule_2_2_corematch_blackFFBBBFFB(reqAgent, reqContainer, virtualNode,
						match)) {
			VirtualNodeToServer virtualNodeToServer = (VirtualNodeToServer) result2_black[0];
			Server implDevice = (Server) result2_black[1];
			implementation.Container implContainer = (implementation.Container) result2_black[5];
			ReqContainerToImplContainer reqContainerToImplContainer = (ReqContainerToImplContainer) result2_black[6];
			// ForEach 
			for (Object[] result3_black : ReqProviderToServerRuleImpl
					.pattern_ReqProviderToServerRule_2_3_findcontext_blackBBBBBFBB(virtualNodeToServer, implDevice,
							reqAgent, reqContainer, virtualNode, implContainer, reqContainerToImplContainer)) {
				Cable cable = (Cable) result3_black[5];
				Object[] result3_green = ReqProviderToServerRuleImpl
						.pattern_ReqProviderToServerRule_2_3_findcontext_greenBBBBBBBBFFFFFFFFF(virtualNodeToServer,
								implDevice, reqAgent, reqContainer, virtualNode, cable, implContainer,
								reqContainerToImplContainer);
				IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result3_green[8];
				//nothing EMoflonEdge implContainer__cable____cables = (EMoflonEdge) result3_green[9];
				//nothing EMoflonEdge reqContainer__virtualNode____networkSpan = (EMoflonEdge) result3_green[10];
				//nothing EMoflonEdge virtualNodeToServer__implDevice____target = (EMoflonEdge) result3_green[11];
				//nothing EMoflonEdge virtualNodeToServer__virtualNode____source = (EMoflonEdge) result3_green[12];
				//nothing EMoflonEdge reqContainer__reqAgent____agents = (EMoflonEdge) result3_green[13];
				//nothing EMoflonEdge reqContainerToImplContainer__reqContainer____source = (EMoflonEdge) result3_green[14];
				//nothing EMoflonEdge reqContainerToImplContainer__implContainer____target = (EMoflonEdge) result3_green[15];
				//nothing EMoflonEdge implContainer__implDevice____devices = (EMoflonEdge) result3_green[16];

				Object[] result4_bindingAndBlack = ReqProviderToServerRuleImpl
						.pattern_ReqProviderToServerRule_2_4_solveCSP_bindingAndBlackFBBBBBBBBBB(this,
								isApplicableMatch, virtualNodeToServer, implDevice, reqAgent, reqContainer, virtualNode,
								cable, implContainer, reqContainerToImplContainer);
				if (result4_bindingAndBlack == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
							+ "[isApplicableMatch] = " + isApplicableMatch + ", " + "[virtualNodeToServer] = "
							+ virtualNodeToServer + ", " + "[implDevice] = " + implDevice + ", " + "[reqAgent] = "
							+ reqAgent + ", " + "[reqContainer] = " + reqContainer + ", " + "[virtualNode] = "
							+ virtualNode + ", " + "[cable] = " + cable + ", " + "[implContainer] = " + implContainer
							+ ", " + "[reqContainerToImplContainer] = " + reqContainerToImplContainer + ".");
				}
				CSP csp = (CSP) result4_bindingAndBlack[0];
				// 
				if (ReqProviderToServerRuleImpl.pattern_ReqProviderToServerRule_2_5_checkCSP_expressionFBB(this, csp)) {

					Object[] result6_black = ReqProviderToServerRuleImpl
							.pattern_ReqProviderToServerRule_2_6_addmatchtoruleresult_blackBB(ruleresult,
									isApplicableMatch);
					if (result6_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[ruleresult] = "
								+ ruleresult + ", " + "[isApplicableMatch] = " + isApplicableMatch + ".");
					}
					ReqProviderToServerRuleImpl.pattern_ReqProviderToServerRule_2_6_addmatchtoruleresult_greenBB(
							ruleresult, isApplicableMatch);

				} else {
				}

			}

		}
		return ReqProviderToServerRuleImpl.pattern_ReqProviderToServerRule_2_7_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void registerObjectsToMatch_FWD(Match match, Provider reqAgent, Container reqContainer,
			NetworkSpan virtualNode) {
		match.registerObject("reqAgent", reqAgent);
		match.registerObject("reqContainer", reqContainer);
		match.registerObject("virtualNode", virtualNode);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isAppropriate_solveCsp_FWD(Match match, Provider reqAgent, Container reqContainer,
			NetworkSpan virtualNode) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();

		// Create literals

		// Create attribute variables

		// Create unbound variables

		// Create constraints

		// Solve CSP
		return csp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAppropriate_checkCsp_FWD(CSP csp) {
		return csp.check();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isApplicable_solveCsp_FWD(IsApplicableMatch isApplicableMatch, VirtualNodeToServer virtualNodeToServer,
			Server implDevice, Provider reqAgent, Container reqContainer, NetworkSpan virtualNode, Cable cable,
			implementation.Container implContainer, ReqContainerToImplContainer reqContainerToImplContainer) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals

		// Create attribute variables

		// Create unbound variables

		// Create constraints

		// Solve CSP

		// Snapshot pattern match on which CSP is solved
		isApplicableMatch.registerObject("virtualNodeToServer", virtualNodeToServer);
		isApplicableMatch.registerObject("implDevice", implDevice);
		isApplicableMatch.registerObject("reqAgent", reqAgent);
		isApplicableMatch.registerObject("reqContainer", reqContainer);
		isApplicableMatch.registerObject("virtualNode", virtualNode);
		isApplicableMatch.registerObject("cable", cable);
		isApplicableMatch.registerObject("implContainer", implContainer);
		isApplicableMatch.registerObject("reqContainerToImplContainer", reqContainerToImplContainer);
		return csp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isApplicable_checkCsp_FWD(CSP csp) {
		return csp.check();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void registerObjects_FWD(PerformRuleResult ruleresult, EObject virtualNodeToServer, EObject implDevice,
			EObject reqAgentToImplDevice, EObject reqAgent, EObject reqContainer, EObject virtualNode, EObject cable,
			EObject implContainer, EObject reqContainerToImplContainer) {
		ruleresult.registerObject("virtualNodeToServer", virtualNodeToServer);
		ruleresult.registerObject("implDevice", implDevice);
		ruleresult.registerObject("reqAgentToImplDevice", reqAgentToImplDevice);
		ruleresult.registerObject("reqAgent", reqAgent);
		ruleresult.registerObject("reqContainer", reqContainer);
		ruleresult.registerObject("virtualNode", virtualNode);
		ruleresult.registerObject("cable", cable);
		ruleresult.registerObject("implContainer", implContainer);
		ruleresult.registerObject("reqContainerToImplContainer", reqContainerToImplContainer);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean checkTypes_FWD(Match match) {
		return true && org.moflon.util.eMoflonSDMUtil.getFQN(match.getObject("reqAgent").eClass())
				.equals("requirements.Provider.");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAppropriate_BWD(Match match, Server implDevice, Cable cable,
			implementation.Container implContainer) {

		Object[] result1_black = ReqProviderToServerRuleImpl
				.pattern_ReqProviderToServerRule_10_1_initialbindings_blackBBBBB(this, match, implDevice, cable,
						implContainer);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[match] = " + match + ", " + "[implDevice] = " + implDevice + ", " + "[cable] = " + cable + ", "
					+ "[implContainer] = " + implContainer + ".");
		}

		Object[] result2_bindingAndBlack = ReqProviderToServerRuleImpl
				.pattern_ReqProviderToServerRule_10_2_SolveCSP_bindingAndBlackFBBBBB(this, match, implDevice, cable,
						implContainer);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[match] = " + match + ", " + "[implDevice] = " + implDevice + ", " + "[cable] = " + cable + ", "
					+ "[implContainer] = " + implContainer + ".");
		}
		CSP csp = (CSP) result2_bindingAndBlack[0];
		// 
		if (ReqProviderToServerRuleImpl.pattern_ReqProviderToServerRule_10_3_CheckCSP_expressionFBB(this, csp)) {

			Object[] result4_black = ReqProviderToServerRuleImpl
					.pattern_ReqProviderToServerRule_10_4_collectelementstobetranslated_blackBBBB(match, implDevice,
							cable, implContainer);
			if (result4_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match + ", "
						+ "[implDevice] = " + implDevice + ", " + "[cable] = " + cable + ", " + "[implContainer] = "
						+ implContainer + ".");
			}

			Object[] result5_black = ReqProviderToServerRuleImpl
					.pattern_ReqProviderToServerRule_10_5_collectcontextelements_blackBBBB(match, implDevice, cable,
							implContainer);
			if (result5_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match + ", "
						+ "[implDevice] = " + implDevice + ", " + "[cable] = " + cable + ", " + "[implContainer] = "
						+ implContainer + ".");
			}
			ReqProviderToServerRuleImpl.pattern_ReqProviderToServerRule_10_5_collectcontextelements_greenBBBBFF(match,
					implDevice, cable, implContainer);
			//nothing EMoflonEdge implContainer__cable____cables = (EMoflonEdge) result5_green[4];
			//nothing EMoflonEdge implContainer__implDevice____devices = (EMoflonEdge) result5_green[5];

			// 
			ReqProviderToServerRuleImpl.pattern_ReqProviderToServerRule_10_6_registerobjectstomatch_expressionBBBBB(
					this, match, implDevice, cable, implContainer);
			return ReqProviderToServerRuleImpl.pattern_ReqProviderToServerRule_10_7_expressionF();
		} else {
			return ReqProviderToServerRuleImpl.pattern_ReqProviderToServerRule_10_8_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PerformRuleResult perform_BWD(IsApplicableMatch isApplicableMatch) {
		// [user code injected with eMoflon]

		// TODO: implement this method here but do not remove the injection marker 
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IsApplicableRuleResult isApplicable_BWD(Match match) {
		// [user code injected with eMoflon]

		// TODO: implement this method here but do not remove the injection marker 
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void registerObjectsToMatch_BWD(Match match, Server implDevice, Cable cable,
			implementation.Container implContainer) {
		match.registerObject("implDevice", implDevice);
		match.registerObject("cable", cable);
		match.registerObject("implContainer", implContainer);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isAppropriate_solveCsp_BWD(Match match, Server implDevice, Cable cable,
			implementation.Container implContainer) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();

		// Create literals

		// Create attribute variables

		// Create unbound variables

		// Create constraints

		// Solve CSP
		return csp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAppropriate_checkCsp_BWD(CSP csp) {
		return csp.check();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean checkTypes_BWD(Match match) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_BWD_Server_0(Server implDevice) {

		Object[] result1_bindingAndBlack = ReqProviderToServerRuleImpl
				.pattern_ReqProviderToServerRule_17_1_preparereturnvalue_bindingAndBlackFFBF(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		EOperation isApplicableCC = (EOperation) result1_bindingAndBlack[3];
		Object[] result1_green = ReqProviderToServerRuleImpl
				.pattern_ReqProviderToServerRule_17_1_preparereturnvalue_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach 
		for (Object[] result2_black : ReqProviderToServerRuleImpl
				.pattern_ReqProviderToServerRule_17_2_testcorematchandDECs_blackBFF(implDevice)) {
			Cable cable = (Cable) result2_black[1];
			implementation.Container implContainer = (implementation.Container) result2_black[2];
			Object[] result2_green = ReqProviderToServerRuleImpl
					.pattern_ReqProviderToServerRule_17_2_testcorematchandDECs_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// 
			if (ReqProviderToServerRuleImpl
					.pattern_ReqProviderToServerRule_17_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBBB(
							this, match, implDevice, cable, implContainer)) {
				// 
				if (ReqProviderToServerRuleImpl
						.pattern_ReqProviderToServerRule_17_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(
								this, match)) {

					Object[] result5_black = ReqProviderToServerRuleImpl
							.pattern_ReqProviderToServerRule_17_5_Addmatchtoruleresult_blackBBBB(match,
									__performOperation, __result, isApplicableCC);
					if (result5_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match
								+ ", " + "[__performOperation] = " + __performOperation + ", " + "[__result] = "
								+ __result + ", " + "[isApplicableCC] = " + isApplicableCC + ".");
					}
					ReqProviderToServerRuleImpl.pattern_ReqProviderToServerRule_17_5_Addmatchtoruleresult_greenBBBB(
							match, __performOperation, __result, isApplicableCC);

				} else {
				}

			} else {
			}

		}
		return ReqProviderToServerRuleImpl.pattern_ReqProviderToServerRule_17_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_FWD_EMoflonEdge_2(EMoflonEdge _edge_agents) {

		Object[] result1_bindingAndBlack = ReqProviderToServerRuleImpl
				.pattern_ReqProviderToServerRule_18_1_preparereturnvalue_bindingAndBlackFFBF(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		EOperation isApplicableCC = (EOperation) result1_bindingAndBlack[3];
		Object[] result1_green = ReqProviderToServerRuleImpl
				.pattern_ReqProviderToServerRule_18_1_preparereturnvalue_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach 
		for (Object[] result2_black : ReqProviderToServerRuleImpl
				.pattern_ReqProviderToServerRule_18_2_testcorematchandDECs_blackFFFB(_edge_agents)) {
			Provider reqAgent = (Provider) result2_black[0];
			Container reqContainer = (Container) result2_black[1];
			NetworkSpan virtualNode = (NetworkSpan) result2_black[2];
			Object[] result2_green = ReqProviderToServerRuleImpl
					.pattern_ReqProviderToServerRule_18_2_testcorematchandDECs_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// 
			if (ReqProviderToServerRuleImpl
					.pattern_ReqProviderToServerRule_18_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBBB(
							this, match, reqAgent, reqContainer, virtualNode)) {
				// 
				if (ReqProviderToServerRuleImpl
						.pattern_ReqProviderToServerRule_18_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(
								this, match)) {

					Object[] result5_black = ReqProviderToServerRuleImpl
							.pattern_ReqProviderToServerRule_18_5_Addmatchtoruleresult_blackBBBB(match,
									__performOperation, __result, isApplicableCC);
					if (result5_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match
								+ ", " + "[__performOperation] = " + __performOperation + ", " + "[__result] = "
								+ __result + ", " + "[isApplicableCC] = " + isApplicableCC + ".");
					}
					ReqProviderToServerRuleImpl.pattern_ReqProviderToServerRule_18_5_Addmatchtoruleresult_greenBBBB(
							match, __performOperation, __result, isApplicableCC);

				} else {
				}

			} else {
			}

		}
		return ReqProviderToServerRuleImpl.pattern_ReqProviderToServerRule_18_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AttributeConstraintsRuleResult checkAttributes_FWD(TripleMatch __tripleMatch) {
		AttributeConstraintsRuleResult ruleResult = org.moflon.tgg.runtime.RuntimeFactory.eINSTANCE
				.createAttributeConstraintsRuleResult();
		ruleResult.setRule("ReqProviderToServerRule");
		ruleResult.setSuccess(true);

		CSP csp = CspFactory.eINSTANCE.createCSP();

		CheckAttributeHelper __helper = new CheckAttributeHelper(__tripleMatch);

		if (csp.check()) {
			ruleResult.setSuccess(true);
		} else {
			if (csp.check()) {
				ruleResult.setSuccess(true);
				ruleResult.setRequiredChange(true);
			} else {
				ruleResult.setSuccess(false);
				return ruleResult;
			}
		}

		return ruleResult;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AttributeConstraintsRuleResult checkAttributes_BWD(TripleMatch __tripleMatch) {
		AttributeConstraintsRuleResult ruleResult = org.moflon.tgg.runtime.RuntimeFactory.eINSTANCE
				.createAttributeConstraintsRuleResult();
		ruleResult.setRule("ReqProviderToServerRule");
		ruleResult.setSuccess(true);

		CSP csp = CspFactory.eINSTANCE.createCSP();

		CheckAttributeHelper __helper = new CheckAttributeHelper(__tripleMatch);

		if (csp.check()) {
			ruleResult.setSuccess(true);
		} else {
			if (csp.check()) {
				ruleResult.setSuccess(true);
				ruleResult.setRequiredChange(true);
			} else {
				ruleResult.setSuccess(false);
				return ruleResult;
			}
		}

		return ruleResult;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IsApplicableRuleResult isApplicable_CC(Match sourceMatch, Match targetMatch) {

		Object[] result1_black = ReqProviderToServerRuleImpl.pattern_ReqProviderToServerRule_21_1_prepare_blackB(this);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		Object[] result1_green = ReqProviderToServerRuleImpl.pattern_ReqProviderToServerRule_21_1_prepare_greenF();
		IsApplicableRuleResult result = (IsApplicableRuleResult) result1_green[0];

		Object[] result2_bindingAndBlack = ReqProviderToServerRuleImpl
				.pattern_ReqProviderToServerRule_21_2_matchsrctrgcontext_bindingAndBlackFFFFFFBB(sourceMatch,
						targetMatch);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[sourceMatch] = " + sourceMatch
					+ ", " + "[targetMatch] = " + targetMatch + ".");
		}
		Server implDevice = (Server) result2_bindingAndBlack[0];
		Provider reqAgent = (Provider) result2_bindingAndBlack[1];
		Container reqContainer = (Container) result2_bindingAndBlack[2];
		NetworkSpan virtualNode = (NetworkSpan) result2_bindingAndBlack[3];
		Cable cable = (Cable) result2_bindingAndBlack[4];
		implementation.Container implContainer = (implementation.Container) result2_bindingAndBlack[5];

		Object[] result3_bindingAndBlack = ReqProviderToServerRuleImpl
				.pattern_ReqProviderToServerRule_21_3_solvecsp_bindingAndBlackFBBBBBBBBB(this, implDevice, reqAgent,
						reqContainer, virtualNode, cable, implContainer, sourceMatch, targetMatch);
		if (result3_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[implDevice] = " + implDevice + ", " + "[reqAgent] = " + reqAgent + ", " + "[reqContainer] = "
					+ reqContainer + ", " + "[virtualNode] = " + virtualNode + ", " + "[cable] = " + cable + ", "
					+ "[implContainer] = " + implContainer + ", " + "[sourceMatch] = " + sourceMatch + ", "
					+ "[targetMatch] = " + targetMatch + ".");
		}
		CSP csp = (CSP) result3_bindingAndBlack[0];
		// 
		if (ReqProviderToServerRuleImpl.pattern_ReqProviderToServerRule_21_4_checkCSP_expressionFB(csp)) {
			// ForEach 
			for (Object[] result5_black : ReqProviderToServerRuleImpl
					.pattern_ReqProviderToServerRule_21_5_matchcorrcontext_blackFBBBBFBB(implDevice, reqContainer,
							virtualNode, implContainer, sourceMatch, targetMatch)) {
				VirtualNodeToServer virtualNodeToServer = (VirtualNodeToServer) result5_black[0];
				ReqContainerToImplContainer reqContainerToImplContainer = (ReqContainerToImplContainer) result5_black[5];
				Object[] result5_green = ReqProviderToServerRuleImpl
						.pattern_ReqProviderToServerRule_21_5_matchcorrcontext_greenBBBBF(virtualNodeToServer,
								reqContainerToImplContainer, sourceMatch, targetMatch);
				CCMatch ccMatch = (CCMatch) result5_green[4];

				Object[] result6_black = ReqProviderToServerRuleImpl
						.pattern_ReqProviderToServerRule_21_6_createcorrespondence_blackBBBBBBB(implDevice, reqAgent,
								reqContainer, virtualNode, cable, implContainer, ccMatch);
				if (result6_black == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[implDevice] = "
							+ implDevice + ", " + "[reqAgent] = " + reqAgent + ", " + "[reqContainer] = " + reqContainer
							+ ", " + "[virtualNode] = " + virtualNode + ", " + "[cable] = " + cable + ", "
							+ "[implContainer] = " + implContainer + ", " + "[ccMatch] = " + ccMatch + ".");
				}
				ReqProviderToServerRuleImpl.pattern_ReqProviderToServerRule_21_6_createcorrespondence_greenBFBB(
						implDevice, reqAgent, ccMatch);
				//nothing ReqAgentToImplDevice reqAgentToImplDevice = (ReqAgentToImplDevice) result6_green[1];

				Object[] result7_black = ReqProviderToServerRuleImpl
						.pattern_ReqProviderToServerRule_21_7_addtoreturnedresult_blackBB(result, ccMatch);
				if (result7_black == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[result] = " + result
							+ ", " + "[ccMatch] = " + ccMatch + ".");
				}
				ReqProviderToServerRuleImpl.pattern_ReqProviderToServerRule_21_7_addtoreturnedresult_greenBB(result,
						ccMatch);

			}

		} else {
		}
		return ReqProviderToServerRuleImpl.pattern_ReqProviderToServerRule_21_8_expressionFB(result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isApplicable_solveCsp_CC(Server implDevice, Provider reqAgent, Container reqContainer,
			NetworkSpan virtualNode, Cable cable, implementation.Container implContainer, Match sourceMatch,
			Match targetMatch) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();

		// Create literals

		// Create attribute variables

		// Create unbound variables

		// Create constraints

		// Solve CSP
		return csp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isApplicable_checkCsp_CC(CSP csp) {
		return csp.check();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean checkDEC_FWD(Provider reqAgent, Container reqContainer, NetworkSpan virtualNode) {// 
		Object[] result1_black = ReqProviderToServerRuleImpl
				.pattern_ReqProviderToServerRule_24_1_matchtggpattern_blackBBB(reqAgent, reqContainer, virtualNode);
		if (result1_black != null) {
			return ReqProviderToServerRuleImpl.pattern_ReqProviderToServerRule_24_2_expressionF();
		} else {
			return ReqProviderToServerRuleImpl.pattern_ReqProviderToServerRule_24_3_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean checkDEC_BWD(Server implDevice, Cable cable, implementation.Container implContainer) {// 
		Object[] result1_black = ReqProviderToServerRuleImpl
				.pattern_ReqProviderToServerRule_25_1_matchtggpattern_blackBBB(implDevice, cable, implContainer);
		if (result1_black != null) {
			return ReqProviderToServerRuleImpl.pattern_ReqProviderToServerRule_25_2_expressionF();
		} else {
			return ReqProviderToServerRuleImpl.pattern_ReqProviderToServerRule_25_3_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModelgeneratorRuleResult generateModel(RuleEntryContainer ruleEntryContainer,
			VirtualNodeToServer virtualNodeToServerParameter) {

		Object[] result1_black = ReqProviderToServerRuleImpl
				.pattern_ReqProviderToServerRule_26_1_createresult_blackB(this);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		Object[] result1_green = ReqProviderToServerRuleImpl
				.pattern_ReqProviderToServerRule_26_1_createresult_greenFF();
		IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result1_green[0];
		ModelgeneratorRuleResult ruleResult = (ModelgeneratorRuleResult) result1_green[1];

		// ForEach 
		for (Object[] result2_black : ReqProviderToServerRuleImpl
				.pattern_ReqProviderToServerRule_26_2_isapplicablecore_blackFFFFFFFFBB(ruleEntryContainer,
						ruleResult)) {
			//nothing RuleEntryList virtualNodeToServerList = (RuleEntryList) result2_black[0];
			VirtualNodeToServer virtualNodeToServer = (VirtualNodeToServer) result2_black[1];
			NetworkSpan virtualNode = (NetworkSpan) result2_black[2];
			Container reqContainer = (Container) result2_black[3];
			ReqContainerToImplContainer reqContainerToImplContainer = (ReqContainerToImplContainer) result2_black[4];
			implementation.Container implContainer = (implementation.Container) result2_black[5];
			Server implDevice = (Server) result2_black[6];
			Cable cable = (Cable) result2_black[7];

			Object[] result3_bindingAndBlack = ReqProviderToServerRuleImpl
					.pattern_ReqProviderToServerRule_26_3_solveCSP_bindingAndBlackFBBBBBBBBBB(this, isApplicableMatch,
							virtualNodeToServer, implDevice, reqContainer, virtualNode, cable, implContainer,
							reqContainerToImplContainer, ruleResult);
			if (result3_bindingAndBlack == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
						+ "[isApplicableMatch] = " + isApplicableMatch + ", " + "[virtualNodeToServer] = "
						+ virtualNodeToServer + ", " + "[implDevice] = " + implDevice + ", " + "[reqContainer] = "
						+ reqContainer + ", " + "[virtualNode] = " + virtualNode + ", " + "[cable] = " + cable + ", "
						+ "[implContainer] = " + implContainer + ", " + "[reqContainerToImplContainer] = "
						+ reqContainerToImplContainer + ", " + "[ruleResult] = " + ruleResult + ".");
			}
			CSP csp = (CSP) result3_bindingAndBlack[0];
			// 
			if (ReqProviderToServerRuleImpl.pattern_ReqProviderToServerRule_26_4_checkCSP_expressionFBB(this, csp)) {
				// 
				Object[] result5_black = ReqProviderToServerRuleImpl
						.pattern_ReqProviderToServerRule_26_5_checknacs_blackBBBBBBB(virtualNodeToServer, implDevice,
								reqContainer, virtualNode, cable, implContainer, reqContainerToImplContainer);
				if (result5_black != null) {

					Object[] result6_black = ReqProviderToServerRuleImpl
							.pattern_ReqProviderToServerRule_26_6_perform_blackBBBBBBBB(virtualNodeToServer, implDevice,
									reqContainer, virtualNode, cable, implContainer, reqContainerToImplContainer,
									ruleResult);
					if (result6_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: "
								+ "[virtualNodeToServer] = " + virtualNodeToServer + ", " + "[implDevice] = "
								+ implDevice + ", " + "[reqContainer] = " + reqContainer + ", " + "[virtualNode] = "
								+ virtualNode + ", " + "[cable] = " + cable + ", " + "[implContainer] = "
								+ implContainer + ", " + "[reqContainerToImplContainer] = "
								+ reqContainerToImplContainer + ", " + "[ruleResult] = " + ruleResult + ".");
					}
					ReqProviderToServerRuleImpl.pattern_ReqProviderToServerRule_26_6_perform_greenBFFBB(implDevice,
							reqContainer, ruleResult);
					//nothing ReqAgentToImplDevice reqAgentToImplDevice = (ReqAgentToImplDevice) result6_green[1];
					//nothing Provider reqAgent = (Provider) result6_green[2];

				} else {
				}

			} else {
			}

		}
		return ReqProviderToServerRuleImpl.pattern_ReqProviderToServerRule_26_7_expressionFB(ruleResult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP generateModel_solveCsp_BWD(IsApplicableMatch isApplicableMatch, VirtualNodeToServer virtualNodeToServer,
			Server implDevice, Container reqContainer, NetworkSpan virtualNode, Cable cable,
			implementation.Container implContainer, ReqContainerToImplContainer reqContainerToImplContainer,
			ModelgeneratorRuleResult ruleResult) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals

		// Create attribute variables

		// Create unbound variables

		// Create constraints

		// Solve CSP

		// Snapshot pattern match on which CSP is solved
		isApplicableMatch.registerObject("virtualNodeToServer", virtualNodeToServer);
		isApplicableMatch.registerObject("implDevice", implDevice);
		isApplicableMatch.registerObject("reqContainer", reqContainer);
		isApplicableMatch.registerObject("virtualNode", virtualNode);
		isApplicableMatch.registerObject("cable", cable);
		isApplicableMatch.registerObject("implContainer", implContainer);
		isApplicableMatch.registerObject("reqContainerToImplContainer", reqContainerToImplContainer);
		return csp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean generateModel_checkCsp_BWD(CSP csp) {
		return csp.check();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
		case RulesPackage.REQ_PROVIDER_TO_SERVER_RULE___IS_APPROPRIATE_FWD__MATCH_PROVIDER_CONTAINER_NETWORKSPAN:
			return isAppropriate_FWD((Match) arguments.get(0), (Provider) arguments.get(1),
					(Container) arguments.get(2), (NetworkSpan) arguments.get(3));
		case RulesPackage.REQ_PROVIDER_TO_SERVER_RULE___PERFORM_FWD__ISAPPLICABLEMATCH:
			return perform_FWD((IsApplicableMatch) arguments.get(0));
		case RulesPackage.REQ_PROVIDER_TO_SERVER_RULE___IS_APPLICABLE_FWD__MATCH:
			return isApplicable_FWD((Match) arguments.get(0));
		case RulesPackage.REQ_PROVIDER_TO_SERVER_RULE___REGISTER_OBJECTS_TO_MATCH_FWD__MATCH_PROVIDER_CONTAINER_NETWORKSPAN:
			registerObjectsToMatch_FWD((Match) arguments.get(0), (Provider) arguments.get(1),
					(Container) arguments.get(2), (NetworkSpan) arguments.get(3));
			return null;
		case RulesPackage.REQ_PROVIDER_TO_SERVER_RULE___IS_APPROPRIATE_SOLVE_CSP_FWD__MATCH_PROVIDER_CONTAINER_NETWORKSPAN:
			return isAppropriate_solveCsp_FWD((Match) arguments.get(0), (Provider) arguments.get(1),
					(Container) arguments.get(2), (NetworkSpan) arguments.get(3));
		case RulesPackage.REQ_PROVIDER_TO_SERVER_RULE___IS_APPROPRIATE_CHECK_CSP_FWD__CSP:
			return isAppropriate_checkCsp_FWD((CSP) arguments.get(0));
		case RulesPackage.REQ_PROVIDER_TO_SERVER_RULE___IS_APPLICABLE_SOLVE_CSP_FWD__ISAPPLICABLEMATCH_VIRTUALNODETOSERVER_SERVER_PROVIDER_CONTAINER_NETWORKSPAN_CABLE_CONTAINER_REQCONTAINERTOIMPLCONTAINER:
			return isApplicable_solveCsp_FWD((IsApplicableMatch) arguments.get(0),
					(VirtualNodeToServer) arguments.get(1), (Server) arguments.get(2), (Provider) arguments.get(3),
					(Container) arguments.get(4), (NetworkSpan) arguments.get(5), (Cable) arguments.get(6),
					(implementation.Container) arguments.get(7), (ReqContainerToImplContainer) arguments.get(8));
		case RulesPackage.REQ_PROVIDER_TO_SERVER_RULE___IS_APPLICABLE_CHECK_CSP_FWD__CSP:
			return isApplicable_checkCsp_FWD((CSP) arguments.get(0));
		case RulesPackage.REQ_PROVIDER_TO_SERVER_RULE___REGISTER_OBJECTS_FWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT:
			registerObjects_FWD((PerformRuleResult) arguments.get(0), (EObject) arguments.get(1),
					(EObject) arguments.get(2), (EObject) arguments.get(3), (EObject) arguments.get(4),
					(EObject) arguments.get(5), (EObject) arguments.get(6), (EObject) arguments.get(7),
					(EObject) arguments.get(8), (EObject) arguments.get(9));
			return null;
		case RulesPackage.REQ_PROVIDER_TO_SERVER_RULE___CHECK_TYPES_FWD__MATCH:
			return checkTypes_FWD((Match) arguments.get(0));
		case RulesPackage.REQ_PROVIDER_TO_SERVER_RULE___IS_APPROPRIATE_BWD__MATCH_SERVER_CABLE_CONTAINER:
			return isAppropriate_BWD((Match) arguments.get(0), (Server) arguments.get(1), (Cable) arguments.get(2),
					(implementation.Container) arguments.get(3));
		case RulesPackage.REQ_PROVIDER_TO_SERVER_RULE___PERFORM_BWD__ISAPPLICABLEMATCH:
			return perform_BWD((IsApplicableMatch) arguments.get(0));
		case RulesPackage.REQ_PROVIDER_TO_SERVER_RULE___IS_APPLICABLE_BWD__MATCH:
			return isApplicable_BWD((Match) arguments.get(0));
		case RulesPackage.REQ_PROVIDER_TO_SERVER_RULE___REGISTER_OBJECTS_TO_MATCH_BWD__MATCH_SERVER_CABLE_CONTAINER:
			registerObjectsToMatch_BWD((Match) arguments.get(0), (Server) arguments.get(1), (Cable) arguments.get(2),
					(implementation.Container) arguments.get(3));
			return null;
		case RulesPackage.REQ_PROVIDER_TO_SERVER_RULE___IS_APPROPRIATE_SOLVE_CSP_BWD__MATCH_SERVER_CABLE_CONTAINER:
			return isAppropriate_solveCsp_BWD((Match) arguments.get(0), (Server) arguments.get(1),
					(Cable) arguments.get(2), (implementation.Container) arguments.get(3));
		case RulesPackage.REQ_PROVIDER_TO_SERVER_RULE___IS_APPROPRIATE_CHECK_CSP_BWD__CSP:
			return isAppropriate_checkCsp_BWD((CSP) arguments.get(0));
		case RulesPackage.REQ_PROVIDER_TO_SERVER_RULE___CHECK_TYPES_BWD__MATCH:
			return checkTypes_BWD((Match) arguments.get(0));
		case RulesPackage.REQ_PROVIDER_TO_SERVER_RULE___IS_APPROPRIATE_BWD_SERVER_0__SERVER:
			return isAppropriate_BWD_Server_0((Server) arguments.get(0));
		case RulesPackage.REQ_PROVIDER_TO_SERVER_RULE___IS_APPROPRIATE_FWD_EMOFLON_EDGE_2__EMOFLONEDGE:
			return isAppropriate_FWD_EMoflonEdge_2((EMoflonEdge) arguments.get(0));
		case RulesPackage.REQ_PROVIDER_TO_SERVER_RULE___CHECK_ATTRIBUTES_FWD__TRIPLEMATCH:
			return checkAttributes_FWD((TripleMatch) arguments.get(0));
		case RulesPackage.REQ_PROVIDER_TO_SERVER_RULE___CHECK_ATTRIBUTES_BWD__TRIPLEMATCH:
			return checkAttributes_BWD((TripleMatch) arguments.get(0));
		case RulesPackage.REQ_PROVIDER_TO_SERVER_RULE___IS_APPLICABLE_CC__MATCH_MATCH:
			return isApplicable_CC((Match) arguments.get(0), (Match) arguments.get(1));
		case RulesPackage.REQ_PROVIDER_TO_SERVER_RULE___IS_APPLICABLE_SOLVE_CSP_CC__SERVER_PROVIDER_CONTAINER_NETWORKSPAN_CABLE_CONTAINER_MATCH_MATCH:
			return isApplicable_solveCsp_CC((Server) arguments.get(0), (Provider) arguments.get(1),
					(Container) arguments.get(2), (NetworkSpan) arguments.get(3), (Cable) arguments.get(4),
					(implementation.Container) arguments.get(5), (Match) arguments.get(6), (Match) arguments.get(7));
		case RulesPackage.REQ_PROVIDER_TO_SERVER_RULE___IS_APPLICABLE_CHECK_CSP_CC__CSP:
			return isApplicable_checkCsp_CC((CSP) arguments.get(0));
		case RulesPackage.REQ_PROVIDER_TO_SERVER_RULE___CHECK_DEC_FWD__PROVIDER_CONTAINER_NETWORKSPAN:
			return checkDEC_FWD((Provider) arguments.get(0), (Container) arguments.get(1),
					(NetworkSpan) arguments.get(2));
		case RulesPackage.REQ_PROVIDER_TO_SERVER_RULE___CHECK_DEC_BWD__SERVER_CABLE_CONTAINER:
			return checkDEC_BWD((Server) arguments.get(0), (Cable) arguments.get(1),
					(implementation.Container) arguments.get(2));
		case RulesPackage.REQ_PROVIDER_TO_SERVER_RULE___GENERATE_MODEL__RULEENTRYCONTAINER_VIRTUALNODETOSERVER:
			return generateModel((RuleEntryContainer) arguments.get(0), (VirtualNodeToServer) arguments.get(1));
		case RulesPackage.REQ_PROVIDER_TO_SERVER_RULE___GENERATE_MODEL_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_VIRTUALNODETOSERVER_SERVER_CONTAINER_NETWORKSPAN_CABLE_CONTAINER_REQCONTAINERTOIMPLCONTAINER_MODELGENERATORRULERESULT:
			return generateModel_solveCsp_BWD((IsApplicableMatch) arguments.get(0),
					(VirtualNodeToServer) arguments.get(1), (Server) arguments.get(2), (Container) arguments.get(3),
					(NetworkSpan) arguments.get(4), (Cable) arguments.get(5),
					(implementation.Container) arguments.get(6), (ReqContainerToImplContainer) arguments.get(7),
					(ModelgeneratorRuleResult) arguments.get(8));
		case RulesPackage.REQ_PROVIDER_TO_SERVER_RULE___GENERATE_MODEL_CHECK_CSP_BWD__CSP:
			return generateModel_checkCsp_BWD((CSP) arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
	}

	public static final Object[] pattern_ReqProviderToServerRule_0_1_initialbindings_blackBBBBB(
			ReqProviderToServerRule _this, Match match, Provider reqAgent, Container reqContainer,
			NetworkSpan virtualNode) {
		return new Object[] { _this, match, reqAgent, reqContainer, virtualNode };
	}

	public static final Object[] pattern_ReqProviderToServerRule_0_2_SolveCSP_bindingFBBBBB(
			ReqProviderToServerRule _this, Match match, Provider reqAgent, Container reqContainer,
			NetworkSpan virtualNode) {
		CSP _localVariable_0 = _this.isAppropriate_solveCsp_FWD(match, reqAgent, reqContainer, virtualNode);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, match, reqAgent, reqContainer, virtualNode };
		}
		return null;
	}

	public static final Object[] pattern_ReqProviderToServerRule_0_2_SolveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_ReqProviderToServerRule_0_2_SolveCSP_bindingAndBlackFBBBBB(
			ReqProviderToServerRule _this, Match match, Provider reqAgent, Container reqContainer,
			NetworkSpan virtualNode) {
		Object[] result_pattern_ReqProviderToServerRule_0_2_SolveCSP_binding = pattern_ReqProviderToServerRule_0_2_SolveCSP_bindingFBBBBB(
				_this, match, reqAgent, reqContainer, virtualNode);
		if (result_pattern_ReqProviderToServerRule_0_2_SolveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_ReqProviderToServerRule_0_2_SolveCSP_binding[0];

			Object[] result_pattern_ReqProviderToServerRule_0_2_SolveCSP_black = pattern_ReqProviderToServerRule_0_2_SolveCSP_blackB(
					csp);
			if (result_pattern_ReqProviderToServerRule_0_2_SolveCSP_black != null) {

				return new Object[] { csp, _this, match, reqAgent, reqContainer, virtualNode };
			}
		}
		return null;
	}

	public static final boolean pattern_ReqProviderToServerRule_0_3_CheckCSP_expressionFBB(
			ReqProviderToServerRule _this, CSP csp) {
		boolean _localVariable_0 = _this.isAppropriate_checkCsp_FWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_ReqProviderToServerRule_0_4_collectelementstobetranslated_blackBBBB(
			Match match, Provider reqAgent, Container reqContainer, NetworkSpan virtualNode) {
		return new Object[] { match, reqAgent, reqContainer, virtualNode };
	}

	public static final Object[] pattern_ReqProviderToServerRule_0_4_collectelementstobetranslated_greenBBBF(
			Match match, Provider reqAgent, Container reqContainer) {
		EMoflonEdge reqContainer__reqAgent____agents = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		match.getToBeTranslatedNodes().add(reqAgent);
		String reqContainer__reqAgent____agents_name_prime = "agents";
		reqContainer__reqAgent____agents.setSrc(reqContainer);
		reqContainer__reqAgent____agents.setTrg(reqAgent);
		match.getToBeTranslatedEdges().add(reqContainer__reqAgent____agents);
		reqContainer__reqAgent____agents.setName(reqContainer__reqAgent____agents_name_prime);
		return new Object[] { match, reqAgent, reqContainer, reqContainer__reqAgent____agents };
	}

	public static final Object[] pattern_ReqProviderToServerRule_0_5_collectcontextelements_blackBBBB(Match match,
			Provider reqAgent, Container reqContainer, NetworkSpan virtualNode) {
		return new Object[] { match, reqAgent, reqContainer, virtualNode };
	}

	public static final Object[] pattern_ReqProviderToServerRule_0_5_collectcontextelements_greenBBBF(Match match,
			Container reqContainer, NetworkSpan virtualNode) {
		EMoflonEdge reqContainer__virtualNode____networkSpan = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		match.getContextNodes().add(reqContainer);
		match.getContextNodes().add(virtualNode);
		String reqContainer__virtualNode____networkSpan_name_prime = "networkSpan";
		reqContainer__virtualNode____networkSpan.setSrc(reqContainer);
		reqContainer__virtualNode____networkSpan.setTrg(virtualNode);
		match.getContextEdges().add(reqContainer__virtualNode____networkSpan);
		reqContainer__virtualNode____networkSpan.setName(reqContainer__virtualNode____networkSpan_name_prime);
		return new Object[] { match, reqContainer, virtualNode, reqContainer__virtualNode____networkSpan };
	}

	public static final void pattern_ReqProviderToServerRule_0_6_registerobjectstomatch_expressionBBBBB(
			ReqProviderToServerRule _this, Match match, Provider reqAgent, Container reqContainer,
			NetworkSpan virtualNode) {
		_this.registerObjectsToMatch_FWD(match, reqAgent, reqContainer, virtualNode);

	}

	public static final boolean pattern_ReqProviderToServerRule_0_7_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_ReqProviderToServerRule_0_8_expressionF() {
		boolean _result = Boolean.valueOf(false);
		return _result;
	}

	public static final Object[] pattern_ReqProviderToServerRule_1_1_performtransformation_bindingFFFFFFFFB(
			IsApplicableMatch isApplicableMatch) {
		EObject _localVariable_0 = isApplicableMatch.getObject("virtualNodeToServer");
		EObject _localVariable_1 = isApplicableMatch.getObject("implDevice");
		EObject _localVariable_2 = isApplicableMatch.getObject("reqAgent");
		EObject _localVariable_3 = isApplicableMatch.getObject("reqContainer");
		EObject _localVariable_4 = isApplicableMatch.getObject("virtualNode");
		EObject _localVariable_5 = isApplicableMatch.getObject("cable");
		EObject _localVariable_6 = isApplicableMatch.getObject("implContainer");
		EObject _localVariable_7 = isApplicableMatch.getObject("reqContainerToImplContainer");
		EObject tmpVirtualNodeToServer = _localVariable_0;
		EObject tmpImplDevice = _localVariable_1;
		EObject tmpReqAgent = _localVariable_2;
		EObject tmpReqContainer = _localVariable_3;
		EObject tmpVirtualNode = _localVariable_4;
		EObject tmpCable = _localVariable_5;
		EObject tmpImplContainer = _localVariable_6;
		EObject tmpReqContainerToImplContainer = _localVariable_7;
		if (tmpVirtualNodeToServer instanceof VirtualNodeToServer) {
			VirtualNodeToServer virtualNodeToServer = (VirtualNodeToServer) tmpVirtualNodeToServer;
			if (tmpImplDevice instanceof Server) {
				Server implDevice = (Server) tmpImplDevice;
				if (tmpReqAgent instanceof Provider) {
					Provider reqAgent = (Provider) tmpReqAgent;
					if (tmpReqContainer instanceof Container) {
						Container reqContainer = (Container) tmpReqContainer;
						if (tmpVirtualNode instanceof NetworkSpan) {
							NetworkSpan virtualNode = (NetworkSpan) tmpVirtualNode;
							if (tmpCable instanceof Cable) {
								Cable cable = (Cable) tmpCable;
								if (tmpImplContainer instanceof implementation.Container) {
									implementation.Container implContainer = (implementation.Container) tmpImplContainer;
									if (tmpReqContainerToImplContainer instanceof ReqContainerToImplContainer) {
										ReqContainerToImplContainer reqContainerToImplContainer = (ReqContainerToImplContainer) tmpReqContainerToImplContainer;
										return new Object[] { virtualNodeToServer, implDevice, reqAgent, reqContainer,
												virtualNode, cable, implContainer, reqContainerToImplContainer,
												isApplicableMatch };
									}
								}
							}
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_ReqProviderToServerRule_1_1_performtransformation_blackBBBBBBBBFBB(
			VirtualNodeToServer virtualNodeToServer, Server implDevice, Provider reqAgent, Container reqContainer,
			NetworkSpan virtualNode, Cable cable, implementation.Container implContainer,
			ReqContainerToImplContainer reqContainerToImplContainer, ReqProviderToServerRule _this,
			IsApplicableMatch isApplicableMatch) {
		for (EObject tmpCsp : isApplicableMatch.getAttributeInfo()) {
			if (tmpCsp instanceof CSP) {
				CSP csp = (CSP) tmpCsp;
				return new Object[] { virtualNodeToServer, implDevice, reqAgent, reqContainer, virtualNode, cable,
						implContainer, reqContainerToImplContainer, csp, _this, isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_ReqProviderToServerRule_1_1_performtransformation_bindingAndBlackFFFFFFFFFBB(
			ReqProviderToServerRule _this, IsApplicableMatch isApplicableMatch) {
		Object[] result_pattern_ReqProviderToServerRule_1_1_performtransformation_binding = pattern_ReqProviderToServerRule_1_1_performtransformation_bindingFFFFFFFFB(
				isApplicableMatch);
		if (result_pattern_ReqProviderToServerRule_1_1_performtransformation_binding != null) {
			VirtualNodeToServer virtualNodeToServer = (VirtualNodeToServer) result_pattern_ReqProviderToServerRule_1_1_performtransformation_binding[0];
			Server implDevice = (Server) result_pattern_ReqProviderToServerRule_1_1_performtransformation_binding[1];
			Provider reqAgent = (Provider) result_pattern_ReqProviderToServerRule_1_1_performtransformation_binding[2];
			Container reqContainer = (Container) result_pattern_ReqProviderToServerRule_1_1_performtransformation_binding[3];
			NetworkSpan virtualNode = (NetworkSpan) result_pattern_ReqProviderToServerRule_1_1_performtransformation_binding[4];
			Cable cable = (Cable) result_pattern_ReqProviderToServerRule_1_1_performtransformation_binding[5];
			implementation.Container implContainer = (implementation.Container) result_pattern_ReqProviderToServerRule_1_1_performtransformation_binding[6];
			ReqContainerToImplContainer reqContainerToImplContainer = (ReqContainerToImplContainer) result_pattern_ReqProviderToServerRule_1_1_performtransformation_binding[7];

			Object[] result_pattern_ReqProviderToServerRule_1_1_performtransformation_black = pattern_ReqProviderToServerRule_1_1_performtransformation_blackBBBBBBBBFBB(
					virtualNodeToServer, implDevice, reqAgent, reqContainer, virtualNode, cable, implContainer,
					reqContainerToImplContainer, _this, isApplicableMatch);
			if (result_pattern_ReqProviderToServerRule_1_1_performtransformation_black != null) {
				CSP csp = (CSP) result_pattern_ReqProviderToServerRule_1_1_performtransformation_black[8];

				return new Object[] { virtualNodeToServer, implDevice, reqAgent, reqContainer, virtualNode, cable,
						implContainer, reqContainerToImplContainer, csp, _this, isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_ReqProviderToServerRule_1_1_performtransformation_greenBFB(Server implDevice,
			Provider reqAgent) {
		ReqAgentToImplDevice reqAgentToImplDevice = ReqToImpTransformatorFactory.eINSTANCE.createReqAgentToImplDevice();
		reqAgentToImplDevice.setSource(reqAgent);
		reqAgentToImplDevice.setTarget(implDevice);
		return new Object[] { implDevice, reqAgentToImplDevice, reqAgent };
	}

	public static final Object[] pattern_ReqProviderToServerRule_1_2_collecttranslatedelements_blackBB(
			ReqAgentToImplDevice reqAgentToImplDevice, Provider reqAgent) {
		return new Object[] { reqAgentToImplDevice, reqAgent };
	}

	public static final Object[] pattern_ReqProviderToServerRule_1_2_collecttranslatedelements_greenFBB(
			ReqAgentToImplDevice reqAgentToImplDevice, Provider reqAgent) {
		PerformRuleResult ruleresult = RuntimeFactory.eINSTANCE.createPerformRuleResult();
		ruleresult.getCreatedLinkElements().add(reqAgentToImplDevice);
		ruleresult.getTranslatedElements().add(reqAgent);
		return new Object[] { ruleresult, reqAgentToImplDevice, reqAgent };
	}

	public static final Object[] pattern_ReqProviderToServerRule_1_3_bookkeepingforedges_blackBBBBBBBBBB(
			PerformRuleResult ruleresult, EObject virtualNodeToServer, EObject implDevice, EObject reqAgentToImplDevice,
			EObject reqAgent, EObject reqContainer, EObject virtualNode, EObject cable, EObject implContainer,
			EObject reqContainerToImplContainer) {
		if (!implDevice.equals(virtualNodeToServer)) {
			if (!implDevice.equals(reqAgentToImplDevice)) {
				if (!implDevice.equals(reqAgent)) {
					if (!implDevice.equals(reqContainer)) {
						if (!implDevice.equals(virtualNode)) {
							if (!implDevice.equals(reqContainerToImplContainer)) {
								if (!reqAgentToImplDevice.equals(virtualNodeToServer)) {
									if (!reqAgentToImplDevice.equals(reqContainer)) {
										if (!reqAgentToImplDevice.equals(virtualNode)) {
											if (!reqAgentToImplDevice.equals(reqContainerToImplContainer)) {
												if (!reqAgent.equals(virtualNodeToServer)) {
													if (!reqAgent.equals(reqAgentToImplDevice)) {
														if (!reqAgent.equals(reqContainer)) {
															if (!reqAgent.equals(virtualNode)) {
																if (!reqAgent.equals(reqContainerToImplContainer)) {
																	if (!reqContainer.equals(virtualNodeToServer)) {
																		if (!reqContainer.equals(virtualNode)) {
																			if (!reqContainer.equals(
																					reqContainerToImplContainer)) {
																				if (!virtualNode
																						.equals(virtualNodeToServer)) {
																					if (!cable.equals(
																							virtualNodeToServer)) {
																						if (!cable.equals(implDevice)) {
																							if (!cable.equals(
																									reqAgentToImplDevice)) {
																								if (!cable.equals(
																										reqAgent)) {
																									if (!cable.equals(
																											reqContainer)) {
																										if (!cable
																												.equals(virtualNode)) {
																											if (!cable
																													.equals(implContainer)) {
																												if (!cable
																														.equals(reqContainerToImplContainer)) {
																													if (!implContainer
																															.equals(virtualNodeToServer)) {
																														if (!implContainer
																																.equals(implDevice)) {
																															if (!implContainer
																																	.equals(reqAgentToImplDevice)) {
																																if (!implContainer
																																		.equals(reqAgent)) {
																																	if (!implContainer
																																			.equals(reqContainer)) {
																																		if (!implContainer
																																				.equals(virtualNode)) {
																																			if (!implContainer
																																					.equals(reqContainerToImplContainer)) {
																																				if (!reqContainerToImplContainer
																																						.equals(virtualNodeToServer)) {
																																					if (!reqContainerToImplContainer
																																							.equals(virtualNode)) {
																																						return new Object[] {
																																								ruleresult,
																																								virtualNodeToServer,
																																								implDevice,
																																								reqAgentToImplDevice,
																																								reqAgent,
																																								reqContainer,
																																								virtualNode,
																																								cable,
																																								implContainer,
																																								reqContainerToImplContainer };
																																					}
																																				}
																																			}
																																		}
																																	}
																																}
																															}
																														}
																													}
																												}
																											}
																										}
																									}
																								}
																							}
																						}
																					}
																				}
																			}
																		}
																	}
																}
															}
														}
													}
												}
											}
										}
									}
								}
							}
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_ReqProviderToServerRule_1_3_bookkeepingforedges_greenBBBBBFFF(
			PerformRuleResult ruleresult, EObject implDevice, EObject reqAgentToImplDevice, EObject reqAgent,
			EObject reqContainer) {
		EMoflonEdge reqAgentToImplDevice__reqAgent____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge reqAgentToImplDevice__implDevice____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge reqContainer__reqAgent____agents = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String ruleresult_ruleName_prime = "ReqProviderToServerRule";
		String reqAgentToImplDevice__reqAgent____source_name_prime = "source";
		String reqAgentToImplDevice__implDevice____target_name_prime = "target";
		String reqContainer__reqAgent____agents_name_prime = "agents";
		reqAgentToImplDevice__reqAgent____source.setSrc(reqAgentToImplDevice);
		reqAgentToImplDevice__reqAgent____source.setTrg(reqAgent);
		ruleresult.getCreatedEdges().add(reqAgentToImplDevice__reqAgent____source);
		reqAgentToImplDevice__implDevice____target.setSrc(reqAgentToImplDevice);
		reqAgentToImplDevice__implDevice____target.setTrg(implDevice);
		ruleresult.getCreatedEdges().add(reqAgentToImplDevice__implDevice____target);
		reqContainer__reqAgent____agents.setSrc(reqContainer);
		reqContainer__reqAgent____agents.setTrg(reqAgent);
		ruleresult.getTranslatedEdges().add(reqContainer__reqAgent____agents);
		ruleresult.setRuleName(ruleresult_ruleName_prime);
		reqAgentToImplDevice__reqAgent____source.setName(reqAgentToImplDevice__reqAgent____source_name_prime);
		reqAgentToImplDevice__implDevice____target.setName(reqAgentToImplDevice__implDevice____target_name_prime);
		reqContainer__reqAgent____agents.setName(reqContainer__reqAgent____agents_name_prime);
		return new Object[] { ruleresult, implDevice, reqAgentToImplDevice, reqAgent, reqContainer,
				reqAgentToImplDevice__reqAgent____source, reqAgentToImplDevice__implDevice____target,
				reqContainer__reqAgent____agents };
	}

	public static final void pattern_ReqProviderToServerRule_1_5_registerobjects_expressionBBBBBBBBBBB(
			ReqProviderToServerRule _this, PerformRuleResult ruleresult, EObject virtualNodeToServer,
			EObject implDevice, EObject reqAgentToImplDevice, EObject reqAgent, EObject reqContainer,
			EObject virtualNode, EObject cable, EObject implContainer, EObject reqContainerToImplContainer) {
		_this.registerObjects_FWD(ruleresult, virtualNodeToServer, implDevice, reqAgentToImplDevice, reqAgent,
				reqContainer, virtualNode, cable, implContainer, reqContainerToImplContainer);

	}

	public static final PerformRuleResult pattern_ReqProviderToServerRule_1_6_expressionFB(
			PerformRuleResult ruleresult) {
		PerformRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_ReqProviderToServerRule_2_1_preparereturnvalue_bindingFB(
			ReqProviderToServerRule _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass eClass = _localVariable_0;
		if (eClass != null) {
			return new Object[] { eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_ReqProviderToServerRule_2_1_preparereturnvalue_blackFBB(EClass eClass,
			ReqProviderToServerRule _this) {
		for (EOperation performOperation : eClass.getEOperations()) {
			String performOperation_name = performOperation.getName();
			if (performOperation_name.equals("perform_FWD")) {
				return new Object[] { performOperation, eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_ReqProviderToServerRule_2_1_preparereturnvalue_bindingAndBlackFFB(
			ReqProviderToServerRule _this) {
		Object[] result_pattern_ReqProviderToServerRule_2_1_preparereturnvalue_binding = pattern_ReqProviderToServerRule_2_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_ReqProviderToServerRule_2_1_preparereturnvalue_binding != null) {
			EClass eClass = (EClass) result_pattern_ReqProviderToServerRule_2_1_preparereturnvalue_binding[0];

			Object[] result_pattern_ReqProviderToServerRule_2_1_preparereturnvalue_black = pattern_ReqProviderToServerRule_2_1_preparereturnvalue_blackFBB(
					eClass, _this);
			if (result_pattern_ReqProviderToServerRule_2_1_preparereturnvalue_black != null) {
				EOperation performOperation = (EOperation) result_pattern_ReqProviderToServerRule_2_1_preparereturnvalue_black[0];

				return new Object[] { performOperation, eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_ReqProviderToServerRule_2_1_preparereturnvalue_greenBF(
			EOperation performOperation) {
		IsApplicableRuleResult ruleresult = RuntimeFactory.eINSTANCE.createIsApplicableRuleResult();
		boolean ruleresult_success_prime = Boolean.valueOf(false);
		String ruleresult_rule_prime = "ReqProviderToServerRule";
		ruleresult.setPerformOperation(performOperation);
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		ruleresult.setRule(ruleresult_rule_prime);
		return new Object[] { performOperation, ruleresult };
	}

	public static final Object[] pattern_ReqProviderToServerRule_2_2_corematch_bindingFFFB(Match match) {
		EObject _localVariable_0 = match.getObject("reqAgent");
		EObject _localVariable_1 = match.getObject("reqContainer");
		EObject _localVariable_2 = match.getObject("virtualNode");
		EObject tmpReqAgent = _localVariable_0;
		EObject tmpReqContainer = _localVariable_1;
		EObject tmpVirtualNode = _localVariable_2;
		if (tmpReqAgent instanceof Provider) {
			Provider reqAgent = (Provider) tmpReqAgent;
			if (tmpReqContainer instanceof Container) {
				Container reqContainer = (Container) tmpReqContainer;
				if (tmpVirtualNode instanceof NetworkSpan) {
					NetworkSpan virtualNode = (NetworkSpan) tmpVirtualNode;
					return new Object[] { reqAgent, reqContainer, virtualNode, match };
				}
			}
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_ReqProviderToServerRule_2_2_corematch_blackFFBBBFFB(
			Provider reqAgent, Container reqContainer, NetworkSpan virtualNode, Match match) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		for (VirtualNodeToServer virtualNodeToServer : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(virtualNode, VirtualNodeToServer.class, "source")) {
			Server implDevice = virtualNodeToServer.getTarget();
			if (implDevice != null) {
				for (ReqContainerToImplContainer reqContainerToImplContainer : org.moflon.core.utilities.eMoflonEMFUtil
						.getOppositeReferenceTyped(reqContainer, ReqContainerToImplContainer.class, "source")) {
					implementation.Container implContainer = reqContainerToImplContainer.getTarget();
					if (implContainer != null) {
						_result.add(new Object[] { virtualNodeToServer, implDevice, reqAgent, reqContainer, virtualNode,
								implContainer, reqContainerToImplContainer, match });
					}

				}
			}

		}
		return _result;
	}

	public static final Iterable<Object[]> pattern_ReqProviderToServerRule_2_3_findcontext_blackBBBBBFBB(
			VirtualNodeToServer virtualNodeToServer, Server implDevice, Provider reqAgent, Container reqContainer,
			NetworkSpan virtualNode, implementation.Container implContainer,
			ReqContainerToImplContainer reqContainerToImplContainer) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (virtualNode.equals(reqContainer.getNetworkSpan())) {
			if (implDevice.equals(virtualNodeToServer.getTarget())) {
				if (virtualNode.equals(virtualNodeToServer.getSource())) {
					if (reqContainer.getAgents().contains(reqAgent)) {
						if (reqContainer.equals(reqContainerToImplContainer.getSource())) {
							if (implContainer.equals(reqContainerToImplContainer.getTarget())) {
								if (implContainer.getDevices().contains(implDevice)) {
									for (Cable cable : implContainer.getCables()) {
										_result.add(new Object[] { virtualNodeToServer, implDevice, reqAgent,
												reqContainer, virtualNode, cable, implContainer,
												reqContainerToImplContainer });
									}
								}
							}
						}
					}
				}
			}
		}
		return _result;
	}

	public static final Object[] pattern_ReqProviderToServerRule_2_3_findcontext_greenBBBBBBBBFFFFFFFFF(
			VirtualNodeToServer virtualNodeToServer, Server implDevice, Provider reqAgent, Container reqContainer,
			NetworkSpan virtualNode, Cable cable, implementation.Container implContainer,
			ReqContainerToImplContainer reqContainerToImplContainer) {
		IsApplicableMatch isApplicableMatch = RuntimeFactory.eINSTANCE.createIsApplicableMatch();
		EMoflonEdge implContainer__cable____cables = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge reqContainer__virtualNode____networkSpan = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge virtualNodeToServer__implDevice____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge virtualNodeToServer__virtualNode____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge reqContainer__reqAgent____agents = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge reqContainerToImplContainer__reqContainer____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge reqContainerToImplContainer__implContainer____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge implContainer__implDevice____devices = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String implContainer__cable____cables_name_prime = "cables";
		String reqContainer__virtualNode____networkSpan_name_prime = "networkSpan";
		String virtualNodeToServer__implDevice____target_name_prime = "target";
		String virtualNodeToServer__virtualNode____source_name_prime = "source";
		String reqContainer__reqAgent____agents_name_prime = "agents";
		String reqContainerToImplContainer__reqContainer____source_name_prime = "source";
		String reqContainerToImplContainer__implContainer____target_name_prime = "target";
		String implContainer__implDevice____devices_name_prime = "devices";
		isApplicableMatch.getAllContextElements().add(virtualNodeToServer);
		isApplicableMatch.getAllContextElements().add(implDevice);
		isApplicableMatch.getAllContextElements().add(reqAgent);
		isApplicableMatch.getAllContextElements().add(reqContainer);
		isApplicableMatch.getAllContextElements().add(virtualNode);
		isApplicableMatch.getAllContextElements().add(cable);
		isApplicableMatch.getAllContextElements().add(implContainer);
		isApplicableMatch.getAllContextElements().add(reqContainerToImplContainer);
		implContainer__cable____cables.setSrc(implContainer);
		implContainer__cable____cables.setTrg(cable);
		isApplicableMatch.getAllContextElements().add(implContainer__cable____cables);
		reqContainer__virtualNode____networkSpan.setSrc(reqContainer);
		reqContainer__virtualNode____networkSpan.setTrg(virtualNode);
		isApplicableMatch.getAllContextElements().add(reqContainer__virtualNode____networkSpan);
		virtualNodeToServer__implDevice____target.setSrc(virtualNodeToServer);
		virtualNodeToServer__implDevice____target.setTrg(implDevice);
		isApplicableMatch.getAllContextElements().add(virtualNodeToServer__implDevice____target);
		virtualNodeToServer__virtualNode____source.setSrc(virtualNodeToServer);
		virtualNodeToServer__virtualNode____source.setTrg(virtualNode);
		isApplicableMatch.getAllContextElements().add(virtualNodeToServer__virtualNode____source);
		reqContainer__reqAgent____agents.setSrc(reqContainer);
		reqContainer__reqAgent____agents.setTrg(reqAgent);
		isApplicableMatch.getAllContextElements().add(reqContainer__reqAgent____agents);
		reqContainerToImplContainer__reqContainer____source.setSrc(reqContainerToImplContainer);
		reqContainerToImplContainer__reqContainer____source.setTrg(reqContainer);
		isApplicableMatch.getAllContextElements().add(reqContainerToImplContainer__reqContainer____source);
		reqContainerToImplContainer__implContainer____target.setSrc(reqContainerToImplContainer);
		reqContainerToImplContainer__implContainer____target.setTrg(implContainer);
		isApplicableMatch.getAllContextElements().add(reqContainerToImplContainer__implContainer____target);
		implContainer__implDevice____devices.setSrc(implContainer);
		implContainer__implDevice____devices.setTrg(implDevice);
		isApplicableMatch.getAllContextElements().add(implContainer__implDevice____devices);
		implContainer__cable____cables.setName(implContainer__cable____cables_name_prime);
		reqContainer__virtualNode____networkSpan.setName(reqContainer__virtualNode____networkSpan_name_prime);
		virtualNodeToServer__implDevice____target.setName(virtualNodeToServer__implDevice____target_name_prime);
		virtualNodeToServer__virtualNode____source.setName(virtualNodeToServer__virtualNode____source_name_prime);
		reqContainer__reqAgent____agents.setName(reqContainer__reqAgent____agents_name_prime);
		reqContainerToImplContainer__reqContainer____source
				.setName(reqContainerToImplContainer__reqContainer____source_name_prime);
		reqContainerToImplContainer__implContainer____target
				.setName(reqContainerToImplContainer__implContainer____target_name_prime);
		implContainer__implDevice____devices.setName(implContainer__implDevice____devices_name_prime);
		return new Object[] { virtualNodeToServer, implDevice, reqAgent, reqContainer, virtualNode, cable,
				implContainer, reqContainerToImplContainer, isApplicableMatch, implContainer__cable____cables,
				reqContainer__virtualNode____networkSpan, virtualNodeToServer__implDevice____target,
				virtualNodeToServer__virtualNode____source, reqContainer__reqAgent____agents,
				reqContainerToImplContainer__reqContainer____source,
				reqContainerToImplContainer__implContainer____target, implContainer__implDevice____devices };
	}

	public static final Object[] pattern_ReqProviderToServerRule_2_4_solveCSP_bindingFBBBBBBBBBB(
			ReqProviderToServerRule _this, IsApplicableMatch isApplicableMatch, VirtualNodeToServer virtualNodeToServer,
			Server implDevice, Provider reqAgent, Container reqContainer, NetworkSpan virtualNode, Cable cable,
			implementation.Container implContainer, ReqContainerToImplContainer reqContainerToImplContainer) {
		CSP _localVariable_0 = _this.isApplicable_solveCsp_FWD(isApplicableMatch, virtualNodeToServer, implDevice,
				reqAgent, reqContainer, virtualNode, cable, implContainer, reqContainerToImplContainer);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, virtualNodeToServer, implDevice, reqAgent,
					reqContainer, virtualNode, cable, implContainer, reqContainerToImplContainer };
		}
		return null;
	}

	public static final Object[] pattern_ReqProviderToServerRule_2_4_solveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_ReqProviderToServerRule_2_4_solveCSP_bindingAndBlackFBBBBBBBBBB(
			ReqProviderToServerRule _this, IsApplicableMatch isApplicableMatch, VirtualNodeToServer virtualNodeToServer,
			Server implDevice, Provider reqAgent, Container reqContainer, NetworkSpan virtualNode, Cable cable,
			implementation.Container implContainer, ReqContainerToImplContainer reqContainerToImplContainer) {
		Object[] result_pattern_ReqProviderToServerRule_2_4_solveCSP_binding = pattern_ReqProviderToServerRule_2_4_solveCSP_bindingFBBBBBBBBBB(
				_this, isApplicableMatch, virtualNodeToServer, implDevice, reqAgent, reqContainer, virtualNode, cable,
				implContainer, reqContainerToImplContainer);
		if (result_pattern_ReqProviderToServerRule_2_4_solveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_ReqProviderToServerRule_2_4_solveCSP_binding[0];

			Object[] result_pattern_ReqProviderToServerRule_2_4_solveCSP_black = pattern_ReqProviderToServerRule_2_4_solveCSP_blackB(
					csp);
			if (result_pattern_ReqProviderToServerRule_2_4_solveCSP_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, virtualNodeToServer, implDevice, reqAgent,
						reqContainer, virtualNode, cable, implContainer, reqContainerToImplContainer };
			}
		}
		return null;
	}

	public static final boolean pattern_ReqProviderToServerRule_2_5_checkCSP_expressionFBB(
			ReqProviderToServerRule _this, CSP csp) {
		boolean _localVariable_0 = _this.isApplicable_checkCsp_FWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_ReqProviderToServerRule_2_6_addmatchtoruleresult_blackBB(
			IsApplicableRuleResult ruleresult, IsApplicableMatch isApplicableMatch) {
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final Object[] pattern_ReqProviderToServerRule_2_6_addmatchtoruleresult_greenBB(
			IsApplicableRuleResult ruleresult, IsApplicableMatch isApplicableMatch) {
		ruleresult.getIsApplicableMatch().add(isApplicableMatch);
		boolean ruleresult_success_prime = Boolean.valueOf(true);
		String isApplicableMatch_ruleName_prime = "ReqProviderToServerRule";
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		isApplicableMatch.setRuleName(isApplicableMatch_ruleName_prime);
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final IsApplicableRuleResult pattern_ReqProviderToServerRule_2_7_expressionFB(
			IsApplicableRuleResult ruleresult) {
		IsApplicableRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_ReqProviderToServerRule_10_1_initialbindings_blackBBBBB(
			ReqProviderToServerRule _this, Match match, Server implDevice, Cable cable,
			implementation.Container implContainer) {
		return new Object[] { _this, match, implDevice, cable, implContainer };
	}

	public static final Object[] pattern_ReqProviderToServerRule_10_2_SolveCSP_bindingFBBBBB(
			ReqProviderToServerRule _this, Match match, Server implDevice, Cable cable,
			implementation.Container implContainer) {
		CSP _localVariable_0 = _this.isAppropriate_solveCsp_BWD(match, implDevice, cable, implContainer);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, match, implDevice, cable, implContainer };
		}
		return null;
	}

	public static final Object[] pattern_ReqProviderToServerRule_10_2_SolveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_ReqProviderToServerRule_10_2_SolveCSP_bindingAndBlackFBBBBB(
			ReqProviderToServerRule _this, Match match, Server implDevice, Cable cable,
			implementation.Container implContainer) {
		Object[] result_pattern_ReqProviderToServerRule_10_2_SolveCSP_binding = pattern_ReqProviderToServerRule_10_2_SolveCSP_bindingFBBBBB(
				_this, match, implDevice, cable, implContainer);
		if (result_pattern_ReqProviderToServerRule_10_2_SolveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_ReqProviderToServerRule_10_2_SolveCSP_binding[0];

			Object[] result_pattern_ReqProviderToServerRule_10_2_SolveCSP_black = pattern_ReqProviderToServerRule_10_2_SolveCSP_blackB(
					csp);
			if (result_pattern_ReqProviderToServerRule_10_2_SolveCSP_black != null) {

				return new Object[] { csp, _this, match, implDevice, cable, implContainer };
			}
		}
		return null;
	}

	public static final boolean pattern_ReqProviderToServerRule_10_3_CheckCSP_expressionFBB(
			ReqProviderToServerRule _this, CSP csp) {
		boolean _localVariable_0 = _this.isAppropriate_checkCsp_BWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_ReqProviderToServerRule_10_4_collectelementstobetranslated_blackBBBB(
			Match match, Server implDevice, Cable cable, implementation.Container implContainer) {
		return new Object[] { match, implDevice, cable, implContainer };
	}

	public static final Object[] pattern_ReqProviderToServerRule_10_5_collectcontextelements_blackBBBB(Match match,
			Server implDevice, Cable cable, implementation.Container implContainer) {
		return new Object[] { match, implDevice, cable, implContainer };
	}

	public static final Object[] pattern_ReqProviderToServerRule_10_5_collectcontextelements_greenBBBBFF(Match match,
			Server implDevice, Cable cable, implementation.Container implContainer) {
		EMoflonEdge implContainer__cable____cables = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge implContainer__implDevice____devices = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		match.getContextNodes().add(implDevice);
		match.getContextNodes().add(cable);
		match.getContextNodes().add(implContainer);
		String implContainer__cable____cables_name_prime = "cables";
		String implContainer__implDevice____devices_name_prime = "devices";
		implContainer__cable____cables.setSrc(implContainer);
		implContainer__cable____cables.setTrg(cable);
		match.getContextEdges().add(implContainer__cable____cables);
		implContainer__implDevice____devices.setSrc(implContainer);
		implContainer__implDevice____devices.setTrg(implDevice);
		match.getContextEdges().add(implContainer__implDevice____devices);
		implContainer__cable____cables.setName(implContainer__cable____cables_name_prime);
		implContainer__implDevice____devices.setName(implContainer__implDevice____devices_name_prime);
		return new Object[] { match, implDevice, cable, implContainer, implContainer__cable____cables,
				implContainer__implDevice____devices };
	}

	public static final void pattern_ReqProviderToServerRule_10_6_registerobjectstomatch_expressionBBBBB(
			ReqProviderToServerRule _this, Match match, Server implDevice, Cable cable,
			implementation.Container implContainer) {
		_this.registerObjectsToMatch_BWD(match, implDevice, cable, implContainer);

	}

	public static final boolean pattern_ReqProviderToServerRule_10_7_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_ReqProviderToServerRule_10_8_expressionF() {
		boolean _result = Boolean.valueOf(false);
		return _result;
	}

	public static final Object[] pattern_ReqProviderToServerRule_17_1_preparereturnvalue_bindingFB(
			ReqProviderToServerRule _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_ReqProviderToServerRule_17_1_preparereturnvalue_blackFBBF(EClass __eClass,
			ReqProviderToServerRule _this) {
		for (EOperation __performOperation : __eClass.getEOperations()) {
			String __performOperation_name = __performOperation.getName();
			if (__performOperation_name.equals("isApplicable_BWD")) {
				for (EOperation isApplicableCC : __eClass.getEOperations()) {
					if (!__performOperation.equals(isApplicableCC)) {
						String isApplicableCC_name = isApplicableCC.getName();
						if (isApplicableCC_name.equals("isApplicable_CC")) {
							return new Object[] { __performOperation, __eClass, _this, isApplicableCC };
						}

					}
				}
			}

		}
		return null;
	}

	public static final Object[] pattern_ReqProviderToServerRule_17_1_preparereturnvalue_bindingAndBlackFFBF(
			ReqProviderToServerRule _this) {
		Object[] result_pattern_ReqProviderToServerRule_17_1_preparereturnvalue_binding = pattern_ReqProviderToServerRule_17_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_ReqProviderToServerRule_17_1_preparereturnvalue_binding != null) {
			EClass __eClass = (EClass) result_pattern_ReqProviderToServerRule_17_1_preparereturnvalue_binding[0];

			Object[] result_pattern_ReqProviderToServerRule_17_1_preparereturnvalue_black = pattern_ReqProviderToServerRule_17_1_preparereturnvalue_blackFBBF(
					__eClass, _this);
			if (result_pattern_ReqProviderToServerRule_17_1_preparereturnvalue_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_ReqProviderToServerRule_17_1_preparereturnvalue_black[0];
				EOperation isApplicableCC = (EOperation) result_pattern_ReqProviderToServerRule_17_1_preparereturnvalue_black[3];

				return new Object[] { __performOperation, __eClass, _this, isApplicableCC };
			}
		}
		return null;
	}

	public static final Object[] pattern_ReqProviderToServerRule_17_1_preparereturnvalue_greenF() {
		EObjectContainer __result = RuntimeFactory.eINSTANCE.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Iterable<Object[]> pattern_ReqProviderToServerRule_17_2_testcorematchandDECs_blackBFF(
			Server implDevice) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		for (implementation.Container implContainer : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(implDevice, implementation.Container.class, "devices")) {
			for (Cable cable : implContainer.getCables()) {
				_result.add(new Object[] { implDevice, cable, implContainer });
			}
		}
		return _result;
	}

	public static final Object[] pattern_ReqProviderToServerRule_17_2_testcorematchandDECs_greenFB(EClass __eClass) {
		Match match = RuntimeFactory.eINSTANCE.createMatch();
		String __eClass_name = __eClass.getName();
		String match_ruleName_prime = __eClass_name;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_ReqProviderToServerRule_17_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBBB(
			ReqProviderToServerRule _this, Match match, Server implDevice, Cable cable,
			implementation.Container implContainer) {
		boolean _localVariable_0 = _this.isAppropriate_BWD(match, implDevice, cable, implContainer);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_ReqProviderToServerRule_17_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(
			ReqProviderToServerRule _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_BWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_ReqProviderToServerRule_17_5_Addmatchtoruleresult_blackBBBB(Match match,
			EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		if (!__performOperation.equals(isApplicableCC)) {
			return new Object[] { match, __performOperation, __result, isApplicableCC };
		}
		return null;
	}

	public static final Object[] pattern_ReqProviderToServerRule_17_5_Addmatchtoruleresult_greenBBBB(Match match,
			EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		match.setIsApplicableCCOperation(isApplicableCC);
		return new Object[] { match, __performOperation, __result, isApplicableCC };
	}

	public static final EObjectContainer pattern_ReqProviderToServerRule_17_6_expressionFB(EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_ReqProviderToServerRule_18_1_preparereturnvalue_bindingFB(
			ReqProviderToServerRule _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_ReqProviderToServerRule_18_1_preparereturnvalue_blackFBBF(EClass __eClass,
			ReqProviderToServerRule _this) {
		for (EOperation __performOperation : __eClass.getEOperations()) {
			String __performOperation_name = __performOperation.getName();
			if (__performOperation_name.equals("isApplicable_FWD")) {
				for (EOperation isApplicableCC : __eClass.getEOperations()) {
					if (!__performOperation.equals(isApplicableCC)) {
						String isApplicableCC_name = isApplicableCC.getName();
						if (isApplicableCC_name.equals("isApplicable_CC")) {
							return new Object[] { __performOperation, __eClass, _this, isApplicableCC };
						}

					}
				}
			}

		}
		return null;
	}

	public static final Object[] pattern_ReqProviderToServerRule_18_1_preparereturnvalue_bindingAndBlackFFBF(
			ReqProviderToServerRule _this) {
		Object[] result_pattern_ReqProviderToServerRule_18_1_preparereturnvalue_binding = pattern_ReqProviderToServerRule_18_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_ReqProviderToServerRule_18_1_preparereturnvalue_binding != null) {
			EClass __eClass = (EClass) result_pattern_ReqProviderToServerRule_18_1_preparereturnvalue_binding[0];

			Object[] result_pattern_ReqProviderToServerRule_18_1_preparereturnvalue_black = pattern_ReqProviderToServerRule_18_1_preparereturnvalue_blackFBBF(
					__eClass, _this);
			if (result_pattern_ReqProviderToServerRule_18_1_preparereturnvalue_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_ReqProviderToServerRule_18_1_preparereturnvalue_black[0];
				EOperation isApplicableCC = (EOperation) result_pattern_ReqProviderToServerRule_18_1_preparereturnvalue_black[3];

				return new Object[] { __performOperation, __eClass, _this, isApplicableCC };
			}
		}
		return null;
	}

	public static final Object[] pattern_ReqProviderToServerRule_18_1_preparereturnvalue_greenF() {
		EObjectContainer __result = RuntimeFactory.eINSTANCE.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Iterable<Object[]> pattern_ReqProviderToServerRule_18_2_testcorematchandDECs_blackFFFB(
			EMoflonEdge _edge_agents) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		EObject tmpReqContainer = _edge_agents.getSrc();
		if (tmpReqContainer instanceof Container) {
			Container reqContainer = (Container) tmpReqContainer;
			EObject tmpReqAgent = _edge_agents.getTrg();
			if (tmpReqAgent instanceof Provider) {
				Provider reqAgent = (Provider) tmpReqAgent;
				if (reqContainer.getAgents().contains(reqAgent)) {
					NetworkSpan virtualNode = reqContainer.getNetworkSpan();
					if (virtualNode != null) {
						_result.add(new Object[] { reqAgent, reqContainer, virtualNode, _edge_agents });
					}

				}
			}

		}

		return _result;
	}

	public static final Object[] pattern_ReqProviderToServerRule_18_2_testcorematchandDECs_greenFB(EClass __eClass) {
		Match match = RuntimeFactory.eINSTANCE.createMatch();
		String __eClass_name = __eClass.getName();
		String match_ruleName_prime = __eClass_name;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_ReqProviderToServerRule_18_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBBB(
			ReqProviderToServerRule _this, Match match, Provider reqAgent, Container reqContainer,
			NetworkSpan virtualNode) {
		boolean _localVariable_0 = _this.isAppropriate_FWD(match, reqAgent, reqContainer, virtualNode);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_ReqProviderToServerRule_18_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(
			ReqProviderToServerRule _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_FWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_ReqProviderToServerRule_18_5_Addmatchtoruleresult_blackBBBB(Match match,
			EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		if (!__performOperation.equals(isApplicableCC)) {
			return new Object[] { match, __performOperation, __result, isApplicableCC };
		}
		return null;
	}

	public static final Object[] pattern_ReqProviderToServerRule_18_5_Addmatchtoruleresult_greenBBBB(Match match,
			EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		match.setIsApplicableCCOperation(isApplicableCC);
		return new Object[] { match, __performOperation, __result, isApplicableCC };
	}

	public static final EObjectContainer pattern_ReqProviderToServerRule_18_6_expressionFB(EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_ReqProviderToServerRule_21_1_prepare_blackB(ReqProviderToServerRule _this) {
		return new Object[] { _this };
	}

	public static final Object[] pattern_ReqProviderToServerRule_21_1_prepare_greenF() {
		IsApplicableRuleResult result = RuntimeFactory.eINSTANCE.createIsApplicableRuleResult();
		return new Object[] { result };
	}

	public static final Object[] pattern_ReqProviderToServerRule_21_2_matchsrctrgcontext_bindingFFFFFFBB(
			Match targetMatch, Match sourceMatch) {
		EObject _localVariable_0 = targetMatch.getObject("implDevice");
		EObject _localVariable_1 = sourceMatch.getObject("reqAgent");
		EObject _localVariable_2 = sourceMatch.getObject("reqContainer");
		EObject _localVariable_3 = sourceMatch.getObject("virtualNode");
		EObject _localVariable_4 = targetMatch.getObject("cable");
		EObject _localVariable_5 = targetMatch.getObject("implContainer");
		EObject tmpImplDevice = _localVariable_0;
		EObject tmpReqAgent = _localVariable_1;
		EObject tmpReqContainer = _localVariable_2;
		EObject tmpVirtualNode = _localVariable_3;
		EObject tmpCable = _localVariable_4;
		EObject tmpImplContainer = _localVariable_5;
		if (tmpImplDevice instanceof Server) {
			Server implDevice = (Server) tmpImplDevice;
			if (tmpReqAgent instanceof Provider) {
				Provider reqAgent = (Provider) tmpReqAgent;
				if (tmpReqContainer instanceof Container) {
					Container reqContainer = (Container) tmpReqContainer;
					if (tmpVirtualNode instanceof NetworkSpan) {
						NetworkSpan virtualNode = (NetworkSpan) tmpVirtualNode;
						if (tmpCable instanceof Cable) {
							Cable cable = (Cable) tmpCable;
							if (tmpImplContainer instanceof implementation.Container) {
								implementation.Container implContainer = (implementation.Container) tmpImplContainer;
								return new Object[] { implDevice, reqAgent, reqContainer, virtualNode, cable,
										implContainer, targetMatch, sourceMatch };
							}
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_ReqProviderToServerRule_21_2_matchsrctrgcontext_blackBBBBBBBB(
			Server implDevice, Provider reqAgent, Container reqContainer, NetworkSpan virtualNode, Cable cable,
			implementation.Container implContainer, Match sourceMatch, Match targetMatch) {
		if (!sourceMatch.equals(targetMatch)) {
			return new Object[] { implDevice, reqAgent, reqContainer, virtualNode, cable, implContainer, sourceMatch,
					targetMatch };
		}
		return null;
	}

	public static final Object[] pattern_ReqProviderToServerRule_21_2_matchsrctrgcontext_bindingAndBlackFFFFFFBB(
			Match sourceMatch, Match targetMatch) {
		Object[] result_pattern_ReqProviderToServerRule_21_2_matchsrctrgcontext_binding = pattern_ReqProviderToServerRule_21_2_matchsrctrgcontext_bindingFFFFFFBB(
				targetMatch, sourceMatch);
		if (result_pattern_ReqProviderToServerRule_21_2_matchsrctrgcontext_binding != null) {
			Server implDevice = (Server) result_pattern_ReqProviderToServerRule_21_2_matchsrctrgcontext_binding[0];
			Provider reqAgent = (Provider) result_pattern_ReqProviderToServerRule_21_2_matchsrctrgcontext_binding[1];
			Container reqContainer = (Container) result_pattern_ReqProviderToServerRule_21_2_matchsrctrgcontext_binding[2];
			NetworkSpan virtualNode = (NetworkSpan) result_pattern_ReqProviderToServerRule_21_2_matchsrctrgcontext_binding[3];
			Cable cable = (Cable) result_pattern_ReqProviderToServerRule_21_2_matchsrctrgcontext_binding[4];
			implementation.Container implContainer = (implementation.Container) result_pattern_ReqProviderToServerRule_21_2_matchsrctrgcontext_binding[5];

			Object[] result_pattern_ReqProviderToServerRule_21_2_matchsrctrgcontext_black = pattern_ReqProviderToServerRule_21_2_matchsrctrgcontext_blackBBBBBBBB(
					implDevice, reqAgent, reqContainer, virtualNode, cable, implContainer, sourceMatch, targetMatch);
			if (result_pattern_ReqProviderToServerRule_21_2_matchsrctrgcontext_black != null) {

				return new Object[] { implDevice, reqAgent, reqContainer, virtualNode, cable, implContainer,
						sourceMatch, targetMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_ReqProviderToServerRule_21_3_solvecsp_bindingFBBBBBBBBB(
			ReqProviderToServerRule _this, Server implDevice, Provider reqAgent, Container reqContainer,
			NetworkSpan virtualNode, Cable cable, implementation.Container implContainer, Match sourceMatch,
			Match targetMatch) {
		CSP _localVariable_6 = _this.isApplicable_solveCsp_CC(implDevice, reqAgent, reqContainer, virtualNode, cable,
				implContainer, sourceMatch, targetMatch);
		CSP csp = _localVariable_6;
		if (csp != null) {
			return new Object[] { csp, _this, implDevice, reqAgent, reqContainer, virtualNode, cable, implContainer,
					sourceMatch, targetMatch };
		}
		return null;
	}

	public static final Object[] pattern_ReqProviderToServerRule_21_3_solvecsp_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_ReqProviderToServerRule_21_3_solvecsp_bindingAndBlackFBBBBBBBBB(
			ReqProviderToServerRule _this, Server implDevice, Provider reqAgent, Container reqContainer,
			NetworkSpan virtualNode, Cable cable, implementation.Container implContainer, Match sourceMatch,
			Match targetMatch) {
		Object[] result_pattern_ReqProviderToServerRule_21_3_solvecsp_binding = pattern_ReqProviderToServerRule_21_3_solvecsp_bindingFBBBBBBBBB(
				_this, implDevice, reqAgent, reqContainer, virtualNode, cable, implContainer, sourceMatch, targetMatch);
		if (result_pattern_ReqProviderToServerRule_21_3_solvecsp_binding != null) {
			CSP csp = (CSP) result_pattern_ReqProviderToServerRule_21_3_solvecsp_binding[0];

			Object[] result_pattern_ReqProviderToServerRule_21_3_solvecsp_black = pattern_ReqProviderToServerRule_21_3_solvecsp_blackB(
					csp);
			if (result_pattern_ReqProviderToServerRule_21_3_solvecsp_black != null) {

				return new Object[] { csp, _this, implDevice, reqAgent, reqContainer, virtualNode, cable, implContainer,
						sourceMatch, targetMatch };
			}
		}
		return null;
	}

	public static final boolean pattern_ReqProviderToServerRule_21_4_checkCSP_expressionFB(CSP csp) {
		boolean _localVariable_0 = csp.check();
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Iterable<Object[]> pattern_ReqProviderToServerRule_21_5_matchcorrcontext_blackFBBBBFBB(
			Server implDevice, Container reqContainer, NetworkSpan virtualNode, implementation.Container implContainer,
			Match sourceMatch, Match targetMatch) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (!sourceMatch.equals(targetMatch)) {
			for (VirtualNodeToServer virtualNodeToServer : org.moflon.core.utilities.eMoflonEMFUtil
					.getOppositeReferenceTyped(implDevice, VirtualNodeToServer.class, "target")) {
				if (virtualNode.equals(virtualNodeToServer.getSource())) {
					for (ReqContainerToImplContainer reqContainerToImplContainer : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(reqContainer, ReqContainerToImplContainer.class, "source")) {
						if (implContainer.equals(reqContainerToImplContainer.getTarget())) {
							_result.add(new Object[] { virtualNodeToServer, implDevice, reqContainer, virtualNode,
									implContainer, reqContainerToImplContainer, sourceMatch, targetMatch });
						}
					}
				}
			}
		}
		return _result;
	}

	public static final Object[] pattern_ReqProviderToServerRule_21_5_matchcorrcontext_greenBBBBF(
			VirtualNodeToServer virtualNodeToServer, ReqContainerToImplContainer reqContainerToImplContainer,
			Match sourceMatch, Match targetMatch) {
		CCMatch ccMatch = RuntimeFactory.eINSTANCE.createCCMatch();
		String ccMatch_ruleName_prime = "ReqProviderToServerRule";
		ccMatch.setSourceMatch(sourceMatch);
		ccMatch.setTargetMatch(targetMatch);
		ccMatch.getAllContextElements().add(virtualNodeToServer);
		ccMatch.getAllContextElements().add(reqContainerToImplContainer);
		ccMatch.setRuleName(ccMatch_ruleName_prime);
		return new Object[] { virtualNodeToServer, reqContainerToImplContainer, sourceMatch, targetMatch, ccMatch };
	}

	public static final Object[] pattern_ReqProviderToServerRule_21_6_createcorrespondence_blackBBBBBBB(
			Server implDevice, Provider reqAgent, Container reqContainer, NetworkSpan virtualNode, Cable cable,
			implementation.Container implContainer, CCMatch ccMatch) {
		return new Object[] { implDevice, reqAgent, reqContainer, virtualNode, cable, implContainer, ccMatch };
	}

	public static final Object[] pattern_ReqProviderToServerRule_21_6_createcorrespondence_greenBFBB(Server implDevice,
			Provider reqAgent, CCMatch ccMatch) {
		ReqAgentToImplDevice reqAgentToImplDevice = ReqToImpTransformatorFactory.eINSTANCE.createReqAgentToImplDevice();
		reqAgentToImplDevice.setSource(reqAgent);
		reqAgentToImplDevice.setTarget(implDevice);
		ccMatch.getCreateCorr().add(reqAgentToImplDevice);
		return new Object[] { implDevice, reqAgentToImplDevice, reqAgent, ccMatch };
	}

	public static final Object[] pattern_ReqProviderToServerRule_21_7_addtoreturnedresult_blackBB(
			IsApplicableRuleResult result, CCMatch ccMatch) {
		return new Object[] { result, ccMatch };
	}

	public static final Object[] pattern_ReqProviderToServerRule_21_7_addtoreturnedresult_greenBB(
			IsApplicableRuleResult result, CCMatch ccMatch) {
		result.getIsApplicableMatch().add(ccMatch);
		boolean result_success_prime = Boolean.valueOf(true);
		String ccMatch_ruleName_prime = "ReqProviderToServerRule";
		result.setSuccess(Boolean.valueOf(result_success_prime));
		ccMatch.setRuleName(ccMatch_ruleName_prime);
		return new Object[] { result, ccMatch };
	}

	public static final IsApplicableRuleResult pattern_ReqProviderToServerRule_21_8_expressionFB(
			IsApplicableRuleResult result) {
		IsApplicableRuleResult _result = result;
		return _result;
	}

	public static final Object[] pattern_ReqProviderToServerRule_24_1_matchtggpattern_blackBBB(Provider reqAgent,
			Container reqContainer, NetworkSpan virtualNode) {
		if (virtualNode.equals(reqContainer.getNetworkSpan())) {
			if (reqContainer.getAgents().contains(reqAgent)) {
				return new Object[] { reqAgent, reqContainer, virtualNode };
			}
		}
		return null;
	}

	public static final boolean pattern_ReqProviderToServerRule_24_2_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_ReqProviderToServerRule_24_3_expressionF() {
		boolean _result = Boolean.valueOf(false);
		return _result;
	}

	public static final Object[] pattern_ReqProviderToServerRule_25_1_matchtggpattern_blackBBB(Server implDevice,
			Cable cable, implementation.Container implContainer) {
		if (implContainer.getCables().contains(cable)) {
			if (implContainer.getDevices().contains(implDevice)) {
				return new Object[] { implDevice, cable, implContainer };
			}
		}
		return null;
	}

	public static final boolean pattern_ReqProviderToServerRule_25_2_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_ReqProviderToServerRule_25_3_expressionF() {
		boolean _result = Boolean.valueOf(false);
		return _result;
	}

	public static final Object[] pattern_ReqProviderToServerRule_26_1_createresult_blackB(
			ReqProviderToServerRule _this) {
		return new Object[] { _this };
	}

	public static final Object[] pattern_ReqProviderToServerRule_26_1_createresult_greenFF() {
		IsApplicableMatch isApplicableMatch = RuntimeFactory.eINSTANCE.createIsApplicableMatch();
		ModelgeneratorRuleResult ruleResult = RuntimeFactory.eINSTANCE.createModelgeneratorRuleResult();
		boolean ruleResult_success_prime = Boolean.valueOf(false);
		ruleResult.setSuccess(Boolean.valueOf(ruleResult_success_prime));
		return new Object[] { isApplicableMatch, ruleResult };
	}

	public static final Object[] pattern_ReqProviderToServerRule_26_2_isapplicablecore_black_nac_0BB(
			ModelgeneratorRuleResult ruleResult, VirtualNodeToServer virtualNodeToServer) {
		if (ruleResult.getCorrObjects().contains(virtualNodeToServer)) {
			return new Object[] { ruleResult, virtualNodeToServer };
		}
		return null;
	}

	public static final Object[] pattern_ReqProviderToServerRule_26_2_isapplicablecore_black_nac_1BB(
			ModelgeneratorRuleResult ruleResult, NetworkSpan virtualNode) {
		if (ruleResult.getSourceObjects().contains(virtualNode)) {
			return new Object[] { ruleResult, virtualNode };
		}
		return null;
	}

	public static final Object[] pattern_ReqProviderToServerRule_26_2_isapplicablecore_black_nac_2BB(
			ModelgeneratorRuleResult ruleResult, Container reqContainer) {
		if (ruleResult.getSourceObjects().contains(reqContainer)) {
			return new Object[] { ruleResult, reqContainer };
		}
		return null;
	}

	public static final Object[] pattern_ReqProviderToServerRule_26_2_isapplicablecore_black_nac_3BB(
			ModelgeneratorRuleResult ruleResult, ReqContainerToImplContainer reqContainerToImplContainer) {
		if (ruleResult.getCorrObjects().contains(reqContainerToImplContainer)) {
			return new Object[] { ruleResult, reqContainerToImplContainer };
		}
		return null;
	}

	public static final Object[] pattern_ReqProviderToServerRule_26_2_isapplicablecore_black_nac_4BB(
			ModelgeneratorRuleResult ruleResult, implementation.Container implContainer) {
		if (ruleResult.getTargetObjects().contains(implContainer)) {
			return new Object[] { ruleResult, implContainer };
		}
		return null;
	}

	public static final Object[] pattern_ReqProviderToServerRule_26_2_isapplicablecore_black_nac_5BB(
			ModelgeneratorRuleResult ruleResult, Server implDevice) {
		if (ruleResult.getTargetObjects().contains(implDevice)) {
			return new Object[] { ruleResult, implDevice };
		}
		return null;
	}

	public static final Object[] pattern_ReqProviderToServerRule_26_2_isapplicablecore_black_nac_6BB(
			ModelgeneratorRuleResult ruleResult, Cable cable) {
		if (ruleResult.getTargetObjects().contains(cable)) {
			return new Object[] { ruleResult, cable };
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_ReqProviderToServerRule_26_2_isapplicablecore_blackFFFFFFFFBB(
			RuleEntryContainer ruleEntryContainer, ModelgeneratorRuleResult ruleResult) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		for (RuleEntryList virtualNodeToServerList : ruleEntryContainer.getRuleEntryList()) {
			for (EObject tmpVirtualNodeToServer : virtualNodeToServerList.getEntryObjects()) {
				if (tmpVirtualNodeToServer instanceof VirtualNodeToServer) {
					VirtualNodeToServer virtualNodeToServer = (VirtualNodeToServer) tmpVirtualNodeToServer;
					NetworkSpan virtualNode = virtualNodeToServer.getSource();
					if (virtualNode != null) {
						Server implDevice = virtualNodeToServer.getTarget();
						if (implDevice != null) {
							if (pattern_ReqProviderToServerRule_26_2_isapplicablecore_black_nac_0BB(ruleResult,
									virtualNodeToServer) == null) {
								if (pattern_ReqProviderToServerRule_26_2_isapplicablecore_black_nac_1BB(ruleResult,
										virtualNode) == null) {
									if (pattern_ReqProviderToServerRule_26_2_isapplicablecore_black_nac_5BB(ruleResult,
											implDevice) == null) {
										for (Container reqContainer : org.moflon.core.utilities.eMoflonEMFUtil
												.getOppositeReferenceTyped(virtualNode, Container.class,
														"networkSpan")) {
											if (pattern_ReqProviderToServerRule_26_2_isapplicablecore_black_nac_2BB(
													ruleResult, reqContainer) == null) {
												for (implementation.Container implContainer : org.moflon.core.utilities.eMoflonEMFUtil
														.getOppositeReferenceTyped(implDevice,
																implementation.Container.class, "devices")) {
													if (pattern_ReqProviderToServerRule_26_2_isapplicablecore_black_nac_4BB(
															ruleResult, implContainer) == null) {
														for (Cable cable : implContainer.getCables()) {
															if (pattern_ReqProviderToServerRule_26_2_isapplicablecore_black_nac_6BB(
																	ruleResult, cable) == null) {
																for (ReqContainerToImplContainer reqContainerToImplContainer : org.moflon.core.utilities.eMoflonEMFUtil
																		.getOppositeReferenceTyped(reqContainer,
																				ReqContainerToImplContainer.class,
																				"source")) {
																	if (implContainer.equals(
																			reqContainerToImplContainer.getTarget())) {
																		if (pattern_ReqProviderToServerRule_26_2_isapplicablecore_black_nac_3BB(
																				ruleResult,
																				reqContainerToImplContainer) == null) {
																			_result.add(new Object[] {
																					virtualNodeToServerList,
																					virtualNodeToServer, virtualNode,
																					reqContainer,
																					reqContainerToImplContainer,
																					implContainer, implDevice, cable,
																					ruleEntryContainer, ruleResult });
																		}
																	}
																}
															}
														}
													}
												}
											}
										}
									}
								}
							}
						}

					}

				}
			}
		}
		return _result;
	}

	public static final Object[] pattern_ReqProviderToServerRule_26_3_solveCSP_bindingFBBBBBBBBBB(
			ReqProviderToServerRule _this, IsApplicableMatch isApplicableMatch, VirtualNodeToServer virtualNodeToServer,
			Server implDevice, Container reqContainer, NetworkSpan virtualNode, Cable cable,
			implementation.Container implContainer, ReqContainerToImplContainer reqContainerToImplContainer,
			ModelgeneratorRuleResult ruleResult) {
		CSP _localVariable_0 = _this.generateModel_solveCsp_BWD(isApplicableMatch, virtualNodeToServer, implDevice,
				reqContainer, virtualNode, cable, implContainer, reqContainerToImplContainer, ruleResult);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, virtualNodeToServer, implDevice, reqContainer,
					virtualNode, cable, implContainer, reqContainerToImplContainer, ruleResult };
		}
		return null;
	}

	public static final Object[] pattern_ReqProviderToServerRule_26_3_solveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_ReqProviderToServerRule_26_3_solveCSP_bindingAndBlackFBBBBBBBBBB(
			ReqProviderToServerRule _this, IsApplicableMatch isApplicableMatch, VirtualNodeToServer virtualNodeToServer,
			Server implDevice, Container reqContainer, NetworkSpan virtualNode, Cable cable,
			implementation.Container implContainer, ReqContainerToImplContainer reqContainerToImplContainer,
			ModelgeneratorRuleResult ruleResult) {
		Object[] result_pattern_ReqProviderToServerRule_26_3_solveCSP_binding = pattern_ReqProviderToServerRule_26_3_solveCSP_bindingFBBBBBBBBBB(
				_this, isApplicableMatch, virtualNodeToServer, implDevice, reqContainer, virtualNode, cable,
				implContainer, reqContainerToImplContainer, ruleResult);
		if (result_pattern_ReqProviderToServerRule_26_3_solveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_ReqProviderToServerRule_26_3_solveCSP_binding[0];

			Object[] result_pattern_ReqProviderToServerRule_26_3_solveCSP_black = pattern_ReqProviderToServerRule_26_3_solveCSP_blackB(
					csp);
			if (result_pattern_ReqProviderToServerRule_26_3_solveCSP_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, virtualNodeToServer, implDevice, reqContainer,
						virtualNode, cable, implContainer, reqContainerToImplContainer, ruleResult };
			}
		}
		return null;
	}

	public static final boolean pattern_ReqProviderToServerRule_26_4_checkCSP_expressionFBB(
			ReqProviderToServerRule _this, CSP csp) {
		boolean _localVariable_0 = _this.generateModel_checkCsp_BWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_ReqProviderToServerRule_26_5_checknacs_blackBBBBBBB(
			VirtualNodeToServer virtualNodeToServer, Server implDevice, Container reqContainer, NetworkSpan virtualNode,
			Cable cable, implementation.Container implContainer,
			ReqContainerToImplContainer reqContainerToImplContainer) {
		return new Object[] { virtualNodeToServer, implDevice, reqContainer, virtualNode, cable, implContainer,
				reqContainerToImplContainer };
	}

	public static final Object[] pattern_ReqProviderToServerRule_26_6_perform_blackBBBBBBBB(
			VirtualNodeToServer virtualNodeToServer, Server implDevice, Container reqContainer, NetworkSpan virtualNode,
			Cable cable, implementation.Container implContainer,
			ReqContainerToImplContainer reqContainerToImplContainer, ModelgeneratorRuleResult ruleResult) {
		return new Object[] { virtualNodeToServer, implDevice, reqContainer, virtualNode, cable, implContainer,
				reqContainerToImplContainer, ruleResult };
	}

	public static final Object[] pattern_ReqProviderToServerRule_26_6_perform_greenBFFBB(Server implDevice,
			Container reqContainer, ModelgeneratorRuleResult ruleResult) {
		ReqAgentToImplDevice reqAgentToImplDevice = ReqToImpTransformatorFactory.eINSTANCE.createReqAgentToImplDevice();
		Provider reqAgent = RequirementsFactory.eINSTANCE.createProvider();
		boolean ruleResult_success_prime = Boolean.valueOf(true);
		int _localVariable_0 = ruleResult.getIncrementedPerformCount();
		reqAgentToImplDevice.setTarget(implDevice);
		ruleResult.getCorrObjects().add(reqAgentToImplDevice);
		reqAgentToImplDevice.setSource(reqAgent);
		reqContainer.getAgents().add(reqAgent);
		ruleResult.getSourceObjects().add(reqAgent);
		ruleResult.setSuccess(Boolean.valueOf(ruleResult_success_prime));
		int ruleResult_performCount_prime = Integer.valueOf(_localVariable_0);
		ruleResult.setPerformCount(Integer.valueOf(ruleResult_performCount_prime));
		return new Object[] { implDevice, reqAgentToImplDevice, reqAgent, reqContainer, ruleResult };
	}

	public static final ModelgeneratorRuleResult pattern_ReqProviderToServerRule_26_7_expressionFB(
			ModelgeneratorRuleResult ruleResult) {
		ModelgeneratorRuleResult _result = ruleResult;
		return _result;
	}

	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} //ReqProviderToServerRuleImpl
