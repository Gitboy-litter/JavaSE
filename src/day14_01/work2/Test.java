package day14_01.work2;

import java.util.HashMap;
import java.util.Iterator;

public class Test {

    public static void main(String[] args) {
        HashMap<String, String> hashMap = new HashMap<>();
        hashMap.put("aaa", "AAAA");
        hashMap.put("bbb", "AAAA");
        hashMap.put("ccc", "AAAA");
        hashMap.put("ddd", "AAAA");
        Iterator<String> iterator = hashMap.keySet().iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        System.out.println("----------------");
        for (String s : hashMap.keySet()) {
            System.out.println(s);
        }
    }
}
