package day14_01.work13;

import java.util.ArrayList;
import java.util.HashMap;

public class Test {
    public static void main(String[] args) {
        ArrayList<String> arrayList=new ArrayList<>();
        HashMap<Character,Integer> hashMap=new HashMap<>();
        arrayList.add("abc");
        arrayList.add("adb");
        arrayList.stream().forEach(n->{
            char[] chars = n.toCharArray();
            for (char c : chars) {
                if (!hashMap.containsKey(c)){
                    hashMap.put(c,1);
                }else {
                    hashMap.replace(c,hashMap.get(c)+1);
                }

            }
        });
        System.out.println(hashMap);
    }
}
