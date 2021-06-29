package Section13Socket.socketTest;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.Socket;

/**
 * @author zyj
 * @create 2021-05-19 8:24
 *
 * 连接服务器：tcp://ip:端口
 * 1、连接成功后TCP服务器返回
 * {"code":200,"message":"Connect successful"}
 * 2、连接成功后登录TCP服务器
 * （1）客户端发送：{"code":201,"deviceSN":"A001"}，其中A001为设备序列号，有客户端自行构造唯一ID
 * （2）发送成功后服务器返回： {"code":207,"message":"Login successful"}
 * 3、TCP服务器发送变频指令
 * {"code":202,"rate":45}，其中rate为频率
 * 4、客户端向TCP服务器发送指定变频器变频信号
 * {"code":204,"rate":45,"deviceSN":"A001"}
 * 成功后服务端返回
 * {"code":206,"message":"Send to Client Successful"}
 * 6、变频器向服务器发送更新功率转速
 * {"code":203,"deviceSN":"A001","fanSpeed":3000,"fanPower":54.5}  其中fanSpeed为转速，类型整形；fanPower为功率：类型实数
 * 更新成功后服务端返回
 * {"code":205,"message":"Update Successful"}
 */
public class Client {

  public static void main(String[] args) {
    BufferedReader br = null;
    BufferedWriter bw = null;
    Socket client = null;
    try {
      client = new Socket("localhost", 8888);
      br = new BufferedReader(new InputStreamReader(client.getInputStream()));
      bw = new BufferedWriter(new OutputStreamWriter(client.getOutputStream()));

      // 连接成功
      String s = br.readLine();
      System.out.println("服务器消息:" + s);

      // 申请登录
      bw.write(new ClientMsg(201, "A001").toString());
      bw.newLine();
      bw.flush();
      // 服务器返回登录成功
      s = br.readLine();
      System.out.println("服务器消息:" + s);
      // 变频指令
      s = br.readLine();
      System.out.println("服务器消息:" + s);

      // 客户端向TCP服务器发送指定变频器变频信号
      bw.write(new ClientMsg(204, "A001", 45).toString());
      bw.newLine();
      bw.flush();
      // 变频成功后服务端返回
      s = br.readLine();
      System.out.println("服务器消息:" + s);

      // 变频器向服务器发送更新功率转速
      bw.write(new ClientMsg(203, "A001", 3000, 54.5).toString());
      bw.newLine();
      bw.flush();
      // 更新成功后服务端返回
      s = br.readLine();
      System.out.println("服务器消息:" + s);
    } catch (Exception e) {
      e.printStackTrace();
    } finally {
      try {
        if (br != null) {
          br.close();
        }
        if (bw != null) {
          bw.close();
        }
        if (client != null) {
          client.close();
        }
      } catch (Exception e) {
        e.printStackTrace();
      }
    }
  }
}
