package day10_test.test5;

import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {
        RedPackage redPackage=new RedPackage();
        redPackage.setName("马云");
        redPackage.setOpenMode(new Lucky() );
        //redPackage.setOpenMode(new Common());
//        ArrayList<Integer> list = redPackage.getOpenMode().faHongBao(10, 3);
//        System.out.println(list);
        for (int i = 0; i < 10; i++) {
            ArrayList<Integer> list = redPackage.getOpenMode().faHongBao(10, 5);
            System.out.println(list);
        }
    }
}
