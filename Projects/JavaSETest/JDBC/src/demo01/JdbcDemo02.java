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
 * 添加记录
 */
public class JdbcDemo02 {

  public static void main(String[] args) {
    Connection conn = null;
    Statement stmt = null;
    try {
      Class.forName("com.mysql.cj.jdbc.Driver");
      conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbctest", "root", "123456");
      stmt = conn.createStatement();
      String sql = "INSERT INTO student VALUES('202105','雷霆嘎巴')";
      int count = stmt.executeUpdate(sql);
      if(count==1){
        System.out.println("插入成功");
      }else{
        System.out.println("插入失败");
      }
    } catch (ClassNotFoundException e) {
      e.printStackTrace();
    } catch (SQLException throwables) {
      throwables.printStackTrace();
    }finally {
      // 资源最好在finally释放资源，避免内存泄露
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
