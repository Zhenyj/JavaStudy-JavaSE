package Section12IO.demo03;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @author zyj
 * @create 2021-04-21 9:33
 *
 * 文件复制
 */
public class Demo01FileCopy {

  public static void main(String[] args) throws IOException {
    long start = System.currentTimeMillis();
    // 读取文件
    FileInputStream fis = new FileInputStream("high-code\\src\\Section12IO\\demo03\\DNF.jpg");
    // 写入
    FileOutputStream fos = new FileOutputStream("high-code\\src\\Section12IO\\demo03\\img\\DNF.jpg");
    int len = -1;
    int count = 0;
    byte[] bytes = new byte[1024];
    while ((len=fis.read(bytes))!=-1){// 读取文件
      // 写入
      fos.write(bytes, 0, len);
    }
    long end = System.currentTimeMillis();
    System.out.println("复制耗时:"+(end-start)+"毫秒");
    // 释放资源
    fis.close();
    fos.close();
  }
}
