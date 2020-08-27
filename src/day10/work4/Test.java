package day10.work4;

public class Test {
    public static void main(String[] args) {
        Work work=new Work();
        Apple A=new Apple("青色",8.0);
        Apple B=new Apple("红色",5.0);
       Apple apple2= work.pickApple(new Campare(),A,B);
       Apple apple1=work.pickApple((a,b)->{
           return a=a.getColor()=="红色"?a:b;
       },A,B);
        System.out.println("默认挑大的：");
        System.out.println(apple2.getSize()+"-"+apple2.getColor());
        System.out.println("挑红的");
        System.out.println(apple1.getSize()+"-"+apple1.getColor());
    }
}
