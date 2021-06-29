package Section12IO.demo09ObjectStream;

import java.io.Serializable;

/**
 * @author zyj
 * @create 2021-04-27 17:20
 *
 * 序列化和反序列化的时候,会抛出NotSerializableException没有序列化异常
 * 类通过实现 java.io.Serializable接口以启用其序列化功能。未实现此接口的类将无法使其任何状态序列化或反序列化。
 *
 * Serializable接口也叫标记型接口
 * 要进行序列化和反序列化的类必须实现Serializable接口,就会给类添加一个标记
 * 当我们进行序列化和反序列化的时候,就会检测类上是否有这个标记
 * 有:就可以序列化和反序列化
 * 没有:就会抛出NotSerializableException异常
 *
 * static关键字:静态关键字
 * 静态优先于非静态加载到内存中(静态优先于对象进入到内存中)被static修饰的成员变量不能被序列化的,序列化的都是对象
 * private static int age;
 * oos.writeObject(new Person("甄英俊",18));
 * object o = ois.readObject();
 * Person{name="甄英俊",age=null} age就不是写入的18而是静态成员变量的默认值
 *
 * transient关键字:瞬态关键字
 * 被transient修饰成员变量,不能被序列化,如果不想成员变量被序列化可以加transient关键字,效果和static类似但没有静态的含义
 */
public class Person implements Serializable {

  // 设置序列化的序列号,防止序列化后对类进行修改后抛出InvalidClassException异常
  private static final long serialVersionUID = 1L;

  private String name;
  private Integer age;
//  private static Integer age;
//  private transient Integer age;

  public Person() {
  }

  public Person(String name, Integer age) {
    this.name = name;
    this.age = age;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Integer getAge() {
    return age;
  }

  public void setAge(Integer age) {
    this.age = age;
  }

  @Override
  public String toString() {
    return "Person{" +
        "name='" + name + '\'' +
        ", age=" + age +
        '}';
  }
}
