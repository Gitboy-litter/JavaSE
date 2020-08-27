package day11_test.test2;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Test {
    public static void main(String[] args) throws ParseException {
//        Date date=new Date();
//        String data="1999-06-11";
//        SimpleDateFormat simpleDateFormat=new SimpleDateFormat("yyyy-MM-dd");
//        try {
//            System.out.println(simpleDateFormat.parse(data));
//            System.out.println(simpleDateFormat.format(date));
//        } catch (ParseException e) {
//            e.printStackTrace();
//        }
//        Calendar calendar=Calendar.getInstance();
//        calendar.add(Calendar.DAY_OF_MONTH,500);
//        System.out.println(calendar.getTime());
      //     applyPattern(String pattern)
       String day="2016-12-18";
        SimpleDateFormat simpleDateFormat=new SimpleDateFormat("yyyy-MM-dd");
        SimpleDateFormat simpleDateFormat1=new SimpleDateFormat();
        simpleDateFormat1.applyPattern("yyyy年MM月dd日");
        Date date = simpleDateFormat.parse(day);
          System.out.println(date);
       System.out.println(simpleDateFormat1.format(date));
    }
}
