package day13.work10;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

public class Test {
    public static void main(String[] args) {
        String[] strs = {"12345","67891","2347809933","98765432102","67891","12347809933"};
        ArrayList<String> list = new ArrayList<>();
        for (String str : strs) {
            if (!list.contains(str)){
                list.add(str);
            }
        }
        for (String s : list) {
            System.out.println(s);
        }
        System.out.println("-------------");
        list.stream().forEach(n->{
            System.out.println(n);
        });
    }
}
