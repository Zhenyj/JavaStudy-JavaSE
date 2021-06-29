package Section11递归.demo02;

import java.util.Scanner;

/**
 @author zyj
 @create 2021-04-16 9:53

 递归求1-n和
 已知:
 最大值:n
 最小值:1
 使用递归必须明确:
    1.递归的结束条件
        获取到1的时候结束
    2.递归的目的
        获取下一个被加的数字(n-1)
 */
public class Demo01Recursion {
    public static void main(String[] args) {
        System.out.print("求1-n的整数和:");
        int n = Integer.valueOf(new Scanner(System.in).next());
        int s = sum(n);
        System.out.println("1-"+n+"的和整数和为："+s);
    }

    private static Integer sum(int n) {
        if(n==1){
            return 1;
        }
        return n+sum(--n);
    }
}
