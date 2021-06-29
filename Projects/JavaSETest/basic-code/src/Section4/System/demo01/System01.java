package Section4.System.demo01;

import java.util.Arrays;

/**
 * @author zyj
 * @create 2021-03-17 14:41
 */
public class System01 {
    public static void main(String[] args) {
        demo01();
        demo02();
    }

    /**
     * public static void arraycopy(Object src，int srcPos，object dest，int destPos，int length):将数组中指定的数据拷贝到另一个数组中。
     * 参数:
     *      src - 源数组。
     *      srcpos - 源数组中的起始位置。
     *      dest - 目标数组。
     *      destpos - 目标数据中的起始位置。
     *      Length - 要复制的数组元素的数量。
     */
    private static void demo02() {
        int [] src = {1,2,3,4,5};
        int [] dest = {6,7,8,9,10};
        System.out.println("复制前:"+ Arrays.toString(dest));
        //复制
        System.arraycopy(src, 0, dest, 0, 3);
        System.out.println("复制后:"+Arrays.toString(dest));
        System.out.println("==============================");
    }

    /**
     * public static long currentTimeMillis():返回以毫秒为单位的当前时间。
     * 用来测试程序的效率
     */
    private static void demo01() {
        long s = System.currentTimeMillis();
        for (int i = 1; i < 9999; i++) {
            System.out.println(i);
        }
        long e = System.currentTimeMillis();
        System.out.println("程序共耗时:"+(e-s));
        System.out.println("==============================");
    }
}
