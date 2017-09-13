/**
 */
package ReqToImpTransformator.Rules;

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
 * @see ReqToImpTransformator.Rules.RulesFactory
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
	String eNS_URI = "platform:/plugin/ReqToImpTransformator/model/ReqToImpTransformator.ecore#//Rules";

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
	RulesPackage eINSTANCE = ReqToImpTransformator.Rules.impl.RulesPackageImpl.init();

	/**
	 * The meta object id for the '{@link ReqToImpTransformator.Rules.impl.ReqProviderToServerRuleImpl <em>Req Provider To Server Rule</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ReqToImpTransformator.Rules.impl.ReqProviderToServerRuleImpl
	 * @see ReqToImpTransformator.Rules.impl.RulesPackageImpl#getReqProviderToServerRule()
	 * @generated
	 */
	int REQ_PROVIDER_TO_SERVER_RULE = 0;

	/**
	 * The number of structural features of the '<em>Req Provider To Server Rule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQ_PROVIDER_TO_SERVER_RULE_FEATURE_COUNT = RuntimePackage.ABSTRACT_RULE_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Is Appropriate FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQ_PROVIDER_TO_SERVER_RULE___IS_APPROPRIATE_FWD__MATCH_PROVIDER_CONTAINER_NETWORKSPAN = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 0;

	/**
	 * The operation id for the '<em>Perform FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQ_PROVIDER_TO_SERVER_RULE___PERFORM_FWD__ISAPPLICABLEMATCH = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Is Applicable FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQ_PROVIDER_TO_SERVER_RULE___IS_APPLICABLE_FWD__MATCH = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 2;

	/**
	 * The operation id for the '<em>Register Objects To Match FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQ_PROVIDER_TO_SERVER_RULE___REGISTER_OBJECTS_TO_MATCH_FWD__MATCH_PROVIDER_CONTAINER_NETWORKSPAN = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 3;

	/**
	 * The operation id for the '<em>Is Appropriate solve Csp FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQ_PROVIDER_TO_SERVER_RULE___IS_APPROPRIATE_SOLVE_CSP_FWD__MATCH_PROVIDER_CONTAINER_NETWORKSPAN = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 4;

	/**
	 * The operation id for the '<em>Is Appropriate check Csp FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQ_PROVIDER_TO_SERVER_RULE___IS_APPROPRIATE_CHECK_CSP_FWD__CSP = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 5;

	/**
	 * The operation id for the '<em>Is Applicable solve Csp FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQ_PROVIDER_TO_SERVER_RULE___IS_APPLICABLE_SOLVE_CSP_FWD__ISAPPLICABLEMATCH_VIRTUALNODETOSERVER_SERVER_PROVIDER_CONTAINER_NETWORKSPAN_CABLE_CONTAINER_REQCONTAINERTOIMPLCONTAINER = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 6;

	/**
	 * The operation id for the '<em>Is Applicable check Csp FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQ_PROVIDER_TO_SERVER_RULE___IS_APPLICABLE_CHECK_CSP_FWD__CSP = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 7;

	/**
	 * The operation id for the '<em>Register Objects FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQ_PROVIDER_TO_SERVER_RULE___REGISTER_OBJECTS_FWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 8;

	/**
	 * The operation id for the '<em>Check Types FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQ_PROVIDER_TO_SERVER_RULE___CHECK_TYPES_FWD__MATCH = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 9;

	/**
	 * The operation id for the '<em>Is Appropriate BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQ_PROVIDER_TO_SERVER_RULE___IS_APPROPRIATE_BWD__MATCH_SERVER_CABLE_CONTAINER = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 10;

	/**
	 * The operation id for the '<em>Perform BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQ_PROVIDER_TO_SERVER_RULE___PERFORM_BWD__ISAPPLICABLEMATCH = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 11;

	/**
	 * The operation id for the '<em>Is Applicable BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQ_PROVIDER_TO_SERVER_RULE___IS_APPLICABLE_BWD__MATCH = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 12;

	/**
	 * The operation id for the '<em>Register Objects To Match BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQ_PROVIDER_TO_SERVER_RULE___REGISTER_OBJECTS_TO_MATCH_BWD__MATCH_SERVER_CABLE_CONTAINER = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 13;

	/**
	 * The operation id for the '<em>Is Appropriate solve Csp BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQ_PROVIDER_TO_SERVER_RULE___IS_APPROPRIATE_SOLVE_CSP_BWD__MATCH_SERVER_CABLE_CONTAINER = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 14;

	/**
	 * The operation id for the '<em>Is Appropriate check Csp BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQ_PROVIDER_TO_SERVER_RULE___IS_APPROPRIATE_CHECK_CSP_BWD__CSP = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 15;

	/**
	 * The operation id for the '<em>Check Types BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQ_PROVIDER_TO_SERVER_RULE___CHECK_TYPES_BWD__MATCH = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 16;

	/**
	 * The operation id for the '<em>Is Appropriate BWD Server 2</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQ_PROVIDER_TO_SERVER_RULE___IS_APPROPRIATE_BWD_SERVER_2__SERVER = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 17;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 28</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQ_PROVIDER_TO_SERVER_RULE___IS_APPROPRIATE_FWD_EMOFLON_EDGE_28__EMOFLONEDGE = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 18;

	/**
	 * The operation id for the '<em>Check Attributes FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQ_PROVIDER_TO_SERVER_RULE___CHECK_ATTRIBUTES_FWD__TRIPLEMATCH = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 19;

	/**
	 * The operation id for the '<em>Check Attributes BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQ_PROVIDER_TO_SERVER_RULE___CHECK_ATTRIBUTES_BWD__TRIPLEMATCH = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 20;

	/**
	 * The operation id for the '<em>Is Applicable CC</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQ_PROVIDER_TO_SERVER_RULE___IS_APPLICABLE_CC__MATCH_MATCH = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 21;

	/**
	 * The operation id for the '<em>Is Applicable solve Csp CC</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQ_PROVIDER_TO_SERVER_RULE___IS_APPLICABLE_SOLVE_CSP_CC__SERVER_PROVIDER_CONTAINER_NETWORKSPAN_CABLE_CONTAINER_MATCH_MATCH = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 22;

	/**
	 * The operation id for the '<em>Is Applicable check Csp CC</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQ_PROVIDER_TO_SERVER_RULE___IS_APPLICABLE_CHECK_CSP_CC__CSP = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 23;

	/**
	 * The operation id for the '<em>Check DEC FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQ_PROVIDER_TO_SERVER_RULE___CHECK_DEC_FWD__PROVIDER_CONTAINER_NETWORKSPAN = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 24;

	/**
	 * The operation id for the '<em>Check DEC BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQ_PROVIDER_TO_SERVER_RULE___CHECK_DEC_BWD__SERVER_CABLE_CONTAINER = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 25;

	/**
	 * The operation id for the '<em>Generate Model</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQ_PROVIDER_TO_SERVER_RULE___GENERATE_MODEL__RULEENTRYCONTAINER_VIRTUALNODETOSERVER = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 26;

	/**
	 * The operation id for the '<em>Generate Model solve Csp BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQ_PROVIDER_TO_SERVER_RULE___GENERATE_MODEL_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_VIRTUALNODETOSERVER_SERVER_CONTAINER_NETWORKSPAN_CABLE_CONTAINER_REQCONTAINERTOIMPLCONTAINER_MODELGENERATORRULERESULT = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 27;

	/**
	 * The operation id for the '<em>Generate Model check Csp BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQ_PROVIDER_TO_SERVER_RULE___GENERATE_MODEL_CHECK_CSP_BWD__CSP = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 28;

	/**
	 * The number of operations of the '<em>Req Provider To Server Rule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQ_PROVIDER_TO_SERVER_RULE_OPERATION_COUNT = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 29;

	/**
	 * The meta object id for the '{@link ReqToImpTransformator.Rules.impl.VirtualNodeToComputerRuleImpl <em>Virtual Node To Computer Rule</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ReqToImpTransformator.Rules.impl.VirtualNodeToComputerRuleImpl
	 * @see ReqToImpTransformator.Rules.impl.RulesPackageImpl#getVirtualNodeToComputerRule()
	 * @generated
	 */
	int VIRTUAL_NODE_TO_COMPUTER_RULE = 1;

	/**
	 * The number of structural features of the '<em>Virtual Node To Computer Rule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUAL_NODE_TO_COMPUTER_RULE_FEATURE_COUNT = RuntimePackage.ABSTRACT_RULE_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Is Appropriate FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUAL_NODE_TO_COMPUTER_RULE___IS_APPROPRIATE_FWD__MATCH_CONTAINER_NETWORKSPAN = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 0;

	/**
	 * The operation id for the '<em>Perform FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUAL_NODE_TO_COMPUTER_RULE___PERFORM_FWD__ISAPPLICABLEMATCH = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 1;

	/**
	 * The operation id for the '<em>Is Applicable FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUAL_NODE_TO_COMPUTER_RULE___IS_APPLICABLE_FWD__MATCH = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 2;

	/**
	 * The operation id for the '<em>Register Objects To Match FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUAL_NODE_TO_COMPUTER_RULE___REGISTER_OBJECTS_TO_MATCH_FWD__MATCH_CONTAINER_NETWORKSPAN = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 3;

	/**
	 * The operation id for the '<em>Is Appropriate solve Csp FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUAL_NODE_TO_COMPUTER_RULE___IS_APPROPRIATE_SOLVE_CSP_FWD__MATCH_CONTAINER_NETWORKSPAN = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 4;

	/**
	 * The operation id for the '<em>Is Appropriate check Csp FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUAL_NODE_TO_COMPUTER_RULE___IS_APPROPRIATE_CHECK_CSP_FWD__CSP = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 5;

	/**
	 * The operation id for the '<em>Check Types FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUAL_NODE_TO_COMPUTER_RULE___CHECK_TYPES_FWD__MATCH = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 6;

	/**
	 * The operation id for the '<em>Is Appropriate BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUAL_NODE_TO_COMPUTER_RULE___IS_APPROPRIATE_BWD__MATCH_ROUTER_CONTAINER_COMPUTER_CABLE = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 7;

	/**
	 * The operation id for the '<em>Perform BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUAL_NODE_TO_COMPUTER_RULE___PERFORM_BWD__ISAPPLICABLEMATCH = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 8;

	/**
	 * The operation id for the '<em>Is Applicable BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUAL_NODE_TO_COMPUTER_RULE___IS_APPLICABLE_BWD__MATCH = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 9;

	/**
	 * The operation id for the '<em>Register Objects To Match BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUAL_NODE_TO_COMPUTER_RULE___REGISTER_OBJECTS_TO_MATCH_BWD__MATCH_ROUTER_CONTAINER_COMPUTER_CABLE = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 10;

	/**
	 * The operation id for the '<em>Is Appropriate solve Csp BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUAL_NODE_TO_COMPUTER_RULE___IS_APPROPRIATE_SOLVE_CSP_BWD__MATCH_ROUTER_CONTAINER_COMPUTER_CABLE = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 11;

	/**
	 * The operation id for the '<em>Is Appropriate check Csp BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUAL_NODE_TO_COMPUTER_RULE___IS_APPROPRIATE_CHECK_CSP_BWD__CSP = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 12;

	/**
	 * The operation id for the '<em>Is Applicable solve Csp BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUAL_NODE_TO_COMPUTER_RULE___IS_APPLICABLE_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_ROUTER_CONTAINER_CONTAINER_REQCONTAINERTOIMPLCONTAINER_COMPUTER_VIRTUALNODETOROUTER_NETWORKSPAN_CABLE = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 13;

	/**
	 * The operation id for the '<em>Is Applicable check Csp BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUAL_NODE_TO_COMPUTER_RULE___IS_APPLICABLE_CHECK_CSP_BWD__CSP = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 14;

	/**
	 * The operation id for the '<em>Register Objects BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUAL_NODE_TO_COMPUTER_RULE___REGISTER_OBJECTS_BWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 15;

	/**
	 * The operation id for the '<em>Check Types BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUAL_NODE_TO_COMPUTER_RULE___CHECK_TYPES_BWD__MATCH = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 16;

	/**
	 * The operation id for the '<em>Is Appropriate FWD Container 10</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUAL_NODE_TO_COMPUTER_RULE___IS_APPROPRIATE_FWD_CONTAINER_10__CONTAINER = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 17;

	/**
	 * The operation id for the '<em>Is Appropriate BWD EMoflon Edge 36</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUAL_NODE_TO_COMPUTER_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_36__EMOFLONEDGE = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 18;

	/**
	 * The operation id for the '<em>Check Attributes FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUAL_NODE_TO_COMPUTER_RULE___CHECK_ATTRIBUTES_FWD__TRIPLEMATCH = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 19;

	/**
	 * The operation id for the '<em>Check Attributes BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUAL_NODE_TO_COMPUTER_RULE___CHECK_ATTRIBUTES_BWD__TRIPLEMATCH = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 20;

	/**
	 * The operation id for the '<em>Is Applicable CC</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUAL_NODE_TO_COMPUTER_RULE___IS_APPLICABLE_CC__MATCH_MATCH = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 21;

	/**
	 * The operation id for the '<em>Is Applicable solve Csp CC</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUAL_NODE_TO_COMPUTER_RULE___IS_APPLICABLE_SOLVE_CSP_CC__ROUTER_CONTAINER_CONTAINER_COMPUTER_NETWORKSPAN_CABLE_MATCH_MATCH = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 22;

	/**
	 * The operation id for the '<em>Is Applicable check Csp CC</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUAL_NODE_TO_COMPUTER_RULE___IS_APPLICABLE_CHECK_CSP_CC__CSP = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 23;

	/**
	 * The operation id for the '<em>Check DEC FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUAL_NODE_TO_COMPUTER_RULE___CHECK_DEC_FWD__CONTAINER_NETWORKSPAN = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 24;

	/**
	 * The operation id for the '<em>Check DEC BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUAL_NODE_TO_COMPUTER_RULE___CHECK_DEC_BWD__ROUTER_CONTAINER_COMPUTER_CABLE = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 25;

	/**
	 * The operation id for the '<em>Generate Model</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUAL_NODE_TO_COMPUTER_RULE___GENERATE_MODEL__RULEENTRYCONTAINER_VIRTUALNODETOROUTER = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 26;

	/**
	 * The operation id for the '<em>Generate Model solve Csp BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUAL_NODE_TO_COMPUTER_RULE___GENERATE_MODEL_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_ROUTER_CONTAINER_CONTAINER_REQCONTAINERTOIMPLCONTAINER_VIRTUALNODETOROUTER_NETWORKSPAN_CABLE_MODELGENERATORRULERESULT = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 27;

	/**
	 * The operation id for the '<em>Generate Model check Csp BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUAL_NODE_TO_COMPUTER_RULE___GENERATE_MODEL_CHECK_CSP_BWD__CSP = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 28;

	/**
	 * The number of operations of the '<em>Virtual Node To Computer Rule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUAL_NODE_TO_COMPUTER_RULE_OPERATION_COUNT = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 29;

	/**
	 * The meta object id for the '{@link ReqToImpTransformator.Rules.impl.ImplOutgoingConnectionIgnoreRuleImpl <em>Impl Outgoing Connection Ignore Rule</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ReqToImpTransformator.Rules.impl.ImplOutgoingConnectionIgnoreRuleImpl
	 * @see ReqToImpTransformator.Rules.impl.RulesPackageImpl#getImplOutgoingConnectionIgnoreRule()
	 * @generated
	 */
	int IMPL_OUTGOING_CONNECTION_IGNORE_RULE = 2;

	/**
	 * The number of structural features of the '<em>Impl Outgoing Connection Ignore Rule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPL_OUTGOING_CONNECTION_IGNORE_RULE_FEATURE_COUNT = RuntimePackage.ABSTRACT_RULE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Impl Outgoing Connection Ignore Rule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPL_OUTGOING_CONNECTION_IGNORE_RULE_OPERATION_COUNT = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ReqToImpTransformator.Rules.impl.ImplIncomingConnectionIgnoreRuleImpl <em>Impl Incoming Connection Ignore Rule</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ReqToImpTransformator.Rules.impl.ImplIncomingConnectionIgnoreRuleImpl
	 * @see ReqToImpTransformator.Rules.impl.RulesPackageImpl#getImplIncomingConnectionIgnoreRule()
	 * @generated
	 */
	int IMPL_INCOMING_CONNECTION_IGNORE_RULE = 3;

	/**
	 * The number of structural features of the '<em>Impl Incoming Connection Ignore Rule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPL_INCOMING_CONNECTION_IGNORE_RULE_FEATURE_COUNT = RuntimePackage.ABSTRACT_RULE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Impl Incoming Connection Ignore Rule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPL_INCOMING_CONNECTION_IGNORE_RULE_OPERATION_COUNT = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ReqToImpTransformator.Rules.impl.VirtualNodeToRouterRule1Impl <em>Virtual Node To Router Rule1</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ReqToImpTransformator.Rules.impl.VirtualNodeToRouterRule1Impl
	 * @see ReqToImpTransformator.Rules.impl.RulesPackageImpl#getVirtualNodeToRouterRule1()
	 * @generated
	 */
	int VIRTUAL_NODE_TO_ROUTER_RULE1 = 4;

	/**
	 * The number of structural features of the '<em>Virtual Node To Router Rule1</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUAL_NODE_TO_ROUTER_RULE1_FEATURE_COUNT = RuntimePackage.ABSTRACT_RULE_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Is Appropriate FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUAL_NODE_TO_ROUTER_RULE1___IS_APPROPRIATE_FWD__MATCH_CONTAINER_NETWORKSPAN = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 0;

	/**
	 * The operation id for the '<em>Perform FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUAL_NODE_TO_ROUTER_RULE1___PERFORM_FWD__ISAPPLICABLEMATCH = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 1;

	/**
	 * The operation id for the '<em>Is Applicable FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUAL_NODE_TO_ROUTER_RULE1___IS_APPLICABLE_FWD__MATCH = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 2;

	/**
	 * The operation id for the '<em>Register Objects To Match FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUAL_NODE_TO_ROUTER_RULE1___REGISTER_OBJECTS_TO_MATCH_FWD__MATCH_CONTAINER_NETWORKSPAN = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 3;

	/**
	 * The operation id for the '<em>Is Appropriate solve Csp FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUAL_NODE_TO_ROUTER_RULE1___IS_APPROPRIATE_SOLVE_CSP_FWD__MATCH_CONTAINER_NETWORKSPAN = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 4;

	/**
	 * The operation id for the '<em>Is Appropriate check Csp FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUAL_NODE_TO_ROUTER_RULE1___IS_APPROPRIATE_CHECK_CSP_FWD__CSP = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 5;

	/**
	 * The operation id for the '<em>Check Types FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUAL_NODE_TO_ROUTER_RULE1___CHECK_TYPES_FWD__MATCH = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 6;

	/**
	 * The operation id for the '<em>Is Appropriate BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUAL_NODE_TO_ROUTER_RULE1___IS_APPROPRIATE_BWD__MATCH_ROUTER_CONTAINER = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 7;

	/**
	 * The operation id for the '<em>Perform BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUAL_NODE_TO_ROUTER_RULE1___PERFORM_BWD__ISAPPLICABLEMATCH = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 8;

	/**
	 * The operation id for the '<em>Is Applicable BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUAL_NODE_TO_ROUTER_RULE1___IS_APPLICABLE_BWD__MATCH = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 9;

	/**
	 * The operation id for the '<em>Register Objects To Match BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUAL_NODE_TO_ROUTER_RULE1___REGISTER_OBJECTS_TO_MATCH_BWD__MATCH_ROUTER_CONTAINER = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 10;

	/**
	 * The operation id for the '<em>Is Appropriate solve Csp BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUAL_NODE_TO_ROUTER_RULE1___IS_APPROPRIATE_SOLVE_CSP_BWD__MATCH_ROUTER_CONTAINER = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 11;

	/**
	 * The operation id for the '<em>Is Appropriate check Csp BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUAL_NODE_TO_ROUTER_RULE1___IS_APPROPRIATE_CHECK_CSP_BWD__CSP = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 12;

	/**
	 * The operation id for the '<em>Is Applicable solve Csp BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUAL_NODE_TO_ROUTER_RULE1___IS_APPLICABLE_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_CONTAINER_ROUTER_CONTAINER_REQCONTAINERTOIMPLCONTAINER_NETWORKSPAN = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 13;

	/**
	 * The operation id for the '<em>Is Applicable check Csp BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUAL_NODE_TO_ROUTER_RULE1___IS_APPLICABLE_CHECK_CSP_BWD__CSP = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 14;

	/**
	 * The operation id for the '<em>Register Objects BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUAL_NODE_TO_ROUTER_RULE1___REGISTER_OBJECTS_BWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 15;

	/**
	 * The operation id for the '<em>Check Types BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUAL_NODE_TO_ROUTER_RULE1___CHECK_TYPES_BWD__MATCH = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 16;

	/**
	 * The operation id for the '<em>Is Appropriate FWD Container 11</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUAL_NODE_TO_ROUTER_RULE1___IS_APPROPRIATE_FWD_CONTAINER_11__CONTAINER = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 17;

	/**
	 * The operation id for the '<em>Is Appropriate BWD EMoflon Edge 37</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUAL_NODE_TO_ROUTER_RULE1___IS_APPROPRIATE_BWD_EMOFLON_EDGE_37__EMOFLONEDGE = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 18;

	/**
	 * The operation id for the '<em>Check Attributes FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUAL_NODE_TO_ROUTER_RULE1___CHECK_ATTRIBUTES_FWD__TRIPLEMATCH = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 19;

	/**
	 * The operation id for the '<em>Check Attributes BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUAL_NODE_TO_ROUTER_RULE1___CHECK_ATTRIBUTES_BWD__TRIPLEMATCH = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 20;

	/**
	 * The operation id for the '<em>Is Applicable CC</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUAL_NODE_TO_ROUTER_RULE1___IS_APPLICABLE_CC__MATCH_MATCH = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 21;

	/**
	 * The operation id for the '<em>Is Applicable solve Csp CC</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUAL_NODE_TO_ROUTER_RULE1___IS_APPLICABLE_SOLVE_CSP_CC__CONTAINER_ROUTER_CONTAINER_NETWORKSPAN_MATCH_MATCH = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 22;

	/**
	 * The operation id for the '<em>Is Applicable check Csp CC</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUAL_NODE_TO_ROUTER_RULE1___IS_APPLICABLE_CHECK_CSP_CC__CSP = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 23;

	/**
	 * The operation id for the '<em>Check DEC FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUAL_NODE_TO_ROUTER_RULE1___CHECK_DEC_FWD__CONTAINER_NETWORKSPAN = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 24;

	/**
	 * The operation id for the '<em>Check DEC BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUAL_NODE_TO_ROUTER_RULE1___CHECK_DEC_BWD__ROUTER_CONTAINER = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 25;

	/**
	 * The operation id for the '<em>Generate Model</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUAL_NODE_TO_ROUTER_RULE1___GENERATE_MODEL__RULEENTRYCONTAINER_REQCONTAINERTOIMPLCONTAINER = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 26;

	/**
	 * The operation id for the '<em>Generate Model solve Csp BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUAL_NODE_TO_ROUTER_RULE1___GENERATE_MODEL_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_CONTAINER_CONTAINER_REQCONTAINERTOIMPLCONTAINER_NETWORKSPAN_MODELGENERATORRULERESULT = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 27;

	/**
	 * The operation id for the '<em>Generate Model check Csp BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUAL_NODE_TO_ROUTER_RULE1___GENERATE_MODEL_CHECK_CSP_BWD__CSP = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 28;

	/**
	 * The number of operations of the '<em>Virtual Node To Router Rule1</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUAL_NODE_TO_ROUTER_RULE1_OPERATION_COUNT = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 29;

	/**
	 * The meta object id for the '{@link ReqToImpTransformator.Rules.impl.ImplGlassIgnoreRuleImpl <em>Impl Glass Ignore Rule</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ReqToImpTransformator.Rules.impl.ImplGlassIgnoreRuleImpl
	 * @see ReqToImpTransformator.Rules.impl.RulesPackageImpl#getImplGlassIgnoreRule()
	 * @generated
	 */
	int IMPL_GLASS_IGNORE_RULE = 5;

	/**
	 * The number of structural features of the '<em>Impl Glass Ignore Rule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPL_GLASS_IGNORE_RULE_FEATURE_COUNT = RuntimePackage.ABSTRACT_RULE_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Is Appropriate FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPL_GLASS_IGNORE_RULE___IS_APPROPRIATE_FWD__MATCH_CONTAINER = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Perform FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPL_GLASS_IGNORE_RULE___PERFORM_FWD__ISAPPLICABLEMATCH = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Is Applicable FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPL_GLASS_IGNORE_RULE___IS_APPLICABLE_FWD__MATCH = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 2;

	/**
	 * The operation id for the '<em>Register Objects To Match FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPL_GLASS_IGNORE_RULE___REGISTER_OBJECTS_TO_MATCH_FWD__MATCH_CONTAINER = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 3;

	/**
	 * The operation id for the '<em>Is Appropriate solve Csp FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPL_GLASS_IGNORE_RULE___IS_APPROPRIATE_SOLVE_CSP_FWD__MATCH_CONTAINER = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 4;

	/**
	 * The operation id for the '<em>Is Appropriate check Csp FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPL_GLASS_IGNORE_RULE___IS_APPROPRIATE_CHECK_CSP_FWD__CSP = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 5;

	/**
	 * The operation id for the '<em>Check Types FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPL_GLASS_IGNORE_RULE___CHECK_TYPES_FWD__MATCH = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 6;

	/**
	 * The operation id for the '<em>Is Appropriate BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPL_GLASS_IGNORE_RULE___IS_APPROPRIATE_BWD__MATCH_GLASSFIBERCABLE_CONTAINER = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 7;

	/**
	 * The operation id for the '<em>Perform BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPL_GLASS_IGNORE_RULE___PERFORM_BWD__ISAPPLICABLEMATCH = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 8;

	/**
	 * The operation id for the '<em>Is Applicable BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPL_GLASS_IGNORE_RULE___IS_APPLICABLE_BWD__MATCH = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 9;

	/**
	 * The operation id for the '<em>Register Objects To Match BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPL_GLASS_IGNORE_RULE___REGISTER_OBJECTS_TO_MATCH_BWD__MATCH_GLASSFIBERCABLE_CONTAINER = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 10;

	/**
	 * The operation id for the '<em>Is Appropriate solve Csp BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPL_GLASS_IGNORE_RULE___IS_APPROPRIATE_SOLVE_CSP_BWD__MATCH_GLASSFIBERCABLE_CONTAINER = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 11;

	/**
	 * The operation id for the '<em>Is Appropriate check Csp BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPL_GLASS_IGNORE_RULE___IS_APPROPRIATE_CHECK_CSP_BWD__CSP = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 12;

	/**
	 * The operation id for the '<em>Is Applicable solve Csp BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPL_GLASS_IGNORE_RULE___IS_APPLICABLE_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_CONTAINER_GLASSFIBERCABLE_REQCONTAINERTOIMPLCONTAINER_CONTAINER = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 13;

	/**
	 * The operation id for the '<em>Is Applicable check Csp BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPL_GLASS_IGNORE_RULE___IS_APPLICABLE_CHECK_CSP_BWD__CSP = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 14;

	/**
	 * The operation id for the '<em>Register Objects BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPL_GLASS_IGNORE_RULE___REGISTER_OBJECTS_BWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 15;

	/**
	 * The operation id for the '<em>Check Types BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPL_GLASS_IGNORE_RULE___CHECK_TYPES_BWD__MATCH = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 16;

	/**
	 * The operation id for the '<em>Is Appropriate FWD Container 12</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPL_GLASS_IGNORE_RULE___IS_APPROPRIATE_FWD_CONTAINER_12__CONTAINER = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 17;

	/**
	 * The operation id for the '<em>Is Appropriate BWD EMoflon Edge 38</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPL_GLASS_IGNORE_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_38__EMOFLONEDGE = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 18;

	/**
	 * The operation id for the '<em>Check Attributes FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPL_GLASS_IGNORE_RULE___CHECK_ATTRIBUTES_FWD__TRIPLEMATCH = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 19;

	/**
	 * The operation id for the '<em>Check Attributes BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPL_GLASS_IGNORE_RULE___CHECK_ATTRIBUTES_BWD__TRIPLEMATCH = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 20;

	/**
	 * The operation id for the '<em>Is Applicable CC</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPL_GLASS_IGNORE_RULE___IS_APPLICABLE_CC__MATCH_MATCH = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 21;

	/**
	 * The operation id for the '<em>Is Applicable solve Csp CC</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPL_GLASS_IGNORE_RULE___IS_APPLICABLE_SOLVE_CSP_CC__CONTAINER_GLASSFIBERCABLE_CONTAINER_MATCH_MATCH = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 22;

	/**
	 * The operation id for the '<em>Is Applicable check Csp CC</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPL_GLASS_IGNORE_RULE___IS_APPLICABLE_CHECK_CSP_CC__CSP = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 23;

	/**
	 * The operation id for the '<em>Check DEC FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPL_GLASS_IGNORE_RULE___CHECK_DEC_FWD__CONTAINER = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 24;

	/**
	 * The operation id for the '<em>Check DEC BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPL_GLASS_IGNORE_RULE___CHECK_DEC_BWD__GLASSFIBERCABLE_CONTAINER = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 25;

	/**
	 * The operation id for the '<em>Generate Model</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPL_GLASS_IGNORE_RULE___GENERATE_MODEL__RULEENTRYCONTAINER_REQCONTAINERTOIMPLCONTAINER = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 26;

	/**
	 * The operation id for the '<em>Generate Model solve Csp BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPL_GLASS_IGNORE_RULE___GENERATE_MODEL_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_CONTAINER_REQCONTAINERTOIMPLCONTAINER_CONTAINER_MODELGENERATORRULERESULT = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 27;

	/**
	 * The operation id for the '<em>Generate Model check Csp BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPL_GLASS_IGNORE_RULE___GENERATE_MODEL_CHECK_CSP_BWD__CSP = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 28;

	/**
	 * The number of operations of the '<em>Impl Glass Ignore Rule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPL_GLASS_IGNORE_RULE_OPERATION_COUNT = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 29;

	/**
	 * The meta object id for the '{@link ReqToImpTransformator.Rules.impl.ReqContainerToImplContainerRuleImpl <em>Req Container To Impl Container Rule</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ReqToImpTransformator.Rules.impl.ReqContainerToImplContainerRuleImpl
	 * @see ReqToImpTransformator.Rules.impl.RulesPackageImpl#getReqContainerToImplContainerRule()
	 * @generated
	 */
	int REQ_CONTAINER_TO_IMPL_CONTAINER_RULE = 6;

	/**
	 * The number of structural features of the '<em>Req Container To Impl Container Rule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQ_CONTAINER_TO_IMPL_CONTAINER_RULE_FEATURE_COUNT = RuntimePackage.ABSTRACT_RULE_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Is Appropriate FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQ_CONTAINER_TO_IMPL_CONTAINER_RULE___IS_APPROPRIATE_FWD__MATCH_CONTAINER_NETWORKSPAN = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 0;

	/**
	 * The operation id for the '<em>Perform FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQ_CONTAINER_TO_IMPL_CONTAINER_RULE___PERFORM_FWD__ISAPPLICABLEMATCH = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 1;

	/**
	 * The operation id for the '<em>Is Applicable FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQ_CONTAINER_TO_IMPL_CONTAINER_RULE___IS_APPLICABLE_FWD__MATCH = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 2;

	/**
	 * The operation id for the '<em>Register Objects To Match FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQ_CONTAINER_TO_IMPL_CONTAINER_RULE___REGISTER_OBJECTS_TO_MATCH_FWD__MATCH_CONTAINER_NETWORKSPAN = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 3;

	/**
	 * The operation id for the '<em>Is Appropriate solve Csp FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQ_CONTAINER_TO_IMPL_CONTAINER_RULE___IS_APPROPRIATE_SOLVE_CSP_FWD__MATCH_CONTAINER_NETWORKSPAN = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 4;

	/**
	 * The operation id for the '<em>Is Appropriate check Csp FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQ_CONTAINER_TO_IMPL_CONTAINER_RULE___IS_APPROPRIATE_CHECK_CSP_FWD__CSP = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 5;

	/**
	 * The operation id for the '<em>Is Applicable solve Csp FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQ_CONTAINER_TO_IMPL_CONTAINER_RULE___IS_APPLICABLE_SOLVE_CSP_FWD__ISAPPLICABLEMATCH_CONTAINER_NETWORKSPAN = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 6;

	/**
	 * The operation id for the '<em>Is Applicable check Csp FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQ_CONTAINER_TO_IMPL_CONTAINER_RULE___IS_APPLICABLE_CHECK_CSP_FWD__CSP = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 7;

	/**
	 * The operation id for the '<em>Register Objects FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQ_CONTAINER_TO_IMPL_CONTAINER_RULE___REGISTER_OBJECTS_FWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 8;

	/**
	 * The operation id for the '<em>Check Types FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQ_CONTAINER_TO_IMPL_CONTAINER_RULE___CHECK_TYPES_FWD__MATCH = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 9;

	/**
	 * The operation id for the '<em>Is Appropriate BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQ_CONTAINER_TO_IMPL_CONTAINER_RULE___IS_APPROPRIATE_BWD__MATCH_CONTAINER = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 10;

	/**
	 * The operation id for the '<em>Perform BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQ_CONTAINER_TO_IMPL_CONTAINER_RULE___PERFORM_BWD__ISAPPLICABLEMATCH = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 11;

	/**
	 * The operation id for the '<em>Is Applicable BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQ_CONTAINER_TO_IMPL_CONTAINER_RULE___IS_APPLICABLE_BWD__MATCH = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 12;

	/**
	 * The operation id for the '<em>Register Objects To Match BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQ_CONTAINER_TO_IMPL_CONTAINER_RULE___REGISTER_OBJECTS_TO_MATCH_BWD__MATCH_CONTAINER = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 13;

	/**
	 * The operation id for the '<em>Is Appropriate solve Csp BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQ_CONTAINER_TO_IMPL_CONTAINER_RULE___IS_APPROPRIATE_SOLVE_CSP_BWD__MATCH_CONTAINER = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 14;

	/**
	 * The operation id for the '<em>Is Appropriate check Csp BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQ_CONTAINER_TO_IMPL_CONTAINER_RULE___IS_APPROPRIATE_CHECK_CSP_BWD__CSP = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 15;

	/**
	 * The operation id for the '<em>Is Applicable solve Csp BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQ_CONTAINER_TO_IMPL_CONTAINER_RULE___IS_APPLICABLE_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_CONTAINER = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 16;

	/**
	 * The operation id for the '<em>Is Applicable check Csp BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQ_CONTAINER_TO_IMPL_CONTAINER_RULE___IS_APPLICABLE_CHECK_CSP_BWD__CSP = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 17;

	/**
	 * The operation id for the '<em>Register Objects BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQ_CONTAINER_TO_IMPL_CONTAINER_RULE___REGISTER_OBJECTS_BWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 18;

	/**
	 * The operation id for the '<em>Check Types BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQ_CONTAINER_TO_IMPL_CONTAINER_RULE___CHECK_TYPES_BWD__MATCH = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 19;

	/**
	 * The operation id for the '<em>Is Appropriate BWD Container 4</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQ_CONTAINER_TO_IMPL_CONTAINER_RULE___IS_APPROPRIATE_BWD_CONTAINER_4__CONTAINER = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 20;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 29</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQ_CONTAINER_TO_IMPL_CONTAINER_RULE___IS_APPROPRIATE_FWD_EMOFLON_EDGE_29__EMOFLONEDGE = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 21;

	/**
	 * The operation id for the '<em>Check Attributes FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQ_CONTAINER_TO_IMPL_CONTAINER_RULE___CHECK_ATTRIBUTES_FWD__TRIPLEMATCH = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 22;

	/**
	 * The operation id for the '<em>Check Attributes BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQ_CONTAINER_TO_IMPL_CONTAINER_RULE___CHECK_ATTRIBUTES_BWD__TRIPLEMATCH = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 23;

	/**
	 * The operation id for the '<em>Is Applicable CC</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQ_CONTAINER_TO_IMPL_CONTAINER_RULE___IS_APPLICABLE_CC__MATCH_MATCH = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 24;

	/**
	 * The operation id for the '<em>Is Applicable solve Csp CC</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQ_CONTAINER_TO_IMPL_CONTAINER_RULE___IS_APPLICABLE_SOLVE_CSP_CC__CONTAINER_NETWORKSPAN_CONTAINER_MATCH_MATCH = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 25;

	/**
	 * The operation id for the '<em>Is Applicable check Csp CC</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQ_CONTAINER_TO_IMPL_CONTAINER_RULE___IS_APPLICABLE_CHECK_CSP_CC__CSP = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 26;

	/**
	 * The operation id for the '<em>Check DEC FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQ_CONTAINER_TO_IMPL_CONTAINER_RULE___CHECK_DEC_FWD__CONTAINER_NETWORKSPAN = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 27;

	/**
	 * The operation id for the '<em>Check DEC BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQ_CONTAINER_TO_IMPL_CONTAINER_RULE___CHECK_DEC_BWD__CONTAINER = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 28;

	/**
	 * The operation id for the '<em>Generate Model</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQ_CONTAINER_TO_IMPL_CONTAINER_RULE___GENERATE_MODEL__RULEENTRYCONTAINER = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 29;

	/**
	 * The operation id for the '<em>Generate Model solve Csp BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQ_CONTAINER_TO_IMPL_CONTAINER_RULE___GENERATE_MODEL_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_MODELGENERATORRULERESULT = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 30;

	/**
	 * The operation id for the '<em>Generate Model check Csp BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQ_CONTAINER_TO_IMPL_CONTAINER_RULE___GENERATE_MODEL_CHECK_CSP_BWD__CSP = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 31;

	/**
	 * The number of operations of the '<em>Req Container To Impl Container Rule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQ_CONTAINER_TO_IMPL_CONTAINER_RULE_OPERATION_COUNT = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 32;

	/**
	 * The meta object id for the '{@link ReqToImpTransformator.Rules.impl.ImplCopperIgnoreRuleImpl <em>Impl Copper Ignore Rule</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ReqToImpTransformator.Rules.impl.ImplCopperIgnoreRuleImpl
	 * @see ReqToImpTransformator.Rules.impl.RulesPackageImpl#getImplCopperIgnoreRule()
	 * @generated
	 */
	int IMPL_COPPER_IGNORE_RULE = 7;

	/**
	 * The number of structural features of the '<em>Impl Copper Ignore Rule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPL_COPPER_IGNORE_RULE_FEATURE_COUNT = RuntimePackage.ABSTRACT_RULE_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Is Appropriate FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPL_COPPER_IGNORE_RULE___IS_APPROPRIATE_FWD__MATCH_CONTAINER = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 0;

	/**
	 * The operation id for the '<em>Perform FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPL_COPPER_IGNORE_RULE___PERFORM_FWD__ISAPPLICABLEMATCH = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Is Applicable FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPL_COPPER_IGNORE_RULE___IS_APPLICABLE_FWD__MATCH = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 2;

	/**
	 * The operation id for the '<em>Register Objects To Match FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPL_COPPER_IGNORE_RULE___REGISTER_OBJECTS_TO_MATCH_FWD__MATCH_CONTAINER = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 3;

	/**
	 * The operation id for the '<em>Is Appropriate solve Csp FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPL_COPPER_IGNORE_RULE___IS_APPROPRIATE_SOLVE_CSP_FWD__MATCH_CONTAINER = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 4;

	/**
	 * The operation id for the '<em>Is Appropriate check Csp FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPL_COPPER_IGNORE_RULE___IS_APPROPRIATE_CHECK_CSP_FWD__CSP = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 5;

	/**
	 * The operation id for the '<em>Check Types FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPL_COPPER_IGNORE_RULE___CHECK_TYPES_FWD__MATCH = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 6;

	/**
	 * The operation id for the '<em>Is Appropriate BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPL_COPPER_IGNORE_RULE___IS_APPROPRIATE_BWD__MATCH_COPPERCABLE_CONTAINER = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 7;

	/**
	 * The operation id for the '<em>Perform BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPL_COPPER_IGNORE_RULE___PERFORM_BWD__ISAPPLICABLEMATCH = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 8;

	/**
	 * The operation id for the '<em>Is Applicable BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPL_COPPER_IGNORE_RULE___IS_APPLICABLE_BWD__MATCH = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 9;

	/**
	 * The operation id for the '<em>Register Objects To Match BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPL_COPPER_IGNORE_RULE___REGISTER_OBJECTS_TO_MATCH_BWD__MATCH_COPPERCABLE_CONTAINER = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 10;

	/**
	 * The operation id for the '<em>Is Appropriate solve Csp BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPL_COPPER_IGNORE_RULE___IS_APPROPRIATE_SOLVE_CSP_BWD__MATCH_COPPERCABLE_CONTAINER = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 11;

	/**
	 * The operation id for the '<em>Is Appropriate check Csp BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPL_COPPER_IGNORE_RULE___IS_APPROPRIATE_CHECK_CSP_BWD__CSP = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 12;

	/**
	 * The operation id for the '<em>Is Applicable solve Csp BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPL_COPPER_IGNORE_RULE___IS_APPLICABLE_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_CONTAINER_COPPERCABLE_REQCONTAINERTOIMPLCONTAINER_CONTAINER = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 13;

	/**
	 * The operation id for the '<em>Is Applicable check Csp BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPL_COPPER_IGNORE_RULE___IS_APPLICABLE_CHECK_CSP_BWD__CSP = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 14;

	/**
	 * The operation id for the '<em>Register Objects BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPL_COPPER_IGNORE_RULE___REGISTER_OBJECTS_BWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 15;

	/**
	 * The operation id for the '<em>Check Types BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPL_COPPER_IGNORE_RULE___CHECK_TYPES_BWD__MATCH = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 16;

	/**
	 * The operation id for the '<em>Is Appropriate FWD Container 13</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPL_COPPER_IGNORE_RULE___IS_APPROPRIATE_FWD_CONTAINER_13__CONTAINER = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 17;

	/**
	 * The operation id for the '<em>Is Appropriate BWD EMoflon Edge 39</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPL_COPPER_IGNORE_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_39__EMOFLONEDGE = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 18;

	/**
	 * The operation id for the '<em>Check Attributes FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPL_COPPER_IGNORE_RULE___CHECK_ATTRIBUTES_FWD__TRIPLEMATCH = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 19;

	/**
	 * The operation id for the '<em>Check Attributes BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPL_COPPER_IGNORE_RULE___CHECK_ATTRIBUTES_BWD__TRIPLEMATCH = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 20;

	/**
	 * The operation id for the '<em>Is Applicable CC</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPL_COPPER_IGNORE_RULE___IS_APPLICABLE_CC__MATCH_MATCH = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 21;

	/**
	 * The operation id for the '<em>Is Applicable solve Csp CC</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPL_COPPER_IGNORE_RULE___IS_APPLICABLE_SOLVE_CSP_CC__CONTAINER_COPPERCABLE_CONTAINER_MATCH_MATCH = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 22;

	/**
	 * The operation id for the '<em>Is Applicable check Csp CC</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPL_COPPER_IGNORE_RULE___IS_APPLICABLE_CHECK_CSP_CC__CSP = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 23;

	/**
	 * The operation id for the '<em>Check DEC FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPL_COPPER_IGNORE_RULE___CHECK_DEC_FWD__CONTAINER = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 24;

	/**
	 * The operation id for the '<em>Check DEC BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPL_COPPER_IGNORE_RULE___CHECK_DEC_BWD__COPPERCABLE_CONTAINER = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 25;

	/**
	 * The operation id for the '<em>Generate Model</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPL_COPPER_IGNORE_RULE___GENERATE_MODEL__RULEENTRYCONTAINER_REQCONTAINERTOIMPLCONTAINER = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 26;

	/**
	 * The operation id for the '<em>Generate Model solve Csp BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPL_COPPER_IGNORE_RULE___GENERATE_MODEL_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_CONTAINER_REQCONTAINERTOIMPLCONTAINER_CONTAINER_MODELGENERATORRULERESULT = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 27;

	/**
	 * The operation id for the '<em>Generate Model check Csp BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPL_COPPER_IGNORE_RULE___GENERATE_MODEL_CHECK_CSP_BWD__CSP = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 28;

	/**
	 * The number of operations of the '<em>Impl Copper Ignore Rule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPL_COPPER_IGNORE_RULE_OPERATION_COUNT = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 29;

	/**
	 * The meta object id for the '{@link ReqToImpTransformator.Rules.impl.ReqConsumerToComputerRuleImpl <em>Req Consumer To Computer Rule</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ReqToImpTransformator.Rules.impl.ReqConsumerToComputerRuleImpl
	 * @see ReqToImpTransformator.Rules.impl.RulesPackageImpl#getReqConsumerToComputerRule()
	 * @generated
	 */
	int REQ_CONSUMER_TO_COMPUTER_RULE = 8;

	/**
	 * The number of structural features of the '<em>Req Consumer To Computer Rule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQ_CONSUMER_TO_COMPUTER_RULE_FEATURE_COUNT = RuntimePackage.ABSTRACT_RULE_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Is Appropriate FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQ_CONSUMER_TO_COMPUTER_RULE___IS_APPROPRIATE_FWD__MATCH_CONSUMER_CONTAINER_NETWORKSPAN = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 0;

	/**
	 * The operation id for the '<em>Perform FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQ_CONSUMER_TO_COMPUTER_RULE___PERFORM_FWD__ISAPPLICABLEMATCH = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 1;

	/**
	 * The operation id for the '<em>Is Applicable FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQ_CONSUMER_TO_COMPUTER_RULE___IS_APPLICABLE_FWD__MATCH = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 2;

	/**
	 * The operation id for the '<em>Register Objects To Match FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQ_CONSUMER_TO_COMPUTER_RULE___REGISTER_OBJECTS_TO_MATCH_FWD__MATCH_CONSUMER_CONTAINER_NETWORKSPAN = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 3;

	/**
	 * The operation id for the '<em>Is Appropriate solve Csp FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQ_CONSUMER_TO_COMPUTER_RULE___IS_APPROPRIATE_SOLVE_CSP_FWD__MATCH_CONSUMER_CONTAINER_NETWORKSPAN = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 4;

	/**
	 * The operation id for the '<em>Is Appropriate check Csp FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQ_CONSUMER_TO_COMPUTER_RULE___IS_APPROPRIATE_CHECK_CSP_FWD__CSP = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 5;

	/**
	 * The operation id for the '<em>Is Applicable solve Csp FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQ_CONSUMER_TO_COMPUTER_RULE___IS_APPLICABLE_SOLVE_CSP_FWD__ISAPPLICABLEMATCH_COMPUTER_CONSUMER_CONTAINER_VIRTUALNODETOCOMPUTER_NETWORKSPAN_CABLE_CONTAINER_REQCONTAINERTOIMPLCONTAINER = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 6;

	/**
	 * The operation id for the '<em>Is Applicable check Csp FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQ_CONSUMER_TO_COMPUTER_RULE___IS_APPLICABLE_CHECK_CSP_FWD__CSP = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 7;

	/**
	 * The operation id for the '<em>Register Objects FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQ_CONSUMER_TO_COMPUTER_RULE___REGISTER_OBJECTS_FWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 8;

	/**
	 * The operation id for the '<em>Check Types FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQ_CONSUMER_TO_COMPUTER_RULE___CHECK_TYPES_FWD__MATCH = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 9;

	/**
	 * The operation id for the '<em>Is Appropriate BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQ_CONSUMER_TO_COMPUTER_RULE___IS_APPROPRIATE_BWD__MATCH_COMPUTER_CABLE_CONTAINER = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 10;

	/**
	 * The operation id for the '<em>Perform BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQ_CONSUMER_TO_COMPUTER_RULE___PERFORM_BWD__ISAPPLICABLEMATCH = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 11;

	/**
	 * The operation id for the '<em>Is Applicable BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQ_CONSUMER_TO_COMPUTER_RULE___IS_APPLICABLE_BWD__MATCH = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 12;

	/**
	 * The operation id for the '<em>Register Objects To Match BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQ_CONSUMER_TO_COMPUTER_RULE___REGISTER_OBJECTS_TO_MATCH_BWD__MATCH_COMPUTER_CABLE_CONTAINER = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 13;

	/**
	 * The operation id for the '<em>Is Appropriate solve Csp BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQ_CONSUMER_TO_COMPUTER_RULE___IS_APPROPRIATE_SOLVE_CSP_BWD__MATCH_COMPUTER_CABLE_CONTAINER = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 14;

	/**
	 * The operation id for the '<em>Is Appropriate check Csp BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQ_CONSUMER_TO_COMPUTER_RULE___IS_APPROPRIATE_CHECK_CSP_BWD__CSP = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 15;

	/**
	 * The operation id for the '<em>Check Types BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQ_CONSUMER_TO_COMPUTER_RULE___CHECK_TYPES_BWD__MATCH = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 16;

	/**
	 * The operation id for the '<em>Is Appropriate BWD Computer 2</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQ_CONSUMER_TO_COMPUTER_RULE___IS_APPROPRIATE_BWD_COMPUTER_2__COMPUTER = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 17;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 30</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQ_CONSUMER_TO_COMPUTER_RULE___IS_APPROPRIATE_FWD_EMOFLON_EDGE_30__EMOFLONEDGE = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 18;

	/**
	 * The operation id for the '<em>Check Attributes FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQ_CONSUMER_TO_COMPUTER_RULE___CHECK_ATTRIBUTES_FWD__TRIPLEMATCH = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 19;

	/**
	 * The operation id for the '<em>Check Attributes BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQ_CONSUMER_TO_COMPUTER_RULE___CHECK_ATTRIBUTES_BWD__TRIPLEMATCH = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 20;

	/**
	 * The operation id for the '<em>Is Applicable CC</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQ_CONSUMER_TO_COMPUTER_RULE___IS_APPLICABLE_CC__MATCH_MATCH = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 21;

	/**
	 * The operation id for the '<em>Is Applicable solve Csp CC</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQ_CONSUMER_TO_COMPUTER_RULE___IS_APPLICABLE_SOLVE_CSP_CC__COMPUTER_CONSUMER_CONTAINER_NETWORKSPAN_CABLE_CONTAINER_MATCH_MATCH = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 22;

	/**
	 * The operation id for the '<em>Is Applicable check Csp CC</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQ_CONSUMER_TO_COMPUTER_RULE___IS_APPLICABLE_CHECK_CSP_CC__CSP = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 23;

	/**
	 * The operation id for the '<em>Check DEC FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQ_CONSUMER_TO_COMPUTER_RULE___CHECK_DEC_FWD__CONSUMER_CONTAINER_NETWORKSPAN = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 24;

	/**
	 * The operation id for the '<em>Check DEC BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQ_CONSUMER_TO_COMPUTER_RULE___CHECK_DEC_BWD__COMPUTER_CABLE_CONTAINER = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 25;

	/**
	 * The operation id for the '<em>Generate Model</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQ_CONSUMER_TO_COMPUTER_RULE___GENERATE_MODEL__RULEENTRYCONTAINER_VIRTUALNODETOCOMPUTER = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 26;

	/**
	 * The operation id for the '<em>Generate Model solve Csp BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQ_CONSUMER_TO_COMPUTER_RULE___GENERATE_MODEL_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_COMPUTER_CONTAINER_VIRTUALNODETOCOMPUTER_NETWORKSPAN_CABLE_CONTAINER_REQCONTAINERTOIMPLCONTAINER_MODELGENERATORRULERESULT = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 27;

	/**
	 * The operation id for the '<em>Generate Model check Csp BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQ_CONSUMER_TO_COMPUTER_RULE___GENERATE_MODEL_CHECK_CSP_BWD__CSP = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 28;

	/**
	 * The number of operations of the '<em>Req Consumer To Computer Rule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQ_CONSUMER_TO_COMPUTER_RULE_OPERATION_COUNT = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 29;

	/**
	 * The meta object id for the '{@link ReqToImpTransformator.Rules.impl.VirtualNodeToRouterRule2Impl <em>Virtual Node To Router Rule2</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ReqToImpTransformator.Rules.impl.VirtualNodeToRouterRule2Impl
	 * @see ReqToImpTransformator.Rules.impl.RulesPackageImpl#getVirtualNodeToRouterRule2()
	 * @generated
	 */
	int VIRTUAL_NODE_TO_ROUTER_RULE2 = 9;

	/**
	 * The number of structural features of the '<em>Virtual Node To Router Rule2</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUAL_NODE_TO_ROUTER_RULE2_FEATURE_COUNT = RuntimePackage.ABSTRACT_RULE_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Is Appropriate FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUAL_NODE_TO_ROUTER_RULE2___IS_APPROPRIATE_FWD__MATCH_NETWORKSPAN_CONTAINER = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 0;

	/**
	 * The operation id for the '<em>Perform FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUAL_NODE_TO_ROUTER_RULE2___PERFORM_FWD__ISAPPLICABLEMATCH = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 1;

	/**
	 * The operation id for the '<em>Is Applicable FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUAL_NODE_TO_ROUTER_RULE2___IS_APPLICABLE_FWD__MATCH = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 2;

	/**
	 * The operation id for the '<em>Register Objects To Match FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUAL_NODE_TO_ROUTER_RULE2___REGISTER_OBJECTS_TO_MATCH_FWD__MATCH_NETWORKSPAN_CONTAINER = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 3;

	/**
	 * The operation id for the '<em>Is Appropriate solve Csp FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUAL_NODE_TO_ROUTER_RULE2___IS_APPROPRIATE_SOLVE_CSP_FWD__MATCH_NETWORKSPAN_CONTAINER = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 4;

	/**
	 * The operation id for the '<em>Is Appropriate check Csp FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUAL_NODE_TO_ROUTER_RULE2___IS_APPROPRIATE_CHECK_CSP_FWD__CSP = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 5;

	/**
	 * The operation id for the '<em>Check Types FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUAL_NODE_TO_ROUTER_RULE2___CHECK_TYPES_FWD__MATCH = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 6;

	/**
	 * The operation id for the '<em>Is Appropriate BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUAL_NODE_TO_ROUTER_RULE2___IS_APPROPRIATE_BWD__MATCH_CONTAINER_CABLE_ROUTER_ROUTER = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 7;

	/**
	 * The operation id for the '<em>Perform BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUAL_NODE_TO_ROUTER_RULE2___PERFORM_BWD__ISAPPLICABLEMATCH = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 8;

	/**
	 * The operation id for the '<em>Is Applicable BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUAL_NODE_TO_ROUTER_RULE2___IS_APPLICABLE_BWD__MATCH = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 9;

	/**
	 * The operation id for the '<em>Register Objects To Match BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUAL_NODE_TO_ROUTER_RULE2___REGISTER_OBJECTS_TO_MATCH_BWD__MATCH_CONTAINER_CABLE_ROUTER_ROUTER = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 10;

	/**
	 * The operation id for the '<em>Is Appropriate solve Csp BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUAL_NODE_TO_ROUTER_RULE2___IS_APPROPRIATE_SOLVE_CSP_BWD__MATCH_CONTAINER_CABLE_ROUTER_ROUTER = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 11;

	/**
	 * The operation id for the '<em>Is Appropriate check Csp BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUAL_NODE_TO_ROUTER_RULE2___IS_APPROPRIATE_CHECK_CSP_BWD__CSP = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 12;

	/**
	 * The operation id for the '<em>Is Applicable solve Csp BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUAL_NODE_TO_ROUTER_RULE2___IS_APPLICABLE_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_VIRTUALNODETOROUTER_CONTAINER_REQCONTAINERTOIMPLCONTAINER_NETWORKSPAN_CABLE_ROUTER_ROUTER_CONTAINER = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 13;

	/**
	 * The operation id for the '<em>Is Applicable check Csp BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUAL_NODE_TO_ROUTER_RULE2___IS_APPLICABLE_CHECK_CSP_BWD__CSP = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 14;

	/**
	 * The operation id for the '<em>Register Objects BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUAL_NODE_TO_ROUTER_RULE2___REGISTER_OBJECTS_BWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 15;

	/**
	 * The operation id for the '<em>Check Types BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUAL_NODE_TO_ROUTER_RULE2___CHECK_TYPES_BWD__MATCH = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 16;

	/**
	 * The operation id for the '<em>Is Appropriate FWD Network Span 2</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUAL_NODE_TO_ROUTER_RULE2___IS_APPROPRIATE_FWD_NETWORK_SPAN_2__NETWORKSPAN = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 17;

	/**
	 * The operation id for the '<em>Is Appropriate BWD EMoflon Edge 40</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUAL_NODE_TO_ROUTER_RULE2___IS_APPROPRIATE_BWD_EMOFLON_EDGE_40__EMOFLONEDGE = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 18;

	/**
	 * The operation id for the '<em>Check Attributes FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUAL_NODE_TO_ROUTER_RULE2___CHECK_ATTRIBUTES_FWD__TRIPLEMATCH = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 19;

	/**
	 * The operation id for the '<em>Check Attributes BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUAL_NODE_TO_ROUTER_RULE2___CHECK_ATTRIBUTES_BWD__TRIPLEMATCH = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 20;

	/**
	 * The operation id for the '<em>Is Applicable CC</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUAL_NODE_TO_ROUTER_RULE2___IS_APPLICABLE_CC__MATCH_MATCH = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 21;

	/**
	 * The operation id for the '<em>Is Applicable solve Csp CC</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUAL_NODE_TO_ROUTER_RULE2___IS_APPLICABLE_SOLVE_CSP_CC__CONTAINER_NETWORKSPAN_CABLE_ROUTER_ROUTER_CONTAINER_MATCH_MATCH = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 22;

	/**
	 * The operation id for the '<em>Is Applicable check Csp CC</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUAL_NODE_TO_ROUTER_RULE2___IS_APPLICABLE_CHECK_CSP_CC__CSP = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 23;

	/**
	 * The operation id for the '<em>Check DEC FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUAL_NODE_TO_ROUTER_RULE2___CHECK_DEC_FWD__NETWORKSPAN_CONTAINER = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 24;

	/**
	 * The operation id for the '<em>Check DEC BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUAL_NODE_TO_ROUTER_RULE2___CHECK_DEC_BWD__CONTAINER_CABLE_ROUTER_ROUTER = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 25;

	/**
	 * The operation id for the '<em>Generate Model</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUAL_NODE_TO_ROUTER_RULE2___GENERATE_MODEL__RULEENTRYCONTAINER_VIRTUALNODETOROUTER = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 26;

	/**
	 * The operation id for the '<em>Generate Model solve Csp BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUAL_NODE_TO_ROUTER_RULE2___GENERATE_MODEL_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_VIRTUALNODETOROUTER_CONTAINER_REQCONTAINERTOIMPLCONTAINER_NETWORKSPAN_CABLE_ROUTER_CONTAINER_MODELGENERATORRULERESULT = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 27;

	/**
	 * The operation id for the '<em>Generate Model check Csp BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUAL_NODE_TO_ROUTER_RULE2___GENERATE_MODEL_CHECK_CSP_BWD__CSP = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 28;

	/**
	 * The number of operations of the '<em>Virtual Node To Router Rule2</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUAL_NODE_TO_ROUTER_RULE2_OPERATION_COUNT = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 29;

	/**
	 * The meta object id for the '{@link ReqToImpTransformator.Rules.impl.ImplCableIgnoreRuleImpl <em>Impl Cable Ignore Rule</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ReqToImpTransformator.Rules.impl.ImplCableIgnoreRuleImpl
	 * @see ReqToImpTransformator.Rules.impl.RulesPackageImpl#getImplCableIgnoreRule()
	 * @generated
	 */
	int IMPL_CABLE_IGNORE_RULE = 10;

	/**
	 * The number of structural features of the '<em>Impl Cable Ignore Rule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPL_CABLE_IGNORE_RULE_FEATURE_COUNT = RuntimePackage.ABSTRACT_RULE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Impl Cable Ignore Rule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPL_CABLE_IGNORE_RULE_OPERATION_COUNT = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ReqToImpTransformator.Rules.impl.VirtualNodeToServerRuleImpl <em>Virtual Node To Server Rule</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ReqToImpTransformator.Rules.impl.VirtualNodeToServerRuleImpl
	 * @see ReqToImpTransformator.Rules.impl.RulesPackageImpl#getVirtualNodeToServerRule()
	 * @generated
	 */
	int VIRTUAL_NODE_TO_SERVER_RULE = 11;

	/**
	 * The number of structural features of the '<em>Virtual Node To Server Rule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUAL_NODE_TO_SERVER_RULE_FEATURE_COUNT = RuntimePackage.ABSTRACT_RULE_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Is Appropriate FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUAL_NODE_TO_SERVER_RULE___IS_APPROPRIATE_FWD__MATCH_CONTAINER_NETWORKSPAN = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 0;

	/**
	 * The operation id for the '<em>Perform FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUAL_NODE_TO_SERVER_RULE___PERFORM_FWD__ISAPPLICABLEMATCH = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Is Applicable FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUAL_NODE_TO_SERVER_RULE___IS_APPLICABLE_FWD__MATCH = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 2;

	/**
	 * The operation id for the '<em>Register Objects To Match FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUAL_NODE_TO_SERVER_RULE___REGISTER_OBJECTS_TO_MATCH_FWD__MATCH_CONTAINER_NETWORKSPAN = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 3;

	/**
	 * The operation id for the '<em>Is Appropriate solve Csp FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUAL_NODE_TO_SERVER_RULE___IS_APPROPRIATE_SOLVE_CSP_FWD__MATCH_CONTAINER_NETWORKSPAN = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 4;

	/**
	 * The operation id for the '<em>Is Appropriate check Csp FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUAL_NODE_TO_SERVER_RULE___IS_APPROPRIATE_CHECK_CSP_FWD__CSP = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 5;

	/**
	 * The operation id for the '<em>Check Types FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUAL_NODE_TO_SERVER_RULE___CHECK_TYPES_FWD__MATCH = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 6;

	/**
	 * The operation id for the '<em>Is Appropriate BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUAL_NODE_TO_SERVER_RULE___IS_APPROPRIATE_BWD__MATCH_ROUTER_CONTAINER_CABLE_SERVER = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 7;

	/**
	 * The operation id for the '<em>Perform BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUAL_NODE_TO_SERVER_RULE___PERFORM_BWD__ISAPPLICABLEMATCH = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 8;

	/**
	 * The operation id for the '<em>Is Applicable BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUAL_NODE_TO_SERVER_RULE___IS_APPLICABLE_BWD__MATCH = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 9;

	/**
	 * The operation id for the '<em>Register Objects To Match BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUAL_NODE_TO_SERVER_RULE___REGISTER_OBJECTS_TO_MATCH_BWD__MATCH_ROUTER_CONTAINER_CABLE_SERVER = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 10;

	/**
	 * The operation id for the '<em>Is Appropriate solve Csp BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUAL_NODE_TO_SERVER_RULE___IS_APPROPRIATE_SOLVE_CSP_BWD__MATCH_ROUTER_CONTAINER_CABLE_SERVER = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 11;

	/**
	 * The operation id for the '<em>Is Appropriate check Csp BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUAL_NODE_TO_SERVER_RULE___IS_APPROPRIATE_CHECK_CSP_BWD__CSP = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 12;

	/**
	 * The operation id for the '<em>Is Applicable solve Csp BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUAL_NODE_TO_SERVER_RULE___IS_APPLICABLE_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_CONTAINER_VIRTUALNODETOROUTER_NETWORKSPAN_ROUTER_REQCONTAINERTOIMPLCONTAINER_CONTAINER_CABLE_SERVER = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 13;

	/**
	 * The operation id for the '<em>Is Applicable check Csp BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUAL_NODE_TO_SERVER_RULE___IS_APPLICABLE_CHECK_CSP_BWD__CSP = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 14;

	/**
	 * The operation id for the '<em>Register Objects BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUAL_NODE_TO_SERVER_RULE___REGISTER_OBJECTS_BWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 15;

	/**
	 * The operation id for the '<em>Check Types BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUAL_NODE_TO_SERVER_RULE___CHECK_TYPES_BWD__MATCH = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 16;

	/**
	 * The operation id for the '<em>Is Appropriate FWD Container 14</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUAL_NODE_TO_SERVER_RULE___IS_APPROPRIATE_FWD_CONTAINER_14__CONTAINER = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 17;

	/**
	 * The operation id for the '<em>Is Appropriate BWD EMoflon Edge 41</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUAL_NODE_TO_SERVER_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_41__EMOFLONEDGE = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 18;

	/**
	 * The operation id for the '<em>Check Attributes FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUAL_NODE_TO_SERVER_RULE___CHECK_ATTRIBUTES_FWD__TRIPLEMATCH = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 19;

	/**
	 * The operation id for the '<em>Check Attributes BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUAL_NODE_TO_SERVER_RULE___CHECK_ATTRIBUTES_BWD__TRIPLEMATCH = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 20;

	/**
	 * The operation id for the '<em>Is Applicable CC</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUAL_NODE_TO_SERVER_RULE___IS_APPLICABLE_CC__MATCH_MATCH = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 21;

	/**
	 * The operation id for the '<em>Is Applicable solve Csp CC</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUAL_NODE_TO_SERVER_RULE___IS_APPLICABLE_SOLVE_CSP_CC__CONTAINER_NETWORKSPAN_ROUTER_CONTAINER_CABLE_SERVER_MATCH_MATCH = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 22;

	/**
	 * The operation id for the '<em>Is Applicable check Csp CC</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUAL_NODE_TO_SERVER_RULE___IS_APPLICABLE_CHECK_CSP_CC__CSP = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 23;

	/**
	 * The operation id for the '<em>Check DEC FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUAL_NODE_TO_SERVER_RULE___CHECK_DEC_FWD__CONTAINER_NETWORKSPAN = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 24;

	/**
	 * The operation id for the '<em>Check DEC BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUAL_NODE_TO_SERVER_RULE___CHECK_DEC_BWD__ROUTER_CONTAINER_CABLE_SERVER = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 25;

	/**
	 * The operation id for the '<em>Generate Model</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUAL_NODE_TO_SERVER_RULE___GENERATE_MODEL__RULEENTRYCONTAINER_VIRTUALNODETOROUTER = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 26;

	/**
	 * The operation id for the '<em>Generate Model solve Csp BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUAL_NODE_TO_SERVER_RULE___GENERATE_MODEL_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_CONTAINER_VIRTUALNODETOROUTER_NETWORKSPAN_ROUTER_REQCONTAINERTOIMPLCONTAINER_CONTAINER_CABLE_MODELGENERATORRULERESULT = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 27;

	/**
	 * The operation id for the '<em>Generate Model check Csp BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUAL_NODE_TO_SERVER_RULE___GENERATE_MODEL_CHECK_CSP_BWD__CSP = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 28;

	/**
	 * The number of operations of the '<em>Virtual Node To Server Rule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUAL_NODE_TO_SERVER_RULE_OPERATION_COUNT = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 29;

	/**
	 * The meta object id for the '{@link ReqToImpTransformator.Rules.impl.ReqAgentToDeviceRuleImpl <em>Req Agent To Device Rule</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ReqToImpTransformator.Rules.impl.ReqAgentToDeviceRuleImpl
	 * @see ReqToImpTransformator.Rules.impl.RulesPackageImpl#getReqAgentToDeviceRule()
	 * @generated
	 */
	int REQ_AGENT_TO_DEVICE_RULE = 12;

	/**
	 * The number of structural features of the '<em>Req Agent To Device Rule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQ_AGENT_TO_DEVICE_RULE_FEATURE_COUNT = RuntimePackage.ABSTRACT_RULE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Req Agent To Device Rule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQ_AGENT_TO_DEVICE_RULE_OPERATION_COUNT = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 0;

	/**
	 * Returns the meta object for class '{@link ReqToImpTransformator.Rules.ReqProviderToServerRule <em>Req Provider To Server Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Req Provider To Server Rule</em>'.
	 * @see ReqToImpTransformator.Rules.ReqProviderToServerRule
	 * @generated
	 */
	EClass getReqProviderToServerRule();

	/**
	 * Returns the meta object for the '{@link ReqToImpTransformator.Rules.ReqProviderToServerRule#isAppropriate_FWD(org.moflon.tgg.runtime.Match, requirements.Provider, requirements.Container, requirements.NetworkSpan) <em>Is Appropriate FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD</em>' operation.
	 * @see ReqToImpTransformator.Rules.ReqProviderToServerRule#isAppropriate_FWD(org.moflon.tgg.runtime.Match, requirements.Provider, requirements.Container, requirements.NetworkSpan)
	 * @generated
	 */
	EOperation getReqProviderToServerRule__IsAppropriate_FWD__Match_Provider_Container_NetworkSpan();

	/**
	 * Returns the meta object for the '{@link ReqToImpTransformator.Rules.ReqProviderToServerRule#perform_FWD(org.moflon.tgg.runtime.IsApplicableMatch) <em>Perform FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Perform FWD</em>' operation.
	 * @see ReqToImpTransformator.Rules.ReqProviderToServerRule#perform_FWD(org.moflon.tgg.runtime.IsApplicableMatch)
	 * @generated
	 */
	EOperation getReqProviderToServerRule__Perform_FWD__IsApplicableMatch();

	/**
	 * Returns the meta object for the '{@link ReqToImpTransformator.Rules.ReqProviderToServerRule#isApplicable_FWD(org.moflon.tgg.runtime.Match) <em>Is Applicable FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable FWD</em>' operation.
	 * @see ReqToImpTransformator.Rules.ReqProviderToServerRule#isApplicable_FWD(org.moflon.tgg.runtime.Match)
	 * @generated
	 */
	EOperation getReqProviderToServerRule__IsApplicable_FWD__Match();

	/**
	 * Returns the meta object for the '{@link ReqToImpTransformator.Rules.ReqProviderToServerRule#registerObjectsToMatch_FWD(org.moflon.tgg.runtime.Match, requirements.Provider, requirements.Container, requirements.NetworkSpan) <em>Register Objects To Match FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Register Objects To Match FWD</em>' operation.
	 * @see ReqToImpTransformator.Rules.ReqProviderToServerRule#registerObjectsToMatch_FWD(org.moflon.tgg.runtime.Match, requirements.Provider, requirements.Container, requirements.NetworkSpan)
	 * @generated
	 */
	EOperation getReqProviderToServerRule__RegisterObjectsToMatch_FWD__Match_Provider_Container_NetworkSpan();

	/**
	 * Returns the meta object for the '{@link ReqToImpTransformator.Rules.ReqProviderToServerRule#isAppropriate_solveCsp_FWD(org.moflon.tgg.runtime.Match, requirements.Provider, requirements.Container, requirements.NetworkSpan) <em>Is Appropriate solve Csp FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate solve Csp FWD</em>' operation.
	 * @see ReqToImpTransformator.Rules.ReqProviderToServerRule#isAppropriate_solveCsp_FWD(org.moflon.tgg.runtime.Match, requirements.Provider, requirements.Container, requirements.NetworkSpan)
	 * @generated
	 */
	EOperation getReqProviderToServerRule__IsAppropriate_solveCsp_FWD__Match_Provider_Container_NetworkSpan();

	/**
	 * Returns the meta object for the '{@link ReqToImpTransformator.Rules.ReqProviderToServerRule#isAppropriate_checkCsp_FWD(org.moflon.tgg.language.csp.CSP) <em>Is Appropriate check Csp FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate check Csp FWD</em>' operation.
	 * @see ReqToImpTransformator.Rules.ReqProviderToServerRule#isAppropriate_checkCsp_FWD(org.moflon.tgg.language.csp.CSP)
	 * @generated
	 */
	EOperation getReqProviderToServerRule__IsAppropriate_checkCsp_FWD__CSP();

	/**
	 * Returns the meta object for the '{@link ReqToImpTransformator.Rules.ReqProviderToServerRule#isApplicable_solveCsp_FWD(org.moflon.tgg.runtime.IsApplicableMatch, ReqToImpTransformator.VirtualNodeToServer, implementation.Server, requirements.Provider, requirements.Container, requirements.NetworkSpan, implementation.Cable, implementation.Container, ReqToImpTransformator.ReqContainerToImplContainer) <em>Is Applicable solve Csp FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable solve Csp FWD</em>' operation.
	 * @see ReqToImpTransformator.Rules.ReqProviderToServerRule#isApplicable_solveCsp_FWD(org.moflon.tgg.runtime.IsApplicableMatch, ReqToImpTransformator.VirtualNodeToServer, implementation.Server, requirements.Provider, requirements.Container, requirements.NetworkSpan, implementation.Cable, implementation.Container, ReqToImpTransformator.ReqContainerToImplContainer)
	 * @generated
	 */
	EOperation getReqProviderToServerRule__IsApplicable_solveCsp_FWD__IsApplicableMatch_VirtualNodeToServer_Server_Provider_Container_NetworkSpan_Cable_Container_ReqContainerToImplContainer();

	/**
	 * Returns the meta object for the '{@link ReqToImpTransformator.Rules.ReqProviderToServerRule#isApplicable_checkCsp_FWD(org.moflon.tgg.language.csp.CSP) <em>Is Applicable check Csp FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable check Csp FWD</em>' operation.
	 * @see ReqToImpTransformator.Rules.ReqProviderToServerRule#isApplicable_checkCsp_FWD(org.moflon.tgg.language.csp.CSP)
	 * @generated
	 */
	EOperation getReqProviderToServerRule__IsApplicable_checkCsp_FWD__CSP();

	/**
	 * Returns the meta object for the '{@link ReqToImpTransformator.Rules.ReqProviderToServerRule#registerObjects_FWD(org.moflon.tgg.runtime.PerformRuleResult, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject) <em>Register Objects FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Register Objects FWD</em>' operation.
	 * @see ReqToImpTransformator.Rules.ReqProviderToServerRule#registerObjects_FWD(org.moflon.tgg.runtime.PerformRuleResult, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	EOperation getReqProviderToServerRule__RegisterObjects_FWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject();

	/**
	 * Returns the meta object for the '{@link ReqToImpTransformator.Rules.ReqProviderToServerRule#checkTypes_FWD(org.moflon.tgg.runtime.Match) <em>Check Types FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check Types FWD</em>' operation.
	 * @see ReqToImpTransformator.Rules.ReqProviderToServerRule#checkTypes_FWD(org.moflon.tgg.runtime.Match)
	 * @generated
	 */
	EOperation getReqProviderToServerRule__CheckTypes_FWD__Match();

	/**
	 * Returns the meta object for the '{@link ReqToImpTransformator.Rules.ReqProviderToServerRule#isAppropriate_BWD(org.moflon.tgg.runtime.Match, implementation.Server, implementation.Cable, implementation.Container) <em>Is Appropriate BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD</em>' operation.
	 * @see ReqToImpTransformator.Rules.ReqProviderToServerRule#isAppropriate_BWD(org.moflon.tgg.runtime.Match, implementation.Server, implementation.Cable, implementation.Container)
	 * @generated
	 */
	EOperation getReqProviderToServerRule__IsAppropriate_BWD__Match_Server_Cable_Container();

	/**
	 * Returns the meta object for the '{@link ReqToImpTransformator.Rules.ReqProviderToServerRule#perform_BWD(org.moflon.tgg.runtime.IsApplicableMatch) <em>Perform BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Perform BWD</em>' operation.
	 * @see ReqToImpTransformator.Rules.ReqProviderToServerRule#perform_BWD(org.moflon.tgg.runtime.IsApplicableMatch)
	 * @generated
	 */
	EOperation getReqProviderToServerRule__Perform_BWD__IsApplicableMatch();

	/**
	 * Returns the meta object for the '{@link ReqToImpTransformator.Rules.ReqProviderToServerRule#isApplicable_BWD(org.moflon.tgg.runtime.Match) <em>Is Applicable BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable BWD</em>' operation.
	 * @see ReqToImpTransformator.Rules.ReqProviderToServerRule#isApplicable_BWD(org.moflon.tgg.runtime.Match)
	 * @generated
	 */
	EOperation getReqProviderToServerRule__IsApplicable_BWD__Match();

	/**
	 * Returns the meta object for the '{@link ReqToImpTransformator.Rules.ReqProviderToServerRule#registerObjectsToMatch_BWD(org.moflon.tgg.runtime.Match, implementation.Server, implementation.Cable, implementation.Container) <em>Register Objects To Match BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Register Objects To Match BWD</em>' operation.
	 * @see ReqToImpTransformator.Rules.ReqProviderToServerRule#registerObjectsToMatch_BWD(org.moflon.tgg.runtime.Match, implementation.Server, implementation.Cable, implementation.Container)
	 * @generated
	 */
	EOperation getReqProviderToServerRule__RegisterObjectsToMatch_BWD__Match_Server_Cable_Container();

	/**
	 * Returns the meta object for the '{@link ReqToImpTransformator.Rules.ReqProviderToServerRule#isAppropriate_solveCsp_BWD(org.moflon.tgg.runtime.Match, implementation.Server, implementation.Cable, implementation.Container) <em>Is Appropriate solve Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate solve Csp BWD</em>' operation.
	 * @see ReqToImpTransformator.Rules.ReqProviderToServerRule#isAppropriate_solveCsp_BWD(org.moflon.tgg.runtime.Match, implementation.Server, implementation.Cable, implementation.Container)
	 * @generated
	 */
	EOperation getReqProviderToServerRule__IsAppropriate_solveCsp_BWD__Match_Server_Cable_Container();

	/**
	 * Returns the meta object for the '{@link ReqToImpTransformator.Rules.ReqProviderToServerRule#isAppropriate_checkCsp_BWD(org.moflon.tgg.language.csp.CSP) <em>Is Appropriate check Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate check Csp BWD</em>' operation.
	 * @see ReqToImpTransformator.Rules.ReqProviderToServerRule#isAppropriate_checkCsp_BWD(org.moflon.tgg.language.csp.CSP)
	 * @generated
	 */
	EOperation getReqProviderToServerRule__IsAppropriate_checkCsp_BWD__CSP();

	/**
	 * Returns the meta object for the '{@link ReqToImpTransformator.Rules.ReqProviderToServerRule#checkTypes_BWD(org.moflon.tgg.runtime.Match) <em>Check Types BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check Types BWD</em>' operation.
	 * @see ReqToImpTransformator.Rules.ReqProviderToServerRule#checkTypes_BWD(org.moflon.tgg.runtime.Match)
	 * @generated
	 */
	EOperation getReqProviderToServerRule__CheckTypes_BWD__Match();

	/**
	 * Returns the meta object for the '{@link ReqToImpTransformator.Rules.ReqProviderToServerRule#isAppropriate_BWD_Server_2(implementation.Server) <em>Is Appropriate BWD Server 2</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD Server 2</em>' operation.
	 * @see ReqToImpTransformator.Rules.ReqProviderToServerRule#isAppropriate_BWD_Server_2(implementation.Server)
	 * @generated
	 */
	EOperation getReqProviderToServerRule__IsAppropriate_BWD_Server_2__Server();

	/**
	 * Returns the meta object for the '{@link ReqToImpTransformator.Rules.ReqProviderToServerRule#isAppropriate_FWD_EMoflonEdge_28(org.moflon.tgg.runtime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 28</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 28</em>' operation.
	 * @see ReqToImpTransformator.Rules.ReqProviderToServerRule#isAppropriate_FWD_EMoflonEdge_28(org.moflon.tgg.runtime.EMoflonEdge)
	 * @generated
	 */
	EOperation getReqProviderToServerRule__IsAppropriate_FWD_EMoflonEdge_28__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link ReqToImpTransformator.Rules.ReqProviderToServerRule#checkAttributes_FWD(org.moflon.tgg.runtime.TripleMatch) <em>Check Attributes FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check Attributes FWD</em>' operation.
	 * @see ReqToImpTransformator.Rules.ReqProviderToServerRule#checkAttributes_FWD(org.moflon.tgg.runtime.TripleMatch)
	 * @generated
	 */
	EOperation getReqProviderToServerRule__CheckAttributes_FWD__TripleMatch();

	/**
	 * Returns the meta object for the '{@link ReqToImpTransformator.Rules.ReqProviderToServerRule#checkAttributes_BWD(org.moflon.tgg.runtime.TripleMatch) <em>Check Attributes BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check Attributes BWD</em>' operation.
	 * @see ReqToImpTransformator.Rules.ReqProviderToServerRule#checkAttributes_BWD(org.moflon.tgg.runtime.TripleMatch)
	 * @generated
	 */
	EOperation getReqProviderToServerRule__CheckAttributes_BWD__TripleMatch();

	/**
	 * Returns the meta object for the '{@link ReqToImpTransformator.Rules.ReqProviderToServerRule#isApplicable_CC(org.moflon.tgg.runtime.Match, org.moflon.tgg.runtime.Match) <em>Is Applicable CC</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable CC</em>' operation.
	 * @see ReqToImpTransformator.Rules.ReqProviderToServerRule#isApplicable_CC(org.moflon.tgg.runtime.Match, org.moflon.tgg.runtime.Match)
	 * @generated
	 */
	EOperation getReqProviderToServerRule__IsApplicable_CC__Match_Match();

	/**
	 * Returns the meta object for the '{@link ReqToImpTransformator.Rules.ReqProviderToServerRule#isApplicable_solveCsp_CC(implementation.Server, requirements.Provider, requirements.Container, requirements.NetworkSpan, implementation.Cable, implementation.Container, org.moflon.tgg.runtime.Match, org.moflon.tgg.runtime.Match) <em>Is Applicable solve Csp CC</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable solve Csp CC</em>' operation.
	 * @see ReqToImpTransformator.Rules.ReqProviderToServerRule#isApplicable_solveCsp_CC(implementation.Server, requirements.Provider, requirements.Container, requirements.NetworkSpan, implementation.Cable, implementation.Container, org.moflon.tgg.runtime.Match, org.moflon.tgg.runtime.Match)
	 * @generated
	 */
	EOperation getReqProviderToServerRule__IsApplicable_solveCsp_CC__Server_Provider_Container_NetworkSpan_Cable_Container_Match_Match();

	/**
	 * Returns the meta object for the '{@link ReqToImpTransformator.Rules.ReqProviderToServerRule#isApplicable_checkCsp_CC(org.moflon.tgg.language.csp.CSP) <em>Is Applicable check Csp CC</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable check Csp CC</em>' operation.
	 * @see ReqToImpTransformator.Rules.ReqProviderToServerRule#isApplicable_checkCsp_CC(org.moflon.tgg.language.csp.CSP)
	 * @generated
	 */
	EOperation getReqProviderToServerRule__IsApplicable_checkCsp_CC__CSP();

	/**
	 * Returns the meta object for the '{@link ReqToImpTransformator.Rules.ReqProviderToServerRule#checkDEC_FWD(requirements.Provider, requirements.Container, requirements.NetworkSpan) <em>Check DEC FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check DEC FWD</em>' operation.
	 * @see ReqToImpTransformator.Rules.ReqProviderToServerRule#checkDEC_FWD(requirements.Provider, requirements.Container, requirements.NetworkSpan)
	 * @generated
	 */
	EOperation getReqProviderToServerRule__CheckDEC_FWD__Provider_Container_NetworkSpan();

	/**
	 * Returns the meta object for the '{@link ReqToImpTransformator.Rules.ReqProviderToServerRule#checkDEC_BWD(implementation.Server, implementation.Cable, implementation.Container) <em>Check DEC BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check DEC BWD</em>' operation.
	 * @see ReqToImpTransformator.Rules.ReqProviderToServerRule#checkDEC_BWD(implementation.Server, implementation.Cable, implementation.Container)
	 * @generated
	 */
	EOperation getReqProviderToServerRule__CheckDEC_BWD__Server_Cable_Container();

	/**
	 * Returns the meta object for the '{@link ReqToImpTransformator.Rules.ReqProviderToServerRule#generateModel(org.moflon.tgg.language.modelgenerator.RuleEntryContainer, ReqToImpTransformator.VirtualNodeToServer) <em>Generate Model</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Generate Model</em>' operation.
	 * @see ReqToImpTransformator.Rules.ReqProviderToServerRule#generateModel(org.moflon.tgg.language.modelgenerator.RuleEntryContainer, ReqToImpTransformator.VirtualNodeToServer)
	 * @generated
	 */
	EOperation getReqProviderToServerRule__GenerateModel__RuleEntryContainer_VirtualNodeToServer();

	/**
	 * Returns the meta object for the '{@link ReqToImpTransformator.Rules.ReqProviderToServerRule#generateModel_solveCsp_BWD(org.moflon.tgg.runtime.IsApplicableMatch, ReqToImpTransformator.VirtualNodeToServer, implementation.Server, requirements.Container, requirements.NetworkSpan, implementation.Cable, implementation.Container, ReqToImpTransformator.ReqContainerToImplContainer, org.moflon.tgg.runtime.ModelgeneratorRuleResult) <em>Generate Model solve Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Generate Model solve Csp BWD</em>' operation.
	 * @see ReqToImpTransformator.Rules.ReqProviderToServerRule#generateModel_solveCsp_BWD(org.moflon.tgg.runtime.IsApplicableMatch, ReqToImpTransformator.VirtualNodeToServer, implementation.Server, requirements.Container, requirements.NetworkSpan, implementation.Cable, implementation.Container, ReqToImpTransformator.ReqContainerToImplContainer, org.moflon.tgg.runtime.ModelgeneratorRuleResult)
	 * @generated
	 */
	EOperation getReqProviderToServerRule__GenerateModel_solveCsp_BWD__IsApplicableMatch_VirtualNodeToServer_Server_Container_NetworkSpan_Cable_Container_ReqContainerToImplContainer_ModelgeneratorRuleResult();

	/**
	 * Returns the meta object for the '{@link ReqToImpTransformator.Rules.ReqProviderToServerRule#generateModel_checkCsp_BWD(org.moflon.tgg.language.csp.CSP) <em>Generate Model check Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Generate Model check Csp BWD</em>' operation.
	 * @see ReqToImpTransformator.Rules.ReqProviderToServerRule#generateModel_checkCsp_BWD(org.moflon.tgg.language.csp.CSP)
	 * @generated
	 */
	EOperation getReqProviderToServerRule__GenerateModel_checkCsp_BWD__CSP();

	/**
	 * Returns the meta object for class '{@link ReqToImpTransformator.Rules.VirtualNodeToComputerRule <em>Virtual Node To Computer Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Virtual Node To Computer Rule</em>'.
	 * @see ReqToImpTransformator.Rules.VirtualNodeToComputerRule
	 * @generated
	 */
	EClass getVirtualNodeToComputerRule();

	/**
	 * Returns the meta object for the '{@link ReqToImpTransformator.Rules.VirtualNodeToComputerRule#isAppropriate_FWD(org.moflon.tgg.runtime.Match, requirements.Container, requirements.NetworkSpan) <em>Is Appropriate FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD</em>' operation.
	 * @see ReqToImpTransformator.Rules.VirtualNodeToComputerRule#isAppropriate_FWD(org.moflon.tgg.runtime.Match, requirements.Container, requirements.NetworkSpan)
	 * @generated
	 */
	EOperation getVirtualNodeToComputerRule__IsAppropriate_FWD__Match_Container_NetworkSpan();

	/**
	 * Returns the meta object for the '{@link ReqToImpTransformator.Rules.VirtualNodeToComputerRule#perform_FWD(org.moflon.tgg.runtime.IsApplicableMatch) <em>Perform FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Perform FWD</em>' operation.
	 * @see ReqToImpTransformator.Rules.VirtualNodeToComputerRule#perform_FWD(org.moflon.tgg.runtime.IsApplicableMatch)
	 * @generated
	 */
	EOperation getVirtualNodeToComputerRule__Perform_FWD__IsApplicableMatch();

	/**
	 * Returns the meta object for the '{@link ReqToImpTransformator.Rules.VirtualNodeToComputerRule#isApplicable_FWD(org.moflon.tgg.runtime.Match) <em>Is Applicable FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable FWD</em>' operation.
	 * @see ReqToImpTransformator.Rules.VirtualNodeToComputerRule#isApplicable_FWD(org.moflon.tgg.runtime.Match)
	 * @generated
	 */
	EOperation getVirtualNodeToComputerRule__IsApplicable_FWD__Match();

	/**
	 * Returns the meta object for the '{@link ReqToImpTransformator.Rules.VirtualNodeToComputerRule#registerObjectsToMatch_FWD(org.moflon.tgg.runtime.Match, requirements.Container, requirements.NetworkSpan) <em>Register Objects To Match FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Register Objects To Match FWD</em>' operation.
	 * @see ReqToImpTransformator.Rules.VirtualNodeToComputerRule#registerObjectsToMatch_FWD(org.moflon.tgg.runtime.Match, requirements.Container, requirements.NetworkSpan)
	 * @generated
	 */
	EOperation getVirtualNodeToComputerRule__RegisterObjectsToMatch_FWD__Match_Container_NetworkSpan();

	/**
	 * Returns the meta object for the '{@link ReqToImpTransformator.Rules.VirtualNodeToComputerRule#isAppropriate_solveCsp_FWD(org.moflon.tgg.runtime.Match, requirements.Container, requirements.NetworkSpan) <em>Is Appropriate solve Csp FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate solve Csp FWD</em>' operation.
	 * @see ReqToImpTransformator.Rules.VirtualNodeToComputerRule#isAppropriate_solveCsp_FWD(org.moflon.tgg.runtime.Match, requirements.Container, requirements.NetworkSpan)
	 * @generated
	 */
	EOperation getVirtualNodeToComputerRule__IsAppropriate_solveCsp_FWD__Match_Container_NetworkSpan();

	/**
	 * Returns the meta object for the '{@link ReqToImpTransformator.Rules.VirtualNodeToComputerRule#isAppropriate_checkCsp_FWD(org.moflon.tgg.language.csp.CSP) <em>Is Appropriate check Csp FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate check Csp FWD</em>' operation.
	 * @see ReqToImpTransformator.Rules.VirtualNodeToComputerRule#isAppropriate_checkCsp_FWD(org.moflon.tgg.language.csp.CSP)
	 * @generated
	 */
	EOperation getVirtualNodeToComputerRule__IsAppropriate_checkCsp_FWD__CSP();

	/**
	 * Returns the meta object for the '{@link ReqToImpTransformator.Rules.VirtualNodeToComputerRule#checkTypes_FWD(org.moflon.tgg.runtime.Match) <em>Check Types FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check Types FWD</em>' operation.
	 * @see ReqToImpTransformator.Rules.VirtualNodeToComputerRule#checkTypes_FWD(org.moflon.tgg.runtime.Match)
	 * @generated
	 */
	EOperation getVirtualNodeToComputerRule__CheckTypes_FWD__Match();

	/**
	 * Returns the meta object for the '{@link ReqToImpTransformator.Rules.VirtualNodeToComputerRule#isAppropriate_BWD(org.moflon.tgg.runtime.Match, implementation.Router, implementation.Container, implementation.Computer, implementation.Cable) <em>Is Appropriate BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD</em>' operation.
	 * @see ReqToImpTransformator.Rules.VirtualNodeToComputerRule#isAppropriate_BWD(org.moflon.tgg.runtime.Match, implementation.Router, implementation.Container, implementation.Computer, implementation.Cable)
	 * @generated
	 */
	EOperation getVirtualNodeToComputerRule__IsAppropriate_BWD__Match_Router_Container_Computer_Cable();

	/**
	 * Returns the meta object for the '{@link ReqToImpTransformator.Rules.VirtualNodeToComputerRule#perform_BWD(org.moflon.tgg.runtime.IsApplicableMatch) <em>Perform BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Perform BWD</em>' operation.
	 * @see ReqToImpTransformator.Rules.VirtualNodeToComputerRule#perform_BWD(org.moflon.tgg.runtime.IsApplicableMatch)
	 * @generated
	 */
	EOperation getVirtualNodeToComputerRule__Perform_BWD__IsApplicableMatch();

	/**
	 * Returns the meta object for the '{@link ReqToImpTransformator.Rules.VirtualNodeToComputerRule#isApplicable_BWD(org.moflon.tgg.runtime.Match) <em>Is Applicable BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable BWD</em>' operation.
	 * @see ReqToImpTransformator.Rules.VirtualNodeToComputerRule#isApplicable_BWD(org.moflon.tgg.runtime.Match)
	 * @generated
	 */
	EOperation getVirtualNodeToComputerRule__IsApplicable_BWD__Match();

	/**
	 * Returns the meta object for the '{@link ReqToImpTransformator.Rules.VirtualNodeToComputerRule#registerObjectsToMatch_BWD(org.moflon.tgg.runtime.Match, implementation.Router, implementation.Container, implementation.Computer, implementation.Cable) <em>Register Objects To Match BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Register Objects To Match BWD</em>' operation.
	 * @see ReqToImpTransformator.Rules.VirtualNodeToComputerRule#registerObjectsToMatch_BWD(org.moflon.tgg.runtime.Match, implementation.Router, implementation.Container, implementation.Computer, implementation.Cable)
	 * @generated
	 */
	EOperation getVirtualNodeToComputerRule__RegisterObjectsToMatch_BWD__Match_Router_Container_Computer_Cable();

	/**
	 * Returns the meta object for the '{@link ReqToImpTransformator.Rules.VirtualNodeToComputerRule#isAppropriate_solveCsp_BWD(org.moflon.tgg.runtime.Match, implementation.Router, implementation.Container, implementation.Computer, implementation.Cable) <em>Is Appropriate solve Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate solve Csp BWD</em>' operation.
	 * @see ReqToImpTransformator.Rules.VirtualNodeToComputerRule#isAppropriate_solveCsp_BWD(org.moflon.tgg.runtime.Match, implementation.Router, implementation.Container, implementation.Computer, implementation.Cable)
	 * @generated
	 */
	EOperation getVirtualNodeToComputerRule__IsAppropriate_solveCsp_BWD__Match_Router_Container_Computer_Cable();

	/**
	 * Returns the meta object for the '{@link ReqToImpTransformator.Rules.VirtualNodeToComputerRule#isAppropriate_checkCsp_BWD(org.moflon.tgg.language.csp.CSP) <em>Is Appropriate check Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate check Csp BWD</em>' operation.
	 * @see ReqToImpTransformator.Rules.VirtualNodeToComputerRule#isAppropriate_checkCsp_BWD(org.moflon.tgg.language.csp.CSP)
	 * @generated
	 */
	EOperation getVirtualNodeToComputerRule__IsAppropriate_checkCsp_BWD__CSP();

	/**
	 * Returns the meta object for the '{@link ReqToImpTransformator.Rules.VirtualNodeToComputerRule#isApplicable_solveCsp_BWD(org.moflon.tgg.runtime.IsApplicableMatch, implementation.Router, requirements.Container, implementation.Container, ReqToImpTransformator.ReqContainerToImplContainer, implementation.Computer, ReqToImpTransformator.VirtualNodeToRouter, requirements.NetworkSpan, implementation.Cable) <em>Is Applicable solve Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable solve Csp BWD</em>' operation.
	 * @see ReqToImpTransformator.Rules.VirtualNodeToComputerRule#isApplicable_solveCsp_BWD(org.moflon.tgg.runtime.IsApplicableMatch, implementation.Router, requirements.Container, implementation.Container, ReqToImpTransformator.ReqContainerToImplContainer, implementation.Computer, ReqToImpTransformator.VirtualNodeToRouter, requirements.NetworkSpan, implementation.Cable)
	 * @generated
	 */
	EOperation getVirtualNodeToComputerRule__IsApplicable_solveCsp_BWD__IsApplicableMatch_Router_Container_Container_ReqContainerToImplContainer_Computer_VirtualNodeToRouter_NetworkSpan_Cable();

	/**
	 * Returns the meta object for the '{@link ReqToImpTransformator.Rules.VirtualNodeToComputerRule#isApplicable_checkCsp_BWD(org.moflon.tgg.language.csp.CSP) <em>Is Applicable check Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable check Csp BWD</em>' operation.
	 * @see ReqToImpTransformator.Rules.VirtualNodeToComputerRule#isApplicable_checkCsp_BWD(org.moflon.tgg.language.csp.CSP)
	 * @generated
	 */
	EOperation getVirtualNodeToComputerRule__IsApplicable_checkCsp_BWD__CSP();

	/**
	 * Returns the meta object for the '{@link ReqToImpTransformator.Rules.VirtualNodeToComputerRule#registerObjects_BWD(org.moflon.tgg.runtime.PerformRuleResult, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject) <em>Register Objects BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Register Objects BWD</em>' operation.
	 * @see ReqToImpTransformator.Rules.VirtualNodeToComputerRule#registerObjects_BWD(org.moflon.tgg.runtime.PerformRuleResult, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	EOperation getVirtualNodeToComputerRule__RegisterObjects_BWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject();

	/**
	 * Returns the meta object for the '{@link ReqToImpTransformator.Rules.VirtualNodeToComputerRule#checkTypes_BWD(org.moflon.tgg.runtime.Match) <em>Check Types BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check Types BWD</em>' operation.
	 * @see ReqToImpTransformator.Rules.VirtualNodeToComputerRule#checkTypes_BWD(org.moflon.tgg.runtime.Match)
	 * @generated
	 */
	EOperation getVirtualNodeToComputerRule__CheckTypes_BWD__Match();

	/**
	 * Returns the meta object for the '{@link ReqToImpTransformator.Rules.VirtualNodeToComputerRule#isAppropriate_FWD_Container_10(requirements.Container) <em>Is Appropriate FWD Container 10</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD Container 10</em>' operation.
	 * @see ReqToImpTransformator.Rules.VirtualNodeToComputerRule#isAppropriate_FWD_Container_10(requirements.Container)
	 * @generated
	 */
	EOperation getVirtualNodeToComputerRule__IsAppropriate_FWD_Container_10__Container();

	/**
	 * Returns the meta object for the '{@link ReqToImpTransformator.Rules.VirtualNodeToComputerRule#isAppropriate_BWD_EMoflonEdge_36(org.moflon.tgg.runtime.EMoflonEdge) <em>Is Appropriate BWD EMoflon Edge 36</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD EMoflon Edge 36</em>' operation.
	 * @see ReqToImpTransformator.Rules.VirtualNodeToComputerRule#isAppropriate_BWD_EMoflonEdge_36(org.moflon.tgg.runtime.EMoflonEdge)
	 * @generated
	 */
	EOperation getVirtualNodeToComputerRule__IsAppropriate_BWD_EMoflonEdge_36__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link ReqToImpTransformator.Rules.VirtualNodeToComputerRule#checkAttributes_FWD(org.moflon.tgg.runtime.TripleMatch) <em>Check Attributes FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check Attributes FWD</em>' operation.
	 * @see ReqToImpTransformator.Rules.VirtualNodeToComputerRule#checkAttributes_FWD(org.moflon.tgg.runtime.TripleMatch)
	 * @generated
	 */
	EOperation getVirtualNodeToComputerRule__CheckAttributes_FWD__TripleMatch();

	/**
	 * Returns the meta object for the '{@link ReqToImpTransformator.Rules.VirtualNodeToComputerRule#checkAttributes_BWD(org.moflon.tgg.runtime.TripleMatch) <em>Check Attributes BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check Attributes BWD</em>' operation.
	 * @see ReqToImpTransformator.Rules.VirtualNodeToComputerRule#checkAttributes_BWD(org.moflon.tgg.runtime.TripleMatch)
	 * @generated
	 */
	EOperation getVirtualNodeToComputerRule__CheckAttributes_BWD__TripleMatch();

	/**
	 * Returns the meta object for the '{@link ReqToImpTransformator.Rules.VirtualNodeToComputerRule#isApplicable_CC(org.moflon.tgg.runtime.Match, org.moflon.tgg.runtime.Match) <em>Is Applicable CC</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable CC</em>' operation.
	 * @see ReqToImpTransformator.Rules.VirtualNodeToComputerRule#isApplicable_CC(org.moflon.tgg.runtime.Match, org.moflon.tgg.runtime.Match)
	 * @generated
	 */
	EOperation getVirtualNodeToComputerRule__IsApplicable_CC__Match_Match();

	/**
	 * Returns the meta object for the '{@link ReqToImpTransformator.Rules.VirtualNodeToComputerRule#isApplicable_solveCsp_CC(implementation.Router, requirements.Container, implementation.Container, implementation.Computer, requirements.NetworkSpan, implementation.Cable, org.moflon.tgg.runtime.Match, org.moflon.tgg.runtime.Match) <em>Is Applicable solve Csp CC</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable solve Csp CC</em>' operation.
	 * @see ReqToImpTransformator.Rules.VirtualNodeToComputerRule#isApplicable_solveCsp_CC(implementation.Router, requirements.Container, implementation.Container, implementation.Computer, requirements.NetworkSpan, implementation.Cable, org.moflon.tgg.runtime.Match, org.moflon.tgg.runtime.Match)
	 * @generated
	 */
	EOperation getVirtualNodeToComputerRule__IsApplicable_solveCsp_CC__Router_Container_Container_Computer_NetworkSpan_Cable_Match_Match();

	/**
	 * Returns the meta object for the '{@link ReqToImpTransformator.Rules.VirtualNodeToComputerRule#isApplicable_checkCsp_CC(org.moflon.tgg.language.csp.CSP) <em>Is Applicable check Csp CC</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable check Csp CC</em>' operation.
	 * @see ReqToImpTransformator.Rules.VirtualNodeToComputerRule#isApplicable_checkCsp_CC(org.moflon.tgg.language.csp.CSP)
	 * @generated
	 */
	EOperation getVirtualNodeToComputerRule__IsApplicable_checkCsp_CC__CSP();

	/**
	 * Returns the meta object for the '{@link ReqToImpTransformator.Rules.VirtualNodeToComputerRule#checkDEC_FWD(requirements.Container, requirements.NetworkSpan) <em>Check DEC FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check DEC FWD</em>' operation.
	 * @see ReqToImpTransformator.Rules.VirtualNodeToComputerRule#checkDEC_FWD(requirements.Container, requirements.NetworkSpan)
	 * @generated
	 */
	EOperation getVirtualNodeToComputerRule__CheckDEC_FWD__Container_NetworkSpan();

	/**
	 * Returns the meta object for the '{@link ReqToImpTransformator.Rules.VirtualNodeToComputerRule#checkDEC_BWD(implementation.Router, implementation.Container, implementation.Computer, implementation.Cable) <em>Check DEC BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check DEC BWD</em>' operation.
	 * @see ReqToImpTransformator.Rules.VirtualNodeToComputerRule#checkDEC_BWD(implementation.Router, implementation.Container, implementation.Computer, implementation.Cable)
	 * @generated
	 */
	EOperation getVirtualNodeToComputerRule__CheckDEC_BWD__Router_Container_Computer_Cable();

	/**
	 * Returns the meta object for the '{@link ReqToImpTransformator.Rules.VirtualNodeToComputerRule#generateModel(org.moflon.tgg.language.modelgenerator.RuleEntryContainer, ReqToImpTransformator.VirtualNodeToRouter) <em>Generate Model</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Generate Model</em>' operation.
	 * @see ReqToImpTransformator.Rules.VirtualNodeToComputerRule#generateModel(org.moflon.tgg.language.modelgenerator.RuleEntryContainer, ReqToImpTransformator.VirtualNodeToRouter)
	 * @generated
	 */
	EOperation getVirtualNodeToComputerRule__GenerateModel__RuleEntryContainer_VirtualNodeToRouter();

	/**
	 * Returns the meta object for the '{@link ReqToImpTransformator.Rules.VirtualNodeToComputerRule#generateModel_solveCsp_BWD(org.moflon.tgg.runtime.IsApplicableMatch, implementation.Router, requirements.Container, implementation.Container, ReqToImpTransformator.ReqContainerToImplContainer, ReqToImpTransformator.VirtualNodeToRouter, requirements.NetworkSpan, implementation.Cable, org.moflon.tgg.runtime.ModelgeneratorRuleResult) <em>Generate Model solve Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Generate Model solve Csp BWD</em>' operation.
	 * @see ReqToImpTransformator.Rules.VirtualNodeToComputerRule#generateModel_solveCsp_BWD(org.moflon.tgg.runtime.IsApplicableMatch, implementation.Router, requirements.Container, implementation.Container, ReqToImpTransformator.ReqContainerToImplContainer, ReqToImpTransformator.VirtualNodeToRouter, requirements.NetworkSpan, implementation.Cable, org.moflon.tgg.runtime.ModelgeneratorRuleResult)
	 * @generated
	 */
	EOperation getVirtualNodeToComputerRule__GenerateModel_solveCsp_BWD__IsApplicableMatch_Router_Container_Container_ReqContainerToImplContainer_VirtualNodeToRouter_NetworkSpan_Cable_ModelgeneratorRuleResult();

	/**
	 * Returns the meta object for the '{@link ReqToImpTransformator.Rules.VirtualNodeToComputerRule#generateModel_checkCsp_BWD(org.moflon.tgg.language.csp.CSP) <em>Generate Model check Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Generate Model check Csp BWD</em>' operation.
	 * @see ReqToImpTransformator.Rules.VirtualNodeToComputerRule#generateModel_checkCsp_BWD(org.moflon.tgg.language.csp.CSP)
	 * @generated
	 */
	EOperation getVirtualNodeToComputerRule__GenerateModel_checkCsp_BWD__CSP();

	/**
	 * Returns the meta object for class '{@link ReqToImpTransformator.Rules.ImplOutgoingConnectionIgnoreRule <em>Impl Outgoing Connection Ignore Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Impl Outgoing Connection Ignore Rule</em>'.
	 * @see ReqToImpTransformator.Rules.ImplOutgoingConnectionIgnoreRule
	 * @generated
	 */
	EClass getImplOutgoingConnectionIgnoreRule();

	/**
	 * Returns the meta object for class '{@link ReqToImpTransformator.Rules.ImplIncomingConnectionIgnoreRule <em>Impl Incoming Connection Ignore Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Impl Incoming Connection Ignore Rule</em>'.
	 * @see ReqToImpTransformator.Rules.ImplIncomingConnectionIgnoreRule
	 * @generated
	 */
	EClass getImplIncomingConnectionIgnoreRule();

	/**
	 * Returns the meta object for class '{@link ReqToImpTransformator.Rules.VirtualNodeToRouterRule1 <em>Virtual Node To Router Rule1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Virtual Node To Router Rule1</em>'.
	 * @see ReqToImpTransformator.Rules.VirtualNodeToRouterRule1
	 * @generated
	 */
	EClass getVirtualNodeToRouterRule1();

	/**
	 * Returns the meta object for the '{@link ReqToImpTransformator.Rules.VirtualNodeToRouterRule1#isAppropriate_FWD(org.moflon.tgg.runtime.Match, requirements.Container, requirements.NetworkSpan) <em>Is Appropriate FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD</em>' operation.
	 * @see ReqToImpTransformator.Rules.VirtualNodeToRouterRule1#isAppropriate_FWD(org.moflon.tgg.runtime.Match, requirements.Container, requirements.NetworkSpan)
	 * @generated
	 */
	EOperation getVirtualNodeToRouterRule1__IsAppropriate_FWD__Match_Container_NetworkSpan();

	/**
	 * Returns the meta object for the '{@link ReqToImpTransformator.Rules.VirtualNodeToRouterRule1#perform_FWD(org.moflon.tgg.runtime.IsApplicableMatch) <em>Perform FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Perform FWD</em>' operation.
	 * @see ReqToImpTransformator.Rules.VirtualNodeToRouterRule1#perform_FWD(org.moflon.tgg.runtime.IsApplicableMatch)
	 * @generated
	 */
	EOperation getVirtualNodeToRouterRule1__Perform_FWD__IsApplicableMatch();

	/**
	 * Returns the meta object for the '{@link ReqToImpTransformator.Rules.VirtualNodeToRouterRule1#isApplicable_FWD(org.moflon.tgg.runtime.Match) <em>Is Applicable FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable FWD</em>' operation.
	 * @see ReqToImpTransformator.Rules.VirtualNodeToRouterRule1#isApplicable_FWD(org.moflon.tgg.runtime.Match)
	 * @generated
	 */
	EOperation getVirtualNodeToRouterRule1__IsApplicable_FWD__Match();

	/**
	 * Returns the meta object for the '{@link ReqToImpTransformator.Rules.VirtualNodeToRouterRule1#registerObjectsToMatch_FWD(org.moflon.tgg.runtime.Match, requirements.Container, requirements.NetworkSpan) <em>Register Objects To Match FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Register Objects To Match FWD</em>' operation.
	 * @see ReqToImpTransformator.Rules.VirtualNodeToRouterRule1#registerObjectsToMatch_FWD(org.moflon.tgg.runtime.Match, requirements.Container, requirements.NetworkSpan)
	 * @generated
	 */
	EOperation getVirtualNodeToRouterRule1__RegisterObjectsToMatch_FWD__Match_Container_NetworkSpan();

	/**
	 * Returns the meta object for the '{@link ReqToImpTransformator.Rules.VirtualNodeToRouterRule1#isAppropriate_solveCsp_FWD(org.moflon.tgg.runtime.Match, requirements.Container, requirements.NetworkSpan) <em>Is Appropriate solve Csp FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate solve Csp FWD</em>' operation.
	 * @see ReqToImpTransformator.Rules.VirtualNodeToRouterRule1#isAppropriate_solveCsp_FWD(org.moflon.tgg.runtime.Match, requirements.Container, requirements.NetworkSpan)
	 * @generated
	 */
	EOperation getVirtualNodeToRouterRule1__IsAppropriate_solveCsp_FWD__Match_Container_NetworkSpan();

	/**
	 * Returns the meta object for the '{@link ReqToImpTransformator.Rules.VirtualNodeToRouterRule1#isAppropriate_checkCsp_FWD(org.moflon.tgg.language.csp.CSP) <em>Is Appropriate check Csp FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate check Csp FWD</em>' operation.
	 * @see ReqToImpTransformator.Rules.VirtualNodeToRouterRule1#isAppropriate_checkCsp_FWD(org.moflon.tgg.language.csp.CSP)
	 * @generated
	 */
	EOperation getVirtualNodeToRouterRule1__IsAppropriate_checkCsp_FWD__CSP();

	/**
	 * Returns the meta object for the '{@link ReqToImpTransformator.Rules.VirtualNodeToRouterRule1#checkTypes_FWD(org.moflon.tgg.runtime.Match) <em>Check Types FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check Types FWD</em>' operation.
	 * @see ReqToImpTransformator.Rules.VirtualNodeToRouterRule1#checkTypes_FWD(org.moflon.tgg.runtime.Match)
	 * @generated
	 */
	EOperation getVirtualNodeToRouterRule1__CheckTypes_FWD__Match();

	/**
	 * Returns the meta object for the '{@link ReqToImpTransformator.Rules.VirtualNodeToRouterRule1#isAppropriate_BWD(org.moflon.tgg.runtime.Match, implementation.Router, implementation.Container) <em>Is Appropriate BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD</em>' operation.
	 * @see ReqToImpTransformator.Rules.VirtualNodeToRouterRule1#isAppropriate_BWD(org.moflon.tgg.runtime.Match, implementation.Router, implementation.Container)
	 * @generated
	 */
	EOperation getVirtualNodeToRouterRule1__IsAppropriate_BWD__Match_Router_Container();

	/**
	 * Returns the meta object for the '{@link ReqToImpTransformator.Rules.VirtualNodeToRouterRule1#perform_BWD(org.moflon.tgg.runtime.IsApplicableMatch) <em>Perform BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Perform BWD</em>' operation.
	 * @see ReqToImpTransformator.Rules.VirtualNodeToRouterRule1#perform_BWD(org.moflon.tgg.runtime.IsApplicableMatch)
	 * @generated
	 */
	EOperation getVirtualNodeToRouterRule1__Perform_BWD__IsApplicableMatch();

	/**
	 * Returns the meta object for the '{@link ReqToImpTransformator.Rules.VirtualNodeToRouterRule1#isApplicable_BWD(org.moflon.tgg.runtime.Match) <em>Is Applicable BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable BWD</em>' operation.
	 * @see ReqToImpTransformator.Rules.VirtualNodeToRouterRule1#isApplicable_BWD(org.moflon.tgg.runtime.Match)
	 * @generated
	 */
	EOperation getVirtualNodeToRouterRule1__IsApplicable_BWD__Match();

	/**
	 * Returns the meta object for the '{@link ReqToImpTransformator.Rules.VirtualNodeToRouterRule1#registerObjectsToMatch_BWD(org.moflon.tgg.runtime.Match, implementation.Router, implementation.Container) <em>Register Objects To Match BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Register Objects To Match BWD</em>' operation.
	 * @see ReqToImpTransformator.Rules.VirtualNodeToRouterRule1#registerObjectsToMatch_BWD(org.moflon.tgg.runtime.Match, implementation.Router, implementation.Container)
	 * @generated
	 */
	EOperation getVirtualNodeToRouterRule1__RegisterObjectsToMatch_BWD__Match_Router_Container();

	/**
	 * Returns the meta object for the '{@link ReqToImpTransformator.Rules.VirtualNodeToRouterRule1#isAppropriate_solveCsp_BWD(org.moflon.tgg.runtime.Match, implementation.Router, implementation.Container) <em>Is Appropriate solve Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate solve Csp BWD</em>' operation.
	 * @see ReqToImpTransformator.Rules.VirtualNodeToRouterRule1#isAppropriate_solveCsp_BWD(org.moflon.tgg.runtime.Match, implementation.Router, implementation.Container)
	 * @generated
	 */
	EOperation getVirtualNodeToRouterRule1__IsAppropriate_solveCsp_BWD__Match_Router_Container();

	/**
	 * Returns the meta object for the '{@link ReqToImpTransformator.Rules.VirtualNodeToRouterRule1#isAppropriate_checkCsp_BWD(org.moflon.tgg.language.csp.CSP) <em>Is Appropriate check Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate check Csp BWD</em>' operation.
	 * @see ReqToImpTransformator.Rules.VirtualNodeToRouterRule1#isAppropriate_checkCsp_BWD(org.moflon.tgg.language.csp.CSP)
	 * @generated
	 */
	EOperation getVirtualNodeToRouterRule1__IsAppropriate_checkCsp_BWD__CSP();

	/**
	 * Returns the meta object for the '{@link ReqToImpTransformator.Rules.VirtualNodeToRouterRule1#isApplicable_solveCsp_BWD(org.moflon.tgg.runtime.IsApplicableMatch, requirements.Container, implementation.Router, implementation.Container, ReqToImpTransformator.ReqContainerToImplContainer, requirements.NetworkSpan) <em>Is Applicable solve Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable solve Csp BWD</em>' operation.
	 * @see ReqToImpTransformator.Rules.VirtualNodeToRouterRule1#isApplicable_solveCsp_BWD(org.moflon.tgg.runtime.IsApplicableMatch, requirements.Container, implementation.Router, implementation.Container, ReqToImpTransformator.ReqContainerToImplContainer, requirements.NetworkSpan)
	 * @generated
	 */
	EOperation getVirtualNodeToRouterRule1__IsApplicable_solveCsp_BWD__IsApplicableMatch_Container_Router_Container_ReqContainerToImplContainer_NetworkSpan();

	/**
	 * Returns the meta object for the '{@link ReqToImpTransformator.Rules.VirtualNodeToRouterRule1#isApplicable_checkCsp_BWD(org.moflon.tgg.language.csp.CSP) <em>Is Applicable check Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable check Csp BWD</em>' operation.
	 * @see ReqToImpTransformator.Rules.VirtualNodeToRouterRule1#isApplicable_checkCsp_BWD(org.moflon.tgg.language.csp.CSP)
	 * @generated
	 */
	EOperation getVirtualNodeToRouterRule1__IsApplicable_checkCsp_BWD__CSP();

	/**
	 * Returns the meta object for the '{@link ReqToImpTransformator.Rules.VirtualNodeToRouterRule1#registerObjects_BWD(org.moflon.tgg.runtime.PerformRuleResult, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject) <em>Register Objects BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Register Objects BWD</em>' operation.
	 * @see ReqToImpTransformator.Rules.VirtualNodeToRouterRule1#registerObjects_BWD(org.moflon.tgg.runtime.PerformRuleResult, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	EOperation getVirtualNodeToRouterRule1__RegisterObjects_BWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject();

	/**
	 * Returns the meta object for the '{@link ReqToImpTransformator.Rules.VirtualNodeToRouterRule1#checkTypes_BWD(org.moflon.tgg.runtime.Match) <em>Check Types BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check Types BWD</em>' operation.
	 * @see ReqToImpTransformator.Rules.VirtualNodeToRouterRule1#checkTypes_BWD(org.moflon.tgg.runtime.Match)
	 * @generated
	 */
	EOperation getVirtualNodeToRouterRule1__CheckTypes_BWD__Match();

	/**
	 * Returns the meta object for the '{@link ReqToImpTransformator.Rules.VirtualNodeToRouterRule1#isAppropriate_FWD_Container_11(requirements.Container) <em>Is Appropriate FWD Container 11</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD Container 11</em>' operation.
	 * @see ReqToImpTransformator.Rules.VirtualNodeToRouterRule1#isAppropriate_FWD_Container_11(requirements.Container)
	 * @generated
	 */
	EOperation getVirtualNodeToRouterRule1__IsAppropriate_FWD_Container_11__Container();

	/**
	 * Returns the meta object for the '{@link ReqToImpTransformator.Rules.VirtualNodeToRouterRule1#isAppropriate_BWD_EMoflonEdge_37(org.moflon.tgg.runtime.EMoflonEdge) <em>Is Appropriate BWD EMoflon Edge 37</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD EMoflon Edge 37</em>' operation.
	 * @see ReqToImpTransformator.Rules.VirtualNodeToRouterRule1#isAppropriate_BWD_EMoflonEdge_37(org.moflon.tgg.runtime.EMoflonEdge)
	 * @generated
	 */
	EOperation getVirtualNodeToRouterRule1__IsAppropriate_BWD_EMoflonEdge_37__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link ReqToImpTransformator.Rules.VirtualNodeToRouterRule1#checkAttributes_FWD(org.moflon.tgg.runtime.TripleMatch) <em>Check Attributes FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check Attributes FWD</em>' operation.
	 * @see ReqToImpTransformator.Rules.VirtualNodeToRouterRule1#checkAttributes_FWD(org.moflon.tgg.runtime.TripleMatch)
	 * @generated
	 */
	EOperation getVirtualNodeToRouterRule1__CheckAttributes_FWD__TripleMatch();

	/**
	 * Returns the meta object for the '{@link ReqToImpTransformator.Rules.VirtualNodeToRouterRule1#checkAttributes_BWD(org.moflon.tgg.runtime.TripleMatch) <em>Check Attributes BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check Attributes BWD</em>' operation.
	 * @see ReqToImpTransformator.Rules.VirtualNodeToRouterRule1#checkAttributes_BWD(org.moflon.tgg.runtime.TripleMatch)
	 * @generated
	 */
	EOperation getVirtualNodeToRouterRule1__CheckAttributes_BWD__TripleMatch();

	/**
	 * Returns the meta object for the '{@link ReqToImpTransformator.Rules.VirtualNodeToRouterRule1#isApplicable_CC(org.moflon.tgg.runtime.Match, org.moflon.tgg.runtime.Match) <em>Is Applicable CC</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable CC</em>' operation.
	 * @see ReqToImpTransformator.Rules.VirtualNodeToRouterRule1#isApplicable_CC(org.moflon.tgg.runtime.Match, org.moflon.tgg.runtime.Match)
	 * @generated
	 */
	EOperation getVirtualNodeToRouterRule1__IsApplicable_CC__Match_Match();

	/**
	 * Returns the meta object for the '{@link ReqToImpTransformator.Rules.VirtualNodeToRouterRule1#isApplicable_solveCsp_CC(requirements.Container, implementation.Router, implementation.Container, requirements.NetworkSpan, org.moflon.tgg.runtime.Match, org.moflon.tgg.runtime.Match) <em>Is Applicable solve Csp CC</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable solve Csp CC</em>' operation.
	 * @see ReqToImpTransformator.Rules.VirtualNodeToRouterRule1#isApplicable_solveCsp_CC(requirements.Container, implementation.Router, implementation.Container, requirements.NetworkSpan, org.moflon.tgg.runtime.Match, org.moflon.tgg.runtime.Match)
	 * @generated
	 */
	EOperation getVirtualNodeToRouterRule1__IsApplicable_solveCsp_CC__Container_Router_Container_NetworkSpan_Match_Match();

	/**
	 * Returns the meta object for the '{@link ReqToImpTransformator.Rules.VirtualNodeToRouterRule1#isApplicable_checkCsp_CC(org.moflon.tgg.language.csp.CSP) <em>Is Applicable check Csp CC</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable check Csp CC</em>' operation.
	 * @see ReqToImpTransformator.Rules.VirtualNodeToRouterRule1#isApplicable_checkCsp_CC(org.moflon.tgg.language.csp.CSP)
	 * @generated
	 */
	EOperation getVirtualNodeToRouterRule1__IsApplicable_checkCsp_CC__CSP();

	/**
	 * Returns the meta object for the '{@link ReqToImpTransformator.Rules.VirtualNodeToRouterRule1#checkDEC_FWD(requirements.Container, requirements.NetworkSpan) <em>Check DEC FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check DEC FWD</em>' operation.
	 * @see ReqToImpTransformator.Rules.VirtualNodeToRouterRule1#checkDEC_FWD(requirements.Container, requirements.NetworkSpan)
	 * @generated
	 */
	EOperation getVirtualNodeToRouterRule1__CheckDEC_FWD__Container_NetworkSpan();

	/**
	 * Returns the meta object for the '{@link ReqToImpTransformator.Rules.VirtualNodeToRouterRule1#checkDEC_BWD(implementation.Router, implementation.Container) <em>Check DEC BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check DEC BWD</em>' operation.
	 * @see ReqToImpTransformator.Rules.VirtualNodeToRouterRule1#checkDEC_BWD(implementation.Router, implementation.Container)
	 * @generated
	 */
	EOperation getVirtualNodeToRouterRule1__CheckDEC_BWD__Router_Container();

	/**
	 * Returns the meta object for the '{@link ReqToImpTransformator.Rules.VirtualNodeToRouterRule1#generateModel(org.moflon.tgg.language.modelgenerator.RuleEntryContainer, ReqToImpTransformator.ReqContainerToImplContainer) <em>Generate Model</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Generate Model</em>' operation.
	 * @see ReqToImpTransformator.Rules.VirtualNodeToRouterRule1#generateModel(org.moflon.tgg.language.modelgenerator.RuleEntryContainer, ReqToImpTransformator.ReqContainerToImplContainer)
	 * @generated
	 */
	EOperation getVirtualNodeToRouterRule1__GenerateModel__RuleEntryContainer_ReqContainerToImplContainer();

	/**
	 * Returns the meta object for the '{@link ReqToImpTransformator.Rules.VirtualNodeToRouterRule1#generateModel_solveCsp_BWD(org.moflon.tgg.runtime.IsApplicableMatch, requirements.Container, implementation.Container, ReqToImpTransformator.ReqContainerToImplContainer, requirements.NetworkSpan, org.moflon.tgg.runtime.ModelgeneratorRuleResult) <em>Generate Model solve Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Generate Model solve Csp BWD</em>' operation.
	 * @see ReqToImpTransformator.Rules.VirtualNodeToRouterRule1#generateModel_solveCsp_BWD(org.moflon.tgg.runtime.IsApplicableMatch, requirements.Container, implementation.Container, ReqToImpTransformator.ReqContainerToImplContainer, requirements.NetworkSpan, org.moflon.tgg.runtime.ModelgeneratorRuleResult)
	 * @generated
	 */
	EOperation getVirtualNodeToRouterRule1__GenerateModel_solveCsp_BWD__IsApplicableMatch_Container_Container_ReqContainerToImplContainer_NetworkSpan_ModelgeneratorRuleResult();

	/**
	 * Returns the meta object for the '{@link ReqToImpTransformator.Rules.VirtualNodeToRouterRule1#generateModel_checkCsp_BWD(org.moflon.tgg.language.csp.CSP) <em>Generate Model check Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Generate Model check Csp BWD</em>' operation.
	 * @see ReqToImpTransformator.Rules.VirtualNodeToRouterRule1#generateModel_checkCsp_BWD(org.moflon.tgg.language.csp.CSP)
	 * @generated
	 */
	EOperation getVirtualNodeToRouterRule1__GenerateModel_checkCsp_BWD__CSP();

	/**
	 * Returns the meta object for class '{@link ReqToImpTransformator.Rules.ImplGlassIgnoreRule <em>Impl Glass Ignore Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Impl Glass Ignore Rule</em>'.
	 * @see ReqToImpTransformator.Rules.ImplGlassIgnoreRule
	 * @generated
	 */
	EClass getImplGlassIgnoreRule();

	/**
	 * Returns the meta object for the '{@link ReqToImpTransformator.Rules.ImplGlassIgnoreRule#isAppropriate_FWD(org.moflon.tgg.runtime.Match, requirements.Container) <em>Is Appropriate FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD</em>' operation.
	 * @see ReqToImpTransformator.Rules.ImplGlassIgnoreRule#isAppropriate_FWD(org.moflon.tgg.runtime.Match, requirements.Container)
	 * @generated
	 */
	EOperation getImplGlassIgnoreRule__IsAppropriate_FWD__Match_Container();

	/**
	 * Returns the meta object for the '{@link ReqToImpTransformator.Rules.ImplGlassIgnoreRule#perform_FWD(org.moflon.tgg.runtime.IsApplicableMatch) <em>Perform FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Perform FWD</em>' operation.
	 * @see ReqToImpTransformator.Rules.ImplGlassIgnoreRule#perform_FWD(org.moflon.tgg.runtime.IsApplicableMatch)
	 * @generated
	 */
	EOperation getImplGlassIgnoreRule__Perform_FWD__IsApplicableMatch();

	/**
	 * Returns the meta object for the '{@link ReqToImpTransformator.Rules.ImplGlassIgnoreRule#isApplicable_FWD(org.moflon.tgg.runtime.Match) <em>Is Applicable FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable FWD</em>' operation.
	 * @see ReqToImpTransformator.Rules.ImplGlassIgnoreRule#isApplicable_FWD(org.moflon.tgg.runtime.Match)
	 * @generated
	 */
	EOperation getImplGlassIgnoreRule__IsApplicable_FWD__Match();

	/**
	 * Returns the meta object for the '{@link ReqToImpTransformator.Rules.ImplGlassIgnoreRule#registerObjectsToMatch_FWD(org.moflon.tgg.runtime.Match, requirements.Container) <em>Register Objects To Match FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Register Objects To Match FWD</em>' operation.
	 * @see ReqToImpTransformator.Rules.ImplGlassIgnoreRule#registerObjectsToMatch_FWD(org.moflon.tgg.runtime.Match, requirements.Container)
	 * @generated
	 */
	EOperation getImplGlassIgnoreRule__RegisterObjectsToMatch_FWD__Match_Container();

	/**
	 * Returns the meta object for the '{@link ReqToImpTransformator.Rules.ImplGlassIgnoreRule#isAppropriate_solveCsp_FWD(org.moflon.tgg.runtime.Match, requirements.Container) <em>Is Appropriate solve Csp FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate solve Csp FWD</em>' operation.
	 * @see ReqToImpTransformator.Rules.ImplGlassIgnoreRule#isAppropriate_solveCsp_FWD(org.moflon.tgg.runtime.Match, requirements.Container)
	 * @generated
	 */
	EOperation getImplGlassIgnoreRule__IsAppropriate_solveCsp_FWD__Match_Container();

	/**
	 * Returns the meta object for the '{@link ReqToImpTransformator.Rules.ImplGlassIgnoreRule#isAppropriate_checkCsp_FWD(org.moflon.tgg.language.csp.CSP) <em>Is Appropriate check Csp FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate check Csp FWD</em>' operation.
	 * @see ReqToImpTransformator.Rules.ImplGlassIgnoreRule#isAppropriate_checkCsp_FWD(org.moflon.tgg.language.csp.CSP)
	 * @generated
	 */
	EOperation getImplGlassIgnoreRule__IsAppropriate_checkCsp_FWD__CSP();

	/**
	 * Returns the meta object for the '{@link ReqToImpTransformator.Rules.ImplGlassIgnoreRule#checkTypes_FWD(org.moflon.tgg.runtime.Match) <em>Check Types FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check Types FWD</em>' operation.
	 * @see ReqToImpTransformator.Rules.ImplGlassIgnoreRule#checkTypes_FWD(org.moflon.tgg.runtime.Match)
	 * @generated
	 */
	EOperation getImplGlassIgnoreRule__CheckTypes_FWD__Match();

	/**
	 * Returns the meta object for the '{@link ReqToImpTransformator.Rules.ImplGlassIgnoreRule#isAppropriate_BWD(org.moflon.tgg.runtime.Match, implementation.GlassFiberCable, implementation.Container) <em>Is Appropriate BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD</em>' operation.
	 * @see ReqToImpTransformator.Rules.ImplGlassIgnoreRule#isAppropriate_BWD(org.moflon.tgg.runtime.Match, implementation.GlassFiberCable, implementation.Container)
	 * @generated
	 */
	EOperation getImplGlassIgnoreRule__IsAppropriate_BWD__Match_GlassFiberCable_Container();

	/**
	 * Returns the meta object for the '{@link ReqToImpTransformator.Rules.ImplGlassIgnoreRule#perform_BWD(org.moflon.tgg.runtime.IsApplicableMatch) <em>Perform BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Perform BWD</em>' operation.
	 * @see ReqToImpTransformator.Rules.ImplGlassIgnoreRule#perform_BWD(org.moflon.tgg.runtime.IsApplicableMatch)
	 * @generated
	 */
	EOperation getImplGlassIgnoreRule__Perform_BWD__IsApplicableMatch();

	/**
	 * Returns the meta object for the '{@link ReqToImpTransformator.Rules.ImplGlassIgnoreRule#isApplicable_BWD(org.moflon.tgg.runtime.Match) <em>Is Applicable BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable BWD</em>' operation.
	 * @see ReqToImpTransformator.Rules.ImplGlassIgnoreRule#isApplicable_BWD(org.moflon.tgg.runtime.Match)
	 * @generated
	 */
	EOperation getImplGlassIgnoreRule__IsApplicable_BWD__Match();

	/**
	 * Returns the meta object for the '{@link ReqToImpTransformator.Rules.ImplGlassIgnoreRule#registerObjectsToMatch_BWD(org.moflon.tgg.runtime.Match, implementation.GlassFiberCable, implementation.Container) <em>Register Objects To Match BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Register Objects To Match BWD</em>' operation.
	 * @see ReqToImpTransformator.Rules.ImplGlassIgnoreRule#registerObjectsToMatch_BWD(org.moflon.tgg.runtime.Match, implementation.GlassFiberCable, implementation.Container)
	 * @generated
	 */
	EOperation getImplGlassIgnoreRule__RegisterObjectsToMatch_BWD__Match_GlassFiberCable_Container();

	/**
	 * Returns the meta object for the '{@link ReqToImpTransformator.Rules.ImplGlassIgnoreRule#isAppropriate_solveCsp_BWD(org.moflon.tgg.runtime.Match, implementation.GlassFiberCable, implementation.Container) <em>Is Appropriate solve Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate solve Csp BWD</em>' operation.
	 * @see ReqToImpTransformator.Rules.ImplGlassIgnoreRule#isAppropriate_solveCsp_BWD(org.moflon.tgg.runtime.Match, implementation.GlassFiberCable, implementation.Container)
	 * @generated
	 */
	EOperation getImplGlassIgnoreRule__IsAppropriate_solveCsp_BWD__Match_GlassFiberCable_Container();

	/**
	 * Returns the meta object for the '{@link ReqToImpTransformator.Rules.ImplGlassIgnoreRule#isAppropriate_checkCsp_BWD(org.moflon.tgg.language.csp.CSP) <em>Is Appropriate check Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate check Csp BWD</em>' operation.
	 * @see ReqToImpTransformator.Rules.ImplGlassIgnoreRule#isAppropriate_checkCsp_BWD(org.moflon.tgg.language.csp.CSP)
	 * @generated
	 */
	EOperation getImplGlassIgnoreRule__IsAppropriate_checkCsp_BWD__CSP();

	/**
	 * Returns the meta object for the '{@link ReqToImpTransformator.Rules.ImplGlassIgnoreRule#isApplicable_solveCsp_BWD(org.moflon.tgg.runtime.IsApplicableMatch, requirements.Container, implementation.GlassFiberCable, ReqToImpTransformator.ReqContainerToImplContainer, implementation.Container) <em>Is Applicable solve Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable solve Csp BWD</em>' operation.
	 * @see ReqToImpTransformator.Rules.ImplGlassIgnoreRule#isApplicable_solveCsp_BWD(org.moflon.tgg.runtime.IsApplicableMatch, requirements.Container, implementation.GlassFiberCable, ReqToImpTransformator.ReqContainerToImplContainer, implementation.Container)
	 * @generated
	 */
	EOperation getImplGlassIgnoreRule__IsApplicable_solveCsp_BWD__IsApplicableMatch_Container_GlassFiberCable_ReqContainerToImplContainer_Container();

	/**
	 * Returns the meta object for the '{@link ReqToImpTransformator.Rules.ImplGlassIgnoreRule#isApplicable_checkCsp_BWD(org.moflon.tgg.language.csp.CSP) <em>Is Applicable check Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable check Csp BWD</em>' operation.
	 * @see ReqToImpTransformator.Rules.ImplGlassIgnoreRule#isApplicable_checkCsp_BWD(org.moflon.tgg.language.csp.CSP)
	 * @generated
	 */
	EOperation getImplGlassIgnoreRule__IsApplicable_checkCsp_BWD__CSP();

	/**
	 * Returns the meta object for the '{@link ReqToImpTransformator.Rules.ImplGlassIgnoreRule#registerObjects_BWD(org.moflon.tgg.runtime.PerformRuleResult, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject) <em>Register Objects BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Register Objects BWD</em>' operation.
	 * @see ReqToImpTransformator.Rules.ImplGlassIgnoreRule#registerObjects_BWD(org.moflon.tgg.runtime.PerformRuleResult, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	EOperation getImplGlassIgnoreRule__RegisterObjects_BWD__PerformRuleResult_EObject_EObject_EObject_EObject();

	/**
	 * Returns the meta object for the '{@link ReqToImpTransformator.Rules.ImplGlassIgnoreRule#checkTypes_BWD(org.moflon.tgg.runtime.Match) <em>Check Types BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check Types BWD</em>' operation.
	 * @see ReqToImpTransformator.Rules.ImplGlassIgnoreRule#checkTypes_BWD(org.moflon.tgg.runtime.Match)
	 * @generated
	 */
	EOperation getImplGlassIgnoreRule__CheckTypes_BWD__Match();

	/**
	 * Returns the meta object for the '{@link ReqToImpTransformator.Rules.ImplGlassIgnoreRule#isAppropriate_FWD_Container_12(requirements.Container) <em>Is Appropriate FWD Container 12</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD Container 12</em>' operation.
	 * @see ReqToImpTransformator.Rules.ImplGlassIgnoreRule#isAppropriate_FWD_Container_12(requirements.Container)
	 * @generated
	 */
	EOperation getImplGlassIgnoreRule__IsAppropriate_FWD_Container_12__Container();

	/**
	 * Returns the meta object for the '{@link ReqToImpTransformator.Rules.ImplGlassIgnoreRule#isAppropriate_BWD_EMoflonEdge_38(org.moflon.tgg.runtime.EMoflonEdge) <em>Is Appropriate BWD EMoflon Edge 38</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD EMoflon Edge 38</em>' operation.
	 * @see ReqToImpTransformator.Rules.ImplGlassIgnoreRule#isAppropriate_BWD_EMoflonEdge_38(org.moflon.tgg.runtime.EMoflonEdge)
	 * @generated
	 */
	EOperation getImplGlassIgnoreRule__IsAppropriate_BWD_EMoflonEdge_38__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link ReqToImpTransformator.Rules.ImplGlassIgnoreRule#checkAttributes_FWD(org.moflon.tgg.runtime.TripleMatch) <em>Check Attributes FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check Attributes FWD</em>' operation.
	 * @see ReqToImpTransformator.Rules.ImplGlassIgnoreRule#checkAttributes_FWD(org.moflon.tgg.runtime.TripleMatch)
	 * @generated
	 */
	EOperation getImplGlassIgnoreRule__CheckAttributes_FWD__TripleMatch();

	/**
	 * Returns the meta object for the '{@link ReqToImpTransformator.Rules.ImplGlassIgnoreRule#checkAttributes_BWD(org.moflon.tgg.runtime.TripleMatch) <em>Check Attributes BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check Attributes BWD</em>' operation.
	 * @see ReqToImpTransformator.Rules.ImplGlassIgnoreRule#checkAttributes_BWD(org.moflon.tgg.runtime.TripleMatch)
	 * @generated
	 */
	EOperation getImplGlassIgnoreRule__CheckAttributes_BWD__TripleMatch();

	/**
	 * Returns the meta object for the '{@link ReqToImpTransformator.Rules.ImplGlassIgnoreRule#isApplicable_CC(org.moflon.tgg.runtime.Match, org.moflon.tgg.runtime.Match) <em>Is Applicable CC</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable CC</em>' operation.
	 * @see ReqToImpTransformator.Rules.ImplGlassIgnoreRule#isApplicable_CC(org.moflon.tgg.runtime.Match, org.moflon.tgg.runtime.Match)
	 * @generated
	 */
	EOperation getImplGlassIgnoreRule__IsApplicable_CC__Match_Match();

	/**
	 * Returns the meta object for the '{@link ReqToImpTransformator.Rules.ImplGlassIgnoreRule#isApplicable_solveCsp_CC(requirements.Container, implementation.GlassFiberCable, implementation.Container, org.moflon.tgg.runtime.Match, org.moflon.tgg.runtime.Match) <em>Is Applicable solve Csp CC</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable solve Csp CC</em>' operation.
	 * @see ReqToImpTransformator.Rules.ImplGlassIgnoreRule#isApplicable_solveCsp_CC(requirements.Container, implementation.GlassFiberCable, implementation.Container, org.moflon.tgg.runtime.Match, org.moflon.tgg.runtime.Match)
	 * @generated
	 */
	EOperation getImplGlassIgnoreRule__IsApplicable_solveCsp_CC__Container_GlassFiberCable_Container_Match_Match();

	/**
	 * Returns the meta object for the '{@link ReqToImpTransformator.Rules.ImplGlassIgnoreRule#isApplicable_checkCsp_CC(org.moflon.tgg.language.csp.CSP) <em>Is Applicable check Csp CC</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable check Csp CC</em>' operation.
	 * @see ReqToImpTransformator.Rules.ImplGlassIgnoreRule#isApplicable_checkCsp_CC(org.moflon.tgg.language.csp.CSP)
	 * @generated
	 */
	EOperation getImplGlassIgnoreRule__IsApplicable_checkCsp_CC__CSP();

	/**
	 * Returns the meta object for the '{@link ReqToImpTransformator.Rules.ImplGlassIgnoreRule#checkDEC_FWD(requirements.Container) <em>Check DEC FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check DEC FWD</em>' operation.
	 * @see ReqToImpTransformator.Rules.ImplGlassIgnoreRule#checkDEC_FWD(requirements.Container)
	 * @generated
	 */
	EOperation getImplGlassIgnoreRule__CheckDEC_FWD__Container();

	/**
	 * Returns the meta object for the '{@link ReqToImpTransformator.Rules.ImplGlassIgnoreRule#checkDEC_BWD(implementation.GlassFiberCable, implementation.Container) <em>Check DEC BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check DEC BWD</em>' operation.
	 * @see ReqToImpTransformator.Rules.ImplGlassIgnoreRule#checkDEC_BWD(implementation.GlassFiberCable, implementation.Container)
	 * @generated
	 */
	EOperation getImplGlassIgnoreRule__CheckDEC_BWD__GlassFiberCable_Container();

	/**
	 * Returns the meta object for the '{@link ReqToImpTransformator.Rules.ImplGlassIgnoreRule#generateModel(org.moflon.tgg.language.modelgenerator.RuleEntryContainer, ReqToImpTransformator.ReqContainerToImplContainer) <em>Generate Model</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Generate Model</em>' operation.
	 * @see ReqToImpTransformator.Rules.ImplGlassIgnoreRule#generateModel(org.moflon.tgg.language.modelgenerator.RuleEntryContainer, ReqToImpTransformator.ReqContainerToImplContainer)
	 * @generated
	 */
	EOperation getImplGlassIgnoreRule__GenerateModel__RuleEntryContainer_ReqContainerToImplContainer();

	/**
	 * Returns the meta object for the '{@link ReqToImpTransformator.Rules.ImplGlassIgnoreRule#generateModel_solveCsp_BWD(org.moflon.tgg.runtime.IsApplicableMatch, requirements.Container, ReqToImpTransformator.ReqContainerToImplContainer, implementation.Container, org.moflon.tgg.runtime.ModelgeneratorRuleResult) <em>Generate Model solve Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Generate Model solve Csp BWD</em>' operation.
	 * @see ReqToImpTransformator.Rules.ImplGlassIgnoreRule#generateModel_solveCsp_BWD(org.moflon.tgg.runtime.IsApplicableMatch, requirements.Container, ReqToImpTransformator.ReqContainerToImplContainer, implementation.Container, org.moflon.tgg.runtime.ModelgeneratorRuleResult)
	 * @generated
	 */
	EOperation getImplGlassIgnoreRule__GenerateModel_solveCsp_BWD__IsApplicableMatch_Container_ReqContainerToImplContainer_Container_ModelgeneratorRuleResult();

	/**
	 * Returns the meta object for the '{@link ReqToImpTransformator.Rules.ImplGlassIgnoreRule#generateModel_checkCsp_BWD(org.moflon.tgg.language.csp.CSP) <em>Generate Model check Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Generate Model check Csp BWD</em>' operation.
	 * @see ReqToImpTransformator.Rules.ImplGlassIgnoreRule#generateModel_checkCsp_BWD(org.moflon.tgg.language.csp.CSP)
	 * @generated
	 */
	EOperation getImplGlassIgnoreRule__GenerateModel_checkCsp_BWD__CSP();

	/**
	 * Returns the meta object for class '{@link ReqToImpTransformator.Rules.ReqContainerToImplContainerRule <em>Req Container To Impl Container Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Req Container To Impl Container Rule</em>'.
	 * @see ReqToImpTransformator.Rules.ReqContainerToImplContainerRule
	 * @generated
	 */
	EClass getReqContainerToImplContainerRule();

	/**
	 * Returns the meta object for the '{@link ReqToImpTransformator.Rules.ReqContainerToImplContainerRule#isAppropriate_FWD(org.moflon.tgg.runtime.Match, requirements.Container, requirements.NetworkSpan) <em>Is Appropriate FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD</em>' operation.
	 * @see ReqToImpTransformator.Rules.ReqContainerToImplContainerRule#isAppropriate_FWD(org.moflon.tgg.runtime.Match, requirements.Container, requirements.NetworkSpan)
	 * @generated
	 */
	EOperation getReqContainerToImplContainerRule__IsAppropriate_FWD__Match_Container_NetworkSpan();

	/**
	 * Returns the meta object for the '{@link ReqToImpTransformator.Rules.ReqContainerToImplContainerRule#perform_FWD(org.moflon.tgg.runtime.IsApplicableMatch) <em>Perform FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Perform FWD</em>' operation.
	 * @see ReqToImpTransformator.Rules.ReqContainerToImplContainerRule#perform_FWD(org.moflon.tgg.runtime.IsApplicableMatch)
	 * @generated
	 */
	EOperation getReqContainerToImplContainerRule__Perform_FWD__IsApplicableMatch();

	/**
	 * Returns the meta object for the '{@link ReqToImpTransformator.Rules.ReqContainerToImplContainerRule#isApplicable_FWD(org.moflon.tgg.runtime.Match) <em>Is Applicable FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable FWD</em>' operation.
	 * @see ReqToImpTransformator.Rules.ReqContainerToImplContainerRule#isApplicable_FWD(org.moflon.tgg.runtime.Match)
	 * @generated
	 */
	EOperation getReqContainerToImplContainerRule__IsApplicable_FWD__Match();

	/**
	 * Returns the meta object for the '{@link ReqToImpTransformator.Rules.ReqContainerToImplContainerRule#registerObjectsToMatch_FWD(org.moflon.tgg.runtime.Match, requirements.Container, requirements.NetworkSpan) <em>Register Objects To Match FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Register Objects To Match FWD</em>' operation.
	 * @see ReqToImpTransformator.Rules.ReqContainerToImplContainerRule#registerObjectsToMatch_FWD(org.moflon.tgg.runtime.Match, requirements.Container, requirements.NetworkSpan)
	 * @generated
	 */
	EOperation getReqContainerToImplContainerRule__RegisterObjectsToMatch_FWD__Match_Container_NetworkSpan();

	/**
	 * Returns the meta object for the '{@link ReqToImpTransformator.Rules.ReqContainerToImplContainerRule#isAppropriate_solveCsp_FWD(org.moflon.tgg.runtime.Match, requirements.Container, requirements.NetworkSpan) <em>Is Appropriate solve Csp FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate solve Csp FWD</em>' operation.
	 * @see ReqToImpTransformator.Rules.ReqContainerToImplContainerRule#isAppropriate_solveCsp_FWD(org.moflon.tgg.runtime.Match, requirements.Container, requirements.NetworkSpan)
	 * @generated
	 */
	EOperation getReqContainerToImplContainerRule__IsAppropriate_solveCsp_FWD__Match_Container_NetworkSpan();

	/**
	 * Returns the meta object for the '{@link ReqToImpTransformator.Rules.ReqContainerToImplContainerRule#isAppropriate_checkCsp_FWD(org.moflon.tgg.language.csp.CSP) <em>Is Appropriate check Csp FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate check Csp FWD</em>' operation.
	 * @see ReqToImpTransformator.Rules.ReqContainerToImplContainerRule#isAppropriate_checkCsp_FWD(org.moflon.tgg.language.csp.CSP)
	 * @generated
	 */
	EOperation getReqContainerToImplContainerRule__IsAppropriate_checkCsp_FWD__CSP();

	/**
	 * Returns the meta object for the '{@link ReqToImpTransformator.Rules.ReqContainerToImplContainerRule#isApplicable_solveCsp_FWD(org.moflon.tgg.runtime.IsApplicableMatch, requirements.Container, requirements.NetworkSpan) <em>Is Applicable solve Csp FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable solve Csp FWD</em>' operation.
	 * @see ReqToImpTransformator.Rules.ReqContainerToImplContainerRule#isApplicable_solveCsp_FWD(org.moflon.tgg.runtime.IsApplicableMatch, requirements.Container, requirements.NetworkSpan)
	 * @generated
	 */
	EOperation getReqContainerToImplContainerRule__IsApplicable_solveCsp_FWD__IsApplicableMatch_Container_NetworkSpan();

	/**
	 * Returns the meta object for the '{@link ReqToImpTransformator.Rules.ReqContainerToImplContainerRule#isApplicable_checkCsp_FWD(org.moflon.tgg.language.csp.CSP) <em>Is Applicable check Csp FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable check Csp FWD</em>' operation.
	 * @see ReqToImpTransformator.Rules.ReqContainerToImplContainerRule#isApplicable_checkCsp_FWD(org.moflon.tgg.language.csp.CSP)
	 * @generated
	 */
	EOperation getReqContainerToImplContainerRule__IsApplicable_checkCsp_FWD__CSP();

	/**
	 * Returns the meta object for the '{@link ReqToImpTransformator.Rules.ReqContainerToImplContainerRule#registerObjects_FWD(org.moflon.tgg.runtime.PerformRuleResult, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject) <em>Register Objects FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Register Objects FWD</em>' operation.
	 * @see ReqToImpTransformator.Rules.ReqContainerToImplContainerRule#registerObjects_FWD(org.moflon.tgg.runtime.PerformRuleResult, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	EOperation getReqContainerToImplContainerRule__RegisterObjects_FWD__PerformRuleResult_EObject_EObject_EObject_EObject();

	/**
	 * Returns the meta object for the '{@link ReqToImpTransformator.Rules.ReqContainerToImplContainerRule#checkTypes_FWD(org.moflon.tgg.runtime.Match) <em>Check Types FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check Types FWD</em>' operation.
	 * @see ReqToImpTransformator.Rules.ReqContainerToImplContainerRule#checkTypes_FWD(org.moflon.tgg.runtime.Match)
	 * @generated
	 */
	EOperation getReqContainerToImplContainerRule__CheckTypes_FWD__Match();

	/**
	 * Returns the meta object for the '{@link ReqToImpTransformator.Rules.ReqContainerToImplContainerRule#isAppropriate_BWD(org.moflon.tgg.runtime.Match, implementation.Container) <em>Is Appropriate BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD</em>' operation.
	 * @see ReqToImpTransformator.Rules.ReqContainerToImplContainerRule#isAppropriate_BWD(org.moflon.tgg.runtime.Match, implementation.Container)
	 * @generated
	 */
	EOperation getReqContainerToImplContainerRule__IsAppropriate_BWD__Match_Container();

	/**
	 * Returns the meta object for the '{@link ReqToImpTransformator.Rules.ReqContainerToImplContainerRule#perform_BWD(org.moflon.tgg.runtime.IsApplicableMatch) <em>Perform BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Perform BWD</em>' operation.
	 * @see ReqToImpTransformator.Rules.ReqContainerToImplContainerRule#perform_BWD(org.moflon.tgg.runtime.IsApplicableMatch)
	 * @generated
	 */
	EOperation getReqContainerToImplContainerRule__Perform_BWD__IsApplicableMatch();

	/**
	 * Returns the meta object for the '{@link ReqToImpTransformator.Rules.ReqContainerToImplContainerRule#isApplicable_BWD(org.moflon.tgg.runtime.Match) <em>Is Applicable BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable BWD</em>' operation.
	 * @see ReqToImpTransformator.Rules.ReqContainerToImplContainerRule#isApplicable_BWD(org.moflon.tgg.runtime.Match)
	 * @generated
	 */
	EOperation getReqContainerToImplContainerRule__IsApplicable_BWD__Match();

	/**
	 * Returns the meta object for the '{@link ReqToImpTransformator.Rules.ReqContainerToImplContainerRule#registerObjectsToMatch_BWD(org.moflon.tgg.runtime.Match, implementation.Container) <em>Register Objects To Match BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Register Objects To Match BWD</em>' operation.
	 * @see ReqToImpTransformator.Rules.ReqContainerToImplContainerRule#registerObjectsToMatch_BWD(org.moflon.tgg.runtime.Match, implementation.Container)
	 * @generated
	 */
	EOperation getReqContainerToImplContainerRule__RegisterObjectsToMatch_BWD__Match_Container();

	/**
	 * Returns the meta object for the '{@link ReqToImpTransformator.Rules.ReqContainerToImplContainerRule#isAppropriate_solveCsp_BWD(org.moflon.tgg.runtime.Match, implementation.Container) <em>Is Appropriate solve Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate solve Csp BWD</em>' operation.
	 * @see ReqToImpTransformator.Rules.ReqContainerToImplContainerRule#isAppropriate_solveCsp_BWD(org.moflon.tgg.runtime.Match, implementation.Container)
	 * @generated
	 */
	EOperation getReqContainerToImplContainerRule__IsAppropriate_solveCsp_BWD__Match_Container();

	/**
	 * Returns the meta object for the '{@link ReqToImpTransformator.Rules.ReqContainerToImplContainerRule#isAppropriate_checkCsp_BWD(org.moflon.tgg.language.csp.CSP) <em>Is Appropriate check Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate check Csp BWD</em>' operation.
	 * @see ReqToImpTransformator.Rules.ReqContainerToImplContainerRule#isAppropriate_checkCsp_BWD(org.moflon.tgg.language.csp.CSP)
	 * @generated
	 */
	EOperation getReqContainerToImplContainerRule__IsAppropriate_checkCsp_BWD__CSP();

	/**
	 * Returns the meta object for the '{@link ReqToImpTransformator.Rules.ReqContainerToImplContainerRule#isApplicable_solveCsp_BWD(org.moflon.tgg.runtime.IsApplicableMatch, implementation.Container) <em>Is Applicable solve Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable solve Csp BWD</em>' operation.
	 * @see ReqToImpTransformator.Rules.ReqContainerToImplContainerRule#isApplicable_solveCsp_BWD(org.moflon.tgg.runtime.IsApplicableMatch, implementation.Container)
	 * @generated
	 */
	EOperation getReqContainerToImplContainerRule__IsApplicable_solveCsp_BWD__IsApplicableMatch_Container();

	/**
	 * Returns the meta object for the '{@link ReqToImpTransformator.Rules.ReqContainerToImplContainerRule#isApplicable_checkCsp_BWD(org.moflon.tgg.language.csp.CSP) <em>Is Applicable check Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable check Csp BWD</em>' operation.
	 * @see ReqToImpTransformator.Rules.ReqContainerToImplContainerRule#isApplicable_checkCsp_BWD(org.moflon.tgg.language.csp.CSP)
	 * @generated
	 */
	EOperation getReqContainerToImplContainerRule__IsApplicable_checkCsp_BWD__CSP();

	/**
	 * Returns the meta object for the '{@link ReqToImpTransformator.Rules.ReqContainerToImplContainerRule#registerObjects_BWD(org.moflon.tgg.runtime.PerformRuleResult, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject) <em>Register Objects BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Register Objects BWD</em>' operation.
	 * @see ReqToImpTransformator.Rules.ReqContainerToImplContainerRule#registerObjects_BWD(org.moflon.tgg.runtime.PerformRuleResult, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	EOperation getReqContainerToImplContainerRule__RegisterObjects_BWD__PerformRuleResult_EObject_EObject_EObject_EObject();

	/**
	 * Returns the meta object for the '{@link ReqToImpTransformator.Rules.ReqContainerToImplContainerRule#checkTypes_BWD(org.moflon.tgg.runtime.Match) <em>Check Types BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check Types BWD</em>' operation.
	 * @see ReqToImpTransformator.Rules.ReqContainerToImplContainerRule#checkTypes_BWD(org.moflon.tgg.runtime.Match)
	 * @generated
	 */
	EOperation getReqContainerToImplContainerRule__CheckTypes_BWD__Match();

	/**
	 * Returns the meta object for the '{@link ReqToImpTransformator.Rules.ReqContainerToImplContainerRule#isAppropriate_BWD_Container_4(implementation.Container) <em>Is Appropriate BWD Container 4</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD Container 4</em>' operation.
	 * @see ReqToImpTransformator.Rules.ReqContainerToImplContainerRule#isAppropriate_BWD_Container_4(implementation.Container)
	 * @generated
	 */
	EOperation getReqContainerToImplContainerRule__IsAppropriate_BWD_Container_4__Container();

	/**
	 * Returns the meta object for the '{@link ReqToImpTransformator.Rules.ReqContainerToImplContainerRule#isAppropriate_FWD_EMoflonEdge_29(org.moflon.tgg.runtime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 29</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 29</em>' operation.
	 * @see ReqToImpTransformator.Rules.ReqContainerToImplContainerRule#isAppropriate_FWD_EMoflonEdge_29(org.moflon.tgg.runtime.EMoflonEdge)
	 * @generated
	 */
	EOperation getReqContainerToImplContainerRule__IsAppropriate_FWD_EMoflonEdge_29__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link ReqToImpTransformator.Rules.ReqContainerToImplContainerRule#checkAttributes_FWD(org.moflon.tgg.runtime.TripleMatch) <em>Check Attributes FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check Attributes FWD</em>' operation.
	 * @see ReqToImpTransformator.Rules.ReqContainerToImplContainerRule#checkAttributes_FWD(org.moflon.tgg.runtime.TripleMatch)
	 * @generated
	 */
	EOperation getReqContainerToImplContainerRule__CheckAttributes_FWD__TripleMatch();

	/**
	 * Returns the meta object for the '{@link ReqToImpTransformator.Rules.ReqContainerToImplContainerRule#checkAttributes_BWD(org.moflon.tgg.runtime.TripleMatch) <em>Check Attributes BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check Attributes BWD</em>' operation.
	 * @see ReqToImpTransformator.Rules.ReqContainerToImplContainerRule#checkAttributes_BWD(org.moflon.tgg.runtime.TripleMatch)
	 * @generated
	 */
	EOperation getReqContainerToImplContainerRule__CheckAttributes_BWD__TripleMatch();

	/**
	 * Returns the meta object for the '{@link ReqToImpTransformator.Rules.ReqContainerToImplContainerRule#isApplicable_CC(org.moflon.tgg.runtime.Match, org.moflon.tgg.runtime.Match) <em>Is Applicable CC</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable CC</em>' operation.
	 * @see ReqToImpTransformator.Rules.ReqContainerToImplContainerRule#isApplicable_CC(org.moflon.tgg.runtime.Match, org.moflon.tgg.runtime.Match)
	 * @generated
	 */
	EOperation getReqContainerToImplContainerRule__IsApplicable_CC__Match_Match();

	/**
	 * Returns the meta object for the '{@link ReqToImpTransformator.Rules.ReqContainerToImplContainerRule#isApplicable_solveCsp_CC(requirements.Container, requirements.NetworkSpan, implementation.Container, org.moflon.tgg.runtime.Match, org.moflon.tgg.runtime.Match) <em>Is Applicable solve Csp CC</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable solve Csp CC</em>' operation.
	 * @see ReqToImpTransformator.Rules.ReqContainerToImplContainerRule#isApplicable_solveCsp_CC(requirements.Container, requirements.NetworkSpan, implementation.Container, org.moflon.tgg.runtime.Match, org.moflon.tgg.runtime.Match)
	 * @generated
	 */
	EOperation getReqContainerToImplContainerRule__IsApplicable_solveCsp_CC__Container_NetworkSpan_Container_Match_Match();

	/**
	 * Returns the meta object for the '{@link ReqToImpTransformator.Rules.ReqContainerToImplContainerRule#isApplicable_checkCsp_CC(org.moflon.tgg.language.csp.CSP) <em>Is Applicable check Csp CC</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable check Csp CC</em>' operation.
	 * @see ReqToImpTransformator.Rules.ReqContainerToImplContainerRule#isApplicable_checkCsp_CC(org.moflon.tgg.language.csp.CSP)
	 * @generated
	 */
	EOperation getReqContainerToImplContainerRule__IsApplicable_checkCsp_CC__CSP();

	/**
	 * Returns the meta object for the '{@link ReqToImpTransformator.Rules.ReqContainerToImplContainerRule#checkDEC_FWD(requirements.Container, requirements.NetworkSpan) <em>Check DEC FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check DEC FWD</em>' operation.
	 * @see ReqToImpTransformator.Rules.ReqContainerToImplContainerRule#checkDEC_FWD(requirements.Container, requirements.NetworkSpan)
	 * @generated
	 */
	EOperation getReqContainerToImplContainerRule__CheckDEC_FWD__Container_NetworkSpan();

	/**
	 * Returns the meta object for the '{@link ReqToImpTransformator.Rules.ReqContainerToImplContainerRule#checkDEC_BWD(implementation.Container) <em>Check DEC BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check DEC BWD</em>' operation.
	 * @see ReqToImpTransformator.Rules.ReqContainerToImplContainerRule#checkDEC_BWD(implementation.Container)
	 * @generated
	 */
	EOperation getReqContainerToImplContainerRule__CheckDEC_BWD__Container();

	/**
	 * Returns the meta object for the '{@link ReqToImpTransformator.Rules.ReqContainerToImplContainerRule#generateModel(org.moflon.tgg.language.modelgenerator.RuleEntryContainer) <em>Generate Model</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Generate Model</em>' operation.
	 * @see ReqToImpTransformator.Rules.ReqContainerToImplContainerRule#generateModel(org.moflon.tgg.language.modelgenerator.RuleEntryContainer)
	 * @generated
	 */
	EOperation getReqContainerToImplContainerRule__GenerateModel__RuleEntryContainer();

	/**
	 * Returns the meta object for the '{@link ReqToImpTransformator.Rules.ReqContainerToImplContainerRule#generateModel_solveCsp_BWD(org.moflon.tgg.runtime.IsApplicableMatch, org.moflon.tgg.runtime.ModelgeneratorRuleResult) <em>Generate Model solve Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Generate Model solve Csp BWD</em>' operation.
	 * @see ReqToImpTransformator.Rules.ReqContainerToImplContainerRule#generateModel_solveCsp_BWD(org.moflon.tgg.runtime.IsApplicableMatch, org.moflon.tgg.runtime.ModelgeneratorRuleResult)
	 * @generated
	 */
	EOperation getReqContainerToImplContainerRule__GenerateModel_solveCsp_BWD__IsApplicableMatch_ModelgeneratorRuleResult();

	/**
	 * Returns the meta object for the '{@link ReqToImpTransformator.Rules.ReqContainerToImplContainerRule#generateModel_checkCsp_BWD(org.moflon.tgg.language.csp.CSP) <em>Generate Model check Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Generate Model check Csp BWD</em>' operation.
	 * @see ReqToImpTransformator.Rules.ReqContainerToImplContainerRule#generateModel_checkCsp_BWD(org.moflon.tgg.language.csp.CSP)
	 * @generated
	 */
	EOperation getReqContainerToImplContainerRule__GenerateModel_checkCsp_BWD__CSP();

	/**
	 * Returns the meta object for class '{@link ReqToImpTransformator.Rules.ImplCopperIgnoreRule <em>Impl Copper Ignore Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Impl Copper Ignore Rule</em>'.
	 * @see ReqToImpTransformator.Rules.ImplCopperIgnoreRule
	 * @generated
	 */
	EClass getImplCopperIgnoreRule();

	/**
	 * Returns the meta object for the '{@link ReqToImpTransformator.Rules.ImplCopperIgnoreRule#isAppropriate_FWD(org.moflon.tgg.runtime.Match, requirements.Container) <em>Is Appropriate FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD</em>' operation.
	 * @see ReqToImpTransformator.Rules.ImplCopperIgnoreRule#isAppropriate_FWD(org.moflon.tgg.runtime.Match, requirements.Container)
	 * @generated
	 */
	EOperation getImplCopperIgnoreRule__IsAppropriate_FWD__Match_Container();

	/**
	 * Returns the meta object for the '{@link ReqToImpTransformator.Rules.ImplCopperIgnoreRule#perform_FWD(org.moflon.tgg.runtime.IsApplicableMatch) <em>Perform FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Perform FWD</em>' operation.
	 * @see ReqToImpTransformator.Rules.ImplCopperIgnoreRule#perform_FWD(org.moflon.tgg.runtime.IsApplicableMatch)
	 * @generated
	 */
	EOperation getImplCopperIgnoreRule__Perform_FWD__IsApplicableMatch();

	/**
	 * Returns the meta object for the '{@link ReqToImpTransformator.Rules.ImplCopperIgnoreRule#isApplicable_FWD(org.moflon.tgg.runtime.Match) <em>Is Applicable FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable FWD</em>' operation.
	 * @see ReqToImpTransformator.Rules.ImplCopperIgnoreRule#isApplicable_FWD(org.moflon.tgg.runtime.Match)
	 * @generated
	 */
	EOperation getImplCopperIgnoreRule__IsApplicable_FWD__Match();

	/**
	 * Returns the meta object for the '{@link ReqToImpTransformator.Rules.ImplCopperIgnoreRule#registerObjectsToMatch_FWD(org.moflon.tgg.runtime.Match, requirements.Container) <em>Register Objects To Match FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Register Objects To Match FWD</em>' operation.
	 * @see ReqToImpTransformator.Rules.ImplCopperIgnoreRule#registerObjectsToMatch_FWD(org.moflon.tgg.runtime.Match, requirements.Container)
	 * @generated
	 */
	EOperation getImplCopperIgnoreRule__RegisterObjectsToMatch_FWD__Match_Container();

	/**
	 * Returns the meta object for the '{@link ReqToImpTransformator.Rules.ImplCopperIgnoreRule#isAppropriate_solveCsp_FWD(org.moflon.tgg.runtime.Match, requirements.Container) <em>Is Appropriate solve Csp FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate solve Csp FWD</em>' operation.
	 * @see ReqToImpTransformator.Rules.ImplCopperIgnoreRule#isAppropriate_solveCsp_FWD(org.moflon.tgg.runtime.Match, requirements.Container)
	 * @generated
	 */
	EOperation getImplCopperIgnoreRule__IsAppropriate_solveCsp_FWD__Match_Container();

	/**
	 * Returns the meta object for the '{@link ReqToImpTransformator.Rules.ImplCopperIgnoreRule#isAppropriate_checkCsp_FWD(org.moflon.tgg.language.csp.CSP) <em>Is Appropriate check Csp FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate check Csp FWD</em>' operation.
	 * @see ReqToImpTransformator.Rules.ImplCopperIgnoreRule#isAppropriate_checkCsp_FWD(org.moflon.tgg.language.csp.CSP)
	 * @generated
	 */
	EOperation getImplCopperIgnoreRule__IsAppropriate_checkCsp_FWD__CSP();

	/**
	 * Returns the meta object for the '{@link ReqToImpTransformator.Rules.ImplCopperIgnoreRule#checkTypes_FWD(org.moflon.tgg.runtime.Match) <em>Check Types FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check Types FWD</em>' operation.
	 * @see ReqToImpTransformator.Rules.ImplCopperIgnoreRule#checkTypes_FWD(org.moflon.tgg.runtime.Match)
	 * @generated
	 */
	EOperation getImplCopperIgnoreRule__CheckTypes_FWD__Match();

	/**
	 * Returns the meta object for the '{@link ReqToImpTransformator.Rules.ImplCopperIgnoreRule#isAppropriate_BWD(org.moflon.tgg.runtime.Match, implementation.CopperCable, implementation.Container) <em>Is Appropriate BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD</em>' operation.
	 * @see ReqToImpTransformator.Rules.ImplCopperIgnoreRule#isAppropriate_BWD(org.moflon.tgg.runtime.Match, implementation.CopperCable, implementation.Container)
	 * @generated
	 */
	EOperation getImplCopperIgnoreRule__IsAppropriate_BWD__Match_CopperCable_Container();

	/**
	 * Returns the meta object for the '{@link ReqToImpTransformator.Rules.ImplCopperIgnoreRule#perform_BWD(org.moflon.tgg.runtime.IsApplicableMatch) <em>Perform BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Perform BWD</em>' operation.
	 * @see ReqToImpTransformator.Rules.ImplCopperIgnoreRule#perform_BWD(org.moflon.tgg.runtime.IsApplicableMatch)
	 * @generated
	 */
	EOperation getImplCopperIgnoreRule__Perform_BWD__IsApplicableMatch();

	/**
	 * Returns the meta object for the '{@link ReqToImpTransformator.Rules.ImplCopperIgnoreRule#isApplicable_BWD(org.moflon.tgg.runtime.Match) <em>Is Applicable BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable BWD</em>' operation.
	 * @see ReqToImpTransformator.Rules.ImplCopperIgnoreRule#isApplicable_BWD(org.moflon.tgg.runtime.Match)
	 * @generated
	 */
	EOperation getImplCopperIgnoreRule__IsApplicable_BWD__Match();

	/**
	 * Returns the meta object for the '{@link ReqToImpTransformator.Rules.ImplCopperIgnoreRule#registerObjectsToMatch_BWD(org.moflon.tgg.runtime.Match, implementation.CopperCable, implementation.Container) <em>Register Objects To Match BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Register Objects To Match BWD</em>' operation.
	 * @see ReqToImpTransformator.Rules.ImplCopperIgnoreRule#registerObjectsToMatch_BWD(org.moflon.tgg.runtime.Match, implementation.CopperCable, implementation.Container)
	 * @generated
	 */
	EOperation getImplCopperIgnoreRule__RegisterObjectsToMatch_BWD__Match_CopperCable_Container();

	/**
	 * Returns the meta object for the '{@link ReqToImpTransformator.Rules.ImplCopperIgnoreRule#isAppropriate_solveCsp_BWD(org.moflon.tgg.runtime.Match, implementation.CopperCable, implementation.Container) <em>Is Appropriate solve Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate solve Csp BWD</em>' operation.
	 * @see ReqToImpTransformator.Rules.ImplCopperIgnoreRule#isAppropriate_solveCsp_BWD(org.moflon.tgg.runtime.Match, implementation.CopperCable, implementation.Container)
	 * @generated
	 */
	EOperation getImplCopperIgnoreRule__IsAppropriate_solveCsp_BWD__Match_CopperCable_Container();

	/**
	 * Returns the meta object for the '{@link ReqToImpTransformator.Rules.ImplCopperIgnoreRule#isAppropriate_checkCsp_BWD(org.moflon.tgg.language.csp.CSP) <em>Is Appropriate check Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate check Csp BWD</em>' operation.
	 * @see ReqToImpTransformator.Rules.ImplCopperIgnoreRule#isAppropriate_checkCsp_BWD(org.moflon.tgg.language.csp.CSP)
	 * @generated
	 */
	EOperation getImplCopperIgnoreRule__IsAppropriate_checkCsp_BWD__CSP();

	/**
	 * Returns the meta object for the '{@link ReqToImpTransformator.Rules.ImplCopperIgnoreRule#isApplicable_solveCsp_BWD(org.moflon.tgg.runtime.IsApplicableMatch, requirements.Container, implementation.CopperCable, ReqToImpTransformator.ReqContainerToImplContainer, implementation.Container) <em>Is Applicable solve Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable solve Csp BWD</em>' operation.
	 * @see ReqToImpTransformator.Rules.ImplCopperIgnoreRule#isApplicable_solveCsp_BWD(org.moflon.tgg.runtime.IsApplicableMatch, requirements.Container, implementation.CopperCable, ReqToImpTransformator.ReqContainerToImplContainer, implementation.Container)
	 * @generated
	 */
	EOperation getImplCopperIgnoreRule__IsApplicable_solveCsp_BWD__IsApplicableMatch_Container_CopperCable_ReqContainerToImplContainer_Container();

	/**
	 * Returns the meta object for the '{@link ReqToImpTransformator.Rules.ImplCopperIgnoreRule#isApplicable_checkCsp_BWD(org.moflon.tgg.language.csp.CSP) <em>Is Applicable check Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable check Csp BWD</em>' operation.
	 * @see ReqToImpTransformator.Rules.ImplCopperIgnoreRule#isApplicable_checkCsp_BWD(org.moflon.tgg.language.csp.CSP)
	 * @generated
	 */
	EOperation getImplCopperIgnoreRule__IsApplicable_checkCsp_BWD__CSP();

	/**
	 * Returns the meta object for the '{@link ReqToImpTransformator.Rules.ImplCopperIgnoreRule#registerObjects_BWD(org.moflon.tgg.runtime.PerformRuleResult, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject) <em>Register Objects BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Register Objects BWD</em>' operation.
	 * @see ReqToImpTransformator.Rules.ImplCopperIgnoreRule#registerObjects_BWD(org.moflon.tgg.runtime.PerformRuleResult, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	EOperation getImplCopperIgnoreRule__RegisterObjects_BWD__PerformRuleResult_EObject_EObject_EObject_EObject();

	/**
	 * Returns the meta object for the '{@link ReqToImpTransformator.Rules.ImplCopperIgnoreRule#checkTypes_BWD(org.moflon.tgg.runtime.Match) <em>Check Types BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check Types BWD</em>' operation.
	 * @see ReqToImpTransformator.Rules.ImplCopperIgnoreRule#checkTypes_BWD(org.moflon.tgg.runtime.Match)
	 * @generated
	 */
	EOperation getImplCopperIgnoreRule__CheckTypes_BWD__Match();

	/**
	 * Returns the meta object for the '{@link ReqToImpTransformator.Rules.ImplCopperIgnoreRule#isAppropriate_FWD_Container_13(requirements.Container) <em>Is Appropriate FWD Container 13</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD Container 13</em>' operation.
	 * @see ReqToImpTransformator.Rules.ImplCopperIgnoreRule#isAppropriate_FWD_Container_13(requirements.Container)
	 * @generated
	 */
	EOperation getImplCopperIgnoreRule__IsAppropriate_FWD_Container_13__Container();

	/**
	 * Returns the meta object for the '{@link ReqToImpTransformator.Rules.ImplCopperIgnoreRule#isAppropriate_BWD_EMoflonEdge_39(org.moflon.tgg.runtime.EMoflonEdge) <em>Is Appropriate BWD EMoflon Edge 39</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD EMoflon Edge 39</em>' operation.
	 * @see ReqToImpTransformator.Rules.ImplCopperIgnoreRule#isAppropriate_BWD_EMoflonEdge_39(org.moflon.tgg.runtime.EMoflonEdge)
	 * @generated
	 */
	EOperation getImplCopperIgnoreRule__IsAppropriate_BWD_EMoflonEdge_39__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link ReqToImpTransformator.Rules.ImplCopperIgnoreRule#checkAttributes_FWD(org.moflon.tgg.runtime.TripleMatch) <em>Check Attributes FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check Attributes FWD</em>' operation.
	 * @see ReqToImpTransformator.Rules.ImplCopperIgnoreRule#checkAttributes_FWD(org.moflon.tgg.runtime.TripleMatch)
	 * @generated
	 */
	EOperation getImplCopperIgnoreRule__CheckAttributes_FWD__TripleMatch();

	/**
	 * Returns the meta object for the '{@link ReqToImpTransformator.Rules.ImplCopperIgnoreRule#checkAttributes_BWD(org.moflon.tgg.runtime.TripleMatch) <em>Check Attributes BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check Attributes BWD</em>' operation.
	 * @see ReqToImpTransformator.Rules.ImplCopperIgnoreRule#checkAttributes_BWD(org.moflon.tgg.runtime.TripleMatch)
	 * @generated
	 */
	EOperation getImplCopperIgnoreRule__CheckAttributes_BWD__TripleMatch();

	/**
	 * Returns the meta object for the '{@link ReqToImpTransformator.Rules.ImplCopperIgnoreRule#isApplicable_CC(org.moflon.tgg.runtime.Match, org.moflon.tgg.runtime.Match) <em>Is Applicable CC</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable CC</em>' operation.
	 * @see ReqToImpTransformator.Rules.ImplCopperIgnoreRule#isApplicable_CC(org.moflon.tgg.runtime.Match, org.moflon.tgg.runtime.Match)
	 * @generated
	 */
	EOperation getImplCopperIgnoreRule__IsApplicable_CC__Match_Match();

	/**
	 * Returns the meta object for the '{@link ReqToImpTransformator.Rules.ImplCopperIgnoreRule#isApplicable_solveCsp_CC(requirements.Container, implementation.CopperCable, implementation.Container, org.moflon.tgg.runtime.Match, org.moflon.tgg.runtime.Match) <em>Is Applicable solve Csp CC</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable solve Csp CC</em>' operation.
	 * @see ReqToImpTransformator.Rules.ImplCopperIgnoreRule#isApplicable_solveCsp_CC(requirements.Container, implementation.CopperCable, implementation.Container, org.moflon.tgg.runtime.Match, org.moflon.tgg.runtime.Match)
	 * @generated
	 */
	EOperation getImplCopperIgnoreRule__IsApplicable_solveCsp_CC__Container_CopperCable_Container_Match_Match();

	/**
	 * Returns the meta object for the '{@link ReqToImpTransformator.Rules.ImplCopperIgnoreRule#isApplicable_checkCsp_CC(org.moflon.tgg.language.csp.CSP) <em>Is Applicable check Csp CC</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable check Csp CC</em>' operation.
	 * @see ReqToImpTransformator.Rules.ImplCopperIgnoreRule#isApplicable_checkCsp_CC(org.moflon.tgg.language.csp.CSP)
	 * @generated
	 */
	EOperation getImplCopperIgnoreRule__IsApplicable_checkCsp_CC__CSP();

	/**
	 * Returns the meta object for the '{@link ReqToImpTransformator.Rules.ImplCopperIgnoreRule#checkDEC_FWD(requirements.Container) <em>Check DEC FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check DEC FWD</em>' operation.
	 * @see ReqToImpTransformator.Rules.ImplCopperIgnoreRule#checkDEC_FWD(requirements.Container)
	 * @generated
	 */
	EOperation getImplCopperIgnoreRule__CheckDEC_FWD__Container();

	/**
	 * Returns the meta object for the '{@link ReqToImpTransformator.Rules.ImplCopperIgnoreRule#checkDEC_BWD(implementation.CopperCable, implementation.Container) <em>Check DEC BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check DEC BWD</em>' operation.
	 * @see ReqToImpTransformator.Rules.ImplCopperIgnoreRule#checkDEC_BWD(implementation.CopperCable, implementation.Container)
	 * @generated
	 */
	EOperation getImplCopperIgnoreRule__CheckDEC_BWD__CopperCable_Container();

	/**
	 * Returns the meta object for the '{@link ReqToImpTransformator.Rules.ImplCopperIgnoreRule#generateModel(org.moflon.tgg.language.modelgenerator.RuleEntryContainer, ReqToImpTransformator.ReqContainerToImplContainer) <em>Generate Model</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Generate Model</em>' operation.
	 * @see ReqToImpTransformator.Rules.ImplCopperIgnoreRule#generateModel(org.moflon.tgg.language.modelgenerator.RuleEntryContainer, ReqToImpTransformator.ReqContainerToImplContainer)
	 * @generated
	 */
	EOperation getImplCopperIgnoreRule__GenerateModel__RuleEntryContainer_ReqContainerToImplContainer();

	/**
	 * Returns the meta object for the '{@link ReqToImpTransformator.Rules.ImplCopperIgnoreRule#generateModel_solveCsp_BWD(org.moflon.tgg.runtime.IsApplicableMatch, requirements.Container, ReqToImpTransformator.ReqContainerToImplContainer, implementation.Container, org.moflon.tgg.runtime.ModelgeneratorRuleResult) <em>Generate Model solve Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Generate Model solve Csp BWD</em>' operation.
	 * @see ReqToImpTransformator.Rules.ImplCopperIgnoreRule#generateModel_solveCsp_BWD(org.moflon.tgg.runtime.IsApplicableMatch, requirements.Container, ReqToImpTransformator.ReqContainerToImplContainer, implementation.Container, org.moflon.tgg.runtime.ModelgeneratorRuleResult)
	 * @generated
	 */
	EOperation getImplCopperIgnoreRule__GenerateModel_solveCsp_BWD__IsApplicableMatch_Container_ReqContainerToImplContainer_Container_ModelgeneratorRuleResult();

	/**
	 * Returns the meta object for the '{@link ReqToImpTransformator.Rules.ImplCopperIgnoreRule#generateModel_checkCsp_BWD(org.moflon.tgg.language.csp.CSP) <em>Generate Model check Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Generate Model check Csp BWD</em>' operation.
	 * @see ReqToImpTransformator.Rules.ImplCopperIgnoreRule#generateModel_checkCsp_BWD(org.moflon.tgg.language.csp.CSP)
	 * @generated
	 */
	EOperation getImplCopperIgnoreRule__GenerateModel_checkCsp_BWD__CSP();

	/**
	 * Returns the meta object for class '{@link ReqToImpTransformator.Rules.ReqConsumerToComputerRule <em>Req Consumer To Computer Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Req Consumer To Computer Rule</em>'.
	 * @see ReqToImpTransformator.Rules.ReqConsumerToComputerRule
	 * @generated
	 */
	EClass getReqConsumerToComputerRule();

	/**
	 * Returns the meta object for the '{@link ReqToImpTransformator.Rules.ReqConsumerToComputerRule#isAppropriate_FWD(org.moflon.tgg.runtime.Match, requirements.Consumer, requirements.Container, requirements.NetworkSpan) <em>Is Appropriate FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD</em>' operation.
	 * @see ReqToImpTransformator.Rules.ReqConsumerToComputerRule#isAppropriate_FWD(org.moflon.tgg.runtime.Match, requirements.Consumer, requirements.Container, requirements.NetworkSpan)
	 * @generated
	 */
	EOperation getReqConsumerToComputerRule__IsAppropriate_FWD__Match_Consumer_Container_NetworkSpan();

	/**
	 * Returns the meta object for the '{@link ReqToImpTransformator.Rules.ReqConsumerToComputerRule#perform_FWD(org.moflon.tgg.runtime.IsApplicableMatch) <em>Perform FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Perform FWD</em>' operation.
	 * @see ReqToImpTransformator.Rules.ReqConsumerToComputerRule#perform_FWD(org.moflon.tgg.runtime.IsApplicableMatch)
	 * @generated
	 */
	EOperation getReqConsumerToComputerRule__Perform_FWD__IsApplicableMatch();

	/**
	 * Returns the meta object for the '{@link ReqToImpTransformator.Rules.ReqConsumerToComputerRule#isApplicable_FWD(org.moflon.tgg.runtime.Match) <em>Is Applicable FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable FWD</em>' operation.
	 * @see ReqToImpTransformator.Rules.ReqConsumerToComputerRule#isApplicable_FWD(org.moflon.tgg.runtime.Match)
	 * @generated
	 */
	EOperation getReqConsumerToComputerRule__IsApplicable_FWD__Match();

	/**
	 * Returns the meta object for the '{@link ReqToImpTransformator.Rules.ReqConsumerToComputerRule#registerObjectsToMatch_FWD(org.moflon.tgg.runtime.Match, requirements.Consumer, requirements.Container, requirements.NetworkSpan) <em>Register Objects To Match FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Register Objects To Match FWD</em>' operation.
	 * @see ReqToImpTransformator.Rules.ReqConsumerToComputerRule#registerObjectsToMatch_FWD(org.moflon.tgg.runtime.Match, requirements.Consumer, requirements.Container, requirements.NetworkSpan)
	 * @generated
	 */
	EOperation getReqConsumerToComputerRule__RegisterObjectsToMatch_FWD__Match_Consumer_Container_NetworkSpan();

	/**
	 * Returns the meta object for the '{@link ReqToImpTransformator.Rules.ReqConsumerToComputerRule#isAppropriate_solveCsp_FWD(org.moflon.tgg.runtime.Match, requirements.Consumer, requirements.Container, requirements.NetworkSpan) <em>Is Appropriate solve Csp FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate solve Csp FWD</em>' operation.
	 * @see ReqToImpTransformator.Rules.ReqConsumerToComputerRule#isAppropriate_solveCsp_FWD(org.moflon.tgg.runtime.Match, requirements.Consumer, requirements.Container, requirements.NetworkSpan)
	 * @generated
	 */
	EOperation getReqConsumerToComputerRule__IsAppropriate_solveCsp_FWD__Match_Consumer_Container_NetworkSpan();

	/**
	 * Returns the meta object for the '{@link ReqToImpTransformator.Rules.ReqConsumerToComputerRule#isAppropriate_checkCsp_FWD(org.moflon.tgg.language.csp.CSP) <em>Is Appropriate check Csp FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate check Csp FWD</em>' operation.
	 * @see ReqToImpTransformator.Rules.ReqConsumerToComputerRule#isAppropriate_checkCsp_FWD(org.moflon.tgg.language.csp.CSP)
	 * @generated
	 */
	EOperation getReqConsumerToComputerRule__IsAppropriate_checkCsp_FWD__CSP();

	/**
	 * Returns the meta object for the '{@link ReqToImpTransformator.Rules.ReqConsumerToComputerRule#isApplicable_solveCsp_FWD(org.moflon.tgg.runtime.IsApplicableMatch, implementation.Computer, requirements.Consumer, requirements.Container, ReqToImpTransformator.VirtualNodeToComputer, requirements.NetworkSpan, implementation.Cable, implementation.Container, ReqToImpTransformator.ReqContainerToImplContainer) <em>Is Applicable solve Csp FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable solve Csp FWD</em>' operation.
	 * @see ReqToImpTransformator.Rules.ReqConsumerToComputerRule#isApplicable_solveCsp_FWD(org.moflon.tgg.runtime.IsApplicableMatch, implementation.Computer, requirements.Consumer, requirements.Container, ReqToImpTransformator.VirtualNodeToComputer, requirements.NetworkSpan, implementation.Cable, implementation.Container, ReqToImpTransformator.ReqContainerToImplContainer)
	 * @generated
	 */
	EOperation getReqConsumerToComputerRule__IsApplicable_solveCsp_FWD__IsApplicableMatch_Computer_Consumer_Container_VirtualNodeToComputer_NetworkSpan_Cable_Container_ReqContainerToImplContainer();

	/**
	 * Returns the meta object for the '{@link ReqToImpTransformator.Rules.ReqConsumerToComputerRule#isApplicable_checkCsp_FWD(org.moflon.tgg.language.csp.CSP) <em>Is Applicable check Csp FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable check Csp FWD</em>' operation.
	 * @see ReqToImpTransformator.Rules.ReqConsumerToComputerRule#isApplicable_checkCsp_FWD(org.moflon.tgg.language.csp.CSP)
	 * @generated
	 */
	EOperation getReqConsumerToComputerRule__IsApplicable_checkCsp_FWD__CSP();

	/**
	 * Returns the meta object for the '{@link ReqToImpTransformator.Rules.ReqConsumerToComputerRule#registerObjects_FWD(org.moflon.tgg.runtime.PerformRuleResult, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject) <em>Register Objects FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Register Objects FWD</em>' operation.
	 * @see ReqToImpTransformator.Rules.ReqConsumerToComputerRule#registerObjects_FWD(org.moflon.tgg.runtime.PerformRuleResult, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	EOperation getReqConsumerToComputerRule__RegisterObjects_FWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject();

	/**
	 * Returns the meta object for the '{@link ReqToImpTransformator.Rules.ReqConsumerToComputerRule#checkTypes_FWD(org.moflon.tgg.runtime.Match) <em>Check Types FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check Types FWD</em>' operation.
	 * @see ReqToImpTransformator.Rules.ReqConsumerToComputerRule#checkTypes_FWD(org.moflon.tgg.runtime.Match)
	 * @generated
	 */
	EOperation getReqConsumerToComputerRule__CheckTypes_FWD__Match();

	/**
	 * Returns the meta object for the '{@link ReqToImpTransformator.Rules.ReqConsumerToComputerRule#isAppropriate_BWD(org.moflon.tgg.runtime.Match, implementation.Computer, implementation.Cable, implementation.Container) <em>Is Appropriate BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD</em>' operation.
	 * @see ReqToImpTransformator.Rules.ReqConsumerToComputerRule#isAppropriate_BWD(org.moflon.tgg.runtime.Match, implementation.Computer, implementation.Cable, implementation.Container)
	 * @generated
	 */
	EOperation getReqConsumerToComputerRule__IsAppropriate_BWD__Match_Computer_Cable_Container();

	/**
	 * Returns the meta object for the '{@link ReqToImpTransformator.Rules.ReqConsumerToComputerRule#perform_BWD(org.moflon.tgg.runtime.IsApplicableMatch) <em>Perform BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Perform BWD</em>' operation.
	 * @see ReqToImpTransformator.Rules.ReqConsumerToComputerRule#perform_BWD(org.moflon.tgg.runtime.IsApplicableMatch)
	 * @generated
	 */
	EOperation getReqConsumerToComputerRule__Perform_BWD__IsApplicableMatch();

	/**
	 * Returns the meta object for the '{@link ReqToImpTransformator.Rules.ReqConsumerToComputerRule#isApplicable_BWD(org.moflon.tgg.runtime.Match) <em>Is Applicable BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable BWD</em>' operation.
	 * @see ReqToImpTransformator.Rules.ReqConsumerToComputerRule#isApplicable_BWD(org.moflon.tgg.runtime.Match)
	 * @generated
	 */
	EOperation getReqConsumerToComputerRule__IsApplicable_BWD__Match();

	/**
	 * Returns the meta object for the '{@link ReqToImpTransformator.Rules.ReqConsumerToComputerRule#registerObjectsToMatch_BWD(org.moflon.tgg.runtime.Match, implementation.Computer, implementation.Cable, implementation.Container) <em>Register Objects To Match BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Register Objects To Match BWD</em>' operation.
	 * @see ReqToImpTransformator.Rules.ReqConsumerToComputerRule#registerObjectsToMatch_BWD(org.moflon.tgg.runtime.Match, implementation.Computer, implementation.Cable, implementation.Container)
	 * @generated
	 */
	EOperation getReqConsumerToComputerRule__RegisterObjectsToMatch_BWD__Match_Computer_Cable_Container();

	/**
	 * Returns the meta object for the '{@link ReqToImpTransformator.Rules.ReqConsumerToComputerRule#isAppropriate_solveCsp_BWD(org.moflon.tgg.runtime.Match, implementation.Computer, implementation.Cable, implementation.Container) <em>Is Appropriate solve Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate solve Csp BWD</em>' operation.
	 * @see ReqToImpTransformator.Rules.ReqConsumerToComputerRule#isAppropriate_solveCsp_BWD(org.moflon.tgg.runtime.Match, implementation.Computer, implementation.Cable, implementation.Container)
	 * @generated
	 */
	EOperation getReqConsumerToComputerRule__IsAppropriate_solveCsp_BWD__Match_Computer_Cable_Container();

	/**
	 * Returns the meta object for the '{@link ReqToImpTransformator.Rules.ReqConsumerToComputerRule#isAppropriate_checkCsp_BWD(org.moflon.tgg.language.csp.CSP) <em>Is Appropriate check Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate check Csp BWD</em>' operation.
	 * @see ReqToImpTransformator.Rules.ReqConsumerToComputerRule#isAppropriate_checkCsp_BWD(org.moflon.tgg.language.csp.CSP)
	 * @generated
	 */
	EOperation getReqConsumerToComputerRule__IsAppropriate_checkCsp_BWD__CSP();

	/**
	 * Returns the meta object for the '{@link ReqToImpTransformator.Rules.ReqConsumerToComputerRule#checkTypes_BWD(org.moflon.tgg.runtime.Match) <em>Check Types BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check Types BWD</em>' operation.
	 * @see ReqToImpTransformator.Rules.ReqConsumerToComputerRule#checkTypes_BWD(org.moflon.tgg.runtime.Match)
	 * @generated
	 */
	EOperation getReqConsumerToComputerRule__CheckTypes_BWD__Match();

	/**
	 * Returns the meta object for the '{@link ReqToImpTransformator.Rules.ReqConsumerToComputerRule#isAppropriate_BWD_Computer_2(implementation.Computer) <em>Is Appropriate BWD Computer 2</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD Computer 2</em>' operation.
	 * @see ReqToImpTransformator.Rules.ReqConsumerToComputerRule#isAppropriate_BWD_Computer_2(implementation.Computer)
	 * @generated
	 */
	EOperation getReqConsumerToComputerRule__IsAppropriate_BWD_Computer_2__Computer();

	/**
	 * Returns the meta object for the '{@link ReqToImpTransformator.Rules.ReqConsumerToComputerRule#isAppropriate_FWD_EMoflonEdge_30(org.moflon.tgg.runtime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 30</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 30</em>' operation.
	 * @see ReqToImpTransformator.Rules.ReqConsumerToComputerRule#isAppropriate_FWD_EMoflonEdge_30(org.moflon.tgg.runtime.EMoflonEdge)
	 * @generated
	 */
	EOperation getReqConsumerToComputerRule__IsAppropriate_FWD_EMoflonEdge_30__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link ReqToImpTransformator.Rules.ReqConsumerToComputerRule#checkAttributes_FWD(org.moflon.tgg.runtime.TripleMatch) <em>Check Attributes FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check Attributes FWD</em>' operation.
	 * @see ReqToImpTransformator.Rules.ReqConsumerToComputerRule#checkAttributes_FWD(org.moflon.tgg.runtime.TripleMatch)
	 * @generated
	 */
	EOperation getReqConsumerToComputerRule__CheckAttributes_FWD__TripleMatch();

	/**
	 * Returns the meta object for the '{@link ReqToImpTransformator.Rules.ReqConsumerToComputerRule#checkAttributes_BWD(org.moflon.tgg.runtime.TripleMatch) <em>Check Attributes BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check Attributes BWD</em>' operation.
	 * @see ReqToImpTransformator.Rules.ReqConsumerToComputerRule#checkAttributes_BWD(org.moflon.tgg.runtime.TripleMatch)
	 * @generated
	 */
	EOperation getReqConsumerToComputerRule__CheckAttributes_BWD__TripleMatch();

	/**
	 * Returns the meta object for the '{@link ReqToImpTransformator.Rules.ReqConsumerToComputerRule#isApplicable_CC(org.moflon.tgg.runtime.Match, org.moflon.tgg.runtime.Match) <em>Is Applicable CC</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable CC</em>' operation.
	 * @see ReqToImpTransformator.Rules.ReqConsumerToComputerRule#isApplicable_CC(org.moflon.tgg.runtime.Match, org.moflon.tgg.runtime.Match)
	 * @generated
	 */
	EOperation getReqConsumerToComputerRule__IsApplicable_CC__Match_Match();

	/**
	 * Returns the meta object for the '{@link ReqToImpTransformator.Rules.ReqConsumerToComputerRule#isApplicable_solveCsp_CC(implementation.Computer, requirements.Consumer, requirements.Container, requirements.NetworkSpan, implementation.Cable, implementation.Container, org.moflon.tgg.runtime.Match, org.moflon.tgg.runtime.Match) <em>Is Applicable solve Csp CC</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable solve Csp CC</em>' operation.
	 * @see ReqToImpTransformator.Rules.ReqConsumerToComputerRule#isApplicable_solveCsp_CC(implementation.Computer, requirements.Consumer, requirements.Container, requirements.NetworkSpan, implementation.Cable, implementation.Container, org.moflon.tgg.runtime.Match, org.moflon.tgg.runtime.Match)
	 * @generated
	 */
	EOperation getReqConsumerToComputerRule__IsApplicable_solveCsp_CC__Computer_Consumer_Container_NetworkSpan_Cable_Container_Match_Match();

	/**
	 * Returns the meta object for the '{@link ReqToImpTransformator.Rules.ReqConsumerToComputerRule#isApplicable_checkCsp_CC(org.moflon.tgg.language.csp.CSP) <em>Is Applicable check Csp CC</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable check Csp CC</em>' operation.
	 * @see ReqToImpTransformator.Rules.ReqConsumerToComputerRule#isApplicable_checkCsp_CC(org.moflon.tgg.language.csp.CSP)
	 * @generated
	 */
	EOperation getReqConsumerToComputerRule__IsApplicable_checkCsp_CC__CSP();

	/**
	 * Returns the meta object for the '{@link ReqToImpTransformator.Rules.ReqConsumerToComputerRule#checkDEC_FWD(requirements.Consumer, requirements.Container, requirements.NetworkSpan) <em>Check DEC FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check DEC FWD</em>' operation.
	 * @see ReqToImpTransformator.Rules.ReqConsumerToComputerRule#checkDEC_FWD(requirements.Consumer, requirements.Container, requirements.NetworkSpan)
	 * @generated
	 */
	EOperation getReqConsumerToComputerRule__CheckDEC_FWD__Consumer_Container_NetworkSpan();

	/**
	 * Returns the meta object for the '{@link ReqToImpTransformator.Rules.ReqConsumerToComputerRule#checkDEC_BWD(implementation.Computer, implementation.Cable, implementation.Container) <em>Check DEC BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check DEC BWD</em>' operation.
	 * @see ReqToImpTransformator.Rules.ReqConsumerToComputerRule#checkDEC_BWD(implementation.Computer, implementation.Cable, implementation.Container)
	 * @generated
	 */
	EOperation getReqConsumerToComputerRule__CheckDEC_BWD__Computer_Cable_Container();

	/**
	 * Returns the meta object for the '{@link ReqToImpTransformator.Rules.ReqConsumerToComputerRule#generateModel(org.moflon.tgg.language.modelgenerator.RuleEntryContainer, ReqToImpTransformator.VirtualNodeToComputer) <em>Generate Model</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Generate Model</em>' operation.
	 * @see ReqToImpTransformator.Rules.ReqConsumerToComputerRule#generateModel(org.moflon.tgg.language.modelgenerator.RuleEntryContainer, ReqToImpTransformator.VirtualNodeToComputer)
	 * @generated
	 */
	EOperation getReqConsumerToComputerRule__GenerateModel__RuleEntryContainer_VirtualNodeToComputer();

	/**
	 * Returns the meta object for the '{@link ReqToImpTransformator.Rules.ReqConsumerToComputerRule#generateModel_solveCsp_BWD(org.moflon.tgg.runtime.IsApplicableMatch, implementation.Computer, requirements.Container, ReqToImpTransformator.VirtualNodeToComputer, requirements.NetworkSpan, implementation.Cable, implementation.Container, ReqToImpTransformator.ReqContainerToImplContainer, org.moflon.tgg.runtime.ModelgeneratorRuleResult) <em>Generate Model solve Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Generate Model solve Csp BWD</em>' operation.
	 * @see ReqToImpTransformator.Rules.ReqConsumerToComputerRule#generateModel_solveCsp_BWD(org.moflon.tgg.runtime.IsApplicableMatch, implementation.Computer, requirements.Container, ReqToImpTransformator.VirtualNodeToComputer, requirements.NetworkSpan, implementation.Cable, implementation.Container, ReqToImpTransformator.ReqContainerToImplContainer, org.moflon.tgg.runtime.ModelgeneratorRuleResult)
	 * @generated
	 */
	EOperation getReqConsumerToComputerRule__GenerateModel_solveCsp_BWD__IsApplicableMatch_Computer_Container_VirtualNodeToComputer_NetworkSpan_Cable_Container_ReqContainerToImplContainer_ModelgeneratorRuleResult();

	/**
	 * Returns the meta object for the '{@link ReqToImpTransformator.Rules.ReqConsumerToComputerRule#generateModel_checkCsp_BWD(org.moflon.tgg.language.csp.CSP) <em>Generate Model check Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Generate Model check Csp BWD</em>' operation.
	 * @see ReqToImpTransformator.Rules.ReqConsumerToComputerRule#generateModel_checkCsp_BWD(org.moflon.tgg.language.csp.CSP)
	 * @generated
	 */
	EOperation getReqConsumerToComputerRule__GenerateModel_checkCsp_BWD__CSP();

	/**
	 * Returns the meta object for class '{@link ReqToImpTransformator.Rules.VirtualNodeToRouterRule2 <em>Virtual Node To Router Rule2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Virtual Node To Router Rule2</em>'.
	 * @see ReqToImpTransformator.Rules.VirtualNodeToRouterRule2
	 * @generated
	 */
	EClass getVirtualNodeToRouterRule2();

	/**
	 * Returns the meta object for the '{@link ReqToImpTransformator.Rules.VirtualNodeToRouterRule2#isAppropriate_FWD(org.moflon.tgg.runtime.Match, requirements.NetworkSpan, requirements.Container) <em>Is Appropriate FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD</em>' operation.
	 * @see ReqToImpTransformator.Rules.VirtualNodeToRouterRule2#isAppropriate_FWD(org.moflon.tgg.runtime.Match, requirements.NetworkSpan, requirements.Container)
	 * @generated
	 */
	EOperation getVirtualNodeToRouterRule2__IsAppropriate_FWD__Match_NetworkSpan_Container();

	/**
	 * Returns the meta object for the '{@link ReqToImpTransformator.Rules.VirtualNodeToRouterRule2#perform_FWD(org.moflon.tgg.runtime.IsApplicableMatch) <em>Perform FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Perform FWD</em>' operation.
	 * @see ReqToImpTransformator.Rules.VirtualNodeToRouterRule2#perform_FWD(org.moflon.tgg.runtime.IsApplicableMatch)
	 * @generated
	 */
	EOperation getVirtualNodeToRouterRule2__Perform_FWD__IsApplicableMatch();

	/**
	 * Returns the meta object for the '{@link ReqToImpTransformator.Rules.VirtualNodeToRouterRule2#isApplicable_FWD(org.moflon.tgg.runtime.Match) <em>Is Applicable FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable FWD</em>' operation.
	 * @see ReqToImpTransformator.Rules.VirtualNodeToRouterRule2#isApplicable_FWD(org.moflon.tgg.runtime.Match)
	 * @generated
	 */
	EOperation getVirtualNodeToRouterRule2__IsApplicable_FWD__Match();

	/**
	 * Returns the meta object for the '{@link ReqToImpTransformator.Rules.VirtualNodeToRouterRule2#registerObjectsToMatch_FWD(org.moflon.tgg.runtime.Match, requirements.NetworkSpan, requirements.Container) <em>Register Objects To Match FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Register Objects To Match FWD</em>' operation.
	 * @see ReqToImpTransformator.Rules.VirtualNodeToRouterRule2#registerObjectsToMatch_FWD(org.moflon.tgg.runtime.Match, requirements.NetworkSpan, requirements.Container)
	 * @generated
	 */
	EOperation getVirtualNodeToRouterRule2__RegisterObjectsToMatch_FWD__Match_NetworkSpan_Container();

	/**
	 * Returns the meta object for the '{@link ReqToImpTransformator.Rules.VirtualNodeToRouterRule2#isAppropriate_solveCsp_FWD(org.moflon.tgg.runtime.Match, requirements.NetworkSpan, requirements.Container) <em>Is Appropriate solve Csp FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate solve Csp FWD</em>' operation.
	 * @see ReqToImpTransformator.Rules.VirtualNodeToRouterRule2#isAppropriate_solveCsp_FWD(org.moflon.tgg.runtime.Match, requirements.NetworkSpan, requirements.Container)
	 * @generated
	 */
	EOperation getVirtualNodeToRouterRule2__IsAppropriate_solveCsp_FWD__Match_NetworkSpan_Container();

	/**
	 * Returns the meta object for the '{@link ReqToImpTransformator.Rules.VirtualNodeToRouterRule2#isAppropriate_checkCsp_FWD(org.moflon.tgg.language.csp.CSP) <em>Is Appropriate check Csp FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate check Csp FWD</em>' operation.
	 * @see ReqToImpTransformator.Rules.VirtualNodeToRouterRule2#isAppropriate_checkCsp_FWD(org.moflon.tgg.language.csp.CSP)
	 * @generated
	 */
	EOperation getVirtualNodeToRouterRule2__IsAppropriate_checkCsp_FWD__CSP();

	/**
	 * Returns the meta object for the '{@link ReqToImpTransformator.Rules.VirtualNodeToRouterRule2#checkTypes_FWD(org.moflon.tgg.runtime.Match) <em>Check Types FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check Types FWD</em>' operation.
	 * @see ReqToImpTransformator.Rules.VirtualNodeToRouterRule2#checkTypes_FWD(org.moflon.tgg.runtime.Match)
	 * @generated
	 */
	EOperation getVirtualNodeToRouterRule2__CheckTypes_FWD__Match();

	/**
	 * Returns the meta object for the '{@link ReqToImpTransformator.Rules.VirtualNodeToRouterRule2#isAppropriate_BWD(org.moflon.tgg.runtime.Match, implementation.Container, implementation.Cable, implementation.Router, implementation.Router) <em>Is Appropriate BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD</em>' operation.
	 * @see ReqToImpTransformator.Rules.VirtualNodeToRouterRule2#isAppropriate_BWD(org.moflon.tgg.runtime.Match, implementation.Container, implementation.Cable, implementation.Router, implementation.Router)
	 * @generated
	 */
	EOperation getVirtualNodeToRouterRule2__IsAppropriate_BWD__Match_Container_Cable_Router_Router();

	/**
	 * Returns the meta object for the '{@link ReqToImpTransformator.Rules.VirtualNodeToRouterRule2#perform_BWD(org.moflon.tgg.runtime.IsApplicableMatch) <em>Perform BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Perform BWD</em>' operation.
	 * @see ReqToImpTransformator.Rules.VirtualNodeToRouterRule2#perform_BWD(org.moflon.tgg.runtime.IsApplicableMatch)
	 * @generated
	 */
	EOperation getVirtualNodeToRouterRule2__Perform_BWD__IsApplicableMatch();

	/**
	 * Returns the meta object for the '{@link ReqToImpTransformator.Rules.VirtualNodeToRouterRule2#isApplicable_BWD(org.moflon.tgg.runtime.Match) <em>Is Applicable BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable BWD</em>' operation.
	 * @see ReqToImpTransformator.Rules.VirtualNodeToRouterRule2#isApplicable_BWD(org.moflon.tgg.runtime.Match)
	 * @generated
	 */
	EOperation getVirtualNodeToRouterRule2__IsApplicable_BWD__Match();

	/**
	 * Returns the meta object for the '{@link ReqToImpTransformator.Rules.VirtualNodeToRouterRule2#registerObjectsToMatch_BWD(org.moflon.tgg.runtime.Match, implementation.Container, implementation.Cable, implementation.Router, implementation.Router) <em>Register Objects To Match BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Register Objects To Match BWD</em>' operation.
	 * @see ReqToImpTransformator.Rules.VirtualNodeToRouterRule2#registerObjectsToMatch_BWD(org.moflon.tgg.runtime.Match, implementation.Container, implementation.Cable, implementation.Router, implementation.Router)
	 * @generated
	 */
	EOperation getVirtualNodeToRouterRule2__RegisterObjectsToMatch_BWD__Match_Container_Cable_Router_Router();

	/**
	 * Returns the meta object for the '{@link ReqToImpTransformator.Rules.VirtualNodeToRouterRule2#isAppropriate_solveCsp_BWD(org.moflon.tgg.runtime.Match, implementation.Container, implementation.Cable, implementation.Router, implementation.Router) <em>Is Appropriate solve Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate solve Csp BWD</em>' operation.
	 * @see ReqToImpTransformator.Rules.VirtualNodeToRouterRule2#isAppropriate_solveCsp_BWD(org.moflon.tgg.runtime.Match, implementation.Container, implementation.Cable, implementation.Router, implementation.Router)
	 * @generated
	 */
	EOperation getVirtualNodeToRouterRule2__IsAppropriate_solveCsp_BWD__Match_Container_Cable_Router_Router();

	/**
	 * Returns the meta object for the '{@link ReqToImpTransformator.Rules.VirtualNodeToRouterRule2#isAppropriate_checkCsp_BWD(org.moflon.tgg.language.csp.CSP) <em>Is Appropriate check Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate check Csp BWD</em>' operation.
	 * @see ReqToImpTransformator.Rules.VirtualNodeToRouterRule2#isAppropriate_checkCsp_BWD(org.moflon.tgg.language.csp.CSP)
	 * @generated
	 */
	EOperation getVirtualNodeToRouterRule2__IsAppropriate_checkCsp_BWD__CSP();

	/**
	 * Returns the meta object for the '{@link ReqToImpTransformator.Rules.VirtualNodeToRouterRule2#isApplicable_solveCsp_BWD(org.moflon.tgg.runtime.IsApplicableMatch, ReqToImpTransformator.VirtualNodeToRouter, implementation.Container, ReqToImpTransformator.ReqContainerToImplContainer, requirements.NetworkSpan, implementation.Cable, implementation.Router, implementation.Router, requirements.Container) <em>Is Applicable solve Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable solve Csp BWD</em>' operation.
	 * @see ReqToImpTransformator.Rules.VirtualNodeToRouterRule2#isApplicable_solveCsp_BWD(org.moflon.tgg.runtime.IsApplicableMatch, ReqToImpTransformator.VirtualNodeToRouter, implementation.Container, ReqToImpTransformator.ReqContainerToImplContainer, requirements.NetworkSpan, implementation.Cable, implementation.Router, implementation.Router, requirements.Container)
	 * @generated
	 */
	EOperation getVirtualNodeToRouterRule2__IsApplicable_solveCsp_BWD__IsApplicableMatch_VirtualNodeToRouter_Container_ReqContainerToImplContainer_NetworkSpan_Cable_Router_Router_Container();

	/**
	 * Returns the meta object for the '{@link ReqToImpTransformator.Rules.VirtualNodeToRouterRule2#isApplicable_checkCsp_BWD(org.moflon.tgg.language.csp.CSP) <em>Is Applicable check Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable check Csp BWD</em>' operation.
	 * @see ReqToImpTransformator.Rules.VirtualNodeToRouterRule2#isApplicable_checkCsp_BWD(org.moflon.tgg.language.csp.CSP)
	 * @generated
	 */
	EOperation getVirtualNodeToRouterRule2__IsApplicable_checkCsp_BWD__CSP();

	/**
	 * Returns the meta object for the '{@link ReqToImpTransformator.Rules.VirtualNodeToRouterRule2#registerObjects_BWD(org.moflon.tgg.runtime.PerformRuleResult, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject) <em>Register Objects BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Register Objects BWD</em>' operation.
	 * @see ReqToImpTransformator.Rules.VirtualNodeToRouterRule2#registerObjects_BWD(org.moflon.tgg.runtime.PerformRuleResult, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	EOperation getVirtualNodeToRouterRule2__RegisterObjects_BWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject();

	/**
	 * Returns the meta object for the '{@link ReqToImpTransformator.Rules.VirtualNodeToRouterRule2#checkTypes_BWD(org.moflon.tgg.runtime.Match) <em>Check Types BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check Types BWD</em>' operation.
	 * @see ReqToImpTransformator.Rules.VirtualNodeToRouterRule2#checkTypes_BWD(org.moflon.tgg.runtime.Match)
	 * @generated
	 */
	EOperation getVirtualNodeToRouterRule2__CheckTypes_BWD__Match();

	/**
	 * Returns the meta object for the '{@link ReqToImpTransformator.Rules.VirtualNodeToRouterRule2#isAppropriate_FWD_NetworkSpan_2(requirements.NetworkSpan) <em>Is Appropriate FWD Network Span 2</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD Network Span 2</em>' operation.
	 * @see ReqToImpTransformator.Rules.VirtualNodeToRouterRule2#isAppropriate_FWD_NetworkSpan_2(requirements.NetworkSpan)
	 * @generated
	 */
	EOperation getVirtualNodeToRouterRule2__IsAppropriate_FWD_NetworkSpan_2__NetworkSpan();

	/**
	 * Returns the meta object for the '{@link ReqToImpTransformator.Rules.VirtualNodeToRouterRule2#isAppropriate_BWD_EMoflonEdge_40(org.moflon.tgg.runtime.EMoflonEdge) <em>Is Appropriate BWD EMoflon Edge 40</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD EMoflon Edge 40</em>' operation.
	 * @see ReqToImpTransformator.Rules.VirtualNodeToRouterRule2#isAppropriate_BWD_EMoflonEdge_40(org.moflon.tgg.runtime.EMoflonEdge)
	 * @generated
	 */
	EOperation getVirtualNodeToRouterRule2__IsAppropriate_BWD_EMoflonEdge_40__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link ReqToImpTransformator.Rules.VirtualNodeToRouterRule2#checkAttributes_FWD(org.moflon.tgg.runtime.TripleMatch) <em>Check Attributes FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check Attributes FWD</em>' operation.
	 * @see ReqToImpTransformator.Rules.VirtualNodeToRouterRule2#checkAttributes_FWD(org.moflon.tgg.runtime.TripleMatch)
	 * @generated
	 */
	EOperation getVirtualNodeToRouterRule2__CheckAttributes_FWD__TripleMatch();

	/**
	 * Returns the meta object for the '{@link ReqToImpTransformator.Rules.VirtualNodeToRouterRule2#checkAttributes_BWD(org.moflon.tgg.runtime.TripleMatch) <em>Check Attributes BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check Attributes BWD</em>' operation.
	 * @see ReqToImpTransformator.Rules.VirtualNodeToRouterRule2#checkAttributes_BWD(org.moflon.tgg.runtime.TripleMatch)
	 * @generated
	 */
	EOperation getVirtualNodeToRouterRule2__CheckAttributes_BWD__TripleMatch();

	/**
	 * Returns the meta object for the '{@link ReqToImpTransformator.Rules.VirtualNodeToRouterRule2#isApplicable_CC(org.moflon.tgg.runtime.Match, org.moflon.tgg.runtime.Match) <em>Is Applicable CC</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable CC</em>' operation.
	 * @see ReqToImpTransformator.Rules.VirtualNodeToRouterRule2#isApplicable_CC(org.moflon.tgg.runtime.Match, org.moflon.tgg.runtime.Match)
	 * @generated
	 */
	EOperation getVirtualNodeToRouterRule2__IsApplicable_CC__Match_Match();

	/**
	 * Returns the meta object for the '{@link ReqToImpTransformator.Rules.VirtualNodeToRouterRule2#isApplicable_solveCsp_CC(implementation.Container, requirements.NetworkSpan, implementation.Cable, implementation.Router, implementation.Router, requirements.Container, org.moflon.tgg.runtime.Match, org.moflon.tgg.runtime.Match) <em>Is Applicable solve Csp CC</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable solve Csp CC</em>' operation.
	 * @see ReqToImpTransformator.Rules.VirtualNodeToRouterRule2#isApplicable_solveCsp_CC(implementation.Container, requirements.NetworkSpan, implementation.Cable, implementation.Router, implementation.Router, requirements.Container, org.moflon.tgg.runtime.Match, org.moflon.tgg.runtime.Match)
	 * @generated
	 */
	EOperation getVirtualNodeToRouterRule2__IsApplicable_solveCsp_CC__Container_NetworkSpan_Cable_Router_Router_Container_Match_Match();

	/**
	 * Returns the meta object for the '{@link ReqToImpTransformator.Rules.VirtualNodeToRouterRule2#isApplicable_checkCsp_CC(org.moflon.tgg.language.csp.CSP) <em>Is Applicable check Csp CC</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable check Csp CC</em>' operation.
	 * @see ReqToImpTransformator.Rules.VirtualNodeToRouterRule2#isApplicable_checkCsp_CC(org.moflon.tgg.language.csp.CSP)
	 * @generated
	 */
	EOperation getVirtualNodeToRouterRule2__IsApplicable_checkCsp_CC__CSP();

	/**
	 * Returns the meta object for the '{@link ReqToImpTransformator.Rules.VirtualNodeToRouterRule2#checkDEC_FWD(requirements.NetworkSpan, requirements.Container) <em>Check DEC FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check DEC FWD</em>' operation.
	 * @see ReqToImpTransformator.Rules.VirtualNodeToRouterRule2#checkDEC_FWD(requirements.NetworkSpan, requirements.Container)
	 * @generated
	 */
	EOperation getVirtualNodeToRouterRule2__CheckDEC_FWD__NetworkSpan_Container();

	/**
	 * Returns the meta object for the '{@link ReqToImpTransformator.Rules.VirtualNodeToRouterRule2#checkDEC_BWD(implementation.Container, implementation.Cable, implementation.Router, implementation.Router) <em>Check DEC BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check DEC BWD</em>' operation.
	 * @see ReqToImpTransformator.Rules.VirtualNodeToRouterRule2#checkDEC_BWD(implementation.Container, implementation.Cable, implementation.Router, implementation.Router)
	 * @generated
	 */
	EOperation getVirtualNodeToRouterRule2__CheckDEC_BWD__Container_Cable_Router_Router();

	/**
	 * Returns the meta object for the '{@link ReqToImpTransformator.Rules.VirtualNodeToRouterRule2#generateModel(org.moflon.tgg.language.modelgenerator.RuleEntryContainer, ReqToImpTransformator.VirtualNodeToRouter) <em>Generate Model</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Generate Model</em>' operation.
	 * @see ReqToImpTransformator.Rules.VirtualNodeToRouterRule2#generateModel(org.moflon.tgg.language.modelgenerator.RuleEntryContainer, ReqToImpTransformator.VirtualNodeToRouter)
	 * @generated
	 */
	EOperation getVirtualNodeToRouterRule2__GenerateModel__RuleEntryContainer_VirtualNodeToRouter();

	/**
	 * Returns the meta object for the '{@link ReqToImpTransformator.Rules.VirtualNodeToRouterRule2#generateModel_solveCsp_BWD(org.moflon.tgg.runtime.IsApplicableMatch, ReqToImpTransformator.VirtualNodeToRouter, implementation.Container, ReqToImpTransformator.ReqContainerToImplContainer, requirements.NetworkSpan, implementation.Cable, implementation.Router, requirements.Container, org.moflon.tgg.runtime.ModelgeneratorRuleResult) <em>Generate Model solve Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Generate Model solve Csp BWD</em>' operation.
	 * @see ReqToImpTransformator.Rules.VirtualNodeToRouterRule2#generateModel_solveCsp_BWD(org.moflon.tgg.runtime.IsApplicableMatch, ReqToImpTransformator.VirtualNodeToRouter, implementation.Container, ReqToImpTransformator.ReqContainerToImplContainer, requirements.NetworkSpan, implementation.Cable, implementation.Router, requirements.Container, org.moflon.tgg.runtime.ModelgeneratorRuleResult)
	 * @generated
	 */
	EOperation getVirtualNodeToRouterRule2__GenerateModel_solveCsp_BWD__IsApplicableMatch_VirtualNodeToRouter_Container_ReqContainerToImplContainer_NetworkSpan_Cable_Router_Container_ModelgeneratorRuleResult();

	/**
	 * Returns the meta object for the '{@link ReqToImpTransformator.Rules.VirtualNodeToRouterRule2#generateModel_checkCsp_BWD(org.moflon.tgg.language.csp.CSP) <em>Generate Model check Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Generate Model check Csp BWD</em>' operation.
	 * @see ReqToImpTransformator.Rules.VirtualNodeToRouterRule2#generateModel_checkCsp_BWD(org.moflon.tgg.language.csp.CSP)
	 * @generated
	 */
	EOperation getVirtualNodeToRouterRule2__GenerateModel_checkCsp_BWD__CSP();

	/**
	 * Returns the meta object for class '{@link ReqToImpTransformator.Rules.ImplCableIgnoreRule <em>Impl Cable Ignore Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Impl Cable Ignore Rule</em>'.
	 * @see ReqToImpTransformator.Rules.ImplCableIgnoreRule
	 * @generated
	 */
	EClass getImplCableIgnoreRule();

	/**
	 * Returns the meta object for class '{@link ReqToImpTransformator.Rules.VirtualNodeToServerRule <em>Virtual Node To Server Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Virtual Node To Server Rule</em>'.
	 * @see ReqToImpTransformator.Rules.VirtualNodeToServerRule
	 * @generated
	 */
	EClass getVirtualNodeToServerRule();

	/**
	 * Returns the meta object for the '{@link ReqToImpTransformator.Rules.VirtualNodeToServerRule#isAppropriate_FWD(org.moflon.tgg.runtime.Match, requirements.Container, requirements.NetworkSpan) <em>Is Appropriate FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD</em>' operation.
	 * @see ReqToImpTransformator.Rules.VirtualNodeToServerRule#isAppropriate_FWD(org.moflon.tgg.runtime.Match, requirements.Container, requirements.NetworkSpan)
	 * @generated
	 */
	EOperation getVirtualNodeToServerRule__IsAppropriate_FWD__Match_Container_NetworkSpan();

	/**
	 * Returns the meta object for the '{@link ReqToImpTransformator.Rules.VirtualNodeToServerRule#perform_FWD(org.moflon.tgg.runtime.IsApplicableMatch) <em>Perform FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Perform FWD</em>' operation.
	 * @see ReqToImpTransformator.Rules.VirtualNodeToServerRule#perform_FWD(org.moflon.tgg.runtime.IsApplicableMatch)
	 * @generated
	 */
	EOperation getVirtualNodeToServerRule__Perform_FWD__IsApplicableMatch();

	/**
	 * Returns the meta object for the '{@link ReqToImpTransformator.Rules.VirtualNodeToServerRule#isApplicable_FWD(org.moflon.tgg.runtime.Match) <em>Is Applicable FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable FWD</em>' operation.
	 * @see ReqToImpTransformator.Rules.VirtualNodeToServerRule#isApplicable_FWD(org.moflon.tgg.runtime.Match)
	 * @generated
	 */
	EOperation getVirtualNodeToServerRule__IsApplicable_FWD__Match();

	/**
	 * Returns the meta object for the '{@link ReqToImpTransformator.Rules.VirtualNodeToServerRule#registerObjectsToMatch_FWD(org.moflon.tgg.runtime.Match, requirements.Container, requirements.NetworkSpan) <em>Register Objects To Match FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Register Objects To Match FWD</em>' operation.
	 * @see ReqToImpTransformator.Rules.VirtualNodeToServerRule#registerObjectsToMatch_FWD(org.moflon.tgg.runtime.Match, requirements.Container, requirements.NetworkSpan)
	 * @generated
	 */
	EOperation getVirtualNodeToServerRule__RegisterObjectsToMatch_FWD__Match_Container_NetworkSpan();

	/**
	 * Returns the meta object for the '{@link ReqToImpTransformator.Rules.VirtualNodeToServerRule#isAppropriate_solveCsp_FWD(org.moflon.tgg.runtime.Match, requirements.Container, requirements.NetworkSpan) <em>Is Appropriate solve Csp FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate solve Csp FWD</em>' operation.
	 * @see ReqToImpTransformator.Rules.VirtualNodeToServerRule#isAppropriate_solveCsp_FWD(org.moflon.tgg.runtime.Match, requirements.Container, requirements.NetworkSpan)
	 * @generated
	 */
	EOperation getVirtualNodeToServerRule__IsAppropriate_solveCsp_FWD__Match_Container_NetworkSpan();

	/**
	 * Returns the meta object for the '{@link ReqToImpTransformator.Rules.VirtualNodeToServerRule#isAppropriate_checkCsp_FWD(org.moflon.tgg.language.csp.CSP) <em>Is Appropriate check Csp FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate check Csp FWD</em>' operation.
	 * @see ReqToImpTransformator.Rules.VirtualNodeToServerRule#isAppropriate_checkCsp_FWD(org.moflon.tgg.language.csp.CSP)
	 * @generated
	 */
	EOperation getVirtualNodeToServerRule__IsAppropriate_checkCsp_FWD__CSP();

	/**
	 * Returns the meta object for the '{@link ReqToImpTransformator.Rules.VirtualNodeToServerRule#checkTypes_FWD(org.moflon.tgg.runtime.Match) <em>Check Types FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check Types FWD</em>' operation.
	 * @see ReqToImpTransformator.Rules.VirtualNodeToServerRule#checkTypes_FWD(org.moflon.tgg.runtime.Match)
	 * @generated
	 */
	EOperation getVirtualNodeToServerRule__CheckTypes_FWD__Match();

	/**
	 * Returns the meta object for the '{@link ReqToImpTransformator.Rules.VirtualNodeToServerRule#isAppropriate_BWD(org.moflon.tgg.runtime.Match, implementation.Router, implementation.Container, implementation.Cable, implementation.Server) <em>Is Appropriate BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD</em>' operation.
	 * @see ReqToImpTransformator.Rules.VirtualNodeToServerRule#isAppropriate_BWD(org.moflon.tgg.runtime.Match, implementation.Router, implementation.Container, implementation.Cable, implementation.Server)
	 * @generated
	 */
	EOperation getVirtualNodeToServerRule__IsAppropriate_BWD__Match_Router_Container_Cable_Server();

	/**
	 * Returns the meta object for the '{@link ReqToImpTransformator.Rules.VirtualNodeToServerRule#perform_BWD(org.moflon.tgg.runtime.IsApplicableMatch) <em>Perform BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Perform BWD</em>' operation.
	 * @see ReqToImpTransformator.Rules.VirtualNodeToServerRule#perform_BWD(org.moflon.tgg.runtime.IsApplicableMatch)
	 * @generated
	 */
	EOperation getVirtualNodeToServerRule__Perform_BWD__IsApplicableMatch();

	/**
	 * Returns the meta object for the '{@link ReqToImpTransformator.Rules.VirtualNodeToServerRule#isApplicable_BWD(org.moflon.tgg.runtime.Match) <em>Is Applicable BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable BWD</em>' operation.
	 * @see ReqToImpTransformator.Rules.VirtualNodeToServerRule#isApplicable_BWD(org.moflon.tgg.runtime.Match)
	 * @generated
	 */
	EOperation getVirtualNodeToServerRule__IsApplicable_BWD__Match();

	/**
	 * Returns the meta object for the '{@link ReqToImpTransformator.Rules.VirtualNodeToServerRule#registerObjectsToMatch_BWD(org.moflon.tgg.runtime.Match, implementation.Router, implementation.Container, implementation.Cable, implementation.Server) <em>Register Objects To Match BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Register Objects To Match BWD</em>' operation.
	 * @see ReqToImpTransformator.Rules.VirtualNodeToServerRule#registerObjectsToMatch_BWD(org.moflon.tgg.runtime.Match, implementation.Router, implementation.Container, implementation.Cable, implementation.Server)
	 * @generated
	 */
	EOperation getVirtualNodeToServerRule__RegisterObjectsToMatch_BWD__Match_Router_Container_Cable_Server();

	/**
	 * Returns the meta object for the '{@link ReqToImpTransformator.Rules.VirtualNodeToServerRule#isAppropriate_solveCsp_BWD(org.moflon.tgg.runtime.Match, implementation.Router, implementation.Container, implementation.Cable, implementation.Server) <em>Is Appropriate solve Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate solve Csp BWD</em>' operation.
	 * @see ReqToImpTransformator.Rules.VirtualNodeToServerRule#isAppropriate_solveCsp_BWD(org.moflon.tgg.runtime.Match, implementation.Router, implementation.Container, implementation.Cable, implementation.Server)
	 * @generated
	 */
	EOperation getVirtualNodeToServerRule__IsAppropriate_solveCsp_BWD__Match_Router_Container_Cable_Server();

	/**
	 * Returns the meta object for the '{@link ReqToImpTransformator.Rules.VirtualNodeToServerRule#isAppropriate_checkCsp_BWD(org.moflon.tgg.language.csp.CSP) <em>Is Appropriate check Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate check Csp BWD</em>' operation.
	 * @see ReqToImpTransformator.Rules.VirtualNodeToServerRule#isAppropriate_checkCsp_BWD(org.moflon.tgg.language.csp.CSP)
	 * @generated
	 */
	EOperation getVirtualNodeToServerRule__IsAppropriate_checkCsp_BWD__CSP();

	/**
	 * Returns the meta object for the '{@link ReqToImpTransformator.Rules.VirtualNodeToServerRule#isApplicable_solveCsp_BWD(org.moflon.tgg.runtime.IsApplicableMatch, requirements.Container, ReqToImpTransformator.VirtualNodeToRouter, requirements.NetworkSpan, implementation.Router, ReqToImpTransformator.ReqContainerToImplContainer, implementation.Container, implementation.Cable, implementation.Server) <em>Is Applicable solve Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable solve Csp BWD</em>' operation.
	 * @see ReqToImpTransformator.Rules.VirtualNodeToServerRule#isApplicable_solveCsp_BWD(org.moflon.tgg.runtime.IsApplicableMatch, requirements.Container, ReqToImpTransformator.VirtualNodeToRouter, requirements.NetworkSpan, implementation.Router, ReqToImpTransformator.ReqContainerToImplContainer, implementation.Container, implementation.Cable, implementation.Server)
	 * @generated
	 */
	EOperation getVirtualNodeToServerRule__IsApplicable_solveCsp_BWD__IsApplicableMatch_Container_VirtualNodeToRouter_NetworkSpan_Router_ReqContainerToImplContainer_Container_Cable_Server();

	/**
	 * Returns the meta object for the '{@link ReqToImpTransformator.Rules.VirtualNodeToServerRule#isApplicable_checkCsp_BWD(org.moflon.tgg.language.csp.CSP) <em>Is Applicable check Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable check Csp BWD</em>' operation.
	 * @see ReqToImpTransformator.Rules.VirtualNodeToServerRule#isApplicable_checkCsp_BWD(org.moflon.tgg.language.csp.CSP)
	 * @generated
	 */
	EOperation getVirtualNodeToServerRule__IsApplicable_checkCsp_BWD__CSP();

	/**
	 * Returns the meta object for the '{@link ReqToImpTransformator.Rules.VirtualNodeToServerRule#registerObjects_BWD(org.moflon.tgg.runtime.PerformRuleResult, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject) <em>Register Objects BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Register Objects BWD</em>' operation.
	 * @see ReqToImpTransformator.Rules.VirtualNodeToServerRule#registerObjects_BWD(org.moflon.tgg.runtime.PerformRuleResult, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	EOperation getVirtualNodeToServerRule__RegisterObjects_BWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject();

	/**
	 * Returns the meta object for the '{@link ReqToImpTransformator.Rules.VirtualNodeToServerRule#checkTypes_BWD(org.moflon.tgg.runtime.Match) <em>Check Types BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check Types BWD</em>' operation.
	 * @see ReqToImpTransformator.Rules.VirtualNodeToServerRule#checkTypes_BWD(org.moflon.tgg.runtime.Match)
	 * @generated
	 */
	EOperation getVirtualNodeToServerRule__CheckTypes_BWD__Match();

	/**
	 * Returns the meta object for the '{@link ReqToImpTransformator.Rules.VirtualNodeToServerRule#isAppropriate_FWD_Container_14(requirements.Container) <em>Is Appropriate FWD Container 14</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD Container 14</em>' operation.
	 * @see ReqToImpTransformator.Rules.VirtualNodeToServerRule#isAppropriate_FWD_Container_14(requirements.Container)
	 * @generated
	 */
	EOperation getVirtualNodeToServerRule__IsAppropriate_FWD_Container_14__Container();

	/**
	 * Returns the meta object for the '{@link ReqToImpTransformator.Rules.VirtualNodeToServerRule#isAppropriate_BWD_EMoflonEdge_41(org.moflon.tgg.runtime.EMoflonEdge) <em>Is Appropriate BWD EMoflon Edge 41</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD EMoflon Edge 41</em>' operation.
	 * @see ReqToImpTransformator.Rules.VirtualNodeToServerRule#isAppropriate_BWD_EMoflonEdge_41(org.moflon.tgg.runtime.EMoflonEdge)
	 * @generated
	 */
	EOperation getVirtualNodeToServerRule__IsAppropriate_BWD_EMoflonEdge_41__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link ReqToImpTransformator.Rules.VirtualNodeToServerRule#checkAttributes_FWD(org.moflon.tgg.runtime.TripleMatch) <em>Check Attributes FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check Attributes FWD</em>' operation.
	 * @see ReqToImpTransformator.Rules.VirtualNodeToServerRule#checkAttributes_FWD(org.moflon.tgg.runtime.TripleMatch)
	 * @generated
	 */
	EOperation getVirtualNodeToServerRule__CheckAttributes_FWD__TripleMatch();

	/**
	 * Returns the meta object for the '{@link ReqToImpTransformator.Rules.VirtualNodeToServerRule#checkAttributes_BWD(org.moflon.tgg.runtime.TripleMatch) <em>Check Attributes BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check Attributes BWD</em>' operation.
	 * @see ReqToImpTransformator.Rules.VirtualNodeToServerRule#checkAttributes_BWD(org.moflon.tgg.runtime.TripleMatch)
	 * @generated
	 */
	EOperation getVirtualNodeToServerRule__CheckAttributes_BWD__TripleMatch();

	/**
	 * Returns the meta object for the '{@link ReqToImpTransformator.Rules.VirtualNodeToServerRule#isApplicable_CC(org.moflon.tgg.runtime.Match, org.moflon.tgg.runtime.Match) <em>Is Applicable CC</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable CC</em>' operation.
	 * @see ReqToImpTransformator.Rules.VirtualNodeToServerRule#isApplicable_CC(org.moflon.tgg.runtime.Match, org.moflon.tgg.runtime.Match)
	 * @generated
	 */
	EOperation getVirtualNodeToServerRule__IsApplicable_CC__Match_Match();

	/**
	 * Returns the meta object for the '{@link ReqToImpTransformator.Rules.VirtualNodeToServerRule#isApplicable_solveCsp_CC(requirements.Container, requirements.NetworkSpan, implementation.Router, implementation.Container, implementation.Cable, implementation.Server, org.moflon.tgg.runtime.Match, org.moflon.tgg.runtime.Match) <em>Is Applicable solve Csp CC</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable solve Csp CC</em>' operation.
	 * @see ReqToImpTransformator.Rules.VirtualNodeToServerRule#isApplicable_solveCsp_CC(requirements.Container, requirements.NetworkSpan, implementation.Router, implementation.Container, implementation.Cable, implementation.Server, org.moflon.tgg.runtime.Match, org.moflon.tgg.runtime.Match)
	 * @generated
	 */
	EOperation getVirtualNodeToServerRule__IsApplicable_solveCsp_CC__Container_NetworkSpan_Router_Container_Cable_Server_Match_Match();

	/**
	 * Returns the meta object for the '{@link ReqToImpTransformator.Rules.VirtualNodeToServerRule#isApplicable_checkCsp_CC(org.moflon.tgg.language.csp.CSP) <em>Is Applicable check Csp CC</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable check Csp CC</em>' operation.
	 * @see ReqToImpTransformator.Rules.VirtualNodeToServerRule#isApplicable_checkCsp_CC(org.moflon.tgg.language.csp.CSP)
	 * @generated
	 */
	EOperation getVirtualNodeToServerRule__IsApplicable_checkCsp_CC__CSP();

	/**
	 * Returns the meta object for the '{@link ReqToImpTransformator.Rules.VirtualNodeToServerRule#checkDEC_FWD(requirements.Container, requirements.NetworkSpan) <em>Check DEC FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check DEC FWD</em>' operation.
	 * @see ReqToImpTransformator.Rules.VirtualNodeToServerRule#checkDEC_FWD(requirements.Container, requirements.NetworkSpan)
	 * @generated
	 */
	EOperation getVirtualNodeToServerRule__CheckDEC_FWD__Container_NetworkSpan();

	/**
	 * Returns the meta object for the '{@link ReqToImpTransformator.Rules.VirtualNodeToServerRule#checkDEC_BWD(implementation.Router, implementation.Container, implementation.Cable, implementation.Server) <em>Check DEC BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check DEC BWD</em>' operation.
	 * @see ReqToImpTransformator.Rules.VirtualNodeToServerRule#checkDEC_BWD(implementation.Router, implementation.Container, implementation.Cable, implementation.Server)
	 * @generated
	 */
	EOperation getVirtualNodeToServerRule__CheckDEC_BWD__Router_Container_Cable_Server();

	/**
	 * Returns the meta object for the '{@link ReqToImpTransformator.Rules.VirtualNodeToServerRule#generateModel(org.moflon.tgg.language.modelgenerator.RuleEntryContainer, ReqToImpTransformator.VirtualNodeToRouter) <em>Generate Model</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Generate Model</em>' operation.
	 * @see ReqToImpTransformator.Rules.VirtualNodeToServerRule#generateModel(org.moflon.tgg.language.modelgenerator.RuleEntryContainer, ReqToImpTransformator.VirtualNodeToRouter)
	 * @generated
	 */
	EOperation getVirtualNodeToServerRule__GenerateModel__RuleEntryContainer_VirtualNodeToRouter();

	/**
	 * Returns the meta object for the '{@link ReqToImpTransformator.Rules.VirtualNodeToServerRule#generateModel_solveCsp_BWD(org.moflon.tgg.runtime.IsApplicableMatch, requirements.Container, ReqToImpTransformator.VirtualNodeToRouter, requirements.NetworkSpan, implementation.Router, ReqToImpTransformator.ReqContainerToImplContainer, implementation.Container, implementation.Cable, org.moflon.tgg.runtime.ModelgeneratorRuleResult) <em>Generate Model solve Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Generate Model solve Csp BWD</em>' operation.
	 * @see ReqToImpTransformator.Rules.VirtualNodeToServerRule#generateModel_solveCsp_BWD(org.moflon.tgg.runtime.IsApplicableMatch, requirements.Container, ReqToImpTransformator.VirtualNodeToRouter, requirements.NetworkSpan, implementation.Router, ReqToImpTransformator.ReqContainerToImplContainer, implementation.Container, implementation.Cable, org.moflon.tgg.runtime.ModelgeneratorRuleResult)
	 * @generated
	 */
	EOperation getVirtualNodeToServerRule__GenerateModel_solveCsp_BWD__IsApplicableMatch_Container_VirtualNodeToRouter_NetworkSpan_Router_ReqContainerToImplContainer_Container_Cable_ModelgeneratorRuleResult();

	/**
	 * Returns the meta object for the '{@link ReqToImpTransformator.Rules.VirtualNodeToServerRule#generateModel_checkCsp_BWD(org.moflon.tgg.language.csp.CSP) <em>Generate Model check Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Generate Model check Csp BWD</em>' operation.
	 * @see ReqToImpTransformator.Rules.VirtualNodeToServerRule#generateModel_checkCsp_BWD(org.moflon.tgg.language.csp.CSP)
	 * @generated
	 */
	EOperation getVirtualNodeToServerRule__GenerateModel_checkCsp_BWD__CSP();

	/**
	 * Returns the meta object for class '{@link ReqToImpTransformator.Rules.ReqAgentToDeviceRule <em>Req Agent To Device Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Req Agent To Device Rule</em>'.
	 * @see ReqToImpTransformator.Rules.ReqAgentToDeviceRule
	 * @generated
	 */
	EClass getReqAgentToDeviceRule();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	RulesFactory getRulesFactory();

} //RulesPackage
