/**
 */
package RequirementsTransformator.util;

import RequirementsTransformator.*;

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
 * @see RequirementsTransformator.RequirementsTransformatorPackage
 * @generated
 */
public class RequirementsTransformatorSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static RequirementsTransformatorPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RequirementsTransformatorSwitch() {
		if (modelPackage == null) {
			modelPackage = RequirementsTransformatorPackage.eINSTANCE;
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
		case RequirementsTransformatorPackage.XCONTAINER_TO_CONTAINER: {
			XContainerToContainer xContainerToContainer = (XContainerToContainer) theEObject;
			T result = caseXContainerToContainer(xContainerToContainer);
			if (result == null)
				result = caseAbstractCorrespondence(xContainerToContainer);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case RequirementsTransformatorPackage.XCONSUMER_TO_CONSUMER: {
			XConsumerToConsumer xConsumerToConsumer = (XConsumerToConsumer) theEObject;
			T result = caseXConsumerToConsumer(xConsumerToConsumer);
			if (result == null)
				result = caseAbstractCorrespondence(xConsumerToConsumer);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case RequirementsTransformatorPackage.XPROVIDER_TO_PROVIDER: {
			XProviderToProvider xProviderToProvider = (XProviderToProvider) theEObject;
			T result = caseXProviderToProvider(xProviderToProvider);
			if (result == null)
				result = caseAbstractCorrespondence(xProviderToProvider);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case RequirementsTransformatorPackage.XAGENT_TO_AGENT: {
			XAgentToAgent xAgentToAgent = (XAgentToAgent) theEObject;
			T result = caseXAgentToAgent(xAgentToAgent);
			if (result == null)
				result = caseAbstractCorrespondence(xAgentToAgent);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		default:
			return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>XContainer To Container</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>XContainer To Container</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseXContainerToContainer(XContainerToContainer object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>XConsumer To Consumer</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>XConsumer To Consumer</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseXConsumerToConsumer(XConsumerToConsumer object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>XProvider To Provider</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>XProvider To Provider</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseXProviderToProvider(XProviderToProvider object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>XAgent To Agent</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>XAgent To Agent</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseXAgentToAgent(XAgentToAgent object) {
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

} //RequirementsTransformatorSwitch
