package org.example.java_hw_3;

public class Model {

    public Integer minRandValue;
    public Integer maxRandValue;

    public Integer secretNumber;

    public void setSecretNumber(){
        if (maxRandValue!=null & minRandValue!=null){
            secretNumber = rand();
        }
    }

    public void setMinMaxValues(int min, int max){
        minRandValue = min;
        maxRandValue = max;
    }

    public int rand(){
        int dNumber = maxRandValue-minRandValue;
        return minRandValue+(int)(Math.random()*(dNumber+1));
    }

}
