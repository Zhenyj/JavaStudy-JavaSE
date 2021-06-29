package demo01;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * @author zyj
 * @create 2021-05-30 19:06
 *
 * Resultset结果集对象,封装查询结果
 * next():游标向下移动一行，并判断当前行是否是最后一行末尾（是否有数据）
 * getXxx(参数):获取数据
 * xxx:代表数据类型如:int getInt() , string getstring()*参数∶
 * 1. int :代表列的编号,从1开始如: getString(1)
 * 2. String :代表列名称。如: getDouble("balance")
 */
@SuppressWarnings("All")
public class JdbcDemo05 {

  public static void main(String[] args) {
    Connection conn = null;
    Statement stmt = null;
    ResultSet resultSet = null;
    try{
      Class.forName("com.mysql.cj.jdbc.Driver");
      conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbctest", "root", "123456");
      stmt = conn.createStatement();
      String sql = "SELECT studentId,studentName FROM student";
      resultSet = stmt.executeQuery(sql);
      // 处理结果
      // 让游标向下移动一行，并判断当前行是否是最后一行末尾（是否有数据）
      while (resultSet.next()){
        String studentName = resultSet.getString("studentName");
        String studentId = resultSet.getString("studentId");
        System.out.println(studentId+"-->"+studentName);
      }
    } catch (ClassNotFoundException e) {
      e.printStackTrace();
    } catch (SQLException throwables) {
      throwables.printStackTrace();
    }finally {
      if(resultSet !=null){
        try {
          resultSet.close();
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
  }
}
