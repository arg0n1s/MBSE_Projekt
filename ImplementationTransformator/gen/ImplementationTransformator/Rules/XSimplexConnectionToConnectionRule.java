/**
 */
package ImplementationTransformator.Rules;

import ImplementationTransformator.XCableToCable;
import ImplementationTransformator.XDeviceToDevice;

import implementation.Cable;
import implementation.Container;
import implementation.Device;

import org.eclipse.emf.ecore.EObject;

import org.moflon.tgg.language.csp.CSP;

import org.moflon.tgg.language.modelgenerator.RuleEntryContainer;

import org.moflon.tgg.runtime.AbstractRule;
import org.moflon.tgg.runtime.AttributeConstraintsRuleResult;
import org.moflon.tgg.runtime.EMoflonEdge;
import org.moflon.tgg.runtime.EObjectContainer;
import org.moflon.tgg.runtime.IsApplicableMatch;
import org.moflon.tgg.runtime.IsApplicableRuleResult;
import org.moflon.tgg.runtime.Match;
import org.moflon.tgg.runtime.ModelgeneratorRuleResult;
import org.moflon.tgg.runtime.PerformRuleResult;
import org.moflon.tgg.runtime.TripleMatch;

import xtextImplementation.xtextImpl.CableAttributes;
import xtextImplementation.xtextImpl.Connections;
import xtextImplementation.xtextImpl.XCable;
import xtextImplementation.xtextImpl.XContainer;
import xtextImplementation.xtextImpl.XDevice;
// <-- [user defined imports]
// [user defined imports] -->

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>XSimplex Connection To Connection Rule</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see ImplementationTransformator.Rules.RulesPackage#getXSimplexConnectionToConnectionRule()
 * @model
 * @generated
 */
public interface XSimplexConnectionToConnectionRule extends EObject, AbstractRule {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	boolean isAppropriate_FWD(Match match, XContainer xContainer, XDevice xDevice1, Connections connection1,
			Connections connection2, CableAttributes cableAttributes, XDevice xDevice2, XCable xCable);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	PerformRuleResult perform_FWD(IsApplicableMatch isApplicableMatch);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	IsApplicableRuleResult isApplicable_FWD(Match match);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void registerObjectsToMatch_FWD(Match match, XContainer xContainer, XDevice xDevice1, Connections connection1,
			Connections connection2, CableAttributes cableAttributes, XDevice xDevice2, XCable xCable);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	CSP isAppropriate_solveCsp_FWD(Match match, XContainer xContainer, XDevice xDevice1, Connections connection1,
			Connections connection2, CableAttributes cableAttributes, XDevice xDevice2, XCable xCable);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	boolean isAppropriate_checkCsp_FWD(CSP csp);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	CSP isApplicable_solveCsp_FWD(IsApplicableMatch isApplicableMatch, XContainer xContainer,
			XDeviceToDevice xDeviceToDevice, Device device2, XDevice xDevice1, Connections connection1,
			Connections connection2, CableAttributes cableAttributes, Container container, XDevice xDevice2,
			Device device1, Cable cable, XDeviceToDevice xDeviceToDevice2, XCable xCable, XCableToCable xCableToCable);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	boolean isApplicable_checkCsp_FWD(CSP csp);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void registerObjects_FWD(PerformRuleResult ruleresult, EObject xContainer, EObject xDeviceToDevice, EObject device2,
			EObject xDevice1, EObject connection1, EObject connection2, EObject cableAttributes, EObject container,
			EObject xDevice2, EObject device1, EObject cable, EObject xDeviceToDevice2, EObject xCable,
			EObject xCableToCable);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	boolean checkTypes_FWD(Match match);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	boolean isAppropriate_BWD(Match match, Device device2, Container container, Device device1, Cable cable);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	PerformRuleResult perform_BWD(IsApplicableMatch isApplicableMatch);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	IsApplicableRuleResult isApplicable_BWD(Match match);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void registerObjectsToMatch_BWD(Match match, Device device2, Container container, Device device1, Cable cable);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	CSP isAppropriate_solveCsp_BWD(Match match, Device device2, Container container, Device device1, Cable cable);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	boolean isAppropriate_checkCsp_BWD(CSP csp);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	CSP isApplicable_solveCsp_BWD(IsApplicableMatch isApplicableMatch, XContainer xContainer,
			XDeviceToDevice xDeviceToDevice, Device device2, XDevice xDevice1, Connections connection1,
			Connections connection2, CableAttributes cableAttributes, Container container, XDevice xDevice2,
			Device device1, Cable cable, XDeviceToDevice xDeviceToDevice2, XCable xCable, XCableToCable xCableToCable);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	boolean isApplicable_checkCsp_BWD(CSP csp);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void registerObjects_BWD(PerformRuleResult ruleresult, EObject xContainer, EObject xDeviceToDevice, EObject device2,
			EObject xDevice1, EObject connection1, EObject connection2, EObject cableAttributes, EObject container,
			EObject xDevice2, EObject device1, EObject cable, EObject xDeviceToDevice2, EObject xCable,
			EObject xCableToCable);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	boolean checkTypes_BWD(Match match);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	EObjectContainer isAppropriate_BWD_EMoflonEdge_11(EMoflonEdge _edge_target);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	EObjectContainer isAppropriate_FWD_EMoflonEdge_7(EMoflonEdge _edge_outgoing);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	AttributeConstraintsRuleResult checkAttributes_FWD(TripleMatch __tripleMatch);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	AttributeConstraintsRuleResult checkAttributes_BWD(TripleMatch __tripleMatch);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	IsApplicableRuleResult isApplicable_CC(Match sourceMatch, Match targetMatch);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	CSP isApplicable_solveCsp_CC(XContainer xContainer, Device device2, XDevice xDevice1, Connections connection1,
			Connections connection2, CableAttributes cableAttributes, Container container, XDevice xDevice2,
			Device device1, Cable cable, XCable xCable, Match sourceMatch, Match targetMatch);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	boolean isApplicable_checkCsp_CC(CSP csp);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	boolean checkDEC_FWD(XContainer xContainer, XDevice xDevice1, Connections connection1, Connections connection2,
			CableAttributes cableAttributes, XDevice xDevice2, XCable xCable);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	boolean checkDEC_BWD(Device device2, Container container, Device device1, Cable cable);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	ModelgeneratorRuleResult generateModel(RuleEntryContainer ruleEntryContainer, XCableToCable xCableToCableParameter);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	CSP generateModel_solveCsp_BWD(IsApplicableMatch isApplicableMatch, XContainer xContainer,
			XDeviceToDevice xDeviceToDevice, Device device2, XDevice xDevice1, Connections connection1,
			Connections connection2, CableAttributes cableAttributes, Container container, XDevice xDevice2,
			Device device1, Cable cable, XDeviceToDevice xDeviceToDevice2, XCable xCable, XCableToCable xCableToCable,
			ModelgeneratorRuleResult ruleResult);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	boolean generateModel_checkCsp_BWD(CSP csp);
	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} // XSimplexConnectionToConnectionRule
