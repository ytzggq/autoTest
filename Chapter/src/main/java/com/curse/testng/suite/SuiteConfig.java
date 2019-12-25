package com.curse.testng.suite;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

public class SuiteConfig {
   @BeforeSuite
    public void beforeSuite(){
        System.out.println("before suite 运行了");
    }
    @AfterSuite
    public void afterSuite(){
        System.out.println("after suite 运行了");
    }

    @BeforeTest
    public void beforeTest(){
        System.out.println("before Test");
    }

    @BeforeTest
    public  void afterTest(){
        System.out.println("after test");
    }


}
