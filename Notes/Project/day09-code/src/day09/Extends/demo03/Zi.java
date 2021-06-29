package day09.Extends.demo03;

/**
 * @author zyj
 * @create 2020-12-17 13:44
 */
public class Zi extends Fu {
    int num = 20;

    public void method(){
        int num = 30;
        System.out.println(num);//该方法的局部变量
        System.out.println(this.num);//本类的成员变量
        System.out.println(super.num);//父类的成员变量
    }
}
