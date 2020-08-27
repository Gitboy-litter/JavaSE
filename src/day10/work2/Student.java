package day10.work2;

public class Student {
   private String name;
   private boolean attendance;
    public Student() {
    }

    public Student(String name, boolean attendance) {
        this.name = name;
        this.attendance = attendance;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isAttendance() {
        return attendance;
    }

    public void setAttendance(boolean attendance) {
        this.attendance = attendance;
    }
}
