package Section4.Date.demo02;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author zyj
 * @create 2021-03-17 10:27
 */
public class DemoDateFormat {
    public static void main(String[] args) {
        handle01();
        try {
            handle02();
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }

    private static void handle02() throws ParseException {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy年MM月dd日 HH时mm分ss秒");
        Date parse = simpleDateFormat.parse("2021年03月17日 10时35分55秒");
        System.out.println(parse);
    }

    private static void handle01(){
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date date = new Date();
        String dateText =  simpleDateFormat.format(date);
        System.out.println(dateText);
    }
}
