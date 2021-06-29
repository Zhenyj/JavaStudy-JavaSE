package Section11递归.demo04;

import java.io.File;
import java.io.FileFilter;

/**
 @author zyj
 @create 2021-04-16 11:05
 创建过滤器FileFilter的实现类,重写过滤方法accept,定义过滤规则
 */
public class FileFilterImpl implements FileFilter {
    @Override
    public boolean accept (File pathname) {
        if(pathname.isDirectory()){
            // 是文件夹也返回true
            return true;
        }
        return pathname.getName().toLowerCase().endsWith(".java");
    }
}
