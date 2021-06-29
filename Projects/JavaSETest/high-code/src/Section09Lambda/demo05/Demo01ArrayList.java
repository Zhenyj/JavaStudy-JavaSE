package Section09Lambda.demo05;

/**
 @author zyj
 @create 2021-04-15 17:29
 Lambda表达式:是可推导,可以省略
 凡是根据上下文推导出来的内容,都可以省略书写可以省略的内容:
 1.(参数列表):括号中参数列表的数据类型,可以省略不写
 2.(参数列表):括号中的参数如果只有一个,那么类型和()都可以省略
 3.{一些代码}:如果f中的代码只有一行,无论是否有返回值,都可以省略({}, return,分号)
 注意:要省略,return,分号必须一起省略

 */
public class Demo01ArrayList {
    public static void main(String[] args) {
        //使用匿名内部类的方式，实现多线程
        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println(Thread.currentThread().getName() + "新线程创建了");
            }
        }).start();
        //使用Lambda表达式,实现多线程new
        new Thread(() -> {
            System.out.println(Thread.currentThread().getName() + "新线程创建了");
        }).start();
        //优化省略Lambda
        new Thread(() -> System.out.println(Thread.currentThread().getName() + "新线程创建了")).start();

    }
}
