package org.xtext.example.mydsl.ui.antler.src;

import java.util.ArrayList;
import java.util.List;

import org.xtext.example.mydsl.ui.antler.gen.ExprParserBaseVisitor;

public class DiceVisitor extends ExprParserBaseVisitor<Void> {
    private final List<Dices> rolls = new ArrayList<>();
    private boolean sumowanie;

    public List<Dices> getRolls() {
        return rolls;
    }

    public boolean isSumowanie() {
        return sumowanie;
    }
    public String getFinalResult() {
        StringBuilder result = new StringBuilder("Końcowy wynik:\n");
        int total = 0;

        for (int i = 0; i < rolls.size(); i++) {
            Dices dice = rolls.get(i);
            List<Integer> values = dice.getRolls();

            result.append("Rzut ").append(i + 1).append(": ");

            for (int j = 0; j < values.size(); j++) {
                int value = values.get(j);
                boolean stra = false;
                StringBuilder valueStr = new StringBuilder();

                // Przerzut
                if (dice.wasRerolled(j)) {
                    int original = dice.getOriginalValue(j);
                    valueStr.append("(").append(original).append("→").append(value).append(")");
                    stra = true;
                }

                // Eksplozje
                if (dice.hasExplosionAt(j)) {
                    valueStr.append(value);
                    for (int expl : dice.getExplosionsAt(j)) {
                        valueStr.append("(+").append(expl).append(")");
                    }
                    stra = true;

                }

                // Usunięte eksplozje
                if (dice.hasRemovedExplosionAt(j)) {
                    valueStr.append(value);
                    for (int expl : dice.getRemovedExplosionsAt(j)) {
                        valueStr.append("(-").append(expl).append(")");
                    }
                    stra = true;

                }

                // Oznaczenie
                if (dice.isMarked(j)) {
                    valueStr.append("*").append(value).append("*");
                    stra = true;
                }

                // Odrzucenie
                if (dice.isDiscarded(j)) {
                    valueStr.append("-").append(value).append("-");
                    stra = true;
                }

                if (!stra) valueStr.append(value);

                // Sukces
                int success = dice.getSuccessAt(j);
                if (success != 0) {
                    valueStr.append("[").append(success).append("]");
                }

                result.append(valueStr).append(" ");
            }

            if (sumowanie) {
                int suma = dice.getSum();
                result.append("=> suma: ").append(suma);
                if (!dice.getModifierDescription().isEmpty()) {
                    result.append(" (modyfikator: ").append(dice.getModifierDescription()).append(")");
                }
                total += dice.isNegative() ? -suma : suma;
            } else {
                int successes = dice.getSuccesses();
                result.append("=> sukcesy: ").append(successes);
                if (!dice.getModifierDescription().isEmpty()) {
                    result.append(" (modyfikator: ").append(dice.getModifierDescription()).append(")");
                }
                total += dice.isNegative() ? -successes : successes;
            }

            result.append("\n");
        }

        if (rolls.size() > 1) {
            result.append(sumowanie ? "Łączna suma: " : "Łączna liczba sukcesów: ")
                    .append(total)
                    .append("\n");
        }

        return result.toString();
    }


    @Override
    public Void visitProgram(ExprParser.ProgramContext ctx) {
        String firstToken = ctx.getStart().getText();
        sumowanie = firstToken.equals("Sumuj");
        return visitChildren(ctx);
    }

    @Override
    public Void visitSingleDice(ExprParser.SingleDiceContext ctx) {
        int sides = Integer.parseInt(ctx.num().getText());
        rolls.add(new Dices(1, sides));
        return null;
    }

    @Override
    public Void visitMultiDice(ExprParser.MultiDiceContext ctx) {
        int count = Integer.parseInt(ctx.num(0).getText());
        int sides = Integer.parseInt(ctx.num(1).getText());
        rolls.add(new Dices(count, sides));
        return null;
    }
    @Override
    public Void visitSuccessRule(ExprParser.SuccessRuleContext ctx) {
        Dices dice = rolls.get(rolls.size() - 1);
        if (ctx.num() != null) {
            int value = Integer.parseInt(ctx.num().getText());
            for (int i = 0; i < dice.getRolls().size(); i++) {
                if (dice.getRolls().get(i) == value && !dice.isDiscarded(i)) {
                    dice.addSuccess(i, 1);
                }
            }
        }
        return null;
    }

