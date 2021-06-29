package Section17Reflect.demo01;

/**
 * @author zyj
 * @create 2021-05-26 10:16
 */
public class Person {
  private String name;
  public String a;
  public String b;
  public String c;
  public String d;

  public Person() {
  }

  public Person(String name) {
    this.name = name;
  }

  public Person(String name, String a, String b, String c, String d) {
    this.name = name;
    this.a = a;
    this.b = b;
    this.c = c;
    this.d = d;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getA() {
    return a;
  }

  public void setA(String a) {
    this.a = a;
  }

  public String getB() {
    return b;
  }

  public void setB(String b) {
    this.b = b;
  }

  public String getC() {
    return c;
  }

  public void setC(String c) {
    this.c = c;
  }

  public String getD() {
    return d;
  }

  public void setD(String d) {
    this.d = d;
  }

  @Override
  public String toString() {
    return "Person{" +
        "name='" + name + '\'' +
        ", a='" + a + '\'' +
        ", b='" + b + '\'' +
        ", c='" + c + '\'' +
        ", d='" + d + '\'' +
        '}';
  }
}
