package Section6集合.Collection.Generic;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * @author zyj
 * @create 2021-03-17 18:59
 *
 * 通配符
 */
public class generic01 {
    public static void main(String[] args) {
        ArrayList<String> as = new ArrayList<>();
        as.add("迪丽热巴");
        as.add("古力娜扎");
        as.add("马尔扎哈");
        as.add("雷霆嘎巴");
        printArray(as);

        ArrayList<Integer> ai = new ArrayList<>();
        ai.add(123);
        ai.add(456);
        ai.add(789);
        printArray(ai);
    }

    /**
     * 泛型通配符 ? 可以接受任意类型
     * @param list
     */
    private static void printArray(ArrayList<?> list) {
        Iterator<?> it = list.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }
    }
}
