package day14_01.work12;

import java.util.HashMap;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        char[] chars = scanner.nextLine().toCharArray();
        HashMap<String,Integer> hashMap=new HashMap();
        for (char s : chars) {
                if ((s>=97&&s<=122)||(s>=65&&s<=90)){
                    countingKey(hashMap,"字母");
                }else if(s>=48&&s<=57){
                    countingKey(hashMap,"数字");
                }else if (s==' '){
                    countingKey(hashMap,"空格");
                }else {
                    countingKey(hashMap,"其他");
                }
        }
        System.out.println(hashMap);
    }
    public static void countingKey(HashMap<String,Integer> map, String key){
        if (map==null){
            map.put(key,1);
        }else {
            if (map.get(key)==null){
                map.put(key,1);
            }else {
                map.replace(key,map.get(key)+1);
            }
        }
    }
}
