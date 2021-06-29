package Section6集合.Collection.List;

import java.util.ArrayList;
import java.util.List;

/**
 * @author zyj
 * @create 2021-03-17 21:13
 */
public class ArrayList01 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("a");
        list.add("b");
        list.add("c");
        list.add("d");
        list.add("a");
        //允许重复元素
        System.out.println(list);

        //public void add(int index，E element):将指定的元素，添加到该集合中的指定位置上。
        list.add(2, "x");
        System.out.println(list);

        //public E remove(int index):移除列表中指定位置的元素，返回的是被移除的元素。
        String remove = list.remove(4);
        System.out.println("被移除元素:"+remove);
        System.out.println(list);

        //public E set(int index,E element):用指定元素替换集合中指定位置的元素,返回值的更新前的元素。
        String setE = list.set(list.size() - 1, "A");
        System.out.println("被替换的元素:"+setE);
        System.out.println(list);

        //普通for循环
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
        System.out.println("-----------------------");
        //增强for
        for (String s : list) {
            System.out.println(s);
        }
    }
}
