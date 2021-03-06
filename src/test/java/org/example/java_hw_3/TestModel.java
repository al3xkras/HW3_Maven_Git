package org.example.java_hw_3;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

import java.util.ArrayList;

public class TestModel {
    Model model;

    @Before
    public void createModel(){
        model = new Model();
        model.setMinMaxValues(0,100);
    }

    @Ignore
    @Test
    public void testRand(){
        int loops = (model.maxValue -model.minValue)*20;

        loops = Math.min(10000,loops);

        ArrayList<Integer> uniqueValues = new ArrayList<>();

        for (int i=loops-1; i>=0; i--){
            int randNum = model.rand();

            if (randNum<model.minValue || randNum>model.maxValue){
                Assert.fail();
            }

            if (!uniqueValues.contains(randNum)){
                uniqueValues.add(randNum);
            }

        }

        if (uniqueValues.size()<(model.maxValue -model.minValue)*0.8){
            Assert.fail();
        }

    }

    @Test
    public void testSetSecretNumber1(){
        model.setSecretNumber();

        if (model.secretNumber==null ||
                model.secretNumber<model.minValue ||
                model.secretNumber>model.maxValue){
            Assert.fail();
        }

    }

    @Test
    public void testSetSecretNumber2(){
        Assert.assertNull(model.secretNumber);
    }

    @Test
    public void testCheckUserInputNumber1(){
        model.secretNumber = 50;
        Assert.assertTrue(model.checkUserInputNumber(50));
    }

    @Test
    public void testCheckUserInputNumber2(){
        model.secretNumber = 50;
        Assert.assertFalse(model.checkUserInputNumber(110));
        Assert.assertEquals(100, (int) model.maxValue);
    }

    @Test
    public void testCheckUserInputNumber3(){
        model.secretNumber = 50;
        Assert.assertFalse(model.checkUserInputNumber(-10));
        Assert.assertEquals(0, (int) model.minValue);
    }

    @Test
    public void testCheckUserInputNumber4(){
        model.secretNumber = 50;
        Assert.assertFalse(model.checkUserInputNumber(60));
        Assert.assertEquals(60, (int) model.maxValue);

    }





}
