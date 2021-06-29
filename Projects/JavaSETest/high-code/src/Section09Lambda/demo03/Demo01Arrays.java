package Section09Lambda.demo03;

import java.util.Arrays;
import java.util.Comparator;

/**
 @author zyj
 @create 2021-04-15 17:10

 Lambda表达式有参数有返回值的练习需求:
 使用数组存储多个Person对象
 对数组中的Person对象使用Arrays的sort方法通过年龄进行升序排序

 */
public class Demo01Arrays {
    public static void main(String[] args) {
        Person[] arr = {
                new Person("雷霆嘎巴", 38),
                new Person("马尔扎哈", 58),
                new Person("迪丽热巴", 18),
                new Person("古力娜扎", 20)
        };

        //对数组中的Person对象使用Arrays的sort方法通过年龄进行升序排序
        //Arrays.sort(arr, new Comparator<Person>() {
        //    @Override
        //    public int compare(Person o1, Person o2) {
        //        return o1.getAge() - o2.getAge();
        //    }
        //});

        //使用Lambda表达式简化匿名内部类
        Arrays.sort(arr, (Person o1,Person o2) -> {
            return o1.getAge() - o2.getAge();
        });
        for (Person person : arr) {
            System.out.println(person);
        }
    }
}
