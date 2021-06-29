package Section18Annotation.demo04;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

/**
 * @author zyj
 * @create 2021-05-26 10:59
 */
@Pro(className = "Section18Annotation.demo04.Person", methodName = "eat")
public class Demo {

  public static void main(String[] args) throws Exception {
    /**
     * 前提:不能改变该类的任何代码。可以创建任意类的对象，可以执行任意方法
     */
    // 1.解析注解
    // 1.1获取该类的字节码文件对象
    Class<Demo> reflectClass = Demo.class;

    // 2.获取注解对象
    // 这段代码其实就是在内存中生成该注解的一个子类实现对象
    // getAnnotation获取注解位置的对象(Class对象,Method对象,Field对象)
    Pro annotation = reflectClass.getAnnotation(Pro.class);

    // 3.调用注解对象中定义的方法获取返回值
    // 相当于子类实现了方法,将注解上的赋值Section18Annotation.demo04.Person返回
    /**
     * public String className(){return "Section18Annotation.demo04.Person"}
     */
    String className = annotation.className();// 获取className
    String methodName = annotation.methodName(); //获取方法名

    // 4.加载该类进内存
    Class cls = Class.forName(className);

    // 5.创建对象
    Constructor constructor = cls.getConstructor(String.class, int.class);
    Object obj = constructor.newInstance("张三",18);

    // 6.获取方法对象
    Method eat = cls.getMethod("eat");

    // 7.调用方法
    eat.invoke(obj);
  }
}
