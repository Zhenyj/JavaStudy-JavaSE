package Section12IO.demo09ObjectStream;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

/**
 * @author zyj
 * @create 2021-04-28 9:10
 *
 * 练习:序列化集合
 * 当我们想在文件中保存多个对象的时候可以把多个对象存储到一个集合中对集合进序列化和反序列化
 *
 * 分析:
 * 1.定义一个存储Person对象的ArrayList集合
 * 2.往Arraylist集合中存储Person对象
 * 3.创建一个序列化流ObjectOutputStream对象
 * 4.使用ObjectOutputStream对象中的方法writeObject,对集合进行序列化
 * 5.创建一个反序列化objectInputStream对象
 * 6.使用objectInputStream对象中的方法readObject读取文件中保存的集合
 * 7.把object类型的集合转换为ArrayList类型
 * 8.遍历Arraylist集合
 * 9.释放资源
 */
public class Demo03ObjectStreamTest {

  public static void main(String[] args) throws IOException, ClassNotFoundException {
    // 1.定义一个存储Person对象的ArrayList集合
    ArrayList<Person> arr = new ArrayList<>();
    // 2.往Arraylist集合中存储Person对象
    for (int i = 0; i < 100; i++) {
      arr.add(new Person("甄英俊"+i,18));
    }
    // 3.创建一个序列化流ObjectOutputStream对象
    ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("high-code\\src\\Section12IO\\demo09ObjectStream\\b.txt"));
    // 4.使用ObjectOutputStream对象中的方法writeObject,对集合进行序列化
    oos.writeObject(arr);
    oos.flush();
    // 5.创建一个反序列化objectInputStream对象
    ObjectInputStream ois = new ObjectInputStream(new FileInputStream("high-code\\src\\Section12IO\\demo09ObjectStream\\b.txt"));
    // 6.使用objectInputStream对象中的方法readObject读取文件中保存的集合
    Object o = ois.readObject();
    // 7.把object类型的集合转换为ArrayList类型
    ArrayList<Person> personArrayList = (ArrayList<Person>) o;
    // 8.遍历Arraylist集合
    for(Person person : personArrayList){
      System.out.println(person);
    }
    // 9.释放资源
    ois.close();
    oos.close();
  }
}
