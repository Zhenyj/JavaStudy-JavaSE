package Section08Thread.thread01;

/**
 * @author zyj
 * @create 2021-04-12 16:54
 *
 * 主线程:执行主(main)方法的线程
 * 单线程程序:java程序中只有一个线程
 * 执行从main方法开始,从上到下依次执行
 */
public class Demo01Thread {
    public static void main(String[] args) {
        Person p1 = new Person("张三");
        p1.run();
        System.out.println("======================");
        Person p2 = new Person("李四");
        p2.run();
    }
}
