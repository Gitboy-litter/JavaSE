package day13.work4;

import java.util.HashSet;
import java.util.Iterator;

public class Test {
    public static void main(String[] args) {
        HashSet<Person> hashSet=new HashSet<>();
        hashSet.add(new Person("老李",55));
        hashSet.add(new Person("老白",49));
        hashSet.add(new Person("老张",65));
        hashSet.add(new Person("老白",49));
        for (Person person : hashSet) {
            System.out.println(person);
        }
    }
}
