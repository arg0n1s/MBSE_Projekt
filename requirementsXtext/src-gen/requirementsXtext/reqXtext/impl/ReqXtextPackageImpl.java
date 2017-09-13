/**
 * generated by Xtext 2.11.0
 */
package requirementsXtext.reqXtext.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import requirementsXtext.reqXtext.ReqXtextFactory;
import requirementsXtext.reqXtext.ReqXtextPackage;
import requirementsXtext.reqXtext.XAgent;
import requirementsXtext.reqXtext.XConsumer;
import requirementsXtext.reqXtext.XContainer;
import requirementsXtext.reqXtext.XProvider;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ReqXtextPackageImpl extends EPackageImpl implements ReqXtextPackage
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass xContainerEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass xAgentEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass xProviderEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass xConsumerEClass = null;

  /**
   * Creates an instance of the model <b>Package</b>, registered with
   * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
   * package URI value.
   * <p>Note: the correct way to create the package is via the static
   * factory method {@link #init init()}, which also performs
   * initialization of the package, or returns the registered package,
   * if one already exists.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.emf.ecore.EPackage.Registry
   * @see requirementsXtext.reqXtext.ReqXtextPackage#eNS_URI
   * @see #init()
   * @generated
   */
  private ReqXtextPackageImpl()
  {
    super(eNS_URI, ReqXtextFactory.eINSTANCE);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private static boolean isInited = false;

  /**
   * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
   * 
   * <p>This method is used to initialize {@link ReqXtextPackage#eINSTANCE} when that field is accessed.
   * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #eNS_URI
   * @see #createPackageContents()
   * @see #initializePackageContents()
   * @generated
   */
  public static ReqXtextPackage init()
  {
    if (isInited) return (ReqXtextPackage)EPackage.Registry.INSTANCE.getEPackage(ReqXtextPackage.eNS_URI);

    // Obtain or create and register package
    ReqXtextPackageImpl theReqXtextPackage = (ReqXtextPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof ReqXtextPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new ReqXtextPackageImpl());

    isInited = true;

    // Create package meta-data objects
    theReqXtextPackage.createPackageContents();

    // Initialize created meta-data
    theReqXtextPackage.initializePackageContents();

    // Mark meta-data to indicate it can't be changed
    theReqXtextPackage.freeze();

  
    // Update the registry and return the package
    EPackage.Registry.INSTANCE.put(ReqXtextPackage.eNS_URI, theReqXtextPackage);
    return theReqXtextPackage;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getXContainer()
  {
    return xContainerEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getXContainer_Agents()
  {
    return (EReference)xContainerEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getXAgent()
  {
    return xAgentEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getXAgent_Name()
  {
    return (EAttribute)xAgentEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getXAgent_Speed()
  {
    return (EAttribute)xAgentEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getXProvider()
  {
    return xProviderEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getXConsumer()
  {
    return xConsumerEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ReqXtextFactory getReqXtextFactory()
  {
    return (ReqXtextFactory)getEFactoryInstance();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private boolean isCreated = false;

  /**
   * Creates the meta-model objects for the package.  This method is
   * guarded to have no affect on any invocation but its first.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void createPackageContents()
  {
    if (isCreated) return;
    isCreated = true;

    // Create classes and their features
    xContainerEClass = createEClass(XCONTAINER);
    createEReference(xContainerEClass, XCONTAINER__AGENTS);

    xAgentEClass = createEClass(XAGENT);
    createEAttribute(xAgentEClass, XAGENT__NAME);
    createEAttribute(xAgentEClass, XAGENT__SPEED);

    xProviderEClass = createEClass(XPROVIDER);

    xConsumerEClass = createEClass(XCONSUMER);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private boolean isInitialized = false;

  /**
   * Complete the initialization of the package and its meta-model.  This
   * method is guarded to have no affect on any invocation but its first.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void initializePackageContents()
  {
    if (isInitialized) return;
    isInitialized = true;

    // Initialize package
    setName(eNAME);
    setNsPrefix(eNS_PREFIX);
    setNsURI(eNS_URI);

    // Create type parameters

    // Set bounds for type parameters

    // Add supertypes to classes
    xProviderEClass.getESuperTypes().add(this.getXAgent());
    xConsumerEClass.getESuperTypes().add(this.getXAgent());

    // Initialize classes and features; add operations and parameters
    initEClass(xContainerEClass, XContainer.class, "XContainer", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getXContainer_Agents(), this.getXAgent(), null, "agents", null, 0, -1, XContainer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(xAgentEClass, XAgent.class, "XAgent", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getXAgent_Name(), ecorePackage.getEString(), "name", null, 0, 1, XAgent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getXAgent_Speed(), ecorePackage.getEBigInteger(), "speed", null, 0, 1, XAgent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(xProviderEClass, XProvider.class, "XProvider", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(xConsumerEClass, XConsumer.class, "XConsumer", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    // Create resource
    createResource(eNS_URI);
  }

} //ReqXtextPackageImpl