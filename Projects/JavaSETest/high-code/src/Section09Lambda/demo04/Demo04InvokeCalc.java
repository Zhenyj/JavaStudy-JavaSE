package Section09Lambda.demo04;

/**
 @author zyj
 @create 2021-04-15 17:24
 Lambda表达式有参数有返回值的练习需求:
 给定一个计算器calculator接口，内含抽象方法calc可以将两个int数字相加得到和值
 使用Lambda的标准格式调用invokeCalc方法，完成120和130的相加计算

 */
public class Demo04InvokeCalc {
    public static void main(String[] args) {
        invokeCalc(120, 130, (a,b)->a+b);
    }

    private static void invokeCalc(int a, int b, Calculator calculator) {
        int result = calculator.calc(a, b);
        System.out.println(a + "+" + b + "=" + result);
    }
}
