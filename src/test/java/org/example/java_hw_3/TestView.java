package org.example.java_hw_3;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TestView {

    View view;
    Model model;

    @Before
    public void createView(){
        model = new Model();
        model.setMinMaxValues(0,100);
        model.secretNumber = 50;

        view = new View(model);
    }

    @Test
    public void testGetMessage1(){
        int userInputNumber = 50;

        String message = String.format(
                View.MESSAGE_INPUT_NUMBER_EQUALS,
                userInputNumber);
        Assert.assertEquals(message,view.getMessage(userInputNumber));
    }

    @Test
    public void testGetMessage2(){
        int userInputNumber = 30;

        String message = String.format(
                View.MESSAGE_INPUT_NUMBER_LESS,
                userInputNumber);
        Assert.assertEquals(message,view.getMessage(userInputNumber));
    }

    @Test
    public void testGetMessage3(){
        int userInputNumber = 80;

        String message = String.format(
                View.MESSAGE_INPUT_NUMBER_GREATER,
                userInputNumber);
        Assert.assertEquals(message,view.getMessage(userInputNumber));
    }

    @Test
    public void testGetMessage(){
        int userInputNumber = 110;

        String message = String.format(
                View.MESSAGE_INPUT_NUMBER_NOT_IN_RANGE,
                userInputNumber,model.minRandValue,model.maxRandValue);
        Assert.assertEquals(message,view.getMessage(userInputNumber));
    }

}
