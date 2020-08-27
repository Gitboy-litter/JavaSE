package day17.work1;

import java.io.File;
import java.io.IOException;

public class Test {
    public static void main(String[] args) throws IOException {
        File file1=new File("d:\\a.txt");
        File file2=new File("d:\\a","b.txt");
        file1.createNewFile();
        System.out.println(file2.getAbsolutePath());
       file2.mkdirs();
    }
}
