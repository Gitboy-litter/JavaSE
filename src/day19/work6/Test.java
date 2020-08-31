package day19.work6;

import java.io.*;

public class Test {
    public static void main(String[] args) throws Exception {
        InputStreamReader inputStreamReader=new InputStreamReader(new FileInputStream("src/a.txt"),"gbk");
        int len;
        while ((len=inputStreamReader.read())!=-1){
            System.out.print((char) len);
        }
        inputStreamReader.close();
    }
}
