package day17.work18;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Test {
    public static void main(String[] args)  {
        Scanner scanner=new Scanner(System.in);
        File file = new File(scanner.next());
       calcu(file);
    }
    public static void calcu(File file)  {
            for (File listFile : file.listFiles()) {
                if (listFile.isFile()){
                    listFile.delete();
                }
                if (listFile.isDirectory()){
                   if (listFile==null){
                       listFile.delete();
                   }else {
                    calcu(listFile);
                   }
                }
            }
            file.delete();
    }
}
