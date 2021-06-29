package Section6集合.Collection.Set;

import java.util.HashSet;

/**
 * @author zyj
 * @create 2021-03-18 14:50
 *
 * java.util.set接extends collection接口set接口的特点:
 *      1.不允许存储重复的元素
 *      2.没有索引,没有带索引的方法,也不能使用普通的for循环遍历java.util.Hashset集合implements set接口
 * Hashset特点:
 *      1.不允许存储重复的元素
 *      2.没有索引没有带索引的方法,也不能使用普通的for循环遍历
 *      3.是一个无序的集合,存储元素和取出元素的顺序有可能不一致
 *      4.底层是一个哈希表结构(查询的速度非常的快)
 */
public class Set02 {
    public static void main(String[] args) {
        HashSet<String> set = new HashSet<>();
        String s1 = new String("abc");
        String s2 = new String("abc");
        set.add(s1);
        set.add(s2);
        set.add("重地");
        set.add("通话");
        set.add("abc");
        System.out.println(set);

    }
}
