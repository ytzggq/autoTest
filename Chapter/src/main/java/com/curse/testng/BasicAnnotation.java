package com.curse.testng;

import org.testng.annotations.*;

/*
* 基本注解
* */

//最基本注解，用例把方法标记为测试的一部分，这个就是Test注解，在方法上进行标注
@Test
public class BasicAnnotation {
    public void  testCase1(){
        System.out.println("这个是测试用例");
    }

    @Test
    public  void testCase2(){
        System.out.println("Test这个是测试用例2");
    }

    @BeforeMethod
    public void beforeMethod(){
        System.out.println("BeforeMethod这个是在测试方法之前运行的");
    }

    @AfterMethod
    public void afterMethod(){
        System.out.println("afterMethod这个是在测试方法之后运行的");
    }


    @BeforeClass
    public void beforeClass(){
        System.out.println("beforeClass这个是在类运行之前运行的");
    }

    @AfterClass
    public void afterClass(){
        System.out.println("afterClass这个是在类运行之后运行的");
    }

    @BeforeSuite
    public void beforeSuite(){
        System.out.println("beforeSuite测试套件");
    }


    @AfterSuite
    public void afterSuite(){
        System.out.println("afterSuite测试套件，包含多个class类");
    }
}
