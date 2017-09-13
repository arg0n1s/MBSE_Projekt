/**
 */
package implementation;

import java.math.BigInteger;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Router</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link implementation.Router#getMaxSpeed <em>Max Speed</em>}</li>
 * </ul>
 *
 * @see implementation.ImplementationPackage#getRouter()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot null='outgoing.speed->sum() <= incoming.speed->sum()'"
 * @generated
 */
public interface Router extends Device {
	/**
	 * Returns the value of the '<em><b>Max Speed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Max Speed</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Max Speed</em>' attribute.
	 * @see #setMaxSpeed(BigInteger)
	 * @see implementation.ImplementationPackage#getRouter_MaxSpeed()
	 * @model required="true"
	 * @generated
	 */
	BigInteger getMaxSpeed();

	/**
	 * Sets the value of the '{@link implementation.Router#getMaxSpeed <em>Max Speed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max Speed</em>' attribute.
	 * @see #getMaxSpeed()
	 * @generated
	 */
	void setMaxSpeed(BigInteger value);

} // Router
