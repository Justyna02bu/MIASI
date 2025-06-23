/**
 */
package Rzutykoscia;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see Rzutykoscia.RzutykosciaPackage
 * @generated
 */
public interface RzutykosciaFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	RzutykosciaFactory eINSTANCE = Rzutykoscia.impl.RzutykosciaFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Language</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Language</em>'.
	 * @generated
	 */
	Language createLanguage();

	/**
	 * Returns a new object of class '<em>Sum Statement</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Sum Statement</em>'.
	 * @generated
	 */
	SumStatement createSumStatement();

	/**
	 * Returns a new object of class '<em>Success Statement</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Success Statement</em>'.
	 * @generated
	 */
	SuccessStatement createSuccessStatement();

	/**
	 * Returns a new object of class '<em>Dice Expr Sum</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Dice Expr Sum</em>'.
	 * @generated
	 */
	DiceExprSum createDiceExprSum();

	/**
	 * Returns a new object of class '<em>Dice Expr Suk</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Dice Expr Suk</em>'.
	 * @generated
	 */
	DiceExprSuk createDiceExprSuk();

	/**
	 * Returns a new object of class '<em>Mul Expr</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Mul Expr</em>'.
	 * @generated
	 */
	MulExpr createMulExpr();

	/**
	 * Returns a new object of class '<em>Form Expr</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Form Expr</em>'.
	 * @generated
	 */
	FormExpr createFormExpr();

	/**
	 * Returns a new object of class '<em>Single Dice</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Single Dice</em>'.
	 * @generated
	 */
	SingleDice createSingleDice();

	/**
	 * Returns a new object of class '<em>Multi Dice</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Multi Dice</em>'.
	 * @generated
	 */
	MultiDice createMultiDice();

	/**
	 * Returns a new object of class '<em>Num</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Num</em>'.
	 * @generated
	 */
	Num createNum();

	/**
	 * Returns a new object of class '<em>Explosion Rule</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Explosion Rule</em>'.
	 * @generated
	 */
	ExplosionRule createExplosionRule();

	/**
	 * Returns a new object of class '<em>Dice Mark Sum</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Dice Mark Sum</em>'.
	 * @generated
	 */
	DiceMarkSum createDiceMarkSum();

	/**
	 * Returns a new object of class '<em>Dice Disc Sum</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Dice Disc Sum</em>'.
	 * @generated
	 */
	DiceDiscSum createDiceDiscSum();

	/**
	 * Returns a new object of class '<em>Dice Reroll Sum</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Dice Reroll Sum</em>'.
	 * @generated
	 */
	DiceRerollSum createDiceRerollSum();

	/**
	 * Returns a new object of class '<em>Success Basic</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Success Basic</em>'.
	 * @generated
	 */
	SuccessBasic createSuccessBasic();

	/**
	 * Returns a new object of class '<em>Success Threshold</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Success Threshold</em>'.
	 * @generated
	 */
	SuccessThreshold createSuccessThreshold();

	/**
	 * Returns a new object of class '<em>Success Multiplier</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Success Multiplier</em>'.
	 * @generated
	 */
	SuccessMultiplier createSuccessMultiplier();

	/**
	 * Returns a new object of class '<em>Dice Mark Suk</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Dice Mark Suk</em>'.
	 * @generated
	 */
	DiceMarkSuk createDiceMarkSuk();

	/**
	 * Returns a new object of class '<em>Dice Disc Suk</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Dice Disc Suk</em>'.
	 * @generated
	 */
	DiceDiscSuk createDiceDiscSuk();

	/**
	 * Returns a new object of class '<em>Dice Reroll Suk</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Dice Reroll Suk</em>'.
	 * @generated
	 */
	DiceRerollSuk createDiceRerollSuk();

	/**
	 * Returns a new object of class '<em>Mark Than</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Mark Than</em>'.
	 * @generated
	 */
	MarkThan createMarkThan();

	/**
	 * Returns a new object of class '<em>Mark High</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Mark High</em>'.
	 * @generated
	 */
	MarkHigh createMarkHigh();

	/**
	 * Returns a new object of class '<em>Mark Kol</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Mark Kol</em>'.
	 * @generated
	 */
	MarkKol createMarkKol();

	/**
	 * Returns a new object of class '<em>Mark Num</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Mark Num</em>'.
	 * @generated
	 */
	MarkNum createMarkNum();

	/**
	 * Returns a new object of class '<em>Reroll High</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Reroll High</em>'.
	 * @generated
	 */
	RerollHigh createRerollHigh();

	/**
	 * Returns a new object of class '<em>Reroll Than</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Reroll Than</em>'.
	 * @generated
	 */
	RerollThan createRerollThan();

	/**
	 * Returns a new object of class '<em>Reroll Kol</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Reroll Kol</em>'.
	 * @generated
	 */
	RerollKol createRerollKol();

	/**
	 * Returns a new object of class '<em>Reroll Num</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Reroll Num</em>'.
	 * @generated
	 */
	RerollNum createRerollNum();

	/**
	 * Returns a new object of class '<em>Discard Kol</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Discard Kol</em>'.
	 * @generated
	 */
	DiscardKol createDiscardKol();

	/**
	 * Returns a new object of class '<em>Discard Num</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Discard Num</em>'.
	 * @generated
	 */
	DiscardNum createDiscardNum();

	/**
	 * Returns a new object of class '<em>Discard High</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Discard High</em>'.
	 * @generated
	 */
	DiscardHigh createDiscardHigh();

	/**
	 * Returns a new object of class '<em>Discard Than</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Discard Than</em>'.
	 * @generated
	 */
	DiscardThan createDiscardThan();

	/**
	 * Returns a new object of class '<em>Success Composite Rule</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Success Composite Rule</em>'.
	 * @generated
	 */
	SuccessCompositeRule createSuccessCompositeRule();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	RzutykosciaPackage getRzutykosciaPackage();

} //RzutykosciaFactory
