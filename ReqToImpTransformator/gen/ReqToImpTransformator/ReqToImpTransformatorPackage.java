/**
 */
package ReqToImpTransformator;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

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
 * @see ReqToImpTransformator.ReqToImpTransformatorFactory
 * @model kind="package"
 * @generated
 */
public interface ReqToImpTransformatorPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "ReqToImpTransformator";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "platform:/plugin/ReqToImpTransformator/model/ReqToImpTransformator.ecore";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "ReqToImpTransformator";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ReqToImpTransformatorPackage eINSTANCE = ReqToImpTransformator.impl.ReqToImpTransformatorPackageImpl.init();

	/**
	 * The meta object id for the '{@link ReqToImpTransformator.impl.VirtualNodeToRouterImpl <em>Virtual Node To Router</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ReqToImpTransformator.impl.VirtualNodeToRouterImpl
	 * @see ReqToImpTransformator.impl.ReqToImpTransformatorPackageImpl#getVirtualNodeToRouter()
	 * @generated
	 */
	int VIRTUAL_NODE_TO_ROUTER = 0;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUAL_NODE_TO_ROUTER__SOURCE = RuntimePackage.ABSTRACT_CORRESPONDENCE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUAL_NODE_TO_ROUTER__TARGET = RuntimePackage.ABSTRACT_CORRESPONDENCE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Virtual Node To Router</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUAL_NODE_TO_ROUTER_FEATURE_COUNT = RuntimePackage.ABSTRACT_CORRESPONDENCE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Virtual Node To Router</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUAL_NODE_TO_ROUTER_OPERATION_COUNT = RuntimePackage.ABSTRACT_CORRESPONDENCE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ReqToImpTransformator.impl.ReqAgentToImplDeviceImpl <em>Req Agent To Impl Device</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ReqToImpTransformator.impl.ReqAgentToImplDeviceImpl
	 * @see ReqToImpTransformator.impl.ReqToImpTransformatorPackageImpl#getReqAgentToImplDevice()
	 * @generated
	 */
	int REQ_AGENT_TO_IMPL_DEVICE = 1;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQ_AGENT_TO_IMPL_DEVICE__SOURCE = RuntimePackage.ABSTRACT_CORRESPONDENCE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQ_AGENT_TO_IMPL_DEVICE__TARGET = RuntimePackage.ABSTRACT_CORRESPONDENCE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Req Agent To Impl Device</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQ_AGENT_TO_IMPL_DEVICE_FEATURE_COUNT = RuntimePackage.ABSTRACT_CORRESPONDENCE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Req Agent To Impl Device</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQ_AGENT_TO_IMPL_DEVICE_OPERATION_COUNT = RuntimePackage.ABSTRACT_CORRESPONDENCE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ReqToImpTransformator.impl.VirtualNodeToComputerImpl <em>Virtual Node To Computer</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ReqToImpTransformator.impl.VirtualNodeToComputerImpl
	 * @see ReqToImpTransformator.impl.ReqToImpTransformatorPackageImpl#getVirtualNodeToComputer()
	 * @generated
	 */
	int VIRTUAL_NODE_TO_COMPUTER = 2;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUAL_NODE_TO_COMPUTER__SOURCE = RuntimePackage.ABSTRACT_CORRESPONDENCE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUAL_NODE_TO_COMPUTER__TARGET = RuntimePackage.ABSTRACT_CORRESPONDENCE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Virtual Node To Computer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUAL_NODE_TO_COMPUTER_FEATURE_COUNT = RuntimePackage.ABSTRACT_CORRESPONDENCE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Virtual Node To Computer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUAL_NODE_TO_COMPUTER_OPERATION_COUNT = RuntimePackage.ABSTRACT_CORRESPONDENCE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ReqToImpTransformator.impl.ReqContainerToImplContainerImpl <em>Req Container To Impl Container</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ReqToImpTransformator.impl.ReqContainerToImplContainerImpl
	 * @see ReqToImpTransformator.impl.ReqToImpTransformatorPackageImpl#getReqContainerToImplContainer()
	 * @generated
	 */
	int REQ_CONTAINER_TO_IMPL_CONTAINER = 3;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQ_CONTAINER_TO_IMPL_CONTAINER__SOURCE = RuntimePackage.ABSTRACT_CORRESPONDENCE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQ_CONTAINER_TO_IMPL_CONTAINER__TARGET = RuntimePackage.ABSTRACT_CORRESPONDENCE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Req Container To Impl Container</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQ_CONTAINER_TO_IMPL_CONTAINER_FEATURE_COUNT = RuntimePackage.ABSTRACT_CORRESPONDENCE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Req Container To Impl Container</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQ_CONTAINER_TO_IMPL_CONTAINER_OPERATION_COUNT = RuntimePackage.ABSTRACT_CORRESPONDENCE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ReqToImpTransformator.impl.VirtualNodeToServerImpl <em>Virtual Node To Server</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ReqToImpTransformator.impl.VirtualNodeToServerImpl
	 * @see ReqToImpTransformator.impl.ReqToImpTransformatorPackageImpl#getVirtualNodeToServer()
	 * @generated
	 */
	int VIRTUAL_NODE_TO_SERVER = 4;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUAL_NODE_TO_SERVER__SOURCE = RuntimePackage.ABSTRACT_CORRESPONDENCE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUAL_NODE_TO_SERVER__TARGET = RuntimePackage.ABSTRACT_CORRESPONDENCE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Virtual Node To Server</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUAL_NODE_TO_SERVER_FEATURE_COUNT = RuntimePackage.ABSTRACT_CORRESPONDENCE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Virtual Node To Server</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUAL_NODE_TO_SERVER_OPERATION_COUNT = RuntimePackage.ABSTRACT_CORRESPONDENCE_OPERATION_COUNT + 0;

	/**
	 * Returns the meta object for class '{@link ReqToImpTransformator.VirtualNodeToRouter <em>Virtual Node To Router</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Virtual Node To Router</em>'.
	 * @see ReqToImpTransformator.VirtualNodeToRouter
	 * @generated
	 */
	EClass getVirtualNodeToRouter();

	/**
	 * Returns the meta object for the reference '{@link ReqToImpTransformator.VirtualNodeToRouter#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source</em>'.
	 * @see ReqToImpTransformator.VirtualNodeToRouter#getSource()
	 * @see #getVirtualNodeToRouter()
	 * @generated
	 */
	EReference getVirtualNodeToRouter_Source();

	/**
	 * Returns the meta object for the reference '{@link ReqToImpTransformator.VirtualNodeToRouter#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see ReqToImpTransformator.VirtualNodeToRouter#getTarget()
	 * @see #getVirtualNodeToRouter()
	 * @generated
	 */
	EReference getVirtualNodeToRouter_Target();

	/**
	 * Returns the meta object for class '{@link ReqToImpTransformator.ReqAgentToImplDevice <em>Req Agent To Impl Device</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Req Agent To Impl Device</em>'.
	 * @see ReqToImpTransformator.ReqAgentToImplDevice
	 * @generated
	 */
	EClass getReqAgentToImplDevice();

	/**
	 * Returns the meta object for the reference '{@link ReqToImpTransformator.ReqAgentToImplDevice#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source</em>'.
	 * @see ReqToImpTransformator.ReqAgentToImplDevice#getSource()
	 * @see #getReqAgentToImplDevice()
	 * @generated
	 */
	EReference getReqAgentToImplDevice_Source();

	/**
	 * Returns the meta object for the reference '{@link ReqToImpTransformator.ReqAgentToImplDevice#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see ReqToImpTransformator.ReqAgentToImplDevice#getTarget()
	 * @see #getReqAgentToImplDevice()
	 * @generated
	 */
	EReference getReqAgentToImplDevice_Target();

	/**
	 * Returns the meta object for class '{@link ReqToImpTransformator.VirtualNodeToComputer <em>Virtual Node To Computer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Virtual Node To Computer</em>'.
	 * @see ReqToImpTransformator.VirtualNodeToComputer
	 * @generated
	 */
	EClass getVirtualNodeToComputer();

	/**
	 * Returns the meta object for the reference '{@link ReqToImpTransformator.VirtualNodeToComputer#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source</em>'.
	 * @see ReqToImpTransformator.VirtualNodeToComputer#getSource()
	 * @see #getVirtualNodeToComputer()
	 * @generated
	 */
	EReference getVirtualNodeToComputer_Source();

	/**
	 * Returns the meta object for the reference '{@link ReqToImpTransformator.VirtualNodeToComputer#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see ReqToImpTransformator.VirtualNodeToComputer#getTarget()
	 * @see #getVirtualNodeToComputer()
	 * @generated
	 */
	EReference getVirtualNodeToComputer_Target();

	/**
	 * Returns the meta object for class '{@link ReqToImpTransformator.ReqContainerToImplContainer <em>Req Container To Impl Container</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Req Container To Impl Container</em>'.
	 * @see ReqToImpTransformator.ReqContainerToImplContainer
	 * @generated
	 */
	EClass getReqContainerToImplContainer();

	/**
	 * Returns the meta object for the reference '{@link ReqToImpTransformator.ReqContainerToImplContainer#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source</em>'.
	 * @see ReqToImpTransformator.ReqContainerToImplContainer#getSource()
	 * @see #getReqContainerToImplContainer()
	 * @generated
	 */
	EReference getReqContainerToImplContainer_Source();

	/**
	 * Returns the meta object for the reference '{@link ReqToImpTransformator.ReqContainerToImplContainer#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see ReqToImpTransformator.ReqContainerToImplContainer#getTarget()
	 * @see #getReqContainerToImplContainer()
	 * @generated
	 */
	EReference getReqContainerToImplContainer_Target();

	/**
	 * Returns the meta object for class '{@link ReqToImpTransformator.VirtualNodeToServer <em>Virtual Node To Server</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Virtual Node To Server</em>'.
	 * @see ReqToImpTransformator.VirtualNodeToServer
	 * @generated
	 */
	EClass getVirtualNodeToServer();

	/**
	 * Returns the meta object for the reference '{@link ReqToImpTransformator.VirtualNodeToServer#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source</em>'.
	 * @see ReqToImpTransformator.VirtualNodeToServer#getSource()
	 * @see #getVirtualNodeToServer()
	 * @generated
	 */
	EReference getVirtualNodeToServer_Source();

	/**
	 * Returns the meta object for the reference '{@link ReqToImpTransformator.VirtualNodeToServer#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see ReqToImpTransformator.VirtualNodeToServer#getTarget()
	 * @see #getVirtualNodeToServer()
	 * @generated
	 */
	EReference getVirtualNodeToServer_Target();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ReqToImpTransformatorFactory getReqToImpTransformatorFactory();

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
		 * The meta object literal for the '{@link ReqToImpTransformator.impl.VirtualNodeToRouterImpl <em>Virtual Node To Router</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ReqToImpTransformator.impl.VirtualNodeToRouterImpl
		 * @see ReqToImpTransformator.impl.ReqToImpTransformatorPackageImpl#getVirtualNodeToRouter()
		 * @generated
		 */
		EClass VIRTUAL_NODE_TO_ROUTER = eINSTANCE.getVirtualNodeToRouter();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VIRTUAL_NODE_TO_ROUTER__SOURCE = eINSTANCE.getVirtualNodeToRouter_Source();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VIRTUAL_NODE_TO_ROUTER__TARGET = eINSTANCE.getVirtualNodeToRouter_Target();

		/**
		 * The meta object literal for the '{@link ReqToImpTransformator.impl.ReqAgentToImplDeviceImpl <em>Req Agent To Impl Device</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ReqToImpTransformator.impl.ReqAgentToImplDeviceImpl
		 * @see ReqToImpTransformator.impl.ReqToImpTransformatorPackageImpl#getReqAgentToImplDevice()
		 * @generated
		 */
		EClass REQ_AGENT_TO_IMPL_DEVICE = eINSTANCE.getReqAgentToImplDevice();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REQ_AGENT_TO_IMPL_DEVICE__SOURCE = eINSTANCE.getReqAgentToImplDevice_Source();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REQ_AGENT_TO_IMPL_DEVICE__TARGET = eINSTANCE.getReqAgentToImplDevice_Target();

		/**
		 * The meta object literal for the '{@link ReqToImpTransformator.impl.VirtualNodeToComputerImpl <em>Virtual Node To Computer</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ReqToImpTransformator.impl.VirtualNodeToComputerImpl
		 * @see ReqToImpTransformator.impl.ReqToImpTransformatorPackageImpl#getVirtualNodeToComputer()
		 * @generated
		 */
		EClass VIRTUAL_NODE_TO_COMPUTER = eINSTANCE.getVirtualNodeToComputer();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VIRTUAL_NODE_TO_COMPUTER__SOURCE = eINSTANCE.getVirtualNodeToComputer_Source();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VIRTUAL_NODE_TO_COMPUTER__TARGET = eINSTANCE.getVirtualNodeToComputer_Target();

		/**
		 * The meta object literal for the '{@link ReqToImpTransformator.impl.ReqContainerToImplContainerImpl <em>Req Container To Impl Container</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ReqToImpTransformator.impl.ReqContainerToImplContainerImpl
		 * @see ReqToImpTransformator.impl.ReqToImpTransformatorPackageImpl#getReqContainerToImplContainer()
		 * @generated
		 */
		EClass REQ_CONTAINER_TO_IMPL_CONTAINER = eINSTANCE.getReqContainerToImplContainer();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REQ_CONTAINER_TO_IMPL_CONTAINER__SOURCE = eINSTANCE.getReqContainerToImplContainer_Source();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REQ_CONTAINER_TO_IMPL_CONTAINER__TARGET = eINSTANCE.getReqContainerToImplContainer_Target();

		/**
		 * The meta object literal for the '{@link ReqToImpTransformator.impl.VirtualNodeToServerImpl <em>Virtual Node To Server</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ReqToImpTransformator.impl.VirtualNodeToServerImpl
		 * @see ReqToImpTransformator.impl.ReqToImpTransformatorPackageImpl#getVirtualNodeToServer()
		 * @generated
		 */
		EClass VIRTUAL_NODE_TO_SERVER = eINSTANCE.getVirtualNodeToServer();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VIRTUAL_NODE_TO_SERVER__SOURCE = eINSTANCE.getVirtualNodeToServer_Source();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VIRTUAL_NODE_TO_SERVER__TARGET = eINSTANCE.getVirtualNodeToServer_Target();

	}

} //ReqToImpTransformatorPackage
