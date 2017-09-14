/**
 */
package RequirementsTransformator.Rules.impl;

import RequirementsTransformator.RequirementsTransformatorPackage;

import RequirementsTransformator.Rules.RulesFactory;
import RequirementsTransformator.Rules.RulesPackage;
import RequirementsTransformator.Rules.XAgentToAgentRule;
import RequirementsTransformator.Rules.XConsumerToConsumerRule;
import RequirementsTransformator.Rules.XContainerToContainerRule;
import RequirementsTransformator.Rules.XProviderToProviderRule;

import RequirementsTransformator.impl.RequirementsTransformatorPackageImpl;

import implementation.ImplementationPackage;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.moflon.tgg.language.LanguagePackage;

import org.moflon.tgg.language.csp.CspPackage;

import org.moflon.tgg.language.modelgenerator.ModelgeneratorPackage;

import org.moflon.tgg.runtime.RuntimePackage;

import requirements.RequirementsPackage;

import requirementsXtext.reqXtext.ReqXtextPackage;

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
	private EClass xProviderToProviderRuleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass xAgentToAgentRuleEClass = null;

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
	private EClass xConsumerToConsumerRuleEClass = null;

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
	 * @see RequirementsTransformator.Rules.RulesPackage#eNS_URI
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
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
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
		ReqXtextPackage.eINSTANCE.eClass();
		RequirementsPackage.eINSTANCE.eClass();
		ImplementationPackage.eINSTANCE.eClass();
		LanguagePackage.eINSTANCE.eClass();
		ImplementationPackage.eINSTANCE.eClass();
		RequirementsPackage.eINSTANCE.eClass();

		// Obtain or create and register interdependencies
		RequirementsTransformatorPackageImpl theRequirementsTransformatorPackage = (RequirementsTransformatorPackageImpl) (EPackage.Registry.INSTANCE
				.getEPackage(RequirementsTransformatorPackage.eNS_URI) instanceof RequirementsTransformatorPackageImpl
						? EPackage.Registry.INSTANCE.getEPackage(RequirementsTransformatorPackage.eNS_URI)
						: RequirementsTransformatorPackage.eINSTANCE);

		// Create package meta-data objects
		theRulesPackage.createPackageContents();
		theRequirementsTransformatorPackage.createPackageContents();

		// Initialize created meta-data
		theRulesPackage.initializePackageContents();
		theRequirementsTransformatorPackage.initializePackageContents();

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
	public EClass getXProviderToProviderRule() {
		return xProviderToProviderRuleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getXProviderToProviderRule__IsAppropriate_FWD__Match_XProvider_XContainer() {
		return xProviderToProviderRuleEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getXProviderToProviderRule__Perform_FWD__IsApplicableMatch() {
		return xProviderToProviderRuleEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getXProviderToProviderRule__IsApplicable_FWD__Match() {
		return xProviderToProviderRuleEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getXProviderToProviderRule__RegisterObjectsToMatch_FWD__Match_XProvider_XContainer() {
		return xProviderToProviderRuleEClass.getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getXProviderToProviderRule__IsAppropriate_solveCsp_FWD__Match_XProvider_XContainer() {
		return xProviderToProviderRuleEClass.getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getXProviderToProviderRule__IsAppropriate_checkCsp_FWD__CSP() {
		return xProviderToProviderRuleEClass.getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getXProviderToProviderRule__IsApplicable_solveCsp_FWD__IsApplicableMatch_Container_XProvider_XContainerToContainer_XContainer() {
		return xProviderToProviderRuleEClass.getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getXProviderToProviderRule__IsApplicable_checkCsp_FWD__CSP() {
		return xProviderToProviderRuleEClass.getEOperations().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getXProviderToProviderRule__RegisterObjects_FWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject() {
		return xProviderToProviderRuleEClass.getEOperations().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getXProviderToProviderRule__CheckTypes_FWD__Match() {
		return xProviderToProviderRuleEClass.getEOperations().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getXProviderToProviderRule__IsAppropriate_BWD__Match_Container_Provider() {
		return xProviderToProviderRuleEClass.getEOperations().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getXProviderToProviderRule__Perform_BWD__IsApplicableMatch() {
		return xProviderToProviderRuleEClass.getEOperations().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getXProviderToProviderRule__IsApplicable_BWD__Match() {
		return xProviderToProviderRuleEClass.getEOperations().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getXProviderToProviderRule__RegisterObjectsToMatch_BWD__Match_Container_Provider() {
		return xProviderToProviderRuleEClass.getEOperations().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getXProviderToProviderRule__IsAppropriate_solveCsp_BWD__Match_Container_Provider() {
		return xProviderToProviderRuleEClass.getEOperations().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getXProviderToProviderRule__IsAppropriate_checkCsp_BWD__CSP() {
		return xProviderToProviderRuleEClass.getEOperations().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getXProviderToProviderRule__IsApplicable_solveCsp_BWD__IsApplicableMatch_Container_Provider_XContainerToContainer_XContainer() {
		return xProviderToProviderRuleEClass.getEOperations().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getXProviderToProviderRule__IsApplicable_checkCsp_BWD__CSP() {
		return xProviderToProviderRuleEClass.getEOperations().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getXProviderToProviderRule__RegisterObjects_BWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject() {
		return xProviderToProviderRuleEClass.getEOperations().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getXProviderToProviderRule__CheckTypes_BWD__Match() {
		return xProviderToProviderRuleEClass.getEOperations().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getXProviderToProviderRule__IsAppropriate_BWD_EMoflonEdge_6__EMoflonEdge() {
		return xProviderToProviderRuleEClass.getEOperations().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getXProviderToProviderRule__IsAppropriate_FWD_EMoflonEdge_3__EMoflonEdge() {
		return xProviderToProviderRuleEClass.getEOperations().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getXProviderToProviderRule__CheckAttributes_FWD__TripleMatch() {
		return xProviderToProviderRuleEClass.getEOperations().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getXProviderToProviderRule__CheckAttributes_BWD__TripleMatch() {
		return xProviderToProviderRuleEClass.getEOperations().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getXProviderToProviderRule__IsApplicable_CC__Match_Match() {
		return xProviderToProviderRuleEClass.getEOperations().get(24);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getXProviderToProviderRule__IsApplicable_solveCsp_CC__Container_Provider_XProvider_XContainer_Match_Match() {
		return xProviderToProviderRuleEClass.getEOperations().get(25);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getXProviderToProviderRule__IsApplicable_checkCsp_CC__CSP() {
		return xProviderToProviderRuleEClass.getEOperations().get(26);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getXProviderToProviderRule__CheckDEC_FWD__XProvider_XContainer() {
		return xProviderToProviderRuleEClass.getEOperations().get(27);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getXProviderToProviderRule__CheckDEC_BWD__Container_Provider() {
		return xProviderToProviderRuleEClass.getEOperations().get(28);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getXProviderToProviderRule__GenerateModel__RuleEntryContainer_XContainerToContainer() {
		return xProviderToProviderRuleEClass.getEOperations().get(29);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getXProviderToProviderRule__GenerateModel_solveCsp_BWD__IsApplicableMatch_Container_XContainerToContainer_XContainer_ModelgeneratorRuleResult() {
		return xProviderToProviderRuleEClass.getEOperations().get(30);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getXProviderToProviderRule__GenerateModel_checkCsp_BWD__CSP() {
		return xProviderToProviderRuleEClass.getEOperations().get(31);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getXAgentToAgentRule() {
		return xAgentToAgentRuleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getXContainerToContainerRule() {
		return xContainerToContainerRuleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getXContainerToContainerRule__IsAppropriate_FWD__Match_XContainer() {
		return xContainerToContainerRuleEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getXContainerToContainerRule__Perform_FWD__IsApplicableMatch() {
		return xContainerToContainerRuleEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getXContainerToContainerRule__IsApplicable_FWD__Match() {
		return xContainerToContainerRuleEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getXContainerToContainerRule__RegisterObjectsToMatch_FWD__Match_XContainer() {
		return xContainerToContainerRuleEClass.getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getXContainerToContainerRule__IsAppropriate_solveCsp_FWD__Match_XContainer() {
		return xContainerToContainerRuleEClass.getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getXContainerToContainerRule__IsAppropriate_checkCsp_FWD__CSP() {
		return xContainerToContainerRuleEClass.getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getXContainerToContainerRule__IsApplicable_solveCsp_FWD__IsApplicableMatch_XContainer() {
		return xContainerToContainerRuleEClass.getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getXContainerToContainerRule__IsApplicable_checkCsp_FWD__CSP() {
		return xContainerToContainerRuleEClass.getEOperations().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getXContainerToContainerRule__RegisterObjects_FWD__PerformRuleResult_EObject_EObject_EObject_EObject() {
		return xContainerToContainerRuleEClass.getEOperations().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getXContainerToContainerRule__CheckTypes_FWD__Match() {
		return xContainerToContainerRuleEClass.getEOperations().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getXContainerToContainerRule__IsAppropriate_BWD__Match_NetworkSpan_Container() {
		return xContainerToContainerRuleEClass.getEOperations().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getXContainerToContainerRule__Perform_BWD__IsApplicableMatch() {
		return xContainerToContainerRuleEClass.getEOperations().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getXContainerToContainerRule__IsApplicable_BWD__Match() {
		return xContainerToContainerRuleEClass.getEOperations().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getXContainerToContainerRule__RegisterObjectsToMatch_BWD__Match_NetworkSpan_Container() {
		return xContainerToContainerRuleEClass.getEOperations().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getXContainerToContainerRule__IsAppropriate_solveCsp_BWD__Match_NetworkSpan_Container() {
		return xContainerToContainerRuleEClass.getEOperations().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getXContainerToContainerRule__IsAppropriate_checkCsp_BWD__CSP() {
		return xContainerToContainerRuleEClass.getEOperations().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getXContainerToContainerRule__IsApplicable_solveCsp_BWD__IsApplicableMatch_NetworkSpan_Container() {
		return xContainerToContainerRuleEClass.getEOperations().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getXContainerToContainerRule__IsApplicable_checkCsp_BWD__CSP() {
		return xContainerToContainerRuleEClass.getEOperations().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getXContainerToContainerRule__RegisterObjects_BWD__PerformRuleResult_EObject_EObject_EObject_EObject() {
		return xContainerToContainerRuleEClass.getEOperations().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getXContainerToContainerRule__CheckTypes_BWD__Match() {
		return xContainerToContainerRuleEClass.getEOperations().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getXContainerToContainerRule__IsAppropriate_FWD_XContainer_0__XContainer() {
		return xContainerToContainerRuleEClass.getEOperations().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getXContainerToContainerRule__IsAppropriate_BWD_EMoflonEdge_7__EMoflonEdge() {
		return xContainerToContainerRuleEClass.getEOperations().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getXContainerToContainerRule__CheckAttributes_FWD__TripleMatch() {
		return xContainerToContainerRuleEClass.getEOperations().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getXContainerToContainerRule__CheckAttributes_BWD__TripleMatch() {
		return xContainerToContainerRuleEClass.getEOperations().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getXContainerToContainerRule__IsApplicable_CC__Match_Match() {
		return xContainerToContainerRuleEClass.getEOperations().get(24);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getXContainerToContainerRule__IsApplicable_solveCsp_CC__XContainer_NetworkSpan_Container_Match_Match() {
		return xContainerToContainerRuleEClass.getEOperations().get(25);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getXContainerToContainerRule__IsApplicable_checkCsp_CC__CSP() {
		return xContainerToContainerRuleEClass.getEOperations().get(26);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getXContainerToContainerRule__CheckDEC_FWD__XContainer() {
		return xContainerToContainerRuleEClass.getEOperations().get(27);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getXContainerToContainerRule__CheckDEC_BWD__NetworkSpan_Container() {
		return xContainerToContainerRuleEClass.getEOperations().get(28);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getXContainerToContainerRule__GenerateModel__RuleEntryContainer() {
		return xContainerToContainerRuleEClass.getEOperations().get(29);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getXContainerToContainerRule__GenerateModel_solveCsp_BWD__IsApplicableMatch_ModelgeneratorRuleResult() {
		return xContainerToContainerRuleEClass.getEOperations().get(30);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getXContainerToContainerRule__GenerateModel_checkCsp_BWD__CSP() {
		return xContainerToContainerRuleEClass.getEOperations().get(31);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getXConsumerToConsumerRule() {
		return xConsumerToConsumerRuleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getXConsumerToConsumerRule__IsAppropriate_FWD__Match_XConsumer_XContainer() {
		return xConsumerToConsumerRuleEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getXConsumerToConsumerRule__Perform_FWD__IsApplicableMatch() {
		return xConsumerToConsumerRuleEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getXConsumerToConsumerRule__IsApplicable_FWD__Match() {
		return xConsumerToConsumerRuleEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getXConsumerToConsumerRule__RegisterObjectsToMatch_FWD__Match_XConsumer_XContainer() {
		return xConsumerToConsumerRuleEClass.getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getXConsumerToConsumerRule__IsAppropriate_solveCsp_FWD__Match_XConsumer_XContainer() {
		return xConsumerToConsumerRuleEClass.getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getXConsumerToConsumerRule__IsAppropriate_checkCsp_FWD__CSP() {
		return xConsumerToConsumerRuleEClass.getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getXConsumerToConsumerRule__IsApplicable_solveCsp_FWD__IsApplicableMatch_Container_XConsumer_XContainerToContainer_XContainer() {
		return xConsumerToConsumerRuleEClass.getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getXConsumerToConsumerRule__IsApplicable_checkCsp_FWD__CSP() {
		return xConsumerToConsumerRuleEClass.getEOperations().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getXConsumerToConsumerRule__RegisterObjects_FWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject() {
		return xConsumerToConsumerRuleEClass.getEOperations().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getXConsumerToConsumerRule__CheckTypes_FWD__Match() {
		return xConsumerToConsumerRuleEClass.getEOperations().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getXConsumerToConsumerRule__IsAppropriate_BWD__Match_Container_Consumer() {
		return xConsumerToConsumerRuleEClass.getEOperations().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getXConsumerToConsumerRule__Perform_BWD__IsApplicableMatch() {
		return xConsumerToConsumerRuleEClass.getEOperations().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getXConsumerToConsumerRule__IsApplicable_BWD__Match() {
		return xConsumerToConsumerRuleEClass.getEOperations().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getXConsumerToConsumerRule__RegisterObjectsToMatch_BWD__Match_Container_Consumer() {
		return xConsumerToConsumerRuleEClass.getEOperations().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getXConsumerToConsumerRule__IsAppropriate_solveCsp_BWD__Match_Container_Consumer() {
		return xConsumerToConsumerRuleEClass.getEOperations().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getXConsumerToConsumerRule__IsAppropriate_checkCsp_BWD__CSP() {
		return xConsumerToConsumerRuleEClass.getEOperations().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getXConsumerToConsumerRule__IsApplicable_solveCsp_BWD__IsApplicableMatch_Container_Consumer_XContainerToContainer_XContainer() {
		return xConsumerToConsumerRuleEClass.getEOperations().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getXConsumerToConsumerRule__IsApplicable_checkCsp_BWD__CSP() {
		return xConsumerToConsumerRuleEClass.getEOperations().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getXConsumerToConsumerRule__RegisterObjects_BWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject() {
		return xConsumerToConsumerRuleEClass.getEOperations().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getXConsumerToConsumerRule__CheckTypes_BWD__Match() {
		return xConsumerToConsumerRuleEClass.getEOperations().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getXConsumerToConsumerRule__IsAppropriate_BWD_EMoflonEdge_8__EMoflonEdge() {
		return xConsumerToConsumerRuleEClass.getEOperations().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getXConsumerToConsumerRule__IsAppropriate_FWD_EMoflonEdge_4__EMoflonEdge() {
		return xConsumerToConsumerRuleEClass.getEOperations().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getXConsumerToConsumerRule__CheckAttributes_FWD__TripleMatch() {
		return xConsumerToConsumerRuleEClass.getEOperations().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getXConsumerToConsumerRule__CheckAttributes_BWD__TripleMatch() {
		return xConsumerToConsumerRuleEClass.getEOperations().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getXConsumerToConsumerRule__IsApplicable_CC__Match_Match() {
		return xConsumerToConsumerRuleEClass.getEOperations().get(24);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getXConsumerToConsumerRule__IsApplicable_solveCsp_CC__Container_Consumer_XConsumer_XContainer_Match_Match() {
		return xConsumerToConsumerRuleEClass.getEOperations().get(25);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getXConsumerToConsumerRule__IsApplicable_checkCsp_CC__CSP() {
		return xConsumerToConsumerRuleEClass.getEOperations().get(26);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getXConsumerToConsumerRule__CheckDEC_FWD__XConsumer_XContainer() {
		return xConsumerToConsumerRuleEClass.getEOperations().get(27);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getXConsumerToConsumerRule__CheckDEC_BWD__Container_Consumer() {
		return xConsumerToConsumerRuleEClass.getEOperations().get(28);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getXConsumerToConsumerRule__GenerateModel__RuleEntryContainer_XContainerToContainer() {
		return xConsumerToConsumerRuleEClass.getEOperations().get(29);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getXConsumerToConsumerRule__GenerateModel_solveCsp_BWD__IsApplicableMatch_Container_XContainerToContainer_XContainer_ModelgeneratorRuleResult() {
		return xConsumerToConsumerRuleEClass.getEOperations().get(30);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getXConsumerToConsumerRule__GenerateModel_checkCsp_BWD__CSP() {
		return xConsumerToConsumerRuleEClass.getEOperations().get(31);
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
		xProviderToProviderRuleEClass = createEClass(XPROVIDER_TO_PROVIDER_RULE);
		createEOperation(xProviderToProviderRuleEClass,
				XPROVIDER_TO_PROVIDER_RULE___IS_APPROPRIATE_FWD__MATCH_XPROVIDER_XCONTAINER);
		createEOperation(xProviderToProviderRuleEClass, XPROVIDER_TO_PROVIDER_RULE___PERFORM_FWD__ISAPPLICABLEMATCH);
		createEOperation(xProviderToProviderRuleEClass, XPROVIDER_TO_PROVIDER_RULE___IS_APPLICABLE_FWD__MATCH);
		createEOperation(xProviderToProviderRuleEClass,
				XPROVIDER_TO_PROVIDER_RULE___REGISTER_OBJECTS_TO_MATCH_FWD__MATCH_XPROVIDER_XCONTAINER);
		createEOperation(xProviderToProviderRuleEClass,
				XPROVIDER_TO_PROVIDER_RULE___IS_APPROPRIATE_SOLVE_CSP_FWD__MATCH_XPROVIDER_XCONTAINER);
		createEOperation(xProviderToProviderRuleEClass, XPROVIDER_TO_PROVIDER_RULE___IS_APPROPRIATE_CHECK_CSP_FWD__CSP);
		createEOperation(xProviderToProviderRuleEClass,
				XPROVIDER_TO_PROVIDER_RULE___IS_APPLICABLE_SOLVE_CSP_FWD__ISAPPLICABLEMATCH_CONTAINER_XPROVIDER_XCONTAINERTOCONTAINER_XCONTAINER);
		createEOperation(xProviderToProviderRuleEClass, XPROVIDER_TO_PROVIDER_RULE___IS_APPLICABLE_CHECK_CSP_FWD__CSP);
		createEOperation(xProviderToProviderRuleEClass,
				XPROVIDER_TO_PROVIDER_RULE___REGISTER_OBJECTS_FWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT);
		createEOperation(xProviderToProviderRuleEClass, XPROVIDER_TO_PROVIDER_RULE___CHECK_TYPES_FWD__MATCH);
		createEOperation(xProviderToProviderRuleEClass,
				XPROVIDER_TO_PROVIDER_RULE___IS_APPROPRIATE_BWD__MATCH_CONTAINER_PROVIDER);
		createEOperation(xProviderToProviderRuleEClass, XPROVIDER_TO_PROVIDER_RULE___PERFORM_BWD__ISAPPLICABLEMATCH);
		createEOperation(xProviderToProviderRuleEClass, XPROVIDER_TO_PROVIDER_RULE___IS_APPLICABLE_BWD__MATCH);
		createEOperation(xProviderToProviderRuleEClass,
				XPROVIDER_TO_PROVIDER_RULE___REGISTER_OBJECTS_TO_MATCH_BWD__MATCH_CONTAINER_PROVIDER);
		createEOperation(xProviderToProviderRuleEClass,
				XPROVIDER_TO_PROVIDER_RULE___IS_APPROPRIATE_SOLVE_CSP_BWD__MATCH_CONTAINER_PROVIDER);
		createEOperation(xProviderToProviderRuleEClass, XPROVIDER_TO_PROVIDER_RULE___IS_APPROPRIATE_CHECK_CSP_BWD__CSP);
		createEOperation(xProviderToProviderRuleEClass,
				XPROVIDER_TO_PROVIDER_RULE___IS_APPLICABLE_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_CONTAINER_PROVIDER_XCONTAINERTOCONTAINER_XCONTAINER);
		createEOperation(xProviderToProviderRuleEClass, XPROVIDER_TO_PROVIDER_RULE___IS_APPLICABLE_CHECK_CSP_BWD__CSP);
		createEOperation(xProviderToProviderRuleEClass,
				XPROVIDER_TO_PROVIDER_RULE___REGISTER_OBJECTS_BWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT);
		createEOperation(xProviderToProviderRuleEClass, XPROVIDER_TO_PROVIDER_RULE___CHECK_TYPES_BWD__MATCH);
		createEOperation(xProviderToProviderRuleEClass,
				XPROVIDER_TO_PROVIDER_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_6__EMOFLONEDGE);
		createEOperation(xProviderToProviderRuleEClass,
				XPROVIDER_TO_PROVIDER_RULE___IS_APPROPRIATE_FWD_EMOFLON_EDGE_3__EMOFLONEDGE);
		createEOperation(xProviderToProviderRuleEClass, XPROVIDER_TO_PROVIDER_RULE___CHECK_ATTRIBUTES_FWD__TRIPLEMATCH);
		createEOperation(xProviderToProviderRuleEClass, XPROVIDER_TO_PROVIDER_RULE___CHECK_ATTRIBUTES_BWD__TRIPLEMATCH);
		createEOperation(xProviderToProviderRuleEClass, XPROVIDER_TO_PROVIDER_RULE___IS_APPLICABLE_CC__MATCH_MATCH);
		createEOperation(xProviderToProviderRuleEClass,
				XPROVIDER_TO_PROVIDER_RULE___IS_APPLICABLE_SOLVE_CSP_CC__CONTAINER_PROVIDER_XPROVIDER_XCONTAINER_MATCH_MATCH);
		createEOperation(xProviderToProviderRuleEClass, XPROVIDER_TO_PROVIDER_RULE___IS_APPLICABLE_CHECK_CSP_CC__CSP);
		createEOperation(xProviderToProviderRuleEClass,
				XPROVIDER_TO_PROVIDER_RULE___CHECK_DEC_FWD__XPROVIDER_XCONTAINER);
		createEOperation(xProviderToProviderRuleEClass, XPROVIDER_TO_PROVIDER_RULE___CHECK_DEC_BWD__CONTAINER_PROVIDER);
		createEOperation(xProviderToProviderRuleEClass,
				XPROVIDER_TO_PROVIDER_RULE___GENERATE_MODEL__RULEENTRYCONTAINER_XCONTAINERTOCONTAINER);
		createEOperation(xProviderToProviderRuleEClass,
				XPROVIDER_TO_PROVIDER_RULE___GENERATE_MODEL_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_CONTAINER_XCONTAINERTOCONTAINER_XCONTAINER_MODELGENERATORRULERESULT);
		createEOperation(xProviderToProviderRuleEClass, XPROVIDER_TO_PROVIDER_RULE___GENERATE_MODEL_CHECK_CSP_BWD__CSP);

		xAgentToAgentRuleEClass = createEClass(XAGENT_TO_AGENT_RULE);

		xContainerToContainerRuleEClass = createEClass(XCONTAINER_TO_CONTAINER_RULE);
		createEOperation(xContainerToContainerRuleEClass,
				XCONTAINER_TO_CONTAINER_RULE___IS_APPROPRIATE_FWD__MATCH_XCONTAINER);
		createEOperation(xContainerToContainerRuleEClass,
				XCONTAINER_TO_CONTAINER_RULE___PERFORM_FWD__ISAPPLICABLEMATCH);
		createEOperation(xContainerToContainerRuleEClass, XCONTAINER_TO_CONTAINER_RULE___IS_APPLICABLE_FWD__MATCH);
		createEOperation(xContainerToContainerRuleEClass,
				XCONTAINER_TO_CONTAINER_RULE___REGISTER_OBJECTS_TO_MATCH_FWD__MATCH_XCONTAINER);
		createEOperation(xContainerToContainerRuleEClass,
				XCONTAINER_TO_CONTAINER_RULE___IS_APPROPRIATE_SOLVE_CSP_FWD__MATCH_XCONTAINER);
		createEOperation(xContainerToContainerRuleEClass,
				XCONTAINER_TO_CONTAINER_RULE___IS_APPROPRIATE_CHECK_CSP_FWD__CSP);
		createEOperation(xContainerToContainerRuleEClass,
				XCONTAINER_TO_CONTAINER_RULE___IS_APPLICABLE_SOLVE_CSP_FWD__ISAPPLICABLEMATCH_XCONTAINER);
		createEOperation(xContainerToContainerRuleEClass,
				XCONTAINER_TO_CONTAINER_RULE___IS_APPLICABLE_CHECK_CSP_FWD__CSP);
		createEOperation(xContainerToContainerRuleEClass,
				XCONTAINER_TO_CONTAINER_RULE___REGISTER_OBJECTS_FWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT);
		createEOperation(xContainerToContainerRuleEClass, XCONTAINER_TO_CONTAINER_RULE___CHECK_TYPES_FWD__MATCH);
		createEOperation(xContainerToContainerRuleEClass,
				XCONTAINER_TO_CONTAINER_RULE___IS_APPROPRIATE_BWD__MATCH_NETWORKSPAN_CONTAINER);
		createEOperation(xContainerToContainerRuleEClass,
				XCONTAINER_TO_CONTAINER_RULE___PERFORM_BWD__ISAPPLICABLEMATCH);
		createEOperation(xContainerToContainerRuleEClass, XCONTAINER_TO_CONTAINER_RULE___IS_APPLICABLE_BWD__MATCH);
		createEOperation(xContainerToContainerRuleEClass,
				XCONTAINER_TO_CONTAINER_RULE___REGISTER_OBJECTS_TO_MATCH_BWD__MATCH_NETWORKSPAN_CONTAINER);
		createEOperation(xContainerToContainerRuleEClass,
				XCONTAINER_TO_CONTAINER_RULE___IS_APPROPRIATE_SOLVE_CSP_BWD__MATCH_NETWORKSPAN_CONTAINER);
		createEOperation(xContainerToContainerRuleEClass,
				XCONTAINER_TO_CONTAINER_RULE___IS_APPROPRIATE_CHECK_CSP_BWD__CSP);
		createEOperation(xContainerToContainerRuleEClass,
				XCONTAINER_TO_CONTAINER_RULE___IS_APPLICABLE_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_NETWORKSPAN_CONTAINER);
		createEOperation(xContainerToContainerRuleEClass,
				XCONTAINER_TO_CONTAINER_RULE___IS_APPLICABLE_CHECK_CSP_BWD__CSP);
		createEOperation(xContainerToContainerRuleEClass,
				XCONTAINER_TO_CONTAINER_RULE___REGISTER_OBJECTS_BWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT);
		createEOperation(xContainerToContainerRuleEClass, XCONTAINER_TO_CONTAINER_RULE___CHECK_TYPES_BWD__MATCH);
		createEOperation(xContainerToContainerRuleEClass,
				XCONTAINER_TO_CONTAINER_RULE___IS_APPROPRIATE_FWD_XCONTAINER_0__XCONTAINER);
		createEOperation(xContainerToContainerRuleEClass,
				XCONTAINER_TO_CONTAINER_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_7__EMOFLONEDGE);
		createEOperation(xContainerToContainerRuleEClass,
				XCONTAINER_TO_CONTAINER_RULE___CHECK_ATTRIBUTES_FWD__TRIPLEMATCH);
		createEOperation(xContainerToContainerRuleEClass,
				XCONTAINER_TO_CONTAINER_RULE___CHECK_ATTRIBUTES_BWD__TRIPLEMATCH);
		createEOperation(xContainerToContainerRuleEClass, XCONTAINER_TO_CONTAINER_RULE___IS_APPLICABLE_CC__MATCH_MATCH);
		createEOperation(xContainerToContainerRuleEClass,
				XCONTAINER_TO_CONTAINER_RULE___IS_APPLICABLE_SOLVE_CSP_CC__XCONTAINER_NETWORKSPAN_CONTAINER_MATCH_MATCH);
		createEOperation(xContainerToContainerRuleEClass,
				XCONTAINER_TO_CONTAINER_RULE___IS_APPLICABLE_CHECK_CSP_CC__CSP);
		createEOperation(xContainerToContainerRuleEClass, XCONTAINER_TO_CONTAINER_RULE___CHECK_DEC_FWD__XCONTAINER);
		createEOperation(xContainerToContainerRuleEClass,
				XCONTAINER_TO_CONTAINER_RULE___CHECK_DEC_BWD__NETWORKSPAN_CONTAINER);
		createEOperation(xContainerToContainerRuleEClass,
				XCONTAINER_TO_CONTAINER_RULE___GENERATE_MODEL__RULEENTRYCONTAINER);
		createEOperation(xContainerToContainerRuleEClass,
				XCONTAINER_TO_CONTAINER_RULE___GENERATE_MODEL_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_MODELGENERATORRULERESULT);
		createEOperation(xContainerToContainerRuleEClass,
				XCONTAINER_TO_CONTAINER_RULE___GENERATE_MODEL_CHECK_CSP_BWD__CSP);

		xConsumerToConsumerRuleEClass = createEClass(XCONSUMER_TO_CONSUMER_RULE);
		createEOperation(xConsumerToConsumerRuleEClass,
				XCONSUMER_TO_CONSUMER_RULE___IS_APPROPRIATE_FWD__MATCH_XCONSUMER_XCONTAINER);
		createEOperation(xConsumerToConsumerRuleEClass, XCONSUMER_TO_CONSUMER_RULE___PERFORM_FWD__ISAPPLICABLEMATCH);
		createEOperation(xConsumerToConsumerRuleEClass, XCONSUMER_TO_CONSUMER_RULE___IS_APPLICABLE_FWD__MATCH);
		createEOperation(xConsumerToConsumerRuleEClass,
				XCONSUMER_TO_CONSUMER_RULE___REGISTER_OBJECTS_TO_MATCH_FWD__MATCH_XCONSUMER_XCONTAINER);
		createEOperation(xConsumerToConsumerRuleEClass,
				XCONSUMER_TO_CONSUMER_RULE___IS_APPROPRIATE_SOLVE_CSP_FWD__MATCH_XCONSUMER_XCONTAINER);
		createEOperation(xConsumerToConsumerRuleEClass, XCONSUMER_TO_CONSUMER_RULE___IS_APPROPRIATE_CHECK_CSP_FWD__CSP);
		createEOperation(xConsumerToConsumerRuleEClass,
				XCONSUMER_TO_CONSUMER_RULE___IS_APPLICABLE_SOLVE_CSP_FWD__ISAPPLICABLEMATCH_CONTAINER_XCONSUMER_XCONTAINERTOCONTAINER_XCONTAINER);
		createEOperation(xConsumerToConsumerRuleEClass, XCONSUMER_TO_CONSUMER_RULE___IS_APPLICABLE_CHECK_CSP_FWD__CSP);
		createEOperation(xConsumerToConsumerRuleEClass,
				XCONSUMER_TO_CONSUMER_RULE___REGISTER_OBJECTS_FWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT);
		createEOperation(xConsumerToConsumerRuleEClass, XCONSUMER_TO_CONSUMER_RULE___CHECK_TYPES_FWD__MATCH);
		createEOperation(xConsumerToConsumerRuleEClass,
				XCONSUMER_TO_CONSUMER_RULE___IS_APPROPRIATE_BWD__MATCH_CONTAINER_CONSUMER);
		createEOperation(xConsumerToConsumerRuleEClass, XCONSUMER_TO_CONSUMER_RULE___PERFORM_BWD__ISAPPLICABLEMATCH);
		createEOperation(xConsumerToConsumerRuleEClass, XCONSUMER_TO_CONSUMER_RULE___IS_APPLICABLE_BWD__MATCH);
		createEOperation(xConsumerToConsumerRuleEClass,
				XCONSUMER_TO_CONSUMER_RULE___REGISTER_OBJECTS_TO_MATCH_BWD__MATCH_CONTAINER_CONSUMER);
		createEOperation(xConsumerToConsumerRuleEClass,
				XCONSUMER_TO_CONSUMER_RULE___IS_APPROPRIATE_SOLVE_CSP_BWD__MATCH_CONTAINER_CONSUMER);
		createEOperation(xConsumerToConsumerRuleEClass, XCONSUMER_TO_CONSUMER_RULE___IS_APPROPRIATE_CHECK_CSP_BWD__CSP);
		createEOperation(xConsumerToConsumerRuleEClass,
				XCONSUMER_TO_CONSUMER_RULE___IS_APPLICABLE_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_CONTAINER_CONSUMER_XCONTAINERTOCONTAINER_XCONTAINER);
		createEOperation(xConsumerToConsumerRuleEClass, XCONSUMER_TO_CONSUMER_RULE___IS_APPLICABLE_CHECK_CSP_BWD__CSP);
		createEOperation(xConsumerToConsumerRuleEClass,
				XCONSUMER_TO_CONSUMER_RULE___REGISTER_OBJECTS_BWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT);
		createEOperation(xConsumerToConsumerRuleEClass, XCONSUMER_TO_CONSUMER_RULE___CHECK_TYPES_BWD__MATCH);
		createEOperation(xConsumerToConsumerRuleEClass,
				XCONSUMER_TO_CONSUMER_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_8__EMOFLONEDGE);
		createEOperation(xConsumerToConsumerRuleEClass,
				XCONSUMER_TO_CONSUMER_RULE___IS_APPROPRIATE_FWD_EMOFLON_EDGE_4__EMOFLONEDGE);
		createEOperation(xConsumerToConsumerRuleEClass, XCONSUMER_TO_CONSUMER_RULE___CHECK_ATTRIBUTES_FWD__TRIPLEMATCH);
		createEOperation(xConsumerToConsumerRuleEClass, XCONSUMER_TO_CONSUMER_RULE___CHECK_ATTRIBUTES_BWD__TRIPLEMATCH);
		createEOperation(xConsumerToConsumerRuleEClass, XCONSUMER_TO_CONSUMER_RULE___IS_APPLICABLE_CC__MATCH_MATCH);
		createEOperation(xConsumerToConsumerRuleEClass,
				XCONSUMER_TO_CONSUMER_RULE___IS_APPLICABLE_SOLVE_CSP_CC__CONTAINER_CONSUMER_XCONSUMER_XCONTAINER_MATCH_MATCH);
		createEOperation(xConsumerToConsumerRuleEClass, XCONSUMER_TO_CONSUMER_RULE___IS_APPLICABLE_CHECK_CSP_CC__CSP);
		createEOperation(xConsumerToConsumerRuleEClass,
				XCONSUMER_TO_CONSUMER_RULE___CHECK_DEC_FWD__XCONSUMER_XCONTAINER);
		createEOperation(xConsumerToConsumerRuleEClass, XCONSUMER_TO_CONSUMER_RULE___CHECK_DEC_BWD__CONTAINER_CONSUMER);
		createEOperation(xConsumerToConsumerRuleEClass,
				XCONSUMER_TO_CONSUMER_RULE___GENERATE_MODEL__RULEENTRYCONTAINER_XCONTAINERTOCONTAINER);
		createEOperation(xConsumerToConsumerRuleEClass,
				XCONSUMER_TO_CONSUMER_RULE___GENERATE_MODEL_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_CONTAINER_XCONTAINERTOCONTAINER_XCONTAINER_MODELGENERATORRULERESULT);
		createEOperation(xConsumerToConsumerRuleEClass, XCONSUMER_TO_CONSUMER_RULE___GENERATE_MODEL_CHECK_CSP_BWD__CSP);
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
		RuntimePackage theRuntimePackage = (RuntimePackage) EPackage.Registry.INSTANCE
				.getEPackage(RuntimePackage.eNS_URI);
		ReqXtextPackage theReqXtextPackage = (ReqXtextPackage) EPackage.Registry.INSTANCE
				.getEPackage(ReqXtextPackage.eNS_URI);
		CspPackage theCspPackage = (CspPackage) EPackage.Registry.INSTANCE.getEPackage(CspPackage.eNS_URI);
		RequirementsPackage theRequirementsPackage = (RequirementsPackage) EPackage.Registry.INSTANCE
				.getEPackage(RequirementsPackage.eNS_URI);
		RequirementsTransformatorPackage theRequirementsTransformatorPackage = (RequirementsTransformatorPackage) EPackage.Registry.INSTANCE
				.getEPackage(RequirementsTransformatorPackage.eNS_URI);
		ModelgeneratorPackage theModelgeneratorPackage = (ModelgeneratorPackage) EPackage.Registry.INSTANCE
				.getEPackage(ModelgeneratorPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		xProviderToProviderRuleEClass.getESuperTypes().add(theRuntimePackage.getAbstractRule());
		xAgentToAgentRuleEClass.getESuperTypes().add(theRuntimePackage.getAbstractRule());
		xContainerToContainerRuleEClass.getESuperTypes().add(theRuntimePackage.getAbstractRule());
		xConsumerToConsumerRuleEClass.getESuperTypes().add(theRuntimePackage.getAbstractRule());

		// Initialize classes, features, and operations; add parameters
		initEClass(xProviderToProviderRuleEClass, XProviderToProviderRule.class, "XProviderToProviderRule",
				!IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		EOperation op = initEOperation(getXProviderToProviderRule__IsAppropriate_FWD__Match_XProvider_XContainer(),
				ecorePackage.getEBoolean(), "isAppropriate_FWD", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theRuntimePackage.getMatch(), "match", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theReqXtextPackage.getXProvider(), "xAgent", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theReqXtextPackage.getXContainer(), "xContainer", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getXProviderToProviderRule__Perform_FWD__IsApplicableMatch(),
				theRuntimePackage.getPerformRuleResult(), "perform_FWD", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theRuntimePackage.getIsApplicableMatch(), "isApplicableMatch", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getXProviderToProviderRule__IsApplicable_FWD__Match(),
				theRuntimePackage.getIsApplicableRuleResult(), "isApplicable_FWD", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theRuntimePackage.getMatch(), "match", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getXProviderToProviderRule__RegisterObjectsToMatch_FWD__Match_XProvider_XContainer(), null,
				"registerObjectsToMatch_FWD", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theRuntimePackage.getMatch(), "match", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theReqXtextPackage.getXProvider(), "xAgent", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theReqXtextPackage.getXContainer(), "xContainer", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getXProviderToProviderRule__IsAppropriate_solveCsp_FWD__Match_XProvider_XContainer(),
				theCspPackage.getCSP(), "isAppropriate_solveCsp_FWD", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theRuntimePackage.getMatch(), "match", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theReqXtextPackage.getXProvider(), "xAgent", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theReqXtextPackage.getXContainer(), "xContainer", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getXProviderToProviderRule__IsAppropriate_checkCsp_FWD__CSP(), ecorePackage.getEBoolean(),
				"isAppropriate_checkCsp_FWD", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theCspPackage.getCSP(), "csp", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(
				getXProviderToProviderRule__IsApplicable_solveCsp_FWD__IsApplicableMatch_Container_XProvider_XContainerToContainer_XContainer(),
				theCspPackage.getCSP(), "isApplicable_solveCsp_FWD", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theRuntimePackage.getIsApplicableMatch(), "isApplicableMatch", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theRequirementsPackage.getContainer(), "container", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theReqXtextPackage.getXProvider(), "xAgent", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theRequirementsTransformatorPackage.getXContainerToContainer(), "xContainerToContainer", 0, 1,
				IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theReqXtextPackage.getXContainer(), "xContainer", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getXProviderToProviderRule__IsApplicable_checkCsp_FWD__CSP(), ecorePackage.getEBoolean(),
				"isApplicable_checkCsp_FWD", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theCspPackage.getCSP(), "csp", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(
				getXProviderToProviderRule__RegisterObjects_FWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject(),
				null, "registerObjects_FWD", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theRuntimePackage.getPerformRuleResult(), "ruleresult", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEObject(), "xAgentToAgent", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEObject(), "container", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEObject(), "agent", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEObject(), "xAgent", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEObject(), "xContainerToContainer", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEObject(), "xContainer", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getXProviderToProviderRule__CheckTypes_FWD__Match(), ecorePackage.getEBoolean(),
				"checkTypes_FWD", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theRuntimePackage.getMatch(), "match", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getXProviderToProviderRule__IsAppropriate_BWD__Match_Container_Provider(),
				ecorePackage.getEBoolean(), "isAppropriate_BWD", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theRuntimePackage.getMatch(), "match", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theRequirementsPackage.getContainer(), "container", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theRequirementsPackage.getProvider(), "agent", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getXProviderToProviderRule__Perform_BWD__IsApplicableMatch(),
				theRuntimePackage.getPerformRuleResult(), "perform_BWD", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theRuntimePackage.getIsApplicableMatch(), "isApplicableMatch", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getXProviderToProviderRule__IsApplicable_BWD__Match(),
				theRuntimePackage.getIsApplicableRuleResult(), "isApplicable_BWD", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theRuntimePackage.getMatch(), "match", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getXProviderToProviderRule__RegisterObjectsToMatch_BWD__Match_Container_Provider(), null,
				"registerObjectsToMatch_BWD", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theRuntimePackage.getMatch(), "match", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theRequirementsPackage.getContainer(), "container", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theRequirementsPackage.getProvider(), "agent", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getXProviderToProviderRule__IsAppropriate_solveCsp_BWD__Match_Container_Provider(),
				theCspPackage.getCSP(), "isAppropriate_solveCsp_BWD", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theRuntimePackage.getMatch(), "match", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theRequirementsPackage.getContainer(), "container", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theRequirementsPackage.getProvider(), "agent", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getXProviderToProviderRule__IsAppropriate_checkCsp_BWD__CSP(), ecorePackage.getEBoolean(),
				"isAppropriate_checkCsp_BWD", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theCspPackage.getCSP(), "csp", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(
				getXProviderToProviderRule__IsApplicable_solveCsp_BWD__IsApplicableMatch_Container_Provider_XContainerToContainer_XContainer(),
				theCspPackage.getCSP(), "isApplicable_solveCsp_BWD", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theRuntimePackage.getIsApplicableMatch(), "isApplicableMatch", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theRequirementsPackage.getContainer(), "container", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theRequirementsPackage.getProvider(), "agent", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theRequirementsTransformatorPackage.getXContainerToContainer(), "xContainerToContainer", 0, 1,
				IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theReqXtextPackage.getXContainer(), "xContainer", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getXProviderToProviderRule__IsApplicable_checkCsp_BWD__CSP(), ecorePackage.getEBoolean(),
				"isApplicable_checkCsp_BWD", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theCspPackage.getCSP(), "csp", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(
				getXProviderToProviderRule__RegisterObjects_BWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject(),
				null, "registerObjects_BWD", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theRuntimePackage.getPerformRuleResult(), "ruleresult", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEObject(), "xAgentToAgent", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEObject(), "container", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEObject(), "agent", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEObject(), "xAgent", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEObject(), "xContainerToContainer", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEObject(), "xContainer", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getXProviderToProviderRule__CheckTypes_BWD__Match(), ecorePackage.getEBoolean(),
				"checkTypes_BWD", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theRuntimePackage.getMatch(), "match", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getXProviderToProviderRule__IsAppropriate_BWD_EMoflonEdge_6__EMoflonEdge(),
				theRuntimePackage.getEObjectContainer(), "isAppropriate_BWD_EMoflonEdge_6", 0, 1, IS_UNIQUE,
				IS_ORDERED);
		addEParameter(op, theRuntimePackage.getEMoflonEdge(), "_edge_agents", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getXProviderToProviderRule__IsAppropriate_FWD_EMoflonEdge_3__EMoflonEdge(),
				theRuntimePackage.getEObjectContainer(), "isAppropriate_FWD_EMoflonEdge_3", 0, 1, IS_UNIQUE,
				IS_ORDERED);
		addEParameter(op, theRuntimePackage.getEMoflonEdge(), "_edge_agents", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getXProviderToProviderRule__CheckAttributes_FWD__TripleMatch(),
				theRuntimePackage.getAttributeConstraintsRuleResult(), "checkAttributes_FWD", 0, 1, IS_UNIQUE,
				IS_ORDERED);
		addEParameter(op, theRuntimePackage.getTripleMatch(), "__tripleMatch", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getXProviderToProviderRule__CheckAttributes_BWD__TripleMatch(),
				theRuntimePackage.getAttributeConstraintsRuleResult(), "checkAttributes_BWD", 0, 1, IS_UNIQUE,
				IS_ORDERED);
		addEParameter(op, theRuntimePackage.getTripleMatch(), "__tripleMatch", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getXProviderToProviderRule__IsApplicable_CC__Match_Match(),
				theRuntimePackage.getIsApplicableRuleResult(), "isApplicable_CC", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theRuntimePackage.getMatch(), "sourceMatch", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theRuntimePackage.getMatch(), "targetMatch", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(
				getXProviderToProviderRule__IsApplicable_solveCsp_CC__Container_Provider_XProvider_XContainer_Match_Match(),
				theCspPackage.getCSP(), "isApplicable_solveCsp_CC", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theRequirementsPackage.getContainer(), "container", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theRequirementsPackage.getProvider(), "agent", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theReqXtextPackage.getXProvider(), "xAgent", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theReqXtextPackage.getXContainer(), "xContainer", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theRuntimePackage.getMatch(), "sourceMatch", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theRuntimePackage.getMatch(), "targetMatch", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getXProviderToProviderRule__IsApplicable_checkCsp_CC__CSP(), ecorePackage.getEBoolean(),
				"isApplicable_checkCsp_CC", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theCspPackage.getCSP(), "csp", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getXProviderToProviderRule__CheckDEC_FWD__XProvider_XContainer(),
				ecorePackage.getEBoolean(), "checkDEC_FWD", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theReqXtextPackage.getXProvider(), "xAgent", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theReqXtextPackage.getXContainer(), "xContainer", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getXProviderToProviderRule__CheckDEC_BWD__Container_Provider(), ecorePackage.getEBoolean(),
				"checkDEC_BWD", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theRequirementsPackage.getContainer(), "container", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theRequirementsPackage.getProvider(), "agent", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getXProviderToProviderRule__GenerateModel__RuleEntryContainer_XContainerToContainer(),
				theRuntimePackage.getModelgeneratorRuleResult(), "generateModel", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theModelgeneratorPackage.getRuleEntryContainer(), "ruleEntryContainer", 0, 1, IS_UNIQUE,
				IS_ORDERED);
		addEParameter(op, theRequirementsTransformatorPackage.getXContainerToContainer(),
				"xContainerToContainerParameter", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(
				getXProviderToProviderRule__GenerateModel_solveCsp_BWD__IsApplicableMatch_Container_XContainerToContainer_XContainer_ModelgeneratorRuleResult(),
				theCspPackage.getCSP(), "generateModel_solveCsp_BWD", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theRuntimePackage.getIsApplicableMatch(), "isApplicableMatch", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theRequirementsPackage.getContainer(), "container", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theRequirementsTransformatorPackage.getXContainerToContainer(), "xContainerToContainer", 0, 1,
				IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theReqXtextPackage.getXContainer(), "xContainer", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theRuntimePackage.getModelgeneratorRuleResult(), "ruleResult", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getXProviderToProviderRule__GenerateModel_checkCsp_BWD__CSP(), ecorePackage.getEBoolean(),
				"generateModel_checkCsp_BWD", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theCspPackage.getCSP(), "csp", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(xAgentToAgentRuleEClass, XAgentToAgentRule.class, "XAgentToAgentRule", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(xContainerToContainerRuleEClass, XContainerToContainerRule.class, "XContainerToContainerRule",
				!IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = initEOperation(getXContainerToContainerRule__IsAppropriate_FWD__Match_XContainer(),
				ecorePackage.getEBoolean(), "isAppropriate_FWD", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theRuntimePackage.getMatch(), "match", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theReqXtextPackage.getXContainer(), "xContainer", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getXContainerToContainerRule__Perform_FWD__IsApplicableMatch(),
				theRuntimePackage.getPerformRuleResult(), "perform_FWD", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theRuntimePackage.getIsApplicableMatch(), "isApplicableMatch", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getXContainerToContainerRule__IsApplicable_FWD__Match(),
				theRuntimePackage.getIsApplicableRuleResult(), "isApplicable_FWD", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theRuntimePackage.getMatch(), "match", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getXContainerToContainerRule__RegisterObjectsToMatch_FWD__Match_XContainer(), null,
				"registerObjectsToMatch_FWD", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theRuntimePackage.getMatch(), "match", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theReqXtextPackage.getXContainer(), "xContainer", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getXContainerToContainerRule__IsAppropriate_solveCsp_FWD__Match_XContainer(),
				theCspPackage.getCSP(), "isAppropriate_solveCsp_FWD", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theRuntimePackage.getMatch(), "match", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theReqXtextPackage.getXContainer(), "xContainer", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getXContainerToContainerRule__IsAppropriate_checkCsp_FWD__CSP(), ecorePackage.getEBoolean(),
				"isAppropriate_checkCsp_FWD", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theCspPackage.getCSP(), "csp", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getXContainerToContainerRule__IsApplicable_solveCsp_FWD__IsApplicableMatch_XContainer(),
				theCspPackage.getCSP(), "isApplicable_solveCsp_FWD", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theRuntimePackage.getIsApplicableMatch(), "isApplicableMatch", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theReqXtextPackage.getXContainer(), "xContainer", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getXContainerToContainerRule__IsApplicable_checkCsp_FWD__CSP(), ecorePackage.getEBoolean(),
				"isApplicable_checkCsp_FWD", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theCspPackage.getCSP(), "csp", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(
				getXContainerToContainerRule__RegisterObjects_FWD__PerformRuleResult_EObject_EObject_EObject_EObject(),
				null, "registerObjects_FWD", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theRuntimePackage.getPerformRuleResult(), "ruleresult", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEObject(), "xContainer", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEObject(), "xContainerToContainer", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEObject(), "virtualNode", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEObject(), "container", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getXContainerToContainerRule__CheckTypes_FWD__Match(), ecorePackage.getEBoolean(),
				"checkTypes_FWD", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theRuntimePackage.getMatch(), "match", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getXContainerToContainerRule__IsAppropriate_BWD__Match_NetworkSpan_Container(),
				ecorePackage.getEBoolean(), "isAppropriate_BWD", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theRuntimePackage.getMatch(), "match", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theRequirementsPackage.getNetworkSpan(), "virtualNode", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theRequirementsPackage.getContainer(), "container", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getXContainerToContainerRule__Perform_BWD__IsApplicableMatch(),
				theRuntimePackage.getPerformRuleResult(), "perform_BWD", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theRuntimePackage.getIsApplicableMatch(), "isApplicableMatch", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getXContainerToContainerRule__IsApplicable_BWD__Match(),
				theRuntimePackage.getIsApplicableRuleResult(), "isApplicable_BWD", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theRuntimePackage.getMatch(), "match", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getXContainerToContainerRule__RegisterObjectsToMatch_BWD__Match_NetworkSpan_Container(),
				null, "registerObjectsToMatch_BWD", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theRuntimePackage.getMatch(), "match", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theRequirementsPackage.getNetworkSpan(), "virtualNode", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theRequirementsPackage.getContainer(), "container", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getXContainerToContainerRule__IsAppropriate_solveCsp_BWD__Match_NetworkSpan_Container(),
				theCspPackage.getCSP(), "isAppropriate_solveCsp_BWD", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theRuntimePackage.getMatch(), "match", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theRequirementsPackage.getNetworkSpan(), "virtualNode", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theRequirementsPackage.getContainer(), "container", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getXContainerToContainerRule__IsAppropriate_checkCsp_BWD__CSP(), ecorePackage.getEBoolean(),
				"isAppropriate_checkCsp_BWD", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theCspPackage.getCSP(), "csp", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(
				getXContainerToContainerRule__IsApplicable_solveCsp_BWD__IsApplicableMatch_NetworkSpan_Container(),
				theCspPackage.getCSP(), "isApplicable_solveCsp_BWD", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theRuntimePackage.getIsApplicableMatch(), "isApplicableMatch", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theRequirementsPackage.getNetworkSpan(), "virtualNode", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theRequirementsPackage.getContainer(), "container", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getXContainerToContainerRule__IsApplicable_checkCsp_BWD__CSP(), ecorePackage.getEBoolean(),
				"isApplicable_checkCsp_BWD", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theCspPackage.getCSP(), "csp", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(
				getXContainerToContainerRule__RegisterObjects_BWD__PerformRuleResult_EObject_EObject_EObject_EObject(),
				null, "registerObjects_BWD", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theRuntimePackage.getPerformRuleResult(), "ruleresult", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEObject(), "xContainer", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEObject(), "xContainerToContainer", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEObject(), "virtualNode", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEObject(), "container", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getXContainerToContainerRule__CheckTypes_BWD__Match(), ecorePackage.getEBoolean(),
				"checkTypes_BWD", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theRuntimePackage.getMatch(), "match", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getXContainerToContainerRule__IsAppropriate_FWD_XContainer_0__XContainer(),
				theRuntimePackage.getEObjectContainer(), "isAppropriate_FWD_XContainer_0", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theReqXtextPackage.getXContainer(), "xContainer", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getXContainerToContainerRule__IsAppropriate_BWD_EMoflonEdge_7__EMoflonEdge(),
				theRuntimePackage.getEObjectContainer(), "isAppropriate_BWD_EMoflonEdge_7", 0, 1, IS_UNIQUE,
				IS_ORDERED);
		addEParameter(op, theRuntimePackage.getEMoflonEdge(), "_edge_networkSpan", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getXContainerToContainerRule__CheckAttributes_FWD__TripleMatch(),
				theRuntimePackage.getAttributeConstraintsRuleResult(), "checkAttributes_FWD", 0, 1, IS_UNIQUE,
				IS_ORDERED);
		addEParameter(op, theRuntimePackage.getTripleMatch(), "__tripleMatch", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getXContainerToContainerRule__CheckAttributes_BWD__TripleMatch(),
				theRuntimePackage.getAttributeConstraintsRuleResult(), "checkAttributes_BWD", 0, 1, IS_UNIQUE,
				IS_ORDERED);
		addEParameter(op, theRuntimePackage.getTripleMatch(), "__tripleMatch", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getXContainerToContainerRule__IsApplicable_CC__Match_Match(),
				theRuntimePackage.getIsApplicableRuleResult(), "isApplicable_CC", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theRuntimePackage.getMatch(), "sourceMatch", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theRuntimePackage.getMatch(), "targetMatch", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(
				getXContainerToContainerRule__IsApplicable_solveCsp_CC__XContainer_NetworkSpan_Container_Match_Match(),
				theCspPackage.getCSP(), "isApplicable_solveCsp_CC", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theReqXtextPackage.getXContainer(), "xContainer", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theRequirementsPackage.getNetworkSpan(), "virtualNode", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theRequirementsPackage.getContainer(), "container", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theRuntimePackage.getMatch(), "sourceMatch", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theRuntimePackage.getMatch(), "targetMatch", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getXContainerToContainerRule__IsApplicable_checkCsp_CC__CSP(), ecorePackage.getEBoolean(),
				"isApplicable_checkCsp_CC", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theCspPackage.getCSP(), "csp", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getXContainerToContainerRule__CheckDEC_FWD__XContainer(), ecorePackage.getEBoolean(),
				"checkDEC_FWD", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theReqXtextPackage.getXContainer(), "xContainer", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getXContainerToContainerRule__CheckDEC_BWD__NetworkSpan_Container(),
				ecorePackage.getEBoolean(), "checkDEC_BWD", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theRequirementsPackage.getNetworkSpan(), "virtualNode", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theRequirementsPackage.getContainer(), "container", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getXContainerToContainerRule__GenerateModel__RuleEntryContainer(),
				theRuntimePackage.getModelgeneratorRuleResult(), "generateModel", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theModelgeneratorPackage.getRuleEntryContainer(), "ruleEntryContainer", 0, 1, IS_UNIQUE,
				IS_ORDERED);

		op = initEOperation(
				getXContainerToContainerRule__GenerateModel_solveCsp_BWD__IsApplicableMatch_ModelgeneratorRuleResult(),
				theCspPackage.getCSP(), "generateModel_solveCsp_BWD", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theRuntimePackage.getIsApplicableMatch(), "isApplicableMatch", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theRuntimePackage.getModelgeneratorRuleResult(), "ruleResult", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getXContainerToContainerRule__GenerateModel_checkCsp_BWD__CSP(), ecorePackage.getEBoolean(),
				"generateModel_checkCsp_BWD", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theCspPackage.getCSP(), "csp", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(xConsumerToConsumerRuleEClass, XConsumerToConsumerRule.class, "XConsumerToConsumerRule",
				!IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = initEOperation(getXConsumerToConsumerRule__IsAppropriate_FWD__Match_XConsumer_XContainer(),
				ecorePackage.getEBoolean(), "isAppropriate_FWD", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theRuntimePackage.getMatch(), "match", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theReqXtextPackage.getXConsumer(), "xAgent", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theReqXtextPackage.getXContainer(), "xContainer", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getXConsumerToConsumerRule__Perform_FWD__IsApplicableMatch(),
				theRuntimePackage.getPerformRuleResult(), "perform_FWD", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theRuntimePackage.getIsApplicableMatch(), "isApplicableMatch", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getXConsumerToConsumerRule__IsApplicable_FWD__Match(),
				theRuntimePackage.getIsApplicableRuleResult(), "isApplicable_FWD", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theRuntimePackage.getMatch(), "match", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getXConsumerToConsumerRule__RegisterObjectsToMatch_FWD__Match_XConsumer_XContainer(), null,
				"registerObjectsToMatch_FWD", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theRuntimePackage.getMatch(), "match", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theReqXtextPackage.getXConsumer(), "xAgent", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theReqXtextPackage.getXContainer(), "xContainer", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getXConsumerToConsumerRule__IsAppropriate_solveCsp_FWD__Match_XConsumer_XContainer(),
				theCspPackage.getCSP(), "isAppropriate_solveCsp_FWD", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theRuntimePackage.getMatch(), "match", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theReqXtextPackage.getXConsumer(), "xAgent", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theReqXtextPackage.getXContainer(), "xContainer", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getXConsumerToConsumerRule__IsAppropriate_checkCsp_FWD__CSP(), ecorePackage.getEBoolean(),
				"isAppropriate_checkCsp_FWD", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theCspPackage.getCSP(), "csp", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(
				getXConsumerToConsumerRule__IsApplicable_solveCsp_FWD__IsApplicableMatch_Container_XConsumer_XContainerToContainer_XContainer(),
				theCspPackage.getCSP(), "isApplicable_solveCsp_FWD", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theRuntimePackage.getIsApplicableMatch(), "isApplicableMatch", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theRequirementsPackage.getContainer(), "container", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theReqXtextPackage.getXConsumer(), "xAgent", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theRequirementsTransformatorPackage.getXContainerToContainer(), "xContainerToContainer", 0, 1,
				IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theReqXtextPackage.getXContainer(), "xContainer", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getXConsumerToConsumerRule__IsApplicable_checkCsp_FWD__CSP(), ecorePackage.getEBoolean(),
				"isApplicable_checkCsp_FWD", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theCspPackage.getCSP(), "csp", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(
				getXConsumerToConsumerRule__RegisterObjects_FWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject(),
				null, "registerObjects_FWD", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theRuntimePackage.getPerformRuleResult(), "ruleresult", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEObject(), "xAgentToAgent", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEObject(), "container", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEObject(), "agent", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEObject(), "xAgent", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEObject(), "xContainerToContainer", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEObject(), "xContainer", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getXConsumerToConsumerRule__CheckTypes_FWD__Match(), ecorePackage.getEBoolean(),
				"checkTypes_FWD", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theRuntimePackage.getMatch(), "match", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getXConsumerToConsumerRule__IsAppropriate_BWD__Match_Container_Consumer(),
				ecorePackage.getEBoolean(), "isAppropriate_BWD", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theRuntimePackage.getMatch(), "match", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theRequirementsPackage.getContainer(), "container", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theRequirementsPackage.getConsumer(), "agent", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getXConsumerToConsumerRule__Perform_BWD__IsApplicableMatch(),
				theRuntimePackage.getPerformRuleResult(), "perform_BWD", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theRuntimePackage.getIsApplicableMatch(), "isApplicableMatch", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getXConsumerToConsumerRule__IsApplicable_BWD__Match(),
				theRuntimePackage.getIsApplicableRuleResult(), "isApplicable_BWD", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theRuntimePackage.getMatch(), "match", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getXConsumerToConsumerRule__RegisterObjectsToMatch_BWD__Match_Container_Consumer(), null,
				"registerObjectsToMatch_BWD", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theRuntimePackage.getMatch(), "match", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theRequirementsPackage.getContainer(), "container", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theRequirementsPackage.getConsumer(), "agent", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getXConsumerToConsumerRule__IsAppropriate_solveCsp_BWD__Match_Container_Consumer(),
				theCspPackage.getCSP(), "isAppropriate_solveCsp_BWD", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theRuntimePackage.getMatch(), "match", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theRequirementsPackage.getContainer(), "container", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theRequirementsPackage.getConsumer(), "agent", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getXConsumerToConsumerRule__IsAppropriate_checkCsp_BWD__CSP(), ecorePackage.getEBoolean(),
				"isAppropriate_checkCsp_BWD", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theCspPackage.getCSP(), "csp", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(
				getXConsumerToConsumerRule__IsApplicable_solveCsp_BWD__IsApplicableMatch_Container_Consumer_XContainerToContainer_XContainer(),
				theCspPackage.getCSP(), "isApplicable_solveCsp_BWD", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theRuntimePackage.getIsApplicableMatch(), "isApplicableMatch", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theRequirementsPackage.getContainer(), "container", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theRequirementsPackage.getConsumer(), "agent", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theRequirementsTransformatorPackage.getXContainerToContainer(), "xContainerToContainer", 0, 1,
				IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theReqXtextPackage.getXContainer(), "xContainer", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getXConsumerToConsumerRule__IsApplicable_checkCsp_BWD__CSP(), ecorePackage.getEBoolean(),
				"isApplicable_checkCsp_BWD", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theCspPackage.getCSP(), "csp", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(
				getXConsumerToConsumerRule__RegisterObjects_BWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject(),
				null, "registerObjects_BWD", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theRuntimePackage.getPerformRuleResult(), "ruleresult", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEObject(), "xAgentToAgent", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEObject(), "container", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEObject(), "agent", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEObject(), "xAgent", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEObject(), "xContainerToContainer", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEObject(), "xContainer", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getXConsumerToConsumerRule__CheckTypes_BWD__Match(), ecorePackage.getEBoolean(),
				"checkTypes_BWD", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theRuntimePackage.getMatch(), "match", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getXConsumerToConsumerRule__IsAppropriate_BWD_EMoflonEdge_8__EMoflonEdge(),
				theRuntimePackage.getEObjectContainer(), "isAppropriate_BWD_EMoflonEdge_8", 0, 1, IS_UNIQUE,
				IS_ORDERED);
		addEParameter(op, theRuntimePackage.getEMoflonEdge(), "_edge_agents", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getXConsumerToConsumerRule__IsAppropriate_FWD_EMoflonEdge_4__EMoflonEdge(),
				theRuntimePackage.getEObjectContainer(), "isAppropriate_FWD_EMoflonEdge_4", 0, 1, IS_UNIQUE,
				IS_ORDERED);
		addEParameter(op, theRuntimePackage.getEMoflonEdge(), "_edge_agents", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getXConsumerToConsumerRule__CheckAttributes_FWD__TripleMatch(),
				theRuntimePackage.getAttributeConstraintsRuleResult(), "checkAttributes_FWD", 0, 1, IS_UNIQUE,
				IS_ORDERED);
		addEParameter(op, theRuntimePackage.getTripleMatch(), "__tripleMatch", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getXConsumerToConsumerRule__CheckAttributes_BWD__TripleMatch(),
				theRuntimePackage.getAttributeConstraintsRuleResult(), "checkAttributes_BWD", 0, 1, IS_UNIQUE,
				IS_ORDERED);
		addEParameter(op, theRuntimePackage.getTripleMatch(), "__tripleMatch", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getXConsumerToConsumerRule__IsApplicable_CC__Match_Match(),
				theRuntimePackage.getIsApplicableRuleResult(), "isApplicable_CC", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theRuntimePackage.getMatch(), "sourceMatch", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theRuntimePackage.getMatch(), "targetMatch", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(
				getXConsumerToConsumerRule__IsApplicable_solveCsp_CC__Container_Consumer_XConsumer_XContainer_Match_Match(),
				theCspPackage.getCSP(), "isApplicable_solveCsp_CC", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theRequirementsPackage.getContainer(), "container", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theRequirementsPackage.getConsumer(), "agent", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theReqXtextPackage.getXConsumer(), "xAgent", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theReqXtextPackage.getXContainer(), "xContainer", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theRuntimePackage.getMatch(), "sourceMatch", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theRuntimePackage.getMatch(), "targetMatch", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getXConsumerToConsumerRule__IsApplicable_checkCsp_CC__CSP(), ecorePackage.getEBoolean(),
				"isApplicable_checkCsp_CC", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theCspPackage.getCSP(), "csp", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getXConsumerToConsumerRule__CheckDEC_FWD__XConsumer_XContainer(),
				ecorePackage.getEBoolean(), "checkDEC_FWD", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theReqXtextPackage.getXConsumer(), "xAgent", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theReqXtextPackage.getXContainer(), "xContainer", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getXConsumerToConsumerRule__CheckDEC_BWD__Container_Consumer(), ecorePackage.getEBoolean(),
				"checkDEC_BWD", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theRequirementsPackage.getContainer(), "container", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theRequirementsPackage.getConsumer(), "agent", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getXConsumerToConsumerRule__GenerateModel__RuleEntryContainer_XContainerToContainer(),
				theRuntimePackage.getModelgeneratorRuleResult(), "generateModel", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theModelgeneratorPackage.getRuleEntryContainer(), "ruleEntryContainer", 0, 1, IS_UNIQUE,
				IS_ORDERED);
		addEParameter(op, theRequirementsTransformatorPackage.getXContainerToContainer(),
				"xContainerToContainerParameter", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(
				getXConsumerToConsumerRule__GenerateModel_solveCsp_BWD__IsApplicableMatch_Container_XContainerToContainer_XContainer_ModelgeneratorRuleResult(),
				theCspPackage.getCSP(), "generateModel_solveCsp_BWD", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theRuntimePackage.getIsApplicableMatch(), "isApplicableMatch", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theRequirementsPackage.getContainer(), "container", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theRequirementsTransformatorPackage.getXContainerToContainer(), "xContainerToContainer", 0, 1,
				IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theReqXtextPackage.getXContainer(), "xContainer", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theRuntimePackage.getModelgeneratorRuleResult(), "ruleResult", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getXConsumerToConsumerRule__GenerateModel_checkCsp_BWD__CSP(), ecorePackage.getEBoolean(),
				"generateModel_checkCsp_BWD", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theCspPackage.getCSP(), "csp", 0, 1, IS_UNIQUE, IS_ORDERED);
	}

} //RulesPackageImpl
