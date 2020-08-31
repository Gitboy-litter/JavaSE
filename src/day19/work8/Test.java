package day19.work8;

import day19.work7.Student;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class Test {
    public static void main(String[] args) throws Exception {
        Student student=null;
        ObjectInputStream inputStream=new ObjectInputStream(new FileInputStream("d:\\ccc.txt"));
        student = (Student) inputStream.readObject();
        inputStream.close();
        System.out.println(student.getSex()+" "+student.getName()+" "+student.getAge());
        inputStream.close();
    }
}
