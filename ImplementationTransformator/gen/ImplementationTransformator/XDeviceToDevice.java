/**
 */
package ImplementationTransformator;

import implementation.Device;

import org.eclipse.emf.ecore.EObject;

import org.moflon.tgg.runtime.AbstractCorrespondence;

import xtextImplementation.xtextImpl.XDevice;
// <-- [user defined imports]
// [user defined imports] -->

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>XDevice To Device</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ImplementationTransformator.XDeviceToDevice#getSource <em>Source</em>}</li>
 *   <li>{@link ImplementationTransformator.XDeviceToDevice#getTarget <em>Target</em>}</li>
 * </ul>
 * </p>
 *
 * @see ImplementationTransformator.ImplementationTransformatorPackage#getXDeviceToDevice()
 * @model
 * @generated
 */
public interface XDeviceToDevice extends EObject, AbstractCorrespondence {
	/**
	 * Returns the value of the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source</em>' reference.
	 * @see #setSource(XDevice)
	 * @see ImplementationTransformator.ImplementationTransformatorPackage#getXDeviceToDevice_Source()
	 * @model required="true"
	 * @generated
	 */
	XDevice getSource();

	/**
	 * Sets the value of the '{@link ImplementationTransformator.XDeviceToDevice#getSource <em>Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source</em>' reference.
	 * @see #getSource()
	 * @generated
	 */
	void setSource(XDevice value);

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
	 * @see ImplementationTransformator.ImplementationTransformatorPackage#getXDeviceToDevice_Target()
	 * @model required="true"
	 * @generated
	 */
	Device getTarget();

	/**
	 * Sets the value of the '{@link ImplementationTransformator.XDeviceToDevice#getTarget <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target</em>' reference.
	 * @see #getTarget()
	 * @generated
	 */
	void setTarget(Device value);
	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} // XDeviceToDevice
