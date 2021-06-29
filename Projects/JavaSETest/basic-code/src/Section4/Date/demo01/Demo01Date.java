package Section4.Date.demo01;

import java.util.Date;

/**
 * @author zyj
 * @create 2021-03-17 10:09
 */
public class Demo01Date {
    public static void main(String[] args) {
        handle01();
        handle02();
        handle03();
    }

    /**
     * Section4.Date.getTime()
     * 将日期转为毫秒值
     */
    private static void handle03() {
        System.out.println(new Date().getTime());
    }

    /**
     * 带参构造
     *      Section4.Date(long date)毫秒值
     *      将毫秒值转为日期
     */
    private static void handle02() {
        Date date = new Date(0L);
        System.out.println("东八区："+ date);
    }

    /**
     * 无参构造函数
     */
    private static void handle01() {
        Date date = new Date();
        System.out.println(date);
    }
}
