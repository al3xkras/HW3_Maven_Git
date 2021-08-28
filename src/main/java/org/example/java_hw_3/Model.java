package org.example.java_hw_3;

public class Model {

    public Integer minValue;
    public Integer maxValue;

    public Integer secretNumber;

    public void setSecretNumber(){
        if (maxValue !=null & minValue !=null){
            secretNumber = rand();
        }
    }

    public void setMinMaxValues(int min, int max){
        minValue = min;
        maxValue = max;
    }

    public int rand(){
        int dNumber = maxValue - minValue;
        return minValue +(int)(Math.random()*(dNumber+1));
    }

    public boolean checkUserInputNumber(int number){
        if (number==secretNumber){
            return true;
        }

        if (number>secretNumber){
            maxValue = Math.min(maxValue,number);
        } else {
            minValue = Math.max(minValue,number);
        }

        return false;
    }

}
