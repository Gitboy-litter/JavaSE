package day11_test.System.test2;

public class Goods {
    private String id;       //商品id
    private String name;     //名称
    private Double price;    //单价
    private char unit;       //计价单位
    private int number;     //数量

    public Goods() {
    }

    public Goods(String id, String name, Double price, char unit, int number) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.unit = unit;
        this.number = number;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public char getUnit() {
        return unit;
    }

    public void setUnit(char unit) {
        this.unit = unit;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

}
