package chap11;

public class VariableRange {
    // 변수의 종류
    // 1-1. 지역 변수 (local variable)
    // 1-2. 멤버 변수 (class variable)
    // 1-3. 정적 변수 (class variable)
    private static int test = 1000;     // 정적변수 (클래스에서 선언, 공유목적 선언 클래스 변수)
    String studentId;
    int grade;
    String studentName;     // 멤버변수 (클래스 선언 변수)

    public String showStudentId() {
        String result;  // 지역변수 (메서드에서 선언됨)
        if (grade > 2) {
            result = "CE" + studentId;
        } else {
            result = "S" + studentId;
        }
        return result;
    }

    public void printTen() {
        // i = 지역변수 (메서드에서 선언됨)
        for (int i = 0; i < 10; i++) {
            System.out.println("*");
        }
    }

    // 지역변수
    // 1. 함수 내부에 위치하며 함수 내부에서만 사용 가능
    // 2. 함수가 호출될 때 생성됨
    // 3. 함수 실행이 끝나면 소멸되어 없어짐
    // 4. 스택 메모리
    
    // 멤버 변수
    // 1. 클래스 안에 멤버 변수로 선언
    // 2. 클래스 내부 사용 / 참조 변수로 사용
    // 3. 인스탠스 생성 시 같이 만들어짐
    // 4. 가비지 컬렉터가 자동으로 수거할 때 없어짐
    // 5. 힙 메모리

    // 정적변수
    // 1. 클래스 안에서 static 붙여서 선언됨
    // 2. 클래스 내부 사용 / 클래스 이름 참조 사용
    // 3. 프로그램 시작할 때 만들어짐
    // 4. 프로그램 끝나면서 없어짐
    // 5. 데이터 영역 메모리

}
