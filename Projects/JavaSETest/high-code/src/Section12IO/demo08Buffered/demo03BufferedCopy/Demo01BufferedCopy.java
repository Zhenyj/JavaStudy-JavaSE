package Section12IO.demo08Buffered.demo03BufferedCopy;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 @author zyj
 @create 2021-04-23 18:04

 使用缓冲流复制文件
 */
public class Demo01BufferedCopy {

  public static void main(String[] args) throws IOException {
    FileInputStream fis = new FileInputStream("high-code\\src\\Section12IO\\demo08Buffered\\demo03BufferedCopy\\city_3.jpg");
    FileOutputStream fos = new FileOutputStream("high-code\\src\\Section12IO\\demo08Buffered\\demo03BufferedCopy\\img\\city_3.jpg");
    BufferedInputStream bis = new BufferedInputStream(fis);
    BufferedOutputStream bos = new BufferedOutputStream(fos);

    byte[] bytes = new byte[1024];
    int len = -1;
    long start = System.currentTimeMillis();
    while ((len = bis.read(bytes))!=-1){
      bos.write(bytes,0,len);
    }
    long end = System.currentTimeMillis();
    System.out.println("复制文件共耗时:"+(end-start)+"毫秒");
    bis.close();
    bos.close();
  }
}
