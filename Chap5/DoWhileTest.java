package Chap5;

import java.util.Scanner;

public class DoWhileTest {
    public static void main(String[] args) {
        // do-while문
        // 조건식을 나중에 쓰는 반복 명령문

        // 1. do-while문을 이용하여 1부터 10까지의 합을 구하고 결과를 출력
//        int i = 0;
//        int result = 0;
//        do {
//            result += i;
//            i++;
//        } while(i <= 10);
//        System.out.println("1부터 10까지의 합 = " + result);

        // 2. 사용자로부터 2부터 9 사이의 정수를 입력 받아, 해당 단의 구구단을
        // do-while문으로 출력하는 프로그램 (3 입력 -> 3단 출력)
//        Scanner scan = new Scanner(System.in);
//        int i = 1;
//        System.out.print("구구단 입력 : ");
//        int num = scan.nextInt();
//        if (num < 2 || num > 9) {
//            System.out.print("2와 9 사이의 숫자로 입력해주세요.");
//        } else {
//            do {
//                System.out.println(num + " x " + i + " = " + (num * i));
//                i++;
//            } while (i <= 9);
//        }

        // 3. 정수를 키보드로 계속 입력을 받는다. 입력 받은 숫자는 누적 합계를 계산하고
        // 키보드로 0을 입력하면 그 합계를 출력
//        Scanner scan = new Scanner(System.in);
//        int i = 0;
//        int sum = 0;
//        int num;
//        do {
//            System.out.print((i + 1) + "번째 숫자 입력 : ");
//            num = scan.nextInt();
//            sum += num;
//        } while (num != 0);
//        System.out.print("합계 = " + sum);


    }
}
