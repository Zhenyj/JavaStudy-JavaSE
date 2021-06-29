package Section15Stream流.demo07StaticMethodReference;

/**
 * @author zyj
 * @create 2021-05-22 21:24
 */
@FunctionalInterface
public interface Calable {
  //定义一个抽象方法,传递一个整数,对整数进行绝对值计算并返回
  int calsAbs(int number);
}
