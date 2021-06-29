package Section08Thread.thread08synchronized;

/**
 * @author zyj
 * @create 2021-04-14 10:12
 *
 * 解决线程安全问题的二种方案:使用同步方法使用步骤:
 * 1.把访问了共享数据的代码抽取出来,放到一个方法中
 * 2.在方法上添加synchronized修饰符
 * 格式:定义方法的格式
 * 修饰符synchronized 返回值类型方法名(参数列表){
 * 可能会出现线程安全问题的代码(访问了共享数据的代码)
 * }
 */
public class RunnableImpl2 implements Runnable {

    private static int ticket = 100;

    @Override
    public void run() {
        // 先判断是否还有票
        while (true) {
            payTicket();
        }
    }

    /**
     * 定义一个同步方法
     * 同步方法也会把方法内部的代码锁住只让一个线程执行
     * 同步方法的锁对象是谁?
     * 就是实现类对象 new RunnableImpl()也是就是this
     */
    public synchronized void payTicket(){
        if (ticket > 0) {
            // 提高安全问题出现概率,睡眠
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName() + "正在卖第" + ticket + "张票");
            ticket--;
        }
    }

    /**
     * 同步方法等同于,该方法
     * 相当于将同步代码块封装成一个函数
     */
    public void pay (){
        synchronized (this){
            if (ticket > 0) {
                // 提高安全问题出现概率,睡眠
                try {
                    Thread.sleep(10);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println(Thread.currentThread().getName() + "正在卖第" + ticket + "张票");
                ticket--;
            }
        }
    }
}
