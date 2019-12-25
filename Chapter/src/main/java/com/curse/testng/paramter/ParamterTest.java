package com.curse.testng.paramter;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

/*
* 参数化测试
*
* */
public class ParamterTest {

    @Test
    @Parameters({"name","age"})/*这个是参数化需要的参数*/
    public  void  ParamTest1(String name,int age){
        System.out.println("name="+name+";age="+age);


    }

}
