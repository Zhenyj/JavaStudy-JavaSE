package Project03.domain;

/**
 * @author zyj
 * @create 2021-03-19 20:25
 */
public class NoteBook implements Equipment {
    //机器型号
    private String model;
    //价格
    private Double price;

    public NoteBook() {
    }

    public NoteBook(String model, Double price) {
        this.model = model;
        this.price = price;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    @Override
    public String getDescription() {
        return model+"("+price+")";
    }
}
