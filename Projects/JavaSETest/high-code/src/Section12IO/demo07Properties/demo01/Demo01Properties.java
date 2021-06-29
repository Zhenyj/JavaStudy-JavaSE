package Section12IO.demo07Properties.demo01;

import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;
import java.util.Set;

/**
 * @author zyj
 * @create 2021-04-23 16:20
 *
 * java.util.Properties集合 extends Hashtable<k ,v>implements Map<k,v>
 * Properties类表示了一个持久的属性集。Properties可保存在流中或从流中加载。
 * Properties集合是一个唯一和IO流相结合的集合
 * 可以使用Properties集合中的方法store,把集合中的临时数据,持久化写入到硬盘中存储
 * 可以使用Properties集合中的方法Load,把硬盘中保存的文件(键值对),读取到集合中使用
 *
 * 属性列表中每个键及其对应值都是一个字符串。
 * Properties集合是一个双列集合,key和vaLue默认都是字符串
 */
public class Demo01Properties {

  public static void main(String[] args) throws IOException {
    show01();
    System.out.println("=============================");
    show02();
    System.out.println("=============================");
    show03();
  }

  /**
   * 可以使用Properties集合中的方法Load,把硬盘中保存的文件(键值对),读取到集合中使用void Load(InputStream inStream)
   * void load ( Reader reader)
   * 参数:
   * InputStream inStream:字节输入流,不能读取含有中文的键值对Reader reader:字符输入流,能读取含有中文的键值对
   * 使用步骤:
   * 1.创建Properties集合对象
   * 2.使用Properties集合对象中的方法Load读取保存键值对的文件
   * 3.遍历Properties集合
   *
   * 注意:
   * 1.存储键值对的文件中,键与值默认的连接符号可以使用-空格(其他符号)
   * 2.存储键值对的文件中,可以使用#进行注释,被注释的键值对不会再被读取
   * 3.存储键值对的文件中,键与值默认都是字符串,不用再加引|号
   */
  private static void show03() throws IOException {
    // 1.创建Properties集合对象
    Properties p = new Properties();
    // 2.使用Properties集合对象中的方法Load读取保存键值对的文件
    p.load(new FileReader("high-code\\src\\Section12IO\\demo07Properties\\demo01\\a.txt"));
    // 3.遍历Properties集合
    Set<String> set = p.stringPropertyNames();
    for (String s : set) {
      System.out.println(s+"-->"+p.getProperty(s));
    }
  }

  /**
   * 可以使用Properties集合中的方法store,把集合中的临时数据,持久化写入到硬盘中存储
   * void store (OutputStream out, String comments)
   * void store(writer writer, string comments)
   * 参数:
   * OutputStream out:字节输出流,不能写入中文writer writer:字符输出流,可以写中文
   * string comments:注释,用来解释说明保存的文件是做什么用的,不能使用中文,会产生乱码,黑默认是unicode编码,一般使用空字符串
   */
  private static void show02() {
    Properties p = new Properties();
    p.setProperty("迪丽热巴", "168");
    p.setProperty("古力娜扎", "169");
    p.setProperty("雷霆嘎巴", "175");

    FileWriter fw = null;
    FileOutputStream fos = null;
    try {
      //字符流
      fw = new FileWriter("high-code\\src\\Section12IO\\demo07Properties\\demo01\\a.txt");
      p.store(fw, "");
      // 字节流
      fos = new FileOutputStream("high-code\\src\\Section12IO\\demo07Properties\\demo01\\a.txt", true);
      p.store(fos, "");
    } catch (IOException e) {
      e.printStackTrace();
    } finally {
      if (fw != null) {
        try {
          fw.close();
        } catch (IOException e) {
          e.printStackTrace();
        }
      }
      if (fos != null) {
        try {
          fos.close();
        } catch (IOException e) {
          e.printStackTrace();
        }
      }
    }


  }

  /**
   * 使用Properties集合存储数据,遍历取出Properties集合中的数据
   * Properties集合是一个双列集合,key和vaLue默认都是字符串
   * Properties集合有一些操作字符串的特有方法
   * object setProperty(String key,String value）调用Hashtable 的方法put。
   * string getProperty(String key)通过key找到vaLue值,此方法相当于Map集合中的get(key)方法
   * Set<String> stringPropertyNames()返回此属性列表中的键集，其中该键及其对应值是字符串,此方法相当于Nap集合中的keySet方法
   */
  private static void show01() {
    Properties p = new Properties();
    p.setProperty("迪丽热巴", "168");
    p.setProperty("古力娜扎", "169");
    p.setProperty("雷霆嘎巴", "175");
    // 遍历
    Set<String> set = p.stringPropertyNames();
    for (String s : set) {
      System.out.println(s + "-->" + p.getProperty(s));
    }
  }
}
