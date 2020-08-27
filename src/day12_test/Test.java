package day12_test;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.stream.Stream;


public class Test {
    public static void main(String[] args) {
        ArrayList<Object> objects = new ArrayList<>();
        Collection collections=new HashSet();
        collections.add("小石头");
        collections.add("大石头");
        collections.add("不小不大石头");
       // System.out.println(collections.size());
        collections.remove("小石头");
       // System.out.println(collections);
        Iterator iterator = collections.iterator();
        iterator.next();
        Stream stream=collections.stream();
        stream.forEach(n-> System.out.println(n));
        for (Object collection : collections) {
            System.out.println(collection);
        }
    }
}
