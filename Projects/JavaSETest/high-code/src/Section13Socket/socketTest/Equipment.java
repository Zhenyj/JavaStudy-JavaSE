package Section13Socket.socketTest;

/**
 * @author zyj
 * @create 2021-05-19 8:38
 */
public class Equipment {
  // 设备号
  private String deviceSN;
  // 频率
  private Integer rate;
  // 转速
  private Integer fanSpeed;
  // 功率
  private Double fanPower;

  public String getDeviceSN() {
    return deviceSN;
  }

  public void setDeviceSN(String deviceSN) {
    this.deviceSN = deviceSN;
  }

  public Integer getRate() {
    return rate;
  }

  public void setRate(Integer rate) {
    this.rate = rate;
  }

  public Integer getFanSpeed() {
    return fanSpeed;
  }

  public void setFanSpeed(Integer fanSpeed) {
    this.fanSpeed = fanSpeed;
  }

  public Double getFanPower() {
    return fanPower;
  }

  public void setFanPower(Double fanPower) {
    this.fanPower = fanPower;
  }

  public Equipment(String deviceSN, Integer rate, Integer fanSpeed, Double fanPower) {
    this.deviceSN = deviceSN;
    this.rate = rate;
    this.fanSpeed = fanSpeed;
    this.fanPower = fanPower;
  }

  public Equipment() {
  }

  @Override
  public String toString() {
    return "Equipment{" +
        "deviceSN='" + deviceSN + '\'' +
        ", rate=" + rate +
        ", fanSpeed=" + fanSpeed +
        ", fanPower=" + fanPower +
        '}';
  }
}
