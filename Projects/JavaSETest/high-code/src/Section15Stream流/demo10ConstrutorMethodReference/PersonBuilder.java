package Section15Stream流.demo10ConstrutorMethodReference;

/**
 * @author zyj
 * @create 2021-05-22 22:38
 *
 * 定义一个创建Person对象的函数式接口
 */
@FunctionalInterface
public interface PersonBuilder {
  // 定义一个方法,根据传递的姓名,创建Person对象返回
  public abstract Person builderPerson(String name);
}
