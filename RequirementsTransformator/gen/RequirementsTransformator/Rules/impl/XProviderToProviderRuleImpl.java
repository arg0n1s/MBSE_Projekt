/**
 */
package RequirementsTransformator.Rules.impl;

import RequirementsTransformator.RequirementsTransformatorFactory;

import RequirementsTransformator.Rules.RulesPackage;
import RequirementsTransformator.Rules.XProviderToProviderRule;

import RequirementsTransformator.XAgentToAgent;
import RequirementsTransformator.XContainerToContainer;

import java.lang.Iterable;

import java.lang.reflect.InvocationTargetException;

import java.math.BigInteger;

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
import requirements.Provider;
import requirements.RequirementsFactory;

import requirementsXtext.reqXtext.ReqXtextFactory;
import requirementsXtext.reqXtext.XContainer;
import requirementsXtext.reqXtext.XProvider;
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
 * An implementation of the model object '<em><b>XProvider To Provider Rule</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class XProviderToProviderRuleImpl extends AbstractRuleImpl implements XProviderToProviderRule {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected XProviderToProviderRuleImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RulesPackage.Literals.XPROVIDER_TO_PROVIDER_RULE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAppropriate_FWD(Match match, XProvider xAgent, XContainer xContainer) {

		Object[] result1_black = XProviderToProviderRuleImpl
				.pattern_XProviderToProviderRule_0_1_initialbindings_blackBBBB(this, match, xAgent, xContainer);
		if (result1_black == null) {
			throw new RuntimeException(
					"Pattern matching failed." + " Variables: " + "[this] = " + this + ", " + "[match] = " + match
							+ ", " + "[xAgent] = " + xAgent + ", " + "[xContainer] = " + xContainer + ".");
		}

		Object[] result2_bindingAndBlack = XProviderToProviderRuleImpl
				.pattern_XProviderToProviderRule_0_2_SolveCSP_bindingAndBlackFBBBB(this, match, xAgent, xContainer);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException(
					"Pattern matching failed." + " Variables: " + "[this] = " + this + ", " + "[match] = " + match
							+ ", " + "[xAgent] = " + xAgent + ", " + "[xContainer] = " + xContainer + ".");
		}
		CSP csp = (CSP) result2_bindingAndBlack[0];
		// 
		if (XProviderToProviderRuleImpl.pattern_XProviderToProviderRule_0_3_CheckCSP_expressionFBB(this, csp)) {

			Object[] result4_black = XProviderToProviderRuleImpl
					.pattern_XProviderToProviderRule_0_4_collectelementstobetranslated_blackBBB(match, xAgent,
							xContainer);
			if (result4_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match + ", "
						+ "[xAgent] = " + xAgent + ", " + "[xContainer] = " + xContainer + ".");
			}
			XProviderToProviderRuleImpl.pattern_XProviderToProviderRule_0_4_collectelementstobetranslated_greenBBBF(
					match, xAgent, xContainer);
			//nothing EMoflonEdge xContainer__xAgent____agents = (EMoflonEdge) result4_green[3];

			Object[] result5_black = XProviderToProviderRuleImpl
					.pattern_XProviderToProviderRule_0_5_collectcontextelements_blackBBB(match, xAgent, xContainer);
			if (result5_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match + ", "
						+ "[xAgent] = " + xAgent + ", " + "[xContainer] = " + xContainer + ".");
			}
			XProviderToProviderRuleImpl.pattern_XProviderToProviderRule_0_5_collectcontextelements_greenBB(match,
					xContainer);

			// 
			XProviderToProviderRuleImpl.pattern_XProviderToProviderRule_0_6_registerobjectstomatch_expressionBBBB(this,
					match, xAgent, xContainer);
			return XProviderToProviderRuleImpl.pattern_XProviderToProviderRule_0_7_expressionF();
		} else {
			return XProviderToProviderRuleImpl.pattern_XProviderToProviderRule_0_8_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PerformRuleResult perform_FWD(IsApplicableMatch isApplicableMatch) {

		Object[] result1_bindingAndBlack = XProviderToProviderRuleImpl
				.pattern_XProviderToProviderRule_1_1_performtransformation_bindingAndBlackFFFFFBB(this,
						isApplicableMatch);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[isApplicableMatch] = " + isApplicableMatch + ".");
		}
		Container container = (Container) result1_bindingAndBlack[0];
		XProvider xAgent = (XProvider) result1_bindingAndBlack[1];
		XContainerToContainer xContainerToContainer = (XContainerToContainer) result1_bindingAndBlack[2];
		XContainer xContainer = (XContainer) result1_bindingAndBlack[3];
		CSP csp = (CSP) result1_bindingAndBlack[4];
		Object[] result1_green = XProviderToProviderRuleImpl
				.pattern_XProviderToProviderRule_1_1_performtransformation_greenBFFBB(container, xAgent, csp);
		XAgentToAgent xAgentToAgent = (XAgentToAgent) result1_green[1];
		Provider agent = (Provider) result1_green[2];

		Object[] result2_black = XProviderToProviderRuleImpl
				.pattern_XProviderToProviderRule_1_2_collecttranslatedelements_blackBBB(xAgentToAgent, agent, xAgent);
		if (result2_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[xAgentToAgent] = "
					+ xAgentToAgent + ", " + "[agent] = " + agent + ", " + "[xAgent] = " + xAgent + ".");
		}
		Object[] result2_green = XProviderToProviderRuleImpl
				.pattern_XProviderToProviderRule_1_2_collecttranslatedelements_greenFBBB(xAgentToAgent, agent, xAgent);
		PerformRuleResult ruleresult = (PerformRuleResult) result2_green[0];

		Object[] result3_black = XProviderToProviderRuleImpl
				.pattern_XProviderToProviderRule_1_3_bookkeepingforedges_blackBBBBBBB(ruleresult, container,
						xAgentToAgent, agent, xAgent, xContainerToContainer, xContainer);
		if (result3_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[ruleresult] = " + ruleresult
					+ ", " + "[container] = " + container + ", " + "[xAgentToAgent] = " + xAgentToAgent + ", "
					+ "[agent] = " + agent + ", " + "[xAgent] = " + xAgent + ", " + "[xContainerToContainer] = "
					+ xContainerToContainer + ", " + "[xContainer] = " + xContainer + ".");
		}
		XProviderToProviderRuleImpl.pattern_XProviderToProviderRule_1_3_bookkeepingforedges_greenBBBBBBFFFF(ruleresult,
				container, xAgentToAgent, agent, xAgent, xContainer);
		//nothing EMoflonEdge xAgentToAgent__agent____target = (EMoflonEdge) result3_green[6];
		//nothing EMoflonEdge container__agent____agents = (EMoflonEdge) result3_green[7];
		//nothing EMoflonEdge xContainer__xAgent____agents = (EMoflonEdge) result3_green[8];
		//nothing EMoflonEdge xAgentToAgent__xAgent____source = (EMoflonEdge) result3_green[9];

		// 
		// 
		XProviderToProviderRuleImpl.pattern_XProviderToProviderRule_1_5_registerobjects_expressionBBBBBBBB(this,
				ruleresult, container, xAgentToAgent, agent, xAgent, xContainerToContainer, xContainer);
		return XProviderToProviderRuleImpl.pattern_XProviderToProviderRule_1_6_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IsApplicableRuleResult isApplicable_FWD(Match match) {

		Object[] result1_bindingAndBlack = XProviderToProviderRuleImpl
				.pattern_XProviderToProviderRule_2_1_preparereturnvalue_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		EOperation performOperation = (EOperation) result1_bindingAndBlack[0];
		//nothing EClass eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = XProviderToProviderRuleImpl
				.pattern_XProviderToProviderRule_2_1_preparereturnvalue_greenBF(performOperation);
		IsApplicableRuleResult ruleresult = (IsApplicableRuleResult) result1_green[1];

		// ForEach 
		Object[] result2_binding = XProviderToProviderRuleImpl
				.pattern_XProviderToProviderRule_2_2_corematch_bindingFFB(match);
		if (result2_binding == null) {
			throw new RuntimeException(
					"Binding in node core match failed." + " Variables: " + "[match] = " + match + ".");
		}
		XProvider xAgent = (XProvider) result2_binding[0];
		XContainer xContainer = (XContainer) result2_binding[1];
		for (Object[] result2_black : XProviderToProviderRuleImpl
				.pattern_XProviderToProviderRule_2_2_corematch_blackFBFBB(xAgent, xContainer, match)) {
			Container container = (Container) result2_black[0];
			XContainerToContainer xContainerToContainer = (XContainerToContainer) result2_black[2];
			// ForEach 
			for (Object[] result3_black : XProviderToProviderRuleImpl
					.pattern_XProviderToProviderRule_2_3_findcontext_blackBBBB(container, xAgent, xContainerToContainer,
							xContainer)) {
				Object[] result3_green = XProviderToProviderRuleImpl
						.pattern_XProviderToProviderRule_2_3_findcontext_greenBBBBFFFF(container, xAgent,
								xContainerToContainer, xContainer);
				IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result3_green[4];
				//nothing EMoflonEdge xContainerToContainer__xContainer____source = (EMoflonEdge) result3_green[5];
				//nothing EMoflonEdge xContainerToContainer__container____target = (EMoflonEdge) result3_green[6];
				//nothing EMoflonEdge xContainer__xAgent____agents = (EMoflonEdge) result3_green[7];

				Object[] result4_bindingAndBlack = XProviderToProviderRuleImpl
						.pattern_XProviderToProviderRule_2_4_solveCSP_bindingAndBlackFBBBBBB(this, isApplicableMatch,
								container, xAgent, xContainerToContainer, xContainer);
				if (result4_bindingAndBlack == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
							+ "[isApplicableMatch] = " + isApplicableMatch + ", " + "[container] = " + container + ", "
							+ "[xAgent] = " + xAgent + ", " + "[xContainerToContainer] = " + xContainerToContainer
							+ ", " + "[xContainer] = " + xContainer + ".");
				}
				CSP csp = (CSP) result4_bindingAndBlack[0];
				// 
				if (XProviderToProviderRuleImpl.pattern_XProviderToProviderRule_2_5_checkCSP_expressionFBB(this, csp)) {

					Object[] result6_black = XProviderToProviderRuleImpl
							.pattern_XProviderToProviderRule_2_6_addmatchtoruleresult_blackBB(ruleresult,
									isApplicableMatch);
					if (result6_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[ruleresult] = "
								+ ruleresult + ", " + "[isApplicableMatch] = " + isApplicableMatch + ".");
					}
					XProviderToProviderRuleImpl.pattern_XProviderToProviderRule_2_6_addmatchtoruleresult_greenBB(
							ruleresult, isApplicableMatch);

				} else {
				}

			}

		}
		return XProviderToProviderRuleImpl.pattern_XProviderToProviderRule_2_7_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void registerObjectsToMatch_FWD(Match match, XProvider xAgent, XContainer xContainer) {
		match.registerObject("xAgent", xAgent);
		match.registerObject("xContainer", xContainer);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isAppropriate_solveCsp_FWD(Match match, XProvider xAgent, XContainer xContainer) {// Create CSP
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
	public CSP isApplicable_solveCsp_FWD(IsApplicableMatch isApplicableMatch, Container container, XProvider xAgent,
			XContainerToContainer xContainerToContainer, XContainer xContainer) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals

		// Create attribute variables
		Variable var_xAgent_speed = CSPFactoryHelper.eINSTANCE.createVariable("xAgent.speed", true, csp);
		var_xAgent_speed.setValue(xAgent.getSpeed());
		var_xAgent_speed.setType("BigInteger");
		Variable var_xAgent_name = CSPFactoryHelper.eINSTANCE.createVariable("xAgent.name", true, csp);
		var_xAgent_name.setValue(xAgent.getName());
		var_xAgent_name.setType("String");

		// Create unbound variables
		Variable var_agent_speed = CSPFactoryHelper.eINSTANCE.createVariable("agent.speed", csp);
		var_agent_speed.setType("BigInteger");
		Variable var_agent_name = CSPFactoryHelper.eINSTANCE.createVariable("agent.name", csp);
		var_agent_name.setType("String");

		// Create constraints
		Eq eq = new Eq();
		Eq eq_0 = new Eq();

		csp.getConstraints().add(eq);
		csp.getConstraints().add(eq_0);

		// Solve CSP
		eq.setRuleName("NoRuleName");
		eq.solve(var_xAgent_speed, var_agent_speed);
		eq_0.setRuleName("NoRuleName");
		eq_0.solve(var_xAgent_name, var_agent_name);

		// Snapshot pattern match on which CSP is solved
		isApplicableMatch.registerObject("container", container);
		isApplicableMatch.registerObject("xAgent", xAgent);
		isApplicableMatch.registerObject("xContainerToContainer", xContainerToContainer);
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
	public void registerObjects_FWD(PerformRuleResult ruleresult, EObject container, EObject xAgentToAgent,
			EObject agent, EObject xAgent, EObject xContainerToContainer, EObject xContainer) {
		ruleresult.registerObject("container", container);
		ruleresult.registerObject("xAgentToAgent", xAgentToAgent);
		ruleresult.registerObject("agent", agent);
		ruleresult.registerObject("xAgent", xAgent);
		ruleresult.registerObject("xContainerToContainer", xContainerToContainer);
		ruleresult.registerObject("xContainer", xContainer);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean checkTypes_FWD(Match match) {
		return true && org.moflon.util.eMoflonSDMUtil.getFQN(match.getObject("xAgent").eClass())
				.equals("reqXtext.XProvider.");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAppropriate_BWD(Match match, Container container, Provider agent) {

		Object[] result1_black = XProviderToProviderRuleImpl
				.pattern_XProviderToProviderRule_10_1_initialbindings_blackBBBB(this, match, container, agent);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[match] = " + match + ", " + "[container] = " + container + ", " + "[agent] = " + agent + ".");
		}

		Object[] result2_bindingAndBlack = XProviderToProviderRuleImpl
				.pattern_XProviderToProviderRule_10_2_SolveCSP_bindingAndBlackFBBBB(this, match, container, agent);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[match] = " + match + ", " + "[container] = " + container + ", " + "[agent] = " + agent + ".");
		}
		CSP csp = (CSP) result2_bindingAndBlack[0];
		// 
		if (XProviderToProviderRuleImpl.pattern_XProviderToProviderRule_10_3_CheckCSP_expressionFBB(this, csp)) {

			Object[] result4_black = XProviderToProviderRuleImpl
					.pattern_XProviderToProviderRule_10_4_collectelementstobetranslated_blackBBB(match, container,
							agent);
			if (result4_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match + ", "
						+ "[container] = " + container + ", " + "[agent] = " + agent + ".");
			}
			XProviderToProviderRuleImpl.pattern_XProviderToProviderRule_10_4_collectelementstobetranslated_greenBBBF(
					match, container, agent);
			//nothing EMoflonEdge container__agent____agents = (EMoflonEdge) result4_green[3];

			Object[] result5_black = XProviderToProviderRuleImpl
					.pattern_XProviderToProviderRule_10_5_collectcontextelements_blackBBB(match, container, agent);
			if (result5_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match + ", "
						+ "[container] = " + container + ", " + "[agent] = " + agent + ".");
			}
			XProviderToProviderRuleImpl.pattern_XProviderToProviderRule_10_5_collectcontextelements_greenBB(match,
					container);

			// 
			XProviderToProviderRuleImpl.pattern_XProviderToProviderRule_10_6_registerobjectstomatch_expressionBBBB(this,
					match, container, agent);
			return XProviderToProviderRuleImpl.pattern_XProviderToProviderRule_10_7_expressionF();
		} else {
			return XProviderToProviderRuleImpl.pattern_XProviderToProviderRule_10_8_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PerformRuleResult perform_BWD(IsApplicableMatch isApplicableMatch) {

		Object[] result1_bindingAndBlack = XProviderToProviderRuleImpl
				.pattern_XProviderToProviderRule_11_1_performtransformation_bindingAndBlackFFFFFBB(this,
						isApplicableMatch);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[isApplicableMatch] = " + isApplicableMatch + ".");
		}
		Container container = (Container) result1_bindingAndBlack[0];
		Provider agent = (Provider) result1_bindingAndBlack[1];
		XContainerToContainer xContainerToContainer = (XContainerToContainer) result1_bindingAndBlack[2];
		XContainer xContainer = (XContainer) result1_bindingAndBlack[3];
		CSP csp = (CSP) result1_bindingAndBlack[4];
		Object[] result1_green = XProviderToProviderRuleImpl
				.pattern_XProviderToProviderRule_11_1_performtransformation_greenFBFBB(agent, xContainer, csp);
		XAgentToAgent xAgentToAgent = (XAgentToAgent) result1_green[0];
		XProvider xAgent = (XProvider) result1_green[2];

		Object[] result2_black = XProviderToProviderRuleImpl
				.pattern_XProviderToProviderRule_11_2_collecttranslatedelements_blackBBB(xAgentToAgent, agent, xAgent);
		if (result2_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[xAgentToAgent] = "
					+ xAgentToAgent + ", " + "[agent] = " + agent + ", " + "[xAgent] = " + xAgent + ".");
		}
		Object[] result2_green = XProviderToProviderRuleImpl
				.pattern_XProviderToProviderRule_11_2_collecttranslatedelements_greenFBBB(xAgentToAgent, agent, xAgent);
		PerformRuleResult ruleresult = (PerformRuleResult) result2_green[0];

		Object[] result3_black = XProviderToProviderRuleImpl
				.pattern_XProviderToProviderRule_11_3_bookkeepingforedges_blackBBBBBBB(ruleresult, container,
						xAgentToAgent, agent, xAgent, xContainerToContainer, xContainer);
		if (result3_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[ruleresult] = " + ruleresult
					+ ", " + "[container] = " + container + ", " + "[xAgentToAgent] = " + xAgentToAgent + ", "
					+ "[agent] = " + agent + ", " + "[xAgent] = " + xAgent + ", " + "[xContainerToContainer] = "
					+ xContainerToContainer + ", " + "[xContainer] = " + xContainer + ".");
		}
		XProviderToProviderRuleImpl.pattern_XProviderToProviderRule_11_3_bookkeepingforedges_greenBBBBBBFFFF(ruleresult,
				container, xAgentToAgent, agent, xAgent, xContainer);
		//nothing EMoflonEdge xAgentToAgent__agent____target = (EMoflonEdge) result3_green[6];
		//nothing EMoflonEdge container__agent____agents = (EMoflonEdge) result3_green[7];
		//nothing EMoflonEdge xContainer__xAgent____agents = (EMoflonEdge) result3_green[8];
		//nothing EMoflonEdge xAgentToAgent__xAgent____source = (EMoflonEdge) result3_green[9];

		// 
		// 
		XProviderToProviderRuleImpl.pattern_XProviderToProviderRule_11_5_registerobjects_expressionBBBBBBBB(this,
				ruleresult, container, xAgentToAgent, agent, xAgent, xContainerToContainer, xContainer);
		return XProviderToProviderRuleImpl.pattern_XProviderToProviderRule_11_6_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IsApplicableRuleResult isApplicable_BWD(Match match) {

		Object[] result1_bindingAndBlack = XProviderToProviderRuleImpl
				.pattern_XProviderToProviderRule_12_1_preparereturnvalue_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		EOperation performOperation = (EOperation) result1_bindingAndBlack[0];
		//nothing EClass eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = XProviderToProviderRuleImpl
				.pattern_XProviderToProviderRule_12_1_preparereturnvalue_greenBF(performOperation);
		IsApplicableRuleResult ruleresult = (IsApplicableRuleResult) result1_green[1];

		// ForEach 
		Object[] result2_binding = XProviderToProviderRuleImpl
				.pattern_XProviderToProviderRule_12_2_corematch_bindingFFB(match);
		if (result2_binding == null) {
			throw new RuntimeException(
					"Binding in node core match failed." + " Variables: " + "[match] = " + match + ".");
		}
		Container container = (Container) result2_binding[0];
		Provider agent = (Provider) result2_binding[1];
		for (Object[] result2_black : XProviderToProviderRuleImpl
				.pattern_XProviderToProviderRule_12_2_corematch_blackBBFFB(container, agent, match)) {
			XContainerToContainer xContainerToContainer = (XContainerToContainer) result2_black[2];
			XContainer xContainer = (XContainer) result2_black[3];
			// ForEach 
			for (Object[] result3_black : XProviderToProviderRuleImpl
					.pattern_XProviderToProviderRule_12_3_findcontext_blackBBBB(container, agent, xContainerToContainer,
							xContainer)) {
				Object[] result3_green = XProviderToProviderRuleImpl
						.pattern_XProviderToProviderRule_12_3_findcontext_greenBBBBFFFF(container, agent,
								xContainerToContainer, xContainer);
				IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result3_green[4];
				//nothing EMoflonEdge xContainerToContainer__xContainer____source = (EMoflonEdge) result3_green[5];
				//nothing EMoflonEdge xContainerToContainer__container____target = (EMoflonEdge) result3_green[6];
				//nothing EMoflonEdge container__agent____agents = (EMoflonEdge) result3_green[7];

				Object[] result4_bindingAndBlack = XProviderToProviderRuleImpl
						.pattern_XProviderToProviderRule_12_4_solveCSP_bindingAndBlackFBBBBBB(this, isApplicableMatch,
								container, agent, xContainerToContainer, xContainer);
				if (result4_bindingAndBlack == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
							+ "[isApplicableMatch] = " + isApplicableMatch + ", " + "[container] = " + container + ", "
							+ "[agent] = " + agent + ", " + "[xContainerToContainer] = " + xContainerToContainer + ", "
							+ "[xContainer] = " + xContainer + ".");
				}
				CSP csp = (CSP) result4_bindingAndBlack[0];
				// 
				if (XProviderToProviderRuleImpl.pattern_XProviderToProviderRule_12_5_checkCSP_expressionFBB(this,
						csp)) {

					Object[] result6_black = XProviderToProviderRuleImpl
							.pattern_XProviderToProviderRule_12_6_addmatchtoruleresult_blackBB(ruleresult,
									isApplicableMatch);
					if (result6_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[ruleresult] = "
								+ ruleresult + ", " + "[isApplicableMatch] = " + isApplicableMatch + ".");
					}
					XProviderToProviderRuleImpl.pattern_XProviderToProviderRule_12_6_addmatchtoruleresult_greenBB(
							ruleresult, isApplicableMatch);

				} else {
				}

			}

		}
		return XProviderToProviderRuleImpl.pattern_XProviderToProviderRule_12_7_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void registerObjectsToMatch_BWD(Match match, Container container, Provider agent) {
		match.registerObject("container", container);
		match.registerObject("agent", agent);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isAppropriate_solveCsp_BWD(Match match, Container container, Provider agent) {// Create CSP
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
	public CSP isApplicable_solveCsp_BWD(IsApplicableMatch isApplicableMatch, Container container, Provider agent,
			XContainerToContainer xContainerToContainer, XContainer xContainer) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals

		// Create attribute variables
		Variable var_agent_speed = CSPFactoryHelper.eINSTANCE.createVariable("agent.speed", true, csp);
		var_agent_speed.setValue(agent.getSpeed());
		var_agent_speed.setType("BigInteger");
		Variable var_agent_name = CSPFactoryHelper.eINSTANCE.createVariable("agent.name", true, csp);
		var_agent_name.setValue(agent.getName());
		var_agent_name.setType("String");

		// Create unbound variables
		Variable var_xAgent_speed = CSPFactoryHelper.eINSTANCE.createVariable("xAgent.speed", csp);
		var_xAgent_speed.setType("BigInteger");
		Variable var_xAgent_name = CSPFactoryHelper.eINSTANCE.createVariable("xAgent.name", csp);
		var_xAgent_name.setType("String");

		// Create constraints
		Eq eq = new Eq();
		Eq eq_0 = new Eq();

		csp.getConstraints().add(eq);
		csp.getConstraints().add(eq_0);

		// Solve CSP
		eq.setRuleName("NoRuleName");
		eq.solve(var_xAgent_speed, var_agent_speed);
		eq_0.setRuleName("NoRuleName");
		eq_0.solve(var_xAgent_name, var_agent_name);

		// Snapshot pattern match on which CSP is solved
		isApplicableMatch.registerObject("container", container);
		isApplicableMatch.registerObject("agent", agent);
		isApplicableMatch.registerObject("xContainerToContainer", xContainerToContainer);
		isApplicableMatch.registerObject("xContainer", xContainer);
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
	public void registerObjects_BWD(PerformRuleResult ruleresult, EObject container, EObject xAgentToAgent,
			EObject agent, EObject xAgent, EObject xContainerToContainer, EObject xContainer) {
		ruleresult.registerObject("container", container);
		ruleresult.registerObject("xAgentToAgent", xAgentToAgent);
		ruleresult.registerObject("agent", agent);
		ruleresult.registerObject("xAgent", xAgent);
		ruleresult.registerObject("xContainerToContainer", xContainerToContainer);
		ruleresult.registerObject("xContainer", xContainer);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean checkTypes_BWD(Match match) {
		return true && org.moflon.util.eMoflonSDMUtil.getFQN(match.getObject("agent").eClass())
				.equals("requirements.Provider.");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_BWD_EMoflonEdge_8(EMoflonEdge _edge_agents) {

		Object[] result1_bindingAndBlack = XProviderToProviderRuleImpl
				.pattern_XProviderToProviderRule_20_1_preparereturnvalue_bindingAndBlackFFBF(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		EOperation isApplicableCC = (EOperation) result1_bindingAndBlack[3];
		Object[] result1_green = XProviderToProviderRuleImpl
				.pattern_XProviderToProviderRule_20_1_preparereturnvalue_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach 
		for (Object[] result2_black : XProviderToProviderRuleImpl
				.pattern_XProviderToProviderRule_20_2_testcorematchandDECs_blackFFB(_edge_agents)) {
			Container container = (Container) result2_black[0];
			Provider agent = (Provider) result2_black[1];
			Object[] result2_green = XProviderToProviderRuleImpl
					.pattern_XProviderToProviderRule_20_2_testcorematchandDECs_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// 
			if (XProviderToProviderRuleImpl
					.pattern_XProviderToProviderRule_20_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBB(
							this, match, container, agent)) {
				// 
				if (XProviderToProviderRuleImpl
						.pattern_XProviderToProviderRule_20_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(
								this, match)) {

					Object[] result5_black = XProviderToProviderRuleImpl
							.pattern_XProviderToProviderRule_20_5_Addmatchtoruleresult_blackBBBB(match,
									__performOperation, __result, isApplicableCC);
					if (result5_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match
								+ ", " + "[__performOperation] = " + __performOperation + ", " + "[__result] = "
								+ __result + ", " + "[isApplicableCC] = " + isApplicableCC + ".");
					}
					XProviderToProviderRuleImpl.pattern_XProviderToProviderRule_20_5_Addmatchtoruleresult_greenBBBB(
							match, __performOperation, __result, isApplicableCC);

				} else {
				}

			} else {
			}

		}
		return XProviderToProviderRuleImpl.pattern_XProviderToProviderRule_20_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_FWD_EMoflonEdge_4(EMoflonEdge _edge_agents) {

		Object[] result1_bindingAndBlack = XProviderToProviderRuleImpl
				.pattern_XProviderToProviderRule_21_1_preparereturnvalue_bindingAndBlackFFBF(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		EOperation isApplicableCC = (EOperation) result1_bindingAndBlack[3];
		Object[] result1_green = XProviderToProviderRuleImpl
				.pattern_XProviderToProviderRule_21_1_preparereturnvalue_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach 
		for (Object[] result2_black : XProviderToProviderRuleImpl
				.pattern_XProviderToProviderRule_21_2_testcorematchandDECs_blackFFB(_edge_agents)) {
			XProvider xAgent = (XProvider) result2_black[0];
			XContainer xContainer = (XContainer) result2_black[1];
			Object[] result2_green = XProviderToProviderRuleImpl
					.pattern_XProviderToProviderRule_21_2_testcorematchandDECs_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// 
			if (XProviderToProviderRuleImpl
					.pattern_XProviderToProviderRule_21_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBB(
							this, match, xAgent, xContainer)) {
				// 
				if (XProviderToProviderRuleImpl
						.pattern_XProviderToProviderRule_21_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(
								this, match)) {

					Object[] result5_black = XProviderToProviderRuleImpl
							.pattern_XProviderToProviderRule_21_5_Addmatchtoruleresult_blackBBBB(match,
									__performOperation, __result, isApplicableCC);
					if (result5_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match
								+ ", " + "[__performOperation] = " + __performOperation + ", " + "[__result] = "
								+ __result + ", " + "[isApplicableCC] = " + isApplicableCC + ".");
					}
					XProviderToProviderRuleImpl.pattern_XProviderToProviderRule_21_5_Addmatchtoruleresult_greenBBBB(
							match, __performOperation, __result, isApplicableCC);

				} else {
				}

			} else {
			}

		}
		return XProviderToProviderRuleImpl.pattern_XProviderToProviderRule_21_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AttributeConstraintsRuleResult checkAttributes_FWD(TripleMatch __tripleMatch) {
		AttributeConstraintsRuleResult ruleResult = org.moflon.tgg.runtime.RuntimeFactory.eINSTANCE
				.createAttributeConstraintsRuleResult();
		ruleResult.setRule("XProviderToProviderRule");
		ruleResult.setSuccess(true);

		CSP csp = CspFactory.eINSTANCE.createCSP();

		CheckAttributeHelper __helper = new CheckAttributeHelper(__tripleMatch);

		Variable var_xAgent_speed = CSPFactoryHelper.eINSTANCE.createVariable("xAgent", true, csp);
		var_xAgent_speed.setValue(__helper.getValue("xAgent", "speed"));
		var_xAgent_speed.setType("BigInteger");

		Variable var_agent_name = CSPFactoryHelper.eINSTANCE.createVariable("agent", true, csp);
		var_agent_name.setValue(__helper.getValue("agent", "name"));
		var_agent_name.setType("String");

		Variable var_xAgent_name = CSPFactoryHelper.eINSTANCE.createVariable("xAgent", true, csp);
		var_xAgent_name.setValue(__helper.getValue("xAgent", "name"));
		var_xAgent_name.setType("String");

		Variable var_agent_speed = CSPFactoryHelper.eINSTANCE.createVariable("agent", true, csp);
		var_agent_speed.setValue(__helper.getValue("agent", "speed"));
		var_agent_speed.setType("BigInteger");

		Eq eq0 = new Eq();
		csp.getConstraints().add(eq0);

		Eq eq1 = new Eq();
		csp.getConstraints().add(eq1);

		eq0.setRuleName("XProviderToProviderRule");
		eq0.solve(var_xAgent_speed, var_agent_speed);

		eq1.setRuleName("XProviderToProviderRule");
		eq1.solve(var_xAgent_name, var_agent_name);

		if (csp.check()) {
			ruleResult.setSuccess(true);
		} else {
			var_agent_speed.setBound(false);
			var_agent_name.setBound(false);
			eq0.solve(var_xAgent_speed, var_agent_speed);
			eq1.solve(var_xAgent_name, var_agent_name);
			if (csp.check()) {
				ruleResult.setSuccess(true);
				ruleResult.setRequiredChange(true);
				__helper.setValue("agent", "speed", var_agent_speed.getValue());
				__helper.setValue("agent", "name", var_agent_name.getValue());
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
		ruleResult.setRule("XProviderToProviderRule");
		ruleResult.setSuccess(true);

		CSP csp = CspFactory.eINSTANCE.createCSP();

		CheckAttributeHelper __helper = new CheckAttributeHelper(__tripleMatch);

		Variable var_xAgent_speed = CSPFactoryHelper.eINSTANCE.createVariable("xAgent", true, csp);
		var_xAgent_speed.setValue(__helper.getValue("xAgent", "speed"));
		var_xAgent_speed.setType("BigInteger");

		Variable var_agent_name = CSPFactoryHelper.eINSTANCE.createVariable("agent", true, csp);
		var_agent_name.setValue(__helper.getValue("agent", "name"));
		var_agent_name.setType("String");

		Variable var_xAgent_name = CSPFactoryHelper.eINSTANCE.createVariable("xAgent", true, csp);
		var_xAgent_name.setValue(__helper.getValue("xAgent", "name"));
		var_xAgent_name.setType("String");

		Variable var_agent_speed = CSPFactoryHelper.eINSTANCE.createVariable("agent", true, csp);
		var_agent_speed.setValue(__helper.getValue("agent", "speed"));
		var_agent_speed.setType("BigInteger");

		Eq eq0 = new Eq();
		csp.getConstraints().add(eq0);

		Eq eq1 = new Eq();
		csp.getConstraints().add(eq1);

		eq0.setRuleName("XProviderToProviderRule");
		eq0.solve(var_xAgent_speed, var_agent_speed);

		eq1.setRuleName("XProviderToProviderRule");
		eq1.solve(var_xAgent_name, var_agent_name);

		if (csp.check()) {
			ruleResult.setSuccess(true);
		} else {
			var_xAgent_speed.setBound(false);
			var_xAgent_name.setBound(false);
			eq0.solve(var_xAgent_speed, var_agent_speed);
			eq1.solve(var_xAgent_name, var_agent_name);
			if (csp.check()) {
				ruleResult.setSuccess(true);
				ruleResult.setRequiredChange(true);
				__helper.setValue("xAgent", "speed", var_xAgent_speed.getValue());
				__helper.setValue("xAgent", "name", var_xAgent_name.getValue());
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

		Object[] result1_black = XProviderToProviderRuleImpl.pattern_XProviderToProviderRule_24_1_prepare_blackB(this);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		Object[] result1_green = XProviderToProviderRuleImpl.pattern_XProviderToProviderRule_24_1_prepare_greenF();
		IsApplicableRuleResult result = (IsApplicableRuleResult) result1_green[0];

		Object[] result2_bindingAndBlack = XProviderToProviderRuleImpl
				.pattern_XProviderToProviderRule_24_2_matchsrctrgcontext_bindingAndBlackFFFFBB(sourceMatch,
						targetMatch);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[sourceMatch] = " + sourceMatch
					+ ", " + "[targetMatch] = " + targetMatch + ".");
		}
		Container container = (Container) result2_bindingAndBlack[0];
		Provider agent = (Provider) result2_bindingAndBlack[1];
		XProvider xAgent = (XProvider) result2_bindingAndBlack[2];
		XContainer xContainer = (XContainer) result2_bindingAndBlack[3];

		Object[] result3_bindingAndBlack = XProviderToProviderRuleImpl
				.pattern_XProviderToProviderRule_24_3_solvecsp_bindingAndBlackFBBBBBBB(this, container, agent, xAgent,
						xContainer, sourceMatch, targetMatch);
		if (result3_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[container] = " + container + ", " + "[agent] = " + agent + ", " + "[xAgent] = " + xAgent + ", "
					+ "[xContainer] = " + xContainer + ", " + "[sourceMatch] = " + sourceMatch + ", "
					+ "[targetMatch] = " + targetMatch + ".");
		}
		CSP csp = (CSP) result3_bindingAndBlack[0];
		// 
		if (XProviderToProviderRuleImpl.pattern_XProviderToProviderRule_24_4_checkCSP_expressionFB(csp)) {
			// ForEach 
			for (Object[] result5_black : XProviderToProviderRuleImpl
					.pattern_XProviderToProviderRule_24_5_matchcorrcontext_blackBFBBB(container, xContainer,
							sourceMatch, targetMatch)) {
				XContainerToContainer xContainerToContainer = (XContainerToContainer) result5_black[1];
				Object[] result5_green = XProviderToProviderRuleImpl
						.pattern_XProviderToProviderRule_24_5_matchcorrcontext_greenBBBF(xContainerToContainer,
								sourceMatch, targetMatch);
				CCMatch ccMatch = (CCMatch) result5_green[3];

				Object[] result6_black = XProviderToProviderRuleImpl
						.pattern_XProviderToProviderRule_24_6_createcorrespondence_blackBBBBB(container, agent, xAgent,
								xContainer, ccMatch);
				if (result6_black == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[container] = "
							+ container + ", " + "[agent] = " + agent + ", " + "[xAgent] = " + xAgent + ", "
							+ "[xContainer] = " + xContainer + ", " + "[ccMatch] = " + ccMatch + ".");
				}
				XProviderToProviderRuleImpl.pattern_XProviderToProviderRule_24_6_createcorrespondence_greenFBBB(agent,
						xAgent, ccMatch);
				//nothing XAgentToAgent xAgentToAgent = (XAgentToAgent) result6_green[0];

				Object[] result7_black = XProviderToProviderRuleImpl
						.pattern_XProviderToProviderRule_24_7_addtoreturnedresult_blackBB(result, ccMatch);
				if (result7_black == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[result] = " + result
							+ ", " + "[ccMatch] = " + ccMatch + ".");
				}
				XProviderToProviderRuleImpl.pattern_XProviderToProviderRule_24_7_addtoreturnedresult_greenBB(result,
						ccMatch);

			}

		} else {
		}
		return XProviderToProviderRuleImpl.pattern_XProviderToProviderRule_24_8_expressionFB(result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isApplicable_solveCsp_CC(Container container, Provider agent, XProvider xAgent, XContainer xContainer,
			Match sourceMatch, Match targetMatch) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();

		// Create literals

		// Create attribute variables
		Variable var_xAgent_speed = CSPFactoryHelper.eINSTANCE.createVariable("xAgent.speed", true, csp);
		var_xAgent_speed.setValue(xAgent.getSpeed());
		var_xAgent_speed.setType("BigInteger");
		Variable var_agent_speed = CSPFactoryHelper.eINSTANCE.createVariable("agent.speed", true, csp);
		var_agent_speed.setValue(agent.getSpeed());
		var_agent_speed.setType("BigInteger");
		Variable var_xAgent_name = CSPFactoryHelper.eINSTANCE.createVariable("xAgent.name", true, csp);
		var_xAgent_name.setValue(xAgent.getName());
		var_xAgent_name.setType("String");
		Variable var_agent_name = CSPFactoryHelper.eINSTANCE.createVariable("agent.name", true, csp);
		var_agent_name.setValue(agent.getName());
		var_agent_name.setType("String");

		// Create unbound variables

		// Create constraints
		Eq eq = new Eq();
		Eq eq_0 = new Eq();

		csp.getConstraints().add(eq);
		csp.getConstraints().add(eq_0);

		// Solve CSP
		eq.setRuleName("NoRuleName");
		eq.solve(var_xAgent_speed, var_agent_speed);
		eq_0.setRuleName("NoRuleName");
		eq_0.solve(var_xAgent_name, var_agent_name);
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
	public boolean checkDEC_FWD(XProvider xAgent, XContainer xContainer) {// 
		Object[] result1_black = XProviderToProviderRuleImpl
				.pattern_XProviderToProviderRule_27_1_matchtggpattern_blackBB(xAgent, xContainer);
		if (result1_black != null) {
			return XProviderToProviderRuleImpl.pattern_XProviderToProviderRule_27_2_expressionF();
		} else {
			return XProviderToProviderRuleImpl.pattern_XProviderToProviderRule_27_3_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean checkDEC_BWD(Container container, Provider agent) {// 
		Object[] result1_black = XProviderToProviderRuleImpl
				.pattern_XProviderToProviderRule_28_1_matchtggpattern_blackBB(container, agent);
		if (result1_black != null) {
			return XProviderToProviderRuleImpl.pattern_XProviderToProviderRule_28_2_expressionF();
		} else {
			return XProviderToProviderRuleImpl.pattern_XProviderToProviderRule_28_3_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModelgeneratorRuleResult generateModel(RuleEntryContainer ruleEntryContainer,
			XContainerToContainer xContainerToContainerParameter) {

		Object[] result1_black = XProviderToProviderRuleImpl
				.pattern_XProviderToProviderRule_29_1_createresult_blackB(this);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		Object[] result1_green = XProviderToProviderRuleImpl
				.pattern_XProviderToProviderRule_29_1_createresult_greenFF();
		IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result1_green[0];
		ModelgeneratorRuleResult ruleResult = (ModelgeneratorRuleResult) result1_green[1];

		// ForEach 
		for (Object[] result2_black : XProviderToProviderRuleImpl
				.pattern_XProviderToProviderRule_29_2_isapplicablecore_blackFFFFBB(ruleEntryContainer, ruleResult)) {
			//nothing RuleEntryList xContainerToContainerList = (RuleEntryList) result2_black[0];
			Container container = (Container) result2_black[1];
			XContainerToContainer xContainerToContainer = (XContainerToContainer) result2_black[2];
			XContainer xContainer = (XContainer) result2_black[3];

			Object[] result3_bindingAndBlack = XProviderToProviderRuleImpl
					.pattern_XProviderToProviderRule_29_3_solveCSP_bindingAndBlackFBBBBBB(this, isApplicableMatch,
							container, xContainerToContainer, xContainer, ruleResult);
			if (result3_bindingAndBlack == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
						+ "[isApplicableMatch] = " + isApplicableMatch + ", " + "[container] = " + container + ", "
						+ "[xContainerToContainer] = " + xContainerToContainer + ", " + "[xContainer] = " + xContainer
						+ ", " + "[ruleResult] = " + ruleResult + ".");
			}
			CSP csp = (CSP) result3_bindingAndBlack[0];
			// 
			if (XProviderToProviderRuleImpl.pattern_XProviderToProviderRule_29_4_checkCSP_expressionFBB(this, csp)) {
				// 
				Object[] result5_black = XProviderToProviderRuleImpl
						.pattern_XProviderToProviderRule_29_5_checknacs_blackBBB(container, xContainerToContainer,
								xContainer);
				if (result5_black != null) {

					Object[] result6_black = XProviderToProviderRuleImpl
							.pattern_XProviderToProviderRule_29_6_perform_blackBBBB(container, xContainerToContainer,
									xContainer, ruleResult);
					if (result6_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[container] = "
								+ container + ", " + "[xContainerToContainer] = " + xContainerToContainer + ", "
								+ "[xContainer] = " + xContainer + ", " + "[ruleResult] = " + ruleResult + ".");
					}
					XProviderToProviderRuleImpl.pattern_XProviderToProviderRule_29_6_perform_greenBFFFBBB(container,
							xContainer, ruleResult, csp);
					//nothing XAgentToAgent xAgentToAgent = (XAgentToAgent) result6_green[1];
					//nothing Provider agent = (Provider) result6_green[2];
					//nothing XProvider xAgent = (XProvider) result6_green[3];

				} else {
				}

			} else {
			}

		}
		return XProviderToProviderRuleImpl.pattern_XProviderToProviderRule_29_7_expressionFB(ruleResult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP generateModel_solveCsp_BWD(IsApplicableMatch isApplicableMatch, Container container,
			XContainerToContainer xContainerToContainer, XContainer xContainer, ModelgeneratorRuleResult ruleResult) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals

		// Create attribute variables

		// Create unbound variables
		Variable var_xAgent_speed = CSPFactoryHelper.eINSTANCE.createVariable("xAgent.speed", csp);
		var_xAgent_speed.setType("BigInteger");
		Variable var_agent_speed = CSPFactoryHelper.eINSTANCE.createVariable("agent.speed", csp);
		var_agent_speed.setType("BigInteger");
		Variable var_xAgent_name = CSPFactoryHelper.eINSTANCE.createVariable("xAgent.name", csp);
		var_xAgent_name.setType("String");
		Variable var_agent_name = CSPFactoryHelper.eINSTANCE.createVariable("agent.name", csp);
		var_agent_name.setType("String");

		// Create constraints
		Eq eq = new Eq();
		Eq eq_0 = new Eq();

		csp.getConstraints().add(eq);
		csp.getConstraints().add(eq_0);

		// Solve CSP
		eq.setRuleName("NoRuleName");
		eq.solve(var_xAgent_speed, var_agent_speed);
		eq_0.setRuleName("NoRuleName");
		eq_0.solve(var_xAgent_name, var_agent_name);

		// Snapshot pattern match on which CSP is solved
		isApplicableMatch.registerObject("container", container);
		isApplicableMatch.registerObject("xContainerToContainer", xContainerToContainer);
		isApplicableMatch.registerObject("xContainer", xContainer);
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
		case RulesPackage.XPROVIDER_TO_PROVIDER_RULE___IS_APPROPRIATE_FWD__MATCH_XPROVIDER_XCONTAINER:
			return isAppropriate_FWD((Match) arguments.get(0), (XProvider) arguments.get(1),
					(XContainer) arguments.get(2));
		case RulesPackage.XPROVIDER_TO_PROVIDER_RULE___PERFORM_FWD__ISAPPLICABLEMATCH:
			return perform_FWD((IsApplicableMatch) arguments.get(0));
		case RulesPackage.XPROVIDER_TO_PROVIDER_RULE___IS_APPLICABLE_FWD__MATCH:
			return isApplicable_FWD((Match) arguments.get(0));
		case RulesPackage.XPROVIDER_TO_PROVIDER_RULE___REGISTER_OBJECTS_TO_MATCH_FWD__MATCH_XPROVIDER_XCONTAINER:
			registerObjectsToMatch_FWD((Match) arguments.get(0), (XProvider) arguments.get(1),
					(XContainer) arguments.get(2));
			return null;
		case RulesPackage.XPROVIDER_TO_PROVIDER_RULE___IS_APPROPRIATE_SOLVE_CSP_FWD__MATCH_XPROVIDER_XCONTAINER:
			return isAppropriate_solveCsp_FWD((Match) arguments.get(0), (XProvider) arguments.get(1),
					(XContainer) arguments.get(2));
		case RulesPackage.XPROVIDER_TO_PROVIDER_RULE___IS_APPROPRIATE_CHECK_CSP_FWD__CSP:
			return isAppropriate_checkCsp_FWD((CSP) arguments.get(0));
		case RulesPackage.XPROVIDER_TO_PROVIDER_RULE___IS_APPLICABLE_SOLVE_CSP_FWD__ISAPPLICABLEMATCH_CONTAINER_XPROVIDER_XCONTAINERTOCONTAINER_XCONTAINER:
			return isApplicable_solveCsp_FWD((IsApplicableMatch) arguments.get(0), (Container) arguments.get(1),
					(XProvider) arguments.get(2), (XContainerToContainer) arguments.get(3),
					(XContainer) arguments.get(4));
		case RulesPackage.XPROVIDER_TO_PROVIDER_RULE___IS_APPLICABLE_CHECK_CSP_FWD__CSP:
			return isApplicable_checkCsp_FWD((CSP) arguments.get(0));
		case RulesPackage.XPROVIDER_TO_PROVIDER_RULE___REGISTER_OBJECTS_FWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT:
			registerObjects_FWD((PerformRuleResult) arguments.get(0), (EObject) arguments.get(1),
					(EObject) arguments.get(2), (EObject) arguments.get(3), (EObject) arguments.get(4),
					(EObject) arguments.get(5), (EObject) arguments.get(6));
			return null;
		case RulesPackage.XPROVIDER_TO_PROVIDER_RULE___CHECK_TYPES_FWD__MATCH:
			return checkTypes_FWD((Match) arguments.get(0));
		case RulesPackage.XPROVIDER_TO_PROVIDER_RULE___IS_APPROPRIATE_BWD__MATCH_CONTAINER_PROVIDER:
			return isAppropriate_BWD((Match) arguments.get(0), (Container) arguments.get(1),
					(Provider) arguments.get(2));
		case RulesPackage.XPROVIDER_TO_PROVIDER_RULE___PERFORM_BWD__ISAPPLICABLEMATCH:
			return perform_BWD((IsApplicableMatch) arguments.get(0));
		case RulesPackage.XPROVIDER_TO_PROVIDER_RULE___IS_APPLICABLE_BWD__MATCH:
			return isApplicable_BWD((Match) arguments.get(0));
		case RulesPackage.XPROVIDER_TO_PROVIDER_RULE___REGISTER_OBJECTS_TO_MATCH_BWD__MATCH_CONTAINER_PROVIDER:
			registerObjectsToMatch_BWD((Match) arguments.get(0), (Container) arguments.get(1),
					(Provider) arguments.get(2));
			return null;
		case RulesPackage.XPROVIDER_TO_PROVIDER_RULE___IS_APPROPRIATE_SOLVE_CSP_BWD__MATCH_CONTAINER_PROVIDER:
			return isAppropriate_solveCsp_BWD((Match) arguments.get(0), (Container) arguments.get(1),
					(Provider) arguments.get(2));
		case RulesPackage.XPROVIDER_TO_PROVIDER_RULE___IS_APPROPRIATE_CHECK_CSP_BWD__CSP:
			return isAppropriate_checkCsp_BWD((CSP) arguments.get(0));
		case RulesPackage.XPROVIDER_TO_PROVIDER_RULE___IS_APPLICABLE_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_CONTAINER_PROVIDER_XCONTAINERTOCONTAINER_XCONTAINER:
			return isApplicable_solveCsp_BWD((IsApplicableMatch) arguments.get(0), (Container) arguments.get(1),
					(Provider) arguments.get(2), (XContainerToContainer) arguments.get(3),
					(XContainer) arguments.get(4));
		case RulesPackage.XPROVIDER_TO_PROVIDER_RULE___IS_APPLICABLE_CHECK_CSP_BWD__CSP:
			return isApplicable_checkCsp_BWD((CSP) arguments.get(0));
		case RulesPackage.XPROVIDER_TO_PROVIDER_RULE___REGISTER_OBJECTS_BWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT:
			registerObjects_BWD((PerformRuleResult) arguments.get(0), (EObject) arguments.get(1),
					(EObject) arguments.get(2), (EObject) arguments.get(3), (EObject) arguments.get(4),
					(EObject) arguments.get(5), (EObject) arguments.get(6));
			return null;
		case RulesPackage.XPROVIDER_TO_PROVIDER_RULE___CHECK_TYPES_BWD__MATCH:
			return checkTypes_BWD((Match) arguments.get(0));
		case RulesPackage.XPROVIDER_TO_PROVIDER_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_8__EMOFLONEDGE:
			return isAppropriate_BWD_EMoflonEdge_8((EMoflonEdge) arguments.get(0));
		case RulesPackage.XPROVIDER_TO_PROVIDER_RULE___IS_APPROPRIATE_FWD_EMOFLON_EDGE_4__EMOFLONEDGE:
			return isAppropriate_FWD_EMoflonEdge_4((EMoflonEdge) arguments.get(0));
		case RulesPackage.XPROVIDER_TO_PROVIDER_RULE___CHECK_ATTRIBUTES_FWD__TRIPLEMATCH:
			return checkAttributes_FWD((TripleMatch) arguments.get(0));
		case RulesPackage.XPROVIDER_TO_PROVIDER_RULE___CHECK_ATTRIBUTES_BWD__TRIPLEMATCH:
			return checkAttributes_BWD((TripleMatch) arguments.get(0));
		case RulesPackage.XPROVIDER_TO_PROVIDER_RULE___IS_APPLICABLE_CC__MATCH_MATCH:
			return isApplicable_CC((Match) arguments.get(0), (Match) arguments.get(1));
		case RulesPackage.XPROVIDER_TO_PROVIDER_RULE___IS_APPLICABLE_SOLVE_CSP_CC__CONTAINER_PROVIDER_XPROVIDER_XCONTAINER_MATCH_MATCH:
			return isApplicable_solveCsp_CC((Container) arguments.get(0), (Provider) arguments.get(1),
					(XProvider) arguments.get(2), (XContainer) arguments.get(3), (Match) arguments.get(4),
					(Match) arguments.get(5));
		case RulesPackage.XPROVIDER_TO_PROVIDER_RULE___IS_APPLICABLE_CHECK_CSP_CC__CSP:
			return isApplicable_checkCsp_CC((CSP) arguments.get(0));
		case RulesPackage.XPROVIDER_TO_PROVIDER_RULE___CHECK_DEC_FWD__XPROVIDER_XCONTAINER:
			return checkDEC_FWD((XProvider) arguments.get(0), (XContainer) arguments.get(1));
		case RulesPackage.XPROVIDER_TO_PROVIDER_RULE___CHECK_DEC_BWD__CONTAINER_PROVIDER:
			return checkDEC_BWD((Container) arguments.get(0), (Provider) arguments.get(1));
		case RulesPackage.XPROVIDER_TO_PROVIDER_RULE___GENERATE_MODEL__RULEENTRYCONTAINER_XCONTAINERTOCONTAINER:
			return generateModel((RuleEntryContainer) arguments.get(0), (XContainerToContainer) arguments.get(1));
		case RulesPackage.XPROVIDER_TO_PROVIDER_RULE___GENERATE_MODEL_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_CONTAINER_XCONTAINERTOCONTAINER_XCONTAINER_MODELGENERATORRULERESULT:
			return generateModel_solveCsp_BWD((IsApplicableMatch) arguments.get(0), (Container) arguments.get(1),
					(XContainerToContainer) arguments.get(2), (XContainer) arguments.get(3),
					(ModelgeneratorRuleResult) arguments.get(4));
		case RulesPackage.XPROVIDER_TO_PROVIDER_RULE___GENERATE_MODEL_CHECK_CSP_BWD__CSP:
			return generateModel_checkCsp_BWD((CSP) arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
	}

	public static final Object[] pattern_XProviderToProviderRule_0_1_initialbindings_blackBBBB(
			XProviderToProviderRule _this, Match match, XProvider xAgent, XContainer xContainer) {
		return new Object[] { _this, match, xAgent, xContainer };
	}

	public static final Object[] pattern_XProviderToProviderRule_0_2_SolveCSP_bindingFBBBB(
			XProviderToProviderRule _this, Match match, XProvider xAgent, XContainer xContainer) {
		CSP _localVariable_0 = _this.isAppropriate_solveCsp_FWD(match, xAgent, xContainer);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, match, xAgent, xContainer };
		}
		return null;
	}

	public static final Object[] pattern_XProviderToProviderRule_0_2_SolveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_XProviderToProviderRule_0_2_SolveCSP_bindingAndBlackFBBBB(
			XProviderToProviderRule _this, Match match, XProvider xAgent, XContainer xContainer) {
		Object[] result_pattern_XProviderToProviderRule_0_2_SolveCSP_binding = pattern_XProviderToProviderRule_0_2_SolveCSP_bindingFBBBB(
				_this, match, xAgent, xContainer);
		if (result_pattern_XProviderToProviderRule_0_2_SolveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_XProviderToProviderRule_0_2_SolveCSP_binding[0];

			Object[] result_pattern_XProviderToProviderRule_0_2_SolveCSP_black = pattern_XProviderToProviderRule_0_2_SolveCSP_blackB(
					csp);
			if (result_pattern_XProviderToProviderRule_0_2_SolveCSP_black != null) {

				return new Object[] { csp, _this, match, xAgent, xContainer };
			}
		}
		return null;
	}

	public static final boolean pattern_XProviderToProviderRule_0_3_CheckCSP_expressionFBB(
			XProviderToProviderRule _this, CSP csp) {
		boolean _localVariable_0 = _this.isAppropriate_checkCsp_FWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_XProviderToProviderRule_0_4_collectelementstobetranslated_blackBBB(Match match,
			XProvider xAgent, XContainer xContainer) {
		return new Object[] { match, xAgent, xContainer };
	}

	public static final Object[] pattern_XProviderToProviderRule_0_4_collectelementstobetranslated_greenBBBF(
			Match match, XProvider xAgent, XContainer xContainer) {
		EMoflonEdge xContainer__xAgent____agents = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		match.getToBeTranslatedNodes().add(xAgent);
		String xContainer__xAgent____agents_name_prime = "agents";
		xContainer__xAgent____agents.setSrc(xContainer);
		xContainer__xAgent____agents.setTrg(xAgent);
		match.getToBeTranslatedEdges().add(xContainer__xAgent____agents);
		xContainer__xAgent____agents.setName(xContainer__xAgent____agents_name_prime);
		return new Object[] { match, xAgent, xContainer, xContainer__xAgent____agents };
	}

	public static final Object[] pattern_XProviderToProviderRule_0_5_collectcontextelements_blackBBB(Match match,
			XProvider xAgent, XContainer xContainer) {
		return new Object[] { match, xAgent, xContainer };
	}

	public static final Object[] pattern_XProviderToProviderRule_0_5_collectcontextelements_greenBB(Match match,
			XContainer xContainer) {
		match.getContextNodes().add(xContainer);
		return new Object[] { match, xContainer };
	}

	public static final void pattern_XProviderToProviderRule_0_6_registerobjectstomatch_expressionBBBB(
			XProviderToProviderRule _this, Match match, XProvider xAgent, XContainer xContainer) {
		_this.registerObjectsToMatch_FWD(match, xAgent, xContainer);

	}

	public static final boolean pattern_XProviderToProviderRule_0_7_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_XProviderToProviderRule_0_8_expressionF() {
		boolean _result = Boolean.valueOf(false);
		return _result;
	}

	public static final Object[] pattern_XProviderToProviderRule_1_1_performtransformation_bindingFFFFB(
			IsApplicableMatch isApplicableMatch) {
		EObject _localVariable_0 = isApplicableMatch.getObject("container");
		EObject _localVariable_1 = isApplicableMatch.getObject("xAgent");
		EObject _localVariable_2 = isApplicableMatch.getObject("xContainerToContainer");
		EObject _localVariable_3 = isApplicableMatch.getObject("xContainer");
		EObject tmpContainer = _localVariable_0;
		EObject tmpXAgent = _localVariable_1;
		EObject tmpXContainerToContainer = _localVariable_2;
		EObject tmpXContainer = _localVariable_3;
		if (tmpContainer instanceof Container) {
			Container container = (Container) tmpContainer;
			if (tmpXAgent instanceof XProvider) {
				XProvider xAgent = (XProvider) tmpXAgent;
				if (tmpXContainerToContainer instanceof XContainerToContainer) {
					XContainerToContainer xContainerToContainer = (XContainerToContainer) tmpXContainerToContainer;
					if (tmpXContainer instanceof XContainer) {
						XContainer xContainer = (XContainer) tmpXContainer;
						return new Object[] { container, xAgent, xContainerToContainer, xContainer, isApplicableMatch };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_XProviderToProviderRule_1_1_performtransformation_blackBBBBFBB(
			Container container, XProvider xAgent, XContainerToContainer xContainerToContainer, XContainer xContainer,
			XProviderToProviderRule _this, IsApplicableMatch isApplicableMatch) {
		for (EObject tmpCsp : isApplicableMatch.getAttributeInfo()) {
			if (tmpCsp instanceof CSP) {
				CSP csp = (CSP) tmpCsp;
				return new Object[] { container, xAgent, xContainerToContainer, xContainer, csp, _this,
						isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_XProviderToProviderRule_1_1_performtransformation_bindingAndBlackFFFFFBB(
			XProviderToProviderRule _this, IsApplicableMatch isApplicableMatch) {
		Object[] result_pattern_XProviderToProviderRule_1_1_performtransformation_binding = pattern_XProviderToProviderRule_1_1_performtransformation_bindingFFFFB(
				isApplicableMatch);
		if (result_pattern_XProviderToProviderRule_1_1_performtransformation_binding != null) {
			Container container = (Container) result_pattern_XProviderToProviderRule_1_1_performtransformation_binding[0];
			XProvider xAgent = (XProvider) result_pattern_XProviderToProviderRule_1_1_performtransformation_binding[1];
			XContainerToContainer xContainerToContainer = (XContainerToContainer) result_pattern_XProviderToProviderRule_1_1_performtransformation_binding[2];
			XContainer xContainer = (XContainer) result_pattern_XProviderToProviderRule_1_1_performtransformation_binding[3];

			Object[] result_pattern_XProviderToProviderRule_1_1_performtransformation_black = pattern_XProviderToProviderRule_1_1_performtransformation_blackBBBBFBB(
					container, xAgent, xContainerToContainer, xContainer, _this, isApplicableMatch);
			if (result_pattern_XProviderToProviderRule_1_1_performtransformation_black != null) {
				CSP csp = (CSP) result_pattern_XProviderToProviderRule_1_1_performtransformation_black[4];

				return new Object[] { container, xAgent, xContainerToContainer, xContainer, csp, _this,
						isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_XProviderToProviderRule_1_1_performtransformation_greenBFFBB(
			Container container, XProvider xAgent, CSP csp) {
		XAgentToAgent xAgentToAgent = RequirementsTransformatorFactory.eINSTANCE.createXAgentToAgent();
		Provider agent = RequirementsFactory.eINSTANCE.createProvider();
		Object _localVariable_0 = csp.getValue("agent", "speed");
		Object _localVariable_1 = csp.getValue("agent", "name");
		xAgentToAgent.setSource(xAgent);
		xAgentToAgent.setTarget(agent);
		container.getAgents().add(agent);
		BigInteger agent_speed_prime = (BigInteger) _localVariable_0;
		String agent_name_prime = (String) _localVariable_1;
		agent.setSpeed(agent_speed_prime);
		agent.setName(agent_name_prime);
		return new Object[] { container, xAgentToAgent, agent, xAgent, csp };
	}

	public static final Object[] pattern_XProviderToProviderRule_1_2_collecttranslatedelements_blackBBB(
			XAgentToAgent xAgentToAgent, Provider agent, XProvider xAgent) {
		return new Object[] { xAgentToAgent, agent, xAgent };
	}

	public static final Object[] pattern_XProviderToProviderRule_1_2_collecttranslatedelements_greenFBBB(
			XAgentToAgent xAgentToAgent, Provider agent, XProvider xAgent) {
		PerformRuleResult ruleresult = RuntimeFactory.eINSTANCE.createPerformRuleResult();
		ruleresult.getCreatedLinkElements().add(xAgentToAgent);
		ruleresult.getCreatedElements().add(agent);
		ruleresult.getTranslatedElements().add(xAgent);
		return new Object[] { ruleresult, xAgentToAgent, agent, xAgent };
	}

	public static final Object[] pattern_XProviderToProviderRule_1_3_bookkeepingforedges_blackBBBBBBB(
			PerformRuleResult ruleresult, EObject container, EObject xAgentToAgent, EObject agent, EObject xAgent,
			EObject xContainerToContainer, EObject xContainer) {
		if (!container.equals(xAgentToAgent)) {
			if (!container.equals(xAgent)) {
				if (!container.equals(xContainerToContainer)) {
					if (!container.equals(xContainer)) {
						if (!xAgentToAgent.equals(xContainerToContainer)) {
							if (!xAgentToAgent.equals(xContainer)) {
								if (!agent.equals(container)) {
									if (!agent.equals(xAgentToAgent)) {
										if (!agent.equals(xAgent)) {
											if (!agent.equals(xContainerToContainer)) {
												if (!agent.equals(xContainer)) {
													if (!xAgent.equals(xAgentToAgent)) {
														if (!xAgent.equals(xContainerToContainer)) {
															if (!xAgent.equals(xContainer)) {
																if (!xContainer.equals(xContainerToContainer)) {
																	return new Object[] { ruleresult, container,
																			xAgentToAgent, agent, xAgent,
																			xContainerToContainer, xContainer };
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

	public static final Object[] pattern_XProviderToProviderRule_1_3_bookkeepingforedges_greenBBBBBBFFFF(
			PerformRuleResult ruleresult, EObject container, EObject xAgentToAgent, EObject agent, EObject xAgent,
			EObject xContainer) {
		EMoflonEdge xAgentToAgent__agent____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge container__agent____agents = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge xContainer__xAgent____agents = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge xAgentToAgent__xAgent____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String ruleresult_ruleName_prime = "XProviderToProviderRule";
		String xAgentToAgent__agent____target_name_prime = "target";
		String container__agent____agents_name_prime = "agents";
		String xContainer__xAgent____agents_name_prime = "agents";
		String xAgentToAgent__xAgent____source_name_prime = "source";
		xAgentToAgent__agent____target.setSrc(xAgentToAgent);
		xAgentToAgent__agent____target.setTrg(agent);
		ruleresult.getCreatedEdges().add(xAgentToAgent__agent____target);
		container__agent____agents.setSrc(container);
		container__agent____agents.setTrg(agent);
		ruleresult.getCreatedEdges().add(container__agent____agents);
		xContainer__xAgent____agents.setSrc(xContainer);
		xContainer__xAgent____agents.setTrg(xAgent);
		ruleresult.getTranslatedEdges().add(xContainer__xAgent____agents);
		xAgentToAgent__xAgent____source.setSrc(xAgentToAgent);
		xAgentToAgent__xAgent____source.setTrg(xAgent);
		ruleresult.getCreatedEdges().add(xAgentToAgent__xAgent____source);
		ruleresult.setRuleName(ruleresult_ruleName_prime);
		xAgentToAgent__agent____target.setName(xAgentToAgent__agent____target_name_prime);
		container__agent____agents.setName(container__agent____agents_name_prime);
		xContainer__xAgent____agents.setName(xContainer__xAgent____agents_name_prime);
		xAgentToAgent__xAgent____source.setName(xAgentToAgent__xAgent____source_name_prime);
		return new Object[] { ruleresult, container, xAgentToAgent, agent, xAgent, xContainer,
				xAgentToAgent__agent____target, container__agent____agents, xContainer__xAgent____agents,
				xAgentToAgent__xAgent____source };
	}

	public static final void pattern_XProviderToProviderRule_1_5_registerobjects_expressionBBBBBBBB(
			XProviderToProviderRule _this, PerformRuleResult ruleresult, EObject container, EObject xAgentToAgent,
			EObject agent, EObject xAgent, EObject xContainerToContainer, EObject xContainer) {
		_this.registerObjects_FWD(ruleresult, container, xAgentToAgent, agent, xAgent, xContainerToContainer,
				xContainer);

	}

	public static final PerformRuleResult pattern_XProviderToProviderRule_1_6_expressionFB(
			PerformRuleResult ruleresult) {
		PerformRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_XProviderToProviderRule_2_1_preparereturnvalue_bindingFB(
			XProviderToProviderRule _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass eClass = _localVariable_0;
		if (eClass != null) {
			return new Object[] { eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_XProviderToProviderRule_2_1_preparereturnvalue_blackFBB(EClass eClass,
			XProviderToProviderRule _this) {
		for (EOperation performOperation : eClass.getEOperations()) {
			String performOperation_name = performOperation.getName();
			if (performOperation_name.equals("perform_FWD")) {
				return new Object[] { performOperation, eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_XProviderToProviderRule_2_1_preparereturnvalue_bindingAndBlackFFB(
			XProviderToProviderRule _this) {
		Object[] result_pattern_XProviderToProviderRule_2_1_preparereturnvalue_binding = pattern_XProviderToProviderRule_2_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_XProviderToProviderRule_2_1_preparereturnvalue_binding != null) {
			EClass eClass = (EClass) result_pattern_XProviderToProviderRule_2_1_preparereturnvalue_binding[0];

			Object[] result_pattern_XProviderToProviderRule_2_1_preparereturnvalue_black = pattern_XProviderToProviderRule_2_1_preparereturnvalue_blackFBB(
					eClass, _this);
			if (result_pattern_XProviderToProviderRule_2_1_preparereturnvalue_black != null) {
				EOperation performOperation = (EOperation) result_pattern_XProviderToProviderRule_2_1_preparereturnvalue_black[0];

				return new Object[] { performOperation, eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_XProviderToProviderRule_2_1_preparereturnvalue_greenBF(
			EOperation performOperation) {
		IsApplicableRuleResult ruleresult = RuntimeFactory.eINSTANCE.createIsApplicableRuleResult();
		boolean ruleresult_success_prime = Boolean.valueOf(false);
		String ruleresult_rule_prime = "XProviderToProviderRule";
		ruleresult.setPerformOperation(performOperation);
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		ruleresult.setRule(ruleresult_rule_prime);
		return new Object[] { performOperation, ruleresult };
	}

	public static final Object[] pattern_XProviderToProviderRule_2_2_corematch_bindingFFB(Match match) {
		EObject _localVariable_0 = match.getObject("xAgent");
		EObject _localVariable_1 = match.getObject("xContainer");
		EObject tmpXAgent = _localVariable_0;
		EObject tmpXContainer = _localVariable_1;
		if (tmpXAgent instanceof XProvider) {
			XProvider xAgent = (XProvider) tmpXAgent;
			if (tmpXContainer instanceof XContainer) {
				XContainer xContainer = (XContainer) tmpXContainer;
				return new Object[] { xAgent, xContainer, match };
			}
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_XProviderToProviderRule_2_2_corematch_blackFBFBB(XProvider xAgent,
			XContainer xContainer, Match match) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		for (XContainerToContainer xContainerToContainer : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(xContainer, XContainerToContainer.class, "source")) {
			Container container = xContainerToContainer.getTarget();
			if (container != null) {
				_result.add(new Object[] { container, xAgent, xContainerToContainer, xContainer, match });
			}

		}
		return _result;
	}

	public static final Iterable<Object[]> pattern_XProviderToProviderRule_2_3_findcontext_blackBBBB(
			Container container, XProvider xAgent, XContainerToContainer xContainerToContainer, XContainer xContainer) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (xContainer.equals(xContainerToContainer.getSource())) {
			if (container.equals(xContainerToContainer.getTarget())) {
				if (xContainer.getAgents().contains(xAgent)) {
					_result.add(new Object[] { container, xAgent, xContainerToContainer, xContainer });
				}
			}
		}
		return _result;
	}

	public static final Object[] pattern_XProviderToProviderRule_2_3_findcontext_greenBBBBFFFF(Container container,
			XProvider xAgent, XContainerToContainer xContainerToContainer, XContainer xContainer) {
		IsApplicableMatch isApplicableMatch = RuntimeFactory.eINSTANCE.createIsApplicableMatch();
		EMoflonEdge xContainerToContainer__xContainer____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge xContainerToContainer__container____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge xContainer__xAgent____agents = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String xContainerToContainer__xContainer____source_name_prime = "source";
		String xContainerToContainer__container____target_name_prime = "target";
		String xContainer__xAgent____agents_name_prime = "agents";
		isApplicableMatch.getAllContextElements().add(container);
		isApplicableMatch.getAllContextElements().add(xAgent);
		isApplicableMatch.getAllContextElements().add(xContainerToContainer);
		isApplicableMatch.getAllContextElements().add(xContainer);
		xContainerToContainer__xContainer____source.setSrc(xContainerToContainer);
		xContainerToContainer__xContainer____source.setTrg(xContainer);
		isApplicableMatch.getAllContextElements().add(xContainerToContainer__xContainer____source);
		xContainerToContainer__container____target.setSrc(xContainerToContainer);
		xContainerToContainer__container____target.setTrg(container);
		isApplicableMatch.getAllContextElements().add(xContainerToContainer__container____target);
		xContainer__xAgent____agents.setSrc(xContainer);
		xContainer__xAgent____agents.setTrg(xAgent);
		isApplicableMatch.getAllContextElements().add(xContainer__xAgent____agents);
		xContainerToContainer__xContainer____source.setName(xContainerToContainer__xContainer____source_name_prime);
		xContainerToContainer__container____target.setName(xContainerToContainer__container____target_name_prime);
		xContainer__xAgent____agents.setName(xContainer__xAgent____agents_name_prime);
		return new Object[] { container, xAgent, xContainerToContainer, xContainer, isApplicableMatch,
				xContainerToContainer__xContainer____source, xContainerToContainer__container____target,
				xContainer__xAgent____agents };
	}

	public static final Object[] pattern_XProviderToProviderRule_2_4_solveCSP_bindingFBBBBBB(
			XProviderToProviderRule _this, IsApplicableMatch isApplicableMatch, Container container, XProvider xAgent,
			XContainerToContainer xContainerToContainer, XContainer xContainer) {
		CSP _localVariable_0 = _this.isApplicable_solveCsp_FWD(isApplicableMatch, container, xAgent,
				xContainerToContainer, xContainer);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, container, xAgent, xContainerToContainer, xContainer };
		}
		return null;
	}

	public static final Object[] pattern_XProviderToProviderRule_2_4_solveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_XProviderToProviderRule_2_4_solveCSP_bindingAndBlackFBBBBBB(
			XProviderToProviderRule _this, IsApplicableMatch isApplicableMatch, Container container, XProvider xAgent,
			XContainerToContainer xContainerToContainer, XContainer xContainer) {
		Object[] result_pattern_XProviderToProviderRule_2_4_solveCSP_binding = pattern_XProviderToProviderRule_2_4_solveCSP_bindingFBBBBBB(
				_this, isApplicableMatch, container, xAgent, xContainerToContainer, xContainer);
		if (result_pattern_XProviderToProviderRule_2_4_solveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_XProviderToProviderRule_2_4_solveCSP_binding[0];

			Object[] result_pattern_XProviderToProviderRule_2_4_solveCSP_black = pattern_XProviderToProviderRule_2_4_solveCSP_blackB(
					csp);
			if (result_pattern_XProviderToProviderRule_2_4_solveCSP_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, container, xAgent, xContainerToContainer,
						xContainer };
			}
		}
		return null;
	}

	public static final boolean pattern_XProviderToProviderRule_2_5_checkCSP_expressionFBB(
			XProviderToProviderRule _this, CSP csp) {
		boolean _localVariable_0 = _this.isApplicable_checkCsp_FWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_XProviderToProviderRule_2_6_addmatchtoruleresult_blackBB(
			IsApplicableRuleResult ruleresult, IsApplicableMatch isApplicableMatch) {
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final Object[] pattern_XProviderToProviderRule_2_6_addmatchtoruleresult_greenBB(
			IsApplicableRuleResult ruleresult, IsApplicableMatch isApplicableMatch) {
		ruleresult.getIsApplicableMatch().add(isApplicableMatch);
		boolean ruleresult_success_prime = Boolean.valueOf(true);
		String isApplicableMatch_ruleName_prime = "XProviderToProviderRule";
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		isApplicableMatch.setRuleName(isApplicableMatch_ruleName_prime);
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final IsApplicableRuleResult pattern_XProviderToProviderRule_2_7_expressionFB(
			IsApplicableRuleResult ruleresult) {
		IsApplicableRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_XProviderToProviderRule_10_1_initialbindings_blackBBBB(
			XProviderToProviderRule _this, Match match, Container container, Provider agent) {
		return new Object[] { _this, match, container, agent };
	}

	public static final Object[] pattern_XProviderToProviderRule_10_2_SolveCSP_bindingFBBBB(
			XProviderToProviderRule _this, Match match, Container container, Provider agent) {
		CSP _localVariable_0 = _this.isAppropriate_solveCsp_BWD(match, container, agent);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, match, container, agent };
		}
		return null;
	}

	public static final Object[] pattern_XProviderToProviderRule_10_2_SolveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_XProviderToProviderRule_10_2_SolveCSP_bindingAndBlackFBBBB(
			XProviderToProviderRule _this, Match match, Container container, Provider agent) {
		Object[] result_pattern_XProviderToProviderRule_10_2_SolveCSP_binding = pattern_XProviderToProviderRule_10_2_SolveCSP_bindingFBBBB(
				_this, match, container, agent);
		if (result_pattern_XProviderToProviderRule_10_2_SolveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_XProviderToProviderRule_10_2_SolveCSP_binding[0];

			Object[] result_pattern_XProviderToProviderRule_10_2_SolveCSP_black = pattern_XProviderToProviderRule_10_2_SolveCSP_blackB(
					csp);
			if (result_pattern_XProviderToProviderRule_10_2_SolveCSP_black != null) {

				return new Object[] { csp, _this, match, container, agent };
			}
		}
		return null;
	}

	public static final boolean pattern_XProviderToProviderRule_10_3_CheckCSP_expressionFBB(
			XProviderToProviderRule _this, CSP csp) {
		boolean _localVariable_0 = _this.isAppropriate_checkCsp_BWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_XProviderToProviderRule_10_4_collectelementstobetranslated_blackBBB(
			Match match, Container container, Provider agent) {
		return new Object[] { match, container, agent };
	}

	public static final Object[] pattern_XProviderToProviderRule_10_4_collectelementstobetranslated_greenBBBF(
			Match match, Container container, Provider agent) {
		EMoflonEdge container__agent____agents = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		match.getToBeTranslatedNodes().add(agent);
		String container__agent____agents_name_prime = "agents";
		container__agent____agents.setSrc(container);
		container__agent____agents.setTrg(agent);
		match.getToBeTranslatedEdges().add(container__agent____agents);
		container__agent____agents.setName(container__agent____agents_name_prime);
		return new Object[] { match, container, agent, container__agent____agents };
	}

	public static final Object[] pattern_XProviderToProviderRule_10_5_collectcontextelements_blackBBB(Match match,
			Container container, Provider agent) {
		return new Object[] { match, container, agent };
	}

	public static final Object[] pattern_XProviderToProviderRule_10_5_collectcontextelements_greenBB(Match match,
			Container container) {
		match.getContextNodes().add(container);
		return new Object[] { match, container };
	}

	public static final void pattern_XProviderToProviderRule_10_6_registerobjectstomatch_expressionBBBB(
			XProviderToProviderRule _this, Match match, Container container, Provider agent) {
		_this.registerObjectsToMatch_BWD(match, container, agent);

	}

	public static final boolean pattern_XProviderToProviderRule_10_7_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_XProviderToProviderRule_10_8_expressionF() {
		boolean _result = Boolean.valueOf(false);
		return _result;
	}

	public static final Object[] pattern_XProviderToProviderRule_11_1_performtransformation_bindingFFFFB(
			IsApplicableMatch isApplicableMatch) {
		EObject _localVariable_0 = isApplicableMatch.getObject("container");
		EObject _localVariable_1 = isApplicableMatch.getObject("agent");
		EObject _localVariable_2 = isApplicableMatch.getObject("xContainerToContainer");
		EObject _localVariable_3 = isApplicableMatch.getObject("xContainer");
		EObject tmpContainer = _localVariable_0;
		EObject tmpAgent = _localVariable_1;
		EObject tmpXContainerToContainer = _localVariable_2;
		EObject tmpXContainer = _localVariable_3;
		if (tmpContainer instanceof Container) {
			Container container = (Container) tmpContainer;
			if (tmpAgent instanceof Provider) {
				Provider agent = (Provider) tmpAgent;
				if (tmpXContainerToContainer instanceof XContainerToContainer) {
					XContainerToContainer xContainerToContainer = (XContainerToContainer) tmpXContainerToContainer;
					if (tmpXContainer instanceof XContainer) {
						XContainer xContainer = (XContainer) tmpXContainer;
						return new Object[] { container, agent, xContainerToContainer, xContainer, isApplicableMatch };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_XProviderToProviderRule_11_1_performtransformation_blackBBBBFBB(
			Container container, Provider agent, XContainerToContainer xContainerToContainer, XContainer xContainer,
			XProviderToProviderRule _this, IsApplicableMatch isApplicableMatch) {
		for (EObject tmpCsp : isApplicableMatch.getAttributeInfo()) {
			if (tmpCsp instanceof CSP) {
				CSP csp = (CSP) tmpCsp;
				return new Object[] { container, agent, xContainerToContainer, xContainer, csp, _this,
						isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_XProviderToProviderRule_11_1_performtransformation_bindingAndBlackFFFFFBB(
			XProviderToProviderRule _this, IsApplicableMatch isApplicableMatch) {
		Object[] result_pattern_XProviderToProviderRule_11_1_performtransformation_binding = pattern_XProviderToProviderRule_11_1_performtransformation_bindingFFFFB(
				isApplicableMatch);
		if (result_pattern_XProviderToProviderRule_11_1_performtransformation_binding != null) {
			Container container = (Container) result_pattern_XProviderToProviderRule_11_1_performtransformation_binding[0];
			Provider agent = (Provider) result_pattern_XProviderToProviderRule_11_1_performtransformation_binding[1];
			XContainerToContainer xContainerToContainer = (XContainerToContainer) result_pattern_XProviderToProviderRule_11_1_performtransformation_binding[2];
			XContainer xContainer = (XContainer) result_pattern_XProviderToProviderRule_11_1_performtransformation_binding[3];

			Object[] result_pattern_XProviderToProviderRule_11_1_performtransformation_black = pattern_XProviderToProviderRule_11_1_performtransformation_blackBBBBFBB(
					container, agent, xContainerToContainer, xContainer, _this, isApplicableMatch);
			if (result_pattern_XProviderToProviderRule_11_1_performtransformation_black != null) {
				CSP csp = (CSP) result_pattern_XProviderToProviderRule_11_1_performtransformation_black[4];

				return new Object[] { container, agent, xContainerToContainer, xContainer, csp, _this,
						isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_XProviderToProviderRule_11_1_performtransformation_greenFBFBB(Provider agent,
			XContainer xContainer, CSP csp) {
		XAgentToAgent xAgentToAgent = RequirementsTransformatorFactory.eINSTANCE.createXAgentToAgent();
		XProvider xAgent = ReqXtextFactory.eINSTANCE.createXProvider();
		Object _localVariable_0 = csp.getValue("xAgent", "speed");
		Object _localVariable_1 = csp.getValue("xAgent", "name");
		xAgentToAgent.setTarget(agent);
		xContainer.getAgents().add(xAgent);
		xAgentToAgent.setSource(xAgent);
		BigInteger xAgent_speed_prime = (BigInteger) _localVariable_0;
		String xAgent_name_prime = (String) _localVariable_1;
		xAgent.setSpeed(xAgent_speed_prime);
		xAgent.setName(xAgent_name_prime);
		return new Object[] { xAgentToAgent, agent, xAgent, xContainer, csp };
	}

	public static final Object[] pattern_XProviderToProviderRule_11_2_collecttranslatedelements_blackBBB(
			XAgentToAgent xAgentToAgent, Provider agent, XProvider xAgent) {
		return new Object[] { xAgentToAgent, agent, xAgent };
	}

	public static final Object[] pattern_XProviderToProviderRule_11_2_collecttranslatedelements_greenFBBB(
			XAgentToAgent xAgentToAgent, Provider agent, XProvider xAgent) {
		PerformRuleResult ruleresult = RuntimeFactory.eINSTANCE.createPerformRuleResult();
		ruleresult.getCreatedLinkElements().add(xAgentToAgent);
		ruleresult.getTranslatedElements().add(agent);
		ruleresult.getCreatedElements().add(xAgent);
		return new Object[] { ruleresult, xAgentToAgent, agent, xAgent };
	}

	public static final Object[] pattern_XProviderToProviderRule_11_3_bookkeepingforedges_blackBBBBBBB(
			PerformRuleResult ruleresult, EObject container, EObject xAgentToAgent, EObject agent, EObject xAgent,
			EObject xContainerToContainer, EObject xContainer) {
		if (!container.equals(xAgentToAgent)) {
			if (!container.equals(xAgent)) {
				if (!container.equals(xContainerToContainer)) {
					if (!container.equals(xContainer)) {
						if (!xAgentToAgent.equals(xContainerToContainer)) {
							if (!xAgentToAgent.equals(xContainer)) {
								if (!agent.equals(container)) {
									if (!agent.equals(xAgentToAgent)) {
										if (!agent.equals(xAgent)) {
											if (!agent.equals(xContainerToContainer)) {
												if (!agent.equals(xContainer)) {
													if (!xAgent.equals(xAgentToAgent)) {
														if (!xAgent.equals(xContainerToContainer)) {
															if (!xAgent.equals(xContainer)) {
																if (!xContainer.equals(xContainerToContainer)) {
																	return new Object[] { ruleresult, container,
																			xAgentToAgent, agent, xAgent,
																			xContainerToContainer, xContainer };
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

	public static final Object[] pattern_XProviderToProviderRule_11_3_bookkeepingforedges_greenBBBBBBFFFF(
			PerformRuleResult ruleresult, EObject container, EObject xAgentToAgent, EObject agent, EObject xAgent,
			EObject xContainer) {
		EMoflonEdge xAgentToAgent__agent____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge container__agent____agents = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge xContainer__xAgent____agents = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge xAgentToAgent__xAgent____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String ruleresult_ruleName_prime = "XProviderToProviderRule";
		String xAgentToAgent__agent____target_name_prime = "target";
		String container__agent____agents_name_prime = "agents";
		String xContainer__xAgent____agents_name_prime = "agents";
		String xAgentToAgent__xAgent____source_name_prime = "source";
		xAgentToAgent__agent____target.setSrc(xAgentToAgent);
		xAgentToAgent__agent____target.setTrg(agent);
		ruleresult.getCreatedEdges().add(xAgentToAgent__agent____target);
		container__agent____agents.setSrc(container);
		container__agent____agents.setTrg(agent);
		ruleresult.getTranslatedEdges().add(container__agent____agents);
		xContainer__xAgent____agents.setSrc(xContainer);
		xContainer__xAgent____agents.setTrg(xAgent);
		ruleresult.getCreatedEdges().add(xContainer__xAgent____agents);
		xAgentToAgent__xAgent____source.setSrc(xAgentToAgent);
		xAgentToAgent__xAgent____source.setTrg(xAgent);
		ruleresult.getCreatedEdges().add(xAgentToAgent__xAgent____source);
		ruleresult.setRuleName(ruleresult_ruleName_prime);
		xAgentToAgent__agent____target.setName(xAgentToAgent__agent____target_name_prime);
		container__agent____agents.setName(container__agent____agents_name_prime);
		xContainer__xAgent____agents.setName(xContainer__xAgent____agents_name_prime);
		xAgentToAgent__xAgent____source.setName(xAgentToAgent__xAgent____source_name_prime);
		return new Object[] { ruleresult, container, xAgentToAgent, agent, xAgent, xContainer,
				xAgentToAgent__agent____target, container__agent____agents, xContainer__xAgent____agents,
				xAgentToAgent__xAgent____source };
	}

	public static final void pattern_XProviderToProviderRule_11_5_registerobjects_expressionBBBBBBBB(
			XProviderToProviderRule _this, PerformRuleResult ruleresult, EObject container, EObject xAgentToAgent,
			EObject agent, EObject xAgent, EObject xContainerToContainer, EObject xContainer) {
		_this.registerObjects_BWD(ruleresult, container, xAgentToAgent, agent, xAgent, xContainerToContainer,
				xContainer);

	}

	public static final PerformRuleResult pattern_XProviderToProviderRule_11_6_expressionFB(
			PerformRuleResult ruleresult) {
		PerformRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_XProviderToProviderRule_12_1_preparereturnvalue_bindingFB(
			XProviderToProviderRule _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass eClass = _localVariable_0;
		if (eClass != null) {
			return new Object[] { eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_XProviderToProviderRule_12_1_preparereturnvalue_blackFBB(EClass eClass,
			XProviderToProviderRule _this) {
		for (EOperation performOperation : eClass.getEOperations()) {
			String performOperation_name = performOperation.getName();
			if (performOperation_name.equals("perform_BWD")) {
				return new Object[] { performOperation, eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_XProviderToProviderRule_12_1_preparereturnvalue_bindingAndBlackFFB(
			XProviderToProviderRule _this) {
		Object[] result_pattern_XProviderToProviderRule_12_1_preparereturnvalue_binding = pattern_XProviderToProviderRule_12_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_XProviderToProviderRule_12_1_preparereturnvalue_binding != null) {
			EClass eClass = (EClass) result_pattern_XProviderToProviderRule_12_1_preparereturnvalue_binding[0];

			Object[] result_pattern_XProviderToProviderRule_12_1_preparereturnvalue_black = pattern_XProviderToProviderRule_12_1_preparereturnvalue_blackFBB(
					eClass, _this);
			if (result_pattern_XProviderToProviderRule_12_1_preparereturnvalue_black != null) {
				EOperation performOperation = (EOperation) result_pattern_XProviderToProviderRule_12_1_preparereturnvalue_black[0];

				return new Object[] { performOperation, eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_XProviderToProviderRule_12_1_preparereturnvalue_greenBF(
			EOperation performOperation) {
		IsApplicableRuleResult ruleresult = RuntimeFactory.eINSTANCE.createIsApplicableRuleResult();
		boolean ruleresult_success_prime = Boolean.valueOf(false);
		String ruleresult_rule_prime = "XProviderToProviderRule";
		ruleresult.setPerformOperation(performOperation);
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		ruleresult.setRule(ruleresult_rule_prime);
		return new Object[] { performOperation, ruleresult };
	}

	public static final Object[] pattern_XProviderToProviderRule_12_2_corematch_bindingFFB(Match match) {
		EObject _localVariable_0 = match.getObject("container");
		EObject _localVariable_1 = match.getObject("agent");
		EObject tmpContainer = _localVariable_0;
		EObject tmpAgent = _localVariable_1;
		if (tmpContainer instanceof Container) {
			Container container = (Container) tmpContainer;
			if (tmpAgent instanceof Provider) {
				Provider agent = (Provider) tmpAgent;
				return new Object[] { container, agent, match };
			}
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_XProviderToProviderRule_12_2_corematch_blackBBFFB(
			Container container, Provider agent, Match match) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		for (XContainerToContainer xContainerToContainer : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(container, XContainerToContainer.class, "target")) {
			XContainer xContainer = xContainerToContainer.getSource();
			if (xContainer != null) {
				_result.add(new Object[] { container, agent, xContainerToContainer, xContainer, match });
			}

		}
		return _result;
	}

	public static final Iterable<Object[]> pattern_XProviderToProviderRule_12_3_findcontext_blackBBBB(
			Container container, Provider agent, XContainerToContainer xContainerToContainer, XContainer xContainer) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (xContainer.equals(xContainerToContainer.getSource())) {
			if (container.equals(xContainerToContainer.getTarget())) {
				if (container.getAgents().contains(agent)) {
					_result.add(new Object[] { container, agent, xContainerToContainer, xContainer });
				}
			}
		}
		return _result;
	}

	public static final Object[] pattern_XProviderToProviderRule_12_3_findcontext_greenBBBBFFFF(Container container,
			Provider agent, XContainerToContainer xContainerToContainer, XContainer xContainer) {
		IsApplicableMatch isApplicableMatch = RuntimeFactory.eINSTANCE.createIsApplicableMatch();
		EMoflonEdge xContainerToContainer__xContainer____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge xContainerToContainer__container____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge container__agent____agents = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String xContainerToContainer__xContainer____source_name_prime = "source";
		String xContainerToContainer__container____target_name_prime = "target";
		String container__agent____agents_name_prime = "agents";
		isApplicableMatch.getAllContextElements().add(container);
		isApplicableMatch.getAllContextElements().add(agent);
		isApplicableMatch.getAllContextElements().add(xContainerToContainer);
		isApplicableMatch.getAllContextElements().add(xContainer);
		xContainerToContainer__xContainer____source.setSrc(xContainerToContainer);
		xContainerToContainer__xContainer____source.setTrg(xContainer);
		isApplicableMatch.getAllContextElements().add(xContainerToContainer__xContainer____source);
		xContainerToContainer__container____target.setSrc(xContainerToContainer);
		xContainerToContainer__container____target.setTrg(container);
		isApplicableMatch.getAllContextElements().add(xContainerToContainer__container____target);
		container__agent____agents.setSrc(container);
		container__agent____agents.setTrg(agent);
		isApplicableMatch.getAllContextElements().add(container__agent____agents);
		xContainerToContainer__xContainer____source.setName(xContainerToContainer__xContainer____source_name_prime);
		xContainerToContainer__container____target.setName(xContainerToContainer__container____target_name_prime);
		container__agent____agents.setName(container__agent____agents_name_prime);
		return new Object[] { container, agent, xContainerToContainer, xContainer, isApplicableMatch,
				xContainerToContainer__xContainer____source, xContainerToContainer__container____target,
				container__agent____agents };
	}

	public static final Object[] pattern_XProviderToProviderRule_12_4_solveCSP_bindingFBBBBBB(
			XProviderToProviderRule _this, IsApplicableMatch isApplicableMatch, Container container, Provider agent,
			XContainerToContainer xContainerToContainer, XContainer xContainer) {
		CSP _localVariable_0 = _this.isApplicable_solveCsp_BWD(isApplicableMatch, container, agent,
				xContainerToContainer, xContainer);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, container, agent, xContainerToContainer, xContainer };
		}
		return null;
	}

	public static final Object[] pattern_XProviderToProviderRule_12_4_solveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_XProviderToProviderRule_12_4_solveCSP_bindingAndBlackFBBBBBB(
			XProviderToProviderRule _this, IsApplicableMatch isApplicableMatch, Container container, Provider agent,
			XContainerToContainer xContainerToContainer, XContainer xContainer) {
		Object[] result_pattern_XProviderToProviderRule_12_4_solveCSP_binding = pattern_XProviderToProviderRule_12_4_solveCSP_bindingFBBBBBB(
				_this, isApplicableMatch, container, agent, xContainerToContainer, xContainer);
		if (result_pattern_XProviderToProviderRule_12_4_solveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_XProviderToProviderRule_12_4_solveCSP_binding[0];

			Object[] result_pattern_XProviderToProviderRule_12_4_solveCSP_black = pattern_XProviderToProviderRule_12_4_solveCSP_blackB(
					csp);
			if (result_pattern_XProviderToProviderRule_12_4_solveCSP_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, container, agent, xContainerToContainer,
						xContainer };
			}
		}
		return null;
	}

	public static final boolean pattern_XProviderToProviderRule_12_5_checkCSP_expressionFBB(
			XProviderToProviderRule _this, CSP csp) {
		boolean _localVariable_0 = _this.isApplicable_checkCsp_BWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_XProviderToProviderRule_12_6_addmatchtoruleresult_blackBB(
			IsApplicableRuleResult ruleresult, IsApplicableMatch isApplicableMatch) {
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final Object[] pattern_XProviderToProviderRule_12_6_addmatchtoruleresult_greenBB(
			IsApplicableRuleResult ruleresult, IsApplicableMatch isApplicableMatch) {
		ruleresult.getIsApplicableMatch().add(isApplicableMatch);
		boolean ruleresult_success_prime = Boolean.valueOf(true);
		String isApplicableMatch_ruleName_prime = "XProviderToProviderRule";
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		isApplicableMatch.setRuleName(isApplicableMatch_ruleName_prime);
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final IsApplicableRuleResult pattern_XProviderToProviderRule_12_7_expressionFB(
			IsApplicableRuleResult ruleresult) {
		IsApplicableRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_XProviderToProviderRule_20_1_preparereturnvalue_bindingFB(
			XProviderToProviderRule _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_XProviderToProviderRule_20_1_preparereturnvalue_blackFBBF(EClass __eClass,
			XProviderToProviderRule _this) {
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

	public static final Object[] pattern_XProviderToProviderRule_20_1_preparereturnvalue_bindingAndBlackFFBF(
			XProviderToProviderRule _this) {
		Object[] result_pattern_XProviderToProviderRule_20_1_preparereturnvalue_binding = pattern_XProviderToProviderRule_20_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_XProviderToProviderRule_20_1_preparereturnvalue_binding != null) {
			EClass __eClass = (EClass) result_pattern_XProviderToProviderRule_20_1_preparereturnvalue_binding[0];

			Object[] result_pattern_XProviderToProviderRule_20_1_preparereturnvalue_black = pattern_XProviderToProviderRule_20_1_preparereturnvalue_blackFBBF(
					__eClass, _this);
			if (result_pattern_XProviderToProviderRule_20_1_preparereturnvalue_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_XProviderToProviderRule_20_1_preparereturnvalue_black[0];
				EOperation isApplicableCC = (EOperation) result_pattern_XProviderToProviderRule_20_1_preparereturnvalue_black[3];

				return new Object[] { __performOperation, __eClass, _this, isApplicableCC };
			}
		}
		return null;
	}

	public static final Object[] pattern_XProviderToProviderRule_20_1_preparereturnvalue_greenF() {
		EObjectContainer __result = RuntimeFactory.eINSTANCE.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Iterable<Object[]> pattern_XProviderToProviderRule_20_2_testcorematchandDECs_blackFFB(
			EMoflonEdge _edge_agents) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		EObject tmpContainer = _edge_agents.getSrc();
		if (tmpContainer instanceof Container) {
			Container container = (Container) tmpContainer;
			EObject tmpAgent = _edge_agents.getTrg();
			if (tmpAgent instanceof Provider) {
				Provider agent = (Provider) tmpAgent;
				if (container.getAgents().contains(agent)) {
					_result.add(new Object[] { container, agent, _edge_agents });
				}
			}

		}

		return _result;
	}

	public static final Object[] pattern_XProviderToProviderRule_20_2_testcorematchandDECs_greenFB(EClass __eClass) {
		Match match = RuntimeFactory.eINSTANCE.createMatch();
		String __eClass_name = __eClass.getName();
		String match_ruleName_prime = __eClass_name;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_XProviderToProviderRule_20_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBB(
			XProviderToProviderRule _this, Match match, Container container, Provider agent) {
		boolean _localVariable_0 = _this.isAppropriate_BWD(match, container, agent);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_XProviderToProviderRule_20_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(
			XProviderToProviderRule _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_BWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_XProviderToProviderRule_20_5_Addmatchtoruleresult_blackBBBB(Match match,
			EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		if (!__performOperation.equals(isApplicableCC)) {
			return new Object[] { match, __performOperation, __result, isApplicableCC };
		}
		return null;
	}

	public static final Object[] pattern_XProviderToProviderRule_20_5_Addmatchtoruleresult_greenBBBB(Match match,
			EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		match.setIsApplicableCCOperation(isApplicableCC);
		return new Object[] { match, __performOperation, __result, isApplicableCC };
	}

	public static final EObjectContainer pattern_XProviderToProviderRule_20_6_expressionFB(EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_XProviderToProviderRule_21_1_preparereturnvalue_bindingFB(
			XProviderToProviderRule _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_XProviderToProviderRule_21_1_preparereturnvalue_blackFBBF(EClass __eClass,
			XProviderToProviderRule _this) {
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

	public static final Object[] pattern_XProviderToProviderRule_21_1_preparereturnvalue_bindingAndBlackFFBF(
			XProviderToProviderRule _this) {
		Object[] result_pattern_XProviderToProviderRule_21_1_preparereturnvalue_binding = pattern_XProviderToProviderRule_21_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_XProviderToProviderRule_21_1_preparereturnvalue_binding != null) {
			EClass __eClass = (EClass) result_pattern_XProviderToProviderRule_21_1_preparereturnvalue_binding[0];

			Object[] result_pattern_XProviderToProviderRule_21_1_preparereturnvalue_black = pattern_XProviderToProviderRule_21_1_preparereturnvalue_blackFBBF(
					__eClass, _this);
			if (result_pattern_XProviderToProviderRule_21_1_preparereturnvalue_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_XProviderToProviderRule_21_1_preparereturnvalue_black[0];
				EOperation isApplicableCC = (EOperation) result_pattern_XProviderToProviderRule_21_1_preparereturnvalue_black[3];

				return new Object[] { __performOperation, __eClass, _this, isApplicableCC };
			}
		}
		return null;
	}

	public static final Object[] pattern_XProviderToProviderRule_21_1_preparereturnvalue_greenF() {
		EObjectContainer __result = RuntimeFactory.eINSTANCE.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Iterable<Object[]> pattern_XProviderToProviderRule_21_2_testcorematchandDECs_blackFFB(
			EMoflonEdge _edge_agents) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		EObject tmpXContainer = _edge_agents.getSrc();
		if (tmpXContainer instanceof XContainer) {
			XContainer xContainer = (XContainer) tmpXContainer;
			EObject tmpXAgent = _edge_agents.getTrg();
			if (tmpXAgent instanceof XProvider) {
				XProvider xAgent = (XProvider) tmpXAgent;
				if (xContainer.getAgents().contains(xAgent)) {
					_result.add(new Object[] { xAgent, xContainer, _edge_agents });
				}
			}

		}

		return _result;
	}

	public static final Object[] pattern_XProviderToProviderRule_21_2_testcorematchandDECs_greenFB(EClass __eClass) {
		Match match = RuntimeFactory.eINSTANCE.createMatch();
		String __eClass_name = __eClass.getName();
		String match_ruleName_prime = __eClass_name;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_XProviderToProviderRule_21_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBB(
			XProviderToProviderRule _this, Match match, XProvider xAgent, XContainer xContainer) {
		boolean _localVariable_0 = _this.isAppropriate_FWD(match, xAgent, xContainer);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_XProviderToProviderRule_21_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(
			XProviderToProviderRule _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_FWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_XProviderToProviderRule_21_5_Addmatchtoruleresult_blackBBBB(Match match,
			EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		if (!__performOperation.equals(isApplicableCC)) {
			return new Object[] { match, __performOperation, __result, isApplicableCC };
		}
		return null;
	}

	public static final Object[] pattern_XProviderToProviderRule_21_5_Addmatchtoruleresult_greenBBBB(Match match,
			EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		match.setIsApplicableCCOperation(isApplicableCC);
		return new Object[] { match, __performOperation, __result, isApplicableCC };
	}

	public static final EObjectContainer pattern_XProviderToProviderRule_21_6_expressionFB(EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_XProviderToProviderRule_24_1_prepare_blackB(XProviderToProviderRule _this) {
		return new Object[] { _this };
	}

	public static final Object[] pattern_XProviderToProviderRule_24_1_prepare_greenF() {
		IsApplicableRuleResult result = RuntimeFactory.eINSTANCE.createIsApplicableRuleResult();
		return new Object[] { result };
	}

	public static final Object[] pattern_XProviderToProviderRule_24_2_matchsrctrgcontext_bindingFFFFBB(
			Match targetMatch, Match sourceMatch) {
		EObject _localVariable_0 = targetMatch.getObject("container");
		EObject _localVariable_1 = targetMatch.getObject("agent");
		EObject _localVariable_2 = sourceMatch.getObject("xAgent");
		EObject _localVariable_3 = sourceMatch.getObject("xContainer");
		EObject tmpContainer = _localVariable_0;
		EObject tmpAgent = _localVariable_1;
		EObject tmpXAgent = _localVariable_2;
		EObject tmpXContainer = _localVariable_3;
		if (tmpContainer instanceof Container) {
			Container container = (Container) tmpContainer;
			if (tmpAgent instanceof Provider) {
				Provider agent = (Provider) tmpAgent;
				if (tmpXAgent instanceof XProvider) {
					XProvider xAgent = (XProvider) tmpXAgent;
					if (tmpXContainer instanceof XContainer) {
						XContainer xContainer = (XContainer) tmpXContainer;
						return new Object[] { container, agent, xAgent, xContainer, targetMatch, sourceMatch };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_XProviderToProviderRule_24_2_matchsrctrgcontext_blackBBBBBB(
			Container container, Provider agent, XProvider xAgent, XContainer xContainer, Match sourceMatch,
			Match targetMatch) {
		if (!sourceMatch.equals(targetMatch)) {
			return new Object[] { container, agent, xAgent, xContainer, sourceMatch, targetMatch };
		}
		return null;
	}

	public static final Object[] pattern_XProviderToProviderRule_24_2_matchsrctrgcontext_bindingAndBlackFFFFBB(
			Match sourceMatch, Match targetMatch) {
		Object[] result_pattern_XProviderToProviderRule_24_2_matchsrctrgcontext_binding = pattern_XProviderToProviderRule_24_2_matchsrctrgcontext_bindingFFFFBB(
				targetMatch, sourceMatch);
		if (result_pattern_XProviderToProviderRule_24_2_matchsrctrgcontext_binding != null) {
			Container container = (Container) result_pattern_XProviderToProviderRule_24_2_matchsrctrgcontext_binding[0];
			Provider agent = (Provider) result_pattern_XProviderToProviderRule_24_2_matchsrctrgcontext_binding[1];
			XProvider xAgent = (XProvider) result_pattern_XProviderToProviderRule_24_2_matchsrctrgcontext_binding[2];
			XContainer xContainer = (XContainer) result_pattern_XProviderToProviderRule_24_2_matchsrctrgcontext_binding[3];

			Object[] result_pattern_XProviderToProviderRule_24_2_matchsrctrgcontext_black = pattern_XProviderToProviderRule_24_2_matchsrctrgcontext_blackBBBBBB(
					container, agent, xAgent, xContainer, sourceMatch, targetMatch);
			if (result_pattern_XProviderToProviderRule_24_2_matchsrctrgcontext_black != null) {

				return new Object[] { container, agent, xAgent, xContainer, sourceMatch, targetMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_XProviderToProviderRule_24_3_solvecsp_bindingFBBBBBBB(
			XProviderToProviderRule _this, Container container, Provider agent, XProvider xAgent, XContainer xContainer,
			Match sourceMatch, Match targetMatch) {
		CSP _localVariable_4 = _this.isApplicable_solveCsp_CC(container, agent, xAgent, xContainer, sourceMatch,
				targetMatch);
		CSP csp = _localVariable_4;
		if (csp != null) {
			return new Object[] { csp, _this, container, agent, xAgent, xContainer, sourceMatch, targetMatch };
		}
		return null;
	}

	public static final Object[] pattern_XProviderToProviderRule_24_3_solvecsp_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_XProviderToProviderRule_24_3_solvecsp_bindingAndBlackFBBBBBBB(
			XProviderToProviderRule _this, Container container, Provider agent, XProvider xAgent, XContainer xContainer,
			Match sourceMatch, Match targetMatch) {
		Object[] result_pattern_XProviderToProviderRule_24_3_solvecsp_binding = pattern_XProviderToProviderRule_24_3_solvecsp_bindingFBBBBBBB(
				_this, container, agent, xAgent, xContainer, sourceMatch, targetMatch);
		if (result_pattern_XProviderToProviderRule_24_3_solvecsp_binding != null) {
			CSP csp = (CSP) result_pattern_XProviderToProviderRule_24_3_solvecsp_binding[0];

			Object[] result_pattern_XProviderToProviderRule_24_3_solvecsp_black = pattern_XProviderToProviderRule_24_3_solvecsp_blackB(
					csp);
			if (result_pattern_XProviderToProviderRule_24_3_solvecsp_black != null) {

				return new Object[] { csp, _this, container, agent, xAgent, xContainer, sourceMatch, targetMatch };
			}
		}
		return null;
	}

	public static final boolean pattern_XProviderToProviderRule_24_4_checkCSP_expressionFB(CSP csp) {
		boolean _localVariable_0 = csp.check();
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Iterable<Object[]> pattern_XProviderToProviderRule_24_5_matchcorrcontext_blackBFBBB(
			Container container, XContainer xContainer, Match sourceMatch, Match targetMatch) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (!sourceMatch.equals(targetMatch)) {
			for (XContainerToContainer xContainerToContainer : org.moflon.core.utilities.eMoflonEMFUtil
					.getOppositeReferenceTyped(xContainer, XContainerToContainer.class, "source")) {
				if (container.equals(xContainerToContainer.getTarget())) {
					_result.add(
							new Object[] { container, xContainerToContainer, xContainer, sourceMatch, targetMatch });
				}
			}
		}
		return _result;
	}

	public static final Object[] pattern_XProviderToProviderRule_24_5_matchcorrcontext_greenBBBF(
			XContainerToContainer xContainerToContainer, Match sourceMatch, Match targetMatch) {
		CCMatch ccMatch = RuntimeFactory.eINSTANCE.createCCMatch();
		String ccMatch_ruleName_prime = "XProviderToProviderRule";
		ccMatch.setSourceMatch(sourceMatch);
		ccMatch.setTargetMatch(targetMatch);
		ccMatch.getAllContextElements().add(xContainerToContainer);
		ccMatch.setRuleName(ccMatch_ruleName_prime);
		return new Object[] { xContainerToContainer, sourceMatch, targetMatch, ccMatch };
	}

	public static final Object[] pattern_XProviderToProviderRule_24_6_createcorrespondence_blackBBBBB(
			Container container, Provider agent, XProvider xAgent, XContainer xContainer, CCMatch ccMatch) {
		return new Object[] { container, agent, xAgent, xContainer, ccMatch };
	}

	public static final Object[] pattern_XProviderToProviderRule_24_6_createcorrespondence_greenFBBB(Provider agent,
			XProvider xAgent, CCMatch ccMatch) {
		XAgentToAgent xAgentToAgent = RequirementsTransformatorFactory.eINSTANCE.createXAgentToAgent();
		xAgentToAgent.setTarget(agent);
		xAgentToAgent.setSource(xAgent);
		ccMatch.getCreateCorr().add(xAgentToAgent);
		return new Object[] { xAgentToAgent, agent, xAgent, ccMatch };
	}

	public static final Object[] pattern_XProviderToProviderRule_24_7_addtoreturnedresult_blackBB(
			IsApplicableRuleResult result, CCMatch ccMatch) {
		return new Object[] { result, ccMatch };
	}

	public static final Object[] pattern_XProviderToProviderRule_24_7_addtoreturnedresult_greenBB(
			IsApplicableRuleResult result, CCMatch ccMatch) {
		result.getIsApplicableMatch().add(ccMatch);
		boolean result_success_prime = Boolean.valueOf(true);
		String ccMatch_ruleName_prime = "XProviderToProviderRule";
		result.setSuccess(Boolean.valueOf(result_success_prime));
		ccMatch.setRuleName(ccMatch_ruleName_prime);
		return new Object[] { result, ccMatch };
	}

	public static final IsApplicableRuleResult pattern_XProviderToProviderRule_24_8_expressionFB(
			IsApplicableRuleResult result) {
		IsApplicableRuleResult _result = result;
		return _result;
	}

	public static final Object[] pattern_XProviderToProviderRule_27_1_matchtggpattern_blackBB(XProvider xAgent,
			XContainer xContainer) {
		if (xContainer.getAgents().contains(xAgent)) {
			return new Object[] { xAgent, xContainer };
		}
		return null;
	}

	public static final boolean pattern_XProviderToProviderRule_27_2_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_XProviderToProviderRule_27_3_expressionF() {
		boolean _result = Boolean.valueOf(false);
		return _result;
	}

	public static final Object[] pattern_XProviderToProviderRule_28_1_matchtggpattern_blackBB(Container container,
			Provider agent) {
		if (container.getAgents().contains(agent)) {
			return new Object[] { container, agent };
		}
		return null;
	}

	public static final boolean pattern_XProviderToProviderRule_28_2_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_XProviderToProviderRule_28_3_expressionF() {
		boolean _result = Boolean.valueOf(false);
		return _result;
	}

	public static final Object[] pattern_XProviderToProviderRule_29_1_createresult_blackB(
			XProviderToProviderRule _this) {
		return new Object[] { _this };
	}

	public static final Object[] pattern_XProviderToProviderRule_29_1_createresult_greenFF() {
		IsApplicableMatch isApplicableMatch = RuntimeFactory.eINSTANCE.createIsApplicableMatch();
		ModelgeneratorRuleResult ruleResult = RuntimeFactory.eINSTANCE.createModelgeneratorRuleResult();
		boolean ruleResult_success_prime = Boolean.valueOf(false);
		ruleResult.setSuccess(Boolean.valueOf(ruleResult_success_prime));
		return new Object[] { isApplicableMatch, ruleResult };
	}

	public static final Object[] pattern_XProviderToProviderRule_29_2_isapplicablecore_black_nac_0BB(
			ModelgeneratorRuleResult ruleResult, Container container) {
		if (ruleResult.getTargetObjects().contains(container)) {
			return new Object[] { ruleResult, container };
		}
		return null;
	}

	public static final Object[] pattern_XProviderToProviderRule_29_2_isapplicablecore_black_nac_1BB(
			ModelgeneratorRuleResult ruleResult, XContainerToContainer xContainerToContainer) {
		if (ruleResult.getCorrObjects().contains(xContainerToContainer)) {
			return new Object[] { ruleResult, xContainerToContainer };
		}
		return null;
	}

	public static final Object[] pattern_XProviderToProviderRule_29_2_isapplicablecore_black_nac_2BB(
			ModelgeneratorRuleResult ruleResult, XContainer xContainer) {
		if (ruleResult.getSourceObjects().contains(xContainer)) {
			return new Object[] { ruleResult, xContainer };
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_XProviderToProviderRule_29_2_isapplicablecore_blackFFFFBB(
			RuleEntryContainer ruleEntryContainer, ModelgeneratorRuleResult ruleResult) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		for (RuleEntryList xContainerToContainerList : ruleEntryContainer.getRuleEntryList()) {
			for (EObject tmpXContainerToContainer : xContainerToContainerList.getEntryObjects()) {
				if (tmpXContainerToContainer instanceof XContainerToContainer) {
					XContainerToContainer xContainerToContainer = (XContainerToContainer) tmpXContainerToContainer;
					Container container = xContainerToContainer.getTarget();
					if (container != null) {
						XContainer xContainer = xContainerToContainer.getSource();
						if (xContainer != null) {
							if (pattern_XProviderToProviderRule_29_2_isapplicablecore_black_nac_1BB(ruleResult,
									xContainerToContainer) == null) {
								if (pattern_XProviderToProviderRule_29_2_isapplicablecore_black_nac_0BB(ruleResult,
										container) == null) {
									if (pattern_XProviderToProviderRule_29_2_isapplicablecore_black_nac_2BB(ruleResult,
											xContainer) == null) {
										_result.add(new Object[] { xContainerToContainerList, container,
												xContainerToContainer, xContainer, ruleEntryContainer, ruleResult });
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

	public static final Object[] pattern_XProviderToProviderRule_29_3_solveCSP_bindingFBBBBBB(
			XProviderToProviderRule _this, IsApplicableMatch isApplicableMatch, Container container,
			XContainerToContainer xContainerToContainer, XContainer xContainer, ModelgeneratorRuleResult ruleResult) {
		CSP _localVariable_0 = _this.generateModel_solveCsp_BWD(isApplicableMatch, container, xContainerToContainer,
				xContainer, ruleResult);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, container, xContainerToContainer, xContainer,
					ruleResult };
		}
		return null;
	}

	public static final Object[] pattern_XProviderToProviderRule_29_3_solveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_XProviderToProviderRule_29_3_solveCSP_bindingAndBlackFBBBBBB(
			XProviderToProviderRule _this, IsApplicableMatch isApplicableMatch, Container container,
			XContainerToContainer xContainerToContainer, XContainer xContainer, ModelgeneratorRuleResult ruleResult) {
		Object[] result_pattern_XProviderToProviderRule_29_3_solveCSP_binding = pattern_XProviderToProviderRule_29_3_solveCSP_bindingFBBBBBB(
				_this, isApplicableMatch, container, xContainerToContainer, xContainer, ruleResult);
		if (result_pattern_XProviderToProviderRule_29_3_solveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_XProviderToProviderRule_29_3_solveCSP_binding[0];

			Object[] result_pattern_XProviderToProviderRule_29_3_solveCSP_black = pattern_XProviderToProviderRule_29_3_solveCSP_blackB(
					csp);
			if (result_pattern_XProviderToProviderRule_29_3_solveCSP_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, container, xContainerToContainer, xContainer,
						ruleResult };
			}
		}
		return null;
	}

	public static final boolean pattern_XProviderToProviderRule_29_4_checkCSP_expressionFBB(
			XProviderToProviderRule _this, CSP csp) {
		boolean _localVariable_0 = _this.generateModel_checkCsp_BWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_XProviderToProviderRule_29_5_checknacs_blackBBB(Container container,
			XContainerToContainer xContainerToContainer, XContainer xContainer) {
		return new Object[] { container, xContainerToContainer, xContainer };
	}

	public static final Object[] pattern_XProviderToProviderRule_29_6_perform_blackBBBB(Container container,
			XContainerToContainer xContainerToContainer, XContainer xContainer, ModelgeneratorRuleResult ruleResult) {
		return new Object[] { container, xContainerToContainer, xContainer, ruleResult };
	}

	public static final Object[] pattern_XProviderToProviderRule_29_6_perform_greenBFFFBBB(Container container,
			XContainer xContainer, ModelgeneratorRuleResult ruleResult, CSP csp) {
		XAgentToAgent xAgentToAgent = RequirementsTransformatorFactory.eINSTANCE.createXAgentToAgent();
		Provider agent = RequirementsFactory.eINSTANCE.createProvider();
		XProvider xAgent = ReqXtextFactory.eINSTANCE.createXProvider();
		Object _localVariable_0 = csp.getValue("agent", "speed");
		Object _localVariable_1 = csp.getValue("agent", "name");
		Object _localVariable_2 = csp.getValue("xAgent", "speed");
		Object _localVariable_3 = csp.getValue("xAgent", "name");
		boolean ruleResult_success_prime = Boolean.valueOf(true);
		int _localVariable_4 = ruleResult.getIncrementedPerformCount();
		ruleResult.getCorrObjects().add(xAgentToAgent);
		xAgentToAgent.setTarget(agent);
		container.getAgents().add(agent);
		ruleResult.getTargetObjects().add(agent);
		xContainer.getAgents().add(xAgent);
		xAgentToAgent.setSource(xAgent);
		ruleResult.getSourceObjects().add(xAgent);
		BigInteger agent_speed_prime = (BigInteger) _localVariable_0;
		String agent_name_prime = (String) _localVariable_1;
		BigInteger xAgent_speed_prime = (BigInteger) _localVariable_2;
		String xAgent_name_prime = (String) _localVariable_3;
		ruleResult.setSuccess(Boolean.valueOf(ruleResult_success_prime));
		int ruleResult_performCount_prime = Integer.valueOf(_localVariable_4);
		agent.setSpeed(agent_speed_prime);
		agent.setName(agent_name_prime);
		xAgent.setSpeed(xAgent_speed_prime);
		xAgent.setName(xAgent_name_prime);
		ruleResult.setPerformCount(Integer.valueOf(ruleResult_performCount_prime));
		return new Object[] { container, xAgentToAgent, agent, xAgent, xContainer, ruleResult, csp };
	}

	public static final ModelgeneratorRuleResult pattern_XProviderToProviderRule_29_7_expressionFB(
			ModelgeneratorRuleResult ruleResult) {
		ModelgeneratorRuleResult _result = ruleResult;
		return _result;
	}

	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} //XProviderToProviderRuleImpl
