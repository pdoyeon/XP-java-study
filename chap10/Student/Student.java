package chap10.Student;

public class Student {
    public static void main(String[] args) {
        // 패키지로 클래스 묶음 관리하고 클래스를 불러서 사용
        
        // 1. 패키지
        // 클래스를 그룹화하는 방식
        // 코드를 그룹화하여 패키지 단위로 import하여 사용하기 위함
        // 예시) import java.util.Sacnner
        // -> Scanner를 사용하기 위한 java.util 패키지 지정
        // 같은 패키지 속 클래스끼리 별도 import 구문 없이 접근 가능
        // -> 다른 패키지는 import를 지정해야 쓸 수 있음
        // 소스 파일(.java)의 맨 위에 패키지 선언이 따름

        // 2. 메서드
        // 클래스 내부에서 멤버 변수(속성)를 이용하여 기능을 구현하는 함수
        // 2-1. 메서드의 종류
        // 인스턴스 메서드 -> 클래스 내부에 정의되어 클래스 생성 후 사용(호출) 가능
        // 정적 메서드 -> static 키워드를 사용하며 클래스 생성 없이 사용(호출) 가능
        // 생성자 메서드 -> 객체 생성 시 호출되는 특별 메서드
        
        StudentTest student = new StudentTest();

        student.stuId = 2025000221;
        student.stuName = "박도연";
        student.grade = 1;
        student.address = "서울시 영등포구";

        // 메서드 사용
        // new를 이용하여 클래스 인스턴스를 생성하고 메서드는 클래스 변수에 .을 붙여 호출ㄴ
        student.setStuName("박세빈");

        System.out.println(student.stuId);
        System.out.println(student.stuName);
        System.out.println(student.grade);
        System.out.println(student.address);
        
        // 인스턴스 여러 개 만들기
        StudentTest studentTest = new StudentTest();

        studentTest.stuId = 3409;
        studentTest.stuName = "윤민서";

        System.out.println(studentTest.stuId);
        System.out.println(studentTest.stuName);
    }
}
