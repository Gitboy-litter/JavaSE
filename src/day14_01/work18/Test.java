package day14_01.work18;

import java.util.HashMap;
import java.util.Map;

public class Test {
    public static void main(String[] args) {
//        Java基础班
//        001 李晨
//        002 范冰冰
//                Java就业班
//        001 马云
//        002 马化腾
//                使用HashMap集
        HashMap<HashMap,HashMap> xiaomi=new HashMap<>();
        HashMap<String,String> basis=new HashMap<>();
        HashMap<String,String> Employment=new HashMap<>();
        basis.put("001","李晨");
        basis.put("002","范冰冰");
        Employment.put("001","马云");
        Employment.put("002","马化腾");
        xiaomi.put(basis,Employment);
        for (Map.Entry<HashMap, HashMap> entry : xiaomi.entrySet()) {
            entry.getValue().entrySet().stream().forEach(n->{
                System.out.println(n);
            });
            entry.getKey().entrySet().stream().forEach(n->{
                System.out.println(n);
            });
        }
        for (HashMap map : xiaomi.keySet()) {
            System.out.println(map);
            System.out.println(xiaomi.get(map));
        }
    }
}
