package day11.work7;

import java.util.ArrayList;
import java.util.Scanner;

public class SupermarkSystem {
    public static void main(String[] args) {
        System.out.println("欢迎使用购物系统");
        ArrayList<Prodct> list=new ArrayList<>();
        ArrayList<Prodct> shoplist=new ArrayList<>();
        list.add(new Prodct("001","少林核桃",15.5,"斤",0));
        list.add(new Prodct("002","尚康饼干",14.5,"包",0));
        list.add(new Prodct("003","移动硬盘",345.0,"个",0));
        list.add(new Prodct("004","高清电影",199.0,"G",0));
        while (true){
            product();
            Scanner scanner=new Scanner(System.in);
            int a=scanner.nextInt();
            switch (a){
                case 1:
                    System.out.println("---------------------");
                    System.out.println("商品列表");
                    System.out.println("商品id 名称        单价    计价单位");
                    for (Prodct prodct : list) {
                        System.out.println(prodct.getId()+"    "+prodct.getName()+"    "+prodct.getMoney()+"    "+prodct.getUnit());
                    }
                    System.out.println("---------------------");
                    System.out.println("请输入要购买的商品（输入格式:商品id-购买数量），输入end表示结束购买。");
                    while (true){
                        String next = scanner.next();
                        if (next.equals("end")){
                            break;
                        }
                        if (next!=null&&next.matches("[0-9]*+[-]+[1-9]*")){
                            String[] strings=next.split("-");
                            int num=Integer.valueOf(strings[1]);
                                for (int j = 0; j <list.size() ; j++) {
                                    if (strings[0].equals(list.get(j).getId())){
                                        Prodct p=list.get(j);
                                        if (!shoplist.contains(p)){
                                            p.setNumber(num);
                                            shoplist.add(p);
                                        }else if (shoplist.contains(p)){
                                            p.setNumber(p.getNumber()+num);
                                        }
                                        break;
                                    }else if (j==list.size()-1){
                                        System.out.println("没有找到商品的id哦，请重新输入一下");
                                    }
                                }
                        }else {
                            System.out.println("您输入的格式不对（输入格式:商品id-购买数量）");
                        }
                    }
                    break;
                case 2:
                    System.out.println("---------------------");
                    System.out.println("欢迎光临");
                    System.out.println("名称        售价        数量      金额");
                    System.out.println("---------------------");
                    int count=0;
                    double allmoney=0.0;
                    for (Prodct prodct : shoplist) {
                        System.out.println(prodct.getName()+"       "+prodct.getMoney()+"       "+prodct.getNumber()+"       "+prodct.getNumber()*prodct.getMoney());
                        count+=prodct.getNumber();
                        allmoney+=prodct.getNumber()*prodct.getMoney();
                    }
                    System.out.println("---------------------");
                    System.out.println(shoplist.size()+"项商品");
                    System.out.println("共计:"+count);
                    System.out.println("共:"+allmoney);
                    break;
                case 3:
                    System.out.println("感谢使用本系统，下次再见");
                    break;
            }
        }
    }
    public static void product(){
        System.out.println("请输入你要进行的操作：");
        System.out.println("1:购买商品"+'\t'+'\t'+"2.结算并打印小票   3.退出系统");
    }
}
