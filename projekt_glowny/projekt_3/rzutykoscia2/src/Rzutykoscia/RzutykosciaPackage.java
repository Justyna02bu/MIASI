/**
 */
package Rzutykoscia;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

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
 * @see Rzutykoscia.RzutykosciaFactory
 * @model kind="package"
 * @generated
 */
public interface RzutykosciaPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "Rzutykoscia";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.example.org/rzutykoscia";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "Rzuty";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	RzutykosciaPackage eINSTANCE = Rzutykoscia.impl.RzutykosciaPackageImpl.init();

	/**
	 * The meta object id for the '{@link Rzutykoscia.impl.LanguageImpl <em>Language</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Rzutykoscia.impl.LanguageImpl
	 * @see Rzutykoscia.impl.RzutykosciaPackageImpl#getLanguage()
	 * @generated
	 */
	int LANGUAGE = 0;

	/**
	 * The feature id for the '<em><b>Statement</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LANGUAGE__STATEMENT = 0;

	/**
	 * The number of structural features of the '<em>Language</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LANGUAGE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Language</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LANGUAGE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link Rzutykoscia.impl.StatImpl <em>Stat</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Rzutykoscia.impl.StatImpl
	 * @see Rzutykoscia.impl.RzutykosciaPackageImpl#getStat()
	 * @generated
	 */
	int STAT = 1;

	/**
	 * The number of structural features of the '<em>Stat</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STAT_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Stat</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STAT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link Rzutykoscia.impl.SumStatementImpl <em>Sum Statement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Rzutykoscia.impl.SumStatementImpl
	 * @see Rzutykoscia.impl.RzutykosciaPackageImpl#getSumStatement()
	 * @generated
	 */
	int SUM_STATEMENT = 2;

	/**
	 * The feature id for the '<em><b>Diceexprsum</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUM_STATEMENT__DICEEXPRSUM = STAT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Sum Statement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUM_STATEMENT_FEATURE_COUNT = STAT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Sum Statement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUM_STATEMENT_OPERATION_COUNT = STAT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link Rzutykoscia.impl.SuccessStatementImpl <em>Success Statement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Rzutykoscia.impl.SuccessStatementImpl
	 * @see Rzutykoscia.impl.RzutykosciaPackageImpl#getSuccessStatement()
	 * @generated
	 */
	int SUCCESS_STATEMENT = 3;

	/**
	 * The feature id for the '<em><b>Diceexprsuk</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUCCESS_STATEMENT__DICEEXPRSUK = STAT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Success Statement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUCCESS_STATEMENT_FEATURE_COUNT = STAT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Success Statement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUCCESS_STATEMENT_OPERATION_COUNT = STAT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link Rzutykoscia.impl.DiceExprImpl <em>Dice Expr</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Rzutykoscia.impl.DiceExprImpl
	 * @see Rzutykoscia.impl.RzutykosciaPackageImpl#getDiceExpr()
	 * @generated
	 */
	int DICE_EXPR = 4;

	/**
	 * The feature id for the '<em><b>Mulexpr</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DICE_EXPR__MULEXPR = 0;

	/**
	 * The feature id for the '<em><b>Sign</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DICE_EXPR__SIGN = 1;

	/**
	 * The number of structural features of the '<em>Dice Expr</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DICE_EXPR_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Dice Expr</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DICE_EXPR_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link Rzutykoscia.impl.DiceExprSumImpl <em>Dice Expr Sum</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Rzutykoscia.impl.DiceExprSumImpl
	 * @see Rzutykoscia.impl.RzutykosciaPackageImpl#getDiceExprSum()
	 * @generated
	 */
	int DICE_EXPR_SUM = 5;

	/**
	 * The feature id for the '<em><b>Mulexpr</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DICE_EXPR_SUM__MULEXPR = DICE_EXPR__MULEXPR;

	/**
	 * The feature id for the '<em><b>Sign</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DICE_EXPR_SUM__SIGN = DICE_EXPR__SIGN;

	/**
	 * The feature id for the '<em><b>Sumrule</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DICE_EXPR_SUM__SUMRULE = DICE_EXPR_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Dice Expr Sum</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DICE_EXPR_SUM_FEATURE_COUNT = DICE_EXPR_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Dice Expr Sum</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DICE_EXPR_SUM_OPERATION_COUNT = DICE_EXPR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link Rzutykoscia.impl.DiceExprSukImpl <em>Dice Expr Suk</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Rzutykoscia.impl.DiceExprSukImpl
	 * @see Rzutykoscia.impl.RzutykosciaPackageImpl#getDiceExprSuk()
	 * @generated
	 */
	int DICE_EXPR_SUK = 6;

	/**
	 * The feature id for the '<em><b>Mulexpr</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DICE_EXPR_SUK__MULEXPR = DICE_EXPR__MULEXPR;

	/**
	 * The feature id for the '<em><b>Sign</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DICE_EXPR_SUK__SIGN = DICE_EXPR__SIGN;

	/**
	 * The feature id for the '<em><b>Successrule</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DICE_EXPR_SUK__SUCCESSRULE = DICE_EXPR_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Dice Expr Suk</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DICE_EXPR_SUK_FEATURE_COUNT = DICE_EXPR_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Dice Expr Suk</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DICE_EXPR_SUK_OPERATION_COUNT = DICE_EXPR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link Rzutykoscia.impl.MulExprImpl <em>Mul Expr</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Rzutykoscia.impl.MulExprImpl
	 * @see Rzutykoscia.impl.RzutykosciaPackageImpl#getMulExpr()
	 * @generated
	 */
	int MUL_EXPR = 7;

	/**
	 * The feature id for the '<em><b>Num</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MUL_EXPR__NUM = 0;

	/**
	 * The feature id for the '<em><b>Formexpr</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MUL_EXPR__FORMEXPR = 1;

	/**
	 * The number of structural features of the '<em>Mul Expr</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MUL_EXPR_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Mul Expr</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MUL_EXPR_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link Rzutykoscia.impl.FormExprImpl <em>Form Expr</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Rzutykoscia.impl.FormExprImpl
	 * @see Rzutykoscia.impl.RzutykosciaPackageImpl#getFormExpr()
	 * @generated
	 */
	int FORM_EXPR = 8;

	/**
	 * The feature id for the '<em><b>Left</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM_EXPR__LEFT = 0;

	/**
	 * The feature id for the '<em><b>Right</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM_EXPR__RIGHT = 1;

	/**
	 * The feature id for the '<em><b>Operator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM_EXPR__OPERATOR = 2;

	/**
	 * The number of structural features of the '<em>Form Expr</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM_EXPR_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Form Expr</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM_EXPR_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link Rzutykoscia.impl.DiceImpl <em>Dice</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Rzutykoscia.impl.DiceImpl
	 * @see Rzutykoscia.impl.RzutykosciaPackageImpl#getDice()
	 * @generated
	 */
	int DICE = 9;

	/**
	 * The feature id for the '<em><b>Sides</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DICE__SIDES = 0;

	/**
	 * The number of structural features of the '<em>Dice</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DICE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Dice</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DICE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link Rzutykoscia.impl.SingleDiceImpl <em>Single Dice</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Rzutykoscia.impl.SingleDiceImpl
	 * @see Rzutykoscia.impl.RzutykosciaPackageImpl#getSingleDice()
	 * @generated
	 */
	int SINGLE_DICE = 10;

	/**
	 * The feature id for the '<em><b>Sides</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINGLE_DICE__SIDES = DICE__SIDES;

	/**
	 * The number of structural features of the '<em>Single Dice</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINGLE_DICE_FEATURE_COUNT = DICE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Single Dice</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINGLE_DICE_OPERATION_COUNT = DICE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link Rzutykoscia.impl.MultiDiceImpl <em>Multi Dice</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Rzutykoscia.impl.MultiDiceImpl
	 * @see Rzutykoscia.impl.RzutykosciaPackageImpl#getMultiDice()
	 * @generated
	 */
	int MULTI_DICE = 11;

	/**
	 * The feature id for the '<em><b>Sides</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTI_DICE__SIDES = DICE__SIDES;

	/**
	 * The feature id for the '<em><b>Count</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTI_DICE__COUNT = DICE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Multi Dice</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTI_DICE_FEATURE_COUNT = DICE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Multi Dice</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTI_DICE_OPERATION_COUNT = DICE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link Rzutykoscia.impl.NumImpl <em>Num</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Rzutykoscia.impl.NumImpl
	 * @see Rzutykoscia.impl.RzutykosciaPackageImpl#getNum()
	 * @generated
	 */
	int NUM = 12;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUM__VALUE = 0;

	/**
	 * The number of structural features of the '<em>Num</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUM_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Num</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUM_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link Rzutykoscia.impl.SumRuleImpl <em>Sum Rule</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Rzutykoscia.impl.SumRuleImpl
	 * @see Rzutykoscia.impl.RzutykosciaPackageImpl#getSumRule()
	 * @generated
	 */
	int SUM_RULE = 13;

	/**
	 * The number of structural features of the '<em>Sum Rule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUM_RULE_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Sum Rule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUM_RULE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link Rzutykoscia.impl.SuccessRuleImpl <em>Success Rule</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Rzutykoscia.impl.SuccessRuleImpl
	 * @see Rzutykoscia.impl.RzutykosciaPackageImpl#getSuccessRule()
	 * @generated
	 */
	int SUCCESS_RULE = 14;

	/**
	 * The number of structural features of the '<em>Success Rule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUCCESS_RULE_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Success Rule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUCCESS_RULE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link Rzutykoscia.impl.ExplosionRuleImpl <em>Explosion Rule</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Rzutykoscia.impl.ExplosionRuleImpl
	 * @see Rzutykoscia.impl.RzutykosciaPackageImpl#getExplosionRule()
	 * @generated
	 */
	int EXPLOSION_RULE = 15;

	/**
	 * The feature id for the '<em><b>Num</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPLOSION_RULE__NUM = SUM_RULE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Sign</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPLOSION_RULE__SIGN = SUM_RULE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Explosion Rule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPLOSION_RULE_FEATURE_COUNT = SUM_RULE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Explosion Rule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPLOSION_RULE_OPERATION_COUNT = SUM_RULE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link Rzutykoscia.impl.DiceMarkSumImpl <em>Dice Mark Sum</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Rzutykoscia.impl.DiceMarkSumImpl
	 * @see Rzutykoscia.impl.RzutykosciaPackageImpl#getDiceMarkSum()
	 * @generated
	 */
	int DICE_MARK_SUM = 16;

	/**
	 * The feature id for the '<em><b>Mark</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DICE_MARK_SUM__MARK = SUM_RULE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Dice Mark Sum</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DICE_MARK_SUM_FEATURE_COUNT = SUM_RULE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Dice Mark Sum</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DICE_MARK_SUM_OPERATION_COUNT = SUM_RULE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link Rzutykoscia.impl.DiceDiscSumImpl <em>Dice Disc Sum</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Rzutykoscia.impl.DiceDiscSumImpl
	 * @see Rzutykoscia.impl.RzutykosciaPackageImpl#getDiceDiscSum()
	 * @generated
	 */
	int DICE_DISC_SUM = 17;

	/**
	 * The feature id for the '<em><b>Discard</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DICE_DISC_SUM__DISCARD = SUM_RULE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Dice Disc Sum</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DICE_DISC_SUM_FEATURE_COUNT = SUM_RULE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Dice Disc Sum</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DICE_DISC_SUM_OPERATION_COUNT = SUM_RULE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link Rzutykoscia.impl.DiceRerollSumImpl <em>Dice Reroll Sum</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Rzutykoscia.impl.DiceRerollSumImpl
	 * @see Rzutykoscia.impl.RzutykosciaPackageImpl#getDiceRerollSum()
	 * @generated
	 */
	int DICE_REROLL_SUM = 18;

	/**
	 * The feature id for the '<em><b>Reroll</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DICE_REROLL_SUM__REROLL = SUM_RULE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Dice Reroll Sum</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DICE_REROLL_SUM_FEATURE_COUNT = SUM_RULE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Dice Reroll Sum</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DICE_REROLL_SUM_OPERATION_COUNT = SUM_RULE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link Rzutykoscia.impl.SuccessBasicImpl <em>Success Basic</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Rzutykoscia.impl.SuccessBasicImpl
	 * @see Rzutykoscia.impl.RzutykosciaPackageImpl#getSuccessBasic()
	 * @generated
	 */
	int SUCCESS_BASIC = 19;

	/**
	 * The feature id for the '<em><b>Num</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUCCESS_BASIC__NUM = SUCCESS_RULE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Negated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUCCESS_BASIC__NEGATED = SUCCESS_RULE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Success Basic</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUCCESS_BASIC_FEATURE_COUNT = SUCCESS_RULE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Success Basic</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUCCESS_BASIC_OPERATION_COUNT = SUCCESS_RULE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link Rzutykoscia.impl.SuccessThresholdImpl <em>Success Threshold</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Rzutykoscia.impl.SuccessThresholdImpl
	 * @see Rzutykoscia.impl.RzutykosciaPackageImpl#getSuccessThreshold()
	 * @generated
	 */
	int SUCCESS_THRESHOLD = 20;

	/**
	 * The feature id for the '<em><b>Hightlow</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUCCESS_THRESHOLD__HIGHTLOW = SUCCESS_RULE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Num</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUCCESS_THRESHOLD__NUM = SUCCESS_RULE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Success Threshold</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUCCESS_THRESHOLD_FEATURE_COUNT = SUCCESS_RULE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Success Threshold</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUCCESS_THRESHOLD_OPERATION_COUNT = SUCCESS_RULE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link Rzutykoscia.impl.SuccessMultiplierImpl <em>Success Multiplier</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Rzutykoscia.impl.SuccessMultiplierImpl
	 * @see Rzutykoscia.impl.RzutykosciaPackageImpl#getSuccessMultiplier()
	 * @generated
	 */
	int SUCCESS_MULTIPLIER = 21;

	/**
	 * The feature id for the '<em><b>Sign</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUCCESS_MULTIPLIER__SIGN = SUCCESS_RULE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Mult</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUCCESS_MULTIPLIER__MULT = SUCCESS_RULE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Num</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUCCESS_MULTIPLIER__NUM = SUCCESS_RULE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Success Multiplier</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUCCESS_MULTIPLIER_FEATURE_COUNT = SUCCESS_RULE_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Success Multiplier</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUCCESS_MULTIPLIER_OPERATION_COUNT = SUCCESS_RULE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link Rzutykoscia.impl.DiceMarkSukImpl <em>Dice Mark Suk</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Rzutykoscia.impl.DiceMarkSukImpl
	 * @see Rzutykoscia.impl.RzutykosciaPackageImpl#getDiceMarkSuk()
	 * @generated
	 */
	int DICE_MARK_SUK = 22;

	/**
	 * The feature id for the '<em><b>Mark</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DICE_MARK_SUK__MARK = SUCCESS_RULE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Dice Mark Suk</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DICE_MARK_SUK_FEATURE_COUNT = SUCCESS_RULE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Dice Mark Suk</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DICE_MARK_SUK_OPERATION_COUNT = SUCCESS_RULE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link Rzutykoscia.impl.DiceDiscSukImpl <em>Dice Disc Suk</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Rzutykoscia.impl.DiceDiscSukImpl
	 * @see Rzutykoscia.impl.RzutykosciaPackageImpl#getDiceDiscSuk()
	 * @generated
	 */
	int DICE_DISC_SUK = 23;

	/**
	 * The feature id for the '<em><b>Discard</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DICE_DISC_SUK__DISCARD = SUCCESS_RULE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Dice Disc Suk</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DICE_DISC_SUK_FEATURE_COUNT = SUCCESS_RULE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Dice Disc Suk</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DICE_DISC_SUK_OPERATION_COUNT = SUCCESS_RULE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link Rzutykoscia.impl.DiceRerollSukImpl <em>Dice Reroll Suk</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Rzutykoscia.impl.DiceRerollSukImpl
	 * @see Rzutykoscia.impl.RzutykosciaPackageImpl#getDiceRerollSuk()
	 * @generated
	 */
	int DICE_REROLL_SUK = 24;

	/**
	 * The feature id for the '<em><b>Reroll</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DICE_REROLL_SUK__REROLL = SUCCESS_RULE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Dice Reroll Suk</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DICE_REROLL_SUK_FEATURE_COUNT = SUCCESS_RULE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Dice Reroll Suk</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DICE_REROLL_SUK_OPERATION_COUNT = SUCCESS_RULE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link Rzutykoscia.impl.MarkImpl <em>Mark</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Rzutykoscia.impl.MarkImpl
	 * @see Rzutykoscia.impl.RzutykosciaPackageImpl#getMark()
	 * @generated
	 */
	int MARK = 25;

	/**
	 * The number of structural features of the '<em>Mark</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARK_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Mark</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARK_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link Rzutykoscia.impl.DiscardImpl <em>Discard</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Rzutykoscia.impl.DiscardImpl
	 * @see Rzutykoscia.impl.RzutykosciaPackageImpl#getDiscard()
	 * @generated
	 */
	int DISCARD = 26;

	/**
	 * The number of structural features of the '<em>Discard</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCARD_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Discard</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCARD_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link Rzutykoscia.impl.RerollImpl <em>Reroll</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Rzutykoscia.impl.RerollImpl
	 * @see Rzutykoscia.impl.RzutykosciaPackageImpl#getReroll()
	 * @generated
	 */
	int REROLL = 27;

	/**
	 * The number of structural features of the '<em>Reroll</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REROLL_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Reroll</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REROLL_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link Rzutykoscia.impl.MarkThanImpl <em>Mark Than</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Rzutykoscia.impl.MarkThanImpl
	 * @see Rzutykoscia.impl.RzutykosciaPackageImpl#getMarkThan()
	 * @generated
	 */
	int MARK_THAN = 28;

	/**
	 * The feature id for the '<em><b>Hightlow</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARK_THAN__HIGHTLOW = MARK_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Num</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARK_THAN__NUM = MARK_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Mark Than</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARK_THAN_FEATURE_COUNT = MARK_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Mark Than</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARK_THAN_OPERATION_COUNT = MARK_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link Rzutykoscia.impl.MarkHighImpl <em>Mark High</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Rzutykoscia.impl.MarkHighImpl
	 * @see Rzutykoscia.impl.RzutykosciaPackageImpl#getMarkHigh()
	 * @generated
	 */
	int MARK_HIGH = 29;

	/**
	 * The feature id for the '<em><b>Hightlow</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARK_HIGH__HIGHTLOW = MARK_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Mark High</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARK_HIGH_FEATURE_COUNT = MARK_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Mark High</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARK_HIGH_OPERATION_COUNT = MARK_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link Rzutykoscia.impl.MarkKolImpl <em>Mark Kol</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Rzutykoscia.impl.MarkKolImpl
	 * @see Rzutykoscia.impl.RzutykosciaPackageImpl#getMarkKol()
	 * @generated
	 */
	int MARK_KOL = 30;

	/**
	 * The feature id for the '<em><b>Num</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARK_KOL__NUM = MARK_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Firstlast</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARK_KOL__FIRSTLAST = MARK_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Mark Kol</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARK_KOL_FEATURE_COUNT = MARK_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Mark Kol</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARK_KOL_OPERATION_COUNT = MARK_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link Rzutykoscia.impl.MarkNumImpl <em>Mark Num</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Rzutykoscia.impl.MarkNumImpl
	 * @see Rzutykoscia.impl.RzutykosciaPackageImpl#getMarkNum()
	 * @generated
	 */
	int MARK_NUM = 31;

	/**
	 * The feature id for the '<em><b>Num</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARK_NUM__NUM = MARK_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Mark Num</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARK_NUM_FEATURE_COUNT = MARK_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Mark Num</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARK_NUM_OPERATION_COUNT = MARK_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link Rzutykoscia.impl.RerollHighImpl <em>Reroll High</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Rzutykoscia.impl.RerollHighImpl
	 * @see Rzutykoscia.impl.RzutykosciaPackageImpl#getRerollHigh()
	 * @generated
	 */
	int REROLL_HIGH = 32;

	/**
	 * The feature id for the '<em><b>Hightlow</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REROLL_HIGH__HIGHTLOW = REROLL_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Reroll High</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REROLL_HIGH_FEATURE_COUNT = REROLL_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Reroll High</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REROLL_HIGH_OPERATION_COUNT = REROLL_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link Rzutykoscia.impl.RerollThanImpl <em>Reroll Than</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Rzutykoscia.impl.RerollThanImpl
	 * @see Rzutykoscia.impl.RzutykosciaPackageImpl#getRerollThan()
	 * @generated
	 */
	int REROLL_THAN = 33;

	/**
	 * The feature id for the '<em><b>Hightlow</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REROLL_THAN__HIGHTLOW = REROLL_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Num</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REROLL_THAN__NUM = REROLL_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Reroll Than</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REROLL_THAN_FEATURE_COUNT = REROLL_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Reroll Than</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REROLL_THAN_OPERATION_COUNT = REROLL_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link Rzutykoscia.impl.RerollKolImpl <em>Reroll Kol</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Rzutykoscia.impl.RerollKolImpl
	 * @see Rzutykoscia.impl.RzutykosciaPackageImpl#getRerollKol()
	 * @generated
	 */
	int REROLL_KOL = 34;

	/**
	 * The feature id for the '<em><b>Num</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REROLL_KOL__NUM = REROLL_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Firstlast</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REROLL_KOL__FIRSTLAST = REROLL_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Reroll Kol</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REROLL_KOL_FEATURE_COUNT = REROLL_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Reroll Kol</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REROLL_KOL_OPERATION_COUNT = REROLL_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link Rzutykoscia.impl.RerollNumImpl <em>Reroll Num</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Rzutykoscia.impl.RerollNumImpl
	 * @see Rzutykoscia.impl.RzutykosciaPackageImpl#getRerollNum()
	 * @generated
	 */
	int REROLL_NUM = 35;

	/**
	 * The feature id for the '<em><b>Num</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REROLL_NUM__NUM = REROLL_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Reroll Num</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REROLL_NUM_FEATURE_COUNT = REROLL_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Reroll Num</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REROLL_NUM_OPERATION_COUNT = REROLL_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link Rzutykoscia.impl.DiscardKolImpl <em>Discard Kol</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Rzutykoscia.impl.DiscardKolImpl
	 * @see Rzutykoscia.impl.RzutykosciaPackageImpl#getDiscardKol()
	 * @generated
	 */
	int DISCARD_KOL = 36;

	/**
	 * The feature id for the '<em><b>Num</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCARD_KOL__NUM = DISCARD_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Firstlast</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCARD_KOL__FIRSTLAST = DISCARD_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Discard Kol</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCARD_KOL_FEATURE_COUNT = DISCARD_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Discard Kol</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCARD_KOL_OPERATION_COUNT = DISCARD_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link Rzutykoscia.impl.DiscardNumImpl <em>Discard Num</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Rzutykoscia.impl.DiscardNumImpl
	 * @see Rzutykoscia.impl.RzutykosciaPackageImpl#getDiscardNum()
	 * @generated
	 */
	int DISCARD_NUM = 37;

	/**
	 * The feature id for the '<em><b>Num</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCARD_NUM__NUM = DISCARD_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Discard Num</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCARD_NUM_FEATURE_COUNT = DISCARD_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Discard Num</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCARD_NUM_OPERATION_COUNT = DISCARD_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link Rzutykoscia.impl.DiscardHighImpl <em>Discard High</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Rzutykoscia.impl.DiscardHighImpl
	 * @see Rzutykoscia.impl.RzutykosciaPackageImpl#getDiscardHigh()
	 * @generated
	 */
	int DISCARD_HIGH = 38;

	/**
	 * The feature id for the '<em><b>Hightlow</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCARD_HIGH__HIGHTLOW = DISCARD_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Discard High</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCARD_HIGH_FEATURE_COUNT = DISCARD_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Discard High</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCARD_HIGH_OPERATION_COUNT = DISCARD_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link Rzutykoscia.impl.DiscardThanImpl <em>Discard Than</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Rzutykoscia.impl.DiscardThanImpl
	 * @see Rzutykoscia.impl.RzutykosciaPackageImpl#getDiscardThan()
	 * @generated
	 */
	int DISCARD_THAN = 39;

	/**
	 * The feature id for the '<em><b>Hightlow</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCARD_THAN__HIGHTLOW = DISCARD_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Num</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCARD_THAN__NUM = DISCARD_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Discard Than</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCARD_THAN_FEATURE_COUNT = DISCARD_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Discard Than</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCARD_THAN_OPERATION_COUNT = DISCARD_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link Rzutykoscia.impl.SuccessCompositeRuleImpl <em>Success Composite Rule</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Rzutykoscia.impl.SuccessCompositeRuleImpl
	 * @see Rzutykoscia.impl.RzutykosciaPackageImpl#getSuccessCompositeRule()
	 * @generated
	 */
	int SUCCESS_COMPOSITE_RULE = 40;

	/**
	 * The feature id for the '<em><b>Successrule</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUCCESS_COMPOSITE_RULE__SUCCESSRULE = SUCCESS_RULE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Success Composite Rule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUCCESS_COMPOSITE_RULE_FEATURE_COUNT = SUCCESS_RULE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Success Composite Rule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUCCESS_COMPOSITE_RULE_OPERATION_COUNT = SUCCESS_RULE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link Rzutykoscia.Operator <em>Operator</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Rzutykoscia.Operator
	 * @see Rzutykoscia.impl.RzutykosciaPackageImpl#getOperator()
	 * @generated
	 */
	int OPERATOR = 41;

	/**
	 * The meta object id for the '{@link Rzutykoscia.Sign <em>Sign</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Rzutykoscia.Sign
	 * @see Rzutykoscia.impl.RzutykosciaPackageImpl#getSign()
	 * @generated
	 */
	int SIGN = 42;

	/**
	 * The meta object id for the '{@link Rzutykoscia.HighLow <em>High Low</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Rzutykoscia.HighLow
	 * @see Rzutykoscia.impl.RzutykosciaPackageImpl#getHighLow()
	 * @generated
	 */
	int HIGH_LOW = 43;

	/**
	 * The meta object id for the '{@link Rzutykoscia.FirstLast <em>First Last</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Rzutykoscia.FirstLast
	 * @see Rzutykoscia.impl.RzutykosciaPackageImpl#getFirstLast()
	 * @generated
	 */
	int FIRST_LAST = 44;

	/**
	 * The meta object id for the '{@link Rzutykoscia.MulDiv <em>Mul Div</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Rzutykoscia.MulDiv
	 * @see Rzutykoscia.impl.RzutykosciaPackageImpl#getMulDiv()
	 * @generated
	 */
	int MUL_DIV = 45;


	/**
	 * Returns the meta object for class '{@link Rzutykoscia.Language <em>Language</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Language</em>'.
	 * @see Rzutykoscia.Language
	 * @generated
	 */
	EClass getLanguage();

	/**
	 * Returns the meta object for the containment reference '{@link Rzutykoscia.Language#getStatement <em>Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Statement</em>'.
	 * @see Rzutykoscia.Language#getStatement()
	 * @see #getLanguage()
	 * @generated
	 */
	EReference getLanguage_Statement();

	/**
	 * Returns the meta object for class '{@link Rzutykoscia.Stat <em>Stat</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Stat</em>'.
	 * @see Rzutykoscia.Stat
	 * @generated
	 */
	EClass getStat();

	/**
	 * Returns the meta object for class '{@link Rzutykoscia.SumStatement <em>Sum Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sum Statement</em>'.
	 * @see Rzutykoscia.SumStatement
	 * @generated
	 */
	EClass getSumStatement();

	/**
	 * Returns the meta object for the containment reference list '{@link Rzutykoscia.SumStatement#getDiceexprsum <em>Diceexprsum</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Diceexprsum</em>'.
	 * @see Rzutykoscia.SumStatement#getDiceexprsum()
	 * @see #getSumStatement()
	 * @generated
	 */
	EReference getSumStatement_Diceexprsum();

	/**
	 * Returns the meta object for class '{@link Rzutykoscia.SuccessStatement <em>Success Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Success Statement</em>'.
	 * @see Rzutykoscia.SuccessStatement
	 * @generated
	 */
	EClass getSuccessStatement();

	/**
	 * Returns the meta object for the containment reference list '{@link Rzutykoscia.SuccessStatement#getDiceexprsuk <em>Diceexprsuk</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Diceexprsuk</em>'.
	 * @see Rzutykoscia.SuccessStatement#getDiceexprsuk()
	 * @see #getSuccessStatement()
	 * @generated
	 */
	EReference getSuccessStatement_Diceexprsuk();

	/**
	 * Returns the meta object for class '{@link Rzutykoscia.DiceExpr <em>Dice Expr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Dice Expr</em>'.
	 * @see Rzutykoscia.DiceExpr
	 * @generated
	 */
	EClass getDiceExpr();

	/**
	 * Returns the meta object for the containment reference '{@link Rzutykoscia.DiceExpr#getMulexpr <em>Mulexpr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Mulexpr</em>'.
	 * @see Rzutykoscia.DiceExpr#getMulexpr()
	 * @see #getDiceExpr()
	 * @generated
	 */
	EReference getDiceExpr_Mulexpr();

	/**
	 * Returns the meta object for the attribute '{@link Rzutykoscia.DiceExpr#getSign <em>Sign</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Sign</em>'.
	 * @see Rzutykoscia.DiceExpr#getSign()
	 * @see #getDiceExpr()
	 * @generated
	 */
	EAttribute getDiceExpr_Sign();

	/**
	 * Returns the meta object for class '{@link Rzutykoscia.DiceExprSum <em>Dice Expr Sum</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Dice Expr Sum</em>'.
	 * @see Rzutykoscia.DiceExprSum
	 * @generated
	 */
	EClass getDiceExprSum();

	/**
	 * Returns the meta object for the containment reference list '{@link Rzutykoscia.DiceExprSum#getSumrule <em>Sumrule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Sumrule</em>'.
	 * @see Rzutykoscia.DiceExprSum#getSumrule()
	 * @see #getDiceExprSum()
	 * @generated
	 */
	EReference getDiceExprSum_Sumrule();

	/**
	 * Returns the meta object for class '{@link Rzutykoscia.DiceExprSuk <em>Dice Expr Suk</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Dice Expr Suk</em>'.
	 * @see Rzutykoscia.DiceExprSuk
	 * @generated
	 */
	EClass getDiceExprSuk();

	/**
	 * Returns the meta object for the containment reference list '{@link Rzutykoscia.DiceExprSuk#getSuccessrule <em>Successrule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Successrule</em>'.
	 * @see Rzutykoscia.DiceExprSuk#getSuccessrule()
	 * @see #getDiceExprSuk()
	 * @generated
	 */
	EReference getDiceExprSuk_Successrule();

	/**
	 * Returns the meta object for class '{@link Rzutykoscia.MulExpr <em>Mul Expr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Mul Expr</em>'.
	 * @see Rzutykoscia.MulExpr
	 * @generated
	 */
	EClass getMulExpr();

	/**
	 * Returns the meta object for the containment reference '{@link Rzutykoscia.MulExpr#getNum <em>Num</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Num</em>'.
	 * @see Rzutykoscia.MulExpr#getNum()
	 * @see #getMulExpr()
	 * @generated
	 */
	EReference getMulExpr_Num();

	/**
	 * Returns the meta object for the containment reference '{@link Rzutykoscia.MulExpr#getFormexpr <em>Formexpr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Formexpr</em>'.
	 * @see Rzutykoscia.MulExpr#getFormexpr()
	 * @see #getMulExpr()
	 * @generated
	 */
	EReference getMulExpr_Formexpr();

	/**
	 * Returns the meta object for class '{@link Rzutykoscia.FormExpr <em>Form Expr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Form Expr</em>'.
	 * @see Rzutykoscia.FormExpr
	 * @generated
	 */
	EClass getFormExpr();

	/**
	 * Returns the meta object for the containment reference '{@link Rzutykoscia.FormExpr#getLeft <em>Left</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Left</em>'.
	 * @see Rzutykoscia.FormExpr#getLeft()
	 * @see #getFormExpr()
	 * @generated
	 */
	EReference getFormExpr_Left();

	/**
	 * Returns the meta object for the containment reference '{@link Rzutykoscia.FormExpr#getRight <em>Right</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Right</em>'.
	 * @see Rzutykoscia.FormExpr#getRight()
	 * @see #getFormExpr()
	 * @generated
	 */
	EReference getFormExpr_Right();

	/**
	 * Returns the meta object for the attribute '{@link Rzutykoscia.FormExpr#getOperator <em>Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Operator</em>'.
	 * @see Rzutykoscia.FormExpr#getOperator()
	 * @see #getFormExpr()
	 * @generated
	 */
	EAttribute getFormExpr_Operator();

	/**
	 * Returns the meta object for class '{@link Rzutykoscia.Dice <em>Dice</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Dice</em>'.
	 * @see Rzutykoscia.Dice
	 * @generated
	 */
	EClass getDice();

	/**
	 * Returns the meta object for the containment reference '{@link Rzutykoscia.Dice#getSides <em>Sides</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Sides</em>'.
	 * @see Rzutykoscia.Dice#getSides()
	 * @see #getDice()
	 * @generated
	 */
	EReference getDice_Sides();

	/**
	 * Returns the meta object for class '{@link Rzutykoscia.SingleDice <em>Single Dice</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Single Dice</em>'.
	 * @see Rzutykoscia.SingleDice
	 * @generated
	 */
	EClass getSingleDice();

	/**
	 * Returns the meta object for class '{@link Rzutykoscia.MultiDice <em>Multi Dice</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Multi Dice</em>'.
	 * @see Rzutykoscia.MultiDice
	 * @generated
	 */
	EClass getMultiDice();

	/**
	 * Returns the meta object for the containment reference '{@link Rzutykoscia.MultiDice#getCount <em>Count</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Count</em>'.
	 * @see Rzutykoscia.MultiDice#getCount()
	 * @see #getMultiDice()
	 * @generated
	 */
	EReference getMultiDice_Count();

	/**
	 * Returns the meta object for class '{@link Rzutykoscia.Num <em>Num</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Num</em>'.
	 * @see Rzutykoscia.Num
	 * @generated
	 */
	EClass getNum();

	/**
	 * Returns the meta object for the attribute '{@link Rzutykoscia.Num#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see Rzutykoscia.Num#getValue()
	 * @see #getNum()
	 * @generated
	 */
	EAttribute getNum_Value();

	/**
	 * Returns the meta object for class '{@link Rzutykoscia.SumRule <em>Sum Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sum Rule</em>'.
	 * @see Rzutykoscia.SumRule
	 * @generated
	 */
	EClass getSumRule();

	/**
	 * Returns the meta object for class '{@link Rzutykoscia.SuccessRule <em>Success Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Success Rule</em>'.
	 * @see Rzutykoscia.SuccessRule
	 * @generated
	 */
	EClass getSuccessRule();

	/**
	 * Returns the meta object for class '{@link Rzutykoscia.ExplosionRule <em>Explosion Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Explosion Rule</em>'.
	 * @see Rzutykoscia.ExplosionRule
	 * @generated
	 */
	EClass getExplosionRule();

	/**
	 * Returns the meta object for the containment reference '{@link Rzutykoscia.ExplosionRule#getNum <em>Num</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Num</em>'.
	 * @see Rzutykoscia.ExplosionRule#getNum()
	 * @see #getExplosionRule()
	 * @generated
	 */
	EReference getExplosionRule_Num();

	/**
	 * Returns the meta object for the attribute '{@link Rzutykoscia.ExplosionRule#getSign <em>Sign</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Sign</em>'.
	 * @see Rzutykoscia.ExplosionRule#getSign()
	 * @see #getExplosionRule()
	 * @generated
	 */
	EAttribute getExplosionRule_Sign();

	/**
	 * Returns the meta object for class '{@link Rzutykoscia.DiceMarkSum <em>Dice Mark Sum</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Dice Mark Sum</em>'.
	 * @see Rzutykoscia.DiceMarkSum
	 * @generated
	 */
	EClass getDiceMarkSum();

	/**
	 * Returns the meta object for the containment reference '{@link Rzutykoscia.DiceMarkSum#getMark <em>Mark</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Mark</em>'.
	 * @see Rzutykoscia.DiceMarkSum#getMark()
	 * @see #getDiceMarkSum()
	 * @generated
	 */
	EReference getDiceMarkSum_Mark();

	/**
	 * Returns the meta object for class '{@link Rzutykoscia.DiceDiscSum <em>Dice Disc Sum</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Dice Disc Sum</em>'.
	 * @see Rzutykoscia.DiceDiscSum
	 * @generated
	 */
	EClass getDiceDiscSum();

	/**
	 * Returns the meta object for the containment reference '{@link Rzutykoscia.DiceDiscSum#getDiscard <em>Discard</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Discard</em>'.
	 * @see Rzutykoscia.DiceDiscSum#getDiscard()
	 * @see #getDiceDiscSum()
	 * @generated
	 */
	EReference getDiceDiscSum_Discard();

	/**
	 * Returns the meta object for class '{@link Rzutykoscia.DiceRerollSum <em>Dice Reroll Sum</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Dice Reroll Sum</em>'.
	 * @see Rzutykoscia.DiceRerollSum
	 * @generated
	 */
	EClass getDiceRerollSum();

	/**
	 * Returns the meta object for the containment reference '{@link Rzutykoscia.DiceRerollSum#getReroll <em>Reroll</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Reroll</em>'.
	 * @see Rzutykoscia.DiceRerollSum#getReroll()
	 * @see #getDiceRerollSum()
	 * @generated
	 */
	EReference getDiceRerollSum_Reroll();

	/**
	 * Returns the meta object for class '{@link Rzutykoscia.SuccessBasic <em>Success Basic</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Success Basic</em>'.
	 * @see Rzutykoscia.SuccessBasic
	 * @generated
	 */
	EClass getSuccessBasic();

	/**
	 * Returns the meta object for the containment reference '{@link Rzutykoscia.SuccessBasic#getNum <em>Num</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Num</em>'.
	 * @see Rzutykoscia.SuccessBasic#getNum()
	 * @see #getSuccessBasic()
	 * @generated
	 */
	EReference getSuccessBasic_Num();

	/**
	 * Returns the meta object for the attribute '{@link Rzutykoscia.SuccessBasic#isNegated <em>Negated</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Negated</em>'.
	 * @see Rzutykoscia.SuccessBasic#isNegated()
	 * @see #getSuccessBasic()
	 * @generated
	 */
	EAttribute getSuccessBasic_Negated();

	/**
	 * Returns the meta object for class '{@link Rzutykoscia.SuccessThreshold <em>Success Threshold</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Success Threshold</em>'.
	 * @see Rzutykoscia.SuccessThreshold
	 * @generated
	 */
	EClass getSuccessThreshold();

	/**
	 * Returns the meta object for the attribute '{@link Rzutykoscia.SuccessThreshold#getHightlow <em>Hightlow</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Hightlow</em>'.
	 * @see Rzutykoscia.SuccessThreshold#getHightlow()
	 * @see #getSuccessThreshold()
	 * @generated
	 */
	EAttribute getSuccessThreshold_Hightlow();

	/**
	 * Returns the meta object for the containment reference '{@link Rzutykoscia.SuccessThreshold#getNum <em>Num</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Num</em>'.
	 * @see Rzutykoscia.SuccessThreshold#getNum()
	 * @see #getSuccessThreshold()
	 * @generated
	 */
	EReference getSuccessThreshold_Num();

	/**
	 * Returns the meta object for class '{@link Rzutykoscia.SuccessMultiplier <em>Success Multiplier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Success Multiplier</em>'.
	 * @see Rzutykoscia.SuccessMultiplier
	 * @generated
	 */
	EClass getSuccessMultiplier();

	/**
	 * Returns the meta object for the attribute '{@link Rzutykoscia.SuccessMultiplier#getSign <em>Sign</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Sign</em>'.
	 * @see Rzutykoscia.SuccessMultiplier#getSign()
	 * @see #getSuccessMultiplier()
	 * @generated
	 */
	EAttribute getSuccessMultiplier_Sign();

	/**
	 * Returns the meta object for the containment reference '{@link Rzutykoscia.SuccessMultiplier#getMult <em>Mult</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Mult</em>'.
	 * @see Rzutykoscia.SuccessMultiplier#getMult()
	 * @see #getSuccessMultiplier()
	 * @generated
	 */
	EReference getSuccessMultiplier_Mult();

	/**
	 * Returns the meta object for the containment reference '{@link Rzutykoscia.SuccessMultiplier#getNum <em>Num</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Num</em>'.
	 * @see Rzutykoscia.SuccessMultiplier#getNum()
	 * @see #getSuccessMultiplier()
	 * @generated
	 */
	EReference getSuccessMultiplier_Num();

	/**
	 * Returns the meta object for class '{@link Rzutykoscia.DiceMarkSuk <em>Dice Mark Suk</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Dice Mark Suk</em>'.
	 * @see Rzutykoscia.DiceMarkSuk
	 * @generated
	 */
	EClass getDiceMarkSuk();

	/**
	 * Returns the meta object for the containment reference '{@link Rzutykoscia.DiceMarkSuk#getMark <em>Mark</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Mark</em>'.
	 * @see Rzutykoscia.DiceMarkSuk#getMark()
	 * @see #getDiceMarkSuk()
	 * @generated
	 */
	EReference getDiceMarkSuk_Mark();

	/**
	 * Returns the meta object for class '{@link Rzutykoscia.DiceDiscSuk <em>Dice Disc Suk</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Dice Disc Suk</em>'.
	 * @see Rzutykoscia.DiceDiscSuk
	 * @generated
	 */
	EClass getDiceDiscSuk();

	/**
	 * Returns the meta object for the containment reference '{@link Rzutykoscia.DiceDiscSuk#getDiscard <em>Discard</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Discard</em>'.
	 * @see Rzutykoscia.DiceDiscSuk#getDiscard()
	 * @see #getDiceDiscSuk()
	 * @generated
	 */
	EReference getDiceDiscSuk_Discard();

	/**
	 * Returns the meta object for class '{@link Rzutykoscia.DiceRerollSuk <em>Dice Reroll Suk</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Dice Reroll Suk</em>'.
	 * @see Rzutykoscia.DiceRerollSuk
	 * @generated
	 */
	EClass getDiceRerollSuk();

	/**
	 * Returns the meta object for the containment reference '{@link Rzutykoscia.DiceRerollSuk#getReroll <em>Reroll</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Reroll</em>'.
	 * @see Rzutykoscia.DiceRerollSuk#getReroll()
	 * @see #getDiceRerollSuk()
	 * @generated
	 */
	EReference getDiceRerollSuk_Reroll();

	/**
	 * Returns the meta object for class '{@link Rzutykoscia.Mark <em>Mark</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Mark</em>'.
	 * @see Rzutykoscia.Mark
	 * @generated
	 */
	EClass getMark();

	/**
	 * Returns the meta object for class '{@link Rzutykoscia.Discard <em>Discard</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Discard</em>'.
	 * @see Rzutykoscia.Discard
	 * @generated
	 */
	EClass getDiscard();

	/**
	 * Returns the meta object for class '{@link Rzutykoscia.Reroll <em>Reroll</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Reroll</em>'.
	 * @see Rzutykoscia.Reroll
	 * @generated
	 */
	EClass getReroll();

	/**
	 * Returns the meta object for class '{@link Rzutykoscia.MarkThan <em>Mark Than</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Mark Than</em>'.
	 * @see Rzutykoscia.MarkThan
	 * @generated
	 */
	EClass getMarkThan();

	/**
	 * Returns the meta object for the attribute '{@link Rzutykoscia.MarkThan#getHightlow <em>Hightlow</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Hightlow</em>'.
	 * @see Rzutykoscia.MarkThan#getHightlow()
	 * @see #getMarkThan()
	 * @generated
	 */
	EAttribute getMarkThan_Hightlow();

	/**
	 * Returns the meta object for the containment reference '{@link Rzutykoscia.MarkThan#getNum <em>Num</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Num</em>'.
	 * @see Rzutykoscia.MarkThan#getNum()
	 * @see #getMarkThan()
	 * @generated
	 */
	EReference getMarkThan_Num();

	/**
	 * Returns the meta object for class '{@link Rzutykoscia.MarkHigh <em>Mark High</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Mark High</em>'.
	 * @see Rzutykoscia.MarkHigh
	 * @generated
	 */
	EClass getMarkHigh();

	/**
	 * Returns the meta object for the attribute '{@link Rzutykoscia.MarkHigh#getHightlow <em>Hightlow</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Hightlow</em>'.
	 * @see Rzutykoscia.MarkHigh#getHightlow()
	 * @see #getMarkHigh()
	 * @generated
	 */
	EAttribute getMarkHigh_Hightlow();

	/**
	 * Returns the meta object for class '{@link Rzutykoscia.MarkKol <em>Mark Kol</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Mark Kol</em>'.
	 * @see Rzutykoscia.MarkKol
	 * @generated
	 */
	EClass getMarkKol();

	/**
	 * Returns the meta object for the containment reference '{@link Rzutykoscia.MarkKol#getNum <em>Num</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Num</em>'.
	 * @see Rzutykoscia.MarkKol#getNum()
	 * @see #getMarkKol()
	 * @generated
	 */
	EReference getMarkKol_Num();

	/**
	 * Returns the meta object for the attribute '{@link Rzutykoscia.MarkKol#getFirstlast <em>Firstlast</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Firstlast</em>'.
	 * @see Rzutykoscia.MarkKol#getFirstlast()
	 * @see #getMarkKol()
	 * @generated
	 */
	EAttribute getMarkKol_Firstlast();

	/**
	 * Returns the meta object for class '{@link Rzutykoscia.MarkNum <em>Mark Num</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Mark Num</em>'.
	 * @see Rzutykoscia.MarkNum
	 * @generated
	 */
	EClass getMarkNum();

	/**
	 * Returns the meta object for the containment reference '{@link Rzutykoscia.MarkNum#getNum <em>Num</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Num</em>'.
	 * @see Rzutykoscia.MarkNum#getNum()
	 * @see #getMarkNum()
	 * @generated
	 */
	EReference getMarkNum_Num();

	/**
	 * Returns the meta object for class '{@link Rzutykoscia.RerollHigh <em>Reroll High</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Reroll High</em>'.
	 * @see Rzutykoscia.RerollHigh
	 * @generated
	 */
	EClass getRerollHigh();

	/**
	 * Returns the meta object for the attribute '{@link Rzutykoscia.RerollHigh#getHightlow <em>Hightlow</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Hightlow</em>'.
	 * @see Rzutykoscia.RerollHigh#getHightlow()
	 * @see #getRerollHigh()
	 * @generated
	 */
	EAttribute getRerollHigh_Hightlow();

	/**
	 * Returns the meta object for class '{@link Rzutykoscia.RerollThan <em>Reroll Than</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Reroll Than</em>'.
	 * @see Rzutykoscia.RerollThan
	 * @generated
	 */
	EClass getRerollThan();

	/**
	 * Returns the meta object for the attribute '{@link Rzutykoscia.RerollThan#getHightlow <em>Hightlow</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Hightlow</em>'.
	 * @see Rzutykoscia.RerollThan#getHightlow()
	 * @see #getRerollThan()
	 * @generated
	 */
	EAttribute getRerollThan_Hightlow();

	/**
	 * Returns the meta object for the containment reference '{@link Rzutykoscia.RerollThan#getNum <em>Num</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Num</em>'.
	 * @see Rzutykoscia.RerollThan#getNum()
	 * @see #getRerollThan()
	 * @generated
	 */
	EReference getRerollThan_Num();

	/**
	 * Returns the meta object for class '{@link Rzutykoscia.RerollKol <em>Reroll Kol</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Reroll Kol</em>'.
	 * @see Rzutykoscia.RerollKol
	 * @generated
	 */
	EClass getRerollKol();

	/**
	 * Returns the meta object for the containment reference '{@link Rzutykoscia.RerollKol#getNum <em>Num</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Num</em>'.
	 * @see Rzutykoscia.RerollKol#getNum()
	 * @see #getRerollKol()
	 * @generated
	 */
	EReference getRerollKol_Num();

	/**
	 * Returns the meta object for the attribute '{@link Rzutykoscia.RerollKol#getFirstlast <em>Firstlast</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Firstlast</em>'.
	 * @see Rzutykoscia.RerollKol#getFirstlast()
	 * @see #getRerollKol()
	 * @generated
	 */
	EAttribute getRerollKol_Firstlast();

	/**
	 * Returns the meta object for class '{@link Rzutykoscia.RerollNum <em>Reroll Num</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Reroll Num</em>'.
	 * @see Rzutykoscia.RerollNum
	 * @generated
	 */
	EClass getRerollNum();

	/**
	 * Returns the meta object for the containment reference '{@link Rzutykoscia.RerollNum#getNum <em>Num</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Num</em>'.
	 * @see Rzutykoscia.RerollNum#getNum()
	 * @see #getRerollNum()
	 * @generated
	 */
	EReference getRerollNum_Num();

	/**
	 * Returns the meta object for class '{@link Rzutykoscia.DiscardKol <em>Discard Kol</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Discard Kol</em>'.
	 * @see Rzutykoscia.DiscardKol
	 * @generated
	 */
	EClass getDiscardKol();

	/**
	 * Returns the meta object for the containment reference '{@link Rzutykoscia.DiscardKol#getNum <em>Num</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Num</em>'.
	 * @see Rzutykoscia.DiscardKol#getNum()
	 * @see #getDiscardKol()
	 * @generated
	 */
	EReference getDiscardKol_Num();

	/**
	 * Returns the meta object for the attribute '{@link Rzutykoscia.DiscardKol#getFirstlast <em>Firstlast</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Firstlast</em>'.
	 * @see Rzutykoscia.DiscardKol#getFirstlast()
	 * @see #getDiscardKol()
	 * @generated
	 */
	EAttribute getDiscardKol_Firstlast();

	/**
	 * Returns the meta object for class '{@link Rzutykoscia.DiscardNum <em>Discard Num</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Discard Num</em>'.
	 * @see Rzutykoscia.DiscardNum
	 * @generated
	 */
	EClass getDiscardNum();

	/**
	 * Returns the meta object for the containment reference '{@link Rzutykoscia.DiscardNum#getNum <em>Num</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Num</em>'.
	 * @see Rzutykoscia.DiscardNum#getNum()
	 * @see #getDiscardNum()
	 * @generated
	 */
	EReference getDiscardNum_Num();

	/**
	 * Returns the meta object for class '{@link Rzutykoscia.DiscardHigh <em>Discard High</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Discard High</em>'.
	 * @see Rzutykoscia.DiscardHigh
	 * @generated
	 */
	EClass getDiscardHigh();

	/**
	 * Returns the meta object for the attribute '{@link Rzutykoscia.DiscardHigh#getHightlow <em>Hightlow</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Hightlow</em>'.
	 * @see Rzutykoscia.DiscardHigh#getHightlow()
	 * @see #getDiscardHigh()
	 * @generated
	 */
	EAttribute getDiscardHigh_Hightlow();

	/**
	 * Returns the meta object for class '{@link Rzutykoscia.DiscardThan <em>Discard Than</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Discard Than</em>'.
	 * @see Rzutykoscia.DiscardThan
	 * @generated
	 */
	EClass getDiscardThan();

	/**
	 * Returns the meta object for the attribute '{@link Rzutykoscia.DiscardThan#getHightlow <em>Hightlow</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Hightlow</em>'.
	 * @see Rzutykoscia.DiscardThan#getHightlow()
	 * @see #getDiscardThan()
	 * @generated
	 */
	EAttribute getDiscardThan_Hightlow();

	/**
	 * Returns the meta object for the containment reference '{@link Rzutykoscia.DiscardThan#getNum <em>Num</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Num</em>'.
	 * @see Rzutykoscia.DiscardThan#getNum()
	 * @see #getDiscardThan()
	 * @generated
	 */
	EReference getDiscardThan_Num();

	/**
	 * Returns the meta object for class '{@link Rzutykoscia.SuccessCompositeRule <em>Success Composite Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Success Composite Rule</em>'.
	 * @see Rzutykoscia.SuccessCompositeRule
	 * @generated
	 */
	EClass getSuccessCompositeRule();

	/**
	 * Returns the meta object for the containment reference '{@link Rzutykoscia.SuccessCompositeRule#getSuccessrule <em>Successrule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Successrule</em>'.
	 * @see Rzutykoscia.SuccessCompositeRule#getSuccessrule()
	 * @see #getSuccessCompositeRule()
	 * @generated
	 */
	EReference getSuccessCompositeRule_Successrule();

	/**
	 * Returns the meta object for enum '{@link Rzutykoscia.Operator <em>Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Operator</em>'.
	 * @see Rzutykoscia.Operator
	 * @generated
	 */
	EEnum getOperator();

	/**
	 * Returns the meta object for enum '{@link Rzutykoscia.Sign <em>Sign</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Sign</em>'.
	 * @see Rzutykoscia.Sign
	 * @generated
	 */
	EEnum getSign();

	/**
	 * Returns the meta object for enum '{@link Rzutykoscia.HighLow <em>High Low</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>High Low</em>'.
	 * @see Rzutykoscia.HighLow
	 * @generated
	 */
	EEnum getHighLow();

	/**
	 * Returns the meta object for enum '{@link Rzutykoscia.FirstLast <em>First Last</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>First Last</em>'.
	 * @see Rzutykoscia.FirstLast
	 * @generated
	 */
	EEnum getFirstLast();

	/**
	 * Returns the meta object for enum '{@link Rzutykoscia.MulDiv <em>Mul Div</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Mul Div</em>'.
	 * @see Rzutykoscia.MulDiv
	 * @generated
	 */
	EEnum getMulDiv();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	RzutykosciaFactory getRzutykosciaFactory();

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
		 * The meta object literal for the '{@link Rzutykoscia.impl.LanguageImpl <em>Language</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Rzutykoscia.impl.LanguageImpl
		 * @see Rzutykoscia.impl.RzutykosciaPackageImpl#getLanguage()
		 * @generated
		 */
		EClass LANGUAGE = eINSTANCE.getLanguage();

		/**
		 * The meta object literal for the '<em><b>Statement</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LANGUAGE__STATEMENT = eINSTANCE.getLanguage_Statement();

		/**
		 * The meta object literal for the '{@link Rzutykoscia.impl.StatImpl <em>Stat</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Rzutykoscia.impl.StatImpl
		 * @see Rzutykoscia.impl.RzutykosciaPackageImpl#getStat()
		 * @generated
		 */
		EClass STAT = eINSTANCE.getStat();

		/**
		 * The meta object literal for the '{@link Rzutykoscia.impl.SumStatementImpl <em>Sum Statement</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Rzutykoscia.impl.SumStatementImpl
		 * @see Rzutykoscia.impl.RzutykosciaPackageImpl#getSumStatement()
		 * @generated
		 */
		EClass SUM_STATEMENT = eINSTANCE.getSumStatement();

		/**
		 * The meta object literal for the '<em><b>Diceexprsum</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SUM_STATEMENT__DICEEXPRSUM = eINSTANCE.getSumStatement_Diceexprsum();

		/**
		 * The meta object literal for the '{@link Rzutykoscia.impl.SuccessStatementImpl <em>Success Statement</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Rzutykoscia.impl.SuccessStatementImpl
		 * @see Rzutykoscia.impl.RzutykosciaPackageImpl#getSuccessStatement()
		 * @generated
		 */
		EClass SUCCESS_STATEMENT = eINSTANCE.getSuccessStatement();

		/**
		 * The meta object literal for the '<em><b>Diceexprsuk</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SUCCESS_STATEMENT__DICEEXPRSUK = eINSTANCE.getSuccessStatement_Diceexprsuk();

		/**
		 * The meta object literal for the '{@link Rzutykoscia.impl.DiceExprImpl <em>Dice Expr</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Rzutykoscia.impl.DiceExprImpl
		 * @see Rzutykoscia.impl.RzutykosciaPackageImpl#getDiceExpr()
		 * @generated
		 */
		EClass DICE_EXPR = eINSTANCE.getDiceExpr();

		/**
		 * The meta object literal for the '<em><b>Mulexpr</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DICE_EXPR__MULEXPR = eINSTANCE.getDiceExpr_Mulexpr();

		/**
		 * The meta object literal for the '<em><b>Sign</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DICE_EXPR__SIGN = eINSTANCE.getDiceExpr_Sign();

		/**
		 * The meta object literal for the '{@link Rzutykoscia.impl.DiceExprSumImpl <em>Dice Expr Sum</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Rzutykoscia.impl.DiceExprSumImpl
		 * @see Rzutykoscia.impl.RzutykosciaPackageImpl#getDiceExprSum()
		 * @generated
		 */
		EClass DICE_EXPR_SUM = eINSTANCE.getDiceExprSum();

		/**
		 * The meta object literal for the '<em><b>Sumrule</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DICE_EXPR_SUM__SUMRULE = eINSTANCE.getDiceExprSum_Sumrule();

		/**
		 * The meta object literal for the '{@link Rzutykoscia.impl.DiceExprSukImpl <em>Dice Expr Suk</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Rzutykoscia.impl.DiceExprSukImpl
		 * @see Rzutykoscia.impl.RzutykosciaPackageImpl#getDiceExprSuk()
		 * @generated
		 */
		EClass DICE_EXPR_SUK = eINSTANCE.getDiceExprSuk();

		/**
		 * The meta object literal for the '<em><b>Successrule</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DICE_EXPR_SUK__SUCCESSRULE = eINSTANCE.getDiceExprSuk_Successrule();

		/**
		 * The meta object literal for the '{@link Rzutykoscia.impl.MulExprImpl <em>Mul Expr</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Rzutykoscia.impl.MulExprImpl
		 * @see Rzutykoscia.impl.RzutykosciaPackageImpl#getMulExpr()
		 * @generated
		 */
		EClass MUL_EXPR = eINSTANCE.getMulExpr();

		/**
		 * The meta object literal for the '<em><b>Num</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MUL_EXPR__NUM = eINSTANCE.getMulExpr_Num();

		/**
		 * The meta object literal for the '<em><b>Formexpr</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MUL_EXPR__FORMEXPR = eINSTANCE.getMulExpr_Formexpr();

		/**
		 * The meta object literal for the '{@link Rzutykoscia.impl.FormExprImpl <em>Form Expr</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Rzutykoscia.impl.FormExprImpl
		 * @see Rzutykoscia.impl.RzutykosciaPackageImpl#getFormExpr()
		 * @generated
		 */
		EClass FORM_EXPR = eINSTANCE.getFormExpr();

		/**
		 * The meta object literal for the '<em><b>Left</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FORM_EXPR__LEFT = eINSTANCE.getFormExpr_Left();

		/**
		 * The meta object literal for the '<em><b>Right</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FORM_EXPR__RIGHT = eINSTANCE.getFormExpr_Right();

		/**
		 * The meta object literal for the '<em><b>Operator</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FORM_EXPR__OPERATOR = eINSTANCE.getFormExpr_Operator();

		/**
		 * The meta object literal for the '{@link Rzutykoscia.impl.DiceImpl <em>Dice</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Rzutykoscia.impl.DiceImpl
		 * @see Rzutykoscia.impl.RzutykosciaPackageImpl#getDice()
		 * @generated
		 */
		EClass DICE = eINSTANCE.getDice();

		/**
		 * The meta object literal for the '<em><b>Sides</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DICE__SIDES = eINSTANCE.getDice_Sides();

		/**
		 * The meta object literal for the '{@link Rzutykoscia.impl.SingleDiceImpl <em>Single Dice</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Rzutykoscia.impl.SingleDiceImpl
		 * @see Rzutykoscia.impl.RzutykosciaPackageImpl#getSingleDice()
		 * @generated
		 */
		EClass SINGLE_DICE = eINSTANCE.getSingleDice();

		/**
		 * The meta object literal for the '{@link Rzutykoscia.impl.MultiDiceImpl <em>Multi Dice</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Rzutykoscia.impl.MultiDiceImpl
		 * @see Rzutykoscia.impl.RzutykosciaPackageImpl#getMultiDice()
		 * @generated
		 */
		EClass MULTI_DICE = eINSTANCE.getMultiDice();

		/**
		 * The meta object literal for the '<em><b>Count</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MULTI_DICE__COUNT = eINSTANCE.getMultiDice_Count();

		/**
		 * The meta object literal for the '{@link Rzutykoscia.impl.NumImpl <em>Num</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Rzutykoscia.impl.NumImpl
		 * @see Rzutykoscia.impl.RzutykosciaPackageImpl#getNum()
		 * @generated
		 */
		EClass NUM = eINSTANCE.getNum();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NUM__VALUE = eINSTANCE.getNum_Value();

		/**
		 * The meta object literal for the '{@link Rzutykoscia.impl.SumRuleImpl <em>Sum Rule</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Rzutykoscia.impl.SumRuleImpl
		 * @see Rzutykoscia.impl.RzutykosciaPackageImpl#getSumRule()
		 * @generated
		 */
		EClass SUM_RULE = eINSTANCE.getSumRule();

		/**
		 * The meta object literal for the '{@link Rzutykoscia.impl.SuccessRuleImpl <em>Success Rule</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Rzutykoscia.impl.SuccessRuleImpl
		 * @see Rzutykoscia.impl.RzutykosciaPackageImpl#getSuccessRule()
		 * @generated
		 */
		EClass SUCCESS_RULE = eINSTANCE.getSuccessRule();

		/**
		 * The meta object literal for the '{@link Rzutykoscia.impl.ExplosionRuleImpl <em>Explosion Rule</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Rzutykoscia.impl.ExplosionRuleImpl
		 * @see Rzutykoscia.impl.RzutykosciaPackageImpl#getExplosionRule()
		 * @generated
		 */
		EClass EXPLOSION_RULE = eINSTANCE.getExplosionRule();

		/**
		 * The meta object literal for the '<em><b>Num</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXPLOSION_RULE__NUM = eINSTANCE.getExplosionRule_Num();

		/**
		 * The meta object literal for the '<em><b>Sign</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXPLOSION_RULE__SIGN = eINSTANCE.getExplosionRule_Sign();

		/**
		 * The meta object literal for the '{@link Rzutykoscia.impl.DiceMarkSumImpl <em>Dice Mark Sum</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Rzutykoscia.impl.DiceMarkSumImpl
		 * @see Rzutykoscia.impl.RzutykosciaPackageImpl#getDiceMarkSum()
		 * @generated
		 */
		EClass DICE_MARK_SUM = eINSTANCE.getDiceMarkSum();

		/**
		 * The meta object literal for the '<em><b>Mark</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DICE_MARK_SUM__MARK = eINSTANCE.getDiceMarkSum_Mark();

		/**
		 * The meta object literal for the '{@link Rzutykoscia.impl.DiceDiscSumImpl <em>Dice Disc Sum</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Rzutykoscia.impl.DiceDiscSumImpl
		 * @see Rzutykoscia.impl.RzutykosciaPackageImpl#getDiceDiscSum()
		 * @generated
		 */
		EClass DICE_DISC_SUM = eINSTANCE.getDiceDiscSum();

		/**
		 * The meta object literal for the '<em><b>Discard</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DICE_DISC_SUM__DISCARD = eINSTANCE.getDiceDiscSum_Discard();

		/**
		 * The meta object literal for the '{@link Rzutykoscia.impl.DiceRerollSumImpl <em>Dice Reroll Sum</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Rzutykoscia.impl.DiceRerollSumImpl
		 * @see Rzutykoscia.impl.RzutykosciaPackageImpl#getDiceRerollSum()
		 * @generated
		 */
		EClass DICE_REROLL_SUM = eINSTANCE.getDiceRerollSum();

		/**
		 * The meta object literal for the '<em><b>Reroll</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DICE_REROLL_SUM__REROLL = eINSTANCE.getDiceRerollSum_Reroll();

		/**
		 * The meta object literal for the '{@link Rzutykoscia.impl.SuccessBasicImpl <em>Success Basic</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Rzutykoscia.impl.SuccessBasicImpl
		 * @see Rzutykoscia.impl.RzutykosciaPackageImpl#getSuccessBasic()
		 * @generated
		 */
		EClass SUCCESS_BASIC = eINSTANCE.getSuccessBasic();

		/**
		 * The meta object literal for the '<em><b>Num</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SUCCESS_BASIC__NUM = eINSTANCE.getSuccessBasic_Num();

		/**
		 * The meta object literal for the '<em><b>Negated</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SUCCESS_BASIC__NEGATED = eINSTANCE.getSuccessBasic_Negated();

		/**
		 * The meta object literal for the '{@link Rzutykoscia.impl.SuccessThresholdImpl <em>Success Threshold</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Rzutykoscia.impl.SuccessThresholdImpl
		 * @see Rzutykoscia.impl.RzutykosciaPackageImpl#getSuccessThreshold()
		 * @generated
		 */
		EClass SUCCESS_THRESHOLD = eINSTANCE.getSuccessThreshold();

		/**
		 * The meta object literal for the '<em><b>Hightlow</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SUCCESS_THRESHOLD__HIGHTLOW = eINSTANCE.getSuccessThreshold_Hightlow();

		/**
		 * The meta object literal for the '<em><b>Num</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SUCCESS_THRESHOLD__NUM = eINSTANCE.getSuccessThreshold_Num();

		/**
		 * The meta object literal for the '{@link Rzutykoscia.impl.SuccessMultiplierImpl <em>Success Multiplier</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Rzutykoscia.impl.SuccessMultiplierImpl
		 * @see Rzutykoscia.impl.RzutykosciaPackageImpl#getSuccessMultiplier()
		 * @generated
		 */
		EClass SUCCESS_MULTIPLIER = eINSTANCE.getSuccessMultiplier();

		/**
		 * The meta object literal for the '<em><b>Sign</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SUCCESS_MULTIPLIER__SIGN = eINSTANCE.getSuccessMultiplier_Sign();

		/**
		 * The meta object literal for the '<em><b>Mult</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SUCCESS_MULTIPLIER__MULT = eINSTANCE.getSuccessMultiplier_Mult();

		/**
		 * The meta object literal for the '<em><b>Num</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SUCCESS_MULTIPLIER__NUM = eINSTANCE.getSuccessMultiplier_Num();

		/**
		 * The meta object literal for the '{@link Rzutykoscia.impl.DiceMarkSukImpl <em>Dice Mark Suk</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Rzutykoscia.impl.DiceMarkSukImpl
		 * @see Rzutykoscia.impl.RzutykosciaPackageImpl#getDiceMarkSuk()
		 * @generated
		 */
		EClass DICE_MARK_SUK = eINSTANCE.getDiceMarkSuk();

		/**
		 * The meta object literal for the '<em><b>Mark</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DICE_MARK_SUK__MARK = eINSTANCE.getDiceMarkSuk_Mark();

		/**
		 * The meta object literal for the '{@link Rzutykoscia.impl.DiceDiscSukImpl <em>Dice Disc Suk</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Rzutykoscia.impl.DiceDiscSukImpl
		 * @see Rzutykoscia.impl.RzutykosciaPackageImpl#getDiceDiscSuk()
		 * @generated
		 */
		EClass DICE_DISC_SUK = eINSTANCE.getDiceDiscSuk();

		/**
		 * The meta object literal for the '<em><b>Discard</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DICE_DISC_SUK__DISCARD = eINSTANCE.getDiceDiscSuk_Discard();

		/**
		 * The meta object literal for the '{@link Rzutykoscia.impl.DiceRerollSukImpl <em>Dice Reroll Suk</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Rzutykoscia.impl.DiceRerollSukImpl
		 * @see Rzutykoscia.impl.RzutykosciaPackageImpl#getDiceRerollSuk()
		 * @generated
		 */
		EClass DICE_REROLL_SUK = eINSTANCE.getDiceRerollSuk();

		/**
		 * The meta object literal for the '<em><b>Reroll</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DICE_REROLL_SUK__REROLL = eINSTANCE.getDiceRerollSuk_Reroll();

		/**
		 * The meta object literal for the '{@link Rzutykoscia.impl.MarkImpl <em>Mark</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Rzutykoscia.impl.MarkImpl
		 * @see Rzutykoscia.impl.RzutykosciaPackageImpl#getMark()
		 * @generated
		 */
		EClass MARK = eINSTANCE.getMark();

		/**
		 * The meta object literal for the '{@link Rzutykoscia.impl.DiscardImpl <em>Discard</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Rzutykoscia.impl.DiscardImpl
		 * @see Rzutykoscia.impl.RzutykosciaPackageImpl#getDiscard()
		 * @generated
		 */
		EClass DISCARD = eINSTANCE.getDiscard();

		/**
		 * The meta object literal for the '{@link Rzutykoscia.impl.RerollImpl <em>Reroll</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Rzutykoscia.impl.RerollImpl
		 * @see Rzutykoscia.impl.RzutykosciaPackageImpl#getReroll()
		 * @generated
		 */
		EClass REROLL = eINSTANCE.getReroll();

		/**
		 * The meta object literal for the '{@link Rzutykoscia.impl.MarkThanImpl <em>Mark Than</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Rzutykoscia.impl.MarkThanImpl
		 * @see Rzutykoscia.impl.RzutykosciaPackageImpl#getMarkThan()
		 * @generated
		 */
		EClass MARK_THAN = eINSTANCE.getMarkThan();

		/**
		 * The meta object literal for the '<em><b>Hightlow</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MARK_THAN__HIGHTLOW = eINSTANCE.getMarkThan_Hightlow();

		/**
		 * The meta object literal for the '<em><b>Num</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MARK_THAN__NUM = eINSTANCE.getMarkThan_Num();

		/**
		 * The meta object literal for the '{@link Rzutykoscia.impl.MarkHighImpl <em>Mark High</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Rzutykoscia.impl.MarkHighImpl
		 * @see Rzutykoscia.impl.RzutykosciaPackageImpl#getMarkHigh()
		 * @generated
		 */
		EClass MARK_HIGH = eINSTANCE.getMarkHigh();

		/**
		 * The meta object literal for the '<em><b>Hightlow</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MARK_HIGH__HIGHTLOW = eINSTANCE.getMarkHigh_Hightlow();

		/**
		 * The meta object literal for the '{@link Rzutykoscia.impl.MarkKolImpl <em>Mark Kol</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Rzutykoscia.impl.MarkKolImpl
		 * @see Rzutykoscia.impl.RzutykosciaPackageImpl#getMarkKol()
		 * @generated
		 */
		EClass MARK_KOL = eINSTANCE.getMarkKol();

		/**
		 * The meta object literal for the '<em><b>Num</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MARK_KOL__NUM = eINSTANCE.getMarkKol_Num();

		/**
		 * The meta object literal for the '<em><b>Firstlast</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MARK_KOL__FIRSTLAST = eINSTANCE.getMarkKol_Firstlast();

		/**
		 * The meta object literal for the '{@link Rzutykoscia.impl.MarkNumImpl <em>Mark Num</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Rzutykoscia.impl.MarkNumImpl
		 * @see Rzutykoscia.impl.RzutykosciaPackageImpl#getMarkNum()
		 * @generated
		 */
		EClass MARK_NUM = eINSTANCE.getMarkNum();

		/**
		 * The meta object literal for the '<em><b>Num</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MARK_NUM__NUM = eINSTANCE.getMarkNum_Num();

		/**
		 * The meta object literal for the '{@link Rzutykoscia.impl.RerollHighImpl <em>Reroll High</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Rzutykoscia.impl.RerollHighImpl
		 * @see Rzutykoscia.impl.RzutykosciaPackageImpl#getRerollHigh()
		 * @generated
		 */
		EClass REROLL_HIGH = eINSTANCE.getRerollHigh();

		/**
		 * The meta object literal for the '<em><b>Hightlow</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REROLL_HIGH__HIGHTLOW = eINSTANCE.getRerollHigh_Hightlow();

		/**
		 * The meta object literal for the '{@link Rzutykoscia.impl.RerollThanImpl <em>Reroll Than</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Rzutykoscia.impl.RerollThanImpl
		 * @see Rzutykoscia.impl.RzutykosciaPackageImpl#getRerollThan()
		 * @generated
		 */
		EClass REROLL_THAN = eINSTANCE.getRerollThan();

		/**
		 * The meta object literal for the '<em><b>Hightlow</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REROLL_THAN__HIGHTLOW = eINSTANCE.getRerollThan_Hightlow();

		/**
		 * The meta object literal for the '<em><b>Num</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REROLL_THAN__NUM = eINSTANCE.getRerollThan_Num();

		/**
		 * The meta object literal for the '{@link Rzutykoscia.impl.RerollKolImpl <em>Reroll Kol</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Rzutykoscia.impl.RerollKolImpl
		 * @see Rzutykoscia.impl.RzutykosciaPackageImpl#getRerollKol()
		 * @generated
		 */
		EClass REROLL_KOL = eINSTANCE.getRerollKol();

		/**
		 * The meta object literal for the '<em><b>Num</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REROLL_KOL__NUM = eINSTANCE.getRerollKol_Num();

		/**
		 * The meta object literal for the '<em><b>Firstlast</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REROLL_KOL__FIRSTLAST = eINSTANCE.getRerollKol_Firstlast();

		/**
		 * The meta object literal for the '{@link Rzutykoscia.impl.RerollNumImpl <em>Reroll Num</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Rzutykoscia.impl.RerollNumImpl
		 * @see Rzutykoscia.impl.RzutykosciaPackageImpl#getRerollNum()
		 * @generated
		 */
		EClass REROLL_NUM = eINSTANCE.getRerollNum();

		/**
		 * The meta object literal for the '<em><b>Num</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REROLL_NUM__NUM = eINSTANCE.getRerollNum_Num();

		/**
		 * The meta object literal for the '{@link Rzutykoscia.impl.DiscardKolImpl <em>Discard Kol</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Rzutykoscia.impl.DiscardKolImpl
		 * @see Rzutykoscia.impl.RzutykosciaPackageImpl#getDiscardKol()
		 * @generated
		 */
		EClass DISCARD_KOL = eINSTANCE.getDiscardKol();

		/**
		 * The meta object literal for the '<em><b>Num</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DISCARD_KOL__NUM = eINSTANCE.getDiscardKol_Num();

		/**
		 * The meta object literal for the '<em><b>Firstlast</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DISCARD_KOL__FIRSTLAST = eINSTANCE.getDiscardKol_Firstlast();

		/**
		 * The meta object literal for the '{@link Rzutykoscia.impl.DiscardNumImpl <em>Discard Num</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Rzutykoscia.impl.DiscardNumImpl
		 * @see Rzutykoscia.impl.RzutykosciaPackageImpl#getDiscardNum()
		 * @generated
		 */
		EClass DISCARD_NUM = eINSTANCE.getDiscardNum();

		/**
		 * The meta object literal for the '<em><b>Num</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DISCARD_NUM__NUM = eINSTANCE.getDiscardNum_Num();

		/**
		 * The meta object literal for the '{@link Rzutykoscia.impl.DiscardHighImpl <em>Discard High</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Rzutykoscia.impl.DiscardHighImpl
		 * @see Rzutykoscia.impl.RzutykosciaPackageImpl#getDiscardHigh()
		 * @generated
		 */
		EClass DISCARD_HIGH = eINSTANCE.getDiscardHigh();

		/**
		 * The meta object literal for the '<em><b>Hightlow</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DISCARD_HIGH__HIGHTLOW = eINSTANCE.getDiscardHigh_Hightlow();

		/**
		 * The meta object literal for the '{@link Rzutykoscia.impl.DiscardThanImpl <em>Discard Than</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Rzutykoscia.impl.DiscardThanImpl
		 * @see Rzutykoscia.impl.RzutykosciaPackageImpl#getDiscardThan()
		 * @generated
		 */
		EClass DISCARD_THAN = eINSTANCE.getDiscardThan();

		/**
		 * The meta object literal for the '<em><b>Hightlow</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DISCARD_THAN__HIGHTLOW = eINSTANCE.getDiscardThan_Hightlow();

		/**
		 * The meta object literal for the '<em><b>Num</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DISCARD_THAN__NUM = eINSTANCE.getDiscardThan_Num();

		/**
		 * The meta object literal for the '{@link Rzutykoscia.impl.SuccessCompositeRuleImpl <em>Success Composite Rule</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Rzutykoscia.impl.SuccessCompositeRuleImpl
		 * @see Rzutykoscia.impl.RzutykosciaPackageImpl#getSuccessCompositeRule()
		 * @generated
		 */
		EClass SUCCESS_COMPOSITE_RULE = eINSTANCE.getSuccessCompositeRule();

		/**
		 * The meta object literal for the '<em><b>Successrule</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SUCCESS_COMPOSITE_RULE__SUCCESSRULE = eINSTANCE.getSuccessCompositeRule_Successrule();

		/**
		 * The meta object literal for the '{@link Rzutykoscia.Operator <em>Operator</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Rzutykoscia.Operator
		 * @see Rzutykoscia.impl.RzutykosciaPackageImpl#getOperator()
		 * @generated
		 */
		EEnum OPERATOR = eINSTANCE.getOperator();

		/**
		 * The meta object literal for the '{@link Rzutykoscia.Sign <em>Sign</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Rzutykoscia.Sign
		 * @see Rzutykoscia.impl.RzutykosciaPackageImpl#getSign()
		 * @generated
		 */
		EEnum SIGN = eINSTANCE.getSign();

		/**
		 * The meta object literal for the '{@link Rzutykoscia.HighLow <em>High Low</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Rzutykoscia.HighLow
		 * @see Rzutykoscia.impl.RzutykosciaPackageImpl#getHighLow()
		 * @generated
		 */
		EEnum HIGH_LOW = eINSTANCE.getHighLow();

		/**
		 * The meta object literal for the '{@link Rzutykoscia.FirstLast <em>First Last</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Rzutykoscia.FirstLast
		 * @see Rzutykoscia.impl.RzutykosciaPackageImpl#getFirstLast()
		 * @generated
		 */
		EEnum FIRST_LAST = eINSTANCE.getFirstLast();

		/**
		 * The meta object literal for the '{@link Rzutykoscia.MulDiv <em>Mul Div</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Rzutykoscia.MulDiv
		 * @see Rzutykoscia.impl.RzutykosciaPackageImpl#getMulDiv()
		 * @generated
		 */
		EEnum MUL_DIV = eINSTANCE.getMulDiv();

	}

} //RzutykosciaPackage
