package day14_02.work7;

import java.util.Random;

public class MyThread extends Thread {
    public MyThread() {
    }

    @Override
    public void run() {
        Random random = new Random();
        int sum = 0;
        for (int i = 0; i < 10; i++) {
            sum += random.nextInt(90) + 101;
        }
        System.out.println(sum);
        for (int i = 0; i < 10; i++) {
            System.out.println("大强");
        }
    }
}
