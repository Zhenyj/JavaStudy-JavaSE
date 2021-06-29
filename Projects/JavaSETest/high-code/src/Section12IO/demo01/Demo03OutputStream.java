package Section12IO.demo01;

import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @author zyj
 * @create 2021-04-21 08:19
 *
 *追加写/续写:使用两个参数的构造方法
 * FileOutputStream(String name，boolean append)创建一个向具有指定name的文件中写入数据的输出文件流。
 * FileOutputStream(FiLe file，boolean append)创建一个向指定FiLe对象表示的文件中写入数据的文件输出流。
 * 参数:
 *    String name,File file:写入数据的目的地boolean append:追加写开关
 *    true:创建对象不会覆盖源文件,继续在文件的末尾追加写数据
 *    false:创建一个新文件,覆盖源文件
 */
public class Demo03OutputStream {

  public static void main(String[] args) throws IOException {
    // 追加写
    FileOutputStream fos = new FileOutputStream("high-code\\src\\Section12IO\\demo01\\c.txt",true);
    for (int i = 0; i < 10; i++) {
      fos.write("你好".getBytes());
      fos.write("\r\n".getBytes()); //换行
    }
    fos.close();
  }
}
