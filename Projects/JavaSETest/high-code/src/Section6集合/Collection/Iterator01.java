package Section6集合.Collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/**
 * @author zyj
 * @create 2021-03-17 16:57
 *
 * 迭代器
 */
public class Iterator01 {
    public static void main(String[] args) {
        Collection<String> c = new ArrayList<>();
        c.add("迪丽热巴");
        c.add("古力娜扎");
        c.add("马尔扎哈");
        c.add("雷霆嘎巴");

        //增强for循环就是利用迭代器
        Iterator<String> iterator = c.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
