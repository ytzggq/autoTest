package com.curse.testng.groups;

import org.testng.annotations.AfterGroups;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.Test;
/*
* 方法级别运行的顺序，方法分组
*
* */
public class GroupsOnMethod {

    @Test(groups = "server")
    public  void test1(){
        System.out.println("这个是服务端组的测试方法11111");
    }

    @Test(groups = "server")
    public  void test2(){
        System.out.println("这个是服务端组的测试方法2222");
    }
    @Test(groups = "client")
    public  void test3(){
        System.out.println("这个是客户端组的测试方法333333");
    }

    @Test(groups = "client")
    public  void test4(){
        System.out.println("这个是客户端组的测试方法4444444");
    }
    @BeforeGroups("server")
    public void  beforeGroupsOnServer(){
        System.out.println("这是服务端组运行之前的运行方法");
    }
    @AfterGroups("server")
    public void  afterGroupsOnServer(){
        System.out.println("这是服务端组运行之hou的运行方法");
    }
    @BeforeGroups("Client")
    public void  beforeGroupsOnClient(){
        System.out.println("这是客户端组运行之前的运行方法");
    }
    @AfterGroups("Client")
    public void  afterGroupsOnClient(){
        System.out.println("这是客户端组运行之hou的运行方法");
    }
}
