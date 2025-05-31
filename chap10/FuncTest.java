package chap10;

public class FuncTest {
    // 1. 함수
    // 하나의 기능을 수행하는 코드를 말함
    // 자바에서는 함수보다 메서드라는 용어를 사용
    // (입력) -> (기능 수행 코드) -> (출력)

    // 2. 함수의 필요성
    // 같은 로직을 여러 번 반복 작성하지 않고 함수로 정의하여 재사용
    // 함수 이름으로 기능 파악이 가능해져 가독성이 높아짐
    // 기능 단위로 함수를 구성하여 프로그램 구조가 명확해짐
    // 함수 단위로 유지 보수와 관리가 용이 해짐

    // 3. 함수의 정의
    // 입력 : 함수 이름 다음 () 안에 매개변수를 선언
    // 출력 : return 예약어로 반환 명령 선언

    // add 함수 선언
    // int ->  반환 자료형(출력 자료형)
    // add -> 함수 이름
    // (int num1, int num2) -> 매개변수 (입력 변수)
//    public static int add (int num1, int num2) {
//        int result = num1 + num2;
//        return result;  // 반환 명령 (출력)
//    }

    // 4. 함수 변형
    int getTenTotal() {
        int total = 0;
        for (int i = 1; i <= 10; i++) {
            total += i;
        }
        return total;
    }

    // 5. 반환값이 필요없는 경우 (void)
    // 반환 자료형을 void 예약어로 쓰고 return은 쓰지 않아도 됨

    public static void main(String[] args) {
        // add 함수 사용
//        int n1 = 3;
//        int n2 = 4;
//        int r1 = add(n1, n2);
//        int r2 = add(2, 5);
//        int r3 = add(10, 3);
//        System.out.println("r1 : " + r1);
//        System.out.println("r2 : " + r2);
//        System.out.println("r3 : " + r3);

        

    }
}
