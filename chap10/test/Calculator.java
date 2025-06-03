package chap10.test;

public class Calculator {
    // 멤버변수
    int num1;
    int num2;

    // 생성자
    public Calculator(int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    // 메서드
    // 덧셈
    public int add(int num1, int num2) {
        int result = num1 + num2;
        return result;
    }

    // 뺄셈
    public int sub(int num1, int num2) {
        int result = num1 - num2;
        return result;
    }

    // 곱셈
    public int mal(int num1, int num2) {
        int result = num1 * num2;
        return result;
    }

    // 나눗셈
    public int rel(int num1, int num2) {
        int result = num1 / num2;
        return num1 / num2;
    }
    
    public void printCal() {
        System.out.println("사칙연산 클래스");
    }

    
}
