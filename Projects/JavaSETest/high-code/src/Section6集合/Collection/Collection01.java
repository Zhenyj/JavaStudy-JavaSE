package Section6集合.Collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

/**
 * @author zyj
 * @create 2021-03-17 16:30
 */
public class Collection01 {
    public static void main(String[] args) {
        Collection<String> coll = new ArrayList<>();
        coll.add("迪丽热巴");
        coll.add("古力娜扎");
        coll.add("马尔扎哈");
        coll.add("雷霆嘎巴");
        System.out.println(coll);
        System.out.println(coll.contains("雷霆嘎巴"));

        coll.remove("马尔扎哈");
        System.out.println(coll);

        System.out.println("集合中有"+coll.size()+"个元素");
        Object [] obj = coll.toArray();
        //for (Object o : obj) {
        //    System.out.println(o);
        //}
        System.out.println(Arrays.toString(obj));

        coll.clear();
        System.out.println("集合是否为空:"+coll.isEmpty());

    }
}
