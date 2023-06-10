package com.bridgelabz;

import org.testng.annotations.*;

public class OrderOfTestNG {
    @BeforeSuite
    public void beforeSuite(){
        System.out.println("Before Suite...");
    }

    @BeforeClass
    public void beforeClass(){
        System.out.println("Before Class...");
    }

    @BeforeTest
    public void beforeTest(){
        System.out.println("Before Test...");
    }

    @BeforeMethod
    public void beforeMethod(){
        System.out.println("Before Method...");
    }

    @Test
    public void test1(){
        System.out.println("Test Case 1...");
    }

    @Test
    public void test2(){
        System.out.println("Test Case 2...");
    }

    @Test
    public void test3(){
        System.out.println("Test Case 3...");
    }

    @AfterSuite
    public void afterSuite(){
        System.out.println("After Suite...");
    }

    @AfterClass
    public void afterClass(){
        System.out.println("After Class...");
    }

    @AfterTest
    public void afterTest(){
        System.out.println("After Test...");
    }

    @AfterMethod
    public void afterMethod(){
        System.out.println("After Method...");
    }
}
