package Project01;

/**
 * @author zyj
 * @create 2021-03-19 14:46
 */
public class FamilyAccount {
    private static boolean loopFlag = true;

    private static Family family = new Family();

    public static void main(String[] args) {
        showMenu();
    }

    private static void showMenu(){

        if(loopFlag){
            System.out.println("-----------------家庭收支记账软件-----------------");
            System.out.print("\t\t\t\t 1 收入明细 \n" +
                                "\t\t\t\t 2 登记收入 \n" +
                                "\t\t\t\t 3 登记支出 \n"+
                                "\t\t\t\t 4 退\t出 \n" +
                                "\t\t\t\t 请选择(1-4):");
            selectMenu();
        }else{
            return;
        }
    }

    public static void selectMenu(){
        char c = Utility.readMenuSelection();
        switch (c){
            case '1':
                family.showBill();
                showMenu();
                break;
            case '2':
                family.addMoney();
                showMenu();
                break;
            case '3':
                family.spendMoney();
                showMenu();
                break;
            case '4':
                System.out.print("确认是否退出(Y/N):");
                char c1 = Utility.readConfirmSelection();
                if(c1=='Y'){
                    loopFlag = false;
                }
                showMenu();
                break;
            default:
                System.out.println("输入错误,重新选择");
                selectMenu();
        }
    }
}
