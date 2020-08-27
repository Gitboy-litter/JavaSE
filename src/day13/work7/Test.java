package day13.work7;

import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {
        ArrayList<String> list=new ArrayList<>();
        list.addAll(add("aaa"));
        list.addAll(add("bbb"));
        for (String s : list) {
            System.out.println(s);
        }
    }
    public static ArrayList<String> add(String s){
        ArrayList<String> list=new ArrayList<>();
        list.add(s);
        return  list;
    }
}
