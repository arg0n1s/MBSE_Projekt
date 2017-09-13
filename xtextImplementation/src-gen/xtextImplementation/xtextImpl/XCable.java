/**
 * generated by Xtext 2.11.0
 */
package xtextImplementation.xtextImpl;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>XCable</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link xtextImplementation.xtextImpl.XCable#getCableAttributes <em>Cable Attributes</em>}</li>
 * </ul>
 *
 * @see xtextImplementation.xtextImpl.XtextImplPackage#getXCable()
 * @model
 * @generated
 */
public interface XCable extends NetworkElements
{
  /**
   * Returns the value of the '<em><b>Cable Attributes</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Cable Attributes</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Cable Attributes</em>' containment reference.
   * @see #setCableAttributes(CableAttributes)
   * @see xtextImplementation.xtextImpl.XtextImplPackage#getXCable_CableAttributes()
   * @model containment="true"
   * @generated
   */
  CableAttributes getCableAttributes();

  /**
   * Sets the value of the '{@link xtextImplementation.xtextImpl.XCable#getCableAttributes <em>Cable Attributes</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Cable Attributes</em>' containment reference.
   * @see #getCableAttributes()
   * @generated
   */
  void setCableAttributes(CableAttributes value);

} // XCable