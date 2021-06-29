package Section15Stream流.demo07StaticMethodReference;

/**
 * @author zyj
 * @create 2021-05-22 21:24
 *
 * 通过类名引用静态成员方法
 * 类已经存在,静态成员方法也已经存在
 * 就可以通过类名直接引用静态成员方法
 */
public class Demo01StaticMethodReference {
  //定义一个方法,方法的参数传递要计算绝对值的整数,和函数式接口caLcable
  public static int calsAbs(int number,Calable c){
    return c.calsAbs(number);
  }

  public static void main(String[] args) {
    //调用method方法,传递计算绝对值得整数,和Lambda表达式
    int num = calsAbs(-10,(number)->{
      return Math.abs(number);
    });
    System.out.println(num);

    /**
     * 使用方法引用优化Lambda表达式
     * Math类是存在的
     * abs计算绝对值的静态方法也是已经存在的
     * 所以我们可以直接通过类名引用静态方法
     */
    num = calsAbs(-10, Math::abs);
    System.out.println(num);
  }
}
