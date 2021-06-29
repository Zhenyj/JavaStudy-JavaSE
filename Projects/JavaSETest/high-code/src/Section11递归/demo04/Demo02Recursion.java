package Section11递归.demo04;

import java.io.File;
import java.io.FileFilter;
import java.io.FilenameFilter;

/**
 * @author zyj
 * @create 2021-04-16 11:00
 * 遍历某文件夹下的.java文件
 * 我们可以使用过滤器来实现
 * 在File类中有两个和listFiles重载的方法,方法的参数传递的就是过滤器File[] listFiles(FileFilter filter)
 * java.io.FiLeFilter接口:用于抽象路径名(FiLe对象)的过滤器。
 *      作用:用来过滤文件(FiLe对象)
 *      抽象方法:用来过滤文件的方法
 *      boolean accept(File pathname）测试指定抽象路径名是否应该包含在某个路径名列表中。
 *      参数:
 *          File pathname :使用ListFiles方法遍历目录,得到的每一个文件对象
 * File[] ListFiles (FilenameFilter filter)
 *      java.io.FilenameFilter接口:实现此接口的类实例可用于过滤器文件名。
 *      作用:用于过滤文件名称
 */
public class Demo02Recursion {
    public static void main (String[] args) {
        File dir = new File("high-code");
        getJavaFile(dir);
    }

    private static void getJavaFile (File dir) {
        // 使用匿名内部类
        //File[] files = dir.listFiles(new FileFilter() {
        //    @Override
        //    public boolean accept (File pathname) {
        //        return pathname.isDirectory()|| pathname.getName().toLowerCase().endsWith(".java");
        //    }
        //});

        // FilenameFilter
        //File[] files = dir.listFiles(new FilenameFilter() {
        //    @Override
        //    public boolean accept (File dir, String name) {
        //        return new File(dir,name).isDirectory() || name.toLowerCase().endsWith(".java");
        //    }
        //});

        //Lambda表达式(接口中只有一个抽象方法)
        File[] files = dir.listFiles((path,name)->{
            return new File(path,name).isDirectory() || name.toLowerCase().endsWith(".java");
        });

        for (File file : files) {
            if(file.isDirectory()){
                getJavaFile(file);
            }else{
                System.out.println(file);
            }
        }
    }
}
