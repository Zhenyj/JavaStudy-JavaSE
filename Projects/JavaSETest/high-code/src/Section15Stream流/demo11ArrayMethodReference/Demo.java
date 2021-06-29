package Section15Stream流.demo11ArrayMethodReference;

import java.util.Arrays;

/**
 * @author zyj
 * @create 2021-05-22 22:48
 *
 * 数组的构造器引用
 */
public class Demo {

  public static int[] builderArray(int length, ArrayBuilder ab){
    return ab.builderArray(length);
  }

  public static void main(String[] args) {
    int[] arr = builderArray(10,(length)->{
      return new int[length];
    });
    System.out.println(arr.length);
    System.out.println(Arrays.toString(arr));

    /**
     * 使用方法引用优化Lambda表达式
     * 己知创建的就是int[]数组
     * 数组的长度也是已知的就可以使用方法引用
     * int[]引用new,根据参数传递的长度来创建数组
     */
    arr = builderArray(20, int[]::new);
    System.out.println(arr.length);
    System.out.println(Arrays.toString(arr));
  }
}
