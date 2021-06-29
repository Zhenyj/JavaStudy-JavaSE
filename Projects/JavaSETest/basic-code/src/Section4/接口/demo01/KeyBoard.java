package Section4.接口.demo01;

/**
 * 键盘类
 * @author zyj
 * @create 2021-03-10 21:46
 */
public class KeyBoard implements USB {
    @Override
    public void open() {
        System.out.println("打开键盘");
    }

    @Override
    public void close() {
        System.out.println("关闭键盘");
    }

    public  void click(){
        System.out.println("敲击键盘");
    }
}
