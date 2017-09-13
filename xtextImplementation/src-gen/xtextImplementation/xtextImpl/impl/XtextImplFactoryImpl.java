/**
 * generated by Xtext 2.11.0
 */
package xtextImplementation.xtextImpl.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import xtextImplementation.xtextImpl.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class XtextImplFactoryImpl extends EFactoryImpl implements XtextImplFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static XtextImplFactory init()
  {
    try
    {
      XtextImplFactory theXtextImplFactory = (XtextImplFactory)EPackage.Registry.INSTANCE.getEFactory(XtextImplPackage.eNS_URI);
      if (theXtextImplFactory != null)
      {
        return theXtextImplFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new XtextImplFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public XtextImplFactoryImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EObject create(EClass eClass)
  {
    switch (eClass.getClassifierID())
    {
      case XtextImplPackage.XCONTAINER: return createXContainer();
      case XtextImplPackage.NETWORK_ELEMENTS: return createNetworkElements();
      case XtextImplPackage.XDEVICE: return createXDevice();
      case XtextImplPackage.XCABLE: return createXCable();
      case XtextImplPackage.CONNECTIONS: return createConnections();
      case XtextImplPackage.CABLE_ATTRIBUTES: return createCableAttributes();
      case XtextImplPackage.XSERVER: return createXServer();
      case XtextImplPackage.XCOMPUTER: return createXComputer();
      case XtextImplPackage.XROUTER: return createXRouter();
      case XtextImplPackage.XCOPPER_CABLE: return createXCopperCable();
      case XtextImplPackage.XGLASS_FIBER_CABLE: return createXGlassFiberCable();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public XContainer createXContainer()
  {
    XContainerImpl xContainer = new XContainerImpl();
    return xContainer;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NetworkElements createNetworkElements()
  {
    NetworkElementsImpl networkElements = new NetworkElementsImpl();
    return networkElements;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public XDevice createXDevice()
  {
    XDeviceImpl xDevice = new XDeviceImpl();
    return xDevice;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public XCable createXCable()
  {
    XCableImpl xCable = new XCableImpl();
    return xCable;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Connections createConnections()
  {
    ConnectionsImpl connections = new ConnectionsImpl();
    return connections;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public CableAttributes createCableAttributes()
  {
    CableAttributesImpl cableAttributes = new CableAttributesImpl();
    return cableAttributes;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public XServer createXServer()
  {
    XServerImpl xServer = new XServerImpl();
    return xServer;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public XComputer createXComputer()
  {
    XComputerImpl xComputer = new XComputerImpl();
    return xComputer;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public XRouter createXRouter()
  {
    XRouterImpl xRouter = new XRouterImpl();
    return xRouter;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public XCopperCable createXCopperCable()
  {
    XCopperCableImpl xCopperCable = new XCopperCableImpl();
    return xCopperCable;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public XGlassFiberCable createXGlassFiberCable()
  {
    XGlassFiberCableImpl xGlassFiberCable = new XGlassFiberCableImpl();
    return xGlassFiberCable;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public XtextImplPackage getXtextImplPackage()
  {
    return (XtextImplPackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static XtextImplPackage getPackage()
  {
    return XtextImplPackage.eINSTANCE;
  }

} //XtextImplFactoryImpl