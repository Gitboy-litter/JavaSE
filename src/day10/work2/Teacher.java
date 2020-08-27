package day10.work2;

public class Teacher {
    private String name;

    public Teacher(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public Student roll(String name,Boolean flag){
        Student student=new Student();
        student.setName(name);
        student.setAttendance(flag);
        return student;
    }
}
