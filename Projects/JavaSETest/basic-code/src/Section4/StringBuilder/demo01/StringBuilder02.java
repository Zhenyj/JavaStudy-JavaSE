package Section4.StringBuilder.demo01;

/**
 * @author zyj
 * @create 2021-03-17 14:53
 *
 * StringBulider的数组是可变的
 * String的数组是不可变的，final
 */
public class StringBuilder02 {
    public static void main(String[] args) {
        demo01();
    }

    /**
     * stringBuilder类的成员方法:
     *      public stringBuilder append(. ..):添加任意类型数据的字符串形式，并返回当前对象自身。参数:
     *      可以是任意的数据类型
     */
    private static void demo01() {
        StringBuilder bu1 = new StringBuilder();
        System.out.println("bu1:"+bu1);
        StringBuilder bu2 = bu1.append("abc");
        System.out.println("bu2:"+bu2);
        System.out.println("bu1:"+bu1);
        System.out.println(bu1==bu2);// true 说明两个对象是同个对象

        //使用append无需接收返回值
        //bu1.append("abc");
        //bu1.append(123);
        //bu1.append(true);
        //bu1.append(66.66);
        //bu1.append('中');
        //Section4.System.out.println("bu1:"+bu1);

        /**
         * 链式编程：:方法的返回值是一个对象,可以根据对象继续调用方法
         */
        bu1.append("abc").append(123).append(true).append(66.66).append('中');
        System.out.println("bu1:"+bu1);
        System.out.println("==============================");
    }
}
