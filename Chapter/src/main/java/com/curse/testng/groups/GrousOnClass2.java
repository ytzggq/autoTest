package com.curse.testng.groups;


import org.testng.annotations.Test;
/*
*
* /*
 * class类分组测试
 *
 * */

@Test(groups = "stu")
public class GrousOnClass2 {

    public void stu1(){
        System.out.println("GrousOnClass222中的stu1运行");
    }

    public void stu2(){
        System.out.println("GrousOnClass222中的stu2运行");
    }
}
