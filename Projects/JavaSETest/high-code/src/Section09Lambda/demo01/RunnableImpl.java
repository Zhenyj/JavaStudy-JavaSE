package Section09Lambda.demo01;

/**
 @author zyj
 @create 2021-04-15 16:29
 */
public class RunnableImpl implements Runnable {

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName()+"新线程创建了");
    }
}
