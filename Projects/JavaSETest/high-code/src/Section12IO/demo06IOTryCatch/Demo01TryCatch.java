package Section12IO.demo06IOTryCatch;

import java.io.FileWriter;
import java.io.IOException;

/**
 * @author zyj
 * @create 2021-04-22 10:59
 */
public class Demo01TryCatch {

  public static void main(String[] args) {
    //变量在定义的时候,可以没有值,但是使用的时候必须有值
    // fw = new FileWriter("high-code\\src\\Section12IO\\demo05Writer\\a.txt");执行失败, fw没有值, fw.close会报错
    FileWriter fw=null;
    try {
      fw = new FileWriter("high-code\\src\\Section12IO\\demo06IOTryCatch\\a.txt",true);
      // void write(int c)写入单个字符。
      fw.write(97);
      // void write(char[] cbuf)写入字符数组。
      char[] chars = {'b','c','d','e'};
      fw.write(chars);
      // 使用FileWriter中的方法flush,把内存缓冲区中的数据,刷新到文件中
      fw.flush();
    }catch (IOException e){
      e.printStackTrace();
    }finally {
      // 释放资源(会先把内存缓冲区中的数据刷新到文件中)
      //创建对象失败了,fw的理式认值就是null, null是不能调用方法的,会抛出wuLUPointenException,需要增加一个判断，不是null在把资源释放
      if(fw!=null){
        try {

          fw.close();
        } catch (IOException e) {
          e.printStackTrace();
        }
      }
    }
  }
}
