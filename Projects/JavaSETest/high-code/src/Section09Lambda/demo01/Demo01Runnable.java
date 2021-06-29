package Section09Lambda.demo01;

/**
 @author zyj
 @create 2021-04-15 16:28

 使用实现Runnable接口的方式实现多线程程序
 */
public class Demo01Runnable {
    public static void main(String[] args) {
        // 创建Runnable接口的实现对象
        RunnableImpl r1 = new RunnableImpl();
        // 创建Thread类对象，构造方法中传递Runnable对象
        Thread t1 = new Thread(r1);
        // 开启线程
        t1.start();

        // 简化代码，使用匿名内部类，实现多线程程序
        Runnable r2 = new Runnable() {
            @Override
            public void run() {
                System.out.println(Thread.currentThread().getName() + "新线程创建了");
            }
        };
        new Thread(r2).start();

        // 继续简化代码
        new Thread(new Runnable(){
            @Override
            public void run() {
                System.out.println(Thread.currentThread().getName() + "新线程创建了");
            }
        }).start();
    }
}
