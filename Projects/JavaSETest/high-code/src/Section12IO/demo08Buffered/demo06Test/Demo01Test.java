package Section12IO.demo08Buffered.demo06Test;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

/**
 * @author zyj
 * @create 2021-04-25 19:18
 *
 * 练习:
 * 对文本的内容进行排序
 * 按照(1,2,3....)顺序排序
 * 分析:
 * 1.创建一个HashMap集合对象,可以:存储每行文本的序号(1,2,3,..);value:存储每行的文本
 * 2.创建字符缓冲输入流对象,构造方法中绑定字符输入流
 * 3.创建字符缓冲输出流对象,构造方法中绑定字符输出流
 * 4.使用字符缓冲输入流中的方法readline,逐行读取文本
 * 5.对读取到的文本进行切割,获取行中的序号和文本内容
 * 6.把切割好的序号和文本的内容存储到HashMap集合中(key序号是有序的,会自动排序1,2,3,4..)
 * 7.遍历HashMap集合,获取每一个键值对
 * 8.把每一个键值对,拼接为一个文本行
 * 9.把拼接好的文本,使用字符缓冲输出流中的方法write,写入到文件中
 * 10.释放资源
 */
public class Demo01Test {

  public static void main(String[] args) throws IOException {
    // 1.创建一个HashMap集合对象,可以:存储每行文本的序号(1,2,3,..);value:存储每行的文本
    Map<String, String> map = new HashMap<>();
    // 2.创建字符缓冲输入流对象,构造方法中绑定字符输入流
    // 3.创建字符缓冲输出流对象,构造方法中绑定字符输出流
    FileReader fis = new FileReader("high-code\\src\\Section12IO\\demo08Buffered\\in.txt");
    FileWriter fos = new FileWriter("high-code\\src\\Section12IO\\demo08Buffered\\out.txt");

    BufferedWriter bw = new BufferedWriter(fos);
    BufferedReader br = new BufferedReader(fis);
    // 4.使用字符缓冲输入流中的方法readLine,逐行读取文本
    String line = null;
    while ((line = br.readLine()) != null) {
      // 5.对读取到的文本进行切割,获取行中的序号和文本内容
      String key = line.substring(0, 1);
      String value = line.substring(1, line.length());
      // 6.把切割好的序号和文本的内容存储到HashMap集合中(key序号是有序的,会自动排序1,2,3,4..)
      map.put(key, value);
    }
    // 7.遍历HashMap集合,获取每一个键值对
    for (String key : map.keySet()) {
      // 8.把每一个键值对,拼接为一个文本行
      String newLine = key + map.get(key);
      // 9.把拼接好的文本,使用字符缓冲输出流中的方法write,写入到文件中
      bw.write(newLine);
      bw.newLine();
    }
    bw.flush();
    // 10.释放资源
    br.close();
    bw.close();
  }
}
