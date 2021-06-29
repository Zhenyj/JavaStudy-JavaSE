package Section13Socket.socketMultiUser;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;

/**
 * @author zyj
 * @create 2021-04-07 10:31
 */
public class Send implements Runnable {
    // 从键盘获取数据
    private BufferedReader br;
    // 发送数据的数据流
    private DataOutputStream dos;
    private boolean flag = true;

    public Send() {
        br = new BufferedReader(new InputStreamReader(System.in));
    }

    public Send(Socket client) {
        this();// 调用本类无参构造方法
        try {
            dos = new DataOutputStream(client.getOutputStream());
        } catch (IOException e) {
            flag=false;
            CloseUtil.closeAll(dos,br);
        }
    }

    // 获取信息
    private String getMessage(){
        String str = null;
        try {
            str = br.readLine();
        } catch (IOException e) {
            flag = false;
            CloseUtil.closeAll(br);
        }
        return str;
    }

    //发送信息
    private void send(String str){
        try {
            dos.writeUTF(str);
            dos.flush();
        } catch (IOException e) {
            flag= false;
            CloseUtil.closeAll(dos);
        }
    }

    public Send(BufferedReader br, DataOutputStream dos) {
        this.br = br;
        this.dos = dos;
    }

    @Override
    public void run() {
        while (flag){
            // 调用发送信息
            this.send(getMessage());
        }
    }
}
