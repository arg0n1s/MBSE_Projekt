/**
 */
package implementation;

import java.math.BigInteger;
import requirements.Provider;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Server</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link implementation.Server#getProvider <em>Provider</em>}</li>
 *   <li>{@link implementation.Server#getMaxSlots <em>Max Slots</em>}</li>
 *   <li>{@link implementation.Server#getMTBF <em>MTBF</em>}</li>
 * </ul>
 *
 * @see implementation.ImplementationPackage#getServer()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot null='incoming->isEmpty()'"
 * @generated
 */
public interface Server extends Device {
	/**
	 * Returns the value of the '<em><b>Provider</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Provider</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Provider</em>' reference.
	 * @see #setProvider(Provider)
	 * @see implementation.ImplementationPackage#getServer_Provider()
	 * @model
	 * @generated
	 */
	Provider getProvider();

	/**
	 * Sets the value of the '{@link implementation.Server#getProvider <em>Provider</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Provider</em>' reference.
	 * @see #getProvider()
	 * @generated
	 */
	void setProvider(Provider value);

	/**
	 * Returns the value of the '<em><b>Max Slots</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Max Slots</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Max Slots</em>' attribute.
	 * @see #setMaxSlots(BigInteger)
	 * @see implementation.ImplementationPackage#getServer_MaxSlots()
	 * @model required="true"
	 * @generated
	 */
	BigInteger getMaxSlots();

	/**
	 * Sets the value of the '{@link implementation.Server#getMaxSlots <em>Max Slots</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max Slots</em>' attribute.
	 * @see #getMaxSlots()
	 * @generated
	 */
	void setMaxSlots(BigInteger value);

	/**
	 * Returns the value of the '<em><b>MTBF</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>MTBF</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>MTBF</em>' attribute.
	 * @see #setMTBF(BigInteger)
	 * @see implementation.ImplementationPackage#getServer_MTBF()
	 * @model required="true"
	 * @generated
	 */
	BigInteger getMTBF();

	/**
	 * Sets the value of the '{@link implementation.Server#getMTBF <em>MTBF</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>MTBF</em>' attribute.
	 * @see #getMTBF()
	 * @generated
	 */
	void setMTBF(BigInteger value);

} // Server
