/**
 */
package requirements;

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
 *   <li>{@link requirements.Container#getAgents <em>Agents</em>}</li>
 *   <li>{@link requirements.Container#getNetworkSpan <em>Network Span</em>}</li>
 * </ul>
 *
 * @see requirements.RequirementsPackage#getContainer()
 * @model
 * @generated
 */
public interface Container extends EObject {
	/**
	 * Returns the value of the '<em><b>Agents</b></em>' containment reference list.
	 * The list contents are of type {@link requirements.Agent}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Agents</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Agents</em>' containment reference list.
	 * @see requirements.RequirementsPackage#getContainer_Agents()
	 * @model containment="true"
	 * @generated
	 */
	EList<Agent> getAgents();

	/**
	 * Returns the value of the '<em><b>Network Span</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Network Span</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Network Span</em>' containment reference.
	 * @see #setNetworkSpan(NetworkSpan)
	 * @see requirements.RequirementsPackage#getContainer_NetworkSpan()
	 * @model containment="true"
	 * @generated
	 */
	NetworkSpan getNetworkSpan();

	/**
	 * Sets the value of the '{@link requirements.Container#getNetworkSpan <em>Network Span</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Network Span</em>' containment reference.
	 * @see #getNetworkSpan()
	 * @generated
	 */
	void setNetworkSpan(NetworkSpan value);

} // Container
