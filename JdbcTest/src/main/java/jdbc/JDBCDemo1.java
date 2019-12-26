package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

/*
* JDBC 学习
* */
public class JDBCDemo1 {
    public static void main(String[] args) throws Exception {
/*    //导入jar包
        1、复制到lib目录下
        2、右键 Add as Library  ，这个直接在jar右键
        3、注册驱动


        */
//        3、注册驱动
//       Class.forName("com.mysql.jdbc.Driver");//com.mysql.cj.jdbc.Drive 也报错
//        注意mysql5之后的驱动jar包可以省略注册驱动的步骤
//       获取数据库连接对象 URL： jdbc：mysql：// 数据库地址：端口/数据库名  ,参数2，用户名：参数3,密码

        /*URL语法： jdbc：mysql：// IP地址(域名)：端口/数据库名称
          本地或者： jdbc：mysql：///数据库名称   这个简写也可以的
        * */

       Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/bns1","root","root");

//       4.定义sql语句
        String sql ="update bns_pv_201903 set bonus_month= '201903'  ";
//        5.获取直销SQL的对象 Statement
        Statement stmt=conn.createStatement();
//        6.执行sql， 返回int值，这个int值，就是sql执行的行数
        int count=stmt.executeUpdate(sql);


//        7.处理结果
        System.out.println(count);
//        8.释放资源资源
        stmt.close();
        conn.close();




    }
}
