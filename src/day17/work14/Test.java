package day17.work14;

import java.io.File;

public class Test {
    public static void main(String[] args) {
        File file=new File("d:\\课件");
        FilterTest filterTest=new FilterTest();
        for (File listFile : file.listFiles()) {
            if (filterTest.accept(listFile)){
                System.out.println(listFile.getName());
            }
        }
    }
}
