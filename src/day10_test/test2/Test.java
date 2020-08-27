package day10_test.test2;

public class Test {
    public static void main(String[] args) {
//        Person person = new Person();
//        person.swimming();
//        Swim swim= new Swim() {
//            @Override
//            public void swimming() {
//                System.out.println("狗刨式游泳");
//            }
//        };
        Swim swim=(()->{
            System.out.println("狗刨式游泳");
        });
        swim.swimming();
        System.out.println();
    }
}
