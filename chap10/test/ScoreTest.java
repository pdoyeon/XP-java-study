package chap10.test;

public class ScoreTest {
    public static void main(String[] args) {
        Score score = new Score(50, 60, 80);
        int result = score.sum();
        double average = score.avg();

        System.out.println("총점: " + result);
        System.out.println("평균: " + average);
        score.printScore();
    }

}
