package day14_01.work1;

import java.util.HashMap;

public class Test {
    public static void main(String[] args) {
        HashMap map=new HashMap();
        map.put("aaa","bbbb");
        map.put("bbb","bbbb");
        System.out.println(map.get("aaa"));
        map.remove("aaa");
        System.out.println(map);
    }
}
