/**
 */
package RequirementsTransformator.Rules;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;

import org.moflon.tgg.runtime.RuntimePackage;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see RequirementsTransformator.Rules.RulesFactory
 * @model kind="package"
 * @generated
 */
public interface RulesPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "Rules";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "platform:/plugin/RequirementsTransformator/model/RequirementsTransformator.ecore#//Rules";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "Rules";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	RulesPackage eINSTANCE = RequirementsTransformator.Rules.impl.RulesPackageImpl.init();

	/**
	 * The meta object id for the '{@link RequirementsTransformator.Rules.impl.XAgentToAgentRuleImpl <em>XAgent To Agent Rule</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see RequirementsTransformator.Rules.impl.XAgentToAgentRuleImpl
	 * @see RequirementsTransformator.Rules.impl.RulesPackageImpl#getXAgentToAgentRule()
	 * @generated
	 */
	int XAGENT_TO_AGENT_RULE = 0;

	/**
	 * The number of structural features of the '<em>XAgent To Agent Rule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XAGENT_TO_AGENT_RULE_FEATURE_COUNT = RuntimePackage.ABSTRACT_RULE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>XAgent To Agent Rule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XAGENT_TO_AGENT_RULE_OPERATION_COUNT = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link RequirementsTransformator.Rules.impl.XContainerToContainerRuleImpl <em>XContainer To Container Rule</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see RequirementsTransformator.Rules.impl.XContainerToContainerRuleImpl
	 * @see RequirementsTransformator.Rules.impl.RulesPackageImpl#getXContainerToContainerRule()
	 * @generated
	 */
	int XCONTAINER_TO_CONTAINER_RULE = 1;

	/**
	 * The number of structural features of the '<em>XContainer To Container Rule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XCONTAINER_TO_CONTAINER_RULE_FEATURE_COUNT = RuntimePackage.ABSTRACT_RULE_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Is Appropriate FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XCONTAINER_TO_CONTAINER_RULE___IS_APPROPRIATE_FWD__MATCH_XCONTAINER = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 0;

	/**
	 * The operation id for the '<em>Perform FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XCONTAINER_TO_CONTAINER_RULE___PERFORM_FWD__ISAPPLICABLEMATCH = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 1;

	/**
	 * The operation id for the '<em>Is Applicable FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XCONTAINER_TO_CONTAINER_RULE___IS_APPLICABLE_FWD__MATCH = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 2;

	/**
	 * The operation id for the '<em>Register Objects To Match FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XCONTAINER_TO_CONTAINER_RULE___REGISTER_OBJECTS_TO_MATCH_FWD__MATCH_XCONTAINER = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 3;

	/**
	 * The operation id for the '<em>Is Appropriate solve Csp FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XCONTAINER_TO_CONTAINER_RULE___IS_APPROPRIATE_SOLVE_CSP_FWD__MATCH_XCONTAINER = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 4;

	/**
	 * The operation id for the '<em>Is Appropriate check Csp FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XCONTAINER_TO_CONTAINER_RULE___IS_APPROPRIATE_CHECK_CSP_FWD__CSP = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 5;

	/**
	 * The operation id for the '<em>Is Applicable solve Csp FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XCONTAINER_TO_CONTAINER_RULE___IS_APPLICABLE_SOLVE_CSP_FWD__ISAPPLICABLEMATCH_XCONTAINER = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 6;

	/**
	 * The operation id for the '<em>Is Applicable check Csp FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XCONTAINER_TO_CONTAINER_RULE___IS_APPLICABLE_CHECK_CSP_FWD__CSP = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 7;

	/**
	 * The operation id for the '<em>Register Objects FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XCONTAINER_TO_CONTAINER_RULE___REGISTER_OBJECTS_FWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 8;

	/**
	 * The operation id for the '<em>Check Types FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XCONTAINER_TO_CONTAINER_RULE___CHECK_TYPES_FWD__MATCH = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 9;

	/**
	 * The operation id for the '<em>Is Appropriate BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XCONTAINER_TO_CONTAINER_RULE___IS_APPROPRIATE_BWD__MATCH_CONTAINER_NETWORKSPAN = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 10;

	/**
	 * The operation id for the '<em>Perform BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XCONTAINER_TO_CONTAINER_RULE___PERFORM_BWD__ISAPPLICABLEMATCH = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 11;

	/**
	 * The operation id for the '<em>Is Applicable BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XCONTAINER_TO_CONTAINER_RULE___IS_APPLICABLE_BWD__MATCH = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 12;

	/**
	 * The operation id for the '<em>Register Objects To Match BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XCONTAINER_TO_CONTAINER_RULE___REGISTER_OBJECTS_TO_MATCH_BWD__MATCH_CONTAINER_NETWORKSPAN = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 13;

	/**
	 * The operation id for the '<em>Is Appropriate solve Csp BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XCONTAINER_TO_CONTAINER_RULE___IS_APPROPRIATE_SOLVE_CSP_BWD__MATCH_CONTAINER_NETWORKSPAN = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 14;

	/**
	 * The operation id for the '<em>Is Appropriate check Csp BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XCONTAINER_TO_CONTAINER_RULE___IS_APPROPRIATE_CHECK_CSP_BWD__CSP = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 15;

	/**
	 * The operation id for the '<em>Is Applicable solve Csp BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XCONTAINER_TO_CONTAINER_RULE___IS_APPLICABLE_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_CONTAINER_NETWORKSPAN = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 16;

	/**
	 * The operation id for the '<em>Is Applicable check Csp BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XCONTAINER_TO_CONTAINER_RULE___IS_APPLICABLE_CHECK_CSP_BWD__CSP = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 17;

	/**
	 * The operation id for the '<em>Register Objects BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XCONTAINER_TO_CONTAINER_RULE___REGISTER_OBJECTS_BWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 18;

	/**
	 * The operation id for the '<em>Check Types BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XCONTAINER_TO_CONTAINER_RULE___CHECK_TYPES_BWD__MATCH = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 19;

	/**
	 * The operation id for the '<em>Is Appropriate FWD XContainer 4</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XCONTAINER_TO_CONTAINER_RULE___IS_APPROPRIATE_FWD_XCONTAINER_4__XCONTAINER = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 20;

	/**
	 * The operation id for the '<em>Is Appropriate BWD EMoflon Edge 42</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XCONTAINER_TO_CONTAINER_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_42__EMOFLONEDGE = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 21;

	/**
	 * The operation id for the '<em>Check Attributes FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XCONTAINER_TO_CONTAINER_RULE___CHECK_ATTRIBUTES_FWD__TRIPLEMATCH = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 22;

	/**
	 * The operation id for the '<em>Check Attributes BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XCONTAINER_TO_CONTAINER_RULE___CHECK_ATTRIBUTES_BWD__TRIPLEMATCH = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 23;

	/**
	 * The operation id for the '<em>Is Applicable CC</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XCONTAINER_TO_CONTAINER_RULE___IS_APPLICABLE_CC__MATCH_MATCH = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 24;

	/**
	 * The operation id for the '<em>Is Applicable solve Csp CC</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XCONTAINER_TO_CONTAINER_RULE___IS_APPLICABLE_SOLVE_CSP_CC__XCONTAINER_CONTAINER_NETWORKSPAN_MATCH_MATCH = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 25;

	/**
	 * The operation id for the '<em>Is Applicable check Csp CC</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XCONTAINER_TO_CONTAINER_RULE___IS_APPLICABLE_CHECK_CSP_CC__CSP = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 26;

	/**
	 * The operation id for the '<em>Check DEC FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XCONTAINER_TO_CONTAINER_RULE___CHECK_DEC_FWD__XCONTAINER = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 27;

	/**
	 * The operation id for the '<em>Check DEC BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XCONTAINER_TO_CONTAINER_RULE___CHECK_DEC_BWD__CONTAINER_NETWORKSPAN = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 28;

	/**
	 * The operation id for the '<em>Generate Model</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XCONTAINER_TO_CONTAINER_RULE___GENERATE_MODEL__RULEENTRYCONTAINER = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 29;

	/**
	 * The operation id for the '<em>Generate Model solve Csp BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XCONTAINER_TO_CONTAINER_RULE___GENERATE_MODEL_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_MODELGENERATORRULERESULT = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 30;

	/**
	 * The operation id for the '<em>Generate Model check Csp BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XCONTAINER_TO_CONTAINER_RULE___GENERATE_MODEL_CHECK_CSP_BWD__CSP = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 31;

	/**
	 * The number of operations of the '<em>XContainer To Container Rule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XCONTAINER_TO_CONTAINER_RULE_OPERATION_COUNT = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 32;

	/**
	 * The meta object id for the '{@link RequirementsTransformator.Rules.impl.XProviderToProviderRuleImpl <em>XProvider To Provider Rule</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see RequirementsTransformator.Rules.impl.XProviderToProviderRuleImpl
	 * @see RequirementsTransformator.Rules.impl.RulesPackageImpl#getXProviderToProviderRule()
	 * @generated
	 */
	int XPROVIDER_TO_PROVIDER_RULE = 2;

	/**
	 * The number of structural features of the '<em>XProvider To Provider Rule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XPROVIDER_TO_PROVIDER_RULE_FEATURE_COUNT = RuntimePackage.ABSTRACT_RULE_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Is Appropriate FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XPROVIDER_TO_PROVIDER_RULE___IS_APPROPRIATE_FWD__MATCH_XPROVIDER_XCONTAINER = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 0;

	/**
	 * The operation id for the '<em>Perform FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XPROVIDER_TO_PROVIDER_RULE___PERFORM_FWD__ISAPPLICABLEMATCH = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Is Applicable FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XPROVIDER_TO_PROVIDER_RULE___IS_APPLICABLE_FWD__MATCH = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 2;

	/**
	 * The operation id for the '<em>Register Objects To Match FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XPROVIDER_TO_PROVIDER_RULE___REGISTER_OBJECTS_TO_MATCH_FWD__MATCH_XPROVIDER_XCONTAINER = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 3;

	/**
	 * The operation id for the '<em>Is Appropriate solve Csp FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XPROVIDER_TO_PROVIDER_RULE___IS_APPROPRIATE_SOLVE_CSP_FWD__MATCH_XPROVIDER_XCONTAINER = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 4;

	/**
	 * The operation id for the '<em>Is Appropriate check Csp FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XPROVIDER_TO_PROVIDER_RULE___IS_APPROPRIATE_CHECK_CSP_FWD__CSP = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 5;

	/**
	 * The operation id for the '<em>Is Applicable solve Csp FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XPROVIDER_TO_PROVIDER_RULE___IS_APPLICABLE_SOLVE_CSP_FWD__ISAPPLICABLEMATCH_CONTAINER_XPROVIDER_XCONTAINERTOCONTAINER_XCONTAINER = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 6;

	/**
	 * The operation id for the '<em>Is Applicable check Csp FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XPROVIDER_TO_PROVIDER_RULE___IS_APPLICABLE_CHECK_CSP_FWD__CSP = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 7;

	/**
	 * The operation id for the '<em>Register Objects FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XPROVIDER_TO_PROVIDER_RULE___REGISTER_OBJECTS_FWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 8;

	/**
	 * The operation id for the '<em>Check Types FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XPROVIDER_TO_PROVIDER_RULE___CHECK_TYPES_FWD__MATCH = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 9;

	/**
	 * The operation id for the '<em>Is Appropriate BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XPROVIDER_TO_PROVIDER_RULE___IS_APPROPRIATE_BWD__MATCH_CONTAINER_PROVIDER = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 10;

	/**
	 * The operation id for the '<em>Perform BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XPROVIDER_TO_PROVIDER_RULE___PERFORM_BWD__ISAPPLICABLEMATCH = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 11;

	/**
	 * The operation id for the '<em>Is Applicable BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XPROVIDER_TO_PROVIDER_RULE___IS_APPLICABLE_BWD__MATCH = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 12;

	/**
	 * The operation id for the '<em>Register Objects To Match BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XPROVIDER_TO_PROVIDER_RULE___REGISTER_OBJECTS_TO_MATCH_BWD__MATCH_CONTAINER_PROVIDER = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 13;

	/**
	 * The operation id for the '<em>Is Appropriate solve Csp BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XPROVIDER_TO_PROVIDER_RULE___IS_APPROPRIATE_SOLVE_CSP_BWD__MATCH_CONTAINER_PROVIDER = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 14;

	/**
	 * The operation id for the '<em>Is Appropriate check Csp BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XPROVIDER_TO_PROVIDER_RULE___IS_APPROPRIATE_CHECK_CSP_BWD__CSP = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 15;

	/**
	 * The operation id for the '<em>Is Applicable solve Csp BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XPROVIDER_TO_PROVIDER_RULE___IS_APPLICABLE_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_CONTAINER_PROVIDER_XCONTAINERTOCONTAINER_XCONTAINER = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 16;

	/**
	 * The operation id for the '<em>Is Applicable check Csp BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XPROVIDER_TO_PROVIDER_RULE___IS_APPLICABLE_CHECK_CSP_BWD__CSP = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 17;

	/**
	 * The operation id for the '<em>Register Objects BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XPROVIDER_TO_PROVIDER_RULE___REGISTER_OBJECTS_BWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 18;

	/**
	 * The operation id for the '<em>Check Types BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XPROVIDER_TO_PROVIDER_RULE___CHECK_TYPES_BWD__MATCH = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 19;

	/**
	 * The operation id for the '<em>Is Appropriate BWD EMoflon Edge 43</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XPROVIDER_TO_PROVIDER_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_43__EMOFLONEDGE = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 20;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 31</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XPROVIDER_TO_PROVIDER_RULE___IS_APPROPRIATE_FWD_EMOFLON_EDGE_31__EMOFLONEDGE = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 21;

	/**
	 * The operation id for the '<em>Check Attributes FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XPROVIDER_TO_PROVIDER_RULE___CHECK_ATTRIBUTES_FWD__TRIPLEMATCH = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 22;

	/**
	 * The operation id for the '<em>Check Attributes BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XPROVIDER_TO_PROVIDER_RULE___CHECK_ATTRIBUTES_BWD__TRIPLEMATCH = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 23;

	/**
	 * The operation id for the '<em>Is Applicable CC</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XPROVIDER_TO_PROVIDER_RULE___IS_APPLICABLE_CC__MATCH_MATCH = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 24;

	/**
	 * The operation id for the '<em>Is Applicable solve Csp CC</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XPROVIDER_TO_PROVIDER_RULE___IS_APPLICABLE_SOLVE_CSP_CC__CONTAINER_PROVIDER_XPROVIDER_XCONTAINER_MATCH_MATCH = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 25;

	/**
	 * The operation id for the '<em>Is Applicable check Csp CC</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XPROVIDER_TO_PROVIDER_RULE___IS_APPLICABLE_CHECK_CSP_CC__CSP = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 26;

	/**
	 * The operation id for the '<em>Check DEC FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XPROVIDER_TO_PROVIDER_RULE___CHECK_DEC_FWD__XPROVIDER_XCONTAINER = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 27;

	/**
	 * The operation id for the '<em>Check DEC BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XPROVIDER_TO_PROVIDER_RULE___CHECK_DEC_BWD__CONTAINER_PROVIDER = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 28;

	/**
	 * The operation id for the '<em>Generate Model</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XPROVIDER_TO_PROVIDER_RULE___GENERATE_MODEL__RULEENTRYCONTAINER_XCONTAINERTOCONTAINER = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 29;

	/**
	 * The operation id for the '<em>Generate Model solve Csp BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XPROVIDER_TO_PROVIDER_RULE___GENERATE_MODEL_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_CONTAINER_XCONTAINERTOCONTAINER_XCONTAINER_MODELGENERATORRULERESULT = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 30;

	/**
	 * The operation id for the '<em>Generate Model check Csp BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XPROVIDER_TO_PROVIDER_RULE___GENERATE_MODEL_CHECK_CSP_BWD__CSP = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 31;

	/**
	 * The number of operations of the '<em>XProvider To Provider Rule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XPROVIDER_TO_PROVIDER_RULE_OPERATION_COUNT = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 32;

	/**
	 * The meta object id for the '{@link RequirementsTransformator.Rules.impl.XConsumerToConsumerRuleImpl <em>XConsumer To Consumer Rule</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see RequirementsTransformator.Rules.impl.XConsumerToConsumerRuleImpl
	 * @see RequirementsTransformator.Rules.impl.RulesPackageImpl#getXConsumerToConsumerRule()
	 * @generated
	 */
	int XCONSUMER_TO_CONSUMER_RULE = 3;

	/**
	 * The number of structural features of the '<em>XConsumer To Consumer Rule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XCONSUMER_TO_CONSUMER_RULE_FEATURE_COUNT = RuntimePackage.ABSTRACT_RULE_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Is Appropriate FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XCONSUMER_TO_CONSUMER_RULE___IS_APPROPRIATE_FWD__MATCH_XCONSUMER_XCONTAINER = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 0;

	/**
	 * The operation id for the '<em>Perform FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XCONSUMER_TO_CONSUMER_RULE___PERFORM_FWD__ISAPPLICABLEMATCH = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Is Applicable FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XCONSUMER_TO_CONSUMER_RULE___IS_APPLICABLE_FWD__MATCH = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 2;

	/**
	 * The operation id for the '<em>Register Objects To Match FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XCONSUMER_TO_CONSUMER_RULE___REGISTER_OBJECTS_TO_MATCH_FWD__MATCH_XCONSUMER_XCONTAINER = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 3;

	/**
	 * The operation id for the '<em>Is Appropriate solve Csp FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XCONSUMER_TO_CONSUMER_RULE___IS_APPROPRIATE_SOLVE_CSP_FWD__MATCH_XCONSUMER_XCONTAINER = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 4;

	/**
	 * The operation id for the '<em>Is Appropriate check Csp FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XCONSUMER_TO_CONSUMER_RULE___IS_APPROPRIATE_CHECK_CSP_FWD__CSP = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 5;

	/**
	 * The operation id for the '<em>Is Applicable solve Csp FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XCONSUMER_TO_CONSUMER_RULE___IS_APPLICABLE_SOLVE_CSP_FWD__ISAPPLICABLEMATCH_CONTAINER_XCONSUMER_XCONTAINERTOCONTAINER_XCONTAINER = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 6;

	/**
	 * The operation id for the '<em>Is Applicable check Csp FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XCONSUMER_TO_CONSUMER_RULE___IS_APPLICABLE_CHECK_CSP_FWD__CSP = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 7;

	/**
	 * The operation id for the '<em>Register Objects FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XCONSUMER_TO_CONSUMER_RULE___REGISTER_OBJECTS_FWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 8;

	/**
	 * The operation id for the '<em>Check Types FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XCONSUMER_TO_CONSUMER_RULE___CHECK_TYPES_FWD__MATCH = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 9;

	/**
	 * The operation id for the '<em>Is Appropriate BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XCONSUMER_TO_CONSUMER_RULE___IS_APPROPRIATE_BWD__MATCH_CONTAINER_CONSUMER = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 10;

	/**
	 * The operation id for the '<em>Perform BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XCONSUMER_TO_CONSUMER_RULE___PERFORM_BWD__ISAPPLICABLEMATCH = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 11;

	/**
	 * The operation id for the '<em>Is Applicable BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XCONSUMER_TO_CONSUMER_RULE___IS_APPLICABLE_BWD__MATCH = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 12;

	/**
	 * The operation id for the '<em>Register Objects To Match BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XCONSUMER_TO_CONSUMER_RULE___REGISTER_OBJECTS_TO_MATCH_BWD__MATCH_CONTAINER_CONSUMER = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 13;

	/**
	 * The operation id for the '<em>Is Appropriate solve Csp BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XCONSUMER_TO_CONSUMER_RULE___IS_APPROPRIATE_SOLVE_CSP_BWD__MATCH_CONTAINER_CONSUMER = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 14;

	/**
	 * The operation id for the '<em>Is Appropriate check Csp BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XCONSUMER_TO_CONSUMER_RULE___IS_APPROPRIATE_CHECK_CSP_BWD__CSP = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 15;

	/**
	 * The operation id for the '<em>Is Applicable solve Csp BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XCONSUMER_TO_CONSUMER_RULE___IS_APPLICABLE_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_CONTAINER_CONSUMER_XCONTAINERTOCONTAINER_XCONTAINER = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 16;

	/**
	 * The operation id for the '<em>Is Applicable check Csp BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XCONSUMER_TO_CONSUMER_RULE___IS_APPLICABLE_CHECK_CSP_BWD__CSP = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 17;

	/**
	 * The operation id for the '<em>Register Objects BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XCONSUMER_TO_CONSUMER_RULE___REGISTER_OBJECTS_BWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 18;

	/**
	 * The operation id for the '<em>Check Types BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XCONSUMER_TO_CONSUMER_RULE___CHECK_TYPES_BWD__MATCH = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 19;

	/**
	 * The operation id for the '<em>Is Appropriate BWD EMoflon Edge 44</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XCONSUMER_TO_CONSUMER_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_44__EMOFLONEDGE = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 20;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 32</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XCONSUMER_TO_CONSUMER_RULE___IS_APPROPRIATE_FWD_EMOFLON_EDGE_32__EMOFLONEDGE = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 21;

	/**
	 * The operation id for the '<em>Check Attributes FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XCONSUMER_TO_CONSUMER_RULE___CHECK_ATTRIBUTES_FWD__TRIPLEMATCH = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 22;

	/**
	 * The operation id for the '<em>Check Attributes BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XCONSUMER_TO_CONSUMER_RULE___CHECK_ATTRIBUTES_BWD__TRIPLEMATCH = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 23;

	/**
	 * The operation id for the '<em>Is Applicable CC</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XCONSUMER_TO_CONSUMER_RULE___IS_APPLICABLE_CC__MATCH_MATCH = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 24;

	/**
	 * The operation id for the '<em>Is Applicable solve Csp CC</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XCONSUMER_TO_CONSUMER_RULE___IS_APPLICABLE_SOLVE_CSP_CC__CONTAINER_CONSUMER_XCONSUMER_XCONTAINER_MATCH_MATCH = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 25;

	/**
	 * The operation id for the '<em>Is Applicable check Csp CC</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XCONSUMER_TO_CONSUMER_RULE___IS_APPLICABLE_CHECK_CSP_CC__CSP = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 26;

	/**
	 * The operation id for the '<em>Check DEC FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XCONSUMER_TO_CONSUMER_RULE___CHECK_DEC_FWD__XCONSUMER_XCONTAINER = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 27;

	/**
	 * The operation id for the '<em>Check DEC BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XCONSUMER_TO_CONSUMER_RULE___CHECK_DEC_BWD__CONTAINER_CONSUMER = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 28;

	/**
	 * The operation id for the '<em>Generate Model</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XCONSUMER_TO_CONSUMER_RULE___GENERATE_MODEL__RULEENTRYCONTAINER_XCONTAINERTOCONTAINER = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 29;

	/**
	 * The operation id for the '<em>Generate Model solve Csp BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XCONSUMER_TO_CONSUMER_RULE___GENERATE_MODEL_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_CONTAINER_XCONTAINERTOCONTAINER_XCONTAINER_MODELGENERATORRULERESULT = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 30;

	/**
	 * The operation id for the '<em>Generate Model check Csp BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XCONSUMER_TO_CONSUMER_RULE___GENERATE_MODEL_CHECK_CSP_BWD__CSP = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 31;

	/**
	 * The number of operations of the '<em>XConsumer To Consumer Rule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XCONSUMER_TO_CONSUMER_RULE_OPERATION_COUNT = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 32;

	/**
	 * Returns the meta object for class '{@link RequirementsTransformator.Rules.XAgentToAgentRule <em>XAgent To Agent Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>XAgent To Agent Rule</em>'.
	 * @see RequirementsTransformator.Rules.XAgentToAgentRule
	 * @generated
	 */
	EClass getXAgentToAgentRule();

	/**
	 * Returns the meta object for class '{@link RequirementsTransformator.Rules.XContainerToContainerRule <em>XContainer To Container Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>XContainer To Container Rule</em>'.
	 * @see RequirementsTransformator.Rules.XContainerToContainerRule
	 * @generated
	 */
	EClass getXContainerToContainerRule();

	/**
	 * Returns the meta object for the '{@link RequirementsTransformator.Rules.XContainerToContainerRule#isAppropriate_FWD(org.moflon.tgg.runtime.Match, requirementsXtext.reqXtext.XContainer) <em>Is Appropriate FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD</em>' operation.
	 * @see RequirementsTransformator.Rules.XContainerToContainerRule#isAppropriate_FWD(org.moflon.tgg.runtime.Match, requirementsXtext.reqXtext.XContainer)
	 * @generated
	 */
	EOperation getXContainerToContainerRule__IsAppropriate_FWD__Match_XContainer();

	/**
	 * Returns the meta object for the '{@link RequirementsTransformator.Rules.XContainerToContainerRule#perform_FWD(org.moflon.tgg.runtime.IsApplicableMatch) <em>Perform FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Perform FWD</em>' operation.
	 * @see RequirementsTransformator.Rules.XContainerToContainerRule#perform_FWD(org.moflon.tgg.runtime.IsApplicableMatch)
	 * @generated
	 */
	EOperation getXContainerToContainerRule__Perform_FWD__IsApplicableMatch();

	/**
	 * Returns the meta object for the '{@link RequirementsTransformator.Rules.XContainerToContainerRule#isApplicable_FWD(org.moflon.tgg.runtime.Match) <em>Is Applicable FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable FWD</em>' operation.
	 * @see RequirementsTransformator.Rules.XContainerToContainerRule#isApplicable_FWD(org.moflon.tgg.runtime.Match)
	 * @generated
	 */
	EOperation getXContainerToContainerRule__IsApplicable_FWD__Match();

	/**
	 * Returns the meta object for the '{@link RequirementsTransformator.Rules.XContainerToContainerRule#registerObjectsToMatch_FWD(org.moflon.tgg.runtime.Match, requirementsXtext.reqXtext.XContainer) <em>Register Objects To Match FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Register Objects To Match FWD</em>' operation.
	 * @see RequirementsTransformator.Rules.XContainerToContainerRule#registerObjectsToMatch_FWD(org.moflon.tgg.runtime.Match, requirementsXtext.reqXtext.XContainer)
	 * @generated
	 */
	EOperation getXContainerToContainerRule__RegisterObjectsToMatch_FWD__Match_XContainer();

	/**
	 * Returns the meta object for the '{@link RequirementsTransformator.Rules.XContainerToContainerRule#isAppropriate_solveCsp_FWD(org.moflon.tgg.runtime.Match, requirementsXtext.reqXtext.XContainer) <em>Is Appropriate solve Csp FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate solve Csp FWD</em>' operation.
	 * @see RequirementsTransformator.Rules.XContainerToContainerRule#isAppropriate_solveCsp_FWD(org.moflon.tgg.runtime.Match, requirementsXtext.reqXtext.XContainer)
	 * @generated
	 */
	EOperation getXContainerToContainerRule__IsAppropriate_solveCsp_FWD__Match_XContainer();

	/**
	 * Returns the meta object for the '{@link RequirementsTransformator.Rules.XContainerToContainerRule#isAppropriate_checkCsp_FWD(org.moflon.tgg.language.csp.CSP) <em>Is Appropriate check Csp FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate check Csp FWD</em>' operation.
	 * @see RequirementsTransformator.Rules.XContainerToContainerRule#isAppropriate_checkCsp_FWD(org.moflon.tgg.language.csp.CSP)
	 * @generated
	 */
	EOperation getXContainerToContainerRule__IsAppropriate_checkCsp_FWD__CSP();

	/**
	 * Returns the meta object for the '{@link RequirementsTransformator.Rules.XContainerToContainerRule#isApplicable_solveCsp_FWD(org.moflon.tgg.runtime.IsApplicableMatch, requirementsXtext.reqXtext.XContainer) <em>Is Applicable solve Csp FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable solve Csp FWD</em>' operation.
	 * @see RequirementsTransformator.Rules.XContainerToContainerRule#isApplicable_solveCsp_FWD(org.moflon.tgg.runtime.IsApplicableMatch, requirementsXtext.reqXtext.XContainer)
	 * @generated
	 */
	EOperation getXContainerToContainerRule__IsApplicable_solveCsp_FWD__IsApplicableMatch_XContainer();

	/**
	 * Returns the meta object for the '{@link RequirementsTransformator.Rules.XContainerToContainerRule#isApplicable_checkCsp_FWD(org.moflon.tgg.language.csp.CSP) <em>Is Applicable check Csp FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable check Csp FWD</em>' operation.
	 * @see RequirementsTransformator.Rules.XContainerToContainerRule#isApplicable_checkCsp_FWD(org.moflon.tgg.language.csp.CSP)
	 * @generated
	 */
	EOperation getXContainerToContainerRule__IsApplicable_checkCsp_FWD__CSP();

	/**
	 * Returns the meta object for the '{@link RequirementsTransformator.Rules.XContainerToContainerRule#registerObjects_FWD(org.moflon.tgg.runtime.PerformRuleResult, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject) <em>Register Objects FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Register Objects FWD</em>' operation.
	 * @see RequirementsTransformator.Rules.XContainerToContainerRule#registerObjects_FWD(org.moflon.tgg.runtime.PerformRuleResult, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	EOperation getXContainerToContainerRule__RegisterObjects_FWD__PerformRuleResult_EObject_EObject_EObject_EObject();

	/**
	 * Returns the meta object for the '{@link RequirementsTransformator.Rules.XContainerToContainerRule#checkTypes_FWD(org.moflon.tgg.runtime.Match) <em>Check Types FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check Types FWD</em>' operation.
	 * @see RequirementsTransformator.Rules.XContainerToContainerRule#checkTypes_FWD(org.moflon.tgg.runtime.Match)
	 * @generated
	 */
	EOperation getXContainerToContainerRule__CheckTypes_FWD__Match();

	/**
	 * Returns the meta object for the '{@link RequirementsTransformator.Rules.XContainerToContainerRule#isAppropriate_BWD(org.moflon.tgg.runtime.Match, requirements.Container, requirements.NetworkSpan) <em>Is Appropriate BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD</em>' operation.
	 * @see RequirementsTransformator.Rules.XContainerToContainerRule#isAppropriate_BWD(org.moflon.tgg.runtime.Match, requirements.Container, requirements.NetworkSpan)
	 * @generated
	 */
	EOperation getXContainerToContainerRule__IsAppropriate_BWD__Match_Container_NetworkSpan();

	/**
	 * Returns the meta object for the '{@link RequirementsTransformator.Rules.XContainerToContainerRule#perform_BWD(org.moflon.tgg.runtime.IsApplicableMatch) <em>Perform BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Perform BWD</em>' operation.
	 * @see RequirementsTransformator.Rules.XContainerToContainerRule#perform_BWD(org.moflon.tgg.runtime.IsApplicableMatch)
	 * @generated
	 */
	EOperation getXContainerToContainerRule__Perform_BWD__IsApplicableMatch();

	/**
	 * Returns the meta object for the '{@link RequirementsTransformator.Rules.XContainerToContainerRule#isApplicable_BWD(org.moflon.tgg.runtime.Match) <em>Is Applicable BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable BWD</em>' operation.
	 * @see RequirementsTransformator.Rules.XContainerToContainerRule#isApplicable_BWD(org.moflon.tgg.runtime.Match)
	 * @generated
	 */
	EOperation getXContainerToContainerRule__IsApplicable_BWD__Match();

	/**
	 * Returns the meta object for the '{@link RequirementsTransformator.Rules.XContainerToContainerRule#registerObjectsToMatch_BWD(org.moflon.tgg.runtime.Match, requirements.Container, requirements.NetworkSpan) <em>Register Objects To Match BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Register Objects To Match BWD</em>' operation.
	 * @see RequirementsTransformator.Rules.XContainerToContainerRule#registerObjectsToMatch_BWD(org.moflon.tgg.runtime.Match, requirements.Container, requirements.NetworkSpan)
	 * @generated
	 */
	EOperation getXContainerToContainerRule__RegisterObjectsToMatch_BWD__Match_Container_NetworkSpan();

	/**
	 * Returns the meta object for the '{@link RequirementsTransformator.Rules.XContainerToContainerRule#isAppropriate_solveCsp_BWD(org.moflon.tgg.runtime.Match, requirements.Container, requirements.NetworkSpan) <em>Is Appropriate solve Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate solve Csp BWD</em>' operation.
	 * @see RequirementsTransformator.Rules.XContainerToContainerRule#isAppropriate_solveCsp_BWD(org.moflon.tgg.runtime.Match, requirements.Container, requirements.NetworkSpan)
	 * @generated
	 */
	EOperation getXContainerToContainerRule__IsAppropriate_solveCsp_BWD__Match_Container_NetworkSpan();

	/**
	 * Returns the meta object for the '{@link RequirementsTransformator.Rules.XContainerToContainerRule#isAppropriate_checkCsp_BWD(org.moflon.tgg.language.csp.CSP) <em>Is Appropriate check Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate check Csp BWD</em>' operation.
	 * @see RequirementsTransformator.Rules.XContainerToContainerRule#isAppropriate_checkCsp_BWD(org.moflon.tgg.language.csp.CSP)
	 * @generated
	 */
	EOperation getXContainerToContainerRule__IsAppropriate_checkCsp_BWD__CSP();

	/**
	 * Returns the meta object for the '{@link RequirementsTransformator.Rules.XContainerToContainerRule#isApplicable_solveCsp_BWD(org.moflon.tgg.runtime.IsApplicableMatch, requirements.Container, requirements.NetworkSpan) <em>Is Applicable solve Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable solve Csp BWD</em>' operation.
	 * @see RequirementsTransformator.Rules.XContainerToContainerRule#isApplicable_solveCsp_BWD(org.moflon.tgg.runtime.IsApplicableMatch, requirements.Container, requirements.NetworkSpan)
	 * @generated
	 */
	EOperation getXContainerToContainerRule__IsApplicable_solveCsp_BWD__IsApplicableMatch_Container_NetworkSpan();

	/**
	 * Returns the meta object for the '{@link RequirementsTransformator.Rules.XContainerToContainerRule#isApplicable_checkCsp_BWD(org.moflon.tgg.language.csp.CSP) <em>Is Applicable check Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable check Csp BWD</em>' operation.
	 * @see RequirementsTransformator.Rules.XContainerToContainerRule#isApplicable_checkCsp_BWD(org.moflon.tgg.language.csp.CSP)
	 * @generated
	 */
	EOperation getXContainerToContainerRule__IsApplicable_checkCsp_BWD__CSP();

	/**
	 * Returns the meta object for the '{@link RequirementsTransformator.Rules.XContainerToContainerRule#registerObjects_BWD(org.moflon.tgg.runtime.PerformRuleResult, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject) <em>Register Objects BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Register Objects BWD</em>' operation.
	 * @see RequirementsTransformator.Rules.XContainerToContainerRule#registerObjects_BWD(org.moflon.tgg.runtime.PerformRuleResult, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	EOperation getXContainerToContainerRule__RegisterObjects_BWD__PerformRuleResult_EObject_EObject_EObject_EObject();

	/**
	 * Returns the meta object for the '{@link RequirementsTransformator.Rules.XContainerToContainerRule#checkTypes_BWD(org.moflon.tgg.runtime.Match) <em>Check Types BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check Types BWD</em>' operation.
	 * @see RequirementsTransformator.Rules.XContainerToContainerRule#checkTypes_BWD(org.moflon.tgg.runtime.Match)
	 * @generated
	 */
	EOperation getXContainerToContainerRule__CheckTypes_BWD__Match();

	/**
	 * Returns the meta object for the '{@link RequirementsTransformator.Rules.XContainerToContainerRule#isAppropriate_FWD_XContainer_4(requirementsXtext.reqXtext.XContainer) <em>Is Appropriate FWD XContainer 4</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD XContainer 4</em>' operation.
	 * @see RequirementsTransformator.Rules.XContainerToContainerRule#isAppropriate_FWD_XContainer_4(requirementsXtext.reqXtext.XContainer)
	 * @generated
	 */
	EOperation getXContainerToContainerRule__IsAppropriate_FWD_XContainer_4__XContainer();

	/**
	 * Returns the meta object for the '{@link RequirementsTransformator.Rules.XContainerToContainerRule#isAppropriate_BWD_EMoflonEdge_42(org.moflon.tgg.runtime.EMoflonEdge) <em>Is Appropriate BWD EMoflon Edge 42</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD EMoflon Edge 42</em>' operation.
	 * @see RequirementsTransformator.Rules.XContainerToContainerRule#isAppropriate_BWD_EMoflonEdge_42(org.moflon.tgg.runtime.EMoflonEdge)
	 * @generated
	 */
	EOperation getXContainerToContainerRule__IsAppropriate_BWD_EMoflonEdge_42__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link RequirementsTransformator.Rules.XContainerToContainerRule#checkAttributes_FWD(org.moflon.tgg.runtime.TripleMatch) <em>Check Attributes FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check Attributes FWD</em>' operation.
	 * @see RequirementsTransformator.Rules.XContainerToContainerRule#checkAttributes_FWD(org.moflon.tgg.runtime.TripleMatch)
	 * @generated
	 */
	EOperation getXContainerToContainerRule__CheckAttributes_FWD__TripleMatch();

	/**
	 * Returns the meta object for the '{@link RequirementsTransformator.Rules.XContainerToContainerRule#checkAttributes_BWD(org.moflon.tgg.runtime.TripleMatch) <em>Check Attributes BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check Attributes BWD</em>' operation.
	 * @see RequirementsTransformator.Rules.XContainerToContainerRule#checkAttributes_BWD(org.moflon.tgg.runtime.TripleMatch)
	 * @generated
	 */
	EOperation getXContainerToContainerRule__CheckAttributes_BWD__TripleMatch();

	/**
	 * Returns the meta object for the '{@link RequirementsTransformator.Rules.XContainerToContainerRule#isApplicable_CC(org.moflon.tgg.runtime.Match, org.moflon.tgg.runtime.Match) <em>Is Applicable CC</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable CC</em>' operation.
	 * @see RequirementsTransformator.Rules.XContainerToContainerRule#isApplicable_CC(org.moflon.tgg.runtime.Match, org.moflon.tgg.runtime.Match)
	 * @generated
	 */
	EOperation getXContainerToContainerRule__IsApplicable_CC__Match_Match();

	/**
	 * Returns the meta object for the '{@link RequirementsTransformator.Rules.XContainerToContainerRule#isApplicable_solveCsp_CC(requirementsXtext.reqXtext.XContainer, requirements.Container, requirements.NetworkSpan, org.moflon.tgg.runtime.Match, org.moflon.tgg.runtime.Match) <em>Is Applicable solve Csp CC</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable solve Csp CC</em>' operation.
	 * @see RequirementsTransformator.Rules.XContainerToContainerRule#isApplicable_solveCsp_CC(requirementsXtext.reqXtext.XContainer, requirements.Container, requirements.NetworkSpan, org.moflon.tgg.runtime.Match, org.moflon.tgg.runtime.Match)
	 * @generated
	 */
	EOperation getXContainerToContainerRule__IsApplicable_solveCsp_CC__XContainer_Container_NetworkSpan_Match_Match();

	/**
	 * Returns the meta object for the '{@link RequirementsTransformator.Rules.XContainerToContainerRule#isApplicable_checkCsp_CC(org.moflon.tgg.language.csp.CSP) <em>Is Applicable check Csp CC</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable check Csp CC</em>' operation.
	 * @see RequirementsTransformator.Rules.XContainerToContainerRule#isApplicable_checkCsp_CC(org.moflon.tgg.language.csp.CSP)
	 * @generated
	 */
	EOperation getXContainerToContainerRule__IsApplicable_checkCsp_CC__CSP();

	/**
	 * Returns the meta object for the '{@link RequirementsTransformator.Rules.XContainerToContainerRule#checkDEC_FWD(requirementsXtext.reqXtext.XContainer) <em>Check DEC FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check DEC FWD</em>' operation.
	 * @see RequirementsTransformator.Rules.XContainerToContainerRule#checkDEC_FWD(requirementsXtext.reqXtext.XContainer)
	 * @generated
	 */
	EOperation getXContainerToContainerRule__CheckDEC_FWD__XContainer();

	/**
	 * Returns the meta object for the '{@link RequirementsTransformator.Rules.XContainerToContainerRule#checkDEC_BWD(requirements.Container, requirements.NetworkSpan) <em>Check DEC BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check DEC BWD</em>' operation.
	 * @see RequirementsTransformator.Rules.XContainerToContainerRule#checkDEC_BWD(requirements.Container, requirements.NetworkSpan)
	 * @generated
	 */
	EOperation getXContainerToContainerRule__CheckDEC_BWD__Container_NetworkSpan();

	/**
	 * Returns the meta object for the '{@link RequirementsTransformator.Rules.XContainerToContainerRule#generateModel(org.moflon.tgg.language.modelgenerator.RuleEntryContainer) <em>Generate Model</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Generate Model</em>' operation.
	 * @see RequirementsTransformator.Rules.XContainerToContainerRule#generateModel(org.moflon.tgg.language.modelgenerator.RuleEntryContainer)
	 * @generated
	 */
	EOperation getXContainerToContainerRule__GenerateModel__RuleEntryContainer();

	/**
	 * Returns the meta object for the '{@link RequirementsTransformator.Rules.XContainerToContainerRule#generateModel_solveCsp_BWD(org.moflon.tgg.runtime.IsApplicableMatch, org.moflon.tgg.runtime.ModelgeneratorRuleResult) <em>Generate Model solve Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Generate Model solve Csp BWD</em>' operation.
	 * @see RequirementsTransformator.Rules.XContainerToContainerRule#generateModel_solveCsp_BWD(org.moflon.tgg.runtime.IsApplicableMatch, org.moflon.tgg.runtime.ModelgeneratorRuleResult)
	 * @generated
	 */
	EOperation getXContainerToContainerRule__GenerateModel_solveCsp_BWD__IsApplicableMatch_ModelgeneratorRuleResult();

	/**
	 * Returns the meta object for the '{@link RequirementsTransformator.Rules.XContainerToContainerRule#generateModel_checkCsp_BWD(org.moflon.tgg.language.csp.CSP) <em>Generate Model check Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Generate Model check Csp BWD</em>' operation.
	 * @see RequirementsTransformator.Rules.XContainerToContainerRule#generateModel_checkCsp_BWD(org.moflon.tgg.language.csp.CSP)
	 * @generated
	 */
	EOperation getXContainerToContainerRule__GenerateModel_checkCsp_BWD__CSP();

	/**
	 * Returns the meta object for class '{@link RequirementsTransformator.Rules.XProviderToProviderRule <em>XProvider To Provider Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>XProvider To Provider Rule</em>'.
	 * @see RequirementsTransformator.Rules.XProviderToProviderRule
	 * @generated
	 */
	EClass getXProviderToProviderRule();

	/**
	 * Returns the meta object for the '{@link RequirementsTransformator.Rules.XProviderToProviderRule#isAppropriate_FWD(org.moflon.tgg.runtime.Match, requirementsXtext.reqXtext.XProvider, requirementsXtext.reqXtext.XContainer) <em>Is Appropriate FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD</em>' operation.
	 * @see RequirementsTransformator.Rules.XProviderToProviderRule#isAppropriate_FWD(org.moflon.tgg.runtime.Match, requirementsXtext.reqXtext.XProvider, requirementsXtext.reqXtext.XContainer)
	 * @generated
	 */
	EOperation getXProviderToProviderRule__IsAppropriate_FWD__Match_XProvider_XContainer();

	/**
	 * Returns the meta object for the '{@link RequirementsTransformator.Rules.XProviderToProviderRule#perform_FWD(org.moflon.tgg.runtime.IsApplicableMatch) <em>Perform FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Perform FWD</em>' operation.
	 * @see RequirementsTransformator.Rules.XProviderToProviderRule#perform_FWD(org.moflon.tgg.runtime.IsApplicableMatch)
	 * @generated
	 */
	EOperation getXProviderToProviderRule__Perform_FWD__IsApplicableMatch();

	/**
	 * Returns the meta object for the '{@link RequirementsTransformator.Rules.XProviderToProviderRule#isApplicable_FWD(org.moflon.tgg.runtime.Match) <em>Is Applicable FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable FWD</em>' operation.
	 * @see RequirementsTransformator.Rules.XProviderToProviderRule#isApplicable_FWD(org.moflon.tgg.runtime.Match)
	 * @generated
	 */
	EOperation getXProviderToProviderRule__IsApplicable_FWD__Match();

	/**
	 * Returns the meta object for the '{@link RequirementsTransformator.Rules.XProviderToProviderRule#registerObjectsToMatch_FWD(org.moflon.tgg.runtime.Match, requirementsXtext.reqXtext.XProvider, requirementsXtext.reqXtext.XContainer) <em>Register Objects To Match FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Register Objects To Match FWD</em>' operation.
	 * @see RequirementsTransformator.Rules.XProviderToProviderRule#registerObjectsToMatch_FWD(org.moflon.tgg.runtime.Match, requirementsXtext.reqXtext.XProvider, requirementsXtext.reqXtext.XContainer)
	 * @generated
	 */
	EOperation getXProviderToProviderRule__RegisterObjectsToMatch_FWD__Match_XProvider_XContainer();

	/**
	 * Returns the meta object for the '{@link RequirementsTransformator.Rules.XProviderToProviderRule#isAppropriate_solveCsp_FWD(org.moflon.tgg.runtime.Match, requirementsXtext.reqXtext.XProvider, requirementsXtext.reqXtext.XContainer) <em>Is Appropriate solve Csp FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate solve Csp FWD</em>' operation.
	 * @see RequirementsTransformator.Rules.XProviderToProviderRule#isAppropriate_solveCsp_FWD(org.moflon.tgg.runtime.Match, requirementsXtext.reqXtext.XProvider, requirementsXtext.reqXtext.XContainer)
	 * @generated
	 */
	EOperation getXProviderToProviderRule__IsAppropriate_solveCsp_FWD__Match_XProvider_XContainer();

	/**
	 * Returns the meta object for the '{@link RequirementsTransformator.Rules.XProviderToProviderRule#isAppropriate_checkCsp_FWD(org.moflon.tgg.language.csp.CSP) <em>Is Appropriate check Csp FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate check Csp FWD</em>' operation.
	 * @see RequirementsTransformator.Rules.XProviderToProviderRule#isAppropriate_checkCsp_FWD(org.moflon.tgg.language.csp.CSP)
	 * @generated
	 */
	EOperation getXProviderToProviderRule__IsAppropriate_checkCsp_FWD__CSP();

	/**
	 * Returns the meta object for the '{@link RequirementsTransformator.Rules.XProviderToProviderRule#isApplicable_solveCsp_FWD(org.moflon.tgg.runtime.IsApplicableMatch, requirements.Container, requirementsXtext.reqXtext.XProvider, RequirementsTransformator.XContainerToContainer, requirementsXtext.reqXtext.XContainer) <em>Is Applicable solve Csp FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable solve Csp FWD</em>' operation.
	 * @see RequirementsTransformator.Rules.XProviderToProviderRule#isApplicable_solveCsp_FWD(org.moflon.tgg.runtime.IsApplicableMatch, requirements.Container, requirementsXtext.reqXtext.XProvider, RequirementsTransformator.XContainerToContainer, requirementsXtext.reqXtext.XContainer)
	 * @generated
	 */
	EOperation getXProviderToProviderRule__IsApplicable_solveCsp_FWD__IsApplicableMatch_Container_XProvider_XContainerToContainer_XContainer();

	/**
	 * Returns the meta object for the '{@link RequirementsTransformator.Rules.XProviderToProviderRule#isApplicable_checkCsp_FWD(org.moflon.tgg.language.csp.CSP) <em>Is Applicable check Csp FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable check Csp FWD</em>' operation.
	 * @see RequirementsTransformator.Rules.XProviderToProviderRule#isApplicable_checkCsp_FWD(org.moflon.tgg.language.csp.CSP)
	 * @generated
	 */
	EOperation getXProviderToProviderRule__IsApplicable_checkCsp_FWD__CSP();

	/**
	 * Returns the meta object for the '{@link RequirementsTransformator.Rules.XProviderToProviderRule#registerObjects_FWD(org.moflon.tgg.runtime.PerformRuleResult, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject) <em>Register Objects FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Register Objects FWD</em>' operation.
	 * @see RequirementsTransformator.Rules.XProviderToProviderRule#registerObjects_FWD(org.moflon.tgg.runtime.PerformRuleResult, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	EOperation getXProviderToProviderRule__RegisterObjects_FWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject();

	/**
	 * Returns the meta object for the '{@link RequirementsTransformator.Rules.XProviderToProviderRule#checkTypes_FWD(org.moflon.tgg.runtime.Match) <em>Check Types FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check Types FWD</em>' operation.
	 * @see RequirementsTransformator.Rules.XProviderToProviderRule#checkTypes_FWD(org.moflon.tgg.runtime.Match)
	 * @generated
	 */
	EOperation getXProviderToProviderRule__CheckTypes_FWD__Match();

	/**
	 * Returns the meta object for the '{@link RequirementsTransformator.Rules.XProviderToProviderRule#isAppropriate_BWD(org.moflon.tgg.runtime.Match, requirements.Container, requirements.Provider) <em>Is Appropriate BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD</em>' operation.
	 * @see RequirementsTransformator.Rules.XProviderToProviderRule#isAppropriate_BWD(org.moflon.tgg.runtime.Match, requirements.Container, requirements.Provider)
	 * @generated
	 */
	EOperation getXProviderToProviderRule__IsAppropriate_BWD__Match_Container_Provider();

	/**
	 * Returns the meta object for the '{@link RequirementsTransformator.Rules.XProviderToProviderRule#perform_BWD(org.moflon.tgg.runtime.IsApplicableMatch) <em>Perform BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Perform BWD</em>' operation.
	 * @see RequirementsTransformator.Rules.XProviderToProviderRule#perform_BWD(org.moflon.tgg.runtime.IsApplicableMatch)
	 * @generated
	 */
	EOperation getXProviderToProviderRule__Perform_BWD__IsApplicableMatch();

	/**
	 * Returns the meta object for the '{@link RequirementsTransformator.Rules.XProviderToProviderRule#isApplicable_BWD(org.moflon.tgg.runtime.Match) <em>Is Applicable BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable BWD</em>' operation.
	 * @see RequirementsTransformator.Rules.XProviderToProviderRule#isApplicable_BWD(org.moflon.tgg.runtime.Match)
	 * @generated
	 */
	EOperation getXProviderToProviderRule__IsApplicable_BWD__Match();

	/**
	 * Returns the meta object for the '{@link RequirementsTransformator.Rules.XProviderToProviderRule#registerObjectsToMatch_BWD(org.moflon.tgg.runtime.Match, requirements.Container, requirements.Provider) <em>Register Objects To Match BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Register Objects To Match BWD</em>' operation.
	 * @see RequirementsTransformator.Rules.XProviderToProviderRule#registerObjectsToMatch_BWD(org.moflon.tgg.runtime.Match, requirements.Container, requirements.Provider)
	 * @generated
	 */
	EOperation getXProviderToProviderRule__RegisterObjectsToMatch_BWD__Match_Container_Provider();

	/**
	 * Returns the meta object for the '{@link RequirementsTransformator.Rules.XProviderToProviderRule#isAppropriate_solveCsp_BWD(org.moflon.tgg.runtime.Match, requirements.Container, requirements.Provider) <em>Is Appropriate solve Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate solve Csp BWD</em>' operation.
	 * @see RequirementsTransformator.Rules.XProviderToProviderRule#isAppropriate_solveCsp_BWD(org.moflon.tgg.runtime.Match, requirements.Container, requirements.Provider)
	 * @generated
	 */
	EOperation getXProviderToProviderRule__IsAppropriate_solveCsp_BWD__Match_Container_Provider();

	/**
	 * Returns the meta object for the '{@link RequirementsTransformator.Rules.XProviderToProviderRule#isAppropriate_checkCsp_BWD(org.moflon.tgg.language.csp.CSP) <em>Is Appropriate check Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate check Csp BWD</em>' operation.
	 * @see RequirementsTransformator.Rules.XProviderToProviderRule#isAppropriate_checkCsp_BWD(org.moflon.tgg.language.csp.CSP)
	 * @generated
	 */
	EOperation getXProviderToProviderRule__IsAppropriate_checkCsp_BWD__CSP();

	/**
	 * Returns the meta object for the '{@link RequirementsTransformator.Rules.XProviderToProviderRule#isApplicable_solveCsp_BWD(org.moflon.tgg.runtime.IsApplicableMatch, requirements.Container, requirements.Provider, RequirementsTransformator.XContainerToContainer, requirementsXtext.reqXtext.XContainer) <em>Is Applicable solve Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable solve Csp BWD</em>' operation.
	 * @see RequirementsTransformator.Rules.XProviderToProviderRule#isApplicable_solveCsp_BWD(org.moflon.tgg.runtime.IsApplicableMatch, requirements.Container, requirements.Provider, RequirementsTransformator.XContainerToContainer, requirementsXtext.reqXtext.XContainer)
	 * @generated
	 */
	EOperation getXProviderToProviderRule__IsApplicable_solveCsp_BWD__IsApplicableMatch_Container_Provider_XContainerToContainer_XContainer();

	/**
	 * Returns the meta object for the '{@link RequirementsTransformator.Rules.XProviderToProviderRule#isApplicable_checkCsp_BWD(org.moflon.tgg.language.csp.CSP) <em>Is Applicable check Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable check Csp BWD</em>' operation.
	 * @see RequirementsTransformator.Rules.XProviderToProviderRule#isApplicable_checkCsp_BWD(org.moflon.tgg.language.csp.CSP)
	 * @generated
	 */
	EOperation getXProviderToProviderRule__IsApplicable_checkCsp_BWD__CSP();

	/**
	 * Returns the meta object for the '{@link RequirementsTransformator.Rules.XProviderToProviderRule#registerObjects_BWD(org.moflon.tgg.runtime.PerformRuleResult, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject) <em>Register Objects BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Register Objects BWD</em>' operation.
	 * @see RequirementsTransformator.Rules.XProviderToProviderRule#registerObjects_BWD(org.moflon.tgg.runtime.PerformRuleResult, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	EOperation getXProviderToProviderRule__RegisterObjects_BWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject();

	/**
	 * Returns the meta object for the '{@link RequirementsTransformator.Rules.XProviderToProviderRule#checkTypes_BWD(org.moflon.tgg.runtime.Match) <em>Check Types BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check Types BWD</em>' operation.
	 * @see RequirementsTransformator.Rules.XProviderToProviderRule#checkTypes_BWD(org.moflon.tgg.runtime.Match)
	 * @generated
	 */
	EOperation getXProviderToProviderRule__CheckTypes_BWD__Match();

	/**
	 * Returns the meta object for the '{@link RequirementsTransformator.Rules.XProviderToProviderRule#isAppropriate_BWD_EMoflonEdge_43(org.moflon.tgg.runtime.EMoflonEdge) <em>Is Appropriate BWD EMoflon Edge 43</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD EMoflon Edge 43</em>' operation.
	 * @see RequirementsTransformator.Rules.XProviderToProviderRule#isAppropriate_BWD_EMoflonEdge_43(org.moflon.tgg.runtime.EMoflonEdge)
	 * @generated
	 */
	EOperation getXProviderToProviderRule__IsAppropriate_BWD_EMoflonEdge_43__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link RequirementsTransformator.Rules.XProviderToProviderRule#isAppropriate_FWD_EMoflonEdge_31(org.moflon.tgg.runtime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 31</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 31</em>' operation.
	 * @see RequirementsTransformator.Rules.XProviderToProviderRule#isAppropriate_FWD_EMoflonEdge_31(org.moflon.tgg.runtime.EMoflonEdge)
	 * @generated
	 */
	EOperation getXProviderToProviderRule__IsAppropriate_FWD_EMoflonEdge_31__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link RequirementsTransformator.Rules.XProviderToProviderRule#checkAttributes_FWD(org.moflon.tgg.runtime.TripleMatch) <em>Check Attributes FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check Attributes FWD</em>' operation.
	 * @see RequirementsTransformator.Rules.XProviderToProviderRule#checkAttributes_FWD(org.moflon.tgg.runtime.TripleMatch)
	 * @generated
	 */
	EOperation getXProviderToProviderRule__CheckAttributes_FWD__TripleMatch();

	/**
	 * Returns the meta object for the '{@link RequirementsTransformator.Rules.XProviderToProviderRule#checkAttributes_BWD(org.moflon.tgg.runtime.TripleMatch) <em>Check Attributes BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check Attributes BWD</em>' operation.
	 * @see RequirementsTransformator.Rules.XProviderToProviderRule#checkAttributes_BWD(org.moflon.tgg.runtime.TripleMatch)
	 * @generated
	 */
	EOperation getXProviderToProviderRule__CheckAttributes_BWD__TripleMatch();

	/**
	 * Returns the meta object for the '{@link RequirementsTransformator.Rules.XProviderToProviderRule#isApplicable_CC(org.moflon.tgg.runtime.Match, org.moflon.tgg.runtime.Match) <em>Is Applicable CC</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable CC</em>' operation.
	 * @see RequirementsTransformator.Rules.XProviderToProviderRule#isApplicable_CC(org.moflon.tgg.runtime.Match, org.moflon.tgg.runtime.Match)
	 * @generated
	 */
	EOperation getXProviderToProviderRule__IsApplicable_CC__Match_Match();

	/**
	 * Returns the meta object for the '{@link RequirementsTransformator.Rules.XProviderToProviderRule#isApplicable_solveCsp_CC(requirements.Container, requirements.Provider, requirementsXtext.reqXtext.XProvider, requirementsXtext.reqXtext.XContainer, org.moflon.tgg.runtime.Match, org.moflon.tgg.runtime.Match) <em>Is Applicable solve Csp CC</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable solve Csp CC</em>' operation.
	 * @see RequirementsTransformator.Rules.XProviderToProviderRule#isApplicable_solveCsp_CC(requirements.Container, requirements.Provider, requirementsXtext.reqXtext.XProvider, requirementsXtext.reqXtext.XContainer, org.moflon.tgg.runtime.Match, org.moflon.tgg.runtime.Match)
	 * @generated
	 */
	EOperation getXProviderToProviderRule__IsApplicable_solveCsp_CC__Container_Provider_XProvider_XContainer_Match_Match();

	/**
	 * Returns the meta object for the '{@link RequirementsTransformator.Rules.XProviderToProviderRule#isApplicable_checkCsp_CC(org.moflon.tgg.language.csp.CSP) <em>Is Applicable check Csp CC</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable check Csp CC</em>' operation.
	 * @see RequirementsTransformator.Rules.XProviderToProviderRule#isApplicable_checkCsp_CC(org.moflon.tgg.language.csp.CSP)
	 * @generated
	 */
	EOperation getXProviderToProviderRule__IsApplicable_checkCsp_CC__CSP();

	/**
	 * Returns the meta object for the '{@link RequirementsTransformator.Rules.XProviderToProviderRule#checkDEC_FWD(requirementsXtext.reqXtext.XProvider, requirementsXtext.reqXtext.XContainer) <em>Check DEC FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check DEC FWD</em>' operation.
	 * @see RequirementsTransformator.Rules.XProviderToProviderRule#checkDEC_FWD(requirementsXtext.reqXtext.XProvider, requirementsXtext.reqXtext.XContainer)
	 * @generated
	 */
	EOperation getXProviderToProviderRule__CheckDEC_FWD__XProvider_XContainer();

	/**
	 * Returns the meta object for the '{@link RequirementsTransformator.Rules.XProviderToProviderRule#checkDEC_BWD(requirements.Container, requirements.Provider) <em>Check DEC BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check DEC BWD</em>' operation.
	 * @see RequirementsTransformator.Rules.XProviderToProviderRule#checkDEC_BWD(requirements.Container, requirements.Provider)
	 * @generated
	 */
	EOperation getXProviderToProviderRule__CheckDEC_BWD__Container_Provider();

	/**
	 * Returns the meta object for the '{@link RequirementsTransformator.Rules.XProviderToProviderRule#generateModel(org.moflon.tgg.language.modelgenerator.RuleEntryContainer, RequirementsTransformator.XContainerToContainer) <em>Generate Model</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Generate Model</em>' operation.
	 * @see RequirementsTransformator.Rules.XProviderToProviderRule#generateModel(org.moflon.tgg.language.modelgenerator.RuleEntryContainer, RequirementsTransformator.XContainerToContainer)
	 * @generated
	 */
	EOperation getXProviderToProviderRule__GenerateModel__RuleEntryContainer_XContainerToContainer();

	/**
	 * Returns the meta object for the '{@link RequirementsTransformator.Rules.XProviderToProviderRule#generateModel_solveCsp_BWD(org.moflon.tgg.runtime.IsApplicableMatch, requirements.Container, RequirementsTransformator.XContainerToContainer, requirementsXtext.reqXtext.XContainer, org.moflon.tgg.runtime.ModelgeneratorRuleResult) <em>Generate Model solve Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Generate Model solve Csp BWD</em>' operation.
	 * @see RequirementsTransformator.Rules.XProviderToProviderRule#generateModel_solveCsp_BWD(org.moflon.tgg.runtime.IsApplicableMatch, requirements.Container, RequirementsTransformator.XContainerToContainer, requirementsXtext.reqXtext.XContainer, org.moflon.tgg.runtime.ModelgeneratorRuleResult)
	 * @generated
	 */
	EOperation getXProviderToProviderRule__GenerateModel_solveCsp_BWD__IsApplicableMatch_Container_XContainerToContainer_XContainer_ModelgeneratorRuleResult();

	/**
	 * Returns the meta object for the '{@link RequirementsTransformator.Rules.XProviderToProviderRule#generateModel_checkCsp_BWD(org.moflon.tgg.language.csp.CSP) <em>Generate Model check Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Generate Model check Csp BWD</em>' operation.
	 * @see RequirementsTransformator.Rules.XProviderToProviderRule#generateModel_checkCsp_BWD(org.moflon.tgg.language.csp.CSP)
	 * @generated
	 */
	EOperation getXProviderToProviderRule__GenerateModel_checkCsp_BWD__CSP();

	/**
	 * Returns the meta object for class '{@link RequirementsTransformator.Rules.XConsumerToConsumerRule <em>XConsumer To Consumer Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>XConsumer To Consumer Rule</em>'.
	 * @see RequirementsTransformator.Rules.XConsumerToConsumerRule
	 * @generated
	 */
	EClass getXConsumerToConsumerRule();

	/**
	 * Returns the meta object for the '{@link RequirementsTransformator.Rules.XConsumerToConsumerRule#isAppropriate_FWD(org.moflon.tgg.runtime.Match, requirementsXtext.reqXtext.XConsumer, requirementsXtext.reqXtext.XContainer) <em>Is Appropriate FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD</em>' operation.
	 * @see RequirementsTransformator.Rules.XConsumerToConsumerRule#isAppropriate_FWD(org.moflon.tgg.runtime.Match, requirementsXtext.reqXtext.XConsumer, requirementsXtext.reqXtext.XContainer)
	 * @generated
	 */
	EOperation getXConsumerToConsumerRule__IsAppropriate_FWD__Match_XConsumer_XContainer();

	/**
	 * Returns the meta object for the '{@link RequirementsTransformator.Rules.XConsumerToConsumerRule#perform_FWD(org.moflon.tgg.runtime.IsApplicableMatch) <em>Perform FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Perform FWD</em>' operation.
	 * @see RequirementsTransformator.Rules.XConsumerToConsumerRule#perform_FWD(org.moflon.tgg.runtime.IsApplicableMatch)
	 * @generated
	 */
	EOperation getXConsumerToConsumerRule__Perform_FWD__IsApplicableMatch();

	/**
	 * Returns the meta object for the '{@link RequirementsTransformator.Rules.XConsumerToConsumerRule#isApplicable_FWD(org.moflon.tgg.runtime.Match) <em>Is Applicable FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable FWD</em>' operation.
	 * @see RequirementsTransformator.Rules.XConsumerToConsumerRule#isApplicable_FWD(org.moflon.tgg.runtime.Match)
	 * @generated
	 */
	EOperation getXConsumerToConsumerRule__IsApplicable_FWD__Match();

	/**
	 * Returns the meta object for the '{@link RequirementsTransformator.Rules.XConsumerToConsumerRule#registerObjectsToMatch_FWD(org.moflon.tgg.runtime.Match, requirementsXtext.reqXtext.XConsumer, requirementsXtext.reqXtext.XContainer) <em>Register Objects To Match FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Register Objects To Match FWD</em>' operation.
	 * @see RequirementsTransformator.Rules.XConsumerToConsumerRule#registerObjectsToMatch_FWD(org.moflon.tgg.runtime.Match, requirementsXtext.reqXtext.XConsumer, requirementsXtext.reqXtext.XContainer)
	 * @generated
	 */
	EOperation getXConsumerToConsumerRule__RegisterObjectsToMatch_FWD__Match_XConsumer_XContainer();

	/**
	 * Returns the meta object for the '{@link RequirementsTransformator.Rules.XConsumerToConsumerRule#isAppropriate_solveCsp_FWD(org.moflon.tgg.runtime.Match, requirementsXtext.reqXtext.XConsumer, requirementsXtext.reqXtext.XContainer) <em>Is Appropriate solve Csp FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate solve Csp FWD</em>' operation.
	 * @see RequirementsTransformator.Rules.XConsumerToConsumerRule#isAppropriate_solveCsp_FWD(org.moflon.tgg.runtime.Match, requirementsXtext.reqXtext.XConsumer, requirementsXtext.reqXtext.XContainer)
	 * @generated
	 */
	EOperation getXConsumerToConsumerRule__IsAppropriate_solveCsp_FWD__Match_XConsumer_XContainer();

	/**
	 * Returns the meta object for the '{@link RequirementsTransformator.Rules.XConsumerToConsumerRule#isAppropriate_checkCsp_FWD(org.moflon.tgg.language.csp.CSP) <em>Is Appropriate check Csp FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate check Csp FWD</em>' operation.
	 * @see RequirementsTransformator.Rules.XConsumerToConsumerRule#isAppropriate_checkCsp_FWD(org.moflon.tgg.language.csp.CSP)
	 * @generated
	 */
	EOperation getXConsumerToConsumerRule__IsAppropriate_checkCsp_FWD__CSP();

	/**
	 * Returns the meta object for the '{@link RequirementsTransformator.Rules.XConsumerToConsumerRule#isApplicable_solveCsp_FWD(org.moflon.tgg.runtime.IsApplicableMatch, requirements.Container, requirementsXtext.reqXtext.XConsumer, RequirementsTransformator.XContainerToContainer, requirementsXtext.reqXtext.XContainer) <em>Is Applicable solve Csp FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable solve Csp FWD</em>' operation.
	 * @see RequirementsTransformator.Rules.XConsumerToConsumerRule#isApplicable_solveCsp_FWD(org.moflon.tgg.runtime.IsApplicableMatch, requirements.Container, requirementsXtext.reqXtext.XConsumer, RequirementsTransformator.XContainerToContainer, requirementsXtext.reqXtext.XContainer)
	 * @generated
	 */
	EOperation getXConsumerToConsumerRule__IsApplicable_solveCsp_FWD__IsApplicableMatch_Container_XConsumer_XContainerToContainer_XContainer();

	/**
	 * Returns the meta object for the '{@link RequirementsTransformator.Rules.XConsumerToConsumerRule#isApplicable_checkCsp_FWD(org.moflon.tgg.language.csp.CSP) <em>Is Applicable check Csp FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable check Csp FWD</em>' operation.
	 * @see RequirementsTransformator.Rules.XConsumerToConsumerRule#isApplicable_checkCsp_FWD(org.moflon.tgg.language.csp.CSP)
	 * @generated
	 */
	EOperation getXConsumerToConsumerRule__IsApplicable_checkCsp_FWD__CSP();

	/**
	 * Returns the meta object for the '{@link RequirementsTransformator.Rules.XConsumerToConsumerRule#registerObjects_FWD(org.moflon.tgg.runtime.PerformRuleResult, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject) <em>Register Objects FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Register Objects FWD</em>' operation.
	 * @see RequirementsTransformator.Rules.XConsumerToConsumerRule#registerObjects_FWD(org.moflon.tgg.runtime.PerformRuleResult, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	EOperation getXConsumerToConsumerRule__RegisterObjects_FWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject();

	/**
	 * Returns the meta object for the '{@link RequirementsTransformator.Rules.XConsumerToConsumerRule#checkTypes_FWD(org.moflon.tgg.runtime.Match) <em>Check Types FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check Types FWD</em>' operation.
	 * @see RequirementsTransformator.Rules.XConsumerToConsumerRule#checkTypes_FWD(org.moflon.tgg.runtime.Match)
	 * @generated
	 */
	EOperation getXConsumerToConsumerRule__CheckTypes_FWD__Match();

	/**
	 * Returns the meta object for the '{@link RequirementsTransformator.Rules.XConsumerToConsumerRule#isAppropriate_BWD(org.moflon.tgg.runtime.Match, requirements.Container, requirements.Consumer) <em>Is Appropriate BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD</em>' operation.
	 * @see RequirementsTransformator.Rules.XConsumerToConsumerRule#isAppropriate_BWD(org.moflon.tgg.runtime.Match, requirements.Container, requirements.Consumer)
	 * @generated
	 */
	EOperation getXConsumerToConsumerRule__IsAppropriate_BWD__Match_Container_Consumer();

	/**
	 * Returns the meta object for the '{@link RequirementsTransformator.Rules.XConsumerToConsumerRule#perform_BWD(org.moflon.tgg.runtime.IsApplicableMatch) <em>Perform BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Perform BWD</em>' operation.
	 * @see RequirementsTransformator.Rules.XConsumerToConsumerRule#perform_BWD(org.moflon.tgg.runtime.IsApplicableMatch)
	 * @generated
	 */
	EOperation getXConsumerToConsumerRule__Perform_BWD__IsApplicableMatch();

	/**
	 * Returns the meta object for the '{@link RequirementsTransformator.Rules.XConsumerToConsumerRule#isApplicable_BWD(org.moflon.tgg.runtime.Match) <em>Is Applicable BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable BWD</em>' operation.
	 * @see RequirementsTransformator.Rules.XConsumerToConsumerRule#isApplicable_BWD(org.moflon.tgg.runtime.Match)
	 * @generated
	 */
	EOperation getXConsumerToConsumerRule__IsApplicable_BWD__Match();

	/**
	 * Returns the meta object for the '{@link RequirementsTransformator.Rules.XConsumerToConsumerRule#registerObjectsToMatch_BWD(org.moflon.tgg.runtime.Match, requirements.Container, requirements.Consumer) <em>Register Objects To Match BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Register Objects To Match BWD</em>' operation.
	 * @see RequirementsTransformator.Rules.XConsumerToConsumerRule#registerObjectsToMatch_BWD(org.moflon.tgg.runtime.Match, requirements.Container, requirements.Consumer)
	 * @generated
	 */
	EOperation getXConsumerToConsumerRule__RegisterObjectsToMatch_BWD__Match_Container_Consumer();

	/**
	 * Returns the meta object for the '{@link RequirementsTransformator.Rules.XConsumerToConsumerRule#isAppropriate_solveCsp_BWD(org.moflon.tgg.runtime.Match, requirements.Container, requirements.Consumer) <em>Is Appropriate solve Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate solve Csp BWD</em>' operation.
	 * @see RequirementsTransformator.Rules.XConsumerToConsumerRule#isAppropriate_solveCsp_BWD(org.moflon.tgg.runtime.Match, requirements.Container, requirements.Consumer)
	 * @generated
	 */
	EOperation getXConsumerToConsumerRule__IsAppropriate_solveCsp_BWD__Match_Container_Consumer();

	/**
	 * Returns the meta object for the '{@link RequirementsTransformator.Rules.XConsumerToConsumerRule#isAppropriate_checkCsp_BWD(org.moflon.tgg.language.csp.CSP) <em>Is Appropriate check Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate check Csp BWD</em>' operation.
	 * @see RequirementsTransformator.Rules.XConsumerToConsumerRule#isAppropriate_checkCsp_BWD(org.moflon.tgg.language.csp.CSP)
	 * @generated
	 */
	EOperation getXConsumerToConsumerRule__IsAppropriate_checkCsp_BWD__CSP();

	/**
	 * Returns the meta object for the '{@link RequirementsTransformator.Rules.XConsumerToConsumerRule#isApplicable_solveCsp_BWD(org.moflon.tgg.runtime.IsApplicableMatch, requirements.Container, requirements.Consumer, RequirementsTransformator.XContainerToContainer, requirementsXtext.reqXtext.XContainer) <em>Is Applicable solve Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable solve Csp BWD</em>' operation.
	 * @see RequirementsTransformator.Rules.XConsumerToConsumerRule#isApplicable_solveCsp_BWD(org.moflon.tgg.runtime.IsApplicableMatch, requirements.Container, requirements.Consumer, RequirementsTransformator.XContainerToContainer, requirementsXtext.reqXtext.XContainer)
	 * @generated
	 */
	EOperation getXConsumerToConsumerRule__IsApplicable_solveCsp_BWD__IsApplicableMatch_Container_Consumer_XContainerToContainer_XContainer();

	/**
	 * Returns the meta object for the '{@link RequirementsTransformator.Rules.XConsumerToConsumerRule#isApplicable_checkCsp_BWD(org.moflon.tgg.language.csp.CSP) <em>Is Applicable check Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable check Csp BWD</em>' operation.
	 * @see RequirementsTransformator.Rules.XConsumerToConsumerRule#isApplicable_checkCsp_BWD(org.moflon.tgg.language.csp.CSP)
	 * @generated
	 */
	EOperation getXConsumerToConsumerRule__IsApplicable_checkCsp_BWD__CSP();

	/**
	 * Returns the meta object for the '{@link RequirementsTransformator.Rules.XConsumerToConsumerRule#registerObjects_BWD(org.moflon.tgg.runtime.PerformRuleResult, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject) <em>Register Objects BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Register Objects BWD</em>' operation.
	 * @see RequirementsTransformator.Rules.XConsumerToConsumerRule#registerObjects_BWD(org.moflon.tgg.runtime.PerformRuleResult, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	EOperation getXConsumerToConsumerRule__RegisterObjects_BWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject();

	/**
	 * Returns the meta object for the '{@link RequirementsTransformator.Rules.XConsumerToConsumerRule#checkTypes_BWD(org.moflon.tgg.runtime.Match) <em>Check Types BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check Types BWD</em>' operation.
	 * @see RequirementsTransformator.Rules.XConsumerToConsumerRule#checkTypes_BWD(org.moflon.tgg.runtime.Match)
	 * @generated
	 */
	EOperation getXConsumerToConsumerRule__CheckTypes_BWD__Match();

	/**
	 * Returns the meta object for the '{@link RequirementsTransformator.Rules.XConsumerToConsumerRule#isAppropriate_BWD_EMoflonEdge_44(org.moflon.tgg.runtime.EMoflonEdge) <em>Is Appropriate BWD EMoflon Edge 44</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD EMoflon Edge 44</em>' operation.
	 * @see RequirementsTransformator.Rules.XConsumerToConsumerRule#isAppropriate_BWD_EMoflonEdge_44(org.moflon.tgg.runtime.EMoflonEdge)
	 * @generated
	 */
	EOperation getXConsumerToConsumerRule__IsAppropriate_BWD_EMoflonEdge_44__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link RequirementsTransformator.Rules.XConsumerToConsumerRule#isAppropriate_FWD_EMoflonEdge_32(org.moflon.tgg.runtime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 32</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 32</em>' operation.
	 * @see RequirementsTransformator.Rules.XConsumerToConsumerRule#isAppropriate_FWD_EMoflonEdge_32(org.moflon.tgg.runtime.EMoflonEdge)
	 * @generated
	 */
	EOperation getXConsumerToConsumerRule__IsAppropriate_FWD_EMoflonEdge_32__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link RequirementsTransformator.Rules.XConsumerToConsumerRule#checkAttributes_FWD(org.moflon.tgg.runtime.TripleMatch) <em>Check Attributes FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check Attributes FWD</em>' operation.
	 * @see RequirementsTransformator.Rules.XConsumerToConsumerRule#checkAttributes_FWD(org.moflon.tgg.runtime.TripleMatch)
	 * @generated
	 */
	EOperation getXConsumerToConsumerRule__CheckAttributes_FWD__TripleMatch();

	/**
	 * Returns the meta object for the '{@link RequirementsTransformator.Rules.XConsumerToConsumerRule#checkAttributes_BWD(org.moflon.tgg.runtime.TripleMatch) <em>Check Attributes BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check Attributes BWD</em>' operation.
	 * @see RequirementsTransformator.Rules.XConsumerToConsumerRule#checkAttributes_BWD(org.moflon.tgg.runtime.TripleMatch)
	 * @generated
	 */
	EOperation getXConsumerToConsumerRule__CheckAttributes_BWD__TripleMatch();

	/**
	 * Returns the meta object for the '{@link RequirementsTransformator.Rules.XConsumerToConsumerRule#isApplicable_CC(org.moflon.tgg.runtime.Match, org.moflon.tgg.runtime.Match) <em>Is Applicable CC</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable CC</em>' operation.
	 * @see RequirementsTransformator.Rules.XConsumerToConsumerRule#isApplicable_CC(org.moflon.tgg.runtime.Match, org.moflon.tgg.runtime.Match)
	 * @generated
	 */
	EOperation getXConsumerToConsumerRule__IsApplicable_CC__Match_Match();

	/**
	 * Returns the meta object for the '{@link RequirementsTransformator.Rules.XConsumerToConsumerRule#isApplicable_solveCsp_CC(requirements.Container, requirements.Consumer, requirementsXtext.reqXtext.XConsumer, requirementsXtext.reqXtext.XContainer, org.moflon.tgg.runtime.Match, org.moflon.tgg.runtime.Match) <em>Is Applicable solve Csp CC</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable solve Csp CC</em>' operation.
	 * @see RequirementsTransformator.Rules.XConsumerToConsumerRule#isApplicable_solveCsp_CC(requirements.Container, requirements.Consumer, requirementsXtext.reqXtext.XConsumer, requirementsXtext.reqXtext.XContainer, org.moflon.tgg.runtime.Match, org.moflon.tgg.runtime.Match)
	 * @generated
	 */
	EOperation getXConsumerToConsumerRule__IsApplicable_solveCsp_CC__Container_Consumer_XConsumer_XContainer_Match_Match();

	/**
	 * Returns the meta object for the '{@link RequirementsTransformator.Rules.XConsumerToConsumerRule#isApplicable_checkCsp_CC(org.moflon.tgg.language.csp.CSP) <em>Is Applicable check Csp CC</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable check Csp CC</em>' operation.
	 * @see RequirementsTransformator.Rules.XConsumerToConsumerRule#isApplicable_checkCsp_CC(org.moflon.tgg.language.csp.CSP)
	 * @generated
	 */
	EOperation getXConsumerToConsumerRule__IsApplicable_checkCsp_CC__CSP();

	/**
	 * Returns the meta object for the '{@link RequirementsTransformator.Rules.XConsumerToConsumerRule#checkDEC_FWD(requirementsXtext.reqXtext.XConsumer, requirementsXtext.reqXtext.XContainer) <em>Check DEC FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check DEC FWD</em>' operation.
	 * @see RequirementsTransformator.Rules.XConsumerToConsumerRule#checkDEC_FWD(requirementsXtext.reqXtext.XConsumer, requirementsXtext.reqXtext.XContainer)
	 * @generated
	 */
	EOperation getXConsumerToConsumerRule__CheckDEC_FWD__XConsumer_XContainer();

	/**
	 * Returns the meta object for the '{@link RequirementsTransformator.Rules.XConsumerToConsumerRule#checkDEC_BWD(requirements.Container, requirements.Consumer) <em>Check DEC BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check DEC BWD</em>' operation.
	 * @see RequirementsTransformator.Rules.XConsumerToConsumerRule#checkDEC_BWD(requirements.Container, requirements.Consumer)
	 * @generated
	 */
	EOperation getXConsumerToConsumerRule__CheckDEC_BWD__Container_Consumer();

	/**
	 * Returns the meta object for the '{@link RequirementsTransformator.Rules.XConsumerToConsumerRule#generateModel(org.moflon.tgg.language.modelgenerator.RuleEntryContainer, RequirementsTransformator.XContainerToContainer) <em>Generate Model</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Generate Model</em>' operation.
	 * @see RequirementsTransformator.Rules.XConsumerToConsumerRule#generateModel(org.moflon.tgg.language.modelgenerator.RuleEntryContainer, RequirementsTransformator.XContainerToContainer)
	 * @generated
	 */
	EOperation getXConsumerToConsumerRule__GenerateModel__RuleEntryContainer_XContainerToContainer();

	/**
	 * Returns the meta object for the '{@link RequirementsTransformator.Rules.XConsumerToConsumerRule#generateModel_solveCsp_BWD(org.moflon.tgg.runtime.IsApplicableMatch, requirements.Container, RequirementsTransformator.XContainerToContainer, requirementsXtext.reqXtext.XContainer, org.moflon.tgg.runtime.ModelgeneratorRuleResult) <em>Generate Model solve Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Generate Model solve Csp BWD</em>' operation.
	 * @see RequirementsTransformator.Rules.XConsumerToConsumerRule#generateModel_solveCsp_BWD(org.moflon.tgg.runtime.IsApplicableMatch, requirements.Container, RequirementsTransformator.XContainerToContainer, requirementsXtext.reqXtext.XContainer, org.moflon.tgg.runtime.ModelgeneratorRuleResult)
	 * @generated
	 */
	EOperation getXConsumerToConsumerRule__GenerateModel_solveCsp_BWD__IsApplicableMatch_Container_XContainerToContainer_XContainer_ModelgeneratorRuleResult();

	/**
	 * Returns the meta object for the '{@link RequirementsTransformator.Rules.XConsumerToConsumerRule#generateModel_checkCsp_BWD(org.moflon.tgg.language.csp.CSP) <em>Generate Model check Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Generate Model check Csp BWD</em>' operation.
	 * @see RequirementsTransformator.Rules.XConsumerToConsumerRule#generateModel_checkCsp_BWD(org.moflon.tgg.language.csp.CSP)
	 * @generated
	 */
	EOperation getXConsumerToConsumerRule__GenerateModel_checkCsp_BWD__CSP();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	RulesFactory getRulesFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link RequirementsTransformator.Rules.impl.XAgentToAgentRuleImpl <em>XAgent To Agent Rule</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see RequirementsTransformator.Rules.impl.XAgentToAgentRuleImpl
		 * @see RequirementsTransformator.Rules.impl.RulesPackageImpl#getXAgentToAgentRule()
		 * @generated
		 */
		EClass XAGENT_TO_AGENT_RULE = eINSTANCE.getXAgentToAgentRule();

		/**
		 * The meta object literal for the '{@link RequirementsTransformator.Rules.impl.XContainerToContainerRuleImpl <em>XContainer To Container Rule</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see RequirementsTransformator.Rules.impl.XContainerToContainerRuleImpl
		 * @see RequirementsTransformator.Rules.impl.RulesPackageImpl#getXContainerToContainerRule()
		 * @generated
		 */
		EClass XCONTAINER_TO_CONTAINER_RULE = eINSTANCE.getXContainerToContainerRule();

		/**
		 * The meta object literal for the '<em><b>Is Appropriate FWD</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation XCONTAINER_TO_CONTAINER_RULE___IS_APPROPRIATE_FWD__MATCH_XCONTAINER = eINSTANCE
				.getXContainerToContainerRule__IsAppropriate_FWD__Match_XContainer();

		/**
		 * The meta object literal for the '<em><b>Perform FWD</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation XCONTAINER_TO_CONTAINER_RULE___PERFORM_FWD__ISAPPLICABLEMATCH = eINSTANCE
				.getXContainerToContainerRule__Perform_FWD__IsApplicableMatch();

		/**
		 * The meta object literal for the '<em><b>Is Applicable FWD</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation XCONTAINER_TO_CONTAINER_RULE___IS_APPLICABLE_FWD__MATCH = eINSTANCE
				.getXContainerToContainerRule__IsApplicable_FWD__Match();

		/**
		 * The meta object literal for the '<em><b>Register Objects To Match FWD</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation XCONTAINER_TO_CONTAINER_RULE___REGISTER_OBJECTS_TO_MATCH_FWD__MATCH_XCONTAINER = eINSTANCE
				.getXContainerToContainerRule__RegisterObjectsToMatch_FWD__Match_XContainer();

		/**
		 * The meta object literal for the '<em><b>Is Appropriate solve Csp FWD</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation XCONTAINER_TO_CONTAINER_RULE___IS_APPROPRIATE_SOLVE_CSP_FWD__MATCH_XCONTAINER = eINSTANCE
				.getXContainerToContainerRule__IsAppropriate_solveCsp_FWD__Match_XContainer();

		/**
		 * The meta object literal for the '<em><b>Is Appropriate check Csp FWD</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation XCONTAINER_TO_CONTAINER_RULE___IS_APPROPRIATE_CHECK_CSP_FWD__CSP = eINSTANCE
				.getXContainerToContainerRule__IsAppropriate_checkCsp_FWD__CSP();

		/**
		 * The meta object literal for the '<em><b>Is Applicable solve Csp FWD</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation XCONTAINER_TO_CONTAINER_RULE___IS_APPLICABLE_SOLVE_CSP_FWD__ISAPPLICABLEMATCH_XCONTAINER = eINSTANCE
				.getXContainerToContainerRule__IsApplicable_solveCsp_FWD__IsApplicableMatch_XContainer();

		/**
		 * The meta object literal for the '<em><b>Is Applicable check Csp FWD</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation XCONTAINER_TO_CONTAINER_RULE___IS_APPLICABLE_CHECK_CSP_FWD__CSP = eINSTANCE
				.getXContainerToContainerRule__IsApplicable_checkCsp_FWD__CSP();

		/**
		 * The meta object literal for the '<em><b>Register Objects FWD</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation XCONTAINER_TO_CONTAINER_RULE___REGISTER_OBJECTS_FWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT = eINSTANCE
				.getXContainerToContainerRule__RegisterObjects_FWD__PerformRuleResult_EObject_EObject_EObject_EObject();

		/**
		 * The meta object literal for the '<em><b>Check Types FWD</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation XCONTAINER_TO_CONTAINER_RULE___CHECK_TYPES_FWD__MATCH = eINSTANCE
				.getXContainerToContainerRule__CheckTypes_FWD__Match();

		/**
		 * The meta object literal for the '<em><b>Is Appropriate BWD</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation XCONTAINER_TO_CONTAINER_RULE___IS_APPROPRIATE_BWD__MATCH_CONTAINER_NETWORKSPAN = eINSTANCE
				.getXContainerToContainerRule__IsAppropriate_BWD__Match_Container_NetworkSpan();

		/**
		 * The meta object literal for the '<em><b>Perform BWD</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation XCONTAINER_TO_CONTAINER_RULE___PERFORM_BWD__ISAPPLICABLEMATCH = eINSTANCE
				.getXContainerToContainerRule__Perform_BWD__IsApplicableMatch();

		/**
		 * The meta object literal for the '<em><b>Is Applicable BWD</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation XCONTAINER_TO_CONTAINER_RULE___IS_APPLICABLE_BWD__MATCH = eINSTANCE
				.getXContainerToContainerRule__IsApplicable_BWD__Match();

		/**
		 * The meta object literal for the '<em><b>Register Objects To Match BWD</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation XCONTAINER_TO_CONTAINER_RULE___REGISTER_OBJECTS_TO_MATCH_BWD__MATCH_CONTAINER_NETWORKSPAN = eINSTANCE
				.getXContainerToContainerRule__RegisterObjectsToMatch_BWD__Match_Container_NetworkSpan();

		/**
		 * The meta object literal for the '<em><b>Is Appropriate solve Csp BWD</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation XCONTAINER_TO_CONTAINER_RULE___IS_APPROPRIATE_SOLVE_CSP_BWD__MATCH_CONTAINER_NETWORKSPAN = eINSTANCE
				.getXContainerToContainerRule__IsAppropriate_solveCsp_BWD__Match_Container_NetworkSpan();

		/**
		 * The meta object literal for the '<em><b>Is Appropriate check Csp BWD</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation XCONTAINER_TO_CONTAINER_RULE___IS_APPROPRIATE_CHECK_CSP_BWD__CSP = eINSTANCE
				.getXContainerToContainerRule__IsAppropriate_checkCsp_BWD__CSP();

		/**
		 * The meta object literal for the '<em><b>Is Applicable solve Csp BWD</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation XCONTAINER_TO_CONTAINER_RULE___IS_APPLICABLE_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_CONTAINER_NETWORKSPAN = eINSTANCE
				.getXContainerToContainerRule__IsApplicable_solveCsp_BWD__IsApplicableMatch_Container_NetworkSpan();

		/**
		 * The meta object literal for the '<em><b>Is Applicable check Csp BWD</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation XCONTAINER_TO_CONTAINER_RULE___IS_APPLICABLE_CHECK_CSP_BWD__CSP = eINSTANCE
				.getXContainerToContainerRule__IsApplicable_checkCsp_BWD__CSP();

		/**
		 * The meta object literal for the '<em><b>Register Objects BWD</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation XCONTAINER_TO_CONTAINER_RULE___REGISTER_OBJECTS_BWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT = eINSTANCE
				.getXContainerToContainerRule__RegisterObjects_BWD__PerformRuleResult_EObject_EObject_EObject_EObject();

		/**
		 * The meta object literal for the '<em><b>Check Types BWD</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation XCONTAINER_TO_CONTAINER_RULE___CHECK_TYPES_BWD__MATCH = eINSTANCE
				.getXContainerToContainerRule__CheckTypes_BWD__Match();

		/**
		 * The meta object literal for the '<em><b>Is Appropriate FWD XContainer 4</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation XCONTAINER_TO_CONTAINER_RULE___IS_APPROPRIATE_FWD_XCONTAINER_4__XCONTAINER = eINSTANCE
				.getXContainerToContainerRule__IsAppropriate_FWD_XContainer_4__XContainer();

		/**
		 * The meta object literal for the '<em><b>Is Appropriate BWD EMoflon Edge 42</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation XCONTAINER_TO_CONTAINER_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_42__EMOFLONEDGE = eINSTANCE
				.getXContainerToContainerRule__IsAppropriate_BWD_EMoflonEdge_42__EMoflonEdge();

		/**
		 * The meta object literal for the '<em><b>Check Attributes FWD</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation XCONTAINER_TO_CONTAINER_RULE___CHECK_ATTRIBUTES_FWD__TRIPLEMATCH = eINSTANCE
				.getXContainerToContainerRule__CheckAttributes_FWD__TripleMatch();

		/**
		 * The meta object literal for the '<em><b>Check Attributes BWD</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation XCONTAINER_TO_CONTAINER_RULE___CHECK_ATTRIBUTES_BWD__TRIPLEMATCH = eINSTANCE
				.getXContainerToContainerRule__CheckAttributes_BWD__TripleMatch();

		/**
		 * The meta object literal for the '<em><b>Is Applicable CC</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation XCONTAINER_TO_CONTAINER_RULE___IS_APPLICABLE_CC__MATCH_MATCH = eINSTANCE
				.getXContainerToContainerRule__IsApplicable_CC__Match_Match();

		/**
		 * The meta object literal for the '<em><b>Is Applicable solve Csp CC</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation XCONTAINER_TO_CONTAINER_RULE___IS_APPLICABLE_SOLVE_CSP_CC__XCONTAINER_CONTAINER_NETWORKSPAN_MATCH_MATCH = eINSTANCE
				.getXContainerToContainerRule__IsApplicable_solveCsp_CC__XContainer_Container_NetworkSpan_Match_Match();

		/**
		 * The meta object literal for the '<em><b>Is Applicable check Csp CC</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation XCONTAINER_TO_CONTAINER_RULE___IS_APPLICABLE_CHECK_CSP_CC__CSP = eINSTANCE
				.getXContainerToContainerRule__IsApplicable_checkCsp_CC__CSP();

		/**
		 * The meta object literal for the '<em><b>Check DEC FWD</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation XCONTAINER_TO_CONTAINER_RULE___CHECK_DEC_FWD__XCONTAINER = eINSTANCE
				.getXContainerToContainerRule__CheckDEC_FWD__XContainer();

		/**
		 * The meta object literal for the '<em><b>Check DEC BWD</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation XCONTAINER_TO_CONTAINER_RULE___CHECK_DEC_BWD__CONTAINER_NETWORKSPAN = eINSTANCE
				.getXContainerToContainerRule__CheckDEC_BWD__Container_NetworkSpan();

		/**
		 * The meta object literal for the '<em><b>Generate Model</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation XCONTAINER_TO_CONTAINER_RULE___GENERATE_MODEL__RULEENTRYCONTAINER = eINSTANCE
				.getXContainerToContainerRule__GenerateModel__RuleEntryContainer();

		/**
		 * The meta object literal for the '<em><b>Generate Model solve Csp BWD</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation XCONTAINER_TO_CONTAINER_RULE___GENERATE_MODEL_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_MODELGENERATORRULERESULT = eINSTANCE
				.getXContainerToContainerRule__GenerateModel_solveCsp_BWD__IsApplicableMatch_ModelgeneratorRuleResult();

		/**
		 * The meta object literal for the '<em><b>Generate Model check Csp BWD</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation XCONTAINER_TO_CONTAINER_RULE___GENERATE_MODEL_CHECK_CSP_BWD__CSP = eINSTANCE
				.getXContainerToContainerRule__GenerateModel_checkCsp_BWD__CSP();

		/**
		 * The meta object literal for the '{@link RequirementsTransformator.Rules.impl.XProviderToProviderRuleImpl <em>XProvider To Provider Rule</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see RequirementsTransformator.Rules.impl.XProviderToProviderRuleImpl
		 * @see RequirementsTransformator.Rules.impl.RulesPackageImpl#getXProviderToProviderRule()
		 * @generated
		 */
		EClass XPROVIDER_TO_PROVIDER_RULE = eINSTANCE.getXProviderToProviderRule();

		/**
		 * The meta object literal for the '<em><b>Is Appropriate FWD</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation XPROVIDER_TO_PROVIDER_RULE___IS_APPROPRIATE_FWD__MATCH_XPROVIDER_XCONTAINER = eINSTANCE
				.getXProviderToProviderRule__IsAppropriate_FWD__Match_XProvider_XContainer();

		/**
		 * The meta object literal for the '<em><b>Perform FWD</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation XPROVIDER_TO_PROVIDER_RULE___PERFORM_FWD__ISAPPLICABLEMATCH = eINSTANCE
				.getXProviderToProviderRule__Perform_FWD__IsApplicableMatch();

		/**
		 * The meta object literal for the '<em><b>Is Applicable FWD</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation XPROVIDER_TO_PROVIDER_RULE___IS_APPLICABLE_FWD__MATCH = eINSTANCE
				.getXProviderToProviderRule__IsApplicable_FWD__Match();

		/**
		 * The meta object literal for the '<em><b>Register Objects To Match FWD</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation XPROVIDER_TO_PROVIDER_RULE___REGISTER_OBJECTS_TO_MATCH_FWD__MATCH_XPROVIDER_XCONTAINER = eINSTANCE
				.getXProviderToProviderRule__RegisterObjectsToMatch_FWD__Match_XProvider_XContainer();

		/**
		 * The meta object literal for the '<em><b>Is Appropriate solve Csp FWD</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation XPROVIDER_TO_PROVIDER_RULE___IS_APPROPRIATE_SOLVE_CSP_FWD__MATCH_XPROVIDER_XCONTAINER = eINSTANCE
				.getXProviderToProviderRule__IsAppropriate_solveCsp_FWD__Match_XProvider_XContainer();

		/**
		 * The meta object literal for the '<em><b>Is Appropriate check Csp FWD</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation XPROVIDER_TO_PROVIDER_RULE___IS_APPROPRIATE_CHECK_CSP_FWD__CSP = eINSTANCE
				.getXProviderToProviderRule__IsAppropriate_checkCsp_FWD__CSP();

		/**
		 * The meta object literal for the '<em><b>Is Applicable solve Csp FWD</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation XPROVIDER_TO_PROVIDER_RULE___IS_APPLICABLE_SOLVE_CSP_FWD__ISAPPLICABLEMATCH_CONTAINER_XPROVIDER_XCONTAINERTOCONTAINER_XCONTAINER = eINSTANCE
				.getXProviderToProviderRule__IsApplicable_solveCsp_FWD__IsApplicableMatch_Container_XProvider_XContainerToContainer_XContainer();

		/**
		 * The meta object literal for the '<em><b>Is Applicable check Csp FWD</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation XPROVIDER_TO_PROVIDER_RULE___IS_APPLICABLE_CHECK_CSP_FWD__CSP = eINSTANCE
				.getXProviderToProviderRule__IsApplicable_checkCsp_FWD__CSP();

		/**
		 * The meta object literal for the '<em><b>Register Objects FWD</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation XPROVIDER_TO_PROVIDER_RULE___REGISTER_OBJECTS_FWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT = eINSTANCE
				.getXProviderToProviderRule__RegisterObjects_FWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject();

		/**
		 * The meta object literal for the '<em><b>Check Types FWD</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation XPROVIDER_TO_PROVIDER_RULE___CHECK_TYPES_FWD__MATCH = eINSTANCE
				.getXProviderToProviderRule__CheckTypes_FWD__Match();

		/**
		 * The meta object literal for the '<em><b>Is Appropriate BWD</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation XPROVIDER_TO_PROVIDER_RULE___IS_APPROPRIATE_BWD__MATCH_CONTAINER_PROVIDER = eINSTANCE
				.getXProviderToProviderRule__IsAppropriate_BWD__Match_Container_Provider();

		/**
		 * The meta object literal for the '<em><b>Perform BWD</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation XPROVIDER_TO_PROVIDER_RULE___PERFORM_BWD__ISAPPLICABLEMATCH = eINSTANCE
				.getXProviderToProviderRule__Perform_BWD__IsApplicableMatch();

		/**
		 * The meta object literal for the '<em><b>Is Applicable BWD</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation XPROVIDER_TO_PROVIDER_RULE___IS_APPLICABLE_BWD__MATCH = eINSTANCE
				.getXProviderToProviderRule__IsApplicable_BWD__Match();

		/**
		 * The meta object literal for the '<em><b>Register Objects To Match BWD</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation XPROVIDER_TO_PROVIDER_RULE___REGISTER_OBJECTS_TO_MATCH_BWD__MATCH_CONTAINER_PROVIDER = eINSTANCE
				.getXProviderToProviderRule__RegisterObjectsToMatch_BWD__Match_Container_Provider();

		/**
		 * The meta object literal for the '<em><b>Is Appropriate solve Csp BWD</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation XPROVIDER_TO_PROVIDER_RULE___IS_APPROPRIATE_SOLVE_CSP_BWD__MATCH_CONTAINER_PROVIDER = eINSTANCE
				.getXProviderToProviderRule__IsAppropriate_solveCsp_BWD__Match_Container_Provider();

		/**
		 * The meta object literal for the '<em><b>Is Appropriate check Csp BWD</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation XPROVIDER_TO_PROVIDER_RULE___IS_APPROPRIATE_CHECK_CSP_BWD__CSP = eINSTANCE
				.getXProviderToProviderRule__IsAppropriate_checkCsp_BWD__CSP();

		/**
		 * The meta object literal for the '<em><b>Is Applicable solve Csp BWD</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation XPROVIDER_TO_PROVIDER_RULE___IS_APPLICABLE_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_CONTAINER_PROVIDER_XCONTAINERTOCONTAINER_XCONTAINER = eINSTANCE
				.getXProviderToProviderRule__IsApplicable_solveCsp_BWD__IsApplicableMatch_Container_Provider_XContainerToContainer_XContainer();

		/**
		 * The meta object literal for the '<em><b>Is Applicable check Csp BWD</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation XPROVIDER_TO_PROVIDER_RULE___IS_APPLICABLE_CHECK_CSP_BWD__CSP = eINSTANCE
				.getXProviderToProviderRule__IsApplicable_checkCsp_BWD__CSP();

		/**
		 * The meta object literal for the '<em><b>Register Objects BWD</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation XPROVIDER_TO_PROVIDER_RULE___REGISTER_OBJECTS_BWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT = eINSTANCE
				.getXProviderToProviderRule__RegisterObjects_BWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject();

		/**
		 * The meta object literal for the '<em><b>Check Types BWD</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation XPROVIDER_TO_PROVIDER_RULE___CHECK_TYPES_BWD__MATCH = eINSTANCE
				.getXProviderToProviderRule__CheckTypes_BWD__Match();

		/**
		 * The meta object literal for the '<em><b>Is Appropriate BWD EMoflon Edge 43</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation XPROVIDER_TO_PROVIDER_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_43__EMOFLONEDGE = eINSTANCE
				.getXProviderToProviderRule__IsAppropriate_BWD_EMoflonEdge_43__EMoflonEdge();

		/**
		 * The meta object literal for the '<em><b>Is Appropriate FWD EMoflon Edge 31</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation XPROVIDER_TO_PROVIDER_RULE___IS_APPROPRIATE_FWD_EMOFLON_EDGE_31__EMOFLONEDGE = eINSTANCE
				.getXProviderToProviderRule__IsAppropriate_FWD_EMoflonEdge_31__EMoflonEdge();

		/**
		 * The meta object literal for the '<em><b>Check Attributes FWD</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation XPROVIDER_TO_PROVIDER_RULE___CHECK_ATTRIBUTES_FWD__TRIPLEMATCH = eINSTANCE
				.getXProviderToProviderRule__CheckAttributes_FWD__TripleMatch();

		/**
		 * The meta object literal for the '<em><b>Check Attributes BWD</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation XPROVIDER_TO_PROVIDER_RULE___CHECK_ATTRIBUTES_BWD__TRIPLEMATCH = eINSTANCE
				.getXProviderToProviderRule__CheckAttributes_BWD__TripleMatch();

		/**
		 * The meta object literal for the '<em><b>Is Applicable CC</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation XPROVIDER_TO_PROVIDER_RULE___IS_APPLICABLE_CC__MATCH_MATCH = eINSTANCE
				.getXProviderToProviderRule__IsApplicable_CC__Match_Match();

		/**
		 * The meta object literal for the '<em><b>Is Applicable solve Csp CC</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation XPROVIDER_TO_PROVIDER_RULE___IS_APPLICABLE_SOLVE_CSP_CC__CONTAINER_PROVIDER_XPROVIDER_XCONTAINER_MATCH_MATCH = eINSTANCE
				.getXProviderToProviderRule__IsApplicable_solveCsp_CC__Container_Provider_XProvider_XContainer_Match_Match();

		/**
		 * The meta object literal for the '<em><b>Is Applicable check Csp CC</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation XPROVIDER_TO_PROVIDER_RULE___IS_APPLICABLE_CHECK_CSP_CC__CSP = eINSTANCE
				.getXProviderToProviderRule__IsApplicable_checkCsp_CC__CSP();

		/**
		 * The meta object literal for the '<em><b>Check DEC FWD</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation XPROVIDER_TO_PROVIDER_RULE___CHECK_DEC_FWD__XPROVIDER_XCONTAINER = eINSTANCE
				.getXProviderToProviderRule__CheckDEC_FWD__XProvider_XContainer();

		/**
		 * The meta object literal for the '<em><b>Check DEC BWD</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation XPROVIDER_TO_PROVIDER_RULE___CHECK_DEC_BWD__CONTAINER_PROVIDER = eINSTANCE
				.getXProviderToProviderRule__CheckDEC_BWD__Container_Provider();

		/**
		 * The meta object literal for the '<em><b>Generate Model</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation XPROVIDER_TO_PROVIDER_RULE___GENERATE_MODEL__RULEENTRYCONTAINER_XCONTAINERTOCONTAINER = eINSTANCE
				.getXProviderToProviderRule__GenerateModel__RuleEntryContainer_XContainerToContainer();

		/**
		 * The meta object literal for the '<em><b>Generate Model solve Csp BWD</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation XPROVIDER_TO_PROVIDER_RULE___GENERATE_MODEL_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_CONTAINER_XCONTAINERTOCONTAINER_XCONTAINER_MODELGENERATORRULERESULT = eINSTANCE
				.getXProviderToProviderRule__GenerateModel_solveCsp_BWD__IsApplicableMatch_Container_XContainerToContainer_XContainer_ModelgeneratorRuleResult();

		/**
		 * The meta object literal for the '<em><b>Generate Model check Csp BWD</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation XPROVIDER_TO_PROVIDER_RULE___GENERATE_MODEL_CHECK_CSP_BWD__CSP = eINSTANCE
				.getXProviderToProviderRule__GenerateModel_checkCsp_BWD__CSP();

		/**
		 * The meta object literal for the '{@link RequirementsTransformator.Rules.impl.XConsumerToConsumerRuleImpl <em>XConsumer To Consumer Rule</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see RequirementsTransformator.Rules.impl.XConsumerToConsumerRuleImpl
		 * @see RequirementsTransformator.Rules.impl.RulesPackageImpl#getXConsumerToConsumerRule()
		 * @generated
		 */
		EClass XCONSUMER_TO_CONSUMER_RULE = eINSTANCE.getXConsumerToConsumerRule();

		/**
		 * The meta object literal for the '<em><b>Is Appropriate FWD</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation XCONSUMER_TO_CONSUMER_RULE___IS_APPROPRIATE_FWD__MATCH_XCONSUMER_XCONTAINER = eINSTANCE
				.getXConsumerToConsumerRule__IsAppropriate_FWD__Match_XConsumer_XContainer();

		/**
		 * The meta object literal for the '<em><b>Perform FWD</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation XCONSUMER_TO_CONSUMER_RULE___PERFORM_FWD__ISAPPLICABLEMATCH = eINSTANCE
				.getXConsumerToConsumerRule__Perform_FWD__IsApplicableMatch();

		/**
		 * The meta object literal for the '<em><b>Is Applicable FWD</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation XCONSUMER_TO_CONSUMER_RULE___IS_APPLICABLE_FWD__MATCH = eINSTANCE
				.getXConsumerToConsumerRule__IsApplicable_FWD__Match();

		/**
		 * The meta object literal for the '<em><b>Register Objects To Match FWD</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation XCONSUMER_TO_CONSUMER_RULE___REGISTER_OBJECTS_TO_MATCH_FWD__MATCH_XCONSUMER_XCONTAINER = eINSTANCE
				.getXConsumerToConsumerRule__RegisterObjectsToMatch_FWD__Match_XConsumer_XContainer();

		/**
		 * The meta object literal for the '<em><b>Is Appropriate solve Csp FWD</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation XCONSUMER_TO_CONSUMER_RULE___IS_APPROPRIATE_SOLVE_CSP_FWD__MATCH_XCONSUMER_XCONTAINER = eINSTANCE
				.getXConsumerToConsumerRule__IsAppropriate_solveCsp_FWD__Match_XConsumer_XContainer();

		/**
		 * The meta object literal for the '<em><b>Is Appropriate check Csp FWD</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation XCONSUMER_TO_CONSUMER_RULE___IS_APPROPRIATE_CHECK_CSP_FWD__CSP = eINSTANCE
				.getXConsumerToConsumerRule__IsAppropriate_checkCsp_FWD__CSP();

		/**
		 * The meta object literal for the '<em><b>Is Applicable solve Csp FWD</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation XCONSUMER_TO_CONSUMER_RULE___IS_APPLICABLE_SOLVE_CSP_FWD__ISAPPLICABLEMATCH_CONTAINER_XCONSUMER_XCONTAINERTOCONTAINER_XCONTAINER = eINSTANCE
				.getXConsumerToConsumerRule__IsApplicable_solveCsp_FWD__IsApplicableMatch_Container_XConsumer_XContainerToContainer_XContainer();

		/**
		 * The meta object literal for the '<em><b>Is Applicable check Csp FWD</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation XCONSUMER_TO_CONSUMER_RULE___IS_APPLICABLE_CHECK_CSP_FWD__CSP = eINSTANCE
				.getXConsumerToConsumerRule__IsApplicable_checkCsp_FWD__CSP();

		/**
		 * The meta object literal for the '<em><b>Register Objects FWD</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation XCONSUMER_TO_CONSUMER_RULE___REGISTER_OBJECTS_FWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT = eINSTANCE
				.getXConsumerToConsumerRule__RegisterObjects_FWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject();

		/**
		 * The meta object literal for the '<em><b>Check Types FWD</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation XCONSUMER_TO_CONSUMER_RULE___CHECK_TYPES_FWD__MATCH = eINSTANCE
				.getXConsumerToConsumerRule__CheckTypes_FWD__Match();

		/**
		 * The meta object literal for the '<em><b>Is Appropriate BWD</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation XCONSUMER_TO_CONSUMER_RULE___IS_APPROPRIATE_BWD__MATCH_CONTAINER_CONSUMER = eINSTANCE
				.getXConsumerToConsumerRule__IsAppropriate_BWD__Match_Container_Consumer();

		/**
		 * The meta object literal for the '<em><b>Perform BWD</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation XCONSUMER_TO_CONSUMER_RULE___PERFORM_BWD__ISAPPLICABLEMATCH = eINSTANCE
				.getXConsumerToConsumerRule__Perform_BWD__IsApplicableMatch();

		/**
		 * The meta object literal for the '<em><b>Is Applicable BWD</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation XCONSUMER_TO_CONSUMER_RULE___IS_APPLICABLE_BWD__MATCH = eINSTANCE
				.getXConsumerToConsumerRule__IsApplicable_BWD__Match();

		/**
		 * The meta object literal for the '<em><b>Register Objects To Match BWD</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation XCONSUMER_TO_CONSUMER_RULE___REGISTER_OBJECTS_TO_MATCH_BWD__MATCH_CONTAINER_CONSUMER = eINSTANCE
				.getXConsumerToConsumerRule__RegisterObjectsToMatch_BWD__Match_Container_Consumer();

		/**
		 * The meta object literal for the '<em><b>Is Appropriate solve Csp BWD</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation XCONSUMER_TO_CONSUMER_RULE___IS_APPROPRIATE_SOLVE_CSP_BWD__MATCH_CONTAINER_CONSUMER = eINSTANCE
				.getXConsumerToConsumerRule__IsAppropriate_solveCsp_BWD__Match_Container_Consumer();

		/**
		 * The meta object literal for the '<em><b>Is Appropriate check Csp BWD</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation XCONSUMER_TO_CONSUMER_RULE___IS_APPROPRIATE_CHECK_CSP_BWD__CSP = eINSTANCE
				.getXConsumerToConsumerRule__IsAppropriate_checkCsp_BWD__CSP();

		/**
		 * The meta object literal for the '<em><b>Is Applicable solve Csp BWD</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation XCONSUMER_TO_CONSUMER_RULE___IS_APPLICABLE_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_CONTAINER_CONSUMER_XCONTAINERTOCONTAINER_XCONTAINER = eINSTANCE
				.getXConsumerToConsumerRule__IsApplicable_solveCsp_BWD__IsApplicableMatch_Container_Consumer_XContainerToContainer_XContainer();

		/**
		 * The meta object literal for the '<em><b>Is Applicable check Csp BWD</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation XCONSUMER_TO_CONSUMER_RULE___IS_APPLICABLE_CHECK_CSP_BWD__CSP = eINSTANCE
				.getXConsumerToConsumerRule__IsApplicable_checkCsp_BWD__CSP();

		/**
		 * The meta object literal for the '<em><b>Register Objects BWD</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation XCONSUMER_TO_CONSUMER_RULE___REGISTER_OBJECTS_BWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT = eINSTANCE
				.getXConsumerToConsumerRule__RegisterObjects_BWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject();

		/**
		 * The meta object literal for the '<em><b>Check Types BWD</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation XCONSUMER_TO_CONSUMER_RULE___CHECK_TYPES_BWD__MATCH = eINSTANCE
				.getXConsumerToConsumerRule__CheckTypes_BWD__Match();

		/**
		 * The meta object literal for the '<em><b>Is Appropriate BWD EMoflon Edge 44</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation XCONSUMER_TO_CONSUMER_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_44__EMOFLONEDGE = eINSTANCE
				.getXConsumerToConsumerRule__IsAppropriate_BWD_EMoflonEdge_44__EMoflonEdge();

		/**
		 * The meta object literal for the '<em><b>Is Appropriate FWD EMoflon Edge 32</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation XCONSUMER_TO_CONSUMER_RULE___IS_APPROPRIATE_FWD_EMOFLON_EDGE_32__EMOFLONEDGE = eINSTANCE
				.getXConsumerToConsumerRule__IsAppropriate_FWD_EMoflonEdge_32__EMoflonEdge();

		/**
		 * The meta object literal for the '<em><b>Check Attributes FWD</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation XCONSUMER_TO_CONSUMER_RULE___CHECK_ATTRIBUTES_FWD__TRIPLEMATCH = eINSTANCE
				.getXConsumerToConsumerRule__CheckAttributes_FWD__TripleMatch();

		/**
		 * The meta object literal for the '<em><b>Check Attributes BWD</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation XCONSUMER_TO_CONSUMER_RULE___CHECK_ATTRIBUTES_BWD__TRIPLEMATCH = eINSTANCE
				.getXConsumerToConsumerRule__CheckAttributes_BWD__TripleMatch();

		/**
		 * The meta object literal for the '<em><b>Is Applicable CC</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation XCONSUMER_TO_CONSUMER_RULE___IS_APPLICABLE_CC__MATCH_MATCH = eINSTANCE
				.getXConsumerToConsumerRule__IsApplicable_CC__Match_Match();

		/**
		 * The meta object literal for the '<em><b>Is Applicable solve Csp CC</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation XCONSUMER_TO_CONSUMER_RULE___IS_APPLICABLE_SOLVE_CSP_CC__CONTAINER_CONSUMER_XCONSUMER_XCONTAINER_MATCH_MATCH = eINSTANCE
				.getXConsumerToConsumerRule__IsApplicable_solveCsp_CC__Container_Consumer_XConsumer_XContainer_Match_Match();

		/**
		 * The meta object literal for the '<em><b>Is Applicable check Csp CC</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation XCONSUMER_TO_CONSUMER_RULE___IS_APPLICABLE_CHECK_CSP_CC__CSP = eINSTANCE
				.getXConsumerToConsumerRule__IsApplicable_checkCsp_CC__CSP();

		/**
		 * The meta object literal for the '<em><b>Check DEC FWD</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation XCONSUMER_TO_CONSUMER_RULE___CHECK_DEC_FWD__XCONSUMER_XCONTAINER = eINSTANCE
				.getXConsumerToConsumerRule__CheckDEC_FWD__XConsumer_XContainer();

		/**
		 * The meta object literal for the '<em><b>Check DEC BWD</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation XCONSUMER_TO_CONSUMER_RULE___CHECK_DEC_BWD__CONTAINER_CONSUMER = eINSTANCE
				.getXConsumerToConsumerRule__CheckDEC_BWD__Container_Consumer();

		/**
		 * The meta object literal for the '<em><b>Generate Model</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation XCONSUMER_TO_CONSUMER_RULE___GENERATE_MODEL__RULEENTRYCONTAINER_XCONTAINERTOCONTAINER = eINSTANCE
				.getXConsumerToConsumerRule__GenerateModel__RuleEntryContainer_XContainerToContainer();

		/**
		 * The meta object literal for the '<em><b>Generate Model solve Csp BWD</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation XCONSUMER_TO_CONSUMER_RULE___GENERATE_MODEL_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_CONTAINER_XCONTAINERTOCONTAINER_XCONTAINER_MODELGENERATORRULERESULT = eINSTANCE
				.getXConsumerToConsumerRule__GenerateModel_solveCsp_BWD__IsApplicableMatch_Container_XContainerToContainer_XContainer_ModelgeneratorRuleResult();

		/**
		 * The meta object literal for the '<em><b>Generate Model check Csp BWD</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation XCONSUMER_TO_CONSUMER_RULE___GENERATE_MODEL_CHECK_CSP_BWD__CSP = eINSTANCE
				.getXConsumerToConsumerRule__GenerateModel_checkCsp_BWD__CSP();

	}

} //RulesPackage
