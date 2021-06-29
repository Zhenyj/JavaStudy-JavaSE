package Section14FunctionalInterface.demo02Lambda;

/**
 * @author zyj
 * @create 2021-05-17 22:48
 */
@FunctionalInterface
public interface MessageBuilder {
  // 定义一个拼接消息的抽象方法,返回被拼接的消息
  public abstract String builderMessage();
}
