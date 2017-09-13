/**
 */
package ReqToImpTransformator;

import org.eclipse.emf.ecore.EObject;

import org.moflon.tgg.runtime.AbstractCorrespondence;

import requirements.Container;
// <-- [user defined imports]
// [user defined imports] -->

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Req Container To Impl Container</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ReqToImpTransformator.ReqContainerToImplContainer#getSource <em>Source</em>}</li>
 *   <li>{@link ReqToImpTransformator.ReqContainerToImplContainer#getTarget <em>Target</em>}</li>
 * </ul>
 * </p>
 *
 * @see ReqToImpTransformator.ReqToImpTransformatorPackage#getReqContainerToImplContainer()
 * @model
 * @generated
 */
public interface ReqContainerToImplContainer extends EObject, AbstractCorrespondence {
	/**
	 * Returns the value of the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source</em>' reference.
	 * @see #setSource(Container)
	 * @see ReqToImpTransformator.ReqToImpTransformatorPackage#getReqContainerToImplContainer_Source()
	 * @model required="true"
	 * @generated
	 */
	Container getSource();

	/**
	 * Sets the value of the '{@link ReqToImpTransformator.ReqContainerToImplContainer#getSource <em>Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source</em>' reference.
	 * @see #getSource()
	 * @generated
	 */
	void setSource(Container value);

	/**
	 * Returns the value of the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target</em>' reference.
	 * @see #setTarget(implementation.Container)
	 * @see ReqToImpTransformator.ReqToImpTransformatorPackage#getReqContainerToImplContainer_Target()
	 * @model required="true"
	 * @generated
	 */
	implementation.Container getTarget();

	/**
	 * Sets the value of the '{@link ReqToImpTransformator.ReqContainerToImplContainer#getTarget <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target</em>' reference.
	 * @see #getTarget()
	 * @generated
	 */
	void setTarget(implementation.Container value);
	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} // ReqContainerToImplContainer
