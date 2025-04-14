package Chap3;

public class OperatorTest {
    public static void main(String[] args) {
        // 1. 가로 40, 세로 30인 방의 넓이를 구하고 출력
//        int height = 40;
//        int width = 30;
//        int area = width * height;
//        System.out.println("가로길이 " + height + "세로길이" + width + "의 면적은 " + area + "입니다.");

        // 2. 94명을 30인승에 태우고 나머지는 걸어가야 할 때 필요한 차량 수, 걸어가는 사람 인원 출력
        // 나눗셈과 나머지 연산자를 사용할 것
//        int person = 94;
//        int car = person / 30;      // 필요한 차량 수
//        int w_person = person % 30; // 걸어가는 사람 수
//        System.out.println("필요차량수는 " + car + "대이고 걸어가는 사람은 " + w_person + "입니다.");

        // 3. 반지름 4.5, 원주율 3.141592일 때 원의 둘레 길이를 계산하고 출력
        // 방법 1) double 사용
//        double radius = 4.5;
//        double pi = 3.141592;
//        double result = 2 * radius * pi;
//        System.out.println("반지름 " + radius + "인 원의 둘레는 " + result);
//        // 방법 2) float 사용 - 형변환
//        float radius2 = (float) 4.5;
//        float pi2 = (float) 3.141592;
//        double result2 = 2 * radius2 * pi2;
//        System.out.println("반지름 " + radius2 + "인 원의 둘레는 " + result2);

        // *
        // 4. 1달러 당 환율 1,543원일 때 202달러를 원화로 표시하고 423,000원 달러로 바꾸어 출력
//        int exchange = 1543;
//        int won = 202;
//        int dallor = 423000;
//        System.out.println("292달러는 " + dallor + "원입니다.\n" + "423000원은 " + won + "달러입니다.");

        // 5. 숫자 10을 변수에 저장하고 복합대입연산자로 7을 더한 값을 출력
//        int value = 10;
//        value += 7;
//        System.out.println(value);

        // 6. 숫자 20을 변수에 저장하고 대입연산자를 사용하여 숫자를 출력
//        int value = 20;
//        System.out.println("step1 = " + (value += 5) + "\n" + // 25
//                "step2 = " + (value *= 2) + "\n" +            // 50
//                "step3 = " + (value -= 10) + "\n" +           // 40
//                "step4 = " + (value /= 2) + "\n" +            // 20
//                "step5 = " + (value %= 9));                   // 2

        // * 7. 숫자 10을 변수에 저장하고 증감연산자로 연산하는 프로그램 작성
//        int num2 = 10;
//        int res = ++num2;
//        System.out.println(num2);
//        System.out.println(res);
//        System.out.println(num2++);
//        System.out.println(++num2);

        // * 8. 증감연산자를 이용해 주어진 숫자 20을 다음 숫자들이 출력되도록 프로그램 작성
//        int num = 20;
//        System.out.println("Step1 = " + ++num);
//        System.out.println("Step2 = " + ++num);
//        System.out.println("Step3 = " + --num);
//        System.out.println("Step4 = " + --num);

        // 9. a=10, b=20일 때 a와 b를 비교하야 a가 b보다 작은지 여부(참, 거짓)를 변수 c에 저장하고 출력
//        int a = 10;
//        int b = 20;
//        boolean c = a < b;
//        System.out.println("a가 b보다 작은가? " + c);

        // 10. 30를 변수에 저장하고 다음과 같은 조건을 만족하는지 따져서 변수에 저장
        // 조건1) 주어진 숫자가 20 초과인지 여부
        // 조건2) 주어진 숫자가 0040 이상인지 여부
//        int num = 30;
//        boolean result1 = num > 20;
//        boolean result2 = num >= 40;
//        System.out.println("20보다 큰가? " + result1);
//        System.out.println("40보다 크거나 같은가? " + result2);

        // * 11. 주어진 숫자인 20, 50에 대해서 10보다 크고 30보다 작은 구간에 있는지의 여부를 판단
        // [논리연산자]
        // 변수 = (조건1) && (조건2); -> 조건1, 2를 동시에 만족할 때 true 반환, 그렇지 않을 시 false
        // 변수 = (조건1) || (조건2); -> 조건1;, 2 중 하나만 만족해도 true 반환, 둘 다 만족하지 않을 시 false
//        int num1 = 20;
//        int num2 = 50;
//        boolean result1 = (num1 >= 20) && (num1 < 30);
//        boolean result2 = (num2 >= 20) && (num2 < 30);
//        System.out.println("20은 구간 안에 있는가? " + result1);
//        System.out.println("50은 구간 안에 있는가? " + result2);

        // 11-1. 5보다 작거나 40보다 크면 true가 나오도록
//        int num1 = 20;
//        int num2 = 50;
//        boolean result1 = (num1 < 5) || (num1 > 40);
//        boolean result2 = (num2 < 5) || (num2 > 40);
//        System.out.println(num1 + "은 5보다 작거나 40보다 큰가? " + result1);
//        System.out.println(num2 + "은 5보다 작거나 40보다 큰가? " + result2);

        // 12. 빌리(22세, 5.8km), 스티브(25세, 25km)가 있을 때 장학금 기준에 맞춰 참/거짓을 출력
        // 조건) 나이가 20세 이상이고 학교 기준 통학 거리가 20km 이상
//        int billyAge = 22;
//        double billyDistance = 5.8;
//        boolean billy = (billyAge >= 20) && (billyDistance >= 20);
//        int steveAge = 25;
//        double steveDistance = 25;
//        boolean steve = (steveAge >= 20) && (steveDistance >= 20);
//        System.out.println("빌리는 장학금을 받을 수 있는가? " + billy);
//        System.out.println("스티브는 장학금을 받을 수 있는가? " + steve);

        // * 13. 결석 횟수가 3회 이하면 P 아니면 F를 삼항연산자를 사용하여 프로그램을 작성
        // 주어진 점수는 1회와 6회
        // 삼항연산자) 조건 ? 참일때의 값 : 거짓일때의 값;
        int cnt1 = 1;
        int cnt6 = 6;
        char student1 = cnt1 <= 3 ? 'P' : 'F';
        char student6 = cnt6 <= 3 ? 'P' : 'F';
        System.out.println("1회는 " + student1 + "입니다.");
        System.out.println("6회는 " + student6 + "입니다.");
    }
}