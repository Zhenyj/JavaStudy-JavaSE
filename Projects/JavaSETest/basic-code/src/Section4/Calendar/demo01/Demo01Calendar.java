package Section4.Calendar.demo01;

import java.util.Calendar;

/**
 * @author zyj
 * @create 2021-03-17 10:52
 */
public class Demo01Calendar {
    public static void main(String[] args) {
        Calendar calendar = Calendar.getInstance();//多态，反射创建对象
        System.out.println(calendar);
    }
}
