/**
 */
package RequirementsTransformator;

import org.eclipse.emf.ecore.EObject;

import org.moflon.tgg.runtime.AbstractCorrespondence;

import requirements.Agent;

import requirementsXtext.reqXtext.XAgent;
// <-- [user defined imports]
// [user defined imports] -->

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>XAgent To Agent</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link RequirementsTransformator.XAgentToAgent#getSource <em>Source</em>}</li>
 *   <li>{@link RequirementsTransformator.XAgentToAgent#getTarget <em>Target</em>}</li>
 * </ul>
 * </p>
 *
 * @see RequirementsTransformator.RequirementsTransformatorPackage#getXAgentToAgent()
 * @model
 * @generated
 */
public interface XAgentToAgent extends EObject, AbstractCorrespondence {
	/**
	 * Returns the value of the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source</em>' reference.
	 * @see #setSource(XAgent)
	 * @see RequirementsTransformator.RequirementsTransformatorPackage#getXAgentToAgent_Source()
	 * @model required="true"
	 * @generated
	 */
	XAgent getSource();

	/**
	 * Sets the value of the '{@link RequirementsTransformator.XAgentToAgent#getSource <em>Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source</em>' reference.
	 * @see #getSource()
	 * @generated
	 */
	void setSource(XAgent value);

	/**
	 * Returns the value of the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target</em>' reference.
	 * @see #setTarget(Agent)
	 * @see RequirementsTransformator.RequirementsTransformatorPackage#getXAgentToAgent_Target()
	 * @model required="true"
	 * @generated
	 */
	Agent getTarget();

	/**
	 * Sets the value of the '{@link RequirementsTransformator.XAgentToAgent#getTarget <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target</em>' reference.
	 * @see #getTarget()
	 * @generated
	 */
	void setTarget(Agent value);
	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} // XAgentToAgent
