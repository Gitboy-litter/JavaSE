package day18_test.test1;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class Test {
    public static void main(String[] args) throws IOException {
        File file=new File("d:\\a.txt");
        FileOutputStream  fileOutputStream=new FileOutputStream(file);
        fileOutputStream.write(99);
        byte[] bytes = "helloword".getBytes();
        for (byte b : bytes) {
        fileOutputStream.write(b);
        fileOutputStream.write("\r\n".getBytes());
        }
        fileOutputStream.close();
    }
}
