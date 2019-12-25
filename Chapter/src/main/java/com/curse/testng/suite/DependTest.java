package com.curse.testng.suite;
/*
* 依赖测试
* */

import org.testng.annotations.Test;
/*
* test2的运行依赖test1，test1失败了，test2就是不执行，这个是依赖;
*
* */

public class DependTest {

 @Test
  public void test1(){
      System.out.println("test1 run");
      throw new RuntimeException();//这里test1失败了，test2就会被忽略不执行
  }

    @Test(dependsOnMethods = {"test1"})//这里面的test1  就是上面方法的test1,
    public void test2(){
        System.out.println("test2 run");
    }

}
