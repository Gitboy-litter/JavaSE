package day16_test.test2;

public class Test {
    public static void main(String[] args) {
        BaoZi baoZi=new BaoZi("韭菜鸡蛋包",1);
        Product p=new Product(baoZi);
        Custorm c=new Custorm(baoZi);
       new Thread(p,"武大郎").start();
       new Thread(c,"猪八戒").start();
    }
}
