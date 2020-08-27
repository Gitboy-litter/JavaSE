package day16.work8;

public class Test {
    static  int number=100;
    public static void main(String[] args) {
        DoubleColorBallUtil ballUtil=new DoubleColorBallUtil();
        Object o=new Object();
      Runnable r=  new Runnable() {
            @Override
            public void run() {
                int qian=0;
                int hou=0;
                while (true){
                    synchronized (o){
                        if (number<=0){
                            break;
                        }
                        if (Thread.currentThread().getName().equals("前门")){
                            qian++;
                        }
                        if (Thread.currentThread().getName().equals("后门")){
                            hou++;
                        }
                        number--;
                        System.out.println("编号为:"+(100-number)+"的员工从"+Thread.currentThread().getName()+"入场! 拿到的双色球彩票号码是:"+ballUtil.create());
                        try {
                            Thread.sleep(10);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                }
                if (Thread.currentThread().getName().equals("前门")){
                    System.out.println("从"+Thread.currentThread().getName()+"入场的员工总共: "+qian+" 位员工");
                }
                if (Thread.currentThread().getName().equals("后门")){
                    System.out.println("从"+Thread.currentThread().getName()+"入场的员工总共: "+hou+" 位员工");
                }
            }
        };
        Thread thread1=new Thread(r,"前门");
        Thread thread2=new Thread(r,"后门");
        thread1.start();
        thread2.start();
    }
}
