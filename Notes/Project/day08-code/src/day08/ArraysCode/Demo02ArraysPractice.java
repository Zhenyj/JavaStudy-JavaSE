package day08.ArraysCode;

import sun.security.util.Length;

import java.util.Arrays;

/**
 * @author zyj
 * @create 2020-12-17 13:03
 */
public class Demo02ArraysPractice {
    public static void main(String[] args) {
        //定义随机字符串
        String str = "aisduoijeascysdjfhjbxcnvnxcvm";
        //转换为字符数组
        char[] charStr = str.toCharArray();
        //排序
        Arrays.sort(charStr);
        //反向输出
        for (int i = charStr.length-1; i >=0; i--) {
            System.out.print(charStr[i]+" ");
        }
        System.out.println();
        System.out.println(Arrays.toString(charStr));
    }
}
