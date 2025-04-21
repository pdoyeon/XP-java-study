package Chap6;

import java.util.Scanner;

public class BreakTest {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // 문제) 키보드로 정수를 입력 받아 변수 n에 저장하고 1부터 계속 1씩 증가된
        // 숫자를 누적 합계를 내는데 총합이 n이 넘으면 반복 실행을 멈추는 프로그램
        
        // 방법1 : for문
//        System.out.print("n을 입력하시오. : ");
//        int n = scan.nextInt();
//        int sum = 0;
//        for (int i = 1; i <= n; i++) {
//            if (n < sum) break;
//            else sum += i;
//        }
//        System.out.print(sum);

        // 방법2 : while문
        System.out.print("n을 입력하시오. : ");
        int n = scan.nextInt();
        int sum = 0;
        int i = 0;
        // sum이 n미만인 경우동안 sum에 i를 더함
        while(n > sum) {
            sum += i;
            i++;
        }
        System.out.print(sum);

    }
}
