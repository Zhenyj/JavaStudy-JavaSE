package Section08Thread.thread10State.WaitAndNotify;

/**
 * @author zyj
 * @create 2021-04-15 10:05
 * 进入到Timewaiting(计时等待)有两种方式
 * 1.使用sleep(Long m)方法,在毫秒值结束之后,线程睡醒进入到Runnable/BLocked状态
 * 2.使用wait(lLong m)方法, wait方法如果在毫秒值结束之后,还没有被notify唤醒,就会自动醒来,线程睡醒进入到Runnable/BLocked状态
 *
 * 唤醒方法：
 *      void notify()随机唤醒在此对象监视器上等待的单个线程。
 *      void notifyAll()唤醒在此对象监视器上等待的所有线程。
 */
public class Demo03 {
    public static void main(String[] args) {
        // 创建锁对象，保证唯一
        Object obj = new Object();

        //顾客1
        new Thread() {
            @Override
            public void run() {
                while (true) {
                    synchronized (obj) {
                        System.out.println("顾客1告知老板买的包子的种类和数量");
                        try {
                            obj.wait();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        // 唤醒之后执行的代码
                        System.out.println("顾客1包子好了,开荤");
                        System.out.println("=========================");
                    }
                }
            }
        }.start();

        // 顾客2
        new Thread() {
            @Override
            public void run() {
                while (true) {
                    synchronized (obj) {
                        System.out.println("顾客2告知老板买的包子的种类和数量");
                        try {
                            obj.wait();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        // 唤醒之后执行的代码
                        System.out.println("顾客2包子好了,开荤");
                        System.out.println("=========================");
                    }
                }
            }
        }.start();

        //创建一个老板线程
        new Thread() {
            public void run() {
                while (true) {
                    try {
                        // 花5秒做包子
                        Thread.sleep(5000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    synchronized (obj) {
                        System.out.println("老板5秒钟之后做好包子，告知顾客");
                        obj.notifyAll();// 唤醒全部等待的线程
                    }
                }
            }
        }.start();
    }
}
