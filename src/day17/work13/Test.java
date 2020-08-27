package day17.work13;

import java.io.File;

public class Test {
    public static void main(String[] args) {
        File fi= new File("d:\\aaa");
        iter(fi);
    }
    public static void iter(File file){
        File[] files = file.listFiles();
        for (File file1 : files) {
            if (file1.isFile()){
                System.out.println(file1.getName());
            }
            if (file1.isDirectory()){
                iter(file1);
            }
        }

    }
}
