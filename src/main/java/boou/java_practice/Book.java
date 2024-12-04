package boou.java_practice;

import java.time.LocalDate;

public class Book {
    String title;
    LocalDate publishedAt;
    int price;
    int isbn;

    public Book(int price, int isbn, String title, LocalDate publishedAt) {
        this.price = price;
        this.isbn = isbn;
        this.title = title;
        this.publishedAt = publishedAt;
    }

    void printTitle() {
        System.out.println(title+price+publishedAt+isbn);

    }
}
