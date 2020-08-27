package day17.work17;


import java.io.File;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        calcu(new File(scanner.next()));
    }
    public static void calcu(File file){
        FilterTest filterTest =new FilterTest();
        for (File listFile : file.listFiles()) {
            if (listFile.isFile()){
                filterTest.accept(listFile);
            }
            if(listFile.isDirectory()){
                calcu(listFile);
            }
        }
    }
}
