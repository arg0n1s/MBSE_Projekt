/**
 */
package ReqToImpTransformator.Rules.util;

import ReqToImpTransformator.Rules.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import org.moflon.tgg.runtime.AbstractRule;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see ReqToImpTransformator.Rules.RulesPackage
 * @generated
 */
public class RulesAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static RulesPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RulesAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = RulesPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject) object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RulesSwitch<Adapter> modelSwitch = new RulesSwitch<Adapter>() {
		@Override
		public Adapter caseImplCableIgnoreRule(ImplCableIgnoreRule object) {
			return createImplCableIgnoreRuleAdapter();
		}

		@Override
		public Adapter caseReqConsumerToComputerRule(ReqConsumerToComputerRule object) {
			return createReqConsumerToComputerRuleAdapter();
		}

		@Override
		public Adapter caseVirtualNodeToComputerRule(VirtualNodeToComputerRule object) {
			return createVirtualNodeToComputerRuleAdapter();
		}

		@Override
		public Adapter caseVirtualNodeToServerRule(VirtualNodeToServerRule object) {
			return createVirtualNodeToServerRuleAdapter();
		}

		@Override
		public Adapter caseImplIncomingConnectionIgnoreRule(ImplIncomingConnectionIgnoreRule object) {
			return createImplIncomingConnectionIgnoreRuleAdapter();
		}

		@Override
		public Adapter caseImplCopperIgnoreRule(ImplCopperIgnoreRule object) {
			return createImplCopperIgnoreRuleAdapter();
		}

		@Override
		public Adapter caseReqAgentToDeviceRule(ReqAgentToDeviceRule object) {
			return createReqAgentToDeviceRuleAdapter();
		}

		@Override
		public Adapter caseVirtualNodeToRouterRule2(VirtualNodeToRouterRule2 object) {
			return createVirtualNodeToRouterRule2Adapter();
		}

		@Override
		public Adapter caseImplOutgoingConnectionIgnoreRule(ImplOutgoingConnectionIgnoreRule object) {
			return createImplOutgoingConnectionIgnoreRuleAdapter();
		}

		@Override
		public Adapter caseReqContainerToImplContainerRule(ReqContainerToImplContainerRule object) {
			return createReqContainerToImplContainerRuleAdapter();
		}

		@Override
		public Adapter caseImplGlassIgnoreRule(ImplGlassIgnoreRule object) {
			return createImplGlassIgnoreRuleAdapter();
		}

		@Override
		public Adapter caseReqProviderToServerRule(ReqProviderToServerRule object) {
			return createReqProviderToServerRuleAdapter();
		}

		@Override
		public Adapter caseVirtualNodeToRouterRule1(VirtualNodeToRouterRule1 object) {
			return createVirtualNodeToRouterRule1Adapter();
		}

		@Override
		public Adapter caseAbstractRule(AbstractRule object) {
			return createAbstractRuleAdapter();
		}

		@Override
		public Adapter defaultCase(EObject object) {
			return createEObjectAdapter();
		}
	};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject) target);
	}

	/**
	 * Creates a new adapter for an object of class '{@link ReqToImpTransformator.Rules.ImplCableIgnoreRule <em>Impl Cable Ignore Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ReqToImpTransformator.Rules.ImplCableIgnoreRule
	 * @generated
	 */
	public Adapter createImplCableIgnoreRuleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ReqToImpTransformator.Rules.ReqConsumerToComputerRule <em>Req Consumer To Computer Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ReqToImpTransformator.Rules.ReqConsumerToComputerRule
	 * @generated
	 */
	public Adapter createReqConsumerToComputerRuleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ReqToImpTransformator.Rules.VirtualNodeToComputerRule <em>Virtual Node To Computer Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ReqToImpTransformator.Rules.VirtualNodeToComputerRule
	 * @generated
	 */
	public Adapter createVirtualNodeToComputerRuleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ReqToImpTransformator.Rules.VirtualNodeToServerRule <em>Virtual Node To Server Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ReqToImpTransformator.Rules.VirtualNodeToServerRule
	 * @generated
	 */
	public Adapter createVirtualNodeToServerRuleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ReqToImpTransformator.Rules.ImplIncomingConnectionIgnoreRule <em>Impl Incoming Connection Ignore Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ReqToImpTransformator.Rules.ImplIncomingConnectionIgnoreRule
	 * @generated
	 */
	public Adapter createImplIncomingConnectionIgnoreRuleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ReqToImpTransformator.Rules.ImplCopperIgnoreRule <em>Impl Copper Ignore Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ReqToImpTransformator.Rules.ImplCopperIgnoreRule
	 * @generated
	 */
	public Adapter createImplCopperIgnoreRuleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ReqToImpTransformator.Rules.ReqAgentToDeviceRule <em>Req Agent To Device Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ReqToImpTransformator.Rules.ReqAgentToDeviceRule
	 * @generated
	 */
	public Adapter createReqAgentToDeviceRuleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ReqToImpTransformator.Rules.VirtualNodeToRouterRule2 <em>Virtual Node To Router Rule2</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ReqToImpTransformator.Rules.VirtualNodeToRouterRule2
	 * @generated
	 */
	public Adapter createVirtualNodeToRouterRule2Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ReqToImpTransformator.Rules.ImplOutgoingConnectionIgnoreRule <em>Impl Outgoing Connection Ignore Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ReqToImpTransformator.Rules.ImplOutgoingConnectionIgnoreRule
	 * @generated
	 */
	public Adapter createImplOutgoingConnectionIgnoreRuleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ReqToImpTransformator.Rules.ReqContainerToImplContainerRule <em>Req Container To Impl Container Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ReqToImpTransformator.Rules.ReqContainerToImplContainerRule
	 * @generated
	 */
	public Adapter createReqContainerToImplContainerRuleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ReqToImpTransformator.Rules.ImplGlassIgnoreRule <em>Impl Glass Ignore Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ReqToImpTransformator.Rules.ImplGlassIgnoreRule
	 * @generated
	 */
	public Adapter createImplGlassIgnoreRuleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ReqToImpTransformator.Rules.ReqProviderToServerRule <em>Req Provider To Server Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ReqToImpTransformator.Rules.ReqProviderToServerRule
	 * @generated
	 */
	public Adapter createReqProviderToServerRuleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ReqToImpTransformator.Rules.VirtualNodeToRouterRule1 <em>Virtual Node To Router Rule1</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ReqToImpTransformator.Rules.VirtualNodeToRouterRule1
	 * @generated
	 */
	public Adapter createVirtualNodeToRouterRule1Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.moflon.tgg.runtime.AbstractRule <em>Abstract Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.moflon.tgg.runtime.AbstractRule
	 * @generated
	 */
	public Adapter createAbstractRuleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //RulesAdapterFactory
