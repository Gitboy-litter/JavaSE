package day10_test.test5;

import java.util.ArrayList;
import java.util.Random;

public class Lucky implements OpenMode {
    @Override
    public ArrayList<Integer> faHongBao(int money, int count) {
        Random random=new Random();
        ArrayList<Integer> list = new ArrayList<>();
        int num=count;
        for (int i = 0; i < count-1; i++) {
            int max=random.nextInt(money/num*2)+1;
            if (max==money){
                i--;
            }else {
                num--;
                money-=max;
                list.add(max);
            }
        }
        list.add(money);
        return list;
    }
}
