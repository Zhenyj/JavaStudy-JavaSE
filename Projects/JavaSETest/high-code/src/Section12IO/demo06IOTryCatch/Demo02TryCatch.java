package Section12IO.demo06IOTryCatch;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @author zyj
 * @create 2021-04-22 10:59
 *
 * JDK7的新特性
 * 在try的后边可以增加一个(),在括号中可以定义流对象那么这个流对象的作用或就在try中有效
 * try中的代码执行完毕,会自动把流对象释放,不用写finally
 * 格式:
 * try(定义流对象;定义流对象....){
 * 可能会产出异常的代码
 * }catch(异常类变量变量名){异常的处理逻辑}
 */
public class Demo02TryCatch {

  public static void main(String[] args) {
    long start = System.currentTimeMillis();
    try (
        FileInputStream fis = new FileInputStream("high-code\\src\\Section12IO\\demo06IOTryCatch\\DNF.jpg");
        FileOutputStream fos = new FileOutputStream("high-code\\src\\Section12IO\\demo06IOTryCatch\\img\\DNF.jpg");) {

      int len = -1;
      int count = 0;
      byte[] bytes = new byte[1024];
      while ((len = fis.read(bytes)) != -1) {// 读取文件
        // 写入
        fos.write(bytes, 0, len);
      }
      long end = System.currentTimeMillis();
      System.out.println("复制耗时:" + (end - start) + "毫秒");
    } catch (IOException e) {
      e.printStackTrace();
    }


  }
}
