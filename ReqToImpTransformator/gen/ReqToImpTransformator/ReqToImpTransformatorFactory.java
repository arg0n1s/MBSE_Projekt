/**
 */
package ReqToImpTransformator;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see ReqToImpTransformator.ReqToImpTransformatorPackage
 * @generated
 */
public interface ReqToImpTransformatorFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ReqToImpTransformatorFactory eINSTANCE = ReqToImpTransformator.impl.ReqToImpTransformatorFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Virtual Node To Router</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Virtual Node To Router</em>'.
	 * @generated
	 */
	VirtualNodeToRouter createVirtualNodeToRouter();

	/**
	 * Returns a new object of class '<em>Req Agent To Impl Device</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Req Agent To Impl Device</em>'.
	 * @generated
	 */
	ReqAgentToImplDevice createReqAgentToImplDevice();

	/**
	 * Returns a new object of class '<em>Virtual Node To Computer</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Virtual Node To Computer</em>'.
	 * @generated
	 */
	VirtualNodeToComputer createVirtualNodeToComputer();

	/**
	 * Returns a new object of class '<em>Req Container To Impl Container</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Req Container To Impl Container</em>'.
	 * @generated
	 */
	ReqContainerToImplContainer createReqContainerToImplContainer();

	/**
	 * Returns a new object of class '<em>Virtual Node To Server</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Virtual Node To Server</em>'.
	 * @generated
	 */
	VirtualNodeToServer createVirtualNodeToServer();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	ReqToImpTransformatorPackage getReqToImpTransformatorPackage();

} //ReqToImpTransformatorFactory
