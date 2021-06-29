package Section15Stream流.demo10ConstrutorMethodReference;

/**
 * @author zyj
 * @create 2021-05-22 22:40
 *
 * 类的构造器(构造方法)引用
 */
public class Demo {

  // 定义一个方法,参数传递姓名和PersonBuilder接口
  public static void printPerson(String name,PersonBuilder pb){
    System.out.println(pb.builderPerson(name));
  };

  public static void main(String[] args) {
    printPerson("甄英俊", (name)->{
      return new Person(name);
    });

    /**
     * 使用方法引用优化Lambda表达式
     * 构造方法new Person(String name）已知
     * 创建对象已知 new
     * 就可以使用Person引用new创建对象
     */
    printPerson("马尔扎哈", Person::new);//使用Person类的带参构造方法,通过传递的姓名创建对象
  }
}
