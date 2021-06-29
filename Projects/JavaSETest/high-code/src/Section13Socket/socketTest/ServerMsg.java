package Section13Socket.socketTest;

/**
 * @author zyj
 * @create 2021-05-19 8:17
 */
public class ServerMsg {
  private int code;
  private String message;

  public ServerMsg(int code, String message) {
    this.code = code;
    this.message = message;
  }

  public ServerMsg() {
  }

  public int getCode() {
    return code;
  }

  public void setCode(int code) {
    this.code = code;
  }

  public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }

  @Override
  public String toString() {
    return "Msg{" +
        "code=" + code +
        ", message='" + message + '\'' +
        '}';
  }
}
