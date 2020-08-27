package day13.work1;

import java.util.LinkedList;

public class Test {
public static void main(String[] args) {
    LinkedList<Integer> linkedList=new LinkedList<>();
    linkedList.add(1);
    linkedList.add(1,2);
    linkedList.set(1,3);
    System.out.println(linkedList.get(0));
    System.out.println(linkedList.size());
    System.out.println(linkedList);
    linkedList.remove(0);
    System.out.println(linkedList);
    linkedList.clear();
    System.out.println(linkedList);
}
}
