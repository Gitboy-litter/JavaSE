package day17.work16;

import java.io.File;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        File file = new File(scanner.next());
        System.out.println(calculate(file,0));
    }

    public static long calculate(File file,long size) {
        File[] files = file.listFiles();
        for (File listFile : files) {
            if (listFile.isFile()) {
                size += listFile.length();
            }
            if (listFile.isDirectory()) {
                return size+calculate(listFile,size);
            }
        }
        return size;
    }
}
