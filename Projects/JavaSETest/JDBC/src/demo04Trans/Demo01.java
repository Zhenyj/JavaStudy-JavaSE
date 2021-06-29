package demo04Trans;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import util.JDBCUtils;

/**
 * @author zyj
 * @create 2021-05-31 20:40
 *
 * jdbc事务
 */
public class Demo01 {

  public static void main(String[] args) {
    Connection conn = null;
    PreparedStatement pstmt = null;
    try {
      // 获取连接
      conn = JDBCUtils.getConnection();
      // 开启事务
      conn.setAutoCommit(false);// 是否自动提交事务，false-->开启事务
      // 定义sql
      String sql = "UPDATE student SET password = ? WHERE studentId = ?";
      // 获取执行对象
      pstmt = conn.prepareStatement(sql);
      // 4.赋值sql的?
      pstmt.setString(1, "123");
      pstmt.setString(2, "202101");
      int count = pstmt.executeUpdate();
      if(count>0){
        System.out.println("更新成功");
      }else{
        System.out.println("更新失败");
      }
      // 提交事务
      conn.commit();
    } catch (Exception e) {
      // 有异常回滚
      try {
        if(conn!=null){
          conn.rollback();
        }
      } catch (SQLException throwables) {
        throwables.printStackTrace();
      }
      e.printStackTrace();
    }finally {
      JDBCUtils.close(pstmt, conn);
    }
  }
}
