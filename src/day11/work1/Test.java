package day11.work1;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Date date=new Date();
        DateFormat dateFormat=new  SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        dateFormat.format(date);
        System.out.println(dateFormat.format(date));
    }
}
