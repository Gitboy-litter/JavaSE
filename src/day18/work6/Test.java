package day18.work6;

import java.io.*;

public class Test {
    public static void main(String[] args) throws IOException {
        File file=new File("D:\\Nwt\\recv\\紫怡\\images(1)\\mi1.jpg");
        FileInputStream fileInputStream=new FileInputStream(file);
        FileOutputStream fileOutputStream=new FileOutputStream("D:\\a\\"+file.getName());
        int b;
        while ((b=fileInputStream.read())!=-1){
                fileOutputStream.write(b);
        }
        fileOutputStream.close();
        fileInputStream.close();
    }
}
