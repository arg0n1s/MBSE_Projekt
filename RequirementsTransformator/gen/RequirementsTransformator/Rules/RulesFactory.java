/**
 */
package RequirementsTransformator.Rules;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see RequirementsTransformator.Rules.RulesPackage
 * @generated
 */
public interface RulesFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	RulesFactory eINSTANCE = RequirementsTransformator.Rules.impl.RulesFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>XConsumer To Consumer Rule</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>XConsumer To Consumer Rule</em>'.
	 * @generated
	 */
	XConsumerToConsumerRule createXConsumerToConsumerRule();

	/**
	 * Returns a new object of class '<em>XAgent To Agent Rule</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>XAgent To Agent Rule</em>'.
	 * @generated
	 */
	XAgentToAgentRule createXAgentToAgentRule();

	/**
	 * Returns a new object of class '<em>XContainer To Container Rule</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>XContainer To Container Rule</em>'.
	 * @generated
	 */
	XContainerToContainerRule createXContainerToContainerRule();

	/**
	 * Returns a new object of class '<em>XProvider To Provider Rule</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>XProvider To Provider Rule</em>'.
	 * @generated
	 */
	XProviderToProviderRule createXProviderToProviderRule();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	RulesPackage getRulesPackage();

} //RulesFactory
