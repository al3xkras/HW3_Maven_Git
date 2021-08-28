package org.example.java_hw_3;

public class View {
    public Model model;

    public static final String MESSAGE_INPUT_NUMBER_GREATER =
            "Number is greater than secret number";
    public static final String MESSAGE_INPUT_NUMBER_LESS =
            "Number is less than secret number";
    public static final String MESSAGE_INPUT_NUMBER_EQUALS =
            "Number is equal to unknown number!";
    public static final String MESSAGE_INPUT_NUMBER_NOT_IN_RANGE =
            "Number %d is not in range from %d to %d.";
    public static final String MESSAGE_GREET =
            "More or Less game: input number and try to guess secret number.\n";
    public static final String MESSAGE_REQUEST_NUMBER =
            "Input number in range from %d to %d: ";
    public static final String MESSAGE_GAME_OVER =
            "\nStatistics:\n  Moves made: %d\n  Time spent: %ds\n\nGame Over!";

    public View(Model model){
        this.model = model;
    }

    public String getMessage(int number){

        if (number>model.maxValue || number<model.minValue){
            return String.format(View.MESSAGE_INPUT_NUMBER_NOT_IN_RANGE,
                    number,model.minValue,model.maxValue);
        }

        if (number== model.secretNumber){
            return View.MESSAGE_INPUT_NUMBER_EQUALS;
        }

        if (number>model.secretNumber){
            return View.MESSAGE_INPUT_NUMBER_GREATER;
        } else {
            return View.MESSAGE_INPUT_NUMBER_LESS;
        }
    }

    public void printMessage(int inputNumber){
        String message = getMessage(inputNumber);

        System.out.println(message);
    }

    public void greet(){
        System.out.println(View.MESSAGE_GREET);
    }

    public void requestNumber(){
        String message = String.format(View.MESSAGE_REQUEST_NUMBER,
                model.minValue,model.maxValue);
        System.out.println(message);
    }

    public void printGameOver(int movesMade,int timeSpentSeconds){
        System.out.printf(View.MESSAGE_GAME_OVER,movesMade,timeSpentSeconds);
    }




}
