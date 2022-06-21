package com.company;

public class PairOfDie {
    private DieRevised die1 = new DieRevised();
    private DieRevised die2 = new DieRevised();

    public void setDie1(int value) {
        die1.setFaceValue(value);
    }
    public int getDie1() {
        return die1.getFaceValue();
    }
    public void setDie2(int value) {
        die2.setFaceValue(value);
    }
    public int getDie2() {
        return die2.getFaceValue();
    }
    public void rollDice() {
        die1.roll();
        die2.roll();
    }
    public int getSum() {
        return (die1.getFaceValue() + die2.getFaceValue());
    }
}
