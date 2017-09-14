/**
 */
package ReqToImpTransformator.impl;

import ReqToImpTransformator.*;

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
public class ReqToImpTransformatorFactoryImpl extends EFactoryImpl implements ReqToImpTransformatorFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ReqToImpTransformatorFactory init() {
		try {
			ReqToImpTransformatorFactory theReqToImpTransformatorFactory = (ReqToImpTransformatorFactory) EPackage.Registry.INSTANCE
					.getEFactory(ReqToImpTransformatorPackage.eNS_URI);
			if (theReqToImpTransformatorFactory != null) {
				return theReqToImpTransformatorFactory;
			}
		} catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new ReqToImpTransformatorFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReqToImpTransformatorFactoryImpl() {
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
		case ReqToImpTransformatorPackage.REQ_CONTAINER_TO_IMPL_CONTAINER:
			return createReqContainerToImplContainer();
		case ReqToImpTransformatorPackage.VIRTUAL_NODE_TO_ROUTER:
			return createVirtualNodeToRouter();
		case ReqToImpTransformatorPackage.REQ_AGENT_TO_IMPL_DEVICE:
			return createReqAgentToImplDevice();
		case ReqToImpTransformatorPackage.VIRTUAL_NODE_TO_COMPUTER:
			return createVirtualNodeToComputer();
		case ReqToImpTransformatorPackage.VIRTUAL_NODE_TO_SERVER:
			return createVirtualNodeToServer();
		default:
			throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReqContainerToImplContainer createReqContainerToImplContainer() {
		ReqContainerToImplContainerImpl reqContainerToImplContainer = new ReqContainerToImplContainerImpl();
		return reqContainerToImplContainer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VirtualNodeToRouter createVirtualNodeToRouter() {
		VirtualNodeToRouterImpl virtualNodeToRouter = new VirtualNodeToRouterImpl();
		return virtualNodeToRouter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReqAgentToImplDevice createReqAgentToImplDevice() {
		ReqAgentToImplDeviceImpl reqAgentToImplDevice = new ReqAgentToImplDeviceImpl();
		return reqAgentToImplDevice;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VirtualNodeToComputer createVirtualNodeToComputer() {
		VirtualNodeToComputerImpl virtualNodeToComputer = new VirtualNodeToComputerImpl();
		return virtualNodeToComputer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VirtualNodeToServer createVirtualNodeToServer() {
		VirtualNodeToServerImpl virtualNodeToServer = new VirtualNodeToServerImpl();
		return virtualNodeToServer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReqToImpTransformatorPackage getReqToImpTransformatorPackage() {
		return (ReqToImpTransformatorPackage) getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static ReqToImpTransformatorPackage getPackage() {
		return ReqToImpTransformatorPackage.eINSTANCE;
	}

} //ReqToImpTransformatorFactoryImpl
