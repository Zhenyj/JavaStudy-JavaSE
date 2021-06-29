package Section4.StringBuilder.demo01;

/**
 * @author zyj
 * @create 2021-03-17 14:53
 *
 * StringBulider的数组是可变的
 * String的数组是不可变的，final
 */
public class StringBuilder01 {
    public static void main(String[] args) {
        StringBuilder bu1 = new StringBuilder();
        System.out.println("bu1:"+bu1);
        StringBuilder bu2 = new StringBuilder("abc");
        System.out.println("bu2:"+bu2);
    }
}
