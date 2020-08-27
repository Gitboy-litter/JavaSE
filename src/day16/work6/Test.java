package day16.work6;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class Test {
    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<>();
        HashMap<String, String> hashMap = new HashMap<>();
        hashMap.put("aaa", "AAAA");
        hashMap.put("bbb", "AAAA");
        hashMap.put("ccc", "AAAA");
        hashMap.put("ddd", "AAAA");
        HashSet<String> hashSet=new HashSet<>();
        hashSet.add("one");
        hashSet.add("two");
        hashSet.add("three");
        hashSet.add("four");
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        hashMap.keySet().stream().forEach(n->{
            System.out.println(n+" " +hashMap.get(n));
        });
        list.stream().forEach(n->{
            System.out.println(n);
        });
        hashSet.stream().forEach(n->{
            System.out.println(n);
        });
    }
}
