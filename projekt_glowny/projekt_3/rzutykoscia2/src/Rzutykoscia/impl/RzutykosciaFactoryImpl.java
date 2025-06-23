/**
 */
package Rzutykoscia.impl;

import Rzutykoscia.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class RzutykosciaFactoryImpl extends EFactoryImpl implements RzutykosciaFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static RzutykosciaFactory init() {
		try {
			RzutykosciaFactory theRzutykosciaFactory = (RzutykosciaFactory)EPackage.Registry.INSTANCE.getEFactory(RzutykosciaPackage.eNS_URI);
			if (theRzutykosciaFactory != null) {
				return theRzutykosciaFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new RzutykosciaFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RzutykosciaFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case RzutykosciaPackage.LANGUAGE: return createLanguage();
			case RzutykosciaPackage.SUM_STATEMENT: return createSumStatement();
			case RzutykosciaPackage.SUCCESS_STATEMENT: return createSuccessStatement();
			case RzutykosciaPackage.DICE_EXPR_SUM: return createDiceExprSum();
			case RzutykosciaPackage.DICE_EXPR_SUK: return createDiceExprSuk();
			case RzutykosciaPackage.MUL_EXPR: return createMulExpr();
			case RzutykosciaPackage.FORM_EXPR: return createFormExpr();
			case RzutykosciaPackage.SINGLE_DICE: return createSingleDice();
			case RzutykosciaPackage.MULTI_DICE: return createMultiDice();
			case RzutykosciaPackage.NUM: return createNum();
			case RzutykosciaPackage.EXPLOSION_RULE: return createExplosionRule();
			case RzutykosciaPackage.DICE_MARK_SUM: return createDiceMarkSum();
			case RzutykosciaPackage.DICE_DISC_SUM: return createDiceDiscSum();
			case RzutykosciaPackage.DICE_REROLL_SUM: return createDiceRerollSum();
			case RzutykosciaPackage.SUCCESS_BASIC: return createSuccessBasic();
			case RzutykosciaPackage.SUCCESS_THRESHOLD: return createSuccessThreshold();
			case RzutykosciaPackage.SUCCESS_MULTIPLIER: return createSuccessMultiplier();
			case RzutykosciaPackage.DICE_MARK_SUK: return createDiceMarkSuk();
			case RzutykosciaPackage.DICE_DISC_SUK: return createDiceDiscSuk();
			case RzutykosciaPackage.DICE_REROLL_SUK: return createDiceRerollSuk();
			case RzutykosciaPackage.MARK_THAN: return createMarkThan();
			case RzutykosciaPackage.MARK_HIGH: return createMarkHigh();
			case RzutykosciaPackage.MARK_KOL: return createMarkKol();
			case RzutykosciaPackage.MARK_NUM: return createMarkNum();
			case RzutykosciaPackage.REROLL_HIGH: return createRerollHigh();
			case RzutykosciaPackage.REROLL_THAN: return createRerollThan();
			case RzutykosciaPackage.REROLL_KOL: return createRerollKol();
			case RzutykosciaPackage.REROLL_NUM: return createRerollNum();
			case RzutykosciaPackage.DISCARD_KOL: return createDiscardKol();
			case RzutykosciaPackage.DISCARD_NUM: return createDiscardNum();
			case RzutykosciaPackage.DISCARD_HIGH: return createDiscardHigh();
			case RzutykosciaPackage.DISCARD_THAN: return createDiscardThan();
			case RzutykosciaPackage.SUCCESS_COMPOSITE_RULE: return createSuccessCompositeRule();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case RzutykosciaPackage.OPERATOR:
				return createOperatorFromString(eDataType, initialValue);
			case RzutykosciaPackage.SIGN:
				return createSignFromString(eDataType, initialValue);
			case RzutykosciaPackage.HIGH_LOW:
				return createHighLowFromString(eDataType, initialValue);
			case RzutykosciaPackage.FIRST_LAST:
				return createFirstLastFromString(eDataType, initialValue);
			case RzutykosciaPackage.MUL_DIV:
				return createMulDivFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case RzutykosciaPackage.OPERATOR:
				return convertOperatorToString(eDataType, instanceValue);
			case RzutykosciaPackage.SIGN:
				return convertSignToString(eDataType, instanceValue);
			case RzutykosciaPackage.HIGH_LOW:
				return convertHighLowToString(eDataType, instanceValue);
			case RzutykosciaPackage.FIRST_LAST:
				return convertFirstLastToString(eDataType, instanceValue);
			case RzutykosciaPackage.MUL_DIV:
				return convertMulDivToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Language createLanguage() {
		LanguageImpl language = new LanguageImpl();
		return language;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SumStatement createSumStatement() {
		SumStatementImpl sumStatement = new SumStatementImpl();
		return sumStatement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SuccessStatement createSuccessStatement() {
		SuccessStatementImpl successStatement = new SuccessStatementImpl();
		return successStatement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DiceExprSum createDiceExprSum() {
		DiceExprSumImpl diceExprSum = new DiceExprSumImpl();
		return diceExprSum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DiceExprSuk createDiceExprSuk() {
		DiceExprSukImpl diceExprSuk = new DiceExprSukImpl();
		return diceExprSuk;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MulExpr createMulExpr() {
		MulExprImpl mulExpr = new MulExprImpl();
		return mulExpr;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FormExpr createFormExpr() {
		FormExprImpl formExpr = new FormExprImpl();
		return formExpr;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SingleDice createSingleDice() {
		SingleDiceImpl singleDice = new SingleDiceImpl();
		return singleDice;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MultiDice createMultiDice() {
		MultiDiceImpl multiDice = new MultiDiceImpl();
		return multiDice;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Num createNum() {
		NumImpl num = new NumImpl();
		return num;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ExplosionRule createExplosionRule() {
		ExplosionRuleImpl explosionRule = new ExplosionRuleImpl();
		return explosionRule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DiceMarkSum createDiceMarkSum() {
		DiceMarkSumImpl diceMarkSum = new DiceMarkSumImpl();
		return diceMarkSum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DiceDiscSum createDiceDiscSum() {
		DiceDiscSumImpl diceDiscSum = new DiceDiscSumImpl();
		return diceDiscSum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DiceRerollSum createDiceRerollSum() {
		DiceRerollSumImpl diceRerollSum = new DiceRerollSumImpl();
		return diceRerollSum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SuccessBasic createSuccessBasic() {
		SuccessBasicImpl successBasic = new SuccessBasicImpl();
		return successBasic;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SuccessThreshold createSuccessThreshold() {
		SuccessThresholdImpl successThreshold = new SuccessThresholdImpl();
		return successThreshold;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SuccessMultiplier createSuccessMultiplier() {
		SuccessMultiplierImpl successMultiplier = new SuccessMultiplierImpl();
		return successMultiplier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DiceMarkSuk createDiceMarkSuk() {
		DiceMarkSukImpl diceMarkSuk = new DiceMarkSukImpl();
		return diceMarkSuk;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DiceDiscSuk createDiceDiscSuk() {
		DiceDiscSukImpl diceDiscSuk = new DiceDiscSukImpl();
		return diceDiscSuk;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DiceRerollSuk createDiceRerollSuk() {
		DiceRerollSukImpl diceRerollSuk = new DiceRerollSukImpl();
		return diceRerollSuk;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MarkThan createMarkThan() {
		MarkThanImpl markThan = new MarkThanImpl();
		return markThan;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MarkHigh createMarkHigh() {
		MarkHighImpl markHigh = new MarkHighImpl();
		return markHigh;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MarkKol createMarkKol() {
		MarkKolImpl markKol = new MarkKolImpl();
		return markKol;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MarkNum createMarkNum() {
		MarkNumImpl markNum = new MarkNumImpl();
		return markNum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RerollHigh createRerollHigh() {
		RerollHighImpl rerollHigh = new RerollHighImpl();
		return rerollHigh;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RerollThan createRerollThan() {
		RerollThanImpl rerollThan = new RerollThanImpl();
		return rerollThan;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RerollKol createRerollKol() {
		RerollKolImpl rerollKol = new RerollKolImpl();
		return rerollKol;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RerollNum createRerollNum() {
		RerollNumImpl rerollNum = new RerollNumImpl();
		return rerollNum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DiscardKol createDiscardKol() {
		DiscardKolImpl discardKol = new DiscardKolImpl();
		return discardKol;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DiscardNum createDiscardNum() {
		DiscardNumImpl discardNum = new DiscardNumImpl();
		return discardNum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DiscardHigh createDiscardHigh() {
		DiscardHighImpl discardHigh = new DiscardHighImpl();
		return discardHigh;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DiscardThan createDiscardThan() {
		DiscardThanImpl discardThan = new DiscardThanImpl();
		return discardThan;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SuccessCompositeRule createSuccessCompositeRule() {
		SuccessCompositeRuleImpl successCompositeRule = new SuccessCompositeRuleImpl();
		return successCompositeRule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Operator createOperatorFromString(EDataType eDataType, String initialValue) {
		Operator result = Operator.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertOperatorToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Sign createSignFromString(EDataType eDataType, String initialValue) {
		Sign result = Sign.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSignToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HighLow createHighLowFromString(EDataType eDataType, String initialValue) {
		HighLow result = HighLow.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertHighLowToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FirstLast createFirstLastFromString(EDataType eDataType, String initialValue) {
		FirstLast result = FirstLast.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertFirstLastToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MulDiv createMulDivFromString(EDataType eDataType, String initialValue) {
		MulDiv result = MulDiv.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertMulDivToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RzutykosciaPackage getRzutykosciaPackage() {
		return (RzutykosciaPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static RzutykosciaPackage getPackage() {
		return RzutykosciaPackage.eINSTANCE;
	}

} //RzutykosciaFactoryImpl
