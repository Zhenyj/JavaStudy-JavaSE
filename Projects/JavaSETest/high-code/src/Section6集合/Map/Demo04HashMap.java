package Section6集合.Map;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * @author zyj
 * @create 2021-03-25 16:46
 */
public class Demo04HashMap {
    public static void main(String[] args) {
        handle01();
        handle02();
    }

    private static void handle02() {
        Map<Person,String> map = new HashMap<>();
        map.put(new Person("迪丽热巴",18), "北京");
        map.put(new Person("古力娜扎",19), "上海");
        map.put(new Person("马尔扎哈",25), "广州");
        map.put(new Person("迪丽热巴",18), "上海");
        // Person重写hashCode和equals方法
        Set<Person> people = map.keySet();
        for (Person person : people) {
            System.out.println(person+"-->"+map.get(person));
        }

        System.out.println("======================================");
    }

    private static void handle01() {
        Map<String,Person> map = new HashMap<>();
        map.put("北京", new Person("迪丽热巴",18));
        map.put("上海", new Person("古力娜扎",19));
        map.put("广州", new Person("雷霆嘎巴",25));
        map.put("北京", new Person("马尔扎哈",30));

        Set<String> set = map.keySet();
        for (String s : set) {
            System.out.println(s+"="+map.get(s));
        }
        System.out.println("======================================");
    }
}
