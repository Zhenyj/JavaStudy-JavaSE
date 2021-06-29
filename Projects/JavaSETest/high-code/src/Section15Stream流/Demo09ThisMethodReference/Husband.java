package Section15Stream流.Demo09ThisMethodReference;

/**
 * @author zyj
 * @create 2021-05-22 22:31
 *
 * 通过this引用本类的成员方法
 */
public class Husband {
  // 定义一个买房子的方法
  public void buyHouse(){
    System.out.println("北京二环内买一套四合院");
  }

  // 定义一个结婚的方法传递Richable接口
  public void marry(Richable r){
    r.buy();
  }

  // 定义一个非常高兴的方法
  public void soHappy(){
    // 调用结婚的方法,方法的参数是个Richable是一个函数式接口,传递Lambda表达式
    marry(()->{
      this.buyHouse();
    });

    // 用this引用成员方法
    marry(this::buyHouse);
  }

  public static void main(String[] args) {
    new Husband().soHappy();
  }
}
