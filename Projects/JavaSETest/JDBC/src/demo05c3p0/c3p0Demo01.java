package demo05c3p0;

import com.mchange.v2.c3p0.ComboPooledDataSource;
import java.sql.Connection;
import java.sql.SQLException;
import javax.sql.DataSource;

/**
 * @author zyj
 * @create 2021-06-01 22:51
 *
 * C3PO :数据库连接池技术步骤∶
 * 1．导入jar包（两个) c3po-0.9.5.2.jar mchange-commons-java-0.2.12.jar
 * 不要忘记导入数据库驱动jar包
 * 2．定义配置文件∶
 * 名称:c3po.properties或者c3po-config.xml
 * 路径:直接将文件放在src目录下即可。
 * 3．创建核心对象数据库连接池对象comboPooledDatasource
 * 4．获取连接: getConnection
 */
public class c3p0Demo01 {

  public static void main(String[] args) throws SQLException {
    // 1.创建数据库连接池对象
    DataSource ds = new ComboPooledDataSource();
    // 2.获取连接对象
    Connection conn = ds.getConnection();
    // 3
    System.out.println(conn);
  }
}
