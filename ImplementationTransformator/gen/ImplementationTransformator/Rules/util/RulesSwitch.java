/**
 */
package ImplementationTransformator.Rules.util;

import ImplementationTransformator.Rules.*;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import org.moflon.tgg.runtime.AbstractRule;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see ImplementationTransformator.Rules.RulesPackage
 * @generated
 */
public class RulesSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static RulesPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RulesSwitch() {
		if (modelPackage == null) {
			modelPackage = RulesPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
		case RulesPackage.XDEVICE_TO_DEVICE_RULE: {
			XDeviceToDeviceRule xDeviceToDeviceRule = (XDeviceToDeviceRule) theEObject;
			T result = caseXDeviceToDeviceRule(xDeviceToDeviceRule);
			if (result == null)
				result = caseAbstractRule(xDeviceToDeviceRule);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case RulesPackage.XDUPLEX_GLASS_FIBER_CABLE_RULE: {
			XDuplexGlassFiberCableRule xDuplexGlassFiberCableRule = (XDuplexGlassFiberCableRule) theEObject;
			T result = caseXDuplexGlassFiberCableRule(xDuplexGlassFiberCableRule);
			if (result == null)
				result = caseAbstractRule(xDuplexGlassFiberCableRule);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case RulesPackage.XDUPLEX_CABLE_TO_CABLES_RULE: {
			XDuplexCableToCablesRule xDuplexCableToCablesRule = (XDuplexCableToCablesRule) theEObject;
			T result = caseXDuplexCableToCablesRule(xDuplexCableToCablesRule);
			if (result == null)
				result = caseAbstractRule(xDuplexCableToCablesRule);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case RulesPackage.XSERVER_TO_SERVER: {
			XServerToServer xServerToServer = (XServerToServer) theEObject;
			T result = caseXServerToServer(xServerToServer);
			if (result == null)
				result = caseAbstractRule(xServerToServer);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case RulesPackage.XSIMPLEX_CONNECTION_TO_CONNECTION_RULE: {
			XSimplexConnectionToConnectionRule xSimplexConnectionToConnectionRule = (XSimplexConnectionToConnectionRule) theEObject;
			T result = caseXSimplexConnectionToConnectionRule(xSimplexConnectionToConnectionRule);
			if (result == null)
				result = caseAbstractRule(xSimplexConnectionToConnectionRule);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case RulesPackage.XDUPLEX_CONNECTION_TO_CONNECTION_RULE: {
			XDuplexConnectionToConnectionRule xDuplexConnectionToConnectionRule = (XDuplexConnectionToConnectionRule) theEObject;
			T result = caseXDuplexConnectionToConnectionRule(xDuplexConnectionToConnectionRule);
			if (result == null)
				result = caseAbstractRule(xDuplexConnectionToConnectionRule);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case RulesPackage.XCOMPUTER_TO_COMPUTER: {
			XComputerToComputer xComputerToComputer = (XComputerToComputer) theEObject;
			T result = caseXComputerToComputer(xComputerToComputer);
			if (result == null)
				result = caseAbstractRule(xComputerToComputer);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case RulesPackage.XROUTER_TO_ROUTER_RULE: {
			XRouterToRouterRule xRouterToRouterRule = (XRouterToRouterRule) theEObject;
			T result = caseXRouterToRouterRule(xRouterToRouterRule);
			if (result == null)
				result = caseAbstractRule(xRouterToRouterRule);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case RulesPackage.XSIMPLEX_COPPER_CABLE_RULE: {
			XSimplexCopperCableRule xSimplexCopperCableRule = (XSimplexCopperCableRule) theEObject;
			T result = caseXSimplexCopperCableRule(xSimplexCopperCableRule);
			if (result == null)
				result = caseAbstractRule(xSimplexCopperCableRule);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case RulesPackage.XSIMPLEX_GLASS_FIBER_CABLE_RULE: {
			XSimplexGlassFiberCableRule xSimplexGlassFiberCableRule = (XSimplexGlassFiberCableRule) theEObject;
			T result = caseXSimplexGlassFiberCableRule(xSimplexGlassFiberCableRule);
			if (result == null)
				result = caseAbstractRule(xSimplexGlassFiberCableRule);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case RulesPackage.XDUPLEX_COPPER_CABLE_RULE: {
			XDuplexCopperCableRule xDuplexCopperCableRule = (XDuplexCopperCableRule) theEObject;
			T result = caseXDuplexCopperCableRule(xDuplexCopperCableRule);
			if (result == null)
				result = caseAbstractRule(xDuplexCopperCableRule);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case RulesPackage.XSIMPLEX_CABLE_TO_CABLE_RULE: {
			XSimplexCableToCableRule xSimplexCableToCableRule = (XSimplexCableToCableRule) theEObject;
			T result = caseXSimplexCableToCableRule(xSimplexCableToCableRule);
			if (result == null)
				result = caseAbstractRule(xSimplexCableToCableRule);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case RulesPackage.XCONTAINER_TO_CONTAINER_RULE: {
			XContainerToContainerRule xContainerToContainerRule = (XContainerToContainerRule) theEObject;
			T result = caseXContainerToContainerRule(xContainerToContainerRule);
			if (result == null)
				result = caseAbstractRule(xContainerToContainerRule);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		default:
			return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>XDevice To Device Rule</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>XDevice To Device Rule</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseXDeviceToDeviceRule(XDeviceToDeviceRule object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>XDuplex Glass Fiber Cable Rule</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>XDuplex Glass Fiber Cable Rule</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseXDuplexGlassFiberCableRule(XDuplexGlassFiberCableRule object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>XDuplex Cable To Cables Rule</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>XDuplex Cable To Cables Rule</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseXDuplexCableToCablesRule(XDuplexCableToCablesRule object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>XServer To Server</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>XServer To Server</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseXServerToServer(XServerToServer object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>XSimplex Connection To Connection Rule</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>XSimplex Connection To Connection Rule</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseXSimplexConnectionToConnectionRule(XSimplexConnectionToConnectionRule object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>XDuplex Connection To Connection Rule</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>XDuplex Connection To Connection Rule</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseXDuplexConnectionToConnectionRule(XDuplexConnectionToConnectionRule object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>XComputer To Computer</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>XComputer To Computer</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseXComputerToComputer(XComputerToComputer object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>XRouter To Router Rule</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>XRouter To Router Rule</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseXRouterToRouterRule(XRouterToRouterRule object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>XSimplex Copper Cable Rule</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>XSimplex Copper Cable Rule</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseXSimplexCopperCableRule(XSimplexCopperCableRule object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>XSimplex Glass Fiber Cable Rule</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>XSimplex Glass Fiber Cable Rule</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseXSimplexGlassFiberCableRule(XSimplexGlassFiberCableRule object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>XDuplex Copper Cable Rule</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>XDuplex Copper Cable Rule</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseXDuplexCopperCableRule(XDuplexCopperCableRule object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>XSimplex Cable To Cable Rule</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>XSimplex Cable To Cable Rule</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseXSimplexCableToCableRule(XSimplexCableToCableRule object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>XContainer To Container Rule</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>XContainer To Container Rule</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseXContainerToContainerRule(XContainerToContainerRule object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Abstract Rule</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Abstract Rule</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAbstractRule(AbstractRule object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //RulesSwitch
