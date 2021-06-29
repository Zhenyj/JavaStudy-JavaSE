package Section6集合.Map;

import java.util.HashMap;
import java.util.LinkedHashMap;

/**
 * @author zyj
 * @create 2021-03-26 9:49
 *
 * HashMap是无序的
 * LinkedHashMap是有序的
 */
public class Demo05LinkedHashMap {
    public static void main(String[] args) {
        HashMap<String,String> map = new HashMap<>();
        map.put("a", "a");
        map.put("c", "c");
        map.put("b", "b");
        map.put("d", "d");
        System.out.println(map);

        HashMap<String,String> linkedMap = new LinkedHashMap<>();
        linkedMap.put("a", "a");
        linkedMap.put("c", "c");
        linkedMap.put("b", "b");
        linkedMap.put("d", "d");
        System.out.println(linkedMap);
    }
}
