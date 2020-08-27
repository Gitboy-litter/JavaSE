package day14_01.work10;

import java.util.HashMap;
import java.util.Map;

public class Test {
//    1="张三丰",2="周芷若",3="汪峰",4="灭绝师太"}
public static void main(String[] args) {
    Map<Integer,String> Map=new HashMap<>();
    Map.put(1,"张三丰");
    Map.put(2,"周芷若");
    Map.put(3,"汪峰");
    Map.put(4,"灭绝师太");
    System.out.println(Map);
    Map.put(5,"李晓红");
    Map.remove(1);
    Map.replace(2,"周林");
    System.out.println(Map);
}
}
