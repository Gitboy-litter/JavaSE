package day13.work11;

import java.util.HashSet;
import java.util.Iterator;

public class Test {
    public static void main(String[] args) {
        HashSet<Student> hashSet = new HashSet<>();
        hashSet.add(new Student("老李",48,"男"));
        hashSet.add(new Student("老白",58,"男"));
        hashSet.add(new Student("老易",68,"男"));
        hashSet.add(new Student("老万",38,"男"));
        hashSet.add(new Student("老李",39,"男"));
        hashSet.add(new Student("老花",41,"男"));
        hashSet.add(new Student("老李",48,"男"));
        hashSet.add(new Student("老万",38,"男"));
        hashSet.add(new Student("老李",47,"男"));
        hashSet.add(new Student("老李",43,"男"));
        Iterator<Student> iterator = hashSet.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}