package Section08Thread.thread09Lock;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @author zyj
 * @create 2021-04-14 8:15
 * 解决线程安全问题的三种方案:使用Lock锁java.utiL.concurrent.Locks.Lock接口 比synchronized更好
 * Lock实现提供了比使用synchronized 方法和语句可获得的更广泛的锁定操作。Lock接口中的方法:
 * void lock()获取锁。
 * void unLock()释放锁。
 * <p>
 * java.util.concurrent.Locks.ReentrantLock implements Lock接口
 * <p>
 * 使用步骤:
 * 1.在成员位置创建一个ReentrantLock对象
 * 2.在可能会出现安全问题的代码前调用Lock接口中的方法Lock获取锁
 * 3.在可能会出现安全问题的代码后调用Lock接口中的方法unLock释放锁
 */
public class RunnableImpl implements Runnable {
    private int ticket = 100;
    // 1.在成员位置创建一个ReentrantLock对象
    Lock l = new ReentrantLock();

    // 设置线程任务，卖票
    @Override
    public void run() {
        // 先判断是否还有票
        while (true) {
            //2.在可能会出现安全问题的代码前调用Lock接口中的方法Lock获取锁
            l.lock();
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
            //3.在可能会出现安全问题的代码后调用Lock接口中的方法unLock释放锁
            l.unlock();
        }
    }
}
