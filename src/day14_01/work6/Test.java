package day14_01.work6;

import java.util.HashMap;
import java.util.Map;

public class Test {
    public static void main(String[] args) {
        HashMap<String,Student> hashMap=new HashMap<>();
        hashMap.put("老地方",new Student("小陈",20));
        hashMap.put("酒家",new Student("小米",18));
        hashMap.put("宾馆",new Student("小白",23));
        hashMap.put("公司",new Student("小李",19));
        for (String s : hashMap.keySet()) {
            System.out.println(s+" "+hashMap.get(s));
        }
        System.out.println("----------------");
        for (Map.Entry<String, Student> entry : hashMap.entrySet()) {
            System.out.println(entry.getValue() + " " + entry.getKey());
        }
    }
}
