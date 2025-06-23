package org.xtext.example.mydsl.ui.antler.src;

import java.util.*;
import java.util.function.Function;

public class Dices {
    private final List<Integer> rolls;
    private final List<Integer> markedIndices;
    private final Map<Integer, List<Integer>> explodedRollsMap;
    private final Map<Integer, List<Integer>> removedExplosionsMap;
    private final Map<Integer, Integer> successMap;
    private final Map<Integer, Integer> rerolledMap;
    private final Set<Integer> discardedIndices;
    private String modifierInfo = "";
    private Function<Integer, Integer> modifierFunction = null;
    private final Random random = new Random();
    private final int sides;
    private final int count;
    private boolean negative = false;

    private String modifierDescription = "";


    public Dices(int count, int sides) {
        this.count = count;
        this.sides = sides;
        this.rolls = new ArrayList<>();
        this.markedIndices = new ArrayList<>();
        this.explodedRollsMap = new HashMap<>();
        this.removedExplosionsMap = new HashMap<>();
        this.discardedIndices = new HashSet<>();
        this.successMap = new HashMap<>();
        this.rerolledMap = new HashMap<>();
        roll();
    }

    public Dices(int count, int sides, List<Integer> predefinedRolls) {
        this.count = count;
        this.sides = sides;
        this.rolls = new ArrayList<>(predefinedRolls);
        this.markedIndices = new ArrayList<>();
        this.explodedRollsMap = new HashMap<>();
        this.removedExplosionsMap = new HashMap<>();
        this.discardedIndices = new HashSet<>();
        this.successMap = new HashMap<>();
        this.rerolledMap = new HashMap<>();
        updateSum();
    }

    private void roll() {
        rolls.clear();
        for (int i = 0; i < count; i++) {
            rolls.add(random.nextInt(sides) + 1);
        }
        updateSum();
    }

    private void updateSum() {
        int sum = 0;
        for (int i = 0; i < rolls.size(); i++) {
            if (!discardedIndices.contains(i)) { // Odrzucamy odrzucone kości
                sum += rolls.get(i);
            }
        }
        for (List<Integer> list : explodedRollsMap.values()) {
            sum += list.stream().mapToInt(Integer::intValue).sum();
        }
        for (List<Integer> list : removedExplosionsMap.values()) {
            sum -= list.stream().mapToInt(Integer::intValue).sum();
        }
    }

    public void discard(int index) {
        if (index >= 0 && index < rolls.size()) {
            discardedIndices.add(index);  // Oznaczamy kość jako odrzuconą
        }
    }

    public boolean isDiscarded(int index) {
        return discardedIndices.contains(index);  // Sprawdzamy, czy kość jest odrzucona
    }

    public List<Integer> getRolls() {
        return new ArrayList<>(rolls);
    }

    public void addSuccess(int index, int amount) {
        if (!discardedIndices.contains(index)) {
            successMap.put(index, successMap.getOrDefault(index, 0) + amount);
        }
    }

    public int getSuccesses() {
        return successMap.entrySet().stream()
                .filter(entry -> !discardedIndices.contains(entry.getKey()))
                .mapToInt(Map.Entry::getValue)
                .sum();
    }

    public int getSuccessAt(int index) {
        return successMap.getOrDefault(index, 0);
    }

    public int getSum() {
        int sum = 0;
        for (int i = 0; i < rolls.size(); i++) {
            if (!discardedIndices.contains(i)) {  // Odrzucamy odrzucone kości
                sum += rolls.get(i);
            }
        }
        for (List<Integer> list : explodedRollsMap.values()) {
            sum += list.stream().mapToInt(Integer::intValue).sum();
        }
        for (List<Integer> list : removedExplosionsMap.values()) {
            sum -= list.stream().mapToInt(Integer::intValue).sum();
        }
        return sum;
    }

    public void setSuccesses(int successes) {
    }

