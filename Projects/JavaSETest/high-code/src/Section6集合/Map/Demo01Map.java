package Section6集合.Map;

import java.util.HashMap;
import java.util.Map;

/**
 * Map的增删改查
 * @author zyj
 * @create 2021-03-25 15:22
 */
public class Demo01Map {
    public static void main(String[] args) {
        handle01();
        handle02();
        handle03();
        handle04();
    }

    private static void handle04() {
        Map<String,Integer> map = new HashMap<>();
        map.put("迪丽热巴",168);
        map.put("古力娜扎", 165);
        map.put("马尔扎哈", 185);

        boolean b1 = map.containsKey("迪丽热巴");
        System.out.println("是否含有迪丽热巴:"+b1);

        boolean b2 = map.containsKey("雷霆嘎巴");
        System.out.println("是否含有雷霆嘎巴:"+b2);
        System.out.println("===========================================");
    }

    private static void handle03() {
        Map<String,Integer> map = new HashMap<>();
        map.put("迪丽热巴",168);
        map.put("古力娜扎", 165);
        map.put("马尔扎哈", 185);

        Integer v1 = map.get("迪丽热巴");
        System.out.println("v1:"+v1);

        Integer v2 = map.get("雷霆嘎巴");
        System.out.println("v2:"+v2);
        System.out.println("===========================================");
    }

    private static void handle02() {
        Map<String,Integer> map = new HashMap<>();
        map.put("迪丽热巴",168);
        map.put("古力娜扎", 165);
        map.put("马尔扎哈", 185);
        System.out.println(map);

        // 根据key删除元素
        Integer v1 = map.remove("马尔扎哈");
        System.out.println("被删除元素的值v1:"+v1);
        System.out.println(map);

        Integer v2 = map.remove("雷霆嘎巴");//没有对应的key返回null,对元map集合无影响
        System.out.println("v2:"+v2);
        System.out.println(map);
        System.out.println("===========================================");
    }

    private static void handle01() {
        Map<String,String> map = new HashMap<>();
        String v1 = map.put("马尔扎哈", "迪丽热巴");
        System.out.println("v1:"+v1);

        String v2 = map.put("马尔扎哈", "雷霆嘎巴");//有重复的键,返回被替换的值;不存在key,返回null
        System.out.println("v2:"+v2);

        System.out.println(map);
        System.out.println("===========================================");
    }
}
