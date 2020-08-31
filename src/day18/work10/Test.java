package day18.work10;

import java.io.*;

public class Test {
    public static void main(String[] args) throws IOException {
        File file=new File("d:\\book");
        for (File listFile : file.listFiles()) {
            FileOutputStream fileOutputStream=new FileOutputStream("d:\\book1\\"+listFile.getName());
            FileInputStream fileInputStream=new FileInputStream(listFile);
            byte[] bytes=new byte[8];
            int len;
            while ((len=fileInputStream.read(bytes))!=-1){
                fileOutputStream.write(bytes,0,len);
            }
            fileInputStream.close();
            fileOutputStream.close();
        }
    }
}
