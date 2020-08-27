package day12.work9;

import java.util.ArrayList;
import java.util.Iterator;

public class Test {
    public static void main(String[] args) {
        ArrayList<Person> list = new ArrayList<>();
        list.add(new Person("老王", 35, 1.75));
        list.add(new Person("老李", 38, 1.88));
        list.add(new Person("小王", 21, 1.65));
        list.add(new Person("小张", 27, 1.85));
        list.add(new Person("小丽", 21, 1.65));
        Iterator<Person> iterator = list.iterator();
        Person maxperson=new Person();
        Person minperson=new Person();
        double maxleng=0.00;
        double minleng=2.00;
        while (iterator.hasNext()) {
            Person p = iterator.next();
            if (p.getLength()>maxleng){
                maxleng=p.getLength();
                maxperson=p;
            }
            if (p.getLength()<minleng){
                minleng=p.getLength();
                minperson=p;
            }
        }
        System.out.println("最矮的人是:"+minperson.getName()+" "+minperson.getLength());
        System.out.println("最高的人是:"+maxperson.getName()+" "+maxperson.getLength());
    }
}
