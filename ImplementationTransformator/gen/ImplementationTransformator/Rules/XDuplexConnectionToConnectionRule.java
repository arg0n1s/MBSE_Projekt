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
 * A representation of the model object '<em><b>XDuplex Connection To Connection Rule</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see ImplementationTransformator.Rules.RulesPackage#getXDuplexConnectionToConnectionRule()
 * @model
 * @generated
 */
public interface XDuplexConnectionToConnectionRule extends EObject, AbstractRule {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	boolean isAppropriate_FWD(Match match, Connections connection2, XCable xCable, XDevice xDevice1,
			XContainer xContainer, Connections connection1, XDevice xDevice2, CableAttributes cableAttributes);

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
	void registerObjectsToMatch_FWD(Match match, Connections connection2, XCable xCable, XDevice xDevice1,
			XContainer xContainer, Connections connection1, XDevice xDevice2, CableAttributes cableAttributes);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	CSP isAppropriate_solveCsp_FWD(Match match, Connections connection2, XCable xCable, XDevice xDevice1,
			XContainer xContainer, Connections connection1, XDevice xDevice2, CableAttributes cableAttributes);

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
	CSP isApplicable_solveCsp_FWD(IsApplicableMatch isApplicableMatch, Container container, Connections connection2,
			XDeviceToDevice xDeviceToDevice2, XCable xCable, XDevice xDevice1, Cable cable2, XContainer xContainer,
			Connections connection1, XDeviceToDevice xDeviceToDevice, XCableToCable xCableToCable2, XDevice xDevice2,
			Device device2, CableAttributes cableAttributes, Cable cable1, XCableToCable xCableToCable1,
			Device device1);

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
	void registerObjects_FWD(PerformRuleResult ruleresult, EObject container, EObject connection2,
			EObject xDeviceToDevice2, EObject xCable, EObject xDevice1, EObject cable2, EObject xContainer,
			EObject connection1, EObject xDeviceToDevice, EObject xCableToCable2, EObject xDevice2, EObject device2,
			EObject cableAttributes, EObject cable1, EObject xCableToCable1, EObject device1);

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
	boolean isAppropriate_BWD(Match match, Container container, Cable cable2, Device device2, Cable cable1,
			Device device1);

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
	void registerObjectsToMatch_BWD(Match match, Container container, Cable cable2, Device device2, Cable cable1,
			Device device1);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	CSP isAppropriate_solveCsp_BWD(Match match, Container container, Cable cable2, Device device2, Cable cable1,
			Device device1);

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
	CSP isApplicable_solveCsp_BWD(IsApplicableMatch isApplicableMatch, Container container, Connections connection2,
			XDeviceToDevice xDeviceToDevice2, XCable xCable, XDevice xDevice1, Cable cable2, XContainer xContainer,
			Connections connection1, XDeviceToDevice xDeviceToDevice, XCableToCable xCableToCable2, XDevice xDevice2,
			Device device2, CableAttributes cableAttributes, Cable cable1, XCableToCable xCableToCable1,
			Device device1);

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
	void registerObjects_BWD(PerformRuleResult ruleresult, EObject container, EObject connection2,
			EObject xDeviceToDevice2, EObject xCable, EObject xDevice1, EObject cable2, EObject xContainer,
			EObject connection1, EObject xDeviceToDevice, EObject xCableToCable2, EObject xDevice2, EObject device2,
			EObject cableAttributes, EObject cable1, EObject xCableToCable1, EObject device1);

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
	EObjectContainer isAppropriate_BWD_EMoflonEdge_16(EMoflonEdge _edge_source);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	EObjectContainer isAppropriate_FWD_EMoflonEdge_12(EMoflonEdge _edge_incoming);

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
	CSP isApplicable_solveCsp_CC(Container container, Connections connection2, XCable xCable, XDevice xDevice1,
			Cable cable2, XContainer xContainer, Connections connection1, XDevice xDevice2, Device device2,
			CableAttributes cableAttributes, Cable cable1, Device device1, Match sourceMatch, Match targetMatch);

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
	boolean checkDEC_FWD(Connections connection2, XCable xCable, XDevice xDevice1, XContainer xContainer,
			Connections connection1, XDevice xDevice2, CableAttributes cableAttributes);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	boolean checkDEC_BWD(Container container, Cable cable2, Device device2, Cable cable1, Device device1);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	ModelgeneratorRuleResult generateModel(RuleEntryContainer ruleEntryContainer,
			XDeviceToDevice xDeviceToDevice2Parameter);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	CSP generateModel_solveCsp_BWD(IsApplicableMatch isApplicableMatch, Container container, Connections connection2,
			XDeviceToDevice xDeviceToDevice2, XCable xCable, XDevice xDevice1, Cable cable2, XContainer xContainer,
			Connections connection1, XDeviceToDevice xDeviceToDevice, XCableToCable xCableToCable2, XDevice xDevice2,
			Device device2, CableAttributes cableAttributes, Cable cable1, XCableToCable xCableToCable1, Device device1,
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
} // XDuplexConnectionToConnectionRule
