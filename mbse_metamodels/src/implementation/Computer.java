/**
 */
package implementation;

import requirements.Consumer;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Computer</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link implementation.Computer#getConsumer <em>Consumer</em>}</li>
 * </ul>
 *
 * @see implementation.ImplementationPackage#getComputer()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot null='outgoing->isEmpty()'"
 * @generated
 */
public interface Computer extends Device {
	/**
	 * Returns the value of the '<em><b>Consumer</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Consumer</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Consumer</em>' reference.
	 * @see #setConsumer(Consumer)
	 * @see implementation.ImplementationPackage#getComputer_Consumer()
	 * @model required="true"
	 * @generated
	 */
	Consumer getConsumer();

	/**
	 * Sets the value of the '{@link implementation.Computer#getConsumer <em>Consumer</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Consumer</em>' reference.
	 * @see #getConsumer()
	 * @generated
	 */
	void setConsumer(Consumer value);

} // Computer
