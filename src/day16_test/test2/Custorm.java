package day16_test.test2;

public class Custorm implements Runnable {
    private  BaoZi baoZi;

    public Custorm(BaoZi baoZi) {
        this.baoZi = baoZi;
    }

    @Override
    public void run() {
    while (true){
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        synchronized (baoZi){
            if (baoZi.getNumber()<=0){
                System.out.println("吃完啦，等待生产");
                try {
                    baoZi.notify();
                    baoZi.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }else {
                System.out.println("吃包子");
                baoZi.setNumber(baoZi.getNumber()-1);
            }
        }
    }
    }
}
