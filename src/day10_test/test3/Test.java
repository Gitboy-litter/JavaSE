package day10_test.test3;

public class Test {
    public static void main(String[] args) {
        Swim swim = swimPeople();
        swim.swimming();
    }
    public static Swim swimPeople(){
        Student student=new Student();
        Teacher teacher=new Teacher();
        return student;
    }
}
