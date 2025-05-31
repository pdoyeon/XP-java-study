package chap10.person;

// 접근제어자 (public, protected, private, default)
// 클래스 내부의 변수(속성)과 메서드(멤버함수)에 대한 접근 범위를 지정하는 것(클래스 외부로 노출 여부를 결정)
// 코드를 보호하고 잘못된 접근이나 수정 사항을 미리 방지하고자 함

// 공개 범위 순 : public > protected > default > private

// 1) public : 패키지와 상관없이 모든 클래스에서 접근 가능
// 2) default(제어자 없음) : 같은 패키지 안 클래스에서만 접근 가능
// 3) protected : 같은 패키지 내 모든 클래스와 패키지 자식 클래스 접근 가능
// 4) private : 같은 클래스 내 멤버 (속성, 메서드)만 접근 가능
public class Person {
    // 1. 속성
    String name;
    double height;
    double weight;

    // 2-1. 생성자
    // 클래스 이름과 같은 이름으로 메서드 이름으로 선언
    // 기본 생성자(default constructor) : 인스턴스 생성만 담당
    // 작성하지 않아도 자동 생성
    // Person person = new Person();
    public Person() { }

    // 2-2. 생성자 선언
    // 매개변수 입력(초기치 입력) 가능한 생성자 만들기
    // 인스턴스 생성과 함께 초기치 설정을 위한 목적으로 메서드 생성
    // 2-2-1. 생성자 오버로드
    // 생성자 메서드를 여러 개 선언하는 방법을 생성자 오버로드라고 함
    // 인스턴스 생성 시 다양한 방법(초기화 방법)을 제공하기 위함
    public Person(String pname, double pheight, double pweight) {
        this.name = pname;
        this.height = pheight;
        this.weight = pweight;
    }
    

}
