package Section08Thread.thread10State.WaitAndNotify.example;

/**
 * @author zyj
 * @create 2021-04-15 14:50
 *
 * 生产者(包子铺)类:是一个线程类，可以继承Thread
 *      设置线程任务(run):生产包子
 *      对包子的状态进行判断
 *      true:有包子
 *          包子铺调用wait方法进入等待状态
 *      false:没有包子
 *          包子铺生产包子
 *      增加一些趣味性:交替生产两种包子有两种状态(i%2==0)
 *      包子铺生产好了包子
 *      修改包子的状态为true有
 *      唤醒吃货线程，让吃货线程吃包子
 *
 *      注意:
 *          包子铺线程和包子线程关系-->通信(互斥)
 *          必须同时同步技术保证两个线程只能有一个在执行
 *          锁对象必须保证唯一,可以使用包子对象作为锁对象
 *          包子铺类和吃货的类就需要把包子对象作为参数传递进来
 *              1.需要在成员位置创建一个包子变量
 *              2.使用带参数构造方法,为这个包子变量赋值
 */
public class BaoZiPu extends Thread {
    //需要在成员位置创建一个包子变量
    private BaoZi bz;

    public BaoZiPu() {
    }

    //使用带参数构造方法,为这个包子变量赋值
    public BaoZiPu(BaoZi bz) {
        this.bz = bz;
    }

    //设置线程任务(run):生产包子
    @Override
    public void run() {
        // 定义一个变量
        int count=0;
        // 让包子铺一直生产包子
        while (true){
            // 必须同时同步技术保证两个线程只能有一个在执行
            synchronized (bz){
                // 对包子状态进行判断
                if(bz.flag){
                    //包子铺调用wait()方法进入等待状态
                    try {
                        bz.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                // 被唤醒之后执行，包子铺生产包子
                //增加一些趣味性:交替生产两种包子有两种状态(i%2==0)
                if(count%2==0){
                    bz.pi="薄皮";
                    bz.xian = "三鲜馅";
                }else{
                    bz.pi="冰皮";
                    bz.xian = "牛肉大葱馅";
                }
                count++;
                System.out.println("包子铺生在生产:"+bz.pi+bz.xian+"包子");
                // 生产包子需要3秒钟
                try {
                    Thread.sleep(3000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                // 包子铺生产好了包子,修改包子的状态为true有
                bz.flag = true;
                bz.notify();
                System.out.println("包子铺已经生产好了:"+bz.pi+bz.xian+"包子");
            }
        }
    }
}
