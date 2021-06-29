package Section4.接口.demo02;

/**
 * @author zyj
 * @create 2021-03-15 17:01'
 *
 * 场景说明：
 *      红包发出去之后，所有人都有红包，大家抢完了之后，最后一个红包给群主自己。
 *      红包分发的策略:
 *          1．普通红包（平均): totalMoney / totalCount，余数放在最后一个红包当中。
 *          2．手气红包（随机):最少1分钱，最多不超过平均数的2倍。应该越发越少。
 */
public class BootStrap {
    public static void main(String[] args) {
        MyRed myRed = new MyRed("福利红包");

        myRed.setOwnerName("甄英俊");
        //普通红包
        //NormalMode normalMode = new NormalMode();
        //myRed.setOpenWay(normalMode);

        RandomMode randomMode = new RandomMode();
        myRed.setOpenWay(randomMode);
    }
}
