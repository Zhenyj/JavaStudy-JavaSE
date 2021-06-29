package Section13Socket.socketTest;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @author zyj
 * @create 2021-05-19 8:12
 */
public class TcpServer {

  public static void main(String[] args) {
    Socket client = null;
    BufferedReader br = null;
    BufferedWriter bw = null;
    try {
      ServerSocket server = new ServerSocket(8888);
      while (true){
        client = server.accept();
        br = new BufferedReader(new InputStreamReader(client.getInputStream()));
        bw = new BufferedWriter(new OutputStreamWriter(client.getOutputStream()));
        //返回链接成功
        bw.write(new ServerMsg(200,"Connect successful").toString()+"\r\n");
        bw.newLine();
        bw.flush();

        //客户端发送的申请登录
        String s = br.readLine();
        System.out.println("客户端消息:"+s);

        //返回登录成功
        bw.write(new ServerMsg(207,"Login successful").toString());
        bw.newLine();
        //TCP服务器发送变频指令
        bw.write(new ClientMsg(202,"A001",45).toString());
        bw.newLine();
        bw.flush();

        // 客户端向TCP服务器发送指定变频器变频信号
        s = br.readLine();
        System.out.println("客户端消息:"+s);
        // 返回变频成功
        bw.write(new ServerMsg(206,"Send to Client Successful").toString());
        bw.newLine();
        bw.flush();
        // 变频器向服务器发送更新功率转速
        s = br.readLine();
        System.out.println("客户端消息:"+s);
        // 更新成功后服务端返回
        bw.write(new ServerMsg(205,"Update Successful").toString());
        bw.newLine();
        bw.flush();
      }
    } catch (Exception e) {
      e.printStackTrace();
    } finally {
      try{
        if (br != null) {
          br.close();
        }
        if (bw != null) {
          bw.close();
        }
        if (client != null) {
          client.close();
        }
      }catch (Exception e){
        e.printStackTrace();
      }
    }
  }
}
