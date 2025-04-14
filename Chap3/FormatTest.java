package Chap3;

public class FormatTest {
    public static void main(String[] args) {
        String hello = "Hello";
        String world = "World";
        System.out.printf("%s %s \n", hello, world);

        String word1 = "반지름";
        String word2 = "인 원의 둘레는";
        String word3 = "입니다.";
        int radius = 3;
        double PI = 3.141592;
        int circle = radius * (int) PI * 2;
        System.out.printf("%s %d %s %d %s", word1, radius, word2, circle, word3);

    }
}
