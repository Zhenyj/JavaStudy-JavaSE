package Section5.包装类;

/**
 * @author zyj
 * @create 2021-03-17 15:18
 */
public class Integer02 {
    public static void main(String[] args) {
        String s = "100";

        String s2 = Integer.toString(100);
        System.out.println(s2+200);

        String s3 = String.valueOf(100);
        System.out.println(s3+200);


        int i = Integer.parseInt(s);
        System.out.println(i+200);
    }
}
