package day11.work4;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Test {
    public static void main(String[] args) throws ParseException {
        String bri="1999-06-11";
        DateFormat dateFormat=new SimpleDateFormat("yyyy-MM-dd");
        Date parse = dateFormat.parse(bri);
        Date date = new Date();
        long brithday = parse.getTime();
        long dateTime = date.getTime();
        long time=dateTime-brithday;
        if (time>0){
            System.out.println(time/1000/60/60/24);
        }else{
            System.out.println("没出生");
        }
    }
}
