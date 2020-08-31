package day18_test.test2;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Test {
    public static void main(String[] args) throws IOException {
        FileReader fileReader=new FileReader("d:\\a.txt");
        int len;
        while ((len=fileReader.read())!=-1){
            System.out.println((char) len);
        }
        fileReader.close();
    }
}
