package Section15Stream流.demo04StreamTest;

import java.util.ArrayList;
import java.util.stream.Stream;

/**
 * @author zyj
 * @create 2021-05-22 20:53
 * 集合元素的处理(Stream流方式)
 */
public class Demo02Stream {

  public static void main(String[] args) {
    //第一支队伍
    ArrayList<String> one = new ArrayList<>();
    one.add("迪丽热巴");
    one.add("宋远桥");
    one.add("苏星河");
    one.add("石破天");
    one.add("石中玉");
    one.add("老子");
    one.add("庄子");
    one.add("洪七公");

    Stream<String> stream1 = one.stream();
    Stream<String> stream2 = stream1.filter((name)->{
      return name.length()==3;
    }).limit(3);

    //第二支队伍
    ArrayList<String> two = new ArrayList<>();
    two.add("古力娜扎");
    two.add("张无忌");
    two.add("赵丽颖");
    two.add("张三丰");
    two.add("尼古拉斯赵四");
    two.add("张天爱");
    two.add("张二狗");
    Stream<String> stream3 = two.stream();
    Stream<String> stream4 = stream3.filter((name)->{
      return name.startsWith("张");
    }).skip(2);

    Stream<String> stream = Stream.concat(stream2, stream4);
    ArrayList<Person> arr = new ArrayList<>();
    stream.forEach((name)->{
      arr.add(new Person(name));
    });

    for(Person person : arr){
      System.out.println(person);
    }
  }
}
