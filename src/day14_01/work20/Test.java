package day14_01.work20;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        HashMap<String,String> hashMap=new HashMap<>();
        hashMap.put(productNumber(hashMap),"苹果");
        hashMap.put(productNumber(hashMap),"香蕉");
        hashMap.put(productNumber(hashMap),"西瓜");
        hashMap.put(productNumber(hashMap),"橘子");
        System.out.println(hashMap);
        Scanner scanner=new Scanner(System.in);
        String s = scanner.next();
        if (hashMap.containsKey(s)){
            System.out.println("根据商品号："+s+"，查询到对应的商品为："+hashMap.get(s));
        }else {
            System.out.println("查无此商品");
        }
    }
    public static String productNumber(HashMap map){
        Random random=new Random();
        StringBuilder stringBuilder=new StringBuilder();
        for (int i = 0; i < 8; i++) {
            int number = random.nextInt(10);
            stringBuilder.append(number+"");
        }
        if(map.containsKey(stringBuilder)){
            productNumber(map);
        }
        return stringBuilder.toString();
    }
}
