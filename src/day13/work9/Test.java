package day13.work9;

import java.util.HashSet;

public class Test {
    //向HashSet集合添加姓名{张三,李四,王五,二丫,钱六,孙七},将二丫删除,添加二丫
    public static void main(String[] args) {
        HashSet<String> hashSet=new HashSet<>();
        hashSet.add("张三");
        hashSet.add("李四");
        hashSet.add("王五");
        hashSet.add("二丫");
        hashSet.add("孙七");
        hashSet.add("钱六");
        hashSet.remove("二丫");
        hashSet.add("王小丫");
        System.out.println(hashSet);
    }
}
