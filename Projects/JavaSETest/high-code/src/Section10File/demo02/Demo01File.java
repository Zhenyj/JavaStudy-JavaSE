package Section10File.demo02;

import java.io.File;

/**
 @author zyj
 @create 2021-04-15 19:45

 FiLe类获取功能的方法
 - public string getAbsolutePath():返回此FiLe的绝对路径名字符串。
 - public string getPath() :将此File转换为路径名字符串。
 - public string getName():返回由此FiLe表示的文件或目录的名称。
 - public long length() :返回由此FiLe表示的文件的长度。

 */
public class Demo01File {
    public static void main(String[] args) {
        show01();
        System.out.println("===================================");
        show02();
        System.out.println("===================================");
        show03();
        System.out.println("===================================");
        show04();
    }

    /**
     * public Long length().:返回由此File表示的文件的长度。获取的是构造方法指定的文件的大小,以字节为单位
     * 注意:
     *      文件夹是没有大小概念的,不能获取文件夹的大小
     *      如果构造方法中给出的路径不存在,那么length方法返0
     */
    private static void show04() {
        File f1 = new File("F:\\JavaProjects\\idea\\JavaSETest\\high-code\\src\\Section10File\\demo02\\Demo01File" +
                ".java");
        System.out.println(f1.length());
        File f2 = new File("F:\\JavaProjects\\idea\\JavaSETest");
        System.out.println(f2.length());

        /**
         * 有些文件夹返回长度的不是0而是4096
         * 文件夹也要记录本身的信息和自身下面的文件和文件夹的信息，4096应该是划分硬盘时最小扇区大小。
         */

    }

    /**
     * public String getName():返回由此File表示的文件或目录的名称。
     * 获取的就是构造方法传递路径的结尾部分(文件/文件夹)
     */
    private static void show03() {
        File file = new File("images");
        System.out.println(file.getName());
    }

    /**
     * public string getPath() :将此FiLe转换为路径名字符串。获取的构造方法中传递的路径
     * toString方法调用的就是getPath
     * 方法源码:
     *      public string toString() {
     *          return getPath();
     *      }
     */
    private static void show02() {
        File file = new File("images\\zyj.jpg");
        System.out.println(file.getPath());
        System.out.println(file.toString());// 实际上就是调用getPath方法
    }

    /**
     * public string getAbsolutePath():返回此File的绝对路径名字符串。
     * 获取的构造方法中传递的路径
     * 无论路径是绝对的还是相对的, getAbsolutePath方法返回的都是绝对路径
     */
    private static void show01() {
        File file = new File("zyj.jpg");
        System.out.println(file.getAbsolutePath());
    }
}
