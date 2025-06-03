package chap10.test;

import java.util.Scanner;

public class PriceTest {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String drinkType;
        String sizeType;

        while (true) {
            System.out.print("음료를 선택하세요.\n(아메리카노, 카페라떼, 카페모카)\n-> ");
            drinkType = scan.next();
            if (drinkType.equals("아메리카노") || drinkType.equals("카페라떼") || drinkType.equals("카페모카")) break;
            else System.out.println("해당 음료는 메뉴에 없습니다.");
        }

        System.out.print("사이즈를 선택하세요.\n(S, M, L, G)\n-> ");
        sizeType = scan.next();

        Price price = new Price(drinkType, sizeType);
        price.priceMessage();
    }
}
