/**
 */
package ReqToImpTransformator.util;

import ReqToImpTransformator.*;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import org.moflon.tgg.runtime.AbstractCorrespondence;

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
 * @see ReqToImpTransformator.ReqToImpTransformatorPackage
 * @generated
 */
public class ReqToImpTransformatorSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static ReqToImpTransformatorPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReqToImpTransformatorSwitch() {
		if (modelPackage == null) {
			modelPackage = ReqToImpTransformatorPackage.eINSTANCE;
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
		case ReqToImpTransformatorPackage.REQ_CONTAINER_TO_IMPL_CONTAINER: {
			ReqContainerToImplContainer reqContainerToImplContainer = (ReqContainerToImplContainer) theEObject;
			T result = caseReqContainerToImplContainer(reqContainerToImplContainer);
			if (result == null)
				result = caseAbstractCorrespondence(reqContainerToImplContainer);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ReqToImpTransformatorPackage.REQ_AGENT_TO_IMPL_DEVICE: {
			ReqAgentToImplDevice reqAgentToImplDevice = (ReqAgentToImplDevice) theEObject;
			T result = caseReqAgentToImplDevice(reqAgentToImplDevice);
			if (result == null)
				result = caseAbstractCorrespondence(reqAgentToImplDevice);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ReqToImpTransformatorPackage.VIRTUAL_NODE_TO_SERVER: {
			VirtualNodeToServer virtualNodeToServer = (VirtualNodeToServer) theEObject;
			T result = caseVirtualNodeToServer(virtualNodeToServer);
			if (result == null)
				result = caseAbstractCorrespondence(virtualNodeToServer);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ReqToImpTransformatorPackage.VIRTUAL_NODE_TO_ROUTER: {
			VirtualNodeToRouter virtualNodeToRouter = (VirtualNodeToRouter) theEObject;
			T result = caseVirtualNodeToRouter(virtualNodeToRouter);
			if (result == null)
				result = caseAbstractCorrespondence(virtualNodeToRouter);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ReqToImpTransformatorPackage.VIRTUAL_NODE_TO_COMPUTER: {
			VirtualNodeToComputer virtualNodeToComputer = (VirtualNodeToComputer) theEObject;
			T result = caseVirtualNodeToComputer(virtualNodeToComputer);
			if (result == null)
				result = caseAbstractCorrespondence(virtualNodeToComputer);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		default:
			return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Req Container To Impl Container</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Req Container To Impl Container</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseReqContainerToImplContainer(ReqContainerToImplContainer object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Req Agent To Impl Device</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Req Agent To Impl Device</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseReqAgentToImplDevice(ReqAgentToImplDevice object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Virtual Node To Server</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Virtual Node To Server</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVirtualNodeToServer(VirtualNodeToServer object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Virtual Node To Router</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Virtual Node To Router</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVirtualNodeToRouter(VirtualNodeToRouter object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Virtual Node To Computer</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Virtual Node To Computer</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVirtualNodeToComputer(VirtualNodeToComputer object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Abstract Correspondence</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Abstract Correspondence</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAbstractCorrespondence(AbstractCorrespondence object) {
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

} //ReqToImpTransformatorSwitch
