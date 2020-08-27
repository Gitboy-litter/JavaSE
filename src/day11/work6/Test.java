package day11.work6;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Test {
    public static void main(String[] args) throws ParseException {
        SimpleDateFormat simpleDateFormat=new SimpleDateFormat("yyyy-MM-dd");
        String day="2016-12-18";
        Date date = simpleDateFormat.parse(day);
        simpleDateFormat.applyPattern("yyyy年MM月dd日");
        System.out.println(simpleDateFormat.format(date));
    }
}
