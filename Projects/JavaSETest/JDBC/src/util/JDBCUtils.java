package util;

import java.io.FileReader;
import java.io.IOException;
import java.net.URL;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

/**
 * @author zyj
 * @create 2021-05-30 21:16
 *
 * 抽取出jdbc工具类,简化代码
 */
public class JDBCUtils {
  private static String url;
  private static String user;
  private static String password;
  private static String driver;

  /**
   * 文件读取，只读一次即可，所以用静态代码块,并对成员变量进行初始化
   */
  static {
    // 读取资源,获取值
    try {
      Properties pro = new Properties();
      // 动态获取src路径下的文件方式--->ClassLoader类加载器
      ClassLoader classLoader = JDBCUtils.class.getClassLoader();
      URL resource  = classLoader.getResource("jdbc.properties");
      String path = resource.getPath();
//      pro.load(new FileInputStream("F:JDBC\\src\\jdbc.properties"));
      pro.load(new FileReader(path));
      url = pro.getProperty("url");
      user = pro.getProperty("user");
      password = pro.getProperty("password");
      driver = pro.getProperty("driver");
      // 注册驱动
      Class.forName(driver);
    } catch (IOException e) {
      e.printStackTrace();
    } catch (ClassNotFoundException e) {
      e.printStackTrace();
    }
  }
  /**
   * 获取连接对象
   * @return 连接端详
   */
  public static Connection getConnection(){
    try {
      return DriverManager.getConnection(url, user, password);
    } catch (SQLException throwables) {
      throwables.printStackTrace();
    }
    return null;
  }


  public static void close(Statement stmt,Connection conn){
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

  public static void close(ResultSet rs,Statement stmt,Connection conn){
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
