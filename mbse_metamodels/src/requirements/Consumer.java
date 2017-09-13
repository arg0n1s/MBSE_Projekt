/**
 */
package requirements;

import implementation.Computer;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Consumer</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link requirements.Consumer#getRightcomp <em>Rightcomp</em>}</li>
 * </ul>
 *
 * @see requirements.RequirementsPackage#getConsumer()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints=''"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot ='name = rightcomp.name'"
 * @generated
 */
public interface Consumer extends Agent {
	/**
	 * Returns the value of the '<em><b>Rightcomp</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rightcomp</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rightcomp</em>' reference.
	 * @see #setRightcomp(Computer)
	 * @see requirements.RequirementsPackage#getConsumer_Rightcomp()
	 * @model required="true"
	 * @generated
	 */
	Computer getRightcomp();

	/**
	 * Sets the value of the '{@link requirements.Consumer#getRightcomp <em>Rightcomp</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rightcomp</em>' reference.
	 * @see #getRightcomp()
	 * @generated
	 */
	void setRightcomp(Computer value);

} // Consumer
