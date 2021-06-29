package Section10File.demo01;

import java.io.File;

/**
 @author zyj
 @create 2021-04-15 19:23
 */
public class Demo01File {
    public static void main(String[] args) {
        /**
         * static string pathSeparator与系统有关的路径分隔符，为了方便，它被表示为一个字符串。
         * static char pathSeparatorChar 与系统有关的路径分隔符。
         * static string separator 与系统有关的默认名称分隔符，为了方便，它被表示为一个字符串。
         * static char separatorChar 与系统有关的默认名称分隔符。
         *
         * 操作路径不能写死,由于不同的系统路径分隔符不一样可以用
         * "C:"+File.separator+"develop"+File.separator+"a.txt"
         */

        String pathSeparator = File.pathSeparator;
        System.out.println(pathSeparator);//路径分隔符 windows:分号 linux：冒号

        String separator = File.separator;
        System.out.println(separator);// 文件名称分隔符 windows:\ linux：/
    }
}