    @Override
    public Void visitSuccessThreshold(ExprParser.SuccessThresholdContext ctx) {
        int threshold = Integer.parseInt(ctx.num().getText());
        Dices dice = rolls.get(rolls.size() - 1);
        for (int i = 0; i < dice.getRolls().size(); i++) {
            int roll = dice.getRolls().get(i);
            if (!dice.isDiscarded(i)) {
                if ((ctx.MORETHAN() != null && roll > threshold) ||
                        (ctx.LESSTHAN() != null && roll < threshold)) {
                    dice.addSuccess(i, 1);
                }
            }
        }
        return null;
    }

    @Override
    public Void visitSuccessMultiplier(ExprParser.SuccessMultiplierContext ctx) {
        int value = Integer.parseInt(ctx.num(0).getText());
        int multiplier = Integer.parseInt(ctx.num(1).getText());

        if (ctx.SUB() != null) {
            multiplier = -multiplier;
        }

        Dices dice = rolls.get(rolls.size() - 1);
        for (int i = 0; i < dice.getRolls().size(); i++) {
            if (dice.getRolls().get(i) == value && !dice.isDiscarded(i)) {
                dice.addSuccess(i, multiplier);
            }
        }

        return null;
    }


    @Override
    public Void visitExplosionRule(ExprParser.ExplosionRuleContext ctx) {
        int explodeOn = Integer.parseInt(ctx.num().getText());
        boolean add = ctx.SUM() != null;

        Dices dice = rolls.get(rolls.size() - 1);
        dice.explode(explodeOn, add);

        return null;
    }

    @Override
    public Void visitNumber(ExprParser.NumberContext ctx) {
        return null;
    }


    @Override
    public Void visitDiceExprSum(ExprParser.DiceExprSumContext ctx) {
        boolean isNegative = ctx.ADD() == null && ctx.SUB() != null;

        int repeat = 1;

        // Pobieranie ilości powtórzeń z `razy`
        if (ctx.mul().MULT() != null && ctx.mul().num() != null) {
            repeat = Integer.parseInt(ctx.mul().num().getText());
        }

        for (int i = 0; i < repeat; i++) {
            visit(ctx.mul().form()); // wykonujemy tylko form, czyli tworzenie kości

            Dices dice = rolls.get(rolls.size() - 1);
            dice.setNegative(isNegative);

            // 1. Eksplozje, przerzuty i odrzuty dla tego rzutu
            for (ExprParser.RulesumsContext rule : ctx.rulesums()) {
                if (rule instanceof ExprParser.ExplosionRuleContext ||
                        rule instanceof ExprParser.DiceRerollSumContext ||
                        rule instanceof ExprParser.DiceDiscSumContext) {
                    visit(rule);
                }
            }

            // 2. Oznaczenie dla tego rzutu
            for (ExprParser.RulesumsContext rule : ctx.rulesums()) {
                if (rule instanceof ExprParser.DiceMarkSumContext) {
                    visit(rule);
                }
            }
        }

        return null;
    }


    @Override
    public Void visitDiceExprSuk(ExprParser.DiceExprSukContext ctx) {
        boolean isNegative = ctx.ADD() == null && ctx.SUB() != null;

        int repeat = 1;

        if (ctx.mul().MULT() != null && ctx.mul().num() != null) {
            repeat = Integer.parseInt(ctx.mul().num().getText());
        }

        for (int i = 0; i < repeat; i++) {
            visit(ctx.mul().form()); // tylko pojedynczy rzut

            Dices dice = rolls.get(rolls.size() - 1);
            dice.setNegative(isNegative);

            // Najpierw: przerzuty i odrzuty
            for (ExprParser.RulesukcesContext ruleCtx : ctx.rulesukces()) {
                if (ruleCtx instanceof ExprParser.DiceRerollSukContext ||
                        ruleCtx instanceof ExprParser.DiceDiscSukContext) {
                    visit(ruleCtx);
                }
            }

            // Potem: sukcesy i oznaczenia
            for (ExprParser.RulesukcesContext ruleCtx : ctx.rulesukces()) {
                if (ruleCtx instanceof ExprParser.SuccessRuleContext ||
                        ruleCtx instanceof ExprParser.SuccessThresholdContext ||
                        ruleCtx instanceof ExprParser.SuccessMultiplierContext ||
                        ruleCtx instanceof ExprParser.DiceMarkSukContext) {
                    visit(ruleCtx);
                }
            }
        }

        return null;
    }



