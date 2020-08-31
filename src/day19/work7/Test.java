package day19.work7;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class Test {
    public static void main(String[] args) throws Exception {
        ObjectOutputStream outputStream=new ObjectOutputStream(new FileOutputStream("d:\\ccc.txt"));
        Student student=new Student("刘备",38,"男");
        outputStream.writeObject(student);
        outputStream.close();
    }
}
