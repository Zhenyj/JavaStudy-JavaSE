package Section13Socket.socketMultiUser;

import java.io.DataInputStream;
import java.io.IOException;
import java.net.Socket;

/**
 * @author zyj
 * @create 2021-04-07 10:47
 */
public class Receive implements Runnable {
    // 用于接收数据的数据流
    private DataInputStream dis;
    private boolean flag = true;

    public Receive() {
    }

    public Receive(Socket client) {
        try {
            dis = new DataInputStream(client.getInputStream());
        } catch (IOException e) {
            flag = false;
            CloseUtil.closeAll(dis,client);
        }
    }

    private String getMessage() {
        String str = null;
        try {
            str = dis.readUTF();
        } catch (IOException e) {
            flag = false;
            CloseUtil.closeAll(dis);
        }
        return str;
    }

    @Override
    public void run() {
        while (flag) {
            System.out.println(this.getMessage());
        }
    }
}
