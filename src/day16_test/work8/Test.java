package day16_test.work8;

import java.util.HashSet;
import java.util.Random;

public class Test {
    static  int number=100;
   static int qian=0;
   static int hou=0;
    public static void main(String[] args) {
        DoubleColorBallUtil ballUtil=new DoubleColorBallUtil();
        Object o=new Object();
        HashSet<Integer> hashSet=new HashSet<>();
      Runnable r=  new Runnable() {
            @Override
            public void run() {
                while (true){
                    synchronized (o) {
                        if (number <= 0) {
                            break;
                        }
                        if (Thread.currentThread().getName().equals("前门")) {
                            qian++;
                        }
                        if (Thread.currentThread().getName().equals("后门")) {
                            hou++;
                        }
                        number--;
                        while (true){
                            Random random = new Random();
                           int a= random.nextInt(9999)+90000;
                            if (!hashSet.contains(a)){
                                hashSet.add(a);
                                System.out.println("编号为:" + a + "的员工从" + Thread.currentThread().getName() + "入场! 拿到的双色球彩票号码是:" + ballUtil.create());
                                break;
                            }
                        }

                        try {
                            Thread.sleep(100);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                }
                System.out.println("从后门入场的员工总共: "+hou+" 位员工");
                System.out.println("从前门入场的员工总共: "+qian+" 位员工");
            }
        };
        Thread thread1=new Thread(r,"前门");
        Thread thread2=new Thread(r,"后门");
        thread1.start();
        thread2.start();
    }
}
