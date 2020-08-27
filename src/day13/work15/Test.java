package day13.work15;

import java.util.HashSet;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        HashSet<Integer> hashSet = new HashSet<>();
        Scanner scanner=new Scanner(System.in);
        while (true){
            int i = scanner.nextInt();
            if (i==-1){
                break;
            }else {
                hashSet.add(i);
            }
        }
        int sum=0;
        for (Integer integer : hashSet) {
            sum+=integer;
        }
        System.out.println("总值为："+sum);
        System.out.println("平均值为："+sum/hashSet.size());
    }
}
