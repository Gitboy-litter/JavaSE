package day16_test.test2;

public class Product implements Runnable {
    private BaoZi baoZi;

    public Product(BaoZi baoZi) {
        this.baoZi = baoZi;
    }

    @Override
    public void run() {
        while (true) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            synchronized (baoZi) {
                if (baoZi.getNumber() >= 5) {
                    System.out.println("停止生产");
                    try {
                        baoZi.notify();
                        baoZi.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                } else {
                    System.out.println("当前包子数量"+(baoZi.getNumber()+1));
                    baoZi.setNumber(baoZi.getNumber()+1);
                }
            }
        }
    }
}
