package Section14FunctionalInterface.demo04Supplier;

import java.util.function.Supplier;

/**
 * @author zyj
 * @create 2021-05-19 10:34
 *
 * 常用的丞屠式接口
 * java.util.function.SuppLier<T>接口仅包含一个无参的方法:T get()。用来获取一个泛型参数指定类型的对象数据。
 * Supplier<T>接口被称之为生产型接口,指定接口的泛型是什么类型,那么接口中的get方法就会生产什么类型的数据
 */
public class Demo01Supplier {
  //定义一个方法,方法的参数传递supplier<T>接口,泛型执行string,get方法就会返回一个String
  public static String getString(Supplier<String> sup){
    return sup.get();
  }

  public static void main(String[] args) {
    //调用getString方法,方法的参数Supplier是一个函数式接口,所以可以传递Lambda表达式
//    String s = getString(()->{
//      // 生产一个字符串并返回
//      return "123";
//    });
    // 优化后的Lambda
    String s = getString(()->"123");
    System.out.println(s);
  }
}
