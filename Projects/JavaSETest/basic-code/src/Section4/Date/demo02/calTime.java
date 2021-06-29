package Section4.Date.demo02;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;


/**
 * @author zyj
 * @create 2021-03-17 10:39
 * 计算出生多少天
 */
public class calTime {
    public static void main(String[] args) {
        cal();

    }

    private static void cal() {
        System.out.println("请输入出生日期  格式 YYYY-MM-dd");
        Scanner sc = new Scanner(System.in);
        String burnDate = sc.next();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
        Date date = new Date();
        try {
            Date burn = simpleDateFormat.parse(burnDate);
            long time =  date.getTime() -burn.getTime();
            long totalDay = time / 86400/1000;
            System.out.println("您已出生"+totalDay+"天");
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }
}
