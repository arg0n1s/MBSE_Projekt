/**
 */
package ReqToImpTransformator.Rules.util;

import ReqToImpTransformator.Rules.*;

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
 * @see ReqToImpTransformator.Rules.RulesPackage
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
		case RulesPackage.REQ_PROVIDER_TO_SERVER_RULE: {
			ReqProviderToServerRule reqProviderToServerRule = (ReqProviderToServerRule) theEObject;
			T result = caseReqProviderToServerRule(reqProviderToServerRule);
			if (result == null)
				result = caseAbstractRule(reqProviderToServerRule);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case RulesPackage.VIRTUAL_NODE_TO_COMPUTER_RULE: {
			VirtualNodeToComputerRule virtualNodeToComputerRule = (VirtualNodeToComputerRule) theEObject;
			T result = caseVirtualNodeToComputerRule(virtualNodeToComputerRule);
			if (result == null)
				result = caseAbstractRule(virtualNodeToComputerRule);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case RulesPackage.IMPL_OUTGOING_CONNECTION_IGNORE_RULE: {
			ImplOutgoingConnectionIgnoreRule implOutgoingConnectionIgnoreRule = (ImplOutgoingConnectionIgnoreRule) theEObject;
			T result = caseImplOutgoingConnectionIgnoreRule(implOutgoingConnectionIgnoreRule);
			if (result == null)
				result = caseAbstractRule(implOutgoingConnectionIgnoreRule);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case RulesPackage.IMPL_INCOMING_CONNECTION_IGNORE_RULE: {
			ImplIncomingConnectionIgnoreRule implIncomingConnectionIgnoreRule = (ImplIncomingConnectionIgnoreRule) theEObject;
			T result = caseImplIncomingConnectionIgnoreRule(implIncomingConnectionIgnoreRule);
			if (result == null)
				result = caseAbstractRule(implIncomingConnectionIgnoreRule);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case RulesPackage.VIRTUAL_NODE_TO_ROUTER_RULE1: {
			VirtualNodeToRouterRule1 virtualNodeToRouterRule1 = (VirtualNodeToRouterRule1) theEObject;
			T result = caseVirtualNodeToRouterRule1(virtualNodeToRouterRule1);
			if (result == null)
				result = caseAbstractRule(virtualNodeToRouterRule1);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case RulesPackage.IMPL_GLASS_IGNORE_RULE: {
			ImplGlassIgnoreRule implGlassIgnoreRule = (ImplGlassIgnoreRule) theEObject;
			T result = caseImplGlassIgnoreRule(implGlassIgnoreRule);
			if (result == null)
				result = caseAbstractRule(implGlassIgnoreRule);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case RulesPackage.REQ_CONTAINER_TO_IMPL_CONTAINER_RULE: {
			ReqContainerToImplContainerRule reqContainerToImplContainerRule = (ReqContainerToImplContainerRule) theEObject;
			T result = caseReqContainerToImplContainerRule(reqContainerToImplContainerRule);
			if (result == null)
				result = caseAbstractRule(reqContainerToImplContainerRule);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case RulesPackage.IMPL_COPPER_IGNORE_RULE: {
			ImplCopperIgnoreRule implCopperIgnoreRule = (ImplCopperIgnoreRule) theEObject;
			T result = caseImplCopperIgnoreRule(implCopperIgnoreRule);
			if (result == null)
				result = caseAbstractRule(implCopperIgnoreRule);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case RulesPackage.REQ_CONSUMER_TO_COMPUTER_RULE: {
			ReqConsumerToComputerRule reqConsumerToComputerRule = (ReqConsumerToComputerRule) theEObject;
			T result = caseReqConsumerToComputerRule(reqConsumerToComputerRule);
			if (result == null)
				result = caseAbstractRule(reqConsumerToComputerRule);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case RulesPackage.VIRTUAL_NODE_TO_ROUTER_RULE2: {
			VirtualNodeToRouterRule2 virtualNodeToRouterRule2 = (VirtualNodeToRouterRule2) theEObject;
			T result = caseVirtualNodeToRouterRule2(virtualNodeToRouterRule2);
			if (result == null)
				result = caseAbstractRule(virtualNodeToRouterRule2);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case RulesPackage.IMPL_CABLE_IGNORE_RULE: {
			ImplCableIgnoreRule implCableIgnoreRule = (ImplCableIgnoreRule) theEObject;
			T result = caseImplCableIgnoreRule(implCableIgnoreRule);
			if (result == null)
				result = caseAbstractRule(implCableIgnoreRule);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case RulesPackage.VIRTUAL_NODE_TO_SERVER_RULE: {
			VirtualNodeToServerRule virtualNodeToServerRule = (VirtualNodeToServerRule) theEObject;
			T result = caseVirtualNodeToServerRule(virtualNodeToServerRule);
			if (result == null)
				result = caseAbstractRule(virtualNodeToServerRule);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case RulesPackage.REQ_AGENT_TO_DEVICE_RULE: {
			ReqAgentToDeviceRule reqAgentToDeviceRule = (ReqAgentToDeviceRule) theEObject;
			T result = caseReqAgentToDeviceRule(reqAgentToDeviceRule);
			if (result == null)
				result = caseAbstractRule(reqAgentToDeviceRule);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		default:
			return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Req Provider To Server Rule</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Req Provider To Server Rule</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseReqProviderToServerRule(ReqProviderToServerRule object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Virtual Node To Computer Rule</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Virtual Node To Computer Rule</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVirtualNodeToComputerRule(VirtualNodeToComputerRule object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Impl Outgoing Connection Ignore Rule</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Impl Outgoing Connection Ignore Rule</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseImplOutgoingConnectionIgnoreRule(ImplOutgoingConnectionIgnoreRule object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Impl Incoming Connection Ignore Rule</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Impl Incoming Connection Ignore Rule</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseImplIncomingConnectionIgnoreRule(ImplIncomingConnectionIgnoreRule object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Virtual Node To Router Rule1</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Virtual Node To Router Rule1</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVirtualNodeToRouterRule1(VirtualNodeToRouterRule1 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Impl Glass Ignore Rule</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Impl Glass Ignore Rule</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseImplGlassIgnoreRule(ImplGlassIgnoreRule object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Req Container To Impl Container Rule</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Req Container To Impl Container Rule</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseReqContainerToImplContainerRule(ReqContainerToImplContainerRule object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Impl Copper Ignore Rule</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Impl Copper Ignore Rule</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseImplCopperIgnoreRule(ImplCopperIgnoreRule object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Req Consumer To Computer Rule</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Req Consumer To Computer Rule</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseReqConsumerToComputerRule(ReqConsumerToComputerRule object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Virtual Node To Router Rule2</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Virtual Node To Router Rule2</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVirtualNodeToRouterRule2(VirtualNodeToRouterRule2 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Impl Cable Ignore Rule</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Impl Cable Ignore Rule</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseImplCableIgnoreRule(ImplCableIgnoreRule object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Virtual Node To Server Rule</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Virtual Node To Server Rule</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVirtualNodeToServerRule(VirtualNodeToServerRule object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Req Agent To Device Rule</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Req Agent To Device Rule</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseReqAgentToDeviceRule(ReqAgentToDeviceRule object) {
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
