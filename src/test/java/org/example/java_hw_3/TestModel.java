package org.example.java_hw_3;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

public class TestModel {
    Model model;

    @Before
    public void createModel(){
        model = new Model();
        model.setMinMaxValues(0,100);
    }

    @Test
    public void testRand(){
        int loops = (model.maxRandValue-model.minRandValue)*20;

        loops = Math.min(10000,loops);

        ArrayList<Integer> uniqueValues = new ArrayList<>();

        for (int i=loops-1; i>=0; i++){
            int randNum = model.rand();

            if (randNum<model.minRandValue || randNum>model.maxRandValue){
                Assert.fail();
            }

            if (!uniqueValues.contains(randNum)){
                uniqueValues.add(randNum);
            }

        }

        if (uniqueValues.size()<(model.maxRandValue-model.minRandValue)*0.8){
            Assert.fail();
        }

    }

    @Test
    public void testSetSecretNumber(){

    }

    @Test
    public void testCheckUserInputNumber(){

    }





}
