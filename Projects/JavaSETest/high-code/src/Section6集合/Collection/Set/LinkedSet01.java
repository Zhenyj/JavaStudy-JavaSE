package Section6集合.Collection.Set;

import java.util.HashSet;
import java.util.LinkedHashSet;

/**
 * @author zyj
 * @create 2021-03-18 15:32
 */
public class LinkedSet01 {
    public static void main(String[] args) {
        HashSet<String> set = new HashSet<>();
        set.add("www");
        set.add("abc");
        set.add("abc");
        set.add("itcast");
        System.out.println("HashSet:"+set);//无序

        LinkedHashSet<String> linked = new LinkedHashSet<>();
        linked.add("www");
        linked.add("abc");
        linked.add("abc");
        linked.add("itcast");
        System.out.println("LinkedHashSet:"+linked);//有序

    }
}
