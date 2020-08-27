package day13.work16;

import java.util.Arrays;
import java.util.HashSet;

public class Test {
    public static void main(String[] args) {
        String[]  array1 = {"a","b","a","c"};
        String[]  array2 = {"e","f","a","d","g"};
        HashSet<String> hashSet = new HashSet<>();
        hashSet.addAll(Arrays.asList(array1));
        hashSet.addAll(Arrays.asList(array2));
        System.out.println(hashSet);
    }
}
