package chap11.test;

public class Book {
    String title;
    String author;

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    public void bookInfo() {
        System.out.println("제목: " + this.title);
        System.out.println("저자: " + this.author);
        
    }
}
