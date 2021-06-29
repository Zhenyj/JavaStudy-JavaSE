package Section4.接口.demo01;

/**
 * @author zyj
 * @create 2021-03-10 21:56
 */
public class Demo {
    public static void main(String[] args) {
        Computer computer = new Computer();
        computer.open();

        // 新建一个鼠标对象，向上转型
        USB usbMouse = new Mouse();//多态写法
        computer.useDevice(usbMouse);
        //创建一个键盘
        KeyBoard keyBoard = new KeyBoard();
        // 方法参数是USB类型，传递参数是实现类会自动向上转型
        computer.useDevice(keyBoard);//正确写法
        computer.close();
    }
}
