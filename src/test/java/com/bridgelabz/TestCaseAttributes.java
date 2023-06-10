package com.bridgelabz;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestCaseAttributes {
    /*
    @Test(priority = 1)
    public void xyz(){
        System.out.println("xyz test case");
    }

    //@Test(priority = 1)
    @Test(priority = 2)
    public void abc(){
        System.out.println("abc test case");
    }

     */
    @Test(invocationCount = 4)
    public void createUser(){
        Assert.assertTrue(true,"Create User Failed");
    }

    @Test()
    public void deleteUser(){
        System.out.println("delete User Successfully...");
    }
}
