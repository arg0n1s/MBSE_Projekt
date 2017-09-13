/**
 */
package RequirementsTransformator;

import org.eclipse.emf.ecore.EObject;

import org.moflon.tgg.runtime.AbstractCorrespondence;

import requirements.Consumer;

import requirementsXtext.reqXtext.XConsumer;
// <-- [user defined imports]
// [user defined imports] -->

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>XConsumer To Consumer</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link RequirementsTransformator.XConsumerToConsumer#getSource <em>Source</em>}</li>
 *   <li>{@link RequirementsTransformator.XConsumerToConsumer#getTarget <em>Target</em>}</li>
 * </ul>
 * </p>
 *
 * @see RequirementsTransformator.RequirementsTransformatorPackage#getXConsumerToConsumer()
 * @model
 * @generated
 */
public interface XConsumerToConsumer extends EObject, AbstractCorrespondence {
	/**
	 * Returns the value of the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source</em>' reference.
	 * @see #setSource(XConsumer)
	 * @see RequirementsTransformator.RequirementsTransformatorPackage#getXConsumerToConsumer_Source()
	 * @model required="true"
	 * @generated
	 */
	XConsumer getSource();

	/**
	 * Sets the value of the '{@link RequirementsTransformator.XConsumerToConsumer#getSource <em>Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source</em>' reference.
	 * @see #getSource()
	 * @generated
	 */
	void setSource(XConsumer value);

	/**
	 * Returns the value of the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target</em>' reference.
	 * @see #setTarget(Consumer)
	 * @see RequirementsTransformator.RequirementsTransformatorPackage#getXConsumerToConsumer_Target()
	 * @model required="true"
	 * @generated
	 */
	Consumer getTarget();

	/**
	 * Sets the value of the '{@link RequirementsTransformator.XConsumerToConsumer#getTarget <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target</em>' reference.
	 * @see #getTarget()
	 * @generated
	 */
	void setTarget(Consumer value);
	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} // XConsumerToConsumer
