package chap11.test;

import java.util.Scanner;

public class StudentTest {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("나이 : ");
        int age = scan.nextInt();
        System.out.print("이름 : ");
        String name = scan.next();
        System.out.print("학년 : ");
        int grade = scan.nextInt();
        System.out.print("학과 : ");
        String major = scan.next();

        Student student = new Student(age, name, grade, major);
        student.showInfo();
    }
}
