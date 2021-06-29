package day09.Extends.demo02;

/**
 * @author zyj
 * @create 2020-12-17 13:31
 */
public class Demo02ExtendsFiled {
    public static void main(String[] args) {
        Fu fu = new Fu();
        System.out.println(fu.numFu);
        System.out.println("==============");
        Zi zi = new Zi();
        System.out.println(zi.numFu);
        System.out.println(zi.numZi);
        System.out.println("==============");
        /**
         * 在父子类的继承关系当中，如果成员变量重名，则创建子类对象时，访问有两种方式:
         * 直接通过子类对象访问成员变量:
         *      等号左边是谁,就优先用谁的变量,没有则向上找。
         * 间接通过成员方法访问成员变量:
         *      该方法属于谁，就优先用谁的变量，没有则向上找。
         */
        System.out.println(zi.num);//直接访问
        System.out.println("==============");
        zi.methodZi();//子类存在，优先用子类
        //这个方法是在父类中定义的，所以输出的是父类的num
        zi.methodFu();
    }
}
