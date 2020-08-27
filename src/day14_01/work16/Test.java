package day14_01.work16;

import java.util.HashMap;
import java.util.Map;

public class Test {
    //    {Java=32.5,C++=25,PHP=28.6,UI=21.3,Python=10.2}
    public static void main(String[] args) {

        HashMap<String, Double> hashMap = new HashMap<>();
        hashMap.put("Java", 32.5);
        hashMap.put("C++", 25.0);
        hashMap.put("PHP", 28.6);
        hashMap.put("UI", 21.3);
        hashMap.put("Python", 10.2);
        hashMap.remove("C++");
        hashMap.replace("Java", 38.5);
        for (Map.Entry<String, Double> entry : hashMap.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
        System.out.println("-------------");
        for (String s : hashMap.keySet()) {
            System.out.println(s + " " + hashMap.get(s));
        }
    }
}
