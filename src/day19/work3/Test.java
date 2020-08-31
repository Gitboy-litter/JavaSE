package day19.work3;

import java.io.*;

public class Test {
    public static void main(String[] args) throws IOException {
        BufferedInputStream inputStream=new BufferedInputStream(new FileInputStream("d:\\1.png"));
        BufferedOutputStream outputStream=new BufferedOutputStream(new FileOutputStream("d:\\ccc\\1.png"));
        byte[] bytes=new byte[1024];
        int read;
        if ((read=inputStream.read(bytes))!=-1){
        outputStream.write(bytes,0,read);
        }
        outputStream.close();
    }
}
