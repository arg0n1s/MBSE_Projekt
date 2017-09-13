/**
 */
package ImplementationTransformator.Rules;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see ImplementationTransformator.Rules.RulesPackage
 * @generated
 */
public interface RulesFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	RulesFactory eINSTANCE = ImplementationTransformator.Rules.impl.RulesFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>XContainer To Container Rule</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>XContainer To Container Rule</em>'.
	 * @generated
	 */
	XContainerToContainerRule createXContainerToContainerRule();

	/**
	 * Returns a new object of class '<em>XDuplex Glass Fiber Cable Rule</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>XDuplex Glass Fiber Cable Rule</em>'.
	 * @generated
	 */
	XDuplexGlassFiberCableRule createXDuplexGlassFiberCableRule();

	/**
	 * Returns a new object of class '<em>XComputer To Computer</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>XComputer To Computer</em>'.
	 * @generated
	 */
	XComputerToComputer createXComputerToComputer();

	/**
	 * Returns a new object of class '<em>XSimplex Glass Fiber Cable Rule</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>XSimplex Glass Fiber Cable Rule</em>'.
	 * @generated
	 */
	XSimplexGlassFiberCableRule createXSimplexGlassFiberCableRule();

	/**
	 * Returns a new object of class '<em>XSimplex Connection To Connection Rule</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>XSimplex Connection To Connection Rule</em>'.
	 * @generated
	 */
	XSimplexConnectionToConnectionRule createXSimplexConnectionToConnectionRule();

	/**
	 * Returns a new object of class '<em>XSimplex Copper Cable Rule</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>XSimplex Copper Cable Rule</em>'.
	 * @generated
	 */
	XSimplexCopperCableRule createXSimplexCopperCableRule();

	/**
	 * Returns a new object of class '<em>XDuplex Copper Cable Rule</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>XDuplex Copper Cable Rule</em>'.
	 * @generated
	 */
	XDuplexCopperCableRule createXDuplexCopperCableRule();

	/**
	 * Returns a new object of class '<em>XServer To Server</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>XServer To Server</em>'.
	 * @generated
	 */
	XServerToServer createXServerToServer();

	/**
	 * Returns a new object of class '<em>XDuplex Connection To Connection Rule</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>XDuplex Connection To Connection Rule</em>'.
	 * @generated
	 */
	XDuplexConnectionToConnectionRule createXDuplexConnectionToConnectionRule();

	/**
	 * Returns a new object of class '<em>XRouter To Router Rule</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>XRouter To Router Rule</em>'.
	 * @generated
	 */
	XRouterToRouterRule createXRouterToRouterRule();

	/**
	 * Returns a new object of class '<em>XDuplex Cable To Cables Rule</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>XDuplex Cable To Cables Rule</em>'.
	 * @generated
	 */
	XDuplexCableToCablesRule createXDuplexCableToCablesRule();

	/**
	 * Returns a new object of class '<em>XSimplex Cable To Cable Rule</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>XSimplex Cable To Cable Rule</em>'.
	 * @generated
	 */
	XSimplexCableToCableRule createXSimplexCableToCableRule();

	/**
	 * Returns a new object of class '<em>XDevice To Device Rule</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>XDevice To Device Rule</em>'.
	 * @generated
	 */
	XDeviceToDeviceRule createXDeviceToDeviceRule();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	RulesPackage getRulesPackage();

} //RulesFactory
