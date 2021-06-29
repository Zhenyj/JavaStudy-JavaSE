package Section08Thread.thread08synchronized;

/**
 * @author zyj
 * @create 2021-04-14 8:15
 *
 * 卖票案例出现了线程安全
 * 问题卖出了不存在的票和重复的票
 *
 * 解决线程安全问题的一种方案:使用同步代码块格式:
 * synchronized(锁对象){
 *      可能会出现线程安全问题的代码(访问了共享数据的代码)
 * }
 * 注意:
 *      1.通过代码块中的锁对象,可以使用任意的对象
 *      2.但是必须保证多个线程使用的锁对象是同一个
 *      3.锁对象作用:
 *          把同步代码块锁住,只让一个线程在同步代码块中执行
 */
public class Demo08Synchronized {
    public static void main(String[] args) {
        // 创建实现类对象
        //RunnableImpl r = new RunnableImpl();
        //RunnableImpl2 r = new RunnableImpl2();//使用同步方法的Runnable对象
        RunnableImpl3 r = new RunnableImpl3();//使用静态同步方法的Runnable对象
        // 创建Thread对象
        Thread t0 = new Thread(r);
        Thread t1 = new Thread(r);
        Thread t2 = new Thread(r);



        t0.start();
        t1.start();
        t2.start();
    }
}
