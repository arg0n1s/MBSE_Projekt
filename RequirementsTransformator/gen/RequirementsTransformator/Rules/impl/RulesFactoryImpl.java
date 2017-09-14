/**
 */
package RequirementsTransformator.Rules.impl;

import RequirementsTransformator.Rules.*;

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
public class RulesFactoryImpl extends EFactoryImpl implements RulesFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static RulesFactory init() {
		try {
			RulesFactory theRulesFactory = (RulesFactory) EPackage.Registry.INSTANCE.getEFactory(RulesPackage.eNS_URI);
			if (theRulesFactory != null) {
				return theRulesFactory;
			}
		} catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new RulesFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RulesFactoryImpl() {
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
		case RulesPackage.XPROVIDER_TO_PROVIDER_RULE:
			return createXProviderToProviderRule();
		case RulesPackage.XAGENT_TO_AGENT_RULE:
			return createXAgentToAgentRule();
		case RulesPackage.XCONTAINER_TO_CONTAINER_RULE:
			return createXContainerToContainerRule();
		case RulesPackage.XCONSUMER_TO_CONSUMER_RULE:
			return createXConsumerToConsumerRule();
		default:
			throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XProviderToProviderRule createXProviderToProviderRule() {
		XProviderToProviderRuleImpl xProviderToProviderRule = new XProviderToProviderRuleImpl();
		return xProviderToProviderRule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XAgentToAgentRule createXAgentToAgentRule() {
		XAgentToAgentRuleImpl xAgentToAgentRule = new XAgentToAgentRuleImpl();
		return xAgentToAgentRule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XContainerToContainerRule createXContainerToContainerRule() {
		XContainerToContainerRuleImpl xContainerToContainerRule = new XContainerToContainerRuleImpl();
		return xContainerToContainerRule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XConsumerToConsumerRule createXConsumerToConsumerRule() {
		XConsumerToConsumerRuleImpl xConsumerToConsumerRule = new XConsumerToConsumerRuleImpl();
		return xConsumerToConsumerRule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RulesPackage getRulesPackage() {
		return (RulesPackage) getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static RulesPackage getPackage() {
		return RulesPackage.eINSTANCE;
	}

} //RulesFactoryImpl
