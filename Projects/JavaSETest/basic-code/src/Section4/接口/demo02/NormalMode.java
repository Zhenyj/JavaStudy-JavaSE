package Section4.接口.demo02;

import Section4.接口.demo02.red.OpenMode;

import java.util.ArrayList;

/**
 * @author zyj
 * @create 2021-03-15 17:26
 */
public class NormalMode implements OpenMode {
    @Override
    public ArrayList<Integer> divide(final int totalMoney, final int totalCount) {
        ArrayList<Integer> list = new ArrayList<Integer>();

        int avg = totalMoney / totalCount;//平均值，单位分
        int mod = totalMoney % totalCount;//余数

        for (int i = 0; i < totalCount-1; i++) {
            list.add(avg);
        }
        //剩下的都是最后一个人的,包括余数
        list.add(avg+mod);
        return list;
    }
}
