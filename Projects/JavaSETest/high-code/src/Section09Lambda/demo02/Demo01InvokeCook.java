package Section09Lambda.demo02;

/**
 @author zyj
 @create 2021-04-15 17:01
 需求:
 给定一个厨子Cook接口，内含唯一的抽象方法makeFood，且无参数、无返回值。
 使用Lambda的标准格式调用invokeCook方法，打印输出"吃饭啦!"字样
 */
public class Demo01InvokeCook {
    public static void main(String[] args) {
        /**
         * 使用Lambda表达式，简化匿名内部类的书写，并且该接口只能有一个抽象方法需要实现
         * 相当于讲Lambda表达式，作为匿名内部类的唯一一个需要重写的方法
         * 在由cook对象实现该重写的方法
         */
        invokeCook(()->{
            System.out.println("吃饭啦");
        });
    }

    private static void invokeCook(Cook cook){
        cook.makeFood();
    }
}
