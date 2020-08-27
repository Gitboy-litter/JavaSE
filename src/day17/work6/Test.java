package day17.work6;

import java.io.File;
import java.io.IOException;

public class Test {
    public static void main(String[] args) throws IOException {
        File file = new File("d:\\aaa","\\a.txt");
        System.out.println(file.getAbsolutePath());
        System.out.println(file.getName());
        System.out.println(file.length());
        System.out.println(file.getParent());
    }
}
