/**
 */
package ImplementationTransformator.impl;

import ImplementationTransformator.*;

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
public class ImplementationTransformatorFactoryImpl extends EFactoryImpl implements ImplementationTransformatorFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ImplementationTransformatorFactory init() {
		try {
			ImplementationTransformatorFactory theImplementationTransformatorFactory = (ImplementationTransformatorFactory) EPackage.Registry.INSTANCE
					.getEFactory(ImplementationTransformatorPackage.eNS_URI);
			if (theImplementationTransformatorFactory != null) {
				return theImplementationTransformatorFactory;
			}
		} catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new ImplementationTransformatorFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ImplementationTransformatorFactoryImpl() {
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
		case ImplementationTransformatorPackage.XCABLE_TO_CABLE:
			return createXCableToCable();
		case ImplementationTransformatorPackage.XCONTAINER_TO_CONTAINER:
			return createXContainerToContainer();
		case ImplementationTransformatorPackage.XDEVICE_TO_DEVICE:
			return createXDeviceToDevice();
		default:
			throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XCableToCable createXCableToCable() {
		XCableToCableImpl xCableToCable = new XCableToCableImpl();
		return xCableToCable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XContainerToContainer createXContainerToContainer() {
		XContainerToContainerImpl xContainerToContainer = new XContainerToContainerImpl();
		return xContainerToContainer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XDeviceToDevice createXDeviceToDevice() {
		XDeviceToDeviceImpl xDeviceToDevice = new XDeviceToDeviceImpl();
		return xDeviceToDevice;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ImplementationTransformatorPackage getImplementationTransformatorPackage() {
		return (ImplementationTransformatorPackage) getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static ImplementationTransformatorPackage getPackage() {
		return ImplementationTransformatorPackage.eINSTANCE;
	}

} //ImplementationTransformatorFactoryImpl
