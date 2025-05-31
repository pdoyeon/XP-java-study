package chap10;

public class Student {
    public static void main(String[] args) {
        StudentTest student = new StudentTest();

        student.stuId = 2025000221;
        student.stuName = "박도연";
        student.grade = 1;
        student.address = "서울시 영등포구";

        System.out.println(student.stuId);
        System.out.println(student.stuName);
        System.out.println(student.grade);
        System.out.println(student.address);
    }
}
