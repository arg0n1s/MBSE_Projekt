/**
 */
package ReqToImpTransformator;

import implementation.Server;

import org.eclipse.emf.ecore.EObject;

import org.moflon.tgg.runtime.AbstractCorrespondence;

import requirements.NetworkSpan;
// <-- [user defined imports]
// [user defined imports] -->

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Virtual Node To Server</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ReqToImpTransformator.VirtualNodeToServer#getSource <em>Source</em>}</li>
 *   <li>{@link ReqToImpTransformator.VirtualNodeToServer#getTarget <em>Target</em>}</li>
 * </ul>
 * </p>
 *
 * @see ReqToImpTransformator.ReqToImpTransformatorPackage#getVirtualNodeToServer()
 * @model
 * @generated
 */
public interface VirtualNodeToServer extends EObject, AbstractCorrespondence {
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
	 * @see ReqToImpTransformator.ReqToImpTransformatorPackage#getVirtualNodeToServer_Source()
	 * @model required="true"
	 * @generated
	 */
	NetworkSpan getSource();

	/**
	 * Sets the value of the '{@link ReqToImpTransformator.VirtualNodeToServer#getSource <em>Source</em>}' reference.
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
	 * @see #setTarget(Server)
	 * @see ReqToImpTransformator.ReqToImpTransformatorPackage#getVirtualNodeToServer_Target()
	 * @model required="true"
	 * @generated
	 */
	Server getTarget();

	/**
	 * Sets the value of the '{@link ReqToImpTransformator.VirtualNodeToServer#getTarget <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target</em>' reference.
	 * @see #getTarget()
	 * @generated
	 */
	void setTarget(Server value);
	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} // VirtualNodeToServer
