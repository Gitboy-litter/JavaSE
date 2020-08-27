package day11.work2;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Test {
    public static void main(String[] args) throws ParseException {
        String str=new String("1999-06-11");
        DateFormat dateFormat=new SimpleDateFormat("yyyy-MM-dd");
        Date parse = dateFormat.parse(str);
        System.out.println(dateFormat.format(parse));
    }
}
