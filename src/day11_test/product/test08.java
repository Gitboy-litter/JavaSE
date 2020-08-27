package day11_test.product;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class test08 {
    public static void main(String[] args) {
        //创建一个数组；来显示商品商店，泛型<Goods>是因为要保存所有商品，并且遍历里面每一个商品的属性

        ArrayList<Goods> lists = new ArrayList<>();

        //这里创建一个购物车集合，来保存你买的东西。泛型是<Mean>，里面属性有你购买商品的件数以及商品的所有属性
        ArrayList<Mean> means1 = new ArrayList<>();
        /*
        * 先将所有商品加入到集合中，方便打印出商店的所有商品
        * */
        lists.add(new Goods("001", "少林核桃", 15.5, "斤"));
        lists.add(new Goods("002", "尚康饼干", 14.5, "包"));
        lists.add(new Goods("003", "移动硬盘", 135.5, "个"));
        lists.add(new Goods("004", "高清无码", 199.5, "G"));

        //这个不说也知道的，不解释
        Scanner scanner = new Scanner(System.in);

        //进入超市开始购买，此时必须用一个循环，包裹以下三个模块
        //按1：购买商品，在其中还要一个end操作，因为买了之后你要结束这个循环弹到："1:购买商品  2:结算并打印小票 3:退出系统"这个界面，不然会一直输入
        //按2：结算
        //按3：退出系统
        //综上所述需要分三个模块
        while (true) {
            //写死数据，进入就弹出
            System.out.println("请输入你要进行的操作：");
            System.out.println("1:购买商品  2:结算并打印小票 3:退出系统");
            int s = scanner.nextInt();

            //购买商品模块
            if (s == 1) {
                System.out.println("-----------商品列表-----------");
                System.out.println("商品id 名称 单价 计价单位");

                //这里很容易明白，因为上面的lists集合加入了所有商品，所有可以遍历出来呈现给客户
                for (Goods a : lists) {
                    System.out.println(a.getId() + " " + a.getName() + " " + a.getPrice() + " " + a.getUnit());
                }
                System.out.println("----------------------");
                System.out.println("请您输入您要购买的商品项（输入格式：商品id-购买数量），输入end表示购买结束");


                //此时需要你输入指令购买商品：输入格式：商品id-购买数量，此时有一个while循环，
                // 因为你有可能不止买一件商品吧，要一直输入，直到你按end指令次啊结束购买并且弹出1:购买商品  2:结算并打印小票 3:退出系统
                Scanner scanner1 = new Scanner(System.in);
                while (true) {
                    String i = scanner1.nextLine();//在while里面，可以一直输入
                    String[] split = i.split("-");//这里是分割，然后形成数组，比如输入001-10,此时就会形成数组[001,10],这里是字符串形式，因为10是字符串，后面转型算总价
                    String s1 = split[0];//假如输入001-10，此时split[0]就是得到001
                    int sq = split.length;//获取数组长度，因为要遵循(商品id-购买数量)格式，此时通过“-”分割必定要获取两个数组长度

                    //如果不等于2，输出输您输入的购买姿势不对，请换一个姿势再来一次
                    if (sq != 2) {
                        System.out.println("输您输入的购买姿势不对，请换一个姿势再来一次");
                    }else{
                        //如果输入格式正确，进入这里
                        String s3 = split[1];//获取你买的东西数量
                        int i1 = Integer.parseInt(s3);//上面说了这里字符串，所以转型

                        Goods list1=null;
                        for (int j=0;j<lists.size();j++){
                            Goods list = lists.get(j);
                            if (s1.equals(list.getId())){
                                list1=list;
                                break;
                            }
                        }
                        if (null==list1){
                            System.out.println("不存在商品ID");
                        }else {
                            String s2 = split[1];
                            Mean mean = new Mean(i1,list1);
                            means1.add(mean);
                        }
                    }


                    if ("end".equals(i)){
                        System.out.println("购买结束");
                        break;
                    }


                }
            }

            if (s==2){
                int count=0;
                double totle=0;
                System.out.println("欢迎光临");
                System.out.println("名称   售价     数量    金额");
                System.out.println("-------------");
                for (int j=0;j<means1.size();j++){
                    System.out.println(means1.get(j).getList());
                }
                System.out.println("-------------");
                System.out.println("共计："+means1.size()+"项商品");
                for (int k=0;k<means1.size();k++){
                    count+= means1.get(k).getCount();
                    totle+=(means1.get(k).getCount())*(means1.get(k).getList().getPrice());
                }
                System.out.println("共计"+count);
                System.out.println("共："+totle);
                System.out.println("=======");
            }


            if (s==3){
                System.out.println("谢谢您的使用");
                break;
            }

        }
    }
}
