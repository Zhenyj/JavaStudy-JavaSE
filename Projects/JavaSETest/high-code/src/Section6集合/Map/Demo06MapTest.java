package Section6集合.Map;


import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

/**
 * @author zyj
 * @create 2021-03-26 9:55
 *  需求：
 *      计算一个字符串中每个字符出现次数。
 *  分析：
 *      1.获取一个字符串对象
 *      2.创建一个Map集合，键代表字符，值代表次数。
 *      3.遍历字符串得到每个字符。
 *      4.判断Map中是否有该键。
 *      5.如果没有，第一次出现，存储次数为1;如果有，则说明已经出现过，获取到对应的值进行++，再次存储。6.打印最终结果
 */
public class Demo06MapTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("请输入一个字符串:");
        String text = scanner.next();

        Map<Character,Integer> map = new HashMap<>();
        // 遍历字符串，插入map集合
        for (char key : text.toCharArray()) {
            // 判断是否存在key
            if(map.containsKey(key)){
                Integer value = map.get(key);
                value++;
                map.put(key, value);
            }else{
                map.put(key, 1);
            }
        }

        // 循环遍历
        Set<Character> keySet = map.keySet();
        for (Character key : keySet) {
            System.out.println(key+"-->"+map.get(key));
        }
    }
}
