package day14_01.work7;


import java.util.HashMap;
import java.util.Map;

public class Test {
    public static void main(String[] args) {
        HashMap<Student,String> hashMap=new HashMap<>();
        hashMap.put(new Student("小陈",20),"老地方");
        hashMap.put(new Student("小米",18),"酒家");
        hashMap.put(new Student("小白",23),"宾馆");
        hashMap.put(new Student("小米",18),"公司" );
        for (Student s : hashMap.keySet()) {
            System.out.println(s+" "+hashMap.get(s));
        }
        System.out.println("----------------");
        for (Map.Entry<Student,String> entry : hashMap.entrySet()) {
            System.out.println(entry.getValue() + " " + entry.getKey());
        }
    }
}
