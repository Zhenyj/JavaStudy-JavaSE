package demo03;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;
import util.JDBCUtils;

/**
 * @author zyj
 * @create 2021-05-30 22:38
 *
 * 使用PreparedStatement,可以防止SQL注入
 * 2．解决sql注入问题:使用PreparedStatement对象来解决
 * 3．预编译的sQL:参数使用?作为占位符
 * 4.步骤︰
 * (1)导人驱动jar包mysql-connector-java-5.1.37-bin.jar
 * (2)注册驱动
 * (3)获取数据库连接对象Connection
 * (4)定义sql
 * 注意:sql的参数使用?作为占位符。如: select *from user where username = ? and password = ?;
 * (5)获取执行sql语句的对象PreparedStatement connection.prepareStatement(String sql)
 * (6)给?赋值︰
 * 方法:setXxx(参数1,参数2)
 * 参数1: ?的位置编号从1开始出
 * 参数2∶?的值
 * (7)执行sq1，接受返回结果,不需要传递sql语句
 * (8)处理结果
 * (9)释放资源
 */
public class Demo02 {

  public static void main(String[] args) {
    // 1.键盘录入用户名密码
    Scanner sc = new Scanner(System.in);
    System.out.print("请输入用户名:");
    String username = sc.nextLine();
    System.out.print("请输入密码:");
    String password = sc.nextLine();
    if (new Demo02().login(username, password)) {
      System.out.println("登录成功");
    } else {
      System.out.println("账号或密码错误");
    }
  }

  public boolean login(String username, String password) {
    if (username == null || password == null) {
      return false;
    }
    Connection conn = null;
    PreparedStatement pstmt = null;
    ResultSet rs = null;
    try {
      // 1.获取连接
      conn = JDBCUtils.getConnection();
      // 2.定义sql,?占位符
      String sql = "SELECT * FROM `user` WHERE username = ? AND password = ?";
      // 3.获取执行对象
      pstmt = conn.prepareStatement(sql);
      // 4.执行查询
      // 给问号赋值
      pstmt.setString(1, username);
      pstmt.setString(2, password);
      rs = pstmt.executeQuery();
      return rs.next();// 返回是否有下一行数据
    } catch (SQLException throwables) {
      throwables.printStackTrace();
    } finally {
      JDBCUtils.close(rs, pstmt, conn);
    }
    return false;
  }
}
