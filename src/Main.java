import libraryAutomation.business.BooksManager;
import libraryAutomation.core.logging.FileLogger;
import libraryAutomation.core.logging.Logger;
import libraryAutomation.dataAccess.JdbsBooksDao;
import libraryAutomation.entities.Books;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) throws Exception {
        Books book = new Books(1,"Les Misérables","Victor Hugo",7,96);

        Logger[] loggers = {new FileLogger()};

        BooksManager booksManager = new BooksManager(new JdbsBooksDao(), Arrays.asList(loggers));
        booksManager.add(book);

    }
}