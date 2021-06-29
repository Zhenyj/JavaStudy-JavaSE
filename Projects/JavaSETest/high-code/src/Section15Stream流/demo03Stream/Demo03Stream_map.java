package Section15Stream流.demo03Stream;

import java.util.stream.Stream;

/**
 * @author zyj
 * @create 2021-05-22 19:04
 *
 * 如果需要将流中的元素映射到另一个流中，可以使用map方法.
 * <R>Stream<R> map(Function<? super T, ? extends R> mapper);
 * 该接口需要一个Function函数式接口参数，可以将当前流中的7类型数据转换为另一种R类型的流。Function中的抽象方法:
 * apply(T t);
 */
public class Demo03Stream_map {

  public static void main(String[] args) {
    //获取一个string类型的stream流
    Stream<String> stream = Stream.of("1","2","3","4");
    // 使用map方法,把字符串类型的整数,转换(映射)为Integer类型的整数
    stream.map((s)->{
      return Integer.parseInt(s);
    }).forEach((i)->{
      System.out.println(i.getClass().getName()+"-->"+i);
    });

  }
}
