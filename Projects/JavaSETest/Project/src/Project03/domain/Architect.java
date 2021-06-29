package Project03.domain;

import Project03.service.Status;

/**
 * @author zyj
 * @create 2021-03-19 20:43
 */
public class Architect extends Designer{
    //股票数量
    private Integer stock;

    public Architect() {
    }

    // Architect
    public Architect(Integer stock) {
        this.stock = stock;
    }
    // Architect和Designer
    public Architect(Double bonus, Integer stock) {
        super(bonus);
        this.stock = stock;
    }
    // Architect和Designer和Programmer
    public Architect(Integer memberId, Status status, Equipment equipment, Double bonus, Integer stock) {
        super(memberId, status, equipment, bonus);
        this.stock = stock;
    }
    // Architect和Designer和Programmer和Employee
    public Architect(Integer id, String name, Integer age, Double salary, Integer memberId, Status status, Equipment equipment, Double bonus, Integer stock) {
        super(id, name, age, salary, memberId, status, equipment, bonus);
        this.stock = stock;
    }

    public Integer getStock() {
        return stock;
    }

    public void setStock(Integer stock) {
        this.stock = stock;
    }


    @Override
    public String toString() {
        return super.getId()+"\t"+super.getName()+"\t"+super.getAge()+"\t\t"+super.getSalary()+"\t\t" +
                "架构师\t"+super.getStatus().getNAME()+"\t"+super.getBonus()+"\t"+stock+"\t"+super.getEquipment().getDescription();
    }

    public String teamToString() {
        return super.getMemberId()+"/"+super.getId()+"\t\t"+super.getName()+"\t"+super.getAge()+"\t\t"+super.getSalary()+
                "\t\t架构师\t"+super.getBonus()+"\t"+stock;
    }
}
