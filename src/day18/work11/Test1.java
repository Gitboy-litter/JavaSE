package day18.work11;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.Scanner;

public class Test1 {
   static int num=0;
    public static void main(String[] args) throws IOException {
        Scanner scanner=new Scanner(System.in);
        String next = scanner.next();
        File file=new File("d:\\a.txt");
        FileInputStream fileInputStream=new FileInputStream(file);
        int a;
        while ((a=fileInputStream.read())!=-1){
            statistics((char) a,next);
        }
        fileInputStream.close();
        System.out.println(next+"出现了"+num+"次");
    }
    public static int statistics(char c,String next){
        if ((c+"").equals(next)){
            num++;
        }
        return num;
    }
}
