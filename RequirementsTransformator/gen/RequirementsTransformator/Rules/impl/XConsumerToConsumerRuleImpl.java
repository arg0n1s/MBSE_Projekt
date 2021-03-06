/**
 */
package RequirementsTransformator.Rules.impl;

import RequirementsTransformator.RequirementsTransformatorFactory;

import RequirementsTransformator.Rules.RulesPackage;
import RequirementsTransformator.Rules.XConsumerToConsumerRule;

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

import requirements.Consumer;
import requirements.Container;
import requirements.RequirementsFactory;

import requirementsXtext.reqXtext.ReqXtextFactory;
import requirementsXtext.reqXtext.XConsumer;
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
 * An implementation of the model object '<em><b>XConsumer To Consumer Rule</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class XConsumerToConsumerRuleImpl extends AbstractRuleImpl implements XConsumerToConsumerRule {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected XConsumerToConsumerRuleImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RulesPackage.Literals.XCONSUMER_TO_CONSUMER_RULE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAppropriate_FWD(Match match, XConsumer xAgent, XContainer xContainer) {

		Object[] result1_black = XConsumerToConsumerRuleImpl
				.pattern_XConsumerToConsumerRule_0_1_initialbindings_blackBBBB(this, match, xAgent, xContainer);
		if (result1_black == null) {
			throw new RuntimeException(
					"Pattern matching failed." + " Variables: " + "[this] = " + this + ", " + "[match] = " + match
							+ ", " + "[xAgent] = " + xAgent + ", " + "[xContainer] = " + xContainer + ".");
		}

		Object[] result2_bindingAndBlack = XConsumerToConsumerRuleImpl
				.pattern_XConsumerToConsumerRule_0_2_SolveCSP_bindingAndBlackFBBBB(this, match, xAgent, xContainer);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException(
					"Pattern matching failed." + " Variables: " + "[this] = " + this + ", " + "[match] = " + match
							+ ", " + "[xAgent] = " + xAgent + ", " + "[xContainer] = " + xContainer + ".");
		}
		CSP csp = (CSP) result2_bindingAndBlack[0];
		// 
		if (XConsumerToConsumerRuleImpl.pattern_XConsumerToConsumerRule_0_3_CheckCSP_expressionFBB(this, csp)) {

			Object[] result4_black = XConsumerToConsumerRuleImpl
					.pattern_XConsumerToConsumerRule_0_4_collectelementstobetranslated_blackBBB(match, xAgent,
							xContainer);
			if (result4_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match + ", "
						+ "[xAgent] = " + xAgent + ", " + "[xContainer] = " + xContainer + ".");
			}
			XConsumerToConsumerRuleImpl.pattern_XConsumerToConsumerRule_0_4_collectelementstobetranslated_greenBBBF(
					match, xAgent, xContainer);
			//nothing EMoflonEdge xContainer__xAgent____agents = (EMoflonEdge) result4_green[3];

			Object[] result5_black = XConsumerToConsumerRuleImpl
					.pattern_XConsumerToConsumerRule_0_5_collectcontextelements_blackBBB(match, xAgent, xContainer);
			if (result5_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match + ", "
						+ "[xAgent] = " + xAgent + ", " + "[xContainer] = " + xContainer + ".");
			}
			XConsumerToConsumerRuleImpl.pattern_XConsumerToConsumerRule_0_5_collectcontextelements_greenBB(match,
					xContainer);

			// 
			XConsumerToConsumerRuleImpl.pattern_XConsumerToConsumerRule_0_6_registerobjectstomatch_expressionBBBB(this,
					match, xAgent, xContainer);
			return XConsumerToConsumerRuleImpl.pattern_XConsumerToConsumerRule_0_7_expressionF();
		} else {
			return XConsumerToConsumerRuleImpl.pattern_XConsumerToConsumerRule_0_8_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PerformRuleResult perform_FWD(IsApplicableMatch isApplicableMatch) {

		Object[] result1_bindingAndBlack = XConsumerToConsumerRuleImpl
				.pattern_XConsumerToConsumerRule_1_1_performtransformation_bindingAndBlackFFFFFBB(this,
						isApplicableMatch);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[isApplicableMatch] = " + isApplicableMatch + ".");
		}
		Container container = (Container) result1_bindingAndBlack[0];
		XConsumer xAgent = (XConsumer) result1_bindingAndBlack[1];
		XContainerToContainer xContainerToContainer = (XContainerToContainer) result1_bindingAndBlack[2];
		XContainer xContainer = (XContainer) result1_bindingAndBlack[3];
		CSP csp = (CSP) result1_bindingAndBlack[4];
		Object[] result1_green = XConsumerToConsumerRuleImpl
				.pattern_XConsumerToConsumerRule_1_1_performtransformation_greenFBFBB(container, xAgent, csp);
		XAgentToAgent xAgentToAgent = (XAgentToAgent) result1_green[0];
		Consumer agent = (Consumer) result1_green[2];

		Object[] result2_black = XConsumerToConsumerRuleImpl
				.pattern_XConsumerToConsumerRule_1_2_collecttranslatedelements_blackBBB(xAgentToAgent, agent, xAgent);
		if (result2_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[xAgentToAgent] = "
					+ xAgentToAgent + ", " + "[agent] = " + agent + ", " + "[xAgent] = " + xAgent + ".");
		}
		Object[] result2_green = XConsumerToConsumerRuleImpl
				.pattern_XConsumerToConsumerRule_1_2_collecttranslatedelements_greenFBBB(xAgentToAgent, agent, xAgent);
		PerformRuleResult ruleresult = (PerformRuleResult) result2_green[0];

		Object[] result3_black = XConsumerToConsumerRuleImpl
				.pattern_XConsumerToConsumerRule_1_3_bookkeepingforedges_blackBBBBBBB(ruleresult, xAgentToAgent,
						container, agent, xAgent, xContainerToContainer, xContainer);
		if (result3_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[ruleresult] = " + ruleresult
					+ ", " + "[xAgentToAgent] = " + xAgentToAgent + ", " + "[container] = " + container + ", "
					+ "[agent] = " + agent + ", " + "[xAgent] = " + xAgent + ", " + "[xContainerToContainer] = "
					+ xContainerToContainer + ", " + "[xContainer] = " + xContainer + ".");
		}
		XConsumerToConsumerRuleImpl.pattern_XConsumerToConsumerRule_1_3_bookkeepingforedges_greenBBBBBBFFFF(ruleresult,
				xAgentToAgent, container, agent, xAgent, xContainer);
		//nothing EMoflonEdge xAgentToAgent__agent____target = (EMoflonEdge) result3_green[6];
		//nothing EMoflonEdge container__agent____agents = (EMoflonEdge) result3_green[7];
		//nothing EMoflonEdge xAgentToAgent__xAgent____source = (EMoflonEdge) result3_green[8];
		//nothing EMoflonEdge xContainer__xAgent____agents = (EMoflonEdge) result3_green[9];

		// 
		// 
		XConsumerToConsumerRuleImpl.pattern_XConsumerToConsumerRule_1_5_registerobjects_expressionBBBBBBBB(this,
				ruleresult, xAgentToAgent, container, agent, xAgent, xContainerToContainer, xContainer);
		return XConsumerToConsumerRuleImpl.pattern_XConsumerToConsumerRule_1_6_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IsApplicableRuleResult isApplicable_FWD(Match match) {

		Object[] result1_bindingAndBlack = XConsumerToConsumerRuleImpl
				.pattern_XConsumerToConsumerRule_2_1_preparereturnvalue_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		EOperation performOperation = (EOperation) result1_bindingAndBlack[0];
		//nothing EClass eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = XConsumerToConsumerRuleImpl
				.pattern_XConsumerToConsumerRule_2_1_preparereturnvalue_greenBF(performOperation);
		IsApplicableRuleResult ruleresult = (IsApplicableRuleResult) result1_green[1];

		// ForEach 
		Object[] result2_binding = XConsumerToConsumerRuleImpl
				.pattern_XConsumerToConsumerRule_2_2_corematch_bindingFFB(match);
		if (result2_binding == null) {
			throw new RuntimeException(
					"Binding in node core match failed." + " Variables: " + "[match] = " + match + ".");
		}
		XConsumer xAgent = (XConsumer) result2_binding[0];
		XContainer xContainer = (XContainer) result2_binding[1];
		for (Object[] result2_black : XConsumerToConsumerRuleImpl
				.pattern_XConsumerToConsumerRule_2_2_corematch_blackFBFBB(xAgent, xContainer, match)) {
			Container container = (Container) result2_black[0];
			XContainerToContainer xContainerToContainer = (XContainerToContainer) result2_black[2];
			// ForEach 
			for (Object[] result3_black : XConsumerToConsumerRuleImpl
					.pattern_XConsumerToConsumerRule_2_3_findcontext_blackBBBB(container, xAgent, xContainerToContainer,
							xContainer)) {
				Object[] result3_green = XConsumerToConsumerRuleImpl
						.pattern_XConsumerToConsumerRule_2_3_findcontext_greenBBBBFFFF(container, xAgent,
								xContainerToContainer, xContainer);
				IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result3_green[4];
				//nothing EMoflonEdge xContainerToContainer__xContainer____source = (EMoflonEdge) result3_green[5];
				//nothing EMoflonEdge xContainerToContainer__container____target = (EMoflonEdge) result3_green[6];
				//nothing EMoflonEdge xContainer__xAgent____agents = (EMoflonEdge) result3_green[7];

				Object[] result4_bindingAndBlack = XConsumerToConsumerRuleImpl
						.pattern_XConsumerToConsumerRule_2_4_solveCSP_bindingAndBlackFBBBBBB(this, isApplicableMatch,
								container, xAgent, xContainerToContainer, xContainer);
				if (result4_bindingAndBlack == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
							+ "[isApplicableMatch] = " + isApplicableMatch + ", " + "[container] = " + container + ", "
							+ "[xAgent] = " + xAgent + ", " + "[xContainerToContainer] = " + xContainerToContainer
							+ ", " + "[xContainer] = " + xContainer + ".");
				}
				CSP csp = (CSP) result4_bindingAndBlack[0];
				// 
				if (XConsumerToConsumerRuleImpl.pattern_XConsumerToConsumerRule_2_5_checkCSP_expressionFBB(this, csp)) {

					Object[] result6_black = XConsumerToConsumerRuleImpl
							.pattern_XConsumerToConsumerRule_2_6_addmatchtoruleresult_blackBB(ruleresult,
									isApplicableMatch);
					if (result6_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[ruleresult] = "
								+ ruleresult + ", " + "[isApplicableMatch] = " + isApplicableMatch + ".");
					}
					XConsumerToConsumerRuleImpl.pattern_XConsumerToConsumerRule_2_6_addmatchtoruleresult_greenBB(
							ruleresult, isApplicableMatch);

				} else {
				}

			}

		}
		return XConsumerToConsumerRuleImpl.pattern_XConsumerToConsumerRule_2_7_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void registerObjectsToMatch_FWD(Match match, XConsumer xAgent, XContainer xContainer) {
		match.registerObject("xAgent", xAgent);
		match.registerObject("xContainer", xContainer);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isAppropriate_solveCsp_FWD(Match match, XConsumer xAgent, XContainer xContainer) {// Create CSP
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
	public CSP isApplicable_solveCsp_FWD(IsApplicableMatch isApplicableMatch, Container container, XConsumer xAgent,
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
	public void registerObjects_FWD(PerformRuleResult ruleresult, EObject xAgentToAgent, EObject container,
			EObject agent, EObject xAgent, EObject xContainerToContainer, EObject xContainer) {
		ruleresult.registerObject("xAgentToAgent", xAgentToAgent);
		ruleresult.registerObject("container", container);
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
				.equals("reqXtext.XConsumer.");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAppropriate_BWD(Match match, Container container, Consumer agent) {

		Object[] result1_black = XConsumerToConsumerRuleImpl
				.pattern_XConsumerToConsumerRule_10_1_initialbindings_blackBBBB(this, match, container, agent);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[match] = " + match + ", " + "[container] = " + container + ", " + "[agent] = " + agent + ".");
		}

		Object[] result2_bindingAndBlack = XConsumerToConsumerRuleImpl
				.pattern_XConsumerToConsumerRule_10_2_SolveCSP_bindingAndBlackFBBBB(this, match, container, agent);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[match] = " + match + ", " + "[container] = " + container + ", " + "[agent] = " + agent + ".");
		}
		CSP csp = (CSP) result2_bindingAndBlack[0];
		// 
		if (XConsumerToConsumerRuleImpl.pattern_XConsumerToConsumerRule_10_3_CheckCSP_expressionFBB(this, csp)) {

			Object[] result4_black = XConsumerToConsumerRuleImpl
					.pattern_XConsumerToConsumerRule_10_4_collectelementstobetranslated_blackBBB(match, container,
							agent);
			if (result4_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match + ", "
						+ "[container] = " + container + ", " + "[agent] = " + agent + ".");
			}
			XConsumerToConsumerRuleImpl.pattern_XConsumerToConsumerRule_10_4_collectelementstobetranslated_greenBBBF(
					match, container, agent);
			//nothing EMoflonEdge container__agent____agents = (EMoflonEdge) result4_green[3];

			Object[] result5_black = XConsumerToConsumerRuleImpl
					.pattern_XConsumerToConsumerRule_10_5_collectcontextelements_blackBBB(match, container, agent);
			if (result5_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match + ", "
						+ "[container] = " + container + ", " + "[agent] = " + agent + ".");
			}
			XConsumerToConsumerRuleImpl.pattern_XConsumerToConsumerRule_10_5_collectcontextelements_greenBB(match,
					container);

			// 
			XConsumerToConsumerRuleImpl.pattern_XConsumerToConsumerRule_10_6_registerobjectstomatch_expressionBBBB(this,
					match, container, agent);
			return XConsumerToConsumerRuleImpl.pattern_XConsumerToConsumerRule_10_7_expressionF();
		} else {
			return XConsumerToConsumerRuleImpl.pattern_XConsumerToConsumerRule_10_8_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PerformRuleResult perform_BWD(IsApplicableMatch isApplicableMatch) {

		Object[] result1_bindingAndBlack = XConsumerToConsumerRuleImpl
				.pattern_XConsumerToConsumerRule_11_1_performtransformation_bindingAndBlackFFFFFBB(this,
						isApplicableMatch);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[isApplicableMatch] = " + isApplicableMatch + ".");
		}
		Container container = (Container) result1_bindingAndBlack[0];
		Consumer agent = (Consumer) result1_bindingAndBlack[1];
		XContainerToContainer xContainerToContainer = (XContainerToContainer) result1_bindingAndBlack[2];
		XContainer xContainer = (XContainer) result1_bindingAndBlack[3];
		CSP csp = (CSP) result1_bindingAndBlack[4];
		Object[] result1_green = XConsumerToConsumerRuleImpl
				.pattern_XConsumerToConsumerRule_11_1_performtransformation_greenFBFBB(agent, xContainer, csp);
		XAgentToAgent xAgentToAgent = (XAgentToAgent) result1_green[0];
		XConsumer xAgent = (XConsumer) result1_green[2];

		Object[] result2_black = XConsumerToConsumerRuleImpl
				.pattern_XConsumerToConsumerRule_11_2_collecttranslatedelements_blackBBB(xAgentToAgent, agent, xAgent);
		if (result2_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[xAgentToAgent] = "
					+ xAgentToAgent + ", " + "[agent] = " + agent + ", " + "[xAgent] = " + xAgent + ".");
		}
		Object[] result2_green = XConsumerToConsumerRuleImpl
				.pattern_XConsumerToConsumerRule_11_2_collecttranslatedelements_greenFBBB(xAgentToAgent, agent, xAgent);
		PerformRuleResult ruleresult = (PerformRuleResult) result2_green[0];

		Object[] result3_black = XConsumerToConsumerRuleImpl
				.pattern_XConsumerToConsumerRule_11_3_bookkeepingforedges_blackBBBBBBB(ruleresult, xAgentToAgent,
						container, agent, xAgent, xContainerToContainer, xContainer);
		if (result3_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[ruleresult] = " + ruleresult
					+ ", " + "[xAgentToAgent] = " + xAgentToAgent + ", " + "[container] = " + container + ", "
					+ "[agent] = " + agent + ", " + "[xAgent] = " + xAgent + ", " + "[xContainerToContainer] = "
					+ xContainerToContainer + ", " + "[xContainer] = " + xContainer + ".");
		}
		XConsumerToConsumerRuleImpl.pattern_XConsumerToConsumerRule_11_3_bookkeepingforedges_greenBBBBBBFFFF(ruleresult,
				xAgentToAgent, container, agent, xAgent, xContainer);
		//nothing EMoflonEdge xAgentToAgent__agent____target = (EMoflonEdge) result3_green[6];
		//nothing EMoflonEdge container__agent____agents = (EMoflonEdge) result3_green[7];
		//nothing EMoflonEdge xAgentToAgent__xAgent____source = (EMoflonEdge) result3_green[8];
		//nothing EMoflonEdge xContainer__xAgent____agents = (EMoflonEdge) result3_green[9];

		// 
		// 
		XConsumerToConsumerRuleImpl.pattern_XConsumerToConsumerRule_11_5_registerobjects_expressionBBBBBBBB(this,
				ruleresult, xAgentToAgent, container, agent, xAgent, xContainerToContainer, xContainer);
		return XConsumerToConsumerRuleImpl.pattern_XConsumerToConsumerRule_11_6_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IsApplicableRuleResult isApplicable_BWD(Match match) {

		Object[] result1_bindingAndBlack = XConsumerToConsumerRuleImpl
				.pattern_XConsumerToConsumerRule_12_1_preparereturnvalue_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		EOperation performOperation = (EOperation) result1_bindingAndBlack[0];
		//nothing EClass eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = XConsumerToConsumerRuleImpl
				.pattern_XConsumerToConsumerRule_12_1_preparereturnvalue_greenBF(performOperation);
		IsApplicableRuleResult ruleresult = (IsApplicableRuleResult) result1_green[1];

		// ForEach 
		Object[] result2_binding = XConsumerToConsumerRuleImpl
				.pattern_XConsumerToConsumerRule_12_2_corematch_bindingFFB(match);
		if (result2_binding == null) {
			throw new RuntimeException(
					"Binding in node core match failed." + " Variables: " + "[match] = " + match + ".");
		}
		Container container = (Container) result2_binding[0];
		Consumer agent = (Consumer) result2_binding[1];
		for (Object[] result2_black : XConsumerToConsumerRuleImpl
				.pattern_XConsumerToConsumerRule_12_2_corematch_blackBBFFB(container, agent, match)) {
			XContainerToContainer xContainerToContainer = (XContainerToContainer) result2_black[2];
			XContainer xContainer = (XContainer) result2_black[3];
			// ForEach 
			for (Object[] result3_black : XConsumerToConsumerRuleImpl
					.pattern_XConsumerToConsumerRule_12_3_findcontext_blackBBBB(container, agent, xContainerToContainer,
							xContainer)) {
				Object[] result3_green = XConsumerToConsumerRuleImpl
						.pattern_XConsumerToConsumerRule_12_3_findcontext_greenBBBBFFFF(container, agent,
								xContainerToContainer, xContainer);
				IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result3_green[4];
				//nothing EMoflonEdge xContainerToContainer__xContainer____source = (EMoflonEdge) result3_green[5];
				//nothing EMoflonEdge xContainerToContainer__container____target = (EMoflonEdge) result3_green[6];
				//nothing EMoflonEdge container__agent____agents = (EMoflonEdge) result3_green[7];

				Object[] result4_bindingAndBlack = XConsumerToConsumerRuleImpl
						.pattern_XConsumerToConsumerRule_12_4_solveCSP_bindingAndBlackFBBBBBB(this, isApplicableMatch,
								container, agent, xContainerToContainer, xContainer);
				if (result4_bindingAndBlack == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
							+ "[isApplicableMatch] = " + isApplicableMatch + ", " + "[container] = " + container + ", "
							+ "[agent] = " + agent + ", " + "[xContainerToContainer] = " + xContainerToContainer + ", "
							+ "[xContainer] = " + xContainer + ".");
				}
				CSP csp = (CSP) result4_bindingAndBlack[0];
				// 
				if (XConsumerToConsumerRuleImpl.pattern_XConsumerToConsumerRule_12_5_checkCSP_expressionFBB(this,
						csp)) {

					Object[] result6_black = XConsumerToConsumerRuleImpl
							.pattern_XConsumerToConsumerRule_12_6_addmatchtoruleresult_blackBB(ruleresult,
									isApplicableMatch);
					if (result6_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[ruleresult] = "
								+ ruleresult + ", " + "[isApplicableMatch] = " + isApplicableMatch + ".");
					}
					XConsumerToConsumerRuleImpl.pattern_XConsumerToConsumerRule_12_6_addmatchtoruleresult_greenBB(
							ruleresult, isApplicableMatch);

				} else {
				}

			}

		}
		return XConsumerToConsumerRuleImpl.pattern_XConsumerToConsumerRule_12_7_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void registerObjectsToMatch_BWD(Match match, Container container, Consumer agent) {
		match.registerObject("container", container);
		match.registerObject("agent", agent);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isAppropriate_solveCsp_BWD(Match match, Container container, Consumer agent) {// Create CSP
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
	public CSP isApplicable_solveCsp_BWD(IsApplicableMatch isApplicableMatch, Container container, Consumer agent,
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
	public void registerObjects_BWD(PerformRuleResult ruleresult, EObject xAgentToAgent, EObject container,
			EObject agent, EObject xAgent, EObject xContainerToContainer, EObject xContainer) {
		ruleresult.registerObject("xAgentToAgent", xAgentToAgent);
		ruleresult.registerObject("container", container);
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
				.equals("requirements.Consumer.");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_BWD_EMoflonEdge_8(EMoflonEdge _edge_agents) {

		Object[] result1_bindingAndBlack = XConsumerToConsumerRuleImpl
				.pattern_XConsumerToConsumerRule_20_1_preparereturnvalue_bindingAndBlackFFBF(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		EOperation isApplicableCC = (EOperation) result1_bindingAndBlack[3];
		Object[] result1_green = XConsumerToConsumerRuleImpl
				.pattern_XConsumerToConsumerRule_20_1_preparereturnvalue_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach 
		for (Object[] result2_black : XConsumerToConsumerRuleImpl
				.pattern_XConsumerToConsumerRule_20_2_testcorematchandDECs_blackFFB(_edge_agents)) {
			Container container = (Container) result2_black[0];
			Consumer agent = (Consumer) result2_black[1];
			Object[] result2_green = XConsumerToConsumerRuleImpl
					.pattern_XConsumerToConsumerRule_20_2_testcorematchandDECs_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// 
			if (XConsumerToConsumerRuleImpl
					.pattern_XConsumerToConsumerRule_20_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBB(
							this, match, container, agent)) {
				// 
				if (XConsumerToConsumerRuleImpl
						.pattern_XConsumerToConsumerRule_20_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(
								this, match)) {

					Object[] result5_black = XConsumerToConsumerRuleImpl
							.pattern_XConsumerToConsumerRule_20_5_Addmatchtoruleresult_blackBBBB(match,
									__performOperation, __result, isApplicableCC);
					if (result5_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match
								+ ", " + "[__performOperation] = " + __performOperation + ", " + "[__result] = "
								+ __result + ", " + "[isApplicableCC] = " + isApplicableCC + ".");
					}
					XConsumerToConsumerRuleImpl.pattern_XConsumerToConsumerRule_20_5_Addmatchtoruleresult_greenBBBB(
							match, __performOperation, __result, isApplicableCC);

				} else {
				}

			} else {
			}

		}
		return XConsumerToConsumerRuleImpl.pattern_XConsumerToConsumerRule_20_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_FWD_EMoflonEdge_4(EMoflonEdge _edge_agents) {

		Object[] result1_bindingAndBlack = XConsumerToConsumerRuleImpl
				.pattern_XConsumerToConsumerRule_21_1_preparereturnvalue_bindingAndBlackFFBF(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		EOperation isApplicableCC = (EOperation) result1_bindingAndBlack[3];
		Object[] result1_green = XConsumerToConsumerRuleImpl
				.pattern_XConsumerToConsumerRule_21_1_preparereturnvalue_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach 
		for (Object[] result2_black : XConsumerToConsumerRuleImpl
				.pattern_XConsumerToConsumerRule_21_2_testcorematchandDECs_blackFFB(_edge_agents)) {
			XConsumer xAgent = (XConsumer) result2_black[0];
			XContainer xContainer = (XContainer) result2_black[1];
			Object[] result2_green = XConsumerToConsumerRuleImpl
					.pattern_XConsumerToConsumerRule_21_2_testcorematchandDECs_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// 
			if (XConsumerToConsumerRuleImpl
					.pattern_XConsumerToConsumerRule_21_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBB(
							this, match, xAgent, xContainer)) {
				// 
				if (XConsumerToConsumerRuleImpl
						.pattern_XConsumerToConsumerRule_21_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(
								this, match)) {

					Object[] result5_black = XConsumerToConsumerRuleImpl
							.pattern_XConsumerToConsumerRule_21_5_Addmatchtoruleresult_blackBBBB(match,
									__performOperation, __result, isApplicableCC);
					if (result5_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match
								+ ", " + "[__performOperation] = " + __performOperation + ", " + "[__result] = "
								+ __result + ", " + "[isApplicableCC] = " + isApplicableCC + ".");
					}
					XConsumerToConsumerRuleImpl.pattern_XConsumerToConsumerRule_21_5_Addmatchtoruleresult_greenBBBB(
							match, __performOperation, __result, isApplicableCC);

				} else {
				}

			} else {
			}

		}
		return XConsumerToConsumerRuleImpl.pattern_XConsumerToConsumerRule_21_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AttributeConstraintsRuleResult checkAttributes_FWD(TripleMatch __tripleMatch) {
		AttributeConstraintsRuleResult ruleResult = org.moflon.tgg.runtime.RuntimeFactory.eINSTANCE
				.createAttributeConstraintsRuleResult();
		ruleResult.setRule("XConsumerToConsumerRule");
		ruleResult.setSuccess(true);

		CSP csp = CspFactory.eINSTANCE.createCSP();

		CheckAttributeHelper __helper = new CheckAttributeHelper(__tripleMatch);

		Variable var_agent_speed = CSPFactoryHelper.eINSTANCE.createVariable("agent", true, csp);
		var_agent_speed.setValue(__helper.getValue("agent", "speed"));
		var_agent_speed.setType("BigInteger");

		Variable var_agent_name = CSPFactoryHelper.eINSTANCE.createVariable("agent", true, csp);
		var_agent_name.setValue(__helper.getValue("agent", "name"));
		var_agent_name.setType("String");

		Variable var_xAgent_speed = CSPFactoryHelper.eINSTANCE.createVariable("xAgent", true, csp);
		var_xAgent_speed.setValue(__helper.getValue("xAgent", "speed"));
		var_xAgent_speed.setType("BigInteger");

		Variable var_xAgent_name = CSPFactoryHelper.eINSTANCE.createVariable("xAgent", true, csp);
		var_xAgent_name.setValue(__helper.getValue("xAgent", "name"));
		var_xAgent_name.setType("String");

		Eq eq0 = new Eq();
		csp.getConstraints().add(eq0);

		Eq eq1 = new Eq();
		csp.getConstraints().add(eq1);

		eq0.setRuleName("XConsumerToConsumerRule");
		eq0.solve(var_xAgent_speed, var_agent_speed);

		eq1.setRuleName("XConsumerToConsumerRule");
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
		ruleResult.setRule("XConsumerToConsumerRule");
		ruleResult.setSuccess(true);

		CSP csp = CspFactory.eINSTANCE.createCSP();

		CheckAttributeHelper __helper = new CheckAttributeHelper(__tripleMatch);

		Variable var_agent_speed = CSPFactoryHelper.eINSTANCE.createVariable("agent", true, csp);
		var_agent_speed.setValue(__helper.getValue("agent", "speed"));
		var_agent_speed.setType("BigInteger");

		Variable var_agent_name = CSPFactoryHelper.eINSTANCE.createVariable("agent", true, csp);
		var_agent_name.setValue(__helper.getValue("agent", "name"));
		var_agent_name.setType("String");

		Variable var_xAgent_speed = CSPFactoryHelper.eINSTANCE.createVariable("xAgent", true, csp);
		var_xAgent_speed.setValue(__helper.getValue("xAgent", "speed"));
		var_xAgent_speed.setType("BigInteger");

		Variable var_xAgent_name = CSPFactoryHelper.eINSTANCE.createVariable("xAgent", true, csp);
		var_xAgent_name.setValue(__helper.getValue("xAgent", "name"));
		var_xAgent_name.setType("String");

		Eq eq0 = new Eq();
		csp.getConstraints().add(eq0);

		Eq eq1 = new Eq();
		csp.getConstraints().add(eq1);

		eq0.setRuleName("XConsumerToConsumerRule");
		eq0.solve(var_xAgent_speed, var_agent_speed);

		eq1.setRuleName("XConsumerToConsumerRule");
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

		Object[] result1_black = XConsumerToConsumerRuleImpl.pattern_XConsumerToConsumerRule_24_1_prepare_blackB(this);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		Object[] result1_green = XConsumerToConsumerRuleImpl.pattern_XConsumerToConsumerRule_24_1_prepare_greenF();
		IsApplicableRuleResult result = (IsApplicableRuleResult) result1_green[0];

		Object[] result2_bindingAndBlack = XConsumerToConsumerRuleImpl
				.pattern_XConsumerToConsumerRule_24_2_matchsrctrgcontext_bindingAndBlackFFFFBB(sourceMatch,
						targetMatch);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[sourceMatch] = " + sourceMatch
					+ ", " + "[targetMatch] = " + targetMatch + ".");
		}
		Container container = (Container) result2_bindingAndBlack[0];
		Consumer agent = (Consumer) result2_bindingAndBlack[1];
		XConsumer xAgent = (XConsumer) result2_bindingAndBlack[2];
		XContainer xContainer = (XContainer) result2_bindingAndBlack[3];

		Object[] result3_bindingAndBlack = XConsumerToConsumerRuleImpl
				.pattern_XConsumerToConsumerRule_24_3_solvecsp_bindingAndBlackFBBBBBBB(this, container, agent, xAgent,
						xContainer, sourceMatch, targetMatch);
		if (result3_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[container] = " + container + ", " + "[agent] = " + agent + ", " + "[xAgent] = " + xAgent + ", "
					+ "[xContainer] = " + xContainer + ", " + "[sourceMatch] = " + sourceMatch + ", "
					+ "[targetMatch] = " + targetMatch + ".");
		}
		CSP csp = (CSP) result3_bindingAndBlack[0];
		// 
		if (XConsumerToConsumerRuleImpl.pattern_XConsumerToConsumerRule_24_4_checkCSP_expressionFB(csp)) {
			// ForEach 
			for (Object[] result5_black : XConsumerToConsumerRuleImpl
					.pattern_XConsumerToConsumerRule_24_5_matchcorrcontext_blackBFBBB(container, xContainer,
							sourceMatch, targetMatch)) {
				XContainerToContainer xContainerToContainer = (XContainerToContainer) result5_black[1];
				Object[] result5_green = XConsumerToConsumerRuleImpl
						.pattern_XConsumerToConsumerRule_24_5_matchcorrcontext_greenBBBF(xContainerToContainer,
								sourceMatch, targetMatch);
				CCMatch ccMatch = (CCMatch) result5_green[3];

				Object[] result6_black = XConsumerToConsumerRuleImpl
						.pattern_XConsumerToConsumerRule_24_6_createcorrespondence_blackBBBBB(container, agent, xAgent,
								xContainer, ccMatch);
				if (result6_black == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[container] = "
							+ container + ", " + "[agent] = " + agent + ", " + "[xAgent] = " + xAgent + ", "
							+ "[xContainer] = " + xContainer + ", " + "[ccMatch] = " + ccMatch + ".");
				}
				XConsumerToConsumerRuleImpl.pattern_XConsumerToConsumerRule_24_6_createcorrespondence_greenFBBB(agent,
						xAgent, ccMatch);
				//nothing XAgentToAgent xAgentToAgent = (XAgentToAgent) result6_green[0];

				Object[] result7_black = XConsumerToConsumerRuleImpl
						.pattern_XConsumerToConsumerRule_24_7_addtoreturnedresult_blackBB(result, ccMatch);
				if (result7_black == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[result] = " + result
							+ ", " + "[ccMatch] = " + ccMatch + ".");
				}
				XConsumerToConsumerRuleImpl.pattern_XConsumerToConsumerRule_24_7_addtoreturnedresult_greenBB(result,
						ccMatch);

			}

		} else {
		}
		return XConsumerToConsumerRuleImpl.pattern_XConsumerToConsumerRule_24_8_expressionFB(result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isApplicable_solveCsp_CC(Container container, Consumer agent, XConsumer xAgent, XContainer xContainer,
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
	public boolean checkDEC_FWD(XConsumer xAgent, XContainer xContainer) {// 
		Object[] result1_black = XConsumerToConsumerRuleImpl
				.pattern_XConsumerToConsumerRule_27_1_matchtggpattern_blackBB(xAgent, xContainer);
		if (result1_black != null) {
			return XConsumerToConsumerRuleImpl.pattern_XConsumerToConsumerRule_27_2_expressionF();
		} else {
			return XConsumerToConsumerRuleImpl.pattern_XConsumerToConsumerRule_27_3_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean checkDEC_BWD(Container container, Consumer agent) {// 
		Object[] result1_black = XConsumerToConsumerRuleImpl
				.pattern_XConsumerToConsumerRule_28_1_matchtggpattern_blackBB(container, agent);
		if (result1_black != null) {
			return XConsumerToConsumerRuleImpl.pattern_XConsumerToConsumerRule_28_2_expressionF();
		} else {
			return XConsumerToConsumerRuleImpl.pattern_XConsumerToConsumerRule_28_3_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModelgeneratorRuleResult generateModel(RuleEntryContainer ruleEntryContainer,
			XContainerToContainer xContainerToContainerParameter) {

		Object[] result1_black = XConsumerToConsumerRuleImpl
				.pattern_XConsumerToConsumerRule_29_1_createresult_blackB(this);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		Object[] result1_green = XConsumerToConsumerRuleImpl
				.pattern_XConsumerToConsumerRule_29_1_createresult_greenFF();
		IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result1_green[0];
		ModelgeneratorRuleResult ruleResult = (ModelgeneratorRuleResult) result1_green[1];

		// ForEach 
		for (Object[] result2_black : XConsumerToConsumerRuleImpl
				.pattern_XConsumerToConsumerRule_29_2_isapplicablecore_blackFFFFBB(ruleEntryContainer, ruleResult)) {
			//nothing RuleEntryList xContainerToContainerList = (RuleEntryList) result2_black[0];
			Container container = (Container) result2_black[1];
			XContainerToContainer xContainerToContainer = (XContainerToContainer) result2_black[2];
			XContainer xContainer = (XContainer) result2_black[3];

			Object[] result3_bindingAndBlack = XConsumerToConsumerRuleImpl
					.pattern_XConsumerToConsumerRule_29_3_solveCSP_bindingAndBlackFBBBBBB(this, isApplicableMatch,
							container, xContainerToContainer, xContainer, ruleResult);
			if (result3_bindingAndBlack == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
						+ "[isApplicableMatch] = " + isApplicableMatch + ", " + "[container] = " + container + ", "
						+ "[xContainerToContainer] = " + xContainerToContainer + ", " + "[xContainer] = " + xContainer
						+ ", " + "[ruleResult] = " + ruleResult + ".");
			}
			CSP csp = (CSP) result3_bindingAndBlack[0];
			// 
			if (XConsumerToConsumerRuleImpl.pattern_XConsumerToConsumerRule_29_4_checkCSP_expressionFBB(this, csp)) {
				// 
				Object[] result5_black = XConsumerToConsumerRuleImpl
						.pattern_XConsumerToConsumerRule_29_5_checknacs_blackBBB(container, xContainerToContainer,
								xContainer);
				if (result5_black != null) {

					Object[] result6_black = XConsumerToConsumerRuleImpl
							.pattern_XConsumerToConsumerRule_29_6_perform_blackBBBB(container, xContainerToContainer,
									xContainer, ruleResult);
					if (result6_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[container] = "
								+ container + ", " + "[xContainerToContainer] = " + xContainerToContainer + ", "
								+ "[xContainer] = " + xContainer + ", " + "[ruleResult] = " + ruleResult + ".");
					}
					XConsumerToConsumerRuleImpl.pattern_XConsumerToConsumerRule_29_6_perform_greenFBFFBBB(container,
							xContainer, ruleResult, csp);
					//nothing XAgentToAgent xAgentToAgent = (XAgentToAgent) result6_green[0];
					//nothing Consumer agent = (Consumer) result6_green[2];
					//nothing XConsumer xAgent = (XConsumer) result6_green[3];

				} else {
				}

			} else {
			}

		}
		return XConsumerToConsumerRuleImpl.pattern_XConsumerToConsumerRule_29_7_expressionFB(ruleResult);
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
		case RulesPackage.XCONSUMER_TO_CONSUMER_RULE___IS_APPROPRIATE_FWD__MATCH_XCONSUMER_XCONTAINER:
			return isAppropriate_FWD((Match) arguments.get(0), (XConsumer) arguments.get(1),
					(XContainer) arguments.get(2));
		case RulesPackage.XCONSUMER_TO_CONSUMER_RULE___PERFORM_FWD__ISAPPLICABLEMATCH:
			return perform_FWD((IsApplicableMatch) arguments.get(0));
		case RulesPackage.XCONSUMER_TO_CONSUMER_RULE___IS_APPLICABLE_FWD__MATCH:
			return isApplicable_FWD((Match) arguments.get(0));
		case RulesPackage.XCONSUMER_TO_CONSUMER_RULE___REGISTER_OBJECTS_TO_MATCH_FWD__MATCH_XCONSUMER_XCONTAINER:
			registerObjectsToMatch_FWD((Match) arguments.get(0), (XConsumer) arguments.get(1),
					(XContainer) arguments.get(2));
			return null;
		case RulesPackage.XCONSUMER_TO_CONSUMER_RULE___IS_APPROPRIATE_SOLVE_CSP_FWD__MATCH_XCONSUMER_XCONTAINER:
			return isAppropriate_solveCsp_FWD((Match) arguments.get(0), (XConsumer) arguments.get(1),
					(XContainer) arguments.get(2));
		case RulesPackage.XCONSUMER_TO_CONSUMER_RULE___IS_APPROPRIATE_CHECK_CSP_FWD__CSP:
			return isAppropriate_checkCsp_FWD((CSP) arguments.get(0));
		case RulesPackage.XCONSUMER_TO_CONSUMER_RULE___IS_APPLICABLE_SOLVE_CSP_FWD__ISAPPLICABLEMATCH_CONTAINER_XCONSUMER_XCONTAINERTOCONTAINER_XCONTAINER:
			return isApplicable_solveCsp_FWD((IsApplicableMatch) arguments.get(0), (Container) arguments.get(1),
					(XConsumer) arguments.get(2), (XContainerToContainer) arguments.get(3),
					(XContainer) arguments.get(4));
		case RulesPackage.XCONSUMER_TO_CONSUMER_RULE___IS_APPLICABLE_CHECK_CSP_FWD__CSP:
			return isApplicable_checkCsp_FWD((CSP) arguments.get(0));
		case RulesPackage.XCONSUMER_TO_CONSUMER_RULE___REGISTER_OBJECTS_FWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT:
			registerObjects_FWD((PerformRuleResult) arguments.get(0), (EObject) arguments.get(1),
					(EObject) arguments.get(2), (EObject) arguments.get(3), (EObject) arguments.get(4),
					(EObject) arguments.get(5), (EObject) arguments.get(6));
			return null;
		case RulesPackage.XCONSUMER_TO_CONSUMER_RULE___CHECK_TYPES_FWD__MATCH:
			return checkTypes_FWD((Match) arguments.get(0));
		case RulesPackage.XCONSUMER_TO_CONSUMER_RULE___IS_APPROPRIATE_BWD__MATCH_CONTAINER_CONSUMER:
			return isAppropriate_BWD((Match) arguments.get(0), (Container) arguments.get(1),
					(Consumer) arguments.get(2));
		case RulesPackage.XCONSUMER_TO_CONSUMER_RULE___PERFORM_BWD__ISAPPLICABLEMATCH:
			return perform_BWD((IsApplicableMatch) arguments.get(0));
		case RulesPackage.XCONSUMER_TO_CONSUMER_RULE___IS_APPLICABLE_BWD__MATCH:
			return isApplicable_BWD((Match) arguments.get(0));
		case RulesPackage.XCONSUMER_TO_CONSUMER_RULE___REGISTER_OBJECTS_TO_MATCH_BWD__MATCH_CONTAINER_CONSUMER:
			registerObjectsToMatch_BWD((Match) arguments.get(0), (Container) arguments.get(1),
					(Consumer) arguments.get(2));
			return null;
		case RulesPackage.XCONSUMER_TO_CONSUMER_RULE___IS_APPROPRIATE_SOLVE_CSP_BWD__MATCH_CONTAINER_CONSUMER:
			return isAppropriate_solveCsp_BWD((Match) arguments.get(0), (Container) arguments.get(1),
					(Consumer) arguments.get(2));
		case RulesPackage.XCONSUMER_TO_CONSUMER_RULE___IS_APPROPRIATE_CHECK_CSP_BWD__CSP:
			return isAppropriate_checkCsp_BWD((CSP) arguments.get(0));
		case RulesPackage.XCONSUMER_TO_CONSUMER_RULE___IS_APPLICABLE_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_CONTAINER_CONSUMER_XCONTAINERTOCONTAINER_XCONTAINER:
			return isApplicable_solveCsp_BWD((IsApplicableMatch) arguments.get(0), (Container) arguments.get(1),
					(Consumer) arguments.get(2), (XContainerToContainer) arguments.get(3),
					(XContainer) arguments.get(4));
		case RulesPackage.XCONSUMER_TO_CONSUMER_RULE___IS_APPLICABLE_CHECK_CSP_BWD__CSP:
			return isApplicable_checkCsp_BWD((CSP) arguments.get(0));
		case RulesPackage.XCONSUMER_TO_CONSUMER_RULE___REGISTER_OBJECTS_BWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT:
			registerObjects_BWD((PerformRuleResult) arguments.get(0), (EObject) arguments.get(1),
					(EObject) arguments.get(2), (EObject) arguments.get(3), (EObject) arguments.get(4),
					(EObject) arguments.get(5), (EObject) arguments.get(6));
			return null;
		case RulesPackage.XCONSUMER_TO_CONSUMER_RULE___CHECK_TYPES_BWD__MATCH:
			return checkTypes_BWD((Match) arguments.get(0));
		case RulesPackage.XCONSUMER_TO_CONSUMER_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_8__EMOFLONEDGE:
			return isAppropriate_BWD_EMoflonEdge_8((EMoflonEdge) arguments.get(0));
		case RulesPackage.XCONSUMER_TO_CONSUMER_RULE___IS_APPROPRIATE_FWD_EMOFLON_EDGE_4__EMOFLONEDGE:
			return isAppropriate_FWD_EMoflonEdge_4((EMoflonEdge) arguments.get(0));
		case RulesPackage.XCONSUMER_TO_CONSUMER_RULE___CHECK_ATTRIBUTES_FWD__TRIPLEMATCH:
			return checkAttributes_FWD((TripleMatch) arguments.get(0));
		case RulesPackage.XCONSUMER_TO_CONSUMER_RULE___CHECK_ATTRIBUTES_BWD__TRIPLEMATCH:
			return checkAttributes_BWD((TripleMatch) arguments.get(0));
		case RulesPackage.XCONSUMER_TO_CONSUMER_RULE___IS_APPLICABLE_CC__MATCH_MATCH:
			return isApplicable_CC((Match) arguments.get(0), (Match) arguments.get(1));
		case RulesPackage.XCONSUMER_TO_CONSUMER_RULE___IS_APPLICABLE_SOLVE_CSP_CC__CONTAINER_CONSUMER_XCONSUMER_XCONTAINER_MATCH_MATCH:
			return isApplicable_solveCsp_CC((Container) arguments.get(0), (Consumer) arguments.get(1),
					(XConsumer) arguments.get(2), (XContainer) arguments.get(3), (Match) arguments.get(4),
					(Match) arguments.get(5));
		case RulesPackage.XCONSUMER_TO_CONSUMER_RULE___IS_APPLICABLE_CHECK_CSP_CC__CSP:
			return isApplicable_checkCsp_CC((CSP) arguments.get(0));
		case RulesPackage.XCONSUMER_TO_CONSUMER_RULE___CHECK_DEC_FWD__XCONSUMER_XCONTAINER:
			return checkDEC_FWD((XConsumer) arguments.get(0), (XContainer) arguments.get(1));
		case RulesPackage.XCONSUMER_TO_CONSUMER_RULE___CHECK_DEC_BWD__CONTAINER_CONSUMER:
			return checkDEC_BWD((Container) arguments.get(0), (Consumer) arguments.get(1));
		case RulesPackage.XCONSUMER_TO_CONSUMER_RULE___GENERATE_MODEL__RULEENTRYCONTAINER_XCONTAINERTOCONTAINER:
			return generateModel((RuleEntryContainer) arguments.get(0), (XContainerToContainer) arguments.get(1));
		case RulesPackage.XCONSUMER_TO_CONSUMER_RULE___GENERATE_MODEL_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_CONTAINER_XCONTAINERTOCONTAINER_XCONTAINER_MODELGENERATORRULERESULT:
			return generateModel_solveCsp_BWD((IsApplicableMatch) arguments.get(0), (Container) arguments.get(1),
					(XContainerToContainer) arguments.get(2), (XContainer) arguments.get(3),
					(ModelgeneratorRuleResult) arguments.get(4));
		case RulesPackage.XCONSUMER_TO_CONSUMER_RULE___GENERATE_MODEL_CHECK_CSP_BWD__CSP:
			return generateModel_checkCsp_BWD((CSP) arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
	}

	public static final Object[] pattern_XConsumerToConsumerRule_0_1_initialbindings_blackBBBB(
			XConsumerToConsumerRule _this, Match match, XConsumer xAgent, XContainer xContainer) {
		return new Object[] { _this, match, xAgent, xContainer };
	}

	public static final Object[] pattern_XConsumerToConsumerRule_0_2_SolveCSP_bindingFBBBB(
			XConsumerToConsumerRule _this, Match match, XConsumer xAgent, XContainer xContainer) {
		CSP _localVariable_0 = _this.isAppropriate_solveCsp_FWD(match, xAgent, xContainer);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, match, xAgent, xContainer };
		}
		return null;
	}

	public static final Object[] pattern_XConsumerToConsumerRule_0_2_SolveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_XConsumerToConsumerRule_0_2_SolveCSP_bindingAndBlackFBBBB(
			XConsumerToConsumerRule _this, Match match, XConsumer xAgent, XContainer xContainer) {
		Object[] result_pattern_XConsumerToConsumerRule_0_2_SolveCSP_binding = pattern_XConsumerToConsumerRule_0_2_SolveCSP_bindingFBBBB(
				_this, match, xAgent, xContainer);
		if (result_pattern_XConsumerToConsumerRule_0_2_SolveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_XConsumerToConsumerRule_0_2_SolveCSP_binding[0];

			Object[] result_pattern_XConsumerToConsumerRule_0_2_SolveCSP_black = pattern_XConsumerToConsumerRule_0_2_SolveCSP_blackB(
					csp);
			if (result_pattern_XConsumerToConsumerRule_0_2_SolveCSP_black != null) {

				return new Object[] { csp, _this, match, xAgent, xContainer };
			}
		}
		return null;
	}

	public static final boolean pattern_XConsumerToConsumerRule_0_3_CheckCSP_expressionFBB(
			XConsumerToConsumerRule _this, CSP csp) {
		boolean _localVariable_0 = _this.isAppropriate_checkCsp_FWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_XConsumerToConsumerRule_0_4_collectelementstobetranslated_blackBBB(Match match,
			XConsumer xAgent, XContainer xContainer) {
		return new Object[] { match, xAgent, xContainer };
	}

	public static final Object[] pattern_XConsumerToConsumerRule_0_4_collectelementstobetranslated_greenBBBF(
			Match match, XConsumer xAgent, XContainer xContainer) {
		EMoflonEdge xContainer__xAgent____agents = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		match.getToBeTranslatedNodes().add(xAgent);
		String xContainer__xAgent____agents_name_prime = "agents";
		xContainer__xAgent____agents.setSrc(xContainer);
		xContainer__xAgent____agents.setTrg(xAgent);
		match.getToBeTranslatedEdges().add(xContainer__xAgent____agents);
		xContainer__xAgent____agents.setName(xContainer__xAgent____agents_name_prime);
		return new Object[] { match, xAgent, xContainer, xContainer__xAgent____agents };
	}

	public static final Object[] pattern_XConsumerToConsumerRule_0_5_collectcontextelements_blackBBB(Match match,
			XConsumer xAgent, XContainer xContainer) {
		return new Object[] { match, xAgent, xContainer };
	}

	public static final Object[] pattern_XConsumerToConsumerRule_0_5_collectcontextelements_greenBB(Match match,
			XContainer xContainer) {
		match.getContextNodes().add(xContainer);
		return new Object[] { match, xContainer };
	}

	public static final void pattern_XConsumerToConsumerRule_0_6_registerobjectstomatch_expressionBBBB(
			XConsumerToConsumerRule _this, Match match, XConsumer xAgent, XContainer xContainer) {
		_this.registerObjectsToMatch_FWD(match, xAgent, xContainer);

	}

	public static final boolean pattern_XConsumerToConsumerRule_0_7_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_XConsumerToConsumerRule_0_8_expressionF() {
		boolean _result = Boolean.valueOf(false);
		return _result;
	}

	public static final Object[] pattern_XConsumerToConsumerRule_1_1_performtransformation_bindingFFFFB(
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
			if (tmpXAgent instanceof XConsumer) {
				XConsumer xAgent = (XConsumer) tmpXAgent;
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

	public static final Object[] pattern_XConsumerToConsumerRule_1_1_performtransformation_blackBBBBFBB(
			Container container, XConsumer xAgent, XContainerToContainer xContainerToContainer, XContainer xContainer,
			XConsumerToConsumerRule _this, IsApplicableMatch isApplicableMatch) {
		for (EObject tmpCsp : isApplicableMatch.getAttributeInfo()) {
			if (tmpCsp instanceof CSP) {
				CSP csp = (CSP) tmpCsp;
				return new Object[] { container, xAgent, xContainerToContainer, xContainer, csp, _this,
						isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_XConsumerToConsumerRule_1_1_performtransformation_bindingAndBlackFFFFFBB(
			XConsumerToConsumerRule _this, IsApplicableMatch isApplicableMatch) {
		Object[] result_pattern_XConsumerToConsumerRule_1_1_performtransformation_binding = pattern_XConsumerToConsumerRule_1_1_performtransformation_bindingFFFFB(
				isApplicableMatch);
		if (result_pattern_XConsumerToConsumerRule_1_1_performtransformation_binding != null) {
			Container container = (Container) result_pattern_XConsumerToConsumerRule_1_1_performtransformation_binding[0];
			XConsumer xAgent = (XConsumer) result_pattern_XConsumerToConsumerRule_1_1_performtransformation_binding[1];
			XContainerToContainer xContainerToContainer = (XContainerToContainer) result_pattern_XConsumerToConsumerRule_1_1_performtransformation_binding[2];
			XContainer xContainer = (XContainer) result_pattern_XConsumerToConsumerRule_1_1_performtransformation_binding[3];

			Object[] result_pattern_XConsumerToConsumerRule_1_1_performtransformation_black = pattern_XConsumerToConsumerRule_1_1_performtransformation_blackBBBBFBB(
					container, xAgent, xContainerToContainer, xContainer, _this, isApplicableMatch);
			if (result_pattern_XConsumerToConsumerRule_1_1_performtransformation_black != null) {
				CSP csp = (CSP) result_pattern_XConsumerToConsumerRule_1_1_performtransformation_black[4];

				return new Object[] { container, xAgent, xContainerToContainer, xContainer, csp, _this,
						isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_XConsumerToConsumerRule_1_1_performtransformation_greenFBFBB(
			Container container, XConsumer xAgent, CSP csp) {
		XAgentToAgent xAgentToAgent = RequirementsTransformatorFactory.eINSTANCE.createXAgentToAgent();
		Consumer agent = RequirementsFactory.eINSTANCE.createConsumer();
		Object _localVariable_0 = csp.getValue("agent", "speed");
		Object _localVariable_1 = csp.getValue("agent", "name");
		xAgentToAgent.setSource(xAgent);
		xAgentToAgent.setTarget(agent);
		container.getAgents().add(agent);
		BigInteger agent_speed_prime = (BigInteger) _localVariable_0;
		String agent_name_prime = (String) _localVariable_1;
		agent.setSpeed(agent_speed_prime);
		agent.setName(agent_name_prime);
		return new Object[] { xAgentToAgent, container, agent, xAgent, csp };
	}

	public static final Object[] pattern_XConsumerToConsumerRule_1_2_collecttranslatedelements_blackBBB(
			XAgentToAgent xAgentToAgent, Consumer agent, XConsumer xAgent) {
		return new Object[] { xAgentToAgent, agent, xAgent };
	}

	public static final Object[] pattern_XConsumerToConsumerRule_1_2_collecttranslatedelements_greenFBBB(
			XAgentToAgent xAgentToAgent, Consumer agent, XConsumer xAgent) {
		PerformRuleResult ruleresult = RuntimeFactory.eINSTANCE.createPerformRuleResult();
		ruleresult.getCreatedLinkElements().add(xAgentToAgent);
		ruleresult.getCreatedElements().add(agent);
		ruleresult.getTranslatedElements().add(xAgent);
		return new Object[] { ruleresult, xAgentToAgent, agent, xAgent };
	}

	public static final Object[] pattern_XConsumerToConsumerRule_1_3_bookkeepingforedges_blackBBBBBBB(
			PerformRuleResult ruleresult, EObject xAgentToAgent, EObject container, EObject agent, EObject xAgent,
			EObject xContainerToContainer, EObject xContainer) {
		if (!xAgentToAgent.equals(xContainerToContainer)) {
			if (!xAgentToAgent.equals(xContainer)) {
				if (!container.equals(xAgentToAgent)) {
					if (!container.equals(xAgent)) {
						if (!container.equals(xContainerToContainer)) {
							if (!container.equals(xContainer)) {
								if (!agent.equals(xAgentToAgent)) {
									if (!agent.equals(container)) {
										if (!agent.equals(xAgent)) {
											if (!agent.equals(xContainerToContainer)) {
												if (!agent.equals(xContainer)) {
													if (!xAgent.equals(xAgentToAgent)) {
														if (!xAgent.equals(xContainerToContainer)) {
															if (!xAgent.equals(xContainer)) {
																if (!xContainer.equals(xContainerToContainer)) {
																	return new Object[] { ruleresult, xAgentToAgent,
																			container, agent, xAgent,
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

	public static final Object[] pattern_XConsumerToConsumerRule_1_3_bookkeepingforedges_greenBBBBBBFFFF(
			PerformRuleResult ruleresult, EObject xAgentToAgent, EObject container, EObject agent, EObject xAgent,
			EObject xContainer) {
		EMoflonEdge xAgentToAgent__agent____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge container__agent____agents = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge xAgentToAgent__xAgent____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge xContainer__xAgent____agents = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String ruleresult_ruleName_prime = "XConsumerToConsumerRule";
		String xAgentToAgent__agent____target_name_prime = "target";
		String container__agent____agents_name_prime = "agents";
		String xAgentToAgent__xAgent____source_name_prime = "source";
		String xContainer__xAgent____agents_name_prime = "agents";
		xAgentToAgent__agent____target.setSrc(xAgentToAgent);
		xAgentToAgent__agent____target.setTrg(agent);
		ruleresult.getCreatedEdges().add(xAgentToAgent__agent____target);
		container__agent____agents.setSrc(container);
		container__agent____agents.setTrg(agent);
		ruleresult.getCreatedEdges().add(container__agent____agents);
		xAgentToAgent__xAgent____source.setSrc(xAgentToAgent);
		xAgentToAgent__xAgent____source.setTrg(xAgent);
		ruleresult.getCreatedEdges().add(xAgentToAgent__xAgent____source);
		xContainer__xAgent____agents.setSrc(xContainer);
		xContainer__xAgent____agents.setTrg(xAgent);
		ruleresult.getTranslatedEdges().add(xContainer__xAgent____agents);
		ruleresult.setRuleName(ruleresult_ruleName_prime);
		xAgentToAgent__agent____target.setName(xAgentToAgent__agent____target_name_prime);
		container__agent____agents.setName(container__agent____agents_name_prime);
		xAgentToAgent__xAgent____source.setName(xAgentToAgent__xAgent____source_name_prime);
		xContainer__xAgent____agents.setName(xContainer__xAgent____agents_name_prime);
		return new Object[] { ruleresult, xAgentToAgent, container, agent, xAgent, xContainer,
				xAgentToAgent__agent____target, container__agent____agents, xAgentToAgent__xAgent____source,
				xContainer__xAgent____agents };
	}

	public static final void pattern_XConsumerToConsumerRule_1_5_registerobjects_expressionBBBBBBBB(
			XConsumerToConsumerRule _this, PerformRuleResult ruleresult, EObject xAgentToAgent, EObject container,
			EObject agent, EObject xAgent, EObject xContainerToContainer, EObject xContainer) {
		_this.registerObjects_FWD(ruleresult, xAgentToAgent, container, agent, xAgent, xContainerToContainer,
				xContainer);

	}

	public static final PerformRuleResult pattern_XConsumerToConsumerRule_1_6_expressionFB(
			PerformRuleResult ruleresult) {
		PerformRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_XConsumerToConsumerRule_2_1_preparereturnvalue_bindingFB(
			XConsumerToConsumerRule _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass eClass = _localVariable_0;
		if (eClass != null) {
			return new Object[] { eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_XConsumerToConsumerRule_2_1_preparereturnvalue_blackFBB(EClass eClass,
			XConsumerToConsumerRule _this) {
		for (EOperation performOperation : eClass.getEOperations()) {
			String performOperation_name = performOperation.getName();
			if (performOperation_name.equals("perform_FWD")) {
				return new Object[] { performOperation, eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_XConsumerToConsumerRule_2_1_preparereturnvalue_bindingAndBlackFFB(
			XConsumerToConsumerRule _this) {
		Object[] result_pattern_XConsumerToConsumerRule_2_1_preparereturnvalue_binding = pattern_XConsumerToConsumerRule_2_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_XConsumerToConsumerRule_2_1_preparereturnvalue_binding != null) {
			EClass eClass = (EClass) result_pattern_XConsumerToConsumerRule_2_1_preparereturnvalue_binding[0];

			Object[] result_pattern_XConsumerToConsumerRule_2_1_preparereturnvalue_black = pattern_XConsumerToConsumerRule_2_1_preparereturnvalue_blackFBB(
					eClass, _this);
			if (result_pattern_XConsumerToConsumerRule_2_1_preparereturnvalue_black != null) {
				EOperation performOperation = (EOperation) result_pattern_XConsumerToConsumerRule_2_1_preparereturnvalue_black[0];

				return new Object[] { performOperation, eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_XConsumerToConsumerRule_2_1_preparereturnvalue_greenBF(
			EOperation performOperation) {
		IsApplicableRuleResult ruleresult = RuntimeFactory.eINSTANCE.createIsApplicableRuleResult();
		boolean ruleresult_success_prime = Boolean.valueOf(false);
		String ruleresult_rule_prime = "XConsumerToConsumerRule";
		ruleresult.setPerformOperation(performOperation);
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		ruleresult.setRule(ruleresult_rule_prime);
		return new Object[] { performOperation, ruleresult };
	}

	public static final Object[] pattern_XConsumerToConsumerRule_2_2_corematch_bindingFFB(Match match) {
		EObject _localVariable_0 = match.getObject("xAgent");
		EObject _localVariable_1 = match.getObject("xContainer");
		EObject tmpXAgent = _localVariable_0;
		EObject tmpXContainer = _localVariable_1;
		if (tmpXAgent instanceof XConsumer) {
			XConsumer xAgent = (XConsumer) tmpXAgent;
			if (tmpXContainer instanceof XContainer) {
				XContainer xContainer = (XContainer) tmpXContainer;
				return new Object[] { xAgent, xContainer, match };
			}
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_XConsumerToConsumerRule_2_2_corematch_blackFBFBB(XConsumer xAgent,
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

	public static final Iterable<Object[]> pattern_XConsumerToConsumerRule_2_3_findcontext_blackBBBB(
			Container container, XConsumer xAgent, XContainerToContainer xContainerToContainer, XContainer xContainer) {
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

	public static final Object[] pattern_XConsumerToConsumerRule_2_3_findcontext_greenBBBBFFFF(Container container,
			XConsumer xAgent, XContainerToContainer xContainerToContainer, XContainer xContainer) {
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

	public static final Object[] pattern_XConsumerToConsumerRule_2_4_solveCSP_bindingFBBBBBB(
			XConsumerToConsumerRule _this, IsApplicableMatch isApplicableMatch, Container container, XConsumer xAgent,
			XContainerToContainer xContainerToContainer, XContainer xContainer) {
		CSP _localVariable_0 = _this.isApplicable_solveCsp_FWD(isApplicableMatch, container, xAgent,
				xContainerToContainer, xContainer);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, container, xAgent, xContainerToContainer, xContainer };
		}
		return null;
	}

	public static final Object[] pattern_XConsumerToConsumerRule_2_4_solveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_XConsumerToConsumerRule_2_4_solveCSP_bindingAndBlackFBBBBBB(
			XConsumerToConsumerRule _this, IsApplicableMatch isApplicableMatch, Container container, XConsumer xAgent,
			XContainerToContainer xContainerToContainer, XContainer xContainer) {
		Object[] result_pattern_XConsumerToConsumerRule_2_4_solveCSP_binding = pattern_XConsumerToConsumerRule_2_4_solveCSP_bindingFBBBBBB(
				_this, isApplicableMatch, container, xAgent, xContainerToContainer, xContainer);
		if (result_pattern_XConsumerToConsumerRule_2_4_solveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_XConsumerToConsumerRule_2_4_solveCSP_binding[0];

			Object[] result_pattern_XConsumerToConsumerRule_2_4_solveCSP_black = pattern_XConsumerToConsumerRule_2_4_solveCSP_blackB(
					csp);
			if (result_pattern_XConsumerToConsumerRule_2_4_solveCSP_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, container, xAgent, xContainerToContainer,
						xContainer };
			}
		}
		return null;
	}

	public static final boolean pattern_XConsumerToConsumerRule_2_5_checkCSP_expressionFBB(
			XConsumerToConsumerRule _this, CSP csp) {
		boolean _localVariable_0 = _this.isApplicable_checkCsp_FWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_XConsumerToConsumerRule_2_6_addmatchtoruleresult_blackBB(
			IsApplicableRuleResult ruleresult, IsApplicableMatch isApplicableMatch) {
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final Object[] pattern_XConsumerToConsumerRule_2_6_addmatchtoruleresult_greenBB(
			IsApplicableRuleResult ruleresult, IsApplicableMatch isApplicableMatch) {
		ruleresult.getIsApplicableMatch().add(isApplicableMatch);
		boolean ruleresult_success_prime = Boolean.valueOf(true);
		String isApplicableMatch_ruleName_prime = "XConsumerToConsumerRule";
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		isApplicableMatch.setRuleName(isApplicableMatch_ruleName_prime);
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final IsApplicableRuleResult pattern_XConsumerToConsumerRule_2_7_expressionFB(
			IsApplicableRuleResult ruleresult) {
		IsApplicableRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_XConsumerToConsumerRule_10_1_initialbindings_blackBBBB(
			XConsumerToConsumerRule _this, Match match, Container container, Consumer agent) {
		return new Object[] { _this, match, container, agent };
	}

	public static final Object[] pattern_XConsumerToConsumerRule_10_2_SolveCSP_bindingFBBBB(
			XConsumerToConsumerRule _this, Match match, Container container, Consumer agent) {
		CSP _localVariable_0 = _this.isAppropriate_solveCsp_BWD(match, container, agent);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, match, container, agent };
		}
		return null;
	}

	public static final Object[] pattern_XConsumerToConsumerRule_10_2_SolveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_XConsumerToConsumerRule_10_2_SolveCSP_bindingAndBlackFBBBB(
			XConsumerToConsumerRule _this, Match match, Container container, Consumer agent) {
		Object[] result_pattern_XConsumerToConsumerRule_10_2_SolveCSP_binding = pattern_XConsumerToConsumerRule_10_2_SolveCSP_bindingFBBBB(
				_this, match, container, agent);
		if (result_pattern_XConsumerToConsumerRule_10_2_SolveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_XConsumerToConsumerRule_10_2_SolveCSP_binding[0];

			Object[] result_pattern_XConsumerToConsumerRule_10_2_SolveCSP_black = pattern_XConsumerToConsumerRule_10_2_SolveCSP_blackB(
					csp);
			if (result_pattern_XConsumerToConsumerRule_10_2_SolveCSP_black != null) {

				return new Object[] { csp, _this, match, container, agent };
			}
		}
		return null;
	}

	public static final boolean pattern_XConsumerToConsumerRule_10_3_CheckCSP_expressionFBB(
			XConsumerToConsumerRule _this, CSP csp) {
		boolean _localVariable_0 = _this.isAppropriate_checkCsp_BWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_XConsumerToConsumerRule_10_4_collectelementstobetranslated_blackBBB(
			Match match, Container container, Consumer agent) {
		return new Object[] { match, container, agent };
	}

	public static final Object[] pattern_XConsumerToConsumerRule_10_4_collectelementstobetranslated_greenBBBF(
			Match match, Container container, Consumer agent) {
		EMoflonEdge container__agent____agents = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		match.getToBeTranslatedNodes().add(agent);
		String container__agent____agents_name_prime = "agents";
		container__agent____agents.setSrc(container);
		container__agent____agents.setTrg(agent);
		match.getToBeTranslatedEdges().add(container__agent____agents);
		container__agent____agents.setName(container__agent____agents_name_prime);
		return new Object[] { match, container, agent, container__agent____agents };
	}

	public static final Object[] pattern_XConsumerToConsumerRule_10_5_collectcontextelements_blackBBB(Match match,
			Container container, Consumer agent) {
		return new Object[] { match, container, agent };
	}

	public static final Object[] pattern_XConsumerToConsumerRule_10_5_collectcontextelements_greenBB(Match match,
			Container container) {
		match.getContextNodes().add(container);
		return new Object[] { match, container };
	}

	public static final void pattern_XConsumerToConsumerRule_10_6_registerobjectstomatch_expressionBBBB(
			XConsumerToConsumerRule _this, Match match, Container container, Consumer agent) {
		_this.registerObjectsToMatch_BWD(match, container, agent);

	}

	public static final boolean pattern_XConsumerToConsumerRule_10_7_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_XConsumerToConsumerRule_10_8_expressionF() {
		boolean _result = Boolean.valueOf(false);
		return _result;
	}

	public static final Object[] pattern_XConsumerToConsumerRule_11_1_performtransformation_bindingFFFFB(
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
			if (tmpAgent instanceof Consumer) {
				Consumer agent = (Consumer) tmpAgent;
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

	public static final Object[] pattern_XConsumerToConsumerRule_11_1_performtransformation_blackBBBBFBB(
			Container container, Consumer agent, XContainerToContainer xContainerToContainer, XContainer xContainer,
			XConsumerToConsumerRule _this, IsApplicableMatch isApplicableMatch) {
		for (EObject tmpCsp : isApplicableMatch.getAttributeInfo()) {
			if (tmpCsp instanceof CSP) {
				CSP csp = (CSP) tmpCsp;
				return new Object[] { container, agent, xContainerToContainer, xContainer, csp, _this,
						isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_XConsumerToConsumerRule_11_1_performtransformation_bindingAndBlackFFFFFBB(
			XConsumerToConsumerRule _this, IsApplicableMatch isApplicableMatch) {
		Object[] result_pattern_XConsumerToConsumerRule_11_1_performtransformation_binding = pattern_XConsumerToConsumerRule_11_1_performtransformation_bindingFFFFB(
				isApplicableMatch);
		if (result_pattern_XConsumerToConsumerRule_11_1_performtransformation_binding != null) {
			Container container = (Container) result_pattern_XConsumerToConsumerRule_11_1_performtransformation_binding[0];
			Consumer agent = (Consumer) result_pattern_XConsumerToConsumerRule_11_1_performtransformation_binding[1];
			XContainerToContainer xContainerToContainer = (XContainerToContainer) result_pattern_XConsumerToConsumerRule_11_1_performtransformation_binding[2];
			XContainer xContainer = (XContainer) result_pattern_XConsumerToConsumerRule_11_1_performtransformation_binding[3];

			Object[] result_pattern_XConsumerToConsumerRule_11_1_performtransformation_black = pattern_XConsumerToConsumerRule_11_1_performtransformation_blackBBBBFBB(
					container, agent, xContainerToContainer, xContainer, _this, isApplicableMatch);
			if (result_pattern_XConsumerToConsumerRule_11_1_performtransformation_black != null) {
				CSP csp = (CSP) result_pattern_XConsumerToConsumerRule_11_1_performtransformation_black[4];

				return new Object[] { container, agent, xContainerToContainer, xContainer, csp, _this,
						isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_XConsumerToConsumerRule_11_1_performtransformation_greenFBFBB(Consumer agent,
			XContainer xContainer, CSP csp) {
		XAgentToAgent xAgentToAgent = RequirementsTransformatorFactory.eINSTANCE.createXAgentToAgent();
		XConsumer xAgent = ReqXtextFactory.eINSTANCE.createXConsumer();
		Object _localVariable_0 = csp.getValue("xAgent", "speed");
		Object _localVariable_1 = csp.getValue("xAgent", "name");
		xAgentToAgent.setTarget(agent);
		xAgentToAgent.setSource(xAgent);
		xContainer.getAgents().add(xAgent);
		BigInteger xAgent_speed_prime = (BigInteger) _localVariable_0;
		String xAgent_name_prime = (String) _localVariable_1;
		xAgent.setSpeed(xAgent_speed_prime);
		xAgent.setName(xAgent_name_prime);
		return new Object[] { xAgentToAgent, agent, xAgent, xContainer, csp };
	}

	public static final Object[] pattern_XConsumerToConsumerRule_11_2_collecttranslatedelements_blackBBB(
			XAgentToAgent xAgentToAgent, Consumer agent, XConsumer xAgent) {
		return new Object[] { xAgentToAgent, agent, xAgent };
	}

	public static final Object[] pattern_XConsumerToConsumerRule_11_2_collecttranslatedelements_greenFBBB(
			XAgentToAgent xAgentToAgent, Consumer agent, XConsumer xAgent) {
		PerformRuleResult ruleresult = RuntimeFactory.eINSTANCE.createPerformRuleResult();
		ruleresult.getCreatedLinkElements().add(xAgentToAgent);
		ruleresult.getTranslatedElements().add(agent);
		ruleresult.getCreatedElements().add(xAgent);
		return new Object[] { ruleresult, xAgentToAgent, agent, xAgent };
	}

	public static final Object[] pattern_XConsumerToConsumerRule_11_3_bookkeepingforedges_blackBBBBBBB(
			PerformRuleResult ruleresult, EObject xAgentToAgent, EObject container, EObject agent, EObject xAgent,
			EObject xContainerToContainer, EObject xContainer) {
		if (!xAgentToAgent.equals(xContainerToContainer)) {
			if (!xAgentToAgent.equals(xContainer)) {
				if (!container.equals(xAgentToAgent)) {
					if (!container.equals(xAgent)) {
						if (!container.equals(xContainerToContainer)) {
							if (!container.equals(xContainer)) {
								if (!agent.equals(xAgentToAgent)) {
									if (!agent.equals(container)) {
										if (!agent.equals(xAgent)) {
											if (!agent.equals(xContainerToContainer)) {
												if (!agent.equals(xContainer)) {
													if (!xAgent.equals(xAgentToAgent)) {
														if (!xAgent.equals(xContainerToContainer)) {
															if (!xAgent.equals(xContainer)) {
																if (!xContainer.equals(xContainerToContainer)) {
																	return new Object[] { ruleresult, xAgentToAgent,
																			container, agent, xAgent,
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

	public static final Object[] pattern_XConsumerToConsumerRule_11_3_bookkeepingforedges_greenBBBBBBFFFF(
			PerformRuleResult ruleresult, EObject xAgentToAgent, EObject container, EObject agent, EObject xAgent,
			EObject xContainer) {
		EMoflonEdge xAgentToAgent__agent____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge container__agent____agents = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge xAgentToAgent__xAgent____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge xContainer__xAgent____agents = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String ruleresult_ruleName_prime = "XConsumerToConsumerRule";
		String xAgentToAgent__agent____target_name_prime = "target";
		String container__agent____agents_name_prime = "agents";
		String xAgentToAgent__xAgent____source_name_prime = "source";
		String xContainer__xAgent____agents_name_prime = "agents";
		xAgentToAgent__agent____target.setSrc(xAgentToAgent);
		xAgentToAgent__agent____target.setTrg(agent);
		ruleresult.getCreatedEdges().add(xAgentToAgent__agent____target);
		container__agent____agents.setSrc(container);
		container__agent____agents.setTrg(agent);
		ruleresult.getTranslatedEdges().add(container__agent____agents);
		xAgentToAgent__xAgent____source.setSrc(xAgentToAgent);
		xAgentToAgent__xAgent____source.setTrg(xAgent);
		ruleresult.getCreatedEdges().add(xAgentToAgent__xAgent____source);
		xContainer__xAgent____agents.setSrc(xContainer);
		xContainer__xAgent____agents.setTrg(xAgent);
		ruleresult.getCreatedEdges().add(xContainer__xAgent____agents);
		ruleresult.setRuleName(ruleresult_ruleName_prime);
		xAgentToAgent__agent____target.setName(xAgentToAgent__agent____target_name_prime);
		container__agent____agents.setName(container__agent____agents_name_prime);
		xAgentToAgent__xAgent____source.setName(xAgentToAgent__xAgent____source_name_prime);
		xContainer__xAgent____agents.setName(xContainer__xAgent____agents_name_prime);
		return new Object[] { ruleresult, xAgentToAgent, container, agent, xAgent, xContainer,
				xAgentToAgent__agent____target, container__agent____agents, xAgentToAgent__xAgent____source,
				xContainer__xAgent____agents };
	}

	public static final void pattern_XConsumerToConsumerRule_11_5_registerobjects_expressionBBBBBBBB(
			XConsumerToConsumerRule _this, PerformRuleResult ruleresult, EObject xAgentToAgent, EObject container,
			EObject agent, EObject xAgent, EObject xContainerToContainer, EObject xContainer) {
		_this.registerObjects_BWD(ruleresult, xAgentToAgent, container, agent, xAgent, xContainerToContainer,
				xContainer);

	}

	public static final PerformRuleResult pattern_XConsumerToConsumerRule_11_6_expressionFB(
			PerformRuleResult ruleresult) {
		PerformRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_XConsumerToConsumerRule_12_1_preparereturnvalue_bindingFB(
			XConsumerToConsumerRule _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass eClass = _localVariable_0;
		if (eClass != null) {
			return new Object[] { eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_XConsumerToConsumerRule_12_1_preparereturnvalue_blackFBB(EClass eClass,
			XConsumerToConsumerRule _this) {
		for (EOperation performOperation : eClass.getEOperations()) {
			String performOperation_name = performOperation.getName();
			if (performOperation_name.equals("perform_BWD")) {
				return new Object[] { performOperation, eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_XConsumerToConsumerRule_12_1_preparereturnvalue_bindingAndBlackFFB(
			XConsumerToConsumerRule _this) {
		Object[] result_pattern_XConsumerToConsumerRule_12_1_preparereturnvalue_binding = pattern_XConsumerToConsumerRule_12_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_XConsumerToConsumerRule_12_1_preparereturnvalue_binding != null) {
			EClass eClass = (EClass) result_pattern_XConsumerToConsumerRule_12_1_preparereturnvalue_binding[0];

			Object[] result_pattern_XConsumerToConsumerRule_12_1_preparereturnvalue_black = pattern_XConsumerToConsumerRule_12_1_preparereturnvalue_blackFBB(
					eClass, _this);
			if (result_pattern_XConsumerToConsumerRule_12_1_preparereturnvalue_black != null) {
				EOperation performOperation = (EOperation) result_pattern_XConsumerToConsumerRule_12_1_preparereturnvalue_black[0];

				return new Object[] { performOperation, eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_XConsumerToConsumerRule_12_1_preparereturnvalue_greenBF(
			EOperation performOperation) {
		IsApplicableRuleResult ruleresult = RuntimeFactory.eINSTANCE.createIsApplicableRuleResult();
		boolean ruleresult_success_prime = Boolean.valueOf(false);
		String ruleresult_rule_prime = "XConsumerToConsumerRule";
		ruleresult.setPerformOperation(performOperation);
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		ruleresult.setRule(ruleresult_rule_prime);
		return new Object[] { performOperation, ruleresult };
	}

	public static final Object[] pattern_XConsumerToConsumerRule_12_2_corematch_bindingFFB(Match match) {
		EObject _localVariable_0 = match.getObject("container");
		EObject _localVariable_1 = match.getObject("agent");
		EObject tmpContainer = _localVariable_0;
		EObject tmpAgent = _localVariable_1;
		if (tmpContainer instanceof Container) {
			Container container = (Container) tmpContainer;
			if (tmpAgent instanceof Consumer) {
				Consumer agent = (Consumer) tmpAgent;
				return new Object[] { container, agent, match };
			}
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_XConsumerToConsumerRule_12_2_corematch_blackBBFFB(
			Container container, Consumer agent, Match match) {
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

	public static final Iterable<Object[]> pattern_XConsumerToConsumerRule_12_3_findcontext_blackBBBB(
			Container container, Consumer agent, XContainerToContainer xContainerToContainer, XContainer xContainer) {
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

	public static final Object[] pattern_XConsumerToConsumerRule_12_3_findcontext_greenBBBBFFFF(Container container,
			Consumer agent, XContainerToContainer xContainerToContainer, XContainer xContainer) {
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

	public static final Object[] pattern_XConsumerToConsumerRule_12_4_solveCSP_bindingFBBBBBB(
			XConsumerToConsumerRule _this, IsApplicableMatch isApplicableMatch, Container container, Consumer agent,
			XContainerToContainer xContainerToContainer, XContainer xContainer) {
		CSP _localVariable_0 = _this.isApplicable_solveCsp_BWD(isApplicableMatch, container, agent,
				xContainerToContainer, xContainer);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, container, agent, xContainerToContainer, xContainer };
		}
		return null;
	}

	public static final Object[] pattern_XConsumerToConsumerRule_12_4_solveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_XConsumerToConsumerRule_12_4_solveCSP_bindingAndBlackFBBBBBB(
			XConsumerToConsumerRule _this, IsApplicableMatch isApplicableMatch, Container container, Consumer agent,
			XContainerToContainer xContainerToContainer, XContainer xContainer) {
		Object[] result_pattern_XConsumerToConsumerRule_12_4_solveCSP_binding = pattern_XConsumerToConsumerRule_12_4_solveCSP_bindingFBBBBBB(
				_this, isApplicableMatch, container, agent, xContainerToContainer, xContainer);
		if (result_pattern_XConsumerToConsumerRule_12_4_solveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_XConsumerToConsumerRule_12_4_solveCSP_binding[0];

			Object[] result_pattern_XConsumerToConsumerRule_12_4_solveCSP_black = pattern_XConsumerToConsumerRule_12_4_solveCSP_blackB(
					csp);
			if (result_pattern_XConsumerToConsumerRule_12_4_solveCSP_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, container, agent, xContainerToContainer,
						xContainer };
			}
		}
		return null;
	}

	public static final boolean pattern_XConsumerToConsumerRule_12_5_checkCSP_expressionFBB(
			XConsumerToConsumerRule _this, CSP csp) {
		boolean _localVariable_0 = _this.isApplicable_checkCsp_BWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_XConsumerToConsumerRule_12_6_addmatchtoruleresult_blackBB(
			IsApplicableRuleResult ruleresult, IsApplicableMatch isApplicableMatch) {
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final Object[] pattern_XConsumerToConsumerRule_12_6_addmatchtoruleresult_greenBB(
			IsApplicableRuleResult ruleresult, IsApplicableMatch isApplicableMatch) {
		ruleresult.getIsApplicableMatch().add(isApplicableMatch);
		boolean ruleresult_success_prime = Boolean.valueOf(true);
		String isApplicableMatch_ruleName_prime = "XConsumerToConsumerRule";
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		isApplicableMatch.setRuleName(isApplicableMatch_ruleName_prime);
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final IsApplicableRuleResult pattern_XConsumerToConsumerRule_12_7_expressionFB(
			IsApplicableRuleResult ruleresult) {
		IsApplicableRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_XConsumerToConsumerRule_20_1_preparereturnvalue_bindingFB(
			XConsumerToConsumerRule _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_XConsumerToConsumerRule_20_1_preparereturnvalue_blackFBBF(EClass __eClass,
			XConsumerToConsumerRule _this) {
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

	public static final Object[] pattern_XConsumerToConsumerRule_20_1_preparereturnvalue_bindingAndBlackFFBF(
			XConsumerToConsumerRule _this) {
		Object[] result_pattern_XConsumerToConsumerRule_20_1_preparereturnvalue_binding = pattern_XConsumerToConsumerRule_20_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_XConsumerToConsumerRule_20_1_preparereturnvalue_binding != null) {
			EClass __eClass = (EClass) result_pattern_XConsumerToConsumerRule_20_1_preparereturnvalue_binding[0];

			Object[] result_pattern_XConsumerToConsumerRule_20_1_preparereturnvalue_black = pattern_XConsumerToConsumerRule_20_1_preparereturnvalue_blackFBBF(
					__eClass, _this);
			if (result_pattern_XConsumerToConsumerRule_20_1_preparereturnvalue_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_XConsumerToConsumerRule_20_1_preparereturnvalue_black[0];
				EOperation isApplicableCC = (EOperation) result_pattern_XConsumerToConsumerRule_20_1_preparereturnvalue_black[3];

				return new Object[] { __performOperation, __eClass, _this, isApplicableCC };
			}
		}
		return null;
	}

	public static final Object[] pattern_XConsumerToConsumerRule_20_1_preparereturnvalue_greenF() {
		EObjectContainer __result = RuntimeFactory.eINSTANCE.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Iterable<Object[]> pattern_XConsumerToConsumerRule_20_2_testcorematchandDECs_blackFFB(
			EMoflonEdge _edge_agents) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		EObject tmpContainer = _edge_agents.getSrc();
		if (tmpContainer instanceof Container) {
			Container container = (Container) tmpContainer;
			EObject tmpAgent = _edge_agents.getTrg();
			if (tmpAgent instanceof Consumer) {
				Consumer agent = (Consumer) tmpAgent;
				if (container.getAgents().contains(agent)) {
					_result.add(new Object[] { container, agent, _edge_agents });
				}
			}

		}

		return _result;
	}

	public static final Object[] pattern_XConsumerToConsumerRule_20_2_testcorematchandDECs_greenFB(EClass __eClass) {
		Match match = RuntimeFactory.eINSTANCE.createMatch();
		String __eClass_name = __eClass.getName();
		String match_ruleName_prime = __eClass_name;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_XConsumerToConsumerRule_20_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBB(
			XConsumerToConsumerRule _this, Match match, Container container, Consumer agent) {
		boolean _localVariable_0 = _this.isAppropriate_BWD(match, container, agent);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_XConsumerToConsumerRule_20_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(
			XConsumerToConsumerRule _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_BWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_XConsumerToConsumerRule_20_5_Addmatchtoruleresult_blackBBBB(Match match,
			EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		if (!__performOperation.equals(isApplicableCC)) {
			return new Object[] { match, __performOperation, __result, isApplicableCC };
		}
		return null;
	}

	public static final Object[] pattern_XConsumerToConsumerRule_20_5_Addmatchtoruleresult_greenBBBB(Match match,
			EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		match.setIsApplicableCCOperation(isApplicableCC);
		return new Object[] { match, __performOperation, __result, isApplicableCC };
	}

	public static final EObjectContainer pattern_XConsumerToConsumerRule_20_6_expressionFB(EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_XConsumerToConsumerRule_21_1_preparereturnvalue_bindingFB(
			XConsumerToConsumerRule _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_XConsumerToConsumerRule_21_1_preparereturnvalue_blackFBBF(EClass __eClass,
			XConsumerToConsumerRule _this) {
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

	public static final Object[] pattern_XConsumerToConsumerRule_21_1_preparereturnvalue_bindingAndBlackFFBF(
			XConsumerToConsumerRule _this) {
		Object[] result_pattern_XConsumerToConsumerRule_21_1_preparereturnvalue_binding = pattern_XConsumerToConsumerRule_21_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_XConsumerToConsumerRule_21_1_preparereturnvalue_binding != null) {
			EClass __eClass = (EClass) result_pattern_XConsumerToConsumerRule_21_1_preparereturnvalue_binding[0];

			Object[] result_pattern_XConsumerToConsumerRule_21_1_preparereturnvalue_black = pattern_XConsumerToConsumerRule_21_1_preparereturnvalue_blackFBBF(
					__eClass, _this);
			if (result_pattern_XConsumerToConsumerRule_21_1_preparereturnvalue_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_XConsumerToConsumerRule_21_1_preparereturnvalue_black[0];
				EOperation isApplicableCC = (EOperation) result_pattern_XConsumerToConsumerRule_21_1_preparereturnvalue_black[3];

				return new Object[] { __performOperation, __eClass, _this, isApplicableCC };
			}
		}
		return null;
	}

	public static final Object[] pattern_XConsumerToConsumerRule_21_1_preparereturnvalue_greenF() {
		EObjectContainer __result = RuntimeFactory.eINSTANCE.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Iterable<Object[]> pattern_XConsumerToConsumerRule_21_2_testcorematchandDECs_blackFFB(
			EMoflonEdge _edge_agents) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		EObject tmpXContainer = _edge_agents.getSrc();
		if (tmpXContainer instanceof XContainer) {
			XContainer xContainer = (XContainer) tmpXContainer;
			EObject tmpXAgent = _edge_agents.getTrg();
			if (tmpXAgent instanceof XConsumer) {
				XConsumer xAgent = (XConsumer) tmpXAgent;
				if (xContainer.getAgents().contains(xAgent)) {
					_result.add(new Object[] { xAgent, xContainer, _edge_agents });
				}
			}

		}

		return _result;
	}

	public static final Object[] pattern_XConsumerToConsumerRule_21_2_testcorematchandDECs_greenFB(EClass __eClass) {
		Match match = RuntimeFactory.eINSTANCE.createMatch();
		String __eClass_name = __eClass.getName();
		String match_ruleName_prime = __eClass_name;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_XConsumerToConsumerRule_21_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBB(
			XConsumerToConsumerRule _this, Match match, XConsumer xAgent, XContainer xContainer) {
		boolean _localVariable_0 = _this.isAppropriate_FWD(match, xAgent, xContainer);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_XConsumerToConsumerRule_21_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(
			XConsumerToConsumerRule _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_FWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_XConsumerToConsumerRule_21_5_Addmatchtoruleresult_blackBBBB(Match match,
			EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		if (!__performOperation.equals(isApplicableCC)) {
			return new Object[] { match, __performOperation, __result, isApplicableCC };
		}
		return null;
	}

	public static final Object[] pattern_XConsumerToConsumerRule_21_5_Addmatchtoruleresult_greenBBBB(Match match,
			EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		match.setIsApplicableCCOperation(isApplicableCC);
		return new Object[] { match, __performOperation, __result, isApplicableCC };
	}

	public static final EObjectContainer pattern_XConsumerToConsumerRule_21_6_expressionFB(EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_XConsumerToConsumerRule_24_1_prepare_blackB(XConsumerToConsumerRule _this) {
		return new Object[] { _this };
	}

	public static final Object[] pattern_XConsumerToConsumerRule_24_1_prepare_greenF() {
		IsApplicableRuleResult result = RuntimeFactory.eINSTANCE.createIsApplicableRuleResult();
		return new Object[] { result };
	}

	public static final Object[] pattern_XConsumerToConsumerRule_24_2_matchsrctrgcontext_bindingFFFFBB(
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
			if (tmpAgent instanceof Consumer) {
				Consumer agent = (Consumer) tmpAgent;
				if (tmpXAgent instanceof XConsumer) {
					XConsumer xAgent = (XConsumer) tmpXAgent;
					if (tmpXContainer instanceof XContainer) {
						XContainer xContainer = (XContainer) tmpXContainer;
						return new Object[] { container, agent, xAgent, xContainer, targetMatch, sourceMatch };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_XConsumerToConsumerRule_24_2_matchsrctrgcontext_blackBBBBBB(
			Container container, Consumer agent, XConsumer xAgent, XContainer xContainer, Match sourceMatch,
			Match targetMatch) {
		if (!sourceMatch.equals(targetMatch)) {
			return new Object[] { container, agent, xAgent, xContainer, sourceMatch, targetMatch };
		}
		return null;
	}

	public static final Object[] pattern_XConsumerToConsumerRule_24_2_matchsrctrgcontext_bindingAndBlackFFFFBB(
			Match sourceMatch, Match targetMatch) {
		Object[] result_pattern_XConsumerToConsumerRule_24_2_matchsrctrgcontext_binding = pattern_XConsumerToConsumerRule_24_2_matchsrctrgcontext_bindingFFFFBB(
				targetMatch, sourceMatch);
		if (result_pattern_XConsumerToConsumerRule_24_2_matchsrctrgcontext_binding != null) {
			Container container = (Container) result_pattern_XConsumerToConsumerRule_24_2_matchsrctrgcontext_binding[0];
			Consumer agent = (Consumer) result_pattern_XConsumerToConsumerRule_24_2_matchsrctrgcontext_binding[1];
			XConsumer xAgent = (XConsumer) result_pattern_XConsumerToConsumerRule_24_2_matchsrctrgcontext_binding[2];
			XContainer xContainer = (XContainer) result_pattern_XConsumerToConsumerRule_24_2_matchsrctrgcontext_binding[3];

			Object[] result_pattern_XConsumerToConsumerRule_24_2_matchsrctrgcontext_black = pattern_XConsumerToConsumerRule_24_2_matchsrctrgcontext_blackBBBBBB(
					container, agent, xAgent, xContainer, sourceMatch, targetMatch);
			if (result_pattern_XConsumerToConsumerRule_24_2_matchsrctrgcontext_black != null) {

				return new Object[] { container, agent, xAgent, xContainer, sourceMatch, targetMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_XConsumerToConsumerRule_24_3_solvecsp_bindingFBBBBBBB(
			XConsumerToConsumerRule _this, Container container, Consumer agent, XConsumer xAgent, XContainer xContainer,
			Match sourceMatch, Match targetMatch) {
		CSP _localVariable_4 = _this.isApplicable_solveCsp_CC(container, agent, xAgent, xContainer, sourceMatch,
				targetMatch);
		CSP csp = _localVariable_4;
		if (csp != null) {
			return new Object[] { csp, _this, container, agent, xAgent, xContainer, sourceMatch, targetMatch };
		}
		return null;
	}

	public static final Object[] pattern_XConsumerToConsumerRule_24_3_solvecsp_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_XConsumerToConsumerRule_24_3_solvecsp_bindingAndBlackFBBBBBBB(
			XConsumerToConsumerRule _this, Container container, Consumer agent, XConsumer xAgent, XContainer xContainer,
			Match sourceMatch, Match targetMatch) {
		Object[] result_pattern_XConsumerToConsumerRule_24_3_solvecsp_binding = pattern_XConsumerToConsumerRule_24_3_solvecsp_bindingFBBBBBBB(
				_this, container, agent, xAgent, xContainer, sourceMatch, targetMatch);
		if (result_pattern_XConsumerToConsumerRule_24_3_solvecsp_binding != null) {
			CSP csp = (CSP) result_pattern_XConsumerToConsumerRule_24_3_solvecsp_binding[0];

			Object[] result_pattern_XConsumerToConsumerRule_24_3_solvecsp_black = pattern_XConsumerToConsumerRule_24_3_solvecsp_blackB(
					csp);
			if (result_pattern_XConsumerToConsumerRule_24_3_solvecsp_black != null) {

				return new Object[] { csp, _this, container, agent, xAgent, xContainer, sourceMatch, targetMatch };
			}
		}
		return null;
	}

	public static final boolean pattern_XConsumerToConsumerRule_24_4_checkCSP_expressionFB(CSP csp) {
		boolean _localVariable_0 = csp.check();
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Iterable<Object[]> pattern_XConsumerToConsumerRule_24_5_matchcorrcontext_blackBFBBB(
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

	public static final Object[] pattern_XConsumerToConsumerRule_24_5_matchcorrcontext_greenBBBF(
			XContainerToContainer xContainerToContainer, Match sourceMatch, Match targetMatch) {
		CCMatch ccMatch = RuntimeFactory.eINSTANCE.createCCMatch();
		String ccMatch_ruleName_prime = "XConsumerToConsumerRule";
		ccMatch.setSourceMatch(sourceMatch);
		ccMatch.setTargetMatch(targetMatch);
		ccMatch.getAllContextElements().add(xContainerToContainer);
		ccMatch.setRuleName(ccMatch_ruleName_prime);
		return new Object[] { xContainerToContainer, sourceMatch, targetMatch, ccMatch };
	}

	public static final Object[] pattern_XConsumerToConsumerRule_24_6_createcorrespondence_blackBBBBB(
			Container container, Consumer agent, XConsumer xAgent, XContainer xContainer, CCMatch ccMatch) {
		return new Object[] { container, agent, xAgent, xContainer, ccMatch };
	}

	public static final Object[] pattern_XConsumerToConsumerRule_24_6_createcorrespondence_greenFBBB(Consumer agent,
			XConsumer xAgent, CCMatch ccMatch) {
		XAgentToAgent xAgentToAgent = RequirementsTransformatorFactory.eINSTANCE.createXAgentToAgent();
		xAgentToAgent.setTarget(agent);
		xAgentToAgent.setSource(xAgent);
		ccMatch.getCreateCorr().add(xAgentToAgent);
		return new Object[] { xAgentToAgent, agent, xAgent, ccMatch };
	}

	public static final Object[] pattern_XConsumerToConsumerRule_24_7_addtoreturnedresult_blackBB(
			IsApplicableRuleResult result, CCMatch ccMatch) {
		return new Object[] { result, ccMatch };
	}

	public static final Object[] pattern_XConsumerToConsumerRule_24_7_addtoreturnedresult_greenBB(
			IsApplicableRuleResult result, CCMatch ccMatch) {
		result.getIsApplicableMatch().add(ccMatch);
		boolean result_success_prime = Boolean.valueOf(true);
		String ccMatch_ruleName_prime = "XConsumerToConsumerRule";
		result.setSuccess(Boolean.valueOf(result_success_prime));
		ccMatch.setRuleName(ccMatch_ruleName_prime);
		return new Object[] { result, ccMatch };
	}

	public static final IsApplicableRuleResult pattern_XConsumerToConsumerRule_24_8_expressionFB(
			IsApplicableRuleResult result) {
		IsApplicableRuleResult _result = result;
		return _result;
	}

	public static final Object[] pattern_XConsumerToConsumerRule_27_1_matchtggpattern_blackBB(XConsumer xAgent,
			XContainer xContainer) {
		if (xContainer.getAgents().contains(xAgent)) {
			return new Object[] { xAgent, xContainer };
		}
		return null;
	}

	public static final boolean pattern_XConsumerToConsumerRule_27_2_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_XConsumerToConsumerRule_27_3_expressionF() {
		boolean _result = Boolean.valueOf(false);
		return _result;
	}

	public static final Object[] pattern_XConsumerToConsumerRule_28_1_matchtggpattern_blackBB(Container container,
			Consumer agent) {
		if (container.getAgents().contains(agent)) {
			return new Object[] { container, agent };
		}
		return null;
	}

	public static final boolean pattern_XConsumerToConsumerRule_28_2_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_XConsumerToConsumerRule_28_3_expressionF() {
		boolean _result = Boolean.valueOf(false);
		return _result;
	}

	public static final Object[] pattern_XConsumerToConsumerRule_29_1_createresult_blackB(
			XConsumerToConsumerRule _this) {
		return new Object[] { _this };
	}

	public static final Object[] pattern_XConsumerToConsumerRule_29_1_createresult_greenFF() {
		IsApplicableMatch isApplicableMatch = RuntimeFactory.eINSTANCE.createIsApplicableMatch();
		ModelgeneratorRuleResult ruleResult = RuntimeFactory.eINSTANCE.createModelgeneratorRuleResult();
		boolean ruleResult_success_prime = Boolean.valueOf(false);
		ruleResult.setSuccess(Boolean.valueOf(ruleResult_success_prime));
		return new Object[] { isApplicableMatch, ruleResult };
	}

	public static final Object[] pattern_XConsumerToConsumerRule_29_2_isapplicablecore_black_nac_0BB(
			ModelgeneratorRuleResult ruleResult, Container container) {
		if (ruleResult.getTargetObjects().contains(container)) {
			return new Object[] { ruleResult, container };
		}
		return null;
	}

	public static final Object[] pattern_XConsumerToConsumerRule_29_2_isapplicablecore_black_nac_1BB(
			ModelgeneratorRuleResult ruleResult, XContainerToContainer xContainerToContainer) {
		if (ruleResult.getCorrObjects().contains(xContainerToContainer)) {
			return new Object[] { ruleResult, xContainerToContainer };
		}
		return null;
	}

	public static final Object[] pattern_XConsumerToConsumerRule_29_2_isapplicablecore_black_nac_2BB(
			ModelgeneratorRuleResult ruleResult, XContainer xContainer) {
		if (ruleResult.getSourceObjects().contains(xContainer)) {
			return new Object[] { ruleResult, xContainer };
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_XConsumerToConsumerRule_29_2_isapplicablecore_blackFFFFBB(
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
							if (pattern_XConsumerToConsumerRule_29_2_isapplicablecore_black_nac_1BB(ruleResult,
									xContainerToContainer) == null) {
								if (pattern_XConsumerToConsumerRule_29_2_isapplicablecore_black_nac_0BB(ruleResult,
										container) == null) {
									if (pattern_XConsumerToConsumerRule_29_2_isapplicablecore_black_nac_2BB(ruleResult,
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

	public static final Object[] pattern_XConsumerToConsumerRule_29_3_solveCSP_bindingFBBBBBB(
			XConsumerToConsumerRule _this, IsApplicableMatch isApplicableMatch, Container container,
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

	public static final Object[] pattern_XConsumerToConsumerRule_29_3_solveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_XConsumerToConsumerRule_29_3_solveCSP_bindingAndBlackFBBBBBB(
			XConsumerToConsumerRule _this, IsApplicableMatch isApplicableMatch, Container container,
			XContainerToContainer xContainerToContainer, XContainer xContainer, ModelgeneratorRuleResult ruleResult) {
		Object[] result_pattern_XConsumerToConsumerRule_29_3_solveCSP_binding = pattern_XConsumerToConsumerRule_29_3_solveCSP_bindingFBBBBBB(
				_this, isApplicableMatch, container, xContainerToContainer, xContainer, ruleResult);
		if (result_pattern_XConsumerToConsumerRule_29_3_solveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_XConsumerToConsumerRule_29_3_solveCSP_binding[0];

			Object[] result_pattern_XConsumerToConsumerRule_29_3_solveCSP_black = pattern_XConsumerToConsumerRule_29_3_solveCSP_blackB(
					csp);
			if (result_pattern_XConsumerToConsumerRule_29_3_solveCSP_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, container, xContainerToContainer, xContainer,
						ruleResult };
			}
		}
		return null;
	}

	public static final boolean pattern_XConsumerToConsumerRule_29_4_checkCSP_expressionFBB(
			XConsumerToConsumerRule _this, CSP csp) {
		boolean _localVariable_0 = _this.generateModel_checkCsp_BWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_XConsumerToConsumerRule_29_5_checknacs_blackBBB(Container container,
			XContainerToContainer xContainerToContainer, XContainer xContainer) {
		return new Object[] { container, xContainerToContainer, xContainer };
	}

	public static final Object[] pattern_XConsumerToConsumerRule_29_6_perform_blackBBBB(Container container,
			XContainerToContainer xContainerToContainer, XContainer xContainer, ModelgeneratorRuleResult ruleResult) {
		return new Object[] { container, xContainerToContainer, xContainer, ruleResult };
	}

	public static final Object[] pattern_XConsumerToConsumerRule_29_6_perform_greenFBFFBBB(Container container,
			XContainer xContainer, ModelgeneratorRuleResult ruleResult, CSP csp) {
		XAgentToAgent xAgentToAgent = RequirementsTransformatorFactory.eINSTANCE.createXAgentToAgent();
		Consumer agent = RequirementsFactory.eINSTANCE.createConsumer();
		XConsumer xAgent = ReqXtextFactory.eINSTANCE.createXConsumer();
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
		xAgentToAgent.setSource(xAgent);
		xContainer.getAgents().add(xAgent);
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
		return new Object[] { xAgentToAgent, container, agent, xAgent, xContainer, ruleResult, csp };
	}

	public static final ModelgeneratorRuleResult pattern_XConsumerToConsumerRule_29_7_expressionFB(
			ModelgeneratorRuleResult ruleResult) {
		ModelgeneratorRuleResult _result = ruleResult;
		return _result;
	}

	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} //XConsumerToConsumerRuleImpl
