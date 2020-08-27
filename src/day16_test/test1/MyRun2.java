package day16_test.test1;

import day13.work11.Student;

public class MyRun2 implements Runnable {
    private User user;

    public MyRun2(User user) {
        this.user = user;
    }

    @Override
    public void run() {
        while (true) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            synchronized (user) {
                user.notify();
                System.out.println("唤醒");
            }

        }
    }
}
