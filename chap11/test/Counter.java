package chap11.test;

public class Counter {
    String name;
    static int count;

    public Counter(String title) {
        this.name = title;
        count++;
    }

    public String getName() {
        return name;
    }

    public static int getCount() {
        return count;
    }
}
