package day15.test4;

public class Test {
    static int number = 100;
    static int sum1=0;
    static int sum2=0;
    public static void main(String[] args) {
        Object o=new Object();
        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                while (true){
                    synchronized (o){
                        if (number<=0){
                            break;
                        }
                        System.out.println("实体店卖出第" + (101-number) + "个,还剩下" + (--number) + "个");
                        sum2++;
                    }
                }
                System.out.println("实体店一共卖出了"+sum2+"个");
            }
        }, "实体店");
        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                    while (true){
                        synchronized (o){
                        if (number<=0){
                            break;
                        }
                        System.out.println("网店卖出第" + (101-number) + "个,还剩下" + (--number) + "个");
                        sum1++;
                    }

                    }
                System.out.println("网店一共卖出了"+sum1+"个");
            }
        }, "网店");
        thread.start();
        thread1.start();
    }
}
