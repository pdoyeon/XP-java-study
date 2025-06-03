package chap10.test;

import java.util.Scanner;

public class ShopTest {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Shop shop = new Shop();

        int[] product = new int[3];
        int[] num = new int[3];

        for (int i = 0; i < 3; i++) {
            System.out.print("상품 " + (i + 1) + " 가격: ");
            product[i] = scan.nextInt();
            System.out.print("상품 " + (i + 1) + " 수량: ");
            num[i] = scan.nextInt();
        }

        // 멤버 변수 초기화
        shop.setValues(product[0], product[1], product[2], num[0], num[1], num[2]);

        // 총 가격 출력
        shop.printPrice();
    }
}
