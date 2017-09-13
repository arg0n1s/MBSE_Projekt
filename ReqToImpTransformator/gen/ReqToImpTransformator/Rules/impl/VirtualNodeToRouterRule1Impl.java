/**
 */
package ReqToImpTransformator.Rules.impl;

import ReqToImpTransformator.ReqContainerToImplContainer;
import ReqToImpTransformator.ReqToImpTransformatorFactory;

import ReqToImpTransformator.Rules.RulesPackage;
import ReqToImpTransformator.Rules.VirtualNodeToRouterRule1;

import ReqToImpTransformator.VirtualNodeToRouter;

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
 * An implementation of the model object '<em><b>Virtual Node To Router Rule1</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class VirtualNodeToRouterRule1Impl extends AbstractRuleImpl implements VirtualNodeToRouterRule1 {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VirtualNodeToRouterRule1Impl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RulesPackage.eINSTANCE.getVirtualNodeToRouterRule1();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAppropriate_FWD(Match match, Container reqContainer, NetworkSpan virtualNode) {

		Object[] result1_black = VirtualNodeToRouterRule1Impl
				.pattern_VirtualNodeToRouterRule1_0_1_initialbindings_blackBBBB(this, match, reqContainer, virtualNode);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[match] = " + match + ", " + "[reqContainer] = " + reqContainer + ", " + "[virtualNode] = "
					+ virtualNode + ".");
		}

		Object[] result2_bindingAndBlack = VirtualNodeToRouterRule1Impl
				.pattern_VirtualNodeToRouterRule1_0_2_SolveCSP_bindingAndBlackFBBBB(this, match, reqContainer,
						virtualNode);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[match] = " + match + ", " + "[reqContainer] = " + reqContainer + ", " + "[virtualNode] = "
					+ virtualNode + ".");
		}
		CSP csp = (CSP) result2_bindingAndBlack[0];
		// 
		if (VirtualNodeToRouterRule1Impl.pattern_VirtualNodeToRouterRule1_0_3_CheckCSP_expressionFBB(this, csp)) {

			Object[] result4_black = VirtualNodeToRouterRule1Impl
					.pattern_VirtualNodeToRouterRule1_0_4_collectelementstobetranslated_blackBBB(match, reqContainer,
							virtualNode);
			if (result4_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match + ", "
						+ "[reqContainer] = " + reqContainer + ", " + "[virtualNode] = " + virtualNode + ".");
			}

			Object[] result5_black = VirtualNodeToRouterRule1Impl
					.pattern_VirtualNodeToRouterRule1_0_5_collectcontextelements_blackBBB(match, reqContainer,
							virtualNode);
			if (result5_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match + ", "
						+ "[reqContainer] = " + reqContainer + ", " + "[virtualNode] = " + virtualNode + ".");
			}
			VirtualNodeToRouterRule1Impl.pattern_VirtualNodeToRouterRule1_0_5_collectcontextelements_greenBBBF(match,
					reqContainer, virtualNode);
			//nothing EMoflonEdge reqContainer__virtualNode____networkSpan = (EMoflonEdge) result5_green[3];

			// 
			VirtualNodeToRouterRule1Impl.pattern_VirtualNodeToRouterRule1_0_6_registerobjectstomatch_expressionBBBB(
					this, match, reqContainer, virtualNode);
			return VirtualNodeToRouterRule1Impl.pattern_VirtualNodeToRouterRule1_0_7_expressionF();
		} else {
			return VirtualNodeToRouterRule1Impl.pattern_VirtualNodeToRouterRule1_0_8_expressionF();
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
	public boolean isAppropriate_BWD(Match match, implementation.Container implContainer, Router router) {

		Object[] result1_black = VirtualNodeToRouterRule1Impl
				.pattern_VirtualNodeToRouterRule1_7_1_initialbindings_blackBBBB(this, match, implContainer, router);
		if (result1_black == null) {
			throw new RuntimeException(
					"Pattern matching failed." + " Variables: " + "[this] = " + this + ", " + "[match] = " + match
							+ ", " + "[implContainer] = " + implContainer + ", " + "[router] = " + router + ".");
		}

		Object[] result2_bindingAndBlack = VirtualNodeToRouterRule1Impl
				.pattern_VirtualNodeToRouterRule1_7_2_SolveCSP_bindingAndBlackFBBBB(this, match, implContainer, router);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException(
					"Pattern matching failed." + " Variables: " + "[this] = " + this + ", " + "[match] = " + match
							+ ", " + "[implContainer] = " + implContainer + ", " + "[router] = " + router + ".");
		}
		CSP csp = (CSP) result2_bindingAndBlack[0];
		// 
		if (VirtualNodeToRouterRule1Impl.pattern_VirtualNodeToRouterRule1_7_3_CheckCSP_expressionFBB(this, csp)) {

			Object[] result4_black = VirtualNodeToRouterRule1Impl
					.pattern_VirtualNodeToRouterRule1_7_4_collectelementstobetranslated_blackBBB(match, implContainer,
							router);
			if (result4_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match + ", "
						+ "[implContainer] = " + implContainer + ", " + "[router] = " + router + ".");
			}
			VirtualNodeToRouterRule1Impl.pattern_VirtualNodeToRouterRule1_7_4_collectelementstobetranslated_greenBBBF(
					match, implContainer, router);
			//nothing EMoflonEdge implContainer__router____devices = (EMoflonEdge) result4_green[3];

			Object[] result5_black = VirtualNodeToRouterRule1Impl
					.pattern_VirtualNodeToRouterRule1_7_5_collectcontextelements_blackBBB(match, implContainer, router);
			if (result5_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match + ", "
						+ "[implContainer] = " + implContainer + ", " + "[router] = " + router + ".");
			}
			VirtualNodeToRouterRule1Impl.pattern_VirtualNodeToRouterRule1_7_5_collectcontextelements_greenBB(match,
					implContainer);

			// 
			VirtualNodeToRouterRule1Impl.pattern_VirtualNodeToRouterRule1_7_6_registerobjectstomatch_expressionBBBB(
					this, match, implContainer, router);
			return VirtualNodeToRouterRule1Impl.pattern_VirtualNodeToRouterRule1_7_7_expressionF();
		} else {
			return VirtualNodeToRouterRule1Impl.pattern_VirtualNodeToRouterRule1_7_8_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PerformRuleResult perform_BWD(IsApplicableMatch isApplicableMatch) {

		Object[] result1_bindingAndBlack = VirtualNodeToRouterRule1Impl
				.pattern_VirtualNodeToRouterRule1_8_1_performtransformation_bindingAndBlackFFFFFFBB(this,
						isApplicableMatch);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[isApplicableMatch] = " + isApplicableMatch + ".");
		}
		Container reqContainer = (Container) result1_bindingAndBlack[0];
		implementation.Container implContainer = (implementation.Container) result1_bindingAndBlack[1];
		NetworkSpan virtualNode = (NetworkSpan) result1_bindingAndBlack[2];
		Router router = (Router) result1_bindingAndBlack[3];
		ReqContainerToImplContainer reqContainerToImplContainer = (ReqContainerToImplContainer) result1_bindingAndBlack[4];
		//nothing CSP csp = (CSP) result1_bindingAndBlack[5];
		Object[] result1_green = VirtualNodeToRouterRule1Impl
				.pattern_VirtualNodeToRouterRule1_8_1_performtransformation_greenBFB(virtualNode, router);
		VirtualNodeToRouter virtualNodeToRouter = (VirtualNodeToRouter) result1_green[1];

		Object[] result2_black = VirtualNodeToRouterRule1Impl
				.pattern_VirtualNodeToRouterRule1_8_2_collecttranslatedelements_blackBB(virtualNodeToRouter, router);
		if (result2_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[virtualNodeToRouter] = "
					+ virtualNodeToRouter + ", " + "[router] = " + router + ".");
		}
		Object[] result2_green = VirtualNodeToRouterRule1Impl
				.pattern_VirtualNodeToRouterRule1_8_2_collecttranslatedelements_greenFBB(virtualNodeToRouter, router);
		PerformRuleResult ruleresult = (PerformRuleResult) result2_green[0];

		Object[] result3_black = VirtualNodeToRouterRule1Impl
				.pattern_VirtualNodeToRouterRule1_8_3_bookkeepingforedges_blackBBBBBBB(ruleresult, reqContainer,
						implContainer, virtualNode, virtualNodeToRouter, router, reqContainerToImplContainer);
		if (result3_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[ruleresult] = " + ruleresult
					+ ", " + "[reqContainer] = " + reqContainer + ", " + "[implContainer] = " + implContainer + ", "
					+ "[virtualNode] = " + virtualNode + ", " + "[virtualNodeToRouter] = " + virtualNodeToRouter + ", "
					+ "[router] = " + router + ", " + "[reqContainerToImplContainer] = " + reqContainerToImplContainer
					+ ".");
		}
		VirtualNodeToRouterRule1Impl.pattern_VirtualNodeToRouterRule1_8_3_bookkeepingforedges_greenBBBBBFFF(ruleresult,
				implContainer, virtualNode, virtualNodeToRouter, router);
		//nothing EMoflonEdge virtualNodeToRouter__virtualNode____source = (EMoflonEdge) result3_green[5];
		//nothing EMoflonEdge virtualNodeToRouter__router____target = (EMoflonEdge) result3_green[6];
		//nothing EMoflonEdge implContainer__router____devices = (EMoflonEdge) result3_green[7];

		// 
		// 
		VirtualNodeToRouterRule1Impl.pattern_VirtualNodeToRouterRule1_8_5_registerobjects_expressionBBBBBBBB(this,
				ruleresult, reqContainer, implContainer, virtualNode, virtualNodeToRouter, router,
				reqContainerToImplContainer);
		return VirtualNodeToRouterRule1Impl.pattern_VirtualNodeToRouterRule1_8_6_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IsApplicableRuleResult isApplicable_BWD(Match match) {

		Object[] result1_bindingAndBlack = VirtualNodeToRouterRule1Impl
				.pattern_VirtualNodeToRouterRule1_9_1_preparereturnvalue_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		EOperation performOperation = (EOperation) result1_bindingAndBlack[0];
		//nothing EClass eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = VirtualNodeToRouterRule1Impl
				.pattern_VirtualNodeToRouterRule1_9_1_preparereturnvalue_greenBF(performOperation);
		IsApplicableRuleResult ruleresult = (IsApplicableRuleResult) result1_green[1];

		// ForEach 
		Object[] result2_binding = VirtualNodeToRouterRule1Impl
				.pattern_VirtualNodeToRouterRule1_9_2_corematch_bindingFFB(match);
		if (result2_binding == null) {
			throw new RuntimeException(
					"Binding in node core match failed." + " Variables: " + "[match] = " + match + ".");
		}
		implementation.Container implContainer = (implementation.Container) result2_binding[0];
		Router router = (Router) result2_binding[1];
		for (Object[] result2_black : VirtualNodeToRouterRule1Impl
				.pattern_VirtualNodeToRouterRule1_9_2_corematch_blackFBBFB(implContainer, router, match)) {
			Container reqContainer = (Container) result2_black[0];
			ReqContainerToImplContainer reqContainerToImplContainer = (ReqContainerToImplContainer) result2_black[3];
			// ForEach 
			for (Object[] result3_black : VirtualNodeToRouterRule1Impl
					.pattern_VirtualNodeToRouterRule1_9_3_findcontext_blackBBFBB(reqContainer, implContainer, router,
							reqContainerToImplContainer)) {
				NetworkSpan virtualNode = (NetworkSpan) result3_black[2];
				Object[] result3_green = VirtualNodeToRouterRule1Impl
						.pattern_VirtualNodeToRouterRule1_9_3_findcontext_greenBBBBBFFFFF(reqContainer, implContainer,
								virtualNode, router, reqContainerToImplContainer);
				IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result3_green[5];
				//nothing EMoflonEdge reqContainer__virtualNode____networkSpan = (EMoflonEdge) result3_green[6];
				//nothing EMoflonEdge reqContainerToImplContainer__implContainer____target = (EMoflonEdge) result3_green[7];
				//nothing EMoflonEdge implContainer__router____devices = (EMoflonEdge) result3_green[8];
				//nothing EMoflonEdge reqContainerToImplContainer__reqContainer____source = (EMoflonEdge) result3_green[9];

				Object[] result4_bindingAndBlack = VirtualNodeToRouterRule1Impl
						.pattern_VirtualNodeToRouterRule1_9_4_solveCSP_bindingAndBlackFBBBBBBB(this, isApplicableMatch,
								reqContainer, implContainer, virtualNode, router, reqContainerToImplContainer);
				if (result4_bindingAndBlack == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
							+ "[isApplicableMatch] = " + isApplicableMatch + ", " + "[reqContainer] = " + reqContainer
							+ ", " + "[implContainer] = " + implContainer + ", " + "[virtualNode] = " + virtualNode
							+ ", " + "[router] = " + router + ", " + "[reqContainerToImplContainer] = "
							+ reqContainerToImplContainer + ".");
				}
				CSP csp = (CSP) result4_bindingAndBlack[0];
				// 
				if (VirtualNodeToRouterRule1Impl.pattern_VirtualNodeToRouterRule1_9_5_checkCSP_expressionFBB(this,
						csp)) {

					Object[] result6_black = VirtualNodeToRouterRule1Impl
							.pattern_VirtualNodeToRouterRule1_9_6_addmatchtoruleresult_blackBB(ruleresult,
									isApplicableMatch);
					if (result6_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[ruleresult] = "
								+ ruleresult + ", " + "[isApplicableMatch] = " + isApplicableMatch + ".");
					}
					VirtualNodeToRouterRule1Impl.pattern_VirtualNodeToRouterRule1_9_6_addmatchtoruleresult_greenBB(
							ruleresult, isApplicableMatch);

				} else {
				}

			}

		}
		return VirtualNodeToRouterRule1Impl.pattern_VirtualNodeToRouterRule1_9_7_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void registerObjectsToMatch_BWD(Match match, implementation.Container implContainer, Router router) {
		match.registerObject("implContainer", implContainer);
		match.registerObject("router", router);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isAppropriate_solveCsp_BWD(Match match, implementation.Container implContainer, Router router) {// Create CSP
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
	public CSP isApplicable_solveCsp_BWD(IsApplicableMatch isApplicableMatch, Container reqContainer,
			implementation.Container implContainer, NetworkSpan virtualNode, Router router,
			ReqContainerToImplContainer reqContainerToImplContainer) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals

		// Create attribute variables

		// Create unbound variables

		// Create constraints

		// Solve CSP

		// Snapshot pattern match on which CSP is solved
		isApplicableMatch.registerObject("reqContainer", reqContainer);
		isApplicableMatch.registerObject("implContainer", implContainer);
		isApplicableMatch.registerObject("virtualNode", virtualNode);
		isApplicableMatch.registerObject("router", router);
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
	public void registerObjects_BWD(PerformRuleResult ruleresult, EObject reqContainer, EObject implContainer,
			EObject virtualNode, EObject virtualNodeToRouter, EObject router, EObject reqContainerToImplContainer) {
		ruleresult.registerObject("reqContainer", reqContainer);
		ruleresult.registerObject("implContainer", implContainer);
		ruleresult.registerObject("virtualNode", virtualNode);
		ruleresult.registerObject("virtualNodeToRouter", virtualNodeToRouter);
		ruleresult.registerObject("router", router);
		ruleresult.registerObject("reqContainerToImplContainer", reqContainerToImplContainer);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean checkTypes_BWD(Match match) {
		return true && org.moflon.util.eMoflonSDMUtil.getFQN(match.getObject("router").eClass())
				.equals("implementation.Router.");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_FWD_Container_0(Container reqContainer) {

		Object[] result1_bindingAndBlack = VirtualNodeToRouterRule1Impl
				.pattern_VirtualNodeToRouterRule1_17_1_preparereturnvalue_bindingAndBlackFFBF(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		EOperation isApplicableCC = (EOperation) result1_bindingAndBlack[3];
		Object[] result1_green = VirtualNodeToRouterRule1Impl
				.pattern_VirtualNodeToRouterRule1_17_1_preparereturnvalue_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach 
		for (Object[] result2_black : VirtualNodeToRouterRule1Impl
				.pattern_VirtualNodeToRouterRule1_17_2_testcorematchandDECs_blackBF(reqContainer)) {
			NetworkSpan virtualNode = (NetworkSpan) result2_black[1];
			Object[] result2_green = VirtualNodeToRouterRule1Impl
					.pattern_VirtualNodeToRouterRule1_17_2_testcorematchandDECs_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// 
			if (VirtualNodeToRouterRule1Impl
					.pattern_VirtualNodeToRouterRule1_17_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBB(
							this, match, reqContainer, virtualNode)) {
				// 
				if (VirtualNodeToRouterRule1Impl
						.pattern_VirtualNodeToRouterRule1_17_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(
								this, match)) {

					Object[] result5_black = VirtualNodeToRouterRule1Impl
							.pattern_VirtualNodeToRouterRule1_17_5_Addmatchtoruleresult_blackBBBB(match,
									__performOperation, __result, isApplicableCC);
					if (result5_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match
								+ ", " + "[__performOperation] = " + __performOperation + ", " + "[__result] = "
								+ __result + ", " + "[isApplicableCC] = " + isApplicableCC + ".");
					}
					VirtualNodeToRouterRule1Impl.pattern_VirtualNodeToRouterRule1_17_5_Addmatchtoruleresult_greenBBBB(
							match, __performOperation, __result, isApplicableCC);

				} else {
				}

			} else {
			}

		}
		return VirtualNodeToRouterRule1Impl.pattern_VirtualNodeToRouterRule1_17_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_BWD_EMoflonEdge_0(EMoflonEdge _edge_devices) {

		Object[] result1_bindingAndBlack = VirtualNodeToRouterRule1Impl
				.pattern_VirtualNodeToRouterRule1_18_1_preparereturnvalue_bindingAndBlackFFBF(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		EOperation isApplicableCC = (EOperation) result1_bindingAndBlack[3];
		Object[] result1_green = VirtualNodeToRouterRule1Impl
				.pattern_VirtualNodeToRouterRule1_18_1_preparereturnvalue_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach 
		for (Object[] result2_black : VirtualNodeToRouterRule1Impl
				.pattern_VirtualNodeToRouterRule1_18_2_testcorematchandDECs_blackFFB(_edge_devices)) {
			implementation.Container implContainer = (implementation.Container) result2_black[0];
			Router router = (Router) result2_black[1];
			Object[] result2_green = VirtualNodeToRouterRule1Impl
					.pattern_VirtualNodeToRouterRule1_18_2_testcorematchandDECs_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// 
			if (VirtualNodeToRouterRule1Impl
					.pattern_VirtualNodeToRouterRule1_18_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBB(
							this, match, implContainer, router)) {
				// 
				if (VirtualNodeToRouterRule1Impl
						.pattern_VirtualNodeToRouterRule1_18_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(
								this, match)) {

					Object[] result5_black = VirtualNodeToRouterRule1Impl
							.pattern_VirtualNodeToRouterRule1_18_5_Addmatchtoruleresult_blackBBBB(match,
									__performOperation, __result, isApplicableCC);
					if (result5_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match
								+ ", " + "[__performOperation] = " + __performOperation + ", " + "[__result] = "
								+ __result + ", " + "[isApplicableCC] = " + isApplicableCC + ".");
					}
					VirtualNodeToRouterRule1Impl.pattern_VirtualNodeToRouterRule1_18_5_Addmatchtoruleresult_greenBBBB(
							match, __performOperation, __result, isApplicableCC);

				} else {
				}

			} else {
			}

		}
		return VirtualNodeToRouterRule1Impl.pattern_VirtualNodeToRouterRule1_18_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AttributeConstraintsRuleResult checkAttributes_FWD(TripleMatch __tripleMatch) {
		AttributeConstraintsRuleResult ruleResult = org.moflon.tgg.runtime.RuntimeFactory.eINSTANCE
				.createAttributeConstraintsRuleResult();
		ruleResult.setRule("VirtualNodeToRouterRule1");
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
		ruleResult.setRule("VirtualNodeToRouterRule1");
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

		Object[] result1_black = VirtualNodeToRouterRule1Impl
				.pattern_VirtualNodeToRouterRule1_21_1_prepare_blackB(this);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		Object[] result1_green = VirtualNodeToRouterRule1Impl.pattern_VirtualNodeToRouterRule1_21_1_prepare_greenF();
		IsApplicableRuleResult result = (IsApplicableRuleResult) result1_green[0];

		Object[] result2_bindingAndBlack = VirtualNodeToRouterRule1Impl
				.pattern_VirtualNodeToRouterRule1_21_2_matchsrctrgcontext_bindingAndBlackFFFFBB(sourceMatch,
						targetMatch);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[sourceMatch] = " + sourceMatch
					+ ", " + "[targetMatch] = " + targetMatch + ".");
		}
		Container reqContainer = (Container) result2_bindingAndBlack[0];
		implementation.Container implContainer = (implementation.Container) result2_bindingAndBlack[1];
		NetworkSpan virtualNode = (NetworkSpan) result2_bindingAndBlack[2];
		Router router = (Router) result2_bindingAndBlack[3];

		Object[] result3_bindingAndBlack = VirtualNodeToRouterRule1Impl
				.pattern_VirtualNodeToRouterRule1_21_3_solvecsp_bindingAndBlackFBBBBBBB(this, reqContainer,
						implContainer, virtualNode, router, sourceMatch, targetMatch);
		if (result3_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[reqContainer] = " + reqContainer + ", " + "[implContainer] = " + implContainer + ", "
					+ "[virtualNode] = " + virtualNode + ", " + "[router] = " + router + ", " + "[sourceMatch] = "
					+ sourceMatch + ", " + "[targetMatch] = " + targetMatch + ".");
		}
		CSP csp = (CSP) result3_bindingAndBlack[0];
		// 
		if (VirtualNodeToRouterRule1Impl.pattern_VirtualNodeToRouterRule1_21_4_checkCSP_expressionFB(csp)) {
			// ForEach 
			for (Object[] result5_black : VirtualNodeToRouterRule1Impl
					.pattern_VirtualNodeToRouterRule1_21_5_matchcorrcontext_blackBBFBB(reqContainer, implContainer,
							sourceMatch, targetMatch)) {
				ReqContainerToImplContainer reqContainerToImplContainer = (ReqContainerToImplContainer) result5_black[2];
				Object[] result5_green = VirtualNodeToRouterRule1Impl
						.pattern_VirtualNodeToRouterRule1_21_5_matchcorrcontext_greenBBBF(reqContainerToImplContainer,
								sourceMatch, targetMatch);
				CCMatch ccMatch = (CCMatch) result5_green[3];

				Object[] result6_black = VirtualNodeToRouterRule1Impl
						.pattern_VirtualNodeToRouterRule1_21_6_createcorrespondence_blackBBBBB(reqContainer,
								implContainer, virtualNode, router, ccMatch);
				if (result6_black == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[reqContainer] = "
							+ reqContainer + ", " + "[implContainer] = " + implContainer + ", " + "[virtualNode] = "
							+ virtualNode + ", " + "[router] = " + router + ", " + "[ccMatch] = " + ccMatch + ".");
				}
				VirtualNodeToRouterRule1Impl.pattern_VirtualNodeToRouterRule1_21_6_createcorrespondence_greenBFBB(
						virtualNode, router, ccMatch);
				//nothing VirtualNodeToRouter virtualNodeToRouter = (VirtualNodeToRouter) result6_green[1];

				Object[] result7_black = VirtualNodeToRouterRule1Impl
						.pattern_VirtualNodeToRouterRule1_21_7_addtoreturnedresult_blackBB(result, ccMatch);
				if (result7_black == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[result] = " + result
							+ ", " + "[ccMatch] = " + ccMatch + ".");
				}
				VirtualNodeToRouterRule1Impl.pattern_VirtualNodeToRouterRule1_21_7_addtoreturnedresult_greenBB(result,
						ccMatch);

			}

		} else {
		}
		return VirtualNodeToRouterRule1Impl.pattern_VirtualNodeToRouterRule1_21_8_expressionFB(result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isApplicable_solveCsp_CC(Container reqContainer, implementation.Container implContainer,
			NetworkSpan virtualNode, Router router, Match sourceMatch, Match targetMatch) {// Create CSP
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
		Object[] result1_black = VirtualNodeToRouterRule1Impl
				.pattern_VirtualNodeToRouterRule1_24_1_matchtggpattern_blackBB(reqContainer, virtualNode);
		if (result1_black != null) {
			return VirtualNodeToRouterRule1Impl.pattern_VirtualNodeToRouterRule1_24_2_expressionF();
		} else {
			return VirtualNodeToRouterRule1Impl.pattern_VirtualNodeToRouterRule1_24_3_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean checkDEC_BWD(implementation.Container implContainer, Router router) {// 
		Object[] result1_black = VirtualNodeToRouterRule1Impl
				.pattern_VirtualNodeToRouterRule1_25_1_matchtggpattern_blackBB(implContainer, router);
		if (result1_black != null) {
			return VirtualNodeToRouterRule1Impl.pattern_VirtualNodeToRouterRule1_25_2_expressionF();
		} else {
			return VirtualNodeToRouterRule1Impl.pattern_VirtualNodeToRouterRule1_25_3_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModelgeneratorRuleResult generateModel(RuleEntryContainer ruleEntryContainer,
			ReqContainerToImplContainer reqContainerToImplContainerParameter) {

		Object[] result1_black = VirtualNodeToRouterRule1Impl
				.pattern_VirtualNodeToRouterRule1_26_1_createresult_blackB(this);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		Object[] result1_green = VirtualNodeToRouterRule1Impl
				.pattern_VirtualNodeToRouterRule1_26_1_createresult_greenFF();
		IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result1_green[0];
		ModelgeneratorRuleResult ruleResult = (ModelgeneratorRuleResult) result1_green[1];

		// ForEach 
		for (Object[] result2_black : VirtualNodeToRouterRule1Impl
				.pattern_VirtualNodeToRouterRule1_26_2_isapplicablecore_blackFFFFFBB(ruleEntryContainer, ruleResult)) {
			//nothing RuleEntryList reqContainerToImplContainerList = (RuleEntryList) result2_black[0];
			Container reqContainer = (Container) result2_black[1];
			NetworkSpan virtualNode = (NetworkSpan) result2_black[2];
			ReqContainerToImplContainer reqContainerToImplContainer = (ReqContainerToImplContainer) result2_black[3];
			implementation.Container implContainer = (implementation.Container) result2_black[4];

			Object[] result3_bindingAndBlack = VirtualNodeToRouterRule1Impl
					.pattern_VirtualNodeToRouterRule1_26_3_solveCSP_bindingAndBlackFBBBBBBB(this, isApplicableMatch,
							reqContainer, implContainer, virtualNode, reqContainerToImplContainer, ruleResult);
			if (result3_bindingAndBlack == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
						+ "[isApplicableMatch] = " + isApplicableMatch + ", " + "[reqContainer] = " + reqContainer
						+ ", " + "[implContainer] = " + implContainer + ", " + "[virtualNode] = " + virtualNode + ", "
						+ "[reqContainerToImplContainer] = " + reqContainerToImplContainer + ", " + "[ruleResult] = "
						+ ruleResult + ".");
			}
			CSP csp = (CSP) result3_bindingAndBlack[0];
			// 
			if (VirtualNodeToRouterRule1Impl.pattern_VirtualNodeToRouterRule1_26_4_checkCSP_expressionFBB(this, csp)) {
				// 
				Object[] result5_black = VirtualNodeToRouterRule1Impl
						.pattern_VirtualNodeToRouterRule1_26_5_checknacs_blackBBBB(reqContainer, implContainer,
								virtualNode, reqContainerToImplContainer);
				if (result5_black != null) {

					Object[] result6_black = VirtualNodeToRouterRule1Impl
							.pattern_VirtualNodeToRouterRule1_26_6_perform_blackBBBBB(reqContainer, implContainer,
									virtualNode, reqContainerToImplContainer, ruleResult);
					if (result6_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[reqContainer] = "
								+ reqContainer + ", " + "[implContainer] = " + implContainer + ", " + "[virtualNode] = "
								+ virtualNode + ", " + "[reqContainerToImplContainer] = " + reqContainerToImplContainer
								+ ", " + "[ruleResult] = " + ruleResult + ".");
					}
					VirtualNodeToRouterRule1Impl.pattern_VirtualNodeToRouterRule1_26_6_perform_greenBBFFB(implContainer,
							virtualNode, ruleResult);
					//nothing VirtualNodeToRouter virtualNodeToRouter = (VirtualNodeToRouter) result6_green[2];
					//nothing Router router = (Router) result6_green[3];

				} else {
				}

			} else {
			}

		}
		return VirtualNodeToRouterRule1Impl.pattern_VirtualNodeToRouterRule1_26_7_expressionFB(ruleResult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP generateModel_solveCsp_BWD(IsApplicableMatch isApplicableMatch, Container reqContainer,
			implementation.Container implContainer, NetworkSpan virtualNode,
			ReqContainerToImplContainer reqContainerToImplContainer, ModelgeneratorRuleResult ruleResult) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals

		// Create attribute variables

		// Create unbound variables

		// Create constraints

		// Solve CSP

		// Snapshot pattern match on which CSP is solved
		isApplicableMatch.registerObject("reqContainer", reqContainer);
		isApplicableMatch.registerObject("implContainer", implContainer);
		isApplicableMatch.registerObject("virtualNode", virtualNode);
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
		case RulesPackage.VIRTUAL_NODE_TO_ROUTER_RULE1___IS_APPROPRIATE_FWD__MATCH_CONTAINER_NETWORKSPAN:
			return isAppropriate_FWD((Match) arguments.get(0), (Container) arguments.get(1),
					(NetworkSpan) arguments.get(2));
		case RulesPackage.VIRTUAL_NODE_TO_ROUTER_RULE1___PERFORM_FWD__ISAPPLICABLEMATCH:
			return perform_FWD((IsApplicableMatch) arguments.get(0));
		case RulesPackage.VIRTUAL_NODE_TO_ROUTER_RULE1___IS_APPLICABLE_FWD__MATCH:
			return isApplicable_FWD((Match) arguments.get(0));
		case RulesPackage.VIRTUAL_NODE_TO_ROUTER_RULE1___REGISTER_OBJECTS_TO_MATCH_FWD__MATCH_CONTAINER_NETWORKSPAN:
			registerObjectsToMatch_FWD((Match) arguments.get(0), (Container) arguments.get(1),
					(NetworkSpan) arguments.get(2));
			return null;
		case RulesPackage.VIRTUAL_NODE_TO_ROUTER_RULE1___IS_APPROPRIATE_SOLVE_CSP_FWD__MATCH_CONTAINER_NETWORKSPAN:
			return isAppropriate_solveCsp_FWD((Match) arguments.get(0), (Container) arguments.get(1),
					(NetworkSpan) arguments.get(2));
		case RulesPackage.VIRTUAL_NODE_TO_ROUTER_RULE1___IS_APPROPRIATE_CHECK_CSP_FWD__CSP:
			return isAppropriate_checkCsp_FWD((CSP) arguments.get(0));
		case RulesPackage.VIRTUAL_NODE_TO_ROUTER_RULE1___CHECK_TYPES_FWD__MATCH:
			return checkTypes_FWD((Match) arguments.get(0));
		case RulesPackage.VIRTUAL_NODE_TO_ROUTER_RULE1___IS_APPROPRIATE_BWD__MATCH_CONTAINER_ROUTER:
			return isAppropriate_BWD((Match) arguments.get(0), (implementation.Container) arguments.get(1),
					(Router) arguments.get(2));
		case RulesPackage.VIRTUAL_NODE_TO_ROUTER_RULE1___PERFORM_BWD__ISAPPLICABLEMATCH:
			return perform_BWD((IsApplicableMatch) arguments.get(0));
		case RulesPackage.VIRTUAL_NODE_TO_ROUTER_RULE1___IS_APPLICABLE_BWD__MATCH:
			return isApplicable_BWD((Match) arguments.get(0));
		case RulesPackage.VIRTUAL_NODE_TO_ROUTER_RULE1___REGISTER_OBJECTS_TO_MATCH_BWD__MATCH_CONTAINER_ROUTER:
			registerObjectsToMatch_BWD((Match) arguments.get(0), (implementation.Container) arguments.get(1),
					(Router) arguments.get(2));
			return null;
		case RulesPackage.VIRTUAL_NODE_TO_ROUTER_RULE1___IS_APPROPRIATE_SOLVE_CSP_BWD__MATCH_CONTAINER_ROUTER:
			return isAppropriate_solveCsp_BWD((Match) arguments.get(0), (implementation.Container) arguments.get(1),
					(Router) arguments.get(2));
		case RulesPackage.VIRTUAL_NODE_TO_ROUTER_RULE1___IS_APPROPRIATE_CHECK_CSP_BWD__CSP:
			return isAppropriate_checkCsp_BWD((CSP) arguments.get(0));
		case RulesPackage.VIRTUAL_NODE_TO_ROUTER_RULE1___IS_APPLICABLE_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_CONTAINER_CONTAINER_NETWORKSPAN_ROUTER_REQCONTAINERTOIMPLCONTAINER:
			return isApplicable_solveCsp_BWD((IsApplicableMatch) arguments.get(0), (Container) arguments.get(1),
					(implementation.Container) arguments.get(2), (NetworkSpan) arguments.get(3),
					(Router) arguments.get(4), (ReqContainerToImplContainer) arguments.get(5));
		case RulesPackage.VIRTUAL_NODE_TO_ROUTER_RULE1___IS_APPLICABLE_CHECK_CSP_BWD__CSP:
			return isApplicable_checkCsp_BWD((CSP) arguments.get(0));
		case RulesPackage.VIRTUAL_NODE_TO_ROUTER_RULE1___REGISTER_OBJECTS_BWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT:
			registerObjects_BWD((PerformRuleResult) arguments.get(0), (EObject) arguments.get(1),
					(EObject) arguments.get(2), (EObject) arguments.get(3), (EObject) arguments.get(4),
					(EObject) arguments.get(5), (EObject) arguments.get(6));
			return null;
		case RulesPackage.VIRTUAL_NODE_TO_ROUTER_RULE1___CHECK_TYPES_BWD__MATCH:
			return checkTypes_BWD((Match) arguments.get(0));
		case RulesPackage.VIRTUAL_NODE_TO_ROUTER_RULE1___IS_APPROPRIATE_FWD_CONTAINER_0__CONTAINER:
			return isAppropriate_FWD_Container_0((Container) arguments.get(0));
		case RulesPackage.VIRTUAL_NODE_TO_ROUTER_RULE1___IS_APPROPRIATE_BWD_EMOFLON_EDGE_0__EMOFLONEDGE:
			return isAppropriate_BWD_EMoflonEdge_0((EMoflonEdge) arguments.get(0));
		case RulesPackage.VIRTUAL_NODE_TO_ROUTER_RULE1___CHECK_ATTRIBUTES_FWD__TRIPLEMATCH:
			return checkAttributes_FWD((TripleMatch) arguments.get(0));
		case RulesPackage.VIRTUAL_NODE_TO_ROUTER_RULE1___CHECK_ATTRIBUTES_BWD__TRIPLEMATCH:
			return checkAttributes_BWD((TripleMatch) arguments.get(0));
		case RulesPackage.VIRTUAL_NODE_TO_ROUTER_RULE1___IS_APPLICABLE_CC__MATCH_MATCH:
			return isApplicable_CC((Match) arguments.get(0), (Match) arguments.get(1));
		case RulesPackage.VIRTUAL_NODE_TO_ROUTER_RULE1___IS_APPLICABLE_SOLVE_CSP_CC__CONTAINER_CONTAINER_NETWORKSPAN_ROUTER_MATCH_MATCH:
			return isApplicable_solveCsp_CC((Container) arguments.get(0), (implementation.Container) arguments.get(1),
					(NetworkSpan) arguments.get(2), (Router) arguments.get(3), (Match) arguments.get(4),
					(Match) arguments.get(5));
		case RulesPackage.VIRTUAL_NODE_TO_ROUTER_RULE1___IS_APPLICABLE_CHECK_CSP_CC__CSP:
			return isApplicable_checkCsp_CC((CSP) arguments.get(0));
		case RulesPackage.VIRTUAL_NODE_TO_ROUTER_RULE1___CHECK_DEC_FWD__CONTAINER_NETWORKSPAN:
			return checkDEC_FWD((Container) arguments.get(0), (NetworkSpan) arguments.get(1));
		case RulesPackage.VIRTUAL_NODE_TO_ROUTER_RULE1___CHECK_DEC_BWD__CONTAINER_ROUTER:
			return checkDEC_BWD((implementation.Container) arguments.get(0), (Router) arguments.get(1));
		case RulesPackage.VIRTUAL_NODE_TO_ROUTER_RULE1___GENERATE_MODEL__RULEENTRYCONTAINER_REQCONTAINERTOIMPLCONTAINER:
			return generateModel((RuleEntryContainer) arguments.get(0), (ReqContainerToImplContainer) arguments.get(1));
		case RulesPackage.VIRTUAL_NODE_TO_ROUTER_RULE1___GENERATE_MODEL_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_CONTAINER_CONTAINER_NETWORKSPAN_REQCONTAINERTOIMPLCONTAINER_MODELGENERATORRULERESULT:
			return generateModel_solveCsp_BWD((IsApplicableMatch) arguments.get(0), (Container) arguments.get(1),
					(implementation.Container) arguments.get(2), (NetworkSpan) arguments.get(3),
					(ReqContainerToImplContainer) arguments.get(4), (ModelgeneratorRuleResult) arguments.get(5));
		case RulesPackage.VIRTUAL_NODE_TO_ROUTER_RULE1___GENERATE_MODEL_CHECK_CSP_BWD__CSP:
			return generateModel_checkCsp_BWD((CSP) arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
	}

	public static final Object[] pattern_VirtualNodeToRouterRule1_0_1_initialbindings_blackBBBB(
			VirtualNodeToRouterRule1 _this, Match match, Container reqContainer, NetworkSpan virtualNode) {
		return new Object[] { _this, match, reqContainer, virtualNode };
	}

	public static final Object[] pattern_VirtualNodeToRouterRule1_0_2_SolveCSP_bindingFBBBB(
			VirtualNodeToRouterRule1 _this, Match match, Container reqContainer, NetworkSpan virtualNode) {
		CSP _localVariable_0 = _this.isAppropriate_solveCsp_FWD(match, reqContainer, virtualNode);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, match, reqContainer, virtualNode };
		}
		return null;
	}

	public static final Object[] pattern_VirtualNodeToRouterRule1_0_2_SolveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_VirtualNodeToRouterRule1_0_2_SolveCSP_bindingAndBlackFBBBB(
			VirtualNodeToRouterRule1 _this, Match match, Container reqContainer, NetworkSpan virtualNode) {
		Object[] result_pattern_VirtualNodeToRouterRule1_0_2_SolveCSP_binding = pattern_VirtualNodeToRouterRule1_0_2_SolveCSP_bindingFBBBB(
				_this, match, reqContainer, virtualNode);
		if (result_pattern_VirtualNodeToRouterRule1_0_2_SolveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_VirtualNodeToRouterRule1_0_2_SolveCSP_binding[0];

			Object[] result_pattern_VirtualNodeToRouterRule1_0_2_SolveCSP_black = pattern_VirtualNodeToRouterRule1_0_2_SolveCSP_blackB(
					csp);
			if (result_pattern_VirtualNodeToRouterRule1_0_2_SolveCSP_black != null) {

				return new Object[] { csp, _this, match, reqContainer, virtualNode };
			}
		}
		return null;
	}

	public static final boolean pattern_VirtualNodeToRouterRule1_0_3_CheckCSP_expressionFBB(
			VirtualNodeToRouterRule1 _this, CSP csp) {
		boolean _localVariable_0 = _this.isAppropriate_checkCsp_FWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_VirtualNodeToRouterRule1_0_4_collectelementstobetranslated_blackBBB(
			Match match, Container reqContainer, NetworkSpan virtualNode) {
		return new Object[] { match, reqContainer, virtualNode };
	}

	public static final Object[] pattern_VirtualNodeToRouterRule1_0_5_collectcontextelements_blackBBB(Match match,
			Container reqContainer, NetworkSpan virtualNode) {
		return new Object[] { match, reqContainer, virtualNode };
	}

	public static final Object[] pattern_VirtualNodeToRouterRule1_0_5_collectcontextelements_greenBBBF(Match match,
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

	public static final void pattern_VirtualNodeToRouterRule1_0_6_registerobjectstomatch_expressionBBBB(
			VirtualNodeToRouterRule1 _this, Match match, Container reqContainer, NetworkSpan virtualNode) {
		_this.registerObjectsToMatch_FWD(match, reqContainer, virtualNode);

	}

	public static final boolean pattern_VirtualNodeToRouterRule1_0_7_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_VirtualNodeToRouterRule1_0_8_expressionF() {
		boolean _result = Boolean.valueOf(false);
		return _result;
	}

	public static final Object[] pattern_VirtualNodeToRouterRule1_7_1_initialbindings_blackBBBB(
			VirtualNodeToRouterRule1 _this, Match match, implementation.Container implContainer, Router router) {
		return new Object[] { _this, match, implContainer, router };
	}

	public static final Object[] pattern_VirtualNodeToRouterRule1_7_2_SolveCSP_bindingFBBBB(
			VirtualNodeToRouterRule1 _this, Match match, implementation.Container implContainer, Router router) {
		CSP _localVariable_0 = _this.isAppropriate_solveCsp_BWD(match, implContainer, router);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, match, implContainer, router };
		}
		return null;
	}

	public static final Object[] pattern_VirtualNodeToRouterRule1_7_2_SolveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_VirtualNodeToRouterRule1_7_2_SolveCSP_bindingAndBlackFBBBB(
			VirtualNodeToRouterRule1 _this, Match match, implementation.Container implContainer, Router router) {
		Object[] result_pattern_VirtualNodeToRouterRule1_7_2_SolveCSP_binding = pattern_VirtualNodeToRouterRule1_7_2_SolveCSP_bindingFBBBB(
				_this, match, implContainer, router);
		if (result_pattern_VirtualNodeToRouterRule1_7_2_SolveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_VirtualNodeToRouterRule1_7_2_SolveCSP_binding[0];

			Object[] result_pattern_VirtualNodeToRouterRule1_7_2_SolveCSP_black = pattern_VirtualNodeToRouterRule1_7_2_SolveCSP_blackB(
					csp);
			if (result_pattern_VirtualNodeToRouterRule1_7_2_SolveCSP_black != null) {

				return new Object[] { csp, _this, match, implContainer, router };
			}
		}
		return null;
	}

	public static final boolean pattern_VirtualNodeToRouterRule1_7_3_CheckCSP_expressionFBB(
			VirtualNodeToRouterRule1 _this, CSP csp) {
		boolean _localVariable_0 = _this.isAppropriate_checkCsp_BWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_VirtualNodeToRouterRule1_7_4_collectelementstobetranslated_blackBBB(
			Match match, implementation.Container implContainer, Router router) {
		return new Object[] { match, implContainer, router };
	}

	public static final Object[] pattern_VirtualNodeToRouterRule1_7_4_collectelementstobetranslated_greenBBBF(
			Match match, implementation.Container implContainer, Router router) {
		EMoflonEdge implContainer__router____devices = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		match.getToBeTranslatedNodes().add(router);
		String implContainer__router____devices_name_prime = "devices";
		implContainer__router____devices.setSrc(implContainer);
		implContainer__router____devices.setTrg(router);
		match.getToBeTranslatedEdges().add(implContainer__router____devices);
		implContainer__router____devices.setName(implContainer__router____devices_name_prime);
		return new Object[] { match, implContainer, router, implContainer__router____devices };
	}

	public static final Object[] pattern_VirtualNodeToRouterRule1_7_5_collectcontextelements_blackBBB(Match match,
			implementation.Container implContainer, Router router) {
		return new Object[] { match, implContainer, router };
	}

	public static final Object[] pattern_VirtualNodeToRouterRule1_7_5_collectcontextelements_greenBB(Match match,
			implementation.Container implContainer) {
		match.getContextNodes().add(implContainer);
		return new Object[] { match, implContainer };
	}

	public static final void pattern_VirtualNodeToRouterRule1_7_6_registerobjectstomatch_expressionBBBB(
			VirtualNodeToRouterRule1 _this, Match match, implementation.Container implContainer, Router router) {
		_this.registerObjectsToMatch_BWD(match, implContainer, router);

	}

	public static final boolean pattern_VirtualNodeToRouterRule1_7_7_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_VirtualNodeToRouterRule1_7_8_expressionF() {
		boolean _result = Boolean.valueOf(false);
		return _result;
	}

	public static final Object[] pattern_VirtualNodeToRouterRule1_8_1_performtransformation_bindingFFFFFB(
			IsApplicableMatch isApplicableMatch) {
		EObject _localVariable_0 = isApplicableMatch.getObject("reqContainer");
		EObject _localVariable_1 = isApplicableMatch.getObject("implContainer");
		EObject _localVariable_2 = isApplicableMatch.getObject("virtualNode");
		EObject _localVariable_3 = isApplicableMatch.getObject("router");
		EObject _localVariable_4 = isApplicableMatch.getObject("reqContainerToImplContainer");
		EObject tmpReqContainer = _localVariable_0;
		EObject tmpImplContainer = _localVariable_1;
		EObject tmpVirtualNode = _localVariable_2;
		EObject tmpRouter = _localVariable_3;
		EObject tmpReqContainerToImplContainer = _localVariable_4;
		if (tmpReqContainer instanceof Container) {
			Container reqContainer = (Container) tmpReqContainer;
			if (tmpImplContainer instanceof implementation.Container) {
				implementation.Container implContainer = (implementation.Container) tmpImplContainer;
				if (tmpVirtualNode instanceof NetworkSpan) {
					NetworkSpan virtualNode = (NetworkSpan) tmpVirtualNode;
					if (tmpRouter instanceof Router) {
						Router router = (Router) tmpRouter;
						if (tmpReqContainerToImplContainer instanceof ReqContainerToImplContainer) {
							ReqContainerToImplContainer reqContainerToImplContainer = (ReqContainerToImplContainer) tmpReqContainerToImplContainer;
							return new Object[] { reqContainer, implContainer, virtualNode, router,
									reqContainerToImplContainer, isApplicableMatch };
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_VirtualNodeToRouterRule1_8_1_performtransformation_blackBBBBBFBB(
			Container reqContainer, implementation.Container implContainer, NetworkSpan virtualNode, Router router,
			ReqContainerToImplContainer reqContainerToImplContainer, VirtualNodeToRouterRule1 _this,
			IsApplicableMatch isApplicableMatch) {
		for (EObject tmpCsp : isApplicableMatch.getAttributeInfo()) {
			if (tmpCsp instanceof CSP) {
				CSP csp = (CSP) tmpCsp;
				return new Object[] { reqContainer, implContainer, virtualNode, router, reqContainerToImplContainer,
						csp, _this, isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_VirtualNodeToRouterRule1_8_1_performtransformation_bindingAndBlackFFFFFFBB(
			VirtualNodeToRouterRule1 _this, IsApplicableMatch isApplicableMatch) {
		Object[] result_pattern_VirtualNodeToRouterRule1_8_1_performtransformation_binding = pattern_VirtualNodeToRouterRule1_8_1_performtransformation_bindingFFFFFB(
				isApplicableMatch);
		if (result_pattern_VirtualNodeToRouterRule1_8_1_performtransformation_binding != null) {
			Container reqContainer = (Container) result_pattern_VirtualNodeToRouterRule1_8_1_performtransformation_binding[0];
			implementation.Container implContainer = (implementation.Container) result_pattern_VirtualNodeToRouterRule1_8_1_performtransformation_binding[1];
			NetworkSpan virtualNode = (NetworkSpan) result_pattern_VirtualNodeToRouterRule1_8_1_performtransformation_binding[2];
			Router router = (Router) result_pattern_VirtualNodeToRouterRule1_8_1_performtransformation_binding[3];
			ReqContainerToImplContainer reqContainerToImplContainer = (ReqContainerToImplContainer) result_pattern_VirtualNodeToRouterRule1_8_1_performtransformation_binding[4];

			Object[] result_pattern_VirtualNodeToRouterRule1_8_1_performtransformation_black = pattern_VirtualNodeToRouterRule1_8_1_performtransformation_blackBBBBBFBB(
					reqContainer, implContainer, virtualNode, router, reqContainerToImplContainer, _this,
					isApplicableMatch);
			if (result_pattern_VirtualNodeToRouterRule1_8_1_performtransformation_black != null) {
				CSP csp = (CSP) result_pattern_VirtualNodeToRouterRule1_8_1_performtransformation_black[5];

				return new Object[] { reqContainer, implContainer, virtualNode, router, reqContainerToImplContainer,
						csp, _this, isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_VirtualNodeToRouterRule1_8_1_performtransformation_greenBFB(
			NetworkSpan virtualNode, Router router) {
		VirtualNodeToRouter virtualNodeToRouter = ReqToImpTransformatorFactory.eINSTANCE.createVirtualNodeToRouter();
		virtualNodeToRouter.setSource(virtualNode);
		virtualNodeToRouter.setTarget(router);
		return new Object[] { virtualNode, virtualNodeToRouter, router };
	}

	public static final Object[] pattern_VirtualNodeToRouterRule1_8_2_collecttranslatedelements_blackBB(
			VirtualNodeToRouter virtualNodeToRouter, Router router) {
		return new Object[] { virtualNodeToRouter, router };
	}

	public static final Object[] pattern_VirtualNodeToRouterRule1_8_2_collecttranslatedelements_greenFBB(
			VirtualNodeToRouter virtualNodeToRouter, Router router) {
		PerformRuleResult ruleresult = RuntimeFactory.eINSTANCE.createPerformRuleResult();
		ruleresult.getCreatedLinkElements().add(virtualNodeToRouter);
		ruleresult.getTranslatedElements().add(router);
		return new Object[] { ruleresult, virtualNodeToRouter, router };
	}

	public static final Object[] pattern_VirtualNodeToRouterRule1_8_3_bookkeepingforedges_blackBBBBBBB(
			PerformRuleResult ruleresult, EObject reqContainer, EObject implContainer, EObject virtualNode,
			EObject virtualNodeToRouter, EObject router, EObject reqContainerToImplContainer) {
		if (!reqContainer.equals(virtualNode)) {
			if (!reqContainer.equals(virtualNodeToRouter)) {
				if (!reqContainer.equals(router)) {
					if (!reqContainer.equals(reqContainerToImplContainer)) {
						if (!implContainer.equals(reqContainer)) {
							if (!implContainer.equals(virtualNode)) {
								if (!implContainer.equals(virtualNodeToRouter)) {
									if (!implContainer.equals(router)) {
										if (!implContainer.equals(reqContainerToImplContainer)) {
											if (!virtualNode.equals(virtualNodeToRouter)) {
												if (!router.equals(virtualNode)) {
													if (!router.equals(virtualNodeToRouter)) {
														if (!reqContainerToImplContainer.equals(virtualNode)) {
															if (!reqContainerToImplContainer
																	.equals(virtualNodeToRouter)) {
																if (!reqContainerToImplContainer.equals(router)) {
																	return new Object[] { ruleresult, reqContainer,
																			implContainer, virtualNode,
																			virtualNodeToRouter, router,
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
		return null;
	}

	public static final Object[] pattern_VirtualNodeToRouterRule1_8_3_bookkeepingforedges_greenBBBBBFFF(
			PerformRuleResult ruleresult, EObject implContainer, EObject virtualNode, EObject virtualNodeToRouter,
			EObject router) {
		EMoflonEdge virtualNodeToRouter__virtualNode____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge virtualNodeToRouter__router____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge implContainer__router____devices = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String ruleresult_ruleName_prime = "VirtualNodeToRouterRule1";
		String virtualNodeToRouter__virtualNode____source_name_prime = "source";
		String virtualNodeToRouter__router____target_name_prime = "target";
		String implContainer__router____devices_name_prime = "devices";
		virtualNodeToRouter__virtualNode____source.setSrc(virtualNodeToRouter);
		virtualNodeToRouter__virtualNode____source.setTrg(virtualNode);
		ruleresult.getCreatedEdges().add(virtualNodeToRouter__virtualNode____source);
		virtualNodeToRouter__router____target.setSrc(virtualNodeToRouter);
		virtualNodeToRouter__router____target.setTrg(router);
		ruleresult.getCreatedEdges().add(virtualNodeToRouter__router____target);
		implContainer__router____devices.setSrc(implContainer);
		implContainer__router____devices.setTrg(router);
		ruleresult.getTranslatedEdges().add(implContainer__router____devices);
		ruleresult.setRuleName(ruleresult_ruleName_prime);
		virtualNodeToRouter__virtualNode____source.setName(virtualNodeToRouter__virtualNode____source_name_prime);
		virtualNodeToRouter__router____target.setName(virtualNodeToRouter__router____target_name_prime);
		implContainer__router____devices.setName(implContainer__router____devices_name_prime);
		return new Object[] { ruleresult, implContainer, virtualNode, virtualNodeToRouter, router,
				virtualNodeToRouter__virtualNode____source, virtualNodeToRouter__router____target,
				implContainer__router____devices };
	}

	public static final void pattern_VirtualNodeToRouterRule1_8_5_registerobjects_expressionBBBBBBBB(
			VirtualNodeToRouterRule1 _this, PerformRuleResult ruleresult, EObject reqContainer, EObject implContainer,
			EObject virtualNode, EObject virtualNodeToRouter, EObject router, EObject reqContainerToImplContainer) {
		_this.registerObjects_BWD(ruleresult, reqContainer, implContainer, virtualNode, virtualNodeToRouter, router,
				reqContainerToImplContainer);

	}

	public static final PerformRuleResult pattern_VirtualNodeToRouterRule1_8_6_expressionFB(
			PerformRuleResult ruleresult) {
		PerformRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_VirtualNodeToRouterRule1_9_1_preparereturnvalue_bindingFB(
			VirtualNodeToRouterRule1 _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass eClass = _localVariable_0;
		if (eClass != null) {
			return new Object[] { eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_VirtualNodeToRouterRule1_9_1_preparereturnvalue_blackFBB(EClass eClass,
			VirtualNodeToRouterRule1 _this) {
		for (EOperation performOperation : eClass.getEOperations()) {
			String performOperation_name = performOperation.getName();
			if (performOperation_name.equals("perform_BWD")) {
				return new Object[] { performOperation, eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_VirtualNodeToRouterRule1_9_1_preparereturnvalue_bindingAndBlackFFB(
			VirtualNodeToRouterRule1 _this) {
		Object[] result_pattern_VirtualNodeToRouterRule1_9_1_preparereturnvalue_binding = pattern_VirtualNodeToRouterRule1_9_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_VirtualNodeToRouterRule1_9_1_preparereturnvalue_binding != null) {
			EClass eClass = (EClass) result_pattern_VirtualNodeToRouterRule1_9_1_preparereturnvalue_binding[0];

			Object[] result_pattern_VirtualNodeToRouterRule1_9_1_preparereturnvalue_black = pattern_VirtualNodeToRouterRule1_9_1_preparereturnvalue_blackFBB(
					eClass, _this);
			if (result_pattern_VirtualNodeToRouterRule1_9_1_preparereturnvalue_black != null) {
				EOperation performOperation = (EOperation) result_pattern_VirtualNodeToRouterRule1_9_1_preparereturnvalue_black[0];

				return new Object[] { performOperation, eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_VirtualNodeToRouterRule1_9_1_preparereturnvalue_greenBF(
			EOperation performOperation) {
		IsApplicableRuleResult ruleresult = RuntimeFactory.eINSTANCE.createIsApplicableRuleResult();
		boolean ruleresult_success_prime = Boolean.valueOf(false);
		String ruleresult_rule_prime = "VirtualNodeToRouterRule1";
		ruleresult.setPerformOperation(performOperation);
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		ruleresult.setRule(ruleresult_rule_prime);
		return new Object[] { performOperation, ruleresult };
	}

	public static final Object[] pattern_VirtualNodeToRouterRule1_9_2_corematch_bindingFFB(Match match) {
		EObject _localVariable_0 = match.getObject("implContainer");
		EObject _localVariable_1 = match.getObject("router");
		EObject tmpImplContainer = _localVariable_0;
		EObject tmpRouter = _localVariable_1;
		if (tmpImplContainer instanceof implementation.Container) {
			implementation.Container implContainer = (implementation.Container) tmpImplContainer;
			if (tmpRouter instanceof Router) {
				Router router = (Router) tmpRouter;
				return new Object[] { implContainer, router, match };
			}
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_VirtualNodeToRouterRule1_9_2_corematch_blackFBBFB(
			implementation.Container implContainer, Router router, Match match) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		for (ReqContainerToImplContainer reqContainerToImplContainer : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(implContainer, ReqContainerToImplContainer.class, "target")) {
			Container reqContainer = reqContainerToImplContainer.getSource();
			if (reqContainer != null) {
				_result.add(new Object[] { reqContainer, implContainer, router, reqContainerToImplContainer, match });
			}

		}
		return _result;
	}

	public static final Iterable<Object[]> pattern_VirtualNodeToRouterRule1_9_3_findcontext_blackBBFBB(
			Container reqContainer, implementation.Container implContainer, Router router,
			ReqContainerToImplContainer reqContainerToImplContainer) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (implContainer.equals(reqContainerToImplContainer.getTarget())) {
			if (implContainer.getDevices().contains(router)) {
				if (reqContainer.equals(reqContainerToImplContainer.getSource())) {
					NetworkSpan virtualNode = reqContainer.getNetworkSpan();
					if (virtualNode != null) {
						_result.add(new Object[] { reqContainer, implContainer, virtualNode, router,
								reqContainerToImplContainer });
					}

				}
			}
		}
		return _result;
	}

	public static final Object[] pattern_VirtualNodeToRouterRule1_9_3_findcontext_greenBBBBBFFFFF(
			Container reqContainer, implementation.Container implContainer, NetworkSpan virtualNode, Router router,
			ReqContainerToImplContainer reqContainerToImplContainer) {
		IsApplicableMatch isApplicableMatch = RuntimeFactory.eINSTANCE.createIsApplicableMatch();
		EMoflonEdge reqContainer__virtualNode____networkSpan = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge reqContainerToImplContainer__implContainer____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge implContainer__router____devices = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge reqContainerToImplContainer__reqContainer____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String reqContainer__virtualNode____networkSpan_name_prime = "networkSpan";
		String reqContainerToImplContainer__implContainer____target_name_prime = "target";
		String implContainer__router____devices_name_prime = "devices";
		String reqContainerToImplContainer__reqContainer____source_name_prime = "source";
		isApplicableMatch.getAllContextElements().add(reqContainer);
		isApplicableMatch.getAllContextElements().add(implContainer);
		isApplicableMatch.getAllContextElements().add(virtualNode);
		isApplicableMatch.getAllContextElements().add(router);
		isApplicableMatch.getAllContextElements().add(reqContainerToImplContainer);
		reqContainer__virtualNode____networkSpan.setSrc(reqContainer);
		reqContainer__virtualNode____networkSpan.setTrg(virtualNode);
		isApplicableMatch.getAllContextElements().add(reqContainer__virtualNode____networkSpan);
		reqContainerToImplContainer__implContainer____target.setSrc(reqContainerToImplContainer);
		reqContainerToImplContainer__implContainer____target.setTrg(implContainer);
		isApplicableMatch.getAllContextElements().add(reqContainerToImplContainer__implContainer____target);
		implContainer__router____devices.setSrc(implContainer);
		implContainer__router____devices.setTrg(router);
		isApplicableMatch.getAllContextElements().add(implContainer__router____devices);
		reqContainerToImplContainer__reqContainer____source.setSrc(reqContainerToImplContainer);
		reqContainerToImplContainer__reqContainer____source.setTrg(reqContainer);
		isApplicableMatch.getAllContextElements().add(reqContainerToImplContainer__reqContainer____source);
		reqContainer__virtualNode____networkSpan.setName(reqContainer__virtualNode____networkSpan_name_prime);
		reqContainerToImplContainer__implContainer____target
				.setName(reqContainerToImplContainer__implContainer____target_name_prime);
		implContainer__router____devices.setName(implContainer__router____devices_name_prime);
		reqContainerToImplContainer__reqContainer____source
				.setName(reqContainerToImplContainer__reqContainer____source_name_prime);
		return new Object[] { reqContainer, implContainer, virtualNode, router, reqContainerToImplContainer,
				isApplicableMatch, reqContainer__virtualNode____networkSpan,
				reqContainerToImplContainer__implContainer____target, implContainer__router____devices,
				reqContainerToImplContainer__reqContainer____source };
	}

	public static final Object[] pattern_VirtualNodeToRouterRule1_9_4_solveCSP_bindingFBBBBBBB(
			VirtualNodeToRouterRule1 _this, IsApplicableMatch isApplicableMatch, Container reqContainer,
			implementation.Container implContainer, NetworkSpan virtualNode, Router router,
			ReqContainerToImplContainer reqContainerToImplContainer) {
		CSP _localVariable_0 = _this.isApplicable_solveCsp_BWD(isApplicableMatch, reqContainer, implContainer,
				virtualNode, router, reqContainerToImplContainer);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, reqContainer, implContainer, virtualNode, router,
					reqContainerToImplContainer };
		}
		return null;
	}

	public static final Object[] pattern_VirtualNodeToRouterRule1_9_4_solveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_VirtualNodeToRouterRule1_9_4_solveCSP_bindingAndBlackFBBBBBBB(
			VirtualNodeToRouterRule1 _this, IsApplicableMatch isApplicableMatch, Container reqContainer,
			implementation.Container implContainer, NetworkSpan virtualNode, Router router,
			ReqContainerToImplContainer reqContainerToImplContainer) {
		Object[] result_pattern_VirtualNodeToRouterRule1_9_4_solveCSP_binding = pattern_VirtualNodeToRouterRule1_9_4_solveCSP_bindingFBBBBBBB(
				_this, isApplicableMatch, reqContainer, implContainer, virtualNode, router,
				reqContainerToImplContainer);
		if (result_pattern_VirtualNodeToRouterRule1_9_4_solveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_VirtualNodeToRouterRule1_9_4_solveCSP_binding[0];

			Object[] result_pattern_VirtualNodeToRouterRule1_9_4_solveCSP_black = pattern_VirtualNodeToRouterRule1_9_4_solveCSP_blackB(
					csp);
			if (result_pattern_VirtualNodeToRouterRule1_9_4_solveCSP_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, reqContainer, implContainer, virtualNode, router,
						reqContainerToImplContainer };
			}
		}
		return null;
	}

	public static final boolean pattern_VirtualNodeToRouterRule1_9_5_checkCSP_expressionFBB(
			VirtualNodeToRouterRule1 _this, CSP csp) {
		boolean _localVariable_0 = _this.isApplicable_checkCsp_BWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_VirtualNodeToRouterRule1_9_6_addmatchtoruleresult_blackBB(
			IsApplicableRuleResult ruleresult, IsApplicableMatch isApplicableMatch) {
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final Object[] pattern_VirtualNodeToRouterRule1_9_6_addmatchtoruleresult_greenBB(
			IsApplicableRuleResult ruleresult, IsApplicableMatch isApplicableMatch) {
		ruleresult.getIsApplicableMatch().add(isApplicableMatch);
		boolean ruleresult_success_prime = Boolean.valueOf(true);
		String isApplicableMatch_ruleName_prime = "VirtualNodeToRouterRule1";
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		isApplicableMatch.setRuleName(isApplicableMatch_ruleName_prime);
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final IsApplicableRuleResult pattern_VirtualNodeToRouterRule1_9_7_expressionFB(
			IsApplicableRuleResult ruleresult) {
		IsApplicableRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_VirtualNodeToRouterRule1_17_1_preparereturnvalue_bindingFB(
			VirtualNodeToRouterRule1 _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_VirtualNodeToRouterRule1_17_1_preparereturnvalue_blackFBBF(EClass __eClass,
			VirtualNodeToRouterRule1 _this) {
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

	public static final Object[] pattern_VirtualNodeToRouterRule1_17_1_preparereturnvalue_bindingAndBlackFFBF(
			VirtualNodeToRouterRule1 _this) {
		Object[] result_pattern_VirtualNodeToRouterRule1_17_1_preparereturnvalue_binding = pattern_VirtualNodeToRouterRule1_17_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_VirtualNodeToRouterRule1_17_1_preparereturnvalue_binding != null) {
			EClass __eClass = (EClass) result_pattern_VirtualNodeToRouterRule1_17_1_preparereturnvalue_binding[0];

			Object[] result_pattern_VirtualNodeToRouterRule1_17_1_preparereturnvalue_black = pattern_VirtualNodeToRouterRule1_17_1_preparereturnvalue_blackFBBF(
					__eClass, _this);
			if (result_pattern_VirtualNodeToRouterRule1_17_1_preparereturnvalue_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_VirtualNodeToRouterRule1_17_1_preparereturnvalue_black[0];
				EOperation isApplicableCC = (EOperation) result_pattern_VirtualNodeToRouterRule1_17_1_preparereturnvalue_black[3];

				return new Object[] { __performOperation, __eClass, _this, isApplicableCC };
			}
		}
		return null;
	}

	public static final Object[] pattern_VirtualNodeToRouterRule1_17_1_preparereturnvalue_greenF() {
		EObjectContainer __result = RuntimeFactory.eINSTANCE.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Iterable<Object[]> pattern_VirtualNodeToRouterRule1_17_2_testcorematchandDECs_blackBF(
			Container reqContainer) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		NetworkSpan virtualNode = reqContainer.getNetworkSpan();
		if (virtualNode != null) {
			_result.add(new Object[] { reqContainer, virtualNode });
		}

		return _result;
	}

	public static final Object[] pattern_VirtualNodeToRouterRule1_17_2_testcorematchandDECs_greenFB(EClass __eClass) {
		Match match = RuntimeFactory.eINSTANCE.createMatch();
		String __eClass_name = __eClass.getName();
		String match_ruleName_prime = __eClass_name;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_VirtualNodeToRouterRule1_17_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBB(
			VirtualNodeToRouterRule1 _this, Match match, Container reqContainer, NetworkSpan virtualNode) {
		boolean _localVariable_0 = _this.isAppropriate_FWD(match, reqContainer, virtualNode);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_VirtualNodeToRouterRule1_17_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(
			VirtualNodeToRouterRule1 _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_FWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_VirtualNodeToRouterRule1_17_5_Addmatchtoruleresult_blackBBBB(Match match,
			EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		if (!__performOperation.equals(isApplicableCC)) {
			return new Object[] { match, __performOperation, __result, isApplicableCC };
		}
		return null;
	}

	public static final Object[] pattern_VirtualNodeToRouterRule1_17_5_Addmatchtoruleresult_greenBBBB(Match match,
			EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		match.setIsApplicableCCOperation(isApplicableCC);
		return new Object[] { match, __performOperation, __result, isApplicableCC };
	}

	public static final EObjectContainer pattern_VirtualNodeToRouterRule1_17_6_expressionFB(EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_VirtualNodeToRouterRule1_18_1_preparereturnvalue_bindingFB(
			VirtualNodeToRouterRule1 _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_VirtualNodeToRouterRule1_18_1_preparereturnvalue_blackFBBF(EClass __eClass,
			VirtualNodeToRouterRule1 _this) {
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

	public static final Object[] pattern_VirtualNodeToRouterRule1_18_1_preparereturnvalue_bindingAndBlackFFBF(
			VirtualNodeToRouterRule1 _this) {
		Object[] result_pattern_VirtualNodeToRouterRule1_18_1_preparereturnvalue_binding = pattern_VirtualNodeToRouterRule1_18_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_VirtualNodeToRouterRule1_18_1_preparereturnvalue_binding != null) {
			EClass __eClass = (EClass) result_pattern_VirtualNodeToRouterRule1_18_1_preparereturnvalue_binding[0];

			Object[] result_pattern_VirtualNodeToRouterRule1_18_1_preparereturnvalue_black = pattern_VirtualNodeToRouterRule1_18_1_preparereturnvalue_blackFBBF(
					__eClass, _this);
			if (result_pattern_VirtualNodeToRouterRule1_18_1_preparereturnvalue_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_VirtualNodeToRouterRule1_18_1_preparereturnvalue_black[0];
				EOperation isApplicableCC = (EOperation) result_pattern_VirtualNodeToRouterRule1_18_1_preparereturnvalue_black[3];

				return new Object[] { __performOperation, __eClass, _this, isApplicableCC };
			}
		}
		return null;
	}

	public static final Object[] pattern_VirtualNodeToRouterRule1_18_1_preparereturnvalue_greenF() {
		EObjectContainer __result = RuntimeFactory.eINSTANCE.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Iterable<Object[]> pattern_VirtualNodeToRouterRule1_18_2_testcorematchandDECs_blackFFB(
			EMoflonEdge _edge_devices) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		EObject tmpImplContainer = _edge_devices.getSrc();
		if (tmpImplContainer instanceof implementation.Container) {
			implementation.Container implContainer = (implementation.Container) tmpImplContainer;
			EObject tmpRouter = _edge_devices.getTrg();
			if (tmpRouter instanceof Router) {
				Router router = (Router) tmpRouter;
				if (implContainer.getDevices().contains(router)) {
					_result.add(new Object[] { implContainer, router, _edge_devices });
				}
			}

		}

		return _result;
	}

	public static final Object[] pattern_VirtualNodeToRouterRule1_18_2_testcorematchandDECs_greenFB(EClass __eClass) {
		Match match = RuntimeFactory.eINSTANCE.createMatch();
		String __eClass_name = __eClass.getName();
		String match_ruleName_prime = __eClass_name;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_VirtualNodeToRouterRule1_18_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBB(
			VirtualNodeToRouterRule1 _this, Match match, implementation.Container implContainer, Router router) {
		boolean _localVariable_0 = _this.isAppropriate_BWD(match, implContainer, router);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_VirtualNodeToRouterRule1_18_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(
			VirtualNodeToRouterRule1 _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_BWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_VirtualNodeToRouterRule1_18_5_Addmatchtoruleresult_blackBBBB(Match match,
			EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		if (!__performOperation.equals(isApplicableCC)) {
			return new Object[] { match, __performOperation, __result, isApplicableCC };
		}
		return null;
	}

	public static final Object[] pattern_VirtualNodeToRouterRule1_18_5_Addmatchtoruleresult_greenBBBB(Match match,
			EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		match.setIsApplicableCCOperation(isApplicableCC);
		return new Object[] { match, __performOperation, __result, isApplicableCC };
	}

	public static final EObjectContainer pattern_VirtualNodeToRouterRule1_18_6_expressionFB(EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_VirtualNodeToRouterRule1_21_1_prepare_blackB(VirtualNodeToRouterRule1 _this) {
		return new Object[] { _this };
	}

	public static final Object[] pattern_VirtualNodeToRouterRule1_21_1_prepare_greenF() {
		IsApplicableRuleResult result = RuntimeFactory.eINSTANCE.createIsApplicableRuleResult();
		return new Object[] { result };
	}

	public static final Object[] pattern_VirtualNodeToRouterRule1_21_2_matchsrctrgcontext_bindingFFFFBB(
			Match sourceMatch, Match targetMatch) {
		EObject _localVariable_0 = sourceMatch.getObject("reqContainer");
		EObject _localVariable_1 = targetMatch.getObject("implContainer");
		EObject _localVariable_2 = sourceMatch.getObject("virtualNode");
		EObject _localVariable_3 = targetMatch.getObject("router");
		EObject tmpReqContainer = _localVariable_0;
		EObject tmpImplContainer = _localVariable_1;
		EObject tmpVirtualNode = _localVariable_2;
		EObject tmpRouter = _localVariable_3;
		if (tmpReqContainer instanceof Container) {
			Container reqContainer = (Container) tmpReqContainer;
			if (tmpImplContainer instanceof implementation.Container) {
				implementation.Container implContainer = (implementation.Container) tmpImplContainer;
				if (tmpVirtualNode instanceof NetworkSpan) {
					NetworkSpan virtualNode = (NetworkSpan) tmpVirtualNode;
					if (tmpRouter instanceof Router) {
						Router router = (Router) tmpRouter;
						return new Object[] { reqContainer, implContainer, virtualNode, router, sourceMatch,
								targetMatch };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_VirtualNodeToRouterRule1_21_2_matchsrctrgcontext_blackBBBBBB(
			Container reqContainer, implementation.Container implContainer, NetworkSpan virtualNode, Router router,
			Match sourceMatch, Match targetMatch) {
		if (!sourceMatch.equals(targetMatch)) {
			return new Object[] { reqContainer, implContainer, virtualNode, router, sourceMatch, targetMatch };
		}
		return null;
	}

	public static final Object[] pattern_VirtualNodeToRouterRule1_21_2_matchsrctrgcontext_bindingAndBlackFFFFBB(
			Match sourceMatch, Match targetMatch) {
		Object[] result_pattern_VirtualNodeToRouterRule1_21_2_matchsrctrgcontext_binding = pattern_VirtualNodeToRouterRule1_21_2_matchsrctrgcontext_bindingFFFFBB(
				sourceMatch, targetMatch);
		if (result_pattern_VirtualNodeToRouterRule1_21_2_matchsrctrgcontext_binding != null) {
			Container reqContainer = (Container) result_pattern_VirtualNodeToRouterRule1_21_2_matchsrctrgcontext_binding[0];
			implementation.Container implContainer = (implementation.Container) result_pattern_VirtualNodeToRouterRule1_21_2_matchsrctrgcontext_binding[1];
			NetworkSpan virtualNode = (NetworkSpan) result_pattern_VirtualNodeToRouterRule1_21_2_matchsrctrgcontext_binding[2];
			Router router = (Router) result_pattern_VirtualNodeToRouterRule1_21_2_matchsrctrgcontext_binding[3];

			Object[] result_pattern_VirtualNodeToRouterRule1_21_2_matchsrctrgcontext_black = pattern_VirtualNodeToRouterRule1_21_2_matchsrctrgcontext_blackBBBBBB(
					reqContainer, implContainer, virtualNode, router, sourceMatch, targetMatch);
			if (result_pattern_VirtualNodeToRouterRule1_21_2_matchsrctrgcontext_black != null) {

				return new Object[] { reqContainer, implContainer, virtualNode, router, sourceMatch, targetMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_VirtualNodeToRouterRule1_21_3_solvecsp_bindingFBBBBBBB(
			VirtualNodeToRouterRule1 _this, Container reqContainer, implementation.Container implContainer,
			NetworkSpan virtualNode, Router router, Match sourceMatch, Match targetMatch) {
		CSP _localVariable_4 = _this.isApplicable_solveCsp_CC(reqContainer, implContainer, virtualNode, router,
				sourceMatch, targetMatch);
		CSP csp = _localVariable_4;
		if (csp != null) {
			return new Object[] { csp, _this, reqContainer, implContainer, virtualNode, router, sourceMatch,
					targetMatch };
		}
		return null;
	}

	public static final Object[] pattern_VirtualNodeToRouterRule1_21_3_solvecsp_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_VirtualNodeToRouterRule1_21_3_solvecsp_bindingAndBlackFBBBBBBB(
			VirtualNodeToRouterRule1 _this, Container reqContainer, implementation.Container implContainer,
			NetworkSpan virtualNode, Router router, Match sourceMatch, Match targetMatch) {
		Object[] result_pattern_VirtualNodeToRouterRule1_21_3_solvecsp_binding = pattern_VirtualNodeToRouterRule1_21_3_solvecsp_bindingFBBBBBBB(
				_this, reqContainer, implContainer, virtualNode, router, sourceMatch, targetMatch);
		if (result_pattern_VirtualNodeToRouterRule1_21_3_solvecsp_binding != null) {
			CSP csp = (CSP) result_pattern_VirtualNodeToRouterRule1_21_3_solvecsp_binding[0];

			Object[] result_pattern_VirtualNodeToRouterRule1_21_3_solvecsp_black = pattern_VirtualNodeToRouterRule1_21_3_solvecsp_blackB(
					csp);
			if (result_pattern_VirtualNodeToRouterRule1_21_3_solvecsp_black != null) {

				return new Object[] { csp, _this, reqContainer, implContainer, virtualNode, router, sourceMatch,
						targetMatch };
			}
		}
		return null;
	}

	public static final boolean pattern_VirtualNodeToRouterRule1_21_4_checkCSP_expressionFB(CSP csp) {
		boolean _localVariable_0 = csp.check();
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Iterable<Object[]> pattern_VirtualNodeToRouterRule1_21_5_matchcorrcontext_blackBBFBB(
			Container reqContainer, implementation.Container implContainer, Match sourceMatch, Match targetMatch) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (!sourceMatch.equals(targetMatch)) {
			for (ReqContainerToImplContainer reqContainerToImplContainer : org.moflon.core.utilities.eMoflonEMFUtil
					.getOppositeReferenceTyped(implContainer, ReqContainerToImplContainer.class, "target")) {
				if (reqContainer.equals(reqContainerToImplContainer.getSource())) {
					_result.add(new Object[] { reqContainer, implContainer, reqContainerToImplContainer, sourceMatch,
							targetMatch });
				}
			}
		}
		return _result;
	}

	public static final Object[] pattern_VirtualNodeToRouterRule1_21_5_matchcorrcontext_greenBBBF(
			ReqContainerToImplContainer reqContainerToImplContainer, Match sourceMatch, Match targetMatch) {
		CCMatch ccMatch = RuntimeFactory.eINSTANCE.createCCMatch();
		String ccMatch_ruleName_prime = "VirtualNodeToRouterRule1";
		ccMatch.setSourceMatch(sourceMatch);
		ccMatch.setTargetMatch(targetMatch);
		ccMatch.getAllContextElements().add(reqContainerToImplContainer);
		ccMatch.setRuleName(ccMatch_ruleName_prime);
		return new Object[] { reqContainerToImplContainer, sourceMatch, targetMatch, ccMatch };
	}

	public static final Object[] pattern_VirtualNodeToRouterRule1_21_6_createcorrespondence_blackBBBBB(
			Container reqContainer, implementation.Container implContainer, NetworkSpan virtualNode, Router router,
			CCMatch ccMatch) {
		return new Object[] { reqContainer, implContainer, virtualNode, router, ccMatch };
	}

	public static final Object[] pattern_VirtualNodeToRouterRule1_21_6_createcorrespondence_greenBFBB(
			NetworkSpan virtualNode, Router router, CCMatch ccMatch) {
		VirtualNodeToRouter virtualNodeToRouter = ReqToImpTransformatorFactory.eINSTANCE.createVirtualNodeToRouter();
		virtualNodeToRouter.setSource(virtualNode);
		virtualNodeToRouter.setTarget(router);
		ccMatch.getCreateCorr().add(virtualNodeToRouter);
		return new Object[] { virtualNode, virtualNodeToRouter, router, ccMatch };
	}

	public static final Object[] pattern_VirtualNodeToRouterRule1_21_7_addtoreturnedresult_blackBB(
			IsApplicableRuleResult result, CCMatch ccMatch) {
		return new Object[] { result, ccMatch };
	}

	public static final Object[] pattern_VirtualNodeToRouterRule1_21_7_addtoreturnedresult_greenBB(
			IsApplicableRuleResult result, CCMatch ccMatch) {
		result.getIsApplicableMatch().add(ccMatch);
		boolean result_success_prime = Boolean.valueOf(true);
		String ccMatch_ruleName_prime = "VirtualNodeToRouterRule1";
		result.setSuccess(Boolean.valueOf(result_success_prime));
		ccMatch.setRuleName(ccMatch_ruleName_prime);
		return new Object[] { result, ccMatch };
	}

	public static final IsApplicableRuleResult pattern_VirtualNodeToRouterRule1_21_8_expressionFB(
			IsApplicableRuleResult result) {
		IsApplicableRuleResult _result = result;
		return _result;
	}

	public static final Object[] pattern_VirtualNodeToRouterRule1_24_1_matchtggpattern_blackBB(Container reqContainer,
			NetworkSpan virtualNode) {
		if (virtualNode.equals(reqContainer.getNetworkSpan())) {
			return new Object[] { reqContainer, virtualNode };
		}
		return null;
	}

	public static final boolean pattern_VirtualNodeToRouterRule1_24_2_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_VirtualNodeToRouterRule1_24_3_expressionF() {
		boolean _result = Boolean.valueOf(false);
		return _result;
	}

	public static final Object[] pattern_VirtualNodeToRouterRule1_25_1_matchtggpattern_blackBB(
			implementation.Container implContainer, Router router) {
		if (implContainer.getDevices().contains(router)) {
			return new Object[] { implContainer, router };
		}
		return null;
	}

	public static final boolean pattern_VirtualNodeToRouterRule1_25_2_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_VirtualNodeToRouterRule1_25_3_expressionF() {
		boolean _result = Boolean.valueOf(false);
		return _result;
	}

	public static final Object[] pattern_VirtualNodeToRouterRule1_26_1_createresult_blackB(
			VirtualNodeToRouterRule1 _this) {
		return new Object[] { _this };
	}

	public static final Object[] pattern_VirtualNodeToRouterRule1_26_1_createresult_greenFF() {
		IsApplicableMatch isApplicableMatch = RuntimeFactory.eINSTANCE.createIsApplicableMatch();
		ModelgeneratorRuleResult ruleResult = RuntimeFactory.eINSTANCE.createModelgeneratorRuleResult();
		boolean ruleResult_success_prime = Boolean.valueOf(false);
		ruleResult.setSuccess(Boolean.valueOf(ruleResult_success_prime));
		return new Object[] { isApplicableMatch, ruleResult };
	}

	public static final Object[] pattern_VirtualNodeToRouterRule1_26_2_isapplicablecore_black_nac_0BB(
			ModelgeneratorRuleResult ruleResult, Container reqContainer) {
		if (ruleResult.getSourceObjects().contains(reqContainer)) {
			return new Object[] { ruleResult, reqContainer };
		}
		return null;
	}

	public static final Object[] pattern_VirtualNodeToRouterRule1_26_2_isapplicablecore_black_nac_1BB(
			ModelgeneratorRuleResult ruleResult, NetworkSpan virtualNode) {
		if (ruleResult.getSourceObjects().contains(virtualNode)) {
			return new Object[] { ruleResult, virtualNode };
		}
		return null;
	}

	public static final Object[] pattern_VirtualNodeToRouterRule1_26_2_isapplicablecore_black_nac_2BB(
			ModelgeneratorRuleResult ruleResult, ReqContainerToImplContainer reqContainerToImplContainer) {
		if (ruleResult.getCorrObjects().contains(reqContainerToImplContainer)) {
			return new Object[] { ruleResult, reqContainerToImplContainer };
		}
		return null;
	}

	public static final Object[] pattern_VirtualNodeToRouterRule1_26_2_isapplicablecore_black_nac_3BB(
			ModelgeneratorRuleResult ruleResult, implementation.Container implContainer) {
		if (ruleResult.getTargetObjects().contains(implContainer)) {
			return new Object[] { ruleResult, implContainer };
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_VirtualNodeToRouterRule1_26_2_isapplicablecore_blackFFFFFBB(
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
								if (pattern_VirtualNodeToRouterRule1_26_2_isapplicablecore_black_nac_2BB(ruleResult,
										reqContainerToImplContainer) == null) {
									if (pattern_VirtualNodeToRouterRule1_26_2_isapplicablecore_black_nac_0BB(ruleResult,
											reqContainer) == null) {
										if (pattern_VirtualNodeToRouterRule1_26_2_isapplicablecore_black_nac_3BB(
												ruleResult, implContainer) == null) {
											if (pattern_VirtualNodeToRouterRule1_26_2_isapplicablecore_black_nac_1BB(
													ruleResult, virtualNode) == null) {
												_result.add(new Object[] { reqContainerToImplContainerList,
														reqContainer, virtualNode, reqContainerToImplContainer,
														implContainer, ruleEntryContainer, ruleResult });
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

	public static final Object[] pattern_VirtualNodeToRouterRule1_26_3_solveCSP_bindingFBBBBBBB(
			VirtualNodeToRouterRule1 _this, IsApplicableMatch isApplicableMatch, Container reqContainer,
			implementation.Container implContainer, NetworkSpan virtualNode,
			ReqContainerToImplContainer reqContainerToImplContainer, ModelgeneratorRuleResult ruleResult) {
		CSP _localVariable_0 = _this.generateModel_solveCsp_BWD(isApplicableMatch, reqContainer, implContainer,
				virtualNode, reqContainerToImplContainer, ruleResult);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, reqContainer, implContainer, virtualNode,
					reqContainerToImplContainer, ruleResult };
		}
		return null;
	}

	public static final Object[] pattern_VirtualNodeToRouterRule1_26_3_solveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_VirtualNodeToRouterRule1_26_3_solveCSP_bindingAndBlackFBBBBBBB(
			VirtualNodeToRouterRule1 _this, IsApplicableMatch isApplicableMatch, Container reqContainer,
			implementation.Container implContainer, NetworkSpan virtualNode,
			ReqContainerToImplContainer reqContainerToImplContainer, ModelgeneratorRuleResult ruleResult) {
		Object[] result_pattern_VirtualNodeToRouterRule1_26_3_solveCSP_binding = pattern_VirtualNodeToRouterRule1_26_3_solveCSP_bindingFBBBBBBB(
				_this, isApplicableMatch, reqContainer, implContainer, virtualNode, reqContainerToImplContainer,
				ruleResult);
		if (result_pattern_VirtualNodeToRouterRule1_26_3_solveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_VirtualNodeToRouterRule1_26_3_solveCSP_binding[0];

			Object[] result_pattern_VirtualNodeToRouterRule1_26_3_solveCSP_black = pattern_VirtualNodeToRouterRule1_26_3_solveCSP_blackB(
					csp);
			if (result_pattern_VirtualNodeToRouterRule1_26_3_solveCSP_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, reqContainer, implContainer, virtualNode,
						reqContainerToImplContainer, ruleResult };
			}
		}
		return null;
	}

	public static final boolean pattern_VirtualNodeToRouterRule1_26_4_checkCSP_expressionFBB(
			VirtualNodeToRouterRule1 _this, CSP csp) {
		boolean _localVariable_0 = _this.generateModel_checkCsp_BWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_VirtualNodeToRouterRule1_26_5_checknacs_blackBBBB(Container reqContainer,
			implementation.Container implContainer, NetworkSpan virtualNode,
			ReqContainerToImplContainer reqContainerToImplContainer) {
		return new Object[] { reqContainer, implContainer, virtualNode, reqContainerToImplContainer };
	}

	public static final Object[] pattern_VirtualNodeToRouterRule1_26_6_perform_blackBBBBB(Container reqContainer,
			implementation.Container implContainer, NetworkSpan virtualNode,
			ReqContainerToImplContainer reqContainerToImplContainer, ModelgeneratorRuleResult ruleResult) {
		return new Object[] { reqContainer, implContainer, virtualNode, reqContainerToImplContainer, ruleResult };
	}

	public static final Object[] pattern_VirtualNodeToRouterRule1_26_6_perform_greenBBFFB(
			implementation.Container implContainer, NetworkSpan virtualNode, ModelgeneratorRuleResult ruleResult) {
		VirtualNodeToRouter virtualNodeToRouter = ReqToImpTransformatorFactory.eINSTANCE.createVirtualNodeToRouter();
		Router router = ImplementationFactory.eINSTANCE.createRouter();
		boolean ruleResult_success_prime = Boolean.valueOf(true);
		int _localVariable_0 = ruleResult.getIncrementedPerformCount();
		virtualNodeToRouter.setSource(virtualNode);
		ruleResult.getCorrObjects().add(virtualNodeToRouter);
		virtualNodeToRouter.setTarget(router);
		implContainer.getDevices().add(router);
		ruleResult.getTargetObjects().add(router);
		ruleResult.setSuccess(Boolean.valueOf(ruleResult_success_prime));
		int ruleResult_performCount_prime = Integer.valueOf(_localVariable_0);
		ruleResult.setPerformCount(Integer.valueOf(ruleResult_performCount_prime));
		return new Object[] { implContainer, virtualNode, virtualNodeToRouter, router, ruleResult };
	}

	public static final ModelgeneratorRuleResult pattern_VirtualNodeToRouterRule1_26_7_expressionFB(
			ModelgeneratorRuleResult ruleResult) {
		ModelgeneratorRuleResult _result = ruleResult;
		return _result;
	}

	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} //VirtualNodeToRouterRule1Impl
