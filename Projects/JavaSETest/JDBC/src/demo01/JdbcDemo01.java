package demo01;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

/**
 * @author zyj
 * @create 2021-05-30 17:19
 *
 * Connection :数据库连接对象
 * 功能∶
 * (1)获取执行sql的对象
 * statement createStatement()
 * PreparedStatement prepareStatement(String sql)
 * (2)管理事务:
 * 开启事务:setAutocommit(boolean autocommit):调用该方法设置参数为false，即开后事务
 * 提交事务:commit()
 * 回滚事务:rollback()
 *
 *
 * 3. statement:执行sql的对象
 * (1)．执行sql
 * boolean execute(string sql):可以执行任意的sql了解
 * int executeUpdate(string sql):执行DNL (insert、update、delete)语句、DDL(create,alter、drop)语句
 * 返回值:影响的行数，可以通过这个影响的行数判断DML语句是否执行成功返回值>o的则执行成功，反之，则失败。
 * ResultSet executeQuery(string sql):执行DQL(select)语句
 */
public class JdbcDemo01 {
  // 1.导入驱动jar包
  public static void main(String[] args) throws Exception {
    // 2.注册驱动 mysql5之后的jar包可以省略，但是不建议省略
//    Class.forName("com.mysql.cj.jdbc.Driver");

    // 3.获取数据库连接对象,jdbc:mysql://ip地址(或域名)/端口/数据库名称
    Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbctest", "root", "123456");

    // 4.定义sql语句
    String sql = "UPDATE student SET studentName='马尔扎哈' WHERE studentId='202104'";

    // 5.获取执行sql的对象 Statement
    Statement stmt = conn.createStatement();

    // 6.执行sql
    int count = stmt.executeUpdate(sql);

    // 7.处理结果
    System.out.println(count);

    // 8.释放资源
    stmt.close();
    conn.close();

  }
}
