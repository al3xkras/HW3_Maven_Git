package org.example.java_hw_3;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

public class TestModel {
    Model model;

    @Before
    public void createModel(){
        model = new Model();
    }

    @Test
    public void testRand(){
        int loops = (model.maxRandValue-model.minRandValue)*20;

        loops = Math.min(10000,loops);

        ArrayList<Integer> uniqueValues = new ArrayList<>();

        for (int i=loops-1; i>=0; i++){
            int randNum = model.rand(num)
        }
    }

    @Test
    public void testSetSecretNumber(){

    }

    @Test
    public void testCheckUserInputNumber(){

    }





}
