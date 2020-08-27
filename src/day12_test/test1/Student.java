package day12_test.test1;

public class Student<E> {
    private String name;
    private int age;
    private E e;

    public Student(String name, int age, E e) {
        this.name = name;
        this.age = age;
        this.e = e;
    }

    public Student() {
    }
    public E eat(E e){
        System.out.println("Eat");
        return null;
    }
    public E getE() {
        return e;
    }

    public void setE(E e) {
        this.e = e;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
