package Section13Socket.socketTest;

/**
 * @author zyj
 * @create 2021-05-19 8:44
 */
public class ClientMsg {
  private int code;
  private String deviceSN;
  private int fanSpeed;
  private double fanPower;
  private int rate;

  public ClientMsg() {
  }

  public ClientMsg(int code, String deviceSN, int fanSpeed, double fanPower, int rate) {
    this.code = code;
    this.deviceSN = deviceSN;
    this.fanSpeed = fanSpeed;
    this.fanPower = fanPower;
    this.rate = rate;
  }

  public ClientMsg(int code, String deviceSN) {
    this.code = code;
    this.deviceSN = deviceSN;
  }

  public ClientMsg(int code, String deviceSN, int rate) {
    this.code = code;
    this.deviceSN = deviceSN;
    this.rate = rate;
  }

  public ClientMsg(int code, String deviceSN, int fanSpeed, double fanPower) {
    this.code = code;
    this.deviceSN = deviceSN;
    this.fanSpeed = fanSpeed;
    this.fanPower = fanPower;
  }

  public int getCode() {
    return code;
  }

  public int getRate() {
    return rate;
  }

  public void setRate(int rate) {
    this.rate = rate;
  }

  public void setCode(int code) {
    this.code = code;
  }

  public String getDeviceSN() {
    return deviceSN;
  }

  public void setDeviceSN(String deviceSN) {
    this.deviceSN = deviceSN;
  }

  public int getFanSpeed() {
    return fanSpeed;
  }

  public void setFanSpeed(int fanSpeed) {
    this.fanSpeed = fanSpeed;
  }

  public double getFanPower() {
    return fanPower;
  }

  public void setFanPower(double fanPower) {
    this.fanPower = fanPower;
  }

  public String sendMsg(int code,String deviceSN){
    return "ClientMsg{" +
        "code=" + code +
        ", deviceSN='" + deviceSN +'}';
  }

  @Override
  public String toString() {
    return "Msg{" +
        "code=" + code +
        ", deviceSN='" + deviceSN + '\'' +
        ", fanSpeed=" + fanSpeed +
        ", fanPower=" + fanPower +
        ", rate=" + rate +
        '}';
  }
}
