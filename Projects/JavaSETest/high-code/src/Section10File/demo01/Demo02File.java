package Section10File.demo01;

import java.io.File;

/**
 @author zyj
 @create 2021-04-15 19:23

 路径:
 绝对路径:是一个完整的路径
    以盘符(C:,D: )开始的路径
 相对路径:是一个简化的路径
    相对指的是相对于当前项目的根目录
 注意:
    1.路径是不区分大小写
    2.路径中的文件名称分隔符windows使用反斜杠,反斜杠是转义字符,两个反斜杠代表一个普通的反斜杠

 */
public class Demo02File {
    // File的构造方法
    public static void main(String[] args) {
        show01();
        System.out.println("================================");
        show02("F:\\images","zyj.jpg");
        System.out.println("================================");
        show02("F:\\images","abc.jpg");
        System.out.println("================================");
        show03();
    }

    /**
     * FiLe(File parent，String child)根据 parent抽象路径名和child 路径名字符串创建一个新FiLe 实例。
     * 参数:把路径分成了两部分
     *      File parent:父路径
     *      String child:子路径
     * 好处:
     *      父路径和子路径,可以单独书写,使用起来非常灵活;
     *      父路径和子路径都可以变化父路径是File类型,可以使用FiLe的方法对路径进行一些操作,再使用路径创建对象
     */
    private static void show03() {
        File parent = new File("F:\\");
        File file = new File(parent, "images\\zyj.jpg");

        System.out.println(file);
    }

    /**
     * File(String parent,String child）根据 parent 路经名字符串和child路径名字符串创建一个新File 实例。
     * 参数:把路径分成了两部分
     *      String parent:父路径
     *      String child:子路径工
     * 好处:
     *      父路径和子路径,可以单独书写,使用起来非常灵活;
     *      父路径和子路径都可以变化
     */
    private static void show02(String parent,String child) {
        File f1 = new File(parent, child);
        System.out.println(f1);
    }

    /**
     * File(String pathname）通过将给定路径名字符串转换为抽象路径名来创建一个新File实例。
     * 参数：
     *      String pathname:字符串的路径名称
     *      路径可以是以文件结尾,也可以是以文件夹结尾路径可以是相对路径,也可以是绝对路径
     *      路径可以是存在,也可以是不存在
     *      创建File对象,只是把字符串路径封装为FiLe对象,不考虑路径的真假情况
     */
    private static void show01() {
        File f1 = new File("F:\\images\\zyj.jpg");
        System.out.println(f1);

        File f2 = new File("F:\\images");
        System.out.println(f2);

        File f3 = new File("zyj.jpg");
        System.out.println(f3);
    }
}
