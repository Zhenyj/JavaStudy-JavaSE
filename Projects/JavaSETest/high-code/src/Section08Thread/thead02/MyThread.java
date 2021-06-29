package Section08Thread.thead02;

/**
 * @author zyj
 * @create 2021-04-12 17:29
 */
public class MyThread extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 20; i++) {
            System.out.println("run:"+i);
        }
    }
}
