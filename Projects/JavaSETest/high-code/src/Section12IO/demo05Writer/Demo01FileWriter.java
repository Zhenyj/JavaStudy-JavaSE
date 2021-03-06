package Section12IO.demo05Writer;

import java.io.FileWriter;
import java.io.IOException;

/**
 * @author zyj
 * @create 2021-04-22 10:28
 *
 * java.io.writer :字符输出流,是所有字符输出流的最顶层的父类,是一个抽象类共性的成员方法:
 * - void write(int c)写入单个字符。
 * - void write(char[] cbuf)写入字符数组。
 * - abstract void write(char[] cbuf，int off， int len)写入字符数组的某一部分, off数组的开始索引,len写的字符个数。
 * - void write(String str)写入字符串。
 * - void write(String str, int off, int len)写入字符串的某一部分,off字符串的开始索引, len写的字符个数。
 * - void flush()刷新该流的缓冲。
 * - void close()关闭此流，但要先刷新它。
 * 换行：换行符号
 * windows:\r\n
 * linux:/n
 * mac:/r
 *
 * java.io.FileWriter extends OutputStreamWriter extends writer
 * FileWriter:文件字符输出流
 * 作用:把内存中字符数据写入到文件中构造方法:
 *
 * FileWriter(File file)根据给定的File对象构造一个FileWriter对象。
 * FileWriter(String fileName）根据给定的文件名构造一个 FileWriter 对象。
 * 构造方法的作用:
 * 1.会创建一个FileWriter对象
 * 2.会根据构造方法中传递的文件/文件的路径,创建文件3.会把FileWriter对象指向创建好的文件
 *
 * 字符输出流的使用步骤(重点)∶
 * 1.创建FiLeWriter对象,构造方法中绑定要写入数据的目的地
 * 2.使用FiLeWriter中的方法write,把数据写入到内存缓冲区中(字符转换为字节的过程)
 * 3.使用FileWriter中的方法flush,把内存缓冲区中的数据,刷新到文件中
 * 4.释放资源(会先把内存缓冲区中的数据刷新到文件中)
 */
public class Demo01FileWriter {

  public static void main(String[] args) throws IOException {
    FileWriter fw = new FileWriter("high-code\\src\\Section12IO\\demo05Writer\\a.txt");
    // void write(int c)写入单个字符。
    fw.write(97);
    // void write(char[] cbuf)写入字符数组。
    char[] chars = {'b','c','d','e'};
    fw.write(chars);
    // void write(char[] cbuf，int off， int len)写入字符数组的某一部分, off数组的开始索引,len写的字符个数。
    fw.write(chars,0,2);
    // void write(String str)写入字符串。
    fw.write("甄英俊");
    // void write(String str, int off, int len)写入字符串的某一部分,off字符串的开始索引, len写的字符个数。
    fw.write("牛逼克拉斯",0,2);
    // 使用FileWriter中的方法flush,把内存缓冲区中的数据,刷新到文件中
    fw.flush();
    // 释放资源(会先把内存缓冲区中的数据刷新到文件中)
    fw.close();
  }
}
