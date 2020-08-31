package day18.work7;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Test {
    public static void main(String[] args) throws IOException {
        File file=new File("D:\\Nwt\\recv\\×Ïâù\\images(1)\\mi1.jpg");
        FileInputStream fileInputStream=new FileInputStream(file);
        FileOutputStream fileOutputStream=new FileOutputStream("D:\\a\\"+file.getName());
        byte[] bytes=new byte[1024];
        int b;
        while ((b=fileInputStream.read(bytes))!=-1){
            fileOutputStream.write(bytes,0,b);
        }
        fileOutputStream.close();
        fileInputStream.close();
    }
}
