/**
 * generated by Xtext 2.11.0
 */
package xtextImplementation.xtextImpl;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see xtextImplementation.xtextImpl.XtextImplPackage
 * @generated
 */
public interface XtextImplFactory extends EFactory
{
  /**
   * The singleton instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  XtextImplFactory eINSTANCE = xtextImplementation.xtextImpl.impl.XtextImplFactoryImpl.init();

  /**
   * Returns a new object of class '<em>XContainer</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>XContainer</em>'.
   * @generated
   */
  XContainer createXContainer();

  /**
   * Returns a new object of class '<em>Network Elements</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Network Elements</em>'.
   * @generated
   */
  NetworkElements createNetworkElements();

  /**
   * Returns a new object of class '<em>XDevice</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>XDevice</em>'.
   * @generated
   */
  XDevice createXDevice();

  /**
   * Returns a new object of class '<em>XCable</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>XCable</em>'.
   * @generated
   */
  XCable createXCable();

  /**
   * Returns a new object of class '<em>Connections</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Connections</em>'.
   * @generated
   */
  Connections createConnections();

  /**
   * Returns a new object of class '<em>Cable Attributes</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Cable Attributes</em>'.
   * @generated
   */
  CableAttributes createCableAttributes();

  /**
   * Returns a new object of class '<em>XServer</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>XServer</em>'.
   * @generated
   */
  XServer createXServer();

  /**
   * Returns a new object of class '<em>XComputer</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>XComputer</em>'.
   * @generated
   */
  XComputer createXComputer();

  /**
   * Returns a new object of class '<em>XRouter</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>XRouter</em>'.
   * @generated
   */
  XRouter createXRouter();

  /**
   * Returns a new object of class '<em>XCopper Cable</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>XCopper Cable</em>'.
   * @generated
   */
  XCopperCable createXCopperCable();

  /**
   * Returns a new object of class '<em>XGlass Fiber Cable</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>XGlass Fiber Cable</em>'.
   * @generated
   */
  XGlassFiberCable createXGlassFiberCable();

  /**
   * Returns the package supported by this factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the package supported by this factory.
   * @generated
   */
  XtextImplPackage getXtextImplPackage();

} //XtextImplFactory