package day10.work2;

import java.util.ArrayList;

public class Course {
   private String name,coursename;
   private ArrayList<Student> list=new ArrayList<>();

    public Course() {
    }

    public Course(String name, String coursename, ArrayList<Student> list) {
        this.name = name;
        this.coursename = coursename;
        this.list = list;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCoursename() {
        return coursename;
    }

    public void setCoursename(String coursename) {
        this.coursename = coursename;
    }

    public ArrayList<Student> getList() {
        return list;
    }

    public void setList(ArrayList<Student> list) {
        this.list = list;
    }
    public void show(){
        System.out.println("课程名字 "+this.getCoursename());
        System.out.println("搜课老师 "+this.getName());
        for (Student student : this.getList()) {
            if (student.isAttendance())
            System.out.println("上课 "+student.getName());
            if (!student.isAttendance())
                System.out.println("旷课 "+student.getName());
        }
    }
}
