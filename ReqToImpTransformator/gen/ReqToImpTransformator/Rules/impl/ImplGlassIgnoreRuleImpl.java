/**
 */
package ReqToImpTransformator.Rules.impl;

import ReqToImpTransformator.ReqContainerToImplContainer;

import ReqToImpTransformator.Rules.ImplGlassIgnoreRule;
import ReqToImpTransformator.Rules.RulesPackage;

import implementation.GlassFiberCable;
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
 * An implementation of the model object '<em><b>Impl Glass Ignore Rule</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class ImplGlassIgnoreRuleImpl extends AbstractRuleImpl implements ImplGlassIgnoreRule {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ImplGlassIgnoreRuleImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RulesPackage.eINSTANCE.getImplGlassIgnoreRule();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAppropriate_FWD(Match match, Container reqContainer) {

		Object[] result1_black = ImplGlassIgnoreRuleImpl.pattern_ImplGlassIgnoreRule_0_1_initialbindings_blackBBB(this,
				match, reqContainer);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[match] = " + match + ", " + "[reqContainer] = " + reqContainer + ".");
		}

		Object[] result2_bindingAndBlack = ImplGlassIgnoreRuleImpl
				.pattern_ImplGlassIgnoreRule_0_2_SolveCSP_bindingAndBlackFBBB(this, match, reqContainer);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[match] = " + match + ", " + "[reqContainer] = " + reqContainer + ".");
		}
		CSP csp = (CSP) result2_bindingAndBlack[0];
		// 
		if (ImplGlassIgnoreRuleImpl.pattern_ImplGlassIgnoreRule_0_3_CheckCSP_expressionFBB(this, csp)) {

			Object[] result4_black = ImplGlassIgnoreRuleImpl
					.pattern_ImplGlassIgnoreRule_0_4_collectelementstobetranslated_blackBB(match, reqContainer);
			if (result4_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match + ", "
						+ "[reqContainer] = " + reqContainer + ".");
			}

			Object[] result5_black = ImplGlassIgnoreRuleImpl
					.pattern_ImplGlassIgnoreRule_0_5_collectcontextelements_blackBB(match, reqContainer);
			if (result5_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match + ", "
						+ "[reqContainer] = " + reqContainer + ".");
			}
			ImplGlassIgnoreRuleImpl.pattern_ImplGlassIgnoreRule_0_5_collectcontextelements_greenBB(match, reqContainer);

			// 
			ImplGlassIgnoreRuleImpl.pattern_ImplGlassIgnoreRule_0_6_registerobjectstomatch_expressionBBB(this, match,
					reqContainer);
			return ImplGlassIgnoreRuleImpl.pattern_ImplGlassIgnoreRule_0_7_expressionF();
		} else {
			return ImplGlassIgnoreRuleImpl.pattern_ImplGlassIgnoreRule_0_8_expressionF();
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
	public void registerObjectsToMatch_FWD(Match match, Container reqContainer) {
		match.registerObject("reqContainer", reqContainer);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isAppropriate_solveCsp_FWD(Match match, Container reqContainer) {// Create CSP
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
	public boolean isAppropriate_BWD(Match match, GlassFiberCable cable, implementation.Container implContainer) {

		Object[] result1_black = ImplGlassIgnoreRuleImpl.pattern_ImplGlassIgnoreRule_7_1_initialbindings_blackBBBB(this,
				match, cable, implContainer);
		if (result1_black == null) {
			throw new RuntimeException(
					"Pattern matching failed." + " Variables: " + "[this] = " + this + ", " + "[match] = " + match
							+ ", " + "[cable] = " + cable + ", " + "[implContainer] = " + implContainer + ".");
		}

		Object[] result2_bindingAndBlack = ImplGlassIgnoreRuleImpl
				.pattern_ImplGlassIgnoreRule_7_2_SolveCSP_bindingAndBlackFBBBB(this, match, cable, implContainer);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException(
					"Pattern matching failed." + " Variables: " + "[this] = " + this + ", " + "[match] = " + match
							+ ", " + "[cable] = " + cable + ", " + "[implContainer] = " + implContainer + ".");
		}
		CSP csp = (CSP) result2_bindingAndBlack[0];
		// 
		if (ImplGlassIgnoreRuleImpl.pattern_ImplGlassIgnoreRule_7_3_CheckCSP_expressionFBB(this, csp)) {

			Object[] result4_black = ImplGlassIgnoreRuleImpl
					.pattern_ImplGlassIgnoreRule_7_4_collectelementstobetranslated_blackBBB(match, cable,
							implContainer);
			if (result4_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match + ", "
						+ "[cable] = " + cable + ", " + "[implContainer] = " + implContainer + ".");
			}
			ImplGlassIgnoreRuleImpl.pattern_ImplGlassIgnoreRule_7_4_collectelementstobetranslated_greenBBBF(match,
					cable, implContainer);
			//nothing EMoflonEdge implContainer__cable____cables = (EMoflonEdge) result4_green[3];

			Object[] result5_black = ImplGlassIgnoreRuleImpl
					.pattern_ImplGlassIgnoreRule_7_5_collectcontextelements_blackBBB(match, cable, implContainer);
			if (result5_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match + ", "
						+ "[cable] = " + cable + ", " + "[implContainer] = " + implContainer + ".");
			}
			ImplGlassIgnoreRuleImpl.pattern_ImplGlassIgnoreRule_7_5_collectcontextelements_greenBB(match,
					implContainer);

			// 
			ImplGlassIgnoreRuleImpl.pattern_ImplGlassIgnoreRule_7_6_registerobjectstomatch_expressionBBBB(this, match,
					cable, implContainer);
			return ImplGlassIgnoreRuleImpl.pattern_ImplGlassIgnoreRule_7_7_expressionF();
		} else {
			return ImplGlassIgnoreRuleImpl.pattern_ImplGlassIgnoreRule_7_8_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PerformRuleResult perform_BWD(IsApplicableMatch isApplicableMatch) {

		Object[] result1_bindingAndBlack = ImplGlassIgnoreRuleImpl
				.pattern_ImplGlassIgnoreRule_8_1_performtransformation_bindingAndBlackFFFFFBB(this, isApplicableMatch);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[isApplicableMatch] = " + isApplicableMatch + ".");
		}
		Container reqContainer = (Container) result1_bindingAndBlack[0];
		GlassFiberCable cable = (GlassFiberCable) result1_bindingAndBlack[1];
		implementation.Container implContainer = (implementation.Container) result1_bindingAndBlack[2];
		ReqContainerToImplContainer reqContainerToImplContainer = (ReqContainerToImplContainer) result1_bindingAndBlack[3];
		//nothing CSP csp = (CSP) result1_bindingAndBlack[4];

		Object[] result2_black = ImplGlassIgnoreRuleImpl
				.pattern_ImplGlassIgnoreRule_8_2_collecttranslatedelements_blackB(cable);
		if (result2_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[cable] = " + cable + ".");
		}
		Object[] result2_green = ImplGlassIgnoreRuleImpl
				.pattern_ImplGlassIgnoreRule_8_2_collecttranslatedelements_greenFB(cable);
		PerformRuleResult ruleresult = (PerformRuleResult) result2_green[0];

		Object[] result3_black = ImplGlassIgnoreRuleImpl.pattern_ImplGlassIgnoreRule_8_3_bookkeepingforedges_blackBBBBB(
				ruleresult, reqContainer, cable, implContainer, reqContainerToImplContainer);
		if (result3_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[ruleresult] = " + ruleresult
					+ ", " + "[reqContainer] = " + reqContainer + ", " + "[cable] = " + cable + ", "
					+ "[implContainer] = " + implContainer + ", " + "[reqContainerToImplContainer] = "
					+ reqContainerToImplContainer + ".");
		}
		ImplGlassIgnoreRuleImpl.pattern_ImplGlassIgnoreRule_8_3_bookkeepingforedges_greenBBBF(ruleresult, cable,
				implContainer);
		//nothing EMoflonEdge implContainer__cable____cables = (EMoflonEdge) result3_green[3];

		// 
		// 
		ImplGlassIgnoreRuleImpl.pattern_ImplGlassIgnoreRule_8_5_registerobjects_expressionBBBBBB(this, ruleresult,
				reqContainer, cable, implContainer, reqContainerToImplContainer);
		return ImplGlassIgnoreRuleImpl.pattern_ImplGlassIgnoreRule_8_6_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IsApplicableRuleResult isApplicable_BWD(Match match) {

		Object[] result1_bindingAndBlack = ImplGlassIgnoreRuleImpl
				.pattern_ImplGlassIgnoreRule_9_1_preparereturnvalue_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		EOperation performOperation = (EOperation) result1_bindingAndBlack[0];
		//nothing EClass eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = ImplGlassIgnoreRuleImpl
				.pattern_ImplGlassIgnoreRule_9_1_preparereturnvalue_greenBF(performOperation);
		IsApplicableRuleResult ruleresult = (IsApplicableRuleResult) result1_green[1];

		// ForEach 
		Object[] result2_binding = ImplGlassIgnoreRuleImpl.pattern_ImplGlassIgnoreRule_9_2_corematch_bindingFFB(match);
		if (result2_binding == null) {
			throw new RuntimeException(
					"Binding in node core match failed." + " Variables: " + "[match] = " + match + ".");
		}
		GlassFiberCable cable = (GlassFiberCable) result2_binding[0];
		implementation.Container implContainer = (implementation.Container) result2_binding[1];
		for (Object[] result2_black : ImplGlassIgnoreRuleImpl
				.pattern_ImplGlassIgnoreRule_9_2_corematch_blackFBBFB(cable, implContainer, match)) {
			Container reqContainer = (Container) result2_black[0];
			ReqContainerToImplContainer reqContainerToImplContainer = (ReqContainerToImplContainer) result2_black[3];
			// ForEach 
			for (Object[] result3_black : ImplGlassIgnoreRuleImpl.pattern_ImplGlassIgnoreRule_9_3_findcontext_blackBBBB(
					reqContainer, cable, implContainer, reqContainerToImplContainer)) {
				Object[] result3_green = ImplGlassIgnoreRuleImpl
						.pattern_ImplGlassIgnoreRule_9_3_findcontext_greenBBBBFFFF(reqContainer, cable, implContainer,
								reqContainerToImplContainer);
				IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result3_green[4];
				//nothing EMoflonEdge implContainer__cable____cables = (EMoflonEdge) result3_green[5];
				//nothing EMoflonEdge reqContainerToImplContainer__reqContainer____source = (EMoflonEdge) result3_green[6];
				//nothing EMoflonEdge reqContainerToImplContainer__implContainer____target = (EMoflonEdge) result3_green[7];

				Object[] result4_bindingAndBlack = ImplGlassIgnoreRuleImpl
						.pattern_ImplGlassIgnoreRule_9_4_solveCSP_bindingAndBlackFBBBBBB(this, isApplicableMatch,
								reqContainer, cable, implContainer, reqContainerToImplContainer);
				if (result4_bindingAndBlack == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
							+ "[isApplicableMatch] = " + isApplicableMatch + ", " + "[reqContainer] = " + reqContainer
							+ ", " + "[cable] = " + cable + ", " + "[implContainer] = " + implContainer + ", "
							+ "[reqContainerToImplContainer] = " + reqContainerToImplContainer + ".");
				}
				CSP csp = (CSP) result4_bindingAndBlack[0];
				// 
				if (ImplGlassIgnoreRuleImpl.pattern_ImplGlassIgnoreRule_9_5_checkCSP_expressionFBB(this, csp)) {

					Object[] result6_black = ImplGlassIgnoreRuleImpl
							.pattern_ImplGlassIgnoreRule_9_6_addmatchtoruleresult_blackBB(ruleresult,
									isApplicableMatch);
					if (result6_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[ruleresult] = "
								+ ruleresult + ", " + "[isApplicableMatch] = " + isApplicableMatch + ".");
					}
					ImplGlassIgnoreRuleImpl.pattern_ImplGlassIgnoreRule_9_6_addmatchtoruleresult_greenBB(ruleresult,
							isApplicableMatch);

				} else {
				}

			}

		}
		return ImplGlassIgnoreRuleImpl.pattern_ImplGlassIgnoreRule_9_7_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void registerObjectsToMatch_BWD(Match match, GlassFiberCable cable, implementation.Container implContainer) {
		match.registerObject("cable", cable);
		match.registerObject("implContainer", implContainer);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isAppropriate_solveCsp_BWD(Match match, GlassFiberCable cable, implementation.Container implContainer) {// Create CSP
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
			GlassFiberCable cable, implementation.Container implContainer,
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
	public boolean isApplicable_checkCsp_BWD(CSP csp) {
		return csp.check();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void registerObjects_BWD(PerformRuleResult ruleresult, EObject reqContainer, EObject cable,
			EObject implContainer, EObject reqContainerToImplContainer) {
		ruleresult.registerObject("reqContainer", reqContainer);
		ruleresult.registerObject("cable", cable);
		ruleresult.registerObject("implContainer", implContainer);
		ruleresult.registerObject("reqContainerToImplContainer", reqContainerToImplContainer);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean checkTypes_BWD(Match match) {
		return true && org.moflon.util.eMoflonSDMUtil.getFQN(match.getObject("cable").eClass())
				.equals("implementation.GlassFiberCable.");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_FWD_Container_0(Container reqContainer) {

		Object[] result1_bindingAndBlack = ImplGlassIgnoreRuleImpl
				.pattern_ImplGlassIgnoreRule_17_1_preparereturnvalue_bindingAndBlackFFBF(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		EOperation isApplicableCC = (EOperation) result1_bindingAndBlack[3];
		Object[] result1_green = ImplGlassIgnoreRuleImpl.pattern_ImplGlassIgnoreRule_17_1_preparereturnvalue_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach 
		for (Object[] result2_black : ImplGlassIgnoreRuleImpl
				.pattern_ImplGlassIgnoreRule_17_2_testcorematchandDECs_blackB(reqContainer)) {
			Object[] result2_green = ImplGlassIgnoreRuleImpl
					.pattern_ImplGlassIgnoreRule_17_2_testcorematchandDECs_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// 
			if (ImplGlassIgnoreRuleImpl
					.pattern_ImplGlassIgnoreRule_17_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBB(this,
							match, reqContainer)) {
				// 
				if (ImplGlassIgnoreRuleImpl
						.pattern_ImplGlassIgnoreRule_17_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(
								this, match)) {

					Object[] result5_black = ImplGlassIgnoreRuleImpl
							.pattern_ImplGlassIgnoreRule_17_5_Addmatchtoruleresult_blackBBBB(match, __performOperation,
									__result, isApplicableCC);
					if (result5_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match
								+ ", " + "[__performOperation] = " + __performOperation + ", " + "[__result] = "
								+ __result + ", " + "[isApplicableCC] = " + isApplicableCC + ".");
					}
					ImplGlassIgnoreRuleImpl.pattern_ImplGlassIgnoreRule_17_5_Addmatchtoruleresult_greenBBBB(match,
							__performOperation, __result, isApplicableCC);

				} else {
				}

			} else {
			}

		}
		return ImplGlassIgnoreRuleImpl.pattern_ImplGlassIgnoreRule_17_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_BWD_EMoflonEdge_0(EMoflonEdge _edge_cables) {

		Object[] result1_bindingAndBlack = ImplGlassIgnoreRuleImpl
				.pattern_ImplGlassIgnoreRule_18_1_preparereturnvalue_bindingAndBlackFFBF(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		EOperation isApplicableCC = (EOperation) result1_bindingAndBlack[3];
		Object[] result1_green = ImplGlassIgnoreRuleImpl.pattern_ImplGlassIgnoreRule_18_1_preparereturnvalue_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach 
		for (Object[] result2_black : ImplGlassIgnoreRuleImpl
				.pattern_ImplGlassIgnoreRule_18_2_testcorematchandDECs_blackFFB(_edge_cables)) {
			GlassFiberCable cable = (GlassFiberCable) result2_black[0];
			implementation.Container implContainer = (implementation.Container) result2_black[1];
			Object[] result2_green = ImplGlassIgnoreRuleImpl
					.pattern_ImplGlassIgnoreRule_18_2_testcorematchandDECs_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// 
			if (ImplGlassIgnoreRuleImpl
					.pattern_ImplGlassIgnoreRule_18_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBB(this,
							match, cable, implContainer)) {
				// 
				if (ImplGlassIgnoreRuleImpl
						.pattern_ImplGlassIgnoreRule_18_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(
								this, match)) {

					Object[] result5_black = ImplGlassIgnoreRuleImpl
							.pattern_ImplGlassIgnoreRule_18_5_Addmatchtoruleresult_blackBBBB(match, __performOperation,
									__result, isApplicableCC);
					if (result5_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match
								+ ", " + "[__performOperation] = " + __performOperation + ", " + "[__result] = "
								+ __result + ", " + "[isApplicableCC] = " + isApplicableCC + ".");
					}
					ImplGlassIgnoreRuleImpl.pattern_ImplGlassIgnoreRule_18_5_Addmatchtoruleresult_greenBBBB(match,
							__performOperation, __result, isApplicableCC);

				} else {
				}

			} else {
			}

		}
		return ImplGlassIgnoreRuleImpl.pattern_ImplGlassIgnoreRule_18_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AttributeConstraintsRuleResult checkAttributes_FWD(TripleMatch __tripleMatch) {
		AttributeConstraintsRuleResult ruleResult = org.moflon.tgg.runtime.RuntimeFactory.eINSTANCE
				.createAttributeConstraintsRuleResult();
		ruleResult.setRule("ImplGlassIgnoreRule");
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
		ruleResult.setRule("ImplGlassIgnoreRule");
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

		Object[] result1_black = ImplGlassIgnoreRuleImpl.pattern_ImplGlassIgnoreRule_21_1_prepare_blackB(this);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		Object[] result1_green = ImplGlassIgnoreRuleImpl.pattern_ImplGlassIgnoreRule_21_1_prepare_greenF();
		IsApplicableRuleResult result = (IsApplicableRuleResult) result1_green[0];

		Object[] result2_bindingAndBlack = ImplGlassIgnoreRuleImpl
				.pattern_ImplGlassIgnoreRule_21_2_matchsrctrgcontext_bindingAndBlackFFFBB(sourceMatch, targetMatch);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[sourceMatch] = " + sourceMatch
					+ ", " + "[targetMatch] = " + targetMatch + ".");
		}
		Container reqContainer = (Container) result2_bindingAndBlack[0];
		GlassFiberCable cable = (GlassFiberCable) result2_bindingAndBlack[1];
		implementation.Container implContainer = (implementation.Container) result2_bindingAndBlack[2];

		Object[] result3_bindingAndBlack = ImplGlassIgnoreRuleImpl
				.pattern_ImplGlassIgnoreRule_21_3_solvecsp_bindingAndBlackFBBBBBB(this, reqContainer, cable,
						implContainer, sourceMatch, targetMatch);
		if (result3_bindingAndBlack == null) {
			throw new RuntimeException(
					"Pattern matching failed." + " Variables: " + "[this] = " + this + ", " + "[reqContainer] = "
							+ reqContainer + ", " + "[cable] = " + cable + ", " + "[implContainer] = " + implContainer
							+ ", " + "[sourceMatch] = " + sourceMatch + ", " + "[targetMatch] = " + targetMatch + ".");
		}
		CSP csp = (CSP) result3_bindingAndBlack[0];
		// 
		if (ImplGlassIgnoreRuleImpl.pattern_ImplGlassIgnoreRule_21_4_checkCSP_expressionFB(csp)) {
			// ForEach 
			for (Object[] result5_black : ImplGlassIgnoreRuleImpl
					.pattern_ImplGlassIgnoreRule_21_5_matchcorrcontext_blackBBFBB(reqContainer, implContainer,
							sourceMatch, targetMatch)) {
				ReqContainerToImplContainer reqContainerToImplContainer = (ReqContainerToImplContainer) result5_black[2];
				Object[] result5_green = ImplGlassIgnoreRuleImpl
						.pattern_ImplGlassIgnoreRule_21_5_matchcorrcontext_greenBBBF(reqContainerToImplContainer,
								sourceMatch, targetMatch);
				CCMatch ccMatch = (CCMatch) result5_green[3];

				Object[] result6_black = ImplGlassIgnoreRuleImpl
						.pattern_ImplGlassIgnoreRule_21_6_createcorrespondence_blackBBBB(reqContainer, cable,
								implContainer, ccMatch);
				if (result6_black == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[reqContainer] = "
							+ reqContainer + ", " + "[cable] = " + cable + ", " + "[implContainer] = " + implContainer
							+ ", " + "[ccMatch] = " + ccMatch + ".");
				}

				Object[] result7_black = ImplGlassIgnoreRuleImpl
						.pattern_ImplGlassIgnoreRule_21_7_addtoreturnedresult_blackBB(result, ccMatch);
				if (result7_black == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[result] = " + result
							+ ", " + "[ccMatch] = " + ccMatch + ".");
				}
				ImplGlassIgnoreRuleImpl.pattern_ImplGlassIgnoreRule_21_7_addtoreturnedresult_greenBB(result, ccMatch);

			}

		} else {
		}
		return ImplGlassIgnoreRuleImpl.pattern_ImplGlassIgnoreRule_21_8_expressionFB(result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isApplicable_solveCsp_CC(Container reqContainer, GlassFiberCable cable,
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
	public boolean checkDEC_FWD(Container reqContainer) {// 
		Object[] result1_black = ImplGlassIgnoreRuleImpl
				.pattern_ImplGlassIgnoreRule_24_1_matchtggpattern_blackB(reqContainer);
		if (result1_black != null) {
			return ImplGlassIgnoreRuleImpl.pattern_ImplGlassIgnoreRule_24_2_expressionF();
		} else {
			return ImplGlassIgnoreRuleImpl.pattern_ImplGlassIgnoreRule_24_3_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean checkDEC_BWD(GlassFiberCable cable, implementation.Container implContainer) {// 
		Object[] result1_black = ImplGlassIgnoreRuleImpl.pattern_ImplGlassIgnoreRule_25_1_matchtggpattern_blackBB(cable,
				implContainer);
		if (result1_black != null) {
			return ImplGlassIgnoreRuleImpl.pattern_ImplGlassIgnoreRule_25_2_expressionF();
		} else {
			return ImplGlassIgnoreRuleImpl.pattern_ImplGlassIgnoreRule_25_3_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModelgeneratorRuleResult generateModel(RuleEntryContainer ruleEntryContainer,
			ReqContainerToImplContainer reqContainerToImplContainerParameter) {

		Object[] result1_black = ImplGlassIgnoreRuleImpl.pattern_ImplGlassIgnoreRule_26_1_createresult_blackB(this);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		Object[] result1_green = ImplGlassIgnoreRuleImpl.pattern_ImplGlassIgnoreRule_26_1_createresult_greenFF();
		IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result1_green[0];
		ModelgeneratorRuleResult ruleResult = (ModelgeneratorRuleResult) result1_green[1];

		// ForEach 
		for (Object[] result2_black : ImplGlassIgnoreRuleImpl
				.pattern_ImplGlassIgnoreRule_26_2_isapplicablecore_blackFFFFBB(ruleEntryContainer, ruleResult)) {
			//nothing RuleEntryList reqContainerToImplContainerList = (RuleEntryList) result2_black[0];
			Container reqContainer = (Container) result2_black[1];
			ReqContainerToImplContainer reqContainerToImplContainer = (ReqContainerToImplContainer) result2_black[2];
			implementation.Container implContainer = (implementation.Container) result2_black[3];

			Object[] result3_bindingAndBlack = ImplGlassIgnoreRuleImpl
					.pattern_ImplGlassIgnoreRule_26_3_solveCSP_bindingAndBlackFBBBBBB(this, isApplicableMatch,
							reqContainer, implContainer, reqContainerToImplContainer, ruleResult);
			if (result3_bindingAndBlack == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
						+ "[isApplicableMatch] = " + isApplicableMatch + ", " + "[reqContainer] = " + reqContainer
						+ ", " + "[implContainer] = " + implContainer + ", " + "[reqContainerToImplContainer] = "
						+ reqContainerToImplContainer + ", " + "[ruleResult] = " + ruleResult + ".");
			}
			CSP csp = (CSP) result3_bindingAndBlack[0];
			// 
			if (ImplGlassIgnoreRuleImpl.pattern_ImplGlassIgnoreRule_26_4_checkCSP_expressionFBB(this, csp)) {
				// 
				Object[] result5_black = ImplGlassIgnoreRuleImpl.pattern_ImplGlassIgnoreRule_26_5_checknacs_blackBBB(
						reqContainer, implContainer, reqContainerToImplContainer);
				if (result5_black != null) {

					Object[] result6_black = ImplGlassIgnoreRuleImpl.pattern_ImplGlassIgnoreRule_26_6_perform_blackBBBB(
							reqContainer, implContainer, reqContainerToImplContainer, ruleResult);
					if (result6_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[reqContainer] = "
								+ reqContainer + ", " + "[implContainer] = " + implContainer + ", "
								+ "[reqContainerToImplContainer] = " + reqContainerToImplContainer + ", "
								+ "[ruleResult] = " + ruleResult + ".");
					}
					ImplGlassIgnoreRuleImpl.pattern_ImplGlassIgnoreRule_26_6_perform_greenFBB(implContainer,
							ruleResult);
					//nothing GlassFiberCable cable = (GlassFiberCable) result6_green[0];

				} else {
				}

			} else {
			}

		}
		return ImplGlassIgnoreRuleImpl.pattern_ImplGlassIgnoreRule_26_7_expressionFB(ruleResult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP generateModel_solveCsp_BWD(IsApplicableMatch isApplicableMatch, Container reqContainer,
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
		isApplicableMatch.registerObject("reqContainer", reqContainer);
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
		case RulesPackage.IMPL_GLASS_IGNORE_RULE___IS_APPROPRIATE_FWD__MATCH_CONTAINER:
			return isAppropriate_FWD((Match) arguments.get(0), (Container) arguments.get(1));
		case RulesPackage.IMPL_GLASS_IGNORE_RULE___PERFORM_FWD__ISAPPLICABLEMATCH:
			return perform_FWD((IsApplicableMatch) arguments.get(0));
		case RulesPackage.IMPL_GLASS_IGNORE_RULE___IS_APPLICABLE_FWD__MATCH:
			return isApplicable_FWD((Match) arguments.get(0));
		case RulesPackage.IMPL_GLASS_IGNORE_RULE___REGISTER_OBJECTS_TO_MATCH_FWD__MATCH_CONTAINER:
			registerObjectsToMatch_FWD((Match) arguments.get(0), (Container) arguments.get(1));
			return null;
		case RulesPackage.IMPL_GLASS_IGNORE_RULE___IS_APPROPRIATE_SOLVE_CSP_FWD__MATCH_CONTAINER:
			return isAppropriate_solveCsp_FWD((Match) arguments.get(0), (Container) arguments.get(1));
		case RulesPackage.IMPL_GLASS_IGNORE_RULE___IS_APPROPRIATE_CHECK_CSP_FWD__CSP:
			return isAppropriate_checkCsp_FWD((CSP) arguments.get(0));
		case RulesPackage.IMPL_GLASS_IGNORE_RULE___CHECK_TYPES_FWD__MATCH:
			return checkTypes_FWD((Match) arguments.get(0));
		case RulesPackage.IMPL_GLASS_IGNORE_RULE___IS_APPROPRIATE_BWD__MATCH_GLASSFIBERCABLE_CONTAINER:
			return isAppropriate_BWD((Match) arguments.get(0), (GlassFiberCable) arguments.get(1),
					(implementation.Container) arguments.get(2));
		case RulesPackage.IMPL_GLASS_IGNORE_RULE___PERFORM_BWD__ISAPPLICABLEMATCH:
			return perform_BWD((IsApplicableMatch) arguments.get(0));
		case RulesPackage.IMPL_GLASS_IGNORE_RULE___IS_APPLICABLE_BWD__MATCH:
			return isApplicable_BWD((Match) arguments.get(0));
		case RulesPackage.IMPL_GLASS_IGNORE_RULE___REGISTER_OBJECTS_TO_MATCH_BWD__MATCH_GLASSFIBERCABLE_CONTAINER:
			registerObjectsToMatch_BWD((Match) arguments.get(0), (GlassFiberCable) arguments.get(1),
					(implementation.Container) arguments.get(2));
			return null;
		case RulesPackage.IMPL_GLASS_IGNORE_RULE___IS_APPROPRIATE_SOLVE_CSP_BWD__MATCH_GLASSFIBERCABLE_CONTAINER:
			return isAppropriate_solveCsp_BWD((Match) arguments.get(0), (GlassFiberCable) arguments.get(1),
					(implementation.Container) arguments.get(2));
		case RulesPackage.IMPL_GLASS_IGNORE_RULE___IS_APPROPRIATE_CHECK_CSP_BWD__CSP:
			return isAppropriate_checkCsp_BWD((CSP) arguments.get(0));
		case RulesPackage.IMPL_GLASS_IGNORE_RULE___IS_APPLICABLE_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_CONTAINER_GLASSFIBERCABLE_CONTAINER_REQCONTAINERTOIMPLCONTAINER:
			return isApplicable_solveCsp_BWD((IsApplicableMatch) arguments.get(0), (Container) arguments.get(1),
					(GlassFiberCable) arguments.get(2), (implementation.Container) arguments.get(3),
					(ReqContainerToImplContainer) arguments.get(4));
		case RulesPackage.IMPL_GLASS_IGNORE_RULE___IS_APPLICABLE_CHECK_CSP_BWD__CSP:
			return isApplicable_checkCsp_BWD((CSP) arguments.get(0));
		case RulesPackage.IMPL_GLASS_IGNORE_RULE___REGISTER_OBJECTS_BWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT:
			registerObjects_BWD((PerformRuleResult) arguments.get(0), (EObject) arguments.get(1),
					(EObject) arguments.get(2), (EObject) arguments.get(3), (EObject) arguments.get(4));
			return null;
		case RulesPackage.IMPL_GLASS_IGNORE_RULE___CHECK_TYPES_BWD__MATCH:
			return checkTypes_BWD((Match) arguments.get(0));
		case RulesPackage.IMPL_GLASS_IGNORE_RULE___IS_APPROPRIATE_FWD_CONTAINER_0__CONTAINER:
			return isAppropriate_FWD_Container_0((Container) arguments.get(0));
		case RulesPackage.IMPL_GLASS_IGNORE_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_0__EMOFLONEDGE:
			return isAppropriate_BWD_EMoflonEdge_0((EMoflonEdge) arguments.get(0));
		case RulesPackage.IMPL_GLASS_IGNORE_RULE___CHECK_ATTRIBUTES_FWD__TRIPLEMATCH:
			return checkAttributes_FWD((TripleMatch) arguments.get(0));
		case RulesPackage.IMPL_GLASS_IGNORE_RULE___CHECK_ATTRIBUTES_BWD__TRIPLEMATCH:
			return checkAttributes_BWD((TripleMatch) arguments.get(0));
		case RulesPackage.IMPL_GLASS_IGNORE_RULE___IS_APPLICABLE_CC__MATCH_MATCH:
			return isApplicable_CC((Match) arguments.get(0), (Match) arguments.get(1));
		case RulesPackage.IMPL_GLASS_IGNORE_RULE___IS_APPLICABLE_SOLVE_CSP_CC__CONTAINER_GLASSFIBERCABLE_CONTAINER_MATCH_MATCH:
			return isApplicable_solveCsp_CC((Container) arguments.get(0), (GlassFiberCable) arguments.get(1),
					(implementation.Container) arguments.get(2), (Match) arguments.get(3), (Match) arguments.get(4));
		case RulesPackage.IMPL_GLASS_IGNORE_RULE___IS_APPLICABLE_CHECK_CSP_CC__CSP:
			return isApplicable_checkCsp_CC((CSP) arguments.get(0));
		case RulesPackage.IMPL_GLASS_IGNORE_RULE___CHECK_DEC_FWD__CONTAINER:
			return checkDEC_FWD((Container) arguments.get(0));
		case RulesPackage.IMPL_GLASS_IGNORE_RULE___CHECK_DEC_BWD__GLASSFIBERCABLE_CONTAINER:
			return checkDEC_BWD((GlassFiberCable) arguments.get(0), (implementation.Container) arguments.get(1));
		case RulesPackage.IMPL_GLASS_IGNORE_RULE___GENERATE_MODEL__RULEENTRYCONTAINER_REQCONTAINERTOIMPLCONTAINER:
			return generateModel((RuleEntryContainer) arguments.get(0), (ReqContainerToImplContainer) arguments.get(1));
		case RulesPackage.IMPL_GLASS_IGNORE_RULE___GENERATE_MODEL_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_CONTAINER_CONTAINER_REQCONTAINERTOIMPLCONTAINER_MODELGENERATORRULERESULT:
			return generateModel_solveCsp_BWD((IsApplicableMatch) arguments.get(0), (Container) arguments.get(1),
					(implementation.Container) arguments.get(2), (ReqContainerToImplContainer) arguments.get(3),
					(ModelgeneratorRuleResult) arguments.get(4));
		case RulesPackage.IMPL_GLASS_IGNORE_RULE___GENERATE_MODEL_CHECK_CSP_BWD__CSP:
			return generateModel_checkCsp_BWD((CSP) arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
	}

	public static final Object[] pattern_ImplGlassIgnoreRule_0_1_initialbindings_blackBBB(ImplGlassIgnoreRule _this,
			Match match, Container reqContainer) {
		return new Object[] { _this, match, reqContainer };
	}

	public static final Object[] pattern_ImplGlassIgnoreRule_0_2_SolveCSP_bindingFBBB(ImplGlassIgnoreRule _this,
			Match match, Container reqContainer) {
		CSP _localVariable_0 = _this.isAppropriate_solveCsp_FWD(match, reqContainer);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, match, reqContainer };
		}
		return null;
	}

	public static final Object[] pattern_ImplGlassIgnoreRule_0_2_SolveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_ImplGlassIgnoreRule_0_2_SolveCSP_bindingAndBlackFBBB(ImplGlassIgnoreRule _this,
			Match match, Container reqContainer) {
		Object[] result_pattern_ImplGlassIgnoreRule_0_2_SolveCSP_binding = pattern_ImplGlassIgnoreRule_0_2_SolveCSP_bindingFBBB(
				_this, match, reqContainer);
		if (result_pattern_ImplGlassIgnoreRule_0_2_SolveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_ImplGlassIgnoreRule_0_2_SolveCSP_binding[0];

			Object[] result_pattern_ImplGlassIgnoreRule_0_2_SolveCSP_black = pattern_ImplGlassIgnoreRule_0_2_SolveCSP_blackB(
					csp);
			if (result_pattern_ImplGlassIgnoreRule_0_2_SolveCSP_black != null) {

				return new Object[] { csp, _this, match, reqContainer };
			}
		}
		return null;
	}

	public static final boolean pattern_ImplGlassIgnoreRule_0_3_CheckCSP_expressionFBB(ImplGlassIgnoreRule _this,
			CSP csp) {
		boolean _localVariable_0 = _this.isAppropriate_checkCsp_FWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_ImplGlassIgnoreRule_0_4_collectelementstobetranslated_blackBB(Match match,
			Container reqContainer) {
		return new Object[] { match, reqContainer };
	}

	public static final Object[] pattern_ImplGlassIgnoreRule_0_5_collectcontextelements_blackBB(Match match,
			Container reqContainer) {
		return new Object[] { match, reqContainer };
	}

	public static final Object[] pattern_ImplGlassIgnoreRule_0_5_collectcontextelements_greenBB(Match match,
			Container reqContainer) {
		match.getContextNodes().add(reqContainer);
		return new Object[] { match, reqContainer };
	}

	public static final void pattern_ImplGlassIgnoreRule_0_6_registerobjectstomatch_expressionBBB(
			ImplGlassIgnoreRule _this, Match match, Container reqContainer) {
		_this.registerObjectsToMatch_FWD(match, reqContainer);

	}

	public static final boolean pattern_ImplGlassIgnoreRule_0_7_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_ImplGlassIgnoreRule_0_8_expressionF() {
		boolean _result = Boolean.valueOf(false);
		return _result;
	}

	public static final Object[] pattern_ImplGlassIgnoreRule_7_1_initialbindings_blackBBBB(ImplGlassIgnoreRule _this,
			Match match, GlassFiberCable cable, implementation.Container implContainer) {
		return new Object[] { _this, match, cable, implContainer };
	}

	public static final Object[] pattern_ImplGlassIgnoreRule_7_2_SolveCSP_bindingFBBBB(ImplGlassIgnoreRule _this,
			Match match, GlassFiberCable cable, implementation.Container implContainer) {
		CSP _localVariable_0 = _this.isAppropriate_solveCsp_BWD(match, cable, implContainer);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, match, cable, implContainer };
		}
		return null;
	}

	public static final Object[] pattern_ImplGlassIgnoreRule_7_2_SolveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_ImplGlassIgnoreRule_7_2_SolveCSP_bindingAndBlackFBBBB(
			ImplGlassIgnoreRule _this, Match match, GlassFiberCable cable, implementation.Container implContainer) {
		Object[] result_pattern_ImplGlassIgnoreRule_7_2_SolveCSP_binding = pattern_ImplGlassIgnoreRule_7_2_SolveCSP_bindingFBBBB(
				_this, match, cable, implContainer);
		if (result_pattern_ImplGlassIgnoreRule_7_2_SolveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_ImplGlassIgnoreRule_7_2_SolveCSP_binding[0];

			Object[] result_pattern_ImplGlassIgnoreRule_7_2_SolveCSP_black = pattern_ImplGlassIgnoreRule_7_2_SolveCSP_blackB(
					csp);
			if (result_pattern_ImplGlassIgnoreRule_7_2_SolveCSP_black != null) {

				return new Object[] { csp, _this, match, cable, implContainer };
			}
		}
		return null;
	}

	public static final boolean pattern_ImplGlassIgnoreRule_7_3_CheckCSP_expressionFBB(ImplGlassIgnoreRule _this,
			CSP csp) {
		boolean _localVariable_0 = _this.isAppropriate_checkCsp_BWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_ImplGlassIgnoreRule_7_4_collectelementstobetranslated_blackBBB(Match match,
			GlassFiberCable cable, implementation.Container implContainer) {
		return new Object[] { match, cable, implContainer };
	}

	public static final Object[] pattern_ImplGlassIgnoreRule_7_4_collectelementstobetranslated_greenBBBF(Match match,
			GlassFiberCable cable, implementation.Container implContainer) {
		EMoflonEdge implContainer__cable____cables = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		match.getToBeTranslatedNodes().add(cable);
		String implContainer__cable____cables_name_prime = "cables";
		implContainer__cable____cables.setSrc(implContainer);
		implContainer__cable____cables.setTrg(cable);
		match.getToBeTranslatedEdges().add(implContainer__cable____cables);
		implContainer__cable____cables.setName(implContainer__cable____cables_name_prime);
		return new Object[] { match, cable, implContainer, implContainer__cable____cables };
	}

	public static final Object[] pattern_ImplGlassIgnoreRule_7_5_collectcontextelements_blackBBB(Match match,
			GlassFiberCable cable, implementation.Container implContainer) {
		return new Object[] { match, cable, implContainer };
	}

	public static final Object[] pattern_ImplGlassIgnoreRule_7_5_collectcontextelements_greenBB(Match match,
			implementation.Container implContainer) {
		match.getContextNodes().add(implContainer);
		return new Object[] { match, implContainer };
	}

	public static final void pattern_ImplGlassIgnoreRule_7_6_registerobjectstomatch_expressionBBBB(
			ImplGlassIgnoreRule _this, Match match, GlassFiberCable cable, implementation.Container implContainer) {
		_this.registerObjectsToMatch_BWD(match, cable, implContainer);

	}

	public static final boolean pattern_ImplGlassIgnoreRule_7_7_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_ImplGlassIgnoreRule_7_8_expressionF() {
		boolean _result = Boolean.valueOf(false);
		return _result;
	}

	public static final Object[] pattern_ImplGlassIgnoreRule_8_1_performtransformation_bindingFFFFB(
			IsApplicableMatch isApplicableMatch) {
		EObject _localVariable_0 = isApplicableMatch.getObject("reqContainer");
		EObject _localVariable_1 = isApplicableMatch.getObject("cable");
		EObject _localVariable_2 = isApplicableMatch.getObject("implContainer");
		EObject _localVariable_3 = isApplicableMatch.getObject("reqContainerToImplContainer");
		EObject tmpReqContainer = _localVariable_0;
		EObject tmpCable = _localVariable_1;
		EObject tmpImplContainer = _localVariable_2;
		EObject tmpReqContainerToImplContainer = _localVariable_3;
		if (tmpReqContainer instanceof Container) {
			Container reqContainer = (Container) tmpReqContainer;
			if (tmpCable instanceof GlassFiberCable) {
				GlassFiberCable cable = (GlassFiberCable) tmpCable;
				if (tmpImplContainer instanceof implementation.Container) {
					implementation.Container implContainer = (implementation.Container) tmpImplContainer;
					if (tmpReqContainerToImplContainer instanceof ReqContainerToImplContainer) {
						ReqContainerToImplContainer reqContainerToImplContainer = (ReqContainerToImplContainer) tmpReqContainerToImplContainer;
						return new Object[] { reqContainer, cable, implContainer, reqContainerToImplContainer,
								isApplicableMatch };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_ImplGlassIgnoreRule_8_1_performtransformation_blackBBBBFBB(
			Container reqContainer, GlassFiberCable cable, implementation.Container implContainer,
			ReqContainerToImplContainer reqContainerToImplContainer, ImplGlassIgnoreRule _this,
			IsApplicableMatch isApplicableMatch) {
		for (EObject tmpCsp : isApplicableMatch.getAttributeInfo()) {
			if (tmpCsp instanceof CSP) {
				CSP csp = (CSP) tmpCsp;
				return new Object[] { reqContainer, cable, implContainer, reqContainerToImplContainer, csp, _this,
						isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_ImplGlassIgnoreRule_8_1_performtransformation_bindingAndBlackFFFFFBB(
			ImplGlassIgnoreRule _this, IsApplicableMatch isApplicableMatch) {
		Object[] result_pattern_ImplGlassIgnoreRule_8_1_performtransformation_binding = pattern_ImplGlassIgnoreRule_8_1_performtransformation_bindingFFFFB(
				isApplicableMatch);
		if (result_pattern_ImplGlassIgnoreRule_8_1_performtransformation_binding != null) {
			Container reqContainer = (Container) result_pattern_ImplGlassIgnoreRule_8_1_performtransformation_binding[0];
			GlassFiberCable cable = (GlassFiberCable) result_pattern_ImplGlassIgnoreRule_8_1_performtransformation_binding[1];
			implementation.Container implContainer = (implementation.Container) result_pattern_ImplGlassIgnoreRule_8_1_performtransformation_binding[2];
			ReqContainerToImplContainer reqContainerToImplContainer = (ReqContainerToImplContainer) result_pattern_ImplGlassIgnoreRule_8_1_performtransformation_binding[3];

			Object[] result_pattern_ImplGlassIgnoreRule_8_1_performtransformation_black = pattern_ImplGlassIgnoreRule_8_1_performtransformation_blackBBBBFBB(
					reqContainer, cable, implContainer, reqContainerToImplContainer, _this, isApplicableMatch);
			if (result_pattern_ImplGlassIgnoreRule_8_1_performtransformation_black != null) {
				CSP csp = (CSP) result_pattern_ImplGlassIgnoreRule_8_1_performtransformation_black[4];

				return new Object[] { reqContainer, cable, implContainer, reqContainerToImplContainer, csp, _this,
						isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_ImplGlassIgnoreRule_8_2_collecttranslatedelements_blackB(
			GlassFiberCable cable) {
		return new Object[] { cable };
	}

	public static final Object[] pattern_ImplGlassIgnoreRule_8_2_collecttranslatedelements_greenFB(
			GlassFiberCable cable) {
		PerformRuleResult ruleresult = RuntimeFactory.eINSTANCE.createPerformRuleResult();
		ruleresult.getTranslatedElements().add(cable);
		return new Object[] { ruleresult, cable };
	}

	public static final Object[] pattern_ImplGlassIgnoreRule_8_3_bookkeepingforedges_blackBBBBB(
			PerformRuleResult ruleresult, EObject reqContainer, EObject cable, EObject implContainer,
			EObject reqContainerToImplContainer) {
		if (!reqContainer.equals(reqContainerToImplContainer)) {
			if (!cable.equals(reqContainer)) {
				if (!cable.equals(implContainer)) {
					if (!cable.equals(reqContainerToImplContainer)) {
						if (!implContainer.equals(reqContainer)) {
							if (!implContainer.equals(reqContainerToImplContainer)) {
								return new Object[] { ruleresult, reqContainer, cable, implContainer,
										reqContainerToImplContainer };
							}
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_ImplGlassIgnoreRule_8_3_bookkeepingforedges_greenBBBF(
			PerformRuleResult ruleresult, EObject cable, EObject implContainer) {
		EMoflonEdge implContainer__cable____cables = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String ruleresult_ruleName_prime = "ImplGlassIgnoreRule";
		String implContainer__cable____cables_name_prime = "cables";
		implContainer__cable____cables.setSrc(implContainer);
		implContainer__cable____cables.setTrg(cable);
		ruleresult.getTranslatedEdges().add(implContainer__cable____cables);
		ruleresult.setRuleName(ruleresult_ruleName_prime);
		implContainer__cable____cables.setName(implContainer__cable____cables_name_prime);
		return new Object[] { ruleresult, cable, implContainer, implContainer__cable____cables };
	}

	public static final void pattern_ImplGlassIgnoreRule_8_5_registerobjects_expressionBBBBBB(ImplGlassIgnoreRule _this,
			PerformRuleResult ruleresult, EObject reqContainer, EObject cable, EObject implContainer,
			EObject reqContainerToImplContainer) {
		_this.registerObjects_BWD(ruleresult, reqContainer, cable, implContainer, reqContainerToImplContainer);

	}

	public static final PerformRuleResult pattern_ImplGlassIgnoreRule_8_6_expressionFB(PerformRuleResult ruleresult) {
		PerformRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_ImplGlassIgnoreRule_9_1_preparereturnvalue_bindingFB(
			ImplGlassIgnoreRule _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass eClass = _localVariable_0;
		if (eClass != null) {
			return new Object[] { eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_ImplGlassIgnoreRule_9_1_preparereturnvalue_blackFBB(EClass eClass,
			ImplGlassIgnoreRule _this) {
		for (EOperation performOperation : eClass.getEOperations()) {
			String performOperation_name = performOperation.getName();
			if (performOperation_name.equals("perform_BWD")) {
				return new Object[] { performOperation, eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_ImplGlassIgnoreRule_9_1_preparereturnvalue_bindingAndBlackFFB(
			ImplGlassIgnoreRule _this) {
		Object[] result_pattern_ImplGlassIgnoreRule_9_1_preparereturnvalue_binding = pattern_ImplGlassIgnoreRule_9_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_ImplGlassIgnoreRule_9_1_preparereturnvalue_binding != null) {
			EClass eClass = (EClass) result_pattern_ImplGlassIgnoreRule_9_1_preparereturnvalue_binding[0];

			Object[] result_pattern_ImplGlassIgnoreRule_9_1_preparereturnvalue_black = pattern_ImplGlassIgnoreRule_9_1_preparereturnvalue_blackFBB(
					eClass, _this);
			if (result_pattern_ImplGlassIgnoreRule_9_1_preparereturnvalue_black != null) {
				EOperation performOperation = (EOperation) result_pattern_ImplGlassIgnoreRule_9_1_preparereturnvalue_black[0];

				return new Object[] { performOperation, eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_ImplGlassIgnoreRule_9_1_preparereturnvalue_greenBF(
			EOperation performOperation) {
		IsApplicableRuleResult ruleresult = RuntimeFactory.eINSTANCE.createIsApplicableRuleResult();
		boolean ruleresult_success_prime = Boolean.valueOf(false);
		String ruleresult_rule_prime = "ImplGlassIgnoreRule";
		ruleresult.setPerformOperation(performOperation);
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		ruleresult.setRule(ruleresult_rule_prime);
		return new Object[] { performOperation, ruleresult };
	}

	public static final Object[] pattern_ImplGlassIgnoreRule_9_2_corematch_bindingFFB(Match match) {
		EObject _localVariable_0 = match.getObject("cable");
		EObject _localVariable_1 = match.getObject("implContainer");
		EObject tmpCable = _localVariable_0;
		EObject tmpImplContainer = _localVariable_1;
		if (tmpCable instanceof GlassFiberCable) {
			GlassFiberCable cable = (GlassFiberCable) tmpCable;
			if (tmpImplContainer instanceof implementation.Container) {
				implementation.Container implContainer = (implementation.Container) tmpImplContainer;
				return new Object[] { cable, implContainer, match };
			}
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_ImplGlassIgnoreRule_9_2_corematch_blackFBBFB(GlassFiberCable cable,
			implementation.Container implContainer, Match match) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		for (ReqContainerToImplContainer reqContainerToImplContainer : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(implContainer, ReqContainerToImplContainer.class, "target")) {
			Container reqContainer = reqContainerToImplContainer.getSource();
			if (reqContainer != null) {
				_result.add(new Object[] { reqContainer, cable, implContainer, reqContainerToImplContainer, match });
			}

		}
		return _result;
	}

	public static final Iterable<Object[]> pattern_ImplGlassIgnoreRule_9_3_findcontext_blackBBBB(Container reqContainer,
			GlassFiberCable cable, implementation.Container implContainer,
			ReqContainerToImplContainer reqContainerToImplContainer) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (implContainer.getCables().contains(cable)) {
			if (reqContainer.equals(reqContainerToImplContainer.getSource())) {
				if (implContainer.equals(reqContainerToImplContainer.getTarget())) {
					_result.add(new Object[] { reqContainer, cable, implContainer, reqContainerToImplContainer });
				}
			}
		}
		return _result;
	}

	public static final Object[] pattern_ImplGlassIgnoreRule_9_3_findcontext_greenBBBBFFFF(Container reqContainer,
			GlassFiberCable cable, implementation.Container implContainer,
			ReqContainerToImplContainer reqContainerToImplContainer) {
		IsApplicableMatch isApplicableMatch = RuntimeFactory.eINSTANCE.createIsApplicableMatch();
		EMoflonEdge implContainer__cable____cables = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge reqContainerToImplContainer__reqContainer____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge reqContainerToImplContainer__implContainer____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String implContainer__cable____cables_name_prime = "cables";
		String reqContainerToImplContainer__reqContainer____source_name_prime = "source";
		String reqContainerToImplContainer__implContainer____target_name_prime = "target";
		isApplicableMatch.getAllContextElements().add(reqContainer);
		isApplicableMatch.getAllContextElements().add(cable);
		isApplicableMatch.getAllContextElements().add(implContainer);
		isApplicableMatch.getAllContextElements().add(reqContainerToImplContainer);
		implContainer__cable____cables.setSrc(implContainer);
		implContainer__cable____cables.setTrg(cable);
		isApplicableMatch.getAllContextElements().add(implContainer__cable____cables);
		reqContainerToImplContainer__reqContainer____source.setSrc(reqContainerToImplContainer);
		reqContainerToImplContainer__reqContainer____source.setTrg(reqContainer);
		isApplicableMatch.getAllContextElements().add(reqContainerToImplContainer__reqContainer____source);
		reqContainerToImplContainer__implContainer____target.setSrc(reqContainerToImplContainer);
		reqContainerToImplContainer__implContainer____target.setTrg(implContainer);
		isApplicableMatch.getAllContextElements().add(reqContainerToImplContainer__implContainer____target);
		implContainer__cable____cables.setName(implContainer__cable____cables_name_prime);
		reqContainerToImplContainer__reqContainer____source
				.setName(reqContainerToImplContainer__reqContainer____source_name_prime);
		reqContainerToImplContainer__implContainer____target
				.setName(reqContainerToImplContainer__implContainer____target_name_prime);
		return new Object[] { reqContainer, cable, implContainer, reqContainerToImplContainer, isApplicableMatch,
				implContainer__cable____cables, reqContainerToImplContainer__reqContainer____source,
				reqContainerToImplContainer__implContainer____target };
	}

	public static final Object[] pattern_ImplGlassIgnoreRule_9_4_solveCSP_bindingFBBBBBB(ImplGlassIgnoreRule _this,
			IsApplicableMatch isApplicableMatch, Container reqContainer, GlassFiberCable cable,
			implementation.Container implContainer, ReqContainerToImplContainer reqContainerToImplContainer) {
		CSP _localVariable_0 = _this.isApplicable_solveCsp_BWD(isApplicableMatch, reqContainer, cable, implContainer,
				reqContainerToImplContainer);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, reqContainer, cable, implContainer,
					reqContainerToImplContainer };
		}
		return null;
	}

	public static final Object[] pattern_ImplGlassIgnoreRule_9_4_solveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_ImplGlassIgnoreRule_9_4_solveCSP_bindingAndBlackFBBBBBB(
			ImplGlassIgnoreRule _this, IsApplicableMatch isApplicableMatch, Container reqContainer,
			GlassFiberCable cable, implementation.Container implContainer,
			ReqContainerToImplContainer reqContainerToImplContainer) {
		Object[] result_pattern_ImplGlassIgnoreRule_9_4_solveCSP_binding = pattern_ImplGlassIgnoreRule_9_4_solveCSP_bindingFBBBBBB(
				_this, isApplicableMatch, reqContainer, cable, implContainer, reqContainerToImplContainer);
		if (result_pattern_ImplGlassIgnoreRule_9_4_solveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_ImplGlassIgnoreRule_9_4_solveCSP_binding[0];

			Object[] result_pattern_ImplGlassIgnoreRule_9_4_solveCSP_black = pattern_ImplGlassIgnoreRule_9_4_solveCSP_blackB(
					csp);
			if (result_pattern_ImplGlassIgnoreRule_9_4_solveCSP_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, reqContainer, cable, implContainer,
						reqContainerToImplContainer };
			}
		}
		return null;
	}

	public static final boolean pattern_ImplGlassIgnoreRule_9_5_checkCSP_expressionFBB(ImplGlassIgnoreRule _this,
			CSP csp) {
		boolean _localVariable_0 = _this.isApplicable_checkCsp_BWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_ImplGlassIgnoreRule_9_6_addmatchtoruleresult_blackBB(
			IsApplicableRuleResult ruleresult, IsApplicableMatch isApplicableMatch) {
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final Object[] pattern_ImplGlassIgnoreRule_9_6_addmatchtoruleresult_greenBB(
			IsApplicableRuleResult ruleresult, IsApplicableMatch isApplicableMatch) {
		ruleresult.getIsApplicableMatch().add(isApplicableMatch);
		boolean ruleresult_success_prime = Boolean.valueOf(true);
		String isApplicableMatch_ruleName_prime = "ImplGlassIgnoreRule";
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		isApplicableMatch.setRuleName(isApplicableMatch_ruleName_prime);
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final IsApplicableRuleResult pattern_ImplGlassIgnoreRule_9_7_expressionFB(
			IsApplicableRuleResult ruleresult) {
		IsApplicableRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_ImplGlassIgnoreRule_17_1_preparereturnvalue_bindingFB(
			ImplGlassIgnoreRule _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_ImplGlassIgnoreRule_17_1_preparereturnvalue_blackFBBF(EClass __eClass,
			ImplGlassIgnoreRule _this) {
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

	public static final Object[] pattern_ImplGlassIgnoreRule_17_1_preparereturnvalue_bindingAndBlackFFBF(
			ImplGlassIgnoreRule _this) {
		Object[] result_pattern_ImplGlassIgnoreRule_17_1_preparereturnvalue_binding = pattern_ImplGlassIgnoreRule_17_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_ImplGlassIgnoreRule_17_1_preparereturnvalue_binding != null) {
			EClass __eClass = (EClass) result_pattern_ImplGlassIgnoreRule_17_1_preparereturnvalue_binding[0];

			Object[] result_pattern_ImplGlassIgnoreRule_17_1_preparereturnvalue_black = pattern_ImplGlassIgnoreRule_17_1_preparereturnvalue_blackFBBF(
					__eClass, _this);
			if (result_pattern_ImplGlassIgnoreRule_17_1_preparereturnvalue_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_ImplGlassIgnoreRule_17_1_preparereturnvalue_black[0];
				EOperation isApplicableCC = (EOperation) result_pattern_ImplGlassIgnoreRule_17_1_preparereturnvalue_black[3];

				return new Object[] { __performOperation, __eClass, _this, isApplicableCC };
			}
		}
		return null;
	}

	public static final Object[] pattern_ImplGlassIgnoreRule_17_1_preparereturnvalue_greenF() {
		EObjectContainer __result = RuntimeFactory.eINSTANCE.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Iterable<Object[]> pattern_ImplGlassIgnoreRule_17_2_testcorematchandDECs_blackB(
			Container reqContainer) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		_result.add(new Object[] { reqContainer });
		return _result;
	}

	public static final Object[] pattern_ImplGlassIgnoreRule_17_2_testcorematchandDECs_greenFB(EClass __eClass) {
		Match match = RuntimeFactory.eINSTANCE.createMatch();
		String __eClass_name = __eClass.getName();
		String match_ruleName_prime = __eClass_name;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_ImplGlassIgnoreRule_17_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBB(
			ImplGlassIgnoreRule _this, Match match, Container reqContainer) {
		boolean _localVariable_0 = _this.isAppropriate_FWD(match, reqContainer);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_ImplGlassIgnoreRule_17_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(
			ImplGlassIgnoreRule _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_FWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_ImplGlassIgnoreRule_17_5_Addmatchtoruleresult_blackBBBB(Match match,
			EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		if (!__performOperation.equals(isApplicableCC)) {
			return new Object[] { match, __performOperation, __result, isApplicableCC };
		}
		return null;
	}

	public static final Object[] pattern_ImplGlassIgnoreRule_17_5_Addmatchtoruleresult_greenBBBB(Match match,
			EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		match.setIsApplicableCCOperation(isApplicableCC);
		return new Object[] { match, __performOperation, __result, isApplicableCC };
	}

	public static final EObjectContainer pattern_ImplGlassIgnoreRule_17_6_expressionFB(EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_ImplGlassIgnoreRule_18_1_preparereturnvalue_bindingFB(
			ImplGlassIgnoreRule _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_ImplGlassIgnoreRule_18_1_preparereturnvalue_blackFBBF(EClass __eClass,
			ImplGlassIgnoreRule _this) {
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

	public static final Object[] pattern_ImplGlassIgnoreRule_18_1_preparereturnvalue_bindingAndBlackFFBF(
			ImplGlassIgnoreRule _this) {
		Object[] result_pattern_ImplGlassIgnoreRule_18_1_preparereturnvalue_binding = pattern_ImplGlassIgnoreRule_18_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_ImplGlassIgnoreRule_18_1_preparereturnvalue_binding != null) {
			EClass __eClass = (EClass) result_pattern_ImplGlassIgnoreRule_18_1_preparereturnvalue_binding[0];

			Object[] result_pattern_ImplGlassIgnoreRule_18_1_preparereturnvalue_black = pattern_ImplGlassIgnoreRule_18_1_preparereturnvalue_blackFBBF(
					__eClass, _this);
			if (result_pattern_ImplGlassIgnoreRule_18_1_preparereturnvalue_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_ImplGlassIgnoreRule_18_1_preparereturnvalue_black[0];
				EOperation isApplicableCC = (EOperation) result_pattern_ImplGlassIgnoreRule_18_1_preparereturnvalue_black[3];

				return new Object[] { __performOperation, __eClass, _this, isApplicableCC };
			}
		}
		return null;
	}

	public static final Object[] pattern_ImplGlassIgnoreRule_18_1_preparereturnvalue_greenF() {
		EObjectContainer __result = RuntimeFactory.eINSTANCE.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Iterable<Object[]> pattern_ImplGlassIgnoreRule_18_2_testcorematchandDECs_blackFFB(
			EMoflonEdge _edge_cables) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		EObject tmpImplContainer = _edge_cables.getSrc();
		if (tmpImplContainer instanceof implementation.Container) {
			implementation.Container implContainer = (implementation.Container) tmpImplContainer;
			EObject tmpCable = _edge_cables.getTrg();
			if (tmpCable instanceof GlassFiberCable) {
				GlassFiberCable cable = (GlassFiberCable) tmpCable;
				if (implContainer.getCables().contains(cable)) {
					_result.add(new Object[] { cable, implContainer, _edge_cables });
				}
			}

		}

		return _result;
	}

	public static final Object[] pattern_ImplGlassIgnoreRule_18_2_testcorematchandDECs_greenFB(EClass __eClass) {
		Match match = RuntimeFactory.eINSTANCE.createMatch();
		String __eClass_name = __eClass.getName();
		String match_ruleName_prime = __eClass_name;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_ImplGlassIgnoreRule_18_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBB(
			ImplGlassIgnoreRule _this, Match match, GlassFiberCable cable, implementation.Container implContainer) {
		boolean _localVariable_0 = _this.isAppropriate_BWD(match, cable, implContainer);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_ImplGlassIgnoreRule_18_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(
			ImplGlassIgnoreRule _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_BWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_ImplGlassIgnoreRule_18_5_Addmatchtoruleresult_blackBBBB(Match match,
			EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		if (!__performOperation.equals(isApplicableCC)) {
			return new Object[] { match, __performOperation, __result, isApplicableCC };
		}
		return null;
	}

	public static final Object[] pattern_ImplGlassIgnoreRule_18_5_Addmatchtoruleresult_greenBBBB(Match match,
			EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		match.setIsApplicableCCOperation(isApplicableCC);
		return new Object[] { match, __performOperation, __result, isApplicableCC };
	}

	public static final EObjectContainer pattern_ImplGlassIgnoreRule_18_6_expressionFB(EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_ImplGlassIgnoreRule_21_1_prepare_blackB(ImplGlassIgnoreRule _this) {
		return new Object[] { _this };
	}

	public static final Object[] pattern_ImplGlassIgnoreRule_21_1_prepare_greenF() {
		IsApplicableRuleResult result = RuntimeFactory.eINSTANCE.createIsApplicableRuleResult();
		return new Object[] { result };
	}

	public static final Object[] pattern_ImplGlassIgnoreRule_21_2_matchsrctrgcontext_bindingFFFBB(Match sourceMatch,
			Match targetMatch) {
		EObject _localVariable_0 = sourceMatch.getObject("reqContainer");
		EObject _localVariable_1 = targetMatch.getObject("cable");
		EObject _localVariable_2 = targetMatch.getObject("implContainer");
		EObject tmpReqContainer = _localVariable_0;
		EObject tmpCable = _localVariable_1;
		EObject tmpImplContainer = _localVariable_2;
		if (tmpReqContainer instanceof Container) {
			Container reqContainer = (Container) tmpReqContainer;
			if (tmpCable instanceof GlassFiberCable) {
				GlassFiberCable cable = (GlassFiberCable) tmpCable;
				if (tmpImplContainer instanceof implementation.Container) {
					implementation.Container implContainer = (implementation.Container) tmpImplContainer;
					return new Object[] { reqContainer, cable, implContainer, sourceMatch, targetMatch };
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_ImplGlassIgnoreRule_21_2_matchsrctrgcontext_blackBBBBB(Container reqContainer,
			GlassFiberCable cable, implementation.Container implContainer, Match sourceMatch, Match targetMatch) {
		if (!sourceMatch.equals(targetMatch)) {
			return new Object[] { reqContainer, cable, implContainer, sourceMatch, targetMatch };
		}
		return null;
	}

	public static final Object[] pattern_ImplGlassIgnoreRule_21_2_matchsrctrgcontext_bindingAndBlackFFFBB(
			Match sourceMatch, Match targetMatch) {
		Object[] result_pattern_ImplGlassIgnoreRule_21_2_matchsrctrgcontext_binding = pattern_ImplGlassIgnoreRule_21_2_matchsrctrgcontext_bindingFFFBB(
				sourceMatch, targetMatch);
		if (result_pattern_ImplGlassIgnoreRule_21_2_matchsrctrgcontext_binding != null) {
			Container reqContainer = (Container) result_pattern_ImplGlassIgnoreRule_21_2_matchsrctrgcontext_binding[0];
			GlassFiberCable cable = (GlassFiberCable) result_pattern_ImplGlassIgnoreRule_21_2_matchsrctrgcontext_binding[1];
			implementation.Container implContainer = (implementation.Container) result_pattern_ImplGlassIgnoreRule_21_2_matchsrctrgcontext_binding[2];

			Object[] result_pattern_ImplGlassIgnoreRule_21_2_matchsrctrgcontext_black = pattern_ImplGlassIgnoreRule_21_2_matchsrctrgcontext_blackBBBBB(
					reqContainer, cable, implContainer, sourceMatch, targetMatch);
			if (result_pattern_ImplGlassIgnoreRule_21_2_matchsrctrgcontext_black != null) {

				return new Object[] { reqContainer, cable, implContainer, sourceMatch, targetMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_ImplGlassIgnoreRule_21_3_solvecsp_bindingFBBBBBB(ImplGlassIgnoreRule _this,
			Container reqContainer, GlassFiberCable cable, implementation.Container implContainer, Match sourceMatch,
			Match targetMatch) {
		CSP _localVariable_3 = _this.isApplicable_solveCsp_CC(reqContainer, cable, implContainer, sourceMatch,
				targetMatch);
		CSP csp = _localVariable_3;
		if (csp != null) {
			return new Object[] { csp, _this, reqContainer, cable, implContainer, sourceMatch, targetMatch };
		}
		return null;
	}

	public static final Object[] pattern_ImplGlassIgnoreRule_21_3_solvecsp_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_ImplGlassIgnoreRule_21_3_solvecsp_bindingAndBlackFBBBBBB(
			ImplGlassIgnoreRule _this, Container reqContainer, GlassFiberCable cable,
			implementation.Container implContainer, Match sourceMatch, Match targetMatch) {
		Object[] result_pattern_ImplGlassIgnoreRule_21_3_solvecsp_binding = pattern_ImplGlassIgnoreRule_21_3_solvecsp_bindingFBBBBBB(
				_this, reqContainer, cable, implContainer, sourceMatch, targetMatch);
		if (result_pattern_ImplGlassIgnoreRule_21_3_solvecsp_binding != null) {
			CSP csp = (CSP) result_pattern_ImplGlassIgnoreRule_21_3_solvecsp_binding[0];

			Object[] result_pattern_ImplGlassIgnoreRule_21_3_solvecsp_black = pattern_ImplGlassIgnoreRule_21_3_solvecsp_blackB(
					csp);
			if (result_pattern_ImplGlassIgnoreRule_21_3_solvecsp_black != null) {

				return new Object[] { csp, _this, reqContainer, cable, implContainer, sourceMatch, targetMatch };
			}
		}
		return null;
	}

	public static final boolean pattern_ImplGlassIgnoreRule_21_4_checkCSP_expressionFB(CSP csp) {
		boolean _localVariable_0 = csp.check();
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Iterable<Object[]> pattern_ImplGlassIgnoreRule_21_5_matchcorrcontext_blackBBFBB(
			Container reqContainer, implementation.Container implContainer, Match sourceMatch, Match targetMatch) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (!sourceMatch.equals(targetMatch)) {
			for (ReqContainerToImplContainer reqContainerToImplContainer : org.moflon.core.utilities.eMoflonEMFUtil
					.getOppositeReferenceTyped(reqContainer, ReqContainerToImplContainer.class, "source")) {
				if (implContainer.equals(reqContainerToImplContainer.getTarget())) {
					_result.add(new Object[] { reqContainer, implContainer, reqContainerToImplContainer, sourceMatch,
							targetMatch });
				}
			}
		}
		return _result;
	}

	public static final Object[] pattern_ImplGlassIgnoreRule_21_5_matchcorrcontext_greenBBBF(
			ReqContainerToImplContainer reqContainerToImplContainer, Match sourceMatch, Match targetMatch) {
		CCMatch ccMatch = RuntimeFactory.eINSTANCE.createCCMatch();
		String ccMatch_ruleName_prime = "ImplGlassIgnoreRule";
		ccMatch.setSourceMatch(sourceMatch);
		ccMatch.setTargetMatch(targetMatch);
		ccMatch.getAllContextElements().add(reqContainerToImplContainer);
		ccMatch.setRuleName(ccMatch_ruleName_prime);
		return new Object[] { reqContainerToImplContainer, sourceMatch, targetMatch, ccMatch };
	}

	public static final Object[] pattern_ImplGlassIgnoreRule_21_6_createcorrespondence_blackBBBB(Container reqContainer,
			GlassFiberCable cable, implementation.Container implContainer, CCMatch ccMatch) {
		return new Object[] { reqContainer, cable, implContainer, ccMatch };
	}

	public static final Object[] pattern_ImplGlassIgnoreRule_21_7_addtoreturnedresult_blackBB(
			IsApplicableRuleResult result, CCMatch ccMatch) {
		return new Object[] { result, ccMatch };
	}

	public static final Object[] pattern_ImplGlassIgnoreRule_21_7_addtoreturnedresult_greenBB(
			IsApplicableRuleResult result, CCMatch ccMatch) {
		result.getIsApplicableMatch().add(ccMatch);
		boolean result_success_prime = Boolean.valueOf(true);
		String ccMatch_ruleName_prime = "ImplGlassIgnoreRule";
		result.setSuccess(Boolean.valueOf(result_success_prime));
		ccMatch.setRuleName(ccMatch_ruleName_prime);
		return new Object[] { result, ccMatch };
	}

	public static final IsApplicableRuleResult pattern_ImplGlassIgnoreRule_21_8_expressionFB(
			IsApplicableRuleResult result) {
		IsApplicableRuleResult _result = result;
		return _result;
	}

	public static final Object[] pattern_ImplGlassIgnoreRule_24_1_matchtggpattern_blackB(Container reqContainer) {
		return new Object[] { reqContainer };
	}

	public static final boolean pattern_ImplGlassIgnoreRule_24_2_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_ImplGlassIgnoreRule_24_3_expressionF() {
		boolean _result = Boolean.valueOf(false);
		return _result;
	}

	public static final Object[] pattern_ImplGlassIgnoreRule_25_1_matchtggpattern_blackBB(GlassFiberCable cable,
			implementation.Container implContainer) {
		if (implContainer.getCables().contains(cable)) {
			return new Object[] { cable, implContainer };
		}
		return null;
	}

	public static final boolean pattern_ImplGlassIgnoreRule_25_2_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_ImplGlassIgnoreRule_25_3_expressionF() {
		boolean _result = Boolean.valueOf(false);
		return _result;
	}

	public static final Object[] pattern_ImplGlassIgnoreRule_26_1_createresult_blackB(ImplGlassIgnoreRule _this) {
		return new Object[] { _this };
	}

	public static final Object[] pattern_ImplGlassIgnoreRule_26_1_createresult_greenFF() {
		IsApplicableMatch isApplicableMatch = RuntimeFactory.eINSTANCE.createIsApplicableMatch();
		ModelgeneratorRuleResult ruleResult = RuntimeFactory.eINSTANCE.createModelgeneratorRuleResult();
		boolean ruleResult_success_prime = Boolean.valueOf(false);
		ruleResult.setSuccess(Boolean.valueOf(ruleResult_success_prime));
		return new Object[] { isApplicableMatch, ruleResult };
	}

	public static final Object[] pattern_ImplGlassIgnoreRule_26_2_isapplicablecore_black_nac_0BB(
			ModelgeneratorRuleResult ruleResult, Container reqContainer) {
		if (ruleResult.getSourceObjects().contains(reqContainer)) {
			return new Object[] { ruleResult, reqContainer };
		}
		return null;
	}

	public static final Object[] pattern_ImplGlassIgnoreRule_26_2_isapplicablecore_black_nac_1BB(
			ModelgeneratorRuleResult ruleResult, ReqContainerToImplContainer reqContainerToImplContainer) {
		if (ruleResult.getCorrObjects().contains(reqContainerToImplContainer)) {
			return new Object[] { ruleResult, reqContainerToImplContainer };
		}
		return null;
	}

	public static final Object[] pattern_ImplGlassIgnoreRule_26_2_isapplicablecore_black_nac_2BB(
			ModelgeneratorRuleResult ruleResult, implementation.Container implContainer) {
		if (ruleResult.getTargetObjects().contains(implContainer)) {
			return new Object[] { ruleResult, implContainer };
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_ImplGlassIgnoreRule_26_2_isapplicablecore_blackFFFFBB(
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
							if (pattern_ImplGlassIgnoreRule_26_2_isapplicablecore_black_nac_1BB(ruleResult,
									reqContainerToImplContainer) == null) {
								if (pattern_ImplGlassIgnoreRule_26_2_isapplicablecore_black_nac_0BB(ruleResult,
										reqContainer) == null) {
									if (pattern_ImplGlassIgnoreRule_26_2_isapplicablecore_black_nac_2BB(ruleResult,
											implContainer) == null) {
										_result.add(new Object[] { reqContainerToImplContainerList, reqContainer,
												reqContainerToImplContainer, implContainer, ruleEntryContainer,
												ruleResult });
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

	public static final Object[] pattern_ImplGlassIgnoreRule_26_3_solveCSP_bindingFBBBBBB(ImplGlassIgnoreRule _this,
			IsApplicableMatch isApplicableMatch, Container reqContainer, implementation.Container implContainer,
			ReqContainerToImplContainer reqContainerToImplContainer, ModelgeneratorRuleResult ruleResult) {
		CSP _localVariable_0 = _this.generateModel_solveCsp_BWD(isApplicableMatch, reqContainer, implContainer,
				reqContainerToImplContainer, ruleResult);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, reqContainer, implContainer,
					reqContainerToImplContainer, ruleResult };
		}
		return null;
	}

	public static final Object[] pattern_ImplGlassIgnoreRule_26_3_solveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_ImplGlassIgnoreRule_26_3_solveCSP_bindingAndBlackFBBBBBB(
			ImplGlassIgnoreRule _this, IsApplicableMatch isApplicableMatch, Container reqContainer,
			implementation.Container implContainer, ReqContainerToImplContainer reqContainerToImplContainer,
			ModelgeneratorRuleResult ruleResult) {
		Object[] result_pattern_ImplGlassIgnoreRule_26_3_solveCSP_binding = pattern_ImplGlassIgnoreRule_26_3_solveCSP_bindingFBBBBBB(
				_this, isApplicableMatch, reqContainer, implContainer, reqContainerToImplContainer, ruleResult);
		if (result_pattern_ImplGlassIgnoreRule_26_3_solveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_ImplGlassIgnoreRule_26_3_solveCSP_binding[0];

			Object[] result_pattern_ImplGlassIgnoreRule_26_3_solveCSP_black = pattern_ImplGlassIgnoreRule_26_3_solveCSP_blackB(
					csp);
			if (result_pattern_ImplGlassIgnoreRule_26_3_solveCSP_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, reqContainer, implContainer,
						reqContainerToImplContainer, ruleResult };
			}
		}
		return null;
	}

	public static final boolean pattern_ImplGlassIgnoreRule_26_4_checkCSP_expressionFBB(ImplGlassIgnoreRule _this,
			CSP csp) {
		boolean _localVariable_0 = _this.generateModel_checkCsp_BWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_ImplGlassIgnoreRule_26_5_checknacs_blackBBB(Container reqContainer,
			implementation.Container implContainer, ReqContainerToImplContainer reqContainerToImplContainer) {
		return new Object[] { reqContainer, implContainer, reqContainerToImplContainer };
	}

	public static final Object[] pattern_ImplGlassIgnoreRule_26_6_perform_blackBBBB(Container reqContainer,
			implementation.Container implContainer, ReqContainerToImplContainer reqContainerToImplContainer,
			ModelgeneratorRuleResult ruleResult) {
		return new Object[] { reqContainer, implContainer, reqContainerToImplContainer, ruleResult };
	}

	public static final Object[] pattern_ImplGlassIgnoreRule_26_6_perform_greenFBB(
			implementation.Container implContainer, ModelgeneratorRuleResult ruleResult) {
		GlassFiberCable cable = ImplementationFactory.eINSTANCE.createGlassFiberCable();
		boolean ruleResult_success_prime = Boolean.valueOf(true);
		int _localVariable_0 = ruleResult.getIncrementedPerformCount();
		implContainer.getCables().add(cable);
		ruleResult.getTargetObjects().add(cable);
		ruleResult.setSuccess(Boolean.valueOf(ruleResult_success_prime));
		int ruleResult_performCount_prime = Integer.valueOf(_localVariable_0);
		ruleResult.setPerformCount(Integer.valueOf(ruleResult_performCount_prime));
		return new Object[] { cable, implContainer, ruleResult };
	}

	public static final ModelgeneratorRuleResult pattern_ImplGlassIgnoreRule_26_7_expressionFB(
			ModelgeneratorRuleResult ruleResult) {
		ModelgeneratorRuleResult _result = ruleResult;
		return _result;
	}

	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} //ImplGlassIgnoreRuleImpl
