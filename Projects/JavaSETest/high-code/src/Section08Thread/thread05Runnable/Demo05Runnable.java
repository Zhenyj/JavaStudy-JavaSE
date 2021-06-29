package Section08Thread.thread05Runnable;

/**
 * @author zyj
 * @create 2021-04-12 17:58
 *
 * 创建多线程程序的第二种方式:实现Runnable接口
 * java.lang.Runnable
 *      Runnable接口应该由那些打算通过某一线程执行其实例的类来实现。类必须定义一个称为run 的无参数方法。
 * java.Lang.Thread类的构造方法
 *      Thread (Runnable target)分配新的Thread 对象。
 *      Thread(Runnable target,string name)分配新的Thread 对象。
 * 实现步骤:
 *      1.创建一个Runnable接口的实现类
 *      2.在实现类中重写Runnable接口的run方法,设置线程任务
 *      3.创建一个Runnable接口的实现类对象
 *      4.创建Thread类对象,构造方法中传递Runnable接口的实现类对象
 *      5.调用Thread类中的start方法,开启新的线程执行run方法
 * 实现Runnable接口创建多线程程序的好处:
 *      1.避免了单继承的局限性
 *          一个类只能继承一个类(一个人只能有一个亲爹),类继承了Thread类就不能继承其他的类
 *          实现了RunnabLe接口,还可以继承其他的类,实现其他的接口
 *      2.增强了程序的扩展性,降低了程序的耦合性(解耦)
 *          实现Runnabte接口的方式,把设置线程任务和开启新线程进行了分离(解耦)
 *          实现类中,重写了run方法:用来设置线程任务
 *          创建Thread类对象,调用start方法:用来开启新线程
 */
public class Demo05Runnable {
    public static void main(String[] args) {
        //创建一个Runnable接口的实现类对象
        RunnableImpl runnable = new RunnableImpl();
        //创建Thread类对象,构造方法中传递Runnable接口的实现类对象
        //Thread thread = new Thread(runnable);
        //thread.setName("runnable");
        // 传不同的Runnable就可以实现不同的线程任务
        Thread thread = new Thread(new RunnableImpl2());
        //调用Thread类中的start方法,开启新的线程执行run方法
        thread.start();
        //主线程的
        for (int i = 0; i < 20; i++) {
            System.out.println(Thread.currentThread().getName()+"-->"+i);
        }
    }
}
