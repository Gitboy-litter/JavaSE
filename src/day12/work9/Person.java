package day12.work9;

public class Person {
    private String name;
    private int age;
    private double length;

    public Person() {
    }

    public Person(String name, int age, double length) {
        this.name = name;
        this.age = age;
        this.length = length;
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

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }
}
