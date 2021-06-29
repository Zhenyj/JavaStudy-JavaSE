package Section12IO.demo09ObjectStream;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

/**
 * @author zyj
 * @create 2021-04-27 17:18
 *
 * java.io.ObjectInputStream extends InputStream
 * ObjectInputStream:对象的反序列化流
 * 作用:把文件中保存的对象,以流的方式读取出来使用构造方法:
 * objectInputStream(InputStream in)创建从指定InputStream 读取的ObjectInputStream。
 * 参数:
 * InputStream in:字节输入流
 * 特有的成员方法:
 * object readObject()从ObjectInputStream读取对象。
 *
 * 使用步骤:
 * 1.创建ObjectInputStream对象,构造方法中传递字节输入流
 * 2.使用ObjectInputStream对象中的方法readObject读取保存对象的文件
 * 3.释放资源
 * 4.使用读取出来的对象(打印)
 */
public class Demo02ObjectInputStream {

  public static void main(String[] args) {
    ObjectInputStream ois=null;
    try{
      // 1.创建ObjectInputStream对象,构造方法中传递字节输入流
      ois = new ObjectInputStream(new FileInputStream("high-code\\src\\Section12IO\\demo09ObjectStream\\a.txt"));
      // 2.使用ObjectInputStream对象中的方法readObject读取保存对象的文件
      Object o;
      while ((o = ois.readObject())!=null){
        Person person = (Person)o;
        System.out.println(person);
      }
    }catch (IOException e){
      e.printStackTrace();
    } catch (ClassNotFoundException e){
      e.printStackTrace();
    }finally {
      // 3.释放资源
      try {
        if(ois!=null){
          ois.close();
        }
      } catch (IOException e) {
        e.printStackTrace();
      }
    }
  }
}
