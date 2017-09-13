/**
 */
package ImplementationTransformator.Rules.impl;

import ImplementationTransformator.ImplementationTransformatorFactory;

import ImplementationTransformator.Rules.RulesPackage;
import ImplementationTransformator.Rules.XDuplexCopperCableRule;

import ImplementationTransformator.XCableToCable;
import ImplementationTransformator.XDeviceToDevice;

import implementation.Cable;
import implementation.Container;
import implementation.CopperCable;
import implementation.Device;
import implementation.GlassFiberCable;
import implementation.ImplementationFactory;

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

import xtextImplementation.xtextImpl.CableAttributes;
import xtextImplementation.xtextImpl.NetworkElements;
import xtextImplementation.xtextImpl.XContainer;
import xtextImplementation.xtextImpl.XCopperCable;
import xtextImplementation.xtextImpl.XDevice;
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
 * An implementation of the model object '<em><b>XDuplex Copper Cable Rule</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class XDuplexCopperCableRuleImpl extends AbstractRuleImpl implements XDuplexCopperCableRule {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected XDuplexCopperCableRuleImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RulesPackage.eINSTANCE.getXDuplexCopperCableRule();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAppropriate_FWD(Match match, CableAttributes cableAttributes, XDevice xDevice, XCopperCable xCable,
			XContainer xContainer) {

		Object[] result1_black = XDuplexCopperCableRuleImpl
				.pattern_XDuplexCopperCableRule_0_1_initialbindings_blackBBBBBB(this, match, cableAttributes, xDevice,
						xCable, xContainer);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[match] = " + match + ", " + "[cableAttributes] = " + cableAttributes + ", " + "[xDevice] = "
					+ xDevice + ", " + "[xCable] = " + xCable + ", " + "[xContainer] = " + xContainer + ".");
		}

		Object[] result2_bindingAndBlack = XDuplexCopperCableRuleImpl
				.pattern_XDuplexCopperCableRule_0_2_SolveCSP_bindingAndBlackFBBBBBB(this, match, cableAttributes,
						xDevice, xCable, xContainer);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[match] = " + match + ", " + "[cableAttributes] = " + cableAttributes + ", " + "[xDevice] = "
					+ xDevice + ", " + "[xCable] = " + xCable + ", " + "[xContainer] = " + xContainer + ".");
		}
		CSP csp = (CSP) result2_bindingAndBlack[0];
		// 
		if (XDuplexCopperCableRuleImpl.pattern_XDuplexCopperCableRule_0_3_CheckCSP_expressionFBB(this, csp)) {

			Object[] result4_black = XDuplexCopperCableRuleImpl
					.pattern_XDuplexCopperCableRule_0_4_collectelementstobetranslated_blackBBBBB(match, cableAttributes,
							xDevice, xCable, xContainer);
			if (result4_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match + ", "
						+ "[cableAttributes] = " + cableAttributes + ", " + "[xDevice] = " + xDevice + ", "
						+ "[xCable] = " + xCable + ", " + "[xContainer] = " + xContainer + ".");
			}
			XDuplexCopperCableRuleImpl.pattern_XDuplexCopperCableRule_0_4_collectelementstobetranslated_greenBBBBFF(
					match, cableAttributes, xCable, xContainer);
			//nothing EMoflonEdge xContainer__xCable____elements = (EMoflonEdge) result4_green[4];
			//nothing EMoflonEdge xCable__cableAttributes____cableAttributes = (EMoflonEdge) result4_green[5];

			Object[] result5_black = XDuplexCopperCableRuleImpl
					.pattern_XDuplexCopperCableRule_0_5_collectcontextelements_blackBBBBB(match, cableAttributes,
							xDevice, xCable, xContainer);
			if (result5_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match + ", "
						+ "[cableAttributes] = " + cableAttributes + ", " + "[xDevice] = " + xDevice + ", "
						+ "[xCable] = " + xCable + ", " + "[xContainer] = " + xContainer + ".");
			}
			XDuplexCopperCableRuleImpl.pattern_XDuplexCopperCableRule_0_5_collectcontextelements_greenBBBF(match,
					xDevice, xContainer);
			//nothing EMoflonEdge xContainer__xDevice____elements = (EMoflonEdge) result5_green[3];

			// 
			XDuplexCopperCableRuleImpl.pattern_XDuplexCopperCableRule_0_6_registerobjectstomatch_expressionBBBBBB(this,
					match, cableAttributes, xDevice, xCable, xContainer);
			return XDuplexCopperCableRuleImpl.pattern_XDuplexCopperCableRule_0_7_expressionF();
		} else {
			return XDuplexCopperCableRuleImpl.pattern_XDuplexCopperCableRule_0_8_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PerformRuleResult perform_FWD(IsApplicableMatch isApplicableMatch) {

		Object[] result1_bindingAndBlack = XDuplexCopperCableRuleImpl
				.pattern_XDuplexCopperCableRule_1_1_performtransformation_bindingAndBlackFFFFFFFFBB(this,
						isApplicableMatch);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[isApplicableMatch] = " + isApplicableMatch + ".");
		}
		Container container = (Container) result1_bindingAndBlack[0];
		CableAttributes cableAttributes = (CableAttributes) result1_bindingAndBlack[1];
		XDevice xDevice = (XDevice) result1_bindingAndBlack[2];
		XCopperCable xCable = (XCopperCable) result1_bindingAndBlack[3];
		XContainer xContainer = (XContainer) result1_bindingAndBlack[4];
		Device device = (Device) result1_bindingAndBlack[5];
		XDeviceToDevice xDeviceToDevice = (XDeviceToDevice) result1_bindingAndBlack[6];
		CSP csp = (CSP) result1_bindingAndBlack[7];
		Object[] result1_green = XDuplexCopperCableRuleImpl
				.pattern_XDuplexCopperCableRule_1_1_performtransformation_greenFBFBFFB(container, xCable, csp);
		CopperCable cable1 = (CopperCable) result1_green[0];
		GlassFiberCable cable2 = (GlassFiberCable) result1_green[2];
		XCableToCable xCableToCable = (XCableToCable) result1_green[4];
		XCableToCable xCableToCable2 = (XCableToCable) result1_green[5];

		Object[] result2_black = XDuplexCopperCableRuleImpl
				.pattern_XDuplexCopperCableRule_1_2_collecttranslatedelements_blackBBBBBB(cable1, cable2,
						cableAttributes, xCable, xCableToCable, xCableToCable2);
		if (result2_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[cable1] = " + cable1 + ", "
					+ "[cable2] = " + cable2 + ", " + "[cableAttributes] = " + cableAttributes + ", " + "[xCable] = "
					+ xCable + ", " + "[xCableToCable] = " + xCableToCable + ", " + "[xCableToCable2] = "
					+ xCableToCable2 + ".");
		}
		Object[] result2_green = XDuplexCopperCableRuleImpl
				.pattern_XDuplexCopperCableRule_1_2_collecttranslatedelements_greenFBBBBBB(cable1, cable2,
						cableAttributes, xCable, xCableToCable, xCableToCable2);
		PerformRuleResult ruleresult = (PerformRuleResult) result2_green[0];

		Object[] result3_black = XDuplexCopperCableRuleImpl
				.pattern_XDuplexCopperCableRule_1_3_bookkeepingforedges_blackBBBBBBBBBBBB(ruleresult, cable1, container,
						cable2, cableAttributes, xDevice, xCable, xContainer, xCableToCable, xCableToCable2, device,
						xDeviceToDevice);
		if (result3_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[ruleresult] = " + ruleresult
					+ ", " + "[cable1] = " + cable1 + ", " + "[container] = " + container + ", " + "[cable2] = "
					+ cable2 + ", " + "[cableAttributes] = " + cableAttributes + ", " + "[xDevice] = " + xDevice + ", "
					+ "[xCable] = " + xCable + ", " + "[xContainer] = " + xContainer + ", " + "[xCableToCable] = "
					+ xCableToCable + ", " + "[xCableToCable2] = " + xCableToCable2 + ", " + "[device] = " + device
					+ ", " + "[xDeviceToDevice] = " + xDeviceToDevice + ".");
		}
		XDuplexCopperCableRuleImpl.pattern_XDuplexCopperCableRule_1_3_bookkeepingforedges_greenBBBBBBBBBFFFFFFFF(
				ruleresult, cable1, container, cable2, cableAttributes, xCable, xContainer, xCableToCable,
				xCableToCable2);
		//nothing EMoflonEdge xCableToCable__xCable____source = (EMoflonEdge) result3_green[9];
		//nothing EMoflonEdge xCableToCable__cable1____target = (EMoflonEdge) result3_green[10];
		//nothing EMoflonEdge container__cable2____cables = (EMoflonEdge) result3_green[11];
		//nothing EMoflonEdge xCableToCable2__cable2____target = (EMoflonEdge) result3_green[12];
		//nothing EMoflonEdge xCableToCable2__xCable____source = (EMoflonEdge) result3_green[13];
		//nothing EMoflonEdge xContainer__xCable____elements = (EMoflonEdge) result3_green[14];
		//nothing EMoflonEdge xCable__cableAttributes____cableAttributes = (EMoflonEdge) result3_green[15];
		//nothing EMoflonEdge container__cable1____cables = (EMoflonEdge) result3_green[16];

		// 
		// 
		XDuplexCopperCableRuleImpl.pattern_XDuplexCopperCableRule_1_5_registerobjects_expressionBBBBBBBBBBBBB(this,
				ruleresult, cable1, container, cable2, cableAttributes, xDevice, xCable, xContainer, xCableToCable,
				xCableToCable2, device, xDeviceToDevice);
		return XDuplexCopperCableRuleImpl.pattern_XDuplexCopperCableRule_1_6_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IsApplicableRuleResult isApplicable_FWD(Match match) {

		Object[] result1_bindingAndBlack = XDuplexCopperCableRuleImpl
				.pattern_XDuplexCopperCableRule_2_1_preparereturnvalue_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		EOperation performOperation = (EOperation) result1_bindingAndBlack[0];
		//nothing EClass eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = XDuplexCopperCableRuleImpl
				.pattern_XDuplexCopperCableRule_2_1_preparereturnvalue_greenBF(performOperation);
		IsApplicableRuleResult ruleresult = (IsApplicableRuleResult) result1_green[1];

		// ForEach 
		Object[] result2_binding = XDuplexCopperCableRuleImpl
				.pattern_XDuplexCopperCableRule_2_2_corematch_bindingFFFFB(match);
		if (result2_binding == null) {
			throw new RuntimeException(
					"Binding in node core match failed." + " Variables: " + "[match] = " + match + ".");
		}
		CableAttributes cableAttributes = (CableAttributes) result2_binding[0];
		XDevice xDevice = (XDevice) result2_binding[1];
		XCopperCable xCable = (XCopperCable) result2_binding[2];
		XContainer xContainer = (XContainer) result2_binding[3];
		for (Object[] result2_black : XDuplexCopperCableRuleImpl
				.pattern_XDuplexCopperCableRule_2_2_corematch_blackBBBBFFB(cableAttributes, xDevice, xCable, xContainer,
						match)) {
			Device device = (Device) result2_black[4];
			XDeviceToDevice xDeviceToDevice = (XDeviceToDevice) result2_black[5];
			// ForEach 
			for (Object[] result3_black : XDuplexCopperCableRuleImpl
					.pattern_XDuplexCopperCableRule_2_3_findcontext_blackFBBBBBB(cableAttributes, xDevice, xCable,
							xContainer, device, xDeviceToDevice)) {
				Container container = (Container) result3_black[0];
				Object[] result3_green = XDuplexCopperCableRuleImpl
						.pattern_XDuplexCopperCableRule_2_3_findcontext_greenBBBBBBBFFFFFFF(container, cableAttributes,
								xDevice, xCable, xContainer, device, xDeviceToDevice);
				IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result3_green[7];
				//nothing EMoflonEdge container__device____devices = (EMoflonEdge) result3_green[8];
				//nothing EMoflonEdge xDeviceToDevice__xDevice____source = (EMoflonEdge) result3_green[9];
				//nothing EMoflonEdge xDeviceToDevice__device____target = (EMoflonEdge) result3_green[10];
				//nothing EMoflonEdge xContainer__xDevice____elements = (EMoflonEdge) result3_green[11];
				//nothing EMoflonEdge xContainer__xCable____elements = (EMoflonEdge) result3_green[12];
				//nothing EMoflonEdge xCable__cableAttributes____cableAttributes = (EMoflonEdge) result3_green[13];

				Object[] result4_bindingAndBlack = XDuplexCopperCableRuleImpl
						.pattern_XDuplexCopperCableRule_2_4_solveCSP_bindingAndBlackFBBBBBBBBB(this, isApplicableMatch,
								container, cableAttributes, xDevice, xCable, xContainer, device, xDeviceToDevice);
				if (result4_bindingAndBlack == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
							+ "[isApplicableMatch] = " + isApplicableMatch + ", " + "[container] = " + container + ", "
							+ "[cableAttributes] = " + cableAttributes + ", " + "[xDevice] = " + xDevice + ", "
							+ "[xCable] = " + xCable + ", " + "[xContainer] = " + xContainer + ", " + "[device] = "
							+ device + ", " + "[xDeviceToDevice] = " + xDeviceToDevice + ".");
				}
				CSP csp = (CSP) result4_bindingAndBlack[0];
				// 
				if (XDuplexCopperCableRuleImpl.pattern_XDuplexCopperCableRule_2_5_checkCSP_expressionFBB(this, csp)) {

					Object[] result6_black = XDuplexCopperCableRuleImpl
							.pattern_XDuplexCopperCableRule_2_6_addmatchtoruleresult_blackBB(ruleresult,
									isApplicableMatch);
					if (result6_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[ruleresult] = "
								+ ruleresult + ", " + "[isApplicableMatch] = " + isApplicableMatch + ".");
					}
					XDuplexCopperCableRuleImpl.pattern_XDuplexCopperCableRule_2_6_addmatchtoruleresult_greenBB(
							ruleresult, isApplicableMatch);

				} else {
				}

			}

		}
		return XDuplexCopperCableRuleImpl.pattern_XDuplexCopperCableRule_2_7_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void registerObjectsToMatch_FWD(Match match, CableAttributes cableAttributes, XDevice xDevice,
			XCopperCable xCable, XContainer xContainer) {
		match.registerObject("cableAttributes", cableAttributes);
		match.registerObject("xDevice", xDevice);
		match.registerObject("xCable", xCable);
		match.registerObject("xContainer", xContainer);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isAppropriate_solveCsp_FWD(Match match, CableAttributes cableAttributes, XDevice xDevice,
			XCopperCable xCable, XContainer xContainer) {// Create CSP
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
			CableAttributes cableAttributes, XDevice xDevice, XCopperCable xCable, XContainer xContainer, Device device,
			XDeviceToDevice xDeviceToDevice) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals

		// Create attribute variables
		Variable var_cableAttributes_speed = CSPFactoryHelper.eINSTANCE.createVariable("cableAttributes.speed", true,
				csp);
		var_cableAttributes_speed.setValue(cableAttributes.getSpeed());
		var_cableAttributes_speed.setType("BigInteger");

		// Create unbound variables
		Variable var_cable2_speed = CSPFactoryHelper.eINSTANCE.createVariable("cable2.speed", csp);
		var_cable2_speed.setType("BigInteger");
		Variable var_cable1_speed = CSPFactoryHelper.eINSTANCE.createVariable("cable1.speed", csp);
		var_cable1_speed.setType("BigInteger");

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
		isApplicableMatch.registerObject("cableAttributes", cableAttributes);
		isApplicableMatch.registerObject("xDevice", xDevice);
		isApplicableMatch.registerObject("xCable", xCable);
		isApplicableMatch.registerObject("xContainer", xContainer);
		isApplicableMatch.registerObject("device", device);
		isApplicableMatch.registerObject("xDeviceToDevice", xDeviceToDevice);
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
	public void registerObjects_FWD(PerformRuleResult ruleresult, EObject cable1, EObject container, EObject cable2,
			EObject cableAttributes, EObject xDevice, EObject xCable, EObject xContainer, EObject xCableToCable,
			EObject xCableToCable2, EObject device, EObject xDeviceToDevice) {
		ruleresult.registerObject("cable1", cable1);
		ruleresult.registerObject("container", container);
		ruleresult.registerObject("cable2", cable2);
		ruleresult.registerObject("cableAttributes", cableAttributes);
		ruleresult.registerObject("xDevice", xDevice);
		ruleresult.registerObject("xCable", xCable);
		ruleresult.registerObject("xContainer", xContainer);
		ruleresult.registerObject("xCableToCable", xCableToCable);
		ruleresult.registerObject("xCableToCable2", xCableToCable2);
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
				&& org.moflon.util.eMoflonSDMUtil.getFQN(match.getObject("cableAttributes").eClass())
						.equals("xtextImpl.CableAttributes.")
				&& org.moflon.util.eMoflonSDMUtil.getFQN(match.getObject("xCable").eClass())
						.equals("xtextImpl.XCopperCable.");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAppropriate_BWD(Match match, CopperCable cable1, Container container, GlassFiberCable cable2,
			Device device) {

		Object[] result1_black = XDuplexCopperCableRuleImpl
				.pattern_XDuplexCopperCableRule_10_1_initialbindings_blackBBBBBB(this, match, cable1, container, cable2,
						device);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[match] = " + match + ", " + "[cable1] = " + cable1 + ", " + "[container] = " + container + ", "
					+ "[cable2] = " + cable2 + ", " + "[device] = " + device + ".");
		}

		Object[] result2_bindingAndBlack = XDuplexCopperCableRuleImpl
				.pattern_XDuplexCopperCableRule_10_2_SolveCSP_bindingAndBlackFBBBBBB(this, match, cable1, container,
						cable2, device);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[match] = " + match + ", " + "[cable1] = " + cable1 + ", " + "[container] = " + container + ", "
					+ "[cable2] = " + cable2 + ", " + "[device] = " + device + ".");
		}
		CSP csp = (CSP) result2_bindingAndBlack[0];
		// 
		if (XDuplexCopperCableRuleImpl.pattern_XDuplexCopperCableRule_10_3_CheckCSP_expressionFBB(this, csp)) {

			Object[] result4_black = XDuplexCopperCableRuleImpl
					.pattern_XDuplexCopperCableRule_10_4_collectelementstobetranslated_blackBBBBB(match, cable1,
							container, cable2, device);
			if (result4_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match + ", "
						+ "[cable1] = " + cable1 + ", " + "[container] = " + container + ", " + "[cable2] = " + cable2
						+ ", " + "[device] = " + device + ".");
			}
			XDuplexCopperCableRuleImpl.pattern_XDuplexCopperCableRule_10_4_collectelementstobetranslated_greenBBBBFF(
					match, cable1, container, cable2);
			//nothing EMoflonEdge container__cable2____cables = (EMoflonEdge) result4_green[4];
			//nothing EMoflonEdge container__cable1____cables = (EMoflonEdge) result4_green[5];

			Object[] result5_black = XDuplexCopperCableRuleImpl
					.pattern_XDuplexCopperCableRule_10_5_collectcontextelements_blackBBBBB(match, cable1, container,
							cable2, device);
			if (result5_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match + ", "
						+ "[cable1] = " + cable1 + ", " + "[container] = " + container + ", " + "[cable2] = " + cable2
						+ ", " + "[device] = " + device + ".");
			}
			XDuplexCopperCableRuleImpl.pattern_XDuplexCopperCableRule_10_5_collectcontextelements_greenBBBF(match,
					container, device);
			//nothing EMoflonEdge container__device____devices = (EMoflonEdge) result5_green[3];

			// 
			XDuplexCopperCableRuleImpl.pattern_XDuplexCopperCableRule_10_6_registerobjectstomatch_expressionBBBBBB(this,
					match, cable1, container, cable2, device);
			return XDuplexCopperCableRuleImpl.pattern_XDuplexCopperCableRule_10_7_expressionF();
		} else {
			return XDuplexCopperCableRuleImpl.pattern_XDuplexCopperCableRule_10_8_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PerformRuleResult perform_BWD(IsApplicableMatch isApplicableMatch) {

		Object[] result1_bindingAndBlack = XDuplexCopperCableRuleImpl
				.pattern_XDuplexCopperCableRule_11_1_performtransformation_bindingAndBlackFFFFFFFFBB(this,
						isApplicableMatch);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[isApplicableMatch] = " + isApplicableMatch + ".");
		}
		CopperCable cable1 = (CopperCable) result1_bindingAndBlack[0];
		Container container = (Container) result1_bindingAndBlack[1];
		GlassFiberCable cable2 = (GlassFiberCable) result1_bindingAndBlack[2];
		XDevice xDevice = (XDevice) result1_bindingAndBlack[3];
		XContainer xContainer = (XContainer) result1_bindingAndBlack[4];
		Device device = (Device) result1_bindingAndBlack[5];
		XDeviceToDevice xDeviceToDevice = (XDeviceToDevice) result1_bindingAndBlack[6];
		CSP csp = (CSP) result1_bindingAndBlack[7];
		Object[] result1_green = XDuplexCopperCableRuleImpl
				.pattern_XDuplexCopperCableRule_11_1_performtransformation_greenBBFFBFFB(cable1, cable2, xContainer,
						csp);
		CableAttributes cableAttributes = (CableAttributes) result1_green[2];
		XCopperCable xCable = (XCopperCable) result1_green[3];
		XCableToCable xCableToCable = (XCableToCable) result1_green[5];
		XCableToCable xCableToCable2 = (XCableToCable) result1_green[6];

		Object[] result2_black = XDuplexCopperCableRuleImpl
				.pattern_XDuplexCopperCableRule_11_2_collecttranslatedelements_blackBBBBBB(cable1, cable2,
						cableAttributes, xCable, xCableToCable, xCableToCable2);
		if (result2_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[cable1] = " + cable1 + ", "
					+ "[cable2] = " + cable2 + ", " + "[cableAttributes] = " + cableAttributes + ", " + "[xCable] = "
					+ xCable + ", " + "[xCableToCable] = " + xCableToCable + ", " + "[xCableToCable2] = "
					+ xCableToCable2 + ".");
		}
		Object[] result2_green = XDuplexCopperCableRuleImpl
				.pattern_XDuplexCopperCableRule_11_2_collecttranslatedelements_greenFBBBBBB(cable1, cable2,
						cableAttributes, xCable, xCableToCable, xCableToCable2);
		PerformRuleResult ruleresult = (PerformRuleResult) result2_green[0];

		Object[] result3_black = XDuplexCopperCableRuleImpl
				.pattern_XDuplexCopperCableRule_11_3_bookkeepingforedges_blackBBBBBBBBBBBB(ruleresult, cable1,
						container, cable2, cableAttributes, xDevice, xCable, xContainer, xCableToCable, xCableToCable2,
						device, xDeviceToDevice);
		if (result3_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[ruleresult] = " + ruleresult
					+ ", " + "[cable1] = " + cable1 + ", " + "[container] = " + container + ", " + "[cable2] = "
					+ cable2 + ", " + "[cableAttributes] = " + cableAttributes + ", " + "[xDevice] = " + xDevice + ", "
					+ "[xCable] = " + xCable + ", " + "[xContainer] = " + xContainer + ", " + "[xCableToCable] = "
					+ xCableToCable + ", " + "[xCableToCable2] = " + xCableToCable2 + ", " + "[device] = " + device
					+ ", " + "[xDeviceToDevice] = " + xDeviceToDevice + ".");
		}
		XDuplexCopperCableRuleImpl.pattern_XDuplexCopperCableRule_11_3_bookkeepingforedges_greenBBBBBBBBBFFFFFFFF(
				ruleresult, cable1, container, cable2, cableAttributes, xCable, xContainer, xCableToCable,
				xCableToCable2);
		//nothing EMoflonEdge xCableToCable__xCable____source = (EMoflonEdge) result3_green[9];
		//nothing EMoflonEdge xCableToCable__cable1____target = (EMoflonEdge) result3_green[10];
		//nothing EMoflonEdge container__cable2____cables = (EMoflonEdge) result3_green[11];
		//nothing EMoflonEdge xCableToCable2__cable2____target = (EMoflonEdge) result3_green[12];
		//nothing EMoflonEdge xCableToCable2__xCable____source = (EMoflonEdge) result3_green[13];
		//nothing EMoflonEdge xContainer__xCable____elements = (EMoflonEdge) result3_green[14];
		//nothing EMoflonEdge xCable__cableAttributes____cableAttributes = (EMoflonEdge) result3_green[15];
		//nothing EMoflonEdge container__cable1____cables = (EMoflonEdge) result3_green[16];

		// 
		// 
		XDuplexCopperCableRuleImpl.pattern_XDuplexCopperCableRule_11_5_registerobjects_expressionBBBBBBBBBBBBB(this,
				ruleresult, cable1, container, cable2, cableAttributes, xDevice, xCable, xContainer, xCableToCable,
				xCableToCable2, device, xDeviceToDevice);
		return XDuplexCopperCableRuleImpl.pattern_XDuplexCopperCableRule_11_6_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IsApplicableRuleResult isApplicable_BWD(Match match) {

		Object[] result1_bindingAndBlack = XDuplexCopperCableRuleImpl
				.pattern_XDuplexCopperCableRule_12_1_preparereturnvalue_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		EOperation performOperation = (EOperation) result1_bindingAndBlack[0];
		//nothing EClass eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = XDuplexCopperCableRuleImpl
				.pattern_XDuplexCopperCableRule_12_1_preparereturnvalue_greenBF(performOperation);
		IsApplicableRuleResult ruleresult = (IsApplicableRuleResult) result1_green[1];

		// ForEach 
		Object[] result2_binding = XDuplexCopperCableRuleImpl
				.pattern_XDuplexCopperCableRule_12_2_corematch_bindingFFFFB(match);
		if (result2_binding == null) {
			throw new RuntimeException(
					"Binding in node core match failed." + " Variables: " + "[match] = " + match + ".");
		}
		CopperCable cable1 = (CopperCable) result2_binding[0];
		Container container = (Container) result2_binding[1];
		GlassFiberCable cable2 = (GlassFiberCable) result2_binding[2];
		Device device = (Device) result2_binding[3];
		for (Object[] result2_black : XDuplexCopperCableRuleImpl
				.pattern_XDuplexCopperCableRule_12_2_corematch_blackBBBFBFB(cable1, container, cable2, device, match)) {
			XDevice xDevice = (XDevice) result2_black[3];
			XDeviceToDevice xDeviceToDevice = (XDeviceToDevice) result2_black[5];
			// ForEach 
			for (Object[] result3_black : XDuplexCopperCableRuleImpl
					.pattern_XDuplexCopperCableRule_12_3_findcontext_blackBBBBFBB(cable1, container, cable2, xDevice,
							device, xDeviceToDevice)) {
				XContainer xContainer = (XContainer) result3_black[4];
				Object[] result3_green = XDuplexCopperCableRuleImpl
						.pattern_XDuplexCopperCableRule_12_3_findcontext_greenBBBBBBBFFFFFFF(cable1, container, cable2,
								xDevice, xContainer, device, xDeviceToDevice);
				IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result3_green[7];
				//nothing EMoflonEdge container__device____devices = (EMoflonEdge) result3_green[8];
				//nothing EMoflonEdge xDeviceToDevice__xDevice____source = (EMoflonEdge) result3_green[9];
				//nothing EMoflonEdge xDeviceToDevice__device____target = (EMoflonEdge) result3_green[10];
				//nothing EMoflonEdge container__cable2____cables = (EMoflonEdge) result3_green[11];
				//nothing EMoflonEdge xContainer__xDevice____elements = (EMoflonEdge) result3_green[12];
				//nothing EMoflonEdge container__cable1____cables = (EMoflonEdge) result3_green[13];

				Object[] result4_bindingAndBlack = XDuplexCopperCableRuleImpl
						.pattern_XDuplexCopperCableRule_12_4_solveCSP_bindingAndBlackFBBBBBBBBB(this, isApplicableMatch,
								cable1, container, cable2, xDevice, xContainer, device, xDeviceToDevice);
				if (result4_bindingAndBlack == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
							+ "[isApplicableMatch] = " + isApplicableMatch + ", " + "[cable1] = " + cable1 + ", "
							+ "[container] = " + container + ", " + "[cable2] = " + cable2 + ", " + "[xDevice] = "
							+ xDevice + ", " + "[xContainer] = " + xContainer + ", " + "[device] = " + device + ", "
							+ "[xDeviceToDevice] = " + xDeviceToDevice + ".");
				}
				CSP csp = (CSP) result4_bindingAndBlack[0];
				// 
				if (XDuplexCopperCableRuleImpl.pattern_XDuplexCopperCableRule_12_5_checkCSP_expressionFBB(this, csp)) {

					Object[] result6_black = XDuplexCopperCableRuleImpl
							.pattern_XDuplexCopperCableRule_12_6_addmatchtoruleresult_blackBB(ruleresult,
									isApplicableMatch);
					if (result6_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[ruleresult] = "
								+ ruleresult + ", " + "[isApplicableMatch] = " + isApplicableMatch + ".");
					}
					XDuplexCopperCableRuleImpl.pattern_XDuplexCopperCableRule_12_6_addmatchtoruleresult_greenBB(
							ruleresult, isApplicableMatch);

				} else {
				}

			}

		}
		return XDuplexCopperCableRuleImpl.pattern_XDuplexCopperCableRule_12_7_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void registerObjectsToMatch_BWD(Match match, CopperCable cable1, Container container, GlassFiberCable cable2,
			Device device) {
		match.registerObject("cable1", cable1);
		match.registerObject("container", container);
		match.registerObject("cable2", cable2);
		match.registerObject("device", device);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isAppropriate_solveCsp_BWD(Match match, CopperCable cable1, Container container, GlassFiberCable cable2,
			Device device) {// Create CSP
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
	public CSP isApplicable_solveCsp_BWD(IsApplicableMatch isApplicableMatch, CopperCable cable1, Container container,
			GlassFiberCable cable2, XDevice xDevice, XContainer xContainer, Device device,
			XDeviceToDevice xDeviceToDevice) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals

		// Create attribute variables
		Variable var_cable2_speed = CSPFactoryHelper.eINSTANCE.createVariable("cable2.speed", true, csp);
		var_cable2_speed.setValue(cable2.getSpeed());
		var_cable2_speed.setType("BigInteger");
		Variable var_cable1_speed = CSPFactoryHelper.eINSTANCE.createVariable("cable1.speed", true, csp);
		var_cable1_speed.setValue(cable1.getSpeed());
		var_cable1_speed.setType("BigInteger");

		// Create unbound variables
		Variable var_cableAttributes_speed = CSPFactoryHelper.eINSTANCE.createVariable("cableAttributes.speed", csp);
		var_cableAttributes_speed.setType("BigInteger");

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
		isApplicableMatch.registerObject("cable1", cable1);
		isApplicableMatch.registerObject("container", container);
		isApplicableMatch.registerObject("cable2", cable2);
		isApplicableMatch.registerObject("xDevice", xDevice);
		isApplicableMatch.registerObject("xContainer", xContainer);
		isApplicableMatch.registerObject("device", device);
		isApplicableMatch.registerObject("xDeviceToDevice", xDeviceToDevice);
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
	public void registerObjects_BWD(PerformRuleResult ruleresult, EObject cable1, EObject container, EObject cable2,
			EObject cableAttributes, EObject xDevice, EObject xCable, EObject xContainer, EObject xCableToCable,
			EObject xCableToCable2, EObject device, EObject xDeviceToDevice) {
		ruleresult.registerObject("cable1", cable1);
		ruleresult.registerObject("container", container);
		ruleresult.registerObject("cable2", cable2);
		ruleresult.registerObject("cableAttributes", cableAttributes);
		ruleresult.registerObject("xDevice", xDevice);
		ruleresult.registerObject("xCable", xCable);
		ruleresult.registerObject("xContainer", xContainer);
		ruleresult.registerObject("xCableToCable", xCableToCable);
		ruleresult.registerObject("xCableToCable2", xCableToCable2);
		ruleresult.registerObject("device", device);
		ruleresult.registerObject("xDeviceToDevice", xDeviceToDevice);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean checkTypes_BWD(Match match) {
		return true
				&& org.moflon.util.eMoflonSDMUtil.getFQN(match.getObject("cable1").eClass())
						.equals("implementation.CopperCable.")
				&& org.moflon.util.eMoflonSDMUtil.getFQN(match.getObject("cable2").eClass())
						.equals("implementation.GlassFiberCable.");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_BWD_EMoflonEdge_16(EMoflonEdge _edge_cables) {

		Object[] result1_bindingAndBlack = XDuplexCopperCableRuleImpl
				.pattern_XDuplexCopperCableRule_20_1_preparereturnvalue_bindingAndBlackFFBF(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		EOperation isApplicableCC = (EOperation) result1_bindingAndBlack[3];
		Object[] result1_green = XDuplexCopperCableRuleImpl
				.pattern_XDuplexCopperCableRule_20_1_preparereturnvalue_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach 
		for (Object[] result2_black : XDuplexCopperCableRuleImpl
				.pattern_XDuplexCopperCableRule_20_2_testcorematchandDECs_blackFFFFB(_edge_cables)) {
			CopperCable cable1 = (CopperCable) result2_black[0];
			Container container = (Container) result2_black[1];
			GlassFiberCable cable2 = (GlassFiberCable) result2_black[2];
			Device device = (Device) result2_black[3];
			Object[] result2_green = XDuplexCopperCableRuleImpl
					.pattern_XDuplexCopperCableRule_20_2_testcorematchandDECs_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// 
			if (XDuplexCopperCableRuleImpl
					.pattern_XDuplexCopperCableRule_20_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBBBB(
							this, match, cable1, container, cable2, device)) {
				// 
				if (XDuplexCopperCableRuleImpl
						.pattern_XDuplexCopperCableRule_20_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(
								this, match)) {

					Object[] result5_black = XDuplexCopperCableRuleImpl
							.pattern_XDuplexCopperCableRule_20_5_Addmatchtoruleresult_blackBBBB(match,
									__performOperation, __result, isApplicableCC);
					if (result5_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match
								+ ", " + "[__performOperation] = " + __performOperation + ", " + "[__result] = "
								+ __result + ", " + "[isApplicableCC] = " + isApplicableCC + ".");
					}
					XDuplexCopperCableRuleImpl.pattern_XDuplexCopperCableRule_20_5_Addmatchtoruleresult_greenBBBB(match,
							__performOperation, __result, isApplicableCC);

				} else {
				}

			} else {
			}

		}
		return XDuplexCopperCableRuleImpl.pattern_XDuplexCopperCableRule_20_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_FWD_EMoflonEdge_12(EMoflonEdge _edge_elements) {

		Object[] result1_bindingAndBlack = XDuplexCopperCableRuleImpl
				.pattern_XDuplexCopperCableRule_21_1_preparereturnvalue_bindingAndBlackFFBF(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		EOperation isApplicableCC = (EOperation) result1_bindingAndBlack[3];
		Object[] result1_green = XDuplexCopperCableRuleImpl
				.pattern_XDuplexCopperCableRule_21_1_preparereturnvalue_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach 
		for (Object[] result2_black : XDuplexCopperCableRuleImpl
				.pattern_XDuplexCopperCableRule_21_2_testcorematchandDECs_blackFFFFB(_edge_elements)) {
			CableAttributes cableAttributes = (CableAttributes) result2_black[0];
			XDevice xDevice = (XDevice) result2_black[1];
			XCopperCable xCable = (XCopperCable) result2_black[2];
			XContainer xContainer = (XContainer) result2_black[3];
			Object[] result2_green = XDuplexCopperCableRuleImpl
					.pattern_XDuplexCopperCableRule_21_2_testcorematchandDECs_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// 
			if (XDuplexCopperCableRuleImpl
					.pattern_XDuplexCopperCableRule_21_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBBBB(
							this, match, cableAttributes, xDevice, xCable, xContainer)) {
				// 
				if (XDuplexCopperCableRuleImpl
						.pattern_XDuplexCopperCableRule_21_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(
								this, match)) {

					Object[] result5_black = XDuplexCopperCableRuleImpl
							.pattern_XDuplexCopperCableRule_21_5_Addmatchtoruleresult_blackBBBB(match,
									__performOperation, __result, isApplicableCC);
					if (result5_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match
								+ ", " + "[__performOperation] = " + __performOperation + ", " + "[__result] = "
								+ __result + ", " + "[isApplicableCC] = " + isApplicableCC + ".");
					}
					XDuplexCopperCableRuleImpl.pattern_XDuplexCopperCableRule_21_5_Addmatchtoruleresult_greenBBBB(match,
							__performOperation, __result, isApplicableCC);

				} else {
				}

			} else {
			}

		}
		return XDuplexCopperCableRuleImpl.pattern_XDuplexCopperCableRule_21_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AttributeConstraintsRuleResult checkAttributes_FWD(TripleMatch __tripleMatch) {
		AttributeConstraintsRuleResult ruleResult = org.moflon.tgg.runtime.RuntimeFactory.eINSTANCE
				.createAttributeConstraintsRuleResult();
		ruleResult.setRule("XDuplexCopperCableRule");
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

		eq0.setRuleName("XDuplexCopperCableRule");
		eq0.solve(var_cableAttributes_speed, var_cable2_speed);

		eq1.setRuleName("XDuplexCopperCableRule");
		eq1.solve(var_cableAttributes_speed, var_cable1_speed);

		if (csp.check()) {
			ruleResult.setSuccess(true);
		} else {
			var_cable2_speed.setBound(false);
			var_cable1_speed.setBound(false);
			eq0.solve(var_cableAttributes_speed, var_cable2_speed);
			eq1.solve(var_cableAttributes_speed, var_cable1_speed);
			if (csp.check()) {
				ruleResult.setSuccess(true);
				ruleResult.setRequiredChange(true);
				__helper.setValue("cable2", "speed", var_cable2_speed.getValue());
				__helper.setValue("cable1", "speed", var_cable1_speed.getValue());
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
		ruleResult.setRule("XDuplexCopperCableRule");
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

		eq0.setRuleName("XDuplexCopperCableRule");
		eq0.solve(var_cableAttributes_speed, var_cable2_speed);

		eq1.setRuleName("XDuplexCopperCableRule");
		eq1.solve(var_cableAttributes_speed, var_cable1_speed);

		if (csp.check()) {
			ruleResult.setSuccess(true);
		} else {
			var_cableAttributes_speed.setBound(false);
			var_cableAttributes_speed.setBound(false);
			eq0.solve(var_cableAttributes_speed, var_cable2_speed);
			eq1.solve(var_cableAttributes_speed, var_cable1_speed);
			if (csp.check()) {
				ruleResult.setSuccess(true);
				ruleResult.setRequiredChange(true);
				__helper.setValue("cableAttributes", "speed", var_cableAttributes_speed.getValue());
				__helper.setValue("cableAttributes", "speed", var_cableAttributes_speed.getValue());
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

		Object[] result1_black = XDuplexCopperCableRuleImpl.pattern_XDuplexCopperCableRule_24_1_prepare_blackB(this);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		Object[] result1_green = XDuplexCopperCableRuleImpl.pattern_XDuplexCopperCableRule_24_1_prepare_greenF();
		IsApplicableRuleResult result = (IsApplicableRuleResult) result1_green[0];

		Object[] result2_bindingAndBlack = XDuplexCopperCableRuleImpl
				.pattern_XDuplexCopperCableRule_24_2_matchsrctrgcontext_bindingAndBlackFFFFFFFFBB(sourceMatch,
						targetMatch);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[sourceMatch] = " + sourceMatch
					+ ", " + "[targetMatch] = " + targetMatch + ".");
		}
		CopperCable cable1 = (CopperCable) result2_bindingAndBlack[0];
		Container container = (Container) result2_bindingAndBlack[1];
		GlassFiberCable cable2 = (GlassFiberCable) result2_bindingAndBlack[2];
		CableAttributes cableAttributes = (CableAttributes) result2_bindingAndBlack[3];
		XDevice xDevice = (XDevice) result2_bindingAndBlack[4];
		XCopperCable xCable = (XCopperCable) result2_bindingAndBlack[5];
		XContainer xContainer = (XContainer) result2_bindingAndBlack[6];
		Device device = (Device) result2_bindingAndBlack[7];

		Object[] result3_bindingAndBlack = XDuplexCopperCableRuleImpl
				.pattern_XDuplexCopperCableRule_24_3_solvecsp_bindingAndBlackFBBBBBBBBBBB(this, cable1, container,
						cable2, cableAttributes, xDevice, xCable, xContainer, device, sourceMatch, targetMatch);
		if (result3_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[cable1] = " + cable1 + ", " + "[container] = " + container + ", " + "[cable2] = " + cable2
					+ ", " + "[cableAttributes] = " + cableAttributes + ", " + "[xDevice] = " + xDevice + ", "
					+ "[xCable] = " + xCable + ", " + "[xContainer] = " + xContainer + ", " + "[device] = " + device
					+ ", " + "[sourceMatch] = " + sourceMatch + ", " + "[targetMatch] = " + targetMatch + ".");
		}
		CSP csp = (CSP) result3_bindingAndBlack[0];
		// 
		if (XDuplexCopperCableRuleImpl.pattern_XDuplexCopperCableRule_24_4_checkCSP_expressionFB(csp)) {
			// ForEach 
			for (Object[] result5_black : XDuplexCopperCableRuleImpl
					.pattern_XDuplexCopperCableRule_24_5_matchcorrcontext_blackBBFBB(xDevice, device, sourceMatch,
							targetMatch)) {
				XDeviceToDevice xDeviceToDevice = (XDeviceToDevice) result5_black[2];
				Object[] result5_green = XDuplexCopperCableRuleImpl
						.pattern_XDuplexCopperCableRule_24_5_matchcorrcontext_greenBBBF(xDeviceToDevice, sourceMatch,
								targetMatch);
				CCMatch ccMatch = (CCMatch) result5_green[3];

				Object[] result6_black = XDuplexCopperCableRuleImpl
						.pattern_XDuplexCopperCableRule_24_6_createcorrespondence_blackBBBBBBBBB(cable1, container,
								cable2, cableAttributes, xDevice, xCable, xContainer, device, ccMatch);
				if (result6_black == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[cable1] = " + cable1
							+ ", " + "[container] = " + container + ", " + "[cable2] = " + cable2 + ", "
							+ "[cableAttributes] = " + cableAttributes + ", " + "[xDevice] = " + xDevice + ", "
							+ "[xCable] = " + xCable + ", " + "[xContainer] = " + xContainer + ", " + "[device] = "
							+ device + ", " + "[ccMatch] = " + ccMatch + ".");
				}
				XDuplexCopperCableRuleImpl.pattern_XDuplexCopperCableRule_24_6_createcorrespondence_greenBBBFFB(cable1,
						cable2, xCable, ccMatch);
				//nothing XCableToCable xCableToCable = (XCableToCable) result6_green[3];
				//nothing XCableToCable xCableToCable2 = (XCableToCable) result6_green[4];

				Object[] result7_black = XDuplexCopperCableRuleImpl
						.pattern_XDuplexCopperCableRule_24_7_addtoreturnedresult_blackBB(result, ccMatch);
				if (result7_black == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[result] = " + result
							+ ", " + "[ccMatch] = " + ccMatch + ".");
				}
				XDuplexCopperCableRuleImpl.pattern_XDuplexCopperCableRule_24_7_addtoreturnedresult_greenBB(result,
						ccMatch);

			}

		} else {
		}
		return XDuplexCopperCableRuleImpl.pattern_XDuplexCopperCableRule_24_8_expressionFB(result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isApplicable_solveCsp_CC(CopperCable cable1, Container container, GlassFiberCable cable2,
			CableAttributes cableAttributes, XDevice xDevice, XCopperCable xCable, XContainer xContainer, Device device,
			Match sourceMatch, Match targetMatch) {// Create CSP
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
	public boolean checkDEC_FWD(CableAttributes cableAttributes, XDevice xDevice, XCopperCable xCable,
			XContainer xContainer) {// 
		Object[] result1_black = XDuplexCopperCableRuleImpl
				.pattern_XDuplexCopperCableRule_27_1_matchtggpattern_blackBBBB(cableAttributes, xDevice, xCable,
						xContainer);
		if (result1_black != null) {
			XDuplexCopperCableRuleImpl.pattern_XDuplexCopperCableRule_27_1_matchtggpattern_greenB(cableAttributes);

			return XDuplexCopperCableRuleImpl.pattern_XDuplexCopperCableRule_27_2_expressionF();
		} else {
			return XDuplexCopperCableRuleImpl.pattern_XDuplexCopperCableRule_27_3_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean checkDEC_BWD(CopperCable cable1, Container container, GlassFiberCable cable2, Device device) {// 
		Object[] result1_black = XDuplexCopperCableRuleImpl
				.pattern_XDuplexCopperCableRule_28_1_matchtggpattern_blackBBBB(cable1, container, cable2, device);
		if (result1_black != null) {
			return XDuplexCopperCableRuleImpl.pattern_XDuplexCopperCableRule_28_2_expressionF();
		} else {
			return XDuplexCopperCableRuleImpl.pattern_XDuplexCopperCableRule_28_3_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModelgeneratorRuleResult generateModel(RuleEntryContainer ruleEntryContainer,
			XDeviceToDevice xDeviceToDeviceParameter) {

		Object[] result1_black = XDuplexCopperCableRuleImpl
				.pattern_XDuplexCopperCableRule_29_1_createresult_blackB(this);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		Object[] result1_green = XDuplexCopperCableRuleImpl.pattern_XDuplexCopperCableRule_29_1_createresult_greenFF();
		IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result1_green[0];
		ModelgeneratorRuleResult ruleResult = (ModelgeneratorRuleResult) result1_green[1];

		// ForEach 
		for (Object[] result2_black : XDuplexCopperCableRuleImpl
				.pattern_XDuplexCopperCableRule_29_2_isapplicablecore_blackFFFFFFBB(ruleEntryContainer, ruleResult)) {
			//nothing RuleEntryList xDeviceToDeviceList = (RuleEntryList) result2_black[0];
			Container container = (Container) result2_black[1];
			Device device = (Device) result2_black[2];
			XDeviceToDevice xDeviceToDevice = (XDeviceToDevice) result2_black[3];
			XDevice xDevice = (XDevice) result2_black[4];
			XContainer xContainer = (XContainer) result2_black[5];

			Object[] result3_bindingAndBlack = XDuplexCopperCableRuleImpl
					.pattern_XDuplexCopperCableRule_29_3_solveCSP_bindingAndBlackFBBBBBBBB(this, isApplicableMatch,
							container, xDevice, xContainer, device, xDeviceToDevice, ruleResult);
			if (result3_bindingAndBlack == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
						+ "[isApplicableMatch] = " + isApplicableMatch + ", " + "[container] = " + container + ", "
						+ "[xDevice] = " + xDevice + ", " + "[xContainer] = " + xContainer + ", " + "[device] = "
						+ device + ", " + "[xDeviceToDevice] = " + xDeviceToDevice + ", " + "[ruleResult] = "
						+ ruleResult + ".");
			}
			CSP csp = (CSP) result3_bindingAndBlack[0];
			// 
			if (XDuplexCopperCableRuleImpl.pattern_XDuplexCopperCableRule_29_4_checkCSP_expressionFBB(this, csp)) {
				// 
				Object[] result5_black = XDuplexCopperCableRuleImpl
						.pattern_XDuplexCopperCableRule_29_5_checknacs_blackBBBBB(container, xDevice, xContainer,
								device, xDeviceToDevice);
				if (result5_black != null) {

					Object[] result6_black = XDuplexCopperCableRuleImpl
							.pattern_XDuplexCopperCableRule_29_6_perform_blackBBBBBB(container, xDevice, xContainer,
									device, xDeviceToDevice, ruleResult);
					if (result6_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[container] = "
								+ container + ", " + "[xDevice] = " + xDevice + ", " + "[xContainer] = " + xContainer
								+ ", " + "[device] = " + device + ", " + "[xDeviceToDevice] = " + xDeviceToDevice + ", "
								+ "[ruleResult] = " + ruleResult + ".");
					}
					XDuplexCopperCableRuleImpl.pattern_XDuplexCopperCableRule_29_6_perform_greenFBFFFBFFBB(container,
							xContainer, ruleResult, csp);
					//nothing CopperCable cable1 = (CopperCable) result6_green[0];
					//nothing GlassFiberCable cable2 = (GlassFiberCable) result6_green[2];
					//nothing CableAttributes cableAttributes = (CableAttributes) result6_green[3];
					//nothing XCopperCable xCable = (XCopperCable) result6_green[4];
					//nothing XCableToCable xCableToCable = (XCableToCable) result6_green[6];
					//nothing XCableToCable xCableToCable2 = (XCableToCable) result6_green[7];

				} else {
				}

			} else {
			}

		}
		return XDuplexCopperCableRuleImpl.pattern_XDuplexCopperCableRule_29_7_expressionFB(ruleResult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP generateModel_solveCsp_BWD(IsApplicableMatch isApplicableMatch, Container container, XDevice xDevice,
			XContainer xContainer, Device device, XDeviceToDevice xDeviceToDevice,
			ModelgeneratorRuleResult ruleResult) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals

		// Create attribute variables

		// Create unbound variables
		Variable var_cableAttributes_speed = CSPFactoryHelper.eINSTANCE.createVariable("cableAttributes.speed", csp);
		var_cableAttributes_speed.setType("BigInteger");
		Variable var_cable2_speed = CSPFactoryHelper.eINSTANCE.createVariable("cable2.speed", csp);
		var_cable2_speed.setType("BigInteger");
		Variable var_cable1_speed = CSPFactoryHelper.eINSTANCE.createVariable("cable1.speed", csp);
		var_cable1_speed.setType("BigInteger");

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
		isApplicableMatch.registerObject("xDevice", xDevice);
		isApplicableMatch.registerObject("xContainer", xContainer);
		isApplicableMatch.registerObject("device", device);
		isApplicableMatch.registerObject("xDeviceToDevice", xDeviceToDevice);
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
		case RulesPackage.XDUPLEX_COPPER_CABLE_RULE___IS_APPROPRIATE_FWD__MATCH_CABLEATTRIBUTES_XDEVICE_XCOPPERCABLE_XCONTAINER:
			return isAppropriate_FWD((Match) arguments.get(0), (CableAttributes) arguments.get(1),
					(XDevice) arguments.get(2), (XCopperCable) arguments.get(3), (XContainer) arguments.get(4));
		case RulesPackage.XDUPLEX_COPPER_CABLE_RULE___PERFORM_FWD__ISAPPLICABLEMATCH:
			return perform_FWD((IsApplicableMatch) arguments.get(0));
		case RulesPackage.XDUPLEX_COPPER_CABLE_RULE___IS_APPLICABLE_FWD__MATCH:
			return isApplicable_FWD((Match) arguments.get(0));
		case RulesPackage.XDUPLEX_COPPER_CABLE_RULE___REGISTER_OBJECTS_TO_MATCH_FWD__MATCH_CABLEATTRIBUTES_XDEVICE_XCOPPERCABLE_XCONTAINER:
			registerObjectsToMatch_FWD((Match) arguments.get(0), (CableAttributes) arguments.get(1),
					(XDevice) arguments.get(2), (XCopperCable) arguments.get(3), (XContainer) arguments.get(4));
			return null;
		case RulesPackage.XDUPLEX_COPPER_CABLE_RULE___IS_APPROPRIATE_SOLVE_CSP_FWD__MATCH_CABLEATTRIBUTES_XDEVICE_XCOPPERCABLE_XCONTAINER:
			return isAppropriate_solveCsp_FWD((Match) arguments.get(0), (CableAttributes) arguments.get(1),
					(XDevice) arguments.get(2), (XCopperCable) arguments.get(3), (XContainer) arguments.get(4));
		case RulesPackage.XDUPLEX_COPPER_CABLE_RULE___IS_APPROPRIATE_CHECK_CSP_FWD__CSP:
			return isAppropriate_checkCsp_FWD((CSP) arguments.get(0));
		case RulesPackage.XDUPLEX_COPPER_CABLE_RULE___IS_APPLICABLE_SOLVE_CSP_FWD__ISAPPLICABLEMATCH_CONTAINER_CABLEATTRIBUTES_XDEVICE_XCOPPERCABLE_XCONTAINER_DEVICE_XDEVICETODEVICE:
			return isApplicable_solveCsp_FWD((IsApplicableMatch) arguments.get(0), (Container) arguments.get(1),
					(CableAttributes) arguments.get(2), (XDevice) arguments.get(3), (XCopperCable) arguments.get(4),
					(XContainer) arguments.get(5), (Device) arguments.get(6), (XDeviceToDevice) arguments.get(7));
		case RulesPackage.XDUPLEX_COPPER_CABLE_RULE___IS_APPLICABLE_CHECK_CSP_FWD__CSP:
			return isApplicable_checkCsp_FWD((CSP) arguments.get(0));
		case RulesPackage.XDUPLEX_COPPER_CABLE_RULE___REGISTER_OBJECTS_FWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT:
			registerObjects_FWD((PerformRuleResult) arguments.get(0), (EObject) arguments.get(1),
					(EObject) arguments.get(2), (EObject) arguments.get(3), (EObject) arguments.get(4),
					(EObject) arguments.get(5), (EObject) arguments.get(6), (EObject) arguments.get(7),
					(EObject) arguments.get(8), (EObject) arguments.get(9), (EObject) arguments.get(10),
					(EObject) arguments.get(11));
			return null;
		case RulesPackage.XDUPLEX_COPPER_CABLE_RULE___CHECK_TYPES_FWD__MATCH:
			return checkTypes_FWD((Match) arguments.get(0));
		case RulesPackage.XDUPLEX_COPPER_CABLE_RULE___IS_APPROPRIATE_BWD__MATCH_COPPERCABLE_CONTAINER_GLASSFIBERCABLE_DEVICE:
			return isAppropriate_BWD((Match) arguments.get(0), (CopperCable) arguments.get(1),
					(Container) arguments.get(2), (GlassFiberCable) arguments.get(3), (Device) arguments.get(4));
		case RulesPackage.XDUPLEX_COPPER_CABLE_RULE___PERFORM_BWD__ISAPPLICABLEMATCH:
			return perform_BWD((IsApplicableMatch) arguments.get(0));
		case RulesPackage.XDUPLEX_COPPER_CABLE_RULE___IS_APPLICABLE_BWD__MATCH:
			return isApplicable_BWD((Match) arguments.get(0));
		case RulesPackage.XDUPLEX_COPPER_CABLE_RULE___REGISTER_OBJECTS_TO_MATCH_BWD__MATCH_COPPERCABLE_CONTAINER_GLASSFIBERCABLE_DEVICE:
			registerObjectsToMatch_BWD((Match) arguments.get(0), (CopperCable) arguments.get(1),
					(Container) arguments.get(2), (GlassFiberCable) arguments.get(3), (Device) arguments.get(4));
			return null;
		case RulesPackage.XDUPLEX_COPPER_CABLE_RULE___IS_APPROPRIATE_SOLVE_CSP_BWD__MATCH_COPPERCABLE_CONTAINER_GLASSFIBERCABLE_DEVICE:
			return isAppropriate_solveCsp_BWD((Match) arguments.get(0), (CopperCable) arguments.get(1),
					(Container) arguments.get(2), (GlassFiberCable) arguments.get(3), (Device) arguments.get(4));
		case RulesPackage.XDUPLEX_COPPER_CABLE_RULE___IS_APPROPRIATE_CHECK_CSP_BWD__CSP:
			return isAppropriate_checkCsp_BWD((CSP) arguments.get(0));
		case RulesPackage.XDUPLEX_COPPER_CABLE_RULE___IS_APPLICABLE_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_COPPERCABLE_CONTAINER_GLASSFIBERCABLE_XDEVICE_XCONTAINER_DEVICE_XDEVICETODEVICE:
			return isApplicable_solveCsp_BWD((IsApplicableMatch) arguments.get(0), (CopperCable) arguments.get(1),
					(Container) arguments.get(2), (GlassFiberCable) arguments.get(3), (XDevice) arguments.get(4),
					(XContainer) arguments.get(5), (Device) arguments.get(6), (XDeviceToDevice) arguments.get(7));
		case RulesPackage.XDUPLEX_COPPER_CABLE_RULE___IS_APPLICABLE_CHECK_CSP_BWD__CSP:
			return isApplicable_checkCsp_BWD((CSP) arguments.get(0));
		case RulesPackage.XDUPLEX_COPPER_CABLE_RULE___REGISTER_OBJECTS_BWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT:
			registerObjects_BWD((PerformRuleResult) arguments.get(0), (EObject) arguments.get(1),
					(EObject) arguments.get(2), (EObject) arguments.get(3), (EObject) arguments.get(4),
					(EObject) arguments.get(5), (EObject) arguments.get(6), (EObject) arguments.get(7),
					(EObject) arguments.get(8), (EObject) arguments.get(9), (EObject) arguments.get(10),
					(EObject) arguments.get(11));
			return null;
		case RulesPackage.XDUPLEX_COPPER_CABLE_RULE___CHECK_TYPES_BWD__MATCH:
			return checkTypes_BWD((Match) arguments.get(0));
		case RulesPackage.XDUPLEX_COPPER_CABLE_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_16__EMOFLONEDGE:
			return isAppropriate_BWD_EMoflonEdge_16((EMoflonEdge) arguments.get(0));
		case RulesPackage.XDUPLEX_COPPER_CABLE_RULE___IS_APPROPRIATE_FWD_EMOFLON_EDGE_12__EMOFLONEDGE:
			return isAppropriate_FWD_EMoflonEdge_12((EMoflonEdge) arguments.get(0));
		case RulesPackage.XDUPLEX_COPPER_CABLE_RULE___CHECK_ATTRIBUTES_FWD__TRIPLEMATCH:
			return checkAttributes_FWD((TripleMatch) arguments.get(0));
		case RulesPackage.XDUPLEX_COPPER_CABLE_RULE___CHECK_ATTRIBUTES_BWD__TRIPLEMATCH:
			return checkAttributes_BWD((TripleMatch) arguments.get(0));
		case RulesPackage.XDUPLEX_COPPER_CABLE_RULE___IS_APPLICABLE_CC__MATCH_MATCH:
			return isApplicable_CC((Match) arguments.get(0), (Match) arguments.get(1));
		case RulesPackage.XDUPLEX_COPPER_CABLE_RULE___IS_APPLICABLE_SOLVE_CSP_CC__COPPERCABLE_CONTAINER_GLASSFIBERCABLE_CABLEATTRIBUTES_XDEVICE_XCOPPERCABLE_XCONTAINER_DEVICE_MATCH_MATCH:
			return isApplicable_solveCsp_CC((CopperCable) arguments.get(0), (Container) arguments.get(1),
					(GlassFiberCable) arguments.get(2), (CableAttributes) arguments.get(3), (XDevice) arguments.get(4),
					(XCopperCable) arguments.get(5), (XContainer) arguments.get(6), (Device) arguments.get(7),
					(Match) arguments.get(8), (Match) arguments.get(9));
		case RulesPackage.XDUPLEX_COPPER_CABLE_RULE___IS_APPLICABLE_CHECK_CSP_CC__CSP:
			return isApplicable_checkCsp_CC((CSP) arguments.get(0));
		case RulesPackage.XDUPLEX_COPPER_CABLE_RULE___CHECK_DEC_FWD__CABLEATTRIBUTES_XDEVICE_XCOPPERCABLE_XCONTAINER:
			return checkDEC_FWD((CableAttributes) arguments.get(0), (XDevice) arguments.get(1),
					(XCopperCable) arguments.get(2), (XContainer) arguments.get(3));
		case RulesPackage.XDUPLEX_COPPER_CABLE_RULE___CHECK_DEC_BWD__COPPERCABLE_CONTAINER_GLASSFIBERCABLE_DEVICE:
			return checkDEC_BWD((CopperCable) arguments.get(0), (Container) arguments.get(1),
					(GlassFiberCable) arguments.get(2), (Device) arguments.get(3));
		case RulesPackage.XDUPLEX_COPPER_CABLE_RULE___GENERATE_MODEL__RULEENTRYCONTAINER_XDEVICETODEVICE:
			return generateModel((RuleEntryContainer) arguments.get(0), (XDeviceToDevice) arguments.get(1));
		case RulesPackage.XDUPLEX_COPPER_CABLE_RULE___GENERATE_MODEL_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_CONTAINER_XDEVICE_XCONTAINER_DEVICE_XDEVICETODEVICE_MODELGENERATORRULERESULT:
			return generateModel_solveCsp_BWD((IsApplicableMatch) arguments.get(0), (Container) arguments.get(1),
					(XDevice) arguments.get(2), (XContainer) arguments.get(3), (Device) arguments.get(4),
					(XDeviceToDevice) arguments.get(5), (ModelgeneratorRuleResult) arguments.get(6));
		case RulesPackage.XDUPLEX_COPPER_CABLE_RULE___GENERATE_MODEL_CHECK_CSP_BWD__CSP:
			return generateModel_checkCsp_BWD((CSP) arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
	}

	public static final Object[] pattern_XDuplexCopperCableRule_0_1_initialbindings_blackBBBBBB(
			XDuplexCopperCableRule _this, Match match, CableAttributes cableAttributes, XDevice xDevice,
			XCopperCable xCable, XContainer xContainer) {
		return new Object[] { _this, match, cableAttributes, xDevice, xCable, xContainer };
	}

	public static final Object[] pattern_XDuplexCopperCableRule_0_2_SolveCSP_bindingFBBBBBB(
			XDuplexCopperCableRule _this, Match match, CableAttributes cableAttributes, XDevice xDevice,
			XCopperCable xCable, XContainer xContainer) {
		CSP _localVariable_0 = _this.isAppropriate_solveCsp_FWD(match, cableAttributes, xDevice, xCable, xContainer);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, match, cableAttributes, xDevice, xCable, xContainer };
		}
		return null;
	}

	public static final Object[] pattern_XDuplexCopperCableRule_0_2_SolveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_XDuplexCopperCableRule_0_2_SolveCSP_bindingAndBlackFBBBBBB(
			XDuplexCopperCableRule _this, Match match, CableAttributes cableAttributes, XDevice xDevice,
			XCopperCable xCable, XContainer xContainer) {
		Object[] result_pattern_XDuplexCopperCableRule_0_2_SolveCSP_binding = pattern_XDuplexCopperCableRule_0_2_SolveCSP_bindingFBBBBBB(
				_this, match, cableAttributes, xDevice, xCable, xContainer);
		if (result_pattern_XDuplexCopperCableRule_0_2_SolveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_XDuplexCopperCableRule_0_2_SolveCSP_binding[0];

			Object[] result_pattern_XDuplexCopperCableRule_0_2_SolveCSP_black = pattern_XDuplexCopperCableRule_0_2_SolveCSP_blackB(
					csp);
			if (result_pattern_XDuplexCopperCableRule_0_2_SolveCSP_black != null) {

				return new Object[] { csp, _this, match, cableAttributes, xDevice, xCable, xContainer };
			}
		}
		return null;
	}

	public static final boolean pattern_XDuplexCopperCableRule_0_3_CheckCSP_expressionFBB(XDuplexCopperCableRule _this,
			CSP csp) {
		boolean _localVariable_0 = _this.isAppropriate_checkCsp_FWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_XDuplexCopperCableRule_0_4_collectelementstobetranslated_blackBBBBB(
			Match match, CableAttributes cableAttributes, XDevice xDevice, XCopperCable xCable, XContainer xContainer) {
		return new Object[] { match, cableAttributes, xDevice, xCable, xContainer };
	}

	public static final Object[] pattern_XDuplexCopperCableRule_0_4_collectelementstobetranslated_greenBBBBFF(
			Match match, CableAttributes cableAttributes, XCopperCable xCable, XContainer xContainer) {
		EMoflonEdge xContainer__xCable____elements = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge xCable__cableAttributes____cableAttributes = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		match.getToBeTranslatedNodes().add(cableAttributes);
		match.getToBeTranslatedNodes().add(xCable);
		String xContainer__xCable____elements_name_prime = "elements";
		String xCable__cableAttributes____cableAttributes_name_prime = "cableAttributes";
		xContainer__xCable____elements.setSrc(xContainer);
		xContainer__xCable____elements.setTrg(xCable);
		match.getToBeTranslatedEdges().add(xContainer__xCable____elements);
		xCable__cableAttributes____cableAttributes.setSrc(xCable);
		xCable__cableAttributes____cableAttributes.setTrg(cableAttributes);
		match.getToBeTranslatedEdges().add(xCable__cableAttributes____cableAttributes);
		xContainer__xCable____elements.setName(xContainer__xCable____elements_name_prime);
		xCable__cableAttributes____cableAttributes.setName(xCable__cableAttributes____cableAttributes_name_prime);
		return new Object[] { match, cableAttributes, xCable, xContainer, xContainer__xCable____elements,
				xCable__cableAttributes____cableAttributes };
	}

	public static final Object[] pattern_XDuplexCopperCableRule_0_5_collectcontextelements_blackBBBBB(Match match,
			CableAttributes cableAttributes, XDevice xDevice, XCopperCable xCable, XContainer xContainer) {
		return new Object[] { match, cableAttributes, xDevice, xCable, xContainer };
	}

	public static final Object[] pattern_XDuplexCopperCableRule_0_5_collectcontextelements_greenBBBF(Match match,
			XDevice xDevice, XContainer xContainer) {
		EMoflonEdge xContainer__xDevice____elements = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		match.getContextNodes().add(xDevice);
		match.getContextNodes().add(xContainer);
		String xContainer__xDevice____elements_name_prime = "elements";
		xContainer__xDevice____elements.setSrc(xContainer);
		xContainer__xDevice____elements.setTrg(xDevice);
		match.getContextEdges().add(xContainer__xDevice____elements);
		xContainer__xDevice____elements.setName(xContainer__xDevice____elements_name_prime);
		return new Object[] { match, xDevice, xContainer, xContainer__xDevice____elements };
	}

	public static final void pattern_XDuplexCopperCableRule_0_6_registerobjectstomatch_expressionBBBBBB(
			XDuplexCopperCableRule _this, Match match, CableAttributes cableAttributes, XDevice xDevice,
			XCopperCable xCable, XContainer xContainer) {
		_this.registerObjectsToMatch_FWD(match, cableAttributes, xDevice, xCable, xContainer);

	}

	public static final boolean pattern_XDuplexCopperCableRule_0_7_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_XDuplexCopperCableRule_0_8_expressionF() {
		boolean _result = Boolean.valueOf(false);
		return _result;
	}

	public static final Object[] pattern_XDuplexCopperCableRule_1_1_performtransformation_bindingFFFFFFFB(
			IsApplicableMatch isApplicableMatch) {
		EObject _localVariable_0 = isApplicableMatch.getObject("container");
		EObject _localVariable_1 = isApplicableMatch.getObject("cableAttributes");
		EObject _localVariable_2 = isApplicableMatch.getObject("xDevice");
		EObject _localVariable_3 = isApplicableMatch.getObject("xCable");
		EObject _localVariable_4 = isApplicableMatch.getObject("xContainer");
		EObject _localVariable_5 = isApplicableMatch.getObject("device");
		EObject _localVariable_6 = isApplicableMatch.getObject("xDeviceToDevice");
		EObject tmpContainer = _localVariable_0;
		EObject tmpCableAttributes = _localVariable_1;
		EObject tmpXDevice = _localVariable_2;
		EObject tmpXCable = _localVariable_3;
		EObject tmpXContainer = _localVariable_4;
		EObject tmpDevice = _localVariable_5;
		EObject tmpXDeviceToDevice = _localVariable_6;
		if (tmpContainer instanceof Container) {
			Container container = (Container) tmpContainer;
			if (tmpCableAttributes instanceof CableAttributes) {
				CableAttributes cableAttributes = (CableAttributes) tmpCableAttributes;
				if (tmpXDevice instanceof XDevice) {
					XDevice xDevice = (XDevice) tmpXDevice;
					if (tmpXCable instanceof XCopperCable) {
						XCopperCable xCable = (XCopperCable) tmpXCable;
						if (tmpXContainer instanceof XContainer) {
							XContainer xContainer = (XContainer) tmpXContainer;
							if (tmpDevice instanceof Device) {
								Device device = (Device) tmpDevice;
								if (tmpXDeviceToDevice instanceof XDeviceToDevice) {
									XDeviceToDevice xDeviceToDevice = (XDeviceToDevice) tmpXDeviceToDevice;
									return new Object[] { container, cableAttributes, xDevice, xCable, xContainer,
											device, xDeviceToDevice, isApplicableMatch };
								}
							}
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_XDuplexCopperCableRule_1_1_performtransformation_blackBBBBBBBFBB(
			Container container, CableAttributes cableAttributes, XDevice xDevice, XCopperCable xCable,
			XContainer xContainer, Device device, XDeviceToDevice xDeviceToDevice, XDuplexCopperCableRule _this,
			IsApplicableMatch isApplicableMatch) {
		for (EObject tmpCsp : isApplicableMatch.getAttributeInfo()) {
			if (tmpCsp instanceof CSP) {
				CSP csp = (CSP) tmpCsp;
				return new Object[] { container, cableAttributes, xDevice, xCable, xContainer, device, xDeviceToDevice,
						csp, _this, isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_XDuplexCopperCableRule_1_1_performtransformation_bindingAndBlackFFFFFFFFBB(
			XDuplexCopperCableRule _this, IsApplicableMatch isApplicableMatch) {
		Object[] result_pattern_XDuplexCopperCableRule_1_1_performtransformation_binding = pattern_XDuplexCopperCableRule_1_1_performtransformation_bindingFFFFFFFB(
				isApplicableMatch);
		if (result_pattern_XDuplexCopperCableRule_1_1_performtransformation_binding != null) {
			Container container = (Container) result_pattern_XDuplexCopperCableRule_1_1_performtransformation_binding[0];
			CableAttributes cableAttributes = (CableAttributes) result_pattern_XDuplexCopperCableRule_1_1_performtransformation_binding[1];
			XDevice xDevice = (XDevice) result_pattern_XDuplexCopperCableRule_1_1_performtransformation_binding[2];
			XCopperCable xCable = (XCopperCable) result_pattern_XDuplexCopperCableRule_1_1_performtransformation_binding[3];
			XContainer xContainer = (XContainer) result_pattern_XDuplexCopperCableRule_1_1_performtransformation_binding[4];
			Device device = (Device) result_pattern_XDuplexCopperCableRule_1_1_performtransformation_binding[5];
			XDeviceToDevice xDeviceToDevice = (XDeviceToDevice) result_pattern_XDuplexCopperCableRule_1_1_performtransformation_binding[6];

			Object[] result_pattern_XDuplexCopperCableRule_1_1_performtransformation_black = pattern_XDuplexCopperCableRule_1_1_performtransformation_blackBBBBBBBFBB(
					container, cableAttributes, xDevice, xCable, xContainer, device, xDeviceToDevice, _this,
					isApplicableMatch);
			if (result_pattern_XDuplexCopperCableRule_1_1_performtransformation_black != null) {
				CSP csp = (CSP) result_pattern_XDuplexCopperCableRule_1_1_performtransformation_black[7];

				return new Object[] { container, cableAttributes, xDevice, xCable, xContainer, device, xDeviceToDevice,
						csp, _this, isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_XDuplexCopperCableRule_1_1_performtransformation_greenFBFBFFB(
			Container container, XCopperCable xCable, CSP csp) {
		CopperCable cable1 = ImplementationFactory.eINSTANCE.createCopperCable();
		GlassFiberCable cable2 = ImplementationFactory.eINSTANCE.createGlassFiberCable();
		XCableToCable xCableToCable = ImplementationTransformatorFactory.eINSTANCE.createXCableToCable();
		XCableToCable xCableToCable2 = ImplementationTransformatorFactory.eINSTANCE.createXCableToCable();
		Object _localVariable_0 = csp.getValue("cable1", "speed");
		Object _localVariable_1 = csp.getValue("cable2", "speed");
		container.getCables().add(cable1);
		container.getCables().add(cable2);
		xCableToCable.setSource(xCable);
		xCableToCable.setTarget(cable1);
		xCableToCable2.setTarget(cable2);
		xCableToCable2.setSource(xCable);
		BigInteger cable1_speed_prime = (BigInteger) _localVariable_0;
		BigInteger cable2_speed_prime = (BigInteger) _localVariable_1;
		cable1.setSpeed(cable1_speed_prime);
		cable2.setSpeed(cable2_speed_prime);
		return new Object[] { cable1, container, cable2, xCable, xCableToCable, xCableToCable2, csp };
	}

	public static final Object[] pattern_XDuplexCopperCableRule_1_2_collecttranslatedelements_blackBBBBBB(
			CopperCable cable1, GlassFiberCable cable2, CableAttributes cableAttributes, XCopperCable xCable,
			XCableToCable xCableToCable, XCableToCable xCableToCable2) {
		if (!xCableToCable.equals(xCableToCable2)) {
			return new Object[] { cable1, cable2, cableAttributes, xCable, xCableToCable, xCableToCable2 };
		}
		return null;
	}

	public static final Object[] pattern_XDuplexCopperCableRule_1_2_collecttranslatedelements_greenFBBBBBB(
			CopperCable cable1, GlassFiberCable cable2, CableAttributes cableAttributes, XCopperCable xCable,
			XCableToCable xCableToCable, XCableToCable xCableToCable2) {
		PerformRuleResult ruleresult = RuntimeFactory.eINSTANCE.createPerformRuleResult();
		ruleresult.getCreatedElements().add(cable1);
		ruleresult.getCreatedElements().add(cable2);
		ruleresult.getTranslatedElements().add(cableAttributes);
		ruleresult.getTranslatedElements().add(xCable);
		ruleresult.getCreatedLinkElements().add(xCableToCable);
		ruleresult.getCreatedLinkElements().add(xCableToCable2);
		return new Object[] { ruleresult, cable1, cable2, cableAttributes, xCable, xCableToCable, xCableToCable2 };
	}

	public static final Object[] pattern_XDuplexCopperCableRule_1_3_bookkeepingforedges_blackBBBBBBBBBBBB(
			PerformRuleResult ruleresult, EObject cable1, EObject container, EObject cable2, EObject cableAttributes,
			EObject xDevice, EObject xCable, EObject xContainer, EObject xCableToCable, EObject xCableToCable2,
			EObject device, EObject xDeviceToDevice) {
		if (!cable1.equals(container)) {
			if (!cable1.equals(cable2)) {
				if (!cable1.equals(cableAttributes)) {
					if (!cable1.equals(xDevice)) {
						if (!cable1.equals(xCable)) {
							if (!cable1.equals(xContainer)) {
								if (!cable1.equals(xCableToCable)) {
									if (!cable1.equals(xCableToCable2)) {
										if (!cable1.equals(device)) {
											if (!cable1.equals(xDeviceToDevice)) {
												if (!container.equals(xDevice)) {
													if (!container.equals(xCable)) {
														if (!container.equals(xContainer)) {
															if (!container.equals(xCableToCable)) {
																if (!container.equals(xCableToCable2)) {
																	if (!container.equals(device)) {
																		if (!container.equals(xDeviceToDevice)) {
																			if (!cable2.equals(container)) {
																				if (!cable2.equals(cableAttributes)) {
																					if (!cable2.equals(xDevice)) {
																						if (!cable2.equals(xCable)) {
																							if (!cable2.equals(
																									xContainer)) {
																								if (!cable2.equals(
																										xCableToCable)) {
																									if (!cable2.equals(
																											xCableToCable2)) {
																										if (!cable2
																												.equals(device)) {
																											if (!cable2
																													.equals(xDeviceToDevice)) {
																												if (!cableAttributes
																														.equals(container)) {
																													if (!cableAttributes
																															.equals(xDevice)) {
																														if (!cableAttributes
																																.equals(xCable)) {
																															if (!cableAttributes
																																	.equals(xContainer)) {
																																if (!cableAttributes
																																		.equals(xCableToCable)) {
																																	if (!cableAttributes
																																			.equals(xCableToCable2)) {
																																		if (!cableAttributes
																																				.equals(device)) {
																																			if (!cableAttributes
																																					.equals(xDeviceToDevice)) {
																																				if (!xDevice
																																						.equals(xDeviceToDevice)) {
																																					if (!xCable
																																							.equals(xDevice)) {
																																						if (!xCable
																																								.equals(xContainer)) {
																																							if (!xCable
																																									.equals(xCableToCable)) {
																																								if (!xCable
																																										.equals(xCableToCable2)) {
																																									if (!xCable
																																											.equals(xDeviceToDevice)) {
																																										if (!xContainer
																																												.equals(xDevice)) {
																																											if (!xContainer
																																													.equals(xDeviceToDevice)) {
																																												if (!xCableToCable
																																														.equals(xDevice)) {
																																													if (!xCableToCable
																																															.equals(xContainer)) {
																																														if (!xCableToCable
																																																.equals(xCableToCable2)) {
																																															if (!xCableToCable
																																																	.equals(xDeviceToDevice)) {
																																																if (!xCableToCable2
																																																		.equals(xDevice)) {
																																																	if (!xCableToCable2
																																																			.equals(xContainer)) {
																																																		if (!xCableToCable2
																																																				.equals(xDeviceToDevice)) {
																																																			if (!device
																																																					.equals(xDevice)) {
																																																				if (!device
																																																						.equals(xCable)) {
																																																					if (!device
																																																							.equals(xContainer)) {
																																																						if (!device
																																																								.equals(xCableToCable)) {
																																																							if (!device
																																																									.equals(xCableToCable2)) {
																																																								if (!device
																																																										.equals(xDeviceToDevice)) {
																																																									return new Object[] {
																																																											ruleresult,
																																																											cable1,
																																																											container,
																																																											cable2,
																																																											cableAttributes,
																																																											xDevice,
																																																											xCable,
																																																											xContainer,
																																																											xCableToCable,
																																																											xCableToCable2,
																																																											device,
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
																																			}
																																		}
																																	}
																																}
																															}
																														}
																													}
																												}
																											}
																										}
																									}
																								}
																							}
																						}
																					}
																				}
																			}
																		}
																	}
																}
															}
														}
													}
												}
											}
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

	public static final Object[] pattern_XDuplexCopperCableRule_1_3_bookkeepingforedges_greenBBBBBBBBBFFFFFFFF(
			PerformRuleResult ruleresult, EObject cable1, EObject container, EObject cable2, EObject cableAttributes,
			EObject xCable, EObject xContainer, EObject xCableToCable, EObject xCableToCable2) {
		EMoflonEdge xCableToCable__xCable____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge xCableToCable__cable1____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge container__cable2____cables = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge xCableToCable2__cable2____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge xCableToCable2__xCable____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge xContainer__xCable____elements = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge xCable__cableAttributes____cableAttributes = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge container__cable1____cables = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String ruleresult_ruleName_prime = "XDuplexCopperCableRule";
		String xCableToCable__xCable____source_name_prime = "source";
		String xCableToCable__cable1____target_name_prime = "target";
		String container__cable2____cables_name_prime = "cables";
		String xCableToCable2__cable2____target_name_prime = "target";
		String xCableToCable2__xCable____source_name_prime = "source";
		String xContainer__xCable____elements_name_prime = "elements";
		String xCable__cableAttributes____cableAttributes_name_prime = "cableAttributes";
		String container__cable1____cables_name_prime = "cables";
		xCableToCable__xCable____source.setSrc(xCableToCable);
		xCableToCable__xCable____source.setTrg(xCable);
		ruleresult.getCreatedEdges().add(xCableToCable__xCable____source);
		xCableToCable__cable1____target.setSrc(xCableToCable);
		xCableToCable__cable1____target.setTrg(cable1);
		ruleresult.getCreatedEdges().add(xCableToCable__cable1____target);
		container__cable2____cables.setSrc(container);
		container__cable2____cables.setTrg(cable2);
		ruleresult.getCreatedEdges().add(container__cable2____cables);
		xCableToCable2__cable2____target.setSrc(xCableToCable2);
		xCableToCable2__cable2____target.setTrg(cable2);
		ruleresult.getCreatedEdges().add(xCableToCable2__cable2____target);
		xCableToCable2__xCable____source.setSrc(xCableToCable2);
		xCableToCable2__xCable____source.setTrg(xCable);
		ruleresult.getCreatedEdges().add(xCableToCable2__xCable____source);
		xContainer__xCable____elements.setSrc(xContainer);
		xContainer__xCable____elements.setTrg(xCable);
		ruleresult.getTranslatedEdges().add(xContainer__xCable____elements);
		xCable__cableAttributes____cableAttributes.setSrc(xCable);
		xCable__cableAttributes____cableAttributes.setTrg(cableAttributes);
		ruleresult.getTranslatedEdges().add(xCable__cableAttributes____cableAttributes);
		container__cable1____cables.setSrc(container);
		container__cable1____cables.setTrg(cable1);
		ruleresult.getCreatedEdges().add(container__cable1____cables);
		ruleresult.setRuleName(ruleresult_ruleName_prime);
		xCableToCable__xCable____source.setName(xCableToCable__xCable____source_name_prime);
		xCableToCable__cable1____target.setName(xCableToCable__cable1____target_name_prime);
		container__cable2____cables.setName(container__cable2____cables_name_prime);
		xCableToCable2__cable2____target.setName(xCableToCable2__cable2____target_name_prime);
		xCableToCable2__xCable____source.setName(xCableToCable2__xCable____source_name_prime);
		xContainer__xCable____elements.setName(xContainer__xCable____elements_name_prime);
		xCable__cableAttributes____cableAttributes.setName(xCable__cableAttributes____cableAttributes_name_prime);
		container__cable1____cables.setName(container__cable1____cables_name_prime);
		return new Object[] { ruleresult, cable1, container, cable2, cableAttributes, xCable, xContainer, xCableToCable,
				xCableToCable2, xCableToCable__xCable____source, xCableToCable__cable1____target,
				container__cable2____cables, xCableToCable2__cable2____target, xCableToCable2__xCable____source,
				xContainer__xCable____elements, xCable__cableAttributes____cableAttributes,
				container__cable1____cables };
	}

	public static final void pattern_XDuplexCopperCableRule_1_5_registerobjects_expressionBBBBBBBBBBBBB(
			XDuplexCopperCableRule _this, PerformRuleResult ruleresult, EObject cable1, EObject container,
			EObject cable2, EObject cableAttributes, EObject xDevice, EObject xCable, EObject xContainer,
			EObject xCableToCable, EObject xCableToCable2, EObject device, EObject xDeviceToDevice) {
		_this.registerObjects_FWD(ruleresult, cable1, container, cable2, cableAttributes, xDevice, xCable, xContainer,
				xCableToCable, xCableToCable2, device, xDeviceToDevice);

	}

	public static final PerformRuleResult pattern_XDuplexCopperCableRule_1_6_expressionFB(
			PerformRuleResult ruleresult) {
		PerformRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_XDuplexCopperCableRule_2_1_preparereturnvalue_bindingFB(
			XDuplexCopperCableRule _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass eClass = _localVariable_0;
		if (eClass != null) {
			return new Object[] { eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_XDuplexCopperCableRule_2_1_preparereturnvalue_blackFBB(EClass eClass,
			XDuplexCopperCableRule _this) {
		for (EOperation performOperation : eClass.getEOperations()) {
			String performOperation_name = performOperation.getName();
			if (performOperation_name.equals("perform_FWD")) {
				return new Object[] { performOperation, eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_XDuplexCopperCableRule_2_1_preparereturnvalue_bindingAndBlackFFB(
			XDuplexCopperCableRule _this) {
		Object[] result_pattern_XDuplexCopperCableRule_2_1_preparereturnvalue_binding = pattern_XDuplexCopperCableRule_2_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_XDuplexCopperCableRule_2_1_preparereturnvalue_binding != null) {
			EClass eClass = (EClass) result_pattern_XDuplexCopperCableRule_2_1_preparereturnvalue_binding[0];

			Object[] result_pattern_XDuplexCopperCableRule_2_1_preparereturnvalue_black = pattern_XDuplexCopperCableRule_2_1_preparereturnvalue_blackFBB(
					eClass, _this);
			if (result_pattern_XDuplexCopperCableRule_2_1_preparereturnvalue_black != null) {
				EOperation performOperation = (EOperation) result_pattern_XDuplexCopperCableRule_2_1_preparereturnvalue_black[0];

				return new Object[] { performOperation, eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_XDuplexCopperCableRule_2_1_preparereturnvalue_greenBF(
			EOperation performOperation) {
		IsApplicableRuleResult ruleresult = RuntimeFactory.eINSTANCE.createIsApplicableRuleResult();
		boolean ruleresult_success_prime = Boolean.valueOf(false);
		String ruleresult_rule_prime = "XDuplexCopperCableRule";
		ruleresult.setPerformOperation(performOperation);
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		ruleresult.setRule(ruleresult_rule_prime);
		return new Object[] { performOperation, ruleresult };
	}

	public static final Object[] pattern_XDuplexCopperCableRule_2_2_corematch_bindingFFFFB(Match match) {
		EObject _localVariable_0 = match.getObject("cableAttributes");
		EObject _localVariable_1 = match.getObject("xDevice");
		EObject _localVariable_2 = match.getObject("xCable");
		EObject _localVariable_3 = match.getObject("xContainer");
		EObject tmpCableAttributes = _localVariable_0;
		EObject tmpXDevice = _localVariable_1;
		EObject tmpXCable = _localVariable_2;
		EObject tmpXContainer = _localVariable_3;
		if (tmpCableAttributes instanceof CableAttributes) {
			CableAttributes cableAttributes = (CableAttributes) tmpCableAttributes;
			if (tmpXDevice instanceof XDevice) {
				XDevice xDevice = (XDevice) tmpXDevice;
				if (tmpXCable instanceof XCopperCable) {
					XCopperCable xCable = (XCopperCable) tmpXCable;
					if (tmpXContainer instanceof XContainer) {
						XContainer xContainer = (XContainer) tmpXContainer;
						return new Object[] { cableAttributes, xDevice, xCable, xContainer, match };
					}
				}
			}
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_XDuplexCopperCableRule_2_2_corematch_blackBBBBFFB(
			CableAttributes cableAttributes, XDevice xDevice, XCopperCable xCable, XContainer xContainer, Match match) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		boolean cableAttributes_isDuplex = cableAttributes.isIsDuplex();
		if (Boolean.valueOf(cableAttributes_isDuplex).equals(Boolean.valueOf(true))) {
			for (XDeviceToDevice xDeviceToDevice : org.moflon.core.utilities.eMoflonEMFUtil
					.getOppositeReferenceTyped(xDevice, XDeviceToDevice.class, "source")) {
				Device device = xDeviceToDevice.getTarget();
				if (device != null) {
					_result.add(new Object[] { cableAttributes, xDevice, xCable, xContainer, device, xDeviceToDevice,
							match });
				}

			}
		}

		return _result;
	}

	public static final Iterable<Object[]> pattern_XDuplexCopperCableRule_2_3_findcontext_blackFBBBBBB(
			CableAttributes cableAttributes, XDevice xDevice, XCopperCable xCable, XContainer xContainer, Device device,
			XDeviceToDevice xDeviceToDevice) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (xDevice.equals(xDeviceToDevice.getSource())) {
			if (device.equals(xDeviceToDevice.getTarget())) {
				if (xContainer.getElements().contains(xDevice)) {
					if (xContainer.getElements().contains(xCable)) {
						if (cableAttributes.equals(xCable.getCableAttributes())) {
							boolean cableAttributes_isDuplex = cableAttributes.isIsDuplex();
							if (Boolean.valueOf(cableAttributes_isDuplex).equals(Boolean.valueOf(true))) {
								for (Container container : org.moflon.core.utilities.eMoflonEMFUtil
										.getOppositeReferenceTyped(device, Container.class, "devices")) {
									_result.add(new Object[] { container, cableAttributes, xDevice, xCable, xContainer,
											device, xDeviceToDevice });
								}
							}

						}
					}
				}
			}
		}
		return _result;
	}

	public static final Object[] pattern_XDuplexCopperCableRule_2_3_findcontext_greenBBBBBBBFFFFFFF(Container container,
			CableAttributes cableAttributes, XDevice xDevice, XCopperCable xCable, XContainer xContainer, Device device,
			XDeviceToDevice xDeviceToDevice) {
		IsApplicableMatch isApplicableMatch = RuntimeFactory.eINSTANCE.createIsApplicableMatch();
		EMoflonEdge container__device____devices = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge xDeviceToDevice__xDevice____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge xDeviceToDevice__device____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge xContainer__xDevice____elements = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge xContainer__xCable____elements = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge xCable__cableAttributes____cableAttributes = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String container__device____devices_name_prime = "devices";
		String xDeviceToDevice__xDevice____source_name_prime = "source";
		String xDeviceToDevice__device____target_name_prime = "target";
		String xContainer__xDevice____elements_name_prime = "elements";
		String xContainer__xCable____elements_name_prime = "elements";
		String xCable__cableAttributes____cableAttributes_name_prime = "cableAttributes";
		isApplicableMatch.getAllContextElements().add(container);
		isApplicableMatch.getAllContextElements().add(cableAttributes);
		isApplicableMatch.getAllContextElements().add(xDevice);
		isApplicableMatch.getAllContextElements().add(xCable);
		isApplicableMatch.getAllContextElements().add(xContainer);
		isApplicableMatch.getAllContextElements().add(device);
		isApplicableMatch.getAllContextElements().add(xDeviceToDevice);
		container__device____devices.setSrc(container);
		container__device____devices.setTrg(device);
		isApplicableMatch.getAllContextElements().add(container__device____devices);
		xDeviceToDevice__xDevice____source.setSrc(xDeviceToDevice);
		xDeviceToDevice__xDevice____source.setTrg(xDevice);
		isApplicableMatch.getAllContextElements().add(xDeviceToDevice__xDevice____source);
		xDeviceToDevice__device____target.setSrc(xDeviceToDevice);
		xDeviceToDevice__device____target.setTrg(device);
		isApplicableMatch.getAllContextElements().add(xDeviceToDevice__device____target);
		xContainer__xDevice____elements.setSrc(xContainer);
		xContainer__xDevice____elements.setTrg(xDevice);
		isApplicableMatch.getAllContextElements().add(xContainer__xDevice____elements);
		xContainer__xCable____elements.setSrc(xContainer);
		xContainer__xCable____elements.setTrg(xCable);
		isApplicableMatch.getAllContextElements().add(xContainer__xCable____elements);
		xCable__cableAttributes____cableAttributes.setSrc(xCable);
		xCable__cableAttributes____cableAttributes.setTrg(cableAttributes);
		isApplicableMatch.getAllContextElements().add(xCable__cableAttributes____cableAttributes);
		container__device____devices.setName(container__device____devices_name_prime);
		xDeviceToDevice__xDevice____source.setName(xDeviceToDevice__xDevice____source_name_prime);
		xDeviceToDevice__device____target.setName(xDeviceToDevice__device____target_name_prime);
		xContainer__xDevice____elements.setName(xContainer__xDevice____elements_name_prime);
		xContainer__xCable____elements.setName(xContainer__xCable____elements_name_prime);
		xCable__cableAttributes____cableAttributes.setName(xCable__cableAttributes____cableAttributes_name_prime);
		return new Object[] { container, cableAttributes, xDevice, xCable, xContainer, device, xDeviceToDevice,
				isApplicableMatch, container__device____devices, xDeviceToDevice__xDevice____source,
				xDeviceToDevice__device____target, xContainer__xDevice____elements, xContainer__xCable____elements,
				xCable__cableAttributes____cableAttributes };
	}

	public static final Object[] pattern_XDuplexCopperCableRule_2_4_solveCSP_bindingFBBBBBBBBB(
			XDuplexCopperCableRule _this, IsApplicableMatch isApplicableMatch, Container container,
			CableAttributes cableAttributes, XDevice xDevice, XCopperCable xCable, XContainer xContainer, Device device,
			XDeviceToDevice xDeviceToDevice) {
		CSP _localVariable_0 = _this.isApplicable_solveCsp_FWD(isApplicableMatch, container, cableAttributes, xDevice,
				xCable, xContainer, device, xDeviceToDevice);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, container, cableAttributes, xDevice, xCable,
					xContainer, device, xDeviceToDevice };
		}
		return null;
	}

	public static final Object[] pattern_XDuplexCopperCableRule_2_4_solveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_XDuplexCopperCableRule_2_4_solveCSP_bindingAndBlackFBBBBBBBBB(
			XDuplexCopperCableRule _this, IsApplicableMatch isApplicableMatch, Container container,
			CableAttributes cableAttributes, XDevice xDevice, XCopperCable xCable, XContainer xContainer, Device device,
			XDeviceToDevice xDeviceToDevice) {
		Object[] result_pattern_XDuplexCopperCableRule_2_4_solveCSP_binding = pattern_XDuplexCopperCableRule_2_4_solveCSP_bindingFBBBBBBBBB(
				_this, isApplicableMatch, container, cableAttributes, xDevice, xCable, xContainer, device,
				xDeviceToDevice);
		if (result_pattern_XDuplexCopperCableRule_2_4_solveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_XDuplexCopperCableRule_2_4_solveCSP_binding[0];

			Object[] result_pattern_XDuplexCopperCableRule_2_4_solveCSP_black = pattern_XDuplexCopperCableRule_2_4_solveCSP_blackB(
					csp);
			if (result_pattern_XDuplexCopperCableRule_2_4_solveCSP_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, container, cableAttributes, xDevice, xCable,
						xContainer, device, xDeviceToDevice };
			}
		}
		return null;
	}

	public static final boolean pattern_XDuplexCopperCableRule_2_5_checkCSP_expressionFBB(XDuplexCopperCableRule _this,
			CSP csp) {
		boolean _localVariable_0 = _this.isApplicable_checkCsp_FWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_XDuplexCopperCableRule_2_6_addmatchtoruleresult_blackBB(
			IsApplicableRuleResult ruleresult, IsApplicableMatch isApplicableMatch) {
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final Object[] pattern_XDuplexCopperCableRule_2_6_addmatchtoruleresult_greenBB(
			IsApplicableRuleResult ruleresult, IsApplicableMatch isApplicableMatch) {
		ruleresult.getIsApplicableMatch().add(isApplicableMatch);
		boolean ruleresult_success_prime = Boolean.valueOf(true);
		String isApplicableMatch_ruleName_prime = "XDuplexCopperCableRule";
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		isApplicableMatch.setRuleName(isApplicableMatch_ruleName_prime);
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final IsApplicableRuleResult pattern_XDuplexCopperCableRule_2_7_expressionFB(
			IsApplicableRuleResult ruleresult) {
		IsApplicableRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_XDuplexCopperCableRule_10_1_initialbindings_blackBBBBBB(
			XDuplexCopperCableRule _this, Match match, CopperCable cable1, Container container, GlassFiberCable cable2,
			Device device) {
		return new Object[] { _this, match, cable1, container, cable2, device };
	}

	public static final Object[] pattern_XDuplexCopperCableRule_10_2_SolveCSP_bindingFBBBBBB(
			XDuplexCopperCableRule _this, Match match, CopperCable cable1, Container container, GlassFiberCable cable2,
			Device device) {
		CSP _localVariable_0 = _this.isAppropriate_solveCsp_BWD(match, cable1, container, cable2, device);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, match, cable1, container, cable2, device };
		}
		return null;
	}

	public static final Object[] pattern_XDuplexCopperCableRule_10_2_SolveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_XDuplexCopperCableRule_10_2_SolveCSP_bindingAndBlackFBBBBBB(
			XDuplexCopperCableRule _this, Match match, CopperCable cable1, Container container, GlassFiberCable cable2,
			Device device) {
		Object[] result_pattern_XDuplexCopperCableRule_10_2_SolveCSP_binding = pattern_XDuplexCopperCableRule_10_2_SolveCSP_bindingFBBBBBB(
				_this, match, cable1, container, cable2, device);
		if (result_pattern_XDuplexCopperCableRule_10_2_SolveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_XDuplexCopperCableRule_10_2_SolveCSP_binding[0];

			Object[] result_pattern_XDuplexCopperCableRule_10_2_SolveCSP_black = pattern_XDuplexCopperCableRule_10_2_SolveCSP_blackB(
					csp);
			if (result_pattern_XDuplexCopperCableRule_10_2_SolveCSP_black != null) {

				return new Object[] { csp, _this, match, cable1, container, cable2, device };
			}
		}
		return null;
	}

	public static final boolean pattern_XDuplexCopperCableRule_10_3_CheckCSP_expressionFBB(XDuplexCopperCableRule _this,
			CSP csp) {
		boolean _localVariable_0 = _this.isAppropriate_checkCsp_BWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_XDuplexCopperCableRule_10_4_collectelementstobetranslated_blackBBBBB(
			Match match, CopperCable cable1, Container container, GlassFiberCable cable2, Device device) {
		return new Object[] { match, cable1, container, cable2, device };
	}

	public static final Object[] pattern_XDuplexCopperCableRule_10_4_collectelementstobetranslated_greenBBBBFF(
			Match match, CopperCable cable1, Container container, GlassFiberCable cable2) {
		EMoflonEdge container__cable2____cables = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge container__cable1____cables = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		match.getToBeTranslatedNodes().add(cable1);
		match.getToBeTranslatedNodes().add(cable2);
		String container__cable2____cables_name_prime = "cables";
		String container__cable1____cables_name_prime = "cables";
		container__cable2____cables.setSrc(container);
		container__cable2____cables.setTrg(cable2);
		match.getToBeTranslatedEdges().add(container__cable2____cables);
		container__cable1____cables.setSrc(container);
		container__cable1____cables.setTrg(cable1);
		match.getToBeTranslatedEdges().add(container__cable1____cables);
		container__cable2____cables.setName(container__cable2____cables_name_prime);
		container__cable1____cables.setName(container__cable1____cables_name_prime);
		return new Object[] { match, cable1, container, cable2, container__cable2____cables,
				container__cable1____cables };
	}

	public static final Object[] pattern_XDuplexCopperCableRule_10_5_collectcontextelements_blackBBBBB(Match match,
			CopperCable cable1, Container container, GlassFiberCable cable2, Device device) {
		return new Object[] { match, cable1, container, cable2, device };
	}

	public static final Object[] pattern_XDuplexCopperCableRule_10_5_collectcontextelements_greenBBBF(Match match,
			Container container, Device device) {
		EMoflonEdge container__device____devices = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		match.getContextNodes().add(container);
		match.getContextNodes().add(device);
		String container__device____devices_name_prime = "devices";
		container__device____devices.setSrc(container);
		container__device____devices.setTrg(device);
		match.getContextEdges().add(container__device____devices);
		container__device____devices.setName(container__device____devices_name_prime);
		return new Object[] { match, container, device, container__device____devices };
	}

	public static final void pattern_XDuplexCopperCableRule_10_6_registerobjectstomatch_expressionBBBBBB(
			XDuplexCopperCableRule _this, Match match, CopperCable cable1, Container container, GlassFiberCable cable2,
			Device device) {
		_this.registerObjectsToMatch_BWD(match, cable1, container, cable2, device);

	}

	public static final boolean pattern_XDuplexCopperCableRule_10_7_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_XDuplexCopperCableRule_10_8_expressionF() {
		boolean _result = Boolean.valueOf(false);
		return _result;
	}

	public static final Object[] pattern_XDuplexCopperCableRule_11_1_performtransformation_bindingFFFFFFFB(
			IsApplicableMatch isApplicableMatch) {
		EObject _localVariable_0 = isApplicableMatch.getObject("cable1");
		EObject _localVariable_1 = isApplicableMatch.getObject("container");
		EObject _localVariable_2 = isApplicableMatch.getObject("cable2");
		EObject _localVariable_3 = isApplicableMatch.getObject("xDevice");
		EObject _localVariable_4 = isApplicableMatch.getObject("xContainer");
		EObject _localVariable_5 = isApplicableMatch.getObject("device");
		EObject _localVariable_6 = isApplicableMatch.getObject("xDeviceToDevice");
		EObject tmpCable1 = _localVariable_0;
		EObject tmpContainer = _localVariable_1;
		EObject tmpCable2 = _localVariable_2;
		EObject tmpXDevice = _localVariable_3;
		EObject tmpXContainer = _localVariable_4;
		EObject tmpDevice = _localVariable_5;
		EObject tmpXDeviceToDevice = _localVariable_6;
		if (tmpCable1 instanceof CopperCable) {
			CopperCable cable1 = (CopperCable) tmpCable1;
			if (tmpContainer instanceof Container) {
				Container container = (Container) tmpContainer;
				if (tmpCable2 instanceof GlassFiberCable) {
					GlassFiberCable cable2 = (GlassFiberCable) tmpCable2;
					if (tmpXDevice instanceof XDevice) {
						XDevice xDevice = (XDevice) tmpXDevice;
						if (tmpXContainer instanceof XContainer) {
							XContainer xContainer = (XContainer) tmpXContainer;
							if (tmpDevice instanceof Device) {
								Device device = (Device) tmpDevice;
								if (tmpXDeviceToDevice instanceof XDeviceToDevice) {
									XDeviceToDevice xDeviceToDevice = (XDeviceToDevice) tmpXDeviceToDevice;
									return new Object[] { cable1, container, cable2, xDevice, xContainer, device,
											xDeviceToDevice, isApplicableMatch };
								}
							}
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_XDuplexCopperCableRule_11_1_performtransformation_blackBBBBBBBFBB(
			CopperCable cable1, Container container, GlassFiberCable cable2, XDevice xDevice, XContainer xContainer,
			Device device, XDeviceToDevice xDeviceToDevice, XDuplexCopperCableRule _this,
			IsApplicableMatch isApplicableMatch) {
		for (EObject tmpCsp : isApplicableMatch.getAttributeInfo()) {
			if (tmpCsp instanceof CSP) {
				CSP csp = (CSP) tmpCsp;
				return new Object[] { cable1, container, cable2, xDevice, xContainer, device, xDeviceToDevice, csp,
						_this, isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_XDuplexCopperCableRule_11_1_performtransformation_bindingAndBlackFFFFFFFFBB(
			XDuplexCopperCableRule _this, IsApplicableMatch isApplicableMatch) {
		Object[] result_pattern_XDuplexCopperCableRule_11_1_performtransformation_binding = pattern_XDuplexCopperCableRule_11_1_performtransformation_bindingFFFFFFFB(
				isApplicableMatch);
		if (result_pattern_XDuplexCopperCableRule_11_1_performtransformation_binding != null) {
			CopperCable cable1 = (CopperCable) result_pattern_XDuplexCopperCableRule_11_1_performtransformation_binding[0];
			Container container = (Container) result_pattern_XDuplexCopperCableRule_11_1_performtransformation_binding[1];
			GlassFiberCable cable2 = (GlassFiberCable) result_pattern_XDuplexCopperCableRule_11_1_performtransformation_binding[2];
			XDevice xDevice = (XDevice) result_pattern_XDuplexCopperCableRule_11_1_performtransformation_binding[3];
			XContainer xContainer = (XContainer) result_pattern_XDuplexCopperCableRule_11_1_performtransformation_binding[4];
			Device device = (Device) result_pattern_XDuplexCopperCableRule_11_1_performtransformation_binding[5];
			XDeviceToDevice xDeviceToDevice = (XDeviceToDevice) result_pattern_XDuplexCopperCableRule_11_1_performtransformation_binding[6];

			Object[] result_pattern_XDuplexCopperCableRule_11_1_performtransformation_black = pattern_XDuplexCopperCableRule_11_1_performtransformation_blackBBBBBBBFBB(
					cable1, container, cable2, xDevice, xContainer, device, xDeviceToDevice, _this, isApplicableMatch);
			if (result_pattern_XDuplexCopperCableRule_11_1_performtransformation_black != null) {
				CSP csp = (CSP) result_pattern_XDuplexCopperCableRule_11_1_performtransformation_black[7];

				return new Object[] { cable1, container, cable2, xDevice, xContainer, device, xDeviceToDevice, csp,
						_this, isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_XDuplexCopperCableRule_11_1_performtransformation_greenBBFFBFFB(
			CopperCable cable1, GlassFiberCable cable2, XContainer xContainer, CSP csp) {
		CableAttributes cableAttributes = XtextImplFactory.eINSTANCE.createCableAttributes();
		XCopperCable xCable = XtextImplFactory.eINSTANCE.createXCopperCable();
		XCableToCable xCableToCable = ImplementationTransformatorFactory.eINSTANCE.createXCableToCable();
		XCableToCable xCableToCable2 = ImplementationTransformatorFactory.eINSTANCE.createXCableToCable();
		boolean cableAttributes_isDuplex_prime = Boolean.valueOf(true);
		Object _localVariable_0 = csp.getValue("cableAttributes", "speed");
		xContainer.getElements().add(xCable);
		xCable.setCableAttributes(cableAttributes);
		xCableToCable.setSource(xCable);
		xCableToCable.setTarget(cable1);
		xCableToCable2.setTarget(cable2);
		xCableToCable2.setSource(xCable);
		cableAttributes.setIsDuplex(Boolean.valueOf(cableAttributes_isDuplex_prime));
		BigInteger cableAttributes_speed_prime = (BigInteger) _localVariable_0;
		cableAttributes.setSpeed(cableAttributes_speed_prime);
		return new Object[] { cable1, cable2, cableAttributes, xCable, xContainer, xCableToCable, xCableToCable2, csp };
	}

	public static final Object[] pattern_XDuplexCopperCableRule_11_2_collecttranslatedelements_blackBBBBBB(
			CopperCable cable1, GlassFiberCable cable2, CableAttributes cableAttributes, XCopperCable xCable,
			XCableToCable xCableToCable, XCableToCable xCableToCable2) {
		if (!xCableToCable.equals(xCableToCable2)) {
			return new Object[] { cable1, cable2, cableAttributes, xCable, xCableToCable, xCableToCable2 };
		}
		return null;
	}

	public static final Object[] pattern_XDuplexCopperCableRule_11_2_collecttranslatedelements_greenFBBBBBB(
			CopperCable cable1, GlassFiberCable cable2, CableAttributes cableAttributes, XCopperCable xCable,
			XCableToCable xCableToCable, XCableToCable xCableToCable2) {
		PerformRuleResult ruleresult = RuntimeFactory.eINSTANCE.createPerformRuleResult();
		ruleresult.getTranslatedElements().add(cable1);
		ruleresult.getTranslatedElements().add(cable2);
		ruleresult.getCreatedElements().add(cableAttributes);
		ruleresult.getCreatedElements().add(xCable);
		ruleresult.getCreatedLinkElements().add(xCableToCable);
		ruleresult.getCreatedLinkElements().add(xCableToCable2);
		return new Object[] { ruleresult, cable1, cable2, cableAttributes, xCable, xCableToCable, xCableToCable2 };
	}

	public static final Object[] pattern_XDuplexCopperCableRule_11_3_bookkeepingforedges_blackBBBBBBBBBBBB(
			PerformRuleResult ruleresult, EObject cable1, EObject container, EObject cable2, EObject cableAttributes,
			EObject xDevice, EObject xCable, EObject xContainer, EObject xCableToCable, EObject xCableToCable2,
			EObject device, EObject xDeviceToDevice) {
		if (!cable1.equals(container)) {
			if (!cable1.equals(cable2)) {
				if (!cable1.equals(cableAttributes)) {
					if (!cable1.equals(xDevice)) {
						if (!cable1.equals(xCable)) {
							if (!cable1.equals(xContainer)) {
								if (!cable1.equals(xCableToCable)) {
									if (!cable1.equals(xCableToCable2)) {
										if (!cable1.equals(device)) {
											if (!cable1.equals(xDeviceToDevice)) {
												if (!container.equals(xDevice)) {
													if (!container.equals(xCable)) {
														if (!container.equals(xContainer)) {
															if (!container.equals(xCableToCable)) {
																if (!container.equals(xCableToCable2)) {
																	if (!container.equals(device)) {
																		if (!container.equals(xDeviceToDevice)) {
																			if (!cable2.equals(container)) {
																				if (!cable2.equals(cableAttributes)) {
																					if (!cable2.equals(xDevice)) {
																						if (!cable2.equals(xCable)) {
																							if (!cable2.equals(
																									xContainer)) {
																								if (!cable2.equals(
																										xCableToCable)) {
																									if (!cable2.equals(
																											xCableToCable2)) {
																										if (!cable2
																												.equals(device)) {
																											if (!cable2
																													.equals(xDeviceToDevice)) {
																												if (!cableAttributes
																														.equals(container)) {
																													if (!cableAttributes
																															.equals(xDevice)) {
																														if (!cableAttributes
																																.equals(xCable)) {
																															if (!cableAttributes
																																	.equals(xContainer)) {
																																if (!cableAttributes
																																		.equals(xCableToCable)) {
																																	if (!cableAttributes
																																			.equals(xCableToCable2)) {
																																		if (!cableAttributes
																																				.equals(device)) {
																																			if (!cableAttributes
																																					.equals(xDeviceToDevice)) {
																																				if (!xDevice
																																						.equals(xDeviceToDevice)) {
																																					if (!xCable
																																							.equals(xDevice)) {
																																						if (!xCable
																																								.equals(xContainer)) {
																																							if (!xCable
																																									.equals(xCableToCable)) {
																																								if (!xCable
																																										.equals(xCableToCable2)) {
																																									if (!xCable
																																											.equals(xDeviceToDevice)) {
																																										if (!xContainer
																																												.equals(xDevice)) {
																																											if (!xContainer
																																													.equals(xDeviceToDevice)) {
																																												if (!xCableToCable
																																														.equals(xDevice)) {
																																													if (!xCableToCable
																																															.equals(xContainer)) {
																																														if (!xCableToCable
																																																.equals(xCableToCable2)) {
																																															if (!xCableToCable
																																																	.equals(xDeviceToDevice)) {
																																																if (!xCableToCable2
																																																		.equals(xDevice)) {
																																																	if (!xCableToCable2
																																																			.equals(xContainer)) {
																																																		if (!xCableToCable2
																																																				.equals(xDeviceToDevice)) {
																																																			if (!device
																																																					.equals(xDevice)) {
																																																				if (!device
																																																						.equals(xCable)) {
																																																					if (!device
																																																							.equals(xContainer)) {
																																																						if (!device
																																																								.equals(xCableToCable)) {
																																																							if (!device
																																																									.equals(xCableToCable2)) {
																																																								if (!device
																																																										.equals(xDeviceToDevice)) {
																																																									return new Object[] {
																																																											ruleresult,
																																																											cable1,
																																																											container,
																																																											cable2,
																																																											cableAttributes,
																																																											xDevice,
																																																											xCable,
																																																											xContainer,
																																																											xCableToCable,
																																																											xCableToCable2,
																																																											device,
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
																																			}
																																		}
																																	}
																																}
																															}
																														}
																													}
																												}
																											}
																										}
																									}
																								}
																							}
																						}
																					}
																				}
																			}
																		}
																	}
																}
															}
														}
													}
												}
											}
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

	public static final Object[] pattern_XDuplexCopperCableRule_11_3_bookkeepingforedges_greenBBBBBBBBBFFFFFFFF(
			PerformRuleResult ruleresult, EObject cable1, EObject container, EObject cable2, EObject cableAttributes,
			EObject xCable, EObject xContainer, EObject xCableToCable, EObject xCableToCable2) {
		EMoflonEdge xCableToCable__xCable____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge xCableToCable__cable1____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge container__cable2____cables = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge xCableToCable2__cable2____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge xCableToCable2__xCable____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge xContainer__xCable____elements = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge xCable__cableAttributes____cableAttributes = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge container__cable1____cables = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String ruleresult_ruleName_prime = "XDuplexCopperCableRule";
		String xCableToCable__xCable____source_name_prime = "source";
		String xCableToCable__cable1____target_name_prime = "target";
		String container__cable2____cables_name_prime = "cables";
		String xCableToCable2__cable2____target_name_prime = "target";
		String xCableToCable2__xCable____source_name_prime = "source";
		String xContainer__xCable____elements_name_prime = "elements";
		String xCable__cableAttributes____cableAttributes_name_prime = "cableAttributes";
		String container__cable1____cables_name_prime = "cables";
		xCableToCable__xCable____source.setSrc(xCableToCable);
		xCableToCable__xCable____source.setTrg(xCable);
		ruleresult.getCreatedEdges().add(xCableToCable__xCable____source);
		xCableToCable__cable1____target.setSrc(xCableToCable);
		xCableToCable__cable1____target.setTrg(cable1);
		ruleresult.getCreatedEdges().add(xCableToCable__cable1____target);
		container__cable2____cables.setSrc(container);
		container__cable2____cables.setTrg(cable2);
		ruleresult.getTranslatedEdges().add(container__cable2____cables);
		xCableToCable2__cable2____target.setSrc(xCableToCable2);
		xCableToCable2__cable2____target.setTrg(cable2);
		ruleresult.getCreatedEdges().add(xCableToCable2__cable2____target);
		xCableToCable2__xCable____source.setSrc(xCableToCable2);
		xCableToCable2__xCable____source.setTrg(xCable);
		ruleresult.getCreatedEdges().add(xCableToCable2__xCable____source);
		xContainer__xCable____elements.setSrc(xContainer);
		xContainer__xCable____elements.setTrg(xCable);
		ruleresult.getCreatedEdges().add(xContainer__xCable____elements);
		xCable__cableAttributes____cableAttributes.setSrc(xCable);
		xCable__cableAttributes____cableAttributes.setTrg(cableAttributes);
		ruleresult.getCreatedEdges().add(xCable__cableAttributes____cableAttributes);
		container__cable1____cables.setSrc(container);
		container__cable1____cables.setTrg(cable1);
		ruleresult.getTranslatedEdges().add(container__cable1____cables);
		ruleresult.setRuleName(ruleresult_ruleName_prime);
		xCableToCable__xCable____source.setName(xCableToCable__xCable____source_name_prime);
		xCableToCable__cable1____target.setName(xCableToCable__cable1____target_name_prime);
		container__cable2____cables.setName(container__cable2____cables_name_prime);
		xCableToCable2__cable2____target.setName(xCableToCable2__cable2____target_name_prime);
		xCableToCable2__xCable____source.setName(xCableToCable2__xCable____source_name_prime);
		xContainer__xCable____elements.setName(xContainer__xCable____elements_name_prime);
		xCable__cableAttributes____cableAttributes.setName(xCable__cableAttributes____cableAttributes_name_prime);
		container__cable1____cables.setName(container__cable1____cables_name_prime);
		return new Object[] { ruleresult, cable1, container, cable2, cableAttributes, xCable, xContainer, xCableToCable,
				xCableToCable2, xCableToCable__xCable____source, xCableToCable__cable1____target,
				container__cable2____cables, xCableToCable2__cable2____target, xCableToCable2__xCable____source,
				xContainer__xCable____elements, xCable__cableAttributes____cableAttributes,
				container__cable1____cables };
	}

	public static final void pattern_XDuplexCopperCableRule_11_5_registerobjects_expressionBBBBBBBBBBBBB(
			XDuplexCopperCableRule _this, PerformRuleResult ruleresult, EObject cable1, EObject container,
			EObject cable2, EObject cableAttributes, EObject xDevice, EObject xCable, EObject xContainer,
			EObject xCableToCable, EObject xCableToCable2, EObject device, EObject xDeviceToDevice) {
		_this.registerObjects_BWD(ruleresult, cable1, container, cable2, cableAttributes, xDevice, xCable, xContainer,
				xCableToCable, xCableToCable2, device, xDeviceToDevice);

	}

	public static final PerformRuleResult pattern_XDuplexCopperCableRule_11_6_expressionFB(
			PerformRuleResult ruleresult) {
		PerformRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_XDuplexCopperCableRule_12_1_preparereturnvalue_bindingFB(
			XDuplexCopperCableRule _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass eClass = _localVariable_0;
		if (eClass != null) {
			return new Object[] { eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_XDuplexCopperCableRule_12_1_preparereturnvalue_blackFBB(EClass eClass,
			XDuplexCopperCableRule _this) {
		for (EOperation performOperation : eClass.getEOperations()) {
			String performOperation_name = performOperation.getName();
			if (performOperation_name.equals("perform_BWD")) {
				return new Object[] { performOperation, eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_XDuplexCopperCableRule_12_1_preparereturnvalue_bindingAndBlackFFB(
			XDuplexCopperCableRule _this) {
		Object[] result_pattern_XDuplexCopperCableRule_12_1_preparereturnvalue_binding = pattern_XDuplexCopperCableRule_12_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_XDuplexCopperCableRule_12_1_preparereturnvalue_binding != null) {
			EClass eClass = (EClass) result_pattern_XDuplexCopperCableRule_12_1_preparereturnvalue_binding[0];

			Object[] result_pattern_XDuplexCopperCableRule_12_1_preparereturnvalue_black = pattern_XDuplexCopperCableRule_12_1_preparereturnvalue_blackFBB(
					eClass, _this);
			if (result_pattern_XDuplexCopperCableRule_12_1_preparereturnvalue_black != null) {
				EOperation performOperation = (EOperation) result_pattern_XDuplexCopperCableRule_12_1_preparereturnvalue_black[0];

				return new Object[] { performOperation, eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_XDuplexCopperCableRule_12_1_preparereturnvalue_greenBF(
			EOperation performOperation) {
		IsApplicableRuleResult ruleresult = RuntimeFactory.eINSTANCE.createIsApplicableRuleResult();
		boolean ruleresult_success_prime = Boolean.valueOf(false);
		String ruleresult_rule_prime = "XDuplexCopperCableRule";
		ruleresult.setPerformOperation(performOperation);
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		ruleresult.setRule(ruleresult_rule_prime);
		return new Object[] { performOperation, ruleresult };
	}

	public static final Object[] pattern_XDuplexCopperCableRule_12_2_corematch_bindingFFFFB(Match match) {
		EObject _localVariable_0 = match.getObject("cable1");
		EObject _localVariable_1 = match.getObject("container");
		EObject _localVariable_2 = match.getObject("cable2");
		EObject _localVariable_3 = match.getObject("device");
		EObject tmpCable1 = _localVariable_0;
		EObject tmpContainer = _localVariable_1;
		EObject tmpCable2 = _localVariable_2;
		EObject tmpDevice = _localVariable_3;
		if (tmpCable1 instanceof CopperCable) {
			CopperCable cable1 = (CopperCable) tmpCable1;
			if (tmpContainer instanceof Container) {
				Container container = (Container) tmpContainer;
				if (tmpCable2 instanceof GlassFiberCable) {
					GlassFiberCable cable2 = (GlassFiberCable) tmpCable2;
					if (tmpDevice instanceof Device) {
						Device device = (Device) tmpDevice;
						return new Object[] { cable1, container, cable2, device, match };
					}
				}
			}
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_XDuplexCopperCableRule_12_2_corematch_blackBBBFBFB(
			CopperCable cable1, Container container, GlassFiberCable cable2, Device device, Match match) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		for (XDeviceToDevice xDeviceToDevice : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(device, XDeviceToDevice.class, "target")) {
			XDevice xDevice = xDeviceToDevice.getSource();
			if (xDevice != null) {
				_result.add(new Object[] { cable1, container, cable2, xDevice, device, xDeviceToDevice, match });
			}

		}
		return _result;
	}

	public static final Iterable<Object[]> pattern_XDuplexCopperCableRule_12_3_findcontext_blackBBBBFBB(
			CopperCable cable1, Container container, GlassFiberCable cable2, XDevice xDevice, Device device,
			XDeviceToDevice xDeviceToDevice) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (container.getDevices().contains(device)) {
			if (xDevice.equals(xDeviceToDevice.getSource())) {
				if (device.equals(xDeviceToDevice.getTarget())) {
					if (container.getCables().contains(cable2)) {
						if (container.getCables().contains(cable1)) {
							for (XContainer xContainer : org.moflon.core.utilities.eMoflonEMFUtil
									.getOppositeReferenceTyped(xDevice, XContainer.class, "elements")) {
								_result.add(new Object[] { cable1, container, cable2, xDevice, xContainer, device,
										xDeviceToDevice });
							}
						}
					}
				}
			}
		}
		return _result;
	}

	public static final Object[] pattern_XDuplexCopperCableRule_12_3_findcontext_greenBBBBBBBFFFFFFF(CopperCable cable1,
			Container container, GlassFiberCable cable2, XDevice xDevice, XContainer xContainer, Device device,
			XDeviceToDevice xDeviceToDevice) {
		IsApplicableMatch isApplicableMatch = RuntimeFactory.eINSTANCE.createIsApplicableMatch();
		EMoflonEdge container__device____devices = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge xDeviceToDevice__xDevice____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge xDeviceToDevice__device____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge container__cable2____cables = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge xContainer__xDevice____elements = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge container__cable1____cables = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String container__device____devices_name_prime = "devices";
		String xDeviceToDevice__xDevice____source_name_prime = "source";
		String xDeviceToDevice__device____target_name_prime = "target";
		String container__cable2____cables_name_prime = "cables";
		String xContainer__xDevice____elements_name_prime = "elements";
		String container__cable1____cables_name_prime = "cables";
		isApplicableMatch.getAllContextElements().add(cable1);
		isApplicableMatch.getAllContextElements().add(container);
		isApplicableMatch.getAllContextElements().add(cable2);
		isApplicableMatch.getAllContextElements().add(xDevice);
		isApplicableMatch.getAllContextElements().add(xContainer);
		isApplicableMatch.getAllContextElements().add(device);
		isApplicableMatch.getAllContextElements().add(xDeviceToDevice);
		container__device____devices.setSrc(container);
		container__device____devices.setTrg(device);
		isApplicableMatch.getAllContextElements().add(container__device____devices);
		xDeviceToDevice__xDevice____source.setSrc(xDeviceToDevice);
		xDeviceToDevice__xDevice____source.setTrg(xDevice);
		isApplicableMatch.getAllContextElements().add(xDeviceToDevice__xDevice____source);
		xDeviceToDevice__device____target.setSrc(xDeviceToDevice);
		xDeviceToDevice__device____target.setTrg(device);
		isApplicableMatch.getAllContextElements().add(xDeviceToDevice__device____target);
		container__cable2____cables.setSrc(container);
		container__cable2____cables.setTrg(cable2);
		isApplicableMatch.getAllContextElements().add(container__cable2____cables);
		xContainer__xDevice____elements.setSrc(xContainer);
		xContainer__xDevice____elements.setTrg(xDevice);
		isApplicableMatch.getAllContextElements().add(xContainer__xDevice____elements);
		container__cable1____cables.setSrc(container);
		container__cable1____cables.setTrg(cable1);
		isApplicableMatch.getAllContextElements().add(container__cable1____cables);
		container__device____devices.setName(container__device____devices_name_prime);
		xDeviceToDevice__xDevice____source.setName(xDeviceToDevice__xDevice____source_name_prime);
		xDeviceToDevice__device____target.setName(xDeviceToDevice__device____target_name_prime);
		container__cable2____cables.setName(container__cable2____cables_name_prime);
		xContainer__xDevice____elements.setName(xContainer__xDevice____elements_name_prime);
		container__cable1____cables.setName(container__cable1____cables_name_prime);
		return new Object[] { cable1, container, cable2, xDevice, xContainer, device, xDeviceToDevice,
				isApplicableMatch, container__device____devices, xDeviceToDevice__xDevice____source,
				xDeviceToDevice__device____target, container__cable2____cables, xContainer__xDevice____elements,
				container__cable1____cables };
	}

	public static final Object[] pattern_XDuplexCopperCableRule_12_4_solveCSP_bindingFBBBBBBBBB(
			XDuplexCopperCableRule _this, IsApplicableMatch isApplicableMatch, CopperCable cable1, Container container,
			GlassFiberCable cable2, XDevice xDevice, XContainer xContainer, Device device,
			XDeviceToDevice xDeviceToDevice) {
		CSP _localVariable_0 = _this.isApplicable_solveCsp_BWD(isApplicableMatch, cable1, container, cable2, xDevice,
				xContainer, device, xDeviceToDevice);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, cable1, container, cable2, xDevice, xContainer, device,
					xDeviceToDevice };
		}
		return null;
	}

	public static final Object[] pattern_XDuplexCopperCableRule_12_4_solveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_XDuplexCopperCableRule_12_4_solveCSP_bindingAndBlackFBBBBBBBBB(
			XDuplexCopperCableRule _this, IsApplicableMatch isApplicableMatch, CopperCable cable1, Container container,
			GlassFiberCable cable2, XDevice xDevice, XContainer xContainer, Device device,
			XDeviceToDevice xDeviceToDevice) {
		Object[] result_pattern_XDuplexCopperCableRule_12_4_solveCSP_binding = pattern_XDuplexCopperCableRule_12_4_solveCSP_bindingFBBBBBBBBB(
				_this, isApplicableMatch, cable1, container, cable2, xDevice, xContainer, device, xDeviceToDevice);
		if (result_pattern_XDuplexCopperCableRule_12_4_solveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_XDuplexCopperCableRule_12_4_solveCSP_binding[0];

			Object[] result_pattern_XDuplexCopperCableRule_12_4_solveCSP_black = pattern_XDuplexCopperCableRule_12_4_solveCSP_blackB(
					csp);
			if (result_pattern_XDuplexCopperCableRule_12_4_solveCSP_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, cable1, container, cable2, xDevice, xContainer,
						device, xDeviceToDevice };
			}
		}
		return null;
	}

	public static final boolean pattern_XDuplexCopperCableRule_12_5_checkCSP_expressionFBB(XDuplexCopperCableRule _this,
			CSP csp) {
		boolean _localVariable_0 = _this.isApplicable_checkCsp_BWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_XDuplexCopperCableRule_12_6_addmatchtoruleresult_blackBB(
			IsApplicableRuleResult ruleresult, IsApplicableMatch isApplicableMatch) {
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final Object[] pattern_XDuplexCopperCableRule_12_6_addmatchtoruleresult_greenBB(
			IsApplicableRuleResult ruleresult, IsApplicableMatch isApplicableMatch) {
		ruleresult.getIsApplicableMatch().add(isApplicableMatch);
		boolean ruleresult_success_prime = Boolean.valueOf(true);
		String isApplicableMatch_ruleName_prime = "XDuplexCopperCableRule";
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		isApplicableMatch.setRuleName(isApplicableMatch_ruleName_prime);
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final IsApplicableRuleResult pattern_XDuplexCopperCableRule_12_7_expressionFB(
			IsApplicableRuleResult ruleresult) {
		IsApplicableRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_XDuplexCopperCableRule_20_1_preparereturnvalue_bindingFB(
			XDuplexCopperCableRule _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_XDuplexCopperCableRule_20_1_preparereturnvalue_blackFBBF(EClass __eClass,
			XDuplexCopperCableRule _this) {
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

	public static final Object[] pattern_XDuplexCopperCableRule_20_1_preparereturnvalue_bindingAndBlackFFBF(
			XDuplexCopperCableRule _this) {
		Object[] result_pattern_XDuplexCopperCableRule_20_1_preparereturnvalue_binding = pattern_XDuplexCopperCableRule_20_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_XDuplexCopperCableRule_20_1_preparereturnvalue_binding != null) {
			EClass __eClass = (EClass) result_pattern_XDuplexCopperCableRule_20_1_preparereturnvalue_binding[0];

			Object[] result_pattern_XDuplexCopperCableRule_20_1_preparereturnvalue_black = pattern_XDuplexCopperCableRule_20_1_preparereturnvalue_blackFBBF(
					__eClass, _this);
			if (result_pattern_XDuplexCopperCableRule_20_1_preparereturnvalue_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_XDuplexCopperCableRule_20_1_preparereturnvalue_black[0];
				EOperation isApplicableCC = (EOperation) result_pattern_XDuplexCopperCableRule_20_1_preparereturnvalue_black[3];

				return new Object[] { __performOperation, __eClass, _this, isApplicableCC };
			}
		}
		return null;
	}

	public static final Object[] pattern_XDuplexCopperCableRule_20_1_preparereturnvalue_greenF() {
		EObjectContainer __result = RuntimeFactory.eINSTANCE.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Iterable<Object[]> pattern_XDuplexCopperCableRule_20_2_testcorematchandDECs_blackFFFFB(
			EMoflonEdge _edge_cables) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		EObject tmpContainer = _edge_cables.getSrc();
		if (tmpContainer instanceof Container) {
			Container container = (Container) tmpContainer;
			EObject tmpCable2 = _edge_cables.getTrg();
			if (tmpCable2 instanceof GlassFiberCable) {
				GlassFiberCable cable2 = (GlassFiberCable) tmpCable2;
				if (container.getCables().contains(cable2)) {
					for (Device device : container.getDevices()) {
						for (Cable tmpCable1 : container.getCables()) {
							if (tmpCable1 instanceof CopperCable) {
								CopperCable cable1 = (CopperCable) tmpCable1;
								_result.add(new Object[] { cable1, container, cable2, device, _edge_cables });
							}
						}
					}
				}
			}

		}

		return _result;
	}

	public static final Object[] pattern_XDuplexCopperCableRule_20_2_testcorematchandDECs_greenFB(EClass __eClass) {
		Match match = RuntimeFactory.eINSTANCE.createMatch();
		String __eClass_name = __eClass.getName();
		String match_ruleName_prime = __eClass_name;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_XDuplexCopperCableRule_20_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBBBB(
			XDuplexCopperCableRule _this, Match match, CopperCable cable1, Container container, GlassFiberCable cable2,
			Device device) {
		boolean _localVariable_0 = _this.isAppropriate_BWD(match, cable1, container, cable2, device);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_XDuplexCopperCableRule_20_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(
			XDuplexCopperCableRule _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_BWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_XDuplexCopperCableRule_20_5_Addmatchtoruleresult_blackBBBB(Match match,
			EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		if (!__performOperation.equals(isApplicableCC)) {
			return new Object[] { match, __performOperation, __result, isApplicableCC };
		}
		return null;
	}

	public static final Object[] pattern_XDuplexCopperCableRule_20_5_Addmatchtoruleresult_greenBBBB(Match match,
			EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		match.setIsApplicableCCOperation(isApplicableCC);
		return new Object[] { match, __performOperation, __result, isApplicableCC };
	}

	public static final EObjectContainer pattern_XDuplexCopperCableRule_20_6_expressionFB(EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_XDuplexCopperCableRule_21_1_preparereturnvalue_bindingFB(
			XDuplexCopperCableRule _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_XDuplexCopperCableRule_21_1_preparereturnvalue_blackFBBF(EClass __eClass,
			XDuplexCopperCableRule _this) {
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

	public static final Object[] pattern_XDuplexCopperCableRule_21_1_preparereturnvalue_bindingAndBlackFFBF(
			XDuplexCopperCableRule _this) {
		Object[] result_pattern_XDuplexCopperCableRule_21_1_preparereturnvalue_binding = pattern_XDuplexCopperCableRule_21_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_XDuplexCopperCableRule_21_1_preparereturnvalue_binding != null) {
			EClass __eClass = (EClass) result_pattern_XDuplexCopperCableRule_21_1_preparereturnvalue_binding[0];

			Object[] result_pattern_XDuplexCopperCableRule_21_1_preparereturnvalue_black = pattern_XDuplexCopperCableRule_21_1_preparereturnvalue_blackFBBF(
					__eClass, _this);
			if (result_pattern_XDuplexCopperCableRule_21_1_preparereturnvalue_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_XDuplexCopperCableRule_21_1_preparereturnvalue_black[0];
				EOperation isApplicableCC = (EOperation) result_pattern_XDuplexCopperCableRule_21_1_preparereturnvalue_black[3];

				return new Object[] { __performOperation, __eClass, _this, isApplicableCC };
			}
		}
		return null;
	}

	public static final Object[] pattern_XDuplexCopperCableRule_21_1_preparereturnvalue_greenF() {
		EObjectContainer __result = RuntimeFactory.eINSTANCE.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Iterable<Object[]> pattern_XDuplexCopperCableRule_21_2_testcorematchandDECs_blackFFFFB(
			EMoflonEdge _edge_elements) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		EObject tmpXContainer = _edge_elements.getSrc();
		if (tmpXContainer instanceof XContainer) {
			XContainer xContainer = (XContainer) tmpXContainer;
			EObject tmpXCable = _edge_elements.getTrg();
			if (tmpXCable instanceof XCopperCable) {
				XCopperCable xCable = (XCopperCable) tmpXCable;
				if (xContainer.getElements().contains(xCable)) {
					CableAttributes cableAttributes = xCable.getCableAttributes();
					if (cableAttributes != null) {
						boolean cableAttributes_isDuplex = cableAttributes.isIsDuplex();
						if (Boolean.valueOf(cableAttributes_isDuplex).equals(Boolean.valueOf(true))) {
							for (NetworkElements tmpXDevice : xContainer.getElements()) {
								if (tmpXDevice instanceof XDevice) {
									XDevice xDevice = (XDevice) tmpXDevice;
									_result.add(new Object[] { cableAttributes, xDevice, xCable, xContainer,
											_edge_elements });
								}
							}
						}

					}

				}
			}

		}

		return _result;
	}

	public static final Object[] pattern_XDuplexCopperCableRule_21_2_testcorematchandDECs_greenFB(EClass __eClass) {
		Match match = RuntimeFactory.eINSTANCE.createMatch();
		String __eClass_name = __eClass.getName();
		String match_ruleName_prime = __eClass_name;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_XDuplexCopperCableRule_21_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBBBB(
			XDuplexCopperCableRule _this, Match match, CableAttributes cableAttributes, XDevice xDevice,
			XCopperCable xCable, XContainer xContainer) {
		boolean _localVariable_0 = _this.isAppropriate_FWD(match, cableAttributes, xDevice, xCable, xContainer);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_XDuplexCopperCableRule_21_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(
			XDuplexCopperCableRule _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_FWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_XDuplexCopperCableRule_21_5_Addmatchtoruleresult_blackBBBB(Match match,
			EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		if (!__performOperation.equals(isApplicableCC)) {
			return new Object[] { match, __performOperation, __result, isApplicableCC };
		}
		return null;
	}

	public static final Object[] pattern_XDuplexCopperCableRule_21_5_Addmatchtoruleresult_greenBBBB(Match match,
			EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		match.setIsApplicableCCOperation(isApplicableCC);
		return new Object[] { match, __performOperation, __result, isApplicableCC };
	}

	public static final EObjectContainer pattern_XDuplexCopperCableRule_21_6_expressionFB(EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_XDuplexCopperCableRule_24_1_prepare_blackB(XDuplexCopperCableRule _this) {
		return new Object[] { _this };
	}

	public static final Object[] pattern_XDuplexCopperCableRule_24_1_prepare_greenF() {
		IsApplicableRuleResult result = RuntimeFactory.eINSTANCE.createIsApplicableRuleResult();
		return new Object[] { result };
	}

	public static final Object[] pattern_XDuplexCopperCableRule_24_2_matchsrctrgcontext_bindingFFFFFFFFBB(
			Match targetMatch, Match sourceMatch) {
		EObject _localVariable_0 = targetMatch.getObject("cable1");
		EObject _localVariable_1 = targetMatch.getObject("container");
		EObject _localVariable_2 = targetMatch.getObject("cable2");
		EObject _localVariable_3 = sourceMatch.getObject("cableAttributes");
		EObject _localVariable_4 = sourceMatch.getObject("xDevice");
		EObject _localVariable_5 = sourceMatch.getObject("xCable");
		EObject _localVariable_6 = sourceMatch.getObject("xContainer");
		EObject _localVariable_7 = targetMatch.getObject("device");
		EObject tmpCable1 = _localVariable_0;
		EObject tmpContainer = _localVariable_1;
		EObject tmpCable2 = _localVariable_2;
		EObject tmpCableAttributes = _localVariable_3;
		EObject tmpXDevice = _localVariable_4;
		EObject tmpXCable = _localVariable_5;
		EObject tmpXContainer = _localVariable_6;
		EObject tmpDevice = _localVariable_7;
		if (tmpCable1 instanceof CopperCable) {
			CopperCable cable1 = (CopperCable) tmpCable1;
			if (tmpContainer instanceof Container) {
				Container container = (Container) tmpContainer;
				if (tmpCable2 instanceof GlassFiberCable) {
					GlassFiberCable cable2 = (GlassFiberCable) tmpCable2;
					if (tmpCableAttributes instanceof CableAttributes) {
						CableAttributes cableAttributes = (CableAttributes) tmpCableAttributes;
						if (tmpXDevice instanceof XDevice) {
							XDevice xDevice = (XDevice) tmpXDevice;
							if (tmpXCable instanceof XCopperCable) {
								XCopperCable xCable = (XCopperCable) tmpXCable;
								if (tmpXContainer instanceof XContainer) {
									XContainer xContainer = (XContainer) tmpXContainer;
									if (tmpDevice instanceof Device) {
										Device device = (Device) tmpDevice;
										return new Object[] { cable1, container, cable2, cableAttributes, xDevice,
												xCable, xContainer, device, targetMatch, sourceMatch };
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

	public static final Object[] pattern_XDuplexCopperCableRule_24_2_matchsrctrgcontext_blackBBBBBBBBBB(
			CopperCable cable1, Container container, GlassFiberCable cable2, CableAttributes cableAttributes,
			XDevice xDevice, XCopperCable xCable, XContainer xContainer, Device device, Match sourceMatch,
			Match targetMatch) {
		if (!sourceMatch.equals(targetMatch)) {
			boolean cableAttributes_isDuplex = cableAttributes.isIsDuplex();
			if (Boolean.valueOf(cableAttributes_isDuplex).equals(Boolean.valueOf(true))) {
				return new Object[] { cable1, container, cable2, cableAttributes, xDevice, xCable, xContainer, device,
						sourceMatch, targetMatch };
			}

		}
		return null;
	}

	public static final Object[] pattern_XDuplexCopperCableRule_24_2_matchsrctrgcontext_bindingAndBlackFFFFFFFFBB(
			Match sourceMatch, Match targetMatch) {
		Object[] result_pattern_XDuplexCopperCableRule_24_2_matchsrctrgcontext_binding = pattern_XDuplexCopperCableRule_24_2_matchsrctrgcontext_bindingFFFFFFFFBB(
				targetMatch, sourceMatch);
		if (result_pattern_XDuplexCopperCableRule_24_2_matchsrctrgcontext_binding != null) {
			CopperCable cable1 = (CopperCable) result_pattern_XDuplexCopperCableRule_24_2_matchsrctrgcontext_binding[0];
			Container container = (Container) result_pattern_XDuplexCopperCableRule_24_2_matchsrctrgcontext_binding[1];
			GlassFiberCable cable2 = (GlassFiberCable) result_pattern_XDuplexCopperCableRule_24_2_matchsrctrgcontext_binding[2];
			CableAttributes cableAttributes = (CableAttributes) result_pattern_XDuplexCopperCableRule_24_2_matchsrctrgcontext_binding[3];
			XDevice xDevice = (XDevice) result_pattern_XDuplexCopperCableRule_24_2_matchsrctrgcontext_binding[4];
			XCopperCable xCable = (XCopperCable) result_pattern_XDuplexCopperCableRule_24_2_matchsrctrgcontext_binding[5];
			XContainer xContainer = (XContainer) result_pattern_XDuplexCopperCableRule_24_2_matchsrctrgcontext_binding[6];
			Device device = (Device) result_pattern_XDuplexCopperCableRule_24_2_matchsrctrgcontext_binding[7];

			Object[] result_pattern_XDuplexCopperCableRule_24_2_matchsrctrgcontext_black = pattern_XDuplexCopperCableRule_24_2_matchsrctrgcontext_blackBBBBBBBBBB(
					cable1, container, cable2, cableAttributes, xDevice, xCable, xContainer, device, sourceMatch,
					targetMatch);
			if (result_pattern_XDuplexCopperCableRule_24_2_matchsrctrgcontext_black != null) {

				return new Object[] { cable1, container, cable2, cableAttributes, xDevice, xCable, xContainer, device,
						sourceMatch, targetMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_XDuplexCopperCableRule_24_3_solvecsp_bindingFBBBBBBBBBBB(
			XDuplexCopperCableRule _this, CopperCable cable1, Container container, GlassFiberCable cable2,
			CableAttributes cableAttributes, XDevice xDevice, XCopperCable xCable, XContainer xContainer, Device device,
			Match sourceMatch, Match targetMatch) {
		CSP _localVariable_8 = _this.isApplicable_solveCsp_CC(cable1, container, cable2, cableAttributes, xDevice,
				xCable, xContainer, device, sourceMatch, targetMatch);
		CSP csp = _localVariable_8;
		if (csp != null) {
			return new Object[] { csp, _this, cable1, container, cable2, cableAttributes, xDevice, xCable, xContainer,
					device, sourceMatch, targetMatch };
		}
		return null;
	}

	public static final Object[] pattern_XDuplexCopperCableRule_24_3_solvecsp_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_XDuplexCopperCableRule_24_3_solvecsp_bindingAndBlackFBBBBBBBBBBB(
			XDuplexCopperCableRule _this, CopperCable cable1, Container container, GlassFiberCable cable2,
			CableAttributes cableAttributes, XDevice xDevice, XCopperCable xCable, XContainer xContainer, Device device,
			Match sourceMatch, Match targetMatch) {
		Object[] result_pattern_XDuplexCopperCableRule_24_3_solvecsp_binding = pattern_XDuplexCopperCableRule_24_3_solvecsp_bindingFBBBBBBBBBBB(
				_this, cable1, container, cable2, cableAttributes, xDevice, xCable, xContainer, device, sourceMatch,
				targetMatch);
		if (result_pattern_XDuplexCopperCableRule_24_3_solvecsp_binding != null) {
			CSP csp = (CSP) result_pattern_XDuplexCopperCableRule_24_3_solvecsp_binding[0];

			Object[] result_pattern_XDuplexCopperCableRule_24_3_solvecsp_black = pattern_XDuplexCopperCableRule_24_3_solvecsp_blackB(
					csp);
			if (result_pattern_XDuplexCopperCableRule_24_3_solvecsp_black != null) {

				return new Object[] { csp, _this, cable1, container, cable2, cableAttributes, xDevice, xCable,
						xContainer, device, sourceMatch, targetMatch };
			}
		}
		return null;
	}

	public static final boolean pattern_XDuplexCopperCableRule_24_4_checkCSP_expressionFB(CSP csp) {
		boolean _localVariable_0 = csp.check();
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Iterable<Object[]> pattern_XDuplexCopperCableRule_24_5_matchcorrcontext_blackBBFBB(
			XDevice xDevice, Device device, Match sourceMatch, Match targetMatch) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (!sourceMatch.equals(targetMatch)) {
			for (XDeviceToDevice xDeviceToDevice : org.moflon.core.utilities.eMoflonEMFUtil
					.getOppositeReferenceTyped(xDevice, XDeviceToDevice.class, "source")) {
				if (device.equals(xDeviceToDevice.getTarget())) {
					_result.add(new Object[] { xDevice, device, xDeviceToDevice, sourceMatch, targetMatch });
				}
			}
		}
		return _result;
	}

	public static final Object[] pattern_XDuplexCopperCableRule_24_5_matchcorrcontext_greenBBBF(
			XDeviceToDevice xDeviceToDevice, Match sourceMatch, Match targetMatch) {
		CCMatch ccMatch = RuntimeFactory.eINSTANCE.createCCMatch();
		String ccMatch_ruleName_prime = "XDuplexCopperCableRule";
		ccMatch.setSourceMatch(sourceMatch);
		ccMatch.setTargetMatch(targetMatch);
		ccMatch.getAllContextElements().add(xDeviceToDevice);
		ccMatch.setRuleName(ccMatch_ruleName_prime);
		return new Object[] { xDeviceToDevice, sourceMatch, targetMatch, ccMatch };
	}

	public static final Object[] pattern_XDuplexCopperCableRule_24_6_createcorrespondence_blackBBBBBBBBB(
			CopperCable cable1, Container container, GlassFiberCable cable2, CableAttributes cableAttributes,
			XDevice xDevice, XCopperCable xCable, XContainer xContainer, Device device, CCMatch ccMatch) {
		return new Object[] { cable1, container, cable2, cableAttributes, xDevice, xCable, xContainer, device,
				ccMatch };
	}

	public static final Object[] pattern_XDuplexCopperCableRule_24_6_createcorrespondence_greenBBBFFB(
			CopperCable cable1, GlassFiberCable cable2, XCopperCable xCable, CCMatch ccMatch) {
		XCableToCable xCableToCable = ImplementationTransformatorFactory.eINSTANCE.createXCableToCable();
		XCableToCable xCableToCable2 = ImplementationTransformatorFactory.eINSTANCE.createXCableToCable();
		xCableToCable.setSource(xCable);
		xCableToCable.setTarget(cable1);
		ccMatch.getCreateCorr().add(xCableToCable);
		xCableToCable2.setTarget(cable2);
		xCableToCable2.setSource(xCable);
		ccMatch.getCreateCorr().add(xCableToCable2);
		return new Object[] { cable1, cable2, xCable, xCableToCable, xCableToCable2, ccMatch };
	}

	public static final Object[] pattern_XDuplexCopperCableRule_24_7_addtoreturnedresult_blackBB(
			IsApplicableRuleResult result, CCMatch ccMatch) {
		return new Object[] { result, ccMatch };
	}

	public static final Object[] pattern_XDuplexCopperCableRule_24_7_addtoreturnedresult_greenBB(
			IsApplicableRuleResult result, CCMatch ccMatch) {
		result.getIsApplicableMatch().add(ccMatch);
		boolean result_success_prime = Boolean.valueOf(true);
		String ccMatch_ruleName_prime = "XDuplexCopperCableRule";
		result.setSuccess(Boolean.valueOf(result_success_prime));
		ccMatch.setRuleName(ccMatch_ruleName_prime);
		return new Object[] { result, ccMatch };
	}

	public static final IsApplicableRuleResult pattern_XDuplexCopperCableRule_24_8_expressionFB(
			IsApplicableRuleResult result) {
		IsApplicableRuleResult _result = result;
		return _result;
	}

	public static final Object[] pattern_XDuplexCopperCableRule_27_1_matchtggpattern_blackBBBB(
			CableAttributes cableAttributes, XDevice xDevice, XCopperCable xCable, XContainer xContainer) {
		if (xContainer.getElements().contains(xDevice)) {
			if (xContainer.getElements().contains(xCable)) {
				if (cableAttributes.equals(xCable.getCableAttributes())) {
					return new Object[] { cableAttributes, xDevice, xCable, xContainer };
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_XDuplexCopperCableRule_27_1_matchtggpattern_greenB(
			CableAttributes cableAttributes) {
		boolean cableAttributes_isDuplex_prime = Boolean.valueOf(true);
		cableAttributes.setIsDuplex(Boolean.valueOf(cableAttributes_isDuplex_prime));
		return new Object[] { cableAttributes };
	}

	public static final boolean pattern_XDuplexCopperCableRule_27_2_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_XDuplexCopperCableRule_27_3_expressionF() {
		boolean _result = Boolean.valueOf(false);
		return _result;
	}

	public static final Object[] pattern_XDuplexCopperCableRule_28_1_matchtggpattern_blackBBBB(CopperCable cable1,
			Container container, GlassFiberCable cable2, Device device) {
		if (container.getDevices().contains(device)) {
			if (container.getCables().contains(cable2)) {
				if (container.getCables().contains(cable1)) {
					return new Object[] { cable1, container, cable2, device };
				}
			}
		}
		return null;
	}

	public static final boolean pattern_XDuplexCopperCableRule_28_2_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_XDuplexCopperCableRule_28_3_expressionF() {
		boolean _result = Boolean.valueOf(false);
		return _result;
	}

	public static final Object[] pattern_XDuplexCopperCableRule_29_1_createresult_blackB(XDuplexCopperCableRule _this) {
		return new Object[] { _this };
	}

	public static final Object[] pattern_XDuplexCopperCableRule_29_1_createresult_greenFF() {
		IsApplicableMatch isApplicableMatch = RuntimeFactory.eINSTANCE.createIsApplicableMatch();
		ModelgeneratorRuleResult ruleResult = RuntimeFactory.eINSTANCE.createModelgeneratorRuleResult();
		boolean ruleResult_success_prime = Boolean.valueOf(false);
		ruleResult.setSuccess(Boolean.valueOf(ruleResult_success_prime));
		return new Object[] { isApplicableMatch, ruleResult };
	}

	public static final Object[] pattern_XDuplexCopperCableRule_29_2_isapplicablecore_black_nac_0BB(
			ModelgeneratorRuleResult ruleResult, Container container) {
		if (ruleResult.getTargetObjects().contains(container)) {
			return new Object[] { ruleResult, container };
		}
		return null;
	}

	public static final Object[] pattern_XDuplexCopperCableRule_29_2_isapplicablecore_black_nac_1BB(
			ModelgeneratorRuleResult ruleResult, Device device) {
		if (ruleResult.getTargetObjects().contains(device)) {
			return new Object[] { ruleResult, device };
		}
		return null;
	}

	public static final Object[] pattern_XDuplexCopperCableRule_29_2_isapplicablecore_black_nac_2BB(
			ModelgeneratorRuleResult ruleResult, XDeviceToDevice xDeviceToDevice) {
		if (ruleResult.getCorrObjects().contains(xDeviceToDevice)) {
			return new Object[] { ruleResult, xDeviceToDevice };
		}
		return null;
	}

	public static final Object[] pattern_XDuplexCopperCableRule_29_2_isapplicablecore_black_nac_3BB(
			ModelgeneratorRuleResult ruleResult, XDevice xDevice) {
		if (ruleResult.getSourceObjects().contains(xDevice)) {
			return new Object[] { ruleResult, xDevice };
		}
		return null;
	}

	public static final Object[] pattern_XDuplexCopperCableRule_29_2_isapplicablecore_black_nac_4BB(
			ModelgeneratorRuleResult ruleResult, XContainer xContainer) {
		if (ruleResult.getSourceObjects().contains(xContainer)) {
			return new Object[] { ruleResult, xContainer };
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_XDuplexCopperCableRule_29_2_isapplicablecore_blackFFFFFFBB(
			RuleEntryContainer ruleEntryContainer, ModelgeneratorRuleResult ruleResult) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		for (RuleEntryList xDeviceToDeviceList : ruleEntryContainer.getRuleEntryList()) {
			for (EObject tmpXDeviceToDevice : xDeviceToDeviceList.getEntryObjects()) {
				if (tmpXDeviceToDevice instanceof XDeviceToDevice) {
					XDeviceToDevice xDeviceToDevice = (XDeviceToDevice) tmpXDeviceToDevice;
					Device device = xDeviceToDevice.getTarget();
					if (device != null) {
						XDevice xDevice = xDeviceToDevice.getSource();
						if (xDevice != null) {
							if (pattern_XDuplexCopperCableRule_29_2_isapplicablecore_black_nac_2BB(ruleResult,
									xDeviceToDevice) == null) {
								if (pattern_XDuplexCopperCableRule_29_2_isapplicablecore_black_nac_1BB(ruleResult,
										device) == null) {
									if (pattern_XDuplexCopperCableRule_29_2_isapplicablecore_black_nac_3BB(ruleResult,
											xDevice) == null) {
										for (Container container : org.moflon.core.utilities.eMoflonEMFUtil
												.getOppositeReferenceTyped(device, Container.class, "devices")) {
											if (pattern_XDuplexCopperCableRule_29_2_isapplicablecore_black_nac_0BB(
													ruleResult, container) == null) {
												for (XContainer xContainer : org.moflon.core.utilities.eMoflonEMFUtil
														.getOppositeReferenceTyped(xDevice, XContainer.class,
																"elements")) {
													if (pattern_XDuplexCopperCableRule_29_2_isapplicablecore_black_nac_4BB(
															ruleResult, xContainer) == null) {
														_result.add(new Object[] { xDeviceToDeviceList, container,
																device, xDeviceToDevice, xDevice, xContainer,
																ruleEntryContainer, ruleResult });
													}
												}
											}
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

	public static final Object[] pattern_XDuplexCopperCableRule_29_3_solveCSP_bindingFBBBBBBBB(
			XDuplexCopperCableRule _this, IsApplicableMatch isApplicableMatch, Container container, XDevice xDevice,
			XContainer xContainer, Device device, XDeviceToDevice xDeviceToDevice,
			ModelgeneratorRuleResult ruleResult) {
		CSP _localVariable_0 = _this.generateModel_solveCsp_BWD(isApplicableMatch, container, xDevice, xContainer,
				device, xDeviceToDevice, ruleResult);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, container, xDevice, xContainer, device,
					xDeviceToDevice, ruleResult };
		}
		return null;
	}

	public static final Object[] pattern_XDuplexCopperCableRule_29_3_solveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_XDuplexCopperCableRule_29_3_solveCSP_bindingAndBlackFBBBBBBBB(
			XDuplexCopperCableRule _this, IsApplicableMatch isApplicableMatch, Container container, XDevice xDevice,
			XContainer xContainer, Device device, XDeviceToDevice xDeviceToDevice,
			ModelgeneratorRuleResult ruleResult) {
		Object[] result_pattern_XDuplexCopperCableRule_29_3_solveCSP_binding = pattern_XDuplexCopperCableRule_29_3_solveCSP_bindingFBBBBBBBB(
				_this, isApplicableMatch, container, xDevice, xContainer, device, xDeviceToDevice, ruleResult);
		if (result_pattern_XDuplexCopperCableRule_29_3_solveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_XDuplexCopperCableRule_29_3_solveCSP_binding[0];

			Object[] result_pattern_XDuplexCopperCableRule_29_3_solveCSP_black = pattern_XDuplexCopperCableRule_29_3_solveCSP_blackB(
					csp);
			if (result_pattern_XDuplexCopperCableRule_29_3_solveCSP_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, container, xDevice, xContainer, device,
						xDeviceToDevice, ruleResult };
			}
		}
		return null;
	}

	public static final boolean pattern_XDuplexCopperCableRule_29_4_checkCSP_expressionFBB(XDuplexCopperCableRule _this,
			CSP csp) {
		boolean _localVariable_0 = _this.generateModel_checkCsp_BWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_XDuplexCopperCableRule_29_5_checknacs_blackBBBBB(Container container,
			XDevice xDevice, XContainer xContainer, Device device, XDeviceToDevice xDeviceToDevice) {
		return new Object[] { container, xDevice, xContainer, device, xDeviceToDevice };
	}

	public static final Object[] pattern_XDuplexCopperCableRule_29_6_perform_blackBBBBBB(Container container,
			XDevice xDevice, XContainer xContainer, Device device, XDeviceToDevice xDeviceToDevice,
			ModelgeneratorRuleResult ruleResult) {
		return new Object[] { container, xDevice, xContainer, device, xDeviceToDevice, ruleResult };
	}

	public static final Object[] pattern_XDuplexCopperCableRule_29_6_perform_greenFBFFFBFFBB(Container container,
			XContainer xContainer, ModelgeneratorRuleResult ruleResult, CSP csp) {
		CopperCable cable1 = ImplementationFactory.eINSTANCE.createCopperCable();
		GlassFiberCable cable2 = ImplementationFactory.eINSTANCE.createGlassFiberCable();
		CableAttributes cableAttributes = XtextImplFactory.eINSTANCE.createCableAttributes();
		XCopperCable xCable = XtextImplFactory.eINSTANCE.createXCopperCable();
		XCableToCable xCableToCable = ImplementationTransformatorFactory.eINSTANCE.createXCableToCable();
		XCableToCable xCableToCable2 = ImplementationTransformatorFactory.eINSTANCE.createXCableToCable();
		Object _localVariable_0 = csp.getValue("cable1", "speed");
		Object _localVariable_1 = csp.getValue("cable2", "speed");
		boolean cableAttributes_isDuplex_prime = Boolean.valueOf(true);
		Object _localVariable_2 = csp.getValue("cableAttributes", "speed");
		boolean ruleResult_success_prime = Boolean.valueOf(true);
		int _localVariable_3 = ruleResult.getIncrementedPerformCount();
		container.getCables().add(cable1);
		ruleResult.getTargetObjects().add(cable1);
		container.getCables().add(cable2);
		ruleResult.getTargetObjects().add(cable2);
		ruleResult.getSourceObjects().add(cableAttributes);
		xContainer.getElements().add(xCable);
		xCable.setCableAttributes(cableAttributes);
		ruleResult.getSourceObjects().add(xCable);
		xCableToCable.setSource(xCable);
		xCableToCable.setTarget(cable1);
		ruleResult.getCorrObjects().add(xCableToCable);
		xCableToCable2.setTarget(cable2);
		xCableToCable2.setSource(xCable);
		ruleResult.getCorrObjects().add(xCableToCable2);
		BigInteger cable1_speed_prime = (BigInteger) _localVariable_0;
		BigInteger cable2_speed_prime = (BigInteger) _localVariable_1;
		cableAttributes.setIsDuplex(Boolean.valueOf(cableAttributes_isDuplex_prime));
		BigInteger cableAttributes_speed_prime = (BigInteger) _localVariable_2;
		ruleResult.setSuccess(Boolean.valueOf(ruleResult_success_prime));
		int ruleResult_performCount_prime = Integer.valueOf(_localVariable_3);
		cable1.setSpeed(cable1_speed_prime);
		cable2.setSpeed(cable2_speed_prime);
		cableAttributes.setSpeed(cableAttributes_speed_prime);
		ruleResult.setPerformCount(Integer.valueOf(ruleResult_performCount_prime));
		return new Object[] { cable1, container, cable2, cableAttributes, xCable, xContainer, xCableToCable,
				xCableToCable2, ruleResult, csp };
	}

	public static final ModelgeneratorRuleResult pattern_XDuplexCopperCableRule_29_7_expressionFB(
			ModelgeneratorRuleResult ruleResult) {
		ModelgeneratorRuleResult _result = ruleResult;
		return _result;
	}

	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} //XDuplexCopperCableRuleImpl
