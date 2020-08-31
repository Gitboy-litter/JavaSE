package day20_test.test3;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Test {
    public static void main(String[] args) throws IOException {
        ObjectInputStream ois= new ObjectInputStream(new FileInputStream("d:\\a.txt"));
    }
}
