package day16.work7;

import java.awt.*;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Object object=new Object();
        Person person=new Person();
        Scanner scanner=new Scanner(System.in);
        Thread thread=new Thread(new Runnable() {
            @Override
            public void run() {
                while (true){
                    synchronized (object){
                        object.notify();
                        System.out.println("输入姓名");
                        person.setName(scanner.next());
                        System.out.println("输入性别");
                        person.setSex(scanner.next());
                        try {
                            object.wait();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                }
            }
        });
        Thread thread1=new Thread(new Runnable() {
            @Override
            public void run() {
                while (true){
                    synchronized (object){
                        object.notify();
                        if (!person.getSex().equals("人妖")){
                            System.out.println(person.getName()+" "+person.getSex());
                        }else {
                            System.out.println("性别不准确");
                        }
                        try {
                            object.wait();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                }
            }
        });
        thread.start();
        thread1.start();
    }
}
