/**
 */
package ReqToImpTransformator.Rules.impl;

import ReqToImpTransformator.ReqAgentToImplDevice;
import ReqToImpTransformator.ReqContainerToImplContainer;
import ReqToImpTransformator.ReqToImpTransformatorFactory;

import ReqToImpTransformator.Rules.ReqConsumerToComputerRule;
import ReqToImpTransformator.Rules.RulesPackage;

import ReqToImpTransformator.VirtualNodeToComputer;

import implementation.Cable;
import implementation.Computer;

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

import requirements.Consumer;
import requirements.Container;
import requirements.NetworkSpan;
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
 * An implementation of the model object '<em><b>Req Consumer To Computer Rule</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class ReqConsumerToComputerRuleImpl extends AbstractRuleImpl implements ReqConsumerToComputerRule {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ReqConsumerToComputerRuleImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RulesPackage.eINSTANCE.getReqConsumerToComputerRule();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAppropriate_FWD(Match match, Consumer reqAgent, Container reqContainer, NetworkSpan virtualNode) {

		Object[] result1_black = ReqConsumerToComputerRuleImpl
				.pattern_ReqConsumerToComputerRule_0_1_initialbindings_blackBBBBB(this, match, reqAgent, reqContainer,
						virtualNode);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[match] = " + match + ", " + "[reqAgent] = " + reqAgent + ", " + "[reqContainer] = "
					+ reqContainer + ", " + "[virtualNode] = " + virtualNode + ".");
		}

		Object[] result2_bindingAndBlack = ReqConsumerToComputerRuleImpl
				.pattern_ReqConsumerToComputerRule_0_2_SolveCSP_bindingAndBlackFBBBBB(this, match, reqAgent,
						reqContainer, virtualNode);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[match] = " + match + ", " + "[reqAgent] = " + reqAgent + ", " + "[reqContainer] = "
					+ reqContainer + ", " + "[virtualNode] = " + virtualNode + ".");
		}
		CSP csp = (CSP) result2_bindingAndBlack[0];
		// 
		if (ReqConsumerToComputerRuleImpl.pattern_ReqConsumerToComputerRule_0_3_CheckCSP_expressionFBB(this, csp)) {

			Object[] result4_black = ReqConsumerToComputerRuleImpl
					.pattern_ReqConsumerToComputerRule_0_4_collectelementstobetranslated_blackBBBB(match, reqAgent,
							reqContainer, virtualNode);
			if (result4_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match + ", "
						+ "[reqAgent] = " + reqAgent + ", " + "[reqContainer] = " + reqContainer + ", "
						+ "[virtualNode] = " + virtualNode + ".");
			}
			ReqConsumerToComputerRuleImpl.pattern_ReqConsumerToComputerRule_0_4_collectelementstobetranslated_greenBBBF(
					match, reqAgent, reqContainer);
			//nothing EMoflonEdge reqContainer__reqAgent____agents = (EMoflonEdge) result4_green[3];

			Object[] result5_black = ReqConsumerToComputerRuleImpl
					.pattern_ReqConsumerToComputerRule_0_5_collectcontextelements_blackBBBB(match, reqAgent,
							reqContainer, virtualNode);
			if (result5_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match + ", "
						+ "[reqAgent] = " + reqAgent + ", " + "[reqContainer] = " + reqContainer + ", "
						+ "[virtualNode] = " + virtualNode + ".");
			}
			ReqConsumerToComputerRuleImpl.pattern_ReqConsumerToComputerRule_0_5_collectcontextelements_greenBBBF(match,
					reqContainer, virtualNode);
			//nothing EMoflonEdge reqContainer__virtualNode____networkSpan = (EMoflonEdge) result5_green[3];

			// 
			ReqConsumerToComputerRuleImpl.pattern_ReqConsumerToComputerRule_0_6_registerobjectstomatch_expressionBBBBB(
					this, match, reqAgent, reqContainer, virtualNode);
			return ReqConsumerToComputerRuleImpl.pattern_ReqConsumerToComputerRule_0_7_expressionF();
		} else {
			return ReqConsumerToComputerRuleImpl.pattern_ReqConsumerToComputerRule_0_8_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PerformRuleResult perform_FWD(IsApplicableMatch isApplicableMatch) {

		Object[] result1_bindingAndBlack = ReqConsumerToComputerRuleImpl
				.pattern_ReqConsumerToComputerRule_1_1_performtransformation_bindingAndBlackFFFFFFFFFBB(this,
						isApplicableMatch);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[isApplicableMatch] = " + isApplicableMatch + ".");
		}
		Computer implDevice = (Computer) result1_bindingAndBlack[0];
		Consumer reqAgent = (Consumer) result1_bindingAndBlack[1];
		Container reqContainer = (Container) result1_bindingAndBlack[2];
		VirtualNodeToComputer virtualNodeToComputer = (VirtualNodeToComputer) result1_bindingAndBlack[3];
		NetworkSpan virtualNode = (NetworkSpan) result1_bindingAndBlack[4];
		Cable cable = (Cable) result1_bindingAndBlack[5];
		implementation.Container implContainer = (implementation.Container) result1_bindingAndBlack[6];
		ReqContainerToImplContainer reqContainerToImplContainer = (ReqContainerToImplContainer) result1_bindingAndBlack[7];
		//nothing CSP csp = (CSP) result1_bindingAndBlack[8];
		Object[] result1_green = ReqConsumerToComputerRuleImpl
				.pattern_ReqConsumerToComputerRule_1_1_performtransformation_greenFBB(implDevice, reqAgent);
		ReqAgentToImplDevice reqAgentToImplDevice = (ReqAgentToImplDevice) result1_green[0];

		Object[] result2_black = ReqConsumerToComputerRuleImpl
				.pattern_ReqConsumerToComputerRule_1_2_collecttranslatedelements_blackBB(reqAgentToImplDevice,
						reqAgent);
		if (result2_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[reqAgentToImplDevice] = "
					+ reqAgentToImplDevice + ", " + "[reqAgent] = " + reqAgent + ".");
		}
		Object[] result2_green = ReqConsumerToComputerRuleImpl
				.pattern_ReqConsumerToComputerRule_1_2_collecttranslatedelements_greenFBB(reqAgentToImplDevice,
						reqAgent);
		PerformRuleResult ruleresult = (PerformRuleResult) result2_green[0];

		Object[] result3_black = ReqConsumerToComputerRuleImpl
				.pattern_ReqConsumerToComputerRule_1_3_bookkeepingforedges_blackBBBBBBBBBB(ruleresult,
						reqAgentToImplDevice, implDevice, reqAgent, reqContainer, virtualNodeToComputer, virtualNode,
						cable, implContainer, reqContainerToImplContainer);
		if (result3_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[ruleresult] = " + ruleresult
					+ ", " + "[reqAgentToImplDevice] = " + reqAgentToImplDevice + ", " + "[implDevice] = " + implDevice
					+ ", " + "[reqAgent] = " + reqAgent + ", " + "[reqContainer] = " + reqContainer + ", "
					+ "[virtualNodeToComputer] = " + virtualNodeToComputer + ", " + "[virtualNode] = " + virtualNode
					+ ", " + "[cable] = " + cable + ", " + "[implContainer] = " + implContainer + ", "
					+ "[reqContainerToImplContainer] = " + reqContainerToImplContainer + ".");
		}
		ReqConsumerToComputerRuleImpl.pattern_ReqConsumerToComputerRule_1_3_bookkeepingforedges_greenBBBBBFFF(
				ruleresult, reqAgentToImplDevice, implDevice, reqAgent, reqContainer);
		//nothing EMoflonEdge reqAgentToImplDevice__reqAgent____source = (EMoflonEdge) result3_green[5];
		//nothing EMoflonEdge reqAgentToImplDevice__implDevice____target = (EMoflonEdge) result3_green[6];
		//nothing EMoflonEdge reqContainer__reqAgent____agents = (EMoflonEdge) result3_green[7];

		// 
		// 
		ReqConsumerToComputerRuleImpl.pattern_ReqConsumerToComputerRule_1_5_registerobjects_expressionBBBBBBBBBBB(this,
				ruleresult, reqAgentToImplDevice, implDevice, reqAgent, reqContainer, virtualNodeToComputer,
				virtualNode, cable, implContainer, reqContainerToImplContainer);
		return ReqConsumerToComputerRuleImpl.pattern_ReqConsumerToComputerRule_1_6_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IsApplicableRuleResult isApplicable_FWD(Match match) {

		Object[] result1_bindingAndBlack = ReqConsumerToComputerRuleImpl
				.pattern_ReqConsumerToComputerRule_2_1_preparereturnvalue_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		EOperation performOperation = (EOperation) result1_bindingAndBlack[0];
		//nothing EClass eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = ReqConsumerToComputerRuleImpl
				.pattern_ReqConsumerToComputerRule_2_1_preparereturnvalue_greenBF(performOperation);
		IsApplicableRuleResult ruleresult = (IsApplicableRuleResult) result1_green[1];

		// ForEach 
		Object[] result2_binding = ReqConsumerToComputerRuleImpl
				.pattern_ReqConsumerToComputerRule_2_2_corematch_bindingFFFB(match);
		if (result2_binding == null) {
			throw new RuntimeException(
					"Binding in node core match failed." + " Variables: " + "[match] = " + match + ".");
		}
		Consumer reqAgent = (Consumer) result2_binding[0];
		Container reqContainer = (Container) result2_binding[1];
		NetworkSpan virtualNode = (NetworkSpan) result2_binding[2];
		for (Object[] result2_black : ReqConsumerToComputerRuleImpl
				.pattern_ReqConsumerToComputerRule_2_2_corematch_blackFBBFBFFB(reqAgent, reqContainer, virtualNode,
						match)) {
			Computer implDevice = (Computer) result2_black[0];
			VirtualNodeToComputer virtualNodeToComputer = (VirtualNodeToComputer) result2_black[3];
			implementation.Container implContainer = (implementation.Container) result2_black[5];
			ReqContainerToImplContainer reqContainerToImplContainer = (ReqContainerToImplContainer) result2_black[6];
			// ForEach 
			for (Object[] result3_black : ReqConsumerToComputerRuleImpl
					.pattern_ReqConsumerToComputerRule_2_3_findcontext_blackBBBBBFBB(implDevice, reqAgent, reqContainer,
							virtualNodeToComputer, virtualNode, implContainer, reqContainerToImplContainer)) {
				Cable cable = (Cable) result3_black[5];
				Object[] result3_green = ReqConsumerToComputerRuleImpl
						.pattern_ReqConsumerToComputerRule_2_3_findcontext_greenBBBBBBBBFFFFFFFFF(implDevice, reqAgent,
								reqContainer, virtualNodeToComputer, virtualNode, cable, implContainer,
								reqContainerToImplContainer);
				IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result3_green[8];
				//nothing EMoflonEdge virtualNodeToComputer__virtualNode____source = (EMoflonEdge) result3_green[9];
				//nothing EMoflonEdge implContainer__cable____cables = (EMoflonEdge) result3_green[10];
				//nothing EMoflonEdge reqContainer__virtualNode____networkSpan = (EMoflonEdge) result3_green[11];
				//nothing EMoflonEdge reqContainer__reqAgent____agents = (EMoflonEdge) result3_green[12];
				//nothing EMoflonEdge reqContainerToImplContainer__reqContainer____source = (EMoflonEdge) result3_green[13];
				//nothing EMoflonEdge virtualNodeToComputer__implDevice____target = (EMoflonEdge) result3_green[14];
				//nothing EMoflonEdge reqContainerToImplContainer__implContainer____target = (EMoflonEdge) result3_green[15];
				//nothing EMoflonEdge implContainer__implDevice____devices = (EMoflonEdge) result3_green[16];

				Object[] result4_bindingAndBlack = ReqConsumerToComputerRuleImpl
						.pattern_ReqConsumerToComputerRule_2_4_solveCSP_bindingAndBlackFBBBBBBBBBB(this,
								isApplicableMatch, implDevice, reqAgent, reqContainer, virtualNodeToComputer,
								virtualNode, cable, implContainer, reqContainerToImplContainer);
				if (result4_bindingAndBlack == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
							+ "[isApplicableMatch] = " + isApplicableMatch + ", " + "[implDevice] = " + implDevice
							+ ", " + "[reqAgent] = " + reqAgent + ", " + "[reqContainer] = " + reqContainer + ", "
							+ "[virtualNodeToComputer] = " + virtualNodeToComputer + ", " + "[virtualNode] = "
							+ virtualNode + ", " + "[cable] = " + cable + ", " + "[implContainer] = " + implContainer
							+ ", " + "[reqContainerToImplContainer] = " + reqContainerToImplContainer + ".");
				}
				CSP csp = (CSP) result4_bindingAndBlack[0];
				// 
				if (ReqConsumerToComputerRuleImpl.pattern_ReqConsumerToComputerRule_2_5_checkCSP_expressionFBB(this,
						csp)) {

					Object[] result6_black = ReqConsumerToComputerRuleImpl
							.pattern_ReqConsumerToComputerRule_2_6_addmatchtoruleresult_blackBB(ruleresult,
									isApplicableMatch);
					if (result6_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[ruleresult] = "
								+ ruleresult + ", " + "[isApplicableMatch] = " + isApplicableMatch + ".");
					}
					ReqConsumerToComputerRuleImpl.pattern_ReqConsumerToComputerRule_2_6_addmatchtoruleresult_greenBB(
							ruleresult, isApplicableMatch);

				} else {
				}

			}

		}
		return ReqConsumerToComputerRuleImpl.pattern_ReqConsumerToComputerRule_2_7_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void registerObjectsToMatch_FWD(Match match, Consumer reqAgent, Container reqContainer,
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
	public CSP isAppropriate_solveCsp_FWD(Match match, Consumer reqAgent, Container reqContainer,
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
	public CSP isApplicable_solveCsp_FWD(IsApplicableMatch isApplicableMatch, Computer implDevice, Consumer reqAgent,
			Container reqContainer, VirtualNodeToComputer virtualNodeToComputer, NetworkSpan virtualNode, Cable cable,
			implementation.Container implContainer, ReqContainerToImplContainer reqContainerToImplContainer) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals

		// Create attribute variables

		// Create unbound variables

		// Create constraints

		// Solve CSP

		// Snapshot pattern match on which CSP is solved
		isApplicableMatch.registerObject("implDevice", implDevice);
		isApplicableMatch.registerObject("reqAgent", reqAgent);
		isApplicableMatch.registerObject("reqContainer", reqContainer);
		isApplicableMatch.registerObject("virtualNodeToComputer", virtualNodeToComputer);
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
	public void registerObjects_FWD(PerformRuleResult ruleresult, EObject reqAgentToImplDevice, EObject implDevice,
			EObject reqAgent, EObject reqContainer, EObject virtualNodeToComputer, EObject virtualNode, EObject cable,
			EObject implContainer, EObject reqContainerToImplContainer) {
		ruleresult.registerObject("reqAgentToImplDevice", reqAgentToImplDevice);
		ruleresult.registerObject("implDevice", implDevice);
		ruleresult.registerObject("reqAgent", reqAgent);
		ruleresult.registerObject("reqContainer", reqContainer);
		ruleresult.registerObject("virtualNodeToComputer", virtualNodeToComputer);
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
				.equals("requirements.Consumer.");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAppropriate_BWD(Match match, Computer implDevice, Cable cable,
			implementation.Container implContainer) {

		Object[] result1_black = ReqConsumerToComputerRuleImpl
				.pattern_ReqConsumerToComputerRule_10_1_initialbindings_blackBBBBB(this, match, implDevice, cable,
						implContainer);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[match] = " + match + ", " + "[implDevice] = " + implDevice + ", " + "[cable] = " + cable + ", "
					+ "[implContainer] = " + implContainer + ".");
		}

		Object[] result2_bindingAndBlack = ReqConsumerToComputerRuleImpl
				.pattern_ReqConsumerToComputerRule_10_2_SolveCSP_bindingAndBlackFBBBBB(this, match, implDevice, cable,
						implContainer);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[match] = " + match + ", " + "[implDevice] = " + implDevice + ", " + "[cable] = " + cable + ", "
					+ "[implContainer] = " + implContainer + ".");
		}
		CSP csp = (CSP) result2_bindingAndBlack[0];
		// 
		if (ReqConsumerToComputerRuleImpl.pattern_ReqConsumerToComputerRule_10_3_CheckCSP_expressionFBB(this, csp)) {

			Object[] result4_black = ReqConsumerToComputerRuleImpl
					.pattern_ReqConsumerToComputerRule_10_4_collectelementstobetranslated_blackBBBB(match, implDevice,
							cable, implContainer);
			if (result4_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match + ", "
						+ "[implDevice] = " + implDevice + ", " + "[cable] = " + cable + ", " + "[implContainer] = "
						+ implContainer + ".");
			}

			Object[] result5_black = ReqConsumerToComputerRuleImpl
					.pattern_ReqConsumerToComputerRule_10_5_collectcontextelements_blackBBBB(match, implDevice, cable,
							implContainer);
			if (result5_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match + ", "
						+ "[implDevice] = " + implDevice + ", " + "[cable] = " + cable + ", " + "[implContainer] = "
						+ implContainer + ".");
			}
			ReqConsumerToComputerRuleImpl.pattern_ReqConsumerToComputerRule_10_5_collectcontextelements_greenBBBBFF(
					match, implDevice, cable, implContainer);
			//nothing EMoflonEdge implContainer__cable____cables = (EMoflonEdge) result5_green[4];
			//nothing EMoflonEdge implContainer__implDevice____devices = (EMoflonEdge) result5_green[5];

			// 
			ReqConsumerToComputerRuleImpl.pattern_ReqConsumerToComputerRule_10_6_registerobjectstomatch_expressionBBBBB(
					this, match, implDevice, cable, implContainer);
			return ReqConsumerToComputerRuleImpl.pattern_ReqConsumerToComputerRule_10_7_expressionF();
		} else {
			return ReqConsumerToComputerRuleImpl.pattern_ReqConsumerToComputerRule_10_8_expressionF();
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
	public void registerObjectsToMatch_BWD(Match match, Computer implDevice, Cable cable,
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
	public CSP isAppropriate_solveCsp_BWD(Match match, Computer implDevice, Cable cable,
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
	public EObjectContainer isAppropriate_BWD_Computer_2(Computer implDevice) {

		Object[] result1_bindingAndBlack = ReqConsumerToComputerRuleImpl
				.pattern_ReqConsumerToComputerRule_17_1_preparereturnvalue_bindingAndBlackFFBF(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		EOperation isApplicableCC = (EOperation) result1_bindingAndBlack[3];
		Object[] result1_green = ReqConsumerToComputerRuleImpl
				.pattern_ReqConsumerToComputerRule_17_1_preparereturnvalue_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach 
		for (Object[] result2_black : ReqConsumerToComputerRuleImpl
				.pattern_ReqConsumerToComputerRule_17_2_testcorematchandDECs_blackBFF(implDevice)) {
			Cable cable = (Cable) result2_black[1];
			implementation.Container implContainer = (implementation.Container) result2_black[2];
			Object[] result2_green = ReqConsumerToComputerRuleImpl
					.pattern_ReqConsumerToComputerRule_17_2_testcorematchandDECs_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// 
			if (ReqConsumerToComputerRuleImpl
					.pattern_ReqConsumerToComputerRule_17_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBBB(
							this, match, implDevice, cable, implContainer)) {
				// 
				if (ReqConsumerToComputerRuleImpl
						.pattern_ReqConsumerToComputerRule_17_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(
								this, match)) {

					Object[] result5_black = ReqConsumerToComputerRuleImpl
							.pattern_ReqConsumerToComputerRule_17_5_Addmatchtoruleresult_blackBBBB(match,
									__performOperation, __result, isApplicableCC);
					if (result5_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match
								+ ", " + "[__performOperation] = " + __performOperation + ", " + "[__result] = "
								+ __result + ", " + "[isApplicableCC] = " + isApplicableCC + ".");
					}
					ReqConsumerToComputerRuleImpl.pattern_ReqConsumerToComputerRule_17_5_Addmatchtoruleresult_greenBBBB(
							match, __performOperation, __result, isApplicableCC);

				} else {
				}

			} else {
			}

		}
		return ReqConsumerToComputerRuleImpl.pattern_ReqConsumerToComputerRule_17_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_FWD_EMoflonEdge_30(EMoflonEdge _edge_agents) {

		Object[] result1_bindingAndBlack = ReqConsumerToComputerRuleImpl
				.pattern_ReqConsumerToComputerRule_18_1_preparereturnvalue_bindingAndBlackFFBF(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		EOperation isApplicableCC = (EOperation) result1_bindingAndBlack[3];
		Object[] result1_green = ReqConsumerToComputerRuleImpl
				.pattern_ReqConsumerToComputerRule_18_1_preparereturnvalue_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach 
		for (Object[] result2_black : ReqConsumerToComputerRuleImpl
				.pattern_ReqConsumerToComputerRule_18_2_testcorematchandDECs_blackFFFB(_edge_agents)) {
			Consumer reqAgent = (Consumer) result2_black[0];
			Container reqContainer = (Container) result2_black[1];
			NetworkSpan virtualNode = (NetworkSpan) result2_black[2];
			Object[] result2_green = ReqConsumerToComputerRuleImpl
					.pattern_ReqConsumerToComputerRule_18_2_testcorematchandDECs_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// 
			if (ReqConsumerToComputerRuleImpl
					.pattern_ReqConsumerToComputerRule_18_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBBB(
							this, match, reqAgent, reqContainer, virtualNode)) {
				// 
				if (ReqConsumerToComputerRuleImpl
						.pattern_ReqConsumerToComputerRule_18_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(
								this, match)) {

					Object[] result5_black = ReqConsumerToComputerRuleImpl
							.pattern_ReqConsumerToComputerRule_18_5_Addmatchtoruleresult_blackBBBB(match,
									__performOperation, __result, isApplicableCC);
					if (result5_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match
								+ ", " + "[__performOperation] = " + __performOperation + ", " + "[__result] = "
								+ __result + ", " + "[isApplicableCC] = " + isApplicableCC + ".");
					}
					ReqConsumerToComputerRuleImpl.pattern_ReqConsumerToComputerRule_18_5_Addmatchtoruleresult_greenBBBB(
							match, __performOperation, __result, isApplicableCC);

				} else {
				}

			} else {
			}

		}
		return ReqConsumerToComputerRuleImpl.pattern_ReqConsumerToComputerRule_18_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AttributeConstraintsRuleResult checkAttributes_FWD(TripleMatch __tripleMatch) {
		AttributeConstraintsRuleResult ruleResult = org.moflon.tgg.runtime.RuntimeFactory.eINSTANCE
				.createAttributeConstraintsRuleResult();
		ruleResult.setRule("ReqConsumerToComputerRule");
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
		ruleResult.setRule("ReqConsumerToComputerRule");
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

		Object[] result1_black = ReqConsumerToComputerRuleImpl
				.pattern_ReqConsumerToComputerRule_21_1_prepare_blackB(this);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		Object[] result1_green = ReqConsumerToComputerRuleImpl.pattern_ReqConsumerToComputerRule_21_1_prepare_greenF();
		IsApplicableRuleResult result = (IsApplicableRuleResult) result1_green[0];

		Object[] result2_bindingAndBlack = ReqConsumerToComputerRuleImpl
				.pattern_ReqConsumerToComputerRule_21_2_matchsrctrgcontext_bindingAndBlackFFFFFFBB(sourceMatch,
						targetMatch);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[sourceMatch] = " + sourceMatch
					+ ", " + "[targetMatch] = " + targetMatch + ".");
		}
		Computer implDevice = (Computer) result2_bindingAndBlack[0];
		Consumer reqAgent = (Consumer) result2_bindingAndBlack[1];
		Container reqContainer = (Container) result2_bindingAndBlack[2];
		NetworkSpan virtualNode = (NetworkSpan) result2_bindingAndBlack[3];
		Cable cable = (Cable) result2_bindingAndBlack[4];
		implementation.Container implContainer = (implementation.Container) result2_bindingAndBlack[5];

		Object[] result3_bindingAndBlack = ReqConsumerToComputerRuleImpl
				.pattern_ReqConsumerToComputerRule_21_3_solvecsp_bindingAndBlackFBBBBBBBBB(this, implDevice, reqAgent,
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
		if (ReqConsumerToComputerRuleImpl.pattern_ReqConsumerToComputerRule_21_4_checkCSP_expressionFB(csp)) {
			// ForEach 
			for (Object[] result5_black : ReqConsumerToComputerRuleImpl
					.pattern_ReqConsumerToComputerRule_21_5_matchcorrcontext_blackBBFBBFBB(implDevice, reqContainer,
							virtualNode, implContainer, sourceMatch, targetMatch)) {
				VirtualNodeToComputer virtualNodeToComputer = (VirtualNodeToComputer) result5_black[2];
				ReqContainerToImplContainer reqContainerToImplContainer = (ReqContainerToImplContainer) result5_black[5];
				Object[] result5_green = ReqConsumerToComputerRuleImpl
						.pattern_ReqConsumerToComputerRule_21_5_matchcorrcontext_greenBBBBF(virtualNodeToComputer,
								reqContainerToImplContainer, sourceMatch, targetMatch);
				CCMatch ccMatch = (CCMatch) result5_green[4];

				Object[] result6_black = ReqConsumerToComputerRuleImpl
						.pattern_ReqConsumerToComputerRule_21_6_createcorrespondence_blackBBBBBBB(implDevice, reqAgent,
								reqContainer, virtualNode, cable, implContainer, ccMatch);
				if (result6_black == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[implDevice] = "
							+ implDevice + ", " + "[reqAgent] = " + reqAgent + ", " + "[reqContainer] = " + reqContainer
							+ ", " + "[virtualNode] = " + virtualNode + ", " + "[cable] = " + cable + ", "
							+ "[implContainer] = " + implContainer + ", " + "[ccMatch] = " + ccMatch + ".");
				}
				ReqConsumerToComputerRuleImpl.pattern_ReqConsumerToComputerRule_21_6_createcorrespondence_greenFBBB(
						implDevice, reqAgent, ccMatch);
				//nothing ReqAgentToImplDevice reqAgentToImplDevice = (ReqAgentToImplDevice) result6_green[0];

				Object[] result7_black = ReqConsumerToComputerRuleImpl
						.pattern_ReqConsumerToComputerRule_21_7_addtoreturnedresult_blackBB(result, ccMatch);
				if (result7_black == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[result] = " + result
							+ ", " + "[ccMatch] = " + ccMatch + ".");
				}
				ReqConsumerToComputerRuleImpl.pattern_ReqConsumerToComputerRule_21_7_addtoreturnedresult_greenBB(result,
						ccMatch);

			}

		} else {
		}
		return ReqConsumerToComputerRuleImpl.pattern_ReqConsumerToComputerRule_21_8_expressionFB(result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isApplicable_solveCsp_CC(Computer implDevice, Consumer reqAgent, Container reqContainer,
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
	public boolean checkDEC_FWD(Consumer reqAgent, Container reqContainer, NetworkSpan virtualNode) {// 
		Object[] result1_black = ReqConsumerToComputerRuleImpl
				.pattern_ReqConsumerToComputerRule_24_1_matchtggpattern_blackBBB(reqAgent, reqContainer, virtualNode);
		if (result1_black != null) {
			return ReqConsumerToComputerRuleImpl.pattern_ReqConsumerToComputerRule_24_2_expressionF();
		} else {
			return ReqConsumerToComputerRuleImpl.pattern_ReqConsumerToComputerRule_24_3_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean checkDEC_BWD(Computer implDevice, Cable cable, implementation.Container implContainer) {// 
		Object[] result1_black = ReqConsumerToComputerRuleImpl
				.pattern_ReqConsumerToComputerRule_25_1_matchtggpattern_blackBBB(implDevice, cable, implContainer);
		if (result1_black != null) {
			return ReqConsumerToComputerRuleImpl.pattern_ReqConsumerToComputerRule_25_2_expressionF();
		} else {
			return ReqConsumerToComputerRuleImpl.pattern_ReqConsumerToComputerRule_25_3_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModelgeneratorRuleResult generateModel(RuleEntryContainer ruleEntryContainer,
			VirtualNodeToComputer virtualNodeToComputerParameter) {

		Object[] result1_black = ReqConsumerToComputerRuleImpl
				.pattern_ReqConsumerToComputerRule_26_1_createresult_blackB(this);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		Object[] result1_green = ReqConsumerToComputerRuleImpl
				.pattern_ReqConsumerToComputerRule_26_1_createresult_greenFF();
		IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result1_green[0];
		ModelgeneratorRuleResult ruleResult = (ModelgeneratorRuleResult) result1_green[1];

		// ForEach 
		for (Object[] result2_black : ReqConsumerToComputerRuleImpl
				.pattern_ReqConsumerToComputerRule_26_2_isapplicablecore_blackFFFFFFFFBB(ruleEntryContainer,
						ruleResult)) {
			//nothing RuleEntryList virtualNodeToComputerList = (RuleEntryList) result2_black[0];
			Computer implDevice = (Computer) result2_black[1];
			VirtualNodeToComputer virtualNodeToComputer = (VirtualNodeToComputer) result2_black[2];
			NetworkSpan virtualNode = (NetworkSpan) result2_black[3];
			Container reqContainer = (Container) result2_black[4];
			ReqContainerToImplContainer reqContainerToImplContainer = (ReqContainerToImplContainer) result2_black[5];
			implementation.Container implContainer = (implementation.Container) result2_black[6];
			Cable cable = (Cable) result2_black[7];

			Object[] result3_bindingAndBlack = ReqConsumerToComputerRuleImpl
					.pattern_ReqConsumerToComputerRule_26_3_solveCSP_bindingAndBlackFBBBBBBBBBB(this, isApplicableMatch,
							implDevice, reqContainer, virtualNodeToComputer, virtualNode, cable, implContainer,
							reqContainerToImplContainer, ruleResult);
			if (result3_bindingAndBlack == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
						+ "[isApplicableMatch] = " + isApplicableMatch + ", " + "[implDevice] = " + implDevice + ", "
						+ "[reqContainer] = " + reqContainer + ", " + "[virtualNodeToComputer] = "
						+ virtualNodeToComputer + ", " + "[virtualNode] = " + virtualNode + ", " + "[cable] = " + cable
						+ ", " + "[implContainer] = " + implContainer + ", " + "[reqContainerToImplContainer] = "
						+ reqContainerToImplContainer + ", " + "[ruleResult] = " + ruleResult + ".");
			}
			CSP csp = (CSP) result3_bindingAndBlack[0];
			// 
			if (ReqConsumerToComputerRuleImpl.pattern_ReqConsumerToComputerRule_26_4_checkCSP_expressionFBB(this,
					csp)) {
				// 
				Object[] result5_black = ReqConsumerToComputerRuleImpl
						.pattern_ReqConsumerToComputerRule_26_5_checknacs_blackBBBBBBB(implDevice, reqContainer,
								virtualNodeToComputer, virtualNode, cable, implContainer, reqContainerToImplContainer);
				if (result5_black != null) {

					Object[] result6_black = ReqConsumerToComputerRuleImpl
							.pattern_ReqConsumerToComputerRule_26_6_perform_blackBBBBBBBB(implDevice, reqContainer,
									virtualNodeToComputer, virtualNode, cable, implContainer,
									reqContainerToImplContainer, ruleResult);
					if (result6_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[implDevice] = "
								+ implDevice + ", " + "[reqContainer] = " + reqContainer + ", "
								+ "[virtualNodeToComputer] = " + virtualNodeToComputer + ", " + "[virtualNode] = "
								+ virtualNode + ", " + "[cable] = " + cable + ", " + "[implContainer] = "
								+ implContainer + ", " + "[reqContainerToImplContainer] = "
								+ reqContainerToImplContainer + ", " + "[ruleResult] = " + ruleResult + ".");
					}
					ReqConsumerToComputerRuleImpl.pattern_ReqConsumerToComputerRule_26_6_perform_greenFBFBB(implDevice,
							reqContainer, ruleResult);
					//nothing ReqAgentToImplDevice reqAgentToImplDevice = (ReqAgentToImplDevice) result6_green[0];
					//nothing Consumer reqAgent = (Consumer) result6_green[2];

				} else {
				}

			} else {
			}

		}
		return ReqConsumerToComputerRuleImpl.pattern_ReqConsumerToComputerRule_26_7_expressionFB(ruleResult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP generateModel_solveCsp_BWD(IsApplicableMatch isApplicableMatch, Computer implDevice,
			Container reqContainer, VirtualNodeToComputer virtualNodeToComputer, NetworkSpan virtualNode, Cable cable,
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
		isApplicableMatch.registerObject("implDevice", implDevice);
		isApplicableMatch.registerObject("reqContainer", reqContainer);
		isApplicableMatch.registerObject("virtualNodeToComputer", virtualNodeToComputer);
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
		case RulesPackage.REQ_CONSUMER_TO_COMPUTER_RULE___IS_APPROPRIATE_FWD__MATCH_CONSUMER_CONTAINER_NETWORKSPAN:
			return isAppropriate_FWD((Match) arguments.get(0), (Consumer) arguments.get(1),
					(Container) arguments.get(2), (NetworkSpan) arguments.get(3));
		case RulesPackage.REQ_CONSUMER_TO_COMPUTER_RULE___PERFORM_FWD__ISAPPLICABLEMATCH:
			return perform_FWD((IsApplicableMatch) arguments.get(0));
		case RulesPackage.REQ_CONSUMER_TO_COMPUTER_RULE___IS_APPLICABLE_FWD__MATCH:
			return isApplicable_FWD((Match) arguments.get(0));
		case RulesPackage.REQ_CONSUMER_TO_COMPUTER_RULE___REGISTER_OBJECTS_TO_MATCH_FWD__MATCH_CONSUMER_CONTAINER_NETWORKSPAN:
			registerObjectsToMatch_FWD((Match) arguments.get(0), (Consumer) arguments.get(1),
					(Container) arguments.get(2), (NetworkSpan) arguments.get(3));
			return null;
		case RulesPackage.REQ_CONSUMER_TO_COMPUTER_RULE___IS_APPROPRIATE_SOLVE_CSP_FWD__MATCH_CONSUMER_CONTAINER_NETWORKSPAN:
			return isAppropriate_solveCsp_FWD((Match) arguments.get(0), (Consumer) arguments.get(1),
					(Container) arguments.get(2), (NetworkSpan) arguments.get(3));
		case RulesPackage.REQ_CONSUMER_TO_COMPUTER_RULE___IS_APPROPRIATE_CHECK_CSP_FWD__CSP:
			return isAppropriate_checkCsp_FWD((CSP) arguments.get(0));
		case RulesPackage.REQ_CONSUMER_TO_COMPUTER_RULE___IS_APPLICABLE_SOLVE_CSP_FWD__ISAPPLICABLEMATCH_COMPUTER_CONSUMER_CONTAINER_VIRTUALNODETOCOMPUTER_NETWORKSPAN_CABLE_CONTAINER_REQCONTAINERTOIMPLCONTAINER:
			return isApplicable_solveCsp_FWD((IsApplicableMatch) arguments.get(0), (Computer) arguments.get(1),
					(Consumer) arguments.get(2), (Container) arguments.get(3), (VirtualNodeToComputer) arguments.get(4),
					(NetworkSpan) arguments.get(5), (Cable) arguments.get(6),
					(implementation.Container) arguments.get(7), (ReqContainerToImplContainer) arguments.get(8));
		case RulesPackage.REQ_CONSUMER_TO_COMPUTER_RULE___IS_APPLICABLE_CHECK_CSP_FWD__CSP:
			return isApplicable_checkCsp_FWD((CSP) arguments.get(0));
		case RulesPackage.REQ_CONSUMER_TO_COMPUTER_RULE___REGISTER_OBJECTS_FWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT:
			registerObjects_FWD((PerformRuleResult) arguments.get(0), (EObject) arguments.get(1),
					(EObject) arguments.get(2), (EObject) arguments.get(3), (EObject) arguments.get(4),
					(EObject) arguments.get(5), (EObject) arguments.get(6), (EObject) arguments.get(7),
					(EObject) arguments.get(8), (EObject) arguments.get(9));
			return null;
		case RulesPackage.REQ_CONSUMER_TO_COMPUTER_RULE___CHECK_TYPES_FWD__MATCH:
			return checkTypes_FWD((Match) arguments.get(0));
		case RulesPackage.REQ_CONSUMER_TO_COMPUTER_RULE___IS_APPROPRIATE_BWD__MATCH_COMPUTER_CABLE_CONTAINER:
			return isAppropriate_BWD((Match) arguments.get(0), (Computer) arguments.get(1), (Cable) arguments.get(2),
					(implementation.Container) arguments.get(3));
		case RulesPackage.REQ_CONSUMER_TO_COMPUTER_RULE___PERFORM_BWD__ISAPPLICABLEMATCH:
			return perform_BWD((IsApplicableMatch) arguments.get(0));
		case RulesPackage.REQ_CONSUMER_TO_COMPUTER_RULE___IS_APPLICABLE_BWD__MATCH:
			return isApplicable_BWD((Match) arguments.get(0));
		case RulesPackage.REQ_CONSUMER_TO_COMPUTER_RULE___REGISTER_OBJECTS_TO_MATCH_BWD__MATCH_COMPUTER_CABLE_CONTAINER:
			registerObjectsToMatch_BWD((Match) arguments.get(0), (Computer) arguments.get(1), (Cable) arguments.get(2),
					(implementation.Container) arguments.get(3));
			return null;
		case RulesPackage.REQ_CONSUMER_TO_COMPUTER_RULE___IS_APPROPRIATE_SOLVE_CSP_BWD__MATCH_COMPUTER_CABLE_CONTAINER:
			return isAppropriate_solveCsp_BWD((Match) arguments.get(0), (Computer) arguments.get(1),
					(Cable) arguments.get(2), (implementation.Container) arguments.get(3));
		case RulesPackage.REQ_CONSUMER_TO_COMPUTER_RULE___IS_APPROPRIATE_CHECK_CSP_BWD__CSP:
			return isAppropriate_checkCsp_BWD((CSP) arguments.get(0));
		case RulesPackage.REQ_CONSUMER_TO_COMPUTER_RULE___CHECK_TYPES_BWD__MATCH:
			return checkTypes_BWD((Match) arguments.get(0));
		case RulesPackage.REQ_CONSUMER_TO_COMPUTER_RULE___IS_APPROPRIATE_BWD_COMPUTER_2__COMPUTER:
			return isAppropriate_BWD_Computer_2((Computer) arguments.get(0));
		case RulesPackage.REQ_CONSUMER_TO_COMPUTER_RULE___IS_APPROPRIATE_FWD_EMOFLON_EDGE_30__EMOFLONEDGE:
			return isAppropriate_FWD_EMoflonEdge_30((EMoflonEdge) arguments.get(0));
		case RulesPackage.REQ_CONSUMER_TO_COMPUTER_RULE___CHECK_ATTRIBUTES_FWD__TRIPLEMATCH:
			return checkAttributes_FWD((TripleMatch) arguments.get(0));
		case RulesPackage.REQ_CONSUMER_TO_COMPUTER_RULE___CHECK_ATTRIBUTES_BWD__TRIPLEMATCH:
			return checkAttributes_BWD((TripleMatch) arguments.get(0));
		case RulesPackage.REQ_CONSUMER_TO_COMPUTER_RULE___IS_APPLICABLE_CC__MATCH_MATCH:
			return isApplicable_CC((Match) arguments.get(0), (Match) arguments.get(1));
		case RulesPackage.REQ_CONSUMER_TO_COMPUTER_RULE___IS_APPLICABLE_SOLVE_CSP_CC__COMPUTER_CONSUMER_CONTAINER_NETWORKSPAN_CABLE_CONTAINER_MATCH_MATCH:
			return isApplicable_solveCsp_CC((Computer) arguments.get(0), (Consumer) arguments.get(1),
					(Container) arguments.get(2), (NetworkSpan) arguments.get(3), (Cable) arguments.get(4),
					(implementation.Container) arguments.get(5), (Match) arguments.get(6), (Match) arguments.get(7));
		case RulesPackage.REQ_CONSUMER_TO_COMPUTER_RULE___IS_APPLICABLE_CHECK_CSP_CC__CSP:
			return isApplicable_checkCsp_CC((CSP) arguments.get(0));
		case RulesPackage.REQ_CONSUMER_TO_COMPUTER_RULE___CHECK_DEC_FWD__CONSUMER_CONTAINER_NETWORKSPAN:
			return checkDEC_FWD((Consumer) arguments.get(0), (Container) arguments.get(1),
					(NetworkSpan) arguments.get(2));
		case RulesPackage.REQ_CONSUMER_TO_COMPUTER_RULE___CHECK_DEC_BWD__COMPUTER_CABLE_CONTAINER:
			return checkDEC_BWD((Computer) arguments.get(0), (Cable) arguments.get(1),
					(implementation.Container) arguments.get(2));
		case RulesPackage.REQ_CONSUMER_TO_COMPUTER_RULE___GENERATE_MODEL__RULEENTRYCONTAINER_VIRTUALNODETOCOMPUTER:
			return generateModel((RuleEntryContainer) arguments.get(0), (VirtualNodeToComputer) arguments.get(1));
		case RulesPackage.REQ_CONSUMER_TO_COMPUTER_RULE___GENERATE_MODEL_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_COMPUTER_CONTAINER_VIRTUALNODETOCOMPUTER_NETWORKSPAN_CABLE_CONTAINER_REQCONTAINERTOIMPLCONTAINER_MODELGENERATORRULERESULT:
			return generateModel_solveCsp_BWD((IsApplicableMatch) arguments.get(0), (Computer) arguments.get(1),
					(Container) arguments.get(2), (VirtualNodeToComputer) arguments.get(3),
					(NetworkSpan) arguments.get(4), (Cable) arguments.get(5),
					(implementation.Container) arguments.get(6), (ReqContainerToImplContainer) arguments.get(7),
					(ModelgeneratorRuleResult) arguments.get(8));
		case RulesPackage.REQ_CONSUMER_TO_COMPUTER_RULE___GENERATE_MODEL_CHECK_CSP_BWD__CSP:
			return generateModel_checkCsp_BWD((CSP) arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
	}

	public static final Object[] pattern_ReqConsumerToComputerRule_0_1_initialbindings_blackBBBBB(
			ReqConsumerToComputerRule _this, Match match, Consumer reqAgent, Container reqContainer,
			NetworkSpan virtualNode) {
		return new Object[] { _this, match, reqAgent, reqContainer, virtualNode };
	}

	public static final Object[] pattern_ReqConsumerToComputerRule_0_2_SolveCSP_bindingFBBBBB(
			ReqConsumerToComputerRule _this, Match match, Consumer reqAgent, Container reqContainer,
			NetworkSpan virtualNode) {
		CSP _localVariable_0 = _this.isAppropriate_solveCsp_FWD(match, reqAgent, reqContainer, virtualNode);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, match, reqAgent, reqContainer, virtualNode };
		}
		return null;
	}

	public static final Object[] pattern_ReqConsumerToComputerRule_0_2_SolveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_ReqConsumerToComputerRule_0_2_SolveCSP_bindingAndBlackFBBBBB(
			ReqConsumerToComputerRule _this, Match match, Consumer reqAgent, Container reqContainer,
			NetworkSpan virtualNode) {
		Object[] result_pattern_ReqConsumerToComputerRule_0_2_SolveCSP_binding = pattern_ReqConsumerToComputerRule_0_2_SolveCSP_bindingFBBBBB(
				_this, match, reqAgent, reqContainer, virtualNode);
		if (result_pattern_ReqConsumerToComputerRule_0_2_SolveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_ReqConsumerToComputerRule_0_2_SolveCSP_binding[0];

			Object[] result_pattern_ReqConsumerToComputerRule_0_2_SolveCSP_black = pattern_ReqConsumerToComputerRule_0_2_SolveCSP_blackB(
					csp);
			if (result_pattern_ReqConsumerToComputerRule_0_2_SolveCSP_black != null) {

				return new Object[] { csp, _this, match, reqAgent, reqContainer, virtualNode };
			}
		}
		return null;
	}

	public static final boolean pattern_ReqConsumerToComputerRule_0_3_CheckCSP_expressionFBB(
			ReqConsumerToComputerRule _this, CSP csp) {
		boolean _localVariable_0 = _this.isAppropriate_checkCsp_FWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_ReqConsumerToComputerRule_0_4_collectelementstobetranslated_blackBBBB(
			Match match, Consumer reqAgent, Container reqContainer, NetworkSpan virtualNode) {
		return new Object[] { match, reqAgent, reqContainer, virtualNode };
	}

	public static final Object[] pattern_ReqConsumerToComputerRule_0_4_collectelementstobetranslated_greenBBBF(
			Match match, Consumer reqAgent, Container reqContainer) {
		EMoflonEdge reqContainer__reqAgent____agents = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		match.getToBeTranslatedNodes().add(reqAgent);
		String reqContainer__reqAgent____agents_name_prime = "agents";
		reqContainer__reqAgent____agents.setSrc(reqContainer);
		reqContainer__reqAgent____agents.setTrg(reqAgent);
		match.getToBeTranslatedEdges().add(reqContainer__reqAgent____agents);
		reqContainer__reqAgent____agents.setName(reqContainer__reqAgent____agents_name_prime);
		return new Object[] { match, reqAgent, reqContainer, reqContainer__reqAgent____agents };
	}

	public static final Object[] pattern_ReqConsumerToComputerRule_0_5_collectcontextelements_blackBBBB(Match match,
			Consumer reqAgent, Container reqContainer, NetworkSpan virtualNode) {
		return new Object[] { match, reqAgent, reqContainer, virtualNode };
	}

	public static final Object[] pattern_ReqConsumerToComputerRule_0_5_collectcontextelements_greenBBBF(Match match,
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

	public static final void pattern_ReqConsumerToComputerRule_0_6_registerobjectstomatch_expressionBBBBB(
			ReqConsumerToComputerRule _this, Match match, Consumer reqAgent, Container reqContainer,
			NetworkSpan virtualNode) {
		_this.registerObjectsToMatch_FWD(match, reqAgent, reqContainer, virtualNode);

	}

	public static final boolean pattern_ReqConsumerToComputerRule_0_7_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_ReqConsumerToComputerRule_0_8_expressionF() {
		boolean _result = Boolean.valueOf(false);
		return _result;
	}

	public static final Object[] pattern_ReqConsumerToComputerRule_1_1_performtransformation_bindingFFFFFFFFB(
			IsApplicableMatch isApplicableMatch) {
		EObject _localVariable_0 = isApplicableMatch.getObject("implDevice");
		EObject _localVariable_1 = isApplicableMatch.getObject("reqAgent");
		EObject _localVariable_2 = isApplicableMatch.getObject("reqContainer");
		EObject _localVariable_3 = isApplicableMatch.getObject("virtualNodeToComputer");
		EObject _localVariable_4 = isApplicableMatch.getObject("virtualNode");
		EObject _localVariable_5 = isApplicableMatch.getObject("cable");
		EObject _localVariable_6 = isApplicableMatch.getObject("implContainer");
		EObject _localVariable_7 = isApplicableMatch.getObject("reqContainerToImplContainer");
		EObject tmpImplDevice = _localVariable_0;
		EObject tmpReqAgent = _localVariable_1;
		EObject tmpReqContainer = _localVariable_2;
		EObject tmpVirtualNodeToComputer = _localVariable_3;
		EObject tmpVirtualNode = _localVariable_4;
		EObject tmpCable = _localVariable_5;
		EObject tmpImplContainer = _localVariable_6;
		EObject tmpReqContainerToImplContainer = _localVariable_7;
		if (tmpImplDevice instanceof Computer) {
			Computer implDevice = (Computer) tmpImplDevice;
			if (tmpReqAgent instanceof Consumer) {
				Consumer reqAgent = (Consumer) tmpReqAgent;
				if (tmpReqContainer instanceof Container) {
					Container reqContainer = (Container) tmpReqContainer;
					if (tmpVirtualNodeToComputer instanceof VirtualNodeToComputer) {
						VirtualNodeToComputer virtualNodeToComputer = (VirtualNodeToComputer) tmpVirtualNodeToComputer;
						if (tmpVirtualNode instanceof NetworkSpan) {
							NetworkSpan virtualNode = (NetworkSpan) tmpVirtualNode;
							if (tmpCable instanceof Cable) {
								Cable cable = (Cable) tmpCable;
								if (tmpImplContainer instanceof implementation.Container) {
									implementation.Container implContainer = (implementation.Container) tmpImplContainer;
									if (tmpReqContainerToImplContainer instanceof ReqContainerToImplContainer) {
										ReqContainerToImplContainer reqContainerToImplContainer = (ReqContainerToImplContainer) tmpReqContainerToImplContainer;
										return new Object[] { implDevice, reqAgent, reqContainer, virtualNodeToComputer,
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

	public static final Object[] pattern_ReqConsumerToComputerRule_1_1_performtransformation_blackBBBBBBBBFBB(
			Computer implDevice, Consumer reqAgent, Container reqContainer, VirtualNodeToComputer virtualNodeToComputer,
			NetworkSpan virtualNode, Cable cable, implementation.Container implContainer,
			ReqContainerToImplContainer reqContainerToImplContainer, ReqConsumerToComputerRule _this,
			IsApplicableMatch isApplicableMatch) {
		for (EObject tmpCsp : isApplicableMatch.getAttributeInfo()) {
			if (tmpCsp instanceof CSP) {
				CSP csp = (CSP) tmpCsp;
				return new Object[] { implDevice, reqAgent, reqContainer, virtualNodeToComputer, virtualNode, cable,
						implContainer, reqContainerToImplContainer, csp, _this, isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_ReqConsumerToComputerRule_1_1_performtransformation_bindingAndBlackFFFFFFFFFBB(
			ReqConsumerToComputerRule _this, IsApplicableMatch isApplicableMatch) {
		Object[] result_pattern_ReqConsumerToComputerRule_1_1_performtransformation_binding = pattern_ReqConsumerToComputerRule_1_1_performtransformation_bindingFFFFFFFFB(
				isApplicableMatch);
		if (result_pattern_ReqConsumerToComputerRule_1_1_performtransformation_binding != null) {
			Computer implDevice = (Computer) result_pattern_ReqConsumerToComputerRule_1_1_performtransformation_binding[0];
			Consumer reqAgent = (Consumer) result_pattern_ReqConsumerToComputerRule_1_1_performtransformation_binding[1];
			Container reqContainer = (Container) result_pattern_ReqConsumerToComputerRule_1_1_performtransformation_binding[2];
			VirtualNodeToComputer virtualNodeToComputer = (VirtualNodeToComputer) result_pattern_ReqConsumerToComputerRule_1_1_performtransformation_binding[3];
			NetworkSpan virtualNode = (NetworkSpan) result_pattern_ReqConsumerToComputerRule_1_1_performtransformation_binding[4];
			Cable cable = (Cable) result_pattern_ReqConsumerToComputerRule_1_1_performtransformation_binding[5];
			implementation.Container implContainer = (implementation.Container) result_pattern_ReqConsumerToComputerRule_1_1_performtransformation_binding[6];
			ReqContainerToImplContainer reqContainerToImplContainer = (ReqContainerToImplContainer) result_pattern_ReqConsumerToComputerRule_1_1_performtransformation_binding[7];

			Object[] result_pattern_ReqConsumerToComputerRule_1_1_performtransformation_black = pattern_ReqConsumerToComputerRule_1_1_performtransformation_blackBBBBBBBBFBB(
					implDevice, reqAgent, reqContainer, virtualNodeToComputer, virtualNode, cable, implContainer,
					reqContainerToImplContainer, _this, isApplicableMatch);
			if (result_pattern_ReqConsumerToComputerRule_1_1_performtransformation_black != null) {
				CSP csp = (CSP) result_pattern_ReqConsumerToComputerRule_1_1_performtransformation_black[8];

				return new Object[] { implDevice, reqAgent, reqContainer, virtualNodeToComputer, virtualNode, cable,
						implContainer, reqContainerToImplContainer, csp, _this, isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_ReqConsumerToComputerRule_1_1_performtransformation_greenFBB(
			Computer implDevice, Consumer reqAgent) {
		ReqAgentToImplDevice reqAgentToImplDevice = ReqToImpTransformatorFactory.eINSTANCE.createReqAgentToImplDevice();
		reqAgentToImplDevice.setSource(reqAgent);
		reqAgentToImplDevice.setTarget(implDevice);
		return new Object[] { reqAgentToImplDevice, implDevice, reqAgent };
	}

	public static final Object[] pattern_ReqConsumerToComputerRule_1_2_collecttranslatedelements_blackBB(
			ReqAgentToImplDevice reqAgentToImplDevice, Consumer reqAgent) {
		return new Object[] { reqAgentToImplDevice, reqAgent };
	}

	public static final Object[] pattern_ReqConsumerToComputerRule_1_2_collecttranslatedelements_greenFBB(
			ReqAgentToImplDevice reqAgentToImplDevice, Consumer reqAgent) {
		PerformRuleResult ruleresult = RuntimeFactory.eINSTANCE.createPerformRuleResult();
		ruleresult.getCreatedLinkElements().add(reqAgentToImplDevice);
		ruleresult.getTranslatedElements().add(reqAgent);
		return new Object[] { ruleresult, reqAgentToImplDevice, reqAgent };
	}

	public static final Object[] pattern_ReqConsumerToComputerRule_1_3_bookkeepingforedges_blackBBBBBBBBBB(
			PerformRuleResult ruleresult, EObject reqAgentToImplDevice, EObject implDevice, EObject reqAgent,
			EObject reqContainer, EObject virtualNodeToComputer, EObject virtualNode, EObject cable,
			EObject implContainer, EObject reqContainerToImplContainer) {
		if (!reqAgentToImplDevice.equals(reqContainer)) {
			if (!reqAgentToImplDevice.equals(virtualNodeToComputer)) {
				if (!reqAgentToImplDevice.equals(virtualNode)) {
					if (!reqAgentToImplDevice.equals(reqContainerToImplContainer)) {
						if (!implDevice.equals(reqAgentToImplDevice)) {
							if (!implDevice.equals(reqAgent)) {
								if (!implDevice.equals(reqContainer)) {
									if (!implDevice.equals(virtualNodeToComputer)) {
										if (!implDevice.equals(virtualNode)) {
											if (!implDevice.equals(reqContainerToImplContainer)) {
												if (!reqAgent.equals(reqAgentToImplDevice)) {
													if (!reqAgent.equals(reqContainer)) {
														if (!reqAgent.equals(virtualNodeToComputer)) {
															if (!reqAgent.equals(virtualNode)) {
																if (!reqAgent.equals(reqContainerToImplContainer)) {
																	if (!reqContainer.equals(virtualNodeToComputer)) {
																		if (!reqContainer.equals(virtualNode)) {
																			if (!reqContainer.equals(
																					reqContainerToImplContainer)) {
																				if (!virtualNode.equals(
																						virtualNodeToComputer)) {
																					if (!cable.equals(
																							reqAgentToImplDevice)) {
																						if (!cable.equals(implDevice)) {
																							if (!cable
																									.equals(reqAgent)) {
																								if (!cable.equals(
																										reqContainer)) {
																									if (!cable.equals(
																											virtualNodeToComputer)) {
																										if (!cable
																												.equals(virtualNode)) {
																											if (!cable
																													.equals(implContainer)) {
																												if (!cable
																														.equals(reqContainerToImplContainer)) {
																													if (!implContainer
																															.equals(reqAgentToImplDevice)) {
																														if (!implContainer
																																.equals(implDevice)) {
																															if (!implContainer
																																	.equals(reqAgent)) {
																																if (!implContainer
																																		.equals(reqContainer)) {
																																	if (!implContainer
																																			.equals(virtualNodeToComputer)) {
																																		if (!implContainer
																																				.equals(virtualNode)) {
																																			if (!implContainer
																																					.equals(reqContainerToImplContainer)) {
																																				if (!reqContainerToImplContainer
																																						.equals(virtualNodeToComputer)) {
																																					if (!reqContainerToImplContainer
																																							.equals(virtualNode)) {
																																						return new Object[] {
																																								ruleresult,
																																								reqAgentToImplDevice,
																																								implDevice,
																																								reqAgent,
																																								reqContainer,
																																								virtualNodeToComputer,
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

	public static final Object[] pattern_ReqConsumerToComputerRule_1_3_bookkeepingforedges_greenBBBBBFFF(
			PerformRuleResult ruleresult, EObject reqAgentToImplDevice, EObject implDevice, EObject reqAgent,
			EObject reqContainer) {
		EMoflonEdge reqAgentToImplDevice__reqAgent____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge reqAgentToImplDevice__implDevice____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge reqContainer__reqAgent____agents = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String ruleresult_ruleName_prime = "ReqConsumerToComputerRule";
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
		return new Object[] { ruleresult, reqAgentToImplDevice, implDevice, reqAgent, reqContainer,
				reqAgentToImplDevice__reqAgent____source, reqAgentToImplDevice__implDevice____target,
				reqContainer__reqAgent____agents };
	}

	public static final void pattern_ReqConsumerToComputerRule_1_5_registerobjects_expressionBBBBBBBBBBB(
			ReqConsumerToComputerRule _this, PerformRuleResult ruleresult, EObject reqAgentToImplDevice,
			EObject implDevice, EObject reqAgent, EObject reqContainer, EObject virtualNodeToComputer,
			EObject virtualNode, EObject cable, EObject implContainer, EObject reqContainerToImplContainer) {
		_this.registerObjects_FWD(ruleresult, reqAgentToImplDevice, implDevice, reqAgent, reqContainer,
				virtualNodeToComputer, virtualNode, cable, implContainer, reqContainerToImplContainer);

	}

	public static final PerformRuleResult pattern_ReqConsumerToComputerRule_1_6_expressionFB(
			PerformRuleResult ruleresult) {
		PerformRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_ReqConsumerToComputerRule_2_1_preparereturnvalue_bindingFB(
			ReqConsumerToComputerRule _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass eClass = _localVariable_0;
		if (eClass != null) {
			return new Object[] { eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_ReqConsumerToComputerRule_2_1_preparereturnvalue_blackFBB(EClass eClass,
			ReqConsumerToComputerRule _this) {
		for (EOperation performOperation : eClass.getEOperations()) {
			String performOperation_name = performOperation.getName();
			if (performOperation_name.equals("perform_FWD")) {
				return new Object[] { performOperation, eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_ReqConsumerToComputerRule_2_1_preparereturnvalue_bindingAndBlackFFB(
			ReqConsumerToComputerRule _this) {
		Object[] result_pattern_ReqConsumerToComputerRule_2_1_preparereturnvalue_binding = pattern_ReqConsumerToComputerRule_2_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_ReqConsumerToComputerRule_2_1_preparereturnvalue_binding != null) {
			EClass eClass = (EClass) result_pattern_ReqConsumerToComputerRule_2_1_preparereturnvalue_binding[0];

			Object[] result_pattern_ReqConsumerToComputerRule_2_1_preparereturnvalue_black = pattern_ReqConsumerToComputerRule_2_1_preparereturnvalue_blackFBB(
					eClass, _this);
			if (result_pattern_ReqConsumerToComputerRule_2_1_preparereturnvalue_black != null) {
				EOperation performOperation = (EOperation) result_pattern_ReqConsumerToComputerRule_2_1_preparereturnvalue_black[0];

				return new Object[] { performOperation, eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_ReqConsumerToComputerRule_2_1_preparereturnvalue_greenBF(
			EOperation performOperation) {
		IsApplicableRuleResult ruleresult = RuntimeFactory.eINSTANCE.createIsApplicableRuleResult();
		boolean ruleresult_success_prime = Boolean.valueOf(false);
		String ruleresult_rule_prime = "ReqConsumerToComputerRule";
		ruleresult.setPerformOperation(performOperation);
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		ruleresult.setRule(ruleresult_rule_prime);
		return new Object[] { performOperation, ruleresult };
	}

	public static final Object[] pattern_ReqConsumerToComputerRule_2_2_corematch_bindingFFFB(Match match) {
		EObject _localVariable_0 = match.getObject("reqAgent");
		EObject _localVariable_1 = match.getObject("reqContainer");
		EObject _localVariable_2 = match.getObject("virtualNode");
		EObject tmpReqAgent = _localVariable_0;
		EObject tmpReqContainer = _localVariable_1;
		EObject tmpVirtualNode = _localVariable_2;
		if (tmpReqAgent instanceof Consumer) {
			Consumer reqAgent = (Consumer) tmpReqAgent;
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

	public static final Iterable<Object[]> pattern_ReqConsumerToComputerRule_2_2_corematch_blackFBBFBFFB(
			Consumer reqAgent, Container reqContainer, NetworkSpan virtualNode, Match match) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		for (VirtualNodeToComputer virtualNodeToComputer : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(virtualNode, VirtualNodeToComputer.class, "source")) {
			Computer implDevice = virtualNodeToComputer.getTarget();
			if (implDevice != null) {
				for (ReqContainerToImplContainer reqContainerToImplContainer : org.moflon.core.utilities.eMoflonEMFUtil
						.getOppositeReferenceTyped(reqContainer, ReqContainerToImplContainer.class, "source")) {
					implementation.Container implContainer = reqContainerToImplContainer.getTarget();
					if (implContainer != null) {
						_result.add(new Object[] { implDevice, reqAgent, reqContainer, virtualNodeToComputer,
								virtualNode, implContainer, reqContainerToImplContainer, match });
					}

				}
			}

		}
		return _result;
	}

	public static final Iterable<Object[]> pattern_ReqConsumerToComputerRule_2_3_findcontext_blackBBBBBFBB(
			Computer implDevice, Consumer reqAgent, Container reqContainer, VirtualNodeToComputer virtualNodeToComputer,
			NetworkSpan virtualNode, implementation.Container implContainer,
			ReqContainerToImplContainer reqContainerToImplContainer) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (virtualNode.equals(virtualNodeToComputer.getSource())) {
			if (virtualNode.equals(reqContainer.getNetworkSpan())) {
				if (reqContainer.getAgents().contains(reqAgent)) {
					if (reqContainer.equals(reqContainerToImplContainer.getSource())) {
						if (implDevice.equals(virtualNodeToComputer.getTarget())) {
							if (implContainer.equals(reqContainerToImplContainer.getTarget())) {
								if (implContainer.getDevices().contains(implDevice)) {
									for (Cable cable : implContainer.getCables()) {
										_result.add(new Object[] { implDevice, reqAgent, reqContainer,
												virtualNodeToComputer, virtualNode, cable, implContainer,
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

	public static final Object[] pattern_ReqConsumerToComputerRule_2_3_findcontext_greenBBBBBBBBFFFFFFFFF(
			Computer implDevice, Consumer reqAgent, Container reqContainer, VirtualNodeToComputer virtualNodeToComputer,
			NetworkSpan virtualNode, Cable cable, implementation.Container implContainer,
			ReqContainerToImplContainer reqContainerToImplContainer) {
		IsApplicableMatch isApplicableMatch = RuntimeFactory.eINSTANCE.createIsApplicableMatch();
		EMoflonEdge virtualNodeToComputer__virtualNode____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge implContainer__cable____cables = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge reqContainer__virtualNode____networkSpan = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge reqContainer__reqAgent____agents = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge reqContainerToImplContainer__reqContainer____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge virtualNodeToComputer__implDevice____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge reqContainerToImplContainer__implContainer____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge implContainer__implDevice____devices = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String virtualNodeToComputer__virtualNode____source_name_prime = "source";
		String implContainer__cable____cables_name_prime = "cables";
		String reqContainer__virtualNode____networkSpan_name_prime = "networkSpan";
		String reqContainer__reqAgent____agents_name_prime = "agents";
		String reqContainerToImplContainer__reqContainer____source_name_prime = "source";
		String virtualNodeToComputer__implDevice____target_name_prime = "target";
		String reqContainerToImplContainer__implContainer____target_name_prime = "target";
		String implContainer__implDevice____devices_name_prime = "devices";
		isApplicableMatch.getAllContextElements().add(implDevice);
		isApplicableMatch.getAllContextElements().add(reqAgent);
		isApplicableMatch.getAllContextElements().add(reqContainer);
		isApplicableMatch.getAllContextElements().add(virtualNodeToComputer);
		isApplicableMatch.getAllContextElements().add(virtualNode);
		isApplicableMatch.getAllContextElements().add(cable);
		isApplicableMatch.getAllContextElements().add(implContainer);
		isApplicableMatch.getAllContextElements().add(reqContainerToImplContainer);
		virtualNodeToComputer__virtualNode____source.setSrc(virtualNodeToComputer);
		virtualNodeToComputer__virtualNode____source.setTrg(virtualNode);
		isApplicableMatch.getAllContextElements().add(virtualNodeToComputer__virtualNode____source);
		implContainer__cable____cables.setSrc(implContainer);
		implContainer__cable____cables.setTrg(cable);
		isApplicableMatch.getAllContextElements().add(implContainer__cable____cables);
		reqContainer__virtualNode____networkSpan.setSrc(reqContainer);
		reqContainer__virtualNode____networkSpan.setTrg(virtualNode);
		isApplicableMatch.getAllContextElements().add(reqContainer__virtualNode____networkSpan);
		reqContainer__reqAgent____agents.setSrc(reqContainer);
		reqContainer__reqAgent____agents.setTrg(reqAgent);
		isApplicableMatch.getAllContextElements().add(reqContainer__reqAgent____agents);
		reqContainerToImplContainer__reqContainer____source.setSrc(reqContainerToImplContainer);
		reqContainerToImplContainer__reqContainer____source.setTrg(reqContainer);
		isApplicableMatch.getAllContextElements().add(reqContainerToImplContainer__reqContainer____source);
		virtualNodeToComputer__implDevice____target.setSrc(virtualNodeToComputer);
		virtualNodeToComputer__implDevice____target.setTrg(implDevice);
		isApplicableMatch.getAllContextElements().add(virtualNodeToComputer__implDevice____target);
		reqContainerToImplContainer__implContainer____target.setSrc(reqContainerToImplContainer);
		reqContainerToImplContainer__implContainer____target.setTrg(implContainer);
		isApplicableMatch.getAllContextElements().add(reqContainerToImplContainer__implContainer____target);
		implContainer__implDevice____devices.setSrc(implContainer);
		implContainer__implDevice____devices.setTrg(implDevice);
		isApplicableMatch.getAllContextElements().add(implContainer__implDevice____devices);
		virtualNodeToComputer__virtualNode____source.setName(virtualNodeToComputer__virtualNode____source_name_prime);
		implContainer__cable____cables.setName(implContainer__cable____cables_name_prime);
		reqContainer__virtualNode____networkSpan.setName(reqContainer__virtualNode____networkSpan_name_prime);
		reqContainer__reqAgent____agents.setName(reqContainer__reqAgent____agents_name_prime);
		reqContainerToImplContainer__reqContainer____source
				.setName(reqContainerToImplContainer__reqContainer____source_name_prime);
		virtualNodeToComputer__implDevice____target.setName(virtualNodeToComputer__implDevice____target_name_prime);
		reqContainerToImplContainer__implContainer____target
				.setName(reqContainerToImplContainer__implContainer____target_name_prime);
		implContainer__implDevice____devices.setName(implContainer__implDevice____devices_name_prime);
		return new Object[] { implDevice, reqAgent, reqContainer, virtualNodeToComputer, virtualNode, cable,
				implContainer, reqContainerToImplContainer, isApplicableMatch,
				virtualNodeToComputer__virtualNode____source, implContainer__cable____cables,
				reqContainer__virtualNode____networkSpan, reqContainer__reqAgent____agents,
				reqContainerToImplContainer__reqContainer____source, virtualNodeToComputer__implDevice____target,
				reqContainerToImplContainer__implContainer____target, implContainer__implDevice____devices };
	}

	public static final Object[] pattern_ReqConsumerToComputerRule_2_4_solveCSP_bindingFBBBBBBBBBB(
			ReqConsumerToComputerRule _this, IsApplicableMatch isApplicableMatch, Computer implDevice,
			Consumer reqAgent, Container reqContainer, VirtualNodeToComputer virtualNodeToComputer,
			NetworkSpan virtualNode, Cable cable, implementation.Container implContainer,
			ReqContainerToImplContainer reqContainerToImplContainer) {
		CSP _localVariable_0 = _this.isApplicable_solveCsp_FWD(isApplicableMatch, implDevice, reqAgent, reqContainer,
				virtualNodeToComputer, virtualNode, cable, implContainer, reqContainerToImplContainer);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, implDevice, reqAgent, reqContainer,
					virtualNodeToComputer, virtualNode, cable, implContainer, reqContainerToImplContainer };
		}
		return null;
	}

	public static final Object[] pattern_ReqConsumerToComputerRule_2_4_solveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_ReqConsumerToComputerRule_2_4_solveCSP_bindingAndBlackFBBBBBBBBBB(
			ReqConsumerToComputerRule _this, IsApplicableMatch isApplicableMatch, Computer implDevice,
			Consumer reqAgent, Container reqContainer, VirtualNodeToComputer virtualNodeToComputer,
			NetworkSpan virtualNode, Cable cable, implementation.Container implContainer,
			ReqContainerToImplContainer reqContainerToImplContainer) {
		Object[] result_pattern_ReqConsumerToComputerRule_2_4_solveCSP_binding = pattern_ReqConsumerToComputerRule_2_4_solveCSP_bindingFBBBBBBBBBB(
				_this, isApplicableMatch, implDevice, reqAgent, reqContainer, virtualNodeToComputer, virtualNode, cable,
				implContainer, reqContainerToImplContainer);
		if (result_pattern_ReqConsumerToComputerRule_2_4_solveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_ReqConsumerToComputerRule_2_4_solveCSP_binding[0];

			Object[] result_pattern_ReqConsumerToComputerRule_2_4_solveCSP_black = pattern_ReqConsumerToComputerRule_2_4_solveCSP_blackB(
					csp);
			if (result_pattern_ReqConsumerToComputerRule_2_4_solveCSP_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, implDevice, reqAgent, reqContainer,
						virtualNodeToComputer, virtualNode, cable, implContainer, reqContainerToImplContainer };
			}
		}
		return null;
	}

	public static final boolean pattern_ReqConsumerToComputerRule_2_5_checkCSP_expressionFBB(
			ReqConsumerToComputerRule _this, CSP csp) {
		boolean _localVariable_0 = _this.isApplicable_checkCsp_FWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_ReqConsumerToComputerRule_2_6_addmatchtoruleresult_blackBB(
			IsApplicableRuleResult ruleresult, IsApplicableMatch isApplicableMatch) {
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final Object[] pattern_ReqConsumerToComputerRule_2_6_addmatchtoruleresult_greenBB(
			IsApplicableRuleResult ruleresult, IsApplicableMatch isApplicableMatch) {
		ruleresult.getIsApplicableMatch().add(isApplicableMatch);
		boolean ruleresult_success_prime = Boolean.valueOf(true);
		String isApplicableMatch_ruleName_prime = "ReqConsumerToComputerRule";
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		isApplicableMatch.setRuleName(isApplicableMatch_ruleName_prime);
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final IsApplicableRuleResult pattern_ReqConsumerToComputerRule_2_7_expressionFB(
			IsApplicableRuleResult ruleresult) {
		IsApplicableRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_ReqConsumerToComputerRule_10_1_initialbindings_blackBBBBB(
			ReqConsumerToComputerRule _this, Match match, Computer implDevice, Cable cable,
			implementation.Container implContainer) {
		return new Object[] { _this, match, implDevice, cable, implContainer };
	}

	public static final Object[] pattern_ReqConsumerToComputerRule_10_2_SolveCSP_bindingFBBBBB(
			ReqConsumerToComputerRule _this, Match match, Computer implDevice, Cable cable,
			implementation.Container implContainer) {
		CSP _localVariable_0 = _this.isAppropriate_solveCsp_BWD(match, implDevice, cable, implContainer);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, match, implDevice, cable, implContainer };
		}
		return null;
	}

	public static final Object[] pattern_ReqConsumerToComputerRule_10_2_SolveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_ReqConsumerToComputerRule_10_2_SolveCSP_bindingAndBlackFBBBBB(
			ReqConsumerToComputerRule _this, Match match, Computer implDevice, Cable cable,
			implementation.Container implContainer) {
		Object[] result_pattern_ReqConsumerToComputerRule_10_2_SolveCSP_binding = pattern_ReqConsumerToComputerRule_10_2_SolveCSP_bindingFBBBBB(
				_this, match, implDevice, cable, implContainer);
		if (result_pattern_ReqConsumerToComputerRule_10_2_SolveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_ReqConsumerToComputerRule_10_2_SolveCSP_binding[0];

			Object[] result_pattern_ReqConsumerToComputerRule_10_2_SolveCSP_black = pattern_ReqConsumerToComputerRule_10_2_SolveCSP_blackB(
					csp);
			if (result_pattern_ReqConsumerToComputerRule_10_2_SolveCSP_black != null) {

				return new Object[] { csp, _this, match, implDevice, cable, implContainer };
			}
		}
		return null;
	}

	public static final boolean pattern_ReqConsumerToComputerRule_10_3_CheckCSP_expressionFBB(
			ReqConsumerToComputerRule _this, CSP csp) {
		boolean _localVariable_0 = _this.isAppropriate_checkCsp_BWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_ReqConsumerToComputerRule_10_4_collectelementstobetranslated_blackBBBB(
			Match match, Computer implDevice, Cable cable, implementation.Container implContainer) {
		return new Object[] { match, implDevice, cable, implContainer };
	}

	public static final Object[] pattern_ReqConsumerToComputerRule_10_5_collectcontextelements_blackBBBB(Match match,
			Computer implDevice, Cable cable, implementation.Container implContainer) {
		return new Object[] { match, implDevice, cable, implContainer };
	}

	public static final Object[] pattern_ReqConsumerToComputerRule_10_5_collectcontextelements_greenBBBBFF(Match match,
			Computer implDevice, Cable cable, implementation.Container implContainer) {
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

	public static final void pattern_ReqConsumerToComputerRule_10_6_registerobjectstomatch_expressionBBBBB(
			ReqConsumerToComputerRule _this, Match match, Computer implDevice, Cable cable,
			implementation.Container implContainer) {
		_this.registerObjectsToMatch_BWD(match, implDevice, cable, implContainer);

	}

	public static final boolean pattern_ReqConsumerToComputerRule_10_7_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_ReqConsumerToComputerRule_10_8_expressionF() {
		boolean _result = Boolean.valueOf(false);
		return _result;
	}

	public static final Object[] pattern_ReqConsumerToComputerRule_17_1_preparereturnvalue_bindingFB(
			ReqConsumerToComputerRule _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_ReqConsumerToComputerRule_17_1_preparereturnvalue_blackFBBF(EClass __eClass,
			ReqConsumerToComputerRule _this) {
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

	public static final Object[] pattern_ReqConsumerToComputerRule_17_1_preparereturnvalue_bindingAndBlackFFBF(
			ReqConsumerToComputerRule _this) {
		Object[] result_pattern_ReqConsumerToComputerRule_17_1_preparereturnvalue_binding = pattern_ReqConsumerToComputerRule_17_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_ReqConsumerToComputerRule_17_1_preparereturnvalue_binding != null) {
			EClass __eClass = (EClass) result_pattern_ReqConsumerToComputerRule_17_1_preparereturnvalue_binding[0];

			Object[] result_pattern_ReqConsumerToComputerRule_17_1_preparereturnvalue_black = pattern_ReqConsumerToComputerRule_17_1_preparereturnvalue_blackFBBF(
					__eClass, _this);
			if (result_pattern_ReqConsumerToComputerRule_17_1_preparereturnvalue_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_ReqConsumerToComputerRule_17_1_preparereturnvalue_black[0];
				EOperation isApplicableCC = (EOperation) result_pattern_ReqConsumerToComputerRule_17_1_preparereturnvalue_black[3];

				return new Object[] { __performOperation, __eClass, _this, isApplicableCC };
			}
		}
		return null;
	}

	public static final Object[] pattern_ReqConsumerToComputerRule_17_1_preparereturnvalue_greenF() {
		EObjectContainer __result = RuntimeFactory.eINSTANCE.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Iterable<Object[]> pattern_ReqConsumerToComputerRule_17_2_testcorematchandDECs_blackBFF(
			Computer implDevice) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		for (implementation.Container implContainer : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(implDevice, implementation.Container.class, "devices")) {
			for (Cable cable : implContainer.getCables()) {
				_result.add(new Object[] { implDevice, cable, implContainer });
			}
		}
		return _result;
	}

	public static final Object[] pattern_ReqConsumerToComputerRule_17_2_testcorematchandDECs_greenFB(EClass __eClass) {
		Match match = RuntimeFactory.eINSTANCE.createMatch();
		String __eClass_name = __eClass.getName();
		String match_ruleName_prime = __eClass_name;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_ReqConsumerToComputerRule_17_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBBB(
			ReqConsumerToComputerRule _this, Match match, Computer implDevice, Cable cable,
			implementation.Container implContainer) {
		boolean _localVariable_0 = _this.isAppropriate_BWD(match, implDevice, cable, implContainer);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_ReqConsumerToComputerRule_17_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(
			ReqConsumerToComputerRule _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_BWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_ReqConsumerToComputerRule_17_5_Addmatchtoruleresult_blackBBBB(Match match,
			EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		if (!__performOperation.equals(isApplicableCC)) {
			return new Object[] { match, __performOperation, __result, isApplicableCC };
		}
		return null;
	}

	public static final Object[] pattern_ReqConsumerToComputerRule_17_5_Addmatchtoruleresult_greenBBBB(Match match,
			EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		match.setIsApplicableCCOperation(isApplicableCC);
		return new Object[] { match, __performOperation, __result, isApplicableCC };
	}

	public static final EObjectContainer pattern_ReqConsumerToComputerRule_17_6_expressionFB(
			EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_ReqConsumerToComputerRule_18_1_preparereturnvalue_bindingFB(
			ReqConsumerToComputerRule _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_ReqConsumerToComputerRule_18_1_preparereturnvalue_blackFBBF(EClass __eClass,
			ReqConsumerToComputerRule _this) {
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

	public static final Object[] pattern_ReqConsumerToComputerRule_18_1_preparereturnvalue_bindingAndBlackFFBF(
			ReqConsumerToComputerRule _this) {
		Object[] result_pattern_ReqConsumerToComputerRule_18_1_preparereturnvalue_binding = pattern_ReqConsumerToComputerRule_18_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_ReqConsumerToComputerRule_18_1_preparereturnvalue_binding != null) {
			EClass __eClass = (EClass) result_pattern_ReqConsumerToComputerRule_18_1_preparereturnvalue_binding[0];

			Object[] result_pattern_ReqConsumerToComputerRule_18_1_preparereturnvalue_black = pattern_ReqConsumerToComputerRule_18_1_preparereturnvalue_blackFBBF(
					__eClass, _this);
			if (result_pattern_ReqConsumerToComputerRule_18_1_preparereturnvalue_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_ReqConsumerToComputerRule_18_1_preparereturnvalue_black[0];
				EOperation isApplicableCC = (EOperation) result_pattern_ReqConsumerToComputerRule_18_1_preparereturnvalue_black[3];

				return new Object[] { __performOperation, __eClass, _this, isApplicableCC };
			}
		}
		return null;
	}

	public static final Object[] pattern_ReqConsumerToComputerRule_18_1_preparereturnvalue_greenF() {
		EObjectContainer __result = RuntimeFactory.eINSTANCE.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Iterable<Object[]> pattern_ReqConsumerToComputerRule_18_2_testcorematchandDECs_blackFFFB(
			EMoflonEdge _edge_agents) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		EObject tmpReqContainer = _edge_agents.getSrc();
		if (tmpReqContainer instanceof Container) {
			Container reqContainer = (Container) tmpReqContainer;
			EObject tmpReqAgent = _edge_agents.getTrg();
			if (tmpReqAgent instanceof Consumer) {
				Consumer reqAgent = (Consumer) tmpReqAgent;
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

	public static final Object[] pattern_ReqConsumerToComputerRule_18_2_testcorematchandDECs_greenFB(EClass __eClass) {
		Match match = RuntimeFactory.eINSTANCE.createMatch();
		String __eClass_name = __eClass.getName();
		String match_ruleName_prime = __eClass_name;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_ReqConsumerToComputerRule_18_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBBB(
			ReqConsumerToComputerRule _this, Match match, Consumer reqAgent, Container reqContainer,
			NetworkSpan virtualNode) {
		boolean _localVariable_0 = _this.isAppropriate_FWD(match, reqAgent, reqContainer, virtualNode);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_ReqConsumerToComputerRule_18_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(
			ReqConsumerToComputerRule _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_FWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_ReqConsumerToComputerRule_18_5_Addmatchtoruleresult_blackBBBB(Match match,
			EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		if (!__performOperation.equals(isApplicableCC)) {
			return new Object[] { match, __performOperation, __result, isApplicableCC };
		}
		return null;
	}

	public static final Object[] pattern_ReqConsumerToComputerRule_18_5_Addmatchtoruleresult_greenBBBB(Match match,
			EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		match.setIsApplicableCCOperation(isApplicableCC);
		return new Object[] { match, __performOperation, __result, isApplicableCC };
	}

	public static final EObjectContainer pattern_ReqConsumerToComputerRule_18_6_expressionFB(
			EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_ReqConsumerToComputerRule_21_1_prepare_blackB(
			ReqConsumerToComputerRule _this) {
		return new Object[] { _this };
	}

	public static final Object[] pattern_ReqConsumerToComputerRule_21_1_prepare_greenF() {
		IsApplicableRuleResult result = RuntimeFactory.eINSTANCE.createIsApplicableRuleResult();
		return new Object[] { result };
	}

	public static final Object[] pattern_ReqConsumerToComputerRule_21_2_matchsrctrgcontext_bindingFFFFFFBB(
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
		if (tmpImplDevice instanceof Computer) {
			Computer implDevice = (Computer) tmpImplDevice;
			if (tmpReqAgent instanceof Consumer) {
				Consumer reqAgent = (Consumer) tmpReqAgent;
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

	public static final Object[] pattern_ReqConsumerToComputerRule_21_2_matchsrctrgcontext_blackBBBBBBBB(
			Computer implDevice, Consumer reqAgent, Container reqContainer, NetworkSpan virtualNode, Cable cable,
			implementation.Container implContainer, Match sourceMatch, Match targetMatch) {
		if (!sourceMatch.equals(targetMatch)) {
			return new Object[] { implDevice, reqAgent, reqContainer, virtualNode, cable, implContainer, sourceMatch,
					targetMatch };
		}
		return null;
	}

	public static final Object[] pattern_ReqConsumerToComputerRule_21_2_matchsrctrgcontext_bindingAndBlackFFFFFFBB(
			Match sourceMatch, Match targetMatch) {
		Object[] result_pattern_ReqConsumerToComputerRule_21_2_matchsrctrgcontext_binding = pattern_ReqConsumerToComputerRule_21_2_matchsrctrgcontext_bindingFFFFFFBB(
				targetMatch, sourceMatch);
		if (result_pattern_ReqConsumerToComputerRule_21_2_matchsrctrgcontext_binding != null) {
			Computer implDevice = (Computer) result_pattern_ReqConsumerToComputerRule_21_2_matchsrctrgcontext_binding[0];
			Consumer reqAgent = (Consumer) result_pattern_ReqConsumerToComputerRule_21_2_matchsrctrgcontext_binding[1];
			Container reqContainer = (Container) result_pattern_ReqConsumerToComputerRule_21_2_matchsrctrgcontext_binding[2];
			NetworkSpan virtualNode = (NetworkSpan) result_pattern_ReqConsumerToComputerRule_21_2_matchsrctrgcontext_binding[3];
			Cable cable = (Cable) result_pattern_ReqConsumerToComputerRule_21_2_matchsrctrgcontext_binding[4];
			implementation.Container implContainer = (implementation.Container) result_pattern_ReqConsumerToComputerRule_21_2_matchsrctrgcontext_binding[5];

			Object[] result_pattern_ReqConsumerToComputerRule_21_2_matchsrctrgcontext_black = pattern_ReqConsumerToComputerRule_21_2_matchsrctrgcontext_blackBBBBBBBB(
					implDevice, reqAgent, reqContainer, virtualNode, cable, implContainer, sourceMatch, targetMatch);
			if (result_pattern_ReqConsumerToComputerRule_21_2_matchsrctrgcontext_black != null) {

				return new Object[] { implDevice, reqAgent, reqContainer, virtualNode, cable, implContainer,
						sourceMatch, targetMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_ReqConsumerToComputerRule_21_3_solvecsp_bindingFBBBBBBBBB(
			ReqConsumerToComputerRule _this, Computer implDevice, Consumer reqAgent, Container reqContainer,
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

	public static final Object[] pattern_ReqConsumerToComputerRule_21_3_solvecsp_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_ReqConsumerToComputerRule_21_3_solvecsp_bindingAndBlackFBBBBBBBBB(
			ReqConsumerToComputerRule _this, Computer implDevice, Consumer reqAgent, Container reqContainer,
			NetworkSpan virtualNode, Cable cable, implementation.Container implContainer, Match sourceMatch,
			Match targetMatch) {
		Object[] result_pattern_ReqConsumerToComputerRule_21_3_solvecsp_binding = pattern_ReqConsumerToComputerRule_21_3_solvecsp_bindingFBBBBBBBBB(
				_this, implDevice, reqAgent, reqContainer, virtualNode, cable, implContainer, sourceMatch, targetMatch);
		if (result_pattern_ReqConsumerToComputerRule_21_3_solvecsp_binding != null) {
			CSP csp = (CSP) result_pattern_ReqConsumerToComputerRule_21_3_solvecsp_binding[0];

			Object[] result_pattern_ReqConsumerToComputerRule_21_3_solvecsp_black = pattern_ReqConsumerToComputerRule_21_3_solvecsp_blackB(
					csp);
			if (result_pattern_ReqConsumerToComputerRule_21_3_solvecsp_black != null) {

				return new Object[] { csp, _this, implDevice, reqAgent, reqContainer, virtualNode, cable, implContainer,
						sourceMatch, targetMatch };
			}
		}
		return null;
	}

	public static final boolean pattern_ReqConsumerToComputerRule_21_4_checkCSP_expressionFB(CSP csp) {
		boolean _localVariable_0 = csp.check();
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Iterable<Object[]> pattern_ReqConsumerToComputerRule_21_5_matchcorrcontext_blackBBFBBFBB(
			Computer implDevice, Container reqContainer, NetworkSpan virtualNode,
			implementation.Container implContainer, Match sourceMatch, Match targetMatch) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (!sourceMatch.equals(targetMatch)) {
			for (VirtualNodeToComputer virtualNodeToComputer : org.moflon.core.utilities.eMoflonEMFUtil
					.getOppositeReferenceTyped(virtualNode, VirtualNodeToComputer.class, "source")) {
				if (implDevice.equals(virtualNodeToComputer.getTarget())) {
					for (ReqContainerToImplContainer reqContainerToImplContainer : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(reqContainer, ReqContainerToImplContainer.class, "source")) {
						if (implContainer.equals(reqContainerToImplContainer.getTarget())) {
							_result.add(new Object[] { implDevice, reqContainer, virtualNodeToComputer, virtualNode,
									implContainer, reqContainerToImplContainer, sourceMatch, targetMatch });
						}
					}
				}
			}
		}
		return _result;
	}

	public static final Object[] pattern_ReqConsumerToComputerRule_21_5_matchcorrcontext_greenBBBBF(
			VirtualNodeToComputer virtualNodeToComputer, ReqContainerToImplContainer reqContainerToImplContainer,
			Match sourceMatch, Match targetMatch) {
		CCMatch ccMatch = RuntimeFactory.eINSTANCE.createCCMatch();
		String ccMatch_ruleName_prime = "ReqConsumerToComputerRule";
		ccMatch.setSourceMatch(sourceMatch);
		ccMatch.setTargetMatch(targetMatch);
		ccMatch.getAllContextElements().add(virtualNodeToComputer);
		ccMatch.getAllContextElements().add(reqContainerToImplContainer);
		ccMatch.setRuleName(ccMatch_ruleName_prime);
		return new Object[] { virtualNodeToComputer, reqContainerToImplContainer, sourceMatch, targetMatch, ccMatch };
	}

	public static final Object[] pattern_ReqConsumerToComputerRule_21_6_createcorrespondence_blackBBBBBBB(
			Computer implDevice, Consumer reqAgent, Container reqContainer, NetworkSpan virtualNode, Cable cable,
			implementation.Container implContainer, CCMatch ccMatch) {
		return new Object[] { implDevice, reqAgent, reqContainer, virtualNode, cable, implContainer, ccMatch };
	}

	public static final Object[] pattern_ReqConsumerToComputerRule_21_6_createcorrespondence_greenFBBB(
			Computer implDevice, Consumer reqAgent, CCMatch ccMatch) {
		ReqAgentToImplDevice reqAgentToImplDevice = ReqToImpTransformatorFactory.eINSTANCE.createReqAgentToImplDevice();
		reqAgentToImplDevice.setSource(reqAgent);
		reqAgentToImplDevice.setTarget(implDevice);
		ccMatch.getCreateCorr().add(reqAgentToImplDevice);
		return new Object[] { reqAgentToImplDevice, implDevice, reqAgent, ccMatch };
	}

	public static final Object[] pattern_ReqConsumerToComputerRule_21_7_addtoreturnedresult_blackBB(
			IsApplicableRuleResult result, CCMatch ccMatch) {
		return new Object[] { result, ccMatch };
	}

	public static final Object[] pattern_ReqConsumerToComputerRule_21_7_addtoreturnedresult_greenBB(
			IsApplicableRuleResult result, CCMatch ccMatch) {
		result.getIsApplicableMatch().add(ccMatch);
		boolean result_success_prime = Boolean.valueOf(true);
		String ccMatch_ruleName_prime = "ReqConsumerToComputerRule";
		result.setSuccess(Boolean.valueOf(result_success_prime));
		ccMatch.setRuleName(ccMatch_ruleName_prime);
		return new Object[] { result, ccMatch };
	}

	public static final IsApplicableRuleResult pattern_ReqConsumerToComputerRule_21_8_expressionFB(
			IsApplicableRuleResult result) {
		IsApplicableRuleResult _result = result;
		return _result;
	}

	public static final Object[] pattern_ReqConsumerToComputerRule_24_1_matchtggpattern_blackBBB(Consumer reqAgent,
			Container reqContainer, NetworkSpan virtualNode) {
		if (virtualNode.equals(reqContainer.getNetworkSpan())) {
			if (reqContainer.getAgents().contains(reqAgent)) {
				return new Object[] { reqAgent, reqContainer, virtualNode };
			}
		}
		return null;
	}

	public static final boolean pattern_ReqConsumerToComputerRule_24_2_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_ReqConsumerToComputerRule_24_3_expressionF() {
		boolean _result = Boolean.valueOf(false);
		return _result;
	}

	public static final Object[] pattern_ReqConsumerToComputerRule_25_1_matchtggpattern_blackBBB(Computer implDevice,
			Cable cable, implementation.Container implContainer) {
		if (implContainer.getCables().contains(cable)) {
			if (implContainer.getDevices().contains(implDevice)) {
				return new Object[] { implDevice, cable, implContainer };
			}
		}
		return null;
	}

	public static final boolean pattern_ReqConsumerToComputerRule_25_2_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_ReqConsumerToComputerRule_25_3_expressionF() {
		boolean _result = Boolean.valueOf(false);
		return _result;
	}

	public static final Object[] pattern_ReqConsumerToComputerRule_26_1_createresult_blackB(
			ReqConsumerToComputerRule _this) {
		return new Object[] { _this };
	}

	public static final Object[] pattern_ReqConsumerToComputerRule_26_1_createresult_greenFF() {
		IsApplicableMatch isApplicableMatch = RuntimeFactory.eINSTANCE.createIsApplicableMatch();
		ModelgeneratorRuleResult ruleResult = RuntimeFactory.eINSTANCE.createModelgeneratorRuleResult();
		boolean ruleResult_success_prime = Boolean.valueOf(false);
		ruleResult.setSuccess(Boolean.valueOf(ruleResult_success_prime));
		return new Object[] { isApplicableMatch, ruleResult };
	}

	public static final Object[] pattern_ReqConsumerToComputerRule_26_2_isapplicablecore_black_nac_0BB(
			ModelgeneratorRuleResult ruleResult, Computer implDevice) {
		if (ruleResult.getTargetObjects().contains(implDevice)) {
			return new Object[] { ruleResult, implDevice };
		}
		return null;
	}

	public static final Object[] pattern_ReqConsumerToComputerRule_26_2_isapplicablecore_black_nac_1BB(
			ModelgeneratorRuleResult ruleResult, VirtualNodeToComputer virtualNodeToComputer) {
		if (ruleResult.getCorrObjects().contains(virtualNodeToComputer)) {
			return new Object[] { ruleResult, virtualNodeToComputer };
		}
		return null;
	}

	public static final Object[] pattern_ReqConsumerToComputerRule_26_2_isapplicablecore_black_nac_2BB(
			ModelgeneratorRuleResult ruleResult, NetworkSpan virtualNode) {
		if (ruleResult.getSourceObjects().contains(virtualNode)) {
			return new Object[] { ruleResult, virtualNode };
		}
		return null;
	}

	public static final Object[] pattern_ReqConsumerToComputerRule_26_2_isapplicablecore_black_nac_3BB(
			ModelgeneratorRuleResult ruleResult, Container reqContainer) {
		if (ruleResult.getSourceObjects().contains(reqContainer)) {
			return new Object[] { ruleResult, reqContainer };
		}
		return null;
	}

	public static final Object[] pattern_ReqConsumerToComputerRule_26_2_isapplicablecore_black_nac_4BB(
			ModelgeneratorRuleResult ruleResult, ReqContainerToImplContainer reqContainerToImplContainer) {
		if (ruleResult.getCorrObjects().contains(reqContainerToImplContainer)) {
			return new Object[] { ruleResult, reqContainerToImplContainer };
		}
		return null;
	}

	public static final Object[] pattern_ReqConsumerToComputerRule_26_2_isapplicablecore_black_nac_5BB(
			ModelgeneratorRuleResult ruleResult, implementation.Container implContainer) {
		if (ruleResult.getTargetObjects().contains(implContainer)) {
			return new Object[] { ruleResult, implContainer };
		}
		return null;
	}

	public static final Object[] pattern_ReqConsumerToComputerRule_26_2_isapplicablecore_black_nac_6BB(
			ModelgeneratorRuleResult ruleResult, Cable cable) {
		if (ruleResult.getTargetObjects().contains(cable)) {
			return new Object[] { ruleResult, cable };
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_ReqConsumerToComputerRule_26_2_isapplicablecore_blackFFFFFFFFBB(
			RuleEntryContainer ruleEntryContainer, ModelgeneratorRuleResult ruleResult) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		for (RuleEntryList virtualNodeToComputerList : ruleEntryContainer.getRuleEntryList()) {
			for (EObject tmpVirtualNodeToComputer : virtualNodeToComputerList.getEntryObjects()) {
				if (tmpVirtualNodeToComputer instanceof VirtualNodeToComputer) {
					VirtualNodeToComputer virtualNodeToComputer = (VirtualNodeToComputer) tmpVirtualNodeToComputer;
					Computer implDevice = virtualNodeToComputer.getTarget();
					if (implDevice != null) {
						NetworkSpan virtualNode = virtualNodeToComputer.getSource();
						if (virtualNode != null) {
							if (pattern_ReqConsumerToComputerRule_26_2_isapplicablecore_black_nac_1BB(ruleResult,
									virtualNodeToComputer) == null) {
								if (pattern_ReqConsumerToComputerRule_26_2_isapplicablecore_black_nac_0BB(ruleResult,
										implDevice) == null) {
									if (pattern_ReqConsumerToComputerRule_26_2_isapplicablecore_black_nac_2BB(
											ruleResult, virtualNode) == null) {
										for (implementation.Container implContainer : org.moflon.core.utilities.eMoflonEMFUtil
												.getOppositeReferenceTyped(implDevice, implementation.Container.class,
														"devices")) {
											if (pattern_ReqConsumerToComputerRule_26_2_isapplicablecore_black_nac_5BB(
													ruleResult, implContainer) == null) {
												for (Cable cable : implContainer.getCables()) {
													if (pattern_ReqConsumerToComputerRule_26_2_isapplicablecore_black_nac_6BB(
															ruleResult, cable) == null) {
														for (Container reqContainer : org.moflon.core.utilities.eMoflonEMFUtil
																.getOppositeReferenceTyped(virtualNode, Container.class,
																		"networkSpan")) {
															if (pattern_ReqConsumerToComputerRule_26_2_isapplicablecore_black_nac_3BB(
																	ruleResult, reqContainer) == null) {
																for (ReqContainerToImplContainer reqContainerToImplContainer : org.moflon.core.utilities.eMoflonEMFUtil
																		.getOppositeReferenceTyped(implContainer,
																				ReqContainerToImplContainer.class,
																				"target")) {
																	if (reqContainer.equals(
																			reqContainerToImplContainer.getSource())) {
																		if (pattern_ReqConsumerToComputerRule_26_2_isapplicablecore_black_nac_4BB(
																				ruleResult,
																				reqContainerToImplContainer) == null) {
																			_result.add(new Object[] {
																					virtualNodeToComputerList,
																					implDevice, virtualNodeToComputer,
																					virtualNode, reqContainer,
																					reqContainerToImplContainer,
																					implContainer, cable,
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

	public static final Object[] pattern_ReqConsumerToComputerRule_26_3_solveCSP_bindingFBBBBBBBBBB(
			ReqConsumerToComputerRule _this, IsApplicableMatch isApplicableMatch, Computer implDevice,
			Container reqContainer, VirtualNodeToComputer virtualNodeToComputer, NetworkSpan virtualNode, Cable cable,
			implementation.Container implContainer, ReqContainerToImplContainer reqContainerToImplContainer,
			ModelgeneratorRuleResult ruleResult) {
		CSP _localVariable_0 = _this.generateModel_solveCsp_BWD(isApplicableMatch, implDevice, reqContainer,
				virtualNodeToComputer, virtualNode, cable, implContainer, reqContainerToImplContainer, ruleResult);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, implDevice, reqContainer, virtualNodeToComputer,
					virtualNode, cable, implContainer, reqContainerToImplContainer, ruleResult };
		}
		return null;
	}

	public static final Object[] pattern_ReqConsumerToComputerRule_26_3_solveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_ReqConsumerToComputerRule_26_3_solveCSP_bindingAndBlackFBBBBBBBBBB(
			ReqConsumerToComputerRule _this, IsApplicableMatch isApplicableMatch, Computer implDevice,
			Container reqContainer, VirtualNodeToComputer virtualNodeToComputer, NetworkSpan virtualNode, Cable cable,
			implementation.Container implContainer, ReqContainerToImplContainer reqContainerToImplContainer,
			ModelgeneratorRuleResult ruleResult) {
		Object[] result_pattern_ReqConsumerToComputerRule_26_3_solveCSP_binding = pattern_ReqConsumerToComputerRule_26_3_solveCSP_bindingFBBBBBBBBBB(
				_this, isApplicableMatch, implDevice, reqContainer, virtualNodeToComputer, virtualNode, cable,
				implContainer, reqContainerToImplContainer, ruleResult);
		if (result_pattern_ReqConsumerToComputerRule_26_3_solveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_ReqConsumerToComputerRule_26_3_solveCSP_binding[0];

			Object[] result_pattern_ReqConsumerToComputerRule_26_3_solveCSP_black = pattern_ReqConsumerToComputerRule_26_3_solveCSP_blackB(
					csp);
			if (result_pattern_ReqConsumerToComputerRule_26_3_solveCSP_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, implDevice, reqContainer, virtualNodeToComputer,
						virtualNode, cable, implContainer, reqContainerToImplContainer, ruleResult };
			}
		}
		return null;
	}

	public static final boolean pattern_ReqConsumerToComputerRule_26_4_checkCSP_expressionFBB(
			ReqConsumerToComputerRule _this, CSP csp) {
		boolean _localVariable_0 = _this.generateModel_checkCsp_BWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_ReqConsumerToComputerRule_26_5_checknacs_blackBBBBBBB(Computer implDevice,
			Container reqContainer, VirtualNodeToComputer virtualNodeToComputer, NetworkSpan virtualNode, Cable cable,
			implementation.Container implContainer, ReqContainerToImplContainer reqContainerToImplContainer) {
		return new Object[] { implDevice, reqContainer, virtualNodeToComputer, virtualNode, cable, implContainer,
				reqContainerToImplContainer };
	}

	public static final Object[] pattern_ReqConsumerToComputerRule_26_6_perform_blackBBBBBBBB(Computer implDevice,
			Container reqContainer, VirtualNodeToComputer virtualNodeToComputer, NetworkSpan virtualNode, Cable cable,
			implementation.Container implContainer, ReqContainerToImplContainer reqContainerToImplContainer,
			ModelgeneratorRuleResult ruleResult) {
		return new Object[] { implDevice, reqContainer, virtualNodeToComputer, virtualNode, cable, implContainer,
				reqContainerToImplContainer, ruleResult };
	}

	public static final Object[] pattern_ReqConsumerToComputerRule_26_6_perform_greenFBFBB(Computer implDevice,
			Container reqContainer, ModelgeneratorRuleResult ruleResult) {
		ReqAgentToImplDevice reqAgentToImplDevice = ReqToImpTransformatorFactory.eINSTANCE.createReqAgentToImplDevice();
		Consumer reqAgent = RequirementsFactory.eINSTANCE.createConsumer();
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
		return new Object[] { reqAgentToImplDevice, implDevice, reqAgent, reqContainer, ruleResult };
	}

	public static final ModelgeneratorRuleResult pattern_ReqConsumerToComputerRule_26_7_expressionFB(
			ModelgeneratorRuleResult ruleResult) {
		ModelgeneratorRuleResult _result = ruleResult;
		return _result;
	}

	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} //ReqConsumerToComputerRuleImpl
