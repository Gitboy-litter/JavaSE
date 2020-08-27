package day17.work6;

import java.io.File;

public class Test {
    public static void main(String[] args) {
        File file = new File("d:\\aaa\\a.txt");
        file.mkdirs();
        System.out.println(file.getAbsolutePath());
        System.out.println(file.getName());
        System.out.println(file.length());
        System.out.println(file.getParent());
    }
}
