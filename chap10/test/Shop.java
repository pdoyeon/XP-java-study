package chap10.test;

public class Shop {
    int product1, product2, product3;
    int num1, num2, num3;

    public void setValues(int product1, int product2, int product3, int num1, int num2, int num3) {
        this.product1 = product1;
        this.product2 = product2;
        this.product3 = product3;
        this.num1 = num1;
        this.num2 = num2;
        this.num3 = num3;
    }

    public int cal1() {
        return product1 * num1;
    }

    public int cal2() {
        return product2 * num2;
    }

    public int cal3() {
        return product3 * num3;
    }

    public int price() {
        return cal1() + cal2() + cal3();
    }

    public void printPrice() {
        System.out.println("총 결제 금액은 " + price() + "원입니다.");
    }
}
