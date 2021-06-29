package Section4.接口.demo01;

/**
 * 鼠标类
 * @author zyj
 * @create 2021-03-10 21:46
 */
public class Mouse implements USB {
    @Override
    public void open() {
        System.out.println("打开鼠标");
    }

    @Override
    public void close() {
        System.out.println("关闭鼠标");
    }

    public  void click(){
        System.out.println("点击鼠标");
    }
}
