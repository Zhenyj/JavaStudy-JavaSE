package demo02;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 * @author zyj
 * @create 2021-05-30 20:59
 *
 * 定义一个方法，查询student表的数据将其封装为对象，然后装载集合，返回。
 */
public class JDBCDemo01 {

  public static void main(String[] args) {
    List<Student> list = findAll();
    for (Student student : list) {
      System.out.println(student);
    }
  }

  /**
   * 查询所有student数据
   * @return
   */
  public static List<Student> findAll(){
    Connection conn = null;
    Statement stmt = null;
    ResultSet rs = null;
    ArrayList<Student> list = new ArrayList<>();
    try {
      // 1.注册驱动
      Class.forName("com.mysql.cj.jdbc.Driver");
      // 2.建立连接
      conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbctest", "root", "123456");
      // 3.创建执行对象
      stmt = conn.createStatement();
      // 4.构造sql语句
      String sql = "SELECT studentId,studentName FROM student";
      // 5.执行语句
      rs = stmt.executeQuery(sql);
      // 6.处理数据
      while (rs.next()){
        String studentId = rs.getString("studentId");
        String studentName = rs.getString("studentName");
        list.add(new Student(studentId,studentName));
      }
      return list;
    } catch (ClassNotFoundException e) {
      e.printStackTrace();
    } catch (SQLException throwables) {
      throwables.printStackTrace();
    }finally {
      if(rs!=null){
        try {
          rs.close();
        } catch (SQLException throwables) {
          throwables.printStackTrace();
        }
      }
      if(stmt!=null){
        try {
          stmt.close();
        } catch (SQLException throwables) {
          throwables.printStackTrace();
        }
      }
      if(conn!=null){
        try {
          conn.close();
        } catch (SQLException throwables) {
          throwables.printStackTrace();
        }
      }
    }

    return null;
  }
}
