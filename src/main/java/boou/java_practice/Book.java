package boou.java_practice;

import java.time.LocalDate;

public class Book {
    String title;
    LocalDate publishedAt;
    int price;
    int isbn;

    void printTitle(int price) {
        System.out.println(title + price);

    }
}
