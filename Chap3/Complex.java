package Chap3;

public class Complex {
    public static void main(String[] args) {
                                                                                                                        // 20
        int value = 20;
        System.out.println("Step 1 : " + value);
        //20 -> 25
        value += 5;
        System.out.println("Step 2 : " + value);
        // 25 -> 50
        value *= 2;
        System.out.println("Step 3 : " + value);
        // 50 -> 40
        value -= 10;
        System.out.println("Step 4 : " + value);
    }
}
