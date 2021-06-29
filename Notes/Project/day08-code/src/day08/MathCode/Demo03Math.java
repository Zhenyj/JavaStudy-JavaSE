package day08.MathCode;

/**
 * @author zyj
 * @create 2020-12-17 13:12
 * public static double abs(double num):获取绝对值。
 * public static double ceil(double num):向上取整。
 * public static double floor( double num):向下取整。
 * public static Long round( double num):四舍五入。
 *
 * Math.PI：近似圆周率
 */
public class Demo03Math {
    public static void main(String[] args) {
        //绝对值
        System.out.println(Math.abs(3.14));
        System.out.println(Math.abs(0));
        System.out.println(Math.abs(-2.5));
        System.out.println("=======================");

        //向上取整
        System.out.println(Math.ceil(3.9));
        System.out.println(Math.ceil(3.1));
        System.out.println(Math.ceil(3.0));
        System.out.println("=======================");

        //向下取整
        System.out.println(Math.floor(30.1));
        System.out.println(Math.floor(30.9));
        System.out.println(Math.floor(30.0));

        //四舍五入
        System.out.println(Math.round(20.4));
        System.out.println(Math.round(10.5));
        System.out.println("=======================");

        System.out.println(Math.PI);
    }
}
