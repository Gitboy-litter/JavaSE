package day19.work10;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;

public class Test {
    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter=new BufferedWriter(new FileWriter("d:\\test1.txt"));
        BufferedReader bufferedReader=new BufferedReader(new FileReader("D:\\test.txt"));
        ArrayList<String> list=new ArrayList<>();
        String s="";
        int read;
        while ((s= bufferedReader.readLine())!=null){
           list.add(s);
        }
        Collections.reverse(list);
        for (String s1 : list) {
            bufferedWriter.write(s1);
            bufferedWriter.write("\r\n");
        }
        bufferedReader.close();
        bufferedWriter.close();
    }
}
