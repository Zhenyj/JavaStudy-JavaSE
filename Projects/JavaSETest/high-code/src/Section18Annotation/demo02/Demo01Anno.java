package Section18Annotation.demo02;

/**
 * @author zyj
 * @create 2021-05-27 20:47
 *
 * JDK中预定义的一些注解
 * * @Override :检测被该注解标注的方法是否是继承自父类(接口)的
 * * @Deprecated:该注解标注的内容，表示已过时
 * * @suppressWarnings:压制警告
 */

// 压制所有警告，一般传递参数all
@SuppressWarnings("all")
public class Demo01Anno {
  @Override
  public String toString(){
    return super.toString();
  }

  @Deprecated
  public void show1(){
    //有缺陷
  }

  public void show2(){
    // 替代show1方法
  }


}
