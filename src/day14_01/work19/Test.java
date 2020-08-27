package day14_01.work19;

import java.util.HashMap;

public class Test {
    public static void main(String[] args) {
//        {“及时雨”=”宋江”, “玉麒麟”=”卢俊义”, “智多星”=”吴用”}
        HashMap<String,String> hashMap=new HashMap<>();
        hashMap.put("及时雨","宋江");
        hashMap.put("玉麒麟","卢俊义");
        hashMap.put("智多星","吴用");
        hashMap.put("入云龙","公孙胜");
        hashMap.put("豹子头","林冲");
        hashMap.remove("玉麒麟");
        hashMap.replace("智多星",null);
        hashMap.remove("及时雨");
        hashMap.put("呼保义","宋江");
        System.out.println(hashMap);
    }
}
