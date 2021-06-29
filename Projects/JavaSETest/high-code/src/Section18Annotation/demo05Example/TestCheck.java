package Section18Annotation.demo05Example;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.lang.reflect.Method;

/**
 * @author zyj
 * @create 2021-05-30 13:21
 *
 * 简单的测试框架
 *
 * 当主方法执行后，会自动自行被检测的所有方法(加了Check注解的方法)，判断方法是否有异常，记录到文件中
 *
 * 小结:
 * 1．以后大多数时候，我们会使用注解，而不是自定义注解
 * 2．注解给谁用?
 * (1)．编译器
 * (2)．给解析程序用
 * 3．注解不是程序的一部分，可以理解为注解就是一个标签
 */
public class TestCheck {

  public static void main(String[] args) throws Exception {
    // 1.创建计算器对象
    Calculator cal = new Calculator();

    // 2.获取对象的字节码文件
    Class cls = cal.getClass();

    // 3.获取所有方法
    Method[] methods = cls.getMethods();
    BufferedWriter bw = new BufferedWriter(new FileWriter("high-code\\src\\Section18Annotation\\demo05Example\\bug.txt"));

    int exceptionNum = 0;// 异常次数
    for (Method method : methods) {
      // 4.判断方法上方是否有Check注解
      if(method.isAnnotationPresent(Check.class)){
        // 5.有，则执行
        try {
          method.invoke(cal);
        } catch (Exception e) {
          // 6.捕获异常
          exceptionNum++;
          bw.write(method.getName()+"方法出现异常");
          bw.newLine();
          bw.write("异常名称:"+e.getCause().getClass().getSimpleName());
          bw.newLine();
          bw.write("异常原因:"+e.getCause().getMessage());
          bw.newLine();
          bw.write("--------------------------");
          bw.newLine();
        }
      }
    }
    bw.write("本次测试共出现 "+exceptionNum+" 个异常");
    bw.newLine();
    bw.flush();
    bw.close();
  }
}
