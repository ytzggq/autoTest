package com.curse.testng.suite;
/*
* 忽略测试
*
* */


import org.testng.annotations.Test;

public class IgnoreTest {
    @Test
    public void ignore1(){
        System.out.println("ignore 1 运行了");
    }

    @Test(enabled = false)// 这个参数enable=false 就是不执行这个方法ignore2 ，忽略这些不执行
    public void ignore2(){
        System.out.println("ignore 2 运行了");
    }

    @Test(enabled = true)
    public void ignore3(){
        System.out.println("ignore 3 运行了");
    }



}
