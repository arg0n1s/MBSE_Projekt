/**
 */
package implementation;

import java.math.BigInteger;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Cable</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link implementation.Cable#getSpeed <em>Speed</em>}</li>
 *   <li>{@link implementation.Cable#getSource <em>Source</em>}</li>
 *   <li>{@link implementation.Cable#getTarget <em>Target</em>}</li>
 * </ul>
 *
 * @see implementation.ImplementationPackage#getCable()
 * @model
 * @generated
 */
public interface Cable extends EObject {
	/**
	 * Returns the value of the '<em><b>Speed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Speed</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Speed</em>' attribute.
	 * @see #setSpeed(BigInteger)
	 * @see implementation.ImplementationPackage#getCable_Speed()
	 * @model required="true"
	 * @generated
	 */
	BigInteger getSpeed();

	/**
	 * Sets the value of the '{@link implementation.Cable#getSpeed <em>Speed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Speed</em>' attribute.
	 * @see #getSpeed()
	 * @generated
	 */
	void setSpeed(BigInteger value);

	/**
	 * Returns the value of the '<em><b>Source</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link implementation.Device#getOutgoing <em>Outgoing</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source</em>' reference.
	 * @see #setSource(Device)
	 * @see implementation.ImplementationPackage#getCable_Source()
	 * @see implementation.Device#getOutgoing
	 * @model opposite="outgoing" required="true"
	 * @generated
	 */
	Device getSource();

	/**
	 * Sets the value of the '{@link implementation.Cable#getSource <em>Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source</em>' reference.
	 * @see #getSource()
	 * @generated
	 */
	void setSource(Device value);

	/**
	 * Returns the value of the '<em><b>Target</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link implementation.Device#getIncoming <em>Incoming</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target</em>' reference.
	 * @see #setTarget(Device)
	 * @see implementation.ImplementationPackage#getCable_Target()
	 * @see implementation.Device#getIncoming
	 * @model opposite="incoming" required="true"
	 * @generated
	 */
	Device getTarget();

	/**
	 * Sets the value of the '{@link implementation.Cable#getTarget <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target</em>' reference.
	 * @see #getTarget()
	 * @generated
	 */
	void setTarget(Device value);

} // Cable
