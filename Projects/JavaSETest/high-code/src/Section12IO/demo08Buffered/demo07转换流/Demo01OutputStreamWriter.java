package Section12IO.demo08Buffered.demo07转换流;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;

/**
 * @author zyj
 * @create 2021-04-26 15:33
 *
 * java.io.OutputStreamWriter extends writer
 * OutputStreamWriter:是字符流通向字节流的桥梁﹔可使用指定的charset将要写入流中的字符编码成字节。(编码:把能看懂的变成看不懂)
 *
 * 继续自父类的共性成员方法:
 * - void write(int c)写入单个字符。- void write(char[]cbuf)写入字符数组。
 * - abstract void write(char[ ] cbuf，int off, int len)写入字符数组的某一部分,off数组的开始索引,Len写的字符个数。
 * - void write( String str)写入字符串。
 * - void write(String str，int off， int len)写入字符串的某一部分, off字符串的开始索引, Len写的字符个数。
 * - void flush()刷新该流的缓冲。
 * - void close关闭此流，但要先刷新它。
 *
 * 构造方法:
 * outputStreamWriter(OutputStream out)创建使用黑认字符编码的 outputStreamWriter。
 * outputStreamWriter(outputStream out，String charsetName）创建使用指定字符集的 outputStreamWriter。参数:
 * OutputStream out:字节输出流,可以用来写转换之后的字节到文件中
 * String charsetName:指定的编码表名称,不区分大小写,可以是utf-8/UTF-8,gbk/GBK } . ..不指定默认使用IDE的默认编码
 *
 * 使用步骤:
 * 1.创建OutputStreamWriter对象,构造方法中传递字节输出流和指定的编码表名称
 * 2.使用OutputStreamWriter对象中的方法write,把字符转换为字节存储缓冲区中(编码)
 * 3.使用OutputStreamWriter对象中的方法fLush,把内存缓冲区中的字节刷新到文件中(使用字节流写字节的过程)
 * 4.释放资源
 */
public class Demo01OutputStreamWriter {

  public static void main(String[] args) throws IOException {
    write_utf_8();
    write_gbk();
  }

  private static void write_gbk()  throws IOException{
    // 1.创建OutputStreamWriter对象,构造方法中传递字节输出流和指定的编码表名称
    FileOutputStream fos = new FileOutputStream("high-code\\src\\Section12IO\\demo08Buffered\\d.txt");
    OutputStreamWriter osw = new OutputStreamWriter(fos,"GBK");
    for (int i = 0; i < 10; i++) {
      // 2.使用OutputStreamWriter对象中的方法write,把字符转换为字节存储缓冲区中(编码)
      osw.write("甄英俊"+i);
      osw.write("\r\n");
    }
    // 3.使用OutputStreamWriter对象中的方法fLush,把内存缓冲区中的字节刷新到文件中(使用字节流写字节的过程)
    osw.flush();
    // 4.释放资源
    osw.close();
  }

  private static void write_utf_8() throws IOException{
    // 1.创建OutputStreamWriter对象,构造方法中传递字节输出流和指定的编码表名称
    FileOutputStream fos = new FileOutputStream("high-code\\src\\Section12IO\\demo08Buffered\\c.txt");
    OutputStreamWriter osw = new OutputStreamWriter(fos,"UTF-8");

    for (int i = 0; i < 10; i++) {
      // 2.使用OutputStreamWriter对象中的方法write,把字符转换为字节存储缓冲区中(编码)
      osw.write("甄英俊"+i);
      osw.write("\r\n");
    }
    // 3.使用OutputStreamWriter对象中的方法fLush,把内存缓冲区中的字节刷新到文件中(使用字节流写字节的过程)
    osw.flush();
    // 4.释放资源
    osw.close();
  }
}
