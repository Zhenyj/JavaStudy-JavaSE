package Section11递归.demo02;

import java.io.File;

/**
 @author zyj
 @create 2021-04-16 10:20
 练习:
 递归打印多级目录
 */
public class Demo03Recursion {
    public static void main(String[] args) {
        File file = new File("high-code");
        getAllFile(file);
    }

    private static void getAllFile(File dir) {
        File[] files = dir.listFiles();
        for (File file : files) {
            System.out.println(file);
            if(file.isFile()){
                continue;
            }else{
                getAllFile(file);
            }
        }
    }
}
