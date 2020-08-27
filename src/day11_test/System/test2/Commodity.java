package day11_test.System.test2;

import java.util.ArrayList;
import java.util.Scanner;

public class Commodity {
    public static Scanner scanner = new Scanner(System.in);
    public static final String LINE = "------------------------------------";
    public static ArrayList<Goods> list = new ArrayList<>();//商品列表
    public static ArrayList<Goods> shopList = new ArrayList<>();//购物列表

    //操作选项
    public static String select() {
        System.out.println("请输入你要进行的操作：");
        System.out.println("1:购买商品  2:结算并打印小票   3:退出系统");
        String ipt = scanner.next();
        System.out.println(LINE);
        return ipt;
    }

    //商品列表
    public static void printGoods() {
        System.out.println("               商品列表              ");
        System.out.println("商品id    名称        单价     计价单位");
        Goods[] goods = {
                new Goods("001", "少林核桃", 15.5, '斤', 0),
                new Goods("002", "善康饼干", 14.5, '包', 0),
                new Goods("003", "移动硬盘", 345.0, '个', 0),
                new Goods("004", "高清无码", 199.0, 'G', 0)
        };
        //list = new ArrayList<>();
        for (int i = 0; i < goods.length; i++) {
            list.add(goods[i]);
            Goods s = list.get(i);
            System.out.println(" " + s.getId() + "   \t" + s.getName() + "  \t" + s.getPrice() + "      \t" + s.getUnit());
        }
        System.out.println(LINE);
        operation();
    }

    //用户输入
    public static void operation() {
        System.out.println("请输入您要购买的商品项(输入格式：商品id-购买数量)，输入end表示购买结束。");
        while (true) {
            String next = scanner.next();
            if ("end".equals(next)) {
                System.out.println("购买结束");
                return;
            } else {
                format(next);
            }
        }
    }

    //输入判断
    public static void format(String str) {
        if (str.indexOf("-") == -1) {
            System.out.println("你输入的购买姿势不对，请换个姿势再来一次(格式：商品id-购买数量)");
        } else {
            int len = list.size();
            String[] strArr = str.split("-");
            boolean num1 = strArr[0].matches("00[0-" + len + "]");
            boolean num2 = strArr[1].matches("\\d+");
            if (!num2) {
                System.out.println("你输入的购买姿势不对，请换个姿势再来一次(格式：商品id-购买数量)");
            } else if (!num1) {
                System.out.println("您输入的商品不存在,请重新输入！！");
            } else {
                for (int i = 0; i < len; i++) {
                    if (strArr[0].equals(list.get(i).getId())) {
                        Goods good = list.get(i);
                        //判断是否包含
                        if (shopList.contains(good)) {
                            int index = shopList.indexOf(good);
                            shopList.get(index).setNumber(shopList.get(index).getNumber() + Integer.valueOf(strArr[1]));
                            System.out.println(1);
                            break;
                        } else {
                            good.setNumber(Integer.valueOf(strArr[1]));
                            shopList.add(good);
                            System.out.println(2);
                        }
                    }
                }

            }
        }
    }

    //结算
    public static void settlement() {
        if (shopList.size() == 0) {
            System.out.println("您还未购买商品，请先购买后结算");
        } else {
            System.out.println("               欢迎光临              ");
            System.out.println("  名称    \t售价    数量     金额");
            System.out.println(LINE);
            double sum = 0;//总价
            int number = 0;
            for (int i = 0; i < shopList.size(); i++) {
                Goods goods = shopList.get(i);
                Double price = goods.getPrice();//价格
                int shopNumber = goods.getNumber();//数量
                Double priceSum = price * shopNumber;//金额
                number += shopNumber;
                sum += priceSum;
                System.out.println(goods.getName() + "   \t" + price + "  \t" + shopNumber + "     \t" + priceSum);
            }
            System.out.println(LINE);
            System.out.println(shopList.size() + "项商品");
            System.out.println("共计:" + number + "件");
            System.out.println("共:" + sum + "元");
            System.out.println(LINE);
        }
        for (int j = 0; j < shopList.size(); j++) {
            System.out.println(shopList.get(j).getId());
        }
    }

}
