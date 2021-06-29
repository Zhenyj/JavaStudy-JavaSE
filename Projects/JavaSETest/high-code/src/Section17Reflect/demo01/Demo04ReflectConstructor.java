package Section17Reflect.demo01;

import java.lang.reflect.Constructor;

/**
 * @author zyj
 * @create 2021-05-26 10:15
 */
public class Demo04ReflectConstructor {

  public static void main(String[] args) throws Exception {
    // 获取person的class对象
    Class personClass = Person.class;
    // 获取构造方法数组
    Constructor[] constructors = personClass.getConstructors();
    for (Constructor constructor : constructors) {
      System.out.println(constructor);
    }
    System.out.println("===========");
    // 获取某个构造方法
    Constructor constructor = personClass.getConstructor(String.class);
    System.out.println(constructor);
    // 创建对象
    Object person = constructor.newInstance("张三");
    System.out.println(person);
    System.out.println("===========空参构造方法");
    Constructor constructor1 = personClass.getConstructor();
    System.out.println(constructor);
    Object person1 = constructor1.newInstance();
    System.out.println(person1);
  }
}
