/**
 */
package ReqToImpTransformator.Rules.impl;

import ReqToImpTransformator.ReqContainerToImplContainer;
import ReqToImpTransformator.ReqToImpTransformatorFactory;

import ReqToImpTransformator.Rules.RulesPackage;
import ReqToImpTransformator.Rules.VirtualNodeToComputerRule;

import ReqToImpTransformator.VirtualNodeToComputer;
import ReqToImpTransformator.VirtualNodeToRouter;

import implementation.Cable;
import implementation.Computer;
import implementation.Device;
import implementation.ImplementationFactory;
import implementation.Router;

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
 * An implementation of the model object '<em><b>Virtual Node To Computer Rule</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class VirtualNodeToComputerRuleImpl extends AbstractRuleImpl implements VirtualNodeToComputerRule {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VirtualNodeToComputerRuleImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RulesPackage.eINSTANCE.getVirtualNodeToComputerRule();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAppropriate_FWD(Match match, NetworkSpan virtualNode, Container reqContainer) {

		Object[] result1_black = VirtualNodeToComputerRuleImpl
				.pattern_VirtualNodeToComputerRule_0_1_initialbindings_blackBBBB(this, match, virtualNode,
						reqContainer);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[match] = " + match + ", " + "[virtualNode] = " + virtualNode + ", " + "[reqContainer] = "
					+ reqContainer + ".");
		}

		Object[] result2_bindingAndBlack = VirtualNodeToComputerRuleImpl
				.pattern_VirtualNodeToComputerRule_0_2_SolveCSP_bindingAndBlackFBBBB(this, match, virtualNode,
						reqContainer);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[match] = " + match + ", " + "[virtualNode] = " + virtualNode + ", " + "[reqContainer] = "
					+ reqContainer + ".");
		}
		CSP csp = (CSP) result2_bindingAndBlack[0];
		// 
		if (VirtualNodeToComputerRuleImpl.pattern_VirtualNodeToComputerRule_0_3_CheckCSP_expressionFBB(this, csp)) {

			Object[] result4_black = VirtualNodeToComputerRuleImpl
					.pattern_VirtualNodeToComputerRule_0_4_collectelementstobetranslated_blackBBB(match, virtualNode,
							reqContainer);
			if (result4_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match + ", "
						+ "[virtualNode] = " + virtualNode + ", " + "[reqContainer] = " + reqContainer + ".");
			}

			Object[] result5_black = VirtualNodeToComputerRuleImpl
					.pattern_VirtualNodeToComputerRule_0_5_collectcontextelements_blackBBB(match, virtualNode,
							reqContainer);
			if (result5_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match + ", "
						+ "[virtualNode] = " + virtualNode + ", " + "[reqContainer] = " + reqContainer + ".");
			}
			VirtualNodeToComputerRuleImpl.pattern_VirtualNodeToComputerRule_0_5_collectcontextelements_greenBBBF(match,
					virtualNode, reqContainer);
			//nothing EMoflonEdge reqContainer__virtualNode____networkSpan = (EMoflonEdge) result5_green[3];

			// 
			VirtualNodeToComputerRuleImpl.pattern_VirtualNodeToComputerRule_0_6_registerobjectstomatch_expressionBBBB(
					this, match, virtualNode, reqContainer);
			return VirtualNodeToComputerRuleImpl.pattern_VirtualNodeToComputerRule_0_7_expressionF();
		} else {
			return VirtualNodeToComputerRuleImpl.pattern_VirtualNodeToComputerRule_0_8_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PerformRuleResult perform_FWD(IsApplicableMatch isApplicableMatch) {
		// [user code injected with eMoflon]

		// TODO: implement this method here but do not remove the injection marker 
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IsApplicableRuleResult isApplicable_FWD(Match match) {
		// [user code injected with eMoflon]

		// TODO: implement this method here but do not remove the injection marker 
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void registerObjectsToMatch_FWD(Match match, NetworkSpan virtualNode, Container reqContainer) {
		match.registerObject("virtualNode", virtualNode);
		match.registerObject("reqContainer", reqContainer);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isAppropriate_solveCsp_FWD(Match match, NetworkSpan virtualNode, Container reqContainer) {// Create CSP
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
	public boolean checkTypes_FWD(Match match) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAppropriate_BWD(Match match, Cable cable, Router router, implementation.Container implContainer,
			Computer computer) {

		Object[] result1_black = VirtualNodeToComputerRuleImpl
				.pattern_VirtualNodeToComputerRule_7_1_initialbindings_blackBBBBBB(this, match, cable, router,
						implContainer, computer);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[match] = " + match + ", " + "[cable] = " + cable + ", " + "[router] = " + router + ", "
					+ "[implContainer] = " + implContainer + ", " + "[computer] = " + computer + ".");
		}

		Object[] result2_bindingAndBlack = VirtualNodeToComputerRuleImpl
				.pattern_VirtualNodeToComputerRule_7_2_SolveCSP_bindingAndBlackFBBBBBB(this, match, cable, router,
						implContainer, computer);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[match] = " + match + ", " + "[cable] = " + cable + ", " + "[router] = " + router + ", "
					+ "[implContainer] = " + implContainer + ", " + "[computer] = " + computer + ".");
		}
		CSP csp = (CSP) result2_bindingAndBlack[0];
		// 
		if (VirtualNodeToComputerRuleImpl.pattern_VirtualNodeToComputerRule_7_3_CheckCSP_expressionFBB(this, csp)) {

			Object[] result4_black = VirtualNodeToComputerRuleImpl
					.pattern_VirtualNodeToComputerRule_7_4_collectelementstobetranslated_blackBBBBB(match, cable,
							router, implContainer, computer);
			if (result4_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match + ", "
						+ "[cable] = " + cable + ", " + "[router] = " + router + ", " + "[implContainer] = "
						+ implContainer + ", " + "[computer] = " + computer + ".");
			}
			VirtualNodeToComputerRuleImpl
					.pattern_VirtualNodeToComputerRule_7_4_collectelementstobetranslated_greenBBBBBFFFFF(match, cable,
							router, implContainer, computer);
			//nothing EMoflonEdge implContainer__computer____devices = (EMoflonEdge) result4_green[5];
			//nothing EMoflonEdge router__cable____outgoing = (EMoflonEdge) result4_green[6];
			//nothing EMoflonEdge cable__router____source = (EMoflonEdge) result4_green[7];
			//nothing EMoflonEdge computer__cable____incoming = (EMoflonEdge) result4_green[8];
			//nothing EMoflonEdge cable__computer____target = (EMoflonEdge) result4_green[9];

			Object[] result5_black = VirtualNodeToComputerRuleImpl
					.pattern_VirtualNodeToComputerRule_7_5_collectcontextelements_blackBBBBB(match, cable, router,
							implContainer, computer);
			if (result5_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match + ", "
						+ "[cable] = " + cable + ", " + "[router] = " + router + ", " + "[implContainer] = "
						+ implContainer + ", " + "[computer] = " + computer + ".");
			}
			VirtualNodeToComputerRuleImpl.pattern_VirtualNodeToComputerRule_7_5_collectcontextelements_greenBBBBFF(
					match, cable, router, implContainer);
			//nothing EMoflonEdge implContainer__router____devices = (EMoflonEdge) result5_green[4];
			//nothing EMoflonEdge implContainer__cable____cables = (EMoflonEdge) result5_green[5];

			// 
			VirtualNodeToComputerRuleImpl.pattern_VirtualNodeToComputerRule_7_6_registerobjectstomatch_expressionBBBBBB(
					this, match, cable, router, implContainer, computer);
			return VirtualNodeToComputerRuleImpl.pattern_VirtualNodeToComputerRule_7_7_expressionF();
		} else {
			return VirtualNodeToComputerRuleImpl.pattern_VirtualNodeToComputerRule_7_8_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PerformRuleResult perform_BWD(IsApplicableMatch isApplicableMatch) {

		Object[] result1_bindingAndBlack = VirtualNodeToComputerRuleImpl
				.pattern_VirtualNodeToComputerRule_8_1_performtransformation_bindingAndBlackFFFFFFFFFBB(this,
						isApplicableMatch);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[isApplicableMatch] = " + isApplicableMatch + ".");
		}
		NetworkSpan virtualNode = (NetworkSpan) result1_bindingAndBlack[0];
		Cable cable = (Cable) result1_bindingAndBlack[1];
		Router router = (Router) result1_bindingAndBlack[2];
		implementation.Container implContainer = (implementation.Container) result1_bindingAndBlack[3];
		Computer computer = (Computer) result1_bindingAndBlack[4];
		VirtualNodeToRouter virtualNodeToRouter = (VirtualNodeToRouter) result1_bindingAndBlack[5];
		Container reqContainer = (Container) result1_bindingAndBlack[6];
		ReqContainerToImplContainer reqContainerToImplContainer = (ReqContainerToImplContainer) result1_bindingAndBlack[7];
		//nothing CSP csp = (CSP) result1_bindingAndBlack[8];
		Object[] result1_green = VirtualNodeToComputerRuleImpl
				.pattern_VirtualNodeToComputerRule_8_1_performtransformation_greenBFB(virtualNode, computer);
		VirtualNodeToComputer virtualNodeToComputer = (VirtualNodeToComputer) result1_green[1];

		Object[] result2_black = VirtualNodeToComputerRuleImpl
				.pattern_VirtualNodeToComputerRule_8_2_collecttranslatedelements_blackBB(virtualNodeToComputer,
						computer);
		if (result2_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[virtualNodeToComputer] = "
					+ virtualNodeToComputer + ", " + "[computer] = " + computer + ".");
		}
		Object[] result2_green = VirtualNodeToComputerRuleImpl
				.pattern_VirtualNodeToComputerRule_8_2_collecttranslatedelements_greenFBB(virtualNodeToComputer,
						computer);
		PerformRuleResult ruleresult = (PerformRuleResult) result2_green[0];

		Object[] result3_black = VirtualNodeToComputerRuleImpl
				.pattern_VirtualNodeToComputerRule_8_3_bookkeepingforedges_blackBBBBBBBBBB(ruleresult, virtualNode,
						cable, router, implContainer, virtualNodeToComputer, computer, virtualNodeToRouter,
						reqContainer, reqContainerToImplContainer);
		if (result3_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[ruleresult] = " + ruleresult
					+ ", " + "[virtualNode] = " + virtualNode + ", " + "[cable] = " + cable + ", " + "[router] = "
					+ router + ", " + "[implContainer] = " + implContainer + ", " + "[virtualNodeToComputer] = "
					+ virtualNodeToComputer + ", " + "[computer] = " + computer + ", " + "[virtualNodeToRouter] = "
					+ virtualNodeToRouter + ", " + "[reqContainer] = " + reqContainer + ", "
					+ "[reqContainerToImplContainer] = " + reqContainerToImplContainer + ".");
		}
		VirtualNodeToComputerRuleImpl.pattern_VirtualNodeToComputerRule_8_3_bookkeepingforedges_greenBBBBBBBFFFFFFF(
				ruleresult, virtualNode, cable, router, implContainer, virtualNodeToComputer, computer);
		//nothing EMoflonEdge virtualNodeToComputer__computer____target = (EMoflonEdge) result3_green[7];
		//nothing EMoflonEdge implContainer__computer____devices = (EMoflonEdge) result3_green[8];
		//nothing EMoflonEdge router__cable____outgoing = (EMoflonEdge) result3_green[9];
		//nothing EMoflonEdge cable__router____source = (EMoflonEdge) result3_green[10];
		//nothing EMoflonEdge computer__cable____incoming = (EMoflonEdge) result3_green[11];
		//nothing EMoflonEdge cable__computer____target = (EMoflonEdge) result3_green[12];
		//nothing EMoflonEdge virtualNodeToComputer__virtualNode____source = (EMoflonEdge) result3_green[13];

		// 
		// 
		VirtualNodeToComputerRuleImpl.pattern_VirtualNodeToComputerRule_8_5_registerobjects_expressionBBBBBBBBBBB(this,
				ruleresult, virtualNode, cable, router, implContainer, virtualNodeToComputer, computer,
				virtualNodeToRouter, reqContainer, reqContainerToImplContainer);
		return VirtualNodeToComputerRuleImpl.pattern_VirtualNodeToComputerRule_8_6_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IsApplicableRuleResult isApplicable_BWD(Match match) {

		Object[] result1_bindingAndBlack = VirtualNodeToComputerRuleImpl
				.pattern_VirtualNodeToComputerRule_9_1_preparereturnvalue_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		EOperation performOperation = (EOperation) result1_bindingAndBlack[0];
		//nothing EClass eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = VirtualNodeToComputerRuleImpl
				.pattern_VirtualNodeToComputerRule_9_1_preparereturnvalue_greenBF(performOperation);
		IsApplicableRuleResult ruleresult = (IsApplicableRuleResult) result1_green[1];

		// ForEach 
		Object[] result2_binding = VirtualNodeToComputerRuleImpl
				.pattern_VirtualNodeToComputerRule_9_2_corematch_bindingFFFFB(match);
		if (result2_binding == null) {
			throw new RuntimeException(
					"Binding in node core match failed." + " Variables: " + "[match] = " + match + ".");
		}
		Cable cable = (Cable) result2_binding[0];
		Router router = (Router) result2_binding[1];
		implementation.Container implContainer = (implementation.Container) result2_binding[2];
		Computer computer = (Computer) result2_binding[3];
		for (Object[] result2_black : VirtualNodeToComputerRuleImpl
				.pattern_VirtualNodeToComputerRule_9_2_corematch_blackFBBBBFFFB(cable, router, implContainer, computer,
						match)) {
			NetworkSpan virtualNode = (NetworkSpan) result2_black[0];
			VirtualNodeToRouter virtualNodeToRouter = (VirtualNodeToRouter) result2_black[5];
			Container reqContainer = (Container) result2_black[6];
			ReqContainerToImplContainer reqContainerToImplContainer = (ReqContainerToImplContainer) result2_black[7];
			// ForEach 
			for (Object[] result3_black : VirtualNodeToComputerRuleImpl
					.pattern_VirtualNodeToComputerRule_9_3_findcontext_blackBBBBBBBB(virtualNode, cable, router,
							implContainer, computer, virtualNodeToRouter, reqContainer, reqContainerToImplContainer)) {
				Object[] result3_green = VirtualNodeToComputerRuleImpl
						.pattern_VirtualNodeToComputerRule_9_3_findcontext_greenBBBBBBBBFFFFFFFFFFFFF(virtualNode,
								cable, router, implContainer, computer, virtualNodeToRouter, reqContainer,
								reqContainerToImplContainer);
				IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result3_green[8];
				//nothing EMoflonEdge implContainer__router____devices = (EMoflonEdge) result3_green[9];
				//nothing EMoflonEdge implContainer__cable____cables = (EMoflonEdge) result3_green[10];
				//nothing EMoflonEdge implContainer__computer____devices = (EMoflonEdge) result3_green[11];
				//nothing EMoflonEdge router__cable____outgoing = (EMoflonEdge) result3_green[12];
				//nothing EMoflonEdge cable__router____source = (EMoflonEdge) result3_green[13];
				//nothing EMoflonEdge computer__cable____incoming = (EMoflonEdge) result3_green[14];
				//nothing EMoflonEdge cable__computer____target = (EMoflonEdge) result3_green[15];
				//nothing EMoflonEdge virtualNodeToRouter__router____target = (EMoflonEdge) result3_green[16];
				//nothing EMoflonEdge virtualNodeToRouter__virtualNode____source = (EMoflonEdge) result3_green[17];
				//nothing EMoflonEdge reqContainerToImplContainer__implContainer____target = (EMoflonEdge) result3_green[18];
				//nothing EMoflonEdge reqContainerToImplContainer__reqContainer____source = (EMoflonEdge) result3_green[19];
				//nothing EMoflonEdge reqContainer__virtualNode____networkSpan = (EMoflonEdge) result3_green[20];

				Object[] result4_bindingAndBlack = VirtualNodeToComputerRuleImpl
						.pattern_VirtualNodeToComputerRule_9_4_solveCSP_bindingAndBlackFBBBBBBBBBB(this,
								isApplicableMatch, virtualNode, cable, router, implContainer, computer,
								virtualNodeToRouter, reqContainer, reqContainerToImplContainer);
				if (result4_bindingAndBlack == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
							+ "[isApplicableMatch] = " + isApplicableMatch + ", " + "[virtualNode] = " + virtualNode
							+ ", " + "[cable] = " + cable + ", " + "[router] = " + router + ", " + "[implContainer] = "
							+ implContainer + ", " + "[computer] = " + computer + ", " + "[virtualNodeToRouter] = "
							+ virtualNodeToRouter + ", " + "[reqContainer] = " + reqContainer + ", "
							+ "[reqContainerToImplContainer] = " + reqContainerToImplContainer + ".");
				}
				CSP csp = (CSP) result4_bindingAndBlack[0];
				// 
				if (VirtualNodeToComputerRuleImpl.pattern_VirtualNodeToComputerRule_9_5_checkCSP_expressionFBB(this,
						csp)) {

					Object[] result6_black = VirtualNodeToComputerRuleImpl
							.pattern_VirtualNodeToComputerRule_9_6_addmatchtoruleresult_blackBB(ruleresult,
									isApplicableMatch);
					if (result6_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[ruleresult] = "
								+ ruleresult + ", " + "[isApplicableMatch] = " + isApplicableMatch + ".");
					}
					VirtualNodeToComputerRuleImpl.pattern_VirtualNodeToComputerRule_9_6_addmatchtoruleresult_greenBB(
							ruleresult, isApplicableMatch);

				} else {
				}

			}

		}
		return VirtualNodeToComputerRuleImpl.pattern_VirtualNodeToComputerRule_9_7_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void registerObjectsToMatch_BWD(Match match, Cable cable, Router router,
			implementation.Container implContainer, Computer computer) {
		match.registerObject("cable", cable);
		match.registerObject("router", router);
		match.registerObject("implContainer", implContainer);
		match.registerObject("computer", computer);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isAppropriate_solveCsp_BWD(Match match, Cable cable, Router router,
			implementation.Container implContainer, Computer computer) {// Create CSP
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
	public CSP isApplicable_solveCsp_BWD(IsApplicableMatch isApplicableMatch, NetworkSpan virtualNode, Cable cable,
			Router router, implementation.Container implContainer, Computer computer,
			VirtualNodeToRouter virtualNodeToRouter, Container reqContainer,
			ReqContainerToImplContainer reqContainerToImplContainer) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals

		// Create attribute variables

		// Create unbound variables

		// Create constraints

		// Solve CSP

		// Snapshot pattern match on which CSP is solved
		isApplicableMatch.registerObject("virtualNode", virtualNode);
		isApplicableMatch.registerObject("cable", cable);
		isApplicableMatch.registerObject("router", router);
		isApplicableMatch.registerObject("implContainer", implContainer);
		isApplicableMatch.registerObject("computer", computer);
		isApplicableMatch.registerObject("virtualNodeToRouter", virtualNodeToRouter);
		isApplicableMatch.registerObject("reqContainer", reqContainer);
		isApplicableMatch.registerObject("reqContainerToImplContainer", reqContainerToImplContainer);
		return csp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isApplicable_checkCsp_BWD(CSP csp) {
		return csp.check();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void registerObjects_BWD(PerformRuleResult ruleresult, EObject virtualNode, EObject cable, EObject router,
			EObject implContainer, EObject virtualNodeToComputer, EObject computer, EObject virtualNodeToRouter,
			EObject reqContainer, EObject reqContainerToImplContainer) {
		ruleresult.registerObject("virtualNode", virtualNode);
		ruleresult.registerObject("cable", cable);
		ruleresult.registerObject("router", router);
		ruleresult.registerObject("implContainer", implContainer);
		ruleresult.registerObject("virtualNodeToComputer", virtualNodeToComputer);
		ruleresult.registerObject("computer", computer);
		ruleresult.registerObject("virtualNodeToRouter", virtualNodeToRouter);
		ruleresult.registerObject("reqContainer", reqContainer);
		ruleresult.registerObject("reqContainerToImplContainer", reqContainerToImplContainer);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean checkTypes_BWD(Match match) {
		return true && org.moflon.util.eMoflonSDMUtil.getFQN(match.getObject("computer").eClass())
				.equals("implementation.Computer.");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_FWD_NetworkSpan_0(NetworkSpan virtualNode) {

		Object[] result1_bindingAndBlack = VirtualNodeToComputerRuleImpl
				.pattern_VirtualNodeToComputerRule_17_1_preparereturnvalue_bindingAndBlackFFBF(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		EOperation isApplicableCC = (EOperation) result1_bindingAndBlack[3];
		Object[] result1_green = VirtualNodeToComputerRuleImpl
				.pattern_VirtualNodeToComputerRule_17_1_preparereturnvalue_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach 
		for (Object[] result2_black : VirtualNodeToComputerRuleImpl
				.pattern_VirtualNodeToComputerRule_17_2_testcorematchandDECs_blackBF(virtualNode)) {
			Container reqContainer = (Container) result2_black[1];
			Object[] result2_green = VirtualNodeToComputerRuleImpl
					.pattern_VirtualNodeToComputerRule_17_2_testcorematchandDECs_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// 
			if (VirtualNodeToComputerRuleImpl
					.pattern_VirtualNodeToComputerRule_17_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBB(
							this, match, virtualNode, reqContainer)) {
				// 
				if (VirtualNodeToComputerRuleImpl
						.pattern_VirtualNodeToComputerRule_17_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(
								this, match)) {

					Object[] result5_black = VirtualNodeToComputerRuleImpl
							.pattern_VirtualNodeToComputerRule_17_5_Addmatchtoruleresult_blackBBBB(match,
									__performOperation, __result, isApplicableCC);
					if (result5_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match
								+ ", " + "[__performOperation] = " + __performOperation + ", " + "[__result] = "
								+ __result + ", " + "[isApplicableCC] = " + isApplicableCC + ".");
					}
					VirtualNodeToComputerRuleImpl.pattern_VirtualNodeToComputerRule_17_5_Addmatchtoruleresult_greenBBBB(
							match, __performOperation, __result, isApplicableCC);

				} else {
				}

			} else {
			}

		}
		return VirtualNodeToComputerRuleImpl.pattern_VirtualNodeToComputerRule_17_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_BWD_EMoflonEdge_1(EMoflonEdge _edge_devices) {

		Object[] result1_bindingAndBlack = VirtualNodeToComputerRuleImpl
				.pattern_VirtualNodeToComputerRule_18_1_preparereturnvalue_bindingAndBlackFFBF(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		EOperation isApplicableCC = (EOperation) result1_bindingAndBlack[3];
		Object[] result1_green = VirtualNodeToComputerRuleImpl
				.pattern_VirtualNodeToComputerRule_18_1_preparereturnvalue_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach 
		for (Object[] result2_black : VirtualNodeToComputerRuleImpl
				.pattern_VirtualNodeToComputerRule_18_2_testcorematchandDECs_blackFFFFB(_edge_devices)) {
			Cable cable = (Cable) result2_black[0];
			Router router = (Router) result2_black[1];
			implementation.Container implContainer = (implementation.Container) result2_black[2];
			Computer computer = (Computer) result2_black[3];
			Object[] result2_green = VirtualNodeToComputerRuleImpl
					.pattern_VirtualNodeToComputerRule_18_2_testcorematchandDECs_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// 
			if (VirtualNodeToComputerRuleImpl
					.pattern_VirtualNodeToComputerRule_18_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBBBB(
							this, match, cable, router, implContainer, computer)) {
				// 
				if (VirtualNodeToComputerRuleImpl
						.pattern_VirtualNodeToComputerRule_18_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(
								this, match)) {

					Object[] result5_black = VirtualNodeToComputerRuleImpl
							.pattern_VirtualNodeToComputerRule_18_5_Addmatchtoruleresult_blackBBBB(match,
									__performOperation, __result, isApplicableCC);
					if (result5_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match
								+ ", " + "[__performOperation] = " + __performOperation + ", " + "[__result] = "
								+ __result + ", " + "[isApplicableCC] = " + isApplicableCC + ".");
					}
					VirtualNodeToComputerRuleImpl.pattern_VirtualNodeToComputerRule_18_5_Addmatchtoruleresult_greenBBBB(
							match, __performOperation, __result, isApplicableCC);

				} else {
				}

			} else {
			}

		}
		return VirtualNodeToComputerRuleImpl.pattern_VirtualNodeToComputerRule_18_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AttributeConstraintsRuleResult checkAttributes_FWD(TripleMatch __tripleMatch) {
		AttributeConstraintsRuleResult ruleResult = org.moflon.tgg.runtime.RuntimeFactory.eINSTANCE
				.createAttributeConstraintsRuleResult();
		ruleResult.setRule("VirtualNodeToComputerRule");
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
		ruleResult.setRule("VirtualNodeToComputerRule");
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

		Object[] result1_black = VirtualNodeToComputerRuleImpl
				.pattern_VirtualNodeToComputerRule_21_1_prepare_blackB(this);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		Object[] result1_green = VirtualNodeToComputerRuleImpl.pattern_VirtualNodeToComputerRule_21_1_prepare_greenF();
		IsApplicableRuleResult result = (IsApplicableRuleResult) result1_green[0];

		Object[] result2_bindingAndBlack = VirtualNodeToComputerRuleImpl
				.pattern_VirtualNodeToComputerRule_21_2_matchsrctrgcontext_bindingAndBlackFFFFFFBB(sourceMatch,
						targetMatch);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[sourceMatch] = " + sourceMatch
					+ ", " + "[targetMatch] = " + targetMatch + ".");
		}
		NetworkSpan virtualNode = (NetworkSpan) result2_bindingAndBlack[0];
		Cable cable = (Cable) result2_bindingAndBlack[1];
		Router router = (Router) result2_bindingAndBlack[2];
		implementation.Container implContainer = (implementation.Container) result2_bindingAndBlack[3];
		Computer computer = (Computer) result2_bindingAndBlack[4];
		Container reqContainer = (Container) result2_bindingAndBlack[5];

		Object[] result3_bindingAndBlack = VirtualNodeToComputerRuleImpl
				.pattern_VirtualNodeToComputerRule_21_3_solvecsp_bindingAndBlackFBBBBBBBBB(this, virtualNode, cable,
						router, implContainer, computer, reqContainer, sourceMatch, targetMatch);
		if (result3_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[virtualNode] = " + virtualNode + ", " + "[cable] = " + cable + ", " + "[router] = " + router
					+ ", " + "[implContainer] = " + implContainer + ", " + "[computer] = " + computer + ", "
					+ "[reqContainer] = " + reqContainer + ", " + "[sourceMatch] = " + sourceMatch + ", "
					+ "[targetMatch] = " + targetMatch + ".");
		}
		CSP csp = (CSP) result3_bindingAndBlack[0];
		// 
		if (VirtualNodeToComputerRuleImpl.pattern_VirtualNodeToComputerRule_21_4_checkCSP_expressionFB(csp)) {
			// ForEach 
			for (Object[] result5_black : VirtualNodeToComputerRuleImpl
					.pattern_VirtualNodeToComputerRule_21_5_matchcorrcontext_blackBBBFBFBB(virtualNode, router,
							implContainer, reqContainer, sourceMatch, targetMatch)) {
				VirtualNodeToRouter virtualNodeToRouter = (VirtualNodeToRouter) result5_black[3];
				ReqContainerToImplContainer reqContainerToImplContainer = (ReqContainerToImplContainer) result5_black[5];
				Object[] result5_green = VirtualNodeToComputerRuleImpl
						.pattern_VirtualNodeToComputerRule_21_5_matchcorrcontext_greenBBBBF(virtualNodeToRouter,
								reqContainerToImplContainer, sourceMatch, targetMatch);
				CCMatch ccMatch = (CCMatch) result5_green[4];

				Object[] result6_black = VirtualNodeToComputerRuleImpl
						.pattern_VirtualNodeToComputerRule_21_6_createcorrespondence_blackBBBBBBB(virtualNode, cable,
								router, implContainer, computer, reqContainer, ccMatch);
				if (result6_black == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[virtualNode] = "
							+ virtualNode + ", " + "[cable] = " + cable + ", " + "[router] = " + router + ", "
							+ "[implContainer] = " + implContainer + ", " + "[computer] = " + computer + ", "
							+ "[reqContainer] = " + reqContainer + ", " + "[ccMatch] = " + ccMatch + ".");
				}
				VirtualNodeToComputerRuleImpl.pattern_VirtualNodeToComputerRule_21_6_createcorrespondence_greenBFBB(
						virtualNode, computer, ccMatch);
				//nothing VirtualNodeToComputer virtualNodeToComputer = (VirtualNodeToComputer) result6_green[1];

				Object[] result7_black = VirtualNodeToComputerRuleImpl
						.pattern_VirtualNodeToComputerRule_21_7_addtoreturnedresult_blackBB(result, ccMatch);
				if (result7_black == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[result] = " + result
							+ ", " + "[ccMatch] = " + ccMatch + ".");
				}
				VirtualNodeToComputerRuleImpl.pattern_VirtualNodeToComputerRule_21_7_addtoreturnedresult_greenBB(result,
						ccMatch);

			}

		} else {
		}
		return VirtualNodeToComputerRuleImpl.pattern_VirtualNodeToComputerRule_21_8_expressionFB(result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isApplicable_solveCsp_CC(NetworkSpan virtualNode, Cable cable, Router router,
			implementation.Container implContainer, Computer computer, Container reqContainer, Match sourceMatch,
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
	public boolean checkDEC_FWD(NetworkSpan virtualNode, Container reqContainer) {// 
		Object[] result1_black = VirtualNodeToComputerRuleImpl
				.pattern_VirtualNodeToComputerRule_24_1_matchtggpattern_blackBB(virtualNode, reqContainer);
		if (result1_black != null) {
			return VirtualNodeToComputerRuleImpl.pattern_VirtualNodeToComputerRule_24_2_expressionF();
		} else {
			return VirtualNodeToComputerRuleImpl.pattern_VirtualNodeToComputerRule_24_3_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean checkDEC_BWD(Cable cable, Router router, implementation.Container implContainer, Computer computer) {// 
		Object[] result1_black = VirtualNodeToComputerRuleImpl
				.pattern_VirtualNodeToComputerRule_25_1_matchtggpattern_blackBBBB(cable, router, implContainer,
						computer);
		if (result1_black != null) {
			return VirtualNodeToComputerRuleImpl.pattern_VirtualNodeToComputerRule_25_2_expressionF();
		} else {
			return VirtualNodeToComputerRuleImpl.pattern_VirtualNodeToComputerRule_25_3_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModelgeneratorRuleResult generateModel(RuleEntryContainer ruleEntryContainer,
			VirtualNodeToRouter virtualNodeToRouterParameter) {

		Object[] result1_black = VirtualNodeToComputerRuleImpl
				.pattern_VirtualNodeToComputerRule_26_1_createresult_blackB(this);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		Object[] result1_green = VirtualNodeToComputerRuleImpl
				.pattern_VirtualNodeToComputerRule_26_1_createresult_greenFF();
		IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result1_green[0];
		ModelgeneratorRuleResult ruleResult = (ModelgeneratorRuleResult) result1_green[1];

		// ForEach 
		for (Object[] result2_black : VirtualNodeToComputerRuleImpl
				.pattern_VirtualNodeToComputerRule_26_2_isapplicablecore_blackFFFFFFFFBB(ruleEntryContainer,
						ruleResult)) {
			//nothing RuleEntryList virtualNodeToRouterList = (RuleEntryList) result2_black[0];
			NetworkSpan virtualNode = (NetworkSpan) result2_black[1];
			VirtualNodeToRouter virtualNodeToRouter = (VirtualNodeToRouter) result2_black[2];
			Router router = (Router) result2_black[3];
			implementation.Container implContainer = (implementation.Container) result2_black[4];
			Cable cable = (Cable) result2_black[5];
			ReqContainerToImplContainer reqContainerToImplContainer = (ReqContainerToImplContainer) result2_black[6];
			Container reqContainer = (Container) result2_black[7];

			Object[] result3_bindingAndBlack = VirtualNodeToComputerRuleImpl
					.pattern_VirtualNodeToComputerRule_26_3_solveCSP_bindingAndBlackFBBBBBBBBBB(this, isApplicableMatch,
							virtualNode, cable, router, implContainer, virtualNodeToRouter, reqContainer,
							reqContainerToImplContainer, ruleResult);
			if (result3_bindingAndBlack == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
						+ "[isApplicableMatch] = " + isApplicableMatch + ", " + "[virtualNode] = " + virtualNode + ", "
						+ "[cable] = " + cable + ", " + "[router] = " + router + ", " + "[implContainer] = "
						+ implContainer + ", " + "[virtualNodeToRouter] = " + virtualNodeToRouter + ", "
						+ "[reqContainer] = " + reqContainer + ", " + "[reqContainerToImplContainer] = "
						+ reqContainerToImplContainer + ", " + "[ruleResult] = " + ruleResult + ".");
			}
			CSP csp = (CSP) result3_bindingAndBlack[0];
			// 
			if (VirtualNodeToComputerRuleImpl.pattern_VirtualNodeToComputerRule_26_4_checkCSP_expressionFBB(this,
					csp)) {
				// 
				Object[] result5_black = VirtualNodeToComputerRuleImpl
						.pattern_VirtualNodeToComputerRule_26_5_checknacs_blackBBBBBBB(virtualNode, cable, router,
								implContainer, virtualNodeToRouter, reqContainer, reqContainerToImplContainer);
				if (result5_black != null) {

					Object[] result6_black = VirtualNodeToComputerRuleImpl
							.pattern_VirtualNodeToComputerRule_26_6_perform_blackBBBBBBBB(virtualNode, cable, router,
									implContainer, virtualNodeToRouter, reqContainer, reqContainerToImplContainer,
									ruleResult);
					if (result6_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[virtualNode] = "
								+ virtualNode + ", " + "[cable] = " + cable + ", " + "[router] = " + router + ", "
								+ "[implContainer] = " + implContainer + ", " + "[virtualNodeToRouter] = "
								+ virtualNodeToRouter + ", " + "[reqContainer] = " + reqContainer + ", "
								+ "[reqContainerToImplContainer] = " + reqContainerToImplContainer + ", "
								+ "[ruleResult] = " + ruleResult + ".");
					}
					VirtualNodeToComputerRuleImpl.pattern_VirtualNodeToComputerRule_26_6_perform_greenBBBBFFB(
							virtualNode, cable, router, implContainer, ruleResult);
					//nothing VirtualNodeToComputer virtualNodeToComputer = (VirtualNodeToComputer) result6_green[4];
					//nothing Computer computer = (Computer) result6_green[5];

				} else {
				}

			} else {
			}

		}
		return VirtualNodeToComputerRuleImpl.pattern_VirtualNodeToComputerRule_26_7_expressionFB(ruleResult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP generateModel_solveCsp_BWD(IsApplicableMatch isApplicableMatch, NetworkSpan virtualNode, Cable cable,
			Router router, implementation.Container implContainer, VirtualNodeToRouter virtualNodeToRouter,
			Container reqContainer, ReqContainerToImplContainer reqContainerToImplContainer,
			ModelgeneratorRuleResult ruleResult) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals

		// Create attribute variables

		// Create unbound variables

		// Create constraints

		// Solve CSP

		// Snapshot pattern match on which CSP is solved
		isApplicableMatch.registerObject("virtualNode", virtualNode);
		isApplicableMatch.registerObject("cable", cable);
		isApplicableMatch.registerObject("router", router);
		isApplicableMatch.registerObject("implContainer", implContainer);
		isApplicableMatch.registerObject("virtualNodeToRouter", virtualNodeToRouter);
		isApplicableMatch.registerObject("reqContainer", reqContainer);
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
		case RulesPackage.VIRTUAL_NODE_TO_COMPUTER_RULE___IS_APPROPRIATE_FWD__MATCH_NETWORKSPAN_CONTAINER:
			return isAppropriate_FWD((Match) arguments.get(0), (NetworkSpan) arguments.get(1),
					(Container) arguments.get(2));
		case RulesPackage.VIRTUAL_NODE_TO_COMPUTER_RULE___PERFORM_FWD__ISAPPLICABLEMATCH:
			return perform_FWD((IsApplicableMatch) arguments.get(0));
		case RulesPackage.VIRTUAL_NODE_TO_COMPUTER_RULE___IS_APPLICABLE_FWD__MATCH:
			return isApplicable_FWD((Match) arguments.get(0));
		case RulesPackage.VIRTUAL_NODE_TO_COMPUTER_RULE___REGISTER_OBJECTS_TO_MATCH_FWD__MATCH_NETWORKSPAN_CONTAINER:
			registerObjectsToMatch_FWD((Match) arguments.get(0), (NetworkSpan) arguments.get(1),
					(Container) arguments.get(2));
			return null;
		case RulesPackage.VIRTUAL_NODE_TO_COMPUTER_RULE___IS_APPROPRIATE_SOLVE_CSP_FWD__MATCH_NETWORKSPAN_CONTAINER:
			return isAppropriate_solveCsp_FWD((Match) arguments.get(0), (NetworkSpan) arguments.get(1),
					(Container) arguments.get(2));
		case RulesPackage.VIRTUAL_NODE_TO_COMPUTER_RULE___IS_APPROPRIATE_CHECK_CSP_FWD__CSP:
			return isAppropriate_checkCsp_FWD((CSP) arguments.get(0));
		case RulesPackage.VIRTUAL_NODE_TO_COMPUTER_RULE___CHECK_TYPES_FWD__MATCH:
			return checkTypes_FWD((Match) arguments.get(0));
		case RulesPackage.VIRTUAL_NODE_TO_COMPUTER_RULE___IS_APPROPRIATE_BWD__MATCH_CABLE_ROUTER_CONTAINER_COMPUTER:
			return isAppropriate_BWD((Match) arguments.get(0), (Cable) arguments.get(1), (Router) arguments.get(2),
					(implementation.Container) arguments.get(3), (Computer) arguments.get(4));
		case RulesPackage.VIRTUAL_NODE_TO_COMPUTER_RULE___PERFORM_BWD__ISAPPLICABLEMATCH:
			return perform_BWD((IsApplicableMatch) arguments.get(0));
		case RulesPackage.VIRTUAL_NODE_TO_COMPUTER_RULE___IS_APPLICABLE_BWD__MATCH:
			return isApplicable_BWD((Match) arguments.get(0));
		case RulesPackage.VIRTUAL_NODE_TO_COMPUTER_RULE___REGISTER_OBJECTS_TO_MATCH_BWD__MATCH_CABLE_ROUTER_CONTAINER_COMPUTER:
			registerObjectsToMatch_BWD((Match) arguments.get(0), (Cable) arguments.get(1), (Router) arguments.get(2),
					(implementation.Container) arguments.get(3), (Computer) arguments.get(4));
			return null;
		case RulesPackage.VIRTUAL_NODE_TO_COMPUTER_RULE___IS_APPROPRIATE_SOLVE_CSP_BWD__MATCH_CABLE_ROUTER_CONTAINER_COMPUTER:
			return isAppropriate_solveCsp_BWD((Match) arguments.get(0), (Cable) arguments.get(1),
					(Router) arguments.get(2), (implementation.Container) arguments.get(3),
					(Computer) arguments.get(4));
		case RulesPackage.VIRTUAL_NODE_TO_COMPUTER_RULE___IS_APPROPRIATE_CHECK_CSP_BWD__CSP:
			return isAppropriate_checkCsp_BWD((CSP) arguments.get(0));
		case RulesPackage.VIRTUAL_NODE_TO_COMPUTER_RULE___IS_APPLICABLE_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_NETWORKSPAN_CABLE_ROUTER_CONTAINER_COMPUTER_VIRTUALNODETOROUTER_CONTAINER_REQCONTAINERTOIMPLCONTAINER:
			return isApplicable_solveCsp_BWD((IsApplicableMatch) arguments.get(0), (NetworkSpan) arguments.get(1),
					(Cable) arguments.get(2), (Router) arguments.get(3), (implementation.Container) arguments.get(4),
					(Computer) arguments.get(5), (VirtualNodeToRouter) arguments.get(6), (Container) arguments.get(7),
					(ReqContainerToImplContainer) arguments.get(8));
		case RulesPackage.VIRTUAL_NODE_TO_COMPUTER_RULE___IS_APPLICABLE_CHECK_CSP_BWD__CSP:
			return isApplicable_checkCsp_BWD((CSP) arguments.get(0));
		case RulesPackage.VIRTUAL_NODE_TO_COMPUTER_RULE___REGISTER_OBJECTS_BWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT:
			registerObjects_BWD((PerformRuleResult) arguments.get(0), (EObject) arguments.get(1),
					(EObject) arguments.get(2), (EObject) arguments.get(3), (EObject) arguments.get(4),
					(EObject) arguments.get(5), (EObject) arguments.get(6), (EObject) arguments.get(7),
					(EObject) arguments.get(8), (EObject) arguments.get(9));
			return null;
		case RulesPackage.VIRTUAL_NODE_TO_COMPUTER_RULE___CHECK_TYPES_BWD__MATCH:
			return checkTypes_BWD((Match) arguments.get(0));
		case RulesPackage.VIRTUAL_NODE_TO_COMPUTER_RULE___IS_APPROPRIATE_FWD_NETWORK_SPAN_0__NETWORKSPAN:
			return isAppropriate_FWD_NetworkSpan_0((NetworkSpan) arguments.get(0));
		case RulesPackage.VIRTUAL_NODE_TO_COMPUTER_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_1__EMOFLONEDGE:
			return isAppropriate_BWD_EMoflonEdge_1((EMoflonEdge) arguments.get(0));
		case RulesPackage.VIRTUAL_NODE_TO_COMPUTER_RULE___CHECK_ATTRIBUTES_FWD__TRIPLEMATCH:
			return checkAttributes_FWD((TripleMatch) arguments.get(0));
		case RulesPackage.VIRTUAL_NODE_TO_COMPUTER_RULE___CHECK_ATTRIBUTES_BWD__TRIPLEMATCH:
			return checkAttributes_BWD((TripleMatch) arguments.get(0));
		case RulesPackage.VIRTUAL_NODE_TO_COMPUTER_RULE___IS_APPLICABLE_CC__MATCH_MATCH:
			return isApplicable_CC((Match) arguments.get(0), (Match) arguments.get(1));
		case RulesPackage.VIRTUAL_NODE_TO_COMPUTER_RULE___IS_APPLICABLE_SOLVE_CSP_CC__NETWORKSPAN_CABLE_ROUTER_CONTAINER_COMPUTER_CONTAINER_MATCH_MATCH:
			return isApplicable_solveCsp_CC((NetworkSpan) arguments.get(0), (Cable) arguments.get(1),
					(Router) arguments.get(2), (implementation.Container) arguments.get(3), (Computer) arguments.get(4),
					(Container) arguments.get(5), (Match) arguments.get(6), (Match) arguments.get(7));
		case RulesPackage.VIRTUAL_NODE_TO_COMPUTER_RULE___IS_APPLICABLE_CHECK_CSP_CC__CSP:
			return isApplicable_checkCsp_CC((CSP) arguments.get(0));
		case RulesPackage.VIRTUAL_NODE_TO_COMPUTER_RULE___CHECK_DEC_FWD__NETWORKSPAN_CONTAINER:
			return checkDEC_FWD((NetworkSpan) arguments.get(0), (Container) arguments.get(1));
		case RulesPackage.VIRTUAL_NODE_TO_COMPUTER_RULE___CHECK_DEC_BWD__CABLE_ROUTER_CONTAINER_COMPUTER:
			return checkDEC_BWD((Cable) arguments.get(0), (Router) arguments.get(1),
					(implementation.Container) arguments.get(2), (Computer) arguments.get(3));
		case RulesPackage.VIRTUAL_NODE_TO_COMPUTER_RULE___GENERATE_MODEL__RULEENTRYCONTAINER_VIRTUALNODETOROUTER:
			return generateModel((RuleEntryContainer) arguments.get(0), (VirtualNodeToRouter) arguments.get(1));
		case RulesPackage.VIRTUAL_NODE_TO_COMPUTER_RULE___GENERATE_MODEL_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_NETWORKSPAN_CABLE_ROUTER_CONTAINER_VIRTUALNODETOROUTER_CONTAINER_REQCONTAINERTOIMPLCONTAINER_MODELGENERATORRULERESULT:
			return generateModel_solveCsp_BWD((IsApplicableMatch) arguments.get(0), (NetworkSpan) arguments.get(1),
					(Cable) arguments.get(2), (Router) arguments.get(3), (implementation.Container) arguments.get(4),
					(VirtualNodeToRouter) arguments.get(5), (Container) arguments.get(6),
					(ReqContainerToImplContainer) arguments.get(7), (ModelgeneratorRuleResult) arguments.get(8));
		case RulesPackage.VIRTUAL_NODE_TO_COMPUTER_RULE___GENERATE_MODEL_CHECK_CSP_BWD__CSP:
			return generateModel_checkCsp_BWD((CSP) arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
	}

	public static final Object[] pattern_VirtualNodeToComputerRule_0_1_initialbindings_blackBBBB(
			VirtualNodeToComputerRule _this, Match match, NetworkSpan virtualNode, Container reqContainer) {
		return new Object[] { _this, match, virtualNode, reqContainer };
	}

	public static final Object[] pattern_VirtualNodeToComputerRule_0_2_SolveCSP_bindingFBBBB(
			VirtualNodeToComputerRule _this, Match match, NetworkSpan virtualNode, Container reqContainer) {
		CSP _localVariable_0 = _this.isAppropriate_solveCsp_FWD(match, virtualNode, reqContainer);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, match, virtualNode, reqContainer };
		}
		return null;
	}

	public static final Object[] pattern_VirtualNodeToComputerRule_0_2_SolveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_VirtualNodeToComputerRule_0_2_SolveCSP_bindingAndBlackFBBBB(
			VirtualNodeToComputerRule _this, Match match, NetworkSpan virtualNode, Container reqContainer) {
		Object[] result_pattern_VirtualNodeToComputerRule_0_2_SolveCSP_binding = pattern_VirtualNodeToComputerRule_0_2_SolveCSP_bindingFBBBB(
				_this, match, virtualNode, reqContainer);
		if (result_pattern_VirtualNodeToComputerRule_0_2_SolveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_VirtualNodeToComputerRule_0_2_SolveCSP_binding[0];

			Object[] result_pattern_VirtualNodeToComputerRule_0_2_SolveCSP_black = pattern_VirtualNodeToComputerRule_0_2_SolveCSP_blackB(
					csp);
			if (result_pattern_VirtualNodeToComputerRule_0_2_SolveCSP_black != null) {

				return new Object[] { csp, _this, match, virtualNode, reqContainer };
			}
		}
		return null;
	}

	public static final boolean pattern_VirtualNodeToComputerRule_0_3_CheckCSP_expressionFBB(
			VirtualNodeToComputerRule _this, CSP csp) {
		boolean _localVariable_0 = _this.isAppropriate_checkCsp_FWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_VirtualNodeToComputerRule_0_4_collectelementstobetranslated_blackBBB(
			Match match, NetworkSpan virtualNode, Container reqContainer) {
		return new Object[] { match, virtualNode, reqContainer };
	}

	public static final Object[] pattern_VirtualNodeToComputerRule_0_5_collectcontextelements_blackBBB(Match match,
			NetworkSpan virtualNode, Container reqContainer) {
		return new Object[] { match, virtualNode, reqContainer };
	}

	public static final Object[] pattern_VirtualNodeToComputerRule_0_5_collectcontextelements_greenBBBF(Match match,
			NetworkSpan virtualNode, Container reqContainer) {
		EMoflonEdge reqContainer__virtualNode____networkSpan = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		match.getContextNodes().add(virtualNode);
		match.getContextNodes().add(reqContainer);
		String reqContainer__virtualNode____networkSpan_name_prime = "networkSpan";
		reqContainer__virtualNode____networkSpan.setSrc(reqContainer);
		reqContainer__virtualNode____networkSpan.setTrg(virtualNode);
		match.getContextEdges().add(reqContainer__virtualNode____networkSpan);
		reqContainer__virtualNode____networkSpan.setName(reqContainer__virtualNode____networkSpan_name_prime);
		return new Object[] { match, virtualNode, reqContainer, reqContainer__virtualNode____networkSpan };
	}

	public static final void pattern_VirtualNodeToComputerRule_0_6_registerobjectstomatch_expressionBBBB(
			VirtualNodeToComputerRule _this, Match match, NetworkSpan virtualNode, Container reqContainer) {
		_this.registerObjectsToMatch_FWD(match, virtualNode, reqContainer);

	}

	public static final boolean pattern_VirtualNodeToComputerRule_0_7_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_VirtualNodeToComputerRule_0_8_expressionF() {
		boolean _result = Boolean.valueOf(false);
		return _result;
	}

	public static final Object[] pattern_VirtualNodeToComputerRule_7_1_initialbindings_blackBBBBBB(
			VirtualNodeToComputerRule _this, Match match, Cable cable, Router router,
			implementation.Container implContainer, Computer computer) {
		return new Object[] { _this, match, cable, router, implContainer, computer };
	}

	public static final Object[] pattern_VirtualNodeToComputerRule_7_2_SolveCSP_bindingFBBBBBB(
			VirtualNodeToComputerRule _this, Match match, Cable cable, Router router,
			implementation.Container implContainer, Computer computer) {
		CSP _localVariable_0 = _this.isAppropriate_solveCsp_BWD(match, cable, router, implContainer, computer);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, match, cable, router, implContainer, computer };
		}
		return null;
	}

	public static final Object[] pattern_VirtualNodeToComputerRule_7_2_SolveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_VirtualNodeToComputerRule_7_2_SolveCSP_bindingAndBlackFBBBBBB(
			VirtualNodeToComputerRule _this, Match match, Cable cable, Router router,
			implementation.Container implContainer, Computer computer) {
		Object[] result_pattern_VirtualNodeToComputerRule_7_2_SolveCSP_binding = pattern_VirtualNodeToComputerRule_7_2_SolveCSP_bindingFBBBBBB(
				_this, match, cable, router, implContainer, computer);
		if (result_pattern_VirtualNodeToComputerRule_7_2_SolveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_VirtualNodeToComputerRule_7_2_SolveCSP_binding[0];

			Object[] result_pattern_VirtualNodeToComputerRule_7_2_SolveCSP_black = pattern_VirtualNodeToComputerRule_7_2_SolveCSP_blackB(
					csp);
			if (result_pattern_VirtualNodeToComputerRule_7_2_SolveCSP_black != null) {

				return new Object[] { csp, _this, match, cable, router, implContainer, computer };
			}
		}
		return null;
	}

	public static final boolean pattern_VirtualNodeToComputerRule_7_3_CheckCSP_expressionFBB(
			VirtualNodeToComputerRule _this, CSP csp) {
		boolean _localVariable_0 = _this.isAppropriate_checkCsp_BWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_VirtualNodeToComputerRule_7_4_collectelementstobetranslated_blackBBBBB(
			Match match, Cable cable, Router router, implementation.Container implContainer, Computer computer) {
		return new Object[] { match, cable, router, implContainer, computer };
	}

	public static final Object[] pattern_VirtualNodeToComputerRule_7_4_collectelementstobetranslated_greenBBBBBFFFFF(
			Match match, Cable cable, Router router, implementation.Container implContainer, Computer computer) {
		EMoflonEdge implContainer__computer____devices = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge router__cable____outgoing = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge cable__router____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge computer__cable____incoming = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge cable__computer____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		match.getToBeTranslatedNodes().add(computer);
		String implContainer__computer____devices_name_prime = "devices";
		String router__cable____outgoing_name_prime = "outgoing";
		String cable__router____source_name_prime = "source";
		String computer__cable____incoming_name_prime = "incoming";
		String cable__computer____target_name_prime = "target";
		implContainer__computer____devices.setSrc(implContainer);
		implContainer__computer____devices.setTrg(computer);
		match.getToBeTranslatedEdges().add(implContainer__computer____devices);
		router__cable____outgoing.setSrc(router);
		router__cable____outgoing.setTrg(cable);
		match.getToBeTranslatedEdges().add(router__cable____outgoing);
		cable__router____source.setSrc(cable);
		cable__router____source.setTrg(router);
		match.getToBeTranslatedEdges().add(cable__router____source);
		computer__cable____incoming.setSrc(computer);
		computer__cable____incoming.setTrg(cable);
		match.getToBeTranslatedEdges().add(computer__cable____incoming);
		cable__computer____target.setSrc(cable);
		cable__computer____target.setTrg(computer);
		match.getToBeTranslatedEdges().add(cable__computer____target);
		implContainer__computer____devices.setName(implContainer__computer____devices_name_prime);
		router__cable____outgoing.setName(router__cable____outgoing_name_prime);
		cable__router____source.setName(cable__router____source_name_prime);
		computer__cable____incoming.setName(computer__cable____incoming_name_prime);
		cable__computer____target.setName(cable__computer____target_name_prime);
		return new Object[] { match, cable, router, implContainer, computer, implContainer__computer____devices,
				router__cable____outgoing, cable__router____source, computer__cable____incoming,
				cable__computer____target };
	}

	public static final Object[] pattern_VirtualNodeToComputerRule_7_5_collectcontextelements_blackBBBBB(Match match,
			Cable cable, Router router, implementation.Container implContainer, Computer computer) {
		return new Object[] { match, cable, router, implContainer, computer };
	}

	public static final Object[] pattern_VirtualNodeToComputerRule_7_5_collectcontextelements_greenBBBBFF(Match match,
			Cable cable, Router router, implementation.Container implContainer) {
		EMoflonEdge implContainer__router____devices = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge implContainer__cable____cables = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		match.getContextNodes().add(cable);
		match.getContextNodes().add(router);
		match.getContextNodes().add(implContainer);
		String implContainer__router____devices_name_prime = "devices";
		String implContainer__cable____cables_name_prime = "cables";
		implContainer__router____devices.setSrc(implContainer);
		implContainer__router____devices.setTrg(router);
		match.getContextEdges().add(implContainer__router____devices);
		implContainer__cable____cables.setSrc(implContainer);
		implContainer__cable____cables.setTrg(cable);
		match.getContextEdges().add(implContainer__cable____cables);
		implContainer__router____devices.setName(implContainer__router____devices_name_prime);
		implContainer__cable____cables.setName(implContainer__cable____cables_name_prime);
		return new Object[] { match, cable, router, implContainer, implContainer__router____devices,
				implContainer__cable____cables };
	}

	public static final void pattern_VirtualNodeToComputerRule_7_6_registerobjectstomatch_expressionBBBBBB(
			VirtualNodeToComputerRule _this, Match match, Cable cable, Router router,
			implementation.Container implContainer, Computer computer) {
		_this.registerObjectsToMatch_BWD(match, cable, router, implContainer, computer);

	}

	public static final boolean pattern_VirtualNodeToComputerRule_7_7_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_VirtualNodeToComputerRule_7_8_expressionF() {
		boolean _result = Boolean.valueOf(false);
		return _result;
	}

	public static final Object[] pattern_VirtualNodeToComputerRule_8_1_performtransformation_bindingFFFFFFFFB(
			IsApplicableMatch isApplicableMatch) {
		EObject _localVariable_0 = isApplicableMatch.getObject("virtualNode");
		EObject _localVariable_1 = isApplicableMatch.getObject("cable");
		EObject _localVariable_2 = isApplicableMatch.getObject("router");
		EObject _localVariable_3 = isApplicableMatch.getObject("implContainer");
		EObject _localVariable_4 = isApplicableMatch.getObject("computer");
		EObject _localVariable_5 = isApplicableMatch.getObject("virtualNodeToRouter");
		EObject _localVariable_6 = isApplicableMatch.getObject("reqContainer");
		EObject _localVariable_7 = isApplicableMatch.getObject("reqContainerToImplContainer");
		EObject tmpVirtualNode = _localVariable_0;
		EObject tmpCable = _localVariable_1;
		EObject tmpRouter = _localVariable_2;
		EObject tmpImplContainer = _localVariable_3;
		EObject tmpComputer = _localVariable_4;
		EObject tmpVirtualNodeToRouter = _localVariable_5;
		EObject tmpReqContainer = _localVariable_6;
		EObject tmpReqContainerToImplContainer = _localVariable_7;
		if (tmpVirtualNode instanceof NetworkSpan) {
			NetworkSpan virtualNode = (NetworkSpan) tmpVirtualNode;
			if (tmpCable instanceof Cable) {
				Cable cable = (Cable) tmpCable;
				if (tmpRouter instanceof Router) {
					Router router = (Router) tmpRouter;
					if (tmpImplContainer instanceof implementation.Container) {
						implementation.Container implContainer = (implementation.Container) tmpImplContainer;
						if (tmpComputer instanceof Computer) {
							Computer computer = (Computer) tmpComputer;
							if (tmpVirtualNodeToRouter instanceof VirtualNodeToRouter) {
								VirtualNodeToRouter virtualNodeToRouter = (VirtualNodeToRouter) tmpVirtualNodeToRouter;
								if (tmpReqContainer instanceof Container) {
									Container reqContainer = (Container) tmpReqContainer;
									if (tmpReqContainerToImplContainer instanceof ReqContainerToImplContainer) {
										ReqContainerToImplContainer reqContainerToImplContainer = (ReqContainerToImplContainer) tmpReqContainerToImplContainer;
										return new Object[] { virtualNode, cable, router, implContainer, computer,
												virtualNodeToRouter, reqContainer, reqContainerToImplContainer,
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

	public static final Object[] pattern_VirtualNodeToComputerRule_8_1_performtransformation_blackBBBBBBBBFBB(
			NetworkSpan virtualNode, Cable cable, Router router, implementation.Container implContainer,
			Computer computer, VirtualNodeToRouter virtualNodeToRouter, Container reqContainer,
			ReqContainerToImplContainer reqContainerToImplContainer, VirtualNodeToComputerRule _this,
			IsApplicableMatch isApplicableMatch) {
		for (EObject tmpCsp : isApplicableMatch.getAttributeInfo()) {
			if (tmpCsp instanceof CSP) {
				CSP csp = (CSP) tmpCsp;
				return new Object[] { virtualNode, cable, router, implContainer, computer, virtualNodeToRouter,
						reqContainer, reqContainerToImplContainer, csp, _this, isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_VirtualNodeToComputerRule_8_1_performtransformation_bindingAndBlackFFFFFFFFFBB(
			VirtualNodeToComputerRule _this, IsApplicableMatch isApplicableMatch) {
		Object[] result_pattern_VirtualNodeToComputerRule_8_1_performtransformation_binding = pattern_VirtualNodeToComputerRule_8_1_performtransformation_bindingFFFFFFFFB(
				isApplicableMatch);
		if (result_pattern_VirtualNodeToComputerRule_8_1_performtransformation_binding != null) {
			NetworkSpan virtualNode = (NetworkSpan) result_pattern_VirtualNodeToComputerRule_8_1_performtransformation_binding[0];
			Cable cable = (Cable) result_pattern_VirtualNodeToComputerRule_8_1_performtransformation_binding[1];
			Router router = (Router) result_pattern_VirtualNodeToComputerRule_8_1_performtransformation_binding[2];
			implementation.Container implContainer = (implementation.Container) result_pattern_VirtualNodeToComputerRule_8_1_performtransformation_binding[3];
			Computer computer = (Computer) result_pattern_VirtualNodeToComputerRule_8_1_performtransformation_binding[4];
			VirtualNodeToRouter virtualNodeToRouter = (VirtualNodeToRouter) result_pattern_VirtualNodeToComputerRule_8_1_performtransformation_binding[5];
			Container reqContainer = (Container) result_pattern_VirtualNodeToComputerRule_8_1_performtransformation_binding[6];
			ReqContainerToImplContainer reqContainerToImplContainer = (ReqContainerToImplContainer) result_pattern_VirtualNodeToComputerRule_8_1_performtransformation_binding[7];

			Object[] result_pattern_VirtualNodeToComputerRule_8_1_performtransformation_black = pattern_VirtualNodeToComputerRule_8_1_performtransformation_blackBBBBBBBBFBB(
					virtualNode, cable, router, implContainer, computer, virtualNodeToRouter, reqContainer,
					reqContainerToImplContainer, _this, isApplicableMatch);
			if (result_pattern_VirtualNodeToComputerRule_8_1_performtransformation_black != null) {
				CSP csp = (CSP) result_pattern_VirtualNodeToComputerRule_8_1_performtransformation_black[8];

				return new Object[] { virtualNode, cable, router, implContainer, computer, virtualNodeToRouter,
						reqContainer, reqContainerToImplContainer, csp, _this, isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_VirtualNodeToComputerRule_8_1_performtransformation_greenBFB(
			NetworkSpan virtualNode, Computer computer) {
		VirtualNodeToComputer virtualNodeToComputer = ReqToImpTransformatorFactory.eINSTANCE
				.createVirtualNodeToComputer();
		virtualNodeToComputer.setTarget(computer);
		virtualNodeToComputer.setSource(virtualNode);
		return new Object[] { virtualNode, virtualNodeToComputer, computer };
	}

	public static final Object[] pattern_VirtualNodeToComputerRule_8_2_collecttranslatedelements_blackBB(
			VirtualNodeToComputer virtualNodeToComputer, Computer computer) {
		return new Object[] { virtualNodeToComputer, computer };
	}

	public static final Object[] pattern_VirtualNodeToComputerRule_8_2_collecttranslatedelements_greenFBB(
			VirtualNodeToComputer virtualNodeToComputer, Computer computer) {
		PerformRuleResult ruleresult = RuntimeFactory.eINSTANCE.createPerformRuleResult();
		ruleresult.getCreatedLinkElements().add(virtualNodeToComputer);
		ruleresult.getTranslatedElements().add(computer);
		return new Object[] { ruleresult, virtualNodeToComputer, computer };
	}

	public static final Object[] pattern_VirtualNodeToComputerRule_8_3_bookkeepingforedges_blackBBBBBBBBBB(
			PerformRuleResult ruleresult, EObject virtualNode, EObject cable, EObject router, EObject implContainer,
			EObject virtualNodeToComputer, EObject computer, EObject virtualNodeToRouter, EObject reqContainer,
			EObject reqContainerToImplContainer) {
		if (!virtualNode.equals(virtualNodeToComputer)) {
			if (!virtualNode.equals(virtualNodeToRouter)) {
				if (!cable.equals(virtualNode)) {
					if (!cable.equals(router)) {
						if (!cable.equals(implContainer)) {
							if (!cable.equals(virtualNodeToComputer)) {
								if (!cable.equals(computer)) {
									if (!cable.equals(virtualNodeToRouter)) {
										if (!cable.equals(reqContainer)) {
											if (!cable.equals(reqContainerToImplContainer)) {
												if (!router.equals(virtualNode)) {
													if (!router.equals(virtualNodeToComputer)) {
														if (!router.equals(virtualNodeToRouter)) {
															if (!implContainer.equals(virtualNode)) {
																if (!implContainer.equals(router)) {
																	if (!implContainer.equals(virtualNodeToComputer)) {
																		if (!implContainer
																				.equals(virtualNodeToRouter)) {
																			if (!implContainer.equals(reqContainer)) {
																				if (!implContainer.equals(
																						reqContainerToImplContainer)) {
																					if (!virtualNodeToComputer.equals(
																							virtualNodeToRouter)) {
																						if (!computer
																								.equals(virtualNode)) {
																							if (!computer
																									.equals(router)) {
																								if (!computer.equals(
																										implContainer)) {
																									if (!computer
																											.equals(virtualNodeToComputer)) {
																										if (!computer
																												.equals(virtualNodeToRouter)) {
																											if (!computer
																													.equals(reqContainer)) {
																												if (!computer
																														.equals(reqContainerToImplContainer)) {
																													if (!reqContainer
																															.equals(virtualNode)) {
																														if (!reqContainer
																																.equals(router)) {
																															if (!reqContainer
																																	.equals(virtualNodeToComputer)) {
																																if (!reqContainer
																																		.equals(virtualNodeToRouter)) {
																																	if (!reqContainer
																																			.equals(reqContainerToImplContainer)) {
																																		if (!reqContainerToImplContainer
																																				.equals(virtualNode)) {
																																			if (!reqContainerToImplContainer
																																					.equals(router)) {
																																				if (!reqContainerToImplContainer
																																						.equals(virtualNodeToComputer)) {
																																					if (!reqContainerToImplContainer
																																							.equals(virtualNodeToRouter)) {
																																						return new Object[] {
																																								ruleresult,
																																								virtualNode,
																																								cable,
																																								router,
																																								implContainer,
																																								virtualNodeToComputer,
																																								computer,
																																								virtualNodeToRouter,
																																								reqContainer,
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

	public static final Object[] pattern_VirtualNodeToComputerRule_8_3_bookkeepingforedges_greenBBBBBBBFFFFFFF(
			PerformRuleResult ruleresult, EObject virtualNode, EObject cable, EObject router, EObject implContainer,
			EObject virtualNodeToComputer, EObject computer) {
		EMoflonEdge virtualNodeToComputer__computer____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge implContainer__computer____devices = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge router__cable____outgoing = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge cable__router____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge computer__cable____incoming = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge cable__computer____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge virtualNodeToComputer__virtualNode____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String ruleresult_ruleName_prime = "VirtualNodeToComputerRule";
		String virtualNodeToComputer__computer____target_name_prime = "target";
		String implContainer__computer____devices_name_prime = "devices";
		String router__cable____outgoing_name_prime = "outgoing";
		String cable__router____source_name_prime = "source";
		String computer__cable____incoming_name_prime = "incoming";
		String cable__computer____target_name_prime = "target";
		String virtualNodeToComputer__virtualNode____source_name_prime = "source";
		virtualNodeToComputer__computer____target.setSrc(virtualNodeToComputer);
		virtualNodeToComputer__computer____target.setTrg(computer);
		ruleresult.getCreatedEdges().add(virtualNodeToComputer__computer____target);
		implContainer__computer____devices.setSrc(implContainer);
		implContainer__computer____devices.setTrg(computer);
		ruleresult.getTranslatedEdges().add(implContainer__computer____devices);
		router__cable____outgoing.setSrc(router);
		router__cable____outgoing.setTrg(cable);
		ruleresult.getTranslatedEdges().add(router__cable____outgoing);
		cable__router____source.setSrc(cable);
		cable__router____source.setTrg(router);
		ruleresult.getTranslatedEdges().add(cable__router____source);
		computer__cable____incoming.setSrc(computer);
		computer__cable____incoming.setTrg(cable);
		ruleresult.getTranslatedEdges().add(computer__cable____incoming);
		cable__computer____target.setSrc(cable);
		cable__computer____target.setTrg(computer);
		ruleresult.getTranslatedEdges().add(cable__computer____target);
		virtualNodeToComputer__virtualNode____source.setSrc(virtualNodeToComputer);
		virtualNodeToComputer__virtualNode____source.setTrg(virtualNode);
		ruleresult.getCreatedEdges().add(virtualNodeToComputer__virtualNode____source);
		ruleresult.setRuleName(ruleresult_ruleName_prime);
		virtualNodeToComputer__computer____target.setName(virtualNodeToComputer__computer____target_name_prime);
		implContainer__computer____devices.setName(implContainer__computer____devices_name_prime);
		router__cable____outgoing.setName(router__cable____outgoing_name_prime);
		cable__router____source.setName(cable__router____source_name_prime);
		computer__cable____incoming.setName(computer__cable____incoming_name_prime);
		cable__computer____target.setName(cable__computer____target_name_prime);
		virtualNodeToComputer__virtualNode____source.setName(virtualNodeToComputer__virtualNode____source_name_prime);
		return new Object[] { ruleresult, virtualNode, cable, router, implContainer, virtualNodeToComputer, computer,
				virtualNodeToComputer__computer____target, implContainer__computer____devices,
				router__cable____outgoing, cable__router____source, computer__cable____incoming,
				cable__computer____target, virtualNodeToComputer__virtualNode____source };
	}

	public static final void pattern_VirtualNodeToComputerRule_8_5_registerobjects_expressionBBBBBBBBBBB(
			VirtualNodeToComputerRule _this, PerformRuleResult ruleresult, EObject virtualNode, EObject cable,
			EObject router, EObject implContainer, EObject virtualNodeToComputer, EObject computer,
			EObject virtualNodeToRouter, EObject reqContainer, EObject reqContainerToImplContainer) {
		_this.registerObjects_BWD(ruleresult, virtualNode, cable, router, implContainer, virtualNodeToComputer,
				computer, virtualNodeToRouter, reqContainer, reqContainerToImplContainer);

	}

	public static final PerformRuleResult pattern_VirtualNodeToComputerRule_8_6_expressionFB(
			PerformRuleResult ruleresult) {
		PerformRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_VirtualNodeToComputerRule_9_1_preparereturnvalue_bindingFB(
			VirtualNodeToComputerRule _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass eClass = _localVariable_0;
		if (eClass != null) {
			return new Object[] { eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_VirtualNodeToComputerRule_9_1_preparereturnvalue_blackFBB(EClass eClass,
			VirtualNodeToComputerRule _this) {
		for (EOperation performOperation : eClass.getEOperations()) {
			String performOperation_name = performOperation.getName();
			if (performOperation_name.equals("perform_BWD")) {
				return new Object[] { performOperation, eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_VirtualNodeToComputerRule_9_1_preparereturnvalue_bindingAndBlackFFB(
			VirtualNodeToComputerRule _this) {
		Object[] result_pattern_VirtualNodeToComputerRule_9_1_preparereturnvalue_binding = pattern_VirtualNodeToComputerRule_9_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_VirtualNodeToComputerRule_9_1_preparereturnvalue_binding != null) {
			EClass eClass = (EClass) result_pattern_VirtualNodeToComputerRule_9_1_preparereturnvalue_binding[0];

			Object[] result_pattern_VirtualNodeToComputerRule_9_1_preparereturnvalue_black = pattern_VirtualNodeToComputerRule_9_1_preparereturnvalue_blackFBB(
					eClass, _this);
			if (result_pattern_VirtualNodeToComputerRule_9_1_preparereturnvalue_black != null) {
				EOperation performOperation = (EOperation) result_pattern_VirtualNodeToComputerRule_9_1_preparereturnvalue_black[0];

				return new Object[] { performOperation, eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_VirtualNodeToComputerRule_9_1_preparereturnvalue_greenBF(
			EOperation performOperation) {
		IsApplicableRuleResult ruleresult = RuntimeFactory.eINSTANCE.createIsApplicableRuleResult();
		boolean ruleresult_success_prime = Boolean.valueOf(false);
		String ruleresult_rule_prime = "VirtualNodeToComputerRule";
		ruleresult.setPerformOperation(performOperation);
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		ruleresult.setRule(ruleresult_rule_prime);
		return new Object[] { performOperation, ruleresult };
	}

	public static final Object[] pattern_VirtualNodeToComputerRule_9_2_corematch_bindingFFFFB(Match match) {
		EObject _localVariable_0 = match.getObject("cable");
		EObject _localVariable_1 = match.getObject("router");
		EObject _localVariable_2 = match.getObject("implContainer");
		EObject _localVariable_3 = match.getObject("computer");
		EObject tmpCable = _localVariable_0;
		EObject tmpRouter = _localVariable_1;
		EObject tmpImplContainer = _localVariable_2;
		EObject tmpComputer = _localVariable_3;
		if (tmpCable instanceof Cable) {
			Cable cable = (Cable) tmpCable;
			if (tmpRouter instanceof Router) {
				Router router = (Router) tmpRouter;
				if (tmpImplContainer instanceof implementation.Container) {
					implementation.Container implContainer = (implementation.Container) tmpImplContainer;
					if (tmpComputer instanceof Computer) {
						Computer computer = (Computer) tmpComputer;
						return new Object[] { cable, router, implContainer, computer, match };
					}
				}
			}
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_VirtualNodeToComputerRule_9_2_corematch_blackFBBBBFFFB(Cable cable,
			Router router, implementation.Container implContainer, Computer computer, Match match) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		for (VirtualNodeToRouter virtualNodeToRouter : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(router, VirtualNodeToRouter.class, "target")) {
			NetworkSpan virtualNode = virtualNodeToRouter.getSource();
			if (virtualNode != null) {
				for (ReqContainerToImplContainer reqContainerToImplContainer : org.moflon.core.utilities.eMoflonEMFUtil
						.getOppositeReferenceTyped(implContainer, ReqContainerToImplContainer.class, "target")) {
					Container reqContainer = reqContainerToImplContainer.getSource();
					if (reqContainer != null) {
						_result.add(new Object[] { virtualNode, cable, router, implContainer, computer,
								virtualNodeToRouter, reqContainer, reqContainerToImplContainer, match });
					}

				}
			}

		}
		return _result;
	}

	public static final Iterable<Object[]> pattern_VirtualNodeToComputerRule_9_3_findcontext_blackBBBBBBBB(
			NetworkSpan virtualNode, Cable cable, Router router, implementation.Container implContainer,
			Computer computer, VirtualNodeToRouter virtualNodeToRouter, Container reqContainer,
			ReqContainerToImplContainer reqContainerToImplContainer) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (implContainer.getDevices().contains(router)) {
			if (implContainer.getCables().contains(cable)) {
				if (implContainer.getDevices().contains(computer)) {
					if (router.getOutgoing().contains(cable)) {
						if (computer.getIncoming().contains(cable)) {
							if (router.equals(virtualNodeToRouter.getTarget())) {
								if (virtualNode.equals(virtualNodeToRouter.getSource())) {
									if (implContainer.equals(reqContainerToImplContainer.getTarget())) {
										if (reqContainer.equals(reqContainerToImplContainer.getSource())) {
											if (virtualNode.equals(reqContainer.getNetworkSpan())) {
												_result.add(new Object[] { virtualNode, cable, router, implContainer,
														computer, virtualNodeToRouter, reqContainer,
														reqContainerToImplContainer });
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

	public static final Object[] pattern_VirtualNodeToComputerRule_9_3_findcontext_greenBBBBBBBBFFFFFFFFFFFFF(
			NetworkSpan virtualNode, Cable cable, Router router, implementation.Container implContainer,
			Computer computer, VirtualNodeToRouter virtualNodeToRouter, Container reqContainer,
			ReqContainerToImplContainer reqContainerToImplContainer) {
		IsApplicableMatch isApplicableMatch = RuntimeFactory.eINSTANCE.createIsApplicableMatch();
		EMoflonEdge implContainer__router____devices = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge implContainer__cable____cables = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge implContainer__computer____devices = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge router__cable____outgoing = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge cable__router____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge computer__cable____incoming = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge cable__computer____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge virtualNodeToRouter__router____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge virtualNodeToRouter__virtualNode____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge reqContainerToImplContainer__implContainer____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge reqContainerToImplContainer__reqContainer____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge reqContainer__virtualNode____networkSpan = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String implContainer__router____devices_name_prime = "devices";
		String implContainer__cable____cables_name_prime = "cables";
		String implContainer__computer____devices_name_prime = "devices";
		String router__cable____outgoing_name_prime = "outgoing";
		String cable__router____source_name_prime = "source";
		String computer__cable____incoming_name_prime = "incoming";
		String cable__computer____target_name_prime = "target";
		String virtualNodeToRouter__router____target_name_prime = "target";
		String virtualNodeToRouter__virtualNode____source_name_prime = "source";
		String reqContainerToImplContainer__implContainer____target_name_prime = "target";
		String reqContainerToImplContainer__reqContainer____source_name_prime = "source";
		String reqContainer__virtualNode____networkSpan_name_prime = "networkSpan";
		isApplicableMatch.getAllContextElements().add(virtualNode);
		isApplicableMatch.getAllContextElements().add(cable);
		isApplicableMatch.getAllContextElements().add(router);
		isApplicableMatch.getAllContextElements().add(implContainer);
		isApplicableMatch.getAllContextElements().add(computer);
		isApplicableMatch.getAllContextElements().add(virtualNodeToRouter);
		isApplicableMatch.getAllContextElements().add(reqContainer);
		isApplicableMatch.getAllContextElements().add(reqContainerToImplContainer);
		implContainer__router____devices.setSrc(implContainer);
		implContainer__router____devices.setTrg(router);
		isApplicableMatch.getAllContextElements().add(implContainer__router____devices);
		implContainer__cable____cables.setSrc(implContainer);
		implContainer__cable____cables.setTrg(cable);
		isApplicableMatch.getAllContextElements().add(implContainer__cable____cables);
		implContainer__computer____devices.setSrc(implContainer);
		implContainer__computer____devices.setTrg(computer);
		isApplicableMatch.getAllContextElements().add(implContainer__computer____devices);
		router__cable____outgoing.setSrc(router);
		router__cable____outgoing.setTrg(cable);
		isApplicableMatch.getAllContextElements().add(router__cable____outgoing);
		cable__router____source.setSrc(cable);
		cable__router____source.setTrg(router);
		isApplicableMatch.getAllContextElements().add(cable__router____source);
		computer__cable____incoming.setSrc(computer);
		computer__cable____incoming.setTrg(cable);
		isApplicableMatch.getAllContextElements().add(computer__cable____incoming);
		cable__computer____target.setSrc(cable);
		cable__computer____target.setTrg(computer);
		isApplicableMatch.getAllContextElements().add(cable__computer____target);
		virtualNodeToRouter__router____target.setSrc(virtualNodeToRouter);
		virtualNodeToRouter__router____target.setTrg(router);
		isApplicableMatch.getAllContextElements().add(virtualNodeToRouter__router____target);
		virtualNodeToRouter__virtualNode____source.setSrc(virtualNodeToRouter);
		virtualNodeToRouter__virtualNode____source.setTrg(virtualNode);
		isApplicableMatch.getAllContextElements().add(virtualNodeToRouter__virtualNode____source);
		reqContainerToImplContainer__implContainer____target.setSrc(reqContainerToImplContainer);
		reqContainerToImplContainer__implContainer____target.setTrg(implContainer);
		isApplicableMatch.getAllContextElements().add(reqContainerToImplContainer__implContainer____target);
		reqContainerToImplContainer__reqContainer____source.setSrc(reqContainerToImplContainer);
		reqContainerToImplContainer__reqContainer____source.setTrg(reqContainer);
		isApplicableMatch.getAllContextElements().add(reqContainerToImplContainer__reqContainer____source);
		reqContainer__virtualNode____networkSpan.setSrc(reqContainer);
		reqContainer__virtualNode____networkSpan.setTrg(virtualNode);
		isApplicableMatch.getAllContextElements().add(reqContainer__virtualNode____networkSpan);
		implContainer__router____devices.setName(implContainer__router____devices_name_prime);
		implContainer__cable____cables.setName(implContainer__cable____cables_name_prime);
		implContainer__computer____devices.setName(implContainer__computer____devices_name_prime);
		router__cable____outgoing.setName(router__cable____outgoing_name_prime);
		cable__router____source.setName(cable__router____source_name_prime);
		computer__cable____incoming.setName(computer__cable____incoming_name_prime);
		cable__computer____target.setName(cable__computer____target_name_prime);
		virtualNodeToRouter__router____target.setName(virtualNodeToRouter__router____target_name_prime);
		virtualNodeToRouter__virtualNode____source.setName(virtualNodeToRouter__virtualNode____source_name_prime);
		reqContainerToImplContainer__implContainer____target
				.setName(reqContainerToImplContainer__implContainer____target_name_prime);
		reqContainerToImplContainer__reqContainer____source
				.setName(reqContainerToImplContainer__reqContainer____source_name_prime);
		reqContainer__virtualNode____networkSpan.setName(reqContainer__virtualNode____networkSpan_name_prime);
		return new Object[] { virtualNode, cable, router, implContainer, computer, virtualNodeToRouter, reqContainer,
				reqContainerToImplContainer, isApplicableMatch, implContainer__router____devices,
				implContainer__cable____cables, implContainer__computer____devices, router__cable____outgoing,
				cable__router____source, computer__cable____incoming, cable__computer____target,
				virtualNodeToRouter__router____target, virtualNodeToRouter__virtualNode____source,
				reqContainerToImplContainer__implContainer____target,
				reqContainerToImplContainer__reqContainer____source, reqContainer__virtualNode____networkSpan };
	}

	public static final Object[] pattern_VirtualNodeToComputerRule_9_4_solveCSP_bindingFBBBBBBBBBB(
			VirtualNodeToComputerRule _this, IsApplicableMatch isApplicableMatch, NetworkSpan virtualNode, Cable cable,
			Router router, implementation.Container implContainer, Computer computer,
			VirtualNodeToRouter virtualNodeToRouter, Container reqContainer,
			ReqContainerToImplContainer reqContainerToImplContainer) {
		CSP _localVariable_0 = _this.isApplicable_solveCsp_BWD(isApplicableMatch, virtualNode, cable, router,
				implContainer, computer, virtualNodeToRouter, reqContainer, reqContainerToImplContainer);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, virtualNode, cable, router, implContainer, computer,
					virtualNodeToRouter, reqContainer, reqContainerToImplContainer };
		}
		return null;
	}

	public static final Object[] pattern_VirtualNodeToComputerRule_9_4_solveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_VirtualNodeToComputerRule_9_4_solveCSP_bindingAndBlackFBBBBBBBBBB(
			VirtualNodeToComputerRule _this, IsApplicableMatch isApplicableMatch, NetworkSpan virtualNode, Cable cable,
			Router router, implementation.Container implContainer, Computer computer,
			VirtualNodeToRouter virtualNodeToRouter, Container reqContainer,
			ReqContainerToImplContainer reqContainerToImplContainer) {
		Object[] result_pattern_VirtualNodeToComputerRule_9_4_solveCSP_binding = pattern_VirtualNodeToComputerRule_9_4_solveCSP_bindingFBBBBBBBBBB(
				_this, isApplicableMatch, virtualNode, cable, router, implContainer, computer, virtualNodeToRouter,
				reqContainer, reqContainerToImplContainer);
		if (result_pattern_VirtualNodeToComputerRule_9_4_solveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_VirtualNodeToComputerRule_9_4_solveCSP_binding[0];

			Object[] result_pattern_VirtualNodeToComputerRule_9_4_solveCSP_black = pattern_VirtualNodeToComputerRule_9_4_solveCSP_blackB(
					csp);
			if (result_pattern_VirtualNodeToComputerRule_9_4_solveCSP_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, virtualNode, cable, router, implContainer,
						computer, virtualNodeToRouter, reqContainer, reqContainerToImplContainer };
			}
		}
		return null;
	}

	public static final boolean pattern_VirtualNodeToComputerRule_9_5_checkCSP_expressionFBB(
			VirtualNodeToComputerRule _this, CSP csp) {
		boolean _localVariable_0 = _this.isApplicable_checkCsp_BWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_VirtualNodeToComputerRule_9_6_addmatchtoruleresult_blackBB(
			IsApplicableRuleResult ruleresult, IsApplicableMatch isApplicableMatch) {
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final Object[] pattern_VirtualNodeToComputerRule_9_6_addmatchtoruleresult_greenBB(
			IsApplicableRuleResult ruleresult, IsApplicableMatch isApplicableMatch) {
		ruleresult.getIsApplicableMatch().add(isApplicableMatch);
		boolean ruleresult_success_prime = Boolean.valueOf(true);
		String isApplicableMatch_ruleName_prime = "VirtualNodeToComputerRule";
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		isApplicableMatch.setRuleName(isApplicableMatch_ruleName_prime);
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final IsApplicableRuleResult pattern_VirtualNodeToComputerRule_9_7_expressionFB(
			IsApplicableRuleResult ruleresult) {
		IsApplicableRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_VirtualNodeToComputerRule_17_1_preparereturnvalue_bindingFB(
			VirtualNodeToComputerRule _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_VirtualNodeToComputerRule_17_1_preparereturnvalue_blackFBBF(EClass __eClass,
			VirtualNodeToComputerRule _this) {
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

	public static final Object[] pattern_VirtualNodeToComputerRule_17_1_preparereturnvalue_bindingAndBlackFFBF(
			VirtualNodeToComputerRule _this) {
		Object[] result_pattern_VirtualNodeToComputerRule_17_1_preparereturnvalue_binding = pattern_VirtualNodeToComputerRule_17_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_VirtualNodeToComputerRule_17_1_preparereturnvalue_binding != null) {
			EClass __eClass = (EClass) result_pattern_VirtualNodeToComputerRule_17_1_preparereturnvalue_binding[0];

			Object[] result_pattern_VirtualNodeToComputerRule_17_1_preparereturnvalue_black = pattern_VirtualNodeToComputerRule_17_1_preparereturnvalue_blackFBBF(
					__eClass, _this);
			if (result_pattern_VirtualNodeToComputerRule_17_1_preparereturnvalue_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_VirtualNodeToComputerRule_17_1_preparereturnvalue_black[0];
				EOperation isApplicableCC = (EOperation) result_pattern_VirtualNodeToComputerRule_17_1_preparereturnvalue_black[3];

				return new Object[] { __performOperation, __eClass, _this, isApplicableCC };
			}
		}
		return null;
	}

	public static final Object[] pattern_VirtualNodeToComputerRule_17_1_preparereturnvalue_greenF() {
		EObjectContainer __result = RuntimeFactory.eINSTANCE.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Iterable<Object[]> pattern_VirtualNodeToComputerRule_17_2_testcorematchandDECs_blackBF(
			NetworkSpan virtualNode) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		for (Container reqContainer : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(virtualNode,
				Container.class, "networkSpan")) {
			_result.add(new Object[] { virtualNode, reqContainer });
		}
		return _result;
	}

	public static final Object[] pattern_VirtualNodeToComputerRule_17_2_testcorematchandDECs_greenFB(EClass __eClass) {
		Match match = RuntimeFactory.eINSTANCE.createMatch();
		String __eClass_name = __eClass.getName();
		String match_ruleName_prime = __eClass_name;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_VirtualNodeToComputerRule_17_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBB(
			VirtualNodeToComputerRule _this, Match match, NetworkSpan virtualNode, Container reqContainer) {
		boolean _localVariable_0 = _this.isAppropriate_FWD(match, virtualNode, reqContainer);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_VirtualNodeToComputerRule_17_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(
			VirtualNodeToComputerRule _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_FWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_VirtualNodeToComputerRule_17_5_Addmatchtoruleresult_blackBBBB(Match match,
			EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		if (!__performOperation.equals(isApplicableCC)) {
			return new Object[] { match, __performOperation, __result, isApplicableCC };
		}
		return null;
	}

	public static final Object[] pattern_VirtualNodeToComputerRule_17_5_Addmatchtoruleresult_greenBBBB(Match match,
			EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		match.setIsApplicableCCOperation(isApplicableCC);
		return new Object[] { match, __performOperation, __result, isApplicableCC };
	}

	public static final EObjectContainer pattern_VirtualNodeToComputerRule_17_6_expressionFB(
			EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_VirtualNodeToComputerRule_18_1_preparereturnvalue_bindingFB(
			VirtualNodeToComputerRule _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_VirtualNodeToComputerRule_18_1_preparereturnvalue_blackFBBF(EClass __eClass,
			VirtualNodeToComputerRule _this) {
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

	public static final Object[] pattern_VirtualNodeToComputerRule_18_1_preparereturnvalue_bindingAndBlackFFBF(
			VirtualNodeToComputerRule _this) {
		Object[] result_pattern_VirtualNodeToComputerRule_18_1_preparereturnvalue_binding = pattern_VirtualNodeToComputerRule_18_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_VirtualNodeToComputerRule_18_1_preparereturnvalue_binding != null) {
			EClass __eClass = (EClass) result_pattern_VirtualNodeToComputerRule_18_1_preparereturnvalue_binding[0];

			Object[] result_pattern_VirtualNodeToComputerRule_18_1_preparereturnvalue_black = pattern_VirtualNodeToComputerRule_18_1_preparereturnvalue_blackFBBF(
					__eClass, _this);
			if (result_pattern_VirtualNodeToComputerRule_18_1_preparereturnvalue_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_VirtualNodeToComputerRule_18_1_preparereturnvalue_black[0];
				EOperation isApplicableCC = (EOperation) result_pattern_VirtualNodeToComputerRule_18_1_preparereturnvalue_black[3];

				return new Object[] { __performOperation, __eClass, _this, isApplicableCC };
			}
		}
		return null;
	}

	public static final Object[] pattern_VirtualNodeToComputerRule_18_1_preparereturnvalue_greenF() {
		EObjectContainer __result = RuntimeFactory.eINSTANCE.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Iterable<Object[]> pattern_VirtualNodeToComputerRule_18_2_testcorematchandDECs_blackFFFFB(
			EMoflonEdge _edge_devices) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		EObject tmpImplContainer = _edge_devices.getSrc();
		if (tmpImplContainer instanceof implementation.Container) {
			implementation.Container implContainer = (implementation.Container) tmpImplContainer;
			EObject tmpComputer = _edge_devices.getTrg();
			if (tmpComputer instanceof Computer) {
				Computer computer = (Computer) tmpComputer;
				if (implContainer.getDevices().contains(computer)) {
					for (Device tmpRouter : implContainer.getDevices()) {
						if (tmpRouter instanceof Router) {
							Router router = (Router) tmpRouter;
							for (Cable cable : implContainer.getCables()) {
								if (router.getOutgoing().contains(cable)) {
									if (computer.getIncoming().contains(cable)) {
										_result.add(
												new Object[] { cable, router, implContainer, computer, _edge_devices });
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

	public static final Object[] pattern_VirtualNodeToComputerRule_18_2_testcorematchandDECs_greenFB(EClass __eClass) {
		Match match = RuntimeFactory.eINSTANCE.createMatch();
		String __eClass_name = __eClass.getName();
		String match_ruleName_prime = __eClass_name;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_VirtualNodeToComputerRule_18_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBBBB(
			VirtualNodeToComputerRule _this, Match match, Cable cable, Router router,
			implementation.Container implContainer, Computer computer) {
		boolean _localVariable_0 = _this.isAppropriate_BWD(match, cable, router, implContainer, computer);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_VirtualNodeToComputerRule_18_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(
			VirtualNodeToComputerRule _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_BWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_VirtualNodeToComputerRule_18_5_Addmatchtoruleresult_blackBBBB(Match match,
			EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		if (!__performOperation.equals(isApplicableCC)) {
			return new Object[] { match, __performOperation, __result, isApplicableCC };
		}
		return null;
	}

	public static final Object[] pattern_VirtualNodeToComputerRule_18_5_Addmatchtoruleresult_greenBBBB(Match match,
			EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		match.setIsApplicableCCOperation(isApplicableCC);
		return new Object[] { match, __performOperation, __result, isApplicableCC };
	}

	public static final EObjectContainer pattern_VirtualNodeToComputerRule_18_6_expressionFB(
			EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_VirtualNodeToComputerRule_21_1_prepare_blackB(
			VirtualNodeToComputerRule _this) {
		return new Object[] { _this };
	}

	public static final Object[] pattern_VirtualNodeToComputerRule_21_1_prepare_greenF() {
		IsApplicableRuleResult result = RuntimeFactory.eINSTANCE.createIsApplicableRuleResult();
		return new Object[] { result };
	}

	public static final Object[] pattern_VirtualNodeToComputerRule_21_2_matchsrctrgcontext_bindingFFFFFFBB(
			Match sourceMatch, Match targetMatch) {
		EObject _localVariable_0 = sourceMatch.getObject("virtualNode");
		EObject _localVariable_1 = targetMatch.getObject("cable");
		EObject _localVariable_2 = targetMatch.getObject("router");
		EObject _localVariable_3 = targetMatch.getObject("implContainer");
		EObject _localVariable_4 = targetMatch.getObject("computer");
		EObject _localVariable_5 = sourceMatch.getObject("reqContainer");
		EObject tmpVirtualNode = _localVariable_0;
		EObject tmpCable = _localVariable_1;
		EObject tmpRouter = _localVariable_2;
		EObject tmpImplContainer = _localVariable_3;
		EObject tmpComputer = _localVariable_4;
		EObject tmpReqContainer = _localVariable_5;
		if (tmpVirtualNode instanceof NetworkSpan) {
			NetworkSpan virtualNode = (NetworkSpan) tmpVirtualNode;
			if (tmpCable instanceof Cable) {
				Cable cable = (Cable) tmpCable;
				if (tmpRouter instanceof Router) {
					Router router = (Router) tmpRouter;
					if (tmpImplContainer instanceof implementation.Container) {
						implementation.Container implContainer = (implementation.Container) tmpImplContainer;
						if (tmpComputer instanceof Computer) {
							Computer computer = (Computer) tmpComputer;
							if (tmpReqContainer instanceof Container) {
								Container reqContainer = (Container) tmpReqContainer;
								return new Object[] { virtualNode, cable, router, implContainer, computer, reqContainer,
										sourceMatch, targetMatch };
							}
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_VirtualNodeToComputerRule_21_2_matchsrctrgcontext_blackBBBBBBBB(
			NetworkSpan virtualNode, Cable cable, Router router, implementation.Container implContainer,
			Computer computer, Container reqContainer, Match sourceMatch, Match targetMatch) {
		if (!sourceMatch.equals(targetMatch)) {
			return new Object[] { virtualNode, cable, router, implContainer, computer, reqContainer, sourceMatch,
					targetMatch };
		}
		return null;
	}

	public static final Object[] pattern_VirtualNodeToComputerRule_21_2_matchsrctrgcontext_bindingAndBlackFFFFFFBB(
			Match sourceMatch, Match targetMatch) {
		Object[] result_pattern_VirtualNodeToComputerRule_21_2_matchsrctrgcontext_binding = pattern_VirtualNodeToComputerRule_21_2_matchsrctrgcontext_bindingFFFFFFBB(
				sourceMatch, targetMatch);
		if (result_pattern_VirtualNodeToComputerRule_21_2_matchsrctrgcontext_binding != null) {
			NetworkSpan virtualNode = (NetworkSpan) result_pattern_VirtualNodeToComputerRule_21_2_matchsrctrgcontext_binding[0];
			Cable cable = (Cable) result_pattern_VirtualNodeToComputerRule_21_2_matchsrctrgcontext_binding[1];
			Router router = (Router) result_pattern_VirtualNodeToComputerRule_21_2_matchsrctrgcontext_binding[2];
			implementation.Container implContainer = (implementation.Container) result_pattern_VirtualNodeToComputerRule_21_2_matchsrctrgcontext_binding[3];
			Computer computer = (Computer) result_pattern_VirtualNodeToComputerRule_21_2_matchsrctrgcontext_binding[4];
			Container reqContainer = (Container) result_pattern_VirtualNodeToComputerRule_21_2_matchsrctrgcontext_binding[5];

			Object[] result_pattern_VirtualNodeToComputerRule_21_2_matchsrctrgcontext_black = pattern_VirtualNodeToComputerRule_21_2_matchsrctrgcontext_blackBBBBBBBB(
					virtualNode, cable, router, implContainer, computer, reqContainer, sourceMatch, targetMatch);
			if (result_pattern_VirtualNodeToComputerRule_21_2_matchsrctrgcontext_black != null) {

				return new Object[] { virtualNode, cable, router, implContainer, computer, reqContainer, sourceMatch,
						targetMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_VirtualNodeToComputerRule_21_3_solvecsp_bindingFBBBBBBBBB(
			VirtualNodeToComputerRule _this, NetworkSpan virtualNode, Cable cable, Router router,
			implementation.Container implContainer, Computer computer, Container reqContainer, Match sourceMatch,
			Match targetMatch) {
		CSP _localVariable_6 = _this.isApplicable_solveCsp_CC(virtualNode, cable, router, implContainer, computer,
				reqContainer, sourceMatch, targetMatch);
		CSP csp = _localVariable_6;
		if (csp != null) {
			return new Object[] { csp, _this, virtualNode, cable, router, implContainer, computer, reqContainer,
					sourceMatch, targetMatch };
		}
		return null;
	}

	public static final Object[] pattern_VirtualNodeToComputerRule_21_3_solvecsp_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_VirtualNodeToComputerRule_21_3_solvecsp_bindingAndBlackFBBBBBBBBB(
			VirtualNodeToComputerRule _this, NetworkSpan virtualNode, Cable cable, Router router,
			implementation.Container implContainer, Computer computer, Container reqContainer, Match sourceMatch,
			Match targetMatch) {
		Object[] result_pattern_VirtualNodeToComputerRule_21_3_solvecsp_binding = pattern_VirtualNodeToComputerRule_21_3_solvecsp_bindingFBBBBBBBBB(
				_this, virtualNode, cable, router, implContainer, computer, reqContainer, sourceMatch, targetMatch);
		if (result_pattern_VirtualNodeToComputerRule_21_3_solvecsp_binding != null) {
			CSP csp = (CSP) result_pattern_VirtualNodeToComputerRule_21_3_solvecsp_binding[0];

			Object[] result_pattern_VirtualNodeToComputerRule_21_3_solvecsp_black = pattern_VirtualNodeToComputerRule_21_3_solvecsp_blackB(
					csp);
			if (result_pattern_VirtualNodeToComputerRule_21_3_solvecsp_black != null) {

				return new Object[] { csp, _this, virtualNode, cable, router, implContainer, computer, reqContainer,
						sourceMatch, targetMatch };
			}
		}
		return null;
	}

	public static final boolean pattern_VirtualNodeToComputerRule_21_4_checkCSP_expressionFB(CSP csp) {
		boolean _localVariable_0 = csp.check();
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Iterable<Object[]> pattern_VirtualNodeToComputerRule_21_5_matchcorrcontext_blackBBBFBFBB(
			NetworkSpan virtualNode, Router router, implementation.Container implContainer, Container reqContainer,
			Match sourceMatch, Match targetMatch) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (!sourceMatch.equals(targetMatch)) {
			for (VirtualNodeToRouter virtualNodeToRouter : org.moflon.core.utilities.eMoflonEMFUtil
					.getOppositeReferenceTyped(router, VirtualNodeToRouter.class, "target")) {
				if (virtualNode.equals(virtualNodeToRouter.getSource())) {
					for (ReqContainerToImplContainer reqContainerToImplContainer : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(implContainer, ReqContainerToImplContainer.class, "target")) {
						if (reqContainer.equals(reqContainerToImplContainer.getSource())) {
							_result.add(new Object[] { virtualNode, router, implContainer, virtualNodeToRouter,
									reqContainer, reqContainerToImplContainer, sourceMatch, targetMatch });
						}
					}
				}
			}
		}
		return _result;
	}

	public static final Object[] pattern_VirtualNodeToComputerRule_21_5_matchcorrcontext_greenBBBBF(
			VirtualNodeToRouter virtualNodeToRouter, ReqContainerToImplContainer reqContainerToImplContainer,
			Match sourceMatch, Match targetMatch) {
		CCMatch ccMatch = RuntimeFactory.eINSTANCE.createCCMatch();
		String ccMatch_ruleName_prime = "VirtualNodeToComputerRule";
		ccMatch.setSourceMatch(sourceMatch);
		ccMatch.setTargetMatch(targetMatch);
		ccMatch.getAllContextElements().add(virtualNodeToRouter);
		ccMatch.getAllContextElements().add(reqContainerToImplContainer);
		ccMatch.setRuleName(ccMatch_ruleName_prime);
		return new Object[] { virtualNodeToRouter, reqContainerToImplContainer, sourceMatch, targetMatch, ccMatch };
	}

	public static final Object[] pattern_VirtualNodeToComputerRule_21_6_createcorrespondence_blackBBBBBBB(
			NetworkSpan virtualNode, Cable cable, Router router, implementation.Container implContainer,
			Computer computer, Container reqContainer, CCMatch ccMatch) {
		return new Object[] { virtualNode, cable, router, implContainer, computer, reqContainer, ccMatch };
	}

	public static final Object[] pattern_VirtualNodeToComputerRule_21_6_createcorrespondence_greenBFBB(
			NetworkSpan virtualNode, Computer computer, CCMatch ccMatch) {
		VirtualNodeToComputer virtualNodeToComputer = ReqToImpTransformatorFactory.eINSTANCE
				.createVirtualNodeToComputer();
		virtualNodeToComputer.setTarget(computer);
		virtualNodeToComputer.setSource(virtualNode);
		ccMatch.getCreateCorr().add(virtualNodeToComputer);
		return new Object[] { virtualNode, virtualNodeToComputer, computer, ccMatch };
	}

	public static final Object[] pattern_VirtualNodeToComputerRule_21_7_addtoreturnedresult_blackBB(
			IsApplicableRuleResult result, CCMatch ccMatch) {
		return new Object[] { result, ccMatch };
	}

	public static final Object[] pattern_VirtualNodeToComputerRule_21_7_addtoreturnedresult_greenBB(
			IsApplicableRuleResult result, CCMatch ccMatch) {
		result.getIsApplicableMatch().add(ccMatch);
		boolean result_success_prime = Boolean.valueOf(true);
		String ccMatch_ruleName_prime = "VirtualNodeToComputerRule";
		result.setSuccess(Boolean.valueOf(result_success_prime));
		ccMatch.setRuleName(ccMatch_ruleName_prime);
		return new Object[] { result, ccMatch };
	}

	public static final IsApplicableRuleResult pattern_VirtualNodeToComputerRule_21_8_expressionFB(
			IsApplicableRuleResult result) {
		IsApplicableRuleResult _result = result;
		return _result;
	}

	public static final Object[] pattern_VirtualNodeToComputerRule_24_1_matchtggpattern_blackBB(NetworkSpan virtualNode,
			Container reqContainer) {
		if (virtualNode.equals(reqContainer.getNetworkSpan())) {
			return new Object[] { virtualNode, reqContainer };
		}
		return null;
	}

	public static final boolean pattern_VirtualNodeToComputerRule_24_2_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_VirtualNodeToComputerRule_24_3_expressionF() {
		boolean _result = Boolean.valueOf(false);
		return _result;
	}

	public static final Object[] pattern_VirtualNodeToComputerRule_25_1_matchtggpattern_blackBBBB(Cable cable,
			Router router, implementation.Container implContainer, Computer computer) {
		if (implContainer.getDevices().contains(router)) {
			if (implContainer.getCables().contains(cable)) {
				if (implContainer.getDevices().contains(computer)) {
					if (router.getOutgoing().contains(cable)) {
						if (computer.getIncoming().contains(cable)) {
							return new Object[] { cable, router, implContainer, computer };
						}
					}
				}
			}
		}
		return null;
	}

	public static final boolean pattern_VirtualNodeToComputerRule_25_2_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_VirtualNodeToComputerRule_25_3_expressionF() {
		boolean _result = Boolean.valueOf(false);
		return _result;
	}

	public static final Object[] pattern_VirtualNodeToComputerRule_26_1_createresult_blackB(
			VirtualNodeToComputerRule _this) {
		return new Object[] { _this };
	}

	public static final Object[] pattern_VirtualNodeToComputerRule_26_1_createresult_greenFF() {
		IsApplicableMatch isApplicableMatch = RuntimeFactory.eINSTANCE.createIsApplicableMatch();
		ModelgeneratorRuleResult ruleResult = RuntimeFactory.eINSTANCE.createModelgeneratorRuleResult();
		boolean ruleResult_success_prime = Boolean.valueOf(false);
		ruleResult.setSuccess(Boolean.valueOf(ruleResult_success_prime));
		return new Object[] { isApplicableMatch, ruleResult };
	}

	public static final Object[] pattern_VirtualNodeToComputerRule_26_2_isapplicablecore_black_nac_0BB(
			ModelgeneratorRuleResult ruleResult, NetworkSpan virtualNode) {
		if (ruleResult.getSourceObjects().contains(virtualNode)) {
			return new Object[] { ruleResult, virtualNode };
		}
		return null;
	}

	public static final Object[] pattern_VirtualNodeToComputerRule_26_2_isapplicablecore_black_nac_1BB(
			ModelgeneratorRuleResult ruleResult, VirtualNodeToRouter virtualNodeToRouter) {
		if (ruleResult.getCorrObjects().contains(virtualNodeToRouter)) {
			return new Object[] { ruleResult, virtualNodeToRouter };
		}
		return null;
	}

	public static final Object[] pattern_VirtualNodeToComputerRule_26_2_isapplicablecore_black_nac_2BB(
			ModelgeneratorRuleResult ruleResult, Router router) {
		if (ruleResult.getTargetObjects().contains(router)) {
			return new Object[] { ruleResult, router };
		}
		return null;
	}

	public static final Object[] pattern_VirtualNodeToComputerRule_26_2_isapplicablecore_black_nac_3BB(
			ModelgeneratorRuleResult ruleResult, implementation.Container implContainer) {
		if (ruleResult.getTargetObjects().contains(implContainer)) {
			return new Object[] { ruleResult, implContainer };
		}
		return null;
	}

	public static final Object[] pattern_VirtualNodeToComputerRule_26_2_isapplicablecore_black_nac_4BB(
			ModelgeneratorRuleResult ruleResult, Cable cable) {
		if (ruleResult.getTargetObjects().contains(cable)) {
			return new Object[] { ruleResult, cable };
		}
		return null;
	}

	public static final Object[] pattern_VirtualNodeToComputerRule_26_2_isapplicablecore_black_nac_5BB(
			ModelgeneratorRuleResult ruleResult, ReqContainerToImplContainer reqContainerToImplContainer) {
		if (ruleResult.getCorrObjects().contains(reqContainerToImplContainer)) {
			return new Object[] { ruleResult, reqContainerToImplContainer };
		}
		return null;
	}

	public static final Object[] pattern_VirtualNodeToComputerRule_26_2_isapplicablecore_black_nac_6BB(
			ModelgeneratorRuleResult ruleResult, Container reqContainer) {
		if (ruleResult.getSourceObjects().contains(reqContainer)) {
			return new Object[] { ruleResult, reqContainer };
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_VirtualNodeToComputerRule_26_2_isapplicablecore_blackFFFFFFFFBB(
			RuleEntryContainer ruleEntryContainer, ModelgeneratorRuleResult ruleResult) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		for (RuleEntryList virtualNodeToRouterList : ruleEntryContainer.getRuleEntryList()) {
			for (EObject tmpVirtualNodeToRouter : virtualNodeToRouterList.getEntryObjects()) {
				if (tmpVirtualNodeToRouter instanceof VirtualNodeToRouter) {
					VirtualNodeToRouter virtualNodeToRouter = (VirtualNodeToRouter) tmpVirtualNodeToRouter;
					NetworkSpan virtualNode = virtualNodeToRouter.getSource();
					if (virtualNode != null) {
						Router router = virtualNodeToRouter.getTarget();
						if (router != null) {
							if (pattern_VirtualNodeToComputerRule_26_2_isapplicablecore_black_nac_1BB(ruleResult,
									virtualNodeToRouter) == null) {
								if (pattern_VirtualNodeToComputerRule_26_2_isapplicablecore_black_nac_0BB(ruleResult,
										virtualNode) == null) {
									if (pattern_VirtualNodeToComputerRule_26_2_isapplicablecore_black_nac_2BB(
											ruleResult, router) == null) {
										for (Container reqContainer : org.moflon.core.utilities.eMoflonEMFUtil
												.getOppositeReferenceTyped(virtualNode, Container.class,
														"networkSpan")) {
											if (pattern_VirtualNodeToComputerRule_26_2_isapplicablecore_black_nac_6BB(
													ruleResult, reqContainer) == null) {
												for (implementation.Container implContainer : org.moflon.core.utilities.eMoflonEMFUtil
														.getOppositeReferenceTyped(router,
																implementation.Container.class, "devices")) {
													if (pattern_VirtualNodeToComputerRule_26_2_isapplicablecore_black_nac_3BB(
															ruleResult, implContainer) == null) {
														for (Cable cable : implContainer.getCables()) {
															if (pattern_VirtualNodeToComputerRule_26_2_isapplicablecore_black_nac_4BB(
																	ruleResult, cable) == null) {
																for (ReqContainerToImplContainer reqContainerToImplContainer : org.moflon.core.utilities.eMoflonEMFUtil
																		.getOppositeReferenceTyped(reqContainer,
																				ReqContainerToImplContainer.class,
																				"source")) {
																	if (implContainer.equals(
																			reqContainerToImplContainer.getTarget())) {
																		if (pattern_VirtualNodeToComputerRule_26_2_isapplicablecore_black_nac_5BB(
																				ruleResult,
																				reqContainerToImplContainer) == null) {
																			_result.add(new Object[] {
																					virtualNodeToRouterList,
																					virtualNode, virtualNodeToRouter,
																					router, implContainer, cable,
																					reqContainerToImplContainer,
																					reqContainer, ruleEntryContainer,
																					ruleResult });
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

	public static final Object[] pattern_VirtualNodeToComputerRule_26_3_solveCSP_bindingFBBBBBBBBBB(
			VirtualNodeToComputerRule _this, IsApplicableMatch isApplicableMatch, NetworkSpan virtualNode, Cable cable,
			Router router, implementation.Container implContainer, VirtualNodeToRouter virtualNodeToRouter,
			Container reqContainer, ReqContainerToImplContainer reqContainerToImplContainer,
			ModelgeneratorRuleResult ruleResult) {
		CSP _localVariable_0 = _this.generateModel_solveCsp_BWD(isApplicableMatch, virtualNode, cable, router,
				implContainer, virtualNodeToRouter, reqContainer, reqContainerToImplContainer, ruleResult);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, virtualNode, cable, router, implContainer,
					virtualNodeToRouter, reqContainer, reqContainerToImplContainer, ruleResult };
		}
		return null;
	}

	public static final Object[] pattern_VirtualNodeToComputerRule_26_3_solveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_VirtualNodeToComputerRule_26_3_solveCSP_bindingAndBlackFBBBBBBBBBB(
			VirtualNodeToComputerRule _this, IsApplicableMatch isApplicableMatch, NetworkSpan virtualNode, Cable cable,
			Router router, implementation.Container implContainer, VirtualNodeToRouter virtualNodeToRouter,
			Container reqContainer, ReqContainerToImplContainer reqContainerToImplContainer,
			ModelgeneratorRuleResult ruleResult) {
		Object[] result_pattern_VirtualNodeToComputerRule_26_3_solveCSP_binding = pattern_VirtualNodeToComputerRule_26_3_solveCSP_bindingFBBBBBBBBBB(
				_this, isApplicableMatch, virtualNode, cable, router, implContainer, virtualNodeToRouter, reqContainer,
				reqContainerToImplContainer, ruleResult);
		if (result_pattern_VirtualNodeToComputerRule_26_3_solveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_VirtualNodeToComputerRule_26_3_solveCSP_binding[0];

			Object[] result_pattern_VirtualNodeToComputerRule_26_3_solveCSP_black = pattern_VirtualNodeToComputerRule_26_3_solveCSP_blackB(
					csp);
			if (result_pattern_VirtualNodeToComputerRule_26_3_solveCSP_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, virtualNode, cable, router, implContainer,
						virtualNodeToRouter, reqContainer, reqContainerToImplContainer, ruleResult };
			}
		}
		return null;
	}

	public static final boolean pattern_VirtualNodeToComputerRule_26_4_checkCSP_expressionFBB(
			VirtualNodeToComputerRule _this, CSP csp) {
		boolean _localVariable_0 = _this.generateModel_checkCsp_BWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_VirtualNodeToComputerRule_26_5_checknacs_blackBBBBBBB(NetworkSpan virtualNode,
			Cable cable, Router router, implementation.Container implContainer, VirtualNodeToRouter virtualNodeToRouter,
			Container reqContainer, ReqContainerToImplContainer reqContainerToImplContainer) {
		return new Object[] { virtualNode, cable, router, implContainer, virtualNodeToRouter, reqContainer,
				reqContainerToImplContainer };
	}

	public static final Object[] pattern_VirtualNodeToComputerRule_26_6_perform_blackBBBBBBBB(NetworkSpan virtualNode,
			Cable cable, Router router, implementation.Container implContainer, VirtualNodeToRouter virtualNodeToRouter,
			Container reqContainer, ReqContainerToImplContainer reqContainerToImplContainer,
			ModelgeneratorRuleResult ruleResult) {
		return new Object[] { virtualNode, cable, router, implContainer, virtualNodeToRouter, reqContainer,
				reqContainerToImplContainer, ruleResult };
	}

	public static final Object[] pattern_VirtualNodeToComputerRule_26_6_perform_greenBBBBFFB(NetworkSpan virtualNode,
			Cable cable, Router router, implementation.Container implContainer, ModelgeneratorRuleResult ruleResult) {
		VirtualNodeToComputer virtualNodeToComputer = ReqToImpTransformatorFactory.eINSTANCE
				.createVirtualNodeToComputer();
		Computer computer = ImplementationFactory.eINSTANCE.createComputer();
		router.getOutgoing().add(cable);
		boolean ruleResult_success_prime = Boolean.valueOf(true);
		int _localVariable_0 = ruleResult.getIncrementedPerformCount();
		virtualNodeToComputer.setSource(virtualNode);
		ruleResult.getCorrObjects().add(virtualNodeToComputer);
		virtualNodeToComputer.setTarget(computer);
		implContainer.getDevices().add(computer);
		computer.getIncoming().add(cable);
		ruleResult.getTargetObjects().add(computer);
		ruleResult.setSuccess(Boolean.valueOf(ruleResult_success_prime));
		int ruleResult_performCount_prime = Integer.valueOf(_localVariable_0);
		ruleResult.setPerformCount(Integer.valueOf(ruleResult_performCount_prime));
		return new Object[] { virtualNode, cable, router, implContainer, virtualNodeToComputer, computer, ruleResult };
	}

	public static final ModelgeneratorRuleResult pattern_VirtualNodeToComputerRule_26_7_expressionFB(
			ModelgeneratorRuleResult ruleResult) {
		ModelgeneratorRuleResult _result = ruleResult;
		return _result;
	}

	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} //VirtualNodeToComputerRuleImpl
