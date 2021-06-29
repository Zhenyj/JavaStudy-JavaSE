package Section12IO.demo10PrintStream;

import java.io.FileDescriptor;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;

/**
 * @author zyj
 * @create 2021-04-28 9:31
 *
 * 可以改变输出语句的目的地(打印流的流向)输出语句,默认在控制台输出
 * 使用System.setOut方法改变输出语句的目的地改为参数中传递的打印流的目的地
 * static void setPut(PrintStream out)
 * 重新分配"标准"输出流。
 */
public class Demo02PrintStream {

  public static void main(String[] args) throws FileNotFoundException {
    System.out.println("我的控制台输出");// 正常在控制台输出
    PrintStream ps = new PrintStream("high-code\\src\\Section12IO\\demo10PrintStream\\b.txt");
    System.setOut(ps);
    System.out.println("我是在打印流的输出");// 这个会输出到打印流所指定的目的地中
    // 恢复到控制台输出
    System.setOut(new PrintStream(new FileOutputStream(FileDescriptor.out)));
    System.out.println("恢复为控制台输出");
    ps.close();
  }
}
