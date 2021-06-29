package Project03.domain;

import Project03.service.Status;

/**
 * @author zyj
 * @create 2021-03-19 20:39
 */
public class Designer extends Programmer {
    // 奖金
    private Double bonus;

    public Designer() {
    }

    // 本身新增
    public Designer(Double bonus) {
        this.bonus = bonus;
    }

    //Designer和Programmer
    public Designer(Integer memberId, Status status, Equipment equipment, Double bonus) {
        super(memberId, status, equipment);
        this.bonus = bonus;
    }
    //Designer和Programmer和Employee
    public Designer(Integer id, String name, Integer age, Double salary, Integer memberId, Status status, Equipment equipment, Double bonus) {
        super(id, name, age, salary, memberId, status, equipment);
        this.bonus = bonus;
    }

    public Double getBonus() {
        return bonus;
    }

    public void setBonus(Double bonus) {
        this.bonus = bonus;
    }

    @Override
    public String toString() {
        return super.getId()+"\t"+super.getName()+"\t"+super.getAge()+"\t\t"+super.getSalary()+"\t\t" +
                "设计师\t"+super.getStatus().getNAME()+"\t"+bonus+"\t\t\t"+super.getEquipment().getDescription();
    }

    public String teamToString() {
        return super.getMemberId()+"/"+super.getId()+"\t\t"+super.getName()+"\t"+super.getAge()+"\t\t"+super.getSalary()+
                "\t\t设计师\t"+bonus;
    }
}
