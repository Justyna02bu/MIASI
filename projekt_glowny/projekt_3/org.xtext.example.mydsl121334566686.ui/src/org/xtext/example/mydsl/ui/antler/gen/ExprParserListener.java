package org.xtext.example.mydsl.ui.antler.gen;

import org.antlr.v4.runtime.tree.ParseTreeListener;
import org.xtext.example.mydsl.ui.antler.src.ExprParser;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link ExprParser}.
 */
public interface ExprParserListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link ExprParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(ExprParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(ExprParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExprParser#stat}.
	 * @param ctx the parse tree
	 */
	void enterStat(ExprParser.StatContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprParser#stat}.
	 * @param ctx the parse tree
	 */
	void exitStat(ExprParser.StatContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExprParser#diceExprSum}.
	 * @param ctx the parse tree
	 */
	void enterDiceExprSum(ExprParser.DiceExprSumContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprParser#diceExprSum}.
	 * @param ctx the parse tree
	 */
	void exitDiceExprSum(ExprParser.DiceExprSumContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExprParser#diceExprSuk}.
	 * @param ctx the parse tree
	 */
	void enterDiceExprSuk(ExprParser.DiceExprSukContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprParser#diceExprSuk}.
	 * @param ctx the parse tree
	 */
	void exitDiceExprSuk(ExprParser.DiceExprSukContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExprParser#mul}.
	 * @param ctx the parse tree
	 */
	void enterMul(ExprParser.MulContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprParser#mul}.
	 * @param ctx the parse tree
	 */
	void exitMul(ExprParser.MulContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExprParser#form}.
	 * @param ctx the parse tree
	 */
	void enterForm(ExprParser.FormContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprParser#form}.
	 * @param ctx the parse tree
	 */
	void exitForm(ExprParser.FormContext ctx);
	/**
	 * Enter a parse tree produced by the {@code SingleDice}
	 * labeled alternative in {@link ExprParser#dice}.
	 * @param ctx the parse tree
	 */
	void enterSingleDice(ExprParser.SingleDiceContext ctx);
	/**
	 * Exit a parse tree produced by the {@code SingleDice}
	 * labeled alternative in {@link ExprParser#dice}.
	 * @param ctx the parse tree
	 */
	void exitSingleDice(ExprParser.SingleDiceContext ctx);
	/**
	 * Enter a parse tree produced by the {@code MultiDice}
	 * labeled alternative in {@link ExprParser#dice}.
	 * @param ctx the parse tree
	 */
	void enterMultiDice(ExprParser.MultiDiceContext ctx);
	/**
	 * Exit a parse tree produced by the {@code MultiDice}
	 * labeled alternative in {@link ExprParser#dice}.
	 * @param ctx the parse tree
	 */
	void exitMultiDice(ExprParser.MultiDiceContext ctx);
	/**
	 * Enter a parse tree produced by the {@code SuccessRule}
	 * labeled alternative in {@link ExprParser#rulesukces}.
	 * @param ctx the parse tree
	 */
	void enterSuccessRule(ExprParser.SuccessRuleContext ctx);
	/**
	 * Exit a parse tree produced by the {@code SuccessRule}
	 * labeled alternative in {@link ExprParser#rulesukces}.
	 * @param ctx the parse tree
	 */
	void exitSuccessRule(ExprParser.SuccessRuleContext ctx);
	/**
	 * Enter a parse tree produced by the {@code SuccessThreshold}
	 * labeled alternative in {@link ExprParser#rulesukces}.
	 * @param ctx the parse tree
	 */
	void enterSuccessThreshold(ExprParser.SuccessThresholdContext ctx);
	/**
	 * Exit a parse tree produced by the {@code SuccessThreshold}
	 * labeled alternative in {@link ExprParser#rulesukces}.
	 * @param ctx the parse tree
	 */
	void exitSuccessThreshold(ExprParser.SuccessThresholdContext ctx);
	/**
	 * Enter a parse tree produced by the {@code SuccessMultiplier}
	 * labeled alternative in {@link ExprParser#rulesukces}.
	 * @param ctx the parse tree
	 */
	void enterSuccessMultiplier(ExprParser.SuccessMultiplierContext ctx);
	/**
	 * Exit a parse tree produced by the {@code SuccessMultiplier}
	 * labeled alternative in {@link ExprParser#rulesukces}.
	 * @param ctx the parse tree
	 */
	void exitSuccessMultiplier(ExprParser.SuccessMultiplierContext ctx);
	/**
	 * Enter a parse tree produced by the {@code DiceMarkSuk}
	 * labeled alternative in {@link ExprParser#rulesukces}.
	 * @param ctx the parse tree
	 */
	void enterDiceMarkSuk(ExprParser.DiceMarkSukContext ctx);
	/**
	 * Exit a parse tree produced by the {@code DiceMarkSuk}
	 * labeled alternative in {@link ExprParser#rulesukces}.
	 * @param ctx the parse tree
	 */
	void exitDiceMarkSuk(ExprParser.DiceMarkSukContext ctx);
	/**
	 * Enter a parse tree produced by the {@code DiceDiscSuk}
	 * labeled alternative in {@link ExprParser#rulesukces}.
	 * @param ctx the parse tree
	 */
	void enterDiceDiscSuk(ExprParser.DiceDiscSukContext ctx);
	/**
	 * Exit a parse tree produced by the {@code DiceDiscSuk}
	 * labeled alternative in {@link ExprParser#rulesukces}.
	 * @param ctx the parse tree
	 */
	void exitDiceDiscSuk(ExprParser.DiceDiscSukContext ctx);
	/**
	 * Enter a parse tree produced by the {@code DiceRerollSuk}
	 * labeled alternative in {@link ExprParser#rulesukces}.
	 * @param ctx the parse tree
	 */
	void enterDiceRerollSuk(ExprParser.DiceRerollSukContext ctx);
	/**
	 * Exit a parse tree produced by the {@code DiceRerollSuk}
	 * labeled alternative in {@link ExprParser#rulesukces}.
	 * @param ctx the parse tree
	 */
	void exitDiceRerollSuk(ExprParser.DiceRerollSukContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExplosionRule}
	 * labeled alternative in {@link ExprParser#rulesums}.
	 * @param ctx the parse tree
	 */
	void enterExplosionRule(ExprParser.ExplosionRuleContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExplosionRule}
	 * labeled alternative in {@link ExprParser#rulesums}.
	 * @param ctx the parse tree
	 */
	void exitExplosionRule(ExprParser.ExplosionRuleContext ctx);
	/**
	 * Enter a parse tree produced by the {@code DiceMarkSum}
	 * labeled alternative in {@link ExprParser#rulesums}.
	 * @param ctx the parse tree
	 */
	void enterDiceMarkSum(ExprParser.DiceMarkSumContext ctx);
	/**
	 * Exit a parse tree produced by the {@code DiceMarkSum}
	 * labeled alternative in {@link ExprParser#rulesums}.
	 * @param ctx the parse tree
	 */
	void exitDiceMarkSum(ExprParser.DiceMarkSumContext ctx);
	/**
	 * Enter a parse tree produced by the {@code DiceDiscSum}
	 * labeled alternative in {@link ExprParser#rulesums}.
	 * @param ctx the parse tree
	 */
	void enterDiceDiscSum(ExprParser.DiceDiscSumContext ctx);
	/**
	 * Exit a parse tree produced by the {@code DiceDiscSum}
	 * labeled alternative in {@link ExprParser#rulesums}.
	 * @param ctx the parse tree
	 */
	void exitDiceDiscSum(ExprParser.DiceDiscSumContext ctx);
	/**
	 * Enter a parse tree produced by the {@code DiceRerollSum}
	 * labeled alternative in {@link ExprParser#rulesums}.
	 * @param ctx the parse tree
	 */
	void enterDiceRerollSum(ExprParser.DiceRerollSumContext ctx);
	/**
	 * Exit a parse tree produced by the {@code DiceRerollSum}
	 * labeled alternative in {@link ExprParser#rulesums}.
	 * @param ctx the parse tree
	 */
	void exitDiceRerollSum(ExprParser.DiceRerollSumContext ctx);
	/**
	 * Enter a parse tree produced by the {@code MarkThan}
	 * labeled alternative in {@link ExprParser#mark}.
	 * @param ctx the parse tree
	 */
	void enterMarkThan(ExprParser.MarkThanContext ctx);
	/**
	 * Exit a parse tree produced by the {@code MarkThan}
	 * labeled alternative in {@link ExprParser#mark}.
	 * @param ctx the parse tree
	 */
	void exitMarkThan(ExprParser.MarkThanContext ctx);
	/**
	 * Enter a parse tree produced by the {@code MarkHigh}
	 * labeled alternative in {@link ExprParser#mark}.
	 * @param ctx the parse tree
	 */
	void enterMarkHigh(ExprParser.MarkHighContext ctx);
	/**
	 * Exit a parse tree produced by the {@code MarkHigh}
	 * labeled alternative in {@link ExprParser#mark}.
	 * @param ctx the parse tree
	 */
	void exitMarkHigh(ExprParser.MarkHighContext ctx);
	/**
	 * Enter a parse tree produced by the {@code MarkKol}
	 * labeled alternative in {@link ExprParser#mark}.
	 * @param ctx the parse tree
	 */
	void enterMarkKol(ExprParser.MarkKolContext ctx);
	/**
	 * Exit a parse tree produced by the {@code MarkKol}
	 * labeled alternative in {@link ExprParser#mark}.
	 * @param ctx the parse tree
	 */
	void exitMarkKol(ExprParser.MarkKolContext ctx);
	/**
	 * Enter a parse tree produced by the {@code MarkNum}
	 * labeled alternative in {@link ExprParser#mark}.
	 * @param ctx the parse tree
	 */
	void enterMarkNum(ExprParser.MarkNumContext ctx);
	/**
	 * Exit a parse tree produced by the {@code MarkNum}
	 * labeled alternative in {@link ExprParser#mark}.
	 * @param ctx the parse tree
	 */
	void exitMarkNum(ExprParser.MarkNumContext ctx);
	/**
	 * Enter a parse tree produced by the {@code DiscardThan}
	 * labeled alternative in {@link ExprParser#discard}.
	 * @param ctx the parse tree
	 */
	void enterDiscardThan(ExprParser.DiscardThanContext ctx);
	/**
	 * Exit a parse tree produced by the {@code DiscardThan}
	 * labeled alternative in {@link ExprParser#discard}.
	 * @param ctx the parse tree
	 */
	void exitDiscardThan(ExprParser.DiscardThanContext ctx);
	/**
	 * Enter a parse tree produced by the {@code DiscardHigh}
	 * labeled alternative in {@link ExprParser#discard}.
	 * @param ctx the parse tree
	 */
	void enterDiscardHigh(ExprParser.DiscardHighContext ctx);
	/**
	 * Exit a parse tree produced by the {@code DiscardHigh}
	 * labeled alternative in {@link ExprParser#discard}.
	 * @param ctx the parse tree
	 */
	void exitDiscardHigh(ExprParser.DiscardHighContext ctx);
	/**
	 * Enter a parse tree produced by the {@code DiscardKol}
	 * labeled alternative in {@link ExprParser#discard}.
	 * @param ctx the parse tree
	 */
	void enterDiscardKol(ExprParser.DiscardKolContext ctx);
	/**
	 * Exit a parse tree produced by the {@code DiscardKol}
	 * labeled alternative in {@link ExprParser#discard}.
	 * @param ctx the parse tree
	 */
	void exitDiscardKol(ExprParser.DiscardKolContext ctx);
	/**
	 * Enter a parse tree produced by the {@code DiscardNum}
	 * labeled alternative in {@link ExprParser#discard}.
	 * @param ctx the parse tree
	 */
	void enterDiscardNum(ExprParser.DiscardNumContext ctx);
	/**
	 * Exit a parse tree produced by the {@code DiscardNum}
	 * labeled alternative in {@link ExprParser#discard}.
	 * @param ctx the parse tree
	 */
	void exitDiscardNum(ExprParser.DiscardNumContext ctx);
	/**
	 * Enter a parse tree produced by the {@code RerollThen}
	 * labeled alternative in {@link ExprParser#reroll}.
	 * @param ctx the parse tree
	 */
	void enterRerollThen(ExprParser.RerollThenContext ctx);
	/**
	 * Exit a parse tree produced by the {@code RerollThen}
	 * labeled alternative in {@link ExprParser#reroll}.
	 * @param ctx the parse tree
	 */
	void exitRerollThen(ExprParser.RerollThenContext ctx);
	/**
	 * Enter a parse tree produced by the {@code RerollHight}
	 * labeled alternative in {@link ExprParser#reroll}.
	 * @param ctx the parse tree
	 */
	void enterRerollHight(ExprParser.RerollHightContext ctx);
	/**
	 * Exit a parse tree produced by the {@code RerollHight}
	 * labeled alternative in {@link ExprParser#reroll}.
	 * @param ctx the parse tree
	 */
	void exitRerollHight(ExprParser.RerollHightContext ctx);
	/**
	 * Enter a parse tree produced by the {@code RerollKol}
	 * labeled alternative in {@link ExprParser#reroll}.
	 * @param ctx the parse tree
	 */
	void enterRerollKol(ExprParser.RerollKolContext ctx);
	/**
	 * Exit a parse tree produced by the {@code RerollKol}
	 * labeled alternative in {@link ExprParser#reroll}.
	 * @param ctx the parse tree
	 */
	void exitRerollKol(ExprParser.RerollKolContext ctx);
	/**
	 * Enter a parse tree produced by the {@code RerollNum}
	 * labeled alternative in {@link ExprParser#reroll}.
	 * @param ctx the parse tree
	 */
	void enterRerollNum(ExprParser.RerollNumContext ctx);
	/**
	 * Exit a parse tree produced by the {@code RerollNum}
	 * labeled alternative in {@link ExprParser#reroll}.
	 * @param ctx the parse tree
	 */
	void exitRerollNum(ExprParser.RerollNumContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Number}
	 * labeled alternative in {@link ExprParser#num}.
	 * @param ctx the parse tree
	 */
	void enterNumber(ExprParser.NumberContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Number}
	 * labeled alternative in {@link ExprParser#num}.
	 * @param ctx the parse tree
	 */
	void exitNumber(ExprParser.NumberContext ctx);
}