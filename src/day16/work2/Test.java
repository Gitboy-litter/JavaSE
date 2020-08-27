package day16.work2;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Test {
    public static void main(String[] args) {
        ExecutorService executorService= Executors.newFixedThreadPool(3);
        Thread t1=new Thread(new Runnable() {
            @Override
            public void run() {
                int sum=1;
                for (int i = 1; i <=10; i++) {
                    sum*=i;
                }
                System.out.println(Thread.currentThread().getName()+" "+sum);
            }
        },"10阶乘");
        Thread t2=new Thread(new Runnable() {
            @Override
            public void run() {
                int sum=1;
                for (int i = 1; i <=5; i++) {
                    sum*=i;
                }
                System.out.println(Thread.currentThread().getName()+" "+sum);
            }
        },"5阶乘");
        Thread t3=new Thread(new Runnable() {
            @Override
            public void run() {
                int sum=1;
                for (int i = 1; i <=8; i++) {
                    sum*=i;
                }
                System.out.println(Thread.currentThread().getName()+" "+sum);
            }
        },"8阶乘");
        executorService.submit(t1);
        executorService.submit(t2);
        executorService.submit(t3);
    }
}