    public int countMarkedSuccesses() {
        int count = 0;
        for (int i = 0; i < rolls.size(); i++) {
            if (!discardedIndices.contains(i) && markedIndices.contains(i) && rolls.get(i) >= 6) {  // Zliczamy tylko oznaczone sukcesy
                count++;
            }
        }
        return count;
    }

    public void setNegative(boolean negative) {
        this.negative = negative;
    }

    public boolean isNegative() {
        return negative;
    }

    public int countSuccesses(int threshold) {
        int count = 0;
        for (int i = 0; i < rolls.size(); i++) {
            if (!discardedIndices.contains(i) && rolls.get(i) >= threshold) {  // Zliczamy sukcesy, pomijając odrzucone kości
                count++;
            }
        }
        return count;
    }

    public void explode(int explodeOn, boolean add) {
        Map<Integer, List<Integer>> newExplosions = new HashMap<>();

        for (int i = 0; i < rolls.size(); i++) {
            int baseRoll = rolls.get(i);
            if (baseRoll == explodeOn) {
                List<Integer> extras = new ArrayList<>();
                int current = baseRoll;

                while (current == explodeOn) {
                    current = random.nextInt(sides) + 1;
                    extras.add(current);
                }

                if (!extras.isEmpty()) {
                    newExplosions.put(i, extras);
                }
            }
        }

        if (add) {
            for (Map.Entry<Integer, List<Integer>> entry : newExplosions.entrySet()) {
                explodedRollsMap.put(entry.getKey(), entry.getValue());
                rolls.addAll(entry.getValue());
            }
        } else {
            removedExplosionsMap.putAll(newExplosions);
        }

        updateSum();
    }

    public List<Integer> highest(int n) {
        List<Integer> sorted = new ArrayList<>(rolls);
        sorted.sort(Collections.reverseOrder());
        return sorted.subList(0, Math.min(n, sorted.size()));
    }

    public List<Integer> lowest(int n) {
        List<Integer> sorted = new ArrayList<>(rolls);
        Collections.sort(sorted);
        return sorted.subList(0, Math.min(n, sorted.size()));
    }

    public void mark(int index) {
        if (index >= 0 && index < rolls.size() && !markedIndices.contains(index)) {
            markedIndices.add(index);
        }
    }

    public void reroll(int index) {
        if (index >= 0 && index < rolls.size() && !discardedIndices.contains(index)) {
            int original = rolls.get(index);
            int newRoll = random.nextInt(sides) + 1;
            rolls.set(index, newRoll);
            rerolledMap.put(index, original);
            updateSum();
        }
    }

    public boolean wasRerolled(int index) {
        return rerolledMap.containsKey(index);
    }

    public int getOriginalValue(int index) {
        return rerolledMap.getOrDefault(index, rolls.get(index));
    }



    public boolean isMarked(int index) {
        return markedIndices.contains(index);
    }

    public Map<Integer, List<Integer>> getExplodedRollsMap() {
        return explodedRollsMap;
    }

    public boolean hasExplosionAt(int index) {
        return explodedRollsMap.containsKey(index);
    }

    public List<Integer> getExplosionsAt(int index) {
        return explodedRollsMap.getOrDefault(index, Collections.emptyList());
    }

    public boolean hasRemovedExplosionAt(int index) {
        return removedExplosionsMap.containsKey(index);
    }

    public List<Integer> getRemovedExplosionsAt(int index) {
        return removedExplosionsMap.getOrDefault(index, Collections.emptyList());
    }

    public void setModifierType(String info) {
        this.modifierInfo = info;
    }

    public String getModifierType() {
        return modifierInfo;
    }

    public void applyModifier(Function<Integer, Integer> modifier, String description) {
        this.modifierFunction = modifier;
        this.modifierDescription = description;
        for (int i = 0; i < rolls.size(); i++) {
            rolls.set(i, modifier.apply(rolls.get(i)));
        }
        updateSum();
    }


    public String getModifierDescription() {
        return modifierDescription;
    }



}
