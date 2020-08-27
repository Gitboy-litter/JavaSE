package day17.work8;

import java.io.File;

public class Test {
    public static void main(String[] args) {
        File file=new File("d:\\book");
        File[] files = file.listFiles();
        for (File file1 : files) {
            System.out.println(file1.getName());
        }
    }
}
