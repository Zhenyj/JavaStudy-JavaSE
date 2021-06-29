package day09.Extends.demo06;

/**
 * @author zyj
 * @create 2020-12-17 14:11
 */
public class Demo {
    public static void main(String[] args) {
        Phone phone = new Phone();
        phone.call();
        phone.send();
        phone.show();
        System.out.println("=======================");
        NewPhone newPhone = new NewPhone();
        newPhone.call();
        newPhone.send();
        newPhone.show();
    }
}
