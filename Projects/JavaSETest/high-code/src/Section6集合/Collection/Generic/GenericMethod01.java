package Section6集合.Collection.Generic;

/**
 * @author zyj
 * @create 2021-03-17 18:28
 */
public class GenericMethod01 {
    public static void main(String[] args) {
        GenericMethod g = new GenericMethod();
        g.method01("name");
        g.method01(100);
        g.method01(true);
        g.method01(66.66);
        g.method01("中");
        System.out.println("================================");
        GenericMethod.method2("静态方法");
    }
}
