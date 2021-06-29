package Section4.接口.demo02;

import Section4.接口.demo02.red.OpenMode;

import java.util.ArrayList;
import java.util.Random;

/**
 * @author zyj
 * @create 2021-03-15 17:37
 */
public class RandomMode implements OpenMode {

    @Override
    public ArrayList<Integer> divide(int totalMoney, int totalCount) {
        ArrayList<Integer> list = new ArrayList<>();

        int allMoney = totalMoney;
        Random random = new Random();
        for (int i = 0; i < totalCount-1; i++) {
             int money = random.nextInt(allMoney/2)+1;
             list.add(money);
             allMoney -= money;
        }
        list.add(allMoney);
        
        return list;
    }
}
