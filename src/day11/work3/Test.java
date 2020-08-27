package day11.work3;

import java.util.Calendar;

public class Test {
    public static void main(String[] args) {
        Calendar calendar = Calendar.getInstance();
        calendar.add(Calendar.DAY_OF_MONTH, 500);
        System.out.println(calendar.get(Calendar.YEAR)+"年" + calendar.get(Calendar.MONTH)+ "月"+ calendar.get(Calendar.DAY_OF_MONTH)+ "日");
    }
}
