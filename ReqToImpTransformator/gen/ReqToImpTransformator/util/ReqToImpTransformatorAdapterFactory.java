/**
 */
package ReqToImpTransformator.util;

import ReqToImpTransformator.*;

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
 * @see ReqToImpTransformator.ReqToImpTransformatorPackage
 * @generated
 */
public class ReqToImpTransformatorAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static ReqToImpTransformatorPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReqToImpTransformatorAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = ReqToImpTransformatorPackage.eINSTANCE;
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
	protected ReqToImpTransformatorSwitch<Adapter> modelSwitch = new ReqToImpTransformatorSwitch<Adapter>() {
		@Override
		public Adapter caseVirtualNodeToRouter(VirtualNodeToRouter object) {
			return createVirtualNodeToRouterAdapter();
		}

		@Override
		public Adapter caseReqAgentToImplDevice(ReqAgentToImplDevice object) {
			return createReqAgentToImplDeviceAdapter();
		}

		@Override
		public Adapter caseVirtualNodeToComputer(VirtualNodeToComputer object) {
			return createVirtualNodeToComputerAdapter();
		}

		@Override
		public Adapter caseReqContainerToImplContainer(ReqContainerToImplContainer object) {
			return createReqContainerToImplContainerAdapter();
		}

		@Override
		public Adapter caseVirtualNodeToServer(VirtualNodeToServer object) {
			return createVirtualNodeToServerAdapter();
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
	 * Creates a new adapter for an object of class '{@link ReqToImpTransformator.VirtualNodeToRouter <em>Virtual Node To Router</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ReqToImpTransformator.VirtualNodeToRouter
	 * @generated
	 */
	public Adapter createVirtualNodeToRouterAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ReqToImpTransformator.ReqAgentToImplDevice <em>Req Agent To Impl Device</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ReqToImpTransformator.ReqAgentToImplDevice
	 * @generated
	 */
	public Adapter createReqAgentToImplDeviceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ReqToImpTransformator.VirtualNodeToComputer <em>Virtual Node To Computer</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ReqToImpTransformator.VirtualNodeToComputer
	 * @generated
	 */
	public Adapter createVirtualNodeToComputerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ReqToImpTransformator.ReqContainerToImplContainer <em>Req Container To Impl Container</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ReqToImpTransformator.ReqContainerToImplContainer
	 * @generated
	 */
	public Adapter createReqContainerToImplContainerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ReqToImpTransformator.VirtualNodeToServer <em>Virtual Node To Server</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ReqToImpTransformator.VirtualNodeToServer
	 * @generated
	 */
	public Adapter createVirtualNodeToServerAdapter() {
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

} //ReqToImpTransformatorAdapterFactory
