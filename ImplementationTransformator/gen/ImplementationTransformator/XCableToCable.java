/**
 */
package ImplementationTransformator;

import implementation.Cable;

import org.eclipse.emf.ecore.EObject;

import org.moflon.tgg.runtime.AbstractCorrespondence;

import xtextImplementation.xtextImpl.XCable;
// <-- [user defined imports]
// [user defined imports] -->

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>XCable To Cable</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ImplementationTransformator.XCableToCable#getSource <em>Source</em>}</li>
 *   <li>{@link ImplementationTransformator.XCableToCable#getTarget <em>Target</em>}</li>
 * </ul>
 * </p>
 *
 * @see ImplementationTransformator.ImplementationTransformatorPackage#getXCableToCable()
 * @model
 * @generated
 */
public interface XCableToCable extends EObject, AbstractCorrespondence {
	/**
	 * Returns the value of the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source</em>' reference.
	 * @see #setSource(XCable)
	 * @see ImplementationTransformator.ImplementationTransformatorPackage#getXCableToCable_Source()
	 * @model required="true"
	 * @generated
	 */
	XCable getSource();

	/**
	 * Sets the value of the '{@link ImplementationTransformator.XCableToCable#getSource <em>Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source</em>' reference.
	 * @see #getSource()
	 * @generated
	 */
	void setSource(XCable value);

	/**
	 * Returns the value of the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target</em>' reference.
	 * @see #setTarget(Cable)
	 * @see ImplementationTransformator.ImplementationTransformatorPackage#getXCableToCable_Target()
	 * @model required="true"
	 * @generated
	 */
	Cable getTarget();

	/**
	 * Sets the value of the '{@link ImplementationTransformator.XCableToCable#getTarget <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target</em>' reference.
	 * @see #getTarget()
	 * @generated
	 */
	void setTarget(Cable value);
	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} // XCableToCable
