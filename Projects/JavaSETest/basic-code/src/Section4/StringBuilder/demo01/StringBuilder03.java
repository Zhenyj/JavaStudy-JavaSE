package Section4.StringBuilder.demo01;

/**
 * @author zyj
 * @create 2021-03-17 14:53
 * stringBuiLder和string可以相互转换:
 *      string->stringBuilder:可以使用stringBuilder的构造方法
 *          Section4.StringBuilder(String str)）构造一个字符串生成器，并初始化为指定的字符串内容。
 *      stringBuilder->String:可以使用stringBuilder中的tostring方法
 *          public string toString():将当前stringBuilder对象转换为string对象。
 */
public class StringBuilder03 {
    public static void main(String[] args) {
        String str = new String("hello");
        System.out.println("str:"+str);
        StringBuilder bu = new StringBuilder(str);
        bu.append(" world!");
        System.out.println("bu:"+bu);
        String s = bu.toString();
        System.out.println("s:"+s);
    }
}
