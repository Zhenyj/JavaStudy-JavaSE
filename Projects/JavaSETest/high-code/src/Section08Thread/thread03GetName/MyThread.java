package Section08Thread.thread03GetName;

/**
 * @author zyj
 * @create 2021-04-12 17:47
 */
public class MyThread extends Thread {
    @Override
    public void run() {
        //String name = getName();
        //System.out.println(name);
        Thread thread = currentThread();
        System.out.println(thread);
    }
}
