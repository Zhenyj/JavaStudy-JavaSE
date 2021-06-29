package Section6集合.Map;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * @author zyj
 * @create 2021-03-25 16:36
 *
 * Map集合遍历的第二种方式:使用Entry对象遍历
 * Map集合中的方法:
 * set<Nap.Entry<K,V>> entrySet()返回此映射中包含的映射关系的Set 视图。
 * 实现步骤:
 *      1.使用ap集合中的方法entrySet(),把Aap集合中多个Entry对象取出来,存储到一个set集合中
 *      2.遍历set集合,获取每一个Entry对象
 *      3.使用Entry对象中的方法getKey()和getvalue()获取键与值
 */
public class Demo03EntrySet {
    public static void main(String[] args) {
        Map<String,Integer> map = new HashMap<>();
        map.put("迪丽热巴",168);
        map.put("古力娜扎", 165);
        map.put("马尔扎哈", 185);
        map.put("雷霆嘎巴", 190);

        Set<Map.Entry<String, Integer>> entrySet = map.entrySet();
        for (Map.Entry<String, Integer> entry : entrySet) {
            System.out.println(entry.getKey()+"="+entry.getValue());
        }
    }
}
