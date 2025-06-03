package chap10.test;

public class Score {
    int kor;
    int eng;
    int math;

    public Score(int kor, int eng, int math) {
        this.kor = kor;
        this.eng = eng;
        this.math = math;
    }

    public int sum() {
        return kor + eng + math;
    }

    public double avg() {
        return sum() / 3.0; // 실수 나눗셈
    }

    public void printScore() {
        System.out.println("학생의 평균 점수는 " + avg() + "입니다.");
    }
}
