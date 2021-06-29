package Section6集合.Collection.Generic;

/**
 * @author zyj
 * @create 2021-03-17 18:28
 */
public class GenericClass01 {
    public static void main(String[] args) {
        //创建GenericClass对象， 泛型使用String类型
        GenericClass<String> g1 = new GenericClass<>();
        g1.setName("马尔扎哈");
        System.out.println(g1.getName());
        //创建GenericClass对象， 泛型使用Integer类型
        GenericClass<Integer> g2 = new GenericClass<>();
        g2.setName(1111);
        System.out.println(g2.getName());

        //不写泛型，默认Obeject类型
        GenericClass g3 = new GenericClass();
        g3.setName("只能是字符串");
        System.out.println(g3.getName());
    }
}
