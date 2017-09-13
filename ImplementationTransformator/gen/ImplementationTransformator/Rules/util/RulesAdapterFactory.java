/**
 */
package ImplementationTransformator.Rules.util;

import ImplementationTransformator.Rules.*;

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
 * @see ImplementationTransformator.Rules.RulesPackage
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
		public Adapter caseXContainerToContainerRule(XContainerToContainerRule object) {
			return createXContainerToContainerRuleAdapter();
		}

		@Override
		public Adapter caseXDuplexGlassFiberCableRule(XDuplexGlassFiberCableRule object) {
			return createXDuplexGlassFiberCableRuleAdapter();
		}

		@Override
		public Adapter caseXComputerToComputer(XComputerToComputer object) {
			return createXComputerToComputerAdapter();
		}

		@Override
		public Adapter caseXSimplexGlassFiberCableRule(XSimplexGlassFiberCableRule object) {
			return createXSimplexGlassFiberCableRuleAdapter();
		}

		@Override
		public Adapter caseXSimplexConnectionToConnectionRule(XSimplexConnectionToConnectionRule object) {
			return createXSimplexConnectionToConnectionRuleAdapter();
		}

		@Override
		public Adapter caseXSimplexCopperCableRule(XSimplexCopperCableRule object) {
			return createXSimplexCopperCableRuleAdapter();
		}

		@Override
		public Adapter caseXDuplexCopperCableRule(XDuplexCopperCableRule object) {
			return createXDuplexCopperCableRuleAdapter();
		}

		@Override
		public Adapter caseXServerToServer(XServerToServer object) {
			return createXServerToServerAdapter();
		}

		@Override
		public Adapter caseXDuplexConnectionToConnectionRule(XDuplexConnectionToConnectionRule object) {
			return createXDuplexConnectionToConnectionRuleAdapter();
		}

		@Override
		public Adapter caseXRouterToRouterRule(XRouterToRouterRule object) {
			return createXRouterToRouterRuleAdapter();
		}

		@Override
		public Adapter caseXDuplexCableToCablesRule(XDuplexCableToCablesRule object) {
			return createXDuplexCableToCablesRuleAdapter();
		}

		@Override
		public Adapter caseXSimplexCableToCableRule(XSimplexCableToCableRule object) {
			return createXSimplexCableToCableRuleAdapter();
		}

		@Override
		public Adapter caseXDeviceToDeviceRule(XDeviceToDeviceRule object) {
			return createXDeviceToDeviceRuleAdapter();
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
	 * Creates a new adapter for an object of class '{@link ImplementationTransformator.Rules.XContainerToContainerRule <em>XContainer To Container Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ImplementationTransformator.Rules.XContainerToContainerRule
	 * @generated
	 */
	public Adapter createXContainerToContainerRuleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ImplementationTransformator.Rules.XDuplexGlassFiberCableRule <em>XDuplex Glass Fiber Cable Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ImplementationTransformator.Rules.XDuplexGlassFiberCableRule
	 * @generated
	 */
	public Adapter createXDuplexGlassFiberCableRuleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ImplementationTransformator.Rules.XComputerToComputer <em>XComputer To Computer</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ImplementationTransformator.Rules.XComputerToComputer
	 * @generated
	 */
	public Adapter createXComputerToComputerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ImplementationTransformator.Rules.XSimplexGlassFiberCableRule <em>XSimplex Glass Fiber Cable Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ImplementationTransformator.Rules.XSimplexGlassFiberCableRule
	 * @generated
	 */
	public Adapter createXSimplexGlassFiberCableRuleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ImplementationTransformator.Rules.XSimplexConnectionToConnectionRule <em>XSimplex Connection To Connection Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ImplementationTransformator.Rules.XSimplexConnectionToConnectionRule
	 * @generated
	 */
	public Adapter createXSimplexConnectionToConnectionRuleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ImplementationTransformator.Rules.XSimplexCopperCableRule <em>XSimplex Copper Cable Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ImplementationTransformator.Rules.XSimplexCopperCableRule
	 * @generated
	 */
	public Adapter createXSimplexCopperCableRuleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ImplementationTransformator.Rules.XDuplexCopperCableRule <em>XDuplex Copper Cable Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ImplementationTransformator.Rules.XDuplexCopperCableRule
	 * @generated
	 */
	public Adapter createXDuplexCopperCableRuleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ImplementationTransformator.Rules.XServerToServer <em>XServer To Server</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ImplementationTransformator.Rules.XServerToServer
	 * @generated
	 */
	public Adapter createXServerToServerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ImplementationTransformator.Rules.XDuplexConnectionToConnectionRule <em>XDuplex Connection To Connection Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ImplementationTransformator.Rules.XDuplexConnectionToConnectionRule
	 * @generated
	 */
	public Adapter createXDuplexConnectionToConnectionRuleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ImplementationTransformator.Rules.XRouterToRouterRule <em>XRouter To Router Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ImplementationTransformator.Rules.XRouterToRouterRule
	 * @generated
	 */
	public Adapter createXRouterToRouterRuleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ImplementationTransformator.Rules.XDuplexCableToCablesRule <em>XDuplex Cable To Cables Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ImplementationTransformator.Rules.XDuplexCableToCablesRule
	 * @generated
	 */
	public Adapter createXDuplexCableToCablesRuleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ImplementationTransformator.Rules.XSimplexCableToCableRule <em>XSimplex Cable To Cable Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ImplementationTransformator.Rules.XSimplexCableToCableRule
	 * @generated
	 */
	public Adapter createXSimplexCableToCableRuleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ImplementationTransformator.Rules.XDeviceToDeviceRule <em>XDevice To Device Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ImplementationTransformator.Rules.XDeviceToDeviceRule
	 * @generated
	 */
	public Adapter createXDeviceToDeviceRuleAdapter() {
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
