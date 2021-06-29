package day09.Extends.demo01;

/**
 * @author zyj
 * @create 2020-12-17 13:25
 */
public class Demo01Extends {
    public static void main(String[] args) {
        Teacher teacher = new Teacher();
        //继承了父类的method方法
        teacher.method();

        Assistant assistant = new Assistant();
        assistant.method();
    }
}
