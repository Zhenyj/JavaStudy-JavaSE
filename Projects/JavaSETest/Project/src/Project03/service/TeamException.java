package Project03.service;

/**
 * @author zyj
 * @create 2021-03-19 21:14
 */
public class TeamException extends Exception{
    private String message;

    public TeamException() {
    }

    public TeamException(String message) {
        super(message);
    }
}
