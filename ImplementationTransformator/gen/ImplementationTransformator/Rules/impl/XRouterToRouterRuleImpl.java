/**
 */
package ImplementationTransformator.Rules.impl;

import ImplementationTransformator.ImplementationTransformatorFactory;

import ImplementationTransformator.Rules.RulesPackage;
import ImplementationTransformator.Rules.XRouterToRouterRule;

import ImplementationTransformator.XContainerToContainer;
import ImplementationTransformator.XDeviceToDevice;

import implementation.Container;
import implementation.ImplementationFactory;
import implementation.Router;

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

import xtextImplementation.xtextImpl.Connections;
import xtextImplementation.xtextImpl.XContainer;
import xtextImplementation.xtextImpl.XRouter;
import xtextImplementation.xtextImpl.XtextImplFactory;
// <-- [user defined imports]
import org.moflon.tgg.csp.*;
import ImplementationTransformator.csp.constraints.*;
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
 * An implementation of the model object '<em><b>XRouter To Router Rule</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class XRouterToRouterRuleImpl extends AbstractRuleImpl implements XRouterToRouterRule {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected XRouterToRouterRuleImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RulesPackage.eINSTANCE.getXRouterToRouterRule();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAppropriate_FWD(Match match, XRouter xDevice, XContainer xContainer, Connections connection) {

		Object[] result1_black = XRouterToRouterRuleImpl.pattern_XRouterToRouterRule_0_1_initialbindings_blackBBBBB(
				this, match, xDevice, xContainer, connection);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[match] = " + match + ", " + "[xDevice] = " + xDevice + ", " + "[xContainer] = " + xContainer
					+ ", " + "[connection] = " + connection + ".");
		}

		Object[] result2_bindingAndBlack = XRouterToRouterRuleImpl
				.pattern_XRouterToRouterRule_0_2_SolveCSP_bindingAndBlackFBBBBB(this, match, xDevice, xContainer,
						connection);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[match] = " + match + ", " + "[xDevice] = " + xDevice + ", " + "[xContainer] = " + xContainer
					+ ", " + "[connection] = " + connection + ".");
		}
		CSP csp = (CSP) result2_bindingAndBlack[0];
		// 
		if (XRouterToRouterRuleImpl.pattern_XRouterToRouterRule_0_3_CheckCSP_expressionFBB(this, csp)) {

			Object[] result4_black = XRouterToRouterRuleImpl
					.pattern_XRouterToRouterRule_0_4_collectelementstobetranslated_blackBBBB(match, xDevice, xContainer,
							connection);
			if (result4_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match + ", "
						+ "[xDevice] = " + xDevice + ", " + "[xContainer] = " + xContainer + ", " + "[connection] = "
						+ connection + ".");
			}
			XRouterToRouterRuleImpl.pattern_XRouterToRouterRule_0_4_collectelementstobetranslated_greenBBBBFF(match,
					xDevice, xContainer, connection);
			//nothing EMoflonEdge xContainer__xDevice____elements = (EMoflonEdge) result4_green[4];
			//nothing EMoflonEdge xDevice__connection____connections = (EMoflonEdge) result4_green[5];

			Object[] result5_black = XRouterToRouterRuleImpl
					.pattern_XRouterToRouterRule_0_5_collectcontextelements_blackBBBB(match, xDevice, xContainer,
							connection);
			if (result5_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match + ", "
						+ "[xDevice] = " + xDevice + ", " + "[xContainer] = " + xContainer + ", " + "[connection] = "
						+ connection + ".");
			}
			XRouterToRouterRuleImpl.pattern_XRouterToRouterRule_0_5_collectcontextelements_greenBB(match, xContainer);

			// 
			XRouterToRouterRuleImpl.pattern_XRouterToRouterRule_0_6_registerobjectstomatch_expressionBBBBB(this, match,
					xDevice, xContainer, connection);
			return XRouterToRouterRuleImpl.pattern_XRouterToRouterRule_0_7_expressionF();
		} else {
			return XRouterToRouterRuleImpl.pattern_XRouterToRouterRule_0_8_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PerformRuleResult perform_FWD(IsApplicableMatch isApplicableMatch) {

		Object[] result1_bindingAndBlack = XRouterToRouterRuleImpl
				.pattern_XRouterToRouterRule_1_1_performtransformation_bindingAndBlackFFFFFFBB(this, isApplicableMatch);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[isApplicableMatch] = " + isApplicableMatch + ".");
		}
		Container container = (Container) result1_bindingAndBlack[0];
		XContainerToContainer xContainerToContainer = (XContainerToContainer) result1_bindingAndBlack[1];
		XRouter xDevice = (XRouter) result1_bindingAndBlack[2];
		XContainer xContainer = (XContainer) result1_bindingAndBlack[3];
		Connections connection = (Connections) result1_bindingAndBlack[4];
		CSP csp = (CSP) result1_bindingAndBlack[5];
		Object[] result1_green = XRouterToRouterRuleImpl
				.pattern_XRouterToRouterRule_1_1_performtransformation_greenBBFFB(container, xDevice, csp);
		Router device = (Router) result1_green[2];
		XDeviceToDevice xDeviceToDevice = (XDeviceToDevice) result1_green[3];

		Object[] result2_black = XRouterToRouterRuleImpl
				.pattern_XRouterToRouterRule_1_2_collecttranslatedelements_blackBBBB(xDevice, connection, device,
						xDeviceToDevice);
		if (result2_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[xDevice] = " + xDevice + ", "
					+ "[connection] = " + connection + ", " + "[device] = " + device + ", " + "[xDeviceToDevice] = "
					+ xDeviceToDevice + ".");
		}
		Object[] result2_green = XRouterToRouterRuleImpl
				.pattern_XRouterToRouterRule_1_2_collecttranslatedelements_greenFBBBB(xDevice, connection, device,
						xDeviceToDevice);
		PerformRuleResult ruleresult = (PerformRuleResult) result2_green[0];

		Object[] result3_black = XRouterToRouterRuleImpl
				.pattern_XRouterToRouterRule_1_3_bookkeepingforedges_blackBBBBBBBB(ruleresult, container,
						xContainerToContainer, xDevice, xContainer, connection, device, xDeviceToDevice);
		if (result3_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[ruleresult] = " + ruleresult
					+ ", " + "[container] = " + container + ", " + "[xContainerToContainer] = " + xContainerToContainer
					+ ", " + "[xDevice] = " + xDevice + ", " + "[xContainer] = " + xContainer + ", " + "[connection] = "
					+ connection + ", " + "[device] = " + device + ", " + "[xDeviceToDevice] = " + xDeviceToDevice
					+ ".");
		}
		XRouterToRouterRuleImpl.pattern_XRouterToRouterRule_1_3_bookkeepingforedges_greenBBBBBBBFFFFF(ruleresult,
				container, xDevice, xContainer, connection, device, xDeviceToDevice);
		//nothing EMoflonEdge container__device____devices = (EMoflonEdge) result3_green[7];
		//nothing EMoflonEdge xDeviceToDevice__xDevice____source = (EMoflonEdge) result3_green[8];
		//nothing EMoflonEdge xDeviceToDevice__device____target = (EMoflonEdge) result3_green[9];
		//nothing EMoflonEdge xContainer__xDevice____elements = (EMoflonEdge) result3_green[10];
		//nothing EMoflonEdge xDevice__connection____connections = (EMoflonEdge) result3_green[11];

		// 
		// 
		XRouterToRouterRuleImpl.pattern_XRouterToRouterRule_1_5_registerobjects_expressionBBBBBBBBB(this, ruleresult,
				container, xContainerToContainer, xDevice, xContainer, connection, device, xDeviceToDevice);
		return XRouterToRouterRuleImpl.pattern_XRouterToRouterRule_1_6_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IsApplicableRuleResult isApplicable_FWD(Match match) {

		Object[] result1_bindingAndBlack = XRouterToRouterRuleImpl
				.pattern_XRouterToRouterRule_2_1_preparereturnvalue_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		EOperation performOperation = (EOperation) result1_bindingAndBlack[0];
		//nothing EClass eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = XRouterToRouterRuleImpl
				.pattern_XRouterToRouterRule_2_1_preparereturnvalue_greenBF(performOperation);
		IsApplicableRuleResult ruleresult = (IsApplicableRuleResult) result1_green[1];

		// ForEach 
		Object[] result2_binding = XRouterToRouterRuleImpl.pattern_XRouterToRouterRule_2_2_corematch_bindingFFFB(match);
		if (result2_binding == null) {
			throw new RuntimeException(
					"Binding in node core match failed." + " Variables: " + "[match] = " + match + ".");
		}
		XRouter xDevice = (XRouter) result2_binding[0];
		XContainer xContainer = (XContainer) result2_binding[1];
		Connections connection = (Connections) result2_binding[2];
		for (Object[] result2_black : XRouterToRouterRuleImpl
				.pattern_XRouterToRouterRule_2_2_corematch_blackFFBBBB(xDevice, xContainer, connection, match)) {
			Container container = (Container) result2_black[0];
			XContainerToContainer xContainerToContainer = (XContainerToContainer) result2_black[1];
			// ForEach 
			for (Object[] result3_black : XRouterToRouterRuleImpl
					.pattern_XRouterToRouterRule_2_3_findcontext_blackBBBBB(container, xContainerToContainer, xDevice,
							xContainer, connection)) {
				Object[] result3_green = XRouterToRouterRuleImpl
						.pattern_XRouterToRouterRule_2_3_findcontext_greenBBBBBFFFFF(container, xContainerToContainer,
								xDevice, xContainer, connection);
				IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result3_green[5];
				//nothing EMoflonEdge xContainerToContainer__xContainer____source = (EMoflonEdge) result3_green[6];
				//nothing EMoflonEdge xContainerToContainer__container____target = (EMoflonEdge) result3_green[7];
				//nothing EMoflonEdge xContainer__xDevice____elements = (EMoflonEdge) result3_green[8];
				//nothing EMoflonEdge xDevice__connection____connections = (EMoflonEdge) result3_green[9];

				Object[] result4_bindingAndBlack = XRouterToRouterRuleImpl
						.pattern_XRouterToRouterRule_2_4_solveCSP_bindingAndBlackFBBBBBBB(this, isApplicableMatch,
								container, xContainerToContainer, xDevice, xContainer, connection);
				if (result4_bindingAndBlack == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
							+ "[isApplicableMatch] = " + isApplicableMatch + ", " + "[container] = " + container + ", "
							+ "[xContainerToContainer] = " + xContainerToContainer + ", " + "[xDevice] = " + xDevice
							+ ", " + "[xContainer] = " + xContainer + ", " + "[connection] = " + connection + ".");
				}
				CSP csp = (CSP) result4_bindingAndBlack[0];
				// 
				if (XRouterToRouterRuleImpl.pattern_XRouterToRouterRule_2_5_checkCSP_expressionFBB(this, csp)) {

					Object[] result6_black = XRouterToRouterRuleImpl
							.pattern_XRouterToRouterRule_2_6_addmatchtoruleresult_blackBB(ruleresult,
									isApplicableMatch);
					if (result6_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[ruleresult] = "
								+ ruleresult + ", " + "[isApplicableMatch] = " + isApplicableMatch + ".");
					}
					XRouterToRouterRuleImpl.pattern_XRouterToRouterRule_2_6_addmatchtoruleresult_greenBB(ruleresult,
							isApplicableMatch);

				} else {
				}

			}

		}
		return XRouterToRouterRuleImpl.pattern_XRouterToRouterRule_2_7_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void registerObjectsToMatch_FWD(Match match, XRouter xDevice, XContainer xContainer,
			Connections connection) {
		match.registerObject("xDevice", xDevice);
		match.registerObject("xContainer", xContainer);
		match.registerObject("connection", connection);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isAppropriate_solveCsp_FWD(Match match, XRouter xDevice, XContainer xContainer, Connections connection) {// Create CSP
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
	public CSP isApplicable_solveCsp_FWD(IsApplicableMatch isApplicableMatch, Container container,
			XContainerToContainer xContainerToContainer, XRouter xDevice, XContainer xContainer,
			Connections connection) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals

		// Create attribute variables
		Variable var_xDevice_maxSpeed = CSPFactoryHelper.eINSTANCE.createVariable("xDevice.maxSpeed", true, csp);
		var_xDevice_maxSpeed.setValue(xDevice.getMaxSpeed());
		var_xDevice_maxSpeed.setType("BigInteger");
		Variable var_xDevice_name = CSPFactoryHelper.eINSTANCE.createVariable("xDevice.name", true, csp);
		var_xDevice_name.setValue(xDevice.getName());
		var_xDevice_name.setType("String");

		// Create unbound variables
		Variable var_device_maxSpeed = CSPFactoryHelper.eINSTANCE.createVariable("device.maxSpeed", csp);
		var_device_maxSpeed.setType("BigInteger");
		Variable var_device_name = CSPFactoryHelper.eINSTANCE.createVariable("device.name", csp);
		var_device_name.setType("String");

		// Create constraints
		Eq eq = new Eq();
		Eq eq_0 = new Eq();

		csp.getConstraints().add(eq);
		csp.getConstraints().add(eq_0);

		// Solve CSP
		eq.setRuleName("NoRuleName");
		eq.solve(var_xDevice_maxSpeed, var_device_maxSpeed);
		eq_0.setRuleName("NoRuleName");
		eq_0.solve(var_xDevice_name, var_device_name);

		// Snapshot pattern match on which CSP is solved
		isApplicableMatch.registerObject("container", container);
		isApplicableMatch.registerObject("xContainerToContainer", xContainerToContainer);
		isApplicableMatch.registerObject("xDevice", xDevice);
		isApplicableMatch.registerObject("xContainer", xContainer);
		isApplicableMatch.registerObject("connection", connection);
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
	public void registerObjects_FWD(PerformRuleResult ruleresult, EObject container, EObject xContainerToContainer,
			EObject xDevice, EObject xContainer, EObject connection, EObject device, EObject xDeviceToDevice) {
		ruleresult.registerObject("container", container);
		ruleresult.registerObject("xContainerToContainer", xContainerToContainer);
		ruleresult.registerObject("xDevice", xDevice);
		ruleresult.registerObject("xContainer", xContainer);
		ruleresult.registerObject("connection", connection);
		ruleresult.registerObject("device", device);
		ruleresult.registerObject("xDeviceToDevice", xDeviceToDevice);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean checkTypes_FWD(Match match) {
		return true
				&& org.moflon.util.eMoflonSDMUtil.getFQN(match.getObject("xDevice").eClass())
						.equals("xtextImpl.XRouter.")
				&& org.moflon.util.eMoflonSDMUtil.getFQN(match.getObject("connection").eClass())
						.equals("xtextImpl.Connections.");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAppropriate_BWD(Match match, Container container, Router device) {

		Object[] result1_black = XRouterToRouterRuleImpl
				.pattern_XRouterToRouterRule_10_1_initialbindings_blackBBBB(this, match, container, device);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[match] = " + match + ", " + "[container] = " + container + ", " + "[device] = " + device + ".");
		}

		Object[] result2_bindingAndBlack = XRouterToRouterRuleImpl
				.pattern_XRouterToRouterRule_10_2_SolveCSP_bindingAndBlackFBBBB(this, match, container, device);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[match] = " + match + ", " + "[container] = " + container + ", " + "[device] = " + device + ".");
		}
		CSP csp = (CSP) result2_bindingAndBlack[0];
		// 
		if (XRouterToRouterRuleImpl.pattern_XRouterToRouterRule_10_3_CheckCSP_expressionFBB(this, csp)) {

			Object[] result4_black = XRouterToRouterRuleImpl
					.pattern_XRouterToRouterRule_10_4_collectelementstobetranslated_blackBBB(match, container, device);
			if (result4_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match + ", "
						+ "[container] = " + container + ", " + "[device] = " + device + ".");
			}
			XRouterToRouterRuleImpl.pattern_XRouterToRouterRule_10_4_collectelementstobetranslated_greenBBBF(match,
					container, device);
			//nothing EMoflonEdge container__device____devices = (EMoflonEdge) result4_green[3];

			Object[] result5_black = XRouterToRouterRuleImpl
					.pattern_XRouterToRouterRule_10_5_collectcontextelements_blackBBB(match, container, device);
			if (result5_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match + ", "
						+ "[container] = " + container + ", " + "[device] = " + device + ".");
			}
			XRouterToRouterRuleImpl.pattern_XRouterToRouterRule_10_5_collectcontextelements_greenBB(match, container);

			// 
			XRouterToRouterRuleImpl.pattern_XRouterToRouterRule_10_6_registerobjectstomatch_expressionBBBB(this, match,
					container, device);
			return XRouterToRouterRuleImpl.pattern_XRouterToRouterRule_10_7_expressionF();
		} else {
			return XRouterToRouterRuleImpl.pattern_XRouterToRouterRule_10_8_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PerformRuleResult perform_BWD(IsApplicableMatch isApplicableMatch) {

		Object[] result1_bindingAndBlack = XRouterToRouterRuleImpl
				.pattern_XRouterToRouterRule_11_1_performtransformation_bindingAndBlackFFFFFBB(this, isApplicableMatch);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[isApplicableMatch] = " + isApplicableMatch + ".");
		}
		Container container = (Container) result1_bindingAndBlack[0];
		XContainerToContainer xContainerToContainer = (XContainerToContainer) result1_bindingAndBlack[1];
		XContainer xContainer = (XContainer) result1_bindingAndBlack[2];
		Router device = (Router) result1_bindingAndBlack[3];
		CSP csp = (CSP) result1_bindingAndBlack[4];
		Object[] result1_green = XRouterToRouterRuleImpl
				.pattern_XRouterToRouterRule_11_1_performtransformation_greenFBFBFB(xContainer, device, csp);
		XRouter xDevice = (XRouter) result1_green[0];
		Connections connection = (Connections) result1_green[2];
		XDeviceToDevice xDeviceToDevice = (XDeviceToDevice) result1_green[4];

		Object[] result2_black = XRouterToRouterRuleImpl
				.pattern_XRouterToRouterRule_11_2_collecttranslatedelements_blackBBBB(xDevice, connection, device,
						xDeviceToDevice);
		if (result2_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[xDevice] = " + xDevice + ", "
					+ "[connection] = " + connection + ", " + "[device] = " + device + ", " + "[xDeviceToDevice] = "
					+ xDeviceToDevice + ".");
		}
		Object[] result2_green = XRouterToRouterRuleImpl
				.pattern_XRouterToRouterRule_11_2_collecttranslatedelements_greenFBBBB(xDevice, connection, device,
						xDeviceToDevice);
		PerformRuleResult ruleresult = (PerformRuleResult) result2_green[0];

		Object[] result3_black = XRouterToRouterRuleImpl
				.pattern_XRouterToRouterRule_11_3_bookkeepingforedges_blackBBBBBBBB(ruleresult, container,
						xContainerToContainer, xDevice, xContainer, connection, device, xDeviceToDevice);
		if (result3_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[ruleresult] = " + ruleresult
					+ ", " + "[container] = " + container + ", " + "[xContainerToContainer] = " + xContainerToContainer
					+ ", " + "[xDevice] = " + xDevice + ", " + "[xContainer] = " + xContainer + ", " + "[connection] = "
					+ connection + ", " + "[device] = " + device + ", " + "[xDeviceToDevice] = " + xDeviceToDevice
					+ ".");
		}
		XRouterToRouterRuleImpl.pattern_XRouterToRouterRule_11_3_bookkeepingforedges_greenBBBBBBBFFFFF(ruleresult,
				container, xDevice, xContainer, connection, device, xDeviceToDevice);
		//nothing EMoflonEdge container__device____devices = (EMoflonEdge) result3_green[7];
		//nothing EMoflonEdge xDeviceToDevice__xDevice____source = (EMoflonEdge) result3_green[8];
		//nothing EMoflonEdge xDeviceToDevice__device____target = (EMoflonEdge) result3_green[9];
		//nothing EMoflonEdge xContainer__xDevice____elements = (EMoflonEdge) result3_green[10];
		//nothing EMoflonEdge xDevice__connection____connections = (EMoflonEdge) result3_green[11];

		// 
		// 
		XRouterToRouterRuleImpl.pattern_XRouterToRouterRule_11_5_registerobjects_expressionBBBBBBBBB(this, ruleresult,
				container, xContainerToContainer, xDevice, xContainer, connection, device, xDeviceToDevice);
		return XRouterToRouterRuleImpl.pattern_XRouterToRouterRule_11_6_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IsApplicableRuleResult isApplicable_BWD(Match match) {

		Object[] result1_bindingAndBlack = XRouterToRouterRuleImpl
				.pattern_XRouterToRouterRule_12_1_preparereturnvalue_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		EOperation performOperation = (EOperation) result1_bindingAndBlack[0];
		//nothing EClass eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = XRouterToRouterRuleImpl
				.pattern_XRouterToRouterRule_12_1_preparereturnvalue_greenBF(performOperation);
		IsApplicableRuleResult ruleresult = (IsApplicableRuleResult) result1_green[1];

		// ForEach 
		Object[] result2_binding = XRouterToRouterRuleImpl.pattern_XRouterToRouterRule_12_2_corematch_bindingFFB(match);
		if (result2_binding == null) {
			throw new RuntimeException(
					"Binding in node core match failed." + " Variables: " + "[match] = " + match + ".");
		}
		Container container = (Container) result2_binding[0];
		Router device = (Router) result2_binding[1];
		for (Object[] result2_black : XRouterToRouterRuleImpl
				.pattern_XRouterToRouterRule_12_2_corematch_blackBFFBB(container, device, match)) {
			XContainerToContainer xContainerToContainer = (XContainerToContainer) result2_black[1];
			XContainer xContainer = (XContainer) result2_black[2];
			// ForEach 
			for (Object[] result3_black : XRouterToRouterRuleImpl
					.pattern_XRouterToRouterRule_12_3_findcontext_blackBBBB(container, xContainerToContainer,
							xContainer, device)) {
				Object[] result3_green = XRouterToRouterRuleImpl
						.pattern_XRouterToRouterRule_12_3_findcontext_greenBBBBFFFF(container, xContainerToContainer,
								xContainer, device);
				IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result3_green[4];
				//nothing EMoflonEdge container__device____devices = (EMoflonEdge) result3_green[5];
				//nothing EMoflonEdge xContainerToContainer__xContainer____source = (EMoflonEdge) result3_green[6];
				//nothing EMoflonEdge xContainerToContainer__container____target = (EMoflonEdge) result3_green[7];

				Object[] result4_bindingAndBlack = XRouterToRouterRuleImpl
						.pattern_XRouterToRouterRule_12_4_solveCSP_bindingAndBlackFBBBBBB(this, isApplicableMatch,
								container, xContainerToContainer, xContainer, device);
				if (result4_bindingAndBlack == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
							+ "[isApplicableMatch] = " + isApplicableMatch + ", " + "[container] = " + container + ", "
							+ "[xContainerToContainer] = " + xContainerToContainer + ", " + "[xContainer] = "
							+ xContainer + ", " + "[device] = " + device + ".");
				}
				CSP csp = (CSP) result4_bindingAndBlack[0];
				// 
				if (XRouterToRouterRuleImpl.pattern_XRouterToRouterRule_12_5_checkCSP_expressionFBB(this, csp)) {

					Object[] result6_black = XRouterToRouterRuleImpl
							.pattern_XRouterToRouterRule_12_6_addmatchtoruleresult_blackBB(ruleresult,
									isApplicableMatch);
					if (result6_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[ruleresult] = "
								+ ruleresult + ", " + "[isApplicableMatch] = " + isApplicableMatch + ".");
					}
					XRouterToRouterRuleImpl.pattern_XRouterToRouterRule_12_6_addmatchtoruleresult_greenBB(ruleresult,
							isApplicableMatch);

				} else {
				}

			}

		}
		return XRouterToRouterRuleImpl.pattern_XRouterToRouterRule_12_7_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void registerObjectsToMatch_BWD(Match match, Container container, Router device) {
		match.registerObject("container", container);
		match.registerObject("device", device);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isAppropriate_solveCsp_BWD(Match match, Container container, Router device) {// Create CSP
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
	public CSP isApplicable_solveCsp_BWD(IsApplicableMatch isApplicableMatch, Container container,
			XContainerToContainer xContainerToContainer, XContainer xContainer, Router device) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals

		// Create attribute variables
		Variable var_device_maxSpeed = CSPFactoryHelper.eINSTANCE.createVariable("device.maxSpeed", true, csp);
		var_device_maxSpeed.setValue(device.getMaxSpeed());
		var_device_maxSpeed.setType("BigInteger");
		Variable var_device_name = CSPFactoryHelper.eINSTANCE.createVariable("device.name", true, csp);
		var_device_name.setValue(device.getName());
		var_device_name.setType("String");

		// Create unbound variables
		Variable var_xDevice_maxSpeed = CSPFactoryHelper.eINSTANCE.createVariable("xDevice.maxSpeed", csp);
		var_xDevice_maxSpeed.setType("BigInteger");
		Variable var_xDevice_name = CSPFactoryHelper.eINSTANCE.createVariable("xDevice.name", csp);
		var_xDevice_name.setType("String");

		// Create constraints
		Eq eq = new Eq();
		Eq eq_0 = new Eq();

		csp.getConstraints().add(eq);
		csp.getConstraints().add(eq_0);

		// Solve CSP
		eq.setRuleName("NoRuleName");
		eq.solve(var_xDevice_maxSpeed, var_device_maxSpeed);
		eq_0.setRuleName("NoRuleName");
		eq_0.solve(var_xDevice_name, var_device_name);

		// Snapshot pattern match on which CSP is solved
		isApplicableMatch.registerObject("container", container);
		isApplicableMatch.registerObject("xContainerToContainer", xContainerToContainer);
		isApplicableMatch.registerObject("xContainer", xContainer);
		isApplicableMatch.registerObject("device", device);
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
	public void registerObjects_BWD(PerformRuleResult ruleresult, EObject container, EObject xContainerToContainer,
			EObject xDevice, EObject xContainer, EObject connection, EObject device, EObject xDeviceToDevice) {
		ruleresult.registerObject("container", container);
		ruleresult.registerObject("xContainerToContainer", xContainerToContainer);
		ruleresult.registerObject("xDevice", xDevice);
		ruleresult.registerObject("xContainer", xContainer);
		ruleresult.registerObject("connection", connection);
		ruleresult.registerObject("device", device);
		ruleresult.registerObject("xDeviceToDevice", xDeviceToDevice);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean checkTypes_BWD(Match match) {
		return true && org.moflon.util.eMoflonSDMUtil.getFQN(match.getObject("device").eClass())
				.equals("implementation.Router.");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_BWD_EMoflonEdge_12(EMoflonEdge _edge_devices) {

		Object[] result1_bindingAndBlack = XRouterToRouterRuleImpl
				.pattern_XRouterToRouterRule_20_1_preparereturnvalue_bindingAndBlackFFBF(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		EOperation isApplicableCC = (EOperation) result1_bindingAndBlack[3];
		Object[] result1_green = XRouterToRouterRuleImpl.pattern_XRouterToRouterRule_20_1_preparereturnvalue_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach 
		for (Object[] result2_black : XRouterToRouterRuleImpl
				.pattern_XRouterToRouterRule_20_2_testcorematchandDECs_blackFFB(_edge_devices)) {
			Container container = (Container) result2_black[0];
			Router device = (Router) result2_black[1];
			Object[] result2_green = XRouterToRouterRuleImpl
					.pattern_XRouterToRouterRule_20_2_testcorematchandDECs_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// 
			if (XRouterToRouterRuleImpl
					.pattern_XRouterToRouterRule_20_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBB(this,
							match, container, device)) {
				// 
				if (XRouterToRouterRuleImpl
						.pattern_XRouterToRouterRule_20_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(
								this, match)) {

					Object[] result5_black = XRouterToRouterRuleImpl
							.pattern_XRouterToRouterRule_20_5_Addmatchtoruleresult_blackBBBB(match, __performOperation,
									__result, isApplicableCC);
					if (result5_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match
								+ ", " + "[__performOperation] = " + __performOperation + ", " + "[__result] = "
								+ __result + ", " + "[isApplicableCC] = " + isApplicableCC + ".");
					}
					XRouterToRouterRuleImpl.pattern_XRouterToRouterRule_20_5_Addmatchtoruleresult_greenBBBB(match,
							__performOperation, __result, isApplicableCC);

				} else {
				}

			} else {
			}

		}
		return XRouterToRouterRuleImpl.pattern_XRouterToRouterRule_20_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_FWD_EMoflonEdge_8(EMoflonEdge _edge_elements) {

		Object[] result1_bindingAndBlack = XRouterToRouterRuleImpl
				.pattern_XRouterToRouterRule_21_1_preparereturnvalue_bindingAndBlackFFBF(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		EOperation isApplicableCC = (EOperation) result1_bindingAndBlack[3];
		Object[] result1_green = XRouterToRouterRuleImpl.pattern_XRouterToRouterRule_21_1_preparereturnvalue_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach 
		for (Object[] result2_black : XRouterToRouterRuleImpl
				.pattern_XRouterToRouterRule_21_2_testcorematchandDECs_blackFFFB(_edge_elements)) {
			XRouter xDevice = (XRouter) result2_black[0];
			XContainer xContainer = (XContainer) result2_black[1];
			Connections connection = (Connections) result2_black[2];
			Object[] result2_green = XRouterToRouterRuleImpl
					.pattern_XRouterToRouterRule_21_2_testcorematchandDECs_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// 
			if (XRouterToRouterRuleImpl
					.pattern_XRouterToRouterRule_21_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBBB(this,
							match, xDevice, xContainer, connection)) {
				// 
				if (XRouterToRouterRuleImpl
						.pattern_XRouterToRouterRule_21_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(
								this, match)) {

					Object[] result5_black = XRouterToRouterRuleImpl
							.pattern_XRouterToRouterRule_21_5_Addmatchtoruleresult_blackBBBB(match, __performOperation,
									__result, isApplicableCC);
					if (result5_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match
								+ ", " + "[__performOperation] = " + __performOperation + ", " + "[__result] = "
								+ __result + ", " + "[isApplicableCC] = " + isApplicableCC + ".");
					}
					XRouterToRouterRuleImpl.pattern_XRouterToRouterRule_21_5_Addmatchtoruleresult_greenBBBB(match,
							__performOperation, __result, isApplicableCC);

				} else {
				}

			} else {
			}

		}
		return XRouterToRouterRuleImpl.pattern_XRouterToRouterRule_21_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AttributeConstraintsRuleResult checkAttributes_FWD(TripleMatch __tripleMatch) {
		AttributeConstraintsRuleResult ruleResult = org.moflon.tgg.runtime.RuntimeFactory.eINSTANCE
				.createAttributeConstraintsRuleResult();
		ruleResult.setRule("XRouterToRouterRule");
		ruleResult.setSuccess(true);

		CSP csp = CspFactory.eINSTANCE.createCSP();

		CheckAttributeHelper __helper = new CheckAttributeHelper(__tripleMatch);

		Variable var_device_maxSpeed = CSPFactoryHelper.eINSTANCE.createVariable("device", true, csp);
		var_device_maxSpeed.setValue(__helper.getValue("device", "maxSpeed"));
		var_device_maxSpeed.setType("BigInteger");

		Variable var_xDevice_maxSpeed = CSPFactoryHelper.eINSTANCE.createVariable("xDevice", true, csp);
		var_xDevice_maxSpeed.setValue(__helper.getValue("xDevice", "maxSpeed"));
		var_xDevice_maxSpeed.setType("BigInteger");

		Variable var_xDevice_name = CSPFactoryHelper.eINSTANCE.createVariable("xDevice", true, csp);
		var_xDevice_name.setValue(__helper.getValue("xDevice", "name"));
		var_xDevice_name.setType("String");

		Variable var_device_name = CSPFactoryHelper.eINSTANCE.createVariable("device", true, csp);
		var_device_name.setValue(__helper.getValue("device", "name"));
		var_device_name.setType("String");

		Eq eq0 = new Eq();
		csp.getConstraints().add(eq0);

		Eq eq1 = new Eq();
		csp.getConstraints().add(eq1);

		eq0.setRuleName("XRouterToRouterRule");
		eq0.solve(var_xDevice_maxSpeed, var_device_maxSpeed);

		eq1.setRuleName("XRouterToRouterRule");
		eq1.solve(var_xDevice_name, var_device_name);

		if (csp.check()) {
			ruleResult.setSuccess(true);
		} else {
			var_device_maxSpeed.setBound(false);
			var_device_name.setBound(false);
			eq0.solve(var_xDevice_maxSpeed, var_device_maxSpeed);
			eq1.solve(var_xDevice_name, var_device_name);
			if (csp.check()) {
				ruleResult.setSuccess(true);
				ruleResult.setRequiredChange(true);
				__helper.setValue("device", "maxSpeed", var_device_maxSpeed.getValue());
				__helper.setValue("device", "name", var_device_name.getValue());
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
		ruleResult.setRule("XRouterToRouterRule");
		ruleResult.setSuccess(true);

		CSP csp = CspFactory.eINSTANCE.createCSP();

		CheckAttributeHelper __helper = new CheckAttributeHelper(__tripleMatch);

		Variable var_device_maxSpeed = CSPFactoryHelper.eINSTANCE.createVariable("device", true, csp);
		var_device_maxSpeed.setValue(__helper.getValue("device", "maxSpeed"));
		var_device_maxSpeed.setType("BigInteger");

		Variable var_xDevice_maxSpeed = CSPFactoryHelper.eINSTANCE.createVariable("xDevice", true, csp);
		var_xDevice_maxSpeed.setValue(__helper.getValue("xDevice", "maxSpeed"));
		var_xDevice_maxSpeed.setType("BigInteger");

		Variable var_xDevice_name = CSPFactoryHelper.eINSTANCE.createVariable("xDevice", true, csp);
		var_xDevice_name.setValue(__helper.getValue("xDevice", "name"));
		var_xDevice_name.setType("String");

		Variable var_device_name = CSPFactoryHelper.eINSTANCE.createVariable("device", true, csp);
		var_device_name.setValue(__helper.getValue("device", "name"));
		var_device_name.setType("String");

		Eq eq0 = new Eq();
		csp.getConstraints().add(eq0);

		Eq eq1 = new Eq();
		csp.getConstraints().add(eq1);

		eq0.setRuleName("XRouterToRouterRule");
		eq0.solve(var_xDevice_maxSpeed, var_device_maxSpeed);

		eq1.setRuleName("XRouterToRouterRule");
		eq1.solve(var_xDevice_name, var_device_name);

		if (csp.check()) {
			ruleResult.setSuccess(true);
		} else {
			var_xDevice_maxSpeed.setBound(false);
			var_xDevice_name.setBound(false);
			eq0.solve(var_xDevice_maxSpeed, var_device_maxSpeed);
			eq1.solve(var_xDevice_name, var_device_name);
			if (csp.check()) {
				ruleResult.setSuccess(true);
				ruleResult.setRequiredChange(true);
				__helper.setValue("xDevice", "maxSpeed", var_xDevice_maxSpeed.getValue());
				__helper.setValue("xDevice", "name", var_xDevice_name.getValue());
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

		Object[] result1_black = XRouterToRouterRuleImpl.pattern_XRouterToRouterRule_24_1_prepare_blackB(this);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		Object[] result1_green = XRouterToRouterRuleImpl.pattern_XRouterToRouterRule_24_1_prepare_greenF();
		IsApplicableRuleResult result = (IsApplicableRuleResult) result1_green[0];

		Object[] result2_bindingAndBlack = XRouterToRouterRuleImpl
				.pattern_XRouterToRouterRule_24_2_matchsrctrgcontext_bindingAndBlackFFFFFBB(sourceMatch, targetMatch);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[sourceMatch] = " + sourceMatch
					+ ", " + "[targetMatch] = " + targetMatch + ".");
		}
		Container container = (Container) result2_bindingAndBlack[0];
		XRouter xDevice = (XRouter) result2_bindingAndBlack[1];
		XContainer xContainer = (XContainer) result2_bindingAndBlack[2];
		Connections connection = (Connections) result2_bindingAndBlack[3];
		Router device = (Router) result2_bindingAndBlack[4];

		Object[] result3_bindingAndBlack = XRouterToRouterRuleImpl
				.pattern_XRouterToRouterRule_24_3_solvecsp_bindingAndBlackFBBBBBBBB(this, container, xDevice,
						xContainer, connection, device, sourceMatch, targetMatch);
		if (result3_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[container] = " + container + ", " + "[xDevice] = " + xDevice + ", " + "[xContainer] = "
					+ xContainer + ", " + "[connection] = " + connection + ", " + "[device] = " + device + ", "
					+ "[sourceMatch] = " + sourceMatch + ", " + "[targetMatch] = " + targetMatch + ".");
		}
		CSP csp = (CSP) result3_bindingAndBlack[0];
		// 
		if (XRouterToRouterRuleImpl.pattern_XRouterToRouterRule_24_4_checkCSP_expressionFB(csp)) {
			// ForEach 
			for (Object[] result5_black : XRouterToRouterRuleImpl
					.pattern_XRouterToRouterRule_24_5_matchcorrcontext_blackBFBBB(container, xContainer, sourceMatch,
							targetMatch)) {
				XContainerToContainer xContainerToContainer = (XContainerToContainer) result5_black[1];
				Object[] result5_green = XRouterToRouterRuleImpl
						.pattern_XRouterToRouterRule_24_5_matchcorrcontext_greenBBBF(xContainerToContainer, sourceMatch,
								targetMatch);
				CCMatch ccMatch = (CCMatch) result5_green[3];

				Object[] result6_black = XRouterToRouterRuleImpl
						.pattern_XRouterToRouterRule_24_6_createcorrespondence_blackBBBBBB(container, xDevice,
								xContainer, connection, device, ccMatch);
				if (result6_black == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[container] = "
							+ container + ", " + "[xDevice] = " + xDevice + ", " + "[xContainer] = " + xContainer + ", "
							+ "[connection] = " + connection + ", " + "[device] = " + device + ", " + "[ccMatch] = "
							+ ccMatch + ".");
				}
				XRouterToRouterRuleImpl.pattern_XRouterToRouterRule_24_6_createcorrespondence_greenBBFB(xDevice, device,
						ccMatch);
				//nothing XDeviceToDevice xDeviceToDevice = (XDeviceToDevice) result6_green[2];

				Object[] result7_black = XRouterToRouterRuleImpl
						.pattern_XRouterToRouterRule_24_7_addtoreturnedresult_blackBB(result, ccMatch);
				if (result7_black == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[result] = " + result
							+ ", " + "[ccMatch] = " + ccMatch + ".");
				}
				XRouterToRouterRuleImpl.pattern_XRouterToRouterRule_24_7_addtoreturnedresult_greenBB(result, ccMatch);

			}

		} else {
		}
		return XRouterToRouterRuleImpl.pattern_XRouterToRouterRule_24_8_expressionFB(result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isApplicable_solveCsp_CC(Container container, XRouter xDevice, XContainer xContainer,
			Connections connection, Router device, Match sourceMatch, Match targetMatch) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();

		// Create literals

		// Create attribute variables
		Variable var_xDevice_maxSpeed = CSPFactoryHelper.eINSTANCE.createVariable("xDevice.maxSpeed", true, csp);
		var_xDevice_maxSpeed.setValue(xDevice.getMaxSpeed());
		var_xDevice_maxSpeed.setType("BigInteger");
		Variable var_device_maxSpeed = CSPFactoryHelper.eINSTANCE.createVariable("device.maxSpeed", true, csp);
		var_device_maxSpeed.setValue(device.getMaxSpeed());
		var_device_maxSpeed.setType("BigInteger");
		Variable var_xDevice_name = CSPFactoryHelper.eINSTANCE.createVariable("xDevice.name", true, csp);
		var_xDevice_name.setValue(xDevice.getName());
		var_xDevice_name.setType("String");
		Variable var_device_name = CSPFactoryHelper.eINSTANCE.createVariable("device.name", true, csp);
		var_device_name.setValue(device.getName());
		var_device_name.setType("String");

		// Create unbound variables

		// Create constraints
		Eq eq = new Eq();
		Eq eq_0 = new Eq();

		csp.getConstraints().add(eq);
		csp.getConstraints().add(eq_0);

		// Solve CSP
		eq.setRuleName("NoRuleName");
		eq.solve(var_xDevice_maxSpeed, var_device_maxSpeed);
		eq_0.setRuleName("NoRuleName");
		eq_0.solve(var_xDevice_name, var_device_name);
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
	public boolean checkDEC_FWD(XRouter xDevice, XContainer xContainer, Connections connection) {// 
		Object[] result1_black = XRouterToRouterRuleImpl
				.pattern_XRouterToRouterRule_27_1_matchtggpattern_blackBBB(xDevice, xContainer, connection);
		if (result1_black != null) {
			return XRouterToRouterRuleImpl.pattern_XRouterToRouterRule_27_2_expressionF();
		} else {
			return XRouterToRouterRuleImpl.pattern_XRouterToRouterRule_27_3_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean checkDEC_BWD(Container container, Router device) {// 
		Object[] result1_black = XRouterToRouterRuleImpl
				.pattern_XRouterToRouterRule_28_1_matchtggpattern_blackBB(container, device);
		if (result1_black != null) {
			return XRouterToRouterRuleImpl.pattern_XRouterToRouterRule_28_2_expressionF();
		} else {
			return XRouterToRouterRuleImpl.pattern_XRouterToRouterRule_28_3_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModelgeneratorRuleResult generateModel(RuleEntryContainer ruleEntryContainer,
			XContainerToContainer xContainerToContainerParameter) {

		Object[] result1_black = XRouterToRouterRuleImpl.pattern_XRouterToRouterRule_29_1_createresult_blackB(this);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		Object[] result1_green = XRouterToRouterRuleImpl.pattern_XRouterToRouterRule_29_1_createresult_greenFF();
		IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result1_green[0];
		ModelgeneratorRuleResult ruleResult = (ModelgeneratorRuleResult) result1_green[1];

		// ForEach 
		for (Object[] result2_black : XRouterToRouterRuleImpl
				.pattern_XRouterToRouterRule_29_2_isapplicablecore_blackFFFFBB(ruleEntryContainer, ruleResult)) {
			//nothing RuleEntryList xContainerToContainerList = (RuleEntryList) result2_black[0];
			Container container = (Container) result2_black[1];
			XContainerToContainer xContainerToContainer = (XContainerToContainer) result2_black[2];
			XContainer xContainer = (XContainer) result2_black[3];

			Object[] result3_bindingAndBlack = XRouterToRouterRuleImpl
					.pattern_XRouterToRouterRule_29_3_solveCSP_bindingAndBlackFBBBBBB(this, isApplicableMatch,
							container, xContainerToContainer, xContainer, ruleResult);
			if (result3_bindingAndBlack == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
						+ "[isApplicableMatch] = " + isApplicableMatch + ", " + "[container] = " + container + ", "
						+ "[xContainerToContainer] = " + xContainerToContainer + ", " + "[xContainer] = " + xContainer
						+ ", " + "[ruleResult] = " + ruleResult + ".");
			}
			CSP csp = (CSP) result3_bindingAndBlack[0];
			// 
			if (XRouterToRouterRuleImpl.pattern_XRouterToRouterRule_29_4_checkCSP_expressionFBB(this, csp)) {
				// 
				Object[] result5_black = XRouterToRouterRuleImpl.pattern_XRouterToRouterRule_29_5_checknacs_blackBBB(
						container, xContainerToContainer, xContainer);
				if (result5_black != null) {

					Object[] result6_black = XRouterToRouterRuleImpl.pattern_XRouterToRouterRule_29_6_perform_blackBBBB(
							container, xContainerToContainer, xContainer, ruleResult);
					if (result6_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[container] = "
								+ container + ", " + "[xContainerToContainer] = " + xContainerToContainer + ", "
								+ "[xContainer] = " + xContainer + ", " + "[ruleResult] = " + ruleResult + ".");
					}
					XRouterToRouterRuleImpl.pattern_XRouterToRouterRule_29_6_perform_greenBFBFFFBB(container,
							xContainer, ruleResult, csp);
					//nothing XRouter xDevice = (XRouter) result6_green[1];
					//nothing Connections connection = (Connections) result6_green[3];
					//nothing Router device = (Router) result6_green[4];
					//nothing XDeviceToDevice xDeviceToDevice = (XDeviceToDevice) result6_green[5];

				} else {
				}

			} else {
			}

		}
		return XRouterToRouterRuleImpl.pattern_XRouterToRouterRule_29_7_expressionFB(ruleResult);
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
		Variable var_xDevice_maxSpeed = CSPFactoryHelper.eINSTANCE.createVariable("xDevice.maxSpeed", csp);
		var_xDevice_maxSpeed.setType("BigInteger");
		Variable var_device_maxSpeed = CSPFactoryHelper.eINSTANCE.createVariable("device.maxSpeed", csp);
		var_device_maxSpeed.setType("BigInteger");
		Variable var_xDevice_name = CSPFactoryHelper.eINSTANCE.createVariable("xDevice.name", csp);
		var_xDevice_name.setType("String");
		Variable var_device_name = CSPFactoryHelper.eINSTANCE.createVariable("device.name", csp);
		var_device_name.setType("String");

		// Create constraints
		Eq eq = new Eq();
		Eq eq_0 = new Eq();

		csp.getConstraints().add(eq);
		csp.getConstraints().add(eq_0);

		// Solve CSP
		eq.setRuleName("NoRuleName");
		eq.solve(var_xDevice_maxSpeed, var_device_maxSpeed);
		eq_0.setRuleName("NoRuleName");
		eq_0.solve(var_xDevice_name, var_device_name);

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
		case RulesPackage.XROUTER_TO_ROUTER_RULE___IS_APPROPRIATE_FWD__MATCH_XROUTER_XCONTAINER_CONNECTIONS:
			return isAppropriate_FWD((Match) arguments.get(0), (XRouter) arguments.get(1),
					(XContainer) arguments.get(2), (Connections) arguments.get(3));
		case RulesPackage.XROUTER_TO_ROUTER_RULE___PERFORM_FWD__ISAPPLICABLEMATCH:
			return perform_FWD((IsApplicableMatch) arguments.get(0));
		case RulesPackage.XROUTER_TO_ROUTER_RULE___IS_APPLICABLE_FWD__MATCH:
			return isApplicable_FWD((Match) arguments.get(0));
		case RulesPackage.XROUTER_TO_ROUTER_RULE___REGISTER_OBJECTS_TO_MATCH_FWD__MATCH_XROUTER_XCONTAINER_CONNECTIONS:
			registerObjectsToMatch_FWD((Match) arguments.get(0), (XRouter) arguments.get(1),
					(XContainer) arguments.get(2), (Connections) arguments.get(3));
			return null;
		case RulesPackage.XROUTER_TO_ROUTER_RULE___IS_APPROPRIATE_SOLVE_CSP_FWD__MATCH_XROUTER_XCONTAINER_CONNECTIONS:
			return isAppropriate_solveCsp_FWD((Match) arguments.get(0), (XRouter) arguments.get(1),
					(XContainer) arguments.get(2), (Connections) arguments.get(3));
		case RulesPackage.XROUTER_TO_ROUTER_RULE___IS_APPROPRIATE_CHECK_CSP_FWD__CSP:
			return isAppropriate_checkCsp_FWD((CSP) arguments.get(0));
		case RulesPackage.XROUTER_TO_ROUTER_RULE___IS_APPLICABLE_SOLVE_CSP_FWD__ISAPPLICABLEMATCH_CONTAINER_XCONTAINERTOCONTAINER_XROUTER_XCONTAINER_CONNECTIONS:
			return isApplicable_solveCsp_FWD((IsApplicableMatch) arguments.get(0), (Container) arguments.get(1),
					(XContainerToContainer) arguments.get(2), (XRouter) arguments.get(3), (XContainer) arguments.get(4),
					(Connections) arguments.get(5));
		case RulesPackage.XROUTER_TO_ROUTER_RULE___IS_APPLICABLE_CHECK_CSP_FWD__CSP:
			return isApplicable_checkCsp_FWD((CSP) arguments.get(0));
		case RulesPackage.XROUTER_TO_ROUTER_RULE___REGISTER_OBJECTS_FWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT:
			registerObjects_FWD((PerformRuleResult) arguments.get(0), (EObject) arguments.get(1),
					(EObject) arguments.get(2), (EObject) arguments.get(3), (EObject) arguments.get(4),
					(EObject) arguments.get(5), (EObject) arguments.get(6), (EObject) arguments.get(7));
			return null;
		case RulesPackage.XROUTER_TO_ROUTER_RULE___CHECK_TYPES_FWD__MATCH:
			return checkTypes_FWD((Match) arguments.get(0));
		case RulesPackage.XROUTER_TO_ROUTER_RULE___IS_APPROPRIATE_BWD__MATCH_CONTAINER_ROUTER:
			return isAppropriate_BWD((Match) arguments.get(0), (Container) arguments.get(1), (Router) arguments.get(2));
		case RulesPackage.XROUTER_TO_ROUTER_RULE___PERFORM_BWD__ISAPPLICABLEMATCH:
			return perform_BWD((IsApplicableMatch) arguments.get(0));
		case RulesPackage.XROUTER_TO_ROUTER_RULE___IS_APPLICABLE_BWD__MATCH:
			return isApplicable_BWD((Match) arguments.get(0));
		case RulesPackage.XROUTER_TO_ROUTER_RULE___REGISTER_OBJECTS_TO_MATCH_BWD__MATCH_CONTAINER_ROUTER:
			registerObjectsToMatch_BWD((Match) arguments.get(0), (Container) arguments.get(1),
					(Router) arguments.get(2));
			return null;
		case RulesPackage.XROUTER_TO_ROUTER_RULE___IS_APPROPRIATE_SOLVE_CSP_BWD__MATCH_CONTAINER_ROUTER:
			return isAppropriate_solveCsp_BWD((Match) arguments.get(0), (Container) arguments.get(1),
					(Router) arguments.get(2));
		case RulesPackage.XROUTER_TO_ROUTER_RULE___IS_APPROPRIATE_CHECK_CSP_BWD__CSP:
			return isAppropriate_checkCsp_BWD((CSP) arguments.get(0));
		case RulesPackage.XROUTER_TO_ROUTER_RULE___IS_APPLICABLE_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_CONTAINER_XCONTAINERTOCONTAINER_XCONTAINER_ROUTER:
			return isApplicable_solveCsp_BWD((IsApplicableMatch) arguments.get(0), (Container) arguments.get(1),
					(XContainerToContainer) arguments.get(2), (XContainer) arguments.get(3), (Router) arguments.get(4));
		case RulesPackage.XROUTER_TO_ROUTER_RULE___IS_APPLICABLE_CHECK_CSP_BWD__CSP:
			return isApplicable_checkCsp_BWD((CSP) arguments.get(0));
		case RulesPackage.XROUTER_TO_ROUTER_RULE___REGISTER_OBJECTS_BWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT:
			registerObjects_BWD((PerformRuleResult) arguments.get(0), (EObject) arguments.get(1),
					(EObject) arguments.get(2), (EObject) arguments.get(3), (EObject) arguments.get(4),
					(EObject) arguments.get(5), (EObject) arguments.get(6), (EObject) arguments.get(7));
			return null;
		case RulesPackage.XROUTER_TO_ROUTER_RULE___CHECK_TYPES_BWD__MATCH:
			return checkTypes_BWD((Match) arguments.get(0));
		case RulesPackage.XROUTER_TO_ROUTER_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_12__EMOFLONEDGE:
			return isAppropriate_BWD_EMoflonEdge_12((EMoflonEdge) arguments.get(0));
		case RulesPackage.XROUTER_TO_ROUTER_RULE___IS_APPROPRIATE_FWD_EMOFLON_EDGE_8__EMOFLONEDGE:
			return isAppropriate_FWD_EMoflonEdge_8((EMoflonEdge) arguments.get(0));
		case RulesPackage.XROUTER_TO_ROUTER_RULE___CHECK_ATTRIBUTES_FWD__TRIPLEMATCH:
			return checkAttributes_FWD((TripleMatch) arguments.get(0));
		case RulesPackage.XROUTER_TO_ROUTER_RULE___CHECK_ATTRIBUTES_BWD__TRIPLEMATCH:
			return checkAttributes_BWD((TripleMatch) arguments.get(0));
		case RulesPackage.XROUTER_TO_ROUTER_RULE___IS_APPLICABLE_CC__MATCH_MATCH:
			return isApplicable_CC((Match) arguments.get(0), (Match) arguments.get(1));
		case RulesPackage.XROUTER_TO_ROUTER_RULE___IS_APPLICABLE_SOLVE_CSP_CC__CONTAINER_XROUTER_XCONTAINER_CONNECTIONS_ROUTER_MATCH_MATCH:
			return isApplicable_solveCsp_CC((Container) arguments.get(0), (XRouter) arguments.get(1),
					(XContainer) arguments.get(2), (Connections) arguments.get(3), (Router) arguments.get(4),
					(Match) arguments.get(5), (Match) arguments.get(6));
		case RulesPackage.XROUTER_TO_ROUTER_RULE___IS_APPLICABLE_CHECK_CSP_CC__CSP:
			return isApplicable_checkCsp_CC((CSP) arguments.get(0));
		case RulesPackage.XROUTER_TO_ROUTER_RULE___CHECK_DEC_FWD__XROUTER_XCONTAINER_CONNECTIONS:
			return checkDEC_FWD((XRouter) arguments.get(0), (XContainer) arguments.get(1),
					(Connections) arguments.get(2));
		case RulesPackage.XROUTER_TO_ROUTER_RULE___CHECK_DEC_BWD__CONTAINER_ROUTER:
			return checkDEC_BWD((Container) arguments.get(0), (Router) arguments.get(1));
		case RulesPackage.XROUTER_TO_ROUTER_RULE___GENERATE_MODEL__RULEENTRYCONTAINER_XCONTAINERTOCONTAINER:
			return generateModel((RuleEntryContainer) arguments.get(0), (XContainerToContainer) arguments.get(1));
		case RulesPackage.XROUTER_TO_ROUTER_RULE___GENERATE_MODEL_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_CONTAINER_XCONTAINERTOCONTAINER_XCONTAINER_MODELGENERATORRULERESULT:
			return generateModel_solveCsp_BWD((IsApplicableMatch) arguments.get(0), (Container) arguments.get(1),
					(XContainerToContainer) arguments.get(2), (XContainer) arguments.get(3),
					(ModelgeneratorRuleResult) arguments.get(4));
		case RulesPackage.XROUTER_TO_ROUTER_RULE___GENERATE_MODEL_CHECK_CSP_BWD__CSP:
			return generateModel_checkCsp_BWD((CSP) arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
	}

	public static final Object[] pattern_XRouterToRouterRule_0_1_initialbindings_blackBBBBB(XRouterToRouterRule _this,
			Match match, XRouter xDevice, XContainer xContainer, Connections connection) {
		return new Object[] { _this, match, xDevice, xContainer, connection };
	}

	public static final Object[] pattern_XRouterToRouterRule_0_2_SolveCSP_bindingFBBBBB(XRouterToRouterRule _this,
			Match match, XRouter xDevice, XContainer xContainer, Connections connection) {
		CSP _localVariable_0 = _this.isAppropriate_solveCsp_FWD(match, xDevice, xContainer, connection);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, match, xDevice, xContainer, connection };
		}
		return null;
	}

	public static final Object[] pattern_XRouterToRouterRule_0_2_SolveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_XRouterToRouterRule_0_2_SolveCSP_bindingAndBlackFBBBBB(
			XRouterToRouterRule _this, Match match, XRouter xDevice, XContainer xContainer, Connections connection) {
		Object[] result_pattern_XRouterToRouterRule_0_2_SolveCSP_binding = pattern_XRouterToRouterRule_0_2_SolveCSP_bindingFBBBBB(
				_this, match, xDevice, xContainer, connection);
		if (result_pattern_XRouterToRouterRule_0_2_SolveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_XRouterToRouterRule_0_2_SolveCSP_binding[0];

			Object[] result_pattern_XRouterToRouterRule_0_2_SolveCSP_black = pattern_XRouterToRouterRule_0_2_SolveCSP_blackB(
					csp);
			if (result_pattern_XRouterToRouterRule_0_2_SolveCSP_black != null) {

				return new Object[] { csp, _this, match, xDevice, xContainer, connection };
			}
		}
		return null;
	}

	public static final boolean pattern_XRouterToRouterRule_0_3_CheckCSP_expressionFBB(XRouterToRouterRule _this,
			CSP csp) {
		boolean _localVariable_0 = _this.isAppropriate_checkCsp_FWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_XRouterToRouterRule_0_4_collectelementstobetranslated_blackBBBB(Match match,
			XRouter xDevice, XContainer xContainer, Connections connection) {
		return new Object[] { match, xDevice, xContainer, connection };
	}

	public static final Object[] pattern_XRouterToRouterRule_0_4_collectelementstobetranslated_greenBBBBFF(Match match,
			XRouter xDevice, XContainer xContainer, Connections connection) {
		EMoflonEdge xContainer__xDevice____elements = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge xDevice__connection____connections = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		match.getToBeTranslatedNodes().add(xDevice);
		match.getToBeTranslatedNodes().add(connection);
		String xContainer__xDevice____elements_name_prime = "elements";
		String xDevice__connection____connections_name_prime = "connections";
		xContainer__xDevice____elements.setSrc(xContainer);
		xContainer__xDevice____elements.setTrg(xDevice);
		match.getToBeTranslatedEdges().add(xContainer__xDevice____elements);
		xDevice__connection____connections.setSrc(xDevice);
		xDevice__connection____connections.setTrg(connection);
		match.getToBeTranslatedEdges().add(xDevice__connection____connections);
		xContainer__xDevice____elements.setName(xContainer__xDevice____elements_name_prime);
		xDevice__connection____connections.setName(xDevice__connection____connections_name_prime);
		return new Object[] { match, xDevice, xContainer, connection, xContainer__xDevice____elements,
				xDevice__connection____connections };
	}

	public static final Object[] pattern_XRouterToRouterRule_0_5_collectcontextelements_blackBBBB(Match match,
			XRouter xDevice, XContainer xContainer, Connections connection) {
		return new Object[] { match, xDevice, xContainer, connection };
	}

	public static final Object[] pattern_XRouterToRouterRule_0_5_collectcontextelements_greenBB(Match match,
			XContainer xContainer) {
		match.getContextNodes().add(xContainer);
		return new Object[] { match, xContainer };
	}

	public static final void pattern_XRouterToRouterRule_0_6_registerobjectstomatch_expressionBBBBB(
			XRouterToRouterRule _this, Match match, XRouter xDevice, XContainer xContainer, Connections connection) {
		_this.registerObjectsToMatch_FWD(match, xDevice, xContainer, connection);

	}

	public static final boolean pattern_XRouterToRouterRule_0_7_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_XRouterToRouterRule_0_8_expressionF() {
		boolean _result = Boolean.valueOf(false);
		return _result;
	}

	public static final Object[] pattern_XRouterToRouterRule_1_1_performtransformation_bindingFFFFFB(
			IsApplicableMatch isApplicableMatch) {
		EObject _localVariable_0 = isApplicableMatch.getObject("container");
		EObject _localVariable_1 = isApplicableMatch.getObject("xContainerToContainer");
		EObject _localVariable_2 = isApplicableMatch.getObject("xDevice");
		EObject _localVariable_3 = isApplicableMatch.getObject("xContainer");
		EObject _localVariable_4 = isApplicableMatch.getObject("connection");
		EObject tmpContainer = _localVariable_0;
		EObject tmpXContainerToContainer = _localVariable_1;
		EObject tmpXDevice = _localVariable_2;
		EObject tmpXContainer = _localVariable_3;
		EObject tmpConnection = _localVariable_4;
		if (tmpContainer instanceof Container) {
			Container container = (Container) tmpContainer;
			if (tmpXContainerToContainer instanceof XContainerToContainer) {
				XContainerToContainer xContainerToContainer = (XContainerToContainer) tmpXContainerToContainer;
				if (tmpXDevice instanceof XRouter) {
					XRouter xDevice = (XRouter) tmpXDevice;
					if (tmpXContainer instanceof XContainer) {
						XContainer xContainer = (XContainer) tmpXContainer;
						if (tmpConnection instanceof Connections) {
							Connections connection = (Connections) tmpConnection;
							return new Object[] { container, xContainerToContainer, xDevice, xContainer, connection,
									isApplicableMatch };
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_XRouterToRouterRule_1_1_performtransformation_blackBBBBBFBB(
			Container container, XContainerToContainer xContainerToContainer, XRouter xDevice, XContainer xContainer,
			Connections connection, XRouterToRouterRule _this, IsApplicableMatch isApplicableMatch) {
		for (EObject tmpCsp : isApplicableMatch.getAttributeInfo()) {
			if (tmpCsp instanceof CSP) {
				CSP csp = (CSP) tmpCsp;
				return new Object[] { container, xContainerToContainer, xDevice, xContainer, connection, csp, _this,
						isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_XRouterToRouterRule_1_1_performtransformation_bindingAndBlackFFFFFFBB(
			XRouterToRouterRule _this, IsApplicableMatch isApplicableMatch) {
		Object[] result_pattern_XRouterToRouterRule_1_1_performtransformation_binding = pattern_XRouterToRouterRule_1_1_performtransformation_bindingFFFFFB(
				isApplicableMatch);
		if (result_pattern_XRouterToRouterRule_1_1_performtransformation_binding != null) {
			Container container = (Container) result_pattern_XRouterToRouterRule_1_1_performtransformation_binding[0];
			XContainerToContainer xContainerToContainer = (XContainerToContainer) result_pattern_XRouterToRouterRule_1_1_performtransformation_binding[1];
			XRouter xDevice = (XRouter) result_pattern_XRouterToRouterRule_1_1_performtransformation_binding[2];
			XContainer xContainer = (XContainer) result_pattern_XRouterToRouterRule_1_1_performtransformation_binding[3];
			Connections connection = (Connections) result_pattern_XRouterToRouterRule_1_1_performtransformation_binding[4];

			Object[] result_pattern_XRouterToRouterRule_1_1_performtransformation_black = pattern_XRouterToRouterRule_1_1_performtransformation_blackBBBBBFBB(
					container, xContainerToContainer, xDevice, xContainer, connection, _this, isApplicableMatch);
			if (result_pattern_XRouterToRouterRule_1_1_performtransformation_black != null) {
				CSP csp = (CSP) result_pattern_XRouterToRouterRule_1_1_performtransformation_black[5];

				return new Object[] { container, xContainerToContainer, xDevice, xContainer, connection, csp, _this,
						isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_XRouterToRouterRule_1_1_performtransformation_greenBBFFB(Container container,
			XRouter xDevice, CSP csp) {
		Router device = ImplementationFactory.eINSTANCE.createRouter();
		XDeviceToDevice xDeviceToDevice = ImplementationTransformatorFactory.eINSTANCE.createXDeviceToDevice();
		Object _localVariable_0 = csp.getValue("device", "maxSpeed");
		Object _localVariable_1 = csp.getValue("device", "name");
		container.getDevices().add(device);
		xDeviceToDevice.setSource(xDevice);
		xDeviceToDevice.setTarget(device);
		BigInteger device_maxSpeed_prime = (BigInteger) _localVariable_0;
		String device_name_prime = (String) _localVariable_1;
		device.setMaxSpeed(device_maxSpeed_prime);
		device.setName(device_name_prime);
		return new Object[] { container, xDevice, device, xDeviceToDevice, csp };
	}

	public static final Object[] pattern_XRouterToRouterRule_1_2_collecttranslatedelements_blackBBBB(XRouter xDevice,
			Connections connection, Router device, XDeviceToDevice xDeviceToDevice) {
		return new Object[] { xDevice, connection, device, xDeviceToDevice };
	}

	public static final Object[] pattern_XRouterToRouterRule_1_2_collecttranslatedelements_greenFBBBB(XRouter xDevice,
			Connections connection, Router device, XDeviceToDevice xDeviceToDevice) {
		PerformRuleResult ruleresult = RuntimeFactory.eINSTANCE.createPerformRuleResult();
		ruleresult.getTranslatedElements().add(xDevice);
		ruleresult.getTranslatedElements().add(connection);
		ruleresult.getCreatedElements().add(device);
		ruleresult.getCreatedLinkElements().add(xDeviceToDevice);
		return new Object[] { ruleresult, xDevice, connection, device, xDeviceToDevice };
	}

	public static final Object[] pattern_XRouterToRouterRule_1_3_bookkeepingforedges_blackBBBBBBBB(
			PerformRuleResult ruleresult, EObject container, EObject xContainerToContainer, EObject xDevice,
			EObject xContainer, EObject connection, EObject device, EObject xDeviceToDevice) {
		if (!container.equals(xContainerToContainer)) {
			if (!container.equals(xDevice)) {
				if (!container.equals(xContainer)) {
					if (!container.equals(device)) {
						if (!container.equals(xDeviceToDevice)) {
							if (!xContainerToContainer.equals(xDevice)) {
								if (!xContainerToContainer.equals(xDeviceToDevice)) {
									if (!xDevice.equals(xDeviceToDevice)) {
										if (!xContainer.equals(xContainerToContainer)) {
											if (!xContainer.equals(xDevice)) {
												if (!xContainer.equals(xDeviceToDevice)) {
													if (!connection.equals(container)) {
														if (!connection.equals(xContainerToContainer)) {
															if (!connection.equals(xDevice)) {
																if (!connection.equals(xContainer)) {
																	if (!connection.equals(device)) {
																		if (!connection.equals(xDeviceToDevice)) {
																			if (!device.equals(xContainerToContainer)) {
																				if (!device.equals(xDevice)) {
																					if (!device.equals(xContainer)) {
																						if (!device.equals(
																								xDeviceToDevice)) {
																							return new Object[] {
																									ruleresult,
																									container,
																									xContainerToContainer,
																									xDevice, xContainer,
																									connection, device,
																									xDeviceToDevice };
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

	public static final Object[] pattern_XRouterToRouterRule_1_3_bookkeepingforedges_greenBBBBBBBFFFFF(
			PerformRuleResult ruleresult, EObject container, EObject xDevice, EObject xContainer, EObject connection,
			EObject device, EObject xDeviceToDevice) {
		EMoflonEdge container__device____devices = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge xDeviceToDevice__xDevice____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge xDeviceToDevice__device____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge xContainer__xDevice____elements = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge xDevice__connection____connections = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String ruleresult_ruleName_prime = "XRouterToRouterRule";
		String container__device____devices_name_prime = "devices";
		String xDeviceToDevice__xDevice____source_name_prime = "source";
		String xDeviceToDevice__device____target_name_prime = "target";
		String xContainer__xDevice____elements_name_prime = "elements";
		String xDevice__connection____connections_name_prime = "connections";
		container__device____devices.setSrc(container);
		container__device____devices.setTrg(device);
		ruleresult.getCreatedEdges().add(container__device____devices);
		xDeviceToDevice__xDevice____source.setSrc(xDeviceToDevice);
		xDeviceToDevice__xDevice____source.setTrg(xDevice);
		ruleresult.getCreatedEdges().add(xDeviceToDevice__xDevice____source);
		xDeviceToDevice__device____target.setSrc(xDeviceToDevice);
		xDeviceToDevice__device____target.setTrg(device);
		ruleresult.getCreatedEdges().add(xDeviceToDevice__device____target);
		xContainer__xDevice____elements.setSrc(xContainer);
		xContainer__xDevice____elements.setTrg(xDevice);
		ruleresult.getTranslatedEdges().add(xContainer__xDevice____elements);
		xDevice__connection____connections.setSrc(xDevice);
		xDevice__connection____connections.setTrg(connection);
		ruleresult.getTranslatedEdges().add(xDevice__connection____connections);
		ruleresult.setRuleName(ruleresult_ruleName_prime);
		container__device____devices.setName(container__device____devices_name_prime);
		xDeviceToDevice__xDevice____source.setName(xDeviceToDevice__xDevice____source_name_prime);
		xDeviceToDevice__device____target.setName(xDeviceToDevice__device____target_name_prime);
		xContainer__xDevice____elements.setName(xContainer__xDevice____elements_name_prime);
		xDevice__connection____connections.setName(xDevice__connection____connections_name_prime);
		return new Object[] { ruleresult, container, xDevice, xContainer, connection, device, xDeviceToDevice,
				container__device____devices, xDeviceToDevice__xDevice____source, xDeviceToDevice__device____target,
				xContainer__xDevice____elements, xDevice__connection____connections };
	}

	public static final void pattern_XRouterToRouterRule_1_5_registerobjects_expressionBBBBBBBBB(
			XRouterToRouterRule _this, PerformRuleResult ruleresult, EObject container, EObject xContainerToContainer,
			EObject xDevice, EObject xContainer, EObject connection, EObject device, EObject xDeviceToDevice) {
		_this.registerObjects_FWD(ruleresult, container, xContainerToContainer, xDevice, xContainer, connection, device,
				xDeviceToDevice);

	}

	public static final PerformRuleResult pattern_XRouterToRouterRule_1_6_expressionFB(PerformRuleResult ruleresult) {
		PerformRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_XRouterToRouterRule_2_1_preparereturnvalue_bindingFB(
			XRouterToRouterRule _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass eClass = _localVariable_0;
		if (eClass != null) {
			return new Object[] { eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_XRouterToRouterRule_2_1_preparereturnvalue_blackFBB(EClass eClass,
			XRouterToRouterRule _this) {
		for (EOperation performOperation : eClass.getEOperations()) {
			String performOperation_name = performOperation.getName();
			if (performOperation_name.equals("perform_FWD")) {
				return new Object[] { performOperation, eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_XRouterToRouterRule_2_1_preparereturnvalue_bindingAndBlackFFB(
			XRouterToRouterRule _this) {
		Object[] result_pattern_XRouterToRouterRule_2_1_preparereturnvalue_binding = pattern_XRouterToRouterRule_2_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_XRouterToRouterRule_2_1_preparereturnvalue_binding != null) {
			EClass eClass = (EClass) result_pattern_XRouterToRouterRule_2_1_preparereturnvalue_binding[0];

			Object[] result_pattern_XRouterToRouterRule_2_1_preparereturnvalue_black = pattern_XRouterToRouterRule_2_1_preparereturnvalue_blackFBB(
					eClass, _this);
			if (result_pattern_XRouterToRouterRule_2_1_preparereturnvalue_black != null) {
				EOperation performOperation = (EOperation) result_pattern_XRouterToRouterRule_2_1_preparereturnvalue_black[0];

				return new Object[] { performOperation, eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_XRouterToRouterRule_2_1_preparereturnvalue_greenBF(
			EOperation performOperation) {
		IsApplicableRuleResult ruleresult = RuntimeFactory.eINSTANCE.createIsApplicableRuleResult();
		boolean ruleresult_success_prime = Boolean.valueOf(false);
		String ruleresult_rule_prime = "XRouterToRouterRule";
		ruleresult.setPerformOperation(performOperation);
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		ruleresult.setRule(ruleresult_rule_prime);
		return new Object[] { performOperation, ruleresult };
	}

	public static final Object[] pattern_XRouterToRouterRule_2_2_corematch_bindingFFFB(Match match) {
		EObject _localVariable_0 = match.getObject("xDevice");
		EObject _localVariable_1 = match.getObject("xContainer");
		EObject _localVariable_2 = match.getObject("connection");
		EObject tmpXDevice = _localVariable_0;
		EObject tmpXContainer = _localVariable_1;
		EObject tmpConnection = _localVariable_2;
		if (tmpXDevice instanceof XRouter) {
			XRouter xDevice = (XRouter) tmpXDevice;
			if (tmpXContainer instanceof XContainer) {
				XContainer xContainer = (XContainer) tmpXContainer;
				if (tmpConnection instanceof Connections) {
					Connections connection = (Connections) tmpConnection;
					return new Object[] { xDevice, xContainer, connection, match };
				}
			}
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_XRouterToRouterRule_2_2_corematch_blackFFBBBB(XRouter xDevice,
			XContainer xContainer, Connections connection, Match match) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		for (XContainerToContainer xContainerToContainer : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(xContainer, XContainerToContainer.class, "source")) {
			Container container = xContainerToContainer.getTarget();
			if (container != null) {
				_result.add(new Object[] { container, xContainerToContainer, xDevice, xContainer, connection, match });
			}

		}
		return _result;
	}

	public static final Iterable<Object[]> pattern_XRouterToRouterRule_2_3_findcontext_blackBBBBB(Container container,
			XContainerToContainer xContainerToContainer, XRouter xDevice, XContainer xContainer,
			Connections connection) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (xContainer.equals(xContainerToContainer.getSource())) {
			if (container.equals(xContainerToContainer.getTarget())) {
				if (xContainer.getElements().contains(xDevice)) {
					if (connection.equals(xDevice.getConnections())) {
						_result.add(new Object[] { container, xContainerToContainer, xDevice, xContainer, connection });
					}
				}
			}
		}
		return _result;
	}

	public static final Object[] pattern_XRouterToRouterRule_2_3_findcontext_greenBBBBBFFFFF(Container container,
			XContainerToContainer xContainerToContainer, XRouter xDevice, XContainer xContainer,
			Connections connection) {
		IsApplicableMatch isApplicableMatch = RuntimeFactory.eINSTANCE.createIsApplicableMatch();
		EMoflonEdge xContainerToContainer__xContainer____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge xContainerToContainer__container____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge xContainer__xDevice____elements = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge xDevice__connection____connections = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String xContainerToContainer__xContainer____source_name_prime = "source";
		String xContainerToContainer__container____target_name_prime = "target";
		String xContainer__xDevice____elements_name_prime = "elements";
		String xDevice__connection____connections_name_prime = "connections";
		isApplicableMatch.getAllContextElements().add(container);
		isApplicableMatch.getAllContextElements().add(xContainerToContainer);
		isApplicableMatch.getAllContextElements().add(xDevice);
		isApplicableMatch.getAllContextElements().add(xContainer);
		isApplicableMatch.getAllContextElements().add(connection);
		xContainerToContainer__xContainer____source.setSrc(xContainerToContainer);
		xContainerToContainer__xContainer____source.setTrg(xContainer);
		isApplicableMatch.getAllContextElements().add(xContainerToContainer__xContainer____source);
		xContainerToContainer__container____target.setSrc(xContainerToContainer);
		xContainerToContainer__container____target.setTrg(container);
		isApplicableMatch.getAllContextElements().add(xContainerToContainer__container____target);
		xContainer__xDevice____elements.setSrc(xContainer);
		xContainer__xDevice____elements.setTrg(xDevice);
		isApplicableMatch.getAllContextElements().add(xContainer__xDevice____elements);
		xDevice__connection____connections.setSrc(xDevice);
		xDevice__connection____connections.setTrg(connection);
		isApplicableMatch.getAllContextElements().add(xDevice__connection____connections);
		xContainerToContainer__xContainer____source.setName(xContainerToContainer__xContainer____source_name_prime);
		xContainerToContainer__container____target.setName(xContainerToContainer__container____target_name_prime);
		xContainer__xDevice____elements.setName(xContainer__xDevice____elements_name_prime);
		xDevice__connection____connections.setName(xDevice__connection____connections_name_prime);
		return new Object[] { container, xContainerToContainer, xDevice, xContainer, connection, isApplicableMatch,
				xContainerToContainer__xContainer____source, xContainerToContainer__container____target,
				xContainer__xDevice____elements, xDevice__connection____connections };
	}

	public static final Object[] pattern_XRouterToRouterRule_2_4_solveCSP_bindingFBBBBBBB(XRouterToRouterRule _this,
			IsApplicableMatch isApplicableMatch, Container container, XContainerToContainer xContainerToContainer,
			XRouter xDevice, XContainer xContainer, Connections connection) {
		CSP _localVariable_0 = _this.isApplicable_solveCsp_FWD(isApplicableMatch, container, xContainerToContainer,
				xDevice, xContainer, connection);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, container, xContainerToContainer, xDevice, xContainer,
					connection };
		}
		return null;
	}

	public static final Object[] pattern_XRouterToRouterRule_2_4_solveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_XRouterToRouterRule_2_4_solveCSP_bindingAndBlackFBBBBBBB(
			XRouterToRouterRule _this, IsApplicableMatch isApplicableMatch, Container container,
			XContainerToContainer xContainerToContainer, XRouter xDevice, XContainer xContainer,
			Connections connection) {
		Object[] result_pattern_XRouterToRouterRule_2_4_solveCSP_binding = pattern_XRouterToRouterRule_2_4_solveCSP_bindingFBBBBBBB(
				_this, isApplicableMatch, container, xContainerToContainer, xDevice, xContainer, connection);
		if (result_pattern_XRouterToRouterRule_2_4_solveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_XRouterToRouterRule_2_4_solveCSP_binding[0];

			Object[] result_pattern_XRouterToRouterRule_2_4_solveCSP_black = pattern_XRouterToRouterRule_2_4_solveCSP_blackB(
					csp);
			if (result_pattern_XRouterToRouterRule_2_4_solveCSP_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, container, xContainerToContainer, xDevice,
						xContainer, connection };
			}
		}
		return null;
	}

	public static final boolean pattern_XRouterToRouterRule_2_5_checkCSP_expressionFBB(XRouterToRouterRule _this,
			CSP csp) {
		boolean _localVariable_0 = _this.isApplicable_checkCsp_FWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_XRouterToRouterRule_2_6_addmatchtoruleresult_blackBB(
			IsApplicableRuleResult ruleresult, IsApplicableMatch isApplicableMatch) {
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final Object[] pattern_XRouterToRouterRule_2_6_addmatchtoruleresult_greenBB(
			IsApplicableRuleResult ruleresult, IsApplicableMatch isApplicableMatch) {
		ruleresult.getIsApplicableMatch().add(isApplicableMatch);
		boolean ruleresult_success_prime = Boolean.valueOf(true);
		String isApplicableMatch_ruleName_prime = "XRouterToRouterRule";
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		isApplicableMatch.setRuleName(isApplicableMatch_ruleName_prime);
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final IsApplicableRuleResult pattern_XRouterToRouterRule_2_7_expressionFB(
			IsApplicableRuleResult ruleresult) {
		IsApplicableRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_XRouterToRouterRule_10_1_initialbindings_blackBBBB(XRouterToRouterRule _this,
			Match match, Container container, Router device) {
		return new Object[] { _this, match, container, device };
	}

	public static final Object[] pattern_XRouterToRouterRule_10_2_SolveCSP_bindingFBBBB(XRouterToRouterRule _this,
			Match match, Container container, Router device) {
		CSP _localVariable_0 = _this.isAppropriate_solveCsp_BWD(match, container, device);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, match, container, device };
		}
		return null;
	}

	public static final Object[] pattern_XRouterToRouterRule_10_2_SolveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_XRouterToRouterRule_10_2_SolveCSP_bindingAndBlackFBBBB(
			XRouterToRouterRule _this, Match match, Container container, Router device) {
		Object[] result_pattern_XRouterToRouterRule_10_2_SolveCSP_binding = pattern_XRouterToRouterRule_10_2_SolveCSP_bindingFBBBB(
				_this, match, container, device);
		if (result_pattern_XRouterToRouterRule_10_2_SolveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_XRouterToRouterRule_10_2_SolveCSP_binding[0];

			Object[] result_pattern_XRouterToRouterRule_10_2_SolveCSP_black = pattern_XRouterToRouterRule_10_2_SolveCSP_blackB(
					csp);
			if (result_pattern_XRouterToRouterRule_10_2_SolveCSP_black != null) {

				return new Object[] { csp, _this, match, container, device };
			}
		}
		return null;
	}

	public static final boolean pattern_XRouterToRouterRule_10_3_CheckCSP_expressionFBB(XRouterToRouterRule _this,
			CSP csp) {
		boolean _localVariable_0 = _this.isAppropriate_checkCsp_BWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_XRouterToRouterRule_10_4_collectelementstobetranslated_blackBBB(Match match,
			Container container, Router device) {
		return new Object[] { match, container, device };
	}

	public static final Object[] pattern_XRouterToRouterRule_10_4_collectelementstobetranslated_greenBBBF(Match match,
			Container container, Router device) {
		EMoflonEdge container__device____devices = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		match.getToBeTranslatedNodes().add(device);
		String container__device____devices_name_prime = "devices";
		container__device____devices.setSrc(container);
		container__device____devices.setTrg(device);
		match.getToBeTranslatedEdges().add(container__device____devices);
		container__device____devices.setName(container__device____devices_name_prime);
		return new Object[] { match, container, device, container__device____devices };
	}

	public static final Object[] pattern_XRouterToRouterRule_10_5_collectcontextelements_blackBBB(Match match,
			Container container, Router device) {
		return new Object[] { match, container, device };
	}

	public static final Object[] pattern_XRouterToRouterRule_10_5_collectcontextelements_greenBB(Match match,
			Container container) {
		match.getContextNodes().add(container);
		return new Object[] { match, container };
	}

	public static final void pattern_XRouterToRouterRule_10_6_registerobjectstomatch_expressionBBBB(
			XRouterToRouterRule _this, Match match, Container container, Router device) {
		_this.registerObjectsToMatch_BWD(match, container, device);

	}

	public static final boolean pattern_XRouterToRouterRule_10_7_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_XRouterToRouterRule_10_8_expressionF() {
		boolean _result = Boolean.valueOf(false);
		return _result;
	}

	public static final Object[] pattern_XRouterToRouterRule_11_1_performtransformation_bindingFFFFB(
			IsApplicableMatch isApplicableMatch) {
		EObject _localVariable_0 = isApplicableMatch.getObject("container");
		EObject _localVariable_1 = isApplicableMatch.getObject("xContainerToContainer");
		EObject _localVariable_2 = isApplicableMatch.getObject("xContainer");
		EObject _localVariable_3 = isApplicableMatch.getObject("device");
		EObject tmpContainer = _localVariable_0;
		EObject tmpXContainerToContainer = _localVariable_1;
		EObject tmpXContainer = _localVariable_2;
		EObject tmpDevice = _localVariable_3;
		if (tmpContainer instanceof Container) {
			Container container = (Container) tmpContainer;
			if (tmpXContainerToContainer instanceof XContainerToContainer) {
				XContainerToContainer xContainerToContainer = (XContainerToContainer) tmpXContainerToContainer;
				if (tmpXContainer instanceof XContainer) {
					XContainer xContainer = (XContainer) tmpXContainer;
					if (tmpDevice instanceof Router) {
						Router device = (Router) tmpDevice;
						return new Object[] { container, xContainerToContainer, xContainer, device, isApplicableMatch };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_XRouterToRouterRule_11_1_performtransformation_blackBBBBFBB(
			Container container, XContainerToContainer xContainerToContainer, XContainer xContainer, Router device,
			XRouterToRouterRule _this, IsApplicableMatch isApplicableMatch) {
		for (EObject tmpCsp : isApplicableMatch.getAttributeInfo()) {
			if (tmpCsp instanceof CSP) {
				CSP csp = (CSP) tmpCsp;
				return new Object[] { container, xContainerToContainer, xContainer, device, csp, _this,
						isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_XRouterToRouterRule_11_1_performtransformation_bindingAndBlackFFFFFBB(
			XRouterToRouterRule _this, IsApplicableMatch isApplicableMatch) {
		Object[] result_pattern_XRouterToRouterRule_11_1_performtransformation_binding = pattern_XRouterToRouterRule_11_1_performtransformation_bindingFFFFB(
				isApplicableMatch);
		if (result_pattern_XRouterToRouterRule_11_1_performtransformation_binding != null) {
			Container container = (Container) result_pattern_XRouterToRouterRule_11_1_performtransformation_binding[0];
			XContainerToContainer xContainerToContainer = (XContainerToContainer) result_pattern_XRouterToRouterRule_11_1_performtransformation_binding[1];
			XContainer xContainer = (XContainer) result_pattern_XRouterToRouterRule_11_1_performtransformation_binding[2];
			Router device = (Router) result_pattern_XRouterToRouterRule_11_1_performtransformation_binding[3];

			Object[] result_pattern_XRouterToRouterRule_11_1_performtransformation_black = pattern_XRouterToRouterRule_11_1_performtransformation_blackBBBBFBB(
					container, xContainerToContainer, xContainer, device, _this, isApplicableMatch);
			if (result_pattern_XRouterToRouterRule_11_1_performtransformation_black != null) {
				CSP csp = (CSP) result_pattern_XRouterToRouterRule_11_1_performtransformation_black[4];

				return new Object[] { container, xContainerToContainer, xContainer, device, csp, _this,
						isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_XRouterToRouterRule_11_1_performtransformation_greenFBFBFB(
			XContainer xContainer, Router device, CSP csp) {
		XRouter xDevice = XtextImplFactory.eINSTANCE.createXRouter();
		Connections connection = XtextImplFactory.eINSTANCE.createConnections();
		XDeviceToDevice xDeviceToDevice = ImplementationTransformatorFactory.eINSTANCE.createXDeviceToDevice();
		Object _localVariable_0 = csp.getValue("xDevice", "maxSpeed");
		Object _localVariable_1 = csp.getValue("xDevice", "name");
		xContainer.getElements().add(xDevice);
		xDevice.setConnections(connection);
		xDeviceToDevice.setSource(xDevice);
		xDeviceToDevice.setTarget(device);
		BigInteger xDevice_maxSpeed_prime = (BigInteger) _localVariable_0;
		String xDevice_name_prime = (String) _localVariable_1;
		xDevice.setMaxSpeed(xDevice_maxSpeed_prime);
		xDevice.setName(xDevice_name_prime);
		return new Object[] { xDevice, xContainer, connection, device, xDeviceToDevice, csp };
	}

	public static final Object[] pattern_XRouterToRouterRule_11_2_collecttranslatedelements_blackBBBB(XRouter xDevice,
			Connections connection, Router device, XDeviceToDevice xDeviceToDevice) {
		return new Object[] { xDevice, connection, device, xDeviceToDevice };
	}

	public static final Object[] pattern_XRouterToRouterRule_11_2_collecttranslatedelements_greenFBBBB(XRouter xDevice,
			Connections connection, Router device, XDeviceToDevice xDeviceToDevice) {
		PerformRuleResult ruleresult = RuntimeFactory.eINSTANCE.createPerformRuleResult();
		ruleresult.getCreatedElements().add(xDevice);
		ruleresult.getCreatedElements().add(connection);
		ruleresult.getTranslatedElements().add(device);
		ruleresult.getCreatedLinkElements().add(xDeviceToDevice);
		return new Object[] { ruleresult, xDevice, connection, device, xDeviceToDevice };
	}

	public static final Object[] pattern_XRouterToRouterRule_11_3_bookkeepingforedges_blackBBBBBBBB(
			PerformRuleResult ruleresult, EObject container, EObject xContainerToContainer, EObject xDevice,
			EObject xContainer, EObject connection, EObject device, EObject xDeviceToDevice) {
		if (!container.equals(xContainerToContainer)) {
			if (!container.equals(xDevice)) {
				if (!container.equals(xContainer)) {
					if (!container.equals(device)) {
						if (!container.equals(xDeviceToDevice)) {
							if (!xContainerToContainer.equals(xDevice)) {
								if (!xContainerToContainer.equals(xDeviceToDevice)) {
									if (!xDevice.equals(xDeviceToDevice)) {
										if (!xContainer.equals(xContainerToContainer)) {
											if (!xContainer.equals(xDevice)) {
												if (!xContainer.equals(xDeviceToDevice)) {
													if (!connection.equals(container)) {
														if (!connection.equals(xContainerToContainer)) {
															if (!connection.equals(xDevice)) {
																if (!connection.equals(xContainer)) {
																	if (!connection.equals(device)) {
																		if (!connection.equals(xDeviceToDevice)) {
																			if (!device.equals(xContainerToContainer)) {
																				if (!device.equals(xDevice)) {
																					if (!device.equals(xContainer)) {
																						if (!device.equals(
																								xDeviceToDevice)) {
																							return new Object[] {
																									ruleresult,
																									container,
																									xContainerToContainer,
																									xDevice, xContainer,
																									connection, device,
																									xDeviceToDevice };
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

	public static final Object[] pattern_XRouterToRouterRule_11_3_bookkeepingforedges_greenBBBBBBBFFFFF(
			PerformRuleResult ruleresult, EObject container, EObject xDevice, EObject xContainer, EObject connection,
			EObject device, EObject xDeviceToDevice) {
		EMoflonEdge container__device____devices = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge xDeviceToDevice__xDevice____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge xDeviceToDevice__device____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge xContainer__xDevice____elements = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge xDevice__connection____connections = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String ruleresult_ruleName_prime = "XRouterToRouterRule";
		String container__device____devices_name_prime = "devices";
		String xDeviceToDevice__xDevice____source_name_prime = "source";
		String xDeviceToDevice__device____target_name_prime = "target";
		String xContainer__xDevice____elements_name_prime = "elements";
		String xDevice__connection____connections_name_prime = "connections";
		container__device____devices.setSrc(container);
		container__device____devices.setTrg(device);
		ruleresult.getTranslatedEdges().add(container__device____devices);
		xDeviceToDevice__xDevice____source.setSrc(xDeviceToDevice);
		xDeviceToDevice__xDevice____source.setTrg(xDevice);
		ruleresult.getCreatedEdges().add(xDeviceToDevice__xDevice____source);
		xDeviceToDevice__device____target.setSrc(xDeviceToDevice);
		xDeviceToDevice__device____target.setTrg(device);
		ruleresult.getCreatedEdges().add(xDeviceToDevice__device____target);
		xContainer__xDevice____elements.setSrc(xContainer);
		xContainer__xDevice____elements.setTrg(xDevice);
		ruleresult.getCreatedEdges().add(xContainer__xDevice____elements);
		xDevice__connection____connections.setSrc(xDevice);
		xDevice__connection____connections.setTrg(connection);
		ruleresult.getCreatedEdges().add(xDevice__connection____connections);
		ruleresult.setRuleName(ruleresult_ruleName_prime);
		container__device____devices.setName(container__device____devices_name_prime);
		xDeviceToDevice__xDevice____source.setName(xDeviceToDevice__xDevice____source_name_prime);
		xDeviceToDevice__device____target.setName(xDeviceToDevice__device____target_name_prime);
		xContainer__xDevice____elements.setName(xContainer__xDevice____elements_name_prime);
		xDevice__connection____connections.setName(xDevice__connection____connections_name_prime);
		return new Object[] { ruleresult, container, xDevice, xContainer, connection, device, xDeviceToDevice,
				container__device____devices, xDeviceToDevice__xDevice____source, xDeviceToDevice__device____target,
				xContainer__xDevice____elements, xDevice__connection____connections };
	}

	public static final void pattern_XRouterToRouterRule_11_5_registerobjects_expressionBBBBBBBBB(
			XRouterToRouterRule _this, PerformRuleResult ruleresult, EObject container, EObject xContainerToContainer,
			EObject xDevice, EObject xContainer, EObject connection, EObject device, EObject xDeviceToDevice) {
		_this.registerObjects_BWD(ruleresult, container, xContainerToContainer, xDevice, xContainer, connection, device,
				xDeviceToDevice);

	}

	public static final PerformRuleResult pattern_XRouterToRouterRule_11_6_expressionFB(PerformRuleResult ruleresult) {
		PerformRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_XRouterToRouterRule_12_1_preparereturnvalue_bindingFB(
			XRouterToRouterRule _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass eClass = _localVariable_0;
		if (eClass != null) {
			return new Object[] { eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_XRouterToRouterRule_12_1_preparereturnvalue_blackFBB(EClass eClass,
			XRouterToRouterRule _this) {
		for (EOperation performOperation : eClass.getEOperations()) {
			String performOperation_name = performOperation.getName();
			if (performOperation_name.equals("perform_BWD")) {
				return new Object[] { performOperation, eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_XRouterToRouterRule_12_1_preparereturnvalue_bindingAndBlackFFB(
			XRouterToRouterRule _this) {
		Object[] result_pattern_XRouterToRouterRule_12_1_preparereturnvalue_binding = pattern_XRouterToRouterRule_12_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_XRouterToRouterRule_12_1_preparereturnvalue_binding != null) {
			EClass eClass = (EClass) result_pattern_XRouterToRouterRule_12_1_preparereturnvalue_binding[0];

			Object[] result_pattern_XRouterToRouterRule_12_1_preparereturnvalue_black = pattern_XRouterToRouterRule_12_1_preparereturnvalue_blackFBB(
					eClass, _this);
			if (result_pattern_XRouterToRouterRule_12_1_preparereturnvalue_black != null) {
				EOperation performOperation = (EOperation) result_pattern_XRouterToRouterRule_12_1_preparereturnvalue_black[0];

				return new Object[] { performOperation, eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_XRouterToRouterRule_12_1_preparereturnvalue_greenBF(
			EOperation performOperation) {
		IsApplicableRuleResult ruleresult = RuntimeFactory.eINSTANCE.createIsApplicableRuleResult();
		boolean ruleresult_success_prime = Boolean.valueOf(false);
		String ruleresult_rule_prime = "XRouterToRouterRule";
		ruleresult.setPerformOperation(performOperation);
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		ruleresult.setRule(ruleresult_rule_prime);
		return new Object[] { performOperation, ruleresult };
	}

	public static final Object[] pattern_XRouterToRouterRule_12_2_corematch_bindingFFB(Match match) {
		EObject _localVariable_0 = match.getObject("container");
		EObject _localVariable_1 = match.getObject("device");
		EObject tmpContainer = _localVariable_0;
		EObject tmpDevice = _localVariable_1;
		if (tmpContainer instanceof Container) {
			Container container = (Container) tmpContainer;
			if (tmpDevice instanceof Router) {
				Router device = (Router) tmpDevice;
				return new Object[] { container, device, match };
			}
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_XRouterToRouterRule_12_2_corematch_blackBFFBB(Container container,
			Router device, Match match) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		for (XContainerToContainer xContainerToContainer : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(container, XContainerToContainer.class, "target")) {
			XContainer xContainer = xContainerToContainer.getSource();
			if (xContainer != null) {
				_result.add(new Object[] { container, xContainerToContainer, xContainer, device, match });
			}

		}
		return _result;
	}

	public static final Iterable<Object[]> pattern_XRouterToRouterRule_12_3_findcontext_blackBBBB(Container container,
			XContainerToContainer xContainerToContainer, XContainer xContainer, Router device) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (container.getDevices().contains(device)) {
			if (xContainer.equals(xContainerToContainer.getSource())) {
				if (container.equals(xContainerToContainer.getTarget())) {
					_result.add(new Object[] { container, xContainerToContainer, xContainer, device });
				}
			}
		}
		return _result;
	}

	public static final Object[] pattern_XRouterToRouterRule_12_3_findcontext_greenBBBBFFFF(Container container,
			XContainerToContainer xContainerToContainer, XContainer xContainer, Router device) {
		IsApplicableMatch isApplicableMatch = RuntimeFactory.eINSTANCE.createIsApplicableMatch();
		EMoflonEdge container__device____devices = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge xContainerToContainer__xContainer____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge xContainerToContainer__container____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String container__device____devices_name_prime = "devices";
		String xContainerToContainer__xContainer____source_name_prime = "source";
		String xContainerToContainer__container____target_name_prime = "target";
		isApplicableMatch.getAllContextElements().add(container);
		isApplicableMatch.getAllContextElements().add(xContainerToContainer);
		isApplicableMatch.getAllContextElements().add(xContainer);
		isApplicableMatch.getAllContextElements().add(device);
		container__device____devices.setSrc(container);
		container__device____devices.setTrg(device);
		isApplicableMatch.getAllContextElements().add(container__device____devices);
		xContainerToContainer__xContainer____source.setSrc(xContainerToContainer);
		xContainerToContainer__xContainer____source.setTrg(xContainer);
		isApplicableMatch.getAllContextElements().add(xContainerToContainer__xContainer____source);
		xContainerToContainer__container____target.setSrc(xContainerToContainer);
		xContainerToContainer__container____target.setTrg(container);
		isApplicableMatch.getAllContextElements().add(xContainerToContainer__container____target);
		container__device____devices.setName(container__device____devices_name_prime);
		xContainerToContainer__xContainer____source.setName(xContainerToContainer__xContainer____source_name_prime);
		xContainerToContainer__container____target.setName(xContainerToContainer__container____target_name_prime);
		return new Object[] { container, xContainerToContainer, xContainer, device, isApplicableMatch,
				container__device____devices, xContainerToContainer__xContainer____source,
				xContainerToContainer__container____target };
	}

	public static final Object[] pattern_XRouterToRouterRule_12_4_solveCSP_bindingFBBBBBB(XRouterToRouterRule _this,
			IsApplicableMatch isApplicableMatch, Container container, XContainerToContainer xContainerToContainer,
			XContainer xContainer, Router device) {
		CSP _localVariable_0 = _this.isApplicable_solveCsp_BWD(isApplicableMatch, container, xContainerToContainer,
				xContainer, device);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, container, xContainerToContainer, xContainer, device };
		}
		return null;
	}

	public static final Object[] pattern_XRouterToRouterRule_12_4_solveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_XRouterToRouterRule_12_4_solveCSP_bindingAndBlackFBBBBBB(
			XRouterToRouterRule _this, IsApplicableMatch isApplicableMatch, Container container,
			XContainerToContainer xContainerToContainer, XContainer xContainer, Router device) {
		Object[] result_pattern_XRouterToRouterRule_12_4_solveCSP_binding = pattern_XRouterToRouterRule_12_4_solveCSP_bindingFBBBBBB(
				_this, isApplicableMatch, container, xContainerToContainer, xContainer, device);
		if (result_pattern_XRouterToRouterRule_12_4_solveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_XRouterToRouterRule_12_4_solveCSP_binding[0];

			Object[] result_pattern_XRouterToRouterRule_12_4_solveCSP_black = pattern_XRouterToRouterRule_12_4_solveCSP_blackB(
					csp);
			if (result_pattern_XRouterToRouterRule_12_4_solveCSP_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, container, xContainerToContainer, xContainer,
						device };
			}
		}
		return null;
	}

	public static final boolean pattern_XRouterToRouterRule_12_5_checkCSP_expressionFBB(XRouterToRouterRule _this,
			CSP csp) {
		boolean _localVariable_0 = _this.isApplicable_checkCsp_BWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_XRouterToRouterRule_12_6_addmatchtoruleresult_blackBB(
			IsApplicableRuleResult ruleresult, IsApplicableMatch isApplicableMatch) {
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final Object[] pattern_XRouterToRouterRule_12_6_addmatchtoruleresult_greenBB(
			IsApplicableRuleResult ruleresult, IsApplicableMatch isApplicableMatch) {
		ruleresult.getIsApplicableMatch().add(isApplicableMatch);
		boolean ruleresult_success_prime = Boolean.valueOf(true);
		String isApplicableMatch_ruleName_prime = "XRouterToRouterRule";
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		isApplicableMatch.setRuleName(isApplicableMatch_ruleName_prime);
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final IsApplicableRuleResult pattern_XRouterToRouterRule_12_7_expressionFB(
			IsApplicableRuleResult ruleresult) {
		IsApplicableRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_XRouterToRouterRule_20_1_preparereturnvalue_bindingFB(
			XRouterToRouterRule _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_XRouterToRouterRule_20_1_preparereturnvalue_blackFBBF(EClass __eClass,
			XRouterToRouterRule _this) {
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

	public static final Object[] pattern_XRouterToRouterRule_20_1_preparereturnvalue_bindingAndBlackFFBF(
			XRouterToRouterRule _this) {
		Object[] result_pattern_XRouterToRouterRule_20_1_preparereturnvalue_binding = pattern_XRouterToRouterRule_20_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_XRouterToRouterRule_20_1_preparereturnvalue_binding != null) {
			EClass __eClass = (EClass) result_pattern_XRouterToRouterRule_20_1_preparereturnvalue_binding[0];

			Object[] result_pattern_XRouterToRouterRule_20_1_preparereturnvalue_black = pattern_XRouterToRouterRule_20_1_preparereturnvalue_blackFBBF(
					__eClass, _this);
			if (result_pattern_XRouterToRouterRule_20_1_preparereturnvalue_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_XRouterToRouterRule_20_1_preparereturnvalue_black[0];
				EOperation isApplicableCC = (EOperation) result_pattern_XRouterToRouterRule_20_1_preparereturnvalue_black[3];

				return new Object[] { __performOperation, __eClass, _this, isApplicableCC };
			}
		}
		return null;
	}

	public static final Object[] pattern_XRouterToRouterRule_20_1_preparereturnvalue_greenF() {
		EObjectContainer __result = RuntimeFactory.eINSTANCE.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Iterable<Object[]> pattern_XRouterToRouterRule_20_2_testcorematchandDECs_blackFFB(
			EMoflonEdge _edge_devices) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		EObject tmpContainer = _edge_devices.getSrc();
		if (tmpContainer instanceof Container) {
			Container container = (Container) tmpContainer;
			EObject tmpDevice = _edge_devices.getTrg();
			if (tmpDevice instanceof Router) {
				Router device = (Router) tmpDevice;
				if (container.getDevices().contains(device)) {
					_result.add(new Object[] { container, device, _edge_devices });
				}
			}

		}

		return _result;
	}

	public static final Object[] pattern_XRouterToRouterRule_20_2_testcorematchandDECs_greenFB(EClass __eClass) {
		Match match = RuntimeFactory.eINSTANCE.createMatch();
		String __eClass_name = __eClass.getName();
		String match_ruleName_prime = __eClass_name;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_XRouterToRouterRule_20_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBB(
			XRouterToRouterRule _this, Match match, Container container, Router device) {
		boolean _localVariable_0 = _this.isAppropriate_BWD(match, container, device);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_XRouterToRouterRule_20_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(
			XRouterToRouterRule _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_BWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_XRouterToRouterRule_20_5_Addmatchtoruleresult_blackBBBB(Match match,
			EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		if (!__performOperation.equals(isApplicableCC)) {
			return new Object[] { match, __performOperation, __result, isApplicableCC };
		}
		return null;
	}

	public static final Object[] pattern_XRouterToRouterRule_20_5_Addmatchtoruleresult_greenBBBB(Match match,
			EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		match.setIsApplicableCCOperation(isApplicableCC);
		return new Object[] { match, __performOperation, __result, isApplicableCC };
	}

	public static final EObjectContainer pattern_XRouterToRouterRule_20_6_expressionFB(EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_XRouterToRouterRule_21_1_preparereturnvalue_bindingFB(
			XRouterToRouterRule _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_XRouterToRouterRule_21_1_preparereturnvalue_blackFBBF(EClass __eClass,
			XRouterToRouterRule _this) {
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

	public static final Object[] pattern_XRouterToRouterRule_21_1_preparereturnvalue_bindingAndBlackFFBF(
			XRouterToRouterRule _this) {
		Object[] result_pattern_XRouterToRouterRule_21_1_preparereturnvalue_binding = pattern_XRouterToRouterRule_21_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_XRouterToRouterRule_21_1_preparereturnvalue_binding != null) {
			EClass __eClass = (EClass) result_pattern_XRouterToRouterRule_21_1_preparereturnvalue_binding[0];

			Object[] result_pattern_XRouterToRouterRule_21_1_preparereturnvalue_black = pattern_XRouterToRouterRule_21_1_preparereturnvalue_blackFBBF(
					__eClass, _this);
			if (result_pattern_XRouterToRouterRule_21_1_preparereturnvalue_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_XRouterToRouterRule_21_1_preparereturnvalue_black[0];
				EOperation isApplicableCC = (EOperation) result_pattern_XRouterToRouterRule_21_1_preparereturnvalue_black[3];

				return new Object[] { __performOperation, __eClass, _this, isApplicableCC };
			}
		}
		return null;
	}

	public static final Object[] pattern_XRouterToRouterRule_21_1_preparereturnvalue_greenF() {
		EObjectContainer __result = RuntimeFactory.eINSTANCE.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Iterable<Object[]> pattern_XRouterToRouterRule_21_2_testcorematchandDECs_blackFFFB(
			EMoflonEdge _edge_elements) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		EObject tmpXContainer = _edge_elements.getSrc();
		if (tmpXContainer instanceof XContainer) {
			XContainer xContainer = (XContainer) tmpXContainer;
			EObject tmpXDevice = _edge_elements.getTrg();
			if (tmpXDevice instanceof XRouter) {
				XRouter xDevice = (XRouter) tmpXDevice;
				if (xContainer.getElements().contains(xDevice)) {
					Connections connection = xDevice.getConnections();
					if (connection != null) {
						_result.add(new Object[] { xDevice, xContainer, connection, _edge_elements });
					}

				}
			}

		}

		return _result;
	}

	public static final Object[] pattern_XRouterToRouterRule_21_2_testcorematchandDECs_greenFB(EClass __eClass) {
		Match match = RuntimeFactory.eINSTANCE.createMatch();
		String __eClass_name = __eClass.getName();
		String match_ruleName_prime = __eClass_name;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_XRouterToRouterRule_21_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBBB(
			XRouterToRouterRule _this, Match match, XRouter xDevice, XContainer xContainer, Connections connection) {
		boolean _localVariable_0 = _this.isAppropriate_FWD(match, xDevice, xContainer, connection);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_XRouterToRouterRule_21_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(
			XRouterToRouterRule _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_FWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_XRouterToRouterRule_21_5_Addmatchtoruleresult_blackBBBB(Match match,
			EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		if (!__performOperation.equals(isApplicableCC)) {
			return new Object[] { match, __performOperation, __result, isApplicableCC };
		}
		return null;
	}

	public static final Object[] pattern_XRouterToRouterRule_21_5_Addmatchtoruleresult_greenBBBB(Match match,
			EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		match.setIsApplicableCCOperation(isApplicableCC);
		return new Object[] { match, __performOperation, __result, isApplicableCC };
	}

	public static final EObjectContainer pattern_XRouterToRouterRule_21_6_expressionFB(EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_XRouterToRouterRule_24_1_prepare_blackB(XRouterToRouterRule _this) {
		return new Object[] { _this };
	}

	public static final Object[] pattern_XRouterToRouterRule_24_1_prepare_greenF() {
		IsApplicableRuleResult result = RuntimeFactory.eINSTANCE.createIsApplicableRuleResult();
		return new Object[] { result };
	}

	public static final Object[] pattern_XRouterToRouterRule_24_2_matchsrctrgcontext_bindingFFFFFBB(Match targetMatch,
			Match sourceMatch) {
		EObject _localVariable_0 = targetMatch.getObject("container");
		EObject _localVariable_1 = sourceMatch.getObject("xDevice");
		EObject _localVariable_2 = sourceMatch.getObject("xContainer");
		EObject _localVariable_3 = sourceMatch.getObject("connection");
		EObject _localVariable_4 = targetMatch.getObject("device");
		EObject tmpContainer = _localVariable_0;
		EObject tmpXDevice = _localVariable_1;
		EObject tmpXContainer = _localVariable_2;
		EObject tmpConnection = _localVariable_3;
		EObject tmpDevice = _localVariable_4;
		if (tmpContainer instanceof Container) {
			Container container = (Container) tmpContainer;
			if (tmpXDevice instanceof XRouter) {
				XRouter xDevice = (XRouter) tmpXDevice;
				if (tmpXContainer instanceof XContainer) {
					XContainer xContainer = (XContainer) tmpXContainer;
					if (tmpConnection instanceof Connections) {
						Connections connection = (Connections) tmpConnection;
						if (tmpDevice instanceof Router) {
							Router device = (Router) tmpDevice;
							return new Object[] { container, xDevice, xContainer, connection, device, targetMatch,
									sourceMatch };
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_XRouterToRouterRule_24_2_matchsrctrgcontext_blackBBBBBBB(Container container,
			XRouter xDevice, XContainer xContainer, Connections connection, Router device, Match sourceMatch,
			Match targetMatch) {
		if (!sourceMatch.equals(targetMatch)) {
			return new Object[] { container, xDevice, xContainer, connection, device, sourceMatch, targetMatch };
		}
		return null;
	}

	public static final Object[] pattern_XRouterToRouterRule_24_2_matchsrctrgcontext_bindingAndBlackFFFFFBB(
			Match sourceMatch, Match targetMatch) {
		Object[] result_pattern_XRouterToRouterRule_24_2_matchsrctrgcontext_binding = pattern_XRouterToRouterRule_24_2_matchsrctrgcontext_bindingFFFFFBB(
				targetMatch, sourceMatch);
		if (result_pattern_XRouterToRouterRule_24_2_matchsrctrgcontext_binding != null) {
			Container container = (Container) result_pattern_XRouterToRouterRule_24_2_matchsrctrgcontext_binding[0];
			XRouter xDevice = (XRouter) result_pattern_XRouterToRouterRule_24_2_matchsrctrgcontext_binding[1];
			XContainer xContainer = (XContainer) result_pattern_XRouterToRouterRule_24_2_matchsrctrgcontext_binding[2];
			Connections connection = (Connections) result_pattern_XRouterToRouterRule_24_2_matchsrctrgcontext_binding[3];
			Router device = (Router) result_pattern_XRouterToRouterRule_24_2_matchsrctrgcontext_binding[4];

			Object[] result_pattern_XRouterToRouterRule_24_2_matchsrctrgcontext_black = pattern_XRouterToRouterRule_24_2_matchsrctrgcontext_blackBBBBBBB(
					container, xDevice, xContainer, connection, device, sourceMatch, targetMatch);
			if (result_pattern_XRouterToRouterRule_24_2_matchsrctrgcontext_black != null) {

				return new Object[] { container, xDevice, xContainer, connection, device, sourceMatch, targetMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_XRouterToRouterRule_24_3_solvecsp_bindingFBBBBBBBB(XRouterToRouterRule _this,
			Container container, XRouter xDevice, XContainer xContainer, Connections connection, Router device,
			Match sourceMatch, Match targetMatch) {
		CSP _localVariable_5 = _this.isApplicable_solveCsp_CC(container, xDevice, xContainer, connection, device,
				sourceMatch, targetMatch);
		CSP csp = _localVariable_5;
		if (csp != null) {
			return new Object[] { csp, _this, container, xDevice, xContainer, connection, device, sourceMatch,
					targetMatch };
		}
		return null;
	}

	public static final Object[] pattern_XRouterToRouterRule_24_3_solvecsp_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_XRouterToRouterRule_24_3_solvecsp_bindingAndBlackFBBBBBBBB(
			XRouterToRouterRule _this, Container container, XRouter xDevice, XContainer xContainer,
			Connections connection, Router device, Match sourceMatch, Match targetMatch) {
		Object[] result_pattern_XRouterToRouterRule_24_3_solvecsp_binding = pattern_XRouterToRouterRule_24_3_solvecsp_bindingFBBBBBBBB(
				_this, container, xDevice, xContainer, connection, device, sourceMatch, targetMatch);
		if (result_pattern_XRouterToRouterRule_24_3_solvecsp_binding != null) {
			CSP csp = (CSP) result_pattern_XRouterToRouterRule_24_3_solvecsp_binding[0];

			Object[] result_pattern_XRouterToRouterRule_24_3_solvecsp_black = pattern_XRouterToRouterRule_24_3_solvecsp_blackB(
					csp);
			if (result_pattern_XRouterToRouterRule_24_3_solvecsp_black != null) {

				return new Object[] { csp, _this, container, xDevice, xContainer, connection, device, sourceMatch,
						targetMatch };
			}
		}
		return null;
	}

	public static final boolean pattern_XRouterToRouterRule_24_4_checkCSP_expressionFB(CSP csp) {
		boolean _localVariable_0 = csp.check();
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Iterable<Object[]> pattern_XRouterToRouterRule_24_5_matchcorrcontext_blackBFBBB(
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

	public static final Object[] pattern_XRouterToRouterRule_24_5_matchcorrcontext_greenBBBF(
			XContainerToContainer xContainerToContainer, Match sourceMatch, Match targetMatch) {
		CCMatch ccMatch = RuntimeFactory.eINSTANCE.createCCMatch();
		String ccMatch_ruleName_prime = "XRouterToRouterRule";
		ccMatch.setSourceMatch(sourceMatch);
		ccMatch.setTargetMatch(targetMatch);
		ccMatch.getAllContextElements().add(xContainerToContainer);
		ccMatch.setRuleName(ccMatch_ruleName_prime);
		return new Object[] { xContainerToContainer, sourceMatch, targetMatch, ccMatch };
	}

	public static final Object[] pattern_XRouterToRouterRule_24_6_createcorrespondence_blackBBBBBB(Container container,
			XRouter xDevice, XContainer xContainer, Connections connection, Router device, CCMatch ccMatch) {
		return new Object[] { container, xDevice, xContainer, connection, device, ccMatch };
	}

	public static final Object[] pattern_XRouterToRouterRule_24_6_createcorrespondence_greenBBFB(XRouter xDevice,
			Router device, CCMatch ccMatch) {
		XDeviceToDevice xDeviceToDevice = ImplementationTransformatorFactory.eINSTANCE.createXDeviceToDevice();
		xDeviceToDevice.setSource(xDevice);
		xDeviceToDevice.setTarget(device);
		ccMatch.getCreateCorr().add(xDeviceToDevice);
		return new Object[] { xDevice, device, xDeviceToDevice, ccMatch };
	}

	public static final Object[] pattern_XRouterToRouterRule_24_7_addtoreturnedresult_blackBB(
			IsApplicableRuleResult result, CCMatch ccMatch) {
		return new Object[] { result, ccMatch };
	}

	public static final Object[] pattern_XRouterToRouterRule_24_7_addtoreturnedresult_greenBB(
			IsApplicableRuleResult result, CCMatch ccMatch) {
		result.getIsApplicableMatch().add(ccMatch);
		boolean result_success_prime = Boolean.valueOf(true);
		String ccMatch_ruleName_prime = "XRouterToRouterRule";
		result.setSuccess(Boolean.valueOf(result_success_prime));
		ccMatch.setRuleName(ccMatch_ruleName_prime);
		return new Object[] { result, ccMatch };
	}

	public static final IsApplicableRuleResult pattern_XRouterToRouterRule_24_8_expressionFB(
			IsApplicableRuleResult result) {
		IsApplicableRuleResult _result = result;
		return _result;
	}

	public static final Object[] pattern_XRouterToRouterRule_27_1_matchtggpattern_blackBBB(XRouter xDevice,
			XContainer xContainer, Connections connection) {
		if (xContainer.getElements().contains(xDevice)) {
			if (connection.equals(xDevice.getConnections())) {
				return new Object[] { xDevice, xContainer, connection };
			}
		}
		return null;
	}

	public static final boolean pattern_XRouterToRouterRule_27_2_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_XRouterToRouterRule_27_3_expressionF() {
		boolean _result = Boolean.valueOf(false);
		return _result;
	}

	public static final Object[] pattern_XRouterToRouterRule_28_1_matchtggpattern_blackBB(Container container,
			Router device) {
		if (container.getDevices().contains(device)) {
			return new Object[] { container, device };
		}
		return null;
	}

	public static final boolean pattern_XRouterToRouterRule_28_2_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_XRouterToRouterRule_28_3_expressionF() {
		boolean _result = Boolean.valueOf(false);
		return _result;
	}

	public static final Object[] pattern_XRouterToRouterRule_29_1_createresult_blackB(XRouterToRouterRule _this) {
		return new Object[] { _this };
	}

	public static final Object[] pattern_XRouterToRouterRule_29_1_createresult_greenFF() {
		IsApplicableMatch isApplicableMatch = RuntimeFactory.eINSTANCE.createIsApplicableMatch();
		ModelgeneratorRuleResult ruleResult = RuntimeFactory.eINSTANCE.createModelgeneratorRuleResult();
		boolean ruleResult_success_prime = Boolean.valueOf(false);
		ruleResult.setSuccess(Boolean.valueOf(ruleResult_success_prime));
		return new Object[] { isApplicableMatch, ruleResult };
	}

	public static final Object[] pattern_XRouterToRouterRule_29_2_isapplicablecore_black_nac_0BB(
			ModelgeneratorRuleResult ruleResult, Container container) {
		if (ruleResult.getTargetObjects().contains(container)) {
			return new Object[] { ruleResult, container };
		}
		return null;
	}

	public static final Object[] pattern_XRouterToRouterRule_29_2_isapplicablecore_black_nac_1BB(
			ModelgeneratorRuleResult ruleResult, XContainerToContainer xContainerToContainer) {
		if (ruleResult.getCorrObjects().contains(xContainerToContainer)) {
			return new Object[] { ruleResult, xContainerToContainer };
		}
		return null;
	}

	public static final Object[] pattern_XRouterToRouterRule_29_2_isapplicablecore_black_nac_2BB(
			ModelgeneratorRuleResult ruleResult, XContainer xContainer) {
		if (ruleResult.getSourceObjects().contains(xContainer)) {
			return new Object[] { ruleResult, xContainer };
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_XRouterToRouterRule_29_2_isapplicablecore_blackFFFFBB(
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
							if (pattern_XRouterToRouterRule_29_2_isapplicablecore_black_nac_1BB(ruleResult,
									xContainerToContainer) == null) {
								if (pattern_XRouterToRouterRule_29_2_isapplicablecore_black_nac_0BB(ruleResult,
										container) == null) {
									if (pattern_XRouterToRouterRule_29_2_isapplicablecore_black_nac_2BB(ruleResult,
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

	public static final Object[] pattern_XRouterToRouterRule_29_3_solveCSP_bindingFBBBBBB(XRouterToRouterRule _this,
			IsApplicableMatch isApplicableMatch, Container container, XContainerToContainer xContainerToContainer,
			XContainer xContainer, ModelgeneratorRuleResult ruleResult) {
		CSP _localVariable_0 = _this.generateModel_solveCsp_BWD(isApplicableMatch, container, xContainerToContainer,
				xContainer, ruleResult);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, container, xContainerToContainer, xContainer,
					ruleResult };
		}
		return null;
	}

	public static final Object[] pattern_XRouterToRouterRule_29_3_solveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_XRouterToRouterRule_29_3_solveCSP_bindingAndBlackFBBBBBB(
			XRouterToRouterRule _this, IsApplicableMatch isApplicableMatch, Container container,
			XContainerToContainer xContainerToContainer, XContainer xContainer, ModelgeneratorRuleResult ruleResult) {
		Object[] result_pattern_XRouterToRouterRule_29_3_solveCSP_binding = pattern_XRouterToRouterRule_29_3_solveCSP_bindingFBBBBBB(
				_this, isApplicableMatch, container, xContainerToContainer, xContainer, ruleResult);
		if (result_pattern_XRouterToRouterRule_29_3_solveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_XRouterToRouterRule_29_3_solveCSP_binding[0];

			Object[] result_pattern_XRouterToRouterRule_29_3_solveCSP_black = pattern_XRouterToRouterRule_29_3_solveCSP_blackB(
					csp);
			if (result_pattern_XRouterToRouterRule_29_3_solveCSP_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, container, xContainerToContainer, xContainer,
						ruleResult };
			}
		}
		return null;
	}

	public static final boolean pattern_XRouterToRouterRule_29_4_checkCSP_expressionFBB(XRouterToRouterRule _this,
			CSP csp) {
		boolean _localVariable_0 = _this.generateModel_checkCsp_BWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_XRouterToRouterRule_29_5_checknacs_blackBBB(Container container,
			XContainerToContainer xContainerToContainer, XContainer xContainer) {
		return new Object[] { container, xContainerToContainer, xContainer };
	}

	public static final Object[] pattern_XRouterToRouterRule_29_6_perform_blackBBBB(Container container,
			XContainerToContainer xContainerToContainer, XContainer xContainer, ModelgeneratorRuleResult ruleResult) {
		return new Object[] { container, xContainerToContainer, xContainer, ruleResult };
	}

	public static final Object[] pattern_XRouterToRouterRule_29_6_perform_greenBFBFFFBB(Container container,
			XContainer xContainer, ModelgeneratorRuleResult ruleResult, CSP csp) {
		XRouter xDevice = XtextImplFactory.eINSTANCE.createXRouter();
		Connections connection = XtextImplFactory.eINSTANCE.createConnections();
		Router device = ImplementationFactory.eINSTANCE.createRouter();
		XDeviceToDevice xDeviceToDevice = ImplementationTransformatorFactory.eINSTANCE.createXDeviceToDevice();
		Object _localVariable_0 = csp.getValue("xDevice", "maxSpeed");
		Object _localVariable_1 = csp.getValue("xDevice", "name");
		Object _localVariable_2 = csp.getValue("device", "maxSpeed");
		Object _localVariable_3 = csp.getValue("device", "name");
		boolean ruleResult_success_prime = Boolean.valueOf(true);
		int _localVariable_4 = ruleResult.getIncrementedPerformCount();
		xContainer.getElements().add(xDevice);
		ruleResult.getSourceObjects().add(xDevice);
		xDevice.setConnections(connection);
		ruleResult.getSourceObjects().add(connection);
		container.getDevices().add(device);
		ruleResult.getTargetObjects().add(device);
		xDeviceToDevice.setSource(xDevice);
		xDeviceToDevice.setTarget(device);
		ruleResult.getCorrObjects().add(xDeviceToDevice);
		BigInteger xDevice_maxSpeed_prime = (BigInteger) _localVariable_0;
		String xDevice_name_prime = (String) _localVariable_1;
		BigInteger device_maxSpeed_prime = (BigInteger) _localVariable_2;
		String device_name_prime = (String) _localVariable_3;
		ruleResult.setSuccess(Boolean.valueOf(ruleResult_success_prime));
		int ruleResult_performCount_prime = Integer.valueOf(_localVariable_4);
		xDevice.setMaxSpeed(xDevice_maxSpeed_prime);
		xDevice.setName(xDevice_name_prime);
		device.setMaxSpeed(device_maxSpeed_prime);
		device.setName(device_name_prime);
		ruleResult.setPerformCount(Integer.valueOf(ruleResult_performCount_prime));
		return new Object[] { container, xDevice, xContainer, connection, device, xDeviceToDevice, ruleResult, csp };
	}

	public static final ModelgeneratorRuleResult pattern_XRouterToRouterRule_29_7_expressionFB(
			ModelgeneratorRuleResult ruleResult) {
		ModelgeneratorRuleResult _result = ruleResult;
		return _result;
	}

	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} //XRouterToRouterRuleImpl
