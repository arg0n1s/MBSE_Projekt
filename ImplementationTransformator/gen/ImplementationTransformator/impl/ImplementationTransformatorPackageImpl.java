/**
 */
package ImplementationTransformator.impl;

import ImplementationTransformator.ImplementationTransformatorFactory;
import ImplementationTransformator.ImplementationTransformatorPackage;

import ImplementationTransformator.Rules.RulesPackage;

import ImplementationTransformator.Rules.impl.RulesPackageImpl;

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

import xtextImplementation.xtextImpl.XtextImplPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ImplementationTransformatorPackageImpl extends EPackageImpl implements ImplementationTransformatorPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected String packageFilename = "ImplementationTransformator.ecore";

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass xCableToCableEClass = null;

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
	private EClass xDeviceToDeviceEClass = null;

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
	 * @see ImplementationTransformator.ImplementationTransformatorPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private ImplementationTransformatorPackageImpl() {
		super(eNS_URI, ImplementationTransformatorFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link ImplementationTransformatorPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @generated
	 */
	public static ImplementationTransformatorPackage init() {
		if (isInited)
			return (ImplementationTransformatorPackage) EPackage.Registry.INSTANCE
					.getEPackage(ImplementationTransformatorPackage.eNS_URI);

		// Obtain or create and register package
		ImplementationTransformatorPackageImpl theImplementationTransformatorPackage = (ImplementationTransformatorPackageImpl) (EPackage.Registry.INSTANCE
				.get(eNS_URI) instanceof ImplementationTransformatorPackageImpl
						? EPackage.Registry.INSTANCE.get(eNS_URI) : new ImplementationTransformatorPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		XtextImplPackage.eINSTANCE.eClass();
		ImplementationPackage.eINSTANCE.eClass();
		RequirementsPackage.eINSTANCE.eClass();
		LanguagePackage.eINSTANCE.eClass();
		RequirementsPackage.eINSTANCE.eClass();
		ImplementationPackage.eINSTANCE.eClass();

		// Obtain or create and register interdependencies
		RulesPackageImpl theRulesPackage = (RulesPackageImpl) (EPackage.Registry.INSTANCE
				.getEPackage(RulesPackage.eNS_URI) instanceof RulesPackageImpl
						? EPackage.Registry.INSTANCE.getEPackage(RulesPackage.eNS_URI) : RulesPackage.eINSTANCE);

		// Load packages
		theImplementationTransformatorPackage.loadPackage();

		// Fix loaded packages
		theImplementationTransformatorPackage.fixPackageContents();
		theRulesPackage.fixPackageContents();

		// Mark meta-data to indicate it can't be changed
		theImplementationTransformatorPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(ImplementationTransformatorPackage.eNS_URI,
				theImplementationTransformatorPackage);
		return theImplementationTransformatorPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getXCableToCable() {
		if (xCableToCableEClass == null) {
			xCableToCableEClass = (EClass) EPackage.Registry.INSTANCE
					.getEPackage(ImplementationTransformatorPackage.eNS_URI).getEClassifiers().get(0);
		}
		return xCableToCableEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getXCableToCable_Source() {
		return (EReference) getXCableToCable().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getXCableToCable_Target() {
		return (EReference) getXCableToCable().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getXContainerToContainer() {
		if (xContainerToContainerEClass == null) {
			xContainerToContainerEClass = (EClass) EPackage.Registry.INSTANCE
					.getEPackage(ImplementationTransformatorPackage.eNS_URI).getEClassifiers().get(1);
		}
		return xContainerToContainerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getXContainerToContainer_Source() {
		return (EReference) getXContainerToContainer().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getXContainerToContainer_Target() {
		return (EReference) getXContainerToContainer().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getXDeviceToDevice() {
		if (xDeviceToDeviceEClass == null) {
			xDeviceToDeviceEClass = (EClass) EPackage.Registry.INSTANCE
					.getEPackage(ImplementationTransformatorPackage.eNS_URI).getEClassifiers().get(2);
		}
		return xDeviceToDeviceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getXDeviceToDevice_Source() {
		return (EReference) getXDeviceToDevice().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getXDeviceToDevice_Target() {
		return (EReference) getXDeviceToDevice().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ImplementationTransformatorFactory getImplementationTransformatorFactory() {
		return (ImplementationTransformatorFactory) getEFactoryInstance();
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
			eClassifier.setInstanceClassName("ImplementationTransformator." + eClassifier.getName());
			setGeneratedClassName(eClassifier);
		}
	}

} //ImplementationTransformatorPackageImpl
