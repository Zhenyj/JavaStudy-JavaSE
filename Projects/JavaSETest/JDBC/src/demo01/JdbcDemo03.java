package demo01;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * @author zyj
 * @create 2021-05-30 19:06
 *
 * 练习
 * 修改记录
 */
public class JdbcDemo03 {

  public static void main(String[] args) {
    Connection conn = null;
    Statement stmt = null;
    try{
      Class.forName("com.mysql.cj.jdbc.Driver");
      conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbctest", "root", "123456");
      stmt = conn.createStatement();
      String sql = "UPDATE student SET studentName='古力娜扎' WHERE studentId='202104'";
      int count = stmt.executeUpdate(sql);
      if(count>0){
        System.out.println("修改成功");
      }else{
        System.out.println("修改失败");
      }
    } catch (ClassNotFoundException e) {
      e.printStackTrace();
    } catch (SQLException throwables) {
      throwables.printStackTrace();
    }finally {
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
  }
}
