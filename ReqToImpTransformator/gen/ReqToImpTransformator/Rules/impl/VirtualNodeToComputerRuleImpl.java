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
	public boolean isAppropriate_FWD(Match match, Container reqContainer, NetworkSpan virtualNode) {

		Object[] result1_black = VirtualNodeToComputerRuleImpl
				.pattern_VirtualNodeToComputerRule_0_1_initialbindings_blackBBBB(this, match, reqContainer,
						virtualNode);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[match] = " + match + ", " + "[reqContainer] = " + reqContainer + ", " + "[virtualNode] = "
					+ virtualNode + ".");
		}

		Object[] result2_bindingAndBlack = VirtualNodeToComputerRuleImpl
				.pattern_VirtualNodeToComputerRule_0_2_SolveCSP_bindingAndBlackFBBBB(this, match, reqContainer,
						virtualNode);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[match] = " + match + ", " + "[reqContainer] = " + reqContainer + ", " + "[virtualNode] = "
					+ virtualNode + ".");
		}
		CSP csp = (CSP) result2_bindingAndBlack[0];
		// 
		if (VirtualNodeToComputerRuleImpl.pattern_VirtualNodeToComputerRule_0_3_CheckCSP_expressionFBB(this, csp)) {

			Object[] result4_black = VirtualNodeToComputerRuleImpl
					.pattern_VirtualNodeToComputerRule_0_4_collectelementstobetranslated_blackBBB(match, reqContainer,
							virtualNode);
			if (result4_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match + ", "
						+ "[reqContainer] = " + reqContainer + ", " + "[virtualNode] = " + virtualNode + ".");
			}

			Object[] result5_black = VirtualNodeToComputerRuleImpl
					.pattern_VirtualNodeToComputerRule_0_5_collectcontextelements_blackBBB(match, reqContainer,
							virtualNode);
			if (result5_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match + ", "
						+ "[reqContainer] = " + reqContainer + ", " + "[virtualNode] = " + virtualNode + ".");
			}
			VirtualNodeToComputerRuleImpl.pattern_VirtualNodeToComputerRule_0_5_collectcontextelements_greenBBBF(match,
					reqContainer, virtualNode);
			//nothing EMoflonEdge reqContainer__virtualNode____networkSpan = (EMoflonEdge) result5_green[3];

			// 
			VirtualNodeToComputerRuleImpl.pattern_VirtualNodeToComputerRule_0_6_registerobjectstomatch_expressionBBBB(
					this, match, reqContainer, virtualNode);
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
	public void registerObjectsToMatch_FWD(Match match, Container reqContainer, NetworkSpan virtualNode) {
		match.registerObject("reqContainer", reqContainer);
		match.registerObject("virtualNode", virtualNode);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isAppropriate_solveCsp_FWD(Match match, Container reqContainer, NetworkSpan virtualNode) {// Create CSP
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
	public boolean isAppropriate_BWD(Match match, Router router, Cable cable, implementation.Container implContainer,
			Computer computer) {

		Object[] result1_black = VirtualNodeToComputerRuleImpl
				.pattern_VirtualNodeToComputerRule_7_1_initialbindings_blackBBBBBB(this, match, router, cable,
						implContainer, computer);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[match] = " + match + ", " + "[router] = " + router + ", " + "[cable] = " + cable + ", "
					+ "[implContainer] = " + implContainer + ", " + "[computer] = " + computer + ".");
		}

		Object[] result2_bindingAndBlack = VirtualNodeToComputerRuleImpl
				.pattern_VirtualNodeToComputerRule_7_2_SolveCSP_bindingAndBlackFBBBBBB(this, match, router, cable,
						implContainer, computer);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[match] = " + match + ", " + "[router] = " + router + ", " + "[cable] = " + cable + ", "
					+ "[implContainer] = " + implContainer + ", " + "[computer] = " + computer + ".");
		}
		CSP csp = (CSP) result2_bindingAndBlack[0];
		// 
		if (VirtualNodeToComputerRuleImpl.pattern_VirtualNodeToComputerRule_7_3_CheckCSP_expressionFBB(this, csp)) {

			Object[] result4_black = VirtualNodeToComputerRuleImpl
					.pattern_VirtualNodeToComputerRule_7_4_collectelementstobetranslated_blackBBBBB(match, router,
							cable, implContainer, computer);
			if (result4_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match + ", "
						+ "[router] = " + router + ", " + "[cable] = " + cable + ", " + "[implContainer] = "
						+ implContainer + ", " + "[computer] = " + computer + ".");
			}
			VirtualNodeToComputerRuleImpl
					.pattern_VirtualNodeToComputerRule_7_4_collectelementstobetranslated_greenBBBBBFFFFF(match, router,
							cable, implContainer, computer);
			//nothing EMoflonEdge router__cable____outgoing = (EMoflonEdge) result4_green[5];
			//nothing EMoflonEdge cable__router____source = (EMoflonEdge) result4_green[6];
			//nothing EMoflonEdge computer__cable____incoming = (EMoflonEdge) result4_green[7];
			//nothing EMoflonEdge cable__computer____target = (EMoflonEdge) result4_green[8];
			//nothing EMoflonEdge implContainer__computer____devices = (EMoflonEdge) result4_green[9];

			Object[] result5_black = VirtualNodeToComputerRuleImpl
					.pattern_VirtualNodeToComputerRule_7_5_collectcontextelements_blackBBBBB(match, router, cable,
							implContainer, computer);
			if (result5_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match + ", "
						+ "[router] = " + router + ", " + "[cable] = " + cable + ", " + "[implContainer] = "
						+ implContainer + ", " + "[computer] = " + computer + ".");
			}
			VirtualNodeToComputerRuleImpl.pattern_VirtualNodeToComputerRule_7_5_collectcontextelements_greenBBBBFF(
					match, router, cable, implContainer);
			//nothing EMoflonEdge implContainer__cable____cables = (EMoflonEdge) result5_green[4];
			//nothing EMoflonEdge implContainer__router____devices = (EMoflonEdge) result5_green[5];

			// 
			VirtualNodeToComputerRuleImpl.pattern_VirtualNodeToComputerRule_7_6_registerobjectstomatch_expressionBBBBBB(
					this, match, router, cable, implContainer, computer);
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
		Container reqContainer = (Container) result1_bindingAndBlack[0];
		Router router = (Router) result1_bindingAndBlack[1];
		VirtualNodeToRouter virtualNodeToRouter = (VirtualNodeToRouter) result1_bindingAndBlack[2];
		NetworkSpan virtualNode = (NetworkSpan) result1_bindingAndBlack[3];
		Cable cable = (Cable) result1_bindingAndBlack[4];
		ReqContainerToImplContainer reqContainerToImplContainer = (ReqContainerToImplContainer) result1_bindingAndBlack[5];
		implementation.Container implContainer = (implementation.Container) result1_bindingAndBlack[6];
		Computer computer = (Computer) result1_bindingAndBlack[7];
		//nothing CSP csp = (CSP) result1_bindingAndBlack[8];
		Object[] result1_green = VirtualNodeToComputerRuleImpl
				.pattern_VirtualNodeToComputerRule_8_1_performtransformation_greenFBB(virtualNode, computer);
		VirtualNodeToComputer virtualNodeToComputer = (VirtualNodeToComputer) result1_green[0];

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
				.pattern_VirtualNodeToComputerRule_8_3_bookkeepingforedges_blackBBBBBBBBBB(ruleresult, reqContainer,
						router, virtualNodeToRouter, virtualNodeToComputer, virtualNode, cable,
						reqContainerToImplContainer, implContainer, computer);
		if (result3_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[ruleresult] = " + ruleresult
					+ ", " + "[reqContainer] = " + reqContainer + ", " + "[router] = " + router + ", "
					+ "[virtualNodeToRouter] = " + virtualNodeToRouter + ", " + "[virtualNodeToComputer] = "
					+ virtualNodeToComputer + ", " + "[virtualNode] = " + virtualNode + ", " + "[cable] = " + cable
					+ ", " + "[reqContainerToImplContainer] = " + reqContainerToImplContainer + ", "
					+ "[implContainer] = " + implContainer + ", " + "[computer] = " + computer + ".");
		}
		VirtualNodeToComputerRuleImpl.pattern_VirtualNodeToComputerRule_8_3_bookkeepingforedges_greenBBBBBBBFFFFFFF(
				ruleresult, router, virtualNodeToComputer, virtualNode, cable, implContainer, computer);
		//nothing EMoflonEdge router__cable____outgoing = (EMoflonEdge) result3_green[7];
		//nothing EMoflonEdge cable__router____source = (EMoflonEdge) result3_green[8];
		//nothing EMoflonEdge virtualNodeToComputer__virtualNode____source = (EMoflonEdge) result3_green[9];
		//nothing EMoflonEdge virtualNodeToComputer__computer____target = (EMoflonEdge) result3_green[10];
		//nothing EMoflonEdge computer__cable____incoming = (EMoflonEdge) result3_green[11];
		//nothing EMoflonEdge cable__computer____target = (EMoflonEdge) result3_green[12];
		//nothing EMoflonEdge implContainer__computer____devices = (EMoflonEdge) result3_green[13];

		// 
		// 
		VirtualNodeToComputerRuleImpl.pattern_VirtualNodeToComputerRule_8_5_registerobjects_expressionBBBBBBBBBBB(this,
				ruleresult, reqContainer, router, virtualNodeToRouter, virtualNodeToComputer, virtualNode, cable,
				reqContainerToImplContainer, implContainer, computer);
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
		Router router = (Router) result2_binding[0];
		Cable cable = (Cable) result2_binding[1];
		implementation.Container implContainer = (implementation.Container) result2_binding[2];
		Computer computer = (Computer) result2_binding[3];
		for (Object[] result2_black : VirtualNodeToComputerRuleImpl
				.pattern_VirtualNodeToComputerRule_9_2_corematch_blackFBFFBFBBB(router, cable, implContainer, computer,
						match)) {
			Container reqContainer = (Container) result2_black[0];
			VirtualNodeToRouter virtualNodeToRouter = (VirtualNodeToRouter) result2_black[2];
			NetworkSpan virtualNode = (NetworkSpan) result2_black[3];
			ReqContainerToImplContainer reqContainerToImplContainer = (ReqContainerToImplContainer) result2_black[5];
			// ForEach 
			for (Object[] result3_black : VirtualNodeToComputerRuleImpl
					.pattern_VirtualNodeToComputerRule_9_3_findcontext_blackBBBBBBBB(reqContainer, router,
							virtualNodeToRouter, virtualNode, cable, reqContainerToImplContainer, implContainer,
							computer)) {
				Object[] result3_green = VirtualNodeToComputerRuleImpl
						.pattern_VirtualNodeToComputerRule_9_3_findcontext_greenBBBBBBBBFFFFFFFFFFFFF(reqContainer,
								router, virtualNodeToRouter, virtualNode, cable, reqContainerToImplContainer,
								implContainer, computer);
				IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result3_green[8];
				//nothing EMoflonEdge router__cable____outgoing = (EMoflonEdge) result3_green[9];
				//nothing EMoflonEdge cable__router____source = (EMoflonEdge) result3_green[10];
				//nothing EMoflonEdge reqContainer__virtualNode____networkSpan = (EMoflonEdge) result3_green[11];
				//nothing EMoflonEdge reqContainerToImplContainer__reqContainer____source = (EMoflonEdge) result3_green[12];
				//nothing EMoflonEdge virtualNodeToRouter__virtualNode____source = (EMoflonEdge) result3_green[13];
				//nothing EMoflonEdge virtualNodeToRouter__router____target = (EMoflonEdge) result3_green[14];
				//nothing EMoflonEdge reqContainerToImplContainer__implContainer____target = (EMoflonEdge) result3_green[15];
				//nothing EMoflonEdge implContainer__cable____cables = (EMoflonEdge) result3_green[16];
				//nothing EMoflonEdge implContainer__router____devices = (EMoflonEdge) result3_green[17];
				//nothing EMoflonEdge computer__cable____incoming = (EMoflonEdge) result3_green[18];
				//nothing EMoflonEdge cable__computer____target = (EMoflonEdge) result3_green[19];
				//nothing EMoflonEdge implContainer__computer____devices = (EMoflonEdge) result3_green[20];

				Object[] result4_bindingAndBlack = VirtualNodeToComputerRuleImpl
						.pattern_VirtualNodeToComputerRule_9_4_solveCSP_bindingAndBlackFBBBBBBBBBB(this,
								isApplicableMatch, reqContainer, router, virtualNodeToRouter, virtualNode, cable,
								reqContainerToImplContainer, implContainer, computer);
				if (result4_bindingAndBlack == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
							+ "[isApplicableMatch] = " + isApplicableMatch + ", " + "[reqContainer] = " + reqContainer
							+ ", " + "[router] = " + router + ", " + "[virtualNodeToRouter] = " + virtualNodeToRouter
							+ ", " + "[virtualNode] = " + virtualNode + ", " + "[cable] = " + cable + ", "
							+ "[reqContainerToImplContainer] = " + reqContainerToImplContainer + ", "
							+ "[implContainer] = " + implContainer + ", " + "[computer] = " + computer + ".");
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
	public void registerObjectsToMatch_BWD(Match match, Router router, Cable cable,
			implementation.Container implContainer, Computer computer) {
		match.registerObject("router", router);
		match.registerObject("cable", cable);
		match.registerObject("implContainer", implContainer);
		match.registerObject("computer", computer);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isAppropriate_solveCsp_BWD(Match match, Router router, Cable cable,
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
	public CSP isApplicable_solveCsp_BWD(IsApplicableMatch isApplicableMatch, Container reqContainer, Router router,
			VirtualNodeToRouter virtualNodeToRouter, NetworkSpan virtualNode, Cable cable,
			ReqContainerToImplContainer reqContainerToImplContainer, implementation.Container implContainer,
			Computer computer) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals

		// Create attribute variables

		// Create unbound variables

		// Create constraints

		// Solve CSP

		// Snapshot pattern match on which CSP is solved
		isApplicableMatch.registerObject("reqContainer", reqContainer);
		isApplicableMatch.registerObject("router", router);
		isApplicableMatch.registerObject("virtualNodeToRouter", virtualNodeToRouter);
		isApplicableMatch.registerObject("virtualNode", virtualNode);
		isApplicableMatch.registerObject("cable", cable);
		isApplicableMatch.registerObject("reqContainerToImplContainer", reqContainerToImplContainer);
		isApplicableMatch.registerObject("implContainer", implContainer);
		isApplicableMatch.registerObject("computer", computer);
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
	public void registerObjects_BWD(PerformRuleResult ruleresult, EObject reqContainer, EObject router,
			EObject virtualNodeToRouter, EObject virtualNodeToComputer, EObject virtualNode, EObject cable,
			EObject reqContainerToImplContainer, EObject implContainer, EObject computer) {
		ruleresult.registerObject("reqContainer", reqContainer);
		ruleresult.registerObject("router", router);
		ruleresult.registerObject("virtualNodeToRouter", virtualNodeToRouter);
		ruleresult.registerObject("virtualNodeToComputer", virtualNodeToComputer);
		ruleresult.registerObject("virtualNode", virtualNode);
		ruleresult.registerObject("cable", cable);
		ruleresult.registerObject("reqContainerToImplContainer", reqContainerToImplContainer);
		ruleresult.registerObject("implContainer", implContainer);
		ruleresult.registerObject("computer", computer);

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
	public EObjectContainer isAppropriate_FWD_Container_1(Container reqContainer) {

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
				.pattern_VirtualNodeToComputerRule_17_2_testcorematchandDECs_blackBF(reqContainer)) {
			NetworkSpan virtualNode = (NetworkSpan) result2_black[1];
			Object[] result2_green = VirtualNodeToComputerRuleImpl
					.pattern_VirtualNodeToComputerRule_17_2_testcorematchandDECs_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// 
			if (VirtualNodeToComputerRuleImpl
					.pattern_VirtualNodeToComputerRule_17_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBB(
							this, match, reqContainer, virtualNode)) {
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
	public EObjectContainer isAppropriate_BWD_EMoflonEdge_1(EMoflonEdge _edge_outgoing) {

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
				.pattern_VirtualNodeToComputerRule_18_2_testcorematchandDECs_blackFFFFB(_edge_outgoing)) {
			Router router = (Router) result2_black[0];
			Cable cable = (Cable) result2_black[1];
			implementation.Container implContainer = (implementation.Container) result2_black[2];
			Computer computer = (Computer) result2_black[3];
			Object[] result2_green = VirtualNodeToComputerRuleImpl
					.pattern_VirtualNodeToComputerRule_18_2_testcorematchandDECs_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// 
			if (VirtualNodeToComputerRuleImpl
					.pattern_VirtualNodeToComputerRule_18_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBBBB(
							this, match, router, cable, implContainer, computer)) {
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
		Container reqContainer = (Container) result2_bindingAndBlack[0];
		Router router = (Router) result2_bindingAndBlack[1];
		NetworkSpan virtualNode = (NetworkSpan) result2_bindingAndBlack[2];
		Cable cable = (Cable) result2_bindingAndBlack[3];
		implementation.Container implContainer = (implementation.Container) result2_bindingAndBlack[4];
		Computer computer = (Computer) result2_bindingAndBlack[5];

		Object[] result3_bindingAndBlack = VirtualNodeToComputerRuleImpl
				.pattern_VirtualNodeToComputerRule_21_3_solvecsp_bindingAndBlackFBBBBBBBBB(this, reqContainer, router,
						virtualNode, cable, implContainer, computer, sourceMatch, targetMatch);
		if (result3_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[reqContainer] = " + reqContainer + ", " + "[router] = " + router + ", " + "[virtualNode] = "
					+ virtualNode + ", " + "[cable] = " + cable + ", " + "[implContainer] = " + implContainer + ", "
					+ "[computer] = " + computer + ", " + "[sourceMatch] = " + sourceMatch + ", " + "[targetMatch] = "
					+ targetMatch + ".");
		}
		CSP csp = (CSP) result3_bindingAndBlack[0];
		// 
		if (VirtualNodeToComputerRuleImpl.pattern_VirtualNodeToComputerRule_21_4_checkCSP_expressionFB(csp)) {
			// ForEach 
			for (Object[] result5_black : VirtualNodeToComputerRuleImpl
					.pattern_VirtualNodeToComputerRule_21_5_matchcorrcontext_blackBBFBFBBB(reqContainer, router,
							virtualNode, implContainer, sourceMatch, targetMatch)) {
				VirtualNodeToRouter virtualNodeToRouter = (VirtualNodeToRouter) result5_black[2];
				ReqContainerToImplContainer reqContainerToImplContainer = (ReqContainerToImplContainer) result5_black[4];
				Object[] result5_green = VirtualNodeToComputerRuleImpl
						.pattern_VirtualNodeToComputerRule_21_5_matchcorrcontext_greenBBBBF(virtualNodeToRouter,
								reqContainerToImplContainer, sourceMatch, targetMatch);
				CCMatch ccMatch = (CCMatch) result5_green[4];

				Object[] result6_black = VirtualNodeToComputerRuleImpl
						.pattern_VirtualNodeToComputerRule_21_6_createcorrespondence_blackBBBBBBB(reqContainer, router,
								virtualNode, cable, implContainer, computer, ccMatch);
				if (result6_black == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[reqContainer] = "
							+ reqContainer + ", " + "[router] = " + router + ", " + "[virtualNode] = " + virtualNode
							+ ", " + "[cable] = " + cable + ", " + "[implContainer] = " + implContainer + ", "
							+ "[computer] = " + computer + ", " + "[ccMatch] = " + ccMatch + ".");
				}
				VirtualNodeToComputerRuleImpl.pattern_VirtualNodeToComputerRule_21_6_createcorrespondence_greenFBBB(
						virtualNode, computer, ccMatch);
				//nothing VirtualNodeToComputer virtualNodeToComputer = (VirtualNodeToComputer) result6_green[0];

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
	public CSP isApplicable_solveCsp_CC(Container reqContainer, Router router, NetworkSpan virtualNode, Cable cable,
			implementation.Container implContainer, Computer computer, Match sourceMatch, Match targetMatch) {// Create CSP
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
	public boolean checkDEC_FWD(Container reqContainer, NetworkSpan virtualNode) {// 
		Object[] result1_black = VirtualNodeToComputerRuleImpl
				.pattern_VirtualNodeToComputerRule_24_1_matchtggpattern_blackBB(reqContainer, virtualNode);
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
	public boolean checkDEC_BWD(Router router, Cable cable, implementation.Container implContainer, Computer computer) {// 
		Object[] result1_black = VirtualNodeToComputerRuleImpl
				.pattern_VirtualNodeToComputerRule_25_1_matchtggpattern_blackBBBB(router, cable, implContainer,
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
			Container reqContainer = (Container) result2_black[1];
			NetworkSpan virtualNode = (NetworkSpan) result2_black[2];
			VirtualNodeToRouter virtualNodeToRouter = (VirtualNodeToRouter) result2_black[3];
			Router router = (Router) result2_black[4];
			implementation.Container implContainer = (implementation.Container) result2_black[5];
			Cable cable = (Cable) result2_black[6];
			ReqContainerToImplContainer reqContainerToImplContainer = (ReqContainerToImplContainer) result2_black[7];

			Object[] result3_bindingAndBlack = VirtualNodeToComputerRuleImpl
					.pattern_VirtualNodeToComputerRule_26_3_solveCSP_bindingAndBlackFBBBBBBBBBB(this, isApplicableMatch,
							reqContainer, router, virtualNodeToRouter, virtualNode, cable, reqContainerToImplContainer,
							implContainer, ruleResult);
			if (result3_bindingAndBlack == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
						+ "[isApplicableMatch] = " + isApplicableMatch + ", " + "[reqContainer] = " + reqContainer
						+ ", " + "[router] = " + router + ", " + "[virtualNodeToRouter] = " + virtualNodeToRouter + ", "
						+ "[virtualNode] = " + virtualNode + ", " + "[cable] = " + cable + ", "
						+ "[reqContainerToImplContainer] = " + reqContainerToImplContainer + ", " + "[implContainer] = "
						+ implContainer + ", " + "[ruleResult] = " + ruleResult + ".");
			}
			CSP csp = (CSP) result3_bindingAndBlack[0];
			// 
			if (VirtualNodeToComputerRuleImpl.pattern_VirtualNodeToComputerRule_26_4_checkCSP_expressionFBB(this,
					csp)) {
				// 
				Object[] result5_black = VirtualNodeToComputerRuleImpl
						.pattern_VirtualNodeToComputerRule_26_5_checknacs_blackBBBBBBB(reqContainer, router,
								virtualNodeToRouter, virtualNode, cable, reqContainerToImplContainer, implContainer);
				if (result5_black != null) {

					Object[] result6_black = VirtualNodeToComputerRuleImpl
							.pattern_VirtualNodeToComputerRule_26_6_perform_blackBBBBBBBB(reqContainer, router,
									virtualNodeToRouter, virtualNode, cable, reqContainerToImplContainer, implContainer,
									ruleResult);
					if (result6_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[reqContainer] = "
								+ reqContainer + ", " + "[router] = " + router + ", " + "[virtualNodeToRouter] = "
								+ virtualNodeToRouter + ", " + "[virtualNode] = " + virtualNode + ", " + "[cable] = "
								+ cable + ", " + "[reqContainerToImplContainer] = " + reqContainerToImplContainer + ", "
								+ "[implContainer] = " + implContainer + ", " + "[ruleResult] = " + ruleResult + ".");
					}
					VirtualNodeToComputerRuleImpl.pattern_VirtualNodeToComputerRule_26_6_perform_greenBFBBBFB(router,
							virtualNode, cable, implContainer, ruleResult);
					//nothing VirtualNodeToComputer virtualNodeToComputer = (VirtualNodeToComputer) result6_green[1];
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
	public CSP generateModel_solveCsp_BWD(IsApplicableMatch isApplicableMatch, Container reqContainer, Router router,
			VirtualNodeToRouter virtualNodeToRouter, NetworkSpan virtualNode, Cable cable,
			ReqContainerToImplContainer reqContainerToImplContainer, implementation.Container implContainer,
			ModelgeneratorRuleResult ruleResult) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals

		// Create attribute variables

		// Create unbound variables

		// Create constraints

		// Solve CSP

		// Snapshot pattern match on which CSP is solved
		isApplicableMatch.registerObject("reqContainer", reqContainer);
		isApplicableMatch.registerObject("router", router);
		isApplicableMatch.registerObject("virtualNodeToRouter", virtualNodeToRouter);
		isApplicableMatch.registerObject("virtualNode", virtualNode);
		isApplicableMatch.registerObject("cable", cable);
		isApplicableMatch.registerObject("reqContainerToImplContainer", reqContainerToImplContainer);
		isApplicableMatch.registerObject("implContainer", implContainer);
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
		case RulesPackage.VIRTUAL_NODE_TO_COMPUTER_RULE___IS_APPROPRIATE_FWD__MATCH_CONTAINER_NETWORKSPAN:
			return isAppropriate_FWD((Match) arguments.get(0), (Container) arguments.get(1),
					(NetworkSpan) arguments.get(2));
		case RulesPackage.VIRTUAL_NODE_TO_COMPUTER_RULE___PERFORM_FWD__ISAPPLICABLEMATCH:
			return perform_FWD((IsApplicableMatch) arguments.get(0));
		case RulesPackage.VIRTUAL_NODE_TO_COMPUTER_RULE___IS_APPLICABLE_FWD__MATCH:
			return isApplicable_FWD((Match) arguments.get(0));
		case RulesPackage.VIRTUAL_NODE_TO_COMPUTER_RULE___REGISTER_OBJECTS_TO_MATCH_FWD__MATCH_CONTAINER_NETWORKSPAN:
			registerObjectsToMatch_FWD((Match) arguments.get(0), (Container) arguments.get(1),
					(NetworkSpan) arguments.get(2));
			return null;
		case RulesPackage.VIRTUAL_NODE_TO_COMPUTER_RULE___IS_APPROPRIATE_SOLVE_CSP_FWD__MATCH_CONTAINER_NETWORKSPAN:
			return isAppropriate_solveCsp_FWD((Match) arguments.get(0), (Container) arguments.get(1),
					(NetworkSpan) arguments.get(2));
		case RulesPackage.VIRTUAL_NODE_TO_COMPUTER_RULE___IS_APPROPRIATE_CHECK_CSP_FWD__CSP:
			return isAppropriate_checkCsp_FWD((CSP) arguments.get(0));
		case RulesPackage.VIRTUAL_NODE_TO_COMPUTER_RULE___CHECK_TYPES_FWD__MATCH:
			return checkTypes_FWD((Match) arguments.get(0));
		case RulesPackage.VIRTUAL_NODE_TO_COMPUTER_RULE___IS_APPROPRIATE_BWD__MATCH_ROUTER_CABLE_CONTAINER_COMPUTER:
			return isAppropriate_BWD((Match) arguments.get(0), (Router) arguments.get(1), (Cable) arguments.get(2),
					(implementation.Container) arguments.get(3), (Computer) arguments.get(4));
		case RulesPackage.VIRTUAL_NODE_TO_COMPUTER_RULE___PERFORM_BWD__ISAPPLICABLEMATCH:
			return perform_BWD((IsApplicableMatch) arguments.get(0));
		case RulesPackage.VIRTUAL_NODE_TO_COMPUTER_RULE___IS_APPLICABLE_BWD__MATCH:
			return isApplicable_BWD((Match) arguments.get(0));
		case RulesPackage.VIRTUAL_NODE_TO_COMPUTER_RULE___REGISTER_OBJECTS_TO_MATCH_BWD__MATCH_ROUTER_CABLE_CONTAINER_COMPUTER:
			registerObjectsToMatch_BWD((Match) arguments.get(0), (Router) arguments.get(1), (Cable) arguments.get(2),
					(implementation.Container) arguments.get(3), (Computer) arguments.get(4));
			return null;
		case RulesPackage.VIRTUAL_NODE_TO_COMPUTER_RULE___IS_APPROPRIATE_SOLVE_CSP_BWD__MATCH_ROUTER_CABLE_CONTAINER_COMPUTER:
			return isAppropriate_solveCsp_BWD((Match) arguments.get(0), (Router) arguments.get(1),
					(Cable) arguments.get(2), (implementation.Container) arguments.get(3), (Computer) arguments.get(4));
		case RulesPackage.VIRTUAL_NODE_TO_COMPUTER_RULE___IS_APPROPRIATE_CHECK_CSP_BWD__CSP:
			return isAppropriate_checkCsp_BWD((CSP) arguments.get(0));
		case RulesPackage.VIRTUAL_NODE_TO_COMPUTER_RULE___IS_APPLICABLE_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_CONTAINER_ROUTER_VIRTUALNODETOROUTER_NETWORKSPAN_CABLE_REQCONTAINERTOIMPLCONTAINER_CONTAINER_COMPUTER:
			return isApplicable_solveCsp_BWD((IsApplicableMatch) arguments.get(0), (Container) arguments.get(1),
					(Router) arguments.get(2), (VirtualNodeToRouter) arguments.get(3), (NetworkSpan) arguments.get(4),
					(Cable) arguments.get(5), (ReqContainerToImplContainer) arguments.get(6),
					(implementation.Container) arguments.get(7), (Computer) arguments.get(8));
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
		case RulesPackage.VIRTUAL_NODE_TO_COMPUTER_RULE___IS_APPROPRIATE_FWD_CONTAINER_1__CONTAINER:
			return isAppropriate_FWD_Container_1((Container) arguments.get(0));
		case RulesPackage.VIRTUAL_NODE_TO_COMPUTER_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_1__EMOFLONEDGE:
			return isAppropriate_BWD_EMoflonEdge_1((EMoflonEdge) arguments.get(0));
		case RulesPackage.VIRTUAL_NODE_TO_COMPUTER_RULE___CHECK_ATTRIBUTES_FWD__TRIPLEMATCH:
			return checkAttributes_FWD((TripleMatch) arguments.get(0));
		case RulesPackage.VIRTUAL_NODE_TO_COMPUTER_RULE___CHECK_ATTRIBUTES_BWD__TRIPLEMATCH:
			return checkAttributes_BWD((TripleMatch) arguments.get(0));
		case RulesPackage.VIRTUAL_NODE_TO_COMPUTER_RULE___IS_APPLICABLE_CC__MATCH_MATCH:
			return isApplicable_CC((Match) arguments.get(0), (Match) arguments.get(1));
		case RulesPackage.VIRTUAL_NODE_TO_COMPUTER_RULE___IS_APPLICABLE_SOLVE_CSP_CC__CONTAINER_ROUTER_NETWORKSPAN_CABLE_CONTAINER_COMPUTER_MATCH_MATCH:
			return isApplicable_solveCsp_CC((Container) arguments.get(0), (Router) arguments.get(1),
					(NetworkSpan) arguments.get(2), (Cable) arguments.get(3),
					(implementation.Container) arguments.get(4), (Computer) arguments.get(5), (Match) arguments.get(6),
					(Match) arguments.get(7));
		case RulesPackage.VIRTUAL_NODE_TO_COMPUTER_RULE___IS_APPLICABLE_CHECK_CSP_CC__CSP:
			return isApplicable_checkCsp_CC((CSP) arguments.get(0));
		case RulesPackage.VIRTUAL_NODE_TO_COMPUTER_RULE___CHECK_DEC_FWD__CONTAINER_NETWORKSPAN:
			return checkDEC_FWD((Container) arguments.get(0), (NetworkSpan) arguments.get(1));
		case RulesPackage.VIRTUAL_NODE_TO_COMPUTER_RULE___CHECK_DEC_BWD__ROUTER_CABLE_CONTAINER_COMPUTER:
			return checkDEC_BWD((Router) arguments.get(0), (Cable) arguments.get(1),
					(implementation.Container) arguments.get(2), (Computer) arguments.get(3));
		case RulesPackage.VIRTUAL_NODE_TO_COMPUTER_RULE___GENERATE_MODEL__RULEENTRYCONTAINER_VIRTUALNODETOROUTER:
			return generateModel((RuleEntryContainer) arguments.get(0), (VirtualNodeToRouter) arguments.get(1));
		case RulesPackage.VIRTUAL_NODE_TO_COMPUTER_RULE___GENERATE_MODEL_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_CONTAINER_ROUTER_VIRTUALNODETOROUTER_NETWORKSPAN_CABLE_REQCONTAINERTOIMPLCONTAINER_CONTAINER_MODELGENERATORRULERESULT:
			return generateModel_solveCsp_BWD((IsApplicableMatch) arguments.get(0), (Container) arguments.get(1),
					(Router) arguments.get(2), (VirtualNodeToRouter) arguments.get(3), (NetworkSpan) arguments.get(4),
					(Cable) arguments.get(5), (ReqContainerToImplContainer) arguments.get(6),
					(implementation.Container) arguments.get(7), (ModelgeneratorRuleResult) arguments.get(8));
		case RulesPackage.VIRTUAL_NODE_TO_COMPUTER_RULE___GENERATE_MODEL_CHECK_CSP_BWD__CSP:
			return generateModel_checkCsp_BWD((CSP) arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
	}

	public static final Object[] pattern_VirtualNodeToComputerRule_0_1_initialbindings_blackBBBB(
			VirtualNodeToComputerRule _this, Match match, Container reqContainer, NetworkSpan virtualNode) {
		return new Object[] { _this, match, reqContainer, virtualNode };
	}

	public static final Object[] pattern_VirtualNodeToComputerRule_0_2_SolveCSP_bindingFBBBB(
			VirtualNodeToComputerRule _this, Match match, Container reqContainer, NetworkSpan virtualNode) {
		CSP _localVariable_0 = _this.isAppropriate_solveCsp_FWD(match, reqContainer, virtualNode);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, match, reqContainer, virtualNode };
		}
		return null;
	}

	public static final Object[] pattern_VirtualNodeToComputerRule_0_2_SolveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_VirtualNodeToComputerRule_0_2_SolveCSP_bindingAndBlackFBBBB(
			VirtualNodeToComputerRule _this, Match match, Container reqContainer, NetworkSpan virtualNode) {
		Object[] result_pattern_VirtualNodeToComputerRule_0_2_SolveCSP_binding = pattern_VirtualNodeToComputerRule_0_2_SolveCSP_bindingFBBBB(
				_this, match, reqContainer, virtualNode);
		if (result_pattern_VirtualNodeToComputerRule_0_2_SolveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_VirtualNodeToComputerRule_0_2_SolveCSP_binding[0];

			Object[] result_pattern_VirtualNodeToComputerRule_0_2_SolveCSP_black = pattern_VirtualNodeToComputerRule_0_2_SolveCSP_blackB(
					csp);
			if (result_pattern_VirtualNodeToComputerRule_0_2_SolveCSP_black != null) {

				return new Object[] { csp, _this, match, reqContainer, virtualNode };
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
			Match match, Container reqContainer, NetworkSpan virtualNode) {
		return new Object[] { match, reqContainer, virtualNode };
	}

	public static final Object[] pattern_VirtualNodeToComputerRule_0_5_collectcontextelements_blackBBB(Match match,
			Container reqContainer, NetworkSpan virtualNode) {
		return new Object[] { match, reqContainer, virtualNode };
	}

	public static final Object[] pattern_VirtualNodeToComputerRule_0_5_collectcontextelements_greenBBBF(Match match,
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

	public static final void pattern_VirtualNodeToComputerRule_0_6_registerobjectstomatch_expressionBBBB(
			VirtualNodeToComputerRule _this, Match match, Container reqContainer, NetworkSpan virtualNode) {
		_this.registerObjectsToMatch_FWD(match, reqContainer, virtualNode);

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
			VirtualNodeToComputerRule _this, Match match, Router router, Cable cable,
			implementation.Container implContainer, Computer computer) {
		return new Object[] { _this, match, router, cable, implContainer, computer };
	}

	public static final Object[] pattern_VirtualNodeToComputerRule_7_2_SolveCSP_bindingFBBBBBB(
			VirtualNodeToComputerRule _this, Match match, Router router, Cable cable,
			implementation.Container implContainer, Computer computer) {
		CSP _localVariable_0 = _this.isAppropriate_solveCsp_BWD(match, router, cable, implContainer, computer);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, match, router, cable, implContainer, computer };
		}
		return null;
	}

	public static final Object[] pattern_VirtualNodeToComputerRule_7_2_SolveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_VirtualNodeToComputerRule_7_2_SolveCSP_bindingAndBlackFBBBBBB(
			VirtualNodeToComputerRule _this, Match match, Router router, Cable cable,
			implementation.Container implContainer, Computer computer) {
		Object[] result_pattern_VirtualNodeToComputerRule_7_2_SolveCSP_binding = pattern_VirtualNodeToComputerRule_7_2_SolveCSP_bindingFBBBBBB(
				_this, match, router, cable, implContainer, computer);
		if (result_pattern_VirtualNodeToComputerRule_7_2_SolveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_VirtualNodeToComputerRule_7_2_SolveCSP_binding[0];

			Object[] result_pattern_VirtualNodeToComputerRule_7_2_SolveCSP_black = pattern_VirtualNodeToComputerRule_7_2_SolveCSP_blackB(
					csp);
			if (result_pattern_VirtualNodeToComputerRule_7_2_SolveCSP_black != null) {

				return new Object[] { csp, _this, match, router, cable, implContainer, computer };
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
			Match match, Router router, Cable cable, implementation.Container implContainer, Computer computer) {
		return new Object[] { match, router, cable, implContainer, computer };
	}

	public static final Object[] pattern_VirtualNodeToComputerRule_7_4_collectelementstobetranslated_greenBBBBBFFFFF(
			Match match, Router router, Cable cable, implementation.Container implContainer, Computer computer) {
		EMoflonEdge router__cable____outgoing = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge cable__router____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge computer__cable____incoming = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge cable__computer____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge implContainer__computer____devices = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		match.getToBeTranslatedNodes().add(computer);
		String router__cable____outgoing_name_prime = "outgoing";
		String cable__router____source_name_prime = "source";
		String computer__cable____incoming_name_prime = "incoming";
		String cable__computer____target_name_prime = "target";
		String implContainer__computer____devices_name_prime = "devices";
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
		implContainer__computer____devices.setSrc(implContainer);
		implContainer__computer____devices.setTrg(computer);
		match.getToBeTranslatedEdges().add(implContainer__computer____devices);
		router__cable____outgoing.setName(router__cable____outgoing_name_prime);
		cable__router____source.setName(cable__router____source_name_prime);
		computer__cable____incoming.setName(computer__cable____incoming_name_prime);
		cable__computer____target.setName(cable__computer____target_name_prime);
		implContainer__computer____devices.setName(implContainer__computer____devices_name_prime);
		return new Object[] { match, router, cable, implContainer, computer, router__cable____outgoing,
				cable__router____source, computer__cable____incoming, cable__computer____target,
				implContainer__computer____devices };
	}

	public static final Object[] pattern_VirtualNodeToComputerRule_7_5_collectcontextelements_blackBBBBB(Match match,
			Router router, Cable cable, implementation.Container implContainer, Computer computer) {
		return new Object[] { match, router, cable, implContainer, computer };
	}

	public static final Object[] pattern_VirtualNodeToComputerRule_7_5_collectcontextelements_greenBBBBFF(Match match,
			Router router, Cable cable, implementation.Container implContainer) {
		EMoflonEdge implContainer__cable____cables = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge implContainer__router____devices = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		match.getContextNodes().add(router);
		match.getContextNodes().add(cable);
		match.getContextNodes().add(implContainer);
		String implContainer__cable____cables_name_prime = "cables";
		String implContainer__router____devices_name_prime = "devices";
		implContainer__cable____cables.setSrc(implContainer);
		implContainer__cable____cables.setTrg(cable);
		match.getContextEdges().add(implContainer__cable____cables);
		implContainer__router____devices.setSrc(implContainer);
		implContainer__router____devices.setTrg(router);
		match.getContextEdges().add(implContainer__router____devices);
		implContainer__cable____cables.setName(implContainer__cable____cables_name_prime);
		implContainer__router____devices.setName(implContainer__router____devices_name_prime);
		return new Object[] { match, router, cable, implContainer, implContainer__cable____cables,
				implContainer__router____devices };
	}

	public static final void pattern_VirtualNodeToComputerRule_7_6_registerobjectstomatch_expressionBBBBBB(
			VirtualNodeToComputerRule _this, Match match, Router router, Cable cable,
			implementation.Container implContainer, Computer computer) {
		_this.registerObjectsToMatch_BWD(match, router, cable, implContainer, computer);

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
		EObject _localVariable_0 = isApplicableMatch.getObject("reqContainer");
		EObject _localVariable_1 = isApplicableMatch.getObject("router");
		EObject _localVariable_2 = isApplicableMatch.getObject("virtualNodeToRouter");
		EObject _localVariable_3 = isApplicableMatch.getObject("virtualNode");
		EObject _localVariable_4 = isApplicableMatch.getObject("cable");
		EObject _localVariable_5 = isApplicableMatch.getObject("reqContainerToImplContainer");
		EObject _localVariable_6 = isApplicableMatch.getObject("implContainer");
		EObject _localVariable_7 = isApplicableMatch.getObject("computer");
		EObject tmpReqContainer = _localVariable_0;
		EObject tmpRouter = _localVariable_1;
		EObject tmpVirtualNodeToRouter = _localVariable_2;
		EObject tmpVirtualNode = _localVariable_3;
		EObject tmpCable = _localVariable_4;
		EObject tmpReqContainerToImplContainer = _localVariable_5;
		EObject tmpImplContainer = _localVariable_6;
		EObject tmpComputer = _localVariable_7;
		if (tmpReqContainer instanceof Container) {
			Container reqContainer = (Container) tmpReqContainer;
			if (tmpRouter instanceof Router) {
				Router router = (Router) tmpRouter;
				if (tmpVirtualNodeToRouter instanceof VirtualNodeToRouter) {
					VirtualNodeToRouter virtualNodeToRouter = (VirtualNodeToRouter) tmpVirtualNodeToRouter;
					if (tmpVirtualNode instanceof NetworkSpan) {
						NetworkSpan virtualNode = (NetworkSpan) tmpVirtualNode;
						if (tmpCable instanceof Cable) {
							Cable cable = (Cable) tmpCable;
							if (tmpReqContainerToImplContainer instanceof ReqContainerToImplContainer) {
								ReqContainerToImplContainer reqContainerToImplContainer = (ReqContainerToImplContainer) tmpReqContainerToImplContainer;
								if (tmpImplContainer instanceof implementation.Container) {
									implementation.Container implContainer = (implementation.Container) tmpImplContainer;
									if (tmpComputer instanceof Computer) {
										Computer computer = (Computer) tmpComputer;
										return new Object[] { reqContainer, router, virtualNodeToRouter, virtualNode,
												cable, reqContainerToImplContainer, implContainer, computer,
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
			Container reqContainer, Router router, VirtualNodeToRouter virtualNodeToRouter, NetworkSpan virtualNode,
			Cable cable, ReqContainerToImplContainer reqContainerToImplContainer,
			implementation.Container implContainer, Computer computer, VirtualNodeToComputerRule _this,
			IsApplicableMatch isApplicableMatch) {
		for (EObject tmpCsp : isApplicableMatch.getAttributeInfo()) {
			if (tmpCsp instanceof CSP) {
				CSP csp = (CSP) tmpCsp;
				return new Object[] { reqContainer, router, virtualNodeToRouter, virtualNode, cable,
						reqContainerToImplContainer, implContainer, computer, csp, _this, isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_VirtualNodeToComputerRule_8_1_performtransformation_bindingAndBlackFFFFFFFFFBB(
			VirtualNodeToComputerRule _this, IsApplicableMatch isApplicableMatch) {
		Object[] result_pattern_VirtualNodeToComputerRule_8_1_performtransformation_binding = pattern_VirtualNodeToComputerRule_8_1_performtransformation_bindingFFFFFFFFB(
				isApplicableMatch);
		if (result_pattern_VirtualNodeToComputerRule_8_1_performtransformation_binding != null) {
			Container reqContainer = (Container) result_pattern_VirtualNodeToComputerRule_8_1_performtransformation_binding[0];
			Router router = (Router) result_pattern_VirtualNodeToComputerRule_8_1_performtransformation_binding[1];
			VirtualNodeToRouter virtualNodeToRouter = (VirtualNodeToRouter) result_pattern_VirtualNodeToComputerRule_8_1_performtransformation_binding[2];
			NetworkSpan virtualNode = (NetworkSpan) result_pattern_VirtualNodeToComputerRule_8_1_performtransformation_binding[3];
			Cable cable = (Cable) result_pattern_VirtualNodeToComputerRule_8_1_performtransformation_binding[4];
			ReqContainerToImplContainer reqContainerToImplContainer = (ReqContainerToImplContainer) result_pattern_VirtualNodeToComputerRule_8_1_performtransformation_binding[5];
			implementation.Container implContainer = (implementation.Container) result_pattern_VirtualNodeToComputerRule_8_1_performtransformation_binding[6];
			Computer computer = (Computer) result_pattern_VirtualNodeToComputerRule_8_1_performtransformation_binding[7];

			Object[] result_pattern_VirtualNodeToComputerRule_8_1_performtransformation_black = pattern_VirtualNodeToComputerRule_8_1_performtransformation_blackBBBBBBBBFBB(
					reqContainer, router, virtualNodeToRouter, virtualNode, cable, reqContainerToImplContainer,
					implContainer, computer, _this, isApplicableMatch);
			if (result_pattern_VirtualNodeToComputerRule_8_1_performtransformation_black != null) {
				CSP csp = (CSP) result_pattern_VirtualNodeToComputerRule_8_1_performtransformation_black[8];

				return new Object[] { reqContainer, router, virtualNodeToRouter, virtualNode, cable,
						reqContainerToImplContainer, implContainer, computer, csp, _this, isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_VirtualNodeToComputerRule_8_1_performtransformation_greenFBB(
			NetworkSpan virtualNode, Computer computer) {
		VirtualNodeToComputer virtualNodeToComputer = ReqToImpTransformatorFactory.eINSTANCE
				.createVirtualNodeToComputer();
		virtualNodeToComputer.setSource(virtualNode);
		virtualNodeToComputer.setTarget(computer);
		return new Object[] { virtualNodeToComputer, virtualNode, computer };
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
			PerformRuleResult ruleresult, EObject reqContainer, EObject router, EObject virtualNodeToRouter,
			EObject virtualNodeToComputer, EObject virtualNode, EObject cable, EObject reqContainerToImplContainer,
			EObject implContainer, EObject computer) {
		if (!reqContainer.equals(router)) {
			if (!reqContainer.equals(virtualNodeToRouter)) {
				if (!reqContainer.equals(virtualNodeToComputer)) {
					if (!reqContainer.equals(virtualNode)) {
						if (!reqContainer.equals(reqContainerToImplContainer)) {
							if (!router.equals(virtualNodeToRouter)) {
								if (!router.equals(virtualNodeToComputer)) {
									if (!router.equals(virtualNode)) {
										if (!virtualNodeToComputer.equals(virtualNodeToRouter)) {
											if (!virtualNode.equals(virtualNodeToRouter)) {
												if (!virtualNode.equals(virtualNodeToComputer)) {
													if (!cable.equals(reqContainer)) {
														if (!cable.equals(router)) {
															if (!cable.equals(virtualNodeToRouter)) {
																if (!cable.equals(virtualNodeToComputer)) {
																	if (!cable.equals(virtualNode)) {
																		if (!cable
																				.equals(reqContainerToImplContainer)) {
																			if (!cable.equals(implContainer)) {
																				if (!cable.equals(computer)) {
																					if (!reqContainerToImplContainer
																							.equals(router)) {
																						if (!reqContainerToImplContainer
																								.equals(virtualNodeToRouter)) {
																							if (!reqContainerToImplContainer
																									.equals(virtualNodeToComputer)) {
																								if (!reqContainerToImplContainer
																										.equals(virtualNode)) {
																									if (!implContainer
																											.equals(reqContainer)) {
																										if (!implContainer
																												.equals(router)) {
																											if (!implContainer
																													.equals(virtualNodeToRouter)) {
																												if (!implContainer
																														.equals(virtualNodeToComputer)) {
																													if (!implContainer
																															.equals(virtualNode)) {
																														if (!implContainer
																																.equals(reqContainerToImplContainer)) {
																															if (!computer
																																	.equals(reqContainer)) {
																																if (!computer
																																		.equals(router)) {
																																	if (!computer
																																			.equals(virtualNodeToRouter)) {
																																		if (!computer
																																				.equals(virtualNodeToComputer)) {
																																			if (!computer
																																					.equals(virtualNode)) {
																																				if (!computer
																																						.equals(reqContainerToImplContainer)) {
																																					if (!computer
																																							.equals(implContainer)) {
																																						return new Object[] {
																																								ruleresult,
																																								reqContainer,
																																								router,
																																								virtualNodeToRouter,
																																								virtualNodeToComputer,
																																								virtualNode,
																																								cable,
																																								reqContainerToImplContainer,
																																								implContainer,
																																								computer };
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
			PerformRuleResult ruleresult, EObject router, EObject virtualNodeToComputer, EObject virtualNode,
			EObject cable, EObject implContainer, EObject computer) {
		EMoflonEdge router__cable____outgoing = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge cable__router____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge virtualNodeToComputer__virtualNode____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge virtualNodeToComputer__computer____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge computer__cable____incoming = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge cable__computer____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge implContainer__computer____devices = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String ruleresult_ruleName_prime = "VirtualNodeToComputerRule";
		String router__cable____outgoing_name_prime = "outgoing";
		String cable__router____source_name_prime = "source";
		String virtualNodeToComputer__virtualNode____source_name_prime = "source";
		String virtualNodeToComputer__computer____target_name_prime = "target";
		String computer__cable____incoming_name_prime = "incoming";
		String cable__computer____target_name_prime = "target";
		String implContainer__computer____devices_name_prime = "devices";
		router__cable____outgoing.setSrc(router);
		router__cable____outgoing.setTrg(cable);
		ruleresult.getTranslatedEdges().add(router__cable____outgoing);
		cable__router____source.setSrc(cable);
		cable__router____source.setTrg(router);
		ruleresult.getTranslatedEdges().add(cable__router____source);
		virtualNodeToComputer__virtualNode____source.setSrc(virtualNodeToComputer);
		virtualNodeToComputer__virtualNode____source.setTrg(virtualNode);
		ruleresult.getCreatedEdges().add(virtualNodeToComputer__virtualNode____source);
		virtualNodeToComputer__computer____target.setSrc(virtualNodeToComputer);
		virtualNodeToComputer__computer____target.setTrg(computer);
		ruleresult.getCreatedEdges().add(virtualNodeToComputer__computer____target);
		computer__cable____incoming.setSrc(computer);
		computer__cable____incoming.setTrg(cable);
		ruleresult.getTranslatedEdges().add(computer__cable____incoming);
		cable__computer____target.setSrc(cable);
		cable__computer____target.setTrg(computer);
		ruleresult.getTranslatedEdges().add(cable__computer____target);
		implContainer__computer____devices.setSrc(implContainer);
		implContainer__computer____devices.setTrg(computer);
		ruleresult.getTranslatedEdges().add(implContainer__computer____devices);
		ruleresult.setRuleName(ruleresult_ruleName_prime);
		router__cable____outgoing.setName(router__cable____outgoing_name_prime);
		cable__router____source.setName(cable__router____source_name_prime);
		virtualNodeToComputer__virtualNode____source.setName(virtualNodeToComputer__virtualNode____source_name_prime);
		virtualNodeToComputer__computer____target.setName(virtualNodeToComputer__computer____target_name_prime);
		computer__cable____incoming.setName(computer__cable____incoming_name_prime);
		cable__computer____target.setName(cable__computer____target_name_prime);
		implContainer__computer____devices.setName(implContainer__computer____devices_name_prime);
		return new Object[] { ruleresult, router, virtualNodeToComputer, virtualNode, cable, implContainer, computer,
				router__cable____outgoing, cable__router____source, virtualNodeToComputer__virtualNode____source,
				virtualNodeToComputer__computer____target, computer__cable____incoming, cable__computer____target,
				implContainer__computer____devices };
	}

	public static final void pattern_VirtualNodeToComputerRule_8_5_registerobjects_expressionBBBBBBBBBBB(
			VirtualNodeToComputerRule _this, PerformRuleResult ruleresult, EObject reqContainer, EObject router,
			EObject virtualNodeToRouter, EObject virtualNodeToComputer, EObject virtualNode, EObject cable,
			EObject reqContainerToImplContainer, EObject implContainer, EObject computer) {
		_this.registerObjects_BWD(ruleresult, reqContainer, router, virtualNodeToRouter, virtualNodeToComputer,
				virtualNode, cable, reqContainerToImplContainer, implContainer, computer);

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
		EObject _localVariable_0 = match.getObject("router");
		EObject _localVariable_1 = match.getObject("cable");
		EObject _localVariable_2 = match.getObject("implContainer");
		EObject _localVariable_3 = match.getObject("computer");
		EObject tmpRouter = _localVariable_0;
		EObject tmpCable = _localVariable_1;
		EObject tmpImplContainer = _localVariable_2;
		EObject tmpComputer = _localVariable_3;
		if (tmpRouter instanceof Router) {
			Router router = (Router) tmpRouter;
			if (tmpCable instanceof Cable) {
				Cable cable = (Cable) tmpCable;
				if (tmpImplContainer instanceof implementation.Container) {
					implementation.Container implContainer = (implementation.Container) tmpImplContainer;
					if (tmpComputer instanceof Computer) {
						Computer computer = (Computer) tmpComputer;
						return new Object[] { router, cable, implContainer, computer, match };
					}
				}
			}
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_VirtualNodeToComputerRule_9_2_corematch_blackFBFFBFBBB(Router router,
			Cable cable, implementation.Container implContainer, Computer computer, Match match) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		for (VirtualNodeToRouter virtualNodeToRouter : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(router, VirtualNodeToRouter.class, "target")) {
			NetworkSpan virtualNode = virtualNodeToRouter.getSource();
			if (virtualNode != null) {
				for (ReqContainerToImplContainer reqContainerToImplContainer : org.moflon.core.utilities.eMoflonEMFUtil
						.getOppositeReferenceTyped(implContainer, ReqContainerToImplContainer.class, "target")) {
					Container reqContainer = reqContainerToImplContainer.getSource();
					if (reqContainer != null) {
						_result.add(new Object[] { reqContainer, router, virtualNodeToRouter, virtualNode, cable,
								reqContainerToImplContainer, implContainer, computer, match });
					}

				}
			}

		}
		return _result;
	}

	public static final Iterable<Object[]> pattern_VirtualNodeToComputerRule_9_3_findcontext_blackBBBBBBBB(
			Container reqContainer, Router router, VirtualNodeToRouter virtualNodeToRouter, NetworkSpan virtualNode,
			Cable cable, ReqContainerToImplContainer reqContainerToImplContainer,
			implementation.Container implContainer, Computer computer) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (router.getOutgoing().contains(cable)) {
			if (virtualNode.equals(reqContainer.getNetworkSpan())) {
				if (reqContainer.equals(reqContainerToImplContainer.getSource())) {
					if (virtualNode.equals(virtualNodeToRouter.getSource())) {
						if (router.equals(virtualNodeToRouter.getTarget())) {
							if (implContainer.equals(reqContainerToImplContainer.getTarget())) {
								if (implContainer.getCables().contains(cable)) {
									if (implContainer.getDevices().contains(router)) {
										if (computer.getIncoming().contains(cable)) {
											if (implContainer.getDevices().contains(computer)) {
												_result.add(new Object[] { reqContainer, router, virtualNodeToRouter,
														virtualNode, cable, reqContainerToImplContainer, implContainer,
														computer });
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
			Container reqContainer, Router router, VirtualNodeToRouter virtualNodeToRouter, NetworkSpan virtualNode,
			Cable cable, ReqContainerToImplContainer reqContainerToImplContainer,
			implementation.Container implContainer, Computer computer) {
		IsApplicableMatch isApplicableMatch = RuntimeFactory.eINSTANCE.createIsApplicableMatch();
		EMoflonEdge router__cable____outgoing = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge cable__router____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge reqContainer__virtualNode____networkSpan = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge reqContainerToImplContainer__reqContainer____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge virtualNodeToRouter__virtualNode____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge virtualNodeToRouter__router____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge reqContainerToImplContainer__implContainer____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge implContainer__cable____cables = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge implContainer__router____devices = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge computer__cable____incoming = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge cable__computer____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge implContainer__computer____devices = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String router__cable____outgoing_name_prime = "outgoing";
		String cable__router____source_name_prime = "source";
		String reqContainer__virtualNode____networkSpan_name_prime = "networkSpan";
		String reqContainerToImplContainer__reqContainer____source_name_prime = "source";
		String virtualNodeToRouter__virtualNode____source_name_prime = "source";
		String virtualNodeToRouter__router____target_name_prime = "target";
		String reqContainerToImplContainer__implContainer____target_name_prime = "target";
		String implContainer__cable____cables_name_prime = "cables";
		String implContainer__router____devices_name_prime = "devices";
		String computer__cable____incoming_name_prime = "incoming";
		String cable__computer____target_name_prime = "target";
		String implContainer__computer____devices_name_prime = "devices";
		isApplicableMatch.getAllContextElements().add(reqContainer);
		isApplicableMatch.getAllContextElements().add(router);
		isApplicableMatch.getAllContextElements().add(virtualNodeToRouter);
		isApplicableMatch.getAllContextElements().add(virtualNode);
		isApplicableMatch.getAllContextElements().add(cable);
		isApplicableMatch.getAllContextElements().add(reqContainerToImplContainer);
		isApplicableMatch.getAllContextElements().add(implContainer);
		isApplicableMatch.getAllContextElements().add(computer);
		router__cable____outgoing.setSrc(router);
		router__cable____outgoing.setTrg(cable);
		isApplicableMatch.getAllContextElements().add(router__cable____outgoing);
		cable__router____source.setSrc(cable);
		cable__router____source.setTrg(router);
		isApplicableMatch.getAllContextElements().add(cable__router____source);
		reqContainer__virtualNode____networkSpan.setSrc(reqContainer);
		reqContainer__virtualNode____networkSpan.setTrg(virtualNode);
		isApplicableMatch.getAllContextElements().add(reqContainer__virtualNode____networkSpan);
		reqContainerToImplContainer__reqContainer____source.setSrc(reqContainerToImplContainer);
		reqContainerToImplContainer__reqContainer____source.setTrg(reqContainer);
		isApplicableMatch.getAllContextElements().add(reqContainerToImplContainer__reqContainer____source);
		virtualNodeToRouter__virtualNode____source.setSrc(virtualNodeToRouter);
		virtualNodeToRouter__virtualNode____source.setTrg(virtualNode);
		isApplicableMatch.getAllContextElements().add(virtualNodeToRouter__virtualNode____source);
		virtualNodeToRouter__router____target.setSrc(virtualNodeToRouter);
		virtualNodeToRouter__router____target.setTrg(router);
		isApplicableMatch.getAllContextElements().add(virtualNodeToRouter__router____target);
		reqContainerToImplContainer__implContainer____target.setSrc(reqContainerToImplContainer);
		reqContainerToImplContainer__implContainer____target.setTrg(implContainer);
		isApplicableMatch.getAllContextElements().add(reqContainerToImplContainer__implContainer____target);
		implContainer__cable____cables.setSrc(implContainer);
		implContainer__cable____cables.setTrg(cable);
		isApplicableMatch.getAllContextElements().add(implContainer__cable____cables);
		implContainer__router____devices.setSrc(implContainer);
		implContainer__router____devices.setTrg(router);
		isApplicableMatch.getAllContextElements().add(implContainer__router____devices);
		computer__cable____incoming.setSrc(computer);
		computer__cable____incoming.setTrg(cable);
		isApplicableMatch.getAllContextElements().add(computer__cable____incoming);
		cable__computer____target.setSrc(cable);
		cable__computer____target.setTrg(computer);
		isApplicableMatch.getAllContextElements().add(cable__computer____target);
		implContainer__computer____devices.setSrc(implContainer);
		implContainer__computer____devices.setTrg(computer);
		isApplicableMatch.getAllContextElements().add(implContainer__computer____devices);
		router__cable____outgoing.setName(router__cable____outgoing_name_prime);
		cable__router____source.setName(cable__router____source_name_prime);
		reqContainer__virtualNode____networkSpan.setName(reqContainer__virtualNode____networkSpan_name_prime);
		reqContainerToImplContainer__reqContainer____source
				.setName(reqContainerToImplContainer__reqContainer____source_name_prime);
		virtualNodeToRouter__virtualNode____source.setName(virtualNodeToRouter__virtualNode____source_name_prime);
		virtualNodeToRouter__router____target.setName(virtualNodeToRouter__router____target_name_prime);
		reqContainerToImplContainer__implContainer____target
				.setName(reqContainerToImplContainer__implContainer____target_name_prime);
		implContainer__cable____cables.setName(implContainer__cable____cables_name_prime);
		implContainer__router____devices.setName(implContainer__router____devices_name_prime);
		computer__cable____incoming.setName(computer__cable____incoming_name_prime);
		cable__computer____target.setName(cable__computer____target_name_prime);
		implContainer__computer____devices.setName(implContainer__computer____devices_name_prime);
		return new Object[] { reqContainer, router, virtualNodeToRouter, virtualNode, cable,
				reqContainerToImplContainer, implContainer, computer, isApplicableMatch, router__cable____outgoing,
				cable__router____source, reqContainer__virtualNode____networkSpan,
				reqContainerToImplContainer__reqContainer____source, virtualNodeToRouter__virtualNode____source,
				virtualNodeToRouter__router____target, reqContainerToImplContainer__implContainer____target,
				implContainer__cable____cables, implContainer__router____devices, computer__cable____incoming,
				cable__computer____target, implContainer__computer____devices };
	}

	public static final Object[] pattern_VirtualNodeToComputerRule_9_4_solveCSP_bindingFBBBBBBBBBB(
			VirtualNodeToComputerRule _this, IsApplicableMatch isApplicableMatch, Container reqContainer, Router router,
			VirtualNodeToRouter virtualNodeToRouter, NetworkSpan virtualNode, Cable cable,
			ReqContainerToImplContainer reqContainerToImplContainer, implementation.Container implContainer,
			Computer computer) {
		CSP _localVariable_0 = _this.isApplicable_solveCsp_BWD(isApplicableMatch, reqContainer, router,
				virtualNodeToRouter, virtualNode, cable, reqContainerToImplContainer, implContainer, computer);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, reqContainer, router, virtualNodeToRouter, virtualNode,
					cable, reqContainerToImplContainer, implContainer, computer };
		}
		return null;
	}

	public static final Object[] pattern_VirtualNodeToComputerRule_9_4_solveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_VirtualNodeToComputerRule_9_4_solveCSP_bindingAndBlackFBBBBBBBBBB(
			VirtualNodeToComputerRule _this, IsApplicableMatch isApplicableMatch, Container reqContainer, Router router,
			VirtualNodeToRouter virtualNodeToRouter, NetworkSpan virtualNode, Cable cable,
			ReqContainerToImplContainer reqContainerToImplContainer, implementation.Container implContainer,
			Computer computer) {
		Object[] result_pattern_VirtualNodeToComputerRule_9_4_solveCSP_binding = pattern_VirtualNodeToComputerRule_9_4_solveCSP_bindingFBBBBBBBBBB(
				_this, isApplicableMatch, reqContainer, router, virtualNodeToRouter, virtualNode, cable,
				reqContainerToImplContainer, implContainer, computer);
		if (result_pattern_VirtualNodeToComputerRule_9_4_solveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_VirtualNodeToComputerRule_9_4_solveCSP_binding[0];

			Object[] result_pattern_VirtualNodeToComputerRule_9_4_solveCSP_black = pattern_VirtualNodeToComputerRule_9_4_solveCSP_blackB(
					csp);
			if (result_pattern_VirtualNodeToComputerRule_9_4_solveCSP_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, reqContainer, router, virtualNodeToRouter,
						virtualNode, cable, reqContainerToImplContainer, implContainer, computer };
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
			Container reqContainer) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		NetworkSpan virtualNode = reqContainer.getNetworkSpan();
		if (virtualNode != null) {
			_result.add(new Object[] { reqContainer, virtualNode });
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
			VirtualNodeToComputerRule _this, Match match, Container reqContainer, NetworkSpan virtualNode) {
		boolean _localVariable_0 = _this.isAppropriate_FWD(match, reqContainer, virtualNode);
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
			EMoflonEdge _edge_outgoing) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		EObject tmpRouter = _edge_outgoing.getSrc();
		if (tmpRouter instanceof Router) {
			Router router = (Router) tmpRouter;
			EObject tmpCable = _edge_outgoing.getTrg();
			if (tmpCable instanceof Cable) {
				Cable cable = (Cable) tmpCable;
				if (router.getOutgoing().contains(cable)) {
					Device tmpComputer = cable.getTarget();
					if (tmpComputer instanceof Computer) {
						Computer computer = (Computer) tmpComputer;
						for (implementation.Container implContainer : org.moflon.core.utilities.eMoflonEMFUtil
								.getOppositeReferenceTyped(router, implementation.Container.class, "devices")) {
							if (implContainer.getCables().contains(cable)) {
								if (implContainer.getDevices().contains(computer)) {
									_result.add(
											new Object[] { router, cable, implContainer, computer, _edge_outgoing });
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
			VirtualNodeToComputerRule _this, Match match, Router router, Cable cable,
			implementation.Container implContainer, Computer computer) {
		boolean _localVariable_0 = _this.isAppropriate_BWD(match, router, cable, implContainer, computer);
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
		EObject _localVariable_0 = sourceMatch.getObject("reqContainer");
		EObject _localVariable_1 = targetMatch.getObject("router");
		EObject _localVariable_2 = sourceMatch.getObject("virtualNode");
		EObject _localVariable_3 = targetMatch.getObject("cable");
		EObject _localVariable_4 = targetMatch.getObject("implContainer");
		EObject _localVariable_5 = targetMatch.getObject("computer");
		EObject tmpReqContainer = _localVariable_0;
		EObject tmpRouter = _localVariable_1;
		EObject tmpVirtualNode = _localVariable_2;
		EObject tmpCable = _localVariable_3;
		EObject tmpImplContainer = _localVariable_4;
		EObject tmpComputer = _localVariable_5;
		if (tmpReqContainer instanceof Container) {
			Container reqContainer = (Container) tmpReqContainer;
			if (tmpRouter instanceof Router) {
				Router router = (Router) tmpRouter;
				if (tmpVirtualNode instanceof NetworkSpan) {
					NetworkSpan virtualNode = (NetworkSpan) tmpVirtualNode;
					if (tmpCable instanceof Cable) {
						Cable cable = (Cable) tmpCable;
						if (tmpImplContainer instanceof implementation.Container) {
							implementation.Container implContainer = (implementation.Container) tmpImplContainer;
							if (tmpComputer instanceof Computer) {
								Computer computer = (Computer) tmpComputer;
								return new Object[] { reqContainer, router, virtualNode, cable, implContainer, computer,
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
			Container reqContainer, Router router, NetworkSpan virtualNode, Cable cable,
			implementation.Container implContainer, Computer computer, Match sourceMatch, Match targetMatch) {
		if (!sourceMatch.equals(targetMatch)) {
			return new Object[] { reqContainer, router, virtualNode, cable, implContainer, computer, sourceMatch,
					targetMatch };
		}
		return null;
	}

	public static final Object[] pattern_VirtualNodeToComputerRule_21_2_matchsrctrgcontext_bindingAndBlackFFFFFFBB(
			Match sourceMatch, Match targetMatch) {
		Object[] result_pattern_VirtualNodeToComputerRule_21_2_matchsrctrgcontext_binding = pattern_VirtualNodeToComputerRule_21_2_matchsrctrgcontext_bindingFFFFFFBB(
				sourceMatch, targetMatch);
		if (result_pattern_VirtualNodeToComputerRule_21_2_matchsrctrgcontext_binding != null) {
			Container reqContainer = (Container) result_pattern_VirtualNodeToComputerRule_21_2_matchsrctrgcontext_binding[0];
			Router router = (Router) result_pattern_VirtualNodeToComputerRule_21_2_matchsrctrgcontext_binding[1];
			NetworkSpan virtualNode = (NetworkSpan) result_pattern_VirtualNodeToComputerRule_21_2_matchsrctrgcontext_binding[2];
			Cable cable = (Cable) result_pattern_VirtualNodeToComputerRule_21_2_matchsrctrgcontext_binding[3];
			implementation.Container implContainer = (implementation.Container) result_pattern_VirtualNodeToComputerRule_21_2_matchsrctrgcontext_binding[4];
			Computer computer = (Computer) result_pattern_VirtualNodeToComputerRule_21_2_matchsrctrgcontext_binding[5];

			Object[] result_pattern_VirtualNodeToComputerRule_21_2_matchsrctrgcontext_black = pattern_VirtualNodeToComputerRule_21_2_matchsrctrgcontext_blackBBBBBBBB(
					reqContainer, router, virtualNode, cable, implContainer, computer, sourceMatch, targetMatch);
			if (result_pattern_VirtualNodeToComputerRule_21_2_matchsrctrgcontext_black != null) {

				return new Object[] { reqContainer, router, virtualNode, cable, implContainer, computer, sourceMatch,
						targetMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_VirtualNodeToComputerRule_21_3_solvecsp_bindingFBBBBBBBBB(
			VirtualNodeToComputerRule _this, Container reqContainer, Router router, NetworkSpan virtualNode,
			Cable cable, implementation.Container implContainer, Computer computer, Match sourceMatch,
			Match targetMatch) {
		CSP _localVariable_6 = _this.isApplicable_solveCsp_CC(reqContainer, router, virtualNode, cable, implContainer,
				computer, sourceMatch, targetMatch);
		CSP csp = _localVariable_6;
		if (csp != null) {
			return new Object[] { csp, _this, reqContainer, router, virtualNode, cable, implContainer, computer,
					sourceMatch, targetMatch };
		}
		return null;
	}

	public static final Object[] pattern_VirtualNodeToComputerRule_21_3_solvecsp_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_VirtualNodeToComputerRule_21_3_solvecsp_bindingAndBlackFBBBBBBBBB(
			VirtualNodeToComputerRule _this, Container reqContainer, Router router, NetworkSpan virtualNode,
			Cable cable, implementation.Container implContainer, Computer computer, Match sourceMatch,
			Match targetMatch) {
		Object[] result_pattern_VirtualNodeToComputerRule_21_3_solvecsp_binding = pattern_VirtualNodeToComputerRule_21_3_solvecsp_bindingFBBBBBBBBB(
				_this, reqContainer, router, virtualNode, cable, implContainer, computer, sourceMatch, targetMatch);
		if (result_pattern_VirtualNodeToComputerRule_21_3_solvecsp_binding != null) {
			CSP csp = (CSP) result_pattern_VirtualNodeToComputerRule_21_3_solvecsp_binding[0];

			Object[] result_pattern_VirtualNodeToComputerRule_21_3_solvecsp_black = pattern_VirtualNodeToComputerRule_21_3_solvecsp_blackB(
					csp);
			if (result_pattern_VirtualNodeToComputerRule_21_3_solvecsp_black != null) {

				return new Object[] { csp, _this, reqContainer, router, virtualNode, cable, implContainer, computer,
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

	public static final Iterable<Object[]> pattern_VirtualNodeToComputerRule_21_5_matchcorrcontext_blackBBFBFBBB(
			Container reqContainer, Router router, NetworkSpan virtualNode, implementation.Container implContainer,
			Match sourceMatch, Match targetMatch) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (!sourceMatch.equals(targetMatch)) {
			for (ReqContainerToImplContainer reqContainerToImplContainer : org.moflon.core.utilities.eMoflonEMFUtil
					.getOppositeReferenceTyped(reqContainer, ReqContainerToImplContainer.class, "source")) {
				if (implContainer.equals(reqContainerToImplContainer.getTarget())) {
					for (VirtualNodeToRouter virtualNodeToRouter : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(virtualNode, VirtualNodeToRouter.class, "source")) {
						if (router.equals(virtualNodeToRouter.getTarget())) {
							_result.add(new Object[] { reqContainer, router, virtualNodeToRouter, virtualNode,
									reqContainerToImplContainer, implContainer, sourceMatch, targetMatch });
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
			Container reqContainer, Router router, NetworkSpan virtualNode, Cable cable,
			implementation.Container implContainer, Computer computer, CCMatch ccMatch) {
		return new Object[] { reqContainer, router, virtualNode, cable, implContainer, computer, ccMatch };
	}

	public static final Object[] pattern_VirtualNodeToComputerRule_21_6_createcorrespondence_greenFBBB(
			NetworkSpan virtualNode, Computer computer, CCMatch ccMatch) {
		VirtualNodeToComputer virtualNodeToComputer = ReqToImpTransformatorFactory.eINSTANCE
				.createVirtualNodeToComputer();
		virtualNodeToComputer.setSource(virtualNode);
		virtualNodeToComputer.setTarget(computer);
		ccMatch.getCreateCorr().add(virtualNodeToComputer);
		return new Object[] { virtualNodeToComputer, virtualNode, computer, ccMatch };
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

	public static final Object[] pattern_VirtualNodeToComputerRule_24_1_matchtggpattern_blackBB(Container reqContainer,
			NetworkSpan virtualNode) {
		if (virtualNode.equals(reqContainer.getNetworkSpan())) {
			return new Object[] { reqContainer, virtualNode };
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

	public static final Object[] pattern_VirtualNodeToComputerRule_25_1_matchtggpattern_blackBBBB(Router router,
			Cable cable, implementation.Container implContainer, Computer computer) {
		if (router.getOutgoing().contains(cable)) {
			if (implContainer.getCables().contains(cable)) {
				if (implContainer.getDevices().contains(router)) {
					if (computer.getIncoming().contains(cable)) {
						if (implContainer.getDevices().contains(computer)) {
							return new Object[] { router, cable, implContainer, computer };
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
			ModelgeneratorRuleResult ruleResult, Container reqContainer) {
		if (ruleResult.getSourceObjects().contains(reqContainer)) {
			return new Object[] { ruleResult, reqContainer };
		}
		return null;
	}

	public static final Object[] pattern_VirtualNodeToComputerRule_26_2_isapplicablecore_black_nac_1BB(
			ModelgeneratorRuleResult ruleResult, NetworkSpan virtualNode) {
		if (ruleResult.getSourceObjects().contains(virtualNode)) {
			return new Object[] { ruleResult, virtualNode };
		}
		return null;
	}

	public static final Object[] pattern_VirtualNodeToComputerRule_26_2_isapplicablecore_black_nac_2BB(
			ModelgeneratorRuleResult ruleResult, VirtualNodeToRouter virtualNodeToRouter) {
		if (ruleResult.getCorrObjects().contains(virtualNodeToRouter)) {
			return new Object[] { ruleResult, virtualNodeToRouter };
		}
		return null;
	}

	public static final Object[] pattern_VirtualNodeToComputerRule_26_2_isapplicablecore_black_nac_3BB(
			ModelgeneratorRuleResult ruleResult, Router router) {
		if (ruleResult.getTargetObjects().contains(router)) {
			return new Object[] { ruleResult, router };
		}
		return null;
	}

	public static final Object[] pattern_VirtualNodeToComputerRule_26_2_isapplicablecore_black_nac_4BB(
			ModelgeneratorRuleResult ruleResult, implementation.Container implContainer) {
		if (ruleResult.getTargetObjects().contains(implContainer)) {
			return new Object[] { ruleResult, implContainer };
		}
		return null;
	}

	public static final Object[] pattern_VirtualNodeToComputerRule_26_2_isapplicablecore_black_nac_5BB(
			ModelgeneratorRuleResult ruleResult, Cable cable) {
		if (ruleResult.getTargetObjects().contains(cable)) {
			return new Object[] { ruleResult, cable };
		}
		return null;
	}

	public static final Object[] pattern_VirtualNodeToComputerRule_26_2_isapplicablecore_black_nac_6BB(
			ModelgeneratorRuleResult ruleResult, ReqContainerToImplContainer reqContainerToImplContainer) {
		if (ruleResult.getCorrObjects().contains(reqContainerToImplContainer)) {
			return new Object[] { ruleResult, reqContainerToImplContainer };
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
							if (pattern_VirtualNodeToComputerRule_26_2_isapplicablecore_black_nac_2BB(ruleResult,
									virtualNodeToRouter) == null) {
								if (pattern_VirtualNodeToComputerRule_26_2_isapplicablecore_black_nac_1BB(ruleResult,
										virtualNode) == null) {
									if (pattern_VirtualNodeToComputerRule_26_2_isapplicablecore_black_nac_3BB(
											ruleResult, router) == null) {
										for (Container reqContainer : org.moflon.core.utilities.eMoflonEMFUtil
												.getOppositeReferenceTyped(virtualNode, Container.class,
														"networkSpan")) {
											if (pattern_VirtualNodeToComputerRule_26_2_isapplicablecore_black_nac_0BB(
													ruleResult, reqContainer) == null) {
												for (implementation.Container implContainer : org.moflon.core.utilities.eMoflonEMFUtil
														.getOppositeReferenceTyped(router,
																implementation.Container.class, "devices")) {
													if (pattern_VirtualNodeToComputerRule_26_2_isapplicablecore_black_nac_4BB(
															ruleResult, implContainer) == null) {
														for (Cable cable : implContainer.getCables()) {
															if (pattern_VirtualNodeToComputerRule_26_2_isapplicablecore_black_nac_5BB(
																	ruleResult, cable) == null) {
																for (ReqContainerToImplContainer reqContainerToImplContainer : org.moflon.core.utilities.eMoflonEMFUtil
																		.getOppositeReferenceTyped(reqContainer,
																				ReqContainerToImplContainer.class,
																				"source")) {
																	if (implContainer.equals(
																			reqContainerToImplContainer.getTarget())) {
																		if (pattern_VirtualNodeToComputerRule_26_2_isapplicablecore_black_nac_6BB(
																				ruleResult,
																				reqContainerToImplContainer) == null) {
																			_result.add(new Object[] {
																					virtualNodeToRouterList,
																					reqContainer, virtualNode,
																					virtualNodeToRouter, router,
																					implContainer, cable,
																					reqContainerToImplContainer,
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

	public static final Object[] pattern_VirtualNodeToComputerRule_26_3_solveCSP_bindingFBBBBBBBBBB(
			VirtualNodeToComputerRule _this, IsApplicableMatch isApplicableMatch, Container reqContainer, Router router,
			VirtualNodeToRouter virtualNodeToRouter, NetworkSpan virtualNode, Cable cable,
			ReqContainerToImplContainer reqContainerToImplContainer, implementation.Container implContainer,
			ModelgeneratorRuleResult ruleResult) {
		CSP _localVariable_0 = _this.generateModel_solveCsp_BWD(isApplicableMatch, reqContainer, router,
				virtualNodeToRouter, virtualNode, cable, reqContainerToImplContainer, implContainer, ruleResult);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, reqContainer, router, virtualNodeToRouter, virtualNode,
					cable, reqContainerToImplContainer, implContainer, ruleResult };
		}
		return null;
	}

	public static final Object[] pattern_VirtualNodeToComputerRule_26_3_solveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_VirtualNodeToComputerRule_26_3_solveCSP_bindingAndBlackFBBBBBBBBBB(
			VirtualNodeToComputerRule _this, IsApplicableMatch isApplicableMatch, Container reqContainer, Router router,
			VirtualNodeToRouter virtualNodeToRouter, NetworkSpan virtualNode, Cable cable,
			ReqContainerToImplContainer reqContainerToImplContainer, implementation.Container implContainer,
			ModelgeneratorRuleResult ruleResult) {
		Object[] result_pattern_VirtualNodeToComputerRule_26_3_solveCSP_binding = pattern_VirtualNodeToComputerRule_26_3_solveCSP_bindingFBBBBBBBBBB(
				_this, isApplicableMatch, reqContainer, router, virtualNodeToRouter, virtualNode, cable,
				reqContainerToImplContainer, implContainer, ruleResult);
		if (result_pattern_VirtualNodeToComputerRule_26_3_solveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_VirtualNodeToComputerRule_26_3_solveCSP_binding[0];

			Object[] result_pattern_VirtualNodeToComputerRule_26_3_solveCSP_black = pattern_VirtualNodeToComputerRule_26_3_solveCSP_blackB(
					csp);
			if (result_pattern_VirtualNodeToComputerRule_26_3_solveCSP_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, reqContainer, router, virtualNodeToRouter,
						virtualNode, cable, reqContainerToImplContainer, implContainer, ruleResult };
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

	public static final Object[] pattern_VirtualNodeToComputerRule_26_5_checknacs_blackBBBBBBB(Container reqContainer,
			Router router, VirtualNodeToRouter virtualNodeToRouter, NetworkSpan virtualNode, Cable cable,
			ReqContainerToImplContainer reqContainerToImplContainer, implementation.Container implContainer) {
		return new Object[] { reqContainer, router, virtualNodeToRouter, virtualNode, cable,
				reqContainerToImplContainer, implContainer };
	}

	public static final Object[] pattern_VirtualNodeToComputerRule_26_6_perform_blackBBBBBBBB(Container reqContainer,
			Router router, VirtualNodeToRouter virtualNodeToRouter, NetworkSpan virtualNode, Cable cable,
			ReqContainerToImplContainer reqContainerToImplContainer, implementation.Container implContainer,
			ModelgeneratorRuleResult ruleResult) {
		return new Object[] { reqContainer, router, virtualNodeToRouter, virtualNode, cable,
				reqContainerToImplContainer, implContainer, ruleResult };
	}

	public static final Object[] pattern_VirtualNodeToComputerRule_26_6_perform_greenBFBBBFB(Router router,
			NetworkSpan virtualNode, Cable cable, implementation.Container implContainer,
			ModelgeneratorRuleResult ruleResult) {
		VirtualNodeToComputer virtualNodeToComputer = ReqToImpTransformatorFactory.eINSTANCE
				.createVirtualNodeToComputer();
		Computer computer = ImplementationFactory.eINSTANCE.createComputer();
		router.getOutgoing().add(cable);
		boolean ruleResult_success_prime = Boolean.valueOf(true);
		int _localVariable_0 = ruleResult.getIncrementedPerformCount();
		virtualNodeToComputer.setSource(virtualNode);
		ruleResult.getCorrObjects().add(virtualNodeToComputer);
		virtualNodeToComputer.setTarget(computer);
		computer.getIncoming().add(cable);
		implContainer.getDevices().add(computer);
		ruleResult.getTargetObjects().add(computer);
		ruleResult.setSuccess(Boolean.valueOf(ruleResult_success_prime));
		int ruleResult_performCount_prime = Integer.valueOf(_localVariable_0);
		ruleResult.setPerformCount(Integer.valueOf(ruleResult_performCount_prime));
		return new Object[] { router, virtualNodeToComputer, virtualNode, cable, implContainer, computer, ruleResult };
	}

	public static final ModelgeneratorRuleResult pattern_VirtualNodeToComputerRule_26_7_expressionFB(
			ModelgeneratorRuleResult ruleResult) {
		ModelgeneratorRuleResult _result = ruleResult;
		return _result;
	}

	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} //VirtualNodeToComputerRuleImpl
