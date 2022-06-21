package com.company;

public class DieRevised{
    private final int MIN = 1;
    private final int MAX = 6;
    private int faceValue;

    public DieRevised(){
        faceValue = 1;
    }
    public int roll(){
        faceValue = (int) (Math.random() * MAX) + MIN;
        return faceValue;
    }
    public void setFaceValue(int value) {
        if (value > 0 && value <= MAX)
            faceValue = value;
    }
    public int getFaceValue(){
        return faceValue;
    }
    public String toString(){
        String result = Integer.toString(faceValue);
        return result;
    }
}



