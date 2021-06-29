package Section4.Calendar.demo01;

import java.util.Calendar;
import java.util.Date;

/**
 * @author zyj
 * @create 2021-03-17 10:56
 */
public class Calendar02 {
    public static void main(String[] args) {
        demo01();
        demo02();
        demo03();
        demo04();
    }

    /**
     * getTime()
     */
    private static void demo04() {
        Calendar c = Calendar.getInstance();

        Date time = c.getTime();
        System.out.println(time);
        System.out.println("==============================");
    }

    /**
     * add()
     */
    private static void demo03() {
        Calendar c = Calendar.getInstance();
        c.add(Calendar.YEAR,1); // 正数增加，负数减少
        c.add(Calendar.MONTH,-1);
        int year = c.get(Calendar.YEAR);
        System.out.println(year);
        int month = c.get(Calendar.MONTH);
        System.out.println(month);
        System.out.println("==============================");
    }

    private static void demo02() {
        Calendar c = Calendar.getInstance();

        //设置 日历
        c.set(2000, 5, 5);

        int year = c.get(Calendar.YEAR);
        System.out.println(year);

        int month = c.get(Calendar.MONTH)+1;
        System.out.println(month);

        int date = c.get(Calendar.DATE);
        System.out.println(date);

        System.out.println("==============================");
    }

    private static void demo01() {
        Calendar c = Calendar.getInstance();

        int year = c.get(Calendar.YEAR);
        System.out.println(year);

        int month = c.get(Calendar.MONTH)+1;
        System.out.println(month);

        int date = c.get(Calendar.DATE);
        System.out.println(date);

        System.out.println("==============================");
    }
}
