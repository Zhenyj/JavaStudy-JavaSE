package Section08Thread.thread08synchronized;

/**
 * @author zyj
 * @create 2021-04-14 10:12
 */
public class RunnableImpl3 implements Runnable {

    private static int ticket = 100;

    @Override
    public void run() {
        // 先判断是否还有票
        while (true) {
            //payTicketStatic();
            pay();
        }
    }

    /**
     * 静态的同步方法锁对象是谁?不能是this
     * this是创建对象之后产生的,静态方法优先于对象
     * 静态方法的锁对象是本类的cLass属性-->class文件对象(反射)
     */
    public static synchronized void payTicketStatic(){
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
    }

    /**
     * 与上述payTicketStatic等同
     */
    public static void pay(){
        synchronized (RunnableImpl3.class){
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
        }
    }
}
