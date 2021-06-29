package Section6集合.Collection.Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/**
 * @author zyj
 * @create 2021-03-18 15:43
 *
 * comparator和comparabLe的区别
 *      Comparable:自己(this)和别人(参数)比较,自己需要实现Comparable接口,重写比较的规则compareTo方法
 *      Comparator:相当于找一个第三方的裁判,比较两个
 */
public class Collections02 {
    public static void main(String[] args) {
        Person p1 = new Person("马尔扎哈",36);
        Person p2 = new Person("雷霆嘎巴",35);
        ArrayList<Person> list = new ArrayList<>();
        list.add(p1);
        list.add(p2);
        Collections.sort(list, new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                //o1-o2升序, o2-o1降序
                return o1.getAge() - o2.getAge();
            }
        });
        System.out.println(list);

        Person p3 = new Person("b迪丽热巴",18);
        Person p4 = new Person("a古力娜扎",18);
        list.add(p3);
        list.add(p4);
        Collections.sort(list, new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                int res = o1.getAge()-o2.getAge();
                if(res==0){
                    res = o1.getName().charAt(0) - o2.getName().charAt(0);
                }
                return res;
            }
        });
        System.out.println(list);

    }
}

class Person implements Comparable<Person> {
    private String name;
    private Integer age;

    public Person() {
    }

    public Person(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public int compareTo(Person o) {
        return o.getAge()-this.getAge();
    }

    @Override
    public String
    toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
