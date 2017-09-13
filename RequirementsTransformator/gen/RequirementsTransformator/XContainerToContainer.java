/**
 */
package RequirementsTransformator;

import org.eclipse.emf.ecore.EObject;

import org.moflon.tgg.runtime.AbstractCorrespondence;

import requirements.Container;

import requirementsXtext.reqXtext.XContainer;
// <-- [user defined imports]
// [user defined imports] -->

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>XContainer To Container</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link RequirementsTransformator.XContainerToContainer#getSource <em>Source</em>}</li>
 *   <li>{@link RequirementsTransformator.XContainerToContainer#getTarget <em>Target</em>}</li>
 * </ul>
 * </p>
 *
 * @see RequirementsTransformator.RequirementsTransformatorPackage#getXContainerToContainer()
 * @model
 * @generated
 */
public interface XContainerToContainer extends EObject, AbstractCorrespondence {
	/**
	 * Returns the value of the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source</em>' reference.
	 * @see #setSource(XContainer)
	 * @see RequirementsTransformator.RequirementsTransformatorPackage#getXContainerToContainer_Source()
	 * @model required="true"
	 * @generated
	 */
	XContainer getSource();

	/**
	 * Sets the value of the '{@link RequirementsTransformator.XContainerToContainer#getSource <em>Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source</em>' reference.
	 * @see #getSource()
	 * @generated
	 */
	void setSource(XContainer value);

	/**
	 * Returns the value of the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target</em>' reference.
	 * @see #setTarget(Container)
	 * @see RequirementsTransformator.RequirementsTransformatorPackage#getXContainerToContainer_Target()
	 * @model required="true"
	 * @generated
	 */
	Container getTarget();

	/**
	 * Sets the value of the '{@link RequirementsTransformator.XContainerToContainer#getTarget <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target</em>' reference.
	 * @see #getTarget()
	 * @generated
	 */
	void setTarget(Container value);
	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} // XContainerToContainer
