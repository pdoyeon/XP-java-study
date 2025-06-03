package chap11.test;

public class Student {
    int age;
    String name;
    int grade;
    String major;

    public Student(int age, String name, int grade, String major) {
        this.age = age;
        this.name = name;
        this.grade = grade;
        this.major = major;
    }

    public void showInfo() {
        System.out.println("나이: " + this.age);
        System.out.println("이름: " + this.name);
        System.out.println("학년: " + this.grade);
        System.out.println("학과: " + this.major);
    }
}
