package Chap5;

import java.util.Scanner;   // 1. 패키지 호출

public class ScannerTest {
    public static void main(String[] args) {
        // Scanner
        // 키보드 입력을 통해 프로그램에 원하는 데이터 값을 입력 받아 사용할 때 쓰는 클래스
        // 기본적인 데이터(정수, 실수, 문자)를 Scanner 메소드를 사용하여 입력 가능
        // 주의점) 사용하기 전에 패키지를 호출해야 함
        Scanner scan = new Scanner(System.in);  // 2. 스캐너 선언
        System.out.print("정수 입력 : ");
        int scanTest = scan.nextInt();  // 3. 메서드 호출
        System.out.println("입력 결과 : " + scanTest);

        // 1. next() : 단어 입력
        // 여러 단어(문장)을 입력하면 next()를 여러 번 호출해서 각각 입력
        Scanner inStr1 = new Scanner(System.in);
        System.out.print("word1 : ");
        String word1 = inStr1.next();
        System.out.print("word2 : ");
        String word2 = inStr1.next();
        System.out.println("inStr1 : " + word1);
        System.out.println("inStr2 : " + word2);

        // 2. nextLine() : 문장 입력 (한 줄 기준)
        Scanner inStr2 = new Scanner(System.in);
        System.out.print("inStr : ");
        String sentence = inStr2.nextLine();
        System.out.println("입력 문장 : " + sentence);
    }
}
