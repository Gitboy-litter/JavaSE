package day18.work4;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Test {
    public static void main(String[] args) throws IOException {
        File file=new File("d:\\a.txt");
        FileInputStream fileInputStream=new FileInputStream(file);
        while (fileInputStream.read()!=-1){
        System.out.println((char) fileInputStream.read());
        }
    }
}
