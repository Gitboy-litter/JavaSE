package day13.work5;

import java.util.Iterator;
import java.util.LinkedList;

public class Test {
    public static void main(String[] args) {
        LinkedList<String> linkedList=new LinkedList<>();
        linkedList.add("王昭君");
        linkedList.add("王昭君");
        linkedList.add("西施");
        linkedList.add("杨玉环");
        linkedList.add("貂蝉");
        for (String s : linkedList) {
            System.out.println(s);
        }
        System.out.println("------------------");
        Iterator<String> iterator = linkedList.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
