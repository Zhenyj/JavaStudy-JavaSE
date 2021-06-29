package Section11递归.demo03;

import java.io.File;

/**
 @author zyj
 @create 2021-04-16 10:28
 案例：
 遍历某文件夹下的.java文件
 */
public class Demo01Recursion {
    public static void main(String[] args) {
        File dir = new File("high-code");
        getJavaFile(dir);
    }

    private static void getJavaFile(File dir) {
        if(dir.isDirectory()){
            File[] files = dir.listFiles();
            for (File file : files) {
                if(file.isDirectory()){
                    getJavaFile(file);
                }else {
                    ////1.把file对象,转为字符串对象
                    //String name = file.getName();
                    //// 为了防止大小写问题影响结果，可以将字符串转为小写
                    //name = name.toLowerCase();
                    //// 2.调用String类的endWith方法判断字符串是否以.java结尾
                    //if(name.endsWith(".java")){
                    //    System.out.println(file);
                    //}

                    if(file.getName().toLowerCase().endsWith(".java")){
                        System.out.println(file);
                    }
                }
            }
        }
    }
}
