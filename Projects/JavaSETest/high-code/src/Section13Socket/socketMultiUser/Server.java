package Section13Socket.socketMultiUser;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.List;

/**
 * @author zyj
 * @create 2021-04-07 10:17
 */
public class Server{
    //创建集合对象,存储每一个连接进来的客户端
    public static List<MyChannel> list=new ArrayList<MyChannel>();

    public static void main(String[] args) throws IOException {
        // 创建serverSocket对象
        ServerSocket server = new ServerSocket(8888);
        // 监听是否有客户端连接,循环接收每个连接
        while (true){
            Socket socket = server.accept();
            // 创建线程类对象
            MyChannel myChannel = new MyChannel(socket);
            // 添加到集合中
            list.add(myChannel);
            // 启动线程
            new Thread(myChannel).start();
        }

        //Socket socket = server.accept();
        ////获取输入流数据接收数据
        //DataInputStream dis = new DataInputStream(socket.getInputStream());
        //DataOutputStream dos = new DataOutputStream(socket.getOutputStream());
        //
        //while (true){
        //    String str = dis.readUTF();
        //
        //    System.out.println("客户端发送数据--->"+str);
        //
        //    // 获取输出流响应客户端请求
        //    dos.writeUTF("服务端收到了:"+str);
        //}
    }
}
