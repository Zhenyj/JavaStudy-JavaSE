package Section17Reflect.demo01;

/**
 * @author zyj
 * @create 2021-05-26 10:46
 *
 * 获取class对象的方式:
 * 1. Class.forName("全类名"):将字节码文件加载进内存，返回class对象
 * 多用于配置文件，将类名定义在文件中。读取文件，加载类。例如Spring配置文件中的bean对象
 * 2．类名.class:通过类名的属性class获取
 * 多用于参数传递
 * 3．对象.getClass(): getClass()方法在object类中定义着。
 * 多用于对象获取字节码的方式
 */
public class Demo01ReflectClass {

  public static void main(String[] args) throws Exception {
    // 1.Class.forName("全类名")
    Class personClass1 = Class.forName("Section17Reflect.demo01.Person");
    System.out.println(personClass1);
    // 2.类名.class
    Class personClass2 = Person.class;
    System.out.println(personClass2);
    // 3.对象.getClass()
    Class personClass3 = new Person().getClass();
    System.out.println(personClass3);
    /**
     * 因为同一个字节码文件只会被加载一次，所以3种方法获取的都是同一个Class对象
     */
    System.out.println(personClass1==personClass2);
    System.out.println(personClass2==personClass3);
  }
}
