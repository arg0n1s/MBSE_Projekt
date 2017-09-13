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
	boolean isAppropriate_FWD(Match match, XDevice xDevice1, XCable xCable, XContainer xContainer, XDevice xDevice2,
			Connections connection1, CableAttributes cableAttributes, Connections connection2);

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
	void registerObjectsToMatch_FWD(Match match, XDevice xDevice1, XCable xCable, XContainer xContainer,
			XDevice xDevice2, Connections connection1, CableAttributes cableAttributes, Connections connection2);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	CSP isAppropriate_solveCsp_FWD(Match match, XDevice xDevice1, XCable xCable, XContainer xContainer,
			XDevice xDevice2, Connections connection1, CableAttributes cableAttributes, Connections connection2);

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
	CSP isApplicable_solveCsp_FWD(IsApplicableMatch isApplicableMatch, XDevice xDevice1, XCable xCable,
			XContainer xContainer, Cable cable1, XDevice xDevice2, Connections connection1, Device device2,
			Device device1, CableAttributes cableAttributes, XDeviceToDevice xDeviceToDevice,
			XCableToCable xCableToCable2, XDeviceToDevice xDeviceToDevice2, XCableToCable xCableToCable1, Cable cable2,
			Container container, Connections connection2);

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
	void registerObjects_FWD(PerformRuleResult ruleresult, EObject xDevice1, EObject xCable, EObject xContainer,
			EObject cable1, EObject xDevice2, EObject connection1, EObject device2, EObject device1,
			EObject cableAttributes, EObject xDeviceToDevice, EObject xCableToCable2, EObject xDeviceToDevice2,
			EObject xCableToCable1, EObject cable2, EObject container, EObject connection2);

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
	boolean isAppropriate_BWD(Match match, Cable cable1, Device device2, Device device1, Cable cable2,
			Container container);

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
	void registerObjectsToMatch_BWD(Match match, Cable cable1, Device device2, Device device1, Cable cable2,
			Container container);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	CSP isAppropriate_solveCsp_BWD(Match match, Cable cable1, Device device2, Device device1, Cable cable2,
			Container container);

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
	CSP isApplicable_solveCsp_BWD(IsApplicableMatch isApplicableMatch, XDevice xDevice1, XCable xCable,
			XContainer xContainer, Cable cable1, XDevice xDevice2, Connections connection1, Device device2,
			Device device1, CableAttributes cableAttributes, XDeviceToDevice xDeviceToDevice,
			XCableToCable xCableToCable2, XDeviceToDevice xDeviceToDevice2, XCableToCable xCableToCable1, Cable cable2,
			Container container, Connections connection2);

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
	void registerObjects_BWD(PerformRuleResult ruleresult, EObject xDevice1, EObject xCable, EObject xContainer,
			EObject cable1, EObject xDevice2, EObject connection1, EObject device2, EObject device1,
			EObject cableAttributes, EObject xDeviceToDevice, EObject xCableToCable2, EObject xDeviceToDevice2,
			EObject xCableToCable1, EObject cable2, EObject container, EObject connection2);

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
	EObjectContainer isAppropriate_BWD_EMoflonEdge_46(EMoflonEdge _edge_source);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	EObjectContainer isAppropriate_FWD_EMoflonEdge_34(EMoflonEdge _edge_endPoint2);

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
	CSP isApplicable_solveCsp_CC(XDevice xDevice1, XCable xCable, XContainer xContainer, Cable cable1, XDevice xDevice2,
			Connections connection1, Device device2, Device device1, CableAttributes cableAttributes, Cable cable2,
			Container container, Connections connection2, Match sourceMatch, Match targetMatch);

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
	boolean checkDEC_FWD(XDevice xDevice1, XCable xCable, XContainer xContainer, XDevice xDevice2,
			Connections connection1, CableAttributes cableAttributes, Connections connection2);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	boolean checkDEC_BWD(Cable cable1, Device device2, Device device1, Cable cable2, Container container);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	ModelgeneratorRuleResult generateModel(RuleEntryContainer ruleEntryContainer,
			XDeviceToDevice xDeviceToDeviceParameter);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	CSP generateModel_solveCsp_BWD(IsApplicableMatch isApplicableMatch, XDevice xDevice1, XCable xCable,
			XContainer xContainer, Cable cable1, XDevice xDevice2, Connections connection1, Device device2,
			Device device1, CableAttributes cableAttributes, XDeviceToDevice xDeviceToDevice,
			XCableToCable xCableToCable2, XDeviceToDevice xDeviceToDevice2, XCableToCable xCableToCable1, Cable cable2,
			Container container, Connections connection2, ModelgeneratorRuleResult ruleResult);

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
