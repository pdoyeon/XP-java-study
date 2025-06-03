package chap11.test;

import java.util.Scanner;

public class BookTest {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("책의 제목 : ");
        String title = scan.next();
        System.out.print("책의 저자 : ");
        String author = scan.next();

        Book book = new Book(title, author);
        book.bookInfo();
    }
}
