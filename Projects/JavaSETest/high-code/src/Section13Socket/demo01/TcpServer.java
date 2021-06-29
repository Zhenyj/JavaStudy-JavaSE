package Section13Socket.demo01;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @author zyj
 * @create 2021-04-28 21:40
 *
 * 服务器的实现步骤:
 * 1.创建服务器serverSocket对象和系统要指定的端口号
 * 2.使用ServerSocket对象中的方法accept,获取到请求的客户端对象Socket
 * 3.使用socket对象中的方法getInputStream()获取网络字节输入流InputStream对象
 * 4.使用网络字节输入流InputStream对象中的方法read,读取客户端发送的数据
 * 5.使用socket对象中的方法getOutputStream ()获取网络字节输出流OutputStream对象
 * 6.使用网络字节输出流OutputStream对象中的方法write,给客户端回写数据
 * 7.释放资源(Socket,serverSocket)
 */
public class TcpServer {

  public static void main(String[] args) throws IOException {
    // 1.创建服务器serverSocket对象和系统要指定的端口号
    ServerSocket server = new ServerSocket(8888);
    // 2.使用ServerSocket对象中的方法accept,获取到请求的客户端对象Socket
    Socket client = server.accept();
    // 3.使用socket对象中的方法getInputStream()获取网络字节输入流InputStream对象
    InputStream is = client.getInputStream();
    // 4.使用网络字节输入流InputStream对象中的方法read,读取客户端发送的数据
    byte[] bytes = new byte[1024];
    int len = is.read(bytes);
    System.out.println(new String(bytes,0,len));
    // 5.使用socket对象中的方法getOutputStream ()获取网络字节输出流OutputStream对象
    OutputStream os = client.getOutputStream();
    // 6.使用网络字节输出流OutputStream对象中的方法write,给客户端回写数据
    os.write("收到，谢谢".getBytes());
    os.flush();
    // 7.释放资源(Socket,serverSocket)
    server.close();
    client.close();
  }
}
