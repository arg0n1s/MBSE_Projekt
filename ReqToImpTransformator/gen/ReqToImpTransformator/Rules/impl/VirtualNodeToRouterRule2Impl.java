/**
 */
package ReqToImpTransformator.Rules.impl;

import ReqToImpTransformator.ReqContainerToImplContainer;
import ReqToImpTransformator.ReqToImpTransformatorFactory;

import ReqToImpTransformator.Rules.RulesPackage;
import ReqToImpTransformator.Rules.VirtualNodeToRouterRule2;

import ReqToImpTransformator.VirtualNodeToRouter;

import implementation.Cable;
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
 * An implementation of the model object '<em><b>Virtual Node To Router Rule2</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class VirtualNodeToRouterRule2Impl extends AbstractRuleImpl implements VirtualNodeToRouterRule2 {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VirtualNodeToRouterRule2Impl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RulesPackage.eINSTANCE.getVirtualNodeToRouterRule2();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAppropriate_FWD(Match match, Container reqContainer, NetworkSpan virtualNode) {

		Object[] result1_black = VirtualNodeToRouterRule2Impl
				.pattern_VirtualNodeToRouterRule2_0_1_initialbindings_blackBBBB(this, match, reqContainer, virtualNode);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[match] = " + match + ", " + "[reqContainer] = " + reqContainer + ", " + "[virtualNode] = "
					+ virtualNode + ".");
		}

		Object[] result2_bindingAndBlack = VirtualNodeToRouterRule2Impl
				.pattern_VirtualNodeToRouterRule2_0_2_SolveCSP_bindingAndBlackFBBBB(this, match, reqContainer,
						virtualNode);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[match] = " + match + ", " + "[reqContainer] = " + reqContainer + ", " + "[virtualNode] = "
					+ virtualNode + ".");
		}
		CSP csp = (CSP) result2_bindingAndBlack[0];
		// 
		if (VirtualNodeToRouterRule2Impl.pattern_VirtualNodeToRouterRule2_0_3_CheckCSP_expressionFBB(this, csp)) {

			Object[] result4_black = VirtualNodeToRouterRule2Impl
					.pattern_VirtualNodeToRouterRule2_0_4_collectelementstobetranslated_blackBBB(match, reqContainer,
							virtualNode);
			if (result4_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match + ", "
						+ "[reqContainer] = " + reqContainer + ", " + "[virtualNode] = " + virtualNode + ".");
			}

			Object[] result5_black = VirtualNodeToRouterRule2Impl
					.pattern_VirtualNodeToRouterRule2_0_5_collectcontextelements_blackBBB(match, reqContainer,
							virtualNode);
			if (result5_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match + ", "
						+ "[reqContainer] = " + reqContainer + ", " + "[virtualNode] = " + virtualNode + ".");
			}
			VirtualNodeToRouterRule2Impl.pattern_VirtualNodeToRouterRule2_0_5_collectcontextelements_greenBBBF(match,
					reqContainer, virtualNode);
			//nothing EMoflonEdge reqContainer__virtualNode____networkSpan = (EMoflonEdge) result5_green[3];

			// 
			VirtualNodeToRouterRule2Impl.pattern_VirtualNodeToRouterRule2_0_6_registerobjectstomatch_expressionBBBB(
					this, match, reqContainer, virtualNode);
			return VirtualNodeToRouterRule2Impl.pattern_VirtualNodeToRouterRule2_0_7_expressionF();
		} else {
			return VirtualNodeToRouterRule2Impl.pattern_VirtualNodeToRouterRule2_0_8_expressionF();
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
	public boolean isAppropriate_BWD(Match match, Router router2, Router router, implementation.Container implContainer,
			Cable cable) {

		Object[] result1_black = VirtualNodeToRouterRule2Impl
				.pattern_VirtualNodeToRouterRule2_7_1_initialbindings_blackBBBBBB(this, match, router2, router,
						implContainer, cable);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[match] = " + match + ", " + "[router2] = " + router2 + ", " + "[router] = " + router + ", "
					+ "[implContainer] = " + implContainer + ", " + "[cable] = " + cable + ".");
		}

		Object[] result2_bindingAndBlack = VirtualNodeToRouterRule2Impl
				.pattern_VirtualNodeToRouterRule2_7_2_SolveCSP_bindingAndBlackFBBBBBB(this, match, router2, router,
						implContainer, cable);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[match] = " + match + ", " + "[router2] = " + router2 + ", " + "[router] = " + router + ", "
					+ "[implContainer] = " + implContainer + ", " + "[cable] = " + cable + ".");
		}
		CSP csp = (CSP) result2_bindingAndBlack[0];
		// 
		if (VirtualNodeToRouterRule2Impl.pattern_VirtualNodeToRouterRule2_7_3_CheckCSP_expressionFBB(this, csp)) {

			Object[] result4_black = VirtualNodeToRouterRule2Impl
					.pattern_VirtualNodeToRouterRule2_7_4_collectelementstobetranslated_blackBBBBB(match, router2,
							router, implContainer, cable);
			if (result4_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match + ", "
						+ "[router2] = " + router2 + ", " + "[router] = " + router + ", " + "[implContainer] = "
						+ implContainer + ", " + "[cable] = " + cable + ".");
			}
			VirtualNodeToRouterRule2Impl
					.pattern_VirtualNodeToRouterRule2_7_4_collectelementstobetranslated_greenBBBBBFFFFF(match, router2,
							router, implContainer, cable);
			//nothing EMoflonEdge router2__cable____incoming = (EMoflonEdge) result4_green[5];
			//nothing EMoflonEdge cable__router2____target = (EMoflonEdge) result4_green[6];
			//nothing EMoflonEdge router__cable____outgoing = (EMoflonEdge) result4_green[7];
			//nothing EMoflonEdge cable__router____source = (EMoflonEdge) result4_green[8];
			//nothing EMoflonEdge implContainer__router2____devices = (EMoflonEdge) result4_green[9];

			Object[] result5_black = VirtualNodeToRouterRule2Impl
					.pattern_VirtualNodeToRouterRule2_7_5_collectcontextelements_blackBBBBB(match, router2, router,
							implContainer, cable);
			if (result5_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match + ", "
						+ "[router2] = " + router2 + ", " + "[router] = " + router + ", " + "[implContainer] = "
						+ implContainer + ", " + "[cable] = " + cable + ".");
			}
			VirtualNodeToRouterRule2Impl.pattern_VirtualNodeToRouterRule2_7_5_collectcontextelements_greenBBBBFF(match,
					router, implContainer, cable);
			//nothing EMoflonEdge implContainer__router____devices = (EMoflonEdge) result5_green[4];
			//nothing EMoflonEdge implContainer__cable____cables = (EMoflonEdge) result5_green[5];

			// 
			VirtualNodeToRouterRule2Impl.pattern_VirtualNodeToRouterRule2_7_6_registerobjectstomatch_expressionBBBBBB(
					this, match, router2, router, implContainer, cable);
			return VirtualNodeToRouterRule2Impl.pattern_VirtualNodeToRouterRule2_7_7_expressionF();
		} else {
			return VirtualNodeToRouterRule2Impl.pattern_VirtualNodeToRouterRule2_7_8_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PerformRuleResult perform_BWD(IsApplicableMatch isApplicableMatch) {

		Object[] result1_bindingAndBlack = VirtualNodeToRouterRule2Impl
				.pattern_VirtualNodeToRouterRule2_8_1_performtransformation_bindingAndBlackFFFFFFFFFBB(this,
						isApplicableMatch);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[isApplicableMatch] = " + isApplicableMatch + ".");
		}
		ReqContainerToImplContainer reqContainerToImplContainer = (ReqContainerToImplContainer) result1_bindingAndBlack[0];
		Router router2 = (Router) result1_bindingAndBlack[1];
		Router router = (Router) result1_bindingAndBlack[2];
		Container reqContainer = (Container) result1_bindingAndBlack[3];
		NetworkSpan virtualNode = (NetworkSpan) result1_bindingAndBlack[4];
		implementation.Container implContainer = (implementation.Container) result1_bindingAndBlack[5];
		VirtualNodeToRouter virtualNodeToRouter1 = (VirtualNodeToRouter) result1_bindingAndBlack[6];
		Cable cable = (Cable) result1_bindingAndBlack[7];
		//nothing CSP csp = (CSP) result1_bindingAndBlack[8];
		Object[] result1_green = VirtualNodeToRouterRule2Impl
				.pattern_VirtualNodeToRouterRule2_8_1_performtransformation_greenBFB(router2, virtualNode);
		VirtualNodeToRouter virtualNodeToRouter = (VirtualNodeToRouter) result1_green[1];

		Object[] result2_black = VirtualNodeToRouterRule2Impl
				.pattern_VirtualNodeToRouterRule2_8_2_collecttranslatedelements_blackBB(router2, virtualNodeToRouter);
		if (result2_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[router2] = " + router2 + ", "
					+ "[virtualNodeToRouter] = " + virtualNodeToRouter + ".");
		}
		Object[] result2_green = VirtualNodeToRouterRule2Impl
				.pattern_VirtualNodeToRouterRule2_8_2_collecttranslatedelements_greenFBB(router2, virtualNodeToRouter);
		PerformRuleResult ruleresult = (PerformRuleResult) result2_green[0];

		Object[] result3_black = VirtualNodeToRouterRule2Impl
				.pattern_VirtualNodeToRouterRule2_8_3_bookkeepingforedges_blackBBBBBBBBBB(ruleresult,
						reqContainerToImplContainer, router2, router, reqContainer, virtualNodeToRouter, virtualNode,
						implContainer, virtualNodeToRouter1, cable);
		if (result3_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[ruleresult] = " + ruleresult
					+ ", " + "[reqContainerToImplContainer] = " + reqContainerToImplContainer + ", " + "[router2] = "
					+ router2 + ", " + "[router] = " + router + ", " + "[reqContainer] = " + reqContainer + ", "
					+ "[virtualNodeToRouter] = " + virtualNodeToRouter + ", " + "[virtualNode] = " + virtualNode + ", "
					+ "[implContainer] = " + implContainer + ", " + "[virtualNodeToRouter1] = " + virtualNodeToRouter1
					+ ", " + "[cable] = " + cable + ".");
		}
		VirtualNodeToRouterRule2Impl.pattern_VirtualNodeToRouterRule2_8_3_bookkeepingforedges_greenBBBBBBBFFFFFFF(
				ruleresult, router2, router, virtualNodeToRouter, virtualNode, implContainer, cable);
		//nothing EMoflonEdge router2__cable____incoming = (EMoflonEdge) result3_green[7];
		//nothing EMoflonEdge cable__router2____target = (EMoflonEdge) result3_green[8];
		//nothing EMoflonEdge router__cable____outgoing = (EMoflonEdge) result3_green[9];
		//nothing EMoflonEdge cable__router____source = (EMoflonEdge) result3_green[10];
		//nothing EMoflonEdge virtualNodeToRouter__router2____target = (EMoflonEdge) result3_green[11];
		//nothing EMoflonEdge implContainer__router2____devices = (EMoflonEdge) result3_green[12];
		//nothing EMoflonEdge virtualNodeToRouter__virtualNode____source = (EMoflonEdge) result3_green[13];

		// 
		// 
		VirtualNodeToRouterRule2Impl.pattern_VirtualNodeToRouterRule2_8_5_registerobjects_expressionBBBBBBBBBBB(this,
				ruleresult, reqContainerToImplContainer, router2, router, reqContainer, virtualNodeToRouter,
				virtualNode, implContainer, virtualNodeToRouter1, cable);
		return VirtualNodeToRouterRule2Impl.pattern_VirtualNodeToRouterRule2_8_6_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IsApplicableRuleResult isApplicable_BWD(Match match) {

		Object[] result1_bindingAndBlack = VirtualNodeToRouterRule2Impl
				.pattern_VirtualNodeToRouterRule2_9_1_preparereturnvalue_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		EOperation performOperation = (EOperation) result1_bindingAndBlack[0];
		//nothing EClass eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = VirtualNodeToRouterRule2Impl
				.pattern_VirtualNodeToRouterRule2_9_1_preparereturnvalue_greenBF(performOperation);
		IsApplicableRuleResult ruleresult = (IsApplicableRuleResult) result1_green[1];

		// ForEach 
		Object[] result2_binding = VirtualNodeToRouterRule2Impl
				.pattern_VirtualNodeToRouterRule2_9_2_corematch_bindingFFFFB(match);
		if (result2_binding == null) {
			throw new RuntimeException(
					"Binding in node core match failed." + " Variables: " + "[match] = " + match + ".");
		}
		Router router2 = (Router) result2_binding[0];
		Router router = (Router) result2_binding[1];
		implementation.Container implContainer = (implementation.Container) result2_binding[2];
		Cable cable = (Cable) result2_binding[3];
		for (Object[] result2_black : VirtualNodeToRouterRule2Impl
				.pattern_VirtualNodeToRouterRule2_9_2_corematch_blackFBBFFBFBB(router2, router, implContainer, cable,
						match)) {
			ReqContainerToImplContainer reqContainerToImplContainer = (ReqContainerToImplContainer) result2_black[0];
			Container reqContainer = (Container) result2_black[3];
			NetworkSpan virtualNode = (NetworkSpan) result2_black[4];
			VirtualNodeToRouter virtualNodeToRouter1 = (VirtualNodeToRouter) result2_black[6];
			// ForEach 
			for (Object[] result3_black : VirtualNodeToRouterRule2Impl
					.pattern_VirtualNodeToRouterRule2_9_3_findcontext_blackBBBBBBBB(reqContainerToImplContainer,
							router2, router, reqContainer, virtualNode, implContainer, virtualNodeToRouter1, cable)) {
				Object[] result3_green = VirtualNodeToRouterRule2Impl
						.pattern_VirtualNodeToRouterRule2_9_3_findcontext_greenBBBBBBBBFFFFFFFFFFFFF(
								reqContainerToImplContainer, router2, router, reqContainer, virtualNode, implContainer,
								virtualNodeToRouter1, cable);
				IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result3_green[8];
				//nothing EMoflonEdge router2__cable____incoming = (EMoflonEdge) result3_green[9];
				//nothing EMoflonEdge cable__router2____target = (EMoflonEdge) result3_green[10];
				//nothing EMoflonEdge router__cable____outgoing = (EMoflonEdge) result3_green[11];
				//nothing EMoflonEdge cable__router____source = (EMoflonEdge) result3_green[12];
				//nothing EMoflonEdge reqContainer__virtualNode____networkSpan = (EMoflonEdge) result3_green[13];
				//nothing EMoflonEdge reqContainerToImplContainer__reqContainer____source = (EMoflonEdge) result3_green[14];
				//nothing EMoflonEdge implContainer__router____devices = (EMoflonEdge) result3_green[15];
				//nothing EMoflonEdge implContainer__router2____devices = (EMoflonEdge) result3_green[16];
				//nothing EMoflonEdge reqContainerToImplContainer__implContainer____target = (EMoflonEdge) result3_green[17];
				//nothing EMoflonEdge implContainer__cable____cables = (EMoflonEdge) result3_green[18];
				//nothing EMoflonEdge virtualNodeToRouter1__router____target = (EMoflonEdge) result3_green[19];
				//nothing EMoflonEdge virtualNodeToRouter1__virtualNode____source = (EMoflonEdge) result3_green[20];

				Object[] result4_bindingAndBlack = VirtualNodeToRouterRule2Impl
						.pattern_VirtualNodeToRouterRule2_9_4_solveCSP_bindingAndBlackFBBBBBBBBBB(this,
								isApplicableMatch, reqContainerToImplContainer, router2, router, reqContainer,
								virtualNode, implContainer, virtualNodeToRouter1, cable);
				if (result4_bindingAndBlack == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
							+ "[isApplicableMatch] = " + isApplicableMatch + ", " + "[reqContainerToImplContainer] = "
							+ reqContainerToImplContainer + ", " + "[router2] = " + router2 + ", " + "[router] = "
							+ router + ", " + "[reqContainer] = " + reqContainer + ", " + "[virtualNode] = "
							+ virtualNode + ", " + "[implContainer] = " + implContainer + ", "
							+ "[virtualNodeToRouter1] = " + virtualNodeToRouter1 + ", " + "[cable] = " + cable + ".");
				}
				CSP csp = (CSP) result4_bindingAndBlack[0];
				// 
				if (VirtualNodeToRouterRule2Impl.pattern_VirtualNodeToRouterRule2_9_5_checkCSP_expressionFBB(this,
						csp)) {

					Object[] result6_black = VirtualNodeToRouterRule2Impl
							.pattern_VirtualNodeToRouterRule2_9_6_addmatchtoruleresult_blackBB(ruleresult,
									isApplicableMatch);
					if (result6_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[ruleresult] = "
								+ ruleresult + ", " + "[isApplicableMatch] = " + isApplicableMatch + ".");
					}
					VirtualNodeToRouterRule2Impl.pattern_VirtualNodeToRouterRule2_9_6_addmatchtoruleresult_greenBB(
							ruleresult, isApplicableMatch);

				} else {
				}

			}

		}
		return VirtualNodeToRouterRule2Impl.pattern_VirtualNodeToRouterRule2_9_7_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void registerObjectsToMatch_BWD(Match match, Router router2, Router router,
			implementation.Container implContainer, Cable cable) {
		match.registerObject("router2", router2);
		match.registerObject("router", router);
		match.registerObject("implContainer", implContainer);
		match.registerObject("cable", cable);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isAppropriate_solveCsp_BWD(Match match, Router router2, Router router,
			implementation.Container implContainer, Cable cable) {// Create CSP
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
	public CSP isApplicable_solveCsp_BWD(IsApplicableMatch isApplicableMatch,
			ReqContainerToImplContainer reqContainerToImplContainer, Router router2, Router router,
			Container reqContainer, NetworkSpan virtualNode, implementation.Container implContainer,
			VirtualNodeToRouter virtualNodeToRouter1, Cable cable) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals

		// Create attribute variables

		// Create unbound variables

		// Create constraints

		// Solve CSP

		// Snapshot pattern match on which CSP is solved
		isApplicableMatch.registerObject("reqContainerToImplContainer", reqContainerToImplContainer);
		isApplicableMatch.registerObject("router2", router2);
		isApplicableMatch.registerObject("router", router);
		isApplicableMatch.registerObject("reqContainer", reqContainer);
		isApplicableMatch.registerObject("virtualNode", virtualNode);
		isApplicableMatch.registerObject("implContainer", implContainer);
		isApplicableMatch.registerObject("virtualNodeToRouter1", virtualNodeToRouter1);
		isApplicableMatch.registerObject("cable", cable);
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
	public void registerObjects_BWD(PerformRuleResult ruleresult, EObject reqContainerToImplContainer, EObject router2,
			EObject router, EObject reqContainer, EObject virtualNodeToRouter, EObject virtualNode,
			EObject implContainer, EObject virtualNodeToRouter1, EObject cable) {
		ruleresult.registerObject("reqContainerToImplContainer", reqContainerToImplContainer);
		ruleresult.registerObject("router2", router2);
		ruleresult.registerObject("router", router);
		ruleresult.registerObject("reqContainer", reqContainer);
		ruleresult.registerObject("virtualNodeToRouter", virtualNodeToRouter);
		ruleresult.registerObject("virtualNode", virtualNode);
		ruleresult.registerObject("implContainer", implContainer);
		ruleresult.registerObject("virtualNodeToRouter1", virtualNodeToRouter1);
		ruleresult.registerObject("cable", cable);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean checkTypes_BWD(Match match) {
		return true && org.moflon.util.eMoflonSDMUtil.getFQN(match.getObject("router2").eClass())
				.equals("implementation.Router.");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_FWD_Container_1(Container reqContainer) {

		Object[] result1_bindingAndBlack = VirtualNodeToRouterRule2Impl
				.pattern_VirtualNodeToRouterRule2_17_1_preparereturnvalue_bindingAndBlackFFBF(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		EOperation isApplicableCC = (EOperation) result1_bindingAndBlack[3];
		Object[] result1_green = VirtualNodeToRouterRule2Impl
				.pattern_VirtualNodeToRouterRule2_17_1_preparereturnvalue_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach 
		for (Object[] result2_black : VirtualNodeToRouterRule2Impl
				.pattern_VirtualNodeToRouterRule2_17_2_testcorematchandDECs_blackBF(reqContainer)) {
			NetworkSpan virtualNode = (NetworkSpan) result2_black[1];
			Object[] result2_green = VirtualNodeToRouterRule2Impl
					.pattern_VirtualNodeToRouterRule2_17_2_testcorematchandDECs_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// 
			if (VirtualNodeToRouterRule2Impl
					.pattern_VirtualNodeToRouterRule2_17_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBB(
							this, match, reqContainer, virtualNode)) {
				// 
				if (VirtualNodeToRouterRule2Impl
						.pattern_VirtualNodeToRouterRule2_17_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(
								this, match)) {

					Object[] result5_black = VirtualNodeToRouterRule2Impl
							.pattern_VirtualNodeToRouterRule2_17_5_Addmatchtoruleresult_blackBBBB(match,
									__performOperation, __result, isApplicableCC);
					if (result5_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match
								+ ", " + "[__performOperation] = " + __performOperation + ", " + "[__result] = "
								+ __result + ", " + "[isApplicableCC] = " + isApplicableCC + ".");
					}
					VirtualNodeToRouterRule2Impl.pattern_VirtualNodeToRouterRule2_17_5_Addmatchtoruleresult_greenBBBB(
							match, __performOperation, __result, isApplicableCC);

				} else {
				}

			} else {
			}

		}
		return VirtualNodeToRouterRule2Impl.pattern_VirtualNodeToRouterRule2_17_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_BWD_EMoflonEdge_3(EMoflonEdge _edge_incoming) {

		Object[] result1_bindingAndBlack = VirtualNodeToRouterRule2Impl
				.pattern_VirtualNodeToRouterRule2_18_1_preparereturnvalue_bindingAndBlackFFBF(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		EOperation isApplicableCC = (EOperation) result1_bindingAndBlack[3];
		Object[] result1_green = VirtualNodeToRouterRule2Impl
				.pattern_VirtualNodeToRouterRule2_18_1_preparereturnvalue_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach 
		for (Object[] result2_black : VirtualNodeToRouterRule2Impl
				.pattern_VirtualNodeToRouterRule2_18_2_testcorematchandDECs_blackFFFFB(_edge_incoming)) {
			Router router2 = (Router) result2_black[0];
			Router router = (Router) result2_black[1];
			implementation.Container implContainer = (implementation.Container) result2_black[2];
			Cable cable = (Cable) result2_black[3];
			Object[] result2_green = VirtualNodeToRouterRule2Impl
					.pattern_VirtualNodeToRouterRule2_18_2_testcorematchandDECs_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// 
			if (VirtualNodeToRouterRule2Impl
					.pattern_VirtualNodeToRouterRule2_18_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBBBB(
							this, match, router2, router, implContainer, cable)) {
				// 
				if (VirtualNodeToRouterRule2Impl
						.pattern_VirtualNodeToRouterRule2_18_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(
								this, match)) {

					Object[] result5_black = VirtualNodeToRouterRule2Impl
							.pattern_VirtualNodeToRouterRule2_18_5_Addmatchtoruleresult_blackBBBB(match,
									__performOperation, __result, isApplicableCC);
					if (result5_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match
								+ ", " + "[__performOperation] = " + __performOperation + ", " + "[__result] = "
								+ __result + ", " + "[isApplicableCC] = " + isApplicableCC + ".");
					}
					VirtualNodeToRouterRule2Impl.pattern_VirtualNodeToRouterRule2_18_5_Addmatchtoruleresult_greenBBBB(
							match, __performOperation, __result, isApplicableCC);

				} else {
				}

			} else {
			}

		}
		return VirtualNodeToRouterRule2Impl.pattern_VirtualNodeToRouterRule2_18_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AttributeConstraintsRuleResult checkAttributes_FWD(TripleMatch __tripleMatch) {
		AttributeConstraintsRuleResult ruleResult = org.moflon.tgg.runtime.RuntimeFactory.eINSTANCE
				.createAttributeConstraintsRuleResult();
		ruleResult.setRule("VirtualNodeToRouterRule2");
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
		ruleResult.setRule("VirtualNodeToRouterRule2");
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

		Object[] result1_black = VirtualNodeToRouterRule2Impl
				.pattern_VirtualNodeToRouterRule2_21_1_prepare_blackB(this);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		Object[] result1_green = VirtualNodeToRouterRule2Impl.pattern_VirtualNodeToRouterRule2_21_1_prepare_greenF();
		IsApplicableRuleResult result = (IsApplicableRuleResult) result1_green[0];

		Object[] result2_bindingAndBlack = VirtualNodeToRouterRule2Impl
				.pattern_VirtualNodeToRouterRule2_21_2_matchsrctrgcontext_bindingAndBlackFFFFFFBB(sourceMatch,
						targetMatch);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[sourceMatch] = " + sourceMatch
					+ ", " + "[targetMatch] = " + targetMatch + ".");
		}
		Router router2 = (Router) result2_bindingAndBlack[0];
		Router router = (Router) result2_bindingAndBlack[1];
		Container reqContainer = (Container) result2_bindingAndBlack[2];
		NetworkSpan virtualNode = (NetworkSpan) result2_bindingAndBlack[3];
		implementation.Container implContainer = (implementation.Container) result2_bindingAndBlack[4];
		Cable cable = (Cable) result2_bindingAndBlack[5];

		Object[] result3_bindingAndBlack = VirtualNodeToRouterRule2Impl
				.pattern_VirtualNodeToRouterRule2_21_3_solvecsp_bindingAndBlackFBBBBBBBBB(this, router2, router,
						reqContainer, virtualNode, implContainer, cable, sourceMatch, targetMatch);
		if (result3_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[router2] = " + router2 + ", " + "[router] = " + router + ", " + "[reqContainer] = "
					+ reqContainer + ", " + "[virtualNode] = " + virtualNode + ", " + "[implContainer] = "
					+ implContainer + ", " + "[cable] = " + cable + ", " + "[sourceMatch] = " + sourceMatch + ", "
					+ "[targetMatch] = " + targetMatch + ".");
		}
		CSP csp = (CSP) result3_bindingAndBlack[0];
		// 
		if (VirtualNodeToRouterRule2Impl.pattern_VirtualNodeToRouterRule2_21_4_checkCSP_expressionFB(csp)) {
			// ForEach 
			for (Object[] result5_black : VirtualNodeToRouterRule2Impl
					.pattern_VirtualNodeToRouterRule2_21_5_matchcorrcontext_blackFBBBBFBB(router, reqContainer,
							virtualNode, implContainer, sourceMatch, targetMatch)) {
				ReqContainerToImplContainer reqContainerToImplContainer = (ReqContainerToImplContainer) result5_black[0];
				VirtualNodeToRouter virtualNodeToRouter1 = (VirtualNodeToRouter) result5_black[5];
				Object[] result5_green = VirtualNodeToRouterRule2Impl
						.pattern_VirtualNodeToRouterRule2_21_5_matchcorrcontext_greenBBBBF(reqContainerToImplContainer,
								virtualNodeToRouter1, sourceMatch, targetMatch);
				CCMatch ccMatch = (CCMatch) result5_green[4];

				Object[] result6_black = VirtualNodeToRouterRule2Impl
						.pattern_VirtualNodeToRouterRule2_21_6_createcorrespondence_blackBBBBBBB(router2, router,
								reqContainer, virtualNode, implContainer, cable, ccMatch);
				if (result6_black == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[router2] = " + router2
							+ ", " + "[router] = " + router + ", " + "[reqContainer] = " + reqContainer + ", "
							+ "[virtualNode] = " + virtualNode + ", " + "[implContainer] = " + implContainer + ", "
							+ "[cable] = " + cable + ", " + "[ccMatch] = " + ccMatch + ".");
				}
				VirtualNodeToRouterRule2Impl.pattern_VirtualNodeToRouterRule2_21_6_createcorrespondence_greenBFBB(
						router2, virtualNode, ccMatch);
				//nothing VirtualNodeToRouter virtualNodeToRouter = (VirtualNodeToRouter) result6_green[1];

				Object[] result7_black = VirtualNodeToRouterRule2Impl
						.pattern_VirtualNodeToRouterRule2_21_7_addtoreturnedresult_blackBB(result, ccMatch);
				if (result7_black == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[result] = " + result
							+ ", " + "[ccMatch] = " + ccMatch + ".");
				}
				VirtualNodeToRouterRule2Impl.pattern_VirtualNodeToRouterRule2_21_7_addtoreturnedresult_greenBB(result,
						ccMatch);

			}

		} else {
		}
		return VirtualNodeToRouterRule2Impl.pattern_VirtualNodeToRouterRule2_21_8_expressionFB(result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isApplicable_solveCsp_CC(Router router2, Router router, Container reqContainer, NetworkSpan virtualNode,
			implementation.Container implContainer, Cable cable, Match sourceMatch, Match targetMatch) {// Create CSP
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
		Object[] result1_black = VirtualNodeToRouterRule2Impl
				.pattern_VirtualNodeToRouterRule2_24_1_matchtggpattern_blackBB(reqContainer, virtualNode);
		if (result1_black != null) {
			return VirtualNodeToRouterRule2Impl.pattern_VirtualNodeToRouterRule2_24_2_expressionF();
		} else {
			return VirtualNodeToRouterRule2Impl.pattern_VirtualNodeToRouterRule2_24_3_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean checkDEC_BWD(Router router2, Router router, implementation.Container implContainer, Cable cable) {// 
		Object[] result1_black = VirtualNodeToRouterRule2Impl
				.pattern_VirtualNodeToRouterRule2_25_1_matchtggpattern_blackBBBB(router2, router, implContainer, cable);
		if (result1_black != null) {
			return VirtualNodeToRouterRule2Impl.pattern_VirtualNodeToRouterRule2_25_2_expressionF();
		} else {
			return VirtualNodeToRouterRule2Impl.pattern_VirtualNodeToRouterRule2_25_3_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModelgeneratorRuleResult generateModel(RuleEntryContainer ruleEntryContainer,
			ReqContainerToImplContainer reqContainerToImplContainerParameter) {

		Object[] result1_black = VirtualNodeToRouterRule2Impl
				.pattern_VirtualNodeToRouterRule2_26_1_createresult_blackB(this);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		Object[] result1_green = VirtualNodeToRouterRule2Impl
				.pattern_VirtualNodeToRouterRule2_26_1_createresult_greenFF();
		IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result1_green[0];
		ModelgeneratorRuleResult ruleResult = (ModelgeneratorRuleResult) result1_green[1];

		// ForEach 
		for (Object[] result2_black : VirtualNodeToRouterRule2Impl
				.pattern_VirtualNodeToRouterRule2_26_2_isapplicablecore_blackFFFFFFFFBB(ruleEntryContainer,
						ruleResult)) {
			//nothing RuleEntryList reqContainerToImplContainerList = (RuleEntryList) result2_black[0];
			ReqContainerToImplContainer reqContainerToImplContainer = (ReqContainerToImplContainer) result2_black[1];
			Container reqContainer = (Container) result2_black[2];
			NetworkSpan virtualNode = (NetworkSpan) result2_black[3];
			VirtualNodeToRouter virtualNodeToRouter1 = (VirtualNodeToRouter) result2_black[4];
			Router router = (Router) result2_black[5];
			implementation.Container implContainer = (implementation.Container) result2_black[6];
			Cable cable = (Cable) result2_black[7];

			Object[] result3_bindingAndBlack = VirtualNodeToRouterRule2Impl
					.pattern_VirtualNodeToRouterRule2_26_3_solveCSP_bindingAndBlackFBBBBBBBBBB(this, isApplicableMatch,
							reqContainerToImplContainer, router, reqContainer, virtualNode, implContainer,
							virtualNodeToRouter1, cable, ruleResult);
			if (result3_bindingAndBlack == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
						+ "[isApplicableMatch] = " + isApplicableMatch + ", " + "[reqContainerToImplContainer] = "
						+ reqContainerToImplContainer + ", " + "[router] = " + router + ", " + "[reqContainer] = "
						+ reqContainer + ", " + "[virtualNode] = " + virtualNode + ", " + "[implContainer] = "
						+ implContainer + ", " + "[virtualNodeToRouter1] = " + virtualNodeToRouter1 + ", "
						+ "[cable] = " + cable + ", " + "[ruleResult] = " + ruleResult + ".");
			}
			CSP csp = (CSP) result3_bindingAndBlack[0];
			// 
			if (VirtualNodeToRouterRule2Impl.pattern_VirtualNodeToRouterRule2_26_4_checkCSP_expressionFBB(this, csp)) {
				// 
				Object[] result5_black = VirtualNodeToRouterRule2Impl
						.pattern_VirtualNodeToRouterRule2_26_5_checknacs_blackBBBBBBB(reqContainerToImplContainer,
								router, reqContainer, virtualNode, implContainer, virtualNodeToRouter1, cable);
				if (result5_black != null) {

					Object[] result6_black = VirtualNodeToRouterRule2Impl
							.pattern_VirtualNodeToRouterRule2_26_6_perform_blackBBBBBBBB(reqContainerToImplContainer,
									router, reqContainer, virtualNode, implContainer, virtualNodeToRouter1, cable,
									ruleResult);
					if (result6_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: "
								+ "[reqContainerToImplContainer] = " + reqContainerToImplContainer + ", "
								+ "[router] = " + router + ", " + "[reqContainer] = " + reqContainer + ", "
								+ "[virtualNode] = " + virtualNode + ", " + "[implContainer] = " + implContainer + ", "
								+ "[virtualNodeToRouter1] = " + virtualNodeToRouter1 + ", " + "[cable] = " + cable
								+ ", " + "[ruleResult] = " + ruleResult + ".");
					}
					VirtualNodeToRouterRule2Impl.pattern_VirtualNodeToRouterRule2_26_6_perform_greenFBFBBBB(router,
							virtualNode, implContainer, cable, ruleResult);
					//nothing Router router2 = (Router) result6_green[0];
					//nothing VirtualNodeToRouter virtualNodeToRouter = (VirtualNodeToRouter) result6_green[2];

				} else {
				}

			} else {
			}

		}
		return VirtualNodeToRouterRule2Impl.pattern_VirtualNodeToRouterRule2_26_7_expressionFB(ruleResult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP generateModel_solveCsp_BWD(IsApplicableMatch isApplicableMatch,
			ReqContainerToImplContainer reqContainerToImplContainer, Router router, Container reqContainer,
			NetworkSpan virtualNode, implementation.Container implContainer, VirtualNodeToRouter virtualNodeToRouter1,
			Cable cable, ModelgeneratorRuleResult ruleResult) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals

		// Create attribute variables

		// Create unbound variables

		// Create constraints

		// Solve CSP

		// Snapshot pattern match on which CSP is solved
		isApplicableMatch.registerObject("reqContainerToImplContainer", reqContainerToImplContainer);
		isApplicableMatch.registerObject("router", router);
		isApplicableMatch.registerObject("reqContainer", reqContainer);
		isApplicableMatch.registerObject("virtualNode", virtualNode);
		isApplicableMatch.registerObject("implContainer", implContainer);
		isApplicableMatch.registerObject("virtualNodeToRouter1", virtualNodeToRouter1);
		isApplicableMatch.registerObject("cable", cable);
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
		case RulesPackage.VIRTUAL_NODE_TO_ROUTER_RULE2___IS_APPROPRIATE_FWD__MATCH_CONTAINER_NETWORKSPAN:
			return isAppropriate_FWD((Match) arguments.get(0), (Container) arguments.get(1),
					(NetworkSpan) arguments.get(2));
		case RulesPackage.VIRTUAL_NODE_TO_ROUTER_RULE2___PERFORM_FWD__ISAPPLICABLEMATCH:
			return perform_FWD((IsApplicableMatch) arguments.get(0));
		case RulesPackage.VIRTUAL_NODE_TO_ROUTER_RULE2___IS_APPLICABLE_FWD__MATCH:
			return isApplicable_FWD((Match) arguments.get(0));
		case RulesPackage.VIRTUAL_NODE_TO_ROUTER_RULE2___REGISTER_OBJECTS_TO_MATCH_FWD__MATCH_CONTAINER_NETWORKSPAN:
			registerObjectsToMatch_FWD((Match) arguments.get(0), (Container) arguments.get(1),
					(NetworkSpan) arguments.get(2));
			return null;
		case RulesPackage.VIRTUAL_NODE_TO_ROUTER_RULE2___IS_APPROPRIATE_SOLVE_CSP_FWD__MATCH_CONTAINER_NETWORKSPAN:
			return isAppropriate_solveCsp_FWD((Match) arguments.get(0), (Container) arguments.get(1),
					(NetworkSpan) arguments.get(2));
		case RulesPackage.VIRTUAL_NODE_TO_ROUTER_RULE2___IS_APPROPRIATE_CHECK_CSP_FWD__CSP:
			return isAppropriate_checkCsp_FWD((CSP) arguments.get(0));
		case RulesPackage.VIRTUAL_NODE_TO_ROUTER_RULE2___CHECK_TYPES_FWD__MATCH:
			return checkTypes_FWD((Match) arguments.get(0));
		case RulesPackage.VIRTUAL_NODE_TO_ROUTER_RULE2___IS_APPROPRIATE_BWD__MATCH_ROUTER_ROUTER_CONTAINER_CABLE:
			return isAppropriate_BWD((Match) arguments.get(0), (Router) arguments.get(1), (Router) arguments.get(2),
					(implementation.Container) arguments.get(3), (Cable) arguments.get(4));
		case RulesPackage.VIRTUAL_NODE_TO_ROUTER_RULE2___PERFORM_BWD__ISAPPLICABLEMATCH:
			return perform_BWD((IsApplicableMatch) arguments.get(0));
		case RulesPackage.VIRTUAL_NODE_TO_ROUTER_RULE2___IS_APPLICABLE_BWD__MATCH:
			return isApplicable_BWD((Match) arguments.get(0));
		case RulesPackage.VIRTUAL_NODE_TO_ROUTER_RULE2___REGISTER_OBJECTS_TO_MATCH_BWD__MATCH_ROUTER_ROUTER_CONTAINER_CABLE:
			registerObjectsToMatch_BWD((Match) arguments.get(0), (Router) arguments.get(1), (Router) arguments.get(2),
					(implementation.Container) arguments.get(3), (Cable) arguments.get(4));
			return null;
		case RulesPackage.VIRTUAL_NODE_TO_ROUTER_RULE2___IS_APPROPRIATE_SOLVE_CSP_BWD__MATCH_ROUTER_ROUTER_CONTAINER_CABLE:
			return isAppropriate_solveCsp_BWD((Match) arguments.get(0), (Router) arguments.get(1),
					(Router) arguments.get(2), (implementation.Container) arguments.get(3), (Cable) arguments.get(4));
		case RulesPackage.VIRTUAL_NODE_TO_ROUTER_RULE2___IS_APPROPRIATE_CHECK_CSP_BWD__CSP:
			return isAppropriate_checkCsp_BWD((CSP) arguments.get(0));
		case RulesPackage.VIRTUAL_NODE_TO_ROUTER_RULE2___IS_APPLICABLE_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_REQCONTAINERTOIMPLCONTAINER_ROUTER_ROUTER_CONTAINER_NETWORKSPAN_CONTAINER_VIRTUALNODETOROUTER_CABLE:
			return isApplicable_solveCsp_BWD((IsApplicableMatch) arguments.get(0),
					(ReqContainerToImplContainer) arguments.get(1), (Router) arguments.get(2),
					(Router) arguments.get(3), (Container) arguments.get(4), (NetworkSpan) arguments.get(5),
					(implementation.Container) arguments.get(6), (VirtualNodeToRouter) arguments.get(7),
					(Cable) arguments.get(8));
		case RulesPackage.VIRTUAL_NODE_TO_ROUTER_RULE2___IS_APPLICABLE_CHECK_CSP_BWD__CSP:
			return isApplicable_checkCsp_BWD((CSP) arguments.get(0));
		case RulesPackage.VIRTUAL_NODE_TO_ROUTER_RULE2___REGISTER_OBJECTS_BWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT:
			registerObjects_BWD((PerformRuleResult) arguments.get(0), (EObject) arguments.get(1),
					(EObject) arguments.get(2), (EObject) arguments.get(3), (EObject) arguments.get(4),
					(EObject) arguments.get(5), (EObject) arguments.get(6), (EObject) arguments.get(7),
					(EObject) arguments.get(8), (EObject) arguments.get(9));
			return null;
		case RulesPackage.VIRTUAL_NODE_TO_ROUTER_RULE2___CHECK_TYPES_BWD__MATCH:
			return checkTypes_BWD((Match) arguments.get(0));
		case RulesPackage.VIRTUAL_NODE_TO_ROUTER_RULE2___IS_APPROPRIATE_FWD_CONTAINER_1__CONTAINER:
			return isAppropriate_FWD_Container_1((Container) arguments.get(0));
		case RulesPackage.VIRTUAL_NODE_TO_ROUTER_RULE2___IS_APPROPRIATE_BWD_EMOFLON_EDGE_3__EMOFLONEDGE:
			return isAppropriate_BWD_EMoflonEdge_3((EMoflonEdge) arguments.get(0));
		case RulesPackage.VIRTUAL_NODE_TO_ROUTER_RULE2___CHECK_ATTRIBUTES_FWD__TRIPLEMATCH:
			return checkAttributes_FWD((TripleMatch) arguments.get(0));
		case RulesPackage.VIRTUAL_NODE_TO_ROUTER_RULE2___CHECK_ATTRIBUTES_BWD__TRIPLEMATCH:
			return checkAttributes_BWD((TripleMatch) arguments.get(0));
		case RulesPackage.VIRTUAL_NODE_TO_ROUTER_RULE2___IS_APPLICABLE_CC__MATCH_MATCH:
			return isApplicable_CC((Match) arguments.get(0), (Match) arguments.get(1));
		case RulesPackage.VIRTUAL_NODE_TO_ROUTER_RULE2___IS_APPLICABLE_SOLVE_CSP_CC__ROUTER_ROUTER_CONTAINER_NETWORKSPAN_CONTAINER_CABLE_MATCH_MATCH:
			return isApplicable_solveCsp_CC((Router) arguments.get(0), (Router) arguments.get(1),
					(Container) arguments.get(2), (NetworkSpan) arguments.get(3),
					(implementation.Container) arguments.get(4), (Cable) arguments.get(5), (Match) arguments.get(6),
					(Match) arguments.get(7));
		case RulesPackage.VIRTUAL_NODE_TO_ROUTER_RULE2___IS_APPLICABLE_CHECK_CSP_CC__CSP:
			return isApplicable_checkCsp_CC((CSP) arguments.get(0));
		case RulesPackage.VIRTUAL_NODE_TO_ROUTER_RULE2___CHECK_DEC_FWD__CONTAINER_NETWORKSPAN:
			return checkDEC_FWD((Container) arguments.get(0), (NetworkSpan) arguments.get(1));
		case RulesPackage.VIRTUAL_NODE_TO_ROUTER_RULE2___CHECK_DEC_BWD__ROUTER_ROUTER_CONTAINER_CABLE:
			return checkDEC_BWD((Router) arguments.get(0), (Router) arguments.get(1),
					(implementation.Container) arguments.get(2), (Cable) arguments.get(3));
		case RulesPackage.VIRTUAL_NODE_TO_ROUTER_RULE2___GENERATE_MODEL__RULEENTRYCONTAINER_REQCONTAINERTOIMPLCONTAINER:
			return generateModel((RuleEntryContainer) arguments.get(0), (ReqContainerToImplContainer) arguments.get(1));
		case RulesPackage.VIRTUAL_NODE_TO_ROUTER_RULE2___GENERATE_MODEL_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_REQCONTAINERTOIMPLCONTAINER_ROUTER_CONTAINER_NETWORKSPAN_CONTAINER_VIRTUALNODETOROUTER_CABLE_MODELGENERATORRULERESULT:
			return generateModel_solveCsp_BWD((IsApplicableMatch) arguments.get(0),
					(ReqContainerToImplContainer) arguments.get(1), (Router) arguments.get(2),
					(Container) arguments.get(3), (NetworkSpan) arguments.get(4),
					(implementation.Container) arguments.get(5), (VirtualNodeToRouter) arguments.get(6),
					(Cable) arguments.get(7), (ModelgeneratorRuleResult) arguments.get(8));
		case RulesPackage.VIRTUAL_NODE_TO_ROUTER_RULE2___GENERATE_MODEL_CHECK_CSP_BWD__CSP:
			return generateModel_checkCsp_BWD((CSP) arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
	}

	public static final Object[] pattern_VirtualNodeToRouterRule2_0_1_initialbindings_blackBBBB(
			VirtualNodeToRouterRule2 _this, Match match, Container reqContainer, NetworkSpan virtualNode) {
		return new Object[] { _this, match, reqContainer, virtualNode };
	}

	public static final Object[] pattern_VirtualNodeToRouterRule2_0_2_SolveCSP_bindingFBBBB(
			VirtualNodeToRouterRule2 _this, Match match, Container reqContainer, NetworkSpan virtualNode) {
		CSP _localVariable_0 = _this.isAppropriate_solveCsp_FWD(match, reqContainer, virtualNode);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, match, reqContainer, virtualNode };
		}
		return null;
	}

	public static final Object[] pattern_VirtualNodeToRouterRule2_0_2_SolveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_VirtualNodeToRouterRule2_0_2_SolveCSP_bindingAndBlackFBBBB(
			VirtualNodeToRouterRule2 _this, Match match, Container reqContainer, NetworkSpan virtualNode) {
		Object[] result_pattern_VirtualNodeToRouterRule2_0_2_SolveCSP_binding = pattern_VirtualNodeToRouterRule2_0_2_SolveCSP_bindingFBBBB(
				_this, match, reqContainer, virtualNode);
		if (result_pattern_VirtualNodeToRouterRule2_0_2_SolveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_VirtualNodeToRouterRule2_0_2_SolveCSP_binding[0];

			Object[] result_pattern_VirtualNodeToRouterRule2_0_2_SolveCSP_black = pattern_VirtualNodeToRouterRule2_0_2_SolveCSP_blackB(
					csp);
			if (result_pattern_VirtualNodeToRouterRule2_0_2_SolveCSP_black != null) {

				return new Object[] { csp, _this, match, reqContainer, virtualNode };
			}
		}
		return null;
	}

	public static final boolean pattern_VirtualNodeToRouterRule2_0_3_CheckCSP_expressionFBB(
			VirtualNodeToRouterRule2 _this, CSP csp) {
		boolean _localVariable_0 = _this.isAppropriate_checkCsp_FWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_VirtualNodeToRouterRule2_0_4_collectelementstobetranslated_blackBBB(
			Match match, Container reqContainer, NetworkSpan virtualNode) {
		return new Object[] { match, reqContainer, virtualNode };
	}

	public static final Object[] pattern_VirtualNodeToRouterRule2_0_5_collectcontextelements_blackBBB(Match match,
			Container reqContainer, NetworkSpan virtualNode) {
		return new Object[] { match, reqContainer, virtualNode };
	}

	public static final Object[] pattern_VirtualNodeToRouterRule2_0_5_collectcontextelements_greenBBBF(Match match,
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

	public static final void pattern_VirtualNodeToRouterRule2_0_6_registerobjectstomatch_expressionBBBB(
			VirtualNodeToRouterRule2 _this, Match match, Container reqContainer, NetworkSpan virtualNode) {
		_this.registerObjectsToMatch_FWD(match, reqContainer, virtualNode);

	}

	public static final boolean pattern_VirtualNodeToRouterRule2_0_7_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_VirtualNodeToRouterRule2_0_8_expressionF() {
		boolean _result = Boolean.valueOf(false);
		return _result;
	}

	public static final Object[] pattern_VirtualNodeToRouterRule2_7_1_initialbindings_blackBBBBBB(
			VirtualNodeToRouterRule2 _this, Match match, Router router2, Router router,
			implementation.Container implContainer, Cable cable) {
		if (!router.equals(router2)) {
			return new Object[] { _this, match, router2, router, implContainer, cable };
		}
		return null;
	}

	public static final Object[] pattern_VirtualNodeToRouterRule2_7_2_SolveCSP_bindingFBBBBBB(
			VirtualNodeToRouterRule2 _this, Match match, Router router2, Router router,
			implementation.Container implContainer, Cable cable) {
		CSP _localVariable_0 = _this.isAppropriate_solveCsp_BWD(match, router2, router, implContainer, cable);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, match, router2, router, implContainer, cable };
		}
		return null;
	}

	public static final Object[] pattern_VirtualNodeToRouterRule2_7_2_SolveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_VirtualNodeToRouterRule2_7_2_SolveCSP_bindingAndBlackFBBBBBB(
			VirtualNodeToRouterRule2 _this, Match match, Router router2, Router router,
			implementation.Container implContainer, Cable cable) {
		Object[] result_pattern_VirtualNodeToRouterRule2_7_2_SolveCSP_binding = pattern_VirtualNodeToRouterRule2_7_2_SolveCSP_bindingFBBBBBB(
				_this, match, router2, router, implContainer, cable);
		if (result_pattern_VirtualNodeToRouterRule2_7_2_SolveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_VirtualNodeToRouterRule2_7_2_SolveCSP_binding[0];

			Object[] result_pattern_VirtualNodeToRouterRule2_7_2_SolveCSP_black = pattern_VirtualNodeToRouterRule2_7_2_SolveCSP_blackB(
					csp);
			if (result_pattern_VirtualNodeToRouterRule2_7_2_SolveCSP_black != null) {

				return new Object[] { csp, _this, match, router2, router, implContainer, cable };
			}
		}
		return null;
	}

	public static final boolean pattern_VirtualNodeToRouterRule2_7_3_CheckCSP_expressionFBB(
			VirtualNodeToRouterRule2 _this, CSP csp) {
		boolean _localVariable_0 = _this.isAppropriate_checkCsp_BWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_VirtualNodeToRouterRule2_7_4_collectelementstobetranslated_blackBBBBB(
			Match match, Router router2, Router router, implementation.Container implContainer, Cable cable) {
		if (!router.equals(router2)) {
			return new Object[] { match, router2, router, implContainer, cable };
		}
		return null;
	}

	public static final Object[] pattern_VirtualNodeToRouterRule2_7_4_collectelementstobetranslated_greenBBBBBFFFFF(
			Match match, Router router2, Router router, implementation.Container implContainer, Cable cable) {
		EMoflonEdge router2__cable____incoming = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge cable__router2____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge router__cable____outgoing = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge cable__router____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge implContainer__router2____devices = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		match.getToBeTranslatedNodes().add(router2);
		String router2__cable____incoming_name_prime = "incoming";
		String cable__router2____target_name_prime = "target";
		String router__cable____outgoing_name_prime = "outgoing";
		String cable__router____source_name_prime = "source";
		String implContainer__router2____devices_name_prime = "devices";
		router2__cable____incoming.setSrc(router2);
		router2__cable____incoming.setTrg(cable);
		match.getToBeTranslatedEdges().add(router2__cable____incoming);
		cable__router2____target.setSrc(cable);
		cable__router2____target.setTrg(router2);
		match.getToBeTranslatedEdges().add(cable__router2____target);
		router__cable____outgoing.setSrc(router);
		router__cable____outgoing.setTrg(cable);
		match.getToBeTranslatedEdges().add(router__cable____outgoing);
		cable__router____source.setSrc(cable);
		cable__router____source.setTrg(router);
		match.getToBeTranslatedEdges().add(cable__router____source);
		implContainer__router2____devices.setSrc(implContainer);
		implContainer__router2____devices.setTrg(router2);
		match.getToBeTranslatedEdges().add(implContainer__router2____devices);
		router2__cable____incoming.setName(router2__cable____incoming_name_prime);
		cable__router2____target.setName(cable__router2____target_name_prime);
		router__cable____outgoing.setName(router__cable____outgoing_name_prime);
		cable__router____source.setName(cable__router____source_name_prime);
		implContainer__router2____devices.setName(implContainer__router2____devices_name_prime);
		return new Object[] { match, router2, router, implContainer, cable, router2__cable____incoming,
				cable__router2____target, router__cable____outgoing, cable__router____source,
				implContainer__router2____devices };
	}

	public static final Object[] pattern_VirtualNodeToRouterRule2_7_5_collectcontextelements_blackBBBBB(Match match,
			Router router2, Router router, implementation.Container implContainer, Cable cable) {
		if (!router.equals(router2)) {
			return new Object[] { match, router2, router, implContainer, cable };
		}
		return null;
	}

	public static final Object[] pattern_VirtualNodeToRouterRule2_7_5_collectcontextelements_greenBBBBFF(Match match,
			Router router, implementation.Container implContainer, Cable cable) {
		EMoflonEdge implContainer__router____devices = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge implContainer__cable____cables = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		match.getContextNodes().add(router);
		match.getContextNodes().add(implContainer);
		match.getContextNodes().add(cable);
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
		return new Object[] { match, router, implContainer, cable, implContainer__router____devices,
				implContainer__cable____cables };
	}

	public static final void pattern_VirtualNodeToRouterRule2_7_6_registerobjectstomatch_expressionBBBBBB(
			VirtualNodeToRouterRule2 _this, Match match, Router router2, Router router,
			implementation.Container implContainer, Cable cable) {
		_this.registerObjectsToMatch_BWD(match, router2, router, implContainer, cable);

	}

	public static final boolean pattern_VirtualNodeToRouterRule2_7_7_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_VirtualNodeToRouterRule2_7_8_expressionF() {
		boolean _result = Boolean.valueOf(false);
		return _result;
	}

	public static final Object[] pattern_VirtualNodeToRouterRule2_8_1_performtransformation_bindingFFFFFFFFB(
			IsApplicableMatch isApplicableMatch) {
		EObject _localVariable_0 = isApplicableMatch.getObject("reqContainerToImplContainer");
		EObject _localVariable_1 = isApplicableMatch.getObject("router2");
		EObject _localVariable_2 = isApplicableMatch.getObject("router");
		EObject _localVariable_3 = isApplicableMatch.getObject("reqContainer");
		EObject _localVariable_4 = isApplicableMatch.getObject("virtualNode");
		EObject _localVariable_5 = isApplicableMatch.getObject("implContainer");
		EObject _localVariable_6 = isApplicableMatch.getObject("virtualNodeToRouter1");
		EObject _localVariable_7 = isApplicableMatch.getObject("cable");
		EObject tmpReqContainerToImplContainer = _localVariable_0;
		EObject tmpRouter2 = _localVariable_1;
		EObject tmpRouter = _localVariable_2;
		EObject tmpReqContainer = _localVariable_3;
		EObject tmpVirtualNode = _localVariable_4;
		EObject tmpImplContainer = _localVariable_5;
		EObject tmpVirtualNodeToRouter1 = _localVariable_6;
		EObject tmpCable = _localVariable_7;
		if (tmpReqContainerToImplContainer instanceof ReqContainerToImplContainer) {
			ReqContainerToImplContainer reqContainerToImplContainer = (ReqContainerToImplContainer) tmpReqContainerToImplContainer;
			if (tmpRouter2 instanceof Router) {
				Router router2 = (Router) tmpRouter2;
				if (tmpRouter instanceof Router) {
					Router router = (Router) tmpRouter;
					if (tmpReqContainer instanceof Container) {
						Container reqContainer = (Container) tmpReqContainer;
						if (tmpVirtualNode instanceof NetworkSpan) {
							NetworkSpan virtualNode = (NetworkSpan) tmpVirtualNode;
							if (tmpImplContainer instanceof implementation.Container) {
								implementation.Container implContainer = (implementation.Container) tmpImplContainer;
								if (tmpVirtualNodeToRouter1 instanceof VirtualNodeToRouter) {
									VirtualNodeToRouter virtualNodeToRouter1 = (VirtualNodeToRouter) tmpVirtualNodeToRouter1;
									if (tmpCable instanceof Cable) {
										Cable cable = (Cable) tmpCable;
										return new Object[] { reqContainerToImplContainer, router2, router,
												reqContainer, virtualNode, implContainer, virtualNodeToRouter1, cable,
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

	public static final Object[] pattern_VirtualNodeToRouterRule2_8_1_performtransformation_blackBBBBBBBBFBB(
			ReqContainerToImplContainer reqContainerToImplContainer, Router router2, Router router,
			Container reqContainer, NetworkSpan virtualNode, implementation.Container implContainer,
			VirtualNodeToRouter virtualNodeToRouter1, Cable cable, VirtualNodeToRouterRule2 _this,
			IsApplicableMatch isApplicableMatch) {
		if (!router.equals(router2)) {
			for (EObject tmpCsp : isApplicableMatch.getAttributeInfo()) {
				if (tmpCsp instanceof CSP) {
					CSP csp = (CSP) tmpCsp;
					return new Object[] { reqContainerToImplContainer, router2, router, reqContainer, virtualNode,
							implContainer, virtualNodeToRouter1, cable, csp, _this, isApplicableMatch };
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_VirtualNodeToRouterRule2_8_1_performtransformation_bindingAndBlackFFFFFFFFFBB(
			VirtualNodeToRouterRule2 _this, IsApplicableMatch isApplicableMatch) {
		Object[] result_pattern_VirtualNodeToRouterRule2_8_1_performtransformation_binding = pattern_VirtualNodeToRouterRule2_8_1_performtransformation_bindingFFFFFFFFB(
				isApplicableMatch);
		if (result_pattern_VirtualNodeToRouterRule2_8_1_performtransformation_binding != null) {
			ReqContainerToImplContainer reqContainerToImplContainer = (ReqContainerToImplContainer) result_pattern_VirtualNodeToRouterRule2_8_1_performtransformation_binding[0];
			Router router2 = (Router) result_pattern_VirtualNodeToRouterRule2_8_1_performtransformation_binding[1];
			Router router = (Router) result_pattern_VirtualNodeToRouterRule2_8_1_performtransformation_binding[2];
			Container reqContainer = (Container) result_pattern_VirtualNodeToRouterRule2_8_1_performtransformation_binding[3];
			NetworkSpan virtualNode = (NetworkSpan) result_pattern_VirtualNodeToRouterRule2_8_1_performtransformation_binding[4];
			implementation.Container implContainer = (implementation.Container) result_pattern_VirtualNodeToRouterRule2_8_1_performtransformation_binding[5];
			VirtualNodeToRouter virtualNodeToRouter1 = (VirtualNodeToRouter) result_pattern_VirtualNodeToRouterRule2_8_1_performtransformation_binding[6];
			Cable cable = (Cable) result_pattern_VirtualNodeToRouterRule2_8_1_performtransformation_binding[7];

			Object[] result_pattern_VirtualNodeToRouterRule2_8_1_performtransformation_black = pattern_VirtualNodeToRouterRule2_8_1_performtransformation_blackBBBBBBBBFBB(
					reqContainerToImplContainer, router2, router, reqContainer, virtualNode, implContainer,
					virtualNodeToRouter1, cable, _this, isApplicableMatch);
			if (result_pattern_VirtualNodeToRouterRule2_8_1_performtransformation_black != null) {
				CSP csp = (CSP) result_pattern_VirtualNodeToRouterRule2_8_1_performtransformation_black[8];

				return new Object[] { reqContainerToImplContainer, router2, router, reqContainer, virtualNode,
						implContainer, virtualNodeToRouter1, cable, csp, _this, isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_VirtualNodeToRouterRule2_8_1_performtransformation_greenBFB(Router router2,
			NetworkSpan virtualNode) {
		VirtualNodeToRouter virtualNodeToRouter = ReqToImpTransformatorFactory.eINSTANCE.createVirtualNodeToRouter();
		virtualNodeToRouter.setTarget(router2);
		virtualNodeToRouter.setSource(virtualNode);
		return new Object[] { router2, virtualNodeToRouter, virtualNode };
	}

	public static final Object[] pattern_VirtualNodeToRouterRule2_8_2_collecttranslatedelements_blackBB(Router router2,
			VirtualNodeToRouter virtualNodeToRouter) {
		return new Object[] { router2, virtualNodeToRouter };
	}

	public static final Object[] pattern_VirtualNodeToRouterRule2_8_2_collecttranslatedelements_greenFBB(Router router2,
			VirtualNodeToRouter virtualNodeToRouter) {
		PerformRuleResult ruleresult = RuntimeFactory.eINSTANCE.createPerformRuleResult();
		ruleresult.getTranslatedElements().add(router2);
		ruleresult.getCreatedLinkElements().add(virtualNodeToRouter);
		return new Object[] { ruleresult, router2, virtualNodeToRouter };
	}

	public static final Object[] pattern_VirtualNodeToRouterRule2_8_3_bookkeepingforedges_blackBBBBBBBBBB(
			PerformRuleResult ruleresult, EObject reqContainerToImplContainer, EObject router2, EObject router,
			EObject reqContainer, EObject virtualNodeToRouter, EObject virtualNode, EObject implContainer,
			EObject virtualNodeToRouter1, EObject cable) {
		if (!reqContainerToImplContainer.equals(router2)) {
			if (!reqContainerToImplContainer.equals(router)) {
				if (!reqContainerToImplContainer.equals(virtualNodeToRouter)) {
					if (!reqContainerToImplContainer.equals(virtualNode)) {
						if (!reqContainerToImplContainer.equals(virtualNodeToRouter1)) {
							if (!router2.equals(virtualNodeToRouter)) {
								if (!router2.equals(virtualNode)) {
									if (!router2.equals(virtualNodeToRouter1)) {
										if (!router.equals(router2)) {
											if (!router.equals(virtualNodeToRouter)) {
												if (!router.equals(virtualNode)) {
													if (!router.equals(virtualNodeToRouter1)) {
														if (!reqContainer.equals(reqContainerToImplContainer)) {
															if (!reqContainer.equals(router2)) {
																if (!reqContainer.equals(router)) {
																	if (!reqContainer.equals(virtualNodeToRouter)) {
																		if (!reqContainer.equals(virtualNode)) {
																			if (!reqContainer
																					.equals(virtualNodeToRouter1)) {
																				if (!virtualNodeToRouter
																						.equals(virtualNodeToRouter1)) {
																					if (!virtualNode.equals(
																							virtualNodeToRouter)) {
																						if (!virtualNode.equals(
																								virtualNodeToRouter1)) {
																							if (!implContainer.equals(
																									reqContainerToImplContainer)) {
																								if (!implContainer
																										.equals(router2)) {
																									if (!implContainer
																											.equals(router)) {
																										if (!implContainer
																												.equals(reqContainer)) {
																											if (!implContainer
																													.equals(virtualNodeToRouter)) {
																												if (!implContainer
																														.equals(virtualNode)) {
																													if (!implContainer
																															.equals(virtualNodeToRouter1)) {
																														if (!cable
																																.equals(reqContainerToImplContainer)) {
																															if (!cable
																																	.equals(router2)) {
																																if (!cable
																																		.equals(router)) {
																																	if (!cable
																																			.equals(reqContainer)) {
																																		if (!cable
																																				.equals(virtualNodeToRouter)) {
																																			if (!cable
																																					.equals(virtualNode)) {
																																				if (!cable
																																						.equals(implContainer)) {
																																					if (!cable
																																							.equals(virtualNodeToRouter1)) {
																																						return new Object[] {
																																								ruleresult,
																																								reqContainerToImplContainer,
																																								router2,
																																								router,
																																								reqContainer,
																																								virtualNodeToRouter,
																																								virtualNode,
																																								implContainer,
																																								virtualNodeToRouter1,
																																								cable };
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

	public static final Object[] pattern_VirtualNodeToRouterRule2_8_3_bookkeepingforedges_greenBBBBBBBFFFFFFF(
			PerformRuleResult ruleresult, EObject router2, EObject router, EObject virtualNodeToRouter,
			EObject virtualNode, EObject implContainer, EObject cable) {
		EMoflonEdge router2__cable____incoming = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge cable__router2____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge router__cable____outgoing = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge cable__router____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge virtualNodeToRouter__router2____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge implContainer__router2____devices = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge virtualNodeToRouter__virtualNode____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String ruleresult_ruleName_prime = "VirtualNodeToRouterRule2";
		String router2__cable____incoming_name_prime = "incoming";
		String cable__router2____target_name_prime = "target";
		String router__cable____outgoing_name_prime = "outgoing";
		String cable__router____source_name_prime = "source";
		String virtualNodeToRouter__router2____target_name_prime = "target";
		String implContainer__router2____devices_name_prime = "devices";
		String virtualNodeToRouter__virtualNode____source_name_prime = "source";
		router2__cable____incoming.setSrc(router2);
		router2__cable____incoming.setTrg(cable);
		ruleresult.getTranslatedEdges().add(router2__cable____incoming);
		cable__router2____target.setSrc(cable);
		cable__router2____target.setTrg(router2);
		ruleresult.getTranslatedEdges().add(cable__router2____target);
		router__cable____outgoing.setSrc(router);
		router__cable____outgoing.setTrg(cable);
		ruleresult.getTranslatedEdges().add(router__cable____outgoing);
		cable__router____source.setSrc(cable);
		cable__router____source.setTrg(router);
		ruleresult.getTranslatedEdges().add(cable__router____source);
		virtualNodeToRouter__router2____target.setSrc(virtualNodeToRouter);
		virtualNodeToRouter__router2____target.setTrg(router2);
		ruleresult.getCreatedEdges().add(virtualNodeToRouter__router2____target);
		implContainer__router2____devices.setSrc(implContainer);
		implContainer__router2____devices.setTrg(router2);
		ruleresult.getTranslatedEdges().add(implContainer__router2____devices);
		virtualNodeToRouter__virtualNode____source.setSrc(virtualNodeToRouter);
		virtualNodeToRouter__virtualNode____source.setTrg(virtualNode);
		ruleresult.getCreatedEdges().add(virtualNodeToRouter__virtualNode____source);
		ruleresult.setRuleName(ruleresult_ruleName_prime);
		router2__cable____incoming.setName(router2__cable____incoming_name_prime);
		cable__router2____target.setName(cable__router2____target_name_prime);
		router__cable____outgoing.setName(router__cable____outgoing_name_prime);
		cable__router____source.setName(cable__router____source_name_prime);
		virtualNodeToRouter__router2____target.setName(virtualNodeToRouter__router2____target_name_prime);
		implContainer__router2____devices.setName(implContainer__router2____devices_name_prime);
		virtualNodeToRouter__virtualNode____source.setName(virtualNodeToRouter__virtualNode____source_name_prime);
		return new Object[] { ruleresult, router2, router, virtualNodeToRouter, virtualNode, implContainer, cable,
				router2__cable____incoming, cable__router2____target, router__cable____outgoing,
				cable__router____source, virtualNodeToRouter__router2____target, implContainer__router2____devices,
				virtualNodeToRouter__virtualNode____source };
	}

	public static final void pattern_VirtualNodeToRouterRule2_8_5_registerobjects_expressionBBBBBBBBBBB(
			VirtualNodeToRouterRule2 _this, PerformRuleResult ruleresult, EObject reqContainerToImplContainer,
			EObject router2, EObject router, EObject reqContainer, EObject virtualNodeToRouter, EObject virtualNode,
			EObject implContainer, EObject virtualNodeToRouter1, EObject cable) {
		_this.registerObjects_BWD(ruleresult, reqContainerToImplContainer, router2, router, reqContainer,
				virtualNodeToRouter, virtualNode, implContainer, virtualNodeToRouter1, cable);

	}

	public static final PerformRuleResult pattern_VirtualNodeToRouterRule2_8_6_expressionFB(
			PerformRuleResult ruleresult) {
		PerformRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_VirtualNodeToRouterRule2_9_1_preparereturnvalue_bindingFB(
			VirtualNodeToRouterRule2 _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass eClass = _localVariable_0;
		if (eClass != null) {
			return new Object[] { eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_VirtualNodeToRouterRule2_9_1_preparereturnvalue_blackFBB(EClass eClass,
			VirtualNodeToRouterRule2 _this) {
		for (EOperation performOperation : eClass.getEOperations()) {
			String performOperation_name = performOperation.getName();
			if (performOperation_name.equals("perform_BWD")) {
				return new Object[] { performOperation, eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_VirtualNodeToRouterRule2_9_1_preparereturnvalue_bindingAndBlackFFB(
			VirtualNodeToRouterRule2 _this) {
		Object[] result_pattern_VirtualNodeToRouterRule2_9_1_preparereturnvalue_binding = pattern_VirtualNodeToRouterRule2_9_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_VirtualNodeToRouterRule2_9_1_preparereturnvalue_binding != null) {
			EClass eClass = (EClass) result_pattern_VirtualNodeToRouterRule2_9_1_preparereturnvalue_binding[0];

			Object[] result_pattern_VirtualNodeToRouterRule2_9_1_preparereturnvalue_black = pattern_VirtualNodeToRouterRule2_9_1_preparereturnvalue_blackFBB(
					eClass, _this);
			if (result_pattern_VirtualNodeToRouterRule2_9_1_preparereturnvalue_black != null) {
				EOperation performOperation = (EOperation) result_pattern_VirtualNodeToRouterRule2_9_1_preparereturnvalue_black[0];

				return new Object[] { performOperation, eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_VirtualNodeToRouterRule2_9_1_preparereturnvalue_greenBF(
			EOperation performOperation) {
		IsApplicableRuleResult ruleresult = RuntimeFactory.eINSTANCE.createIsApplicableRuleResult();
		boolean ruleresult_success_prime = Boolean.valueOf(false);
		String ruleresult_rule_prime = "VirtualNodeToRouterRule2";
		ruleresult.setPerformOperation(performOperation);
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		ruleresult.setRule(ruleresult_rule_prime);
		return new Object[] { performOperation, ruleresult };
	}

	public static final Object[] pattern_VirtualNodeToRouterRule2_9_2_corematch_bindingFFFFB(Match match) {
		EObject _localVariable_0 = match.getObject("router2");
		EObject _localVariable_1 = match.getObject("router");
		EObject _localVariable_2 = match.getObject("implContainer");
		EObject _localVariable_3 = match.getObject("cable");
		EObject tmpRouter2 = _localVariable_0;
		EObject tmpRouter = _localVariable_1;
		EObject tmpImplContainer = _localVariable_2;
		EObject tmpCable = _localVariable_3;
		if (tmpRouter2 instanceof Router) {
			Router router2 = (Router) tmpRouter2;
			if (tmpRouter instanceof Router) {
				Router router = (Router) tmpRouter;
				if (tmpImplContainer instanceof implementation.Container) {
					implementation.Container implContainer = (implementation.Container) tmpImplContainer;
					if (tmpCable instanceof Cable) {
						Cable cable = (Cable) tmpCable;
						return new Object[] { router2, router, implContainer, cable, match };
					}
				}
			}
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_VirtualNodeToRouterRule2_9_2_corematch_blackFBBFFBFBB(Router router2,
			Router router, implementation.Container implContainer, Cable cable, Match match) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (!router.equals(router2)) {
			for (ReqContainerToImplContainer reqContainerToImplContainer : org.moflon.core.utilities.eMoflonEMFUtil
					.getOppositeReferenceTyped(implContainer, ReqContainerToImplContainer.class, "target")) {
				Container reqContainer = reqContainerToImplContainer.getSource();
				if (reqContainer != null) {
					for (VirtualNodeToRouter virtualNodeToRouter1 : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(router, VirtualNodeToRouter.class, "target")) {
						NetworkSpan virtualNode = virtualNodeToRouter1.getSource();
						if (virtualNode != null) {
							_result.add(new Object[] { reqContainerToImplContainer, router2, router, reqContainer,
									virtualNode, implContainer, virtualNodeToRouter1, cable, match });
						}

					}
				}

			}
		}
		return _result;
	}

	public static final Iterable<Object[]> pattern_VirtualNodeToRouterRule2_9_3_findcontext_blackBBBBBBBB(
			ReqContainerToImplContainer reqContainerToImplContainer, Router router2, Router router,
			Container reqContainer, NetworkSpan virtualNode, implementation.Container implContainer,
			VirtualNodeToRouter virtualNodeToRouter1, Cable cable) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (!router.equals(router2)) {
			if (router2.getIncoming().contains(cable)) {
				if (router.getOutgoing().contains(cable)) {
					if (virtualNode.equals(reqContainer.getNetworkSpan())) {
						if (reqContainer.equals(reqContainerToImplContainer.getSource())) {
							if (implContainer.getDevices().contains(router)) {
								if (implContainer.getDevices().contains(router2)) {
									if (implContainer.equals(reqContainerToImplContainer.getTarget())) {
										if (implContainer.getCables().contains(cable)) {
											if (router.equals(virtualNodeToRouter1.getTarget())) {
												if (virtualNode.equals(virtualNodeToRouter1.getSource())) {
													_result.add(new Object[] { reqContainerToImplContainer, router2,
															router, reqContainer, virtualNode, implContainer,
															virtualNodeToRouter1, cable });
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

	public static final Object[] pattern_VirtualNodeToRouterRule2_9_3_findcontext_greenBBBBBBBBFFFFFFFFFFFFF(
			ReqContainerToImplContainer reqContainerToImplContainer, Router router2, Router router,
			Container reqContainer, NetworkSpan virtualNode, implementation.Container implContainer,
			VirtualNodeToRouter virtualNodeToRouter1, Cable cable) {
		IsApplicableMatch isApplicableMatch = RuntimeFactory.eINSTANCE.createIsApplicableMatch();
		EMoflonEdge router2__cable____incoming = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge cable__router2____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge router__cable____outgoing = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge cable__router____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge reqContainer__virtualNode____networkSpan = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge reqContainerToImplContainer__reqContainer____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge implContainer__router____devices = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge implContainer__router2____devices = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge reqContainerToImplContainer__implContainer____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge implContainer__cable____cables = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge virtualNodeToRouter1__router____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge virtualNodeToRouter1__virtualNode____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String router2__cable____incoming_name_prime = "incoming";
		String cable__router2____target_name_prime = "target";
		String router__cable____outgoing_name_prime = "outgoing";
		String cable__router____source_name_prime = "source";
		String reqContainer__virtualNode____networkSpan_name_prime = "networkSpan";
		String reqContainerToImplContainer__reqContainer____source_name_prime = "source";
		String implContainer__router____devices_name_prime = "devices";
		String implContainer__router2____devices_name_prime = "devices";
		String reqContainerToImplContainer__implContainer____target_name_prime = "target";
		String implContainer__cable____cables_name_prime = "cables";
		String virtualNodeToRouter1__router____target_name_prime = "target";
		String virtualNodeToRouter1__virtualNode____source_name_prime = "source";
		isApplicableMatch.getAllContextElements().add(reqContainerToImplContainer);
		isApplicableMatch.getAllContextElements().add(router2);
		isApplicableMatch.getAllContextElements().add(router);
		isApplicableMatch.getAllContextElements().add(reqContainer);
		isApplicableMatch.getAllContextElements().add(virtualNode);
		isApplicableMatch.getAllContextElements().add(implContainer);
		isApplicableMatch.getAllContextElements().add(virtualNodeToRouter1);
		isApplicableMatch.getAllContextElements().add(cable);
		router2__cable____incoming.setSrc(router2);
		router2__cable____incoming.setTrg(cable);
		isApplicableMatch.getAllContextElements().add(router2__cable____incoming);
		cable__router2____target.setSrc(cable);
		cable__router2____target.setTrg(router2);
		isApplicableMatch.getAllContextElements().add(cable__router2____target);
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
		implContainer__router____devices.setSrc(implContainer);
		implContainer__router____devices.setTrg(router);
		isApplicableMatch.getAllContextElements().add(implContainer__router____devices);
		implContainer__router2____devices.setSrc(implContainer);
		implContainer__router2____devices.setTrg(router2);
		isApplicableMatch.getAllContextElements().add(implContainer__router2____devices);
		reqContainerToImplContainer__implContainer____target.setSrc(reqContainerToImplContainer);
		reqContainerToImplContainer__implContainer____target.setTrg(implContainer);
		isApplicableMatch.getAllContextElements().add(reqContainerToImplContainer__implContainer____target);
		implContainer__cable____cables.setSrc(implContainer);
		implContainer__cable____cables.setTrg(cable);
		isApplicableMatch.getAllContextElements().add(implContainer__cable____cables);
		virtualNodeToRouter1__router____target.setSrc(virtualNodeToRouter1);
		virtualNodeToRouter1__router____target.setTrg(router);
		isApplicableMatch.getAllContextElements().add(virtualNodeToRouter1__router____target);
		virtualNodeToRouter1__virtualNode____source.setSrc(virtualNodeToRouter1);
		virtualNodeToRouter1__virtualNode____source.setTrg(virtualNode);
		isApplicableMatch.getAllContextElements().add(virtualNodeToRouter1__virtualNode____source);
		router2__cable____incoming.setName(router2__cable____incoming_name_prime);
		cable__router2____target.setName(cable__router2____target_name_prime);
		router__cable____outgoing.setName(router__cable____outgoing_name_prime);
		cable__router____source.setName(cable__router____source_name_prime);
		reqContainer__virtualNode____networkSpan.setName(reqContainer__virtualNode____networkSpan_name_prime);
		reqContainerToImplContainer__reqContainer____source
				.setName(reqContainerToImplContainer__reqContainer____source_name_prime);
		implContainer__router____devices.setName(implContainer__router____devices_name_prime);
		implContainer__router2____devices.setName(implContainer__router2____devices_name_prime);
		reqContainerToImplContainer__implContainer____target
				.setName(reqContainerToImplContainer__implContainer____target_name_prime);
		implContainer__cable____cables.setName(implContainer__cable____cables_name_prime);
		virtualNodeToRouter1__router____target.setName(virtualNodeToRouter1__router____target_name_prime);
		virtualNodeToRouter1__virtualNode____source.setName(virtualNodeToRouter1__virtualNode____source_name_prime);
		return new Object[] { reqContainerToImplContainer, router2, router, reqContainer, virtualNode, implContainer,
				virtualNodeToRouter1, cable, isApplicableMatch, router2__cable____incoming, cable__router2____target,
				router__cable____outgoing, cable__router____source, reqContainer__virtualNode____networkSpan,
				reqContainerToImplContainer__reqContainer____source, implContainer__router____devices,
				implContainer__router2____devices, reqContainerToImplContainer__implContainer____target,
				implContainer__cable____cables, virtualNodeToRouter1__router____target,
				virtualNodeToRouter1__virtualNode____source };
	}

	public static final Object[] pattern_VirtualNodeToRouterRule2_9_4_solveCSP_bindingFBBBBBBBBBB(
			VirtualNodeToRouterRule2 _this, IsApplicableMatch isApplicableMatch,
			ReqContainerToImplContainer reqContainerToImplContainer, Router router2, Router router,
			Container reqContainer, NetworkSpan virtualNode, implementation.Container implContainer,
			VirtualNodeToRouter virtualNodeToRouter1, Cable cable) {
		CSP _localVariable_0 = _this.isApplicable_solveCsp_BWD(isApplicableMatch, reqContainerToImplContainer, router2,
				router, reqContainer, virtualNode, implContainer, virtualNodeToRouter1, cable);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, reqContainerToImplContainer, router2, router,
					reqContainer, virtualNode, implContainer, virtualNodeToRouter1, cable };
		}
		return null;
	}

	public static final Object[] pattern_VirtualNodeToRouterRule2_9_4_solveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_VirtualNodeToRouterRule2_9_4_solveCSP_bindingAndBlackFBBBBBBBBBB(
			VirtualNodeToRouterRule2 _this, IsApplicableMatch isApplicableMatch,
			ReqContainerToImplContainer reqContainerToImplContainer, Router router2, Router router,
			Container reqContainer, NetworkSpan virtualNode, implementation.Container implContainer,
			VirtualNodeToRouter virtualNodeToRouter1, Cable cable) {
		Object[] result_pattern_VirtualNodeToRouterRule2_9_4_solveCSP_binding = pattern_VirtualNodeToRouterRule2_9_4_solveCSP_bindingFBBBBBBBBBB(
				_this, isApplicableMatch, reqContainerToImplContainer, router2, router, reqContainer, virtualNode,
				implContainer, virtualNodeToRouter1, cable);
		if (result_pattern_VirtualNodeToRouterRule2_9_4_solveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_VirtualNodeToRouterRule2_9_4_solveCSP_binding[0];

			Object[] result_pattern_VirtualNodeToRouterRule2_9_4_solveCSP_black = pattern_VirtualNodeToRouterRule2_9_4_solveCSP_blackB(
					csp);
			if (result_pattern_VirtualNodeToRouterRule2_9_4_solveCSP_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, reqContainerToImplContainer, router2, router,
						reqContainer, virtualNode, implContainer, virtualNodeToRouter1, cable };
			}
		}
		return null;
	}

	public static final boolean pattern_VirtualNodeToRouterRule2_9_5_checkCSP_expressionFBB(
			VirtualNodeToRouterRule2 _this, CSP csp) {
		boolean _localVariable_0 = _this.isApplicable_checkCsp_BWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_VirtualNodeToRouterRule2_9_6_addmatchtoruleresult_blackBB(
			IsApplicableRuleResult ruleresult, IsApplicableMatch isApplicableMatch) {
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final Object[] pattern_VirtualNodeToRouterRule2_9_6_addmatchtoruleresult_greenBB(
			IsApplicableRuleResult ruleresult, IsApplicableMatch isApplicableMatch) {
		ruleresult.getIsApplicableMatch().add(isApplicableMatch);
		boolean ruleresult_success_prime = Boolean.valueOf(true);
		String isApplicableMatch_ruleName_prime = "VirtualNodeToRouterRule2";
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		isApplicableMatch.setRuleName(isApplicableMatch_ruleName_prime);
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final IsApplicableRuleResult pattern_VirtualNodeToRouterRule2_9_7_expressionFB(
			IsApplicableRuleResult ruleresult) {
		IsApplicableRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_VirtualNodeToRouterRule2_17_1_preparereturnvalue_bindingFB(
			VirtualNodeToRouterRule2 _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_VirtualNodeToRouterRule2_17_1_preparereturnvalue_blackFBBF(EClass __eClass,
			VirtualNodeToRouterRule2 _this) {
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

	public static final Object[] pattern_VirtualNodeToRouterRule2_17_1_preparereturnvalue_bindingAndBlackFFBF(
			VirtualNodeToRouterRule2 _this) {
		Object[] result_pattern_VirtualNodeToRouterRule2_17_1_preparereturnvalue_binding = pattern_VirtualNodeToRouterRule2_17_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_VirtualNodeToRouterRule2_17_1_preparereturnvalue_binding != null) {
			EClass __eClass = (EClass) result_pattern_VirtualNodeToRouterRule2_17_1_preparereturnvalue_binding[0];

			Object[] result_pattern_VirtualNodeToRouterRule2_17_1_preparereturnvalue_black = pattern_VirtualNodeToRouterRule2_17_1_preparereturnvalue_blackFBBF(
					__eClass, _this);
			if (result_pattern_VirtualNodeToRouterRule2_17_1_preparereturnvalue_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_VirtualNodeToRouterRule2_17_1_preparereturnvalue_black[0];
				EOperation isApplicableCC = (EOperation) result_pattern_VirtualNodeToRouterRule2_17_1_preparereturnvalue_black[3];

				return new Object[] { __performOperation, __eClass, _this, isApplicableCC };
			}
		}
		return null;
	}

	public static final Object[] pattern_VirtualNodeToRouterRule2_17_1_preparereturnvalue_greenF() {
		EObjectContainer __result = RuntimeFactory.eINSTANCE.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Iterable<Object[]> pattern_VirtualNodeToRouterRule2_17_2_testcorematchandDECs_blackBF(
			Container reqContainer) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		NetworkSpan virtualNode = reqContainer.getNetworkSpan();
		if (virtualNode != null) {
			_result.add(new Object[] { reqContainer, virtualNode });
		}

		return _result;
	}

	public static final Object[] pattern_VirtualNodeToRouterRule2_17_2_testcorematchandDECs_greenFB(EClass __eClass) {
		Match match = RuntimeFactory.eINSTANCE.createMatch();
		String __eClass_name = __eClass.getName();
		String match_ruleName_prime = __eClass_name;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_VirtualNodeToRouterRule2_17_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBB(
			VirtualNodeToRouterRule2 _this, Match match, Container reqContainer, NetworkSpan virtualNode) {
		boolean _localVariable_0 = _this.isAppropriate_FWD(match, reqContainer, virtualNode);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_VirtualNodeToRouterRule2_17_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(
			VirtualNodeToRouterRule2 _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_FWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_VirtualNodeToRouterRule2_17_5_Addmatchtoruleresult_blackBBBB(Match match,
			EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		if (!__performOperation.equals(isApplicableCC)) {
			return new Object[] { match, __performOperation, __result, isApplicableCC };
		}
		return null;
	}

	public static final Object[] pattern_VirtualNodeToRouterRule2_17_5_Addmatchtoruleresult_greenBBBB(Match match,
			EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		match.setIsApplicableCCOperation(isApplicableCC);
		return new Object[] { match, __performOperation, __result, isApplicableCC };
	}

	public static final EObjectContainer pattern_VirtualNodeToRouterRule2_17_6_expressionFB(EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_VirtualNodeToRouterRule2_18_1_preparereturnvalue_bindingFB(
			VirtualNodeToRouterRule2 _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_VirtualNodeToRouterRule2_18_1_preparereturnvalue_blackFBBF(EClass __eClass,
			VirtualNodeToRouterRule2 _this) {
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

	public static final Object[] pattern_VirtualNodeToRouterRule2_18_1_preparereturnvalue_bindingAndBlackFFBF(
			VirtualNodeToRouterRule2 _this) {
		Object[] result_pattern_VirtualNodeToRouterRule2_18_1_preparereturnvalue_binding = pattern_VirtualNodeToRouterRule2_18_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_VirtualNodeToRouterRule2_18_1_preparereturnvalue_binding != null) {
			EClass __eClass = (EClass) result_pattern_VirtualNodeToRouterRule2_18_1_preparereturnvalue_binding[0];

			Object[] result_pattern_VirtualNodeToRouterRule2_18_1_preparereturnvalue_black = pattern_VirtualNodeToRouterRule2_18_1_preparereturnvalue_blackFBBF(
					__eClass, _this);
			if (result_pattern_VirtualNodeToRouterRule2_18_1_preparereturnvalue_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_VirtualNodeToRouterRule2_18_1_preparereturnvalue_black[0];
				EOperation isApplicableCC = (EOperation) result_pattern_VirtualNodeToRouterRule2_18_1_preparereturnvalue_black[3];

				return new Object[] { __performOperation, __eClass, _this, isApplicableCC };
			}
		}
		return null;
	}

	public static final Object[] pattern_VirtualNodeToRouterRule2_18_1_preparereturnvalue_greenF() {
		EObjectContainer __result = RuntimeFactory.eINSTANCE.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Iterable<Object[]> pattern_VirtualNodeToRouterRule2_18_2_testcorematchandDECs_blackFFFFB(
			EMoflonEdge _edge_incoming) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		EObject tmpRouter2 = _edge_incoming.getSrc();
		if (tmpRouter2 instanceof Router) {
			Router router2 = (Router) tmpRouter2;
			EObject tmpCable = _edge_incoming.getTrg();
			if (tmpCable instanceof Cable) {
				Cable cable = (Cable) tmpCable;
				if (router2.getIncoming().contains(cable)) {
					Device tmpRouter = cable.getSource();
					if (tmpRouter instanceof Router) {
						Router router = (Router) tmpRouter;
						if (!router.equals(router2)) {
							for (implementation.Container implContainer : org.moflon.core.utilities.eMoflonEMFUtil
									.getOppositeReferenceTyped(router2, implementation.Container.class, "devices")) {
								if (implContainer.getDevices().contains(router)) {
									if (implContainer.getCables().contains(cable)) {
										_result.add(
												new Object[] { router2, router, implContainer, cable, _edge_incoming });
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

	public static final Object[] pattern_VirtualNodeToRouterRule2_18_2_testcorematchandDECs_greenFB(EClass __eClass) {
		Match match = RuntimeFactory.eINSTANCE.createMatch();
		String __eClass_name = __eClass.getName();
		String match_ruleName_prime = __eClass_name;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_VirtualNodeToRouterRule2_18_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBBBB(
			VirtualNodeToRouterRule2 _this, Match match, Router router2, Router router,
			implementation.Container implContainer, Cable cable) {
		boolean _localVariable_0 = _this.isAppropriate_BWD(match, router2, router, implContainer, cable);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_VirtualNodeToRouterRule2_18_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(
			VirtualNodeToRouterRule2 _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_BWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_VirtualNodeToRouterRule2_18_5_Addmatchtoruleresult_blackBBBB(Match match,
			EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		if (!__performOperation.equals(isApplicableCC)) {
			return new Object[] { match, __performOperation, __result, isApplicableCC };
		}
		return null;
	}

	public static final Object[] pattern_VirtualNodeToRouterRule2_18_5_Addmatchtoruleresult_greenBBBB(Match match,
			EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		match.setIsApplicableCCOperation(isApplicableCC);
		return new Object[] { match, __performOperation, __result, isApplicableCC };
	}

	public static final EObjectContainer pattern_VirtualNodeToRouterRule2_18_6_expressionFB(EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_VirtualNodeToRouterRule2_21_1_prepare_blackB(VirtualNodeToRouterRule2 _this) {
		return new Object[] { _this };
	}

	public static final Object[] pattern_VirtualNodeToRouterRule2_21_1_prepare_greenF() {
		IsApplicableRuleResult result = RuntimeFactory.eINSTANCE.createIsApplicableRuleResult();
		return new Object[] { result };
	}

	public static final Object[] pattern_VirtualNodeToRouterRule2_21_2_matchsrctrgcontext_bindingFFFFFFBB(
			Match targetMatch, Match sourceMatch) {
		EObject _localVariable_0 = targetMatch.getObject("router2");
		EObject _localVariable_1 = targetMatch.getObject("router");
		EObject _localVariable_2 = sourceMatch.getObject("reqContainer");
		EObject _localVariable_3 = sourceMatch.getObject("virtualNode");
		EObject _localVariable_4 = targetMatch.getObject("implContainer");
		EObject _localVariable_5 = targetMatch.getObject("cable");
		EObject tmpRouter2 = _localVariable_0;
		EObject tmpRouter = _localVariable_1;
		EObject tmpReqContainer = _localVariable_2;
		EObject tmpVirtualNode = _localVariable_3;
		EObject tmpImplContainer = _localVariable_4;
		EObject tmpCable = _localVariable_5;
		if (tmpRouter2 instanceof Router) {
			Router router2 = (Router) tmpRouter2;
			if (tmpRouter instanceof Router) {
				Router router = (Router) tmpRouter;
				if (tmpReqContainer instanceof Container) {
					Container reqContainer = (Container) tmpReqContainer;
					if (tmpVirtualNode instanceof NetworkSpan) {
						NetworkSpan virtualNode = (NetworkSpan) tmpVirtualNode;
						if (tmpImplContainer instanceof implementation.Container) {
							implementation.Container implContainer = (implementation.Container) tmpImplContainer;
							if (tmpCable instanceof Cable) {
								Cable cable = (Cable) tmpCable;
								return new Object[] { router2, router, reqContainer, virtualNode, implContainer, cable,
										targetMatch, sourceMatch };
							}
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_VirtualNodeToRouterRule2_21_2_matchsrctrgcontext_blackBBBBBBBB(Router router2,
			Router router, Container reqContainer, NetworkSpan virtualNode, implementation.Container implContainer,
			Cable cable, Match sourceMatch, Match targetMatch) {
		if (!router.equals(router2)) {
			if (!sourceMatch.equals(targetMatch)) {
				return new Object[] { router2, router, reqContainer, virtualNode, implContainer, cable, sourceMatch,
						targetMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_VirtualNodeToRouterRule2_21_2_matchsrctrgcontext_bindingAndBlackFFFFFFBB(
			Match sourceMatch, Match targetMatch) {
		Object[] result_pattern_VirtualNodeToRouterRule2_21_2_matchsrctrgcontext_binding = pattern_VirtualNodeToRouterRule2_21_2_matchsrctrgcontext_bindingFFFFFFBB(
				targetMatch, sourceMatch);
		if (result_pattern_VirtualNodeToRouterRule2_21_2_matchsrctrgcontext_binding != null) {
			Router router2 = (Router) result_pattern_VirtualNodeToRouterRule2_21_2_matchsrctrgcontext_binding[0];
			Router router = (Router) result_pattern_VirtualNodeToRouterRule2_21_2_matchsrctrgcontext_binding[1];
			Container reqContainer = (Container) result_pattern_VirtualNodeToRouterRule2_21_2_matchsrctrgcontext_binding[2];
			NetworkSpan virtualNode = (NetworkSpan) result_pattern_VirtualNodeToRouterRule2_21_2_matchsrctrgcontext_binding[3];
			implementation.Container implContainer = (implementation.Container) result_pattern_VirtualNodeToRouterRule2_21_2_matchsrctrgcontext_binding[4];
			Cable cable = (Cable) result_pattern_VirtualNodeToRouterRule2_21_2_matchsrctrgcontext_binding[5];

			Object[] result_pattern_VirtualNodeToRouterRule2_21_2_matchsrctrgcontext_black = pattern_VirtualNodeToRouterRule2_21_2_matchsrctrgcontext_blackBBBBBBBB(
					router2, router, reqContainer, virtualNode, implContainer, cable, sourceMatch, targetMatch);
			if (result_pattern_VirtualNodeToRouterRule2_21_2_matchsrctrgcontext_black != null) {

				return new Object[] { router2, router, reqContainer, virtualNode, implContainer, cable, sourceMatch,
						targetMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_VirtualNodeToRouterRule2_21_3_solvecsp_bindingFBBBBBBBBB(
			VirtualNodeToRouterRule2 _this, Router router2, Router router, Container reqContainer,
			NetworkSpan virtualNode, implementation.Container implContainer, Cable cable, Match sourceMatch,
			Match targetMatch) {
		CSP _localVariable_6 = _this.isApplicable_solveCsp_CC(router2, router, reqContainer, virtualNode, implContainer,
				cable, sourceMatch, targetMatch);
		CSP csp = _localVariable_6;
		if (csp != null) {
			return new Object[] { csp, _this, router2, router, reqContainer, virtualNode, implContainer, cable,
					sourceMatch, targetMatch };
		}
		return null;
	}

	public static final Object[] pattern_VirtualNodeToRouterRule2_21_3_solvecsp_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_VirtualNodeToRouterRule2_21_3_solvecsp_bindingAndBlackFBBBBBBBBB(
			VirtualNodeToRouterRule2 _this, Router router2, Router router, Container reqContainer,
			NetworkSpan virtualNode, implementation.Container implContainer, Cable cable, Match sourceMatch,
			Match targetMatch) {
		Object[] result_pattern_VirtualNodeToRouterRule2_21_3_solvecsp_binding = pattern_VirtualNodeToRouterRule2_21_3_solvecsp_bindingFBBBBBBBBB(
				_this, router2, router, reqContainer, virtualNode, implContainer, cable, sourceMatch, targetMatch);
		if (result_pattern_VirtualNodeToRouterRule2_21_3_solvecsp_binding != null) {
			CSP csp = (CSP) result_pattern_VirtualNodeToRouterRule2_21_3_solvecsp_binding[0];

			Object[] result_pattern_VirtualNodeToRouterRule2_21_3_solvecsp_black = pattern_VirtualNodeToRouterRule2_21_3_solvecsp_blackB(
					csp);
			if (result_pattern_VirtualNodeToRouterRule2_21_3_solvecsp_black != null) {

				return new Object[] { csp, _this, router2, router, reqContainer, virtualNode, implContainer, cable,
						sourceMatch, targetMatch };
			}
		}
		return null;
	}

	public static final boolean pattern_VirtualNodeToRouterRule2_21_4_checkCSP_expressionFB(CSP csp) {
		boolean _localVariable_0 = csp.check();
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Iterable<Object[]> pattern_VirtualNodeToRouterRule2_21_5_matchcorrcontext_blackFBBBBFBB(
			Router router, Container reqContainer, NetworkSpan virtualNode, implementation.Container implContainer,
			Match sourceMatch, Match targetMatch) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (!sourceMatch.equals(targetMatch)) {
			for (ReqContainerToImplContainer reqContainerToImplContainer : org.moflon.core.utilities.eMoflonEMFUtil
					.getOppositeReferenceTyped(reqContainer, ReqContainerToImplContainer.class, "source")) {
				if (implContainer.equals(reqContainerToImplContainer.getTarget())) {
					for (VirtualNodeToRouter virtualNodeToRouter1 : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(router, VirtualNodeToRouter.class, "target")) {
						if (virtualNode.equals(virtualNodeToRouter1.getSource())) {
							_result.add(new Object[] { reqContainerToImplContainer, router, reqContainer, virtualNode,
									implContainer, virtualNodeToRouter1, sourceMatch, targetMatch });
						}
					}
				}
			}
		}
		return _result;
	}

	public static final Object[] pattern_VirtualNodeToRouterRule2_21_5_matchcorrcontext_greenBBBBF(
			ReqContainerToImplContainer reqContainerToImplContainer, VirtualNodeToRouter virtualNodeToRouter1,
			Match sourceMatch, Match targetMatch) {
		CCMatch ccMatch = RuntimeFactory.eINSTANCE.createCCMatch();
		String ccMatch_ruleName_prime = "VirtualNodeToRouterRule2";
		ccMatch.setSourceMatch(sourceMatch);
		ccMatch.setTargetMatch(targetMatch);
		ccMatch.getAllContextElements().add(reqContainerToImplContainer);
		ccMatch.getAllContextElements().add(virtualNodeToRouter1);
		ccMatch.setRuleName(ccMatch_ruleName_prime);
		return new Object[] { reqContainerToImplContainer, virtualNodeToRouter1, sourceMatch, targetMatch, ccMatch };
	}

	public static final Object[] pattern_VirtualNodeToRouterRule2_21_6_createcorrespondence_blackBBBBBBB(Router router2,
			Router router, Container reqContainer, NetworkSpan virtualNode, implementation.Container implContainer,
			Cable cable, CCMatch ccMatch) {
		if (!router.equals(router2)) {
			return new Object[] { router2, router, reqContainer, virtualNode, implContainer, cable, ccMatch };
		}
		return null;
	}

	public static final Object[] pattern_VirtualNodeToRouterRule2_21_6_createcorrespondence_greenBFBB(Router router2,
			NetworkSpan virtualNode, CCMatch ccMatch) {
		VirtualNodeToRouter virtualNodeToRouter = ReqToImpTransformatorFactory.eINSTANCE.createVirtualNodeToRouter();
		virtualNodeToRouter.setTarget(router2);
		virtualNodeToRouter.setSource(virtualNode);
		ccMatch.getCreateCorr().add(virtualNodeToRouter);
		return new Object[] { router2, virtualNodeToRouter, virtualNode, ccMatch };
	}

	public static final Object[] pattern_VirtualNodeToRouterRule2_21_7_addtoreturnedresult_blackBB(
			IsApplicableRuleResult result, CCMatch ccMatch) {
		return new Object[] { result, ccMatch };
	}

	public static final Object[] pattern_VirtualNodeToRouterRule2_21_7_addtoreturnedresult_greenBB(
			IsApplicableRuleResult result, CCMatch ccMatch) {
		result.getIsApplicableMatch().add(ccMatch);
		boolean result_success_prime = Boolean.valueOf(true);
		String ccMatch_ruleName_prime = "VirtualNodeToRouterRule2";
		result.setSuccess(Boolean.valueOf(result_success_prime));
		ccMatch.setRuleName(ccMatch_ruleName_prime);
		return new Object[] { result, ccMatch };
	}

	public static final IsApplicableRuleResult pattern_VirtualNodeToRouterRule2_21_8_expressionFB(
			IsApplicableRuleResult result) {
		IsApplicableRuleResult _result = result;
		return _result;
	}

	public static final Object[] pattern_VirtualNodeToRouterRule2_24_1_matchtggpattern_blackBB(Container reqContainer,
			NetworkSpan virtualNode) {
		if (virtualNode.equals(reqContainer.getNetworkSpan())) {
			return new Object[] { reqContainer, virtualNode };
		}
		return null;
	}

	public static final boolean pattern_VirtualNodeToRouterRule2_24_2_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_VirtualNodeToRouterRule2_24_3_expressionF() {
		boolean _result = Boolean.valueOf(false);
		return _result;
	}

	public static final Object[] pattern_VirtualNodeToRouterRule2_25_1_matchtggpattern_blackBBBB(Router router2,
			Router router, implementation.Container implContainer, Cable cable) {
		if (!router.equals(router2)) {
			if (router2.getIncoming().contains(cable)) {
				if (router.getOutgoing().contains(cable)) {
					if (implContainer.getDevices().contains(router)) {
						if (implContainer.getDevices().contains(router2)) {
							if (implContainer.getCables().contains(cable)) {
								return new Object[] { router2, router, implContainer, cable };
							}
						}
					}
				}
			}
		}
		return null;
	}

	public static final boolean pattern_VirtualNodeToRouterRule2_25_2_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_VirtualNodeToRouterRule2_25_3_expressionF() {
		boolean _result = Boolean.valueOf(false);
		return _result;
	}

	public static final Object[] pattern_VirtualNodeToRouterRule2_26_1_createresult_blackB(
			VirtualNodeToRouterRule2 _this) {
		return new Object[] { _this };
	}

	public static final Object[] pattern_VirtualNodeToRouterRule2_26_1_createresult_greenFF() {
		IsApplicableMatch isApplicableMatch = RuntimeFactory.eINSTANCE.createIsApplicableMatch();
		ModelgeneratorRuleResult ruleResult = RuntimeFactory.eINSTANCE.createModelgeneratorRuleResult();
		boolean ruleResult_success_prime = Boolean.valueOf(false);
		ruleResult.setSuccess(Boolean.valueOf(ruleResult_success_prime));
		return new Object[] { isApplicableMatch, ruleResult };
	}

	public static final Object[] pattern_VirtualNodeToRouterRule2_26_2_isapplicablecore_black_nac_0BB(
			ModelgeneratorRuleResult ruleResult, ReqContainerToImplContainer reqContainerToImplContainer) {
		if (ruleResult.getCorrObjects().contains(reqContainerToImplContainer)) {
			return new Object[] { ruleResult, reqContainerToImplContainer };
		}
		return null;
	}

	public static final Object[] pattern_VirtualNodeToRouterRule2_26_2_isapplicablecore_black_nac_1BB(
			ModelgeneratorRuleResult ruleResult, Container reqContainer) {
		if (ruleResult.getSourceObjects().contains(reqContainer)) {
			return new Object[] { ruleResult, reqContainer };
		}
		return null;
	}

	public static final Object[] pattern_VirtualNodeToRouterRule2_26_2_isapplicablecore_black_nac_2BB(
			ModelgeneratorRuleResult ruleResult, NetworkSpan virtualNode) {
		if (ruleResult.getSourceObjects().contains(virtualNode)) {
			return new Object[] { ruleResult, virtualNode };
		}
		return null;
	}

	public static final Object[] pattern_VirtualNodeToRouterRule2_26_2_isapplicablecore_black_nac_3BB(
			ModelgeneratorRuleResult ruleResult, VirtualNodeToRouter virtualNodeToRouter1) {
		if (ruleResult.getCorrObjects().contains(virtualNodeToRouter1)) {
			return new Object[] { ruleResult, virtualNodeToRouter1 };
		}
		return null;
	}

	public static final Object[] pattern_VirtualNodeToRouterRule2_26_2_isapplicablecore_black_nac_4BB(
			ModelgeneratorRuleResult ruleResult, Router router) {
		if (ruleResult.getTargetObjects().contains(router)) {
			return new Object[] { ruleResult, router };
		}
		return null;
	}

	public static final Object[] pattern_VirtualNodeToRouterRule2_26_2_isapplicablecore_black_nac_5BB(
			ModelgeneratorRuleResult ruleResult, implementation.Container implContainer) {
		if (ruleResult.getTargetObjects().contains(implContainer)) {
			return new Object[] { ruleResult, implContainer };
		}
		return null;
	}

	public static final Object[] pattern_VirtualNodeToRouterRule2_26_2_isapplicablecore_black_nac_6BB(
			ModelgeneratorRuleResult ruleResult, Cable cable) {
		if (ruleResult.getTargetObjects().contains(cable)) {
			return new Object[] { ruleResult, cable };
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_VirtualNodeToRouterRule2_26_2_isapplicablecore_blackFFFFFFFFBB(
			RuleEntryContainer ruleEntryContainer, ModelgeneratorRuleResult ruleResult) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		for (RuleEntryList reqContainerToImplContainerList : ruleEntryContainer.getRuleEntryList()) {
			for (EObject tmpReqContainerToImplContainer : reqContainerToImplContainerList.getEntryObjects()) {
				if (tmpReqContainerToImplContainer instanceof ReqContainerToImplContainer) {
					ReqContainerToImplContainer reqContainerToImplContainer = (ReqContainerToImplContainer) tmpReqContainerToImplContainer;
					Container reqContainer = reqContainerToImplContainer.getSource();
					if (reqContainer != null) {
						implementation.Container implContainer = reqContainerToImplContainer.getTarget();
						if (implContainer != null) {
							NetworkSpan virtualNode = reqContainer.getNetworkSpan();
							if (virtualNode != null) {
								if (pattern_VirtualNodeToRouterRule2_26_2_isapplicablecore_black_nac_0BB(ruleResult,
										reqContainerToImplContainer) == null) {
									if (pattern_VirtualNodeToRouterRule2_26_2_isapplicablecore_black_nac_1BB(ruleResult,
											reqContainer) == null) {
										if (pattern_VirtualNodeToRouterRule2_26_2_isapplicablecore_black_nac_5BB(
												ruleResult, implContainer) == null) {
											if (pattern_VirtualNodeToRouterRule2_26_2_isapplicablecore_black_nac_2BB(
													ruleResult, virtualNode) == null) {
												for (Device tmpRouter : implContainer.getDevices()) {
													if (tmpRouter instanceof Router) {
														Router router = (Router) tmpRouter;
														if (pattern_VirtualNodeToRouterRule2_26_2_isapplicablecore_black_nac_4BB(
																ruleResult, router) == null) {
															for (Cable cable : implContainer.getCables()) {
																if (pattern_VirtualNodeToRouterRule2_26_2_isapplicablecore_black_nac_6BB(
																		ruleResult, cable) == null) {
																	for (VirtualNodeToRouter virtualNodeToRouter1 : org.moflon.core.utilities.eMoflonEMFUtil
																			.getOppositeReferenceTyped(virtualNode,
																					VirtualNodeToRouter.class,
																					"source")) {
																		if (router.equals(
																				virtualNodeToRouter1.getTarget())) {
																			if (pattern_VirtualNodeToRouterRule2_26_2_isapplicablecore_black_nac_3BB(
																					ruleResult,
																					virtualNodeToRouter1) == null) {
																				_result.add(new Object[] {
																						reqContainerToImplContainerList,
																						reqContainerToImplContainer,
																						reqContainer, virtualNode,
																						virtualNodeToRouter1, router,
																						implContainer, cable,
																						ruleEntryContainer,
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
		}
		return _result;
	}

	public static final Object[] pattern_VirtualNodeToRouterRule2_26_3_solveCSP_bindingFBBBBBBBBBB(
			VirtualNodeToRouterRule2 _this, IsApplicableMatch isApplicableMatch,
			ReqContainerToImplContainer reqContainerToImplContainer, Router router, Container reqContainer,
			NetworkSpan virtualNode, implementation.Container implContainer, VirtualNodeToRouter virtualNodeToRouter1,
			Cable cable, ModelgeneratorRuleResult ruleResult) {
		CSP _localVariable_0 = _this.generateModel_solveCsp_BWD(isApplicableMatch, reqContainerToImplContainer, router,
				reqContainer, virtualNode, implContainer, virtualNodeToRouter1, cable, ruleResult);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, reqContainerToImplContainer, router, reqContainer,
					virtualNode, implContainer, virtualNodeToRouter1, cable, ruleResult };
		}
		return null;
	}

	public static final Object[] pattern_VirtualNodeToRouterRule2_26_3_solveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_VirtualNodeToRouterRule2_26_3_solveCSP_bindingAndBlackFBBBBBBBBBB(
			VirtualNodeToRouterRule2 _this, IsApplicableMatch isApplicableMatch,
			ReqContainerToImplContainer reqContainerToImplContainer, Router router, Container reqContainer,
			NetworkSpan virtualNode, implementation.Container implContainer, VirtualNodeToRouter virtualNodeToRouter1,
			Cable cable, ModelgeneratorRuleResult ruleResult) {
		Object[] result_pattern_VirtualNodeToRouterRule2_26_3_solveCSP_binding = pattern_VirtualNodeToRouterRule2_26_3_solveCSP_bindingFBBBBBBBBBB(
				_this, isApplicableMatch, reqContainerToImplContainer, router, reqContainer, virtualNode, implContainer,
				virtualNodeToRouter1, cable, ruleResult);
		if (result_pattern_VirtualNodeToRouterRule2_26_3_solveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_VirtualNodeToRouterRule2_26_3_solveCSP_binding[0];

			Object[] result_pattern_VirtualNodeToRouterRule2_26_3_solveCSP_black = pattern_VirtualNodeToRouterRule2_26_3_solveCSP_blackB(
					csp);
			if (result_pattern_VirtualNodeToRouterRule2_26_3_solveCSP_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, reqContainerToImplContainer, router, reqContainer,
						virtualNode, implContainer, virtualNodeToRouter1, cable, ruleResult };
			}
		}
		return null;
	}

	public static final boolean pattern_VirtualNodeToRouterRule2_26_4_checkCSP_expressionFBB(
			VirtualNodeToRouterRule2 _this, CSP csp) {
		boolean _localVariable_0 = _this.generateModel_checkCsp_BWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_VirtualNodeToRouterRule2_26_5_checknacs_blackBBBBBBB(
			ReqContainerToImplContainer reqContainerToImplContainer, Router router, Container reqContainer,
			NetworkSpan virtualNode, implementation.Container implContainer, VirtualNodeToRouter virtualNodeToRouter1,
			Cable cable) {
		return new Object[] { reqContainerToImplContainer, router, reqContainer, virtualNode, implContainer,
				virtualNodeToRouter1, cable };
	}

	public static final Object[] pattern_VirtualNodeToRouterRule2_26_6_perform_blackBBBBBBBB(
			ReqContainerToImplContainer reqContainerToImplContainer, Router router, Container reqContainer,
			NetworkSpan virtualNode, implementation.Container implContainer, VirtualNodeToRouter virtualNodeToRouter1,
			Cable cable, ModelgeneratorRuleResult ruleResult) {
		return new Object[] { reqContainerToImplContainer, router, reqContainer, virtualNode, implContainer,
				virtualNodeToRouter1, cable, ruleResult };
	}

	public static final Object[] pattern_VirtualNodeToRouterRule2_26_6_perform_greenFBFBBBB(Router router,
			NetworkSpan virtualNode, implementation.Container implContainer, Cable cable,
			ModelgeneratorRuleResult ruleResult) {
		Router router2 = ImplementationFactory.eINSTANCE.createRouter();
		VirtualNodeToRouter virtualNodeToRouter = ReqToImpTransformatorFactory.eINSTANCE.createVirtualNodeToRouter();
		router.getOutgoing().add(cable);
		boolean ruleResult_success_prime = Boolean.valueOf(true);
		int _localVariable_0 = ruleResult.getIncrementedPerformCount();
		router2.getIncoming().add(cable);
		implContainer.getDevices().add(router2);
		ruleResult.getTargetObjects().add(router2);
		virtualNodeToRouter.setTarget(router2);
		virtualNodeToRouter.setSource(virtualNode);
		ruleResult.getCorrObjects().add(virtualNodeToRouter);
		ruleResult.setSuccess(Boolean.valueOf(ruleResult_success_prime));
		int ruleResult_performCount_prime = Integer.valueOf(_localVariable_0);
		ruleResult.setPerformCount(Integer.valueOf(ruleResult_performCount_prime));
		return new Object[] { router2, router, virtualNodeToRouter, virtualNode, implContainer, cable, ruleResult };
	}

	public static final ModelgeneratorRuleResult pattern_VirtualNodeToRouterRule2_26_7_expressionFB(
			ModelgeneratorRuleResult ruleResult) {
		ModelgeneratorRuleResult _result = ruleResult;
		return _result;
	}

	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} //VirtualNodeToRouterRule2Impl
