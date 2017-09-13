/**
 */
package implementation;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Container</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link implementation.Container#getDevices <em>Devices</em>}</li>
 *   <li>{@link implementation.Container#getCables <em>Cables</em>}</li>
 * </ul>
 *
 * @see implementation.ImplementationPackage#getContainer()
 * @model
 * @generated
 */
public interface Container extends EObject {
	/**
	 * Returns the value of the '<em><b>Devices</b></em>' containment reference list.
	 * The list contents are of type {@link implementation.Device}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Devices</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Devices</em>' containment reference list.
	 * @see implementation.ImplementationPackage#getContainer_Devices()
	 * @model containment="true"
	 * @generated
	 */
	EList<Device> getDevices();

	/**
	 * Returns the value of the '<em><b>Cables</b></em>' containment reference list.
	 * The list contents are of type {@link implementation.Cable}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cables</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cables</em>' containment reference list.
	 * @see implementation.ImplementationPackage#getContainer_Cables()
	 * @model containment="true"
	 * @generated
	 */
	EList<Cable> getCables();

} // Container
