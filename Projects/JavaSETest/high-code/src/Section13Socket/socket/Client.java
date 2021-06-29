package Section13Socket.socket;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

/**
 * @author zyj
 * @create 2021-04-07 8:21
 */
public class Client {
    public static void main(String[] args) throws IOException {
        try {
            // 创建socket对象，建立连接
            Socket socket = new Socket("14.215.177.39",443);
            // 获取键盘输入
            InputStreamReader sysIn = new InputStreamReader(System.in);
            BufferedReader sysBuf = new BufferedReader(sysIn);
            // 接收socket输入
            InputStreamReader socIn = new InputStreamReader(socket.getInputStream());
            BufferedReader socBuf = new BufferedReader(socIn);
            // 向socket写入数据
            PrintWriter socOut = new PrintWriter(socket.getOutputStream());
            // 通信
            // 等待键盘输入
            System.out.print("Client:");
            String str = sysBuf.readLine();

           do{
                // 发送给socket
                socOut.println(str);
                socOut.flush();// 刷新缓冲，立即发送给服务器

                // 接收数据,该程序相当于需要等待回应才能继续发送数据
                System.out.println("Server:" + socBuf.readLine());
                System.out.print("Client:");
                str = sysBuf.readLine();
            } while (!"bye".equals(str));

            // 关闭io和socket
            socOut.close();
            socIn.close();
            socket.close();
        }catch(Exception e){
            System.out.println(e.getMessage());
        }

    }
}
