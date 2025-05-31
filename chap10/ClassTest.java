package chap10;

public class ClassTest {

    // 1. 클래스 (class)
    // 구현 대상인 객체의 속성과 기능을 코드로 구현한 것을 뜻함
    // 이미 은연 중에 사용되고 있음 (public class)

    // 2. 클래스의 정의
    // class 예약어 사용 (접근제어자 앞에 사용)
    // 클래스 이름은 대문자로 시작하는 것을 권장

    // 접근제어자 | 예약어 | 클래스 이름
    public class Song {
        // 속성
        String title;
        String singer;
        int date;

        // 생성자
        public Song(String title, String singer, int date) {
            this.title = title;
            this.singer = singer;
            this.date = date;
        }

        // 메서드
        public void showPrint() {
            System.out.println("제목 : " + title);
            System.out.println("가수 : " + singer);
            System.out.println("발매일 : " + date);
        }
    }

    // 학생 클래스 만들기
    public class Student {
        // 속성 : 속성에 맞는 자료형과 변수로 선언
        int studentID;
        int grade;
        String address;

        // 메서드 : 속성 정보를 이용하여 필요한 기능을 함수 형식으로 선언
        public void showStuID() { }
        public void showGrade() { }
    }

    public static void main(String[] args) {

    }
}
