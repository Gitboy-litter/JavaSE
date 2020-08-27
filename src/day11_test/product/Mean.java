package day11_test.product;

public class Mean {
    private int count;
    private Goods list;

    public Mean() {
    }

    public Mean(int count, Goods list) {
        this.count = count;
        this.list = list;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public Goods getList() {
        return list;
    }

    public void setList(Goods list) {
        this.list = list;
    }
}



