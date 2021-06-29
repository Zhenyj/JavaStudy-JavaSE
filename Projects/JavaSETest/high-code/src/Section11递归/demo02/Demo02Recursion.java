package Section11递归.demo02;

import java.util.Scanner;

/**
 @author zyj
 @create 2021-04-16 9:53
 求n的阶乘
 */
public class Demo02Recursion {
    public static void main(String[] args) {
        System.out.print("求n的阶乘:");
        int n = Integer.valueOf(new Scanner(System.in).next());
        long s = factorial(n);
        System.out.println(n+"的阶乘为："+s);
    }

    private static Long factorial(int n) {
        if(n==1){
            return 1L;
        }
        return n*factorial(--n);
    }
}
