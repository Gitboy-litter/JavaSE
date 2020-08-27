package day11.work7;

public class Prodct {
    private String id;
    private String name;
    private double money;
    private String unit;
    private int number;
    public Prodct() {
    }

    public Prodct(String id, String name, double money, String unit, int number) {
        this.id = id;
        this.name = name;
        this.money = money;
        this.unit = unit;
        this.number = number;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
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

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    @Override
    public String toString() {
        return "Prodct{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", money=" + money +
                ", unit='" + unit + '\'' +
                '}';
    }
}
