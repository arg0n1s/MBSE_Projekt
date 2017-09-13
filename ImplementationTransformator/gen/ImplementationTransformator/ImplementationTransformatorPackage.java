/**
 */
package ImplementationTransformator;

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
 * @see ImplementationTransformator.ImplementationTransformatorFactory
 * @model kind="package"
 * @generated
 */
public interface ImplementationTransformatorPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "ImplementationTransformator";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "platform:/plugin/ImplementationTransformator/model/ImplementationTransformator.ecore";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "ImplementationTransformator";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ImplementationTransformatorPackage eINSTANCE = ImplementationTransformator.impl.ImplementationTransformatorPackageImpl
			.init();

	/**
	 * The meta object id for the '{@link ImplementationTransformator.impl.XCableToCableImpl <em>XCable To Cable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ImplementationTransformator.impl.XCableToCableImpl
	 * @see ImplementationTransformator.impl.ImplementationTransformatorPackageImpl#getXCableToCable()
	 * @generated
	 */
	int XCABLE_TO_CABLE = 0;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XCABLE_TO_CABLE__SOURCE = RuntimePackage.ABSTRACT_CORRESPONDENCE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XCABLE_TO_CABLE__TARGET = RuntimePackage.ABSTRACT_CORRESPONDENCE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>XCable To Cable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XCABLE_TO_CABLE_FEATURE_COUNT = RuntimePackage.ABSTRACT_CORRESPONDENCE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>XCable To Cable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XCABLE_TO_CABLE_OPERATION_COUNT = RuntimePackage.ABSTRACT_CORRESPONDENCE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ImplementationTransformator.impl.XDeviceToDeviceImpl <em>XDevice To Device</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ImplementationTransformator.impl.XDeviceToDeviceImpl
	 * @see ImplementationTransformator.impl.ImplementationTransformatorPackageImpl#getXDeviceToDevice()
	 * @generated
	 */
	int XDEVICE_TO_DEVICE = 1;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XDEVICE_TO_DEVICE__SOURCE = RuntimePackage.ABSTRACT_CORRESPONDENCE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XDEVICE_TO_DEVICE__TARGET = RuntimePackage.ABSTRACT_CORRESPONDENCE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>XDevice To Device</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XDEVICE_TO_DEVICE_FEATURE_COUNT = RuntimePackage.ABSTRACT_CORRESPONDENCE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>XDevice To Device</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XDEVICE_TO_DEVICE_OPERATION_COUNT = RuntimePackage.ABSTRACT_CORRESPONDENCE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ImplementationTransformator.impl.XContainerToContainerImpl <em>XContainer To Container</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ImplementationTransformator.impl.XContainerToContainerImpl
	 * @see ImplementationTransformator.impl.ImplementationTransformatorPackageImpl#getXContainerToContainer()
	 * @generated
	 */
	int XCONTAINER_TO_CONTAINER = 2;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XCONTAINER_TO_CONTAINER__SOURCE = RuntimePackage.ABSTRACT_CORRESPONDENCE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XCONTAINER_TO_CONTAINER__TARGET = RuntimePackage.ABSTRACT_CORRESPONDENCE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>XContainer To Container</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XCONTAINER_TO_CONTAINER_FEATURE_COUNT = RuntimePackage.ABSTRACT_CORRESPONDENCE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>XContainer To Container</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XCONTAINER_TO_CONTAINER_OPERATION_COUNT = RuntimePackage.ABSTRACT_CORRESPONDENCE_OPERATION_COUNT + 0;

	/**
	 * Returns the meta object for class '{@link ImplementationTransformator.XCableToCable <em>XCable To Cable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>XCable To Cable</em>'.
	 * @see ImplementationTransformator.XCableToCable
	 * @generated
	 */
	EClass getXCableToCable();

	/**
	 * Returns the meta object for the reference '{@link ImplementationTransformator.XCableToCable#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source</em>'.
	 * @see ImplementationTransformator.XCableToCable#getSource()
	 * @see #getXCableToCable()
	 * @generated
	 */
	EReference getXCableToCable_Source();

	/**
	 * Returns the meta object for the reference '{@link ImplementationTransformator.XCableToCable#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see ImplementationTransformator.XCableToCable#getTarget()
	 * @see #getXCableToCable()
	 * @generated
	 */
	EReference getXCableToCable_Target();

	/**
	 * Returns the meta object for class '{@link ImplementationTransformator.XDeviceToDevice <em>XDevice To Device</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>XDevice To Device</em>'.
	 * @see ImplementationTransformator.XDeviceToDevice
	 * @generated
	 */
	EClass getXDeviceToDevice();

	/**
	 * Returns the meta object for the reference '{@link ImplementationTransformator.XDeviceToDevice#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source</em>'.
	 * @see ImplementationTransformator.XDeviceToDevice#getSource()
	 * @see #getXDeviceToDevice()
	 * @generated
	 */
	EReference getXDeviceToDevice_Source();

	/**
	 * Returns the meta object for the reference '{@link ImplementationTransformator.XDeviceToDevice#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see ImplementationTransformator.XDeviceToDevice#getTarget()
	 * @see #getXDeviceToDevice()
	 * @generated
	 */
	EReference getXDeviceToDevice_Target();

	/**
	 * Returns the meta object for class '{@link ImplementationTransformator.XContainerToContainer <em>XContainer To Container</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>XContainer To Container</em>'.
	 * @see ImplementationTransformator.XContainerToContainer
	 * @generated
	 */
	EClass getXContainerToContainer();

	/**
	 * Returns the meta object for the reference '{@link ImplementationTransformator.XContainerToContainer#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source</em>'.
	 * @see ImplementationTransformator.XContainerToContainer#getSource()
	 * @see #getXContainerToContainer()
	 * @generated
	 */
	EReference getXContainerToContainer_Source();

	/**
	 * Returns the meta object for the reference '{@link ImplementationTransformator.XContainerToContainer#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see ImplementationTransformator.XContainerToContainer#getTarget()
	 * @see #getXContainerToContainer()
	 * @generated
	 */
	EReference getXContainerToContainer_Target();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ImplementationTransformatorFactory getImplementationTransformatorFactory();

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
		 * The meta object literal for the '{@link ImplementationTransformator.impl.XCableToCableImpl <em>XCable To Cable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ImplementationTransformator.impl.XCableToCableImpl
		 * @see ImplementationTransformator.impl.ImplementationTransformatorPackageImpl#getXCableToCable()
		 * @generated
		 */
		EClass XCABLE_TO_CABLE = eINSTANCE.getXCableToCable();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference XCABLE_TO_CABLE__SOURCE = eINSTANCE.getXCableToCable_Source();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference XCABLE_TO_CABLE__TARGET = eINSTANCE.getXCableToCable_Target();

		/**
		 * The meta object literal for the '{@link ImplementationTransformator.impl.XDeviceToDeviceImpl <em>XDevice To Device</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ImplementationTransformator.impl.XDeviceToDeviceImpl
		 * @see ImplementationTransformator.impl.ImplementationTransformatorPackageImpl#getXDeviceToDevice()
		 * @generated
		 */
		EClass XDEVICE_TO_DEVICE = eINSTANCE.getXDeviceToDevice();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference XDEVICE_TO_DEVICE__SOURCE = eINSTANCE.getXDeviceToDevice_Source();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference XDEVICE_TO_DEVICE__TARGET = eINSTANCE.getXDeviceToDevice_Target();

		/**
		 * The meta object literal for the '{@link ImplementationTransformator.impl.XContainerToContainerImpl <em>XContainer To Container</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ImplementationTransformator.impl.XContainerToContainerImpl
		 * @see ImplementationTransformator.impl.ImplementationTransformatorPackageImpl#getXContainerToContainer()
		 * @generated
		 */
		EClass XCONTAINER_TO_CONTAINER = eINSTANCE.getXContainerToContainer();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference XCONTAINER_TO_CONTAINER__SOURCE = eINSTANCE.getXContainerToContainer_Source();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference XCONTAINER_TO_CONTAINER__TARGET = eINSTANCE.getXContainerToContainer_Target();

	}

} //ImplementationTransformatorPackage
