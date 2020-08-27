package day15.test6;

public class Ticket implements Runnable {
    static int tickets=50;

    @Override
    public  void run() {
        while (true){
        synchronized (this){
                if (tickets<=1){
                    System.out.println("当前窗口为："+Thread.currentThread().getName()+"卖了最后一张票,票卖完了");
                    System.exit(1);
                }
                System.out.println("当前窗口为："+Thread.currentThread().getName()+"卖了一张票，剩余票数为"+(--tickets));
            }
        }
    }
}
