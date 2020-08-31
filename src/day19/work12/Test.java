package day19.work12;

import java.io.*;

public class Test {
    public static void main(String[] args) throws Exception {
        BufferedReader bufferedReader = new BufferedReader(new FileReader("src/a.txt"));
        BufferedWriter bufferedWriter=new BufferedWriter(new FileWriter("src/b.txt"));
        int len;
        while ((len=bufferedReader.read())!=-1){
            bufferedWriter.write((char)len);
        }
        bufferedWriter.close();
        bufferedReader.close();
        InputStreamReader inputStreamReader=new InputStreamReader(new FileInputStream("src/b.txt"));
        int a;
        while ((a=inputStreamReader.read())!=-1){
            System.out.print((char) a);
        }
        inputStreamReader.close();
    }
}
