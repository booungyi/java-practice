package boou.java_practice;

import java.time.LocalDate;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class class1 {
    public static void main(String[] args) {
        Map<String, String> books = new HashMap<>();
        Book book = new Book();
        book.title = "ring";
        book.price = 12000;
        book.publishedAt = LocalDate.of(2021, 02, 21);
        book.isbn = 123456;
        book.printTitle(book.price);

        Author author = new Author();
        author.name = "이름";
        author.dateOfBirth = LocalDate.of(1988, 10, 8);

        Publisher publisher = new Publisher();
        publisher.name = "cosmos";

        Product product = new Product();
        product.name = "cookies";
        product.price = 12222;

        Brand brand = new Brand();
        brand.name = "Pari";

        Category category = new Category();
        category.name = "bread";
    }

}
