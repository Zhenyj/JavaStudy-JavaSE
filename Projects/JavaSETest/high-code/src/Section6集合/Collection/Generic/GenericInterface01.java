package Section6集合.Collection.Generic;

/**
 * @author zyj
 * @create 2021-03-17 18:46
 */
public class GenericInterface01 {
    public static void main(String[] args) {
        GenericInterfaceImpl1 g1 = new GenericInterfaceImpl1();
        g1.method1("车轮滚滚");

        GenericInterface<Integer> g2=  new GenericInterfaceImpl2<>();
        g2.method1(9999);
    }
}
