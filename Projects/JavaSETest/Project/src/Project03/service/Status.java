package Project03.service;

/**
 * @author zyj
 * @create 2021-03-19 20:37
 */
public class Status {
    private final String NAME;
    private Status(String name) {
        this.NAME = name;
    }
    public static final Status FREE = new Status("FREE");
    public static final Status VOCATION = new Status("VOCATION");
    public static final Status BUSY = new Status("BUSY");
    public String getNAME() {
        return NAME;
    }
    @Override
    public String toString() {
        return NAME;
    }
}