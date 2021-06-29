package Section17Reflect.demo02Example;

import java.io.InputStream;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.Properties;

/**
 * @author zyj
 * @create 2021-05-26 10:59
 *
 * 写一个"框架"，不能改变该类的任何代码的前提下，可以帮我们创建任意类的对象，并且执行其中任意方法工
 *
 * 实现︰
 * 1．配置文件
 * 2．反射
 *
 * 步骤︰
 * 1．将需要创建的对象的全类名和需要执行的方法定义在配置文件中
 * 2．在程序中加载读取配霆文件
 * 3．使用反射技术来加载类文件进内存
 * 4．创建对象
 * 5．执行方法
 */
public class Demo {

  public static void main(String[] args) throws Exception {
    // 1.加载配置文件
    // 1.1 创建Properties对象
    Properties pro = new Properties();
    // 1.2下载配置文件，转换为一个集合Map
    // 1.2.1 获取class目录下配置文件
    ClassLoader classLoader = Demo.class.getClassLoader();
    InputStream is = classLoader.getResourceAsStream("\\Section17Reflect\\pro.properties");
    pro.load(is);

    // 获取配置文件中定义的数据
    String className = pro.getProperty("className");
    String methodName = pro.getProperty("methodName");

    // 3.加载类进内存
    Class cls = Class.forName(className);

    // 4.获取构造方法并创建对象
    Constructor constructor = cls.getConstructor(String.class,int.class);
    Object o = constructor.newInstance("马尔扎哈", 66);

    // 5.获取方法对象
    Method method = cls.getMethod("eat");

    // 6.执行方法
    method.invoke(o);
  }
}
