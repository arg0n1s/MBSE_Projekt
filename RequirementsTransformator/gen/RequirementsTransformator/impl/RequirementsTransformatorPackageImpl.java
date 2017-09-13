/**
 */
package RequirementsTransformator.impl;

import RequirementsTransformator.RequirementsTransformatorFactory;
import RequirementsTransformator.RequirementsTransformatorPackage;

import RequirementsTransformator.Rules.RulesPackage;

import RequirementsTransformator.Rules.impl.RulesPackageImpl;

import RequirementsTransformator.XAgentToAgent;
import RequirementsTransformator.XConsumerToConsumer;
import RequirementsTransformator.XContainerToContainer;
import RequirementsTransformator.XProviderToProvider;

import implementation.ImplementationPackage;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.moflon.tgg.language.LanguagePackage;

import org.moflon.tgg.runtime.RuntimePackage;

import requirements.RequirementsPackage;

import requirementsXtext.reqXtext.ReqXtextPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class RequirementsTransformatorPackageImpl extends EPackageImpl implements RequirementsTransformatorPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass xConsumerToConsumerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass xProviderToProviderEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass xContainerToContainerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass xAgentToAgentEClass = null;

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
	 * @see RequirementsTransformator.RequirementsTransformatorPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private RequirementsTransformatorPackageImpl() {
		super(eNS_URI, RequirementsTransformatorFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link RequirementsTransformatorPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static RequirementsTransformatorPackage init() {
		if (isInited)
			return (RequirementsTransformatorPackage) EPackage.Registry.INSTANCE
					.getEPackage(RequirementsTransformatorPackage.eNS_URI);

		// Obtain or create and register package
		RequirementsTransformatorPackageImpl theRequirementsTransformatorPackage = (RequirementsTransformatorPackageImpl) (EPackage.Registry.INSTANCE
				.get(eNS_URI) instanceof RequirementsTransformatorPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI)
						: new RequirementsTransformatorPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		ReqXtextPackage.eINSTANCE.eClass();
		RequirementsPackage.eINSTANCE.eClass();
		ImplementationPackage.eINSTANCE.eClass();
		LanguagePackage.eINSTANCE.eClass();
		ImplementationPackage.eINSTANCE.eClass();
		RequirementsPackage.eINSTANCE.eClass();

		// Obtain or create and register interdependencies
		RulesPackageImpl theRulesPackage = (RulesPackageImpl) (EPackage.Registry.INSTANCE
				.getEPackage(RulesPackage.eNS_URI) instanceof RulesPackageImpl
						? EPackage.Registry.INSTANCE.getEPackage(RulesPackage.eNS_URI) : RulesPackage.eINSTANCE);

		// Create package meta-data objects
		theRequirementsTransformatorPackage.createPackageContents();
		theRulesPackage.createPackageContents();

		// Initialize created meta-data
		theRequirementsTransformatorPackage.initializePackageContents();
		theRulesPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theRequirementsTransformatorPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(RequirementsTransformatorPackage.eNS_URI, theRequirementsTransformatorPackage);
		return theRequirementsTransformatorPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getXConsumerToConsumer() {
		return xConsumerToConsumerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getXConsumerToConsumer_Source() {
		return (EReference) xConsumerToConsumerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getXConsumerToConsumer_Target() {
		return (EReference) xConsumerToConsumerEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getXProviderToProvider() {
		return xProviderToProviderEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getXProviderToProvider_Source() {
		return (EReference) xProviderToProviderEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getXProviderToProvider_Target() {
		return (EReference) xProviderToProviderEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getXContainerToContainer() {
		return xContainerToContainerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getXContainerToContainer_Source() {
		return (EReference) xContainerToContainerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getXContainerToContainer_Target() {
		return (EReference) xContainerToContainerEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getXAgentToAgent() {
		return xAgentToAgentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getXAgentToAgent_Source() {
		return (EReference) xAgentToAgentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getXAgentToAgent_Target() {
		return (EReference) xAgentToAgentEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RequirementsTransformatorFactory getRequirementsTransformatorFactory() {
		return (RequirementsTransformatorFactory) getEFactoryInstance();
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
	public void createPackageContents() {
		if (isCreated)
			return;
		isCreated = true;

		// Create classes and their features
		xConsumerToConsumerEClass = createEClass(XCONSUMER_TO_CONSUMER);
		createEReference(xConsumerToConsumerEClass, XCONSUMER_TO_CONSUMER__SOURCE);
		createEReference(xConsumerToConsumerEClass, XCONSUMER_TO_CONSUMER__TARGET);

		xProviderToProviderEClass = createEClass(XPROVIDER_TO_PROVIDER);
		createEReference(xProviderToProviderEClass, XPROVIDER_TO_PROVIDER__SOURCE);
		createEReference(xProviderToProviderEClass, XPROVIDER_TO_PROVIDER__TARGET);

		xContainerToContainerEClass = createEClass(XCONTAINER_TO_CONTAINER);
		createEReference(xContainerToContainerEClass, XCONTAINER_TO_CONTAINER__SOURCE);
		createEReference(xContainerToContainerEClass, XCONTAINER_TO_CONTAINER__TARGET);

		xAgentToAgentEClass = createEClass(XAGENT_TO_AGENT);
		createEReference(xAgentToAgentEClass, XAGENT_TO_AGENT__SOURCE);
		createEReference(xAgentToAgentEClass, XAGENT_TO_AGENT__TARGET);
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
	public void initializePackageContents() {
		if (isInitialized)
			return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		RulesPackage theRulesPackage = (RulesPackage) EPackage.Registry.INSTANCE.getEPackage(RulesPackage.eNS_URI);
		RuntimePackage theRuntimePackage = (RuntimePackage) EPackage.Registry.INSTANCE
				.getEPackage(RuntimePackage.eNS_URI);
		ReqXtextPackage theReqXtextPackage = (ReqXtextPackage) EPackage.Registry.INSTANCE
				.getEPackage(ReqXtextPackage.eNS_URI);
		RequirementsPackage theRequirementsPackage = (RequirementsPackage) EPackage.Registry.INSTANCE
				.getEPackage(RequirementsPackage.eNS_URI);

		// Add subpackages
		getESubpackages().add(theRulesPackage);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		xConsumerToConsumerEClass.getESuperTypes().add(theRuntimePackage.getAbstractCorrespondence());
		xProviderToProviderEClass.getESuperTypes().add(theRuntimePackage.getAbstractCorrespondence());
		xContainerToContainerEClass.getESuperTypes().add(theRuntimePackage.getAbstractCorrespondence());
		xAgentToAgentEClass.getESuperTypes().add(theRuntimePackage.getAbstractCorrespondence());

		// Initialize classes, features, and operations; add parameters
		initEClass(xConsumerToConsumerEClass, XConsumerToConsumer.class, "XConsumerToConsumer", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getXConsumerToConsumer_Source(), theReqXtextPackage.getXConsumer(), null, "source", null, 1, 1,
				XConsumerToConsumer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getXConsumerToConsumer_Target(), theRequirementsPackage.getConsumer(), null, "target", null, 1,
				1, XConsumerToConsumer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(xProviderToProviderEClass, XProviderToProvider.class, "XProviderToProvider", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getXProviderToProvider_Source(), theReqXtextPackage.getXProvider(), null, "source", null, 1, 1,
				XProviderToProvider.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getXProviderToProvider_Target(), theRequirementsPackage.getProvider(), null, "target", null, 1,
				1, XProviderToProvider.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(xContainerToContainerEClass, XContainerToContainer.class, "XContainerToContainer", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getXContainerToContainer_Source(), theReqXtextPackage.getXContainer(), null, "source", null, 1,
				1, XContainerToContainer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getXContainerToContainer_Target(), theRequirementsPackage.getContainer(), null, "target", null,
				1, 1, XContainerToContainer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(xAgentToAgentEClass, XAgentToAgent.class, "XAgentToAgent", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getXAgentToAgent_Source(), theReqXtextPackage.getXAgent(), null, "source", null, 1, 1,
				XAgentToAgent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getXAgentToAgent_Target(), theRequirementsPackage.getAgent(), null, "target", null, 1, 1,
				XAgentToAgent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //RequirementsTransformatorPackageImpl
