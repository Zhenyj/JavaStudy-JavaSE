package day08.staticCode;

/**
 * @author zyj
 * @create 2020-12-17 11:27
 *
 *
 */
public class Person {
  /**
   * 静态代码块
   *
   * 特点：
   *    当第一次用到本类时，静态代码块执行唯一的一次。
   *    静态内容总是优先于非静态，所以静态代码块比构造方法先执行。
   */
  static {
    System.out.println("静态代码块执行！");
  }

  Person(){
    System.out.println("构造方法执行！");
  }
}
