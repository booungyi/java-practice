package boou.java_practice;

import java.time.LocalDate;

public class Book {
    // new <- 객체(object) 를 생성하는 키워드
    Author author;
//    Publisher publisher;
    long id;
    String title;
    static long lastIssuedId = 0;

    public Book( String title , long lastIssuedid) {
        lastIssuedId = lastIssuedid*3;
//        this.publisher = publisher;
        this.id = id;
        this.title = title;
        this.author = author;
    }
    public static void main(String[] args) {
        Book book1 = new Book("오브젝트",2);
        Book book2 = new Book("Grokking algorithm",4);
        System.out.println("book1 = " + book1);
        System.out.println("book1.id = " + book1.id);
        System.out.println("book2.id = " + book2.id);
    }
}
