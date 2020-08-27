package day14_01.work9;

import java.util.HashMap;

public class Test {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();
        map.put("柳岩",2100);
        map.put("张亮",1700);
        map.put("诸葛亮",1800);
        map.put("灭绝师太",2600);
        map.put("东方不败",3800);
       map.replace("柳岩",map.get("柳岩")+300);
        for (String s : map.keySet()) {
            System.out.println(s+" "+map.get(s));
        }
    }
}
