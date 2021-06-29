package Section7异常Exception;

/**
 * @author zyj
 * @create 2021-04-09 21:42
 *
 * 子父类的异常:
 *      -如果父类抛出了多个异常,子类重写父类方法时,抛出和父类相同的异常或者是父类异常的子类或者不抛出异常。
 *      -父类方法没有抛出异常，子类重写父类该方法时也不可抛出异常。此时子类产生该异常，只能捕获处理，不能声明抛出
 * 注意:
 *      父类异常是什么样,子类异常就什么样
 */
public class Fu {
    public void show01() throws NullPointerException,ClassCastException {

    }
    public  void show02() throws IndexOutOfBoundsException{}
    public  void show03() throws IndexOutOfBoundsException{}
    public  void show04(){}
}

class Zi extends Fu {
    //子类重写父类方法时,抛出和父类相同的异常或者是父类异常的子类或者不抛出异常。
    @Override
    public void show01() throws NullPointerException, ClassCastException {

    }

    //子类重写父类该方法时也不可抛出异常。
    @Override
    public void show02() throws IndexOutOfBoundsException {
    }

    @Override
    public void show03(){

    }

    //此时子类产生该异常，只能捕获处理，不能声明抛出
    //public void show04()  throws Exception{}
    public void show04() {
        try {
            throw new Exception();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
