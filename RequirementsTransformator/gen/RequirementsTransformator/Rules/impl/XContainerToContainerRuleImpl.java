/**
 */
package RequirementsTransformator.Rules.impl;

import RequirementsTransformator.RequirementsTransformatorFactory;

import RequirementsTransformator.Rules.RulesPackage;
import RequirementsTransformator.Rules.XContainerToContainerRule;

import RequirementsTransformator.XContainerToContainer;

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

import requirementsXtext.reqXtext.ReqXtextFactory;
import requirementsXtext.reqXtext.XContainer;
// <-- [user defined imports]
import org.moflon.tgg.csp.*;
import RequirementsTransformator.csp.constraints.*;
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
 * An implementation of the model object '<em><b>XContainer To Container Rule</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class XContainerToContainerRuleImpl extends AbstractRuleImpl implements XContainerToContainerRule {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected XContainerToContainerRuleImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RulesPackage.Literals.XCONTAINER_TO_CONTAINER_RULE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAppropriate_FWD(Match match, XContainer xContainer) {

		Object[] result1_black = XContainerToContainerRuleImpl
				.pattern_XContainerToContainerRule_0_1_initialbindings_blackBBB(this, match, xContainer);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[match] = " + match + ", " + "[xContainer] = " + xContainer + ".");
		}

		Object[] result2_bindingAndBlack = XContainerToContainerRuleImpl
				.pattern_XContainerToContainerRule_0_2_SolveCSP_bindingAndBlackFBBB(this, match, xContainer);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[match] = " + match + ", " + "[xContainer] = " + xContainer + ".");
		}
		CSP csp = (CSP) result2_bindingAndBlack[0];
		// 
		if (XContainerToContainerRuleImpl.pattern_XContainerToContainerRule_0_3_CheckCSP_expressionFBB(this, csp)) {

			Object[] result4_black = XContainerToContainerRuleImpl
					.pattern_XContainerToContainerRule_0_4_collectelementstobetranslated_blackBB(match, xContainer);
			if (result4_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match + ", "
						+ "[xContainer] = " + xContainer + ".");
			}
			XContainerToContainerRuleImpl
					.pattern_XContainerToContainerRule_0_4_collectelementstobetranslated_greenBB(match, xContainer);

			Object[] result5_black = XContainerToContainerRuleImpl
					.pattern_XContainerToContainerRule_0_5_collectcontextelements_blackBB(match, xContainer);
			if (result5_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match + ", "
						+ "[xContainer] = " + xContainer + ".");
			}
			// 
			XContainerToContainerRuleImpl.pattern_XContainerToContainerRule_0_6_registerobjectstomatch_expressionBBB(
					this, match, xContainer);
			return XContainerToContainerRuleImpl.pattern_XContainerToContainerRule_0_7_expressionF();
		} else {
			return XContainerToContainerRuleImpl.pattern_XContainerToContainerRule_0_8_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PerformRuleResult perform_FWD(IsApplicableMatch isApplicableMatch) {

		Object[] result1_bindingAndBlack = XContainerToContainerRuleImpl
				.pattern_XContainerToContainerRule_1_1_performtransformation_bindingAndBlackFFBB(this,
						isApplicableMatch);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[isApplicableMatch] = " + isApplicableMatch + ".");
		}
		XContainer xContainer = (XContainer) result1_bindingAndBlack[0];
		//nothing CSP csp = (CSP) result1_bindingAndBlack[1];
		Object[] result1_green = XContainerToContainerRuleImpl
				.pattern_XContainerToContainerRule_1_1_performtransformation_greenBFFF(xContainer);
		XContainerToContainer xContainerToContainer = (XContainerToContainer) result1_green[1];
		NetworkSpan virtualNode = (NetworkSpan) result1_green[2];
		Container container = (Container) result1_green[3];

		Object[] result2_black = XContainerToContainerRuleImpl
				.pattern_XContainerToContainerRule_1_2_collecttranslatedelements_blackBBBB(xContainer,
						xContainerToContainer, virtualNode, container);
		if (result2_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[xContainer] = " + xContainer
					+ ", " + "[xContainerToContainer] = " + xContainerToContainer + ", " + "[virtualNode] = "
					+ virtualNode + ", " + "[container] = " + container + ".");
		}
		Object[] result2_green = XContainerToContainerRuleImpl
				.pattern_XContainerToContainerRule_1_2_collecttranslatedelements_greenFBBBB(xContainer,
						xContainerToContainer, virtualNode, container);
		PerformRuleResult ruleresult = (PerformRuleResult) result2_green[0];

		Object[] result3_black = XContainerToContainerRuleImpl
				.pattern_XContainerToContainerRule_1_3_bookkeepingforedges_blackBBBBB(ruleresult, xContainer,
						xContainerToContainer, virtualNode, container);
		if (result3_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[ruleresult] = " + ruleresult
					+ ", " + "[xContainer] = " + xContainer + ", " + "[xContainerToContainer] = "
					+ xContainerToContainer + ", " + "[virtualNode] = " + virtualNode + ", " + "[container] = "
					+ container + ".");
		}
		XContainerToContainerRuleImpl.pattern_XContainerToContainerRule_1_3_bookkeepingforedges_greenBBBBBFFF(
				ruleresult, xContainer, xContainerToContainer, virtualNode, container);
		//nothing EMoflonEdge xContainerToContainer__xContainer____source = (EMoflonEdge) result3_green[5];
		//nothing EMoflonEdge container__virtualNode____networkSpan = (EMoflonEdge) result3_green[6];
		//nothing EMoflonEdge xContainerToContainer__container____target = (EMoflonEdge) result3_green[7];

		// 
		// 
		XContainerToContainerRuleImpl.pattern_XContainerToContainerRule_1_5_registerobjects_expressionBBBBBB(this,
				ruleresult, xContainer, xContainerToContainer, virtualNode, container);
		return XContainerToContainerRuleImpl.pattern_XContainerToContainerRule_1_6_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IsApplicableRuleResult isApplicable_FWD(Match match) {

		Object[] result1_bindingAndBlack = XContainerToContainerRuleImpl
				.pattern_XContainerToContainerRule_2_1_preparereturnvalue_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		EOperation performOperation = (EOperation) result1_bindingAndBlack[0];
		//nothing EClass eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = XContainerToContainerRuleImpl
				.pattern_XContainerToContainerRule_2_1_preparereturnvalue_greenBF(performOperation);
		IsApplicableRuleResult ruleresult = (IsApplicableRuleResult) result1_green[1];

		// ForEach 
		Object[] result2_binding = XContainerToContainerRuleImpl
				.pattern_XContainerToContainerRule_2_2_corematch_bindingFB(match);
		if (result2_binding == null) {
			throw new RuntimeException(
					"Binding in node core match failed." + " Variables: " + "[match] = " + match + ".");
		}
		XContainer xContainer = (XContainer) result2_binding[0];
		for (Object[] result2_black : XContainerToContainerRuleImpl
				.pattern_XContainerToContainerRule_2_2_corematch_blackBB(xContainer, match)) {
			// ForEach 
			for (Object[] result3_black : XContainerToContainerRuleImpl
					.pattern_XContainerToContainerRule_2_3_findcontext_blackB(xContainer)) {
				Object[] result3_green = XContainerToContainerRuleImpl
						.pattern_XContainerToContainerRule_2_3_findcontext_greenBF(xContainer);
				IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result3_green[1];

				Object[] result4_bindingAndBlack = XContainerToContainerRuleImpl
						.pattern_XContainerToContainerRule_2_4_solveCSP_bindingAndBlackFBBB(this, isApplicableMatch,
								xContainer);
				if (result4_bindingAndBlack == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
							+ "[isApplicableMatch] = " + isApplicableMatch + ", " + "[xContainer] = " + xContainer
							+ ".");
				}
				CSP csp = (CSP) result4_bindingAndBlack[0];
				// 
				if (XContainerToContainerRuleImpl.pattern_XContainerToContainerRule_2_5_checkCSP_expressionFBB(this,
						csp)) {

					Object[] result6_black = XContainerToContainerRuleImpl
							.pattern_XContainerToContainerRule_2_6_addmatchtoruleresult_blackBB(ruleresult,
									isApplicableMatch);
					if (result6_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[ruleresult] = "
								+ ruleresult + ", " + "[isApplicableMatch] = " + isApplicableMatch + ".");
					}
					XContainerToContainerRuleImpl.pattern_XContainerToContainerRule_2_6_addmatchtoruleresult_greenBB(
							ruleresult, isApplicableMatch);

				} else {
				}

			}

		}
		return XContainerToContainerRuleImpl.pattern_XContainerToContainerRule_2_7_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void registerObjectsToMatch_FWD(Match match, XContainer xContainer) {
		match.registerObject("xContainer", xContainer);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isAppropriate_solveCsp_FWD(Match match, XContainer xContainer) {// Create CSP
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
	public CSP isApplicable_solveCsp_FWD(IsApplicableMatch isApplicableMatch, XContainer xContainer) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals

		// Create attribute variables

		// Create unbound variables

		// Create constraints

		// Solve CSP

		// Snapshot pattern match on which CSP is solved
		isApplicableMatch.registerObject("xContainer", xContainer);
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
	public void registerObjects_FWD(PerformRuleResult ruleresult, EObject xContainer, EObject xContainerToContainer,
			EObject virtualNode, EObject container) {
		ruleresult.registerObject("xContainer", xContainer);
		ruleresult.registerObject("xContainerToContainer", xContainerToContainer);
		ruleresult.registerObject("virtualNode", virtualNode);
		ruleresult.registerObject("container", container);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean checkTypes_FWD(Match match) {
		return true && org.moflon.util.eMoflonSDMUtil.getFQN(match.getObject("xContainer").eClass())
				.equals("reqXtext.XContainer.");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAppropriate_BWD(Match match, NetworkSpan virtualNode, Container container) {

		Object[] result1_black = XContainerToContainerRuleImpl
				.pattern_XContainerToContainerRule_10_1_initialbindings_blackBBBB(this, match, virtualNode, container);
		if (result1_black == null) {
			throw new RuntimeException(
					"Pattern matching failed." + " Variables: " + "[this] = " + this + ", " + "[match] = " + match
							+ ", " + "[virtualNode] = " + virtualNode + ", " + "[container] = " + container + ".");
		}

		Object[] result2_bindingAndBlack = XContainerToContainerRuleImpl
				.pattern_XContainerToContainerRule_10_2_SolveCSP_bindingAndBlackFBBBB(this, match, virtualNode,
						container);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException(
					"Pattern matching failed." + " Variables: " + "[this] = " + this + ", " + "[match] = " + match
							+ ", " + "[virtualNode] = " + virtualNode + ", " + "[container] = " + container + ".");
		}
		CSP csp = (CSP) result2_bindingAndBlack[0];
		// 
		if (XContainerToContainerRuleImpl.pattern_XContainerToContainerRule_10_3_CheckCSP_expressionFBB(this, csp)) {

			Object[] result4_black = XContainerToContainerRuleImpl
					.pattern_XContainerToContainerRule_10_4_collectelementstobetranslated_blackBBB(match, virtualNode,
							container);
			if (result4_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match + ", "
						+ "[virtualNode] = " + virtualNode + ", " + "[container] = " + container + ".");
			}
			XContainerToContainerRuleImpl
					.pattern_XContainerToContainerRule_10_4_collectelementstobetranslated_greenBBBF(match, virtualNode,
							container);
			//nothing EMoflonEdge container__virtualNode____networkSpan = (EMoflonEdge) result4_green[3];

			Object[] result5_black = XContainerToContainerRuleImpl
					.pattern_XContainerToContainerRule_10_5_collectcontextelements_blackBBB(match, virtualNode,
							container);
			if (result5_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match + ", "
						+ "[virtualNode] = " + virtualNode + ", " + "[container] = " + container + ".");
			}
			// 
			XContainerToContainerRuleImpl.pattern_XContainerToContainerRule_10_6_registerobjectstomatch_expressionBBBB(
					this, match, virtualNode, container);
			return XContainerToContainerRuleImpl.pattern_XContainerToContainerRule_10_7_expressionF();
		} else {
			return XContainerToContainerRuleImpl.pattern_XContainerToContainerRule_10_8_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PerformRuleResult perform_BWD(IsApplicableMatch isApplicableMatch) {

		Object[] result1_bindingAndBlack = XContainerToContainerRuleImpl
				.pattern_XContainerToContainerRule_11_1_performtransformation_bindingAndBlackFFFBB(this,
						isApplicableMatch);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[isApplicableMatch] = " + isApplicableMatch + ".");
		}
		NetworkSpan virtualNode = (NetworkSpan) result1_bindingAndBlack[0];
		Container container = (Container) result1_bindingAndBlack[1];
		//nothing CSP csp = (CSP) result1_bindingAndBlack[2];
		Object[] result1_green = XContainerToContainerRuleImpl
				.pattern_XContainerToContainerRule_11_1_performtransformation_greenFFB(container);
		XContainer xContainer = (XContainer) result1_green[0];
		XContainerToContainer xContainerToContainer = (XContainerToContainer) result1_green[1];

		Object[] result2_black = XContainerToContainerRuleImpl
				.pattern_XContainerToContainerRule_11_2_collecttranslatedelements_blackBBBB(xContainer,
						xContainerToContainer, virtualNode, container);
		if (result2_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[xContainer] = " + xContainer
					+ ", " + "[xContainerToContainer] = " + xContainerToContainer + ", " + "[virtualNode] = "
					+ virtualNode + ", " + "[container] = " + container + ".");
		}
		Object[] result2_green = XContainerToContainerRuleImpl
				.pattern_XContainerToContainerRule_11_2_collecttranslatedelements_greenFBBBB(xContainer,
						xContainerToContainer, virtualNode, container);
		PerformRuleResult ruleresult = (PerformRuleResult) result2_green[0];

		Object[] result3_black = XContainerToContainerRuleImpl
				.pattern_XContainerToContainerRule_11_3_bookkeepingforedges_blackBBBBB(ruleresult, xContainer,
						xContainerToContainer, virtualNode, container);
		if (result3_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[ruleresult] = " + ruleresult
					+ ", " + "[xContainer] = " + xContainer + ", " + "[xContainerToContainer] = "
					+ xContainerToContainer + ", " + "[virtualNode] = " + virtualNode + ", " + "[container] = "
					+ container + ".");
		}
		XContainerToContainerRuleImpl.pattern_XContainerToContainerRule_11_3_bookkeepingforedges_greenBBBBBFFF(
				ruleresult, xContainer, xContainerToContainer, virtualNode, container);
		//nothing EMoflonEdge xContainerToContainer__xContainer____source = (EMoflonEdge) result3_green[5];
		//nothing EMoflonEdge container__virtualNode____networkSpan = (EMoflonEdge) result3_green[6];
		//nothing EMoflonEdge xContainerToContainer__container____target = (EMoflonEdge) result3_green[7];

		// 
		// 
		XContainerToContainerRuleImpl.pattern_XContainerToContainerRule_11_5_registerobjects_expressionBBBBBB(this,
				ruleresult, xContainer, xContainerToContainer, virtualNode, container);
		return XContainerToContainerRuleImpl.pattern_XContainerToContainerRule_11_6_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IsApplicableRuleResult isApplicable_BWD(Match match) {

		Object[] result1_bindingAndBlack = XContainerToContainerRuleImpl
				.pattern_XContainerToContainerRule_12_1_preparereturnvalue_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		EOperation performOperation = (EOperation) result1_bindingAndBlack[0];
		//nothing EClass eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = XContainerToContainerRuleImpl
				.pattern_XContainerToContainerRule_12_1_preparereturnvalue_greenBF(performOperation);
		IsApplicableRuleResult ruleresult = (IsApplicableRuleResult) result1_green[1];

		// ForEach 
		Object[] result2_binding = XContainerToContainerRuleImpl
				.pattern_XContainerToContainerRule_12_2_corematch_bindingFFB(match);
		if (result2_binding == null) {
			throw new RuntimeException(
					"Binding in node core match failed." + " Variables: " + "[match] = " + match + ".");
		}
		NetworkSpan virtualNode = (NetworkSpan) result2_binding[0];
		Container container = (Container) result2_binding[1];
		for (Object[] result2_black : XContainerToContainerRuleImpl
				.pattern_XContainerToContainerRule_12_2_corematch_blackBBB(virtualNode, container, match)) {
			// ForEach 
			for (Object[] result3_black : XContainerToContainerRuleImpl
					.pattern_XContainerToContainerRule_12_3_findcontext_blackBB(virtualNode, container)) {
				Object[] result3_green = XContainerToContainerRuleImpl
						.pattern_XContainerToContainerRule_12_3_findcontext_greenBBFF(virtualNode, container);
				IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result3_green[2];
				//nothing EMoflonEdge container__virtualNode____networkSpan = (EMoflonEdge) result3_green[3];

				Object[] result4_bindingAndBlack = XContainerToContainerRuleImpl
						.pattern_XContainerToContainerRule_12_4_solveCSP_bindingAndBlackFBBBB(this, isApplicableMatch,
								virtualNode, container);
				if (result4_bindingAndBlack == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
							+ "[isApplicableMatch] = " + isApplicableMatch + ", " + "[virtualNode] = " + virtualNode
							+ ", " + "[container] = " + container + ".");
				}
				CSP csp = (CSP) result4_bindingAndBlack[0];
				// 
				if (XContainerToContainerRuleImpl.pattern_XContainerToContainerRule_12_5_checkCSP_expressionFBB(this,
						csp)) {

					Object[] result6_black = XContainerToContainerRuleImpl
							.pattern_XContainerToContainerRule_12_6_addmatchtoruleresult_blackBB(ruleresult,
									isApplicableMatch);
					if (result6_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[ruleresult] = "
								+ ruleresult + ", " + "[isApplicableMatch] = " + isApplicableMatch + ".");
					}
					XContainerToContainerRuleImpl.pattern_XContainerToContainerRule_12_6_addmatchtoruleresult_greenBB(
							ruleresult, isApplicableMatch);

				} else {
				}

			}

		}
		return XContainerToContainerRuleImpl.pattern_XContainerToContainerRule_12_7_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void registerObjectsToMatch_BWD(Match match, NetworkSpan virtualNode, Container container) {
		match.registerObject("virtualNode", virtualNode);
		match.registerObject("container", container);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isAppropriate_solveCsp_BWD(Match match, NetworkSpan virtualNode, Container container) {// Create CSP
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
	public CSP isApplicable_solveCsp_BWD(IsApplicableMatch isApplicableMatch, NetworkSpan virtualNode,
			Container container) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals

		// Create attribute variables

		// Create unbound variables

		// Create constraints

		// Solve CSP

		// Snapshot pattern match on which CSP is solved
		isApplicableMatch.registerObject("virtualNode", virtualNode);
		isApplicableMatch.registerObject("container", container);
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
	public void registerObjects_BWD(PerformRuleResult ruleresult, EObject xContainer, EObject xContainerToContainer,
			EObject virtualNode, EObject container) {
		ruleresult.registerObject("xContainer", xContainer);
		ruleresult.registerObject("xContainerToContainer", xContainerToContainer);
		ruleresult.registerObject("virtualNode", virtualNode);
		ruleresult.registerObject("container", container);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean checkTypes_BWD(Match match) {
		return true
				&& org.moflon.util.eMoflonSDMUtil.getFQN(match.getObject("virtualNode").eClass())
						.equals("requirements.NetworkSpan.")
				&& org.moflon.util.eMoflonSDMUtil.getFQN(match.getObject("container").eClass())
						.equals("requirements.Container.");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_FWD_XContainer_0(XContainer xContainer) {

		Object[] result1_bindingAndBlack = XContainerToContainerRuleImpl
				.pattern_XContainerToContainerRule_20_1_preparereturnvalue_bindingAndBlackFFBF(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		EOperation isApplicableCC = (EOperation) result1_bindingAndBlack[3];
		Object[] result1_green = XContainerToContainerRuleImpl
				.pattern_XContainerToContainerRule_20_1_preparereturnvalue_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach 
		for (Object[] result2_black : XContainerToContainerRuleImpl
				.pattern_XContainerToContainerRule_20_2_testcorematchandDECs_blackB(xContainer)) {
			Object[] result2_green = XContainerToContainerRuleImpl
					.pattern_XContainerToContainerRule_20_2_testcorematchandDECs_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// 
			if (XContainerToContainerRuleImpl
					.pattern_XContainerToContainerRule_20_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBB(
							this, match, xContainer)) {
				// 
				if (XContainerToContainerRuleImpl
						.pattern_XContainerToContainerRule_20_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(
								this, match)) {

					Object[] result5_black = XContainerToContainerRuleImpl
							.pattern_XContainerToContainerRule_20_5_Addmatchtoruleresult_blackBBBB(match,
									__performOperation, __result, isApplicableCC);
					if (result5_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match
								+ ", " + "[__performOperation] = " + __performOperation + ", " + "[__result] = "
								+ __result + ", " + "[isApplicableCC] = " + isApplicableCC + ".");
					}
					XContainerToContainerRuleImpl.pattern_XContainerToContainerRule_20_5_Addmatchtoruleresult_greenBBBB(
							match, __performOperation, __result, isApplicableCC);

				} else {
				}

			} else {
			}

		}
		return XContainerToContainerRuleImpl.pattern_XContainerToContainerRule_20_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_BWD_EMoflonEdge_7(EMoflonEdge _edge_networkSpan) {

		Object[] result1_bindingAndBlack = XContainerToContainerRuleImpl
				.pattern_XContainerToContainerRule_21_1_preparereturnvalue_bindingAndBlackFFBF(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		EOperation isApplicableCC = (EOperation) result1_bindingAndBlack[3];
		Object[] result1_green = XContainerToContainerRuleImpl
				.pattern_XContainerToContainerRule_21_1_preparereturnvalue_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach 
		for (Object[] result2_black : XContainerToContainerRuleImpl
				.pattern_XContainerToContainerRule_21_2_testcorematchandDECs_blackFFB(_edge_networkSpan)) {
			NetworkSpan virtualNode = (NetworkSpan) result2_black[0];
			Container container = (Container) result2_black[1];
			Object[] result2_green = XContainerToContainerRuleImpl
					.pattern_XContainerToContainerRule_21_2_testcorematchandDECs_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// 
			if (XContainerToContainerRuleImpl
					.pattern_XContainerToContainerRule_21_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBB(
							this, match, virtualNode, container)) {
				// 
				if (XContainerToContainerRuleImpl
						.pattern_XContainerToContainerRule_21_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(
								this, match)) {

					Object[] result5_black = XContainerToContainerRuleImpl
							.pattern_XContainerToContainerRule_21_5_Addmatchtoruleresult_blackBBBB(match,
									__performOperation, __result, isApplicableCC);
					if (result5_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match
								+ ", " + "[__performOperation] = " + __performOperation + ", " + "[__result] = "
								+ __result + ", " + "[isApplicableCC] = " + isApplicableCC + ".");
					}
					XContainerToContainerRuleImpl.pattern_XContainerToContainerRule_21_5_Addmatchtoruleresult_greenBBBB(
							match, __performOperation, __result, isApplicableCC);

				} else {
				}

			} else {
			}

		}
		return XContainerToContainerRuleImpl.pattern_XContainerToContainerRule_21_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AttributeConstraintsRuleResult checkAttributes_FWD(TripleMatch __tripleMatch) {
		AttributeConstraintsRuleResult ruleResult = org.moflon.tgg.runtime.RuntimeFactory.eINSTANCE
				.createAttributeConstraintsRuleResult();
		ruleResult.setRule("XContainerToContainerRule");
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
		ruleResult.setRule("XContainerToContainerRule");
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

		Object[] result1_black = XContainerToContainerRuleImpl
				.pattern_XContainerToContainerRule_24_1_prepare_blackB(this);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		Object[] result1_green = XContainerToContainerRuleImpl.pattern_XContainerToContainerRule_24_1_prepare_greenF();
		IsApplicableRuleResult result = (IsApplicableRuleResult) result1_green[0];

		Object[] result2_bindingAndBlack = XContainerToContainerRuleImpl
				.pattern_XContainerToContainerRule_24_2_matchsrctrgcontext_bindingAndBlackFFFBB(sourceMatch,
						targetMatch);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[sourceMatch] = " + sourceMatch
					+ ", " + "[targetMatch] = " + targetMatch + ".");
		}
		XContainer xContainer = (XContainer) result2_bindingAndBlack[0];
		NetworkSpan virtualNode = (NetworkSpan) result2_bindingAndBlack[1];
		Container container = (Container) result2_bindingAndBlack[2];

		Object[] result3_bindingAndBlack = XContainerToContainerRuleImpl
				.pattern_XContainerToContainerRule_24_3_solvecsp_bindingAndBlackFBBBBBB(this, xContainer, virtualNode,
						container, sourceMatch, targetMatch);
		if (result3_bindingAndBlack == null) {
			throw new RuntimeException(
					"Pattern matching failed." + " Variables: " + "[this] = " + this + ", " + "[xContainer] = "
							+ xContainer + ", " + "[virtualNode] = " + virtualNode + ", " + "[container] = " + container
							+ ", " + "[sourceMatch] = " + sourceMatch + ", " + "[targetMatch] = " + targetMatch + ".");
		}
		CSP csp = (CSP) result3_bindingAndBlack[0];
		// 
		if (XContainerToContainerRuleImpl.pattern_XContainerToContainerRule_24_4_checkCSP_expressionFB(csp)) {
			// ForEach 
			for (Object[] result5_black : XContainerToContainerRuleImpl
					.pattern_XContainerToContainerRule_24_5_matchcorrcontext_blackBB(sourceMatch, targetMatch)) {
				Object[] result5_green = XContainerToContainerRuleImpl
						.pattern_XContainerToContainerRule_24_5_matchcorrcontext_greenBBF(sourceMatch, targetMatch);
				CCMatch ccMatch = (CCMatch) result5_green[2];

				Object[] result6_black = XContainerToContainerRuleImpl
						.pattern_XContainerToContainerRule_24_6_createcorrespondence_blackBBBB(xContainer, virtualNode,
								container, ccMatch);
				if (result6_black == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[xContainer] = "
							+ xContainer + ", " + "[virtualNode] = " + virtualNode + ", " + "[container] = " + container
							+ ", " + "[ccMatch] = " + ccMatch + ".");
				}
				XContainerToContainerRuleImpl.pattern_XContainerToContainerRule_24_6_createcorrespondence_greenBFBB(
						xContainer, container, ccMatch);
				//nothing XContainerToContainer xContainerToContainer = (XContainerToContainer) result6_green[1];

				Object[] result7_black = XContainerToContainerRuleImpl
						.pattern_XContainerToContainerRule_24_7_addtoreturnedresult_blackBB(result, ccMatch);
				if (result7_black == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[result] = " + result
							+ ", " + "[ccMatch] = " + ccMatch + ".");
				}
				XContainerToContainerRuleImpl.pattern_XContainerToContainerRule_24_7_addtoreturnedresult_greenBB(result,
						ccMatch);

			}

		} else {
		}
		return XContainerToContainerRuleImpl.pattern_XContainerToContainerRule_24_8_expressionFB(result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isApplicable_solveCsp_CC(XContainer xContainer, NetworkSpan virtualNode, Container container,
			Match sourceMatch, Match targetMatch) {// Create CSP
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
	public boolean checkDEC_FWD(XContainer xContainer) {// 
		Object[] result1_black = XContainerToContainerRuleImpl
				.pattern_XContainerToContainerRule_27_1_matchtggpattern_blackB(xContainer);
		if (result1_black != null) {
			return XContainerToContainerRuleImpl.pattern_XContainerToContainerRule_27_2_expressionF();
		} else {
			return XContainerToContainerRuleImpl.pattern_XContainerToContainerRule_27_3_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean checkDEC_BWD(NetworkSpan virtualNode, Container container) {// 
		Object[] result1_black = XContainerToContainerRuleImpl
				.pattern_XContainerToContainerRule_28_1_matchtggpattern_blackBB(virtualNode, container);
		if (result1_black != null) {
			return XContainerToContainerRuleImpl.pattern_XContainerToContainerRule_28_2_expressionF();
		} else {
			return XContainerToContainerRuleImpl.pattern_XContainerToContainerRule_28_3_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModelgeneratorRuleResult generateModel(RuleEntryContainer ruleEntryContainer) {

		Object[] result1_black = XContainerToContainerRuleImpl
				.pattern_XContainerToContainerRule_29_1_createresult_blackB(this);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		Object[] result1_green = XContainerToContainerRuleImpl
				.pattern_XContainerToContainerRule_29_1_createresult_greenFF();
		IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result1_green[0];
		ModelgeneratorRuleResult ruleResult = (ModelgeneratorRuleResult) result1_green[1];

		// 
		Object[] result2_black = XContainerToContainerRuleImpl
				.pattern_XContainerToContainerRule_29_2_isapplicablecore_blackB(this);
		if (result2_black != null) {

			Object[] result3_bindingAndBlack = XContainerToContainerRuleImpl
					.pattern_XContainerToContainerRule_29_3_solveCSP_bindingAndBlackFBBB(this, isApplicableMatch,
							ruleResult);
			if (result3_bindingAndBlack == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
						+ "[isApplicableMatch] = " + isApplicableMatch + ", " + "[ruleResult] = " + ruleResult + ".");
			}
			CSP csp = (CSP) result3_bindingAndBlack[0];
			// 
			if (XContainerToContainerRuleImpl.pattern_XContainerToContainerRule_29_4_checkCSP_expressionFBB(this,
					csp)) {
				// 

				Object[] result6_black = XContainerToContainerRuleImpl
						.pattern_XContainerToContainerRule_29_6_perform_blackB(ruleResult);
				if (result6_black == null) {
					throw new RuntimeException(
							"Pattern matching failed." + " Variables: " + "[ruleResult] = " + ruleResult + ".");
				}
				XContainerToContainerRuleImpl.pattern_XContainerToContainerRule_29_6_perform_greenFFFFB(ruleResult);
				//nothing XContainer xContainer = (XContainer) result6_green[0];
				//nothing XContainerToContainer xContainerToContainer = (XContainerToContainer) result6_green[1];
				//nothing NetworkSpan virtualNode = (NetworkSpan) result6_green[2];
				//nothing Container container = (Container) result6_green[3];

			} else {
			}

		} else {
		}
		return XContainerToContainerRuleImpl.pattern_XContainerToContainerRule_29_7_expressionFB(ruleResult);
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
		case RulesPackage.XCONTAINER_TO_CONTAINER_RULE___IS_APPROPRIATE_FWD__MATCH_XCONTAINER:
			return isAppropriate_FWD((Match) arguments.get(0), (XContainer) arguments.get(1));
		case RulesPackage.XCONTAINER_TO_CONTAINER_RULE___PERFORM_FWD__ISAPPLICABLEMATCH:
			return perform_FWD((IsApplicableMatch) arguments.get(0));
		case RulesPackage.XCONTAINER_TO_CONTAINER_RULE___IS_APPLICABLE_FWD__MATCH:
			return isApplicable_FWD((Match) arguments.get(0));
		case RulesPackage.XCONTAINER_TO_CONTAINER_RULE___REGISTER_OBJECTS_TO_MATCH_FWD__MATCH_XCONTAINER:
			registerObjectsToMatch_FWD((Match) arguments.get(0), (XContainer) arguments.get(1));
			return null;
		case RulesPackage.XCONTAINER_TO_CONTAINER_RULE___IS_APPROPRIATE_SOLVE_CSP_FWD__MATCH_XCONTAINER:
			return isAppropriate_solveCsp_FWD((Match) arguments.get(0), (XContainer) arguments.get(1));
		case RulesPackage.XCONTAINER_TO_CONTAINER_RULE___IS_APPROPRIATE_CHECK_CSP_FWD__CSP:
			return isAppropriate_checkCsp_FWD((CSP) arguments.get(0));
		case RulesPackage.XCONTAINER_TO_CONTAINER_RULE___IS_APPLICABLE_SOLVE_CSP_FWD__ISAPPLICABLEMATCH_XCONTAINER:
			return isApplicable_solveCsp_FWD((IsApplicableMatch) arguments.get(0), (XContainer) arguments.get(1));
		case RulesPackage.XCONTAINER_TO_CONTAINER_RULE___IS_APPLICABLE_CHECK_CSP_FWD__CSP:
			return isApplicable_checkCsp_FWD((CSP) arguments.get(0));
		case RulesPackage.XCONTAINER_TO_CONTAINER_RULE___REGISTER_OBJECTS_FWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT:
			registerObjects_FWD((PerformRuleResult) arguments.get(0), (EObject) arguments.get(1),
					(EObject) arguments.get(2), (EObject) arguments.get(3), (EObject) arguments.get(4));
			return null;
		case RulesPackage.XCONTAINER_TO_CONTAINER_RULE___CHECK_TYPES_FWD__MATCH:
			return checkTypes_FWD((Match) arguments.get(0));
		case RulesPackage.XCONTAINER_TO_CONTAINER_RULE___IS_APPROPRIATE_BWD__MATCH_NETWORKSPAN_CONTAINER:
			return isAppropriate_BWD((Match) arguments.get(0), (NetworkSpan) arguments.get(1),
					(Container) arguments.get(2));
		case RulesPackage.XCONTAINER_TO_CONTAINER_RULE___PERFORM_BWD__ISAPPLICABLEMATCH:
			return perform_BWD((IsApplicableMatch) arguments.get(0));
		case RulesPackage.XCONTAINER_TO_CONTAINER_RULE___IS_APPLICABLE_BWD__MATCH:
			return isApplicable_BWD((Match) arguments.get(0));
		case RulesPackage.XCONTAINER_TO_CONTAINER_RULE___REGISTER_OBJECTS_TO_MATCH_BWD__MATCH_NETWORKSPAN_CONTAINER:
			registerObjectsToMatch_BWD((Match) arguments.get(0), (NetworkSpan) arguments.get(1),
					(Container) arguments.get(2));
			return null;
		case RulesPackage.XCONTAINER_TO_CONTAINER_RULE___IS_APPROPRIATE_SOLVE_CSP_BWD__MATCH_NETWORKSPAN_CONTAINER:
			return isAppropriate_solveCsp_BWD((Match) arguments.get(0), (NetworkSpan) arguments.get(1),
					(Container) arguments.get(2));
		case RulesPackage.XCONTAINER_TO_CONTAINER_RULE___IS_APPROPRIATE_CHECK_CSP_BWD__CSP:
			return isAppropriate_checkCsp_BWD((CSP) arguments.get(0));
		case RulesPackage.XCONTAINER_TO_CONTAINER_RULE___IS_APPLICABLE_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_NETWORKSPAN_CONTAINER:
			return isApplicable_solveCsp_BWD((IsApplicableMatch) arguments.get(0), (NetworkSpan) arguments.get(1),
					(Container) arguments.get(2));
		case RulesPackage.XCONTAINER_TO_CONTAINER_RULE___IS_APPLICABLE_CHECK_CSP_BWD__CSP:
			return isApplicable_checkCsp_BWD((CSP) arguments.get(0));
		case RulesPackage.XCONTAINER_TO_CONTAINER_RULE___REGISTER_OBJECTS_BWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT:
			registerObjects_BWD((PerformRuleResult) arguments.get(0), (EObject) arguments.get(1),
					(EObject) arguments.get(2), (EObject) arguments.get(3), (EObject) arguments.get(4));
			return null;
		case RulesPackage.XCONTAINER_TO_CONTAINER_RULE___CHECK_TYPES_BWD__MATCH:
			return checkTypes_BWD((Match) arguments.get(0));
		case RulesPackage.XCONTAINER_TO_CONTAINER_RULE___IS_APPROPRIATE_FWD_XCONTAINER_0__XCONTAINER:
			return isAppropriate_FWD_XContainer_0((XContainer) arguments.get(0));
		case RulesPackage.XCONTAINER_TO_CONTAINER_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_7__EMOFLONEDGE:
			return isAppropriate_BWD_EMoflonEdge_7((EMoflonEdge) arguments.get(0));
		case RulesPackage.XCONTAINER_TO_CONTAINER_RULE___CHECK_ATTRIBUTES_FWD__TRIPLEMATCH:
			return checkAttributes_FWD((TripleMatch) arguments.get(0));
		case RulesPackage.XCONTAINER_TO_CONTAINER_RULE___CHECK_ATTRIBUTES_BWD__TRIPLEMATCH:
			return checkAttributes_BWD((TripleMatch) arguments.get(0));
		case RulesPackage.XCONTAINER_TO_CONTAINER_RULE___IS_APPLICABLE_CC__MATCH_MATCH:
			return isApplicable_CC((Match) arguments.get(0), (Match) arguments.get(1));
		case RulesPackage.XCONTAINER_TO_CONTAINER_RULE___IS_APPLICABLE_SOLVE_CSP_CC__XCONTAINER_NETWORKSPAN_CONTAINER_MATCH_MATCH:
			return isApplicable_solveCsp_CC((XContainer) arguments.get(0), (NetworkSpan) arguments.get(1),
					(Container) arguments.get(2), (Match) arguments.get(3), (Match) arguments.get(4));
		case RulesPackage.XCONTAINER_TO_CONTAINER_RULE___IS_APPLICABLE_CHECK_CSP_CC__CSP:
			return isApplicable_checkCsp_CC((CSP) arguments.get(0));
		case RulesPackage.XCONTAINER_TO_CONTAINER_RULE___CHECK_DEC_FWD__XCONTAINER:
			return checkDEC_FWD((XContainer) arguments.get(0));
		case RulesPackage.XCONTAINER_TO_CONTAINER_RULE___CHECK_DEC_BWD__NETWORKSPAN_CONTAINER:
			return checkDEC_BWD((NetworkSpan) arguments.get(0), (Container) arguments.get(1));
		case RulesPackage.XCONTAINER_TO_CONTAINER_RULE___GENERATE_MODEL__RULEENTRYCONTAINER:
			return generateModel((RuleEntryContainer) arguments.get(0));
		case RulesPackage.XCONTAINER_TO_CONTAINER_RULE___GENERATE_MODEL_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_MODELGENERATORRULERESULT:
			return generateModel_solveCsp_BWD((IsApplicableMatch) arguments.get(0),
					(ModelgeneratorRuleResult) arguments.get(1));
		case RulesPackage.XCONTAINER_TO_CONTAINER_RULE___GENERATE_MODEL_CHECK_CSP_BWD__CSP:
			return generateModel_checkCsp_BWD((CSP) arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
	}

	public static final Object[] pattern_XContainerToContainerRule_0_1_initialbindings_blackBBB(
			XContainerToContainerRule _this, Match match, XContainer xContainer) {
		return new Object[] { _this, match, xContainer };
	}

	public static final Object[] pattern_XContainerToContainerRule_0_2_SolveCSP_bindingFBBB(
			XContainerToContainerRule _this, Match match, XContainer xContainer) {
		CSP _localVariable_0 = _this.isAppropriate_solveCsp_FWD(match, xContainer);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, match, xContainer };
		}
		return null;
	}

	public static final Object[] pattern_XContainerToContainerRule_0_2_SolveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_XContainerToContainerRule_0_2_SolveCSP_bindingAndBlackFBBB(
			XContainerToContainerRule _this, Match match, XContainer xContainer) {
		Object[] result_pattern_XContainerToContainerRule_0_2_SolveCSP_binding = pattern_XContainerToContainerRule_0_2_SolveCSP_bindingFBBB(
				_this, match, xContainer);
		if (result_pattern_XContainerToContainerRule_0_2_SolveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_XContainerToContainerRule_0_2_SolveCSP_binding[0];

			Object[] result_pattern_XContainerToContainerRule_0_2_SolveCSP_black = pattern_XContainerToContainerRule_0_2_SolveCSP_blackB(
					csp);
			if (result_pattern_XContainerToContainerRule_0_2_SolveCSP_black != null) {

				return new Object[] { csp, _this, match, xContainer };
			}
		}
		return null;
	}

	public static final boolean pattern_XContainerToContainerRule_0_3_CheckCSP_expressionFBB(
			XContainerToContainerRule _this, CSP csp) {
		boolean _localVariable_0 = _this.isAppropriate_checkCsp_FWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_XContainerToContainerRule_0_4_collectelementstobetranslated_blackBB(
			Match match, XContainer xContainer) {
		return new Object[] { match, xContainer };
	}

	public static final Object[] pattern_XContainerToContainerRule_0_4_collectelementstobetranslated_greenBB(
			Match match, XContainer xContainer) {
		match.getToBeTranslatedNodes().add(xContainer);
		return new Object[] { match, xContainer };
	}

	public static final Object[] pattern_XContainerToContainerRule_0_5_collectcontextelements_blackBB(Match match,
			XContainer xContainer) {
		return new Object[] { match, xContainer };
	}

	public static final void pattern_XContainerToContainerRule_0_6_registerobjectstomatch_expressionBBB(
			XContainerToContainerRule _this, Match match, XContainer xContainer) {
		_this.registerObjectsToMatch_FWD(match, xContainer);

	}

	public static final boolean pattern_XContainerToContainerRule_0_7_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_XContainerToContainerRule_0_8_expressionF() {
		boolean _result = Boolean.valueOf(false);
		return _result;
	}

	public static final Object[] pattern_XContainerToContainerRule_1_1_performtransformation_bindingFB(
			IsApplicableMatch isApplicableMatch) {
		EObject _localVariable_0 = isApplicableMatch.getObject("xContainer");
		EObject tmpXContainer = _localVariable_0;
		if (tmpXContainer instanceof XContainer) {
			XContainer xContainer = (XContainer) tmpXContainer;
			return new Object[] { xContainer, isApplicableMatch };
		}
		return null;
	}

	public static final Object[] pattern_XContainerToContainerRule_1_1_performtransformation_blackBFBB(
			XContainer xContainer, XContainerToContainerRule _this, IsApplicableMatch isApplicableMatch) {
		for (EObject tmpCsp : isApplicableMatch.getAttributeInfo()) {
			if (tmpCsp instanceof CSP) {
				CSP csp = (CSP) tmpCsp;
				return new Object[] { xContainer, csp, _this, isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_XContainerToContainerRule_1_1_performtransformation_bindingAndBlackFFBB(
			XContainerToContainerRule _this, IsApplicableMatch isApplicableMatch) {
		Object[] result_pattern_XContainerToContainerRule_1_1_performtransformation_binding = pattern_XContainerToContainerRule_1_1_performtransformation_bindingFB(
				isApplicableMatch);
		if (result_pattern_XContainerToContainerRule_1_1_performtransformation_binding != null) {
			XContainer xContainer = (XContainer) result_pattern_XContainerToContainerRule_1_1_performtransformation_binding[0];

			Object[] result_pattern_XContainerToContainerRule_1_1_performtransformation_black = pattern_XContainerToContainerRule_1_1_performtransformation_blackBFBB(
					xContainer, _this, isApplicableMatch);
			if (result_pattern_XContainerToContainerRule_1_1_performtransformation_black != null) {
				CSP csp = (CSP) result_pattern_XContainerToContainerRule_1_1_performtransformation_black[1];

				return new Object[] { xContainer, csp, _this, isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_XContainerToContainerRule_1_1_performtransformation_greenBFFF(
			XContainer xContainer) {
		XContainerToContainer xContainerToContainer = RequirementsTransformatorFactory.eINSTANCE
				.createXContainerToContainer();
		NetworkSpan virtualNode = RequirementsFactory.eINSTANCE.createNetworkSpan();
		Container container = RequirementsFactory.eINSTANCE.createContainer();
		xContainerToContainer.setSource(xContainer);
		container.setNetworkSpan(virtualNode);
		xContainerToContainer.setTarget(container);
		return new Object[] { xContainer, xContainerToContainer, virtualNode, container };
	}

	public static final Object[] pattern_XContainerToContainerRule_1_2_collecttranslatedelements_blackBBBB(
			XContainer xContainer, XContainerToContainer xContainerToContainer, NetworkSpan virtualNode,
			Container container) {
		return new Object[] { xContainer, xContainerToContainer, virtualNode, container };
	}

	public static final Object[] pattern_XContainerToContainerRule_1_2_collecttranslatedelements_greenFBBBB(
			XContainer xContainer, XContainerToContainer xContainerToContainer, NetworkSpan virtualNode,
			Container container) {
		PerformRuleResult ruleresult = RuntimeFactory.eINSTANCE.createPerformRuleResult();
		ruleresult.getTranslatedElements().add(xContainer);
		ruleresult.getCreatedLinkElements().add(xContainerToContainer);
		ruleresult.getCreatedElements().add(virtualNode);
		ruleresult.getCreatedElements().add(container);
		return new Object[] { ruleresult, xContainer, xContainerToContainer, virtualNode, container };
	}

	public static final Object[] pattern_XContainerToContainerRule_1_3_bookkeepingforedges_blackBBBBB(
			PerformRuleResult ruleresult, EObject xContainer, EObject xContainerToContainer, EObject virtualNode,
			EObject container) {
		if (!xContainer.equals(xContainerToContainer)) {
			if (!virtualNode.equals(xContainer)) {
				if (!virtualNode.equals(xContainerToContainer)) {
					if (!container.equals(xContainer)) {
						if (!container.equals(xContainerToContainer)) {
							if (!container.equals(virtualNode)) {
								return new Object[] { ruleresult, xContainer, xContainerToContainer, virtualNode,
										container };
							}
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_XContainerToContainerRule_1_3_bookkeepingforedges_greenBBBBBFFF(
			PerformRuleResult ruleresult, EObject xContainer, EObject xContainerToContainer, EObject virtualNode,
			EObject container) {
		EMoflonEdge xContainerToContainer__xContainer____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge container__virtualNode____networkSpan = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge xContainerToContainer__container____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String ruleresult_ruleName_prime = "XContainerToContainerRule";
		String xContainerToContainer__xContainer____source_name_prime = "source";
		String container__virtualNode____networkSpan_name_prime = "networkSpan";
		String xContainerToContainer__container____target_name_prime = "target";
		xContainerToContainer__xContainer____source.setSrc(xContainerToContainer);
		xContainerToContainer__xContainer____source.setTrg(xContainer);
		ruleresult.getCreatedEdges().add(xContainerToContainer__xContainer____source);
		container__virtualNode____networkSpan.setSrc(container);
		container__virtualNode____networkSpan.setTrg(virtualNode);
		ruleresult.getCreatedEdges().add(container__virtualNode____networkSpan);
		xContainerToContainer__container____target.setSrc(xContainerToContainer);
		xContainerToContainer__container____target.setTrg(container);
		ruleresult.getCreatedEdges().add(xContainerToContainer__container____target);
		ruleresult.setRuleName(ruleresult_ruleName_prime);
		xContainerToContainer__xContainer____source.setName(xContainerToContainer__xContainer____source_name_prime);
		container__virtualNode____networkSpan.setName(container__virtualNode____networkSpan_name_prime);
		xContainerToContainer__container____target.setName(xContainerToContainer__container____target_name_prime);
		return new Object[] { ruleresult, xContainer, xContainerToContainer, virtualNode, container,
				xContainerToContainer__xContainer____source, container__virtualNode____networkSpan,
				xContainerToContainer__container____target };
	}

	public static final void pattern_XContainerToContainerRule_1_5_registerobjects_expressionBBBBBB(
			XContainerToContainerRule _this, PerformRuleResult ruleresult, EObject xContainer,
			EObject xContainerToContainer, EObject virtualNode, EObject container) {
		_this.registerObjects_FWD(ruleresult, xContainer, xContainerToContainer, virtualNode, container);

	}

	public static final PerformRuleResult pattern_XContainerToContainerRule_1_6_expressionFB(
			PerformRuleResult ruleresult) {
		PerformRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_XContainerToContainerRule_2_1_preparereturnvalue_bindingFB(
			XContainerToContainerRule _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass eClass = _localVariable_0;
		if (eClass != null) {
			return new Object[] { eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_XContainerToContainerRule_2_1_preparereturnvalue_blackFBB(EClass eClass,
			XContainerToContainerRule _this) {
		for (EOperation performOperation : eClass.getEOperations()) {
			String performOperation_name = performOperation.getName();
			if (performOperation_name.equals("perform_FWD")) {
				return new Object[] { performOperation, eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_XContainerToContainerRule_2_1_preparereturnvalue_bindingAndBlackFFB(
			XContainerToContainerRule _this) {
		Object[] result_pattern_XContainerToContainerRule_2_1_preparereturnvalue_binding = pattern_XContainerToContainerRule_2_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_XContainerToContainerRule_2_1_preparereturnvalue_binding != null) {
			EClass eClass = (EClass) result_pattern_XContainerToContainerRule_2_1_preparereturnvalue_binding[0];

			Object[] result_pattern_XContainerToContainerRule_2_1_preparereturnvalue_black = pattern_XContainerToContainerRule_2_1_preparereturnvalue_blackFBB(
					eClass, _this);
			if (result_pattern_XContainerToContainerRule_2_1_preparereturnvalue_black != null) {
				EOperation performOperation = (EOperation) result_pattern_XContainerToContainerRule_2_1_preparereturnvalue_black[0];

				return new Object[] { performOperation, eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_XContainerToContainerRule_2_1_preparereturnvalue_greenBF(
			EOperation performOperation) {
		IsApplicableRuleResult ruleresult = RuntimeFactory.eINSTANCE.createIsApplicableRuleResult();
		boolean ruleresult_success_prime = Boolean.valueOf(false);
		String ruleresult_rule_prime = "XContainerToContainerRule";
		ruleresult.setPerformOperation(performOperation);
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		ruleresult.setRule(ruleresult_rule_prime);
		return new Object[] { performOperation, ruleresult };
	}

	public static final Object[] pattern_XContainerToContainerRule_2_2_corematch_bindingFB(Match match) {
		EObject _localVariable_0 = match.getObject("xContainer");
		EObject tmpXContainer = _localVariable_0;
		if (tmpXContainer instanceof XContainer) {
			XContainer xContainer = (XContainer) tmpXContainer;
			return new Object[] { xContainer, match };
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_XContainerToContainerRule_2_2_corematch_blackBB(
			XContainer xContainer, Match match) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		_result.add(new Object[] { xContainer, match });
		return _result;
	}

	public static final Iterable<Object[]> pattern_XContainerToContainerRule_2_3_findcontext_blackB(
			XContainer xContainer) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		_result.add(new Object[] { xContainer });
		return _result;
	}

	public static final Object[] pattern_XContainerToContainerRule_2_3_findcontext_greenBF(XContainer xContainer) {
		IsApplicableMatch isApplicableMatch = RuntimeFactory.eINSTANCE.createIsApplicableMatch();
		isApplicableMatch.getAllContextElements().add(xContainer);
		return new Object[] { xContainer, isApplicableMatch };
	}

	public static final Object[] pattern_XContainerToContainerRule_2_4_solveCSP_bindingFBBB(
			XContainerToContainerRule _this, IsApplicableMatch isApplicableMatch, XContainer xContainer) {
		CSP _localVariable_0 = _this.isApplicable_solveCsp_FWD(isApplicableMatch, xContainer);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, xContainer };
		}
		return null;
	}

	public static final Object[] pattern_XContainerToContainerRule_2_4_solveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_XContainerToContainerRule_2_4_solveCSP_bindingAndBlackFBBB(
			XContainerToContainerRule _this, IsApplicableMatch isApplicableMatch, XContainer xContainer) {
		Object[] result_pattern_XContainerToContainerRule_2_4_solveCSP_binding = pattern_XContainerToContainerRule_2_4_solveCSP_bindingFBBB(
				_this, isApplicableMatch, xContainer);
		if (result_pattern_XContainerToContainerRule_2_4_solveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_XContainerToContainerRule_2_4_solveCSP_binding[0];

			Object[] result_pattern_XContainerToContainerRule_2_4_solveCSP_black = pattern_XContainerToContainerRule_2_4_solveCSP_blackB(
					csp);
			if (result_pattern_XContainerToContainerRule_2_4_solveCSP_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, xContainer };
			}
		}
		return null;
	}

	public static final boolean pattern_XContainerToContainerRule_2_5_checkCSP_expressionFBB(
			XContainerToContainerRule _this, CSP csp) {
		boolean _localVariable_0 = _this.isApplicable_checkCsp_FWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_XContainerToContainerRule_2_6_addmatchtoruleresult_blackBB(
			IsApplicableRuleResult ruleresult, IsApplicableMatch isApplicableMatch) {
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final Object[] pattern_XContainerToContainerRule_2_6_addmatchtoruleresult_greenBB(
			IsApplicableRuleResult ruleresult, IsApplicableMatch isApplicableMatch) {
		ruleresult.getIsApplicableMatch().add(isApplicableMatch);
		boolean ruleresult_success_prime = Boolean.valueOf(true);
		String isApplicableMatch_ruleName_prime = "XContainerToContainerRule";
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		isApplicableMatch.setRuleName(isApplicableMatch_ruleName_prime);
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final IsApplicableRuleResult pattern_XContainerToContainerRule_2_7_expressionFB(
			IsApplicableRuleResult ruleresult) {
		IsApplicableRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_XContainerToContainerRule_10_1_initialbindings_blackBBBB(
			XContainerToContainerRule _this, Match match, NetworkSpan virtualNode, Container container) {
		return new Object[] { _this, match, virtualNode, container };
	}

	public static final Object[] pattern_XContainerToContainerRule_10_2_SolveCSP_bindingFBBBB(
			XContainerToContainerRule _this, Match match, NetworkSpan virtualNode, Container container) {
		CSP _localVariable_0 = _this.isAppropriate_solveCsp_BWD(match, virtualNode, container);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, match, virtualNode, container };
		}
		return null;
	}

	public static final Object[] pattern_XContainerToContainerRule_10_2_SolveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_XContainerToContainerRule_10_2_SolveCSP_bindingAndBlackFBBBB(
			XContainerToContainerRule _this, Match match, NetworkSpan virtualNode, Container container) {
		Object[] result_pattern_XContainerToContainerRule_10_2_SolveCSP_binding = pattern_XContainerToContainerRule_10_2_SolveCSP_bindingFBBBB(
				_this, match, virtualNode, container);
		if (result_pattern_XContainerToContainerRule_10_2_SolveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_XContainerToContainerRule_10_2_SolveCSP_binding[0];

			Object[] result_pattern_XContainerToContainerRule_10_2_SolveCSP_black = pattern_XContainerToContainerRule_10_2_SolveCSP_blackB(
					csp);
			if (result_pattern_XContainerToContainerRule_10_2_SolveCSP_black != null) {

				return new Object[] { csp, _this, match, virtualNode, container };
			}
		}
		return null;
	}

	public static final boolean pattern_XContainerToContainerRule_10_3_CheckCSP_expressionFBB(
			XContainerToContainerRule _this, CSP csp) {
		boolean _localVariable_0 = _this.isAppropriate_checkCsp_BWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_XContainerToContainerRule_10_4_collectelementstobetranslated_blackBBB(
			Match match, NetworkSpan virtualNode, Container container) {
		return new Object[] { match, virtualNode, container };
	}

	public static final Object[] pattern_XContainerToContainerRule_10_4_collectelementstobetranslated_greenBBBF(
			Match match, NetworkSpan virtualNode, Container container) {
		EMoflonEdge container__virtualNode____networkSpan = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		match.getToBeTranslatedNodes().add(virtualNode);
		match.getToBeTranslatedNodes().add(container);
		String container__virtualNode____networkSpan_name_prime = "networkSpan";
		container__virtualNode____networkSpan.setSrc(container);
		container__virtualNode____networkSpan.setTrg(virtualNode);
		match.getToBeTranslatedEdges().add(container__virtualNode____networkSpan);
		container__virtualNode____networkSpan.setName(container__virtualNode____networkSpan_name_prime);
		return new Object[] { match, virtualNode, container, container__virtualNode____networkSpan };
	}

	public static final Object[] pattern_XContainerToContainerRule_10_5_collectcontextelements_blackBBB(Match match,
			NetworkSpan virtualNode, Container container) {
		return new Object[] { match, virtualNode, container };
	}

	public static final void pattern_XContainerToContainerRule_10_6_registerobjectstomatch_expressionBBBB(
			XContainerToContainerRule _this, Match match, NetworkSpan virtualNode, Container container) {
		_this.registerObjectsToMatch_BWD(match, virtualNode, container);

	}

	public static final boolean pattern_XContainerToContainerRule_10_7_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_XContainerToContainerRule_10_8_expressionF() {
		boolean _result = Boolean.valueOf(false);
		return _result;
	}

	public static final Object[] pattern_XContainerToContainerRule_11_1_performtransformation_bindingFFB(
			IsApplicableMatch isApplicableMatch) {
		EObject _localVariable_0 = isApplicableMatch.getObject("virtualNode");
		EObject _localVariable_1 = isApplicableMatch.getObject("container");
		EObject tmpVirtualNode = _localVariable_0;
		EObject tmpContainer = _localVariable_1;
		if (tmpVirtualNode instanceof NetworkSpan) {
			NetworkSpan virtualNode = (NetworkSpan) tmpVirtualNode;
			if (tmpContainer instanceof Container) {
				Container container = (Container) tmpContainer;
				return new Object[] { virtualNode, container, isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_XContainerToContainerRule_11_1_performtransformation_blackBBFBB(
			NetworkSpan virtualNode, Container container, XContainerToContainerRule _this,
			IsApplicableMatch isApplicableMatch) {
		for (EObject tmpCsp : isApplicableMatch.getAttributeInfo()) {
			if (tmpCsp instanceof CSP) {
				CSP csp = (CSP) tmpCsp;
				return new Object[] { virtualNode, container, csp, _this, isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_XContainerToContainerRule_11_1_performtransformation_bindingAndBlackFFFBB(
			XContainerToContainerRule _this, IsApplicableMatch isApplicableMatch) {
		Object[] result_pattern_XContainerToContainerRule_11_1_performtransformation_binding = pattern_XContainerToContainerRule_11_1_performtransformation_bindingFFB(
				isApplicableMatch);
		if (result_pattern_XContainerToContainerRule_11_1_performtransformation_binding != null) {
			NetworkSpan virtualNode = (NetworkSpan) result_pattern_XContainerToContainerRule_11_1_performtransformation_binding[0];
			Container container = (Container) result_pattern_XContainerToContainerRule_11_1_performtransformation_binding[1];

			Object[] result_pattern_XContainerToContainerRule_11_1_performtransformation_black = pattern_XContainerToContainerRule_11_1_performtransformation_blackBBFBB(
					virtualNode, container, _this, isApplicableMatch);
			if (result_pattern_XContainerToContainerRule_11_1_performtransformation_black != null) {
				CSP csp = (CSP) result_pattern_XContainerToContainerRule_11_1_performtransformation_black[2];

				return new Object[] { virtualNode, container, csp, _this, isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_XContainerToContainerRule_11_1_performtransformation_greenFFB(
			Container container) {
		XContainer xContainer = ReqXtextFactory.eINSTANCE.createXContainer();
		XContainerToContainer xContainerToContainer = RequirementsTransformatorFactory.eINSTANCE
				.createXContainerToContainer();
		xContainerToContainer.setSource(xContainer);
		xContainerToContainer.setTarget(container);
		return new Object[] { xContainer, xContainerToContainer, container };
	}

	public static final Object[] pattern_XContainerToContainerRule_11_2_collecttranslatedelements_blackBBBB(
			XContainer xContainer, XContainerToContainer xContainerToContainer, NetworkSpan virtualNode,
			Container container) {
		return new Object[] { xContainer, xContainerToContainer, virtualNode, container };
	}

	public static final Object[] pattern_XContainerToContainerRule_11_2_collecttranslatedelements_greenFBBBB(
			XContainer xContainer, XContainerToContainer xContainerToContainer, NetworkSpan virtualNode,
			Container container) {
		PerformRuleResult ruleresult = RuntimeFactory.eINSTANCE.createPerformRuleResult();
		ruleresult.getCreatedElements().add(xContainer);
		ruleresult.getCreatedLinkElements().add(xContainerToContainer);
		ruleresult.getTranslatedElements().add(virtualNode);
		ruleresult.getTranslatedElements().add(container);
		return new Object[] { ruleresult, xContainer, xContainerToContainer, virtualNode, container };
	}

	public static final Object[] pattern_XContainerToContainerRule_11_3_bookkeepingforedges_blackBBBBB(
			PerformRuleResult ruleresult, EObject xContainer, EObject xContainerToContainer, EObject virtualNode,
			EObject container) {
		if (!xContainer.equals(xContainerToContainer)) {
			if (!virtualNode.equals(xContainer)) {
				if (!virtualNode.equals(xContainerToContainer)) {
					if (!container.equals(xContainer)) {
						if (!container.equals(xContainerToContainer)) {
							if (!container.equals(virtualNode)) {
								return new Object[] { ruleresult, xContainer, xContainerToContainer, virtualNode,
										container };
							}
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_XContainerToContainerRule_11_3_bookkeepingforedges_greenBBBBBFFF(
			PerformRuleResult ruleresult, EObject xContainer, EObject xContainerToContainer, EObject virtualNode,
			EObject container) {
		EMoflonEdge xContainerToContainer__xContainer____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge container__virtualNode____networkSpan = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge xContainerToContainer__container____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String ruleresult_ruleName_prime = "XContainerToContainerRule";
		String xContainerToContainer__xContainer____source_name_prime = "source";
		String container__virtualNode____networkSpan_name_prime = "networkSpan";
		String xContainerToContainer__container____target_name_prime = "target";
		xContainerToContainer__xContainer____source.setSrc(xContainerToContainer);
		xContainerToContainer__xContainer____source.setTrg(xContainer);
		ruleresult.getCreatedEdges().add(xContainerToContainer__xContainer____source);
		container__virtualNode____networkSpan.setSrc(container);
		container__virtualNode____networkSpan.setTrg(virtualNode);
		ruleresult.getTranslatedEdges().add(container__virtualNode____networkSpan);
		xContainerToContainer__container____target.setSrc(xContainerToContainer);
		xContainerToContainer__container____target.setTrg(container);
		ruleresult.getCreatedEdges().add(xContainerToContainer__container____target);
		ruleresult.setRuleName(ruleresult_ruleName_prime);
		xContainerToContainer__xContainer____source.setName(xContainerToContainer__xContainer____source_name_prime);
		container__virtualNode____networkSpan.setName(container__virtualNode____networkSpan_name_prime);
		xContainerToContainer__container____target.setName(xContainerToContainer__container____target_name_prime);
		return new Object[] { ruleresult, xContainer, xContainerToContainer, virtualNode, container,
				xContainerToContainer__xContainer____source, container__virtualNode____networkSpan,
				xContainerToContainer__container____target };
	}

	public static final void pattern_XContainerToContainerRule_11_5_registerobjects_expressionBBBBBB(
			XContainerToContainerRule _this, PerformRuleResult ruleresult, EObject xContainer,
			EObject xContainerToContainer, EObject virtualNode, EObject container) {
		_this.registerObjects_BWD(ruleresult, xContainer, xContainerToContainer, virtualNode, container);

	}

	public static final PerformRuleResult pattern_XContainerToContainerRule_11_6_expressionFB(
			PerformRuleResult ruleresult) {
		PerformRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_XContainerToContainerRule_12_1_preparereturnvalue_bindingFB(
			XContainerToContainerRule _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass eClass = _localVariable_0;
		if (eClass != null) {
			return new Object[] { eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_XContainerToContainerRule_12_1_preparereturnvalue_blackFBB(EClass eClass,
			XContainerToContainerRule _this) {
		for (EOperation performOperation : eClass.getEOperations()) {
			String performOperation_name = performOperation.getName();
			if (performOperation_name.equals("perform_BWD")) {
				return new Object[] { performOperation, eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_XContainerToContainerRule_12_1_preparereturnvalue_bindingAndBlackFFB(
			XContainerToContainerRule _this) {
		Object[] result_pattern_XContainerToContainerRule_12_1_preparereturnvalue_binding = pattern_XContainerToContainerRule_12_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_XContainerToContainerRule_12_1_preparereturnvalue_binding != null) {
			EClass eClass = (EClass) result_pattern_XContainerToContainerRule_12_1_preparereturnvalue_binding[0];

			Object[] result_pattern_XContainerToContainerRule_12_1_preparereturnvalue_black = pattern_XContainerToContainerRule_12_1_preparereturnvalue_blackFBB(
					eClass, _this);
			if (result_pattern_XContainerToContainerRule_12_1_preparereturnvalue_black != null) {
				EOperation performOperation = (EOperation) result_pattern_XContainerToContainerRule_12_1_preparereturnvalue_black[0];

				return new Object[] { performOperation, eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_XContainerToContainerRule_12_1_preparereturnvalue_greenBF(
			EOperation performOperation) {
		IsApplicableRuleResult ruleresult = RuntimeFactory.eINSTANCE.createIsApplicableRuleResult();
		boolean ruleresult_success_prime = Boolean.valueOf(false);
		String ruleresult_rule_prime = "XContainerToContainerRule";
		ruleresult.setPerformOperation(performOperation);
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		ruleresult.setRule(ruleresult_rule_prime);
		return new Object[] { performOperation, ruleresult };
	}

	public static final Object[] pattern_XContainerToContainerRule_12_2_corematch_bindingFFB(Match match) {
		EObject _localVariable_0 = match.getObject("virtualNode");
		EObject _localVariable_1 = match.getObject("container");
		EObject tmpVirtualNode = _localVariable_0;
		EObject tmpContainer = _localVariable_1;
		if (tmpVirtualNode instanceof NetworkSpan) {
			NetworkSpan virtualNode = (NetworkSpan) tmpVirtualNode;
			if (tmpContainer instanceof Container) {
				Container container = (Container) tmpContainer;
				return new Object[] { virtualNode, container, match };
			}
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_XContainerToContainerRule_12_2_corematch_blackBBB(
			NetworkSpan virtualNode, Container container, Match match) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		_result.add(new Object[] { virtualNode, container, match });
		return _result;
	}

	public static final Iterable<Object[]> pattern_XContainerToContainerRule_12_3_findcontext_blackBB(
			NetworkSpan virtualNode, Container container) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (virtualNode.equals(container.getNetworkSpan())) {
			_result.add(new Object[] { virtualNode, container });
		}
		return _result;
	}

	public static final Object[] pattern_XContainerToContainerRule_12_3_findcontext_greenBBFF(NetworkSpan virtualNode,
			Container container) {
		IsApplicableMatch isApplicableMatch = RuntimeFactory.eINSTANCE.createIsApplicableMatch();
		EMoflonEdge container__virtualNode____networkSpan = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String container__virtualNode____networkSpan_name_prime = "networkSpan";
		isApplicableMatch.getAllContextElements().add(virtualNode);
		isApplicableMatch.getAllContextElements().add(container);
		container__virtualNode____networkSpan.setSrc(container);
		container__virtualNode____networkSpan.setTrg(virtualNode);
		isApplicableMatch.getAllContextElements().add(container__virtualNode____networkSpan);
		container__virtualNode____networkSpan.setName(container__virtualNode____networkSpan_name_prime);
		return new Object[] { virtualNode, container, isApplicableMatch, container__virtualNode____networkSpan };
	}

	public static final Object[] pattern_XContainerToContainerRule_12_4_solveCSP_bindingFBBBB(
			XContainerToContainerRule _this, IsApplicableMatch isApplicableMatch, NetworkSpan virtualNode,
			Container container) {
		CSP _localVariable_0 = _this.isApplicable_solveCsp_BWD(isApplicableMatch, virtualNode, container);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, virtualNode, container };
		}
		return null;
	}

	public static final Object[] pattern_XContainerToContainerRule_12_4_solveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_XContainerToContainerRule_12_4_solveCSP_bindingAndBlackFBBBB(
			XContainerToContainerRule _this, IsApplicableMatch isApplicableMatch, NetworkSpan virtualNode,
			Container container) {
		Object[] result_pattern_XContainerToContainerRule_12_4_solveCSP_binding = pattern_XContainerToContainerRule_12_4_solveCSP_bindingFBBBB(
				_this, isApplicableMatch, virtualNode, container);
		if (result_pattern_XContainerToContainerRule_12_4_solveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_XContainerToContainerRule_12_4_solveCSP_binding[0];

			Object[] result_pattern_XContainerToContainerRule_12_4_solveCSP_black = pattern_XContainerToContainerRule_12_4_solveCSP_blackB(
					csp);
			if (result_pattern_XContainerToContainerRule_12_4_solveCSP_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, virtualNode, container };
			}
		}
		return null;
	}

	public static final boolean pattern_XContainerToContainerRule_12_5_checkCSP_expressionFBB(
			XContainerToContainerRule _this, CSP csp) {
		boolean _localVariable_0 = _this.isApplicable_checkCsp_BWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_XContainerToContainerRule_12_6_addmatchtoruleresult_blackBB(
			IsApplicableRuleResult ruleresult, IsApplicableMatch isApplicableMatch) {
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final Object[] pattern_XContainerToContainerRule_12_6_addmatchtoruleresult_greenBB(
			IsApplicableRuleResult ruleresult, IsApplicableMatch isApplicableMatch) {
		ruleresult.getIsApplicableMatch().add(isApplicableMatch);
		boolean ruleresult_success_prime = Boolean.valueOf(true);
		String isApplicableMatch_ruleName_prime = "XContainerToContainerRule";
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		isApplicableMatch.setRuleName(isApplicableMatch_ruleName_prime);
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final IsApplicableRuleResult pattern_XContainerToContainerRule_12_7_expressionFB(
			IsApplicableRuleResult ruleresult) {
		IsApplicableRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_XContainerToContainerRule_20_1_preparereturnvalue_bindingFB(
			XContainerToContainerRule _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_XContainerToContainerRule_20_1_preparereturnvalue_blackFBBF(EClass __eClass,
			XContainerToContainerRule _this) {
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

	public static final Object[] pattern_XContainerToContainerRule_20_1_preparereturnvalue_bindingAndBlackFFBF(
			XContainerToContainerRule _this) {
		Object[] result_pattern_XContainerToContainerRule_20_1_preparereturnvalue_binding = pattern_XContainerToContainerRule_20_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_XContainerToContainerRule_20_1_preparereturnvalue_binding != null) {
			EClass __eClass = (EClass) result_pattern_XContainerToContainerRule_20_1_preparereturnvalue_binding[0];

			Object[] result_pattern_XContainerToContainerRule_20_1_preparereturnvalue_black = pattern_XContainerToContainerRule_20_1_preparereturnvalue_blackFBBF(
					__eClass, _this);
			if (result_pattern_XContainerToContainerRule_20_1_preparereturnvalue_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_XContainerToContainerRule_20_1_preparereturnvalue_black[0];
				EOperation isApplicableCC = (EOperation) result_pattern_XContainerToContainerRule_20_1_preparereturnvalue_black[3];

				return new Object[] { __performOperation, __eClass, _this, isApplicableCC };
			}
		}
		return null;
	}

	public static final Object[] pattern_XContainerToContainerRule_20_1_preparereturnvalue_greenF() {
		EObjectContainer __result = RuntimeFactory.eINSTANCE.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Iterable<Object[]> pattern_XContainerToContainerRule_20_2_testcorematchandDECs_blackB(
			XContainer xContainer) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		_result.add(new Object[] { xContainer });
		return _result;
	}

	public static final Object[] pattern_XContainerToContainerRule_20_2_testcorematchandDECs_greenFB(EClass __eClass) {
		Match match = RuntimeFactory.eINSTANCE.createMatch();
		String __eClass_name = __eClass.getName();
		String match_ruleName_prime = __eClass_name;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_XContainerToContainerRule_20_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBB(
			XContainerToContainerRule _this, Match match, XContainer xContainer) {
		boolean _localVariable_0 = _this.isAppropriate_FWD(match, xContainer);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_XContainerToContainerRule_20_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(
			XContainerToContainerRule _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_FWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_XContainerToContainerRule_20_5_Addmatchtoruleresult_blackBBBB(Match match,
			EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		if (!__performOperation.equals(isApplicableCC)) {
			return new Object[] { match, __performOperation, __result, isApplicableCC };
		}
		return null;
	}

	public static final Object[] pattern_XContainerToContainerRule_20_5_Addmatchtoruleresult_greenBBBB(Match match,
			EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		match.setIsApplicableCCOperation(isApplicableCC);
		return new Object[] { match, __performOperation, __result, isApplicableCC };
	}

	public static final EObjectContainer pattern_XContainerToContainerRule_20_6_expressionFB(
			EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_XContainerToContainerRule_21_1_preparereturnvalue_bindingFB(
			XContainerToContainerRule _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_XContainerToContainerRule_21_1_preparereturnvalue_blackFBBF(EClass __eClass,
			XContainerToContainerRule _this) {
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

	public static final Object[] pattern_XContainerToContainerRule_21_1_preparereturnvalue_bindingAndBlackFFBF(
			XContainerToContainerRule _this) {
		Object[] result_pattern_XContainerToContainerRule_21_1_preparereturnvalue_binding = pattern_XContainerToContainerRule_21_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_XContainerToContainerRule_21_1_preparereturnvalue_binding != null) {
			EClass __eClass = (EClass) result_pattern_XContainerToContainerRule_21_1_preparereturnvalue_binding[0];

			Object[] result_pattern_XContainerToContainerRule_21_1_preparereturnvalue_black = pattern_XContainerToContainerRule_21_1_preparereturnvalue_blackFBBF(
					__eClass, _this);
			if (result_pattern_XContainerToContainerRule_21_1_preparereturnvalue_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_XContainerToContainerRule_21_1_preparereturnvalue_black[0];
				EOperation isApplicableCC = (EOperation) result_pattern_XContainerToContainerRule_21_1_preparereturnvalue_black[3];

				return new Object[] { __performOperation, __eClass, _this, isApplicableCC };
			}
		}
		return null;
	}

	public static final Object[] pattern_XContainerToContainerRule_21_1_preparereturnvalue_greenF() {
		EObjectContainer __result = RuntimeFactory.eINSTANCE.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Iterable<Object[]> pattern_XContainerToContainerRule_21_2_testcorematchandDECs_blackFFB(
			EMoflonEdge _edge_networkSpan) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		EObject tmpContainer = _edge_networkSpan.getSrc();
		if (tmpContainer instanceof Container) {
			Container container = (Container) tmpContainer;
			EObject tmpVirtualNode = _edge_networkSpan.getTrg();
			if (tmpVirtualNode instanceof NetworkSpan) {
				NetworkSpan virtualNode = (NetworkSpan) tmpVirtualNode;
				if (virtualNode.equals(container.getNetworkSpan())) {
					_result.add(new Object[] { virtualNode, container, _edge_networkSpan });
				}
			}

		}

		return _result;
	}

	public static final Object[] pattern_XContainerToContainerRule_21_2_testcorematchandDECs_greenFB(EClass __eClass) {
		Match match = RuntimeFactory.eINSTANCE.createMatch();
		String __eClass_name = __eClass.getName();
		String match_ruleName_prime = __eClass_name;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_XContainerToContainerRule_21_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBB(
			XContainerToContainerRule _this, Match match, NetworkSpan virtualNode, Container container) {
		boolean _localVariable_0 = _this.isAppropriate_BWD(match, virtualNode, container);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_XContainerToContainerRule_21_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(
			XContainerToContainerRule _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_BWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_XContainerToContainerRule_21_5_Addmatchtoruleresult_blackBBBB(Match match,
			EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		if (!__performOperation.equals(isApplicableCC)) {
			return new Object[] { match, __performOperation, __result, isApplicableCC };
		}
		return null;
	}

	public static final Object[] pattern_XContainerToContainerRule_21_5_Addmatchtoruleresult_greenBBBB(Match match,
			EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		match.setIsApplicableCCOperation(isApplicableCC);
		return new Object[] { match, __performOperation, __result, isApplicableCC };
	}

	public static final EObjectContainer pattern_XContainerToContainerRule_21_6_expressionFB(
			EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_XContainerToContainerRule_24_1_prepare_blackB(
			XContainerToContainerRule _this) {
		return new Object[] { _this };
	}

	public static final Object[] pattern_XContainerToContainerRule_24_1_prepare_greenF() {
		IsApplicableRuleResult result = RuntimeFactory.eINSTANCE.createIsApplicableRuleResult();
		return new Object[] { result };
	}

	public static final Object[] pattern_XContainerToContainerRule_24_2_matchsrctrgcontext_bindingFFFBB(
			Match sourceMatch, Match targetMatch) {
		EObject _localVariable_0 = sourceMatch.getObject("xContainer");
		EObject _localVariable_1 = targetMatch.getObject("virtualNode");
		EObject _localVariable_2 = targetMatch.getObject("container");
		EObject tmpXContainer = _localVariable_0;
		EObject tmpVirtualNode = _localVariable_1;
		EObject tmpContainer = _localVariable_2;
		if (tmpXContainer instanceof XContainer) {
			XContainer xContainer = (XContainer) tmpXContainer;
			if (tmpVirtualNode instanceof NetworkSpan) {
				NetworkSpan virtualNode = (NetworkSpan) tmpVirtualNode;
				if (tmpContainer instanceof Container) {
					Container container = (Container) tmpContainer;
					return new Object[] { xContainer, virtualNode, container, sourceMatch, targetMatch };
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_XContainerToContainerRule_24_2_matchsrctrgcontext_blackBBBBB(
			XContainer xContainer, NetworkSpan virtualNode, Container container, Match sourceMatch, Match targetMatch) {
		if (!sourceMatch.equals(targetMatch)) {
			return new Object[] { xContainer, virtualNode, container, sourceMatch, targetMatch };
		}
		return null;
	}

	public static final Object[] pattern_XContainerToContainerRule_24_2_matchsrctrgcontext_bindingAndBlackFFFBB(
			Match sourceMatch, Match targetMatch) {
		Object[] result_pattern_XContainerToContainerRule_24_2_matchsrctrgcontext_binding = pattern_XContainerToContainerRule_24_2_matchsrctrgcontext_bindingFFFBB(
				sourceMatch, targetMatch);
		if (result_pattern_XContainerToContainerRule_24_2_matchsrctrgcontext_binding != null) {
			XContainer xContainer = (XContainer) result_pattern_XContainerToContainerRule_24_2_matchsrctrgcontext_binding[0];
			NetworkSpan virtualNode = (NetworkSpan) result_pattern_XContainerToContainerRule_24_2_matchsrctrgcontext_binding[1];
			Container container = (Container) result_pattern_XContainerToContainerRule_24_2_matchsrctrgcontext_binding[2];

			Object[] result_pattern_XContainerToContainerRule_24_2_matchsrctrgcontext_black = pattern_XContainerToContainerRule_24_2_matchsrctrgcontext_blackBBBBB(
					xContainer, virtualNode, container, sourceMatch, targetMatch);
			if (result_pattern_XContainerToContainerRule_24_2_matchsrctrgcontext_black != null) {

				return new Object[] { xContainer, virtualNode, container, sourceMatch, targetMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_XContainerToContainerRule_24_3_solvecsp_bindingFBBBBBB(
			XContainerToContainerRule _this, XContainer xContainer, NetworkSpan virtualNode, Container container,
			Match sourceMatch, Match targetMatch) {
		CSP _localVariable_3 = _this.isApplicable_solveCsp_CC(xContainer, virtualNode, container, sourceMatch,
				targetMatch);
		CSP csp = _localVariable_3;
		if (csp != null) {
			return new Object[] { csp, _this, xContainer, virtualNode, container, sourceMatch, targetMatch };
		}
		return null;
	}

	public static final Object[] pattern_XContainerToContainerRule_24_3_solvecsp_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_XContainerToContainerRule_24_3_solvecsp_bindingAndBlackFBBBBBB(
			XContainerToContainerRule _this, XContainer xContainer, NetworkSpan virtualNode, Container container,
			Match sourceMatch, Match targetMatch) {
		Object[] result_pattern_XContainerToContainerRule_24_3_solvecsp_binding = pattern_XContainerToContainerRule_24_3_solvecsp_bindingFBBBBBB(
				_this, xContainer, virtualNode, container, sourceMatch, targetMatch);
		if (result_pattern_XContainerToContainerRule_24_3_solvecsp_binding != null) {
			CSP csp = (CSP) result_pattern_XContainerToContainerRule_24_3_solvecsp_binding[0];

			Object[] result_pattern_XContainerToContainerRule_24_3_solvecsp_black = pattern_XContainerToContainerRule_24_3_solvecsp_blackB(
					csp);
			if (result_pattern_XContainerToContainerRule_24_3_solvecsp_black != null) {

				return new Object[] { csp, _this, xContainer, virtualNode, container, sourceMatch, targetMatch };
			}
		}
		return null;
	}

	public static final boolean pattern_XContainerToContainerRule_24_4_checkCSP_expressionFB(CSP csp) {
		boolean _localVariable_0 = csp.check();
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Iterable<Object[]> pattern_XContainerToContainerRule_24_5_matchcorrcontext_blackBB(
			Match sourceMatch, Match targetMatch) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (!sourceMatch.equals(targetMatch)) {
			_result.add(new Object[] { sourceMatch, targetMatch });
		}
		return _result;
	}

	public static final Object[] pattern_XContainerToContainerRule_24_5_matchcorrcontext_greenBBF(Match sourceMatch,
			Match targetMatch) {
		CCMatch ccMatch = RuntimeFactory.eINSTANCE.createCCMatch();
		String ccMatch_ruleName_prime = "XContainerToContainerRule";
		ccMatch.setSourceMatch(sourceMatch);
		ccMatch.setTargetMatch(targetMatch);
		ccMatch.setRuleName(ccMatch_ruleName_prime);
		return new Object[] { sourceMatch, targetMatch, ccMatch };
	}

	public static final Object[] pattern_XContainerToContainerRule_24_6_createcorrespondence_blackBBBB(
			XContainer xContainer, NetworkSpan virtualNode, Container container, CCMatch ccMatch) {
		return new Object[] { xContainer, virtualNode, container, ccMatch };
	}

	public static final Object[] pattern_XContainerToContainerRule_24_6_createcorrespondence_greenBFBB(
			XContainer xContainer, Container container, CCMatch ccMatch) {
		XContainerToContainer xContainerToContainer = RequirementsTransformatorFactory.eINSTANCE
				.createXContainerToContainer();
		xContainerToContainer.setSource(xContainer);
		xContainerToContainer.setTarget(container);
		ccMatch.getCreateCorr().add(xContainerToContainer);
		return new Object[] { xContainer, xContainerToContainer, container, ccMatch };
	}

	public static final Object[] pattern_XContainerToContainerRule_24_7_addtoreturnedresult_blackBB(
			IsApplicableRuleResult result, CCMatch ccMatch) {
		return new Object[] { result, ccMatch };
	}

	public static final Object[] pattern_XContainerToContainerRule_24_7_addtoreturnedresult_greenBB(
			IsApplicableRuleResult result, CCMatch ccMatch) {
		result.getIsApplicableMatch().add(ccMatch);
		boolean result_success_prime = Boolean.valueOf(true);
		String ccMatch_ruleName_prime = "XContainerToContainerRule";
		result.setSuccess(Boolean.valueOf(result_success_prime));
		ccMatch.setRuleName(ccMatch_ruleName_prime);
		return new Object[] { result, ccMatch };
	}

	public static final IsApplicableRuleResult pattern_XContainerToContainerRule_24_8_expressionFB(
			IsApplicableRuleResult result) {
		IsApplicableRuleResult _result = result;
		return _result;
	}

	public static final Object[] pattern_XContainerToContainerRule_27_1_matchtggpattern_blackB(XContainer xContainer) {
		return new Object[] { xContainer };
	}

	public static final boolean pattern_XContainerToContainerRule_27_2_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_XContainerToContainerRule_27_3_expressionF() {
		boolean _result = Boolean.valueOf(false);
		return _result;
	}

	public static final Object[] pattern_XContainerToContainerRule_28_1_matchtggpattern_blackBB(NetworkSpan virtualNode,
			Container container) {
		if (virtualNode.equals(container.getNetworkSpan())) {
			return new Object[] { virtualNode, container };
		}
		return null;
	}

	public static final boolean pattern_XContainerToContainerRule_28_2_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_XContainerToContainerRule_28_3_expressionF() {
		boolean _result = Boolean.valueOf(false);
		return _result;
	}

	public static final Object[] pattern_XContainerToContainerRule_29_1_createresult_blackB(
			XContainerToContainerRule _this) {
		return new Object[] { _this };
	}

	public static final Object[] pattern_XContainerToContainerRule_29_1_createresult_greenFF() {
		IsApplicableMatch isApplicableMatch = RuntimeFactory.eINSTANCE.createIsApplicableMatch();
		ModelgeneratorRuleResult ruleResult = RuntimeFactory.eINSTANCE.createModelgeneratorRuleResult();
		boolean ruleResult_success_prime = Boolean.valueOf(false);
		ruleResult.setSuccess(Boolean.valueOf(ruleResult_success_prime));
		return new Object[] { isApplicableMatch, ruleResult };
	}

	public static final Object[] pattern_XContainerToContainerRule_29_2_isapplicablecore_blackB(
			XContainerToContainerRule _this) {
		return new Object[] { _this };
	}

	public static final Object[] pattern_XContainerToContainerRule_29_3_solveCSP_bindingFBBB(
			XContainerToContainerRule _this, IsApplicableMatch isApplicableMatch, ModelgeneratorRuleResult ruleResult) {
		CSP _localVariable_0 = _this.generateModel_solveCsp_BWD(isApplicableMatch, ruleResult);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, ruleResult };
		}
		return null;
	}

	public static final Object[] pattern_XContainerToContainerRule_29_3_solveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_XContainerToContainerRule_29_3_solveCSP_bindingAndBlackFBBB(
			XContainerToContainerRule _this, IsApplicableMatch isApplicableMatch, ModelgeneratorRuleResult ruleResult) {
		Object[] result_pattern_XContainerToContainerRule_29_3_solveCSP_binding = pattern_XContainerToContainerRule_29_3_solveCSP_bindingFBBB(
				_this, isApplicableMatch, ruleResult);
		if (result_pattern_XContainerToContainerRule_29_3_solveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_XContainerToContainerRule_29_3_solveCSP_binding[0];

			Object[] result_pattern_XContainerToContainerRule_29_3_solveCSP_black = pattern_XContainerToContainerRule_29_3_solveCSP_blackB(
					csp);
			if (result_pattern_XContainerToContainerRule_29_3_solveCSP_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, ruleResult };
			}
		}
		return null;
	}

	public static final boolean pattern_XContainerToContainerRule_29_4_checkCSP_expressionFBB(
			XContainerToContainerRule _this, CSP csp) {
		boolean _localVariable_0 = _this.generateModel_checkCsp_BWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_XContainerToContainerRule_29_6_perform_blackB(
			ModelgeneratorRuleResult ruleResult) {
		return new Object[] { ruleResult };
	}

	public static final Object[] pattern_XContainerToContainerRule_29_6_perform_greenFFFFB(
			ModelgeneratorRuleResult ruleResult) {
		XContainer xContainer = ReqXtextFactory.eINSTANCE.createXContainer();
		XContainerToContainer xContainerToContainer = RequirementsTransformatorFactory.eINSTANCE
				.createXContainerToContainer();
		NetworkSpan virtualNode = RequirementsFactory.eINSTANCE.createNetworkSpan();
		Container container = RequirementsFactory.eINSTANCE.createContainer();
		boolean ruleResult_success_prime = Boolean.valueOf(true);
		int _localVariable_0 = ruleResult.getIncrementedPerformCount();
		ruleResult.getSourceObjects().add(xContainer);
		xContainerToContainer.setSource(xContainer);
		ruleResult.getCorrObjects().add(xContainerToContainer);
		ruleResult.getTargetObjects().add(virtualNode);
		container.setNetworkSpan(virtualNode);
		xContainerToContainer.setTarget(container);
		ruleResult.getTargetObjects().add(container);
		ruleResult.setSuccess(Boolean.valueOf(ruleResult_success_prime));
		int ruleResult_performCount_prime = Integer.valueOf(_localVariable_0);
		ruleResult.setPerformCount(Integer.valueOf(ruleResult_performCount_prime));
		return new Object[] { xContainer, xContainerToContainer, virtualNode, container, ruleResult };
	}

	public static final ModelgeneratorRuleResult pattern_XContainerToContainerRule_29_7_expressionFB(
			ModelgeneratorRuleResult ruleResult) {
		ModelgeneratorRuleResult _result = ruleResult;
		return _result;
	}

	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} //XContainerToContainerRuleImpl
