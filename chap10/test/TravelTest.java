package chap10.test;

import java.util.Scanner;

public class TravelTest {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Travel travel = new Travel(0, 0);

        System.out.print("여행 기간을 입력하세요. : ");
        int period = scan.nextInt();
        System.out.print("숙박비를 입력하세요. : ");
        int expense = scan.nextInt();

        travel.calculator(period, expense);
        travel.expensePrint();

    }
}
