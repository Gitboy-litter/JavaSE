package day12_test.test1;

import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {
        Student<Integer> student=new Student();
        student.setE(44);
        System.out.println(student.getE());
        student.eat(88);
        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<String> list2 = new ArrayList<>();
        ArrayList<Number> list3 = new ArrayList<>();
        ArrayList<Object> list4 = new ArrayList<>();
        run(list4);
    }
    public static void run(ArrayList<? super Number> list){
        System.out.println(1);
    }
}
