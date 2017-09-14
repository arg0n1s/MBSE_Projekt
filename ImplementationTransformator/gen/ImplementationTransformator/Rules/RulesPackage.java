/**
 */
package ImplementationTransformator.Rules;

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
 * @see ImplementationTransformator.Rules.RulesFactory
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
	String eNS_URI = "platform:/plugin/ImplementationTransformator/model/ImplementationTransformator.ecore#//Rules";

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
	RulesPackage eINSTANCE = ImplementationTransformator.Rules.impl.RulesPackageImpl.init();

	/**
	 * The meta object id for the '{@link ImplementationTransformator.Rules.impl.XDeviceToDeviceRuleImpl <em>XDevice To Device Rule</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ImplementationTransformator.Rules.impl.XDeviceToDeviceRuleImpl
	 * @see ImplementationTransformator.Rules.impl.RulesPackageImpl#getXDeviceToDeviceRule()
	 * @generated
	 */
	int XDEVICE_TO_DEVICE_RULE = 0;

	/**
	 * The number of structural features of the '<em>XDevice To Device Rule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XDEVICE_TO_DEVICE_RULE_FEATURE_COUNT = RuntimePackage.ABSTRACT_RULE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>XDevice To Device Rule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XDEVICE_TO_DEVICE_RULE_OPERATION_COUNT = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ImplementationTransformator.Rules.impl.XDuplexGlassFiberCableRuleImpl <em>XDuplex Glass Fiber Cable Rule</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ImplementationTransformator.Rules.impl.XDuplexGlassFiberCableRuleImpl
	 * @see ImplementationTransformator.Rules.impl.RulesPackageImpl#getXDuplexGlassFiberCableRule()
	 * @generated
	 */
	int XDUPLEX_GLASS_FIBER_CABLE_RULE = 1;

	/**
	 * The number of structural features of the '<em>XDuplex Glass Fiber Cable Rule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XDUPLEX_GLASS_FIBER_CABLE_RULE_FEATURE_COUNT = RuntimePackage.ABSTRACT_RULE_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Is Appropriate FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XDUPLEX_GLASS_FIBER_CABLE_RULE___IS_APPROPRIATE_FWD__MATCH_CABLEATTRIBUTES_XDEVICE_XGLASSFIBERCABLE_XCONTAINER = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 0;

	/**
	 * The operation id for the '<em>Perform FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XDUPLEX_GLASS_FIBER_CABLE_RULE___PERFORM_FWD__ISAPPLICABLEMATCH = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 1;

	/**
	 * The operation id for the '<em>Is Applicable FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XDUPLEX_GLASS_FIBER_CABLE_RULE___IS_APPLICABLE_FWD__MATCH = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 2;

	/**
	 * The operation id for the '<em>Register Objects To Match FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XDUPLEX_GLASS_FIBER_CABLE_RULE___REGISTER_OBJECTS_TO_MATCH_FWD__MATCH_CABLEATTRIBUTES_XDEVICE_XGLASSFIBERCABLE_XCONTAINER = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 3;

	/**
	 * The operation id for the '<em>Is Appropriate solve Csp FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XDUPLEX_GLASS_FIBER_CABLE_RULE___IS_APPROPRIATE_SOLVE_CSP_FWD__MATCH_CABLEATTRIBUTES_XDEVICE_XGLASSFIBERCABLE_XCONTAINER = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 4;

	/**
	 * The operation id for the '<em>Is Appropriate check Csp FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XDUPLEX_GLASS_FIBER_CABLE_RULE___IS_APPROPRIATE_CHECK_CSP_FWD__CSP = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 5;

	/**
	 * The operation id for the '<em>Is Applicable solve Csp FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XDUPLEX_GLASS_FIBER_CABLE_RULE___IS_APPLICABLE_SOLVE_CSP_FWD__ISAPPLICABLEMATCH_CONTAINER_CABLEATTRIBUTES_XDEVICE_XGLASSFIBERCABLE_XCONTAINER_DEVICE_XDEVICETODEVICE = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 6;

	/**
	 * The operation id for the '<em>Is Applicable check Csp FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XDUPLEX_GLASS_FIBER_CABLE_RULE___IS_APPLICABLE_CHECK_CSP_FWD__CSP = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 7;

	/**
	 * The operation id for the '<em>Register Objects FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XDUPLEX_GLASS_FIBER_CABLE_RULE___REGISTER_OBJECTS_FWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 8;

	/**
	 * The operation id for the '<em>Check Types FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XDUPLEX_GLASS_FIBER_CABLE_RULE___CHECK_TYPES_FWD__MATCH = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 9;

	/**
	 * The operation id for the '<em>Is Appropriate BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XDUPLEX_GLASS_FIBER_CABLE_RULE___IS_APPROPRIATE_BWD__MATCH_GLASSFIBERCABLE_CONTAINER_GLASSFIBERCABLE_DEVICE = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 10;

	/**
	 * The operation id for the '<em>Perform BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XDUPLEX_GLASS_FIBER_CABLE_RULE___PERFORM_BWD__ISAPPLICABLEMATCH = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 11;

	/**
	 * The operation id for the '<em>Is Applicable BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XDUPLEX_GLASS_FIBER_CABLE_RULE___IS_APPLICABLE_BWD__MATCH = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 12;

	/**
	 * The operation id for the '<em>Register Objects To Match BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XDUPLEX_GLASS_FIBER_CABLE_RULE___REGISTER_OBJECTS_TO_MATCH_BWD__MATCH_GLASSFIBERCABLE_CONTAINER_GLASSFIBERCABLE_DEVICE = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 13;

	/**
	 * The operation id for the '<em>Is Appropriate solve Csp BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XDUPLEX_GLASS_FIBER_CABLE_RULE___IS_APPROPRIATE_SOLVE_CSP_BWD__MATCH_GLASSFIBERCABLE_CONTAINER_GLASSFIBERCABLE_DEVICE = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 14;

	/**
	 * The operation id for the '<em>Is Appropriate check Csp BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XDUPLEX_GLASS_FIBER_CABLE_RULE___IS_APPROPRIATE_CHECK_CSP_BWD__CSP = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 15;

	/**
	 * The operation id for the '<em>Is Applicable solve Csp BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XDUPLEX_GLASS_FIBER_CABLE_RULE___IS_APPLICABLE_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_GLASSFIBERCABLE_CONTAINER_GLASSFIBERCABLE_XDEVICE_XCONTAINER_DEVICE_XDEVICETODEVICE = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 16;

	/**
	 * The operation id for the '<em>Is Applicable check Csp BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XDUPLEX_GLASS_FIBER_CABLE_RULE___IS_APPLICABLE_CHECK_CSP_BWD__CSP = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 17;

	/**
	 * The operation id for the '<em>Register Objects BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XDUPLEX_GLASS_FIBER_CABLE_RULE___REGISTER_OBJECTS_BWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 18;

	/**
	 * The operation id for the '<em>Check Types BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XDUPLEX_GLASS_FIBER_CABLE_RULE___CHECK_TYPES_BWD__MATCH = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 19;

	/**
	 * The operation id for the '<em>Is Appropriate BWD EMoflon Edge 9</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XDUPLEX_GLASS_FIBER_CABLE_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_9__EMOFLONEDGE = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 20;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 5</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XDUPLEX_GLASS_FIBER_CABLE_RULE___IS_APPROPRIATE_FWD_EMOFLON_EDGE_5__EMOFLONEDGE = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 21;

	/**
	 * The operation id for the '<em>Check Attributes FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XDUPLEX_GLASS_FIBER_CABLE_RULE___CHECK_ATTRIBUTES_FWD__TRIPLEMATCH = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 22;

	/**
	 * The operation id for the '<em>Check Attributes BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XDUPLEX_GLASS_FIBER_CABLE_RULE___CHECK_ATTRIBUTES_BWD__TRIPLEMATCH = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 23;

	/**
	 * The operation id for the '<em>Is Applicable CC</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XDUPLEX_GLASS_FIBER_CABLE_RULE___IS_APPLICABLE_CC__MATCH_MATCH = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 24;

	/**
	 * The operation id for the '<em>Is Applicable solve Csp CC</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XDUPLEX_GLASS_FIBER_CABLE_RULE___IS_APPLICABLE_SOLVE_CSP_CC__GLASSFIBERCABLE_CONTAINER_GLASSFIBERCABLE_CABLEATTRIBUTES_XDEVICE_XGLASSFIBERCABLE_XCONTAINER_DEVICE_MATCH_MATCH = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 25;

	/**
	 * The operation id for the '<em>Is Applicable check Csp CC</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XDUPLEX_GLASS_FIBER_CABLE_RULE___IS_APPLICABLE_CHECK_CSP_CC__CSP = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 26;

	/**
	 * The operation id for the '<em>Check DEC FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XDUPLEX_GLASS_FIBER_CABLE_RULE___CHECK_DEC_FWD__CABLEATTRIBUTES_XDEVICE_XGLASSFIBERCABLE_XCONTAINER = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 27;

	/**
	 * The operation id for the '<em>Check DEC BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XDUPLEX_GLASS_FIBER_CABLE_RULE___CHECK_DEC_BWD__GLASSFIBERCABLE_CONTAINER_GLASSFIBERCABLE_DEVICE = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 28;

	/**
	 * The operation id for the '<em>Generate Model</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XDUPLEX_GLASS_FIBER_CABLE_RULE___GENERATE_MODEL__RULEENTRYCONTAINER_XDEVICETODEVICE = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 29;

	/**
	 * The operation id for the '<em>Generate Model solve Csp BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XDUPLEX_GLASS_FIBER_CABLE_RULE___GENERATE_MODEL_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_CONTAINER_XDEVICE_XCONTAINER_DEVICE_XDEVICETODEVICE_MODELGENERATORRULERESULT = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 30;

	/**
	 * The operation id for the '<em>Generate Model check Csp BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XDUPLEX_GLASS_FIBER_CABLE_RULE___GENERATE_MODEL_CHECK_CSP_BWD__CSP = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 31;

	/**
	 * The number of operations of the '<em>XDuplex Glass Fiber Cable Rule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XDUPLEX_GLASS_FIBER_CABLE_RULE_OPERATION_COUNT = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 32;

	/**
	 * The meta object id for the '{@link ImplementationTransformator.Rules.impl.XDuplexCableToCablesRuleImpl <em>XDuplex Cable To Cables Rule</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ImplementationTransformator.Rules.impl.XDuplexCableToCablesRuleImpl
	 * @see ImplementationTransformator.Rules.impl.RulesPackageImpl#getXDuplexCableToCablesRule()
	 * @generated
	 */
	int XDUPLEX_CABLE_TO_CABLES_RULE = 2;

	/**
	 * The number of structural features of the '<em>XDuplex Cable To Cables Rule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XDUPLEX_CABLE_TO_CABLES_RULE_FEATURE_COUNT = RuntimePackage.ABSTRACT_RULE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>XDuplex Cable To Cables Rule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XDUPLEX_CABLE_TO_CABLES_RULE_OPERATION_COUNT = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ImplementationTransformator.Rules.impl.XServerToServerImpl <em>XServer To Server</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ImplementationTransformator.Rules.impl.XServerToServerImpl
	 * @see ImplementationTransformator.Rules.impl.RulesPackageImpl#getXServerToServer()
	 * @generated
	 */
	int XSERVER_TO_SERVER = 3;

	/**
	 * The number of structural features of the '<em>XServer To Server</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSERVER_TO_SERVER_FEATURE_COUNT = RuntimePackage.ABSTRACT_RULE_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Is Appropriate FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSERVER_TO_SERVER___IS_APPROPRIATE_FWD__MATCH_XSERVER_XCONTAINER_CONNECTIONS = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 0;

	/**
	 * The operation id for the '<em>Perform FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSERVER_TO_SERVER___PERFORM_FWD__ISAPPLICABLEMATCH = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Is Applicable FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSERVER_TO_SERVER___IS_APPLICABLE_FWD__MATCH = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 2;

	/**
	 * The operation id for the '<em>Register Objects To Match FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSERVER_TO_SERVER___REGISTER_OBJECTS_TO_MATCH_FWD__MATCH_XSERVER_XCONTAINER_CONNECTIONS = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 3;

	/**
	 * The operation id for the '<em>Is Appropriate solve Csp FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSERVER_TO_SERVER___IS_APPROPRIATE_SOLVE_CSP_FWD__MATCH_XSERVER_XCONTAINER_CONNECTIONS = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 4;

	/**
	 * The operation id for the '<em>Is Appropriate check Csp FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSERVER_TO_SERVER___IS_APPROPRIATE_CHECK_CSP_FWD__CSP = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 5;

	/**
	 * The operation id for the '<em>Is Applicable solve Csp FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSERVER_TO_SERVER___IS_APPLICABLE_SOLVE_CSP_FWD__ISAPPLICABLEMATCH_CONTAINER_XCONTAINERTOCONTAINER_XSERVER_XCONTAINER_CONNECTIONS = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 6;

	/**
	 * The operation id for the '<em>Is Applicable check Csp FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSERVER_TO_SERVER___IS_APPLICABLE_CHECK_CSP_FWD__CSP = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 7;

	/**
	 * The operation id for the '<em>Register Objects FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSERVER_TO_SERVER___REGISTER_OBJECTS_FWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 8;

	/**
	 * The operation id for the '<em>Check Types FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSERVER_TO_SERVER___CHECK_TYPES_FWD__MATCH = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 9;

	/**
	 * The operation id for the '<em>Is Appropriate BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSERVER_TO_SERVER___IS_APPROPRIATE_BWD__MATCH_CONTAINER_SERVER = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 10;

	/**
	 * The operation id for the '<em>Perform BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSERVER_TO_SERVER___PERFORM_BWD__ISAPPLICABLEMATCH = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 11;

	/**
	 * The operation id for the '<em>Is Applicable BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSERVER_TO_SERVER___IS_APPLICABLE_BWD__MATCH = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 12;

	/**
	 * The operation id for the '<em>Register Objects To Match BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSERVER_TO_SERVER___REGISTER_OBJECTS_TO_MATCH_BWD__MATCH_CONTAINER_SERVER = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 13;

	/**
	 * The operation id for the '<em>Is Appropriate solve Csp BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSERVER_TO_SERVER___IS_APPROPRIATE_SOLVE_CSP_BWD__MATCH_CONTAINER_SERVER = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 14;

	/**
	 * The operation id for the '<em>Is Appropriate check Csp BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSERVER_TO_SERVER___IS_APPROPRIATE_CHECK_CSP_BWD__CSP = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 15;

	/**
	 * The operation id for the '<em>Is Applicable solve Csp BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSERVER_TO_SERVER___IS_APPLICABLE_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_CONTAINER_XCONTAINERTOCONTAINER_XCONTAINER_SERVER = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 16;

	/**
	 * The operation id for the '<em>Is Applicable check Csp BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSERVER_TO_SERVER___IS_APPLICABLE_CHECK_CSP_BWD__CSP = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 17;

	/**
	 * The operation id for the '<em>Register Objects BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSERVER_TO_SERVER___REGISTER_OBJECTS_BWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 18;

	/**
	 * The operation id for the '<em>Check Types BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSERVER_TO_SERVER___CHECK_TYPES_BWD__MATCH = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 19;

	/**
	 * The operation id for the '<em>Is Appropriate BWD EMoflon Edge 10</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSERVER_TO_SERVER___IS_APPROPRIATE_BWD_EMOFLON_EDGE_10__EMOFLONEDGE = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 20;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 6</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSERVER_TO_SERVER___IS_APPROPRIATE_FWD_EMOFLON_EDGE_6__EMOFLONEDGE = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 21;

	/**
	 * The operation id for the '<em>Check Attributes FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSERVER_TO_SERVER___CHECK_ATTRIBUTES_FWD__TRIPLEMATCH = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 22;

	/**
	 * The operation id for the '<em>Check Attributes BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSERVER_TO_SERVER___CHECK_ATTRIBUTES_BWD__TRIPLEMATCH = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 23;

	/**
	 * The operation id for the '<em>Is Applicable CC</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSERVER_TO_SERVER___IS_APPLICABLE_CC__MATCH_MATCH = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 24;

	/**
	 * The operation id for the '<em>Is Applicable solve Csp CC</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSERVER_TO_SERVER___IS_APPLICABLE_SOLVE_CSP_CC__CONTAINER_XSERVER_XCONTAINER_CONNECTIONS_SERVER_MATCH_MATCH = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 25;

	/**
	 * The operation id for the '<em>Is Applicable check Csp CC</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSERVER_TO_SERVER___IS_APPLICABLE_CHECK_CSP_CC__CSP = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 26;

	/**
	 * The operation id for the '<em>Check DEC FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSERVER_TO_SERVER___CHECK_DEC_FWD__XSERVER_XCONTAINER_CONNECTIONS = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 27;

	/**
	 * The operation id for the '<em>Check DEC BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSERVER_TO_SERVER___CHECK_DEC_BWD__CONTAINER_SERVER = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 28;

	/**
	 * The operation id for the '<em>Generate Model</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSERVER_TO_SERVER___GENERATE_MODEL__RULEENTRYCONTAINER_XCONTAINERTOCONTAINER = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 29;

	/**
	 * The operation id for the '<em>Generate Model solve Csp BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSERVER_TO_SERVER___GENERATE_MODEL_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_CONTAINER_XCONTAINERTOCONTAINER_XCONTAINER_MODELGENERATORRULERESULT = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 30;

	/**
	 * The operation id for the '<em>Generate Model check Csp BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSERVER_TO_SERVER___GENERATE_MODEL_CHECK_CSP_BWD__CSP = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 31;

	/**
	 * The number of operations of the '<em>XServer To Server</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSERVER_TO_SERVER_OPERATION_COUNT = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 32;

	/**
	 * The meta object id for the '{@link ImplementationTransformator.Rules.impl.XSimplexConnectionToConnectionRuleImpl <em>XSimplex Connection To Connection Rule</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ImplementationTransformator.Rules.impl.XSimplexConnectionToConnectionRuleImpl
	 * @see ImplementationTransformator.Rules.impl.RulesPackageImpl#getXSimplexConnectionToConnectionRule()
	 * @generated
	 */
	int XSIMPLEX_CONNECTION_TO_CONNECTION_RULE = 4;

	/**
	 * The number of structural features of the '<em>XSimplex Connection To Connection Rule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSIMPLEX_CONNECTION_TO_CONNECTION_RULE_FEATURE_COUNT = RuntimePackage.ABSTRACT_RULE_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Is Appropriate FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSIMPLEX_CONNECTION_TO_CONNECTION_RULE___IS_APPROPRIATE_FWD__MATCH_XCONTAINER_XDEVICE_CONNECTIONS_CONNECTIONS_CABLEATTRIBUTES_XDEVICE_XCABLE = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 0;

	/**
	 * The operation id for the '<em>Perform FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSIMPLEX_CONNECTION_TO_CONNECTION_RULE___PERFORM_FWD__ISAPPLICABLEMATCH = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 1;

	/**
	 * The operation id for the '<em>Is Applicable FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSIMPLEX_CONNECTION_TO_CONNECTION_RULE___IS_APPLICABLE_FWD__MATCH = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 2;

	/**
	 * The operation id for the '<em>Register Objects To Match FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSIMPLEX_CONNECTION_TO_CONNECTION_RULE___REGISTER_OBJECTS_TO_MATCH_FWD__MATCH_XCONTAINER_XDEVICE_CONNECTIONS_CONNECTIONS_CABLEATTRIBUTES_XDEVICE_XCABLE = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 3;

	/**
	 * The operation id for the '<em>Is Appropriate solve Csp FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSIMPLEX_CONNECTION_TO_CONNECTION_RULE___IS_APPROPRIATE_SOLVE_CSP_FWD__MATCH_XCONTAINER_XDEVICE_CONNECTIONS_CONNECTIONS_CABLEATTRIBUTES_XDEVICE_XCABLE = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 4;

	/**
	 * The operation id for the '<em>Is Appropriate check Csp FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSIMPLEX_CONNECTION_TO_CONNECTION_RULE___IS_APPROPRIATE_CHECK_CSP_FWD__CSP = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 5;

	/**
	 * The operation id for the '<em>Is Applicable solve Csp FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSIMPLEX_CONNECTION_TO_CONNECTION_RULE___IS_APPLICABLE_SOLVE_CSP_FWD__ISAPPLICABLEMATCH_XCONTAINER_XDEVICETODEVICE_DEVICE_XDEVICE_CONNECTIONS_CONNECTIONS_CABLEATTRIBUTES_CONTAINER_XDEVICE_DEVICE_CABLE_XDEVICETODEVICE_XCABLE_XCABLETOCABLE = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 6;

	/**
	 * The operation id for the '<em>Is Applicable check Csp FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSIMPLEX_CONNECTION_TO_CONNECTION_RULE___IS_APPLICABLE_CHECK_CSP_FWD__CSP = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 7;

	/**
	 * The operation id for the '<em>Register Objects FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSIMPLEX_CONNECTION_TO_CONNECTION_RULE___REGISTER_OBJECTS_FWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 8;

	/**
	 * The operation id for the '<em>Check Types FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSIMPLEX_CONNECTION_TO_CONNECTION_RULE___CHECK_TYPES_FWD__MATCH = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 9;

	/**
	 * The operation id for the '<em>Is Appropriate BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSIMPLEX_CONNECTION_TO_CONNECTION_RULE___IS_APPROPRIATE_BWD__MATCH_DEVICE_CONTAINER_DEVICE_CABLE = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 10;

	/**
	 * The operation id for the '<em>Perform BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSIMPLEX_CONNECTION_TO_CONNECTION_RULE___PERFORM_BWD__ISAPPLICABLEMATCH = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 11;

	/**
	 * The operation id for the '<em>Is Applicable BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSIMPLEX_CONNECTION_TO_CONNECTION_RULE___IS_APPLICABLE_BWD__MATCH = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 12;

	/**
	 * The operation id for the '<em>Register Objects To Match BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSIMPLEX_CONNECTION_TO_CONNECTION_RULE___REGISTER_OBJECTS_TO_MATCH_BWD__MATCH_DEVICE_CONTAINER_DEVICE_CABLE = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 13;

	/**
	 * The operation id for the '<em>Is Appropriate solve Csp BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSIMPLEX_CONNECTION_TO_CONNECTION_RULE___IS_APPROPRIATE_SOLVE_CSP_BWD__MATCH_DEVICE_CONTAINER_DEVICE_CABLE = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 14;

	/**
	 * The operation id for the '<em>Is Appropriate check Csp BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSIMPLEX_CONNECTION_TO_CONNECTION_RULE___IS_APPROPRIATE_CHECK_CSP_BWD__CSP = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 15;

	/**
	 * The operation id for the '<em>Is Applicable solve Csp BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSIMPLEX_CONNECTION_TO_CONNECTION_RULE___IS_APPLICABLE_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_XCONTAINER_XDEVICETODEVICE_DEVICE_XDEVICE_CONNECTIONS_CONNECTIONS_CABLEATTRIBUTES_CONTAINER_XDEVICE_DEVICE_CABLE_XDEVICETODEVICE_XCABLE_XCABLETOCABLE = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 16;

	/**
	 * The operation id for the '<em>Is Applicable check Csp BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSIMPLEX_CONNECTION_TO_CONNECTION_RULE___IS_APPLICABLE_CHECK_CSP_BWD__CSP = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 17;

	/**
	 * The operation id for the '<em>Register Objects BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSIMPLEX_CONNECTION_TO_CONNECTION_RULE___REGISTER_OBJECTS_BWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 18;

	/**
	 * The operation id for the '<em>Check Types BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSIMPLEX_CONNECTION_TO_CONNECTION_RULE___CHECK_TYPES_BWD__MATCH = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 19;

	/**
	 * The operation id for the '<em>Is Appropriate BWD EMoflon Edge 11</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSIMPLEX_CONNECTION_TO_CONNECTION_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_11__EMOFLONEDGE = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 20;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 7</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSIMPLEX_CONNECTION_TO_CONNECTION_RULE___IS_APPROPRIATE_FWD_EMOFLON_EDGE_7__EMOFLONEDGE = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 21;

	/**
	 * The operation id for the '<em>Check Attributes FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSIMPLEX_CONNECTION_TO_CONNECTION_RULE___CHECK_ATTRIBUTES_FWD__TRIPLEMATCH = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 22;

	/**
	 * The operation id for the '<em>Check Attributes BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSIMPLEX_CONNECTION_TO_CONNECTION_RULE___CHECK_ATTRIBUTES_BWD__TRIPLEMATCH = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 23;

	/**
	 * The operation id for the '<em>Is Applicable CC</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSIMPLEX_CONNECTION_TO_CONNECTION_RULE___IS_APPLICABLE_CC__MATCH_MATCH = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 24;

	/**
	 * The operation id for the '<em>Is Applicable solve Csp CC</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSIMPLEX_CONNECTION_TO_CONNECTION_RULE___IS_APPLICABLE_SOLVE_CSP_CC__XCONTAINER_DEVICE_XDEVICE_CONNECTIONS_CONNECTIONS_CABLEATTRIBUTES_CONTAINER_XDEVICE_DEVICE_CABLE_XCABLE_MATCH_MATCH = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 25;

	/**
	 * The operation id for the '<em>Is Applicable check Csp CC</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSIMPLEX_CONNECTION_TO_CONNECTION_RULE___IS_APPLICABLE_CHECK_CSP_CC__CSP = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 26;

	/**
	 * The operation id for the '<em>Check DEC FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSIMPLEX_CONNECTION_TO_CONNECTION_RULE___CHECK_DEC_FWD__XCONTAINER_XDEVICE_CONNECTIONS_CONNECTIONS_CABLEATTRIBUTES_XDEVICE_XCABLE = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 27;

	/**
	 * The operation id for the '<em>Check DEC BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSIMPLEX_CONNECTION_TO_CONNECTION_RULE___CHECK_DEC_BWD__DEVICE_CONTAINER_DEVICE_CABLE = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 28;

	/**
	 * The operation id for the '<em>Generate Model</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSIMPLEX_CONNECTION_TO_CONNECTION_RULE___GENERATE_MODEL__RULEENTRYCONTAINER_XCABLETOCABLE = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 29;

	/**
	 * The operation id for the '<em>Generate Model solve Csp BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSIMPLEX_CONNECTION_TO_CONNECTION_RULE___GENERATE_MODEL_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_XCONTAINER_XDEVICETODEVICE_DEVICE_XDEVICE_CONNECTIONS_CONNECTIONS_CABLEATTRIBUTES_CONTAINER_XDEVICE_DEVICE_CABLE_XDEVICETODEVICE_XCABLE_XCABLETOCABLE_MODELGENERATORRULERESULT = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 30;

	/**
	 * The operation id for the '<em>Generate Model check Csp BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSIMPLEX_CONNECTION_TO_CONNECTION_RULE___GENERATE_MODEL_CHECK_CSP_BWD__CSP = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 31;

	/**
	 * The number of operations of the '<em>XSimplex Connection To Connection Rule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSIMPLEX_CONNECTION_TO_CONNECTION_RULE_OPERATION_COUNT = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 32;

	/**
	 * The meta object id for the '{@link ImplementationTransformator.Rules.impl.XDuplexConnectionToConnectionRuleImpl <em>XDuplex Connection To Connection Rule</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ImplementationTransformator.Rules.impl.XDuplexConnectionToConnectionRuleImpl
	 * @see ImplementationTransformator.Rules.impl.RulesPackageImpl#getXDuplexConnectionToConnectionRule()
	 * @generated
	 */
	int XDUPLEX_CONNECTION_TO_CONNECTION_RULE = 5;

	/**
	 * The number of structural features of the '<em>XDuplex Connection To Connection Rule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XDUPLEX_CONNECTION_TO_CONNECTION_RULE_FEATURE_COUNT = RuntimePackage.ABSTRACT_RULE_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Is Appropriate FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XDUPLEX_CONNECTION_TO_CONNECTION_RULE___IS_APPROPRIATE_FWD__MATCH_XCONTAINER_XDEVICE_CONNECTIONS_XDEVICE_XCABLE_CONNECTIONS_CABLEATTRIBUTES = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 0;

	/**
	 * The operation id for the '<em>Perform FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XDUPLEX_CONNECTION_TO_CONNECTION_RULE___PERFORM_FWD__ISAPPLICABLEMATCH = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 1;

	/**
	 * The operation id for the '<em>Is Applicable FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XDUPLEX_CONNECTION_TO_CONNECTION_RULE___IS_APPLICABLE_FWD__MATCH = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 2;

	/**
	 * The operation id for the '<em>Register Objects To Match FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XDUPLEX_CONNECTION_TO_CONNECTION_RULE___REGISTER_OBJECTS_TO_MATCH_FWD__MATCH_XCONTAINER_XDEVICE_CONNECTIONS_XDEVICE_XCABLE_CONNECTIONS_CABLEATTRIBUTES = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 3;

	/**
	 * The operation id for the '<em>Is Appropriate solve Csp FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XDUPLEX_CONNECTION_TO_CONNECTION_RULE___IS_APPROPRIATE_SOLVE_CSP_FWD__MATCH_XCONTAINER_XDEVICE_CONNECTIONS_XDEVICE_XCABLE_CONNECTIONS_CABLEATTRIBUTES = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 4;

	/**
	 * The operation id for the '<em>Is Appropriate check Csp FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XDUPLEX_CONNECTION_TO_CONNECTION_RULE___IS_APPROPRIATE_CHECK_CSP_FWD__CSP = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 5;

	/**
	 * The operation id for the '<em>Is Applicable solve Csp FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XDUPLEX_CONNECTION_TO_CONNECTION_RULE___IS_APPLICABLE_SOLVE_CSP_FWD__ISAPPLICABLEMATCH_XDEVICETODEVICE_DEVICE_XCONTAINER_CONTAINER_XDEVICE_CONNECTIONS_XCABLETOCABLE_XDEVICE_DEVICE_XCABLETOCABLE_XCABLE_XDEVICETODEVICE_CONNECTIONS_CABLE_CABLE_CABLEATTRIBUTES = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 6;

	/**
	 * The operation id for the '<em>Is Applicable check Csp FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XDUPLEX_CONNECTION_TO_CONNECTION_RULE___IS_APPLICABLE_CHECK_CSP_FWD__CSP = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 7;

	/**
	 * The operation id for the '<em>Register Objects FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XDUPLEX_CONNECTION_TO_CONNECTION_RULE___REGISTER_OBJECTS_FWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 8;

	/**
	 * The operation id for the '<em>Check Types FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XDUPLEX_CONNECTION_TO_CONNECTION_RULE___CHECK_TYPES_FWD__MATCH = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 9;

	/**
	 * The operation id for the '<em>Is Appropriate BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XDUPLEX_CONNECTION_TO_CONNECTION_RULE___IS_APPROPRIATE_BWD__MATCH_DEVICE_CONTAINER_DEVICE_CABLE_CABLE = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 10;

	/**
	 * The operation id for the '<em>Perform BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XDUPLEX_CONNECTION_TO_CONNECTION_RULE___PERFORM_BWD__ISAPPLICABLEMATCH = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 11;

	/**
	 * The operation id for the '<em>Is Applicable BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XDUPLEX_CONNECTION_TO_CONNECTION_RULE___IS_APPLICABLE_BWD__MATCH = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 12;

	/**
	 * The operation id for the '<em>Register Objects To Match BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XDUPLEX_CONNECTION_TO_CONNECTION_RULE___REGISTER_OBJECTS_TO_MATCH_BWD__MATCH_DEVICE_CONTAINER_DEVICE_CABLE_CABLE = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 13;

	/**
	 * The operation id for the '<em>Is Appropriate solve Csp BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XDUPLEX_CONNECTION_TO_CONNECTION_RULE___IS_APPROPRIATE_SOLVE_CSP_BWD__MATCH_DEVICE_CONTAINER_DEVICE_CABLE_CABLE = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 14;

	/**
	 * The operation id for the '<em>Is Appropriate check Csp BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XDUPLEX_CONNECTION_TO_CONNECTION_RULE___IS_APPROPRIATE_CHECK_CSP_BWD__CSP = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 15;

	/**
	 * The operation id for the '<em>Is Applicable solve Csp BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XDUPLEX_CONNECTION_TO_CONNECTION_RULE___IS_APPLICABLE_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_XDEVICETODEVICE_DEVICE_XCONTAINER_CONTAINER_XDEVICE_CONNECTIONS_XCABLETOCABLE_XDEVICE_DEVICE_XCABLETOCABLE_XCABLE_XDEVICETODEVICE_CONNECTIONS_CABLE_CABLE_CABLEATTRIBUTES = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 16;

	/**
	 * The operation id for the '<em>Is Applicable check Csp BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XDUPLEX_CONNECTION_TO_CONNECTION_RULE___IS_APPLICABLE_CHECK_CSP_BWD__CSP = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 17;

	/**
	 * The operation id for the '<em>Register Objects BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XDUPLEX_CONNECTION_TO_CONNECTION_RULE___REGISTER_OBJECTS_BWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 18;

	/**
	 * The operation id for the '<em>Check Types BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XDUPLEX_CONNECTION_TO_CONNECTION_RULE___CHECK_TYPES_BWD__MATCH = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 19;

	/**
	 * The operation id for the '<em>Is Appropriate BWD EMoflon Edge 12</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XDUPLEX_CONNECTION_TO_CONNECTION_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_12__EMOFLONEDGE = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 20;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 8</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XDUPLEX_CONNECTION_TO_CONNECTION_RULE___IS_APPROPRIATE_FWD_EMOFLON_EDGE_8__EMOFLONEDGE = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 21;

	/**
	 * The operation id for the '<em>Check Attributes FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XDUPLEX_CONNECTION_TO_CONNECTION_RULE___CHECK_ATTRIBUTES_FWD__TRIPLEMATCH = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 22;

	/**
	 * The operation id for the '<em>Check Attributes BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XDUPLEX_CONNECTION_TO_CONNECTION_RULE___CHECK_ATTRIBUTES_BWD__TRIPLEMATCH = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 23;

	/**
	 * The operation id for the '<em>Is Applicable CC</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XDUPLEX_CONNECTION_TO_CONNECTION_RULE___IS_APPLICABLE_CC__MATCH_MATCH = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 24;

	/**
	 * The operation id for the '<em>Is Applicable solve Csp CC</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XDUPLEX_CONNECTION_TO_CONNECTION_RULE___IS_APPLICABLE_SOLVE_CSP_CC__DEVICE_XCONTAINER_CONTAINER_XDEVICE_CONNECTIONS_XDEVICE_DEVICE_XCABLE_CONNECTIONS_CABLE_CABLE_CABLEATTRIBUTES_MATCH_MATCH = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 25;

	/**
	 * The operation id for the '<em>Is Applicable check Csp CC</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XDUPLEX_CONNECTION_TO_CONNECTION_RULE___IS_APPLICABLE_CHECK_CSP_CC__CSP = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 26;

	/**
	 * The operation id for the '<em>Check DEC FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XDUPLEX_CONNECTION_TO_CONNECTION_RULE___CHECK_DEC_FWD__XCONTAINER_XDEVICE_CONNECTIONS_XDEVICE_XCABLE_CONNECTIONS_CABLEATTRIBUTES = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 27;

	/**
	 * The operation id for the '<em>Check DEC BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XDUPLEX_CONNECTION_TO_CONNECTION_RULE___CHECK_DEC_BWD__DEVICE_CONTAINER_DEVICE_CABLE_CABLE = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 28;

	/**
	 * The operation id for the '<em>Generate Model</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XDUPLEX_CONNECTION_TO_CONNECTION_RULE___GENERATE_MODEL__RULEENTRYCONTAINER_XDEVICETODEVICE = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 29;

	/**
	 * The operation id for the '<em>Generate Model solve Csp BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XDUPLEX_CONNECTION_TO_CONNECTION_RULE___GENERATE_MODEL_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_XDEVICETODEVICE_DEVICE_XCONTAINER_CONTAINER_XDEVICE_CONNECTIONS_XCABLETOCABLE_XDEVICE_DEVICE_XCABLETOCABLE_XCABLE_XDEVICETODEVICE_CONNECTIONS_CABLE_CABLE_CABLEATTRIBUTES_MODELGENERATORRULERESULT = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 30;

	/**
	 * The operation id for the '<em>Generate Model check Csp BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XDUPLEX_CONNECTION_TO_CONNECTION_RULE___GENERATE_MODEL_CHECK_CSP_BWD__CSP = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 31;

	/**
	 * The number of operations of the '<em>XDuplex Connection To Connection Rule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XDUPLEX_CONNECTION_TO_CONNECTION_RULE_OPERATION_COUNT = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 32;

	/**
	 * The meta object id for the '{@link ImplementationTransformator.Rules.impl.XComputerToComputerImpl <em>XComputer To Computer</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ImplementationTransformator.Rules.impl.XComputerToComputerImpl
	 * @see ImplementationTransformator.Rules.impl.RulesPackageImpl#getXComputerToComputer()
	 * @generated
	 */
	int XCOMPUTER_TO_COMPUTER = 6;

	/**
	 * The number of structural features of the '<em>XComputer To Computer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XCOMPUTER_TO_COMPUTER_FEATURE_COUNT = RuntimePackage.ABSTRACT_RULE_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Is Appropriate FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XCOMPUTER_TO_COMPUTER___IS_APPROPRIATE_FWD__MATCH_XCOMPUTER_XCONTAINER_CONNECTIONS = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 0;

	/**
	 * The operation id for the '<em>Perform FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XCOMPUTER_TO_COMPUTER___PERFORM_FWD__ISAPPLICABLEMATCH = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Is Applicable FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XCOMPUTER_TO_COMPUTER___IS_APPLICABLE_FWD__MATCH = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 2;

	/**
	 * The operation id for the '<em>Register Objects To Match FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XCOMPUTER_TO_COMPUTER___REGISTER_OBJECTS_TO_MATCH_FWD__MATCH_XCOMPUTER_XCONTAINER_CONNECTIONS = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 3;

	/**
	 * The operation id for the '<em>Is Appropriate solve Csp FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XCOMPUTER_TO_COMPUTER___IS_APPROPRIATE_SOLVE_CSP_FWD__MATCH_XCOMPUTER_XCONTAINER_CONNECTIONS = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 4;

	/**
	 * The operation id for the '<em>Is Appropriate check Csp FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XCOMPUTER_TO_COMPUTER___IS_APPROPRIATE_CHECK_CSP_FWD__CSP = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 5;

	/**
	 * The operation id for the '<em>Is Applicable solve Csp FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XCOMPUTER_TO_COMPUTER___IS_APPLICABLE_SOLVE_CSP_FWD__ISAPPLICABLEMATCH_CONTAINER_XCONTAINERTOCONTAINER_XCOMPUTER_XCONTAINER_CONNECTIONS = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 6;

	/**
	 * The operation id for the '<em>Is Applicable check Csp FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XCOMPUTER_TO_COMPUTER___IS_APPLICABLE_CHECK_CSP_FWD__CSP = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 7;

	/**
	 * The operation id for the '<em>Register Objects FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XCOMPUTER_TO_COMPUTER___REGISTER_OBJECTS_FWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 8;

	/**
	 * The operation id for the '<em>Check Types FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XCOMPUTER_TO_COMPUTER___CHECK_TYPES_FWD__MATCH = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 9;

	/**
	 * The operation id for the '<em>Is Appropriate BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XCOMPUTER_TO_COMPUTER___IS_APPROPRIATE_BWD__MATCH_CONTAINER_COMPUTER = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 10;

	/**
	 * The operation id for the '<em>Perform BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XCOMPUTER_TO_COMPUTER___PERFORM_BWD__ISAPPLICABLEMATCH = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 11;

	/**
	 * The operation id for the '<em>Is Applicable BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XCOMPUTER_TO_COMPUTER___IS_APPLICABLE_BWD__MATCH = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 12;

	/**
	 * The operation id for the '<em>Register Objects To Match BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XCOMPUTER_TO_COMPUTER___REGISTER_OBJECTS_TO_MATCH_BWD__MATCH_CONTAINER_COMPUTER = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 13;

	/**
	 * The operation id for the '<em>Is Appropriate solve Csp BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XCOMPUTER_TO_COMPUTER___IS_APPROPRIATE_SOLVE_CSP_BWD__MATCH_CONTAINER_COMPUTER = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 14;

	/**
	 * The operation id for the '<em>Is Appropriate check Csp BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XCOMPUTER_TO_COMPUTER___IS_APPROPRIATE_CHECK_CSP_BWD__CSP = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 15;

	/**
	 * The operation id for the '<em>Is Applicable solve Csp BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XCOMPUTER_TO_COMPUTER___IS_APPLICABLE_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_CONTAINER_XCONTAINERTOCONTAINER_XCONTAINER_COMPUTER = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 16;

	/**
	 * The operation id for the '<em>Is Applicable check Csp BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XCOMPUTER_TO_COMPUTER___IS_APPLICABLE_CHECK_CSP_BWD__CSP = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 17;

	/**
	 * The operation id for the '<em>Register Objects BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XCOMPUTER_TO_COMPUTER___REGISTER_OBJECTS_BWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 18;

	/**
	 * The operation id for the '<em>Check Types BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XCOMPUTER_TO_COMPUTER___CHECK_TYPES_BWD__MATCH = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 19;

	/**
	 * The operation id for the '<em>Is Appropriate BWD EMoflon Edge 13</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XCOMPUTER_TO_COMPUTER___IS_APPROPRIATE_BWD_EMOFLON_EDGE_13__EMOFLONEDGE = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 20;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 9</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XCOMPUTER_TO_COMPUTER___IS_APPROPRIATE_FWD_EMOFLON_EDGE_9__EMOFLONEDGE = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 21;

	/**
	 * The operation id for the '<em>Check Attributes FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XCOMPUTER_TO_COMPUTER___CHECK_ATTRIBUTES_FWD__TRIPLEMATCH = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 22;

	/**
	 * The operation id for the '<em>Check Attributes BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XCOMPUTER_TO_COMPUTER___CHECK_ATTRIBUTES_BWD__TRIPLEMATCH = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 23;

	/**
	 * The operation id for the '<em>Is Applicable CC</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XCOMPUTER_TO_COMPUTER___IS_APPLICABLE_CC__MATCH_MATCH = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 24;

	/**
	 * The operation id for the '<em>Is Applicable solve Csp CC</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XCOMPUTER_TO_COMPUTER___IS_APPLICABLE_SOLVE_CSP_CC__CONTAINER_XCOMPUTER_XCONTAINER_CONNECTIONS_COMPUTER_MATCH_MATCH = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 25;

	/**
	 * The operation id for the '<em>Is Applicable check Csp CC</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XCOMPUTER_TO_COMPUTER___IS_APPLICABLE_CHECK_CSP_CC__CSP = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 26;

	/**
	 * The operation id for the '<em>Check DEC FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XCOMPUTER_TO_COMPUTER___CHECK_DEC_FWD__XCOMPUTER_XCONTAINER_CONNECTIONS = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 27;

	/**
	 * The operation id for the '<em>Check DEC BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XCOMPUTER_TO_COMPUTER___CHECK_DEC_BWD__CONTAINER_COMPUTER = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 28;

	/**
	 * The operation id for the '<em>Generate Model</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XCOMPUTER_TO_COMPUTER___GENERATE_MODEL__RULEENTRYCONTAINER_XCONTAINERTOCONTAINER = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 29;

	/**
	 * The operation id for the '<em>Generate Model solve Csp BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XCOMPUTER_TO_COMPUTER___GENERATE_MODEL_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_CONTAINER_XCONTAINERTOCONTAINER_XCONTAINER_MODELGENERATORRULERESULT = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 30;

	/**
	 * The operation id for the '<em>Generate Model check Csp BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XCOMPUTER_TO_COMPUTER___GENERATE_MODEL_CHECK_CSP_BWD__CSP = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 31;

	/**
	 * The number of operations of the '<em>XComputer To Computer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XCOMPUTER_TO_COMPUTER_OPERATION_COUNT = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 32;

	/**
	 * The meta object id for the '{@link ImplementationTransformator.Rules.impl.XRouterToRouterRuleImpl <em>XRouter To Router Rule</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ImplementationTransformator.Rules.impl.XRouterToRouterRuleImpl
	 * @see ImplementationTransformator.Rules.impl.RulesPackageImpl#getXRouterToRouterRule()
	 * @generated
	 */
	int XROUTER_TO_ROUTER_RULE = 7;

	/**
	 * The number of structural features of the '<em>XRouter To Router Rule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XROUTER_TO_ROUTER_RULE_FEATURE_COUNT = RuntimePackage.ABSTRACT_RULE_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Is Appropriate FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XROUTER_TO_ROUTER_RULE___IS_APPROPRIATE_FWD__MATCH_XROUTER_XCONTAINER_CONNECTIONS = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 0;

	/**
	 * The operation id for the '<em>Perform FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XROUTER_TO_ROUTER_RULE___PERFORM_FWD__ISAPPLICABLEMATCH = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Is Applicable FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XROUTER_TO_ROUTER_RULE___IS_APPLICABLE_FWD__MATCH = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 2;

	/**
	 * The operation id for the '<em>Register Objects To Match FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XROUTER_TO_ROUTER_RULE___REGISTER_OBJECTS_TO_MATCH_FWD__MATCH_XROUTER_XCONTAINER_CONNECTIONS = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 3;

	/**
	 * The operation id for the '<em>Is Appropriate solve Csp FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XROUTER_TO_ROUTER_RULE___IS_APPROPRIATE_SOLVE_CSP_FWD__MATCH_XROUTER_XCONTAINER_CONNECTIONS = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 4;

	/**
	 * The operation id for the '<em>Is Appropriate check Csp FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XROUTER_TO_ROUTER_RULE___IS_APPROPRIATE_CHECK_CSP_FWD__CSP = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 5;

	/**
	 * The operation id for the '<em>Is Applicable solve Csp FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XROUTER_TO_ROUTER_RULE___IS_APPLICABLE_SOLVE_CSP_FWD__ISAPPLICABLEMATCH_CONTAINER_XCONTAINERTOCONTAINER_XROUTER_XCONTAINER_CONNECTIONS = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 6;

	/**
	 * The operation id for the '<em>Is Applicable check Csp FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XROUTER_TO_ROUTER_RULE___IS_APPLICABLE_CHECK_CSP_FWD__CSP = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 7;

	/**
	 * The operation id for the '<em>Register Objects FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XROUTER_TO_ROUTER_RULE___REGISTER_OBJECTS_FWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 8;

	/**
	 * The operation id for the '<em>Check Types FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XROUTER_TO_ROUTER_RULE___CHECK_TYPES_FWD__MATCH = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 9;

	/**
	 * The operation id for the '<em>Is Appropriate BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XROUTER_TO_ROUTER_RULE___IS_APPROPRIATE_BWD__MATCH_CONTAINER_ROUTER = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 10;

	/**
	 * The operation id for the '<em>Perform BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XROUTER_TO_ROUTER_RULE___PERFORM_BWD__ISAPPLICABLEMATCH = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 11;

	/**
	 * The operation id for the '<em>Is Applicable BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XROUTER_TO_ROUTER_RULE___IS_APPLICABLE_BWD__MATCH = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 12;

	/**
	 * The operation id for the '<em>Register Objects To Match BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XROUTER_TO_ROUTER_RULE___REGISTER_OBJECTS_TO_MATCH_BWD__MATCH_CONTAINER_ROUTER = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 13;

	/**
	 * The operation id for the '<em>Is Appropriate solve Csp BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XROUTER_TO_ROUTER_RULE___IS_APPROPRIATE_SOLVE_CSP_BWD__MATCH_CONTAINER_ROUTER = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 14;

	/**
	 * The operation id for the '<em>Is Appropriate check Csp BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XROUTER_TO_ROUTER_RULE___IS_APPROPRIATE_CHECK_CSP_BWD__CSP = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 15;

	/**
	 * The operation id for the '<em>Is Applicable solve Csp BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XROUTER_TO_ROUTER_RULE___IS_APPLICABLE_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_CONTAINER_XCONTAINERTOCONTAINER_XCONTAINER_ROUTER = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 16;

	/**
	 * The operation id for the '<em>Is Applicable check Csp BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XROUTER_TO_ROUTER_RULE___IS_APPLICABLE_CHECK_CSP_BWD__CSP = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 17;

	/**
	 * The operation id for the '<em>Register Objects BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XROUTER_TO_ROUTER_RULE___REGISTER_OBJECTS_BWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 18;

	/**
	 * The operation id for the '<em>Check Types BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XROUTER_TO_ROUTER_RULE___CHECK_TYPES_BWD__MATCH = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 19;

	/**
	 * The operation id for the '<em>Is Appropriate BWD EMoflon Edge 14</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XROUTER_TO_ROUTER_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_14__EMOFLONEDGE = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 20;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 10</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XROUTER_TO_ROUTER_RULE___IS_APPROPRIATE_FWD_EMOFLON_EDGE_10__EMOFLONEDGE = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 21;

	/**
	 * The operation id for the '<em>Check Attributes FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XROUTER_TO_ROUTER_RULE___CHECK_ATTRIBUTES_FWD__TRIPLEMATCH = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 22;

	/**
	 * The operation id for the '<em>Check Attributes BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XROUTER_TO_ROUTER_RULE___CHECK_ATTRIBUTES_BWD__TRIPLEMATCH = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 23;

	/**
	 * The operation id for the '<em>Is Applicable CC</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XROUTER_TO_ROUTER_RULE___IS_APPLICABLE_CC__MATCH_MATCH = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 24;

	/**
	 * The operation id for the '<em>Is Applicable solve Csp CC</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XROUTER_TO_ROUTER_RULE___IS_APPLICABLE_SOLVE_CSP_CC__CONTAINER_XROUTER_XCONTAINER_CONNECTIONS_ROUTER_MATCH_MATCH = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 25;

	/**
	 * The operation id for the '<em>Is Applicable check Csp CC</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XROUTER_TO_ROUTER_RULE___IS_APPLICABLE_CHECK_CSP_CC__CSP = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 26;

	/**
	 * The operation id for the '<em>Check DEC FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XROUTER_TO_ROUTER_RULE___CHECK_DEC_FWD__XROUTER_XCONTAINER_CONNECTIONS = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 27;

	/**
	 * The operation id for the '<em>Check DEC BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XROUTER_TO_ROUTER_RULE___CHECK_DEC_BWD__CONTAINER_ROUTER = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 28;

	/**
	 * The operation id for the '<em>Generate Model</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XROUTER_TO_ROUTER_RULE___GENERATE_MODEL__RULEENTRYCONTAINER_XCONTAINERTOCONTAINER = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 29;

	/**
	 * The operation id for the '<em>Generate Model solve Csp BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XROUTER_TO_ROUTER_RULE___GENERATE_MODEL_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_CONTAINER_XCONTAINERTOCONTAINER_XCONTAINER_MODELGENERATORRULERESULT = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 30;

	/**
	 * The operation id for the '<em>Generate Model check Csp BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XROUTER_TO_ROUTER_RULE___GENERATE_MODEL_CHECK_CSP_BWD__CSP = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 31;

	/**
	 * The number of operations of the '<em>XRouter To Router Rule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XROUTER_TO_ROUTER_RULE_OPERATION_COUNT = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 32;

	/**
	 * The meta object id for the '{@link ImplementationTransformator.Rules.impl.XSimplexCopperCableRuleImpl <em>XSimplex Copper Cable Rule</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ImplementationTransformator.Rules.impl.XSimplexCopperCableRuleImpl
	 * @see ImplementationTransformator.Rules.impl.RulesPackageImpl#getXSimplexCopperCableRule()
	 * @generated
	 */
	int XSIMPLEX_COPPER_CABLE_RULE = 8;

	/**
	 * The number of structural features of the '<em>XSimplex Copper Cable Rule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSIMPLEX_COPPER_CABLE_RULE_FEATURE_COUNT = RuntimePackage.ABSTRACT_RULE_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Is Appropriate FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSIMPLEX_COPPER_CABLE_RULE___IS_APPROPRIATE_FWD__MATCH_CABLEATTRIBUTES_XDEVICE_XCOPPERCABLE_XCONTAINER = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 0;

	/**
	 * The operation id for the '<em>Perform FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSIMPLEX_COPPER_CABLE_RULE___PERFORM_FWD__ISAPPLICABLEMATCH = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Is Applicable FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSIMPLEX_COPPER_CABLE_RULE___IS_APPLICABLE_FWD__MATCH = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 2;

	/**
	 * The operation id for the '<em>Register Objects To Match FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSIMPLEX_COPPER_CABLE_RULE___REGISTER_OBJECTS_TO_MATCH_FWD__MATCH_CABLEATTRIBUTES_XDEVICE_XCOPPERCABLE_XCONTAINER = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 3;

	/**
	 * The operation id for the '<em>Is Appropriate solve Csp FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSIMPLEX_COPPER_CABLE_RULE___IS_APPROPRIATE_SOLVE_CSP_FWD__MATCH_CABLEATTRIBUTES_XDEVICE_XCOPPERCABLE_XCONTAINER = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 4;

	/**
	 * The operation id for the '<em>Is Appropriate check Csp FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSIMPLEX_COPPER_CABLE_RULE___IS_APPROPRIATE_CHECK_CSP_FWD__CSP = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 5;

	/**
	 * The operation id for the '<em>Is Applicable solve Csp FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSIMPLEX_COPPER_CABLE_RULE___IS_APPLICABLE_SOLVE_CSP_FWD__ISAPPLICABLEMATCH_CONTAINER_CABLEATTRIBUTES_XDEVICE_XCOPPERCABLE_XCONTAINER_DEVICE_XDEVICETODEVICE = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 6;

	/**
	 * The operation id for the '<em>Is Applicable check Csp FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSIMPLEX_COPPER_CABLE_RULE___IS_APPLICABLE_CHECK_CSP_FWD__CSP = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 7;

	/**
	 * The operation id for the '<em>Register Objects FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSIMPLEX_COPPER_CABLE_RULE___REGISTER_OBJECTS_FWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 8;

	/**
	 * The operation id for the '<em>Check Types FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSIMPLEX_COPPER_CABLE_RULE___CHECK_TYPES_FWD__MATCH = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 9;

	/**
	 * The operation id for the '<em>Is Appropriate BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSIMPLEX_COPPER_CABLE_RULE___IS_APPROPRIATE_BWD__MATCH_CONTAINER_COPPERCABLE_DEVICE = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 10;

	/**
	 * The operation id for the '<em>Perform BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSIMPLEX_COPPER_CABLE_RULE___PERFORM_BWD__ISAPPLICABLEMATCH = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 11;

	/**
	 * The operation id for the '<em>Is Applicable BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSIMPLEX_COPPER_CABLE_RULE___IS_APPLICABLE_BWD__MATCH = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 12;

	/**
	 * The operation id for the '<em>Register Objects To Match BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSIMPLEX_COPPER_CABLE_RULE___REGISTER_OBJECTS_TO_MATCH_BWD__MATCH_CONTAINER_COPPERCABLE_DEVICE = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 13;

	/**
	 * The operation id for the '<em>Is Appropriate solve Csp BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSIMPLEX_COPPER_CABLE_RULE___IS_APPROPRIATE_SOLVE_CSP_BWD__MATCH_CONTAINER_COPPERCABLE_DEVICE = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 14;

	/**
	 * The operation id for the '<em>Is Appropriate check Csp BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSIMPLEX_COPPER_CABLE_RULE___IS_APPROPRIATE_CHECK_CSP_BWD__CSP = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 15;

	/**
	 * The operation id for the '<em>Is Applicable solve Csp BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSIMPLEX_COPPER_CABLE_RULE___IS_APPLICABLE_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_CONTAINER_XDEVICE_XCONTAINER_COPPERCABLE_DEVICE_XDEVICETODEVICE = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 16;

	/**
	 * The operation id for the '<em>Is Applicable check Csp BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSIMPLEX_COPPER_CABLE_RULE___IS_APPLICABLE_CHECK_CSP_BWD__CSP = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 17;

	/**
	 * The operation id for the '<em>Register Objects BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSIMPLEX_COPPER_CABLE_RULE___REGISTER_OBJECTS_BWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 18;

	/**
	 * The operation id for the '<em>Check Types BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSIMPLEX_COPPER_CABLE_RULE___CHECK_TYPES_BWD__MATCH = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 19;

	/**
	 * The operation id for the '<em>Is Appropriate BWD EMoflon Edge 15</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSIMPLEX_COPPER_CABLE_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_15__EMOFLONEDGE = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 20;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 11</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSIMPLEX_COPPER_CABLE_RULE___IS_APPROPRIATE_FWD_EMOFLON_EDGE_11__EMOFLONEDGE = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 21;

	/**
	 * The operation id for the '<em>Check Attributes FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSIMPLEX_COPPER_CABLE_RULE___CHECK_ATTRIBUTES_FWD__TRIPLEMATCH = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 22;

	/**
	 * The operation id for the '<em>Check Attributes BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSIMPLEX_COPPER_CABLE_RULE___CHECK_ATTRIBUTES_BWD__TRIPLEMATCH = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 23;

	/**
	 * The operation id for the '<em>Is Applicable CC</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSIMPLEX_COPPER_CABLE_RULE___IS_APPLICABLE_CC__MATCH_MATCH = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 24;

	/**
	 * The operation id for the '<em>Is Applicable solve Csp CC</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSIMPLEX_COPPER_CABLE_RULE___IS_APPLICABLE_SOLVE_CSP_CC__CONTAINER_CABLEATTRIBUTES_XDEVICE_XCOPPERCABLE_XCONTAINER_COPPERCABLE_DEVICE_MATCH_MATCH = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 25;

	/**
	 * The operation id for the '<em>Is Applicable check Csp CC</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSIMPLEX_COPPER_CABLE_RULE___IS_APPLICABLE_CHECK_CSP_CC__CSP = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 26;

	/**
	 * The operation id for the '<em>Check DEC FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSIMPLEX_COPPER_CABLE_RULE___CHECK_DEC_FWD__CABLEATTRIBUTES_XDEVICE_XCOPPERCABLE_XCONTAINER = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 27;

	/**
	 * The operation id for the '<em>Check DEC BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSIMPLEX_COPPER_CABLE_RULE___CHECK_DEC_BWD__CONTAINER_COPPERCABLE_DEVICE = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 28;

	/**
	 * The operation id for the '<em>Generate Model</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSIMPLEX_COPPER_CABLE_RULE___GENERATE_MODEL__RULEENTRYCONTAINER_XDEVICETODEVICE = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 29;

	/**
	 * The operation id for the '<em>Generate Model solve Csp BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSIMPLEX_COPPER_CABLE_RULE___GENERATE_MODEL_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_CONTAINER_XDEVICE_XCONTAINER_DEVICE_XDEVICETODEVICE_MODELGENERATORRULERESULT = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 30;

	/**
	 * The operation id for the '<em>Generate Model check Csp BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSIMPLEX_COPPER_CABLE_RULE___GENERATE_MODEL_CHECK_CSP_BWD__CSP = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 31;

	/**
	 * The number of operations of the '<em>XSimplex Copper Cable Rule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSIMPLEX_COPPER_CABLE_RULE_OPERATION_COUNT = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 32;

	/**
	 * The meta object id for the '{@link ImplementationTransformator.Rules.impl.XSimplexGlassFiberCableRuleImpl <em>XSimplex Glass Fiber Cable Rule</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ImplementationTransformator.Rules.impl.XSimplexGlassFiberCableRuleImpl
	 * @see ImplementationTransformator.Rules.impl.RulesPackageImpl#getXSimplexGlassFiberCableRule()
	 * @generated
	 */
	int XSIMPLEX_GLASS_FIBER_CABLE_RULE = 9;

	/**
	 * The number of structural features of the '<em>XSimplex Glass Fiber Cable Rule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSIMPLEX_GLASS_FIBER_CABLE_RULE_FEATURE_COUNT = RuntimePackage.ABSTRACT_RULE_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Is Appropriate FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSIMPLEX_GLASS_FIBER_CABLE_RULE___IS_APPROPRIATE_FWD__MATCH_CABLEATTRIBUTES_XDEVICE_XGLASSFIBERCABLE_XCONTAINER = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 0;

	/**
	 * The operation id for the '<em>Perform FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSIMPLEX_GLASS_FIBER_CABLE_RULE___PERFORM_FWD__ISAPPLICABLEMATCH = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 1;

	/**
	 * The operation id for the '<em>Is Applicable FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSIMPLEX_GLASS_FIBER_CABLE_RULE___IS_APPLICABLE_FWD__MATCH = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 2;

	/**
	 * The operation id for the '<em>Register Objects To Match FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSIMPLEX_GLASS_FIBER_CABLE_RULE___REGISTER_OBJECTS_TO_MATCH_FWD__MATCH_CABLEATTRIBUTES_XDEVICE_XGLASSFIBERCABLE_XCONTAINER = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 3;

	/**
	 * The operation id for the '<em>Is Appropriate solve Csp FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSIMPLEX_GLASS_FIBER_CABLE_RULE___IS_APPROPRIATE_SOLVE_CSP_FWD__MATCH_CABLEATTRIBUTES_XDEVICE_XGLASSFIBERCABLE_XCONTAINER = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 4;

	/**
	 * The operation id for the '<em>Is Appropriate check Csp FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSIMPLEX_GLASS_FIBER_CABLE_RULE___IS_APPROPRIATE_CHECK_CSP_FWD__CSP = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 5;

	/**
	 * The operation id for the '<em>Is Applicable solve Csp FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSIMPLEX_GLASS_FIBER_CABLE_RULE___IS_APPLICABLE_SOLVE_CSP_FWD__ISAPPLICABLEMATCH_CONTAINER_CABLEATTRIBUTES_XDEVICE_XGLASSFIBERCABLE_XCONTAINER_DEVICE_XDEVICETODEVICE = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 6;

	/**
	 * The operation id for the '<em>Is Applicable check Csp FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSIMPLEX_GLASS_FIBER_CABLE_RULE___IS_APPLICABLE_CHECK_CSP_FWD__CSP = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 7;

	/**
	 * The operation id for the '<em>Register Objects FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSIMPLEX_GLASS_FIBER_CABLE_RULE___REGISTER_OBJECTS_FWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 8;

	/**
	 * The operation id for the '<em>Check Types FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSIMPLEX_GLASS_FIBER_CABLE_RULE___CHECK_TYPES_FWD__MATCH = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 9;

	/**
	 * The operation id for the '<em>Is Appropriate BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSIMPLEX_GLASS_FIBER_CABLE_RULE___IS_APPROPRIATE_BWD__MATCH_CONTAINER_GLASSFIBERCABLE_DEVICE = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 10;

	/**
	 * The operation id for the '<em>Perform BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSIMPLEX_GLASS_FIBER_CABLE_RULE___PERFORM_BWD__ISAPPLICABLEMATCH = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 11;

	/**
	 * The operation id for the '<em>Is Applicable BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSIMPLEX_GLASS_FIBER_CABLE_RULE___IS_APPLICABLE_BWD__MATCH = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 12;

	/**
	 * The operation id for the '<em>Register Objects To Match BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSIMPLEX_GLASS_FIBER_CABLE_RULE___REGISTER_OBJECTS_TO_MATCH_BWD__MATCH_CONTAINER_GLASSFIBERCABLE_DEVICE = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 13;

	/**
	 * The operation id for the '<em>Is Appropriate solve Csp BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSIMPLEX_GLASS_FIBER_CABLE_RULE___IS_APPROPRIATE_SOLVE_CSP_BWD__MATCH_CONTAINER_GLASSFIBERCABLE_DEVICE = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 14;

	/**
	 * The operation id for the '<em>Is Appropriate check Csp BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSIMPLEX_GLASS_FIBER_CABLE_RULE___IS_APPROPRIATE_CHECK_CSP_BWD__CSP = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 15;

	/**
	 * The operation id for the '<em>Is Applicable solve Csp BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSIMPLEX_GLASS_FIBER_CABLE_RULE___IS_APPLICABLE_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_CONTAINER_XDEVICE_XCONTAINER_GLASSFIBERCABLE_DEVICE_XDEVICETODEVICE = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 16;

	/**
	 * The operation id for the '<em>Is Applicable check Csp BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSIMPLEX_GLASS_FIBER_CABLE_RULE___IS_APPLICABLE_CHECK_CSP_BWD__CSP = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 17;

	/**
	 * The operation id for the '<em>Register Objects BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSIMPLEX_GLASS_FIBER_CABLE_RULE___REGISTER_OBJECTS_BWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 18;

	/**
	 * The operation id for the '<em>Check Types BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSIMPLEX_GLASS_FIBER_CABLE_RULE___CHECK_TYPES_BWD__MATCH = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 19;

	/**
	 * The operation id for the '<em>Is Appropriate BWD EMoflon Edge 16</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSIMPLEX_GLASS_FIBER_CABLE_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_16__EMOFLONEDGE = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 20;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 12</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSIMPLEX_GLASS_FIBER_CABLE_RULE___IS_APPROPRIATE_FWD_EMOFLON_EDGE_12__EMOFLONEDGE = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 21;

	/**
	 * The operation id for the '<em>Check Attributes FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSIMPLEX_GLASS_FIBER_CABLE_RULE___CHECK_ATTRIBUTES_FWD__TRIPLEMATCH = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 22;

	/**
	 * The operation id for the '<em>Check Attributes BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSIMPLEX_GLASS_FIBER_CABLE_RULE___CHECK_ATTRIBUTES_BWD__TRIPLEMATCH = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 23;

	/**
	 * The operation id for the '<em>Is Applicable CC</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSIMPLEX_GLASS_FIBER_CABLE_RULE___IS_APPLICABLE_CC__MATCH_MATCH = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 24;

	/**
	 * The operation id for the '<em>Is Applicable solve Csp CC</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSIMPLEX_GLASS_FIBER_CABLE_RULE___IS_APPLICABLE_SOLVE_CSP_CC__CONTAINER_CABLEATTRIBUTES_XDEVICE_XGLASSFIBERCABLE_XCONTAINER_GLASSFIBERCABLE_DEVICE_MATCH_MATCH = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 25;

	/**
	 * The operation id for the '<em>Is Applicable check Csp CC</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSIMPLEX_GLASS_FIBER_CABLE_RULE___IS_APPLICABLE_CHECK_CSP_CC__CSP = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 26;

	/**
	 * The operation id for the '<em>Check DEC FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSIMPLEX_GLASS_FIBER_CABLE_RULE___CHECK_DEC_FWD__CABLEATTRIBUTES_XDEVICE_XGLASSFIBERCABLE_XCONTAINER = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 27;

	/**
	 * The operation id for the '<em>Check DEC BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSIMPLEX_GLASS_FIBER_CABLE_RULE___CHECK_DEC_BWD__CONTAINER_GLASSFIBERCABLE_DEVICE = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 28;

	/**
	 * The operation id for the '<em>Generate Model</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSIMPLEX_GLASS_FIBER_CABLE_RULE___GENERATE_MODEL__RULEENTRYCONTAINER_XDEVICETODEVICE = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 29;

	/**
	 * The operation id for the '<em>Generate Model solve Csp BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSIMPLEX_GLASS_FIBER_CABLE_RULE___GENERATE_MODEL_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_CONTAINER_XDEVICE_XCONTAINER_DEVICE_XDEVICETODEVICE_MODELGENERATORRULERESULT = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 30;

	/**
	 * The operation id for the '<em>Generate Model check Csp BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSIMPLEX_GLASS_FIBER_CABLE_RULE___GENERATE_MODEL_CHECK_CSP_BWD__CSP = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 31;

	/**
	 * The number of operations of the '<em>XSimplex Glass Fiber Cable Rule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSIMPLEX_GLASS_FIBER_CABLE_RULE_OPERATION_COUNT = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 32;

	/**
	 * The meta object id for the '{@link ImplementationTransformator.Rules.impl.XDuplexCopperCableRuleImpl <em>XDuplex Copper Cable Rule</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ImplementationTransformator.Rules.impl.XDuplexCopperCableRuleImpl
	 * @see ImplementationTransformator.Rules.impl.RulesPackageImpl#getXDuplexCopperCableRule()
	 * @generated
	 */
	int XDUPLEX_COPPER_CABLE_RULE = 10;

	/**
	 * The number of structural features of the '<em>XDuplex Copper Cable Rule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XDUPLEX_COPPER_CABLE_RULE_FEATURE_COUNT = RuntimePackage.ABSTRACT_RULE_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Is Appropriate FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XDUPLEX_COPPER_CABLE_RULE___IS_APPROPRIATE_FWD__MATCH_CABLEATTRIBUTES_XDEVICE_XCOPPERCABLE_XCONTAINER = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 0;

	/**
	 * The operation id for the '<em>Perform FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XDUPLEX_COPPER_CABLE_RULE___PERFORM_FWD__ISAPPLICABLEMATCH = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Is Applicable FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XDUPLEX_COPPER_CABLE_RULE___IS_APPLICABLE_FWD__MATCH = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 2;

	/**
	 * The operation id for the '<em>Register Objects To Match FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XDUPLEX_COPPER_CABLE_RULE___REGISTER_OBJECTS_TO_MATCH_FWD__MATCH_CABLEATTRIBUTES_XDEVICE_XCOPPERCABLE_XCONTAINER = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 3;

	/**
	 * The operation id for the '<em>Is Appropriate solve Csp FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XDUPLEX_COPPER_CABLE_RULE___IS_APPROPRIATE_SOLVE_CSP_FWD__MATCH_CABLEATTRIBUTES_XDEVICE_XCOPPERCABLE_XCONTAINER = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 4;

	/**
	 * The operation id for the '<em>Is Appropriate check Csp FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XDUPLEX_COPPER_CABLE_RULE___IS_APPROPRIATE_CHECK_CSP_FWD__CSP = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 5;

	/**
	 * The operation id for the '<em>Is Applicable solve Csp FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XDUPLEX_COPPER_CABLE_RULE___IS_APPLICABLE_SOLVE_CSP_FWD__ISAPPLICABLEMATCH_CONTAINER_CABLEATTRIBUTES_XDEVICE_XCOPPERCABLE_XCONTAINER_DEVICE_XDEVICETODEVICE = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 6;

	/**
	 * The operation id for the '<em>Is Applicable check Csp FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XDUPLEX_COPPER_CABLE_RULE___IS_APPLICABLE_CHECK_CSP_FWD__CSP = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 7;

	/**
	 * The operation id for the '<em>Register Objects FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XDUPLEX_COPPER_CABLE_RULE___REGISTER_OBJECTS_FWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 8;

	/**
	 * The operation id for the '<em>Check Types FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XDUPLEX_COPPER_CABLE_RULE___CHECK_TYPES_FWD__MATCH = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 9;

	/**
	 * The operation id for the '<em>Is Appropriate BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XDUPLEX_COPPER_CABLE_RULE___IS_APPROPRIATE_BWD__MATCH_COPPERCABLE_CONTAINER_GLASSFIBERCABLE_DEVICE = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 10;

	/**
	 * The operation id for the '<em>Perform BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XDUPLEX_COPPER_CABLE_RULE___PERFORM_BWD__ISAPPLICABLEMATCH = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 11;

	/**
	 * The operation id for the '<em>Is Applicable BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XDUPLEX_COPPER_CABLE_RULE___IS_APPLICABLE_BWD__MATCH = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 12;

	/**
	 * The operation id for the '<em>Register Objects To Match BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XDUPLEX_COPPER_CABLE_RULE___REGISTER_OBJECTS_TO_MATCH_BWD__MATCH_COPPERCABLE_CONTAINER_GLASSFIBERCABLE_DEVICE = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 13;

	/**
	 * The operation id for the '<em>Is Appropriate solve Csp BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XDUPLEX_COPPER_CABLE_RULE___IS_APPROPRIATE_SOLVE_CSP_BWD__MATCH_COPPERCABLE_CONTAINER_GLASSFIBERCABLE_DEVICE = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 14;

	/**
	 * The operation id for the '<em>Is Appropriate check Csp BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XDUPLEX_COPPER_CABLE_RULE___IS_APPROPRIATE_CHECK_CSP_BWD__CSP = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 15;

	/**
	 * The operation id for the '<em>Is Applicable solve Csp BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XDUPLEX_COPPER_CABLE_RULE___IS_APPLICABLE_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_COPPERCABLE_CONTAINER_GLASSFIBERCABLE_XDEVICE_XCONTAINER_DEVICE_XDEVICETODEVICE = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 16;

	/**
	 * The operation id for the '<em>Is Applicable check Csp BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XDUPLEX_COPPER_CABLE_RULE___IS_APPLICABLE_CHECK_CSP_BWD__CSP = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 17;

	/**
	 * The operation id for the '<em>Register Objects BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XDUPLEX_COPPER_CABLE_RULE___REGISTER_OBJECTS_BWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 18;

	/**
	 * The operation id for the '<em>Check Types BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XDUPLEX_COPPER_CABLE_RULE___CHECK_TYPES_BWD__MATCH = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 19;

	/**
	 * The operation id for the '<em>Is Appropriate BWD EMoflon Edge 17</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XDUPLEX_COPPER_CABLE_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_17__EMOFLONEDGE = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 20;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 13</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XDUPLEX_COPPER_CABLE_RULE___IS_APPROPRIATE_FWD_EMOFLON_EDGE_13__EMOFLONEDGE = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 21;

	/**
	 * The operation id for the '<em>Check Attributes FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XDUPLEX_COPPER_CABLE_RULE___CHECK_ATTRIBUTES_FWD__TRIPLEMATCH = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 22;

	/**
	 * The operation id for the '<em>Check Attributes BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XDUPLEX_COPPER_CABLE_RULE___CHECK_ATTRIBUTES_BWD__TRIPLEMATCH = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 23;

	/**
	 * The operation id for the '<em>Is Applicable CC</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XDUPLEX_COPPER_CABLE_RULE___IS_APPLICABLE_CC__MATCH_MATCH = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 24;

	/**
	 * The operation id for the '<em>Is Applicable solve Csp CC</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XDUPLEX_COPPER_CABLE_RULE___IS_APPLICABLE_SOLVE_CSP_CC__COPPERCABLE_CONTAINER_GLASSFIBERCABLE_CABLEATTRIBUTES_XDEVICE_XCOPPERCABLE_XCONTAINER_DEVICE_MATCH_MATCH = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 25;

	/**
	 * The operation id for the '<em>Is Applicable check Csp CC</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XDUPLEX_COPPER_CABLE_RULE___IS_APPLICABLE_CHECK_CSP_CC__CSP = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 26;

	/**
	 * The operation id for the '<em>Check DEC FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XDUPLEX_COPPER_CABLE_RULE___CHECK_DEC_FWD__CABLEATTRIBUTES_XDEVICE_XCOPPERCABLE_XCONTAINER = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 27;

	/**
	 * The operation id for the '<em>Check DEC BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XDUPLEX_COPPER_CABLE_RULE___CHECK_DEC_BWD__COPPERCABLE_CONTAINER_GLASSFIBERCABLE_DEVICE = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 28;

	/**
	 * The operation id for the '<em>Generate Model</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XDUPLEX_COPPER_CABLE_RULE___GENERATE_MODEL__RULEENTRYCONTAINER_XDEVICETODEVICE = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 29;

	/**
	 * The operation id for the '<em>Generate Model solve Csp BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XDUPLEX_COPPER_CABLE_RULE___GENERATE_MODEL_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_CONTAINER_XDEVICE_XCONTAINER_DEVICE_XDEVICETODEVICE_MODELGENERATORRULERESULT = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 30;

	/**
	 * The operation id for the '<em>Generate Model check Csp BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XDUPLEX_COPPER_CABLE_RULE___GENERATE_MODEL_CHECK_CSP_BWD__CSP = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 31;

	/**
	 * The number of operations of the '<em>XDuplex Copper Cable Rule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XDUPLEX_COPPER_CABLE_RULE_OPERATION_COUNT = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 32;

	/**
	 * The meta object id for the '{@link ImplementationTransformator.Rules.impl.XSimplexCableToCableRuleImpl <em>XSimplex Cable To Cable Rule</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ImplementationTransformator.Rules.impl.XSimplexCableToCableRuleImpl
	 * @see ImplementationTransformator.Rules.impl.RulesPackageImpl#getXSimplexCableToCableRule()
	 * @generated
	 */
	int XSIMPLEX_CABLE_TO_CABLE_RULE = 11;

	/**
	 * The number of structural features of the '<em>XSimplex Cable To Cable Rule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSIMPLEX_CABLE_TO_CABLE_RULE_FEATURE_COUNT = RuntimePackage.ABSTRACT_RULE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>XSimplex Cable To Cable Rule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSIMPLEX_CABLE_TO_CABLE_RULE_OPERATION_COUNT = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ImplementationTransformator.Rules.impl.XContainerToContainerRuleImpl <em>XContainer To Container Rule</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ImplementationTransformator.Rules.impl.XContainerToContainerRuleImpl
	 * @see ImplementationTransformator.Rules.impl.RulesPackageImpl#getXContainerToContainerRule()
	 * @generated
	 */
	int XCONTAINER_TO_CONTAINER_RULE = 12;

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
	int XCONTAINER_TO_CONTAINER_RULE___REGISTER_OBJECTS_FWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
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
	int XCONTAINER_TO_CONTAINER_RULE___IS_APPROPRIATE_BWD__MATCH_CONTAINER = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
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
	int XCONTAINER_TO_CONTAINER_RULE___REGISTER_OBJECTS_TO_MATCH_BWD__MATCH_CONTAINER = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 13;

	/**
	 * The operation id for the '<em>Is Appropriate solve Csp BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XCONTAINER_TO_CONTAINER_RULE___IS_APPROPRIATE_SOLVE_CSP_BWD__MATCH_CONTAINER = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
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
	int XCONTAINER_TO_CONTAINER_RULE___IS_APPLICABLE_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_CONTAINER = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
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
	int XCONTAINER_TO_CONTAINER_RULE___REGISTER_OBJECTS_BWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
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
	 * The operation id for the '<em>Is Appropriate BWD Container 1</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XCONTAINER_TO_CONTAINER_RULE___IS_APPROPRIATE_BWD_CONTAINER_1__CONTAINER = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 20;

	/**
	 * The operation id for the '<em>Is Appropriate FWD XContainer 1</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XCONTAINER_TO_CONTAINER_RULE___IS_APPROPRIATE_FWD_XCONTAINER_1__XCONTAINER = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
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
	int XCONTAINER_TO_CONTAINER_RULE___IS_APPLICABLE_SOLVE_CSP_CC__XCONTAINER_CONTAINER_MATCH_MATCH = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
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
	int XCONTAINER_TO_CONTAINER_RULE___CHECK_DEC_BWD__CONTAINER = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 28;

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
	 * Returns the meta object for class '{@link ImplementationTransformator.Rules.XDeviceToDeviceRule <em>XDevice To Device Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>XDevice To Device Rule</em>'.
	 * @see ImplementationTransformator.Rules.XDeviceToDeviceRule
	 * @generated
	 */
	EClass getXDeviceToDeviceRule();

	/**
	 * Returns the meta object for class '{@link ImplementationTransformator.Rules.XDuplexGlassFiberCableRule <em>XDuplex Glass Fiber Cable Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>XDuplex Glass Fiber Cable Rule</em>'.
	 * @see ImplementationTransformator.Rules.XDuplexGlassFiberCableRule
	 * @generated
	 */
	EClass getXDuplexGlassFiberCableRule();

	/**
	 * Returns the meta object for the '{@link ImplementationTransformator.Rules.XDuplexGlassFiberCableRule#isAppropriate_FWD(org.moflon.tgg.runtime.Match, xtextImplementation.xtextImpl.CableAttributes, xtextImplementation.xtextImpl.XDevice, xtextImplementation.xtextImpl.XGlassFiberCable, xtextImplementation.xtextImpl.XContainer) <em>Is Appropriate FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD</em>' operation.
	 * @see ImplementationTransformator.Rules.XDuplexGlassFiberCableRule#isAppropriate_FWD(org.moflon.tgg.runtime.Match, xtextImplementation.xtextImpl.CableAttributes, xtextImplementation.xtextImpl.XDevice, xtextImplementation.xtextImpl.XGlassFiberCable, xtextImplementation.xtextImpl.XContainer)
	 * @generated
	 */
	EOperation getXDuplexGlassFiberCableRule__IsAppropriate_FWD__Match_CableAttributes_XDevice_XGlassFiberCable_XContainer();

	/**
	 * Returns the meta object for the '{@link ImplementationTransformator.Rules.XDuplexGlassFiberCableRule#perform_FWD(org.moflon.tgg.runtime.IsApplicableMatch) <em>Perform FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Perform FWD</em>' operation.
	 * @see ImplementationTransformator.Rules.XDuplexGlassFiberCableRule#perform_FWD(org.moflon.tgg.runtime.IsApplicableMatch)
	 * @generated
	 */
	EOperation getXDuplexGlassFiberCableRule__Perform_FWD__IsApplicableMatch();

	/**
	 * Returns the meta object for the '{@link ImplementationTransformator.Rules.XDuplexGlassFiberCableRule#isApplicable_FWD(org.moflon.tgg.runtime.Match) <em>Is Applicable FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable FWD</em>' operation.
	 * @see ImplementationTransformator.Rules.XDuplexGlassFiberCableRule#isApplicable_FWD(org.moflon.tgg.runtime.Match)
	 * @generated
	 */
	EOperation getXDuplexGlassFiberCableRule__IsApplicable_FWD__Match();

	/**
	 * Returns the meta object for the '{@link ImplementationTransformator.Rules.XDuplexGlassFiberCableRule#registerObjectsToMatch_FWD(org.moflon.tgg.runtime.Match, xtextImplementation.xtextImpl.CableAttributes, xtextImplementation.xtextImpl.XDevice, xtextImplementation.xtextImpl.XGlassFiberCable, xtextImplementation.xtextImpl.XContainer) <em>Register Objects To Match FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Register Objects To Match FWD</em>' operation.
	 * @see ImplementationTransformator.Rules.XDuplexGlassFiberCableRule#registerObjectsToMatch_FWD(org.moflon.tgg.runtime.Match, xtextImplementation.xtextImpl.CableAttributes, xtextImplementation.xtextImpl.XDevice, xtextImplementation.xtextImpl.XGlassFiberCable, xtextImplementation.xtextImpl.XContainer)
	 * @generated
	 */
	EOperation getXDuplexGlassFiberCableRule__RegisterObjectsToMatch_FWD__Match_CableAttributes_XDevice_XGlassFiberCable_XContainer();

	/**
	 * Returns the meta object for the '{@link ImplementationTransformator.Rules.XDuplexGlassFiberCableRule#isAppropriate_solveCsp_FWD(org.moflon.tgg.runtime.Match, xtextImplementation.xtextImpl.CableAttributes, xtextImplementation.xtextImpl.XDevice, xtextImplementation.xtextImpl.XGlassFiberCable, xtextImplementation.xtextImpl.XContainer) <em>Is Appropriate solve Csp FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate solve Csp FWD</em>' operation.
	 * @see ImplementationTransformator.Rules.XDuplexGlassFiberCableRule#isAppropriate_solveCsp_FWD(org.moflon.tgg.runtime.Match, xtextImplementation.xtextImpl.CableAttributes, xtextImplementation.xtextImpl.XDevice, xtextImplementation.xtextImpl.XGlassFiberCable, xtextImplementation.xtextImpl.XContainer)
	 * @generated
	 */
	EOperation getXDuplexGlassFiberCableRule__IsAppropriate_solveCsp_FWD__Match_CableAttributes_XDevice_XGlassFiberCable_XContainer();

	/**
	 * Returns the meta object for the '{@link ImplementationTransformator.Rules.XDuplexGlassFiberCableRule#isAppropriate_checkCsp_FWD(org.moflon.tgg.language.csp.CSP) <em>Is Appropriate check Csp FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate check Csp FWD</em>' operation.
	 * @see ImplementationTransformator.Rules.XDuplexGlassFiberCableRule#isAppropriate_checkCsp_FWD(org.moflon.tgg.language.csp.CSP)
	 * @generated
	 */
	EOperation getXDuplexGlassFiberCableRule__IsAppropriate_checkCsp_FWD__CSP();

	/**
	 * Returns the meta object for the '{@link ImplementationTransformator.Rules.XDuplexGlassFiberCableRule#isApplicable_solveCsp_FWD(org.moflon.tgg.runtime.IsApplicableMatch, implementation.Container, xtextImplementation.xtextImpl.CableAttributes, xtextImplementation.xtextImpl.XDevice, xtextImplementation.xtextImpl.XGlassFiberCable, xtextImplementation.xtextImpl.XContainer, implementation.Device, ImplementationTransformator.XDeviceToDevice) <em>Is Applicable solve Csp FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable solve Csp FWD</em>' operation.
	 * @see ImplementationTransformator.Rules.XDuplexGlassFiberCableRule#isApplicable_solveCsp_FWD(org.moflon.tgg.runtime.IsApplicableMatch, implementation.Container, xtextImplementation.xtextImpl.CableAttributes, xtextImplementation.xtextImpl.XDevice, xtextImplementation.xtextImpl.XGlassFiberCable, xtextImplementation.xtextImpl.XContainer, implementation.Device, ImplementationTransformator.XDeviceToDevice)
	 * @generated
	 */
	EOperation getXDuplexGlassFiberCableRule__IsApplicable_solveCsp_FWD__IsApplicableMatch_Container_CableAttributes_XDevice_XGlassFiberCable_XContainer_Device_XDeviceToDevice();

	/**
	 * Returns the meta object for the '{@link ImplementationTransformator.Rules.XDuplexGlassFiberCableRule#isApplicable_checkCsp_FWD(org.moflon.tgg.language.csp.CSP) <em>Is Applicable check Csp FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable check Csp FWD</em>' operation.
	 * @see ImplementationTransformator.Rules.XDuplexGlassFiberCableRule#isApplicable_checkCsp_FWD(org.moflon.tgg.language.csp.CSP)
	 * @generated
	 */
	EOperation getXDuplexGlassFiberCableRule__IsApplicable_checkCsp_FWD__CSP();

	/**
	 * Returns the meta object for the '{@link ImplementationTransformator.Rules.XDuplexGlassFiberCableRule#registerObjects_FWD(org.moflon.tgg.runtime.PerformRuleResult, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject) <em>Register Objects FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Register Objects FWD</em>' operation.
	 * @see ImplementationTransformator.Rules.XDuplexGlassFiberCableRule#registerObjects_FWD(org.moflon.tgg.runtime.PerformRuleResult, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	EOperation getXDuplexGlassFiberCableRule__RegisterObjects_FWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject();

	/**
	 * Returns the meta object for the '{@link ImplementationTransformator.Rules.XDuplexGlassFiberCableRule#checkTypes_FWD(org.moflon.tgg.runtime.Match) <em>Check Types FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check Types FWD</em>' operation.
	 * @see ImplementationTransformator.Rules.XDuplexGlassFiberCableRule#checkTypes_FWD(org.moflon.tgg.runtime.Match)
	 * @generated
	 */
	EOperation getXDuplexGlassFiberCableRule__CheckTypes_FWD__Match();

	/**
	 * Returns the meta object for the '{@link ImplementationTransformator.Rules.XDuplexGlassFiberCableRule#isAppropriate_BWD(org.moflon.tgg.runtime.Match, implementation.GlassFiberCable, implementation.Container, implementation.GlassFiberCable, implementation.Device) <em>Is Appropriate BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD</em>' operation.
	 * @see ImplementationTransformator.Rules.XDuplexGlassFiberCableRule#isAppropriate_BWD(org.moflon.tgg.runtime.Match, implementation.GlassFiberCable, implementation.Container, implementation.GlassFiberCable, implementation.Device)
	 * @generated
	 */
	EOperation getXDuplexGlassFiberCableRule__IsAppropriate_BWD__Match_GlassFiberCable_Container_GlassFiberCable_Device();

	/**
	 * Returns the meta object for the '{@link ImplementationTransformator.Rules.XDuplexGlassFiberCableRule#perform_BWD(org.moflon.tgg.runtime.IsApplicableMatch) <em>Perform BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Perform BWD</em>' operation.
	 * @see ImplementationTransformator.Rules.XDuplexGlassFiberCableRule#perform_BWD(org.moflon.tgg.runtime.IsApplicableMatch)
	 * @generated
	 */
	EOperation getXDuplexGlassFiberCableRule__Perform_BWD__IsApplicableMatch();

	/**
	 * Returns the meta object for the '{@link ImplementationTransformator.Rules.XDuplexGlassFiberCableRule#isApplicable_BWD(org.moflon.tgg.runtime.Match) <em>Is Applicable BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable BWD</em>' operation.
	 * @see ImplementationTransformator.Rules.XDuplexGlassFiberCableRule#isApplicable_BWD(org.moflon.tgg.runtime.Match)
	 * @generated
	 */
	EOperation getXDuplexGlassFiberCableRule__IsApplicable_BWD__Match();

	/**
	 * Returns the meta object for the '{@link ImplementationTransformator.Rules.XDuplexGlassFiberCableRule#registerObjectsToMatch_BWD(org.moflon.tgg.runtime.Match, implementation.GlassFiberCable, implementation.Container, implementation.GlassFiberCable, implementation.Device) <em>Register Objects To Match BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Register Objects To Match BWD</em>' operation.
	 * @see ImplementationTransformator.Rules.XDuplexGlassFiberCableRule#registerObjectsToMatch_BWD(org.moflon.tgg.runtime.Match, implementation.GlassFiberCable, implementation.Container, implementation.GlassFiberCable, implementation.Device)
	 * @generated
	 */
	EOperation getXDuplexGlassFiberCableRule__RegisterObjectsToMatch_BWD__Match_GlassFiberCable_Container_GlassFiberCable_Device();

	/**
	 * Returns the meta object for the '{@link ImplementationTransformator.Rules.XDuplexGlassFiberCableRule#isAppropriate_solveCsp_BWD(org.moflon.tgg.runtime.Match, implementation.GlassFiberCable, implementation.Container, implementation.GlassFiberCable, implementation.Device) <em>Is Appropriate solve Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate solve Csp BWD</em>' operation.
	 * @see ImplementationTransformator.Rules.XDuplexGlassFiberCableRule#isAppropriate_solveCsp_BWD(org.moflon.tgg.runtime.Match, implementation.GlassFiberCable, implementation.Container, implementation.GlassFiberCable, implementation.Device)
	 * @generated
	 */
	EOperation getXDuplexGlassFiberCableRule__IsAppropriate_solveCsp_BWD__Match_GlassFiberCable_Container_GlassFiberCable_Device();

	/**
	 * Returns the meta object for the '{@link ImplementationTransformator.Rules.XDuplexGlassFiberCableRule#isAppropriate_checkCsp_BWD(org.moflon.tgg.language.csp.CSP) <em>Is Appropriate check Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate check Csp BWD</em>' operation.
	 * @see ImplementationTransformator.Rules.XDuplexGlassFiberCableRule#isAppropriate_checkCsp_BWD(org.moflon.tgg.language.csp.CSP)
	 * @generated
	 */
	EOperation getXDuplexGlassFiberCableRule__IsAppropriate_checkCsp_BWD__CSP();

	/**
	 * Returns the meta object for the '{@link ImplementationTransformator.Rules.XDuplexGlassFiberCableRule#isApplicable_solveCsp_BWD(org.moflon.tgg.runtime.IsApplicableMatch, implementation.GlassFiberCable, implementation.Container, implementation.GlassFiberCable, xtextImplementation.xtextImpl.XDevice, xtextImplementation.xtextImpl.XContainer, implementation.Device, ImplementationTransformator.XDeviceToDevice) <em>Is Applicable solve Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable solve Csp BWD</em>' operation.
	 * @see ImplementationTransformator.Rules.XDuplexGlassFiberCableRule#isApplicable_solveCsp_BWD(org.moflon.tgg.runtime.IsApplicableMatch, implementation.GlassFiberCable, implementation.Container, implementation.GlassFiberCable, xtextImplementation.xtextImpl.XDevice, xtextImplementation.xtextImpl.XContainer, implementation.Device, ImplementationTransformator.XDeviceToDevice)
	 * @generated
	 */
	EOperation getXDuplexGlassFiberCableRule__IsApplicable_solveCsp_BWD__IsApplicableMatch_GlassFiberCable_Container_GlassFiberCable_XDevice_XContainer_Device_XDeviceToDevice();

	/**
	 * Returns the meta object for the '{@link ImplementationTransformator.Rules.XDuplexGlassFiberCableRule#isApplicable_checkCsp_BWD(org.moflon.tgg.language.csp.CSP) <em>Is Applicable check Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable check Csp BWD</em>' operation.
	 * @see ImplementationTransformator.Rules.XDuplexGlassFiberCableRule#isApplicable_checkCsp_BWD(org.moflon.tgg.language.csp.CSP)
	 * @generated
	 */
	EOperation getXDuplexGlassFiberCableRule__IsApplicable_checkCsp_BWD__CSP();

	/**
	 * Returns the meta object for the '{@link ImplementationTransformator.Rules.XDuplexGlassFiberCableRule#registerObjects_BWD(org.moflon.tgg.runtime.PerformRuleResult, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject) <em>Register Objects BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Register Objects BWD</em>' operation.
	 * @see ImplementationTransformator.Rules.XDuplexGlassFiberCableRule#registerObjects_BWD(org.moflon.tgg.runtime.PerformRuleResult, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	EOperation getXDuplexGlassFiberCableRule__RegisterObjects_BWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject();

	/**
	 * Returns the meta object for the '{@link ImplementationTransformator.Rules.XDuplexGlassFiberCableRule#checkTypes_BWD(org.moflon.tgg.runtime.Match) <em>Check Types BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check Types BWD</em>' operation.
	 * @see ImplementationTransformator.Rules.XDuplexGlassFiberCableRule#checkTypes_BWD(org.moflon.tgg.runtime.Match)
	 * @generated
	 */
	EOperation getXDuplexGlassFiberCableRule__CheckTypes_BWD__Match();

	/**
	 * Returns the meta object for the '{@link ImplementationTransformator.Rules.XDuplexGlassFiberCableRule#isAppropriate_BWD_EMoflonEdge_9(org.moflon.tgg.runtime.EMoflonEdge) <em>Is Appropriate BWD EMoflon Edge 9</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD EMoflon Edge 9</em>' operation.
	 * @see ImplementationTransformator.Rules.XDuplexGlassFiberCableRule#isAppropriate_BWD_EMoflonEdge_9(org.moflon.tgg.runtime.EMoflonEdge)
	 * @generated
	 */
	EOperation getXDuplexGlassFiberCableRule__IsAppropriate_BWD_EMoflonEdge_9__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link ImplementationTransformator.Rules.XDuplexGlassFiberCableRule#isAppropriate_FWD_EMoflonEdge_5(org.moflon.tgg.runtime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 5</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 5</em>' operation.
	 * @see ImplementationTransformator.Rules.XDuplexGlassFiberCableRule#isAppropriate_FWD_EMoflonEdge_5(org.moflon.tgg.runtime.EMoflonEdge)
	 * @generated
	 */
	EOperation getXDuplexGlassFiberCableRule__IsAppropriate_FWD_EMoflonEdge_5__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link ImplementationTransformator.Rules.XDuplexGlassFiberCableRule#checkAttributes_FWD(org.moflon.tgg.runtime.TripleMatch) <em>Check Attributes FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check Attributes FWD</em>' operation.
	 * @see ImplementationTransformator.Rules.XDuplexGlassFiberCableRule#checkAttributes_FWD(org.moflon.tgg.runtime.TripleMatch)
	 * @generated
	 */
	EOperation getXDuplexGlassFiberCableRule__CheckAttributes_FWD__TripleMatch();

	/**
	 * Returns the meta object for the '{@link ImplementationTransformator.Rules.XDuplexGlassFiberCableRule#checkAttributes_BWD(org.moflon.tgg.runtime.TripleMatch) <em>Check Attributes BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check Attributes BWD</em>' operation.
	 * @see ImplementationTransformator.Rules.XDuplexGlassFiberCableRule#checkAttributes_BWD(org.moflon.tgg.runtime.TripleMatch)
	 * @generated
	 */
	EOperation getXDuplexGlassFiberCableRule__CheckAttributes_BWD__TripleMatch();

	/**
	 * Returns the meta object for the '{@link ImplementationTransformator.Rules.XDuplexGlassFiberCableRule#isApplicable_CC(org.moflon.tgg.runtime.Match, org.moflon.tgg.runtime.Match) <em>Is Applicable CC</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable CC</em>' operation.
	 * @see ImplementationTransformator.Rules.XDuplexGlassFiberCableRule#isApplicable_CC(org.moflon.tgg.runtime.Match, org.moflon.tgg.runtime.Match)
	 * @generated
	 */
	EOperation getXDuplexGlassFiberCableRule__IsApplicable_CC__Match_Match();

	/**
	 * Returns the meta object for the '{@link ImplementationTransformator.Rules.XDuplexGlassFiberCableRule#isApplicable_solveCsp_CC(implementation.GlassFiberCable, implementation.Container, implementation.GlassFiberCable, xtextImplementation.xtextImpl.CableAttributes, xtextImplementation.xtextImpl.XDevice, xtextImplementation.xtextImpl.XGlassFiberCable, xtextImplementation.xtextImpl.XContainer, implementation.Device, org.moflon.tgg.runtime.Match, org.moflon.tgg.runtime.Match) <em>Is Applicable solve Csp CC</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable solve Csp CC</em>' operation.
	 * @see ImplementationTransformator.Rules.XDuplexGlassFiberCableRule#isApplicable_solveCsp_CC(implementation.GlassFiberCable, implementation.Container, implementation.GlassFiberCable, xtextImplementation.xtextImpl.CableAttributes, xtextImplementation.xtextImpl.XDevice, xtextImplementation.xtextImpl.XGlassFiberCable, xtextImplementation.xtextImpl.XContainer, implementation.Device, org.moflon.tgg.runtime.Match, org.moflon.tgg.runtime.Match)
	 * @generated
	 */
	EOperation getXDuplexGlassFiberCableRule__IsApplicable_solveCsp_CC__GlassFiberCable_Container_GlassFiberCable_CableAttributes_XDevice_XGlassFiberCable_XContainer_Device_Match_Match();

	/**
	 * Returns the meta object for the '{@link ImplementationTransformator.Rules.XDuplexGlassFiberCableRule#isApplicable_checkCsp_CC(org.moflon.tgg.language.csp.CSP) <em>Is Applicable check Csp CC</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable check Csp CC</em>' operation.
	 * @see ImplementationTransformator.Rules.XDuplexGlassFiberCableRule#isApplicable_checkCsp_CC(org.moflon.tgg.language.csp.CSP)
	 * @generated
	 */
	EOperation getXDuplexGlassFiberCableRule__IsApplicable_checkCsp_CC__CSP();

	/**
	 * Returns the meta object for the '{@link ImplementationTransformator.Rules.XDuplexGlassFiberCableRule#checkDEC_FWD(xtextImplementation.xtextImpl.CableAttributes, xtextImplementation.xtextImpl.XDevice, xtextImplementation.xtextImpl.XGlassFiberCable, xtextImplementation.xtextImpl.XContainer) <em>Check DEC FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check DEC FWD</em>' operation.
	 * @see ImplementationTransformator.Rules.XDuplexGlassFiberCableRule#checkDEC_FWD(xtextImplementation.xtextImpl.CableAttributes, xtextImplementation.xtextImpl.XDevice, xtextImplementation.xtextImpl.XGlassFiberCable, xtextImplementation.xtextImpl.XContainer)
	 * @generated
	 */
	EOperation getXDuplexGlassFiberCableRule__CheckDEC_FWD__CableAttributes_XDevice_XGlassFiberCable_XContainer();

	/**
	 * Returns the meta object for the '{@link ImplementationTransformator.Rules.XDuplexGlassFiberCableRule#checkDEC_BWD(implementation.GlassFiberCable, implementation.Container, implementation.GlassFiberCable, implementation.Device) <em>Check DEC BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check DEC BWD</em>' operation.
	 * @see ImplementationTransformator.Rules.XDuplexGlassFiberCableRule#checkDEC_BWD(implementation.GlassFiberCable, implementation.Container, implementation.GlassFiberCable, implementation.Device)
	 * @generated
	 */
	EOperation getXDuplexGlassFiberCableRule__CheckDEC_BWD__GlassFiberCable_Container_GlassFiberCable_Device();

	/**
	 * Returns the meta object for the '{@link ImplementationTransformator.Rules.XDuplexGlassFiberCableRule#generateModel(org.moflon.tgg.language.modelgenerator.RuleEntryContainer, ImplementationTransformator.XDeviceToDevice) <em>Generate Model</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Generate Model</em>' operation.
	 * @see ImplementationTransformator.Rules.XDuplexGlassFiberCableRule#generateModel(org.moflon.tgg.language.modelgenerator.RuleEntryContainer, ImplementationTransformator.XDeviceToDevice)
	 * @generated
	 */
	EOperation getXDuplexGlassFiberCableRule__GenerateModel__RuleEntryContainer_XDeviceToDevice();

	/**
	 * Returns the meta object for the '{@link ImplementationTransformator.Rules.XDuplexGlassFiberCableRule#generateModel_solveCsp_BWD(org.moflon.tgg.runtime.IsApplicableMatch, implementation.Container, xtextImplementation.xtextImpl.XDevice, xtextImplementation.xtextImpl.XContainer, implementation.Device, ImplementationTransformator.XDeviceToDevice, org.moflon.tgg.runtime.ModelgeneratorRuleResult) <em>Generate Model solve Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Generate Model solve Csp BWD</em>' operation.
	 * @see ImplementationTransformator.Rules.XDuplexGlassFiberCableRule#generateModel_solveCsp_BWD(org.moflon.tgg.runtime.IsApplicableMatch, implementation.Container, xtextImplementation.xtextImpl.XDevice, xtextImplementation.xtextImpl.XContainer, implementation.Device, ImplementationTransformator.XDeviceToDevice, org.moflon.tgg.runtime.ModelgeneratorRuleResult)
	 * @generated
	 */
	EOperation getXDuplexGlassFiberCableRule__GenerateModel_solveCsp_BWD__IsApplicableMatch_Container_XDevice_XContainer_Device_XDeviceToDevice_ModelgeneratorRuleResult();

	/**
	 * Returns the meta object for the '{@link ImplementationTransformator.Rules.XDuplexGlassFiberCableRule#generateModel_checkCsp_BWD(org.moflon.tgg.language.csp.CSP) <em>Generate Model check Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Generate Model check Csp BWD</em>' operation.
	 * @see ImplementationTransformator.Rules.XDuplexGlassFiberCableRule#generateModel_checkCsp_BWD(org.moflon.tgg.language.csp.CSP)
	 * @generated
	 */
	EOperation getXDuplexGlassFiberCableRule__GenerateModel_checkCsp_BWD__CSP();

	/**
	 * Returns the meta object for class '{@link ImplementationTransformator.Rules.XDuplexCableToCablesRule <em>XDuplex Cable To Cables Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>XDuplex Cable To Cables Rule</em>'.
	 * @see ImplementationTransformator.Rules.XDuplexCableToCablesRule
	 * @generated
	 */
	EClass getXDuplexCableToCablesRule();

	/**
	 * Returns the meta object for class '{@link ImplementationTransformator.Rules.XServerToServer <em>XServer To Server</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>XServer To Server</em>'.
	 * @see ImplementationTransformator.Rules.XServerToServer
	 * @generated
	 */
	EClass getXServerToServer();

	/**
	 * Returns the meta object for the '{@link ImplementationTransformator.Rules.XServerToServer#isAppropriate_FWD(org.moflon.tgg.runtime.Match, xtextImplementation.xtextImpl.XServer, xtextImplementation.xtextImpl.XContainer, xtextImplementation.xtextImpl.Connections) <em>Is Appropriate FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD</em>' operation.
	 * @see ImplementationTransformator.Rules.XServerToServer#isAppropriate_FWD(org.moflon.tgg.runtime.Match, xtextImplementation.xtextImpl.XServer, xtextImplementation.xtextImpl.XContainer, xtextImplementation.xtextImpl.Connections)
	 * @generated
	 */
	EOperation getXServerToServer__IsAppropriate_FWD__Match_XServer_XContainer_Connections();

	/**
	 * Returns the meta object for the '{@link ImplementationTransformator.Rules.XServerToServer#perform_FWD(org.moflon.tgg.runtime.IsApplicableMatch) <em>Perform FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Perform FWD</em>' operation.
	 * @see ImplementationTransformator.Rules.XServerToServer#perform_FWD(org.moflon.tgg.runtime.IsApplicableMatch)
	 * @generated
	 */
	EOperation getXServerToServer__Perform_FWD__IsApplicableMatch();

	/**
	 * Returns the meta object for the '{@link ImplementationTransformator.Rules.XServerToServer#isApplicable_FWD(org.moflon.tgg.runtime.Match) <em>Is Applicable FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable FWD</em>' operation.
	 * @see ImplementationTransformator.Rules.XServerToServer#isApplicable_FWD(org.moflon.tgg.runtime.Match)
	 * @generated
	 */
	EOperation getXServerToServer__IsApplicable_FWD__Match();

	/**
	 * Returns the meta object for the '{@link ImplementationTransformator.Rules.XServerToServer#registerObjectsToMatch_FWD(org.moflon.tgg.runtime.Match, xtextImplementation.xtextImpl.XServer, xtextImplementation.xtextImpl.XContainer, xtextImplementation.xtextImpl.Connections) <em>Register Objects To Match FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Register Objects To Match FWD</em>' operation.
	 * @see ImplementationTransformator.Rules.XServerToServer#registerObjectsToMatch_FWD(org.moflon.tgg.runtime.Match, xtextImplementation.xtextImpl.XServer, xtextImplementation.xtextImpl.XContainer, xtextImplementation.xtextImpl.Connections)
	 * @generated
	 */
	EOperation getXServerToServer__RegisterObjectsToMatch_FWD__Match_XServer_XContainer_Connections();

	/**
	 * Returns the meta object for the '{@link ImplementationTransformator.Rules.XServerToServer#isAppropriate_solveCsp_FWD(org.moflon.tgg.runtime.Match, xtextImplementation.xtextImpl.XServer, xtextImplementation.xtextImpl.XContainer, xtextImplementation.xtextImpl.Connections) <em>Is Appropriate solve Csp FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate solve Csp FWD</em>' operation.
	 * @see ImplementationTransformator.Rules.XServerToServer#isAppropriate_solveCsp_FWD(org.moflon.tgg.runtime.Match, xtextImplementation.xtextImpl.XServer, xtextImplementation.xtextImpl.XContainer, xtextImplementation.xtextImpl.Connections)
	 * @generated
	 */
	EOperation getXServerToServer__IsAppropriate_solveCsp_FWD__Match_XServer_XContainer_Connections();

	/**
	 * Returns the meta object for the '{@link ImplementationTransformator.Rules.XServerToServer#isAppropriate_checkCsp_FWD(org.moflon.tgg.language.csp.CSP) <em>Is Appropriate check Csp FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate check Csp FWD</em>' operation.
	 * @see ImplementationTransformator.Rules.XServerToServer#isAppropriate_checkCsp_FWD(org.moflon.tgg.language.csp.CSP)
	 * @generated
	 */
	EOperation getXServerToServer__IsAppropriate_checkCsp_FWD__CSP();

	/**
	 * Returns the meta object for the '{@link ImplementationTransformator.Rules.XServerToServer#isApplicable_solveCsp_FWD(org.moflon.tgg.runtime.IsApplicableMatch, implementation.Container, ImplementationTransformator.XContainerToContainer, xtextImplementation.xtextImpl.XServer, xtextImplementation.xtextImpl.XContainer, xtextImplementation.xtextImpl.Connections) <em>Is Applicable solve Csp FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable solve Csp FWD</em>' operation.
	 * @see ImplementationTransformator.Rules.XServerToServer#isApplicable_solveCsp_FWD(org.moflon.tgg.runtime.IsApplicableMatch, implementation.Container, ImplementationTransformator.XContainerToContainer, xtextImplementation.xtextImpl.XServer, xtextImplementation.xtextImpl.XContainer, xtextImplementation.xtextImpl.Connections)
	 * @generated
	 */
	EOperation getXServerToServer__IsApplicable_solveCsp_FWD__IsApplicableMatch_Container_XContainerToContainer_XServer_XContainer_Connections();

	/**
	 * Returns the meta object for the '{@link ImplementationTransformator.Rules.XServerToServer#isApplicable_checkCsp_FWD(org.moflon.tgg.language.csp.CSP) <em>Is Applicable check Csp FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable check Csp FWD</em>' operation.
	 * @see ImplementationTransformator.Rules.XServerToServer#isApplicable_checkCsp_FWD(org.moflon.tgg.language.csp.CSP)
	 * @generated
	 */
	EOperation getXServerToServer__IsApplicable_checkCsp_FWD__CSP();

	/**
	 * Returns the meta object for the '{@link ImplementationTransformator.Rules.XServerToServer#registerObjects_FWD(org.moflon.tgg.runtime.PerformRuleResult, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject) <em>Register Objects FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Register Objects FWD</em>' operation.
	 * @see ImplementationTransformator.Rules.XServerToServer#registerObjects_FWD(org.moflon.tgg.runtime.PerformRuleResult, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	EOperation getXServerToServer__RegisterObjects_FWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject();

	/**
	 * Returns the meta object for the '{@link ImplementationTransformator.Rules.XServerToServer#checkTypes_FWD(org.moflon.tgg.runtime.Match) <em>Check Types FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check Types FWD</em>' operation.
	 * @see ImplementationTransformator.Rules.XServerToServer#checkTypes_FWD(org.moflon.tgg.runtime.Match)
	 * @generated
	 */
	EOperation getXServerToServer__CheckTypes_FWD__Match();

	/**
	 * Returns the meta object for the '{@link ImplementationTransformator.Rules.XServerToServer#isAppropriate_BWD(org.moflon.tgg.runtime.Match, implementation.Container, implementation.Server) <em>Is Appropriate BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD</em>' operation.
	 * @see ImplementationTransformator.Rules.XServerToServer#isAppropriate_BWD(org.moflon.tgg.runtime.Match, implementation.Container, implementation.Server)
	 * @generated
	 */
	EOperation getXServerToServer__IsAppropriate_BWD__Match_Container_Server();

	/**
	 * Returns the meta object for the '{@link ImplementationTransformator.Rules.XServerToServer#perform_BWD(org.moflon.tgg.runtime.IsApplicableMatch) <em>Perform BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Perform BWD</em>' operation.
	 * @see ImplementationTransformator.Rules.XServerToServer#perform_BWD(org.moflon.tgg.runtime.IsApplicableMatch)
	 * @generated
	 */
	EOperation getXServerToServer__Perform_BWD__IsApplicableMatch();

	/**
	 * Returns the meta object for the '{@link ImplementationTransformator.Rules.XServerToServer#isApplicable_BWD(org.moflon.tgg.runtime.Match) <em>Is Applicable BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable BWD</em>' operation.
	 * @see ImplementationTransformator.Rules.XServerToServer#isApplicable_BWD(org.moflon.tgg.runtime.Match)
	 * @generated
	 */
	EOperation getXServerToServer__IsApplicable_BWD__Match();

	/**
	 * Returns the meta object for the '{@link ImplementationTransformator.Rules.XServerToServer#registerObjectsToMatch_BWD(org.moflon.tgg.runtime.Match, implementation.Container, implementation.Server) <em>Register Objects To Match BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Register Objects To Match BWD</em>' operation.
	 * @see ImplementationTransformator.Rules.XServerToServer#registerObjectsToMatch_BWD(org.moflon.tgg.runtime.Match, implementation.Container, implementation.Server)
	 * @generated
	 */
	EOperation getXServerToServer__RegisterObjectsToMatch_BWD__Match_Container_Server();

	/**
	 * Returns the meta object for the '{@link ImplementationTransformator.Rules.XServerToServer#isAppropriate_solveCsp_BWD(org.moflon.tgg.runtime.Match, implementation.Container, implementation.Server) <em>Is Appropriate solve Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate solve Csp BWD</em>' operation.
	 * @see ImplementationTransformator.Rules.XServerToServer#isAppropriate_solveCsp_BWD(org.moflon.tgg.runtime.Match, implementation.Container, implementation.Server)
	 * @generated
	 */
	EOperation getXServerToServer__IsAppropriate_solveCsp_BWD__Match_Container_Server();

	/**
	 * Returns the meta object for the '{@link ImplementationTransformator.Rules.XServerToServer#isAppropriate_checkCsp_BWD(org.moflon.tgg.language.csp.CSP) <em>Is Appropriate check Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate check Csp BWD</em>' operation.
	 * @see ImplementationTransformator.Rules.XServerToServer#isAppropriate_checkCsp_BWD(org.moflon.tgg.language.csp.CSP)
	 * @generated
	 */
	EOperation getXServerToServer__IsAppropriate_checkCsp_BWD__CSP();

	/**
	 * Returns the meta object for the '{@link ImplementationTransformator.Rules.XServerToServer#isApplicable_solveCsp_BWD(org.moflon.tgg.runtime.IsApplicableMatch, implementation.Container, ImplementationTransformator.XContainerToContainer, xtextImplementation.xtextImpl.XContainer, implementation.Server) <em>Is Applicable solve Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable solve Csp BWD</em>' operation.
	 * @see ImplementationTransformator.Rules.XServerToServer#isApplicable_solveCsp_BWD(org.moflon.tgg.runtime.IsApplicableMatch, implementation.Container, ImplementationTransformator.XContainerToContainer, xtextImplementation.xtextImpl.XContainer, implementation.Server)
	 * @generated
	 */
	EOperation getXServerToServer__IsApplicable_solveCsp_BWD__IsApplicableMatch_Container_XContainerToContainer_XContainer_Server();

	/**
	 * Returns the meta object for the '{@link ImplementationTransformator.Rules.XServerToServer#isApplicable_checkCsp_BWD(org.moflon.tgg.language.csp.CSP) <em>Is Applicable check Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable check Csp BWD</em>' operation.
	 * @see ImplementationTransformator.Rules.XServerToServer#isApplicable_checkCsp_BWD(org.moflon.tgg.language.csp.CSP)
	 * @generated
	 */
	EOperation getXServerToServer__IsApplicable_checkCsp_BWD__CSP();

	/**
	 * Returns the meta object for the '{@link ImplementationTransformator.Rules.XServerToServer#registerObjects_BWD(org.moflon.tgg.runtime.PerformRuleResult, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject) <em>Register Objects BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Register Objects BWD</em>' operation.
	 * @see ImplementationTransformator.Rules.XServerToServer#registerObjects_BWD(org.moflon.tgg.runtime.PerformRuleResult, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	EOperation getXServerToServer__RegisterObjects_BWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject();

	/**
	 * Returns the meta object for the '{@link ImplementationTransformator.Rules.XServerToServer#checkTypes_BWD(org.moflon.tgg.runtime.Match) <em>Check Types BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check Types BWD</em>' operation.
	 * @see ImplementationTransformator.Rules.XServerToServer#checkTypes_BWD(org.moflon.tgg.runtime.Match)
	 * @generated
	 */
	EOperation getXServerToServer__CheckTypes_BWD__Match();

	/**
	 * Returns the meta object for the '{@link ImplementationTransformator.Rules.XServerToServer#isAppropriate_BWD_EMoflonEdge_10(org.moflon.tgg.runtime.EMoflonEdge) <em>Is Appropriate BWD EMoflon Edge 10</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD EMoflon Edge 10</em>' operation.
	 * @see ImplementationTransformator.Rules.XServerToServer#isAppropriate_BWD_EMoflonEdge_10(org.moflon.tgg.runtime.EMoflonEdge)
	 * @generated
	 */
	EOperation getXServerToServer__IsAppropriate_BWD_EMoflonEdge_10__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link ImplementationTransformator.Rules.XServerToServer#isAppropriate_FWD_EMoflonEdge_6(org.moflon.tgg.runtime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 6</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 6</em>' operation.
	 * @see ImplementationTransformator.Rules.XServerToServer#isAppropriate_FWD_EMoflonEdge_6(org.moflon.tgg.runtime.EMoflonEdge)
	 * @generated
	 */
	EOperation getXServerToServer__IsAppropriate_FWD_EMoflonEdge_6__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link ImplementationTransformator.Rules.XServerToServer#checkAttributes_FWD(org.moflon.tgg.runtime.TripleMatch) <em>Check Attributes FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check Attributes FWD</em>' operation.
	 * @see ImplementationTransformator.Rules.XServerToServer#checkAttributes_FWD(org.moflon.tgg.runtime.TripleMatch)
	 * @generated
	 */
	EOperation getXServerToServer__CheckAttributes_FWD__TripleMatch();

	/**
	 * Returns the meta object for the '{@link ImplementationTransformator.Rules.XServerToServer#checkAttributes_BWD(org.moflon.tgg.runtime.TripleMatch) <em>Check Attributes BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check Attributes BWD</em>' operation.
	 * @see ImplementationTransformator.Rules.XServerToServer#checkAttributes_BWD(org.moflon.tgg.runtime.TripleMatch)
	 * @generated
	 */
	EOperation getXServerToServer__CheckAttributes_BWD__TripleMatch();

	/**
	 * Returns the meta object for the '{@link ImplementationTransformator.Rules.XServerToServer#isApplicable_CC(org.moflon.tgg.runtime.Match, org.moflon.tgg.runtime.Match) <em>Is Applicable CC</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable CC</em>' operation.
	 * @see ImplementationTransformator.Rules.XServerToServer#isApplicable_CC(org.moflon.tgg.runtime.Match, org.moflon.tgg.runtime.Match)
	 * @generated
	 */
	EOperation getXServerToServer__IsApplicable_CC__Match_Match();

	/**
	 * Returns the meta object for the '{@link ImplementationTransformator.Rules.XServerToServer#isApplicable_solveCsp_CC(implementation.Container, xtextImplementation.xtextImpl.XServer, xtextImplementation.xtextImpl.XContainer, xtextImplementation.xtextImpl.Connections, implementation.Server, org.moflon.tgg.runtime.Match, org.moflon.tgg.runtime.Match) <em>Is Applicable solve Csp CC</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable solve Csp CC</em>' operation.
	 * @see ImplementationTransformator.Rules.XServerToServer#isApplicable_solveCsp_CC(implementation.Container, xtextImplementation.xtextImpl.XServer, xtextImplementation.xtextImpl.XContainer, xtextImplementation.xtextImpl.Connections, implementation.Server, org.moflon.tgg.runtime.Match, org.moflon.tgg.runtime.Match)
	 * @generated
	 */
	EOperation getXServerToServer__IsApplicable_solveCsp_CC__Container_XServer_XContainer_Connections_Server_Match_Match();

	/**
	 * Returns the meta object for the '{@link ImplementationTransformator.Rules.XServerToServer#isApplicable_checkCsp_CC(org.moflon.tgg.language.csp.CSP) <em>Is Applicable check Csp CC</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable check Csp CC</em>' operation.
	 * @see ImplementationTransformator.Rules.XServerToServer#isApplicable_checkCsp_CC(org.moflon.tgg.language.csp.CSP)
	 * @generated
	 */
	EOperation getXServerToServer__IsApplicable_checkCsp_CC__CSP();

	/**
	 * Returns the meta object for the '{@link ImplementationTransformator.Rules.XServerToServer#checkDEC_FWD(xtextImplementation.xtextImpl.XServer, xtextImplementation.xtextImpl.XContainer, xtextImplementation.xtextImpl.Connections) <em>Check DEC FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check DEC FWD</em>' operation.
	 * @see ImplementationTransformator.Rules.XServerToServer#checkDEC_FWD(xtextImplementation.xtextImpl.XServer, xtextImplementation.xtextImpl.XContainer, xtextImplementation.xtextImpl.Connections)
	 * @generated
	 */
	EOperation getXServerToServer__CheckDEC_FWD__XServer_XContainer_Connections();

	/**
	 * Returns the meta object for the '{@link ImplementationTransformator.Rules.XServerToServer#checkDEC_BWD(implementation.Container, implementation.Server) <em>Check DEC BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check DEC BWD</em>' operation.
	 * @see ImplementationTransformator.Rules.XServerToServer#checkDEC_BWD(implementation.Container, implementation.Server)
	 * @generated
	 */
	EOperation getXServerToServer__CheckDEC_BWD__Container_Server();

	/**
	 * Returns the meta object for the '{@link ImplementationTransformator.Rules.XServerToServer#generateModel(org.moflon.tgg.language.modelgenerator.RuleEntryContainer, ImplementationTransformator.XContainerToContainer) <em>Generate Model</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Generate Model</em>' operation.
	 * @see ImplementationTransformator.Rules.XServerToServer#generateModel(org.moflon.tgg.language.modelgenerator.RuleEntryContainer, ImplementationTransformator.XContainerToContainer)
	 * @generated
	 */
	EOperation getXServerToServer__GenerateModel__RuleEntryContainer_XContainerToContainer();

	/**
	 * Returns the meta object for the '{@link ImplementationTransformator.Rules.XServerToServer#generateModel_solveCsp_BWD(org.moflon.tgg.runtime.IsApplicableMatch, implementation.Container, ImplementationTransformator.XContainerToContainer, xtextImplementation.xtextImpl.XContainer, org.moflon.tgg.runtime.ModelgeneratorRuleResult) <em>Generate Model solve Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Generate Model solve Csp BWD</em>' operation.
	 * @see ImplementationTransformator.Rules.XServerToServer#generateModel_solveCsp_BWD(org.moflon.tgg.runtime.IsApplicableMatch, implementation.Container, ImplementationTransformator.XContainerToContainer, xtextImplementation.xtextImpl.XContainer, org.moflon.tgg.runtime.ModelgeneratorRuleResult)
	 * @generated
	 */
	EOperation getXServerToServer__GenerateModel_solveCsp_BWD__IsApplicableMatch_Container_XContainerToContainer_XContainer_ModelgeneratorRuleResult();

	/**
	 * Returns the meta object for the '{@link ImplementationTransformator.Rules.XServerToServer#generateModel_checkCsp_BWD(org.moflon.tgg.language.csp.CSP) <em>Generate Model check Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Generate Model check Csp BWD</em>' operation.
	 * @see ImplementationTransformator.Rules.XServerToServer#generateModel_checkCsp_BWD(org.moflon.tgg.language.csp.CSP)
	 * @generated
	 */
	EOperation getXServerToServer__GenerateModel_checkCsp_BWD__CSP();

	/**
	 * Returns the meta object for class '{@link ImplementationTransformator.Rules.XSimplexConnectionToConnectionRule <em>XSimplex Connection To Connection Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>XSimplex Connection To Connection Rule</em>'.
	 * @see ImplementationTransformator.Rules.XSimplexConnectionToConnectionRule
	 * @generated
	 */
	EClass getXSimplexConnectionToConnectionRule();

	/**
	 * Returns the meta object for the '{@link ImplementationTransformator.Rules.XSimplexConnectionToConnectionRule#isAppropriate_FWD(org.moflon.tgg.runtime.Match, xtextImplementation.xtextImpl.XContainer, xtextImplementation.xtextImpl.XDevice, xtextImplementation.xtextImpl.Connections, xtextImplementation.xtextImpl.Connections, xtextImplementation.xtextImpl.CableAttributes, xtextImplementation.xtextImpl.XDevice, xtextImplementation.xtextImpl.XCable) <em>Is Appropriate FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD</em>' operation.
	 * @see ImplementationTransformator.Rules.XSimplexConnectionToConnectionRule#isAppropriate_FWD(org.moflon.tgg.runtime.Match, xtextImplementation.xtextImpl.XContainer, xtextImplementation.xtextImpl.XDevice, xtextImplementation.xtextImpl.Connections, xtextImplementation.xtextImpl.Connections, xtextImplementation.xtextImpl.CableAttributes, xtextImplementation.xtextImpl.XDevice, xtextImplementation.xtextImpl.XCable)
	 * @generated
	 */
	EOperation getXSimplexConnectionToConnectionRule__IsAppropriate_FWD__Match_XContainer_XDevice_Connections_Connections_CableAttributes_XDevice_XCable();

	/**
	 * Returns the meta object for the '{@link ImplementationTransformator.Rules.XSimplexConnectionToConnectionRule#perform_FWD(org.moflon.tgg.runtime.IsApplicableMatch) <em>Perform FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Perform FWD</em>' operation.
	 * @see ImplementationTransformator.Rules.XSimplexConnectionToConnectionRule#perform_FWD(org.moflon.tgg.runtime.IsApplicableMatch)
	 * @generated
	 */
	EOperation getXSimplexConnectionToConnectionRule__Perform_FWD__IsApplicableMatch();

	/**
	 * Returns the meta object for the '{@link ImplementationTransformator.Rules.XSimplexConnectionToConnectionRule#isApplicable_FWD(org.moflon.tgg.runtime.Match) <em>Is Applicable FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable FWD</em>' operation.
	 * @see ImplementationTransformator.Rules.XSimplexConnectionToConnectionRule#isApplicable_FWD(org.moflon.tgg.runtime.Match)
	 * @generated
	 */
	EOperation getXSimplexConnectionToConnectionRule__IsApplicable_FWD__Match();

	/**
	 * Returns the meta object for the '{@link ImplementationTransformator.Rules.XSimplexConnectionToConnectionRule#registerObjectsToMatch_FWD(org.moflon.tgg.runtime.Match, xtextImplementation.xtextImpl.XContainer, xtextImplementation.xtextImpl.XDevice, xtextImplementation.xtextImpl.Connections, xtextImplementation.xtextImpl.Connections, xtextImplementation.xtextImpl.CableAttributes, xtextImplementation.xtextImpl.XDevice, xtextImplementation.xtextImpl.XCable) <em>Register Objects To Match FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Register Objects To Match FWD</em>' operation.
	 * @see ImplementationTransformator.Rules.XSimplexConnectionToConnectionRule#registerObjectsToMatch_FWD(org.moflon.tgg.runtime.Match, xtextImplementation.xtextImpl.XContainer, xtextImplementation.xtextImpl.XDevice, xtextImplementation.xtextImpl.Connections, xtextImplementation.xtextImpl.Connections, xtextImplementation.xtextImpl.CableAttributes, xtextImplementation.xtextImpl.XDevice, xtextImplementation.xtextImpl.XCable)
	 * @generated
	 */
	EOperation getXSimplexConnectionToConnectionRule__RegisterObjectsToMatch_FWD__Match_XContainer_XDevice_Connections_Connections_CableAttributes_XDevice_XCable();

	/**
	 * Returns the meta object for the '{@link ImplementationTransformator.Rules.XSimplexConnectionToConnectionRule#isAppropriate_solveCsp_FWD(org.moflon.tgg.runtime.Match, xtextImplementation.xtextImpl.XContainer, xtextImplementation.xtextImpl.XDevice, xtextImplementation.xtextImpl.Connections, xtextImplementation.xtextImpl.Connections, xtextImplementation.xtextImpl.CableAttributes, xtextImplementation.xtextImpl.XDevice, xtextImplementation.xtextImpl.XCable) <em>Is Appropriate solve Csp FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate solve Csp FWD</em>' operation.
	 * @see ImplementationTransformator.Rules.XSimplexConnectionToConnectionRule#isAppropriate_solveCsp_FWD(org.moflon.tgg.runtime.Match, xtextImplementation.xtextImpl.XContainer, xtextImplementation.xtextImpl.XDevice, xtextImplementation.xtextImpl.Connections, xtextImplementation.xtextImpl.Connections, xtextImplementation.xtextImpl.CableAttributes, xtextImplementation.xtextImpl.XDevice, xtextImplementation.xtextImpl.XCable)
	 * @generated
	 */
	EOperation getXSimplexConnectionToConnectionRule__IsAppropriate_solveCsp_FWD__Match_XContainer_XDevice_Connections_Connections_CableAttributes_XDevice_XCable();

	/**
	 * Returns the meta object for the '{@link ImplementationTransformator.Rules.XSimplexConnectionToConnectionRule#isAppropriate_checkCsp_FWD(org.moflon.tgg.language.csp.CSP) <em>Is Appropriate check Csp FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate check Csp FWD</em>' operation.
	 * @see ImplementationTransformator.Rules.XSimplexConnectionToConnectionRule#isAppropriate_checkCsp_FWD(org.moflon.tgg.language.csp.CSP)
	 * @generated
	 */
	EOperation getXSimplexConnectionToConnectionRule__IsAppropriate_checkCsp_FWD__CSP();

	/**
	 * Returns the meta object for the '{@link ImplementationTransformator.Rules.XSimplexConnectionToConnectionRule#isApplicable_solveCsp_FWD(org.moflon.tgg.runtime.IsApplicableMatch, xtextImplementation.xtextImpl.XContainer, ImplementationTransformator.XDeviceToDevice, implementation.Device, xtextImplementation.xtextImpl.XDevice, xtextImplementation.xtextImpl.Connections, xtextImplementation.xtextImpl.Connections, xtextImplementation.xtextImpl.CableAttributes, implementation.Container, xtextImplementation.xtextImpl.XDevice, implementation.Device, implementation.Cable, ImplementationTransformator.XDeviceToDevice, xtextImplementation.xtextImpl.XCable, ImplementationTransformator.XCableToCable) <em>Is Applicable solve Csp FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable solve Csp FWD</em>' operation.
	 * @see ImplementationTransformator.Rules.XSimplexConnectionToConnectionRule#isApplicable_solveCsp_FWD(org.moflon.tgg.runtime.IsApplicableMatch, xtextImplementation.xtextImpl.XContainer, ImplementationTransformator.XDeviceToDevice, implementation.Device, xtextImplementation.xtextImpl.XDevice, xtextImplementation.xtextImpl.Connections, xtextImplementation.xtextImpl.Connections, xtextImplementation.xtextImpl.CableAttributes, implementation.Container, xtextImplementation.xtextImpl.XDevice, implementation.Device, implementation.Cable, ImplementationTransformator.XDeviceToDevice, xtextImplementation.xtextImpl.XCable, ImplementationTransformator.XCableToCable)
	 * @generated
	 */
	EOperation getXSimplexConnectionToConnectionRule__IsApplicable_solveCsp_FWD__IsApplicableMatch_XContainer_XDeviceToDevice_Device_XDevice_Connections_Connections_CableAttributes_Container_XDevice_Device_Cable_XDeviceToDevice_XCable_XCableToCable();

	/**
	 * Returns the meta object for the '{@link ImplementationTransformator.Rules.XSimplexConnectionToConnectionRule#isApplicable_checkCsp_FWD(org.moflon.tgg.language.csp.CSP) <em>Is Applicable check Csp FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable check Csp FWD</em>' operation.
	 * @see ImplementationTransformator.Rules.XSimplexConnectionToConnectionRule#isApplicable_checkCsp_FWD(org.moflon.tgg.language.csp.CSP)
	 * @generated
	 */
	EOperation getXSimplexConnectionToConnectionRule__IsApplicable_checkCsp_FWD__CSP();

	/**
	 * Returns the meta object for the '{@link ImplementationTransformator.Rules.XSimplexConnectionToConnectionRule#registerObjects_FWD(org.moflon.tgg.runtime.PerformRuleResult, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject) <em>Register Objects FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Register Objects FWD</em>' operation.
	 * @see ImplementationTransformator.Rules.XSimplexConnectionToConnectionRule#registerObjects_FWD(org.moflon.tgg.runtime.PerformRuleResult, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	EOperation getXSimplexConnectionToConnectionRule__RegisterObjects_FWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject();

	/**
	 * Returns the meta object for the '{@link ImplementationTransformator.Rules.XSimplexConnectionToConnectionRule#checkTypes_FWD(org.moflon.tgg.runtime.Match) <em>Check Types FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check Types FWD</em>' operation.
	 * @see ImplementationTransformator.Rules.XSimplexConnectionToConnectionRule#checkTypes_FWD(org.moflon.tgg.runtime.Match)
	 * @generated
	 */
	EOperation getXSimplexConnectionToConnectionRule__CheckTypes_FWD__Match();

	/**
	 * Returns the meta object for the '{@link ImplementationTransformator.Rules.XSimplexConnectionToConnectionRule#isAppropriate_BWD(org.moflon.tgg.runtime.Match, implementation.Device, implementation.Container, implementation.Device, implementation.Cable) <em>Is Appropriate BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD</em>' operation.
	 * @see ImplementationTransformator.Rules.XSimplexConnectionToConnectionRule#isAppropriate_BWD(org.moflon.tgg.runtime.Match, implementation.Device, implementation.Container, implementation.Device, implementation.Cable)
	 * @generated
	 */
	EOperation getXSimplexConnectionToConnectionRule__IsAppropriate_BWD__Match_Device_Container_Device_Cable();

	/**
	 * Returns the meta object for the '{@link ImplementationTransformator.Rules.XSimplexConnectionToConnectionRule#perform_BWD(org.moflon.tgg.runtime.IsApplicableMatch) <em>Perform BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Perform BWD</em>' operation.
	 * @see ImplementationTransformator.Rules.XSimplexConnectionToConnectionRule#perform_BWD(org.moflon.tgg.runtime.IsApplicableMatch)
	 * @generated
	 */
	EOperation getXSimplexConnectionToConnectionRule__Perform_BWD__IsApplicableMatch();

	/**
	 * Returns the meta object for the '{@link ImplementationTransformator.Rules.XSimplexConnectionToConnectionRule#isApplicable_BWD(org.moflon.tgg.runtime.Match) <em>Is Applicable BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable BWD</em>' operation.
	 * @see ImplementationTransformator.Rules.XSimplexConnectionToConnectionRule#isApplicable_BWD(org.moflon.tgg.runtime.Match)
	 * @generated
	 */
	EOperation getXSimplexConnectionToConnectionRule__IsApplicable_BWD__Match();

	/**
	 * Returns the meta object for the '{@link ImplementationTransformator.Rules.XSimplexConnectionToConnectionRule#registerObjectsToMatch_BWD(org.moflon.tgg.runtime.Match, implementation.Device, implementation.Container, implementation.Device, implementation.Cable) <em>Register Objects To Match BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Register Objects To Match BWD</em>' operation.
	 * @see ImplementationTransformator.Rules.XSimplexConnectionToConnectionRule#registerObjectsToMatch_BWD(org.moflon.tgg.runtime.Match, implementation.Device, implementation.Container, implementation.Device, implementation.Cable)
	 * @generated
	 */
	EOperation getXSimplexConnectionToConnectionRule__RegisterObjectsToMatch_BWD__Match_Device_Container_Device_Cable();

	/**
	 * Returns the meta object for the '{@link ImplementationTransformator.Rules.XSimplexConnectionToConnectionRule#isAppropriate_solveCsp_BWD(org.moflon.tgg.runtime.Match, implementation.Device, implementation.Container, implementation.Device, implementation.Cable) <em>Is Appropriate solve Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate solve Csp BWD</em>' operation.
	 * @see ImplementationTransformator.Rules.XSimplexConnectionToConnectionRule#isAppropriate_solveCsp_BWD(org.moflon.tgg.runtime.Match, implementation.Device, implementation.Container, implementation.Device, implementation.Cable)
	 * @generated
	 */
	EOperation getXSimplexConnectionToConnectionRule__IsAppropriate_solveCsp_BWD__Match_Device_Container_Device_Cable();

	/**
	 * Returns the meta object for the '{@link ImplementationTransformator.Rules.XSimplexConnectionToConnectionRule#isAppropriate_checkCsp_BWD(org.moflon.tgg.language.csp.CSP) <em>Is Appropriate check Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate check Csp BWD</em>' operation.
	 * @see ImplementationTransformator.Rules.XSimplexConnectionToConnectionRule#isAppropriate_checkCsp_BWD(org.moflon.tgg.language.csp.CSP)
	 * @generated
	 */
	EOperation getXSimplexConnectionToConnectionRule__IsAppropriate_checkCsp_BWD__CSP();

	/**
	 * Returns the meta object for the '{@link ImplementationTransformator.Rules.XSimplexConnectionToConnectionRule#isApplicable_solveCsp_BWD(org.moflon.tgg.runtime.IsApplicableMatch, xtextImplementation.xtextImpl.XContainer, ImplementationTransformator.XDeviceToDevice, implementation.Device, xtextImplementation.xtextImpl.XDevice, xtextImplementation.xtextImpl.Connections, xtextImplementation.xtextImpl.Connections, xtextImplementation.xtextImpl.CableAttributes, implementation.Container, xtextImplementation.xtextImpl.XDevice, implementation.Device, implementation.Cable, ImplementationTransformator.XDeviceToDevice, xtextImplementation.xtextImpl.XCable, ImplementationTransformator.XCableToCable) <em>Is Applicable solve Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable solve Csp BWD</em>' operation.
	 * @see ImplementationTransformator.Rules.XSimplexConnectionToConnectionRule#isApplicable_solveCsp_BWD(org.moflon.tgg.runtime.IsApplicableMatch, xtextImplementation.xtextImpl.XContainer, ImplementationTransformator.XDeviceToDevice, implementation.Device, xtextImplementation.xtextImpl.XDevice, xtextImplementation.xtextImpl.Connections, xtextImplementation.xtextImpl.Connections, xtextImplementation.xtextImpl.CableAttributes, implementation.Container, xtextImplementation.xtextImpl.XDevice, implementation.Device, implementation.Cable, ImplementationTransformator.XDeviceToDevice, xtextImplementation.xtextImpl.XCable, ImplementationTransformator.XCableToCable)
	 * @generated
	 */
	EOperation getXSimplexConnectionToConnectionRule__IsApplicable_solveCsp_BWD__IsApplicableMatch_XContainer_XDeviceToDevice_Device_XDevice_Connections_Connections_CableAttributes_Container_XDevice_Device_Cable_XDeviceToDevice_XCable_XCableToCable();

	/**
	 * Returns the meta object for the '{@link ImplementationTransformator.Rules.XSimplexConnectionToConnectionRule#isApplicable_checkCsp_BWD(org.moflon.tgg.language.csp.CSP) <em>Is Applicable check Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable check Csp BWD</em>' operation.
	 * @see ImplementationTransformator.Rules.XSimplexConnectionToConnectionRule#isApplicable_checkCsp_BWD(org.moflon.tgg.language.csp.CSP)
	 * @generated
	 */
	EOperation getXSimplexConnectionToConnectionRule__IsApplicable_checkCsp_BWD__CSP();

	/**
	 * Returns the meta object for the '{@link ImplementationTransformator.Rules.XSimplexConnectionToConnectionRule#registerObjects_BWD(org.moflon.tgg.runtime.PerformRuleResult, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject) <em>Register Objects BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Register Objects BWD</em>' operation.
	 * @see ImplementationTransformator.Rules.XSimplexConnectionToConnectionRule#registerObjects_BWD(org.moflon.tgg.runtime.PerformRuleResult, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	EOperation getXSimplexConnectionToConnectionRule__RegisterObjects_BWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject();

	/**
	 * Returns the meta object for the '{@link ImplementationTransformator.Rules.XSimplexConnectionToConnectionRule#checkTypes_BWD(org.moflon.tgg.runtime.Match) <em>Check Types BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check Types BWD</em>' operation.
	 * @see ImplementationTransformator.Rules.XSimplexConnectionToConnectionRule#checkTypes_BWD(org.moflon.tgg.runtime.Match)
	 * @generated
	 */
	EOperation getXSimplexConnectionToConnectionRule__CheckTypes_BWD__Match();

	/**
	 * Returns the meta object for the '{@link ImplementationTransformator.Rules.XSimplexConnectionToConnectionRule#isAppropriate_BWD_EMoflonEdge_11(org.moflon.tgg.runtime.EMoflonEdge) <em>Is Appropriate BWD EMoflon Edge 11</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD EMoflon Edge 11</em>' operation.
	 * @see ImplementationTransformator.Rules.XSimplexConnectionToConnectionRule#isAppropriate_BWD_EMoflonEdge_11(org.moflon.tgg.runtime.EMoflonEdge)
	 * @generated
	 */
	EOperation getXSimplexConnectionToConnectionRule__IsAppropriate_BWD_EMoflonEdge_11__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link ImplementationTransformator.Rules.XSimplexConnectionToConnectionRule#isAppropriate_FWD_EMoflonEdge_7(org.moflon.tgg.runtime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 7</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 7</em>' operation.
	 * @see ImplementationTransformator.Rules.XSimplexConnectionToConnectionRule#isAppropriate_FWD_EMoflonEdge_7(org.moflon.tgg.runtime.EMoflonEdge)
	 * @generated
	 */
	EOperation getXSimplexConnectionToConnectionRule__IsAppropriate_FWD_EMoflonEdge_7__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link ImplementationTransformator.Rules.XSimplexConnectionToConnectionRule#checkAttributes_FWD(org.moflon.tgg.runtime.TripleMatch) <em>Check Attributes FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check Attributes FWD</em>' operation.
	 * @see ImplementationTransformator.Rules.XSimplexConnectionToConnectionRule#checkAttributes_FWD(org.moflon.tgg.runtime.TripleMatch)
	 * @generated
	 */
	EOperation getXSimplexConnectionToConnectionRule__CheckAttributes_FWD__TripleMatch();

	/**
	 * Returns the meta object for the '{@link ImplementationTransformator.Rules.XSimplexConnectionToConnectionRule#checkAttributes_BWD(org.moflon.tgg.runtime.TripleMatch) <em>Check Attributes BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check Attributes BWD</em>' operation.
	 * @see ImplementationTransformator.Rules.XSimplexConnectionToConnectionRule#checkAttributes_BWD(org.moflon.tgg.runtime.TripleMatch)
	 * @generated
	 */
	EOperation getXSimplexConnectionToConnectionRule__CheckAttributes_BWD__TripleMatch();

	/**
	 * Returns the meta object for the '{@link ImplementationTransformator.Rules.XSimplexConnectionToConnectionRule#isApplicable_CC(org.moflon.tgg.runtime.Match, org.moflon.tgg.runtime.Match) <em>Is Applicable CC</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable CC</em>' operation.
	 * @see ImplementationTransformator.Rules.XSimplexConnectionToConnectionRule#isApplicable_CC(org.moflon.tgg.runtime.Match, org.moflon.tgg.runtime.Match)
	 * @generated
	 */
	EOperation getXSimplexConnectionToConnectionRule__IsApplicable_CC__Match_Match();

	/**
	 * Returns the meta object for the '{@link ImplementationTransformator.Rules.XSimplexConnectionToConnectionRule#isApplicable_solveCsp_CC(xtextImplementation.xtextImpl.XContainer, implementation.Device, xtextImplementation.xtextImpl.XDevice, xtextImplementation.xtextImpl.Connections, xtextImplementation.xtextImpl.Connections, xtextImplementation.xtextImpl.CableAttributes, implementation.Container, xtextImplementation.xtextImpl.XDevice, implementation.Device, implementation.Cable, xtextImplementation.xtextImpl.XCable, org.moflon.tgg.runtime.Match, org.moflon.tgg.runtime.Match) <em>Is Applicable solve Csp CC</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable solve Csp CC</em>' operation.
	 * @see ImplementationTransformator.Rules.XSimplexConnectionToConnectionRule#isApplicable_solveCsp_CC(xtextImplementation.xtextImpl.XContainer, implementation.Device, xtextImplementation.xtextImpl.XDevice, xtextImplementation.xtextImpl.Connections, xtextImplementation.xtextImpl.Connections, xtextImplementation.xtextImpl.CableAttributes, implementation.Container, xtextImplementation.xtextImpl.XDevice, implementation.Device, implementation.Cable, xtextImplementation.xtextImpl.XCable, org.moflon.tgg.runtime.Match, org.moflon.tgg.runtime.Match)
	 * @generated
	 */
	EOperation getXSimplexConnectionToConnectionRule__IsApplicable_solveCsp_CC__XContainer_Device_XDevice_Connections_Connections_CableAttributes_Container_XDevice_Device_Cable_XCable_Match_Match();

	/**
	 * Returns the meta object for the '{@link ImplementationTransformator.Rules.XSimplexConnectionToConnectionRule#isApplicable_checkCsp_CC(org.moflon.tgg.language.csp.CSP) <em>Is Applicable check Csp CC</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable check Csp CC</em>' operation.
	 * @see ImplementationTransformator.Rules.XSimplexConnectionToConnectionRule#isApplicable_checkCsp_CC(org.moflon.tgg.language.csp.CSP)
	 * @generated
	 */
	EOperation getXSimplexConnectionToConnectionRule__IsApplicable_checkCsp_CC__CSP();

	/**
	 * Returns the meta object for the '{@link ImplementationTransformator.Rules.XSimplexConnectionToConnectionRule#checkDEC_FWD(xtextImplementation.xtextImpl.XContainer, xtextImplementation.xtextImpl.XDevice, xtextImplementation.xtextImpl.Connections, xtextImplementation.xtextImpl.Connections, xtextImplementation.xtextImpl.CableAttributes, xtextImplementation.xtextImpl.XDevice, xtextImplementation.xtextImpl.XCable) <em>Check DEC FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check DEC FWD</em>' operation.
	 * @see ImplementationTransformator.Rules.XSimplexConnectionToConnectionRule#checkDEC_FWD(xtextImplementation.xtextImpl.XContainer, xtextImplementation.xtextImpl.XDevice, xtextImplementation.xtextImpl.Connections, xtextImplementation.xtextImpl.Connections, xtextImplementation.xtextImpl.CableAttributes, xtextImplementation.xtextImpl.XDevice, xtextImplementation.xtextImpl.XCable)
	 * @generated
	 */
	EOperation getXSimplexConnectionToConnectionRule__CheckDEC_FWD__XContainer_XDevice_Connections_Connections_CableAttributes_XDevice_XCable();

	/**
	 * Returns the meta object for the '{@link ImplementationTransformator.Rules.XSimplexConnectionToConnectionRule#checkDEC_BWD(implementation.Device, implementation.Container, implementation.Device, implementation.Cable) <em>Check DEC BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check DEC BWD</em>' operation.
	 * @see ImplementationTransformator.Rules.XSimplexConnectionToConnectionRule#checkDEC_BWD(implementation.Device, implementation.Container, implementation.Device, implementation.Cable)
	 * @generated
	 */
	EOperation getXSimplexConnectionToConnectionRule__CheckDEC_BWD__Device_Container_Device_Cable();

	/**
	 * Returns the meta object for the '{@link ImplementationTransformator.Rules.XSimplexConnectionToConnectionRule#generateModel(org.moflon.tgg.language.modelgenerator.RuleEntryContainer, ImplementationTransformator.XCableToCable) <em>Generate Model</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Generate Model</em>' operation.
	 * @see ImplementationTransformator.Rules.XSimplexConnectionToConnectionRule#generateModel(org.moflon.tgg.language.modelgenerator.RuleEntryContainer, ImplementationTransformator.XCableToCable)
	 * @generated
	 */
	EOperation getXSimplexConnectionToConnectionRule__GenerateModel__RuleEntryContainer_XCableToCable();

	/**
	 * Returns the meta object for the '{@link ImplementationTransformator.Rules.XSimplexConnectionToConnectionRule#generateModel_solveCsp_BWD(org.moflon.tgg.runtime.IsApplicableMatch, xtextImplementation.xtextImpl.XContainer, ImplementationTransformator.XDeviceToDevice, implementation.Device, xtextImplementation.xtextImpl.XDevice, xtextImplementation.xtextImpl.Connections, xtextImplementation.xtextImpl.Connections, xtextImplementation.xtextImpl.CableAttributes, implementation.Container, xtextImplementation.xtextImpl.XDevice, implementation.Device, implementation.Cable, ImplementationTransformator.XDeviceToDevice, xtextImplementation.xtextImpl.XCable, ImplementationTransformator.XCableToCable, org.moflon.tgg.runtime.ModelgeneratorRuleResult) <em>Generate Model solve Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Generate Model solve Csp BWD</em>' operation.
	 * @see ImplementationTransformator.Rules.XSimplexConnectionToConnectionRule#generateModel_solveCsp_BWD(org.moflon.tgg.runtime.IsApplicableMatch, xtextImplementation.xtextImpl.XContainer, ImplementationTransformator.XDeviceToDevice, implementation.Device, xtextImplementation.xtextImpl.XDevice, xtextImplementation.xtextImpl.Connections, xtextImplementation.xtextImpl.Connections, xtextImplementation.xtextImpl.CableAttributes, implementation.Container, xtextImplementation.xtextImpl.XDevice, implementation.Device, implementation.Cable, ImplementationTransformator.XDeviceToDevice, xtextImplementation.xtextImpl.XCable, ImplementationTransformator.XCableToCable, org.moflon.tgg.runtime.ModelgeneratorRuleResult)
	 * @generated
	 */
	EOperation getXSimplexConnectionToConnectionRule__GenerateModel_solveCsp_BWD__IsApplicableMatch_XContainer_XDeviceToDevice_Device_XDevice_Connections_Connections_CableAttributes_Container_XDevice_Device_Cable_XDeviceToDevice_XCable_XCableToCable_ModelgeneratorRuleResult();

	/**
	 * Returns the meta object for the '{@link ImplementationTransformator.Rules.XSimplexConnectionToConnectionRule#generateModel_checkCsp_BWD(org.moflon.tgg.language.csp.CSP) <em>Generate Model check Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Generate Model check Csp BWD</em>' operation.
	 * @see ImplementationTransformator.Rules.XSimplexConnectionToConnectionRule#generateModel_checkCsp_BWD(org.moflon.tgg.language.csp.CSP)
	 * @generated
	 */
	EOperation getXSimplexConnectionToConnectionRule__GenerateModel_checkCsp_BWD__CSP();

	/**
	 * Returns the meta object for class '{@link ImplementationTransformator.Rules.XDuplexConnectionToConnectionRule <em>XDuplex Connection To Connection Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>XDuplex Connection To Connection Rule</em>'.
	 * @see ImplementationTransformator.Rules.XDuplexConnectionToConnectionRule
	 * @generated
	 */
	EClass getXDuplexConnectionToConnectionRule();

	/**
	 * Returns the meta object for the '{@link ImplementationTransformator.Rules.XDuplexConnectionToConnectionRule#isAppropriate_FWD(org.moflon.tgg.runtime.Match, xtextImplementation.xtextImpl.XContainer, xtextImplementation.xtextImpl.XDevice, xtextImplementation.xtextImpl.Connections, xtextImplementation.xtextImpl.XDevice, xtextImplementation.xtextImpl.XCable, xtextImplementation.xtextImpl.Connections, xtextImplementation.xtextImpl.CableAttributes) <em>Is Appropriate FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD</em>' operation.
	 * @see ImplementationTransformator.Rules.XDuplexConnectionToConnectionRule#isAppropriate_FWD(org.moflon.tgg.runtime.Match, xtextImplementation.xtextImpl.XContainer, xtextImplementation.xtextImpl.XDevice, xtextImplementation.xtextImpl.Connections, xtextImplementation.xtextImpl.XDevice, xtextImplementation.xtextImpl.XCable, xtextImplementation.xtextImpl.Connections, xtextImplementation.xtextImpl.CableAttributes)
	 * @generated
	 */
	EOperation getXDuplexConnectionToConnectionRule__IsAppropriate_FWD__Match_XContainer_XDevice_Connections_XDevice_XCable_Connections_CableAttributes();

	/**
	 * Returns the meta object for the '{@link ImplementationTransformator.Rules.XDuplexConnectionToConnectionRule#perform_FWD(org.moflon.tgg.runtime.IsApplicableMatch) <em>Perform FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Perform FWD</em>' operation.
	 * @see ImplementationTransformator.Rules.XDuplexConnectionToConnectionRule#perform_FWD(org.moflon.tgg.runtime.IsApplicableMatch)
	 * @generated
	 */
	EOperation getXDuplexConnectionToConnectionRule__Perform_FWD__IsApplicableMatch();

	/**
	 * Returns the meta object for the '{@link ImplementationTransformator.Rules.XDuplexConnectionToConnectionRule#isApplicable_FWD(org.moflon.tgg.runtime.Match) <em>Is Applicable FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable FWD</em>' operation.
	 * @see ImplementationTransformator.Rules.XDuplexConnectionToConnectionRule#isApplicable_FWD(org.moflon.tgg.runtime.Match)
	 * @generated
	 */
	EOperation getXDuplexConnectionToConnectionRule__IsApplicable_FWD__Match();

	/**
	 * Returns the meta object for the '{@link ImplementationTransformator.Rules.XDuplexConnectionToConnectionRule#registerObjectsToMatch_FWD(org.moflon.tgg.runtime.Match, xtextImplementation.xtextImpl.XContainer, xtextImplementation.xtextImpl.XDevice, xtextImplementation.xtextImpl.Connections, xtextImplementation.xtextImpl.XDevice, xtextImplementation.xtextImpl.XCable, xtextImplementation.xtextImpl.Connections, xtextImplementation.xtextImpl.CableAttributes) <em>Register Objects To Match FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Register Objects To Match FWD</em>' operation.
	 * @see ImplementationTransformator.Rules.XDuplexConnectionToConnectionRule#registerObjectsToMatch_FWD(org.moflon.tgg.runtime.Match, xtextImplementation.xtextImpl.XContainer, xtextImplementation.xtextImpl.XDevice, xtextImplementation.xtextImpl.Connections, xtextImplementation.xtextImpl.XDevice, xtextImplementation.xtextImpl.XCable, xtextImplementation.xtextImpl.Connections, xtextImplementation.xtextImpl.CableAttributes)
	 * @generated
	 */
	EOperation getXDuplexConnectionToConnectionRule__RegisterObjectsToMatch_FWD__Match_XContainer_XDevice_Connections_XDevice_XCable_Connections_CableAttributes();

	/**
	 * Returns the meta object for the '{@link ImplementationTransformator.Rules.XDuplexConnectionToConnectionRule#isAppropriate_solveCsp_FWD(org.moflon.tgg.runtime.Match, xtextImplementation.xtextImpl.XContainer, xtextImplementation.xtextImpl.XDevice, xtextImplementation.xtextImpl.Connections, xtextImplementation.xtextImpl.XDevice, xtextImplementation.xtextImpl.XCable, xtextImplementation.xtextImpl.Connections, xtextImplementation.xtextImpl.CableAttributes) <em>Is Appropriate solve Csp FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate solve Csp FWD</em>' operation.
	 * @see ImplementationTransformator.Rules.XDuplexConnectionToConnectionRule#isAppropriate_solveCsp_FWD(org.moflon.tgg.runtime.Match, xtextImplementation.xtextImpl.XContainer, xtextImplementation.xtextImpl.XDevice, xtextImplementation.xtextImpl.Connections, xtextImplementation.xtextImpl.XDevice, xtextImplementation.xtextImpl.XCable, xtextImplementation.xtextImpl.Connections, xtextImplementation.xtextImpl.CableAttributes)
	 * @generated
	 */
	EOperation getXDuplexConnectionToConnectionRule__IsAppropriate_solveCsp_FWD__Match_XContainer_XDevice_Connections_XDevice_XCable_Connections_CableAttributes();

	/**
	 * Returns the meta object for the '{@link ImplementationTransformator.Rules.XDuplexConnectionToConnectionRule#isAppropriate_checkCsp_FWD(org.moflon.tgg.language.csp.CSP) <em>Is Appropriate check Csp FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate check Csp FWD</em>' operation.
	 * @see ImplementationTransformator.Rules.XDuplexConnectionToConnectionRule#isAppropriate_checkCsp_FWD(org.moflon.tgg.language.csp.CSP)
	 * @generated
	 */
	EOperation getXDuplexConnectionToConnectionRule__IsAppropriate_checkCsp_FWD__CSP();

	/**
	 * Returns the meta object for the '{@link ImplementationTransformator.Rules.XDuplexConnectionToConnectionRule#isApplicable_solveCsp_FWD(org.moflon.tgg.runtime.IsApplicableMatch, ImplementationTransformator.XDeviceToDevice, implementation.Device, xtextImplementation.xtextImpl.XContainer, implementation.Container, xtextImplementation.xtextImpl.XDevice, xtextImplementation.xtextImpl.Connections, ImplementationTransformator.XCableToCable, xtextImplementation.xtextImpl.XDevice, implementation.Device, ImplementationTransformator.XCableToCable, xtextImplementation.xtextImpl.XCable, ImplementationTransformator.XDeviceToDevice, xtextImplementation.xtextImpl.Connections, implementation.Cable, implementation.Cable, xtextImplementation.xtextImpl.CableAttributes) <em>Is Applicable solve Csp FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable solve Csp FWD</em>' operation.
	 * @see ImplementationTransformator.Rules.XDuplexConnectionToConnectionRule#isApplicable_solveCsp_FWD(org.moflon.tgg.runtime.IsApplicableMatch, ImplementationTransformator.XDeviceToDevice, implementation.Device, xtextImplementation.xtextImpl.XContainer, implementation.Container, xtextImplementation.xtextImpl.XDevice, xtextImplementation.xtextImpl.Connections, ImplementationTransformator.XCableToCable, xtextImplementation.xtextImpl.XDevice, implementation.Device, ImplementationTransformator.XCableToCable, xtextImplementation.xtextImpl.XCable, ImplementationTransformator.XDeviceToDevice, xtextImplementation.xtextImpl.Connections, implementation.Cable, implementation.Cable, xtextImplementation.xtextImpl.CableAttributes)
	 * @generated
	 */
	EOperation getXDuplexConnectionToConnectionRule__IsApplicable_solveCsp_FWD__IsApplicableMatch_XDeviceToDevice_Device_XContainer_Container_XDevice_Connections_XCableToCable_XDevice_Device_XCableToCable_XCable_XDeviceToDevice_Connections_Cable_Cable_CableAttributes();

	/**
	 * Returns the meta object for the '{@link ImplementationTransformator.Rules.XDuplexConnectionToConnectionRule#isApplicable_checkCsp_FWD(org.moflon.tgg.language.csp.CSP) <em>Is Applicable check Csp FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable check Csp FWD</em>' operation.
	 * @see ImplementationTransformator.Rules.XDuplexConnectionToConnectionRule#isApplicable_checkCsp_FWD(org.moflon.tgg.language.csp.CSP)
	 * @generated
	 */
	EOperation getXDuplexConnectionToConnectionRule__IsApplicable_checkCsp_FWD__CSP();

	/**
	 * Returns the meta object for the '{@link ImplementationTransformator.Rules.XDuplexConnectionToConnectionRule#registerObjects_FWD(org.moflon.tgg.runtime.PerformRuleResult, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject) <em>Register Objects FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Register Objects FWD</em>' operation.
	 * @see ImplementationTransformator.Rules.XDuplexConnectionToConnectionRule#registerObjects_FWD(org.moflon.tgg.runtime.PerformRuleResult, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	EOperation getXDuplexConnectionToConnectionRule__RegisterObjects_FWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject();

	/**
	 * Returns the meta object for the '{@link ImplementationTransformator.Rules.XDuplexConnectionToConnectionRule#checkTypes_FWD(org.moflon.tgg.runtime.Match) <em>Check Types FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check Types FWD</em>' operation.
	 * @see ImplementationTransformator.Rules.XDuplexConnectionToConnectionRule#checkTypes_FWD(org.moflon.tgg.runtime.Match)
	 * @generated
	 */
	EOperation getXDuplexConnectionToConnectionRule__CheckTypes_FWD__Match();

	/**
	 * Returns the meta object for the '{@link ImplementationTransformator.Rules.XDuplexConnectionToConnectionRule#isAppropriate_BWD(org.moflon.tgg.runtime.Match, implementation.Device, implementation.Container, implementation.Device, implementation.Cable, implementation.Cable) <em>Is Appropriate BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD</em>' operation.
	 * @see ImplementationTransformator.Rules.XDuplexConnectionToConnectionRule#isAppropriate_BWD(org.moflon.tgg.runtime.Match, implementation.Device, implementation.Container, implementation.Device, implementation.Cable, implementation.Cable)
	 * @generated
	 */
	EOperation getXDuplexConnectionToConnectionRule__IsAppropriate_BWD__Match_Device_Container_Device_Cable_Cable();

	/**
	 * Returns the meta object for the '{@link ImplementationTransformator.Rules.XDuplexConnectionToConnectionRule#perform_BWD(org.moflon.tgg.runtime.IsApplicableMatch) <em>Perform BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Perform BWD</em>' operation.
	 * @see ImplementationTransformator.Rules.XDuplexConnectionToConnectionRule#perform_BWD(org.moflon.tgg.runtime.IsApplicableMatch)
	 * @generated
	 */
	EOperation getXDuplexConnectionToConnectionRule__Perform_BWD__IsApplicableMatch();

	/**
	 * Returns the meta object for the '{@link ImplementationTransformator.Rules.XDuplexConnectionToConnectionRule#isApplicable_BWD(org.moflon.tgg.runtime.Match) <em>Is Applicable BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable BWD</em>' operation.
	 * @see ImplementationTransformator.Rules.XDuplexConnectionToConnectionRule#isApplicable_BWD(org.moflon.tgg.runtime.Match)
	 * @generated
	 */
	EOperation getXDuplexConnectionToConnectionRule__IsApplicable_BWD__Match();

	/**
	 * Returns the meta object for the '{@link ImplementationTransformator.Rules.XDuplexConnectionToConnectionRule#registerObjectsToMatch_BWD(org.moflon.tgg.runtime.Match, implementation.Device, implementation.Container, implementation.Device, implementation.Cable, implementation.Cable) <em>Register Objects To Match BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Register Objects To Match BWD</em>' operation.
	 * @see ImplementationTransformator.Rules.XDuplexConnectionToConnectionRule#registerObjectsToMatch_BWD(org.moflon.tgg.runtime.Match, implementation.Device, implementation.Container, implementation.Device, implementation.Cable, implementation.Cable)
	 * @generated
	 */
	EOperation getXDuplexConnectionToConnectionRule__RegisterObjectsToMatch_BWD__Match_Device_Container_Device_Cable_Cable();

	/**
	 * Returns the meta object for the '{@link ImplementationTransformator.Rules.XDuplexConnectionToConnectionRule#isAppropriate_solveCsp_BWD(org.moflon.tgg.runtime.Match, implementation.Device, implementation.Container, implementation.Device, implementation.Cable, implementation.Cable) <em>Is Appropriate solve Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate solve Csp BWD</em>' operation.
	 * @see ImplementationTransformator.Rules.XDuplexConnectionToConnectionRule#isAppropriate_solveCsp_BWD(org.moflon.tgg.runtime.Match, implementation.Device, implementation.Container, implementation.Device, implementation.Cable, implementation.Cable)
	 * @generated
	 */
	EOperation getXDuplexConnectionToConnectionRule__IsAppropriate_solveCsp_BWD__Match_Device_Container_Device_Cable_Cable();

	/**
	 * Returns the meta object for the '{@link ImplementationTransformator.Rules.XDuplexConnectionToConnectionRule#isAppropriate_checkCsp_BWD(org.moflon.tgg.language.csp.CSP) <em>Is Appropriate check Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate check Csp BWD</em>' operation.
	 * @see ImplementationTransformator.Rules.XDuplexConnectionToConnectionRule#isAppropriate_checkCsp_BWD(org.moflon.tgg.language.csp.CSP)
	 * @generated
	 */
	EOperation getXDuplexConnectionToConnectionRule__IsAppropriate_checkCsp_BWD__CSP();

	/**
	 * Returns the meta object for the '{@link ImplementationTransformator.Rules.XDuplexConnectionToConnectionRule#isApplicable_solveCsp_BWD(org.moflon.tgg.runtime.IsApplicableMatch, ImplementationTransformator.XDeviceToDevice, implementation.Device, xtextImplementation.xtextImpl.XContainer, implementation.Container, xtextImplementation.xtextImpl.XDevice, xtextImplementation.xtextImpl.Connections, ImplementationTransformator.XCableToCable, xtextImplementation.xtextImpl.XDevice, implementation.Device, ImplementationTransformator.XCableToCable, xtextImplementation.xtextImpl.XCable, ImplementationTransformator.XDeviceToDevice, xtextImplementation.xtextImpl.Connections, implementation.Cable, implementation.Cable, xtextImplementation.xtextImpl.CableAttributes) <em>Is Applicable solve Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable solve Csp BWD</em>' operation.
	 * @see ImplementationTransformator.Rules.XDuplexConnectionToConnectionRule#isApplicable_solveCsp_BWD(org.moflon.tgg.runtime.IsApplicableMatch, ImplementationTransformator.XDeviceToDevice, implementation.Device, xtextImplementation.xtextImpl.XContainer, implementation.Container, xtextImplementation.xtextImpl.XDevice, xtextImplementation.xtextImpl.Connections, ImplementationTransformator.XCableToCable, xtextImplementation.xtextImpl.XDevice, implementation.Device, ImplementationTransformator.XCableToCable, xtextImplementation.xtextImpl.XCable, ImplementationTransformator.XDeviceToDevice, xtextImplementation.xtextImpl.Connections, implementation.Cable, implementation.Cable, xtextImplementation.xtextImpl.CableAttributes)
	 * @generated
	 */
	EOperation getXDuplexConnectionToConnectionRule__IsApplicable_solveCsp_BWD__IsApplicableMatch_XDeviceToDevice_Device_XContainer_Container_XDevice_Connections_XCableToCable_XDevice_Device_XCableToCable_XCable_XDeviceToDevice_Connections_Cable_Cable_CableAttributes();

	/**
	 * Returns the meta object for the '{@link ImplementationTransformator.Rules.XDuplexConnectionToConnectionRule#isApplicable_checkCsp_BWD(org.moflon.tgg.language.csp.CSP) <em>Is Applicable check Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable check Csp BWD</em>' operation.
	 * @see ImplementationTransformator.Rules.XDuplexConnectionToConnectionRule#isApplicable_checkCsp_BWD(org.moflon.tgg.language.csp.CSP)
	 * @generated
	 */
	EOperation getXDuplexConnectionToConnectionRule__IsApplicable_checkCsp_BWD__CSP();

	/**
	 * Returns the meta object for the '{@link ImplementationTransformator.Rules.XDuplexConnectionToConnectionRule#registerObjects_BWD(org.moflon.tgg.runtime.PerformRuleResult, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject) <em>Register Objects BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Register Objects BWD</em>' operation.
	 * @see ImplementationTransformator.Rules.XDuplexConnectionToConnectionRule#registerObjects_BWD(org.moflon.tgg.runtime.PerformRuleResult, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	EOperation getXDuplexConnectionToConnectionRule__RegisterObjects_BWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject();

	/**
	 * Returns the meta object for the '{@link ImplementationTransformator.Rules.XDuplexConnectionToConnectionRule#checkTypes_BWD(org.moflon.tgg.runtime.Match) <em>Check Types BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check Types BWD</em>' operation.
	 * @see ImplementationTransformator.Rules.XDuplexConnectionToConnectionRule#checkTypes_BWD(org.moflon.tgg.runtime.Match)
	 * @generated
	 */
	EOperation getXDuplexConnectionToConnectionRule__CheckTypes_BWD__Match();

	/**
	 * Returns the meta object for the '{@link ImplementationTransformator.Rules.XDuplexConnectionToConnectionRule#isAppropriate_BWD_EMoflonEdge_12(org.moflon.tgg.runtime.EMoflonEdge) <em>Is Appropriate BWD EMoflon Edge 12</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD EMoflon Edge 12</em>' operation.
	 * @see ImplementationTransformator.Rules.XDuplexConnectionToConnectionRule#isAppropriate_BWD_EMoflonEdge_12(org.moflon.tgg.runtime.EMoflonEdge)
	 * @generated
	 */
	EOperation getXDuplexConnectionToConnectionRule__IsAppropriate_BWD_EMoflonEdge_12__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link ImplementationTransformator.Rules.XDuplexConnectionToConnectionRule#isAppropriate_FWD_EMoflonEdge_8(org.moflon.tgg.runtime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 8</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 8</em>' operation.
	 * @see ImplementationTransformator.Rules.XDuplexConnectionToConnectionRule#isAppropriate_FWD_EMoflonEdge_8(org.moflon.tgg.runtime.EMoflonEdge)
	 * @generated
	 */
	EOperation getXDuplexConnectionToConnectionRule__IsAppropriate_FWD_EMoflonEdge_8__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link ImplementationTransformator.Rules.XDuplexConnectionToConnectionRule#checkAttributes_FWD(org.moflon.tgg.runtime.TripleMatch) <em>Check Attributes FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check Attributes FWD</em>' operation.
	 * @see ImplementationTransformator.Rules.XDuplexConnectionToConnectionRule#checkAttributes_FWD(org.moflon.tgg.runtime.TripleMatch)
	 * @generated
	 */
	EOperation getXDuplexConnectionToConnectionRule__CheckAttributes_FWD__TripleMatch();

	/**
	 * Returns the meta object for the '{@link ImplementationTransformator.Rules.XDuplexConnectionToConnectionRule#checkAttributes_BWD(org.moflon.tgg.runtime.TripleMatch) <em>Check Attributes BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check Attributes BWD</em>' operation.
	 * @see ImplementationTransformator.Rules.XDuplexConnectionToConnectionRule#checkAttributes_BWD(org.moflon.tgg.runtime.TripleMatch)
	 * @generated
	 */
	EOperation getXDuplexConnectionToConnectionRule__CheckAttributes_BWD__TripleMatch();

	/**
	 * Returns the meta object for the '{@link ImplementationTransformator.Rules.XDuplexConnectionToConnectionRule#isApplicable_CC(org.moflon.tgg.runtime.Match, org.moflon.tgg.runtime.Match) <em>Is Applicable CC</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable CC</em>' operation.
	 * @see ImplementationTransformator.Rules.XDuplexConnectionToConnectionRule#isApplicable_CC(org.moflon.tgg.runtime.Match, org.moflon.tgg.runtime.Match)
	 * @generated
	 */
	EOperation getXDuplexConnectionToConnectionRule__IsApplicable_CC__Match_Match();

	/**
	 * Returns the meta object for the '{@link ImplementationTransformator.Rules.XDuplexConnectionToConnectionRule#isApplicable_solveCsp_CC(implementation.Device, xtextImplementation.xtextImpl.XContainer, implementation.Container, xtextImplementation.xtextImpl.XDevice, xtextImplementation.xtextImpl.Connections, xtextImplementation.xtextImpl.XDevice, implementation.Device, xtextImplementation.xtextImpl.XCable, xtextImplementation.xtextImpl.Connections, implementation.Cable, implementation.Cable, xtextImplementation.xtextImpl.CableAttributes, org.moflon.tgg.runtime.Match, org.moflon.tgg.runtime.Match) <em>Is Applicable solve Csp CC</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable solve Csp CC</em>' operation.
	 * @see ImplementationTransformator.Rules.XDuplexConnectionToConnectionRule#isApplicable_solveCsp_CC(implementation.Device, xtextImplementation.xtextImpl.XContainer, implementation.Container, xtextImplementation.xtextImpl.XDevice, xtextImplementation.xtextImpl.Connections, xtextImplementation.xtextImpl.XDevice, implementation.Device, xtextImplementation.xtextImpl.XCable, xtextImplementation.xtextImpl.Connections, implementation.Cable, implementation.Cable, xtextImplementation.xtextImpl.CableAttributes, org.moflon.tgg.runtime.Match, org.moflon.tgg.runtime.Match)
	 * @generated
	 */
	EOperation getXDuplexConnectionToConnectionRule__IsApplicable_solveCsp_CC__Device_XContainer_Container_XDevice_Connections_XDevice_Device_XCable_Connections_Cable_Cable_CableAttributes_Match_Match();

	/**
	 * Returns the meta object for the '{@link ImplementationTransformator.Rules.XDuplexConnectionToConnectionRule#isApplicable_checkCsp_CC(org.moflon.tgg.language.csp.CSP) <em>Is Applicable check Csp CC</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable check Csp CC</em>' operation.
	 * @see ImplementationTransformator.Rules.XDuplexConnectionToConnectionRule#isApplicable_checkCsp_CC(org.moflon.tgg.language.csp.CSP)
	 * @generated
	 */
	EOperation getXDuplexConnectionToConnectionRule__IsApplicable_checkCsp_CC__CSP();

	/**
	 * Returns the meta object for the '{@link ImplementationTransformator.Rules.XDuplexConnectionToConnectionRule#checkDEC_FWD(xtextImplementation.xtextImpl.XContainer, xtextImplementation.xtextImpl.XDevice, xtextImplementation.xtextImpl.Connections, xtextImplementation.xtextImpl.XDevice, xtextImplementation.xtextImpl.XCable, xtextImplementation.xtextImpl.Connections, xtextImplementation.xtextImpl.CableAttributes) <em>Check DEC FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check DEC FWD</em>' operation.
	 * @see ImplementationTransformator.Rules.XDuplexConnectionToConnectionRule#checkDEC_FWD(xtextImplementation.xtextImpl.XContainer, xtextImplementation.xtextImpl.XDevice, xtextImplementation.xtextImpl.Connections, xtextImplementation.xtextImpl.XDevice, xtextImplementation.xtextImpl.XCable, xtextImplementation.xtextImpl.Connections, xtextImplementation.xtextImpl.CableAttributes)
	 * @generated
	 */
	EOperation getXDuplexConnectionToConnectionRule__CheckDEC_FWD__XContainer_XDevice_Connections_XDevice_XCable_Connections_CableAttributes();

	/**
	 * Returns the meta object for the '{@link ImplementationTransformator.Rules.XDuplexConnectionToConnectionRule#checkDEC_BWD(implementation.Device, implementation.Container, implementation.Device, implementation.Cable, implementation.Cable) <em>Check DEC BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check DEC BWD</em>' operation.
	 * @see ImplementationTransformator.Rules.XDuplexConnectionToConnectionRule#checkDEC_BWD(implementation.Device, implementation.Container, implementation.Device, implementation.Cable, implementation.Cable)
	 * @generated
	 */
	EOperation getXDuplexConnectionToConnectionRule__CheckDEC_BWD__Device_Container_Device_Cable_Cable();

	/**
	 * Returns the meta object for the '{@link ImplementationTransformator.Rules.XDuplexConnectionToConnectionRule#generateModel(org.moflon.tgg.language.modelgenerator.RuleEntryContainer, ImplementationTransformator.XDeviceToDevice) <em>Generate Model</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Generate Model</em>' operation.
	 * @see ImplementationTransformator.Rules.XDuplexConnectionToConnectionRule#generateModel(org.moflon.tgg.language.modelgenerator.RuleEntryContainer, ImplementationTransformator.XDeviceToDevice)
	 * @generated
	 */
	EOperation getXDuplexConnectionToConnectionRule__GenerateModel__RuleEntryContainer_XDeviceToDevice();

	/**
	 * Returns the meta object for the '{@link ImplementationTransformator.Rules.XDuplexConnectionToConnectionRule#generateModel_solveCsp_BWD(org.moflon.tgg.runtime.IsApplicableMatch, ImplementationTransformator.XDeviceToDevice, implementation.Device, xtextImplementation.xtextImpl.XContainer, implementation.Container, xtextImplementation.xtextImpl.XDevice, xtextImplementation.xtextImpl.Connections, ImplementationTransformator.XCableToCable, xtextImplementation.xtextImpl.XDevice, implementation.Device, ImplementationTransformator.XCableToCable, xtextImplementation.xtextImpl.XCable, ImplementationTransformator.XDeviceToDevice, xtextImplementation.xtextImpl.Connections, implementation.Cable, implementation.Cable, xtextImplementation.xtextImpl.CableAttributes, org.moflon.tgg.runtime.ModelgeneratorRuleResult) <em>Generate Model solve Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Generate Model solve Csp BWD</em>' operation.
	 * @see ImplementationTransformator.Rules.XDuplexConnectionToConnectionRule#generateModel_solveCsp_BWD(org.moflon.tgg.runtime.IsApplicableMatch, ImplementationTransformator.XDeviceToDevice, implementation.Device, xtextImplementation.xtextImpl.XContainer, implementation.Container, xtextImplementation.xtextImpl.XDevice, xtextImplementation.xtextImpl.Connections, ImplementationTransformator.XCableToCable, xtextImplementation.xtextImpl.XDevice, implementation.Device, ImplementationTransformator.XCableToCable, xtextImplementation.xtextImpl.XCable, ImplementationTransformator.XDeviceToDevice, xtextImplementation.xtextImpl.Connections, implementation.Cable, implementation.Cable, xtextImplementation.xtextImpl.CableAttributes, org.moflon.tgg.runtime.ModelgeneratorRuleResult)
	 * @generated
	 */
	EOperation getXDuplexConnectionToConnectionRule__GenerateModel_solveCsp_BWD__IsApplicableMatch_XDeviceToDevice_Device_XContainer_Container_XDevice_Connections_XCableToCable_XDevice_Device_XCableToCable_XCable_XDeviceToDevice_Connections_Cable_Cable_CableAttributes_ModelgeneratorRuleResult();

	/**
	 * Returns the meta object for the '{@link ImplementationTransformator.Rules.XDuplexConnectionToConnectionRule#generateModel_checkCsp_BWD(org.moflon.tgg.language.csp.CSP) <em>Generate Model check Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Generate Model check Csp BWD</em>' operation.
	 * @see ImplementationTransformator.Rules.XDuplexConnectionToConnectionRule#generateModel_checkCsp_BWD(org.moflon.tgg.language.csp.CSP)
	 * @generated
	 */
	EOperation getXDuplexConnectionToConnectionRule__GenerateModel_checkCsp_BWD__CSP();

	/**
	 * Returns the meta object for class '{@link ImplementationTransformator.Rules.XComputerToComputer <em>XComputer To Computer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>XComputer To Computer</em>'.
	 * @see ImplementationTransformator.Rules.XComputerToComputer
	 * @generated
	 */
	EClass getXComputerToComputer();

	/**
	 * Returns the meta object for the '{@link ImplementationTransformator.Rules.XComputerToComputer#isAppropriate_FWD(org.moflon.tgg.runtime.Match, xtextImplementation.xtextImpl.XComputer, xtextImplementation.xtextImpl.XContainer, xtextImplementation.xtextImpl.Connections) <em>Is Appropriate FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD</em>' operation.
	 * @see ImplementationTransformator.Rules.XComputerToComputer#isAppropriate_FWD(org.moflon.tgg.runtime.Match, xtextImplementation.xtextImpl.XComputer, xtextImplementation.xtextImpl.XContainer, xtextImplementation.xtextImpl.Connections)
	 * @generated
	 */
	EOperation getXComputerToComputer__IsAppropriate_FWD__Match_XComputer_XContainer_Connections();

	/**
	 * Returns the meta object for the '{@link ImplementationTransformator.Rules.XComputerToComputer#perform_FWD(org.moflon.tgg.runtime.IsApplicableMatch) <em>Perform FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Perform FWD</em>' operation.
	 * @see ImplementationTransformator.Rules.XComputerToComputer#perform_FWD(org.moflon.tgg.runtime.IsApplicableMatch)
	 * @generated
	 */
	EOperation getXComputerToComputer__Perform_FWD__IsApplicableMatch();

	/**
	 * Returns the meta object for the '{@link ImplementationTransformator.Rules.XComputerToComputer#isApplicable_FWD(org.moflon.tgg.runtime.Match) <em>Is Applicable FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable FWD</em>' operation.
	 * @see ImplementationTransformator.Rules.XComputerToComputer#isApplicable_FWD(org.moflon.tgg.runtime.Match)
	 * @generated
	 */
	EOperation getXComputerToComputer__IsApplicable_FWD__Match();

	/**
	 * Returns the meta object for the '{@link ImplementationTransformator.Rules.XComputerToComputer#registerObjectsToMatch_FWD(org.moflon.tgg.runtime.Match, xtextImplementation.xtextImpl.XComputer, xtextImplementation.xtextImpl.XContainer, xtextImplementation.xtextImpl.Connections) <em>Register Objects To Match FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Register Objects To Match FWD</em>' operation.
	 * @see ImplementationTransformator.Rules.XComputerToComputer#registerObjectsToMatch_FWD(org.moflon.tgg.runtime.Match, xtextImplementation.xtextImpl.XComputer, xtextImplementation.xtextImpl.XContainer, xtextImplementation.xtextImpl.Connections)
	 * @generated
	 */
	EOperation getXComputerToComputer__RegisterObjectsToMatch_FWD__Match_XComputer_XContainer_Connections();

	/**
	 * Returns the meta object for the '{@link ImplementationTransformator.Rules.XComputerToComputer#isAppropriate_solveCsp_FWD(org.moflon.tgg.runtime.Match, xtextImplementation.xtextImpl.XComputer, xtextImplementation.xtextImpl.XContainer, xtextImplementation.xtextImpl.Connections) <em>Is Appropriate solve Csp FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate solve Csp FWD</em>' operation.
	 * @see ImplementationTransformator.Rules.XComputerToComputer#isAppropriate_solveCsp_FWD(org.moflon.tgg.runtime.Match, xtextImplementation.xtextImpl.XComputer, xtextImplementation.xtextImpl.XContainer, xtextImplementation.xtextImpl.Connections)
	 * @generated
	 */
	EOperation getXComputerToComputer__IsAppropriate_solveCsp_FWD__Match_XComputer_XContainer_Connections();

	/**
	 * Returns the meta object for the '{@link ImplementationTransformator.Rules.XComputerToComputer#isAppropriate_checkCsp_FWD(org.moflon.tgg.language.csp.CSP) <em>Is Appropriate check Csp FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate check Csp FWD</em>' operation.
	 * @see ImplementationTransformator.Rules.XComputerToComputer#isAppropriate_checkCsp_FWD(org.moflon.tgg.language.csp.CSP)
	 * @generated
	 */
	EOperation getXComputerToComputer__IsAppropriate_checkCsp_FWD__CSP();

	/**
	 * Returns the meta object for the '{@link ImplementationTransformator.Rules.XComputerToComputer#isApplicable_solveCsp_FWD(org.moflon.tgg.runtime.IsApplicableMatch, implementation.Container, ImplementationTransformator.XContainerToContainer, xtextImplementation.xtextImpl.XComputer, xtextImplementation.xtextImpl.XContainer, xtextImplementation.xtextImpl.Connections) <em>Is Applicable solve Csp FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable solve Csp FWD</em>' operation.
	 * @see ImplementationTransformator.Rules.XComputerToComputer#isApplicable_solveCsp_FWD(org.moflon.tgg.runtime.IsApplicableMatch, implementation.Container, ImplementationTransformator.XContainerToContainer, xtextImplementation.xtextImpl.XComputer, xtextImplementation.xtextImpl.XContainer, xtextImplementation.xtextImpl.Connections)
	 * @generated
	 */
	EOperation getXComputerToComputer__IsApplicable_solveCsp_FWD__IsApplicableMatch_Container_XContainerToContainer_XComputer_XContainer_Connections();

	/**
	 * Returns the meta object for the '{@link ImplementationTransformator.Rules.XComputerToComputer#isApplicable_checkCsp_FWD(org.moflon.tgg.language.csp.CSP) <em>Is Applicable check Csp FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable check Csp FWD</em>' operation.
	 * @see ImplementationTransformator.Rules.XComputerToComputer#isApplicable_checkCsp_FWD(org.moflon.tgg.language.csp.CSP)
	 * @generated
	 */
	EOperation getXComputerToComputer__IsApplicable_checkCsp_FWD__CSP();

	/**
	 * Returns the meta object for the '{@link ImplementationTransformator.Rules.XComputerToComputer#registerObjects_FWD(org.moflon.tgg.runtime.PerformRuleResult, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject) <em>Register Objects FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Register Objects FWD</em>' operation.
	 * @see ImplementationTransformator.Rules.XComputerToComputer#registerObjects_FWD(org.moflon.tgg.runtime.PerformRuleResult, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	EOperation getXComputerToComputer__RegisterObjects_FWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject();

	/**
	 * Returns the meta object for the '{@link ImplementationTransformator.Rules.XComputerToComputer#checkTypes_FWD(org.moflon.tgg.runtime.Match) <em>Check Types FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check Types FWD</em>' operation.
	 * @see ImplementationTransformator.Rules.XComputerToComputer#checkTypes_FWD(org.moflon.tgg.runtime.Match)
	 * @generated
	 */
	EOperation getXComputerToComputer__CheckTypes_FWD__Match();

	/**
	 * Returns the meta object for the '{@link ImplementationTransformator.Rules.XComputerToComputer#isAppropriate_BWD(org.moflon.tgg.runtime.Match, implementation.Container, implementation.Computer) <em>Is Appropriate BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD</em>' operation.
	 * @see ImplementationTransformator.Rules.XComputerToComputer#isAppropriate_BWD(org.moflon.tgg.runtime.Match, implementation.Container, implementation.Computer)
	 * @generated
	 */
	EOperation getXComputerToComputer__IsAppropriate_BWD__Match_Container_Computer();

	/**
	 * Returns the meta object for the '{@link ImplementationTransformator.Rules.XComputerToComputer#perform_BWD(org.moflon.tgg.runtime.IsApplicableMatch) <em>Perform BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Perform BWD</em>' operation.
	 * @see ImplementationTransformator.Rules.XComputerToComputer#perform_BWD(org.moflon.tgg.runtime.IsApplicableMatch)
	 * @generated
	 */
	EOperation getXComputerToComputer__Perform_BWD__IsApplicableMatch();

	/**
	 * Returns the meta object for the '{@link ImplementationTransformator.Rules.XComputerToComputer#isApplicable_BWD(org.moflon.tgg.runtime.Match) <em>Is Applicable BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable BWD</em>' operation.
	 * @see ImplementationTransformator.Rules.XComputerToComputer#isApplicable_BWD(org.moflon.tgg.runtime.Match)
	 * @generated
	 */
	EOperation getXComputerToComputer__IsApplicable_BWD__Match();

	/**
	 * Returns the meta object for the '{@link ImplementationTransformator.Rules.XComputerToComputer#registerObjectsToMatch_BWD(org.moflon.tgg.runtime.Match, implementation.Container, implementation.Computer) <em>Register Objects To Match BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Register Objects To Match BWD</em>' operation.
	 * @see ImplementationTransformator.Rules.XComputerToComputer#registerObjectsToMatch_BWD(org.moflon.tgg.runtime.Match, implementation.Container, implementation.Computer)
	 * @generated
	 */
	EOperation getXComputerToComputer__RegisterObjectsToMatch_BWD__Match_Container_Computer();

	/**
	 * Returns the meta object for the '{@link ImplementationTransformator.Rules.XComputerToComputer#isAppropriate_solveCsp_BWD(org.moflon.tgg.runtime.Match, implementation.Container, implementation.Computer) <em>Is Appropriate solve Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate solve Csp BWD</em>' operation.
	 * @see ImplementationTransformator.Rules.XComputerToComputer#isAppropriate_solveCsp_BWD(org.moflon.tgg.runtime.Match, implementation.Container, implementation.Computer)
	 * @generated
	 */
	EOperation getXComputerToComputer__IsAppropriate_solveCsp_BWD__Match_Container_Computer();

	/**
	 * Returns the meta object for the '{@link ImplementationTransformator.Rules.XComputerToComputer#isAppropriate_checkCsp_BWD(org.moflon.tgg.language.csp.CSP) <em>Is Appropriate check Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate check Csp BWD</em>' operation.
	 * @see ImplementationTransformator.Rules.XComputerToComputer#isAppropriate_checkCsp_BWD(org.moflon.tgg.language.csp.CSP)
	 * @generated
	 */
	EOperation getXComputerToComputer__IsAppropriate_checkCsp_BWD__CSP();

	/**
	 * Returns the meta object for the '{@link ImplementationTransformator.Rules.XComputerToComputer#isApplicable_solveCsp_BWD(org.moflon.tgg.runtime.IsApplicableMatch, implementation.Container, ImplementationTransformator.XContainerToContainer, xtextImplementation.xtextImpl.XContainer, implementation.Computer) <em>Is Applicable solve Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable solve Csp BWD</em>' operation.
	 * @see ImplementationTransformator.Rules.XComputerToComputer#isApplicable_solveCsp_BWD(org.moflon.tgg.runtime.IsApplicableMatch, implementation.Container, ImplementationTransformator.XContainerToContainer, xtextImplementation.xtextImpl.XContainer, implementation.Computer)
	 * @generated
	 */
	EOperation getXComputerToComputer__IsApplicable_solveCsp_BWD__IsApplicableMatch_Container_XContainerToContainer_XContainer_Computer();

	/**
	 * Returns the meta object for the '{@link ImplementationTransformator.Rules.XComputerToComputer#isApplicable_checkCsp_BWD(org.moflon.tgg.language.csp.CSP) <em>Is Applicable check Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable check Csp BWD</em>' operation.
	 * @see ImplementationTransformator.Rules.XComputerToComputer#isApplicable_checkCsp_BWD(org.moflon.tgg.language.csp.CSP)
	 * @generated
	 */
	EOperation getXComputerToComputer__IsApplicable_checkCsp_BWD__CSP();

	/**
	 * Returns the meta object for the '{@link ImplementationTransformator.Rules.XComputerToComputer#registerObjects_BWD(org.moflon.tgg.runtime.PerformRuleResult, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject) <em>Register Objects BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Register Objects BWD</em>' operation.
	 * @see ImplementationTransformator.Rules.XComputerToComputer#registerObjects_BWD(org.moflon.tgg.runtime.PerformRuleResult, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	EOperation getXComputerToComputer__RegisterObjects_BWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject();

	/**
	 * Returns the meta object for the '{@link ImplementationTransformator.Rules.XComputerToComputer#checkTypes_BWD(org.moflon.tgg.runtime.Match) <em>Check Types BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check Types BWD</em>' operation.
	 * @see ImplementationTransformator.Rules.XComputerToComputer#checkTypes_BWD(org.moflon.tgg.runtime.Match)
	 * @generated
	 */
	EOperation getXComputerToComputer__CheckTypes_BWD__Match();

	/**
	 * Returns the meta object for the '{@link ImplementationTransformator.Rules.XComputerToComputer#isAppropriate_BWD_EMoflonEdge_13(org.moflon.tgg.runtime.EMoflonEdge) <em>Is Appropriate BWD EMoflon Edge 13</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD EMoflon Edge 13</em>' operation.
	 * @see ImplementationTransformator.Rules.XComputerToComputer#isAppropriate_BWD_EMoflonEdge_13(org.moflon.tgg.runtime.EMoflonEdge)
	 * @generated
	 */
	EOperation getXComputerToComputer__IsAppropriate_BWD_EMoflonEdge_13__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link ImplementationTransformator.Rules.XComputerToComputer#isAppropriate_FWD_EMoflonEdge_9(org.moflon.tgg.runtime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 9</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 9</em>' operation.
	 * @see ImplementationTransformator.Rules.XComputerToComputer#isAppropriate_FWD_EMoflonEdge_9(org.moflon.tgg.runtime.EMoflonEdge)
	 * @generated
	 */
	EOperation getXComputerToComputer__IsAppropriate_FWD_EMoflonEdge_9__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link ImplementationTransformator.Rules.XComputerToComputer#checkAttributes_FWD(org.moflon.tgg.runtime.TripleMatch) <em>Check Attributes FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check Attributes FWD</em>' operation.
	 * @see ImplementationTransformator.Rules.XComputerToComputer#checkAttributes_FWD(org.moflon.tgg.runtime.TripleMatch)
	 * @generated
	 */
	EOperation getXComputerToComputer__CheckAttributes_FWD__TripleMatch();

	/**
	 * Returns the meta object for the '{@link ImplementationTransformator.Rules.XComputerToComputer#checkAttributes_BWD(org.moflon.tgg.runtime.TripleMatch) <em>Check Attributes BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check Attributes BWD</em>' operation.
	 * @see ImplementationTransformator.Rules.XComputerToComputer#checkAttributes_BWD(org.moflon.tgg.runtime.TripleMatch)
	 * @generated
	 */
	EOperation getXComputerToComputer__CheckAttributes_BWD__TripleMatch();

	/**
	 * Returns the meta object for the '{@link ImplementationTransformator.Rules.XComputerToComputer#isApplicable_CC(org.moflon.tgg.runtime.Match, org.moflon.tgg.runtime.Match) <em>Is Applicable CC</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable CC</em>' operation.
	 * @see ImplementationTransformator.Rules.XComputerToComputer#isApplicable_CC(org.moflon.tgg.runtime.Match, org.moflon.tgg.runtime.Match)
	 * @generated
	 */
	EOperation getXComputerToComputer__IsApplicable_CC__Match_Match();

	/**
	 * Returns the meta object for the '{@link ImplementationTransformator.Rules.XComputerToComputer#isApplicable_solveCsp_CC(implementation.Container, xtextImplementation.xtextImpl.XComputer, xtextImplementation.xtextImpl.XContainer, xtextImplementation.xtextImpl.Connections, implementation.Computer, org.moflon.tgg.runtime.Match, org.moflon.tgg.runtime.Match) <em>Is Applicable solve Csp CC</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable solve Csp CC</em>' operation.
	 * @see ImplementationTransformator.Rules.XComputerToComputer#isApplicable_solveCsp_CC(implementation.Container, xtextImplementation.xtextImpl.XComputer, xtextImplementation.xtextImpl.XContainer, xtextImplementation.xtextImpl.Connections, implementation.Computer, org.moflon.tgg.runtime.Match, org.moflon.tgg.runtime.Match)
	 * @generated
	 */
	EOperation getXComputerToComputer__IsApplicable_solveCsp_CC__Container_XComputer_XContainer_Connections_Computer_Match_Match();

	/**
	 * Returns the meta object for the '{@link ImplementationTransformator.Rules.XComputerToComputer#isApplicable_checkCsp_CC(org.moflon.tgg.language.csp.CSP) <em>Is Applicable check Csp CC</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable check Csp CC</em>' operation.
	 * @see ImplementationTransformator.Rules.XComputerToComputer#isApplicable_checkCsp_CC(org.moflon.tgg.language.csp.CSP)
	 * @generated
	 */
	EOperation getXComputerToComputer__IsApplicable_checkCsp_CC__CSP();

	/**
	 * Returns the meta object for the '{@link ImplementationTransformator.Rules.XComputerToComputer#checkDEC_FWD(xtextImplementation.xtextImpl.XComputer, xtextImplementation.xtextImpl.XContainer, xtextImplementation.xtextImpl.Connections) <em>Check DEC FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check DEC FWD</em>' operation.
	 * @see ImplementationTransformator.Rules.XComputerToComputer#checkDEC_FWD(xtextImplementation.xtextImpl.XComputer, xtextImplementation.xtextImpl.XContainer, xtextImplementation.xtextImpl.Connections)
	 * @generated
	 */
	EOperation getXComputerToComputer__CheckDEC_FWD__XComputer_XContainer_Connections();

	/**
	 * Returns the meta object for the '{@link ImplementationTransformator.Rules.XComputerToComputer#checkDEC_BWD(implementation.Container, implementation.Computer) <em>Check DEC BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check DEC BWD</em>' operation.
	 * @see ImplementationTransformator.Rules.XComputerToComputer#checkDEC_BWD(implementation.Container, implementation.Computer)
	 * @generated
	 */
	EOperation getXComputerToComputer__CheckDEC_BWD__Container_Computer();

	/**
	 * Returns the meta object for the '{@link ImplementationTransformator.Rules.XComputerToComputer#generateModel(org.moflon.tgg.language.modelgenerator.RuleEntryContainer, ImplementationTransformator.XContainerToContainer) <em>Generate Model</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Generate Model</em>' operation.
	 * @see ImplementationTransformator.Rules.XComputerToComputer#generateModel(org.moflon.tgg.language.modelgenerator.RuleEntryContainer, ImplementationTransformator.XContainerToContainer)
	 * @generated
	 */
	EOperation getXComputerToComputer__GenerateModel__RuleEntryContainer_XContainerToContainer();

	/**
	 * Returns the meta object for the '{@link ImplementationTransformator.Rules.XComputerToComputer#generateModel_solveCsp_BWD(org.moflon.tgg.runtime.IsApplicableMatch, implementation.Container, ImplementationTransformator.XContainerToContainer, xtextImplementation.xtextImpl.XContainer, org.moflon.tgg.runtime.ModelgeneratorRuleResult) <em>Generate Model solve Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Generate Model solve Csp BWD</em>' operation.
	 * @see ImplementationTransformator.Rules.XComputerToComputer#generateModel_solveCsp_BWD(org.moflon.tgg.runtime.IsApplicableMatch, implementation.Container, ImplementationTransformator.XContainerToContainer, xtextImplementation.xtextImpl.XContainer, org.moflon.tgg.runtime.ModelgeneratorRuleResult)
	 * @generated
	 */
	EOperation getXComputerToComputer__GenerateModel_solveCsp_BWD__IsApplicableMatch_Container_XContainerToContainer_XContainer_ModelgeneratorRuleResult();

	/**
	 * Returns the meta object for the '{@link ImplementationTransformator.Rules.XComputerToComputer#generateModel_checkCsp_BWD(org.moflon.tgg.language.csp.CSP) <em>Generate Model check Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Generate Model check Csp BWD</em>' operation.
	 * @see ImplementationTransformator.Rules.XComputerToComputer#generateModel_checkCsp_BWD(org.moflon.tgg.language.csp.CSP)
	 * @generated
	 */
	EOperation getXComputerToComputer__GenerateModel_checkCsp_BWD__CSP();

	/**
	 * Returns the meta object for class '{@link ImplementationTransformator.Rules.XRouterToRouterRule <em>XRouter To Router Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>XRouter To Router Rule</em>'.
	 * @see ImplementationTransformator.Rules.XRouterToRouterRule
	 * @generated
	 */
	EClass getXRouterToRouterRule();

	/**
	 * Returns the meta object for the '{@link ImplementationTransformator.Rules.XRouterToRouterRule#isAppropriate_FWD(org.moflon.tgg.runtime.Match, xtextImplementation.xtextImpl.XRouter, xtextImplementation.xtextImpl.XContainer, xtextImplementation.xtextImpl.Connections) <em>Is Appropriate FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD</em>' operation.
	 * @see ImplementationTransformator.Rules.XRouterToRouterRule#isAppropriate_FWD(org.moflon.tgg.runtime.Match, xtextImplementation.xtextImpl.XRouter, xtextImplementation.xtextImpl.XContainer, xtextImplementation.xtextImpl.Connections)
	 * @generated
	 */
	EOperation getXRouterToRouterRule__IsAppropriate_FWD__Match_XRouter_XContainer_Connections();

	/**
	 * Returns the meta object for the '{@link ImplementationTransformator.Rules.XRouterToRouterRule#perform_FWD(org.moflon.tgg.runtime.IsApplicableMatch) <em>Perform FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Perform FWD</em>' operation.
	 * @see ImplementationTransformator.Rules.XRouterToRouterRule#perform_FWD(org.moflon.tgg.runtime.IsApplicableMatch)
	 * @generated
	 */
	EOperation getXRouterToRouterRule__Perform_FWD__IsApplicableMatch();

	/**
	 * Returns the meta object for the '{@link ImplementationTransformator.Rules.XRouterToRouterRule#isApplicable_FWD(org.moflon.tgg.runtime.Match) <em>Is Applicable FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable FWD</em>' operation.
	 * @see ImplementationTransformator.Rules.XRouterToRouterRule#isApplicable_FWD(org.moflon.tgg.runtime.Match)
	 * @generated
	 */
	EOperation getXRouterToRouterRule__IsApplicable_FWD__Match();

	/**
	 * Returns the meta object for the '{@link ImplementationTransformator.Rules.XRouterToRouterRule#registerObjectsToMatch_FWD(org.moflon.tgg.runtime.Match, xtextImplementation.xtextImpl.XRouter, xtextImplementation.xtextImpl.XContainer, xtextImplementation.xtextImpl.Connections) <em>Register Objects To Match FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Register Objects To Match FWD</em>' operation.
	 * @see ImplementationTransformator.Rules.XRouterToRouterRule#registerObjectsToMatch_FWD(org.moflon.tgg.runtime.Match, xtextImplementation.xtextImpl.XRouter, xtextImplementation.xtextImpl.XContainer, xtextImplementation.xtextImpl.Connections)
	 * @generated
	 */
	EOperation getXRouterToRouterRule__RegisterObjectsToMatch_FWD__Match_XRouter_XContainer_Connections();

	/**
	 * Returns the meta object for the '{@link ImplementationTransformator.Rules.XRouterToRouterRule#isAppropriate_solveCsp_FWD(org.moflon.tgg.runtime.Match, xtextImplementation.xtextImpl.XRouter, xtextImplementation.xtextImpl.XContainer, xtextImplementation.xtextImpl.Connections) <em>Is Appropriate solve Csp FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate solve Csp FWD</em>' operation.
	 * @see ImplementationTransformator.Rules.XRouterToRouterRule#isAppropriate_solveCsp_FWD(org.moflon.tgg.runtime.Match, xtextImplementation.xtextImpl.XRouter, xtextImplementation.xtextImpl.XContainer, xtextImplementation.xtextImpl.Connections)
	 * @generated
	 */
	EOperation getXRouterToRouterRule__IsAppropriate_solveCsp_FWD__Match_XRouter_XContainer_Connections();

	/**
	 * Returns the meta object for the '{@link ImplementationTransformator.Rules.XRouterToRouterRule#isAppropriate_checkCsp_FWD(org.moflon.tgg.language.csp.CSP) <em>Is Appropriate check Csp FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate check Csp FWD</em>' operation.
	 * @see ImplementationTransformator.Rules.XRouterToRouterRule#isAppropriate_checkCsp_FWD(org.moflon.tgg.language.csp.CSP)
	 * @generated
	 */
	EOperation getXRouterToRouterRule__IsAppropriate_checkCsp_FWD__CSP();

	/**
	 * Returns the meta object for the '{@link ImplementationTransformator.Rules.XRouterToRouterRule#isApplicable_solveCsp_FWD(org.moflon.tgg.runtime.IsApplicableMatch, implementation.Container, ImplementationTransformator.XContainerToContainer, xtextImplementation.xtextImpl.XRouter, xtextImplementation.xtextImpl.XContainer, xtextImplementation.xtextImpl.Connections) <em>Is Applicable solve Csp FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable solve Csp FWD</em>' operation.
	 * @see ImplementationTransformator.Rules.XRouterToRouterRule#isApplicable_solveCsp_FWD(org.moflon.tgg.runtime.IsApplicableMatch, implementation.Container, ImplementationTransformator.XContainerToContainer, xtextImplementation.xtextImpl.XRouter, xtextImplementation.xtextImpl.XContainer, xtextImplementation.xtextImpl.Connections)
	 * @generated
	 */
	EOperation getXRouterToRouterRule__IsApplicable_solveCsp_FWD__IsApplicableMatch_Container_XContainerToContainer_XRouter_XContainer_Connections();

	/**
	 * Returns the meta object for the '{@link ImplementationTransformator.Rules.XRouterToRouterRule#isApplicable_checkCsp_FWD(org.moflon.tgg.language.csp.CSP) <em>Is Applicable check Csp FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable check Csp FWD</em>' operation.
	 * @see ImplementationTransformator.Rules.XRouterToRouterRule#isApplicable_checkCsp_FWD(org.moflon.tgg.language.csp.CSP)
	 * @generated
	 */
	EOperation getXRouterToRouterRule__IsApplicable_checkCsp_FWD__CSP();

	/**
	 * Returns the meta object for the '{@link ImplementationTransformator.Rules.XRouterToRouterRule#registerObjects_FWD(org.moflon.tgg.runtime.PerformRuleResult, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject) <em>Register Objects FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Register Objects FWD</em>' operation.
	 * @see ImplementationTransformator.Rules.XRouterToRouterRule#registerObjects_FWD(org.moflon.tgg.runtime.PerformRuleResult, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	EOperation getXRouterToRouterRule__RegisterObjects_FWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject();

	/**
	 * Returns the meta object for the '{@link ImplementationTransformator.Rules.XRouterToRouterRule#checkTypes_FWD(org.moflon.tgg.runtime.Match) <em>Check Types FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check Types FWD</em>' operation.
	 * @see ImplementationTransformator.Rules.XRouterToRouterRule#checkTypes_FWD(org.moflon.tgg.runtime.Match)
	 * @generated
	 */
	EOperation getXRouterToRouterRule__CheckTypes_FWD__Match();

	/**
	 * Returns the meta object for the '{@link ImplementationTransformator.Rules.XRouterToRouterRule#isAppropriate_BWD(org.moflon.tgg.runtime.Match, implementation.Container, implementation.Router) <em>Is Appropriate BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD</em>' operation.
	 * @see ImplementationTransformator.Rules.XRouterToRouterRule#isAppropriate_BWD(org.moflon.tgg.runtime.Match, implementation.Container, implementation.Router)
	 * @generated
	 */
	EOperation getXRouterToRouterRule__IsAppropriate_BWD__Match_Container_Router();

	/**
	 * Returns the meta object for the '{@link ImplementationTransformator.Rules.XRouterToRouterRule#perform_BWD(org.moflon.tgg.runtime.IsApplicableMatch) <em>Perform BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Perform BWD</em>' operation.
	 * @see ImplementationTransformator.Rules.XRouterToRouterRule#perform_BWD(org.moflon.tgg.runtime.IsApplicableMatch)
	 * @generated
	 */
	EOperation getXRouterToRouterRule__Perform_BWD__IsApplicableMatch();

	/**
	 * Returns the meta object for the '{@link ImplementationTransformator.Rules.XRouterToRouterRule#isApplicable_BWD(org.moflon.tgg.runtime.Match) <em>Is Applicable BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable BWD</em>' operation.
	 * @see ImplementationTransformator.Rules.XRouterToRouterRule#isApplicable_BWD(org.moflon.tgg.runtime.Match)
	 * @generated
	 */
	EOperation getXRouterToRouterRule__IsApplicable_BWD__Match();

	/**
	 * Returns the meta object for the '{@link ImplementationTransformator.Rules.XRouterToRouterRule#registerObjectsToMatch_BWD(org.moflon.tgg.runtime.Match, implementation.Container, implementation.Router) <em>Register Objects To Match BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Register Objects To Match BWD</em>' operation.
	 * @see ImplementationTransformator.Rules.XRouterToRouterRule#registerObjectsToMatch_BWD(org.moflon.tgg.runtime.Match, implementation.Container, implementation.Router)
	 * @generated
	 */
	EOperation getXRouterToRouterRule__RegisterObjectsToMatch_BWD__Match_Container_Router();

	/**
	 * Returns the meta object for the '{@link ImplementationTransformator.Rules.XRouterToRouterRule#isAppropriate_solveCsp_BWD(org.moflon.tgg.runtime.Match, implementation.Container, implementation.Router) <em>Is Appropriate solve Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate solve Csp BWD</em>' operation.
	 * @see ImplementationTransformator.Rules.XRouterToRouterRule#isAppropriate_solveCsp_BWD(org.moflon.tgg.runtime.Match, implementation.Container, implementation.Router)
	 * @generated
	 */
	EOperation getXRouterToRouterRule__IsAppropriate_solveCsp_BWD__Match_Container_Router();

	/**
	 * Returns the meta object for the '{@link ImplementationTransformator.Rules.XRouterToRouterRule#isAppropriate_checkCsp_BWD(org.moflon.tgg.language.csp.CSP) <em>Is Appropriate check Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate check Csp BWD</em>' operation.
	 * @see ImplementationTransformator.Rules.XRouterToRouterRule#isAppropriate_checkCsp_BWD(org.moflon.tgg.language.csp.CSP)
	 * @generated
	 */
	EOperation getXRouterToRouterRule__IsAppropriate_checkCsp_BWD__CSP();

	/**
	 * Returns the meta object for the '{@link ImplementationTransformator.Rules.XRouterToRouterRule#isApplicable_solveCsp_BWD(org.moflon.tgg.runtime.IsApplicableMatch, implementation.Container, ImplementationTransformator.XContainerToContainer, xtextImplementation.xtextImpl.XContainer, implementation.Router) <em>Is Applicable solve Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable solve Csp BWD</em>' operation.
	 * @see ImplementationTransformator.Rules.XRouterToRouterRule#isApplicable_solveCsp_BWD(org.moflon.tgg.runtime.IsApplicableMatch, implementation.Container, ImplementationTransformator.XContainerToContainer, xtextImplementation.xtextImpl.XContainer, implementation.Router)
	 * @generated
	 */
	EOperation getXRouterToRouterRule__IsApplicable_solveCsp_BWD__IsApplicableMatch_Container_XContainerToContainer_XContainer_Router();

	/**
	 * Returns the meta object for the '{@link ImplementationTransformator.Rules.XRouterToRouterRule#isApplicable_checkCsp_BWD(org.moflon.tgg.language.csp.CSP) <em>Is Applicable check Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable check Csp BWD</em>' operation.
	 * @see ImplementationTransformator.Rules.XRouterToRouterRule#isApplicable_checkCsp_BWD(org.moflon.tgg.language.csp.CSP)
	 * @generated
	 */
	EOperation getXRouterToRouterRule__IsApplicable_checkCsp_BWD__CSP();

	/**
	 * Returns the meta object for the '{@link ImplementationTransformator.Rules.XRouterToRouterRule#registerObjects_BWD(org.moflon.tgg.runtime.PerformRuleResult, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject) <em>Register Objects BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Register Objects BWD</em>' operation.
	 * @see ImplementationTransformator.Rules.XRouterToRouterRule#registerObjects_BWD(org.moflon.tgg.runtime.PerformRuleResult, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	EOperation getXRouterToRouterRule__RegisterObjects_BWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject();

	/**
	 * Returns the meta object for the '{@link ImplementationTransformator.Rules.XRouterToRouterRule#checkTypes_BWD(org.moflon.tgg.runtime.Match) <em>Check Types BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check Types BWD</em>' operation.
	 * @see ImplementationTransformator.Rules.XRouterToRouterRule#checkTypes_BWD(org.moflon.tgg.runtime.Match)
	 * @generated
	 */
	EOperation getXRouterToRouterRule__CheckTypes_BWD__Match();

	/**
	 * Returns the meta object for the '{@link ImplementationTransformator.Rules.XRouterToRouterRule#isAppropriate_BWD_EMoflonEdge_14(org.moflon.tgg.runtime.EMoflonEdge) <em>Is Appropriate BWD EMoflon Edge 14</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD EMoflon Edge 14</em>' operation.
	 * @see ImplementationTransformator.Rules.XRouterToRouterRule#isAppropriate_BWD_EMoflonEdge_14(org.moflon.tgg.runtime.EMoflonEdge)
	 * @generated
	 */
	EOperation getXRouterToRouterRule__IsAppropriate_BWD_EMoflonEdge_14__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link ImplementationTransformator.Rules.XRouterToRouterRule#isAppropriate_FWD_EMoflonEdge_10(org.moflon.tgg.runtime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 10</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 10</em>' operation.
	 * @see ImplementationTransformator.Rules.XRouterToRouterRule#isAppropriate_FWD_EMoflonEdge_10(org.moflon.tgg.runtime.EMoflonEdge)
	 * @generated
	 */
	EOperation getXRouterToRouterRule__IsAppropriate_FWD_EMoflonEdge_10__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link ImplementationTransformator.Rules.XRouterToRouterRule#checkAttributes_FWD(org.moflon.tgg.runtime.TripleMatch) <em>Check Attributes FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check Attributes FWD</em>' operation.
	 * @see ImplementationTransformator.Rules.XRouterToRouterRule#checkAttributes_FWD(org.moflon.tgg.runtime.TripleMatch)
	 * @generated
	 */
	EOperation getXRouterToRouterRule__CheckAttributes_FWD__TripleMatch();

	/**
	 * Returns the meta object for the '{@link ImplementationTransformator.Rules.XRouterToRouterRule#checkAttributes_BWD(org.moflon.tgg.runtime.TripleMatch) <em>Check Attributes BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check Attributes BWD</em>' operation.
	 * @see ImplementationTransformator.Rules.XRouterToRouterRule#checkAttributes_BWD(org.moflon.tgg.runtime.TripleMatch)
	 * @generated
	 */
	EOperation getXRouterToRouterRule__CheckAttributes_BWD__TripleMatch();

	/**
	 * Returns the meta object for the '{@link ImplementationTransformator.Rules.XRouterToRouterRule#isApplicable_CC(org.moflon.tgg.runtime.Match, org.moflon.tgg.runtime.Match) <em>Is Applicable CC</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable CC</em>' operation.
	 * @see ImplementationTransformator.Rules.XRouterToRouterRule#isApplicable_CC(org.moflon.tgg.runtime.Match, org.moflon.tgg.runtime.Match)
	 * @generated
	 */
	EOperation getXRouterToRouterRule__IsApplicable_CC__Match_Match();

	/**
	 * Returns the meta object for the '{@link ImplementationTransformator.Rules.XRouterToRouterRule#isApplicable_solveCsp_CC(implementation.Container, xtextImplementation.xtextImpl.XRouter, xtextImplementation.xtextImpl.XContainer, xtextImplementation.xtextImpl.Connections, implementation.Router, org.moflon.tgg.runtime.Match, org.moflon.tgg.runtime.Match) <em>Is Applicable solve Csp CC</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable solve Csp CC</em>' operation.
	 * @see ImplementationTransformator.Rules.XRouterToRouterRule#isApplicable_solveCsp_CC(implementation.Container, xtextImplementation.xtextImpl.XRouter, xtextImplementation.xtextImpl.XContainer, xtextImplementation.xtextImpl.Connections, implementation.Router, org.moflon.tgg.runtime.Match, org.moflon.tgg.runtime.Match)
	 * @generated
	 */
	EOperation getXRouterToRouterRule__IsApplicable_solveCsp_CC__Container_XRouter_XContainer_Connections_Router_Match_Match();

	/**
	 * Returns the meta object for the '{@link ImplementationTransformator.Rules.XRouterToRouterRule#isApplicable_checkCsp_CC(org.moflon.tgg.language.csp.CSP) <em>Is Applicable check Csp CC</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable check Csp CC</em>' operation.
	 * @see ImplementationTransformator.Rules.XRouterToRouterRule#isApplicable_checkCsp_CC(org.moflon.tgg.language.csp.CSP)
	 * @generated
	 */
	EOperation getXRouterToRouterRule__IsApplicable_checkCsp_CC__CSP();

	/**
	 * Returns the meta object for the '{@link ImplementationTransformator.Rules.XRouterToRouterRule#checkDEC_FWD(xtextImplementation.xtextImpl.XRouter, xtextImplementation.xtextImpl.XContainer, xtextImplementation.xtextImpl.Connections) <em>Check DEC FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check DEC FWD</em>' operation.
	 * @see ImplementationTransformator.Rules.XRouterToRouterRule#checkDEC_FWD(xtextImplementation.xtextImpl.XRouter, xtextImplementation.xtextImpl.XContainer, xtextImplementation.xtextImpl.Connections)
	 * @generated
	 */
	EOperation getXRouterToRouterRule__CheckDEC_FWD__XRouter_XContainer_Connections();

	/**
	 * Returns the meta object for the '{@link ImplementationTransformator.Rules.XRouterToRouterRule#checkDEC_BWD(implementation.Container, implementation.Router) <em>Check DEC BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check DEC BWD</em>' operation.
	 * @see ImplementationTransformator.Rules.XRouterToRouterRule#checkDEC_BWD(implementation.Container, implementation.Router)
	 * @generated
	 */
	EOperation getXRouterToRouterRule__CheckDEC_BWD__Container_Router();

	/**
	 * Returns the meta object for the '{@link ImplementationTransformator.Rules.XRouterToRouterRule#generateModel(org.moflon.tgg.language.modelgenerator.RuleEntryContainer, ImplementationTransformator.XContainerToContainer) <em>Generate Model</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Generate Model</em>' operation.
	 * @see ImplementationTransformator.Rules.XRouterToRouterRule#generateModel(org.moflon.tgg.language.modelgenerator.RuleEntryContainer, ImplementationTransformator.XContainerToContainer)
	 * @generated
	 */
	EOperation getXRouterToRouterRule__GenerateModel__RuleEntryContainer_XContainerToContainer();

	/**
	 * Returns the meta object for the '{@link ImplementationTransformator.Rules.XRouterToRouterRule#generateModel_solveCsp_BWD(org.moflon.tgg.runtime.IsApplicableMatch, implementation.Container, ImplementationTransformator.XContainerToContainer, xtextImplementation.xtextImpl.XContainer, org.moflon.tgg.runtime.ModelgeneratorRuleResult) <em>Generate Model solve Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Generate Model solve Csp BWD</em>' operation.
	 * @see ImplementationTransformator.Rules.XRouterToRouterRule#generateModel_solveCsp_BWD(org.moflon.tgg.runtime.IsApplicableMatch, implementation.Container, ImplementationTransformator.XContainerToContainer, xtextImplementation.xtextImpl.XContainer, org.moflon.tgg.runtime.ModelgeneratorRuleResult)
	 * @generated
	 */
	EOperation getXRouterToRouterRule__GenerateModel_solveCsp_BWD__IsApplicableMatch_Container_XContainerToContainer_XContainer_ModelgeneratorRuleResult();

	/**
	 * Returns the meta object for the '{@link ImplementationTransformator.Rules.XRouterToRouterRule#generateModel_checkCsp_BWD(org.moflon.tgg.language.csp.CSP) <em>Generate Model check Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Generate Model check Csp BWD</em>' operation.
	 * @see ImplementationTransformator.Rules.XRouterToRouterRule#generateModel_checkCsp_BWD(org.moflon.tgg.language.csp.CSP)
	 * @generated
	 */
	EOperation getXRouterToRouterRule__GenerateModel_checkCsp_BWD__CSP();

	/**
	 * Returns the meta object for class '{@link ImplementationTransformator.Rules.XSimplexCopperCableRule <em>XSimplex Copper Cable Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>XSimplex Copper Cable Rule</em>'.
	 * @see ImplementationTransformator.Rules.XSimplexCopperCableRule
	 * @generated
	 */
	EClass getXSimplexCopperCableRule();

	/**
	 * Returns the meta object for the '{@link ImplementationTransformator.Rules.XSimplexCopperCableRule#isAppropriate_FWD(org.moflon.tgg.runtime.Match, xtextImplementation.xtextImpl.CableAttributes, xtextImplementation.xtextImpl.XDevice, xtextImplementation.xtextImpl.XCopperCable, xtextImplementation.xtextImpl.XContainer) <em>Is Appropriate FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD</em>' operation.
	 * @see ImplementationTransformator.Rules.XSimplexCopperCableRule#isAppropriate_FWD(org.moflon.tgg.runtime.Match, xtextImplementation.xtextImpl.CableAttributes, xtextImplementation.xtextImpl.XDevice, xtextImplementation.xtextImpl.XCopperCable, xtextImplementation.xtextImpl.XContainer)
	 * @generated
	 */
	EOperation getXSimplexCopperCableRule__IsAppropriate_FWD__Match_CableAttributes_XDevice_XCopperCable_XContainer();

	/**
	 * Returns the meta object for the '{@link ImplementationTransformator.Rules.XSimplexCopperCableRule#perform_FWD(org.moflon.tgg.runtime.IsApplicableMatch) <em>Perform FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Perform FWD</em>' operation.
	 * @see ImplementationTransformator.Rules.XSimplexCopperCableRule#perform_FWD(org.moflon.tgg.runtime.IsApplicableMatch)
	 * @generated
	 */
	EOperation getXSimplexCopperCableRule__Perform_FWD__IsApplicableMatch();

	/**
	 * Returns the meta object for the '{@link ImplementationTransformator.Rules.XSimplexCopperCableRule#isApplicable_FWD(org.moflon.tgg.runtime.Match) <em>Is Applicable FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable FWD</em>' operation.
	 * @see ImplementationTransformator.Rules.XSimplexCopperCableRule#isApplicable_FWD(org.moflon.tgg.runtime.Match)
	 * @generated
	 */
	EOperation getXSimplexCopperCableRule__IsApplicable_FWD__Match();

	/**
	 * Returns the meta object for the '{@link ImplementationTransformator.Rules.XSimplexCopperCableRule#registerObjectsToMatch_FWD(org.moflon.tgg.runtime.Match, xtextImplementation.xtextImpl.CableAttributes, xtextImplementation.xtextImpl.XDevice, xtextImplementation.xtextImpl.XCopperCable, xtextImplementation.xtextImpl.XContainer) <em>Register Objects To Match FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Register Objects To Match FWD</em>' operation.
	 * @see ImplementationTransformator.Rules.XSimplexCopperCableRule#registerObjectsToMatch_FWD(org.moflon.tgg.runtime.Match, xtextImplementation.xtextImpl.CableAttributes, xtextImplementation.xtextImpl.XDevice, xtextImplementation.xtextImpl.XCopperCable, xtextImplementation.xtextImpl.XContainer)
	 * @generated
	 */
	EOperation getXSimplexCopperCableRule__RegisterObjectsToMatch_FWD__Match_CableAttributes_XDevice_XCopperCable_XContainer();

	/**
	 * Returns the meta object for the '{@link ImplementationTransformator.Rules.XSimplexCopperCableRule#isAppropriate_solveCsp_FWD(org.moflon.tgg.runtime.Match, xtextImplementation.xtextImpl.CableAttributes, xtextImplementation.xtextImpl.XDevice, xtextImplementation.xtextImpl.XCopperCable, xtextImplementation.xtextImpl.XContainer) <em>Is Appropriate solve Csp FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate solve Csp FWD</em>' operation.
	 * @see ImplementationTransformator.Rules.XSimplexCopperCableRule#isAppropriate_solveCsp_FWD(org.moflon.tgg.runtime.Match, xtextImplementation.xtextImpl.CableAttributes, xtextImplementation.xtextImpl.XDevice, xtextImplementation.xtextImpl.XCopperCable, xtextImplementation.xtextImpl.XContainer)
	 * @generated
	 */
	EOperation getXSimplexCopperCableRule__IsAppropriate_solveCsp_FWD__Match_CableAttributes_XDevice_XCopperCable_XContainer();

	/**
	 * Returns the meta object for the '{@link ImplementationTransformator.Rules.XSimplexCopperCableRule#isAppropriate_checkCsp_FWD(org.moflon.tgg.language.csp.CSP) <em>Is Appropriate check Csp FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate check Csp FWD</em>' operation.
	 * @see ImplementationTransformator.Rules.XSimplexCopperCableRule#isAppropriate_checkCsp_FWD(org.moflon.tgg.language.csp.CSP)
	 * @generated
	 */
	EOperation getXSimplexCopperCableRule__IsAppropriate_checkCsp_FWD__CSP();

	/**
	 * Returns the meta object for the '{@link ImplementationTransformator.Rules.XSimplexCopperCableRule#isApplicable_solveCsp_FWD(org.moflon.tgg.runtime.IsApplicableMatch, implementation.Container, xtextImplementation.xtextImpl.CableAttributes, xtextImplementation.xtextImpl.XDevice, xtextImplementation.xtextImpl.XCopperCable, xtextImplementation.xtextImpl.XContainer, implementation.Device, ImplementationTransformator.XDeviceToDevice) <em>Is Applicable solve Csp FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable solve Csp FWD</em>' operation.
	 * @see ImplementationTransformator.Rules.XSimplexCopperCableRule#isApplicable_solveCsp_FWD(org.moflon.tgg.runtime.IsApplicableMatch, implementation.Container, xtextImplementation.xtextImpl.CableAttributes, xtextImplementation.xtextImpl.XDevice, xtextImplementation.xtextImpl.XCopperCable, xtextImplementation.xtextImpl.XContainer, implementation.Device, ImplementationTransformator.XDeviceToDevice)
	 * @generated
	 */
	EOperation getXSimplexCopperCableRule__IsApplicable_solveCsp_FWD__IsApplicableMatch_Container_CableAttributes_XDevice_XCopperCable_XContainer_Device_XDeviceToDevice();

	/**
	 * Returns the meta object for the '{@link ImplementationTransformator.Rules.XSimplexCopperCableRule#isApplicable_checkCsp_FWD(org.moflon.tgg.language.csp.CSP) <em>Is Applicable check Csp FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable check Csp FWD</em>' operation.
	 * @see ImplementationTransformator.Rules.XSimplexCopperCableRule#isApplicable_checkCsp_FWD(org.moflon.tgg.language.csp.CSP)
	 * @generated
	 */
	EOperation getXSimplexCopperCableRule__IsApplicable_checkCsp_FWD__CSP();

	/**
	 * Returns the meta object for the '{@link ImplementationTransformator.Rules.XSimplexCopperCableRule#registerObjects_FWD(org.moflon.tgg.runtime.PerformRuleResult, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject) <em>Register Objects FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Register Objects FWD</em>' operation.
	 * @see ImplementationTransformator.Rules.XSimplexCopperCableRule#registerObjects_FWD(org.moflon.tgg.runtime.PerformRuleResult, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	EOperation getXSimplexCopperCableRule__RegisterObjects_FWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject();

	/**
	 * Returns the meta object for the '{@link ImplementationTransformator.Rules.XSimplexCopperCableRule#checkTypes_FWD(org.moflon.tgg.runtime.Match) <em>Check Types FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check Types FWD</em>' operation.
	 * @see ImplementationTransformator.Rules.XSimplexCopperCableRule#checkTypes_FWD(org.moflon.tgg.runtime.Match)
	 * @generated
	 */
	EOperation getXSimplexCopperCableRule__CheckTypes_FWD__Match();

	/**
	 * Returns the meta object for the '{@link ImplementationTransformator.Rules.XSimplexCopperCableRule#isAppropriate_BWD(org.moflon.tgg.runtime.Match, implementation.Container, implementation.CopperCable, implementation.Device) <em>Is Appropriate BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD</em>' operation.
	 * @see ImplementationTransformator.Rules.XSimplexCopperCableRule#isAppropriate_BWD(org.moflon.tgg.runtime.Match, implementation.Container, implementation.CopperCable, implementation.Device)
	 * @generated
	 */
	EOperation getXSimplexCopperCableRule__IsAppropriate_BWD__Match_Container_CopperCable_Device();

	/**
	 * Returns the meta object for the '{@link ImplementationTransformator.Rules.XSimplexCopperCableRule#perform_BWD(org.moflon.tgg.runtime.IsApplicableMatch) <em>Perform BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Perform BWD</em>' operation.
	 * @see ImplementationTransformator.Rules.XSimplexCopperCableRule#perform_BWD(org.moflon.tgg.runtime.IsApplicableMatch)
	 * @generated
	 */
	EOperation getXSimplexCopperCableRule__Perform_BWD__IsApplicableMatch();

	/**
	 * Returns the meta object for the '{@link ImplementationTransformator.Rules.XSimplexCopperCableRule#isApplicable_BWD(org.moflon.tgg.runtime.Match) <em>Is Applicable BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable BWD</em>' operation.
	 * @see ImplementationTransformator.Rules.XSimplexCopperCableRule#isApplicable_BWD(org.moflon.tgg.runtime.Match)
	 * @generated
	 */
	EOperation getXSimplexCopperCableRule__IsApplicable_BWD__Match();

	/**
	 * Returns the meta object for the '{@link ImplementationTransformator.Rules.XSimplexCopperCableRule#registerObjectsToMatch_BWD(org.moflon.tgg.runtime.Match, implementation.Container, implementation.CopperCable, implementation.Device) <em>Register Objects To Match BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Register Objects To Match BWD</em>' operation.
	 * @see ImplementationTransformator.Rules.XSimplexCopperCableRule#registerObjectsToMatch_BWD(org.moflon.tgg.runtime.Match, implementation.Container, implementation.CopperCable, implementation.Device)
	 * @generated
	 */
	EOperation getXSimplexCopperCableRule__RegisterObjectsToMatch_BWD__Match_Container_CopperCable_Device();

	/**
	 * Returns the meta object for the '{@link ImplementationTransformator.Rules.XSimplexCopperCableRule#isAppropriate_solveCsp_BWD(org.moflon.tgg.runtime.Match, implementation.Container, implementation.CopperCable, implementation.Device) <em>Is Appropriate solve Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate solve Csp BWD</em>' operation.
	 * @see ImplementationTransformator.Rules.XSimplexCopperCableRule#isAppropriate_solveCsp_BWD(org.moflon.tgg.runtime.Match, implementation.Container, implementation.CopperCable, implementation.Device)
	 * @generated
	 */
	EOperation getXSimplexCopperCableRule__IsAppropriate_solveCsp_BWD__Match_Container_CopperCable_Device();

	/**
	 * Returns the meta object for the '{@link ImplementationTransformator.Rules.XSimplexCopperCableRule#isAppropriate_checkCsp_BWD(org.moflon.tgg.language.csp.CSP) <em>Is Appropriate check Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate check Csp BWD</em>' operation.
	 * @see ImplementationTransformator.Rules.XSimplexCopperCableRule#isAppropriate_checkCsp_BWD(org.moflon.tgg.language.csp.CSP)
	 * @generated
	 */
	EOperation getXSimplexCopperCableRule__IsAppropriate_checkCsp_BWD__CSP();

	/**
	 * Returns the meta object for the '{@link ImplementationTransformator.Rules.XSimplexCopperCableRule#isApplicable_solveCsp_BWD(org.moflon.tgg.runtime.IsApplicableMatch, implementation.Container, xtextImplementation.xtextImpl.XDevice, xtextImplementation.xtextImpl.XContainer, implementation.CopperCable, implementation.Device, ImplementationTransformator.XDeviceToDevice) <em>Is Applicable solve Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable solve Csp BWD</em>' operation.
	 * @see ImplementationTransformator.Rules.XSimplexCopperCableRule#isApplicable_solveCsp_BWD(org.moflon.tgg.runtime.IsApplicableMatch, implementation.Container, xtextImplementation.xtextImpl.XDevice, xtextImplementation.xtextImpl.XContainer, implementation.CopperCable, implementation.Device, ImplementationTransformator.XDeviceToDevice)
	 * @generated
	 */
	EOperation getXSimplexCopperCableRule__IsApplicable_solveCsp_BWD__IsApplicableMatch_Container_XDevice_XContainer_CopperCable_Device_XDeviceToDevice();

	/**
	 * Returns the meta object for the '{@link ImplementationTransformator.Rules.XSimplexCopperCableRule#isApplicable_checkCsp_BWD(org.moflon.tgg.language.csp.CSP) <em>Is Applicable check Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable check Csp BWD</em>' operation.
	 * @see ImplementationTransformator.Rules.XSimplexCopperCableRule#isApplicable_checkCsp_BWD(org.moflon.tgg.language.csp.CSP)
	 * @generated
	 */
	EOperation getXSimplexCopperCableRule__IsApplicable_checkCsp_BWD__CSP();

	/**
	 * Returns the meta object for the '{@link ImplementationTransformator.Rules.XSimplexCopperCableRule#registerObjects_BWD(org.moflon.tgg.runtime.PerformRuleResult, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject) <em>Register Objects BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Register Objects BWD</em>' operation.
	 * @see ImplementationTransformator.Rules.XSimplexCopperCableRule#registerObjects_BWD(org.moflon.tgg.runtime.PerformRuleResult, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	EOperation getXSimplexCopperCableRule__RegisterObjects_BWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject();

	/**
	 * Returns the meta object for the '{@link ImplementationTransformator.Rules.XSimplexCopperCableRule#checkTypes_BWD(org.moflon.tgg.runtime.Match) <em>Check Types BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check Types BWD</em>' operation.
	 * @see ImplementationTransformator.Rules.XSimplexCopperCableRule#checkTypes_BWD(org.moflon.tgg.runtime.Match)
	 * @generated
	 */
	EOperation getXSimplexCopperCableRule__CheckTypes_BWD__Match();

	/**
	 * Returns the meta object for the '{@link ImplementationTransformator.Rules.XSimplexCopperCableRule#isAppropriate_BWD_EMoflonEdge_15(org.moflon.tgg.runtime.EMoflonEdge) <em>Is Appropriate BWD EMoflon Edge 15</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD EMoflon Edge 15</em>' operation.
	 * @see ImplementationTransformator.Rules.XSimplexCopperCableRule#isAppropriate_BWD_EMoflonEdge_15(org.moflon.tgg.runtime.EMoflonEdge)
	 * @generated
	 */
	EOperation getXSimplexCopperCableRule__IsAppropriate_BWD_EMoflonEdge_15__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link ImplementationTransformator.Rules.XSimplexCopperCableRule#isAppropriate_FWD_EMoflonEdge_11(org.moflon.tgg.runtime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 11</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 11</em>' operation.
	 * @see ImplementationTransformator.Rules.XSimplexCopperCableRule#isAppropriate_FWD_EMoflonEdge_11(org.moflon.tgg.runtime.EMoflonEdge)
	 * @generated
	 */
	EOperation getXSimplexCopperCableRule__IsAppropriate_FWD_EMoflonEdge_11__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link ImplementationTransformator.Rules.XSimplexCopperCableRule#checkAttributes_FWD(org.moflon.tgg.runtime.TripleMatch) <em>Check Attributes FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check Attributes FWD</em>' operation.
	 * @see ImplementationTransformator.Rules.XSimplexCopperCableRule#checkAttributes_FWD(org.moflon.tgg.runtime.TripleMatch)
	 * @generated
	 */
	EOperation getXSimplexCopperCableRule__CheckAttributes_FWD__TripleMatch();

	/**
	 * Returns the meta object for the '{@link ImplementationTransformator.Rules.XSimplexCopperCableRule#checkAttributes_BWD(org.moflon.tgg.runtime.TripleMatch) <em>Check Attributes BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check Attributes BWD</em>' operation.
	 * @see ImplementationTransformator.Rules.XSimplexCopperCableRule#checkAttributes_BWD(org.moflon.tgg.runtime.TripleMatch)
	 * @generated
	 */
	EOperation getXSimplexCopperCableRule__CheckAttributes_BWD__TripleMatch();

	/**
	 * Returns the meta object for the '{@link ImplementationTransformator.Rules.XSimplexCopperCableRule#isApplicable_CC(org.moflon.tgg.runtime.Match, org.moflon.tgg.runtime.Match) <em>Is Applicable CC</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable CC</em>' operation.
	 * @see ImplementationTransformator.Rules.XSimplexCopperCableRule#isApplicable_CC(org.moflon.tgg.runtime.Match, org.moflon.tgg.runtime.Match)
	 * @generated
	 */
	EOperation getXSimplexCopperCableRule__IsApplicable_CC__Match_Match();

	/**
	 * Returns the meta object for the '{@link ImplementationTransformator.Rules.XSimplexCopperCableRule#isApplicable_solveCsp_CC(implementation.Container, xtextImplementation.xtextImpl.CableAttributes, xtextImplementation.xtextImpl.XDevice, xtextImplementation.xtextImpl.XCopperCable, xtextImplementation.xtextImpl.XContainer, implementation.CopperCable, implementation.Device, org.moflon.tgg.runtime.Match, org.moflon.tgg.runtime.Match) <em>Is Applicable solve Csp CC</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable solve Csp CC</em>' operation.
	 * @see ImplementationTransformator.Rules.XSimplexCopperCableRule#isApplicable_solveCsp_CC(implementation.Container, xtextImplementation.xtextImpl.CableAttributes, xtextImplementation.xtextImpl.XDevice, xtextImplementation.xtextImpl.XCopperCable, xtextImplementation.xtextImpl.XContainer, implementation.CopperCable, implementation.Device, org.moflon.tgg.runtime.Match, org.moflon.tgg.runtime.Match)
	 * @generated
	 */
	EOperation getXSimplexCopperCableRule__IsApplicable_solveCsp_CC__Container_CableAttributes_XDevice_XCopperCable_XContainer_CopperCable_Device_Match_Match();

	/**
	 * Returns the meta object for the '{@link ImplementationTransformator.Rules.XSimplexCopperCableRule#isApplicable_checkCsp_CC(org.moflon.tgg.language.csp.CSP) <em>Is Applicable check Csp CC</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable check Csp CC</em>' operation.
	 * @see ImplementationTransformator.Rules.XSimplexCopperCableRule#isApplicable_checkCsp_CC(org.moflon.tgg.language.csp.CSP)
	 * @generated
	 */
	EOperation getXSimplexCopperCableRule__IsApplicable_checkCsp_CC__CSP();

	/**
	 * Returns the meta object for the '{@link ImplementationTransformator.Rules.XSimplexCopperCableRule#checkDEC_FWD(xtextImplementation.xtextImpl.CableAttributes, xtextImplementation.xtextImpl.XDevice, xtextImplementation.xtextImpl.XCopperCable, xtextImplementation.xtextImpl.XContainer) <em>Check DEC FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check DEC FWD</em>' operation.
	 * @see ImplementationTransformator.Rules.XSimplexCopperCableRule#checkDEC_FWD(xtextImplementation.xtextImpl.CableAttributes, xtextImplementation.xtextImpl.XDevice, xtextImplementation.xtextImpl.XCopperCable, xtextImplementation.xtextImpl.XContainer)
	 * @generated
	 */
	EOperation getXSimplexCopperCableRule__CheckDEC_FWD__CableAttributes_XDevice_XCopperCable_XContainer();

	/**
	 * Returns the meta object for the '{@link ImplementationTransformator.Rules.XSimplexCopperCableRule#checkDEC_BWD(implementation.Container, implementation.CopperCable, implementation.Device) <em>Check DEC BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check DEC BWD</em>' operation.
	 * @see ImplementationTransformator.Rules.XSimplexCopperCableRule#checkDEC_BWD(implementation.Container, implementation.CopperCable, implementation.Device)
	 * @generated
	 */
	EOperation getXSimplexCopperCableRule__CheckDEC_BWD__Container_CopperCable_Device();

	/**
	 * Returns the meta object for the '{@link ImplementationTransformator.Rules.XSimplexCopperCableRule#generateModel(org.moflon.tgg.language.modelgenerator.RuleEntryContainer, ImplementationTransformator.XDeviceToDevice) <em>Generate Model</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Generate Model</em>' operation.
	 * @see ImplementationTransformator.Rules.XSimplexCopperCableRule#generateModel(org.moflon.tgg.language.modelgenerator.RuleEntryContainer, ImplementationTransformator.XDeviceToDevice)
	 * @generated
	 */
	EOperation getXSimplexCopperCableRule__GenerateModel__RuleEntryContainer_XDeviceToDevice();

	/**
	 * Returns the meta object for the '{@link ImplementationTransformator.Rules.XSimplexCopperCableRule#generateModel_solveCsp_BWD(org.moflon.tgg.runtime.IsApplicableMatch, implementation.Container, xtextImplementation.xtextImpl.XDevice, xtextImplementation.xtextImpl.XContainer, implementation.Device, ImplementationTransformator.XDeviceToDevice, org.moflon.tgg.runtime.ModelgeneratorRuleResult) <em>Generate Model solve Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Generate Model solve Csp BWD</em>' operation.
	 * @see ImplementationTransformator.Rules.XSimplexCopperCableRule#generateModel_solveCsp_BWD(org.moflon.tgg.runtime.IsApplicableMatch, implementation.Container, xtextImplementation.xtextImpl.XDevice, xtextImplementation.xtextImpl.XContainer, implementation.Device, ImplementationTransformator.XDeviceToDevice, org.moflon.tgg.runtime.ModelgeneratorRuleResult)
	 * @generated
	 */
	EOperation getXSimplexCopperCableRule__GenerateModel_solveCsp_BWD__IsApplicableMatch_Container_XDevice_XContainer_Device_XDeviceToDevice_ModelgeneratorRuleResult();

	/**
	 * Returns the meta object for the '{@link ImplementationTransformator.Rules.XSimplexCopperCableRule#generateModel_checkCsp_BWD(org.moflon.tgg.language.csp.CSP) <em>Generate Model check Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Generate Model check Csp BWD</em>' operation.
	 * @see ImplementationTransformator.Rules.XSimplexCopperCableRule#generateModel_checkCsp_BWD(org.moflon.tgg.language.csp.CSP)
	 * @generated
	 */
	EOperation getXSimplexCopperCableRule__GenerateModel_checkCsp_BWD__CSP();

	/**
	 * Returns the meta object for class '{@link ImplementationTransformator.Rules.XSimplexGlassFiberCableRule <em>XSimplex Glass Fiber Cable Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>XSimplex Glass Fiber Cable Rule</em>'.
	 * @see ImplementationTransformator.Rules.XSimplexGlassFiberCableRule
	 * @generated
	 */
	EClass getXSimplexGlassFiberCableRule();

	/**
	 * Returns the meta object for the '{@link ImplementationTransformator.Rules.XSimplexGlassFiberCableRule#isAppropriate_FWD(org.moflon.tgg.runtime.Match, xtextImplementation.xtextImpl.CableAttributes, xtextImplementation.xtextImpl.XDevice, xtextImplementation.xtextImpl.XGlassFiberCable, xtextImplementation.xtextImpl.XContainer) <em>Is Appropriate FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD</em>' operation.
	 * @see ImplementationTransformator.Rules.XSimplexGlassFiberCableRule#isAppropriate_FWD(org.moflon.tgg.runtime.Match, xtextImplementation.xtextImpl.CableAttributes, xtextImplementation.xtextImpl.XDevice, xtextImplementation.xtextImpl.XGlassFiberCable, xtextImplementation.xtextImpl.XContainer)
	 * @generated
	 */
	EOperation getXSimplexGlassFiberCableRule__IsAppropriate_FWD__Match_CableAttributes_XDevice_XGlassFiberCable_XContainer();

	/**
	 * Returns the meta object for the '{@link ImplementationTransformator.Rules.XSimplexGlassFiberCableRule#perform_FWD(org.moflon.tgg.runtime.IsApplicableMatch) <em>Perform FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Perform FWD</em>' operation.
	 * @see ImplementationTransformator.Rules.XSimplexGlassFiberCableRule#perform_FWD(org.moflon.tgg.runtime.IsApplicableMatch)
	 * @generated
	 */
	EOperation getXSimplexGlassFiberCableRule__Perform_FWD__IsApplicableMatch();

	/**
	 * Returns the meta object for the '{@link ImplementationTransformator.Rules.XSimplexGlassFiberCableRule#isApplicable_FWD(org.moflon.tgg.runtime.Match) <em>Is Applicable FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable FWD</em>' operation.
	 * @see ImplementationTransformator.Rules.XSimplexGlassFiberCableRule#isApplicable_FWD(org.moflon.tgg.runtime.Match)
	 * @generated
	 */
	EOperation getXSimplexGlassFiberCableRule__IsApplicable_FWD__Match();

	/**
	 * Returns the meta object for the '{@link ImplementationTransformator.Rules.XSimplexGlassFiberCableRule#registerObjectsToMatch_FWD(org.moflon.tgg.runtime.Match, xtextImplementation.xtextImpl.CableAttributes, xtextImplementation.xtextImpl.XDevice, xtextImplementation.xtextImpl.XGlassFiberCable, xtextImplementation.xtextImpl.XContainer) <em>Register Objects To Match FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Register Objects To Match FWD</em>' operation.
	 * @see ImplementationTransformator.Rules.XSimplexGlassFiberCableRule#registerObjectsToMatch_FWD(org.moflon.tgg.runtime.Match, xtextImplementation.xtextImpl.CableAttributes, xtextImplementation.xtextImpl.XDevice, xtextImplementation.xtextImpl.XGlassFiberCable, xtextImplementation.xtextImpl.XContainer)
	 * @generated
	 */
	EOperation getXSimplexGlassFiberCableRule__RegisterObjectsToMatch_FWD__Match_CableAttributes_XDevice_XGlassFiberCable_XContainer();

	/**
	 * Returns the meta object for the '{@link ImplementationTransformator.Rules.XSimplexGlassFiberCableRule#isAppropriate_solveCsp_FWD(org.moflon.tgg.runtime.Match, xtextImplementation.xtextImpl.CableAttributes, xtextImplementation.xtextImpl.XDevice, xtextImplementation.xtextImpl.XGlassFiberCable, xtextImplementation.xtextImpl.XContainer) <em>Is Appropriate solve Csp FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate solve Csp FWD</em>' operation.
	 * @see ImplementationTransformator.Rules.XSimplexGlassFiberCableRule#isAppropriate_solveCsp_FWD(org.moflon.tgg.runtime.Match, xtextImplementation.xtextImpl.CableAttributes, xtextImplementation.xtextImpl.XDevice, xtextImplementation.xtextImpl.XGlassFiberCable, xtextImplementation.xtextImpl.XContainer)
	 * @generated
	 */
	EOperation getXSimplexGlassFiberCableRule__IsAppropriate_solveCsp_FWD__Match_CableAttributes_XDevice_XGlassFiberCable_XContainer();

	/**
	 * Returns the meta object for the '{@link ImplementationTransformator.Rules.XSimplexGlassFiberCableRule#isAppropriate_checkCsp_FWD(org.moflon.tgg.language.csp.CSP) <em>Is Appropriate check Csp FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate check Csp FWD</em>' operation.
	 * @see ImplementationTransformator.Rules.XSimplexGlassFiberCableRule#isAppropriate_checkCsp_FWD(org.moflon.tgg.language.csp.CSP)
	 * @generated
	 */
	EOperation getXSimplexGlassFiberCableRule__IsAppropriate_checkCsp_FWD__CSP();

	/**
	 * Returns the meta object for the '{@link ImplementationTransformator.Rules.XSimplexGlassFiberCableRule#isApplicable_solveCsp_FWD(org.moflon.tgg.runtime.IsApplicableMatch, implementation.Container, xtextImplementation.xtextImpl.CableAttributes, xtextImplementation.xtextImpl.XDevice, xtextImplementation.xtextImpl.XGlassFiberCable, xtextImplementation.xtextImpl.XContainer, implementation.Device, ImplementationTransformator.XDeviceToDevice) <em>Is Applicable solve Csp FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable solve Csp FWD</em>' operation.
	 * @see ImplementationTransformator.Rules.XSimplexGlassFiberCableRule#isApplicable_solveCsp_FWD(org.moflon.tgg.runtime.IsApplicableMatch, implementation.Container, xtextImplementation.xtextImpl.CableAttributes, xtextImplementation.xtextImpl.XDevice, xtextImplementation.xtextImpl.XGlassFiberCable, xtextImplementation.xtextImpl.XContainer, implementation.Device, ImplementationTransformator.XDeviceToDevice)
	 * @generated
	 */
	EOperation getXSimplexGlassFiberCableRule__IsApplicable_solveCsp_FWD__IsApplicableMatch_Container_CableAttributes_XDevice_XGlassFiberCable_XContainer_Device_XDeviceToDevice();

	/**
	 * Returns the meta object for the '{@link ImplementationTransformator.Rules.XSimplexGlassFiberCableRule#isApplicable_checkCsp_FWD(org.moflon.tgg.language.csp.CSP) <em>Is Applicable check Csp FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable check Csp FWD</em>' operation.
	 * @see ImplementationTransformator.Rules.XSimplexGlassFiberCableRule#isApplicable_checkCsp_FWD(org.moflon.tgg.language.csp.CSP)
	 * @generated
	 */
	EOperation getXSimplexGlassFiberCableRule__IsApplicable_checkCsp_FWD__CSP();

	/**
	 * Returns the meta object for the '{@link ImplementationTransformator.Rules.XSimplexGlassFiberCableRule#registerObjects_FWD(org.moflon.tgg.runtime.PerformRuleResult, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject) <em>Register Objects FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Register Objects FWD</em>' operation.
	 * @see ImplementationTransformator.Rules.XSimplexGlassFiberCableRule#registerObjects_FWD(org.moflon.tgg.runtime.PerformRuleResult, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	EOperation getXSimplexGlassFiberCableRule__RegisterObjects_FWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject();

	/**
	 * Returns the meta object for the '{@link ImplementationTransformator.Rules.XSimplexGlassFiberCableRule#checkTypes_FWD(org.moflon.tgg.runtime.Match) <em>Check Types FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check Types FWD</em>' operation.
	 * @see ImplementationTransformator.Rules.XSimplexGlassFiberCableRule#checkTypes_FWD(org.moflon.tgg.runtime.Match)
	 * @generated
	 */
	EOperation getXSimplexGlassFiberCableRule__CheckTypes_FWD__Match();

	/**
	 * Returns the meta object for the '{@link ImplementationTransformator.Rules.XSimplexGlassFiberCableRule#isAppropriate_BWD(org.moflon.tgg.runtime.Match, implementation.Container, implementation.GlassFiberCable, implementation.Device) <em>Is Appropriate BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD</em>' operation.
	 * @see ImplementationTransformator.Rules.XSimplexGlassFiberCableRule#isAppropriate_BWD(org.moflon.tgg.runtime.Match, implementation.Container, implementation.GlassFiberCable, implementation.Device)
	 * @generated
	 */
	EOperation getXSimplexGlassFiberCableRule__IsAppropriate_BWD__Match_Container_GlassFiberCable_Device();

	/**
	 * Returns the meta object for the '{@link ImplementationTransformator.Rules.XSimplexGlassFiberCableRule#perform_BWD(org.moflon.tgg.runtime.IsApplicableMatch) <em>Perform BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Perform BWD</em>' operation.
	 * @see ImplementationTransformator.Rules.XSimplexGlassFiberCableRule#perform_BWD(org.moflon.tgg.runtime.IsApplicableMatch)
	 * @generated
	 */
	EOperation getXSimplexGlassFiberCableRule__Perform_BWD__IsApplicableMatch();

	/**
	 * Returns the meta object for the '{@link ImplementationTransformator.Rules.XSimplexGlassFiberCableRule#isApplicable_BWD(org.moflon.tgg.runtime.Match) <em>Is Applicable BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable BWD</em>' operation.
	 * @see ImplementationTransformator.Rules.XSimplexGlassFiberCableRule#isApplicable_BWD(org.moflon.tgg.runtime.Match)
	 * @generated
	 */
	EOperation getXSimplexGlassFiberCableRule__IsApplicable_BWD__Match();

	/**
	 * Returns the meta object for the '{@link ImplementationTransformator.Rules.XSimplexGlassFiberCableRule#registerObjectsToMatch_BWD(org.moflon.tgg.runtime.Match, implementation.Container, implementation.GlassFiberCable, implementation.Device) <em>Register Objects To Match BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Register Objects To Match BWD</em>' operation.
	 * @see ImplementationTransformator.Rules.XSimplexGlassFiberCableRule#registerObjectsToMatch_BWD(org.moflon.tgg.runtime.Match, implementation.Container, implementation.GlassFiberCable, implementation.Device)
	 * @generated
	 */
	EOperation getXSimplexGlassFiberCableRule__RegisterObjectsToMatch_BWD__Match_Container_GlassFiberCable_Device();

	/**
	 * Returns the meta object for the '{@link ImplementationTransformator.Rules.XSimplexGlassFiberCableRule#isAppropriate_solveCsp_BWD(org.moflon.tgg.runtime.Match, implementation.Container, implementation.GlassFiberCable, implementation.Device) <em>Is Appropriate solve Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate solve Csp BWD</em>' operation.
	 * @see ImplementationTransformator.Rules.XSimplexGlassFiberCableRule#isAppropriate_solveCsp_BWD(org.moflon.tgg.runtime.Match, implementation.Container, implementation.GlassFiberCable, implementation.Device)
	 * @generated
	 */
	EOperation getXSimplexGlassFiberCableRule__IsAppropriate_solveCsp_BWD__Match_Container_GlassFiberCable_Device();

	/**
	 * Returns the meta object for the '{@link ImplementationTransformator.Rules.XSimplexGlassFiberCableRule#isAppropriate_checkCsp_BWD(org.moflon.tgg.language.csp.CSP) <em>Is Appropriate check Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate check Csp BWD</em>' operation.
	 * @see ImplementationTransformator.Rules.XSimplexGlassFiberCableRule#isAppropriate_checkCsp_BWD(org.moflon.tgg.language.csp.CSP)
	 * @generated
	 */
	EOperation getXSimplexGlassFiberCableRule__IsAppropriate_checkCsp_BWD__CSP();

	/**
	 * Returns the meta object for the '{@link ImplementationTransformator.Rules.XSimplexGlassFiberCableRule#isApplicable_solveCsp_BWD(org.moflon.tgg.runtime.IsApplicableMatch, implementation.Container, xtextImplementation.xtextImpl.XDevice, xtextImplementation.xtextImpl.XContainer, implementation.GlassFiberCable, implementation.Device, ImplementationTransformator.XDeviceToDevice) <em>Is Applicable solve Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable solve Csp BWD</em>' operation.
	 * @see ImplementationTransformator.Rules.XSimplexGlassFiberCableRule#isApplicable_solveCsp_BWD(org.moflon.tgg.runtime.IsApplicableMatch, implementation.Container, xtextImplementation.xtextImpl.XDevice, xtextImplementation.xtextImpl.XContainer, implementation.GlassFiberCable, implementation.Device, ImplementationTransformator.XDeviceToDevice)
	 * @generated
	 */
	EOperation getXSimplexGlassFiberCableRule__IsApplicable_solveCsp_BWD__IsApplicableMatch_Container_XDevice_XContainer_GlassFiberCable_Device_XDeviceToDevice();

	/**
	 * Returns the meta object for the '{@link ImplementationTransformator.Rules.XSimplexGlassFiberCableRule#isApplicable_checkCsp_BWD(org.moflon.tgg.language.csp.CSP) <em>Is Applicable check Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable check Csp BWD</em>' operation.
	 * @see ImplementationTransformator.Rules.XSimplexGlassFiberCableRule#isApplicable_checkCsp_BWD(org.moflon.tgg.language.csp.CSP)
	 * @generated
	 */
	EOperation getXSimplexGlassFiberCableRule__IsApplicable_checkCsp_BWD__CSP();

	/**
	 * Returns the meta object for the '{@link ImplementationTransformator.Rules.XSimplexGlassFiberCableRule#registerObjects_BWD(org.moflon.tgg.runtime.PerformRuleResult, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject) <em>Register Objects BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Register Objects BWD</em>' operation.
	 * @see ImplementationTransformator.Rules.XSimplexGlassFiberCableRule#registerObjects_BWD(org.moflon.tgg.runtime.PerformRuleResult, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	EOperation getXSimplexGlassFiberCableRule__RegisterObjects_BWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject();

	/**
	 * Returns the meta object for the '{@link ImplementationTransformator.Rules.XSimplexGlassFiberCableRule#checkTypes_BWD(org.moflon.tgg.runtime.Match) <em>Check Types BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check Types BWD</em>' operation.
	 * @see ImplementationTransformator.Rules.XSimplexGlassFiberCableRule#checkTypes_BWD(org.moflon.tgg.runtime.Match)
	 * @generated
	 */
	EOperation getXSimplexGlassFiberCableRule__CheckTypes_BWD__Match();

	/**
	 * Returns the meta object for the '{@link ImplementationTransformator.Rules.XSimplexGlassFiberCableRule#isAppropriate_BWD_EMoflonEdge_16(org.moflon.tgg.runtime.EMoflonEdge) <em>Is Appropriate BWD EMoflon Edge 16</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD EMoflon Edge 16</em>' operation.
	 * @see ImplementationTransformator.Rules.XSimplexGlassFiberCableRule#isAppropriate_BWD_EMoflonEdge_16(org.moflon.tgg.runtime.EMoflonEdge)
	 * @generated
	 */
	EOperation getXSimplexGlassFiberCableRule__IsAppropriate_BWD_EMoflonEdge_16__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link ImplementationTransformator.Rules.XSimplexGlassFiberCableRule#isAppropriate_FWD_EMoflonEdge_12(org.moflon.tgg.runtime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 12</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 12</em>' operation.
	 * @see ImplementationTransformator.Rules.XSimplexGlassFiberCableRule#isAppropriate_FWD_EMoflonEdge_12(org.moflon.tgg.runtime.EMoflonEdge)
	 * @generated
	 */
	EOperation getXSimplexGlassFiberCableRule__IsAppropriate_FWD_EMoflonEdge_12__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link ImplementationTransformator.Rules.XSimplexGlassFiberCableRule#checkAttributes_FWD(org.moflon.tgg.runtime.TripleMatch) <em>Check Attributes FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check Attributes FWD</em>' operation.
	 * @see ImplementationTransformator.Rules.XSimplexGlassFiberCableRule#checkAttributes_FWD(org.moflon.tgg.runtime.TripleMatch)
	 * @generated
	 */
	EOperation getXSimplexGlassFiberCableRule__CheckAttributes_FWD__TripleMatch();

	/**
	 * Returns the meta object for the '{@link ImplementationTransformator.Rules.XSimplexGlassFiberCableRule#checkAttributes_BWD(org.moflon.tgg.runtime.TripleMatch) <em>Check Attributes BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check Attributes BWD</em>' operation.
	 * @see ImplementationTransformator.Rules.XSimplexGlassFiberCableRule#checkAttributes_BWD(org.moflon.tgg.runtime.TripleMatch)
	 * @generated
	 */
	EOperation getXSimplexGlassFiberCableRule__CheckAttributes_BWD__TripleMatch();

	/**
	 * Returns the meta object for the '{@link ImplementationTransformator.Rules.XSimplexGlassFiberCableRule#isApplicable_CC(org.moflon.tgg.runtime.Match, org.moflon.tgg.runtime.Match) <em>Is Applicable CC</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable CC</em>' operation.
	 * @see ImplementationTransformator.Rules.XSimplexGlassFiberCableRule#isApplicable_CC(org.moflon.tgg.runtime.Match, org.moflon.tgg.runtime.Match)
	 * @generated
	 */
	EOperation getXSimplexGlassFiberCableRule__IsApplicable_CC__Match_Match();

	/**
	 * Returns the meta object for the '{@link ImplementationTransformator.Rules.XSimplexGlassFiberCableRule#isApplicable_solveCsp_CC(implementation.Container, xtextImplementation.xtextImpl.CableAttributes, xtextImplementation.xtextImpl.XDevice, xtextImplementation.xtextImpl.XGlassFiberCable, xtextImplementation.xtextImpl.XContainer, implementation.GlassFiberCable, implementation.Device, org.moflon.tgg.runtime.Match, org.moflon.tgg.runtime.Match) <em>Is Applicable solve Csp CC</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable solve Csp CC</em>' operation.
	 * @see ImplementationTransformator.Rules.XSimplexGlassFiberCableRule#isApplicable_solveCsp_CC(implementation.Container, xtextImplementation.xtextImpl.CableAttributes, xtextImplementation.xtextImpl.XDevice, xtextImplementation.xtextImpl.XGlassFiberCable, xtextImplementation.xtextImpl.XContainer, implementation.GlassFiberCable, implementation.Device, org.moflon.tgg.runtime.Match, org.moflon.tgg.runtime.Match)
	 * @generated
	 */
	EOperation getXSimplexGlassFiberCableRule__IsApplicable_solveCsp_CC__Container_CableAttributes_XDevice_XGlassFiberCable_XContainer_GlassFiberCable_Device_Match_Match();

	/**
	 * Returns the meta object for the '{@link ImplementationTransformator.Rules.XSimplexGlassFiberCableRule#isApplicable_checkCsp_CC(org.moflon.tgg.language.csp.CSP) <em>Is Applicable check Csp CC</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable check Csp CC</em>' operation.
	 * @see ImplementationTransformator.Rules.XSimplexGlassFiberCableRule#isApplicable_checkCsp_CC(org.moflon.tgg.language.csp.CSP)
	 * @generated
	 */
	EOperation getXSimplexGlassFiberCableRule__IsApplicable_checkCsp_CC__CSP();

	/**
	 * Returns the meta object for the '{@link ImplementationTransformator.Rules.XSimplexGlassFiberCableRule#checkDEC_FWD(xtextImplementation.xtextImpl.CableAttributes, xtextImplementation.xtextImpl.XDevice, xtextImplementation.xtextImpl.XGlassFiberCable, xtextImplementation.xtextImpl.XContainer) <em>Check DEC FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check DEC FWD</em>' operation.
	 * @see ImplementationTransformator.Rules.XSimplexGlassFiberCableRule#checkDEC_FWD(xtextImplementation.xtextImpl.CableAttributes, xtextImplementation.xtextImpl.XDevice, xtextImplementation.xtextImpl.XGlassFiberCable, xtextImplementation.xtextImpl.XContainer)
	 * @generated
	 */
	EOperation getXSimplexGlassFiberCableRule__CheckDEC_FWD__CableAttributes_XDevice_XGlassFiberCable_XContainer();

	/**
	 * Returns the meta object for the '{@link ImplementationTransformator.Rules.XSimplexGlassFiberCableRule#checkDEC_BWD(implementation.Container, implementation.GlassFiberCable, implementation.Device) <em>Check DEC BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check DEC BWD</em>' operation.
	 * @see ImplementationTransformator.Rules.XSimplexGlassFiberCableRule#checkDEC_BWD(implementation.Container, implementation.GlassFiberCable, implementation.Device)
	 * @generated
	 */
	EOperation getXSimplexGlassFiberCableRule__CheckDEC_BWD__Container_GlassFiberCable_Device();

	/**
	 * Returns the meta object for the '{@link ImplementationTransformator.Rules.XSimplexGlassFiberCableRule#generateModel(org.moflon.tgg.language.modelgenerator.RuleEntryContainer, ImplementationTransformator.XDeviceToDevice) <em>Generate Model</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Generate Model</em>' operation.
	 * @see ImplementationTransformator.Rules.XSimplexGlassFiberCableRule#generateModel(org.moflon.tgg.language.modelgenerator.RuleEntryContainer, ImplementationTransformator.XDeviceToDevice)
	 * @generated
	 */
	EOperation getXSimplexGlassFiberCableRule__GenerateModel__RuleEntryContainer_XDeviceToDevice();

	/**
	 * Returns the meta object for the '{@link ImplementationTransformator.Rules.XSimplexGlassFiberCableRule#generateModel_solveCsp_BWD(org.moflon.tgg.runtime.IsApplicableMatch, implementation.Container, xtextImplementation.xtextImpl.XDevice, xtextImplementation.xtextImpl.XContainer, implementation.Device, ImplementationTransformator.XDeviceToDevice, org.moflon.tgg.runtime.ModelgeneratorRuleResult) <em>Generate Model solve Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Generate Model solve Csp BWD</em>' operation.
	 * @see ImplementationTransformator.Rules.XSimplexGlassFiberCableRule#generateModel_solveCsp_BWD(org.moflon.tgg.runtime.IsApplicableMatch, implementation.Container, xtextImplementation.xtextImpl.XDevice, xtextImplementation.xtextImpl.XContainer, implementation.Device, ImplementationTransformator.XDeviceToDevice, org.moflon.tgg.runtime.ModelgeneratorRuleResult)
	 * @generated
	 */
	EOperation getXSimplexGlassFiberCableRule__GenerateModel_solveCsp_BWD__IsApplicableMatch_Container_XDevice_XContainer_Device_XDeviceToDevice_ModelgeneratorRuleResult();

	/**
	 * Returns the meta object for the '{@link ImplementationTransformator.Rules.XSimplexGlassFiberCableRule#generateModel_checkCsp_BWD(org.moflon.tgg.language.csp.CSP) <em>Generate Model check Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Generate Model check Csp BWD</em>' operation.
	 * @see ImplementationTransformator.Rules.XSimplexGlassFiberCableRule#generateModel_checkCsp_BWD(org.moflon.tgg.language.csp.CSP)
	 * @generated
	 */
	EOperation getXSimplexGlassFiberCableRule__GenerateModel_checkCsp_BWD__CSP();

	/**
	 * Returns the meta object for class '{@link ImplementationTransformator.Rules.XDuplexCopperCableRule <em>XDuplex Copper Cable Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>XDuplex Copper Cable Rule</em>'.
	 * @see ImplementationTransformator.Rules.XDuplexCopperCableRule
	 * @generated
	 */
	EClass getXDuplexCopperCableRule();

	/**
	 * Returns the meta object for the '{@link ImplementationTransformator.Rules.XDuplexCopperCableRule#isAppropriate_FWD(org.moflon.tgg.runtime.Match, xtextImplementation.xtextImpl.CableAttributes, xtextImplementation.xtextImpl.XDevice, xtextImplementation.xtextImpl.XCopperCable, xtextImplementation.xtextImpl.XContainer) <em>Is Appropriate FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD</em>' operation.
	 * @see ImplementationTransformator.Rules.XDuplexCopperCableRule#isAppropriate_FWD(org.moflon.tgg.runtime.Match, xtextImplementation.xtextImpl.CableAttributes, xtextImplementation.xtextImpl.XDevice, xtextImplementation.xtextImpl.XCopperCable, xtextImplementation.xtextImpl.XContainer)
	 * @generated
	 */
	EOperation getXDuplexCopperCableRule__IsAppropriate_FWD__Match_CableAttributes_XDevice_XCopperCable_XContainer();

	/**
	 * Returns the meta object for the '{@link ImplementationTransformator.Rules.XDuplexCopperCableRule#perform_FWD(org.moflon.tgg.runtime.IsApplicableMatch) <em>Perform FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Perform FWD</em>' operation.
	 * @see ImplementationTransformator.Rules.XDuplexCopperCableRule#perform_FWD(org.moflon.tgg.runtime.IsApplicableMatch)
	 * @generated
	 */
	EOperation getXDuplexCopperCableRule__Perform_FWD__IsApplicableMatch();

	/**
	 * Returns the meta object for the '{@link ImplementationTransformator.Rules.XDuplexCopperCableRule#isApplicable_FWD(org.moflon.tgg.runtime.Match) <em>Is Applicable FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable FWD</em>' operation.
	 * @see ImplementationTransformator.Rules.XDuplexCopperCableRule#isApplicable_FWD(org.moflon.tgg.runtime.Match)
	 * @generated
	 */
	EOperation getXDuplexCopperCableRule__IsApplicable_FWD__Match();

	/**
	 * Returns the meta object for the '{@link ImplementationTransformator.Rules.XDuplexCopperCableRule#registerObjectsToMatch_FWD(org.moflon.tgg.runtime.Match, xtextImplementation.xtextImpl.CableAttributes, xtextImplementation.xtextImpl.XDevice, xtextImplementation.xtextImpl.XCopperCable, xtextImplementation.xtextImpl.XContainer) <em>Register Objects To Match FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Register Objects To Match FWD</em>' operation.
	 * @see ImplementationTransformator.Rules.XDuplexCopperCableRule#registerObjectsToMatch_FWD(org.moflon.tgg.runtime.Match, xtextImplementation.xtextImpl.CableAttributes, xtextImplementation.xtextImpl.XDevice, xtextImplementation.xtextImpl.XCopperCable, xtextImplementation.xtextImpl.XContainer)
	 * @generated
	 */
	EOperation getXDuplexCopperCableRule__RegisterObjectsToMatch_FWD__Match_CableAttributes_XDevice_XCopperCable_XContainer();

	/**
	 * Returns the meta object for the '{@link ImplementationTransformator.Rules.XDuplexCopperCableRule#isAppropriate_solveCsp_FWD(org.moflon.tgg.runtime.Match, xtextImplementation.xtextImpl.CableAttributes, xtextImplementation.xtextImpl.XDevice, xtextImplementation.xtextImpl.XCopperCable, xtextImplementation.xtextImpl.XContainer) <em>Is Appropriate solve Csp FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate solve Csp FWD</em>' operation.
	 * @see ImplementationTransformator.Rules.XDuplexCopperCableRule#isAppropriate_solveCsp_FWD(org.moflon.tgg.runtime.Match, xtextImplementation.xtextImpl.CableAttributes, xtextImplementation.xtextImpl.XDevice, xtextImplementation.xtextImpl.XCopperCable, xtextImplementation.xtextImpl.XContainer)
	 * @generated
	 */
	EOperation getXDuplexCopperCableRule__IsAppropriate_solveCsp_FWD__Match_CableAttributes_XDevice_XCopperCable_XContainer();

	/**
	 * Returns the meta object for the '{@link ImplementationTransformator.Rules.XDuplexCopperCableRule#isAppropriate_checkCsp_FWD(org.moflon.tgg.language.csp.CSP) <em>Is Appropriate check Csp FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate check Csp FWD</em>' operation.
	 * @see ImplementationTransformator.Rules.XDuplexCopperCableRule#isAppropriate_checkCsp_FWD(org.moflon.tgg.language.csp.CSP)
	 * @generated
	 */
	EOperation getXDuplexCopperCableRule__IsAppropriate_checkCsp_FWD__CSP();

	/**
	 * Returns the meta object for the '{@link ImplementationTransformator.Rules.XDuplexCopperCableRule#isApplicable_solveCsp_FWD(org.moflon.tgg.runtime.IsApplicableMatch, implementation.Container, xtextImplementation.xtextImpl.CableAttributes, xtextImplementation.xtextImpl.XDevice, xtextImplementation.xtextImpl.XCopperCable, xtextImplementation.xtextImpl.XContainer, implementation.Device, ImplementationTransformator.XDeviceToDevice) <em>Is Applicable solve Csp FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable solve Csp FWD</em>' operation.
	 * @see ImplementationTransformator.Rules.XDuplexCopperCableRule#isApplicable_solveCsp_FWD(org.moflon.tgg.runtime.IsApplicableMatch, implementation.Container, xtextImplementation.xtextImpl.CableAttributes, xtextImplementation.xtextImpl.XDevice, xtextImplementation.xtextImpl.XCopperCable, xtextImplementation.xtextImpl.XContainer, implementation.Device, ImplementationTransformator.XDeviceToDevice)
	 * @generated
	 */
	EOperation getXDuplexCopperCableRule__IsApplicable_solveCsp_FWD__IsApplicableMatch_Container_CableAttributes_XDevice_XCopperCable_XContainer_Device_XDeviceToDevice();

	/**
	 * Returns the meta object for the '{@link ImplementationTransformator.Rules.XDuplexCopperCableRule#isApplicable_checkCsp_FWD(org.moflon.tgg.language.csp.CSP) <em>Is Applicable check Csp FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable check Csp FWD</em>' operation.
	 * @see ImplementationTransformator.Rules.XDuplexCopperCableRule#isApplicable_checkCsp_FWD(org.moflon.tgg.language.csp.CSP)
	 * @generated
	 */
	EOperation getXDuplexCopperCableRule__IsApplicable_checkCsp_FWD__CSP();

	/**
	 * Returns the meta object for the '{@link ImplementationTransformator.Rules.XDuplexCopperCableRule#registerObjects_FWD(org.moflon.tgg.runtime.PerformRuleResult, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject) <em>Register Objects FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Register Objects FWD</em>' operation.
	 * @see ImplementationTransformator.Rules.XDuplexCopperCableRule#registerObjects_FWD(org.moflon.tgg.runtime.PerformRuleResult, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	EOperation getXDuplexCopperCableRule__RegisterObjects_FWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject();

	/**
	 * Returns the meta object for the '{@link ImplementationTransformator.Rules.XDuplexCopperCableRule#checkTypes_FWD(org.moflon.tgg.runtime.Match) <em>Check Types FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check Types FWD</em>' operation.
	 * @see ImplementationTransformator.Rules.XDuplexCopperCableRule#checkTypes_FWD(org.moflon.tgg.runtime.Match)
	 * @generated
	 */
	EOperation getXDuplexCopperCableRule__CheckTypes_FWD__Match();

	/**
	 * Returns the meta object for the '{@link ImplementationTransformator.Rules.XDuplexCopperCableRule#isAppropriate_BWD(org.moflon.tgg.runtime.Match, implementation.CopperCable, implementation.Container, implementation.GlassFiberCable, implementation.Device) <em>Is Appropriate BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD</em>' operation.
	 * @see ImplementationTransformator.Rules.XDuplexCopperCableRule#isAppropriate_BWD(org.moflon.tgg.runtime.Match, implementation.CopperCable, implementation.Container, implementation.GlassFiberCable, implementation.Device)
	 * @generated
	 */
	EOperation getXDuplexCopperCableRule__IsAppropriate_BWD__Match_CopperCable_Container_GlassFiberCable_Device();

	/**
	 * Returns the meta object for the '{@link ImplementationTransformator.Rules.XDuplexCopperCableRule#perform_BWD(org.moflon.tgg.runtime.IsApplicableMatch) <em>Perform BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Perform BWD</em>' operation.
	 * @see ImplementationTransformator.Rules.XDuplexCopperCableRule#perform_BWD(org.moflon.tgg.runtime.IsApplicableMatch)
	 * @generated
	 */
	EOperation getXDuplexCopperCableRule__Perform_BWD__IsApplicableMatch();

	/**
	 * Returns the meta object for the '{@link ImplementationTransformator.Rules.XDuplexCopperCableRule#isApplicable_BWD(org.moflon.tgg.runtime.Match) <em>Is Applicable BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable BWD</em>' operation.
	 * @see ImplementationTransformator.Rules.XDuplexCopperCableRule#isApplicable_BWD(org.moflon.tgg.runtime.Match)
	 * @generated
	 */
	EOperation getXDuplexCopperCableRule__IsApplicable_BWD__Match();

	/**
	 * Returns the meta object for the '{@link ImplementationTransformator.Rules.XDuplexCopperCableRule#registerObjectsToMatch_BWD(org.moflon.tgg.runtime.Match, implementation.CopperCable, implementation.Container, implementation.GlassFiberCable, implementation.Device) <em>Register Objects To Match BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Register Objects To Match BWD</em>' operation.
	 * @see ImplementationTransformator.Rules.XDuplexCopperCableRule#registerObjectsToMatch_BWD(org.moflon.tgg.runtime.Match, implementation.CopperCable, implementation.Container, implementation.GlassFiberCable, implementation.Device)
	 * @generated
	 */
	EOperation getXDuplexCopperCableRule__RegisterObjectsToMatch_BWD__Match_CopperCable_Container_GlassFiberCable_Device();

	/**
	 * Returns the meta object for the '{@link ImplementationTransformator.Rules.XDuplexCopperCableRule#isAppropriate_solveCsp_BWD(org.moflon.tgg.runtime.Match, implementation.CopperCable, implementation.Container, implementation.GlassFiberCable, implementation.Device) <em>Is Appropriate solve Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate solve Csp BWD</em>' operation.
	 * @see ImplementationTransformator.Rules.XDuplexCopperCableRule#isAppropriate_solveCsp_BWD(org.moflon.tgg.runtime.Match, implementation.CopperCable, implementation.Container, implementation.GlassFiberCable, implementation.Device)
	 * @generated
	 */
	EOperation getXDuplexCopperCableRule__IsAppropriate_solveCsp_BWD__Match_CopperCable_Container_GlassFiberCable_Device();

	/**
	 * Returns the meta object for the '{@link ImplementationTransformator.Rules.XDuplexCopperCableRule#isAppropriate_checkCsp_BWD(org.moflon.tgg.language.csp.CSP) <em>Is Appropriate check Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate check Csp BWD</em>' operation.
	 * @see ImplementationTransformator.Rules.XDuplexCopperCableRule#isAppropriate_checkCsp_BWD(org.moflon.tgg.language.csp.CSP)
	 * @generated
	 */
	EOperation getXDuplexCopperCableRule__IsAppropriate_checkCsp_BWD__CSP();

	/**
	 * Returns the meta object for the '{@link ImplementationTransformator.Rules.XDuplexCopperCableRule#isApplicable_solveCsp_BWD(org.moflon.tgg.runtime.IsApplicableMatch, implementation.CopperCable, implementation.Container, implementation.GlassFiberCable, xtextImplementation.xtextImpl.XDevice, xtextImplementation.xtextImpl.XContainer, implementation.Device, ImplementationTransformator.XDeviceToDevice) <em>Is Applicable solve Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable solve Csp BWD</em>' operation.
	 * @see ImplementationTransformator.Rules.XDuplexCopperCableRule#isApplicable_solveCsp_BWD(org.moflon.tgg.runtime.IsApplicableMatch, implementation.CopperCable, implementation.Container, implementation.GlassFiberCable, xtextImplementation.xtextImpl.XDevice, xtextImplementation.xtextImpl.XContainer, implementation.Device, ImplementationTransformator.XDeviceToDevice)
	 * @generated
	 */
	EOperation getXDuplexCopperCableRule__IsApplicable_solveCsp_BWD__IsApplicableMatch_CopperCable_Container_GlassFiberCable_XDevice_XContainer_Device_XDeviceToDevice();

	/**
	 * Returns the meta object for the '{@link ImplementationTransformator.Rules.XDuplexCopperCableRule#isApplicable_checkCsp_BWD(org.moflon.tgg.language.csp.CSP) <em>Is Applicable check Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable check Csp BWD</em>' operation.
	 * @see ImplementationTransformator.Rules.XDuplexCopperCableRule#isApplicable_checkCsp_BWD(org.moflon.tgg.language.csp.CSP)
	 * @generated
	 */
	EOperation getXDuplexCopperCableRule__IsApplicable_checkCsp_BWD__CSP();

	/**
	 * Returns the meta object for the '{@link ImplementationTransformator.Rules.XDuplexCopperCableRule#registerObjects_BWD(org.moflon.tgg.runtime.PerformRuleResult, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject) <em>Register Objects BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Register Objects BWD</em>' operation.
	 * @see ImplementationTransformator.Rules.XDuplexCopperCableRule#registerObjects_BWD(org.moflon.tgg.runtime.PerformRuleResult, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	EOperation getXDuplexCopperCableRule__RegisterObjects_BWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject();

	/**
	 * Returns the meta object for the '{@link ImplementationTransformator.Rules.XDuplexCopperCableRule#checkTypes_BWD(org.moflon.tgg.runtime.Match) <em>Check Types BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check Types BWD</em>' operation.
	 * @see ImplementationTransformator.Rules.XDuplexCopperCableRule#checkTypes_BWD(org.moflon.tgg.runtime.Match)
	 * @generated
	 */
	EOperation getXDuplexCopperCableRule__CheckTypes_BWD__Match();

	/**
	 * Returns the meta object for the '{@link ImplementationTransformator.Rules.XDuplexCopperCableRule#isAppropriate_BWD_EMoflonEdge_17(org.moflon.tgg.runtime.EMoflonEdge) <em>Is Appropriate BWD EMoflon Edge 17</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD EMoflon Edge 17</em>' operation.
	 * @see ImplementationTransformator.Rules.XDuplexCopperCableRule#isAppropriate_BWD_EMoflonEdge_17(org.moflon.tgg.runtime.EMoflonEdge)
	 * @generated
	 */
	EOperation getXDuplexCopperCableRule__IsAppropriate_BWD_EMoflonEdge_17__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link ImplementationTransformator.Rules.XDuplexCopperCableRule#isAppropriate_FWD_EMoflonEdge_13(org.moflon.tgg.runtime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 13</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 13</em>' operation.
	 * @see ImplementationTransformator.Rules.XDuplexCopperCableRule#isAppropriate_FWD_EMoflonEdge_13(org.moflon.tgg.runtime.EMoflonEdge)
	 * @generated
	 */
	EOperation getXDuplexCopperCableRule__IsAppropriate_FWD_EMoflonEdge_13__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link ImplementationTransformator.Rules.XDuplexCopperCableRule#checkAttributes_FWD(org.moflon.tgg.runtime.TripleMatch) <em>Check Attributes FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check Attributes FWD</em>' operation.
	 * @see ImplementationTransformator.Rules.XDuplexCopperCableRule#checkAttributes_FWD(org.moflon.tgg.runtime.TripleMatch)
	 * @generated
	 */
	EOperation getXDuplexCopperCableRule__CheckAttributes_FWD__TripleMatch();

	/**
	 * Returns the meta object for the '{@link ImplementationTransformator.Rules.XDuplexCopperCableRule#checkAttributes_BWD(org.moflon.tgg.runtime.TripleMatch) <em>Check Attributes BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check Attributes BWD</em>' operation.
	 * @see ImplementationTransformator.Rules.XDuplexCopperCableRule#checkAttributes_BWD(org.moflon.tgg.runtime.TripleMatch)
	 * @generated
	 */
	EOperation getXDuplexCopperCableRule__CheckAttributes_BWD__TripleMatch();

	/**
	 * Returns the meta object for the '{@link ImplementationTransformator.Rules.XDuplexCopperCableRule#isApplicable_CC(org.moflon.tgg.runtime.Match, org.moflon.tgg.runtime.Match) <em>Is Applicable CC</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable CC</em>' operation.
	 * @see ImplementationTransformator.Rules.XDuplexCopperCableRule#isApplicable_CC(org.moflon.tgg.runtime.Match, org.moflon.tgg.runtime.Match)
	 * @generated
	 */
	EOperation getXDuplexCopperCableRule__IsApplicable_CC__Match_Match();

	/**
	 * Returns the meta object for the '{@link ImplementationTransformator.Rules.XDuplexCopperCableRule#isApplicable_solveCsp_CC(implementation.CopperCable, implementation.Container, implementation.GlassFiberCable, xtextImplementation.xtextImpl.CableAttributes, xtextImplementation.xtextImpl.XDevice, xtextImplementation.xtextImpl.XCopperCable, xtextImplementation.xtextImpl.XContainer, implementation.Device, org.moflon.tgg.runtime.Match, org.moflon.tgg.runtime.Match) <em>Is Applicable solve Csp CC</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable solve Csp CC</em>' operation.
	 * @see ImplementationTransformator.Rules.XDuplexCopperCableRule#isApplicable_solveCsp_CC(implementation.CopperCable, implementation.Container, implementation.GlassFiberCable, xtextImplementation.xtextImpl.CableAttributes, xtextImplementation.xtextImpl.XDevice, xtextImplementation.xtextImpl.XCopperCable, xtextImplementation.xtextImpl.XContainer, implementation.Device, org.moflon.tgg.runtime.Match, org.moflon.tgg.runtime.Match)
	 * @generated
	 */
	EOperation getXDuplexCopperCableRule__IsApplicable_solveCsp_CC__CopperCable_Container_GlassFiberCable_CableAttributes_XDevice_XCopperCable_XContainer_Device_Match_Match();

	/**
	 * Returns the meta object for the '{@link ImplementationTransformator.Rules.XDuplexCopperCableRule#isApplicable_checkCsp_CC(org.moflon.tgg.language.csp.CSP) <em>Is Applicable check Csp CC</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable check Csp CC</em>' operation.
	 * @see ImplementationTransformator.Rules.XDuplexCopperCableRule#isApplicable_checkCsp_CC(org.moflon.tgg.language.csp.CSP)
	 * @generated
	 */
	EOperation getXDuplexCopperCableRule__IsApplicable_checkCsp_CC__CSP();

	/**
	 * Returns the meta object for the '{@link ImplementationTransformator.Rules.XDuplexCopperCableRule#checkDEC_FWD(xtextImplementation.xtextImpl.CableAttributes, xtextImplementation.xtextImpl.XDevice, xtextImplementation.xtextImpl.XCopperCable, xtextImplementation.xtextImpl.XContainer) <em>Check DEC FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check DEC FWD</em>' operation.
	 * @see ImplementationTransformator.Rules.XDuplexCopperCableRule#checkDEC_FWD(xtextImplementation.xtextImpl.CableAttributes, xtextImplementation.xtextImpl.XDevice, xtextImplementation.xtextImpl.XCopperCable, xtextImplementation.xtextImpl.XContainer)
	 * @generated
	 */
	EOperation getXDuplexCopperCableRule__CheckDEC_FWD__CableAttributes_XDevice_XCopperCable_XContainer();

	/**
	 * Returns the meta object for the '{@link ImplementationTransformator.Rules.XDuplexCopperCableRule#checkDEC_BWD(implementation.CopperCable, implementation.Container, implementation.GlassFiberCable, implementation.Device) <em>Check DEC BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check DEC BWD</em>' operation.
	 * @see ImplementationTransformator.Rules.XDuplexCopperCableRule#checkDEC_BWD(implementation.CopperCable, implementation.Container, implementation.GlassFiberCable, implementation.Device)
	 * @generated
	 */
	EOperation getXDuplexCopperCableRule__CheckDEC_BWD__CopperCable_Container_GlassFiberCable_Device();

	/**
	 * Returns the meta object for the '{@link ImplementationTransformator.Rules.XDuplexCopperCableRule#generateModel(org.moflon.tgg.language.modelgenerator.RuleEntryContainer, ImplementationTransformator.XDeviceToDevice) <em>Generate Model</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Generate Model</em>' operation.
	 * @see ImplementationTransformator.Rules.XDuplexCopperCableRule#generateModel(org.moflon.tgg.language.modelgenerator.RuleEntryContainer, ImplementationTransformator.XDeviceToDevice)
	 * @generated
	 */
	EOperation getXDuplexCopperCableRule__GenerateModel__RuleEntryContainer_XDeviceToDevice();

	/**
	 * Returns the meta object for the '{@link ImplementationTransformator.Rules.XDuplexCopperCableRule#generateModel_solveCsp_BWD(org.moflon.tgg.runtime.IsApplicableMatch, implementation.Container, xtextImplementation.xtextImpl.XDevice, xtextImplementation.xtextImpl.XContainer, implementation.Device, ImplementationTransformator.XDeviceToDevice, org.moflon.tgg.runtime.ModelgeneratorRuleResult) <em>Generate Model solve Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Generate Model solve Csp BWD</em>' operation.
	 * @see ImplementationTransformator.Rules.XDuplexCopperCableRule#generateModel_solveCsp_BWD(org.moflon.tgg.runtime.IsApplicableMatch, implementation.Container, xtextImplementation.xtextImpl.XDevice, xtextImplementation.xtextImpl.XContainer, implementation.Device, ImplementationTransformator.XDeviceToDevice, org.moflon.tgg.runtime.ModelgeneratorRuleResult)
	 * @generated
	 */
	EOperation getXDuplexCopperCableRule__GenerateModel_solveCsp_BWD__IsApplicableMatch_Container_XDevice_XContainer_Device_XDeviceToDevice_ModelgeneratorRuleResult();

	/**
	 * Returns the meta object for the '{@link ImplementationTransformator.Rules.XDuplexCopperCableRule#generateModel_checkCsp_BWD(org.moflon.tgg.language.csp.CSP) <em>Generate Model check Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Generate Model check Csp BWD</em>' operation.
	 * @see ImplementationTransformator.Rules.XDuplexCopperCableRule#generateModel_checkCsp_BWD(org.moflon.tgg.language.csp.CSP)
	 * @generated
	 */
	EOperation getXDuplexCopperCableRule__GenerateModel_checkCsp_BWD__CSP();

	/**
	 * Returns the meta object for class '{@link ImplementationTransformator.Rules.XSimplexCableToCableRule <em>XSimplex Cable To Cable Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>XSimplex Cable To Cable Rule</em>'.
	 * @see ImplementationTransformator.Rules.XSimplexCableToCableRule
	 * @generated
	 */
	EClass getXSimplexCableToCableRule();

	/**
	 * Returns the meta object for class '{@link ImplementationTransformator.Rules.XContainerToContainerRule <em>XContainer To Container Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>XContainer To Container Rule</em>'.
	 * @see ImplementationTransformator.Rules.XContainerToContainerRule
	 * @generated
	 */
	EClass getXContainerToContainerRule();

	/**
	 * Returns the meta object for the '{@link ImplementationTransformator.Rules.XContainerToContainerRule#isAppropriate_FWD(org.moflon.tgg.runtime.Match, xtextImplementation.xtextImpl.XContainer) <em>Is Appropriate FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD</em>' operation.
	 * @see ImplementationTransformator.Rules.XContainerToContainerRule#isAppropriate_FWD(org.moflon.tgg.runtime.Match, xtextImplementation.xtextImpl.XContainer)
	 * @generated
	 */
	EOperation getXContainerToContainerRule__IsAppropriate_FWD__Match_XContainer();

	/**
	 * Returns the meta object for the '{@link ImplementationTransformator.Rules.XContainerToContainerRule#perform_FWD(org.moflon.tgg.runtime.IsApplicableMatch) <em>Perform FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Perform FWD</em>' operation.
	 * @see ImplementationTransformator.Rules.XContainerToContainerRule#perform_FWD(org.moflon.tgg.runtime.IsApplicableMatch)
	 * @generated
	 */
	EOperation getXContainerToContainerRule__Perform_FWD__IsApplicableMatch();

	/**
	 * Returns the meta object for the '{@link ImplementationTransformator.Rules.XContainerToContainerRule#isApplicable_FWD(org.moflon.tgg.runtime.Match) <em>Is Applicable FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable FWD</em>' operation.
	 * @see ImplementationTransformator.Rules.XContainerToContainerRule#isApplicable_FWD(org.moflon.tgg.runtime.Match)
	 * @generated
	 */
	EOperation getXContainerToContainerRule__IsApplicable_FWD__Match();

	/**
	 * Returns the meta object for the '{@link ImplementationTransformator.Rules.XContainerToContainerRule#registerObjectsToMatch_FWD(org.moflon.tgg.runtime.Match, xtextImplementation.xtextImpl.XContainer) <em>Register Objects To Match FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Register Objects To Match FWD</em>' operation.
	 * @see ImplementationTransformator.Rules.XContainerToContainerRule#registerObjectsToMatch_FWD(org.moflon.tgg.runtime.Match, xtextImplementation.xtextImpl.XContainer)
	 * @generated
	 */
	EOperation getXContainerToContainerRule__RegisterObjectsToMatch_FWD__Match_XContainer();

	/**
	 * Returns the meta object for the '{@link ImplementationTransformator.Rules.XContainerToContainerRule#isAppropriate_solveCsp_FWD(org.moflon.tgg.runtime.Match, xtextImplementation.xtextImpl.XContainer) <em>Is Appropriate solve Csp FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate solve Csp FWD</em>' operation.
	 * @see ImplementationTransformator.Rules.XContainerToContainerRule#isAppropriate_solveCsp_FWD(org.moflon.tgg.runtime.Match, xtextImplementation.xtextImpl.XContainer)
	 * @generated
	 */
	EOperation getXContainerToContainerRule__IsAppropriate_solveCsp_FWD__Match_XContainer();

	/**
	 * Returns the meta object for the '{@link ImplementationTransformator.Rules.XContainerToContainerRule#isAppropriate_checkCsp_FWD(org.moflon.tgg.language.csp.CSP) <em>Is Appropriate check Csp FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate check Csp FWD</em>' operation.
	 * @see ImplementationTransformator.Rules.XContainerToContainerRule#isAppropriate_checkCsp_FWD(org.moflon.tgg.language.csp.CSP)
	 * @generated
	 */
	EOperation getXContainerToContainerRule__IsAppropriate_checkCsp_FWD__CSP();

	/**
	 * Returns the meta object for the '{@link ImplementationTransformator.Rules.XContainerToContainerRule#isApplicable_solveCsp_FWD(org.moflon.tgg.runtime.IsApplicableMatch, xtextImplementation.xtextImpl.XContainer) <em>Is Applicable solve Csp FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable solve Csp FWD</em>' operation.
	 * @see ImplementationTransformator.Rules.XContainerToContainerRule#isApplicable_solveCsp_FWD(org.moflon.tgg.runtime.IsApplicableMatch, xtextImplementation.xtextImpl.XContainer)
	 * @generated
	 */
	EOperation getXContainerToContainerRule__IsApplicable_solveCsp_FWD__IsApplicableMatch_XContainer();

	/**
	 * Returns the meta object for the '{@link ImplementationTransformator.Rules.XContainerToContainerRule#isApplicable_checkCsp_FWD(org.moflon.tgg.language.csp.CSP) <em>Is Applicable check Csp FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable check Csp FWD</em>' operation.
	 * @see ImplementationTransformator.Rules.XContainerToContainerRule#isApplicable_checkCsp_FWD(org.moflon.tgg.language.csp.CSP)
	 * @generated
	 */
	EOperation getXContainerToContainerRule__IsApplicable_checkCsp_FWD__CSP();

	/**
	 * Returns the meta object for the '{@link ImplementationTransformator.Rules.XContainerToContainerRule#registerObjects_FWD(org.moflon.tgg.runtime.PerformRuleResult, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject) <em>Register Objects FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Register Objects FWD</em>' operation.
	 * @see ImplementationTransformator.Rules.XContainerToContainerRule#registerObjects_FWD(org.moflon.tgg.runtime.PerformRuleResult, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	EOperation getXContainerToContainerRule__RegisterObjects_FWD__PerformRuleResult_EObject_EObject_EObject();

	/**
	 * Returns the meta object for the '{@link ImplementationTransformator.Rules.XContainerToContainerRule#checkTypes_FWD(org.moflon.tgg.runtime.Match) <em>Check Types FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check Types FWD</em>' operation.
	 * @see ImplementationTransformator.Rules.XContainerToContainerRule#checkTypes_FWD(org.moflon.tgg.runtime.Match)
	 * @generated
	 */
	EOperation getXContainerToContainerRule__CheckTypes_FWD__Match();

	/**
	 * Returns the meta object for the '{@link ImplementationTransformator.Rules.XContainerToContainerRule#isAppropriate_BWD(org.moflon.tgg.runtime.Match, implementation.Container) <em>Is Appropriate BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD</em>' operation.
	 * @see ImplementationTransformator.Rules.XContainerToContainerRule#isAppropriate_BWD(org.moflon.tgg.runtime.Match, implementation.Container)
	 * @generated
	 */
	EOperation getXContainerToContainerRule__IsAppropriate_BWD__Match_Container();

	/**
	 * Returns the meta object for the '{@link ImplementationTransformator.Rules.XContainerToContainerRule#perform_BWD(org.moflon.tgg.runtime.IsApplicableMatch) <em>Perform BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Perform BWD</em>' operation.
	 * @see ImplementationTransformator.Rules.XContainerToContainerRule#perform_BWD(org.moflon.tgg.runtime.IsApplicableMatch)
	 * @generated
	 */
	EOperation getXContainerToContainerRule__Perform_BWD__IsApplicableMatch();

	/**
	 * Returns the meta object for the '{@link ImplementationTransformator.Rules.XContainerToContainerRule#isApplicable_BWD(org.moflon.tgg.runtime.Match) <em>Is Applicable BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable BWD</em>' operation.
	 * @see ImplementationTransformator.Rules.XContainerToContainerRule#isApplicable_BWD(org.moflon.tgg.runtime.Match)
	 * @generated
	 */
	EOperation getXContainerToContainerRule__IsApplicable_BWD__Match();

	/**
	 * Returns the meta object for the '{@link ImplementationTransformator.Rules.XContainerToContainerRule#registerObjectsToMatch_BWD(org.moflon.tgg.runtime.Match, implementation.Container) <em>Register Objects To Match BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Register Objects To Match BWD</em>' operation.
	 * @see ImplementationTransformator.Rules.XContainerToContainerRule#registerObjectsToMatch_BWD(org.moflon.tgg.runtime.Match, implementation.Container)
	 * @generated
	 */
	EOperation getXContainerToContainerRule__RegisterObjectsToMatch_BWD__Match_Container();

	/**
	 * Returns the meta object for the '{@link ImplementationTransformator.Rules.XContainerToContainerRule#isAppropriate_solveCsp_BWD(org.moflon.tgg.runtime.Match, implementation.Container) <em>Is Appropriate solve Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate solve Csp BWD</em>' operation.
	 * @see ImplementationTransformator.Rules.XContainerToContainerRule#isAppropriate_solveCsp_BWD(org.moflon.tgg.runtime.Match, implementation.Container)
	 * @generated
	 */
	EOperation getXContainerToContainerRule__IsAppropriate_solveCsp_BWD__Match_Container();

	/**
	 * Returns the meta object for the '{@link ImplementationTransformator.Rules.XContainerToContainerRule#isAppropriate_checkCsp_BWD(org.moflon.tgg.language.csp.CSP) <em>Is Appropriate check Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate check Csp BWD</em>' operation.
	 * @see ImplementationTransformator.Rules.XContainerToContainerRule#isAppropriate_checkCsp_BWD(org.moflon.tgg.language.csp.CSP)
	 * @generated
	 */
	EOperation getXContainerToContainerRule__IsAppropriate_checkCsp_BWD__CSP();

	/**
	 * Returns the meta object for the '{@link ImplementationTransformator.Rules.XContainerToContainerRule#isApplicable_solveCsp_BWD(org.moflon.tgg.runtime.IsApplicableMatch, implementation.Container) <em>Is Applicable solve Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable solve Csp BWD</em>' operation.
	 * @see ImplementationTransformator.Rules.XContainerToContainerRule#isApplicable_solveCsp_BWD(org.moflon.tgg.runtime.IsApplicableMatch, implementation.Container)
	 * @generated
	 */
	EOperation getXContainerToContainerRule__IsApplicable_solveCsp_BWD__IsApplicableMatch_Container();

	/**
	 * Returns the meta object for the '{@link ImplementationTransformator.Rules.XContainerToContainerRule#isApplicable_checkCsp_BWD(org.moflon.tgg.language.csp.CSP) <em>Is Applicable check Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable check Csp BWD</em>' operation.
	 * @see ImplementationTransformator.Rules.XContainerToContainerRule#isApplicable_checkCsp_BWD(org.moflon.tgg.language.csp.CSP)
	 * @generated
	 */
	EOperation getXContainerToContainerRule__IsApplicable_checkCsp_BWD__CSP();

	/**
	 * Returns the meta object for the '{@link ImplementationTransformator.Rules.XContainerToContainerRule#registerObjects_BWD(org.moflon.tgg.runtime.PerformRuleResult, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject) <em>Register Objects BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Register Objects BWD</em>' operation.
	 * @see ImplementationTransformator.Rules.XContainerToContainerRule#registerObjects_BWD(org.moflon.tgg.runtime.PerformRuleResult, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	EOperation getXContainerToContainerRule__RegisterObjects_BWD__PerformRuleResult_EObject_EObject_EObject();

	/**
	 * Returns the meta object for the '{@link ImplementationTransformator.Rules.XContainerToContainerRule#checkTypes_BWD(org.moflon.tgg.runtime.Match) <em>Check Types BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check Types BWD</em>' operation.
	 * @see ImplementationTransformator.Rules.XContainerToContainerRule#checkTypes_BWD(org.moflon.tgg.runtime.Match)
	 * @generated
	 */
	EOperation getXContainerToContainerRule__CheckTypes_BWD__Match();

	/**
	 * Returns the meta object for the '{@link ImplementationTransformator.Rules.XContainerToContainerRule#isAppropriate_BWD_Container_1(implementation.Container) <em>Is Appropriate BWD Container 1</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD Container 1</em>' operation.
	 * @see ImplementationTransformator.Rules.XContainerToContainerRule#isAppropriate_BWD_Container_1(implementation.Container)
	 * @generated
	 */
	EOperation getXContainerToContainerRule__IsAppropriate_BWD_Container_1__Container();

	/**
	 * Returns the meta object for the '{@link ImplementationTransformator.Rules.XContainerToContainerRule#isAppropriate_FWD_XContainer_1(xtextImplementation.xtextImpl.XContainer) <em>Is Appropriate FWD XContainer 1</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD XContainer 1</em>' operation.
	 * @see ImplementationTransformator.Rules.XContainerToContainerRule#isAppropriate_FWD_XContainer_1(xtextImplementation.xtextImpl.XContainer)
	 * @generated
	 */
	EOperation getXContainerToContainerRule__IsAppropriate_FWD_XContainer_1__XContainer();

	/**
	 * Returns the meta object for the '{@link ImplementationTransformator.Rules.XContainerToContainerRule#checkAttributes_FWD(org.moflon.tgg.runtime.TripleMatch) <em>Check Attributes FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check Attributes FWD</em>' operation.
	 * @see ImplementationTransformator.Rules.XContainerToContainerRule#checkAttributes_FWD(org.moflon.tgg.runtime.TripleMatch)
	 * @generated
	 */
	EOperation getXContainerToContainerRule__CheckAttributes_FWD__TripleMatch();

	/**
	 * Returns the meta object for the '{@link ImplementationTransformator.Rules.XContainerToContainerRule#checkAttributes_BWD(org.moflon.tgg.runtime.TripleMatch) <em>Check Attributes BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check Attributes BWD</em>' operation.
	 * @see ImplementationTransformator.Rules.XContainerToContainerRule#checkAttributes_BWD(org.moflon.tgg.runtime.TripleMatch)
	 * @generated
	 */
	EOperation getXContainerToContainerRule__CheckAttributes_BWD__TripleMatch();

	/**
	 * Returns the meta object for the '{@link ImplementationTransformator.Rules.XContainerToContainerRule#isApplicable_CC(org.moflon.tgg.runtime.Match, org.moflon.tgg.runtime.Match) <em>Is Applicable CC</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable CC</em>' operation.
	 * @see ImplementationTransformator.Rules.XContainerToContainerRule#isApplicable_CC(org.moflon.tgg.runtime.Match, org.moflon.tgg.runtime.Match)
	 * @generated
	 */
	EOperation getXContainerToContainerRule__IsApplicable_CC__Match_Match();

	/**
	 * Returns the meta object for the '{@link ImplementationTransformator.Rules.XContainerToContainerRule#isApplicable_solveCsp_CC(xtextImplementation.xtextImpl.XContainer, implementation.Container, org.moflon.tgg.runtime.Match, org.moflon.tgg.runtime.Match) <em>Is Applicable solve Csp CC</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable solve Csp CC</em>' operation.
	 * @see ImplementationTransformator.Rules.XContainerToContainerRule#isApplicable_solveCsp_CC(xtextImplementation.xtextImpl.XContainer, implementation.Container, org.moflon.tgg.runtime.Match, org.moflon.tgg.runtime.Match)
	 * @generated
	 */
	EOperation getXContainerToContainerRule__IsApplicable_solveCsp_CC__XContainer_Container_Match_Match();

	/**
	 * Returns the meta object for the '{@link ImplementationTransformator.Rules.XContainerToContainerRule#isApplicable_checkCsp_CC(org.moflon.tgg.language.csp.CSP) <em>Is Applicable check Csp CC</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable check Csp CC</em>' operation.
	 * @see ImplementationTransformator.Rules.XContainerToContainerRule#isApplicable_checkCsp_CC(org.moflon.tgg.language.csp.CSP)
	 * @generated
	 */
	EOperation getXContainerToContainerRule__IsApplicable_checkCsp_CC__CSP();

	/**
	 * Returns the meta object for the '{@link ImplementationTransformator.Rules.XContainerToContainerRule#checkDEC_FWD(xtextImplementation.xtextImpl.XContainer) <em>Check DEC FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check DEC FWD</em>' operation.
	 * @see ImplementationTransformator.Rules.XContainerToContainerRule#checkDEC_FWD(xtextImplementation.xtextImpl.XContainer)
	 * @generated
	 */
	EOperation getXContainerToContainerRule__CheckDEC_FWD__XContainer();

	/**
	 * Returns the meta object for the '{@link ImplementationTransformator.Rules.XContainerToContainerRule#checkDEC_BWD(implementation.Container) <em>Check DEC BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check DEC BWD</em>' operation.
	 * @see ImplementationTransformator.Rules.XContainerToContainerRule#checkDEC_BWD(implementation.Container)
	 * @generated
	 */
	EOperation getXContainerToContainerRule__CheckDEC_BWD__Container();

	/**
	 * Returns the meta object for the '{@link ImplementationTransformator.Rules.XContainerToContainerRule#generateModel(org.moflon.tgg.language.modelgenerator.RuleEntryContainer) <em>Generate Model</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Generate Model</em>' operation.
	 * @see ImplementationTransformator.Rules.XContainerToContainerRule#generateModel(org.moflon.tgg.language.modelgenerator.RuleEntryContainer)
	 * @generated
	 */
	EOperation getXContainerToContainerRule__GenerateModel__RuleEntryContainer();

	/**
	 * Returns the meta object for the '{@link ImplementationTransformator.Rules.XContainerToContainerRule#generateModel_solveCsp_BWD(org.moflon.tgg.runtime.IsApplicableMatch, org.moflon.tgg.runtime.ModelgeneratorRuleResult) <em>Generate Model solve Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Generate Model solve Csp BWD</em>' operation.
	 * @see ImplementationTransformator.Rules.XContainerToContainerRule#generateModel_solveCsp_BWD(org.moflon.tgg.runtime.IsApplicableMatch, org.moflon.tgg.runtime.ModelgeneratorRuleResult)
	 * @generated
	 */
	EOperation getXContainerToContainerRule__GenerateModel_solveCsp_BWD__IsApplicableMatch_ModelgeneratorRuleResult();

	/**
	 * Returns the meta object for the '{@link ImplementationTransformator.Rules.XContainerToContainerRule#generateModel_checkCsp_BWD(org.moflon.tgg.language.csp.CSP) <em>Generate Model check Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Generate Model check Csp BWD</em>' operation.
	 * @see ImplementationTransformator.Rules.XContainerToContainerRule#generateModel_checkCsp_BWD(org.moflon.tgg.language.csp.CSP)
	 * @generated
	 */
	EOperation getXContainerToContainerRule__GenerateModel_checkCsp_BWD__CSP();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	RulesFactory getRulesFactory();

} //RulesPackage
