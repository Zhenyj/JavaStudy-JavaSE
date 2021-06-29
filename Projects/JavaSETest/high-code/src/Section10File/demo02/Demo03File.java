package Section10File.demo02;

import java.io.File;
import java.io.IOException;

/**
 @author zyj
 @create 2021-04-15 20:41
 File类创建删除功能的方法
 - public boolean createNewFile():当且仅当具有该名称的文件尚不存在时，创建一个新的空文件。
 - public boolean delete() :删除由此FiLe表示的文件或目录。
 - public boolean mkdir() :创建由此FiLe表示的目录。
 - public boolean mkdirs()∶创建由此FiLe表示的目录，包括任何必需但不存在的父目录。

 */
public class Demo03File {
    public static void main(String[] args) {
        show01();
        System.out.println("==================================");
        show02();
        System.out.println("==================================");
        show03();
    }

    /**
     * public boolean delete() :删除由此FiLe表示的文件或目录。此方法,可以删除构造方法路径中给出的文件/文件夹
     * 返回值:布尔值
     *      true:文件/文件夹删除成功,返回true
     *      false:文件夹中有内容,不会删除返回false;构造方法中路径不存在false
     * 注意:
     *      delete方法是直接在硬盘删除文件/文件夹,不走回收站,删除要谨慎
     */
    private static void show03() {
        File f1 = new File("high-code\\src\\Section10File\\demo02\\b.txt");
        boolean b1 = f1.delete();
        System.out.println("b1:"+b1);
        File f2 = new File("high-code\\src\\Section10File\\demo02\\新建文件夹");
        boolean b2 = f2.delete();
        System.out.println("b2:"+b2);
        File f3 = new File("high-code\\src\\Section10File\\demo02\\aaa\\a.txt");
        boolean b3 = f3.delete();
        System.out.println("b3:"+b3);
    }

    /**
     * public boolean mkdir() :创建单级空文件夹
     * public boolean mkdirs() :既可以创建单级空文件夹,也可以创建多级文件夹
     * 创建文件夹的路径和名称在构造方法中给出(构造方法的参数)
     * 返回值:布尔值
     *      true:文件夹不存在,创建文件夹,返回true
     *      false:文件夹存在,不会创建,返回false;构造方法中给出的路径不存在返回false
     * 注意:
     *      1.此方法只能创建文件夹,不能创建文件
     */
    private static void show02() {
        File f1 = new File("high-code\\src\\Section10File\\demo02\\aaa");
        boolean b1 = f1.mkdir();
        System.out.println("b1:"+b1);
        File f2 = new File("high-code\\src\\Section10File\\demo02\\bbb\\ccc\\ddd");
        boolean b2 = f2.mkdirs();
        System.out.println("b2:"+b2);
        File f3 = new File("high-code\\src\\Section10File\\demo02\\aaa\\a.txt");
        boolean b3 = f3.mkdirs();
        System.out.println("b3:"+b3);
    }

    /**
     * public boolean createNewFile():当且仅当具有该名称的文件尚不存在时，创建一个新的空文件。
     * 创建文件的路径和名称在构造方法中给出(构造方法的参数)
     * 返回值:布尔值
     *      true:文件不存在,创建文件,返回true
     *      false:文件存在,不会创建,返回false
     * 注意：
     *      1.此方法只能创建文件,不能创建文件夹
     *      2.创建文件的路径必须存在,否则会抛出异常
     */
    private static void show01() {
        File f1 = new File("F:\\JavaProjects\\idea\\JavaSETest\\high-code\\src\\Section10File\\demo02\\b.txt");
        boolean b = false;
        try {
            b = f1.createNewFile();
        } catch (IOException e) {
            e.printStackTrace();
        }
        if (b) {
            System.out.println("创建文件成功");
        } else {
            System.out.println("文件已存在或文件创建失败");
        }
        File f2 = new File("F:\\JavaProjects\\idea\\JavaSETest\\high-code\\src\\Section10File\\demo02\\新建文件夹");
        try {
            // 实际创建的新建文件夹类型还是属于文件类型并不是文件夹
            b = f2.createNewFile();
        } catch (IOException e) {
            e.printStackTrace();
        }
        if (b) {
            System.out.println("创建文件成功");
        } else {
            System.out.println("文件已存在或文件创建失败");
        }

        File f3 = new File("F:\\JavaProjects\\idea\\JavaSETest\\high-code\\src\\Section10File\\demo0213\\新建文件夹");
        try {
            // 实际创建的新建文件夹类型还是属于文件类型并不是文件夹
            b = f3.createNewFile();
        } catch (IOException e) {
            e.printStackTrace();
        }
        if (b) {
            System.out.println("创建文件成功");
        } else {
            System.out.println("文件已存在或文件创建失败");
        }
    }
}
