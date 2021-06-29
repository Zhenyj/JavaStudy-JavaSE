package day08.staticCode;

/**
 * @author zyj
 * @create 2020-12-17 11:26
 *
 */
public class Demo01Static {
  public static void main(String[] args) {
      /**
       * 静态代码块
       *
       * 特点：
       *    当第一次用到本类时，静态代码块执行唯一的一次。
       *    静态内容总是优先于非静态，所以静态代码块比构造方法先执行。
       * 用途：
       *    用来一次性对静态成员变量赋值
       */
      Person one = new Person();
      Person two = new Person();
  }
}
