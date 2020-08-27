package day14_01.work3;

import java.util.HashMap;
import java.util.Iterator;

public class Test {
    public static void main(String[] args) {
        HashMap<String, String> hashMap = new HashMap<>();
        hashMap.put("aaa", "AAAA");
        hashMap.put("bbb", "BBBB");
        hashMap.put("ccc", "CCCC");
        hashMap.put("ddd", "DDDD");
        Iterator<String> iterator = hashMap.values().iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        System.out.println("----------------");
        for (String s : hashMap.values()) {
            System.out.println(s);
        }
    }
}
