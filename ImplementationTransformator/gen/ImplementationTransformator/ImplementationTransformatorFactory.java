/**
 */
package ImplementationTransformator;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see ImplementationTransformator.ImplementationTransformatorPackage
 * @generated
 */
public interface ImplementationTransformatorFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ImplementationTransformatorFactory eINSTANCE = ImplementationTransformator.impl.ImplementationTransformatorFactoryImpl
			.init();

	/**
	 * Returns a new object of class '<em>XCable To Cable</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>XCable To Cable</em>'.
	 * @generated
	 */
	XCableToCable createXCableToCable();

	/**
	 * Returns a new object of class '<em>XContainer To Container</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>XContainer To Container</em>'.
	 * @generated
	 */
	XContainerToContainer createXContainerToContainer();

	/**
	 * Returns a new object of class '<em>XDevice To Device</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>XDevice To Device</em>'.
	 * @generated
	 */
	XDeviceToDevice createXDeviceToDevice();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	ImplementationTransformatorPackage getImplementationTransformatorPackage();

} //ImplementationTransformatorFactory
