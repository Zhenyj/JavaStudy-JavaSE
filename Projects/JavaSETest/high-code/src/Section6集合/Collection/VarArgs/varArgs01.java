package Section6集合.Collection.VarArgs;

/**
 * @author zyj
 * @create 2021-03-18 15:35
 *
 * 在JDK1.5之后，如果我们定义一个方法需要接受多个参数，并且多个参数类型一致，我们可以对其简化成如下格式：
 *      修饰符 返回值类型 方法名(参数类型... 形参名){  }
 *
 * 可变参数的注意事项
 *      1.一个方法的参数列表,只能有一个可变参数
 *      2.如果方法的参数有多个,那么可变参数必须写在参数列表的末尾
 *
 */
public class varArgs01 {
    public static void main(String[] args) {
        int sum = demo01(10,20);
        System.out.println(sum);
        int[] ints = {10,20,30,40,50,60};
        sum = demo01(ints);
        System.out.println(sum);
    }

    private static int demo01(int... ints) {
        int sum = 0;
        for (int i : ints) {
            sum+=i;
        }
        return sum;
    }
}
