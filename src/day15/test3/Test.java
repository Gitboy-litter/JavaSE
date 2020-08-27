package day15.test3;

import java.util.ArrayList;
import java.util.Random;

public class Test {
    public static void main(String[] args) {
        Random random=new Random();
        ArrayList<Integer> list =new ArrayList<>();
        Thread thread=new Thread(new Runnable() {
            @Override
            public void run() {
                  while (true){
                  }
            }
        });
        Thread thread1=new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; list.size() < 10; i++) {
                    int number = random.nextInt(10);
                    if (list.contains(number)){
                        continue;
                    }else {
                        list.add(number);
                        System.out.println(number+"进入山洞");
                    }
                    try {
                        System.out.println("在山洞中");
                       thread.join(5000);
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                    System.out.println("出山洞");
                }
            }
        });
        thread.start();
        thread1.start();

    }
}
