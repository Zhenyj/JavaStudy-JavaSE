package Section15Stream流.demo03Stream;

import java.util.stream.Stream;

/**
 * @author zyj
 * @create 2021-05-22 18:57
 */
public class Demo02Stream_Filter {

  public static void main(String[] args) {
    Stream<String> stream = Stream.of("张三丰","张翠山","赵敏","张无忌","周芷若");

    /**
     * stream流属于管道流,只能被消费(使用)一次
     * 第一个stream流调用完毕方法,数据就会流转到下一个stream上而这时第一个stream流已经使用完毕,就会关闭了
     * 所以第一个stream流就不能再调用方法了
     */
//    Stream steam2 = stream.filter((name)->{
//       return name.startsWith("张");
//    });
//
//    steam2.forEach((name)->{
//      System.out.println(name);
//    });


    stream.filter((name)->{
      return name.startsWith("张");
    }).forEach((name)->{
      System.out.println(name);
    });
  }
}
