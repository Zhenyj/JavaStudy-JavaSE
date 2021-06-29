package Project01;

import java.util.ArrayList;

/**
 * @author zyj
 * @create 2021-03-19 15:02
 */
public class Family {
    private static int  balance = 10000;

    public static ArrayList<Bill> list = new ArrayList<>();//账单

    public void showBill(){
        System.out.println("-----------------当前收支明细记录-----------------");
        System.out.print("收支\t账户金额\t收支金额\t说 明\n");
        for (Bill bill : list) {
            System.out.println(bill.toString());
        }
    }

    public void addMoney(){
        System.out.print("本次收入金额:");
        int money = Utility.readNumber();
        System.out.print("本次收入说明:");
        String detail = Utility.readString();
        balance+=money;
        Bill bill = new Bill("收入",balance,money,detail);
        list.add(bill);
        System.out.println("添加成功");
    }

    public void spendMoney(){
        System.out.print("本次支出金额:");
        int money = Utility.readNumber();
        System.out.print("本次支出说明:");
        String detail = Utility.readString();
        balance-=money;
        Bill bill = new Bill("支出",balance,money,detail);
        list.add(bill);
        System.out.println("添加成功");
    }
}
