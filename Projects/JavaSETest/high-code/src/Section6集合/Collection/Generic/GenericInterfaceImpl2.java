package Section6集合.Collection.Generic;

/**
 * @author zyj
 * @create 2021-03-17 18:42
 */
public class GenericInterfaceImpl2<I> implements GenericInterface<I> {
    @Override
    public void method1(I i) {
        System.out.println(i);
    }
}
