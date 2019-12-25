package com.curse.testng.suite;

import org.testng.annotations.Test;

/*

异常测试
* 什么情况下会用到异常测试，在我们期望结果是某一个异常时候，比如，我们传入了某些不合法的输入，程序跑出了异常，也就是我的预期结果就是 异常；
*
*
* */
//这个是测试结果会失败的异常测试

public class ExceptedException {


    @Test(expectedExceptions  =RuntimeException.class)
    public void runtimeExceptionFailed(){
        System.out.println("这是一个失败的异常测试");
    }

 //这是一个成功的异常测试
 @Test(expectedExceptions  =RuntimeException.class)
    public  void runtimeExceptionSuccess(){
     System.out.println("这是我的异常测试");
        throw new RuntimeException();//铺抓抛出异常
//        System.out.println("执行不到");
    }
}
