package Section6集合.Collection.List;

import java.util.LinkedList;

/**
 * @author zyj
 * @create 2021-03-18 8:27
 */
public class LinkedList01 {
    public static void main(String[] args) {
        LinkedList<String> l = new LinkedList<>();
        l.add("马尔扎哈");
        l.add("雷霆嘎巴");
        System.out.println(l);
        System.out.println("-------------------------");
        // 在首位添加addFirst等效于push
        l.addFirst("摩托罗拉");
        System.out.println(l);
        l.push("古力娜扎");
        System.out.println(l);
        System.out.println("-------------------------");
        // 在末位添加,等效去add()方法
        l.addLast("迪丽热巴");
        System.out.println(l);
        System.out.println("-------------------------");
        // 删除首位
        String pop = l.pop();
        System.out.println("被删除元素:" + pop);
        System.out.println(l);
        // 获取首位元素
        String first = l.getFirst();
        System.out.println("首位元素:"+first);
        // 获取某位元素
        String last = l.getLast();
        System.out.println("末位元素:"+last);
    }
}
