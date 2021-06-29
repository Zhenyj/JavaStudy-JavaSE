package Section7异常Exception;

import java.util.Scanner;

/**
 * @author zyj
 * @create 2021-04-09 22:07
 *
 * 要求:我们模拟注册操作，如果用户名已存在，则抛出异常并提示:亲，该用户名已经被注册。分析:
 *      1.使用数组保存已经注册过的用户名(数据库)
 *      2.使用scanner获取用户输入的注册的用户名(前端,页面)
 *      3.定义一个方法,对用户输入的中注册的用户名进行判断
 *      遍历存储已经注册过用户名的数组,获取每一个用户名使用获取到的用户名和用户输入的用户名比较
 *      true:
 *          用户名已经存在,抛出RegisterException异常,告知用户“亲，该用户名已经被注册";
 *      false:
 *          继续遍历比较
 * 如果循环结束了,还没有找到重复的用户名,提示用户“恭喜您,注册成功!";
 */
public class ExceptionTest {
    static String[] userNames = {"迪丽热巴","古力娜扎","哈妮克孜","马尔扎哈","雷霆嘎巴"};
    public static void main(String[] args) throws RegisterException {
        Scanner scanner = new Scanner(System.in);
        System.out.print("请输入用户名:");
        String username = scanner.next();
        hasName(username);
    }

    private static void hasName(String username) throws RegisterException {
        for (int i = 0; i < userNames.length; i++) {
            if (userNames[i].equals(username)){
                //也可以用try...catch捕获异常
                throw new RegisterException("亲，该用户名已被注册");
            }
        }
        System.out.println("恭喜你，注册成功！");
    }
}

class RegisterException extends Exception{
    public RegisterException() {
        super();
    }
    public RegisterException(String message) {
        super(message);
    }
}
