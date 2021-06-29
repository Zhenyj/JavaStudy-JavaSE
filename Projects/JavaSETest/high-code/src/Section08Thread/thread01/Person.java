package Section08Thread.thread01;

/**
 * @author zyj
 * @create 2021-04-12 17:01
 */
public class Person {
    private String name;

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

    public void run(){
        for (int i = 0; i < 20; i++) {
            System.out.println(name+"-->"+i);
        }
    }
}
