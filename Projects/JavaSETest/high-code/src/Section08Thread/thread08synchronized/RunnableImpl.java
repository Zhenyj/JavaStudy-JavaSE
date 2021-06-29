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
public class RunnableImpl implements Runnable {
    private int ticket = 100;
    // 创建所对象
    Object object = new Object();

    // 设置线程任务，卖票
    @Override
    public void run() {
        // 先判断是否还有票
        while (true) {
            // 创建同步代码块
            synchronized (object){
                if(ticket>0){
                    // 提高安全问题出现概率,睡眠
                    try {
                        Thread.sleep(10);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println(Thread.currentThread().getName()+"正在卖第"+ticket+"张票");
                    ticket--;
                }
            }
        }
    }
}
