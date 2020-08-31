package day19.work9;

import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) throws FileNotFoundException {
        PrintStream printStream=new PrintStream("src/a.txt");
        Scanner scanner=new Scanner(System.in);
        System.setOut(printStream);
        String next = scanner.next();
        System.out.println(next);
        printStream.close();
    }
}