    @Override
    public Void visitDiceMarkSum(ExprParser.DiceMarkSumContext ctx) {
        visit(ctx.mark());
        return null;
    }

    @Override
    public Void visitDiceMarkSuk(ExprParser.DiceMarkSukContext ctx) {
        visit(ctx.mark());
        return null;
    }

    @Override
    public Void visitMarkThan(ExprParser.MarkThanContext ctx) {
        int value = Integer.parseInt(ctx.num().getText());
        Dices dice = rolls.get(rolls.size() - 1);

        if (ctx.MORETHAN() != null) {
            for (int i = 0; i < dice.getRolls().size(); i++) {
                if (dice.getRolls().get(i) > value) {
                    dice.mark(i);
                }
            }
        } else if (ctx.LESSTHAN() != null) {
            for (int i = 0; i < dice.getRolls().size(); i++) {
                if (dice.getRolls().get(i) < value) {
                    dice.mark(i);
                }
            }
        }

        return null;
    }

    @Override
    public Void visitMarkHigh(ExprParser.MarkHighContext ctx) {
        Dices dice = rolls.get(rolls.size() - 1);
        int target = ctx.HIGH() != null ? dice.highest(1).get(0) : dice.lowest(1).get(0);

        for (int i = 0; i < dice.getRolls().size(); i++) {
            if (dice.getRolls().get(i) == target) {
                dice.mark(i);
            }
        }

        return null;
    }

    @Override
    public Void visitMarkKol(ExprParser.MarkKolContext ctx) {
        int number = Integer.parseInt(ctx.num().getText());
        Dices dice = rolls.get(rolls.size() - 1);

        if (ctx.FIRST() != null) {
            for (int i = 0; i < Math.min(number, dice.getRolls().size()); i++) {
                dice.mark(i);
            }
        } else if (ctx.LAST() != null) {
            int size = dice.getRolls().size();
            for (int i = size - Math.min(number, size); i < size; i++) {
                dice.mark(i);
            }
        }

        return null;
    }


    @Override
    public Void visitMarkNum(ExprParser.MarkNumContext ctx) {
        int value = Integer.parseInt(ctx.num().getText());
        Dices dice = rolls.get(rolls.size() - 1);

        for (int i = 0; i < dice.getRolls().size(); i++) {
            if (dice.getRolls().get(i) == value) {
                dice.mark(i);
            }
        }

        return null;
    }

    @Override
    public Void visitRerollThen(ExprParser.RerollThenContext ctx) {
        int value = Integer.parseInt(ctx.num().getText());
        Dices dice = rolls.get(rolls.size() - 1);

        for (int i = 0; i < dice.getRolls().size(); i++) {
            int roll = dice.getRolls().get(i);
            if ((ctx.MORETHAN() != null && roll > value) ||
                    (ctx.LESSTHAN() != null && roll < value)) {
                dice.reroll(i);
            }
        }

        return null;
    }

    @Override
    public Void visitRerollHight(ExprParser.RerollHightContext ctx) {
        Dices dice = rolls.get(rolls.size() - 1);
        List<Integer> relevant = ctx.HIGH() != null ? dice.highest(1) : dice.lowest(1);
        if (!relevant.isEmpty()) {
            int target = relevant.get(0);
            for (int i = 0; i < dice.getRolls().size(); i++) {
                if (dice.getRolls().get(i) == target) {
                    dice.reroll(i);
                }
            }
        }
        return null;
    }

    @Override
    public Void visitRerollKol(ExprParser.RerollKolContext ctx) {
        int number = Integer.parseInt(ctx.num().getText());
        Dices dice = rolls.get(rolls.size() - 1);

        if (ctx.FIRST() != null) {
            for (int i = 0; i < Math.min(number, dice.getRolls().size()); i++) {
                dice.reroll(i);
            }
        } else if (ctx.LAST() != null) {
            int size = dice.getRolls().size();
            for (int i = size - Math.min(number, size); i < size; i++) {
                dice.reroll(i);
            }
        }

        return null;
    }

