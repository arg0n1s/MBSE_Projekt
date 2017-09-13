/**
 */
package ReqToImpTransformator.Rules.impl;

import ReqToImpTransformator.ReqContainerToImplContainer;
import ReqToImpTransformator.ReqToImpTransformatorFactory;

import ReqToImpTransformator.Rules.RulesPackage;
import ReqToImpTransformator.Rules.VirtualNodeToServerRule;

import ReqToImpTransformator.VirtualNodeToRouter;
import ReqToImpTransformator.VirtualNodeToServer;

import implementation.Cable;
import implementation.Device;
import implementation.ImplementationFactory;
import implementation.Router;
import implementation.Server;

import java.lang.Iterable;

import java.lang.reflect.InvocationTargetException;

import java.util.LinkedList;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EOperation;

import org.moflon.tgg.language.csp.CSP;

import org.moflon.tgg.language.modelgenerator.RuleEntryContainer;
import org.moflon.tgg.language.modelgenerator.RuleEntryList;

import org.moflon.tgg.runtime.AttributeConstraintsRuleResult;
import org.moflon.tgg.runtime.CCMatch;
import org.moflon.tgg.runtime.EMoflonEdge;
import org.moflon.tgg.runtime.EObjectContainer;
import org.moflon.tgg.runtime.IsApplicableMatch;
import org.moflon.tgg.runtime.IsApplicableRuleResult;
import org.moflon.tgg.runtime.Match;
import org.moflon.tgg.runtime.ModelgeneratorRuleResult;
import org.moflon.tgg.runtime.PerformRuleResult;
import org.moflon.tgg.runtime.RuntimeFactory;
import org.moflon.tgg.runtime.TripleMatch;

import org.moflon.tgg.runtime.impl.AbstractRuleImpl;

