package Chap4;

public class IfElseTest {
    public static void main(String[] args) {
        // 1. 나이가 20살 이상이면 '성인입니다'라고 아니면 '미성년입니다'라고 출력
//        int age = 15;
//        if (age >= 20) {
//            System.out.println("성인입니다.");
//        }
//        else {
//            System.out.println("나이가 " + age + "이므로 미성년입니다.");
//        }

        // 2. 정수형 변수에 정수 2개를 입력받고, 두 정수의 합이 짝수인지 홀수인지 판별
//        int num1 = 10;
//        int num2 = 5;
//        int sum = num1 + num2;
//        if (sum % 2 == 1) {
//            System.out.println(num1 + "과 " + num2 + "의 합은 홀수입니다.");
//        }
//        else {
//            System.out.println(num1 + "과 " + num2 + "의 합은 짝수입니다.");

        // 3. 두 개의 실수를 입력받아, 두 값의 합이 100보다 큰지 작은지 판별
//        double num1 = 65.6;
//        double num2 = 40.3;
//        double sum = num1 + num2;
//        if (sum > 100) {
//            System.out.println(num1 + "과 " + num2 + "의 합은 " + sum + "이며 100보다 큽니다.");
//        }

        // 4. 국어, 영어, 수학의 점수를 정수형으로 입력받아 세과목의 평균이 60점 이상이면 합격 아니면 불합격 출력
//        int kor = 70;   // 국어
//        int eng = 50;   // 영어
//        int math = 60;  // 수학
//        int avg = (kor + eng + math) / 3;   // 세과목 평균
//        if (avg >= 60) {
//            System.out.println("세과목 평균은 " + avg + "점이며 합격입니다.");
//        }
//        else {
//            System.out.println("세과목 평균은 " + avg + "점이며 불합격입니다.");
//        }

        // 5. 로그인 여부에 대한 논리형 변수 값에 따라 '로그인 성공'과 '로그인 실패' 메시지를 화면에 출력
//        boolean login = true;
//        if (login) {
//            System.out.println("로그인 성공");
//        }
//        else {
//            System.out.println("로그인 실패");
//        }

        // 6. 5000원 이상 현금, 카드를 가지고 있다면 '택시를 타세요'를 없다면 '걸어가세요' 출력
        // 조건) 현금 보유 3,000원, 카드보유여부 true
//        int cash = 3000;           // 현금 보유
//        boolean hadCard = true;    // 카드보유여부
//        if (cash >= 5000 || hadCard == true) {
//            System.out.println("택시를 타세요.");
//        }
//        else {
//            System.out.println("걸어가세요.");
//        }

        // 7. 구매금액과 VIP여부를 입력받아 구매금액이 500,000원이상이고 VIP인 경우
        // 10% 할인금액을 보여주고 그렇지 않으면 구매 금액을 그대로 출력
//        int amount = 650000;     // 구매금액
//        boolean isVIP = true;    // VIP여부
//        if (amount >= 500000 && isVIP == true) {
//            amount *= 0.9;  // 10%할인
//            System.out.println("결제하실 금액은 " + amount + "입니다.");
//        }
//        else {
//            System.out.println("결제하실 금액은 " + amount + "입니다.");
//        }

        // 8. 사람의 체온을 보고 건강 상태를 다음과 같이 진단하는 프로그램
        // 조건)
        // 35도 미만: 저체온
        // 35도 이상 37.5도 미만: 정상
        // 37.5도이상 38.0미만: 미열
        // 38.0도이상: 고열
//        double temperature = 37.6;  // 체온
//        if (temperature < 35) {
//            System.out.println(temperature + "도는 저체온입니다.");
//        }
//        else if (temperature >= 35 && temperature < 37.5) {
//            System.out.println(temperature + "도는 정상입니다.");
//        }
//        else if (temperature >= 37.5 && temperature < 38.0) {
//            System.out.println(temperature + "도는 미열입니다.");
//        }
//        else if (temperature >= 38.0) {
//            System.out.println(temperature + "도는 고열입니다.");
//        }

        // 9. 학생의 성적이 주어졌을 때 점수에 따라 학점을 출력
        // 90점 이상은 A, 80점 이상은 B, 70점 이상은 C, 60점 이상은 D, 60점 미만은 F
        int score = 82;     // 점수
        if (score >= 90) System.out.println("A학점입니다.");
        else if (score >= 80 && score <= 89) System.out.println("B학점입니다.");
        else if (score >= 70 && score <= 79) System.out.println("C학점입니다.");
        else if (score >= 60 && score <= 69) System.out.println("D학점입니다.");
        else if (score < 60) System.out.println("F학점입니다.");

    }

}
