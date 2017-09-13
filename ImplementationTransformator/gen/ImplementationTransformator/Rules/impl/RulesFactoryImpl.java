/**
 */
package ImplementationTransformator.Rules.impl;

import ImplementationTransformator.Rules.*;

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
		case RulesPackage.XCONTAINER_TO_CONTAINER_RULE:
			return createXContainerToContainerRule();
		case RulesPackage.XDUPLEX_GLASS_FIBER_CABLE_RULE:
			return createXDuplexGlassFiberCableRule();
		case RulesPackage.XCOMPUTER_TO_COMPUTER:
			return createXComputerToComputer();
		case RulesPackage.XSIMPLEX_GLASS_FIBER_CABLE_RULE:
			return createXSimplexGlassFiberCableRule();
		case RulesPackage.XSIMPLEX_CONNECTION_TO_CONNECTION_RULE:
			return createXSimplexConnectionToConnectionRule();
		case RulesPackage.XSIMPLEX_COPPER_CABLE_RULE:
			return createXSimplexCopperCableRule();
		case RulesPackage.XDUPLEX_COPPER_CABLE_RULE:
			return createXDuplexCopperCableRule();
		case RulesPackage.XSERVER_TO_SERVER:
			return createXServerToServer();
		case RulesPackage.XDUPLEX_CONNECTION_TO_CONNECTION_RULE:
			return createXDuplexConnectionToConnectionRule();
		case RulesPackage.XROUTER_TO_ROUTER_RULE:
			return createXRouterToRouterRule();
		case RulesPackage.XDUPLEX_CABLE_TO_CABLES_RULE:
			return createXDuplexCableToCablesRule();
		case RulesPackage.XSIMPLEX_CABLE_TO_CABLE_RULE:
			return createXSimplexCableToCableRule();
		case RulesPackage.XDEVICE_TO_DEVICE_RULE:
			return createXDeviceToDeviceRule();
		default:
			throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XContainerToContainerRule createXContainerToContainerRule() {
		XContainerToContainerRuleImpl xContainerToContainerRule = new XContainerToContainerRuleImpl();
		return xContainerToContainerRule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XDuplexGlassFiberCableRule createXDuplexGlassFiberCableRule() {
		XDuplexGlassFiberCableRuleImpl xDuplexGlassFiberCableRule = new XDuplexGlassFiberCableRuleImpl();
		return xDuplexGlassFiberCableRule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XComputerToComputer createXComputerToComputer() {
		XComputerToComputerImpl xComputerToComputer = new XComputerToComputerImpl();
		return xComputerToComputer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XSimplexGlassFiberCableRule createXSimplexGlassFiberCableRule() {
		XSimplexGlassFiberCableRuleImpl xSimplexGlassFiberCableRule = new XSimplexGlassFiberCableRuleImpl();
		return xSimplexGlassFiberCableRule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XSimplexConnectionToConnectionRule createXSimplexConnectionToConnectionRule() {
		XSimplexConnectionToConnectionRuleImpl xSimplexConnectionToConnectionRule = new XSimplexConnectionToConnectionRuleImpl();
		return xSimplexConnectionToConnectionRule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XSimplexCopperCableRule createXSimplexCopperCableRule() {
		XSimplexCopperCableRuleImpl xSimplexCopperCableRule = new XSimplexCopperCableRuleImpl();
		return xSimplexCopperCableRule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XDuplexCopperCableRule createXDuplexCopperCableRule() {
		XDuplexCopperCableRuleImpl xDuplexCopperCableRule = new XDuplexCopperCableRuleImpl();
		return xDuplexCopperCableRule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XServerToServer createXServerToServer() {
		XServerToServerImpl xServerToServer = new XServerToServerImpl();
		return xServerToServer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XDuplexConnectionToConnectionRule createXDuplexConnectionToConnectionRule() {
		XDuplexConnectionToConnectionRuleImpl xDuplexConnectionToConnectionRule = new XDuplexConnectionToConnectionRuleImpl();
		return xDuplexConnectionToConnectionRule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XRouterToRouterRule createXRouterToRouterRule() {
		XRouterToRouterRuleImpl xRouterToRouterRule = new XRouterToRouterRuleImpl();
		return xRouterToRouterRule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XDuplexCableToCablesRule createXDuplexCableToCablesRule() {
		XDuplexCableToCablesRuleImpl xDuplexCableToCablesRule = new XDuplexCableToCablesRuleImpl();
		return xDuplexCableToCablesRule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XSimplexCableToCableRule createXSimplexCableToCableRule() {
		XSimplexCableToCableRuleImpl xSimplexCableToCableRule = new XSimplexCableToCableRuleImpl();
		return xSimplexCableToCableRule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XDeviceToDeviceRule createXDeviceToDeviceRule() {
		XDeviceToDeviceRuleImpl xDeviceToDeviceRule = new XDeviceToDeviceRuleImpl();
		return xDeviceToDeviceRule;
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
