package Section6集合.Collection.Generic;

/**
 * @author zyj
 * @create 2021-03-17 18:42
 */
public class GenericInterfaceImpl1 implements GenericInterface<String> {
    @Override
    public void method1(String s) {
        System.out.println(s);
    }
}
