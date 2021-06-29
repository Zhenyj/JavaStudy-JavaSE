package Section6集合.Collection.Set;

import java.util.HashSet;
import java.util.Set;

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
public class Set01 {
    public static void main(String[] args) {
        Set<Integer> set = new HashSet<>();
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(1);
        System.out.println(set);
    }
}
