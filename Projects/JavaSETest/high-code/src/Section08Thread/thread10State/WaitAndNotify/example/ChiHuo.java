package Section08Thread.thread10State.WaitAndNotify.example;

/**
 * @author zyj
 * @create 2021-04-15 15:15
 * 消费者(吃货)类:是一个线程类,可以继承Thread设需线程任务(run) :吃包子
 *      对包子的状态进行判断
 *      false:没有包子
 *          吃货调用wait方法进入等待状态
 *      true:有包子
 *          吃货吃包子
 *          吃货吃完包子
 *          修改包子的状态为false没有
 *          吃货唤醒包子铺线程,生产包子
 */
public class ChiHuo extends Thread {
    //需要在成员位置创建一个包子变量
    private BaoZi bz;

    public ChiHuo() {
    }

    //使用带参数构造方法,为这个包子变量赋值
    public ChiHuo(BaoZi bz) {
        this.bz = bz;
    }

    @Override
    public void run() {
        while (true) {
            synchronized (bz) {
                if (!bz.flag) {
                    //没有包子,吃货调用wait方法进入等待状态
                    try {
                        bz.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                System.out.println("吃货正在吃:" + bz.pi + bz.xian + "包子");
                System.out.println("=====================================");
                //吃货吃完包子
                // 修改包子状态
                bz.flag = false;
                // 唤醒包子铺线程开始生产包子
                bz.notify();
                //
                try {
                    bz.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
