package day18.work2;

import java.io.*;

public class Test {
    public static void main(String[] args) throws IOException {
        File file=new File("d:\\a.txt");
        FileOutputStream fileOutputStream=new FileOutputStream(file);
        byte[] bytes = "i love you".getBytes();
        for (int i = 0; i < 5; i++) {
            fileOutputStream.write(bytes);
            fileOutputStream.write("\r\n".getBytes());
        }
        fileOutputStream.close();
    }
}
