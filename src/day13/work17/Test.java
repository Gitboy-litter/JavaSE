package day13.work17;

import java.util.HashSet;
import java.util.Iterator;

public class Test {
    public static void main(String[] args) {
        HashSet<Student> hashSet = new HashSet<>();
        hashSet.add(new Student("老李",48,99.5));
        hashSet.add(new Student("老白",58,88.0));
        hashSet.add(new Student("老易",68,91.0));
        hashSet.add(new Student("老万",38,77.0));
        hashSet.add(new Student("老李",48,93.5));
        double sum=0;
        double max;
        double min;
        Iterator<Student> iterator = hashSet.iterator();
        //while (iterator.hasNext()){
            Student students = iterator.next();
            max=students.getScore();
            min=students.getScore();
       // }
        for (Student student : hashSet) {
            if (student.getScore()>max){
                max=student.getScore();
            }
            if (student.getScore()<min){
                min=student.getScore();
            }
            sum+=student.getScore();
        }
        System.out.println("平均分为"+sum/hashSet.size());
        System.out.println("最高分为"+max);
        System.out.println("最低分为"+min);
        System.out.println(hashSet);
    }
}
