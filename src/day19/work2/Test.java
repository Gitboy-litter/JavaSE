package day19.work2;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Test {
    public static void main(String[] args) throws IOException {
        BufferedOutputStream outputStream=new BufferedOutputStream(new FileOutputStream("d:\\ccc.txt"));
        byte[] bytes = "i love you".getBytes();
        outputStream.write(bytes);
        outputStream.close();
    }
}
