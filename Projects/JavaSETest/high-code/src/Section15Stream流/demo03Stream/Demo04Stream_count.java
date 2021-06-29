package Section15Stream流.demo03Stream;

import java.util.ArrayList;
import java.util.stream.Stream;

/**
 * @author zyj
 * @create 2021-05-22 20:21
 *
 * Stream流中的常用方法_count:用于统计stream流中元素的个数
 * long count();
 * count方法是一个终结方法,返回值是一个Long类型的整数
 * 所以不能再继续调用stream流中的其他方法了
 */
public class Demo04Stream_count {

  public static void main(String[] args) {
    // 获取一个Stream流
    ArrayList<Integer> list  = new ArrayList<>();
    list.add(1);
    list.add(2);
    list.add(3);
    list.add(4);
    list.add(5);
    list.add(6);
    Stream<Integer> stream = list.stream();
    long count = stream.count();
    System.out.println(count);
  }
}
