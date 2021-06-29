package Section08Thread.thread11ThreadPool;

/**
 @author zyj
 @create 2021-04-15 15:56

 2.创建一个类,实现Runnable接口,重写run方法,设置线程任务
 */
public class RunnableImpl implements Runnable {
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName()+"创建了一个新的线程");
    }
}
