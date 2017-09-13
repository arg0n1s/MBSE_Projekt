/**
 */
package ReqToImpTransformator;

import implementation.Device;

import org.eclipse.emf.ecore.EObject;

import org.moflon.tgg.runtime.AbstractCorrespondence;

import requirements.Agent;
// <-- [user defined imports]
// [user defined imports] -->

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Req Agent To Impl Device</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ReqToImpTransformator.ReqAgentToImplDevice#getSource <em>Source</em>}</li>
 *   <li>{@link ReqToImpTransformator.ReqAgentToImplDevice#getTarget <em>Target</em>}</li>
 * </ul>
 * </p>
 *
 * @see ReqToImpTransformator.ReqToImpTransformatorPackage#getReqAgentToImplDevice()
 * @model
 * @generated
 */
public interface ReqAgentToImplDevice extends EObject, AbstractCorrespondence {
	/**
	 * Returns the value of the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source</em>' reference.
	 * @see #setSource(Agent)
	 * @see ReqToImpTransformator.ReqToImpTransformatorPackage#getReqAgentToImplDevice_Source()
	 * @model required="true"
	 * @generated
	 */
	Agent getSource();

	/**
	 * Sets the value of the '{@link ReqToImpTransformator.ReqAgentToImplDevice#getSource <em>Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source</em>' reference.
	 * @see #getSource()
	 * @generated
	 */
	void setSource(Agent value);

	/**
	 * Returns the value of the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target</em>' reference.
	 * @see #setTarget(Device)
	 * @see ReqToImpTransformator.ReqToImpTransformatorPackage#getReqAgentToImplDevice_Target()
	 * @model required="true"
	 * @generated
	 */
	Device getTarget();

	/**
	 * Sets the value of the '{@link ReqToImpTransformator.ReqAgentToImplDevice#getTarget <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target</em>' reference.
	 * @see #getTarget()
	 * @generated
	 */
	void setTarget(Device value);
	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} // ReqAgentToImplDevice
