package Section6集合.Collection.Set;

import java.util.HashSet;

/**
 * @author zyj
 * @create 2021-03-18 15:17
 *
 * Hashset存储自定义类型元素
 * set集合报错元素唯一:
 *      存储的元素(String,Integer, . . .Student,Person.. .),必须重写hashcode方法和equals方法
 * 要求:
 *      同名同年龄的人,视为同一个人,只能存储一次
 */
public class HashSet01 {
    public static void main(String[] args) {
        HashSet<Person> set = new HashSet<>();
        Person p1 = new Person("马尔扎哈",25);
        Person p2 = new Person("迪丽热巴",23);
        Person p3 = new Person("雷霆嘎巴",40);
        Person p4 = new Person("马尔扎哈",25);
        set.add(p1);
        set.add(p2);
        set.add(p3);
        set.add(p4);
        System.out.println(set);
    }
}
