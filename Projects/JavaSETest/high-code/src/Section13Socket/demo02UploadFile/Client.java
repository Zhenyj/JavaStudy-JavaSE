package Section13Socket.demo02UploadFile;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

/**
 * @author zyj
 * @create 2021-04-28 22:07
 *
 * 实现步骤;
 * 1.创建一个本地字节输入流FileInputStream对象,构造方法中绑定要读取的数据源
 * 2.创建一个客户端socket对象,构造方法中绑定服务器的IP地址和端口号
 * 3.使用Socket中的方法getOutputStream,获取网络字节输出流OutputStream对象
 * 4.使用本地字节输入流FileInputStream对象中的方法read,读取本地文件
 * 5.使用网络字节输出流OutputStream对象中的方法write,把读取到的文件上传到服务器
 * 6.使用Socket中的方法getInputStream,获取网络字节输入流InputStream对象
 * 7.使用网络字节输入流InputStream对象中的方法read读取服务回写的数据
 * 8.释放资源(FileInputStream, socket)
 */
public class Client {

  public static void main(String[] args) throws IOException {
    Socket client = new Socket("127.0.0.1",8888);
    OutputStream cos = client.getOutputStream();
    InputStream cis = client.getInputStream();

    BufferedOutputStream cbos = new BufferedOutputStream(cos);
    BufferedInputStream cbis = new BufferedInputStream(cis);

    FileInputStream fis = new FileInputStream("high-code\\src\\Section13Socket\\demo02UploadFile\\city_3.jpg");
    BufferedInputStream bis = new BufferedInputStream(fis);

    byte[] bytes = new byte[2048];
    int len = -1;
    while ((len = bis.read(bytes))!=-1){
      cbos.write(bytes, 0, len);
    }
    cbos.flush();

    /**
     * 解决:上传完文件,没有上传结束标记造成的阻塞,给服务器写一个结束标记
     * void shutdownOutput()禁用此套接字的输出流。
     * 对于TCP套接字，任何以前写入的数据都将被发送，并且后跟TCP的正常连接终止序列。
     */
    client.shutdownOutput();

    len = cbis.read(bytes);
    if(len != -1){
      System.out.println(new String(bytes,0,len));
    }


    bis.close();
    client.close();
  }
}
