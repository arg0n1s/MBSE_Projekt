/**
 * generated by Xtext 2.11.0
 */
package xtextImplementation.xtextImpl.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import xtextImplementation.xtextImpl.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see xtextImplementation.xtextImpl.XtextImplPackage
 * @generated
 */
public class XtextImplSwitch<T> extends Switch<T>
{
  /**
   * The cached model package
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static XtextImplPackage modelPackage;

  /**
   * Creates an instance of the switch.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public XtextImplSwitch()
  {
    if (modelPackage == null)
    {
      modelPackage = XtextImplPackage.eINSTANCE;
    }
  }

  /**
   * Checks whether this is a switch for the given package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param ePackage the package in question.
   * @return whether this is a switch for the given package.
   * @generated
   */
  @Override
  protected boolean isSwitchFor(EPackage ePackage)
  {
    return ePackage == modelPackage;
  }

  /**
   * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the first non-null result returned by a <code>caseXXX</code> call.
   * @generated
   */
  @Override
  protected T doSwitch(int classifierID, EObject theEObject)
  {
    switch (classifierID)
    {
      case XtextImplPackage.XCONTAINER:
      {
        XContainer xContainer = (XContainer)theEObject;
        T result = caseXContainer(xContainer);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case XtextImplPackage.NETWORK_ELEMENTS:
      {
        NetworkElements networkElements = (NetworkElements)theEObject;
        T result = caseNetworkElements(networkElements);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case XtextImplPackage.XDEVICE:
      {
        XDevice xDevice = (XDevice)theEObject;
        T result = caseXDevice(xDevice);
        if (result == null) result = caseNetworkElements(xDevice);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case XtextImplPackage.XCABLE:
      {
        XCable xCable = (XCable)theEObject;
        T result = caseXCable(xCable);
        if (result == null) result = caseNetworkElements(xCable);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case XtextImplPackage.CONNECTIONS:
      {
        Connections connections = (Connections)theEObject;
        T result = caseConnections(connections);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case XtextImplPackage.CABLE_ATTRIBUTES:
      {
        CableAttributes cableAttributes = (CableAttributes)theEObject;
        T result = caseCableAttributes(cableAttributes);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case XtextImplPackage.XSERVER:
      {
        XServer xServer = (XServer)theEObject;
        T result = caseXServer(xServer);
        if (result == null) result = caseXDevice(xServer);
        if (result == null) result = caseNetworkElements(xServer);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case XtextImplPackage.XCOMPUTER:
      {
        XComputer xComputer = (XComputer)theEObject;
        T result = caseXComputer(xComputer);
        if (result == null) result = caseXDevice(xComputer);
        if (result == null) result = caseNetworkElements(xComputer);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case XtextImplPackage.XROUTER:
      {
        XRouter xRouter = (XRouter)theEObject;
        T result = caseXRouter(xRouter);
        if (result == null) result = caseXDevice(xRouter);
        if (result == null) result = caseNetworkElements(xRouter);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case XtextImplPackage.XCOPPER_CABLE:
      {
        XCopperCable xCopperCable = (XCopperCable)theEObject;
        T result = caseXCopperCable(xCopperCable);
        if (result == null) result = caseXCable(xCopperCable);
        if (result == null) result = caseNetworkElements(xCopperCable);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case XtextImplPackage.XGLASS_FIBER_CABLE:
      {
        XGlassFiberCable xGlassFiberCable = (XGlassFiberCable)theEObject;
        T result = caseXGlassFiberCable(xGlassFiberCable);
        if (result == null) result = caseXCable(xGlassFiberCable);
        if (result == null) result = caseNetworkElements(xGlassFiberCable);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      default: return defaultCase(theEObject);
    }
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>XContainer</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>XContainer</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseXContainer(XContainer object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Network Elements</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Network Elements</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseNetworkElements(NetworkElements object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>XDevice</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>XDevice</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseXDevice(XDevice object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>XCable</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>XCable</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseXCable(XCable object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Connections</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Connections</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseConnections(Connections object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Cable Attributes</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Cable Attributes</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseCableAttributes(CableAttributes object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>XServer</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>XServer</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseXServer(XServer object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>XComputer</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>XComputer</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseXComputer(XComputer object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>XRouter</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>XRouter</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseXRouter(XRouter object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>XCopper Cable</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>XCopper Cable</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseXCopperCable(XCopperCable object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>XGlass Fiber Cable</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>XGlass Fiber Cable</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseXGlassFiberCable(XGlassFiberCable object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch, but this is the last case anyway.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject)
   * @generated
   */
  @Override
  public T defaultCase(EObject object)
  {
    return null;
  }

} //XtextImplSwitch
