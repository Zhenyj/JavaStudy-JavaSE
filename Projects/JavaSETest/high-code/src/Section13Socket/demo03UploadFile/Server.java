package Section13Socket.demo03UploadFile;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.SocketAddress;
import java.util.Random;

/**
 * @author zyj
 * @create 2021-04-28 22:00
 *
 * TCP通信的文件上传案例
 * 原理:客户端读取本地的文件,把文件上传到服务器,服务器在把上传的文件保存到服务器的硬盘上
 *
 * 1.客户端使用本地的字节输入流,读取要上传的文件
 * 2.客户端徳用网络字节输出流,把读取到的文件上传到服务器
 * 3.服务器使用网络字节输入流,读取客户端上传的文件
 * 4.服务器使用本地字节输出流,把读取到的文件,保存到服务器的硬盘上
 * 5.服务器使用网络字节输出流,给客户端回写一个"上传成功"
 * 6.客户端徳用网络字节输入流,读取服务器回写的数据
 * 7.释放资源
 *
 * 注意:
 * 客户端和服务器和本地硬盘进行读写,需要使用自己创建的字节流对象(本地流)客户端和服务器之问进行读写,必须使用Socket中提供的字节流对象(网络流)
 * 文件上传的原理,就是文件的复制
 * 明确:数据源，数据目的地
 *
 * 实现步骤:
 * 1.创建一个服务器ServerSocket对象,和系统要指定的端口号
 * 2.使用serverSocket对象中的方法accept,获取到请求的客户端socket对象
 * 3.使用socket对象中的方法getInputStream,获取到网络字节输入流InputStream对象
 * 4.判断文件夹是否存在,不存在则创建
 * 5.创建一个本地字节输出流FileOutputStream对象,构造方法中绑定要输出的目的地
 * 6.使用网络字节输入流InputStream对象中的方法read,读取客户 端上传的文件
 * 7.使用本地字节输出流FileOutputStream对象中的方法write,把读取到的文件保存到服务器的硬盘上
 * 8.使用Socket对象中的方法getOutputStream,获取到网络字节输出流OutputStream对象
 * 9.使用网络字节输出流OutputStream对象中的方法write,给客户端回写“上传成功”
 * 10.释放资源(FileOutputStream, socket,ServerSocket)
 */
public class Server {

  public static void main(String[] args) throws IOException {
    ServerSocket server = new ServerSocket(8888);

    /**
     * 让服务器一直处于监听状态(死循环accept方法)有一个客户端上传文件,就保存一个文件
     */
    while (true) {
      Socket client = server.accept();

      /**
       * 使用多线程技术,提高程序的效率
       * 有一个客户端上传文件,就开启一个线程,完成文件的上传
       */
      new Thread(new Runnable() {
        // 完成文件的上传
        public void run() {
          try {
            InputStream cis = client.getInputStream();
            OutputStream cos = client.getOutputStream();
            BufferedOutputStream cbos = new BufferedOutputStream(cos);
            BufferedInputStream cbis = new BufferedInputStream(cis);

            File file = new File("high-code\\src\\Section13Socket\\demo03UploadFile\\img");
            if (!file.exists()) {
              file.mkdirs();
            }
            /**
             * 自定义一个文件的命名规则;防止同名的文件被覆盖
             * 规则:域名+毫秒值+随机数
             */
            String fileName = "itcast" + System.currentTimeMillis() + new Random().nextInt(999999) + ".jpg";
            FileOutputStream fos = new FileOutputStream(file + "\\" + fileName);
            BufferedOutputStream bos = new BufferedOutputStream(fos);

            byte[] bytes = new byte[2048];
            int len = -1;
            while ((len = cbis.read(bytes)) != -1) {
              bos.write(bytes, 0, len);
            }
            bos.flush();
            int localPort = server.getLocalPort();
            SocketAddress localSocketAddress = server.getLocalSocketAddress();
            System.out.println();
            cbos.write(("上传成功:" + file.getAbsolutePath() + "\\" + fileName).getBytes());
            cbos.flush();

            cbis.close();
            cbos.close();
            bos.close();
            client.close();
          } catch (IOException e) {
            e.printStackTrace();
          }
        }
      }).start();
    }
//    server.close();
  }
}
