package day18.work3;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Test {
    public static void main(String[] args) throws IOException {
        File file=new File("d:\\a.txt");
        FileOutputStream fileOutputStream=new FileOutputStream(file,true);
        fileOutputStream.write(1);
        fileOutputStream.write("\r\n".getBytes());
        fileOutputStream.close();
    }
}
