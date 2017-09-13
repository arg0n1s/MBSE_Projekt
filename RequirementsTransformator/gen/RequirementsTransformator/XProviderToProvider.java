/**
 */
package RequirementsTransformator;

import org.eclipse.emf.ecore.EObject;

import org.moflon.tgg.runtime.AbstractCorrespondence;

import requirements.Provider;

import requirementsXtext.reqXtext.XProvider;
// <-- [user defined imports]
// [user defined imports] -->

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>XProvider To Provider</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link RequirementsTransformator.XProviderToProvider#getSource <em>Source</em>}</li>
 *   <li>{@link RequirementsTransformator.XProviderToProvider#getTarget <em>Target</em>}</li>
 * </ul>
 * </p>
 *
 * @see RequirementsTransformator.RequirementsTransformatorPackage#getXProviderToProvider()
 * @model
 * @generated
 */
public interface XProviderToProvider extends EObject, AbstractCorrespondence {
	/**
	 * Returns the value of the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source</em>' reference.
	 * @see #setSource(XProvider)
	 * @see RequirementsTransformator.RequirementsTransformatorPackage#getXProviderToProvider_Source()
	 * @model required="true"
	 * @generated
	 */
	XProvider getSource();

	/**
	 * Sets the value of the '{@link RequirementsTransformator.XProviderToProvider#getSource <em>Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source</em>' reference.
	 * @see #getSource()
	 * @generated
	 */
	void setSource(XProvider value);

	/**
	 * Returns the value of the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target</em>' reference.
	 * @see #setTarget(Provider)
	 * @see RequirementsTransformator.RequirementsTransformatorPackage#getXProviderToProvider_Target()
	 * @model required="true"
	 * @generated
	 */
	Provider getTarget();

	/**
	 * Sets the value of the '{@link RequirementsTransformator.XProviderToProvider#getTarget <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target</em>' reference.
	 * @see #getTarget()
	 * @generated
	 */
	void setTarget(Provider value);
	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} // XProviderToProvider
