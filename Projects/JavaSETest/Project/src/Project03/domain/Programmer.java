package Project03.domain;

import Project03.service.Status;

/**
 * @author zyj
 * @create 2021-03-19 20:33
 */
public class Programmer extends Employee {
    // 员工号
    private Integer memberId;
    // 状态
    private Status status=Status.FREE;
    //设备
    private Equipment equipment;

    public Programmer() {
    }

    // 子类新增
    public Programmer(Integer memberId, Status status, Equipment equipment) {
        this.memberId = memberId;
        this.status = status;
        this.equipment = equipment;
    }

    // Programmer和Employee
    public Programmer(Integer id, String name, Integer age, Double salary, Integer memberId, Status status, Equipment equipment) {
        super(id, name, age, salary);
        this.memberId = memberId;
        this.status = status;
        this.equipment = equipment;
    }

    public Integer getMemberId() {
        return memberId;
    }

    public void setMemberId(Integer memberId) {
        this.memberId = memberId;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public Equipment getEquipment() {
        return equipment;
    }

    public void setEquipment(Equipment equipment) {
        this.equipment = equipment;
    }

    @Override
    public String toString() {
        return super.getId()+"\t"+super.getName()+"\t"+super.getAge()+"\t\t"+super.getSalary()+"\t\t" +
                "程序员\t"+status.getNAME()+"\t\t\t\t\t"+equipment.getDescription();
    }

    public String teamToString(){
        return memberId+"/"+super.getId()+"\t\t"+super.getName()+"\t"+super.getAge()+"\t\t"+super.getSalary()+"\t\t" +
                "程序员";
    }
}
