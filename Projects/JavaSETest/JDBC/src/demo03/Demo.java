package demo03;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;
import util.JDBCUtils;

/**
 * @author zyj
 * @create 2021-05-30 22:38
 */
public class Demo {

  public static void main(String[] args) {
    // 1.键盘录入用户名密码
    Scanner sc = new Scanner(System.in);
    System.out.print("请输入用户名:");
    String username = sc.nextLine();
    System.out.print("请输入密码:");
    String password = sc.nextLine();
    if(new Demo().login(username, password)){
      System.out.println("登录成功");
    }else{
      System.out.println("账号或密码错误");
    }
  }

  public boolean login(String username, String password) {
    if (username == null || password == null) {
      return false;
    }
    Connection conn = null;
    Statement stmt = null;
    ResultSet rs = null;
    try {
      // 1.获取连接
      conn = JDBCUtils.getConnection();
      // 2.定义sql
      String sql = "SELECT * FROM `user` WHERE username='" + username + "' AND password='" + password + "'";
      // 3.获取执行对象
      stmt = conn.createStatement();
      // 4.执行查询
      rs = stmt.executeQuery(sql);
      return rs.next();// 返回是否有下一行数据
    } catch (SQLException throwables) {
      throwables.printStackTrace();
    } finally {
      JDBCUtils.close(rs, stmt, conn);
    }
    return false;
  }
}
