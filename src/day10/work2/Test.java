package day10.work2;

public class Test {
    public static void main(String[] args) {
        Teacher teacher=new Teacher("小红老师");
        Course course=new Course();
        course.setName(teacher.getName());
        course.setCoursename("java");
        course.getList().add(teacher.roll("小明",true));
        course.getList().add(teacher.roll("小红",false));
        course.getList().add(teacher.roll("小兰",true));
        course.show();
    }
}
