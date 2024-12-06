package boou.java_practice;

import java.time.LocalDate;

public class Author {
    //    public Author(String authorname) {
//        this.author = authorname;
//    }
    String name;
    String author;
    LocalDate dateOfBirth;

    public Author(String name) {
        this.name = name;
        this.author = author;
//        this.dateOfBirth = dateOfBirth;
    }

    void changerName(String newName) {
        if (newName.length() > 10) {
            throw new IllegalArgumentException();
        }
        name = newName;
    }
}
