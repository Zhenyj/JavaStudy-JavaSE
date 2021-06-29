package Section12IO.demo08Buffered.demo07转换流;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

/**
 * @author zyj
 * @create 2021-04-26 16:11
 *
 * 将GBK编码的文件转换为UTF-8编码的文件
 *
 * 1.指定GBK编码的转换流，读取文本文件。
 * 2.使用UTF-8编码的转换流，写出文本文件。
 */
public class Demo03TransDemo {

  public static void main(String[] args) throws IOException {
    FileInputStream fis = new FileInputStream("high-code\\src\\Section12IO\\demo08Buffered\\d.txt");
    FileOutputStream fos = new FileOutputStream("high-code\\src\\Section12IO\\demo08Buffered\\c.txt");
    InputStreamReader isr = new InputStreamReader(fis,"GBK");
    OutputStreamWriter osw = new OutputStreamWriter(fos,"UTF-8");

    int len = -1;
    char[] chars = new char[1024];
    while ((len = isr.read(chars))!=-1){
      osw.write(new String(chars,0,len));
      osw.write("\r\n");
    }
    osw.flush();
    osw.close();
    isr.close();
  }
}
