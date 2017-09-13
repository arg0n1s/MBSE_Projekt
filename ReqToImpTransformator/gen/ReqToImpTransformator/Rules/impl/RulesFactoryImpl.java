/**
 */
package ReqToImpTransformator.Rules.impl;

import ReqToImpTransformator.Rules.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class RulesFactoryImpl extends EFactoryImpl implements RulesFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static RulesFactory init() {
		try {
			RulesFactory theRulesFactory = (RulesFactory) EPackage.Registry.INSTANCE.getEFactory(RulesPackage.eNS_URI);
			if (theRulesFactory != null) {
				return theRulesFactory;
			}
		} catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new RulesFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RulesFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
		case RulesPackage.VIRTUAL_NODE_TO_ROUTER_RULE1:
			return createVirtualNodeToRouterRule1();
		case RulesPackage.IMPL_INCOMING_CONNECTION_IGNORE_RULE:
			return createImplIncomingConnectionIgnoreRule();
		case RulesPackage.VIRTUAL_NODE_TO_COMPUTER_RULE:
			return createVirtualNodeToComputerRule();
		case RulesPackage.VIRTUAL_NODE_TO_SERVER_RULE:
			return createVirtualNodeToServerRule();
		case RulesPackage.REQ_CONSUMER_TO_COMPUTER_RULE:
			return createReqConsumerToComputerRule();
		case RulesPackage.IMPL_OUTGOING_CONNECTION_IGNORE_RULE:
			return createImplOutgoingConnectionIgnoreRule();
		case RulesPackage.REQ_PROVIDER_TO_SERVER_RULE:
			return createReqProviderToServerRule();
		case RulesPackage.IMPL_COPPER_IGNORE_RULE:
			return createImplCopperIgnoreRule();
		case RulesPackage.REQ_CONTAINER_TO_IMPL_CONTAINER_RULE:
			return createReqContainerToImplContainerRule();
		case RulesPackage.REQ_AGENT_TO_DEVICE_RULE:
			return createReqAgentToDeviceRule();
		case RulesPackage.VIRTUAL_NODE_TO_ROUTER_RULE2:
			return createVirtualNodeToRouterRule2();
		case RulesPackage.IMPL_CABLE_IGNORE_RULE:
			return createImplCableIgnoreRule();
		case RulesPackage.IMPL_GLASS_IGNORE_RULE:
			return createImplGlassIgnoreRule();
		default:
			throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VirtualNodeToRouterRule1 createVirtualNodeToRouterRule1() {
		VirtualNodeToRouterRule1Impl virtualNodeToRouterRule1 = new VirtualNodeToRouterRule1Impl();
		return virtualNodeToRouterRule1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ImplIncomingConnectionIgnoreRule createImplIncomingConnectionIgnoreRule() {
		ImplIncomingConnectionIgnoreRuleImpl implIncomingConnectionIgnoreRule = new ImplIncomingConnectionIgnoreRuleImpl();
		return implIncomingConnectionIgnoreRule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VirtualNodeToComputerRule createVirtualNodeToComputerRule() {
		VirtualNodeToComputerRuleImpl virtualNodeToComputerRule = new VirtualNodeToComputerRuleImpl();
		return virtualNodeToComputerRule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VirtualNodeToServerRule createVirtualNodeToServerRule() {
		VirtualNodeToServerRuleImpl virtualNodeToServerRule = new VirtualNodeToServerRuleImpl();
		return virtualNodeToServerRule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReqConsumerToComputerRule createReqConsumerToComputerRule() {
		ReqConsumerToComputerRuleImpl reqConsumerToComputerRule = new ReqConsumerToComputerRuleImpl();
		return reqConsumerToComputerRule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ImplOutgoingConnectionIgnoreRule createImplOutgoingConnectionIgnoreRule() {
		ImplOutgoingConnectionIgnoreRuleImpl implOutgoingConnectionIgnoreRule = new ImplOutgoingConnectionIgnoreRuleImpl();
		return implOutgoingConnectionIgnoreRule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReqProviderToServerRule createReqProviderToServerRule() {
		ReqProviderToServerRuleImpl reqProviderToServerRule = new ReqProviderToServerRuleImpl();
		return reqProviderToServerRule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ImplCopperIgnoreRule createImplCopperIgnoreRule() {
		ImplCopperIgnoreRuleImpl implCopperIgnoreRule = new ImplCopperIgnoreRuleImpl();
		return implCopperIgnoreRule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReqContainerToImplContainerRule createReqContainerToImplContainerRule() {
		ReqContainerToImplContainerRuleImpl reqContainerToImplContainerRule = new ReqContainerToImplContainerRuleImpl();
		return reqContainerToImplContainerRule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReqAgentToDeviceRule createReqAgentToDeviceRule() {
		ReqAgentToDeviceRuleImpl reqAgentToDeviceRule = new ReqAgentToDeviceRuleImpl();
		return reqAgentToDeviceRule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VirtualNodeToRouterRule2 createVirtualNodeToRouterRule2() {
		VirtualNodeToRouterRule2Impl virtualNodeToRouterRule2 = new VirtualNodeToRouterRule2Impl();
		return virtualNodeToRouterRule2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ImplCableIgnoreRule createImplCableIgnoreRule() {
		ImplCableIgnoreRuleImpl implCableIgnoreRule = new ImplCableIgnoreRuleImpl();
		return implCableIgnoreRule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ImplGlassIgnoreRule createImplGlassIgnoreRule() {
		ImplGlassIgnoreRuleImpl implGlassIgnoreRule = new ImplGlassIgnoreRuleImpl();
		return implGlassIgnoreRule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RulesPackage getRulesPackage() {
		return (RulesPackage) getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static RulesPackage getPackage() {
		return RulesPackage.eINSTANCE;
	}

} //RulesFactoryImpl
