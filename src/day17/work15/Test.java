package day17.work15;

import java.io.File;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String next = scanner.next();
        File file=new File(next);
        for (File listFile : file.listFiles()) {
            listFile.delete();
        }
    }
}
