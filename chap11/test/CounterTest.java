package chap11.test;

public class CounterTest {
    public static void main(String[] args) {
        Counter cnt1 = new Counter("doyeon");
        int se1 = cnt1.getCount();
        System.out.println(se1);    // 1

        Counter cnt2 = new Counter("minseo");
        int se2 = cnt1.getCount();
        System.out.println(se2);    // 2

        Counter cnt3 = new Counter("solhee");
        int se3 = cnt1.getCount();
        System.out.println(se3);    // 3

        Counter cnt4 = new Counter("jisul");
        int se4 = cnt1.getCount();
        System.out.println(se4);    // 4
    }
}
