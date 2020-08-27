package day16.work1;


import com.sun.org.apache.bcel.internal.generic.NEW;

import java.util.Random;
import java.util.concurrent.*;

public class Test {
    public static void main(String[] args) {
        ExecutorService executorService= Executors.newCachedThreadPool();
        Callable<Integer> callable=new Callable<Integer>() {
            @Override
            public Integer call() throws Exception {
                int sum=0;
                for (int i = 0; i < 10; i++) {
                    Random random=new Random();
                    sum += random.nextInt(100)+1;
                }
                System.out.println(sum/10);
                return  sum/10;
            }
        };
        int sum=0;
        for (int i = 0; i < 3; i++) {
            Future<Integer> submit = executorService.submit(callable);
            try {
                sum+=submit.get();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        System.out.println("平均："+sum/3);
    }
}
