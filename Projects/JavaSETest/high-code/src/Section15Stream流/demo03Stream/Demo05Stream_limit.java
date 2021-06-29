package Section15Stream流.demo03Stream;

import java.util.stream.Stream;

/**
 * @author zyj
 * @create 2021-05-22 20:21
 *
 * Stream流中的常用方法_limit:用于截取流中的元素limit方法可以对流进行截取,只取用前n个。
 * 方法签名:Stream<T> limit(Long maxsize);
 * 参数是一个Long型，如果集合当前长度大于参数则进行截取;否则不进行操作
 * Limit方法是一个延迟方法,只是对流中的元素进行截取,返回的是一个新的流,所以可以继续调用Stream流中的其他方法
 */
public class Demo05Stream_limit {

  public static void main(String[] args) {
    // 获取一个Stream流
    String[] arr = {"迪丽热巴","马儿扎哈","雷霆嘎巴","古力娜扎","哈妮克孜"};
    Stream<String> stream = Stream.of(arr);
    Stream<String> stream2 = stream.limit(3);
    stream2.forEach((s)->{
      System.out.println(s);
    });
  }
}
