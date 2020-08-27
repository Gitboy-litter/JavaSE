package day13.work19;

import java.util.HashSet;
import java.util.Iterator;

public class Test {
    public static void main(String[] args) {
        HashSet<Student> classSet1=new HashSet<>();
        HashSet<Student> classSet2=new HashSet<>();
        HashSet<HashSet> Subject=new HashSet<>();
        classSet1.add(new Student("小明",21));
        classSet1.add(new Student("小龙",22));
        classSet1.add(new Student("小蓝",23));
        classSet2.add(new Student("小七",21));
        classSet2.add(new Student("小九",22));
        classSet2.add(new Student("小八",23));
        Subject.add(classSet1);
        Subject.add(classSet2);
        Iterator<HashSet> iterator = Subject.iterator();
        while (iterator.hasNext()){
          iterator.next().stream().forEach(n->{
                System.out.println(n);
            });
        }
        System.out.println("------------");
        for (HashSet hashSet : Subject) {
            for (Object o : hashSet) {
                System.out.println(o);
            }
        }
    }
}
