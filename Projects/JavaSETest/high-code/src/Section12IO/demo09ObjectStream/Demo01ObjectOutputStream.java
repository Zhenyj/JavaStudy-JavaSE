package Section12IO.demo09ObjectStream;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

/**
 * @author zyj
 * @create 2021-04-27 17:18
 *
 * java.io.ObjectOutputStream extends OutputStream
 * ObjectOutputStream：对象的序列化流
 * 作用:把对象以流的方式写入到文件中保存
 * 构造方法:
 * ObjectOutputStream(OutputStream out〉创建写入指定OutputStream的 ObjectOutputStream参数:
 * OutputStream out:字节输出流
 * 特有的成员方法:
 * void writeObject(object obj）将指定的对象写入ObjectOutputStream。
 * 使用步骤:
 * 1.创建ObjectOutputStream对象,构造方法中传递字节输出流
 * 2.使用ObjectOutputStream对象中的方法writeObject,把对象写入到文件中
 * 3.释放资源
 */
public class Demo01ObjectOutputStream {

  public static void main(String[] args) throws IOException {
    // 1.创建ObjectOutputStream对象,构造方法中传递字节输出流
    FileOutputStream fos = new FileOutputStream("high-code\\src\\Section12IO\\demo09ObjectStream\\a.txt");
    ObjectOutputStream oos = new ObjectOutputStream(fos);
    // 2.使用ObjectOutputStream对象中的方法writeObject,把对象写入到文件中
    for (int i = 0; i < 10; i++) {
      Person person = new Person("甄英俊"+i,18);
      oos.writeObject(person);
    }
    //解决EOF的关键，加入一个空的对象,可以解决ObjectInputSteam.readObject循环时出现的EOFException
    oos.writeObject(null);
    oos.flush();
    // 3.释放资源
    oos.close();
  }
}
