package com.curse.testng.groups;


import org.testng.annotations.Test;
/*
 * class类分组测试
 *
 * */
@Test(groups = "teacher")//这次写在类上面，之前的写在方法上面
public class GrousOnClass3 {
    public void teacher1(){
        System.out.println("GrousOnClass3中的teacher1运行");
    }
    public void teacher2(){
        System.out.println("GrousOnClass3中的teacher2222运行");
    }
}
