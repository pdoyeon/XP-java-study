package Chap5;

import java.awt.desktop.SystemEventListener;
import java.util.Scanner;

public class WhileTest {
    public static void main(String[] args) {
        // 1. While문을 이용하여 1부터 10까지의 합을 구하고 결과를 출력
//        int i = 0;
//        int sum = 0;
//        while (i <= 10) {
//            sum += i;
//            i++;
//        }
//        System.out.println("1부터 10까지의 합 : " + sum);

        // 2. 사용자로부터 양의 정수 n을 입력 받고 while문을 사용하여 1부터 n까지의
        // 홀수의 합을 구하고 결과를 출력
//        Scanner scan = new Scanner(System.in);
//        System.out.print("n 입력 : ");
//        int i = 0;
//        int n = scan.nextInt();
//        int result = 0;
//        while (i <= n) {
//            if(i % 2 == 1) result += i;
//            i++;
//        }
//        System.out.println("1부터 9까지 홀수 합 = " + result);

        // 3. 양의 정수 n을 입력 받고 while문을 사용하여 n!(팩토리얼)을 구하는 프로그램 작성
//        Scanner scan = new Scanner(System.in);
//        int i = 1;
//        int result = 1;
//        System.out.print("n 입력 : ");
//        int n = scan.nextInt();
//        while (i <= n) {
//            result *= i;
//            i++;
//        }
//        System.out.println(n + "! = " + result);

        // 4. 숫자를 입력하여 그 수만큼 *을 출력
        Scanner scan = new Scanner(System.in);
        int i = 0;
        System.out.print("숫자 입력 : ");
        int num = scan.nextInt();
        while(i < num) {
            System.out.print("*");
            i++;
        }


    }
}
