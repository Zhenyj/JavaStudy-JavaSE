package Section12IO.demo05Writer;

import java.io.FileWriter;
import java.io.IOException;

/**
 * @author zyj
 * @create 2021-04-22 10:28
 *
 * fLush方法和close方法的区别
 * - flush :刷新缓冲区,流对象可以继续使用。
 * - close:先刷新缓冲区，然后通知系统释放资源。流对象不可以再被使用了。
 *
 */
public class Demo02FlushAndClose {

  public static void main(String[] args) throws IOException {
    FileWriter fw = new FileWriter("high-code\\src\\Section12IO\\demo05Writer\\a.txt",true);
    // void write(int c)写入单个字符。
    fw.write(97);
    // 使用FileWriter中的方法flush,把内存缓冲区中的数据,刷新到文件中
    fw.flush();
    // 释放资源(会先把内存缓冲区中的数据刷新到文件中)
    fw.close();
  }
}
