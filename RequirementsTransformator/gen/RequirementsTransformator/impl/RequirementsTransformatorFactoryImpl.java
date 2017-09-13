/**
 */
package RequirementsTransformator.impl;

import RequirementsTransformator.*;

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
public class RequirementsTransformatorFactoryImpl extends EFactoryImpl implements RequirementsTransformatorFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static RequirementsTransformatorFactory init() {
		try {
			RequirementsTransformatorFactory theRequirementsTransformatorFactory = (RequirementsTransformatorFactory) EPackage.Registry.INSTANCE
					.getEFactory(RequirementsTransformatorPackage.eNS_URI);
			if (theRequirementsTransformatorFactory != null) {
				return theRequirementsTransformatorFactory;
			}
		} catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new RequirementsTransformatorFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RequirementsTransformatorFactoryImpl() {
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
		case RequirementsTransformatorPackage.XAGENT_TO_AGENT:
			return createXAgentToAgent();
		case RequirementsTransformatorPackage.XCONSUMER_TO_CONSUMER:
			return createXConsumerToConsumer();
		case RequirementsTransformatorPackage.XCONTAINER_TO_CONTAINER:
			return createXContainerToContainer();
		case RequirementsTransformatorPackage.XPROVIDER_TO_PROVIDER:
			return createXProviderToProvider();
		default:
			throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XAgentToAgent createXAgentToAgent() {
		XAgentToAgentImpl xAgentToAgent = new XAgentToAgentImpl();
		return xAgentToAgent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XConsumerToConsumer createXConsumerToConsumer() {
		XConsumerToConsumerImpl xConsumerToConsumer = new XConsumerToConsumerImpl();
		return xConsumerToConsumer;
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
	public XProviderToProvider createXProviderToProvider() {
		XProviderToProviderImpl xProviderToProvider = new XProviderToProviderImpl();
		return xProviderToProvider;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RequirementsTransformatorPackage getRequirementsTransformatorPackage() {
		return (RequirementsTransformatorPackage) getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static RequirementsTransformatorPackage getPackage() {
		return RequirementsTransformatorPackage.eINSTANCE;
	}

} //RequirementsTransformatorFactoryImpl
