package Project03.domain;

/**
 * @author zyj
 * @create 2021-03-19 20:23
 */
public class Employee {
    //id
    private Integer id;
    //姓名
    private String name;
    //年龄
    private Integer age;
    //工资
    private Double salary;

    public Employee() {
    }

    public Employee(Integer id, String name, Integer age, Double salary) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return id+"\t"+name+"\t"+age+"\t\t"+salary;
    }
}
