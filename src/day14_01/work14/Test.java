package day14_01.work14;

import java.util.HashMap;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        HashMap<String,Integer> hashMap=new HashMap<>();
        Scanner scanner=new Scanner(System.in);
        String[] split = scanner.nextLine().split(" ");
        for (String s : split) {
            if (!hashMap.containsKey(s)){
                hashMap.put(s,1);
            }else {
                hashMap.replace(s,hashMap.get(s)+1);
            }
        }
        for (String s : hashMap.keySet()) {
            System.out.println(s+"="+hashMap.get(s));
        }
    }
}
