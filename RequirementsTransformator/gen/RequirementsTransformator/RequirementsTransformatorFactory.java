/**
 */
package RequirementsTransformator;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see RequirementsTransformator.RequirementsTransformatorPackage
 * @generated
 */
public interface RequirementsTransformatorFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	RequirementsTransformatorFactory eINSTANCE = RequirementsTransformator.impl.RequirementsTransformatorFactoryImpl
			.init();

	/**
	 * Returns a new object of class '<em>XContainer To Container</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>XContainer To Container</em>'.
	 * @generated
	 */
	XContainerToContainer createXContainerToContainer();

	/**
	 * Returns a new object of class '<em>XConsumer To Consumer</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>XConsumer To Consumer</em>'.
	 * @generated
	 */
	XConsumerToConsumer createXConsumerToConsumer();

	/**
	 * Returns a new object of class '<em>XProvider To Provider</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>XProvider To Provider</em>'.
	 * @generated
	 */
	XProviderToProvider createXProviderToProvider();

	/**
	 * Returns a new object of class '<em>XAgent To Agent</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>XAgent To Agent</em>'.
	 * @generated
	 */
	XAgentToAgent createXAgentToAgent();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	RequirementsTransformatorPackage getRequirementsTransformatorPackage();

} //RequirementsTransformatorFactory
