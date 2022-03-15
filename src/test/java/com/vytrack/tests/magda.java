package com.vytrack.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class magda {

    @Test(priority = 1)
    public void test1(){
        System.out.println("Test 1 is running...");

        //ASSERT EQUALS compare 2 of the same things:

        String actual = "apple";
        String expected = "apple";

        Assert.assertEquals(actual, expected);
    }
}
