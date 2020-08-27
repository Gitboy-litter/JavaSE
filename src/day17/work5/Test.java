package day17.work5;

import java.io.File;

public class Test {
    public static void main(String[] args) {
        File file = new File("d:\\a.txt");
        File file1 = new File("d:\\aaa");
        file.delete();
        file1.delete();
    }
}
