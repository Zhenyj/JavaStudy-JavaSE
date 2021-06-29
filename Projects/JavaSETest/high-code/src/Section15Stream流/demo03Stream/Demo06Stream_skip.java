package Section15Stream流.demo03Stream;

import java.util.stream.Stream;

/**
 * @author zyj
 * @create 2021-05-22 20:21
 *
 * Stream流中的常用方法_skip:用于跳过元素
 * 如果希望跳过前几个元素，可以使用skip方法获取一个截取之后的新流:
 * Stream<T> skip( Long n);
 * 如果流的当前长度大于n，则跳过前n个﹔否则将会得到一个长度为e的空流。
 */
public class Demo06Stream_skip {

  public static void main(String[] args) {
    //获取一个stream流
    String[] arr = {"美羊羊","喜洋洋","懒洋洋", "灰太狼", "红太狼"};
    Stream<String> stream = Stream.of(arr);
    stream.skip(2).forEach((s)->{
      System.out.println(s);
    });
}
}
