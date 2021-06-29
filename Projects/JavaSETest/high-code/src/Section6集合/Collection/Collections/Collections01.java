package Section6集合.Collection.Collections;

import java.util.ArrayList;
import java.util.Collections;

/**
 * @author zyj
 * @create 2021-03-18 15:43
 * java.utils.collections是集合工具类，用来对集合进行操作。部分方法如下:
 *      public static <T> boolean addAlL(collection<T> c,T... elements):往集合中添加一些元素。
 *      public static void shuffle(List<?> list)打乱顺序:打乱集合顺序。
 */
public class Collections01 {
    public static void main(String[] args) {
        ArrayList<String> arr = new ArrayList<>();
        arr.add("a");
        arr.add("b");
        arr.add("c");
        Collections.addAll(arr, "d","e","f","g","h");
        System.out.println(arr);

        Collections.shuffle(arr);
        System.out.println("打乱后的:"+arr);
    }
}
