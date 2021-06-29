package day09.Extends.demo05;

/**
 * @author zyj
 * @create 2020-12-17 13:57
 *
 * 方法覆盖重写的注意事项:
 * 1．必须保证父子类之间方法的名称相同，参数列表也相同。
 * @Override:写在方法前面，用来检测是不是有效的正确覆盖重写。(可选，最好重写的时候都写上)
 * 这个注解就算不写，只要满足要求，也是正确的方法覆盖重写。
 * 2.子类方法的返回值必须【小于等于】父类方法的返回值范围。
 * java.lang.Object类是所有类的公共最高父类（祖宗类），java.Lang.String就是object的子类。
 * 3.子类方法的权限必须【大于等于】父类方法的权限修饰符
 * public > protected > default(不是关键字，是无修饰符情况下) > private
 */
public class Demo05Extends {
    public static void main(String[] args) {

    }
}
