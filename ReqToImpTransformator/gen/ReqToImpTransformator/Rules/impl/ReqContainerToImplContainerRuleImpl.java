/**
 */
package ReqToImpTransformator.Rules.impl;

import ReqToImpTransformator.ReqContainerToImplContainer;
import ReqToImpTransformator.ReqToImpTransformatorFactory;

import ReqToImpTransformator.Rules.ReqContainerToImplContainerRule;
import ReqToImpTransformator.Rules.RulesPackage;

import implementation.ImplementationFactory;

import java.lang.Iterable;

import java.lang.reflect.InvocationTargetException;

import java.util.LinkedList;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EOperation;

import org.moflon.tgg.language.csp.CSP;

import org.moflon.tgg.language.modelgenerator.RuleEntryContainer;

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
 * An implementation of the model object '<em><b>Req Container To Impl Container Rule</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class ReqContainerToImplContainerRuleImpl extends AbstractRuleImpl implements ReqContainerToImplContainerRule {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ReqContainerToImplContainerRuleImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RulesPackage.eINSTANCE.getReqContainerToImplContainerRule();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAppropriate_FWD(Match match, Container reqContainer, NetworkSpan virtualNode) {

		Object[] result1_black = ReqContainerToImplContainerRuleImpl
				.pattern_ReqContainerToImplContainerRule_0_1_initialbindings_blackBBBB(this, match, reqContainer,
						virtualNode);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[match] = " + match + ", " + "[reqContainer] = " + reqContainer + ", " + "[virtualNode] = "
					+ virtualNode + ".");
		}

		Object[] result2_bindingAndBlack = ReqContainerToImplContainerRuleImpl
				.pattern_ReqContainerToImplContainerRule_0_2_SolveCSP_bindingAndBlackFBBBB(this, match, reqContainer,
						virtualNode);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[match] = " + match + ", " + "[reqContainer] = " + reqContainer + ", " + "[virtualNode] = "
					+ virtualNode + ".");
		}
		CSP csp = (CSP) result2_bindingAndBlack[0];
		// 
		if (ReqContainerToImplContainerRuleImpl.pattern_ReqContainerToImplContainerRule_0_3_CheckCSP_expressionFBB(this,
				csp)) {

			Object[] result4_black = ReqContainerToImplContainerRuleImpl
					.pattern_ReqContainerToImplContainerRule_0_4_collectelementstobetranslated_blackBBB(match,
							reqContainer, virtualNode);
			if (result4_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match + ", "
						+ "[reqContainer] = " + reqContainer + ", " + "[virtualNode] = " + virtualNode + ".");
			}
			ReqContainerToImplContainerRuleImpl
					.pattern_ReqContainerToImplContainerRule_0_4_collectelementstobetranslated_greenBBBF(match,
							reqContainer, virtualNode);
			//nothing EMoflonEdge reqContainer__virtualNode____networkSpan = (EMoflonEdge) result4_green[3];

			Object[] result5_black = ReqContainerToImplContainerRuleImpl
					.pattern_ReqContainerToImplContainerRule_0_5_collectcontextelements_blackBBB(match, reqContainer,
							virtualNode);
			if (result5_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match + ", "
						+ "[reqContainer] = " + reqContainer + ", " + "[virtualNode] = " + virtualNode + ".");
			}
			// 
			ReqContainerToImplContainerRuleImpl
					.pattern_ReqContainerToImplContainerRule_0_6_registerobjectstomatch_expressionBBBB(this, match,
							reqContainer, virtualNode);
			return ReqContainerToImplContainerRuleImpl.pattern_ReqContainerToImplContainerRule_0_7_expressionF();
		} else {
			return ReqContainerToImplContainerRuleImpl.pattern_ReqContainerToImplContainerRule_0_8_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PerformRuleResult perform_FWD(IsApplicableMatch isApplicableMatch) {

		Object[] result1_bindingAndBlack = ReqContainerToImplContainerRuleImpl
				.pattern_ReqContainerToImplContainerRule_1_1_performtransformation_bindingAndBlackFFFBB(this,
						isApplicableMatch);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[isApplicableMatch] = " + isApplicableMatch + ".");
		}
		Container reqContainer = (Container) result1_bindingAndBlack[0];
		NetworkSpan virtualNode = (NetworkSpan) result1_bindingAndBlack[1];
		//nothing CSP csp = (CSP) result1_bindingAndBlack[2];
		Object[] result1_green = ReqContainerToImplContainerRuleImpl
				.pattern_ReqContainerToImplContainerRule_1_1_performtransformation_greenBFF(reqContainer);
		implementation.Container implContainer = (implementation.Container) result1_green[1];
		ReqContainerToImplContainer reqContainerToImplContainer = (ReqContainerToImplContainer) result1_green[2];

		Object[] result2_black = ReqContainerToImplContainerRuleImpl
				.pattern_ReqContainerToImplContainerRule_1_2_collecttranslatedelements_blackBBBB(reqContainer,
						virtualNode, implContainer, reqContainerToImplContainer);
		if (result2_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[reqContainer] = " + reqContainer
					+ ", " + "[virtualNode] = " + virtualNode + ", " + "[implContainer] = " + implContainer + ", "
					+ "[reqContainerToImplContainer] = " + reqContainerToImplContainer + ".");
		}
		Object[] result2_green = ReqContainerToImplContainerRuleImpl
				.pattern_ReqContainerToImplContainerRule_1_2_collecttranslatedelements_greenFBBBB(reqContainer,
						virtualNode, implContainer, reqContainerToImplContainer);
		PerformRuleResult ruleresult = (PerformRuleResult) result2_green[0];

		Object[] result3_black = ReqContainerToImplContainerRuleImpl
				.pattern_ReqContainerToImplContainerRule_1_3_bookkeepingforedges_blackBBBBB(ruleresult, reqContainer,
						virtualNode, implContainer, reqContainerToImplContainer);
		if (result3_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[ruleresult] = " + ruleresult
					+ ", " + "[reqContainer] = " + reqContainer + ", " + "[virtualNode] = " + virtualNode + ", "
					+ "[implContainer] = " + implContainer + ", " + "[reqContainerToImplContainer] = "
					+ reqContainerToImplContainer + ".");
		}
		ReqContainerToImplContainerRuleImpl
				.pattern_ReqContainerToImplContainerRule_1_3_bookkeepingforedges_greenBBBBBFFF(ruleresult, reqContainer,
						virtualNode, implContainer, reqContainerToImplContainer);
		//nothing EMoflonEdge reqContainer__virtualNode____networkSpan = (EMoflonEdge) result3_green[5];
		//nothing EMoflonEdge reqContainerToImplContainer__implContainer____target = (EMoflonEdge) result3_green[6];
		//nothing EMoflonEdge reqContainerToImplContainer__reqContainer____source = (EMoflonEdge) result3_green[7];

		// 
		// 
		ReqContainerToImplContainerRuleImpl
				.pattern_ReqContainerToImplContainerRule_1_5_registerobjects_expressionBBBBBB(this, ruleresult,
						reqContainer, virtualNode, implContainer, reqContainerToImplContainer);
		return ReqContainerToImplContainerRuleImpl.pattern_ReqContainerToImplContainerRule_1_6_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IsApplicableRuleResult isApplicable_FWD(Match match) {

		Object[] result1_bindingAndBlack = ReqContainerToImplContainerRuleImpl
				.pattern_ReqContainerToImplContainerRule_2_1_preparereturnvalue_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		EOperation performOperation = (EOperation) result1_bindingAndBlack[0];
		//nothing EClass eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = ReqContainerToImplContainerRuleImpl
				.pattern_ReqContainerToImplContainerRule_2_1_preparereturnvalue_greenBF(performOperation);
		IsApplicableRuleResult ruleresult = (IsApplicableRuleResult) result1_green[1];

		// ForEach 
		Object[] result2_binding = ReqContainerToImplContainerRuleImpl
				.pattern_ReqContainerToImplContainerRule_2_2_corematch_bindingFFB(match);
		if (result2_binding == null) {
			throw new RuntimeException(
					"Binding in node core match failed." + " Variables: " + "[match] = " + match + ".");
		}
		Container reqContainer = (Container) result2_binding[0];
		NetworkSpan virtualNode = (NetworkSpan) result2_binding[1];
		for (Object[] result2_black : ReqContainerToImplContainerRuleImpl
				.pattern_ReqContainerToImplContainerRule_2_2_corematch_blackBBB(reqContainer, virtualNode, match)) {
			// ForEach 
			for (Object[] result3_black : ReqContainerToImplContainerRuleImpl
					.pattern_ReqContainerToImplContainerRule_2_3_findcontext_blackBB(reqContainer, virtualNode)) {
				Object[] result3_green = ReqContainerToImplContainerRuleImpl
						.pattern_ReqContainerToImplContainerRule_2_3_findcontext_greenBBFF(reqContainer, virtualNode);
				IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result3_green[2];
				//nothing EMoflonEdge reqContainer__virtualNode____networkSpan = (EMoflonEdge) result3_green[3];

				Object[] result4_bindingAndBlack = ReqContainerToImplContainerRuleImpl
						.pattern_ReqContainerToImplContainerRule_2_4_solveCSP_bindingAndBlackFBBBB(this,
								isApplicableMatch, reqContainer, virtualNode);
				if (result4_bindingAndBlack == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
							+ "[isApplicableMatch] = " + isApplicableMatch + ", " + "[reqContainer] = " + reqContainer
							+ ", " + "[virtualNode] = " + virtualNode + ".");
				}
				CSP csp = (CSP) result4_bindingAndBlack[0];
				// 
				if (ReqContainerToImplContainerRuleImpl
						.pattern_ReqContainerToImplContainerRule_2_5_checkCSP_expressionFBB(this, csp)) {

					Object[] result6_black = ReqContainerToImplContainerRuleImpl
							.pattern_ReqContainerToImplContainerRule_2_6_addmatchtoruleresult_blackBB(ruleresult,
									isApplicableMatch);
					if (result6_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[ruleresult] = "
								+ ruleresult + ", " + "[isApplicableMatch] = " + isApplicableMatch + ".");
					}
					ReqContainerToImplContainerRuleImpl
							.pattern_ReqContainerToImplContainerRule_2_6_addmatchtoruleresult_greenBB(ruleresult,
									isApplicableMatch);

				} else {
				}

			}

		}
		return ReqContainerToImplContainerRuleImpl.pattern_ReqContainerToImplContainerRule_2_7_expressionFB(ruleresult);
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
	public CSP isApplicable_solveCsp_FWD(IsApplicableMatch isApplicableMatch, Container reqContainer,
			NetworkSpan virtualNode) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals

		// Create attribute variables

		// Create unbound variables

		// Create constraints

		// Solve CSP

		// Snapshot pattern match on which CSP is solved
		isApplicableMatch.registerObject("reqContainer", reqContainer);
		isApplicableMatch.registerObject("virtualNode", virtualNode);
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
	public void registerObjects_FWD(PerformRuleResult ruleresult, EObject reqContainer, EObject virtualNode,
			EObject implContainer, EObject reqContainerToImplContainer) {
		ruleresult.registerObject("reqContainer", reqContainer);
		ruleresult.registerObject("virtualNode", virtualNode);
		ruleresult.registerObject("implContainer", implContainer);
		ruleresult.registerObject("reqContainerToImplContainer", reqContainerToImplContainer);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean checkTypes_FWD(Match match) {
		return true
				&& org.moflon.util.eMoflonSDMUtil.getFQN(match.getObject("reqContainer").eClass())
						.equals("requirements.Container.")
				&& org.moflon.util.eMoflonSDMUtil.getFQN(match.getObject("virtualNode").eClass())
						.equals("requirements.NetworkSpan.");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAppropriate_BWD(Match match, implementation.Container implContainer) {

		Object[] result1_black = ReqContainerToImplContainerRuleImpl
				.pattern_ReqContainerToImplContainerRule_10_1_initialbindings_blackBBB(this, match, implContainer);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[match] = " + match + ", " + "[implContainer] = " + implContainer + ".");
		}

		Object[] result2_bindingAndBlack = ReqContainerToImplContainerRuleImpl
				.pattern_ReqContainerToImplContainerRule_10_2_SolveCSP_bindingAndBlackFBBB(this, match, implContainer);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[match] = " + match + ", " + "[implContainer] = " + implContainer + ".");
		}
		CSP csp = (CSP) result2_bindingAndBlack[0];
		// 
		if (ReqContainerToImplContainerRuleImpl
				.pattern_ReqContainerToImplContainerRule_10_3_CheckCSP_expressionFBB(this, csp)) {

			Object[] result4_black = ReqContainerToImplContainerRuleImpl
					.pattern_ReqContainerToImplContainerRule_10_4_collectelementstobetranslated_blackBB(match,
							implContainer);
			if (result4_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match + ", "
						+ "[implContainer] = " + implContainer + ".");
			}
			ReqContainerToImplContainerRuleImpl
					.pattern_ReqContainerToImplContainerRule_10_4_collectelementstobetranslated_greenBB(match,
							implContainer);

			Object[] result5_black = ReqContainerToImplContainerRuleImpl
					.pattern_ReqContainerToImplContainerRule_10_5_collectcontextelements_blackBB(match, implContainer);
			if (result5_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match + ", "
						+ "[implContainer] = " + implContainer + ".");
			}
			// 
			ReqContainerToImplContainerRuleImpl
					.pattern_ReqContainerToImplContainerRule_10_6_registerobjectstomatch_expressionBBB(this, match,
							implContainer);
			return ReqContainerToImplContainerRuleImpl.pattern_ReqContainerToImplContainerRule_10_7_expressionF();
		} else {
			return ReqContainerToImplContainerRuleImpl.pattern_ReqContainerToImplContainerRule_10_8_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PerformRuleResult perform_BWD(IsApplicableMatch isApplicableMatch) {

		Object[] result1_bindingAndBlack = ReqContainerToImplContainerRuleImpl
				.pattern_ReqContainerToImplContainerRule_11_1_performtransformation_bindingAndBlackFFBB(this,
						isApplicableMatch);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[isApplicableMatch] = " + isApplicableMatch + ".");
		}
		implementation.Container implContainer = (implementation.Container) result1_bindingAndBlack[0];
		//nothing CSP csp = (CSP) result1_bindingAndBlack[1];
		Object[] result1_green = ReqContainerToImplContainerRuleImpl
				.pattern_ReqContainerToImplContainerRule_11_1_performtransformation_greenFFBF(implContainer);
		Container reqContainer = (Container) result1_green[0];
		NetworkSpan virtualNode = (NetworkSpan) result1_green[1];
		ReqContainerToImplContainer reqContainerToImplContainer = (ReqContainerToImplContainer) result1_green[3];

		Object[] result2_black = ReqContainerToImplContainerRuleImpl
				.pattern_ReqContainerToImplContainerRule_11_2_collecttranslatedelements_blackBBBB(reqContainer,
						virtualNode, implContainer, reqContainerToImplContainer);
		if (result2_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[reqContainer] = " + reqContainer
					+ ", " + "[virtualNode] = " + virtualNode + ", " + "[implContainer] = " + implContainer + ", "
					+ "[reqContainerToImplContainer] = " + reqContainerToImplContainer + ".");
		}
		Object[] result2_green = ReqContainerToImplContainerRuleImpl
				.pattern_ReqContainerToImplContainerRule_11_2_collecttranslatedelements_greenFBBBB(reqContainer,
						virtualNode, implContainer, reqContainerToImplContainer);
		PerformRuleResult ruleresult = (PerformRuleResult) result2_green[0];

		Object[] result3_black = ReqContainerToImplContainerRuleImpl
				.pattern_ReqContainerToImplContainerRule_11_3_bookkeepingforedges_blackBBBBB(ruleresult, reqContainer,
						virtualNode, implContainer, reqContainerToImplContainer);
		if (result3_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[ruleresult] = " + ruleresult
					+ ", " + "[reqContainer] = " + reqContainer + ", " + "[virtualNode] = " + virtualNode + ", "
					+ "[implContainer] = " + implContainer + ", " + "[reqContainerToImplContainer] = "
					+ reqContainerToImplContainer + ".");
		}
		ReqContainerToImplContainerRuleImpl
				.pattern_ReqContainerToImplContainerRule_11_3_bookkeepingforedges_greenBBBBBFFF(ruleresult,
						reqContainer, virtualNode, implContainer, reqContainerToImplContainer);
		//nothing EMoflonEdge reqContainer__virtualNode____networkSpan = (EMoflonEdge) result3_green[5];
		//nothing EMoflonEdge reqContainerToImplContainer__implContainer____target = (EMoflonEdge) result3_green[6];
		//nothing EMoflonEdge reqContainerToImplContainer__reqContainer____source = (EMoflonEdge) result3_green[7];

		// 
		// 
		ReqContainerToImplContainerRuleImpl
				.pattern_ReqContainerToImplContainerRule_11_5_registerobjects_expressionBBBBBB(this, ruleresult,
						reqContainer, virtualNode, implContainer, reqContainerToImplContainer);
		return ReqContainerToImplContainerRuleImpl
				.pattern_ReqContainerToImplContainerRule_11_6_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IsApplicableRuleResult isApplicable_BWD(Match match) {

		Object[] result1_bindingAndBlack = ReqContainerToImplContainerRuleImpl
				.pattern_ReqContainerToImplContainerRule_12_1_preparereturnvalue_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		EOperation performOperation = (EOperation) result1_bindingAndBlack[0];
		//nothing EClass eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = ReqContainerToImplContainerRuleImpl
				.pattern_ReqContainerToImplContainerRule_12_1_preparereturnvalue_greenBF(performOperation);
		IsApplicableRuleResult ruleresult = (IsApplicableRuleResult) result1_green[1];

		// ForEach 
		Object[] result2_binding = ReqContainerToImplContainerRuleImpl
				.pattern_ReqContainerToImplContainerRule_12_2_corematch_bindingFB(match);
		if (result2_binding == null) {
			throw new RuntimeException(
					"Binding in node core match failed." + " Variables: " + "[match] = " + match + ".");
		}
		implementation.Container implContainer = (implementation.Container) result2_binding[0];
		for (Object[] result2_black : ReqContainerToImplContainerRuleImpl
				.pattern_ReqContainerToImplContainerRule_12_2_corematch_blackBB(implContainer, match)) {
			// ForEach 
			for (Object[] result3_black : ReqContainerToImplContainerRuleImpl
					.pattern_ReqContainerToImplContainerRule_12_3_findcontext_blackB(implContainer)) {
				Object[] result3_green = ReqContainerToImplContainerRuleImpl
						.pattern_ReqContainerToImplContainerRule_12_3_findcontext_greenBF(implContainer);
				IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result3_green[1];

				Object[] result4_bindingAndBlack = ReqContainerToImplContainerRuleImpl
						.pattern_ReqContainerToImplContainerRule_12_4_solveCSP_bindingAndBlackFBBB(this,
								isApplicableMatch, implContainer);
				if (result4_bindingAndBlack == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
							+ "[isApplicableMatch] = " + isApplicableMatch + ", " + "[implContainer] = " + implContainer
							+ ".");
				}
				CSP csp = (CSP) result4_bindingAndBlack[0];
				// 
				if (ReqContainerToImplContainerRuleImpl
						.pattern_ReqContainerToImplContainerRule_12_5_checkCSP_expressionFBB(this, csp)) {

					Object[] result6_black = ReqContainerToImplContainerRuleImpl
							.pattern_ReqContainerToImplContainerRule_12_6_addmatchtoruleresult_blackBB(ruleresult,
									isApplicableMatch);
					if (result6_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[ruleresult] = "
								+ ruleresult + ", " + "[isApplicableMatch] = " + isApplicableMatch + ".");
					}
					ReqContainerToImplContainerRuleImpl
							.pattern_ReqContainerToImplContainerRule_12_6_addmatchtoruleresult_greenBB(ruleresult,
									isApplicableMatch);

				} else {
				}

			}

		}
		return ReqContainerToImplContainerRuleImpl
				.pattern_ReqContainerToImplContainerRule_12_7_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void registerObjectsToMatch_BWD(Match match, implementation.Container implContainer) {
		match.registerObject("implContainer", implContainer);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isAppropriate_solveCsp_BWD(Match match, implementation.Container implContainer) {// Create CSP
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
	public CSP isApplicable_solveCsp_BWD(IsApplicableMatch isApplicableMatch, implementation.Container implContainer) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals

		// Create attribute variables

		// Create unbound variables

		// Create constraints

		// Solve CSP

		// Snapshot pattern match on which CSP is solved
		isApplicableMatch.registerObject("implContainer", implContainer);
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
	public void registerObjects_BWD(PerformRuleResult ruleresult, EObject reqContainer, EObject virtualNode,
			EObject implContainer, EObject reqContainerToImplContainer) {
		ruleresult.registerObject("reqContainer", reqContainer);
		ruleresult.registerObject("virtualNode", virtualNode);
		ruleresult.registerObject("implContainer", implContainer);
		ruleresult.registerObject("reqContainerToImplContainer", reqContainerToImplContainer);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean checkTypes_BWD(Match match) {
		return true && org.moflon.util.eMoflonSDMUtil.getFQN(match.getObject("implContainer").eClass())
				.equals("implementation.Container.");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_BWD_Container_0(implementation.Container implContainer) {

		Object[] result1_bindingAndBlack = ReqContainerToImplContainerRuleImpl
				.pattern_ReqContainerToImplContainerRule_20_1_preparereturnvalue_bindingAndBlackFFBF(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		EOperation isApplicableCC = (EOperation) result1_bindingAndBlack[3];
		Object[] result1_green = ReqContainerToImplContainerRuleImpl
				.pattern_ReqContainerToImplContainerRule_20_1_preparereturnvalue_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach 
		for (Object[] result2_black : ReqContainerToImplContainerRuleImpl
				.pattern_ReqContainerToImplContainerRule_20_2_testcorematchandDECs_blackB(implContainer)) {
			Object[] result2_green = ReqContainerToImplContainerRuleImpl
					.pattern_ReqContainerToImplContainerRule_20_2_testcorematchandDECs_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// 
			if (ReqContainerToImplContainerRuleImpl
					.pattern_ReqContainerToImplContainerRule_20_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBB(
							this, match, implContainer)) {
				// 
				if (ReqContainerToImplContainerRuleImpl
						.pattern_ReqContainerToImplContainerRule_20_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(
								this, match)) {

					Object[] result5_black = ReqContainerToImplContainerRuleImpl
							.pattern_ReqContainerToImplContainerRule_20_5_Addmatchtoruleresult_blackBBBB(match,
									__performOperation, __result, isApplicableCC);
					if (result5_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match
								+ ", " + "[__performOperation] = " + __performOperation + ", " + "[__result] = "
								+ __result + ", " + "[isApplicableCC] = " + isApplicableCC + ".");
					}
					ReqContainerToImplContainerRuleImpl
							.pattern_ReqContainerToImplContainerRule_20_5_Addmatchtoruleresult_greenBBBB(match,
									__performOperation, __result, isApplicableCC);

				} else {
				}

			} else {
			}

		}
		return ReqContainerToImplContainerRuleImpl.pattern_ReqContainerToImplContainerRule_20_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_FWD_EMoflonEdge_2(EMoflonEdge _edge_networkSpan) {

		Object[] result1_bindingAndBlack = ReqContainerToImplContainerRuleImpl
				.pattern_ReqContainerToImplContainerRule_21_1_preparereturnvalue_bindingAndBlackFFBF(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		EOperation isApplicableCC = (EOperation) result1_bindingAndBlack[3];
		Object[] result1_green = ReqContainerToImplContainerRuleImpl
				.pattern_ReqContainerToImplContainerRule_21_1_preparereturnvalue_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach 
		for (Object[] result2_black : ReqContainerToImplContainerRuleImpl
				.pattern_ReqContainerToImplContainerRule_21_2_testcorematchandDECs_blackFFB(_edge_networkSpan)) {
			Container reqContainer = (Container) result2_black[0];
			NetworkSpan virtualNode = (NetworkSpan) result2_black[1];
			Object[] result2_green = ReqContainerToImplContainerRuleImpl
					.pattern_ReqContainerToImplContainerRule_21_2_testcorematchandDECs_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// 
			if (ReqContainerToImplContainerRuleImpl
					.pattern_ReqContainerToImplContainerRule_21_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBB(
							this, match, reqContainer, virtualNode)) {
				// 
				if (ReqContainerToImplContainerRuleImpl
						.pattern_ReqContainerToImplContainerRule_21_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(
								this, match)) {

					Object[] result5_black = ReqContainerToImplContainerRuleImpl
							.pattern_ReqContainerToImplContainerRule_21_5_Addmatchtoruleresult_blackBBBB(match,
									__performOperation, __result, isApplicableCC);
					if (result5_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match
								+ ", " + "[__performOperation] = " + __performOperation + ", " + "[__result] = "
								+ __result + ", " + "[isApplicableCC] = " + isApplicableCC + ".");
					}
					ReqContainerToImplContainerRuleImpl
							.pattern_ReqContainerToImplContainerRule_21_5_Addmatchtoruleresult_greenBBBB(match,
									__performOperation, __result, isApplicableCC);

				} else {
				}

			} else {
			}

		}
		return ReqContainerToImplContainerRuleImpl.pattern_ReqContainerToImplContainerRule_21_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AttributeConstraintsRuleResult checkAttributes_FWD(TripleMatch __tripleMatch) {
		AttributeConstraintsRuleResult ruleResult = org.moflon.tgg.runtime.RuntimeFactory.eINSTANCE
				.createAttributeConstraintsRuleResult();
		ruleResult.setRule("ReqContainerToImplContainerRule");
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
		ruleResult.setRule("ReqContainerToImplContainerRule");
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

		Object[] result1_black = ReqContainerToImplContainerRuleImpl
				.pattern_ReqContainerToImplContainerRule_24_1_prepare_blackB(this);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		Object[] result1_green = ReqContainerToImplContainerRuleImpl
				.pattern_ReqContainerToImplContainerRule_24_1_prepare_greenF();
		IsApplicableRuleResult result = (IsApplicableRuleResult) result1_green[0];

		Object[] result2_bindingAndBlack = ReqContainerToImplContainerRuleImpl
				.pattern_ReqContainerToImplContainerRule_24_2_matchsrctrgcontext_bindingAndBlackFFFBB(sourceMatch,
						targetMatch);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[sourceMatch] = " + sourceMatch
					+ ", " + "[targetMatch] = " + targetMatch + ".");
		}
		Container reqContainer = (Container) result2_bindingAndBlack[0];
		NetworkSpan virtualNode = (NetworkSpan) result2_bindingAndBlack[1];
		implementation.Container implContainer = (implementation.Container) result2_bindingAndBlack[2];

		Object[] result3_bindingAndBlack = ReqContainerToImplContainerRuleImpl
				.pattern_ReqContainerToImplContainerRule_24_3_solvecsp_bindingAndBlackFBBBBBB(this, reqContainer,
						virtualNode, implContainer, sourceMatch, targetMatch);
		if (result3_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[reqContainer] = " + reqContainer + ", " + "[virtualNode] = " + virtualNode + ", "
					+ "[implContainer] = " + implContainer + ", " + "[sourceMatch] = " + sourceMatch + ", "
					+ "[targetMatch] = " + targetMatch + ".");
		}
		CSP csp = (CSP) result3_bindingAndBlack[0];
		// 
		if (ReqContainerToImplContainerRuleImpl
				.pattern_ReqContainerToImplContainerRule_24_4_checkCSP_expressionFB(csp)) {
			// ForEach 
			for (Object[] result5_black : ReqContainerToImplContainerRuleImpl
					.pattern_ReqContainerToImplContainerRule_24_5_matchcorrcontext_blackBB(sourceMatch, targetMatch)) {
				Object[] result5_green = ReqContainerToImplContainerRuleImpl
						.pattern_ReqContainerToImplContainerRule_24_5_matchcorrcontext_greenBBF(sourceMatch,
								targetMatch);
				CCMatch ccMatch = (CCMatch) result5_green[2];

				Object[] result6_black = ReqContainerToImplContainerRuleImpl
						.pattern_ReqContainerToImplContainerRule_24_6_createcorrespondence_blackBBBB(reqContainer,
								virtualNode, implContainer, ccMatch);
				if (result6_black == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[reqContainer] = "
							+ reqContainer + ", " + "[virtualNode] = " + virtualNode + ", " + "[implContainer] = "
							+ implContainer + ", " + "[ccMatch] = " + ccMatch + ".");
				}
				ReqContainerToImplContainerRuleImpl
						.pattern_ReqContainerToImplContainerRule_24_6_createcorrespondence_greenBBFB(reqContainer,
								implContainer, ccMatch);
				//nothing ReqContainerToImplContainer reqContainerToImplContainer = (ReqContainerToImplContainer) result6_green[2];

				Object[] result7_black = ReqContainerToImplContainerRuleImpl
						.pattern_ReqContainerToImplContainerRule_24_7_addtoreturnedresult_blackBB(result, ccMatch);
				if (result7_black == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[result] = " + result
							+ ", " + "[ccMatch] = " + ccMatch + ".");
				}
				ReqContainerToImplContainerRuleImpl
						.pattern_ReqContainerToImplContainerRule_24_7_addtoreturnedresult_greenBB(result, ccMatch);

			}

		} else {
		}
		return ReqContainerToImplContainerRuleImpl.pattern_ReqContainerToImplContainerRule_24_8_expressionFB(result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isApplicable_solveCsp_CC(Container reqContainer, NetworkSpan virtualNode,
			implementation.Container implContainer, Match sourceMatch, Match targetMatch) {// Create CSP
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
		Object[] result1_black = ReqContainerToImplContainerRuleImpl
				.pattern_ReqContainerToImplContainerRule_27_1_matchtggpattern_blackBB(reqContainer, virtualNode);
		if (result1_black != null) {
			return ReqContainerToImplContainerRuleImpl.pattern_ReqContainerToImplContainerRule_27_2_expressionF();
		} else {
			return ReqContainerToImplContainerRuleImpl.pattern_ReqContainerToImplContainerRule_27_3_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean checkDEC_BWD(implementation.Container implContainer) {// 
		Object[] result1_black = ReqContainerToImplContainerRuleImpl
				.pattern_ReqContainerToImplContainerRule_28_1_matchtggpattern_blackB(implContainer);
		if (result1_black != null) {
			return ReqContainerToImplContainerRuleImpl.pattern_ReqContainerToImplContainerRule_28_2_expressionF();
		} else {
			return ReqContainerToImplContainerRuleImpl.pattern_ReqContainerToImplContainerRule_28_3_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModelgeneratorRuleResult generateModel(RuleEntryContainer ruleEntryContainer) {

		Object[] result1_black = ReqContainerToImplContainerRuleImpl
				.pattern_ReqContainerToImplContainerRule_29_1_createresult_blackB(this);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		Object[] result1_green = ReqContainerToImplContainerRuleImpl
				.pattern_ReqContainerToImplContainerRule_29_1_createresult_greenFF();
		IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result1_green[0];
		ModelgeneratorRuleResult ruleResult = (ModelgeneratorRuleResult) result1_green[1];

		// 
		Object[] result2_black = ReqContainerToImplContainerRuleImpl
				.pattern_ReqContainerToImplContainerRule_29_2_isapplicablecore_blackB(this);
		if (result2_black != null) {

			Object[] result3_bindingAndBlack = ReqContainerToImplContainerRuleImpl
					.pattern_ReqContainerToImplContainerRule_29_3_solveCSP_bindingAndBlackFBBB(this, isApplicableMatch,
							ruleResult);
			if (result3_bindingAndBlack == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
						+ "[isApplicableMatch] = " + isApplicableMatch + ", " + "[ruleResult] = " + ruleResult + ".");
			}
			CSP csp = (CSP) result3_bindingAndBlack[0];
			// 
			if (ReqContainerToImplContainerRuleImpl
					.pattern_ReqContainerToImplContainerRule_29_4_checkCSP_expressionFBB(this, csp)) {
				// 

				Object[] result6_black = ReqContainerToImplContainerRuleImpl
						.pattern_ReqContainerToImplContainerRule_29_6_perform_blackB(ruleResult);
				if (result6_black == null) {
					throw new RuntimeException(
							"Pattern matching failed." + " Variables: " + "[ruleResult] = " + ruleResult + ".");
				}
				ReqContainerToImplContainerRuleImpl
						.pattern_ReqContainerToImplContainerRule_29_6_perform_greenFFFFB(ruleResult);
				//nothing Container reqContainer = (Container) result6_green[0];
				//nothing NetworkSpan virtualNode = (NetworkSpan) result6_green[1];
				//nothing implementation.Container implContainer = (implementation.Container) result6_green[2];
				//nothing ReqContainerToImplContainer reqContainerToImplContainer = (ReqContainerToImplContainer) result6_green[3];

			} else {
			}

		} else {
		}
		return ReqContainerToImplContainerRuleImpl
				.pattern_ReqContainerToImplContainerRule_29_7_expressionFB(ruleResult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP generateModel_solveCsp_BWD(IsApplicableMatch isApplicableMatch, ModelgeneratorRuleResult ruleResult) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals

		// Create attribute variables

		// Create unbound variables

		// Create constraints

		// Solve CSP

		// Snapshot pattern match on which CSP is solved
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
		case RulesPackage.REQ_CONTAINER_TO_IMPL_CONTAINER_RULE___IS_APPROPRIATE_FWD__MATCH_CONTAINER_NETWORKSPAN:
			return isAppropriate_FWD((Match) arguments.get(0), (Container) arguments.get(1),
					(NetworkSpan) arguments.get(2));
		case RulesPackage.REQ_CONTAINER_TO_IMPL_CONTAINER_RULE___PERFORM_FWD__ISAPPLICABLEMATCH:
			return perform_FWD((IsApplicableMatch) arguments.get(0));
		case RulesPackage.REQ_CONTAINER_TO_IMPL_CONTAINER_RULE___IS_APPLICABLE_FWD__MATCH:
			return isApplicable_FWD((Match) arguments.get(0));
		case RulesPackage.REQ_CONTAINER_TO_IMPL_CONTAINER_RULE___REGISTER_OBJECTS_TO_MATCH_FWD__MATCH_CONTAINER_NETWORKSPAN:
			registerObjectsToMatch_FWD((Match) arguments.get(0), (Container) arguments.get(1),
					(NetworkSpan) arguments.get(2));
			return null;
		case RulesPackage.REQ_CONTAINER_TO_IMPL_CONTAINER_RULE___IS_APPROPRIATE_SOLVE_CSP_FWD__MATCH_CONTAINER_NETWORKSPAN:
			return isAppropriate_solveCsp_FWD((Match) arguments.get(0), (Container) arguments.get(1),
					(NetworkSpan) arguments.get(2));
		case RulesPackage.REQ_CONTAINER_TO_IMPL_CONTAINER_RULE___IS_APPROPRIATE_CHECK_CSP_FWD__CSP:
			return isAppropriate_checkCsp_FWD((CSP) arguments.get(0));
		case RulesPackage.REQ_CONTAINER_TO_IMPL_CONTAINER_RULE___IS_APPLICABLE_SOLVE_CSP_FWD__ISAPPLICABLEMATCH_CONTAINER_NETWORKSPAN:
			return isApplicable_solveCsp_FWD((IsApplicableMatch) arguments.get(0), (Container) arguments.get(1),
					(NetworkSpan) arguments.get(2));
		case RulesPackage.REQ_CONTAINER_TO_IMPL_CONTAINER_RULE___IS_APPLICABLE_CHECK_CSP_FWD__CSP:
			return isApplicable_checkCsp_FWD((CSP) arguments.get(0));
		case RulesPackage.REQ_CONTAINER_TO_IMPL_CONTAINER_RULE___REGISTER_OBJECTS_FWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT:
			registerObjects_FWD((PerformRuleResult) arguments.get(0), (EObject) arguments.get(1),
					(EObject) arguments.get(2), (EObject) arguments.get(3), (EObject) arguments.get(4));
			return null;
		case RulesPackage.REQ_CONTAINER_TO_IMPL_CONTAINER_RULE___CHECK_TYPES_FWD__MATCH:
			return checkTypes_FWD((Match) arguments.get(0));
		case RulesPackage.REQ_CONTAINER_TO_IMPL_CONTAINER_RULE___IS_APPROPRIATE_BWD__MATCH_CONTAINER:
			return isAppropriate_BWD((Match) arguments.get(0), (implementation.Container) arguments.get(1));
		case RulesPackage.REQ_CONTAINER_TO_IMPL_CONTAINER_RULE___PERFORM_BWD__ISAPPLICABLEMATCH:
			return perform_BWD((IsApplicableMatch) arguments.get(0));
		case RulesPackage.REQ_CONTAINER_TO_IMPL_CONTAINER_RULE___IS_APPLICABLE_BWD__MATCH:
			return isApplicable_BWD((Match) arguments.get(0));
		case RulesPackage.REQ_CONTAINER_TO_IMPL_CONTAINER_RULE___REGISTER_OBJECTS_TO_MATCH_BWD__MATCH_CONTAINER:
			registerObjectsToMatch_BWD((Match) arguments.get(0), (implementation.Container) arguments.get(1));
			return null;
		case RulesPackage.REQ_CONTAINER_TO_IMPL_CONTAINER_RULE___IS_APPROPRIATE_SOLVE_CSP_BWD__MATCH_CONTAINER:
			return isAppropriate_solveCsp_BWD((Match) arguments.get(0), (implementation.Container) arguments.get(1));
		case RulesPackage.REQ_CONTAINER_TO_IMPL_CONTAINER_RULE___IS_APPROPRIATE_CHECK_CSP_BWD__CSP:
			return isAppropriate_checkCsp_BWD((CSP) arguments.get(0));
		case RulesPackage.REQ_CONTAINER_TO_IMPL_CONTAINER_RULE___IS_APPLICABLE_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_CONTAINER:
			return isApplicable_solveCsp_BWD((IsApplicableMatch) arguments.get(0),
					(implementation.Container) arguments.get(1));
		case RulesPackage.REQ_CONTAINER_TO_IMPL_CONTAINER_RULE___IS_APPLICABLE_CHECK_CSP_BWD__CSP:
			return isApplicable_checkCsp_BWD((CSP) arguments.get(0));
		case RulesPackage.REQ_CONTAINER_TO_IMPL_CONTAINER_RULE___REGISTER_OBJECTS_BWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT:
			registerObjects_BWD((PerformRuleResult) arguments.get(0), (EObject) arguments.get(1),
					(EObject) arguments.get(2), (EObject) arguments.get(3), (EObject) arguments.get(4));
			return null;
		case RulesPackage.REQ_CONTAINER_TO_IMPL_CONTAINER_RULE___CHECK_TYPES_BWD__MATCH:
			return checkTypes_BWD((Match) arguments.get(0));
		case RulesPackage.REQ_CONTAINER_TO_IMPL_CONTAINER_RULE___IS_APPROPRIATE_BWD_CONTAINER_0__CONTAINER:
			return isAppropriate_BWD_Container_0((implementation.Container) arguments.get(0));
		case RulesPackage.REQ_CONTAINER_TO_IMPL_CONTAINER_RULE___IS_APPROPRIATE_FWD_EMOFLON_EDGE_2__EMOFLONEDGE:
			return isAppropriate_FWD_EMoflonEdge_2((EMoflonEdge) arguments.get(0));
		case RulesPackage.REQ_CONTAINER_TO_IMPL_CONTAINER_RULE___CHECK_ATTRIBUTES_FWD__TRIPLEMATCH:
			return checkAttributes_FWD((TripleMatch) arguments.get(0));
		case RulesPackage.REQ_CONTAINER_TO_IMPL_CONTAINER_RULE___CHECK_ATTRIBUTES_BWD__TRIPLEMATCH:
			return checkAttributes_BWD((TripleMatch) arguments.get(0));
		case RulesPackage.REQ_CONTAINER_TO_IMPL_CONTAINER_RULE___IS_APPLICABLE_CC__MATCH_MATCH:
			return isApplicable_CC((Match) arguments.get(0), (Match) arguments.get(1));
		case RulesPackage.REQ_CONTAINER_TO_IMPL_CONTAINER_RULE___IS_APPLICABLE_SOLVE_CSP_CC__CONTAINER_NETWORKSPAN_CONTAINER_MATCH_MATCH:
			return isApplicable_solveCsp_CC((Container) arguments.get(0), (NetworkSpan) arguments.get(1),
					(implementation.Container) arguments.get(2), (Match) arguments.get(3), (Match) arguments.get(4));
		case RulesPackage.REQ_CONTAINER_TO_IMPL_CONTAINER_RULE___IS_APPLICABLE_CHECK_CSP_CC__CSP:
			return isApplicable_checkCsp_CC((CSP) arguments.get(0));
		case RulesPackage.REQ_CONTAINER_TO_IMPL_CONTAINER_RULE___CHECK_DEC_FWD__CONTAINER_NETWORKSPAN:
			return checkDEC_FWD((Container) arguments.get(0), (NetworkSpan) arguments.get(1));
		case RulesPackage.REQ_CONTAINER_TO_IMPL_CONTAINER_RULE___CHECK_DEC_BWD__CONTAINER:
			return checkDEC_BWD((implementation.Container) arguments.get(0));
		case RulesPackage.REQ_CONTAINER_TO_IMPL_CONTAINER_RULE___GENERATE_MODEL__RULEENTRYCONTAINER:
			return generateModel((RuleEntryContainer) arguments.get(0));
		case RulesPackage.REQ_CONTAINER_TO_IMPL_CONTAINER_RULE___GENERATE_MODEL_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_MODELGENERATORRULERESULT:
			return generateModel_solveCsp_BWD((IsApplicableMatch) arguments.get(0),
					(ModelgeneratorRuleResult) arguments.get(1));
		case RulesPackage.REQ_CONTAINER_TO_IMPL_CONTAINER_RULE___GENERATE_MODEL_CHECK_CSP_BWD__CSP:
			return generateModel_checkCsp_BWD((CSP) arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
	}

	public static final Object[] pattern_ReqContainerToImplContainerRule_0_1_initialbindings_blackBBBB(
			ReqContainerToImplContainerRule _this, Match match, Container reqContainer, NetworkSpan virtualNode) {
		return new Object[] { _this, match, reqContainer, virtualNode };
	}

	public static final Object[] pattern_ReqContainerToImplContainerRule_0_2_SolveCSP_bindingFBBBB(
			ReqContainerToImplContainerRule _this, Match match, Container reqContainer, NetworkSpan virtualNode) {
		CSP _localVariable_0 = _this.isAppropriate_solveCsp_FWD(match, reqContainer, virtualNode);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, match, reqContainer, virtualNode };
		}
		return null;
	}

	public static final Object[] pattern_ReqContainerToImplContainerRule_0_2_SolveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_ReqContainerToImplContainerRule_0_2_SolveCSP_bindingAndBlackFBBBB(
			ReqContainerToImplContainerRule _this, Match match, Container reqContainer, NetworkSpan virtualNode) {
		Object[] result_pattern_ReqContainerToImplContainerRule_0_2_SolveCSP_binding = pattern_ReqContainerToImplContainerRule_0_2_SolveCSP_bindingFBBBB(
				_this, match, reqContainer, virtualNode);
		if (result_pattern_ReqContainerToImplContainerRule_0_2_SolveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_ReqContainerToImplContainerRule_0_2_SolveCSP_binding[0];

			Object[] result_pattern_ReqContainerToImplContainerRule_0_2_SolveCSP_black = pattern_ReqContainerToImplContainerRule_0_2_SolveCSP_blackB(
					csp);
			if (result_pattern_ReqContainerToImplContainerRule_0_2_SolveCSP_black != null) {

				return new Object[] { csp, _this, match, reqContainer, virtualNode };
			}
		}
		return null;
	}

	public static final boolean pattern_ReqContainerToImplContainerRule_0_3_CheckCSP_expressionFBB(
			ReqContainerToImplContainerRule _this, CSP csp) {
		boolean _localVariable_0 = _this.isAppropriate_checkCsp_FWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_ReqContainerToImplContainerRule_0_4_collectelementstobetranslated_blackBBB(
			Match match, Container reqContainer, NetworkSpan virtualNode) {
		return new Object[] { match, reqContainer, virtualNode };
	}

	public static final Object[] pattern_ReqContainerToImplContainerRule_0_4_collectelementstobetranslated_greenBBBF(
			Match match, Container reqContainer, NetworkSpan virtualNode) {
		EMoflonEdge reqContainer__virtualNode____networkSpan = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		match.getToBeTranslatedNodes().add(reqContainer);
		match.getToBeTranslatedNodes().add(virtualNode);
		String reqContainer__virtualNode____networkSpan_name_prime = "networkSpan";
		reqContainer__virtualNode____networkSpan.setSrc(reqContainer);
		reqContainer__virtualNode____networkSpan.setTrg(virtualNode);
		match.getToBeTranslatedEdges().add(reqContainer__virtualNode____networkSpan);
		reqContainer__virtualNode____networkSpan.setName(reqContainer__virtualNode____networkSpan_name_prime);
		return new Object[] { match, reqContainer, virtualNode, reqContainer__virtualNode____networkSpan };
	}

	public static final Object[] pattern_ReqContainerToImplContainerRule_0_5_collectcontextelements_blackBBB(
			Match match, Container reqContainer, NetworkSpan virtualNode) {
		return new Object[] { match, reqContainer, virtualNode };
	}

	public static final void pattern_ReqContainerToImplContainerRule_0_6_registerobjectstomatch_expressionBBBB(
			ReqContainerToImplContainerRule _this, Match match, Container reqContainer, NetworkSpan virtualNode) {
		_this.registerObjectsToMatch_FWD(match, reqContainer, virtualNode);

	}

	public static final boolean pattern_ReqContainerToImplContainerRule_0_7_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_ReqContainerToImplContainerRule_0_8_expressionF() {
		boolean _result = Boolean.valueOf(false);
		return _result;
	}

	public static final Object[] pattern_ReqContainerToImplContainerRule_1_1_performtransformation_bindingFFB(
			IsApplicableMatch isApplicableMatch) {
		EObject _localVariable_0 = isApplicableMatch.getObject("reqContainer");
		EObject _localVariable_1 = isApplicableMatch.getObject("virtualNode");
		EObject tmpReqContainer = _localVariable_0;
		EObject tmpVirtualNode = _localVariable_1;
		if (tmpReqContainer instanceof Container) {
			Container reqContainer = (Container) tmpReqContainer;
			if (tmpVirtualNode instanceof NetworkSpan) {
				NetworkSpan virtualNode = (NetworkSpan) tmpVirtualNode;
				return new Object[] { reqContainer, virtualNode, isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_ReqContainerToImplContainerRule_1_1_performtransformation_blackBBFBB(
			Container reqContainer, NetworkSpan virtualNode, ReqContainerToImplContainerRule _this,
			IsApplicableMatch isApplicableMatch) {
		for (EObject tmpCsp : isApplicableMatch.getAttributeInfo()) {
			if (tmpCsp instanceof CSP) {
				CSP csp = (CSP) tmpCsp;
				return new Object[] { reqContainer, virtualNode, csp, _this, isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_ReqContainerToImplContainerRule_1_1_performtransformation_bindingAndBlackFFFBB(
			ReqContainerToImplContainerRule _this, IsApplicableMatch isApplicableMatch) {
		Object[] result_pattern_ReqContainerToImplContainerRule_1_1_performtransformation_binding = pattern_ReqContainerToImplContainerRule_1_1_performtransformation_bindingFFB(
				isApplicableMatch);
		if (result_pattern_ReqContainerToImplContainerRule_1_1_performtransformation_binding != null) {
			Container reqContainer = (Container) result_pattern_ReqContainerToImplContainerRule_1_1_performtransformation_binding[0];
			NetworkSpan virtualNode = (NetworkSpan) result_pattern_ReqContainerToImplContainerRule_1_1_performtransformation_binding[1];

			Object[] result_pattern_ReqContainerToImplContainerRule_1_1_performtransformation_black = pattern_ReqContainerToImplContainerRule_1_1_performtransformation_blackBBFBB(
					reqContainer, virtualNode, _this, isApplicableMatch);
			if (result_pattern_ReqContainerToImplContainerRule_1_1_performtransformation_black != null) {
				CSP csp = (CSP) result_pattern_ReqContainerToImplContainerRule_1_1_performtransformation_black[2];

				return new Object[] { reqContainer, virtualNode, csp, _this, isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_ReqContainerToImplContainerRule_1_1_performtransformation_greenBFF(
			Container reqContainer) {
		implementation.Container implContainer = ImplementationFactory.eINSTANCE.createContainer();
		ReqContainerToImplContainer reqContainerToImplContainer = ReqToImpTransformatorFactory.eINSTANCE
				.createReqContainerToImplContainer();
		reqContainerToImplContainer.setTarget(implContainer);
		reqContainerToImplContainer.setSource(reqContainer);
		return new Object[] { reqContainer, implContainer, reqContainerToImplContainer };
	}

	public static final Object[] pattern_ReqContainerToImplContainerRule_1_2_collecttranslatedelements_blackBBBB(
			Container reqContainer, NetworkSpan virtualNode, implementation.Container implContainer,
			ReqContainerToImplContainer reqContainerToImplContainer) {
		return new Object[] { reqContainer, virtualNode, implContainer, reqContainerToImplContainer };
	}

	public static final Object[] pattern_ReqContainerToImplContainerRule_1_2_collecttranslatedelements_greenFBBBB(
			Container reqContainer, NetworkSpan virtualNode, implementation.Container implContainer,
			ReqContainerToImplContainer reqContainerToImplContainer) {
		PerformRuleResult ruleresult = RuntimeFactory.eINSTANCE.createPerformRuleResult();
		ruleresult.getTranslatedElements().add(reqContainer);
		ruleresult.getTranslatedElements().add(virtualNode);
		ruleresult.getCreatedElements().add(implContainer);
		ruleresult.getCreatedLinkElements().add(reqContainerToImplContainer);
		return new Object[] { ruleresult, reqContainer, virtualNode, implContainer, reqContainerToImplContainer };
	}

	public static final Object[] pattern_ReqContainerToImplContainerRule_1_3_bookkeepingforedges_blackBBBBB(
			PerformRuleResult ruleresult, EObject reqContainer, EObject virtualNode, EObject implContainer,
			EObject reqContainerToImplContainer) {
		if (!reqContainer.equals(virtualNode)) {
			if (!reqContainer.equals(reqContainerToImplContainer)) {
				if (!implContainer.equals(reqContainer)) {
					if (!implContainer.equals(virtualNode)) {
						if (!implContainer.equals(reqContainerToImplContainer)) {
							if (!reqContainerToImplContainer.equals(virtualNode)) {
								return new Object[] { ruleresult, reqContainer, virtualNode, implContainer,
										reqContainerToImplContainer };
							}
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_ReqContainerToImplContainerRule_1_3_bookkeepingforedges_greenBBBBBFFF(
			PerformRuleResult ruleresult, EObject reqContainer, EObject virtualNode, EObject implContainer,
			EObject reqContainerToImplContainer) {
		EMoflonEdge reqContainer__virtualNode____networkSpan = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge reqContainerToImplContainer__implContainer____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge reqContainerToImplContainer__reqContainer____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String ruleresult_ruleName_prime = "ReqContainerToImplContainerRule";
		String reqContainer__virtualNode____networkSpan_name_prime = "networkSpan";
		String reqContainerToImplContainer__implContainer____target_name_prime = "target";
		String reqContainerToImplContainer__reqContainer____source_name_prime = "source";
		reqContainer__virtualNode____networkSpan.setSrc(reqContainer);
		reqContainer__virtualNode____networkSpan.setTrg(virtualNode);
		ruleresult.getTranslatedEdges().add(reqContainer__virtualNode____networkSpan);
		reqContainerToImplContainer__implContainer____target.setSrc(reqContainerToImplContainer);
		reqContainerToImplContainer__implContainer____target.setTrg(implContainer);
		ruleresult.getCreatedEdges().add(reqContainerToImplContainer__implContainer____target);
		reqContainerToImplContainer__reqContainer____source.setSrc(reqContainerToImplContainer);
		reqContainerToImplContainer__reqContainer____source.setTrg(reqContainer);
		ruleresult.getCreatedEdges().add(reqContainerToImplContainer__reqContainer____source);
		ruleresult.setRuleName(ruleresult_ruleName_prime);
		reqContainer__virtualNode____networkSpan.setName(reqContainer__virtualNode____networkSpan_name_prime);
		reqContainerToImplContainer__implContainer____target
				.setName(reqContainerToImplContainer__implContainer____target_name_prime);
		reqContainerToImplContainer__reqContainer____source
				.setName(reqContainerToImplContainer__reqContainer____source_name_prime);
		return new Object[] { ruleresult, reqContainer, virtualNode, implContainer, reqContainerToImplContainer,
				reqContainer__virtualNode____networkSpan, reqContainerToImplContainer__implContainer____target,
				reqContainerToImplContainer__reqContainer____source };
	}

	public static final void pattern_ReqContainerToImplContainerRule_1_5_registerobjects_expressionBBBBBB(
			ReqContainerToImplContainerRule _this, PerformRuleResult ruleresult, EObject reqContainer,
			EObject virtualNode, EObject implContainer, EObject reqContainerToImplContainer) {
		_this.registerObjects_FWD(ruleresult, reqContainer, virtualNode, implContainer, reqContainerToImplContainer);

	}

	public static final PerformRuleResult pattern_ReqContainerToImplContainerRule_1_6_expressionFB(
			PerformRuleResult ruleresult) {
		PerformRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_ReqContainerToImplContainerRule_2_1_preparereturnvalue_bindingFB(
			ReqContainerToImplContainerRule _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass eClass = _localVariable_0;
		if (eClass != null) {
			return new Object[] { eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_ReqContainerToImplContainerRule_2_1_preparereturnvalue_blackFBB(EClass eClass,
			ReqContainerToImplContainerRule _this) {
		for (EOperation performOperation : eClass.getEOperations()) {
			String performOperation_name = performOperation.getName();
			if (performOperation_name.equals("perform_FWD")) {
				return new Object[] { performOperation, eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_ReqContainerToImplContainerRule_2_1_preparereturnvalue_bindingAndBlackFFB(
			ReqContainerToImplContainerRule _this) {
		Object[] result_pattern_ReqContainerToImplContainerRule_2_1_preparereturnvalue_binding = pattern_ReqContainerToImplContainerRule_2_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_ReqContainerToImplContainerRule_2_1_preparereturnvalue_binding != null) {
			EClass eClass = (EClass) result_pattern_ReqContainerToImplContainerRule_2_1_preparereturnvalue_binding[0];

			Object[] result_pattern_ReqContainerToImplContainerRule_2_1_preparereturnvalue_black = pattern_ReqContainerToImplContainerRule_2_1_preparereturnvalue_blackFBB(
					eClass, _this);
			if (result_pattern_ReqContainerToImplContainerRule_2_1_preparereturnvalue_black != null) {
				EOperation performOperation = (EOperation) result_pattern_ReqContainerToImplContainerRule_2_1_preparereturnvalue_black[0];

				return new Object[] { performOperation, eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_ReqContainerToImplContainerRule_2_1_preparereturnvalue_greenBF(
			EOperation performOperation) {
		IsApplicableRuleResult ruleresult = RuntimeFactory.eINSTANCE.createIsApplicableRuleResult();
		boolean ruleresult_success_prime = Boolean.valueOf(false);
		String ruleresult_rule_prime = "ReqContainerToImplContainerRule";
		ruleresult.setPerformOperation(performOperation);
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		ruleresult.setRule(ruleresult_rule_prime);
		return new Object[] { performOperation, ruleresult };
	}

	public static final Object[] pattern_ReqContainerToImplContainerRule_2_2_corematch_bindingFFB(Match match) {
		EObject _localVariable_0 = match.getObject("reqContainer");
		EObject _localVariable_1 = match.getObject("virtualNode");
		EObject tmpReqContainer = _localVariable_0;
		EObject tmpVirtualNode = _localVariable_1;
		if (tmpReqContainer instanceof Container) {
			Container reqContainer = (Container) tmpReqContainer;
			if (tmpVirtualNode instanceof NetworkSpan) {
				NetworkSpan virtualNode = (NetworkSpan) tmpVirtualNode;
				return new Object[] { reqContainer, virtualNode, match };
			}
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_ReqContainerToImplContainerRule_2_2_corematch_blackBBB(
			Container reqContainer, NetworkSpan virtualNode, Match match) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		_result.add(new Object[] { reqContainer, virtualNode, match });
		return _result;
	}

	public static final Iterable<Object[]> pattern_ReqContainerToImplContainerRule_2_3_findcontext_blackBB(
			Container reqContainer, NetworkSpan virtualNode) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (virtualNode.equals(reqContainer.getNetworkSpan())) {
			_result.add(new Object[] { reqContainer, virtualNode });
		}
		return _result;
	}

	public static final Object[] pattern_ReqContainerToImplContainerRule_2_3_findcontext_greenBBFF(
			Container reqContainer, NetworkSpan virtualNode) {
		IsApplicableMatch isApplicableMatch = RuntimeFactory.eINSTANCE.createIsApplicableMatch();
		EMoflonEdge reqContainer__virtualNode____networkSpan = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String reqContainer__virtualNode____networkSpan_name_prime = "networkSpan";
		isApplicableMatch.getAllContextElements().add(reqContainer);
		isApplicableMatch.getAllContextElements().add(virtualNode);
		reqContainer__virtualNode____networkSpan.setSrc(reqContainer);
		reqContainer__virtualNode____networkSpan.setTrg(virtualNode);
		isApplicableMatch.getAllContextElements().add(reqContainer__virtualNode____networkSpan);
		reqContainer__virtualNode____networkSpan.setName(reqContainer__virtualNode____networkSpan_name_prime);
		return new Object[] { reqContainer, virtualNode, isApplicableMatch, reqContainer__virtualNode____networkSpan };
	}

	public static final Object[] pattern_ReqContainerToImplContainerRule_2_4_solveCSP_bindingFBBBB(
			ReqContainerToImplContainerRule _this, IsApplicableMatch isApplicableMatch, Container reqContainer,
			NetworkSpan virtualNode) {
		CSP _localVariable_0 = _this.isApplicable_solveCsp_FWD(isApplicableMatch, reqContainer, virtualNode);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, reqContainer, virtualNode };
		}
		return null;
	}

	public static final Object[] pattern_ReqContainerToImplContainerRule_2_4_solveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_ReqContainerToImplContainerRule_2_4_solveCSP_bindingAndBlackFBBBB(
			ReqContainerToImplContainerRule _this, IsApplicableMatch isApplicableMatch, Container reqContainer,
			NetworkSpan virtualNode) {
		Object[] result_pattern_ReqContainerToImplContainerRule_2_4_solveCSP_binding = pattern_ReqContainerToImplContainerRule_2_4_solveCSP_bindingFBBBB(
				_this, isApplicableMatch, reqContainer, virtualNode);
		if (result_pattern_ReqContainerToImplContainerRule_2_4_solveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_ReqContainerToImplContainerRule_2_4_solveCSP_binding[0];

			Object[] result_pattern_ReqContainerToImplContainerRule_2_4_solveCSP_black = pattern_ReqContainerToImplContainerRule_2_4_solveCSP_blackB(
					csp);
			if (result_pattern_ReqContainerToImplContainerRule_2_4_solveCSP_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, reqContainer, virtualNode };
			}
		}
		return null;
	}

	public static final boolean pattern_ReqContainerToImplContainerRule_2_5_checkCSP_expressionFBB(
			ReqContainerToImplContainerRule _this, CSP csp) {
		boolean _localVariable_0 = _this.isApplicable_checkCsp_FWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_ReqContainerToImplContainerRule_2_6_addmatchtoruleresult_blackBB(
			IsApplicableRuleResult ruleresult, IsApplicableMatch isApplicableMatch) {
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final Object[] pattern_ReqContainerToImplContainerRule_2_6_addmatchtoruleresult_greenBB(
			IsApplicableRuleResult ruleresult, IsApplicableMatch isApplicableMatch) {
		ruleresult.getIsApplicableMatch().add(isApplicableMatch);
		boolean ruleresult_success_prime = Boolean.valueOf(true);
		String isApplicableMatch_ruleName_prime = "ReqContainerToImplContainerRule";
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		isApplicableMatch.setRuleName(isApplicableMatch_ruleName_prime);
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final IsApplicableRuleResult pattern_ReqContainerToImplContainerRule_2_7_expressionFB(
			IsApplicableRuleResult ruleresult) {
		IsApplicableRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_ReqContainerToImplContainerRule_10_1_initialbindings_blackBBB(
			ReqContainerToImplContainerRule _this, Match match, implementation.Container implContainer) {
		return new Object[] { _this, match, implContainer };
	}

	public static final Object[] pattern_ReqContainerToImplContainerRule_10_2_SolveCSP_bindingFBBB(
			ReqContainerToImplContainerRule _this, Match match, implementation.Container implContainer) {
		CSP _localVariable_0 = _this.isAppropriate_solveCsp_BWD(match, implContainer);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, match, implContainer };
		}
		return null;
	}

	public static final Object[] pattern_ReqContainerToImplContainerRule_10_2_SolveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_ReqContainerToImplContainerRule_10_2_SolveCSP_bindingAndBlackFBBB(
			ReqContainerToImplContainerRule _this, Match match, implementation.Container implContainer) {
		Object[] result_pattern_ReqContainerToImplContainerRule_10_2_SolveCSP_binding = pattern_ReqContainerToImplContainerRule_10_2_SolveCSP_bindingFBBB(
				_this, match, implContainer);
		if (result_pattern_ReqContainerToImplContainerRule_10_2_SolveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_ReqContainerToImplContainerRule_10_2_SolveCSP_binding[0];

			Object[] result_pattern_ReqContainerToImplContainerRule_10_2_SolveCSP_black = pattern_ReqContainerToImplContainerRule_10_2_SolveCSP_blackB(
					csp);
			if (result_pattern_ReqContainerToImplContainerRule_10_2_SolveCSP_black != null) {

				return new Object[] { csp, _this, match, implContainer };
			}
		}
		return null;
	}

	public static final boolean pattern_ReqContainerToImplContainerRule_10_3_CheckCSP_expressionFBB(
			ReqContainerToImplContainerRule _this, CSP csp) {
		boolean _localVariable_0 = _this.isAppropriate_checkCsp_BWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_ReqContainerToImplContainerRule_10_4_collectelementstobetranslated_blackBB(
			Match match, implementation.Container implContainer) {
		return new Object[] { match, implContainer };
	}

	public static final Object[] pattern_ReqContainerToImplContainerRule_10_4_collectelementstobetranslated_greenBB(
			Match match, implementation.Container implContainer) {
		match.getToBeTranslatedNodes().add(implContainer);
		return new Object[] { match, implContainer };
	}

	public static final Object[] pattern_ReqContainerToImplContainerRule_10_5_collectcontextelements_blackBB(
			Match match, implementation.Container implContainer) {
		return new Object[] { match, implContainer };
	}

	public static final void pattern_ReqContainerToImplContainerRule_10_6_registerobjectstomatch_expressionBBB(
			ReqContainerToImplContainerRule _this, Match match, implementation.Container implContainer) {
		_this.registerObjectsToMatch_BWD(match, implContainer);

	}

	public static final boolean pattern_ReqContainerToImplContainerRule_10_7_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_ReqContainerToImplContainerRule_10_8_expressionF() {
		boolean _result = Boolean.valueOf(false);
		return _result;
	}

	public static final Object[] pattern_ReqContainerToImplContainerRule_11_1_performtransformation_bindingFB(
			IsApplicableMatch isApplicableMatch) {
		EObject _localVariable_0 = isApplicableMatch.getObject("implContainer");
		EObject tmpImplContainer = _localVariable_0;
		if (tmpImplContainer instanceof implementation.Container) {
			implementation.Container implContainer = (implementation.Container) tmpImplContainer;
			return new Object[] { implContainer, isApplicableMatch };
		}
		return null;
	}

	public static final Object[] pattern_ReqContainerToImplContainerRule_11_1_performtransformation_blackBFBB(
			implementation.Container implContainer, ReqContainerToImplContainerRule _this,
			IsApplicableMatch isApplicableMatch) {
		for (EObject tmpCsp : isApplicableMatch.getAttributeInfo()) {
			if (tmpCsp instanceof CSP) {
				CSP csp = (CSP) tmpCsp;
				return new Object[] { implContainer, csp, _this, isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_ReqContainerToImplContainerRule_11_1_performtransformation_bindingAndBlackFFBB(
			ReqContainerToImplContainerRule _this, IsApplicableMatch isApplicableMatch) {
		Object[] result_pattern_ReqContainerToImplContainerRule_11_1_performtransformation_binding = pattern_ReqContainerToImplContainerRule_11_1_performtransformation_bindingFB(
				isApplicableMatch);
		if (result_pattern_ReqContainerToImplContainerRule_11_1_performtransformation_binding != null) {
			implementation.Container implContainer = (implementation.Container) result_pattern_ReqContainerToImplContainerRule_11_1_performtransformation_binding[0];

			Object[] result_pattern_ReqContainerToImplContainerRule_11_1_performtransformation_black = pattern_ReqContainerToImplContainerRule_11_1_performtransformation_blackBFBB(
					implContainer, _this, isApplicableMatch);
			if (result_pattern_ReqContainerToImplContainerRule_11_1_performtransformation_black != null) {
				CSP csp = (CSP) result_pattern_ReqContainerToImplContainerRule_11_1_performtransformation_black[1];

				return new Object[] { implContainer, csp, _this, isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_ReqContainerToImplContainerRule_11_1_performtransformation_greenFFBF(
			implementation.Container implContainer) {
		Container reqContainer = RequirementsFactory.eINSTANCE.createContainer();
		NetworkSpan virtualNode = RequirementsFactory.eINSTANCE.createNetworkSpan();
		ReqContainerToImplContainer reqContainerToImplContainer = ReqToImpTransformatorFactory.eINSTANCE
				.createReqContainerToImplContainer();
		reqContainer.setNetworkSpan(virtualNode);
		reqContainerToImplContainer.setTarget(implContainer);
		reqContainerToImplContainer.setSource(reqContainer);
		return new Object[] { reqContainer, virtualNode, implContainer, reqContainerToImplContainer };
	}

	public static final Object[] pattern_ReqContainerToImplContainerRule_11_2_collecttranslatedelements_blackBBBB(
			Container reqContainer, NetworkSpan virtualNode, implementation.Container implContainer,
			ReqContainerToImplContainer reqContainerToImplContainer) {
		return new Object[] { reqContainer, virtualNode, implContainer, reqContainerToImplContainer };
	}

	public static final Object[] pattern_ReqContainerToImplContainerRule_11_2_collecttranslatedelements_greenFBBBB(
			Container reqContainer, NetworkSpan virtualNode, implementation.Container implContainer,
			ReqContainerToImplContainer reqContainerToImplContainer) {
		PerformRuleResult ruleresult = RuntimeFactory.eINSTANCE.createPerformRuleResult();
		ruleresult.getCreatedElements().add(reqContainer);
		ruleresult.getCreatedElements().add(virtualNode);
		ruleresult.getTranslatedElements().add(implContainer);
		ruleresult.getCreatedLinkElements().add(reqContainerToImplContainer);
		return new Object[] { ruleresult, reqContainer, virtualNode, implContainer, reqContainerToImplContainer };
	}

	public static final Object[] pattern_ReqContainerToImplContainerRule_11_3_bookkeepingforedges_blackBBBBB(
			PerformRuleResult ruleresult, EObject reqContainer, EObject virtualNode, EObject implContainer,
			EObject reqContainerToImplContainer) {
		if (!reqContainer.equals(virtualNode)) {
			if (!reqContainer.equals(reqContainerToImplContainer)) {
				if (!implContainer.equals(reqContainer)) {
					if (!implContainer.equals(virtualNode)) {
						if (!implContainer.equals(reqContainerToImplContainer)) {
							if (!reqContainerToImplContainer.equals(virtualNode)) {
								return new Object[] { ruleresult, reqContainer, virtualNode, implContainer,
										reqContainerToImplContainer };
							}
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_ReqContainerToImplContainerRule_11_3_bookkeepingforedges_greenBBBBBFFF(
			PerformRuleResult ruleresult, EObject reqContainer, EObject virtualNode, EObject implContainer,
			EObject reqContainerToImplContainer) {
		EMoflonEdge reqContainer__virtualNode____networkSpan = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge reqContainerToImplContainer__implContainer____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge reqContainerToImplContainer__reqContainer____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String ruleresult_ruleName_prime = "ReqContainerToImplContainerRule";
		String reqContainer__virtualNode____networkSpan_name_prime = "networkSpan";
		String reqContainerToImplContainer__implContainer____target_name_prime = "target";
		String reqContainerToImplContainer__reqContainer____source_name_prime = "source";
		reqContainer__virtualNode____networkSpan.setSrc(reqContainer);
		reqContainer__virtualNode____networkSpan.setTrg(virtualNode);
		ruleresult.getCreatedEdges().add(reqContainer__virtualNode____networkSpan);
		reqContainerToImplContainer__implContainer____target.setSrc(reqContainerToImplContainer);
		reqContainerToImplContainer__implContainer____target.setTrg(implContainer);
		ruleresult.getCreatedEdges().add(reqContainerToImplContainer__implContainer____target);
		reqContainerToImplContainer__reqContainer____source.setSrc(reqContainerToImplContainer);
		reqContainerToImplContainer__reqContainer____source.setTrg(reqContainer);
		ruleresult.getCreatedEdges().add(reqContainerToImplContainer__reqContainer____source);
		ruleresult.setRuleName(ruleresult_ruleName_prime);
		reqContainer__virtualNode____networkSpan.setName(reqContainer__virtualNode____networkSpan_name_prime);
		reqContainerToImplContainer__implContainer____target
				.setName(reqContainerToImplContainer__implContainer____target_name_prime);
		reqContainerToImplContainer__reqContainer____source
				.setName(reqContainerToImplContainer__reqContainer____source_name_prime);
		return new Object[] { ruleresult, reqContainer, virtualNode, implContainer, reqContainerToImplContainer,
				reqContainer__virtualNode____networkSpan, reqContainerToImplContainer__implContainer____target,
				reqContainerToImplContainer__reqContainer____source };
	}

	public static final void pattern_ReqContainerToImplContainerRule_11_5_registerobjects_expressionBBBBBB(
			ReqContainerToImplContainerRule _this, PerformRuleResult ruleresult, EObject reqContainer,
			EObject virtualNode, EObject implContainer, EObject reqContainerToImplContainer) {
		_this.registerObjects_BWD(ruleresult, reqContainer, virtualNode, implContainer, reqContainerToImplContainer);

	}

	public static final PerformRuleResult pattern_ReqContainerToImplContainerRule_11_6_expressionFB(
			PerformRuleResult ruleresult) {
		PerformRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_ReqContainerToImplContainerRule_12_1_preparereturnvalue_bindingFB(
			ReqContainerToImplContainerRule _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass eClass = _localVariable_0;
		if (eClass != null) {
			return new Object[] { eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_ReqContainerToImplContainerRule_12_1_preparereturnvalue_blackFBB(EClass eClass,
			ReqContainerToImplContainerRule _this) {
		for (EOperation performOperation : eClass.getEOperations()) {
			String performOperation_name = performOperation.getName();
			if (performOperation_name.equals("perform_BWD")) {
				return new Object[] { performOperation, eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_ReqContainerToImplContainerRule_12_1_preparereturnvalue_bindingAndBlackFFB(
			ReqContainerToImplContainerRule _this) {
		Object[] result_pattern_ReqContainerToImplContainerRule_12_1_preparereturnvalue_binding = pattern_ReqContainerToImplContainerRule_12_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_ReqContainerToImplContainerRule_12_1_preparereturnvalue_binding != null) {
			EClass eClass = (EClass) result_pattern_ReqContainerToImplContainerRule_12_1_preparereturnvalue_binding[0];

			Object[] result_pattern_ReqContainerToImplContainerRule_12_1_preparereturnvalue_black = pattern_ReqContainerToImplContainerRule_12_1_preparereturnvalue_blackFBB(
					eClass, _this);
			if (result_pattern_ReqContainerToImplContainerRule_12_1_preparereturnvalue_black != null) {
				EOperation performOperation = (EOperation) result_pattern_ReqContainerToImplContainerRule_12_1_preparereturnvalue_black[0];

				return new Object[] { performOperation, eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_ReqContainerToImplContainerRule_12_1_preparereturnvalue_greenBF(
			EOperation performOperation) {
		IsApplicableRuleResult ruleresult = RuntimeFactory.eINSTANCE.createIsApplicableRuleResult();
		boolean ruleresult_success_prime = Boolean.valueOf(false);
		String ruleresult_rule_prime = "ReqContainerToImplContainerRule";
		ruleresult.setPerformOperation(performOperation);
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		ruleresult.setRule(ruleresult_rule_prime);
		return new Object[] { performOperation, ruleresult };
	}

	public static final Object[] pattern_ReqContainerToImplContainerRule_12_2_corematch_bindingFB(Match match) {
		EObject _localVariable_0 = match.getObject("implContainer");
		EObject tmpImplContainer = _localVariable_0;
		if (tmpImplContainer instanceof implementation.Container) {
			implementation.Container implContainer = (implementation.Container) tmpImplContainer;
			return new Object[] { implContainer, match };
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_ReqContainerToImplContainerRule_12_2_corematch_blackBB(
			implementation.Container implContainer, Match match) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		_result.add(new Object[] { implContainer, match });
		return _result;
	}

	public static final Iterable<Object[]> pattern_ReqContainerToImplContainerRule_12_3_findcontext_blackB(
			implementation.Container implContainer) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		_result.add(new Object[] { implContainer });
		return _result;
	}

	public static final Object[] pattern_ReqContainerToImplContainerRule_12_3_findcontext_greenBF(
			implementation.Container implContainer) {
		IsApplicableMatch isApplicableMatch = RuntimeFactory.eINSTANCE.createIsApplicableMatch();
		isApplicableMatch.getAllContextElements().add(implContainer);
		return new Object[] { implContainer, isApplicableMatch };
	}

	public static final Object[] pattern_ReqContainerToImplContainerRule_12_4_solveCSP_bindingFBBB(
			ReqContainerToImplContainerRule _this, IsApplicableMatch isApplicableMatch,
			implementation.Container implContainer) {
		CSP _localVariable_0 = _this.isApplicable_solveCsp_BWD(isApplicableMatch, implContainer);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, implContainer };
		}
		return null;
	}

	public static final Object[] pattern_ReqContainerToImplContainerRule_12_4_solveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_ReqContainerToImplContainerRule_12_4_solveCSP_bindingAndBlackFBBB(
			ReqContainerToImplContainerRule _this, IsApplicableMatch isApplicableMatch,
			implementation.Container implContainer) {
		Object[] result_pattern_ReqContainerToImplContainerRule_12_4_solveCSP_binding = pattern_ReqContainerToImplContainerRule_12_4_solveCSP_bindingFBBB(
				_this, isApplicableMatch, implContainer);
		if (result_pattern_ReqContainerToImplContainerRule_12_4_solveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_ReqContainerToImplContainerRule_12_4_solveCSP_binding[0];

			Object[] result_pattern_ReqContainerToImplContainerRule_12_4_solveCSP_black = pattern_ReqContainerToImplContainerRule_12_4_solveCSP_blackB(
					csp);
			if (result_pattern_ReqContainerToImplContainerRule_12_4_solveCSP_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, implContainer };
			}
		}
		return null;
	}

	public static final boolean pattern_ReqContainerToImplContainerRule_12_5_checkCSP_expressionFBB(
			ReqContainerToImplContainerRule _this, CSP csp) {
		boolean _localVariable_0 = _this.isApplicable_checkCsp_BWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_ReqContainerToImplContainerRule_12_6_addmatchtoruleresult_blackBB(
			IsApplicableRuleResult ruleresult, IsApplicableMatch isApplicableMatch) {
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final Object[] pattern_ReqContainerToImplContainerRule_12_6_addmatchtoruleresult_greenBB(
			IsApplicableRuleResult ruleresult, IsApplicableMatch isApplicableMatch) {
		ruleresult.getIsApplicableMatch().add(isApplicableMatch);
		boolean ruleresult_success_prime = Boolean.valueOf(true);
		String isApplicableMatch_ruleName_prime = "ReqContainerToImplContainerRule";
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		isApplicableMatch.setRuleName(isApplicableMatch_ruleName_prime);
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final IsApplicableRuleResult pattern_ReqContainerToImplContainerRule_12_7_expressionFB(
			IsApplicableRuleResult ruleresult) {
		IsApplicableRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_ReqContainerToImplContainerRule_20_1_preparereturnvalue_bindingFB(
			ReqContainerToImplContainerRule _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_ReqContainerToImplContainerRule_20_1_preparereturnvalue_blackFBBF(
			EClass __eClass, ReqContainerToImplContainerRule _this) {
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

	public static final Object[] pattern_ReqContainerToImplContainerRule_20_1_preparereturnvalue_bindingAndBlackFFBF(
			ReqContainerToImplContainerRule _this) {
		Object[] result_pattern_ReqContainerToImplContainerRule_20_1_preparereturnvalue_binding = pattern_ReqContainerToImplContainerRule_20_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_ReqContainerToImplContainerRule_20_1_preparereturnvalue_binding != null) {
			EClass __eClass = (EClass) result_pattern_ReqContainerToImplContainerRule_20_1_preparereturnvalue_binding[0];

			Object[] result_pattern_ReqContainerToImplContainerRule_20_1_preparereturnvalue_black = pattern_ReqContainerToImplContainerRule_20_1_preparereturnvalue_blackFBBF(
					__eClass, _this);
			if (result_pattern_ReqContainerToImplContainerRule_20_1_preparereturnvalue_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_ReqContainerToImplContainerRule_20_1_preparereturnvalue_black[0];
				EOperation isApplicableCC = (EOperation) result_pattern_ReqContainerToImplContainerRule_20_1_preparereturnvalue_black[3];

				return new Object[] { __performOperation, __eClass, _this, isApplicableCC };
			}
		}
		return null;
	}

	public static final Object[] pattern_ReqContainerToImplContainerRule_20_1_preparereturnvalue_greenF() {
		EObjectContainer __result = RuntimeFactory.eINSTANCE.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Iterable<Object[]> pattern_ReqContainerToImplContainerRule_20_2_testcorematchandDECs_blackB(
			implementation.Container implContainer) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		_result.add(new Object[] { implContainer });
		return _result;
	}

	public static final Object[] pattern_ReqContainerToImplContainerRule_20_2_testcorematchandDECs_greenFB(
			EClass __eClass) {
		Match match = RuntimeFactory.eINSTANCE.createMatch();
		String __eClass_name = __eClass.getName();
		String match_ruleName_prime = __eClass_name;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_ReqContainerToImplContainerRule_20_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBB(
			ReqContainerToImplContainerRule _this, Match match, implementation.Container implContainer) {
		boolean _localVariable_0 = _this.isAppropriate_BWD(match, implContainer);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_ReqContainerToImplContainerRule_20_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(
			ReqContainerToImplContainerRule _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_BWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_ReqContainerToImplContainerRule_20_5_Addmatchtoruleresult_blackBBBB(
			Match match, EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		if (!__performOperation.equals(isApplicableCC)) {
			return new Object[] { match, __performOperation, __result, isApplicableCC };
		}
		return null;
	}

	public static final Object[] pattern_ReqContainerToImplContainerRule_20_5_Addmatchtoruleresult_greenBBBB(
			Match match, EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		match.setIsApplicableCCOperation(isApplicableCC);
		return new Object[] { match, __performOperation, __result, isApplicableCC };
	}

	public static final EObjectContainer pattern_ReqContainerToImplContainerRule_20_6_expressionFB(
			EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_ReqContainerToImplContainerRule_21_1_preparereturnvalue_bindingFB(
			ReqContainerToImplContainerRule _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_ReqContainerToImplContainerRule_21_1_preparereturnvalue_blackFBBF(
			EClass __eClass, ReqContainerToImplContainerRule _this) {
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

	public static final Object[] pattern_ReqContainerToImplContainerRule_21_1_preparereturnvalue_bindingAndBlackFFBF(
			ReqContainerToImplContainerRule _this) {
		Object[] result_pattern_ReqContainerToImplContainerRule_21_1_preparereturnvalue_binding = pattern_ReqContainerToImplContainerRule_21_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_ReqContainerToImplContainerRule_21_1_preparereturnvalue_binding != null) {
			EClass __eClass = (EClass) result_pattern_ReqContainerToImplContainerRule_21_1_preparereturnvalue_binding[0];

			Object[] result_pattern_ReqContainerToImplContainerRule_21_1_preparereturnvalue_black = pattern_ReqContainerToImplContainerRule_21_1_preparereturnvalue_blackFBBF(
					__eClass, _this);
			if (result_pattern_ReqContainerToImplContainerRule_21_1_preparereturnvalue_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_ReqContainerToImplContainerRule_21_1_preparereturnvalue_black[0];
				EOperation isApplicableCC = (EOperation) result_pattern_ReqContainerToImplContainerRule_21_1_preparereturnvalue_black[3];

				return new Object[] { __performOperation, __eClass, _this, isApplicableCC };
			}
		}
		return null;
	}

	public static final Object[] pattern_ReqContainerToImplContainerRule_21_1_preparereturnvalue_greenF() {
		EObjectContainer __result = RuntimeFactory.eINSTANCE.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Iterable<Object[]> pattern_ReqContainerToImplContainerRule_21_2_testcorematchandDECs_blackFFB(
			EMoflonEdge _edge_networkSpan) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		EObject tmpReqContainer = _edge_networkSpan.getSrc();
		if (tmpReqContainer instanceof Container) {
			Container reqContainer = (Container) tmpReqContainer;
			EObject tmpVirtualNode = _edge_networkSpan.getTrg();
			if (tmpVirtualNode instanceof NetworkSpan) {
				NetworkSpan virtualNode = (NetworkSpan) tmpVirtualNode;
				if (virtualNode.equals(reqContainer.getNetworkSpan())) {
					_result.add(new Object[] { reqContainer, virtualNode, _edge_networkSpan });
				}
			}

		}

		return _result;
	}

	public static final Object[] pattern_ReqContainerToImplContainerRule_21_2_testcorematchandDECs_greenFB(
			EClass __eClass) {
		Match match = RuntimeFactory.eINSTANCE.createMatch();
		String __eClass_name = __eClass.getName();
		String match_ruleName_prime = __eClass_name;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_ReqContainerToImplContainerRule_21_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBB(
			ReqContainerToImplContainerRule _this, Match match, Container reqContainer, NetworkSpan virtualNode) {
		boolean _localVariable_0 = _this.isAppropriate_FWD(match, reqContainer, virtualNode);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_ReqContainerToImplContainerRule_21_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(
			ReqContainerToImplContainerRule _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_FWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_ReqContainerToImplContainerRule_21_5_Addmatchtoruleresult_blackBBBB(
			Match match, EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		if (!__performOperation.equals(isApplicableCC)) {
			return new Object[] { match, __performOperation, __result, isApplicableCC };
		}
		return null;
	}

	public static final Object[] pattern_ReqContainerToImplContainerRule_21_5_Addmatchtoruleresult_greenBBBB(
			Match match, EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		match.setIsApplicableCCOperation(isApplicableCC);
		return new Object[] { match, __performOperation, __result, isApplicableCC };
	}

	public static final EObjectContainer pattern_ReqContainerToImplContainerRule_21_6_expressionFB(
			EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_ReqContainerToImplContainerRule_24_1_prepare_blackB(
			ReqContainerToImplContainerRule _this) {
		return new Object[] { _this };
	}

	public static final Object[] pattern_ReqContainerToImplContainerRule_24_1_prepare_greenF() {
		IsApplicableRuleResult result = RuntimeFactory.eINSTANCE.createIsApplicableRuleResult();
		return new Object[] { result };
	}

	public static final Object[] pattern_ReqContainerToImplContainerRule_24_2_matchsrctrgcontext_bindingFFFBB(
			Match sourceMatch, Match targetMatch) {
		EObject _localVariable_0 = sourceMatch.getObject("reqContainer");
		EObject _localVariable_1 = sourceMatch.getObject("virtualNode");
		EObject _localVariable_2 = targetMatch.getObject("implContainer");
		EObject tmpReqContainer = _localVariable_0;
		EObject tmpVirtualNode = _localVariable_1;
		EObject tmpImplContainer = _localVariable_2;
		if (tmpReqContainer instanceof Container) {
			Container reqContainer = (Container) tmpReqContainer;
			if (tmpVirtualNode instanceof NetworkSpan) {
				NetworkSpan virtualNode = (NetworkSpan) tmpVirtualNode;
				if (tmpImplContainer instanceof implementation.Container) {
					implementation.Container implContainer = (implementation.Container) tmpImplContainer;
					return new Object[] { reqContainer, virtualNode, implContainer, sourceMatch, targetMatch };
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_ReqContainerToImplContainerRule_24_2_matchsrctrgcontext_blackBBBBB(
			Container reqContainer, NetworkSpan virtualNode, implementation.Container implContainer, Match sourceMatch,
			Match targetMatch) {
		if (!sourceMatch.equals(targetMatch)) {
			return new Object[] { reqContainer, virtualNode, implContainer, sourceMatch, targetMatch };
		}
		return null;
	}

	public static final Object[] pattern_ReqContainerToImplContainerRule_24_2_matchsrctrgcontext_bindingAndBlackFFFBB(
			Match sourceMatch, Match targetMatch) {
		Object[] result_pattern_ReqContainerToImplContainerRule_24_2_matchsrctrgcontext_binding = pattern_ReqContainerToImplContainerRule_24_2_matchsrctrgcontext_bindingFFFBB(
				sourceMatch, targetMatch);
		if (result_pattern_ReqContainerToImplContainerRule_24_2_matchsrctrgcontext_binding != null) {
			Container reqContainer = (Container) result_pattern_ReqContainerToImplContainerRule_24_2_matchsrctrgcontext_binding[0];
			NetworkSpan virtualNode = (NetworkSpan) result_pattern_ReqContainerToImplContainerRule_24_2_matchsrctrgcontext_binding[1];
			implementation.Container implContainer = (implementation.Container) result_pattern_ReqContainerToImplContainerRule_24_2_matchsrctrgcontext_binding[2];

			Object[] result_pattern_ReqContainerToImplContainerRule_24_2_matchsrctrgcontext_black = pattern_ReqContainerToImplContainerRule_24_2_matchsrctrgcontext_blackBBBBB(
					reqContainer, virtualNode, implContainer, sourceMatch, targetMatch);
			if (result_pattern_ReqContainerToImplContainerRule_24_2_matchsrctrgcontext_black != null) {

				return new Object[] { reqContainer, virtualNode, implContainer, sourceMatch, targetMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_ReqContainerToImplContainerRule_24_3_solvecsp_bindingFBBBBBB(
			ReqContainerToImplContainerRule _this, Container reqContainer, NetworkSpan virtualNode,
			implementation.Container implContainer, Match sourceMatch, Match targetMatch) {
		CSP _localVariable_3 = _this.isApplicable_solveCsp_CC(reqContainer, virtualNode, implContainer, sourceMatch,
				targetMatch);
		CSP csp = _localVariable_3;
		if (csp != null) {
			return new Object[] { csp, _this, reqContainer, virtualNode, implContainer, sourceMatch, targetMatch };
		}
		return null;
	}

	public static final Object[] pattern_ReqContainerToImplContainerRule_24_3_solvecsp_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_ReqContainerToImplContainerRule_24_3_solvecsp_bindingAndBlackFBBBBBB(
			ReqContainerToImplContainerRule _this, Container reqContainer, NetworkSpan virtualNode,
			implementation.Container implContainer, Match sourceMatch, Match targetMatch) {
		Object[] result_pattern_ReqContainerToImplContainerRule_24_3_solvecsp_binding = pattern_ReqContainerToImplContainerRule_24_3_solvecsp_bindingFBBBBBB(
				_this, reqContainer, virtualNode, implContainer, sourceMatch, targetMatch);
		if (result_pattern_ReqContainerToImplContainerRule_24_3_solvecsp_binding != null) {
			CSP csp = (CSP) result_pattern_ReqContainerToImplContainerRule_24_3_solvecsp_binding[0];

			Object[] result_pattern_ReqContainerToImplContainerRule_24_3_solvecsp_black = pattern_ReqContainerToImplContainerRule_24_3_solvecsp_blackB(
					csp);
			if (result_pattern_ReqContainerToImplContainerRule_24_3_solvecsp_black != null) {

				return new Object[] { csp, _this, reqContainer, virtualNode, implContainer, sourceMatch, targetMatch };
			}
		}
		return null;
	}

	public static final boolean pattern_ReqContainerToImplContainerRule_24_4_checkCSP_expressionFB(CSP csp) {
		boolean _localVariable_0 = csp.check();
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Iterable<Object[]> pattern_ReqContainerToImplContainerRule_24_5_matchcorrcontext_blackBB(
			Match sourceMatch, Match targetMatch) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (!sourceMatch.equals(targetMatch)) {
			_result.add(new Object[] { sourceMatch, targetMatch });
		}
		return _result;
	}

	public static final Object[] pattern_ReqContainerToImplContainerRule_24_5_matchcorrcontext_greenBBF(
			Match sourceMatch, Match targetMatch) {
		CCMatch ccMatch = RuntimeFactory.eINSTANCE.createCCMatch();
		String ccMatch_ruleName_prime = "ReqContainerToImplContainerRule";
		ccMatch.setSourceMatch(sourceMatch);
		ccMatch.setTargetMatch(targetMatch);
		ccMatch.setRuleName(ccMatch_ruleName_prime);
		return new Object[] { sourceMatch, targetMatch, ccMatch };
	}

	public static final Object[] pattern_ReqContainerToImplContainerRule_24_6_createcorrespondence_blackBBBB(
			Container reqContainer, NetworkSpan virtualNode, implementation.Container implContainer, CCMatch ccMatch) {
		return new Object[] { reqContainer, virtualNode, implContainer, ccMatch };
	}

	public static final Object[] pattern_ReqContainerToImplContainerRule_24_6_createcorrespondence_greenBBFB(
			Container reqContainer, implementation.Container implContainer, CCMatch ccMatch) {
		ReqContainerToImplContainer reqContainerToImplContainer = ReqToImpTransformatorFactory.eINSTANCE
				.createReqContainerToImplContainer();
		reqContainerToImplContainer.setTarget(implContainer);
		reqContainerToImplContainer.setSource(reqContainer);
		ccMatch.getCreateCorr().add(reqContainerToImplContainer);
		return new Object[] { reqContainer, implContainer, reqContainerToImplContainer, ccMatch };
	}

	public static final Object[] pattern_ReqContainerToImplContainerRule_24_7_addtoreturnedresult_blackBB(
			IsApplicableRuleResult result, CCMatch ccMatch) {
		return new Object[] { result, ccMatch };
	}

	public static final Object[] pattern_ReqContainerToImplContainerRule_24_7_addtoreturnedresult_greenBB(
			IsApplicableRuleResult result, CCMatch ccMatch) {
		result.getIsApplicableMatch().add(ccMatch);
		boolean result_success_prime = Boolean.valueOf(true);
		String ccMatch_ruleName_prime = "ReqContainerToImplContainerRule";
		result.setSuccess(Boolean.valueOf(result_success_prime));
		ccMatch.setRuleName(ccMatch_ruleName_prime);
		return new Object[] { result, ccMatch };
	}

	public static final IsApplicableRuleResult pattern_ReqContainerToImplContainerRule_24_8_expressionFB(
			IsApplicableRuleResult result) {
		IsApplicableRuleResult _result = result;
		return _result;
	}

	public static final Object[] pattern_ReqContainerToImplContainerRule_27_1_matchtggpattern_blackBB(
			Container reqContainer, NetworkSpan virtualNode) {
		if (virtualNode.equals(reqContainer.getNetworkSpan())) {
			return new Object[] { reqContainer, virtualNode };
		}
		return null;
	}

	public static final boolean pattern_ReqContainerToImplContainerRule_27_2_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_ReqContainerToImplContainerRule_27_3_expressionF() {
		boolean _result = Boolean.valueOf(false);
		return _result;
	}

	public static final Object[] pattern_ReqContainerToImplContainerRule_28_1_matchtggpattern_blackB(
			implementation.Container implContainer) {
		return new Object[] { implContainer };
	}

	public static final boolean pattern_ReqContainerToImplContainerRule_28_2_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_ReqContainerToImplContainerRule_28_3_expressionF() {
		boolean _result = Boolean.valueOf(false);
		return _result;
	}

	public static final Object[] pattern_ReqContainerToImplContainerRule_29_1_createresult_blackB(
			ReqContainerToImplContainerRule _this) {
		return new Object[] { _this };
	}

	public static final Object[] pattern_ReqContainerToImplContainerRule_29_1_createresult_greenFF() {
		IsApplicableMatch isApplicableMatch = RuntimeFactory.eINSTANCE.createIsApplicableMatch();
		ModelgeneratorRuleResult ruleResult = RuntimeFactory.eINSTANCE.createModelgeneratorRuleResult();
		boolean ruleResult_success_prime = Boolean.valueOf(false);
		ruleResult.setSuccess(Boolean.valueOf(ruleResult_success_prime));
		return new Object[] { isApplicableMatch, ruleResult };
	}

	public static final Object[] pattern_ReqContainerToImplContainerRule_29_2_isapplicablecore_blackB(
			ReqContainerToImplContainerRule _this) {
		return new Object[] { _this };
	}

	public static final Object[] pattern_ReqContainerToImplContainerRule_29_3_solveCSP_bindingFBBB(
			ReqContainerToImplContainerRule _this, IsApplicableMatch isApplicableMatch,
			ModelgeneratorRuleResult ruleResult) {
		CSP _localVariable_0 = _this.generateModel_solveCsp_BWD(isApplicableMatch, ruleResult);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, ruleResult };
		}
		return null;
	}

	public static final Object[] pattern_ReqContainerToImplContainerRule_29_3_solveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_ReqContainerToImplContainerRule_29_3_solveCSP_bindingAndBlackFBBB(
			ReqContainerToImplContainerRule _this, IsApplicableMatch isApplicableMatch,
			ModelgeneratorRuleResult ruleResult) {
		Object[] result_pattern_ReqContainerToImplContainerRule_29_3_solveCSP_binding = pattern_ReqContainerToImplContainerRule_29_3_solveCSP_bindingFBBB(
				_this, isApplicableMatch, ruleResult);
		if (result_pattern_ReqContainerToImplContainerRule_29_3_solveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_ReqContainerToImplContainerRule_29_3_solveCSP_binding[0];

			Object[] result_pattern_ReqContainerToImplContainerRule_29_3_solveCSP_black = pattern_ReqContainerToImplContainerRule_29_3_solveCSP_blackB(
					csp);
			if (result_pattern_ReqContainerToImplContainerRule_29_3_solveCSP_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, ruleResult };
			}
		}
		return null;
	}

	public static final boolean pattern_ReqContainerToImplContainerRule_29_4_checkCSP_expressionFBB(
			ReqContainerToImplContainerRule _this, CSP csp) {
		boolean _localVariable_0 = _this.generateModel_checkCsp_BWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_ReqContainerToImplContainerRule_29_6_perform_blackB(
			ModelgeneratorRuleResult ruleResult) {
		return new Object[] { ruleResult };
	}

	public static final Object[] pattern_ReqContainerToImplContainerRule_29_6_perform_greenFFFFB(
			ModelgeneratorRuleResult ruleResult) {
		Container reqContainer = RequirementsFactory.eINSTANCE.createContainer();
		NetworkSpan virtualNode = RequirementsFactory.eINSTANCE.createNetworkSpan();
		implementation.Container implContainer = ImplementationFactory.eINSTANCE.createContainer();
		ReqContainerToImplContainer reqContainerToImplContainer = ReqToImpTransformatorFactory.eINSTANCE
				.createReqContainerToImplContainer();
		boolean ruleResult_success_prime = Boolean.valueOf(true);
		int _localVariable_0 = ruleResult.getIncrementedPerformCount();
		ruleResult.getSourceObjects().add(reqContainer);
		reqContainer.setNetworkSpan(virtualNode);
		ruleResult.getSourceObjects().add(virtualNode);
		ruleResult.getTargetObjects().add(implContainer);
		reqContainerToImplContainer.setTarget(implContainer);
		reqContainerToImplContainer.setSource(reqContainer);
		ruleResult.getCorrObjects().add(reqContainerToImplContainer);
		ruleResult.setSuccess(Boolean.valueOf(ruleResult_success_prime));
		int ruleResult_performCount_prime = Integer.valueOf(_localVariable_0);
		ruleResult.setPerformCount(Integer.valueOf(ruleResult_performCount_prime));
		return new Object[] { reqContainer, virtualNode, implContainer, reqContainerToImplContainer, ruleResult };
	}

	public static final ModelgeneratorRuleResult pattern_ReqContainerToImplContainerRule_29_7_expressionFB(
			ModelgeneratorRuleResult ruleResult) {
		ModelgeneratorRuleResult _result = ruleResult;
		return _result;
	}

	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} //ReqContainerToImplContainerRuleImpl
