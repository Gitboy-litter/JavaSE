package day12.work2;

import java.util.ArrayList;
import java.util.Collection;

public class Test {
    public static void main(String[] args) {
        Collection<Integer> collection=new ArrayList<>();
        collection.add(1);
        collection.add(2);
        collection.add(3);
        collection.add(4);
        collection.remove(2);
        System.out.println(collection.size());
        for (Integer integer : collection) {
            System.out.println(integer);
        }
        collection.clear();
    }
}
