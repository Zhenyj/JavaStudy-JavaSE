package Section17Reflect.demo01;

import java.lang.reflect.Field;

/**
 * @author zyj
 * @create 2021-05-26 10:15
 */
public class Demo02ReflectField {

  public static void main(String[] args) throws Exception {
    // 获取person的class对象
    Class personClass = Person.class;
    // Field[] getFields()方法获取所有public变量
    Field[] fields = personClass.getFields();
    for (Field f :fields){
      System.out.println(f);
    }

    System.out.println("=============");
    Field a = personClass.getField("a");
    // 获取成员变量a的值
    Person p = new Person();
    Object value = a.get(p);
    System.out.println("a-->"+value);
    // 设置a的值
    a.set(p, "张三");
    System.out.println(p);
    System.out.println("=============");
    //Field[] getDeclaredFields() 获取所有成员变量
    Field[] declaredFields = personClass.getDeclaredFields();
    for (Field declaredField : declaredFields) {
      System.out.println(declaredField);
    }
    // Field getDeclaredField(String name)
    Field name = personClass.getDeclaredField("name");
    // 忽略访问权限修饰符的安全检查，不然访问private会报错
    name.setAccessible(true);// 暴力反射
    Object value2 = name.get(p);
    System.out.println("name-->"+value2);
  }
}
