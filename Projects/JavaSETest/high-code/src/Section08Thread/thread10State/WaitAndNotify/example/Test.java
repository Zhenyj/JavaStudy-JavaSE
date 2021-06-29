package Section08Thread.thread10State.WaitAndNotify.example;

/**
 @author zyj
 @create 2021-04-15 15:28
 */
public class Test {
    public static void main(String[] args) {
        // 创建包子锁对象
        BaoZi bz = new BaoZi();
        // 创建包子铺线程
        BaoZiPu bzp = new BaoZiPu(bz);
        // 创建吃货线程
        ChiHuo ch = new ChiHuo(bz);
        bzp.start();
        ch.start();
    }
}
