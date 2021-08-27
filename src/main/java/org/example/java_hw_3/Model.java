package org.example.java_hw_3;

public class Model {

    public int minRandValue;
    public int maxRandValue;

    public void setMinMaxValues(int min, int max){
        minRandValue = min;
        maxRandValue = max;
    }

    public int rand(){
        return minRandValue+(int)(Math.random()*(maxRandValue-minRandValue+1));
    }

}
