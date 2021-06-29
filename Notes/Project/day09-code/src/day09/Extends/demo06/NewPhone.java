package day09.Extends.demo06;

/**
 * @author zyj
 * @create 2020-12-17 14:14
 */
public class NewPhone extends Phone {
    @Override
    public void show() {
        //应用父类原本的show方法
        super.show();
        //再添加新的功能
        System.out.println("显示姓名");
        System.out.println("显示头像");
    }
}
