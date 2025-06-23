/**
 */
package Rzutykoscia.impl;

import Rzutykoscia.Dice;
import Rzutykoscia.DiceDiscSuk;
import Rzutykoscia.DiceDiscSum;
import Rzutykoscia.DiceExpr;
import Rzutykoscia.DiceExprSuk;
import Rzutykoscia.DiceExprSum;
import Rzutykoscia.DiceMarkSuk;
import Rzutykoscia.DiceMarkSum;
import Rzutykoscia.DiceRerollSuk;
import Rzutykoscia.DiceRerollSum;
import Rzutykoscia.Discard;
import Rzutykoscia.DiscardHigh;
import Rzutykoscia.DiscardKol;
import Rzutykoscia.DiscardNum;
import Rzutykoscia.DiscardThan;
import Rzutykoscia.ExplosionRule;
import Rzutykoscia.FirstLast;
import Rzutykoscia.FormExpr;
import Rzutykoscia.HighLow;
import Rzutykoscia.Language;
import Rzutykoscia.Mark;
import Rzutykoscia.MarkHigh;
import Rzutykoscia.MarkKol;
import Rzutykoscia.MarkNum;
import Rzutykoscia.MarkThan;
import Rzutykoscia.MulDiv;
import Rzutykoscia.MulExpr;
import Rzutykoscia.MultiDice;
import Rzutykoscia.Num;
import Rzutykoscia.Operator;
import Rzutykoscia.Reroll;
import Rzutykoscia.RerollHigh;
import Rzutykoscia.RerollKol;
import Rzutykoscia.RerollNum;
import Rzutykoscia.RerollThan;
import Rzutykoscia.RzutykosciaFactory;
import Rzutykoscia.RzutykosciaPackage;
import Rzutykoscia.Sign;
import Rzutykoscia.SingleDice;
import Rzutykoscia.Stat;
import Rzutykoscia.SuccessBasic;
import Rzutykoscia.SuccessCompositeRule;
import Rzutykoscia.SuccessMultiplier;
import Rzutykoscia.SuccessRule;
import Rzutykoscia.SuccessStatement;
import Rzutykoscia.SuccessThreshold;
import Rzutykoscia.SumRule;
import Rzutykoscia.SumStatement;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class RzutykosciaPackageImpl extends EPackageImpl implements RzutykosciaPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass languageEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass statEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sumStatementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass successStatementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass diceExprEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass diceExprSumEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass diceExprSukEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass mulExprEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass formExprEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass diceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass singleDiceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass multiDiceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass numEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sumRuleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass successRuleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass explosionRuleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass diceMarkSumEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass diceDiscSumEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass diceRerollSumEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass successBasicEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass successThresholdEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass successMultiplierEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass diceMarkSukEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass diceDiscSukEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass diceRerollSukEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass markEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass discardEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass rerollEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass markThanEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass markHighEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass markKolEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass markNumEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass rerollHighEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass rerollThanEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass rerollKolEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass rerollNumEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass discardKolEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass discardNumEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass discardHighEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass discardThanEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass successCompositeRuleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum operatorEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum signEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum highLowEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum firstLastEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum mulDivEEnum = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see Rzutykoscia.RzutykosciaPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private RzutykosciaPackageImpl() {
		super(eNS_URI, RzutykosciaFactory.eINSTANCE);
	}
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 *
	 * <p>This method is used to initialize {@link RzutykosciaPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static RzutykosciaPackage init() {
		if (isInited) return (RzutykosciaPackage)EPackage.Registry.INSTANCE.getEPackage(RzutykosciaPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredRzutykosciaPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		RzutykosciaPackageImpl theRzutykosciaPackage = registeredRzutykosciaPackage instanceof RzutykosciaPackageImpl ? (RzutykosciaPackageImpl)registeredRzutykosciaPackage : new RzutykosciaPackageImpl();

		isInited = true;

		// Create package meta-data objects
		theRzutykosciaPackage.createPackageContents();

		// Initialize created meta-data
		theRzutykosciaPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theRzutykosciaPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(RzutykosciaPackage.eNS_URI, theRzutykosciaPackage);
		return theRzutykosciaPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getLanguage() {
		return languageEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getLanguage_Statement() {
		return (EReference)languageEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getStat() {
		return statEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSumStatement() {
		return sumStatementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSumStatement_Diceexprsum() {
		return (EReference)sumStatementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSuccessStatement() {
		return successStatementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSuccessStatement_Diceexprsuk() {
		return (EReference)successStatementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDiceExpr() {
		return diceExprEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDiceExpr_Mulexpr() {
		return (EReference)diceExprEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDiceExpr_Sign() {
		return (EAttribute)diceExprEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDiceExprSum() {
		return diceExprSumEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDiceExprSum_Sumrule() {
		return (EReference)diceExprSumEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDiceExprSuk() {
		return diceExprSukEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDiceExprSuk_Successrule() {
		return (EReference)diceExprSukEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getMulExpr() {
		return mulExprEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getMulExpr_Num() {
		return (EReference)mulExprEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getMulExpr_Formexpr() {
		return (EReference)mulExprEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getFormExpr() {
		return formExprEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getFormExpr_Left() {
		return (EReference)formExprEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getFormExpr_Right() {
		return (EReference)formExprEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getFormExpr_Operator() {
		return (EAttribute)formExprEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDice() {
		return diceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDice_Sides() {
		return (EReference)diceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSingleDice() {
		return singleDiceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getMultiDice() {
		return multiDiceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getMultiDice_Count() {
		return (EReference)multiDiceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getNum() {
		return numEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getNum_Value() {
		return (EAttribute)numEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSumRule() {
		return sumRuleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSuccessRule() {
		return successRuleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getExplosionRule() {
		return explosionRuleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getExplosionRule_Num() {
		return (EReference)explosionRuleEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getExplosionRule_Sign() {
		return (EAttribute)explosionRuleEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDiceMarkSum() {
		return diceMarkSumEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDiceMarkSum_Mark() {
		return (EReference)diceMarkSumEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDiceDiscSum() {
		return diceDiscSumEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDiceDiscSum_Discard() {
		return (EReference)diceDiscSumEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDiceRerollSum() {
		return diceRerollSumEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDiceRerollSum_Reroll() {
		return (EReference)diceRerollSumEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSuccessBasic() {
		return successBasicEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSuccessBasic_Num() {
		return (EReference)successBasicEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSuccessBasic_Negated() {
		return (EAttribute)successBasicEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSuccessThreshold() {
		return successThresholdEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSuccessThreshold_Hightlow() {
		return (EAttribute)successThresholdEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSuccessThreshold_Num() {
		return (EReference)successThresholdEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSuccessMultiplier() {
		return successMultiplierEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSuccessMultiplier_Sign() {
		return (EAttribute)successMultiplierEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSuccessMultiplier_Mult() {
		return (EReference)successMultiplierEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSuccessMultiplier_Num() {
		return (EReference)successMultiplierEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDiceMarkSuk() {
		return diceMarkSukEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDiceMarkSuk_Mark() {
		return (EReference)diceMarkSukEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDiceDiscSuk() {
		return diceDiscSukEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDiceDiscSuk_Discard() {
		return (EReference)diceDiscSukEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDiceRerollSuk() {
		return diceRerollSukEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDiceRerollSuk_Reroll() {
		return (EReference)diceRerollSukEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getMark() {
		return markEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDiscard() {
		return discardEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getReroll() {
		return rerollEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getMarkThan() {
		return markThanEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMarkThan_Hightlow() {
		return (EAttribute)markThanEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getMarkThan_Num() {
		return (EReference)markThanEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getMarkHigh() {
		return markHighEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMarkHigh_Hightlow() {
		return (EAttribute)markHighEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getMarkKol() {
		return markKolEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getMarkKol_Num() {
		return (EReference)markKolEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMarkKol_Firstlast() {
		return (EAttribute)markKolEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getMarkNum() {
		return markNumEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getMarkNum_Num() {
		return (EReference)markNumEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getRerollHigh() {
		return rerollHighEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRerollHigh_Hightlow() {
		return (EAttribute)rerollHighEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getRerollThan() {
		return rerollThanEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRerollThan_Hightlow() {
		return (EAttribute)rerollThanEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getRerollThan_Num() {
		return (EReference)rerollThanEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getRerollKol() {
		return rerollKolEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getRerollKol_Num() {
		return (EReference)rerollKolEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRerollKol_Firstlast() {
		return (EAttribute)rerollKolEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getRerollNum() {
		return rerollNumEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getRerollNum_Num() {
		return (EReference)rerollNumEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDiscardKol() {
		return discardKolEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDiscardKol_Num() {
		return (EReference)discardKolEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDiscardKol_Firstlast() {
		return (EAttribute)discardKolEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDiscardNum() {
		return discardNumEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDiscardNum_Num() {
		return (EReference)discardNumEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDiscardHigh() {
		return discardHighEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDiscardHigh_Hightlow() {
		return (EAttribute)discardHighEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDiscardThan() {
		return discardThanEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDiscardThan_Hightlow() {
		return (EAttribute)discardThanEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDiscardThan_Num() {
		return (EReference)discardThanEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSuccessCompositeRule() {
		return successCompositeRuleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSuccessCompositeRule_Successrule() {
		return (EReference)successCompositeRuleEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getOperator() {
		return operatorEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getSign() {
		return signEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getHighLow() {
		return highLowEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getFirstLast() {
		return firstLastEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getMulDiv() {
		return mulDivEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RzutykosciaFactory getRzutykosciaFactory() {
		return (RzutykosciaFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		languageEClass = createEClass(LANGUAGE);
		createEReference(languageEClass, LANGUAGE__STATEMENT);

		statEClass = createEClass(STAT);

		sumStatementEClass = createEClass(SUM_STATEMENT);
		createEReference(sumStatementEClass, SUM_STATEMENT__DICEEXPRSUM);

		successStatementEClass = createEClass(SUCCESS_STATEMENT);
		createEReference(successStatementEClass, SUCCESS_STATEMENT__DICEEXPRSUK);

		diceExprEClass = createEClass(DICE_EXPR);
		createEReference(diceExprEClass, DICE_EXPR__MULEXPR);
		createEAttribute(diceExprEClass, DICE_EXPR__SIGN);

		diceExprSumEClass = createEClass(DICE_EXPR_SUM);
		createEReference(diceExprSumEClass, DICE_EXPR_SUM__SUMRULE);

		diceExprSukEClass = createEClass(DICE_EXPR_SUK);
		createEReference(diceExprSukEClass, DICE_EXPR_SUK__SUCCESSRULE);

		mulExprEClass = createEClass(MUL_EXPR);
		createEReference(mulExprEClass, MUL_EXPR__NUM);
		createEReference(mulExprEClass, MUL_EXPR__FORMEXPR);

		formExprEClass = createEClass(FORM_EXPR);
		createEReference(formExprEClass, FORM_EXPR__LEFT);
		createEReference(formExprEClass, FORM_EXPR__RIGHT);
		createEAttribute(formExprEClass, FORM_EXPR__OPERATOR);

		diceEClass = createEClass(DICE);
		createEReference(diceEClass, DICE__SIDES);

		singleDiceEClass = createEClass(SINGLE_DICE);

		multiDiceEClass = createEClass(MULTI_DICE);
		createEReference(multiDiceEClass, MULTI_DICE__COUNT);

		numEClass = createEClass(NUM);
		createEAttribute(numEClass, NUM__VALUE);

		sumRuleEClass = createEClass(SUM_RULE);

		successRuleEClass = createEClass(SUCCESS_RULE);

		explosionRuleEClass = createEClass(EXPLOSION_RULE);
		createEReference(explosionRuleEClass, EXPLOSION_RULE__NUM);
		createEAttribute(explosionRuleEClass, EXPLOSION_RULE__SIGN);

		diceMarkSumEClass = createEClass(DICE_MARK_SUM);
		createEReference(diceMarkSumEClass, DICE_MARK_SUM__MARK);

		diceDiscSumEClass = createEClass(DICE_DISC_SUM);
		createEReference(diceDiscSumEClass, DICE_DISC_SUM__DISCARD);

		diceRerollSumEClass = createEClass(DICE_REROLL_SUM);
		createEReference(diceRerollSumEClass, DICE_REROLL_SUM__REROLL);

		successBasicEClass = createEClass(SUCCESS_BASIC);
		createEReference(successBasicEClass, SUCCESS_BASIC__NUM);
		createEAttribute(successBasicEClass, SUCCESS_BASIC__NEGATED);

		successThresholdEClass = createEClass(SUCCESS_THRESHOLD);
		createEAttribute(successThresholdEClass, SUCCESS_THRESHOLD__HIGHTLOW);
		createEReference(successThresholdEClass, SUCCESS_THRESHOLD__NUM);

		successMultiplierEClass = createEClass(SUCCESS_MULTIPLIER);
		createEAttribute(successMultiplierEClass, SUCCESS_MULTIPLIER__SIGN);
		createEReference(successMultiplierEClass, SUCCESS_MULTIPLIER__MULT);
		createEReference(successMultiplierEClass, SUCCESS_MULTIPLIER__NUM);

		diceMarkSukEClass = createEClass(DICE_MARK_SUK);
		createEReference(diceMarkSukEClass, DICE_MARK_SUK__MARK);

		diceDiscSukEClass = createEClass(DICE_DISC_SUK);
		createEReference(diceDiscSukEClass, DICE_DISC_SUK__DISCARD);

		diceRerollSukEClass = createEClass(DICE_REROLL_SUK);
		createEReference(diceRerollSukEClass, DICE_REROLL_SUK__REROLL);

		markEClass = createEClass(MARK);

		discardEClass = createEClass(DISCARD);

		rerollEClass = createEClass(REROLL);

		markThanEClass = createEClass(MARK_THAN);
		createEAttribute(markThanEClass, MARK_THAN__HIGHTLOW);
		createEReference(markThanEClass, MARK_THAN__NUM);

		markHighEClass = createEClass(MARK_HIGH);
		createEAttribute(markHighEClass, MARK_HIGH__HIGHTLOW);

		markKolEClass = createEClass(MARK_KOL);
		createEReference(markKolEClass, MARK_KOL__NUM);
		createEAttribute(markKolEClass, MARK_KOL__FIRSTLAST);

		markNumEClass = createEClass(MARK_NUM);
		createEReference(markNumEClass, MARK_NUM__NUM);

		rerollHighEClass = createEClass(REROLL_HIGH);
		createEAttribute(rerollHighEClass, REROLL_HIGH__HIGHTLOW);

		rerollThanEClass = createEClass(REROLL_THAN);
		createEAttribute(rerollThanEClass, REROLL_THAN__HIGHTLOW);
		createEReference(rerollThanEClass, REROLL_THAN__NUM);

		rerollKolEClass = createEClass(REROLL_KOL);
		createEReference(rerollKolEClass, REROLL_KOL__NUM);
		createEAttribute(rerollKolEClass, REROLL_KOL__FIRSTLAST);

		rerollNumEClass = createEClass(REROLL_NUM);
		createEReference(rerollNumEClass, REROLL_NUM__NUM);

		discardKolEClass = createEClass(DISCARD_KOL);
		createEReference(discardKolEClass, DISCARD_KOL__NUM);
		createEAttribute(discardKolEClass, DISCARD_KOL__FIRSTLAST);

		discardNumEClass = createEClass(DISCARD_NUM);
		createEReference(discardNumEClass, DISCARD_NUM__NUM);

		discardHighEClass = createEClass(DISCARD_HIGH);
		createEAttribute(discardHighEClass, DISCARD_HIGH__HIGHTLOW);

		discardThanEClass = createEClass(DISCARD_THAN);
		createEAttribute(discardThanEClass, DISCARD_THAN__HIGHTLOW);
		createEReference(discardThanEClass, DISCARD_THAN__NUM);

		successCompositeRuleEClass = createEClass(SUCCESS_COMPOSITE_RULE);
		createEReference(successCompositeRuleEClass, SUCCESS_COMPOSITE_RULE__SUCCESSRULE);

		// Create enums
		operatorEEnum = createEEnum(OPERATOR);
		signEEnum = createEEnum(SIGN);
		highLowEEnum = createEEnum(HIGH_LOW);
		firstLastEEnum = createEEnum(FIRST_LAST);
		mulDivEEnum = createEEnum(MUL_DIV);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		sumStatementEClass.getESuperTypes().add(this.getStat());
		successStatementEClass.getESuperTypes().add(this.getStat());
		diceExprSumEClass.getESuperTypes().add(this.getDiceExpr());
		diceExprSukEClass.getESuperTypes().add(this.getDiceExpr());
		singleDiceEClass.getESuperTypes().add(this.getDice());
		multiDiceEClass.getESuperTypes().add(this.getDice());
		explosionRuleEClass.getESuperTypes().add(this.getSumRule());
		diceMarkSumEClass.getESuperTypes().add(this.getSumRule());
		diceDiscSumEClass.getESuperTypes().add(this.getSumRule());
		diceRerollSumEClass.getESuperTypes().add(this.getSumRule());
		successBasicEClass.getESuperTypes().add(this.getSuccessRule());
		successThresholdEClass.getESuperTypes().add(this.getSuccessRule());
		successMultiplierEClass.getESuperTypes().add(this.getSuccessRule());
		diceMarkSukEClass.getESuperTypes().add(this.getSuccessRule());
		diceDiscSukEClass.getESuperTypes().add(this.getSuccessRule());
		diceRerollSukEClass.getESuperTypes().add(this.getSuccessRule());
		markThanEClass.getESuperTypes().add(this.getMark());
		markHighEClass.getESuperTypes().add(this.getMark());
		markKolEClass.getESuperTypes().add(this.getMark());
		markNumEClass.getESuperTypes().add(this.getMark());
		rerollHighEClass.getESuperTypes().add(this.getReroll());
		rerollThanEClass.getESuperTypes().add(this.getReroll());
		rerollKolEClass.getESuperTypes().add(this.getReroll());
		rerollNumEClass.getESuperTypes().add(this.getReroll());
		discardKolEClass.getESuperTypes().add(this.getDiscard());
		discardNumEClass.getESuperTypes().add(this.getDiscard());
		discardHighEClass.getESuperTypes().add(this.getDiscard());
		discardThanEClass.getESuperTypes().add(this.getDiscard());
		successCompositeRuleEClass.getESuperTypes().add(this.getSuccessRule());

		// Initialize classes, features, and operations; add parameters
		initEClass(languageEClass, Language.class, "Language", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getLanguage_Statement(), this.getStat(), null, "statement", null, 1, 1, Language.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(statEClass, Stat.class, "Stat", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(sumStatementEClass, SumStatement.class, "SumStatement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSumStatement_Diceexprsum(), this.getDiceExprSum(), null, "diceexprsum", null, 1, -1, SumStatement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(successStatementEClass, SuccessStatement.class, "SuccessStatement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSuccessStatement_Diceexprsuk(), this.getDiceExprSuk(), null, "diceexprsuk", null, 1, -1, SuccessStatement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(diceExprEClass, DiceExpr.class, "DiceExpr", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDiceExpr_Mulexpr(), this.getMulExpr(), null, "mulexpr", null, 1, 1, DiceExpr.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDiceExpr_Sign(), this.getSign(), "sign", null, 0, 1, DiceExpr.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(diceExprSumEClass, DiceExprSum.class, "DiceExprSum", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDiceExprSum_Sumrule(), this.getSumRule(), null, "sumrule", null, 0, -1, DiceExprSum.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(diceExprSukEClass, DiceExprSuk.class, "DiceExprSuk", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDiceExprSuk_Successrule(), this.getSuccessRule(), null, "successrule", null, 0, -1, DiceExprSuk.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(mulExprEClass, MulExpr.class, "MulExpr", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMulExpr_Num(), this.getNum(), null, "num", null, 0, 1, MulExpr.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMulExpr_Formexpr(), this.getFormExpr(), null, "formexpr", null, 1, 1, MulExpr.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(formExprEClass, FormExpr.class, "FormExpr", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getFormExpr_Left(), this.getDice(), null, "left", null, 1, 1, FormExpr.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFormExpr_Right(), this.getNum(), null, "right", null, 0, 1, FormExpr.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFormExpr_Operator(), this.getOperator(), "operator", null, 0, 1, FormExpr.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(diceEClass, Dice.class, "Dice", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDice_Sides(), this.getNum(), null, "sides", null, 1, 1, Dice.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(singleDiceEClass, SingleDice.class, "SingleDice", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(multiDiceEClass, MultiDice.class, "MultiDice", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMultiDice_Count(), this.getNum(), null, "count", null, 1, 1, MultiDice.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(numEClass, Num.class, "Num", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getNum_Value(), ecorePackage.getEInt(), "value", null, 1, 1, Num.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(sumRuleEClass, SumRule.class, "SumRule", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(successRuleEClass, SuccessRule.class, "SuccessRule", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(explosionRuleEClass, ExplosionRule.class, "ExplosionRule", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getExplosionRule_Num(), this.getNum(), null, "num", null, 1, 1, ExplosionRule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getExplosionRule_Sign(), this.getSign(), "sign", null, 1, 1, ExplosionRule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(diceMarkSumEClass, DiceMarkSum.class, "DiceMarkSum", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDiceMarkSum_Mark(), this.getMark(), null, "mark", null, 1, 1, DiceMarkSum.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(diceDiscSumEClass, DiceDiscSum.class, "DiceDiscSum", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDiceDiscSum_Discard(), this.getDiscard(), null, "discard", null, 1, 1, DiceDiscSum.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(diceRerollSumEClass, DiceRerollSum.class, "DiceRerollSum", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDiceRerollSum_Reroll(), this.getReroll(), null, "reroll", null, 1, 1, DiceRerollSum.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(successBasicEClass, SuccessBasic.class, "SuccessBasic", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSuccessBasic_Num(), this.getNum(), null, "num", null, 1, 1, SuccessBasic.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSuccessBasic_Negated(), ecorePackage.getEBoolean(), "negated", "false", 1, 1, SuccessBasic.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(successThresholdEClass, SuccessThreshold.class, "SuccessThreshold", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSuccessThreshold_Hightlow(), this.getHighLow(), "hightlow", null, 1, 1, SuccessThreshold.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSuccessThreshold_Num(), this.getNum(), null, "num", null, 1, 1, SuccessThreshold.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(successMultiplierEClass, SuccessMultiplier.class, "SuccessMultiplier", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSuccessMultiplier_Sign(), this.getSign(), "sign", null, 1, 1, SuccessMultiplier.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSuccessMultiplier_Mult(), this.getNum(), null, "mult", null, 1, 1, SuccessMultiplier.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSuccessMultiplier_Num(), this.getNum(), null, "num", null, 1, 1, SuccessMultiplier.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(diceMarkSukEClass, DiceMarkSuk.class, "DiceMarkSuk", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDiceMarkSuk_Mark(), this.getMark(), null, "mark", null, 1, 1, DiceMarkSuk.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(diceDiscSukEClass, DiceDiscSuk.class, "DiceDiscSuk", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDiceDiscSuk_Discard(), this.getDiscard(), null, "discard", null, 1, 1, DiceDiscSuk.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(diceRerollSukEClass, DiceRerollSuk.class, "DiceRerollSuk", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDiceRerollSuk_Reroll(), this.getReroll(), null, "reroll", null, 1, 1, DiceRerollSuk.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(markEClass, Mark.class, "Mark", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(discardEClass, Discard.class, "Discard", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(rerollEClass, Reroll.class, "Reroll", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(markThanEClass, MarkThan.class, "MarkThan", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMarkThan_Hightlow(), this.getHighLow(), "hightlow", null, 1, 1, MarkThan.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMarkThan_Num(), this.getNum(), null, "num", null, 1, 1, MarkThan.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(markHighEClass, MarkHigh.class, "MarkHigh", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMarkHigh_Hightlow(), this.getHighLow(), "hightlow", null, 1, 1, MarkHigh.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(markKolEClass, MarkKol.class, "MarkKol", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMarkKol_Num(), this.getNum(), null, "num", null, 1, 1, MarkKol.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMarkKol_Firstlast(), this.getFirstLast(), "firstlast", null, 1, 1, MarkKol.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(markNumEClass, MarkNum.class, "MarkNum", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMarkNum_Num(), this.getNum(), null, "num", null, 1, 1, MarkNum.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(rerollHighEClass, RerollHigh.class, "RerollHigh", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRerollHigh_Hightlow(), this.getHighLow(), "hightlow", null, 1, 1, RerollHigh.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(rerollThanEClass, RerollThan.class, "RerollThan", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRerollThan_Hightlow(), this.getHighLow(), "hightlow", null, 1, 1, RerollThan.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRerollThan_Num(), this.getNum(), null, "num", null, 1, 1, RerollThan.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(rerollKolEClass, RerollKol.class, "RerollKol", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRerollKol_Num(), this.getNum(), null, "num", null, 1, 1, RerollKol.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRerollKol_Firstlast(), this.getFirstLast(), "firstlast", null, 1, 1, RerollKol.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(rerollNumEClass, RerollNum.class, "RerollNum", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRerollNum_Num(), this.getNum(), null, "num", null, 1, 1, RerollNum.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(discardKolEClass, DiscardKol.class, "DiscardKol", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDiscardKol_Num(), this.getNum(), null, "num", null, 1, 1, DiscardKol.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDiscardKol_Firstlast(), this.getFirstLast(), "firstlast", null, 1, 1, DiscardKol.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(discardNumEClass, DiscardNum.class, "DiscardNum", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDiscardNum_Num(), this.getNum(), null, "num", null, 1, 1, DiscardNum.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(discardHighEClass, DiscardHigh.class, "DiscardHigh", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDiscardHigh_Hightlow(), this.getHighLow(), "hightlow", null, 1, 1, DiscardHigh.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(discardThanEClass, DiscardThan.class, "DiscardThan", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDiscardThan_Hightlow(), this.getHighLow(), "hightlow", null, 1, 1, DiscardThan.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDiscardThan_Num(), this.getNum(), null, "num", null, 1, 1, DiscardThan.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(successCompositeRuleEClass, SuccessCompositeRule.class, "SuccessCompositeRule", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSuccessCompositeRule_Successrule(), this.getSuccessRule(), null, "successrule", null, 1, 1, SuccessCompositeRule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(operatorEEnum, Operator.class, "Operator");
		addEEnumLiteral(operatorEEnum, Operator.ADD);
		addEEnumLiteral(operatorEEnum, Operator.SUB);
		addEEnumLiteral(operatorEEnum, Operator.MUL);
		addEEnumLiteral(operatorEEnum, Operator.DIV);

		initEEnum(signEEnum, Sign.class, "Sign");
		addEEnumLiteral(signEEnum, Sign.ADD);
		addEEnumLiteral(signEEnum, Sign.SUB);
		addEEnumLiteral(signEEnum, Sign.NONE);

		initEEnum(highLowEEnum, HighLow.class, "HighLow");
		addEEnumLiteral(highLowEEnum, HighLow.HIGH);
		addEEnumLiteral(highLowEEnum, HighLow.LOW);

		initEEnum(firstLastEEnum, FirstLast.class, "FirstLast");
		addEEnumLiteral(firstLastEEnum, FirstLast.FIRST);
		addEEnumLiteral(firstLastEEnum, FirstLast.LAST);

		initEEnum(mulDivEEnum, MulDiv.class, "MulDiv");
		addEEnumLiteral(mulDivEEnum, MulDiv.MUL);
		addEEnumLiteral(mulDivEEnum, MulDiv.DIV);

		// Create resource
		createResource(eNS_URI);
	}

} //RzutykosciaPackageImpl
