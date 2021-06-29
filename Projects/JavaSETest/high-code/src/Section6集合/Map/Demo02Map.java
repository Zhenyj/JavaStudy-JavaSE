package Section6集合.Map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/**
 * Map遍历
 * @author zyj
 * @create 2021-03-25 16:14
 */
public class Demo02Map {
    public static void main(String[] args) {
        Map<String,Integer> map = new HashMap<>();
        map.put("迪丽热巴",168);
        map.put("古力娜扎", 165);
        map.put("马尔扎哈", 185);
        map.put("雷霆嘎巴", 190);

        Set<String> set = map.keySet();
        Iterator<String> iterator = set.iterator();
        while (iterator.hasNext()){
            String key = iterator.next();
            Integer v = map.get(key);
            System.out.println(key+"="+v);
        }
        System.out.println("=====================================");

        // 增强for
        for (String key : set) {
            Integer v = map.get(key);
            System.out.println(key+"="+v);
        }
    }
}
