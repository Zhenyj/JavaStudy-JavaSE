package Project01;

/**
 * @author zyj
 * @create 2021-03-19 15:14
 */
public class Bill {
    private String type;
    private Integer balance;
    private Integer money;
    private String explain;

    public Bill() {
    }

    public Bill(String type, Integer balance, Integer money, String explain) {
        this.type = type;
        this.balance = balance;
        this.money = money;
        this.explain = explain;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Integer getBalance() {
        return balance;
    }

    public void setBalance(Integer balance) {
        this.balance = balance;
    }

    public Integer getMoney() {
        return money;
    }

    public void setMoney(Integer money) {
        this.money = money;
    }

    public String getExplain() {
        return explain;
    }

    public void setExplain(String explain) {
        this.explain = explain;
    }

    @Override
    public String toString() {
        return type+"\t"+balance+"\t"+money+"\t"+explain;
    }
}

