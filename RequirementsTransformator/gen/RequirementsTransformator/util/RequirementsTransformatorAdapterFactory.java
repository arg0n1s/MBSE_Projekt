/**
 */
package RequirementsTransformator.util;

import RequirementsTransformator.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import org.moflon.tgg.runtime.AbstractCorrespondence;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see RequirementsTransformator.RequirementsTransformatorPackage
 * @generated
 */
public class RequirementsTransformatorAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static RequirementsTransformatorPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RequirementsTransformatorAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = RequirementsTransformatorPackage.eINSTANCE;
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
	protected RequirementsTransformatorSwitch<Adapter> modelSwitch = new RequirementsTransformatorSwitch<Adapter>() {
		@Override
		public Adapter caseXContainerToContainer(XContainerToContainer object) {
			return createXContainerToContainerAdapter();
		}

		@Override
		public Adapter caseXProviderToProvider(XProviderToProvider object) {
			return createXProviderToProviderAdapter();
		}

		@Override
		public Adapter caseXConsumerToConsumer(XConsumerToConsumer object) {
			return createXConsumerToConsumerAdapter();
		}

		@Override
		public Adapter caseXAgentToAgent(XAgentToAgent object) {
			return createXAgentToAgentAdapter();
		}

		@Override
		public Adapter caseAbstractCorrespondence(AbstractCorrespondence object) {
			return createAbstractCorrespondenceAdapter();
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
	 * Creates a new adapter for an object of class '{@link RequirementsTransformator.XContainerToContainer <em>XContainer To Container</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see RequirementsTransformator.XContainerToContainer
	 * @generated
	 */
	public Adapter createXContainerToContainerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link RequirementsTransformator.XProviderToProvider <em>XProvider To Provider</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see RequirementsTransformator.XProviderToProvider
	 * @generated
	 */
	public Adapter createXProviderToProviderAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link RequirementsTransformator.XConsumerToConsumer <em>XConsumer To Consumer</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see RequirementsTransformator.XConsumerToConsumer
	 * @generated
	 */
	public Adapter createXConsumerToConsumerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link RequirementsTransformator.XAgentToAgent <em>XAgent To Agent</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see RequirementsTransformator.XAgentToAgent
	 * @generated
	 */
	public Adapter createXAgentToAgentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.moflon.tgg.runtime.AbstractCorrespondence <em>Abstract Correspondence</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.moflon.tgg.runtime.AbstractCorrespondence
	 * @generated
	 */
	public Adapter createAbstractCorrespondenceAdapter() {
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

} //RequirementsTransformatorAdapterFactory
