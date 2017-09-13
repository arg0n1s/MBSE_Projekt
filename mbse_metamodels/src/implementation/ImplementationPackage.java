/**
 */
package implementation;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

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
 * @see implementation.ImplementationFactory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/OCL/Import req='requirements.ecore#/'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore invocationDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot' settingDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot' validationDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot'"
 * @generated
 */
public interface ImplementationPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "implementation";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "platform:/plugin/mbse_metamodels/model/implementation.ecore";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "impl";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ImplementationPackage eINSTANCE = implementation.impl.ImplementationPackageImpl.init();

	/**
	 * The meta object id for the '{@link implementation.impl.DeviceImpl <em>Device</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see implementation.impl.DeviceImpl
	 * @see implementation.impl.ImplementationPackageImpl#getDevice()
	 * @generated
	 */
	int DEVICE = 0;

	/**
	 * The feature id for the '<em><b>Outgoing</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE__OUTGOING = 0;

	/**
	 * The feature id for the '<em><b>Incoming</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE__INCOMING = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE__NAME = 2;

	/**
	 * The number of structural features of the '<em>Device</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Device</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link implementation.impl.CableImpl <em>Cable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see implementation.impl.CableImpl
	 * @see implementation.impl.ImplementationPackageImpl#getCable()
	 * @generated
	 */
	int CABLE = 1;

	/**
	 * The feature id for the '<em><b>Speed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CABLE__SPEED = 0;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CABLE__SOURCE = 1;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CABLE__TARGET = 2;

	/**
	 * The number of structural features of the '<em>Cable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CABLE_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Cable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CABLE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link implementation.impl.ServerImpl <em>Server</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see implementation.impl.ServerImpl
	 * @see implementation.impl.ImplementationPackageImpl#getServer()
	 * @generated
	 */
	int SERVER = 2;

	/**
	 * The feature id for the '<em><b>Outgoing</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVER__OUTGOING = DEVICE__OUTGOING;

	/**
	 * The feature id for the '<em><b>Incoming</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVER__INCOMING = DEVICE__INCOMING;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVER__NAME = DEVICE__NAME;

	/**
	 * The feature id for the '<em><b>Provider</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVER__PROVIDER = DEVICE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Max Slots</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVER__MAX_SLOTS = DEVICE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>MTBF</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVER__MTBF = DEVICE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Server</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVER_FEATURE_COUNT = DEVICE_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Server</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVER_OPERATION_COUNT = DEVICE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link implementation.impl.ComputerImpl <em>Computer</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see implementation.impl.ComputerImpl
	 * @see implementation.impl.ImplementationPackageImpl#getComputer()
	 * @generated
	 */
	int COMPUTER = 3;

	/**
	 * The feature id for the '<em><b>Outgoing</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPUTER__OUTGOING = DEVICE__OUTGOING;

	/**
	 * The feature id for the '<em><b>Incoming</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPUTER__INCOMING = DEVICE__INCOMING;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPUTER__NAME = DEVICE__NAME;

	/**
	 * The feature id for the '<em><b>Consumer</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPUTER__CONSUMER = DEVICE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Computer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPUTER_FEATURE_COUNT = DEVICE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Computer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPUTER_OPERATION_COUNT = DEVICE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link implementation.impl.RouterImpl <em>Router</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see implementation.impl.RouterImpl
	 * @see implementation.impl.ImplementationPackageImpl#getRouter()
	 * @generated
	 */
	int ROUTER = 4;

	/**
	 * The feature id for the '<em><b>Outgoing</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROUTER__OUTGOING = DEVICE__OUTGOING;

	/**
	 * The feature id for the '<em><b>Incoming</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROUTER__INCOMING = DEVICE__INCOMING;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROUTER__NAME = DEVICE__NAME;

	/**
	 * The feature id for the '<em><b>Max Speed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROUTER__MAX_SPEED = DEVICE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Router</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROUTER_FEATURE_COUNT = DEVICE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Router</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROUTER_OPERATION_COUNT = DEVICE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link implementation.impl.CopperCableImpl <em>Copper Cable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see implementation.impl.CopperCableImpl
	 * @see implementation.impl.ImplementationPackageImpl#getCopperCable()
	 * @generated
	 */
	int COPPER_CABLE = 5;

	/**
	 * The feature id for the '<em><b>Speed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COPPER_CABLE__SPEED = CABLE__SPEED;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COPPER_CABLE__SOURCE = CABLE__SOURCE;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COPPER_CABLE__TARGET = CABLE__TARGET;

	/**
	 * The number of structural features of the '<em>Copper Cable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COPPER_CABLE_FEATURE_COUNT = CABLE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Copper Cable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COPPER_CABLE_OPERATION_COUNT = CABLE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link implementation.impl.GlassFiberCableImpl <em>Glass Fiber Cable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see implementation.impl.GlassFiberCableImpl
	 * @see implementation.impl.ImplementationPackageImpl#getGlassFiberCable()
	 * @generated
	 */
	int GLASS_FIBER_CABLE = 6;

	/**
	 * The feature id for the '<em><b>Speed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLASS_FIBER_CABLE__SPEED = CABLE__SPEED;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLASS_FIBER_CABLE__SOURCE = CABLE__SOURCE;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLASS_FIBER_CABLE__TARGET = CABLE__TARGET;

	/**
	 * The number of structural features of the '<em>Glass Fiber Cable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLASS_FIBER_CABLE_FEATURE_COUNT = CABLE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Glass Fiber Cable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLASS_FIBER_CABLE_OPERATION_COUNT = CABLE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link implementation.impl.ContainerImpl <em>Container</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see implementation.impl.ContainerImpl
	 * @see implementation.impl.ImplementationPackageImpl#getContainer()
	 * @generated
	 */
	int CONTAINER = 7;

	/**
	 * The feature id for the '<em><b>Devices</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER__DEVICES = 0;

	/**
	 * The feature id for the '<em><b>Cables</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER__CABLES = 1;

	/**
	 * The number of structural features of the '<em>Container</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Container</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER_OPERATION_COUNT = 0;


	/**
	 * Returns the meta object for class '{@link implementation.Device <em>Device</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Device</em>'.
	 * @see implementation.Device
	 * @generated
	 */
	EClass getDevice();

	/**
	 * Returns the meta object for the reference list '{@link implementation.Device#getOutgoing <em>Outgoing</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Outgoing</em>'.
	 * @see implementation.Device#getOutgoing()
	 * @see #getDevice()
	 * @generated
	 */
	EReference getDevice_Outgoing();

	/**
	 * Returns the meta object for the reference list '{@link implementation.Device#getIncoming <em>Incoming</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Incoming</em>'.
	 * @see implementation.Device#getIncoming()
	 * @see #getDevice()
	 * @generated
	 */
	EReference getDevice_Incoming();

	/**
	 * Returns the meta object for the attribute '{@link implementation.Device#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see implementation.Device#getName()
	 * @see #getDevice()
	 * @generated
	 */
	EAttribute getDevice_Name();

	/**
	 * Returns the meta object for class '{@link implementation.Cable <em>Cable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Cable</em>'.
	 * @see implementation.Cable
	 * @generated
	 */
	EClass getCable();

	/**
	 * Returns the meta object for the attribute '{@link implementation.Cable#getSpeed <em>Speed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Speed</em>'.
	 * @see implementation.Cable#getSpeed()
	 * @see #getCable()
	 * @generated
	 */
	EAttribute getCable_Speed();

	/**
	 * Returns the meta object for the reference '{@link implementation.Cable#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source</em>'.
	 * @see implementation.Cable#getSource()
	 * @see #getCable()
	 * @generated
	 */
	EReference getCable_Source();

	/**
	 * Returns the meta object for the reference '{@link implementation.Cable#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see implementation.Cable#getTarget()
	 * @see #getCable()
	 * @generated
	 */
	EReference getCable_Target();

	/**
	 * Returns the meta object for class '{@link implementation.Server <em>Server</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Server</em>'.
	 * @see implementation.Server
	 * @generated
	 */
	EClass getServer();

	/**
	 * Returns the meta object for the reference '{@link implementation.Server#getProvider <em>Provider</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Provider</em>'.
	 * @see implementation.Server#getProvider()
	 * @see #getServer()
	 * @generated
	 */
	EReference getServer_Provider();

	/**
	 * Returns the meta object for the attribute '{@link implementation.Server#getMaxSlots <em>Max Slots</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Max Slots</em>'.
	 * @see implementation.Server#getMaxSlots()
	 * @see #getServer()
	 * @generated
	 */
	EAttribute getServer_MaxSlots();

	/**
	 * Returns the meta object for the attribute '{@link implementation.Server#getMTBF <em>MTBF</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>MTBF</em>'.
	 * @see implementation.Server#getMTBF()
	 * @see #getServer()
	 * @generated
	 */
	EAttribute getServer_MTBF();

	/**
	 * Returns the meta object for class '{@link implementation.Computer <em>Computer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Computer</em>'.
	 * @see implementation.Computer
	 * @generated
	 */
	EClass getComputer();

	/**
	 * Returns the meta object for the reference '{@link implementation.Computer#getConsumer <em>Consumer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Consumer</em>'.
	 * @see implementation.Computer#getConsumer()
	 * @see #getComputer()
	 * @generated
	 */
	EReference getComputer_Consumer();

	/**
	 * Returns the meta object for class '{@link implementation.Router <em>Router</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Router</em>'.
	 * @see implementation.Router
	 * @generated
	 */
	EClass getRouter();

	/**
	 * Returns the meta object for the attribute '{@link implementation.Router#getMaxSpeed <em>Max Speed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Max Speed</em>'.
	 * @see implementation.Router#getMaxSpeed()
	 * @see #getRouter()
	 * @generated
	 */
	EAttribute getRouter_MaxSpeed();

	/**
	 * Returns the meta object for class '{@link implementation.CopperCable <em>Copper Cable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Copper Cable</em>'.
	 * @see implementation.CopperCable
	 * @generated
	 */
	EClass getCopperCable();

	/**
	 * Returns the meta object for class '{@link implementation.GlassFiberCable <em>Glass Fiber Cable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Glass Fiber Cable</em>'.
	 * @see implementation.GlassFiberCable
	 * @generated
	 */
	EClass getGlassFiberCable();

	/**
	 * Returns the meta object for class '{@link implementation.Container <em>Container</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Container</em>'.
	 * @see implementation.Container
	 * @generated
	 */
	EClass getContainer();

	/**
	 * Returns the meta object for the containment reference list '{@link implementation.Container#getDevices <em>Devices</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Devices</em>'.
	 * @see implementation.Container#getDevices()
	 * @see #getContainer()
	 * @generated
	 */
	EReference getContainer_Devices();

	/**
	 * Returns the meta object for the containment reference list '{@link implementation.Container#getCables <em>Cables</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Cables</em>'.
	 * @see implementation.Container#getCables()
	 * @see #getContainer()
	 * @generated
	 */
	EReference getContainer_Cables();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ImplementationFactory getImplementationFactory();

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
		 * The meta object literal for the '{@link implementation.impl.DeviceImpl <em>Device</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see implementation.impl.DeviceImpl
		 * @see implementation.impl.ImplementationPackageImpl#getDevice()
		 * @generated
		 */
		EClass DEVICE = eINSTANCE.getDevice();

		/**
		 * The meta object literal for the '<em><b>Outgoing</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEVICE__OUTGOING = eINSTANCE.getDevice_Outgoing();

		/**
		 * The meta object literal for the '<em><b>Incoming</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEVICE__INCOMING = eINSTANCE.getDevice_Incoming();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DEVICE__NAME = eINSTANCE.getDevice_Name();

		/**
		 * The meta object literal for the '{@link implementation.impl.CableImpl <em>Cable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see implementation.impl.CableImpl
		 * @see implementation.impl.ImplementationPackageImpl#getCable()
		 * @generated
		 */
		EClass CABLE = eINSTANCE.getCable();

		/**
		 * The meta object literal for the '<em><b>Speed</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CABLE__SPEED = eINSTANCE.getCable_Speed();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CABLE__SOURCE = eINSTANCE.getCable_Source();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CABLE__TARGET = eINSTANCE.getCable_Target();

		/**
		 * The meta object literal for the '{@link implementation.impl.ServerImpl <em>Server</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see implementation.impl.ServerImpl
		 * @see implementation.impl.ImplementationPackageImpl#getServer()
		 * @generated
		 */
		EClass SERVER = eINSTANCE.getServer();

		/**
		 * The meta object literal for the '<em><b>Provider</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SERVER__PROVIDER = eINSTANCE.getServer_Provider();

		/**
		 * The meta object literal for the '<em><b>Max Slots</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SERVER__MAX_SLOTS = eINSTANCE.getServer_MaxSlots();

		/**
		 * The meta object literal for the '<em><b>MTBF</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SERVER__MTBF = eINSTANCE.getServer_MTBF();

		/**
		 * The meta object literal for the '{@link implementation.impl.ComputerImpl <em>Computer</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see implementation.impl.ComputerImpl
		 * @see implementation.impl.ImplementationPackageImpl#getComputer()
		 * @generated
		 */
		EClass COMPUTER = eINSTANCE.getComputer();

		/**
		 * The meta object literal for the '<em><b>Consumer</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPUTER__CONSUMER = eINSTANCE.getComputer_Consumer();

		/**
		 * The meta object literal for the '{@link implementation.impl.RouterImpl <em>Router</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see implementation.impl.RouterImpl
		 * @see implementation.impl.ImplementationPackageImpl#getRouter()
		 * @generated
		 */
		EClass ROUTER = eINSTANCE.getRouter();

		/**
		 * The meta object literal for the '<em><b>Max Speed</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ROUTER__MAX_SPEED = eINSTANCE.getRouter_MaxSpeed();

		/**
		 * The meta object literal for the '{@link implementation.impl.CopperCableImpl <em>Copper Cable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see implementation.impl.CopperCableImpl
		 * @see implementation.impl.ImplementationPackageImpl#getCopperCable()
		 * @generated
		 */
		EClass COPPER_CABLE = eINSTANCE.getCopperCable();

		/**
		 * The meta object literal for the '{@link implementation.impl.GlassFiberCableImpl <em>Glass Fiber Cable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see implementation.impl.GlassFiberCableImpl
		 * @see implementation.impl.ImplementationPackageImpl#getGlassFiberCable()
		 * @generated
		 */
		EClass GLASS_FIBER_CABLE = eINSTANCE.getGlassFiberCable();

		/**
		 * The meta object literal for the '{@link implementation.impl.ContainerImpl <em>Container</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see implementation.impl.ContainerImpl
		 * @see implementation.impl.ImplementationPackageImpl#getContainer()
		 * @generated
		 */
		EClass CONTAINER = eINSTANCE.getContainer();

		/**
		 * The meta object literal for the '<em><b>Devices</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTAINER__DEVICES = eINSTANCE.getContainer_Devices();

		/**
		 * The meta object literal for the '<em><b>Cables</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTAINER__CABLES = eINSTANCE.getContainer_Cables();

	}

} //ImplementationPackage
