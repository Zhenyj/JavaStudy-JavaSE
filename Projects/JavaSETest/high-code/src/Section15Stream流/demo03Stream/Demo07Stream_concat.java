package Section15Stream流.demo03Stream;

import java.util.stream.Stream;

/**
 * @author zyj
 * @create 2021-05-22 20:21
 *
 */
public class Demo07Stream_concat {

  public static void main(String[] args) {
    //获取一个stream流
    String[] arr1 = {"美羊羊","喜洋洋","懒洋洋", "灰太狼", "红太狼"};
    String[] arr2 = {"迪丽热巴","马儿扎哈","雷霆嘎巴","古力娜扎","哈妮克孜"};
    Stream<String> stream1 = Stream.of(arr1);
    Stream<String> stream2 = Stream.of(arr2);
    Stream<String> stream = Stream.concat(stream1, stream2);
    stream.forEach((name)->{
      System.out.println(name);
    });
}
}
