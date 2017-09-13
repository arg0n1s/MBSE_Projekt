/**
 */
package ReqToImpTransformator.Rules;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see ReqToImpTransformator.Rules.RulesPackage
 * @generated
 */
public interface RulesFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	RulesFactory eINSTANCE = ReqToImpTransformator.Rules.impl.RulesFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Req Agent To Device Rule</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Req Agent To Device Rule</em>'.
	 * @generated
	 */
	ReqAgentToDeviceRule createReqAgentToDeviceRule();

	/**
	 * Returns a new object of class '<em>Impl Glass Ignore Rule</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Impl Glass Ignore Rule</em>'.
	 * @generated
	 */
	ImplGlassIgnoreRule createImplGlassIgnoreRule();

	/**
	 * Returns a new object of class '<em>Virtual Node To Computer Rule</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Virtual Node To Computer Rule</em>'.
	 * @generated
	 */
	VirtualNodeToComputerRule createVirtualNodeToComputerRule();

	/**
	 * Returns a new object of class '<em>Impl Outgoing Connection Ignore Rule</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Impl Outgoing Connection Ignore Rule</em>'.
	 * @generated
	 */
	ImplOutgoingConnectionIgnoreRule createImplOutgoingConnectionIgnoreRule();

	/**
	 * Returns a new object of class '<em>Virtual Node To Server Rule</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Virtual Node To Server Rule</em>'.
	 * @generated
	 */
	VirtualNodeToServerRule createVirtualNodeToServerRule();

	/**
	 * Returns a new object of class '<em>Impl Copper Ignore Rule</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Impl Copper Ignore Rule</em>'.
	 * @generated
	 */
	ImplCopperIgnoreRule createImplCopperIgnoreRule();

	/**
	 * Returns a new object of class '<em>Req Consumer To Computer Rule</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Req Consumer To Computer Rule</em>'.
	 * @generated
	 */
	ReqConsumerToComputerRule createReqConsumerToComputerRule();

	/**
	 * Returns a new object of class '<em>Virtual Node To Router Rule2</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Virtual Node To Router Rule2</em>'.
	 * @generated
	 */
	VirtualNodeToRouterRule2 createVirtualNodeToRouterRule2();

	/**
	 * Returns a new object of class '<em>Req Provider To Server Rule</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Req Provider To Server Rule</em>'.
	 * @generated
	 */
	ReqProviderToServerRule createReqProviderToServerRule();

	/**
	 * Returns a new object of class '<em>Req Container To Impl Container Rule</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Req Container To Impl Container Rule</em>'.
	 * @generated
	 */
	ReqContainerToImplContainerRule createReqContainerToImplContainerRule();

	/**
	 * Returns a new object of class '<em>Impl Cable Ignore Rule</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Impl Cable Ignore Rule</em>'.
	 * @generated
	 */
	ImplCableIgnoreRule createImplCableIgnoreRule();

	/**
	 * Returns a new object of class '<em>Virtual Node To Router Rule1</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Virtual Node To Router Rule1</em>'.
	 * @generated
	 */
	VirtualNodeToRouterRule1 createVirtualNodeToRouterRule1();

	/**
	 * Returns a new object of class '<em>Impl Incoming Connection Ignore Rule</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Impl Incoming Connection Ignore Rule</em>'.
	 * @generated
	 */
	ImplIncomingConnectionIgnoreRule createImplIncomingConnectionIgnoreRule();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	RulesPackage getRulesPackage();

} //RulesFactory
