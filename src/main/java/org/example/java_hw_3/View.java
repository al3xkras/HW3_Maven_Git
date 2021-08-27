package org.example.java_hw_3;

import com.sun.org.apache.xpath.internal.operations.Mod;

public class View {
    public Model model;

    public static final String MESSAGE_INPUT_NUMBER_GREATER =
            "Input number ( %d ) is greater than secret number\n";
    public static final String MESSAGE_INPUT_NUMBER_LESS =
            "Input number ( %d ) is less than secret number\n";
    public static final String MESSAGE_INPUT_NUMBER_EQUALS =
            "Input number ( %d ) is equal to unknown number!\n";
    public static final String MESSAGE_INPUT_NUMBER_NOT_IN_RANGE =
            "Input number ( %d ) is not in range from %d to %d.\n";

    public View(Model model){
        this.model = model;
    }

    public String getMessage(int number){

        if (number>model.maxRandValue || number<model.minRandValue){
            return String.format(View.MESSAGE_INPUT_NUMBER_NOT_IN_RANGE,
                    number,model.minRandValue,model.maxRandValue);
        }

        if (number== model.secretNumber){
            return String.format(View.MESSAGE_INPUT_NUMBER_EQUALS,number);
        }

        if (number>model.secretNumber){
            return String.format(View.MESSAGE_INPUT_NUMBER_GREATER,number);
        } else {
            return String.format(View.MESSAGE_INPUT_NUMBER_LESS,number);
        }
    }

    public void printMessage(int inputNumber){
        String message = getMessage(inputNumber);

        System.out.println(message);
    }




}
