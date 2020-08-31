package day18.work12;

import java.io.*;
import java.security.PublicKey;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Random;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) throws IOException {
        HashSet<String> hashSet=new HashSet<>();
        Scanner scanner=new Scanner(System.in);
        String next = scanner.next();
        File file=new File(next);
        find(file,hashSet);
    }
    public static void find(File file,HashSet<String> hashSet) throws IOException {
        for (File listFile : file.listFiles()) {
            if (listFile.isDirectory()){
                find(listFile,hashSet);
            }
            if (listFile.isFile()){
               FileReader fileReader=new FileReader(listFile);
                if (hashSet.contains(listFile.getName())){
                    Random random=new Random();
                    int number= random.nextInt(9999)+ 90000;
                    FileWriter fileWriter=new   FileWriter("d:\\java\\"+number+".java");
                    meoth(fileReader,fileWriter);
                }else {
                    hashSet.add(listFile.getName());
                    FileWriter fileWriter=new FileWriter("d:\\java\\"+listFile.getName());
                    meoth(fileReader,fileWriter);
                }
            }
        }
    }
    public static void meoth(FileReader fileReader,  FileWriter fileWriter) throws IOException {
        char[] chars=new char[1024];
        int len;
        while ((len=fileReader.read(chars))!=-1){
            fileWriter.write(chars,0,len);
        }
        fileReader.close();
        fileWriter.close();
    }
}
