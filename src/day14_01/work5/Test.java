package day14_01.work5;

import java.util.HashMap;
import java.util.Map;

public class Test {
    public static void main(String[] args) {
        HashMap<String, String> hashMap = new HashMap<>();
        hashMap.put("邓超", "孙俪");
        hashMap.put("李晨", "范冰冰");
        hashMap.put("刘德华", "柳岩");
        hashMap.put("黄晓明", "Baby");
        hashMap.put("谢霆锋", "张柏芝");
        for (Map.Entry<String, String> entry : hashMap.entrySet()) {
            System.out.println(entry.getKey()+" "+entry.getValue());
        }
    }
}
