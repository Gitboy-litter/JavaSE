package day19.work1;

import java.io.*;

public class Test {
    public static void main(String[] args) throws IOException {
        BufferedOutputStream outputStream=new BufferedOutputStream(new FileOutputStream("d:\\ccc.txt"));
        outputStream.write(97);
        outputStream.close();
    }
}
