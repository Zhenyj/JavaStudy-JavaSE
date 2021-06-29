package Section12IO.demo08Buffered.demo07转换流;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author zyj
 * @create 2021-04-26 15:44
 *
 * java.io.InputStreamReader extends Reader
 * InputStreamReader:是字节流通向字符流的桥梁:它使用指定的charset 读取字节并将其解码为字符。(解码:把看不懂的变成能看懂的
 *
 * 继承自父类的共性成员方法:
 * int read()读取单个字符并返回。
 * int read(char[] cbuf)一次读取多个字符,将字符读入数组。
 * void close()关闭该流并释放与之关联的所有资源。
 *
 * 构造方法:
 * InputStreamReader(InputStream in)创建一个使用黑认字符集的InputStreamReader
 * InputStreamReader(InputStream in,String charsetName)创建使用指定字符集的InputStreamReader。
 * 参数:
 * InputStream in:字节输入流,用来读取文件中保存的字节
 * string charsetName:指定的编码表名称,不区分大小写,可以是utf-8/UTF-8,gbk/GBK]...不指定默认使用IDE的默认编码
 *
 * 使用步骤:
 * 1.创建InputStreamReader对象,构造方法中传递字节输入流和指定的编码表名称
 * 2.使用InputStreamReader对象中的方法read读取文件
 * 3.释放资源
 *
 * 注意事项:
 * 构造方法中指定的编码表名称要和文件的编码相同,否则会发生乱码。
 */
public class Demo02InputStreamReader {

  public static void main(String[] args) throws IOException {
    read_utf_8();
    System.out.println("==========================");
    read_gbk();
  }

  private static void read_gbk() throws IOException {
    {
      // 1.创建InputStreamReader对象,构造方法中传递字节输入流和指定的编码表名称
      FileInputStream fis = new FileInputStream("high-code\\src\\Section12IO\\demo08Buffered\\d.txt");
      InputStreamReader isr = new InputStreamReader(fis,"GBK");
//      InputStreamReader isr = new InputStreamReader(fis);
      // 2.使用InputStreamReader对象中的方法read读取文件
      char[] chars = new char[1024];
      int len = -1;
      while ((len = isr.read(chars)) != -1){
        System.out.println(new String(chars,0,len));
      }

      // 3.释放资源
      isr.close();
    }
  }

  private static void read_utf_8() throws IOException {
    // 1.创建InputStreamReader对象,构造方法中传递字节输入流和指定的编码表名称
    FileInputStream fis = new FileInputStream("high-code\\src\\Section12IO\\demo08Buffered\\c.txt");
    InputStreamReader isr = new InputStreamReader(fis,"UTF-8");

    // 2.使用InputStreamReader对象中的方法read读取文件
    char[] chars = new char[1024];
    int len = -1;
    while ((len = isr.read(chars)) != -1){
      System.out.println(new String(chars,0,len));
    }

    // 3.释放资源
    isr.close();
  }
}
