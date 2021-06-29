package Section13Socket.socketMultiUser;

import java.io.IOException;
import java.net.Socket;

/**
 * @author zyj
 * @create 2021-04-07 10:18
 */
public class Client {
    public static void main(String[] args) throws IOException {
        // 创建socket对象
        Socket client = new Socket("127.0.0.1",8888);
        // 创建发送的线程类对象
        Send send = new Send(client);
        // 创建接收的线程类对象
        Receive receive = new Receive(client);
        // 创建Thread类对象并启动线程
        new Thread(send).start();
        new Thread(receive).start();
    }
}
