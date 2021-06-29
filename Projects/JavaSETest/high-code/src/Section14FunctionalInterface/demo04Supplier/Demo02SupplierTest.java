package Section14FunctionalInterface.demo04Supplier;

import java.util.function.Supplier;

/**
 * @author zyj
 * @create 2021-05-19 10:431
 *
 * 使用supplier 接口作为方法参数类型，通过Lambda表达式求出int数组中的最大值。
 * 提示∶接口的泛型请使用java.lang.Integer类。
 */
public class Demo02SupplierTest {
  public static int getMax(Supplier<Integer> sup){
    return sup.get();
  }

  public static void main(String[] args) {
    int[] arr = {2,3,4,52,333,23};
    int res = getMax(()->{
      int max = arr[0];
      for (int i : arr) {
        max = max < i ? i :max;
      }
      return max;
    });
    System.out.println(res);
  }
}
