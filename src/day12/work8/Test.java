package day12.work8;

import java.util.ArrayList;
import java.util.Iterator;

public class Test {
    public static void main(String[] args) {
        ArrayList<Student> list=new ArrayList<>();
        list.add(new Student("小米",18,97));
        list.add(new Student("小兰",21,98));
        list.add(new Student("小龙",20,99));
        list.add(new Student("小花",18,100));
        list.add(new Student("小王",19,95));
        Iterator<Student> iterator = list.iterator();
        int max=0;
        int min=1000;
        int sum=0;
        while (iterator.hasNext()){
            Student s=iterator.next();
            if (s.getScore()>max){
                max=s.getScore();
            }
            if (s.getScore()<min){
                min=s.getScore();
            }
            sum+=s.getScore();
            System.out.println(s.getScore());
        }
        double avg=sum/list.size();
        System.out.println(sum+" "+avg+" "+max+" "+min);
    }
}
