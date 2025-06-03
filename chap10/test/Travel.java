package chap10.test;

public class Travel {
    int period;
    int expense;
    int totalExpense;

    public Travel(int period, int expense) {
        this.period = period;
        this.expense = expense;
    }

    public int calculator(int period, int expense) {
        totalExpense = period * expense;
        return totalExpense;
    }

    public void expensePrint() {
        System.out.println("총 여행 비용은 " + totalExpense + "원입니다.");
    }
}
