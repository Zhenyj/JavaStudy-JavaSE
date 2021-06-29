package Section18Annotation.demo05Example;

/**
 * @author zyj
 * @create 2021-05-30 13:09
 *
 * 小明定义的计算器类
 */
public class Calculator {

  //加法
  @Check
  public void add() {
    System.out.println("1 + 0 = " + (1 + 0));
  }

  //减法
  @Check
  public void sub() {
    System.out.println("1 - 0 = " + (1 - 0));
  }

  //乘法
  @Check
  public void mul() {
    System.out.println("1 * 0 = " + (1 * 0));
  }

  //除法
  @Check
  public void div() {
    System.out.println("1 / 0 = " + (1 / 0));
  }

  @Check
  public void tostr(){
    String s = null;
    s.toString();
  }
  public void show() {
    System.out.println("永无bug...");
  }
}
