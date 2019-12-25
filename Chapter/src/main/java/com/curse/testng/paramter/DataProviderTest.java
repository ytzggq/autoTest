package com.curse.testng.paramter;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.lang.reflect.Method;

/*
* 这个也是参数化
*
* */
public class DataProviderTest {

    @Test(dataProvider = "data")

    public void testDataProvider(String name ,int age){
        System.out.println("name="+name+";age="+age);/*不要漏了age前面的分号*/

    }

    @DataProvider(name="data")
    public Object[][] providerDate(){
        Object[][] o=new Object[][]{
                {"zhangsan",10},{"lisi",20},{"wangwu",30}
        };
        return o;
    }

/*    @Test(dataProvider = "methoddata")
    public void test1(String name ,int age){
        System.out.println("test1111 方法 name ="+name+";age="+age);
    }

    @Test(dataProvider = "methoddata")
    public void test2(String name ,int age){
        System.out.println("test2222 方法 name ="+name+";age="+age);
    }

    @DataProvider(name="methoddata")
   public Object[][] methodDateTest(Method,method){

   }*/


}
