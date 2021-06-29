package Section10File.demo02;

import java.io.File;

/**
 @author zyj
 @create 2021-04-15 21:29

 FiLe类遍历(文件夹)目录功能
    - public String[ ] list():返回一个string数组，表示该FiLe目录中的所有子文件或目录。
    - public File[ ] listFiles():返回一个File数组，表示该FiLe目录中的所有的子文件或目录。
 注意:
    List方法和ListFiles方法遍历的是构造方法中给出的目录
    如果构造方法中给出的自录的路径不存在,会抛出空指针异常
    如果构造方法中给出的路径不是一个目录,也会抛出空指针异常

 */
public class Demo04File {
    public static void main(String[] args) {
        show01();
        System.out.println("==================================");
        show02();
    }

    /**
     *
     */
    private static void show02() {
        File f1 = new File("high-code\\src\\Section10File\\demo02");
        File[] files = f1.listFiles();
        for (File file : files) {
            System.out.println(file);
        }
    }

    /**
     * public string[] list():返回一个String数组，表示该FiLe目录中的所有子文件或目录。包括隐藏文件和隐藏文件夹
     * 遍历构造方法中给出的目录,会获取目录中所有文件/文件夹的名称，把获取到的多个名称存储到一个String类型的数组中
     */
    private static void show01() {
        // 路径存在
        File f1 = new File("high-code\\src\\Section10File\\demo02");
        //路径不存在，抛空指针异常
        //File f1 = new File("high-code\\src\\Section10File\\demo");
        // 如果不是文件夹，也抛空指针异常
        //File f1 = new File("high-code\\src\\Section10File\\demo02\\Demo04File");
        String[] list = f1.list();
        for (String s : list) {
            System.out.println(s);
        }
    }
}
