package Project02;

/**
 * @author zyj
 * @create 2021-03-19 16:42
 */
public class Customer {
    //姓名
    private String name;
    //性别
    private Character sex;
    //年龄
    private  Integer age;
    //手机号
    private String tel;
    //电子邮箱
    private String email;

    public Customer() {
    }

    public Customer(String name, Character sex, Integer age, String tel, String email) {
        this.name = name;
        this.sex = sex;
        this.age = age;
        this.tel = tel;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Character getSex() {
        return sex;
    }

    public void setSex(Character sex) {
        this.sex = sex;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return name + "\t" +sex + "\t" + age + "\t" + tel + "\t" + email;
    }
}
