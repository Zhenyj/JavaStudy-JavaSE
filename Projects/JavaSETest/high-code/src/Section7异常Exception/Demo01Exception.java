package Section7异常Exception;

/**
 * @author zyj
 * @create 2021-03-26 15:40
 * 异常处理：
 * 异常会抛给方法的调用者,如果有处理异常最后会传到main方法提交给JVM处理
 * NullPointerException是一个运行期异常,我们不用处理,默认交给JVM处理
 * ArrayIndexoutOfBoundsException是一个运行期异常,我们不用处理,黑认交给JVM处理
 */
public class Demo01Exception {
    private int e;

    public static void main(String[] args) {
        //Integer[] arr = null;
        Integer[] arr = {1,2,3};
        int e = getElement(arr, 3);

        System.out.println(3);
    }

    /**
     * @param arr
     * @param index
     * @return
     */
    private static int getElement(Integer[] arr, int index) {

        if (arr == null) {
            throw new NullPointerException();
        }
        /**
         * 我们可以对传递过来的参数index进行合法性校验
         *      如果index的范围不在数组的索引范围内
         *      那么我们就抛出数组索引越界异常，告知方法的调用者"传递的索引超出了数组的使用范围"
         */
        if (index < 0 || index > arr.length - 1) {
            throw new ArrayIndexOutOfBoundsException("传递的索引超出了数组的使用范围:" + index);
        }
        return 0;
    }
}
