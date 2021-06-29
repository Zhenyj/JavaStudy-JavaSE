package Section6集合.Map;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author zyj
 * @create 2021-03-26 10:25
 * 斗地主案例,有序版本
 */
public class DouDiZhu {

    private static final Integer total=54;
    public static void main(String[] args) {
        // 准备一副牌
        String[] colors = {"♠","♥","♣","♦"};
        String[] numbers = {"3","4","5","6","7","8","9","10","J","Q","K","A","2"};
        // 索引-->牌
        Map<Integer,String> map = new HashMap<>();
        map.put(0, "小王");
        map.put(1, "大王");
        int i = 1;
        for (String number : numbers) {
            for (String color : colors) {
                map.put(++i,color+number);
            }
        }
        // 洗牌,存放牌的索引
        List<Integer> list = new ArrayList<>();
        for (i = 0; i < total; i++) {
            list.add(i);
        }
        Collections.shuffle(list);
        // 发牌
        List<Integer> player1 = new ArrayList<>();
        List<Integer> player2 = new ArrayList<>();
        List<Integer> player3 = new ArrayList<>();
        List<Integer> dipai = new ArrayList<>();
        for (i = 0; i < list.size(); i++) {
            if(i>=51){
                dipai.add(list.get(i));
            }else{
                switch (i%3){
                    case 0:
                        player1.add(list.get(i));
                        break;
                    case 1:
                        player2.add(list.get(i));
                        break;
                    case 2:
                        player3.add(list.get(i));
                        break;
                }
            }
        }
        // 排序玩家的牌
        Collections.sort(player1);
        Collections.sort(player2);
        Collections.sort(player3);
        Collections.sort(dipai);

        // 看牌
        System.out.print("玩家1:");
        for (Integer j : player1) {
            System.out.print(map.get(j)+",");
        }
        System.out.print("\n玩家2:");
        for (Integer j : player2) {
            System.out.print(map.get(j)+",");

        }
        System.out.print("\n玩家3:");
        for (Integer j : player3) {
            System.out.print(map.get(j)+",");
        }
        System.out.print("\n底牌:");
        for (Integer j : dipai) {
            System.out.print(map.get(j)+",");
        }
    }
}
