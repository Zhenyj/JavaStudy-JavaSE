package Section4.接口.demo02;

import Section4.接口.demo02.red.RedPacketFrame;

/**
 * @author zyj
 * @create 2021-03-15 17:08
 */
public class MyRed extends RedPacketFrame {

    /**
     * 父类没有无参构造方法,因此一定要去调用该构造方法
     * 构造方法：生成红包界面。
     *
     * @param title 界面的标题
     */
    public MyRed(String title) {
        super(title);
    }
}