import requirements.Container;
import requirements.NetworkSpan;
// <-- [user defined imports]
import org.moflon.tgg.csp.*;
import ReqToImpTransformator.csp.constraints.*;
import org.moflon.tgg.csp.constraints.*;
import org.moflon.tgg.language.csp.*;
import org.moflon.tgg.runtime.TripleMatchNodeMapping;
import java.util.Optional;
import org.moflon.tgg.algorithm.delta.attribute.CheckAttributeHelper;
import SDMLanguage.expressions.ComparingOperator;
import org.moflon.tgg.runtime.TripleMatchNodeMapping;
import java.util.Optional;
import org.moflon.tgg.algorithm.delta.attribute.CheckAttributeHelper;
import SDMLanguage.expressions.ComparingOperator;
// [user defined imports] -->

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Virtual Node To Server Rule</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class VirtualNodeToServerRuleImpl extends AbstractRuleImpl implements VirtualNodeToServerRule {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VirtualNodeToServerRuleImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RulesPackage.eINSTANCE.getVirtualNodeToServerRule();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAppropriate_FWD(Match match, NetworkSpan virtualNode, Container reqContainer) {

		Object[] result1_black = VirtualNodeToServerRuleImpl
				.pattern_VirtualNodeToServerRule_0_1_initialbindings_blackBBBB(this, match, virtualNode, reqContainer);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[match] = " + match + ", " + "[virtualNode] = " + virtualNode + ", " + "[reqContainer] = "
					+ reqContainer + ".");
		}

		Object[] result2_bindingAndBlack = VirtualNodeToServerRuleImpl
				.pattern_VirtualNodeToServerRule_0_2_SolveCSP_bindingAndBlackFBBBB(this, match, virtualNode,
						reqContainer);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[match] = " + match + ", " + "[virtualNode] = " + virtualNode + ", " + "[reqContainer] = "
					+ reqContainer + ".");
		}
		CSP csp = (CSP) result2_bindingAndBlack[0];
		// 
		if (VirtualNodeToServerRuleImpl.pattern_VirtualNodeToServerRule_0_3_CheckCSP_expressionFBB(this, csp)) {

			Object[] result4_black = VirtualNodeToServerRuleImpl
					.pattern_VirtualNodeToServerRule_0_4_collectelementstobetranslated_blackBBB(match, virtualNode,
							reqContainer);
			if (result4_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match + ", "
						+ "[virtualNode] = " + virtualNode + ", " + "[reqContainer] = " + reqContainer + ".");
			}

			Object[] result5_black = VirtualNodeToServerRuleImpl
					.pattern_VirtualNodeToServerRule_0_5_collectcontextelements_blackBBB(match, virtualNode,
							reqContainer);
			if (result5_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match + ", "
						+ "[virtualNode] = " + virtualNode + ", " + "[reqContainer] = " + reqContainer + ".");
			}
			VirtualNodeToServerRuleImpl.pattern_VirtualNodeToServerRule_0_5_collectcontextelements_greenBBBF(match,
					virtualNode, reqContainer);
			//nothing EMoflonEdge reqContainer__virtualNode____networkSpan = (EMoflonEdge) result5_green[3];

			// 
			VirtualNodeToServerRuleImpl.pattern_VirtualNodeToServerRule_0_6_registerobjectstomatch_expressionBBBB(this,
					match, virtualNode, reqContainer);
			return VirtualNodeToServerRuleImpl.pattern_VirtualNodeToServerRule_0_7_expressionF();
		} else {
			return VirtualNodeToServerRuleImpl.pattern_VirtualNodeToServerRule_0_8_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PerformRuleResult perform_FWD(IsApplicableMatch isApplicableMatch) {
		// [user code injected with eMoflon]

		// TODO: implement this method here but do not remove the injection marker 
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IsApplicableRuleResult isApplicable_FWD(Match match) {
		// [user code injected with eMoflon]

		// TODO: implement this method here but do not remove the injection marker 
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void registerObjectsToMatch_FWD(Match match, NetworkSpan virtualNode, Container reqContainer) {
		match.registerObject("virtualNode", virtualNode);
		match.registerObject("reqContainer", reqContainer);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isAppropriate_solveCsp_FWD(Match match, NetworkSpan virtualNode, Container reqContainer) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();

		// Create literals

		// Create attribute variables

		// Create unbound variables

		// Create constraints

		// Solve CSP
		return csp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAppropriate_checkCsp_FWD(CSP csp) {
		return csp.check();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean checkTypes_FWD(Match match) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAppropriate_BWD(Match match, Router router, implementation.Container implContainer, Cable cable,
			Server server) {

		Object[] result1_black = VirtualNodeToServerRuleImpl
				.pattern_VirtualNodeToServerRule_7_1_initialbindings_blackBBBBBB(this, match, router, implContainer,
						cable, server);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[match] = " + match + ", " + "[router] = " + router + ", " + "[implContainer] = " + implContainer
					+ ", " + "[cable] = " + cable + ", " + "[server] = " + server + ".");
		}

		Object[] result2_bindingAndBlack = VirtualNodeToServerRuleImpl
				.pattern_VirtualNodeToServerRule_7_2_SolveCSP_bindingAndBlackFBBBBBB(this, match, router, implContainer,
						cable, server);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[match] = " + match + ", " + "[router] = " + router + ", " + "[implContainer] = " + implContainer
					+ ", " + "[cable] = " + cable + ", " + "[server] = " + server + ".");
		}
		CSP csp = (CSP) result2_bindingAndBlack[0];
		// 
		if (VirtualNodeToServerRuleImpl.pattern_VirtualNodeToServerRule_7_3_CheckCSP_expressionFBB(this, csp)) {

			Object[] result4_black = VirtualNodeToServerRuleImpl
					.pattern_VirtualNodeToServerRule_7_4_collectelementstobetranslated_blackBBBBB(match, router,
							implContainer, cable, server);
			if (result4_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match + ", "
						+ "[router] = " + router + ", " + "[implContainer] = " + implContainer + ", " + "[cable] = "
						+ cable + ", " + "[server] = " + server + ".");
			}
			VirtualNodeToServerRuleImpl
					.pattern_VirtualNodeToServerRule_7_4_collectelementstobetranslated_greenBBBBBFFFFF(match, router,
							implContainer, cable, server);
			//nothing EMoflonEdge router__cable____incoming = (EMoflonEdge) result4_green[5];
			//nothing EMoflonEdge cable__router____target = (EMoflonEdge) result4_green[6];
			//nothing EMoflonEdge implContainer__server____devices = (EMoflonEdge) result4_green[7];
			//nothing EMoflonEdge server__cable____outgoing = (EMoflonEdge) result4_green[8];
			//nothing EMoflonEdge cable__server____source = (EMoflonEdge) result4_green[9];

			Object[] result5_black = VirtualNodeToServerRuleImpl
					.pattern_VirtualNodeToServerRule_7_5_collectcontextelements_blackBBBBB(match, router, implContainer,
							cable, server);
			if (result5_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match + ", "
						+ "[router] = " + router + ", " + "[implContainer] = " + implContainer + ", " + "[cable] = "
						+ cable + ", " + "[server] = " + server + ".");
			}
			VirtualNodeToServerRuleImpl.pattern_VirtualNodeToServerRule_7_5_collectcontextelements_greenBBBBFF(match,
					router, implContainer, cable);
			//nothing EMoflonEdge implContainer__router____devices = (EMoflonEdge) result5_green[4];
			//nothing EMoflonEdge implContainer__cable____cables = (EMoflonEdge) result5_green[5];

			// 
			VirtualNodeToServerRuleImpl.pattern_VirtualNodeToServerRule_7_6_registerobjectstomatch_expressionBBBBBB(
					this, match, router, implContainer, cable, server);
			return VirtualNodeToServerRuleImpl.pattern_VirtualNodeToServerRule_7_7_expressionF();
		} else {
			return VirtualNodeToServerRuleImpl.pattern_VirtualNodeToServerRule_7_8_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PerformRuleResult perform_BWD(IsApplicableMatch isApplicableMatch) {

		Object[] result1_bindingAndBlack = VirtualNodeToServerRuleImpl
				.pattern_VirtualNodeToServerRule_8_1_performtransformation_bindingAndBlackFFFFFFFFFBB(this,
						isApplicableMatch);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[isApplicableMatch] = " + isApplicableMatch + ".");
		}
		Router router = (Router) result1_bindingAndBlack[0];
		VirtualNodeToRouter virtualNodeToRouter = (VirtualNodeToRouter) result1_bindingAndBlack[1];
		implementation.Container implContainer = (implementation.Container) result1_bindingAndBlack[2];
		NetworkSpan virtualNode = (NetworkSpan) result1_bindingAndBlack[3];
		Cable cable = (Cable) result1_bindingAndBlack[4];
		Server server = (Server) result1_bindingAndBlack[5];
		Container reqContainer = (Container) result1_bindingAndBlack[6];
		ReqContainerToImplContainer reqContainerToImplContainer = (ReqContainerToImplContainer) result1_bindingAndBlack[7];
		//nothing CSP csp = (CSP) result1_bindingAndBlack[8];
		Object[] result1_green = VirtualNodeToServerRuleImpl
				.pattern_VirtualNodeToServerRule_8_1_performtransformation_greenFBB(virtualNode, server);
		VirtualNodeToServer virtualNodeToServer = (VirtualNodeToServer) result1_green[0];

		Object[] result2_black = VirtualNodeToServerRuleImpl
				.pattern_VirtualNodeToServerRule_8_2_collecttranslatedelements_blackBB(virtualNodeToServer, server);
		if (result2_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[virtualNodeToServer] = "
					+ virtualNodeToServer + ", " + "[server] = " + server + ".");
		}
		Object[] result2_green = VirtualNodeToServerRuleImpl
				.pattern_VirtualNodeToServerRule_8_2_collecttranslatedelements_greenFBB(virtualNodeToServer, server);
		PerformRuleResult ruleresult = (PerformRuleResult) result2_green[0];

		Object[] result3_black = VirtualNodeToServerRuleImpl
				.pattern_VirtualNodeToServerRule_8_3_bookkeepingforedges_blackBBBBBBBBBB(ruleresult, router,
						virtualNodeToRouter, implContainer, virtualNodeToServer, virtualNode, cable, server,
						reqContainer, reqContainerToImplContainer);
		if (result3_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[ruleresult] = " + ruleresult
					+ ", " + "[router] = " + router + ", " + "[virtualNodeToRouter] = " + virtualNodeToRouter + ", "
					+ "[implContainer] = " + implContainer + ", " + "[virtualNodeToServer] = " + virtualNodeToServer
					+ ", " + "[virtualNode] = " + virtualNode + ", " + "[cable] = " + cable + ", " + "[server] = "
					+ server + ", " + "[reqContainer] = " + reqContainer + ", " + "[reqContainerToImplContainer] = "
					+ reqContainerToImplContainer + ".");
		}
		VirtualNodeToServerRuleImpl.pattern_VirtualNodeToServerRule_8_3_bookkeepingforedges_greenBBBBBBBFFFFFFF(
				ruleresult, router, implContainer, virtualNodeToServer, virtualNode, cable, server);
		//nothing EMoflonEdge router__cable____incoming = (EMoflonEdge) result3_green[7];
		//nothing EMoflonEdge cable__router____target = (EMoflonEdge) result3_green[8];
		//nothing EMoflonEdge virtualNodeToServer__virtualNode____source = (EMoflonEdge) result3_green[9];
		//nothing EMoflonEdge implContainer__server____devices = (EMoflonEdge) result3_green[10];
		//nothing EMoflonEdge virtualNodeToServer__server____target = (EMoflonEdge) result3_green[11];
		//nothing EMoflonEdge server__cable____outgoing = (EMoflonEdge) result3_green[12];
		//nothing EMoflonEdge cable__server____source = (EMoflonEdge) result3_green[13];

		// 
		// 
		VirtualNodeToServerRuleImpl.pattern_VirtualNodeToServerRule_8_5_registerobjects_expressionBBBBBBBBBBB(this,
				ruleresult, router, virtualNodeToRouter, implContainer, virtualNodeToServer, virtualNode, cable, server,
				reqContainer, reqContainerToImplContainer);
		return VirtualNodeToServerRuleImpl.pattern_VirtualNodeToServerRule_8_6_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IsApplicableRuleResult isApplicable_BWD(Match match) {

		Object[] result1_bindingAndBlack = VirtualNodeToServerRuleImpl
				.pattern_VirtualNodeToServerRule_9_1_preparereturnvalue_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		EOperation performOperation = (EOperation) result1_bindingAndBlack[0];
		//nothing EClass eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = VirtualNodeToServerRuleImpl
				.pattern_VirtualNodeToServerRule_9_1_preparereturnvalue_greenBF(performOperation);
		IsApplicableRuleResult ruleresult = (IsApplicableRuleResult) result1_green[1];

		// ForEach 
		Object[] result2_binding = VirtualNodeToServerRuleImpl
				.pattern_VirtualNodeToServerRule_9_2_corematch_bindingFFFFB(match);
		if (result2_binding == null) {
			throw new RuntimeException(
					"Binding in node core match failed." + " Variables: " + "[match] = " + match + ".");
		}
		Router router = (Router) result2_binding[0];
		implementation.Container implContainer = (implementation.Container) result2_binding[1];
		Cable cable = (Cable) result2_binding[2];
		Server server = (Server) result2_binding[3];
		for (Object[] result2_black : VirtualNodeToServerRuleImpl
				.pattern_VirtualNodeToServerRule_9_2_corematch_blackBFBFBBFFB(router, implContainer, cable, server,
						match)) {
			VirtualNodeToRouter virtualNodeToRouter = (VirtualNodeToRouter) result2_black[1];
			NetworkSpan virtualNode = (NetworkSpan) result2_black[3];
			Container reqContainer = (Container) result2_black[6];
			ReqContainerToImplContainer reqContainerToImplContainer = (ReqContainerToImplContainer) result2_black[7];
			// ForEach 
			for (Object[] result3_black : VirtualNodeToServerRuleImpl
					.pattern_VirtualNodeToServerRule_9_3_findcontext_blackBBBBBBBB(router, virtualNodeToRouter,
							implContainer, virtualNode, cable, server, reqContainer, reqContainerToImplContainer)) {
				Object[] result3_green = VirtualNodeToServerRuleImpl
						.pattern_VirtualNodeToServerRule_9_3_findcontext_greenBBBBBBBBFFFFFFFFFFFFF(router,
								virtualNodeToRouter, implContainer, virtualNode, cable, server, reqContainer,
								reqContainerToImplContainer);
				IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result3_green[8];
				//nothing EMoflonEdge router__cable____incoming = (EMoflonEdge) result3_green[9];
				//nothing EMoflonEdge cable__router____target = (EMoflonEdge) result3_green[10];
				//nothing EMoflonEdge implContainer__router____devices = (EMoflonEdge) result3_green[11];
				//nothing EMoflonEdge virtualNodeToRouter__virtualNode____source = (EMoflonEdge) result3_green[12];
				//nothing EMoflonEdge virtualNodeToRouter__router____target = (EMoflonEdge) result3_green[13];
				//nothing EMoflonEdge implContainer__server____devices = (EMoflonEdge) result3_green[14];
				//nothing EMoflonEdge implContainer__cable____cables = (EMoflonEdge) result3_green[15];
				//nothing EMoflonEdge reqContainer__virtualNode____networkSpan = (EMoflonEdge) result3_green[16];
				//nothing EMoflonEdge server__cable____outgoing = (EMoflonEdge) result3_green[17];
				//nothing EMoflonEdge cable__server____source = (EMoflonEdge) result3_green[18];
				//nothing EMoflonEdge reqContainerToImplContainer__reqContainer____source = (EMoflonEdge) result3_green[19];
				//nothing EMoflonEdge reqContainerToImplContainer__implContainer____target = (EMoflonEdge) result3_green[20];

				Object[] result4_bindingAndBlack = VirtualNodeToServerRuleImpl
						.pattern_VirtualNodeToServerRule_9_4_solveCSP_bindingAndBlackFBBBBBBBBBB(this,
								isApplicableMatch, router, virtualNodeToRouter, implContainer, virtualNode, cable,
								server, reqContainer, reqContainerToImplContainer);
				if (result4_bindingAndBlack == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
							+ "[isApplicableMatch] = " + isApplicableMatch + ", " + "[router] = " + router + ", "
							+ "[virtualNodeToRouter] = " + virtualNodeToRouter + ", " + "[implContainer] = "
							+ implContainer + ", " + "[virtualNode] = " + virtualNode + ", " + "[cable] = " + cable
							+ ", " + "[server] = " + server + ", " + "[reqContainer] = " + reqContainer + ", "
							+ "[reqContainerToImplContainer] = " + reqContainerToImplContainer + ".");
				}
				CSP csp = (CSP) result4_bindingAndBlack[0];
				// 
				if (VirtualNodeToServerRuleImpl.pattern_VirtualNodeToServerRule_9_5_checkCSP_expressionFBB(this, csp)) {

					Object[] result6_black = VirtualNodeToServerRuleImpl
							.pattern_VirtualNodeToServerRule_9_6_addmatchtoruleresult_blackBB(ruleresult,
									isApplicableMatch);
					if (result6_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[ruleresult] = "
								+ ruleresult + ", " + "[isApplicableMatch] = " + isApplicableMatch + ".");
					}
					VirtualNodeToServerRuleImpl.pattern_VirtualNodeToServerRule_9_6_addmatchtoruleresult_greenBB(
							ruleresult, isApplicableMatch);

				} else {
				}

			}

		}
		return VirtualNodeToServerRuleImpl.pattern_VirtualNodeToServerRule_9_7_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void registerObjectsToMatch_BWD(Match match, Router router, implementation.Container implContainer,
			Cable cable, Server server) {
		match.registerObject("router", router);
		match.registerObject("implContainer", implContainer);
		match.registerObject("cable", cable);
		match.registerObject("server", server);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isAppropriate_solveCsp_BWD(Match match, Router router, implementation.Container implContainer,
			Cable cable, Server server) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();

		// Create literals

		// Create attribute variables

		// Create unbound variables

		// Create constraints

		// Solve CSP
		return csp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAppropriate_checkCsp_BWD(CSP csp) {
		return csp.check();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isApplicable_solveCsp_BWD(IsApplicableMatch isApplicableMatch, Router router,
			VirtualNodeToRouter virtualNodeToRouter, implementation.Container implContainer, NetworkSpan virtualNode,
			Cable cable, Server server, Container reqContainer,
			ReqContainerToImplContainer reqContainerToImplContainer) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals

		// Create attribute variables

		// Create unbound variables

		// Create constraints

		// Solve CSP

		// Snapshot pattern match on which CSP is solved
		isApplicableMatch.registerObject("router", router);
		isApplicableMatch.registerObject("virtualNodeToRouter", virtualNodeToRouter);
		isApplicableMatch.registerObject("implContainer", implContainer);
		isApplicableMatch.registerObject("virtualNode", virtualNode);
		isApplicableMatch.registerObject("cable", cable);
		isApplicableMatch.registerObject("server", server);
		isApplicableMatch.registerObject("reqContainer", reqContainer);
		isApplicableMatch.registerObject("reqContainerToImplContainer", reqContainerToImplContainer);
		return csp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isApplicable_checkCsp_BWD(CSP csp) {
		return csp.check();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void registerObjects_BWD(PerformRuleResult ruleresult, EObject router, EObject virtualNodeToRouter,
			EObject implContainer, EObject virtualNodeToServer, EObject virtualNode, EObject cable, EObject server,
			EObject reqContainer, EObject reqContainerToImplContainer) {
		ruleresult.registerObject("router", router);
		ruleresult.registerObject("virtualNodeToRouter", virtualNodeToRouter);
		ruleresult.registerObject("implContainer", implContainer);
		ruleresult.registerObject("virtualNodeToServer", virtualNodeToServer);
		ruleresult.registerObject("virtualNode", virtualNode);
		ruleresult.registerObject("cable", cable);
		ruleresult.registerObject("server", server);
		ruleresult.registerObject("reqContainer", reqContainer);
		ruleresult.registerObject("reqContainerToImplContainer", reqContainerToImplContainer);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean checkTypes_BWD(Match match) {
		return true && org.moflon.util.eMoflonSDMUtil.getFQN(match.getObject("server").eClass())
				.equals("implementation.Server.");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_FWD_NetworkSpan_0(NetworkSpan virtualNode) {

		Object[] result1_bindingAndBlack = VirtualNodeToServerRuleImpl
				.pattern_VirtualNodeToServerRule_17_1_preparereturnvalue_bindingAndBlackFFBF(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		EOperation isApplicableCC = (EOperation) result1_bindingAndBlack[3];
		Object[] result1_green = VirtualNodeToServerRuleImpl
				.pattern_VirtualNodeToServerRule_17_1_preparereturnvalue_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach 
		for (Object[] result2_black : VirtualNodeToServerRuleImpl
				.pattern_VirtualNodeToServerRule_17_2_testcorematchandDECs_blackBF(virtualNode)) {
			Container reqContainer = (Container) result2_black[1];
			Object[] result2_green = VirtualNodeToServerRuleImpl
					.pattern_VirtualNodeToServerRule_17_2_testcorematchandDECs_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// 
			if (VirtualNodeToServerRuleImpl
					.pattern_VirtualNodeToServerRule_17_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBB(
							this, match, virtualNode, reqContainer)) {
				// 
				if (VirtualNodeToServerRuleImpl
						.pattern_VirtualNodeToServerRule_17_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(
								this, match)) {

					Object[] result5_black = VirtualNodeToServerRuleImpl
							.pattern_VirtualNodeToServerRule_17_5_Addmatchtoruleresult_blackBBBB(match,
									__performOperation, __result, isApplicableCC);
					if (result5_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match
								+ ", " + "[__performOperation] = " + __performOperation + ", " + "[__result] = "
								+ __result + ", " + "[isApplicableCC] = " + isApplicableCC + ".");
					}
					VirtualNodeToServerRuleImpl.pattern_VirtualNodeToServerRule_17_5_Addmatchtoruleresult_greenBBBB(
							match, __performOperation, __result, isApplicableCC);

				} else {
				}

			} else {
			}

		}
		return VirtualNodeToServerRuleImpl.pattern_VirtualNodeToServerRule_17_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_BWD_EMoflonEdge_2(EMoflonEdge _edge_incoming) {

		Object[] result1_bindingAndBlack = VirtualNodeToServerRuleImpl
				.pattern_VirtualNodeToServerRule_18_1_preparereturnvalue_bindingAndBlackFFBF(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		EOperation isApplicableCC = (EOperation) result1_bindingAndBlack[3];
		Object[] result1_green = VirtualNodeToServerRuleImpl
				.pattern_VirtualNodeToServerRule_18_1_preparereturnvalue_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach 
		for (Object[] result2_black : VirtualNodeToServerRuleImpl
				.pattern_VirtualNodeToServerRule_18_2_testcorematchandDECs_blackFFFFB(_edge_incoming)) {
			Router router = (Router) result2_black[0];
			implementation.Container implContainer = (implementation.Container) result2_black[1];
			Cable cable = (Cable) result2_black[2];
			Server server = (Server) result2_black[3];
			Object[] result2_green = VirtualNodeToServerRuleImpl
					.pattern_VirtualNodeToServerRule_18_2_testcorematchandDECs_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// 
			if (VirtualNodeToServerRuleImpl
					.pattern_VirtualNodeToServerRule_18_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBBBB(
							this, match, router, implContainer, cable, server)) {
				// 
				if (VirtualNodeToServerRuleImpl
						.pattern_VirtualNodeToServerRule_18_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(
								this, match)) {

					Object[] result5_black = VirtualNodeToServerRuleImpl
							.pattern_VirtualNodeToServerRule_18_5_Addmatchtoruleresult_blackBBBB(match,
									__performOperation, __result, isApplicableCC);
					if (result5_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match
								+ ", " + "[__performOperation] = " + __performOperation + ", " + "[__result] = "
								+ __result + ", " + "[isApplicableCC] = " + isApplicableCC + ".");
					}
					VirtualNodeToServerRuleImpl.pattern_VirtualNodeToServerRule_18_5_Addmatchtoruleresult_greenBBBB(
							match, __performOperation, __result, isApplicableCC);

				} else {
				}

			} else {
			}

		}
		return VirtualNodeToServerRuleImpl.pattern_VirtualNodeToServerRule_18_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AttributeConstraintsRuleResult checkAttributes_FWD(TripleMatch __tripleMatch) {
		AttributeConstraintsRuleResult ruleResult = org.moflon.tgg.runtime.RuntimeFactory.eINSTANCE
				.createAttributeConstraintsRuleResult();
		ruleResult.setRule("VirtualNodeToServerRule");
		ruleResult.setSuccess(true);

		CSP csp = CspFactory.eINSTANCE.createCSP();

		CheckAttributeHelper __helper = new CheckAttributeHelper(__tripleMatch);

		if (csp.check()) {
			ruleResult.setSuccess(true);
		} else {
			if (csp.check()) {
				ruleResult.setSuccess(true);
				ruleResult.setRequiredChange(true);
			} else {
				ruleResult.setSuccess(false);
				return ruleResult;
			}
		}

		return ruleResult;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AttributeConstraintsRuleResult checkAttributes_BWD(TripleMatch __tripleMatch) {
		AttributeConstraintsRuleResult ruleResult = org.moflon.tgg.runtime.RuntimeFactory.eINSTANCE
				.createAttributeConstraintsRuleResult();
		ruleResult.setRule("VirtualNodeToServerRule");
		ruleResult.setSuccess(true);

		CSP csp = CspFactory.eINSTANCE.createCSP();

		CheckAttributeHelper __helper = new CheckAttributeHelper(__tripleMatch);

		if (csp.check()) {
			ruleResult.setSuccess(true);
		} else {
			if (csp.check()) {
				ruleResult.setSuccess(true);
				ruleResult.setRequiredChange(true);
			} else {
				ruleResult.setSuccess(false);
				return ruleResult;
			}
		}

		return ruleResult;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IsApplicableRuleResult isApplicable_CC(Match sourceMatch, Match targetMatch) {

		Object[] result1_black = VirtualNodeToServerRuleImpl.pattern_VirtualNodeToServerRule_21_1_prepare_blackB(this);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		Object[] result1_green = VirtualNodeToServerRuleImpl.pattern_VirtualNodeToServerRule_21_1_prepare_greenF();
		IsApplicableRuleResult result = (IsApplicableRuleResult) result1_green[0];

		Object[] result2_bindingAndBlack = VirtualNodeToServerRuleImpl
				.pattern_VirtualNodeToServerRule_21_2_matchsrctrgcontext_bindingAndBlackFFFFFFBB(sourceMatch,
						targetMatch);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[sourceMatch] = " + sourceMatch
					+ ", " + "[targetMatch] = " + targetMatch + ".");
		}
		Router router = (Router) result2_bindingAndBlack[0];
		implementation.Container implContainer = (implementation.Container) result2_bindingAndBlack[1];
		NetworkSpan virtualNode = (NetworkSpan) result2_bindingAndBlack[2];
		Cable cable = (Cable) result2_bindingAndBlack[3];
		Server server = (Server) result2_bindingAndBlack[4];
		Container reqContainer = (Container) result2_bindingAndBlack[5];

		Object[] result3_bindingAndBlack = VirtualNodeToServerRuleImpl
				.pattern_VirtualNodeToServerRule_21_3_solvecsp_bindingAndBlackFBBBBBBBBB(this, router, implContainer,
						virtualNode, cable, server, reqContainer, sourceMatch, targetMatch);
		if (result3_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[router] = " + router + ", " + "[implContainer] = " + implContainer + ", " + "[virtualNode] = "
					+ virtualNode + ", " + "[cable] = " + cable + ", " + "[server] = " + server + ", "
					+ "[reqContainer] = " + reqContainer + ", " + "[sourceMatch] = " + sourceMatch + ", "
					+ "[targetMatch] = " + targetMatch + ".");
		}
		CSP csp = (CSP) result3_bindingAndBlack[0];
		// 
		if (VirtualNodeToServerRuleImpl.pattern_VirtualNodeToServerRule_21_4_checkCSP_expressionFB(csp)) {
			// ForEach 
			for (Object[] result5_black : VirtualNodeToServerRuleImpl
					.pattern_VirtualNodeToServerRule_21_5_matchcorrcontext_blackBFBBBFBB(router, implContainer,
							virtualNode, reqContainer, sourceMatch, targetMatch)) {
				VirtualNodeToRouter virtualNodeToRouter = (VirtualNodeToRouter) result5_black[1];
				ReqContainerToImplContainer reqContainerToImplContainer = (ReqContainerToImplContainer) result5_black[5];
				Object[] result5_green = VirtualNodeToServerRuleImpl
						.pattern_VirtualNodeToServerRule_21_5_matchcorrcontext_greenBBBBF(virtualNodeToRouter,
								reqContainerToImplContainer, sourceMatch, targetMatch);
				CCMatch ccMatch = (CCMatch) result5_green[4];

				Object[] result6_black = VirtualNodeToServerRuleImpl
						.pattern_VirtualNodeToServerRule_21_6_createcorrespondence_blackBBBBBBB(router, implContainer,
								virtualNode, cable, server, reqContainer, ccMatch);
				if (result6_black == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[router] = " + router
							+ ", " + "[implContainer] = " + implContainer + ", " + "[virtualNode] = " + virtualNode
							+ ", " + "[cable] = " + cable + ", " + "[server] = " + server + ", " + "[reqContainer] = "
							+ reqContainer + ", " + "[ccMatch] = " + ccMatch + ".");
				}
				VirtualNodeToServerRuleImpl.pattern_VirtualNodeToServerRule_21_6_createcorrespondence_greenFBBB(
						virtualNode, server, ccMatch);
				//nothing VirtualNodeToServer virtualNodeToServer = (VirtualNodeToServer) result6_green[0];

				Object[] result7_black = VirtualNodeToServerRuleImpl
						.pattern_VirtualNodeToServerRule_21_7_addtoreturnedresult_blackBB(result, ccMatch);
				if (result7_black == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[result] = " + result
							+ ", " + "[ccMatch] = " + ccMatch + ".");
				}
				VirtualNodeToServerRuleImpl.pattern_VirtualNodeToServerRule_21_7_addtoreturnedresult_greenBB(result,
						ccMatch);

			}

		} else {
		}
		return VirtualNodeToServerRuleImpl.pattern_VirtualNodeToServerRule_21_8_expressionFB(result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isApplicable_solveCsp_CC(Router router, implementation.Container implContainer, NetworkSpan virtualNode,
			Cable cable, Server server, Container reqContainer, Match sourceMatch, Match targetMatch) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();

		// Create literals

		// Create attribute variables

		// Create unbound variables

		// Create constraints

		// Solve CSP
		return csp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isApplicable_checkCsp_CC(CSP csp) {
		return csp.check();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean checkDEC_FWD(NetworkSpan virtualNode, Container reqContainer) {// 
		Object[] result1_black = VirtualNodeToServerRuleImpl
				.pattern_VirtualNodeToServerRule_24_1_matchtggpattern_blackBB(virtualNode, reqContainer);
		if (result1_black != null) {
			return VirtualNodeToServerRuleImpl.pattern_VirtualNodeToServerRule_24_2_expressionF();
		} else {
			return VirtualNodeToServerRuleImpl.pattern_VirtualNodeToServerRule_24_3_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean checkDEC_BWD(Router router, implementation.Container implContainer, Cable cable, Server server) {// 
		Object[] result1_black = VirtualNodeToServerRuleImpl
				.pattern_VirtualNodeToServerRule_25_1_matchtggpattern_blackBBBB(router, implContainer, cable, server);
		if (result1_black != null) {
			return VirtualNodeToServerRuleImpl.pattern_VirtualNodeToServerRule_25_2_expressionF();
		} else {
			return VirtualNodeToServerRuleImpl.pattern_VirtualNodeToServerRule_25_3_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModelgeneratorRuleResult generateModel(RuleEntryContainer ruleEntryContainer,
			VirtualNodeToRouter virtualNodeToRouterParameter) {

		Object[] result1_black = VirtualNodeToServerRuleImpl
				.pattern_VirtualNodeToServerRule_26_1_createresult_blackB(this);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		Object[] result1_green = VirtualNodeToServerRuleImpl
				.pattern_VirtualNodeToServerRule_26_1_createresult_greenFF();
		IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result1_green[0];
		ModelgeneratorRuleResult ruleResult = (ModelgeneratorRuleResult) result1_green[1];

		// ForEach 
		for (Object[] result2_black : VirtualNodeToServerRuleImpl
				.pattern_VirtualNodeToServerRule_26_2_isapplicablecore_blackFFFFFFFFBB(ruleEntryContainer,
						ruleResult)) {
			//nothing RuleEntryList virtualNodeToRouterList = (RuleEntryList) result2_black[0];
			Router router = (Router) result2_black[1];
			VirtualNodeToRouter virtualNodeToRouter = (VirtualNodeToRouter) result2_black[2];
			NetworkSpan virtualNode = (NetworkSpan) result2_black[3];
			Container reqContainer = (Container) result2_black[4];
			ReqContainerToImplContainer reqContainerToImplContainer = (ReqContainerToImplContainer) result2_black[5];
			implementation.Container implContainer = (implementation.Container) result2_black[6];
			Cable cable = (Cable) result2_black[7];

			Object[] result3_bindingAndBlack = VirtualNodeToServerRuleImpl
					.pattern_VirtualNodeToServerRule_26_3_solveCSP_bindingAndBlackFBBBBBBBBBB(this, isApplicableMatch,
							router, virtualNodeToRouter, implContainer, virtualNode, cable, reqContainer,
							reqContainerToImplContainer, ruleResult);
			if (result3_bindingAndBlack == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
						+ "[isApplicableMatch] = " + isApplicableMatch + ", " + "[router] = " + router + ", "
						+ "[virtualNodeToRouter] = " + virtualNodeToRouter + ", " + "[implContainer] = " + implContainer
						+ ", " + "[virtualNode] = " + virtualNode + ", " + "[cable] = " + cable + ", "
						+ "[reqContainer] = " + reqContainer + ", " + "[reqContainerToImplContainer] = "
						+ reqContainerToImplContainer + ", " + "[ruleResult] = " + ruleResult + ".");
			}
			CSP csp = (CSP) result3_bindingAndBlack[0];
			// 
			if (VirtualNodeToServerRuleImpl.pattern_VirtualNodeToServerRule_26_4_checkCSP_expressionFBB(this, csp)) {
				// 
				Object[] result5_black = VirtualNodeToServerRuleImpl
						.pattern_VirtualNodeToServerRule_26_5_checknacs_blackBBBBBBB(router, virtualNodeToRouter,
								implContainer, virtualNode, cable, reqContainer, reqContainerToImplContainer);
				if (result5_black != null) {

					Object[] result6_black = VirtualNodeToServerRuleImpl
							.pattern_VirtualNodeToServerRule_26_6_perform_blackBBBBBBBB(router, virtualNodeToRouter,
									implContainer, virtualNode, cable, reqContainer, reqContainerToImplContainer,
									ruleResult);
					if (result6_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[router] = " + router
								+ ", " + "[virtualNodeToRouter] = " + virtualNodeToRouter + ", " + "[implContainer] = "
								+ implContainer + ", " + "[virtualNode] = " + virtualNode + ", " + "[cable] = " + cable
								+ ", " + "[reqContainer] = " + reqContainer + ", " + "[reqContainerToImplContainer] = "
								+ reqContainerToImplContainer + ", " + "[ruleResult] = " + ruleResult + ".");
					}
					VirtualNodeToServerRuleImpl.pattern_VirtualNodeToServerRule_26_6_perform_greenBBFBBFB(router,
							implContainer, virtualNode, cable, ruleResult);
					//nothing VirtualNodeToServer virtualNodeToServer = (VirtualNodeToServer) result6_green[2];
					//nothing Server server = (Server) result6_green[5];

				} else {
				}

			} else {
			}

		}
		return VirtualNodeToServerRuleImpl.pattern_VirtualNodeToServerRule_26_7_expressionFB(ruleResult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP generateModel_solveCsp_BWD(IsApplicableMatch isApplicableMatch, Router router,
			VirtualNodeToRouter virtualNodeToRouter, implementation.Container implContainer, NetworkSpan virtualNode,
			Cable cable, Container reqContainer, ReqContainerToImplContainer reqContainerToImplContainer,
			ModelgeneratorRuleResult ruleResult) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals

		// Create attribute variables

		// Create unbound variables

		// Create constraints

		// Solve CSP

		// Snapshot pattern match on which CSP is solved
		isApplicableMatch.registerObject("router", router);
		isApplicableMatch.registerObject("virtualNodeToRouter", virtualNodeToRouter);
		isApplicableMatch.registerObject("implContainer", implContainer);
		isApplicableMatch.registerObject("virtualNode", virtualNode);
		isApplicableMatch.registerObject("cable", cable);
		isApplicableMatch.registerObject("reqContainer", reqContainer);
		isApplicableMatch.registerObject("reqContainerToImplContainer", reqContainerToImplContainer);
		return csp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean generateModel_checkCsp_BWD(CSP csp) {
		return csp.check();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
		case RulesPackage.VIRTUAL_NODE_TO_SERVER_RULE___IS_APPROPRIATE_FWD__MATCH_NETWORKSPAN_CONTAINER:
			return isAppropriate_FWD((Match) arguments.get(0), (NetworkSpan) arguments.get(1),
					(Container) arguments.get(2));
		case RulesPackage.VIRTUAL_NODE_TO_SERVER_RULE___PERFORM_FWD__ISAPPLICABLEMATCH:
			return perform_FWD((IsApplicableMatch) arguments.get(0));
		case RulesPackage.VIRTUAL_NODE_TO_SERVER_RULE___IS_APPLICABLE_FWD__MATCH:
			return isApplicable_FWD((Match) arguments.get(0));
		case RulesPackage.VIRTUAL_NODE_TO_SERVER_RULE___REGISTER_OBJECTS_TO_MATCH_FWD__MATCH_NETWORKSPAN_CONTAINER:
			registerObjectsToMatch_FWD((Match) arguments.get(0), (NetworkSpan) arguments.get(1),
					(Container) arguments.get(2));
			return null;
		case RulesPackage.VIRTUAL_NODE_TO_SERVER_RULE___IS_APPROPRIATE_SOLVE_CSP_FWD__MATCH_NETWORKSPAN_CONTAINER:
			return isAppropriate_solveCsp_FWD((Match) arguments.get(0), (NetworkSpan) arguments.get(1),
					(Container) arguments.get(2));
		case RulesPackage.VIRTUAL_NODE_TO_SERVER_RULE___IS_APPROPRIATE_CHECK_CSP_FWD__CSP:
			return isAppropriate_checkCsp_FWD((CSP) arguments.get(0));
		case RulesPackage.VIRTUAL_NODE_TO_SERVER_RULE___CHECK_TYPES_FWD__MATCH:
			return checkTypes_FWD((Match) arguments.get(0));
		case RulesPackage.VIRTUAL_NODE_TO_SERVER_RULE___IS_APPROPRIATE_BWD__MATCH_ROUTER_CONTAINER_CABLE_SERVER:
			return isAppropriate_BWD((Match) arguments.get(0), (Router) arguments.get(1),
					(implementation.Container) arguments.get(2), (Cable) arguments.get(3), (Server) arguments.get(4));
		case RulesPackage.VIRTUAL_NODE_TO_SERVER_RULE___PERFORM_BWD__ISAPPLICABLEMATCH:
			return perform_BWD((IsApplicableMatch) arguments.get(0));
		case RulesPackage.VIRTUAL_NODE_TO_SERVER_RULE___IS_APPLICABLE_BWD__MATCH:
			return isApplicable_BWD((Match) arguments.get(0));
		case RulesPackage.VIRTUAL_NODE_TO_SERVER_RULE___REGISTER_OBJECTS_TO_MATCH_BWD__MATCH_ROUTER_CONTAINER_CABLE_SERVER:
			registerObjectsToMatch_BWD((Match) arguments.get(0), (Router) arguments.get(1),
					(implementation.Container) arguments.get(2), (Cable) arguments.get(3), (Server) arguments.get(4));
			return null;
		case RulesPackage.VIRTUAL_NODE_TO_SERVER_RULE___IS_APPROPRIATE_SOLVE_CSP_BWD__MATCH_ROUTER_CONTAINER_CABLE_SERVER:
			return isAppropriate_solveCsp_BWD((Match) arguments.get(0), (Router) arguments.get(1),
					(implementation.Container) arguments.get(2), (Cable) arguments.get(3), (Server) arguments.get(4));
		case RulesPackage.VIRTUAL_NODE_TO_SERVER_RULE___IS_APPROPRIATE_CHECK_CSP_BWD__CSP:
			return isAppropriate_checkCsp_BWD((CSP) arguments.get(0));
		case RulesPackage.VIRTUAL_NODE_TO_SERVER_RULE___IS_APPLICABLE_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_ROUTER_VIRTUALNODETOROUTER_CONTAINER_NETWORKSPAN_CABLE_SERVER_CONTAINER_REQCONTAINERTOIMPLCONTAINER:
			return isApplicable_solveCsp_BWD((IsApplicableMatch) arguments.get(0), (Router) arguments.get(1),
					(VirtualNodeToRouter) arguments.get(2), (implementation.Container) arguments.get(3),
					(NetworkSpan) arguments.get(4), (Cable) arguments.get(5), (Server) arguments.get(6),
					(Container) arguments.get(7), (ReqContainerToImplContainer) arguments.get(8));
		case RulesPackage.VIRTUAL_NODE_TO_SERVER_RULE___IS_APPLICABLE_CHECK_CSP_BWD__CSP:
			return isApplicable_checkCsp_BWD((CSP) arguments.get(0));
		case RulesPackage.VIRTUAL_NODE_TO_SERVER_RULE___REGISTER_OBJECTS_BWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT:
			registerObjects_BWD((PerformRuleResult) arguments.get(0), (EObject) arguments.get(1),
					(EObject) arguments.get(2), (EObject) arguments.get(3), (EObject) arguments.get(4),
					(EObject) arguments.get(5), (EObject) arguments.get(6), (EObject) arguments.get(7),
					(EObject) arguments.get(8), (EObject) arguments.get(9));
			return null;
		case RulesPackage.VIRTUAL_NODE_TO_SERVER_RULE___CHECK_TYPES_BWD__MATCH:
			return checkTypes_BWD((Match) arguments.get(0));
		case RulesPackage.VIRTUAL_NODE_TO_SERVER_RULE___IS_APPROPRIATE_FWD_NETWORK_SPAN_0__NETWORKSPAN:
			return isAppropriate_FWD_NetworkSpan_0((NetworkSpan) arguments.get(0));
		case RulesPackage.VIRTUAL_NODE_TO_SERVER_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_2__EMOFLONEDGE:
			return isAppropriate_BWD_EMoflonEdge_2((EMoflonEdge) arguments.get(0));
		case RulesPackage.VIRTUAL_NODE_TO_SERVER_RULE___CHECK_ATTRIBUTES_FWD__TRIPLEMATCH:
			return checkAttributes_FWD((TripleMatch) arguments.get(0));
		case RulesPackage.VIRTUAL_NODE_TO_SERVER_RULE___CHECK_ATTRIBUTES_BWD__TRIPLEMATCH:
			return checkAttributes_BWD((TripleMatch) arguments.get(0));
		case RulesPackage.VIRTUAL_NODE_TO_SERVER_RULE___IS_APPLICABLE_CC__MATCH_MATCH:
			return isApplicable_CC((Match) arguments.get(0), (Match) arguments.get(1));
		case RulesPackage.VIRTUAL_NODE_TO_SERVER_RULE___IS_APPLICABLE_SOLVE_CSP_CC__ROUTER_CONTAINER_NETWORKSPAN_CABLE_SERVER_CONTAINER_MATCH_MATCH:
			return isApplicable_solveCsp_CC((Router) arguments.get(0), (implementation.Container) arguments.get(1),
					(NetworkSpan) arguments.get(2), (Cable) arguments.get(3), (Server) arguments.get(4),
					(Container) arguments.get(5), (Match) arguments.get(6), (Match) arguments.get(7));
		case RulesPackage.VIRTUAL_NODE_TO_SERVER_RULE___IS_APPLICABLE_CHECK_CSP_CC__CSP:
			return isApplicable_checkCsp_CC((CSP) arguments.get(0));
		case RulesPackage.VIRTUAL_NODE_TO_SERVER_RULE___CHECK_DEC_FWD__NETWORKSPAN_CONTAINER:
			return checkDEC_FWD((NetworkSpan) arguments.get(0), (Container) arguments.get(1));
		case RulesPackage.VIRTUAL_NODE_TO_SERVER_RULE___CHECK_DEC_BWD__ROUTER_CONTAINER_CABLE_SERVER:
			return checkDEC_BWD((Router) arguments.get(0), (implementation.Container) arguments.get(1),
					(Cable) arguments.get(2), (Server) arguments.get(3));
		case RulesPackage.VIRTUAL_NODE_TO_SERVER_RULE___GENERATE_MODEL__RULEENTRYCONTAINER_VIRTUALNODETOROUTER:
			return generateModel((RuleEntryContainer) arguments.get(0), (VirtualNodeToRouter) arguments.get(1));
		case RulesPackage.VIRTUAL_NODE_TO_SERVER_RULE___GENERATE_MODEL_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_ROUTER_VIRTUALNODETOROUTER_CONTAINER_NETWORKSPAN_CABLE_CONTAINER_REQCONTAINERTOIMPLCONTAINER_MODELGENERATORRULERESULT:
			return generateModel_solveCsp_BWD((IsApplicableMatch) arguments.get(0), (Router) arguments.get(1),
					(VirtualNodeToRouter) arguments.get(2), (implementation.Container) arguments.get(3),
					(NetworkSpan) arguments.get(4), (Cable) arguments.get(5), (Container) arguments.get(6),
					(ReqContainerToImplContainer) arguments.get(7), (ModelgeneratorRuleResult) arguments.get(8));
		case RulesPackage.VIRTUAL_NODE_TO_SERVER_RULE___GENERATE_MODEL_CHECK_CSP_BWD__CSP:
			return generateModel_checkCsp_BWD((CSP) arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
	}

	public static final Object[] pattern_VirtualNodeToServerRule_0_1_initialbindings_blackBBBB(
			VirtualNodeToServerRule _this, Match match, NetworkSpan virtualNode, Container reqContainer) {
		return new Object[] { _this, match, virtualNode, reqContainer };
	}

	public static final Object[] pattern_VirtualNodeToServerRule_0_2_SolveCSP_bindingFBBBB(
			VirtualNodeToServerRule _this, Match match, NetworkSpan virtualNode, Container reqContainer) {
		CSP _localVariable_0 = _this.isAppropriate_solveCsp_FWD(match, virtualNode, reqContainer);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, match, virtualNode, reqContainer };
		}
		return null;
	}

	public static final Object[] pattern_VirtualNodeToServerRule_0_2_SolveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_VirtualNodeToServerRule_0_2_SolveCSP_bindingAndBlackFBBBB(
			VirtualNodeToServerRule _this, Match match, NetworkSpan virtualNode, Container reqContainer) {
		Object[] result_pattern_VirtualNodeToServerRule_0_2_SolveCSP_binding = pattern_VirtualNodeToServerRule_0_2_SolveCSP_bindingFBBBB(
				_this, match, virtualNode, reqContainer);
		if (result_pattern_VirtualNodeToServerRule_0_2_SolveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_VirtualNodeToServerRule_0_2_SolveCSP_binding[0];

			Object[] result_pattern_VirtualNodeToServerRule_0_2_SolveCSP_black = pattern_VirtualNodeToServerRule_0_2_SolveCSP_blackB(
					csp);
			if (result_pattern_VirtualNodeToServerRule_0_2_SolveCSP_black != null) {

				return new Object[] { csp, _this, match, virtualNode, reqContainer };
			}
		}
		return null;
	}

	public static final boolean pattern_VirtualNodeToServerRule_0_3_CheckCSP_expressionFBB(
			VirtualNodeToServerRule _this, CSP csp) {
		boolean _localVariable_0 = _this.isAppropriate_checkCsp_FWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_VirtualNodeToServerRule_0_4_collectelementstobetranslated_blackBBB(Match match,
			NetworkSpan virtualNode, Container reqContainer) {
		return new Object[] { match, virtualNode, reqContainer };
	}

	public static final Object[] pattern_VirtualNodeToServerRule_0_5_collectcontextelements_blackBBB(Match match,
			NetworkSpan virtualNode, Container reqContainer) {
		return new Object[] { match, virtualNode, reqContainer };
	}

	public static final Object[] pattern_VirtualNodeToServerRule_0_5_collectcontextelements_greenBBBF(Match match,
			NetworkSpan virtualNode, Container reqContainer) {
		EMoflonEdge reqContainer__virtualNode____networkSpan = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		match.getContextNodes().add(virtualNode);
		match.getContextNodes().add(reqContainer);
		String reqContainer__virtualNode____networkSpan_name_prime = "networkSpan";
		reqContainer__virtualNode____networkSpan.setSrc(reqContainer);
		reqContainer__virtualNode____networkSpan.setTrg(virtualNode);
		match.getContextEdges().add(reqContainer__virtualNode____networkSpan);
		reqContainer__virtualNode____networkSpan.setName(reqContainer__virtualNode____networkSpan_name_prime);
		return new Object[] { match, virtualNode, reqContainer, reqContainer__virtualNode____networkSpan };
	}

	public static final void pattern_VirtualNodeToServerRule_0_6_registerobjectstomatch_expressionBBBB(
			VirtualNodeToServerRule _this, Match match, NetworkSpan virtualNode, Container reqContainer) {
		_this.registerObjectsToMatch_FWD(match, virtualNode, reqContainer);

	}

	public static final boolean pattern_VirtualNodeToServerRule_0_7_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_VirtualNodeToServerRule_0_8_expressionF() {
		boolean _result = Boolean.valueOf(false);
		return _result;
	}

	public static final Object[] pattern_VirtualNodeToServerRule_7_1_initialbindings_blackBBBBBB(
			VirtualNodeToServerRule _this, Match match, Router router, implementation.Container implContainer,
			Cable cable, Server server) {
		return new Object[] { _this, match, router, implContainer, cable, server };
	}

	public static final Object[] pattern_VirtualNodeToServerRule_7_2_SolveCSP_bindingFBBBBBB(
			VirtualNodeToServerRule _this, Match match, Router router, implementation.Container implContainer,
			Cable cable, Server server) {
		CSP _localVariable_0 = _this.isAppropriate_solveCsp_BWD(match, router, implContainer, cable, server);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, match, router, implContainer, cable, server };
		}
		return null;
	}

	public static final Object[] pattern_VirtualNodeToServerRule_7_2_SolveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_VirtualNodeToServerRule_7_2_SolveCSP_bindingAndBlackFBBBBBB(
			VirtualNodeToServerRule _this, Match match, Router router, implementation.Container implContainer,
			Cable cable, Server server) {
		Object[] result_pattern_VirtualNodeToServerRule_7_2_SolveCSP_binding = pattern_VirtualNodeToServerRule_7_2_SolveCSP_bindingFBBBBBB(
				_this, match, router, implContainer, cable, server);
		if (result_pattern_VirtualNodeToServerRule_7_2_SolveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_VirtualNodeToServerRule_7_2_SolveCSP_binding[0];

			Object[] result_pattern_VirtualNodeToServerRule_7_2_SolveCSP_black = pattern_VirtualNodeToServerRule_7_2_SolveCSP_blackB(
					csp);
			if (result_pattern_VirtualNodeToServerRule_7_2_SolveCSP_black != null) {

				return new Object[] { csp, _this, match, router, implContainer, cable, server };
			}
		}
		return null;
	}

	public static final boolean pattern_VirtualNodeToServerRule_7_3_CheckCSP_expressionFBB(
			VirtualNodeToServerRule _this, CSP csp) {
		boolean _localVariable_0 = _this.isAppropriate_checkCsp_BWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_VirtualNodeToServerRule_7_4_collectelementstobetranslated_blackBBBBB(
			Match match, Router router, implementation.Container implContainer, Cable cable, Server server) {
		return new Object[] { match, router, implContainer, cable, server };
	}

	public static final Object[] pattern_VirtualNodeToServerRule_7_4_collectelementstobetranslated_greenBBBBBFFFFF(
			Match match, Router router, implementation.Container implContainer, Cable cable, Server server) {
		EMoflonEdge router__cable____incoming = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge cable__router____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge implContainer__server____devices = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge server__cable____outgoing = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge cable__server____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		match.getToBeTranslatedNodes().add(server);
		String router__cable____incoming_name_prime = "incoming";
		String cable__router____target_name_prime = "target";
		String implContainer__server____devices_name_prime = "devices";
		String server__cable____outgoing_name_prime = "outgoing";
		String cable__server____source_name_prime = "source";
		router__cable____incoming.setSrc(router);
		router__cable____incoming.setTrg(cable);
		match.getToBeTranslatedEdges().add(router__cable____incoming);
		cable__router____target.setSrc(cable);
		cable__router____target.setTrg(router);
		match.getToBeTranslatedEdges().add(cable__router____target);
		implContainer__server____devices.setSrc(implContainer);
		implContainer__server____devices.setTrg(server);
		match.getToBeTranslatedEdges().add(implContainer__server____devices);
		server__cable____outgoing.setSrc(server);
		server__cable____outgoing.setTrg(cable);
		match.getToBeTranslatedEdges().add(server__cable____outgoing);
		cable__server____source.setSrc(cable);
		cable__server____source.setTrg(server);
		match.getToBeTranslatedEdges().add(cable__server____source);
		router__cable____incoming.setName(router__cable____incoming_name_prime);
		cable__router____target.setName(cable__router____target_name_prime);
		implContainer__server____devices.setName(implContainer__server____devices_name_prime);
		server__cable____outgoing.setName(server__cable____outgoing_name_prime);
		cable__server____source.setName(cable__server____source_name_prime);
		return new Object[] { match, router, implContainer, cable, server, router__cable____incoming,
				cable__router____target, implContainer__server____devices, server__cable____outgoing,
				cable__server____source };
	}

	public static final Object[] pattern_VirtualNodeToServerRule_7_5_collectcontextelements_blackBBBBB(Match match,
			Router router, implementation.Container implContainer, Cable cable, Server server) {
		return new Object[] { match, router, implContainer, cable, server };
	}

	public static final Object[] pattern_VirtualNodeToServerRule_7_5_collectcontextelements_greenBBBBFF(Match match,
			Router router, implementation.Container implContainer, Cable cable) {
		EMoflonEdge implContainer__router____devices = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge implContainer__cable____cables = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		match.getContextNodes().add(router);
		match.getContextNodes().add(implContainer);
		match.getContextNodes().add(cable);
		String implContainer__router____devices_name_prime = "devices";
		String implContainer__cable____cables_name_prime = "cables";
		implContainer__router____devices.setSrc(implContainer);
		implContainer__router____devices.setTrg(router);
		match.getContextEdges().add(implContainer__router____devices);
		implContainer__cable____cables.setSrc(implContainer);
		implContainer__cable____cables.setTrg(cable);
		match.getContextEdges().add(implContainer__cable____cables);
		implContainer__router____devices.setName(implContainer__router____devices_name_prime);
		implContainer__cable____cables.setName(implContainer__cable____cables_name_prime);
		return new Object[] { match, router, implContainer, cable, implContainer__router____devices,
				implContainer__cable____cables };
	}

	public static final void pattern_VirtualNodeToServerRule_7_6_registerobjectstomatch_expressionBBBBBB(
			VirtualNodeToServerRule _this, Match match, Router router, implementation.Container implContainer,
			Cable cable, Server server) {
		_this.registerObjectsToMatch_BWD(match, router, implContainer, cable, server);

	}

	public static final boolean pattern_VirtualNodeToServerRule_7_7_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_VirtualNodeToServerRule_7_8_expressionF() {
		boolean _result = Boolean.valueOf(false);
		return _result;
	}

	public static final Object[] pattern_VirtualNodeToServerRule_8_1_performtransformation_bindingFFFFFFFFB(
			IsApplicableMatch isApplicableMatch) {
		EObject _localVariable_0 = isApplicableMatch.getObject("router");
		EObject _localVariable_1 = isApplicableMatch.getObject("virtualNodeToRouter");
		EObject _localVariable_2 = isApplicableMatch.getObject("implContainer");
		EObject _localVariable_3 = isApplicableMatch.getObject("virtualNode");
		EObject _localVariable_4 = isApplicableMatch.getObject("cable");
		EObject _localVariable_5 = isApplicableMatch.getObject("server");
		EObject _localVariable_6 = isApplicableMatch.getObject("reqContainer");
		EObject _localVariable_7 = isApplicableMatch.getObject("reqContainerToImplContainer");
		EObject tmpRouter = _localVariable_0;
		EObject tmpVirtualNodeToRouter = _localVariable_1;
		EObject tmpImplContainer = _localVariable_2;
		EObject tmpVirtualNode = _localVariable_3;
		EObject tmpCable = _localVariable_4;
		EObject tmpServer = _localVariable_5;
		EObject tmpReqContainer = _localVariable_6;
		EObject tmpReqContainerToImplContainer = _localVariable_7;
		if (tmpRouter instanceof Router) {
			Router router = (Router) tmpRouter;
			if (tmpVirtualNodeToRouter instanceof VirtualNodeToRouter) {
				VirtualNodeToRouter virtualNodeToRouter = (VirtualNodeToRouter) tmpVirtualNodeToRouter;
				if (tmpImplContainer instanceof implementation.Container) {
					implementation.Container implContainer = (implementation.Container) tmpImplContainer;
					if (tmpVirtualNode instanceof NetworkSpan) {
						NetworkSpan virtualNode = (NetworkSpan) tmpVirtualNode;
						if (tmpCable instanceof Cable) {
							Cable cable = (Cable) tmpCable;
							if (tmpServer instanceof Server) {
								Server server = (Server) tmpServer;
								if (tmpReqContainer instanceof Container) {
									Container reqContainer = (Container) tmpReqContainer;
									if (tmpReqContainerToImplContainer instanceof ReqContainerToImplContainer) {
										ReqContainerToImplContainer reqContainerToImplContainer = (ReqContainerToImplContainer) tmpReqContainerToImplContainer;
										return new Object[] { router, virtualNodeToRouter, implContainer, virtualNode,
												cable, server, reqContainer, reqContainerToImplContainer,
												isApplicableMatch };
									}
								}
							}
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_VirtualNodeToServerRule_8_1_performtransformation_blackBBBBBBBBFBB(
			Router router, VirtualNodeToRouter virtualNodeToRouter, implementation.Container implContainer,
			NetworkSpan virtualNode, Cable cable, Server server, Container reqContainer,
			ReqContainerToImplContainer reqContainerToImplContainer, VirtualNodeToServerRule _this,
			IsApplicableMatch isApplicableMatch) {
		for (EObject tmpCsp : isApplicableMatch.getAttributeInfo()) {
			if (tmpCsp instanceof CSP) {
				CSP csp = (CSP) tmpCsp;
				return new Object[] { router, virtualNodeToRouter, implContainer, virtualNode, cable, server,
						reqContainer, reqContainerToImplContainer, csp, _this, isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_VirtualNodeToServerRule_8_1_performtransformation_bindingAndBlackFFFFFFFFFBB(
			VirtualNodeToServerRule _this, IsApplicableMatch isApplicableMatch) {
		Object[] result_pattern_VirtualNodeToServerRule_8_1_performtransformation_binding = pattern_VirtualNodeToServerRule_8_1_performtransformation_bindingFFFFFFFFB(
				isApplicableMatch);
		if (result_pattern_VirtualNodeToServerRule_8_1_performtransformation_binding != null) {
			Router router = (Router) result_pattern_VirtualNodeToServerRule_8_1_performtransformation_binding[0];
			VirtualNodeToRouter virtualNodeToRouter = (VirtualNodeToRouter) result_pattern_VirtualNodeToServerRule_8_1_performtransformation_binding[1];
			implementation.Container implContainer = (implementation.Container) result_pattern_VirtualNodeToServerRule_8_1_performtransformation_binding[2];
			NetworkSpan virtualNode = (NetworkSpan) result_pattern_VirtualNodeToServerRule_8_1_performtransformation_binding[3];
			Cable cable = (Cable) result_pattern_VirtualNodeToServerRule_8_1_performtransformation_binding[4];
			Server server = (Server) result_pattern_VirtualNodeToServerRule_8_1_performtransformation_binding[5];
			Container reqContainer = (Container) result_pattern_VirtualNodeToServerRule_8_1_performtransformation_binding[6];
			ReqContainerToImplContainer reqContainerToImplContainer = (ReqContainerToImplContainer) result_pattern_VirtualNodeToServerRule_8_1_performtransformation_binding[7];

			Object[] result_pattern_VirtualNodeToServerRule_8_1_performtransformation_black = pattern_VirtualNodeToServerRule_8_1_performtransformation_blackBBBBBBBBFBB(
					router, virtualNodeToRouter, implContainer, virtualNode, cable, server, reqContainer,
					reqContainerToImplContainer, _this, isApplicableMatch);
			if (result_pattern_VirtualNodeToServerRule_8_1_performtransformation_black != null) {
				CSP csp = (CSP) result_pattern_VirtualNodeToServerRule_8_1_performtransformation_black[8];

				return new Object[] { router, virtualNodeToRouter, implContainer, virtualNode, cable, server,
						reqContainer, reqContainerToImplContainer, csp, _this, isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_VirtualNodeToServerRule_8_1_performtransformation_greenFBB(
			NetworkSpan virtualNode, Server server) {
		VirtualNodeToServer virtualNodeToServer = ReqToImpTransformatorFactory.eINSTANCE.createVirtualNodeToServer();
		virtualNodeToServer.setSource(virtualNode);
		virtualNodeToServer.setTarget(server);
		return new Object[] { virtualNodeToServer, virtualNode, server };
	}

	public static final Object[] pattern_VirtualNodeToServerRule_8_2_collecttranslatedelements_blackBB(
			VirtualNodeToServer virtualNodeToServer, Server server) {
		return new Object[] { virtualNodeToServer, server };
	}

	public static final Object[] pattern_VirtualNodeToServerRule_8_2_collecttranslatedelements_greenFBB(
			VirtualNodeToServer virtualNodeToServer, Server server) {
		PerformRuleResult ruleresult = RuntimeFactory.eINSTANCE.createPerformRuleResult();
		ruleresult.getCreatedLinkElements().add(virtualNodeToServer);
		ruleresult.getTranslatedElements().add(server);
		return new Object[] { ruleresult, virtualNodeToServer, server };
	}

	public static final Object[] pattern_VirtualNodeToServerRule_8_3_bookkeepingforedges_blackBBBBBBBBBB(
			PerformRuleResult ruleresult, EObject router, EObject virtualNodeToRouter, EObject implContainer,
			EObject virtualNodeToServer, EObject virtualNode, EObject cable, EObject server, EObject reqContainer,
			EObject reqContainerToImplContainer) {
		if (!router.equals(virtualNodeToRouter)) {
			if (!router.equals(virtualNodeToServer)) {
				if (!router.equals(virtualNode)) {
					if (!router.equals(server)) {
						if (!virtualNodeToRouter.equals(virtualNodeToServer)) {
							if (!implContainer.equals(router)) {
								if (!implContainer.equals(virtualNodeToRouter)) {
									if (!implContainer.equals(virtualNodeToServer)) {
										if (!implContainer.equals(virtualNode)) {
											if (!implContainer.equals(server)) {
												if (!implContainer.equals(reqContainer)) {
													if (!implContainer.equals(reqContainerToImplContainer)) {
														if (!virtualNode.equals(virtualNodeToRouter)) {
															if (!virtualNode.equals(virtualNodeToServer)) {
																if (!cable.equals(router)) {
																	if (!cable.equals(virtualNodeToRouter)) {
																		if (!cable.equals(implContainer)) {
																			if (!cable.equals(virtualNodeToServer)) {
																				if (!cable.equals(virtualNode)) {
																					if (!cable.equals(server)) {
																						if (!cable
																								.equals(reqContainer)) {
																							if (!cable.equals(
																									reqContainerToImplContainer)) {
																								if (!server.equals(
																										virtualNodeToRouter)) {
																									if (!server.equals(
																											virtualNodeToServer)) {
																										if (!server
																												.equals(virtualNode)) {
																											if (!reqContainer
																													.equals(router)) {
																												if (!reqContainer
																														.equals(virtualNodeToRouter)) {
																													if (!reqContainer
																															.equals(virtualNodeToServer)) {
																														if (!reqContainer
																																.equals(virtualNode)) {
																															if (!reqContainer
																																	.equals(server)) {
																																if (!reqContainer
																																		.equals(reqContainerToImplContainer)) {
																																	if (!reqContainerToImplContainer
																																			.equals(router)) {
																																		if (!reqContainerToImplContainer
																																				.equals(virtualNodeToRouter)) {
																																			if (!reqContainerToImplContainer
																																					.equals(virtualNodeToServer)) {
																																				if (!reqContainerToImplContainer
																																						.equals(virtualNode)) {
																																					if (!reqContainerToImplContainer
																																							.equals(server)) {
																																						return new Object[] {
																																								ruleresult,
																																								router,
																																								virtualNodeToRouter,
																																								implContainer,
																																								virtualNodeToServer,
																																								virtualNode,
																																								cable,
																																								server,
																																								reqContainer,
																																								reqContainerToImplContainer };
																																					}
																																				}
																																			}
																																		}
																																	}
																																}
																															}
																														}
																													}
																												}
																											}
																										}
																									}
																								}
																							}
																						}
																					}
																				}
																			}
																		}
																	}
																}
															}
														}
													}
												}
											}
										}
									}
								}
							}
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_VirtualNodeToServerRule_8_3_bookkeepingforedges_greenBBBBBBBFFFFFFF(
			PerformRuleResult ruleresult, EObject router, EObject implContainer, EObject virtualNodeToServer,
			EObject virtualNode, EObject cable, EObject server) {
		EMoflonEdge router__cable____incoming = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge cable__router____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge virtualNodeToServer__virtualNode____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge implContainer__server____devices = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge virtualNodeToServer__server____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge server__cable____outgoing = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge cable__server____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String ruleresult_ruleName_prime = "VirtualNodeToServerRule";
		String router__cable____incoming_name_prime = "incoming";
		String cable__router____target_name_prime = "target";
		String virtualNodeToServer__virtualNode____source_name_prime = "source";
		String implContainer__server____devices_name_prime = "devices";
		String virtualNodeToServer__server____target_name_prime = "target";
		String server__cable____outgoing_name_prime = "outgoing";
		String cable__server____source_name_prime = "source";
		router__cable____incoming.setSrc(router);
		router__cable____incoming.setTrg(cable);
		ruleresult.getTranslatedEdges().add(router__cable____incoming);
		cable__router____target.setSrc(cable);
		cable__router____target.setTrg(router);
		ruleresult.getTranslatedEdges().add(cable__router____target);
		virtualNodeToServer__virtualNode____source.setSrc(virtualNodeToServer);
		virtualNodeToServer__virtualNode____source.setTrg(virtualNode);
		ruleresult.getCreatedEdges().add(virtualNodeToServer__virtualNode____source);
		implContainer__server____devices.setSrc(implContainer);
		implContainer__server____devices.setTrg(server);
		ruleresult.getTranslatedEdges().add(implContainer__server____devices);
		virtualNodeToServer__server____target.setSrc(virtualNodeToServer);
		virtualNodeToServer__server____target.setTrg(server);
		ruleresult.getCreatedEdges().add(virtualNodeToServer__server____target);
		server__cable____outgoing.setSrc(server);
		server__cable____outgoing.setTrg(cable);
		ruleresult.getTranslatedEdges().add(server__cable____outgoing);
		cable__server____source.setSrc(cable);
		cable__server____source.setTrg(server);
		ruleresult.getTranslatedEdges().add(cable__server____source);
		ruleresult.setRuleName(ruleresult_ruleName_prime);
		router__cable____incoming.setName(router__cable____incoming_name_prime);
		cable__router____target.setName(cable__router____target_name_prime);
		virtualNodeToServer__virtualNode____source.setName(virtualNodeToServer__virtualNode____source_name_prime);
		implContainer__server____devices.setName(implContainer__server____devices_name_prime);
		virtualNodeToServer__server____target.setName(virtualNodeToServer__server____target_name_prime);
		server__cable____outgoing.setName(server__cable____outgoing_name_prime);
		cable__server____source.setName(cable__server____source_name_prime);
		return new Object[] { ruleresult, router, implContainer, virtualNodeToServer, virtualNode, cable, server,
				router__cable____incoming, cable__router____target, virtualNodeToServer__virtualNode____source,
				implContainer__server____devices, virtualNodeToServer__server____target, server__cable____outgoing,
				cable__server____source };
	}

	public static final void pattern_VirtualNodeToServerRule_8_5_registerobjects_expressionBBBBBBBBBBB(
			VirtualNodeToServerRule _this, PerformRuleResult ruleresult, EObject router, EObject virtualNodeToRouter,
			EObject implContainer, EObject virtualNodeToServer, EObject virtualNode, EObject cable, EObject server,
			EObject reqContainer, EObject reqContainerToImplContainer) {
		_this.registerObjects_BWD(ruleresult, router, virtualNodeToRouter, implContainer, virtualNodeToServer,
				virtualNode, cable, server, reqContainer, reqContainerToImplContainer);

	}

	public static final PerformRuleResult pattern_VirtualNodeToServerRule_8_6_expressionFB(
			PerformRuleResult ruleresult) {
		PerformRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_VirtualNodeToServerRule_9_1_preparereturnvalue_bindingFB(
			VirtualNodeToServerRule _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass eClass = _localVariable_0;
		if (eClass != null) {
			return new Object[] { eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_VirtualNodeToServerRule_9_1_preparereturnvalue_blackFBB(EClass eClass,
			VirtualNodeToServerRule _this) {
		for (EOperation performOperation : eClass.getEOperations()) {
			String performOperation_name = performOperation.getName();
			if (performOperation_name.equals("perform_BWD")) {
				return new Object[] { performOperation, eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_VirtualNodeToServerRule_9_1_preparereturnvalue_bindingAndBlackFFB(
			VirtualNodeToServerRule _this) {
		Object[] result_pattern_VirtualNodeToServerRule_9_1_preparereturnvalue_binding = pattern_VirtualNodeToServerRule_9_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_VirtualNodeToServerRule_9_1_preparereturnvalue_binding != null) {
			EClass eClass = (EClass) result_pattern_VirtualNodeToServerRule_9_1_preparereturnvalue_binding[0];

			Object[] result_pattern_VirtualNodeToServerRule_9_1_preparereturnvalue_black = pattern_VirtualNodeToServerRule_9_1_preparereturnvalue_blackFBB(
					eClass, _this);
			if (result_pattern_VirtualNodeToServerRule_9_1_preparereturnvalue_black != null) {
				EOperation performOperation = (EOperation) result_pattern_VirtualNodeToServerRule_9_1_preparereturnvalue_black[0];

				return new Object[] { performOperation, eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_VirtualNodeToServerRule_9_1_preparereturnvalue_greenBF(
			EOperation performOperation) {
		IsApplicableRuleResult ruleresult = RuntimeFactory.eINSTANCE.createIsApplicableRuleResult();
		boolean ruleresult_success_prime = Boolean.valueOf(false);
		String ruleresult_rule_prime = "VirtualNodeToServerRule";
		ruleresult.setPerformOperation(performOperation);
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		ruleresult.setRule(ruleresult_rule_prime);
		return new Object[] { performOperation, ruleresult };
	}

	public static final Object[] pattern_VirtualNodeToServerRule_9_2_corematch_bindingFFFFB(Match match) {
		EObject _localVariable_0 = match.getObject("router");
		EObject _localVariable_1 = match.getObject("implContainer");
		EObject _localVariable_2 = match.getObject("cable");
		EObject _localVariable_3 = match.getObject("server");
		EObject tmpRouter = _localVariable_0;
		EObject tmpImplContainer = _localVariable_1;
		EObject tmpCable = _localVariable_2;
		EObject tmpServer = _localVariable_3;
		if (tmpRouter instanceof Router) {
			Router router = (Router) tmpRouter;
			if (tmpImplContainer instanceof implementation.Container) {
				implementation.Container implContainer = (implementation.Container) tmpImplContainer;
				if (tmpCable instanceof Cable) {
					Cable cable = (Cable) tmpCable;
					if (tmpServer instanceof Server) {
						Server server = (Server) tmpServer;
						return new Object[] { router, implContainer, cable, server, match };
					}
				}
			}
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_VirtualNodeToServerRule_9_2_corematch_blackBFBFBBFFB(Router router,
			implementation.Container implContainer, Cable cable, Server server, Match match) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		for (VirtualNodeToRouter virtualNodeToRouter : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(router, VirtualNodeToRouter.class, "target")) {
			NetworkSpan virtualNode = virtualNodeToRouter.getSource();
			if (virtualNode != null) {
				for (ReqContainerToImplContainer reqContainerToImplContainer : org.moflon.core.utilities.eMoflonEMFUtil
						.getOppositeReferenceTyped(implContainer, ReqContainerToImplContainer.class, "target")) {
					Container reqContainer = reqContainerToImplContainer.getSource();
					if (reqContainer != null) {
						_result.add(new Object[] { router, virtualNodeToRouter, implContainer, virtualNode, cable,
								server, reqContainer, reqContainerToImplContainer, match });
					}

				}
			}

		}
		return _result;
	}

	public static final Iterable<Object[]> pattern_VirtualNodeToServerRule_9_3_findcontext_blackBBBBBBBB(Router router,
			VirtualNodeToRouter virtualNodeToRouter, implementation.Container implContainer, NetworkSpan virtualNode,
			Cable cable, Server server, Container reqContainer,
			ReqContainerToImplContainer reqContainerToImplContainer) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (router.getIncoming().contains(cable)) {
			if (implContainer.getDevices().contains(router)) {
				if (virtualNode.equals(virtualNodeToRouter.getSource())) {
					if (router.equals(virtualNodeToRouter.getTarget())) {
						if (implContainer.getDevices().contains(server)) {
							if (implContainer.getCables().contains(cable)) {
								if (virtualNode.equals(reqContainer.getNetworkSpan())) {
									if (server.getOutgoing().contains(cable)) {
										if (reqContainer.equals(reqContainerToImplContainer.getSource())) {
											if (implContainer.equals(reqContainerToImplContainer.getTarget())) {
												_result.add(new Object[] { router, virtualNodeToRouter, implContainer,
														virtualNode, cable, server, reqContainer,
														reqContainerToImplContainer });
											}
										}
									}
								}
							}
						}
					}
				}
			}
		}
		return _result;
	}

	public static final Object[] pattern_VirtualNodeToServerRule_9_3_findcontext_greenBBBBBBBBFFFFFFFFFFFFF(
			Router router, VirtualNodeToRouter virtualNodeToRouter, implementation.Container implContainer,
			NetworkSpan virtualNode, Cable cable, Server server, Container reqContainer,
			ReqContainerToImplContainer reqContainerToImplContainer) {
		IsApplicableMatch isApplicableMatch = RuntimeFactory.eINSTANCE.createIsApplicableMatch();
		EMoflonEdge router__cable____incoming = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge cable__router____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge implContainer__router____devices = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge virtualNodeToRouter__virtualNode____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge virtualNodeToRouter__router____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge implContainer__server____devices = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge implContainer__cable____cables = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge reqContainer__virtualNode____networkSpan = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge server__cable____outgoing = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge cable__server____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge reqContainerToImplContainer__reqContainer____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge reqContainerToImplContainer__implContainer____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String router__cable____incoming_name_prime = "incoming";
		String cable__router____target_name_prime = "target";
		String implContainer__router____devices_name_prime = "devices";
		String virtualNodeToRouter__virtualNode____source_name_prime = "source";
		String virtualNodeToRouter__router____target_name_prime = "target";
		String implContainer__server____devices_name_prime = "devices";
		String implContainer__cable____cables_name_prime = "cables";
		String reqContainer__virtualNode____networkSpan_name_prime = "networkSpan";
		String server__cable____outgoing_name_prime = "outgoing";
		String cable__server____source_name_prime = "source";
		String reqContainerToImplContainer__reqContainer____source_name_prime = "source";
		String reqContainerToImplContainer__implContainer____target_name_prime = "target";
		isApplicableMatch.getAllContextElements().add(router);
		isApplicableMatch.getAllContextElements().add(virtualNodeToRouter);
		isApplicableMatch.getAllContextElements().add(implContainer);
		isApplicableMatch.getAllContextElements().add(virtualNode);
		isApplicableMatch.getAllContextElements().add(cable);
		isApplicableMatch.getAllContextElements().add(server);
		isApplicableMatch.getAllContextElements().add(reqContainer);
		isApplicableMatch.getAllContextElements().add(reqContainerToImplContainer);
		router__cable____incoming.setSrc(router);
		router__cable____incoming.setTrg(cable);
		isApplicableMatch.getAllContextElements().add(router__cable____incoming);
		cable__router____target.setSrc(cable);
		cable__router____target.setTrg(router);
		isApplicableMatch.getAllContextElements().add(cable__router____target);
		implContainer__router____devices.setSrc(implContainer);
		implContainer__router____devices.setTrg(router);
		isApplicableMatch.getAllContextElements().add(implContainer__router____devices);
		virtualNodeToRouter__virtualNode____source.setSrc(virtualNodeToRouter);
		virtualNodeToRouter__virtualNode____source.setTrg(virtualNode);
		isApplicableMatch.getAllContextElements().add(virtualNodeToRouter__virtualNode____source);
		virtualNodeToRouter__router____target.setSrc(virtualNodeToRouter);
		virtualNodeToRouter__router____target.setTrg(router);
		isApplicableMatch.getAllContextElements().add(virtualNodeToRouter__router____target);
		implContainer__server____devices.setSrc(implContainer);
		implContainer__server____devices.setTrg(server);
		isApplicableMatch.getAllContextElements().add(implContainer__server____devices);
		implContainer__cable____cables.setSrc(implContainer);
		implContainer__cable____cables.setTrg(cable);
		isApplicableMatch.getAllContextElements().add(implContainer__cable____cables);
		reqContainer__virtualNode____networkSpan.setSrc(reqContainer);
		reqContainer__virtualNode____networkSpan.setTrg(virtualNode);
		isApplicableMatch.getAllContextElements().add(reqContainer__virtualNode____networkSpan);
		server__cable____outgoing.setSrc(server);
		server__cable____outgoing.setTrg(cable);
		isApplicableMatch.getAllContextElements().add(server__cable____outgoing);
		cable__server____source.setSrc(cable);
		cable__server____source.setTrg(server);
		isApplicableMatch.getAllContextElements().add(cable__server____source);
		reqContainerToImplContainer__reqContainer____source.setSrc(reqContainerToImplContainer);
		reqContainerToImplContainer__reqContainer____source.setTrg(reqContainer);
		isApplicableMatch.getAllContextElements().add(reqContainerToImplContainer__reqContainer____source);
		reqContainerToImplContainer__implContainer____target.setSrc(reqContainerToImplContainer);
		reqContainerToImplContainer__implContainer____target.setTrg(implContainer);
		isApplicableMatch.getAllContextElements().add(reqContainerToImplContainer__implContainer____target);
		router__cable____incoming.setName(router__cable____incoming_name_prime);
		cable__router____target.setName(cable__router____target_name_prime);
		implContainer__router____devices.setName(implContainer__router____devices_name_prime);
		virtualNodeToRouter__virtualNode____source.setName(virtualNodeToRouter__virtualNode____source_name_prime);
		virtualNodeToRouter__router____target.setName(virtualNodeToRouter__router____target_name_prime);
		implContainer__server____devices.setName(implContainer__server____devices_name_prime);
		implContainer__cable____cables.setName(implContainer__cable____cables_name_prime);
		reqContainer__virtualNode____networkSpan.setName(reqContainer__virtualNode____networkSpan_name_prime);
		server__cable____outgoing.setName(server__cable____outgoing_name_prime);
		cable__server____source.setName(cable__server____source_name_prime);
		reqContainerToImplContainer__reqContainer____source
				.setName(reqContainerToImplContainer__reqContainer____source_name_prime);
		reqContainerToImplContainer__implContainer____target
				.setName(reqContainerToImplContainer__implContainer____target_name_prime);
		return new Object[] { router, virtualNodeToRouter, implContainer, virtualNode, cable, server, reqContainer,
				reqContainerToImplContainer, isApplicableMatch, router__cable____incoming, cable__router____target,
				implContainer__router____devices, virtualNodeToRouter__virtualNode____source,
				virtualNodeToRouter__router____target, implContainer__server____devices, implContainer__cable____cables,
				reqContainer__virtualNode____networkSpan, server__cable____outgoing, cable__server____source,
				reqContainerToImplContainer__reqContainer____source,
				reqContainerToImplContainer__implContainer____target };
	}

	public static final Object[] pattern_VirtualNodeToServerRule_9_4_solveCSP_bindingFBBBBBBBBBB(
			VirtualNodeToServerRule _this, IsApplicableMatch isApplicableMatch, Router router,
			VirtualNodeToRouter virtualNodeToRouter, implementation.Container implContainer, NetworkSpan virtualNode,
			Cable cable, Server server, Container reqContainer,
			ReqContainerToImplContainer reqContainerToImplContainer) {
		CSP _localVariable_0 = _this.isApplicable_solveCsp_BWD(isApplicableMatch, router, virtualNodeToRouter,
				implContainer, virtualNode, cable, server, reqContainer, reqContainerToImplContainer);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, router, virtualNodeToRouter, implContainer,
					virtualNode, cable, server, reqContainer, reqContainerToImplContainer };
		}
		return null;
	}

	public static final Object[] pattern_VirtualNodeToServerRule_9_4_solveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_VirtualNodeToServerRule_9_4_solveCSP_bindingAndBlackFBBBBBBBBBB(
			VirtualNodeToServerRule _this, IsApplicableMatch isApplicableMatch, Router router,
			VirtualNodeToRouter virtualNodeToRouter, implementation.Container implContainer, NetworkSpan virtualNode,
			Cable cable, Server server, Container reqContainer,
			ReqContainerToImplContainer reqContainerToImplContainer) {
		Object[] result_pattern_VirtualNodeToServerRule_9_4_solveCSP_binding = pattern_VirtualNodeToServerRule_9_4_solveCSP_bindingFBBBBBBBBBB(
				_this, isApplicableMatch, router, virtualNodeToRouter, implContainer, virtualNode, cable, server,
				reqContainer, reqContainerToImplContainer);
		if (result_pattern_VirtualNodeToServerRule_9_4_solveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_VirtualNodeToServerRule_9_4_solveCSP_binding[0];

			Object[] result_pattern_VirtualNodeToServerRule_9_4_solveCSP_black = pattern_VirtualNodeToServerRule_9_4_solveCSP_blackB(
					csp);
			if (result_pattern_VirtualNodeToServerRule_9_4_solveCSP_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, router, virtualNodeToRouter, implContainer,
						virtualNode, cable, server, reqContainer, reqContainerToImplContainer };
			}
		}
		return null;
	}

	public static final boolean pattern_VirtualNodeToServerRule_9_5_checkCSP_expressionFBB(
			VirtualNodeToServerRule _this, CSP csp) {
		boolean _localVariable_0 = _this.isApplicable_checkCsp_BWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_VirtualNodeToServerRule_9_6_addmatchtoruleresult_blackBB(
			IsApplicableRuleResult ruleresult, IsApplicableMatch isApplicableMatch) {
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final Object[] pattern_VirtualNodeToServerRule_9_6_addmatchtoruleresult_greenBB(
			IsApplicableRuleResult ruleresult, IsApplicableMatch isApplicableMatch) {
		ruleresult.getIsApplicableMatch().add(isApplicableMatch);
		boolean ruleresult_success_prime = Boolean.valueOf(true);
		String isApplicableMatch_ruleName_prime = "VirtualNodeToServerRule";
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		isApplicableMatch.setRuleName(isApplicableMatch_ruleName_prime);
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final IsApplicableRuleResult pattern_VirtualNodeToServerRule_9_7_expressionFB(
			IsApplicableRuleResult ruleresult) {
		IsApplicableRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_VirtualNodeToServerRule_17_1_preparereturnvalue_bindingFB(
			VirtualNodeToServerRule _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_VirtualNodeToServerRule_17_1_preparereturnvalue_blackFBBF(EClass __eClass,
			VirtualNodeToServerRule _this) {
		for (EOperation __performOperation : __eClass.getEOperations()) {
			String __performOperation_name = __performOperation.getName();
			if (__performOperation_name.equals("isApplicable_FWD")) {
				for (EOperation isApplicableCC : __eClass.getEOperations()) {
					if (!__performOperation.equals(isApplicableCC)) {
						String isApplicableCC_name = isApplicableCC.getName();
						if (isApplicableCC_name.equals("isApplicable_CC")) {
							return new Object[] { __performOperation, __eClass, _this, isApplicableCC };
						}

					}
				}
			}

		}
		return null;
	}

	public static final Object[] pattern_VirtualNodeToServerRule_17_1_preparereturnvalue_bindingAndBlackFFBF(
			VirtualNodeToServerRule _this) {
		Object[] result_pattern_VirtualNodeToServerRule_17_1_preparereturnvalue_binding = pattern_VirtualNodeToServerRule_17_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_VirtualNodeToServerRule_17_1_preparereturnvalue_binding != null) {
			EClass __eClass = (EClass) result_pattern_VirtualNodeToServerRule_17_1_preparereturnvalue_binding[0];

			Object[] result_pattern_VirtualNodeToServerRule_17_1_preparereturnvalue_black = pattern_VirtualNodeToServerRule_17_1_preparereturnvalue_blackFBBF(
					__eClass, _this);
			if (result_pattern_VirtualNodeToServerRule_17_1_preparereturnvalue_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_VirtualNodeToServerRule_17_1_preparereturnvalue_black[0];
				EOperation isApplicableCC = (EOperation) result_pattern_VirtualNodeToServerRule_17_1_preparereturnvalue_black[3];

				return new Object[] { __performOperation, __eClass, _this, isApplicableCC };
			}
		}
		return null;
	}

	public static final Object[] pattern_VirtualNodeToServerRule_17_1_preparereturnvalue_greenF() {
		EObjectContainer __result = RuntimeFactory.eINSTANCE.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Iterable<Object[]> pattern_VirtualNodeToServerRule_17_2_testcorematchandDECs_blackBF(
			NetworkSpan virtualNode) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		for (Container reqContainer : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(virtualNode,
				Container.class, "networkSpan")) {
			_result.add(new Object[] { virtualNode, reqContainer });
		}
		return _result;
	}

	public static final Object[] pattern_VirtualNodeToServerRule_17_2_testcorematchandDECs_greenFB(EClass __eClass) {
		Match match = RuntimeFactory.eINSTANCE.createMatch();
		String __eClass_name = __eClass.getName();
		String match_ruleName_prime = __eClass_name;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_VirtualNodeToServerRule_17_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBB(
			VirtualNodeToServerRule _this, Match match, NetworkSpan virtualNode, Container reqContainer) {
		boolean _localVariable_0 = _this.isAppropriate_FWD(match, virtualNode, reqContainer);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_VirtualNodeToServerRule_17_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(
			VirtualNodeToServerRule _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_FWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_VirtualNodeToServerRule_17_5_Addmatchtoruleresult_blackBBBB(Match match,
			EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		if (!__performOperation.equals(isApplicableCC)) {
			return new Object[] { match, __performOperation, __result, isApplicableCC };
		}
		return null;
	}

	public static final Object[] pattern_VirtualNodeToServerRule_17_5_Addmatchtoruleresult_greenBBBB(Match match,
			EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		match.setIsApplicableCCOperation(isApplicableCC);
		return new Object[] { match, __performOperation, __result, isApplicableCC };
	}

	public static final EObjectContainer pattern_VirtualNodeToServerRule_17_6_expressionFB(EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_VirtualNodeToServerRule_18_1_preparereturnvalue_bindingFB(
			VirtualNodeToServerRule _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_VirtualNodeToServerRule_18_1_preparereturnvalue_blackFBBF(EClass __eClass,
			VirtualNodeToServerRule _this) {
		for (EOperation __performOperation : __eClass.getEOperations()) {
			String __performOperation_name = __performOperation.getName();
			if (__performOperation_name.equals("isApplicable_BWD")) {
				for (EOperation isApplicableCC : __eClass.getEOperations()) {
					if (!__performOperation.equals(isApplicableCC)) {
						String isApplicableCC_name = isApplicableCC.getName();
						if (isApplicableCC_name.equals("isApplicable_CC")) {
							return new Object[] { __performOperation, __eClass, _this, isApplicableCC };
						}

					}
				}
			}

		}
		return null;
	}

	public static final Object[] pattern_VirtualNodeToServerRule_18_1_preparereturnvalue_bindingAndBlackFFBF(
			VirtualNodeToServerRule _this) {
		Object[] result_pattern_VirtualNodeToServerRule_18_1_preparereturnvalue_binding = pattern_VirtualNodeToServerRule_18_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_VirtualNodeToServerRule_18_1_preparereturnvalue_binding != null) {
			EClass __eClass = (EClass) result_pattern_VirtualNodeToServerRule_18_1_preparereturnvalue_binding[0];

			Object[] result_pattern_VirtualNodeToServerRule_18_1_preparereturnvalue_black = pattern_VirtualNodeToServerRule_18_1_preparereturnvalue_blackFBBF(
					__eClass, _this);
			if (result_pattern_VirtualNodeToServerRule_18_1_preparereturnvalue_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_VirtualNodeToServerRule_18_1_preparereturnvalue_black[0];
				EOperation isApplicableCC = (EOperation) result_pattern_VirtualNodeToServerRule_18_1_preparereturnvalue_black[3];

				return new Object[] { __performOperation, __eClass, _this, isApplicableCC };
			}
		}
		return null;
	}

	public static final Object[] pattern_VirtualNodeToServerRule_18_1_preparereturnvalue_greenF() {
		EObjectContainer __result = RuntimeFactory.eINSTANCE.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Iterable<Object[]> pattern_VirtualNodeToServerRule_18_2_testcorematchandDECs_blackFFFFB(
			EMoflonEdge _edge_incoming) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		EObject tmpRouter = _edge_incoming.getSrc();
		if (tmpRouter instanceof Router) {
			Router router = (Router) tmpRouter;
			EObject tmpCable = _edge_incoming.getTrg();
			if (tmpCable instanceof Cable) {
				Cable cable = (Cable) tmpCable;
				if (router.getIncoming().contains(cable)) {
					Device tmpServer = cable.getSource();
					if (tmpServer instanceof Server) {
						Server server = (Server) tmpServer;
						for (implementation.Container implContainer : org.moflon.core.utilities.eMoflonEMFUtil
								.getOppositeReferenceTyped(router, implementation.Container.class, "devices")) {
							if (implContainer.getDevices().contains(server)) {
								if (implContainer.getCables().contains(cable)) {
									_result.add(new Object[] { router, implContainer, cable, server, _edge_incoming });
								}
							}
						}
					}

				}
			}

		}

		return _result;
	}

	public static final Object[] pattern_VirtualNodeToServerRule_18_2_testcorematchandDECs_greenFB(EClass __eClass) {
		Match match = RuntimeFactory.eINSTANCE.createMatch();
		String __eClass_name = __eClass.getName();
		String match_ruleName_prime = __eClass_name;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_VirtualNodeToServerRule_18_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBBBB(
			VirtualNodeToServerRule _this, Match match, Router router, implementation.Container implContainer,
			Cable cable, Server server) {
		boolean _localVariable_0 = _this.isAppropriate_BWD(match, router, implContainer, cable, server);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_VirtualNodeToServerRule_18_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(
			VirtualNodeToServerRule _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_BWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_VirtualNodeToServerRule_18_5_Addmatchtoruleresult_blackBBBB(Match match,
			EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		if (!__performOperation.equals(isApplicableCC)) {
			return new Object[] { match, __performOperation, __result, isApplicableCC };
		}
		return null;
	}

	public static final Object[] pattern_VirtualNodeToServerRule_18_5_Addmatchtoruleresult_greenBBBB(Match match,
			EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		match.setIsApplicableCCOperation(isApplicableCC);
		return new Object[] { match, __performOperation, __result, isApplicableCC };
	}

	public static final EObjectContainer pattern_VirtualNodeToServerRule_18_6_expressionFB(EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_VirtualNodeToServerRule_21_1_prepare_blackB(VirtualNodeToServerRule _this) {
		return new Object[] { _this };
	}

	public static final Object[] pattern_VirtualNodeToServerRule_21_1_prepare_greenF() {
		IsApplicableRuleResult result = RuntimeFactory.eINSTANCE.createIsApplicableRuleResult();
		return new Object[] { result };
	}

	public static final Object[] pattern_VirtualNodeToServerRule_21_2_matchsrctrgcontext_bindingFFFFFFBB(
			Match targetMatch, Match sourceMatch) {
		EObject _localVariable_0 = targetMatch.getObject("router");
		EObject _localVariable_1 = targetMatch.getObject("implContainer");
		EObject _localVariable_2 = sourceMatch.getObject("virtualNode");
		EObject _localVariable_3 = targetMatch.getObject("cable");
		EObject _localVariable_4 = targetMatch.getObject("server");
		EObject _localVariable_5 = sourceMatch.getObject("reqContainer");
		EObject tmpRouter = _localVariable_0;
		EObject tmpImplContainer = _localVariable_1;
		EObject tmpVirtualNode = _localVariable_2;
		EObject tmpCable = _localVariable_3;
		EObject tmpServer = _localVariable_4;
		EObject tmpReqContainer = _localVariable_5;
		if (tmpRouter instanceof Router) {
			Router router = (Router) tmpRouter;
			if (tmpImplContainer instanceof implementation.Container) {
				implementation.Container implContainer = (implementation.Container) tmpImplContainer;
				if (tmpVirtualNode instanceof NetworkSpan) {
					NetworkSpan virtualNode = (NetworkSpan) tmpVirtualNode;
					if (tmpCable instanceof Cable) {
						Cable cable = (Cable) tmpCable;
						if (tmpServer instanceof Server) {
							Server server = (Server) tmpServer;
							if (tmpReqContainer instanceof Container) {
								Container reqContainer = (Container) tmpReqContainer;
								return new Object[] { router, implContainer, virtualNode, cable, server, reqContainer,
										targetMatch, sourceMatch };
							}
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_VirtualNodeToServerRule_21_2_matchsrctrgcontext_blackBBBBBBBB(Router router,
			implementation.Container implContainer, NetworkSpan virtualNode, Cable cable, Server server,
			Container reqContainer, Match sourceMatch, Match targetMatch) {
		if (!sourceMatch.equals(targetMatch)) {
			return new Object[] { router, implContainer, virtualNode, cable, server, reqContainer, sourceMatch,
					targetMatch };
		}
		return null;
	}

	public static final Object[] pattern_VirtualNodeToServerRule_21_2_matchsrctrgcontext_bindingAndBlackFFFFFFBB(
			Match sourceMatch, Match targetMatch) {
		Object[] result_pattern_VirtualNodeToServerRule_21_2_matchsrctrgcontext_binding = pattern_VirtualNodeToServerRule_21_2_matchsrctrgcontext_bindingFFFFFFBB(
				targetMatch, sourceMatch);
		if (result_pattern_VirtualNodeToServerRule_21_2_matchsrctrgcontext_binding != null) {
			Router router = (Router) result_pattern_VirtualNodeToServerRule_21_2_matchsrctrgcontext_binding[0];
			implementation.Container implContainer = (implementation.Container) result_pattern_VirtualNodeToServerRule_21_2_matchsrctrgcontext_binding[1];
			NetworkSpan virtualNode = (NetworkSpan) result_pattern_VirtualNodeToServerRule_21_2_matchsrctrgcontext_binding[2];
			Cable cable = (Cable) result_pattern_VirtualNodeToServerRule_21_2_matchsrctrgcontext_binding[3];
			Server server = (Server) result_pattern_VirtualNodeToServerRule_21_2_matchsrctrgcontext_binding[4];
			Container reqContainer = (Container) result_pattern_VirtualNodeToServerRule_21_2_matchsrctrgcontext_binding[5];

			Object[] result_pattern_VirtualNodeToServerRule_21_2_matchsrctrgcontext_black = pattern_VirtualNodeToServerRule_21_2_matchsrctrgcontext_blackBBBBBBBB(
					router, implContainer, virtualNode, cable, server, reqContainer, sourceMatch, targetMatch);
			if (result_pattern_VirtualNodeToServerRule_21_2_matchsrctrgcontext_black != null) {

				return new Object[] { router, implContainer, virtualNode, cable, server, reqContainer, sourceMatch,
						targetMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_VirtualNodeToServerRule_21_3_solvecsp_bindingFBBBBBBBBB(
			VirtualNodeToServerRule _this, Router router, implementation.Container implContainer,
			NetworkSpan virtualNode, Cable cable, Server server, Container reqContainer, Match sourceMatch,
			Match targetMatch) {
		CSP _localVariable_6 = _this.isApplicable_solveCsp_CC(router, implContainer, virtualNode, cable, server,
				reqContainer, sourceMatch, targetMatch);
		CSP csp = _localVariable_6;
		if (csp != null) {
			return new Object[] { csp, _this, router, implContainer, virtualNode, cable, server, reqContainer,
					sourceMatch, targetMatch };
		}
		return null;
	}

	public static final Object[] pattern_VirtualNodeToServerRule_21_3_solvecsp_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_VirtualNodeToServerRule_21_3_solvecsp_bindingAndBlackFBBBBBBBBB(
			VirtualNodeToServerRule _this, Router router, implementation.Container implContainer,
			NetworkSpan virtualNode, Cable cable, Server server, Container reqContainer, Match sourceMatch,
			Match targetMatch) {
		Object[] result_pattern_VirtualNodeToServerRule_21_3_solvecsp_binding = pattern_VirtualNodeToServerRule_21_3_solvecsp_bindingFBBBBBBBBB(
				_this, router, implContainer, virtualNode, cable, server, reqContainer, sourceMatch, targetMatch);
		if (result_pattern_VirtualNodeToServerRule_21_3_solvecsp_binding != null) {
			CSP csp = (CSP) result_pattern_VirtualNodeToServerRule_21_3_solvecsp_binding[0];

			Object[] result_pattern_VirtualNodeToServerRule_21_3_solvecsp_black = pattern_VirtualNodeToServerRule_21_3_solvecsp_blackB(
					csp);
			if (result_pattern_VirtualNodeToServerRule_21_3_solvecsp_black != null) {

				return new Object[] { csp, _this, router, implContainer, virtualNode, cable, server, reqContainer,
						sourceMatch, targetMatch };
			}
		}
		return null;
	}

	public static final boolean pattern_VirtualNodeToServerRule_21_4_checkCSP_expressionFB(CSP csp) {
		boolean _localVariable_0 = csp.check();
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Iterable<Object[]> pattern_VirtualNodeToServerRule_21_5_matchcorrcontext_blackBFBBBFBB(
			Router router, implementation.Container implContainer, NetworkSpan virtualNode, Container reqContainer,
			Match sourceMatch, Match targetMatch) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (!sourceMatch.equals(targetMatch)) {
			for (VirtualNodeToRouter virtualNodeToRouter : org.moflon.core.utilities.eMoflonEMFUtil
					.getOppositeReferenceTyped(virtualNode, VirtualNodeToRouter.class, "source")) {
				if (router.equals(virtualNodeToRouter.getTarget())) {
					for (ReqContainerToImplContainer reqContainerToImplContainer : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(reqContainer, ReqContainerToImplContainer.class, "source")) {
						if (implContainer.equals(reqContainerToImplContainer.getTarget())) {
							_result.add(new Object[] { router, virtualNodeToRouter, implContainer, virtualNode,
									reqContainer, reqContainerToImplContainer, sourceMatch, targetMatch });
						}
					}
				}
			}
		}
		return _result;
	}

	public static final Object[] pattern_VirtualNodeToServerRule_21_5_matchcorrcontext_greenBBBBF(
			VirtualNodeToRouter virtualNodeToRouter, ReqContainerToImplContainer reqContainerToImplContainer,
			Match sourceMatch, Match targetMatch) {
		CCMatch ccMatch = RuntimeFactory.eINSTANCE.createCCMatch();
		String ccMatch_ruleName_prime = "VirtualNodeToServerRule";
		ccMatch.setSourceMatch(sourceMatch);
		ccMatch.setTargetMatch(targetMatch);
		ccMatch.getAllContextElements().add(virtualNodeToRouter);
		ccMatch.getAllContextElements().add(reqContainerToImplContainer);
		ccMatch.setRuleName(ccMatch_ruleName_prime);
		return new Object[] { virtualNodeToRouter, reqContainerToImplContainer, sourceMatch, targetMatch, ccMatch };
	}

	public static final Object[] pattern_VirtualNodeToServerRule_21_6_createcorrespondence_blackBBBBBBB(Router router,
			implementation.Container implContainer, NetworkSpan virtualNode, Cable cable, Server server,
			Container reqContainer, CCMatch ccMatch) {
		return new Object[] { router, implContainer, virtualNode, cable, server, reqContainer, ccMatch };
	}

	public static final Object[] pattern_VirtualNodeToServerRule_21_6_createcorrespondence_greenFBBB(
			NetworkSpan virtualNode, Server server, CCMatch ccMatch) {
		VirtualNodeToServer virtualNodeToServer = ReqToImpTransformatorFactory.eINSTANCE.createVirtualNodeToServer();
		virtualNodeToServer.setSource(virtualNode);
		virtualNodeToServer.setTarget(server);
		ccMatch.getCreateCorr().add(virtualNodeToServer);
		return new Object[] { virtualNodeToServer, virtualNode, server, ccMatch };
	}

	public static final Object[] pattern_VirtualNodeToServerRule_21_7_addtoreturnedresult_blackBB(
			IsApplicableRuleResult result, CCMatch ccMatch) {
		return new Object[] { result, ccMatch };
	}

	public static final Object[] pattern_VirtualNodeToServerRule_21_7_addtoreturnedresult_greenBB(
			IsApplicableRuleResult result, CCMatch ccMatch) {
		result.getIsApplicableMatch().add(ccMatch);
		boolean result_success_prime = Boolean.valueOf(true);
		String ccMatch_ruleName_prime = "VirtualNodeToServerRule";
		result.setSuccess(Boolean.valueOf(result_success_prime));
		ccMatch.setRuleName(ccMatch_ruleName_prime);
		return new Object[] { result, ccMatch };
	}

	public static final IsApplicableRuleResult pattern_VirtualNodeToServerRule_21_8_expressionFB(
			IsApplicableRuleResult result) {
		IsApplicableRuleResult _result = result;
		return _result;
	}

	public static final Object[] pattern_VirtualNodeToServerRule_24_1_matchtggpattern_blackBB(NetworkSpan virtualNode,
			Container reqContainer) {
		if (virtualNode.equals(reqContainer.getNetworkSpan())) {
			return new Object[] { virtualNode, reqContainer };
		}
		return null;
	}

	public static final boolean pattern_VirtualNodeToServerRule_24_2_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_VirtualNodeToServerRule_24_3_expressionF() {
		boolean _result = Boolean.valueOf(false);
		return _result;
	}

	public static final Object[] pattern_VirtualNodeToServerRule_25_1_matchtggpattern_blackBBBB(Router router,
			implementation.Container implContainer, Cable cable, Server server) {
		if (router.getIncoming().contains(cable)) {
			if (implContainer.getDevices().contains(router)) {
				if (implContainer.getDevices().contains(server)) {
					if (implContainer.getCables().contains(cable)) {
						if (server.getOutgoing().contains(cable)) {
							return new Object[] { router, implContainer, cable, server };
						}
					}
				}
			}
		}
		return null;
	}

	public static final boolean pattern_VirtualNodeToServerRule_25_2_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_VirtualNodeToServerRule_25_3_expressionF() {
		boolean _result = Boolean.valueOf(false);
		return _result;
	}

	public static final Object[] pattern_VirtualNodeToServerRule_26_1_createresult_blackB(
			VirtualNodeToServerRule _this) {
		return new Object[] { _this };
	}

	public static final Object[] pattern_VirtualNodeToServerRule_26_1_createresult_greenFF() {
		IsApplicableMatch isApplicableMatch = RuntimeFactory.eINSTANCE.createIsApplicableMatch();
		ModelgeneratorRuleResult ruleResult = RuntimeFactory.eINSTANCE.createModelgeneratorRuleResult();
		boolean ruleResult_success_prime = Boolean.valueOf(false);
		ruleResult.setSuccess(Boolean.valueOf(ruleResult_success_prime));
		return new Object[] { isApplicableMatch, ruleResult };
	}

	public static final Object[] pattern_VirtualNodeToServerRule_26_2_isapplicablecore_black_nac_0BB(
			ModelgeneratorRuleResult ruleResult, Router router) {
		if (ruleResult.getTargetObjects().contains(router)) {
			return new Object[] { ruleResult, router };
		}
		return null;
	}

	public static final Object[] pattern_VirtualNodeToServerRule_26_2_isapplicablecore_black_nac_1BB(
			ModelgeneratorRuleResult ruleResult, VirtualNodeToRouter virtualNodeToRouter) {
		if (ruleResult.getCorrObjects().contains(virtualNodeToRouter)) {
			return new Object[] { ruleResult, virtualNodeToRouter };
		}
		return null;
	}

	public static final Object[] pattern_VirtualNodeToServerRule_26_2_isapplicablecore_black_nac_2BB(
			ModelgeneratorRuleResult ruleResult, NetworkSpan virtualNode) {
		if (ruleResult.getSourceObjects().contains(virtualNode)) {
			return new Object[] { ruleResult, virtualNode };
		}
		return null;
	}

	public static final Object[] pattern_VirtualNodeToServerRule_26_2_isapplicablecore_black_nac_3BB(
			ModelgeneratorRuleResult ruleResult, Container reqContainer) {
		if (ruleResult.getSourceObjects().contains(reqContainer)) {
			return new Object[] { ruleResult, reqContainer };
		}
		return null;
	}

	public static final Object[] pattern_VirtualNodeToServerRule_26_2_isapplicablecore_black_nac_4BB(
			ModelgeneratorRuleResult ruleResult, ReqContainerToImplContainer reqContainerToImplContainer) {
		if (ruleResult.getCorrObjects().contains(reqContainerToImplContainer)) {
			return new Object[] { ruleResult, reqContainerToImplContainer };
		}
		return null;
	}

	public static final Object[] pattern_VirtualNodeToServerRule_26_2_isapplicablecore_black_nac_5BB(
			ModelgeneratorRuleResult ruleResult, implementation.Container implContainer) {
		if (ruleResult.getTargetObjects().contains(implContainer)) {
			return new Object[] { ruleResult, implContainer };
		}
		return null;
	}

	public static final Object[] pattern_VirtualNodeToServerRule_26_2_isapplicablecore_black_nac_6BB(
			ModelgeneratorRuleResult ruleResult, Cable cable) {
		if (ruleResult.getTargetObjects().contains(cable)) {
			return new Object[] { ruleResult, cable };
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_VirtualNodeToServerRule_26_2_isapplicablecore_blackFFFFFFFFBB(
			RuleEntryContainer ruleEntryContainer, ModelgeneratorRuleResult ruleResult) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		for (RuleEntryList virtualNodeToRouterList : ruleEntryContainer.getRuleEntryList()) {
			for (EObject tmpVirtualNodeToRouter : virtualNodeToRouterList.getEntryObjects()) {
				if (tmpVirtualNodeToRouter instanceof VirtualNodeToRouter) {
					VirtualNodeToRouter virtualNodeToRouter = (VirtualNodeToRouter) tmpVirtualNodeToRouter;
					Router router = virtualNodeToRouter.getTarget();
					if (router != null) {
						NetworkSpan virtualNode = virtualNodeToRouter.getSource();
						if (virtualNode != null) {
							if (pattern_VirtualNodeToServerRule_26_2_isapplicablecore_black_nac_1BB(ruleResult,
									virtualNodeToRouter) == null) {
								if (pattern_VirtualNodeToServerRule_26_2_isapplicablecore_black_nac_0BB(ruleResult,
										router) == null) {
									if (pattern_VirtualNodeToServerRule_26_2_isapplicablecore_black_nac_2BB(ruleResult,
											virtualNode) == null) {
										for (implementation.Container implContainer : org.moflon.core.utilities.eMoflonEMFUtil
												.getOppositeReferenceTyped(router, implementation.Container.class,
														"devices")) {
											if (pattern_VirtualNodeToServerRule_26_2_isapplicablecore_black_nac_5BB(
													ruleResult, implContainer) == null) {
												for (Cable cable : implContainer.getCables()) {
													if (pattern_VirtualNodeToServerRule_26_2_isapplicablecore_black_nac_6BB(
															ruleResult, cable) == null) {
														for (Container reqContainer : org.moflon.core.utilities.eMoflonEMFUtil
																.getOppositeReferenceTyped(virtualNode, Container.class,
																		"networkSpan")) {
															if (pattern_VirtualNodeToServerRule_26_2_isapplicablecore_black_nac_3BB(
																	ruleResult, reqContainer) == null) {
																for (ReqContainerToImplContainer reqContainerToImplContainer : org.moflon.core.utilities.eMoflonEMFUtil
																		.getOppositeReferenceTyped(implContainer,
																				ReqContainerToImplContainer.class,
																				"target")) {
																	if (reqContainer.equals(
																			reqContainerToImplContainer.getSource())) {
																		if (pattern_VirtualNodeToServerRule_26_2_isapplicablecore_black_nac_4BB(
																				ruleResult,
																				reqContainerToImplContainer) == null) {
																			_result.add(new Object[] {
																					virtualNodeToRouterList, router,
																					virtualNodeToRouter, virtualNode,
																					reqContainer,
																					reqContainerToImplContainer,
																					implContainer, cable,
																					ruleEntryContainer, ruleResult });
																		}
																	}
																}
															}
														}
													}
												}
											}
										}
									}
								}
							}
						}

					}

				}
			}
		}
		return _result;
	}

	public static final Object[] pattern_VirtualNodeToServerRule_26_3_solveCSP_bindingFBBBBBBBBBB(
			VirtualNodeToServerRule _this, IsApplicableMatch isApplicableMatch, Router router,
			VirtualNodeToRouter virtualNodeToRouter, implementation.Container implContainer, NetworkSpan virtualNode,
			Cable cable, Container reqContainer, ReqContainerToImplContainer reqContainerToImplContainer,
			ModelgeneratorRuleResult ruleResult) {
		CSP _localVariable_0 = _this.generateModel_solveCsp_BWD(isApplicableMatch, router, virtualNodeToRouter,
				implContainer, virtualNode, cable, reqContainer, reqContainerToImplContainer, ruleResult);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, router, virtualNodeToRouter, implContainer,
					virtualNode, cable, reqContainer, reqContainerToImplContainer, ruleResult };
		}
		return null;
	}

	public static final Object[] pattern_VirtualNodeToServerRule_26_3_solveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_VirtualNodeToServerRule_26_3_solveCSP_bindingAndBlackFBBBBBBBBBB(
			VirtualNodeToServerRule _this, IsApplicableMatch isApplicableMatch, Router router,
			VirtualNodeToRouter virtualNodeToRouter, implementation.Container implContainer, NetworkSpan virtualNode,
			Cable cable, Container reqContainer, ReqContainerToImplContainer reqContainerToImplContainer,
			ModelgeneratorRuleResult ruleResult) {
		Object[] result_pattern_VirtualNodeToServerRule_26_3_solveCSP_binding = pattern_VirtualNodeToServerRule_26_3_solveCSP_bindingFBBBBBBBBBB(
				_this, isApplicableMatch, router, virtualNodeToRouter, implContainer, virtualNode, cable, reqContainer,
				reqContainerToImplContainer, ruleResult);
		if (result_pattern_VirtualNodeToServerRule_26_3_solveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_VirtualNodeToServerRule_26_3_solveCSP_binding[0];

			Object[] result_pattern_VirtualNodeToServerRule_26_3_solveCSP_black = pattern_VirtualNodeToServerRule_26_3_solveCSP_blackB(
					csp);
			if (result_pattern_VirtualNodeToServerRule_26_3_solveCSP_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, router, virtualNodeToRouter, implContainer,
						virtualNode, cable, reqContainer, reqContainerToImplContainer, ruleResult };
			}
		}
		return null;
	}

	public static final boolean pattern_VirtualNodeToServerRule_26_4_checkCSP_expressionFBB(
			VirtualNodeToServerRule _this, CSP csp) {
		boolean _localVariable_0 = _this.generateModel_checkCsp_BWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_VirtualNodeToServerRule_26_5_checknacs_blackBBBBBBB(Router router,
			VirtualNodeToRouter virtualNodeToRouter, implementation.Container implContainer, NetworkSpan virtualNode,
			Cable cable, Container reqContainer, ReqContainerToImplContainer reqContainerToImplContainer) {
		return new Object[] { router, virtualNodeToRouter, implContainer, virtualNode, cable, reqContainer,
				reqContainerToImplContainer };
	}

	public static final Object[] pattern_VirtualNodeToServerRule_26_6_perform_blackBBBBBBBB(Router router,
			VirtualNodeToRouter virtualNodeToRouter, implementation.Container implContainer, NetworkSpan virtualNode,
			Cable cable, Container reqContainer, ReqContainerToImplContainer reqContainerToImplContainer,
			ModelgeneratorRuleResult ruleResult) {
		return new Object[] { router, virtualNodeToRouter, implContainer, virtualNode, cable, reqContainer,
				reqContainerToImplContainer, ruleResult };
	}

	public static final Object[] pattern_VirtualNodeToServerRule_26_6_perform_greenBBFBBFB(Router router,
			implementation.Container implContainer, NetworkSpan virtualNode, Cable cable,
			ModelgeneratorRuleResult ruleResult) {
		VirtualNodeToServer virtualNodeToServer = ReqToImpTransformatorFactory.eINSTANCE.createVirtualNodeToServer();
		Server server = ImplementationFactory.eINSTANCE.createServer();
		router.getIncoming().add(cable);
		boolean ruleResult_success_prime = Boolean.valueOf(true);
		int _localVariable_0 = ruleResult.getIncrementedPerformCount();
		virtualNodeToServer.setSource(virtualNode);
		ruleResult.getCorrObjects().add(virtualNodeToServer);
		implContainer.getDevices().add(server);
		virtualNodeToServer.setTarget(server);
		server.getOutgoing().add(cable);
		ruleResult.getTargetObjects().add(server);
		ruleResult.setSuccess(Boolean.valueOf(ruleResult_success_prime));
		int ruleResult_performCount_prime = Integer.valueOf(_localVariable_0);
		ruleResult.setPerformCount(Integer.valueOf(ruleResult_performCount_prime));
		return new Object[] { router, implContainer, virtualNodeToServer, virtualNode, cable, server, ruleResult };
	}

	public static final ModelgeneratorRuleResult pattern_VirtualNodeToServerRule_26_7_expressionFB(
			ModelgeneratorRuleResult ruleResult) {
		ModelgeneratorRuleResult _result = ruleResult;
		return _result;
	}

	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} //VirtualNodeToServerRuleImpl
