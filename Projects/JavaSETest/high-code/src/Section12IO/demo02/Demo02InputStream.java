package Section12IO.demo02;

import java.io.FileInputStream;
import java.io.IOException;

/**
 * @author zyj
 * @create 2021-04-21 8:29
 *
 * java.io.InputStream:字节输入流
 * 此抽象类是表示字节输入流的所有类的超类。定义了所有子类共性的方法:
 * int read()从输入流中读取数据的下一个字节。并且指针会在读取后自动向后移，返回-1表示读取完毕
 * int read(byte[] b）从输入流中读取一定数量的字节，并将其存储在缓冲区数组b
 * void close()关闭此输入流并释放与该流关联的所有系统资源。
 * java.io.FileInputStream extends InputStream
 * FileInputStream:文件字节输入流
 * 作用:把硬盘文件中的数据,读取到内存中使用
 *
 * 构造方法:
 * FileInputStream( string name)FileInputStream(File file)
 * 参数:读取文件的数据源
 * String name:文件的路径
 * File file:文件
 * 构造方法的作用:
 * 1.会创建一个FileInputStream对象
 * 2.会把FileInputStream对象指定构造方法中要读取的文件
 *
 * 读取数据的原理(硬盘-->内存)
 * java程序-->JVM-->OS-->os读取数据的方法-->读取文件字节输入流的使用步骤(重点)∶
 * 1.创建FileInputStream对象,构造方法中绑定要读取的数据源
 * 2.使用FileInputStream对象中的方法read,读取文件
 * 3.释放资源
 *
 * 字节输入流一次读取多个字节的方法:
 * int read(byte[] b）从输入流中读取一定数量的字节，并将其存储在缓冲区数组b中。
 * 明确两件事情:
 * 1.方法的参数byte[]的作用?
 * 起到缓冲作用,存储每次读取到的多个字节
 * 数组的长度一般定义为1024(1kb)或者1024的整数倍
 * 2.方法的返回值int是什么?
 * 读取的有效字节个数
 *
 * String类的构造方法
 * String(byte[] bytes):把字节数组转换为字符串
 * String(byte[ ] bytes，int offset，int length）把字节数组的一部分转换为字符串 offset:数组的开始索引Length:转换的字节个数
 */
public class Demo02InputStream {

  public static void main(String[] args) throws IOException {
    FileInputStream fis = new FileInputStream("high-code\\src\\Section12IO\\demo01\\b.txt");

//    byte[] bytes = new byte[2];// 数组长度多少就一次性读多少
//    int len = fis.read(bytes);
//    System.out.println(len);
//    System.out.println(new String(bytes));

    byte[] bytes = new byte[1024];
    int len = -1;// 读取的有效字节个数
    while ((len = fis.read(bytes)) != -1) {
      System.out.println(len);
//      System.out.println(new String(bytes));// 会造成多余的空串
      System.out.println(new String(bytes,0,len));// 只将有效的数组长度转为字符串
    }
  }
}
