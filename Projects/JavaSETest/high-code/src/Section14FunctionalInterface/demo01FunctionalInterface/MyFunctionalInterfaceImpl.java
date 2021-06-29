package Section14FunctionalInterface.demo01FunctionalInterface;

/**
 * @author zyj
 * @create 2021-05-17 17:06
 *
 */
public class MyFunctionalInterfaceImpl implements MyFunctionalInterface {

  @Override
  public void method() {
    System.out.println("实现类重写接口的抽象方法");
  }
}
