package Section6集合.Collection.Generic;

import java.util.ArrayList;
import java.util.Collections;

/**
 * @author zyj
 * @create 2021-03-17 19:28
 *
 * 斗地主案例
 */
public class PokeCase {

    public static void main(String[] args) {
        //生成54张牌
        String [] fc = {"♠","♥","♣","♦"};
        String [] count = {"3","4","5","6","7","8","9","10","J","Q","K","A","2"};
        ArrayList<String> poke = generatePoke(fc,count);
        poke.add("大王");
        poke.add("小王");
        //洗牌
        Collections.shuffle(poke);

        //发牌
        ArrayList<String> player1 = new ArrayList<>();
        ArrayList<String> player2 = new ArrayList<>();
        ArrayList<String> player3 = new ArrayList<>();
        ArrayList<String> dipai = new ArrayList<>();
        for (int i = 0; i < poke.size(); i++) {
            if(i<51){
                if(i%3==0){
                    player1.add(poke.get(i));
                }else if(i%3==1){
                    player2.add(poke.get(i));
                }else{
                    player3.add(poke.get(i));
                }
            }else{
                dipai.add(poke.get(i));
            }
        }
        System.out.println("玩家1:"+player1);
        System.out.println("玩家2:"+player2);
        System.out.println("玩家3:"+player3);
        System.out.println("底牌:"+ dipai);
    }

    private static ArrayList<String> generatePoke(String[] fc ,String [] count) {
        ArrayList<String> poke = new ArrayList<>();
        for (String f : fc) {
            for (String c : count) {
                poke.add(f+c);
            }
        }
        return poke;
    }
}
