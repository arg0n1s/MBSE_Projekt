/**
 */
package ImplementationTransformator.Rules.impl;

import ImplementationTransformator.ImplementationTransformatorPackage;

import ImplementationTransformator.Rules.RulesFactory;
import ImplementationTransformator.Rules.RulesPackage;

import ImplementationTransformator.impl.ImplementationTransformatorPackageImpl;

import implementation.ImplementationPackage;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.moflon.tgg.language.LanguagePackage;

import requirements.RequirementsPackage;

import xtextImplementation.xtextImpl.XtextImplPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class RulesPackageImpl extends EPackageImpl implements RulesPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass xContainerToContainerRuleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass xDuplexGlassFiberCableRuleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass xComputerToComputerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass xSimplexGlassFiberCableRuleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass xSimplexConnectionToConnectionRuleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass xSimplexCopperCableRuleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass xDuplexCopperCableRuleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass xServerToServerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass xDuplexConnectionToConnectionRuleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass xRouterToRouterRuleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass xDuplexCableToCablesRuleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass xSimplexCableToCableRuleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass xDeviceToDeviceRuleEClass = null;

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
	 * @see ImplementationTransformator.Rules.RulesPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private RulesPackageImpl() {
		super(eNS_URI, RulesFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link RulesPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @generated
	 */
	public static RulesPackage init() {
		if (isInited)
			return (RulesPackage) EPackage.Registry.INSTANCE.getEPackage(RulesPackage.eNS_URI);

		// Obtain or create and register package
		RulesPackageImpl theRulesPackage = (RulesPackageImpl) (EPackage.Registry.INSTANCE
				.get(eNS_URI) instanceof RulesPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI)
						: new RulesPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		XtextImplPackage.eINSTANCE.eClass();
		ImplementationPackage.eINSTANCE.eClass();
		RequirementsPackage.eINSTANCE.eClass();
		LanguagePackage.eINSTANCE.eClass();
		RequirementsPackage.eINSTANCE.eClass();
		ImplementationPackage.eINSTANCE.eClass();

		// Obtain or create and register interdependencies
		ImplementationTransformatorPackageImpl theImplementationTransformatorPackage = (ImplementationTransformatorPackageImpl) (EPackage.Registry.INSTANCE
				.getEPackage(
						ImplementationTransformatorPackage.eNS_URI) instanceof ImplementationTransformatorPackageImpl
								? EPackage.Registry.INSTANCE.getEPackage(ImplementationTransformatorPackage.eNS_URI)
								: ImplementationTransformatorPackage.eINSTANCE);

		// Load packages
		theImplementationTransformatorPackage.loadPackage();

		// Fix loaded packages
		theRulesPackage.fixPackageContents();
		theImplementationTransformatorPackage.fixPackageContents();

		// Mark meta-data to indicate it can't be changed
		theRulesPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(RulesPackage.eNS_URI, theRulesPackage);
		return theRulesPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getXContainerToContainerRule() {
		if (xContainerToContainerRuleEClass == null) {
			xContainerToContainerRuleEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(RulesPackage.eNS_URI)
					.getEClassifiers().get(0);
		}
		return xContainerToContainerRuleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getXContainerToContainerRule__IsAppropriate_FWD__Match_XContainer() {
		return getXContainerToContainerRule().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getXContainerToContainerRule__Perform_FWD__IsApplicableMatch() {
		return getXContainerToContainerRule().getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getXContainerToContainerRule__IsApplicable_FWD__Match() {
		return getXContainerToContainerRule().getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getXContainerToContainerRule__RegisterObjectsToMatch_FWD__Match_XContainer() {
		return getXContainerToContainerRule().getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getXContainerToContainerRule__IsAppropriate_solveCsp_FWD__Match_XContainer() {
		return getXContainerToContainerRule().getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getXContainerToContainerRule__IsAppropriate_checkCsp_FWD__CSP() {
		return getXContainerToContainerRule().getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getXContainerToContainerRule__IsApplicable_solveCsp_FWD__IsApplicableMatch_XContainer() {
		return getXContainerToContainerRule().getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getXContainerToContainerRule__IsApplicable_checkCsp_FWD__CSP() {
		return getXContainerToContainerRule().getEOperations().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getXContainerToContainerRule__RegisterObjects_FWD__PerformRuleResult_EObject_EObject_EObject() {
		return getXContainerToContainerRule().getEOperations().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getXContainerToContainerRule__CheckTypes_FWD__Match() {
		return getXContainerToContainerRule().getEOperations().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getXContainerToContainerRule__IsAppropriate_BWD__Match_Container() {
		return getXContainerToContainerRule().getEOperations().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getXContainerToContainerRule__Perform_BWD__IsApplicableMatch() {
		return getXContainerToContainerRule().getEOperations().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getXContainerToContainerRule__IsApplicable_BWD__Match() {
		return getXContainerToContainerRule().getEOperations().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getXContainerToContainerRule__RegisterObjectsToMatch_BWD__Match_Container() {
		return getXContainerToContainerRule().getEOperations().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getXContainerToContainerRule__IsAppropriate_solveCsp_BWD__Match_Container() {
		return getXContainerToContainerRule().getEOperations().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getXContainerToContainerRule__IsAppropriate_checkCsp_BWD__CSP() {
		return getXContainerToContainerRule().getEOperations().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getXContainerToContainerRule__IsApplicable_solveCsp_BWD__IsApplicableMatch_Container() {
		return getXContainerToContainerRule().getEOperations().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getXContainerToContainerRule__IsApplicable_checkCsp_BWD__CSP() {
		return getXContainerToContainerRule().getEOperations().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getXContainerToContainerRule__RegisterObjects_BWD__PerformRuleResult_EObject_EObject_EObject() {
		return getXContainerToContainerRule().getEOperations().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getXContainerToContainerRule__CheckTypes_BWD__Match() {
		return getXContainerToContainerRule().getEOperations().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getXContainerToContainerRule__IsAppropriate_BWD_Container_1__Container() {
		return getXContainerToContainerRule().getEOperations().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getXContainerToContainerRule__IsAppropriate_FWD_XContainer_1__XContainer() {
		return getXContainerToContainerRule().getEOperations().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getXContainerToContainerRule__CheckAttributes_FWD__TripleMatch() {
		return getXContainerToContainerRule().getEOperations().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getXContainerToContainerRule__CheckAttributes_BWD__TripleMatch() {
		return getXContainerToContainerRule().getEOperations().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getXContainerToContainerRule__IsApplicable_CC__Match_Match() {
		return getXContainerToContainerRule().getEOperations().get(24);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getXContainerToContainerRule__IsApplicable_solveCsp_CC__Container_XContainer_Match_Match() {
		return getXContainerToContainerRule().getEOperations().get(25);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getXContainerToContainerRule__IsApplicable_checkCsp_CC__CSP() {
		return getXContainerToContainerRule().getEOperations().get(26);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getXContainerToContainerRule__CheckDEC_FWD__XContainer() {
		return getXContainerToContainerRule().getEOperations().get(27);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getXContainerToContainerRule__CheckDEC_BWD__Container() {
		return getXContainerToContainerRule().getEOperations().get(28);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getXContainerToContainerRule__GenerateModel__RuleEntryContainer() {
		return getXContainerToContainerRule().getEOperations().get(29);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getXContainerToContainerRule__GenerateModel_solveCsp_BWD__IsApplicableMatch_ModelgeneratorRuleResult() {
		return getXContainerToContainerRule().getEOperations().get(30);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getXContainerToContainerRule__GenerateModel_checkCsp_BWD__CSP() {
		return getXContainerToContainerRule().getEOperations().get(31);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getXDuplexGlassFiberCableRule() {
		if (xDuplexGlassFiberCableRuleEClass == null) {
			xDuplexGlassFiberCableRuleEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(RulesPackage.eNS_URI)
					.getEClassifiers().get(1);
		}
		return xDuplexGlassFiberCableRuleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getXDuplexGlassFiberCableRule__IsAppropriate_FWD__Match_CableAttributes_XDevice_XGlassFiberCable_XContainer() {
		return getXDuplexGlassFiberCableRule().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getXDuplexGlassFiberCableRule__Perform_FWD__IsApplicableMatch() {
		return getXDuplexGlassFiberCableRule().getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getXDuplexGlassFiberCableRule__IsApplicable_FWD__Match() {
		return getXDuplexGlassFiberCableRule().getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getXDuplexGlassFiberCableRule__RegisterObjectsToMatch_FWD__Match_CableAttributes_XDevice_XGlassFiberCable_XContainer() {
		return getXDuplexGlassFiberCableRule().getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getXDuplexGlassFiberCableRule__IsAppropriate_solveCsp_FWD__Match_CableAttributes_XDevice_XGlassFiberCable_XContainer() {
		return getXDuplexGlassFiberCableRule().getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getXDuplexGlassFiberCableRule__IsAppropriate_checkCsp_FWD__CSP() {
		return getXDuplexGlassFiberCableRule().getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getXDuplexGlassFiberCableRule__IsApplicable_solveCsp_FWD__IsApplicableMatch_Container_CableAttributes_XDevice_XGlassFiberCable_XContainer_Device_XDeviceToDevice() {
		return getXDuplexGlassFiberCableRule().getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getXDuplexGlassFiberCableRule__IsApplicable_checkCsp_FWD__CSP() {
		return getXDuplexGlassFiberCableRule().getEOperations().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getXDuplexGlassFiberCableRule__RegisterObjects_FWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject() {
		return getXDuplexGlassFiberCableRule().getEOperations().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getXDuplexGlassFiberCableRule__CheckTypes_FWD__Match() {
		return getXDuplexGlassFiberCableRule().getEOperations().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getXDuplexGlassFiberCableRule__IsAppropriate_BWD__Match_GlassFiberCable_Container_GlassFiberCable_Device() {
		return getXDuplexGlassFiberCableRule().getEOperations().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getXDuplexGlassFiberCableRule__Perform_BWD__IsApplicableMatch() {
		return getXDuplexGlassFiberCableRule().getEOperations().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getXDuplexGlassFiberCableRule__IsApplicable_BWD__Match() {
		return getXDuplexGlassFiberCableRule().getEOperations().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getXDuplexGlassFiberCableRule__RegisterObjectsToMatch_BWD__Match_GlassFiberCable_Container_GlassFiberCable_Device() {
		return getXDuplexGlassFiberCableRule().getEOperations().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getXDuplexGlassFiberCableRule__IsAppropriate_solveCsp_BWD__Match_GlassFiberCable_Container_GlassFiberCable_Device() {
		return getXDuplexGlassFiberCableRule().getEOperations().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getXDuplexGlassFiberCableRule__IsAppropriate_checkCsp_BWD__CSP() {
		return getXDuplexGlassFiberCableRule().getEOperations().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getXDuplexGlassFiberCableRule__IsApplicable_solveCsp_BWD__IsApplicableMatch_GlassFiberCable_Container_GlassFiberCable_XDevice_XContainer_Device_XDeviceToDevice() {
		return getXDuplexGlassFiberCableRule().getEOperations().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getXDuplexGlassFiberCableRule__IsApplicable_checkCsp_BWD__CSP() {
		return getXDuplexGlassFiberCableRule().getEOperations().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getXDuplexGlassFiberCableRule__RegisterObjects_BWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject() {
		return getXDuplexGlassFiberCableRule().getEOperations().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getXDuplexGlassFiberCableRule__CheckTypes_BWD__Match() {
		return getXDuplexGlassFiberCableRule().getEOperations().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getXDuplexGlassFiberCableRule__IsAppropriate_BWD_EMoflonEdge_9__EMoflonEdge() {
		return getXDuplexGlassFiberCableRule().getEOperations().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getXDuplexGlassFiberCableRule__IsAppropriate_FWD_EMoflonEdge_5__EMoflonEdge() {
		return getXDuplexGlassFiberCableRule().getEOperations().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getXDuplexGlassFiberCableRule__CheckAttributes_FWD__TripleMatch() {
		return getXDuplexGlassFiberCableRule().getEOperations().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getXDuplexGlassFiberCableRule__CheckAttributes_BWD__TripleMatch() {
		return getXDuplexGlassFiberCableRule().getEOperations().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getXDuplexGlassFiberCableRule__IsApplicable_CC__Match_Match() {
		return getXDuplexGlassFiberCableRule().getEOperations().get(24);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getXDuplexGlassFiberCableRule__IsApplicable_solveCsp_CC__GlassFiberCable_Container_GlassFiberCable_CableAttributes_XDevice_XGlassFiberCable_XContainer_Device_Match_Match() {
		return getXDuplexGlassFiberCableRule().getEOperations().get(25);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getXDuplexGlassFiberCableRule__IsApplicable_checkCsp_CC__CSP() {
		return getXDuplexGlassFiberCableRule().getEOperations().get(26);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getXDuplexGlassFiberCableRule__CheckDEC_FWD__CableAttributes_XDevice_XGlassFiberCable_XContainer() {
		return getXDuplexGlassFiberCableRule().getEOperations().get(27);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getXDuplexGlassFiberCableRule__CheckDEC_BWD__GlassFiberCable_Container_GlassFiberCable_Device() {
		return getXDuplexGlassFiberCableRule().getEOperations().get(28);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getXDuplexGlassFiberCableRule__GenerateModel__RuleEntryContainer_XDeviceToDevice() {
		return getXDuplexGlassFiberCableRule().getEOperations().get(29);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getXDuplexGlassFiberCableRule__GenerateModel_solveCsp_BWD__IsApplicableMatch_Container_XDevice_XContainer_Device_XDeviceToDevice_ModelgeneratorRuleResult() {
		return getXDuplexGlassFiberCableRule().getEOperations().get(30);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getXDuplexGlassFiberCableRule__GenerateModel_checkCsp_BWD__CSP() {
		return getXDuplexGlassFiberCableRule().getEOperations().get(31);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getXComputerToComputer() {
		if (xComputerToComputerEClass == null) {
			xComputerToComputerEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(RulesPackage.eNS_URI)
					.getEClassifiers().get(2);
		}
		return xComputerToComputerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getXComputerToComputer__IsAppropriate_FWD__Match_XComputer_XContainer_Connections() {
		return getXComputerToComputer().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getXComputerToComputer__Perform_FWD__IsApplicableMatch() {
		return getXComputerToComputer().getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getXComputerToComputer__IsApplicable_FWD__Match() {
		return getXComputerToComputer().getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getXComputerToComputer__RegisterObjectsToMatch_FWD__Match_XComputer_XContainer_Connections() {
		return getXComputerToComputer().getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getXComputerToComputer__IsAppropriate_solveCsp_FWD__Match_XComputer_XContainer_Connections() {
		return getXComputerToComputer().getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getXComputerToComputer__IsAppropriate_checkCsp_FWD__CSP() {
		return getXComputerToComputer().getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getXComputerToComputer__IsApplicable_solveCsp_FWD__IsApplicableMatch_Container_XContainerToContainer_XComputer_XContainer_Connections() {
		return getXComputerToComputer().getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getXComputerToComputer__IsApplicable_checkCsp_FWD__CSP() {
		return getXComputerToComputer().getEOperations().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getXComputerToComputer__RegisterObjects_FWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject() {
		return getXComputerToComputer().getEOperations().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getXComputerToComputer__CheckTypes_FWD__Match() {
		return getXComputerToComputer().getEOperations().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getXComputerToComputer__IsAppropriate_BWD__Match_Container_Computer() {
		return getXComputerToComputer().getEOperations().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getXComputerToComputer__Perform_BWD__IsApplicableMatch() {
		return getXComputerToComputer().getEOperations().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getXComputerToComputer__IsApplicable_BWD__Match() {
		return getXComputerToComputer().getEOperations().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getXComputerToComputer__RegisterObjectsToMatch_BWD__Match_Container_Computer() {
		return getXComputerToComputer().getEOperations().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getXComputerToComputer__IsAppropriate_solveCsp_BWD__Match_Container_Computer() {
		return getXComputerToComputer().getEOperations().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getXComputerToComputer__IsAppropriate_checkCsp_BWD__CSP() {
		return getXComputerToComputer().getEOperations().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getXComputerToComputer__IsApplicable_solveCsp_BWD__IsApplicableMatch_Container_XContainerToContainer_XContainer_Computer() {
		return getXComputerToComputer().getEOperations().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getXComputerToComputer__IsApplicable_checkCsp_BWD__CSP() {
		return getXComputerToComputer().getEOperations().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getXComputerToComputer__RegisterObjects_BWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject() {
		return getXComputerToComputer().getEOperations().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getXComputerToComputer__CheckTypes_BWD__Match() {
		return getXComputerToComputer().getEOperations().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getXComputerToComputer__IsAppropriate_BWD_EMoflonEdge_10__EMoflonEdge() {
		return getXComputerToComputer().getEOperations().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getXComputerToComputer__IsAppropriate_FWD_EMoflonEdge_6__EMoflonEdge() {
		return getXComputerToComputer().getEOperations().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getXComputerToComputer__CheckAttributes_FWD__TripleMatch() {
		return getXComputerToComputer().getEOperations().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getXComputerToComputer__CheckAttributes_BWD__TripleMatch() {
		return getXComputerToComputer().getEOperations().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getXComputerToComputer__IsApplicable_CC__Match_Match() {
		return getXComputerToComputer().getEOperations().get(24);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getXComputerToComputer__IsApplicable_solveCsp_CC__Container_XComputer_XContainer_Connections_Computer_Match_Match() {
		return getXComputerToComputer().getEOperations().get(25);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getXComputerToComputer__IsApplicable_checkCsp_CC__CSP() {
		return getXComputerToComputer().getEOperations().get(26);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getXComputerToComputer__CheckDEC_FWD__XComputer_XContainer_Connections() {
		return getXComputerToComputer().getEOperations().get(27);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getXComputerToComputer__CheckDEC_BWD__Container_Computer() {
		return getXComputerToComputer().getEOperations().get(28);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getXComputerToComputer__GenerateModel__RuleEntryContainer_XContainerToContainer() {
		return getXComputerToComputer().getEOperations().get(29);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getXComputerToComputer__GenerateModel_solveCsp_BWD__IsApplicableMatch_Container_XContainerToContainer_XContainer_ModelgeneratorRuleResult() {
		return getXComputerToComputer().getEOperations().get(30);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getXComputerToComputer__GenerateModel_checkCsp_BWD__CSP() {
		return getXComputerToComputer().getEOperations().get(31);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getXSimplexGlassFiberCableRule() {
		if (xSimplexGlassFiberCableRuleEClass == null) {
			xSimplexGlassFiberCableRuleEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(RulesPackage.eNS_URI)
					.getEClassifiers().get(3);
		}
		return xSimplexGlassFiberCableRuleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getXSimplexGlassFiberCableRule__IsAppropriate_FWD__Match_CableAttributes_XDevice_XGlassFiberCable_XContainer() {
		return getXSimplexGlassFiberCableRule().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getXSimplexGlassFiberCableRule__Perform_FWD__IsApplicableMatch() {
		return getXSimplexGlassFiberCableRule().getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getXSimplexGlassFiberCableRule__IsApplicable_FWD__Match() {
		return getXSimplexGlassFiberCableRule().getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getXSimplexGlassFiberCableRule__RegisterObjectsToMatch_FWD__Match_CableAttributes_XDevice_XGlassFiberCable_XContainer() {
		return getXSimplexGlassFiberCableRule().getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getXSimplexGlassFiberCableRule__IsAppropriate_solveCsp_FWD__Match_CableAttributes_XDevice_XGlassFiberCable_XContainer() {
		return getXSimplexGlassFiberCableRule().getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getXSimplexGlassFiberCableRule__IsAppropriate_checkCsp_FWD__CSP() {
		return getXSimplexGlassFiberCableRule().getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getXSimplexGlassFiberCableRule__IsApplicable_solveCsp_FWD__IsApplicableMatch_Container_CableAttributes_XDevice_XGlassFiberCable_XContainer_Device_XDeviceToDevice() {
		return getXSimplexGlassFiberCableRule().getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getXSimplexGlassFiberCableRule__IsApplicable_checkCsp_FWD__CSP() {
		return getXSimplexGlassFiberCableRule().getEOperations().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getXSimplexGlassFiberCableRule__RegisterObjects_FWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject() {
		return getXSimplexGlassFiberCableRule().getEOperations().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getXSimplexGlassFiberCableRule__CheckTypes_FWD__Match() {
		return getXSimplexGlassFiberCableRule().getEOperations().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getXSimplexGlassFiberCableRule__IsAppropriate_BWD__Match_Container_GlassFiberCable_Device() {
		return getXSimplexGlassFiberCableRule().getEOperations().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getXSimplexGlassFiberCableRule__Perform_BWD__IsApplicableMatch() {
		return getXSimplexGlassFiberCableRule().getEOperations().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getXSimplexGlassFiberCableRule__IsApplicable_BWD__Match() {
		return getXSimplexGlassFiberCableRule().getEOperations().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getXSimplexGlassFiberCableRule__RegisterObjectsToMatch_BWD__Match_Container_GlassFiberCable_Device() {
		return getXSimplexGlassFiberCableRule().getEOperations().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getXSimplexGlassFiberCableRule__IsAppropriate_solveCsp_BWD__Match_Container_GlassFiberCable_Device() {
		return getXSimplexGlassFiberCableRule().getEOperations().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getXSimplexGlassFiberCableRule__IsAppropriate_checkCsp_BWD__CSP() {
		return getXSimplexGlassFiberCableRule().getEOperations().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getXSimplexGlassFiberCableRule__IsApplicable_solveCsp_BWD__IsApplicableMatch_Container_XDevice_XContainer_GlassFiberCable_Device_XDeviceToDevice() {
		return getXSimplexGlassFiberCableRule().getEOperations().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getXSimplexGlassFiberCableRule__IsApplicable_checkCsp_BWD__CSP() {
		return getXSimplexGlassFiberCableRule().getEOperations().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getXSimplexGlassFiberCableRule__RegisterObjects_BWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject() {
		return getXSimplexGlassFiberCableRule().getEOperations().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getXSimplexGlassFiberCableRule__CheckTypes_BWD__Match() {
		return getXSimplexGlassFiberCableRule().getEOperations().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getXSimplexGlassFiberCableRule__IsAppropriate_BWD_EMoflonEdge_11__EMoflonEdge() {
		return getXSimplexGlassFiberCableRule().getEOperations().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getXSimplexGlassFiberCableRule__IsAppropriate_FWD_EMoflonEdge_7__EMoflonEdge() {
		return getXSimplexGlassFiberCableRule().getEOperations().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getXSimplexGlassFiberCableRule__CheckAttributes_FWD__TripleMatch() {
		return getXSimplexGlassFiberCableRule().getEOperations().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getXSimplexGlassFiberCableRule__CheckAttributes_BWD__TripleMatch() {
		return getXSimplexGlassFiberCableRule().getEOperations().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getXSimplexGlassFiberCableRule__IsApplicable_CC__Match_Match() {
		return getXSimplexGlassFiberCableRule().getEOperations().get(24);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getXSimplexGlassFiberCableRule__IsApplicable_solveCsp_CC__Container_CableAttributes_XDevice_XGlassFiberCable_XContainer_GlassFiberCable_Device_Match_Match() {
		return getXSimplexGlassFiberCableRule().getEOperations().get(25);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getXSimplexGlassFiberCableRule__IsApplicable_checkCsp_CC__CSP() {
		return getXSimplexGlassFiberCableRule().getEOperations().get(26);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getXSimplexGlassFiberCableRule__CheckDEC_FWD__CableAttributes_XDevice_XGlassFiberCable_XContainer() {
		return getXSimplexGlassFiberCableRule().getEOperations().get(27);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getXSimplexGlassFiberCableRule__CheckDEC_BWD__Container_GlassFiberCable_Device() {
		return getXSimplexGlassFiberCableRule().getEOperations().get(28);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getXSimplexGlassFiberCableRule__GenerateModel__RuleEntryContainer_XDeviceToDevice() {
		return getXSimplexGlassFiberCableRule().getEOperations().get(29);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getXSimplexGlassFiberCableRule__GenerateModel_solveCsp_BWD__IsApplicableMatch_Container_XDevice_XContainer_Device_XDeviceToDevice_ModelgeneratorRuleResult() {
		return getXSimplexGlassFiberCableRule().getEOperations().get(30);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getXSimplexGlassFiberCableRule__GenerateModel_checkCsp_BWD__CSP() {
		return getXSimplexGlassFiberCableRule().getEOperations().get(31);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getXSimplexConnectionToConnectionRule() {
		if (xSimplexConnectionToConnectionRuleEClass == null) {
			xSimplexConnectionToConnectionRuleEClass = (EClass) EPackage.Registry.INSTANCE
					.getEPackage(RulesPackage.eNS_URI).getEClassifiers().get(4);
		}
		return xSimplexConnectionToConnectionRuleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getXSimplexConnectionToConnectionRule__IsAppropriate_FWD__Match_Connections_Connections_XContainer_XCable_CableAttributes_XDevice_XDevice() {
		return getXSimplexConnectionToConnectionRule().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getXSimplexConnectionToConnectionRule__Perform_FWD__IsApplicableMatch() {
		return getXSimplexConnectionToConnectionRule().getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getXSimplexConnectionToConnectionRule__IsApplicable_FWD__Match() {
		return getXSimplexConnectionToConnectionRule().getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getXSimplexConnectionToConnectionRule__RegisterObjectsToMatch_FWD__Match_Connections_Connections_XContainer_XCable_CableAttributes_XDevice_XDevice() {
		return getXSimplexConnectionToConnectionRule().getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getXSimplexConnectionToConnectionRule__IsAppropriate_solveCsp_FWD__Match_Connections_Connections_XContainer_XCable_CableAttributes_XDevice_XDevice() {
		return getXSimplexConnectionToConnectionRule().getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getXSimplexConnectionToConnectionRule__IsAppropriate_checkCsp_FWD__CSP() {
		return getXSimplexConnectionToConnectionRule().getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getXSimplexConnectionToConnectionRule__IsApplicable_solveCsp_FWD__IsApplicableMatch_Connections_Connections_Device_XDeviceToDevice_Cable_XCableToCable_XContainer_XCable_Device_CableAttributes_Container_XDeviceToDevice_XDevice_XDevice() {
		return getXSimplexConnectionToConnectionRule().getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getXSimplexConnectionToConnectionRule__IsApplicable_checkCsp_FWD__CSP() {
		return getXSimplexConnectionToConnectionRule().getEOperations().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getXSimplexConnectionToConnectionRule__RegisterObjects_FWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject() {
		return getXSimplexConnectionToConnectionRule().getEOperations().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getXSimplexConnectionToConnectionRule__CheckTypes_FWD__Match() {
		return getXSimplexConnectionToConnectionRule().getEOperations().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getXSimplexConnectionToConnectionRule__IsAppropriate_BWD__Match_Device_Cable_Device_Container() {
		return getXSimplexConnectionToConnectionRule().getEOperations().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getXSimplexConnectionToConnectionRule__Perform_BWD__IsApplicableMatch() {
		return getXSimplexConnectionToConnectionRule().getEOperations().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getXSimplexConnectionToConnectionRule__IsApplicable_BWD__Match() {
		return getXSimplexConnectionToConnectionRule().getEOperations().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getXSimplexConnectionToConnectionRule__RegisterObjectsToMatch_BWD__Match_Device_Cable_Device_Container() {
		return getXSimplexConnectionToConnectionRule().getEOperations().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getXSimplexConnectionToConnectionRule__IsAppropriate_solveCsp_BWD__Match_Device_Cable_Device_Container() {
		return getXSimplexConnectionToConnectionRule().getEOperations().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getXSimplexConnectionToConnectionRule__IsAppropriate_checkCsp_BWD__CSP() {
		return getXSimplexConnectionToConnectionRule().getEOperations().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getXSimplexConnectionToConnectionRule__IsApplicable_solveCsp_BWD__IsApplicableMatch_Connections_Connections_Device_XDeviceToDevice_Cable_XCableToCable_XContainer_XCable_Device_CableAttributes_Container_XDeviceToDevice_XDevice_XDevice() {
		return getXSimplexConnectionToConnectionRule().getEOperations().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getXSimplexConnectionToConnectionRule__IsApplicable_checkCsp_BWD__CSP() {
		return getXSimplexConnectionToConnectionRule().getEOperations().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getXSimplexConnectionToConnectionRule__RegisterObjects_BWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject() {
		return getXSimplexConnectionToConnectionRule().getEOperations().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getXSimplexConnectionToConnectionRule__CheckTypes_BWD__Match() {
		return getXSimplexConnectionToConnectionRule().getEOperations().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getXSimplexConnectionToConnectionRule__IsAppropriate_BWD_EMoflonEdge_12__EMoflonEdge() {
		return getXSimplexConnectionToConnectionRule().getEOperations().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getXSimplexConnectionToConnectionRule__IsAppropriate_FWD_EMoflonEdge_8__EMoflonEdge() {
		return getXSimplexConnectionToConnectionRule().getEOperations().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getXSimplexConnectionToConnectionRule__CheckAttributes_FWD__TripleMatch() {
		return getXSimplexConnectionToConnectionRule().getEOperations().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getXSimplexConnectionToConnectionRule__CheckAttributes_BWD__TripleMatch() {
		return getXSimplexConnectionToConnectionRule().getEOperations().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getXSimplexConnectionToConnectionRule__IsApplicable_CC__Match_Match() {
		return getXSimplexConnectionToConnectionRule().getEOperations().get(24);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getXSimplexConnectionToConnectionRule__IsApplicable_solveCsp_CC__Connections_Connections_Device_Cable_XContainer_XCable_Device_CableAttributes_Container_XDevice_XDevice_Match_Match() {
		return getXSimplexConnectionToConnectionRule().getEOperations().get(25);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getXSimplexConnectionToConnectionRule__IsApplicable_checkCsp_CC__CSP() {
		return getXSimplexConnectionToConnectionRule().getEOperations().get(26);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getXSimplexConnectionToConnectionRule__CheckDEC_FWD__Connections_Connections_XContainer_XCable_CableAttributes_XDevice_XDevice() {
		return getXSimplexConnectionToConnectionRule().getEOperations().get(27);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getXSimplexConnectionToConnectionRule__CheckDEC_BWD__Device_Cable_Device_Container() {
		return getXSimplexConnectionToConnectionRule().getEOperations().get(28);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getXSimplexConnectionToConnectionRule__GenerateModel__RuleEntryContainer_XDeviceToDevice() {
		return getXSimplexConnectionToConnectionRule().getEOperations().get(29);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getXSimplexConnectionToConnectionRule__GenerateModel_solveCsp_BWD__IsApplicableMatch_Connections_Connections_Device_XDeviceToDevice_Cable_XCableToCable_XContainer_XCable_Device_CableAttributes_Container_XDeviceToDevice_XDevice_XDevice_ModelgeneratorRuleResult() {
		return getXSimplexConnectionToConnectionRule().getEOperations().get(30);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getXSimplexConnectionToConnectionRule__GenerateModel_checkCsp_BWD__CSP() {
		return getXSimplexConnectionToConnectionRule().getEOperations().get(31);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getXSimplexCopperCableRule() {
		if (xSimplexCopperCableRuleEClass == null) {
			xSimplexCopperCableRuleEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(RulesPackage.eNS_URI)
					.getEClassifiers().get(5);
		}
		return xSimplexCopperCableRuleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getXSimplexCopperCableRule__IsAppropriate_FWD__Match_CableAttributes_XDevice_XCopperCable_XContainer() {
		return getXSimplexCopperCableRule().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getXSimplexCopperCableRule__Perform_FWD__IsApplicableMatch() {
		return getXSimplexCopperCableRule().getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getXSimplexCopperCableRule__IsApplicable_FWD__Match() {
		return getXSimplexCopperCableRule().getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getXSimplexCopperCableRule__RegisterObjectsToMatch_FWD__Match_CableAttributes_XDevice_XCopperCable_XContainer() {
		return getXSimplexCopperCableRule().getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getXSimplexCopperCableRule__IsAppropriate_solveCsp_FWD__Match_CableAttributes_XDevice_XCopperCable_XContainer() {
		return getXSimplexCopperCableRule().getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getXSimplexCopperCableRule__IsAppropriate_checkCsp_FWD__CSP() {
		return getXSimplexCopperCableRule().getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getXSimplexCopperCableRule__IsApplicable_solveCsp_FWD__IsApplicableMatch_Container_CableAttributes_XDevice_XCopperCable_XContainer_Device_XDeviceToDevice() {
		return getXSimplexCopperCableRule().getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getXSimplexCopperCableRule__IsApplicable_checkCsp_FWD__CSP() {
		return getXSimplexCopperCableRule().getEOperations().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getXSimplexCopperCableRule__RegisterObjects_FWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject() {
		return getXSimplexCopperCableRule().getEOperations().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getXSimplexCopperCableRule__CheckTypes_FWD__Match() {
		return getXSimplexCopperCableRule().getEOperations().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getXSimplexCopperCableRule__IsAppropriate_BWD__Match_Container_CopperCable_Device() {
		return getXSimplexCopperCableRule().getEOperations().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getXSimplexCopperCableRule__Perform_BWD__IsApplicableMatch() {
		return getXSimplexCopperCableRule().getEOperations().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getXSimplexCopperCableRule__IsApplicable_BWD__Match() {
		return getXSimplexCopperCableRule().getEOperations().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getXSimplexCopperCableRule__RegisterObjectsToMatch_BWD__Match_Container_CopperCable_Device() {
		return getXSimplexCopperCableRule().getEOperations().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getXSimplexCopperCableRule__IsAppropriate_solveCsp_BWD__Match_Container_CopperCable_Device() {
		return getXSimplexCopperCableRule().getEOperations().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getXSimplexCopperCableRule__IsAppropriate_checkCsp_BWD__CSP() {
		return getXSimplexCopperCableRule().getEOperations().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getXSimplexCopperCableRule__IsApplicable_solveCsp_BWD__IsApplicableMatch_Container_XDevice_XContainer_CopperCable_Device_XDeviceToDevice() {
		return getXSimplexCopperCableRule().getEOperations().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getXSimplexCopperCableRule__IsApplicable_checkCsp_BWD__CSP() {
		return getXSimplexCopperCableRule().getEOperations().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getXSimplexCopperCableRule__RegisterObjects_BWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject() {
		return getXSimplexCopperCableRule().getEOperations().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getXSimplexCopperCableRule__CheckTypes_BWD__Match() {
		return getXSimplexCopperCableRule().getEOperations().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getXSimplexCopperCableRule__IsAppropriate_BWD_EMoflonEdge_13__EMoflonEdge() {
		return getXSimplexCopperCableRule().getEOperations().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getXSimplexCopperCableRule__IsAppropriate_FWD_EMoflonEdge_9__EMoflonEdge() {
		return getXSimplexCopperCableRule().getEOperations().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getXSimplexCopperCableRule__CheckAttributes_FWD__TripleMatch() {
		return getXSimplexCopperCableRule().getEOperations().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getXSimplexCopperCableRule__CheckAttributes_BWD__TripleMatch() {
		return getXSimplexCopperCableRule().getEOperations().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getXSimplexCopperCableRule__IsApplicable_CC__Match_Match() {
		return getXSimplexCopperCableRule().getEOperations().get(24);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getXSimplexCopperCableRule__IsApplicable_solveCsp_CC__Container_CableAttributes_XDevice_XCopperCable_XContainer_CopperCable_Device_Match_Match() {
		return getXSimplexCopperCableRule().getEOperations().get(25);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getXSimplexCopperCableRule__IsApplicable_checkCsp_CC__CSP() {
		return getXSimplexCopperCableRule().getEOperations().get(26);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getXSimplexCopperCableRule__CheckDEC_FWD__CableAttributes_XDevice_XCopperCable_XContainer() {
		return getXSimplexCopperCableRule().getEOperations().get(27);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getXSimplexCopperCableRule__CheckDEC_BWD__Container_CopperCable_Device() {
		return getXSimplexCopperCableRule().getEOperations().get(28);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getXSimplexCopperCableRule__GenerateModel__RuleEntryContainer_XDeviceToDevice() {
		return getXSimplexCopperCableRule().getEOperations().get(29);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getXSimplexCopperCableRule__GenerateModel_solveCsp_BWD__IsApplicableMatch_Container_XDevice_XContainer_Device_XDeviceToDevice_ModelgeneratorRuleResult() {
		return getXSimplexCopperCableRule().getEOperations().get(30);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getXSimplexCopperCableRule__GenerateModel_checkCsp_BWD__CSP() {
		return getXSimplexCopperCableRule().getEOperations().get(31);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getXDuplexCopperCableRule() {
		if (xDuplexCopperCableRuleEClass == null) {
			xDuplexCopperCableRuleEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(RulesPackage.eNS_URI)
					.getEClassifiers().get(6);
		}
		return xDuplexCopperCableRuleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getXDuplexCopperCableRule__IsAppropriate_FWD__Match_CableAttributes_XDevice_XCopperCable_XContainer() {
		return getXDuplexCopperCableRule().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getXDuplexCopperCableRule__Perform_FWD__IsApplicableMatch() {
		return getXDuplexCopperCableRule().getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getXDuplexCopperCableRule__IsApplicable_FWD__Match() {
		return getXDuplexCopperCableRule().getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getXDuplexCopperCableRule__RegisterObjectsToMatch_FWD__Match_CableAttributes_XDevice_XCopperCable_XContainer() {
		return getXDuplexCopperCableRule().getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getXDuplexCopperCableRule__IsAppropriate_solveCsp_FWD__Match_CableAttributes_XDevice_XCopperCable_XContainer() {
		return getXDuplexCopperCableRule().getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getXDuplexCopperCableRule__IsAppropriate_checkCsp_FWD__CSP() {
		return getXDuplexCopperCableRule().getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getXDuplexCopperCableRule__IsApplicable_solveCsp_FWD__IsApplicableMatch_Container_CableAttributes_XDevice_XCopperCable_XContainer_Device_XDeviceToDevice() {
		return getXDuplexCopperCableRule().getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getXDuplexCopperCableRule__IsApplicable_checkCsp_FWD__CSP() {
		return getXDuplexCopperCableRule().getEOperations().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getXDuplexCopperCableRule__RegisterObjects_FWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject() {
		return getXDuplexCopperCableRule().getEOperations().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getXDuplexCopperCableRule__CheckTypes_FWD__Match() {
		return getXDuplexCopperCableRule().getEOperations().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getXDuplexCopperCableRule__IsAppropriate_BWD__Match_CopperCable_Container_GlassFiberCable_Device() {
		return getXDuplexCopperCableRule().getEOperations().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getXDuplexCopperCableRule__Perform_BWD__IsApplicableMatch() {
		return getXDuplexCopperCableRule().getEOperations().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getXDuplexCopperCableRule__IsApplicable_BWD__Match() {
		return getXDuplexCopperCableRule().getEOperations().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getXDuplexCopperCableRule__RegisterObjectsToMatch_BWD__Match_CopperCable_Container_GlassFiberCable_Device() {
		return getXDuplexCopperCableRule().getEOperations().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getXDuplexCopperCableRule__IsAppropriate_solveCsp_BWD__Match_CopperCable_Container_GlassFiberCable_Device() {
		return getXDuplexCopperCableRule().getEOperations().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getXDuplexCopperCableRule__IsAppropriate_checkCsp_BWD__CSP() {
		return getXDuplexCopperCableRule().getEOperations().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getXDuplexCopperCableRule__IsApplicable_solveCsp_BWD__IsApplicableMatch_CopperCable_Container_GlassFiberCable_XDevice_XContainer_Device_XDeviceToDevice() {
		return getXDuplexCopperCableRule().getEOperations().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getXDuplexCopperCableRule__IsApplicable_checkCsp_BWD__CSP() {
		return getXDuplexCopperCableRule().getEOperations().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getXDuplexCopperCableRule__RegisterObjects_BWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject() {
		return getXDuplexCopperCableRule().getEOperations().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getXDuplexCopperCableRule__CheckTypes_BWD__Match() {
		return getXDuplexCopperCableRule().getEOperations().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getXDuplexCopperCableRule__IsAppropriate_BWD_EMoflonEdge_14__EMoflonEdge() {
		return getXDuplexCopperCableRule().getEOperations().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getXDuplexCopperCableRule__IsAppropriate_FWD_EMoflonEdge_10__EMoflonEdge() {
		return getXDuplexCopperCableRule().getEOperations().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getXDuplexCopperCableRule__CheckAttributes_FWD__TripleMatch() {
		return getXDuplexCopperCableRule().getEOperations().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getXDuplexCopperCableRule__CheckAttributes_BWD__TripleMatch() {
		return getXDuplexCopperCableRule().getEOperations().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getXDuplexCopperCableRule__IsApplicable_CC__Match_Match() {
		return getXDuplexCopperCableRule().getEOperations().get(24);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getXDuplexCopperCableRule__IsApplicable_solveCsp_CC__CopperCable_Container_GlassFiberCable_CableAttributes_XDevice_XCopperCable_XContainer_Device_Match_Match() {
		return getXDuplexCopperCableRule().getEOperations().get(25);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getXDuplexCopperCableRule__IsApplicable_checkCsp_CC__CSP() {
		return getXDuplexCopperCableRule().getEOperations().get(26);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getXDuplexCopperCableRule__CheckDEC_FWD__CableAttributes_XDevice_XCopperCable_XContainer() {
		return getXDuplexCopperCableRule().getEOperations().get(27);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getXDuplexCopperCableRule__CheckDEC_BWD__CopperCable_Container_GlassFiberCable_Device() {
		return getXDuplexCopperCableRule().getEOperations().get(28);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getXDuplexCopperCableRule__GenerateModel__RuleEntryContainer_XDeviceToDevice() {
		return getXDuplexCopperCableRule().getEOperations().get(29);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getXDuplexCopperCableRule__GenerateModel_solveCsp_BWD__IsApplicableMatch_Container_XDevice_XContainer_Device_XDeviceToDevice_ModelgeneratorRuleResult() {
		return getXDuplexCopperCableRule().getEOperations().get(30);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getXDuplexCopperCableRule__GenerateModel_checkCsp_BWD__CSP() {
		return getXDuplexCopperCableRule().getEOperations().get(31);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getXServerToServer() {
		if (xServerToServerEClass == null) {
			xServerToServerEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(RulesPackage.eNS_URI)
					.getEClassifiers().get(7);
		}
		return xServerToServerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getXServerToServer__IsAppropriate_FWD__Match_XServer_XContainer_Connections() {
		return getXServerToServer().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getXServerToServer__Perform_FWD__IsApplicableMatch() {
		return getXServerToServer().getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getXServerToServer__IsApplicable_FWD__Match() {
		return getXServerToServer().getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getXServerToServer__RegisterObjectsToMatch_FWD__Match_XServer_XContainer_Connections() {
		return getXServerToServer().getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getXServerToServer__IsAppropriate_solveCsp_FWD__Match_XServer_XContainer_Connections() {
		return getXServerToServer().getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getXServerToServer__IsAppropriate_checkCsp_FWD__CSP() {
		return getXServerToServer().getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getXServerToServer__IsApplicable_solveCsp_FWD__IsApplicableMatch_Container_XContainerToContainer_XServer_XContainer_Connections() {
		return getXServerToServer().getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getXServerToServer__IsApplicable_checkCsp_FWD__CSP() {
		return getXServerToServer().getEOperations().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getXServerToServer__RegisterObjects_FWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject() {
		return getXServerToServer().getEOperations().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getXServerToServer__CheckTypes_FWD__Match() {
		return getXServerToServer().getEOperations().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getXServerToServer__IsAppropriate_BWD__Match_Container_Server() {
		return getXServerToServer().getEOperations().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getXServerToServer__Perform_BWD__IsApplicableMatch() {
		return getXServerToServer().getEOperations().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getXServerToServer__IsApplicable_BWD__Match() {
		return getXServerToServer().getEOperations().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getXServerToServer__RegisterObjectsToMatch_BWD__Match_Container_Server() {
		return getXServerToServer().getEOperations().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getXServerToServer__IsAppropriate_solveCsp_BWD__Match_Container_Server() {
		return getXServerToServer().getEOperations().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getXServerToServer__IsAppropriate_checkCsp_BWD__CSP() {
		return getXServerToServer().getEOperations().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getXServerToServer__IsApplicable_solveCsp_BWD__IsApplicableMatch_Container_XContainerToContainer_XContainer_Server() {
		return getXServerToServer().getEOperations().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getXServerToServer__IsApplicable_checkCsp_BWD__CSP() {
		return getXServerToServer().getEOperations().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getXServerToServer__RegisterObjects_BWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject() {
		return getXServerToServer().getEOperations().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getXServerToServer__CheckTypes_BWD__Match() {
		return getXServerToServer().getEOperations().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getXServerToServer__IsAppropriate_BWD_EMoflonEdge_15__EMoflonEdge() {
		return getXServerToServer().getEOperations().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getXServerToServer__IsAppropriate_FWD_EMoflonEdge_11__EMoflonEdge() {
		return getXServerToServer().getEOperations().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getXServerToServer__CheckAttributes_FWD__TripleMatch() {
		return getXServerToServer().getEOperations().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getXServerToServer__CheckAttributes_BWD__TripleMatch() {
		return getXServerToServer().getEOperations().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getXServerToServer__IsApplicable_CC__Match_Match() {
		return getXServerToServer().getEOperations().get(24);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getXServerToServer__IsApplicable_solveCsp_CC__Container_XServer_XContainer_Connections_Server_Match_Match() {
		return getXServerToServer().getEOperations().get(25);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getXServerToServer__IsApplicable_checkCsp_CC__CSP() {
		return getXServerToServer().getEOperations().get(26);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getXServerToServer__CheckDEC_FWD__XServer_XContainer_Connections() {
		return getXServerToServer().getEOperations().get(27);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getXServerToServer__CheckDEC_BWD__Container_Server() {
		return getXServerToServer().getEOperations().get(28);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getXServerToServer__GenerateModel__RuleEntryContainer_XContainerToContainer() {
		return getXServerToServer().getEOperations().get(29);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getXServerToServer__GenerateModel_solveCsp_BWD__IsApplicableMatch_Container_XContainerToContainer_XContainer_ModelgeneratorRuleResult() {
		return getXServerToServer().getEOperations().get(30);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getXServerToServer__GenerateModel_checkCsp_BWD__CSP() {
		return getXServerToServer().getEOperations().get(31);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getXDuplexConnectionToConnectionRule() {
		if (xDuplexConnectionToConnectionRuleEClass == null) {
			xDuplexConnectionToConnectionRuleEClass = (EClass) EPackage.Registry.INSTANCE
					.getEPackage(RulesPackage.eNS_URI).getEClassifiers().get(8);
		}
		return xDuplexConnectionToConnectionRuleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getXDuplexConnectionToConnectionRule__IsAppropriate_FWD__Match_Connections_XCable_XDevice_XContainer_Connections_XDevice_CableAttributes() {
		return getXDuplexConnectionToConnectionRule().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getXDuplexConnectionToConnectionRule__Perform_FWD__IsApplicableMatch() {
		return getXDuplexConnectionToConnectionRule().getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getXDuplexConnectionToConnectionRule__IsApplicable_FWD__Match() {
		return getXDuplexConnectionToConnectionRule().getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getXDuplexConnectionToConnectionRule__RegisterObjectsToMatch_FWD__Match_Connections_XCable_XDevice_XContainer_Connections_XDevice_CableAttributes() {
		return getXDuplexConnectionToConnectionRule().getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getXDuplexConnectionToConnectionRule__IsAppropriate_solveCsp_FWD__Match_Connections_XCable_XDevice_XContainer_Connections_XDevice_CableAttributes() {
		return getXDuplexConnectionToConnectionRule().getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getXDuplexConnectionToConnectionRule__IsAppropriate_checkCsp_FWD__CSP() {
		return getXDuplexConnectionToConnectionRule().getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getXDuplexConnectionToConnectionRule__IsApplicable_solveCsp_FWD__IsApplicableMatch_Container_Connections_XDeviceToDevice_XCable_XDevice_Cable_XContainer_Connections_XDeviceToDevice_XCableToCable_XDevice_Device_CableAttributes_Cable_XCableToCable_Device() {
		return getXDuplexConnectionToConnectionRule().getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getXDuplexConnectionToConnectionRule__IsApplicable_checkCsp_FWD__CSP() {
		return getXDuplexConnectionToConnectionRule().getEOperations().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getXDuplexConnectionToConnectionRule__RegisterObjects_FWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject() {
		return getXDuplexConnectionToConnectionRule().getEOperations().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getXDuplexConnectionToConnectionRule__CheckTypes_FWD__Match() {
		return getXDuplexConnectionToConnectionRule().getEOperations().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getXDuplexConnectionToConnectionRule__IsAppropriate_BWD__Match_Container_Cable_Device_Cable_Device() {
		return getXDuplexConnectionToConnectionRule().getEOperations().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getXDuplexConnectionToConnectionRule__Perform_BWD__IsApplicableMatch() {
		return getXDuplexConnectionToConnectionRule().getEOperations().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getXDuplexConnectionToConnectionRule__IsApplicable_BWD__Match() {
		return getXDuplexConnectionToConnectionRule().getEOperations().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getXDuplexConnectionToConnectionRule__RegisterObjectsToMatch_BWD__Match_Container_Cable_Device_Cable_Device() {
		return getXDuplexConnectionToConnectionRule().getEOperations().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getXDuplexConnectionToConnectionRule__IsAppropriate_solveCsp_BWD__Match_Container_Cable_Device_Cable_Device() {
		return getXDuplexConnectionToConnectionRule().getEOperations().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getXDuplexConnectionToConnectionRule__IsAppropriate_checkCsp_BWD__CSP() {
		return getXDuplexConnectionToConnectionRule().getEOperations().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getXDuplexConnectionToConnectionRule__IsApplicable_solveCsp_BWD__IsApplicableMatch_Container_Connections_XDeviceToDevice_XCable_XDevice_Cable_XContainer_Connections_XDeviceToDevice_XCableToCable_XDevice_Device_CableAttributes_Cable_XCableToCable_Device() {
		return getXDuplexConnectionToConnectionRule().getEOperations().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getXDuplexConnectionToConnectionRule__IsApplicable_checkCsp_BWD__CSP() {
		return getXDuplexConnectionToConnectionRule().getEOperations().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getXDuplexConnectionToConnectionRule__RegisterObjects_BWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject() {
		return getXDuplexConnectionToConnectionRule().getEOperations().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getXDuplexConnectionToConnectionRule__CheckTypes_BWD__Match() {
		return getXDuplexConnectionToConnectionRule().getEOperations().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getXDuplexConnectionToConnectionRule__IsAppropriate_BWD_EMoflonEdge_16__EMoflonEdge() {
		return getXDuplexConnectionToConnectionRule().getEOperations().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getXDuplexConnectionToConnectionRule__IsAppropriate_FWD_EMoflonEdge_12__EMoflonEdge() {
		return getXDuplexConnectionToConnectionRule().getEOperations().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getXDuplexConnectionToConnectionRule__CheckAttributes_FWD__TripleMatch() {
		return getXDuplexConnectionToConnectionRule().getEOperations().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getXDuplexConnectionToConnectionRule__CheckAttributes_BWD__TripleMatch() {
		return getXDuplexConnectionToConnectionRule().getEOperations().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getXDuplexConnectionToConnectionRule__IsApplicable_CC__Match_Match() {
		return getXDuplexConnectionToConnectionRule().getEOperations().get(24);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getXDuplexConnectionToConnectionRule__IsApplicable_solveCsp_CC__Container_Connections_XCable_XDevice_Cable_XContainer_Connections_XDevice_Device_CableAttributes_Cable_Device_Match_Match() {
		return getXDuplexConnectionToConnectionRule().getEOperations().get(25);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getXDuplexConnectionToConnectionRule__IsApplicable_checkCsp_CC__CSP() {
		return getXDuplexConnectionToConnectionRule().getEOperations().get(26);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getXDuplexConnectionToConnectionRule__CheckDEC_FWD__Connections_XCable_XDevice_XContainer_Connections_XDevice_CableAttributes() {
		return getXDuplexConnectionToConnectionRule().getEOperations().get(27);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getXDuplexConnectionToConnectionRule__CheckDEC_BWD__Container_Cable_Device_Cable_Device() {
		return getXDuplexConnectionToConnectionRule().getEOperations().get(28);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getXDuplexConnectionToConnectionRule__GenerateModel__RuleEntryContainer_XDeviceToDevice() {
		return getXDuplexConnectionToConnectionRule().getEOperations().get(29);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getXDuplexConnectionToConnectionRule__GenerateModel_solveCsp_BWD__IsApplicableMatch_Container_Connections_XDeviceToDevice_XCable_XDevice_Cable_XContainer_Connections_XDeviceToDevice_XCableToCable_XDevice_Device_CableAttributes_Cable_XCableToCable_Device_ModelgeneratorRuleResult() {
		return getXDuplexConnectionToConnectionRule().getEOperations().get(30);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getXDuplexConnectionToConnectionRule__GenerateModel_checkCsp_BWD__CSP() {
		return getXDuplexConnectionToConnectionRule().getEOperations().get(31);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getXRouterToRouterRule() {
		if (xRouterToRouterRuleEClass == null) {
			xRouterToRouterRuleEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(RulesPackage.eNS_URI)
					.getEClassifiers().get(9);
		}
		return xRouterToRouterRuleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getXRouterToRouterRule__IsAppropriate_FWD__Match_XRouter_XContainer_Connections() {
		return getXRouterToRouterRule().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getXRouterToRouterRule__Perform_FWD__IsApplicableMatch() {
		return getXRouterToRouterRule().getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getXRouterToRouterRule__IsApplicable_FWD__Match() {
		return getXRouterToRouterRule().getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getXRouterToRouterRule__RegisterObjectsToMatch_FWD__Match_XRouter_XContainer_Connections() {
		return getXRouterToRouterRule().getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getXRouterToRouterRule__IsAppropriate_solveCsp_FWD__Match_XRouter_XContainer_Connections() {
		return getXRouterToRouterRule().getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getXRouterToRouterRule__IsAppropriate_checkCsp_FWD__CSP() {
		return getXRouterToRouterRule().getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getXRouterToRouterRule__IsApplicable_solveCsp_FWD__IsApplicableMatch_Container_XContainerToContainer_XRouter_XContainer_Connections() {
		return getXRouterToRouterRule().getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getXRouterToRouterRule__IsApplicable_checkCsp_FWD__CSP() {
		return getXRouterToRouterRule().getEOperations().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getXRouterToRouterRule__RegisterObjects_FWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject() {
		return getXRouterToRouterRule().getEOperations().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getXRouterToRouterRule__CheckTypes_FWD__Match() {
		return getXRouterToRouterRule().getEOperations().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getXRouterToRouterRule__IsAppropriate_BWD__Match_Container_Router() {
		return getXRouterToRouterRule().getEOperations().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getXRouterToRouterRule__Perform_BWD__IsApplicableMatch() {
		return getXRouterToRouterRule().getEOperations().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getXRouterToRouterRule__IsApplicable_BWD__Match() {
		return getXRouterToRouterRule().getEOperations().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getXRouterToRouterRule__RegisterObjectsToMatch_BWD__Match_Container_Router() {
		return getXRouterToRouterRule().getEOperations().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getXRouterToRouterRule__IsAppropriate_solveCsp_BWD__Match_Container_Router() {
		return getXRouterToRouterRule().getEOperations().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getXRouterToRouterRule__IsAppropriate_checkCsp_BWD__CSP() {
		return getXRouterToRouterRule().getEOperations().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getXRouterToRouterRule__IsApplicable_solveCsp_BWD__IsApplicableMatch_Container_XContainerToContainer_XContainer_Router() {
		return getXRouterToRouterRule().getEOperations().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getXRouterToRouterRule__IsApplicable_checkCsp_BWD__CSP() {
		return getXRouterToRouterRule().getEOperations().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getXRouterToRouterRule__RegisterObjects_BWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject() {
		return getXRouterToRouterRule().getEOperations().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getXRouterToRouterRule__CheckTypes_BWD__Match() {
		return getXRouterToRouterRule().getEOperations().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getXRouterToRouterRule__IsAppropriate_BWD_EMoflonEdge_17__EMoflonEdge() {
		return getXRouterToRouterRule().getEOperations().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getXRouterToRouterRule__IsAppropriate_FWD_EMoflonEdge_13__EMoflonEdge() {
		return getXRouterToRouterRule().getEOperations().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getXRouterToRouterRule__CheckAttributes_FWD__TripleMatch() {
		return getXRouterToRouterRule().getEOperations().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getXRouterToRouterRule__CheckAttributes_BWD__TripleMatch() {
		return getXRouterToRouterRule().getEOperations().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getXRouterToRouterRule__IsApplicable_CC__Match_Match() {
		return getXRouterToRouterRule().getEOperations().get(24);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getXRouterToRouterRule__IsApplicable_solveCsp_CC__Container_XRouter_XContainer_Connections_Router_Match_Match() {
		return getXRouterToRouterRule().getEOperations().get(25);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getXRouterToRouterRule__IsApplicable_checkCsp_CC__CSP() {
		return getXRouterToRouterRule().getEOperations().get(26);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getXRouterToRouterRule__CheckDEC_FWD__XRouter_XContainer_Connections() {
		return getXRouterToRouterRule().getEOperations().get(27);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getXRouterToRouterRule__CheckDEC_BWD__Container_Router() {
		return getXRouterToRouterRule().getEOperations().get(28);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getXRouterToRouterRule__GenerateModel__RuleEntryContainer_XContainerToContainer() {
		return getXRouterToRouterRule().getEOperations().get(29);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getXRouterToRouterRule__GenerateModel_solveCsp_BWD__IsApplicableMatch_Container_XContainerToContainer_XContainer_ModelgeneratorRuleResult() {
		return getXRouterToRouterRule().getEOperations().get(30);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getXRouterToRouterRule__GenerateModel_checkCsp_BWD__CSP() {
		return getXRouterToRouterRule().getEOperations().get(31);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getXDuplexCableToCablesRule() {
		if (xDuplexCableToCablesRuleEClass == null) {
			xDuplexCableToCablesRuleEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(RulesPackage.eNS_URI)
					.getEClassifiers().get(10);
		}
		return xDuplexCableToCablesRuleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getXSimplexCableToCableRule() {
		if (xSimplexCableToCableRuleEClass == null) {
			xSimplexCableToCableRuleEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(RulesPackage.eNS_URI)
					.getEClassifiers().get(11);
		}
		return xSimplexCableToCableRuleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getXDeviceToDeviceRule() {
		if (xDeviceToDeviceRuleEClass == null) {
			xDeviceToDeviceRuleEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(RulesPackage.eNS_URI)
					.getEClassifiers().get(12);
		}
		return xDeviceToDeviceRuleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RulesFactory getRulesFactory() {
		return (RulesFactory) getEFactoryInstance();
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
			eClassifier.setInstanceClassName("ImplementationTransformator.Rules." + eClassifier.getName());
			setGeneratedClassName(eClassifier);
		}
	}

} //RulesPackageImpl
