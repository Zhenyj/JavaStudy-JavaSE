package Section6集合.Collection.HashCode;

/**
 * @author zyj
 * @create 2021-03-18 14:53
 *
 * 哈希值:是一个十进制的整数,由系统随机给出(就是对象的地址值,是一个逻辑地址,是模拟出来得到地址,不是数据实际存储的物理地址)
 * 在object类有一个方法,可以获取对象的哈希值
 *      int hashcode()返回该对象的哈希码值。hashcode方法的源码;
 *      public native int hashcode();
 *      native:代表该方法调用的是本地操作系统的方法
 */
public class HashCode01 {
    public static void main(String[] args) {
        Person person1 = new Person();
        System.out.println(person1.hashCode());

        Person person2 = new Person();
        System.out.println(person2.hashCode());

        /**
         *
         * String类重写了HashCode方法
         */
        String s1 = new String("abcd");
        String s2 = new String("abcd");
        System.out.println(s1.hashCode());
        System.out.println(s2.hashCode());
    }
}
