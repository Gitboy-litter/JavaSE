package day18.work5;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Test {
    public static void main(String[] args) throws IOException {
        File file=new File("d:\\a.txt");
        FileInputStream fileInputStream=new FileInputStream(file);
        byte[] b=new byte[2];
        int a;
        while ((a=fileInputStream.read(b))!=-1){
            System.out.println(new String(b,0,a));
        }
        fileInputStream.close();
    }
}
