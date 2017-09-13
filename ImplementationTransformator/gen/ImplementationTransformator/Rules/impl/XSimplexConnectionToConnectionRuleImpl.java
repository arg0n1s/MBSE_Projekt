/**
 */
package ImplementationTransformator.Rules.impl;

import ImplementationTransformator.Rules.RulesPackage;
import ImplementationTransformator.Rules.XSimplexConnectionToConnectionRule;

import ImplementationTransformator.XCableToCable;
import ImplementationTransformator.XDeviceToDevice;

import implementation.Cable;
import implementation.Container;
import implementation.Device;

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

import xtextImplementation.xtextImpl.CableAttributes;
import xtextImplementation.xtextImpl.Connections;
import xtextImplementation.xtextImpl.NetworkElements;
import xtextImplementation.xtextImpl.XCable;
import xtextImplementation.xtextImpl.XContainer;
import xtextImplementation.xtextImpl.XDevice;
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
 * An implementation of the model object '<em><b>XSimplex Connection To Connection Rule</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class XSimplexConnectionToConnectionRuleImpl extends AbstractRuleImpl
		implements XSimplexConnectionToConnectionRule {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected XSimplexConnectionToConnectionRuleImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RulesPackage.eINSTANCE.getXSimplexConnectionToConnectionRule();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAppropriate_FWD(Match match, XDevice xDevice1, XCable xCable, CableAttributes cableAttributes,
			XContainer xContainer, Connections connection1, XDevice xDevice2, Connections connection2) {

		Object[] result1_black = XSimplexConnectionToConnectionRuleImpl
				.pattern_XSimplexConnectionToConnectionRule_0_1_initialbindings_blackBBBBBBBBB(this, match, xDevice1,
						xCable, cableAttributes, xContainer, connection1, xDevice2, connection2);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[match] = " + match + ", " + "[xDevice1] = " + xDevice1 + ", " + "[xCable] = " + xCable + ", "
					+ "[cableAttributes] = " + cableAttributes + ", " + "[xContainer] = " + xContainer + ", "
					+ "[connection1] = " + connection1 + ", " + "[xDevice2] = " + xDevice2 + ", " + "[connection2] = "
					+ connection2 + ".");
		}

		Object[] result2_bindingAndBlack = XSimplexConnectionToConnectionRuleImpl
				.pattern_XSimplexConnectionToConnectionRule_0_2_SolveCSP_bindingAndBlackFBBBBBBBBB(this, match,
						xDevice1, xCable, cableAttributes, xContainer, connection1, xDevice2, connection2);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[match] = " + match + ", " + "[xDevice1] = " + xDevice1 + ", " + "[xCable] = " + xCable + ", "
					+ "[cableAttributes] = " + cableAttributes + ", " + "[xContainer] = " + xContainer + ", "
					+ "[connection1] = " + connection1 + ", " + "[xDevice2] = " + xDevice2 + ", " + "[connection2] = "
					+ connection2 + ".");
		}
		CSP csp = (CSP) result2_bindingAndBlack[0];
		// 
		if (XSimplexConnectionToConnectionRuleImpl
				.pattern_XSimplexConnectionToConnectionRule_0_3_CheckCSP_expressionFBB(this, csp)) {

			Object[] result4_black = XSimplexConnectionToConnectionRuleImpl
					.pattern_XSimplexConnectionToConnectionRule_0_4_collectelementstobetranslated_blackBBBBBBBB(match,
							xDevice1, xCable, cableAttributes, xContainer, connection1, xDevice2, connection2);
			if (result4_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match + ", "
						+ "[xDevice1] = " + xDevice1 + ", " + "[xCable] = " + xCable + ", " + "[cableAttributes] = "
						+ cableAttributes + ", " + "[xContainer] = " + xContainer + ", " + "[connection1] = "
						+ connection1 + ", " + "[xDevice2] = " + xDevice2 + ", " + "[connection2] = " + connection2
						+ ".");
			}
			XSimplexConnectionToConnectionRuleImpl
					.pattern_XSimplexConnectionToConnectionRule_0_4_collectelementstobetranslated_greenBBBBBBBFFFF(
							match, xDevice1, xCable, cableAttributes, connection1, xDevice2, connection2);
			//nothing EMoflonEdge cableAttributes__xDevice1____endPoint1 = (EMoflonEdge) result4_green[7];
			//nothing EMoflonEdge connection1__xCable____outgoing = (EMoflonEdge) result4_green[8];
			//nothing EMoflonEdge cableAttributes__xDevice2____endPoint2 = (EMoflonEdge) result4_green[9];
			//nothing EMoflonEdge connection2__xCable____incoming = (EMoflonEdge) result4_green[10];

			Object[] result5_black = XSimplexConnectionToConnectionRuleImpl
					.pattern_XSimplexConnectionToConnectionRule_0_5_collectcontextelements_blackBBBBBBBB(match,
							xDevice1, xCable, cableAttributes, xContainer, connection1, xDevice2, connection2);
			if (result5_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match + ", "
						+ "[xDevice1] = " + xDevice1 + ", " + "[xCable] = " + xCable + ", " + "[cableAttributes] = "
						+ cableAttributes + ", " + "[xContainer] = " + xContainer + ", " + "[connection1] = "
						+ connection1 + ", " + "[xDevice2] = " + xDevice2 + ", " + "[connection2] = " + connection2
						+ ".");
			}
			XSimplexConnectionToConnectionRuleImpl
					.pattern_XSimplexConnectionToConnectionRule_0_5_collectcontextelements_greenBBBBBBBBFFFFFF(match,
							xDevice1, xCable, cableAttributes, xContainer, connection1, xDevice2, connection2);
			//nothing EMoflonEdge xDevice1__connection1____connections = (EMoflonEdge) result5_green[8];
			//nothing EMoflonEdge xCable__cableAttributes____cableAttributes = (EMoflonEdge) result5_green[9];
			//nothing EMoflonEdge xContainer__xCable____elements = (EMoflonEdge) result5_green[10];
			//nothing EMoflonEdge xContainer__xDevice2____elements = (EMoflonEdge) result5_green[11];
			//nothing EMoflonEdge xContainer__xDevice1____elements = (EMoflonEdge) result5_green[12];
			//nothing EMoflonEdge xDevice2__connection2____connections = (EMoflonEdge) result5_green[13];

			// 
			XSimplexConnectionToConnectionRuleImpl
					.pattern_XSimplexConnectionToConnectionRule_0_6_registerobjectstomatch_expressionBBBBBBBBB(this,
							match, xDevice1, xCable, cableAttributes, xContainer, connection1, xDevice2, connection2);
			return XSimplexConnectionToConnectionRuleImpl.pattern_XSimplexConnectionToConnectionRule_0_7_expressionF();
		} else {
			return XSimplexConnectionToConnectionRuleImpl.pattern_XSimplexConnectionToConnectionRule_0_8_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PerformRuleResult perform_FWD(IsApplicableMatch isApplicableMatch) {

		Object[] result1_bindingAndBlack = XSimplexConnectionToConnectionRuleImpl
				.pattern_XSimplexConnectionToConnectionRule_1_1_performtransformation_bindingAndBlackFFFFFFFFFFFFFFFBB(
						this, isApplicableMatch);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[isApplicableMatch] = " + isApplicableMatch + ".");
		}
		Container container = (Container) result1_bindingAndBlack[0];
		Cable cable = (Cable) result1_bindingAndBlack[1];
		XDevice xDevice1 = (XDevice) result1_bindingAndBlack[2];
		XCable xCable = (XCable) result1_bindingAndBlack[3];
		Device device2 = (Device) result1_bindingAndBlack[4];
		XDeviceToDevice xDeviceToDevice2 = (XDeviceToDevice) result1_bindingAndBlack[5];
		Device device1 = (Device) result1_bindingAndBlack[6];
		XDeviceToDevice xDeviceToDevice = (XDeviceToDevice) result1_bindingAndBlack[7];
		XCableToCable xCableToCable = (XCableToCable) result1_bindingAndBlack[8];
		CableAttributes cableAttributes = (CableAttributes) result1_bindingAndBlack[9];
		XContainer xContainer = (XContainer) result1_bindingAndBlack[10];
		Connections connection1 = (Connections) result1_bindingAndBlack[11];
		XDevice xDevice2 = (XDevice) result1_bindingAndBlack[12];
		Connections connection2 = (Connections) result1_bindingAndBlack[13];
		//nothing CSP csp = (CSP) result1_bindingAndBlack[14];
		XSimplexConnectionToConnectionRuleImpl
				.pattern_XSimplexConnectionToConnectionRule_1_1_performtransformation_greenBBB(cable, device2, device1);

		Object[] result2_green = XSimplexConnectionToConnectionRuleImpl
				.pattern_XSimplexConnectionToConnectionRule_1_2_collecttranslatedelements_greenF();
		if (result2_green == null) {
			throw new RuntimeException("Pattern matching failed.");
		}
		PerformRuleResult ruleresult = (PerformRuleResult) result2_green[0];

		Object[] result3_black = XSimplexConnectionToConnectionRuleImpl
				.pattern_XSimplexConnectionToConnectionRule_1_3_bookkeepingforedges_blackBBBBBBBBBBBBBBB(ruleresult,
						container, cable, xDevice1, xCable, device2, xDeviceToDevice2, device1, xDeviceToDevice,
						xCableToCable, cableAttributes, xContainer, connection1, xDevice2, connection2);
		if (result3_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[ruleresult] = " + ruleresult
					+ ", " + "[container] = " + container + ", " + "[cable] = " + cable + ", " + "[xDevice1] = "
					+ xDevice1 + ", " + "[xCable] = " + xCable + ", " + "[device2] = " + device2 + ", "
					+ "[xDeviceToDevice2] = " + xDeviceToDevice2 + ", " + "[device1] = " + device1 + ", "
					+ "[xDeviceToDevice] = " + xDeviceToDevice + ", " + "[xCableToCable] = " + xCableToCable + ", "
					+ "[cableAttributes] = " + cableAttributes + ", " + "[xContainer] = " + xContainer + ", "
					+ "[connection1] = " + connection1 + ", " + "[xDevice2] = " + xDevice2 + ", " + "[connection2] = "
					+ connection2 + ".");
		}
		XSimplexConnectionToConnectionRuleImpl
				.pattern_XSimplexConnectionToConnectionRule_1_3_bookkeepingforedges_greenBBBBBBBBBBFFFFFFFF(ruleresult,
						cable, xDevice1, xCable, device2, device1, cableAttributes, connection1, xDevice2, connection2);
		//nothing EMoflonEdge cable__device1____source = (EMoflonEdge) result3_green[10];
		//nothing EMoflonEdge device1__cable____outgoing = (EMoflonEdge) result3_green[11];
		//nothing EMoflonEdge cable__device2____target = (EMoflonEdge) result3_green[12];
		//nothing EMoflonEdge device2__cable____incoming = (EMoflonEdge) result3_green[13];
		//nothing EMoflonEdge cableAttributes__xDevice1____endPoint1 = (EMoflonEdge) result3_green[14];
		//nothing EMoflonEdge connection1__xCable____outgoing = (EMoflonEdge) result3_green[15];
		//nothing EMoflonEdge cableAttributes__xDevice2____endPoint2 = (EMoflonEdge) result3_green[16];
		//nothing EMoflonEdge connection2__xCable____incoming = (EMoflonEdge) result3_green[17];

		// 
		// 
		XSimplexConnectionToConnectionRuleImpl
				.pattern_XSimplexConnectionToConnectionRule_1_5_registerobjects_expressionBBBBBBBBBBBBBBBB(this,
						ruleresult, container, cable, xDevice1, xCable, device2, xDeviceToDevice2, device1,
						xDeviceToDevice, xCableToCable, cableAttributes, xContainer, connection1, xDevice2,
						connection2);
		return XSimplexConnectionToConnectionRuleImpl
				.pattern_XSimplexConnectionToConnectionRule_1_6_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IsApplicableRuleResult isApplicable_FWD(Match match) {

		Object[] result1_bindingAndBlack = XSimplexConnectionToConnectionRuleImpl
				.pattern_XSimplexConnectionToConnectionRule_2_1_preparereturnvalue_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		EOperation performOperation = (EOperation) result1_bindingAndBlack[0];
		//nothing EClass eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = XSimplexConnectionToConnectionRuleImpl
				.pattern_XSimplexConnectionToConnectionRule_2_1_preparereturnvalue_greenBF(performOperation);
		IsApplicableRuleResult ruleresult = (IsApplicableRuleResult) result1_green[1];

		// ForEach 
		Object[] result2_binding = XSimplexConnectionToConnectionRuleImpl
				.pattern_XSimplexConnectionToConnectionRule_2_2_corematch_bindingFFFFFFFB(match);
		if (result2_binding == null) {
			throw new RuntimeException(
					"Binding in node core match failed." + " Variables: " + "[match] = " + match + ".");
		}
		XDevice xDevice1 = (XDevice) result2_binding[0];
		XCable xCable = (XCable) result2_binding[1];
		CableAttributes cableAttributes = (CableAttributes) result2_binding[2];
		XContainer xContainer = (XContainer) result2_binding[3];
		Connections connection1 = (Connections) result2_binding[4];
		XDevice xDevice2 = (XDevice) result2_binding[5];
		Connections connection2 = (Connections) result2_binding[6];
		for (Object[] result2_black : XSimplexConnectionToConnectionRuleImpl
				.pattern_XSimplexConnectionToConnectionRule_2_2_corematch_blackFBBFFFFFBBBBBB(xDevice1, xCable,
						cableAttributes, xContainer, connection1, xDevice2, connection2, match)) {
			Cable cable = (Cable) result2_black[0];
			Device device2 = (Device) result2_black[3];
			XDeviceToDevice xDeviceToDevice2 = (XDeviceToDevice) result2_black[4];
			Device device1 = (Device) result2_black[5];
			XDeviceToDevice xDeviceToDevice = (XDeviceToDevice) result2_black[6];
			XCableToCable xCableToCable = (XCableToCable) result2_black[7];
			// ForEach 
			for (Object[] result3_black : XSimplexConnectionToConnectionRuleImpl
					.pattern_XSimplexConnectionToConnectionRule_2_3_findcontext_blackFBBBBBBBBBBBBB(cable, xDevice1,
							xCable, device2, xDeviceToDevice2, device1, xDeviceToDevice, xCableToCable, cableAttributes,
							xContainer, connection1, xDevice2, connection2)) {
				Container container = (Container) result3_black[0];
				Object[] result3_green = XSimplexConnectionToConnectionRuleImpl
						.pattern_XSimplexConnectionToConnectionRule_2_3_findcontext_greenBBBBBBBBBBBBBBFFFFFFFFFFFFFFFFFFFF(
								container, cable, xDevice1, xCable, device2, xDeviceToDevice2, device1, xDeviceToDevice,
								xCableToCable, cableAttributes, xContainer, connection1, xDevice2, connection2);
				IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result3_green[14];
				//nothing EMoflonEdge xDevice1__connection1____connections = (EMoflonEdge) result3_green[15];
				//nothing EMoflonEdge xCable__cableAttributes____cableAttributes = (EMoflonEdge) result3_green[16];
				//nothing EMoflonEdge container__cable____cables = (EMoflonEdge) result3_green[17];
				//nothing EMoflonEdge container__device1____devices = (EMoflonEdge) result3_green[18];
				//nothing EMoflonEdge xCableToCable__cable____target = (EMoflonEdge) result3_green[19];
				//nothing EMoflonEdge container__device2____devices = (EMoflonEdge) result3_green[20];
				//nothing EMoflonEdge xDeviceToDevice__xDevice1____source = (EMoflonEdge) result3_green[21];
				//nothing EMoflonEdge xCableToCable__xCable____source = (EMoflonEdge) result3_green[22];
				//nothing EMoflonEdge xDeviceToDevice__device1____target = (EMoflonEdge) result3_green[23];
				//nothing EMoflonEdge xContainer__xCable____elements = (EMoflonEdge) result3_green[24];
				//nothing EMoflonEdge xContainer__xDevice2____elements = (EMoflonEdge) result3_green[25];
				//nothing EMoflonEdge cableAttributes__xDevice1____endPoint1 = (EMoflonEdge) result3_green[26];
				//nothing EMoflonEdge xContainer__xDevice1____elements = (EMoflonEdge) result3_green[27];
				//nothing EMoflonEdge connection1__xCable____outgoing = (EMoflonEdge) result3_green[28];
				//nothing EMoflonEdge xDeviceToDevice2__device2____target = (EMoflonEdge) result3_green[29];
				//nothing EMoflonEdge xDeviceToDevice2__xDevice2____source = (EMoflonEdge) result3_green[30];
				//nothing EMoflonEdge cableAttributes__xDevice2____endPoint2 = (EMoflonEdge) result3_green[31];
				//nothing EMoflonEdge xDevice2__connection2____connections = (EMoflonEdge) result3_green[32];
				//nothing EMoflonEdge connection2__xCable____incoming = (EMoflonEdge) result3_green[33];

				Object[] result4_bindingAndBlack = XSimplexConnectionToConnectionRuleImpl
						.pattern_XSimplexConnectionToConnectionRule_2_4_solveCSP_bindingAndBlackFBBBBBBBBBBBBBBBB(this,
								isApplicableMatch, container, cable, xDevice1, xCable, device2, xDeviceToDevice2,
								device1, xDeviceToDevice, xCableToCable, cableAttributes, xContainer, connection1,
								xDevice2, connection2);
				if (result4_bindingAndBlack == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
							+ "[isApplicableMatch] = " + isApplicableMatch + ", " + "[container] = " + container + ", "
							+ "[cable] = " + cable + ", " + "[xDevice1] = " + xDevice1 + ", " + "[xCable] = " + xCable
							+ ", " + "[device2] = " + device2 + ", " + "[xDeviceToDevice2] = " + xDeviceToDevice2 + ", "
							+ "[device1] = " + device1 + ", " + "[xDeviceToDevice] = " + xDeviceToDevice + ", "
							+ "[xCableToCable] = " + xCableToCable + ", " + "[cableAttributes] = " + cableAttributes
							+ ", " + "[xContainer] = " + xContainer + ", " + "[connection1] = " + connection1 + ", "
							+ "[xDevice2] = " + xDevice2 + ", " + "[connection2] = " + connection2 + ".");
				}
				CSP csp = (CSP) result4_bindingAndBlack[0];
				// 
				if (XSimplexConnectionToConnectionRuleImpl
						.pattern_XSimplexConnectionToConnectionRule_2_5_checkCSP_expressionFBB(this, csp)) {

					Object[] result6_black = XSimplexConnectionToConnectionRuleImpl
							.pattern_XSimplexConnectionToConnectionRule_2_6_addmatchtoruleresult_blackBB(ruleresult,
									isApplicableMatch);
					if (result6_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[ruleresult] = "
								+ ruleresult + ", " + "[isApplicableMatch] = " + isApplicableMatch + ".");
					}
					XSimplexConnectionToConnectionRuleImpl
							.pattern_XSimplexConnectionToConnectionRule_2_6_addmatchtoruleresult_greenBB(ruleresult,
									isApplicableMatch);

				} else {
				}

			}

		}
		return XSimplexConnectionToConnectionRuleImpl
				.pattern_XSimplexConnectionToConnectionRule_2_7_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void registerObjectsToMatch_FWD(Match match, XDevice xDevice1, XCable xCable,
			CableAttributes cableAttributes, XContainer xContainer, Connections connection1, XDevice xDevice2,
			Connections connection2) {
		match.registerObject("xDevice1", xDevice1);
		match.registerObject("xCable", xCable);
		match.registerObject("cableAttributes", cableAttributes);
		match.registerObject("xContainer", xContainer);
		match.registerObject("connection1", connection1);
		match.registerObject("xDevice2", xDevice2);
		match.registerObject("connection2", connection2);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isAppropriate_solveCsp_FWD(Match match, XDevice xDevice1, XCable xCable, CableAttributes cableAttributes,
			XContainer xContainer, Connections connection1, XDevice xDevice2, Connections connection2) {// Create CSP
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
	public CSP isApplicable_solveCsp_FWD(IsApplicableMatch isApplicableMatch, Container container, Cable cable,
			XDevice xDevice1, XCable xCable, Device device2, XDeviceToDevice xDeviceToDevice2, Device device1,
			XDeviceToDevice xDeviceToDevice, XCableToCable xCableToCable, CableAttributes cableAttributes,
			XContainer xContainer, Connections connection1, XDevice xDevice2, Connections connection2) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals

		// Create attribute variables
		Variable var_cableAttributes_speed = CSPFactoryHelper.eINSTANCE.createVariable("cableAttributes.speed", true,
				csp);
		var_cableAttributes_speed.setValue(cableAttributes.getSpeed());
		var_cableAttributes_speed.setType("BigInteger");
		Variable var_cable_speed = CSPFactoryHelper.eINSTANCE.createVariable("cable.speed", true, csp);
		var_cable_speed.setValue(cable.getSpeed());
		var_cable_speed.setType("BigInteger");

		// Create unbound variables

		// Create constraints
		Eq eq = new Eq();

		csp.getConstraints().add(eq);

		// Solve CSP
		eq.setRuleName("NoRuleName");
		eq.solve(var_cableAttributes_speed, var_cable_speed);

		// Snapshot pattern match on which CSP is solved
		isApplicableMatch.registerObject("container", container);
		isApplicableMatch.registerObject("cable", cable);
		isApplicableMatch.registerObject("xDevice1", xDevice1);
		isApplicableMatch.registerObject("xCable", xCable);
		isApplicableMatch.registerObject("device2", device2);
		isApplicableMatch.registerObject("xDeviceToDevice2", xDeviceToDevice2);
		isApplicableMatch.registerObject("device1", device1);
		isApplicableMatch.registerObject("xDeviceToDevice", xDeviceToDevice);
		isApplicableMatch.registerObject("xCableToCable", xCableToCable);
		isApplicableMatch.registerObject("cableAttributes", cableAttributes);
		isApplicableMatch.registerObject("xContainer", xContainer);
		isApplicableMatch.registerObject("connection1", connection1);
		isApplicableMatch.registerObject("xDevice2", xDevice2);
		isApplicableMatch.registerObject("connection2", connection2);
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
	public void registerObjects_FWD(PerformRuleResult ruleresult, EObject container, EObject cable, EObject xDevice1,
			EObject xCable, EObject device2, EObject xDeviceToDevice2, EObject device1, EObject xDeviceToDevice,
			EObject xCableToCable, EObject cableAttributes, EObject xContainer, EObject connection1, EObject xDevice2,
			EObject connection2) {
		ruleresult.registerObject("container", container);
		ruleresult.registerObject("cable", cable);
		ruleresult.registerObject("xDevice1", xDevice1);
		ruleresult.registerObject("xCable", xCable);
		ruleresult.registerObject("device2", device2);
		ruleresult.registerObject("xDeviceToDevice2", xDeviceToDevice2);
		ruleresult.registerObject("device1", device1);
		ruleresult.registerObject("xDeviceToDevice", xDeviceToDevice);
		ruleresult.registerObject("xCableToCable", xCableToCable);
		ruleresult.registerObject("cableAttributes", cableAttributes);
		ruleresult.registerObject("xContainer", xContainer);
		ruleresult.registerObject("connection1", connection1);
		ruleresult.registerObject("xDevice2", xDevice2);
		ruleresult.registerObject("connection2", connection2);

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
	public boolean isAppropriate_BWD(Match match, Container container, Cable cable, Device device2, Device device1) {

		Object[] result1_black = XSimplexConnectionToConnectionRuleImpl
				.pattern_XSimplexConnectionToConnectionRule_10_1_initialbindings_blackBBBBBB(this, match, container,
						cable, device2, device1);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[match] = " + match + ", " + "[container] = " + container + ", " + "[cable] = " + cable + ", "
					+ "[device2] = " + device2 + ", " + "[device1] = " + device1 + ".");
		}

		Object[] result2_bindingAndBlack = XSimplexConnectionToConnectionRuleImpl
				.pattern_XSimplexConnectionToConnectionRule_10_2_SolveCSP_bindingAndBlackFBBBBBB(this, match, container,
						cable, device2, device1);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[match] = " + match + ", " + "[container] = " + container + ", " + "[cable] = " + cable + ", "
					+ "[device2] = " + device2 + ", " + "[device1] = " + device1 + ".");
		}
		CSP csp = (CSP) result2_bindingAndBlack[0];
		// 
		if (XSimplexConnectionToConnectionRuleImpl
				.pattern_XSimplexConnectionToConnectionRule_10_3_CheckCSP_expressionFBB(this, csp)) {

			Object[] result4_black = XSimplexConnectionToConnectionRuleImpl
					.pattern_XSimplexConnectionToConnectionRule_10_4_collectelementstobetranslated_blackBBBBB(match,
							container, cable, device2, device1);
			if (result4_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match + ", "
						+ "[container] = " + container + ", " + "[cable] = " + cable + ", " + "[device2] = " + device2
						+ ", " + "[device1] = " + device1 + ".");
			}
			XSimplexConnectionToConnectionRuleImpl
					.pattern_XSimplexConnectionToConnectionRule_10_4_collectelementstobetranslated_greenBBBBFFFF(match,
							cable, device2, device1);
			//nothing EMoflonEdge cable__device1____source = (EMoflonEdge) result4_green[4];
			//nothing EMoflonEdge device1__cable____outgoing = (EMoflonEdge) result4_green[5];
			//nothing EMoflonEdge cable__device2____target = (EMoflonEdge) result4_green[6];
			//nothing EMoflonEdge device2__cable____incoming = (EMoflonEdge) result4_green[7];

			Object[] result5_black = XSimplexConnectionToConnectionRuleImpl
					.pattern_XSimplexConnectionToConnectionRule_10_5_collectcontextelements_blackBBBBB(match, container,
							cable, device2, device1);
			if (result5_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match + ", "
						+ "[container] = " + container + ", " + "[cable] = " + cable + ", " + "[device2] = " + device2
						+ ", " + "[device1] = " + device1 + ".");
			}
			XSimplexConnectionToConnectionRuleImpl
					.pattern_XSimplexConnectionToConnectionRule_10_5_collectcontextelements_greenBBBBBFFF(match,
							container, cable, device2, device1);
			//nothing EMoflonEdge container__cable____cables = (EMoflonEdge) result5_green[5];
			//nothing EMoflonEdge container__device1____devices = (EMoflonEdge) result5_green[6];
			//nothing EMoflonEdge container__device2____devices = (EMoflonEdge) result5_green[7];

			// 
			XSimplexConnectionToConnectionRuleImpl
					.pattern_XSimplexConnectionToConnectionRule_10_6_registerobjectstomatch_expressionBBBBBB(this,
							match, container, cable, device2, device1);
			return XSimplexConnectionToConnectionRuleImpl.pattern_XSimplexConnectionToConnectionRule_10_7_expressionF();
		} else {
			return XSimplexConnectionToConnectionRuleImpl.pattern_XSimplexConnectionToConnectionRule_10_8_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PerformRuleResult perform_BWD(IsApplicableMatch isApplicableMatch) {

		Object[] result1_bindingAndBlack = XSimplexConnectionToConnectionRuleImpl
				.pattern_XSimplexConnectionToConnectionRule_11_1_performtransformation_bindingAndBlackFFFFFFFFFFFFFFFBB(
						this, isApplicableMatch);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[isApplicableMatch] = " + isApplicableMatch + ".");
		}
		Container container = (Container) result1_bindingAndBlack[0];
		Cable cable = (Cable) result1_bindingAndBlack[1];
		XDevice xDevice1 = (XDevice) result1_bindingAndBlack[2];
		XCable xCable = (XCable) result1_bindingAndBlack[3];
		Device device2 = (Device) result1_bindingAndBlack[4];
		XDeviceToDevice xDeviceToDevice2 = (XDeviceToDevice) result1_bindingAndBlack[5];
		Device device1 = (Device) result1_bindingAndBlack[6];
		XDeviceToDevice xDeviceToDevice = (XDeviceToDevice) result1_bindingAndBlack[7];
		XCableToCable xCableToCable = (XCableToCable) result1_bindingAndBlack[8];
		CableAttributes cableAttributes = (CableAttributes) result1_bindingAndBlack[9];
		XContainer xContainer = (XContainer) result1_bindingAndBlack[10];
		Connections connection1 = (Connections) result1_bindingAndBlack[11];
		XDevice xDevice2 = (XDevice) result1_bindingAndBlack[12];
		Connections connection2 = (Connections) result1_bindingAndBlack[13];
		//nothing CSP csp = (CSP) result1_bindingAndBlack[14];
		XSimplexConnectionToConnectionRuleImpl
				.pattern_XSimplexConnectionToConnectionRule_11_1_performtransformation_greenBBBBBB(xDevice1, xCable,
						cableAttributes, connection1, xDevice2, connection2);

		Object[] result2_green = XSimplexConnectionToConnectionRuleImpl
				.pattern_XSimplexConnectionToConnectionRule_11_2_collecttranslatedelements_greenF();
		if (result2_green == null) {
			throw new RuntimeException("Pattern matching failed.");
		}
		PerformRuleResult ruleresult = (PerformRuleResult) result2_green[0];

		Object[] result3_black = XSimplexConnectionToConnectionRuleImpl
				.pattern_XSimplexConnectionToConnectionRule_11_3_bookkeepingforedges_blackBBBBBBBBBBBBBBB(ruleresult,
						container, cable, xDevice1, xCable, device2, xDeviceToDevice2, device1, xDeviceToDevice,
						xCableToCable, cableAttributes, xContainer, connection1, xDevice2, connection2);
		if (result3_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[ruleresult] = " + ruleresult
					+ ", " + "[container] = " + container + ", " + "[cable] = " + cable + ", " + "[xDevice1] = "
					+ xDevice1 + ", " + "[xCable] = " + xCable + ", " + "[device2] = " + device2 + ", "
					+ "[xDeviceToDevice2] = " + xDeviceToDevice2 + ", " + "[device1] = " + device1 + ", "
					+ "[xDeviceToDevice] = " + xDeviceToDevice + ", " + "[xCableToCable] = " + xCableToCable + ", "
					+ "[cableAttributes] = " + cableAttributes + ", " + "[xContainer] = " + xContainer + ", "
					+ "[connection1] = " + connection1 + ", " + "[xDevice2] = " + xDevice2 + ", " + "[connection2] = "
					+ connection2 + ".");
		}
		XSimplexConnectionToConnectionRuleImpl
				.pattern_XSimplexConnectionToConnectionRule_11_3_bookkeepingforedges_greenBBBBBBBBBBFFFFFFFF(ruleresult,
						cable, xDevice1, xCable, device2, device1, cableAttributes, connection1, xDevice2, connection2);
		//nothing EMoflonEdge cable__device1____source = (EMoflonEdge) result3_green[10];
		//nothing EMoflonEdge device1__cable____outgoing = (EMoflonEdge) result3_green[11];
		//nothing EMoflonEdge cable__device2____target = (EMoflonEdge) result3_green[12];
		//nothing EMoflonEdge device2__cable____incoming = (EMoflonEdge) result3_green[13];
		//nothing EMoflonEdge cableAttributes__xDevice1____endPoint1 = (EMoflonEdge) result3_green[14];
		//nothing EMoflonEdge connection1__xCable____outgoing = (EMoflonEdge) result3_green[15];
		//nothing EMoflonEdge cableAttributes__xDevice2____endPoint2 = (EMoflonEdge) result3_green[16];
		//nothing EMoflonEdge connection2__xCable____incoming = (EMoflonEdge) result3_green[17];

		// 
		// 
		XSimplexConnectionToConnectionRuleImpl
				.pattern_XSimplexConnectionToConnectionRule_11_5_registerobjects_expressionBBBBBBBBBBBBBBBB(this,
						ruleresult, container, cable, xDevice1, xCable, device2, xDeviceToDevice2, device1,
						xDeviceToDevice, xCableToCable, cableAttributes, xContainer, connection1, xDevice2,
						connection2);
		return XSimplexConnectionToConnectionRuleImpl
				.pattern_XSimplexConnectionToConnectionRule_11_6_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IsApplicableRuleResult isApplicable_BWD(Match match) {

		Object[] result1_bindingAndBlack = XSimplexConnectionToConnectionRuleImpl
				.pattern_XSimplexConnectionToConnectionRule_12_1_preparereturnvalue_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		EOperation performOperation = (EOperation) result1_bindingAndBlack[0];
		//nothing EClass eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = XSimplexConnectionToConnectionRuleImpl
				.pattern_XSimplexConnectionToConnectionRule_12_1_preparereturnvalue_greenBF(performOperation);
		IsApplicableRuleResult ruleresult = (IsApplicableRuleResult) result1_green[1];

		// ForEach 
		Object[] result2_binding = XSimplexConnectionToConnectionRuleImpl
				.pattern_XSimplexConnectionToConnectionRule_12_2_corematch_bindingFFFFB(match);
		if (result2_binding == null) {
			throw new RuntimeException(
					"Binding in node core match failed." + " Variables: " + "[match] = " + match + ".");
		}
		Container container = (Container) result2_binding[0];
		Cable cable = (Cable) result2_binding[1];
		Device device2 = (Device) result2_binding[2];
		Device device1 = (Device) result2_binding[3];
		for (Object[] result2_black : XSimplexConnectionToConnectionRuleImpl
				.pattern_XSimplexConnectionToConnectionRule_12_2_corematch_blackBBFFBFBFFFB(container, cable, device2,
						device1, match)) {
			XDevice xDevice1 = (XDevice) result2_black[2];
			XCable xCable = (XCable) result2_black[3];
			XDeviceToDevice xDeviceToDevice2 = (XDeviceToDevice) result2_black[5];
			XDeviceToDevice xDeviceToDevice = (XDeviceToDevice) result2_black[7];
			XCableToCable xCableToCable = (XCableToCable) result2_black[8];
			XDevice xDevice2 = (XDevice) result2_black[9];
			// ForEach 
			for (Object[] result3_black : XSimplexConnectionToConnectionRuleImpl
					.pattern_XSimplexConnectionToConnectionRule_12_3_findcontext_blackBBBBBBBBBFFFBF(container, cable,
							xDevice1, xCable, device2, xDeviceToDevice2, device1, xDeviceToDevice, xCableToCable,
							xDevice2)) {
				CableAttributes cableAttributes = (CableAttributes) result3_black[9];
				XContainer xContainer = (XContainer) result3_black[10];
				Connections connection1 = (Connections) result3_black[11];
				Connections connection2 = (Connections) result3_black[13];
				Object[] result3_green = XSimplexConnectionToConnectionRuleImpl
						.pattern_XSimplexConnectionToConnectionRule_12_3_findcontext_greenBBBBBBBBBBBBBBFFFFFFFFFFFFFFFFFFFF(
								container, cable, xDevice1, xCable, device2, xDeviceToDevice2, device1, xDeviceToDevice,
								xCableToCable, cableAttributes, xContainer, connection1, xDevice2, connection2);
				IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result3_green[14];
				//nothing EMoflonEdge cable__device1____source = (EMoflonEdge) result3_green[15];
				//nothing EMoflonEdge device1__cable____outgoing = (EMoflonEdge) result3_green[16];
				//nothing EMoflonEdge xDevice1__connection1____connections = (EMoflonEdge) result3_green[17];
				//nothing EMoflonEdge xCable__cableAttributes____cableAttributes = (EMoflonEdge) result3_green[18];
				//nothing EMoflonEdge container__cable____cables = (EMoflonEdge) result3_green[19];
				//nothing EMoflonEdge container__device1____devices = (EMoflonEdge) result3_green[20];
				//nothing EMoflonEdge xCableToCable__cable____target = (EMoflonEdge) result3_green[21];
				//nothing EMoflonEdge container__device2____devices = (EMoflonEdge) result3_green[22];
				//nothing EMoflonEdge xDeviceToDevice__xDevice1____source = (EMoflonEdge) result3_green[23];
				//nothing EMoflonEdge xCableToCable__xCable____source = (EMoflonEdge) result3_green[24];
				//nothing EMoflonEdge xDeviceToDevice__device1____target = (EMoflonEdge) result3_green[25];
				//nothing EMoflonEdge cable__device2____target = (EMoflonEdge) result3_green[26];
				//nothing EMoflonEdge device2__cable____incoming = (EMoflonEdge) result3_green[27];
				//nothing EMoflonEdge xContainer__xCable____elements = (EMoflonEdge) result3_green[28];
				//nothing EMoflonEdge xContainer__xDevice2____elements = (EMoflonEdge) result3_green[29];
				//nothing EMoflonEdge xContainer__xDevice1____elements = (EMoflonEdge) result3_green[30];
				//nothing EMoflonEdge xDeviceToDevice2__device2____target = (EMoflonEdge) result3_green[31];
				//nothing EMoflonEdge xDeviceToDevice2__xDevice2____source = (EMoflonEdge) result3_green[32];
				//nothing EMoflonEdge xDevice2__connection2____connections = (EMoflonEdge) result3_green[33];

				Object[] result4_bindingAndBlack = XSimplexConnectionToConnectionRuleImpl
						.pattern_XSimplexConnectionToConnectionRule_12_4_solveCSP_bindingAndBlackFBBBBBBBBBBBBBBBB(this,
								isApplicableMatch, container, cable, xDevice1, xCable, device2, xDeviceToDevice2,
								device1, xDeviceToDevice, xCableToCable, cableAttributes, xContainer, connection1,
								xDevice2, connection2);
				if (result4_bindingAndBlack == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
							+ "[isApplicableMatch] = " + isApplicableMatch + ", " + "[container] = " + container + ", "
							+ "[cable] = " + cable + ", " + "[xDevice1] = " + xDevice1 + ", " + "[xCable] = " + xCable
							+ ", " + "[device2] = " + device2 + ", " + "[xDeviceToDevice2] = " + xDeviceToDevice2 + ", "
							+ "[device1] = " + device1 + ", " + "[xDeviceToDevice] = " + xDeviceToDevice + ", "
							+ "[xCableToCable] = " + xCableToCable + ", " + "[cableAttributes] = " + cableAttributes
							+ ", " + "[xContainer] = " + xContainer + ", " + "[connection1] = " + connection1 + ", "
							+ "[xDevice2] = " + xDevice2 + ", " + "[connection2] = " + connection2 + ".");
				}
				CSP csp = (CSP) result4_bindingAndBlack[0];
				// 
				if (XSimplexConnectionToConnectionRuleImpl
						.pattern_XSimplexConnectionToConnectionRule_12_5_checkCSP_expressionFBB(this, csp)) {

					Object[] result6_black = XSimplexConnectionToConnectionRuleImpl
							.pattern_XSimplexConnectionToConnectionRule_12_6_addmatchtoruleresult_blackBB(ruleresult,
									isApplicableMatch);
					if (result6_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[ruleresult] = "
								+ ruleresult + ", " + "[isApplicableMatch] = " + isApplicableMatch + ".");
					}
					XSimplexConnectionToConnectionRuleImpl
							.pattern_XSimplexConnectionToConnectionRule_12_6_addmatchtoruleresult_greenBB(ruleresult,
									isApplicableMatch);

				} else {
				}

			}

		}
		return XSimplexConnectionToConnectionRuleImpl
				.pattern_XSimplexConnectionToConnectionRule_12_7_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void registerObjectsToMatch_BWD(Match match, Container container, Cable cable, Device device2,
			Device device1) {
		match.registerObject("container", container);
		match.registerObject("cable", cable);
		match.registerObject("device2", device2);
		match.registerObject("device1", device1);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isAppropriate_solveCsp_BWD(Match match, Container container, Cable cable, Device device2,
			Device device1) {// Create CSP
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
	public CSP isApplicable_solveCsp_BWD(IsApplicableMatch isApplicableMatch, Container container, Cable cable,
			XDevice xDevice1, XCable xCable, Device device2, XDeviceToDevice xDeviceToDevice2, Device device1,
			XDeviceToDevice xDeviceToDevice, XCableToCable xCableToCable, CableAttributes cableAttributes,
			XContainer xContainer, Connections connection1, XDevice xDevice2, Connections connection2) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals

		// Create attribute variables
		Variable var_cableAttributes_speed = CSPFactoryHelper.eINSTANCE.createVariable("cableAttributes.speed", true,
				csp);
		var_cableAttributes_speed.setValue(cableAttributes.getSpeed());
		var_cableAttributes_speed.setType("BigInteger");
		Variable var_cable_speed = CSPFactoryHelper.eINSTANCE.createVariable("cable.speed", true, csp);
		var_cable_speed.setValue(cable.getSpeed());
		var_cable_speed.setType("BigInteger");

		// Create unbound variables

		// Create constraints
		Eq eq = new Eq();

		csp.getConstraints().add(eq);

		// Solve CSP
		eq.setRuleName("NoRuleName");
		eq.solve(var_cableAttributes_speed, var_cable_speed);

		// Snapshot pattern match on which CSP is solved
		isApplicableMatch.registerObject("container", container);
		isApplicableMatch.registerObject("cable", cable);
		isApplicableMatch.registerObject("xDevice1", xDevice1);
		isApplicableMatch.registerObject("xCable", xCable);
		isApplicableMatch.registerObject("device2", device2);
		isApplicableMatch.registerObject("xDeviceToDevice2", xDeviceToDevice2);
		isApplicableMatch.registerObject("device1", device1);
		isApplicableMatch.registerObject("xDeviceToDevice", xDeviceToDevice);
		isApplicableMatch.registerObject("xCableToCable", xCableToCable);
		isApplicableMatch.registerObject("cableAttributes", cableAttributes);
		isApplicableMatch.registerObject("xContainer", xContainer);
		isApplicableMatch.registerObject("connection1", connection1);
		isApplicableMatch.registerObject("xDevice2", xDevice2);
		isApplicableMatch.registerObject("connection2", connection2);
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
	public void registerObjects_BWD(PerformRuleResult ruleresult, EObject container, EObject cable, EObject xDevice1,
			EObject xCable, EObject device2, EObject xDeviceToDevice2, EObject device1, EObject xDeviceToDevice,
			EObject xCableToCable, EObject cableAttributes, EObject xContainer, EObject connection1, EObject xDevice2,
			EObject connection2) {
		ruleresult.registerObject("container", container);
		ruleresult.registerObject("cable", cable);
		ruleresult.registerObject("xDevice1", xDevice1);
		ruleresult.registerObject("xCable", xCable);
		ruleresult.registerObject("device2", device2);
		ruleresult.registerObject("xDeviceToDevice2", xDeviceToDevice2);
		ruleresult.registerObject("device1", device1);
		ruleresult.registerObject("xDeviceToDevice", xDeviceToDevice);
		ruleresult.registerObject("xCableToCable", xCableToCable);
		ruleresult.registerObject("cableAttributes", cableAttributes);
		ruleresult.registerObject("xContainer", xContainer);
		ruleresult.registerObject("connection1", connection1);
		ruleresult.registerObject("xDevice2", xDevice2);
		ruleresult.registerObject("connection2", connection2);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean checkTypes_BWD(Match match) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_BWD_EMoflonEdge_10(EMoflonEdge _edge_source) {

		Object[] result1_bindingAndBlack = XSimplexConnectionToConnectionRuleImpl
				.pattern_XSimplexConnectionToConnectionRule_20_1_preparereturnvalue_bindingAndBlackFFBF(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		EOperation isApplicableCC = (EOperation) result1_bindingAndBlack[3];
		Object[] result1_green = XSimplexConnectionToConnectionRuleImpl
				.pattern_XSimplexConnectionToConnectionRule_20_1_preparereturnvalue_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach 
		for (Object[] result2_black : XSimplexConnectionToConnectionRuleImpl
				.pattern_XSimplexConnectionToConnectionRule_20_2_testcorematchandDECs_blackFFFFB(_edge_source)) {
			Container container = (Container) result2_black[0];
			Cable cable = (Cable) result2_black[1];
			Device device2 = (Device) result2_black[2];
			Device device1 = (Device) result2_black[3];
			Object[] result2_green = XSimplexConnectionToConnectionRuleImpl
					.pattern_XSimplexConnectionToConnectionRule_20_2_testcorematchandDECs_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// 
			if (XSimplexConnectionToConnectionRuleImpl
					.pattern_XSimplexConnectionToConnectionRule_20_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBBBB(
							this, match, container, cable, device2, device1)) {
				// 
				if (XSimplexConnectionToConnectionRuleImpl
						.pattern_XSimplexConnectionToConnectionRule_20_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(
								this, match)) {

					Object[] result5_black = XSimplexConnectionToConnectionRuleImpl
							.pattern_XSimplexConnectionToConnectionRule_20_5_Addmatchtoruleresult_blackBBBB(match,
									__performOperation, __result, isApplicableCC);
					if (result5_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match
								+ ", " + "[__performOperation] = " + __performOperation + ", " + "[__result] = "
								+ __result + ", " + "[isApplicableCC] = " + isApplicableCC + ".");
					}
					XSimplexConnectionToConnectionRuleImpl
							.pattern_XSimplexConnectionToConnectionRule_20_5_Addmatchtoruleresult_greenBBBB(match,
									__performOperation, __result, isApplicableCC);

				} else {
				}

			} else {
			}

		}
		return XSimplexConnectionToConnectionRuleImpl
				.pattern_XSimplexConnectionToConnectionRule_20_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_FWD_EMoflonEdge_6(EMoflonEdge _edge_endPoint1) {

		Object[] result1_bindingAndBlack = XSimplexConnectionToConnectionRuleImpl
				.pattern_XSimplexConnectionToConnectionRule_21_1_preparereturnvalue_bindingAndBlackFFBF(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		EOperation isApplicableCC = (EOperation) result1_bindingAndBlack[3];
		Object[] result1_green = XSimplexConnectionToConnectionRuleImpl
				.pattern_XSimplexConnectionToConnectionRule_21_1_preparereturnvalue_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach 
		for (Object[] result2_black : XSimplexConnectionToConnectionRuleImpl
				.pattern_XSimplexConnectionToConnectionRule_21_2_testcorematchandDECs_blackFFFFFFFB(_edge_endPoint1)) {
			XDevice xDevice1 = (XDevice) result2_black[0];
			XCable xCable = (XCable) result2_black[1];
			CableAttributes cableAttributes = (CableAttributes) result2_black[2];
			XContainer xContainer = (XContainer) result2_black[3];
			Connections connection1 = (Connections) result2_black[4];
			XDevice xDevice2 = (XDevice) result2_black[5];
			Connections connection2 = (Connections) result2_black[6];
			Object[] result2_green = XSimplexConnectionToConnectionRuleImpl
					.pattern_XSimplexConnectionToConnectionRule_21_2_testcorematchandDECs_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// 
			if (XSimplexConnectionToConnectionRuleImpl
					.pattern_XSimplexConnectionToConnectionRule_21_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBBBBBBB(
							this, match, xDevice1, xCable, cableAttributes, xContainer, connection1, xDevice2,
							connection2)) {
				// 
				if (XSimplexConnectionToConnectionRuleImpl
						.pattern_XSimplexConnectionToConnectionRule_21_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(
								this, match)) {

					Object[] result5_black = XSimplexConnectionToConnectionRuleImpl
							.pattern_XSimplexConnectionToConnectionRule_21_5_Addmatchtoruleresult_blackBBBB(match,
									__performOperation, __result, isApplicableCC);
					if (result5_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match
								+ ", " + "[__performOperation] = " + __performOperation + ", " + "[__result] = "
								+ __result + ", " + "[isApplicableCC] = " + isApplicableCC + ".");
					}
					XSimplexConnectionToConnectionRuleImpl
							.pattern_XSimplexConnectionToConnectionRule_21_5_Addmatchtoruleresult_greenBBBB(match,
									__performOperation, __result, isApplicableCC);

				} else {
				}

			} else {
			}

		}
		return XSimplexConnectionToConnectionRuleImpl
				.pattern_XSimplexConnectionToConnectionRule_21_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AttributeConstraintsRuleResult checkAttributes_FWD(TripleMatch __tripleMatch) {
		AttributeConstraintsRuleResult ruleResult = org.moflon.tgg.runtime.RuntimeFactory.eINSTANCE
				.createAttributeConstraintsRuleResult();
		ruleResult.setRule("XSimplexConnectionToConnectionRule");
		ruleResult.setSuccess(true);

		CSP csp = CspFactory.eINSTANCE.createCSP();

		CheckAttributeHelper __helper = new CheckAttributeHelper(__tripleMatch);

		if (!__helper.hasExpectedValue("cableAttributes", "isDuplex", false, ComparingOperator.EQUAL)) {
			ruleResult.setSuccess(false);
			return ruleResult;
		}

		Variable var_cable_speed = CSPFactoryHelper.eINSTANCE.createVariable("cable", true, csp);
		var_cable_speed.setValue(__helper.getValue("cable", "speed"));
		var_cable_speed.setType("BigInteger");

		Variable var_cableAttributes_speed = CSPFactoryHelper.eINSTANCE.createVariable("cableAttributes", true, csp);
		var_cableAttributes_speed.setValue(__helper.getValue("cableAttributes", "speed"));
		var_cableAttributes_speed.setType("BigInteger");

		Eq eq0 = new Eq();
		csp.getConstraints().add(eq0);

		eq0.setRuleName("XSimplexConnectionToConnectionRule");
		eq0.solve(var_cableAttributes_speed, var_cable_speed);

		if (csp.check()) {
			ruleResult.setSuccess(true);
		} else {
			eq0.solve(var_cableAttributes_speed, var_cable_speed);
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
		ruleResult.setRule("XSimplexConnectionToConnectionRule");
		ruleResult.setSuccess(true);

		CSP csp = CspFactory.eINSTANCE.createCSP();

		CheckAttributeHelper __helper = new CheckAttributeHelper(__tripleMatch);

		if (!__helper.hasExpectedValue("cableAttributes", "isDuplex", false, ComparingOperator.EQUAL)) {
			ruleResult.setSuccess(false);
			return ruleResult;
		}

		Variable var_cable_speed = CSPFactoryHelper.eINSTANCE.createVariable("cable", true, csp);
		var_cable_speed.setValue(__helper.getValue("cable", "speed"));
		var_cable_speed.setType("BigInteger");

		Variable var_cableAttributes_speed = CSPFactoryHelper.eINSTANCE.createVariable("cableAttributes", true, csp);
		var_cableAttributes_speed.setValue(__helper.getValue("cableAttributes", "speed"));
		var_cableAttributes_speed.setType("BigInteger");

		Eq eq0 = new Eq();
		csp.getConstraints().add(eq0);

		eq0.setRuleName("XSimplexConnectionToConnectionRule");
		eq0.solve(var_cableAttributes_speed, var_cable_speed);

		if (csp.check()) {
			ruleResult.setSuccess(true);
		} else {
			eq0.solve(var_cableAttributes_speed, var_cable_speed);
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

		Object[] result1_black = XSimplexConnectionToConnectionRuleImpl
				.pattern_XSimplexConnectionToConnectionRule_24_1_prepare_blackB(this);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		Object[] result1_green = XSimplexConnectionToConnectionRuleImpl
				.pattern_XSimplexConnectionToConnectionRule_24_1_prepare_greenF();
		IsApplicableRuleResult result = (IsApplicableRuleResult) result1_green[0];

		Object[] result2_bindingAndBlack = XSimplexConnectionToConnectionRuleImpl
				.pattern_XSimplexConnectionToConnectionRule_24_2_matchsrctrgcontext_bindingAndBlackFFFFFFFFFFFBB(
						sourceMatch, targetMatch);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[sourceMatch] = " + sourceMatch
					+ ", " + "[targetMatch] = " + targetMatch + ".");
		}
		Container container = (Container) result2_bindingAndBlack[0];
		Cable cable = (Cable) result2_bindingAndBlack[1];
		XDevice xDevice1 = (XDevice) result2_bindingAndBlack[2];
		XCable xCable = (XCable) result2_bindingAndBlack[3];
		Device device2 = (Device) result2_bindingAndBlack[4];
		Device device1 = (Device) result2_bindingAndBlack[5];
		CableAttributes cableAttributes = (CableAttributes) result2_bindingAndBlack[6];
		XContainer xContainer = (XContainer) result2_bindingAndBlack[7];
		Connections connection1 = (Connections) result2_bindingAndBlack[8];
		XDevice xDevice2 = (XDevice) result2_bindingAndBlack[9];
		Connections connection2 = (Connections) result2_bindingAndBlack[10];

		Object[] result3_bindingAndBlack = XSimplexConnectionToConnectionRuleImpl
				.pattern_XSimplexConnectionToConnectionRule_24_3_solvecsp_bindingAndBlackFBBBBBBBBBBBBBB(this,
						container, cable, xDevice1, xCable, device2, device1, cableAttributes, xContainer, connection1,
						xDevice2, connection2, sourceMatch, targetMatch);
		if (result3_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[container] = " + container + ", " + "[cable] = " + cable + ", " + "[xDevice1] = " + xDevice1
					+ ", " + "[xCable] = " + xCable + ", " + "[device2] = " + device2 + ", " + "[device1] = " + device1
					+ ", " + "[cableAttributes] = " + cableAttributes + ", " + "[xContainer] = " + xContainer + ", "
					+ "[connection1] = " + connection1 + ", " + "[xDevice2] = " + xDevice2 + ", " + "[connection2] = "
					+ connection2 + ", " + "[sourceMatch] = " + sourceMatch + ", " + "[targetMatch] = " + targetMatch
					+ ".");
		}
		CSP csp = (CSP) result3_bindingAndBlack[0];
		// 
		if (XSimplexConnectionToConnectionRuleImpl
				.pattern_XSimplexConnectionToConnectionRule_24_4_checkCSP_expressionFB(csp)) {
			// ForEach 
			for (Object[] result5_black : XSimplexConnectionToConnectionRuleImpl
					.pattern_XSimplexConnectionToConnectionRule_24_5_matchcorrcontext_blackBBBBFBFFBBB(cable, xDevice1,
							xCable, device2, device1, xDevice2, sourceMatch, targetMatch)) {
				XDeviceToDevice xDeviceToDevice2 = (XDeviceToDevice) result5_black[4];
				XDeviceToDevice xDeviceToDevice = (XDeviceToDevice) result5_black[6];
				XCableToCable xCableToCable = (XCableToCable) result5_black[7];
				Object[] result5_green = XSimplexConnectionToConnectionRuleImpl
						.pattern_XSimplexConnectionToConnectionRule_24_5_matchcorrcontext_greenBBBBBF(xDeviceToDevice2,
								xDeviceToDevice, xCableToCable, sourceMatch, targetMatch);
				CCMatch ccMatch = (CCMatch) result5_green[5];

				Object[] result6_black = XSimplexConnectionToConnectionRuleImpl
						.pattern_XSimplexConnectionToConnectionRule_24_6_createcorrespondence_blackBBBBBBBBBBBB(
								container, cable, xDevice1, xCable, device2, device1, cableAttributes, xContainer,
								connection1, xDevice2, connection2, ccMatch);
				if (result6_black == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[container] = "
							+ container + ", " + "[cable] = " + cable + ", " + "[xDevice1] = " + xDevice1 + ", "
							+ "[xCable] = " + xCable + ", " + "[device2] = " + device2 + ", " + "[device1] = " + device1
							+ ", " + "[cableAttributes] = " + cableAttributes + ", " + "[xContainer] = " + xContainer
							+ ", " + "[connection1] = " + connection1 + ", " + "[xDevice2] = " + xDevice2 + ", "
							+ "[connection2] = " + connection2 + ", " + "[ccMatch] = " + ccMatch + ".");
				}

				Object[] result7_black = XSimplexConnectionToConnectionRuleImpl
						.pattern_XSimplexConnectionToConnectionRule_24_7_addtoreturnedresult_blackBB(result, ccMatch);
				if (result7_black == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[result] = " + result
							+ ", " + "[ccMatch] = " + ccMatch + ".");
				}
				XSimplexConnectionToConnectionRuleImpl
						.pattern_XSimplexConnectionToConnectionRule_24_7_addtoreturnedresult_greenBB(result, ccMatch);

			}

		} else {
		}
		return XSimplexConnectionToConnectionRuleImpl
				.pattern_XSimplexConnectionToConnectionRule_24_8_expressionFB(result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isApplicable_solveCsp_CC(Container container, Cable cable, XDevice xDevice1, XCable xCable,
			Device device2, Device device1, CableAttributes cableAttributes, XContainer xContainer,
			Connections connection1, XDevice xDevice2, Connections connection2, Match sourceMatch, Match targetMatch) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();

		// Create literals

		// Create attribute variables
		Variable var_cableAttributes_speed = CSPFactoryHelper.eINSTANCE.createVariable("cableAttributes.speed", true,
				csp);
		var_cableAttributes_speed.setValue(cableAttributes.getSpeed());
		var_cableAttributes_speed.setType("BigInteger");
		Variable var_cable_speed = CSPFactoryHelper.eINSTANCE.createVariable("cable.speed", true, csp);
		var_cable_speed.setValue(cable.getSpeed());
		var_cable_speed.setType("BigInteger");

		// Create unbound variables

		// Create constraints
		Eq eq = new Eq();

		csp.getConstraints().add(eq);

		// Solve CSP
		eq.setRuleName("NoRuleName");
		eq.solve(var_cableAttributes_speed, var_cable_speed);
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
	public boolean checkDEC_FWD(XDevice xDevice1, XCable xCable, CableAttributes cableAttributes, XContainer xContainer,
			Connections connection1, XDevice xDevice2, Connections connection2) {// 
		Object[] result1_black = XSimplexConnectionToConnectionRuleImpl
				.pattern_XSimplexConnectionToConnectionRule_27_1_matchtggpattern_blackBBBBBBB(xDevice1, xCable,
						cableAttributes, xContainer, connection1, xDevice2, connection2);
		if (result1_black != null) {
			XSimplexConnectionToConnectionRuleImpl
					.pattern_XSimplexConnectionToConnectionRule_27_1_matchtggpattern_greenB(cableAttributes);

			return XSimplexConnectionToConnectionRuleImpl.pattern_XSimplexConnectionToConnectionRule_27_2_expressionF();
		} else {
			return XSimplexConnectionToConnectionRuleImpl.pattern_XSimplexConnectionToConnectionRule_27_3_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean checkDEC_BWD(Container container, Cable cable, Device device2, Device device1) {// 
		Object[] result1_black = XSimplexConnectionToConnectionRuleImpl
				.pattern_XSimplexConnectionToConnectionRule_28_1_matchtggpattern_blackBBBB(container, cable, device2,
						device1);
		if (result1_black != null) {
			return XSimplexConnectionToConnectionRuleImpl.pattern_XSimplexConnectionToConnectionRule_28_2_expressionF();
		} else {
			return XSimplexConnectionToConnectionRuleImpl.pattern_XSimplexConnectionToConnectionRule_28_3_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModelgeneratorRuleResult generateModel(RuleEntryContainer ruleEntryContainer,
			XCableToCable xCableToCableParameter) {

		Object[] result1_black = XSimplexConnectionToConnectionRuleImpl
				.pattern_XSimplexConnectionToConnectionRule_29_1_createresult_blackB(this);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		Object[] result1_green = XSimplexConnectionToConnectionRuleImpl
				.pattern_XSimplexConnectionToConnectionRule_29_1_createresult_greenFF();
		IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result1_green[0];
		ModelgeneratorRuleResult ruleResult = (ModelgeneratorRuleResult) result1_green[1];

		// ForEach 
		for (Object[] result2_black : XSimplexConnectionToConnectionRuleImpl
				.pattern_XSimplexConnectionToConnectionRule_29_2_isapplicablecore_blackFFFFFFFFFFFFFFFBB(
						ruleEntryContainer, ruleResult)) {
			//nothing RuleEntryList xCableToCableList = (RuleEntryList) result2_black[0];
			Container container = (Container) result2_black[1];
			Cable cable = (Cable) result2_black[2];
			XCableToCable xCableToCable = (XCableToCable) result2_black[3];
			XCable xCable = (XCable) result2_black[4];
			CableAttributes cableAttributes = (CableAttributes) result2_black[5];
			XContainer xContainer = (XContainer) result2_black[6];
			XDevice xDevice2 = (XDevice) result2_black[7];
			Connections connection2 = (Connections) result2_black[8];
			XDeviceToDevice xDeviceToDevice2 = (XDeviceToDevice) result2_black[9];
			Device device2 = (Device) result2_black[10];
			XDevice xDevice1 = (XDevice) result2_black[11];
			Connections connection1 = (Connections) result2_black[12];
			XDeviceToDevice xDeviceToDevice = (XDeviceToDevice) result2_black[13];
			Device device1 = (Device) result2_black[14];
			XSimplexConnectionToConnectionRuleImpl
					.pattern_XSimplexConnectionToConnectionRule_29_2_isapplicablecore_greenB(cableAttributes);

			Object[] result3_bindingAndBlack = XSimplexConnectionToConnectionRuleImpl
					.pattern_XSimplexConnectionToConnectionRule_29_3_solveCSP_bindingAndBlackFBBBBBBBBBBBBBBBBB(this,
							isApplicableMatch, container, cable, xDevice1, xCable, device2, xDeviceToDevice2, device1,
							xDeviceToDevice, xCableToCable, cableAttributes, xContainer, connection1, xDevice2,
							connection2, ruleResult);
			if (result3_bindingAndBlack == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
						+ "[isApplicableMatch] = " + isApplicableMatch + ", " + "[container] = " + container + ", "
						+ "[cable] = " + cable + ", " + "[xDevice1] = " + xDevice1 + ", " + "[xCable] = " + xCable
						+ ", " + "[device2] = " + device2 + ", " + "[xDeviceToDevice2] = " + xDeviceToDevice2 + ", "
						+ "[device1] = " + device1 + ", " + "[xDeviceToDevice] = " + xDeviceToDevice + ", "
						+ "[xCableToCable] = " + xCableToCable + ", " + "[cableAttributes] = " + cableAttributes + ", "
						+ "[xContainer] = " + xContainer + ", " + "[connection1] = " + connection1 + ", "
						+ "[xDevice2] = " + xDevice2 + ", " + "[connection2] = " + connection2 + ", "
						+ "[ruleResult] = " + ruleResult + ".");
			}
			CSP csp = (CSP) result3_bindingAndBlack[0];
			// 
			if (XSimplexConnectionToConnectionRuleImpl
					.pattern_XSimplexConnectionToConnectionRule_29_4_checkCSP_expressionFBB(this, csp)) {
				// 
				Object[] result5_black = XSimplexConnectionToConnectionRuleImpl
						.pattern_XSimplexConnectionToConnectionRule_29_5_checknacs_blackBBBBBBBBBBBBBB(container, cable,
								xDevice1, xCable, device2, xDeviceToDevice2, device1, xDeviceToDevice, xCableToCable,
								cableAttributes, xContainer, connection1, xDevice2, connection2);
				if (result5_black != null) {
					XSimplexConnectionToConnectionRuleImpl
							.pattern_XSimplexConnectionToConnectionRule_29_5_checknacs_greenB(cableAttributes);

					Object[] result6_black = XSimplexConnectionToConnectionRuleImpl
							.pattern_XSimplexConnectionToConnectionRule_29_6_perform_blackBBBBBBBBBBBBBBB(container,
									cable, xDevice1, xCable, device2, xDeviceToDevice2, device1, xDeviceToDevice,
									xCableToCable, cableAttributes, xContainer, connection1, xDevice2, connection2,
									ruleResult);
					if (result6_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[container] = "
								+ container + ", " + "[cable] = " + cable + ", " + "[xDevice1] = " + xDevice1 + ", "
								+ "[xCable] = " + xCable + ", " + "[device2] = " + device2 + ", "
								+ "[xDeviceToDevice2] = " + xDeviceToDevice2 + ", " + "[device1] = " + device1 + ", "
								+ "[xDeviceToDevice] = " + xDeviceToDevice + ", " + "[xCableToCable] = " + xCableToCable
								+ ", " + "[cableAttributes] = " + cableAttributes + ", " + "[xContainer] = "
								+ xContainer + ", " + "[connection1] = " + connection1 + ", " + "[xDevice2] = "
								+ xDevice2 + ", " + "[connection2] = " + connection2 + ", " + "[ruleResult] = "
								+ ruleResult + ".");
					}
					XSimplexConnectionToConnectionRuleImpl
							.pattern_XSimplexConnectionToConnectionRule_29_6_perform_greenBBBBBBBBBB(cable, xDevice1,
									xCable, device2, device1, cableAttributes, connection1, xDevice2, connection2,
									ruleResult);

				} else {
				}

			} else {
			}

		}
		return XSimplexConnectionToConnectionRuleImpl
				.pattern_XSimplexConnectionToConnectionRule_29_7_expressionFB(ruleResult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP generateModel_solveCsp_BWD(IsApplicableMatch isApplicableMatch, Container container, Cable cable,
			XDevice xDevice1, XCable xCable, Device device2, XDeviceToDevice xDeviceToDevice2, Device device1,
			XDeviceToDevice xDeviceToDevice, XCableToCable xCableToCable, CableAttributes cableAttributes,
			XContainer xContainer, Connections connection1, XDevice xDevice2, Connections connection2,
			ModelgeneratorRuleResult ruleResult) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals

		// Create attribute variables
		Variable var_cableAttributes_speed = CSPFactoryHelper.eINSTANCE.createVariable("cableAttributes.speed", true,
				csp);
		var_cableAttributes_speed.setValue(cableAttributes.getSpeed());
		var_cableAttributes_speed.setType("BigInteger");
		Variable var_cable_speed = CSPFactoryHelper.eINSTANCE.createVariable("cable.speed", true, csp);
		var_cable_speed.setValue(cable.getSpeed());
		var_cable_speed.setType("BigInteger");

		// Create unbound variables

		// Create constraints
		Eq eq = new Eq();

		csp.getConstraints().add(eq);

		// Solve CSP
		eq.setRuleName("NoRuleName");
		eq.solve(var_cableAttributes_speed, var_cable_speed);

		// Snapshot pattern match on which CSP is solved
		isApplicableMatch.registerObject("container", container);
		isApplicableMatch.registerObject("cable", cable);
		isApplicableMatch.registerObject("xDevice1", xDevice1);
		isApplicableMatch.registerObject("xCable", xCable);
		isApplicableMatch.registerObject("device2", device2);
		isApplicableMatch.registerObject("xDeviceToDevice2", xDeviceToDevice2);
		isApplicableMatch.registerObject("device1", device1);
		isApplicableMatch.registerObject("xDeviceToDevice", xDeviceToDevice);
		isApplicableMatch.registerObject("xCableToCable", xCableToCable);
		isApplicableMatch.registerObject("cableAttributes", cableAttributes);
		isApplicableMatch.registerObject("xContainer", xContainer);
		isApplicableMatch.registerObject("connection1", connection1);
		isApplicableMatch.registerObject("xDevice2", xDevice2);
		isApplicableMatch.registerObject("connection2", connection2);
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
		case RulesPackage.XSIMPLEX_CONNECTION_TO_CONNECTION_RULE___IS_APPROPRIATE_FWD__MATCH_XDEVICE_XCABLE_CABLEATTRIBUTES_XCONTAINER_CONNECTIONS_XDEVICE_CONNECTIONS:
			return isAppropriate_FWD((Match) arguments.get(0), (XDevice) arguments.get(1), (XCable) arguments.get(2),
					(CableAttributes) arguments.get(3), (XContainer) arguments.get(4), (Connections) arguments.get(5),
					(XDevice) arguments.get(6), (Connections) arguments.get(7));
		case RulesPackage.XSIMPLEX_CONNECTION_TO_CONNECTION_RULE___PERFORM_FWD__ISAPPLICABLEMATCH:
			return perform_FWD((IsApplicableMatch) arguments.get(0));
		case RulesPackage.XSIMPLEX_CONNECTION_TO_CONNECTION_RULE___IS_APPLICABLE_FWD__MATCH:
			return isApplicable_FWD((Match) arguments.get(0));
		case RulesPackage.XSIMPLEX_CONNECTION_TO_CONNECTION_RULE___REGISTER_OBJECTS_TO_MATCH_FWD__MATCH_XDEVICE_XCABLE_CABLEATTRIBUTES_XCONTAINER_CONNECTIONS_XDEVICE_CONNECTIONS:
			registerObjectsToMatch_FWD((Match) arguments.get(0), (XDevice) arguments.get(1), (XCable) arguments.get(2),
					(CableAttributes) arguments.get(3), (XContainer) arguments.get(4), (Connections) arguments.get(5),
					(XDevice) arguments.get(6), (Connections) arguments.get(7));
			return null;
		case RulesPackage.XSIMPLEX_CONNECTION_TO_CONNECTION_RULE___IS_APPROPRIATE_SOLVE_CSP_FWD__MATCH_XDEVICE_XCABLE_CABLEATTRIBUTES_XCONTAINER_CONNECTIONS_XDEVICE_CONNECTIONS:
			return isAppropriate_solveCsp_FWD((Match) arguments.get(0), (XDevice) arguments.get(1),
					(XCable) arguments.get(2), (CableAttributes) arguments.get(3), (XContainer) arguments.get(4),
					(Connections) arguments.get(5), (XDevice) arguments.get(6), (Connections) arguments.get(7));
		case RulesPackage.XSIMPLEX_CONNECTION_TO_CONNECTION_RULE___IS_APPROPRIATE_CHECK_CSP_FWD__CSP:
			return isAppropriate_checkCsp_FWD((CSP) arguments.get(0));
		case RulesPackage.XSIMPLEX_CONNECTION_TO_CONNECTION_RULE___IS_APPLICABLE_SOLVE_CSP_FWD__ISAPPLICABLEMATCH_CONTAINER_CABLE_XDEVICE_XCABLE_DEVICE_XDEVICETODEVICE_DEVICE_XDEVICETODEVICE_XCABLETOCABLE_CABLEATTRIBUTES_XCONTAINER_CONNECTIONS_XDEVICE_CONNECTIONS:
			return isApplicable_solveCsp_FWD((IsApplicableMatch) arguments.get(0), (Container) arguments.get(1),
					(Cable) arguments.get(2), (XDevice) arguments.get(3), (XCable) arguments.get(4),
					(Device) arguments.get(5), (XDeviceToDevice) arguments.get(6), (Device) arguments.get(7),
					(XDeviceToDevice) arguments.get(8), (XCableToCable) arguments.get(9),
					(CableAttributes) arguments.get(10), (XContainer) arguments.get(11),
					(Connections) arguments.get(12), (XDevice) arguments.get(13), (Connections) arguments.get(14));
		case RulesPackage.XSIMPLEX_CONNECTION_TO_CONNECTION_RULE___IS_APPLICABLE_CHECK_CSP_FWD__CSP:
			return isApplicable_checkCsp_FWD((CSP) arguments.get(0));
		case RulesPackage.XSIMPLEX_CONNECTION_TO_CONNECTION_RULE___REGISTER_OBJECTS_FWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT:
			registerObjects_FWD((PerformRuleResult) arguments.get(0), (EObject) arguments.get(1),
					(EObject) arguments.get(2), (EObject) arguments.get(3), (EObject) arguments.get(4),
					(EObject) arguments.get(5), (EObject) arguments.get(6), (EObject) arguments.get(7),
					(EObject) arguments.get(8), (EObject) arguments.get(9), (EObject) arguments.get(10),
					(EObject) arguments.get(11), (EObject) arguments.get(12), (EObject) arguments.get(13),
					(EObject) arguments.get(14));
			return null;
		case RulesPackage.XSIMPLEX_CONNECTION_TO_CONNECTION_RULE___CHECK_TYPES_FWD__MATCH:
			return checkTypes_FWD((Match) arguments.get(0));
		case RulesPackage.XSIMPLEX_CONNECTION_TO_CONNECTION_RULE___IS_APPROPRIATE_BWD__MATCH_CONTAINER_CABLE_DEVICE_DEVICE:
			return isAppropriate_BWD((Match) arguments.get(0), (Container) arguments.get(1), (Cable) arguments.get(2),
					(Device) arguments.get(3), (Device) arguments.get(4));
		case RulesPackage.XSIMPLEX_CONNECTION_TO_CONNECTION_RULE___PERFORM_BWD__ISAPPLICABLEMATCH:
			return perform_BWD((IsApplicableMatch) arguments.get(0));
		case RulesPackage.XSIMPLEX_CONNECTION_TO_CONNECTION_RULE___IS_APPLICABLE_BWD__MATCH:
			return isApplicable_BWD((Match) arguments.get(0));
		case RulesPackage.XSIMPLEX_CONNECTION_TO_CONNECTION_RULE___REGISTER_OBJECTS_TO_MATCH_BWD__MATCH_CONTAINER_CABLE_DEVICE_DEVICE:
			registerObjectsToMatch_BWD((Match) arguments.get(0), (Container) arguments.get(1), (Cable) arguments.get(2),
					(Device) arguments.get(3), (Device) arguments.get(4));
			return null;
		case RulesPackage.XSIMPLEX_CONNECTION_TO_CONNECTION_RULE___IS_APPROPRIATE_SOLVE_CSP_BWD__MATCH_CONTAINER_CABLE_DEVICE_DEVICE:
			return isAppropriate_solveCsp_BWD((Match) arguments.get(0), (Container) arguments.get(1),
					(Cable) arguments.get(2), (Device) arguments.get(3), (Device) arguments.get(4));
		case RulesPackage.XSIMPLEX_CONNECTION_TO_CONNECTION_RULE___IS_APPROPRIATE_CHECK_CSP_BWD__CSP:
			return isAppropriate_checkCsp_BWD((CSP) arguments.get(0));
		case RulesPackage.XSIMPLEX_CONNECTION_TO_CONNECTION_RULE___IS_APPLICABLE_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_CONTAINER_CABLE_XDEVICE_XCABLE_DEVICE_XDEVICETODEVICE_DEVICE_XDEVICETODEVICE_XCABLETOCABLE_CABLEATTRIBUTES_XCONTAINER_CONNECTIONS_XDEVICE_CONNECTIONS:
			return isApplicable_solveCsp_BWD((IsApplicableMatch) arguments.get(0), (Container) arguments.get(1),
					(Cable) arguments.get(2), (XDevice) arguments.get(3), (XCable) arguments.get(4),
					(Device) arguments.get(5), (XDeviceToDevice) arguments.get(6), (Device) arguments.get(7),
					(XDeviceToDevice) arguments.get(8), (XCableToCable) arguments.get(9),
					(CableAttributes) arguments.get(10), (XContainer) arguments.get(11),
					(Connections) arguments.get(12), (XDevice) arguments.get(13), (Connections) arguments.get(14));
		case RulesPackage.XSIMPLEX_CONNECTION_TO_CONNECTION_RULE___IS_APPLICABLE_CHECK_CSP_BWD__CSP:
			return isApplicable_checkCsp_BWD((CSP) arguments.get(0));
		case RulesPackage.XSIMPLEX_CONNECTION_TO_CONNECTION_RULE___REGISTER_OBJECTS_BWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT:
			registerObjects_BWD((PerformRuleResult) arguments.get(0), (EObject) arguments.get(1),
					(EObject) arguments.get(2), (EObject) arguments.get(3), (EObject) arguments.get(4),
					(EObject) arguments.get(5), (EObject) arguments.get(6), (EObject) arguments.get(7),
					(EObject) arguments.get(8), (EObject) arguments.get(9), (EObject) arguments.get(10),
					(EObject) arguments.get(11), (EObject) arguments.get(12), (EObject) arguments.get(13),
					(EObject) arguments.get(14));
			return null;
		case RulesPackage.XSIMPLEX_CONNECTION_TO_CONNECTION_RULE___CHECK_TYPES_BWD__MATCH:
			return checkTypes_BWD((Match) arguments.get(0));
		case RulesPackage.XSIMPLEX_CONNECTION_TO_CONNECTION_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_10__EMOFLONEDGE:
			return isAppropriate_BWD_EMoflonEdge_10((EMoflonEdge) arguments.get(0));
		case RulesPackage.XSIMPLEX_CONNECTION_TO_CONNECTION_RULE___IS_APPROPRIATE_FWD_EMOFLON_EDGE_6__EMOFLONEDGE:
			return isAppropriate_FWD_EMoflonEdge_6((EMoflonEdge) arguments.get(0));
		case RulesPackage.XSIMPLEX_CONNECTION_TO_CONNECTION_RULE___CHECK_ATTRIBUTES_FWD__TRIPLEMATCH:
			return checkAttributes_FWD((TripleMatch) arguments.get(0));
		case RulesPackage.XSIMPLEX_CONNECTION_TO_CONNECTION_RULE___CHECK_ATTRIBUTES_BWD__TRIPLEMATCH:
			return checkAttributes_BWD((TripleMatch) arguments.get(0));
		case RulesPackage.XSIMPLEX_CONNECTION_TO_CONNECTION_RULE___IS_APPLICABLE_CC__MATCH_MATCH:
			return isApplicable_CC((Match) arguments.get(0), (Match) arguments.get(1));
		case RulesPackage.XSIMPLEX_CONNECTION_TO_CONNECTION_RULE___IS_APPLICABLE_SOLVE_CSP_CC__CONTAINER_CABLE_XDEVICE_XCABLE_DEVICE_DEVICE_CABLEATTRIBUTES_XCONTAINER_CONNECTIONS_XDEVICE_CONNECTIONS_MATCH_MATCH:
			return isApplicable_solveCsp_CC((Container) arguments.get(0), (Cable) arguments.get(1),
					(XDevice) arguments.get(2), (XCable) arguments.get(3), (Device) arguments.get(4),
					(Device) arguments.get(5), (CableAttributes) arguments.get(6), (XContainer) arguments.get(7),
					(Connections) arguments.get(8), (XDevice) arguments.get(9), (Connections) arguments.get(10),
					(Match) arguments.get(11), (Match) arguments.get(12));
		case RulesPackage.XSIMPLEX_CONNECTION_TO_CONNECTION_RULE___IS_APPLICABLE_CHECK_CSP_CC__CSP:
			return isApplicable_checkCsp_CC((CSP) arguments.get(0));
		case RulesPackage.XSIMPLEX_CONNECTION_TO_CONNECTION_RULE___CHECK_DEC_FWD__XDEVICE_XCABLE_CABLEATTRIBUTES_XCONTAINER_CONNECTIONS_XDEVICE_CONNECTIONS:
			return checkDEC_FWD((XDevice) arguments.get(0), (XCable) arguments.get(1),
					(CableAttributes) arguments.get(2), (XContainer) arguments.get(3), (Connections) arguments.get(4),
					(XDevice) arguments.get(5), (Connections) arguments.get(6));
		case RulesPackage.XSIMPLEX_CONNECTION_TO_CONNECTION_RULE___CHECK_DEC_BWD__CONTAINER_CABLE_DEVICE_DEVICE:
			return checkDEC_BWD((Container) arguments.get(0), (Cable) arguments.get(1), (Device) arguments.get(2),
					(Device) arguments.get(3));
		case RulesPackage.XSIMPLEX_CONNECTION_TO_CONNECTION_RULE___GENERATE_MODEL__RULEENTRYCONTAINER_XCABLETOCABLE:
			return generateModel((RuleEntryContainer) arguments.get(0), (XCableToCable) arguments.get(1));
		case RulesPackage.XSIMPLEX_CONNECTION_TO_CONNECTION_RULE___GENERATE_MODEL_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_CONTAINER_CABLE_XDEVICE_XCABLE_DEVICE_XDEVICETODEVICE_DEVICE_XDEVICETODEVICE_XCABLETOCABLE_CABLEATTRIBUTES_XCONTAINER_CONNECTIONS_XDEVICE_CONNECTIONS_MODELGENERATORRULERESULT:
			return generateModel_solveCsp_BWD((IsApplicableMatch) arguments.get(0), (Container) arguments.get(1),
					(Cable) arguments.get(2), (XDevice) arguments.get(3), (XCable) arguments.get(4),
					(Device) arguments.get(5), (XDeviceToDevice) arguments.get(6), (Device) arguments.get(7),
					(XDeviceToDevice) arguments.get(8), (XCableToCable) arguments.get(9),
					(CableAttributes) arguments.get(10), (XContainer) arguments.get(11),
					(Connections) arguments.get(12), (XDevice) arguments.get(13), (Connections) arguments.get(14),
					(ModelgeneratorRuleResult) arguments.get(15));
		case RulesPackage.XSIMPLEX_CONNECTION_TO_CONNECTION_RULE___GENERATE_MODEL_CHECK_CSP_BWD__CSP:
			return generateModel_checkCsp_BWD((CSP) arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
	}

	public static final Object[] pattern_XSimplexConnectionToConnectionRule_0_1_initialbindings_blackBBBBBBBBB(
			XSimplexConnectionToConnectionRule _this, Match match, XDevice xDevice1, XCable xCable,
			CableAttributes cableAttributes, XContainer xContainer, Connections connection1, XDevice xDevice2,
			Connections connection2) {
		if (!xDevice1.equals(xDevice2)) {
			if (!connection1.equals(connection2)) {
				return new Object[] { _this, match, xDevice1, xCable, cableAttributes, xContainer, connection1,
						xDevice2, connection2 };
			}
		}
		return null;
	}

	public static final Object[] pattern_XSimplexConnectionToConnectionRule_0_2_SolveCSP_bindingFBBBBBBBBB(
			XSimplexConnectionToConnectionRule _this, Match match, XDevice xDevice1, XCable xCable,
			CableAttributes cableAttributes, XContainer xContainer, Connections connection1, XDevice xDevice2,
			Connections connection2) {
		CSP _localVariable_0 = _this.isAppropriate_solveCsp_FWD(match, xDevice1, xCable, cableAttributes, xContainer,
				connection1, xDevice2, connection2);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, match, xDevice1, xCable, cableAttributes, xContainer, connection1,
					xDevice2, connection2 };
		}
		return null;
	}

	public static final Object[] pattern_XSimplexConnectionToConnectionRule_0_2_SolveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_XSimplexConnectionToConnectionRule_0_2_SolveCSP_bindingAndBlackFBBBBBBBBB(
			XSimplexConnectionToConnectionRule _this, Match match, XDevice xDevice1, XCable xCable,
			CableAttributes cableAttributes, XContainer xContainer, Connections connection1, XDevice xDevice2,
			Connections connection2) {
		Object[] result_pattern_XSimplexConnectionToConnectionRule_0_2_SolveCSP_binding = pattern_XSimplexConnectionToConnectionRule_0_2_SolveCSP_bindingFBBBBBBBBB(
				_this, match, xDevice1, xCable, cableAttributes, xContainer, connection1, xDevice2, connection2);
		if (result_pattern_XSimplexConnectionToConnectionRule_0_2_SolveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_XSimplexConnectionToConnectionRule_0_2_SolveCSP_binding[0];

			Object[] result_pattern_XSimplexConnectionToConnectionRule_0_2_SolveCSP_black = pattern_XSimplexConnectionToConnectionRule_0_2_SolveCSP_blackB(
					csp);
			if (result_pattern_XSimplexConnectionToConnectionRule_0_2_SolveCSP_black != null) {

				return new Object[] { csp, _this, match, xDevice1, xCable, cableAttributes, xContainer, connection1,
						xDevice2, connection2 };
			}
		}
		return null;
	}

	public static final boolean pattern_XSimplexConnectionToConnectionRule_0_3_CheckCSP_expressionFBB(
			XSimplexConnectionToConnectionRule _this, CSP csp) {
		boolean _localVariable_0 = _this.isAppropriate_checkCsp_FWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_XSimplexConnectionToConnectionRule_0_4_collectelementstobetranslated_blackBBBBBBBB(
			Match match, XDevice xDevice1, XCable xCable, CableAttributes cableAttributes, XContainer xContainer,
			Connections connection1, XDevice xDevice2, Connections connection2) {
		if (!xDevice1.equals(xDevice2)) {
			if (!connection1.equals(connection2)) {
				return new Object[] { match, xDevice1, xCable, cableAttributes, xContainer, connection1, xDevice2,
						connection2 };
			}
		}
		return null;
	}

	public static final Object[] pattern_XSimplexConnectionToConnectionRule_0_4_collectelementstobetranslated_greenBBBBBBBFFFF(
			Match match, XDevice xDevice1, XCable xCable, CableAttributes cableAttributes, Connections connection1,
			XDevice xDevice2, Connections connection2) {
		EMoflonEdge cableAttributes__xDevice1____endPoint1 = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge connection1__xCable____outgoing = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge cableAttributes__xDevice2____endPoint2 = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge connection2__xCable____incoming = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String cableAttributes__xDevice1____endPoint1_name_prime = "endPoint1";
		String connection1__xCable____outgoing_name_prime = "outgoing";
		String cableAttributes__xDevice2____endPoint2_name_prime = "endPoint2";
		String connection2__xCable____incoming_name_prime = "incoming";
		cableAttributes__xDevice1____endPoint1.setSrc(cableAttributes);
		cableAttributes__xDevice1____endPoint1.setTrg(xDevice1);
		match.getToBeTranslatedEdges().add(cableAttributes__xDevice1____endPoint1);
		connection1__xCable____outgoing.setSrc(connection1);
		connection1__xCable____outgoing.setTrg(xCable);
		match.getToBeTranslatedEdges().add(connection1__xCable____outgoing);
		cableAttributes__xDevice2____endPoint2.setSrc(cableAttributes);
		cableAttributes__xDevice2____endPoint2.setTrg(xDevice2);
		match.getToBeTranslatedEdges().add(cableAttributes__xDevice2____endPoint2);
		connection2__xCable____incoming.setSrc(connection2);
		connection2__xCable____incoming.setTrg(xCable);
		match.getToBeTranslatedEdges().add(connection2__xCable____incoming);
		cableAttributes__xDevice1____endPoint1.setName(cableAttributes__xDevice1____endPoint1_name_prime);
		connection1__xCable____outgoing.setName(connection1__xCable____outgoing_name_prime);
		cableAttributes__xDevice2____endPoint2.setName(cableAttributes__xDevice2____endPoint2_name_prime);
		connection2__xCable____incoming.setName(connection2__xCable____incoming_name_prime);
		return new Object[] { match, xDevice1, xCable, cableAttributes, connection1, xDevice2, connection2,
				cableAttributes__xDevice1____endPoint1, connection1__xCable____outgoing,
				cableAttributes__xDevice2____endPoint2, connection2__xCable____incoming };
	}

	public static final Object[] pattern_XSimplexConnectionToConnectionRule_0_5_collectcontextelements_blackBBBBBBBB(
			Match match, XDevice xDevice1, XCable xCable, CableAttributes cableAttributes, XContainer xContainer,
			Connections connection1, XDevice xDevice2, Connections connection2) {
		if (!xDevice1.equals(xDevice2)) {
			if (!connection1.equals(connection2)) {
				return new Object[] { match, xDevice1, xCable, cableAttributes, xContainer, connection1, xDevice2,
						connection2 };
			}
		}
		return null;
	}

	public static final Object[] pattern_XSimplexConnectionToConnectionRule_0_5_collectcontextelements_greenBBBBBBBBFFFFFF(
			Match match, XDevice xDevice1, XCable xCable, CableAttributes cableAttributes, XContainer xContainer,
			Connections connection1, XDevice xDevice2, Connections connection2) {
		EMoflonEdge xDevice1__connection1____connections = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge xCable__cableAttributes____cableAttributes = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge xContainer__xCable____elements = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge xContainer__xDevice2____elements = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge xContainer__xDevice1____elements = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge xDevice2__connection2____connections = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		match.getContextNodes().add(xDevice1);
		match.getContextNodes().add(xCable);
		match.getContextNodes().add(cableAttributes);
		match.getContextNodes().add(xContainer);
		match.getContextNodes().add(connection1);
		match.getContextNodes().add(xDevice2);
		match.getContextNodes().add(connection2);
		String xDevice1__connection1____connections_name_prime = "connections";
		String xCable__cableAttributes____cableAttributes_name_prime = "cableAttributes";
		String xContainer__xCable____elements_name_prime = "elements";
		String xContainer__xDevice2____elements_name_prime = "elements";
		String xContainer__xDevice1____elements_name_prime = "elements";
		String xDevice2__connection2____connections_name_prime = "connections";
		xDevice1__connection1____connections.setSrc(xDevice1);
		xDevice1__connection1____connections.setTrg(connection1);
		match.getContextEdges().add(xDevice1__connection1____connections);
		xCable__cableAttributes____cableAttributes.setSrc(xCable);
		xCable__cableAttributes____cableAttributes.setTrg(cableAttributes);
		match.getContextEdges().add(xCable__cableAttributes____cableAttributes);
		xContainer__xCable____elements.setSrc(xContainer);
		xContainer__xCable____elements.setTrg(xCable);
		match.getContextEdges().add(xContainer__xCable____elements);
		xContainer__xDevice2____elements.setSrc(xContainer);
		xContainer__xDevice2____elements.setTrg(xDevice2);
		match.getContextEdges().add(xContainer__xDevice2____elements);
		xContainer__xDevice1____elements.setSrc(xContainer);
		xContainer__xDevice1____elements.setTrg(xDevice1);
		match.getContextEdges().add(xContainer__xDevice1____elements);
		xDevice2__connection2____connections.setSrc(xDevice2);
		xDevice2__connection2____connections.setTrg(connection2);
		match.getContextEdges().add(xDevice2__connection2____connections);
		xDevice1__connection1____connections.setName(xDevice1__connection1____connections_name_prime);
		xCable__cableAttributes____cableAttributes.setName(xCable__cableAttributes____cableAttributes_name_prime);
		xContainer__xCable____elements.setName(xContainer__xCable____elements_name_prime);
		xContainer__xDevice2____elements.setName(xContainer__xDevice2____elements_name_prime);
		xContainer__xDevice1____elements.setName(xContainer__xDevice1____elements_name_prime);
		xDevice2__connection2____connections.setName(xDevice2__connection2____connections_name_prime);
		return new Object[] { match, xDevice1, xCable, cableAttributes, xContainer, connection1, xDevice2, connection2,
				xDevice1__connection1____connections, xCable__cableAttributes____cableAttributes,
				xContainer__xCable____elements, xContainer__xDevice2____elements, xContainer__xDevice1____elements,
				xDevice2__connection2____connections };
	}

	public static final void pattern_XSimplexConnectionToConnectionRule_0_6_registerobjectstomatch_expressionBBBBBBBBB(
			XSimplexConnectionToConnectionRule _this, Match match, XDevice xDevice1, XCable xCable,
			CableAttributes cableAttributes, XContainer xContainer, Connections connection1, XDevice xDevice2,
			Connections connection2) {
		_this.registerObjectsToMatch_FWD(match, xDevice1, xCable, cableAttributes, xContainer, connection1, xDevice2,
				connection2);

	}

	public static final boolean pattern_XSimplexConnectionToConnectionRule_0_7_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_XSimplexConnectionToConnectionRule_0_8_expressionF() {
		boolean _result = Boolean.valueOf(false);
		return _result;
	}

	public static final Object[] pattern_XSimplexConnectionToConnectionRule_1_1_performtransformation_bindingFFFFFFFFFFFFFFB(
			IsApplicableMatch isApplicableMatch) {
		EObject _localVariable_0 = isApplicableMatch.getObject("container");
		EObject _localVariable_1 = isApplicableMatch.getObject("cable");
		EObject _localVariable_2 = isApplicableMatch.getObject("xDevice1");
		EObject _localVariable_3 = isApplicableMatch.getObject("xCable");
		EObject _localVariable_4 = isApplicableMatch.getObject("device2");
		EObject _localVariable_5 = isApplicableMatch.getObject("xDeviceToDevice2");
		EObject _localVariable_6 = isApplicableMatch.getObject("device1");
		EObject _localVariable_7 = isApplicableMatch.getObject("xDeviceToDevice");
		EObject _localVariable_8 = isApplicableMatch.getObject("xCableToCable");
		EObject _localVariable_9 = isApplicableMatch.getObject("cableAttributes");
		EObject _localVariable_10 = isApplicableMatch.getObject("xContainer");
		EObject _localVariable_11 = isApplicableMatch.getObject("connection1");
		EObject _localVariable_12 = isApplicableMatch.getObject("xDevice2");
		EObject _localVariable_13 = isApplicableMatch.getObject("connection2");
		EObject tmpContainer = _localVariable_0;
		EObject tmpCable = _localVariable_1;
		EObject tmpXDevice1 = _localVariable_2;
		EObject tmpXCable = _localVariable_3;
		EObject tmpDevice2 = _localVariable_4;
		EObject tmpXDeviceToDevice2 = _localVariable_5;
		EObject tmpDevice1 = _localVariable_6;
		EObject tmpXDeviceToDevice = _localVariable_7;
		EObject tmpXCableToCable = _localVariable_8;
		EObject tmpCableAttributes = _localVariable_9;
		EObject tmpXContainer = _localVariable_10;
		EObject tmpConnection1 = _localVariable_11;
		EObject tmpXDevice2 = _localVariable_12;
		EObject tmpConnection2 = _localVariable_13;
		if (tmpContainer instanceof Container) {
			Container container = (Container) tmpContainer;
			if (tmpCable instanceof Cable) {
				Cable cable = (Cable) tmpCable;
				if (tmpXDevice1 instanceof XDevice) {
					XDevice xDevice1 = (XDevice) tmpXDevice1;
					if (tmpXCable instanceof XCable) {
						XCable xCable = (XCable) tmpXCable;
						if (tmpDevice2 instanceof Device) {
							Device device2 = (Device) tmpDevice2;
							if (tmpXDeviceToDevice2 instanceof XDeviceToDevice) {
								XDeviceToDevice xDeviceToDevice2 = (XDeviceToDevice) tmpXDeviceToDevice2;
								if (tmpDevice1 instanceof Device) {
									Device device1 = (Device) tmpDevice1;
									if (tmpXDeviceToDevice instanceof XDeviceToDevice) {
										XDeviceToDevice xDeviceToDevice = (XDeviceToDevice) tmpXDeviceToDevice;
										if (tmpXCableToCable instanceof XCableToCable) {
											XCableToCable xCableToCable = (XCableToCable) tmpXCableToCable;
											if (tmpCableAttributes instanceof CableAttributes) {
												CableAttributes cableAttributes = (CableAttributes) tmpCableAttributes;
												if (tmpXContainer instanceof XContainer) {
													XContainer xContainer = (XContainer) tmpXContainer;
													if (tmpConnection1 instanceof Connections) {
														Connections connection1 = (Connections) tmpConnection1;
														if (tmpXDevice2 instanceof XDevice) {
															XDevice xDevice2 = (XDevice) tmpXDevice2;
															if (tmpConnection2 instanceof Connections) {
																Connections connection2 = (Connections) tmpConnection2;
																return new Object[] { container, cable, xDevice1,
																		xCable, device2, xDeviceToDevice2, device1,
																		xDeviceToDevice, xCableToCable, cableAttributes,
																		xContainer, connection1, xDevice2, connection2,
																		isApplicableMatch };
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

	public static final Object[] pattern_XSimplexConnectionToConnectionRule_1_1_performtransformation_blackBBBBBBBBBBBBBBFBB(
			Container container, Cable cable, XDevice xDevice1, XCable xCable, Device device2,
			XDeviceToDevice xDeviceToDevice2, Device device1, XDeviceToDevice xDeviceToDevice,
			XCableToCable xCableToCable, CableAttributes cableAttributes, XContainer xContainer,
			Connections connection1, XDevice xDevice2, Connections connection2,
			XSimplexConnectionToConnectionRule _this, IsApplicableMatch isApplicableMatch) {
		if (!xDevice1.equals(xDevice2)) {
			if (!device1.equals(device2)) {
				if (!xDeviceToDevice.equals(xDeviceToDevice2)) {
					if (!connection1.equals(connection2)) {
						for (EObject tmpCsp : isApplicableMatch.getAttributeInfo()) {
							if (tmpCsp instanceof CSP) {
								CSP csp = (CSP) tmpCsp;
								return new Object[] { container, cable, xDevice1, xCable, device2, xDeviceToDevice2,
										device1, xDeviceToDevice, xCableToCable, cableAttributes, xContainer,
										connection1, xDevice2, connection2, csp, _this, isApplicableMatch };
							}
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_XSimplexConnectionToConnectionRule_1_1_performtransformation_bindingAndBlackFFFFFFFFFFFFFFFBB(
			XSimplexConnectionToConnectionRule _this, IsApplicableMatch isApplicableMatch) {
		Object[] result_pattern_XSimplexConnectionToConnectionRule_1_1_performtransformation_binding = pattern_XSimplexConnectionToConnectionRule_1_1_performtransformation_bindingFFFFFFFFFFFFFFB(
				isApplicableMatch);
		if (result_pattern_XSimplexConnectionToConnectionRule_1_1_performtransformation_binding != null) {
			Container container = (Container) result_pattern_XSimplexConnectionToConnectionRule_1_1_performtransformation_binding[0];
			Cable cable = (Cable) result_pattern_XSimplexConnectionToConnectionRule_1_1_performtransformation_binding[1];
			XDevice xDevice1 = (XDevice) result_pattern_XSimplexConnectionToConnectionRule_1_1_performtransformation_binding[2];
			XCable xCable = (XCable) result_pattern_XSimplexConnectionToConnectionRule_1_1_performtransformation_binding[3];
			Device device2 = (Device) result_pattern_XSimplexConnectionToConnectionRule_1_1_performtransformation_binding[4];
			XDeviceToDevice xDeviceToDevice2 = (XDeviceToDevice) result_pattern_XSimplexConnectionToConnectionRule_1_1_performtransformation_binding[5];
			Device device1 = (Device) result_pattern_XSimplexConnectionToConnectionRule_1_1_performtransformation_binding[6];
			XDeviceToDevice xDeviceToDevice = (XDeviceToDevice) result_pattern_XSimplexConnectionToConnectionRule_1_1_performtransformation_binding[7];
			XCableToCable xCableToCable = (XCableToCable) result_pattern_XSimplexConnectionToConnectionRule_1_1_performtransformation_binding[8];
			CableAttributes cableAttributes = (CableAttributes) result_pattern_XSimplexConnectionToConnectionRule_1_1_performtransformation_binding[9];
			XContainer xContainer = (XContainer) result_pattern_XSimplexConnectionToConnectionRule_1_1_performtransformation_binding[10];
			Connections connection1 = (Connections) result_pattern_XSimplexConnectionToConnectionRule_1_1_performtransformation_binding[11];
			XDevice xDevice2 = (XDevice) result_pattern_XSimplexConnectionToConnectionRule_1_1_performtransformation_binding[12];
			Connections connection2 = (Connections) result_pattern_XSimplexConnectionToConnectionRule_1_1_performtransformation_binding[13];

			Object[] result_pattern_XSimplexConnectionToConnectionRule_1_1_performtransformation_black = pattern_XSimplexConnectionToConnectionRule_1_1_performtransformation_blackBBBBBBBBBBBBBBFBB(
					container, cable, xDevice1, xCable, device2, xDeviceToDevice2, device1, xDeviceToDevice,
					xCableToCable, cableAttributes, xContainer, connection1, xDevice2, connection2, _this,
					isApplicableMatch);
			if (result_pattern_XSimplexConnectionToConnectionRule_1_1_performtransformation_black != null) {
				CSP csp = (CSP) result_pattern_XSimplexConnectionToConnectionRule_1_1_performtransformation_black[14];

				return new Object[] { container, cable, xDevice1, xCable, device2, xDeviceToDevice2, device1,
						xDeviceToDevice, xCableToCable, cableAttributes, xContainer, connection1, xDevice2, connection2,
						csp, _this, isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_XSimplexConnectionToConnectionRule_1_1_performtransformation_greenBBB(
			Cable cable, Device device2, Device device1) {
		cable.setSource(device1);
		cable.setTarget(device2);
		return new Object[] { cable, device2, device1 };
	}

	public static final Object[] pattern_XSimplexConnectionToConnectionRule_1_2_collecttranslatedelements_greenF() {
		PerformRuleResult ruleresult = RuntimeFactory.eINSTANCE.createPerformRuleResult();
		return new Object[] { ruleresult };
	}

	public static final Object[] pattern_XSimplexConnectionToConnectionRule_1_3_bookkeepingforedges_blackBBBBBBBBBBBBBBB(
			PerformRuleResult ruleresult, EObject container, EObject cable, EObject xDevice1, EObject xCable,
			EObject device2, EObject xDeviceToDevice2, EObject device1, EObject xDeviceToDevice, EObject xCableToCable,
			EObject cableAttributes, EObject xContainer, EObject connection1, EObject xDevice2, EObject connection2) {
		if (!container.equals(xDevice1)) {
			if (!container.equals(xCable)) {
				if (!container.equals(device2)) {
					if (!container.equals(xDeviceToDevice2)) {
						if (!container.equals(device1)) {
							if (!container.equals(xDeviceToDevice)) {
								if (!container.equals(xCableToCable)) {
									if (!container.equals(xContainer)) {
										if (!container.equals(xDevice2)) {
											if (!cable.equals(container)) {
												if (!cable.equals(xDevice1)) {
													if (!cable.equals(xCable)) {
														if (!cable.equals(device2)) {
															if (!cable.equals(xDeviceToDevice2)) {
																if (!cable.equals(device1)) {
																	if (!cable.equals(xDeviceToDevice)) {
																		if (!cable.equals(xCableToCable)) {
																			if (!cable.equals(cableAttributes)) {
																				if (!cable.equals(xContainer)) {
																					if (!cable.equals(connection1)) {
																						if (!cable.equals(xDevice2)) {
																							if (!cable.equals(
																									connection2)) {
																								if (!xDevice1.equals(
																										xDeviceToDevice2)) {
																									if (!xDevice1
																											.equals(xDeviceToDevice)) {
																										if (!xDevice1
																												.equals(xDevice2)) {
																											if (!xCable
																													.equals(xDevice1)) {
																												if (!xCable
																														.equals(xDeviceToDevice2)) {
																													if (!xCable
																															.equals(xDeviceToDevice)) {
																														if (!xCable
																																.equals(xCableToCable)) {
																															if (!xCable
																																	.equals(xContainer)) {
																																if (!xCable
																																		.equals(xDevice2)) {
																																	if (!device2
																																			.equals(xDevice1)) {
																																		if (!device2
																																				.equals(xCable)) {
																																			if (!device2
																																					.equals(xDeviceToDevice2)) {
																																				if (!device2
																																						.equals(xDeviceToDevice)) {
																																					if (!device2
																																							.equals(xCableToCable)) {
																																						if (!device2
																																								.equals(xContainer)) {
																																							if (!device2
																																									.equals(xDevice2)) {
																																								if (!device1
																																										.equals(xDevice1)) {
																																									if (!device1
																																											.equals(xCable)) {
																																										if (!device1
																																												.equals(device2)) {
																																											if (!device1
																																													.equals(xDeviceToDevice2)) {
																																												if (!device1
																																														.equals(xDeviceToDevice)) {
																																													if (!device1
																																															.equals(xCableToCable)) {
																																														if (!device1
																																																.equals(xContainer)) {
																																															if (!device1
																																																	.equals(xDevice2)) {
																																																if (!xDeviceToDevice
																																																		.equals(xDeviceToDevice2)) {
																																																	if (!xCableToCable
																																																			.equals(xDevice1)) {
																																																		if (!xCableToCable
																																																				.equals(xDeviceToDevice2)) {
																																																			if (!xCableToCable
																																																					.equals(xDeviceToDevice)) {
																																																				if (!xCableToCable
																																																						.equals(xContainer)) {
																																																					if (!xCableToCable
																																																							.equals(xDevice2)) {
																																																						if (!cableAttributes
																																																								.equals(container)) {
																																																							if (!cableAttributes
																																																									.equals(xDevice1)) {
																																																								if (!cableAttributes
																																																										.equals(xCable)) {
																																																									if (!cableAttributes
																																																											.equals(device2)) {
																																																										if (!cableAttributes
																																																												.equals(xDeviceToDevice2)) {
																																																											if (!cableAttributes
																																																													.equals(device1)) {
																																																												if (!cableAttributes
																																																														.equals(xDeviceToDevice)) {
																																																													if (!cableAttributes
																																																															.equals(xCableToCable)) {
																																																														if (!cableAttributes
																																																																.equals(xContainer)) {
																																																															if (!cableAttributes
																																																																	.equals(connection1)) {
																																																																if (!cableAttributes
																																																																		.equals(xDevice2)) {
																																																																	if (!cableAttributes
																																																																			.equals(connection2)) {
																																																																		if (!xContainer
																																																																				.equals(xDevice1)) {
																																																																			if (!xContainer
																																																																					.equals(xDeviceToDevice2)) {
																																																																				if (!xContainer
																																																																						.equals(xDeviceToDevice)) {
																																																																					if (!xContainer
																																																																							.equals(xDevice2)) {
																																																																						if (!connection1
																																																																								.equals(container)) {
																																																																							if (!connection1
																																																																									.equals(xDevice1)) {
																																																																								if (!connection1
																																																																										.equals(xCable)) {
																																																																									if (!connection1
																																																																											.equals(device2)) {
																																																																										if (!connection1
																																																																												.equals(xDeviceToDevice2)) {
																																																																											if (!connection1
																																																																													.equals(device1)) {
																																																																												if (!connection1
																																																																														.equals(xDeviceToDevice)) {
																																																																													if (!connection1
																																																																															.equals(xCableToCable)) {
																																																																														if (!connection1
																																																																																.equals(xContainer)) {
																																																																															if (!connection1
																																																																																	.equals(xDevice2)) {
																																																																																if (!connection1
																																																																																		.equals(connection2)) {
																																																																																	if (!xDevice2
																																																																																			.equals(xDeviceToDevice2)) {
																																																																																		if (!xDevice2
																																																																																				.equals(xDeviceToDevice)) {
																																																																																			if (!connection2
																																																																																					.equals(container)) {
																																																																																				if (!connection2
																																																																																						.equals(xDevice1)) {
																																																																																					if (!connection2
																																																																																							.equals(xCable)) {
																																																																																						if (!connection2
																																																																																								.equals(device2)) {
																																																																																							if (!connection2
																																																																																									.equals(xDeviceToDevice2)) {
																																																																																								if (!connection2
																																																																																										.equals(device1)) {
																																																																																									if (!connection2
																																																																																											.equals(xDeviceToDevice)) {
																																																																																										if (!connection2
																																																																																												.equals(xCableToCable)) {
																																																																																											if (!connection2
																																																																																													.equals(xContainer)) {
																																																																																												if (!connection2
																																																																																														.equals(xDevice2)) {
																																																																																													return new Object[] {
																																																																																															ruleresult,
																																																																																															container,
																																																																																															cable,
																																																																																															xDevice1,
																																																																																															xCable,
																																																																																															device2,
																																																																																															xDeviceToDevice2,
																																																																																															device1,
																																																																																															xDeviceToDevice,
																																																																																															xCableToCable,
																																																																																															cableAttributes,
																																																																																															xContainer,
																																																																																															connection1,
																																																																																															xDevice2,
																																																																																															connection2 };
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

	public static final Object[] pattern_XSimplexConnectionToConnectionRule_1_3_bookkeepingforedges_greenBBBBBBBBBBFFFFFFFF(
			PerformRuleResult ruleresult, EObject cable, EObject xDevice1, EObject xCable, EObject device2,
			EObject device1, EObject cableAttributes, EObject connection1, EObject xDevice2, EObject connection2) {
		EMoflonEdge cable__device1____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge device1__cable____outgoing = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge cable__device2____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge device2__cable____incoming = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge cableAttributes__xDevice1____endPoint1 = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge connection1__xCable____outgoing = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge cableAttributes__xDevice2____endPoint2 = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge connection2__xCable____incoming = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String ruleresult_ruleName_prime = "XSimplexConnectionToConnectionRule";
		String cable__device1____source_name_prime = "source";
		String device1__cable____outgoing_name_prime = "outgoing";
		String cable__device2____target_name_prime = "target";
		String device2__cable____incoming_name_prime = "incoming";
		String cableAttributes__xDevice1____endPoint1_name_prime = "endPoint1";
		String connection1__xCable____outgoing_name_prime = "outgoing";
		String cableAttributes__xDevice2____endPoint2_name_prime = "endPoint2";
		String connection2__xCable____incoming_name_prime = "incoming";
		cable__device1____source.setSrc(cable);
		cable__device1____source.setTrg(device1);
		ruleresult.getCreatedEdges().add(cable__device1____source);
		device1__cable____outgoing.setSrc(device1);
		device1__cable____outgoing.setTrg(cable);
		ruleresult.getCreatedEdges().add(device1__cable____outgoing);
		cable__device2____target.setSrc(cable);
		cable__device2____target.setTrg(device2);
		ruleresult.getCreatedEdges().add(cable__device2____target);
		device2__cable____incoming.setSrc(device2);
		device2__cable____incoming.setTrg(cable);
		ruleresult.getCreatedEdges().add(device2__cable____incoming);
		cableAttributes__xDevice1____endPoint1.setSrc(cableAttributes);
		cableAttributes__xDevice1____endPoint1.setTrg(xDevice1);
		ruleresult.getTranslatedEdges().add(cableAttributes__xDevice1____endPoint1);
		connection1__xCable____outgoing.setSrc(connection1);
		connection1__xCable____outgoing.setTrg(xCable);
		ruleresult.getTranslatedEdges().add(connection1__xCable____outgoing);
		cableAttributes__xDevice2____endPoint2.setSrc(cableAttributes);
		cableAttributes__xDevice2____endPoint2.setTrg(xDevice2);
		ruleresult.getTranslatedEdges().add(cableAttributes__xDevice2____endPoint2);
		connection2__xCable____incoming.setSrc(connection2);
		connection2__xCable____incoming.setTrg(xCable);
		ruleresult.getTranslatedEdges().add(connection2__xCable____incoming);
		ruleresult.setRuleName(ruleresult_ruleName_prime);
		cable__device1____source.setName(cable__device1____source_name_prime);
		device1__cable____outgoing.setName(device1__cable____outgoing_name_prime);
		cable__device2____target.setName(cable__device2____target_name_prime);
		device2__cable____incoming.setName(device2__cable____incoming_name_prime);
		cableAttributes__xDevice1____endPoint1.setName(cableAttributes__xDevice1____endPoint1_name_prime);
		connection1__xCable____outgoing.setName(connection1__xCable____outgoing_name_prime);
		cableAttributes__xDevice2____endPoint2.setName(cableAttributes__xDevice2____endPoint2_name_prime);
		connection2__xCable____incoming.setName(connection2__xCable____incoming_name_prime);
		return new Object[] { ruleresult, cable, xDevice1, xCable, device2, device1, cableAttributes, connection1,
				xDevice2, connection2, cable__device1____source, device1__cable____outgoing, cable__device2____target,
				device2__cable____incoming, cableAttributes__xDevice1____endPoint1, connection1__xCable____outgoing,
				cableAttributes__xDevice2____endPoint2, connection2__xCable____incoming };
	}

	public static final void pattern_XSimplexConnectionToConnectionRule_1_5_registerobjects_expressionBBBBBBBBBBBBBBBB(
			XSimplexConnectionToConnectionRule _this, PerformRuleResult ruleresult, EObject container, EObject cable,
			EObject xDevice1, EObject xCable, EObject device2, EObject xDeviceToDevice2, EObject device1,
			EObject xDeviceToDevice, EObject xCableToCable, EObject cableAttributes, EObject xContainer,
			EObject connection1, EObject xDevice2, EObject connection2) {
		_this.registerObjects_FWD(ruleresult, container, cable, xDevice1, xCable, device2, xDeviceToDevice2, device1,
				xDeviceToDevice, xCableToCable, cableAttributes, xContainer, connection1, xDevice2, connection2);

	}

	public static final PerformRuleResult pattern_XSimplexConnectionToConnectionRule_1_6_expressionFB(
			PerformRuleResult ruleresult) {
		PerformRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_XSimplexConnectionToConnectionRule_2_1_preparereturnvalue_bindingFB(
			XSimplexConnectionToConnectionRule _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass eClass = _localVariable_0;
		if (eClass != null) {
			return new Object[] { eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_XSimplexConnectionToConnectionRule_2_1_preparereturnvalue_blackFBB(
			EClass eClass, XSimplexConnectionToConnectionRule _this) {
		for (EOperation performOperation : eClass.getEOperations()) {
			String performOperation_name = performOperation.getName();
			if (performOperation_name.equals("perform_FWD")) {
				return new Object[] { performOperation, eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_XSimplexConnectionToConnectionRule_2_1_preparereturnvalue_bindingAndBlackFFB(
			XSimplexConnectionToConnectionRule _this) {
		Object[] result_pattern_XSimplexConnectionToConnectionRule_2_1_preparereturnvalue_binding = pattern_XSimplexConnectionToConnectionRule_2_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_XSimplexConnectionToConnectionRule_2_1_preparereturnvalue_binding != null) {
			EClass eClass = (EClass) result_pattern_XSimplexConnectionToConnectionRule_2_1_preparereturnvalue_binding[0];

			Object[] result_pattern_XSimplexConnectionToConnectionRule_2_1_preparereturnvalue_black = pattern_XSimplexConnectionToConnectionRule_2_1_preparereturnvalue_blackFBB(
					eClass, _this);
			if (result_pattern_XSimplexConnectionToConnectionRule_2_1_preparereturnvalue_black != null) {
				EOperation performOperation = (EOperation) result_pattern_XSimplexConnectionToConnectionRule_2_1_preparereturnvalue_black[0];

				return new Object[] { performOperation, eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_XSimplexConnectionToConnectionRule_2_1_preparereturnvalue_greenBF(
			EOperation performOperation) {
		IsApplicableRuleResult ruleresult = RuntimeFactory.eINSTANCE.createIsApplicableRuleResult();
		boolean ruleresult_success_prime = Boolean.valueOf(false);
		String ruleresult_rule_prime = "XSimplexConnectionToConnectionRule";
		ruleresult.setPerformOperation(performOperation);
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		ruleresult.setRule(ruleresult_rule_prime);
		return new Object[] { performOperation, ruleresult };
	}

	public static final Object[] pattern_XSimplexConnectionToConnectionRule_2_2_corematch_bindingFFFFFFFB(Match match) {
		EObject _localVariable_0 = match.getObject("xDevice1");
		EObject _localVariable_1 = match.getObject("xCable");
		EObject _localVariable_2 = match.getObject("cableAttributes");
		EObject _localVariable_3 = match.getObject("xContainer");
		EObject _localVariable_4 = match.getObject("connection1");
		EObject _localVariable_5 = match.getObject("xDevice2");
		EObject _localVariable_6 = match.getObject("connection2");
		EObject tmpXDevice1 = _localVariable_0;
		EObject tmpXCable = _localVariable_1;
		EObject tmpCableAttributes = _localVariable_2;
		EObject tmpXContainer = _localVariable_3;
		EObject tmpConnection1 = _localVariable_4;
		EObject tmpXDevice2 = _localVariable_5;
		EObject tmpConnection2 = _localVariable_6;
		if (tmpXDevice1 instanceof XDevice) {
			XDevice xDevice1 = (XDevice) tmpXDevice1;
			if (tmpXCable instanceof XCable) {
				XCable xCable = (XCable) tmpXCable;
				if (tmpCableAttributes instanceof CableAttributes) {
					CableAttributes cableAttributes = (CableAttributes) tmpCableAttributes;
					if (tmpXContainer instanceof XContainer) {
						XContainer xContainer = (XContainer) tmpXContainer;
						if (tmpConnection1 instanceof Connections) {
							Connections connection1 = (Connections) tmpConnection1;
							if (tmpXDevice2 instanceof XDevice) {
								XDevice xDevice2 = (XDevice) tmpXDevice2;
								if (tmpConnection2 instanceof Connections) {
									Connections connection2 = (Connections) tmpConnection2;
									return new Object[] { xDevice1, xCable, cableAttributes, xContainer, connection1,
											xDevice2, connection2, match };
								}
							}
						}
					}
				}
			}
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_XSimplexConnectionToConnectionRule_2_2_corematch_blackFBBFFFFFBBBBBB(
			XDevice xDevice1, XCable xCable, CableAttributes cableAttributes, XContainer xContainer,
			Connections connection1, XDevice xDevice2, Connections connection2, Match match) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (!xDevice1.equals(xDevice2)) {
			if (!connection1.equals(connection2)) {
				boolean cableAttributes_isDuplex = cableAttributes.isIsDuplex();
				if (Boolean.valueOf(cableAttributes_isDuplex).equals(Boolean.valueOf(false))) {
					for (XDeviceToDevice xDeviceToDevice : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(xDevice1, XDeviceToDevice.class, "source")) {
						Device device1 = xDeviceToDevice.getTarget();
						if (device1 != null) {
							for (XCableToCable xCableToCable : org.moflon.core.utilities.eMoflonEMFUtil
									.getOppositeReferenceTyped(xCable, XCableToCable.class, "source")) {
								Cable cable = xCableToCable.getTarget();
								if (cable != null) {
									for (XDeviceToDevice xDeviceToDevice2 : org.moflon.core.utilities.eMoflonEMFUtil
											.getOppositeReferenceTyped(xDevice2, XDeviceToDevice.class, "source")) {
										if (!xDeviceToDevice.equals(xDeviceToDevice2)) {
											Device device2 = xDeviceToDevice2.getTarget();
											if (device2 != null) {
												if (!device1.equals(device2)) {
													_result.add(new Object[] { cable, xDevice1, xCable, device2,
															xDeviceToDevice2, device1, xDeviceToDevice, xCableToCable,
															cableAttributes, xContainer, connection1, xDevice2,
															connection2, match });
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

	public static final Iterable<Object[]> pattern_XSimplexConnectionToConnectionRule_2_3_findcontext_blackFBBBBBBBBBBBBB(
			Cable cable, XDevice xDevice1, XCable xCable, Device device2, XDeviceToDevice xDeviceToDevice2,
			Device device1, XDeviceToDevice xDeviceToDevice, XCableToCable xCableToCable,
			CableAttributes cableAttributes, XContainer xContainer, Connections connection1, XDevice xDevice2,
			Connections connection2) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (!xDevice1.equals(xDevice2)) {
			if (!device1.equals(device2)) {
				if (!xDeviceToDevice.equals(xDeviceToDevice2)) {
					if (!connection1.equals(connection2)) {
						if (connection1.equals(xDevice1.getConnections())) {
							if (cableAttributes.equals(xCable.getCableAttributes())) {
								if (cable.equals(xCableToCable.getTarget())) {
									if (xDevice1.equals(xDeviceToDevice.getSource())) {
										if (xCable.equals(xCableToCable.getSource())) {
											if (device1.equals(xDeviceToDevice.getTarget())) {
												if (xContainer.getElements().contains(xCable)) {
													if (xContainer.getElements().contains(xDevice2)) {
														if (xDevice1.equals(cableAttributes.getEndPoint1())) {
															if (xContainer.getElements().contains(xDevice1)) {
																if (connection1.getOutgoing().contains(xCable)) {
																	if (device2.equals(xDeviceToDevice2.getTarget())) {
																		if (xDevice2
																				.equals(xDeviceToDevice2.getSource())) {
																			if (xDevice2.equals(
																					cableAttributes.getEndPoint2())) {
																				if (connection2.equals(
																						xDevice2.getConnections())) {
																					if (connection2.getIncoming()
																							.contains(xCable)) {
																						boolean cableAttributes_isDuplex = cableAttributes
																								.isIsDuplex();
																						if (Boolean
																								.valueOf(
																										cableAttributes_isDuplex)
																								.equals(Boolean.valueOf(
																										false))) {
																							for (Container container : org.moflon.core.utilities.eMoflonEMFUtil
																									.getOppositeReferenceTyped(
																											cable,
																											Container.class,
																											"cables")) {
																								if (container
																										.getDevices()
																										.contains(
																												device1)) {
																									if (container
																											.getDevices()
																											.contains(
																													device2)) {
																										_result.add(
																												new Object[] {
																														container,
																														cable,
																														xDevice1,
																														xCable,
																														device2,
																														xDeviceToDevice2,
																														device1,
																														xDeviceToDevice,
																														xCableToCable,
																														cableAttributes,
																														xContainer,
																														connection1,
																														xDevice2,
																														connection2 });
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
		return _result;
	}

	public static final Object[] pattern_XSimplexConnectionToConnectionRule_2_3_findcontext_greenBBBBBBBBBBBBBBFFFFFFFFFFFFFFFFFFFF(
			Container container, Cable cable, XDevice xDevice1, XCable xCable, Device device2,
			XDeviceToDevice xDeviceToDevice2, Device device1, XDeviceToDevice xDeviceToDevice,
			XCableToCable xCableToCable, CableAttributes cableAttributes, XContainer xContainer,
			Connections connection1, XDevice xDevice2, Connections connection2) {
		IsApplicableMatch isApplicableMatch = RuntimeFactory.eINSTANCE.createIsApplicableMatch();
		EMoflonEdge xDevice1__connection1____connections = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge xCable__cableAttributes____cableAttributes = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge container__cable____cables = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge container__device1____devices = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge xCableToCable__cable____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge container__device2____devices = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge xDeviceToDevice__xDevice1____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge xCableToCable__xCable____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge xDeviceToDevice__device1____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge xContainer__xCable____elements = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge xContainer__xDevice2____elements = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge cableAttributes__xDevice1____endPoint1 = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge xContainer__xDevice1____elements = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge connection1__xCable____outgoing = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge xDeviceToDevice2__device2____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge xDeviceToDevice2__xDevice2____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge cableAttributes__xDevice2____endPoint2 = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge xDevice2__connection2____connections = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge connection2__xCable____incoming = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String xDevice1__connection1____connections_name_prime = "connections";
		String xCable__cableAttributes____cableAttributes_name_prime = "cableAttributes";
		String container__cable____cables_name_prime = "cables";
		String container__device1____devices_name_prime = "devices";
		String xCableToCable__cable____target_name_prime = "target";
		String container__device2____devices_name_prime = "devices";
		String xDeviceToDevice__xDevice1____source_name_prime = "source";
		String xCableToCable__xCable____source_name_prime = "source";
		String xDeviceToDevice__device1____target_name_prime = "target";
		String xContainer__xCable____elements_name_prime = "elements";
		String xContainer__xDevice2____elements_name_prime = "elements";
		String cableAttributes__xDevice1____endPoint1_name_prime = "endPoint1";
		String xContainer__xDevice1____elements_name_prime = "elements";
		String connection1__xCable____outgoing_name_prime = "outgoing";
		String xDeviceToDevice2__device2____target_name_prime = "target";
		String xDeviceToDevice2__xDevice2____source_name_prime = "source";
		String cableAttributes__xDevice2____endPoint2_name_prime = "endPoint2";
		String xDevice2__connection2____connections_name_prime = "connections";
		String connection2__xCable____incoming_name_prime = "incoming";
		isApplicableMatch.getAllContextElements().add(container);
		isApplicableMatch.getAllContextElements().add(cable);
		isApplicableMatch.getAllContextElements().add(xDevice1);
		isApplicableMatch.getAllContextElements().add(xCable);
		isApplicableMatch.getAllContextElements().add(device2);
		isApplicableMatch.getAllContextElements().add(xDeviceToDevice2);
		isApplicableMatch.getAllContextElements().add(device1);
		isApplicableMatch.getAllContextElements().add(xDeviceToDevice);
		isApplicableMatch.getAllContextElements().add(xCableToCable);
		isApplicableMatch.getAllContextElements().add(cableAttributes);
		isApplicableMatch.getAllContextElements().add(xContainer);
		isApplicableMatch.getAllContextElements().add(connection1);
		isApplicableMatch.getAllContextElements().add(xDevice2);
		isApplicableMatch.getAllContextElements().add(connection2);
		xDevice1__connection1____connections.setSrc(xDevice1);
		xDevice1__connection1____connections.setTrg(connection1);
		isApplicableMatch.getAllContextElements().add(xDevice1__connection1____connections);
		xCable__cableAttributes____cableAttributes.setSrc(xCable);
		xCable__cableAttributes____cableAttributes.setTrg(cableAttributes);
		isApplicableMatch.getAllContextElements().add(xCable__cableAttributes____cableAttributes);
		container__cable____cables.setSrc(container);
		container__cable____cables.setTrg(cable);
		isApplicableMatch.getAllContextElements().add(container__cable____cables);
		container__device1____devices.setSrc(container);
		container__device1____devices.setTrg(device1);
		isApplicableMatch.getAllContextElements().add(container__device1____devices);
		xCableToCable__cable____target.setSrc(xCableToCable);
		xCableToCable__cable____target.setTrg(cable);
		isApplicableMatch.getAllContextElements().add(xCableToCable__cable____target);
		container__device2____devices.setSrc(container);
		container__device2____devices.setTrg(device2);
		isApplicableMatch.getAllContextElements().add(container__device2____devices);
		xDeviceToDevice__xDevice1____source.setSrc(xDeviceToDevice);
		xDeviceToDevice__xDevice1____source.setTrg(xDevice1);
		isApplicableMatch.getAllContextElements().add(xDeviceToDevice__xDevice1____source);
		xCableToCable__xCable____source.setSrc(xCableToCable);
		xCableToCable__xCable____source.setTrg(xCable);
		isApplicableMatch.getAllContextElements().add(xCableToCable__xCable____source);
		xDeviceToDevice__device1____target.setSrc(xDeviceToDevice);
		xDeviceToDevice__device1____target.setTrg(device1);
		isApplicableMatch.getAllContextElements().add(xDeviceToDevice__device1____target);
		xContainer__xCable____elements.setSrc(xContainer);
		xContainer__xCable____elements.setTrg(xCable);
		isApplicableMatch.getAllContextElements().add(xContainer__xCable____elements);
		xContainer__xDevice2____elements.setSrc(xContainer);
		xContainer__xDevice2____elements.setTrg(xDevice2);
		isApplicableMatch.getAllContextElements().add(xContainer__xDevice2____elements);
		cableAttributes__xDevice1____endPoint1.setSrc(cableAttributes);
		cableAttributes__xDevice1____endPoint1.setTrg(xDevice1);
		isApplicableMatch.getAllContextElements().add(cableAttributes__xDevice1____endPoint1);
		xContainer__xDevice1____elements.setSrc(xContainer);
		xContainer__xDevice1____elements.setTrg(xDevice1);
		isApplicableMatch.getAllContextElements().add(xContainer__xDevice1____elements);
		connection1__xCable____outgoing.setSrc(connection1);
		connection1__xCable____outgoing.setTrg(xCable);
		isApplicableMatch.getAllContextElements().add(connection1__xCable____outgoing);
		xDeviceToDevice2__device2____target.setSrc(xDeviceToDevice2);
		xDeviceToDevice2__device2____target.setTrg(device2);
		isApplicableMatch.getAllContextElements().add(xDeviceToDevice2__device2____target);
		xDeviceToDevice2__xDevice2____source.setSrc(xDeviceToDevice2);
		xDeviceToDevice2__xDevice2____source.setTrg(xDevice2);
		isApplicableMatch.getAllContextElements().add(xDeviceToDevice2__xDevice2____source);
		cableAttributes__xDevice2____endPoint2.setSrc(cableAttributes);
		cableAttributes__xDevice2____endPoint2.setTrg(xDevice2);
		isApplicableMatch.getAllContextElements().add(cableAttributes__xDevice2____endPoint2);
		xDevice2__connection2____connections.setSrc(xDevice2);
		xDevice2__connection2____connections.setTrg(connection2);
		isApplicableMatch.getAllContextElements().add(xDevice2__connection2____connections);
		connection2__xCable____incoming.setSrc(connection2);
		connection2__xCable____incoming.setTrg(xCable);
		isApplicableMatch.getAllContextElements().add(connection2__xCable____incoming);
		xDevice1__connection1____connections.setName(xDevice1__connection1____connections_name_prime);
		xCable__cableAttributes____cableAttributes.setName(xCable__cableAttributes____cableAttributes_name_prime);
		container__cable____cables.setName(container__cable____cables_name_prime);
		container__device1____devices.setName(container__device1____devices_name_prime);
		xCableToCable__cable____target.setName(xCableToCable__cable____target_name_prime);
		container__device2____devices.setName(container__device2____devices_name_prime);
		xDeviceToDevice__xDevice1____source.setName(xDeviceToDevice__xDevice1____source_name_prime);
		xCableToCable__xCable____source.setName(xCableToCable__xCable____source_name_prime);
		xDeviceToDevice__device1____target.setName(xDeviceToDevice__device1____target_name_prime);
		xContainer__xCable____elements.setName(xContainer__xCable____elements_name_prime);
		xContainer__xDevice2____elements.setName(xContainer__xDevice2____elements_name_prime);
		cableAttributes__xDevice1____endPoint1.setName(cableAttributes__xDevice1____endPoint1_name_prime);
		xContainer__xDevice1____elements.setName(xContainer__xDevice1____elements_name_prime);
		connection1__xCable____outgoing.setName(connection1__xCable____outgoing_name_prime);
		xDeviceToDevice2__device2____target.setName(xDeviceToDevice2__device2____target_name_prime);
		xDeviceToDevice2__xDevice2____source.setName(xDeviceToDevice2__xDevice2____source_name_prime);
		cableAttributes__xDevice2____endPoint2.setName(cableAttributes__xDevice2____endPoint2_name_prime);
		xDevice2__connection2____connections.setName(xDevice2__connection2____connections_name_prime);
		connection2__xCable____incoming.setName(connection2__xCable____incoming_name_prime);
		return new Object[] { container, cable, xDevice1, xCable, device2, xDeviceToDevice2, device1, xDeviceToDevice,
				xCableToCable, cableAttributes, xContainer, connection1, xDevice2, connection2, isApplicableMatch,
				xDevice1__connection1____connections, xCable__cableAttributes____cableAttributes,
				container__cable____cables, container__device1____devices, xCableToCable__cable____target,
				container__device2____devices, xDeviceToDevice__xDevice1____source, xCableToCable__xCable____source,
				xDeviceToDevice__device1____target, xContainer__xCable____elements, xContainer__xDevice2____elements,
				cableAttributes__xDevice1____endPoint1, xContainer__xDevice1____elements,
				connection1__xCable____outgoing, xDeviceToDevice2__device2____target,
				xDeviceToDevice2__xDevice2____source, cableAttributes__xDevice2____endPoint2,
				xDevice2__connection2____connections, connection2__xCable____incoming };
	}

	public static final Object[] pattern_XSimplexConnectionToConnectionRule_2_4_solveCSP_bindingFBBBBBBBBBBBBBBBB(
			XSimplexConnectionToConnectionRule _this, IsApplicableMatch isApplicableMatch, Container container,
			Cable cable, XDevice xDevice1, XCable xCable, Device device2, XDeviceToDevice xDeviceToDevice2,
			Device device1, XDeviceToDevice xDeviceToDevice, XCableToCable xCableToCable,
			CableAttributes cableAttributes, XContainer xContainer, Connections connection1, XDevice xDevice2,
			Connections connection2) {
		CSP _localVariable_0 = _this.isApplicable_solveCsp_FWD(isApplicableMatch, container, cable, xDevice1, xCable,
				device2, xDeviceToDevice2, device1, xDeviceToDevice, xCableToCable, cableAttributes, xContainer,
				connection1, xDevice2, connection2);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, container, cable, xDevice1, xCable, device2,
					xDeviceToDevice2, device1, xDeviceToDevice, xCableToCable, cableAttributes, xContainer, connection1,
					xDevice2, connection2 };
		}
		return null;
	}

	public static final Object[] pattern_XSimplexConnectionToConnectionRule_2_4_solveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_XSimplexConnectionToConnectionRule_2_4_solveCSP_bindingAndBlackFBBBBBBBBBBBBBBBB(
			XSimplexConnectionToConnectionRule _this, IsApplicableMatch isApplicableMatch, Container container,
			Cable cable, XDevice xDevice1, XCable xCable, Device device2, XDeviceToDevice xDeviceToDevice2,
			Device device1, XDeviceToDevice xDeviceToDevice, XCableToCable xCableToCable,
			CableAttributes cableAttributes, XContainer xContainer, Connections connection1, XDevice xDevice2,
			Connections connection2) {
		Object[] result_pattern_XSimplexConnectionToConnectionRule_2_4_solveCSP_binding = pattern_XSimplexConnectionToConnectionRule_2_4_solveCSP_bindingFBBBBBBBBBBBBBBBB(
				_this, isApplicableMatch, container, cable, xDevice1, xCable, device2, xDeviceToDevice2, device1,
				xDeviceToDevice, xCableToCable, cableAttributes, xContainer, connection1, xDevice2, connection2);
		if (result_pattern_XSimplexConnectionToConnectionRule_2_4_solveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_XSimplexConnectionToConnectionRule_2_4_solveCSP_binding[0];

			Object[] result_pattern_XSimplexConnectionToConnectionRule_2_4_solveCSP_black = pattern_XSimplexConnectionToConnectionRule_2_4_solveCSP_blackB(
					csp);
			if (result_pattern_XSimplexConnectionToConnectionRule_2_4_solveCSP_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, container, cable, xDevice1, xCable, device2,
						xDeviceToDevice2, device1, xDeviceToDevice, xCableToCable, cableAttributes, xContainer,
						connection1, xDevice2, connection2 };
			}
		}
		return null;
	}

	public static final boolean pattern_XSimplexConnectionToConnectionRule_2_5_checkCSP_expressionFBB(
			XSimplexConnectionToConnectionRule _this, CSP csp) {
		boolean _localVariable_0 = _this.isApplicable_checkCsp_FWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_XSimplexConnectionToConnectionRule_2_6_addmatchtoruleresult_blackBB(
			IsApplicableRuleResult ruleresult, IsApplicableMatch isApplicableMatch) {
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final Object[] pattern_XSimplexConnectionToConnectionRule_2_6_addmatchtoruleresult_greenBB(
			IsApplicableRuleResult ruleresult, IsApplicableMatch isApplicableMatch) {
		ruleresult.getIsApplicableMatch().add(isApplicableMatch);
		boolean ruleresult_success_prime = Boolean.valueOf(true);
		String isApplicableMatch_ruleName_prime = "XSimplexConnectionToConnectionRule";
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		isApplicableMatch.setRuleName(isApplicableMatch_ruleName_prime);
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final IsApplicableRuleResult pattern_XSimplexConnectionToConnectionRule_2_7_expressionFB(
			IsApplicableRuleResult ruleresult) {
		IsApplicableRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_XSimplexConnectionToConnectionRule_10_1_initialbindings_blackBBBBBB(
			XSimplexConnectionToConnectionRule _this, Match match, Container container, Cable cable, Device device2,
			Device device1) {
		if (!device1.equals(device2)) {
			return new Object[] { _this, match, container, cable, device2, device1 };
		}
		return null;
	}

	public static final Object[] pattern_XSimplexConnectionToConnectionRule_10_2_SolveCSP_bindingFBBBBBB(
			XSimplexConnectionToConnectionRule _this, Match match, Container container, Cable cable, Device device2,
			Device device1) {
		CSP _localVariable_0 = _this.isAppropriate_solveCsp_BWD(match, container, cable, device2, device1);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, match, container, cable, device2, device1 };
		}
		return null;
	}

	public static final Object[] pattern_XSimplexConnectionToConnectionRule_10_2_SolveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_XSimplexConnectionToConnectionRule_10_2_SolveCSP_bindingAndBlackFBBBBBB(
			XSimplexConnectionToConnectionRule _this, Match match, Container container, Cable cable, Device device2,
			Device device1) {
		Object[] result_pattern_XSimplexConnectionToConnectionRule_10_2_SolveCSP_binding = pattern_XSimplexConnectionToConnectionRule_10_2_SolveCSP_bindingFBBBBBB(
				_this, match, container, cable, device2, device1);
		if (result_pattern_XSimplexConnectionToConnectionRule_10_2_SolveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_XSimplexConnectionToConnectionRule_10_2_SolveCSP_binding[0];

			Object[] result_pattern_XSimplexConnectionToConnectionRule_10_2_SolveCSP_black = pattern_XSimplexConnectionToConnectionRule_10_2_SolveCSP_blackB(
					csp);
			if (result_pattern_XSimplexConnectionToConnectionRule_10_2_SolveCSP_black != null) {

				return new Object[] { csp, _this, match, container, cable, device2, device1 };
			}
		}
		return null;
	}

	public static final boolean pattern_XSimplexConnectionToConnectionRule_10_3_CheckCSP_expressionFBB(
			XSimplexConnectionToConnectionRule _this, CSP csp) {
		boolean _localVariable_0 = _this.isAppropriate_checkCsp_BWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_XSimplexConnectionToConnectionRule_10_4_collectelementstobetranslated_blackBBBBB(
			Match match, Container container, Cable cable, Device device2, Device device1) {
		if (!device1.equals(device2)) {
			return new Object[] { match, container, cable, device2, device1 };
		}
		return null;
	}

	public static final Object[] pattern_XSimplexConnectionToConnectionRule_10_4_collectelementstobetranslated_greenBBBBFFFF(
			Match match, Cable cable, Device device2, Device device1) {
		EMoflonEdge cable__device1____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge device1__cable____outgoing = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge cable__device2____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge device2__cable____incoming = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String cable__device1____source_name_prime = "source";
		String device1__cable____outgoing_name_prime = "outgoing";
		String cable__device2____target_name_prime = "target";
		String device2__cable____incoming_name_prime = "incoming";
		cable__device1____source.setSrc(cable);
		cable__device1____source.setTrg(device1);
		match.getToBeTranslatedEdges().add(cable__device1____source);
		device1__cable____outgoing.setSrc(device1);
		device1__cable____outgoing.setTrg(cable);
		match.getToBeTranslatedEdges().add(device1__cable____outgoing);
		cable__device2____target.setSrc(cable);
		cable__device2____target.setTrg(device2);
		match.getToBeTranslatedEdges().add(cable__device2____target);
		device2__cable____incoming.setSrc(device2);
		device2__cable____incoming.setTrg(cable);
		match.getToBeTranslatedEdges().add(device2__cable____incoming);
		cable__device1____source.setName(cable__device1____source_name_prime);
		device1__cable____outgoing.setName(device1__cable____outgoing_name_prime);
		cable__device2____target.setName(cable__device2____target_name_prime);
		device2__cable____incoming.setName(device2__cable____incoming_name_prime);
		return new Object[] { match, cable, device2, device1, cable__device1____source, device1__cable____outgoing,
				cable__device2____target, device2__cable____incoming };
	}

	public static final Object[] pattern_XSimplexConnectionToConnectionRule_10_5_collectcontextelements_blackBBBBB(
			Match match, Container container, Cable cable, Device device2, Device device1) {
		if (!device1.equals(device2)) {
			return new Object[] { match, container, cable, device2, device1 };
		}
		return null;
	}

	public static final Object[] pattern_XSimplexConnectionToConnectionRule_10_5_collectcontextelements_greenBBBBBFFF(
			Match match, Container container, Cable cable, Device device2, Device device1) {
		EMoflonEdge container__cable____cables = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge container__device1____devices = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge container__device2____devices = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		match.getContextNodes().add(container);
		match.getContextNodes().add(cable);
		match.getContextNodes().add(device2);
		match.getContextNodes().add(device1);
		String container__cable____cables_name_prime = "cables";
		String container__device1____devices_name_prime = "devices";
		String container__device2____devices_name_prime = "devices";
		container__cable____cables.setSrc(container);
		container__cable____cables.setTrg(cable);
		match.getContextEdges().add(container__cable____cables);
		container__device1____devices.setSrc(container);
		container__device1____devices.setTrg(device1);
		match.getContextEdges().add(container__device1____devices);
		container__device2____devices.setSrc(container);
		container__device2____devices.setTrg(device2);
		match.getContextEdges().add(container__device2____devices);
		container__cable____cables.setName(container__cable____cables_name_prime);
		container__device1____devices.setName(container__device1____devices_name_prime);
		container__device2____devices.setName(container__device2____devices_name_prime);
		return new Object[] { match, container, cable, device2, device1, container__cable____cables,
				container__device1____devices, container__device2____devices };
	}

	public static final void pattern_XSimplexConnectionToConnectionRule_10_6_registerobjectstomatch_expressionBBBBBB(
			XSimplexConnectionToConnectionRule _this, Match match, Container container, Cable cable, Device device2,
			Device device1) {
		_this.registerObjectsToMatch_BWD(match, container, cable, device2, device1);

	}

	public static final boolean pattern_XSimplexConnectionToConnectionRule_10_7_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_XSimplexConnectionToConnectionRule_10_8_expressionF() {
		boolean _result = Boolean.valueOf(false);
		return _result;
	}

	public static final Object[] pattern_XSimplexConnectionToConnectionRule_11_1_performtransformation_bindingFFFFFFFFFFFFFFB(
			IsApplicableMatch isApplicableMatch) {
		EObject _localVariable_0 = isApplicableMatch.getObject("container");
		EObject _localVariable_1 = isApplicableMatch.getObject("cable");
		EObject _localVariable_2 = isApplicableMatch.getObject("xDevice1");
		EObject _localVariable_3 = isApplicableMatch.getObject("xCable");
		EObject _localVariable_4 = isApplicableMatch.getObject("device2");
		EObject _localVariable_5 = isApplicableMatch.getObject("xDeviceToDevice2");
		EObject _localVariable_6 = isApplicableMatch.getObject("device1");
		EObject _localVariable_7 = isApplicableMatch.getObject("xDeviceToDevice");
		EObject _localVariable_8 = isApplicableMatch.getObject("xCableToCable");
		EObject _localVariable_9 = isApplicableMatch.getObject("cableAttributes");
		EObject _localVariable_10 = isApplicableMatch.getObject("xContainer");
		EObject _localVariable_11 = isApplicableMatch.getObject("connection1");
		EObject _localVariable_12 = isApplicableMatch.getObject("xDevice2");
		EObject _localVariable_13 = isApplicableMatch.getObject("connection2");
		EObject tmpContainer = _localVariable_0;
		EObject tmpCable = _localVariable_1;
		EObject tmpXDevice1 = _localVariable_2;
		EObject tmpXCable = _localVariable_3;
		EObject tmpDevice2 = _localVariable_4;
		EObject tmpXDeviceToDevice2 = _localVariable_5;
		EObject tmpDevice1 = _localVariable_6;
		EObject tmpXDeviceToDevice = _localVariable_7;
		EObject tmpXCableToCable = _localVariable_8;
		EObject tmpCableAttributes = _localVariable_9;
		EObject tmpXContainer = _localVariable_10;
		EObject tmpConnection1 = _localVariable_11;
		EObject tmpXDevice2 = _localVariable_12;
		EObject tmpConnection2 = _localVariable_13;
		if (tmpContainer instanceof Container) {
			Container container = (Container) tmpContainer;
			if (tmpCable instanceof Cable) {
				Cable cable = (Cable) tmpCable;
				if (tmpXDevice1 instanceof XDevice) {
					XDevice xDevice1 = (XDevice) tmpXDevice1;
					if (tmpXCable instanceof XCable) {
						XCable xCable = (XCable) tmpXCable;
						if (tmpDevice2 instanceof Device) {
							Device device2 = (Device) tmpDevice2;
							if (tmpXDeviceToDevice2 instanceof XDeviceToDevice) {
								XDeviceToDevice xDeviceToDevice2 = (XDeviceToDevice) tmpXDeviceToDevice2;
								if (tmpDevice1 instanceof Device) {
									Device device1 = (Device) tmpDevice1;
									if (tmpXDeviceToDevice instanceof XDeviceToDevice) {
										XDeviceToDevice xDeviceToDevice = (XDeviceToDevice) tmpXDeviceToDevice;
										if (tmpXCableToCable instanceof XCableToCable) {
											XCableToCable xCableToCable = (XCableToCable) tmpXCableToCable;
											if (tmpCableAttributes instanceof CableAttributes) {
												CableAttributes cableAttributes = (CableAttributes) tmpCableAttributes;
												if (tmpXContainer instanceof XContainer) {
													XContainer xContainer = (XContainer) tmpXContainer;
													if (tmpConnection1 instanceof Connections) {
														Connections connection1 = (Connections) tmpConnection1;
														if (tmpXDevice2 instanceof XDevice) {
															XDevice xDevice2 = (XDevice) tmpXDevice2;
															if (tmpConnection2 instanceof Connections) {
																Connections connection2 = (Connections) tmpConnection2;
																return new Object[] { container, cable, xDevice1,
																		xCable, device2, xDeviceToDevice2, device1,
																		xDeviceToDevice, xCableToCable, cableAttributes,
																		xContainer, connection1, xDevice2, connection2,
																		isApplicableMatch };
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

	public static final Object[] pattern_XSimplexConnectionToConnectionRule_11_1_performtransformation_blackBBBBBBBBBBBBBBFBB(
			Container container, Cable cable, XDevice xDevice1, XCable xCable, Device device2,
			XDeviceToDevice xDeviceToDevice2, Device device1, XDeviceToDevice xDeviceToDevice,
			XCableToCable xCableToCable, CableAttributes cableAttributes, XContainer xContainer,
			Connections connection1, XDevice xDevice2, Connections connection2,
			XSimplexConnectionToConnectionRule _this, IsApplicableMatch isApplicableMatch) {
		if (!xDevice1.equals(xDevice2)) {
			if (!device1.equals(device2)) {
				if (!xDeviceToDevice.equals(xDeviceToDevice2)) {
					if (!connection1.equals(connection2)) {
						for (EObject tmpCsp : isApplicableMatch.getAttributeInfo()) {
							if (tmpCsp instanceof CSP) {
								CSP csp = (CSP) tmpCsp;
								return new Object[] { container, cable, xDevice1, xCable, device2, xDeviceToDevice2,
										device1, xDeviceToDevice, xCableToCable, cableAttributes, xContainer,
										connection1, xDevice2, connection2, csp, _this, isApplicableMatch };
							}
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_XSimplexConnectionToConnectionRule_11_1_performtransformation_bindingAndBlackFFFFFFFFFFFFFFFBB(
			XSimplexConnectionToConnectionRule _this, IsApplicableMatch isApplicableMatch) {
		Object[] result_pattern_XSimplexConnectionToConnectionRule_11_1_performtransformation_binding = pattern_XSimplexConnectionToConnectionRule_11_1_performtransformation_bindingFFFFFFFFFFFFFFB(
				isApplicableMatch);
		if (result_pattern_XSimplexConnectionToConnectionRule_11_1_performtransformation_binding != null) {
			Container container = (Container) result_pattern_XSimplexConnectionToConnectionRule_11_1_performtransformation_binding[0];
			Cable cable = (Cable) result_pattern_XSimplexConnectionToConnectionRule_11_1_performtransformation_binding[1];
			XDevice xDevice1 = (XDevice) result_pattern_XSimplexConnectionToConnectionRule_11_1_performtransformation_binding[2];
			XCable xCable = (XCable) result_pattern_XSimplexConnectionToConnectionRule_11_1_performtransformation_binding[3];
			Device device2 = (Device) result_pattern_XSimplexConnectionToConnectionRule_11_1_performtransformation_binding[4];
			XDeviceToDevice xDeviceToDevice2 = (XDeviceToDevice) result_pattern_XSimplexConnectionToConnectionRule_11_1_performtransformation_binding[5];
			Device device1 = (Device) result_pattern_XSimplexConnectionToConnectionRule_11_1_performtransformation_binding[6];
			XDeviceToDevice xDeviceToDevice = (XDeviceToDevice) result_pattern_XSimplexConnectionToConnectionRule_11_1_performtransformation_binding[7];
			XCableToCable xCableToCable = (XCableToCable) result_pattern_XSimplexConnectionToConnectionRule_11_1_performtransformation_binding[8];
			CableAttributes cableAttributes = (CableAttributes) result_pattern_XSimplexConnectionToConnectionRule_11_1_performtransformation_binding[9];
			XContainer xContainer = (XContainer) result_pattern_XSimplexConnectionToConnectionRule_11_1_performtransformation_binding[10];
			Connections connection1 = (Connections) result_pattern_XSimplexConnectionToConnectionRule_11_1_performtransformation_binding[11];
			XDevice xDevice2 = (XDevice) result_pattern_XSimplexConnectionToConnectionRule_11_1_performtransformation_binding[12];
			Connections connection2 = (Connections) result_pattern_XSimplexConnectionToConnectionRule_11_1_performtransformation_binding[13];

			Object[] result_pattern_XSimplexConnectionToConnectionRule_11_1_performtransformation_black = pattern_XSimplexConnectionToConnectionRule_11_1_performtransformation_blackBBBBBBBBBBBBBBFBB(
					container, cable, xDevice1, xCable, device2, xDeviceToDevice2, device1, xDeviceToDevice,
					xCableToCable, cableAttributes, xContainer, connection1, xDevice2, connection2, _this,
					isApplicableMatch);
			if (result_pattern_XSimplexConnectionToConnectionRule_11_1_performtransformation_black != null) {
				CSP csp = (CSP) result_pattern_XSimplexConnectionToConnectionRule_11_1_performtransformation_black[14];

				return new Object[] { container, cable, xDevice1, xCable, device2, xDeviceToDevice2, device1,
						xDeviceToDevice, xCableToCable, cableAttributes, xContainer, connection1, xDevice2, connection2,
						csp, _this, isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_XSimplexConnectionToConnectionRule_11_1_performtransformation_greenBBBBBB(
			XDevice xDevice1, XCable xCable, CableAttributes cableAttributes, Connections connection1, XDevice xDevice2,
			Connections connection2) {
		cableAttributes.setEndPoint1(xDevice1);
		connection1.getOutgoing().add(xCable);
		cableAttributes.setEndPoint2(xDevice2);
		connection2.getIncoming().add(xCable);
		boolean cableAttributes_isDuplex_prime = Boolean.valueOf(false);
		cableAttributes.setIsDuplex(Boolean.valueOf(cableAttributes_isDuplex_prime));
		return new Object[] { xDevice1, xCable, cableAttributes, connection1, xDevice2, connection2 };
	}

	public static final Object[] pattern_XSimplexConnectionToConnectionRule_11_2_collecttranslatedelements_greenF() {
		PerformRuleResult ruleresult = RuntimeFactory.eINSTANCE.createPerformRuleResult();
		return new Object[] { ruleresult };
	}

	public static final Object[] pattern_XSimplexConnectionToConnectionRule_11_3_bookkeepingforedges_blackBBBBBBBBBBBBBBB(
			PerformRuleResult ruleresult, EObject container, EObject cable, EObject xDevice1, EObject xCable,
			EObject device2, EObject xDeviceToDevice2, EObject device1, EObject xDeviceToDevice, EObject xCableToCable,
			EObject cableAttributes, EObject xContainer, EObject connection1, EObject xDevice2, EObject connection2) {
		if (!container.equals(xDevice1)) {
			if (!container.equals(xCable)) {
				if (!container.equals(device2)) {
					if (!container.equals(xDeviceToDevice2)) {
						if (!container.equals(device1)) {
							if (!container.equals(xDeviceToDevice)) {
								if (!container.equals(xCableToCable)) {
									if (!container.equals(xContainer)) {
										if (!container.equals(xDevice2)) {
											if (!cable.equals(container)) {
												if (!cable.equals(xDevice1)) {
													if (!cable.equals(xCable)) {
														if (!cable.equals(device2)) {
															if (!cable.equals(xDeviceToDevice2)) {
																if (!cable.equals(device1)) {
																	if (!cable.equals(xDeviceToDevice)) {
																		if (!cable.equals(xCableToCable)) {
																			if (!cable.equals(cableAttributes)) {
																				if (!cable.equals(xContainer)) {
																					if (!cable.equals(connection1)) {
																						if (!cable.equals(xDevice2)) {
																							if (!cable.equals(
																									connection2)) {
																								if (!xDevice1.equals(
																										xDeviceToDevice2)) {
																									if (!xDevice1
																											.equals(xDeviceToDevice)) {
																										if (!xDevice1
																												.equals(xDevice2)) {
																											if (!xCable
																													.equals(xDevice1)) {
																												if (!xCable
																														.equals(xDeviceToDevice2)) {
																													if (!xCable
																															.equals(xDeviceToDevice)) {
																														if (!xCable
																																.equals(xCableToCable)) {
																															if (!xCable
																																	.equals(xContainer)) {
																																if (!xCable
																																		.equals(xDevice2)) {
																																	if (!device2
																																			.equals(xDevice1)) {
																																		if (!device2
																																				.equals(xCable)) {
																																			if (!device2
																																					.equals(xDeviceToDevice2)) {
																																				if (!device2
																																						.equals(xDeviceToDevice)) {
																																					if (!device2
																																							.equals(xCableToCable)) {
																																						if (!device2
																																								.equals(xContainer)) {
																																							if (!device2
																																									.equals(xDevice2)) {
																																								if (!device1
																																										.equals(xDevice1)) {
																																									if (!device1
																																											.equals(xCable)) {
																																										if (!device1
																																												.equals(device2)) {
																																											if (!device1
																																													.equals(xDeviceToDevice2)) {
																																												if (!device1
																																														.equals(xDeviceToDevice)) {
																																													if (!device1
																																															.equals(xCableToCable)) {
																																														if (!device1
																																																.equals(xContainer)) {
																																															if (!device1
																																																	.equals(xDevice2)) {
																																																if (!xDeviceToDevice
																																																		.equals(xDeviceToDevice2)) {
																																																	if (!xCableToCable
																																																			.equals(xDevice1)) {
																																																		if (!xCableToCable
																																																				.equals(xDeviceToDevice2)) {
																																																			if (!xCableToCable
																																																					.equals(xDeviceToDevice)) {
																																																				if (!xCableToCable
																																																						.equals(xContainer)) {
																																																					if (!xCableToCable
																																																							.equals(xDevice2)) {
																																																						if (!cableAttributes
																																																								.equals(container)) {
																																																							if (!cableAttributes
																																																									.equals(xDevice1)) {
																																																								if (!cableAttributes
																																																										.equals(xCable)) {
																																																									if (!cableAttributes
																																																											.equals(device2)) {
																																																										if (!cableAttributes
																																																												.equals(xDeviceToDevice2)) {
																																																											if (!cableAttributes
																																																													.equals(device1)) {
																																																												if (!cableAttributes
																																																														.equals(xDeviceToDevice)) {
																																																													if (!cableAttributes
																																																															.equals(xCableToCable)) {
																																																														if (!cableAttributes
																																																																.equals(xContainer)) {
																																																															if (!cableAttributes
																																																																	.equals(connection1)) {
																																																																if (!cableAttributes
																																																																		.equals(xDevice2)) {
																																																																	if (!cableAttributes
																																																																			.equals(connection2)) {
																																																																		if (!xContainer
																																																																				.equals(xDevice1)) {
																																																																			if (!xContainer
																																																																					.equals(xDeviceToDevice2)) {
																																																																				if (!xContainer
																																																																						.equals(xDeviceToDevice)) {
																																																																					if (!xContainer
																																																																							.equals(xDevice2)) {
																																																																						if (!connection1
																																																																								.equals(container)) {
																																																																							if (!connection1
																																																																									.equals(xDevice1)) {
																																																																								if (!connection1
																																																																										.equals(xCable)) {
																																																																									if (!connection1
																																																																											.equals(device2)) {
																																																																										if (!connection1
																																																																												.equals(xDeviceToDevice2)) {
																																																																											if (!connection1
																																																																													.equals(device1)) {
																																																																												if (!connection1
																																																																														.equals(xDeviceToDevice)) {
																																																																													if (!connection1
																																																																															.equals(xCableToCable)) {
																																																																														if (!connection1
																																																																																.equals(xContainer)) {
																																																																															if (!connection1
																																																																																	.equals(xDevice2)) {
																																																																																if (!connection1
																																																																																		.equals(connection2)) {
																																																																																	if (!xDevice2
																																																																																			.equals(xDeviceToDevice2)) {
																																																																																		if (!xDevice2
																																																																																				.equals(xDeviceToDevice)) {
																																																																																			if (!connection2
																																																																																					.equals(container)) {
																																																																																				if (!connection2
																																																																																						.equals(xDevice1)) {
																																																																																					if (!connection2
																																																																																							.equals(xCable)) {
																																																																																						if (!connection2
																																																																																								.equals(device2)) {
																																																																																							if (!connection2
																																																																																									.equals(xDeviceToDevice2)) {
																																																																																								if (!connection2
																																																																																										.equals(device1)) {
																																																																																									if (!connection2
																																																																																											.equals(xDeviceToDevice)) {
																																																																																										if (!connection2
																																																																																												.equals(xCableToCable)) {
																																																																																											if (!connection2
																																																																																													.equals(xContainer)) {
																																																																																												if (!connection2
																																																																																														.equals(xDevice2)) {
																																																																																													return new Object[] {
																																																																																															ruleresult,
																																																																																															container,
																																																																																															cable,
																																																																																															xDevice1,
																																																																																															xCable,
																																																																																															device2,
																																																																																															xDeviceToDevice2,
																																																																																															device1,
																																																																																															xDeviceToDevice,
																																																																																															xCableToCable,
																																																																																															cableAttributes,
																																																																																															xContainer,
																																																																																															connection1,
																																																																																															xDevice2,
																																																																																															connection2 };
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

	public static final Object[] pattern_XSimplexConnectionToConnectionRule_11_3_bookkeepingforedges_greenBBBBBBBBBBFFFFFFFF(
			PerformRuleResult ruleresult, EObject cable, EObject xDevice1, EObject xCable, EObject device2,
			EObject device1, EObject cableAttributes, EObject connection1, EObject xDevice2, EObject connection2) {
		EMoflonEdge cable__device1____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge device1__cable____outgoing = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge cable__device2____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge device2__cable____incoming = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge cableAttributes__xDevice1____endPoint1 = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge connection1__xCable____outgoing = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge cableAttributes__xDevice2____endPoint2 = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge connection2__xCable____incoming = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String ruleresult_ruleName_prime = "XSimplexConnectionToConnectionRule";
		String cable__device1____source_name_prime = "source";
		String device1__cable____outgoing_name_prime = "outgoing";
		String cable__device2____target_name_prime = "target";
		String device2__cable____incoming_name_prime = "incoming";
		String cableAttributes__xDevice1____endPoint1_name_prime = "endPoint1";
		String connection1__xCable____outgoing_name_prime = "outgoing";
		String cableAttributes__xDevice2____endPoint2_name_prime = "endPoint2";
		String connection2__xCable____incoming_name_prime = "incoming";
		cable__device1____source.setSrc(cable);
		cable__device1____source.setTrg(device1);
		ruleresult.getTranslatedEdges().add(cable__device1____source);
		device1__cable____outgoing.setSrc(device1);
		device1__cable____outgoing.setTrg(cable);
		ruleresult.getTranslatedEdges().add(device1__cable____outgoing);
		cable__device2____target.setSrc(cable);
		cable__device2____target.setTrg(device2);
		ruleresult.getTranslatedEdges().add(cable__device2____target);
		device2__cable____incoming.setSrc(device2);
		device2__cable____incoming.setTrg(cable);
		ruleresult.getTranslatedEdges().add(device2__cable____incoming);
		cableAttributes__xDevice1____endPoint1.setSrc(cableAttributes);
		cableAttributes__xDevice1____endPoint1.setTrg(xDevice1);
		ruleresult.getCreatedEdges().add(cableAttributes__xDevice1____endPoint1);
		connection1__xCable____outgoing.setSrc(connection1);
		connection1__xCable____outgoing.setTrg(xCable);
		ruleresult.getCreatedEdges().add(connection1__xCable____outgoing);
		cableAttributes__xDevice2____endPoint2.setSrc(cableAttributes);
		cableAttributes__xDevice2____endPoint2.setTrg(xDevice2);
		ruleresult.getCreatedEdges().add(cableAttributes__xDevice2____endPoint2);
		connection2__xCable____incoming.setSrc(connection2);
		connection2__xCable____incoming.setTrg(xCable);
		ruleresult.getCreatedEdges().add(connection2__xCable____incoming);
		ruleresult.setRuleName(ruleresult_ruleName_prime);
		cable__device1____source.setName(cable__device1____source_name_prime);
		device1__cable____outgoing.setName(device1__cable____outgoing_name_prime);
		cable__device2____target.setName(cable__device2____target_name_prime);
		device2__cable____incoming.setName(device2__cable____incoming_name_prime);
		cableAttributes__xDevice1____endPoint1.setName(cableAttributes__xDevice1____endPoint1_name_prime);
		connection1__xCable____outgoing.setName(connection1__xCable____outgoing_name_prime);
		cableAttributes__xDevice2____endPoint2.setName(cableAttributes__xDevice2____endPoint2_name_prime);
		connection2__xCable____incoming.setName(connection2__xCable____incoming_name_prime);
		return new Object[] { ruleresult, cable, xDevice1, xCable, device2, device1, cableAttributes, connection1,
				xDevice2, connection2, cable__device1____source, device1__cable____outgoing, cable__device2____target,
				device2__cable____incoming, cableAttributes__xDevice1____endPoint1, connection1__xCable____outgoing,
				cableAttributes__xDevice2____endPoint2, connection2__xCable____incoming };
	}

	public static final void pattern_XSimplexConnectionToConnectionRule_11_5_registerobjects_expressionBBBBBBBBBBBBBBBB(
			XSimplexConnectionToConnectionRule _this, PerformRuleResult ruleresult, EObject container, EObject cable,
			EObject xDevice1, EObject xCable, EObject device2, EObject xDeviceToDevice2, EObject device1,
			EObject xDeviceToDevice, EObject xCableToCable, EObject cableAttributes, EObject xContainer,
			EObject connection1, EObject xDevice2, EObject connection2) {
		_this.registerObjects_BWD(ruleresult, container, cable, xDevice1, xCable, device2, xDeviceToDevice2, device1,
				xDeviceToDevice, xCableToCable, cableAttributes, xContainer, connection1, xDevice2, connection2);

	}

	public static final PerformRuleResult pattern_XSimplexConnectionToConnectionRule_11_6_expressionFB(
			PerformRuleResult ruleresult) {
		PerformRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_XSimplexConnectionToConnectionRule_12_1_preparereturnvalue_bindingFB(
			XSimplexConnectionToConnectionRule _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass eClass = _localVariable_0;
		if (eClass != null) {
			return new Object[] { eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_XSimplexConnectionToConnectionRule_12_1_preparereturnvalue_blackFBB(
			EClass eClass, XSimplexConnectionToConnectionRule _this) {
		for (EOperation performOperation : eClass.getEOperations()) {
			String performOperation_name = performOperation.getName();
			if (performOperation_name.equals("perform_BWD")) {
				return new Object[] { performOperation, eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_XSimplexConnectionToConnectionRule_12_1_preparereturnvalue_bindingAndBlackFFB(
			XSimplexConnectionToConnectionRule _this) {
		Object[] result_pattern_XSimplexConnectionToConnectionRule_12_1_preparereturnvalue_binding = pattern_XSimplexConnectionToConnectionRule_12_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_XSimplexConnectionToConnectionRule_12_1_preparereturnvalue_binding != null) {
			EClass eClass = (EClass) result_pattern_XSimplexConnectionToConnectionRule_12_1_preparereturnvalue_binding[0];

			Object[] result_pattern_XSimplexConnectionToConnectionRule_12_1_preparereturnvalue_black = pattern_XSimplexConnectionToConnectionRule_12_1_preparereturnvalue_blackFBB(
					eClass, _this);
			if (result_pattern_XSimplexConnectionToConnectionRule_12_1_preparereturnvalue_black != null) {
				EOperation performOperation = (EOperation) result_pattern_XSimplexConnectionToConnectionRule_12_1_preparereturnvalue_black[0];

				return new Object[] { performOperation, eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_XSimplexConnectionToConnectionRule_12_1_preparereturnvalue_greenBF(
			EOperation performOperation) {
		IsApplicableRuleResult ruleresult = RuntimeFactory.eINSTANCE.createIsApplicableRuleResult();
		boolean ruleresult_success_prime = Boolean.valueOf(false);
		String ruleresult_rule_prime = "XSimplexConnectionToConnectionRule";
		ruleresult.setPerformOperation(performOperation);
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		ruleresult.setRule(ruleresult_rule_prime);
		return new Object[] { performOperation, ruleresult };
	}

	public static final Object[] pattern_XSimplexConnectionToConnectionRule_12_2_corematch_bindingFFFFB(Match match) {
		EObject _localVariable_0 = match.getObject("container");
		EObject _localVariable_1 = match.getObject("cable");
		EObject _localVariable_2 = match.getObject("device2");
		EObject _localVariable_3 = match.getObject("device1");
		EObject tmpContainer = _localVariable_0;
		EObject tmpCable = _localVariable_1;
		EObject tmpDevice2 = _localVariable_2;
		EObject tmpDevice1 = _localVariable_3;
		if (tmpContainer instanceof Container) {
			Container container = (Container) tmpContainer;
			if (tmpCable instanceof Cable) {
				Cable cable = (Cable) tmpCable;
				if (tmpDevice2 instanceof Device) {
					Device device2 = (Device) tmpDevice2;
					if (tmpDevice1 instanceof Device) {
						Device device1 = (Device) tmpDevice1;
						return new Object[] { container, cable, device2, device1, match };
					}
				}
			}
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_XSimplexConnectionToConnectionRule_12_2_corematch_blackBBFFBFBFFFB(
			Container container, Cable cable, Device device2, Device device1, Match match) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (!device1.equals(device2)) {
			for (XCableToCable xCableToCable : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(cable,
					XCableToCable.class, "target")) {
				XCable xCable = xCableToCable.getSource();
				if (xCable != null) {
					for (XDeviceToDevice xDeviceToDevice : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(device1, XDeviceToDevice.class, "target")) {
						XDevice xDevice1 = xDeviceToDevice.getSource();
						if (xDevice1 != null) {
							for (XDeviceToDevice xDeviceToDevice2 : org.moflon.core.utilities.eMoflonEMFUtil
									.getOppositeReferenceTyped(device2, XDeviceToDevice.class, "target")) {
								if (!xDeviceToDevice.equals(xDeviceToDevice2)) {
									XDevice xDevice2 = xDeviceToDevice2.getSource();
									if (xDevice2 != null) {
										if (!xDevice1.equals(xDevice2)) {
											_result.add(new Object[] { container, cable, xDevice1, xCable, device2,
													xDeviceToDevice2, device1, xDeviceToDevice, xCableToCable, xDevice2,
													match });
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

	public static final Iterable<Object[]> pattern_XSimplexConnectionToConnectionRule_12_3_findcontext_blackBBBBBBBBBFFFBF(
			Container container, Cable cable, XDevice xDevice1, XCable xCable, Device device2,
			XDeviceToDevice xDeviceToDevice2, Device device1, XDeviceToDevice xDeviceToDevice,
			XCableToCable xCableToCable, XDevice xDevice2) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (!xDevice1.equals(xDevice2)) {
			if (!device1.equals(device2)) {
				if (!xDeviceToDevice.equals(xDeviceToDevice2)) {
					if (device1.equals(cable.getSource())) {
						if (container.getCables().contains(cable)) {
							if (container.getDevices().contains(device1)) {
								if (cable.equals(xCableToCable.getTarget())) {
									if (container.getDevices().contains(device2)) {
										if (xDevice1.equals(xDeviceToDevice.getSource())) {
											if (xCable.equals(xCableToCable.getSource())) {
												if (device1.equals(xDeviceToDevice.getTarget())) {
													if (device2.equals(cable.getTarget())) {
														if (device2.equals(xDeviceToDevice2.getTarget())) {
															if (xDevice2.equals(xDeviceToDevice2.getSource())) {
																Connections connection1 = xDevice1.getConnections();
																if (connection1 != null) {
																	CableAttributes cableAttributes = xCable
																			.getCableAttributes();
																	if (cableAttributes != null) {
																		Connections connection2 = xDevice2
																				.getConnections();
																		if (connection2 != null) {
																			if (!connection1.equals(connection2)) {
																				for (XContainer xContainer : org.moflon.core.utilities.eMoflonEMFUtil
																						.getOppositeReferenceTyped(
																								xCable,
																								XContainer.class,
																								"elements")) {
																					if (xContainer.getElements()
																							.contains(xDevice2)) {
																						if (xContainer.getElements()
																								.contains(xDevice1)) {
																							_result.add(new Object[] {
																									container, cable,
																									xDevice1, xCable,
																									device2,
																									xDeviceToDevice2,
																									device1,
																									xDeviceToDevice,
																									xCableToCable,
																									cableAttributes,
																									xContainer,
																									connection1,
																									xDevice2,
																									connection2 });
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
		return _result;
	}

	public static final Object[] pattern_XSimplexConnectionToConnectionRule_12_3_findcontext_greenBBBBBBBBBBBBBBFFFFFFFFFFFFFFFFFFFF(
			Container container, Cable cable, XDevice xDevice1, XCable xCable, Device device2,
			XDeviceToDevice xDeviceToDevice2, Device device1, XDeviceToDevice xDeviceToDevice,
			XCableToCable xCableToCable, CableAttributes cableAttributes, XContainer xContainer,
			Connections connection1, XDevice xDevice2, Connections connection2) {
		IsApplicableMatch isApplicableMatch = RuntimeFactory.eINSTANCE.createIsApplicableMatch();
		EMoflonEdge cable__device1____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge device1__cable____outgoing = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge xDevice1__connection1____connections = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge xCable__cableAttributes____cableAttributes = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge container__cable____cables = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge container__device1____devices = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge xCableToCable__cable____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge container__device2____devices = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge xDeviceToDevice__xDevice1____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge xCableToCable__xCable____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge xDeviceToDevice__device1____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge cable__device2____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge device2__cable____incoming = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge xContainer__xCable____elements = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge xContainer__xDevice2____elements = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge xContainer__xDevice1____elements = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge xDeviceToDevice2__device2____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge xDeviceToDevice2__xDevice2____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge xDevice2__connection2____connections = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		boolean cableAttributes_isDuplex_prime = Boolean.valueOf(false);
		String cable__device1____source_name_prime = "source";
		String device1__cable____outgoing_name_prime = "outgoing";
		String xDevice1__connection1____connections_name_prime = "connections";
		String xCable__cableAttributes____cableAttributes_name_prime = "cableAttributes";
		String container__cable____cables_name_prime = "cables";
		String container__device1____devices_name_prime = "devices";
		String xCableToCable__cable____target_name_prime = "target";
		String container__device2____devices_name_prime = "devices";
		String xDeviceToDevice__xDevice1____source_name_prime = "source";
		String xCableToCable__xCable____source_name_prime = "source";
		String xDeviceToDevice__device1____target_name_prime = "target";
		String cable__device2____target_name_prime = "target";
		String device2__cable____incoming_name_prime = "incoming";
		String xContainer__xCable____elements_name_prime = "elements";
		String xContainer__xDevice2____elements_name_prime = "elements";
		String xContainer__xDevice1____elements_name_prime = "elements";
		String xDeviceToDevice2__device2____target_name_prime = "target";
		String xDeviceToDevice2__xDevice2____source_name_prime = "source";
		String xDevice2__connection2____connections_name_prime = "connections";
		isApplicableMatch.getAllContextElements().add(container);
		isApplicableMatch.getAllContextElements().add(cable);
		isApplicableMatch.getAllContextElements().add(xDevice1);
		isApplicableMatch.getAllContextElements().add(xCable);
		isApplicableMatch.getAllContextElements().add(device2);
		isApplicableMatch.getAllContextElements().add(xDeviceToDevice2);
		isApplicableMatch.getAllContextElements().add(device1);
		isApplicableMatch.getAllContextElements().add(xDeviceToDevice);
		isApplicableMatch.getAllContextElements().add(xCableToCable);
		isApplicableMatch.getAllContextElements().add(cableAttributes);
		isApplicableMatch.getAllContextElements().add(xContainer);
		isApplicableMatch.getAllContextElements().add(connection1);
		isApplicableMatch.getAllContextElements().add(xDevice2);
		isApplicableMatch.getAllContextElements().add(connection2);
		cable__device1____source.setSrc(cable);
		cable__device1____source.setTrg(device1);
		isApplicableMatch.getAllContextElements().add(cable__device1____source);
		device1__cable____outgoing.setSrc(device1);
		device1__cable____outgoing.setTrg(cable);
		isApplicableMatch.getAllContextElements().add(device1__cable____outgoing);
		xDevice1__connection1____connections.setSrc(xDevice1);
		xDevice1__connection1____connections.setTrg(connection1);
		isApplicableMatch.getAllContextElements().add(xDevice1__connection1____connections);
		xCable__cableAttributes____cableAttributes.setSrc(xCable);
		xCable__cableAttributes____cableAttributes.setTrg(cableAttributes);
		isApplicableMatch.getAllContextElements().add(xCable__cableAttributes____cableAttributes);
		container__cable____cables.setSrc(container);
		container__cable____cables.setTrg(cable);
		isApplicableMatch.getAllContextElements().add(container__cable____cables);
		container__device1____devices.setSrc(container);
		container__device1____devices.setTrg(device1);
		isApplicableMatch.getAllContextElements().add(container__device1____devices);
		xCableToCable__cable____target.setSrc(xCableToCable);
		xCableToCable__cable____target.setTrg(cable);
		isApplicableMatch.getAllContextElements().add(xCableToCable__cable____target);
		container__device2____devices.setSrc(container);
		container__device2____devices.setTrg(device2);
		isApplicableMatch.getAllContextElements().add(container__device2____devices);
		xDeviceToDevice__xDevice1____source.setSrc(xDeviceToDevice);
		xDeviceToDevice__xDevice1____source.setTrg(xDevice1);
		isApplicableMatch.getAllContextElements().add(xDeviceToDevice__xDevice1____source);
		xCableToCable__xCable____source.setSrc(xCableToCable);
		xCableToCable__xCable____source.setTrg(xCable);
		isApplicableMatch.getAllContextElements().add(xCableToCable__xCable____source);
		xDeviceToDevice__device1____target.setSrc(xDeviceToDevice);
		xDeviceToDevice__device1____target.setTrg(device1);
		isApplicableMatch.getAllContextElements().add(xDeviceToDevice__device1____target);
		cable__device2____target.setSrc(cable);
		cable__device2____target.setTrg(device2);
		isApplicableMatch.getAllContextElements().add(cable__device2____target);
		device2__cable____incoming.setSrc(device2);
		device2__cable____incoming.setTrg(cable);
		isApplicableMatch.getAllContextElements().add(device2__cable____incoming);
		xContainer__xCable____elements.setSrc(xContainer);
		xContainer__xCable____elements.setTrg(xCable);
		isApplicableMatch.getAllContextElements().add(xContainer__xCable____elements);
		xContainer__xDevice2____elements.setSrc(xContainer);
		xContainer__xDevice2____elements.setTrg(xDevice2);
		isApplicableMatch.getAllContextElements().add(xContainer__xDevice2____elements);
		xContainer__xDevice1____elements.setSrc(xContainer);
		xContainer__xDevice1____elements.setTrg(xDevice1);
		isApplicableMatch.getAllContextElements().add(xContainer__xDevice1____elements);
		xDeviceToDevice2__device2____target.setSrc(xDeviceToDevice2);
		xDeviceToDevice2__device2____target.setTrg(device2);
		isApplicableMatch.getAllContextElements().add(xDeviceToDevice2__device2____target);
		xDeviceToDevice2__xDevice2____source.setSrc(xDeviceToDevice2);
		xDeviceToDevice2__xDevice2____source.setTrg(xDevice2);
		isApplicableMatch.getAllContextElements().add(xDeviceToDevice2__xDevice2____source);
		xDevice2__connection2____connections.setSrc(xDevice2);
		xDevice2__connection2____connections.setTrg(connection2);
		isApplicableMatch.getAllContextElements().add(xDevice2__connection2____connections);
		cableAttributes.setIsDuplex(Boolean.valueOf(cableAttributes_isDuplex_prime));
		cable__device1____source.setName(cable__device1____source_name_prime);
		device1__cable____outgoing.setName(device1__cable____outgoing_name_prime);
		xDevice1__connection1____connections.setName(xDevice1__connection1____connections_name_prime);
		xCable__cableAttributes____cableAttributes.setName(xCable__cableAttributes____cableAttributes_name_prime);
		container__cable____cables.setName(container__cable____cables_name_prime);
		container__device1____devices.setName(container__device1____devices_name_prime);
		xCableToCable__cable____target.setName(xCableToCable__cable____target_name_prime);
		container__device2____devices.setName(container__device2____devices_name_prime);
		xDeviceToDevice__xDevice1____source.setName(xDeviceToDevice__xDevice1____source_name_prime);
		xCableToCable__xCable____source.setName(xCableToCable__xCable____source_name_prime);
		xDeviceToDevice__device1____target.setName(xDeviceToDevice__device1____target_name_prime);
		cable__device2____target.setName(cable__device2____target_name_prime);
		device2__cable____incoming.setName(device2__cable____incoming_name_prime);
		xContainer__xCable____elements.setName(xContainer__xCable____elements_name_prime);
		xContainer__xDevice2____elements.setName(xContainer__xDevice2____elements_name_prime);
		xContainer__xDevice1____elements.setName(xContainer__xDevice1____elements_name_prime);
		xDeviceToDevice2__device2____target.setName(xDeviceToDevice2__device2____target_name_prime);
		xDeviceToDevice2__xDevice2____source.setName(xDeviceToDevice2__xDevice2____source_name_prime);
		xDevice2__connection2____connections.setName(xDevice2__connection2____connections_name_prime);
		return new Object[] { container, cable, xDevice1, xCable, device2, xDeviceToDevice2, device1, xDeviceToDevice,
				xCableToCable, cableAttributes, xContainer, connection1, xDevice2, connection2, isApplicableMatch,
				cable__device1____source, device1__cable____outgoing, xDevice1__connection1____connections,
				xCable__cableAttributes____cableAttributes, container__cable____cables, container__device1____devices,
				xCableToCable__cable____target, container__device2____devices, xDeviceToDevice__xDevice1____source,
				xCableToCable__xCable____source, xDeviceToDevice__device1____target, cable__device2____target,
				device2__cable____incoming, xContainer__xCable____elements, xContainer__xDevice2____elements,
				xContainer__xDevice1____elements, xDeviceToDevice2__device2____target,
				xDeviceToDevice2__xDevice2____source, xDevice2__connection2____connections };
	}

	public static final Object[] pattern_XSimplexConnectionToConnectionRule_12_4_solveCSP_bindingFBBBBBBBBBBBBBBBB(
			XSimplexConnectionToConnectionRule _this, IsApplicableMatch isApplicableMatch, Container container,
			Cable cable, XDevice xDevice1, XCable xCable, Device device2, XDeviceToDevice xDeviceToDevice2,
			Device device1, XDeviceToDevice xDeviceToDevice, XCableToCable xCableToCable,
			CableAttributes cableAttributes, XContainer xContainer, Connections connection1, XDevice xDevice2,
			Connections connection2) {
		CSP _localVariable_0 = _this.isApplicable_solveCsp_BWD(isApplicableMatch, container, cable, xDevice1, xCable,
				device2, xDeviceToDevice2, device1, xDeviceToDevice, xCableToCable, cableAttributes, xContainer,
				connection1, xDevice2, connection2);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, container, cable, xDevice1, xCable, device2,
					xDeviceToDevice2, device1, xDeviceToDevice, xCableToCable, cableAttributes, xContainer, connection1,
					xDevice2, connection2 };
		}
		return null;
	}

	public static final Object[] pattern_XSimplexConnectionToConnectionRule_12_4_solveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_XSimplexConnectionToConnectionRule_12_4_solveCSP_bindingAndBlackFBBBBBBBBBBBBBBBB(
			XSimplexConnectionToConnectionRule _this, IsApplicableMatch isApplicableMatch, Container container,
			Cable cable, XDevice xDevice1, XCable xCable, Device device2, XDeviceToDevice xDeviceToDevice2,
			Device device1, XDeviceToDevice xDeviceToDevice, XCableToCable xCableToCable,
			CableAttributes cableAttributes, XContainer xContainer, Connections connection1, XDevice xDevice2,
			Connections connection2) {
		Object[] result_pattern_XSimplexConnectionToConnectionRule_12_4_solveCSP_binding = pattern_XSimplexConnectionToConnectionRule_12_4_solveCSP_bindingFBBBBBBBBBBBBBBBB(
				_this, isApplicableMatch, container, cable, xDevice1, xCable, device2, xDeviceToDevice2, device1,
				xDeviceToDevice, xCableToCable, cableAttributes, xContainer, connection1, xDevice2, connection2);
		if (result_pattern_XSimplexConnectionToConnectionRule_12_4_solveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_XSimplexConnectionToConnectionRule_12_4_solveCSP_binding[0];

			Object[] result_pattern_XSimplexConnectionToConnectionRule_12_4_solveCSP_black = pattern_XSimplexConnectionToConnectionRule_12_4_solveCSP_blackB(
					csp);
			if (result_pattern_XSimplexConnectionToConnectionRule_12_4_solveCSP_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, container, cable, xDevice1, xCable, device2,
						xDeviceToDevice2, device1, xDeviceToDevice, xCableToCable, cableAttributes, xContainer,
						connection1, xDevice2, connection2 };
			}
		}
		return null;
	}

	public static final boolean pattern_XSimplexConnectionToConnectionRule_12_5_checkCSP_expressionFBB(
			XSimplexConnectionToConnectionRule _this, CSP csp) {
		boolean _localVariable_0 = _this.isApplicable_checkCsp_BWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_XSimplexConnectionToConnectionRule_12_6_addmatchtoruleresult_blackBB(
			IsApplicableRuleResult ruleresult, IsApplicableMatch isApplicableMatch) {
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final Object[] pattern_XSimplexConnectionToConnectionRule_12_6_addmatchtoruleresult_greenBB(
			IsApplicableRuleResult ruleresult, IsApplicableMatch isApplicableMatch) {
		ruleresult.getIsApplicableMatch().add(isApplicableMatch);
		boolean ruleresult_success_prime = Boolean.valueOf(true);
		String isApplicableMatch_ruleName_prime = "XSimplexConnectionToConnectionRule";
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		isApplicableMatch.setRuleName(isApplicableMatch_ruleName_prime);
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final IsApplicableRuleResult pattern_XSimplexConnectionToConnectionRule_12_7_expressionFB(
			IsApplicableRuleResult ruleresult) {
		IsApplicableRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_XSimplexConnectionToConnectionRule_20_1_preparereturnvalue_bindingFB(
			XSimplexConnectionToConnectionRule _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_XSimplexConnectionToConnectionRule_20_1_preparereturnvalue_blackFBBF(
			EClass __eClass, XSimplexConnectionToConnectionRule _this) {
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

	public static final Object[] pattern_XSimplexConnectionToConnectionRule_20_1_preparereturnvalue_bindingAndBlackFFBF(
			XSimplexConnectionToConnectionRule _this) {
		Object[] result_pattern_XSimplexConnectionToConnectionRule_20_1_preparereturnvalue_binding = pattern_XSimplexConnectionToConnectionRule_20_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_XSimplexConnectionToConnectionRule_20_1_preparereturnvalue_binding != null) {
			EClass __eClass = (EClass) result_pattern_XSimplexConnectionToConnectionRule_20_1_preparereturnvalue_binding[0];

			Object[] result_pattern_XSimplexConnectionToConnectionRule_20_1_preparereturnvalue_black = pattern_XSimplexConnectionToConnectionRule_20_1_preparereturnvalue_blackFBBF(
					__eClass, _this);
			if (result_pattern_XSimplexConnectionToConnectionRule_20_1_preparereturnvalue_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_XSimplexConnectionToConnectionRule_20_1_preparereturnvalue_black[0];
				EOperation isApplicableCC = (EOperation) result_pattern_XSimplexConnectionToConnectionRule_20_1_preparereturnvalue_black[3];

				return new Object[] { __performOperation, __eClass, _this, isApplicableCC };
			}
		}
		return null;
	}

	public static final Object[] pattern_XSimplexConnectionToConnectionRule_20_1_preparereturnvalue_greenF() {
		EObjectContainer __result = RuntimeFactory.eINSTANCE.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Iterable<Object[]> pattern_XSimplexConnectionToConnectionRule_20_2_testcorematchandDECs_blackFFFFB(
			EMoflonEdge _edge_source) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		EObject tmpCable = _edge_source.getSrc();
		if (tmpCable instanceof Cable) {
			Cable cable = (Cable) tmpCable;
			EObject tmpDevice1 = _edge_source.getTrg();
			if (tmpDevice1 instanceof Device) {
				Device device1 = (Device) tmpDevice1;
				if (device1.equals(cable.getSource())) {
					Device device2 = cable.getTarget();
					if (device2 != null) {
						if (!device1.equals(device2)) {
							for (Container container : org.moflon.core.utilities.eMoflonEMFUtil
									.getOppositeReferenceTyped(cable, Container.class, "cables")) {
								if (container.getDevices().contains(device1)) {
									if (container.getDevices().contains(device2)) {
										_result.add(new Object[] { container, cable, device2, device1, _edge_source });
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

	public static final Object[] pattern_XSimplexConnectionToConnectionRule_20_2_testcorematchandDECs_greenFB(
			EClass __eClass) {
		Match match = RuntimeFactory.eINSTANCE.createMatch();
		String __eClass_name = __eClass.getName();
		String match_ruleName_prime = __eClass_name;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_XSimplexConnectionToConnectionRule_20_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBBBB(
			XSimplexConnectionToConnectionRule _this, Match match, Container container, Cable cable, Device device2,
			Device device1) {
		boolean _localVariable_0 = _this.isAppropriate_BWD(match, container, cable, device2, device1);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_XSimplexConnectionToConnectionRule_20_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(
			XSimplexConnectionToConnectionRule _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_BWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_XSimplexConnectionToConnectionRule_20_5_Addmatchtoruleresult_blackBBBB(
			Match match, EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		if (!__performOperation.equals(isApplicableCC)) {
			return new Object[] { match, __performOperation, __result, isApplicableCC };
		}
		return null;
	}

	public static final Object[] pattern_XSimplexConnectionToConnectionRule_20_5_Addmatchtoruleresult_greenBBBB(
			Match match, EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		match.setIsApplicableCCOperation(isApplicableCC);
		return new Object[] { match, __performOperation, __result, isApplicableCC };
	}

	public static final EObjectContainer pattern_XSimplexConnectionToConnectionRule_20_6_expressionFB(
			EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_XSimplexConnectionToConnectionRule_21_1_preparereturnvalue_bindingFB(
			XSimplexConnectionToConnectionRule _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_XSimplexConnectionToConnectionRule_21_1_preparereturnvalue_blackFBBF(
			EClass __eClass, XSimplexConnectionToConnectionRule _this) {
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

	public static final Object[] pattern_XSimplexConnectionToConnectionRule_21_1_preparereturnvalue_bindingAndBlackFFBF(
			XSimplexConnectionToConnectionRule _this) {
		Object[] result_pattern_XSimplexConnectionToConnectionRule_21_1_preparereturnvalue_binding = pattern_XSimplexConnectionToConnectionRule_21_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_XSimplexConnectionToConnectionRule_21_1_preparereturnvalue_binding != null) {
			EClass __eClass = (EClass) result_pattern_XSimplexConnectionToConnectionRule_21_1_preparereturnvalue_binding[0];

			Object[] result_pattern_XSimplexConnectionToConnectionRule_21_1_preparereturnvalue_black = pattern_XSimplexConnectionToConnectionRule_21_1_preparereturnvalue_blackFBBF(
					__eClass, _this);
			if (result_pattern_XSimplexConnectionToConnectionRule_21_1_preparereturnvalue_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_XSimplexConnectionToConnectionRule_21_1_preparereturnvalue_black[0];
				EOperation isApplicableCC = (EOperation) result_pattern_XSimplexConnectionToConnectionRule_21_1_preparereturnvalue_black[3];

				return new Object[] { __performOperation, __eClass, _this, isApplicableCC };
			}
		}
		return null;
	}

	public static final Object[] pattern_XSimplexConnectionToConnectionRule_21_1_preparereturnvalue_greenF() {
		EObjectContainer __result = RuntimeFactory.eINSTANCE.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Iterable<Object[]> pattern_XSimplexConnectionToConnectionRule_21_2_testcorematchandDECs_blackFFFFFFFB(
			EMoflonEdge _edge_endPoint1) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		EObject tmpCableAttributes = _edge_endPoint1.getSrc();
		if (tmpCableAttributes instanceof CableAttributes) {
			CableAttributes cableAttributes = (CableAttributes) tmpCableAttributes;
			EObject tmpXDevice1 = _edge_endPoint1.getTrg();
			if (tmpXDevice1 instanceof XDevice) {
				XDevice xDevice1 = (XDevice) tmpXDevice1;
				if (xDevice1.equals(cableAttributes.getEndPoint1())) {
					XDevice xDevice2 = cableAttributes.getEndPoint2();
					if (xDevice2 != null) {
						if (!xDevice1.equals(xDevice2)) {
							boolean cableAttributes_isDuplex = cableAttributes.isIsDuplex();
							if (Boolean.valueOf(cableAttributes_isDuplex).equals(Boolean.valueOf(false))) {
								Connections connection1 = xDevice1.getConnections();
								if (connection1 != null) {
									Connections connection2 = xDevice2.getConnections();
									if (connection2 != null) {
										if (!connection1.equals(connection2)) {
											for (XCable xCable : connection1.getOutgoing()) {
												if (cableAttributes.equals(xCable.getCableAttributes())) {
													if (connection2.getIncoming().contains(xCable)) {
														for (XContainer xContainer : org.moflon.core.utilities.eMoflonEMFUtil
																.getOppositeReferenceTyped(xDevice1, XContainer.class,
																		"elements")) {
															if (xContainer.getElements().contains(xCable)) {
																if (xContainer.getElements().contains(xDevice2)) {
																	_result.add(new Object[] { xDevice1, xCable,
																			cableAttributes, xContainer, connection1,
																			xDevice2, connection2, _edge_endPoint1 });
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

	public static final Object[] pattern_XSimplexConnectionToConnectionRule_21_2_testcorematchandDECs_greenFB(
			EClass __eClass) {
		Match match = RuntimeFactory.eINSTANCE.createMatch();
		String __eClass_name = __eClass.getName();
		String match_ruleName_prime = __eClass_name;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_XSimplexConnectionToConnectionRule_21_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBBBBBBB(
			XSimplexConnectionToConnectionRule _this, Match match, XDevice xDevice1, XCable xCable,
			CableAttributes cableAttributes, XContainer xContainer, Connections connection1, XDevice xDevice2,
			Connections connection2) {
		boolean _localVariable_0 = _this.isAppropriate_FWD(match, xDevice1, xCable, cableAttributes, xContainer,
				connection1, xDevice2, connection2);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_XSimplexConnectionToConnectionRule_21_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(
			XSimplexConnectionToConnectionRule _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_FWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_XSimplexConnectionToConnectionRule_21_5_Addmatchtoruleresult_blackBBBB(
			Match match, EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		if (!__performOperation.equals(isApplicableCC)) {
			return new Object[] { match, __performOperation, __result, isApplicableCC };
		}
		return null;
	}

	public static final Object[] pattern_XSimplexConnectionToConnectionRule_21_5_Addmatchtoruleresult_greenBBBB(
			Match match, EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		match.setIsApplicableCCOperation(isApplicableCC);
		return new Object[] { match, __performOperation, __result, isApplicableCC };
	}

	public static final EObjectContainer pattern_XSimplexConnectionToConnectionRule_21_6_expressionFB(
			EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_XSimplexConnectionToConnectionRule_24_1_prepare_blackB(
			XSimplexConnectionToConnectionRule _this) {
		return new Object[] { _this };
	}

	public static final Object[] pattern_XSimplexConnectionToConnectionRule_24_1_prepare_greenF() {
		IsApplicableRuleResult result = RuntimeFactory.eINSTANCE.createIsApplicableRuleResult();
		return new Object[] { result };
	}

	public static final Object[] pattern_XSimplexConnectionToConnectionRule_24_2_matchsrctrgcontext_bindingFFFFFFFFFFFBB(
			Match targetMatch, Match sourceMatch) {
		EObject _localVariable_0 = targetMatch.getObject("container");
		EObject _localVariable_1 = targetMatch.getObject("cable");
		EObject _localVariable_2 = sourceMatch.getObject("xDevice1");
		EObject _localVariable_3 = sourceMatch.getObject("xCable");
		EObject _localVariable_4 = targetMatch.getObject("device2");
		EObject _localVariable_5 = targetMatch.getObject("device1");
		EObject _localVariable_6 = sourceMatch.getObject("cableAttributes");
		EObject _localVariable_7 = sourceMatch.getObject("xContainer");
		EObject _localVariable_8 = sourceMatch.getObject("connection1");
		EObject _localVariable_9 = sourceMatch.getObject("xDevice2");
		EObject _localVariable_10 = sourceMatch.getObject("connection2");
		EObject tmpContainer = _localVariable_0;
		EObject tmpCable = _localVariable_1;
		EObject tmpXDevice1 = _localVariable_2;
		EObject tmpXCable = _localVariable_3;
		EObject tmpDevice2 = _localVariable_4;
		EObject tmpDevice1 = _localVariable_5;
		EObject tmpCableAttributes = _localVariable_6;
		EObject tmpXContainer = _localVariable_7;
		EObject tmpConnection1 = _localVariable_8;
		EObject tmpXDevice2 = _localVariable_9;
		EObject tmpConnection2 = _localVariable_10;
		if (tmpContainer instanceof Container) {
			Container container = (Container) tmpContainer;
			if (tmpCable instanceof Cable) {
				Cable cable = (Cable) tmpCable;
				if (tmpXDevice1 instanceof XDevice) {
					XDevice xDevice1 = (XDevice) tmpXDevice1;
					if (tmpXCable instanceof XCable) {
						XCable xCable = (XCable) tmpXCable;
						if (tmpDevice2 instanceof Device) {
							Device device2 = (Device) tmpDevice2;
							if (tmpDevice1 instanceof Device) {
								Device device1 = (Device) tmpDevice1;
								if (tmpCableAttributes instanceof CableAttributes) {
									CableAttributes cableAttributes = (CableAttributes) tmpCableAttributes;
									if (tmpXContainer instanceof XContainer) {
										XContainer xContainer = (XContainer) tmpXContainer;
										if (tmpConnection1 instanceof Connections) {
											Connections connection1 = (Connections) tmpConnection1;
											if (tmpXDevice2 instanceof XDevice) {
												XDevice xDevice2 = (XDevice) tmpXDevice2;
												if (tmpConnection2 instanceof Connections) {
													Connections connection2 = (Connections) tmpConnection2;
													return new Object[] { container, cable, xDevice1, xCable, device2,
															device1, cableAttributes, xContainer, connection1, xDevice2,
															connection2, targetMatch, sourceMatch };
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

	public static final Object[] pattern_XSimplexConnectionToConnectionRule_24_2_matchsrctrgcontext_blackBBBBBBBBBBBBB(
			Container container, Cable cable, XDevice xDevice1, XCable xCable, Device device2, Device device1,
			CableAttributes cableAttributes, XContainer xContainer, Connections connection1, XDevice xDevice2,
			Connections connection2, Match sourceMatch, Match targetMatch) {
		if (!xDevice1.equals(xDevice2)) {
			if (!device1.equals(device2)) {
				if (!connection1.equals(connection2)) {
					if (!sourceMatch.equals(targetMatch)) {
						boolean cableAttributes_isDuplex = cableAttributes.isIsDuplex();
						if (Boolean.valueOf(cableAttributes_isDuplex).equals(Boolean.valueOf(false))) {
							return new Object[] { container, cable, xDevice1, xCable, device2, device1, cableAttributes,
									xContainer, connection1, xDevice2, connection2, sourceMatch, targetMatch };
						}

					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_XSimplexConnectionToConnectionRule_24_2_matchsrctrgcontext_bindingAndBlackFFFFFFFFFFFBB(
			Match sourceMatch, Match targetMatch) {
		Object[] result_pattern_XSimplexConnectionToConnectionRule_24_2_matchsrctrgcontext_binding = pattern_XSimplexConnectionToConnectionRule_24_2_matchsrctrgcontext_bindingFFFFFFFFFFFBB(
				targetMatch, sourceMatch);
		if (result_pattern_XSimplexConnectionToConnectionRule_24_2_matchsrctrgcontext_binding != null) {
			Container container = (Container) result_pattern_XSimplexConnectionToConnectionRule_24_2_matchsrctrgcontext_binding[0];
			Cable cable = (Cable) result_pattern_XSimplexConnectionToConnectionRule_24_2_matchsrctrgcontext_binding[1];
			XDevice xDevice1 = (XDevice) result_pattern_XSimplexConnectionToConnectionRule_24_2_matchsrctrgcontext_binding[2];
			XCable xCable = (XCable) result_pattern_XSimplexConnectionToConnectionRule_24_2_matchsrctrgcontext_binding[3];
			Device device2 = (Device) result_pattern_XSimplexConnectionToConnectionRule_24_2_matchsrctrgcontext_binding[4];
			Device device1 = (Device) result_pattern_XSimplexConnectionToConnectionRule_24_2_matchsrctrgcontext_binding[5];
			CableAttributes cableAttributes = (CableAttributes) result_pattern_XSimplexConnectionToConnectionRule_24_2_matchsrctrgcontext_binding[6];
			XContainer xContainer = (XContainer) result_pattern_XSimplexConnectionToConnectionRule_24_2_matchsrctrgcontext_binding[7];
			Connections connection1 = (Connections) result_pattern_XSimplexConnectionToConnectionRule_24_2_matchsrctrgcontext_binding[8];
			XDevice xDevice2 = (XDevice) result_pattern_XSimplexConnectionToConnectionRule_24_2_matchsrctrgcontext_binding[9];
			Connections connection2 = (Connections) result_pattern_XSimplexConnectionToConnectionRule_24_2_matchsrctrgcontext_binding[10];

			Object[] result_pattern_XSimplexConnectionToConnectionRule_24_2_matchsrctrgcontext_black = pattern_XSimplexConnectionToConnectionRule_24_2_matchsrctrgcontext_blackBBBBBBBBBBBBB(
					container, cable, xDevice1, xCable, device2, device1, cableAttributes, xContainer, connection1,
					xDevice2, connection2, sourceMatch, targetMatch);
			if (result_pattern_XSimplexConnectionToConnectionRule_24_2_matchsrctrgcontext_black != null) {

				return new Object[] { container, cable, xDevice1, xCable, device2, device1, cableAttributes, xContainer,
						connection1, xDevice2, connection2, sourceMatch, targetMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_XSimplexConnectionToConnectionRule_24_3_solvecsp_bindingFBBBBBBBBBBBBBB(
			XSimplexConnectionToConnectionRule _this, Container container, Cable cable, XDevice xDevice1, XCable xCable,
			Device device2, Device device1, CableAttributes cableAttributes, XContainer xContainer,
			Connections connection1, XDevice xDevice2, Connections connection2, Match sourceMatch, Match targetMatch) {
		CSP _localVariable_11 = _this.isApplicable_solveCsp_CC(container, cable, xDevice1, xCable, device2, device1,
				cableAttributes, xContainer, connection1, xDevice2, connection2, sourceMatch, targetMatch);
		CSP csp = _localVariable_11;
		if (csp != null) {
			return new Object[] { csp, _this, container, cable, xDevice1, xCable, device2, device1, cableAttributes,
					xContainer, connection1, xDevice2, connection2, sourceMatch, targetMatch };
		}
		return null;
	}

	public static final Object[] pattern_XSimplexConnectionToConnectionRule_24_3_solvecsp_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_XSimplexConnectionToConnectionRule_24_3_solvecsp_bindingAndBlackFBBBBBBBBBBBBBB(
			XSimplexConnectionToConnectionRule _this, Container container, Cable cable, XDevice xDevice1, XCable xCable,
			Device device2, Device device1, CableAttributes cableAttributes, XContainer xContainer,
			Connections connection1, XDevice xDevice2, Connections connection2, Match sourceMatch, Match targetMatch) {
		Object[] result_pattern_XSimplexConnectionToConnectionRule_24_3_solvecsp_binding = pattern_XSimplexConnectionToConnectionRule_24_3_solvecsp_bindingFBBBBBBBBBBBBBB(
				_this, container, cable, xDevice1, xCable, device2, device1, cableAttributes, xContainer, connection1,
				xDevice2, connection2, sourceMatch, targetMatch);
		if (result_pattern_XSimplexConnectionToConnectionRule_24_3_solvecsp_binding != null) {
			CSP csp = (CSP) result_pattern_XSimplexConnectionToConnectionRule_24_3_solvecsp_binding[0];

			Object[] result_pattern_XSimplexConnectionToConnectionRule_24_3_solvecsp_black = pattern_XSimplexConnectionToConnectionRule_24_3_solvecsp_blackB(
					csp);
			if (result_pattern_XSimplexConnectionToConnectionRule_24_3_solvecsp_black != null) {

				return new Object[] { csp, _this, container, cable, xDevice1, xCable, device2, device1, cableAttributes,
						xContainer, connection1, xDevice2, connection2, sourceMatch, targetMatch };
			}
		}
		return null;
	}

	public static final boolean pattern_XSimplexConnectionToConnectionRule_24_4_checkCSP_expressionFB(CSP csp) {
		boolean _localVariable_0 = csp.check();
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Iterable<Object[]> pattern_XSimplexConnectionToConnectionRule_24_5_matchcorrcontext_blackBBBBFBFFBBB(
			Cable cable, XDevice xDevice1, XCable xCable, Device device2, Device device1, XDevice xDevice2,
			Match sourceMatch, Match targetMatch) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (!xDevice1.equals(xDevice2)) {
			if (!device1.equals(device2)) {
				if (!sourceMatch.equals(targetMatch)) {
					for (XCableToCable xCableToCable : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(cable, XCableToCable.class, "target")) {
						if (xCable.equals(xCableToCable.getSource())) {
							for (XDeviceToDevice xDeviceToDevice : org.moflon.core.utilities.eMoflonEMFUtil
									.getOppositeReferenceTyped(xDevice1, XDeviceToDevice.class, "source")) {
								if (device1.equals(xDeviceToDevice.getTarget())) {
									for (XDeviceToDevice xDeviceToDevice2 : org.moflon.core.utilities.eMoflonEMFUtil
											.getOppositeReferenceTyped(device2, XDeviceToDevice.class, "target")) {
										if (!xDeviceToDevice.equals(xDeviceToDevice2)) {
											if (xDevice2.equals(xDeviceToDevice2.getSource())) {
												_result.add(new Object[] { cable, xDevice1, xCable, device2,
														xDeviceToDevice2, device1, xDeviceToDevice, xCableToCable,
														xDevice2, sourceMatch, targetMatch });
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

	public static final Object[] pattern_XSimplexConnectionToConnectionRule_24_5_matchcorrcontext_greenBBBBBF(
			XDeviceToDevice xDeviceToDevice2, XDeviceToDevice xDeviceToDevice, XCableToCable xCableToCable,
			Match sourceMatch, Match targetMatch) {
		CCMatch ccMatch = RuntimeFactory.eINSTANCE.createCCMatch();
		String ccMatch_ruleName_prime = "XSimplexConnectionToConnectionRule";
		ccMatch.setSourceMatch(sourceMatch);
		ccMatch.setTargetMatch(targetMatch);
		ccMatch.getAllContextElements().add(xDeviceToDevice2);
		ccMatch.getAllContextElements().add(xDeviceToDevice);
		ccMatch.getAllContextElements().add(xCableToCable);
		ccMatch.setRuleName(ccMatch_ruleName_prime);
		return new Object[] { xDeviceToDevice2, xDeviceToDevice, xCableToCable, sourceMatch, targetMatch, ccMatch };
	}

	public static final Object[] pattern_XSimplexConnectionToConnectionRule_24_6_createcorrespondence_blackBBBBBBBBBBBB(
			Container container, Cable cable, XDevice xDevice1, XCable xCable, Device device2, Device device1,
			CableAttributes cableAttributes, XContainer xContainer, Connections connection1, XDevice xDevice2,
			Connections connection2, CCMatch ccMatch) {
		if (!xDevice1.equals(xDevice2)) {
			if (!device1.equals(device2)) {
				if (!connection1.equals(connection2)) {
					return new Object[] { container, cable, xDevice1, xCable, device2, device1, cableAttributes,
							xContainer, connection1, xDevice2, connection2, ccMatch };
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_XSimplexConnectionToConnectionRule_24_7_addtoreturnedresult_blackBB(
			IsApplicableRuleResult result, CCMatch ccMatch) {
		return new Object[] { result, ccMatch };
	}

	public static final Object[] pattern_XSimplexConnectionToConnectionRule_24_7_addtoreturnedresult_greenBB(
			IsApplicableRuleResult result, CCMatch ccMatch) {
		result.getIsApplicableMatch().add(ccMatch);
		boolean result_success_prime = Boolean.valueOf(true);
		String ccMatch_ruleName_prime = "XSimplexConnectionToConnectionRule";
		result.setSuccess(Boolean.valueOf(result_success_prime));
		ccMatch.setRuleName(ccMatch_ruleName_prime);
		return new Object[] { result, ccMatch };
	}

	public static final IsApplicableRuleResult pattern_XSimplexConnectionToConnectionRule_24_8_expressionFB(
			IsApplicableRuleResult result) {
		IsApplicableRuleResult _result = result;
		return _result;
	}

	public static final Object[] pattern_XSimplexConnectionToConnectionRule_27_1_matchtggpattern_blackBBBBBBB(
			XDevice xDevice1, XCable xCable, CableAttributes cableAttributes, XContainer xContainer,
			Connections connection1, XDevice xDevice2, Connections connection2) {
		if (!xDevice1.equals(xDevice2)) {
			if (!connection1.equals(connection2)) {
				if (connection1.equals(xDevice1.getConnections())) {
					if (cableAttributes.equals(xCable.getCableAttributes())) {
						if (xContainer.getElements().contains(xCable)) {
							if (xContainer.getElements().contains(xDevice2)) {
								if (xDevice1.equals(cableAttributes.getEndPoint1())) {
									if (xContainer.getElements().contains(xDevice1)) {
										if (connection1.getOutgoing().contains(xCable)) {
											if (xDevice2.equals(cableAttributes.getEndPoint2())) {
												if (connection2.equals(xDevice2.getConnections())) {
													if (connection2.getIncoming().contains(xCable)) {
														return new Object[] { xDevice1, xCable, cableAttributes,
																xContainer, connection1, xDevice2, connection2 };
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

	public static final Object[] pattern_XSimplexConnectionToConnectionRule_27_1_matchtggpattern_greenB(
			CableAttributes cableAttributes) {
		boolean cableAttributes_isDuplex_prime = Boolean.valueOf(false);
		cableAttributes.setIsDuplex(Boolean.valueOf(cableAttributes_isDuplex_prime));
		return new Object[] { cableAttributes };
	}

	public static final boolean pattern_XSimplexConnectionToConnectionRule_27_2_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_XSimplexConnectionToConnectionRule_27_3_expressionF() {
		boolean _result = Boolean.valueOf(false);
		return _result;
	}

	public static final Object[] pattern_XSimplexConnectionToConnectionRule_28_1_matchtggpattern_blackBBBB(
			Container container, Cable cable, Device device2, Device device1) {
		if (!device1.equals(device2)) {
			if (device1.equals(cable.getSource())) {
				if (container.getCables().contains(cable)) {
					if (container.getDevices().contains(device1)) {
						if (container.getDevices().contains(device2)) {
							if (device2.equals(cable.getTarget())) {
								return new Object[] { container, cable, device2, device1 };
							}
						}
					}
				}
			}
		}
		return null;
	}

	public static final boolean pattern_XSimplexConnectionToConnectionRule_28_2_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_XSimplexConnectionToConnectionRule_28_3_expressionF() {
		boolean _result = Boolean.valueOf(false);
		return _result;
	}

	public static final Object[] pattern_XSimplexConnectionToConnectionRule_29_1_createresult_blackB(
			XSimplexConnectionToConnectionRule _this) {
		return new Object[] { _this };
	}

	public static final Object[] pattern_XSimplexConnectionToConnectionRule_29_1_createresult_greenFF() {
		IsApplicableMatch isApplicableMatch = RuntimeFactory.eINSTANCE.createIsApplicableMatch();
		ModelgeneratorRuleResult ruleResult = RuntimeFactory.eINSTANCE.createModelgeneratorRuleResult();
		boolean ruleResult_success_prime = Boolean.valueOf(false);
		ruleResult.setSuccess(Boolean.valueOf(ruleResult_success_prime));
		return new Object[] { isApplicableMatch, ruleResult };
	}

	public static final Object[] pattern_XSimplexConnectionToConnectionRule_29_2_isapplicablecore_black_nac_0BB(
			ModelgeneratorRuleResult ruleResult, Container container) {
		if (ruleResult.getTargetObjects().contains(container)) {
			return new Object[] { ruleResult, container };
		}
		return null;
	}

	public static final Object[] pattern_XSimplexConnectionToConnectionRule_29_2_isapplicablecore_black_nac_1BB(
			ModelgeneratorRuleResult ruleResult, Cable cable) {
		if (ruleResult.getTargetObjects().contains(cable)) {
			return new Object[] { ruleResult, cable };
		}
		return null;
	}

	public static final Object[] pattern_XSimplexConnectionToConnectionRule_29_2_isapplicablecore_black_nac_2BB(
			ModelgeneratorRuleResult ruleResult, XCableToCable xCableToCable) {
		if (ruleResult.getCorrObjects().contains(xCableToCable)) {
			return new Object[] { ruleResult, xCableToCable };
		}
		return null;
	}

	public static final Object[] pattern_XSimplexConnectionToConnectionRule_29_2_isapplicablecore_black_nac_3BB(
			ModelgeneratorRuleResult ruleResult, XCable xCable) {
		if (ruleResult.getSourceObjects().contains(xCable)) {
			return new Object[] { ruleResult, xCable };
		}
		return null;
	}

	public static final Object[] pattern_XSimplexConnectionToConnectionRule_29_2_isapplicablecore_black_nac_4BB(
			ModelgeneratorRuleResult ruleResult, CableAttributes cableAttributes) {
		if (ruleResult.getSourceObjects().contains(cableAttributes)) {
			return new Object[] { ruleResult, cableAttributes };
		}
		return null;
	}

	public static final Object[] pattern_XSimplexConnectionToConnectionRule_29_2_isapplicablecore_black_nac_5BB(
			ModelgeneratorRuleResult ruleResult, XContainer xContainer) {
		if (ruleResult.getSourceObjects().contains(xContainer)) {
			return new Object[] { ruleResult, xContainer };
		}
		return null;
	}

	public static final Object[] pattern_XSimplexConnectionToConnectionRule_29_2_isapplicablecore_black_nac_6BB(
			ModelgeneratorRuleResult ruleResult, XDevice xDevice2) {
		if (ruleResult.getSourceObjects().contains(xDevice2)) {
			return new Object[] { ruleResult, xDevice2 };
		}
		return null;
	}

	public static final Object[] pattern_XSimplexConnectionToConnectionRule_29_2_isapplicablecore_black_nac_7BB(
			ModelgeneratorRuleResult ruleResult, Connections connection2) {
		if (ruleResult.getSourceObjects().contains(connection2)) {
			return new Object[] { ruleResult, connection2 };
		}
		return null;
	}

	public static final Object[] pattern_XSimplexConnectionToConnectionRule_29_2_isapplicablecore_black_nac_8BB(
			ModelgeneratorRuleResult ruleResult, XDeviceToDevice xDeviceToDevice2) {
		if (ruleResult.getCorrObjects().contains(xDeviceToDevice2)) {
			return new Object[] { ruleResult, xDeviceToDevice2 };
		}
		return null;
	}

	public static final Object[] pattern_XSimplexConnectionToConnectionRule_29_2_isapplicablecore_black_nac_9BB(
			ModelgeneratorRuleResult ruleResult, Device device2) {
		if (ruleResult.getTargetObjects().contains(device2)) {
			return new Object[] { ruleResult, device2 };
		}
		return null;
	}

	public static final Object[] pattern_XSimplexConnectionToConnectionRule_29_2_isapplicablecore_black_nac_10BB(
			ModelgeneratorRuleResult ruleResult, XDevice xDevice1) {
		if (ruleResult.getSourceObjects().contains(xDevice1)) {
			return new Object[] { ruleResult, xDevice1 };
		}
		return null;
	}

	public static final Object[] pattern_XSimplexConnectionToConnectionRule_29_2_isapplicablecore_black_nac_11BB(
			ModelgeneratorRuleResult ruleResult, Connections connection1) {
		if (ruleResult.getSourceObjects().contains(connection1)) {
			return new Object[] { ruleResult, connection1 };
		}
		return null;
	}

	public static final Object[] pattern_XSimplexConnectionToConnectionRule_29_2_isapplicablecore_black_nac_12BB(
			ModelgeneratorRuleResult ruleResult, XDeviceToDevice xDeviceToDevice) {
		if (ruleResult.getCorrObjects().contains(xDeviceToDevice)) {
			return new Object[] { ruleResult, xDeviceToDevice };
		}
		return null;
	}

	public static final Object[] pattern_XSimplexConnectionToConnectionRule_29_2_isapplicablecore_black_nac_13BB(
			ModelgeneratorRuleResult ruleResult, Device device1) {
		if (ruleResult.getTargetObjects().contains(device1)) {
			return new Object[] { ruleResult, device1 };
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_XSimplexConnectionToConnectionRule_29_2_isapplicablecore_blackFFFFFFFFFFFFFFFBB(
			RuleEntryContainer ruleEntryContainer, ModelgeneratorRuleResult ruleResult) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		for (RuleEntryList xCableToCableList : ruleEntryContainer.getRuleEntryList()) {
			for (EObject tmpXCableToCable : xCableToCableList.getEntryObjects()) {
				if (tmpXCableToCable instanceof XCableToCable) {
					XCableToCable xCableToCable = (XCableToCable) tmpXCableToCable;
					Cable cable = xCableToCable.getTarget();
					if (cable != null) {
						XCable xCable = xCableToCable.getSource();
						if (xCable != null) {
							CableAttributes cableAttributes = xCable.getCableAttributes();
							if (cableAttributes != null) {
								if (pattern_XSimplexConnectionToConnectionRule_29_2_isapplicablecore_black_nac_2BB(
										ruleResult, xCableToCable) == null) {
									if (pattern_XSimplexConnectionToConnectionRule_29_2_isapplicablecore_black_nac_1BB(
											ruleResult, cable) == null) {
										if (pattern_XSimplexConnectionToConnectionRule_29_2_isapplicablecore_black_nac_3BB(
												ruleResult, xCable) == null) {
											if (pattern_XSimplexConnectionToConnectionRule_29_2_isapplicablecore_black_nac_4BB(
													ruleResult, cableAttributes) == null) {
												for (Container container : org.moflon.core.utilities.eMoflonEMFUtil
														.getOppositeReferenceTyped(cable, Container.class, "cables")) {
													if (pattern_XSimplexConnectionToConnectionRule_29_2_isapplicablecore_black_nac_0BB(
															ruleResult, container) == null) {
														for (Device device2 : container.getDevices()) {
															if (pattern_XSimplexConnectionToConnectionRule_29_2_isapplicablecore_black_nac_9BB(
																	ruleResult, device2) == null) {
																for (Device device1 : container.getDevices()) {
																	if (!device1.equals(device2)) {
																		if (pattern_XSimplexConnectionToConnectionRule_29_2_isapplicablecore_black_nac_13BB(
																				ruleResult, device1) == null) {
																			for (XContainer xContainer : org.moflon.core.utilities.eMoflonEMFUtil
																					.getOppositeReferenceTyped(xCable,
																							XContainer.class,
																							"elements")) {
																				if (pattern_XSimplexConnectionToConnectionRule_29_2_isapplicablecore_black_nac_5BB(
																						ruleResult,
																						xContainer) == null) {
																					for (NetworkElements tmpXDevice2 : xContainer
																							.getElements()) {
																						if (tmpXDevice2 instanceof XDevice) {
																							XDevice xDevice2 = (XDevice) tmpXDevice2;
																							Connections connection2 = xDevice2
																									.getConnections();
																							if (connection2 != null) {
																								if (pattern_XSimplexConnectionToConnectionRule_29_2_isapplicablecore_black_nac_6BB(
																										ruleResult,
																										xDevice2) == null) {
																									if (pattern_XSimplexConnectionToConnectionRule_29_2_isapplicablecore_black_nac_7BB(
																											ruleResult,
																											connection2) == null) {
																										for (NetworkElements tmpXDevice1 : xContainer
																												.getElements()) {
																											if (tmpXDevice1 instanceof XDevice) {
																												XDevice xDevice1 = (XDevice) tmpXDevice1;
																												if (!xDevice1
																														.equals(xDevice2)) {
																													Connections connection1 = xDevice1
																															.getConnections();
																													if (connection1 != null) {
																														if (!connection1
																																.equals(connection2)) {
																															if (pattern_XSimplexConnectionToConnectionRule_29_2_isapplicablecore_black_nac_10BB(
																																	ruleResult,
																																	xDevice1) == null) {
																																if (pattern_XSimplexConnectionToConnectionRule_29_2_isapplicablecore_black_nac_11BB(
																																		ruleResult,
																																		connection1) == null) {
																																	for (XDeviceToDevice xDeviceToDevice2 : org.moflon.core.utilities.eMoflonEMFUtil
																																			.getOppositeReferenceTyped(
																																					device2,
																																					XDeviceToDevice.class,
																																					"target")) {
																																		if (xDevice2
																																				.equals(xDeviceToDevice2
																																						.getSource())) {
																																			if (pattern_XSimplexConnectionToConnectionRule_29_2_isapplicablecore_black_nac_8BB(
																																					ruleResult,
																																					xDeviceToDevice2) == null) {
																																				for (XDeviceToDevice xDeviceToDevice : org.moflon.core.utilities.eMoflonEMFUtil
																																						.getOppositeReferenceTyped(
																																								device1,
																																								XDeviceToDevice.class,
																																								"target")) {
																																					if (!xDeviceToDevice
																																							.equals(xDeviceToDevice2)) {
																																						if (xDevice1
																																								.equals(xDeviceToDevice
																																										.getSource())) {
																																							if (pattern_XSimplexConnectionToConnectionRule_29_2_isapplicablecore_black_nac_12BB(
																																									ruleResult,
																																									xDeviceToDevice) == null) {
																																								_result.add(
																																										new Object[] {
																																												xCableToCableList,
																																												container,
																																												cable,
																																												xCableToCable,
																																												xCable,
																																												cableAttributes,
																																												xContainer,
																																												xDevice2,
																																												connection2,
																																												xDeviceToDevice2,
																																												device2,
																																												xDevice1,
																																												connection1,
																																												xDeviceToDevice,
																																												device1,
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
		return _result;
	}

	public static final Object[] pattern_XSimplexConnectionToConnectionRule_29_2_isapplicablecore_greenB(
			CableAttributes cableAttributes) {
		boolean cableAttributes_isDuplex_prime = Boolean.valueOf(false);
		cableAttributes.setIsDuplex(Boolean.valueOf(cableAttributes_isDuplex_prime));
		return new Object[] { cableAttributes };
	}

	public static final Object[] pattern_XSimplexConnectionToConnectionRule_29_3_solveCSP_bindingFBBBBBBBBBBBBBBBBB(
			XSimplexConnectionToConnectionRule _this, IsApplicableMatch isApplicableMatch, Container container,
			Cable cable, XDevice xDevice1, XCable xCable, Device device2, XDeviceToDevice xDeviceToDevice2,
			Device device1, XDeviceToDevice xDeviceToDevice, XCableToCable xCableToCable,
			CableAttributes cableAttributes, XContainer xContainer, Connections connection1, XDevice xDevice2,
			Connections connection2, ModelgeneratorRuleResult ruleResult) {
		CSP _localVariable_0 = _this.generateModel_solveCsp_BWD(isApplicableMatch, container, cable, xDevice1, xCable,
				device2, xDeviceToDevice2, device1, xDeviceToDevice, xCableToCable, cableAttributes, xContainer,
				connection1, xDevice2, connection2, ruleResult);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, container, cable, xDevice1, xCable, device2,
					xDeviceToDevice2, device1, xDeviceToDevice, xCableToCable, cableAttributes, xContainer, connection1,
					xDevice2, connection2, ruleResult };
		}
		return null;
	}

	public static final Object[] pattern_XSimplexConnectionToConnectionRule_29_3_solveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_XSimplexConnectionToConnectionRule_29_3_solveCSP_bindingAndBlackFBBBBBBBBBBBBBBBBB(
			XSimplexConnectionToConnectionRule _this, IsApplicableMatch isApplicableMatch, Container container,
			Cable cable, XDevice xDevice1, XCable xCable, Device device2, XDeviceToDevice xDeviceToDevice2,
			Device device1, XDeviceToDevice xDeviceToDevice, XCableToCable xCableToCable,
			CableAttributes cableAttributes, XContainer xContainer, Connections connection1, XDevice xDevice2,
			Connections connection2, ModelgeneratorRuleResult ruleResult) {
		Object[] result_pattern_XSimplexConnectionToConnectionRule_29_3_solveCSP_binding = pattern_XSimplexConnectionToConnectionRule_29_3_solveCSP_bindingFBBBBBBBBBBBBBBBBB(
				_this, isApplicableMatch, container, cable, xDevice1, xCable, device2, xDeviceToDevice2, device1,
				xDeviceToDevice, xCableToCable, cableAttributes, xContainer, connection1, xDevice2, connection2,
				ruleResult);
		if (result_pattern_XSimplexConnectionToConnectionRule_29_3_solveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_XSimplexConnectionToConnectionRule_29_3_solveCSP_binding[0];

			Object[] result_pattern_XSimplexConnectionToConnectionRule_29_3_solveCSP_black = pattern_XSimplexConnectionToConnectionRule_29_3_solveCSP_blackB(
					csp);
			if (result_pattern_XSimplexConnectionToConnectionRule_29_3_solveCSP_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, container, cable, xDevice1, xCable, device2,
						xDeviceToDevice2, device1, xDeviceToDevice, xCableToCable, cableAttributes, xContainer,
						connection1, xDevice2, connection2, ruleResult };
			}
		}
		return null;
	}

	public static final boolean pattern_XSimplexConnectionToConnectionRule_29_4_checkCSP_expressionFBB(
			XSimplexConnectionToConnectionRule _this, CSP csp) {
		boolean _localVariable_0 = _this.generateModel_checkCsp_BWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_XSimplexConnectionToConnectionRule_29_5_checknacs_blackBBBBBBBBBBBBBB(
			Container container, Cable cable, XDevice xDevice1, XCable xCable, Device device2,
			XDeviceToDevice xDeviceToDevice2, Device device1, XDeviceToDevice xDeviceToDevice,
			XCableToCable xCableToCable, CableAttributes cableAttributes, XContainer xContainer,
			Connections connection1, XDevice xDevice2, Connections connection2) {
		if (!xDevice1.equals(xDevice2)) {
			if (!device1.equals(device2)) {
				if (!xDeviceToDevice.equals(xDeviceToDevice2)) {
					if (!connection1.equals(connection2)) {
						return new Object[] { container, cable, xDevice1, xCable, device2, xDeviceToDevice2, device1,
								xDeviceToDevice, xCableToCable, cableAttributes, xContainer, connection1, xDevice2,
								connection2 };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_XSimplexConnectionToConnectionRule_29_5_checknacs_greenB(
			CableAttributes cableAttributes) {
		boolean cableAttributes_isDuplex_prime = Boolean.valueOf(false);
		cableAttributes.setIsDuplex(Boolean.valueOf(cableAttributes_isDuplex_prime));
		return new Object[] { cableAttributes };
	}

	public static final Object[] pattern_XSimplexConnectionToConnectionRule_29_6_perform_blackBBBBBBBBBBBBBBB(
			Container container, Cable cable, XDevice xDevice1, XCable xCable, Device device2,
			XDeviceToDevice xDeviceToDevice2, Device device1, XDeviceToDevice xDeviceToDevice,
			XCableToCable xCableToCable, CableAttributes cableAttributes, XContainer xContainer,
			Connections connection1, XDevice xDevice2, Connections connection2, ModelgeneratorRuleResult ruleResult) {
		if (!xDevice1.equals(xDevice2)) {
			if (!device1.equals(device2)) {
				if (!xDeviceToDevice.equals(xDeviceToDevice2)) {
					if (!connection1.equals(connection2)) {
						return new Object[] { container, cable, xDevice1, xCable, device2, xDeviceToDevice2, device1,
								xDeviceToDevice, xCableToCable, cableAttributes, xContainer, connection1, xDevice2,
								connection2, ruleResult };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_XSimplexConnectionToConnectionRule_29_6_perform_greenBBBBBBBBBB(Cable cable,
			XDevice xDevice1, XCable xCable, Device device2, Device device1, CableAttributes cableAttributes,
			Connections connection1, XDevice xDevice2, Connections connection2, ModelgeneratorRuleResult ruleResult) {
		cable.setSource(device1);
		cable.setTarget(device2);
		cableAttributes.setEndPoint1(xDevice1);
		connection1.getOutgoing().add(xCable);
		cableAttributes.setEndPoint2(xDevice2);
		connection2.getIncoming().add(xCable);
		boolean cableAttributes_isDuplex_prime = Boolean.valueOf(false);
		boolean ruleResult_success_prime = Boolean.valueOf(true);
		int _localVariable_0 = ruleResult.getIncrementedPerformCount();
		cableAttributes.setIsDuplex(Boolean.valueOf(cableAttributes_isDuplex_prime));
		ruleResult.setSuccess(Boolean.valueOf(ruleResult_success_prime));
		int ruleResult_performCount_prime = Integer.valueOf(_localVariable_0);
		ruleResult.setPerformCount(Integer.valueOf(ruleResult_performCount_prime));
		return new Object[] { cable, xDevice1, xCable, device2, device1, cableAttributes, connection1, xDevice2,
				connection2, ruleResult };
	}

	public static final ModelgeneratorRuleResult pattern_XSimplexConnectionToConnectionRule_29_7_expressionFB(
			ModelgeneratorRuleResult ruleResult) {
		ModelgeneratorRuleResult _result = ruleResult;
		return _result;
	}

	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} //XSimplexConnectionToConnectionRuleImpl
