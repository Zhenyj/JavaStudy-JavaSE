package demo05c3p0;

import com.mchange.v2.c3p0.ComboPooledDataSource;
import java.sql.Connection;
import java.sql.SQLException;
import javax.sql.DataSource;
import org.junit.Test;

/**
 * @author zyj
 * @create 2021-06-01 22:51
 */
public class c3p0Demo02 {

  public static void main(String[] args) throws SQLException {
    // 1.获取DataSource
    DataSource ds = new ComboPooledDataSource();
    // 2.获取连接
    for (int i = 0; i < 10; i++) {
      Connection conn = ds.getConnection();
      System.out.println(conn);

      if (i == 5) {
        // 在此处不是关闭流，而是将连接归还到连接池中
        conn.close(); // 归还连接到连接池中
      }
    }
  }

  @Test
  public void testNamedConfig() throws SQLException {
    // 1.1获取指定名称的配置,一般使用默认的
    DataSource ds = new ComboPooledDataSource("otherc3p0");
    // 2.获取连接
    for (int i = 0; i < 10; i++) {
      Connection conn = ds.getConnection();
      System.out.println(conn);
    }
  }
}
