package Section10File.demo02;

import java.io.File;

/**
 @author zyj
 @create 2021-04-15 20:33

 FiLe判断功能的方法
 - public boolean exists( ) : 此File表示的文件或目录是否实际存在。
 - public boolean isDirectory() :此FiLe表示的是否为目录。
 - public boolean isFile() : 此File表示的是否为文件。

 */
public class Demo02File {
    public static void main(String[] args) {
        show01();
        System.out.println("==============================");
        show02();
    }

    /**
     * public boolean isDirectory() :此FiLe表示的是否为目录。
     *      用于判断构造方法中给定的路径是否以文件夹结尾
     *          是:true
     *          否:false
     * public boolean isFile() :此File表示的是否为文件。
     *      用于判断构造方法中给定的路径是否以文件结尾
     *          是:true
     *          否:false
     * 注意:
     *      电脑的硬盘中只有文件/文件夹,两个方法是互斥
     *      这两个方法使用前提,路径必须是存在的,否则都返回false
     */
    private static void show02() {
        File f1 = new File("F:\\JavaProjects\\idea\\JavaSETest123");
        // 先判断文件是否存在，否则都返回false
        if(f1.exists()){
            System.out.println(f1.isDirectory());
            System.out.println(f1.isFile());
        }
        File f2 = new File("F:\\JavaProjects\\idea\\JavaSETest");
        if(f2.exists()){
            System.out.println(f2.isDirectory());
            System.out.println(f2.isFile());
        }
        File f3 = new File("high-code\\src\\Section10File\\demo02\\a.txt");
        if(f3.exists()){
            System.out.println(f3.isDirectory());
            System.out.println(f3.isFile());
        }
    }

    /**
     * public boolean exists(o : 此FiLe表示的文件或目录是否实际存在。
     * 用于判断构造方法中的路径是否存在
     *      存在:true
     *      不存在:false
     */
    private static void show01() {
        File f1 = new File("F:\\JavaProjects\\idea\\JavaSETest");
        System.out.println(f1.exists());
        File f2 = new File("F:\\JavaProjects\\idea\\JavaSETest123");
        System.out.println(f2.exists());
    }
}
