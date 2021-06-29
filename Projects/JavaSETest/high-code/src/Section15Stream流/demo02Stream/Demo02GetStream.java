package Section15Stream流.demo02Stream;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.stream.Stream;

/**
 * @author zyj
 * @create 2021-05-22 18:41
 *
 * java.util.stream.Stream<T>是Java 8新加入的最常用的流接口。(这并不是一个函数式接口。)
 * 获取一个流非常简单，有以下几种常用的方式:
 * -所有的collection集合都可以通过stream黑认方法获取流;
 * default stream<E> stream (
 * - stream接口的静态方法of可以获取数组对应的流。
 * static <T> Stream<T> of (T... values)参数是一个可变参数,那么我们就可以传递一个数组
 */
public class Demo02GetStream {

  public static void main(String[] args) {
    // 把集合转换为Stream流
    List<String> list = new ArrayList<>();
    Stream<String> steam1 = list.stream();

    Set<String> set = new HashSet<>();
    Stream<String> stream2 = set.stream();

    // Map需要先转换成单列集合才能转换成流
    Map<String,String> map = new HashMap<>();
    // 获取键，存储到set集合
    Set<String> keySet = map.keySet();
    Stream<String> stream3 = keySet.stream();

    // 获取值，存储到Collection
    Collection<String> values = map.values();
    Stream<String> stream4 = values.stream();

    // 获取键值对(键与值的映射关系entrySet)
    Set<Entry<String, String>> entries = map.entrySet();
    Stream<Entry<String, String>> stream5 = entries.stream();

    // 将数组转换成流
    Stream<Integer> stream6 = Stream.of(1, 2, 3, 4, 5);
    // 可变参数传递数组
    Integer[] arr = {1,2,3,4,5};
    Stream<Integer> stream7 = Stream.of(arr);
  }
}