    @Override
    public Void visitRerollNum(ExprParser.RerollNumContext ctx) {
        int value = Integer.parseInt(ctx.num().getText());
        Dices dice = rolls.get(rolls.size() - 1);

        for (int i = 0; i < dice.getRolls().size(); i++) {
            if (dice.getRolls().get(i) == value) {
                dice.reroll(i);
            }
        }

        return null;
    }

    @Override
    public Void visitDiceDiscSum(ExprParser.DiceDiscSumContext ctx) {
        visit(ctx.discard());
        return null;
    }

    @Override
    public Void visitDiceDiscSuk(ExprParser.DiceDiscSukContext ctx) {
        visit(ctx.discard());
        return null;
    }

    @Override
    public Void visitDiscardThan(ExprParser.DiscardThanContext ctx) {
        Dices dice = rolls.get(rolls.size() - 1);
        int value = Integer.parseInt(ctx.num().getText());

        for (int i = 0; i < dice.getRolls().size(); i++) {
            int roll = dice.getRolls().get(i);
            if ((ctx.MORETHAN() != null && roll > value) ||
                    (ctx.LESSTHAN() != null && roll < value)) {
                dice.discard(i);
            }
        }
        return null;
    }

    @Override
    public Void visitDiscardHigh(ExprParser.DiscardHighContext ctx) {
        Dices dice = rolls.get(rolls.size() - 1);
        List<Integer> relevant = ctx.HIGH() != null ? dice.highest(1) : dice.lowest(1);
        if (!relevant.isEmpty()) {
            int target = relevant.get(0);
            for (int i = 0; i < dice.getRolls().size(); i++) {
                if (dice.getRolls().get(i) == target) {
                    dice.discard(i);
                }
            }
        }
        return null;
    }

    @Override
    public Void visitDiscardKol(ExprParser.DiscardKolContext ctx) {
        int number = Integer.parseInt(ctx.num().getText());
        Dices dice = rolls.get(rolls.size() - 1);

        if (ctx.FIRST() != null) {
            for (int i = 0; i < Math.min(number, dice.getRolls().size()); i++) {
                dice.discard(i);
            }
        } else if (ctx.LAST() != null) {
            int size = dice.getRolls().size();
            for (int i = size - Math.min(number, size); i < size; i++) {
                dice.discard(i);
            }
        }

        return null;
    }

    @Override
    public Void visitDiscardNum(ExprParser.DiscardNumContext ctx) {
        int value = Integer.parseInt(ctx.num().getText());
        Dices dice = rolls.get(rolls.size() - 1);

        for (int i = 0; i < dice.getRolls().size(); i++) {
            if (dice.getRolls().get(i) == value) {
                dice.discard(i);
            }
        }

        return null;
    }



    @Override
    public Void visitMul(ExprParser.MulContext ctx) {
        int repeat = 1;
        if (ctx.MULT() != null && ctx.num() != null) {
            repeat = Integer.parseInt(ctx.num().getText());
        }

        for (int i = 0; i < repeat; i++) {
            visit(ctx.form());
        }

        return null;
    }

    @Override
    public Void visitForm(ExprParser.FormContext ctx) {
        visit(ctx.dice());
        Dices dice = rolls.get(rolls.size() - 1);

        if (ctx.ADD() != null) {
            int mod = Integer.parseInt(ctx.num().getText());
            dice.applyModifier(v -> v + mod, "+ " + mod);
        } else if (ctx.SUB() != null) {
            int mod = Integer.parseInt(ctx.num().getText());
            dice.applyModifier(v -> v - mod, "- " + mod);
        } else if (ctx.MUL() != null) {
            int mod = Integer.parseInt(ctx.num().getText());
            dice.applyModifier(v -> v * mod, "* " + mod);
        } else if (ctx.DEV() != null) {
            int mod = Integer.parseInt(ctx.num().getText());
            dice.applyModifier(v -> v / mod, "/ " + mod);
        }

        return null;
    }

}
