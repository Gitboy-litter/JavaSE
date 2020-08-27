package day14_01.work11;

import java.util.HashMap;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        HashMap<Character,Integer> hashMap=new HashMap<>();
        Scanner scanner=new Scanner(System.in);
        char[] chars = scanner.next().toCharArray();
        for (char c : chars) {
           if (hashMap.containsKey(c)){
               hashMap.replace(c,hashMap.get(c)+1);
           }else {
               hashMap.put(c,1);
           }
        }
        for (Character character : hashMap.keySet()) {
            System.out.print(character+"("+hashMap.get(character)+")");
        }
    }
}
