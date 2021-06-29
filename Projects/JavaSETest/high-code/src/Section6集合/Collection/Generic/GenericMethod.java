package Section6集合.Collection.Generic;

/**
 * @author zyj
 * @create 2021-03-17 18:34
 *
 * 定义含有泛型的方法
 *      格式：修饰符 <泛型> 返回值类型 方法名(方法的参数列表(使用泛型)){ 方法体 }
 *      再调用方法时，确定泛型的数据类型
 */
public class GenericMethod {
    public <M> void method01(M m){
        System.out.println(m);
    }

    public static <M> void method2(M m){
        System.out.println(m);
    }
}
