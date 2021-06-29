package Section15Stream流.demo08SuperMethodReference;

/**
 * @author zyj
 * @create 2021-05-22 22:21
 *
 * 定义子类
 */
public class Man extends Human {
  // 重写sayHello方法
  @Override
  public void sayHello(){
    System.out.println("Hello 我是Man");
  }

  // 定义一个方法传递Greetable接口
  public void method(Greetable g){
    g.greet();
  }

  public void show(){
    //调用method方法，方法的参数Greetable是一个函数式接口,所以可以传递Lambda
    method(()->{
      // 创建Human对象
      Human h = new Human();
      // 调用父类的sayHello方法
      h.sayHello();
    });

    //因为有子父类关系,所以存在的一个关键字super,代表父类,所以我们可以直接使用super调用父类的成员方法
    method(()->{
      super.sayHello();
    });

    // 父类方法的引用
    method(super::sayHello);
  }

  public static void main(String[] args) {
    new Man().show();
  }
}
