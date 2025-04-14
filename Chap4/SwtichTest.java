package Chap4;

public class SwtichTest {
    public static void main(String[] args) {
        // 1. 요일을 구분하는 숫자가 입력되었을 때 그에 대한 요일을 출력
        // 1이면 월요일, 2이면 화요일, 3이면 수요일, 4이면 목요일, 5이면 금요일
        // 6이면 토요일, 7이면 일요일이며 그 외는 잘못된 입력
        int day = 6;
        switch (day) {
            case 1 -> System.out.println("월요일");
            case 2 -> System.out.println("화요일");
            case 3 -> System.out.println("수요일");
            case 4 -> System.out.println("목요일");
            case 5 ->  System.out.println("금요일");
            case 6 -> System.out.println("토요일");
            case 7 -> System.out.println("일요일");
            default -> System.out.println("잘못된 입력");
        }

        // 2. 문자열 변수를 이용해 play, pause, stop 중 하나를 입력받아 알맞은 실행결과 출력
        // break문 대신 -> 명령어를 사용할 수 있음
//        String menu = "pause";
//        switch (menu) {
//            case "play" -> System.out.println("재생");
//            case "pause" -> System.out.println("일시정지");
//            case "stop" -> System.out.println("정지");
//        }

        // 3. 정수형 변수 월(month)를 입력받아 계절을 출력하는 프로그램 작성
        // 3~5월은 봄, 6~8월 여름, 9~11월 가을, 12~2월 겨울
        int month = 9;
        String season = "";
        switch (month) {
            case 3, 4, 5 -> season = "봄";
            case 6, 7, 8 -> season = "여름";
            case 9, 10, 11 -> season = "가을";
            case 12, 1, 2 -> season = "겨울";
        }
        System.out.println(month + "월은 " + season + "입니다.");

    }
}
