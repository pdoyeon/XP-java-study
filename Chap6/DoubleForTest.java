package Chap6;

public class DoubleForTest {
    public static void main(String[] args) {
        // 1. 이중 for문을 이용하여 구구단을 2단부터 9단까지 출력
        for (int i = 2; i <= 9; i++) {
            System.out.println(i + "단");
            for (int j = 1; j <= 9; j++) {
                System.out.println(i + " x " + j + " = " + (i * j));
            }
        }

        // 2. 이중 for문과 * 하나를 출력한느 명령어를 사용하여 다음 패턴을
        // 화면에 출력하는 프로그램을 작성항라

    }
}
