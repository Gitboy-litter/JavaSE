package day11_test.System.test2;

public class Test {
    public static void main(String[] args) {
        while (true) {
            String ipt = Commodity.select();
            switch (ipt) {
                case "1":
                    Commodity.printGoods();
                    break;
                case "2":
                    Commodity.settlement();
                    break;
                case "3":
                    System.out.println("感谢您使用超市购物系统,欢迎下次光临，拜拜");
                    return;
                default:
                    System.out.println("没有此项操作,请输入正确的操作");
                    break;
            }
        }
    }
}
