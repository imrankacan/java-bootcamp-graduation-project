import libraryAutomation.business.BooksManager;
import libraryAutomation.dataAccess.JdbsBooksDao;
import libraryAutomation.entities.Books;

public class Main {
    public static void main(String[] args) throws Exception {
        Books book = new Books(1,"Les Misérables","Victor Hugo",7,96);

        BooksManager booksManager = new BooksManager(new JdbsBooksDao());
        booksManager.add(book);

    }
}