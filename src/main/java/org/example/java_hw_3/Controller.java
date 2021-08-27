package org.example.java_hw_3;

import java.util.Scanner;

public class Controller {
    Model model;
    View view;

    public Controller(Model model,View view){
        this.model = model;
        this.view = view;
    }

    public void processUser(){
        view.greet();

        model.setMinMaxValues(0,100);
        model.setSecretNumber();

        int number = inputNumber();
        int movesMade = 1;
        long timeOfStart = System.currentTimeMillis();

        while (!model.checkUserInputNumber(number)){
            view.printMessage(number);
            number = inputNumber();
            movesMade++;
        }

        int timeSpentSeconds = (int)((System.currentTimeMillis()-timeOfStart)/1000);

        view.printMessage(number);
        view.printGameOver(movesMade,timeSpentSeconds);
    }

    public int inputNumber(){
        Scanner sc = new Scanner(System.in);

        view.requestNumber();

        while (!sc.hasNextInt()){
            sc.next();
        }

        return sc.nextInt();
    }
}
