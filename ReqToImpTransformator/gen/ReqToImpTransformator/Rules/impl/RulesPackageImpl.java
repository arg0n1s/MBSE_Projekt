/**
 */
package ReqToImpTransformator.Rules.impl;

import ReqToImpTransformator.ReqToImpTransformatorPackage;

import ReqToImpTransformator.Rules.RulesFactory;
import ReqToImpTransformator.Rules.RulesPackage;

import ReqToImpTransformator.impl.ReqToImpTransformatorPackageImpl;

import implementation.ImplementationPackage;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.moflon.tgg.language.LanguagePackage;

import requirements.RequirementsPackage;

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
	private EClass reqAgentToDeviceRuleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass implGlassIgnoreRuleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass virtualNodeToComputerRuleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass implOutgoingConnectionIgnoreRuleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass virtualNodeToServerRuleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass implCopperIgnoreRuleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass reqConsumerToComputerRuleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass virtualNodeToRouterRule2EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass reqProviderToServerRuleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass reqContainerToImplContainerRuleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass implCableIgnoreRuleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass virtualNodeToRouterRule1EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass implIncomingConnectionIgnoreRuleEClass = null;

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
	 * @see ReqToImpTransformator.Rules.RulesPackage#eNS_URI
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
		RequirementsPackage.eINSTANCE.eClass();
		ImplementationPackage.eINSTANCE.eClass();
		ImplementationPackage.eINSTANCE.eClass();
		RequirementsPackage.eINSTANCE.eClass();
		LanguagePackage.eINSTANCE.eClass();

		// Obtain or create and register interdependencies
		ReqToImpTransformatorPackageImpl theReqToImpTransformatorPackage = (ReqToImpTransformatorPackageImpl) (EPackage.Registry.INSTANCE
				.getEPackage(ReqToImpTransformatorPackage.eNS_URI) instanceof ReqToImpTransformatorPackageImpl
						? EPackage.Registry.INSTANCE.getEPackage(ReqToImpTransformatorPackage.eNS_URI)
						: ReqToImpTransformatorPackage.eINSTANCE);

		// Load packages
		theReqToImpTransformatorPackage.loadPackage();

		// Fix loaded packages
		theRulesPackage.fixPackageContents();
		theReqToImpTransformatorPackage.fixPackageContents();

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
	public EClass getReqAgentToDeviceRule() {
		if (reqAgentToDeviceRuleEClass == null) {
			reqAgentToDeviceRuleEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(RulesPackage.eNS_URI)
					.getEClassifiers().get(0);
		}
		return reqAgentToDeviceRuleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getImplGlassIgnoreRule() {
		if (implGlassIgnoreRuleEClass == null) {
			implGlassIgnoreRuleEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(RulesPackage.eNS_URI)
					.getEClassifiers().get(1);
		}
		return implGlassIgnoreRuleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getImplGlassIgnoreRule__IsAppropriate_FWD__Match_Container() {
		return getImplGlassIgnoreRule().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getImplGlassIgnoreRule__Perform_FWD__IsApplicableMatch() {
		return getImplGlassIgnoreRule().getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getImplGlassIgnoreRule__IsApplicable_FWD__Match() {
		return getImplGlassIgnoreRule().getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getImplGlassIgnoreRule__RegisterObjectsToMatch_FWD__Match_Container() {
		return getImplGlassIgnoreRule().getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getImplGlassIgnoreRule__IsAppropriate_solveCsp_FWD__Match_Container() {
		return getImplGlassIgnoreRule().getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getImplGlassIgnoreRule__IsAppropriate_checkCsp_FWD__CSP() {
		return getImplGlassIgnoreRule().getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getImplGlassIgnoreRule__CheckTypes_FWD__Match() {
		return getImplGlassIgnoreRule().getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getImplGlassIgnoreRule__IsAppropriate_BWD__Match_GlassFiberCable_Container() {
		return getImplGlassIgnoreRule().getEOperations().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getImplGlassIgnoreRule__Perform_BWD__IsApplicableMatch() {
		return getImplGlassIgnoreRule().getEOperations().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getImplGlassIgnoreRule__IsApplicable_BWD__Match() {
		return getImplGlassIgnoreRule().getEOperations().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getImplGlassIgnoreRule__RegisterObjectsToMatch_BWD__Match_GlassFiberCable_Container() {
		return getImplGlassIgnoreRule().getEOperations().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getImplGlassIgnoreRule__IsAppropriate_solveCsp_BWD__Match_GlassFiberCable_Container() {
		return getImplGlassIgnoreRule().getEOperations().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getImplGlassIgnoreRule__IsAppropriate_checkCsp_BWD__CSP() {
		return getImplGlassIgnoreRule().getEOperations().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getImplGlassIgnoreRule__IsApplicable_solveCsp_BWD__IsApplicableMatch_Container_GlassFiberCable_Container_ReqContainerToImplContainer() {
		return getImplGlassIgnoreRule().getEOperations().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getImplGlassIgnoreRule__IsApplicable_checkCsp_BWD__CSP() {
		return getImplGlassIgnoreRule().getEOperations().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getImplGlassIgnoreRule__RegisterObjects_BWD__PerformRuleResult_EObject_EObject_EObject_EObject() {
		return getImplGlassIgnoreRule().getEOperations().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getImplGlassIgnoreRule__CheckTypes_BWD__Match() {
		return getImplGlassIgnoreRule().getEOperations().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getImplGlassIgnoreRule__IsAppropriate_FWD_Container_0__Container() {
		return getImplGlassIgnoreRule().getEOperations().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getImplGlassIgnoreRule__IsAppropriate_BWD_EMoflonEdge_0__EMoflonEdge() {
		return getImplGlassIgnoreRule().getEOperations().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getImplGlassIgnoreRule__CheckAttributes_FWD__TripleMatch() {
		return getImplGlassIgnoreRule().getEOperations().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getImplGlassIgnoreRule__CheckAttributes_BWD__TripleMatch() {
		return getImplGlassIgnoreRule().getEOperations().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getImplGlassIgnoreRule__IsApplicable_CC__Match_Match() {
		return getImplGlassIgnoreRule().getEOperations().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getImplGlassIgnoreRule__IsApplicable_solveCsp_CC__Container_GlassFiberCable_Container_Match_Match() {
		return getImplGlassIgnoreRule().getEOperations().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getImplGlassIgnoreRule__IsApplicable_checkCsp_CC__CSP() {
		return getImplGlassIgnoreRule().getEOperations().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getImplGlassIgnoreRule__CheckDEC_FWD__Container() {
		return getImplGlassIgnoreRule().getEOperations().get(24);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getImplGlassIgnoreRule__CheckDEC_BWD__GlassFiberCable_Container() {
		return getImplGlassIgnoreRule().getEOperations().get(25);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getImplGlassIgnoreRule__GenerateModel__RuleEntryContainer_ReqContainerToImplContainer() {
		return getImplGlassIgnoreRule().getEOperations().get(26);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getImplGlassIgnoreRule__GenerateModel_solveCsp_BWD__IsApplicableMatch_Container_Container_ReqContainerToImplContainer_ModelgeneratorRuleResult() {
		return getImplGlassIgnoreRule().getEOperations().get(27);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getImplGlassIgnoreRule__GenerateModel_checkCsp_BWD__CSP() {
		return getImplGlassIgnoreRule().getEOperations().get(28);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVirtualNodeToComputerRule() {
		if (virtualNodeToComputerRuleEClass == null) {
			virtualNodeToComputerRuleEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(RulesPackage.eNS_URI)
					.getEClassifiers().get(2);
		}
		return virtualNodeToComputerRuleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getVirtualNodeToComputerRule__IsAppropriate_FWD__Match_NetworkSpan_Container() {
		return getVirtualNodeToComputerRule().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getVirtualNodeToComputerRule__Perform_FWD__IsApplicableMatch() {
		return getVirtualNodeToComputerRule().getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getVirtualNodeToComputerRule__IsApplicable_FWD__Match() {
		return getVirtualNodeToComputerRule().getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getVirtualNodeToComputerRule__RegisterObjectsToMatch_FWD__Match_NetworkSpan_Container() {
		return getVirtualNodeToComputerRule().getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getVirtualNodeToComputerRule__IsAppropriate_solveCsp_FWD__Match_NetworkSpan_Container() {
		return getVirtualNodeToComputerRule().getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getVirtualNodeToComputerRule__IsAppropriate_checkCsp_FWD__CSP() {
		return getVirtualNodeToComputerRule().getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getVirtualNodeToComputerRule__CheckTypes_FWD__Match() {
		return getVirtualNodeToComputerRule().getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getVirtualNodeToComputerRule__IsAppropriate_BWD__Match_Cable_Router_Container_Computer() {
		return getVirtualNodeToComputerRule().getEOperations().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getVirtualNodeToComputerRule__Perform_BWD__IsApplicableMatch() {
		return getVirtualNodeToComputerRule().getEOperations().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getVirtualNodeToComputerRule__IsApplicable_BWD__Match() {
		return getVirtualNodeToComputerRule().getEOperations().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getVirtualNodeToComputerRule__RegisterObjectsToMatch_BWD__Match_Cable_Router_Container_Computer() {
		return getVirtualNodeToComputerRule().getEOperations().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getVirtualNodeToComputerRule__IsAppropriate_solveCsp_BWD__Match_Cable_Router_Container_Computer() {
		return getVirtualNodeToComputerRule().getEOperations().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getVirtualNodeToComputerRule__IsAppropriate_checkCsp_BWD__CSP() {
		return getVirtualNodeToComputerRule().getEOperations().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getVirtualNodeToComputerRule__IsApplicable_solveCsp_BWD__IsApplicableMatch_NetworkSpan_Cable_Router_Container_Computer_VirtualNodeToRouter_Container_ReqContainerToImplContainer() {
		return getVirtualNodeToComputerRule().getEOperations().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getVirtualNodeToComputerRule__IsApplicable_checkCsp_BWD__CSP() {
		return getVirtualNodeToComputerRule().getEOperations().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getVirtualNodeToComputerRule__RegisterObjects_BWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject() {
		return getVirtualNodeToComputerRule().getEOperations().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getVirtualNodeToComputerRule__CheckTypes_BWD__Match() {
		return getVirtualNodeToComputerRule().getEOperations().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getVirtualNodeToComputerRule__IsAppropriate_FWD_NetworkSpan_0__NetworkSpan() {
		return getVirtualNodeToComputerRule().getEOperations().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getVirtualNodeToComputerRule__IsAppropriate_BWD_EMoflonEdge_1__EMoflonEdge() {
		return getVirtualNodeToComputerRule().getEOperations().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getVirtualNodeToComputerRule__CheckAttributes_FWD__TripleMatch() {
		return getVirtualNodeToComputerRule().getEOperations().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getVirtualNodeToComputerRule__CheckAttributes_BWD__TripleMatch() {
		return getVirtualNodeToComputerRule().getEOperations().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getVirtualNodeToComputerRule__IsApplicable_CC__Match_Match() {
		return getVirtualNodeToComputerRule().getEOperations().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getVirtualNodeToComputerRule__IsApplicable_solveCsp_CC__NetworkSpan_Cable_Router_Container_Computer_Container_Match_Match() {
		return getVirtualNodeToComputerRule().getEOperations().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getVirtualNodeToComputerRule__IsApplicable_checkCsp_CC__CSP() {
		return getVirtualNodeToComputerRule().getEOperations().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getVirtualNodeToComputerRule__CheckDEC_FWD__NetworkSpan_Container() {
		return getVirtualNodeToComputerRule().getEOperations().get(24);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getVirtualNodeToComputerRule__CheckDEC_BWD__Cable_Router_Container_Computer() {
		return getVirtualNodeToComputerRule().getEOperations().get(25);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getVirtualNodeToComputerRule__GenerateModel__RuleEntryContainer_VirtualNodeToRouter() {
		return getVirtualNodeToComputerRule().getEOperations().get(26);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getVirtualNodeToComputerRule__GenerateModel_solveCsp_BWD__IsApplicableMatch_NetworkSpan_Cable_Router_Container_VirtualNodeToRouter_Container_ReqContainerToImplContainer_ModelgeneratorRuleResult() {
		return getVirtualNodeToComputerRule().getEOperations().get(27);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getVirtualNodeToComputerRule__GenerateModel_checkCsp_BWD__CSP() {
		return getVirtualNodeToComputerRule().getEOperations().get(28);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getImplOutgoingConnectionIgnoreRule() {
		if (implOutgoingConnectionIgnoreRuleEClass == null) {
			implOutgoingConnectionIgnoreRuleEClass = (EClass) EPackage.Registry.INSTANCE
					.getEPackage(RulesPackage.eNS_URI).getEClassifiers().get(3);
		}
		return implOutgoingConnectionIgnoreRuleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVirtualNodeToServerRule() {
		if (virtualNodeToServerRuleEClass == null) {
			virtualNodeToServerRuleEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(RulesPackage.eNS_URI)
					.getEClassifiers().get(4);
		}
		return virtualNodeToServerRuleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getVirtualNodeToServerRule__IsAppropriate_FWD__Match_NetworkSpan_Container() {
		return getVirtualNodeToServerRule().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getVirtualNodeToServerRule__Perform_FWD__IsApplicableMatch() {
		return getVirtualNodeToServerRule().getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getVirtualNodeToServerRule__IsApplicable_FWD__Match() {
		return getVirtualNodeToServerRule().getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getVirtualNodeToServerRule__RegisterObjectsToMatch_FWD__Match_NetworkSpan_Container() {
		return getVirtualNodeToServerRule().getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getVirtualNodeToServerRule__IsAppropriate_solveCsp_FWD__Match_NetworkSpan_Container() {
		return getVirtualNodeToServerRule().getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getVirtualNodeToServerRule__IsAppropriate_checkCsp_FWD__CSP() {
		return getVirtualNodeToServerRule().getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getVirtualNodeToServerRule__CheckTypes_FWD__Match() {
		return getVirtualNodeToServerRule().getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getVirtualNodeToServerRule__IsAppropriate_BWD__Match_Container_Router_Server_Cable() {
		return getVirtualNodeToServerRule().getEOperations().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getVirtualNodeToServerRule__Perform_BWD__IsApplicableMatch() {
		return getVirtualNodeToServerRule().getEOperations().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getVirtualNodeToServerRule__IsApplicable_BWD__Match() {
		return getVirtualNodeToServerRule().getEOperations().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getVirtualNodeToServerRule__RegisterObjectsToMatch_BWD__Match_Container_Router_Server_Cable() {
		return getVirtualNodeToServerRule().getEOperations().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getVirtualNodeToServerRule__IsAppropriate_solveCsp_BWD__Match_Container_Router_Server_Cable() {
		return getVirtualNodeToServerRule().getEOperations().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getVirtualNodeToServerRule__IsAppropriate_checkCsp_BWD__CSP() {
		return getVirtualNodeToServerRule().getEOperations().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getVirtualNodeToServerRule__IsApplicable_solveCsp_BWD__IsApplicableMatch_Container_NetworkSpan_Router_Container_VirtualNodeToRouter_Server_Cable_ReqContainerToImplContainer() {
		return getVirtualNodeToServerRule().getEOperations().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getVirtualNodeToServerRule__IsApplicable_checkCsp_BWD__CSP() {
		return getVirtualNodeToServerRule().getEOperations().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getVirtualNodeToServerRule__RegisterObjects_BWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject() {
		return getVirtualNodeToServerRule().getEOperations().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getVirtualNodeToServerRule__CheckTypes_BWD__Match() {
		return getVirtualNodeToServerRule().getEOperations().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getVirtualNodeToServerRule__IsAppropriate_FWD_NetworkSpan_1__NetworkSpan() {
		return getVirtualNodeToServerRule().getEOperations().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getVirtualNodeToServerRule__IsAppropriate_BWD_EMoflonEdge_2__EMoflonEdge() {
		return getVirtualNodeToServerRule().getEOperations().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getVirtualNodeToServerRule__CheckAttributes_FWD__TripleMatch() {
		return getVirtualNodeToServerRule().getEOperations().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getVirtualNodeToServerRule__CheckAttributes_BWD__TripleMatch() {
		return getVirtualNodeToServerRule().getEOperations().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getVirtualNodeToServerRule__IsApplicable_CC__Match_Match() {
		return getVirtualNodeToServerRule().getEOperations().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getVirtualNodeToServerRule__IsApplicable_solveCsp_CC__Container_NetworkSpan_Router_Container_Server_Cable_Match_Match() {
		return getVirtualNodeToServerRule().getEOperations().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getVirtualNodeToServerRule__IsApplicable_checkCsp_CC__CSP() {
		return getVirtualNodeToServerRule().getEOperations().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getVirtualNodeToServerRule__CheckDEC_FWD__NetworkSpan_Container() {
		return getVirtualNodeToServerRule().getEOperations().get(24);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getVirtualNodeToServerRule__CheckDEC_BWD__Container_Router_Server_Cable() {
		return getVirtualNodeToServerRule().getEOperations().get(25);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getVirtualNodeToServerRule__GenerateModel__RuleEntryContainer_VirtualNodeToRouter() {
		return getVirtualNodeToServerRule().getEOperations().get(26);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getVirtualNodeToServerRule__GenerateModel_solveCsp_BWD__IsApplicableMatch_Container_NetworkSpan_Router_Container_VirtualNodeToRouter_Cable_ReqContainerToImplContainer_ModelgeneratorRuleResult() {
		return getVirtualNodeToServerRule().getEOperations().get(27);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getVirtualNodeToServerRule__GenerateModel_checkCsp_BWD__CSP() {
		return getVirtualNodeToServerRule().getEOperations().get(28);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getImplCopperIgnoreRule() {
		if (implCopperIgnoreRuleEClass == null) {
			implCopperIgnoreRuleEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(RulesPackage.eNS_URI)
					.getEClassifiers().get(5);
		}
		return implCopperIgnoreRuleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getImplCopperIgnoreRule__IsAppropriate_FWD__Match_Container() {
		return getImplCopperIgnoreRule().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getImplCopperIgnoreRule__Perform_FWD__IsApplicableMatch() {
		return getImplCopperIgnoreRule().getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getImplCopperIgnoreRule__IsApplicable_FWD__Match() {
		return getImplCopperIgnoreRule().getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getImplCopperIgnoreRule__RegisterObjectsToMatch_FWD__Match_Container() {
		return getImplCopperIgnoreRule().getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getImplCopperIgnoreRule__IsAppropriate_solveCsp_FWD__Match_Container() {
		return getImplCopperIgnoreRule().getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getImplCopperIgnoreRule__IsAppropriate_checkCsp_FWD__CSP() {
		return getImplCopperIgnoreRule().getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getImplCopperIgnoreRule__CheckTypes_FWD__Match() {
		return getImplCopperIgnoreRule().getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getImplCopperIgnoreRule__IsAppropriate_BWD__Match_CopperCable_Container() {
		return getImplCopperIgnoreRule().getEOperations().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getImplCopperIgnoreRule__Perform_BWD__IsApplicableMatch() {
		return getImplCopperIgnoreRule().getEOperations().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getImplCopperIgnoreRule__IsApplicable_BWD__Match() {
		return getImplCopperIgnoreRule().getEOperations().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getImplCopperIgnoreRule__RegisterObjectsToMatch_BWD__Match_CopperCable_Container() {
		return getImplCopperIgnoreRule().getEOperations().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getImplCopperIgnoreRule__IsAppropriate_solveCsp_BWD__Match_CopperCable_Container() {
		return getImplCopperIgnoreRule().getEOperations().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getImplCopperIgnoreRule__IsAppropriate_checkCsp_BWD__CSP() {
		return getImplCopperIgnoreRule().getEOperations().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getImplCopperIgnoreRule__IsApplicable_solveCsp_BWD__IsApplicableMatch_Container_CopperCable_Container_ReqContainerToImplContainer() {
		return getImplCopperIgnoreRule().getEOperations().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getImplCopperIgnoreRule__IsApplicable_checkCsp_BWD__CSP() {
		return getImplCopperIgnoreRule().getEOperations().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getImplCopperIgnoreRule__RegisterObjects_BWD__PerformRuleResult_EObject_EObject_EObject_EObject() {
		return getImplCopperIgnoreRule().getEOperations().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getImplCopperIgnoreRule__CheckTypes_BWD__Match() {
		return getImplCopperIgnoreRule().getEOperations().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getImplCopperIgnoreRule__IsAppropriate_FWD_Container_1__Container() {
		return getImplCopperIgnoreRule().getEOperations().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getImplCopperIgnoreRule__IsAppropriate_BWD_EMoflonEdge_3__EMoflonEdge() {
		return getImplCopperIgnoreRule().getEOperations().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getImplCopperIgnoreRule__CheckAttributes_FWD__TripleMatch() {
		return getImplCopperIgnoreRule().getEOperations().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getImplCopperIgnoreRule__CheckAttributes_BWD__TripleMatch() {
		return getImplCopperIgnoreRule().getEOperations().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getImplCopperIgnoreRule__IsApplicable_CC__Match_Match() {
		return getImplCopperIgnoreRule().getEOperations().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getImplCopperIgnoreRule__IsApplicable_solveCsp_CC__Container_CopperCable_Container_Match_Match() {
		return getImplCopperIgnoreRule().getEOperations().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getImplCopperIgnoreRule__IsApplicable_checkCsp_CC__CSP() {
		return getImplCopperIgnoreRule().getEOperations().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getImplCopperIgnoreRule__CheckDEC_FWD__Container() {
		return getImplCopperIgnoreRule().getEOperations().get(24);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getImplCopperIgnoreRule__CheckDEC_BWD__CopperCable_Container() {
		return getImplCopperIgnoreRule().getEOperations().get(25);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getImplCopperIgnoreRule__GenerateModel__RuleEntryContainer_ReqContainerToImplContainer() {
		return getImplCopperIgnoreRule().getEOperations().get(26);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getImplCopperIgnoreRule__GenerateModel_solveCsp_BWD__IsApplicableMatch_Container_Container_ReqContainerToImplContainer_ModelgeneratorRuleResult() {
		return getImplCopperIgnoreRule().getEOperations().get(27);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getImplCopperIgnoreRule__GenerateModel_checkCsp_BWD__CSP() {
		return getImplCopperIgnoreRule().getEOperations().get(28);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getReqConsumerToComputerRule() {
		if (reqConsumerToComputerRuleEClass == null) {
			reqConsumerToComputerRuleEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(RulesPackage.eNS_URI)
					.getEClassifiers().get(6);
		}
		return reqConsumerToComputerRuleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getReqConsumerToComputerRule__IsAppropriate_FWD__Match_Consumer_Container_NetworkSpan() {
		return getReqConsumerToComputerRule().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getReqConsumerToComputerRule__Perform_FWD__IsApplicableMatch() {
		return getReqConsumerToComputerRule().getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getReqConsumerToComputerRule__IsApplicable_FWD__Match() {
		return getReqConsumerToComputerRule().getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getReqConsumerToComputerRule__RegisterObjectsToMatch_FWD__Match_Consumer_Container_NetworkSpan() {
		return getReqConsumerToComputerRule().getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getReqConsumerToComputerRule__IsAppropriate_solveCsp_FWD__Match_Consumer_Container_NetworkSpan() {
		return getReqConsumerToComputerRule().getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getReqConsumerToComputerRule__IsAppropriate_checkCsp_FWD__CSP() {
		return getReqConsumerToComputerRule().getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getReqConsumerToComputerRule__IsApplicable_solveCsp_FWD__IsApplicableMatch_Computer_Consumer_Container_VirtualNodeToComputer_NetworkSpan_Cable_Container_ReqContainerToImplContainer() {
		return getReqConsumerToComputerRule().getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getReqConsumerToComputerRule__IsApplicable_checkCsp_FWD__CSP() {
		return getReqConsumerToComputerRule().getEOperations().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getReqConsumerToComputerRule__RegisterObjects_FWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject() {
		return getReqConsumerToComputerRule().getEOperations().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getReqConsumerToComputerRule__CheckTypes_FWD__Match() {
		return getReqConsumerToComputerRule().getEOperations().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getReqConsumerToComputerRule__IsAppropriate_BWD__Match_Computer_Cable_Container() {
		return getReqConsumerToComputerRule().getEOperations().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getReqConsumerToComputerRule__Perform_BWD__IsApplicableMatch() {
		return getReqConsumerToComputerRule().getEOperations().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getReqConsumerToComputerRule__IsApplicable_BWD__Match() {
		return getReqConsumerToComputerRule().getEOperations().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getReqConsumerToComputerRule__RegisterObjectsToMatch_BWD__Match_Computer_Cable_Container() {
		return getReqConsumerToComputerRule().getEOperations().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getReqConsumerToComputerRule__IsAppropriate_solveCsp_BWD__Match_Computer_Cable_Container() {
		return getReqConsumerToComputerRule().getEOperations().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getReqConsumerToComputerRule__IsAppropriate_checkCsp_BWD__CSP() {
		return getReqConsumerToComputerRule().getEOperations().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getReqConsumerToComputerRule__CheckTypes_BWD__Match() {
		return getReqConsumerToComputerRule().getEOperations().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getReqConsumerToComputerRule__IsAppropriate_BWD_Computer_0__Computer() {
		return getReqConsumerToComputerRule().getEOperations().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getReqConsumerToComputerRule__IsAppropriate_FWD_EMoflonEdge_0__EMoflonEdge() {
		return getReqConsumerToComputerRule().getEOperations().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getReqConsumerToComputerRule__CheckAttributes_FWD__TripleMatch() {
		return getReqConsumerToComputerRule().getEOperations().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getReqConsumerToComputerRule__CheckAttributes_BWD__TripleMatch() {
		return getReqConsumerToComputerRule().getEOperations().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getReqConsumerToComputerRule__IsApplicable_CC__Match_Match() {
		return getReqConsumerToComputerRule().getEOperations().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getReqConsumerToComputerRule__IsApplicable_solveCsp_CC__Computer_Consumer_Container_NetworkSpan_Cable_Container_Match_Match() {
		return getReqConsumerToComputerRule().getEOperations().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getReqConsumerToComputerRule__IsApplicable_checkCsp_CC__CSP() {
		return getReqConsumerToComputerRule().getEOperations().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getReqConsumerToComputerRule__CheckDEC_FWD__Consumer_Container_NetworkSpan() {
		return getReqConsumerToComputerRule().getEOperations().get(24);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getReqConsumerToComputerRule__CheckDEC_BWD__Computer_Cable_Container() {
		return getReqConsumerToComputerRule().getEOperations().get(25);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getReqConsumerToComputerRule__GenerateModel__RuleEntryContainer_VirtualNodeToComputer() {
		return getReqConsumerToComputerRule().getEOperations().get(26);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getReqConsumerToComputerRule__GenerateModel_solveCsp_BWD__IsApplicableMatch_Computer_Container_VirtualNodeToComputer_NetworkSpan_Cable_Container_ReqContainerToImplContainer_ModelgeneratorRuleResult() {
		return getReqConsumerToComputerRule().getEOperations().get(27);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getReqConsumerToComputerRule__GenerateModel_checkCsp_BWD__CSP() {
		return getReqConsumerToComputerRule().getEOperations().get(28);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVirtualNodeToRouterRule2() {
		if (virtualNodeToRouterRule2EClass == null) {
			virtualNodeToRouterRule2EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(RulesPackage.eNS_URI)
					.getEClassifiers().get(7);
		}
		return virtualNodeToRouterRule2EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getVirtualNodeToRouterRule2__IsAppropriate_FWD__Match_NetworkSpan_Container() {
		return getVirtualNodeToRouterRule2().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getVirtualNodeToRouterRule2__Perform_FWD__IsApplicableMatch() {
		return getVirtualNodeToRouterRule2().getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getVirtualNodeToRouterRule2__IsApplicable_FWD__Match() {
		return getVirtualNodeToRouterRule2().getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getVirtualNodeToRouterRule2__RegisterObjectsToMatch_FWD__Match_NetworkSpan_Container() {
		return getVirtualNodeToRouterRule2().getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getVirtualNodeToRouterRule2__IsAppropriate_solveCsp_FWD__Match_NetworkSpan_Container() {
		return getVirtualNodeToRouterRule2().getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getVirtualNodeToRouterRule2__IsAppropriate_checkCsp_FWD__CSP() {
		return getVirtualNodeToRouterRule2().getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getVirtualNodeToRouterRule2__CheckTypes_FWD__Match() {
		return getVirtualNodeToRouterRule2().getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getVirtualNodeToRouterRule2__IsAppropriate_BWD__Match_Cable_Router_Router_Container() {
		return getVirtualNodeToRouterRule2().getEOperations().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getVirtualNodeToRouterRule2__Perform_BWD__IsApplicableMatch() {
		return getVirtualNodeToRouterRule2().getEOperations().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getVirtualNodeToRouterRule2__IsApplicable_BWD__Match() {
		return getVirtualNodeToRouterRule2().getEOperations().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getVirtualNodeToRouterRule2__RegisterObjectsToMatch_BWD__Match_Cable_Router_Router_Container() {
		return getVirtualNodeToRouterRule2().getEOperations().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getVirtualNodeToRouterRule2__IsAppropriate_solveCsp_BWD__Match_Cable_Router_Router_Container() {
		return getVirtualNodeToRouterRule2().getEOperations().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getVirtualNodeToRouterRule2__IsAppropriate_checkCsp_BWD__CSP() {
		return getVirtualNodeToRouterRule2().getEOperations().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getVirtualNodeToRouterRule2__IsApplicable_solveCsp_BWD__IsApplicableMatch_Cable_NetworkSpan_ReqContainerToImplContainer_Container_VirtualNodeToRouter_Router_Router_Container() {
		return getVirtualNodeToRouterRule2().getEOperations().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getVirtualNodeToRouterRule2__IsApplicable_checkCsp_BWD__CSP() {
		return getVirtualNodeToRouterRule2().getEOperations().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getVirtualNodeToRouterRule2__RegisterObjects_BWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject() {
		return getVirtualNodeToRouterRule2().getEOperations().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getVirtualNodeToRouterRule2__CheckTypes_BWD__Match() {
		return getVirtualNodeToRouterRule2().getEOperations().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getVirtualNodeToRouterRule2__IsAppropriate_FWD_NetworkSpan_2__NetworkSpan() {
		return getVirtualNodeToRouterRule2().getEOperations().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getVirtualNodeToRouterRule2__IsAppropriate_BWD_EMoflonEdge_4__EMoflonEdge() {
		return getVirtualNodeToRouterRule2().getEOperations().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getVirtualNodeToRouterRule2__CheckAttributes_FWD__TripleMatch() {
		return getVirtualNodeToRouterRule2().getEOperations().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getVirtualNodeToRouterRule2__CheckAttributes_BWD__TripleMatch() {
		return getVirtualNodeToRouterRule2().getEOperations().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getVirtualNodeToRouterRule2__IsApplicable_CC__Match_Match() {
		return getVirtualNodeToRouterRule2().getEOperations().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getVirtualNodeToRouterRule2__IsApplicable_solveCsp_CC__Cable_NetworkSpan_Container_Router_Router_Container_Match_Match() {
		return getVirtualNodeToRouterRule2().getEOperations().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getVirtualNodeToRouterRule2__IsApplicable_checkCsp_CC__CSP() {
		return getVirtualNodeToRouterRule2().getEOperations().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getVirtualNodeToRouterRule2__CheckDEC_FWD__NetworkSpan_Container() {
		return getVirtualNodeToRouterRule2().getEOperations().get(24);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getVirtualNodeToRouterRule2__CheckDEC_BWD__Cable_Router_Router_Container() {
		return getVirtualNodeToRouterRule2().getEOperations().get(25);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getVirtualNodeToRouterRule2__GenerateModel__RuleEntryContainer_VirtualNodeToRouter() {
		return getVirtualNodeToRouterRule2().getEOperations().get(26);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getVirtualNodeToRouterRule2__GenerateModel_solveCsp_BWD__IsApplicableMatch_Cable_NetworkSpan_ReqContainerToImplContainer_Container_VirtualNodeToRouter_Router_Container_ModelgeneratorRuleResult() {
		return getVirtualNodeToRouterRule2().getEOperations().get(27);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getVirtualNodeToRouterRule2__GenerateModel_checkCsp_BWD__CSP() {
		return getVirtualNodeToRouterRule2().getEOperations().get(28);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getReqProviderToServerRule() {
		if (reqProviderToServerRuleEClass == null) {
			reqProviderToServerRuleEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(RulesPackage.eNS_URI)
					.getEClassifiers().get(8);
		}
		return reqProviderToServerRuleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getReqProviderToServerRule__IsAppropriate_FWD__Match_Provider_Container_NetworkSpan() {
		return getReqProviderToServerRule().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getReqProviderToServerRule__Perform_FWD__IsApplicableMatch() {
		return getReqProviderToServerRule().getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getReqProviderToServerRule__IsApplicable_FWD__Match() {
		return getReqProviderToServerRule().getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getReqProviderToServerRule__RegisterObjectsToMatch_FWD__Match_Provider_Container_NetworkSpan() {
		return getReqProviderToServerRule().getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getReqProviderToServerRule__IsAppropriate_solveCsp_FWD__Match_Provider_Container_NetworkSpan() {
		return getReqProviderToServerRule().getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getReqProviderToServerRule__IsAppropriate_checkCsp_FWD__CSP() {
		return getReqProviderToServerRule().getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getReqProviderToServerRule__IsApplicable_solveCsp_FWD__IsApplicableMatch_VirtualNodeToServer_Server_Provider_Container_NetworkSpan_Cable_Container_ReqContainerToImplContainer() {
		return getReqProviderToServerRule().getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getReqProviderToServerRule__IsApplicable_checkCsp_FWD__CSP() {
		return getReqProviderToServerRule().getEOperations().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getReqProviderToServerRule__RegisterObjects_FWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject() {
		return getReqProviderToServerRule().getEOperations().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getReqProviderToServerRule__CheckTypes_FWD__Match() {
		return getReqProviderToServerRule().getEOperations().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getReqProviderToServerRule__IsAppropriate_BWD__Match_Server_Cable_Container() {
		return getReqProviderToServerRule().getEOperations().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getReqProviderToServerRule__Perform_BWD__IsApplicableMatch() {
		return getReqProviderToServerRule().getEOperations().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getReqProviderToServerRule__IsApplicable_BWD__Match() {
		return getReqProviderToServerRule().getEOperations().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getReqProviderToServerRule__RegisterObjectsToMatch_BWD__Match_Server_Cable_Container() {
		return getReqProviderToServerRule().getEOperations().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getReqProviderToServerRule__IsAppropriate_solveCsp_BWD__Match_Server_Cable_Container() {
		return getReqProviderToServerRule().getEOperations().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getReqProviderToServerRule__IsAppropriate_checkCsp_BWD__CSP() {
		return getReqProviderToServerRule().getEOperations().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getReqProviderToServerRule__CheckTypes_BWD__Match() {
		return getReqProviderToServerRule().getEOperations().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getReqProviderToServerRule__IsAppropriate_BWD_Server_0__Server() {
		return getReqProviderToServerRule().getEOperations().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getReqProviderToServerRule__IsAppropriate_FWD_EMoflonEdge_1__EMoflonEdge() {
		return getReqProviderToServerRule().getEOperations().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getReqProviderToServerRule__CheckAttributes_FWD__TripleMatch() {
		return getReqProviderToServerRule().getEOperations().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getReqProviderToServerRule__CheckAttributes_BWD__TripleMatch() {
		return getReqProviderToServerRule().getEOperations().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getReqProviderToServerRule__IsApplicable_CC__Match_Match() {
		return getReqProviderToServerRule().getEOperations().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getReqProviderToServerRule__IsApplicable_solveCsp_CC__Server_Provider_Container_NetworkSpan_Cable_Container_Match_Match() {
		return getReqProviderToServerRule().getEOperations().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getReqProviderToServerRule__IsApplicable_checkCsp_CC__CSP() {
		return getReqProviderToServerRule().getEOperations().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getReqProviderToServerRule__CheckDEC_FWD__Provider_Container_NetworkSpan() {
		return getReqProviderToServerRule().getEOperations().get(24);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getReqProviderToServerRule__CheckDEC_BWD__Server_Cable_Container() {
		return getReqProviderToServerRule().getEOperations().get(25);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getReqProviderToServerRule__GenerateModel__RuleEntryContainer_VirtualNodeToServer() {
		return getReqProviderToServerRule().getEOperations().get(26);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getReqProviderToServerRule__GenerateModel_solveCsp_BWD__IsApplicableMatch_VirtualNodeToServer_Server_Container_NetworkSpan_Cable_Container_ReqContainerToImplContainer_ModelgeneratorRuleResult() {
		return getReqProviderToServerRule().getEOperations().get(27);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getReqProviderToServerRule__GenerateModel_checkCsp_BWD__CSP() {
		return getReqProviderToServerRule().getEOperations().get(28);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getReqContainerToImplContainerRule() {
		if (reqContainerToImplContainerRuleEClass == null) {
			reqContainerToImplContainerRuleEClass = (EClass) EPackage.Registry.INSTANCE
					.getEPackage(RulesPackage.eNS_URI).getEClassifiers().get(9);
		}
		return reqContainerToImplContainerRuleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getReqContainerToImplContainerRule__IsAppropriate_FWD__Match_NetworkSpan_Container() {
		return getReqContainerToImplContainerRule().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getReqContainerToImplContainerRule__Perform_FWD__IsApplicableMatch() {
		return getReqContainerToImplContainerRule().getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getReqContainerToImplContainerRule__IsApplicable_FWD__Match() {
		return getReqContainerToImplContainerRule().getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getReqContainerToImplContainerRule__RegisterObjectsToMatch_FWD__Match_NetworkSpan_Container() {
		return getReqContainerToImplContainerRule().getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getReqContainerToImplContainerRule__IsAppropriate_solveCsp_FWD__Match_NetworkSpan_Container() {
		return getReqContainerToImplContainerRule().getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getReqContainerToImplContainerRule__IsAppropriate_checkCsp_FWD__CSP() {
		return getReqContainerToImplContainerRule().getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getReqContainerToImplContainerRule__IsApplicable_solveCsp_FWD__IsApplicableMatch_NetworkSpan_Container() {
		return getReqContainerToImplContainerRule().getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getReqContainerToImplContainerRule__IsApplicable_checkCsp_FWD__CSP() {
		return getReqContainerToImplContainerRule().getEOperations().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getReqContainerToImplContainerRule__RegisterObjects_FWD__PerformRuleResult_EObject_EObject_EObject_EObject() {
		return getReqContainerToImplContainerRule().getEOperations().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getReqContainerToImplContainerRule__CheckTypes_FWD__Match() {
		return getReqContainerToImplContainerRule().getEOperations().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getReqContainerToImplContainerRule__IsAppropriate_BWD__Match_Container() {
		return getReqContainerToImplContainerRule().getEOperations().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getReqContainerToImplContainerRule__Perform_BWD__IsApplicableMatch() {
		return getReqContainerToImplContainerRule().getEOperations().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getReqContainerToImplContainerRule__IsApplicable_BWD__Match() {
		return getReqContainerToImplContainerRule().getEOperations().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getReqContainerToImplContainerRule__RegisterObjectsToMatch_BWD__Match_Container() {
		return getReqContainerToImplContainerRule().getEOperations().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getReqContainerToImplContainerRule__IsAppropriate_solveCsp_BWD__Match_Container() {
		return getReqContainerToImplContainerRule().getEOperations().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getReqContainerToImplContainerRule__IsAppropriate_checkCsp_BWD__CSP() {
		return getReqContainerToImplContainerRule().getEOperations().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getReqContainerToImplContainerRule__IsApplicable_solveCsp_BWD__IsApplicableMatch_Container() {
		return getReqContainerToImplContainerRule().getEOperations().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getReqContainerToImplContainerRule__IsApplicable_checkCsp_BWD__CSP() {
		return getReqContainerToImplContainerRule().getEOperations().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getReqContainerToImplContainerRule__RegisterObjects_BWD__PerformRuleResult_EObject_EObject_EObject_EObject() {
		return getReqContainerToImplContainerRule().getEOperations().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getReqContainerToImplContainerRule__CheckTypes_BWD__Match() {
		return getReqContainerToImplContainerRule().getEOperations().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getReqContainerToImplContainerRule__IsAppropriate_BWD_Container_0__Container() {
		return getReqContainerToImplContainerRule().getEOperations().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getReqContainerToImplContainerRule__IsAppropriate_FWD_EMoflonEdge_2__EMoflonEdge() {
		return getReqContainerToImplContainerRule().getEOperations().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getReqContainerToImplContainerRule__CheckAttributes_FWD__TripleMatch() {
		return getReqContainerToImplContainerRule().getEOperations().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getReqContainerToImplContainerRule__CheckAttributes_BWD__TripleMatch() {
		return getReqContainerToImplContainerRule().getEOperations().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getReqContainerToImplContainerRule__IsApplicable_CC__Match_Match() {
		return getReqContainerToImplContainerRule().getEOperations().get(24);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getReqContainerToImplContainerRule__IsApplicable_solveCsp_CC__NetworkSpan_Container_Container_Match_Match() {
		return getReqContainerToImplContainerRule().getEOperations().get(25);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getReqContainerToImplContainerRule__IsApplicable_checkCsp_CC__CSP() {
		return getReqContainerToImplContainerRule().getEOperations().get(26);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getReqContainerToImplContainerRule__CheckDEC_FWD__NetworkSpan_Container() {
		return getReqContainerToImplContainerRule().getEOperations().get(27);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getReqContainerToImplContainerRule__CheckDEC_BWD__Container() {
		return getReqContainerToImplContainerRule().getEOperations().get(28);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getReqContainerToImplContainerRule__GenerateModel__RuleEntryContainer() {
		return getReqContainerToImplContainerRule().getEOperations().get(29);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getReqContainerToImplContainerRule__GenerateModel_solveCsp_BWD__IsApplicableMatch_ModelgeneratorRuleResult() {
		return getReqContainerToImplContainerRule().getEOperations().get(30);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getReqContainerToImplContainerRule__GenerateModel_checkCsp_BWD__CSP() {
		return getReqContainerToImplContainerRule().getEOperations().get(31);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getImplCableIgnoreRule() {
		if (implCableIgnoreRuleEClass == null) {
			implCableIgnoreRuleEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(RulesPackage.eNS_URI)
					.getEClassifiers().get(10);
		}
		return implCableIgnoreRuleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVirtualNodeToRouterRule1() {
		if (virtualNodeToRouterRule1EClass == null) {
			virtualNodeToRouterRule1EClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(RulesPackage.eNS_URI)
					.getEClassifiers().get(11);
		}
		return virtualNodeToRouterRule1EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getVirtualNodeToRouterRule1__IsAppropriate_FWD__Match_NetworkSpan_Container() {
		return getVirtualNodeToRouterRule1().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getVirtualNodeToRouterRule1__Perform_FWD__IsApplicableMatch() {
		return getVirtualNodeToRouterRule1().getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getVirtualNodeToRouterRule1__IsApplicable_FWD__Match() {
		return getVirtualNodeToRouterRule1().getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getVirtualNodeToRouterRule1__RegisterObjectsToMatch_FWD__Match_NetworkSpan_Container() {
		return getVirtualNodeToRouterRule1().getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getVirtualNodeToRouterRule1__IsAppropriate_solveCsp_FWD__Match_NetworkSpan_Container() {
		return getVirtualNodeToRouterRule1().getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getVirtualNodeToRouterRule1__IsAppropriate_checkCsp_FWD__CSP() {
		return getVirtualNodeToRouterRule1().getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getVirtualNodeToRouterRule1__CheckTypes_FWD__Match() {
		return getVirtualNodeToRouterRule1().getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getVirtualNodeToRouterRule1__IsAppropriate_BWD__Match_Container_Router() {
		return getVirtualNodeToRouterRule1().getEOperations().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getVirtualNodeToRouterRule1__Perform_BWD__IsApplicableMatch() {
		return getVirtualNodeToRouterRule1().getEOperations().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getVirtualNodeToRouterRule1__IsApplicable_BWD__Match() {
		return getVirtualNodeToRouterRule1().getEOperations().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getVirtualNodeToRouterRule1__RegisterObjectsToMatch_BWD__Match_Container_Router() {
		return getVirtualNodeToRouterRule1().getEOperations().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getVirtualNodeToRouterRule1__IsAppropriate_solveCsp_BWD__Match_Container_Router() {
		return getVirtualNodeToRouterRule1().getEOperations().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getVirtualNodeToRouterRule1__IsAppropriate_checkCsp_BWD__CSP() {
		return getVirtualNodeToRouterRule1().getEOperations().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getVirtualNodeToRouterRule1__IsApplicable_solveCsp_BWD__IsApplicableMatch_NetworkSpan_Container_Container_Router_ReqContainerToImplContainer() {
		return getVirtualNodeToRouterRule1().getEOperations().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getVirtualNodeToRouterRule1__IsApplicable_checkCsp_BWD__CSP() {
		return getVirtualNodeToRouterRule1().getEOperations().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getVirtualNodeToRouterRule1__RegisterObjects_BWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject() {
		return getVirtualNodeToRouterRule1().getEOperations().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getVirtualNodeToRouterRule1__CheckTypes_BWD__Match() {
		return getVirtualNodeToRouterRule1().getEOperations().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getVirtualNodeToRouterRule1__IsAppropriate_FWD_NetworkSpan_3__NetworkSpan() {
		return getVirtualNodeToRouterRule1().getEOperations().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getVirtualNodeToRouterRule1__IsAppropriate_BWD_EMoflonEdge_5__EMoflonEdge() {
		return getVirtualNodeToRouterRule1().getEOperations().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getVirtualNodeToRouterRule1__CheckAttributes_FWD__TripleMatch() {
		return getVirtualNodeToRouterRule1().getEOperations().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getVirtualNodeToRouterRule1__CheckAttributes_BWD__TripleMatch() {
		return getVirtualNodeToRouterRule1().getEOperations().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getVirtualNodeToRouterRule1__IsApplicable_CC__Match_Match() {
		return getVirtualNodeToRouterRule1().getEOperations().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getVirtualNodeToRouterRule1__IsApplicable_solveCsp_CC__NetworkSpan_Container_Container_Router_Match_Match() {
		return getVirtualNodeToRouterRule1().getEOperations().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getVirtualNodeToRouterRule1__IsApplicable_checkCsp_CC__CSP() {
		return getVirtualNodeToRouterRule1().getEOperations().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getVirtualNodeToRouterRule1__CheckDEC_FWD__NetworkSpan_Container() {
		return getVirtualNodeToRouterRule1().getEOperations().get(24);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getVirtualNodeToRouterRule1__CheckDEC_BWD__Container_Router() {
		return getVirtualNodeToRouterRule1().getEOperations().get(25);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getVirtualNodeToRouterRule1__GenerateModel__RuleEntryContainer_ReqContainerToImplContainer() {
		return getVirtualNodeToRouterRule1().getEOperations().get(26);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getVirtualNodeToRouterRule1__GenerateModel_solveCsp_BWD__IsApplicableMatch_NetworkSpan_Container_Container_ReqContainerToImplContainer_ModelgeneratorRuleResult() {
		return getVirtualNodeToRouterRule1().getEOperations().get(27);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getVirtualNodeToRouterRule1__GenerateModel_checkCsp_BWD__CSP() {
		return getVirtualNodeToRouterRule1().getEOperations().get(28);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getImplIncomingConnectionIgnoreRule() {
		if (implIncomingConnectionIgnoreRuleEClass == null) {
			implIncomingConnectionIgnoreRuleEClass = (EClass) EPackage.Registry.INSTANCE
					.getEPackage(RulesPackage.eNS_URI).getEClassifiers().get(12);
		}
		return implIncomingConnectionIgnoreRuleEClass;
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
			eClassifier.setInstanceClassName("ReqToImpTransformator.Rules." + eClassifier.getName());
			setGeneratedClassName(eClassifier);
		}
	}

} //RulesPackageImpl
