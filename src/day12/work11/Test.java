package day12.work11;

import java.util.ArrayList;
import java.util.Iterator;

public class Test {
    public static void main(String[] args) {
        ArrayList<Person> list = new ArrayList<>();
        list.add(new Person("老王", 35, 1.75));
        list.add(new Person("老李", 38, 1.88));
        list.add(new Person("小王", 21, 1.65));
        list.add(new Person("小张", 27, 1.85));
        list.add(new Person("小米", 21, 1.65));
        Iterator<Person> iterator = list.iterator();
        while (iterator.hasNext()){
            Person p=iterator.next();
            p.setAge(p.getAge()+2);
        }
        for (Person person : list) {
            System.out.println(person);
        }
    }
}
