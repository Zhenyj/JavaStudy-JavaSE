package day09.Extends.demo07;

/**
 * @author zyj
 * @create 2020-12-17 13:44
 *
 * 继承关系中，父子类构造方法的访问特点:
 * 1．子类构造方法当中有一个默认隐含的“super()"调用，所以一定是先调用的父类构造，后执行的子类构造。
 * 2.子类构造可以通过super关键字来调用父类重载构造。
 * 3. super的父类构造调用，必须是子类构造方法的第一个语句。
 */
public class Demo {
    public static void main(String[] args) {
        Zi zi = new Zi();
    }
}
