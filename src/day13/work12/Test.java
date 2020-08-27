package day13.work12;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;

public class Test {
    public static void main(String[] args) {
        HashSet<String> hashSet = new HashSet<>();
        Collections.addAll(hashSet,"abc","bad","abc","aab","bad","cef","jhi");
        ArrayList<String> list = new ArrayList<>();
        list.addAll(hashSet);
        System.out.println(list);
    }
}
