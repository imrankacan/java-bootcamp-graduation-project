import main.java.javabootcampgraduationproject.business.BooksManager;
import main.java.javabootcampgraduationproject.core.logging.FileLogger;
import main.java.javabootcampgraduationproject.core.logging.Logger;
import main.java.javabootcampgraduationproject.entities.Books;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) throws Exception {
        Books book = new Books(1,"Les Misérables","Victor Hugo",7,96);

        Logger[] loggers = {new FileLogger()};

        BooksManager booksManager = new BooksManager(Arrays.asList(loggers));
        booksManager.add(book);

    }
}