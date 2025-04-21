package Chap6;

public class ForEachTest {
    public static void main(String[] args) {
        // 1. 배열에 있는 숫자들의 합과 평균을 출력하는 프로그램
        // 배열은 여러 개의 데이터를 모으는 자료구조
//        int numbers[] = {10, 20, 30, 40, 50};
//        int sum = 0;
//        double avg = 0;
//        for (int i : numbers) {
//            sum += i;
//        }
//        avg = sum / numbers.length;
//        System.out.println("합 = " + sum + ", 평균 = " + avg);

        // 2. 배열 속에 문자열들이 있을 때 각 문자열의 길이가 긴 단어와 그 길이를 출력하는 프로그램
        String words[] = {"apple", "banana", "watermelon", "kiwi", "pear"};
        String longWord = "";
        for (String i : words) {
            if (longWord.length() < i.length()) longWord = i;
        }
        System.out.println(longWord + ", " + longWord.length());

    }
}
