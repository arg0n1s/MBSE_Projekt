/**
 */
package ReqToImpTransformator.impl;

import ReqToImpTransformator.ReqToImpTransformatorFactory;
import ReqToImpTransformator.ReqToImpTransformatorPackage;

import ReqToImpTransformator.Rules.RulesPackage;

import ReqToImpTransformator.Rules.impl.RulesPackageImpl;

import implementation.ImplementationPackage;

import java.io.IOException;

import java.net.URL;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.common.util.WrappedException;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.eclipse.emf.ecore.resource.Resource;

import org.eclipse.emf.ecore.xmi.impl.EcoreResourceFactoryImpl;

import org.moflon.tgg.language.LanguagePackage;

import requirements.RequirementsPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ReqToImpTransformatorPackageImpl extends EPackageImpl implements ReqToImpTransformatorPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected String packageFilename = "ReqToImpTransformator.ecore";

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass virtualNodeToComputerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass reqContainerToImplContainerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass virtualNodeToServerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass virtualNodeToRouterEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass reqAgentToImplDeviceEClass = null;

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
	 * @see ReqToImpTransformator.ReqToImpTransformatorPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private ReqToImpTransformatorPackageImpl() {
		super(eNS_URI, ReqToImpTransformatorFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link ReqToImpTransformatorPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @generated
	 */
	public static ReqToImpTransformatorPackage init() {
		if (isInited)
			return (ReqToImpTransformatorPackage) EPackage.Registry.INSTANCE
					.getEPackage(ReqToImpTransformatorPackage.eNS_URI);

		// Obtain or create and register package
		ReqToImpTransformatorPackageImpl theReqToImpTransformatorPackage = (ReqToImpTransformatorPackageImpl) (EPackage.Registry.INSTANCE
				.get(eNS_URI) instanceof ReqToImpTransformatorPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI)
						: new ReqToImpTransformatorPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		RequirementsPackage.eINSTANCE.eClass();
		ImplementationPackage.eINSTANCE.eClass();
		ImplementationPackage.eINSTANCE.eClass();
		RequirementsPackage.eINSTANCE.eClass();
		LanguagePackage.eINSTANCE.eClass();

		// Obtain or create and register interdependencies
		RulesPackageImpl theRulesPackage = (RulesPackageImpl) (EPackage.Registry.INSTANCE
				.getEPackage(RulesPackage.eNS_URI) instanceof RulesPackageImpl
						? EPackage.Registry.INSTANCE.getEPackage(RulesPackage.eNS_URI) : RulesPackage.eINSTANCE);

		// Load packages
		theReqToImpTransformatorPackage.loadPackage();

		// Fix loaded packages
		theReqToImpTransformatorPackage.fixPackageContents();
		theRulesPackage.fixPackageContents();

		// Mark meta-data to indicate it can't be changed
		theReqToImpTransformatorPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(ReqToImpTransformatorPackage.eNS_URI, theReqToImpTransformatorPackage);
		return theReqToImpTransformatorPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVirtualNodeToComputer() {
		if (virtualNodeToComputerEClass == null) {
			virtualNodeToComputerEClass = (EClass) EPackage.Registry.INSTANCE
					.getEPackage(ReqToImpTransformatorPackage.eNS_URI).getEClassifiers().get(0);
		}
		return virtualNodeToComputerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVirtualNodeToComputer_Source() {
		return (EReference) getVirtualNodeToComputer().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVirtualNodeToComputer_Target() {
		return (EReference) getVirtualNodeToComputer().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getReqContainerToImplContainer() {
		if (reqContainerToImplContainerEClass == null) {
			reqContainerToImplContainerEClass = (EClass) EPackage.Registry.INSTANCE
					.getEPackage(ReqToImpTransformatorPackage.eNS_URI).getEClassifiers().get(1);
		}
		return reqContainerToImplContainerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getReqContainerToImplContainer_Source() {
		return (EReference) getReqContainerToImplContainer().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getReqContainerToImplContainer_Target() {
		return (EReference) getReqContainerToImplContainer().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVirtualNodeToServer() {
		if (virtualNodeToServerEClass == null) {
			virtualNodeToServerEClass = (EClass) EPackage.Registry.INSTANCE
					.getEPackage(ReqToImpTransformatorPackage.eNS_URI).getEClassifiers().get(2);
		}
		return virtualNodeToServerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVirtualNodeToServer_Source() {
		return (EReference) getVirtualNodeToServer().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVirtualNodeToServer_Target() {
		return (EReference) getVirtualNodeToServer().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVirtualNodeToRouter() {
		if (virtualNodeToRouterEClass == null) {
			virtualNodeToRouterEClass = (EClass) EPackage.Registry.INSTANCE
					.getEPackage(ReqToImpTransformatorPackage.eNS_URI).getEClassifiers().get(3);
		}
		return virtualNodeToRouterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVirtualNodeToRouter_Source() {
		return (EReference) getVirtualNodeToRouter().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVirtualNodeToRouter_Target() {
		return (EReference) getVirtualNodeToRouter().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getReqAgentToImplDevice() {
		if (reqAgentToImplDeviceEClass == null) {
			reqAgentToImplDeviceEClass = (EClass) EPackage.Registry.INSTANCE
					.getEPackage(ReqToImpTransformatorPackage.eNS_URI).getEClassifiers().get(4);
		}
		return reqAgentToImplDeviceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getReqAgentToImplDevice_Source() {
		return (EReference) getReqAgentToImplDevice().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getReqAgentToImplDevice_Target() {
		return (EReference) getReqAgentToImplDevice().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReqToImpTransformatorFactory getReqToImpTransformatorFactory() {
		return (ReqToImpTransformatorFactory) getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isLoaded = false;

	/**
	 * Laods the package and any sub-packages from their serialized form.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void loadPackage() {
		if (isLoaded)
			return;
		isLoaded = true;

		URL url = getClass().getResource(packageFilename);
		if (url == null) {
			throw new RuntimeException("Missing serialized package: " + packageFilename);
		}
		URI uri = URI.createURI(url.toString());
		Resource resource = new EcoreResourceFactoryImpl().createResource(uri);
		try {
			resource.load(null);
		} catch (IOException exception) {
			throw new WrappedException(exception);
		}
		initializeFromLoadedEPackage(this, (EPackage) resource.getContents().get(0));
		createResource(eNS_URI);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isFixed = false;

	/**
	 * Fixes up the loaded package, to make it appear as if it had been programmatically built.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void fixPackageContents() {
		if (isFixed)
			return;
		isFixed = true;
		fixEClassifiers();
	}

	/**
	 * Sets the instance class on the given classifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected void fixInstanceClass(EClassifier eClassifier) {
		if (eClassifier.getInstanceClassName() == null) {
			eClassifier.setInstanceClassName("ReqToImpTransformator." + eClassifier.getName());
			setGeneratedClassName(eClassifier);
		}
	}

} //ReqToImpTransformatorPackageImpl
