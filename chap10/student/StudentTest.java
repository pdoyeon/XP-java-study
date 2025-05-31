package chap10.student;

public class StudentTest {
    int stuId;
    String stuName;
    int grade;
    String address;
    
    // 생성자
    // 생성자를 이용하여 인스턴스를 생성할 때 호출되는 메서드 (new 사용 시)
    // 인스턴스 생성 시, 변수 초기화 작업을 수행하고 싶을 때 함수 작성

    // 메서드
    public String getStuName() {
        return stuName;
    }
    public void setStuName(String name) {
        stuName = name;
    }
}
