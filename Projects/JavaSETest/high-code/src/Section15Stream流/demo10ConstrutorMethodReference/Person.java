package Section15Stream流.demo10ConstrutorMethodReference;

/**
 * @author zyj
 * @create 2021-05-22 22:37
 */
public class Person {
  private  String name;

  public Person() {
  }

  public Person(String name) {
    this.name = name;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  @Override
  public String toString() {
    return "Person{" +
        "name='" + name + '\'' +
        '}';
  }
}
