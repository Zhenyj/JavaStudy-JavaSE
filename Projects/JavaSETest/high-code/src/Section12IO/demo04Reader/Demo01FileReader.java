package Section12IO.demo04Reader;

import java.io.FileReader;
import java.io.IOException;

/**
 * @author zyj
 * @create 2021-04-22 10:10
 *
 * java.io.Reader:字符输入流,是字符输入流的最顶层的父类,定义了一些共性的成员方法,是一个抽象类
 *
 * 共性的成员方法:
 * int read()读取单个字符并返回。
 * int read(char[] cbuf)一次读取多个字符,将字符读入数组。
 * void close()关闭该流并释放与之关联的所有资源。
 * java.io.FileReader extends InputStreamReader extends Reader
 * FileReader:文件字符输入流
 * 作用:把硬盘文件中的数据以字符的方式读取到内存中
 *
 * 构造方法:
 * FiLeReader(String fiLeName)
 * FiLeReader(File file)
 *
 *
 */
public class Demo01FileReader {

  public static void main(String[] args) throws IOException {
    FileReader reader = new FileReader("high-code\\src\\Section12IO\\demo04Reader\\a.txt");
    int len = -1;
//    while ((len = reader.read())!=-1){
//      System.out.println(len+"--->"+(char)len);
//    }
    char[] chars = new char[1024];
    while ((len = reader.read(chars))!=-1){
      System.out.println(len+"--->"+new String(chars,0,len));
    }
    reader.close();
  }
}
