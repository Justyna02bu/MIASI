/**
 */
package Rzutykoscia.util;

import Rzutykoscia.*;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see Rzutykoscia.RzutykosciaPackage
 * @generated
 */
public class RzutykosciaSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static RzutykosciaPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RzutykosciaSwitch() {
		if (modelPackage == null) {
			modelPackage = RzutykosciaPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case RzutykosciaPackage.LANGUAGE: {
				Language language = (Language)theEObject;
				T result = caseLanguage(language);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RzutykosciaPackage.STAT: {
				Stat stat = (Stat)theEObject;
				T result = caseStat(stat);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RzutykosciaPackage.SUM_STATEMENT: {
				SumStatement sumStatement = (SumStatement)theEObject;
				T result = caseSumStatement(sumStatement);
				if (result == null) result = caseStat(sumStatement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RzutykosciaPackage.SUCCESS_STATEMENT: {
				SuccessStatement successStatement = (SuccessStatement)theEObject;
				T result = caseSuccessStatement(successStatement);
				if (result == null) result = caseStat(successStatement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RzutykosciaPackage.DICE_EXPR: {
				DiceExpr diceExpr = (DiceExpr)theEObject;
				T result = caseDiceExpr(diceExpr);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RzutykosciaPackage.DICE_EXPR_SUM: {
				DiceExprSum diceExprSum = (DiceExprSum)theEObject;
				T result = caseDiceExprSum(diceExprSum);
				if (result == null) result = caseDiceExpr(diceExprSum);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RzutykosciaPackage.DICE_EXPR_SUK: {
				DiceExprSuk diceExprSuk = (DiceExprSuk)theEObject;
				T result = caseDiceExprSuk(diceExprSuk);
				if (result == null) result = caseDiceExpr(diceExprSuk);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RzutykosciaPackage.MUL_EXPR: {
				MulExpr mulExpr = (MulExpr)theEObject;
				T result = caseMulExpr(mulExpr);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RzutykosciaPackage.FORM_EXPR: {
				FormExpr formExpr = (FormExpr)theEObject;
				T result = caseFormExpr(formExpr);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RzutykosciaPackage.DICE: {
				Dice dice = (Dice)theEObject;
				T result = caseDice(dice);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RzutykosciaPackage.SINGLE_DICE: {
				SingleDice singleDice = (SingleDice)theEObject;
				T result = caseSingleDice(singleDice);
				if (result == null) result = caseDice(singleDice);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RzutykosciaPackage.MULTI_DICE: {
				MultiDice multiDice = (MultiDice)theEObject;
				T result = caseMultiDice(multiDice);
				if (result == null) result = caseDice(multiDice);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RzutykosciaPackage.NUM: {
				Num num = (Num)theEObject;
				T result = caseNum(num);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RzutykosciaPackage.SUM_RULE: {
				SumRule sumRule = (SumRule)theEObject;
				T result = caseSumRule(sumRule);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RzutykosciaPackage.SUCCESS_RULE: {
				SuccessRule successRule = (SuccessRule)theEObject;
				T result = caseSuccessRule(successRule);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RzutykosciaPackage.EXPLOSION_RULE: {
				ExplosionRule explosionRule = (ExplosionRule)theEObject;
				T result = caseExplosionRule(explosionRule);
				if (result == null) result = caseSumRule(explosionRule);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RzutykosciaPackage.DICE_MARK_SUM: {
				DiceMarkSum diceMarkSum = (DiceMarkSum)theEObject;
				T result = caseDiceMarkSum(diceMarkSum);
				if (result == null) result = caseSumRule(diceMarkSum);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RzutykosciaPackage.DICE_DISC_SUM: {
				DiceDiscSum diceDiscSum = (DiceDiscSum)theEObject;
				T result = caseDiceDiscSum(diceDiscSum);
				if (result == null) result = caseSumRule(diceDiscSum);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RzutykosciaPackage.DICE_REROLL_SUM: {
				DiceRerollSum diceRerollSum = (DiceRerollSum)theEObject;
				T result = caseDiceRerollSum(diceRerollSum);
				if (result == null) result = caseSumRule(diceRerollSum);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RzutykosciaPackage.SUCCESS_BASIC: {
				SuccessBasic successBasic = (SuccessBasic)theEObject;
				T result = caseSuccessBasic(successBasic);
				if (result == null) result = caseSuccessRule(successBasic);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RzutykosciaPackage.SUCCESS_THRESHOLD: {
				SuccessThreshold successThreshold = (SuccessThreshold)theEObject;
				T result = caseSuccessThreshold(successThreshold);
				if (result == null) result = caseSuccessRule(successThreshold);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RzutykosciaPackage.SUCCESS_MULTIPLIER: {
				SuccessMultiplier successMultiplier = (SuccessMultiplier)theEObject;
				T result = caseSuccessMultiplier(successMultiplier);
				if (result == null) result = caseSuccessRule(successMultiplier);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RzutykosciaPackage.DICE_MARK_SUK: {
				DiceMarkSuk diceMarkSuk = (DiceMarkSuk)theEObject;
				T result = caseDiceMarkSuk(diceMarkSuk);
				if (result == null) result = caseSuccessRule(diceMarkSuk);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RzutykosciaPackage.DICE_DISC_SUK: {
				DiceDiscSuk diceDiscSuk = (DiceDiscSuk)theEObject;
				T result = caseDiceDiscSuk(diceDiscSuk);
				if (result == null) result = caseSuccessRule(diceDiscSuk);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RzutykosciaPackage.DICE_REROLL_SUK: {
				DiceRerollSuk diceRerollSuk = (DiceRerollSuk)theEObject;
				T result = caseDiceRerollSuk(diceRerollSuk);
				if (result == null) result = caseSuccessRule(diceRerollSuk);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RzutykosciaPackage.MARK: {
				Mark mark = (Mark)theEObject;
				T result = caseMark(mark);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RzutykosciaPackage.DISCARD: {
				Discard discard = (Discard)theEObject;
				T result = caseDiscard(discard);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RzutykosciaPackage.REROLL: {
				Reroll reroll = (Reroll)theEObject;
				T result = caseReroll(reroll);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RzutykosciaPackage.MARK_THAN: {
				MarkThan markThan = (MarkThan)theEObject;
				T result = caseMarkThan(markThan);
				if (result == null) result = caseMark(markThan);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RzutykosciaPackage.MARK_HIGH: {
				MarkHigh markHigh = (MarkHigh)theEObject;
				T result = caseMarkHigh(markHigh);
				if (result == null) result = caseMark(markHigh);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RzutykosciaPackage.MARK_KOL: {
				MarkKol markKol = (MarkKol)theEObject;
				T result = caseMarkKol(markKol);
				if (result == null) result = caseMark(markKol);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RzutykosciaPackage.MARK_NUM: {
				MarkNum markNum = (MarkNum)theEObject;
				T result = caseMarkNum(markNum);
				if (result == null) result = caseMark(markNum);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RzutykosciaPackage.REROLL_HIGH: {
				RerollHigh rerollHigh = (RerollHigh)theEObject;
				T result = caseRerollHigh(rerollHigh);
				if (result == null) result = caseReroll(rerollHigh);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RzutykosciaPackage.REROLL_THAN: {
				RerollThan rerollThan = (RerollThan)theEObject;
				T result = caseRerollThan(rerollThan);
				if (result == null) result = caseReroll(rerollThan);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RzutykosciaPackage.REROLL_KOL: {
				RerollKol rerollKol = (RerollKol)theEObject;
				T result = caseRerollKol(rerollKol);
				if (result == null) result = caseReroll(rerollKol);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RzutykosciaPackage.REROLL_NUM: {
				RerollNum rerollNum = (RerollNum)theEObject;
				T result = caseRerollNum(rerollNum);
				if (result == null) result = caseReroll(rerollNum);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RzutykosciaPackage.DISCARD_KOL: {
				DiscardKol discardKol = (DiscardKol)theEObject;
				T result = caseDiscardKol(discardKol);
				if (result == null) result = caseDiscard(discardKol);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RzutykosciaPackage.DISCARD_NUM: {
				DiscardNum discardNum = (DiscardNum)theEObject;
				T result = caseDiscardNum(discardNum);
				if (result == null) result = caseDiscard(discardNum);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RzutykosciaPackage.DISCARD_HIGH: {
				DiscardHigh discardHigh = (DiscardHigh)theEObject;
				T result = caseDiscardHigh(discardHigh);
				if (result == null) result = caseDiscard(discardHigh);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RzutykosciaPackage.DISCARD_THAN: {
				DiscardThan discardThan = (DiscardThan)theEObject;
				T result = caseDiscardThan(discardThan);
				if (result == null) result = caseDiscard(discardThan);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RzutykosciaPackage.SUCCESS_COMPOSITE_RULE: {
				SuccessCompositeRule successCompositeRule = (SuccessCompositeRule)theEObject;
				T result = caseSuccessCompositeRule(successCompositeRule);
				if (result == null) result = caseSuccessRule(successCompositeRule);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Language</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Language</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLanguage(Language object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Stat</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Stat</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStat(Stat object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Sum Statement</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Sum Statement</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSumStatement(SumStatement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Success Statement</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Success Statement</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSuccessStatement(SuccessStatement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Dice Expr</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Dice Expr</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDiceExpr(DiceExpr object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Dice Expr Sum</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Dice Expr Sum</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDiceExprSum(DiceExprSum object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Dice Expr Suk</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Dice Expr Suk</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDiceExprSuk(DiceExprSuk object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Mul Expr</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Mul Expr</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMulExpr(MulExpr object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Form Expr</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Form Expr</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFormExpr(FormExpr object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Dice</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Dice</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDice(Dice object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Single Dice</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Single Dice</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSingleDice(SingleDice object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Multi Dice</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Multi Dice</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMultiDice(MultiDice object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Num</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Num</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNum(Num object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Sum Rule</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Sum Rule</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSumRule(SumRule object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Success Rule</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Success Rule</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSuccessRule(SuccessRule object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Explosion Rule</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Explosion Rule</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExplosionRule(ExplosionRule object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Dice Mark Sum</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Dice Mark Sum</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDiceMarkSum(DiceMarkSum object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Dice Disc Sum</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Dice Disc Sum</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDiceDiscSum(DiceDiscSum object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Dice Reroll Sum</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Dice Reroll Sum</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDiceRerollSum(DiceRerollSum object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Success Basic</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Success Basic</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSuccessBasic(SuccessBasic object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Success Threshold</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Success Threshold</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSuccessThreshold(SuccessThreshold object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Success Multiplier</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Success Multiplier</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSuccessMultiplier(SuccessMultiplier object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Dice Mark Suk</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Dice Mark Suk</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDiceMarkSuk(DiceMarkSuk object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Dice Disc Suk</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Dice Disc Suk</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDiceDiscSuk(DiceDiscSuk object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Dice Reroll Suk</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Dice Reroll Suk</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDiceRerollSuk(DiceRerollSuk object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Mark</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Mark</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMark(Mark object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Discard</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Discard</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDiscard(Discard object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Reroll</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Reroll</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseReroll(Reroll object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Mark Than</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Mark Than</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMarkThan(MarkThan object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Mark High</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Mark High</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMarkHigh(MarkHigh object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Mark Kol</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Mark Kol</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMarkKol(MarkKol object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Mark Num</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Mark Num</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMarkNum(MarkNum object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Reroll High</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Reroll High</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRerollHigh(RerollHigh object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Reroll Than</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Reroll Than</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRerollThan(RerollThan object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Reroll Kol</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Reroll Kol</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRerollKol(RerollKol object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Reroll Num</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Reroll Num</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRerollNum(RerollNum object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Discard Kol</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Discard Kol</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDiscardKol(DiscardKol object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Discard Num</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Discard Num</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDiscardNum(DiscardNum object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Discard High</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Discard High</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDiscardHigh(DiscardHigh object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Discard Than</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Discard Than</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDiscardThan(DiscardThan object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Success Composite Rule</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Success Composite Rule</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSuccessCompositeRule(SuccessCompositeRule object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //RzutykosciaSwitch
