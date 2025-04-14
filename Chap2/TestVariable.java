package Chap2;

public class TestVariable {
    public static void main(String[] args) {
//        int x = 30;
//        int y = 50;
//        System.out.println(x);
//        System.out.println(y);

        // 1. 나이를 변수에 저장하고 출력하기
//        int age = 20;
//        System.out.println("당신의 나이는" + age + "입니다.");

        // 2. 작년, 올해, 내년 연도를 변수 저장 후 출력하기
//        int lastYear = 2024;
//        int year = 2025;
//        int nextYear = 2026;
//        System.out.println("작년은 " + lastYear + "입니다.");
//        System.out.println("올해는 " + year + "입니다.");
//        System.out.println("내년은 " + nextYear + "입니다.");

        // 3. 원주율을 변수에 저장 후 출력
//        double pi = 3.141592;
//        float pi = 3.141592f;
//        System.out.println("원주율은 " + pi + "입니다.");

        // 4. 마라톤 코스 길이 저장 후 출력
//        double course = 42.195;
//        float course = 42.195f;
//        System.out.println("마라톤 코스의 길이는 " + course + "km 입니다.");

        // 5. 성 변수에 저장 후 출력
//        char name1 = '박';
//        char name2 = '도';
//        char name3 = '연';
//        System.out.println("나의 성은 " + name1 + "씨입니다.");
//        System.out.println("나의 이름은 " + name1 + name2 + name3 + "입니다.");

        // 6. 친구 성을 변수에 저장 후 출력
//        char friend = '양';
//        System.out.println("나의 친구의 성은 " + friend + "씨입니다.");

        // 7. 나이가 15세 이상일 때 boolean을 사용하여 참/거짓 판별
        int myAge = 15;
        String result1 = " ";
        boolean result2 = myAge >= 15;
        // if문 사용 X
        System.out.println("내가 15세이상이라는 명제가 " + result2 + "입니다.");
        // if문 사용
        if (result2 == true) result1 = "참(true)";
        else if (result2 == false) result1 = "거짓(false)";
        System.out.println("내가 15세이상이라는 명제가 " + result1 + "입니다.");

        // 8. boolean을 사용하여 형제의 여부를 변수에 저장하고 출력하라
        boolean yes = true;
        boolean no = false;
        boolean brother = no;
        String result = " ";
        if (brother == yes) result = "참(true)";
        else if (brother == no) result = "거짓(false)";
        System.out.println("내가 형제가 있다는 명제는 " + result + "입니다.");    // if문 사용
        System.out.println("내가 15세이상이라는 명제가 " + brother + "입니다.");  // if문 사용 X
    }
}