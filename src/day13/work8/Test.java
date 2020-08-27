package day13.work8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;

public class Test {
    public static void main(String[] args) {
        ArrayList<String> list=new ArrayList<>();
        Collections.addAll(list,"a","f","b","c","a","d");
        HashSet<String> hashSet=new HashSet<>();
        hashSet.addAll(list);
        list.clear();
        list.addAll(hashSet);
        System.out.println(list);
    }
}
