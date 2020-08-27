package day16.work5;

import java.util.ArrayList;
import java.util.Collections;

public class Test {
    public static void main(String[] args) {
        ArrayList<Student> list=new ArrayList<>();
        list.add(new Student("小米",99.5));
        list.add(new Student("小兰",93.5));
        list.add(new Student("小七",91.5));
        list.add(new Student("小九",88.5));
        Collections.sort(list,(student1,student2)->{
            return (int)(student2.getScore()-student1.getScore());
        });
        System.out.println(list);
    }
}
