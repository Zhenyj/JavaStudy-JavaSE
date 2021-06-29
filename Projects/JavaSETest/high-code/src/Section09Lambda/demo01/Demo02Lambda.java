package Section09Lambda.demo01;

/**
 @author zyj
 @create 2021-04-15 16:53
 */
public class Demo02Lambda {
    public static void main(String[] args) {
        // 使用匿名内部类方式，实现多线程
        new Thread(new Runnable(){
            @Override
            public void run() {
                System.out.println(Thread.currentThread().getName() + "新线程创建了");
            }
        }).start();

        // 使用Lambda表达式，实现多线程,类似JS的箭头函数
        new Thread(()->{
            System.out.println(Thread.currentThread().getName() + "新线程创建了");
        }).start();
    }
}
