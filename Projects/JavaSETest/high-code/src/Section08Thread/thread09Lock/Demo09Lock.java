package Section08Thread.thread09Lock;

/**
 * @author zyj
 * @create 2021-04-14 15:06
 */
public class Demo09Lock {
    public static void main(String[] args) {
        RunnableImpl r = new RunnableImpl();
        new Thread(r).start();
        new Thread(r).start();
        new Thread(r).start();
    }
}
