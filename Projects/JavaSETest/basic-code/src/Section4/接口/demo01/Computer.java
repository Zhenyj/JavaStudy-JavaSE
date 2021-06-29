package Section4.接口.demo01;

/**
 * 笔记本类
 * @author zyj
 * @create 2021-03-10 21:48
 *
 */
public class Computer {
    public void open(){
        System.out.println("开机");
    }

    public void close(){
        System.out.println("关机");
    }

    public void useDevice(USB usb){
        usb.open();
        if(usb instanceof Mouse){
            Mouse mouse = (Mouse) usb;
            mouse.click();
        }
        if(usb instanceof KeyBoard){
            KeyBoard  keyBoard = (KeyBoard) usb;
            keyBoard.click();
        }
        usb.close();
    }
}
