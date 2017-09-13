/**
 */
package ReqToImpTransformator;

import implementation.Computer;

import org.eclipse.emf.ecore.EObject;

import org.moflon.tgg.runtime.AbstractCorrespondence;

import requirements.NetworkSpan;
// <-- [user defined imports]
// [user defined imports] -->

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Virtual Node To Computer</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ReqToImpTransformator.VirtualNodeToComputer#getSource <em>Source</em>}</li>
 *   <li>{@link ReqToImpTransformator.VirtualNodeToComputer#getTarget <em>Target</em>}</li>
 * </ul>
 * </p>
 *
 * @see ReqToImpTransformator.ReqToImpTransformatorPackage#getVirtualNodeToComputer()
 * @model
 * @generated
 */
public interface VirtualNodeToComputer extends EObject, AbstractCorrespondence {
	/**
	 * Returns the value of the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source</em>' reference.
	 * @see #setSource(NetworkSpan)
	 * @see ReqToImpTransformator.ReqToImpTransformatorPackage#getVirtualNodeToComputer_Source()
	 * @model required="true"
	 * @generated
	 */
	NetworkSpan getSource();

	/**
	 * Sets the value of the '{@link ReqToImpTransformator.VirtualNodeToComputer#getSource <em>Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source</em>' reference.
	 * @see #getSource()
	 * @generated
	 */
	void setSource(NetworkSpan value);

	/**
	 * Returns the value of the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target</em>' reference.
	 * @see #setTarget(Computer)
	 * @see ReqToImpTransformator.ReqToImpTransformatorPackage#getVirtualNodeToComputer_Target()
	 * @model required="true"
	 * @generated
	 */
	Computer getTarget();

	/**
	 * Sets the value of the '{@link ReqToImpTransformator.VirtualNodeToComputer#getTarget <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target</em>' reference.
	 * @see #getTarget()
	 * @generated
	 */
	void setTarget(Computer value);
	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} // VirtualNodeToComputer
