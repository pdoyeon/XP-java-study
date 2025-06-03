package chap11;

public class accessModifier {
    // 1. 접근제어자
    // 클래스 내부의 변수(속성)과 메서드(멤버함수)에 대한 접근 범위를 지정하는 것
    // 클래스 외부로 노출여부를 결정
    // 코드를 보호하고 잘못된 접근이나 수정사항을 미리 방지하고자 함

    // 2. 접근제어자의 목적
    // 공개범위 순서 : public > protected > default > private
    // 2-1. public : 패키지 상관없이 모든 클래스에서 접근 가능
    // 2-2. protected : 같은 패키지 내 모든 클래스와 다른 패키지 자식 클래스 접근 가능
    // 2-3. default : 제어자가 없으며 같은 패키지 안 클래스에만 접근 가능
    // 2-4. private : 같은 클래스 내의 멤버(속성, 메서드)만 접근 가능
    public String studentId;
    protected String studentClass;
    int grade;  // default
    private String address;

}
