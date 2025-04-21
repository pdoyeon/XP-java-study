package Chap6;

public class ForContinueTest {
    public static void main(String[] args) {
        // 1. for문과 continue문을 사용해 1부터 100까지 숫자 중 3의 배수를
        // 제외한 합을 구하는 프로그램
        int sum = 0;
        for (int i = 1; i <= 100; i++) {
            if (i % 3 == 0) continue;
            else sum += i;
        }
        System.out.println("합 = " + sum);

    }
}
