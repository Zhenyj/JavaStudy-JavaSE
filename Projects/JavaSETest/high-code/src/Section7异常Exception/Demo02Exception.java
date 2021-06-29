package Section7异常Exception;

import java.util.Objects;

/**
 * @author zyj
 * @create 2021-03-26 16:02
 */
public class Demo02Exception {
    public static void main(String[] args) {
        method01(null);
    }

    private static void method01(Object o) {
        // Objects类提供的判断对象是否为null
        //Objects.requireNonNull(o);
        Objects.requireNonNull(o,"传递的对象为null");
    }
}
