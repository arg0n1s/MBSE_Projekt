/**
 */
package requirements;

import implementation.Server;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Provider</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link requirements.Provider#getRightserv <em>Rightserv</em>}</li>
 * </ul>
 *
 * @see requirements.RequirementsPackage#getProvider()
 * @model
 * @generated
 */
public interface Provider extends Agent {
	/**
	 * Returns the value of the '<em><b>Rightserv</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rightserv</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rightserv</em>' reference.
	 * @see #setRightserv(Server)
	 * @see requirements.RequirementsPackage#getProvider_Rightserv()
	 * @model required="true"
	 * @generated
	 */
	Server getRightserv();

	/**
	 * Sets the value of the '{@link requirements.Provider#getRightserv <em>Rightserv</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rightserv</em>' reference.
	 * @see #getRightserv()
	 * @generated
	 */
	void setRightserv(Server value);

} // Provider
