/**
 */
package Rzutykoscia.util;

import Rzutykoscia.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see Rzutykoscia.RzutykosciaPackage
 * @generated
 */
public class RzutykosciaAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static RzutykosciaPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RzutykosciaAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = RzutykosciaPackage.eINSTANCE;
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
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RzutykosciaSwitch<Adapter> modelSwitch =
		new RzutykosciaSwitch<Adapter>() {
			@Override
			public Adapter caseLanguage(Language object) {
				return createLanguageAdapter();
			}
			@Override
			public Adapter caseStat(Stat object) {
				return createStatAdapter();
			}
			@Override
			public Adapter caseSumStatement(SumStatement object) {
				return createSumStatementAdapter();
			}
			@Override
			public Adapter caseSuccessStatement(SuccessStatement object) {
				return createSuccessStatementAdapter();
			}
			@Override
			public Adapter caseDiceExpr(DiceExpr object) {
				return createDiceExprAdapter();
			}
			@Override
			public Adapter caseDiceExprSum(DiceExprSum object) {
				return createDiceExprSumAdapter();
			}
			@Override
			public Adapter caseDiceExprSuk(DiceExprSuk object) {
				return createDiceExprSukAdapter();
			}
			@Override
			public Adapter caseMulExpr(MulExpr object) {
				return createMulExprAdapter();
			}
			@Override
			public Adapter caseFormExpr(FormExpr object) {
				return createFormExprAdapter();
			}
			@Override
			public Adapter caseDice(Dice object) {
				return createDiceAdapter();
			}
			@Override
			public Adapter caseSingleDice(SingleDice object) {
				return createSingleDiceAdapter();
			}
			@Override
			public Adapter caseMultiDice(MultiDice object) {
				return createMultiDiceAdapter();
			}
			@Override
			public Adapter caseNum(Num object) {
				return createNumAdapter();
			}
			@Override
			public Adapter caseSumRule(SumRule object) {
				return createSumRuleAdapter();
			}
			@Override
			public Adapter caseSuccessRule(SuccessRule object) {
				return createSuccessRuleAdapter();
			}
			@Override
			public Adapter caseExplosionRule(ExplosionRule object) {
				return createExplosionRuleAdapter();
			}
			@Override
			public Adapter caseDiceMarkSum(DiceMarkSum object) {
				return createDiceMarkSumAdapter();
			}
			@Override
			public Adapter caseDiceDiscSum(DiceDiscSum object) {
				return createDiceDiscSumAdapter();
			}
			@Override
			public Adapter caseDiceRerollSum(DiceRerollSum object) {
				return createDiceRerollSumAdapter();
			}
			@Override
			public Adapter caseSuccessBasic(SuccessBasic object) {
				return createSuccessBasicAdapter();
			}
			@Override
			public Adapter caseSuccessThreshold(SuccessThreshold object) {
				return createSuccessThresholdAdapter();
			}
			@Override
			public Adapter caseSuccessMultiplier(SuccessMultiplier object) {
				return createSuccessMultiplierAdapter();
			}
			@Override
			public Adapter caseDiceMarkSuk(DiceMarkSuk object) {
				return createDiceMarkSukAdapter();
			}
			@Override
			public Adapter caseDiceDiscSuk(DiceDiscSuk object) {
				return createDiceDiscSukAdapter();
			}
			@Override
			public Adapter caseDiceRerollSuk(DiceRerollSuk object) {
				return createDiceRerollSukAdapter();
			}
			@Override
			public Adapter caseMark(Mark object) {
				return createMarkAdapter();
			}
			@Override
			public Adapter caseDiscard(Discard object) {
				return createDiscardAdapter();
			}
			@Override
			public Adapter caseReroll(Reroll object) {
				return createRerollAdapter();
			}
			@Override
			public Adapter caseMarkThan(MarkThan object) {
				return createMarkThanAdapter();
			}
			@Override
			public Adapter caseMarkHigh(MarkHigh object) {
				return createMarkHighAdapter();
			}
			@Override
			public Adapter caseMarkKol(MarkKol object) {
				return createMarkKolAdapter();
			}
			@Override
			public Adapter caseMarkNum(MarkNum object) {
				return createMarkNumAdapter();
			}
			@Override
			public Adapter caseRerollHigh(RerollHigh object) {
				return createRerollHighAdapter();
			}
			@Override
			public Adapter caseRerollThan(RerollThan object) {
				return createRerollThanAdapter();
			}
			@Override
			public Adapter caseRerollKol(RerollKol object) {
				return createRerollKolAdapter();
			}
			@Override
			public Adapter caseRerollNum(RerollNum object) {
				return createRerollNumAdapter();
			}
			@Override
			public Adapter caseDiscardKol(DiscardKol object) {
				return createDiscardKolAdapter();
			}
			@Override
			public Adapter caseDiscardNum(DiscardNum object) {
				return createDiscardNumAdapter();
			}
			@Override
			public Adapter caseDiscardHigh(DiscardHigh object) {
				return createDiscardHighAdapter();
			}
			@Override
			public Adapter caseDiscardThan(DiscardThan object) {
				return createDiscardThanAdapter();
			}
			@Override
			public Adapter caseSuccessCompositeRule(SuccessCompositeRule object) {
				return createSuccessCompositeRuleAdapter();
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
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link Rzutykoscia.Language <em>Language</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Rzutykoscia.Language
	 * @generated
	 */
	public Adapter createLanguageAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Rzutykoscia.Stat <em>Stat</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Rzutykoscia.Stat
	 * @generated
	 */
	public Adapter createStatAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Rzutykoscia.SumStatement <em>Sum Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Rzutykoscia.SumStatement
	 * @generated
	 */
	public Adapter createSumStatementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Rzutykoscia.SuccessStatement <em>Success Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Rzutykoscia.SuccessStatement
	 * @generated
	 */
	public Adapter createSuccessStatementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Rzutykoscia.DiceExpr <em>Dice Expr</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Rzutykoscia.DiceExpr
	 * @generated
	 */
	public Adapter createDiceExprAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Rzutykoscia.DiceExprSum <em>Dice Expr Sum</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Rzutykoscia.DiceExprSum
	 * @generated
	 */
	public Adapter createDiceExprSumAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Rzutykoscia.DiceExprSuk <em>Dice Expr Suk</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Rzutykoscia.DiceExprSuk
	 * @generated
	 */
	public Adapter createDiceExprSukAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Rzutykoscia.MulExpr <em>Mul Expr</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Rzutykoscia.MulExpr
	 * @generated
	 */
	public Adapter createMulExprAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Rzutykoscia.FormExpr <em>Form Expr</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Rzutykoscia.FormExpr
	 * @generated
	 */
	public Adapter createFormExprAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Rzutykoscia.Dice <em>Dice</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Rzutykoscia.Dice
	 * @generated
	 */
	public Adapter createDiceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Rzutykoscia.SingleDice <em>Single Dice</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Rzutykoscia.SingleDice
	 * @generated
	 */
	public Adapter createSingleDiceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Rzutykoscia.MultiDice <em>Multi Dice</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Rzutykoscia.MultiDice
	 * @generated
	 */
	public Adapter createMultiDiceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Rzutykoscia.Num <em>Num</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Rzutykoscia.Num
	 * @generated
	 */
	public Adapter createNumAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Rzutykoscia.SumRule <em>Sum Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Rzutykoscia.SumRule
	 * @generated
	 */
	public Adapter createSumRuleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Rzutykoscia.SuccessRule <em>Success Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Rzutykoscia.SuccessRule
	 * @generated
	 */
	public Adapter createSuccessRuleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Rzutykoscia.ExplosionRule <em>Explosion Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Rzutykoscia.ExplosionRule
	 * @generated
	 */
	public Adapter createExplosionRuleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Rzutykoscia.DiceMarkSum <em>Dice Mark Sum</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Rzutykoscia.DiceMarkSum
	 * @generated
	 */
	public Adapter createDiceMarkSumAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Rzutykoscia.DiceDiscSum <em>Dice Disc Sum</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Rzutykoscia.DiceDiscSum
	 * @generated
	 */
	public Adapter createDiceDiscSumAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Rzutykoscia.DiceRerollSum <em>Dice Reroll Sum</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Rzutykoscia.DiceRerollSum
	 * @generated
	 */
	public Adapter createDiceRerollSumAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Rzutykoscia.SuccessBasic <em>Success Basic</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Rzutykoscia.SuccessBasic
	 * @generated
	 */
	public Adapter createSuccessBasicAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Rzutykoscia.SuccessThreshold <em>Success Threshold</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Rzutykoscia.SuccessThreshold
	 * @generated
	 */
	public Adapter createSuccessThresholdAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Rzutykoscia.SuccessMultiplier <em>Success Multiplier</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Rzutykoscia.SuccessMultiplier
	 * @generated
	 */
	public Adapter createSuccessMultiplierAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Rzutykoscia.DiceMarkSuk <em>Dice Mark Suk</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Rzutykoscia.DiceMarkSuk
	 * @generated
	 */
	public Adapter createDiceMarkSukAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Rzutykoscia.DiceDiscSuk <em>Dice Disc Suk</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Rzutykoscia.DiceDiscSuk
	 * @generated
	 */
	public Adapter createDiceDiscSukAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Rzutykoscia.DiceRerollSuk <em>Dice Reroll Suk</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Rzutykoscia.DiceRerollSuk
	 * @generated
	 */
	public Adapter createDiceRerollSukAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Rzutykoscia.Mark <em>Mark</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Rzutykoscia.Mark
	 * @generated
	 */
	public Adapter createMarkAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Rzutykoscia.Discard <em>Discard</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Rzutykoscia.Discard
	 * @generated
	 */
	public Adapter createDiscardAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Rzutykoscia.Reroll <em>Reroll</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Rzutykoscia.Reroll
	 * @generated
	 */
	public Adapter createRerollAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Rzutykoscia.MarkThan <em>Mark Than</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Rzutykoscia.MarkThan
	 * @generated
	 */
	public Adapter createMarkThanAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Rzutykoscia.MarkHigh <em>Mark High</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Rzutykoscia.MarkHigh
	 * @generated
	 */
	public Adapter createMarkHighAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Rzutykoscia.MarkKol <em>Mark Kol</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Rzutykoscia.MarkKol
	 * @generated
	 */
	public Adapter createMarkKolAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Rzutykoscia.MarkNum <em>Mark Num</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Rzutykoscia.MarkNum
	 * @generated
	 */
	public Adapter createMarkNumAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Rzutykoscia.RerollHigh <em>Reroll High</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Rzutykoscia.RerollHigh
	 * @generated
	 */
	public Adapter createRerollHighAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Rzutykoscia.RerollThan <em>Reroll Than</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Rzutykoscia.RerollThan
	 * @generated
	 */
	public Adapter createRerollThanAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Rzutykoscia.RerollKol <em>Reroll Kol</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Rzutykoscia.RerollKol
	 * @generated
	 */
	public Adapter createRerollKolAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Rzutykoscia.RerollNum <em>Reroll Num</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Rzutykoscia.RerollNum
	 * @generated
	 */
	public Adapter createRerollNumAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Rzutykoscia.DiscardKol <em>Discard Kol</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Rzutykoscia.DiscardKol
	 * @generated
	 */
	public Adapter createDiscardKolAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Rzutykoscia.DiscardNum <em>Discard Num</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Rzutykoscia.DiscardNum
	 * @generated
	 */
	public Adapter createDiscardNumAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Rzutykoscia.DiscardHigh <em>Discard High</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Rzutykoscia.DiscardHigh
	 * @generated
	 */
	public Adapter createDiscardHighAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Rzutykoscia.DiscardThan <em>Discard Than</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Rzutykoscia.DiscardThan
	 * @generated
	 */
	public Adapter createDiscardThanAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Rzutykoscia.SuccessCompositeRule <em>Success Composite Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Rzutykoscia.SuccessCompositeRule
	 * @generated
	 */
	public Adapter createSuccessCompositeRuleAdapter() {
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

} //RzutykosciaAdapterFactory
