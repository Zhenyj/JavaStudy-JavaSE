package Section15Stream流.demo03Stream;

import java.util.stream.Stream;

/**
 * @author zyj
 * @create 2021-05-22 18:52
 *
 * Stream流中的常用方法forEach
 * void forEach(Consumer< ? super T> action );
 * 该方法接收一个consumer接口函数，会将每一个流元素交给该函数进行处理。
 * Consumer接口是一个消费型的函数式接口,可以传递Lambda表达式,消费数据
 *
 * 简单记:
 * forEach方法,用来遍历流中的数据
 * 是一个终结方法,遍历之后就不能组续卖调用stream流中的其他方法,即返回值不是流对象
 */
public class Demo01Stream_forEach {

  public static void main(String[] args) {
    Stream<String> stream = Stream.of("雷霆嘎巴","马尔扎哈","迪丽热巴","古力娜扎");
    stream.forEach((s)->{
      System.out.println(s);
    });
  }
}
