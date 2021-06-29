package Section13Socket.socketMultiUser;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.util.Objects;

/**
 * @author zyj
 * @create 2021-04-07 11:12
 *
 * 每一个客户端都是条道路
 * 1.输入流
 * 2.输出流
 * 3.接收数据
 * 4.发送数据
 */
public class MyChannel implements Runnable {

    private DataInputStream dis;

    private DataOutputStream dos;

    private boolean flag = true;

    public MyChannel() {
    }

    public MyChannel(Socket client) {
        try {
            dis = new DataInputStream(client.getInputStream());
            dos = new DataOutputStream(client.getOutputStream());
        } catch (Exception e) {
            flag = false;
            CloseUtil.closeAll(dis, dos);
        }
    }

    // 接收数据
    private String receive() {
        String str = null;
        try {
            str = dis.readUTF();
        } catch (IOException e) {
            flag = false;
            CloseUtil.closeAll(dis, dos);
            Server.list.remove(this);// 那个线程出错就将哪个线程移除
        }
        return str;
    }

    private void send(String str) {
        if (!Objects.isNull(str) && str.length() != 0) {
            try {
                dos.writeUTF(str);
                dos.flush();
            } catch (IOException e) {
                flag = false;
                CloseUtil.closeAll(dis, dos);
                Server.list.remove(this);// 那个线程出错就将哪个线程移除
            }
        }
    }

    // 转发
    private void sendOther(){
        String str = this.receive();
        for (MyChannel myChannel : Server.list) {
            if(myChannel==this){
                continue; // 不发给自己
            }
            myChannel.send(str);//发送数据
        }
    }

    @Override
    public void run() {
        while (flag) {
            // 调用发送数据的方法
            send(receive());//发送获取到的数据
            //sendOther();
        }
    }
}
