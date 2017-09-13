/**
 */
package RequirementsTransformator;

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
 * @see RequirementsTransformator.RequirementsTransformatorFactory
 * @model kind="package"
 * @generated
 */
public interface RequirementsTransformatorPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "RequirementsTransformator";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "platform:/plugin/RequirementsTransformator/model/RequirementsTransformator.ecore";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "RequirementsTransformator";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	RequirementsTransformatorPackage eINSTANCE = RequirementsTransformator.impl.RequirementsTransformatorPackageImpl
			.init();

	/**
	 * The meta object id for the '{@link RequirementsTransformator.impl.XContainerToContainerImpl <em>XContainer To Container</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see RequirementsTransformator.impl.XContainerToContainerImpl
	 * @see RequirementsTransformator.impl.RequirementsTransformatorPackageImpl#getXContainerToContainer()
	 * @generated
	 */
	int XCONTAINER_TO_CONTAINER = 0;

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
	 * The meta object id for the '{@link RequirementsTransformator.impl.XProviderToProviderImpl <em>XProvider To Provider</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see RequirementsTransformator.impl.XProviderToProviderImpl
	 * @see RequirementsTransformator.impl.RequirementsTransformatorPackageImpl#getXProviderToProvider()
	 * @generated
	 */
	int XPROVIDER_TO_PROVIDER = 1;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XPROVIDER_TO_PROVIDER__SOURCE = RuntimePackage.ABSTRACT_CORRESPONDENCE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XPROVIDER_TO_PROVIDER__TARGET = RuntimePackage.ABSTRACT_CORRESPONDENCE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>XProvider To Provider</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XPROVIDER_TO_PROVIDER_FEATURE_COUNT = RuntimePackage.ABSTRACT_CORRESPONDENCE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>XProvider To Provider</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XPROVIDER_TO_PROVIDER_OPERATION_COUNT = RuntimePackage.ABSTRACT_CORRESPONDENCE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link RequirementsTransformator.impl.XConsumerToConsumerImpl <em>XConsumer To Consumer</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see RequirementsTransformator.impl.XConsumerToConsumerImpl
	 * @see RequirementsTransformator.impl.RequirementsTransformatorPackageImpl#getXConsumerToConsumer()
	 * @generated
	 */
	int XCONSUMER_TO_CONSUMER = 2;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XCONSUMER_TO_CONSUMER__SOURCE = RuntimePackage.ABSTRACT_CORRESPONDENCE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XCONSUMER_TO_CONSUMER__TARGET = RuntimePackage.ABSTRACT_CORRESPONDENCE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>XConsumer To Consumer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XCONSUMER_TO_CONSUMER_FEATURE_COUNT = RuntimePackage.ABSTRACT_CORRESPONDENCE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>XConsumer To Consumer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XCONSUMER_TO_CONSUMER_OPERATION_COUNT = RuntimePackage.ABSTRACT_CORRESPONDENCE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link RequirementsTransformator.impl.XAgentToAgentImpl <em>XAgent To Agent</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see RequirementsTransformator.impl.XAgentToAgentImpl
	 * @see RequirementsTransformator.impl.RequirementsTransformatorPackageImpl#getXAgentToAgent()
	 * @generated
	 */
	int XAGENT_TO_AGENT = 3;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XAGENT_TO_AGENT__SOURCE = RuntimePackage.ABSTRACT_CORRESPONDENCE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XAGENT_TO_AGENT__TARGET = RuntimePackage.ABSTRACT_CORRESPONDENCE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>XAgent To Agent</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XAGENT_TO_AGENT_FEATURE_COUNT = RuntimePackage.ABSTRACT_CORRESPONDENCE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>XAgent To Agent</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XAGENT_TO_AGENT_OPERATION_COUNT = RuntimePackage.ABSTRACT_CORRESPONDENCE_OPERATION_COUNT + 0;

	/**
	 * Returns the meta object for class '{@link RequirementsTransformator.XContainerToContainer <em>XContainer To Container</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>XContainer To Container</em>'.
	 * @see RequirementsTransformator.XContainerToContainer
	 * @generated
	 */
	EClass getXContainerToContainer();

	/**
	 * Returns the meta object for the reference '{@link RequirementsTransformator.XContainerToContainer#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source</em>'.
	 * @see RequirementsTransformator.XContainerToContainer#getSource()
	 * @see #getXContainerToContainer()
	 * @generated
	 */
	EReference getXContainerToContainer_Source();

	/**
	 * Returns the meta object for the reference '{@link RequirementsTransformator.XContainerToContainer#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see RequirementsTransformator.XContainerToContainer#getTarget()
	 * @see #getXContainerToContainer()
	 * @generated
	 */
	EReference getXContainerToContainer_Target();

	/**
	 * Returns the meta object for class '{@link RequirementsTransformator.XProviderToProvider <em>XProvider To Provider</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>XProvider To Provider</em>'.
	 * @see RequirementsTransformator.XProviderToProvider
	 * @generated
	 */
	EClass getXProviderToProvider();

	/**
	 * Returns the meta object for the reference '{@link RequirementsTransformator.XProviderToProvider#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source</em>'.
	 * @see RequirementsTransformator.XProviderToProvider#getSource()
	 * @see #getXProviderToProvider()
	 * @generated
	 */
	EReference getXProviderToProvider_Source();

	/**
	 * Returns the meta object for the reference '{@link RequirementsTransformator.XProviderToProvider#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see RequirementsTransformator.XProviderToProvider#getTarget()
	 * @see #getXProviderToProvider()
	 * @generated
	 */
	EReference getXProviderToProvider_Target();

	/**
	 * Returns the meta object for class '{@link RequirementsTransformator.XConsumerToConsumer <em>XConsumer To Consumer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>XConsumer To Consumer</em>'.
	 * @see RequirementsTransformator.XConsumerToConsumer
	 * @generated
	 */
	EClass getXConsumerToConsumer();

	/**
	 * Returns the meta object for the reference '{@link RequirementsTransformator.XConsumerToConsumer#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source</em>'.
	 * @see RequirementsTransformator.XConsumerToConsumer#getSource()
	 * @see #getXConsumerToConsumer()
	 * @generated
	 */
	EReference getXConsumerToConsumer_Source();

	/**
	 * Returns the meta object for the reference '{@link RequirementsTransformator.XConsumerToConsumer#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see RequirementsTransformator.XConsumerToConsumer#getTarget()
	 * @see #getXConsumerToConsumer()
	 * @generated
	 */
	EReference getXConsumerToConsumer_Target();

	/**
	 * Returns the meta object for class '{@link RequirementsTransformator.XAgentToAgent <em>XAgent To Agent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>XAgent To Agent</em>'.
	 * @see RequirementsTransformator.XAgentToAgent
	 * @generated
	 */
	EClass getXAgentToAgent();

	/**
	 * Returns the meta object for the reference '{@link RequirementsTransformator.XAgentToAgent#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source</em>'.
	 * @see RequirementsTransformator.XAgentToAgent#getSource()
	 * @see #getXAgentToAgent()
	 * @generated
	 */
	EReference getXAgentToAgent_Source();

	/**
	 * Returns the meta object for the reference '{@link RequirementsTransformator.XAgentToAgent#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see RequirementsTransformator.XAgentToAgent#getTarget()
	 * @see #getXAgentToAgent()
	 * @generated
	 */
	EReference getXAgentToAgent_Target();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	RequirementsTransformatorFactory getRequirementsTransformatorFactory();

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
		 * The meta object literal for the '{@link RequirementsTransformator.impl.XContainerToContainerImpl <em>XContainer To Container</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see RequirementsTransformator.impl.XContainerToContainerImpl
		 * @see RequirementsTransformator.impl.RequirementsTransformatorPackageImpl#getXContainerToContainer()
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

		/**
		 * The meta object literal for the '{@link RequirementsTransformator.impl.XProviderToProviderImpl <em>XProvider To Provider</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see RequirementsTransformator.impl.XProviderToProviderImpl
		 * @see RequirementsTransformator.impl.RequirementsTransformatorPackageImpl#getXProviderToProvider()
		 * @generated
		 */
		EClass XPROVIDER_TO_PROVIDER = eINSTANCE.getXProviderToProvider();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference XPROVIDER_TO_PROVIDER__SOURCE = eINSTANCE.getXProviderToProvider_Source();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference XPROVIDER_TO_PROVIDER__TARGET = eINSTANCE.getXProviderToProvider_Target();

		/**
		 * The meta object literal for the '{@link RequirementsTransformator.impl.XConsumerToConsumerImpl <em>XConsumer To Consumer</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see RequirementsTransformator.impl.XConsumerToConsumerImpl
		 * @see RequirementsTransformator.impl.RequirementsTransformatorPackageImpl#getXConsumerToConsumer()
		 * @generated
		 */
		EClass XCONSUMER_TO_CONSUMER = eINSTANCE.getXConsumerToConsumer();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference XCONSUMER_TO_CONSUMER__SOURCE = eINSTANCE.getXConsumerToConsumer_Source();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference XCONSUMER_TO_CONSUMER__TARGET = eINSTANCE.getXConsumerToConsumer_Target();

		/**
		 * The meta object literal for the '{@link RequirementsTransformator.impl.XAgentToAgentImpl <em>XAgent To Agent</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see RequirementsTransformator.impl.XAgentToAgentImpl
		 * @see RequirementsTransformator.impl.RequirementsTransformatorPackageImpl#getXAgentToAgent()
		 * @generated
		 */
		EClass XAGENT_TO_AGENT = eINSTANCE.getXAgentToAgent();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference XAGENT_TO_AGENT__SOURCE = eINSTANCE.getXAgentToAgent_Source();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference XAGENT_TO_AGENT__TARGET = eINSTANCE.getXAgentToAgent_Target();

	}

} //RequirementsTransformatorPackage
