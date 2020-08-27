package day14_01.work15;

import java.util.HashMap;
import java.util.Random;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        HashMap<String,Integer> hashMap=new HashMap<>();
        Random random=new Random();
        Scanner s=new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
           int score= random.nextInt(100)+1;
            hashMap.put(s.next(),score);
        }
        int sum=0;
        int max=0;
        int min=101;
        for (Integer integer : hashMap.values()) {
            if (integer>max){
                max=integer;
            }
            if (integer<min){
                min=integer;
            }
            sum+=integer;
        }
        System.out.println("总分="+sum+",最高分="+max+",最低分="+min+",平均分="+sum/hashMap.size());
    }
}
