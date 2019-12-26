package com.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.IOException;
import java.util.List;
import java.util.Set;


public class ChromeBaidu {
    public static void main(String[] args) throws IOException {

    //设置Chrome路径
        System.setProperty("webdriver.chrome.driver","C:\\Users\\Bobo\\AppData\\Local\\Google\\Chrome\\Application\\chromedriver.exe");
// 创建一个ChromeDriver的接口，用于连接chrome
        //创建chrome 实例

        WebDriver driver = new ChromeDriver();

        //让浏览器访问百度
        driver.get("https://www.baidu.com");
        //获取百度的标题
        System.out.println("第一页是百度"+driver.getTitle());

        //获取百度的输入框的id
        WebElement id = ((ChromeDriver) driver).findElementById("kw");

        //在输入框输入关键字，并且点击
        id.sendKeys("selenium元素定位");

        //提交输入框的表单内容（form）
        id.submit();
        //通过判断title内容等待搜索页面加载完毕，Timeout设置10秒
/*    (new WebDriver(driver,10)).until(new ExpectedCondition<Boolean>(){
        public Boolean.apply(WebDriver d){
            return driver.getTitle().toLowerCase().endsWith("selenium元素定位");
        }
    });*/
        //显示搜索结果页面的title
        System.out.println("第二页的标题"+driver.getTitle());

        //关闭浏览器
        //   driver.quit();

    }
}
