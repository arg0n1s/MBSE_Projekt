/**
 */
package ImplementationTransformator.Rules.impl;

import ImplementationTransformator.Rules.RulesPackage;
import ImplementationTransformator.Rules.XDuplexConnectionToConnectionRule;

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
 * An implementation of the model object '<em><b>XDuplex Connection To Connection Rule</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class XDuplexConnectionToConnectionRuleImpl extends AbstractRuleImpl
		implements XDuplexConnectionToConnectionRule {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected XDuplexConnectionToConnectionRuleImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RulesPackage.eINSTANCE.getXDuplexConnectionToConnectionRule();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAppropriate_FWD(Match match, Connections connection2, XCable xCable, XDevice xDevice1,
			XContainer xContainer, Connections connection1, XDevice xDevice2, CableAttributes cableAttributes) {

		Object[] result1_black = XDuplexConnectionToConnectionRuleImpl
				.pattern_XDuplexConnectionToConnectionRule_0_1_initialbindings_blackBBBBBBBBB(this, match, connection2,
						xCable, xDevice1, xContainer, connection1, xDevice2, cableAttributes);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[match] = " + match + ", " + "[connection2] = " + connection2 + ", " + "[xCable] = " + xCable
					+ ", " + "[xDevice1] = " + xDevice1 + ", " + "[xContainer] = " + xContainer + ", "
					+ "[connection1] = " + connection1 + ", " + "[xDevice2] = " + xDevice2 + ", "
					+ "[cableAttributes] = " + cableAttributes + ".");
		}

		Object[] result2_bindingAndBlack = XDuplexConnectionToConnectionRuleImpl
				.pattern_XDuplexConnectionToConnectionRule_0_2_SolveCSP_bindingAndBlackFBBBBBBBBB(this, match,
						connection2, xCable, xDevice1, xContainer, connection1, xDevice2, cableAttributes);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[match] = " + match + ", " + "[connection2] = " + connection2 + ", " + "[xCable] = " + xCable
					+ ", " + "[xDevice1] = " + xDevice1 + ", " + "[xContainer] = " + xContainer + ", "
					+ "[connection1] = " + connection1 + ", " + "[xDevice2] = " + xDevice2 + ", "
					+ "[cableAttributes] = " + cableAttributes + ".");
		}
		CSP csp = (CSP) result2_bindingAndBlack[0];
		// 
		if (XDuplexConnectionToConnectionRuleImpl
				.pattern_XDuplexConnectionToConnectionRule_0_3_CheckCSP_expressionFBB(this, csp)) {

			Object[] result4_black = XDuplexConnectionToConnectionRuleImpl
					.pattern_XDuplexConnectionToConnectionRule_0_4_collectelementstobetranslated_blackBBBBBBBB(match,
							connection2, xCable, xDevice1, xContainer, connection1, xDevice2, cableAttributes);
			if (result4_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match + ", "
						+ "[connection2] = " + connection2 + ", " + "[xCable] = " + xCable + ", " + "[xDevice1] = "
						+ xDevice1 + ", " + "[xContainer] = " + xContainer + ", " + "[connection1] = " + connection1
						+ ", " + "[xDevice2] = " + xDevice2 + ", " + "[cableAttributes] = " + cableAttributes + ".");
			}
			XDuplexConnectionToConnectionRuleImpl
					.pattern_XDuplexConnectionToConnectionRule_0_4_collectelementstobetranslated_greenBBBBBBBFFFF(match,
							connection2, xCable, xDevice1, connection1, xDevice2, cableAttributes);
			//nothing EMoflonEdge connection2__xCable____incoming = (EMoflonEdge) result4_green[7];
			//nothing EMoflonEdge connection1__xCable____outgoing = (EMoflonEdge) result4_green[8];
			//nothing EMoflonEdge cableAttributes__xDevice2____endPoint2 = (EMoflonEdge) result4_green[9];
			//nothing EMoflonEdge cableAttributes__xDevice1____endPoint1 = (EMoflonEdge) result4_green[10];

			Object[] result5_black = XDuplexConnectionToConnectionRuleImpl
					.pattern_XDuplexConnectionToConnectionRule_0_5_collectcontextelements_blackBBBBBBBB(match,
							connection2, xCable, xDevice1, xContainer, connection1, xDevice2, cableAttributes);
			if (result5_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match + ", "
						+ "[connection2] = " + connection2 + ", " + "[xCable] = " + xCable + ", " + "[xDevice1] = "
						+ xDevice1 + ", " + "[xContainer] = " + xContainer + ", " + "[connection1] = " + connection1
						+ ", " + "[xDevice2] = " + xDevice2 + ", " + "[cableAttributes] = " + cableAttributes + ".");
			}
			XDuplexConnectionToConnectionRuleImpl
					.pattern_XDuplexConnectionToConnectionRule_0_5_collectcontextelements_greenBBBBBBBBFFFFFF(match,
							connection2, xCable, xDevice1, xContainer, connection1, xDevice2, cableAttributes);
			//nothing EMoflonEdge xCable__cableAttributes____cableAttributes = (EMoflonEdge) result5_green[8];
			//nothing EMoflonEdge xContainer__xDevice2____elements = (EMoflonEdge) result5_green[9];
			//nothing EMoflonEdge xDevice2__connection2____connections = (EMoflonEdge) result5_green[10];
			//nothing EMoflonEdge xDevice1__connection1____connections = (EMoflonEdge) result5_green[11];
			//nothing EMoflonEdge xContainer__xCable____elements = (EMoflonEdge) result5_green[12];
			//nothing EMoflonEdge xContainer__xDevice1____elements = (EMoflonEdge) result5_green[13];

			// 
			XDuplexConnectionToConnectionRuleImpl
					.pattern_XDuplexConnectionToConnectionRule_0_6_registerobjectstomatch_expressionBBBBBBBBB(this,
							match, connection2, xCable, xDevice1, xContainer, connection1, xDevice2, cableAttributes);
			return XDuplexConnectionToConnectionRuleImpl.pattern_XDuplexConnectionToConnectionRule_0_7_expressionF();
		} else {
			return XDuplexConnectionToConnectionRuleImpl.pattern_XDuplexConnectionToConnectionRule_0_8_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PerformRuleResult perform_FWD(IsApplicableMatch isApplicableMatch) {

		Object[] result1_bindingAndBlack = XDuplexConnectionToConnectionRuleImpl
				.pattern_XDuplexConnectionToConnectionRule_1_1_performtransformation_bindingAndBlackFFFFFFFFFFFFFFFFFBB(
						this, isApplicableMatch);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[isApplicableMatch] = " + isApplicableMatch + ".");
		}
		Container container = (Container) result1_bindingAndBlack[0];
		Connections connection2 = (Connections) result1_bindingAndBlack[1];
		XDeviceToDevice xDeviceToDevice2 = (XDeviceToDevice) result1_bindingAndBlack[2];
		XCable xCable = (XCable) result1_bindingAndBlack[3];
		XDevice xDevice1 = (XDevice) result1_bindingAndBlack[4];
		Cable cable2 = (Cable) result1_bindingAndBlack[5];
		XContainer xContainer = (XContainer) result1_bindingAndBlack[6];
		Connections connection1 = (Connections) result1_bindingAndBlack[7];
		XDeviceToDevice xDeviceToDevice = (XDeviceToDevice) result1_bindingAndBlack[8];
		XCableToCable xCableToCable2 = (XCableToCable) result1_bindingAndBlack[9];
		XDevice xDevice2 = (XDevice) result1_bindingAndBlack[10];
		Device device2 = (Device) result1_bindingAndBlack[11];
		CableAttributes cableAttributes = (CableAttributes) result1_bindingAndBlack[12];
		Cable cable1 = (Cable) result1_bindingAndBlack[13];
		XCableToCable xCableToCable1 = (XCableToCable) result1_bindingAndBlack[14];
		Device device1 = (Device) result1_bindingAndBlack[15];
		//nothing CSP csp = (CSP) result1_bindingAndBlack[16];
		XDuplexConnectionToConnectionRuleImpl
				.pattern_XDuplexConnectionToConnectionRule_1_1_performtransformation_greenBBBB(cable2, device2, cable1,
						device1);

		Object[] result2_green = XDuplexConnectionToConnectionRuleImpl
				.pattern_XDuplexConnectionToConnectionRule_1_2_collecttranslatedelements_greenF();
		if (result2_green == null) {
			throw new RuntimeException("Pattern matching failed.");
		}
		PerformRuleResult ruleresult = (PerformRuleResult) result2_green[0];

		Object[] result3_black = XDuplexConnectionToConnectionRuleImpl
				.pattern_XDuplexConnectionToConnectionRule_1_3_bookkeepingforedges_blackBBBBBBBBBBBBBBBBB(ruleresult,
						container, connection2, xDeviceToDevice2, xCable, xDevice1, cable2, xContainer, connection1,
						xDeviceToDevice, xCableToCable2, xDevice2, device2, cableAttributes, cable1, xCableToCable1,
						device1);
		if (result3_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[ruleresult] = " + ruleresult
					+ ", " + "[container] = " + container + ", " + "[connection2] = " + connection2 + ", "
					+ "[xDeviceToDevice2] = " + xDeviceToDevice2 + ", " + "[xCable] = " + xCable + ", "
					+ "[xDevice1] = " + xDevice1 + ", " + "[cable2] = " + cable2 + ", " + "[xContainer] = " + xContainer
					+ ", " + "[connection1] = " + connection1 + ", " + "[xDeviceToDevice] = " + xDeviceToDevice + ", "
					+ "[xCableToCable2] = " + xCableToCable2 + ", " + "[xDevice2] = " + xDevice2 + ", " + "[device2] = "
					+ device2 + ", " + "[cableAttributes] = " + cableAttributes + ", " + "[cable1] = " + cable1 + ", "
					+ "[xCableToCable1] = " + xCableToCable1 + ", " + "[device1] = " + device1 + ".");
		}
		XDuplexConnectionToConnectionRuleImpl
				.pattern_XDuplexConnectionToConnectionRule_1_3_bookkeepingforedges_greenBBBBBBBBBBBFFFFFFFFFFFF(
						ruleresult, connection2, xCable, xDevice1, cable2, connection1, xDevice2, device2,
						cableAttributes, cable1, device1);
		//nothing EMoflonEdge connection2__xCable____incoming = (EMoflonEdge) result3_green[11];
		//nothing EMoflonEdge cable2__device2____source = (EMoflonEdge) result3_green[12];
		//nothing EMoflonEdge device2__cable2____outgoing = (EMoflonEdge) result3_green[13];
		//nothing EMoflonEdge connection1__xCable____outgoing = (EMoflonEdge) result3_green[14];
		//nothing EMoflonEdge cable2__device1____target = (EMoflonEdge) result3_green[15];
		//nothing EMoflonEdge device1__cable2____incoming = (EMoflonEdge) result3_green[16];
		//nothing EMoflonEdge cableAttributes__xDevice2____endPoint2 = (EMoflonEdge) result3_green[17];
		//nothing EMoflonEdge cableAttributes__xDevice1____endPoint1 = (EMoflonEdge) result3_green[18];
		//nothing EMoflonEdge cable1__device2____target = (EMoflonEdge) result3_green[19];
		//nothing EMoflonEdge device2__cable1____incoming = (EMoflonEdge) result3_green[20];
		//nothing EMoflonEdge cable1__device1____source = (EMoflonEdge) result3_green[21];
		//nothing EMoflonEdge device1__cable1____outgoing = (EMoflonEdge) result3_green[22];

		// 
		// 
		XDuplexConnectionToConnectionRuleImpl
				.pattern_XDuplexConnectionToConnectionRule_1_5_registerobjects_expressionBBBBBBBBBBBBBBBBBB(this,
						ruleresult, container, connection2, xDeviceToDevice2, xCable, xDevice1, cable2, xContainer,
						connection1, xDeviceToDevice, xCableToCable2, xDevice2, device2, cableAttributes, cable1,
						xCableToCable1, device1);
		return XDuplexConnectionToConnectionRuleImpl
				.pattern_XDuplexConnectionToConnectionRule_1_6_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IsApplicableRuleResult isApplicable_FWD(Match match) {

		Object[] result1_bindingAndBlack = XDuplexConnectionToConnectionRuleImpl
				.pattern_XDuplexConnectionToConnectionRule_2_1_preparereturnvalue_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		EOperation performOperation = (EOperation) result1_bindingAndBlack[0];
		//nothing EClass eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = XDuplexConnectionToConnectionRuleImpl
				.pattern_XDuplexConnectionToConnectionRule_2_1_preparereturnvalue_greenBF(performOperation);
		IsApplicableRuleResult ruleresult = (IsApplicableRuleResult) result1_green[1];

		// ForEach 
		Object[] result2_binding = XDuplexConnectionToConnectionRuleImpl
				.pattern_XDuplexConnectionToConnectionRule_2_2_corematch_bindingFFFFFFFB(match);
		if (result2_binding == null) {
			throw new RuntimeException(
					"Binding in node core match failed." + " Variables: " + "[match] = " + match + ".");
		}
		Connections connection2 = (Connections) result2_binding[0];
		XCable xCable = (XCable) result2_binding[1];
		XDevice xDevice1 = (XDevice) result2_binding[2];
		XContainer xContainer = (XContainer) result2_binding[3];
		Connections connection1 = (Connections) result2_binding[4];
		XDevice xDevice2 = (XDevice) result2_binding[5];
		CableAttributes cableAttributes = (CableAttributes) result2_binding[6];
		for (Object[] result2_black : XDuplexConnectionToConnectionRuleImpl
				.pattern_XDuplexConnectionToConnectionRule_2_2_corematch_blackBFBBFBBFFBFBFFFB(connection2, xCable,
						xDevice1, xContainer, connection1, xDevice2, cableAttributes, match)) {
			XDeviceToDevice xDeviceToDevice2 = (XDeviceToDevice) result2_black[1];
			Cable cable2 = (Cable) result2_black[4];
			XDeviceToDevice xDeviceToDevice = (XDeviceToDevice) result2_black[7];
			XCableToCable xCableToCable2 = (XCableToCable) result2_black[8];
			Device device2 = (Device) result2_black[10];
			Cable cable1 = (Cable) result2_black[12];
			XCableToCable xCableToCable1 = (XCableToCable) result2_black[13];
			Device device1 = (Device) result2_black[14];
			// ForEach 
			for (Object[] result3_black : XDuplexConnectionToConnectionRuleImpl
					.pattern_XDuplexConnectionToConnectionRule_2_3_findcontext_blackFBBBBBBBBBBBBBBB(connection2,
							xDeviceToDevice2, xCable, xDevice1, cable2, xContainer, connection1, xDeviceToDevice,
							xCableToCable2, xDevice2, device2, cableAttributes, cable1, xCableToCable1, device1)) {
				Container container = (Container) result3_black[0];
				Object[] result3_green = XDuplexConnectionToConnectionRuleImpl
						.pattern_XDuplexConnectionToConnectionRule_2_3_findcontext_greenBBBBBBBBBBBBBBBBFFFFFFFFFFFFFFFFFFFFFFF(
								container, connection2, xDeviceToDevice2, xCable, xDevice1, cable2, xContainer,
								connection1, xDeviceToDevice, xCableToCable2, xDevice2, device2, cableAttributes,
								cable1, xCableToCable1, device1);
				IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result3_green[16];
				//nothing EMoflonEdge connection2__xCable____incoming = (EMoflonEdge) result3_green[17];
				//nothing EMoflonEdge xCable__cableAttributes____cableAttributes = (EMoflonEdge) result3_green[18];
				//nothing EMoflonEdge container__device2____devices = (EMoflonEdge) result3_green[19];
				//nothing EMoflonEdge xContainer__xDevice2____elements = (EMoflonEdge) result3_green[20];
				//nothing EMoflonEdge container__device1____devices = (EMoflonEdge) result3_green[21];
				//nothing EMoflonEdge xDeviceToDevice__xDevice1____source = (EMoflonEdge) result3_green[22];
				//nothing EMoflonEdge xCableToCable2__cable2____target = (EMoflonEdge) result3_green[23];
				//nothing EMoflonEdge connection1__xCable____outgoing = (EMoflonEdge) result3_green[24];
				//nothing EMoflonEdge xDevice2__connection2____connections = (EMoflonEdge) result3_green[25];
				//nothing EMoflonEdge xDeviceToDevice2__xDevice2____source = (EMoflonEdge) result3_green[26];
				//nothing EMoflonEdge xDeviceToDevice2__device2____target = (EMoflonEdge) result3_green[27];
				//nothing EMoflonEdge xCableToCable2__xCable____source = (EMoflonEdge) result3_green[28];
				//nothing EMoflonEdge xDevice1__connection1____connections = (EMoflonEdge) result3_green[29];
				//nothing EMoflonEdge cableAttributes__xDevice2____endPoint2 = (EMoflonEdge) result3_green[30];
				//nothing EMoflonEdge cableAttributes__xDevice1____endPoint1 = (EMoflonEdge) result3_green[31];
				//nothing EMoflonEdge xContainer__xCable____elements = (EMoflonEdge) result3_green[32];
				//nothing EMoflonEdge xCableToCable1__cable1____target = (EMoflonEdge) result3_green[33];
				//nothing EMoflonEdge xDeviceToDevice__device1____target = (EMoflonEdge) result3_green[34];
				//nothing EMoflonEdge xCableToCable1__xCable____source = (EMoflonEdge) result3_green[35];
				//nothing EMoflonEdge xContainer__xDevice1____elements = (EMoflonEdge) result3_green[36];
				//nothing EMoflonEdge container__cable2____cables = (EMoflonEdge) result3_green[37];
				//nothing EMoflonEdge container__cable1____cables = (EMoflonEdge) result3_green[38];

				Object[] result4_bindingAndBlack = XDuplexConnectionToConnectionRuleImpl
						.pattern_XDuplexConnectionToConnectionRule_2_4_solveCSP_bindingAndBlackFBBBBBBBBBBBBBBBBBB(this,
								isApplicableMatch, container, connection2, xDeviceToDevice2, xCable, xDevice1, cable2,
								xContainer, connection1, xDeviceToDevice, xCableToCable2, xDevice2, device2,
								cableAttributes, cable1, xCableToCable1, device1);
				if (result4_bindingAndBlack == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
							+ "[isApplicableMatch] = " + isApplicableMatch + ", " + "[container] = " + container + ", "
							+ "[connection2] = " + connection2 + ", " + "[xDeviceToDevice2] = " + xDeviceToDevice2
							+ ", " + "[xCable] = " + xCable + ", " + "[xDevice1] = " + xDevice1 + ", " + "[cable2] = "
							+ cable2 + ", " + "[xContainer] = " + xContainer + ", " + "[connection1] = " + connection1
							+ ", " + "[xDeviceToDevice] = " + xDeviceToDevice + ", " + "[xCableToCable2] = "
							+ xCableToCable2 + ", " + "[xDevice2] = " + xDevice2 + ", " + "[device2] = " + device2
							+ ", " + "[cableAttributes] = " + cableAttributes + ", " + "[cable1] = " + cable1 + ", "
							+ "[xCableToCable1] = " + xCableToCable1 + ", " + "[device1] = " + device1 + ".");
				}
				CSP csp = (CSP) result4_bindingAndBlack[0];
				// 
				if (XDuplexConnectionToConnectionRuleImpl
						.pattern_XDuplexConnectionToConnectionRule_2_5_checkCSP_expressionFBB(this, csp)) {

					Object[] result6_black = XDuplexConnectionToConnectionRuleImpl
							.pattern_XDuplexConnectionToConnectionRule_2_6_addmatchtoruleresult_blackBB(ruleresult,
									isApplicableMatch);
					if (result6_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[ruleresult] = "
								+ ruleresult + ", " + "[isApplicableMatch] = " + isApplicableMatch + ".");
					}
					XDuplexConnectionToConnectionRuleImpl
							.pattern_XDuplexConnectionToConnectionRule_2_6_addmatchtoruleresult_greenBB(ruleresult,
									isApplicableMatch);

				} else {
				}

			}

		}
		return XDuplexConnectionToConnectionRuleImpl
				.pattern_XDuplexConnectionToConnectionRule_2_7_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void registerObjectsToMatch_FWD(Match match, Connections connection2, XCable xCable, XDevice xDevice1,
			XContainer xContainer, Connections connection1, XDevice xDevice2, CableAttributes cableAttributes) {
		match.registerObject("connection2", connection2);
		match.registerObject("xCable", xCable);
		match.registerObject("xDevice1", xDevice1);
		match.registerObject("xContainer", xContainer);
		match.registerObject("connection1", connection1);
		match.registerObject("xDevice2", xDevice2);
		match.registerObject("cableAttributes", cableAttributes);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isAppropriate_solveCsp_FWD(Match match, Connections connection2, XCable xCable, XDevice xDevice1,
			XContainer xContainer, Connections connection1, XDevice xDevice2, CableAttributes cableAttributes) {// Create CSP
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
			Connections connection2, XDeviceToDevice xDeviceToDevice2, XCable xCable, XDevice xDevice1, Cable cable2,
			XContainer xContainer, Connections connection1, XDeviceToDevice xDeviceToDevice,
			XCableToCable xCableToCable2, XDevice xDevice2, Device device2, CableAttributes cableAttributes,
			Cable cable1, XCableToCable xCableToCable1, Device device1) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals

		// Create attribute variables
		Variable var_cableAttributes_speed = CSPFactoryHelper.eINSTANCE.createVariable("cableAttributes.speed", true,
				csp);
		var_cableAttributes_speed.setValue(cableAttributes.getSpeed());
		var_cableAttributes_speed.setType("BigInteger");
		Variable var_cable2_speed = CSPFactoryHelper.eINSTANCE.createVariable("cable2.speed", true, csp);
		var_cable2_speed.setValue(cable2.getSpeed());
		var_cable2_speed.setType("BigInteger");
		Variable var_cable1_speed = CSPFactoryHelper.eINSTANCE.createVariable("cable1.speed", true, csp);
		var_cable1_speed.setValue(cable1.getSpeed());
		var_cable1_speed.setType("BigInteger");

		// Create unbound variables

		// Create constraints
		Eq eq = new Eq();
		Eq eq_0 = new Eq();

		csp.getConstraints().add(eq);
		csp.getConstraints().add(eq_0);

		// Solve CSP
		eq.setRuleName("NoRuleName");
		eq.solve(var_cableAttributes_speed, var_cable2_speed);
		eq_0.setRuleName("NoRuleName");
		eq_0.solve(var_cableAttributes_speed, var_cable1_speed);

		// Snapshot pattern match on which CSP is solved
		isApplicableMatch.registerObject("container", container);
		isApplicableMatch.registerObject("connection2", connection2);
		isApplicableMatch.registerObject("xDeviceToDevice2", xDeviceToDevice2);
		isApplicableMatch.registerObject("xCable", xCable);
		isApplicableMatch.registerObject("xDevice1", xDevice1);
		isApplicableMatch.registerObject("cable2", cable2);
		isApplicableMatch.registerObject("xContainer", xContainer);
		isApplicableMatch.registerObject("connection1", connection1);
		isApplicableMatch.registerObject("xDeviceToDevice", xDeviceToDevice);
		isApplicableMatch.registerObject("xCableToCable2", xCableToCable2);
		isApplicableMatch.registerObject("xDevice2", xDevice2);
		isApplicableMatch.registerObject("device2", device2);
		isApplicableMatch.registerObject("cableAttributes", cableAttributes);
		isApplicableMatch.registerObject("cable1", cable1);
		isApplicableMatch.registerObject("xCableToCable1", xCableToCable1);
		isApplicableMatch.registerObject("device1", device1);
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
	public void registerObjects_FWD(PerformRuleResult ruleresult, EObject container, EObject connection2,
			EObject xDeviceToDevice2, EObject xCable, EObject xDevice1, EObject cable2, EObject xContainer,
			EObject connection1, EObject xDeviceToDevice, EObject xCableToCable2, EObject xDevice2, EObject device2,
			EObject cableAttributes, EObject cable1, EObject xCableToCable1, EObject device1) {
		ruleresult.registerObject("container", container);
		ruleresult.registerObject("connection2", connection2);
		ruleresult.registerObject("xDeviceToDevice2", xDeviceToDevice2);
		ruleresult.registerObject("xCable", xCable);
		ruleresult.registerObject("xDevice1", xDevice1);
		ruleresult.registerObject("cable2", cable2);
		ruleresult.registerObject("xContainer", xContainer);
		ruleresult.registerObject("connection1", connection1);
		ruleresult.registerObject("xDeviceToDevice", xDeviceToDevice);
		ruleresult.registerObject("xCableToCable2", xCableToCable2);
		ruleresult.registerObject("xDevice2", xDevice2);
		ruleresult.registerObject("device2", device2);
		ruleresult.registerObject("cableAttributes", cableAttributes);
		ruleresult.registerObject("cable1", cable1);
		ruleresult.registerObject("xCableToCable1", xCableToCable1);
		ruleresult.registerObject("device1", device1);

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
	public boolean isAppropriate_BWD(Match match, Container container, Cable cable2, Device device2, Cable cable1,
			Device device1) {

		Object[] result1_black = XDuplexConnectionToConnectionRuleImpl
				.pattern_XDuplexConnectionToConnectionRule_10_1_initialbindings_blackBBBBBBB(this, match, container,
						cable2, device2, cable1, device1);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[match] = " + match + ", " + "[container] = " + container + ", " + "[cable2] = " + cable2 + ", "
					+ "[device2] = " + device2 + ", " + "[cable1] = " + cable1 + ", " + "[device1] = " + device1 + ".");
		}

		Object[] result2_bindingAndBlack = XDuplexConnectionToConnectionRuleImpl
				.pattern_XDuplexConnectionToConnectionRule_10_2_SolveCSP_bindingAndBlackFBBBBBBB(this, match, container,
						cable2, device2, cable1, device1);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[match] = " + match + ", " + "[container] = " + container + ", " + "[cable2] = " + cable2 + ", "
					+ "[device2] = " + device2 + ", " + "[cable1] = " + cable1 + ", " + "[device1] = " + device1 + ".");
		}
		CSP csp = (CSP) result2_bindingAndBlack[0];
		// 
		if (XDuplexConnectionToConnectionRuleImpl
				.pattern_XDuplexConnectionToConnectionRule_10_3_CheckCSP_expressionFBB(this, csp)) {

			Object[] result4_black = XDuplexConnectionToConnectionRuleImpl
					.pattern_XDuplexConnectionToConnectionRule_10_4_collectelementstobetranslated_blackBBBBBB(match,
							container, cable2, device2, cable1, device1);
			if (result4_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match + ", "
						+ "[container] = " + container + ", " + "[cable2] = " + cable2 + ", " + "[device2] = " + device2
						+ ", " + "[cable1] = " + cable1 + ", " + "[device1] = " + device1 + ".");
			}
			XDuplexConnectionToConnectionRuleImpl
					.pattern_XDuplexConnectionToConnectionRule_10_4_collectelementstobetranslated_greenBBBBBFFFFFFFF(
							match, cable2, device2, cable1, device1);
			//nothing EMoflonEdge cable2__device2____source = (EMoflonEdge) result4_green[5];
			//nothing EMoflonEdge device2__cable2____outgoing = (EMoflonEdge) result4_green[6];
			//nothing EMoflonEdge cable2__device1____target = (EMoflonEdge) result4_green[7];
			//nothing EMoflonEdge device1__cable2____incoming = (EMoflonEdge) result4_green[8];
			//nothing EMoflonEdge cable1__device2____target = (EMoflonEdge) result4_green[9];
			//nothing EMoflonEdge device2__cable1____incoming = (EMoflonEdge) result4_green[10];
			//nothing EMoflonEdge cable1__device1____source = (EMoflonEdge) result4_green[11];
			//nothing EMoflonEdge device1__cable1____outgoing = (EMoflonEdge) result4_green[12];

			Object[] result5_black = XDuplexConnectionToConnectionRuleImpl
					.pattern_XDuplexConnectionToConnectionRule_10_5_collectcontextelements_blackBBBBBB(match, container,
							cable2, device2, cable1, device1);
			if (result5_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match + ", "
						+ "[container] = " + container + ", " + "[cable2] = " + cable2 + ", " + "[device2] = " + device2
						+ ", " + "[cable1] = " + cable1 + ", " + "[device1] = " + device1 + ".");
			}
			XDuplexConnectionToConnectionRuleImpl
					.pattern_XDuplexConnectionToConnectionRule_10_5_collectcontextelements_greenBBBBBBFFFF(match,
							container, cable2, device2, cable1, device1);
			//nothing EMoflonEdge container__device2____devices = (EMoflonEdge) result5_green[6];
			//nothing EMoflonEdge container__device1____devices = (EMoflonEdge) result5_green[7];
			//nothing EMoflonEdge container__cable2____cables = (EMoflonEdge) result5_green[8];
			//nothing EMoflonEdge container__cable1____cables = (EMoflonEdge) result5_green[9];

			// 
			XDuplexConnectionToConnectionRuleImpl
					.pattern_XDuplexConnectionToConnectionRule_10_6_registerobjectstomatch_expressionBBBBBBB(this,
							match, container, cable2, device2, cable1, device1);
			return XDuplexConnectionToConnectionRuleImpl.pattern_XDuplexConnectionToConnectionRule_10_7_expressionF();
		} else {
			return XDuplexConnectionToConnectionRuleImpl.pattern_XDuplexConnectionToConnectionRule_10_8_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PerformRuleResult perform_BWD(IsApplicableMatch isApplicableMatch) {

		Object[] result1_bindingAndBlack = XDuplexConnectionToConnectionRuleImpl
				.pattern_XDuplexConnectionToConnectionRule_11_1_performtransformation_bindingAndBlackFFFFFFFFFFFFFFFFFBB(
						this, isApplicableMatch);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[isApplicableMatch] = " + isApplicableMatch + ".");
		}
		Container container = (Container) result1_bindingAndBlack[0];
		Connections connection2 = (Connections) result1_bindingAndBlack[1];
		XDeviceToDevice xDeviceToDevice2 = (XDeviceToDevice) result1_bindingAndBlack[2];
		XCable xCable = (XCable) result1_bindingAndBlack[3];
		XDevice xDevice1 = (XDevice) result1_bindingAndBlack[4];
		Cable cable2 = (Cable) result1_bindingAndBlack[5];
		XContainer xContainer = (XContainer) result1_bindingAndBlack[6];
		Connections connection1 = (Connections) result1_bindingAndBlack[7];
		XDeviceToDevice xDeviceToDevice = (XDeviceToDevice) result1_bindingAndBlack[8];
		XCableToCable xCableToCable2 = (XCableToCable) result1_bindingAndBlack[9];
		XDevice xDevice2 = (XDevice) result1_bindingAndBlack[10];
		Device device2 = (Device) result1_bindingAndBlack[11];
		CableAttributes cableAttributes = (CableAttributes) result1_bindingAndBlack[12];
		Cable cable1 = (Cable) result1_bindingAndBlack[13];
		XCableToCable xCableToCable1 = (XCableToCable) result1_bindingAndBlack[14];
		Device device1 = (Device) result1_bindingAndBlack[15];
		//nothing CSP csp = (CSP) result1_bindingAndBlack[16];
		XDuplexConnectionToConnectionRuleImpl
				.pattern_XDuplexConnectionToConnectionRule_11_1_performtransformation_greenBBBBBB(connection2, xCable,
						xDevice1, connection1, xDevice2, cableAttributes);

		Object[] result2_green = XDuplexConnectionToConnectionRuleImpl
				.pattern_XDuplexConnectionToConnectionRule_11_2_collecttranslatedelements_greenF();
		if (result2_green == null) {
			throw new RuntimeException("Pattern matching failed.");
		}
		PerformRuleResult ruleresult = (PerformRuleResult) result2_green[0];

		Object[] result3_black = XDuplexConnectionToConnectionRuleImpl
				.pattern_XDuplexConnectionToConnectionRule_11_3_bookkeepingforedges_blackBBBBBBBBBBBBBBBBB(ruleresult,
						container, connection2, xDeviceToDevice2, xCable, xDevice1, cable2, xContainer, connection1,
						xDeviceToDevice, xCableToCable2, xDevice2, device2, cableAttributes, cable1, xCableToCable1,
						device1);
		if (result3_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[ruleresult] = " + ruleresult
					+ ", " + "[container] = " + container + ", " + "[connection2] = " + connection2 + ", "
					+ "[xDeviceToDevice2] = " + xDeviceToDevice2 + ", " + "[xCable] = " + xCable + ", "
					+ "[xDevice1] = " + xDevice1 + ", " + "[cable2] = " + cable2 + ", " + "[xContainer] = " + xContainer
					+ ", " + "[connection1] = " + connection1 + ", " + "[xDeviceToDevice] = " + xDeviceToDevice + ", "
					+ "[xCableToCable2] = " + xCableToCable2 + ", " + "[xDevice2] = " + xDevice2 + ", " + "[device2] = "
					+ device2 + ", " + "[cableAttributes] = " + cableAttributes + ", " + "[cable1] = " + cable1 + ", "
					+ "[xCableToCable1] = " + xCableToCable1 + ", " + "[device1] = " + device1 + ".");
		}
		XDuplexConnectionToConnectionRuleImpl
				.pattern_XDuplexConnectionToConnectionRule_11_3_bookkeepingforedges_greenBBBBBBBBBBBFFFFFFFFFFFF(
						ruleresult, connection2, xCable, xDevice1, cable2, connection1, xDevice2, device2,
						cableAttributes, cable1, device1);
		//nothing EMoflonEdge connection2__xCable____incoming = (EMoflonEdge) result3_green[11];
		//nothing EMoflonEdge cable2__device2____source = (EMoflonEdge) result3_green[12];
		//nothing EMoflonEdge device2__cable2____outgoing = (EMoflonEdge) result3_green[13];
		//nothing EMoflonEdge connection1__xCable____outgoing = (EMoflonEdge) result3_green[14];
		//nothing EMoflonEdge cable2__device1____target = (EMoflonEdge) result3_green[15];
		//nothing EMoflonEdge device1__cable2____incoming = (EMoflonEdge) result3_green[16];
		//nothing EMoflonEdge cableAttributes__xDevice2____endPoint2 = (EMoflonEdge) result3_green[17];
		//nothing EMoflonEdge cableAttributes__xDevice1____endPoint1 = (EMoflonEdge) result3_green[18];
		//nothing EMoflonEdge cable1__device2____target = (EMoflonEdge) result3_green[19];
		//nothing EMoflonEdge device2__cable1____incoming = (EMoflonEdge) result3_green[20];
		//nothing EMoflonEdge cable1__device1____source = (EMoflonEdge) result3_green[21];
		//nothing EMoflonEdge device1__cable1____outgoing = (EMoflonEdge) result3_green[22];

		// 
		// 
		XDuplexConnectionToConnectionRuleImpl
				.pattern_XDuplexConnectionToConnectionRule_11_5_registerobjects_expressionBBBBBBBBBBBBBBBBBB(this,
						ruleresult, container, connection2, xDeviceToDevice2, xCable, xDevice1, cable2, xContainer,
						connection1, xDeviceToDevice, xCableToCable2, xDevice2, device2, cableAttributes, cable1,
						xCableToCable1, device1);
		return XDuplexConnectionToConnectionRuleImpl
				.pattern_XDuplexConnectionToConnectionRule_11_6_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IsApplicableRuleResult isApplicable_BWD(Match match) {

		Object[] result1_bindingAndBlack = XDuplexConnectionToConnectionRuleImpl
				.pattern_XDuplexConnectionToConnectionRule_12_1_preparereturnvalue_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		EOperation performOperation = (EOperation) result1_bindingAndBlack[0];
		//nothing EClass eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = XDuplexConnectionToConnectionRuleImpl
				.pattern_XDuplexConnectionToConnectionRule_12_1_preparereturnvalue_greenBF(performOperation);
		IsApplicableRuleResult ruleresult = (IsApplicableRuleResult) result1_green[1];

		// ForEach 
		Object[] result2_binding = XDuplexConnectionToConnectionRuleImpl
				.pattern_XDuplexConnectionToConnectionRule_12_2_corematch_bindingFFFFFB(match);
		if (result2_binding == null) {
			throw new RuntimeException(
					"Binding in node core match failed." + " Variables: " + "[match] = " + match + ".");
		}
		Container container = (Container) result2_binding[0];
		Cable cable2 = (Cable) result2_binding[1];
		Device device2 = (Device) result2_binding[2];
		Cable cable1 = (Cable) result2_binding[3];
		Device device1 = (Device) result2_binding[4];
		for (Object[] result2_black : XDuplexConnectionToConnectionRuleImpl
				.pattern_XDuplexConnectionToConnectionRule_12_2_corematch_blackBFFFBFFFBBFBB(container, cable2, device2,
						cable1, device1, match)) {
			XDeviceToDevice xDeviceToDevice2 = (XDeviceToDevice) result2_black[1];
			XCable xCable = (XCable) result2_black[2];
			XDevice xDevice1 = (XDevice) result2_black[3];
			XDeviceToDevice xDeviceToDevice = (XDeviceToDevice) result2_black[5];
			XCableToCable xCableToCable2 = (XCableToCable) result2_black[6];
			XDevice xDevice2 = (XDevice) result2_black[7];
			XCableToCable xCableToCable1 = (XCableToCable) result2_black[10];
			// ForEach 
			for (Object[] result3_black : XDuplexConnectionToConnectionRuleImpl
					.pattern_XDuplexConnectionToConnectionRule_12_3_findcontext_blackBFBBBBFFBBBBFBBB(container,
							xDeviceToDevice2, xCable, xDevice1, cable2, xDeviceToDevice, xCableToCable2, xDevice2,
							device2, cable1, xCableToCable1, device1)) {
				Connections connection2 = (Connections) result3_black[1];
				XContainer xContainer = (XContainer) result3_black[6];
				Connections connection1 = (Connections) result3_black[7];
				CableAttributes cableAttributes = (CableAttributes) result3_black[12];
				Object[] result3_green = XDuplexConnectionToConnectionRuleImpl
						.pattern_XDuplexConnectionToConnectionRule_12_3_findcontext_greenBBBBBBBBBBBBBBBBFFFFFFFFFFFFFFFFFFFFFFFFFFF(
								container, connection2, xDeviceToDevice2, xCable, xDevice1, cable2, xContainer,
								connection1, xDeviceToDevice, xCableToCable2, xDevice2, device2, cableAttributes,
								cable1, xCableToCable1, device1);
				IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result3_green[16];
				//nothing EMoflonEdge xCable__cableAttributes____cableAttributes = (EMoflonEdge) result3_green[17];
				//nothing EMoflonEdge container__device2____devices = (EMoflonEdge) result3_green[18];
				//nothing EMoflonEdge cable2__device2____source = (EMoflonEdge) result3_green[19];
				//nothing EMoflonEdge device2__cable2____outgoing = (EMoflonEdge) result3_green[20];
				//nothing EMoflonEdge xContainer__xDevice2____elements = (EMoflonEdge) result3_green[21];
				//nothing EMoflonEdge container__device1____devices = (EMoflonEdge) result3_green[22];
				//nothing EMoflonEdge xDeviceToDevice__xDevice1____source = (EMoflonEdge) result3_green[23];
				//nothing EMoflonEdge xCableToCable2__cable2____target = (EMoflonEdge) result3_green[24];
				//nothing EMoflonEdge xDevice2__connection2____connections = (EMoflonEdge) result3_green[25];
				//nothing EMoflonEdge xDeviceToDevice2__xDevice2____source = (EMoflonEdge) result3_green[26];
				//nothing EMoflonEdge xDeviceToDevice2__device2____target = (EMoflonEdge) result3_green[27];
				//nothing EMoflonEdge xCableToCable2__xCable____source = (EMoflonEdge) result3_green[28];
				//nothing EMoflonEdge cable2__device1____target = (EMoflonEdge) result3_green[29];
				//nothing EMoflonEdge device1__cable2____incoming = (EMoflonEdge) result3_green[30];
				//nothing EMoflonEdge xDevice1__connection1____connections = (EMoflonEdge) result3_green[31];
				//nothing EMoflonEdge xContainer__xCable____elements = (EMoflonEdge) result3_green[32];
				//nothing EMoflonEdge xCableToCable1__cable1____target = (EMoflonEdge) result3_green[33];
				//nothing EMoflonEdge cable1__device2____target = (EMoflonEdge) result3_green[34];
				//nothing EMoflonEdge device2__cable1____incoming = (EMoflonEdge) result3_green[35];
				//nothing EMoflonEdge xDeviceToDevice__device1____target = (EMoflonEdge) result3_green[36];
				//nothing EMoflonEdge xCableToCable1__xCable____source = (EMoflonEdge) result3_green[37];
				//nothing EMoflonEdge cable1__device1____source = (EMoflonEdge) result3_green[38];
				//nothing EMoflonEdge device1__cable1____outgoing = (EMoflonEdge) result3_green[39];
				//nothing EMoflonEdge xContainer__xDevice1____elements = (EMoflonEdge) result3_green[40];
				//nothing EMoflonEdge container__cable2____cables = (EMoflonEdge) result3_green[41];
				//nothing EMoflonEdge container__cable1____cables = (EMoflonEdge) result3_green[42];

				Object[] result4_bindingAndBlack = XDuplexConnectionToConnectionRuleImpl
						.pattern_XDuplexConnectionToConnectionRule_12_4_solveCSP_bindingAndBlackFBBBBBBBBBBBBBBBBBB(
								this, isApplicableMatch, container, connection2, xDeviceToDevice2, xCable, xDevice1,
								cable2, xContainer, connection1, xDeviceToDevice, xCableToCable2, xDevice2, device2,
								cableAttributes, cable1, xCableToCable1, device1);
				if (result4_bindingAndBlack == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
							+ "[isApplicableMatch] = " + isApplicableMatch + ", " + "[container] = " + container + ", "
							+ "[connection2] = " + connection2 + ", " + "[xDeviceToDevice2] = " + xDeviceToDevice2
							+ ", " + "[xCable] = " + xCable + ", " + "[xDevice1] = " + xDevice1 + ", " + "[cable2] = "
							+ cable2 + ", " + "[xContainer] = " + xContainer + ", " + "[connection1] = " + connection1
							+ ", " + "[xDeviceToDevice] = " + xDeviceToDevice + ", " + "[xCableToCable2] = "
							+ xCableToCable2 + ", " + "[xDevice2] = " + xDevice2 + ", " + "[device2] = " + device2
							+ ", " + "[cableAttributes] = " + cableAttributes + ", " + "[cable1] = " + cable1 + ", "
							+ "[xCableToCable1] = " + xCableToCable1 + ", " + "[device1] = " + device1 + ".");
				}
				CSP csp = (CSP) result4_bindingAndBlack[0];
				// 
				if (XDuplexConnectionToConnectionRuleImpl
						.pattern_XDuplexConnectionToConnectionRule_12_5_checkCSP_expressionFBB(this, csp)) {

					Object[] result6_black = XDuplexConnectionToConnectionRuleImpl
							.pattern_XDuplexConnectionToConnectionRule_12_6_addmatchtoruleresult_blackBB(ruleresult,
									isApplicableMatch);
					if (result6_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[ruleresult] = "
								+ ruleresult + ", " + "[isApplicableMatch] = " + isApplicableMatch + ".");
					}
					XDuplexConnectionToConnectionRuleImpl
							.pattern_XDuplexConnectionToConnectionRule_12_6_addmatchtoruleresult_greenBB(ruleresult,
									isApplicableMatch);

				} else {
				}

			}

		}
		return XDuplexConnectionToConnectionRuleImpl
				.pattern_XDuplexConnectionToConnectionRule_12_7_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void registerObjectsToMatch_BWD(Match match, Container container, Cable cable2, Device device2, Cable cable1,
			Device device1) {
		match.registerObject("container", container);
		match.registerObject("cable2", cable2);
		match.registerObject("device2", device2);
		match.registerObject("cable1", cable1);
		match.registerObject("device1", device1);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isAppropriate_solveCsp_BWD(Match match, Container container, Cable cable2, Device device2, Cable cable1,
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
	public CSP isApplicable_solveCsp_BWD(IsApplicableMatch isApplicableMatch, Container container,
			Connections connection2, XDeviceToDevice xDeviceToDevice2, XCable xCable, XDevice xDevice1, Cable cable2,
			XContainer xContainer, Connections connection1, XDeviceToDevice xDeviceToDevice,
			XCableToCable xCableToCable2, XDevice xDevice2, Device device2, CableAttributes cableAttributes,
			Cable cable1, XCableToCable xCableToCable1, Device device1) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals

		// Create attribute variables
		Variable var_cableAttributes_speed = CSPFactoryHelper.eINSTANCE.createVariable("cableAttributes.speed", true,
				csp);
		var_cableAttributes_speed.setValue(cableAttributes.getSpeed());
		var_cableAttributes_speed.setType("BigInteger");
		Variable var_cable2_speed = CSPFactoryHelper.eINSTANCE.createVariable("cable2.speed", true, csp);
		var_cable2_speed.setValue(cable2.getSpeed());
		var_cable2_speed.setType("BigInteger");
		Variable var_cable1_speed = CSPFactoryHelper.eINSTANCE.createVariable("cable1.speed", true, csp);
		var_cable1_speed.setValue(cable1.getSpeed());
		var_cable1_speed.setType("BigInteger");

		// Create unbound variables

		// Create constraints
		Eq eq = new Eq();
		Eq eq_0 = new Eq();

		csp.getConstraints().add(eq);
		csp.getConstraints().add(eq_0);

		// Solve CSP
		eq.setRuleName("NoRuleName");
		eq.solve(var_cableAttributes_speed, var_cable2_speed);
		eq_0.setRuleName("NoRuleName");
		eq_0.solve(var_cableAttributes_speed, var_cable1_speed);

		// Snapshot pattern match on which CSP is solved
		isApplicableMatch.registerObject("container", container);
		isApplicableMatch.registerObject("connection2", connection2);
		isApplicableMatch.registerObject("xDeviceToDevice2", xDeviceToDevice2);
		isApplicableMatch.registerObject("xCable", xCable);
		isApplicableMatch.registerObject("xDevice1", xDevice1);
		isApplicableMatch.registerObject("cable2", cable2);
		isApplicableMatch.registerObject("xContainer", xContainer);
		isApplicableMatch.registerObject("connection1", connection1);
		isApplicableMatch.registerObject("xDeviceToDevice", xDeviceToDevice);
		isApplicableMatch.registerObject("xCableToCable2", xCableToCable2);
		isApplicableMatch.registerObject("xDevice2", xDevice2);
		isApplicableMatch.registerObject("device2", device2);
		isApplicableMatch.registerObject("cableAttributes", cableAttributes);
		isApplicableMatch.registerObject("cable1", cable1);
		isApplicableMatch.registerObject("xCableToCable1", xCableToCable1);
		isApplicableMatch.registerObject("device1", device1);
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
	public void registerObjects_BWD(PerformRuleResult ruleresult, EObject container, EObject connection2,
			EObject xDeviceToDevice2, EObject xCable, EObject xDevice1, EObject cable2, EObject xContainer,
			EObject connection1, EObject xDeviceToDevice, EObject xCableToCable2, EObject xDevice2, EObject device2,
			EObject cableAttributes, EObject cable1, EObject xCableToCable1, EObject device1) {
		ruleresult.registerObject("container", container);
		ruleresult.registerObject("connection2", connection2);
		ruleresult.registerObject("xDeviceToDevice2", xDeviceToDevice2);
		ruleresult.registerObject("xCable", xCable);
		ruleresult.registerObject("xDevice1", xDevice1);
		ruleresult.registerObject("cable2", cable2);
		ruleresult.registerObject("xContainer", xContainer);
		ruleresult.registerObject("connection1", connection1);
		ruleresult.registerObject("xDeviceToDevice", xDeviceToDevice);
		ruleresult.registerObject("xCableToCable2", xCableToCable2);
		ruleresult.registerObject("xDevice2", xDevice2);
		ruleresult.registerObject("device2", device2);
		ruleresult.registerObject("cableAttributes", cableAttributes);
		ruleresult.registerObject("cable1", cable1);
		ruleresult.registerObject("xCableToCable1", xCableToCable1);
		ruleresult.registerObject("device1", device1);

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
	public EObjectContainer isAppropriate_BWD_EMoflonEdge_16(EMoflonEdge _edge_source) {

		Object[] result1_bindingAndBlack = XDuplexConnectionToConnectionRuleImpl
				.pattern_XDuplexConnectionToConnectionRule_20_1_preparereturnvalue_bindingAndBlackFFBF(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		EOperation isApplicableCC = (EOperation) result1_bindingAndBlack[3];
		Object[] result1_green = XDuplexConnectionToConnectionRuleImpl
				.pattern_XDuplexConnectionToConnectionRule_20_1_preparereturnvalue_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach 
		for (Object[] result2_black : XDuplexConnectionToConnectionRuleImpl
				.pattern_XDuplexConnectionToConnectionRule_20_2_testcorematchandDECs_blackFFFFFB(_edge_source)) {
			Container container = (Container) result2_black[0];
			Cable cable2 = (Cable) result2_black[1];
			Device device2 = (Device) result2_black[2];
			Cable cable1 = (Cable) result2_black[3];
			Device device1 = (Device) result2_black[4];
			Object[] result2_green = XDuplexConnectionToConnectionRuleImpl
					.pattern_XDuplexConnectionToConnectionRule_20_2_testcorematchandDECs_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// 
			if (XDuplexConnectionToConnectionRuleImpl
					.pattern_XDuplexConnectionToConnectionRule_20_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBBBBB(
							this, match, container, cable2, device2, cable1, device1)) {
				// 
				if (XDuplexConnectionToConnectionRuleImpl
						.pattern_XDuplexConnectionToConnectionRule_20_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(
								this, match)) {

					Object[] result5_black = XDuplexConnectionToConnectionRuleImpl
							.pattern_XDuplexConnectionToConnectionRule_20_5_Addmatchtoruleresult_blackBBBB(match,
									__performOperation, __result, isApplicableCC);
					if (result5_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match
								+ ", " + "[__performOperation] = " + __performOperation + ", " + "[__result] = "
								+ __result + ", " + "[isApplicableCC] = " + isApplicableCC + ".");
					}
					XDuplexConnectionToConnectionRuleImpl
							.pattern_XDuplexConnectionToConnectionRule_20_5_Addmatchtoruleresult_greenBBBB(match,
									__performOperation, __result, isApplicableCC);

				} else {
				}

			} else {
			}

		}
		return XDuplexConnectionToConnectionRuleImpl
				.pattern_XDuplexConnectionToConnectionRule_20_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_FWD_EMoflonEdge_12(EMoflonEdge _edge_incoming) {

		Object[] result1_bindingAndBlack = XDuplexConnectionToConnectionRuleImpl
				.pattern_XDuplexConnectionToConnectionRule_21_1_preparereturnvalue_bindingAndBlackFFBF(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		EOperation isApplicableCC = (EOperation) result1_bindingAndBlack[3];
		Object[] result1_green = XDuplexConnectionToConnectionRuleImpl
				.pattern_XDuplexConnectionToConnectionRule_21_1_preparereturnvalue_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach 
		for (Object[] result2_black : XDuplexConnectionToConnectionRuleImpl
				.pattern_XDuplexConnectionToConnectionRule_21_2_testcorematchandDECs_blackFFFFFFFB(_edge_incoming)) {
			Connections connection2 = (Connections) result2_black[0];
			XCable xCable = (XCable) result2_black[1];
			XDevice xDevice1 = (XDevice) result2_black[2];
			XContainer xContainer = (XContainer) result2_black[3];
			Connections connection1 = (Connections) result2_black[4];
			XDevice xDevice2 = (XDevice) result2_black[5];
			CableAttributes cableAttributes = (CableAttributes) result2_black[6];
			Object[] result2_green = XDuplexConnectionToConnectionRuleImpl
					.pattern_XDuplexConnectionToConnectionRule_21_2_testcorematchandDECs_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// 
			if (XDuplexConnectionToConnectionRuleImpl
					.pattern_XDuplexConnectionToConnectionRule_21_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBBBBBBB(
							this, match, connection2, xCable, xDevice1, xContainer, connection1, xDevice2,
							cableAttributes)) {
				// 
				if (XDuplexConnectionToConnectionRuleImpl
						.pattern_XDuplexConnectionToConnectionRule_21_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(
								this, match)) {

					Object[] result5_black = XDuplexConnectionToConnectionRuleImpl
							.pattern_XDuplexConnectionToConnectionRule_21_5_Addmatchtoruleresult_blackBBBB(match,
									__performOperation, __result, isApplicableCC);
					if (result5_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match
								+ ", " + "[__performOperation] = " + __performOperation + ", " + "[__result] = "
								+ __result + ", " + "[isApplicableCC] = " + isApplicableCC + ".");
					}
					XDuplexConnectionToConnectionRuleImpl
							.pattern_XDuplexConnectionToConnectionRule_21_5_Addmatchtoruleresult_greenBBBB(match,
									__performOperation, __result, isApplicableCC);

				} else {
				}

			} else {
			}

		}
		return XDuplexConnectionToConnectionRuleImpl
				.pattern_XDuplexConnectionToConnectionRule_21_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AttributeConstraintsRuleResult checkAttributes_FWD(TripleMatch __tripleMatch) {
		AttributeConstraintsRuleResult ruleResult = org.moflon.tgg.runtime.RuntimeFactory.eINSTANCE
				.createAttributeConstraintsRuleResult();
		ruleResult.setRule("XDuplexConnectionToConnectionRule");
		ruleResult.setSuccess(true);

		CSP csp = CspFactory.eINSTANCE.createCSP();

		CheckAttributeHelper __helper = new CheckAttributeHelper(__tripleMatch);

		if (!__helper.hasExpectedValue("cableAttributes", "isDuplex", true, ComparingOperator.EQUAL)) {
			ruleResult.setSuccess(false);
			return ruleResult;
		}

		Variable var_cableAttributes_speed = CSPFactoryHelper.eINSTANCE.createVariable("cableAttributes", true, csp);
		var_cableAttributes_speed.setValue(__helper.getValue("cableAttributes", "speed"));
		var_cableAttributes_speed.setType("BigInteger");

		Variable var_cable2_speed = CSPFactoryHelper.eINSTANCE.createVariable("cable2", true, csp);
		var_cable2_speed.setValue(__helper.getValue("cable2", "speed"));
		var_cable2_speed.setType("BigInteger");

		Variable var_cable1_speed = CSPFactoryHelper.eINSTANCE.createVariable("cable1", true, csp);
		var_cable1_speed.setValue(__helper.getValue("cable1", "speed"));
		var_cable1_speed.setType("BigInteger");

		Eq eq0 = new Eq();
		csp.getConstraints().add(eq0);

		Eq eq1 = new Eq();
		csp.getConstraints().add(eq1);

		eq0.setRuleName("XDuplexConnectionToConnectionRule");
		eq0.solve(var_cableAttributes_speed, var_cable2_speed);

		eq1.setRuleName("XDuplexConnectionToConnectionRule");
		eq1.solve(var_cableAttributes_speed, var_cable1_speed);

		if (csp.check()) {
			ruleResult.setSuccess(true);
		} else {
			eq0.solve(var_cableAttributes_speed, var_cable2_speed);
			eq1.solve(var_cableAttributes_speed, var_cable1_speed);
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
		ruleResult.setRule("XDuplexConnectionToConnectionRule");
		ruleResult.setSuccess(true);

		CSP csp = CspFactory.eINSTANCE.createCSP();

		CheckAttributeHelper __helper = new CheckAttributeHelper(__tripleMatch);

		if (!__helper.hasExpectedValue("cableAttributes", "isDuplex", true, ComparingOperator.EQUAL)) {
			ruleResult.setSuccess(false);
			return ruleResult;
		}

		Variable var_cableAttributes_speed = CSPFactoryHelper.eINSTANCE.createVariable("cableAttributes", true, csp);
		var_cableAttributes_speed.setValue(__helper.getValue("cableAttributes", "speed"));
		var_cableAttributes_speed.setType("BigInteger");

		Variable var_cable2_speed = CSPFactoryHelper.eINSTANCE.createVariable("cable2", true, csp);
		var_cable2_speed.setValue(__helper.getValue("cable2", "speed"));
		var_cable2_speed.setType("BigInteger");

		Variable var_cable1_speed = CSPFactoryHelper.eINSTANCE.createVariable("cable1", true, csp);
		var_cable1_speed.setValue(__helper.getValue("cable1", "speed"));
		var_cable1_speed.setType("BigInteger");

		Eq eq0 = new Eq();
		csp.getConstraints().add(eq0);

		Eq eq1 = new Eq();
		csp.getConstraints().add(eq1);

		eq0.setRuleName("XDuplexConnectionToConnectionRule");
		eq0.solve(var_cableAttributes_speed, var_cable2_speed);

		eq1.setRuleName("XDuplexConnectionToConnectionRule");
		eq1.solve(var_cableAttributes_speed, var_cable1_speed);

		if (csp.check()) {
			ruleResult.setSuccess(true);
		} else {
			eq0.solve(var_cableAttributes_speed, var_cable2_speed);
			eq1.solve(var_cableAttributes_speed, var_cable1_speed);
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

		Object[] result1_black = XDuplexConnectionToConnectionRuleImpl
				.pattern_XDuplexConnectionToConnectionRule_24_1_prepare_blackB(this);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		Object[] result1_green = XDuplexConnectionToConnectionRuleImpl
				.pattern_XDuplexConnectionToConnectionRule_24_1_prepare_greenF();
		IsApplicableRuleResult result = (IsApplicableRuleResult) result1_green[0];

		Object[] result2_bindingAndBlack = XDuplexConnectionToConnectionRuleImpl
				.pattern_XDuplexConnectionToConnectionRule_24_2_matchsrctrgcontext_bindingAndBlackFFFFFFFFFFFFBB(
						sourceMatch, targetMatch);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[sourceMatch] = " + sourceMatch
					+ ", " + "[targetMatch] = " + targetMatch + ".");
		}
		Container container = (Container) result2_bindingAndBlack[0];
		Connections connection2 = (Connections) result2_bindingAndBlack[1];
		XCable xCable = (XCable) result2_bindingAndBlack[2];
		XDevice xDevice1 = (XDevice) result2_bindingAndBlack[3];
		Cable cable2 = (Cable) result2_bindingAndBlack[4];
		XContainer xContainer = (XContainer) result2_bindingAndBlack[5];
		Connections connection1 = (Connections) result2_bindingAndBlack[6];
		XDevice xDevice2 = (XDevice) result2_bindingAndBlack[7];
		Device device2 = (Device) result2_bindingAndBlack[8];
		CableAttributes cableAttributes = (CableAttributes) result2_bindingAndBlack[9];
		Cable cable1 = (Cable) result2_bindingAndBlack[10];
		Device device1 = (Device) result2_bindingAndBlack[11];

		Object[] result3_bindingAndBlack = XDuplexConnectionToConnectionRuleImpl
				.pattern_XDuplexConnectionToConnectionRule_24_3_solvecsp_bindingAndBlackFBBBBBBBBBBBBBBB(this,
						container, connection2, xCable, xDevice1, cable2, xContainer, connection1, xDevice2, device2,
						cableAttributes, cable1, device1, sourceMatch, targetMatch);
		if (result3_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[container] = " + container + ", " + "[connection2] = " + connection2 + ", " + "[xCable] = "
					+ xCable + ", " + "[xDevice1] = " + xDevice1 + ", " + "[cable2] = " + cable2 + ", "
					+ "[xContainer] = " + xContainer + ", " + "[connection1] = " + connection1 + ", " + "[xDevice2] = "
					+ xDevice2 + ", " + "[device2] = " + device2 + ", " + "[cableAttributes] = " + cableAttributes
					+ ", " + "[cable1] = " + cable1 + ", " + "[device1] = " + device1 + ", " + "[sourceMatch] = "
					+ sourceMatch + ", " + "[targetMatch] = " + targetMatch + ".");
		}
		CSP csp = (CSP) result3_bindingAndBlack[0];
		// 
		if (XDuplexConnectionToConnectionRuleImpl
				.pattern_XDuplexConnectionToConnectionRule_24_4_checkCSP_expressionFB(csp)) {
			// ForEach 
			for (Object[] result5_black : XDuplexConnectionToConnectionRuleImpl
					.pattern_XDuplexConnectionToConnectionRule_24_5_matchcorrcontext_blackFBBBFFBBBFBBB(xCable,
							xDevice1, cable2, xDevice2, device2, cable1, device1, sourceMatch, targetMatch)) {
				XDeviceToDevice xDeviceToDevice2 = (XDeviceToDevice) result5_black[0];
				XDeviceToDevice xDeviceToDevice = (XDeviceToDevice) result5_black[4];
				XCableToCable xCableToCable2 = (XCableToCable) result5_black[5];
				XCableToCable xCableToCable1 = (XCableToCable) result5_black[9];
				Object[] result5_green = XDuplexConnectionToConnectionRuleImpl
						.pattern_XDuplexConnectionToConnectionRule_24_5_matchcorrcontext_greenBBBBBBF(xDeviceToDevice2,
								xDeviceToDevice, xCableToCable2, xCableToCable1, sourceMatch, targetMatch);
				CCMatch ccMatch = (CCMatch) result5_green[6];

				Object[] result6_black = XDuplexConnectionToConnectionRuleImpl
						.pattern_XDuplexConnectionToConnectionRule_24_6_createcorrespondence_blackBBBBBBBBBBBBB(
								container, connection2, xCable, xDevice1, cable2, xContainer, connection1, xDevice2,
								device2, cableAttributes, cable1, device1, ccMatch);
				if (result6_black == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[container] = "
							+ container + ", " + "[connection2] = " + connection2 + ", " + "[xCable] = " + xCable + ", "
							+ "[xDevice1] = " + xDevice1 + ", " + "[cable2] = " + cable2 + ", " + "[xContainer] = "
							+ xContainer + ", " + "[connection1] = " + connection1 + ", " + "[xDevice2] = " + xDevice2
							+ ", " + "[device2] = " + device2 + ", " + "[cableAttributes] = " + cableAttributes + ", "
							+ "[cable1] = " + cable1 + ", " + "[device1] = " + device1 + ", " + "[ccMatch] = " + ccMatch
							+ ".");
				}

				Object[] result7_black = XDuplexConnectionToConnectionRuleImpl
						.pattern_XDuplexConnectionToConnectionRule_24_7_addtoreturnedresult_blackBB(result, ccMatch);
				if (result7_black == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[result] = " + result
							+ ", " + "[ccMatch] = " + ccMatch + ".");
				}
				XDuplexConnectionToConnectionRuleImpl
						.pattern_XDuplexConnectionToConnectionRule_24_7_addtoreturnedresult_greenBB(result, ccMatch);

			}

		} else {
		}
		return XDuplexConnectionToConnectionRuleImpl
				.pattern_XDuplexConnectionToConnectionRule_24_8_expressionFB(result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isApplicable_solveCsp_CC(Container container, Connections connection2, XCable xCable, XDevice xDevice1,
			Cable cable2, XContainer xContainer, Connections connection1, XDevice xDevice2, Device device2,
			CableAttributes cableAttributes, Cable cable1, Device device1, Match sourceMatch, Match targetMatch) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();

		// Create literals

		// Create attribute variables
		Variable var_cableAttributes_speed = CSPFactoryHelper.eINSTANCE.createVariable("cableAttributes.speed", true,
				csp);
		var_cableAttributes_speed.setValue(cableAttributes.getSpeed());
		var_cableAttributes_speed.setType("BigInteger");
		Variable var_cable2_speed = CSPFactoryHelper.eINSTANCE.createVariable("cable2.speed", true, csp);
		var_cable2_speed.setValue(cable2.getSpeed());
		var_cable2_speed.setType("BigInteger");
		Variable var_cable1_speed = CSPFactoryHelper.eINSTANCE.createVariable("cable1.speed", true, csp);
		var_cable1_speed.setValue(cable1.getSpeed());
		var_cable1_speed.setType("BigInteger");

		// Create unbound variables

		// Create constraints
		Eq eq = new Eq();
		Eq eq_0 = new Eq();

		csp.getConstraints().add(eq);
		csp.getConstraints().add(eq_0);

		// Solve CSP
		eq.setRuleName("NoRuleName");
		eq.solve(var_cableAttributes_speed, var_cable2_speed);
		eq_0.setRuleName("NoRuleName");
		eq_0.solve(var_cableAttributes_speed, var_cable1_speed);
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
	public boolean checkDEC_FWD(Connections connection2, XCable xCable, XDevice xDevice1, XContainer xContainer,
			Connections connection1, XDevice xDevice2, CableAttributes cableAttributes) {// 
		Object[] result1_black = XDuplexConnectionToConnectionRuleImpl
				.pattern_XDuplexConnectionToConnectionRule_27_1_matchtggpattern_blackBBBBBBB(connection2, xCable,
						xDevice1, xContainer, connection1, xDevice2, cableAttributes);
		if (result1_black != null) {
			XDuplexConnectionToConnectionRuleImpl
					.pattern_XDuplexConnectionToConnectionRule_27_1_matchtggpattern_greenB(cableAttributes);

			return XDuplexConnectionToConnectionRuleImpl.pattern_XDuplexConnectionToConnectionRule_27_2_expressionF();
		} else {
			return XDuplexConnectionToConnectionRuleImpl.pattern_XDuplexConnectionToConnectionRule_27_3_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean checkDEC_BWD(Container container, Cable cable2, Device device2, Cable cable1, Device device1) {// 
		Object[] result1_black = XDuplexConnectionToConnectionRuleImpl
				.pattern_XDuplexConnectionToConnectionRule_28_1_matchtggpattern_blackBBBBB(container, cable2, device2,
						cable1, device1);
		if (result1_black != null) {
			return XDuplexConnectionToConnectionRuleImpl.pattern_XDuplexConnectionToConnectionRule_28_2_expressionF();
		} else {
			return XDuplexConnectionToConnectionRuleImpl.pattern_XDuplexConnectionToConnectionRule_28_3_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModelgeneratorRuleResult generateModel(RuleEntryContainer ruleEntryContainer,
			XDeviceToDevice xDeviceToDevice2Parameter) {

		Object[] result1_black = XDuplexConnectionToConnectionRuleImpl
				.pattern_XDuplexConnectionToConnectionRule_29_1_createresult_blackB(this);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		Object[] result1_green = XDuplexConnectionToConnectionRuleImpl
				.pattern_XDuplexConnectionToConnectionRule_29_1_createresult_greenFF();
		IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result1_green[0];
		ModelgeneratorRuleResult ruleResult = (ModelgeneratorRuleResult) result1_green[1];

		// ForEach 
		for (Object[] result2_black : XDuplexConnectionToConnectionRuleImpl
				.pattern_XDuplexConnectionToConnectionRule_29_2_isapplicablecore_blackFFFFFFFFFFFFFFFFFBB(
						ruleEntryContainer, ruleResult)) {
			//nothing RuleEntryList xDeviceToDevice2List = (RuleEntryList) result2_black[0];
			Container container = (Container) result2_black[1];
			Device device2 = (Device) result2_black[2];
			XDeviceToDevice xDeviceToDevice2 = (XDeviceToDevice) result2_black[3];
			XDevice xDevice2 = (XDevice) result2_black[4];
			Connections connection2 = (Connections) result2_black[5];
			XContainer xContainer = (XContainer) result2_black[6];
			XCable xCable = (XCable) result2_black[7];
			CableAttributes cableAttributes = (CableAttributes) result2_black[8];
			XCableToCable xCableToCable2 = (XCableToCable) result2_black[9];
			Cable cable2 = (Cable) result2_black[10];
			XCableToCable xCableToCable1 = (XCableToCable) result2_black[11];
			Cable cable1 = (Cable) result2_black[12];
			XDevice xDevice1 = (XDevice) result2_black[13];
			Connections connection1 = (Connections) result2_black[14];
			XDeviceToDevice xDeviceToDevice = (XDeviceToDevice) result2_black[15];
			Device device1 = (Device) result2_black[16];
			XDuplexConnectionToConnectionRuleImpl
					.pattern_XDuplexConnectionToConnectionRule_29_2_isapplicablecore_greenB(cableAttributes);

			Object[] result3_bindingAndBlack = XDuplexConnectionToConnectionRuleImpl
					.pattern_XDuplexConnectionToConnectionRule_29_3_solveCSP_bindingAndBlackFBBBBBBBBBBBBBBBBBBB(this,
							isApplicableMatch, container, connection2, xDeviceToDevice2, xCable, xDevice1, cable2,
							xContainer, connection1, xDeviceToDevice, xCableToCable2, xDevice2, device2,
							cableAttributes, cable1, xCableToCable1, device1, ruleResult);
			if (result3_bindingAndBlack == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
						+ "[isApplicableMatch] = " + isApplicableMatch + ", " + "[container] = " + container + ", "
						+ "[connection2] = " + connection2 + ", " + "[xDeviceToDevice2] = " + xDeviceToDevice2 + ", "
						+ "[xCable] = " + xCable + ", " + "[xDevice1] = " + xDevice1 + ", " + "[cable2] = " + cable2
						+ ", " + "[xContainer] = " + xContainer + ", " + "[connection1] = " + connection1 + ", "
						+ "[xDeviceToDevice] = " + xDeviceToDevice + ", " + "[xCableToCable2] = " + xCableToCable2
						+ ", " + "[xDevice2] = " + xDevice2 + ", " + "[device2] = " + device2 + ", "
						+ "[cableAttributes] = " + cableAttributes + ", " + "[cable1] = " + cable1 + ", "
						+ "[xCableToCable1] = " + xCableToCable1 + ", " + "[device1] = " + device1 + ", "
						+ "[ruleResult] = " + ruleResult + ".");
			}
			CSP csp = (CSP) result3_bindingAndBlack[0];
			// 
			if (XDuplexConnectionToConnectionRuleImpl
					.pattern_XDuplexConnectionToConnectionRule_29_4_checkCSP_expressionFBB(this, csp)) {
				// 
				Object[] result5_black = XDuplexConnectionToConnectionRuleImpl
						.pattern_XDuplexConnectionToConnectionRule_29_5_checknacs_blackBBBBBBBBBBBBBBBB(container,
								connection2, xDeviceToDevice2, xCable, xDevice1, cable2, xContainer, connection1,
								xDeviceToDevice, xCableToCable2, xDevice2, device2, cableAttributes, cable1,
								xCableToCable1, device1);
				if (result5_black != null) {
					XDuplexConnectionToConnectionRuleImpl
							.pattern_XDuplexConnectionToConnectionRule_29_5_checknacs_greenB(cableAttributes);

					Object[] result6_black = XDuplexConnectionToConnectionRuleImpl
							.pattern_XDuplexConnectionToConnectionRule_29_6_perform_blackBBBBBBBBBBBBBBBBB(container,
									connection2, xDeviceToDevice2, xCable, xDevice1, cable2, xContainer, connection1,
									xDeviceToDevice, xCableToCable2, xDevice2, device2, cableAttributes, cable1,
									xCableToCable1, device1, ruleResult);
					if (result6_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[container] = "
								+ container + ", " + "[connection2] = " + connection2 + ", " + "[xDeviceToDevice2] = "
								+ xDeviceToDevice2 + ", " + "[xCable] = " + xCable + ", " + "[xDevice1] = " + xDevice1
								+ ", " + "[cable2] = " + cable2 + ", " + "[xContainer] = " + xContainer + ", "
								+ "[connection1] = " + connection1 + ", " + "[xDeviceToDevice] = " + xDeviceToDevice
								+ ", " + "[xCableToCable2] = " + xCableToCable2 + ", " + "[xDevice2] = " + xDevice2
								+ ", " + "[device2] = " + device2 + ", " + "[cableAttributes] = " + cableAttributes
								+ ", " + "[cable1] = " + cable1 + ", " + "[xCableToCable1] = " + xCableToCable1 + ", "
								+ "[device1] = " + device1 + ", " + "[ruleResult] = " + ruleResult + ".");
					}
					XDuplexConnectionToConnectionRuleImpl
							.pattern_XDuplexConnectionToConnectionRule_29_6_perform_greenBBBBBBBBBBB(connection2,
									xCable, xDevice1, cable2, connection1, xDevice2, device2, cableAttributes, cable1,
									device1, ruleResult);

				} else {
				}

			} else {
			}

		}
		return XDuplexConnectionToConnectionRuleImpl
				.pattern_XDuplexConnectionToConnectionRule_29_7_expressionFB(ruleResult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP generateModel_solveCsp_BWD(IsApplicableMatch isApplicableMatch, Container container,
			Connections connection2, XDeviceToDevice xDeviceToDevice2, XCable xCable, XDevice xDevice1, Cable cable2,
			XContainer xContainer, Connections connection1, XDeviceToDevice xDeviceToDevice,
			XCableToCable xCableToCable2, XDevice xDevice2, Device device2, CableAttributes cableAttributes,
			Cable cable1, XCableToCable xCableToCable1, Device device1, ModelgeneratorRuleResult ruleResult) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals

		// Create attribute variables
		Variable var_cableAttributes_speed = CSPFactoryHelper.eINSTANCE.createVariable("cableAttributes.speed", true,
				csp);
		var_cableAttributes_speed.setValue(cableAttributes.getSpeed());
		var_cableAttributes_speed.setType("BigInteger");
		Variable var_cable2_speed = CSPFactoryHelper.eINSTANCE.createVariable("cable2.speed", true, csp);
		var_cable2_speed.setValue(cable2.getSpeed());
		var_cable2_speed.setType("BigInteger");
		Variable var_cable1_speed = CSPFactoryHelper.eINSTANCE.createVariable("cable1.speed", true, csp);
		var_cable1_speed.setValue(cable1.getSpeed());
		var_cable1_speed.setType("BigInteger");

		// Create unbound variables

		// Create constraints
		Eq eq = new Eq();
		Eq eq_0 = new Eq();

		csp.getConstraints().add(eq);
		csp.getConstraints().add(eq_0);

		// Solve CSP
		eq.setRuleName("NoRuleName");
		eq.solve(var_cableAttributes_speed, var_cable2_speed);
		eq_0.setRuleName("NoRuleName");
		eq_0.solve(var_cableAttributes_speed, var_cable1_speed);

		// Snapshot pattern match on which CSP is solved
		isApplicableMatch.registerObject("container", container);
		isApplicableMatch.registerObject("connection2", connection2);
		isApplicableMatch.registerObject("xDeviceToDevice2", xDeviceToDevice2);
		isApplicableMatch.registerObject("xCable", xCable);
		isApplicableMatch.registerObject("xDevice1", xDevice1);
		isApplicableMatch.registerObject("cable2", cable2);
		isApplicableMatch.registerObject("xContainer", xContainer);
		isApplicableMatch.registerObject("connection1", connection1);
		isApplicableMatch.registerObject("xDeviceToDevice", xDeviceToDevice);
		isApplicableMatch.registerObject("xCableToCable2", xCableToCable2);
		isApplicableMatch.registerObject("xDevice2", xDevice2);
		isApplicableMatch.registerObject("device2", device2);
		isApplicableMatch.registerObject("cableAttributes", cableAttributes);
		isApplicableMatch.registerObject("cable1", cable1);
		isApplicableMatch.registerObject("xCableToCable1", xCableToCable1);
		isApplicableMatch.registerObject("device1", device1);
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
		case RulesPackage.XDUPLEX_CONNECTION_TO_CONNECTION_RULE___IS_APPROPRIATE_FWD__MATCH_CONNECTIONS_XCABLE_XDEVICE_XCONTAINER_CONNECTIONS_XDEVICE_CABLEATTRIBUTES:
			return isAppropriate_FWD((Match) arguments.get(0), (Connections) arguments.get(1),
					(XCable) arguments.get(2), (XDevice) arguments.get(3), (XContainer) arguments.get(4),
					(Connections) arguments.get(5), (XDevice) arguments.get(6), (CableAttributes) arguments.get(7));
		case RulesPackage.XDUPLEX_CONNECTION_TO_CONNECTION_RULE___PERFORM_FWD__ISAPPLICABLEMATCH:
			return perform_FWD((IsApplicableMatch) arguments.get(0));
		case RulesPackage.XDUPLEX_CONNECTION_TO_CONNECTION_RULE___IS_APPLICABLE_FWD__MATCH:
			return isApplicable_FWD((Match) arguments.get(0));
		case RulesPackage.XDUPLEX_CONNECTION_TO_CONNECTION_RULE___REGISTER_OBJECTS_TO_MATCH_FWD__MATCH_CONNECTIONS_XCABLE_XDEVICE_XCONTAINER_CONNECTIONS_XDEVICE_CABLEATTRIBUTES:
			registerObjectsToMatch_FWD((Match) arguments.get(0), (Connections) arguments.get(1),
					(XCable) arguments.get(2), (XDevice) arguments.get(3), (XContainer) arguments.get(4),
					(Connections) arguments.get(5), (XDevice) arguments.get(6), (CableAttributes) arguments.get(7));
			return null;
		case RulesPackage.XDUPLEX_CONNECTION_TO_CONNECTION_RULE___IS_APPROPRIATE_SOLVE_CSP_FWD__MATCH_CONNECTIONS_XCABLE_XDEVICE_XCONTAINER_CONNECTIONS_XDEVICE_CABLEATTRIBUTES:
			return isAppropriate_solveCsp_FWD((Match) arguments.get(0), (Connections) arguments.get(1),
					(XCable) arguments.get(2), (XDevice) arguments.get(3), (XContainer) arguments.get(4),
					(Connections) arguments.get(5), (XDevice) arguments.get(6), (CableAttributes) arguments.get(7));
		case RulesPackage.XDUPLEX_CONNECTION_TO_CONNECTION_RULE___IS_APPROPRIATE_CHECK_CSP_FWD__CSP:
			return isAppropriate_checkCsp_FWD((CSP) arguments.get(0));
		case RulesPackage.XDUPLEX_CONNECTION_TO_CONNECTION_RULE___IS_APPLICABLE_SOLVE_CSP_FWD__ISAPPLICABLEMATCH_CONTAINER_CONNECTIONS_XDEVICETODEVICE_XCABLE_XDEVICE_CABLE_XCONTAINER_CONNECTIONS_XDEVICETODEVICE_XCABLETOCABLE_XDEVICE_DEVICE_CABLEATTRIBUTES_CABLE_XCABLETOCABLE_DEVICE:
			return isApplicable_solveCsp_FWD((IsApplicableMatch) arguments.get(0), (Container) arguments.get(1),
					(Connections) arguments.get(2), (XDeviceToDevice) arguments.get(3), (XCable) arguments.get(4),
					(XDevice) arguments.get(5), (Cable) arguments.get(6), (XContainer) arguments.get(7),
					(Connections) arguments.get(8), (XDeviceToDevice) arguments.get(9),
					(XCableToCable) arguments.get(10), (XDevice) arguments.get(11), (Device) arguments.get(12),
					(CableAttributes) arguments.get(13), (Cable) arguments.get(14), (XCableToCable) arguments.get(15),
					(Device) arguments.get(16));
		case RulesPackage.XDUPLEX_CONNECTION_TO_CONNECTION_RULE___IS_APPLICABLE_CHECK_CSP_FWD__CSP:
			return isApplicable_checkCsp_FWD((CSP) arguments.get(0));
		case RulesPackage.XDUPLEX_CONNECTION_TO_CONNECTION_RULE___REGISTER_OBJECTS_FWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT:
			registerObjects_FWD((PerformRuleResult) arguments.get(0), (EObject) arguments.get(1),
					(EObject) arguments.get(2), (EObject) arguments.get(3), (EObject) arguments.get(4),
					(EObject) arguments.get(5), (EObject) arguments.get(6), (EObject) arguments.get(7),
					(EObject) arguments.get(8), (EObject) arguments.get(9), (EObject) arguments.get(10),
					(EObject) arguments.get(11), (EObject) arguments.get(12), (EObject) arguments.get(13),
					(EObject) arguments.get(14), (EObject) arguments.get(15), (EObject) arguments.get(16));
			return null;
		case RulesPackage.XDUPLEX_CONNECTION_TO_CONNECTION_RULE___CHECK_TYPES_FWD__MATCH:
			return checkTypes_FWD((Match) arguments.get(0));
		case RulesPackage.XDUPLEX_CONNECTION_TO_CONNECTION_RULE___IS_APPROPRIATE_BWD__MATCH_CONTAINER_CABLE_DEVICE_CABLE_DEVICE:
			return isAppropriate_BWD((Match) arguments.get(0), (Container) arguments.get(1), (Cable) arguments.get(2),
					(Device) arguments.get(3), (Cable) arguments.get(4), (Device) arguments.get(5));
		case RulesPackage.XDUPLEX_CONNECTION_TO_CONNECTION_RULE___PERFORM_BWD__ISAPPLICABLEMATCH:
			return perform_BWD((IsApplicableMatch) arguments.get(0));
		case RulesPackage.XDUPLEX_CONNECTION_TO_CONNECTION_RULE___IS_APPLICABLE_BWD__MATCH:
			return isApplicable_BWD((Match) arguments.get(0));
		case RulesPackage.XDUPLEX_CONNECTION_TO_CONNECTION_RULE___REGISTER_OBJECTS_TO_MATCH_BWD__MATCH_CONTAINER_CABLE_DEVICE_CABLE_DEVICE:
			registerObjectsToMatch_BWD((Match) arguments.get(0), (Container) arguments.get(1), (Cable) arguments.get(2),
					(Device) arguments.get(3), (Cable) arguments.get(4), (Device) arguments.get(5));
			return null;
		case RulesPackage.XDUPLEX_CONNECTION_TO_CONNECTION_RULE___IS_APPROPRIATE_SOLVE_CSP_BWD__MATCH_CONTAINER_CABLE_DEVICE_CABLE_DEVICE:
			return isAppropriate_solveCsp_BWD((Match) arguments.get(0), (Container) arguments.get(1),
					(Cable) arguments.get(2), (Device) arguments.get(3), (Cable) arguments.get(4),
					(Device) arguments.get(5));
		case RulesPackage.XDUPLEX_CONNECTION_TO_CONNECTION_RULE___IS_APPROPRIATE_CHECK_CSP_BWD__CSP:
			return isAppropriate_checkCsp_BWD((CSP) arguments.get(0));
		case RulesPackage.XDUPLEX_CONNECTION_TO_CONNECTION_RULE___IS_APPLICABLE_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_CONTAINER_CONNECTIONS_XDEVICETODEVICE_XCABLE_XDEVICE_CABLE_XCONTAINER_CONNECTIONS_XDEVICETODEVICE_XCABLETOCABLE_XDEVICE_DEVICE_CABLEATTRIBUTES_CABLE_XCABLETOCABLE_DEVICE:
			return isApplicable_solveCsp_BWD((IsApplicableMatch) arguments.get(0), (Container) arguments.get(1),
					(Connections) arguments.get(2), (XDeviceToDevice) arguments.get(3), (XCable) arguments.get(4),
					(XDevice) arguments.get(5), (Cable) arguments.get(6), (XContainer) arguments.get(7),
					(Connections) arguments.get(8), (XDeviceToDevice) arguments.get(9),
					(XCableToCable) arguments.get(10), (XDevice) arguments.get(11), (Device) arguments.get(12),
					(CableAttributes) arguments.get(13), (Cable) arguments.get(14), (XCableToCable) arguments.get(15),
					(Device) arguments.get(16));
		case RulesPackage.XDUPLEX_CONNECTION_TO_CONNECTION_RULE___IS_APPLICABLE_CHECK_CSP_BWD__CSP:
			return isApplicable_checkCsp_BWD((CSP) arguments.get(0));
		case RulesPackage.XDUPLEX_CONNECTION_TO_CONNECTION_RULE___REGISTER_OBJECTS_BWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT:
			registerObjects_BWD((PerformRuleResult) arguments.get(0), (EObject) arguments.get(1),
					(EObject) arguments.get(2), (EObject) arguments.get(3), (EObject) arguments.get(4),
					(EObject) arguments.get(5), (EObject) arguments.get(6), (EObject) arguments.get(7),
					(EObject) arguments.get(8), (EObject) arguments.get(9), (EObject) arguments.get(10),
					(EObject) arguments.get(11), (EObject) arguments.get(12), (EObject) arguments.get(13),
					(EObject) arguments.get(14), (EObject) arguments.get(15), (EObject) arguments.get(16));
			return null;
		case RulesPackage.XDUPLEX_CONNECTION_TO_CONNECTION_RULE___CHECK_TYPES_BWD__MATCH:
			return checkTypes_BWD((Match) arguments.get(0));
		case RulesPackage.XDUPLEX_CONNECTION_TO_CONNECTION_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_16__EMOFLONEDGE:
			return isAppropriate_BWD_EMoflonEdge_16((EMoflonEdge) arguments.get(0));
		case RulesPackage.XDUPLEX_CONNECTION_TO_CONNECTION_RULE___IS_APPROPRIATE_FWD_EMOFLON_EDGE_12__EMOFLONEDGE:
			return isAppropriate_FWD_EMoflonEdge_12((EMoflonEdge) arguments.get(0));
		case RulesPackage.XDUPLEX_CONNECTION_TO_CONNECTION_RULE___CHECK_ATTRIBUTES_FWD__TRIPLEMATCH:
			return checkAttributes_FWD((TripleMatch) arguments.get(0));
		case RulesPackage.XDUPLEX_CONNECTION_TO_CONNECTION_RULE___CHECK_ATTRIBUTES_BWD__TRIPLEMATCH:
			return checkAttributes_BWD((TripleMatch) arguments.get(0));
		case RulesPackage.XDUPLEX_CONNECTION_TO_CONNECTION_RULE___IS_APPLICABLE_CC__MATCH_MATCH:
			return isApplicable_CC((Match) arguments.get(0), (Match) arguments.get(1));
		case RulesPackage.XDUPLEX_CONNECTION_TO_CONNECTION_RULE___IS_APPLICABLE_SOLVE_CSP_CC__CONTAINER_CONNECTIONS_XCABLE_XDEVICE_CABLE_XCONTAINER_CONNECTIONS_XDEVICE_DEVICE_CABLEATTRIBUTES_CABLE_DEVICE_MATCH_MATCH:
			return isApplicable_solveCsp_CC((Container) arguments.get(0), (Connections) arguments.get(1),
					(XCable) arguments.get(2), (XDevice) arguments.get(3), (Cable) arguments.get(4),
					(XContainer) arguments.get(5), (Connections) arguments.get(6), (XDevice) arguments.get(7),
					(Device) arguments.get(8), (CableAttributes) arguments.get(9), (Cable) arguments.get(10),
					(Device) arguments.get(11), (Match) arguments.get(12), (Match) arguments.get(13));
		case RulesPackage.XDUPLEX_CONNECTION_TO_CONNECTION_RULE___IS_APPLICABLE_CHECK_CSP_CC__CSP:
			return isApplicable_checkCsp_CC((CSP) arguments.get(0));
		case RulesPackage.XDUPLEX_CONNECTION_TO_CONNECTION_RULE___CHECK_DEC_FWD__CONNECTIONS_XCABLE_XDEVICE_XCONTAINER_CONNECTIONS_XDEVICE_CABLEATTRIBUTES:
			return checkDEC_FWD((Connections) arguments.get(0), (XCable) arguments.get(1), (XDevice) arguments.get(2),
					(XContainer) arguments.get(3), (Connections) arguments.get(4), (XDevice) arguments.get(5),
					(CableAttributes) arguments.get(6));
		case RulesPackage.XDUPLEX_CONNECTION_TO_CONNECTION_RULE___CHECK_DEC_BWD__CONTAINER_CABLE_DEVICE_CABLE_DEVICE:
			return checkDEC_BWD((Container) arguments.get(0), (Cable) arguments.get(1), (Device) arguments.get(2),
					(Cable) arguments.get(3), (Device) arguments.get(4));
		case RulesPackage.XDUPLEX_CONNECTION_TO_CONNECTION_RULE___GENERATE_MODEL__RULEENTRYCONTAINER_XDEVICETODEVICE:
			return generateModel((RuleEntryContainer) arguments.get(0), (XDeviceToDevice) arguments.get(1));
		case RulesPackage.XDUPLEX_CONNECTION_TO_CONNECTION_RULE___GENERATE_MODEL_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_CONTAINER_CONNECTIONS_XDEVICETODEVICE_XCABLE_XDEVICE_CABLE_XCONTAINER_CONNECTIONS_XDEVICETODEVICE_XCABLETOCABLE_XDEVICE_DEVICE_CABLEATTRIBUTES_CABLE_XCABLETOCABLE_DEVICE_MODELGENERATORRULERESULT:
			return generateModel_solveCsp_BWD((IsApplicableMatch) arguments.get(0), (Container) arguments.get(1),
					(Connections) arguments.get(2), (XDeviceToDevice) arguments.get(3), (XCable) arguments.get(4),
					(XDevice) arguments.get(5), (Cable) arguments.get(6), (XContainer) arguments.get(7),
					(Connections) arguments.get(8), (XDeviceToDevice) arguments.get(9),
					(XCableToCable) arguments.get(10), (XDevice) arguments.get(11), (Device) arguments.get(12),
					(CableAttributes) arguments.get(13), (Cable) arguments.get(14), (XCableToCable) arguments.get(15),
					(Device) arguments.get(16), (ModelgeneratorRuleResult) arguments.get(17));
		case RulesPackage.XDUPLEX_CONNECTION_TO_CONNECTION_RULE___GENERATE_MODEL_CHECK_CSP_BWD__CSP:
			return generateModel_checkCsp_BWD((CSP) arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
	}

	public static final Object[] pattern_XDuplexConnectionToConnectionRule_0_1_initialbindings_blackBBBBBBBBB(
			XDuplexConnectionToConnectionRule _this, Match match, Connections connection2, XCable xCable,
			XDevice xDevice1, XContainer xContainer, Connections connection1, XDevice xDevice2,
			CableAttributes cableAttributes) {
		if (!xDevice1.equals(xDevice2)) {
			if (!connection1.equals(connection2)) {
				return new Object[] { _this, match, connection2, xCable, xDevice1, xContainer, connection1, xDevice2,
						cableAttributes };
			}
		}
		return null;
	}

	public static final Object[] pattern_XDuplexConnectionToConnectionRule_0_2_SolveCSP_bindingFBBBBBBBBB(
			XDuplexConnectionToConnectionRule _this, Match match, Connections connection2, XCable xCable,
			XDevice xDevice1, XContainer xContainer, Connections connection1, XDevice xDevice2,
			CableAttributes cableAttributes) {
		CSP _localVariable_0 = _this.isAppropriate_solveCsp_FWD(match, connection2, xCable, xDevice1, xContainer,
				connection1, xDevice2, cableAttributes);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, match, connection2, xCable, xDevice1, xContainer, connection1, xDevice2,
					cableAttributes };
		}
		return null;
	}

	public static final Object[] pattern_XDuplexConnectionToConnectionRule_0_2_SolveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_XDuplexConnectionToConnectionRule_0_2_SolveCSP_bindingAndBlackFBBBBBBBBB(
			XDuplexConnectionToConnectionRule _this, Match match, Connections connection2, XCable xCable,
			XDevice xDevice1, XContainer xContainer, Connections connection1, XDevice xDevice2,
			CableAttributes cableAttributes) {
		Object[] result_pattern_XDuplexConnectionToConnectionRule_0_2_SolveCSP_binding = pattern_XDuplexConnectionToConnectionRule_0_2_SolveCSP_bindingFBBBBBBBBB(
				_this, match, connection2, xCable, xDevice1, xContainer, connection1, xDevice2, cableAttributes);
		if (result_pattern_XDuplexConnectionToConnectionRule_0_2_SolveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_XDuplexConnectionToConnectionRule_0_2_SolveCSP_binding[0];

			Object[] result_pattern_XDuplexConnectionToConnectionRule_0_2_SolveCSP_black = pattern_XDuplexConnectionToConnectionRule_0_2_SolveCSP_blackB(
					csp);
			if (result_pattern_XDuplexConnectionToConnectionRule_0_2_SolveCSP_black != null) {

				return new Object[] { csp, _this, match, connection2, xCable, xDevice1, xContainer, connection1,
						xDevice2, cableAttributes };
			}
		}
		return null;
	}

	public static final boolean pattern_XDuplexConnectionToConnectionRule_0_3_CheckCSP_expressionFBB(
			XDuplexConnectionToConnectionRule _this, CSP csp) {
		boolean _localVariable_0 = _this.isAppropriate_checkCsp_FWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_XDuplexConnectionToConnectionRule_0_4_collectelementstobetranslated_blackBBBBBBBB(
			Match match, Connections connection2, XCable xCable, XDevice xDevice1, XContainer xContainer,
			Connections connection1, XDevice xDevice2, CableAttributes cableAttributes) {
		if (!xDevice1.equals(xDevice2)) {
			if (!connection1.equals(connection2)) {
				return new Object[] { match, connection2, xCable, xDevice1, xContainer, connection1, xDevice2,
						cableAttributes };
			}
		}
		return null;
	}

	public static final Object[] pattern_XDuplexConnectionToConnectionRule_0_4_collectelementstobetranslated_greenBBBBBBBFFFF(
			Match match, Connections connection2, XCable xCable, XDevice xDevice1, Connections connection1,
			XDevice xDevice2, CableAttributes cableAttributes) {
		EMoflonEdge connection2__xCable____incoming = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge connection1__xCable____outgoing = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge cableAttributes__xDevice2____endPoint2 = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge cableAttributes__xDevice1____endPoint1 = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String connection2__xCable____incoming_name_prime = "incoming";
		String connection1__xCable____outgoing_name_prime = "outgoing";
		String cableAttributes__xDevice2____endPoint2_name_prime = "endPoint2";
		String cableAttributes__xDevice1____endPoint1_name_prime = "endPoint1";
		connection2__xCable____incoming.setSrc(connection2);
		connection2__xCable____incoming.setTrg(xCable);
		match.getToBeTranslatedEdges().add(connection2__xCable____incoming);
		connection1__xCable____outgoing.setSrc(connection1);
		connection1__xCable____outgoing.setTrg(xCable);
		match.getToBeTranslatedEdges().add(connection1__xCable____outgoing);
		cableAttributes__xDevice2____endPoint2.setSrc(cableAttributes);
		cableAttributes__xDevice2____endPoint2.setTrg(xDevice2);
		match.getToBeTranslatedEdges().add(cableAttributes__xDevice2____endPoint2);
		cableAttributes__xDevice1____endPoint1.setSrc(cableAttributes);
		cableAttributes__xDevice1____endPoint1.setTrg(xDevice1);
		match.getToBeTranslatedEdges().add(cableAttributes__xDevice1____endPoint1);
		connection2__xCable____incoming.setName(connection2__xCable____incoming_name_prime);
		connection1__xCable____outgoing.setName(connection1__xCable____outgoing_name_prime);
		cableAttributes__xDevice2____endPoint2.setName(cableAttributes__xDevice2____endPoint2_name_prime);
		cableAttributes__xDevice1____endPoint1.setName(cableAttributes__xDevice1____endPoint1_name_prime);
		return new Object[] { match, connection2, xCable, xDevice1, connection1, xDevice2, cableAttributes,
				connection2__xCable____incoming, connection1__xCable____outgoing,
				cableAttributes__xDevice2____endPoint2, cableAttributes__xDevice1____endPoint1 };
	}

	public static final Object[] pattern_XDuplexConnectionToConnectionRule_0_5_collectcontextelements_blackBBBBBBBB(
			Match match, Connections connection2, XCable xCable, XDevice xDevice1, XContainer xContainer,
			Connections connection1, XDevice xDevice2, CableAttributes cableAttributes) {
		if (!xDevice1.equals(xDevice2)) {
			if (!connection1.equals(connection2)) {
				return new Object[] { match, connection2, xCable, xDevice1, xContainer, connection1, xDevice2,
						cableAttributes };
			}
		}
		return null;
	}

	public static final Object[] pattern_XDuplexConnectionToConnectionRule_0_5_collectcontextelements_greenBBBBBBBBFFFFFF(
			Match match, Connections connection2, XCable xCable, XDevice xDevice1, XContainer xContainer,
			Connections connection1, XDevice xDevice2, CableAttributes cableAttributes) {
		EMoflonEdge xCable__cableAttributes____cableAttributes = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge xContainer__xDevice2____elements = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge xDevice2__connection2____connections = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge xDevice1__connection1____connections = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge xContainer__xCable____elements = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge xContainer__xDevice1____elements = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		match.getContextNodes().add(connection2);
		match.getContextNodes().add(xCable);
		match.getContextNodes().add(xDevice1);
		match.getContextNodes().add(xContainer);
		match.getContextNodes().add(connection1);
		match.getContextNodes().add(xDevice2);
		match.getContextNodes().add(cableAttributes);
		String xCable__cableAttributes____cableAttributes_name_prime = "cableAttributes";
		String xContainer__xDevice2____elements_name_prime = "elements";
		String xDevice2__connection2____connections_name_prime = "connections";
		String xDevice1__connection1____connections_name_prime = "connections";
		String xContainer__xCable____elements_name_prime = "elements";
		String xContainer__xDevice1____elements_name_prime = "elements";
		xCable__cableAttributes____cableAttributes.setSrc(xCable);
		xCable__cableAttributes____cableAttributes.setTrg(cableAttributes);
		match.getContextEdges().add(xCable__cableAttributes____cableAttributes);
		xContainer__xDevice2____elements.setSrc(xContainer);
		xContainer__xDevice2____elements.setTrg(xDevice2);
		match.getContextEdges().add(xContainer__xDevice2____elements);
		xDevice2__connection2____connections.setSrc(xDevice2);
		xDevice2__connection2____connections.setTrg(connection2);
		match.getContextEdges().add(xDevice2__connection2____connections);
		xDevice1__connection1____connections.setSrc(xDevice1);
		xDevice1__connection1____connections.setTrg(connection1);
		match.getContextEdges().add(xDevice1__connection1____connections);
		xContainer__xCable____elements.setSrc(xContainer);
		xContainer__xCable____elements.setTrg(xCable);
		match.getContextEdges().add(xContainer__xCable____elements);
		xContainer__xDevice1____elements.setSrc(xContainer);
		xContainer__xDevice1____elements.setTrg(xDevice1);
		match.getContextEdges().add(xContainer__xDevice1____elements);
		xCable__cableAttributes____cableAttributes.setName(xCable__cableAttributes____cableAttributes_name_prime);
		xContainer__xDevice2____elements.setName(xContainer__xDevice2____elements_name_prime);
		xDevice2__connection2____connections.setName(xDevice2__connection2____connections_name_prime);
		xDevice1__connection1____connections.setName(xDevice1__connection1____connections_name_prime);
		xContainer__xCable____elements.setName(xContainer__xCable____elements_name_prime);
		xContainer__xDevice1____elements.setName(xContainer__xDevice1____elements_name_prime);
		return new Object[] { match, connection2, xCable, xDevice1, xContainer, connection1, xDevice2, cableAttributes,
				xCable__cableAttributes____cableAttributes, xContainer__xDevice2____elements,
				xDevice2__connection2____connections, xDevice1__connection1____connections,
				xContainer__xCable____elements, xContainer__xDevice1____elements };
	}

	public static final void pattern_XDuplexConnectionToConnectionRule_0_6_registerobjectstomatch_expressionBBBBBBBBB(
			XDuplexConnectionToConnectionRule _this, Match match, Connections connection2, XCable xCable,
			XDevice xDevice1, XContainer xContainer, Connections connection1, XDevice xDevice2,
			CableAttributes cableAttributes) {
		_this.registerObjectsToMatch_FWD(match, connection2, xCable, xDevice1, xContainer, connection1, xDevice2,
				cableAttributes);

	}

	public static final boolean pattern_XDuplexConnectionToConnectionRule_0_7_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_XDuplexConnectionToConnectionRule_0_8_expressionF() {
		boolean _result = Boolean.valueOf(false);
		return _result;
	}

	public static final Object[] pattern_XDuplexConnectionToConnectionRule_1_1_performtransformation_bindingFFFFFFFFFFFFFFFFB(
			IsApplicableMatch isApplicableMatch) {
		EObject _localVariable_0 = isApplicableMatch.getObject("container");
		EObject _localVariable_1 = isApplicableMatch.getObject("connection2");
		EObject _localVariable_2 = isApplicableMatch.getObject("xDeviceToDevice2");
		EObject _localVariable_3 = isApplicableMatch.getObject("xCable");
		EObject _localVariable_4 = isApplicableMatch.getObject("xDevice1");
		EObject _localVariable_5 = isApplicableMatch.getObject("cable2");
		EObject _localVariable_6 = isApplicableMatch.getObject("xContainer");
		EObject _localVariable_7 = isApplicableMatch.getObject("connection1");
		EObject _localVariable_8 = isApplicableMatch.getObject("xDeviceToDevice");
		EObject _localVariable_9 = isApplicableMatch.getObject("xCableToCable2");
		EObject _localVariable_10 = isApplicableMatch.getObject("xDevice2");
		EObject _localVariable_11 = isApplicableMatch.getObject("device2");
		EObject _localVariable_12 = isApplicableMatch.getObject("cableAttributes");
		EObject _localVariable_13 = isApplicableMatch.getObject("cable1");
		EObject _localVariable_14 = isApplicableMatch.getObject("xCableToCable1");
		EObject _localVariable_15 = isApplicableMatch.getObject("device1");
		EObject tmpContainer = _localVariable_0;
		EObject tmpConnection2 = _localVariable_1;
		EObject tmpXDeviceToDevice2 = _localVariable_2;
		EObject tmpXCable = _localVariable_3;
		EObject tmpXDevice1 = _localVariable_4;
		EObject tmpCable2 = _localVariable_5;
		EObject tmpXContainer = _localVariable_6;
		EObject tmpConnection1 = _localVariable_7;
		EObject tmpXDeviceToDevice = _localVariable_8;
		EObject tmpXCableToCable2 = _localVariable_9;
		EObject tmpXDevice2 = _localVariable_10;
		EObject tmpDevice2 = _localVariable_11;
		EObject tmpCableAttributes = _localVariable_12;
		EObject tmpCable1 = _localVariable_13;
		EObject tmpXCableToCable1 = _localVariable_14;
		EObject tmpDevice1 = _localVariable_15;
		if (tmpContainer instanceof Container) {
			Container container = (Container) tmpContainer;
			if (tmpConnection2 instanceof Connections) {
				Connections connection2 = (Connections) tmpConnection2;
				if (tmpXDeviceToDevice2 instanceof XDeviceToDevice) {
					XDeviceToDevice xDeviceToDevice2 = (XDeviceToDevice) tmpXDeviceToDevice2;
					if (tmpXCable instanceof XCable) {
						XCable xCable = (XCable) tmpXCable;
						if (tmpXDevice1 instanceof XDevice) {
							XDevice xDevice1 = (XDevice) tmpXDevice1;
							if (tmpCable2 instanceof Cable) {
								Cable cable2 = (Cable) tmpCable2;
								if (tmpXContainer instanceof XContainer) {
									XContainer xContainer = (XContainer) tmpXContainer;
									if (tmpConnection1 instanceof Connections) {
										Connections connection1 = (Connections) tmpConnection1;
										if (tmpXDeviceToDevice instanceof XDeviceToDevice) {
											XDeviceToDevice xDeviceToDevice = (XDeviceToDevice) tmpXDeviceToDevice;
											if (tmpXCableToCable2 instanceof XCableToCable) {
												XCableToCable xCableToCable2 = (XCableToCable) tmpXCableToCable2;
												if (tmpXDevice2 instanceof XDevice) {
													XDevice xDevice2 = (XDevice) tmpXDevice2;
													if (tmpDevice2 instanceof Device) {
														Device device2 = (Device) tmpDevice2;
														if (tmpCableAttributes instanceof CableAttributes) {
															CableAttributes cableAttributes = (CableAttributes) tmpCableAttributes;
															if (tmpCable1 instanceof Cable) {
																Cable cable1 = (Cable) tmpCable1;
																if (tmpXCableToCable1 instanceof XCableToCable) {
																	XCableToCable xCableToCable1 = (XCableToCable) tmpXCableToCable1;
																	if (tmpDevice1 instanceof Device) {
																		Device device1 = (Device) tmpDevice1;
																		return new Object[] { container, connection2,
																				xDeviceToDevice2, xCable, xDevice1,
																				cable2, xContainer, connection1,
																				xDeviceToDevice, xCableToCable2,
																				xDevice2, device2, cableAttributes,
																				cable1, xCableToCable1, device1,
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
			}
		}
		return null;
	}

	public static final Object[] pattern_XDuplexConnectionToConnectionRule_1_1_performtransformation_blackBBBBBBBBBBBBBBBBFBB(
			Container container, Connections connection2, XDeviceToDevice xDeviceToDevice2, XCable xCable,
			XDevice xDevice1, Cable cable2, XContainer xContainer, Connections connection1,
			XDeviceToDevice xDeviceToDevice, XCableToCable xCableToCable2, XDevice xDevice2, Device device2,
			CableAttributes cableAttributes, Cable cable1, XCableToCable xCableToCable1, Device device1,
			XDuplexConnectionToConnectionRule _this, IsApplicableMatch isApplicableMatch) {
		if (!xDevice1.equals(xDevice2)) {
			if (!connection1.equals(connection2)) {
				if (!xDeviceToDevice.equals(xDeviceToDevice2)) {
					if (!cable1.equals(cable2)) {
						if (!xCableToCable1.equals(xCableToCable2)) {
							if (!device1.equals(device2)) {
								for (EObject tmpCsp : isApplicableMatch.getAttributeInfo()) {
									if (tmpCsp instanceof CSP) {
										CSP csp = (CSP) tmpCsp;
										return new Object[] { container, connection2, xDeviceToDevice2, xCable,
												xDevice1, cable2, xContainer, connection1, xDeviceToDevice,
												xCableToCable2, xDevice2, device2, cableAttributes, cable1,
												xCableToCable1, device1, csp, _this, isApplicableMatch };
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

	public static final Object[] pattern_XDuplexConnectionToConnectionRule_1_1_performtransformation_bindingAndBlackFFFFFFFFFFFFFFFFFBB(
			XDuplexConnectionToConnectionRule _this, IsApplicableMatch isApplicableMatch) {
		Object[] result_pattern_XDuplexConnectionToConnectionRule_1_1_performtransformation_binding = pattern_XDuplexConnectionToConnectionRule_1_1_performtransformation_bindingFFFFFFFFFFFFFFFFB(
				isApplicableMatch);
		if (result_pattern_XDuplexConnectionToConnectionRule_1_1_performtransformation_binding != null) {
			Container container = (Container) result_pattern_XDuplexConnectionToConnectionRule_1_1_performtransformation_binding[0];
			Connections connection2 = (Connections) result_pattern_XDuplexConnectionToConnectionRule_1_1_performtransformation_binding[1];
			XDeviceToDevice xDeviceToDevice2 = (XDeviceToDevice) result_pattern_XDuplexConnectionToConnectionRule_1_1_performtransformation_binding[2];
			XCable xCable = (XCable) result_pattern_XDuplexConnectionToConnectionRule_1_1_performtransformation_binding[3];
			XDevice xDevice1 = (XDevice) result_pattern_XDuplexConnectionToConnectionRule_1_1_performtransformation_binding[4];
			Cable cable2 = (Cable) result_pattern_XDuplexConnectionToConnectionRule_1_1_performtransformation_binding[5];
			XContainer xContainer = (XContainer) result_pattern_XDuplexConnectionToConnectionRule_1_1_performtransformation_binding[6];
			Connections connection1 = (Connections) result_pattern_XDuplexConnectionToConnectionRule_1_1_performtransformation_binding[7];
			XDeviceToDevice xDeviceToDevice = (XDeviceToDevice) result_pattern_XDuplexConnectionToConnectionRule_1_1_performtransformation_binding[8];
			XCableToCable xCableToCable2 = (XCableToCable) result_pattern_XDuplexConnectionToConnectionRule_1_1_performtransformation_binding[9];
			XDevice xDevice2 = (XDevice) result_pattern_XDuplexConnectionToConnectionRule_1_1_performtransformation_binding[10];
			Device device2 = (Device) result_pattern_XDuplexConnectionToConnectionRule_1_1_performtransformation_binding[11];
			CableAttributes cableAttributes = (CableAttributes) result_pattern_XDuplexConnectionToConnectionRule_1_1_performtransformation_binding[12];
			Cable cable1 = (Cable) result_pattern_XDuplexConnectionToConnectionRule_1_1_performtransformation_binding[13];
			XCableToCable xCableToCable1 = (XCableToCable) result_pattern_XDuplexConnectionToConnectionRule_1_1_performtransformation_binding[14];
			Device device1 = (Device) result_pattern_XDuplexConnectionToConnectionRule_1_1_performtransformation_binding[15];

			Object[] result_pattern_XDuplexConnectionToConnectionRule_1_1_performtransformation_black = pattern_XDuplexConnectionToConnectionRule_1_1_performtransformation_blackBBBBBBBBBBBBBBBBFBB(
					container, connection2, xDeviceToDevice2, xCable, xDevice1, cable2, xContainer, connection1,
					xDeviceToDevice, xCableToCable2, xDevice2, device2, cableAttributes, cable1, xCableToCable1,
					device1, _this, isApplicableMatch);
			if (result_pattern_XDuplexConnectionToConnectionRule_1_1_performtransformation_black != null) {
				CSP csp = (CSP) result_pattern_XDuplexConnectionToConnectionRule_1_1_performtransformation_black[16];

				return new Object[] { container, connection2, xDeviceToDevice2, xCable, xDevice1, cable2, xContainer,
						connection1, xDeviceToDevice, xCableToCable2, xDevice2, device2, cableAttributes, cable1,
						xCableToCable1, device1, csp, _this, isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_XDuplexConnectionToConnectionRule_1_1_performtransformation_greenBBBB(
			Cable cable2, Device device2, Cable cable1, Device device1) {
		cable2.setSource(device2);
		cable2.setTarget(device1);
		cable1.setTarget(device2);
		cable1.setSource(device1);
		return new Object[] { cable2, device2, cable1, device1 };
	}

	public static final Object[] pattern_XDuplexConnectionToConnectionRule_1_2_collecttranslatedelements_greenF() {
		PerformRuleResult ruleresult = RuntimeFactory.eINSTANCE.createPerformRuleResult();
		return new Object[] { ruleresult };
	}

	public static final Object[] pattern_XDuplexConnectionToConnectionRule_1_3_bookkeepingforedges_blackBBBBBBBBBBBBBBBBB(
			PerformRuleResult ruleresult, EObject container, EObject connection2, EObject xDeviceToDevice2,
			EObject xCable, EObject xDevice1, EObject cable2, EObject xContainer, EObject connection1,
			EObject xDeviceToDevice, EObject xCableToCable2, EObject xDevice2, EObject device2, EObject cableAttributes,
			EObject cable1, EObject xCableToCable1, EObject device1) {
		if (!container.equals(xDeviceToDevice2)) {
			if (!container.equals(xCable)) {
				if (!container.equals(xDevice1)) {
					if (!container.equals(xContainer)) {
						if (!container.equals(xDeviceToDevice)) {
							if (!container.equals(xCableToCable2)) {
								if (!container.equals(xDevice2)) {
									if (!container.equals(device2)) {
										if (!container.equals(xCableToCable1)) {
											if (!container.equals(device1)) {
												if (!connection2.equals(container)) {
													if (!connection2.equals(xDeviceToDevice2)) {
														if (!connection2.equals(xCable)) {
															if (!connection2.equals(xDevice1)) {
																if (!connection2.equals(xContainer)) {
																	if (!connection2.equals(xDeviceToDevice)) {
																		if (!connection2.equals(xCableToCable2)) {
																			if (!connection2.equals(xDevice2)) {
																				if (!connection2.equals(device2)) {
																					if (!connection2
																							.equals(xCableToCable1)) {
																						if (!connection2
																								.equals(device1)) {
																							if (!xCable.equals(
																									xDeviceToDevice2)) {
																								if (!xCable.equals(
																										xDevice1)) {
																									if (!xCable.equals(
																											xContainer)) {
																										if (!xCable
																												.equals(xDeviceToDevice)) {
																											if (!xCable
																													.equals(xCableToCable2)) {
																												if (!xCable
																														.equals(xDevice2)) {
																													if (!xCable
																															.equals(xCableToCable1)) {
																														if (!xDevice1
																																.equals(xDeviceToDevice2)) {
																															if (!xDevice1
																																	.equals(xDeviceToDevice)) {
																																if (!xDevice1
																																		.equals(xDevice2)) {
																																	if (!cable2
																																			.equals(container)) {
																																		if (!cable2
																																				.equals(connection2)) {
																																			if (!cable2
																																					.equals(xDeviceToDevice2)) {
																																				if (!cable2
																																						.equals(xCable)) {
																																					if (!cable2
																																							.equals(xDevice1)) {
																																						if (!cable2
																																								.equals(xContainer)) {
																																							if (!cable2
																																									.equals(connection1)) {
																																								if (!cable2
																																										.equals(xDeviceToDevice)) {
																																									if (!cable2
																																											.equals(xCableToCable2)) {
																																										if (!cable2
																																												.equals(xDevice2)) {
																																											if (!cable2
																																													.equals(device2)) {
																																												if (!cable2
																																														.equals(cableAttributes)) {
																																													if (!cable2
																																															.equals(xCableToCable1)) {
																																														if (!cable2
																																																.equals(device1)) {
																																															if (!xContainer
																																																	.equals(xDeviceToDevice2)) {
																																																if (!xContainer
																																																		.equals(xDevice1)) {
																																																	if (!xContainer
																																																			.equals(xDeviceToDevice)) {
																																																		if (!xContainer
																																																				.equals(xDevice2)) {
																																																			if (!connection1
																																																					.equals(container)) {
																																																				if (!connection1
																																																						.equals(connection2)) {
																																																					if (!connection1
																																																							.equals(xDeviceToDevice2)) {
																																																						if (!connection1
																																																								.equals(xCable)) {
																																																							if (!connection1
																																																									.equals(xDevice1)) {
																																																								if (!connection1
																																																										.equals(xContainer)) {
																																																									if (!connection1
																																																											.equals(xDeviceToDevice)) {
																																																										if (!connection1
																																																												.equals(xCableToCable2)) {
																																																											if (!connection1
																																																													.equals(xDevice2)) {
																																																												if (!connection1
																																																														.equals(device2)) {
																																																													if (!connection1
																																																															.equals(xCableToCable1)) {
																																																														if (!connection1
																																																																.equals(device1)) {
																																																															if (!xDeviceToDevice
																																																																	.equals(xDeviceToDevice2)) {
																																																																if (!xCableToCable2
																																																																		.equals(xDeviceToDevice2)) {
																																																																	if (!xCableToCable2
																																																																			.equals(xDevice1)) {
																																																																		if (!xCableToCable2
																																																																				.equals(xContainer)) {
																																																																			if (!xCableToCable2
																																																																					.equals(xDeviceToDevice)) {
																																																																				if (!xCableToCable2
																																																																						.equals(xDevice2)) {
																																																																					if (!xDevice2
																																																																							.equals(xDeviceToDevice2)) {
																																																																						if (!xDevice2
																																																																								.equals(xDeviceToDevice)) {
																																																																							if (!device2
																																																																									.equals(xDeviceToDevice2)) {
																																																																								if (!device2
																																																																										.equals(xCable)) {
																																																																									if (!device2
																																																																											.equals(xDevice1)) {
																																																																										if (!device2
																																																																												.equals(xContainer)) {
																																																																											if (!device2
																																																																													.equals(xDeviceToDevice)) {
																																																																												if (!device2
																																																																														.equals(xCableToCable2)) {
																																																																													if (!device2
																																																																															.equals(xDevice2)) {
																																																																														if (!device2
																																																																																.equals(xCableToCable1)) {
																																																																															if (!cableAttributes
																																																																																	.equals(container)) {
																																																																																if (!cableAttributes
																																																																																		.equals(connection2)) {
																																																																																	if (!cableAttributes
																																																																																			.equals(xDeviceToDevice2)) {
																																																																																		if (!cableAttributes
																																																																																				.equals(xCable)) {
																																																																																			if (!cableAttributes
																																																																																					.equals(xDevice1)) {
																																																																																				if (!cableAttributes
																																																																																						.equals(xContainer)) {
																																																																																					if (!cableAttributes
																																																																																							.equals(connection1)) {
																																																																																						if (!cableAttributes
																																																																																								.equals(xDeviceToDevice)) {
																																																																																							if (!cableAttributes
																																																																																									.equals(xCableToCable2)) {
																																																																																								if (!cableAttributes
																																																																																										.equals(xDevice2)) {
																																																																																									if (!cableAttributes
																																																																																											.equals(device2)) {
																																																																																										if (!cableAttributes
																																																																																												.equals(xCableToCable1)) {
																																																																																											if (!cableAttributes
																																																																																													.equals(device1)) {
																																																																																												if (!cable1
																																																																																														.equals(container)) {
																																																																																													if (!cable1
																																																																																															.equals(connection2)) {
																																																																																														if (!cable1
																																																																																																.equals(xDeviceToDevice2)) {
																																																																																															if (!cable1
																																																																																																	.equals(xCable)) {
																																																																																																if (!cable1
																																																																																																		.equals(xDevice1)) {
																																																																																																	if (!cable1
																																																																																																			.equals(cable2)) {
																																																																																																		if (!cable1
																																																																																																				.equals(xContainer)) {
																																																																																																			if (!cable1
																																																																																																					.equals(connection1)) {
																																																																																																				if (!cable1
																																																																																																						.equals(xDeviceToDevice)) {
																																																																																																					if (!cable1
																																																																																																							.equals(xCableToCable2)) {
																																																																																																						if (!cable1
																																																																																																								.equals(xDevice2)) {
																																																																																																							if (!cable1
																																																																																																									.equals(device2)) {
																																																																																																								if (!cable1
																																																																																																										.equals(cableAttributes)) {
																																																																																																									if (!cable1
																																																																																																											.equals(xCableToCable1)) {
																																																																																																										if (!cable1
																																																																																																												.equals(device1)) {
																																																																																																											if (!xCableToCable1
																																																																																																													.equals(xDeviceToDevice2)) {
																																																																																																												if (!xCableToCable1
																																																																																																														.equals(xDevice1)) {
																																																																																																													if (!xCableToCable1
																																																																																																															.equals(xContainer)) {
																																																																																																														if (!xCableToCable1
																																																																																																																.equals(xDeviceToDevice)) {
																																																																																																															if (!xCableToCable1
																																																																																																																	.equals(xCableToCable2)) {
																																																																																																																if (!xCableToCable1
																																																																																																																		.equals(xDevice2)) {
																																																																																																																	if (!device1
																																																																																																																			.equals(xDeviceToDevice2)) {
																																																																																																																		if (!device1
																																																																																																																				.equals(xCable)) {
																																																																																																																			if (!device1
																																																																																																																					.equals(xDevice1)) {
																																																																																																																				if (!device1
																																																																																																																						.equals(xContainer)) {
																																																																																																																					if (!device1
																																																																																																																							.equals(xDeviceToDevice)) {
																																																																																																																						if (!device1
																																																																																																																								.equals(xCableToCable2)) {
																																																																																																																							if (!device1
																																																																																																																									.equals(xDevice2)) {
																																																																																																																								if (!device1
																																																																																																																										.equals(device2)) {
																																																																																																																									if (!device1
																																																																																																																											.equals(xCableToCable1)) {
																																																																																																																										return new Object[] {
																																																																																																																												ruleresult,
																																																																																																																												container,
																																																																																																																												connection2,
																																																																																																																												xDeviceToDevice2,
																																																																																																																												xCable,
																																																																																																																												xDevice1,
																																																																																																																												cable2,
																																																																																																																												xContainer,
																																																																																																																												connection1,
																																																																																																																												xDeviceToDevice,
																																																																																																																												xCableToCable2,
																																																																																																																												xDevice2,
																																																																																																																												device2,
																																																																																																																												cableAttributes,
																																																																																																																												cable1,
																																																																																																																												xCableToCable1,
																																																																																																																												device1 };
																																																																																																																									}
																																																																																																																								}
																																																																																																																							}
																																																																																																																						}
																																																																																																																					}
																																																																																																																				}
																																																																																																																			}
																																																																																																																		}
																																																																																																																	}
																																																																																																																}
																																																																																																															}
																																																																																																														}
																																																																																																													}
																																																																																																												}
																																																																																																											}
																																																																																																										}
																																																																																																									}
																																																																																																								}
																																																																																																							}
																																																																																																						}
																																																																																																					}
																																																																																																				}
																																																																																																			}
																																																																																																		}
																																																																																																	}
																																																																																																}
																																																																																															}
																																																																																														}
																																																																																													}
																																																																																												}
																																																																																											}
																																																																																										}
																																																																																									}
																																																																																								}
																																																																																							}
																																																																																						}
																																																																																					}
																																																																																				}
																																																																																			}
																																																																																		}
																																																																																	}
																																																																																}
																																																																															}
																																																																														}
																																																																													}
																																																																												}
																																																																											}
																																																																										}
																																																																									}
																																																																								}
																																																																							}
																																																																						}
																																																																					}
																																																																				}
																																																																			}
																																																																		}
																																																																	}
																																																																}
																																																															}
																																																														}
																																																													}
																																																												}
																																																											}
																																																										}
																																																									}
																																																								}
																																																							}
																																																						}
																																																					}
																																																				}
																																																			}
																																																		}
																																																	}
																																																}
																																															}
																																														}
																																													}
																																												}
																																											}
																																										}
																																									}
																																								}
																																							}
																																						}
																																					}
																																				}
																																			}
																																		}
																																	}
																																}
																															}
																														}
																													}
																												}
																											}
																										}
																									}
																								}
																							}
																						}
																					}
																				}
																			}
																		}
																	}
																}
															}
														}
													}
												}
											}
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

	public static final Object[] pattern_XDuplexConnectionToConnectionRule_1_3_bookkeepingforedges_greenBBBBBBBBBBBFFFFFFFFFFFF(
			PerformRuleResult ruleresult, EObject connection2, EObject xCable, EObject xDevice1, EObject cable2,
			EObject connection1, EObject xDevice2, EObject device2, EObject cableAttributes, EObject cable1,
			EObject device1) {
		EMoflonEdge connection2__xCable____incoming = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge cable2__device2____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge device2__cable2____outgoing = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge connection1__xCable____outgoing = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge cable2__device1____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge device1__cable2____incoming = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge cableAttributes__xDevice2____endPoint2 = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge cableAttributes__xDevice1____endPoint1 = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge cable1__device2____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge device2__cable1____incoming = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge cable1__device1____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge device1__cable1____outgoing = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String ruleresult_ruleName_prime = "XDuplexConnectionToConnectionRule";
		String connection2__xCable____incoming_name_prime = "incoming";
		String cable2__device2____source_name_prime = "source";
		String device2__cable2____outgoing_name_prime = "outgoing";
		String connection1__xCable____outgoing_name_prime = "outgoing";
		String cable2__device1____target_name_prime = "target";
		String device1__cable2____incoming_name_prime = "incoming";
		String cableAttributes__xDevice2____endPoint2_name_prime = "endPoint2";
		String cableAttributes__xDevice1____endPoint1_name_prime = "endPoint1";
		String cable1__device2____target_name_prime = "target";
		String device2__cable1____incoming_name_prime = "incoming";
		String cable1__device1____source_name_prime = "source";
		String device1__cable1____outgoing_name_prime = "outgoing";
		connection2__xCable____incoming.setSrc(connection2);
		connection2__xCable____incoming.setTrg(xCable);
		ruleresult.getTranslatedEdges().add(connection2__xCable____incoming);
		cable2__device2____source.setSrc(cable2);
		cable2__device2____source.setTrg(device2);
		ruleresult.getCreatedEdges().add(cable2__device2____source);
		device2__cable2____outgoing.setSrc(device2);
		device2__cable2____outgoing.setTrg(cable2);
		ruleresult.getCreatedEdges().add(device2__cable2____outgoing);
		connection1__xCable____outgoing.setSrc(connection1);
		connection1__xCable____outgoing.setTrg(xCable);
		ruleresult.getTranslatedEdges().add(connection1__xCable____outgoing);
		cable2__device1____target.setSrc(cable2);
		cable2__device1____target.setTrg(device1);
		ruleresult.getCreatedEdges().add(cable2__device1____target);
		device1__cable2____incoming.setSrc(device1);
		device1__cable2____incoming.setTrg(cable2);
		ruleresult.getCreatedEdges().add(device1__cable2____incoming);
		cableAttributes__xDevice2____endPoint2.setSrc(cableAttributes);
		cableAttributes__xDevice2____endPoint2.setTrg(xDevice2);
		ruleresult.getTranslatedEdges().add(cableAttributes__xDevice2____endPoint2);
		cableAttributes__xDevice1____endPoint1.setSrc(cableAttributes);
		cableAttributes__xDevice1____endPoint1.setTrg(xDevice1);
		ruleresult.getTranslatedEdges().add(cableAttributes__xDevice1____endPoint1);
		cable1__device2____target.setSrc(cable1);
		cable1__device2____target.setTrg(device2);
		ruleresult.getCreatedEdges().add(cable1__device2____target);
		device2__cable1____incoming.setSrc(device2);
		device2__cable1____incoming.setTrg(cable1);
		ruleresult.getCreatedEdges().add(device2__cable1____incoming);
		cable1__device1____source.setSrc(cable1);
		cable1__device1____source.setTrg(device1);
		ruleresult.getCreatedEdges().add(cable1__device1____source);
		device1__cable1____outgoing.setSrc(device1);
		device1__cable1____outgoing.setTrg(cable1);
		ruleresult.getCreatedEdges().add(device1__cable1____outgoing);
		ruleresult.setRuleName(ruleresult_ruleName_prime);
		connection2__xCable____incoming.setName(connection2__xCable____incoming_name_prime);
		cable2__device2____source.setName(cable2__device2____source_name_prime);
		device2__cable2____outgoing.setName(device2__cable2____outgoing_name_prime);
		connection1__xCable____outgoing.setName(connection1__xCable____outgoing_name_prime);
		cable2__device1____target.setName(cable2__device1____target_name_prime);
		device1__cable2____incoming.setName(device1__cable2____incoming_name_prime);
		cableAttributes__xDevice2____endPoint2.setName(cableAttributes__xDevice2____endPoint2_name_prime);
		cableAttributes__xDevice1____endPoint1.setName(cableAttributes__xDevice1____endPoint1_name_prime);
		cable1__device2____target.setName(cable1__device2____target_name_prime);
		device2__cable1____incoming.setName(device2__cable1____incoming_name_prime);
		cable1__device1____source.setName(cable1__device1____source_name_prime);
		device1__cable1____outgoing.setName(device1__cable1____outgoing_name_prime);
		return new Object[] { ruleresult, connection2, xCable, xDevice1, cable2, connection1, xDevice2, device2,
				cableAttributes, cable1, device1, connection2__xCable____incoming, cable2__device2____source,
				device2__cable2____outgoing, connection1__xCable____outgoing, cable2__device1____target,
				device1__cable2____incoming, cableAttributes__xDevice2____endPoint2,
				cableAttributes__xDevice1____endPoint1, cable1__device2____target, device2__cable1____incoming,
				cable1__device1____source, device1__cable1____outgoing };
	}

	public static final void pattern_XDuplexConnectionToConnectionRule_1_5_registerobjects_expressionBBBBBBBBBBBBBBBBBB(
			XDuplexConnectionToConnectionRule _this, PerformRuleResult ruleresult, EObject container,
			EObject connection2, EObject xDeviceToDevice2, EObject xCable, EObject xDevice1, EObject cable2,
			EObject xContainer, EObject connection1, EObject xDeviceToDevice, EObject xCableToCable2, EObject xDevice2,
			EObject device2, EObject cableAttributes, EObject cable1, EObject xCableToCable1, EObject device1) {
		_this.registerObjects_FWD(ruleresult, container, connection2, xDeviceToDevice2, xCable, xDevice1, cable2,
				xContainer, connection1, xDeviceToDevice, xCableToCable2, xDevice2, device2, cableAttributes, cable1,
				xCableToCable1, device1);

	}

	public static final PerformRuleResult pattern_XDuplexConnectionToConnectionRule_1_6_expressionFB(
			PerformRuleResult ruleresult) {
		PerformRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_XDuplexConnectionToConnectionRule_2_1_preparereturnvalue_bindingFB(
			XDuplexConnectionToConnectionRule _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass eClass = _localVariable_0;
		if (eClass != null) {
			return new Object[] { eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_XDuplexConnectionToConnectionRule_2_1_preparereturnvalue_blackFBB(
			EClass eClass, XDuplexConnectionToConnectionRule _this) {
		for (EOperation performOperation : eClass.getEOperations()) {
			String performOperation_name = performOperation.getName();
			if (performOperation_name.equals("perform_FWD")) {
				return new Object[] { performOperation, eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_XDuplexConnectionToConnectionRule_2_1_preparereturnvalue_bindingAndBlackFFB(
			XDuplexConnectionToConnectionRule _this) {
		Object[] result_pattern_XDuplexConnectionToConnectionRule_2_1_preparereturnvalue_binding = pattern_XDuplexConnectionToConnectionRule_2_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_XDuplexConnectionToConnectionRule_2_1_preparereturnvalue_binding != null) {
			EClass eClass = (EClass) result_pattern_XDuplexConnectionToConnectionRule_2_1_preparereturnvalue_binding[0];

			Object[] result_pattern_XDuplexConnectionToConnectionRule_2_1_preparereturnvalue_black = pattern_XDuplexConnectionToConnectionRule_2_1_preparereturnvalue_blackFBB(
					eClass, _this);
			if (result_pattern_XDuplexConnectionToConnectionRule_2_1_preparereturnvalue_black != null) {
				EOperation performOperation = (EOperation) result_pattern_XDuplexConnectionToConnectionRule_2_1_preparereturnvalue_black[0];

				return new Object[] { performOperation, eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_XDuplexConnectionToConnectionRule_2_1_preparereturnvalue_greenBF(
			EOperation performOperation) {
		IsApplicableRuleResult ruleresult = RuntimeFactory.eINSTANCE.createIsApplicableRuleResult();
		boolean ruleresult_success_prime = Boolean.valueOf(false);
		String ruleresult_rule_prime = "XDuplexConnectionToConnectionRule";
		ruleresult.setPerformOperation(performOperation);
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		ruleresult.setRule(ruleresult_rule_prime);
		return new Object[] { performOperation, ruleresult };
	}

	public static final Object[] pattern_XDuplexConnectionToConnectionRule_2_2_corematch_bindingFFFFFFFB(Match match) {
		EObject _localVariable_0 = match.getObject("connection2");
		EObject _localVariable_1 = match.getObject("xCable");
		EObject _localVariable_2 = match.getObject("xDevice1");
		EObject _localVariable_3 = match.getObject("xContainer");
		EObject _localVariable_4 = match.getObject("connection1");
		EObject _localVariable_5 = match.getObject("xDevice2");
		EObject _localVariable_6 = match.getObject("cableAttributes");
		EObject tmpConnection2 = _localVariable_0;
		EObject tmpXCable = _localVariable_1;
		EObject tmpXDevice1 = _localVariable_2;
		EObject tmpXContainer = _localVariable_3;
		EObject tmpConnection1 = _localVariable_4;
		EObject tmpXDevice2 = _localVariable_5;
		EObject tmpCableAttributes = _localVariable_6;
		if (tmpConnection2 instanceof Connections) {
			Connections connection2 = (Connections) tmpConnection2;
			if (tmpXCable instanceof XCable) {
				XCable xCable = (XCable) tmpXCable;
				if (tmpXDevice1 instanceof XDevice) {
					XDevice xDevice1 = (XDevice) tmpXDevice1;
					if (tmpXContainer instanceof XContainer) {
						XContainer xContainer = (XContainer) tmpXContainer;
						if (tmpConnection1 instanceof Connections) {
							Connections connection1 = (Connections) tmpConnection1;
							if (tmpXDevice2 instanceof XDevice) {
								XDevice xDevice2 = (XDevice) tmpXDevice2;
								if (tmpCableAttributes instanceof CableAttributes) {
									CableAttributes cableAttributes = (CableAttributes) tmpCableAttributes;
									return new Object[] { connection2, xCable, xDevice1, xContainer, connection1,
											xDevice2, cableAttributes, match };
								}
							}
						}
					}
				}
			}
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_XDuplexConnectionToConnectionRule_2_2_corematch_blackBFBBFBBFFBFBFFFB(
			Connections connection2, XCable xCable, XDevice xDevice1, XContainer xContainer, Connections connection1,
			XDevice xDevice2, CableAttributes cableAttributes, Match match) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (!xDevice1.equals(xDevice2)) {
			if (!connection1.equals(connection2)) {
				boolean cableAttributes_isDuplex = cableAttributes.isIsDuplex();
				if (Boolean.valueOf(cableAttributes_isDuplex).equals(Boolean.valueOf(true))) {
					for (XDeviceToDevice xDeviceToDevice : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(xDevice1, XDeviceToDevice.class, "source")) {
						Device device1 = xDeviceToDevice.getTarget();
						if (device1 != null) {
							for (XDeviceToDevice xDeviceToDevice2 : org.moflon.core.utilities.eMoflonEMFUtil
									.getOppositeReferenceTyped(xDevice2, XDeviceToDevice.class, "source")) {
								if (!xDeviceToDevice.equals(xDeviceToDevice2)) {
									Device device2 = xDeviceToDevice2.getTarget();
									if (device2 != null) {
										if (!device1.equals(device2)) {
											for (XCableToCable xCableToCable2 : org.moflon.core.utilities.eMoflonEMFUtil
													.getOppositeReferenceTyped(xCable, XCableToCable.class, "source")) {
												Cable cable2 = xCableToCable2.getTarget();
												if (cable2 != null) {
													for (XCableToCable xCableToCable1 : org.moflon.core.utilities.eMoflonEMFUtil
															.getOppositeReferenceTyped(xCable, XCableToCable.class,
																	"source")) {
														if (!xCableToCable1.equals(xCableToCable2)) {
															Cable cable1 = xCableToCable1.getTarget();
															if (cable1 != null) {
																if (!cable1.equals(cable2)) {
																	_result.add(new Object[] { connection2,
																			xDeviceToDevice2, xCable, xDevice1, cable2,
																			xContainer, connection1, xDeviceToDevice,
																			xCableToCable2, xDevice2, device2,
																			cableAttributes, cable1, xCableToCable1,
																			device1, match });
																}
															}

														}
													}
												}

											}
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

	public static final Iterable<Object[]> pattern_XDuplexConnectionToConnectionRule_2_3_findcontext_blackFBBBBBBBBBBBBBBB(
			Connections connection2, XDeviceToDevice xDeviceToDevice2, XCable xCable, XDevice xDevice1, Cable cable2,
			XContainer xContainer, Connections connection1, XDeviceToDevice xDeviceToDevice,
			XCableToCable xCableToCable2, XDevice xDevice2, Device device2, CableAttributes cableAttributes,
			Cable cable1, XCableToCable xCableToCable1, Device device1) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (!xDevice1.equals(xDevice2)) {
			if (!connection1.equals(connection2)) {
				if (!xDeviceToDevice.equals(xDeviceToDevice2)) {
					if (!cable1.equals(cable2)) {
						if (!xCableToCable1.equals(xCableToCable2)) {
							if (!device1.equals(device2)) {
								if (connection2.getIncoming().contains(xCable)) {
									if (cableAttributes.equals(xCable.getCableAttributes())) {
										if (xContainer.getElements().contains(xDevice2)) {
											if (xDevice1.equals(xDeviceToDevice.getSource())) {
												if (cable2.equals(xCableToCable2.getTarget())) {
													if (connection1.getOutgoing().contains(xCable)) {
														if (connection2.equals(xDevice2.getConnections())) {
															if (xDevice2.equals(xDeviceToDevice2.getSource())) {
																if (device2.equals(xDeviceToDevice2.getTarget())) {
																	if (xCable.equals(xCableToCable2.getSource())) {
																		if (connection1
																				.equals(xDevice1.getConnections())) {
																			if (xDevice2.equals(
																					cableAttributes.getEndPoint2())) {
																				if (xDevice1.equals(cableAttributes
																						.getEndPoint1())) {
																					if (xContainer.getElements()
																							.contains(xCable)) {
																						if (cable1.equals(xCableToCable1
																								.getTarget())) {
																							if (device1
																									.equals(xDeviceToDevice
																											.getTarget())) {
																								if (xCable
																										.equals(xCableToCable1
																												.getSource())) {
																									if (xContainer
																											.getElements()
																											.contains(
																													xDevice1)) {
																										boolean cableAttributes_isDuplex = cableAttributes
																												.isIsDuplex();
																										if (Boolean
																												.valueOf(
																														cableAttributes_isDuplex)
																												.equals(Boolean
																														.valueOf(
																																true))) {
																											for (Container container : org.moflon.core.utilities.eMoflonEMFUtil
																													.getOppositeReferenceTyped(
																															device2,
																															Container.class,
																															"devices")) {
																												if (container
																														.getDevices()
																														.contains(
																																device1)) {
																													if (container
																															.getCables()
																															.contains(
																																	cable2)) {
																														if (container
																																.getCables()
																																.contains(
																																		cable1)) {
																															_result.add(
																																	new Object[] {
																																			container,
																																			connection2,
																																			xDeviceToDevice2,
																																			xCable,
																																			xDevice1,
																																			cable2,
																																			xContainer,
																																			connection1,
																																			xDeviceToDevice,
																																			xCableToCable2,
																																			xDevice2,
																																			device2,
																																			cableAttributes,
																																			cable1,
																																			xCableToCable1,
																																			device1 });
																														}
																													}
																												}
																											}
																										}

																									}
																								}
																							}
																						}
																					}
																				}
																			}
																		}
																	}
																}
															}
														}
													}
												}
											}
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

	public static final Object[] pattern_XDuplexConnectionToConnectionRule_2_3_findcontext_greenBBBBBBBBBBBBBBBBFFFFFFFFFFFFFFFFFFFFFFF(
			Container container, Connections connection2, XDeviceToDevice xDeviceToDevice2, XCable xCable,
			XDevice xDevice1, Cable cable2, XContainer xContainer, Connections connection1,
			XDeviceToDevice xDeviceToDevice, XCableToCable xCableToCable2, XDevice xDevice2, Device device2,
			CableAttributes cableAttributes, Cable cable1, XCableToCable xCableToCable1, Device device1) {
		IsApplicableMatch isApplicableMatch = RuntimeFactory.eINSTANCE.createIsApplicableMatch();
		EMoflonEdge connection2__xCable____incoming = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge xCable__cableAttributes____cableAttributes = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge container__device2____devices = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge xContainer__xDevice2____elements = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge container__device1____devices = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge xDeviceToDevice__xDevice1____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge xCableToCable2__cable2____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge connection1__xCable____outgoing = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge xDevice2__connection2____connections = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge xDeviceToDevice2__xDevice2____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge xDeviceToDevice2__device2____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge xCableToCable2__xCable____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge xDevice1__connection1____connections = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge cableAttributes__xDevice2____endPoint2 = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge cableAttributes__xDevice1____endPoint1 = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge xContainer__xCable____elements = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge xCableToCable1__cable1____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge xDeviceToDevice__device1____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge xCableToCable1__xCable____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge xContainer__xDevice1____elements = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge container__cable2____cables = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge container__cable1____cables = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String connection2__xCable____incoming_name_prime = "incoming";
		String xCable__cableAttributes____cableAttributes_name_prime = "cableAttributes";
		String container__device2____devices_name_prime = "devices";
		String xContainer__xDevice2____elements_name_prime = "elements";
		String container__device1____devices_name_prime = "devices";
		String xDeviceToDevice__xDevice1____source_name_prime = "source";
		String xCableToCable2__cable2____target_name_prime = "target";
		String connection1__xCable____outgoing_name_prime = "outgoing";
		String xDevice2__connection2____connections_name_prime = "connections";
		String xDeviceToDevice2__xDevice2____source_name_prime = "source";
		String xDeviceToDevice2__device2____target_name_prime = "target";
		String xCableToCable2__xCable____source_name_prime = "source";
		String xDevice1__connection1____connections_name_prime = "connections";
		String cableAttributes__xDevice2____endPoint2_name_prime = "endPoint2";
		String cableAttributes__xDevice1____endPoint1_name_prime = "endPoint1";
		String xContainer__xCable____elements_name_prime = "elements";
		String xCableToCable1__cable1____target_name_prime = "target";
		String xDeviceToDevice__device1____target_name_prime = "target";
		String xCableToCable1__xCable____source_name_prime = "source";
		String xContainer__xDevice1____elements_name_prime = "elements";
		String container__cable2____cables_name_prime = "cables";
		String container__cable1____cables_name_prime = "cables";
		isApplicableMatch.getAllContextElements().add(container);
		isApplicableMatch.getAllContextElements().add(connection2);
		isApplicableMatch.getAllContextElements().add(xDeviceToDevice2);
		isApplicableMatch.getAllContextElements().add(xCable);
		isApplicableMatch.getAllContextElements().add(xDevice1);
		isApplicableMatch.getAllContextElements().add(cable2);
		isApplicableMatch.getAllContextElements().add(xContainer);
		isApplicableMatch.getAllContextElements().add(connection1);
		isApplicableMatch.getAllContextElements().add(xDeviceToDevice);
		isApplicableMatch.getAllContextElements().add(xCableToCable2);
		isApplicableMatch.getAllContextElements().add(xDevice2);
		isApplicableMatch.getAllContextElements().add(device2);
		isApplicableMatch.getAllContextElements().add(cableAttributes);
		isApplicableMatch.getAllContextElements().add(cable1);
		isApplicableMatch.getAllContextElements().add(xCableToCable1);
		isApplicableMatch.getAllContextElements().add(device1);
		connection2__xCable____incoming.setSrc(connection2);
		connection2__xCable____incoming.setTrg(xCable);
		isApplicableMatch.getAllContextElements().add(connection2__xCable____incoming);
		xCable__cableAttributes____cableAttributes.setSrc(xCable);
		xCable__cableAttributes____cableAttributes.setTrg(cableAttributes);
		isApplicableMatch.getAllContextElements().add(xCable__cableAttributes____cableAttributes);
		container__device2____devices.setSrc(container);
		container__device2____devices.setTrg(device2);
		isApplicableMatch.getAllContextElements().add(container__device2____devices);
		xContainer__xDevice2____elements.setSrc(xContainer);
		xContainer__xDevice2____elements.setTrg(xDevice2);
		isApplicableMatch.getAllContextElements().add(xContainer__xDevice2____elements);
		container__device1____devices.setSrc(container);
		container__device1____devices.setTrg(device1);
		isApplicableMatch.getAllContextElements().add(container__device1____devices);
		xDeviceToDevice__xDevice1____source.setSrc(xDeviceToDevice);
		xDeviceToDevice__xDevice1____source.setTrg(xDevice1);
		isApplicableMatch.getAllContextElements().add(xDeviceToDevice__xDevice1____source);
		xCableToCable2__cable2____target.setSrc(xCableToCable2);
		xCableToCable2__cable2____target.setTrg(cable2);
		isApplicableMatch.getAllContextElements().add(xCableToCable2__cable2____target);
		connection1__xCable____outgoing.setSrc(connection1);
		connection1__xCable____outgoing.setTrg(xCable);
		isApplicableMatch.getAllContextElements().add(connection1__xCable____outgoing);
		xDevice2__connection2____connections.setSrc(xDevice2);
		xDevice2__connection2____connections.setTrg(connection2);
		isApplicableMatch.getAllContextElements().add(xDevice2__connection2____connections);
		xDeviceToDevice2__xDevice2____source.setSrc(xDeviceToDevice2);
		xDeviceToDevice2__xDevice2____source.setTrg(xDevice2);
		isApplicableMatch.getAllContextElements().add(xDeviceToDevice2__xDevice2____source);
		xDeviceToDevice2__device2____target.setSrc(xDeviceToDevice2);
		xDeviceToDevice2__device2____target.setTrg(device2);
		isApplicableMatch.getAllContextElements().add(xDeviceToDevice2__device2____target);
		xCableToCable2__xCable____source.setSrc(xCableToCable2);
		xCableToCable2__xCable____source.setTrg(xCable);
		isApplicableMatch.getAllContextElements().add(xCableToCable2__xCable____source);
		xDevice1__connection1____connections.setSrc(xDevice1);
		xDevice1__connection1____connections.setTrg(connection1);
		isApplicableMatch.getAllContextElements().add(xDevice1__connection1____connections);
		cableAttributes__xDevice2____endPoint2.setSrc(cableAttributes);
		cableAttributes__xDevice2____endPoint2.setTrg(xDevice2);
		isApplicableMatch.getAllContextElements().add(cableAttributes__xDevice2____endPoint2);
		cableAttributes__xDevice1____endPoint1.setSrc(cableAttributes);
		cableAttributes__xDevice1____endPoint1.setTrg(xDevice1);
		isApplicableMatch.getAllContextElements().add(cableAttributes__xDevice1____endPoint1);
		xContainer__xCable____elements.setSrc(xContainer);
		xContainer__xCable____elements.setTrg(xCable);
		isApplicableMatch.getAllContextElements().add(xContainer__xCable____elements);
		xCableToCable1__cable1____target.setSrc(xCableToCable1);
		xCableToCable1__cable1____target.setTrg(cable1);
		isApplicableMatch.getAllContextElements().add(xCableToCable1__cable1____target);
		xDeviceToDevice__device1____target.setSrc(xDeviceToDevice);
		xDeviceToDevice__device1____target.setTrg(device1);
		isApplicableMatch.getAllContextElements().add(xDeviceToDevice__device1____target);
		xCableToCable1__xCable____source.setSrc(xCableToCable1);
		xCableToCable1__xCable____source.setTrg(xCable);
		isApplicableMatch.getAllContextElements().add(xCableToCable1__xCable____source);
		xContainer__xDevice1____elements.setSrc(xContainer);
		xContainer__xDevice1____elements.setTrg(xDevice1);
		isApplicableMatch.getAllContextElements().add(xContainer__xDevice1____elements);
		container__cable2____cables.setSrc(container);
		container__cable2____cables.setTrg(cable2);
		isApplicableMatch.getAllContextElements().add(container__cable2____cables);
		container__cable1____cables.setSrc(container);
		container__cable1____cables.setTrg(cable1);
		isApplicableMatch.getAllContextElements().add(container__cable1____cables);
		connection2__xCable____incoming.setName(connection2__xCable____incoming_name_prime);
		xCable__cableAttributes____cableAttributes.setName(xCable__cableAttributes____cableAttributes_name_prime);
		container__device2____devices.setName(container__device2____devices_name_prime);
		xContainer__xDevice2____elements.setName(xContainer__xDevice2____elements_name_prime);
		container__device1____devices.setName(container__device1____devices_name_prime);
		xDeviceToDevice__xDevice1____source.setName(xDeviceToDevice__xDevice1____source_name_prime);
		xCableToCable2__cable2____target.setName(xCableToCable2__cable2____target_name_prime);
		connection1__xCable____outgoing.setName(connection1__xCable____outgoing_name_prime);
		xDevice2__connection2____connections.setName(xDevice2__connection2____connections_name_prime);
		xDeviceToDevice2__xDevice2____source.setName(xDeviceToDevice2__xDevice2____source_name_prime);
		xDeviceToDevice2__device2____target.setName(xDeviceToDevice2__device2____target_name_prime);
		xCableToCable2__xCable____source.setName(xCableToCable2__xCable____source_name_prime);
		xDevice1__connection1____connections.setName(xDevice1__connection1____connections_name_prime);
		cableAttributes__xDevice2____endPoint2.setName(cableAttributes__xDevice2____endPoint2_name_prime);
		cableAttributes__xDevice1____endPoint1.setName(cableAttributes__xDevice1____endPoint1_name_prime);
		xContainer__xCable____elements.setName(xContainer__xCable____elements_name_prime);
		xCableToCable1__cable1____target.setName(xCableToCable1__cable1____target_name_prime);
		xDeviceToDevice__device1____target.setName(xDeviceToDevice__device1____target_name_prime);
		xCableToCable1__xCable____source.setName(xCableToCable1__xCable____source_name_prime);
		xContainer__xDevice1____elements.setName(xContainer__xDevice1____elements_name_prime);
		container__cable2____cables.setName(container__cable2____cables_name_prime);
		container__cable1____cables.setName(container__cable1____cables_name_prime);
		return new Object[] { container, connection2, xDeviceToDevice2, xCable, xDevice1, cable2, xContainer,
				connection1, xDeviceToDevice, xCableToCable2, xDevice2, device2, cableAttributes, cable1,
				xCableToCable1, device1, isApplicableMatch, connection2__xCable____incoming,
				xCable__cableAttributes____cableAttributes, container__device2____devices,
				xContainer__xDevice2____elements, container__device1____devices, xDeviceToDevice__xDevice1____source,
				xCableToCable2__cable2____target, connection1__xCable____outgoing, xDevice2__connection2____connections,
				xDeviceToDevice2__xDevice2____source, xDeviceToDevice2__device2____target,
				xCableToCable2__xCable____source, xDevice1__connection1____connections,
				cableAttributes__xDevice2____endPoint2, cableAttributes__xDevice1____endPoint1,
				xContainer__xCable____elements, xCableToCable1__cable1____target, xDeviceToDevice__device1____target,
				xCableToCable1__xCable____source, xContainer__xDevice1____elements, container__cable2____cables,
				container__cable1____cables };
	}

	public static final Object[] pattern_XDuplexConnectionToConnectionRule_2_4_solveCSP_bindingFBBBBBBBBBBBBBBBBBB(
			XDuplexConnectionToConnectionRule _this, IsApplicableMatch isApplicableMatch, Container container,
			Connections connection2, XDeviceToDevice xDeviceToDevice2, XCable xCable, XDevice xDevice1, Cable cable2,
			XContainer xContainer, Connections connection1, XDeviceToDevice xDeviceToDevice,
			XCableToCable xCableToCable2, XDevice xDevice2, Device device2, CableAttributes cableAttributes,
			Cable cable1, XCableToCable xCableToCable1, Device device1) {
		CSP _localVariable_0 = _this.isApplicable_solveCsp_FWD(isApplicableMatch, container, connection2,
				xDeviceToDevice2, xCable, xDevice1, cable2, xContainer, connection1, xDeviceToDevice, xCableToCable2,
				xDevice2, device2, cableAttributes, cable1, xCableToCable1, device1);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, container, connection2, xDeviceToDevice2, xCable,
					xDevice1, cable2, xContainer, connection1, xDeviceToDevice, xCableToCable2, xDevice2, device2,
					cableAttributes, cable1, xCableToCable1, device1 };
		}
		return null;
	}

	public static final Object[] pattern_XDuplexConnectionToConnectionRule_2_4_solveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_XDuplexConnectionToConnectionRule_2_4_solveCSP_bindingAndBlackFBBBBBBBBBBBBBBBBBB(
			XDuplexConnectionToConnectionRule _this, IsApplicableMatch isApplicableMatch, Container container,
			Connections connection2, XDeviceToDevice xDeviceToDevice2, XCable xCable, XDevice xDevice1, Cable cable2,
			XContainer xContainer, Connections connection1, XDeviceToDevice xDeviceToDevice,
			XCableToCable xCableToCable2, XDevice xDevice2, Device device2, CableAttributes cableAttributes,
			Cable cable1, XCableToCable xCableToCable1, Device device1) {
		Object[] result_pattern_XDuplexConnectionToConnectionRule_2_4_solveCSP_binding = pattern_XDuplexConnectionToConnectionRule_2_4_solveCSP_bindingFBBBBBBBBBBBBBBBBBB(
				_this, isApplicableMatch, container, connection2, xDeviceToDevice2, xCable, xDevice1, cable2,
				xContainer, connection1, xDeviceToDevice, xCableToCable2, xDevice2, device2, cableAttributes, cable1,
				xCableToCable1, device1);
		if (result_pattern_XDuplexConnectionToConnectionRule_2_4_solveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_XDuplexConnectionToConnectionRule_2_4_solveCSP_binding[0];

			Object[] result_pattern_XDuplexConnectionToConnectionRule_2_4_solveCSP_black = pattern_XDuplexConnectionToConnectionRule_2_4_solveCSP_blackB(
					csp);
			if (result_pattern_XDuplexConnectionToConnectionRule_2_4_solveCSP_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, container, connection2, xDeviceToDevice2, xCable,
						xDevice1, cable2, xContainer, connection1, xDeviceToDevice, xCableToCable2, xDevice2, device2,
						cableAttributes, cable1, xCableToCable1, device1 };
			}
		}
		return null;
	}

	public static final boolean pattern_XDuplexConnectionToConnectionRule_2_5_checkCSP_expressionFBB(
			XDuplexConnectionToConnectionRule _this, CSP csp) {
		boolean _localVariable_0 = _this.isApplicable_checkCsp_FWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_XDuplexConnectionToConnectionRule_2_6_addmatchtoruleresult_blackBB(
			IsApplicableRuleResult ruleresult, IsApplicableMatch isApplicableMatch) {
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final Object[] pattern_XDuplexConnectionToConnectionRule_2_6_addmatchtoruleresult_greenBB(
			IsApplicableRuleResult ruleresult, IsApplicableMatch isApplicableMatch) {
		ruleresult.getIsApplicableMatch().add(isApplicableMatch);
		boolean ruleresult_success_prime = Boolean.valueOf(true);
		String isApplicableMatch_ruleName_prime = "XDuplexConnectionToConnectionRule";
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		isApplicableMatch.setRuleName(isApplicableMatch_ruleName_prime);
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final IsApplicableRuleResult pattern_XDuplexConnectionToConnectionRule_2_7_expressionFB(
			IsApplicableRuleResult ruleresult) {
		IsApplicableRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_XDuplexConnectionToConnectionRule_10_1_initialbindings_blackBBBBBBB(
			XDuplexConnectionToConnectionRule _this, Match match, Container container, Cable cable2, Device device2,
			Cable cable1, Device device1) {
		if (!cable1.equals(cable2)) {
			if (!device1.equals(device2)) {
				return new Object[] { _this, match, container, cable2, device2, cable1, device1 };
			}
		}
		return null;
	}

	public static final Object[] pattern_XDuplexConnectionToConnectionRule_10_2_SolveCSP_bindingFBBBBBBB(
			XDuplexConnectionToConnectionRule _this, Match match, Container container, Cable cable2, Device device2,
			Cable cable1, Device device1) {
		CSP _localVariable_0 = _this.isAppropriate_solveCsp_BWD(match, container, cable2, device2, cable1, device1);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, match, container, cable2, device2, cable1, device1 };
		}
		return null;
	}

	public static final Object[] pattern_XDuplexConnectionToConnectionRule_10_2_SolveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_XDuplexConnectionToConnectionRule_10_2_SolveCSP_bindingAndBlackFBBBBBBB(
			XDuplexConnectionToConnectionRule _this, Match match, Container container, Cable cable2, Device device2,
			Cable cable1, Device device1) {
		Object[] result_pattern_XDuplexConnectionToConnectionRule_10_2_SolveCSP_binding = pattern_XDuplexConnectionToConnectionRule_10_2_SolveCSP_bindingFBBBBBBB(
				_this, match, container, cable2, device2, cable1, device1);
		if (result_pattern_XDuplexConnectionToConnectionRule_10_2_SolveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_XDuplexConnectionToConnectionRule_10_2_SolveCSP_binding[0];

			Object[] result_pattern_XDuplexConnectionToConnectionRule_10_2_SolveCSP_black = pattern_XDuplexConnectionToConnectionRule_10_2_SolveCSP_blackB(
					csp);
			if (result_pattern_XDuplexConnectionToConnectionRule_10_2_SolveCSP_black != null) {

				return new Object[] { csp, _this, match, container, cable2, device2, cable1, device1 };
			}
		}
		return null;
	}

	public static final boolean pattern_XDuplexConnectionToConnectionRule_10_3_CheckCSP_expressionFBB(
			XDuplexConnectionToConnectionRule _this, CSP csp) {
		boolean _localVariable_0 = _this.isAppropriate_checkCsp_BWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_XDuplexConnectionToConnectionRule_10_4_collectelementstobetranslated_blackBBBBBB(
			Match match, Container container, Cable cable2, Device device2, Cable cable1, Device device1) {
		if (!cable1.equals(cable2)) {
			if (!device1.equals(device2)) {
				return new Object[] { match, container, cable2, device2, cable1, device1 };
			}
		}
		return null;
	}

	public static final Object[] pattern_XDuplexConnectionToConnectionRule_10_4_collectelementstobetranslated_greenBBBBBFFFFFFFF(
			Match match, Cable cable2, Device device2, Cable cable1, Device device1) {
		EMoflonEdge cable2__device2____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge device2__cable2____outgoing = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge cable2__device1____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge device1__cable2____incoming = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge cable1__device2____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge device2__cable1____incoming = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge cable1__device1____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge device1__cable1____outgoing = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String cable2__device2____source_name_prime = "source";
		String device2__cable2____outgoing_name_prime = "outgoing";
		String cable2__device1____target_name_prime = "target";
		String device1__cable2____incoming_name_prime = "incoming";
		String cable1__device2____target_name_prime = "target";
		String device2__cable1____incoming_name_prime = "incoming";
		String cable1__device1____source_name_prime = "source";
		String device1__cable1____outgoing_name_prime = "outgoing";
		cable2__device2____source.setSrc(cable2);
		cable2__device2____source.setTrg(device2);
		match.getToBeTranslatedEdges().add(cable2__device2____source);
		device2__cable2____outgoing.setSrc(device2);
		device2__cable2____outgoing.setTrg(cable2);
		match.getToBeTranslatedEdges().add(device2__cable2____outgoing);
		cable2__device1____target.setSrc(cable2);
		cable2__device1____target.setTrg(device1);
		match.getToBeTranslatedEdges().add(cable2__device1____target);
		device1__cable2____incoming.setSrc(device1);
		device1__cable2____incoming.setTrg(cable2);
		match.getToBeTranslatedEdges().add(device1__cable2____incoming);
		cable1__device2____target.setSrc(cable1);
		cable1__device2____target.setTrg(device2);
		match.getToBeTranslatedEdges().add(cable1__device2____target);
		device2__cable1____incoming.setSrc(device2);
		device2__cable1____incoming.setTrg(cable1);
		match.getToBeTranslatedEdges().add(device2__cable1____incoming);
		cable1__device1____source.setSrc(cable1);
		cable1__device1____source.setTrg(device1);
		match.getToBeTranslatedEdges().add(cable1__device1____source);
		device1__cable1____outgoing.setSrc(device1);
		device1__cable1____outgoing.setTrg(cable1);
		match.getToBeTranslatedEdges().add(device1__cable1____outgoing);
		cable2__device2____source.setName(cable2__device2____source_name_prime);
		device2__cable2____outgoing.setName(device2__cable2____outgoing_name_prime);
		cable2__device1____target.setName(cable2__device1____target_name_prime);
		device1__cable2____incoming.setName(device1__cable2____incoming_name_prime);
		cable1__device2____target.setName(cable1__device2____target_name_prime);
		device2__cable1____incoming.setName(device2__cable1____incoming_name_prime);
		cable1__device1____source.setName(cable1__device1____source_name_prime);
		device1__cable1____outgoing.setName(device1__cable1____outgoing_name_prime);
		return new Object[] { match, cable2, device2, cable1, device1, cable2__device2____source,
				device2__cable2____outgoing, cable2__device1____target, device1__cable2____incoming,
				cable1__device2____target, device2__cable1____incoming, cable1__device1____source,
				device1__cable1____outgoing };
	}

	public static final Object[] pattern_XDuplexConnectionToConnectionRule_10_5_collectcontextelements_blackBBBBBB(
			Match match, Container container, Cable cable2, Device device2, Cable cable1, Device device1) {
		if (!cable1.equals(cable2)) {
			if (!device1.equals(device2)) {
				return new Object[] { match, container, cable2, device2, cable1, device1 };
			}
		}
		return null;
	}

	public static final Object[] pattern_XDuplexConnectionToConnectionRule_10_5_collectcontextelements_greenBBBBBBFFFF(
			Match match, Container container, Cable cable2, Device device2, Cable cable1, Device device1) {
		EMoflonEdge container__device2____devices = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge container__device1____devices = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge container__cable2____cables = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge container__cable1____cables = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		match.getContextNodes().add(container);
		match.getContextNodes().add(cable2);
		match.getContextNodes().add(device2);
		match.getContextNodes().add(cable1);
		match.getContextNodes().add(device1);
		String container__device2____devices_name_prime = "devices";
		String container__device1____devices_name_prime = "devices";
		String container__cable2____cables_name_prime = "cables";
		String container__cable1____cables_name_prime = "cables";
		container__device2____devices.setSrc(container);
		container__device2____devices.setTrg(device2);
		match.getContextEdges().add(container__device2____devices);
		container__device1____devices.setSrc(container);
		container__device1____devices.setTrg(device1);
		match.getContextEdges().add(container__device1____devices);
		container__cable2____cables.setSrc(container);
		container__cable2____cables.setTrg(cable2);
		match.getContextEdges().add(container__cable2____cables);
		container__cable1____cables.setSrc(container);
		container__cable1____cables.setTrg(cable1);
		match.getContextEdges().add(container__cable1____cables);
		container__device2____devices.setName(container__device2____devices_name_prime);
		container__device1____devices.setName(container__device1____devices_name_prime);
		container__cable2____cables.setName(container__cable2____cables_name_prime);
		container__cable1____cables.setName(container__cable1____cables_name_prime);
		return new Object[] { match, container, cable2, device2, cable1, device1, container__device2____devices,
				container__device1____devices, container__cable2____cables, container__cable1____cables };
	}

	public static final void pattern_XDuplexConnectionToConnectionRule_10_6_registerobjectstomatch_expressionBBBBBBB(
			XDuplexConnectionToConnectionRule _this, Match match, Container container, Cable cable2, Device device2,
			Cable cable1, Device device1) {
		_this.registerObjectsToMatch_BWD(match, container, cable2, device2, cable1, device1);

	}

	public static final boolean pattern_XDuplexConnectionToConnectionRule_10_7_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_XDuplexConnectionToConnectionRule_10_8_expressionF() {
		boolean _result = Boolean.valueOf(false);
		return _result;
	}

	public static final Object[] pattern_XDuplexConnectionToConnectionRule_11_1_performtransformation_bindingFFFFFFFFFFFFFFFFB(
			IsApplicableMatch isApplicableMatch) {
		EObject _localVariable_0 = isApplicableMatch.getObject("container");
		EObject _localVariable_1 = isApplicableMatch.getObject("connection2");
		EObject _localVariable_2 = isApplicableMatch.getObject("xDeviceToDevice2");
		EObject _localVariable_3 = isApplicableMatch.getObject("xCable");
		EObject _localVariable_4 = isApplicableMatch.getObject("xDevice1");
		EObject _localVariable_5 = isApplicableMatch.getObject("cable2");
		EObject _localVariable_6 = isApplicableMatch.getObject("xContainer");
		EObject _localVariable_7 = isApplicableMatch.getObject("connection1");
		EObject _localVariable_8 = isApplicableMatch.getObject("xDeviceToDevice");
		EObject _localVariable_9 = isApplicableMatch.getObject("xCableToCable2");
		EObject _localVariable_10 = isApplicableMatch.getObject("xDevice2");
		EObject _localVariable_11 = isApplicableMatch.getObject("device2");
		EObject _localVariable_12 = isApplicableMatch.getObject("cableAttributes");
		EObject _localVariable_13 = isApplicableMatch.getObject("cable1");
		EObject _localVariable_14 = isApplicableMatch.getObject("xCableToCable1");
		EObject _localVariable_15 = isApplicableMatch.getObject("device1");
		EObject tmpContainer = _localVariable_0;
		EObject tmpConnection2 = _localVariable_1;
		EObject tmpXDeviceToDevice2 = _localVariable_2;
		EObject tmpXCable = _localVariable_3;
		EObject tmpXDevice1 = _localVariable_4;
		EObject tmpCable2 = _localVariable_5;
		EObject tmpXContainer = _localVariable_6;
		EObject tmpConnection1 = _localVariable_7;
		EObject tmpXDeviceToDevice = _localVariable_8;
		EObject tmpXCableToCable2 = _localVariable_9;
		EObject tmpXDevice2 = _localVariable_10;
		EObject tmpDevice2 = _localVariable_11;
		EObject tmpCableAttributes = _localVariable_12;
		EObject tmpCable1 = _localVariable_13;
		EObject tmpXCableToCable1 = _localVariable_14;
		EObject tmpDevice1 = _localVariable_15;
		if (tmpContainer instanceof Container) {
			Container container = (Container) tmpContainer;
			if (tmpConnection2 instanceof Connections) {
				Connections connection2 = (Connections) tmpConnection2;
				if (tmpXDeviceToDevice2 instanceof XDeviceToDevice) {
					XDeviceToDevice xDeviceToDevice2 = (XDeviceToDevice) tmpXDeviceToDevice2;
					if (tmpXCable instanceof XCable) {
						XCable xCable = (XCable) tmpXCable;
						if (tmpXDevice1 instanceof XDevice) {
							XDevice xDevice1 = (XDevice) tmpXDevice1;
							if (tmpCable2 instanceof Cable) {
								Cable cable2 = (Cable) tmpCable2;
								if (tmpXContainer instanceof XContainer) {
									XContainer xContainer = (XContainer) tmpXContainer;
									if (tmpConnection1 instanceof Connections) {
										Connections connection1 = (Connections) tmpConnection1;
										if (tmpXDeviceToDevice instanceof XDeviceToDevice) {
											XDeviceToDevice xDeviceToDevice = (XDeviceToDevice) tmpXDeviceToDevice;
											if (tmpXCableToCable2 instanceof XCableToCable) {
												XCableToCable xCableToCable2 = (XCableToCable) tmpXCableToCable2;
												if (tmpXDevice2 instanceof XDevice) {
													XDevice xDevice2 = (XDevice) tmpXDevice2;
													if (tmpDevice2 instanceof Device) {
														Device device2 = (Device) tmpDevice2;
														if (tmpCableAttributes instanceof CableAttributes) {
															CableAttributes cableAttributes = (CableAttributes) tmpCableAttributes;
															if (tmpCable1 instanceof Cable) {
																Cable cable1 = (Cable) tmpCable1;
																if (tmpXCableToCable1 instanceof XCableToCable) {
																	XCableToCable xCableToCable1 = (XCableToCable) tmpXCableToCable1;
																	if (tmpDevice1 instanceof Device) {
																		Device device1 = (Device) tmpDevice1;
																		return new Object[] { container, connection2,
																				xDeviceToDevice2, xCable, xDevice1,
																				cable2, xContainer, connection1,
																				xDeviceToDevice, xCableToCable2,
																				xDevice2, device2, cableAttributes,
																				cable1, xCableToCable1, device1,
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
			}
		}
		return null;
	}

	public static final Object[] pattern_XDuplexConnectionToConnectionRule_11_1_performtransformation_blackBBBBBBBBBBBBBBBBFBB(
			Container container, Connections connection2, XDeviceToDevice xDeviceToDevice2, XCable xCable,
			XDevice xDevice1, Cable cable2, XContainer xContainer, Connections connection1,
			XDeviceToDevice xDeviceToDevice, XCableToCable xCableToCable2, XDevice xDevice2, Device device2,
			CableAttributes cableAttributes, Cable cable1, XCableToCable xCableToCable1, Device device1,
			XDuplexConnectionToConnectionRule _this, IsApplicableMatch isApplicableMatch) {
		if (!xDevice1.equals(xDevice2)) {
			if (!connection1.equals(connection2)) {
				if (!xDeviceToDevice.equals(xDeviceToDevice2)) {
					if (!cable1.equals(cable2)) {
						if (!xCableToCable1.equals(xCableToCable2)) {
							if (!device1.equals(device2)) {
								for (EObject tmpCsp : isApplicableMatch.getAttributeInfo()) {
									if (tmpCsp instanceof CSP) {
										CSP csp = (CSP) tmpCsp;
										return new Object[] { container, connection2, xDeviceToDevice2, xCable,
												xDevice1, cable2, xContainer, connection1, xDeviceToDevice,
												xCableToCable2, xDevice2, device2, cableAttributes, cable1,
												xCableToCable1, device1, csp, _this, isApplicableMatch };
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

	public static final Object[] pattern_XDuplexConnectionToConnectionRule_11_1_performtransformation_bindingAndBlackFFFFFFFFFFFFFFFFFBB(
			XDuplexConnectionToConnectionRule _this, IsApplicableMatch isApplicableMatch) {
		Object[] result_pattern_XDuplexConnectionToConnectionRule_11_1_performtransformation_binding = pattern_XDuplexConnectionToConnectionRule_11_1_performtransformation_bindingFFFFFFFFFFFFFFFFB(
				isApplicableMatch);
		if (result_pattern_XDuplexConnectionToConnectionRule_11_1_performtransformation_binding != null) {
			Container container = (Container) result_pattern_XDuplexConnectionToConnectionRule_11_1_performtransformation_binding[0];
			Connections connection2 = (Connections) result_pattern_XDuplexConnectionToConnectionRule_11_1_performtransformation_binding[1];
			XDeviceToDevice xDeviceToDevice2 = (XDeviceToDevice) result_pattern_XDuplexConnectionToConnectionRule_11_1_performtransformation_binding[2];
			XCable xCable = (XCable) result_pattern_XDuplexConnectionToConnectionRule_11_1_performtransformation_binding[3];
			XDevice xDevice1 = (XDevice) result_pattern_XDuplexConnectionToConnectionRule_11_1_performtransformation_binding[4];
			Cable cable2 = (Cable) result_pattern_XDuplexConnectionToConnectionRule_11_1_performtransformation_binding[5];
			XContainer xContainer = (XContainer) result_pattern_XDuplexConnectionToConnectionRule_11_1_performtransformation_binding[6];
			Connections connection1 = (Connections) result_pattern_XDuplexConnectionToConnectionRule_11_1_performtransformation_binding[7];
			XDeviceToDevice xDeviceToDevice = (XDeviceToDevice) result_pattern_XDuplexConnectionToConnectionRule_11_1_performtransformation_binding[8];
			XCableToCable xCableToCable2 = (XCableToCable) result_pattern_XDuplexConnectionToConnectionRule_11_1_performtransformation_binding[9];
			XDevice xDevice2 = (XDevice) result_pattern_XDuplexConnectionToConnectionRule_11_1_performtransformation_binding[10];
			Device device2 = (Device) result_pattern_XDuplexConnectionToConnectionRule_11_1_performtransformation_binding[11];
			CableAttributes cableAttributes = (CableAttributes) result_pattern_XDuplexConnectionToConnectionRule_11_1_performtransformation_binding[12];
			Cable cable1 = (Cable) result_pattern_XDuplexConnectionToConnectionRule_11_1_performtransformation_binding[13];
			XCableToCable xCableToCable1 = (XCableToCable) result_pattern_XDuplexConnectionToConnectionRule_11_1_performtransformation_binding[14];
			Device device1 = (Device) result_pattern_XDuplexConnectionToConnectionRule_11_1_performtransformation_binding[15];

			Object[] result_pattern_XDuplexConnectionToConnectionRule_11_1_performtransformation_black = pattern_XDuplexConnectionToConnectionRule_11_1_performtransformation_blackBBBBBBBBBBBBBBBBFBB(
					container, connection2, xDeviceToDevice2, xCable, xDevice1, cable2, xContainer, connection1,
					xDeviceToDevice, xCableToCable2, xDevice2, device2, cableAttributes, cable1, xCableToCable1,
					device1, _this, isApplicableMatch);
			if (result_pattern_XDuplexConnectionToConnectionRule_11_1_performtransformation_black != null) {
				CSP csp = (CSP) result_pattern_XDuplexConnectionToConnectionRule_11_1_performtransformation_black[16];

				return new Object[] { container, connection2, xDeviceToDevice2, xCable, xDevice1, cable2, xContainer,
						connection1, xDeviceToDevice, xCableToCable2, xDevice2, device2, cableAttributes, cable1,
						xCableToCable1, device1, csp, _this, isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_XDuplexConnectionToConnectionRule_11_1_performtransformation_greenBBBBBB(
			Connections connection2, XCable xCable, XDevice xDevice1, Connections connection1, XDevice xDevice2,
			CableAttributes cableAttributes) {
		connection2.getIncoming().add(xCable);
		connection1.getOutgoing().add(xCable);
		cableAttributes.setEndPoint2(xDevice2);
		cableAttributes.setEndPoint1(xDevice1);
		boolean cableAttributes_isDuplex_prime = Boolean.valueOf(true);
		cableAttributes.setIsDuplex(Boolean.valueOf(cableAttributes_isDuplex_prime));
		return new Object[] { connection2, xCable, xDevice1, connection1, xDevice2, cableAttributes };
	}

	public static final Object[] pattern_XDuplexConnectionToConnectionRule_11_2_collecttranslatedelements_greenF() {
		PerformRuleResult ruleresult = RuntimeFactory.eINSTANCE.createPerformRuleResult();
		return new Object[] { ruleresult };
	}

	public static final Object[] pattern_XDuplexConnectionToConnectionRule_11_3_bookkeepingforedges_blackBBBBBBBBBBBBBBBBB(
			PerformRuleResult ruleresult, EObject container, EObject connection2, EObject xDeviceToDevice2,
			EObject xCable, EObject xDevice1, EObject cable2, EObject xContainer, EObject connection1,
			EObject xDeviceToDevice, EObject xCableToCable2, EObject xDevice2, EObject device2, EObject cableAttributes,
			EObject cable1, EObject xCableToCable1, EObject device1) {
		if (!container.equals(xDeviceToDevice2)) {
			if (!container.equals(xCable)) {
				if (!container.equals(xDevice1)) {
					if (!container.equals(xContainer)) {
						if (!container.equals(xDeviceToDevice)) {
							if (!container.equals(xCableToCable2)) {
								if (!container.equals(xDevice2)) {
									if (!container.equals(device2)) {
										if (!container.equals(xCableToCable1)) {
											if (!container.equals(device1)) {
												if (!connection2.equals(container)) {
													if (!connection2.equals(xDeviceToDevice2)) {
														if (!connection2.equals(xCable)) {
															if (!connection2.equals(xDevice1)) {
																if (!connection2.equals(xContainer)) {
																	if (!connection2.equals(xDeviceToDevice)) {
																		if (!connection2.equals(xCableToCable2)) {
																			if (!connection2.equals(xDevice2)) {
																				if (!connection2.equals(device2)) {
																					if (!connection2
																							.equals(xCableToCable1)) {
																						if (!connection2
																								.equals(device1)) {
																							if (!xCable.equals(
																									xDeviceToDevice2)) {
																								if (!xCable.equals(
																										xDevice1)) {
																									if (!xCable.equals(
																											xContainer)) {
																										if (!xCable
																												.equals(xDeviceToDevice)) {
																											if (!xCable
																													.equals(xCableToCable2)) {
																												if (!xCable
																														.equals(xDevice2)) {
																													if (!xCable
																															.equals(xCableToCable1)) {
																														if (!xDevice1
																																.equals(xDeviceToDevice2)) {
																															if (!xDevice1
																																	.equals(xDeviceToDevice)) {
																																if (!xDevice1
																																		.equals(xDevice2)) {
																																	if (!cable2
																																			.equals(container)) {
																																		if (!cable2
																																				.equals(connection2)) {
																																			if (!cable2
																																					.equals(xDeviceToDevice2)) {
																																				if (!cable2
																																						.equals(xCable)) {
																																					if (!cable2
																																							.equals(xDevice1)) {
																																						if (!cable2
																																								.equals(xContainer)) {
																																							if (!cable2
																																									.equals(connection1)) {
																																								if (!cable2
																																										.equals(xDeviceToDevice)) {
																																									if (!cable2
																																											.equals(xCableToCable2)) {
																																										if (!cable2
																																												.equals(xDevice2)) {
																																											if (!cable2
																																													.equals(device2)) {
																																												if (!cable2
																																														.equals(cableAttributes)) {
																																													if (!cable2
																																															.equals(xCableToCable1)) {
																																														if (!cable2
																																																.equals(device1)) {
																																															if (!xContainer
																																																	.equals(xDeviceToDevice2)) {
																																																if (!xContainer
																																																		.equals(xDevice1)) {
																																																	if (!xContainer
																																																			.equals(xDeviceToDevice)) {
																																																		if (!xContainer
																																																				.equals(xDevice2)) {
																																																			if (!connection1
																																																					.equals(container)) {
																																																				if (!connection1
																																																						.equals(connection2)) {
																																																					if (!connection1
																																																							.equals(xDeviceToDevice2)) {
																																																						if (!connection1
																																																								.equals(xCable)) {
																																																							if (!connection1
																																																									.equals(xDevice1)) {
																																																								if (!connection1
																																																										.equals(xContainer)) {
																																																									if (!connection1
																																																											.equals(xDeviceToDevice)) {
																																																										if (!connection1
																																																												.equals(xCableToCable2)) {
																																																											if (!connection1
																																																													.equals(xDevice2)) {
																																																												if (!connection1
																																																														.equals(device2)) {
																																																													if (!connection1
																																																															.equals(xCableToCable1)) {
																																																														if (!connection1
																																																																.equals(device1)) {
																																																															if (!xDeviceToDevice
																																																																	.equals(xDeviceToDevice2)) {
																																																																if (!xCableToCable2
																																																																		.equals(xDeviceToDevice2)) {
																																																																	if (!xCableToCable2
																																																																			.equals(xDevice1)) {
																																																																		if (!xCableToCable2
																																																																				.equals(xContainer)) {
																																																																			if (!xCableToCable2
																																																																					.equals(xDeviceToDevice)) {
																																																																				if (!xCableToCable2
																																																																						.equals(xDevice2)) {
																																																																					if (!xDevice2
																																																																							.equals(xDeviceToDevice2)) {
																																																																						if (!xDevice2
																																																																								.equals(xDeviceToDevice)) {
																																																																							if (!device2
																																																																									.equals(xDeviceToDevice2)) {
																																																																								if (!device2
																																																																										.equals(xCable)) {
																																																																									if (!device2
																																																																											.equals(xDevice1)) {
																																																																										if (!device2
																																																																												.equals(xContainer)) {
																																																																											if (!device2
																																																																													.equals(xDeviceToDevice)) {
																																																																												if (!device2
																																																																														.equals(xCableToCable2)) {
																																																																													if (!device2
																																																																															.equals(xDevice2)) {
																																																																														if (!device2
																																																																																.equals(xCableToCable1)) {
																																																																															if (!cableAttributes
																																																																																	.equals(container)) {
																																																																																if (!cableAttributes
																																																																																		.equals(connection2)) {
																																																																																	if (!cableAttributes
																																																																																			.equals(xDeviceToDevice2)) {
																																																																																		if (!cableAttributes
																																																																																				.equals(xCable)) {
																																																																																			if (!cableAttributes
																																																																																					.equals(xDevice1)) {
																																																																																				if (!cableAttributes
																																																																																						.equals(xContainer)) {
																																																																																					if (!cableAttributes
																																																																																							.equals(connection1)) {
																																																																																						if (!cableAttributes
																																																																																								.equals(xDeviceToDevice)) {
																																																																																							if (!cableAttributes
																																																																																									.equals(xCableToCable2)) {
																																																																																								if (!cableAttributes
																																																																																										.equals(xDevice2)) {
																																																																																									if (!cableAttributes
																																																																																											.equals(device2)) {
																																																																																										if (!cableAttributes
																																																																																												.equals(xCableToCable1)) {
																																																																																											if (!cableAttributes
																																																																																													.equals(device1)) {
																																																																																												if (!cable1
																																																																																														.equals(container)) {
																																																																																													if (!cable1
																																																																																															.equals(connection2)) {
																																																																																														if (!cable1
																																																																																																.equals(xDeviceToDevice2)) {
																																																																																															if (!cable1
																																																																																																	.equals(xCable)) {
																																																																																																if (!cable1
																																																																																																		.equals(xDevice1)) {
																																																																																																	if (!cable1
																																																																																																			.equals(cable2)) {
																																																																																																		if (!cable1
																																																																																																				.equals(xContainer)) {
																																																																																																			if (!cable1
																																																																																																					.equals(connection1)) {
																																																																																																				if (!cable1
																																																																																																						.equals(xDeviceToDevice)) {
																																																																																																					if (!cable1
																																																																																																							.equals(xCableToCable2)) {
																																																																																																						if (!cable1
																																																																																																								.equals(xDevice2)) {
																																																																																																							if (!cable1
																																																																																																									.equals(device2)) {
																																																																																																								if (!cable1
																																																																																																										.equals(cableAttributes)) {
																																																																																																									if (!cable1
																																																																																																											.equals(xCableToCable1)) {
																																																																																																										if (!cable1
																																																																																																												.equals(device1)) {
																																																																																																											if (!xCableToCable1
																																																																																																													.equals(xDeviceToDevice2)) {
																																																																																																												if (!xCableToCable1
																																																																																																														.equals(xDevice1)) {
																																																																																																													if (!xCableToCable1
																																																																																																															.equals(xContainer)) {
																																																																																																														if (!xCableToCable1
																																																																																																																.equals(xDeviceToDevice)) {
																																																																																																															if (!xCableToCable1
																																																																																																																	.equals(xCableToCable2)) {
																																																																																																																if (!xCableToCable1
																																																																																																																		.equals(xDevice2)) {
																																																																																																																	if (!device1
																																																																																																																			.equals(xDeviceToDevice2)) {
																																																																																																																		if (!device1
																																																																																																																				.equals(xCable)) {
																																																																																																																			if (!device1
																																																																																																																					.equals(xDevice1)) {
																																																																																																																				if (!device1
																																																																																																																						.equals(xContainer)) {
																																																																																																																					if (!device1
																																																																																																																							.equals(xDeviceToDevice)) {
																																																																																																																						if (!device1
																																																																																																																								.equals(xCableToCable2)) {
																																																																																																																							if (!device1
																																																																																																																									.equals(xDevice2)) {
																																																																																																																								if (!device1
																																																																																																																										.equals(device2)) {
																																																																																																																									if (!device1
																																																																																																																											.equals(xCableToCable1)) {
																																																																																																																										return new Object[] {
																																																																																																																												ruleresult,
																																																																																																																												container,
																																																																																																																												connection2,
																																																																																																																												xDeviceToDevice2,
																																																																																																																												xCable,
																																																																																																																												xDevice1,
																																																																																																																												cable2,
																																																																																																																												xContainer,
																																																																																																																												connection1,
																																																																																																																												xDeviceToDevice,
																																																																																																																												xCableToCable2,
																																																																																																																												xDevice2,
																																																																																																																												device2,
																																																																																																																												cableAttributes,
																																																																																																																												cable1,
																																																																																																																												xCableToCable1,
																																																																																																																												device1 };
																																																																																																																									}
																																																																																																																								}
																																																																																																																							}
																																																																																																																						}
																																																																																																																					}
																																																																																																																				}
																																																																																																																			}
																																																																																																																		}
																																																																																																																	}
																																																																																																																}
																																																																																																															}
																																																																																																														}
																																																																																																													}
																																																																																																												}
																																																																																																											}
																																																																																																										}
																																																																																																									}
																																																																																																								}
																																																																																																							}
																																																																																																						}
																																																																																																					}
																																																																																																				}
																																																																																																			}
																																																																																																		}
																																																																																																	}
																																																																																																}
																																																																																															}
																																																																																														}
																																																																																													}
																																																																																												}
																																																																																											}
																																																																																										}
																																																																																									}
																																																																																								}
																																																																																							}
																																																																																						}
																																																																																					}
																																																																																				}
																																																																																			}
																																																																																		}
																																																																																	}
																																																																																}
																																																																															}
																																																																														}
																																																																													}
																																																																												}
																																																																											}
																																																																										}
																																																																									}
																																																																								}
																																																																							}
																																																																						}
																																																																					}
																																																																				}
																																																																			}
																																																																		}
																																																																	}
																																																																}
																																																															}
																																																														}
																																																													}
																																																												}
																																																											}
																																																										}
																																																									}
																																																								}
																																																							}
																																																						}
																																																					}
																																																				}
																																																			}
																																																		}
																																																	}
																																																}
																																															}
																																														}
																																													}
																																												}
																																											}
																																										}
																																									}
																																								}
																																							}
																																						}
																																					}
																																				}
																																			}
																																		}
																																	}
																																}
																															}
																														}
																													}
																												}
																											}
																										}
																									}
																								}
																							}
																						}
																					}
																				}
																			}
																		}
																	}
																}
															}
														}
													}
												}
											}
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

	public static final Object[] pattern_XDuplexConnectionToConnectionRule_11_3_bookkeepingforedges_greenBBBBBBBBBBBFFFFFFFFFFFF(
			PerformRuleResult ruleresult, EObject connection2, EObject xCable, EObject xDevice1, EObject cable2,
			EObject connection1, EObject xDevice2, EObject device2, EObject cableAttributes, EObject cable1,
			EObject device1) {
		EMoflonEdge connection2__xCable____incoming = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge cable2__device2____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge device2__cable2____outgoing = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge connection1__xCable____outgoing = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge cable2__device1____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge device1__cable2____incoming = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge cableAttributes__xDevice2____endPoint2 = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge cableAttributes__xDevice1____endPoint1 = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge cable1__device2____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge device2__cable1____incoming = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge cable1__device1____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge device1__cable1____outgoing = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String ruleresult_ruleName_prime = "XDuplexConnectionToConnectionRule";
		String connection2__xCable____incoming_name_prime = "incoming";
		String cable2__device2____source_name_prime = "source";
		String device2__cable2____outgoing_name_prime = "outgoing";
		String connection1__xCable____outgoing_name_prime = "outgoing";
		String cable2__device1____target_name_prime = "target";
		String device1__cable2____incoming_name_prime = "incoming";
		String cableAttributes__xDevice2____endPoint2_name_prime = "endPoint2";
		String cableAttributes__xDevice1____endPoint1_name_prime = "endPoint1";
		String cable1__device2____target_name_prime = "target";
		String device2__cable1____incoming_name_prime = "incoming";
		String cable1__device1____source_name_prime = "source";
		String device1__cable1____outgoing_name_prime = "outgoing";
		connection2__xCable____incoming.setSrc(connection2);
		connection2__xCable____incoming.setTrg(xCable);
		ruleresult.getCreatedEdges().add(connection2__xCable____incoming);
		cable2__device2____source.setSrc(cable2);
		cable2__device2____source.setTrg(device2);
		ruleresult.getTranslatedEdges().add(cable2__device2____source);
		device2__cable2____outgoing.setSrc(device2);
		device2__cable2____outgoing.setTrg(cable2);
		ruleresult.getTranslatedEdges().add(device2__cable2____outgoing);
		connection1__xCable____outgoing.setSrc(connection1);
		connection1__xCable____outgoing.setTrg(xCable);
		ruleresult.getCreatedEdges().add(connection1__xCable____outgoing);
		cable2__device1____target.setSrc(cable2);
		cable2__device1____target.setTrg(device1);
		ruleresult.getTranslatedEdges().add(cable2__device1____target);
		device1__cable2____incoming.setSrc(device1);
		device1__cable2____incoming.setTrg(cable2);
		ruleresult.getTranslatedEdges().add(device1__cable2____incoming);
		cableAttributes__xDevice2____endPoint2.setSrc(cableAttributes);
		cableAttributes__xDevice2____endPoint2.setTrg(xDevice2);
		ruleresult.getCreatedEdges().add(cableAttributes__xDevice2____endPoint2);
		cableAttributes__xDevice1____endPoint1.setSrc(cableAttributes);
		cableAttributes__xDevice1____endPoint1.setTrg(xDevice1);
		ruleresult.getCreatedEdges().add(cableAttributes__xDevice1____endPoint1);
		cable1__device2____target.setSrc(cable1);
		cable1__device2____target.setTrg(device2);
		ruleresult.getTranslatedEdges().add(cable1__device2____target);
		device2__cable1____incoming.setSrc(device2);
		device2__cable1____incoming.setTrg(cable1);
		ruleresult.getTranslatedEdges().add(device2__cable1____incoming);
		cable1__device1____source.setSrc(cable1);
		cable1__device1____source.setTrg(device1);
		ruleresult.getTranslatedEdges().add(cable1__device1____source);
		device1__cable1____outgoing.setSrc(device1);
		device1__cable1____outgoing.setTrg(cable1);
		ruleresult.getTranslatedEdges().add(device1__cable1____outgoing);
		ruleresult.setRuleName(ruleresult_ruleName_prime);
		connection2__xCable____incoming.setName(connection2__xCable____incoming_name_prime);
		cable2__device2____source.setName(cable2__device2____source_name_prime);
		device2__cable2____outgoing.setName(device2__cable2____outgoing_name_prime);
		connection1__xCable____outgoing.setName(connection1__xCable____outgoing_name_prime);
		cable2__device1____target.setName(cable2__device1____target_name_prime);
		device1__cable2____incoming.setName(device1__cable2____incoming_name_prime);
		cableAttributes__xDevice2____endPoint2.setName(cableAttributes__xDevice2____endPoint2_name_prime);
		cableAttributes__xDevice1____endPoint1.setName(cableAttributes__xDevice1____endPoint1_name_prime);
		cable1__device2____target.setName(cable1__device2____target_name_prime);
		device2__cable1____incoming.setName(device2__cable1____incoming_name_prime);
		cable1__device1____source.setName(cable1__device1____source_name_prime);
		device1__cable1____outgoing.setName(device1__cable1____outgoing_name_prime);
		return new Object[] { ruleresult, connection2, xCable, xDevice1, cable2, connection1, xDevice2, device2,
				cableAttributes, cable1, device1, connection2__xCable____incoming, cable2__device2____source,
				device2__cable2____outgoing, connection1__xCable____outgoing, cable2__device1____target,
				device1__cable2____incoming, cableAttributes__xDevice2____endPoint2,
				cableAttributes__xDevice1____endPoint1, cable1__device2____target, device2__cable1____incoming,
				cable1__device1____source, device1__cable1____outgoing };
	}

	public static final void pattern_XDuplexConnectionToConnectionRule_11_5_registerobjects_expressionBBBBBBBBBBBBBBBBBB(
			XDuplexConnectionToConnectionRule _this, PerformRuleResult ruleresult, EObject container,
			EObject connection2, EObject xDeviceToDevice2, EObject xCable, EObject xDevice1, EObject cable2,
			EObject xContainer, EObject connection1, EObject xDeviceToDevice, EObject xCableToCable2, EObject xDevice2,
			EObject device2, EObject cableAttributes, EObject cable1, EObject xCableToCable1, EObject device1) {
		_this.registerObjects_BWD(ruleresult, container, connection2, xDeviceToDevice2, xCable, xDevice1, cable2,
				xContainer, connection1, xDeviceToDevice, xCableToCable2, xDevice2, device2, cableAttributes, cable1,
				xCableToCable1, device1);

	}

	public static final PerformRuleResult pattern_XDuplexConnectionToConnectionRule_11_6_expressionFB(
			PerformRuleResult ruleresult) {
		PerformRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_XDuplexConnectionToConnectionRule_12_1_preparereturnvalue_bindingFB(
			XDuplexConnectionToConnectionRule _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass eClass = _localVariable_0;
		if (eClass != null) {
			return new Object[] { eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_XDuplexConnectionToConnectionRule_12_1_preparereturnvalue_blackFBB(
			EClass eClass, XDuplexConnectionToConnectionRule _this) {
		for (EOperation performOperation : eClass.getEOperations()) {
			String performOperation_name = performOperation.getName();
			if (performOperation_name.equals("perform_BWD")) {
				return new Object[] { performOperation, eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_XDuplexConnectionToConnectionRule_12_1_preparereturnvalue_bindingAndBlackFFB(
			XDuplexConnectionToConnectionRule _this) {
		Object[] result_pattern_XDuplexConnectionToConnectionRule_12_1_preparereturnvalue_binding = pattern_XDuplexConnectionToConnectionRule_12_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_XDuplexConnectionToConnectionRule_12_1_preparereturnvalue_binding != null) {
			EClass eClass = (EClass) result_pattern_XDuplexConnectionToConnectionRule_12_1_preparereturnvalue_binding[0];

			Object[] result_pattern_XDuplexConnectionToConnectionRule_12_1_preparereturnvalue_black = pattern_XDuplexConnectionToConnectionRule_12_1_preparereturnvalue_blackFBB(
					eClass, _this);
			if (result_pattern_XDuplexConnectionToConnectionRule_12_1_preparereturnvalue_black != null) {
				EOperation performOperation = (EOperation) result_pattern_XDuplexConnectionToConnectionRule_12_1_preparereturnvalue_black[0];

				return new Object[] { performOperation, eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_XDuplexConnectionToConnectionRule_12_1_preparereturnvalue_greenBF(
			EOperation performOperation) {
		IsApplicableRuleResult ruleresult = RuntimeFactory.eINSTANCE.createIsApplicableRuleResult();
		boolean ruleresult_success_prime = Boolean.valueOf(false);
		String ruleresult_rule_prime = "XDuplexConnectionToConnectionRule";
		ruleresult.setPerformOperation(performOperation);
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		ruleresult.setRule(ruleresult_rule_prime);
		return new Object[] { performOperation, ruleresult };
	}

	public static final Object[] pattern_XDuplexConnectionToConnectionRule_12_2_corematch_bindingFFFFFB(Match match) {
		EObject _localVariable_0 = match.getObject("container");
		EObject _localVariable_1 = match.getObject("cable2");
		EObject _localVariable_2 = match.getObject("device2");
		EObject _localVariable_3 = match.getObject("cable1");
		EObject _localVariable_4 = match.getObject("device1");
		EObject tmpContainer = _localVariable_0;
		EObject tmpCable2 = _localVariable_1;
		EObject tmpDevice2 = _localVariable_2;
		EObject tmpCable1 = _localVariable_3;
		EObject tmpDevice1 = _localVariable_4;
		if (tmpContainer instanceof Container) {
			Container container = (Container) tmpContainer;
			if (tmpCable2 instanceof Cable) {
				Cable cable2 = (Cable) tmpCable2;
				if (tmpDevice2 instanceof Device) {
					Device device2 = (Device) tmpDevice2;
					if (tmpCable1 instanceof Cable) {
						Cable cable1 = (Cable) tmpCable1;
						if (tmpDevice1 instanceof Device) {
							Device device1 = (Device) tmpDevice1;
							return new Object[] { container, cable2, device2, cable1, device1, match };
						}
					}
				}
			}
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_XDuplexConnectionToConnectionRule_12_2_corematch_blackBFFFBFFFBBFBB(
			Container container, Cable cable2, Device device2, Cable cable1, Device device1, Match match) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (!cable1.equals(cable2)) {
			if (!device1.equals(device2)) {
				for (XCableToCable xCableToCable2 : org.moflon.core.utilities.eMoflonEMFUtil
						.getOppositeReferenceTyped(cable2, XCableToCable.class, "target")) {
					XCable xCable = xCableToCable2.getSource();
					if (xCable != null) {
						for (XDeviceToDevice xDeviceToDevice2 : org.moflon.core.utilities.eMoflonEMFUtil
								.getOppositeReferenceTyped(device2, XDeviceToDevice.class, "target")) {
							XDevice xDevice2 = xDeviceToDevice2.getSource();
							if (xDevice2 != null) {
								for (XCableToCable xCableToCable1 : org.moflon.core.utilities.eMoflonEMFUtil
										.getOppositeReferenceTyped(cable1, XCableToCable.class, "target")) {
									if (!xCableToCable1.equals(xCableToCable2)) {
										if (xCable.equals(xCableToCable1.getSource())) {
											for (XDeviceToDevice xDeviceToDevice : org.moflon.core.utilities.eMoflonEMFUtil
													.getOppositeReferenceTyped(device1, XDeviceToDevice.class,
															"target")) {
												if (!xDeviceToDevice.equals(xDeviceToDevice2)) {
													XDevice xDevice1 = xDeviceToDevice.getSource();
													if (xDevice1 != null) {
														if (!xDevice1.equals(xDevice2)) {
															_result.add(new Object[] { container, xDeviceToDevice2,
																	xCable, xDevice1, cable2, xDeviceToDevice,
																	xCableToCable2, xDevice2, device2, cable1,
																	xCableToCable1, device1, match });
														}
													}

												}
											}
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

	public static final Iterable<Object[]> pattern_XDuplexConnectionToConnectionRule_12_3_findcontext_blackBFBBBBFFBBBBFBBB(
			Container container, XDeviceToDevice xDeviceToDevice2, XCable xCable, XDevice xDevice1, Cable cable2,
			XDeviceToDevice xDeviceToDevice, XCableToCable xCableToCable2, XDevice xDevice2, Device device2,
			Cable cable1, XCableToCable xCableToCable1, Device device1) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (!xDevice1.equals(xDevice2)) {
			if (!xDeviceToDevice.equals(xDeviceToDevice2)) {
				if (!cable1.equals(cable2)) {
					if (!xCableToCable1.equals(xCableToCable2)) {
						if (!device1.equals(device2)) {
							if (container.getDevices().contains(device2)) {
								if (device2.equals(cable2.getSource())) {
									if (container.getDevices().contains(device1)) {
										if (xDevice1.equals(xDeviceToDevice.getSource())) {
											if (cable2.equals(xCableToCable2.getTarget())) {
												if (xDevice2.equals(xDeviceToDevice2.getSource())) {
													if (device2.equals(xDeviceToDevice2.getTarget())) {
														if (xCable.equals(xCableToCable2.getSource())) {
															if (device1.equals(cable2.getTarget())) {
																if (cable1.equals(xCableToCable1.getTarget())) {
																	if (device2.equals(cable1.getTarget())) {
																		if (device1
																				.equals(xDeviceToDevice.getTarget())) {
																			if (xCable.equals(
																					xCableToCable1.getSource())) {
																				if (device1
																						.equals(cable1.getSource())) {
																					if (container.getCables()
																							.contains(cable2)) {
																						if (container.getCables()
																								.contains(cable1)) {
																							CableAttributes cableAttributes = xCable
																									.getCableAttributes();
																							if (cableAttributes != null) {
																								Connections connection2 = xDevice2
																										.getConnections();
																								if (connection2 != null) {
																									Connections connection1 = xDevice1
																											.getConnections();
																									if (connection1 != null) {
																										if (!connection1
																												.equals(connection2)) {
																											for (XContainer xContainer : org.moflon.core.utilities.eMoflonEMFUtil
																													.getOppositeReferenceTyped(
																															xDevice2,
																															XContainer.class,
																															"elements")) {
																												if (xContainer
																														.getElements()
																														.contains(
																																xCable)) {
																													if (xContainer
																															.getElements()
																															.contains(
																																	xDevice1)) {
																														_result.add(
																																new Object[] {
																																		container,
																																		connection2,
																																		xDeviceToDevice2,
																																		xCable,
																																		xDevice1,
																																		cable2,
																																		xContainer,
																																		connection1,
																																		xDeviceToDevice,
																																		xCableToCable2,
																																		xDevice2,
																																		device2,
																																		cableAttributes,
																																		cable1,
																																		xCableToCable1,
																																		device1 });
																													}
																												}
																											}
																										}
																									}

																								}

																							}

																						}
																					}
																				}
																			}
																		}
																	}
																}
															}
														}
													}
												}
											}
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

	public static final Object[] pattern_XDuplexConnectionToConnectionRule_12_3_findcontext_greenBBBBBBBBBBBBBBBBFFFFFFFFFFFFFFFFFFFFFFFFFFF(
			Container container, Connections connection2, XDeviceToDevice xDeviceToDevice2, XCable xCable,
			XDevice xDevice1, Cable cable2, XContainer xContainer, Connections connection1,
			XDeviceToDevice xDeviceToDevice, XCableToCable xCableToCable2, XDevice xDevice2, Device device2,
			CableAttributes cableAttributes, Cable cable1, XCableToCable xCableToCable1, Device device1) {
		IsApplicableMatch isApplicableMatch = RuntimeFactory.eINSTANCE.createIsApplicableMatch();
		EMoflonEdge xCable__cableAttributes____cableAttributes = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge container__device2____devices = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge cable2__device2____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge device2__cable2____outgoing = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge xContainer__xDevice2____elements = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge container__device1____devices = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge xDeviceToDevice__xDevice1____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge xCableToCable2__cable2____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge xDevice2__connection2____connections = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge xDeviceToDevice2__xDevice2____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge xDeviceToDevice2__device2____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge xCableToCable2__xCable____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge cable2__device1____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge device1__cable2____incoming = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge xDevice1__connection1____connections = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge xContainer__xCable____elements = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge xCableToCable1__cable1____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge cable1__device2____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge device2__cable1____incoming = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge xDeviceToDevice__device1____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge xCableToCable1__xCable____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge cable1__device1____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge device1__cable1____outgoing = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge xContainer__xDevice1____elements = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge container__cable2____cables = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge container__cable1____cables = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		boolean cableAttributes_isDuplex_prime = Boolean.valueOf(true);
		String xCable__cableAttributes____cableAttributes_name_prime = "cableAttributes";
		String container__device2____devices_name_prime = "devices";
		String cable2__device2____source_name_prime = "source";
		String device2__cable2____outgoing_name_prime = "outgoing";
		String xContainer__xDevice2____elements_name_prime = "elements";
		String container__device1____devices_name_prime = "devices";
		String xDeviceToDevice__xDevice1____source_name_prime = "source";
		String xCableToCable2__cable2____target_name_prime = "target";
		String xDevice2__connection2____connections_name_prime = "connections";
		String xDeviceToDevice2__xDevice2____source_name_prime = "source";
		String xDeviceToDevice2__device2____target_name_prime = "target";
		String xCableToCable2__xCable____source_name_prime = "source";
		String cable2__device1____target_name_prime = "target";
		String device1__cable2____incoming_name_prime = "incoming";
		String xDevice1__connection1____connections_name_prime = "connections";
		String xContainer__xCable____elements_name_prime = "elements";
		String xCableToCable1__cable1____target_name_prime = "target";
		String cable1__device2____target_name_prime = "target";
		String device2__cable1____incoming_name_prime = "incoming";
		String xDeviceToDevice__device1____target_name_prime = "target";
		String xCableToCable1__xCable____source_name_prime = "source";
		String cable1__device1____source_name_prime = "source";
		String device1__cable1____outgoing_name_prime = "outgoing";
		String xContainer__xDevice1____elements_name_prime = "elements";
		String container__cable2____cables_name_prime = "cables";
		String container__cable1____cables_name_prime = "cables";
		isApplicableMatch.getAllContextElements().add(container);
		isApplicableMatch.getAllContextElements().add(connection2);
		isApplicableMatch.getAllContextElements().add(xDeviceToDevice2);
		isApplicableMatch.getAllContextElements().add(xCable);
		isApplicableMatch.getAllContextElements().add(xDevice1);
		isApplicableMatch.getAllContextElements().add(cable2);
		isApplicableMatch.getAllContextElements().add(xContainer);
		isApplicableMatch.getAllContextElements().add(connection1);
		isApplicableMatch.getAllContextElements().add(xDeviceToDevice);
		isApplicableMatch.getAllContextElements().add(xCableToCable2);
		isApplicableMatch.getAllContextElements().add(xDevice2);
		isApplicableMatch.getAllContextElements().add(device2);
		isApplicableMatch.getAllContextElements().add(cableAttributes);
		isApplicableMatch.getAllContextElements().add(cable1);
		isApplicableMatch.getAllContextElements().add(xCableToCable1);
		isApplicableMatch.getAllContextElements().add(device1);
		xCable__cableAttributes____cableAttributes.setSrc(xCable);
		xCable__cableAttributes____cableAttributes.setTrg(cableAttributes);
		isApplicableMatch.getAllContextElements().add(xCable__cableAttributes____cableAttributes);
		container__device2____devices.setSrc(container);
		container__device2____devices.setTrg(device2);
		isApplicableMatch.getAllContextElements().add(container__device2____devices);
		cable2__device2____source.setSrc(cable2);
		cable2__device2____source.setTrg(device2);
		isApplicableMatch.getAllContextElements().add(cable2__device2____source);
		device2__cable2____outgoing.setSrc(device2);
		device2__cable2____outgoing.setTrg(cable2);
		isApplicableMatch.getAllContextElements().add(device2__cable2____outgoing);
		xContainer__xDevice2____elements.setSrc(xContainer);
		xContainer__xDevice2____elements.setTrg(xDevice2);
		isApplicableMatch.getAllContextElements().add(xContainer__xDevice2____elements);
		container__device1____devices.setSrc(container);
		container__device1____devices.setTrg(device1);
		isApplicableMatch.getAllContextElements().add(container__device1____devices);
		xDeviceToDevice__xDevice1____source.setSrc(xDeviceToDevice);
		xDeviceToDevice__xDevice1____source.setTrg(xDevice1);
		isApplicableMatch.getAllContextElements().add(xDeviceToDevice__xDevice1____source);
		xCableToCable2__cable2____target.setSrc(xCableToCable2);
		xCableToCable2__cable2____target.setTrg(cable2);
		isApplicableMatch.getAllContextElements().add(xCableToCable2__cable2____target);
		xDevice2__connection2____connections.setSrc(xDevice2);
		xDevice2__connection2____connections.setTrg(connection2);
		isApplicableMatch.getAllContextElements().add(xDevice2__connection2____connections);
		xDeviceToDevice2__xDevice2____source.setSrc(xDeviceToDevice2);
		xDeviceToDevice2__xDevice2____source.setTrg(xDevice2);
		isApplicableMatch.getAllContextElements().add(xDeviceToDevice2__xDevice2____source);
		xDeviceToDevice2__device2____target.setSrc(xDeviceToDevice2);
		xDeviceToDevice2__device2____target.setTrg(device2);
		isApplicableMatch.getAllContextElements().add(xDeviceToDevice2__device2____target);
		xCableToCable2__xCable____source.setSrc(xCableToCable2);
		xCableToCable2__xCable____source.setTrg(xCable);
		isApplicableMatch.getAllContextElements().add(xCableToCable2__xCable____source);
		cable2__device1____target.setSrc(cable2);
		cable2__device1____target.setTrg(device1);
		isApplicableMatch.getAllContextElements().add(cable2__device1____target);
		device1__cable2____incoming.setSrc(device1);
		device1__cable2____incoming.setTrg(cable2);
		isApplicableMatch.getAllContextElements().add(device1__cable2____incoming);
		xDevice1__connection1____connections.setSrc(xDevice1);
		xDevice1__connection1____connections.setTrg(connection1);
		isApplicableMatch.getAllContextElements().add(xDevice1__connection1____connections);
		xContainer__xCable____elements.setSrc(xContainer);
		xContainer__xCable____elements.setTrg(xCable);
		isApplicableMatch.getAllContextElements().add(xContainer__xCable____elements);
		xCableToCable1__cable1____target.setSrc(xCableToCable1);
		xCableToCable1__cable1____target.setTrg(cable1);
		isApplicableMatch.getAllContextElements().add(xCableToCable1__cable1____target);
		cable1__device2____target.setSrc(cable1);
		cable1__device2____target.setTrg(device2);
		isApplicableMatch.getAllContextElements().add(cable1__device2____target);
		device2__cable1____incoming.setSrc(device2);
		device2__cable1____incoming.setTrg(cable1);
		isApplicableMatch.getAllContextElements().add(device2__cable1____incoming);
		xDeviceToDevice__device1____target.setSrc(xDeviceToDevice);
		xDeviceToDevice__device1____target.setTrg(device1);
		isApplicableMatch.getAllContextElements().add(xDeviceToDevice__device1____target);
		xCableToCable1__xCable____source.setSrc(xCableToCable1);
		xCableToCable1__xCable____source.setTrg(xCable);
		isApplicableMatch.getAllContextElements().add(xCableToCable1__xCable____source);
		cable1__device1____source.setSrc(cable1);
		cable1__device1____source.setTrg(device1);
		isApplicableMatch.getAllContextElements().add(cable1__device1____source);
		device1__cable1____outgoing.setSrc(device1);
		device1__cable1____outgoing.setTrg(cable1);
		isApplicableMatch.getAllContextElements().add(device1__cable1____outgoing);
		xContainer__xDevice1____elements.setSrc(xContainer);
		xContainer__xDevice1____elements.setTrg(xDevice1);
		isApplicableMatch.getAllContextElements().add(xContainer__xDevice1____elements);
		container__cable2____cables.setSrc(container);
		container__cable2____cables.setTrg(cable2);
		isApplicableMatch.getAllContextElements().add(container__cable2____cables);
		container__cable1____cables.setSrc(container);
		container__cable1____cables.setTrg(cable1);
		isApplicableMatch.getAllContextElements().add(container__cable1____cables);
		cableAttributes.setIsDuplex(Boolean.valueOf(cableAttributes_isDuplex_prime));
		xCable__cableAttributes____cableAttributes.setName(xCable__cableAttributes____cableAttributes_name_prime);
		container__device2____devices.setName(container__device2____devices_name_prime);
		cable2__device2____source.setName(cable2__device2____source_name_prime);
		device2__cable2____outgoing.setName(device2__cable2____outgoing_name_prime);
		xContainer__xDevice2____elements.setName(xContainer__xDevice2____elements_name_prime);
		container__device1____devices.setName(container__device1____devices_name_prime);
		xDeviceToDevice__xDevice1____source.setName(xDeviceToDevice__xDevice1____source_name_prime);
		xCableToCable2__cable2____target.setName(xCableToCable2__cable2____target_name_prime);
		xDevice2__connection2____connections.setName(xDevice2__connection2____connections_name_prime);
		xDeviceToDevice2__xDevice2____source.setName(xDeviceToDevice2__xDevice2____source_name_prime);
		xDeviceToDevice2__device2____target.setName(xDeviceToDevice2__device2____target_name_prime);
		xCableToCable2__xCable____source.setName(xCableToCable2__xCable____source_name_prime);
		cable2__device1____target.setName(cable2__device1____target_name_prime);
		device1__cable2____incoming.setName(device1__cable2____incoming_name_prime);
		xDevice1__connection1____connections.setName(xDevice1__connection1____connections_name_prime);
		xContainer__xCable____elements.setName(xContainer__xCable____elements_name_prime);
		xCableToCable1__cable1____target.setName(xCableToCable1__cable1____target_name_prime);
		cable1__device2____target.setName(cable1__device2____target_name_prime);
		device2__cable1____incoming.setName(device2__cable1____incoming_name_prime);
		xDeviceToDevice__device1____target.setName(xDeviceToDevice__device1____target_name_prime);
		xCableToCable1__xCable____source.setName(xCableToCable1__xCable____source_name_prime);
		cable1__device1____source.setName(cable1__device1____source_name_prime);
		device1__cable1____outgoing.setName(device1__cable1____outgoing_name_prime);
		xContainer__xDevice1____elements.setName(xContainer__xDevice1____elements_name_prime);
		container__cable2____cables.setName(container__cable2____cables_name_prime);
		container__cable1____cables.setName(container__cable1____cables_name_prime);
		return new Object[] { container, connection2, xDeviceToDevice2, xCable, xDevice1, cable2, xContainer,
				connection1, xDeviceToDevice, xCableToCable2, xDevice2, device2, cableAttributes, cable1,
				xCableToCable1, device1, isApplicableMatch, xCable__cableAttributes____cableAttributes,
				container__device2____devices, cable2__device2____source, device2__cable2____outgoing,
				xContainer__xDevice2____elements, container__device1____devices, xDeviceToDevice__xDevice1____source,
				xCableToCable2__cable2____target, xDevice2__connection2____connections,
				xDeviceToDevice2__xDevice2____source, xDeviceToDevice2__device2____target,
				xCableToCable2__xCable____source, cable2__device1____target, device1__cable2____incoming,
				xDevice1__connection1____connections, xContainer__xCable____elements, xCableToCable1__cable1____target,
				cable1__device2____target, device2__cable1____incoming, xDeviceToDevice__device1____target,
				xCableToCable1__xCable____source, cable1__device1____source, device1__cable1____outgoing,
				xContainer__xDevice1____elements, container__cable2____cables, container__cable1____cables };
	}

	public static final Object[] pattern_XDuplexConnectionToConnectionRule_12_4_solveCSP_bindingFBBBBBBBBBBBBBBBBBB(
			XDuplexConnectionToConnectionRule _this, IsApplicableMatch isApplicableMatch, Container container,
			Connections connection2, XDeviceToDevice xDeviceToDevice2, XCable xCable, XDevice xDevice1, Cable cable2,
			XContainer xContainer, Connections connection1, XDeviceToDevice xDeviceToDevice,
			XCableToCable xCableToCable2, XDevice xDevice2, Device device2, CableAttributes cableAttributes,
			Cable cable1, XCableToCable xCableToCable1, Device device1) {
		CSP _localVariable_0 = _this.isApplicable_solveCsp_BWD(isApplicableMatch, container, connection2,
				xDeviceToDevice2, xCable, xDevice1, cable2, xContainer, connection1, xDeviceToDevice, xCableToCable2,
				xDevice2, device2, cableAttributes, cable1, xCableToCable1, device1);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, container, connection2, xDeviceToDevice2, xCable,
					xDevice1, cable2, xContainer, connection1, xDeviceToDevice, xCableToCable2, xDevice2, device2,
					cableAttributes, cable1, xCableToCable1, device1 };
		}
		return null;
	}

	public static final Object[] pattern_XDuplexConnectionToConnectionRule_12_4_solveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_XDuplexConnectionToConnectionRule_12_4_solveCSP_bindingAndBlackFBBBBBBBBBBBBBBBBBB(
			XDuplexConnectionToConnectionRule _this, IsApplicableMatch isApplicableMatch, Container container,
			Connections connection2, XDeviceToDevice xDeviceToDevice2, XCable xCable, XDevice xDevice1, Cable cable2,
			XContainer xContainer, Connections connection1, XDeviceToDevice xDeviceToDevice,
			XCableToCable xCableToCable2, XDevice xDevice2, Device device2, CableAttributes cableAttributes,
			Cable cable1, XCableToCable xCableToCable1, Device device1) {
		Object[] result_pattern_XDuplexConnectionToConnectionRule_12_4_solveCSP_binding = pattern_XDuplexConnectionToConnectionRule_12_4_solveCSP_bindingFBBBBBBBBBBBBBBBBBB(
				_this, isApplicableMatch, container, connection2, xDeviceToDevice2, xCable, xDevice1, cable2,
				xContainer, connection1, xDeviceToDevice, xCableToCable2, xDevice2, device2, cableAttributes, cable1,
				xCableToCable1, device1);
		if (result_pattern_XDuplexConnectionToConnectionRule_12_4_solveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_XDuplexConnectionToConnectionRule_12_4_solveCSP_binding[0];

			Object[] result_pattern_XDuplexConnectionToConnectionRule_12_4_solveCSP_black = pattern_XDuplexConnectionToConnectionRule_12_4_solveCSP_blackB(
					csp);
			if (result_pattern_XDuplexConnectionToConnectionRule_12_4_solveCSP_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, container, connection2, xDeviceToDevice2, xCable,
						xDevice1, cable2, xContainer, connection1, xDeviceToDevice, xCableToCable2, xDevice2, device2,
						cableAttributes, cable1, xCableToCable1, device1 };
			}
		}
		return null;
	}

	public static final boolean pattern_XDuplexConnectionToConnectionRule_12_5_checkCSP_expressionFBB(
			XDuplexConnectionToConnectionRule _this, CSP csp) {
		boolean _localVariable_0 = _this.isApplicable_checkCsp_BWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_XDuplexConnectionToConnectionRule_12_6_addmatchtoruleresult_blackBB(
			IsApplicableRuleResult ruleresult, IsApplicableMatch isApplicableMatch) {
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final Object[] pattern_XDuplexConnectionToConnectionRule_12_6_addmatchtoruleresult_greenBB(
			IsApplicableRuleResult ruleresult, IsApplicableMatch isApplicableMatch) {
		ruleresult.getIsApplicableMatch().add(isApplicableMatch);
		boolean ruleresult_success_prime = Boolean.valueOf(true);
		String isApplicableMatch_ruleName_prime = "XDuplexConnectionToConnectionRule";
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		isApplicableMatch.setRuleName(isApplicableMatch_ruleName_prime);
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final IsApplicableRuleResult pattern_XDuplexConnectionToConnectionRule_12_7_expressionFB(
			IsApplicableRuleResult ruleresult) {
		IsApplicableRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_XDuplexConnectionToConnectionRule_20_1_preparereturnvalue_bindingFB(
			XDuplexConnectionToConnectionRule _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_XDuplexConnectionToConnectionRule_20_1_preparereturnvalue_blackFBBF(
			EClass __eClass, XDuplexConnectionToConnectionRule _this) {
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

	public static final Object[] pattern_XDuplexConnectionToConnectionRule_20_1_preparereturnvalue_bindingAndBlackFFBF(
			XDuplexConnectionToConnectionRule _this) {
		Object[] result_pattern_XDuplexConnectionToConnectionRule_20_1_preparereturnvalue_binding = pattern_XDuplexConnectionToConnectionRule_20_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_XDuplexConnectionToConnectionRule_20_1_preparereturnvalue_binding != null) {
			EClass __eClass = (EClass) result_pattern_XDuplexConnectionToConnectionRule_20_1_preparereturnvalue_binding[0];

			Object[] result_pattern_XDuplexConnectionToConnectionRule_20_1_preparereturnvalue_black = pattern_XDuplexConnectionToConnectionRule_20_1_preparereturnvalue_blackFBBF(
					__eClass, _this);
			if (result_pattern_XDuplexConnectionToConnectionRule_20_1_preparereturnvalue_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_XDuplexConnectionToConnectionRule_20_1_preparereturnvalue_black[0];
				EOperation isApplicableCC = (EOperation) result_pattern_XDuplexConnectionToConnectionRule_20_1_preparereturnvalue_black[3];

				return new Object[] { __performOperation, __eClass, _this, isApplicableCC };
			}
		}
		return null;
	}

	public static final Object[] pattern_XDuplexConnectionToConnectionRule_20_1_preparereturnvalue_greenF() {
		EObjectContainer __result = RuntimeFactory.eINSTANCE.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Iterable<Object[]> pattern_XDuplexConnectionToConnectionRule_20_2_testcorematchandDECs_blackFFFFFB(
			EMoflonEdge _edge_source) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		EObject tmpCable2 = _edge_source.getSrc();
		if (tmpCable2 instanceof Cable) {
			Cable cable2 = (Cable) tmpCable2;
			EObject tmpDevice2 = _edge_source.getTrg();
			if (tmpDevice2 instanceof Device) {
				Device device2 = (Device) tmpDevice2;
				if (device2.equals(cable2.getSource())) {
					Device device1 = cable2.getTarget();
					if (device1 != null) {
						if (!device1.equals(device2)) {
							for (Cable cable1 : device2.getIncoming()) {
								if (!cable1.equals(cable2)) {
									if (device1.equals(cable1.getSource())) {
										for (Container container : org.moflon.core.utilities.eMoflonEMFUtil
												.getOppositeReferenceTyped(cable2, Container.class, "cables")) {
											if (container.getDevices().contains(device2)) {
												if (container.getDevices().contains(device1)) {
													if (container.getCables().contains(cable1)) {
														_result.add(new Object[] { container, cable2, device2, cable1,
																device1, _edge_source });
													}
												}
											}
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

	public static final Object[] pattern_XDuplexConnectionToConnectionRule_20_2_testcorematchandDECs_greenFB(
			EClass __eClass) {
		Match match = RuntimeFactory.eINSTANCE.createMatch();
		String __eClass_name = __eClass.getName();
		String match_ruleName_prime = __eClass_name;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_XDuplexConnectionToConnectionRule_20_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBBBBB(
			XDuplexConnectionToConnectionRule _this, Match match, Container container, Cable cable2, Device device2,
			Cable cable1, Device device1) {
		boolean _localVariable_0 = _this.isAppropriate_BWD(match, container, cable2, device2, cable1, device1);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_XDuplexConnectionToConnectionRule_20_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(
			XDuplexConnectionToConnectionRule _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_BWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_XDuplexConnectionToConnectionRule_20_5_Addmatchtoruleresult_blackBBBB(
			Match match, EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		if (!__performOperation.equals(isApplicableCC)) {
			return new Object[] { match, __performOperation, __result, isApplicableCC };
		}
		return null;
	}

	public static final Object[] pattern_XDuplexConnectionToConnectionRule_20_5_Addmatchtoruleresult_greenBBBB(
			Match match, EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		match.setIsApplicableCCOperation(isApplicableCC);
		return new Object[] { match, __performOperation, __result, isApplicableCC };
	}

	public static final EObjectContainer pattern_XDuplexConnectionToConnectionRule_20_6_expressionFB(
			EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_XDuplexConnectionToConnectionRule_21_1_preparereturnvalue_bindingFB(
			XDuplexConnectionToConnectionRule _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_XDuplexConnectionToConnectionRule_21_1_preparereturnvalue_blackFBBF(
			EClass __eClass, XDuplexConnectionToConnectionRule _this) {
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

	public static final Object[] pattern_XDuplexConnectionToConnectionRule_21_1_preparereturnvalue_bindingAndBlackFFBF(
			XDuplexConnectionToConnectionRule _this) {
		Object[] result_pattern_XDuplexConnectionToConnectionRule_21_1_preparereturnvalue_binding = pattern_XDuplexConnectionToConnectionRule_21_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_XDuplexConnectionToConnectionRule_21_1_preparereturnvalue_binding != null) {
			EClass __eClass = (EClass) result_pattern_XDuplexConnectionToConnectionRule_21_1_preparereturnvalue_binding[0];

			Object[] result_pattern_XDuplexConnectionToConnectionRule_21_1_preparereturnvalue_black = pattern_XDuplexConnectionToConnectionRule_21_1_preparereturnvalue_blackFBBF(
					__eClass, _this);
			if (result_pattern_XDuplexConnectionToConnectionRule_21_1_preparereturnvalue_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_XDuplexConnectionToConnectionRule_21_1_preparereturnvalue_black[0];
				EOperation isApplicableCC = (EOperation) result_pattern_XDuplexConnectionToConnectionRule_21_1_preparereturnvalue_black[3];

				return new Object[] { __performOperation, __eClass, _this, isApplicableCC };
			}
		}
		return null;
	}

	public static final Object[] pattern_XDuplexConnectionToConnectionRule_21_1_preparereturnvalue_greenF() {
		EObjectContainer __result = RuntimeFactory.eINSTANCE.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Iterable<Object[]> pattern_XDuplexConnectionToConnectionRule_21_2_testcorematchandDECs_blackFFFFFFFB(
			EMoflonEdge _edge_incoming) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		EObject tmpConnection2 = _edge_incoming.getSrc();
		if (tmpConnection2 instanceof Connections) {
			Connections connection2 = (Connections) tmpConnection2;
			EObject tmpXCable = _edge_incoming.getTrg();
			if (tmpXCable instanceof XCable) {
				XCable xCable = (XCable) tmpXCable;
				if (connection2.getIncoming().contains(xCable)) {
					CableAttributes cableAttributes = xCable.getCableAttributes();
					if (cableAttributes != null) {
						XDevice xDevice2 = cableAttributes.getEndPoint2();
						if (xDevice2 != null) {
							if (connection2.equals(xDevice2.getConnections())) {
								XDevice xDevice1 = cableAttributes.getEndPoint1();
								if (xDevice1 != null) {
									if (!xDevice1.equals(xDevice2)) {
										boolean cableAttributes_isDuplex = cableAttributes.isIsDuplex();
										if (Boolean.valueOf(cableAttributes_isDuplex).equals(Boolean.valueOf(true))) {
											Connections connection1 = xDevice1.getConnections();
											if (connection1 != null) {
												if (!connection1.equals(connection2)) {
													if (connection1.getOutgoing().contains(xCable)) {
														for (XContainer xContainer : org.moflon.core.utilities.eMoflonEMFUtil
																.getOppositeReferenceTyped(xCable, XContainer.class,
																		"elements")) {
															if (xContainer.getElements().contains(xDevice2)) {
																if (xContainer.getElements().contains(xDevice1)) {
																	_result.add(new Object[] { connection2, xCable,
																			xDevice1, xContainer, connection1, xDevice2,
																			cableAttributes, _edge_incoming });
																}
															}
														}
													}
												}
											}

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

	public static final Object[] pattern_XDuplexConnectionToConnectionRule_21_2_testcorematchandDECs_greenFB(
			EClass __eClass) {
		Match match = RuntimeFactory.eINSTANCE.createMatch();
		String __eClass_name = __eClass.getName();
		String match_ruleName_prime = __eClass_name;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_XDuplexConnectionToConnectionRule_21_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBBBBBBB(
			XDuplexConnectionToConnectionRule _this, Match match, Connections connection2, XCable xCable,
			XDevice xDevice1, XContainer xContainer, Connections connection1, XDevice xDevice2,
			CableAttributes cableAttributes) {
		boolean _localVariable_0 = _this.isAppropriate_FWD(match, connection2, xCable, xDevice1, xContainer,
				connection1, xDevice2, cableAttributes);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_XDuplexConnectionToConnectionRule_21_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(
			XDuplexConnectionToConnectionRule _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_FWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_XDuplexConnectionToConnectionRule_21_5_Addmatchtoruleresult_blackBBBB(
			Match match, EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		if (!__performOperation.equals(isApplicableCC)) {
			return new Object[] { match, __performOperation, __result, isApplicableCC };
		}
		return null;
	}

	public static final Object[] pattern_XDuplexConnectionToConnectionRule_21_5_Addmatchtoruleresult_greenBBBB(
			Match match, EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		match.setIsApplicableCCOperation(isApplicableCC);
		return new Object[] { match, __performOperation, __result, isApplicableCC };
	}

	public static final EObjectContainer pattern_XDuplexConnectionToConnectionRule_21_6_expressionFB(
			EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_XDuplexConnectionToConnectionRule_24_1_prepare_blackB(
			XDuplexConnectionToConnectionRule _this) {
		return new Object[] { _this };
	}

	public static final Object[] pattern_XDuplexConnectionToConnectionRule_24_1_prepare_greenF() {
		IsApplicableRuleResult result = RuntimeFactory.eINSTANCE.createIsApplicableRuleResult();
		return new Object[] { result };
	}

	public static final Object[] pattern_XDuplexConnectionToConnectionRule_24_2_matchsrctrgcontext_bindingFFFFFFFFFFFFBB(
			Match targetMatch, Match sourceMatch) {
		EObject _localVariable_0 = targetMatch.getObject("container");
		EObject _localVariable_1 = sourceMatch.getObject("connection2");
		EObject _localVariable_2 = sourceMatch.getObject("xCable");
		EObject _localVariable_3 = sourceMatch.getObject("xDevice1");
		EObject _localVariable_4 = targetMatch.getObject("cable2");
		EObject _localVariable_5 = sourceMatch.getObject("xContainer");
		EObject _localVariable_6 = sourceMatch.getObject("connection1");
		EObject _localVariable_7 = sourceMatch.getObject("xDevice2");
		EObject _localVariable_8 = targetMatch.getObject("device2");
		EObject _localVariable_9 = sourceMatch.getObject("cableAttributes");
		EObject _localVariable_10 = targetMatch.getObject("cable1");
		EObject _localVariable_11 = targetMatch.getObject("device1");
		EObject tmpContainer = _localVariable_0;
		EObject tmpConnection2 = _localVariable_1;
		EObject tmpXCable = _localVariable_2;
		EObject tmpXDevice1 = _localVariable_3;
		EObject tmpCable2 = _localVariable_4;
		EObject tmpXContainer = _localVariable_5;
		EObject tmpConnection1 = _localVariable_6;
		EObject tmpXDevice2 = _localVariable_7;
		EObject tmpDevice2 = _localVariable_8;
		EObject tmpCableAttributes = _localVariable_9;
		EObject tmpCable1 = _localVariable_10;
		EObject tmpDevice1 = _localVariable_11;
		if (tmpContainer instanceof Container) {
			Container container = (Container) tmpContainer;
			if (tmpConnection2 instanceof Connections) {
				Connections connection2 = (Connections) tmpConnection2;
				if (tmpXCable instanceof XCable) {
					XCable xCable = (XCable) tmpXCable;
					if (tmpXDevice1 instanceof XDevice) {
						XDevice xDevice1 = (XDevice) tmpXDevice1;
						if (tmpCable2 instanceof Cable) {
							Cable cable2 = (Cable) tmpCable2;
							if (tmpXContainer instanceof XContainer) {
								XContainer xContainer = (XContainer) tmpXContainer;
								if (tmpConnection1 instanceof Connections) {
									Connections connection1 = (Connections) tmpConnection1;
									if (tmpXDevice2 instanceof XDevice) {
										XDevice xDevice2 = (XDevice) tmpXDevice2;
										if (tmpDevice2 instanceof Device) {
											Device device2 = (Device) tmpDevice2;
											if (tmpCableAttributes instanceof CableAttributes) {
												CableAttributes cableAttributes = (CableAttributes) tmpCableAttributes;
												if (tmpCable1 instanceof Cable) {
													Cable cable1 = (Cable) tmpCable1;
													if (tmpDevice1 instanceof Device) {
														Device device1 = (Device) tmpDevice1;
														return new Object[] { container, connection2, xCable, xDevice1,
																cable2, xContainer, connection1, xDevice2, device2,
																cableAttributes, cable1, device1, targetMatch,
																sourceMatch };
													}
												}
											}
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

	public static final Object[] pattern_XDuplexConnectionToConnectionRule_24_2_matchsrctrgcontext_blackBBBBBBBBBBBBBB(
			Container container, Connections connection2, XCable xCable, XDevice xDevice1, Cable cable2,
			XContainer xContainer, Connections connection1, XDevice xDevice2, Device device2,
			CableAttributes cableAttributes, Cable cable1, Device device1, Match sourceMatch, Match targetMatch) {
		if (!xDevice1.equals(xDevice2)) {
			if (!connection1.equals(connection2)) {
				if (!cable1.equals(cable2)) {
					if (!device1.equals(device2)) {
						if (!sourceMatch.equals(targetMatch)) {
							boolean cableAttributes_isDuplex = cableAttributes.isIsDuplex();
							if (Boolean.valueOf(cableAttributes_isDuplex).equals(Boolean.valueOf(true))) {
								return new Object[] { container, connection2, xCable, xDevice1, cable2, xContainer,
										connection1, xDevice2, device2, cableAttributes, cable1, device1, sourceMatch,
										targetMatch };
							}

						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_XDuplexConnectionToConnectionRule_24_2_matchsrctrgcontext_bindingAndBlackFFFFFFFFFFFFBB(
			Match sourceMatch, Match targetMatch) {
		Object[] result_pattern_XDuplexConnectionToConnectionRule_24_2_matchsrctrgcontext_binding = pattern_XDuplexConnectionToConnectionRule_24_2_matchsrctrgcontext_bindingFFFFFFFFFFFFBB(
				targetMatch, sourceMatch);
		if (result_pattern_XDuplexConnectionToConnectionRule_24_2_matchsrctrgcontext_binding != null) {
			Container container = (Container) result_pattern_XDuplexConnectionToConnectionRule_24_2_matchsrctrgcontext_binding[0];
			Connections connection2 = (Connections) result_pattern_XDuplexConnectionToConnectionRule_24_2_matchsrctrgcontext_binding[1];
			XCable xCable = (XCable) result_pattern_XDuplexConnectionToConnectionRule_24_2_matchsrctrgcontext_binding[2];
			XDevice xDevice1 = (XDevice) result_pattern_XDuplexConnectionToConnectionRule_24_2_matchsrctrgcontext_binding[3];
			Cable cable2 = (Cable) result_pattern_XDuplexConnectionToConnectionRule_24_2_matchsrctrgcontext_binding[4];
			XContainer xContainer = (XContainer) result_pattern_XDuplexConnectionToConnectionRule_24_2_matchsrctrgcontext_binding[5];
			Connections connection1 = (Connections) result_pattern_XDuplexConnectionToConnectionRule_24_2_matchsrctrgcontext_binding[6];
			XDevice xDevice2 = (XDevice) result_pattern_XDuplexConnectionToConnectionRule_24_2_matchsrctrgcontext_binding[7];
			Device device2 = (Device) result_pattern_XDuplexConnectionToConnectionRule_24_2_matchsrctrgcontext_binding[8];
			CableAttributes cableAttributes = (CableAttributes) result_pattern_XDuplexConnectionToConnectionRule_24_2_matchsrctrgcontext_binding[9];
			Cable cable1 = (Cable) result_pattern_XDuplexConnectionToConnectionRule_24_2_matchsrctrgcontext_binding[10];
			Device device1 = (Device) result_pattern_XDuplexConnectionToConnectionRule_24_2_matchsrctrgcontext_binding[11];

			Object[] result_pattern_XDuplexConnectionToConnectionRule_24_2_matchsrctrgcontext_black = pattern_XDuplexConnectionToConnectionRule_24_2_matchsrctrgcontext_blackBBBBBBBBBBBBBB(
					container, connection2, xCable, xDevice1, cable2, xContainer, connection1, xDevice2, device2,
					cableAttributes, cable1, device1, sourceMatch, targetMatch);
			if (result_pattern_XDuplexConnectionToConnectionRule_24_2_matchsrctrgcontext_black != null) {

				return new Object[] { container, connection2, xCable, xDevice1, cable2, xContainer, connection1,
						xDevice2, device2, cableAttributes, cable1, device1, sourceMatch, targetMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_XDuplexConnectionToConnectionRule_24_3_solvecsp_bindingFBBBBBBBBBBBBBBB(
			XDuplexConnectionToConnectionRule _this, Container container, Connections connection2, XCable xCable,
			XDevice xDevice1, Cable cable2, XContainer xContainer, Connections connection1, XDevice xDevice2,
			Device device2, CableAttributes cableAttributes, Cable cable1, Device device1, Match sourceMatch,
			Match targetMatch) {
		CSP _localVariable_12 = _this.isApplicable_solveCsp_CC(container, connection2, xCable, xDevice1, cable2,
				xContainer, connection1, xDevice2, device2, cableAttributes, cable1, device1, sourceMatch, targetMatch);
		CSP csp = _localVariable_12;
		if (csp != null) {
			return new Object[] { csp, _this, container, connection2, xCable, xDevice1, cable2, xContainer, connection1,
					xDevice2, device2, cableAttributes, cable1, device1, sourceMatch, targetMatch };
		}
		return null;
	}

	public static final Object[] pattern_XDuplexConnectionToConnectionRule_24_3_solvecsp_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_XDuplexConnectionToConnectionRule_24_3_solvecsp_bindingAndBlackFBBBBBBBBBBBBBBB(
			XDuplexConnectionToConnectionRule _this, Container container, Connections connection2, XCable xCable,
			XDevice xDevice1, Cable cable2, XContainer xContainer, Connections connection1, XDevice xDevice2,
			Device device2, CableAttributes cableAttributes, Cable cable1, Device device1, Match sourceMatch,
			Match targetMatch) {
		Object[] result_pattern_XDuplexConnectionToConnectionRule_24_3_solvecsp_binding = pattern_XDuplexConnectionToConnectionRule_24_3_solvecsp_bindingFBBBBBBBBBBBBBBB(
				_this, container, connection2, xCable, xDevice1, cable2, xContainer, connection1, xDevice2, device2,
				cableAttributes, cable1, device1, sourceMatch, targetMatch);
		if (result_pattern_XDuplexConnectionToConnectionRule_24_3_solvecsp_binding != null) {
			CSP csp = (CSP) result_pattern_XDuplexConnectionToConnectionRule_24_3_solvecsp_binding[0];

			Object[] result_pattern_XDuplexConnectionToConnectionRule_24_3_solvecsp_black = pattern_XDuplexConnectionToConnectionRule_24_3_solvecsp_blackB(
					csp);
			if (result_pattern_XDuplexConnectionToConnectionRule_24_3_solvecsp_black != null) {

				return new Object[] { csp, _this, container, connection2, xCable, xDevice1, cable2, xContainer,
						connection1, xDevice2, device2, cableAttributes, cable1, device1, sourceMatch, targetMatch };
			}
		}
		return null;
	}

	public static final boolean pattern_XDuplexConnectionToConnectionRule_24_4_checkCSP_expressionFB(CSP csp) {
		boolean _localVariable_0 = csp.check();
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Iterable<Object[]> pattern_XDuplexConnectionToConnectionRule_24_5_matchcorrcontext_blackFBBBFFBBBFBBB(
			XCable xCable, XDevice xDevice1, Cable cable2, XDevice xDevice2, Device device2, Cable cable1,
			Device device1, Match sourceMatch, Match targetMatch) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (!xDevice1.equals(xDevice2)) {
			if (!cable1.equals(cable2)) {
				if (!device1.equals(device2)) {
					if (!sourceMatch.equals(targetMatch)) {
						for (XDeviceToDevice xDeviceToDevice : org.moflon.core.utilities.eMoflonEMFUtil
								.getOppositeReferenceTyped(xDevice1, XDeviceToDevice.class, "source")) {
							if (device1.equals(xDeviceToDevice.getTarget())) {
								for (XCableToCable xCableToCable2 : org.moflon.core.utilities.eMoflonEMFUtil
										.getOppositeReferenceTyped(cable2, XCableToCable.class, "target")) {
									if (xCable.equals(xCableToCable2.getSource())) {
										for (XDeviceToDevice xDeviceToDevice2 : org.moflon.core.utilities.eMoflonEMFUtil
												.getOppositeReferenceTyped(xDevice2, XDeviceToDevice.class, "source")) {
											if (!xDeviceToDevice.equals(xDeviceToDevice2)) {
												if (device2.equals(xDeviceToDevice2.getTarget())) {
													for (XCableToCable xCableToCable1 : org.moflon.core.utilities.eMoflonEMFUtil
															.getOppositeReferenceTyped(cable1, XCableToCable.class,
																	"target")) {
														if (!xCableToCable1.equals(xCableToCable2)) {
															if (xCable.equals(xCableToCable1.getSource())) {
																_result.add(new Object[] { xDeviceToDevice2, xCable,
																		xDevice1, cable2, xDeviceToDevice,
																		xCableToCable2, xDevice2, device2, cable1,
																		xCableToCable1, device1, sourceMatch,
																		targetMatch });
															}
														}
													}
												}
											}
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

	public static final Object[] pattern_XDuplexConnectionToConnectionRule_24_5_matchcorrcontext_greenBBBBBBF(
			XDeviceToDevice xDeviceToDevice2, XDeviceToDevice xDeviceToDevice, XCableToCable xCableToCable2,
			XCableToCable xCableToCable1, Match sourceMatch, Match targetMatch) {
		CCMatch ccMatch = RuntimeFactory.eINSTANCE.createCCMatch();
		String ccMatch_ruleName_prime = "XDuplexConnectionToConnectionRule";
		ccMatch.setSourceMatch(sourceMatch);
		ccMatch.setTargetMatch(targetMatch);
		ccMatch.getAllContextElements().add(xDeviceToDevice2);
		ccMatch.getAllContextElements().add(xDeviceToDevice);
		ccMatch.getAllContextElements().add(xCableToCable2);
		ccMatch.getAllContextElements().add(xCableToCable1);
		ccMatch.setRuleName(ccMatch_ruleName_prime);
		return new Object[] { xDeviceToDevice2, xDeviceToDevice, xCableToCable2, xCableToCable1, sourceMatch,
				targetMatch, ccMatch };
	}

	public static final Object[] pattern_XDuplexConnectionToConnectionRule_24_6_createcorrespondence_blackBBBBBBBBBBBBB(
			Container container, Connections connection2, XCable xCable, XDevice xDevice1, Cable cable2,
			XContainer xContainer, Connections connection1, XDevice xDevice2, Device device2,
			CableAttributes cableAttributes, Cable cable1, Device device1, CCMatch ccMatch) {
		if (!xDevice1.equals(xDevice2)) {
			if (!connection1.equals(connection2)) {
				if (!cable1.equals(cable2)) {
					if (!device1.equals(device2)) {
						return new Object[] { container, connection2, xCable, xDevice1, cable2, xContainer, connection1,
								xDevice2, device2, cableAttributes, cable1, device1, ccMatch };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_XDuplexConnectionToConnectionRule_24_7_addtoreturnedresult_blackBB(
			IsApplicableRuleResult result, CCMatch ccMatch) {
		return new Object[] { result, ccMatch };
	}

	public static final Object[] pattern_XDuplexConnectionToConnectionRule_24_7_addtoreturnedresult_greenBB(
			IsApplicableRuleResult result, CCMatch ccMatch) {
		result.getIsApplicableMatch().add(ccMatch);
		boolean result_success_prime = Boolean.valueOf(true);
		String ccMatch_ruleName_prime = "XDuplexConnectionToConnectionRule";
		result.setSuccess(Boolean.valueOf(result_success_prime));
		ccMatch.setRuleName(ccMatch_ruleName_prime);
		return new Object[] { result, ccMatch };
	}

	public static final IsApplicableRuleResult pattern_XDuplexConnectionToConnectionRule_24_8_expressionFB(
			IsApplicableRuleResult result) {
		IsApplicableRuleResult _result = result;
		return _result;
	}

	public static final Object[] pattern_XDuplexConnectionToConnectionRule_27_1_matchtggpattern_blackBBBBBBB(
			Connections connection2, XCable xCable, XDevice xDevice1, XContainer xContainer, Connections connection1,
			XDevice xDevice2, CableAttributes cableAttributes) {
		if (!xDevice1.equals(xDevice2)) {
			if (!connection1.equals(connection2)) {
				if (connection2.getIncoming().contains(xCable)) {
					if (cableAttributes.equals(xCable.getCableAttributes())) {
						if (xContainer.getElements().contains(xDevice2)) {
							if (connection1.getOutgoing().contains(xCable)) {
								if (connection2.equals(xDevice2.getConnections())) {
									if (connection1.equals(xDevice1.getConnections())) {
										if (xDevice2.equals(cableAttributes.getEndPoint2())) {
											if (xDevice1.equals(cableAttributes.getEndPoint1())) {
												if (xContainer.getElements().contains(xCable)) {
													if (xContainer.getElements().contains(xDevice1)) {
														return new Object[] { connection2, xCable, xDevice1, xContainer,
																connection1, xDevice2, cableAttributes };
													}
												}
											}
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

	public static final Object[] pattern_XDuplexConnectionToConnectionRule_27_1_matchtggpattern_greenB(
			CableAttributes cableAttributes) {
		boolean cableAttributes_isDuplex_prime = Boolean.valueOf(true);
		cableAttributes.setIsDuplex(Boolean.valueOf(cableAttributes_isDuplex_prime));
		return new Object[] { cableAttributes };
	}

	public static final boolean pattern_XDuplexConnectionToConnectionRule_27_2_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_XDuplexConnectionToConnectionRule_27_3_expressionF() {
		boolean _result = Boolean.valueOf(false);
		return _result;
	}

	public static final Object[] pattern_XDuplexConnectionToConnectionRule_28_1_matchtggpattern_blackBBBBB(
			Container container, Cable cable2, Device device2, Cable cable1, Device device1) {
		if (!cable1.equals(cable2)) {
			if (!device1.equals(device2)) {
				if (container.getDevices().contains(device2)) {
					if (device2.equals(cable2.getSource())) {
						if (container.getDevices().contains(device1)) {
							if (device1.equals(cable2.getTarget())) {
								if (device2.equals(cable1.getTarget())) {
									if (device1.equals(cable1.getSource())) {
										if (container.getCables().contains(cable2)) {
											if (container.getCables().contains(cable1)) {
												return new Object[] { container, cable2, device2, cable1, device1 };
											}
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

	public static final boolean pattern_XDuplexConnectionToConnectionRule_28_2_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_XDuplexConnectionToConnectionRule_28_3_expressionF() {
		boolean _result = Boolean.valueOf(false);
		return _result;
	}

	public static final Object[] pattern_XDuplexConnectionToConnectionRule_29_1_createresult_blackB(
			XDuplexConnectionToConnectionRule _this) {
		return new Object[] { _this };
	}

	public static final Object[] pattern_XDuplexConnectionToConnectionRule_29_1_createresult_greenFF() {
		IsApplicableMatch isApplicableMatch = RuntimeFactory.eINSTANCE.createIsApplicableMatch();
		ModelgeneratorRuleResult ruleResult = RuntimeFactory.eINSTANCE.createModelgeneratorRuleResult();
		boolean ruleResult_success_prime = Boolean.valueOf(false);
		ruleResult.setSuccess(Boolean.valueOf(ruleResult_success_prime));
		return new Object[] { isApplicableMatch, ruleResult };
	}

	public static final Object[] pattern_XDuplexConnectionToConnectionRule_29_2_isapplicablecore_black_nac_0BB(
			ModelgeneratorRuleResult ruleResult, Container container) {
		if (ruleResult.getTargetObjects().contains(container)) {
			return new Object[] { ruleResult, container };
		}
		return null;
	}

	public static final Object[] pattern_XDuplexConnectionToConnectionRule_29_2_isapplicablecore_black_nac_1BB(
			ModelgeneratorRuleResult ruleResult, Device device2) {
		if (ruleResult.getTargetObjects().contains(device2)) {
			return new Object[] { ruleResult, device2 };
		}
		return null;
	}

	public static final Object[] pattern_XDuplexConnectionToConnectionRule_29_2_isapplicablecore_black_nac_2BB(
			ModelgeneratorRuleResult ruleResult, XDeviceToDevice xDeviceToDevice2) {
		if (ruleResult.getCorrObjects().contains(xDeviceToDevice2)) {
			return new Object[] { ruleResult, xDeviceToDevice2 };
		}
		return null;
	}

	public static final Object[] pattern_XDuplexConnectionToConnectionRule_29_2_isapplicablecore_black_nac_3BB(
			ModelgeneratorRuleResult ruleResult, XDevice xDevice2) {
		if (ruleResult.getSourceObjects().contains(xDevice2)) {
			return new Object[] { ruleResult, xDevice2 };
		}
		return null;
	}

	public static final Object[] pattern_XDuplexConnectionToConnectionRule_29_2_isapplicablecore_black_nac_4BB(
			ModelgeneratorRuleResult ruleResult, Connections connection2) {
		if (ruleResult.getSourceObjects().contains(connection2)) {
			return new Object[] { ruleResult, connection2 };
		}
		return null;
	}

	public static final Object[] pattern_XDuplexConnectionToConnectionRule_29_2_isapplicablecore_black_nac_5BB(
			ModelgeneratorRuleResult ruleResult, XContainer xContainer) {
		if (ruleResult.getSourceObjects().contains(xContainer)) {
			return new Object[] { ruleResult, xContainer };
		}
		return null;
	}

	public static final Object[] pattern_XDuplexConnectionToConnectionRule_29_2_isapplicablecore_black_nac_6BB(
			ModelgeneratorRuleResult ruleResult, XCable xCable) {
		if (ruleResult.getSourceObjects().contains(xCable)) {
			return new Object[] { ruleResult, xCable };
		}
		return null;
	}

	public static final Object[] pattern_XDuplexConnectionToConnectionRule_29_2_isapplicablecore_black_nac_7BB(
			ModelgeneratorRuleResult ruleResult, CableAttributes cableAttributes) {
		if (ruleResult.getSourceObjects().contains(cableAttributes)) {
			return new Object[] { ruleResult, cableAttributes };
		}
		return null;
	}

	public static final Object[] pattern_XDuplexConnectionToConnectionRule_29_2_isapplicablecore_black_nac_8BB(
			ModelgeneratorRuleResult ruleResult, XCableToCable xCableToCable2) {
		if (ruleResult.getCorrObjects().contains(xCableToCable2)) {
			return new Object[] { ruleResult, xCableToCable2 };
		}
		return null;
	}

	public static final Object[] pattern_XDuplexConnectionToConnectionRule_29_2_isapplicablecore_black_nac_9BB(
			ModelgeneratorRuleResult ruleResult, Cable cable2) {
		if (ruleResult.getTargetObjects().contains(cable2)) {
			return new Object[] { ruleResult, cable2 };
		}
		return null;
	}

	public static final Object[] pattern_XDuplexConnectionToConnectionRule_29_2_isapplicablecore_black_nac_10BB(
			ModelgeneratorRuleResult ruleResult, XCableToCable xCableToCable1) {
		if (ruleResult.getCorrObjects().contains(xCableToCable1)) {
			return new Object[] { ruleResult, xCableToCable1 };
		}
		return null;
	}

	public static final Object[] pattern_XDuplexConnectionToConnectionRule_29_2_isapplicablecore_black_nac_11BB(
			ModelgeneratorRuleResult ruleResult, Cable cable1) {
		if (ruleResult.getTargetObjects().contains(cable1)) {
			return new Object[] { ruleResult, cable1 };
		}
		return null;
	}

	public static final Object[] pattern_XDuplexConnectionToConnectionRule_29_2_isapplicablecore_black_nac_12BB(
			ModelgeneratorRuleResult ruleResult, XDevice xDevice1) {
		if (ruleResult.getSourceObjects().contains(xDevice1)) {
			return new Object[] { ruleResult, xDevice1 };
		}
		return null;
	}

	public static final Object[] pattern_XDuplexConnectionToConnectionRule_29_2_isapplicablecore_black_nac_13BB(
			ModelgeneratorRuleResult ruleResult, Connections connection1) {
		if (ruleResult.getSourceObjects().contains(connection1)) {
			return new Object[] { ruleResult, connection1 };
		}
		return null;
	}

	public static final Object[] pattern_XDuplexConnectionToConnectionRule_29_2_isapplicablecore_black_nac_14BB(
			ModelgeneratorRuleResult ruleResult, XDeviceToDevice xDeviceToDevice) {
		if (ruleResult.getCorrObjects().contains(xDeviceToDevice)) {
			return new Object[] { ruleResult, xDeviceToDevice };
		}
		return null;
	}

	public static final Object[] pattern_XDuplexConnectionToConnectionRule_29_2_isapplicablecore_black_nac_15BB(
			ModelgeneratorRuleResult ruleResult, Device device1) {
		if (ruleResult.getTargetObjects().contains(device1)) {
			return new Object[] { ruleResult, device1 };
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_XDuplexConnectionToConnectionRule_29_2_isapplicablecore_blackFFFFFFFFFFFFFFFFFBB(
			RuleEntryContainer ruleEntryContainer, ModelgeneratorRuleResult ruleResult) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		for (RuleEntryList xDeviceToDevice2List : ruleEntryContainer.getRuleEntryList()) {
			for (EObject tmpXDeviceToDevice2 : xDeviceToDevice2List.getEntryObjects()) {
				if (tmpXDeviceToDevice2 instanceof XDeviceToDevice) {
					XDeviceToDevice xDeviceToDevice2 = (XDeviceToDevice) tmpXDeviceToDevice2;
					Device device2 = xDeviceToDevice2.getTarget();
					if (device2 != null) {
						XDevice xDevice2 = xDeviceToDevice2.getSource();
						if (xDevice2 != null) {
							Connections connection2 = xDevice2.getConnections();
							if (connection2 != null) {
								if (pattern_XDuplexConnectionToConnectionRule_29_2_isapplicablecore_black_nac_2BB(
										ruleResult, xDeviceToDevice2) == null) {
									if (pattern_XDuplexConnectionToConnectionRule_29_2_isapplicablecore_black_nac_1BB(
											ruleResult, device2) == null) {
										if (pattern_XDuplexConnectionToConnectionRule_29_2_isapplicablecore_black_nac_3BB(
												ruleResult, xDevice2) == null) {
											if (pattern_XDuplexConnectionToConnectionRule_29_2_isapplicablecore_black_nac_4BB(
													ruleResult, connection2) == null) {
												for (Container container : org.moflon.core.utilities.eMoflonEMFUtil
														.getOppositeReferenceTyped(device2, Container.class,
																"devices")) {
													if (pattern_XDuplexConnectionToConnectionRule_29_2_isapplicablecore_black_nac_0BB(
															ruleResult, container) == null) {
														for (Cable cable2 : container.getCables()) {
															if (pattern_XDuplexConnectionToConnectionRule_29_2_isapplicablecore_black_nac_9BB(
																	ruleResult, cable2) == null) {
																for (Cable cable1 : container.getCables()) {
																	if (!cable1.equals(cable2)) {
																		if (pattern_XDuplexConnectionToConnectionRule_29_2_isapplicablecore_black_nac_11BB(
																				ruleResult, cable1) == null) {
																			for (Device device1 : container
																					.getDevices()) {
																				if (!device1.equals(device2)) {
																					if (pattern_XDuplexConnectionToConnectionRule_29_2_isapplicablecore_black_nac_15BB(
																							ruleResult,
																							device1) == null) {
																						for (XContainer xContainer : org.moflon.core.utilities.eMoflonEMFUtil
																								.getOppositeReferenceTyped(
																										xDevice2,
																										XContainer.class,
																										"elements")) {
																							if (pattern_XDuplexConnectionToConnectionRule_29_2_isapplicablecore_black_nac_5BB(
																									ruleResult,
																									xContainer) == null) {
																								for (NetworkElements tmpXCable : xContainer
																										.getElements()) {
																									if (tmpXCable instanceof XCable) {
																										XCable xCable = (XCable) tmpXCable;
																										CableAttributes cableAttributes = xCable
																												.getCableAttributes();
																										if (cableAttributes != null) {
																											if (pattern_XDuplexConnectionToConnectionRule_29_2_isapplicablecore_black_nac_6BB(
																													ruleResult,
																													xCable) == null) {
																												if (pattern_XDuplexConnectionToConnectionRule_29_2_isapplicablecore_black_nac_7BB(
																														ruleResult,
																														cableAttributes) == null) {
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
																																		if (pattern_XDuplexConnectionToConnectionRule_29_2_isapplicablecore_black_nac_12BB(
																																				ruleResult,
																																				xDevice1) == null) {
																																			if (pattern_XDuplexConnectionToConnectionRule_29_2_isapplicablecore_black_nac_13BB(
																																					ruleResult,
																																					connection1) == null) {
																																				for (XCableToCable xCableToCable2 : org.moflon.core.utilities.eMoflonEMFUtil
																																						.getOppositeReferenceTyped(
																																								cable2,
																																								XCableToCable.class,
																																								"target")) {
																																					if (xCable
																																							.equals(xCableToCable2
																																									.getSource())) {
																																						if (pattern_XDuplexConnectionToConnectionRule_29_2_isapplicablecore_black_nac_8BB(
																																								ruleResult,
																																								xCableToCable2) == null) {
																																							for (XCableToCable xCableToCable1 : org.moflon.core.utilities.eMoflonEMFUtil
																																									.getOppositeReferenceTyped(
																																											cable1,
																																											XCableToCable.class,
																																											"target")) {
																																								if (!xCableToCable1
																																										.equals(xCableToCable2)) {
																																									if (xCable
																																											.equals(xCableToCable1
																																													.getSource())) {
																																										if (pattern_XDuplexConnectionToConnectionRule_29_2_isapplicablecore_black_nac_10BB(
																																												ruleResult,
																																												xCableToCable1) == null) {
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
																																														if (pattern_XDuplexConnectionToConnectionRule_29_2_isapplicablecore_black_nac_14BB(
																																																ruleResult,
																																																xDeviceToDevice) == null) {
																																															_result.add(
																																																	new Object[] {
																																																			xDeviceToDevice2List,
																																																			container,
																																																			device2,
																																																			xDeviceToDevice2,
																																																			xDevice2,
																																																			connection2,
																																																			xContainer,
																																																			xCable,
																																																			cableAttributes,
																																																			xCableToCable2,
																																																			cable2,
																																																			xCableToCable1,
																																																			cable1,
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
								}
							}

						}

					}

				}
			}
		}
		return _result;
	}

	public static final Object[] pattern_XDuplexConnectionToConnectionRule_29_2_isapplicablecore_greenB(
			CableAttributes cableAttributes) {
		boolean cableAttributes_isDuplex_prime = Boolean.valueOf(true);
		cableAttributes.setIsDuplex(Boolean.valueOf(cableAttributes_isDuplex_prime));
		return new Object[] { cableAttributes };
	}

	public static final Object[] pattern_XDuplexConnectionToConnectionRule_29_3_solveCSP_bindingFBBBBBBBBBBBBBBBBBBB(
			XDuplexConnectionToConnectionRule _this, IsApplicableMatch isApplicableMatch, Container container,
			Connections connection2, XDeviceToDevice xDeviceToDevice2, XCable xCable, XDevice xDevice1, Cable cable2,
			XContainer xContainer, Connections connection1, XDeviceToDevice xDeviceToDevice,
			XCableToCable xCableToCable2, XDevice xDevice2, Device device2, CableAttributes cableAttributes,
			Cable cable1, XCableToCable xCableToCable1, Device device1, ModelgeneratorRuleResult ruleResult) {
		CSP _localVariable_0 = _this.generateModel_solveCsp_BWD(isApplicableMatch, container, connection2,
				xDeviceToDevice2, xCable, xDevice1, cable2, xContainer, connection1, xDeviceToDevice, xCableToCable2,
				xDevice2, device2, cableAttributes, cable1, xCableToCable1, device1, ruleResult);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, container, connection2, xDeviceToDevice2, xCable,
					xDevice1, cable2, xContainer, connection1, xDeviceToDevice, xCableToCable2, xDevice2, device2,
					cableAttributes, cable1, xCableToCable1, device1, ruleResult };
		}
		return null;
	}

	public static final Object[] pattern_XDuplexConnectionToConnectionRule_29_3_solveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_XDuplexConnectionToConnectionRule_29_3_solveCSP_bindingAndBlackFBBBBBBBBBBBBBBBBBBB(
			XDuplexConnectionToConnectionRule _this, IsApplicableMatch isApplicableMatch, Container container,
			Connections connection2, XDeviceToDevice xDeviceToDevice2, XCable xCable, XDevice xDevice1, Cable cable2,
			XContainer xContainer, Connections connection1, XDeviceToDevice xDeviceToDevice,
			XCableToCable xCableToCable2, XDevice xDevice2, Device device2, CableAttributes cableAttributes,
			Cable cable1, XCableToCable xCableToCable1, Device device1, ModelgeneratorRuleResult ruleResult) {
		Object[] result_pattern_XDuplexConnectionToConnectionRule_29_3_solveCSP_binding = pattern_XDuplexConnectionToConnectionRule_29_3_solveCSP_bindingFBBBBBBBBBBBBBBBBBBB(
				_this, isApplicableMatch, container, connection2, xDeviceToDevice2, xCable, xDevice1, cable2,
				xContainer, connection1, xDeviceToDevice, xCableToCable2, xDevice2, device2, cableAttributes, cable1,
				xCableToCable1, device1, ruleResult);
		if (result_pattern_XDuplexConnectionToConnectionRule_29_3_solveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_XDuplexConnectionToConnectionRule_29_3_solveCSP_binding[0];

			Object[] result_pattern_XDuplexConnectionToConnectionRule_29_3_solveCSP_black = pattern_XDuplexConnectionToConnectionRule_29_3_solveCSP_blackB(
					csp);
			if (result_pattern_XDuplexConnectionToConnectionRule_29_3_solveCSP_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, container, connection2, xDeviceToDevice2, xCable,
						xDevice1, cable2, xContainer, connection1, xDeviceToDevice, xCableToCable2, xDevice2, device2,
						cableAttributes, cable1, xCableToCable1, device1, ruleResult };
			}
		}
		return null;
	}

	public static final boolean pattern_XDuplexConnectionToConnectionRule_29_4_checkCSP_expressionFBB(
			XDuplexConnectionToConnectionRule _this, CSP csp) {
		boolean _localVariable_0 = _this.generateModel_checkCsp_BWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_XDuplexConnectionToConnectionRule_29_5_checknacs_blackBBBBBBBBBBBBBBBB(
			Container container, Connections connection2, XDeviceToDevice xDeviceToDevice2, XCable xCable,
			XDevice xDevice1, Cable cable2, XContainer xContainer, Connections connection1,
			XDeviceToDevice xDeviceToDevice, XCableToCable xCableToCable2, XDevice xDevice2, Device device2,
			CableAttributes cableAttributes, Cable cable1, XCableToCable xCableToCable1, Device device1) {
		if (!xDevice1.equals(xDevice2)) {
			if (!connection1.equals(connection2)) {
				if (!xDeviceToDevice.equals(xDeviceToDevice2)) {
					if (!cable1.equals(cable2)) {
						if (!xCableToCable1.equals(xCableToCable2)) {
							if (!device1.equals(device2)) {
								return new Object[] { container, connection2, xDeviceToDevice2, xCable, xDevice1,
										cable2, xContainer, connection1, xDeviceToDevice, xCableToCable2, xDevice2,
										device2, cableAttributes, cable1, xCableToCable1, device1 };
							}
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_XDuplexConnectionToConnectionRule_29_5_checknacs_greenB(
			CableAttributes cableAttributes) {
		boolean cableAttributes_isDuplex_prime = Boolean.valueOf(true);
		cableAttributes.setIsDuplex(Boolean.valueOf(cableAttributes_isDuplex_prime));
		return new Object[] { cableAttributes };
	}

	public static final Object[] pattern_XDuplexConnectionToConnectionRule_29_6_perform_blackBBBBBBBBBBBBBBBBB(
			Container container, Connections connection2, XDeviceToDevice xDeviceToDevice2, XCable xCable,
			XDevice xDevice1, Cable cable2, XContainer xContainer, Connections connection1,
			XDeviceToDevice xDeviceToDevice, XCableToCable xCableToCable2, XDevice xDevice2, Device device2,
			CableAttributes cableAttributes, Cable cable1, XCableToCable xCableToCable1, Device device1,
			ModelgeneratorRuleResult ruleResult) {
		if (!xDevice1.equals(xDevice2)) {
			if (!connection1.equals(connection2)) {
				if (!xDeviceToDevice.equals(xDeviceToDevice2)) {
					if (!cable1.equals(cable2)) {
						if (!xCableToCable1.equals(xCableToCable2)) {
							if (!device1.equals(device2)) {
								return new Object[] { container, connection2, xDeviceToDevice2, xCable, xDevice1,
										cable2, xContainer, connection1, xDeviceToDevice, xCableToCable2, xDevice2,
										device2, cableAttributes, cable1, xCableToCable1, device1, ruleResult };
							}
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_XDuplexConnectionToConnectionRule_29_6_perform_greenBBBBBBBBBBB(
			Connections connection2, XCable xCable, XDevice xDevice1, Cable cable2, Connections connection1,
			XDevice xDevice2, Device device2, CableAttributes cableAttributes, Cable cable1, Device device1,
			ModelgeneratorRuleResult ruleResult) {
		connection2.getIncoming().add(xCable);
		cable2.setSource(device2);
		connection1.getOutgoing().add(xCable);
		cable2.setTarget(device1);
		cableAttributes.setEndPoint2(xDevice2);
		cableAttributes.setEndPoint1(xDevice1);
		cable1.setTarget(device2);
		cable1.setSource(device1);
		boolean cableAttributes_isDuplex_prime = Boolean.valueOf(true);
		boolean ruleResult_success_prime = Boolean.valueOf(true);
		int _localVariable_0 = ruleResult.getIncrementedPerformCount();
		cableAttributes.setIsDuplex(Boolean.valueOf(cableAttributes_isDuplex_prime));
		ruleResult.setSuccess(Boolean.valueOf(ruleResult_success_prime));
		int ruleResult_performCount_prime = Integer.valueOf(_localVariable_0);
		ruleResult.setPerformCount(Integer.valueOf(ruleResult_performCount_prime));
		return new Object[] { connection2, xCable, xDevice1, cable2, connection1, xDevice2, device2, cableAttributes,
				cable1, device1, ruleResult };
	}

	public static final ModelgeneratorRuleResult pattern_XDuplexConnectionToConnectionRule_29_7_expressionFB(
			ModelgeneratorRuleResult ruleResult) {
		ModelgeneratorRuleResult _result = ruleResult;
		return _result;
	}

	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} //XDuplexConnectionToConnectionRuleImpl
