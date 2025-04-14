package Chap5;

import java.util.Scanner;

public class ForTest {
    public static void main(String[] args) {
        // for문 : 반복 횟수를 초기값, 조건식, 증감식으로 표현하는 번 명령문

        // 1. for문을 이용하여 1부터 10까지의 합을 구하고 결과를 출력하는 프로그램
//        int sum = 0;
//        for(int i = 0; i <= 10; i++) {
//            sum += i;
//        }
//        System.out.print("합계 = " + sum);

        // 2. 사용자로부터 정수 n을 입력 받고 1부터 n까지의 짝수의 합을 구하라
//        Scanner scan = new Scanner(System.in);
//        System.out.print("정수 n 입력 : ");
//        int n = scan.nextInt();
//        int sum = 0;
//        for(int i = 0; i <= n; i++) {
//            if(i % 2 == 0) sum += i;
//        }
//        System.out.print("1부터 9까지의 합 = " + sum);

        // 3. 사용자로부터 정수(구구단 수)를 입력 받아 해당 단을 출력
        // 조건) 2단부터 9단까지만 출력이 가능
//        Scanner scan = new Scanner(System.in);
//        System.out.print("구구단 수 입력 : ");
//        int num = scan.nextInt();
//        if (num < 2 || num > 9) {
//            System.out.print("2부터 9 사이의 수를 입력해주세요.");
//        } else {
//            for (int i = 1; i <= 9; i++) {
//                System.out.println(num + " x " + i + " = " + (num * i));
//            }
//        }

    }
}
