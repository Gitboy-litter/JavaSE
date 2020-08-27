package day16_test.test1;

public class MyRun1 implements Runnable {
    private User user;

    public MyRun1(User user) {
        this.user = user;
    }

    @Override
    public void run() {
        while (true){
            synchronized (user){
                System.out.println("1等待");
                try {
                    user.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("1唤醒");
            }
        }

    }
}
