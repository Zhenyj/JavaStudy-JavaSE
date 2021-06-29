package Section13Socket.socket;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @author zyj
 * @create 2021-04-07 8:21
 */
public class Service {
    public static void main(String[] args) throws IOException {
        try {
            // 建立套接字
            ServerSocket server = new ServerSocket(8888);
            //监听
            Socket socket = server.accept();
            // 建立连接
            InputStreamReader sysIn = new InputStreamReader(System.in);
            BufferedReader sysBuf = new BufferedReader(sysIn);

            InputStreamReader socIn = new InputStreamReader(socket.getInputStream());
            BufferedReader socBuf = new BufferedReader(socIn);

            // 向socket写入数据
            PrintWriter socOut = new PrintWriter(socket.getOutputStream());

            String r1 = socBuf.readLine();
            System.out.println("Client:"+r1);

            System.out.print("Server:");
            String str = sysBuf.readLine();
            while(!"ok".equals(str) && !"bye".equals(r1)){
                socOut.println(str);
                socOut.flush();

                r1 = socBuf.readLine();
                System.out.print("Server:");
                str = sysBuf.readLine();
            }
            // 关闭IO、socket
            socIn.close();
            socOut.close();
            server.close();
        }catch(Exception e){
            System.out.println(e.getMessage());
        }

    }
}
