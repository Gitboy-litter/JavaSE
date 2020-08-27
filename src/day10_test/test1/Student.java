package day10_test.test1;

public class Student {
    public interface work{
        void work();
    }
    public String name="人";
    private int age=18;
    protected String sex="女";
    double length=1.73;

    public static void main(String[] args) {
        Student student=new Student();
        Student.cla cla=student.new cla();
        cla.run();
    }
 class cla implements work{
        String name="18";
        public void run(){
            String name="15";
            System.out.println(Student.this.name);
            System.out.println(this.name);
            System.out.println(name);
        }

     @Override
     public void work() {

     }
 }
}
