package day19_test.test2;

import java.io.*;
import java.util.HashMap;

public class Test {
    public static void main(String[] args) throws IOException {
 
        InputStreamReader inputStreamReader=new InputStreamReader(new FileInputStream("d:\\test.txt"));
        OutputStreamWriter outputStreamWriter=new OutputStreamWriter(new FileOutputStream("d:\\c.docx"));
        int len;
        while ((len=inputStreamReader.read())!=-1){
            outputStreamWriter.write(len);
        }
        outputStreamWriter.close();
        inputStreamReader.close();
    }
}
