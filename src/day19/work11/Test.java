package day19.work11;

import com.sun.corba.se.impl.orbutil.ObjectWriter;

import java.io.*;
import java.util.ArrayList;

public class Test {
    public static void main(String[] args) throws Exception {
        Student student1=new Student("孙权",37,"男");
        Student student2=new Student("孙坚",39,"男");
        Student student3=new Student("孙策",38,"男");
        ArrayList<Student > list=new ArrayList<>();
        list.add(student1);
        list.add(student2);
        list.add(student3);
        ObjectOutputStream outputStream = new  ObjectOutputStream(new FileOutputStream("src/stus.txt"));
        for (Student student : list) {
        outputStream.writeObject(student);
        }
        outputStream.close();
    }
}
