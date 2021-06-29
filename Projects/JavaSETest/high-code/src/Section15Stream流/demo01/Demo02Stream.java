package Section15Stream流.demo01;

import java.util.ArrayList;
import java.util.List;

/**
 * @author zyj
 * @create 2021-05-21 17:36
 *
 * 使用stream流的方式,遍历集合,对集合中的数据进行过滤
 * stream流是JDK1.8之后出现的
 * 关注的是做什么,而不是怎么做
 */
public class Demo02Stream {

  public static void main(String[] args) {
    //创建一个List集合,存储姓名
    List<String> list = new ArrayList<>();
    list.add("张无忌");
    list.add("周芷若");
    list.add("赵敏");
    list.add("张强");
    list.add("张三丰");

    //对list集合中的元素进行过滤,只要以张开头的元素,存储到一个新的集合中
    // 名字长度为3
    list.stream().filter((name)->{
      return name.startsWith("张");
    }).filter((name)->{
      return name.length()==3;
    }).forEach((name)->{
      System.out.println(name);
    });
  }
}
