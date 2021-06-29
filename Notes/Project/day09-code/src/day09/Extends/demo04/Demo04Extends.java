package day09.Extends.demo04;

/**
 * @author zyj
 * @create 2020-12-17 13:48
 *
 * 注意事项:
 * 无论是成员方法还是成员变量，如果没有都是向上找父类，绝对不会向下找子类的。
 *
 * 重写(Override)
 * 概念:在继承关系当中，方法的名称一样，参数列表也一样。
 *
 * 重写(Override):方法的名称一样,参数列表也一样。
 * 重载(Overload）:方法的名称一样，参数列表不一样。
 *
 * 方法的覆盖重写特点:创建的是子类对象，则优先用子类方法。
 */
public class Demo04Extends {
    public static void main(String[] args) {
        Zi zi = new Zi();
        zi.methodFu();//继承父类的
        zi.methodZi();//子类新创建的
        zi.method();//子类重写父类的method并覆盖了继承的method
    }
}
