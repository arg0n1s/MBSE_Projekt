/**
 * generated by Xtext 2.11.0
 */
package xtextImplementation.xtextImpl;

import java.math.BigInteger;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>XRouter</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link xtextImplementation.xtextImpl.XRouter#getMaxSpeed <em>Max Speed</em>}</li>
 * </ul>
 *
 * @see xtextImplementation.xtextImpl.XtextImplPackage#getXRouter()
 * @model
 * @generated
 */
public interface XRouter extends XDevice
{
  /**
   * Returns the value of the '<em><b>Max Speed</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Max Speed</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Max Speed</em>' attribute.
   * @see #setMaxSpeed(BigInteger)
   * @see xtextImplementation.xtextImpl.XtextImplPackage#getXRouter_MaxSpeed()
   * @model
   * @generated
   */
  BigInteger getMaxSpeed();

  /**
   * Sets the value of the '{@link xtextImplementation.xtextImpl.XRouter#getMaxSpeed <em>Max Speed</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Max Speed</em>' attribute.
   * @see #getMaxSpeed()
   * @generated
   */
  void setMaxSpeed(BigInteger value);

} // XRouter
