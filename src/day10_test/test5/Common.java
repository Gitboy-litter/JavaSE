package day10_test.test5;

import java.util.ArrayList;

public class Common implements OpenMode {
    @Override
    public ArrayList<Integer> faHongBao(int money, int count) {
        ArrayList<Integer> list = new ArrayList<>();
        int temp=money/count;
        int sum=0;
        for (int i = 0; i < count-1; i++) {
            list.add(temp);
            sum+=temp;
        }
        list.add(money-sum);
        return list;
    }
}
