package chap10.test;

public class Price {
    String drink;
    String size;
    int basePrice = 0;

    public Price(String drink, String size) {
        this.drink = drink;
        this.size = size;
    }

    public int calculatePrice() {
        switch (drink) {
            case "아메리카노": basePrice = 2500; break;
            case "카페라떼": basePrice = 3000; break;
            case "카페모카": basePrice = 3500; break;
            default: basePrice = 0; break;
        }

        switch (size) {
            case "M": basePrice += 1000; break;
            case "L": basePrice += 2000; break;
            case "G": basePrice += 3000; break;
        }

        return basePrice;
    }

    public void errorMessage() {
        System.out.println("해당 음료는 메뉴에 없습니다.");
    }

    public void priceMessage() {
        System.out.println(drink + "의 가격은 " + calculatePrice() + "원입니다.");
    }
}
