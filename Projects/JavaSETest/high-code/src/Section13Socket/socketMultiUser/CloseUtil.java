package Section13Socket.socketMultiUser;

import java.io.Closeable;
import java.io.IOException;
import java.util.Objects;

/**
 * @author zyj
 * @create 2021-04-07 10:28
 */
public class CloseUtil {
    public static void closeAll(Closeable ... able){
        for (Closeable c : able) {
            if(!Objects.isNull(c)){
                try {
                    c.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
